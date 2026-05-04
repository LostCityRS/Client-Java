package deob;

@ObfuscatedName("sc")
public final class class199 extends class136 {

	@ObfuscatedName("sc.ab")
	public static int field3809;

	@ObfuscatedName("sc.bb")
	public static final class248 field3810 = new class248();

	@ObfuscatedName("sc.cb")
	public static final class88 field3811 = class208.method1423(105, "Der Anmelde)2Server ist offline)3");

	@ObfuscatedName("sc.F")
	public static int field3788 = 0;

	@ObfuscatedName("sc.D")
	public static final class88 field3787 = class208.method1423(105, " ");

	@ObfuscatedName("sc.M")
	public static final class88 field3795 = class208.method1423(105, "p11_full");

	@ObfuscatedName("sc.W")
	public static final class88 field3805 = class208.method1423(105, "Art");

	@ObfuscatedName("sc.R")
	public boolean field3800 = false;

	@ObfuscatedName("sc.I")
	public final class12 field3791;

	@ObfuscatedName("sc.L")
	public final boolean field3794;

	@ObfuscatedName("sc.S")
	public final boolean field3801;

	@ObfuscatedName("sc.H")
	public final int field3790;

	@ObfuscatedName("sc.Y")
	public final int field3807;

	@ObfuscatedName("sc.P")
	public float field3798;

	@ObfuscatedName("sc.Z")
	public int[] field3808;

	@ObfuscatedName("sc.a(BLnb;Lnb;)V")
	public static void method1364(class144 arg0, class144 arg1) {
		class43.field733 = arg0;
		class129.field2422 = arg1;
		class23.field374 = class129.field2422.method942(3);
	}

	@ObfuscatedName("sc.a(IJ)V")
	public static void method1365(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}

	@ObfuscatedName("sc.d(I)V")
	public static void method1370() {
		for (class242 var0 = (class242) class42.field714.method1610(); var0 != null; var0 = (class242) class42.field714.method1619()) {
			class18 var1 = var0.field4474;
			if (var1.field292 != class149.field2907 || var1.field302) {
				var0.method460();
			} else if (var1.field287 <= class117.field2113) {
				var1.method90(class17.field261);
				if (var1.field302) {
					var0.method460();
				} else {
					class126.method859(var1.field292, var1.field296, var1.field290, var1.field295, 60, var1, 0, -1L, false);
				}
			}
		}
	}

	public class199(class46 arg0) {
		this.field3791 = new class12(arg0);
		this.field3794 = arg0.method347() == 1;
		this.field3801 = arg0.method347() == 1;
		arg0.method347();
		arg0.method347();
		int var2 = arg0.method347() & 0x3;
		this.field3790 = arg0.method324();
		this.field3807 = arg0.method324();
		arg0.method347();
		arg0.method347();
	}

	@ObfuscatedName("sc.a(Lnb;ZZLfe;)[I")
	public int[] method1366(class144 arg0, boolean arg1, class61 arg2) {
		if (this.field3791.method63(arg2, arg0)) {
			int var4 = arg1 ? 64 : 128;
			return this.field3791.method60(1.0D, var4, this.field3801, arg0, arg2, var4, false);
		} else {
			return null;
		}
	}

	@ObfuscatedName("sc.b(IZ)V")
	public void method1367(int arg0) {
		if (this.field3808 == null || this.field3807 == 0 && this.field3790 == 0) {
			return;
		}
		if (class225.field4218 == null || class225.field4218.length < this.field3808.length) {
			class225.field4218 = new int[this.field3808.length];
		}
		int var2 = this.field3808.length;
		int var3 = this.field3790 * arg0;
		int var4 = var2 - 1;
		int var5 = this.field3808.length == 4096 ? 64 : 128;
		int var6 = var5 * arg0 * this.field3807;
		int var7 = var5 - 1;
		for (int var8 = 0; var8 < var2; var8 += var5) {
			int var9 = var8 + var6 & var4;
			for (int var10 = 0; var10 < var5; var10++) {
				int var11 = var8 + var10;
				int var12 = var9 + (var7 & var3 + var10);
				class225.field4218[var11] = this.field3808[var12];
			}
		}
		int[] var13 = this.field3808;
		this.field3808 = class225.field4218;
		class225.field4218 = var13;
	}

	@ObfuscatedName("sc.a(Lfe;ILnb;)Z")
	public boolean method1368(class61 arg0, class144 arg1) {
		return this.field3791.method63(arg0, arg1);
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@ObfuscatedName("sc.a(Lfe;FLnb;ZZ)[I")
	public int[] method1369(class61 arg0, float arg1, class144 arg2, boolean arg3) {
		if (this.field3808 == null || arg1 != this.field3798) {
			if (!this.field3791.method63(arg0, arg2)) {
				return null;
			}
			int var5 = arg3 ? 64 : 128;
			this.field3808 = this.field3791.method60((double) arg1, var5, this.field3801, arg2, arg0, var5, true);
			this.field3798 = arg1;
			if (this.field3794) {
				int[] var6 = new int[var5];
				int[] var7 = new int[var5 * var5];
				int[] var8 = new int[var5];
				int[] var9 = new int[var5];
				int var10 = var5;
				int var11 = var5;
				int var12 = var5 - 1;
				int var13 = var5 - 1;
				int var14 = var5 * var5;
				for (int var15 = 2; var15 >= 0; var15--) {
					for (int var16 = var13; var16 >= 0; var16--) {
						var10--;
						int var17 = this.field3808[var10];
						var6[var16] += var17 >> 16 & 0xFF;
						var9[var16] += var17 >> 8 & 0xFF;
						var8[var16] += var17 & 0xFF;
					}
					if (var10 == 0) {
						var10 = var14;
					}
				}
				int var18 = var14;
				for (int var19 = var12; var19 >= 0; var19--) {
					int var20 = 1;
					int var21 = 0;
					int var22 = 0;
					int var23 = 0;
					int var24 = 1;
					for (int var25 = 2; var25 >= 0; var25--) {
						var24--;
						var23 += var6[var24];
						var22 += var8[var24];
						var21 += var9[var24];
						if (var24 == 0) {
							var24 = var5;
						}
					}
					for (int var26 = var13; var26 >= 0; var26--) {
						var20--;
						var24--;
						int var27 = var23 / 9;
						int var28 = var22 / 9;
						int var29 = var21 / 9;
						var18--;
						var7[var18] = var28 | var29 << 8 | var27 << 16;
						var21 += var9[var24] - var9[var20];
						var23 += var6[var24] - var6[var20];
						var22 += var8[var24] - var8[var20];
						if (var24 == 0) {
							var24 = var5;
						}
						if (var20 == 0) {
							var20 = var5;
						}
					}
					for (int var30 = var13; var30 >= 0; var30--) {
						var11--;
						int var31 = this.field3808[var11];
						var10--;
						int var32 = this.field3808[var10];
						var6[var30] += (var32 >> 16 & 0xFF) - ((var31 & 0xFF6387) >> 16);
						var9[var30] += (var32 >> 8 & 0xFF) - (var31 >> 8 & 0xFF);
						var8[var30] += (var32 & 0xFF) - (var31 & 0xFF);
					}
					if (var11 == 0) {
						var11 = var14;
					}
					if (var10 == 0) {
						var10 = var14;
					}
				}
				this.field3808 = var7;
			}
		}
		return this.field3808;
	}
}
