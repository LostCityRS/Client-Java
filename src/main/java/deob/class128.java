package deob;

@ObfuscatedName("lh")
public final class class128 extends class23 {

	@ObfuscatedName("lh.ab")
	public int field2405 = 409;

	@ObfuscatedName("lh.bb")
	public int field2406 = 4096;

	@ObfuscatedName("lh.cb")
	public final int[] field2407 = new int[3];

	@ObfuscatedName("lh.db")
	public static int field2408 = 0;

	@ObfuscatedName("lh.fb")
	public int field2410 = 4096;

	@ObfuscatedName("lh.gb")
	public static final class88 field2411 = class208.method1423(105, "Members only world");

	@ObfuscatedName("lh.hb")
	public static final class88 field2412 = class208.method1423(105, "oberen Rand der Webseite ausw-=hlen)3");

	@ObfuscatedName("lh.Q")
	public static class154 field2395 = new class154(8);

	@ObfuscatedName("lh.V")
	public static final class88 field2400 = class208.method1423(105, ":assist:");

	@ObfuscatedName("lh.Z")
	public static class88 field2404 = field2411;

	@ObfuscatedName("lh.R")
	public int field2396 = 4096;

	@ObfuscatedName("lh.X")
	public static int[] field2402;

	@ObfuscatedName("lh.c(B)V")
	public static void method869() {
		class89.field1694 = new class248();
	}

	@ObfuscatedName("lh.a(IIZIII)V")
	public static void method871(int arg0, int arg1, int arg2, int arg3, int arg4) {
		long var5 = class157.method1062(arg2, arg4, arg0);
		if (var5 != 0L) {
			int var7 = (int) var5 >> 20 & 0x3;
			int var8 = (int) var5 >> 14 & 0x1F;
			int var9 = arg3;
			int[] var10 = class72.field1331;
			int var11 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			int var12 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
			if (var5 > 0L) {
				var9 = arg1;
			}
			class148 var13 = class190.method1321(var12);
			if (var13.field2832 == -1) {
				if (var8 == 0 || var8 == 2) {
					if (var7 == 0) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 1) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 3] = var9;
						var10[var11 + 515] = var9;
						var10[var11 + 1024 + 3] = var9;
						var10[var11 + 3 + 1536] = var9;
					} else if (var7 == 3) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1 + 1536] = var9;
						var10[var11 + 2 + 1536] = var9;
						var10[var11 + 1536 + 3] = var9;
					}
				}
				if (var8 == 3) {
					if (var7 == 0) {
						var10[var11] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536 + 3] = var9;
					} else if (var7 == 3) {
						var10[var11 + 1536] = var9;
					}
				}
				if (var8 == 2) {
					if (var7 == 3) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 0) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
						var10[var11 + 512 + 3] = var9;
						var10[var11 + 3 + 1024] = var9;
						var10[var11 + 1536 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1536 + 1] = var9;
						var10[var11 + 1538] = var9;
						var10[var11 + 3 + 1536] = var9;
					}
				}
			} else {
				class193 var14 = class240.field4460[var13.field2832];
				if (var14 != null) {
					int var15 = (var13.field2774 * 4 - var14.field2434) / 2;
					int var16 = (var13.field2794 * 4 - var14.field2437) / 2;
					var14.method876(arg4 * 4 + var15 + 48, 48 - -((104 - (arg0 - -var13.field2794)) * 4) + var16);
				}
			}
		}
		long var17 = class112.method770(arg2, arg4, arg0);
		if (var17 != 0L) {
			int var19 = (int) var17 >> 20 & 0x3;
			int var20 = (int) var17 >> 14 & 0x1F;
			int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
			class148 var22 = class190.method1321(var21);
			if (var22.field2832 != -1) {
				class193 var23 = class240.field4460[var22.field2832];
				if (var23 != null) {
					int var24 = (var22.field2774 * 4 - var23.field2434) / 2;
					int var25 = (var22.field2794 * 4 - var23.field2437) / 2;
					var23.method876(arg4 * 4 + var24 + 48, var25 + (-var22.field2794 + -arg0 + 104) * 4 + 48);
				}
			} else if (var20 == 9) {
				int var26 = 15658734;
				int[] var27 = class72.field1331;
				if (var17 > 0L) {
					var26 = 15597568;
				}
				int var28 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
				if (var19 == 0 || var19 == 2) {
					var27[var28 + 1536] = var26;
					var27[var28 + 1025] = var26;
					var27[var28 + 514] = var26;
					var27[var28 + 3] = var26;
				} else {
					var27[var28] = var26;
					var27[var28 + 1 + 512] = var26;
					var27[var28 + 1024 + 2] = var26;
					var27[var28 + 1539] = var26;
				}
			}
		}
		long var29 = class74.method501(arg2, arg4, arg0);
		if (var29 == 0L) {
			return;
		}
		int var31 = Integer.MAX_VALUE & (int) (var29 >>> 32);
		class148 var32 = class190.method1321(var31);
		if (var32.field2832 == -1) {
			return;
		}
		class193 var33 = class240.field4460[var32.field2832];
		if (var33 != null) {
			int var34 = (var32.field2774 * 4 - var33.field2434) / 2;
			int var35 = (var32.field2794 * 4 - var33.field2437) / 2;
			var33.method876(var34 + arg4 * 4 + 48, (-arg0 + 104 + -var32.field2794) * 4 + 48 - -var35);
			return;
		}
	}

	public class128() {
		super(1, false);
	}

	@ObfuscatedName("lh.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[1];
			int[] var6 = var3[2];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < class70.field1276; var10++) {
				int var11 = var4[var10];
				int var12 = var11 - this.field2407[0];
				if (var12 < 0) {
					var12 = -var12;
				}
				if (var12 > this.field2405) {
					var7[var10] = var11;
					var8[var10] = var5[var10];
					var9[var10] = var6[var10];
				} else {
					int var13 = var5[var10];
					int var14 = var13 - this.field2407[1];
					if (var14 < 0) {
						var14 = -var14;
					}
					if (this.field2405 < var14) {
						var7[var10] = var11;
						var8[var10] = var13;
						var9[var10] = var6[var10];
					} else {
						int var15 = var6[var10];
						int var16 = var15 - this.field2407[2];
						if (var16 < 0) {
							var16 = -var16;
						}
						if (var16 > this.field2405) {
							var7[var10] = var11;
							var8[var10] = var13;
							var9[var10] = var15;
						} else {
							var7[var10] = this.field2410 * var11 >> 12;
							var8[var10] = var13 * this.field2406 >> 12;
							var9[var10] = this.field2396 * var15 >> 12;
						}
					}
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("lh.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2405 = arg0.method301();
		} else if (arg1 == 1) {
			this.field2396 = arg0.method301();
		} else if (arg1 == 2) {
			this.field2406 = arg0.method301();
		} else if (arg1 == 3) {
			this.field2410 = arg0.method301();
		} else if (arg1 == 4) {
			int var3 = arg0.method304();
			this.field2407[0] = (var3 & 0xFF0000) << 4;
			this.field2407[1] = var3 >> 4 & 0xFF0;
			this.field2407[2] = var3 >> 12 & 0x0;
		}
	}
}
