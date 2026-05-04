package deob;

@ObfuscatedName("ue")
public final class class223 {

	@ObfuscatedName("ue.a")
	public static final class88 field4193 = class208.method1423(105, "Unerwartete Antwort vom Anmelde)2Server");

	@ObfuscatedName("ue.d")
	public static int field4196 = 0;

	@ObfuscatedName("ue.f")
	public static int field4198 = 0;

	@ObfuscatedName("ue.g")
	public static int field4199 = 0;

	@ObfuscatedName("ue.i")
	public static class22 field4201;

	@ObfuscatedName("ue.j")
	public static final class88 field4202 = class208.method1423(105, "Please try using a different world)3");

	@ObfuscatedName("ue.b")
	public static class88 field4194 = field4202;

	@ObfuscatedName("ue.e")
	public static class88 field4197 = field4202;

	@ObfuscatedName("ue.h")
	public static class88 field4200 = field4202;

	@ObfuscatedName("ue.n")
	public static class88 field4206 = field4202;

	@ObfuscatedName("ue.o")
	public static class88 field4207 = field4202;

	@ObfuscatedName("ue.p")
	public static final class88 field4208 = class208.method1423(105, "overlay2)3dat");

	@ObfuscatedName("ue.q")
	public static class88 field4209 = field4202;

	@ObfuscatedName("ue.s")
	public static int field4211 = 127;

	@ObfuscatedName("ue.t")
	public static int field4212;

	@ObfuscatedName("ue.u")
	public static final class88 field4213 = class208.method1423(105, "Your account is already logged in)3");

	@ObfuscatedName("ue.m")
	public static class88 field4205 = field4213;

	@ObfuscatedName("ue.a(Li;IILi;)V")
	public static void method1499(class88 arg0, int arg1, class88 arg2) {
		class118.method801(arg0, -1, arg2, arg1, null);
	}

