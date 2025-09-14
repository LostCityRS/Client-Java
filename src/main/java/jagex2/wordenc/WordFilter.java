package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class WordFilter {

	@ObfuscatedName("qc.m")
	public static int[] fragments;

	@ObfuscatedName("qc.n")
	public static char[][] badWords;

	@ObfuscatedName("qc.o")
	public static byte[][][] badCombinations;

	@ObfuscatedName("qc.p")
	public static char[][] domains;

	@ObfuscatedName("qc.q")
	public static char[][] tlds;

	@ObfuscatedName("qc.r")
	public static int[] tldstype;

	@ObfuscatedName("qc.s")
	public static final String[] ALLOWLIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

	@ObfuscatedName("qc.t")
	public static boolean field1189;

	@ObfuscatedName("qc.a(Lyb;)V")
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null));
		Packet var2 = new Packet(arg0.read("badenc.txt", null));
		Packet var3 = new Packet(arg0.read("domainenc.txt", null));
		Packet var4 = new Packet(arg0.read("tldlist.txt", null));
		decodeAll(var1, var2, var3, var4);
	}

	@ObfuscatedName("qc.a(Lmb;Lmb;Lmb;Lmb;)V")
	public static void decodeAll(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		decodeBadWordsTxt(arg1);
		decodeDomainsTxt(arg2);
		decodeFragmentsTxt(arg0);
		decodeTldsTxt(arg3);
	}

	@ObfuscatedName("qc.a(Lmb;B)V")
	public static void decodeTldsTxt(Packet arg0) {
		int var2 = arg0.g4();
		tlds = new char[var2][];
		tldstype = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			tldstype[var3] = arg0.g1();
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}
			tlds[var3] = var4;
		}
	}

	@ObfuscatedName("qc.a(Lmb;I)V")
	public static void decodeBadWordsTxt(Packet arg0) {
		int var2 = arg0.g4();
		badWords = new char[var2][];
		badCombinations = new byte[var2][][];
		decodeBadCombinations(arg0, badCombinations, badWords);
	}

	@ObfuscatedName("qc.b(Lmb;I)V")
	public static void decodeDomainsTxt(Packet arg0) {
		int var2 = arg0.g4();
		domains = new char[var2][];
		decodeDomains(domains, arg0);
	}

	@ObfuscatedName("qc.a(ZLmb;)V")
	public static void decodeFragmentsTxt(Packet arg1) {
		fragments = new int[arg1.g4()];
		for (int var2 = 0; var2 < fragments.length; var2++) {
			fragments[var2] = arg1.g2();
		}
	}

	@ObfuscatedName("qc.a(Lmb;[[[B[[CI)V")
	public static void decodeBadCombinations(Packet arg0, byte[][][] arg1, char[][] arg2) {
		for (int var4 = 0; var4 < arg2.length; var4++) {
			char[] var5 = new char[arg0.g1()];
			for (int var6 = 0; var6 < var5.length; var6++) {
				var5[var6] = (char) arg0.g1();
			}
			arg2[var4] = var5;
			byte[][] var7 = new byte[arg0.g1()][2];
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8][0] = (byte) arg0.g1();
				var7[var8][1] = (byte) arg0.g1();
			}
			if (var7.length > 0) {
				arg1[var4] = var7;
			}
		}
	}

	@ObfuscatedName("qc.a([[CLmb;I)V")
	public static void decodeDomains(char[][] arg0, Packet arg1) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg1.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.g1();
			}
			arg0[var3] = var4;
		}
	}

	@ObfuscatedName("qc.a(Z[C)V")
	public static void filterCharacters(char[] arg1) {
		int var2 = 0;
		for (int var4 = 0; var4 < arg1.length; var4++) {
			if (allowCharacter(arg1[var4])) {
				arg1[var2] = arg1[var4];
			} else {
				arg1[var2] = ' ';
			}
			if (var2 == 0 || arg1[var2] != ' ' || arg1[var2 - 1] != ' ') {
				var2++;
			}
		}
		for (int var5 = var2; var5 < arg1.length; var5++) {
			arg1[var5] = ' ';
		}
	}

	@ObfuscatedName("qc.a(IC)Z")
	public static boolean allowCharacter(char arg1) {
		return arg1 >= ' ' && arg1 <= 127 || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == 163 || arg1 == 8364;
	}

	@ObfuscatedName("qc.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static String filter(String arg0) {
		long var2 = System.currentTimeMillis();
		char[] var4 = arg0.toCharArray();
		filterCharacters(var4);
		String var6 = (new String(var4)).trim();
		char[] var7 = var6.toLowerCase().toCharArray();
		String var8 = var6.toLowerCase();
		filterTld(var7);
		filterBad(var7);
		filterDomains(var7);
		filterFragments(var7);
		for (int var9 = 0; var9 < ALLOWLIST.length; var9++) {
			int var10 = -1;
			while ((var10 = var8.indexOf(ALLOWLIST[var9], var10 + 1)) != -1) {
				char[] var11 = ALLOWLIST[var9].toCharArray();
				for (int var12 = 0; var12 < var11.length; var12++) {
					var7[var12 + var10] = var11[var12];
				}
			}
		}
		replaceUppercase(var6.toCharArray(), var7);
		formatUppercase(var7);
		long var13 = System.currentTimeMillis();
		return (new String(var7)).trim();
	}

	@ObfuscatedName("qc.a([C[CI)V")
	public static void replaceUppercase(char[] arg0, char[] arg1) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (arg1[var3] != '*' && isUpperCase(arg0[var3])) {
				arg1[var3] = arg0[var3];
			}
		}
	}

	@ObfuscatedName("qc.a([CZ)V")
	public static void formatUppercase(char[] arg0) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char var4 = arg0[var3];
			if (!isAlpha(var4)) {
				var2 = true;
			} else if (var2) {
				if (isLowerCase(var4)) {
					var2 = false;
				}
			} else if (isUpperCase(var4)) {
				arg0[var3] = (char) (var4 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("qc.a([CB)V")
	public static void filterBad(char[] arg0) {
		for (int var2 = 0; var2 < 2; var2++) {
			for (int var3 = badWords.length - 1; var3 >= 0; var3--) {
				filter(badWords[var3], badCombinations[var3], arg0);
			}
		}
	}

	@ObfuscatedName("qc.b([CB)V")
	public static void filterDomains(char[] arg0) {
		char[] var2 = (char[]) arg0.clone();
		char[] var3 = new char[] { '(', 'a', ')' };
		filter(var3, null, var2);
		char[] var4 = (char[]) arg0.clone();
		char[] var5 = new char[] { 'd', 'o', 't' };
		boolean var6 = false;
		filter(var5, null, var4);
		for (int var7 = domains.length - 1; var7 >= 0; var7--) {
			filterdomain(domains[var7], arg0, var4, var2);
		}
	}

	@ObfuscatedName("qc.a([C[CB[C[C)V")
	public static void filterdomain(char[] arg0, char[] arg1, char[] arg3, char[] arg4) {
		if (arg0.length > arg1.length) {
			return;
		}
		boolean var5 = true;
		int var9;
		for (int var6 = 0; var6 <= arg1.length - arg0.length; var6 += var9) {
			int var7 = var6;
			int var8 = 0;
			var9 = 1;
			label59: while (true) {
				while (true) {
					if (var7 >= arg1.length) {
						break label59;
					}
					boolean var10 = false;
					char var11 = arg1[var7];
					char var12 = 0;
					if (var7 + 1 < arg1.length) {
						var12 = arg1[var7 + 1];
					}
					int var13;
					if (var8 < arg0.length && (var13 = getEmulatedDomainCharSize(arg0[var8], var12, var11)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break label59;
						}
						int var14;
						if ((var14 = getEmulatedDomainCharSize(arg0[var8 - 1], var12, var11)) > 0) {
							var7 += var14;
							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg0.length || !isSymbol(var11)) {
								break label59;
							}
							var7++;
						}
					}
				}
			}
			if (var8 >= arg0.length) {
				boolean var15 = false;
				int var16 = getDomainAtFilterStatus(var6, arg1, arg4);
				int var17 = getDomainDotFilterStatus(arg3, var7 - 1, arg1);
				if (var16 > 2 || var17 > 2) {
					var15 = true;
				}
				if (var15) {
					for (int var18 = var6; var18 < var7; var18++) {
						arg1[var18] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a(IZ[C[C)I")
	public static int getDomainAtFilterStatus(int arg0, char[] arg2, char[] arg3) {
		if (arg0 == 0) {
			return 2;
		}
		for (int var4 = arg0 - 1; var4 >= 0 && isSymbol(arg2[var4]); var4--) {
			if (arg2[var4] == '@') {
				return 3;
			}
		}
		int var5 = 0;
		for (int var6 = arg0 - 1; var6 >= 0 && isSymbol(arg3[var6]); var6--) {
			if (arg3[var6] == '*') {
				var5++;
			}
		}
		if (var5 >= 3) {
			return 4;
		} else if (isSymbol(arg2[arg0 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a([CII[C)I")
	public static int getDomainDotFilterStatus(char[] arg0, int arg1, char[] arg3) {
		if (arg1 + 1 == arg3.length) {
			return 2;
		}
		int var5 = arg1 + 1;
		while (true) {
			if (var5 < arg3.length && isSymbol(arg3[var5])) {
				if (arg3[var5] != '.' && arg3[var5] != ',') {
					var5++;
					continue;
				}
				return 3;
			}
			int var6 = 0;
			for (int var7 = arg1 + 1; var7 < arg3.length && isSymbol(arg0[var7]); var7++) {
				if (arg0[var7] == '*') {
					var6++;
				}
			}
			if (var6 >= 3) {
				return 4;
			}
			if (isSymbol(arg3[arg1 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a([CI)V")
	public static void filterTld(char[] arg0) {
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		filter(var4, null, var3);
		char[] var5 = (char[]) arg0.clone();
		char[] var6 = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(var6, null, var5);
		for (int var7 = 0; var7 < tlds.length; var7++) {
			filterTld(arg0, var3, var5, tldstype[var7], tlds[var7]);
		}
	}

	@ObfuscatedName("qc.a([C[C[CIB[C)V")
	public static void filterTld(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg5) {
		if (arg5.length > arg0.length) {
			return;
		}
		boolean var6 = true;
		int var11;
		for (int var8 = 0; var8 <= arg0.length - arg5.length; var8 += var11) {
			int var9 = var8;
			int var10 = 0;
			var11 = 1;
			label127: while (true) {
				while (true) {
					if (var9 >= arg0.length) {
						break label127;
					}
					boolean var12 = false;
					char var13 = arg0[var9];
					char var14 = 0;
					if (var9 + 1 < arg0.length) {
						var14 = arg0[var9 + 1];
					}
					int var15;
					if (var10 < arg5.length && (var15 = getEmulatedDomainCharSize(arg5[var10], var14, var13)) > 0) {
						var9 += var15;
						var10++;
					} else {
						if (var10 == 0) {
							break label127;
						}
						int var16;
						if ((var16 = getEmulatedDomainCharSize(arg5[var10 - 1], var14, var13)) > 0) {
							var9 += var16;
							if (var10 == 1) {
								var11++;
							}
						} else {
							if (var10 >= arg5.length || !isSymbol(var13)) {
								break label127;
							}
							var9++;
						}
					}
				}
			}
			if (var10 >= arg5.length) {
				boolean var17 = false;
				int var18 = getTldDotFilterStatus(arg1, arg0, var8);
				int var19 = getTldSlashFilterStatus(arg0, arg2, var9 - 1);
				if (arg3 == 1 && var18 > 0 && var19 > 0) {
					var17 = true;
				}
				if (arg3 == 2 && (var18 > 2 && var19 > 0 || var18 > 0 && var19 > 2)) {
					var17 = true;
				}
				if (arg3 == 3 && var18 > 0 && var19 > 2) {
					var17 = true;
				}
				boolean var10000;
				if (arg3 == 3 && var18 > 2 && var19 > 0) {
					var10000 = true;
				} else {
					var10000 = false;
				}
				if (var17) {
					int var20 = var8;
					int var21 = var9 - 1;
					if (var18 > 2) {
						if (var18 == 4) {
							boolean var22 = false;
							for (int var23 = var8 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (arg1[var23] != '*') {
										break;
									}
									var20 = var23;
								} else if (arg1[var23] == '*') {
									var20 = var23;
									var22 = true;
								}
							}
						}
						boolean var24 = false;
						for (int var25 = var20 - 1; var25 >= 0; var25--) {
							if (var24) {
								if (isSymbol(arg0[var25])) {
									break;
								}
								var20 = var25;
							} else if (!isSymbol(arg0[var25])) {
								var24 = true;
								var20 = var25;
							}
						}
					}
					if (var19 > 2) {
						if (var19 == 4) {
							boolean var26 = false;
							for (int var27 = var21 + 1; var27 < arg0.length; var27++) {
								if (var26) {
									if (arg2[var27] != '*') {
										break;
									}
									var21 = var27;
								} else if (arg2[var27] == '*') {
									var21 = var27;
									var26 = true;
								}
							}
						}
						boolean var28 = false;
						for (int var29 = var21 + 1; var29 < arg0.length; var29++) {
							if (var28) {
								if (isSymbol(arg0[var29])) {
									break;
								}
								var21 = var29;
							} else if (!isSymbol(arg0[var29])) {
								var28 = true;
								var21 = var29;
							}
						}
					}
					for (int var30 = var20; var30 <= var21; var30++) {
						arg0[var30] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a(Z[C[CI)I")
	public static int getTldDotFilterStatus(char[] arg1, char[] arg2, int arg3) {
		if (arg3 == 0) {
			return 2;
		}
		int var4 = arg3 - 1;
		while (true) {
			if (var4 >= 0 && isSymbol(arg2[var4])) {
				if (arg2[var4] != ',' && arg2[var4] != '.') {
					var4--;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg3 - 1; var6 >= 0 && isSymbol(arg1[var6]); var6--) {
				if (arg1[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (isSymbol(arg2[arg3 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a([CB[CI)I")
	public static int getTldSlashFilterStatus(char[] arg0, char[] arg2, int arg3) {
		if (arg3 + 1 == arg0.length) {
			return 2;
		}
		int var4 = arg3 + 1;
		while (true) {
			if (var4 < arg0.length && isSymbol(arg0[var4])) {
				if (arg0[var4] != '\\' && arg0[var4] != '/') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg3 + 1; var6 < arg0.length && isSymbol(arg2[var6]); var6++) {
				if (arg2[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 5) {
				return 4;
			}
			if (isSymbol(arg0[arg3 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a([CI[[B[C)V")
	public static void filter(char[] arg0, byte[][] arg2, char[] arg3) {
		if (arg0.length > arg3.length) {
			return;
		}
		boolean var4 = true;
		int var9;
		for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var9) {
			int var6 = var5;
			int var7 = 0;
			int var8 = 0;
			var9 = 1;
			boolean var10 = false;
			boolean var11 = false;
			boolean var12 = false;
			label159: while (true) {
				while (true) {
					if (var6 >= arg3.length || var11 && var12) {
						break label159;
					}
					boolean var13 = false;
					char var14 = arg3[var6];
					char var15 = 0;
					if (var6 + 1 < arg3.length) {
						var15 = arg3[var6 + 1];
					}
					int var16;
					if (var7 < arg0.length && (var16 = getEmulatedSize(arg0[var7], var15, var14)) > 0) {
						if (var16 == 1 && isNumber(var14)) {
							var11 = true;
						}
						if (var16 == 2 && (isNumber(var14) || isNumber(var15))) {
							var11 = true;
						}
						var6 += var16;
						var7++;
					} else {
						if (var7 == 0) {
							break label159;
						}
						int var17;
						if ((var17 = getEmulatedSize(arg0[var7 - 1], var15, var14)) > 0) {
							var6 += var17;
							if (var7 == 1) {
								var9++;
							}
						} else {
							if (var7 >= arg0.length || !isLowerCaseAlpha(var14)) {
								break label159;
							}
							if (isSymbol(var14) && var14 != '\'') {
								var10 = true;
							}
							if (isNumber(var14)) {
								var12 = true;
							}
							var6++;
							var8++;
							if (var8 * 100 / (var6 - var5) > 90) {
								break label159;
							}
						}
					}
				}
			}
			if (var7 >= arg0.length && (!var11 || !var12)) {
				boolean var18 = true;
				if (var10) {
					boolean var23 = false;
					boolean var24 = false;
					if (var5 - 1 < 0 || isSymbol(arg3[var5 - 1]) && arg3[var5 - 1] != '\'') {
						var23 = true;
					}
					if (var6 >= arg3.length || isSymbol(arg3[var6]) && arg3[var6] != '\'') {
						var24 = true;
					}
					if (!var23 || !var24) {
						boolean var25 = false;
						int var26 = var5 - 2;
						if (var23) {
							var26 = var5;
						}
						while (!var25 && var26 < var6) {
							if (var26 >= 0 && (!isSymbol(arg3[var26]) || arg3[var26] == '\'')) {
								char[] var27 = new char[3];
								int var28;
								for (var28 = 0; var28 < 3 && var26 + var28 < arg3.length && (!isSymbol(arg3[var26 + var28]) || arg3[var26 + var28] == '\''); var28++) {
									var27[var28] = arg3[var26 + var28];
								}
								boolean var29 = true;
								if (var28 == 0) {
									var29 = false;
								}
								if (var28 < 3 && var26 - 1 >= 0 && (!isSymbol(arg3[var26 - 1]) || arg3[var26 - 1] == '\'')) {
									var29 = false;
								}
								if (var29 && !isBadFragment(var27)) {
									var25 = true;
								}
							}
							var26++;
						}
						if (!var25) {
							var18 = false;
						}
					}
				} else {
					char var19 = ' ';
					if (var5 - 1 >= 0) {
						var19 = arg3[var5 - 1];
					}
					char var20 = ' ';
					if (var6 < arg3.length) {
						var20 = arg3[var6];
					}
					byte var21 = getIndex(var19);
					byte var22 = getIndex(var20);
					if (arg2 != null && comboMatches(var21, arg2, var22)) {
						var18 = false;
					}
				}
				if (var18) {
					int var30 = 0;
					int var31 = 0;
					int var32 = -1;
					for (int var33 = var5; var33 < var6; var33++) {
						if (isNumber(arg3[var33])) {
							var30++;
						} else if (isAlpha(arg3[var33])) {
							var31++;
							var32 = var33;
						}
					}
					if (var32 > -1) {
						var30 -= var6 - var32 + 1;
					}
					if (var30 <= var31) {
						for (int var34 = var5; var34 < var6; var34++) {
							arg3[var34] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a(BZ[[BB)Z")
	public static boolean comboMatches(byte arg0, byte[][] arg2, byte arg3) {
		int var4 = 0;
		if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
			return true;
		}
		int var5 = arg2.length - 1;
		if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
			return true;
		} else {
			do {
				int var6 = (var4 + var5) / 2;
				if (arg2[var6][0] == arg0 && arg2[var6][1] == arg3) {
					return true;
				}
				if (arg0 < arg2[var6][0] || arg0 == arg2[var6][0] && arg3 < arg2[var6][1]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);
			return false;
		}
	}

	@ObfuscatedName("qc.a(CCCZ)I")
	public static int getEmulatedDomainCharSize(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		} else if (arg0 == 'o' && arg2 == '0') {
			return 1;
		} else if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
			return 2;
		} else if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
			return 1;
		} else if (arg0 == 'e' && arg2 == 8364) {
			return 1;
		} else if (arg0 == 's' && arg2 == '$') {
			return 1;
		} else if (arg0 == 'l' && arg2 == 'i') {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(CCCI)I")
	public static int getEmulatedSize(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}
		if (arg0 >= 'a' && arg0 <= 'm') {
			if (arg0 == 'a') {
				if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
					if (arg2 == '/' && arg1 == '\\') {
						return 2;
					}
					return 0;
				}
				return 1;
			}
			if (arg0 == 'b') {
				if (arg2 != '6' && arg2 != '8') {
					if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
						return 0;
					}
					return 2;
				}
				return 1;
			}
			if (arg0 == 'c') {
				if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'd') {
				if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'e') {
				if (arg2 != '3' && arg2 != 8364) {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'f') {
				if (arg2 == 'p' && arg1 == 'h') {
					return 2;
				}
				if (arg2 == 163) {
					return 1;
				}
				return 0;
			}
			if (arg0 == 'g') {
				if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'h') {
				if (arg2 == '#') {
					return 1;
				}
				return 0;
			}
			if (arg0 == 'i') {
				if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'j') {
				return 0;
			}
			if (arg0 == 'k') {
				return 0;
			}
			if (arg0 == 'l') {
				if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'm') {
				return 0;
			}
		}
		if (arg0 >= 'n' && arg0 <= 'z') {
			if (arg0 == 'n') {
				return 0;
			}
			if (arg0 == 'o') {
				if (arg2 != '0' && arg2 != '*') {
					if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
						return 0;
					}
					return 2;
				}
				return 1;
			}
			if (arg0 == 'p') {
				return 0;
			}
			if (arg0 == 'q') {
				return 0;
			}
			if (arg0 == 'r') {
				return 0;
			}
			if (arg0 == 's') {
				if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 't') {
				if (arg2 != '7' && arg2 != '+') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'u') {
				if (arg2 == 'v') {
					return 1;
				}
				if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'v') {
				if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'w') {
				if (arg2 == 'v' && arg1 == 'v') {
					return 2;
				}
				return 0;
			}
			if (arg0 == 'x') {
				if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'y') {
				return 0;
			}
			if (arg0 == 'z') {
				return 0;
			}
		}
		if (arg0 >= '0' && arg0 <= '9') {
			if (arg0 == '0') {
				if (arg2 == 'o' || arg2 == 'O') {
					return 1;
				} else if (arg2 == '(' && arg1 == ')' || arg2 == '{' && arg1 == '}' || arg2 == '[' && arg1 == ']') {
					return 2;
				} else {
					return 0;
				}
			} else if (arg0 == '1') {
				return arg2 == 'l' ? 1 : 0;
			} else {
				return 0;
			}
		} else if (arg0 == ',') {
			return arg2 == '.' ? 1 : 0;
		} else if (arg0 == '.') {
			return arg2 == ',' ? 1 : 0;
		} else if (arg0 == '!') {
			return arg2 == 'i' ? 1 : 0;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(CI)B")
	public static byte getIndex(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 - 'a' + 1);
		} else if (arg0 == '\'') {
			return 28;
		} else if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 - '0' + 29);
		} else {
			return 27;
		}
	}

	@ObfuscatedName("qc.b([CI)V")
	public static void filterFragments(char[] arg0) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		while (true) {
			do {
				int var8;
				if ((var8 = indexOfNumber(arg0, var3)) == -1) {
					return;
				}
				boolean var6 = false;
				for (int var7 = var3; var7 >= 0 && var7 < var8 && !var6; var7++) {
					if (!isSymbol(arg0[var7]) && !isLowerCaseAlpha(arg0[var7])) {
						var6 = true;
					}
				}
				if (var6) {
					var4 = 0;
				}
				if (var4 == 0) {
					var5 = var8;
				}
				var3 = indexOfNonNumber(var8, arg0);
				int var9 = 0;
				for (int var10 = var8; var10 < var3; var10++) {
					var9 = var9 * 10 + arg0[var10] - 48;
				}
				if (var9 <= 255 && var3 - var8 <= 8) {
					var4++;
				} else {
					var4 = 0;
				}
			} while (var4 != 4);
			for (int var11 = var5; var11 < var3; var11++) {
				arg0[var11] = '*';
			}
			var4 = 0;
		}
	}

	@ObfuscatedName("qc.a(I[CI)I")
	public static int indexOfNumber(char[] arg1, int arg2) {
		for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
			if (arg1[var3] >= '0' && arg1[var3] <= '9') {
				return var3;
			}
		}
		return -1;
	}

	@ObfuscatedName("qc.b(I[CI)I")
	public static int indexOfNonNumber(int arg0, char[] arg1) {
		int var3 = arg0;
		while (true) {
			if (var3 < arg1.length && var3 >= 0) {
				if (arg1[var3] >= '0' && arg1[var3] <= '9') {
					var3++;
					continue;
				}
				return var3;
			}
			return arg1.length;
		}
	}

	@ObfuscatedName("qc.b(IC)Z")
	public static boolean isSymbol(char arg1) {
		return !isAlpha(arg1) && !isNumber(arg1);
	}

	@ObfuscatedName("qc.c(IC)Z")
	public static boolean isLowerCaseAlpha(char arg1) {
		if (arg1 >= 'a' && arg1 <= 'z') {
			return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("qc.d(IC)Z")
	public static boolean isAlpha(char arg1) {
		if (arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("qc.b(CI)Z")
	public static boolean isNumber(char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@ObfuscatedName("qc.c(CI)Z")
	public static boolean isLowerCase(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("qc.e(IC)Z")
	public static boolean isUpperCase(char arg1) {
		if (arg1 >= 'A' && arg1 <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("qc.b(Z[C)Z")
	public static boolean isBadFragment(char[] arg1) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg1.length; var3++) {
			if (!isNumber(arg1[var3]) && arg1[var3] != 0) {
				var2 = false;
			}
		}
		if (var2) {
			return true;
		}
		int var4 = firstFragmentId(arg1);
		int var5 = 0;
		int var6 = fragments.length - 1;
		if (var4 == fragments[var5] || var4 == fragments[var6]) {
			return true;
		}
		do {
			int var7 = (var5 + var6) / 2;
			if (var4 == fragments[var7]) {
				return true;
			}
			if (var4 < fragments[var7]) {
				var6 = var7;
			} else {
				var5 = var7;
			}
		} while (var5 != var6 && var5 + 1 != var6);
		return false;
	}

	@ObfuscatedName("qc.b([CZ)I")
	public static int firstFragmentId(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char var4 = arg0[arg0.length - var3 - 1];
			if (var4 >= 'a' && var4 <= 'z') {
				var2 = var2 * 38 + var4 - 'a' + 1;
			} else if (var4 == '\'') {
				var2 = var2 * 38 + 27;
			} else if (var4 >= '0' && var4 <= '9') {
				var2 = var2 * 38 + var4 - '0' + 28;
			} else if (var4 != 0) {
				return 0;
			}
		}
		return var2;
	}
}
