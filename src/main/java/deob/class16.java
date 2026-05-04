package deob;

@ObfuscatedName("bd")
public final class class16 {

	@ObfuscatedName("bd.c")
	public static final class88 field238 = class208.method1423(105, "Too many connections from your address)3");

	@ObfuscatedName("bd.d")
	public static int field239;

	@ObfuscatedName("bd.e")
	public static final class88 field240 = class208.method1423(105, "Enter your username (V password)3");

	@ObfuscatedName("bd.f")
	public static final class88 field241 = class208.method1423(105, "<col=ffffff>");

	@ObfuscatedName("bd.g")
	public static class88 field242 = field240;

	@ObfuscatedName("bd.h")
	public static class88 field243 = field238;

	@ObfuscatedName("bd.k")
	public static final class88 field246 = class208.method1423(105, " Sekunde(Xn(Y -Ubertragen)3");

	@ObfuscatedName("bd.l")
	public static final int[][] field247 = new int[5][5000];

	@ObfuscatedName("bd.m")
	public static final int[][] field248 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("bd.n")
	public static int field249;

	@ObfuscatedName("bd.a(ILq;)V")
	public static void method78(class174 arg0) {
		int var1 = arg0.field3439;
		if (var1 == 324) {
			if (class55.field1033 == -1) {
				class166.field3192 = arg0.field3433;
				class55.field1033 = arg0.field3473;
			}
			if (class130.field2441.field3957) {
				arg0.field3473 = class55.field1033;
			} else {
				arg0.field3473 = class166.field3192;
			}
		} else if (var1 == 325) {
			if (class55.field1033 == -1) {
				class166.field3192 = arg0.field3433;
				class55.field1033 = arg0.field3473;
			}
			if (class130.field2441.field3957) {
				arg0.field3473 = class166.field3192;
			} else {
				arg0.field3473 = class55.field1033;
			}
		} else if (var1 == 327) {
			arg0.field3455 = 150;
			arg0.field3509 = (int) (Math.sin((double) class117.field2113 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field3409 = -1;
			arg0.field3430 = 5;
		} else if (var1 == 328) {
			if (class240.field4456.field766 == null) {
				arg0.field3409 = 0;
			} else {
				arg0.field3455 = 150;
				arg0.field3509 = (int) (Math.sin((double) class117.field2113 / 40.0D) * 256.0D) & 0x7FF;
				arg0.field3430 = 5;
				arg0.field3409 = ((int) class240.field4456.field766.method630() << 11) + 2047;
				arg0.field3404 = class240.field4456.field4106;
				arg0.field3379 = class240.field4456.field4127;
			}
		}
	}

	@ObfuscatedName("bd.b(B)V")
	public static void method79() {
		int var0 = class230.field4312.method28(8);
		if (var0 < class55.field1027) {
			for (int var1 = var0; var1 < class55.field1027; var1++) {
				class53.field999[class223.field4196++] = class174.field3428[var1];
			}
		}
		if (var0 > class55.field1027) {
			throw new RuntimeException("gppov1");
		}
		class55.field1027 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class174.field3428[var2];
			class44 var4 = class244.field4491[var3];
			int var5 = class230.field4312.method28(1);
			if (var5 == 0) {
				class174.field3428[class55.field1027++] = var3;
				var4.field4081 = class117.field2113;
			} else {
				int var6 = class230.field4312.method28(2);
				if (var6 == 0) {
					class174.field3428[class55.field1027++] = var3;
					var4.field4081 = class117.field2113;
					class139.field2579[class192.field3702++] = var3;
				} else if (var6 == 1) {
					class174.field3428[class55.field1027++] = var3;
					var4.field4081 = class117.field2113;
					int var7 = class230.field4312.method28(3);
					var4.method1476(false, var7);
					int var8 = class230.field4312.method28(1);
					if (var8 == 1) {
						class139.field2579[class192.field3702++] = var3;
					}
				} else if (var6 == 2) {
					class174.field3428[class55.field1027++] = var3;
					var4.field4081 = class117.field2113;
					int var9 = class230.field4312.method28(3);
					var4.method1476(true, var9);
					int var10 = class230.field4312.method28(3);
					var4.method1476(true, var10);
					int var11 = class230.field4312.method28(1);
					if (var11 == 1) {
						class139.field2579[class192.field3702++] = var3;
					}
				} else if (var6 == 3) {
					class53.field999[class223.field4196++] = var3;
				}
			}
		}
	}
}
