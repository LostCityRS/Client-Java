package jagex2.wordfilter;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("sc")
public final class WordFilter {

	@ObfuscatedName("sc.a")
	public static int field1214;

	@ObfuscatedName("sc.b")
	public static int field1215;

	@ObfuscatedName("sc.c")
	public static boolean field1216;

	@ObfuscatedName("sc.d")
	public static boolean field1217 = true;

	@ObfuscatedName("sc.e")
	public static final int field1218 = 2;

	@ObfuscatedName("sc.f")
	public static final int field1219 = 2;

	@ObfuscatedName("sc.g")
	public static int field1220;

	@ObfuscatedName("sc.h")
	public static final byte field1221 = 7;

	@ObfuscatedName("sc.i")
	public static final byte field1222 = 121;

	@ObfuscatedName("sc.j")
	public static final byte field1223 = 16;

	@ObfuscatedName("sc.k")
	public static final boolean field1224 = true;

	@ObfuscatedName("sc.l")
	public static int[] fragments;

	@ObfuscatedName("sc.m")
	public static char[][] badWords;

	@ObfuscatedName("sc.n")
	public static byte[][][] badCombinations;

	@ObfuscatedName("sc.o")
	public static char[][] field1228;

	@ObfuscatedName("sc.p")
	public static char[][] field1229;

	@ObfuscatedName("sc.q")
	public static int[] tldType;

