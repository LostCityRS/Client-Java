package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;
import jagex3.util.IntMath;

@ObfuscatedName("mb")
public final class TextureOpVector extends TextureOp {

	@ObfuscatedName("b.p")
	public static int field183 = 100;
	@ObfuscatedName("g.e")
	public static int field1207 = 0;
	@ObfuscatedName("ed.i")
	public static int field919 = 0;
	@ObfuscatedName("bf.o")
	public static int field279 = 100;
	@ObfuscatedName("ab.q")
	public static int[][] field42;
	@ObfuscatedName("cf.f")
	public static int[] field482;
	@ObfuscatedName("mb.ab")
	public TextureOpSubShape[] drawCommands;

	public TextureOpVector() {
		super(0, true);
	}

	@ObfuscatedName("vi.a(IBIII)V")
	public static void method1575(int arg0, int arg1) {
		field183 = arg1;
		field1207 = 0;
		field919 = 0;
		field279 = arg0;
	}

	@ObfuscatedName("bj.a([[IB)V")
	public static void method114(int[][] arg0) {
		field42 = arg0;
	}

	@ObfuscatedName("lb.a(IIIIIIB)V")
	public static void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method906(arg3);
		int var6 = 0;
		int var7 = arg3 - arg5;
		if (var7 < 0) {
			var7 = 0;
		}
		int var8 = arg3;
		int var9 = -arg3;
		int var10 = var7;
		if (field919 <= arg1 && arg1 <= field279) {
			int[] var11 = field42[arg1];
			int var12 = IntMath.method1058(field1207, field183, arg4 - arg3);
			int var13 = IntMath.method1058(field1207, field183, arg4 + arg3);
			int var14 = IntMath.method1058(field1207, field183, arg4 - var7);
			int var15 = IntMath.method1058(field1207, field183, arg4 + var7);
			ArrayUtil.method1534(var12, arg2, var14, var11);
			ArrayUtil.method1534(var14, arg0, var15, var11);
			ArrayUtil.method1534(var15, arg2, var13, var11);
		}
		int var16 = -1;
		int var17 = -var7;
		int var18 = -1;
		while (var8 > var6) {
			var18 += 2;
			var9 += var18;
			var16 += 2;
			var17 += var16;
			if (var17 >= 0 && var10 >= 1) {
				var10--;
				field482[var10] = var6;
				var17 -= var10 << 1;
			}
			var6++;
			if (var9 >= 0) {
				var8--;
				var9 -= var8 << 1;
				int var19 = arg1 - var8;
				int var20 = arg1 + var8;
				if (field919 <= var20 && field279 >= var19) {
					if (var8 < var7) {
						int var21 = field482[var8];
						int var22 = IntMath.method1058(field1207, field183, arg4 + var6);
						int var23 = IntMath.method1058(field1207, field183, arg4 - var6);
						int var24 = IntMath.method1058(field1207, field183, var21 + arg4);
						int var25 = IntMath.method1058(field1207, field183, arg4 - var21);
						if (var20 <= field279) {
							int[] var26 = field42[var20];
							ArrayUtil.method1534(var23, arg2, var25, var26);
							ArrayUtil.method1534(var25, arg0, var24, var26);
							ArrayUtil.method1534(var24, arg2, var22, var26);
						}
						if (var19 >= field919) {
							int[] var27 = field42[var19];
							ArrayUtil.method1534(var23, arg2, var25, var27);
							ArrayUtil.method1534(var25, arg0, var24, var27);
							ArrayUtil.method1534(var24, arg2, var22, var27);
						}
					} else {
						int var28 = IntMath.method1058(field1207, field183, var6 + arg4);
						int var29 = IntMath.method1058(field1207, field183, arg4 - var6);
						if (var20 <= field279) {
							ArrayUtil.method1534(var29, arg2, var28, field42[var20]);
						}
						if (field919 <= var19) {
							ArrayUtil.method1534(var29, arg2, var28, field42[var19]);
						}
					}
				}
			}
			int var30 = var6 + arg1;
			int var31 = arg1 - var6;
			if (var30 >= field919 && var31 <= field279) {
				int var32 = arg4 + var8;
				int var33 = arg4 - var8;
				if (field1207 <= var32 && var33 <= field183) {
					int var34 = IntMath.method1058(field1207, field183, var32);
					int var35 = IntMath.method1058(field1207, field183, var33);
					if (var7 > var6) {
						int var36 = var10 >= var6 ? var10 : field482[var6];
						int var37 = IntMath.method1058(field1207, field183, var36 + arg4);
						int var38 = IntMath.method1058(field1207, field183, arg4 - var36);
						if (var30 <= field279) {
							int[] var39 = field42[var30];
							ArrayUtil.method1534(var35, arg2, var38, var39);
							ArrayUtil.method1534(var38, arg0, var37, var39);
							ArrayUtil.method1534(var37, arg2, var34, var39);
						}
						if (var31 >= field919) {
							int[] var40 = field42[var31];
							ArrayUtil.method1534(var35, arg2, var38, var40);
							ArrayUtil.method1534(var38, arg0, var37, var40);
							ArrayUtil.method1534(var37, arg2, var34, var40);
						}
					} else {
						if (field279 >= var30) {
							ArrayUtil.method1534(var35, arg2, var34, field42[var30]);
						}
						if (field919 <= var31) {
							ArrayUtil.method1534(var35, arg2, var34, field42[var31]);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("me.a(IZ)V")
	public static void method906(int arg0) {
		if (field482 == null || field482.length < arg0) {
			field482 = new int[arg0];
		}
	}

	@ObfuscatedName("ug.a(IIIIIBII)V")
	public static void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 == arg2) {
			method216(arg2, arg5, arg4, arg6, arg0, arg3);
		} else if (arg3 - arg2 >= field1207 && arg2 + arg3 <= field183 && field919 <= arg6 - arg1 && field279 >= arg1 + arg6) {
			method126(arg3, arg0, arg1, arg5, arg4, arg6, arg2);
		} else {
			method1051(arg6, arg4, arg2, arg5, arg0, arg1, arg3);
		}
	}

	@ObfuscatedName("mc.a(IIBIII)V")
	public static void method892(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2;
		ArrayUtil.method1534(arg0 - arg1, arg4, arg0 + arg1, field42[arg3]);
		int var6 = arg1 * arg1;
		int var7 = 0;
		int var8 = arg2 * arg2;
		int var9 = var8 << 1;
		int var10 = var6 << 1;
		int var11 = arg2 << 1;
		int var12 = var8 - var10 * (var11 - 1);
		int var13 = var9 + var6 * (1 - var11);
		int var14 = var6 << 2;
		int var15 = var10 * ((arg2 << 1) - 3);
		int var16 = var8 << 2;
		int var17 = var16;
		int var18 = var9 * 3;
		int var19 = (arg2 - 1) * var14;
		while (var5 > 0) {
			if (var13 < 0) {
				while (var13 < 0) {
					var7++;
					var13 += var18;
					var12 += var17;
					var18 += var16;
					var17 += var16;
				}
			}
			var5--;
			int var20 = arg3 - var5;
			if (var12 < 0) {
				var13 += var18;
				var7++;
				var18 += var16;
				var12 += var17;
				var17 += var16;
			}
			int var21 = var5 + arg3;
			var13 += -var19;
			var19 -= var14;
			int var22 = arg0 + var7;
			int var23 = arg0 - var7;
			ArrayUtil.method1534(var23, arg4, var22, field42[var20]);
			var12 += -var15;
			var15 -= var14;
			ArrayUtil.method1534(var23, arg4, var22, field42[var21]);
		}
	}

	@ObfuscatedName("ae.a(ZIIIII)V")
	public static void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field1207 <= arg3 && field183 >= arg4 && arg1 >= field919 && field279 >= arg0) {
			method1502(arg3, arg2, arg4, arg1, arg0);
		} else {
			method226(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@ObfuscatedName("ed.a(IIIIIIII)V")
	public static void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (field1207 <= arg5 && field183 >= arg0 && arg2 >= field919 && arg6 <= field279) {
			method1333(arg4, arg2, arg6, arg3, arg5, arg0, arg1);
		} else {
			method986(arg4, arg0, arg2, arg5, arg6, arg3, arg1);
		}
	}

	@ObfuscatedName("ma.a(IIIIIII)V")
	public static void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (field1207 <= arg5 && arg2 <= field183 && arg1 >= field919 && field279 >= arg3) {
			if (arg0 == 1) {
				method1420(arg5, arg2, arg3, arg1, arg4);
			} else {
				method786(arg2, arg4, arg0, arg3, arg1, arg5);
			}
		} else if (arg0 == 1) {
			method1028(arg3, arg4, arg5, arg1, arg2);
		} else {
			method101(arg3, arg0, arg5, arg1, arg2, arg4);
		}
	}

	@ObfuscatedName("ah.a(IIIIIII)V")
	public static void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method906(arg3);
		int var6 = arg3 - arg5;
		if (var6 < 0) {
			var6 = 0;
		}
		int var7 = 0;
		int var8 = arg3;
		int var9 = -var6;
		int var10 = var6;
		int var11 = -1;
		int var12 = -arg3;
		int var13 = -1;
		int var14 = arg1 - var6;
		int var15 = var6 + arg1;
		int[] var16 = field42[arg4];
		ArrayUtil.method1534(arg1 - arg3, arg2, var14, var16);
		ArrayUtil.method1534(var14, arg0, var15, var16);
		ArrayUtil.method1534(var15, arg2, arg3 + arg1, var16);
		while (var7 < var8) {
			var13 += 2;
			var9 += var13;
			var11 += 2;
			if (var9 >= 0 && var10 >= 1) {
				field482[var10] = var7;
				var10--;
				var9 -= var10 << 1;
			}
			var12 += var11;
			var7++;
			if (var12 >= 0) {
				var8--;
				if (var8 < var6) {
					int[] var17 = field42[arg4 + var8];
					int var18 = field482[var8];
					int[] var19 = field42[arg4 - var8];
					int var20 = arg1 - var7;
					int var21 = arg1 + var7;
					int var22 = arg1 + var18;
					int var23 = arg1 - var18;
					ArrayUtil.method1534(var20, arg2, var23, var17);
					ArrayUtil.method1534(var23, arg0, var22, var17);
					ArrayUtil.method1534(var22, arg2, var21, var17);
					ArrayUtil.method1534(var20, arg2, var23, var19);
					ArrayUtil.method1534(var23, arg0, var22, var19);
					ArrayUtil.method1534(var22, arg2, var21, var19);
				} else {
					int[] var24 = field42[arg4 + var8];
					int[] var25 = field42[arg4 - var8];
					int var26 = var7 + arg1;
					int var27 = arg1 - var7;
					ArrayUtil.method1534(var27, arg2, var26, var24);
					ArrayUtil.method1534(var27, arg2, var26, var25);
				}
				var12 -= var8 << 1;
			}
			int[] var28 = field42[var7 + arg4];
			int[] var29 = field42[arg4 - var7];
			int var30 = var8 + arg1;
			int var31 = arg1 - var8;
			if (var6 <= var7) {
				ArrayUtil.method1534(var31, arg2, var30, var28);
				ArrayUtil.method1534(var31, arg2, var30, var29);
			} else {
				int var32 = var10 < var7 ? field482[var7] : var10;
				int var33 = arg1 - var32;
				ArrayUtil.method1534(var31, arg2, var33, var28);
				int var34 = var32 + arg1;
				ArrayUtil.method1534(var33, arg0, var34, var28);
				ArrayUtil.method1534(var34, arg2, var30, var28);
				ArrayUtil.method1534(var31, arg2, var33, var29);
				ArrayUtil.method1534(var33, arg0, var34, var29);
				ArrayUtil.method1534(var34, arg2, var30, var29);
			}
		}
	}

	@ObfuscatedName("rg.a(IIZIIIII)V")
	public static void method1333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg1 + arg3;
		int var8 = arg2 - arg3;
		int var9 = arg4 + arg3;
		for (int var10 = arg1; var10 < var7; var10++) {
			ArrayUtil.method1534(arg4, arg6, arg5, field42[var10]);
		}
		int var11 = arg5 - arg3;
		for (int var12 = arg2; var12 > var8; var12--) {
			ArrayUtil.method1534(arg4, arg6, arg5, field42[var12]);
		}
		for (int var13 = var7; var13 <= var8; var13++) {
			int[] var14 = field42[var13];
			ArrayUtil.method1534(arg4, arg6, var9, var14);
			ArrayUtil.method1534(var9, arg0, var11, var14);
			ArrayUtil.method1534(var11, arg6, arg5, var14);
		}
	}

