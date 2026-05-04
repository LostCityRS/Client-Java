package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.ClientBuild;
import jagex3.config.QuickChatCatTypeList;
import jagex3.config.StructType;
import jagex3.io.PacketBit;

public class World {
	@ObfuscatedName("ff.bb")
	public static final int field1147 = 4;
	@ObfuscatedName("ff.db")
	public static final Occlude[][] field1149 = new Occlude[field1147][500];
	@ObfuscatedName("ff.cb")
	public static final int[] field1148 = new int[field1147];
	@ObfuscatedName("ng.Xb")
	public static final Sprite[] field2906 = new Sprite[5000];
	@ObfuscatedName("w.n")
	public static final Sprite[] field4447 = new Sprite[100];
	@ObfuscatedName("bb.e")
	public static Square[][][] field211;
	@ObfuscatedName("nc.h")
	public static int[][][] field2721;
	@ObfuscatedName("ec.K")
	public static int field899;
	@ObfuscatedName("fj.p")
	public static int field1202;
	@ObfuscatedName("vi.e")
	public static int[][][] field4429;
	@ObfuscatedName("nh.c")
	public static int field2911;
	@ObfuscatedName("bf.O")
	public static boolean[][] field304;
	@ObfuscatedName("ec.E")
	public static boolean[][] field893;
	@ObfuscatedName("cf.m")
	public static Square[][][] field489;
	@ObfuscatedName("aj.R")
	public static int field152;
	@ObfuscatedName("cb.a")
	public static int field396 = 0;
	@ObfuscatedName("gh.x")
	public static int field1353;
	@ObfuscatedName("ti.x")
	public static int field4048;
	@ObfuscatedName("wb.a")
	public static int field4461;
	@ObfuscatedName("ki.o")
	public static boolean field2145 = false;
	@ObfuscatedName("ke.G")
	public static int field2057 = -1;
	@ObfuscatedName("de.P")
	public static int field698 = 0;
	@ObfuscatedName("da.qb")
	public static int field621 = 0;
	@ObfuscatedName("ib.I")
	public static int field1714 = -1;
	@ObfuscatedName("jf.X")
	public static boolean field1882 = true;
	@ObfuscatedName("na.u")
	public static int field2627;

