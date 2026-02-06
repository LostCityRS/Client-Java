package deob;

@ObfuscatedName("rc")
public final class class121 extends class13 {

	@ObfuscatedName("rc.H")
	public static class32 field2863 = class73.method593("Versteckt", true);

	@ObfuscatedName("rc.M")
	public static int[] field2868 = new int[500];

	@ObfuscatedName("rc.S")
	public static class32 field2874 = class73.method593("rot:", true);

	@ObfuscatedName("rc.W")
	public static int[] field2877 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("rc.P")
	public final class42[] field2871;

	@ObfuscatedName("rc.I")
	public static int field2864;

	@ObfuscatedName("rc.V")
	public static class96 field2876;

	@ObfuscatedName("rc.O")
	public static boolean field2870;

	@ObfuscatedName("rc.a(IIIIBI)V")
	public static void method955(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 == class62.field1422 && arg2 == class142.field3251 && (class115.field2743 == arg0 || !class154.field3529)) {
			return;
		}
		class115.field2743 = arg0;
		if (!class154.field3529) {
			class115.field2743 = 0;
		}
		class62.field1422 = arg3;
		class142.field3251 = arg2;
		class54.method425(25);
		class14.method72(class48.field1135, true);
		int var5 = class72.field1700;
		class72.field1700 = arg3 * 8 - 48;
		int var6 = class118.field2836;
		class118.field2836 = (arg2 - 6) * 8;
		int var7 = class72.field1700 - var5;
		int var8 = class118.field2836 - var6;
		for (int var9 = 0; var9 < 32768; var9++) {
			class111 var10 = class14.field230[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.field2759[var11] -= var7;
					var10.field2736[var11] -= var8;
				}
				var10.field2747 -= var7 * 128;
				var10.field2698 -= var8 * 128;
			}
		}
		for (int var12 = 0; var12 < 2048; var12++) {
			class70 var13 = class52.field1175[var12];
			if (var13 != null) {
				for (int var14 = 0; var14 < 10; var14++) {
					var13.field2759[var14] -= var7;
					var13.field2736[var14] -= var8;
				}
				var13.field2747 -= var7 * 128;
				var13.field2698 -= var8 * 128;
			}
		}
		class43.field989 = arg0;
		class20.field373.method902(arg1, false, arg4);
		byte var15 = 0;
		byte var16 = 104;
		byte var17 = 1;
		byte var18 = 0;
		if (var7 < 0) {
			var15 = 103;
			var17 = -1;
			var16 = -1;
		}
		byte var19 = 1;
		byte var20 = 104;
		if (var8 < 0) {
			var18 = 103;
			var20 = -1;
			var19 = -1;
		}
		for (int var21 = var15; var21 != var16; var21 += var17) {
			for (int var22 = var18; var22 != var20; var22 += var19) {
				int var23 = var8 + var22;
				int var24 = var7 + var21;
				for (int var25 = 0; var25 < 4; var25++) {
					if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
						class23.field397[var25][var21][var22] = class23.field397[var25][var24][var23];
					} else {
						class23.field397[var25][var21][var22] = null;
					}
				}
			}
		}
		for (class23 var26 = (class23) class45.field1076.method1211(); var26 != null; var26 = (class23) class45.field1076.method1209()) {
			var26.field405 -= var7;
			var26.field420 -= var8;
			if (var26.field405 < 0 || var26.field420 < 0 || var26.field405 >= 104 || var26.field420 >= 104) {
				var26.method1091();
			}
		}
		if (class45.field1066 != 0) {
			class45.field1066 -= var7;
			class31.field615 -= var8;
		}
		class23.field418 = false;
		class143.field3277 = 0;
		class5.field92 = -1;
		class157.field3594.method1204();
		class88.field2038.method1204();
	}

	@ObfuscatedName("rc.e(I)V")
	public static void method956() {
		class80 var0 = class38.field919;
		synchronized (class38.field919) {
			class1.field8 = class39.field936;
			if (class14.field231 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					class107.field2540[var1] = false;
				}
				class14.field231 = class114.field2660;
			} else {
				while (class114.field2660 != class14.field231) {
					int var2 = class4.field55[class114.field2660];
					class114.field2660 = class114.field2660 + 1 & 0x7F;
					if (var2 >= 0) {
						class107.field2540[var2] = true;
					} else {
						class107.field2540[~var2] = false;
					}
				}
			}
			class39.field936 = class62.field1396;
		}
	}

	@ObfuscatedName("rc.f(I)V")
	public static void method957() {
		field2868 = null;
		field2874 = null;
		field2877 = null;
		field2863 = null;
		field2876 = null;
	}

	@ObfuscatedName("rc.b(II)I")
	public static int method959(int arg0) {
		int var1 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
		int var3 = var2 + (var2 >>> 4) & 0xF0F0F0F;
		int var4 = var3 + (var3 >>> 8);
		int var5 = var4 + (var4 >>> 16);
		return var5 & 0xFF;
	}

	public class121(class30 arg0, class30 arg1, int arg2, boolean arg3) {
		class157 var5 = new class157();
		int var6 = arg0.method200(arg2);
		this.field2871 = new class42[var6];
		int[] var7 = arg0.method207(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			class92 var9 = null;
			byte[] var10 = arg0.method206(arg2, var7[var8]);
			int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
			for (class92 var12 = (class92) var5.method1211(); var12 != null; var12 = (class92) var5.method1209()) {
				if (var11 == var12.field2108) {
					var9 = var12;
					break;
				}
			}
			if (var9 == null) {
				byte[] var13 = arg1.method217(0, var11);
				var9 = new class92(var11, var13);
				var5.method1214(var9);
			}
			this.field2871[var7[var8]] = new class42(var10, var9);
		}
	}

	@ObfuscatedName("rc.a(IB)Z")
	public boolean method958(int arg0) {
		return this.field2871[arg0].field977;
	}
}
