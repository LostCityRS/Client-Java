package deob;

@ObfuscatedName("re")
public final class class190 {

	@ObfuscatedName("re.a")
	public static int[] field3667;

	@ObfuscatedName("re.b")
	public static volatile int field3668 = 0;

	@ObfuscatedName("re.f")
	public static class22 field3672;

	@ObfuscatedName("re.g")
	public static final int[][] field3673 = new int[104][104];

	@ObfuscatedName("re.h")
	public static final int[] field3674 = new int[5];

	@ObfuscatedName("re.m")
	public static int field3679;

	@ObfuscatedName("re.n")
	public static class137 field3680;

	@ObfuscatedName("re.a(II)Lnf;")
	public static class148 method1321(int arg0) {
		class148 var1 = (class148) class179.field3558.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class200.field3827.method939(class194.method1344(arg0), class160.method1077(arg0));
		class148 var3 = new class148();
		var3.field2831 = arg0;
		if (var2 != null) {
			var3.method1002(new class46(var2));
		}
		var3.method1003();
		if (!class20.field317 && var3.field2834) {
			var3.field2816 = null;
		}
		if (var3.field2803) {
			var3.field2819 = 0;
			var3.field2789 = false;
		}
		class179.field3558.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("re.a(IILnb;B)[Lrh;")
	public static class193[] method1322(int arg0, int arg1, class144 arg2) {
		return class47.method358(arg2, arg0, arg1) ? class174.method1243() : null;
	}

	@ObfuscatedName("re.a(B)[Llj;")
	public static class130[] method1323() {
		class130[] var0 = new class130[class172.field3345];
		for (int var1 = 0; var1 < class172.field3345; var1++) {
			var0[var1] = new class193(class15.field229, class129.field2424, class247.field4528[var1], class135.field2510[var1], class102.field1851[var1], class67.field1218[var1], class116.field2104[var1], class27.field456);
		}
		class239.method1578();
		return var0;
	}

	@ObfuscatedName("re.a(Lnb;I)V")
	public static void method1324(class144 arg0) {
		client.field567 = arg0;
	}

	@ObfuscatedName("re.a(IBLnb;I)[Llj;")
	public static class130[] method1325(int arg0, class144 arg1, int arg2) {
		return class47.method358(arg1, arg0, arg2) ? method1323() : null;
	}

	@ObfuscatedName("re.a(ZZ)V")
	public static void method1327() {
		byte[][] var0 = class45.field774;
		int var1 = class167.field3221.length;
		for (int var2 = 0; var2 < var1; var2++) {
			byte[] var3 = var0[var2];
			if (var3 != null) {
				int var4 = (class146.field2731[var2] >> 8) * 64 - class223.field4212;
				int var5 = (class146.field2731[var2] & 0xFF) * 64 - field3679;
				class219.method1479();
				class18.method85(class166.field3200, var3, var4, var5);
			}
		}
	}

	@ObfuscatedName("re.b(I)V")
	public static void method1328() {
		if (class245.field4497 && class149.field2907 != class157.field3026) {
			class120.method820(class149.field2907, class240.field4456.field4141[0], class140.field2595, class110.field2014, class240.field4456.field4087[0]);
		} else if (class149.field2907 != class172.field3336) {
			class172.field3336 = class149.field2907;
			class242.method1595(class149.field2907);
		}
	}
}
