package deob;

@ObfuscatedName("of")
public final class class158 {

	@ObfuscatedName("of.c")
	public static final class92 field3038 = new class92(64);

	@ObfuscatedName("of.d")
	public static class144 field3039;

	@ObfuscatedName("of.e")
	public static final class88 field3040 = class208.method1423(105, "Attack");

	@ObfuscatedName("of.f")
	public static class88 field3041 = field3040;

	@ObfuscatedName("of.i")
	public static volatile int field3044 = 0;

	@ObfuscatedName("of.j")
	public static final class88 field3045 = class208.method1423(105, "p12_full");

	@ObfuscatedName("of.l")
	public static final class88 field3047 = class208.method1423(105, "Ok");

	@ObfuscatedName("of.h")
	public static class88 field3043 = field3047;

	@ObfuscatedName("of.m")
	public static final class88 field3048 = class208.method1423(105, "Einloggen");

	@ObfuscatedName("of.a(ZIII)V")
	public static void method1064(int arg0, int arg1, int arg2) {
		class174 var3 = class36.method238(arg2, arg0);
		if (var3 != null && var3.field3447 != null) {
			class39 var4 = new class39();
			var4.field678 = var3;
			var4.field681 = var3.field3447;
			class200.method1373(var4);
		}
		class10.field145 = true;
		client.field569 = arg2;
		class115.field2084 = arg1;
		class16.field249 = arg0;
		class200.method1371(var3);
	}

	@ObfuscatedName("of.a(IIII)I")
	public static int method1066(int arg0, int arg1, int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg2 >> 5 << 7);
	}

	@ObfuscatedName("of.a(ZIZ)I")
	public static int method1067() {
		return class208.field3943 + class203.field3876;
	}

	@ObfuscatedName("of.a(II)V")
	public static void method1068(int arg0) {
		class127.method867();
		class8.method44();
		int var1 = class106.method732(arg0).field4288;
		if (var1 == 0) {
			return;
		}
		int var2 = class113.field2050[arg0];
		if (var1 == 1) {
			class175.field3528 = var2;
			if (class175.field3528 == 1) {
				class173.method1224(0.9F);
			}
			if (class175.field3528 == 2) {
				class173.method1224(0.8F);
			}
			if (class175.field3528 == 3) {
				class173.method1224(0.7F);
			}
			if (class175.field3528 == 4) {
				class173.method1224(0.6F);
			}
			class204.method1399();
		}
		if (var1 == 3) {
			short var3 = 0;
			if (var2 == 0) {
				var3 = 255;
			}
			if (var2 == 1) {
				var3 = 192;
			}
			if (var2 == 2) {
				var3 = 128;
			}
			if (var2 == 3) {
				var3 = 64;
			}
			if (var2 == 4) {
				var3 = 0;
			}
			if (class65.field1183 != var3) {
				if (class65.field1183 == 0 && class2.field25 != -1) {
					class53.method388(class99.field1814, class2.field25, var3);
					class110.field2012 = false;
				} else if (var3 == 0) {
					class1.method5();
					class110.field2012 = false;
				} else {
					class103.method712(var3);
				}
				class65.field1183 = var3;
			}
		}
		if (var1 == 6) {
			class137.field2548 = var2;
		}
		if (var1 == 9) {
			class155.field2991 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				class119.field2172 = 127;
			}
			if (var2 == 1) {
				class119.field2172 = 96;
			}
			if (var2 == 2) {
				class119.field2172 = 64;
			}
			if (var2 == 3) {
				class119.field2172 = 32;
			}
			if (var2 == 4) {
				class119.field2172 = 0;
			}
		}
		if (var1 == 10) {
			if (var2 == 0) {
				class223.field4211 = 127;
			}
			if (var2 == 1) {
				class223.field4211 = 96;
			}
			if (var2 == 2) {
				class223.field4211 = 64;
			}
			if (var2 == 3) {
				class223.field4211 = 32;
			}
			if (var2 == 4) {
				class223.field4211 = 0;
			}
		}
		if (var1 == 5) {
			class203.field3859 = var2;
		}
	}
}
