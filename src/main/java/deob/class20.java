package deob;

@ObfuscatedName("ce")
public final class class20 {

	@ObfuscatedName("ce.a")
	public static class32 field364 = class73.method593("Musik)2Engine vorbereitet)3", true);

	@ObfuscatedName("ce.b")
	public static class32 field365 = class73.method593(" steht bereits auf Ihrer Freunde)2Liste(Q", true);

	@ObfuscatedName("ce.c")
	public static int[] field366 = new int[100];

	@ObfuscatedName("ce.e")
	public static int field368;

	@ObfuscatedName("ce.f")
	public static class51 field369;

	@ObfuscatedName("ce.h")
	public static int field371 = 0;

	@ObfuscatedName("ce.i")
	public static class32 field372 = class73.method593("::noclip", true);

	@ObfuscatedName("ce.j")
	public static class70 field373;

	@ObfuscatedName("ce.a(I)V")
	public static void method135() {
		field365 = null;
		field364 = null;
		field369 = null;
		field366 = null;
		field373 = null;
		field372 = null;
	}

	@ObfuscatedName("ce.a(ILec;)I")
	public static int method136(class32 arg0) {
		if (field371 == 1) {
			return 7;
		} else if (arg0.method262(class131.field3012)) {
			return 1;
		} else if (arg0.method262(class128.field2940)) {
			return 1;
		} else if (arg0.method262(class119.field2843)) {
			return 2;
		} else if (arg0.method262(class149.field3379)) {
			return 2;
		} else if (arg0.method262(class38.field926)) {
			return 3;
		} else if (arg0.method262(class54.field1271)) {
			return 4;
		} else if (arg0.method262(class3.field48)) {
			return 4;
		} else if (arg0.method262(class135.field3136)) {
			return 5;
		} else if (arg0.method262(class157.field3592)) {
			return 6;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ce.a(Z)V")
	public static void method137() {
		for (int var0 = 0; var0 < class143.field3277; var0++) {
			int var10002 = class112.field2626[var0]--;
			if (class112.field2626[var0] >= -10) {
				class123 var2 = class65.field1509[var0];
				if (var2 == null) {
					var2 = class123.method972(class1.field6, class53.field1195[var0], 0);
					if (var2 == null) {
						continue;
					}
					class112.field2626[var0] += var2.method969();
					class65.field1509[var0] = var2;
				}
				if (class112.field2626[var0] < 0) {
					int var3;
					if (class114.field2672[var0] == 0) {
						var3 = class70.field1629;
					} else {
						int var4 = (class114.field2672[var0] & 0xFF) * 128;
						int var5 = class114.field2672[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - field373.field2747;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = class114.field2672[var0] >> 8 & 0xFF;
						int var8 = var7 * 128 + 64 - field373.field2698;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							class112.field2626[var0] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = class114.field2646 * (var4 - var9) / var4;
					}
					if (var3 > 0) {
						class58 var10 = var2.method971().method453(class130.field3007);
						class90 var11 = class90.method686(var10, var3);
						var11.method684(class126.field2923[var0] - 1);
						class37.field881.method912(var11);
					}
					class112.field2626[var0] = -100;
				}
			} else {
				class143.field3277--;
				for (int var1 = var0; var1 < class143.field3277; var1++) {
					class53.field1195[var1] = class53.field1195[var1 + 1];
					class65.field1509[var1] = class65.field1509[var1 + 1];
					class126.field2923[var1] = class126.field2923[var1 + 1];
					class112.field2626[var1] = class112.field2626[var1 + 1];
					class114.field2672[var1] = class114.field2672[var1 + 1];
				}
				var0--;
			}
		}
		if (class112.field2621 && !class29.method197()) {
			if (class158.field3638 != 0 && class12.field206 != -1) {
				class154.method1195(class124.field2887, class12.field206, class158.field3638, 0);
			}
			class112.field2621 = false;
		}
	}
}
