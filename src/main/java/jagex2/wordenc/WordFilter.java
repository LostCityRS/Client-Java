package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class WordFilter {

	@ObfuscatedName("qc.l")
	public static int[] fragments;

	@ObfuscatedName("qc.m")
	public static char[][] badWords;

	@ObfuscatedName("qc.n")
	public static byte[][][] badCombinations;

	@ObfuscatedName("qc.o")
	public static char[][] domains;

	@ObfuscatedName("qc.p")
	public static char[][] tlds;

	@ObfuscatedName("qc.q")
	public static int[] tldstype;

	@ObfuscatedName("qc.r")
	public static final String[] ALLOWLIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

	@ObfuscatedName("qc.a(Lyb;)V")
	public static final void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null));
		Packet var2 = new Packet(arg0.read("badenc.txt", null));
		Packet var3 = new Packet(arg0.read("domainenc.txt", null));
		Packet var4 = new Packet(arg0.read("tldlist.txt", null));
		decodeAll(var1, var2, var3, var4);
	}

	@ObfuscatedName("qc.a(Lmb;Lmb;Lmb;Lmb;)V")
	public static final void decodeAll(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		decodeBadWordsTxt(arg1);
		decodeDomainsTxt(arg2);
		decodeFragmentsTxt(arg0);
		decodeTldsTxt(arg3);
	}

	@ObfuscatedName("qc.a(Lmb;I)V")
	public static final void decodeTldsTxt(Packet arg0) {
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

	@ObfuscatedName("qc.b(Lmb;I)V")
	public static final void decodeBadWordsTxt(Packet arg0) {
		int var2 = arg0.g4();
		badWords = new char[var2][];
		badCombinations = new byte[var2][][];
		decodeBadCombinations(badWords, badCombinations, arg0);
	}

	@ObfuscatedName("qc.a(ILmb;)V")
	public static final void decodeDomainsTxt(Packet arg1) {
		int var2 = arg1.g4();
		domains = new char[var2][];
		decodeDomains(arg1, domains);
	}

	@ObfuscatedName("qc.a(Lmb;Z)V")
	public static final void decodeFragmentsTxt(Packet arg0) {
		fragments = new int[arg0.g4()];
		for (int var2 = 0; var2 < fragments.length; var2++) {
			fragments[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("qc.a([[CI[[[BLmb;)V")
	public static final void decodeBadCombinations(char[][] arg0, byte[][][] arg2, Packet arg3) {
		for (int var5 = 0; var5 < arg0.length; var5++) {
			char[] var6 = new char[arg3.g1()];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7] = (char) arg3.g1();
			}
			arg0[var5] = var6;
			byte[][] var8 = new byte[arg3.g1()][2];
			for (int var9 = 0; var9 < var8.length; var9++) {
				var8[var9][0] = (byte) arg3.g1();
				var8[var9][1] = (byte) arg3.g1();
			}
			if (var8.length > 0) {
				arg2[var5] = var8;
			}
		}
	}

	@ObfuscatedName("qc.a(ILmb;[[C)V")
	public static final void decodeDomains(Packet arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var5 = new char[arg1.g1()];
			for (int var6 = 0; var6 < var5.length; var6++) {
				var5[var6] = (char) arg1.g1();
			}
			arg2[var3] = var5;
		}
	}

	@ObfuscatedName("qc.a([CI)V")
	public static final void filterCharacters(char[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (allowCharacter(arg0[var3])) {
				arg0[var2] = arg0[var3];
			} else {
				arg0[var2] = ' ';
			}
			if (var2 == 0 || arg0[var2] != ' ' || arg0[var2 - 1] != ' ') {
				var2++;
			}
		}
		for (int var4 = var2; var4 < arg0.length; var4++) {
			arg0[var4] = ' ';
		}
	}

	@ObfuscatedName("qc.a(IC)Z")
	public static final boolean allowCharacter(char arg1) {
		return arg1 >= ' ' && arg1 <= 127 || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == 163 || arg1 == 8364;
	}

	@ObfuscatedName("qc.a(Ljava/lang/String;B)Ljava/lang/String;")
	public static final String filter(String arg0) {
		long var2 = System.currentTimeMillis();
		char[] var4 = arg0.toCharArray();
		filterCharacters(var4);
		String var5 = (new String(var4)).trim();
		char[] var6 = var5.toLowerCase().toCharArray();
		String var7 = var5.toLowerCase();
		filterTld(var6);
		filterBad(var6);
		filterDomains(var6);
		filterFragments(var6);
		for (int var8 = 0; var8 < ALLOWLIST.length; var8++) {
			int var11 = -1;
			while ((var11 = var7.indexOf(ALLOWLIST[var8], var11 + 1)) != -1) {
				char[] var12 = ALLOWLIST[var8].toCharArray();
				for (int var13 = 0; var13 < var12.length; var13++) {
					var6[var11 + var13] = var12[var13];
				}
			}
		}
		replaceUppercase(var5.toCharArray(), var6);
		formatUppercase(var6);
		long var9 = System.currentTimeMillis();
		return (new String(var6)).trim();
	}

	@ObfuscatedName("qc.a([C[CI)V")
	public static final void replaceUppercase(char[] arg0, char[] arg1) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (arg1[var3] != '*' && isUpperCase(arg0[var3])) {
				arg1[var3] = arg0[var3];
			}
		}
	}

	@ObfuscatedName("qc.a([CZ)V")
	public static final void formatUppercase(char[] arg0) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char var4 = arg0[var3];
			if (!isAlpha(var4)) {
				var2 = true;
			} else if (var2) {
				if (isLowercase(var4)) {
					var2 = false;
				}
			} else if (isUpperCase(var4)) {
				arg0[var3] = (char) (var4 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("qc.a(Z[C)V")
	public static final void filterBad(char[] arg1) {
		for (int var3 = 0; var3 < 2; var3++) {
			for (int var4 = badWords.length - 1; var4 >= 0; var4--) {
				filter(arg1, badWords[var4], badCombinations[var4]);
			}
		}
	}

	@ObfuscatedName("qc.a(I[C)V")
	public static final void filterDomains(char[] arg1) {
		char[] var2 = (char[]) arg1.clone();
		char[] var3 = new char[] { '(', 'a', ')' };
		filter(var2, var3, null);
		char[] var4 = (char[]) arg1.clone();
		char[] var5 = new char[] { 'd', 'o', 't' };
		filter(var4, var5, null);
		for (int var6 = domains.length - 1; var6 >= 0; var6--) {
			filterDomain(var4, arg1, domains[var6], var2);
		}
	}

	@ObfuscatedName("qc.a([CI[C[C[C)V")
	public static final void filterDomain(char[] arg0, char[] arg2, char[] arg3, char[] arg4) {
		if (arg3.length > arg2.length) {
			return;
		}
		boolean var5 = true;
		int var9;
		for (int var6 = 0; var6 <= arg2.length - arg3.length; var6 += var9) {
			int var7 = var6;
			int var8 = 0;
			var9 = 1;
			label61: while (true) {
				while (true) {
					if (var7 >= arg2.length) {
						break label61;
					}
					boolean var10 = false;
					char var11 = arg2[var7];
					char var12 = 0;
					if (var7 + 1 < arg2.length) {
						var12 = arg2[var7 + 1];
					}
					int var13;
					if (var8 < arg3.length && (var13 = getEmulatedDomainCharSize(var12, var11, arg3[var8])) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break label61;
						}
						int var14;
						if ((var14 = getEmulatedDomainCharSize(var12, var11, arg3[var8 - 1])) > 0) {
							var7 += var14;
							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !isSymbol(var11)) {
								break label61;
							}
							var7++;
						}
					}
				}
			}
			if (var8 >= arg3.length) {
				boolean var15 = false;
				int var16 = getDomainAtFilterStatus(arg4, var6, arg2);
				int var17 = getDomainDotFilterStatus(arg0, arg2, false, var7 - 1);
				if (var16 > 2 || var17 > 2) {
					var15 = true;
				}
				if (var15) {
					for (int var18 = var6; var18 < var7; var18++) {
						arg2[var18] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a(B[CI[C)I")
	public static final int getDomainAtFilterStatus(char[] arg1, int arg2, char[] arg3) {
		if (arg2 == 0) {
			return 2;
		}
		for (int var4 = arg2 - 1; var4 >= 0 && isSymbol(arg3[var4]); var4--) {
			if (arg3[var4] == '@') {
				return 3;
			}
		}
		int var5 = 0;
		for (int var6 = arg2 - 1; var6 >= 0 && isSymbol(arg1[var6]); var6--) {
			if (arg1[var6] == '*') {
				var5++;
			}
		}
		if (var5 >= 3) {
			return 4;
		} else if (isSymbol(arg3[arg2 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a([C[CZI)I")
	public static final int getDomainDotFilterStatus(char[] arg0, char[] arg1, boolean arg2, int arg3) {
		if (arg3 + 1 == arg1.length) {
			return 2;
		}
		int var4 = arg3 + 1;
		while (true) {
			if (var4 < arg1.length && isSymbol(arg1[var4])) {
				if (arg1[var4] != '.' && arg1[var4] != ',') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg3 + 1; var6 < arg1.length && isSymbol(arg0[var6]); var6++) {
				if (arg0[var6] == '*') {
					var5++;
				}
			}
			if (arg2) {
				return 1;
			}
			if (var5 >= 3) {
				return 4;
			}
			if (isSymbol(arg1[arg3 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.b(I[C)V")
	public static final void filterTld(char[] arg1) {
		char[] var2 = (char[]) arg1.clone();
		char[] var3 = new char[] { 'd', 'o', 't' };
		filter(var2, var3, null);
		char[] var4 = (char[]) arg1.clone();
		char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(var4, var5, null);
		for (int var6 = 0; var6 < tlds.length; var6++) {
			filterTld(tlds[var6], var4, var2, tldstype[var6], arg1);
		}
	}

	@ObfuscatedName("qc.a([C[C[CII[C)V")
	public static final void filterTld(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg5) {
		if (arg0.length > arg5.length) {
			return;
		}
		boolean var6 = true;
		int var10;
		for (int var7 = 0; var7 <= arg5.length - arg0.length; var7 += var10) {
			int var8 = var7;
			int var9 = 0;
			var10 = 1;
			label128: while (true) {
				while (true) {
					if (var8 >= arg5.length) {
						break label128;
					}
					boolean var11 = false;
					char var12 = arg5[var8];
					char var13 = 0;
					if (var8 + 1 < arg5.length) {
						var13 = arg5[var8 + 1];
					}
					int var14;
					if (var9 < arg0.length && (var14 = getEmulatedDomainCharSize(var13, var12, arg0[var9])) > 0) {
						var8 += var14;
						var9++;
					} else {
						if (var9 == 0) {
							break label128;
						}
						int var15;
						if ((var15 = getEmulatedDomainCharSize(var13, var12, arg0[var9 - 1])) > 0) {
							var8 += var15;
							if (var9 == 1) {
								var10++;
							}
						} else {
							if (var9 >= arg0.length || !isSymbol(var12)) {
								break label128;
							}
							var8++;
						}
					}
				}
			}
			if (var9 >= arg0.length) {
				boolean var16 = false;
				int var17 = getTldDotFilterStatus(arg5, var7, arg2);
				int var18 = getTldSlashFilterStatus(arg1, var8 - 1, arg5);
				if (arg3 == 1 && var17 > 0 && var18 > 0) {
					var16 = true;
				}
				if (arg3 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
					var16 = true;
				}
				if (arg3 == 3 && var17 > 0 && var18 > 2) {
					var16 = true;
				}
				boolean var10000;
				if (arg3 == 3 && var17 > 2 && var18 > 0) {
					var10000 = true;
				} else {
					var10000 = false;
				}
				if (var16) {
					int var19 = var7;
					int var20 = var8 - 1;
					if (var17 > 2) {
						if (var17 == 4) {
							boolean var21 = false;
							for (int var22 = var7 - 1; var22 >= 0; var22--) {
								if (var21) {
									if (arg2[var22] != '*') {
										break;
									}
									var19 = var22;
								} else if (arg2[var22] == '*') {
									var19 = var22;
									var21 = true;
								}
							}
						}
						boolean var23 = false;
						for (int var24 = var19 - 1; var24 >= 0; var24--) {
							if (var23) {
								if (isSymbol(arg5[var24])) {
									break;
								}
								var19 = var24;
							} else if (!isSymbol(arg5[var24])) {
								var23 = true;
								var19 = var24;
							}
						}
					}
					if (var18 > 2) {
						if (var18 == 4) {
							boolean var25 = false;
							for (int var26 = var20 + 1; var26 < arg5.length; var26++) {
								if (var25) {
									if (arg1[var26] != '*') {
										break;
									}
									var20 = var26;
								} else if (arg1[var26] == '*') {
									var20 = var26;
									var25 = true;
								}
							}
						}
						boolean var27 = false;
						for (int var28 = var20 + 1; var28 < arg5.length; var28++) {
							if (var27) {
								if (isSymbol(arg5[var28])) {
									break;
								}
								var20 = var28;
							} else if (!isSymbol(arg5[var28])) {
								var27 = true;
								var20 = var28;
							}
						}
					}
					for (int var29 = var19; var29 <= var20; var29++) {
						arg5[var29] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a([CII[C)I")
	public static final int getTldDotFilterStatus(char[] arg0, int arg2, char[] arg3) {
		if (arg2 == 0) {
			return 2;
		}
		int var4 = arg2 - 1;
		while (true) {
			if (var4 >= 0 && isSymbol(arg0[var4])) {
				if (arg0[var4] != ',' && arg0[var4] != '.') {
					var4--;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg2 - 1; var6 >= 0 && isSymbol(arg3[var6]); var6--) {
				if (arg3[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (isSymbol(arg0[arg2 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a(I[CI[C)I")
	public static final int getTldSlashFilterStatus(char[] arg1, int arg2, char[] arg3) {
		if (arg2 + 1 == arg3.length) {
			return 2;
		}
		int var4 = arg2 + 1;
		while (true) {
			if (var4 < arg3.length && isSymbol(arg3[var4])) {
				if (arg3[var4] != '\\' && arg3[var4] != '/') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg2 + 1; var6 < arg3.length && isSymbol(arg1[var6]); var6++) {
				if (arg1[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 5) {
				return 4;
			}
			if (isSymbol(arg3[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a(I[C[C[[B)V")
	public static final void filter(char[] arg1, char[] arg2, byte[][] arg3) {
		if (arg2.length > arg1.length) {
			return;
		}
		boolean var4 = true;
		int var9;
		for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var9) {
			int var6 = var5;
			int var7 = 0;
			int var8 = 0;
			var9 = 1;
			boolean var10 = false;
			boolean var11 = false;
			boolean var12 = false;
			label166: while (true) {
				while (true) {
					if (var6 >= arg1.length || var11 && var12) {
						break label166;
					}
					boolean var13 = false;
					char var14 = arg1[var6];
					char var15 = 0;
					if (var6 + 1 < arg1.length) {
						var15 = arg1[var6 + 1];
					}
					int var16;
					if (var7 < arg2.length && (var16 = getEmulatedSize(arg2[var7], var15, var14)) > 0) {
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
							break label166;
						}
						int var17;
						if ((var17 = getEmulatedSize(arg2[var7 - 1], var15, var14)) > 0) {
							var6 += var17;
							if (var7 == 1) {
								var9++;
							}
						} else {
							if (var7 >= arg2.length || !isLowercaseAlpha(var14)) {
								break label166;
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
								break label166;
							}
						}
					}
				}
			}
			if (var7 >= arg2.length && (!var11 || !var12)) {
				boolean var18 = true;
				if (var10) {
					boolean var23 = false;
					boolean var24 = false;
					if (var5 - 1 < 0 || isSymbol(arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
						var23 = true;
					}
					if (var6 >= arg1.length || isSymbol(arg1[var6]) && arg1[var6] != '\'') {
						var24 = true;
					}
					if (!var23 || !var24) {
						boolean var25 = false;
						int var26 = var5 - 2;
						if (var23) {
							var26 = var5;
						}
						while (!var25 && var26 < var6) {
							if (var26 >= 0 && (!isSymbol(arg1[var26]) || arg1[var26] == '\'')) {
								char[] var27 = new char[3];
								int var28;
								for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!isSymbol(arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
									var27[var28] = arg1[var26 + var28];
								}
								boolean var29 = true;
								if (var28 == 0) {
									var29 = false;
								}
								if (var28 < 3 && var26 - 1 >= 0 && (!isSymbol(arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
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
						var19 = arg1[var5 - 1];
					}
					char var20 = ' ';
					if (var6 < arg1.length) {
						var20 = arg1[var6];
					}
					byte var21 = getIndex(var19);
					byte var22 = getIndex(var20);
					if (arg3 != null && comboMatches(arg3, var21, var22)) {
						var18 = false;
					}
				}
				if (var18) {
					int var30 = 0;
					int var31 = 0;
					int var32 = -1;
					for (int var33 = var5; var33 < var6; var33++) {
						if (isNumber(arg1[var33])) {
							var30++;
						} else if (isAlpha(arg1[var33])) {
							var31++;
							var32 = var33;
						}
					}
					if (var32 > -1) {
						var30 -= var6 - var32 + 1;
					}
					if (var30 <= var31) {
						for (int var34 = var5; var34 < var6; var34++) {
							arg1[var34] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a([[BIBB)Z")
	public static final boolean comboMatches(byte[][] arg0, byte arg2, byte arg3) {
		int var4 = 0;
		if (arg0[var4][0] == arg2 && arg0[var4][1] == arg3) {
			return true;
		}
		int var5 = arg0.length - 1;
		if (arg0[var5][0] == arg2 && arg0[var5][1] == arg3) {
			return true;
		} else {
			do {
				int var6 = (var4 + var5) / 2;
				if (arg0[var6][0] == arg2 && arg0[var6][1] == arg3) {
					return true;
				}
				if (arg2 < arg0[var6][0] || arg0[var6][0] == arg2 && arg3 < arg0[var6][1]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);
			return false;
		}
	}

	@ObfuscatedName("qc.a(CCCB)I")
	public static final int getEmulatedDomainCharSize(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		} else if (arg2 == 'o' && arg1 == '0') {
			return 1;
		} else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
			return 2;
		} else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		} else if (arg2 == 'e' && arg1 == 8364) {
			return 1;
		} else if (arg2 == 's' && arg1 == '$') {
			return 1;
		} else if (arg2 == 'l' && arg1 == 'i') {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(CBCC)I")
	public static final int getEmulatedSize(char arg0, char arg2, char arg3) {
		if (arg0 == arg3) {
			return 1;
		}
		if (arg0 >= 'a' && arg0 <= 'm') {
			if (arg0 == 'a') {
				if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
					if (arg3 == '/' && arg2 == '\\') {
						return 2;
					}
					return 0;
				}
				return 1;
			}
			if (arg0 == 'b') {
				if (arg3 != '6' && arg3 != '8') {
					if ((arg3 != '1' || arg2 != '3') && (arg3 != 'i' || arg2 != '3')) {
						return 0;
					}
					return 2;
				}
				return 1;
			}
			if (arg0 == 'c') {
				if (arg3 != '(' && arg3 != '<' && arg3 != '{' && arg3 != '[') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'd') {
				if ((arg3 != '[' || arg2 != ')') && (arg3 != 'i' || arg2 != ')')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'e') {
				if (arg3 != '3' && arg3 != 8364) {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'f') {
				if (arg3 == 'p' && arg2 == 'h') {
					return 2;
				}
				if (arg3 == 163) {
					return 1;
				}
				return 0;
			}
			if (arg0 == 'g') {
				if (arg3 != '9' && arg3 != '6' && arg3 != 'q') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'h') {
				if (arg3 == '#') {
					return 1;
				}
				return 0;
			}
			if (arg0 == 'i') {
				if (arg3 != 'y' && arg3 != 'l' && arg3 != 'j' && arg3 != '1' && arg3 != '!' && arg3 != ':' && arg3 != ';' && arg3 != '|') {
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
				if (arg3 != '1' && arg3 != '|' && arg3 != 'i') {
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
				if (arg3 != '0' && arg3 != '*') {
					if ((arg3 != '(' || arg2 != ')') && (arg3 != '[' || arg2 != ']') && (arg3 != '{' || arg2 != '}') && (arg3 != '<' || arg2 != '>')) {
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
				if (arg3 != '5' && arg3 != 'z' && arg3 != '$' && arg3 != '2') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 't') {
				if (arg3 != '7' && arg3 != '+') {
					return 0;
				}
				return 1;
			}
			if (arg0 == 'u') {
				if (arg3 == 'v') {
					return 1;
				}
				if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'v') {
				if ((arg3 != '\\' || arg2 != '/') && (arg3 != '\\' || arg2 != '|') && (arg3 != '|' || arg2 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'w') {
				if (arg3 == 'v' && arg2 == 'v') {
					return 2;
				}
				return 0;
			}
			if (arg0 == 'x') {
				if ((arg3 != ')' || arg2 != '(') && (arg3 != '}' || arg2 != '{') && (arg3 != ']' || arg2 != '[') && (arg3 != '>' || arg2 != '<')) {
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
				if (arg3 == 'o' || arg3 == 'O') {
					return 1;
				} else if ((arg3 != '(' || arg2 != ')') && (arg3 != '{' || arg2 != '}') && (arg3 != '[' || arg2 != ']')) {
					return 0;
				} else {
					return 2;
				}
			} else if (arg0 == '1') {
				return arg3 == 'l' ? 1 : 0;
			} else {
				return 0;
			}
		} else if (arg0 == ',') {
			return arg3 == '.' ? 1 : 0;
		} else if (arg0 == '.') {
			return arg3 == ',' ? 1 : 0;
		} else if (arg0 == '!') {
			return arg3 == 'i' ? 1 : 0;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(CI)B")
	public static final byte getIndex(char arg0) {
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

	@ObfuscatedName("qc.c(I[C)V")
	public static final void filterFragments(char[] arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		while (true) {
			do {
				int var6;
				if ((var6 = indexOfNumber(arg1, var3)) == -1) {
					return;
				}
				boolean var7 = false;
				for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
					if (!isSymbol(arg1[var8]) && !isLowercaseAlpha(arg1[var8])) {
						var7 = true;
					}
				}
				if (var7) {
					var4 = 0;
				}
				if (var4 == 0) {
					var5 = var6;
				}
				var3 = indexOfNonNumber(var6, arg1);
				int var9 = 0;
				for (int var10 = var6; var10 < var3; var10++) {
					var9 = var9 * 10 + arg1[var10] - 48;
				}
				if (var9 <= 255 && var3 - var6 <= 8) {
					var4++;
				} else {
					var4 = 0;
				}
			} while (var4 != 4);
			for (int var11 = var5; var11 < var3; var11++) {
				arg1[var11] = '*';
			}
			var4 = 0;
		}
	}

	@ObfuscatedName("qc.a(I[CI)I")
	public static final int indexOfNumber(char[] arg1, int arg2) {
		for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
			if (arg1[var3] >= '0' && arg1[var3] <= '9') {
				return var3;
			}
		}
		return -1;
	}

	@ObfuscatedName("qc.a(ZI[C)I")
	public static final int indexOfNonNumber(int arg1, char[] arg2) {
		int var3 = arg1;
		while (true) {
			if (var3 < arg2.length && var3 >= 0) {
				if (arg2[var3] >= '0' && arg2[var3] <= '9') {
					var3++;
					continue;
				}
				return var3;
			}
			return arg2.length;
		}
	}

	@ObfuscatedName("qc.a(BC)Z")
	public static final boolean isSymbol(char arg1) {
		return !isAlpha(arg1) && !isNumber(arg1);
	}

	@ObfuscatedName("qc.b(IC)Z")
	public static final boolean isLowercaseAlpha(char arg1) {
		if (arg1 >= 'a' && arg1 <= 'z') {
			return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("qc.c(IC)Z")
	public static final boolean isAlpha(char arg1) {
		return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
	}

	@ObfuscatedName("qc.d(IC)Z")
	public static final boolean isNumber(char arg1) {
		return arg1 >= '0' && arg1 <= '9';
	}

	@ObfuscatedName("qc.b(CI)Z")
	public static final boolean isLowercase(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("qc.a(CZ)Z")
	public static final boolean isUpperCase(char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z';
	}

	@ObfuscatedName("qc.a([CB)Z")
	public static final boolean isBadFragment(char[] arg0) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (!isNumber(arg0[var3]) && arg0[var3] != 0) {
				var2 = false;
			}
		}
		if (var2) {
			return true;
		}
		int var4 = firstFragmentId(arg0);
		int var5 = 0;
		int var6 = fragments.length - 1;
		if (fragments[var5] == var4 || fragments[var6] == var4) {
			return true;
		}
		do {
			int var7 = (var5 + var6) / 2;
			if (fragments[var7] == var4) {
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

	@ObfuscatedName("qc.b([CI)I")
	public static final int firstFragmentId(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}
		int var2 = 0;
		for (int var4 = 0; var4 < arg0.length; var4++) {
			char var5 = arg0[arg0.length - var4 - 1];
			if (var5 >= 'a' && var5 <= 'z') {
				var2 = var2 * 38 + var5 - 'a' + 1;
			} else if (var5 == '\'') {
				var2 = var2 * 38 + 27;
			} else if (var5 >= '0' && var5 <= '9') {
				var2 = var2 * 38 + var5 - '0' + 28;
			} else if (var5 != 0) {
				return 0;
			}
		}
		return var2;
	}
}
