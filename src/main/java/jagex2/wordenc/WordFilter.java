package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("sc")
public class WordFilter {

	@ObfuscatedName("sc.r")
	public static int[] fragments;

	@ObfuscatedName("sc.s")
	public static char[][] badWords;

	@ObfuscatedName("sc.t")
	public static byte[][][] badCombinations;

	@ObfuscatedName("sc.u")
	public static char[][] domains;

	@ObfuscatedName("sc.v")
	public static char[][] tlds;

	@ObfuscatedName("sc.w")
	public static int[] tldsType;

	@ObfuscatedName("sc.x")
	public static final String[] ALLOWLIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

	@ObfuscatedName("sc.a(Lyb;)V")
	public static void unpack(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null));
		Packet var2 = new Packet(arg0.read("badenc.txt", null));
		Packet var3 = new Packet(arg0.read("domainenc.txt", null));
		Packet var4 = new Packet(arg0.read("tldlist.txt", null));
		decodeAll(var1, var2, var3, var4);
	}

	@ObfuscatedName("sc.a(Lmb;Lmb;Lmb;Lmb;)V")
	public static void decodeAll(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		decodeBadWordsTxt(arg1);
		decodeDomainsTxt(arg2);
		decodeFragmentsTxt(arg0);
		decodeTldsTxt(arg3);
	}

	@ObfuscatedName("sc.a(Lmb;I)V")
	public static void decodeTldsTxt(Packet arg0) {
		int var2 = arg0.g4();
		tlds = new char[var2][];
		tldsType = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			tldsType[var3] = arg0.g1();
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}
			tlds[var3] = var4;
		}
	}

	@ObfuscatedName("sc.a(ILmb;)V")
	public static void decodeBadWordsTxt(Packet arg1) {
		int var2 = arg1.g4();
		badWords = new char[var2][];
		badCombinations = new byte[var2][][];
		decodeBadCombinations(badWords, arg1, badCombinations);
	}

	@ObfuscatedName("sc.b(Lmb;I)V")
	public static void decodeDomainsTxt(Packet arg0) {
		int var3 = arg0.g4();
		domains = new char[var3][];
		decodeDomains(arg0, domains);
	}

	@ObfuscatedName("sc.a(Lmb;B)V")
	public static void decodeFragmentsTxt(Packet arg0) {
		fragments = new int[arg0.g4()];
		for (int var3 = 0; var3 < fragments.length; var3++) {
			fragments[var3] = arg0.g2();
		}
	}

	@ObfuscatedName("sc.a([[CLmb;I[[[B)V")
	public static void decodeBadCombinations(char[][] arg0, Packet arg1, byte[][][] arg3) {
		for (int var4 = 0; var4 < arg0.length; var4++) {
			char[] var5 = new char[arg1.g1()];
			for (int var6 = 0; var6 < var5.length; var6++) {
				var5[var6] = (char) arg1.g1();
			}
			arg0[var4] = var5;
			byte[][] var7 = new byte[arg1.g1()][2];
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8][0] = (byte) arg1.g1();
				var7[var8][1] = (byte) arg1.g1();
			}
			if (var7.length > 0) {
				arg3[var4] = var7;
			}
		}
	}

	@ObfuscatedName("sc.a(Lmb;[[CI)V")
	public static void decodeDomains(Packet arg0, char[][] arg1) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}
			arg1[var3] = var4;
		}
	}

	@ObfuscatedName("sc.a([CB)V")
	public static void filterCharacters(char[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (isCharAllowed(arg0[var3])) {
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

	@ObfuscatedName("sc.a(IC)Z")
	public static boolean isCharAllowed(char arg1) {
		return arg1 >= ' ' && arg1 <= 127 || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == 163 || arg1 == 8364;
	}

	@ObfuscatedName("sc.a(BLjava/lang/String;)Ljava/lang/String;")
	public static String filter(String arg1) {
		long var2 = System.currentTimeMillis();
		char[] var4 = arg1.toCharArray();
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

	@ObfuscatedName("sc.a(B[C[C)V")
	public static void replaceUppercase(char[] arg1, char[] arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			if (arg2[var3] != '*' && isUpperCase(arg1[var3])) {
				arg2[var3] = arg1[var3];
			}
		}
	}

	@ObfuscatedName("sc.b([CB)V")
	public static void formatUppercase(char[] arg0) {
		boolean var3 = true;
		for (int var4 = 0; var4 < arg0.length; var4++) {
			char var5 = arg0[var4];
			if (!isAlpha(var5)) {
				var3 = true;
			} else if (var3) {
				if (isLowerCase(var5)) {
					var3 = false;
				}
			} else if (isUpperCase(var5)) {
				arg0[var4] = (char) (var5 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("sc.a([CZ)V")
	public static void filterBad(char[] arg0) {
		for (int var3 = 0; var3 < 2; var3++) {
			for (int var4 = badWords.length - 1; var4 >= 0; var4--) {
				filter(arg0, badCombinations[var4], badWords[var4]);
			}
		}
	}

	@ObfuscatedName("sc.a(I[C)V")
	public static void filterDomains(char[] arg1) {
		char[] var3 = (char[]) arg1.clone();
		char[] var4 = new char[] { '(', 'a', ')' };
		filter(var3, null, var4);
		char[] var5 = (char[]) arg1.clone();
		char[] var6 = new char[] { 'd', 'o', 't' };
		filter(var5, null, var6);
		for (int var7 = domains.length - 1; var7 >= 0; var7--) {
			filterDomain(var3, arg1, var5, domains[var7]);
		}
	}

	@ObfuscatedName("sc.a([CI[C[C[C)V")
	public static void filterDomain(char[] arg0, char[] arg2, char[] arg3, char[] arg4) {
		if (arg4.length > arg2.length) {
			return;
		}
		boolean var5 = true;
		int var9;
		for (int var6 = 0; var6 <= arg2.length - arg4.length; var6 += var9) {
			int var7 = var6;
			int var8 = 0;
			var9 = 1;
			label58: while (true) {
				while (true) {
					if (var7 >= arg2.length) {
						break label58;
					}
					boolean var10 = false;
					char var11 = arg2[var7];
					char var12 = 0;
					if (var7 + 1 < arg2.length) {
						var12 = arg2[var7 + 1];
					}
					int var13;
					if (var8 < arg4.length && (var13 = getEmulatedDomainCharSize(arg4[var8], var11, var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break label58;
						}
						int var14;
						if ((var14 = getEmulatedDomainCharSize(arg4[var8 - 1], var11, var12)) > 0) {
							var7 += var14;
							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg4.length || !isSymbol(var11)) {
								break label58;
							}
							var7++;
						}
					}
				}
			}
			if (var8 >= arg4.length) {
				boolean var15 = false;
				int var16 = getDomainAtFilterStatus(var6, arg0, arg2);
				int var17 = getDomainDotFilterStatus(arg2, var7 - 1, arg3);
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

	@ObfuscatedName("sc.a(I[C[CI)I")
	public static int getDomainAtFilterStatus(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}
		for (int var4 = arg0 - 1; var4 >= 0 && isSymbol(arg2[var4]); var4--) {
			if (arg2[var4] == '@') {
				return 3;
			}
		}
		int var5 = 0;
		for (int var6 = arg0 - 1; var6 >= 0 && isSymbol(arg1[var6]); var6--) {
			if (arg1[var6] == '*') {
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

	@ObfuscatedName("sc.a([CII[C)I")
	public static int getDomainDotFilterStatus(char[] arg0, int arg2, char[] arg3) {
		if (arg2 + 1 == arg0.length) {
			return 2;
		}
		int var4 = arg2 + 1;
		while (true) {
			if (var4 < arg0.length && isSymbol(arg0[var4])) {
				if (arg0[var4] != '.' && arg0[var4] != ',') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var7 = arg2 + 1; var7 < arg0.length && isSymbol(arg3[var7]); var7++) {
				if (arg3[var7] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (isSymbol(arg0[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([CI)V")
	public static void filterTld(char[] arg0) {
		char[] var2 = (char[]) arg0.clone();
		char[] var3 = new char[] { 'd', 'o', 't' };
		filter(var2, null, var3);
		char[] var4 = (char[]) arg0.clone();
		char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(var4, null, var5);
		for (int var6 = 0; var6 < tlds.length; var6++) {
			filterTld(arg0, tldsType[var6], var4, tlds[var6], var2);
		}
	}

	@ObfuscatedName("sc.a([CI[C[C[CI)V")
	public static void filterTld(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
		if (arg3.length > arg0.length) {
			return;
		}
		boolean var6 = true;
		int var10;
		for (int var7 = 0; var7 <= arg0.length - arg3.length; var7 += var10) {
			int var8 = var7;
			int var9 = 0;
			var10 = 1;
			label130: while (true) {
				while (true) {
					if (var8 >= arg0.length) {
						break label130;
					}
					boolean var11 = false;
					char var12 = arg0[var8];
					char var13 = 0;
					if (var8 + 1 < arg0.length) {
						var13 = arg0[var8 + 1];
					}
					int var14;
					if (var9 < arg3.length && (var14 = getEmulatedDomainCharSize(arg3[var9], var12, var13)) > 0) {
						var8 += var14;
						var9++;
					} else {
						if (var9 == 0) {
							break label130;
						}
						int var15;
						if ((var15 = getEmulatedDomainCharSize(arg3[var9 - 1], var12, var13)) > 0) {
							var8 += var15;
							if (var9 == 1) {
								var10++;
							}
						} else {
							if (var9 >= arg3.length || !isSymbol(var12)) {
								break label130;
							}
							var8++;
						}
					}
				}
			}
			if (var9 >= arg3.length) {
				boolean var16 = false;
				int var17 = getTldDotFilterStatus(arg4, var7, arg0);
				int var18 = getTldSlashFilterStatus(var8 - 1, arg0, arg2);
				if (arg1 == 1 && var17 > 0 && var18 > 0) {
					var16 = true;
				}
				if (arg1 == 2 && (var17 > 2 && var18 > 0 || var17 > 0 && var18 > 2)) {
					var16 = true;
				}
				if (arg1 == 3 && var17 > 0 && var18 > 2) {
					var16 = true;
				}
				boolean var10000;
				if (arg1 == 3 && var17 > 2 && var18 > 0) {
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
									if (arg4[var22] != '*') {
										break;
									}
									var19 = var22;
								} else if (arg4[var22] == '*') {
									var19 = var22;
									var21 = true;
								}
							}
						}
						boolean var23 = false;
						for (int var24 = var19 - 1; var24 >= 0; var24--) {
							if (var23) {
								if (isSymbol(arg0[var24])) {
									break;
								}
								var19 = var24;
							} else if (!isSymbol(arg0[var24])) {
								var23 = true;
								var19 = var24;
							}
						}
					}
					if (var18 > 2) {
						if (var18 == 4) {
							boolean var25 = false;
							for (int var26 = var20 + 1; var26 < arg0.length; var26++) {
								if (var25) {
									if (arg2[var26] != '*') {
										break;
									}
									var20 = var26;
								} else if (arg2[var26] == '*') {
									var20 = var26;
									var25 = true;
								}
							}
						}
						boolean var27 = false;
						for (int var28 = var20 + 1; var28 < arg0.length; var28++) {
							if (var27) {
								if (isSymbol(arg0[var28])) {
									break;
								}
								var20 = var28;
							} else if (!isSymbol(arg0[var28])) {
								var27 = true;
								var20 = var28;
							}
						}
					}
					for (int var29 = var19; var29 <= var20; var29++) {
						arg0[var29] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(Z[CI[C)I")
	public static int getTldDotFilterStatus(char[] arg1, int arg2, char[] arg3) {
		if (arg2 == 0) {
			return 2;
		}
		int var4 = arg2 - 1;
		while (true) {
			if (var4 >= 0 && isSymbol(arg3[var4])) {
				if (arg3[var4] != ',' && arg3[var4] != '.') {
					var4--;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg2 - 1; var6 >= 0 && isSymbol(arg1[var6]); var6--) {
				if (arg1[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (isSymbol(arg3[arg2 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a(I[C[CB)I")
	public static int getTldSlashFilterStatus(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}
		int var4 = arg0 + 1;
		while (true) {
			if (var4 < arg1.length && isSymbol(arg1[var4])) {
				if (arg1[var4] != '\\' && arg1[var4] != '/') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg0 + 1; var6 < arg1.length && isSymbol(arg2[var6]); var6++) {
				if (arg2[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 5) {
				return 4;
			}
			if (isSymbol(arg1[arg0 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([CB[[B[C)V")
	public static void filter(char[] arg0, byte[][] arg2, char[] arg3) {
		if (arg3.length > arg0.length) {
			return;
		}
		boolean var5 = true;
		int var10;
		for (int var6 = 0; var6 <= arg0.length - arg3.length; var6 += var10) {
			int var7 = var6;
			int var8 = 0;
			int var9 = 0;
			var10 = 1;
			boolean var11 = false;
			boolean var12 = false;
			boolean var13 = false;
			label163: while (true) {
				while (true) {
					if (var7 >= arg0.length || var12 && var13) {
						break label163;
					}
					boolean var14 = false;
					char var15 = arg0[var7];
					char var16 = 0;
					if (var7 + 1 < arg0.length) {
						var16 = arg0[var7 + 1];
					}
					int var17;
					if (var8 < arg3.length && (var17 = getEmulatedSize(arg3[var8], var16, var15)) > 0) {
						if (var17 == 1 && isNumber(var15)) {
							var12 = true;
						}
						if (var17 == 2 && (isNumber(var15) || isNumber(var16))) {
							var12 = true;
						}
						var7 += var17;
						var8++;
					} else {
						if (var8 == 0) {
							break label163;
						}
						int var18;
						if ((var18 = getEmulatedSize(arg3[var8 - 1], var16, var15)) > 0) {
							var7 += var18;
							if (var8 == 1) {
								var10++;
							}
						} else {
							if (var8 >= arg3.length || !isLowerCaseAlpha(var15)) {
								break label163;
							}
							if (isSymbol(var15) && var15 != '\'') {
								var11 = true;
							}
							if (isNumber(var15)) {
								var13 = true;
							}
							var7++;
							var9++;
							if (var9 * 100 / (var7 - var6) > 90) {
								break label163;
							}
						}
					}
				}
			}
			if (var8 >= arg3.length && (!var12 || !var13)) {
				boolean var19 = true;
				if (var11) {
					boolean var24 = false;
					boolean var25 = false;
					if (var6 - 1 < 0 || isSymbol(arg0[var6 - 1]) && arg0[var6 - 1] != '\'') {
						var24 = true;
					}
					if (var7 >= arg0.length || isSymbol(arg0[var7]) && arg0[var7] != '\'') {
						var25 = true;
					}
					if (!var24 || !var25) {
						boolean var26 = false;
						int var27 = var6 - 2;
						if (var24) {
							var27 = var6;
						}
						while (!var26 && var27 < var7) {
							if (var27 >= 0 && (!isSymbol(arg0[var27]) || arg0[var27] == '\'')) {
								char[] var28 = new char[3];
								int var29;
								for (var29 = 0; var29 < 3 && var27 + var29 < arg0.length && (!isSymbol(arg0[var27 + var29]) || arg0[var27 + var29] == '\''); var29++) {
									var28[var29] = arg0[var27 + var29];
								}
								boolean var30 = true;
								if (var29 == 0) {
									var30 = false;
								}
								if (var29 < 3 && var27 - 1 >= 0 && (!isSymbol(arg0[var27 - 1]) || arg0[var27 - 1] == '\'')) {
									var30 = false;
								}
								if (var30 && !isBadFragment(var28)) {
									var26 = true;
								}
							}
							var27++;
						}
						if (!var26) {
							var19 = false;
						}
					}
				} else {
					char var20 = ' ';
					if (var6 - 1 >= 0) {
						var20 = arg0[var6 - 1];
					}
					char var21 = ' ';
					if (var7 < arg0.length) {
						var21 = arg0[var7];
					}
					byte var22 = getIndex(var20);
					byte var23 = getIndex(var21);
					if (arg2 != null && comboMatches(var22, arg2, var23)) {
						var19 = false;
					}
				}
				if (var19) {
					int var31 = 0;
					int var32 = 0;
					int var33 = -1;
					for (int var34 = var6; var34 < var7; var34++) {
						if (isNumber(arg0[var34])) {
							var31++;
						} else if (isAlpha(arg0[var34])) {
							var32++;
							var33 = var34;
						}
					}
					if (var33 > -1) {
						var31 -= var7 - var33 + 1;
					}
					if (var31 <= var32) {
						for (int var35 = var6; var35 < var7; var35++) {
							arg0[var35] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(BI[[BB)Z")
	public static boolean comboMatches(byte arg0, byte[][] arg2, byte arg3) {
		int var4 = 0;
		if (arg2[var4][0] == arg0 && arg2[var4][1] == arg3) {
			return true;
		}
		int var5 = arg2.length - 1;
		if (arg2[var5][0] == arg0 && arg2[var5][1] == arg3) {
			return true;
		}
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

	@ObfuscatedName("sc.a(CCCI)I")
	public static int getEmulatedDomainCharSize(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		} else if (arg0 == 'o' && arg1 == '0') {
			return 1;
		} else if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
			return 2;
		} else if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		} else if (arg0 == 'e' && arg1 == 8364) {
			return 1;
		} else if (arg0 == 's' && arg1 == '$') {
			return 1;
		} else if (arg0 == 'l' && arg1 == 'i') {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a(CCIC)I")
	public static int getEmulatedSize(char arg0, char arg1, char arg3) {
		if (arg0 == arg3) {
			return 1;
		}
		if (arg0 >= 'a' && arg0 <= 'm') {
			if (arg0 == 'a') {
				if (arg3 != '4' && arg3 != '@' && arg3 != '^') {
					if (arg3 == '/' && arg1 == '\\') {
						return 2;
					}
					return 0;
				}
				return 1;
			}
			if (arg0 == 'b') {
				if (arg3 != '6' && arg3 != '8') {
					if ((arg3 != '1' || arg1 != '3') && (arg3 != 'i' || arg1 != '3')) {
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
				if ((arg3 != '[' || arg1 != ')') && (arg3 != 'i' || arg1 != ')')) {
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
				if (arg3 == 'p' && arg1 == 'h') {
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
					if ((arg3 != '(' || arg1 != ')') && (arg3 != '[' || arg1 != ']') && (arg3 != '{' || arg1 != '}') && (arg3 != '<' || arg1 != '>')) {
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
				if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'v') {
				if ((arg3 != '\\' || arg1 != '/') && (arg3 != '\\' || arg1 != '|') && (arg3 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg0 == 'w') {
				if (arg3 == 'v' && arg1 == 'v') {
					return 2;
				}
				return 0;
			}
			if (arg0 == 'x') {
				if ((arg3 != ')' || arg1 != '(') && (arg3 != '}' || arg1 != '{') && (arg3 != ']' || arg1 != '[') && (arg3 != '>' || arg1 != '<')) {
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
				} else if ((arg3 != '(' || arg1 != ')') && (arg3 != '{' || arg1 != '}') && (arg3 != '[' || arg1 != ']')) {
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

	@ObfuscatedName("sc.a(CZ)B")
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

	@ObfuscatedName("sc.b([CI)V")
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

	@ObfuscatedName("sc.a(Z[CI)I")
	public static int indexOfNumber(char[] arg1, int arg2) {
		for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
			if (arg1[var3] >= '0' && arg1[var3] <= '9') {
				return var3;
			}
		}
		return -1;
	}

	@ObfuscatedName("sc.a(I[CB)I")
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

	@ObfuscatedName("sc.b(CZ)Z")
	public static boolean isSymbol(char arg0) {
		return !isAlpha(arg0) && !isNumber(arg0);
	}

	@ObfuscatedName("sc.c(CZ)Z")
	public static boolean isLowerCaseAlpha(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("sc.b(IC)Z")
	public static boolean isAlpha(char arg1) {
		return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
	}

	@ObfuscatedName("sc.c(IC)Z")
	public static boolean isNumber(char arg1) {
		return arg1 >= '0' && arg1 <= '9';
	}

	@ObfuscatedName("sc.a(CI)Z")
	public static boolean isLowerCase(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("sc.b(CI)Z")
	public static boolean isUpperCase(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("sc.b(I[C)Z")
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

	@ObfuscatedName("sc.c([CB)I")
	public static int firstFragmentId(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		} else {
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
}
