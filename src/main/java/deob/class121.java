package deob;

@ObfuscatedName("la")
public final class class121 {

	@ObfuscatedName("la.a")
	public byte[] field2205;

	@ObfuscatedName("la.b")
	public static final class88[] field2206 = new class88[100];

	@ObfuscatedName("la.c")
	public int field2207;

	@ObfuscatedName("la.d")
	public int field2208;

	@ObfuscatedName("la.e")
	public int field2209;

	@ObfuscatedName("la.f")
	public int field2210;

	@ObfuscatedName("la.g")
	public int field2211;

	@ObfuscatedName("la.h")
	public int field2212;

	@ObfuscatedName("la.i")
	public static int field2213;

	@ObfuscatedName("la.k")
	public int field2215;

	@ObfuscatedName("la.l")
	public byte[] field2216;

	@ObfuscatedName("la.a(Lq;IIBI)V")
	public static void method824(class174 arg0, int arg1, int arg2, int arg3) {
		class219.method1479();
		class72.method480(arg2, arg3, arg2 + arg0.field3380, arg0.field3422 + arg3);
		if (class247.field4512 == 2 || class247.field4512 == 5) {
			class72.method491(arg2, arg3, arg0.field3402, arg0.field3421);
		} else {
			int var4 = class52.field943 + class207.field3930 & 0x7FF;
			int var5 = 464 - class240.field4456.field4121 / 32;
			int var6 = class240.field4456.field4136 / 32 + 48;
			((class169) class110.field2010).method1176(arg2, arg3, arg0.field3380, arg0.field3422, var6, var5, var4, class65.field1185 + 256, arg0.field3402, arg0.field3421);
			for (int var7 = 0; var7 < class50.field930; var7++) {
				int var8 = class139.field2577[var7] * 4 + 2 - class240.field4456.field4136 / 32;
				int var9 = class134.field2501[var7] * 4 + 2 - class240.field4456.field4121 / 32;
				class148 var10 = class190.method1321(class146.field2745[var7]);
				if (var10.field2770 != null) {
					var10 = var10.method998();
					if (var10 == null || var10.field2817 == -1) {
						continue;
					}
				}
				class57.method418(arg3, arg2, var9, arg0, class247.field4525[var10.field2817], var8);
			}
			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					class248 var13 = class134.field2497[class149.field2907][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - class240.field4456.field4136 / 32;
						int var15 = var12 * 4 + 2 - class240.field4456.field4121 / 32;
						class57.method418(arg3, arg2, var15, arg0, class35.field597[0], var14);
					}
				}
			}
			for (int var16 = 0; var16 < class55.field1041; var16++) {
				class191 var17 = class225.field4223[class25.field402[var16]];
				if (var17 != null && var17.method287()) {
					class126 var18 = var17.field3682;
					if (var18 != null && var18.field2327 != null) {
						var18 = var18.method862();
					}
					if (var18 != null && var18.field2357 && var18.field2359) {
						int var19 = var17.field4121 / 32 - class240.field4456.field4121 / 32;
						int var20 = var17.field4136 / 32 - class240.field4456.field4136 / 32;
						class57.method418(arg3, arg2, var19, arg0, class35.field597[1], var20);
					}
				}
			}
			for (int var21 = 0; var21 < class55.field1027; var21++) {
				class44 var22 = class244.field4491[class174.field3428[var21]];
				if (var22 != null && var22.method287()) {
					int var23 = var22.field4136 / 32 - class240.field4456.field4136 / 32;
					int var24 = var22.field4121 / 32 - class240.field4456.field4121 / 32;
					boolean var25 = false;
					long var26 = var22.field766.method630();
					for (int var28 = 0; var28 < class146.field2729; var28++) {
						if (var26 == class115.field2086[var28] && class160.field3092[var28] != 0) {
							var25 = true;
							break;
						}
					}
					boolean var29 = false;
					if (class240.field4456.field752 != 0 && var22.field752 != 0 && class240.field4456.field752 == var22.field752) {
						var29 = true;
					}
					if (var25) {
						class57.method418(arg3, arg2, var24, arg0, class35.field597[3], var23);
					} else if (var29) {
						class57.method418(arg3, arg2, var24, arg0, class35.field597[4], var23);
					} else {
						class57.method418(arg3, arg2, var24, arg0, class35.field597[2], var23);
					}
				}
			}
			class118[] var30 = class64.field1171;
			for (int var31 = 0; var31 < var30.length; var31++) {
				class118 var32 = var30[var31];
				if (var32 != null && var32.field2139 != 0 && class117.field2113 % 20 < 10) {
					if (var32.field2139 == 1 && var32.field2146 >= 0 && var32.field2146 < class225.field4223.length) {
						class191 var33 = class225.field4223[var32.field2146];
						if (var33 != null) {
							int var34 = var33.field4136 / 32 - class240.field4456.field4136 / 32;
							int var35 = var33.field4121 / 32 - class240.field4456.field4121 / 32;
							class241.method1588(arg0, var34, arg3, var35, var32.field2137, arg2);
						}
					}
					if (var32.field2139 == 2) {
						int var36 = (var32.field2138 + -class223.field4212) * 4 + 2 - class240.field4456.field4136 / 32;
						int var37 = (var32.field2135 - class190.field3679) * 4 + 2 - class240.field4456.field4121 / 32;
						class241.method1588(arg0, var36, arg3, var37, var32.field2137, arg2);
					}
					if (var32.field2139 == 10 && var32.field2146 >= 0 && var32.field2146 < class244.field4491.length) {
						class44 var38 = class244.field4491[var32.field2146];
						if (var38 != null) {
							int var39 = var38.field4136 / 32 - class240.field4456.field4136 / 32;
							int var40 = var38.field4121 / 32 - class240.field4456.field4121 / 32;
							class241.method1588(arg0, var39, arg3, var40, var32.field2137, arg2);
						}
					}
				}
			}
			if (class116.field2102 != 0) {
				int var41 = class140.field2594 * 4 + 2 - class240.field4456.field4121 / 32;
				int var42 = class116.field2102 * 4 + 2 - class240.field4456.field4136 / 32;
				class57.method418(arg3, arg2, var41, arg0, class200.field3826, var42);
			}
			class72.method478(arg0.field3380 / 2 + arg2 - 1, arg3 - -(arg0.field3422 / 2) + -1, 3, 3, 16777215);
		}
		class211.field4005[arg1] = true;
	}
}