	@ObfuscatedName("ue.a(IIIIIIIII)V")
	public static void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg5 - arg6;
		int var9 = arg7 - arg4;
		int var10 = (arg2 - arg1 << 16) / var8;
		int var11 = (arg3 - arg0 << 16) / var9;
		boolean var12;
		if (class54.field1012 > 0 && class54.field1012 % 10 < 5) {
			var12 = true;
		} else {
			var12 = false;
		}
		for (int var13 = 0; var13 < var8; var13++) {
			int var14 = var10 * (var13 + 1) >> 16;
			int var15 = var13 * var10 >> 16;
			int var16 = var14 - var15;
			if (var16 > 0) {
				int[][] var17 = class48.field895[var13 + arg6 >> 6];
				int var18 = var15 + arg1;
				for (int var19 = 0; var19 < var9; var19++) {
					int var20 = (var19 + 1) * var11 >> 16;
					int var21 = var19 * var11 >> 16;
					int var22 = var20 - var21;
					if (var22 > 0) {
						int var23 = var21 + arg0;
						int var24 = var19 + arg4 >> 6;
						if (var17[var24] != null) {
							int var25 = (var13 + arg6 & 0x3F) + ((var19 + arg4 & 0x3F) << 6);
							int var26 = var17[var24][var25];
							if (var26 != 0) {
								class148 var27 = class190.method1321(var26 - 1);
								if (var12 && class44.field772 == var27.field2817) {
									class65 var28 = new class65();
									var28.field1179 = var18;
									var28.field1180 = var27.field2817;
									var28.field1175 = var23;
									class45.field783.method1622(var28);
								}
								class31.field505[var27.field2817].method1155(var18 - 7, var23 + -7);
							}
						}
					}
				}
			}
		}
		if (class59.field1110 == class150.field2915) {
			for (class244 var29 = (class244) class159.field3049.method1610(); var29 != null; var29 = (class244) class159.field3049.method1619()) {
				int var30 = var29.field4483;
				int var31 = var30 - class16.field239;
				int var32 = var29.field4485;
				int var33 = class119.field2181 + class44.field760 - var32;
				int var34 = arg1 + (arg2 - arg1) * (var31 - arg6) / (arg5 - arg6);
				int var35 = (var33 - arg4) * (arg3 - arg0) / (arg7 - arg4) + arg0;
				int var36 = var29.field4492;
				int var37 = 16777215;
				class75 var38 = null;
				if (var36 == 0) {
					if (class59.field1110 == 3.0D) {
						var38 = class12.field175;
					}
					if (class59.field1110 == 4.0D) {
						var38 = class118.field2147;
					}
					if (class59.field1110 == 6.0D) {
						var38 = class236.field4397;
					}
					if (class59.field1110 == 8.0D) {
						var38 = class196.field3762;
					}
				}
				if (var36 == 1) {
					if (class59.field1110 == 3.0D) {
						var38 = class236.field4397;
					}
					if (class59.field1110 == 4.0D) {
						var38 = class196.field3762;
					}
					if (class59.field1110 == 6.0D) {
						var38 = class167.field3205;
					}
					if (class59.field1110 == 8.0D) {
						var38 = class166.field3199;
					}
				}
				if (var36 == 2) {
					var37 = 16755200;
					if (class59.field1110 == 3.0D) {
						var38 = class167.field3205;
					}
					if (class59.field1110 == 4.0D) {
						var38 = class166.field3199;
					}
					if (class59.field1110 == 6.0D) {
						var38 = class231.field4325;
					}
					if (class59.field1110 == 8.0D) {
						var38 = class227.field4250;
					}
				}
				if (var38 != null) {
					class88[] var39 = var29.field4490;
					int var40 = var39.length;
					int var41 = var35 - var38.method508() * (var40 - 1) / 2;
					int var42 = var41 + var38.method505() / 2;
					for (int var43 = 0; var43 < var40; var43++) {
						var38.method511(var39[var43], var34, var42, var37);
						var42 += var38.method508();
					}
				}
			}
		}
		for (class65 var44 = (class65) class45.field783.method1610(); var44 != null; var44 = (class65) class45.field783.method1619()) {
			class31.field505[var44.field1180].method1155(var44.field1179 - 7, var44.field1175 + -7);
			class72.method483(var44.field1179, var44.field1175, 15, 16776960, 128);
			class72.method483(var44.field1179, var44.field1175, 7, 16777215, 256);
		}
		class45.field783.method1616();
	}

	@ObfuscatedName("ue.a(IIIIZI)V")
	public static void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var5 = arg3; var5 <= arg4; var5++) {
			class230.method1534(arg0, arg1, arg2, class3.field42[var5]);
		}
	}

	@ObfuscatedName("ue.a(BZIZIIZIILia;II)V")
	public static void method1503(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class89 arg7, int arg8, int arg9) {
		if (arg4 && (class116.field2098[0][arg9][arg8] & 0x2) == 0) {
			if ((class116.field2098[arg1][arg9][arg8] & 0x10) != 0) {
				return;
			}
			if (class234.method1555(arg8, arg9, arg1) != class157.field3026) {
				return;
			}
		}
		if (arg1 < class28.field468) {
			class28.field468 = arg1;
		}
		class148 var10 = class190.method1321(arg5);
		int var11;
		int var12;
		if (arg2 == 1 || arg2 == 3) {
			var11 = var10.field2794;
			var12 = var10.field2774;
		} else {
			var12 = var10.field2794;
			var11 = var10.field2774;
		}
		int var13;
		int var14;
		if (var11 + arg9 <= 104) {
			var13 = (var11 >> 1) + arg9;
			var14 = (var11 + 1 >> 1) + arg9;
		} else {
			var13 = arg9;
			var14 = arg9 + 1;
		}
		int var15;
		int var16;
		if (arg8 + var12 > 104) {
			var15 = arg8;
			var16 = arg8 + 1;
		} else {
			var15 = (var12 >> 1) + arg8;
			var16 = arg8 + (var12 + 1 >> 1);
		}
		int[][] var17 = class62.field1137[arg6];
		int var18 = (var11 << 6) + (arg9 << 7);
		int var19 = var17[var14][var16] + var17[var13][var16] + var17[var14][var15] + var17[var13][var15] >> 2;
		int var20 = (var12 << 6) + (arg8 << 7);
		int[][] var21 = null;
		long var22 = (long) ((arg2 | 0x400) << 20 | arg3 << 14 | arg8 << 7 | arg9);
		if (var10.field2833 == 0) {
			var22 |= Long.MIN_VALUE;
		}
		if (arg6 < 3) {
			var21 = class62.field1137[arg6 + 1];
		}
		if (var10.field2780 == 1) {
			var22 |= 0x400000L;
		}
		long var24 = var22 | (long) arg5 << 32;
		if (arg0 && var10.method994()) {
			class17.method84(arg9, arg1, arg2, arg8, var10);
		}
		if (arg3 == 22) {
			if (!arg4 || var10.field2833 != 0 || var10.field2819 == 1 || var10.field2826) {
				class145 var27;
				if (var10.field2810 == -1 && var10.field2770 == null) {
					class210 var26 = var10.method997(22, var21, var17, var18, arg0, var20, arg2, var19);
					var27 = var26.field3984;
				} else {
					var27 = new class81(arg5, 22, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
				}
				class35.method232(arg1, arg9, arg8, var19, var27, var24, var10.field2799);
				if (var10.field2819 == 1 && arg7 != null) {
					arg7.method646(arg8, arg9);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			class145 var29;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var28 = var10.method997(10, var21, var17, var18, arg0, var20, arg2, var19);
				var29 = var28.field3984;
			} else {
				var29 = new class81(arg5, 10, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			if (var29 != null) {
				boolean var30 = class53.method390(arg1, arg9, arg8, var19, var11, var12, var29, arg3 == 11 ? 256 : 0, var24);
				if (var10.field2782 && var30 && arg0) {
					int var31 = 15;
					if (var29 instanceof class30) {
						var31 = ((class30) var29).method192() / 4;
						if (var31 > 30) {
							var31 = 30;
						}
					}
					for (int var32 = 0; var32 <= var11; var32++) {
						for (int var33 = 0; var33 <= var12; var33++) {
							if (var31 > class111.field2020[arg1][arg9 + var32][var33 + arg8]) {
								class111.field2020[arg1][arg9 + var32][var33 + arg8] = (byte) var31;
							}
						}
					}
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method644(var11, var12, var10.field2789, arg9, arg8);
			}
		} else if (arg3 >= 12) {
			class145 var35;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var34 = var10.method997(arg3, var21, var17, var18, arg0, var20, arg2, var19);
				var35 = var34.field3984;
			} else {
				var35 = new class81(arg5, arg3, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class53.method390(arg1, arg9, arg8, var19, 1, 1, var35, 0, var24);
			if (arg0 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
				class135.field2511[arg1][arg9][arg8] |= 0x924;
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method644(var11, var12, var10.field2789, arg9, arg8);
			}
		} else if (arg3 == 0) {
			class145 var36;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var37 = var10.method997(0, var21, var17, var18, arg0, var20, arg2, var19);
				var36 = var37.field3984;
			} else {
				var36 = new class81(arg5, 0, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class110.method762(arg1, arg9, arg8, var19, var36, null, class208.field3949[arg2], 0, var24);
			if (arg0) {
				if (arg2 == 0) {
					if (var10.field2782) {
						class111.field2020[arg1][arg9][arg8] = 50;
						class111.field2020[arg1][arg9][arg8 + 1] = 50;
					}
					if (var10.field2772) {
						class135.field2511[arg1][arg9][arg8] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (var10.field2782) {
						class111.field2020[arg1][arg9][arg8 + 1] = 50;
						class111.field2020[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (var10.field2772) {
						class135.field2511[arg1][arg9][arg8 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (var10.field2782) {
						class111.field2020[arg1][arg9 + 1][arg8] = 50;
						class111.field2020[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (var10.field2772) {
						class135.field2511[arg1][arg9 + 1][arg8] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (var10.field2782) {
						class111.field2020[arg1][arg9][arg8] = 50;
						class111.field2020[arg1][arg9 + 1][arg8] = 50;
					}
					if (var10.field2772) {
						class135.field2511[arg1][arg9][arg8] |= 0x492;
					}
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
			if (var10.field2805 != 16) {
				class245.method1602(arg1, arg9, arg8, var10.field2805);
			}
		} else if (arg3 == 1) {
			class145 var38;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var39 = var10.method997(1, var21, var17, var18, arg0, var20, arg2, var19);
				var38 = var39.field3984;
			} else {
				var38 = new class81(arg5, 1, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class110.method762(arg1, arg9, arg8, var19, var38, null, class238.field4427[arg2], 0, var24);
			if (var10.field2782 && arg0) {
				if (arg2 == 0) {
					class111.field2020[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					class111.field2020[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					class111.field2020[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					class111.field2020[arg1][arg9][arg8] = 50;
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
		} else if (arg3 == 2) {
			int var40 = arg2 + 1 & 0x3;
			class145 var41;
			class145 var42;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var43 = var10.method997(2, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var41 = var43.field3984;
				class210 var44 = var10.method997(2, var21, var17, var18, arg0, var20, var40, var19);
				var42 = var44.field3984;
			} else {
				var41 = new class81(arg5, 2, arg2 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
				var42 = new class81(arg5, 2, var40, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class110.method762(arg1, arg9, arg8, var19, var41, var42, class208.field3949[arg2], class208.field3949[var40], var24);
			if (var10.field2772 && arg0) {
				if (arg2 == 0) {
					class135.field2511[arg1][arg9][arg8] |= 0x249;
					class135.field2511[arg1][arg9][arg8 + 1] |= 0x492;
				} else if (arg2 == 1) {
					class135.field2511[arg1][arg9][arg8 + 1] |= 0x492;
					class135.field2511[arg1][arg9 + 1][arg8] |= 0x249;
				} else if (arg2 == 2) {
					class135.field2511[arg1][arg9 + 1][arg8] |= 0x249;
					class135.field2511[arg1][arg9][arg8] |= 0x492;
				} else if (arg2 == 3) {
					class135.field2511[arg1][arg9][arg8] |= 0x492;
					class135.field2511[arg1][arg9][arg8] |= 0x249;
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
			if (var10.field2805 != 16) {
				class245.method1602(arg1, arg9, arg8, var10.field2805);
			}
		} else if (arg3 == 3) {
			class145 var46;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var45 = var10.method997(3, var21, var17, var18, arg0, var20, arg2, var19);
				var46 = var45.field3984;
			} else {
				var46 = new class81(arg5, 3, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class110.method762(arg1, arg9, arg8, var19, var46, null, class238.field4427[arg2], 0, var24);
			if (var10.field2782 && arg0) {
				if (arg2 == 0) {
					class111.field2020[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					class111.field2020[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					class111.field2020[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					class111.field2020[arg1][arg9][arg8] = 50;
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
		} else if (arg3 == 9) {
			class145 var47;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var48 = var10.method997(arg3, var21, var17, var18, arg0, var20, arg2, var19);
				var47 = var48.field3984;
			} else {
				var47 = new class81(arg5, arg3, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class53.method390(arg1, arg9, arg8, var19, 1, 1, var47, 0, var24);
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method644(var11, var12, var10.field2789, arg9, arg8);
			}
			if (var10.field2805 != 16) {
				class245.method1602(arg1, arg9, arg8, var10.field2805);
			}
		} else if (arg3 == 4) {
			class145 var49;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var50 = var10.method997(4, var21, var17, var18, arg0, var20, arg2, var19);
				var49 = var50.field3984;
			} else {
				var49 = new class81(arg5, 4, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class227.method1520(arg1, arg9, arg8, var19, var49, null, class208.field3949[arg2], 0, 0, 0, var24);
		} else if (arg3 == 5) {
			int var51 = 16;
			long var52 = class157.method1062(arg1, arg9, arg8);
			if (var52 != 0L) {
				var51 = class190.method1321((int) (var52 >>> 32) & Integer.MAX_VALUE).field2805;
			}
			class145 var54;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var55 = var10.method997(4, var21, var17, var18, arg0, var20, arg2, var19);
				var54 = var55.field3984;
			} else {
				var54 = new class81(arg5, 4, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class227.method1520(arg1, arg9, arg8, var19, var54, null, class208.field3949[arg2], 0, var51 * class13.field198[arg2], var51 * class86.field1557[arg2], var24);
		} else if (arg3 == 6) {
			int var56 = 8;
			long var57 = class157.method1062(arg1, arg9, arg8);
			if (var57 != 0L) {
				var56 = class190.method1321(Integer.MAX_VALUE & (int) (var57 >>> 32)).field2805 / 2;
			}
			class145 var59;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var60 = var10.method997(4, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var59 = var60.field3984;
			} else {
				var59 = new class81(arg5, 4, arg2 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class227.method1520(arg1, arg9, arg8, var19, var59, null, 256, arg2, class168.field3240[arg2] * var56, class33.field551[arg2] * var56, var24);
		} else if (arg3 == 7) {
			int var61 = arg2 + 2 & 0x3;
			class145 var63;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var62 = var10.method997(4, var21, var17, var18, arg0, var20, var61 + 4, var19);
				var63 = var62.field3984;
			} else {
				var63 = new class81(arg5, 4, var61 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class227.method1520(arg1, arg9, arg8, var19, var63, null, 256, var61, 0, 0, var24);
		} else if (arg3 == 8) {
			int var64 = 8;
			long var65 = class157.method1062(arg1, arg9, arg8);
			if (var65 != 0L) {
				var64 = class190.method1321((int) (var65 >>> 32) & Integer.MAX_VALUE).field2805 / 2;
			}
			int var67 = arg2 + 2 & 0x3;
			class145 var68;
			class145 var69;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var70 = var10.method997(4, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var68 = var70.field3984;
				class210 var71 = var10.method997(4, var21, var17, var18, arg0, var20, var67 + 4, var19);
				var69 = var71.field3984;
			} else {
				var68 = new class81(arg5, 4, arg2 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
				var69 = new class81(arg5, 4, var67 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			class227.method1520(arg1, arg9, arg8, var19, var68, var69, 256, arg2, class168.field3240[arg2] * var64, var64 * class33.field551[arg2], var24);
		}
	}
}
