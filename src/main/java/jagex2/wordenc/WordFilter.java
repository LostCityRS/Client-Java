package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("sc")
public class WordFilter {

	@ObfuscatedName("sc.r")
	public static int[] field1184;

	@ObfuscatedName("sc.s")
	public static char[][] field1185;

	@ObfuscatedName("sc.t")
	public static byte[][][] field1186;

	@ObfuscatedName("sc.u")
	public static char[][] field1187;

	@ObfuscatedName("sc.v")
	public static char[][] field1188;

	@ObfuscatedName("sc.w")
	public static int[] field1189;

	@ObfuscatedName("sc.x")
	public static final String[] field1190 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

	@ObfuscatedName("sc.a(Lyb;)V")
	public static final void unpack(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null));
		Packet var2 = new Packet(arg0.read("badenc.txt", null));
		Packet var3 = new Packet(arg0.read("domainenc.txt", null));
		Packet var4 = new Packet(arg0.read("tldlist.txt", null));
		method394(var1, var2, var3, var4);
	}

	@ObfuscatedName("sc.a(Lmb;Lmb;Lmb;Lmb;)V")
	public static final void method394(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		method396(arg1);
		method397(arg2);
		method398(arg0);
		method395(arg3);
	}

	@ObfuscatedName("sc.a(Lmb;I)V")
	public static final void method395(Packet arg0) {
		int var2 = arg0.g4();
		field1188 = new char[var2][];
		field1189 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			field1189[var3] = arg0.g1();
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}
			field1188[var3] = var4;
		}
	}

	@ObfuscatedName("sc.a(ILmb;)V")
	public static final void method396(Packet arg1) {
		int var2 = arg1.g4();
		field1185 = new char[var2][];
		field1186 = new byte[var2][][];
		method399(field1185, arg1, field1186);
	}

	@ObfuscatedName("sc.b(Lmb;I)V")
	public static final void method397(Packet arg0) {
		int var3 = arg0.g4();
		field1187 = new char[var3][];
		method400(arg0, field1187);
	}

	@ObfuscatedName("sc.a(Lmb;B)V")
	public static final void method398(Packet arg0) {
		field1184 = new int[arg0.g4()];
		for (int var3 = 0; var3 < field1184.length; var3++) {
			field1184[var3] = arg0.g2();
		}
	}

	@ObfuscatedName("sc.a([[CLmb;I[[[B)V")
	public static final void method399(char[][] arg0, Packet arg1, byte[][][] arg3) {
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
	public static final void method400(Packet arg0, char[][] arg1) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}
			arg1[var3] = var4;
		}
	}

	@ObfuscatedName("sc.a([CB)V")
	public static final void method401(char[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (method402(arg0[var3])) {
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
	public static final boolean method402(char arg1) {
		return arg1 >= ' ' && arg1 <= 127 || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == 163 || arg1 == 8364;
	}

	@ObfuscatedName("sc.a(BLjava/lang/String;)Ljava/lang/String;")
	public static final String method403(String arg1) {
		long var2 = System.currentTimeMillis();
		char[] var4 = arg1.toCharArray();
		method401(var4);
		String var6 = (new String(var4)).trim();
		char[] var7 = var6.toLowerCase().toCharArray();
		String var8 = var6.toLowerCase();
		method411(var7);
		method406(var7);
		method407(var7);
		method420(var7);
		for (int var9 = 0; var9 < field1190.length; var9++) {
			int var10 = -1;
			while ((var10 = var8.indexOf(field1190[var9], var10 + 1)) != -1) {
				char[] var11 = field1190[var9].toCharArray();
				for (int var12 = 0; var12 < var11.length; var12++) {
					var7[var12 + var10] = var11[var12];
				}
			}
		}
		method404((byte) 7, var6.toCharArray(), var7);
		method405(var7);
		long var13 = System.currentTimeMillis();
		return (new String(var7)).trim();
	}

	@ObfuscatedName("sc.a(B[C[C)V")
	public static final void method404(byte arg0, char[] arg1, char[] arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			if (arg2[var3] != '*' && method428(arg1[var3])) {
				arg2[var3] = arg1[var3];
			}
		}
		if (arg0 == 7) {
			;
		}
	}

	@ObfuscatedName("sc.b([CB)V")
	public static final void method405(char[] arg0) {
		boolean var3 = true;
		for (int var4 = 0; var4 < arg0.length; var4++) {
			char var5 = arg0[var4];
			if (!method425(var5)) {
				var3 = true;
			} else if (var3) {
				if (method427(var5)) {
					var3 = false;
				}
			} else if (method428(var5)) {
				arg0[var4] = (char) (var5 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("sc.a([CZ)V")
	public static final void method406(char[] arg0) {
		for (int var3 = 0; var3 < 2; var3++) {
			for (int var4 = field1185.length - 1; var4 >= 0; var4--) {
				method415(arg0, field1186[var4], field1185[var4]);
			}
		}
	}

	@ObfuscatedName("sc.a(I[C)V")
	public static final void method407(char[] arg1) {
		char[] var3 = (char[]) arg1.clone();
		char[] var4 = new char[] { '(', 'a', ')' };
		method415(var3, null, var4);
		char[] var5 = (char[]) arg1.clone();
		char[] var6 = new char[] { 'd', 'o', 't' };
		method415(var5, null, var6);
		for (int var7 = field1187.length - 1; var7 >= 0; var7--) {
			method408(var3, arg1, var5, field1187[var7]);
		}
	}

	@ObfuscatedName("sc.a([CI[C[C[C)V")
	public static final void method408(char[] arg0, char[] arg2, char[] arg3, char[] arg4) {
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
					if (var8 < arg4.length && (var13 = method417(arg4[var8], var11, var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break label58;
						}
						int var14;
						if ((var14 = method417(arg4[var8 - 1], var11, var12)) > 0) {
							var7 += var14;
							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg4.length || !method423(var11)) {
								break label58;
							}
							var7++;
						}
					}
				}
			}
			if (var8 >= arg4.length) {
				boolean var15 = false;
				int var16 = method409(var6, arg0, arg2);
				int var17 = method410(arg2, var7 - 1, arg3);
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
	public static final int method409(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}
		for (int var4 = arg0 - 1; var4 >= 0 && method423(arg2[var4]); var4--) {
			if (arg2[var4] == '@') {
				return 3;
			}
		}
		int var5 = 0;
		for (int var6 = arg0 - 1; var6 >= 0 && method423(arg1[var6]); var6--) {
			if (arg1[var6] == '*') {
				var5++;
			}
		}
		if (var5 >= 3) {
			return 4;
		} else if (method423(arg2[arg0 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sc.a([CII[C)I")
	public static final int method410(char[] arg0, int arg2, char[] arg3) {
		if (arg2 + 1 == arg0.length) {
			return 2;
		}
		int var4 = arg2 + 1;
		while (true) {
			if (var4 < arg0.length && method423(arg0[var4])) {
				if (arg0[var4] != '.' && arg0[var4] != ',') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var7 = arg2 + 1; var7 < arg0.length && method423(arg3[var7]); var7++) {
				if (arg3[var7] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (method423(arg0[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([CI)V")
	public static final void method411(char[] arg0) {
		char[] var2 = (char[]) arg0.clone();
		char[] var3 = new char[] { 'd', 'o', 't' };
		method415(var2, null, var3);
		char[] var4 = (char[]) arg0.clone();
		char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
		method415(var4, null, var5);
		for (int var6 = 0; var6 < field1188.length; var6++) {
			method412(arg0, field1189[var6], var4, field1188[var6], var2);
		}
	}

	@ObfuscatedName("sc.a([CI[C[C[CI)V")
	public static final void method412(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
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
					if (var9 < arg3.length && (var14 = method417(arg3[var9], var12, var13)) > 0) {
						var8 += var14;
						var9++;
					} else {
						if (var9 == 0) {
							break label130;
						}
						int var15;
						if ((var15 = method417(arg3[var9 - 1], var12, var13)) > 0) {
							var8 += var15;
							if (var9 == 1) {
								var10++;
							}
						} else {
							if (var9 >= arg3.length || !method423(var12)) {
								break label130;
							}
							var8++;
						}
					}
				}
			}
			if (var9 >= arg3.length) {
				boolean var16 = false;
				int var17 = method413(arg4, var7, arg0);
				int var18 = method414(var8 - 1, arg0, arg2);
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
								if (method423(arg0[var24])) {
									break;
								}
								var19 = var24;
							} else if (!method423(arg0[var24])) {
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
								if (method423(arg0[var28])) {
									break;
								}
								var20 = var28;
							} else if (!method423(arg0[var28])) {
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
	public static final int method413(char[] arg1, int arg2, char[] arg3) {
		if (arg2 == 0) {
			return 2;
		}
		int var4 = arg2 - 1;
		while (true) {
			if (var4 >= 0 && method423(arg3[var4])) {
				if (arg3[var4] != ',' && arg3[var4] != '.') {
					var4--;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg2 - 1; var6 >= 0 && method423(arg1[var6]); var6--) {
				if (arg1[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (method423(arg3[arg2 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a(I[C[CB)I")
	public static final int method414(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}
		int var4 = arg0 + 1;
		while (true) {
			if (var4 < arg1.length && method423(arg1[var4])) {
				if (arg1[var4] != '\\' && arg1[var4] != '/') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg0 + 1; var6 < arg1.length && method423(arg2[var6]); var6++) {
				if (arg2[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 5) {
				return 4;
			}
			if (method423(arg1[arg0 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("sc.a([CB[[B[C)V")
	public static final void method415(char[] arg0, byte[][] arg2, char[] arg3) {
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
					if (var8 < arg3.length && (var17 = method418(arg3[var8], var16, var15)) > 0) {
						if (var17 == 1 && method426(var15)) {
							var12 = true;
						}
						if (var17 == 2 && (method426(var15) || method426(var16))) {
							var12 = true;
						}
						var7 += var17;
						var8++;
					} else {
						if (var8 == 0) {
							break label163;
						}
						int var18;
						if ((var18 = method418(arg3[var8 - 1], var16, var15)) > 0) {
							var7 += var18;
							if (var8 == 1) {
								var10++;
							}
						} else {
							if (var8 >= arg3.length || !method424(var15)) {
								break label163;
							}
							if (method423(var15) && var15 != '\'') {
								var11 = true;
							}
							if (method426(var15)) {
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
					if (var6 - 1 < 0 || method423(arg0[var6 - 1]) && arg0[var6 - 1] != '\'') {
						var24 = true;
					}
					if (var7 >= arg0.length || method423(arg0[var7]) && arg0[var7] != '\'') {
						var25 = true;
					}
					if (!var24 || !var25) {
						boolean var26 = false;
						int var27 = var6 - 2;
						if (var24) {
							var27 = var6;
						}
						while (!var26 && var27 < var7) {
							if (var27 >= 0 && (!method423(arg0[var27]) || arg0[var27] == '\'')) {
								char[] var28 = new char[3];
								int var29;
								for (var29 = 0; var29 < 3 && var27 + var29 < arg0.length && (!method423(arg0[var27 + var29]) || arg0[var27 + var29] == '\''); var29++) {
									var28[var29] = arg0[var27 + var29];
								}
								boolean var30 = true;
								if (var29 == 0) {
									var30 = false;
								}
								if (var29 < 3 && var27 - 1 >= 0 && (!method423(arg0[var27 - 1]) || arg0[var27 - 1] == '\'')) {
									var30 = false;
								}
								if (var30 && !method429(var28)) {
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
					byte var22 = method419(var20);
					byte var23 = method419(var21);
					if (arg2 != null && method416(var22, arg2, var23)) {
						var19 = false;
					}
				}
				if (var19) {
					int var31 = 0;
					int var32 = 0;
					int var33 = -1;
					for (int var34 = var6; var34 < var7; var34++) {
						if (method426(arg0[var34])) {
							var31++;
						} else if (method425(arg0[var34])) {
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
	public static final boolean method416(byte arg0, byte[][] arg2, byte arg3) {
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
	public static final int method417(char arg0, char arg1, char arg2) {
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
	public static final int method418(char arg0, char arg1, char arg3) {
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
	public static final byte method419(char arg0) {
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
	public static final void method420(char[] arg0) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		while (true) {
			do {
				int var8;
				if ((var8 = method421(arg0, var3)) == -1) {
					return;
				}
				boolean var6 = false;
				for (int var7 = var3; var7 >= 0 && var7 < var8 && !var6; var7++) {
					if (!method423(arg0[var7]) && !method424(arg0[var7])) {
						var6 = true;
					}
				}
				if (var6) {
					var4 = 0;
				}
				if (var4 == 0) {
					var5 = var8;
				}
				var3 = method422(var8, arg0);
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
	public static final int method421(char[] arg1, int arg2) {
		for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
			if (arg1[var3] >= '0' && arg1[var3] <= '9') {
				return var3;
			}
		}
		return -1;
	}

	@ObfuscatedName("sc.a(I[CB)I")
	public static final int method422(int arg0, char[] arg1) {
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
	public static final boolean method423(char arg0) {
		return !method425(arg0) && !method426(arg0);
	}

	@ObfuscatedName("sc.c(CZ)Z")
	public static final boolean method424(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("sc.b(IC)Z")
	public static final boolean method425(char arg1) {
		return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
	}

	@ObfuscatedName("sc.c(IC)Z")
	public static final boolean method426(char arg1) {
		return arg1 >= '0' && arg1 <= '9';
	}

	@ObfuscatedName("sc.a(CI)Z")
	public static final boolean method427(char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("sc.b(CI)Z")
	public static final boolean method428(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("sc.b(I[C)Z")
	public static final boolean method429(char[] arg1) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg1.length; var3++) {
			if (!method426(arg1[var3]) && arg1[var3] != 0) {
				var2 = false;
			}
		}
		if (var2) {
			return true;
		}
		int var4 = method430(arg1);
		int var5 = 0;
		int var6 = field1184.length - 1;
		if (var4 == field1184[var5] || var4 == field1184[var6]) {
			return true;
		}
		do {
			int var7 = (var5 + var6) / 2;
			if (var4 == field1184[var7]) {
				return true;
			}
			if (var4 < field1184[var7]) {
				var6 = var7;
			} else {
				var5 = var7;
			}
		} while (var5 != var6 && var5 + 1 != var6);
		return false;
	}

	@ObfuscatedName("sc.c([CB)I")
	public static final int method430(char[] arg0) {
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
