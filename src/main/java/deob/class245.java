package deob;

@ObfuscatedName("wf")
public final class class245 {

	@ObfuscatedName("wf.a")
	public static int[][] field4496;

	@ObfuscatedName("wf.b")
	public static boolean field4497 = false;

	@ObfuscatedName("wf.e")
	public static class188 field4500;

	@ObfuscatedName("wf.g")
	public static int field4502 = -1;

	@ObfuscatedName("wf.a(IIII)V")
	public static void method1602(int arg0, int arg1, int arg2, int arg3) {
		class52 var4 = class29.field489[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		class64 var5 = var4.field956;
		if (var5 != null) {
			var5.field1169 = var5.field1169 * arg3 / 16;
			var5.field1167 = var5.field1167 * arg3 / 16;
		}
	}

	@ObfuscatedName("wf.a(I)V")
	public static void method1604() {
		int var0 = class126.field2330 - (int) ((double) class90.field1706.field3380 / class59.field1110);
		int var1 = class157.field3033 - (int) ((double) class90.field1706.field3422 / class59.field1110);
		int var2 = class126.field2330 + (int) ((double) class90.field1706.field3380 / class59.field1110);
		if (var0 < 0) {
			class126.field2330 = (int) ((double) class90.field1706.field3380 / class59.field1110);
			class189.field3659 = -1;
			class34.field594 = -1;
		}
		if (class109.field1988 < var2) {
			class126.field2330 = class109.field1988 - (int) ((double) class90.field1706.field3380 / class59.field1110);
			class34.field594 = -1;
			class189.field3659 = -1;
		}
		int var3 = (int) ((double) class90.field1706.field3422 / class59.field1110) + class157.field3033;
		if (var1 < 0) {
			class157.field3033 = (int) ((double) class90.field1706.field3422 / class59.field1110);
			class189.field3659 = -1;
			class34.field594 = -1;
		}
		if (var3 > class44.field760) {
			class157.field3033 = class44.field760 - (int) ((double) class90.field1706.field3422 / class59.field1110);
			class189.field3659 = -1;
			class34.field594 = -1;
		}
	}

	@ObfuscatedName("wf.b(I)V")
	public static void method1605() {
		if (!class108.field1958) {
			class53.field994[0] = 1007;
			class66.field1191[0] = class6.field76;
			class203.field3862 = 1;
			class201.field3836[0] = class174.field3453;
		}
		if (class43.field723 != -1) {
			class217.method1471(class43.field723);
		}
		for (int var0 = 0; var0 < class206.field3923; var0++) {
			if (class225.field4228[var0]) {
				class211.field4005[var0] = true;
			}
			class113.field2043[var0] = class225.field4228[var0];
			class225.field4228[var0] = false;
		}
		class225.field4229 = null;
		class58.field1101 = -1;
		class110.field2018 = class117.field2113;
		class133.field2487 = -1;
		if (class43.field723 != -1) {
			class206.field3923 = 0;
			class53.method393(class145.field2725, class43.field723, 0, -1, 0, 0, 0, class222.field4192);
		}
		class72.method479();
		class22.method118();
		if (class108.field1958) {
			class39.method258();
		} else if (class58.field1101 != -1) {
			class97.method679(class133.field2487, class58.field1101);
		}
		if (class134.field2503 == 3) {
			for (int var1 = 0; var1 < class206.field3923; var1++) {
				if (class113.field2043[var1]) {
					class72.method497(class81.field1455[var1], class132.field2471[var1], class133.field2485[var1], class80.field1447[var1], 16711935, 128);
				} else if (class211.field4005[var1]) {
					class72.method497(class81.field1455[var1], class132.field2471[var1], class133.field2485[var1], class80.field1447[var1], 16711680, 128);
				}
			}
		}
		class15.method73(class240.field4456.field4121, class17.field261, class240.field4456.field4136, class149.field2907);
		class17.field261 = 0;
	}

	@ObfuscatedName("wf.b(IIII)I")
	public static int method1606(int arg0, int arg1, int arg2) {
		int var3 = arg0 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return arg2;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