	@ObfuscatedName("sc.r")
	public static final String[] field1231 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("sc.a(Lxb;)V")
	public static void unpack(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null), 15787);
		Packet var2 = new Packet(arg0.read("badenc.txt", null), 15787);
		Packet var3 = new Packet(arg0.read("domainenc.txt", null), 15787);
		Packet var4 = new Packet(arg0.read("tldlist.txt", null), 15787);
		read(var1, var2, var3, var4);
	}

	@ObfuscatedName("sc.a(Llb;Llb;Llb;Llb;)V")
	public static void read(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		readBadWords(arg1);
		readDomains(arg2);
		method392(arg0);
		readTld(field1218, arg3);
	}

	@ObfuscatedName("sc.a(ILlb;)V")
	public static void readTld(int arg0, Packet arg1) {
		if (arg0 < field1219 || arg0 > field1219) {
			field1217 = !field1217;
		}
		int var2 = arg1.g4();
		field1229 = new char[var2][];
		tldType = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			tldType[var3] = arg1.g1();
			char[] var4 = new char[arg1.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.g1();
			}
			field1229[var3] = var4;
		}
	}

	@ObfuscatedName("sc.a(Llb;I)V")
	public static void readBadWords(Packet arg0) {
		int var1 = arg0.g4();
		badWords = new char[var1][];
		badCombinations = new byte[var1][][];
		readBad(badWords, badCombinations, arg0);
	}

	@ObfuscatedName("sc.a(ZLlb;)V")
	public static void readDomains(Packet arg0) {
		int var1 = arg0.g4();
		field1228 = new char[var1][];
		readDomain(arg0, field1228);
	}

	@ObfuscatedName("sc.a(Llb;B)V")
	public static void method392(Packet arg0) {
		fragments = new int[arg0.g4()];
		for (int var1 = 0; var1 < fragments.length; var1++) {
			fragments[var1] = arg0.g2();
		}
	}

	@ObfuscatedName("sc.a([[C[[[BLlb;I)V")
	public static void readBad(char[][] arg0, byte[][][] arg1, Packet arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg2.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg2.g1();
			}
			arg0[var3] = var4;
			byte[][] var6 = new byte[arg2.g1()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg2.g1();
				var6[var7][1] = (byte) arg2.g1();
			}
			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("sc.a(Llb;I[[C)V")
	public static void readDomain(Packet arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.g1()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.g1();
			}
			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a([CI)V")
	public static void filterCharacters(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (allowCharacter(arg0[var2])) {
				arg0[var1] = arg0[var2];
			} else {
				arg0[var1] = ' ';
			}
			if (var1 == 0 || arg0[var1] != ' ' || arg0[var1 - 1] != ' ') {
				var1++;
			}
		}
		for (int var3 = var1; var3 < arg0.length; var3++) {
			arg0[var3] = ' ';
		}
	}

	@ObfuscatedName("sc.a(CI)Z")
	public static boolean allowCharacter(char arg0) {
		return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
	}

	@ObfuscatedName("sc.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method397(String arg0, int arg1) {
		long var2 = System.currentTimeMillis();
		char[] var4 = arg0.toCharArray();
		filterCharacters(var4);
		String var5 = (new String(var4)).trim();
		char[] var6 = var5.toLowerCase().toCharArray();
		String var7 = var5.toLowerCase();
		filterDomains(var6);
		filterBad(var6);
		if (arg1 != 0) {
			throw new NullPointerException();
		}
		filterTld(field1220, var6);
		method414(var6);
		for (int var8 = 0; var8 < field1231.length; var8++) {
			int var9 = -1;
			while ((var9 = var7.indexOf(field1231[var8], var9 + 1)) != -1) {
				char[] var10 = field1231[var8].toCharArray();
				for (int var11 = 0; var11 < var10.length; var11++) {
					var6[var11 + var9] = var10[var11];
				}
			}
		}
		replaceUpperCases(var5.toCharArray(), var6);
		formatUpperCases(var6);
		long var12 = System.currentTimeMillis();
		return (new String(var6)).trim();
	}

	@ObfuscatedName("sc.a([C[CZ)V")
	public static void replaceUpperCases(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && isSymbol(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("sc.a([CB)V")
	public static void formatUpperCases(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!isUpperCase(var3)) {
				var1 = true;
			} else if (var1) {
				if (isAlpha(var3)) {
					var1 = false;
				}
			} else if (isSymbol(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("sc.a(B[C)V")
	public static void filterBad(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = badWords.length - 1; var2 >= 0; var2--) {
				filter(arg0, badWords[var2], badCombinations[var2]);
			}
		}
	}

	@ObfuscatedName("sc.a(I[C)V")
	public static void filterTld(int arg0, char[] arg1) {
		char[] var2 = (char[]) arg1.clone();
		if (arg0 == 0) {
			char[] var3 = new char[] { '(', 'a', ')' };
			filter(var2, var3, null);
			char[] var4 = (char[]) arg1.clone();
			char[] var5 = new char[] { 'd', 'o', 't' };
			filter(var4, var5, null);
			for (int var6 = field1228.length - 1; var6 >= 0; var6--) {
				filterDomain(var2, arg1, var4, field1228[var6]);
			}
		}
	}

	@ObfuscatedName("sc.a([C[C[CB[C)V")
	public static void filterDomain(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg3.length > arg1.length) {
			return;
		}
		int var7;
		for (int var4 = 0; var4 <= arg1.length - arg3.length; var4 += var7) {
			int var5 = var4;
			int var6 = 0;
			var7 = 1;
			label55: while (true) {
				while (true) {
					if (var5 >= arg1.length) {
						break label55;
					}
					char var8 = arg1[var5];
					char var9 = 0;
					if (var5 + 1 < arg1.length) {
						var9 = arg1[var5 + 1];
					}
					int var10;
					if (var6 < arg3.length && (var10 = getEmulatedDomainCharSize(var9, var8, arg3[var6])) > 0) {
						var5 += var10;
						var6++;
					} else {
						if (var6 == 0) {
							break label55;
						}
						int var11;
						if ((var11 = getEmulatedDomainCharSize(var9, var8, arg3[var6 - 1])) > 0) {
							var5 += var11;
							if (var6 == 1) {
								var7++;
							}
						} else {
							if (var6 >= arg3.length || !isNumber(var8)) {
								break label55;
							}
							var5++;
						}
					}
				}
			}
			if (var6 >= arg3.length) {
				boolean var12 = false;
				int var13 = getDomainAtFilterStatus(arg0, var4, arg1);
				int var14 = getTldSlashFilterStatus(arg1, arg2, var5 - 1);
				if (var13 > 2 || var14 > 2) {
					var12 = true;
				}
				if (var12) {
					for (int var15 = var4; var15 < var5; var15++) {
						arg1[var15] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(I[CI[C)I")
	public static int getDomainAtFilterStatus(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}
		for (int var3 = arg1 - 1; var3 >= 0 && isNumber(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}
		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && isNumber(arg0[var5]); var5--) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}
		if (var4 >= 3) {
			return 4;
		} else if (isNumber(arg2[arg1 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a([C[CII)I")
	public static int getTldSlashFilterStatus(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg0.length) {
			return 2;
		}
		int var3 = arg2 + 1;
		while (true) {
			if (var3 < arg0.length && isNumber(arg0[var3])) {
				if (arg0[var3] != '.' && arg0[var3] != ',') {
					var3++;
					continue;
				}
				return 3;
			}
			int var4 = 0;
			for (int var5 = arg2 + 1; var5 < arg0.length && isNumber(arg1[var5]); var5++) {
				if (arg1[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 3) {
				return 4;
			}
			if (isNumber(arg0[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.b([CI)V")
	public static void filterDomains(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		filter(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(var3, var4, null);
		for (int var5 = 0; var5 < field1229.length; var5++) {
			filterTld(tldType[var5], arg0, field1229[var5], var3, var1);
		}
	}

	@ObfuscatedName("sc.a(II[C[C[C[C)V")
	public static void filterTld(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
		if (arg2.length > arg1.length) {
			return;
		}
		int var8;
		for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var8) {
			int var6 = var5;
			int var7 = 0;
			var8 = 1;
			label117: while (true) {
				while (true) {
					if (var6 >= arg1.length) {
						break label117;
					}
					char var9 = arg1[var6];
					char var10 = 0;
					if (var6 + 1 < arg1.length) {
						var10 = arg1[var6 + 1];
					}
					int var11;
					if (var7 < arg2.length && (var11 = getEmulatedDomainCharSize(var10, var9, arg2[var7])) > 0) {
						var6 += var11;
						var7++;
					} else {
						if (var7 == 0) {
							break label117;
						}
						int var12;
						if ((var12 = getEmulatedDomainCharSize(var10, var9, arg2[var7 - 1])) > 0) {
							var6 += var12;
							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg2.length || !isNumber(var9)) {
								break label117;
							}
							var6++;
						}
					}
				}
			}
			if (var7 >= arg2.length) {
				boolean var13 = false;
				int var14 = getTldDotFilterStatus(var5, arg1, arg4);
				int var15 = getDomainDotFilterStatus(arg3, arg1, var6 - 1);
				if (arg0 == 1 && var14 > 0 && var15 > 0) {
					var13 = true;
				}
				if (arg0 == 2 && (var14 > 2 && var15 > 0 || var14 > 0 && var15 > 2)) {
					var13 = true;
				}
				if (arg0 == 3 && var14 > 0 && var15 > 2) {
					var13 = true;
				}
				boolean var10000;
				if (arg0 == 3 && var14 > 2 && var15 > 0) {
					var10000 = true;
				} else {
					var10000 = false;
				}
				if (var13) {
					int var16 = var5;
					int var17 = var6 - 1;
					if (var14 > 2) {
						if (var14 == 4) {
							boolean var18 = false;
							for (int var19 = var5 - 1; var19 >= 0; var19--) {
								if (var18) {
									if (arg4[var19] != '*') {
										break;
									}
									var16 = var19;
								} else if (arg4[var19] == '*') {
									var16 = var19;
									var18 = true;
								}
							}
						}
						boolean var20 = false;
						for (int var21 = var16 - 1; var21 >= 0; var21--) {
							if (var20) {
								if (isNumber(arg1[var21])) {
									break;
								}
								var16 = var21;
							} else if (!isNumber(arg1[var21])) {
								var20 = true;
								var16 = var21;
							}
						}
					}
					if (var15 > 2) {
						if (var15 == 4) {
							boolean var22 = false;
							for (int var23 = var17 + 1; var23 < arg1.length; var23++) {
								if (var22) {
									if (arg3[var23] != '*') {
										break;
									}
									var17 = var23;
								} else if (arg3[var23] == '*') {
									var17 = var23;
									var22 = true;
								}
							}
						}
						boolean var24 = false;
						for (int var25 = var17 + 1; var25 < arg1.length; var25++) {
							if (var24) {
								if (isNumber(arg1[var25])) {
									break;
								}
								var17 = var25;
							} else if (!isNumber(arg1[var25])) {
								var24 = true;
								var17 = var25;
							}
						}
					}
					for (int var26 = var16; var26 <= var17; var26++) {
						arg1[var26] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(I[CZ[C)I")
	public static int getTldDotFilterStatus(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}
		int var3 = arg0 - 1;
		while (true) {
			if (var3 >= 0 && isNumber(arg1[var3])) {
				if (arg1[var3] != ',' && arg1[var3] != '.') {
					var3--;
					continue;
				}
				return 3;
			}
			int var4 = 0;
			for (int var5 = arg0 - 1; var5 >= 0 && isNumber(arg2[var5]); var5--) {
				if (arg2[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 3) {
				return 4;
			}
			if (isNumber(arg1[arg0 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([C[CBI)I")
	public static int getDomainDotFilterStatus(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}
		int var3 = arg2 + 1;
		while (true) {
			if (var3 < arg1.length && isNumber(arg1[var3])) {
				if (arg1[var3] != '\\' && arg1[var3] != '/') {
					var3++;
					continue;
				}
				return 3;
			}
			int var4 = 0;
			for (int var5 = arg2 + 1; var5 < arg1.length && isNumber(arg0[var5]); var5++) {
				if (arg0[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 5) {
				return 4;
			}
			if (isNumber(arg1[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([C[C[[BI)V")
	public static void filter(char[] arg0, char[] arg1, byte[][] arg2) {
		if (arg1.length > arg0.length) {
			return;
		}
		int var7;
		for (int var3 = 0; var3 <= arg0.length - arg1.length; var3 += var7) {
			int var4 = var3;
			int var5 = 0;
			int var6 = 0;
			var7 = 1;
			boolean var8 = false;
			boolean var9 = false;
			boolean var10 = false;
			label161: while (true) {
				while (true) {
					if (var4 >= arg0.length || var9 && var10) {
						break label161;
					}
					char var11 = arg0[var4];
					char var12 = 0;
					if (var4 + 1 < arg0.length) {
						var12 = arg0[var4 + 1];
					}
					int var13;
					if (var5 < arg1.length && (var13 = getEmulatedSize(var11, var12, arg1[var5])) > 0) {
						if (var13 == 1 && method420(var11)) {
							var9 = true;
						}
						if (var13 == 2 && (method420(var11) || method420(var12))) {
							var9 = true;
						}
						var4 += var13;
						var5++;
					} else {
						if (var5 == 0) {
							break label161;
						}
						int var14;
						if ((var14 = getEmulatedSize(var11, var12, arg1[var5 - 1])) > 0) {
							var4 += var14;
							if (var5 == 1) {
								var7++;
							}
						} else {
							if (var5 >= arg1.length || !isLowerCaseAlpha(var11)) {
								break label161;
							}
							if (isNumber(var11) && var11 != '\'') {
								var8 = true;
							}
							if (method420(var11)) {
								var10 = true;
							}
							var4++;
							var6++;
							if (var6 * 100 / (var4 - var3) > 90) {
								break label161;
							}
						}
					}
				}
			}
			if (var5 >= arg1.length && (!var9 || !var10)) {
				boolean var15 = true;
				if (var8) {
					boolean var20 = false;
					boolean var21 = false;
					if (var3 - 1 < 0 || isNumber(arg0[var3 - 1]) && arg0[var3 - 1] != '\'') {
						var20 = true;
					}
					if (var4 >= arg0.length || isNumber(arg0[var4]) && arg0[var4] != '\'') {
						var21 = true;
					}
					if (!var20 || !var21) {
						boolean var22 = false;
						int var23 = var3 - 2;
						if (var20) {
							var23 = var3;
						}
						while (!var22 && var23 < var4) {
							if (var23 >= 0 && (!isNumber(arg0[var23]) || arg0[var23] == '\'')) {
								char[] var24 = new char[3];
								int var25;
								for (var25 = 0; var25 < 3 && var23 + var25 < arg0.length && (!isNumber(arg0[var23 + var25]) || arg0[var23 + var25] == '\''); var25++) {
									var24[var25] = arg0[var23 + var25];
								}
								boolean var26 = true;
								if (var25 == 0) {
									var26 = false;
								}
								if (var25 < 3 && var23 - 1 >= 0 && (!isNumber(arg0[var23 - 1]) || arg0[var23 - 1] == '\'')) {
									var26 = false;
								}
								if (var26 && !method423(var24)) {
									var22 = true;
								}
							}
							var23++;
						}
						if (!var22) {
							var15 = false;
						}
					}
				} else {
					char var16 = ' ';
					if (var3 - 1 >= 0) {
						var16 = arg0[var3 - 1];
					}
					char var17 = ' ';
					if (var4 < arg0.length) {
						var17 = arg0[var4];
					}
					byte var18 = method413(var16);
					byte var19 = method413(var17);
					if (arg2 != null && comboMatches(var19, field1221, var18, arg2)) {
						var15 = false;
					}
				}
				if (var15) {
					int var27 = 0;
					int var28 = 0;
					int var29 = -1;
					for (int var30 = var3; var30 < var4; var30++) {
						if (method420(arg0[var30])) {
							var27++;
						} else if (isUpperCase(arg0[var30])) {
							var28++;
							var29 = var30;
						}
					}
					if (var29 > -1) {
						var27 -= var4 - var29 - 1;
					}
					if (var27 <= var28) {
						for (int var31 = var3; var31 < var4; var31++) {
							arg0[var31] = '*';
						}
					} else {
						var7 = 1;
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(BBB[[B)Z")
	public static boolean comboMatches(byte arg0, byte arg1, byte arg2, byte[][] arg3) {
		if (arg1 != 7) {
			throw new NullPointerException();
		}
		int var4 = 0;
		if (arg3[0][0] == arg2 && arg3[0][1] == arg0) {
			return true;
		}
		int var5 = arg3.length - 1;
		if (arg3[var5][0] == arg2 && arg3[var5][1] == arg0) {
			return true;
		}
		do {
			int var6 = (var4 + var5) / 2;
			if (arg3[var6][0] == arg2 && arg3[var6][1] == arg0) {
				return true;
			}
			if (arg2 < arg3[var6][0] || arg2 == arg3[var6][0] && arg0 < arg3[var6][1]) {
				var5 = var6;
			} else {
				var4 = var6;
			}
		} while (var4 != var5 && var4 + 1 != var5);
		return false;
	}

	@ObfuscatedName("sc.a(CCBC)I")
	public static int getEmulatedDomainCharSize(char arg0, char arg1, char arg2) {
		if (arg2 == arg1) {
			return 1;
		} else if (arg2 == 'o' && arg1 == '0') {
			return 1;
		} else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
			return 2;
		} else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		} else if (arg2 == 'e' && arg1 == '€') {
			return 1;
		} else if (arg2 == 's' && arg1 == '$') {
			return 1;
		} else if (arg2 == 'l' && arg1 == 'i') {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a(BCCC)I")
	public static int getEmulatedSize(char arg0, char arg1, char arg2) {
		if (arg2 == arg0) {
			return 1;
		}
		if (arg2 >= 'a' && arg2 <= 'm') {
			if (arg2 == 'a') {
				if (arg0 == '4' || arg0 == '@' || arg0 == '^') {
					return 1;
				}
				if (arg0 == '/' && arg1 == '\\') {
					return 2;
				}
				return 0;
			}
			if (arg2 == 'b') {
				if (arg0 == '6' || arg0 == '8') {
					return 1;
				}
				if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'd') {
				if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'e') {
				if (arg0 != '3' && arg0 != '€') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'f') {
				if (arg0 == 'p' && arg1 == 'h') {
					return 2;
				}
				if (arg0 == '£') {
					return 1;
				}
				return 0;
			}
			if (arg2 == 'g') {
				if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'h') {
				if (arg0 == '#') {
					return 1;
				}
				return 0;
			}
			if (arg2 == 'i') {
				if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'j') {
				return 0;
			}
			if (arg2 == 'k') {
				return 0;
			}
			if (arg2 == 'l') {
				if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'm') {
				return 0;
			}
		}
		if (arg2 >= 'n' && arg2 <= 'z') {
			if (arg2 == 'n') {
				return 0;
			}
			if (arg2 == 'o') {
				if (arg0 == '0' || arg0 == '*') {
					return 1;
				}
				if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'p') {
				return 0;
			}
			if (arg2 == 'q') {
				return 0;
			}
			if (arg2 == 'r') {
				return 0;
			}
			if (arg2 == 's') {
				if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 't') {
				if (arg0 != '7' && arg0 != '+') {
					return 0;
				}
				return 1;
			}
			if (arg2 == 'u') {
				if (arg0 == 'v') {
					return 1;
				}
				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'v') {
				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'w') {
				if (arg0 == 'v' && arg1 == 'v') {
					return 2;
				}
				return 0;
			}
			if (arg2 == 'x') {
				if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
					return 0;
				}
				return 2;
			}
			if (arg2 == 'y') {
				return 0;
			}
			if (arg2 == 'z') {
				return 0;
			}
		}
		if (arg2 >= '0' && arg2 <= '9') {
			if (arg2 == '0') {
				if (arg0 == 'o' || arg0 == 'O') {
					return 1;
				} else if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
					return 0;
				} else {
					return 2;
				}
			} else if (arg2 == '1') {
				return arg0 == 'l' ? 1 : 0;
			} else {
				return 0;
			}
		} else if (arg2 == ',') {
			return arg0 == '.' ? 1 : 0;
		} else if (arg2 == '.') {
			return arg0 == ',' ? 1 : 0;
		} else if (arg2 == '!') {
			return arg0 == 'i' ? 1 : 0;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a(IC)B")
	public static byte method413(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 + 1 - 'a');
		} else if (arg0 == '\'') {
			return 28;
		} else if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 + 29 - '0');
		} else {
			return 27;
		}
	}

	@ObfuscatedName("sc.c([CI)V")
	public static void method414(char[] arg0) {
		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		while (true) {
			do {
				int var6;
				if ((var6 = indexOfNumber(var1, arg0)) == -1) {
					return;
				}
				boolean var4 = false;
				for (int var5 = var1; var5 >= 0 && var5 < var6 && !var4; var5++) {
					if (!isNumber(arg0[var5]) && !isLowerCaseAlpha(arg0[var5])) {
						var4 = true;
					}
				}
				if (var4) {
					var2 = 0;
				}
				if (var2 == 0) {
					var3 = var6;
				}
				var1 = indexOfNonNumber(arg0, var6);
				int var7 = 0;
				for (int var8 = var6; var8 < var1; var8++) {
					var7 = var7 * 10 + arg0[var8] - 48;
				}
				if (var7 <= 255 && var1 - var6 <= 8) {
					var2++;
				} else {
					var2 = 0;
				}
			} while (var2 != 4);
			for (int var9 = var3; var9 < var1; var9++) {
				arg0[var9] = '*';
			}
			var2 = 0;
		}
	}

	@ObfuscatedName("sc.a(II[C)I")
	public static int indexOfNumber(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("sc.a([CIZ)I")
	public static int indexOfNonNumber(char[] arg0, int arg1) {
		int var2 = arg1;
		while (true) {
			if (var2 >= arg0.length || var2 < 0) {
				return arg0.length;
			}
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				var2++;
				continue;
			}
			return var2;
		}
	}

	@ObfuscatedName("sc.b(CI)Z")
	public static boolean isNumber(char arg0) {
		return !isUpperCase(arg0) && !method420(arg0);
	}

	@ObfuscatedName("sc.c(CI)Z")
	public static boolean isLowerCaseAlpha(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
		}
		return true;
	}

	@ObfuscatedName("sc.d(CI)Z")
	public static boolean isUpperCase(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
	}

	@ObfuscatedName("sc.b(IC)Z")
	public static boolean method420(char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@ObfuscatedName("sc.a(CZ)Z")
	public static boolean isAlpha(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("sc.a(ZC)Z")
	public static boolean isSymbol(char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z';
	}

	@ObfuscatedName("sc.d([CI)Z")
	public static boolean method423(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method420(arg0[var2]) && arg0[var2] != '\u0000') {
				var1 = false;
			}
		}
		if (var1) {
			return true;
		}
		int var3 = firstFragmentId(arg0);
		int var4 = 0;
		int var5 = fragments.length - 1;
		if (var3 == fragments[0] || var3 == fragments[var5]) {
			return true;
		}
		do {
			int var6 = (var4 + var5) / 2;
			if (var3 == fragments[var6]) {
				return true;
			}
			if (var3 < fragments[var6]) {
				var5 = var6;
			} else {
				var4 = var6;
			}
		} while (var4 != var5 && var4 + 1 != var5);
		return false;
	}

	@ObfuscatedName("sc.b([CB)I")
	public static int firstFragmentId(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[arg0.length - var2 - 1];
			if (var3 >= 'a' && var3 <= 'z') {
				var1 = var1 * 38 + var3 + 1 - 'a';
			} else if (var3 == '\'') {
				var1 = var1 * 38 + 27;
			} else if (var3 >= '0' && var3 <= '9') {
				var1 = var1 * 38 + var3 + 28 - '0';
			} else if (var3 != '\u0000') {
				return 0;
			}
		}
		return var1;
	}
}
