package deob;

@ObfuscatedName("kd")
public final class class113 extends class23 {

	@ObfuscatedName("kd.ab")
	public static final class88 field2046 = class208.method1423(105, "Benutzen Sie bitte eine andere Welt)3");

	@ObfuscatedName("kd.db")
	public static int[] field2049;

	@ObfuscatedName("kd.eb")
	public static final int[] field2050 = new int[2000];

	@ObfuscatedName("kd.fb")
	public int field2051 = 1024;

	@ObfuscatedName("kd.X")
	public static final boolean[] field2043 = new boolean[100];

	@ObfuscatedName("kd.S")
	public static final class88 field2038 = class208.method1423(105, "Connection lost)3");

	@ObfuscatedName("kd.Z")
	public static int field2045 = 0;

	@ObfuscatedName("kd.U")
	public static class88 field2040 = field2038;

	@ObfuscatedName("kd.T")
	public static final class92 field2039 = new class92(200);

	@ObfuscatedName("kd.Y")
	public int field2044 = 3072;

	@ObfuscatedName("kd.Q")
	public int field2036 = 2048;

	@ObfuscatedName("kd.V")
	public static class188[] field2041;

	@ObfuscatedName("kd.a(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= class48.field899 * 128) {
			arg0 = class48.field899 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= class66.field1202 * 128) {
			arg2 = class66.field1202 * 128 - 1;
		}
		class99.field1803 = class173.field3359[arg3];
		class201.field3838 = class173.field3354[arg3];
		class168.field3242 = class173.field3359[arg4];
		class159.field3066 = class173.field3354[arg4];
		class74.field1353 = arg0;
		class241.field4461 = arg1;
		class216.field4048 = arg2;
		class79.field1435 = arg0 / 128;
		class88.field1636 = arg2 / 128;
		class155.field2993 = arg5;
		class156.field3007 = class79.field1435 - class150.field2911;
		if (class156.field3007 < 0) {
			class156.field3007 = 0;
		}
		class102.field1849 = class88.field1636 - class150.field2911;
		if (class102.field1849 < 0) {
			class102.field1849 = 0;
		}
		class6.field84 = class79.field1435 + class150.field2911;
		if (class6.field84 > class48.field899) {
			class6.field84 = class48.field899;
		}
		class230.field4314 = class88.field1636 + class150.field2911;
		if (class230.field4314 > class66.field1202) {
			class230.field4314 = class66.field1202;
		}
		for (int var14 = 0; var14 < class150.field2911 + class150.field2911 + 2; var14++) {
			for (int var15 = 0; var15 < class150.field2911 + class150.field2911 + 2; var15++) {
				int var16 = (var14 - class150.field2911 << 7) - (class74.field1353 & 0x7F);
				int var17 = (var15 - class150.field2911 << 7) - (class216.field4048 & 0x7F);
				int var18 = class79.field1435 + var14 - class150.field2911;
				int var19 = class88.field1636 + var15 - class150.field2911;
				if (var18 >= 0 && var19 >= 0 && var18 < class48.field899 && var19 < class66.field1202) {
					int var20;
					if (class154.field2979 == null) {
						var20 = class145.field2721[0][var18][var19] + 128 - class241.field4461;
					} else {
						var20 = class154.field2979[0][var18][var19] + 128 - class241.field4461;
					}
					int var21 = class145.field2721[3][var18][var19] - class241.field4461 - 1000;
					class48.field893[var14][var15] = class203.method1389(var16, var21, var20, var17);
				} else {
					class48.field893[var14][var15] = false;
				}
			}
		}
		for (int var22 = 0; var22 < class150.field2911 + class150.field2911 + 1; var22++) {
			for (int var23 = 0; var23 < class150.field2911 + class150.field2911 + 1; var23++) {
				class18.field304[var22][var23] = class48.field893[var22][var23] || class48.field893[var22 + 1][var23] || class48.field893[var22][var23 + 1] || class48.field893[var22 + 1][var23 + 1];
			}
		}
		class246.field4510 = arg7;
		class44.field740 = arg8;
		class184.field3605 = arg9;
		class144.field2713 = arg10;
		class204.field3882 = arg11;
		class192.method1331();
		class118.method803(arg0, arg1, arg2, arg6, arg12, arg13);
	}

	@ObfuscatedName("kd.f(I)V")
	public static void method773() {
		for (class159 var0 = (class159) class62.field1140.method1610(); var0 != null; var0 = (class159) class62.field1140.method1619()) {
			if (var0.field3061 > 0) {
				var0.field3061--;
			}
			if (var0.field3061 != 0) {
				if (var0.field3054 > 0) {
					var0.field3054--;
				}
				if (var0.field3054 == 0 && var0.field3059 >= 1 && var0.field3052 >= 1 && var0.field3059 <= 102 && var0.field3052 <= 102 && (var0.field3051 < 0 || class8.method43(var0.field3062, var0.field3051))) {
					class114.method781(var0.field3055, var0.field3063, var0.field3052, var0.field3062, var0.field3051, var0.field3068, var0.field3059);
					var0.field3054 = -1;
					if (var0.field3051 == var0.field3053 && var0.field3053 == -1) {
						var0.method460();
					} else if (var0.field3051 == var0.field3053 && var0.field3064 == var0.field3068 && var0.field3060 == var0.field3062) {
						var0.method460();
					}
				}
			} else if (var0.field3053 < 0 || class8.method43(var0.field3060, var0.field3053)) {
				class114.method781(var0.field3055, var0.field3063, var0.field3052, var0.field3060, var0.field3053, var0.field3064, var0.field3059);
				var0.method460();
			}
		}
	}

	@ObfuscatedName("kd.c(IIIIIIII)V")
	public static void method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
			return;
		}
		if (arg2 == 0) {
			class157 var7 = class192.method1332(arg4, arg1, arg5);
			if (var7 != null) {
				int var8 = Integer.MAX_VALUE & (int) (var7.field3028 >>> 32);
				if (arg0 == 2) {
					var7.field3021 = new class81(var8, 2, arg3 + 4, arg4, arg1, arg5, arg6, false, var7.field3021);
					var7.field3032 = new class81(var8, 2, arg3 + 1 & 0x3, arg4, arg1, arg5, arg6, false, var7.field3032);
				} else {
					var7.field3021 = new class81(var8, arg0, arg3, arg4, arg1, arg5, arg6, false, var7.field3021);
				}
			}
		}
		if (arg2 == 1) {
			class64 var9 = class78.method522(arg4, arg1, arg5);
			if (var9 != null) {
				int var10 = (int) (var9.field1158 >>> 32) & Integer.MAX_VALUE;
				if (arg0 == 4 || arg0 == 5) {
					var9.field1159 = new class81(var10, 4, arg3, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 6) {
					var9.field1159 = new class81(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 7) {
					var9.field1159 = new class81(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 8) {
					var9.field1159 = new class81(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
					var9.field1160 = new class81(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.field1160);
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 11) {
				arg0 = 10;
			}
			class108 var11 = class204.method1396(arg4, arg1, arg5);
			if (var11 != null) {
				var11.field1943 = new class81((int) (var11.field1948 >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg4, arg1, arg5, arg6, false, var11.field1943);
			}
		}
		if (arg2 != 3) {
			return;
		}
		class166 var12 = class54.method397(arg4, arg1, arg5);
		if (var12 != null) {
			var12.field3194 = new class81((int) (var12.field3202 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg1, arg5, arg6, false, var12.field3194);
			return;
		}
	}

	public class113() {
		super(1, false);
	}

	@ObfuscatedName("kd.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[2];
			int[] var6 = var3[0];
			int[] var7 = var2[2];
			int[] var8 = var2[0];
			int[] var9 = var2[1];
			for (int var10 = 0; var10 < class70.field1276; var10++) {
				var8[var10] = this.field2051 + (var6[var10] * this.field2036 >> 12);
				var9[var10] = (this.field2036 * var4[var10] >> 12) + this.field2051;
				var7[var10] = this.field2051 + (this.field2036 * var5[var10] >> 12);
			}
		}
		return var2;
	}

	@ObfuscatedName("kd.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				var2[var4] = this.field2051 + (this.field2036 * var3[var4] >> 12);
			}
		}
		return var2;
	}

	@ObfuscatedName("kd.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2051 = arg0.method301();
		} else if (arg1 == 1) {
			this.field2044 = arg0.method301();
		} else if (arg1 == 2) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("kd.b(B)V")
	@Override
	public void method123() {
		this.field2036 = this.field2044 - this.field2051;
	}
}
