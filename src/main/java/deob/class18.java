package deob;

@ObfuscatedName("bf")
public final class class18 extends class145 {

	@ObfuscatedName("bf.o")
	public static int field279 = 100;

	@ObfuscatedName("bf.p")
	public static class22 field280;

	@ObfuscatedName("bf.q")
	public static final class88 field281 = class208.method1423(105, "3D)2Softwarebibliothek gestartet)3");

	@ObfuscatedName("bf.r")
	public class109 field282;

	@ObfuscatedName("bf.v")
	public int field286 = -32768;

	@ObfuscatedName("bf.w")
	public final int field287;

	@ObfuscatedName("bf.y")
	public static final class88 field289 = class208.method1423(105, "(U3");

	@ObfuscatedName("bf.D")
	public static byte field294 = 0;

	@ObfuscatedName("bf.x")
	public static final class88 field288 = class208.method1423(105, "Clientscript error in: ");

	@ObfuscatedName("bf.P")
	public static int field305 = 0;

	@ObfuscatedName("bf.I")
	public int field298 = 0;

	@ObfuscatedName("bf.N")
	public int field303 = 0;

	@ObfuscatedName("bf.M")
	public boolean field302 = false;

	@ObfuscatedName("bf.z")
	public final int field290;

	@ObfuscatedName("bf.G")
	public final int field296;

	@ObfuscatedName("bf.E")
	public final int field295;

	@ObfuscatedName("bf.L")
	public final int field301;

	@ObfuscatedName("bf.B")
	public final int field292;

	@ObfuscatedName("bf.J")
	public static class119 field299;

	@ObfuscatedName("bf.K")
	public static class22 field300;

	@ObfuscatedName("bf.O")
	public static boolean[][] field304;

	@ObfuscatedName("bf.a([Lia;[BIIZI)V")
	public static void method85(class89[] arg0, byte[] arg1, int arg2, int arg3) {
		class46 var4 = new class46(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method332();
			if (var6 == 0) {
				return;
			}
			var5 += var6;
			int var7 = 0;
			while (true) {
				int var8 = var4.method350();
				if (var8 == 0) {
					break;
				}
				var7 += var8 - 1;
				int var9 = var7 & 0x3F;
				int var10 = var7 >> 6 & 0x3F;
				int var11 = var4.method347();
				int var12 = var7 >> 12;
				int var13 = arg3 + var9;
				int var14 = var11 & 0x3;
				int var15 = var10 + arg2;
				int var16 = var11 >> 2;
				if (var15 > 0 && var13 > 0 && var15 < 103 && var13 < 103) {
					class89 var17 = null;
					int var18 = var12;
					if ((class116.field2098[1][var15][var13] & 0x2) == 2) {
						var18 = var12 - 1;
					}
					if (var18 >= 0) {
						var17 = arg0[var18];
					}
					class223.method1503(true, var12, var14, var16, class245.field4497, var5, var12, var17, var13, var15);
				}
			}
		}
	}

	@ObfuscatedName("bf.a(Lu;Z)V")
	public static void method86(class218 arg0) {
		if (arg0.field4102 == 0) {
			return;
		}
		if (arg0.field4114 != -1 && arg0.field4114 < 32768) {
			class191 var1 = class225.field4223[arg0.field4114];
			if (var1 != null) {
				int var2 = arg0.field4121 - var1.field4121;
				int var3 = arg0.field4136 - var1.field4136;
				if (var3 != 0 || var2 != 0) {
					arg0.field4119 = (int) (Math.atan2((double) var3, (double) var2) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field4114 >= 32768) {
			int var4 = arg0.field4114 - 32768;
			if (var4 == class220.field4164) {
				var4 = 2047;
			}
			class44 var5 = class244.field4491[var4];
			if (var5 != null) {
				int var6 = arg0.field4136 - var5.field4136;
				int var7 = arg0.field4121 - var5.field4121;
				if (var6 != 0 || var7 != 0) {
					arg0.field4119 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field4096 != 0 || arg0.field4099 != 0) && (arg0.field4135 == 0 || arg0.field4108 > 0)) {
			int var8 = arg0.field4103 * 64 + arg0.field4121 - (-class190.field3679 + arg0.field4099 + -class190.field3679) * 64 - 64;
			int var9 = arg0.field4136 + (arg0.field4103 - 1) * 64 - (arg0.field4096 - class223.field4212 - class223.field4212) * 64;
			if (var9 != 0 || var8 != 0) {
				arg0.field4119 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
			}
			arg0.field4099 = 0;
			arg0.field4096 = 0;
		}
		int var10 = arg0.field4119 - arg0.field4085 & 0x7FF;
		if (var10 == 0) {
			arg0.field4089 = 0;
			return;
		}
		arg0.field4089++;
		if (var10 > 1024) {
			arg0.field4085 -= arg0.field4102;
			boolean var11 = true;
			if (var10 < arg0.field4102 || 2048 - arg0.field4102 < var10) {
				arg0.field4085 = arg0.field4119;
				var11 = false;
			}
			if (arg0.field4105 == arg0.field4106 && (arg0.field4089 > 25 || var11)) {
				if (arg0.field4091 == -1) {
					arg0.field4106 = arg0.field4092;
				} else {
					arg0.field4106 = arg0.field4091;
				}
			}
		} else {
			arg0.field4085 += arg0.field4102;
			boolean var12 = true;
			if (arg0.field4102 > var10 || 2048 - arg0.field4102 < var10) {
				arg0.field4085 = arg0.field4119;
				var12 = false;
			}
			if (arg0.field4106 == arg0.field4105 && (arg0.field4089 > 25 || var12)) {
				if (arg0.field4128 == -1) {
					arg0.field4106 = arg0.field4092;
				} else {
					arg0.field4106 = arg0.field4128;
				}
			}
		}
		arg0.field4085 &= 0x7FF;
	}

	@ObfuscatedName("bf.a(Lnb;Z)V")
	public static void method91(class144 arg0) {
		class34.field584 = arg0;
	}

	public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field290 = arg3;
		this.field296 = arg2;
		this.field295 = arg4;
		this.field287 = arg6 + arg5;
		this.field301 = arg0;
		this.field292 = arg1;
		int var8 = class62.method441(this.field301).field542;
		if (var8 == -1) {
			this.field302 = true;
		} else {
			this.field302 = false;
			this.field282 = class15.method75(var8);
		}
	}

	@ObfuscatedName("bf.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		class30 var11 = this.method89();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field286 = var11.method88();
		}
	}

	@ObfuscatedName("bf.b()I")
	@Override
	public int method88() {
		return this.field286;
	}

	@ObfuscatedName("bf.a(Z)Lcg;")
	public class30 method89() {
		class33 var1 = class62.method441(this.field301);
		class30 var2;
		if (this.field302) {
			var2 = var1.method209(-1);
		} else {
			var2 = var1.method209(this.field298);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("bf.a(IZ)V")
	public void method90(int arg0) {
		if (this.field302) {
			return;
		}
		this.field303 += arg0;
		while (this.field303 > this.field282.field1990[this.field298]) {
			this.field303 -= this.field282.field1990[this.field298];
			this.field298++;
			if (this.field282.field1965.length <= this.field298) {
				this.field302 = true;
				return;
			}
		}
	}
}
