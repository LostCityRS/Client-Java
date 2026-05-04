package deob;

@ObfuscatedName("m")
public final class class131 {

	@ObfuscatedName("m.d")
	public static final class88 field2446 = class208.method1423(105, "Lade Schrifts-=tze )2 ");

	@ObfuscatedName("m.e")
	public static final class92 field2447 = new class92(64);

	@ObfuscatedName("m.h")
	public int field2450;

	@ObfuscatedName("m.j")
	public static final class88 field2452 = class208.method1423(105, "Update)2Liste geladen)3");

	@ObfuscatedName("m.l")
	public int field2454;

	@ObfuscatedName("m.m")
	public int field2455;

	@ObfuscatedName("m.n")
	public byte field2456;

	@ObfuscatedName("m.o")
	public int field2457;

	@ObfuscatedName("m.q")
	public int field2459;

	@ObfuscatedName("m.r")
	public static boolean field2460 = false;

	@ObfuscatedName("m.s")
	public static final class248 field2461 = new class248();

	@ObfuscatedName("m.a(II)V")
	public static void method881(int arg0) {
		if (arg0 == class229.field4284) {
			return;
		}
		if (class229.field4284 == 0) {
			class134.method894();
		}
		if (arg0 == 20 || arg0 == 40) {
			class117.field2117 = 0;
			class6.field71 = 0;
			class196.field3758 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && class89.field1665 != null) {
			class89.field1665.method917();
			class89.field1665 = null;
		}
		if (class229.field4284 == 25) {
			class113.field2045 = 0;
			class203.field3861 = 0;
			class146.field2751 = 1;
			class143.field2652 = 1;
			class196.field3754 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			class184.method1298(class9.field137, class154.field2975, class226.field4243);
		} else {
			class202.method1384();
		}
		class229.field4284 = arg0;
	}

	@ObfuscatedName("m.a(IB)I")
	public static int method883(int arg0) {
		return arg0 == 16711935 ? -1 : class234.method1559(arg0);
	}

	@ObfuscatedName("m.a(B)I")
	public static int method885() {
		int var0 = 3;
		if (class207.field3934 < 310) {
			int var1 = class79.field1428 >> 7;
			int var2 = class184.field3608 >> 7;
			int var3 = class240.field4456.field4136 >> 7;
			if ((class116.field2098[class149.field2907][var1][var2] & 0x4) != 0) {
				var0 = class149.field2907;
			}
			int var4;
			if (var1 < var3) {
				var4 = var3 - var1;
			} else {
				var4 = var1 - var3;
			}
			int var5 = class240.field4456.field4121 >> 7;
			int var6;
			if (var5 > var2) {
				var6 = var5 - var2;
			} else {
				var6 = var2 - var5;
			}
			if (var6 >= var4) {
				int var7 = var4 * 65536 / var6;
				int var8 = 32768;
				while (var5 != var2) {
					if (var5 > var2) {
						var2++;
					} else if (var2 > var5) {
						var2--;
					}
					var8 += var7;
					if ((class116.field2098[class149.field2907][var1][var2] & 0x4) != 0) {
						var0 = class149.field2907;
					}
					if (var8 >= 65536) {
						var8 -= 65536;
						if (var3 > var1) {
							var1++;
						} else if (var3 < var1) {
							var1--;
						}
						if ((class116.field2098[class149.field2907][var1][var2] & 0x4) != 0) {
							var0 = class149.field2907;
						}
					}
				}
			} else {
				int var9 = var6 * 65536 / var4;
				int var10 = 32768;
				while (var1 != var3) {
					if (var1 < var3) {
						var1++;
					} else if (var1 > var3) {
						var1--;
					}
					var10 += var9;
					if ((class116.field2098[class149.field2907][var1][var2] & 0x4) != 0) {
						var0 = class149.field2907;
					}
					if (var10 >= 65536) {
						if (var2 < var5) {
							var2++;
						} else if (var2 > var5) {
							var2--;
						}
						if ((class116.field2098[class149.field2907][var1][var2] & 0x4) != 0) {
							var0 = class149.field2907;
						}
						var10 -= 65536;
					}
				}
			}
		}
		if ((class116.field2098[class149.field2907][class240.field4456.field4136 >> 7][class240.field4456.field4121 >> 7] & 0x4) != 0) {
			var0 = class149.field2907;
		}
		return var0;
	}

	public class131() {
	}

	public class131(class46 arg0) {
		this.field2456 = arg0.method324();
		this.field2455 = arg0.method301();
		this.field2454 = arg0.method323();
		this.field2450 = arg0.method323();
		this.field2457 = arg0.method323();
		this.field2459 = arg0.method323();
	}

	@ObfuscatedName("m.a(I)I")
	public int method882() {
		return (this.field2456 & 0x8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("m.b(B)I")
	public int method886() {
		return this.field2456 & 0x7;
	}
}