	@ObfuscatedName("ej.a(Lih;IIIIIIIZ)V")
	public static void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field1353;
		int var11;
		int var12 = var11 = (arg7 << 7) - field4048;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = ClientBuild.field1137[arg1][arg6][arg7] - field4461;
		int var18 = ClientBuild.field1137[arg1][arg6 + 1][arg7] - field4461;
		int var19 = ClientBuild.field1137[arg1][arg6 + 1][arg7 + 1] - field4461;
		int var20 = ClientBuild.field1137[arg1][arg6][arg7 + 1] - field4461;
		int var21 = var12 * arg4 + var10 * arg5 >> 16;
		int var22 = var12 * arg5 - var10 * arg4 >> 16;
		int var24 = var17 * arg3 - var22 * arg2 >> 16;
		int var25 = var17 * arg2 + var22 * arg3 >> 16;
		if (var25 < 50) {
			return;
		}
		int var27 = var11 * arg4 + var14 * arg5 >> 16;
		int var28 = var11 * arg5 - var14 * arg4 >> 16;
		int var30 = var18 * arg3 - var28 * arg2 >> 16;
		int var31 = var18 * arg2 + var28 * arg3 >> 16;
		if (var31 < 50) {
			return;
		}
		int var33 = var16 * arg4 + var13 * arg5 >> 16;
		int var34 = var16 * arg5 - var13 * arg4 >> 16;
		int var36 = var19 * arg3 - var34 * arg2 >> 16;
		int var37 = var19 * arg2 + var34 * arg3 >> 16;
		if (var37 < 50) {
			return;
		}
		int var39 = var15 * arg4 + var9 * arg5 >> 16;
		int var40 = var15 * arg5 - var9 * arg4 >> 16;
		int var42 = var20 * arg3 - var40 * arg2 >> 16;
		int var43 = var20 * arg2 + var40 * arg3 >> 16;
		if (var43 < 50) {
			return;
		}
		int var44 = Pix3D.field3363 + (var21 << 9) / var25;
		int var45 = Pix3D.field3361 + (var24 << 9) / var25;
		int var46 = Pix3D.field3363 + (var27 << 9) / var31;
		int var47 = Pix3D.field3361 + (var30 << 9) / var31;
		int var48 = Pix3D.field3363 + (var33 << 9) / var37;
		int var49 = Pix3D.field3361 + (var36 << 9) / var37;
		int var50 = Pix3D.field3363 + (var39 << 9) / var43;
		int var51 = Pix3D.field3361 + (var42 << 9) / var43;
		Pix3D.field3348 = 0;
		if ((var48 - var50) * (var47 - var51) - (var49 - var51) * (var46 - var50) > 0) {
			if (field2145 && method122(field698 + Pix3D.field3363, field621 + Pix3D.field3361, var49, var51, var47, var48, var50, var46)) {
				field2057 = arg6;
				field1714 = arg7;
			}
			if (!arg8) {
				Pix3D.field3358 = false;
				if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix3D.field3350 || var50 > Pix3D.field3350 || var46 > Pix3D.field3350) {
					Pix3D.field3358 = true;
				}
				if (arg0.field1763 == -1) {
					if (arg0.field1766 != 12345678) {
						Pix3D.method1227(var49, var51, var47, var48, var50, var46, arg0.field1766, arg0.field1759, arg0.field1773);
					}
				} else if (field1882) {
					int var52 = Pix3D.field3356.method438(arg0.field1763);
					Pix3D.method1227(var49, var51, var47, var48, var50, var46, QuickChatCatTypeList.method791(var52, arg0.field1766), QuickChatCatTypeList.method791(var52, arg0.field1759), QuickChatCatTypeList.method791(var52, arg0.field1773));
				} else if (arg0.field1769) {
					Pix3D.method1225(var49, var51, var47, var48, var50, var46, arg0.field1766, arg0.field1759, arg0.field1773, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1763);
				} else {
					Pix3D.method1225(var49, var51, var47, var48, var50, var46, arg0.field1766, arg0.field1759, arg0.field1773, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1763);
				}
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		if (field2145 && method122(field698 + Pix3D.field3363, field621 + Pix3D.field3361, var45, var47, var51, var44, var46, var50)) {
			field2057 = arg6;
			field1714 = arg7;
		}
		if (arg8) {
			return;
		}
		Pix3D.field3358 = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix3D.field3350 || var46 > Pix3D.field3350 || var50 > Pix3D.field3350) {
			Pix3D.field3358 = true;
		}
		if (arg0.field1763 != -1) {
			if (!field1882) {
				Pix3D.method1225(var45, var47, var51, var44, var46, var50, arg0.field1761, arg0.field1773, arg0.field1759, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1763);
				return;
			}
			int var53 = Pix3D.field3356.method438(arg0.field1763);
			Pix3D.method1227(var45, var47, var51, var44, var46, var50, QuickChatCatTypeList.method791(var53, arg0.field1761), QuickChatCatTypeList.method791(var53, arg0.field1773), QuickChatCatTypeList.method791(var53, arg0.field1759));
		} else if (arg0.field1761 != 12345678) {
			Pix3D.method1227(var45, var47, var51, var44, var46, var50, arg0.field1761, arg0.field1773, arg0.field1759);
		}
	}

	@ObfuscatedName("nj.a(IIIIIIII)V")
	public static void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.field204 = arg2 / 128;
		var8.field194 = arg3 / 128;
		var8.field187 = arg4 / 128;
		var8.field200 = arg5 / 128;
		var8.field190 = arg1;
		var8.field185 = arg2;
		var8.field193 = arg3;
		var8.field191 = arg4;
		var8.field205 = arg5;
		var8.field189 = arg6;
		var8.field196 = arg7;
		field1149[arg0][field1148[arg0]++] = var8;
	}

	@ObfuscatedName("b.a(IIIIIIIIIIIIIIIIIIII)V")
	public static void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var20 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var21 = arg0; var21 >= 0; var21--) {
				if (field489[var21][arg1][arg2] == null) {
					field489[var21][arg1][arg2] = new Square(var21, arg1, arg2);
				}
			}
			field489[arg0][arg1][arg2].field947 = var20;
		} else if (arg3 == 1) {
			QuickGround var22 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var23 = arg0; var23 >= 0; var23--) {
				if (field489[var23][arg1][arg2] == null) {
					field489[var23][arg1][arg2] = new Square(var23, arg1, arg2);
				}
			}
			field489[arg0][arg1][arg2].field947 = var22;
		} else {
			Ground var24 = new Ground(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var25 = arg0; var25 >= 0; var25--) {
				if (field489[var25][arg1][arg2] == null) {
					field489[var25][arg1][arg2] = new Square(var25, arg1, arg2);
				}
			}
			field489[arg0][arg1][arg2].field964 = var24;
		}
	}

	@ObfuscatedName("ka.a(IIIILnc;Lnc;IIJ)V")
	public static void method762(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		Wall var10 = new Wall();
		var10.field3028 = arg8;
		var10.field3029 = arg1 * 128 + 64;
		var10.field3023 = arg2 * 128 + 64;
		var10.field3031 = arg3;
		var10.field3021 = arg4;
		var10.field3032 = arg5;
		var10.field3027 = arg6;
		var10.field3024 = arg7;
		for (int var11 = arg0; var11 >= 0; var11--) {
			if (field489[var11][arg1][arg2] == null) {
				field489[var11][arg1][arg2] = new Square(var11, arg1, arg2);
			}
		}
		field489[arg0][arg1][arg2].field959 = var10;
	}

	@ObfuscatedName("qe.a(IIII)V")
	public static void method1277() {
		field211 = new Square[4][104][104];
		field2721 = new int[4][105][105];
		method131();
		field899 = 104;
		field1202 = 104;
		field4429 = new int[4][105][105];
		method579();
		field2911 = 25;
		field304 = new boolean[field2911 + field2911 + 1][field2911 + field2911 + 1];
		field893 = new boolean[field2911 + field2911 + 2][field2911 + field2911 + 2];
	}

	@ObfuscatedName("ca.a(Z)V")
	public static void method131() {
		ClientBuild.field1137 = field2721;
		field489 = field211;
		field152 = field489.length;
	}

	@ObfuscatedName("hh.a()V")
	public static void method579() {
		for (int var0 = 0; var0 < field152; var0++) {
			for (int var1 = 0; var1 < field899; var1++) {
				for (int var2 = 0; var2 < field1202; var2++) {
					field489[var0][var1][var2] = null;
				}
			}
		}
		for (int var3 = 0; var3 < field1147; var3++) {
			for (int var4 = 0; var4 < field1148[var3]; var4++) {
				field1149[var3][var4] = null;
			}
			field1148[var3] = 0;
		}
		for (int var5 = 0; var5 < field396; var5++) {
			field2906[var5] = null;
		}
		field396 = 0;
		for (int var6 = 0; var6 < field4447.length; var6++) {
			field4447[var6] = null;
		}
	}

	@ObfuscatedName("af.a(III)V")
	public static void method42(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field956 = null;
		}
	}

	@ObfuscatedName("sh.a(III)Ljj;")
	public static Sprite method1396(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		if (var3 == null) {
			return null;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			Sprite var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("kc.a(IIIIIIIILnc;IZJ)Z")
	public static boolean method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, long arg11) {
		for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
			for (int var14 = arg2; var14 < arg2 + arg4; var14++) {
				if (var13 < 0 || var14 < 0 || var13 >= field899 || var14 >= field1202) {
					return false;
				}
				Square var15 = field489[arg0][var13][var14];
				if (var15 != null && var15.field962 >= 5) {
					return false;
				}
			}
		}
		Sprite var16 = new Sprite();
		var16.field1948 = arg11;
		var16.field1952 = arg0;
		var16.field1945 = arg5;
		var16.field1949 = arg6;
		var16.field1938 = arg7;
		var16.field1943 = arg8;
		var16.field1939 = arg9;
		var16.field1933 = arg1;
		var16.field1936 = arg2;
		var16.field1940 = arg1 + arg3 - 1;
		var16.field1935 = arg2 + arg4 - 1;
		for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
			for (int var18 = arg2; var18 < arg2 + arg4; var18++) {
				int var19 = 0;
				if (var17 > arg1) {
					var19++;
				}
				if (var17 < arg1 + arg3 - 1) {
					var19 += 4;
				}
				if (var18 > arg2) {
					var19 += 8;
				}
				if (var18 < arg2 + arg4 - 1) {
					var19 += 2;
				}
				for (int var20 = arg0; var20 >= 0; var20--) {
					if (field489[var20][var17][var18] == null) {
						field489[var20][var17][var18] = new Square(var20, var17, var18);
					}
				}
				Square var21 = field489[arg0][var17][var18];
				var21.field963[var21.field962] = var16;
				var21.field957[var21.field962] = var19;
				var21.field954 |= var19;
				var21.field962++;
			}
		}
		if (arg10) {
			field2906[field396++] = var16;
		}
		return true;
	}

	@ObfuscatedName("ui.a(IIIILnc;Lnc;IIIIJ)V")
	public static void method1520(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
		if (arg4 == null) {
			return;
		}
		Decor var12 = new Decor();
		var12.field1158 = arg10;
		var12.field1157 = arg1 * 128 + 64;
		var12.field1161 = arg2 * 128 + 64;
		var12.field1168 = arg3;
		var12.field1159 = arg4;
		var12.field1160 = arg5;
		var12.field1164 = arg6;
		var12.field1172 = arg7;
		var12.field1169 = arg8;
		var12.field1167 = arg9;
		for (int var13 = arg0; var13 >= 0; var13--) {
			if (field489[var13][arg1][arg2] == null) {
				field489[var13][arg1][arg2] = new Square(var13, arg1, arg2);
			}
		}
		field489[arg0][arg1][arg2].field956 = var12;
	}

	@ObfuscatedName("wc.a(Lnc;IIIII)V")
	public static void method1594(ModelSource arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var6 = true;
		int var7 = arg2;
		int var8 = arg2 + arg4;
		int var9 = arg3 - 1;
		int var10 = arg3 + arg5;
		for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
			if (var11 != field152) {
				for (int var12 = var7; var12 <= var8; var12++) {
					if (var12 >= 0 && var12 < field899) {
						for (int var13 = var9; var13 <= var10; var13++) {
							if (var13 >= 0 && var13 < field1202 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && var12 != arg2)) {
								Square var14 = field489[var11][var12][var13];
								if (var14 != null) {
									int var15 = (ClientBuild.field1137[var11][var12][var13] + ClientBuild.field1137[var11][var12 + 1][var13] + ClientBuild.field1137[var11][var12][var13 + 1] + ClientBuild.field1137[var11][var12 + 1][var13 + 1]) / 4 - (ClientBuild.field1137[arg1][arg2][arg3] + ClientBuild.field1137[arg1][arg2 + 1][arg3] + ClientBuild.field1137[arg1][arg2][arg3 + 1] + ClientBuild.field1137[arg1][arg2 + 1][arg3 + 1]) / 4;
									Wall var16 = var14.field959;
									if (var16 != null) {
										if (var16.field3021.method544()) {
											arg0.method570(var16.field3021, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
										}
										if (var16.field3032 != null && var16.field3032.method544()) {
											arg0.method570(var16.field3032, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
										}
									}
									for (int var17 = 0; var17 < var14.field962; var17++) {
										Sprite var18 = var14.field963[var17];
										if (var18 != null && var18.field1943.method544() && (var12 == var18.field1933 || var12 == var7) && (var13 == var18.field1936 || var13 == var9)) {
											int var19 = var18.field1940 + 1 - var18.field1933;
											int var20 = var18.field1935 + 1 - var18.field1936;
											arg0.method570(var18.field1943, (var18.field1933 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1936 - arg3) * 128 + (var20 - arg5) * 64, var6);
										}
									}
								}
							}
						}
					}
				}
				var7--;
				var6 = false;
			}
		}
	}

	@ObfuscatedName("vh.a(IIII)V")
	public static void method1570(int arg0, int arg1, int arg2, int arg3) {
		Square var4 = field489[arg0][arg1][arg2];
		if (var4 != null) {
			field489[arg0][arg1][arg2].field950 = arg3;
		}
	}

	@ObfuscatedName("lf.a(IIIIILnc;IJZ)Z")
	public static boolean method859(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, long arg7, boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		int var10 = arg1 - arg4;
		int var11 = arg2 - arg4;
		int var12 = arg1 + arg4;
		int var13 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				var13 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				var12 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				var11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				var10 -= 128;
			}
		}
		int var14 = var10 / 128;
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		return method768(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@ObfuscatedName("aj.a(III)V")
	public static void method56(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field959 = null;
		}
	}

	@ObfuscatedName("w.a(III)Z")
	public static boolean method1581(int arg0, int arg1, int arg2) {
		int var3 = field4429[arg0][arg1][arg2];
		if (var3 == -field2627) {
			return false;
		} else if (var3 == field2627) {
			return true;
		} else {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			if (method718(var4 + 1, ClientBuild.field1137[arg0][arg1][arg2], var5 + 1) && method718(var4 + 128 - 1, ClientBuild.field1137[arg0][arg1 + 1][arg2], var5 + 1) && method718(var4 + 128 - 1, ClientBuild.field1137[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && method718(var4 + 1, ClientBuild.field1137[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
				field4429[arg0][arg1][arg2] = field2627;
				return true;
			} else {
				field4429[arg0][arg1][arg2] = -field2627;
				return false;
			}
		}
	}

	@ObfuscatedName("ph.a(III)V")
	public static void method1215() {
		for (int var0 = 0; var0 < field152; var0++) {
			for (int var1 = 0; var1 < field899; var1++) {
				for (int var2 = 0; var2 < field1202; var2++) {
					Square var3 = field489[var0][var1][var2];
					if (var3 != null) {
						Wall var4 = var3.field959;
						if (var4 != null && var4.field3021.method544()) {
							method1594(var4.field3021, var0, var1, var2, 1, 1);
							if (var4.field3032 != null && var4.field3032.method544()) {
								method1594(var4.field3032, var0, var1, var2, 1, 1);
								var4.field3021.method570(var4.field3032, 0, 0, 0, false);
								var4.field3032 = var4.field3032.method559();
							}
							var4.field3021 = var4.field3021.method559();
						}
						for (int var5 = 0; var5 < var3.field962; var5++) {
							Sprite var6 = var3.field963[var5];
							if (var6 != null && var6.field1943.method544()) {
								method1594(var6.field1943, var0, var1, var2, var6.field1940 + 1 - var6.field1933, var6.field1935 - var6.field1936 + 1);
								var6.field1943 = var6.field1943.method559();
							}
						}
						GroundDecor var7 = var3.field949;
						if (var7 != null && var7.field3194.method544()) {
							method1018(var7.field3194, var0, var1, var2);
							var7.field3194 = var7.field3194.method559();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ig.a(IIIILnc;JLnc;Lnc;)V")
	public static void method675(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, long arg5, ModelSource arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.field4443 = arg4;
		var9.field4451 = arg1 * 128 + 64;
		var9.field4439 = arg2 * 128 + 64;
		var9.field4444 = arg3;
		var9.field4440 = arg5;
		var9.field4446 = arg6;
		var9.field4448 = arg7;
		int var10 = 0;
		Square var11 = field489[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field962; var12++) {
				Sprite var13 = var11.field963[var12];
				if ((var13.field1948 & 0x400000L) == 4194304L) {
					int var14 = var13.field1943.method88();
					if (var14 != -32768 && var14 < var10) {
						var10 = var14;
					}
				}
			}
		}
		var9.field4435 = -var10;
		if (field489[arg0][arg1][arg2] == null) {
			field489[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		field489[arg0][arg1][arg2].field948 = var9;
	}

	@ObfuscatedName("ng.a(Lnc;III)V")
	public static void method1018(ModelSource arg0, int arg1, int arg2, int arg3) {
		if (arg2 < field899) {
			Square var4 = field489[arg1][arg2 + 1][arg3];
			if (var4 != null && var4.field949 != null && var4.field949.field3194.method544()) {
				arg0.method570(var4.field949.field3194, 128, 0, 0, true);
			}
		}
		if (arg3 < field899) {
			Square var5 = field489[arg1][arg2][arg3 + 1];
			if (var5 != null && var5.field949 != null && var5.field949.field3194.method544()) {
				arg0.method570(var5.field949.field3194, 0, 0, 128, true);
			}
		}
		if (arg2 < field899 && arg3 < field1202) {
			Square var6 = field489[arg1][arg2 + 1][arg3 + 1];
			if (var6 != null && var6.field949 != null && var6.field949.field3194.method544()) {
				arg0.method570(var6.field949.field3194, 128, 0, 128, true);
			}
		}
		if (arg2 < field899 && arg3 > 0) {
			Square var7 = field489[arg1][arg2 + 1][arg3 - 1];
			if (var7 != null && var7.field949 != null && var7.field949.field3194.method544()) {
				arg0.method570(var7.field949.field3194, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("sf.a(IIIJ)Z")
	public static boolean method1386(int arg0, int arg1, int arg2, long arg3) {
		Square var5 = field489[arg0][arg1][arg2];
		if (var5 == null) {
			return false;
		} else if (var5.field959 != null && var5.field959.field3028 == arg3) {
			return true;
		} else if (var5.field956 != null && var5.field956.field1158 == arg3) {
			return true;
		} else if (var5.field949 != null && var5.field949.field3202 == arg3) {
			return true;
		} else {
			for (int var6 = 0; var6 < var5.field962; var6++) {
				if (var5.field963[var6].field1948 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("ki.a(III[[[BIBII)V")
	public static void method803(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, int arg5) {
		field2627++;
		StructType.field3545 = 0;
		int var6 = arg4 - 16;
		int var7 = arg4 + 16;
		int var8 = arg5 - 16;
		int var9 = arg5 + 16;
		for (int var10 = Statics.field3105; var10 < field152; var10++) {
			Square[][] var11 = field489[var10];
			for (int var12 = Statics.field3007; var12 < PacketBit.field84; var12++) {
				for (int var13 = Statics.field1849; var13 < Statics.field4314; var13++) {
					Square var14 = var11[var12][var13];
					if (var14 != null) {
						if (var14.field950 <= Statics.field2993 && field304[var12 + field2911 - Statics.field1435][var13 + field2911 - Statics.field1636] && (arg3 == null || var10 < 0 || arg3[var10][var12][var13] != 0)) {
							var14.field944 = true;
							var14.field965 = true;
							if (var14.field962 > 0) {
								var14.field958 = true;
							} else {
								var14.field958 = false;
							}
							StructType.field3545++;
						} else {
							var14.field944 = false;
							var14.field965 = false;
							var14.field953 = 0;
							if (var14.field963 != null && var12 >= var6 && var12 <= var7 && var13 >= var8 && var13 <= var9) {
								for (int var15 = 0; var15 < var14.field962; var15++) {
									Sprite var16 = var14.field963[var15];
									var16.field1943.method537((var16.field1933 + (var16.field1940 - var16.field1933 >> 1)) * 128 + 64, (var16.field1936 + (var16.field1935 - var16.field1936 >> 1)) * 128 + 64);
								}
							}
						}
					}
				}
			}
		}
		boolean var17 = ClientBuild.field1137 == Statics.field2979;
		for (int var18 = Statics.field3105; var18 < field152; var18++) {
			Square[][] var19 = field489[var18];
			for (int var20 = -field2911; var20 <= 0; var20++) {
				int var21 = Statics.field1435 + var20;
				int var22 = Statics.field1435 - var20;
				if (var21 >= Statics.field3007 || var22 < PacketBit.field84) {
					for (int var23 = -field2911; var23 <= 0; var23++) {
						int var24 = Statics.field1636 + var23;
						int var25 = Statics.field1636 - var23;
						if (var21 >= Statics.field3007) {
							if (var24 >= Statics.field1849) {
								Square var26 = var19[var21][var24];
								if (var26 != null && var26.field944) {
									Statics.method542(var26, true);
								}
							}
							if (var25 < Statics.field4314) {
								Square var27 = var19[var21][var25];
								if (var27 != null && var27.field944) {
									Statics.method542(var27, true);
								}
							}
						}
						if (var22 < PacketBit.field84) {
							if (var24 >= Statics.field1849) {
								Square var28 = var19[var22][var24];
								if (var28 != null && var28.field944) {
									Statics.method542(var28, true);
								}
							}
							if (var25 < Statics.field4314) {
								Square var29 = var19[var22][var25];
								if (var29 != null && var29.field944) {
									Statics.method542(var29, true);
								}
							}
						}
						if (StructType.field3545 == 0) {
							if (!var17) {
								field2145 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (int var30 = Statics.field3105; var30 < field152; var30++) {
			Square[][] var31 = field489[var30];
			for (int var32 = -field2911; var32 <= 0; var32++) {
				int var33 = Statics.field1435 + var32;
				int var34 = Statics.field1435 - var32;
				if (var33 >= Statics.field3007 || var34 < PacketBit.field84) {
					for (int var35 = -field2911; var35 <= 0; var35++) {
						int var36 = Statics.field1636 + var35;
						int var37 = Statics.field1636 - var35;
						if (var33 >= Statics.field3007) {
							if (var36 >= Statics.field1849) {
								Square var38 = var31[var33][var36];
								if (var38 != null && var38.field944) {
									Statics.method542(var38, false);
								}
							}
							if (var37 < Statics.field4314) {
								Square var39 = var31[var33][var37];
								if (var39 != null && var39.field944) {
									Statics.method542(var39, false);
								}
							}
						}
						if (var34 < PacketBit.field84) {
							if (var36 >= Statics.field1849) {
								Square var40 = var31[var34][var36];
								if (var40 != null && var40.field944) {
									Statics.method542(var40, false);
								}
							}
							if (var37 < Statics.field4314) {
								Square var41 = var31[var34][var37];
								if (var41 != null && var41.field944) {
									Statics.method542(var41, false);
								}
							}
						}
						if (StructType.field3545 == 0) {
							if (!var17) {
								field2145 = false;
							}
							return;
						}
					}
				}
			}
		}
		field2145 = false;
	}

	@ObfuscatedName("nb.a(IIII)Z")
	public static boolean method945(int arg0, int arg1, int arg2, int arg3) {
		if (!method1581(arg0, arg1, arg2)) {
			return false;
		}
		int var4 = arg1 << 7;
		int var5 = arg2 << 7;
		int var6 = ClientBuild.field1137[arg0][arg1][arg2] - 1;
		int var7 = var6 - 120;
		int var8 = var6 - 230;
		int var9 = var6 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var4 > field1353) {
					if (!method718(var4, var6, var5)) {
						return false;
					}
					if (!method718(var4, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method718(var4, var7, var5)) {
						return false;
					}
					if (!method718(var4, var7, var5 + 128)) {
						return false;
					}
				}
				if (!method718(var4, var8, var5)) {
					return false;
				}
				if (!method718(var4, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var5 < field4048) {
					if (!method718(var4, var6, var5 + 128)) {
						return false;
					}
					if (!method718(var4 + 128, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method718(var4, var7, var5 + 128)) {
						return false;
					}
					if (!method718(var4 + 128, var7, var5 + 128)) {
						return false;
					}
				}
				if (!method718(var4, var8, var5 + 128)) {
					return false;
				}
				if (!method718(var4 + 128, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var4 < field1353) {
					if (!method718(var4 + 128, var6, var5)) {
						return false;
					}
					if (!method718(var4 + 128, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method718(var4 + 128, var7, var5)) {
						return false;
					}
					if (!method718(var4 + 128, var7, var5 + 128)) {
						return false;
					}
				}
				if (!method718(var4 + 128, var8, var5)) {
					return false;
				}
				if (!method718(var4 + 128, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var5 > field4048) {
					if (!method718(var4, var6, var5)) {
						return false;
					}
					if (!method718(var4 + 128, var6, var5)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!method718(var4, var7, var5)) {
						return false;
					}
					if (!method718(var4 + 128, var7, var5)) {
						return false;
					}
				}
				if (!method718(var4, var8, var5)) {
					return false;
				}
				if (!method718(var4 + 128, var8, var5)) {
					return false;
				}
				return true;
			}
		}
		if (!method718(var4 + 64, var9, var5 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return method718(var4, var8, var5 + 128);
		} else if (arg3 == 32) {
			return method718(var4 + 128, var8, var5 + 128);
		} else if (arg3 == 64) {
			return method718(var4 + 128, var8, var5);
		} else if (arg3 == 128) {
			return method718(var4, var8, var5);
		} else {
			return true;
		}
	}

	@ObfuscatedName("c.a(IIIIIIII)Z")
	public static boolean method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return var8 * var10 > 0 && var10 * var9 > 0;
		}
	}

	@ObfuscatedName("jf.a(III)Z")
	public static boolean method718(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < Statics.field1316; var3++) {
			Occlude var4 = Statics.field3075[var3];
			if (var4.field206 == 1) {
				int var5 = var4.field185 - arg0;
				if (var5 > 0) {
					int var6 = var4.field191 + (var4.field199 * var5 >> 8);
					int var7 = var4.field205 + (var4.field186 * var5 >> 8);
					int var8 = var4.field189 + (var4.field188 * var5 >> 8);
					int var9 = var4.field196 + (var4.field201 * var5 >> 8);
					if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
						return true;
					}
				}
			} else if (var4.field206 == 2) {
				int var10 = arg0 - var4.field185;
				if (var10 > 0) {
					int var11 = var4.field191 + (var4.field199 * var10 >> 8);
					int var12 = var4.field205 + (var4.field186 * var10 >> 8);
					int var13 = var4.field189 + (var4.field188 * var10 >> 8);
					int var14 = var4.field196 + (var4.field201 * var10 >> 8);
					if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
						return true;
					}
				}
			} else if (var4.field206 == 3) {
				int var15 = var4.field191 - arg2;
				if (var15 > 0) {
					int var16 = var4.field185 + (var4.field197 * var15 >> 8);
					int var17 = var4.field193 + (var4.field195 * var15 >> 8);
					int var18 = var4.field189 + (var4.field188 * var15 >> 8);
					int var19 = var4.field196 + (var4.field201 * var15 >> 8);
					if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
						return true;
					}
				}
			} else if (var4.field206 == 4) {
				int var20 = arg2 - var4.field191;
				if (var20 > 0) {
					int var21 = var4.field185 + (var4.field197 * var20 >> 8);
					int var22 = var4.field193 + (var4.field195 * var20 >> 8);
					int var23 = var4.field189 + (var4.field188 * var20 >> 8);
					int var24 = var4.field196 + (var4.field201 * var20 >> 8);
					if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
						return true;
					}
				}
			} else if (var4.field206 == 5) {
				int var25 = arg1 - var4.field189;
				if (var25 > 0) {
					int var26 = var4.field185 + (var4.field197 * var25 >> 8);
					int var27 = var4.field193 + (var4.field195 * var25 >> 8);
					int var28 = var4.field191 + (var4.field199 * var25 >> 8);
					int var29 = var4.field205 + (var4.field186 * var25 >> 8);
					if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@ObfuscatedName("oe.a(II)V")
	public static void method1063(int arg0, int arg1) {
		Square var2 = field489[0][arg0][arg1];
		for (int var3 = 0; var3 < 3; var3++) {
			Square var4 = field489[var3][arg0][arg1] = field489[var3 + 1][arg0][arg1];
			if (var4 != null) {
				var4.field966--;
				for (int var5 = 0; var5 < var4.field962; var5++) {
					Sprite var6 = var4.field963[var5];
					if ((var6.field1948 >> 29 & 0x3L) == 2L && var6.field1933 == arg0 && var6.field1936 == arg1) {
						var6.field1952--;
					}
				}
			}
		}
		if (field489[0][arg0][arg1] == null) {
			field489[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		field489[0][arg0][arg1].field951 = var2;
		field489[3][arg0][arg1] = null;
	}

	@ObfuscatedName("ka.a()V")
	public static void method763() {
		for (int var0 = 0; var0 < field396; var0++) {
			Sprite var1 = field2906[var0];
			Statics.method915(var1);
			field2906[var0] = null;
		}
		field396 = 0;
	}

	@ObfuscatedName("da.a(IIIILnc;JZ)V")
	public static void method232(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, long arg5, boolean arg6) {
		if (arg4 == null) {
			return;
		}
		GroundDecor var8 = new GroundDecor();
		var8.field3194 = arg4;
		var8.field3197 = arg1 * 128 + 64;
		var8.field3190 = arg2 * 128 + 64;
		var8.field3193 = arg3;
		var8.field3202 = arg5;
		if (field489[arg0][arg1][arg2] == null) {
			field489[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		field489[arg0][arg1][arg2].field949 = var8;
	}

	@ObfuscatedName("kd.a(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= field899 * 128) {
			arg0 = field899 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= field1202 * 128) {
			arg2 = field1202 * 128 - 1;
		}
		Statics.field1803 = Pix3D.field3359[arg3];
		Statics.field3838 = Pix3D.field3354[arg3];
		Statics.field3242 = Pix3D.field3359[arg4];
		Statics.field3066 = Pix3D.field3354[arg4];
		field1353 = arg0;
		field4461 = arg1;
		field4048 = arg2;
		Statics.field1435 = arg0 / 128;
		Statics.field1636 = arg2 / 128;
		Statics.field2993 = arg5;
		Statics.field3007 = Statics.field1435 - field2911;
		if (Statics.field3007 < 0) {
			Statics.field3007 = 0;
		}
		Statics.field1849 = Statics.field1636 - field2911;
		if (Statics.field1849 < 0) {
			Statics.field1849 = 0;
		}
		PacketBit.field84 = Statics.field1435 + field2911;
		if (PacketBit.field84 > field899) {
			PacketBit.field84 = field899;
		}
		Statics.field4314 = Statics.field1636 + field2911;
		if (Statics.field4314 > field1202) {
			Statics.field4314 = field1202;
		}
		for (int var14 = 0; var14 < field2911 + field2911 + 2; var14++) {
			for (int var15 = 0; var15 < field2911 + field2911 + 2; var15++) {
				int var16 = (var14 - field2911 << 7) - (field1353 & 0x7F);
				int var17 = (var15 - field2911 << 7) - (field4048 & 0x7F);
				int var18 = Statics.field1435 + var14 - field2911;
				int var19 = Statics.field1636 + var15 - field2911;
				if (var18 >= 0 && var19 >= 0 && var18 < field899 && var19 < field1202) {
					int var20;
					if (Statics.field2979 == null) {
						var20 = field2721[0][var18][var19] + 128 - field4461;
					} else {
						var20 = Statics.field2979[0][var18][var19] + 128 - field4461;
					}
					int var21 = field2721[3][var18][var19] - field4461 - 1000;
					field893[var14][var15] = Statics.method1389(var16, var21, var20, var17);
				} else {
					field893[var14][var15] = false;
				}
			}
		}
		for (int var22 = 0; var22 < field2911 + field2911 + 1; var22++) {
			for (int var23 = 0; var23 < field2911 + field2911 + 1; var23++) {
				field304[var22][var23] = field893[var22][var23] || field893[var22 + 1][var23] || field893[var22][var23 + 1] || field893[var22 + 1][var23 + 1];
			}
		}
		Statics.field4510 = arg7;
		Statics.field740 = arg8;
		Statics.field3605 = arg9;
		Statics.field2713 = arg10;
		Statics.field3882 = arg11;
		Statics.method1331();
		method803(arg0, arg1, arg2, arg6, arg12, arg13);
	}

	@ObfuscatedName("dj.e(I)V")
	public static void method281(int arg0) {
		Statics.field3105 = arg0;
		for (int var1 = 0; var1 < field899; var1++) {
			for (int var2 = 0; var2 < field1202; var2++) {
				if (field489[arg0][var1][var2] == null) {
					field489[arg0][var1][var2] = new Square(arg0, var1, var2);
				}
			}
		}
	}

	@ObfuscatedName("wf.a(IIII)V")
	public static void method1602(int arg0, int arg1, int arg2, int arg3) {
		Square var4 = field489[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		Decor var5 = var4.field956;
		if (var5 != null) {
			var5.field1169 = var5.field1169 * arg3 / 16;
			var5.field1167 = var5.field1167 * arg3 / 16;
		}
	}

	@ObfuscatedName("gh.c(III)J")
	public static long method501(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		return var3 == null || var3.field949 == null ? 0L : var3.field949.field3202;
	}

	@ObfuscatedName("kc.a(III)J")
	public static long method770(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		if (var3 == null) {
			return 0L;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			Sprite var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				return var5.field1948;
			}
		}
		return 0L;
	}

	@ObfuscatedName("nd.a(III)V")
	public static void method974(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		if (var3 == null) {
			return;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			Sprite var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				Statics.method915(var5);
				return;
			}
		}
	}

	@ObfuscatedName("oi.a(III)J")
	public static long method1082(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		return var3 == null || var3.field956 == null ? 0L : var3.field956.field1158;
	}

	@ObfuscatedName("oe.a(III)J")
	public static long method1062(int arg0, int arg1, int arg2) {
		Square var3 = field489[arg0][arg1][arg2];
		return var3 == null || var3.field959 == null ? 0L : var3.field959.field3028;
	}
}