	@ObfuscatedName("va.a(IIIIB)V")
	public static void method1532(int arg0, int arg1, int arg2, int arg3) {
		if (field1207 <= arg0 - arg1 && field183 >= arg1 + arg0 && arg2 - arg1 >= field919 && field279 >= arg1 + arg2) {
			method745(arg2, arg3, arg1, arg0);
		} else {
			method318(arg3, arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("ne.a(IIIIIIII)V")
	public static void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = IntMath.method1058(field919, field279, arg2);
		int var8 = IntMath.method1058(field919, field279, arg4);
		int var9 = IntMath.method1058(field1207, field183, arg3);
		int var10 = IntMath.method1058(field1207, field183, arg1);
		int var11 = IntMath.method1058(field919, field279, arg2 + arg5);
		int var12 = IntMath.method1058(field919, field279, arg4 - arg5);
		for (int var13 = var7; var13 < var11; var13++) {
			ArrayUtil.method1534(var9, arg6, var10, field42[var13]);
		}
		for (int var14 = var8; var14 > var12; var14--) {
			ArrayUtil.method1534(var9, arg6, var10, field42[var14]);
		}
		int var15 = IntMath.method1058(field1207, field183, arg3 + arg5);
		int var16 = IntMath.method1058(field1207, field183, arg1 - arg5);
		for (int var17 = var11; var17 <= var12; var17++) {
			int[] var18 = field42[var17];
			ArrayUtil.method1534(var9, arg6, var15, var18);
			ArrayUtil.method1534(var15, arg0, var16, var18);
			ArrayUtil.method1534(var16, arg6, var10, var18);
		}
	}

	@ObfuscatedName("ib.a(IIIII)V")
	public static void method659(int arg0, int arg1, int arg2, int arg3) {
		if (field919 <= arg1 && arg1 <= field279) {
			int var4 = IntMath.method1058(field1207, field183, arg3);
			int var5 = IntMath.method1058(field1207, field183, arg0);
			method310(arg1, var5, var4, arg2);
		}
	}

	@ObfuscatedName("t.a(IIBIII)V")
	public static void method1420(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var8 = arg3 + 1;
		ArrayUtil.method1534(arg0, arg4, arg1, field42[arg3]);
		int var7 = arg2 - 1;
		ArrayUtil.method1534(arg0, arg4, arg1, field42[arg2]);
		for (int var5 = var8; var5 <= var7; var5++) {
			int[] var6 = field42[var5];
			var6[arg0] = var6[arg1] = arg4;
		}
	}

	@ObfuscatedName("ea.a(IIIBI)V")
	public static void method310(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= arg1) {
			ArrayUtil.method1534(arg2, arg3, arg1, field42[arg0]);
		} else {
			ArrayUtil.method1534(arg1, arg3, arg2, field42[arg0]);
		}
	}

	@ObfuscatedName("ea.a(IIIII)V")
	public static void method318(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0;
		int var5 = arg2;
		int var6 = -arg2;
		int var7 = IntMath.method1058(field1207, field183, arg1 + arg2);
		int var8 = -1;
		int var9 = IntMath.method1058(field1207, field183, arg1 - arg2);
		ArrayUtil.method1534(var9, arg0, var7, field42[arg3]);
		while (var5 > var4) {
			var8 += 2;
			var6 += var8;
			if (var6 > 0) {
				var5--;
				var6 -= var5 << 1;
				int var10 = arg3 - var5;
				int var11 = arg3 + var5;
				if (field919 <= var11 && var10 <= field279) {
					int var12 = IntMath.method1058(field1207, field183, arg1 + var4);
					int var13 = IntMath.method1058(field1207, field183, arg1 - var4);
					if (var11 <= field279) {
						ArrayUtil.method1534(var13, arg0, var12, field42[var11]);
					}
					if (var10 >= field919) {
						ArrayUtil.method1534(var13, arg0, var12, field42[var10]);
					}
				}
			}
			var4++;
			int var14 = var4 + arg3;
			int var15 = arg3 - var4;
			if (field919 <= var14 && field279 >= var15) {
				int var16 = IntMath.method1058(field1207, field183, arg1 + var5);
				int var17 = IntMath.method1058(field1207, field183, arg1 - var5);
				if (var14 <= field279) {
					ArrayUtil.method1534(var17, arg0, var16, field42[var14]);
				}
				if (var15 >= field919) {
					ArrayUtil.method1534(var17, arg0, var16, field42[var15]);
				}
			}
		}
	}

	@ObfuscatedName("ue.a(IIIIZI)V")
	public static void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var5 = arg3; var5 <= arg4; var5++) {
			ArrayUtil.method1534(arg0, arg1, arg2, field42[var5]);
		}
	}

	@ObfuscatedName("nh.a(IIIZII)V")
	public static void method1028(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 > field279 || field919 > arg0) {
			return;
		}
		boolean var5;
		if (field1207 > arg2) {
			var5 = false;
			arg2 = field1207;
		} else if (field183 >= arg2) {
			var5 = true;
		} else {
			arg2 = field183;
			var5 = false;
		}
		boolean var6;
		if (arg4 < field1207) {
			arg4 = field1207;
			var6 = false;
		} else if (field183 >= arg4) {
			var6 = true;
		} else {
			arg4 = field183;
			var6 = false;
		}
		if (arg3 >= field919) {
			ArrayUtil.method1534(arg2, arg1, arg4, field42[arg3++]);
		} else {
			arg3 = field919;
		}
		if (arg0 <= field279) {
			ArrayUtil.method1534(arg2, arg1, arg4, field42[arg0--]);
		} else {
			arg0 = field279;
		}
		if (var5 && var6) {
			for (int var9 = arg3; var9 <= arg0; var9++) {
				int[] var10 = field42[var9];
				var10[arg2] = var10[arg4] = arg1;
			}
			return;
		}
		if (var5) {
			for (int var7 = arg3; var7 <= arg0; var7++) {
				field42[var7][arg2] = arg1;
			}
			return;
		}
		if (var6) {
			for (int var8 = arg3; var8 <= arg0; var8++) {
				field42[var8][arg4] = arg1;
			}
			return;
		}
	}

	@ObfuscatedName("jg.a(IIIIBI)V")
	public static void method723(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg1 - arg3;
		int var6 = arg4 - arg0;
		if (var6 == 0) {
			if (var5 != 0) {
				method753(arg2, arg3, arg0, arg1);
			}
		} else if (var5 == 0) {
			method310(arg3, arg4, arg0, arg2);
		} else {
			if (var6 < 0) {
				var6 = -var6;
			}
			if (var5 < 0) {
				var5 = -var5;
			}
			boolean var7 = var6 < var5;
			if (var7) {
				int var8 = arg0;
				arg0 = arg3;
				arg3 = var8;
				int var9 = arg4;
				arg4 = arg1;
				arg1 = var9;
			}
			if (arg4 < arg0) {
				int var10 = arg0;
				int var11 = arg3;
				arg3 = arg1;
				arg0 = arg4;
				arg1 = var11;
				arg4 = var10;
			}
			int var12 = arg1 - arg3;
			int var13 = arg4 - arg0;
			if (var12 < 0) {
				var12 = -var12;
			}
			int var14 = arg3;
			int var15 = -(var13 >> 1);
			int var16 = arg3 < arg1 ? 1 : -1;
			if (var7) {
				for (int var17 = arg0; var17 <= arg4; var17++) {
					field42[var17][var14] = arg2;
					var15 += var12;
					if (var15 > 0) {
						var14 += var16;
						var15 -= var13;
					}
				}
			} else {
				for (int var18 = arg0; var18 <= arg4; var18++) {
					field42[var14][var18] = arg2;
					var15 += var12;
					if (var15 > 0) {
						var15 -= var13;
						var14 += var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("hi.a(IBIII)V")
	public static void method580(int arg0, int arg1, int arg2, int arg3) {
		if (field1207 <= arg3 && arg3 <= field183) {
			int var4 = IntMath.method1058(field919, field279, arg2);
			int var5 = IntMath.method1058(field919, field279, arg1);
			method753(arg0, var4, arg3, var5);
		}
	}

	@ObfuscatedName("k.b(IIIII)V")
	public static void method753(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 > arg3) {
			for (int var4 = arg3; var4 < arg1; var4++) {
				field42[var4][arg2] = arg0;
			}
		} else {
			for (int var5 = arg1; var5 < arg3; var5++) {
				field42[var5][arg2] = arg0;
			}
		}
	}

	@ObfuscatedName("k.a(IIIII)V")
	public static void method745(int arg0, int arg1, int arg2, int arg3) {
		ArrayUtil.method1534(arg3 - arg2, arg1, arg2 + arg3, field42[arg0]);
		int var4 = 0;
		int var5 = arg2;
		int var6 = -1;
		int var7 = -arg2;
		while (var4 < var5) {
			var6 += 2;
			var7 += var6;
			var4++;
			if (var7 >= 0) {
				var5--;
				var7 -= var5 << 1;
				int[] var8 = field42[var5 + arg0];
				int[] var9 = field42[arg0 - var5];
				int var10 = var4 + arg3;
				int var11 = arg3 - var4;
				ArrayUtil.method1534(var11, arg1, var10, var8);
				ArrayUtil.method1534(var11, arg1, var10, var9);
			}
			int var12 = arg3 + var5;
			int var13 = arg3 - var5;
			int[] var14 = field42[arg0 + var4];
			int[] var15 = field42[arg0 - var4];
			ArrayUtil.method1534(var13, arg1, var12, var14);
			ArrayUtil.method1534(var13, arg1, var12, var15);
		}
	}

	@ObfuscatedName("tc.a(IIIIII)V")
	public static void method1438(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = 0;
		int var6 = arg1;
		int var7 = arg4 * arg4;
		int var8 = arg1 * arg1;
		int var9 = var8 << 1;
		int var10 = var7 << 1;
		int var11 = arg1 << 1;
		int var12 = var9 + var7 * (1 - var11);
		int var13 = var8 - var10 * (var11 - 1);
		int var14 = var7 << 2;
		int var15 = var8 << 2;
		int var16 = var9 * 3;
		int var17 = var10 * ((arg1 << 1) - 3);
		int var18 = var15;
		int var19 = (arg1 - 1) * var14;
		if (field919 <= arg2 && arg2 <= field279) {
			int var20 = IntMath.method1058(field1207, field183, arg4 + arg0);
			int var21 = IntMath.method1058(field1207, field183, arg0 - arg4);
			ArrayUtil.method1534(var21, arg3, var20, field42[arg2]);
		}
		while (var6 > 0) {
			var6--;
			int var22 = arg2 - var6;
			int var23 = var6 + arg2;
			if (var12 < 0) {
				while (var12 < 0) {
					var13 += var18;
					var5++;
					var18 += var15;
					var12 += var16;
					var16 += var15;
				}
			}
			if (var13 < 0) {
				var5++;
				var13 += var18;
				var12 += var16;
				var16 += var15;
				var18 += var15;
			}
			var13 += -var17;
			if (var23 >= field919 && field279 >= var22) {
				int var24 = IntMath.method1058(field1207, field183, arg0 + var5);
				int var25 = IntMath.method1058(field1207, field183, arg0 - var5);
				if (var22 >= field919) {
					ArrayUtil.method1534(var25, arg3, var24, field42[var22]);
				}
				if (field279 >= var23) {
					ArrayUtil.method1534(var25, arg3, var24, field42[var23]);
				}
			}
			var17 -= var14;
			var12 += -var19;
			var19 -= var14;
		}
	}

	@ObfuscatedName("jj.a(IIIIIIIIII)V")
	public static void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg2 >= field1207 && field183 >= arg2 && field1207 <= arg3 && field183 >= arg3 && arg8 >= field1207 && field183 >= arg8 && arg5 >= field1207 && arg5 <= field183 && arg1 >= field919 && arg1 <= field279 && arg0 >= field919 && field279 >= arg0 && field919 <= arg4 && arg4 <= field279 && field919 <= arg6 && arg6 <= field279) {
			method1042(arg3, arg7, arg5, arg0, arg1, arg6, arg4, arg2, arg8);
		} else {
			method982(arg2, arg3, arg5, arg7, arg6, arg0, arg1, arg4, arg8);
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public static void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = IntMath.method1058(field919, field279, arg1);
		int var6 = IntMath.method1058(field919, field279, arg2);
		int var7 = IntMath.method1058(field1207, field183, arg3);
		int var8 = IntMath.method1058(field1207, field183, arg4);
		for (int var9 = var5; var9 <= var6; var9++) {
			ArrayUtil.method1534(var7, arg0, var8, field42[var9]);
		}
	}

	@ObfuscatedName("kf.a(IIIIIZI)V")
	public static void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 + arg4;
		int var7 = arg3 - arg2;
		int var8 = arg2 + arg5;
		int var9 = arg0 - arg2;
		for (int var10 = arg4; var10 < var6; var10++) {
			ArrayUtil.method1534(arg5, arg1, arg0, field42[var10]);
		}
		for (int var11 = arg3; var11 > var7; var11--) {
			ArrayUtil.method1534(arg5, arg1, arg0, field42[var11]);
		}
		for (int var12 = var6; var12 <= var7; var12++) {
			int[] var13 = field42[var12];
			ArrayUtil.method1534(arg5, arg1, var8, var13);
			ArrayUtil.method1534(var9, arg1, arg0, var13);
		}
	}

	@ObfuscatedName("bi.a(IIIIIIB)V")
	public static void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = IntMath.method1058(field919, field279, arg3);
		int var7 = IntMath.method1058(field919, field279, arg0);
		int var8 = IntMath.method1058(field1207, field183, arg2);
		int var9 = IntMath.method1058(field1207, field183, arg4);
		int var10 = IntMath.method1058(field919, field279, arg3 + arg1);
		int var11 = IntMath.method1058(field919, field279, arg0 - arg1);
		for (int var12 = var6; var12 < var10; var12++) {
			ArrayUtil.method1534(var8, arg5, var9, field42[var12]);
		}
		for (int var13 = var7; var13 > var11; var13--) {
			ArrayUtil.method1534(var8, arg5, var9, field42[var13]);
		}
		int var14 = IntMath.method1058(field1207, field183, arg1 + arg2);
		int var15 = IntMath.method1058(field1207, field183, arg4 - arg1);
		for (int var16 = var10; var16 <= var11; var16++) {
			int[] var17 = field42[var16];
			ArrayUtil.method1534(var8, arg5, var14, var17);
			ArrayUtil.method1534(var15, arg5, var9, var17);
		}
	}

	@ObfuscatedName("c.b(IIIIIIII)V")
	public static void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg2;
		int var8 = 0;
		int var9 = arg6 - arg1;
		int var10 = 0;
		int var11 = arg6 * arg6;
		int var12 = arg2 * arg2;
		int var13 = var9 * var9;
		int var14 = arg2 - arg1;
		int var15 = var14 * var14;
		int var16 = var11 << 1;
		int var17 = var12 << 1;
		int var18 = var15 << 1;
		int var19 = var13 << 1;
		int var20 = arg2 << 1;
		int var21 = var14 << 1;
		int var22 = var12 - var16 * (var20 - 1);
		int var23 = var17 + var11 * (1 - var20);
		int var24 = var12 << 2;
		int var25 = var11 << 2;
		int var26 = var18 + (1 - var21) * var13;
		int var27 = var15 << 2;
		int var28 = (var20 - 3) * var16;
		int var29 = var13 << 2;
		int var30 = var15 - (var21 - 1) * var19;
		int var31 = var17 * 3;
		int var32 = var18 * 3;
		int var33 = (arg2 - 1) * var25;
		int var34 = (var21 - 3) * var19;
		int var35 = (var14 - 1) * var29;
		int[] var36 = field42[arg5];
		int var37 = var24;
		int var38 = var27;
		ArrayUtil.method1534(arg0 - arg6, arg4, arg0 - var9, var36);
		ArrayUtil.method1534(arg0 - var9, arg3, var9 + arg0, var36);
		ArrayUtil.method1534(var9 + arg0, arg4, arg0 + arg6, var36);
		while (var7 > 0) {
			if (var23 < 0) {
				while (var23 < 0) {
					var23 += var31;
					var31 += var24;
					var10++;
					var22 += var37;
					var37 += var24;
				}
			}
			boolean var39 = var7 <= var14;
			if (var39) {
				if (var26 < 0) {
					while (var26 < 0) {
						var8++;
						var30 += var38;
						var38 += var27;
						var26 += var32;
						var32 += var27;
					}
				}
				if (var30 < 0) {
					var8++;
					var26 += var32;
					var32 += var27;
					var30 += var38;
					var38 += var27;
				}
				var26 += -var35;
				var30 += -var34;
				var34 -= var29;
				var35 -= var29;
			}
			if (var22 < 0) {
				var23 += var31;
				var31 += var24;
				var10++;
				var22 += var37;
				var37 += var24;
			}
			var23 += -var33;
			var33 -= var25;
			var22 += -var28;
			var7--;
			int var40 = var10 + arg0;
			int var41 = arg5 - var7;
			var28 -= var25;
			int var42 = var7 + arg5;
			int var43 = arg0 - var10;
			if (var39) {
				int var44 = arg0 + var8;
				int var45 = arg0 - var8;
				ArrayUtil.method1534(var43, arg4, var45, field42[var41]);
				ArrayUtil.method1534(var45, arg3, var44, field42[var41]);
				ArrayUtil.method1534(var44, arg4, var40, field42[var41]);
				ArrayUtil.method1534(var43, arg4, var45, field42[var42]);
				ArrayUtil.method1534(var45, arg3, var44, field42[var42]);
				ArrayUtil.method1534(var44, arg4, var40, field42[var42]);
			} else {
				ArrayUtil.method1534(var43, arg4, var40, field42[var41]);
				ArrayUtil.method1534(var43, arg4, var40, field42[var42]);
			}
		}
	}

	@ObfuscatedName("ob.a(IIIIIBII)V")
	public static void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		int var8 = arg5;
		int var9 = 0;
		int var10 = arg2 - arg4;
		int var11 = arg5 - arg4;
		int var12 = arg2 * arg2;
		int var13 = arg5 * arg5;
		int var14 = var11 * var11;
		int var15 = var13 << 1;
		int var16 = var10 * var10;
		int var17 = var12 << 1;
		int var18 = var16 << 1;
		int var19 = var14 << 1;
		int var20 = var11 << 1;
		int var21 = var19 + var16 * (1 - var20);
		int var22 = arg5 << 1;
		int var23 = var13 - (var22 - 1) * var17;
		int var24 = (1 - var22) * var12 + var15;
		int var25 = var14 - var18 * (var20 - 1);
		int var26 = var13 << 2;
		int var27 = var12 << 2;
		int var28 = var15 * 3;
		int var29 = var14 << 2;
		int var30 = var16 << 2;
		int var31 = var19 * 3;
		int var32 = var18 * (var20 - 3);
		int var33 = var26;
		int var34 = (var22 - 3) * var17;
		int var35 = var29;
		if (field919 <= arg0 && field279 >= arg0) {
			int[] var36 = field42[arg0];
			int var37 = IntMath.method1058(field1207, field183, arg6 - arg2);
			int var38 = IntMath.method1058(field1207, field183, arg6 + arg2);
			int var39 = IntMath.method1058(field1207, field183, arg6 - var10);
			int var40 = IntMath.method1058(field1207, field183, arg6 + var10);
			ArrayUtil.method1534(var37, arg1, var39, var36);
			ArrayUtil.method1534(var39, arg3, var40, var36);
			ArrayUtil.method1534(var40, arg1, var38, var36);
		}
		int var41 = (var11 - 1) * var30;
		int var42 = (arg5 - 1) * var27;
		while (var8 > 0) {
			if (var24 < 0) {
				while (var24 < 0) {
					var24 += var28;
					var28 += var26;
					var7++;
					var23 += var33;
					var33 += var26;
				}
			}
			boolean var43 = var11 >= var8;
			var8--;
			int var44 = var8 + arg0;
			int var45 = arg0 - var8;
			if (var43) {
				if (var21 < 0) {
					while (var21 < 0) {
						var25 += var35;
						var21 += var31;
						var31 += var29;
						var9++;
						var35 += var29;
					}
				}
				if (var25 < 0) {
					var25 += var35;
					var9++;
					var21 += var31;
					var31 += var29;
					var35 += var29;
				}
				var25 += -var32;
				var21 += -var41;
				var32 -= var30;
				var41 -= var30;
			}
			if (var23 < 0) {
				var23 += var33;
				var33 += var26;
				var24 += var28;
				var28 += var26;
				var7++;
			}
			var23 += -var34;
			var24 += -var42;
			var42 -= var27;
			var34 -= var27;
			if (var44 >= field919 && field279 >= var45) {
				int var46 = IntMath.method1058(field1207, field183, arg6 + var7);
				int var47 = IntMath.method1058(field1207, field183, arg6 - var7);
				if (var43) {
					int var48 = IntMath.method1058(field1207, field183, arg6 + var9);
					int var49 = IntMath.method1058(field1207, field183, arg6 - var9);
					if (var45 >= field919) {
						int[] var50 = field42[var45];
						ArrayUtil.method1534(var47, arg1, var49, var50);
						ArrayUtil.method1534(var49, arg3, var48, var50);
						ArrayUtil.method1534(var48, arg1, var46, var50);
					}
					if (field279 >= var44) {
						int[] var51 = field42[var44];
						ArrayUtil.method1534(var47, arg1, var49, var51);
						ArrayUtil.method1534(var49, arg3, var48, var51);
						ArrayUtil.method1534(var48, arg1, var46, var51);
					}
				} else {
					if (var45 >= field919) {
						ArrayUtil.method1534(var47, arg1, var46, field42[var45]);
					}
					if (field279 >= var44) {
						ArrayUtil.method1534(var47, arg1, var46, field42[var44]);
					}
				}
			}
		}
	}

	@ObfuscatedName("oa.a(IIBIIIIIII)V")
	public static void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 == arg7 && arg4 == arg3 && arg8 == arg2 && arg6 == arg5) {
			method723(arg7, arg5, arg1, arg4, arg2);
			return;
		}
		int var9 = arg7;
		int var10 = arg4;
		int var11 = arg7 * 3;
		int var12 = arg4 * 3;
		int var13 = arg6 * 3;
		int var14 = arg3 * 3;
		int var15 = arg8 * 3;
		int var16 = arg0 * 3;
		int var17 = arg5 + var14 - arg4 - var13;
		int var18 = arg2 + var16 - arg7 - var15;
		int var19 = var15 + var11 - var16 - var16;
		int var20 = var12 + var13 - var14 - var14;
		int var21 = var16 - var11;
		int var22 = var14 - var12;
		for (int var23 = 128; var23 <= 4096; var23 += 128) {
			int var24 = var23 * var23 >> 12;
			int var25 = var24 * var23 >> 12;
			int var26 = var18 * var25;
			int var27 = var24 * var19;
			int var28 = var23 * var21;
			int var29 = var24 * var20;
			int var30 = var17 * var25;
			int var31 = var22 * var23;
			int var32 = arg7 + (var26 + var27 + var28 >> 12);
			int var33 = arg4 + (var31 + var30 + var29 >> 12);
			method723(var9, var33, arg1, var10, var32);
			var10 = var33;
			var9 = var32;
		}
	}

	@ObfuscatedName("v.a(IBIIII)V")
	public static void method1529(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2 - arg0;
		int var6 = arg1 - arg3;
		if (var5 == 0) {
			if (var6 != 0) {
				method580(arg4, arg1, arg3, arg0);
			}
		} else if (var6 == 0) {
			method659(arg2, arg3, arg4, arg0);
		} else {
			int var7 = (var6 << 12) / var5;
			int var8 = arg3 - (var7 * arg0 >> 12);
			int var9;
			int var10;
			if (field1207 > arg2) {
				var9 = field1207;
				var10 = (field1207 * var7 >> 12) + var8;
			} else if (arg2 > field183) {
				var9 = field183;
				var10 = var8 + (field183 * var7 >> 12);
			} else {
				var9 = arg2;
				var10 = arg1;
			}
			if (field919 > var10) {
				var10 = field919;
				var9 = (field919 - var8 << 12) / var7;
			} else if (var10 > field279) {
				var10 = field279;
				var9 = (field279 - var8 << 12) / var7;
			}
			int var11;
			int var12;
			if (field1207 > arg0) {
				var11 = field1207;
				var12 = (field1207 * var7 >> 12) + var8;
			} else if (field183 < arg0) {
				var11 = field183;
				var12 = (var7 * field183 >> 12) + var8;
			} else {
				var11 = arg0;
				var12 = arg3;
			}
			if (var12 < field919) {
				var12 = field919;
				var11 = (field919 - var8 << 12) / var7;
			} else if (field279 < var12) {
				var12 = field279;
				var11 = (field279 - var8 << 12) / var7;
			}
			method723(var11, var10, arg4, var12, var9);
		}
	}

	@ObfuscatedName("ne.a(IIIIZIIIII)V")
	public static void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg1 == arg0 && arg6 == arg5 && arg2 == arg8 && arg7 == arg4) {
			method1529(arg0, arg4, arg2, arg6, arg3);
			return;
		}
		int var9 = arg0;
		int var10 = arg6;
		int var11 = arg0 * 3;
		int var12 = arg6 * 3;
		int var13 = arg1 * 3;
		int var14 = arg5 * 3;
		int var15 = arg8 * 3;
		int var16 = arg7 * 3;
		int var17 = arg2 + var13 - var15 - arg0;
		int var18 = var15 + var11 - var13 - var13;
		int var19 = arg4 + var14 - arg6 - var16;
		int var20 = var16 + var12 - var14 - var14;
		int var21 = var13 - var11;
		int var22 = var14 - var12;
		for (int var23 = 128; var23 <= 4096; var23 += 128) {
			int var24 = var23 * var23 >> 12;
			int var25 = var21 * var23;
			int var26 = var23 * var24 >> 12;
			int var27 = var23 * var22;
			int var28 = var26 * var17;
			int var29 = var18 * var24;
			int var30 = var26 * var19;
			int var31 = (var25 + var28 + var29 >> 12) + arg0;
			int var32 = var24 * var20;
			int var33 = (var27 + var30 + var32 >> 12) + arg6;
			method1529(var9, var33, var31, var10, arg3);
			var10 = var33;
			var9 = var31;
		}
	}

    @ObfuscatedName("client.a(IIIIIII)V")
    public static void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field1207 <= arg5 - arg0 && field183 >= arg5 + arg0 && field919 <= arg3 - arg0 && field279 >= arg0 + arg3) {
            method46(arg1, arg5, arg2, arg0, arg3, arg4);
        } else {
            method827(arg1, arg3, arg2, arg0, arg5, arg4);
        }
    }

    @ObfuscatedName("mb.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.drawCommands = new TextureOpSubShape[arg0.g1()];
			for (int var3 = 0; var3 < this.drawCommands.length; var3++) {
				int var4 = arg0.g1();
				if (var4 == 0) {
					this.drawCommands[var3] = TextureOpSubShape0.method538(arg0);
				} else if (var4 == 1) {
					this.drawCommands[var3] = TextureOpSubShape1.method936(arg0);
				} else if (var4 == 2) {
					this.drawCommands[var3] = TextureOpSubShape2.method62(arg0);
				} else if (var4 == 3) {
					this.drawCommands[var3] = TextureOpSubShape3.method577(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("mb.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			this.rasterize(super.monoCache.method1075());
		}
		return var2;
	}

	@ObfuscatedName("mb.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310) {
			int var3 = Texture.field1276;
			int var4 = Texture.field460;
			int[][][] var5 = super.colorCache.method1537();
			int[][] var6 = new int[var4][var3];
			this.rasterize(var6);
			for (int var7 = 0; var7 < Texture.field460; var7++) {
				int[] var8 = var6[var7];
				int[][] var9 = var5[var7];
				int[] var10 = var9[1];
				int[] var11 = var9[2];
				int[] var12 = var9[0];
				for (int var13 = 0; var13 < Texture.field1276; var13++) {
					int var14 = var8[var13];
					var11[var13] = (var14 & 0xFF) << 4;
					var10[var13] = var14 >> 4 & 0xFF0;
					var12[var13] = var14 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mb.a([[IB)V")
	public void rasterize(int[][] arg0) {
		int var2 = Texture.field1276;
		int var3 = Texture.field460;
		method114(arg0);
		method1575(Texture.field4158, Texture.field789);
		if (this.drawCommands == null) {
			return;
		}
		for (int var4 = 0; var4 < this.drawCommands.length; var4++) {
			TextureOpSubShape var5 = this.drawCommands[var4];
			int var6 = var5.field925;
			int var7 = var5.field927;
			if (var6 < 0) {
				if (var7 >= 0) {
					var5.method377(var2, var3);
				}
			} else if (var7 < 0) {
				var5.method373(var3, var2);
			} else {
				var5.method371(var2, var3);
			}
		}
	}
}
