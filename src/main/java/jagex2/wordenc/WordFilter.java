package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class WordFilter {

	@ObfuscatedName("qc.a")
	public static int field1167 = 25800;

	@ObfuscatedName("qc.b")
	public static boolean field1168;

	@ObfuscatedName("qc.c")
	public static boolean field1169;

	@ObfuscatedName("qc.d")
	public static boolean field1170;

	@ObfuscatedName("qc.e")
	public static int field1171;

	@ObfuscatedName("qc.f")
	public static int field1172;

	@ObfuscatedName("qc.g")
	public static byte field1173 = -65;

	@ObfuscatedName("qc.h")
	public static int field1174 = -234;

	@ObfuscatedName("qc.i")
	public static int field1175;

	@ObfuscatedName("qc.j")
	public static byte field1176 = -119;

	@ObfuscatedName("qc.k")
	public static int field1177;

	@ObfuscatedName("qc.l")
	public static int[] field1178;

	@ObfuscatedName("qc.m")
	public static char[][] field1179;

	@ObfuscatedName("qc.n")
	public static byte[][][] field1180;

	@ObfuscatedName("qc.o")
	public static char[][] field1181;

	@ObfuscatedName("qc.p")
	public static char[][] field1182;

	@ObfuscatedName("qc.q")
	public static int[] field1183;

	@ObfuscatedName("qc.r")
	public static final String[] field1184 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

	@ObfuscatedName("qc.s")
	public static boolean field1185;

	@ObfuscatedName("qc.a(Lyb;)V")
	public static final void unpack(Jagfile arg0) {
		Packet var1 = new Packet((byte) -109, arg0.read("fragmentsenc.txt", null));
		Packet var2 = new Packet((byte) -109, arg0.read("badenc.txt", null));
		Packet var3 = new Packet((byte) -109, arg0.read("domainenc.txt", null));
		Packet var4 = new Packet((byte) -109, arg0.read("tldlist.txt", null));
		method390(var1, var2, var3, var4);
	}

	@ObfuscatedName("qc.a(Lmb;Lmb;Lmb;Lmb;)V")
	public static final void method390(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		method392(arg1, -42735);
		method393(-4612, arg2);
		method394(arg0, true);
		method391(arg3, 7);
	}

	@ObfuscatedName("qc.a(Lmb;I)V")
	public static final void method391(Packet arg0, int arg1) {
		int var2 = arg0.g4();
		if (arg1 < 7 || arg1 > 7) {
			field1168 = !field1168;
		}
		field1182 = new char[var2][];
		field1183 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			field1183[var3] = arg0.g1();
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}
			field1182[var3] = var4;
		}
	}

	@ObfuscatedName("qc.b(Lmb;I)V")
	public static final void method392(Packet arg0, int arg1) {
		int var2 = arg0.g4();
		field1179 = new char[var2][];
		field1180 = new byte[var2][][];
		if (arg1 != -42735) {
			field1167 = 320;
		}
		method395(field1179, 348, field1180, arg0);
	}

	@ObfuscatedName("qc.a(ILmb;)V")
	public static final void method393(int arg0, Packet arg1) {
		int var2 = arg1.g4();
		field1181 = new char[var2][];
		if (arg0 != -4612) {
			field1168 = !field1168;
		}
		method396(7792, arg1, field1181);
	}

	@ObfuscatedName("qc.a(Lmb;Z)V")
	public static final void method394(Packet arg0, boolean arg1) {
		if (arg1) {
			field1178 = new int[arg0.g4()];
			for (int var2 = 0; var2 < field1178.length; var2++) {
				field1178[var2] = arg0.g2();
			}
		}
	}

	@ObfuscatedName("qc.a([[CI[[[BLmb;)V")
	public static final void method395(char[][] arg0, int arg1, byte[][][] arg2, Packet arg3) {
		int var4 = 97 / arg1;
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
	public static final void method396(int arg0, Packet arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var5 = new char[arg1.g1()];
			for (int var6 = 0; var6 < var5.length; var6++) {
				var5[var6] = (char) arg1.g1();
			}
			arg2[var3] = var5;
		}
		if (arg0 != 7792) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
	}

	@ObfuscatedName("qc.a([CI)V")
	public static final void method397(char[] arg0, int arg1) {
		if (arg1 >= 0) {
			field1169 = !field1169;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (method398(0, arg0[var3])) {
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
	public static final boolean method398(int arg0, char arg1) {
		if (arg0 != 0) {
			throw new NullPointerException();
		}
		return arg1 >= ' ' && arg1 <= 127 || arg1 == ' ' || arg1 == '\n' || arg1 == '\t' || arg1 == 163 || arg1 == 8364;
	}

	@ObfuscatedName("qc.a(Ljava/lang/String;B)Ljava/lang/String;")
	public static final String method399(String arg0, byte arg1) {
		long var2 = System.currentTimeMillis();
		char[] var4 = arg0.toCharArray();
		if (arg1 != 5) {
			throw new NullPointerException();
		}
		method397(var4, -838);
		String var5 = (new String(var4)).trim();
		char[] var6 = var5.toLowerCase().toCharArray();
		String var7 = var5.toLowerCase();
		method407(0, var6);
		method402(false, var6);
		method403(-422, var6);
		method416(26384, var6);
		for (int var8 = 0; var8 < field1184.length; var8++) {
			int var11 = -1;
			while ((var11 = var7.indexOf(field1184[var8], var11 + 1)) != -1) {
				char[] var12 = field1184[var8].toCharArray();
				for (int var13 = 0; var13 < var12.length; var13++) {
					var6[var11 + var13] = var12[var13];
				}
			}
		}
		method400(var5.toCharArray(), var6, 0);
		method401(var6, field1170);
		long var9 = System.currentTimeMillis();
		return (new String(var6)).trim();
	}

	@ObfuscatedName("qc.a([C[CI)V")
	public static final void method400(char[] arg0, char[] arg1, int arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (arg1[var3] != '*' && method424(arg0[var3], true)) {
				arg1[var3] = arg0[var3];
			}
		}
		if (arg2 == 0) {
			;
		}
	}

	@ObfuscatedName("qc.a([CZ)V")
	public static final void method401(char[] arg0, boolean arg1) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char var4 = arg0[var3];
			if (!method421(0, var4)) {
				var2 = true;
			} else if (var2) {
				if (method423(var4, 590)) {
					var2 = false;
				}
			} else if (method424(var4, true)) {
				arg0[var3] = (char) (var4 + 'a' - 65);
			}
		}
		if (!arg1) {
			;
		}
	}

	@ObfuscatedName("qc.a(Z[C)V")
	public static final void method402(boolean arg0, char[] arg1) {
		if (arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		for (int var3 = 0; var3 < 2; var3++) {
			for (int var4 = field1179.length - 1; var4 >= 0; var4--) {
				method411(4, arg1, field1179[var4], field1180[var4]);
			}
		}
	}

	@ObfuscatedName("qc.a(I[C)V")
	public static final void method403(int arg0, char[] arg1) {
		if (arg0 >= 0) {
			return;
		}
		char[] var2 = (char[]) arg1.clone();
		char[] var3 = new char[] { '(', 'a', ')' };
		method411(4, var2, var3, null);
		char[] var4 = (char[]) arg1.clone();
		char[] var5 = new char[] { 'd', 'o', 't' };
		method411(4, var4, var5, null);
		for (int var6 = field1181.length - 1; var6 >= 0; var6--) {
			method404(var4, field1171, arg1, field1181[var6], var2);
		}
	}

	@ObfuscatedName("qc.a([CI[C[C[C)V")
	public static final void method404(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
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
					if (var8 < arg3.length && (var13 = method413(var12, var11, arg3[var8], (byte) 44)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break label61;
						}
						int var14;
						if ((var14 = method413(var12, var11, arg3[var8 - 1], (byte) 44)) > 0) {
							var7 += var14;
							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !method419((byte) 99, var11)) {
								break label61;
							}
							var7++;
						}
					}
				}
			}
			if (var8 >= arg3.length) {
				boolean var15 = false;
				int var16 = method405((byte) -65, arg4, var6, arg2);
				int var17 = method406(arg0, arg2, false, var7 - 1);
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
		if (arg1 != 0) {
			field1172 = 279;
		}
	}

	@ObfuscatedName("qc.a(B[CI[C)I")
	public static final int method405(byte arg0, char[] arg1, int arg2, char[] arg3) {
		if (arg2 == 0) {
			return 2;
		}
		for (int var4 = arg2 - 1; var4 >= 0 && method419((byte) 99, arg3[var4]); var4--) {
			if (arg3[var4] == '@') {
				return 3;
			}
		}
		if (field1173 != arg0) {
			field1172 = -62;
		}
		int var5 = 0;
		for (int var6 = arg2 - 1; var6 >= 0 && method419((byte) 99, arg1[var6]); var6--) {
			if (arg1[var6] == '*') {
				var5++;
			}
		}
		if (var5 >= 3) {
			return 4;
		} else if (method419((byte) 99, arg3[arg2 - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a([C[CZI)I")
	public static final int method406(char[] arg0, char[] arg1, boolean arg2, int arg3) {
		if (arg3 + 1 == arg1.length) {
			return 2;
		}
		int var4 = arg3 + 1;
		while (true) {
			if (var4 < arg1.length && method419((byte) 99, arg1[var4])) {
				if (arg1[var4] != '.' && arg1[var4] != ',') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg3 + 1; var6 < arg1.length && method419((byte) 99, arg0[var6]); var6++) {
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
			if (method419((byte) 99, arg1[arg3 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.b(I[C)V")
	public static final void method407(int arg0, char[] arg1) {
		char[] var2 = (char[]) arg1.clone();
		char[] var3 = new char[] { 'd', 'o', 't' };
		method411(4, var2, var3, null);
		char[] var4 = (char[]) arg1.clone();
		if (arg0 != 0) {
			return;
		}
		char[] var5 = new char[] { 's', 'l', 'a', 's', 'h' };
		method411(4, var4, var5, null);
		for (int var6 = 0; var6 < field1182.length; var6++) {
			method408(field1182[var6], var4, var2, field1183[var6], 2067, arg1);
		}
	}

	@ObfuscatedName("qc.a([C[C[CII[C)V")
	public static final void method408(char[] arg0, char[] arg1, char[] arg2, int arg3, int arg4, char[] arg5) {
		if (arg4 != 2067) {
			field1167 = 128;
		}
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
					if (var9 < arg0.length && (var14 = method413(var13, var12, arg0[var9], (byte) 44)) > 0) {
						var8 += var14;
						var9++;
					} else {
						if (var9 == 0) {
							break label128;
						}
						int var15;
						if ((var15 = method413(var13, var12, arg0[var9 - 1], (byte) 44)) > 0) {
							var8 += var15;
							if (var9 == 1) {
								var10++;
							}
						} else {
							if (var9 >= arg0.length || !method419((byte) 99, var12)) {
								break label128;
							}
							var8++;
						}
					}
				}
			}
			if (var9 >= arg0.length) {
				boolean var16 = false;
				int var17 = method409(arg5, field1174, var7, arg2);
				int var18 = method410(3, arg1, var8 - 1, arg5);
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
								if (method419((byte) 99, arg5[var24])) {
									break;
								}
								var19 = var24;
							} else if (!method419((byte) 99, arg5[var24])) {
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
								if (method419((byte) 99, arg5[var28])) {
									break;
								}
								var20 = var28;
							} else if (!method419((byte) 99, arg5[var28])) {
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
	public static final int method409(char[] arg0, int arg1, int arg2, char[] arg3) {
		if (arg2 == 0) {
			return 2;
		}
		int var4 = arg2 - 1;
		while (true) {
			if (var4 >= 0 && method419((byte) 99, arg0[var4])) {
				if (arg0[var4] != ',' && arg0[var4] != '.') {
					var4--;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			while (arg1 >= 0) {
				field1174 = 129;
			}
			for (int var6 = arg2 - 1; var6 >= 0 && method419((byte) 99, arg3[var6]); var6--) {
				if (arg3[var6] == '*') {
					var5++;
				}
			}
			if (var5 >= 3) {
				return 4;
			}
			if (method419((byte) 99, arg0[arg2 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a(I[CI[C)I")
	public static final int method410(int arg0, char[] arg1, int arg2, char[] arg3) {
		if (arg2 + 1 == arg3.length) {
			return 2;
		}
		int var4 = arg2 + 1;
		while (true) {
			if (var4 < arg3.length && method419((byte) 99, arg3[var4])) {
				if (arg3[var4] != '\\' && arg3[var4] != '/') {
					var4++;
					continue;
				}
				return 3;
			}
			int var5 = 0;
			for (int var6 = arg2 + 1; var6 < arg3.length && method419((byte) 99, arg1[var6]); var6++) {
				if (arg1[var6] == '*') {
					var5++;
				}
			}
			if (arg0 != 3) {
				field1174 = -25;
			}
			if (var5 >= 5) {
				return 4;
			}
			if (method419((byte) 99, arg3[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@ObfuscatedName("qc.a(I[C[C[[B)V")
	public static final void method411(int arg0, char[] arg1, char[] arg2, byte[][] arg3) {
		if (arg0 != 4 || arg2.length > arg1.length) {
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
					if (var7 < arg2.length && (var16 = method414(arg2[var7], field1176, var15, var14)) > 0) {
						if (var16 == 1 && method422(-2, var14)) {
							var11 = true;
						}
						if (var16 == 2 && (method422(-2, var14) || method422(-2, var15))) {
							var11 = true;
						}
						var6 += var16;
						var7++;
					} else {
						if (var7 == 0) {
							break label166;
						}
						int var17;
						if ((var17 = method414(arg2[var7 - 1], field1176, var15, var14)) > 0) {
							var6 += var17;
							if (var7 == 1) {
								var9++;
							}
						} else {
							if (var7 >= arg2.length || !method420(967, var14)) {
								break label166;
							}
							if (method419((byte) 99, var14) && var14 != '\'') {
								var10 = true;
							}
							if (method422(-2, var14)) {
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
					if (var5 - 1 < 0 || method419((byte) 99, arg1[var5 - 1]) && arg1[var5 - 1] != '\'') {
						var23 = true;
					}
					if (var6 >= arg1.length || method419((byte) 99, arg1[var6]) && arg1[var6] != '\'') {
						var24 = true;
					}
					if (!var23 || !var24) {
						boolean var25 = false;
						int var26 = var5 - 2;
						if (var23) {
							var26 = var5;
						}
						while (!var25 && var26 < var6) {
							if (var26 >= 0 && (!method419((byte) 99, arg1[var26]) || arg1[var26] == '\'')) {
								char[] var27 = new char[3];
								int var28;
								for (var28 = 0; var28 < 3 && var26 + var28 < arg1.length && (!method419((byte) 99, arg1[var26 + var28]) || arg1[var26 + var28] == '\''); var28++) {
									var27[var28] = arg1[var26 + var28];
								}
								boolean var29 = true;
								if (var28 == 0) {
									var29 = false;
								}
								if (var28 < 3 && var26 - 1 >= 0 && (!method419((byte) 99, arg1[var26 - 1]) || arg1[var26 - 1] == '\'')) {
									var29 = false;
								}
								if (var29 && !method425(var27, (byte) 5)) {
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
					byte var21 = method415(var19, 0);
					byte var22 = method415(var20, 0);
					if (arg3 != null && method412(arg3, 0, var21, var22)) {
						var18 = false;
					}
				}
				if (var18) {
					int var30 = 0;
					int var31 = 0;
					int var32 = -1;
					for (int var33 = var5; var33 < var6; var33++) {
						if (method422(-2, arg1[var33])) {
							var30++;
						} else if (method421(0, arg1[var33])) {
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
	public static final boolean method412(byte[][] arg0, int arg1, byte arg2, byte arg3) {
		int var4 = 0;
		if (arg0[var4][0] == arg2 && arg0[var4][1] == arg3) {
			return true;
		}
		int var5 = arg0.length - 1;
		if (arg1 < 0 || arg1 > 0) {
			throw new NullPointerException();
		} else if (arg0[var5][0] == arg2 && arg0[var5][1] == arg3) {
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
	public static final int method413(char arg0, char arg1, char arg2, byte arg3) {
		if (arg3 != 44) {
			return 1;
		} else if (arg1 == arg2) {
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
	public static final int method414(char arg0, byte arg1, char arg2, char arg3) {
		if (arg1 != -119) {
			field1175 = 182;
		}
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
	public static final byte method415(char arg0, int arg1) {
		if (arg1 != 0) {
			throw new NullPointerException();
		} else if (arg0 >= 'a' && arg0 <= 'z') {
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
	public static final void method416(int arg0, char[] arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		if (arg0 != 26384) {
			field1168 = !field1168;
		}
		while (true) {
			do {
				int var6;
				if ((var6 = method417(field1177, arg1, var3)) == -1) {
					return;
				}
				boolean var7 = false;
				for (int var8 = var3; var8 >= 0 && var8 < var6 && !var7; var8++) {
					if (!method419((byte) 99, arg1[var8]) && !method420(967, arg1[var8])) {
						var7 = true;
					}
				}
				if (var7) {
					var4 = 0;
				}
				if (var4 == 0) {
					var5 = var6;
				}
				var3 = method418(true, var6, arg1);
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
	public static final int method417(int arg0, char[] arg1, int arg2) {
		for (int var3 = arg2; var3 < arg1.length && var3 >= 0; var3++) {
			if (arg1[var3] >= '0' && arg1[var3] <= '9') {
				return var3;
			}
		}
		if (arg0 != 0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		return -1;
	}

	@ObfuscatedName("qc.a(ZI[C)I")
	public static final int method418(boolean arg0, int arg1, char[] arg2) {
		if (!arg0) {
			field1172 = -112;
		}
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
	public static final boolean method419(byte arg0, char arg1) {
		if (arg0 != 99) {
			field1177 = -408;
		}
		return !method421(0, arg1) && !method422(-2, arg1);
	}

	@ObfuscatedName("qc.b(IC)Z")
	public static final boolean method420(int arg0, char arg1) {
		int var2 = 41 / arg0;
		if (arg1 >= 'a' && arg1 <= 'z') {
			return arg1 == 'v' || arg1 == 'x' || arg1 == 'j' || arg1 == 'q' || arg1 == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("qc.c(IC)Z")
	public static final boolean method421(int arg0, char arg1) {
		if (arg0 != 0) {
			throw new NullPointerException();
		}
		return arg1 >= 'a' && arg1 <= 'z' || arg1 >= 'A' && arg1 <= 'Z';
	}

	@ObfuscatedName("qc.d(IC)Z")
	public static final boolean method422(int arg0, char arg1) {
		if (arg0 >= 0) {
			field1175 = -16;
		}
		return arg1 >= '0' && arg1 <= '9';
	}

	@ObfuscatedName("qc.b(CI)Z")
	public static final boolean method423(char arg0, int arg1) {
		int var2 = 23 / arg1;
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("qc.a(CZ)Z")
	public static final boolean method424(char arg0, boolean arg1) {
		if (!arg1) {
			throw new NullPointerException();
		}
		return arg0 >= 'A' && arg0 <= 'Z';
	}

	@ObfuscatedName("qc.a([CB)Z")
	public static final boolean method425(char[] arg0, byte arg1) {
		boolean var2 = true;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (!method422(-2, arg0[var3]) && arg0[var3] != 0) {
				var2 = false;
			}
		}
		if (var2) {
			return true;
		}
		int var4 = method426(arg0, -66);
		int var5 = 0;
		if (arg1 != 5) {
			field1170 = !field1170;
		}
		int var6 = field1178.length - 1;
		if (field1178[var5] == var4 || field1178[var6] == var4) {
			return true;
		}
		do {
			int var7 = (var5 + var6) / 2;
			if (field1178[var7] == var4) {
				return true;
			}
			if (var4 < field1178[var7]) {
				var6 = var7;
			} else {
				var5 = var7;
			}
		} while (var5 != var6 && var5 + 1 != var6);
		return false;
	}

	@ObfuscatedName("qc.b([CI)I")
	public static final int method426(char[] arg0, int arg1) {
		if (arg0.length > 6) {
			return 0;
		}
		int var2 = 0;
		if (arg1 >= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
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
