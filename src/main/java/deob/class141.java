package deob;

@ObfuscatedName("mj")
public final class class141 {

	@ObfuscatedName("mj.a")
	public int[] field2599;

	@ObfuscatedName("mj.e")
	public int field2603 = -1;

	@ObfuscatedName("mj.f")
	public class88[] field2604;

	@ObfuscatedName("mj.g")
	public class247 field2605;

	@ObfuscatedName("mj.h")
	public static final class24 field2606 = new class24(5);

	@ObfuscatedName("mj.i")
	public static class144 field2607;

	@ObfuscatedName("mj.j")
	public static final long[] field2608 = new long[256];

	@ObfuscatedName("mj.k")
	public static int[] field2609;

	@ObfuscatedName("mj.l")
	public static int field2610;

	@ObfuscatedName("mj.m")
	public static final short[][] field2611;

	@ObfuscatedName("mj.n")
	public static final class88 field2612;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			long var1 = (long) var0;
			for (int var3 = 0; var3 < 8; var3++) {
				if ((var1 & 0x1L) == 1L) {
					var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var1 >>>= 0x1;
				}
			}
			field2608[var0] = var1;
		}
		field2612 = class208.method1423(105, ")3");
		field2611 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
		field2610 = 0;
	}

	@ObfuscatedName("mj.a(IZILrf;)V")
	public static void method925(int arg0, int arg1, class191 arg2) {
		if (arg0 == arg2.field4077 && arg0 != -1) {
			class109 var3 = class15.method75(arg0);
			int var4 = var3.field1966;
			if (var4 == 1) {
				arg2.field4132 = 0;
				arg2.field4098 = 0;
				arg2.field4140 = arg1;
				arg2.field4101 = 0;
				class60.method433(false, arg2.field4121, arg2.field4101, arg2.field4136, var3);
			}
			if (var4 == 2) {
				arg2.field4132 = 0;
			}
		} else if (arg0 == -1 || arg2.field4077 == -1 || class15.method75(arg0).field1999 >= class15.method75(arg2.field4077).field1999) {
			arg2.field4098 = 0;
			arg2.field4140 = arg1;
			arg2.field4137 = arg2.field4135;
			arg2.field4101 = 0;
			arg2.field4132 = 0;
			arg2.field4077 = arg0;
			if (arg2.field4077 != -1) {
				class60.method433(false, arg2.field4121, arg2.field4101, arg2.field4136, class15.method75(arg2.field4077));
			}
		}
	}

	@ObfuscatedName("mj.a(II)Li;")
	public static class88 method926(int arg0) {
		return class166.method1140(new class88[] { class170.method1212(arg0 >> 24 & 0xFF), field2612, class170.method1212(arg0 >> 16 & 0xFF), field2612, class170.method1212(arg0 >> 8 & 0xFF), field2612, class170.method1212(arg0 & 0xFF) });
	}
}
