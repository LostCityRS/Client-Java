package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.FloType;
import jagex3.config.FluType;
import jagex3.config.LocType;
import jagex3.dash3d.*;
import jagex3.io.BZip2State;
import jagex3.io.Packet;

@ObfuscatedName("lc")
public final class ClientBuild {

	@ObfuscatedName("of.y")
	public static int[][][] field2426;
	@ObfuscatedName("eb.c")
	public static int[][] field590;
	@ObfuscatedName("jf.c")
	public static int[] field1592;
	@ObfuscatedName("ed.s")
	public static int[] field698;
	@ObfuscatedName("mb.h")
	public static byte[][][] field1985;
	@ObfuscatedName("pb.db")
	public static int[] field2511;
	@ObfuscatedName("ve.u")
	public static int minusedlevel = 99;
	@ObfuscatedName("ud.W")
	public static int[] field3272;
	@ObfuscatedName("qf.M")
	public static byte[][][] field2814;
	@ObfuscatedName("q.Yc")
	public static byte[][][] field2612;
	@ObfuscatedName("fa.L")
	public static int[] field894;
	@ObfuscatedName("tb.p")
	public static byte[][][] field3123;
	@ObfuscatedName("tb.v")
	public static byte[][][] field3129;
	@ObfuscatedName("ka.Ic")
	public static int[][][] groundh = new int[4][105][105];
	@ObfuscatedName("ab.v")
	public static byte[][][] mapl = new byte[4][104][104];
	@ObfuscatedName("fe.C")
	public static int[] field955 = new int[] { -1, -1, 1, 1 };
	@ObfuscatedName("te.d")
	public static int[] field3176 = new int[] { 1, 2, 4, 8 };
	@ObfuscatedName("rc.W")
	public static int[] field2877 = new int[] { 16, 32, 64, 128 };
	@ObfuscatedName("sd.e")
	public static int[] field2974 = new int[] { 1, 0, -1, 0 };
	@ObfuscatedName("ud.db")
	public static int[] field3279 = new int[] { 1, -1, -1, 1 };
	@ObfuscatedName("qd.uc")
	public static int field2764 = (int) (Math.random() * 33.0D) - 16;
	@ObfuscatedName("he.m")
	public static int field1276 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("lc.a(IIIII)V")
	public static void fadeAdjacent(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = arg0; var4 <= arg2 + arg0; var4++) {
			for (int var5 = arg1; var5 <= arg3 + arg1; var5++) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					field1985[0][var5][var4] = 127;
					if (arg1 == var5 && var5 > 0) {
						groundh[0][var5][var4] = groundh[0][var5 - 1][var4];
					}
					if (var5 == arg1 + arg3 && var5 < 103) {
						groundh[0][var5][var4] = groundh[0][var5 + 1][var4];
					}
					if (arg0 == var4 && var4 > 0) {
						groundh[0][var5][var4] = groundh[0][var5][var4 - 1];
					}
					if (var4 == arg0 + arg2 && var4 < 103) {
						groundh[0][var5][var4] = groundh[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("lc.a(B)V")
	public static void init() {
		field2426 = new int[4][105][105];
		field590 = new int[105][105];
		field1592 = new int[104];
		field698 = new int[104];
		field1985 = new byte[4][105][105];
		field2511 = new int[104];
		minusedlevel = 99;
		field3272 = new int[104];
		field2814 = new byte[4][104][104];
		field2612 = new byte[4][104][104];
		field894 = new int[104];
		field3123 = new byte[4][104][104];
		field3129 = new byte[4][104][104];
	}

	@ObfuscatedName("s.a(IIB)I")
	public static int method983(int arg0, int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		int var2 = (arg1 & 0x7F) * arg0 / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return var2 + (arg1 & 0xFF80);
	}

	@ObfuscatedName("pc.a([BIIII[Lqf;I)V")
	public static void loadGround(byte[] arg0, int arg1, int arg2, int arg3, CollisionMap[] arg4, int arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (var7 + arg5 > 0 && var7 + arg5 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
						arg4[var6].field2811[var7 + arg5][var8 + arg2] &= 0xFEFFFFFF;
					}
				}
			}
		}
		Packet var9 = new Packet(arg0);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					method1025(var9, var10, arg1, 0, arg2 + var12, arg5 + var11, arg3);
				}
			}
		}
	}

	@ObfuscatedName("o.b(III)I")
	public static int noise(int arg0, int arg1) {
		int var2 = arg1 + arg0 * 57;
		int var3 = var2 ^ var2 << 13;
		int var4 = Integer.MAX_VALUE & var3 * (var3 * 15731 * var3 + 789221) + 1376312589;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("bc.a(III)I")
	public static int method62(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 + -1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + -1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1) + noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1);
		int var4 = noise(arg0, arg1);
		return var3 / 8 + var2 / 16 + var4 / 4;
	}

	@ObfuscatedName("pe.a(Lvd;IIIILqf;IIB)V")
	public static void method868(World arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap arg5, int arg6, int arg7) {
		if (Client.lowMem && (mapl[0][arg7][arg1] & 0x2) == 0) {
			if ((mapl[arg6][arg7][arg1] & 0x10) != 0) {
				return;
			}
			if (method287(arg6, arg1, arg7) != Client.lastBuiltLevel) {
				return;
			}
		}
		if (minusedlevel > arg6) {
			minusedlevel = arg6;
		}
		LocType var8 = LocType.list(arg3);
		int var9;
		int var10;
		if (arg4 == 1 || arg4 == 3) {
			var9 = var8.field1233;
			var10 = var8.field1222;
		} else {
			var9 = var8.field1222;
			var10 = var8.field1233;
		}
		int var11;
		int var12;
		if (arg7 + var9 > 104) {
			var11 = arg7;
			var12 = arg7 + 1;
		} else {
			var12 = (var9 + 1 >> 1) + arg7;
			var11 = arg7 + (var9 >> 1);
		}
		int var13;
		int var14;
		if (var10 + arg1 <= 104) {
			var13 = (var10 + 1 >> 1) + arg1;
			var14 = arg1 + (var10 >> 1);
		} else {
			var13 = arg1 + 1;
			var14 = arg1;
		}
		int[][] var15 = groundh[arg6];
		int var16 = (var9 << 6) + (arg7 << 7);
		int var17 = (var10 << 6) + (arg1 << 7);
		int var18 = (arg3 << 14) + (arg1 << 7) + arg7 + 1073741824;
		if (var8.field1193 == 0) {
			var18 += Integer.MIN_VALUE;
		}
		int var19 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
		int var20 = arg2 + (arg4 << 6);
		if (var8.field1252 == 1) {
			var20 += 256;
		}
		if (var8.method411()) {
			World.method603(arg4, var8, arg6, arg7, arg1);
		}
		if (arg2 == 22) {
			if (!Client.lowMem || var8.field1193 != 0 || var8.field1235 == 1 || var8.field1204) {
				ModelSource var21;
				if (var8.field1225 == -1 && var8.field1251 == null) {
					var21 = var8.method421(var17, var19, arg4, var15, var16, 22);
				} else {
					var21 = new ClientLocAnim(arg3, 22, arg4, arg6, arg7, arg1, var8.field1225, true, null);
				}
				arg0.method1138(arg6, arg7, arg1, var19, var21, var18, var20);
				if (var8.field1235 == 1 && arg5 != null) {
					arg5.method931(arg7, arg1);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			ModelSource var22;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var22 = var8.method421(var17, var19, arg4, var15, var16, 10);
			} else {
				var22 = new ClientLocAnim(arg3, 10, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			if (var22 != null && arg0.method1151(arg6, arg7, arg1, var19, var9, var10, var22, arg2 == 11 ? 256 : 0, var18, var20) && var8.field1253) {
				int var23 = 15;
				if (var22 instanceof ModelLit) {
					var23 = ((ModelLit) var22).method816() / 4;
					if (var23 > 30) {
						var23 = 30;
					}
				}
				for (int var24 = 0; var24 <= var9; var24++) {
					for (int var25 = 0; var25 <= var10; var25++) {
						if (field1985[arg6][arg7 + var24][var25 + arg1] < var23) {
							field1985[arg6][var24 + arg7][arg1 + var25] = (byte) var23;
						}
					}
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method914(var10, var8.field1219, arg7, arg1, var9);
			}
		} else if (arg2 >= 12) {
			ModelSource var26;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var26 = var8.method421(var17, var19, arg4, var15, var16, arg2);
			} else {
				var26 = new ClientLocAnim(arg3, arg2, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1151(arg6, arg7, arg1, var19, 1, 1, var26, 0, var18, var20);
			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg6 > 0) {
				field2426[arg6][arg7][arg1] |= 0x924;
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method914(var10, var8.field1219, arg7, arg1, var9);
			}
		} else if (arg2 == 0) {
			ModelSource var27;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var27 = var8.method421(var17, var19, arg4, var15, var16, 0);
			} else {
				var27 = new ClientLocAnim(arg3, 0, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var27, null, field3176[arg4], 0, var18, var20);
			if (arg4 == 0) {
				if (var8.field1253) {
					field1985[arg6][arg7][arg1] = 50;
					field1985[arg6][arg7][arg1 + 1] = 50;
				}
				if (var8.field1210) {
					field2426[arg6][arg7][arg1] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var8.field1253) {
					field1985[arg6][arg7][arg1 + 1] = 50;
					field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				}
				if (var8.field1210) {
					field2426[arg6][arg7][arg1 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var8.field1253) {
					field1985[arg6][arg7 + 1][arg1] = 50;
					field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				}
				if (var8.field1210) {
					field2426[arg6][arg7 + 1][arg1] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var8.field1253) {
					field1985[arg6][arg7][arg1] = 50;
					field1985[arg6][arg7 + 1][arg1] = 50;
				}
				if (var8.field1210) {
					field2426[arg6][arg7][arg1] |= 0x492;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
			if (var8.field1245 != 16) {
				arg0.method1152(arg6, arg7, arg1, var8.field1245);
			}
		} else if (arg2 == 1) {
			ModelSource var28;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var28 = var8.method421(var17, var19, arg4, var15, var16, 1);
			} else {
				var28 = new ClientLocAnim(arg3, 1, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var28, null, field2877[arg4], 0, var18, var20);
			if (var8.field1253) {
				if (arg4 == 0) {
					field1985[arg6][arg7][arg1 + 1] = 50;
				} else if (arg4 == 1) {
					field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				} else if (arg4 == 2) {
					field1985[arg6][arg7 + 1][arg1] = 50;
				} else if (arg4 == 3) {
					field1985[arg6][arg7][arg1] = 50;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
		} else if (arg2 == 2) {
			int var29 = arg4 + 1 & 0x3;
			ModelSource var30;
			ModelSource var31;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var30 = var8.method421(var17, var19, arg4 + 4, var15, var16, 2);
				var31 = var8.method421(var17, var19, var29, var15, var16, 2);
			} else {
				var30 = new ClientLocAnim(arg3, 2, arg4 + 4, arg6, arg7, arg1, var8.field1225, true, null);
				var31 = new ClientLocAnim(arg3, 2, var29, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var30, var31, field3176[arg4], field3176[var29], var18, var20);
			if (var8.field1210) {
				if (arg4 == 0) {
					field2426[arg6][arg7][arg1] |= 0x249;
					field2426[arg6][arg7][arg1 + 1] |= 0x492;
				} else if (arg4 == 1) {
					field2426[arg6][arg7][arg1 + 1] |= 0x492;
					field2426[arg6][arg7 + 1][arg1] |= 0x249;
				} else if (arg4 == 2) {
					field2426[arg6][arg7 + 1][arg1] |= 0x249;
					field2426[arg6][arg7][arg1] |= 0x492;
				} else if (arg4 == 3) {
					field2426[arg6][arg7][arg1] |= 0x492;
					field2426[arg6][arg7][arg1] |= 0x249;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
			if (var8.field1245 != 16) {
				arg0.method1152(arg6, arg7, arg1, var8.field1245);
			}
		} else if (arg2 == 3) {
			ModelSource var32;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var32 = var8.method421(var17, var19, arg4, var15, var16, 3);
			} else {
				var32 = new ClientLocAnim(arg3, 3, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var32, null, field2877[arg4], 0, var18, var20);
			if (var8.field1253) {
				if (arg4 == 0) {
					field1985[arg6][arg7][arg1 + 1] = 50;
				} else if (arg4 == 1) {
					field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				} else if (arg4 == 2) {
					field1985[arg6][arg7 + 1][arg1] = 50;
				} else if (arg4 == 3) {
					field1985[arg6][arg7][arg1] = 50;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
		} else if (arg2 == 9) {
			ModelSource var33;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var33 = var8.method421(var17, var19, arg4, var15, var16, arg2);
			} else {
				var33 = new ClientLocAnim(arg3, arg2, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1151(arg6, arg7, arg1, var19, 1, 1, var33, 0, var18, var20);
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method914(var10, var8.field1219, arg7, arg1, var9);
			}
			if (var8.field1245 != 16) {
				arg0.method1152(arg6, arg7, arg1, var8.field1245);
			}
		} else if (arg2 == 4) {
			ModelSource var34;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var34 = var8.method421(var17, var19, arg4, var15, var16, 4);
			} else {
				var34 = new ClientLocAnim(arg3, 4, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var34, null, field3176[arg4], 0, 0, 0, var18, var20);
		} else if (arg2 == 5) {
			int var35 = 16;
			int var36 = arg0.method1153(arg6, arg7, arg1);
			if (var36 != 0) {
				var35 = LocType.list(var36 >> 14 & 0x7FFF).field1245;
			}
			ModelSource var37;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var37 = var8.method421(var17, var19, arg4, var15, var16, 4);
			} else {
				var37 = new ClientLocAnim(arg3, 4, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var37, null, field3176[arg4], 0, var35 * field2974[arg4], var35 * BZip2State.field1927[arg4], var18, var20);
		} else if (arg2 == 6) {
			int var38 = 8;
			int var39 = arg0.method1153(arg6, arg7, arg1);
			if (var39 != 0) {
				var38 = LocType.list(var39 >> 14 & 0x7FFF).field1245 / 2;
			}
			ModelSource var40;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var40 = var8.method421(var17, var19, arg4 + 4, var15, var16, 4);
			} else {
				var40 = new ClientLocAnim(arg3, 4, arg4 + 4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var40, null, 256, arg4, field3279[arg4] * var38, var38 * field955[arg4], var18, var20);
		} else if (arg2 == 7) {
			int var41 = arg4 + 2 & 0x3;
			ModelSource var42;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var42 = var8.method421(var17, var19, var41 + 4, var15, var16, 4);
			} else {
				var42 = new ClientLocAnim(arg3, 4, var41 + 4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var42, null, 256, var41, 0, 0, var18, var20);
		} else if (arg2 == 8) {
			int var43 = 8;
			int var44 = arg0.method1153(arg6, arg7, arg1);
			if (var44 != 0) {
				var43 = LocType.list(var44 >> 14 & 0x7FFF).field1245 / 2;
			}
			int var45 = arg4 + 2 & 0x3;
			ModelSource var46;
			ModelSource var47;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var46 = var8.method421(var17, var19, arg4 + 4, var15, var16, 4);
				var47 = var8.method421(var17, var19, var45 + 4, var15, var16, 4);
			} else {
				var46 = new ClientLocAnim(arg3, 4, arg4 + 4, arg6, arg7, arg1, var8.field1225, true, null);
				var47 = new ClientLocAnim(arg3, 4, var45 + 4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var46, var47, 256, arg4, field3279[arg4] * var43, var43 * field955[arg4], var18, var20);
		}
	}

	@ObfuscatedName("jd.a(IILvd;IIILqf;III)V")
	public static void method537(int arg0, int arg1, World arg2, int arg3, int arg4, int arg5, CollisionMap arg6, int arg7, int arg8) {
		LocType var9 = LocType.list(arg0);
		int var10;
		int var11;
		if (arg8 == 1 || arg8 == 3) {
			var10 = var9.field1222;
			var11 = var9.field1233;
		} else {
			var11 = var9.field1222;
			var10 = var9.field1233;
		}
		int var12;
		int var13;
		if (arg5 + var11 <= 104) {
			var12 = (var11 + 1 >> 1) + arg5;
			var13 = (var11 >> 1) + arg5;
		} else {
			var12 = arg5 + 1;
			var13 = arg5;
		}
		int var14;
		int var15;
		if (var10 + arg3 > 104) {
			var14 = arg3 + 1;
			var15 = arg3;
		} else {
			var15 = arg3 + (var10 >> 1);
			var14 = (var10 + 1 >> 1) + arg3;
		}
		int[][] var16 = groundh[arg4];
		int var17 = var16[var12][var14] + var16[var12][var15] + var16[var13][var15] + var16[var13][var14] >> 2;
		int var18 = (var10 << 6) + (arg3 << 7);
		int var19 = (var11 << 6) + (arg5 << 7);
		int var20 = (arg0 << 14) + (arg3 << 7) + arg5 + 1073741824;
		if (var9.field1193 == 0) {
			var20 += Integer.MIN_VALUE;
		}
		int var21 = (arg8 << 6) + arg1;
		if (var9.field1252 == 1) {
			var21 += 256;
		}
		if (arg1 == 22) {
			ModelSource var22;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var22 = var9.method412(var19, 22, var18, var16, arg8, var17);
			} else {
				var22 = new ClientLocAnim(arg0, 22, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1138(arg7, arg5, arg3, var17, var22, var20, var21);
			if (var9.field1235 == 1) {
				arg6.method931(arg5, arg3);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			ModelSource var23;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var23 = var9.method412(var19, 10, var18, var16, arg8, var17);
			} else {
				var23 = new ClientLocAnim(arg0, 10, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			if (var23 != null) {
				arg2.method1151(arg7, arg5, arg3, var17, var11, var10, var23, arg1 == 11 ? 256 : 0, var20, var21);
			}
			if (var9.field1235 != 0) {
				arg6.method914(var10, var9.field1219, arg5, arg3, var11);
			}
		} else if (arg1 >= 12) {
			ModelSource var24;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var24 = var9.method412(var19, arg1, var18, var16, arg8, var17);
			} else {
				var24 = new ClientLocAnim(arg0, arg1, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1151(arg7, arg5, arg3, var17, 1, 1, var24, 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method914(var10, var9.field1219, arg5, arg3, var11);
			}
		} else if (arg1 == 0) {
			ModelSource var25;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var25 = var9.method412(var19, 0, var18, var16, arg8, var17);
			} else {
				var25 = new ClientLocAnim(arg0, 0, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var25, null, field3176[arg8], 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 1) {
			ModelSource var26;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var26 = var9.method412(var19, 1, var18, var16, arg8, var17);
			} else {
				var26 = new ClientLocAnim(arg0, 1, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var26, null, field2877[arg8], 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 2) {
			int var27 = arg8 + 1 & 0x3;
			ModelSource var28;
			ModelSource var29;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var28 = var9.method412(var19, 2, var18, var16, arg8 + 4, var17);
				var29 = var9.method412(var19, 2, var18, var16, var27, var17);
			} else {
				var28 = new ClientLocAnim(arg0, 2, arg8 + 4, arg4, arg5, arg3, var9.field1225, true, null);
				var29 = new ClientLocAnim(arg0, 2, var27, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var28, var29, field3176[arg8], field3176[var27], var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 3) {
			ModelSource var30;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var30 = var9.method412(var19, 3, var18, var16, arg8, var17);
			} else {
				var30 = new ClientLocAnim(arg0, 3, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var30, null, field2877[arg8], 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 9) {
			ModelSource var31;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var31 = var9.method412(var19, arg1, var18, var16, arg8, var17);
			} else {
				var31 = new ClientLocAnim(arg0, arg1, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1151(arg7, arg5, arg3, var17, 1, 1, var31, 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method914(var10, var9.field1219, arg5, arg3, var11);
			}
		} else if (arg1 == 4) {
			ModelSource var32;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var32 = var9.method412(var19, 4, var18, var16, arg8, var17);
			} else {
				var32 = new ClientLocAnim(arg0, 4, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var32, null, field3176[arg8], 0, 0, 0, var20, var21);
		} else if (arg1 == 5) {
			int var33 = arg2.method1153(arg7, arg5, arg3);
			int var34 = 16;
			if (var33 != 0) {
				var34 = LocType.list(var33 >> 14 & 0x7FFF).field1245;
			}
			ModelSource var35;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var35 = var9.method412(var19, 4, var18, var16, arg8, var17);
			} else {
				var35 = new ClientLocAnim(arg0, 4, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var35, null, field3176[arg8], 0, var34 * field2974[arg8], var34 * BZip2State.field1927[arg8], var20, var21);
		} else if (arg1 == 6) {
			int var36 = 8;
			int var37 = arg2.method1153(arg7, arg5, arg3);
			if (var37 != 0) {
				var36 = LocType.list(var37 >> 14 & 0x7FFF).field1245 / 2;
			}
			ModelSource var38;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var38 = var9.method412(var19, 4, var18, var16, arg8 + 4, var17);
			} else {
				var38 = new ClientLocAnim(arg0, 4, arg8 + 4, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var38, null, 256, arg8, field3279[arg8] * var36, var36 * field955[arg8], var20, var21);
		} else if (arg1 == 7) {
			int var39 = arg8 + 2 & 0x3;
			ModelSource var40;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var40 = var9.method412(var19, 4, var18, var16, var39 + 4, var17);
			} else {
				var40 = new ClientLocAnim(arg0, 4, var39 + 4, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var40, null, 256, var39, 0, 0, var20, var21);
		} else if (arg1 == 8) {
			int var41 = 8;
			int var42 = arg2.method1153(arg7, arg5, arg3);
			if (var42 != 0) {
				var41 = LocType.list(var42 >> 14 & 0x7FFF).field1245 / 2;
			}
			int var43 = arg8 + 2 & 0x3;
			ModelSource var44;
			ModelSource var45;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var44 = var9.method412(var19, 4, var18, var16, arg8 + 4, var17);
				var45 = var9.method412(var19, 4, var18, var16, var43 + 4, var17);
			} else {
				var44 = new ClientLocAnim(arg0, 4, arg8 + 4, arg4, arg5, arg3, var9.field1225, true, null);
				var45 = new ClientLocAnim(arg0, 4, var43 + 4, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var44, var45, 256, arg8, var41 * field3279[arg8], var41 * field955[arg8], var20, var21);
		}
	}

	@ObfuscatedName("bf.a(ZII)I")
	public static int method80(int arg0, int arg1) {
		int var2 = method9(arg0 + 91923, 4, arg1 + 45365) + (method9(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (method9(arg0, 1, arg1) - 128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("bf.a(IZ[BI)Z")
	public static boolean method76(int arg0, byte[] arg1, int arg2) {
		Packet var3 = new Packet(arg1);
		int var4 = -1;
		boolean var5 = true;
		label54: while (true) {
			int var6 = var3.gsmart();
			if (var6 == 0) {
				return var5;
			}
			var4 += var6;
			boolean var7 = false;
			int var8 = 0;
			while (true) {
				while (!var7) {
					int var10 = var3.gsmart();
					if (var10 == 0) {
						continue label54;
					}
					var8 += var10 - 1;
					int var11 = var8 >> 6 & 0x3F;
					int var12 = var11 + arg0;
					int var13 = var3.g1() >> 2;
					int var14 = var8 & 0x3F;
					int var15 = var14 + arg2;
					if (var12 > 0 && var15 > 0 && var12 < 103 && var15 < 103) {
						LocType var16 = LocType.list(var4);
						if (var13 != 22 || !Client.lowMem || var16.field1193 != 0 || var16.field1235 == 1 || var16.field1204) {
							var7 = true;
							if (!var16.method414()) {
								Client.locModelLoadCount++;
								var5 = false;
							}
						}
					}
				}
				int var9 = var3.gsmart();
				if (var9 == 0) {
					break;
				}
				var3.g1();
			}
		}
	}

	@ObfuscatedName("qf.a(Z)V")
	public static void quit() {
		field3129 = null;
		field3123 = null;
		field1985 = null;
		field1592 = null;
		field894 = null;
		field2612 = null;
		field2511 = null;
		field2426 = null;
		field3272 = null;
		field2814 = null;
		field698 = null;
		field590 = null;
	}

	@ObfuscatedName("ia.a(IIIB)V")
	public static void autoGroundRegion(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				groundh[arg2][arg0 + var3][var4 + arg1] = 0;
			}
		}
		if (arg0 > 0) {
			for (int var5 = 1; var5 < 8; var5++) {
				groundh[arg2][arg0][var5 + arg1] = groundh[arg2][arg0 - 1][arg1 + var5];
			}
		}
		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				groundh[arg2][var6 + arg0][arg1] = groundh[arg2][var6 + arg0][arg1 - 1];
			}
		}
		if (arg0 > 0 && groundh[arg2][arg0 - 1][arg1] != 0) {
			groundh[arg2][arg0][arg1] = groundh[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && groundh[arg2][arg0][arg1 - 1] != 0) {
			groundh[arg2][arg0][arg1] = groundh[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && groundh[arg2][arg0 - 1][arg1 - 1] != 0) {
			groundh[arg2][arg0][arg1] = groundh[arg2][arg0 - 1][arg1 - 1];
		}
	}

    @ObfuscatedName("we.a(II[BIIIILvd;I[Lqf;I)V")
    public static void loadLocationsRegion(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, World arg6, int arg7, CollisionMap[] arg8, int arg9) {
        Packet var10 = new Packet(arg1);
        int var11 = -1;
        while (true) {
            int var12 = var10.gsmart();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.gsmart();
                if (var14 == 0) {
                    break;
                }
                int var15 = var10.g1();
                var13 += var14 - 1;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 & 0x3F;
                int var18 = var15 & 0x3;
                int var19 = var13 >> 12;
                int var20 = var15 >> 2;
                if (arg2 == var19 && arg9 <= var16 && var16 < arg9 + 8 && arg3 <= var17 && var17 < arg3 + 8) {
                    LocType var21 = LocType.list(var11);
                    int var22 = arg5 + RegionRotate.method1079(var17 & 0x7, var21.field1233, var18, var21.field1222, var16 & 0x7, arg7);
                    int var23 = RegionRotate.method582(var18, var17 & 0x7, arg7, var21.field1233, var21.field1222, var16 & 0x7) + arg4;
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg0;
                        if ((mapl[1][var22][var23] & 0x2) == 2) {
                            var24 = arg0 - 1;
                        }
                        CollisionMap var25 = null;
                        if (var24 >= 0) {
                            var25 = arg8[var24];
                        }
                        method868(arg6, var23, var20, var11, arg7 + var18 & 0x3, var25, arg0, var22);
                    }
                }
            }
        }
    }

	@ObfuscatedName("i.a(III)I")
	public static int getOCol(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			int var2 = (arg0 & 0x7F) * arg1 / 128;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return var2 + (arg0 & 0xFF80);
		}
	}

	@ObfuscatedName("oc.a(IIII)I")
	public static int getTable(int arg0, int arg1, int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg2 / 32 << 7) + (arg0 / 4 << 10);
	}

	@ObfuscatedName("tb.a(Ljd;IIIIIII)V")
	public static void method1025(Packet arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				int var7 = arg0.g1();
				if (var7 == 0) {
					return;
				}
				if (var7 == 1) {
					arg0.g1();
					return;
				}
				if (var7 <= 49) {
					arg0.g1();
				}
			}
		}
		mapl[arg1][arg5][arg4] = 0;
		while (true) {
			int var8 = arg0.g1();
			if (var8 == 0) {
				if (arg1 == 0) {
					groundh[0][arg5][arg4] = -method80(arg2 + arg4 + 556238, arg5 + 932731 - -arg6) * 8;
					return;
				} else {
					groundh[arg1][arg5][arg4] = groundh[arg1 - 1][arg5][arg4] - 240;
					return;
				}
			}
			if (var8 == 1) {
				int var9 = arg0.g1();
				if (var9 == 1) {
					var9 = 0;
				}
				if (arg1 == 0) {
					groundh[0][arg5][arg4] = -var9 * 8;
					return;
				}
				groundh[arg1][arg5][arg4] = groundh[arg1 - 1][arg5][arg4] - var9 * 8;
				return;
			}
			if (var8 <= 49) {
				field2612[arg1][arg5][arg4] = arg0.g1b();
				field3129[arg1][arg5][arg4] = (byte) ((var8 - 2) / 4);
				field3123[arg1][arg5][arg4] = (byte) (arg3 + var8 - 2 & 0x3);
			} else if (var8 <= 81) {
				mapl[arg1][arg5][arg4] = (byte) (var8 - 49);
			} else {
				field2814[arg1][arg5][arg4] = (byte) (var8 - 81);
			}
		}
	}

	@ObfuscatedName("ge.a(IIIII[Lqf;B[BII)V")
	public static void loadGroundRegion(int arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap[] arg5, byte[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (var9 + arg2 > 0 && arg2 + var9 < 103 && arg1 + var10 > 0 && var10 + arg1 < 103) {
					arg5[arg8].field2811[arg2 + var9][var10 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		Packet var11 = new Packet(arg6);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (var12 == arg4 && arg0 <= var13 && var13 < arg0 + 8 && arg3 <= var14 && arg3 + 8 > var14) {
						method1025(var11, arg8, 0, arg7, RegionRotate.method281(arg7, var14 & 0x7, var13 & 0x7) + arg1, RegionRotate.method318(arg7, var13 & 0x7, var14 & 0x7) + arg2, 0);
					} else {
						method1025(var11, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.a(IIII)I")
	public static int method9(int arg0, int arg1, int arg2) {
		int var3 = arg2 / arg1;
		int var4 = arg0 / arg1;
		int var5 = arg1 - 1 & arg2;
		int var6 = arg1 - 1 & arg0;
		int var7 = method62(var4, var3);
		int var8 = method62(var4, var3 + 1);
		int var9 = method62(var4 + 1, var3);
		int var10 = method62(var4 + 1, var3 - -1);
		int var11 = method1005(arg1, var5, var8, var7);
		int var12 = method1005(arg1, var5, var10, var9);
		return method1005(arg1, var6, var12, var11);
	}

	@ObfuscatedName("ld.a(ILvd;[B[Lqf;II)V")
	public static void method634(int arg0, World arg1, byte[] arg2, CollisionMap[] arg3, int arg4) {
		int var5 = -1;
		Packet var6 = new Packet(arg2);
		while (true) {
			int var7 = var6.gsmart();
			if (var7 == 0) {
				return;
			}
			var5 += var7;
			int var8 = 0;
			while (true) {
				int var9 = var6.gsmart();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 >> 6 & 0x3F;
				int var11 = var8 & 0x3F;
				int var12 = var8 >> 12;
				int var13 = var6.g1();
				int var14 = var13 >> 2;
				int var15 = var13 & 0x3;
				int var16 = arg0 + var10;
				int var17 = arg4 + var11;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((mapl[1][var16][var17] & 0x2) == 2) {
						var18 = var12 - 1;
					}
					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = arg3[var18];
					}
					method868(arg1, var17, var14, var5, var15, var19, var12, var16);
				}
			}
		}
	}

	@ObfuscatedName("jc.a([Lqf;ILvd;)V")
	public static void finishBuild(CollisionMap[] arg0, World arg1) {
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 104; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					if ((mapl[var2][var3][var4] & 0x1) == 1) {
						int var5 = var2;
						if ((mapl[1][var3][var4] & 0x2) == 2) {
							var5 = var2 - 1;
						}
						if (var5 >= 0) {
							arg0[var5].method917(var3, var4);
						}
					}
				}
			}
		}
		field2764 += (int) (Math.random() * 5.0D) - 2;
		field1276 += (int) (Math.random() * 5.0D) - 2;
		if (field2764 < -16) {
			field2764 = -16;
		}
		if (field1276 < -8) {
			field1276 = -8;
		}
		if (field1276 > 8) {
			field1276 = 8;
		}
		if (field2764 > 16) {
			field2764 = 16;
		}
		for (int var6 = 0; var6 < 4; var6++) {
			byte[][] var7 = field1985[var6];
			int var8 = (int) Math.sqrt(5100.0D);
			int var9 = var8 * 768 >> 8;
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					int var12 = groundh[var6][var11][var10 + 1] - groundh[var6][var11][var10 - 1];
					int var13 = groundh[var6][var11 + 1][var10] - groundh[var6][var11 - 1][var10];
					int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
					int var15 = (var13 << 8) / var14;
					int var16 = (var7[var11][var10 + 1] >> 3) + ((var7[var11 - 1][var10] >> 2) - (-(var7[var11 + 1][var10] >> 3) - (var7[var11][var10 - 1] >> 2) - (var7[var11][var10] >> 1)));
					int var17 = 65536 / var14;
					int var18 = (var12 << 8) / var14;
					int var19 = (var17 * -10 + var15 * -50 + var18 * -50) / var9 + 96;
					field590[var11][var10] = var19 - var16;
				}
			}
			for (int var20 = 0; var20 < 104; var20++) {
				field894[var20] = 0;
				field1592[var20] = 0;
				field2511[var20] = 0;
				field698[var20] = 0;
				field3272[var20] = 0;
			}
			for (int var21 = -5; var21 < 109; var21++) {
				for (int var22 = 0; var22 < 104; var22++) {
					int var23 = var21 + 5;
					int var10002;
					if (var23 >= 0 && var23 < 104) {
						int var24 = field2814[var6][var23][var22] & 0xFF;
						if (var24 > 0) {
							FluType var25 = FluType.method1177(var24 - 1);
							field894[var22] += var25.field722;
							field1592[var22] += var25.field706;
							field2511[var22] += var25.field704;
							field698[var22] += var25.field724;
							var10002 = field3272[var22]++;
						}
					}
					int var26 = var21 - 5;
					if (var26 >= 0 && var26 < 104) {
						int var27 = field2814[var6][var26][var22] & 0xFF;
						if (var27 > 0) {
							FluType var28 = FluType.method1177(var27 - 1);
							field894[var22] -= var28.field722;
							field1592[var22] -= var28.field706;
							field2511[var22] -= var28.field704;
							field698[var22] -= var28.field724;
							var10002 = field3272[var22]--;
						}
					}
				}
				if (var21 >= 1 && var21 < 103) {
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					int var32 = 0;
					int var33 = 0;
					for (int var34 = -5; var34 < 109; var34++) {
						int var35 = var34 + 5;
						if (var35 >= 0 && var35 < 104) {
							var32 += field698[var35];
							var30 += field1592[var35];
							var33 += field3272[var35];
							var29 += field894[var35];
							var31 += field2511[var35];
						}
						int var36 = var34 - 5;
						if (var36 >= 0 && var36 < 104) {
							var29 -= field894[var36];
							var32 -= field698[var36];
							var30 -= field1592[var36];
							var31 -= field2511[var36];
							var33 -= field3272[var36];
						}
						if (var34 >= 1 && var34 < 103 && (!Client.lowMem || (mapl[0][var21][var34] & 0x2) != 0 || (mapl[var6][var21][var34] & 0x10) == 0 && method287(var6, var34, var21) == Client.lastBuiltLevel)) {
							if (minusedlevel > var6) {
								minusedlevel = var6;
							}
							int var37 = field2814[var6][var21][var34] & 0xFF;
							int var38 = field2612[var6][var21][var34] & 0xFF;
							if (var37 > 0 || var38 > 0) {
								int var39 = groundh[var6][var21][var34];
								int var40 = groundh[var6][var21 + 1][var34];
								int var41 = groundh[var6][var21 + 1][var34 + 1];
								int var42 = groundh[var6][var21][var34 + 1];
								int var43 = field590[var21][var34];
								int var44 = field590[var21 + 1][var34 + 1];
								int var45 = field590[var21 + 1][var34];
								int var46 = -1;
								int var47 = -1;
								int var48 = field590[var21][var34 + 1];
								if (var37 > 0) {
									int var49 = var30 / var33;
									int var50 = var31 / var33;
									int var51 = var29 * 256 / var32;
									var46 = getTable(var51, var50, var49);
									int var52 = var50 + field2764;
									if (var52 < 0) {
										var52 = 0;
									} else if (var52 > 255) {
										var52 = 255;
									}
									int var53 = field1276 + var51 & 0xFF;
									var47 = getTable(var53, var52, var49);
								}
								if (var6 > 0) {
									boolean var54 = true;
									if (var37 == 0 && field3129[var6][var21][var34] != 0) {
										var54 = false;
									}
									if (var38 > 0 && !FloType.method396(var38 - 1).field1338) {
										var54 = false;
									}
									if (var54 && var39 == var40 && var41 == var39 && var42 == var39) {
										field2426[var6][var21][var34] |= 0x924;
									}
								}
								int var55 = 0;
								if (var47 != -1) {
									var55 = Pix3D.field123[method983(96, var47)];
								}
								if (var38 == 0) {
									arg1.method1144(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method983(var43, var46), method983(var45, var46), method983(var44, var46), method983(var48, var46), 0, 0, 0, 0, var55, 0);
								} else {
									int var56 = field3129[var6][var21][var34] + 1;
									byte var57 = field3123[var6][var21][var34];
									FloType var58 = FloType.method396(var38 - 1);
									int var59 = var58.field1336;
									int var60;
									int var61;
									if (var59 >= 0) {
										var61 = -1;
										var60 = Pix3D.field126.method558(var59);
									} else if (var58.field1316 == 16711935) {
										var59 = -1;
										var60 = -2;
										var61 = -2;
									} else {
										var61 = getTable(var58.field1332, var58.field1330, var58.field1333);
										int var62 = field1276 + var58.field1332 & 0xFF;
										int var63 = field2764 + var58.field1330;
										if (var63 < 0) {
											var63 = 0;
										} else if (var63 > 255) {
											var63 = 255;
										}
										var60 = getTable(var62, var63, var58.field1333);
									}
									int var64 = 0;
									if (var60 != -2) {
										var64 = Pix3D.field123[getOCol(var60, 96)];
									}
									if (var58.field1312 != -1) {
										int var65 = var58.field1335 + field1276 & 0xFF;
										int var66 = var58.field1322 + field2764;
										if (var66 < 0) {
											var66 = 0;
										} else if (var66 > 255) {
											var66 = 255;
										}
										int var67 = getTable(var65, var66, var58.field1315);
										var64 = Pix3D.field123[getOCol(var67, 96)];
									}
									arg1.method1144(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method983(var43, var46), method983(var45, var46), method983(var44, var46), method983(var48, var46), getOCol(var61, var43), getOCol(var61, var45), getOCol(var61, var44), getOCol(var61, var48), var55, var64);
								}
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					arg1.method1122(var6, var69, var68, method287(var6, var68, var69));
				}
			}
			field2814[var6] = null;
			field2612[var6] = null;
			field3129[var6] = null;
			field3123[var6] = null;
			field1985[var6] = null;
		}
		arg1.method1140();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((mapl[1][var70][var71] & 0x2) == 2) {
					arg1.method1157(var70, var71);
				}
			}
		}
		int var72 = 1;
		int var73 = 2;
		int var74 = 4;
		for (int var75 = 0; var75 < 4; var75++) {
			if (var75 > 0) {
				var74 <<= 0x3;
				var73 <<= 0x3;
				var72 <<= 0x3;
			}
			for (int var76 = 0; var76 <= var75; var76++) {
				for (int var77 = 0; var77 <= 104; var77++) {
					for (int var78 = 0; var78 <= 104; var78++) {
						if ((field2426[var76][var78][var77] & var72) != 0) {
							int var79;
							for (var79 = var77; var79 > 0 && (var72 & field2426[var76][var78][var79 - 1]) != 0; var79--) {
							}
							int var80;
							for (var80 = var77; var80 < 104 && (var72 & field2426[var76][var78][var80 + 1]) != 0; var80++) {
							}
							int var81 = var76;
							int var82;
							label347: for (var82 = var76; var82 > 0; var82--) {
								for (int var83 = var79; var83 <= var80; var83++) {
									if ((field2426[var82 - 1][var78][var83] & var72) == 0) {
										break label347;
									}
								}
							}
							label336: while (var81 < var75) {
								for (int var84 = var79; var84 <= var80; var84++) {
									if ((field2426[var81 + 1][var78][var84] & var72) == 0) {
										break label336;
									}
								}
								var81++;
							}
							int var85 = (var81 + 1 - var82) * (var80 + 1 - var79);
							if (var85 >= 8) {
								int var86 = groundh[var81][var78][var79] - 240;
								int var87 = groundh[var82][var78][var79];
								World.method1145(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var86, var87);
								for (int var88 = var82; var88 <= var81; var88++) {
									for (int var89 = var79; var89 <= var80; var89++) {
										field2426[var88][var78][var89] &= ~var72;
									}
								}
							}
						}
						if ((var73 & field2426[var76][var78][var77]) != 0) {
							int var90 = var78;
							int var91 = var78;
							while (var90 > 0 && (field2426[var76][var90 - 1][var77] & var73) != 0) {
								var90--;
							}
							int var92 = var76;
							while (var91 < 104 && (var73 & field2426[var76][var91 + 1][var77]) != 0) {
								var91++;
							}
							int var93 = var76;
							label402: while (var92 > 0) {
								for (int var94 = var90; var94 <= var91; var94++) {
									if ((field2426[var92 - 1][var94][var77] & var73) == 0) {
										break label402;
									}
								}
								var92--;
							}
							label391: while (var93 < var75) {
								for (int var95 = var90; var95 <= var91; var95++) {
									if ((field2426[var93 + 1][var95][var77] & var73) == 0) {
										break label391;
									}
								}
								var93++;
							}
							int var96 = (var91 + 1 - var90) * (var93 + 1 - var92);
							if (var96 >= 8) {
								int var97 = groundh[var93][var90][var77] - 240;
								int var98 = groundh[var92][var90][var77];
								World.method1145(var75, 2, var90 * 128, var91 * 128 + 128, var77 * 128, var77 * 128, var97, var98);
								for (int var99 = var92; var99 <= var93; var99++) {
									for (int var100 = var90; var100 <= var91; var100++) {
										field2426[var99][var100][var77] &= ~var73;
									}
								}
							}
						}
						if ((field2426[var76][var78][var77] & var74) != 0) {
							int var101 = var78;
							int var102;
							for (var102 = var77; var102 < 104 && (var74 & field2426[var76][var78][var102 + 1]) != 0; var102++) {
							}
							int var103 = var77;
							int var104 = var78;
							while (var103 > 0 && (field2426[var76][var78][var103 - 1] & var74) != 0) {
								var103--;
							}
							label457: while (var101 > 0) {
								for (int var105 = var103; var105 <= var102; var105++) {
									if ((var74 & field2426[var76][var101 - 1][var105]) == 0) {
										break label457;
									}
								}
								var101--;
							}
							label446: while (var104 < 104) {
								for (int var106 = var103; var106 <= var102; var106++) {
									if ((var74 & field2426[var76][var104 + 1][var106]) == 0) {
										break label446;
									}
								}
								var104++;
							}
							if ((var102 + 1 - var103) * (var104 + 1 - var101) >= 4) {
								int var107 = groundh[var76][var101][var103];
								World.method1145(var75, 4, var101 * 128, var104 * 128 + 128, var103 * 128, var102 * 128 + 128, var107, var107);
								for (int var108 = var101; var108 <= var104; var108++) {
									for (int var109 = var103; var109 <= var102; var109++) {
										field2426[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ee.a(IIII)I")
	public static int method287(int arg0, int arg1, int arg2) {
		if ((mapl[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (mapl[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("sf.a(IIIII)I")
	public static int method1005(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.field121[arg1 * 1024 / arg0] >> 1;
		return (var4 * arg2 >> 16) + (arg3 * (65536 - var4) >> 16);
	}
}
