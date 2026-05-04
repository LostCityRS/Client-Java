package deob;

@ObfuscatedName("od")
public final class class156 extends class67 {

	@ObfuscatedName("od.t")
	public static long field3004;

	@ObfuscatedName("od.u")
	public static final class88 field3005 = class208.method1423(105, "Das ist eine Mitglieder)2Welt(Q");

	@ObfuscatedName("od.v")
	public final int field3006;

	@ObfuscatedName("od.w")
	public static int field3007;

	@ObfuscatedName("od.z")
	public static final class88 field3010 = class208.method1423(105, "(U0a )2 in: ");

	@ObfuscatedName("od.D")
	public static final class88 field3013 = class208.method1423(105, " weitere Optionen");

	@ObfuscatedName("od.y")
	public static final class88 field3009 = class208.method1423(105, ":tradereq:");

	@ObfuscatedName("od.G")
	public static int field3016 = 0;

	@ObfuscatedName("od.F")
	public final int field3015;

	@ObfuscatedName("od.x")
	public static class144 field3008;

	@ObfuscatedName("od.C")
	public static int[] field3012;

	@ObfuscatedName("od.E")
	public static int[] field3014;

	@ObfuscatedName("od.a(IIII)I")
	public static int method1058(int arg0, int arg1, int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg2 > arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@ObfuscatedName("od.a(Lf;IIIIIIZ)V")
	public static void method1060(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		int var8 = arg0.field1069.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg0.field1069[var9] - class74.field1353;
			int var11 = arg0.field1064[var9] - class241.field4461;
			int var12 = arg0.field1053[var9] - class216.field4048;
			int var13 = var12 * arg3 + var10 * arg4 >> 16;
			int var14 = var12 * arg4 - var10 * arg3 >> 16;
			int var16 = var11 * arg2 - var14 * arg1 >> 16;
			int var17 = var11 * arg1 + var14 * arg2 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg0.field1063 != null) {
				class56.field1058[var9] = var13;
				class56.field1072[var9] = var16;
				class56.field1057[var9] = var17;
			}
			class56.field1055[var9] = class173.field3363 + (var13 << 9) / var17;
			class56.field1062[var9] = class173.field3361 + (var16 << 9) / var17;
		}
		class173.field3348 = 0;
		int var18 = arg0.field1074.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg0.field1074[var19];
			int var21 = arg0.field1056[var19];
			int var22 = arg0.field1054[var19];
			int var23 = class56.field1055[var20];
			int var24 = class56.field1055[var21];
			int var25 = class56.field1055[var22];
			int var26 = class56.field1062[var20];
			int var27 = class56.field1062[var21];
			int var28 = class56.field1062[var22];
			if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
				if (class118.field2145 && class23.method122(class39.field698 + class173.field3363, class35.field621 + class173.field3361, var26, var27, var28, var23, var24, var25)) {
					class114.field2057 = arg5;
					class90.field1714 = arg6;
				}
				if (!arg7) {
					class173.field3358 = false;
					if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > class173.field3350 || var24 > class173.field3350 || var25 > class173.field3350) {
						class173.field3358 = true;
					}
					if (arg0.field1063 == null || arg0.field1063[var19] == -1) {
						if (arg0.field1073[var19] != 12345678) {
							class173.method1227(var26, var27, var28, var23, var24, var25, arg0.field1073[var19], arg0.field1070[var19], arg0.field1060[var19]);
						}
					} else if (class104.field1882) {
						int var29 = class173.field3356.method438(arg0.field1063[var19]);
						class173.method1227(var26, var27, var28, var23, var24, var25, class117.method791(var29, arg0.field1073[var19]), class117.method791(var29, arg0.field1070[var19]), class117.method791(var29, arg0.field1060[var19]));
					} else if (arg0.field1068) {
						class173.method1225(var26, var27, var28, var23, var24, var25, arg0.field1073[var19], arg0.field1070[var19], arg0.field1060[var19], class56.field1058[0], class56.field1058[1], class56.field1058[3], class56.field1072[0], class56.field1072[1], class56.field1072[3], class56.field1057[0], class56.field1057[1], class56.field1057[3], arg0.field1063[var19]);
					} else {
						class173.method1225(var26, var27, var28, var23, var24, var25, arg0.field1073[var19], arg0.field1070[var19], arg0.field1060[var19], class56.field1058[var20], class56.field1058[var21], class56.field1058[var22], class56.field1072[var20], class56.field1072[var21], class56.field1072[var22], class56.field1057[var20], class56.field1057[var21], class56.field1057[var22], arg0.field1063[var19]);
					}
				}
			}
		}
	}

	public class156(int arg0, int arg1) {
		this.field3006 = arg1;
		this.field3015 = arg0;
	}
}
