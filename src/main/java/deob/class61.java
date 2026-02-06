package deob;

@ObfuscatedName("ie")
public final class class61 extends class13 {

	@ObfuscatedName("ie.K")
	public static class32 field1348 = class73.method593("Passwort: ", true);

	@ObfuscatedName("ie.S")
	public static int field1356 = 0;

	@ObfuscatedName("ie.O")
	public static int field1352 = 0;

	@ObfuscatedName("ie.R")
	public static int field1355 = 0;

	@ObfuscatedName("ie.U")
	public static int field1358 = -1;

	@ObfuscatedName("ie.Q")
	public static class66 field1354 = new class66(8);

	@ObfuscatedName("ie.W")
	public static class31 field1360 = new class31();

	@ObfuscatedName("ie.Y")
	public static class32 field1362 = class73.method593("Select", true);

	@ObfuscatedName("ie.bb")
	public static class32 field1365 = field1362;

	@ObfuscatedName("ie.Z")
	public static class32 field1363 = class73.method593("RuneScape has been updated(Q", true);

	@ObfuscatedName("ie.ab")
	public static class32 field1364 = field1363;

	@ObfuscatedName("ie.N")
	public int field1351 = 0;

	@ObfuscatedName("ie.V")
	public static int field1359;

	@ObfuscatedName("ie.X")
	public static int field1361;

	@ObfuscatedName("ie.a(BLf;)Lec;")
	public static class32 method459(class36 arg0) {
		if (class98.method768(class147.method1100(arg0)) == 0) {
			return null;
		} else if (arg0.field825 == null || arg0.field825.method275().method240() == 0) {
			return class146.field3318 ? class131.field3011 : null;
		} else {
			return arg0.field825;
		}
	}

	@ObfuscatedName("ie.a(B)V")
	public static void method462() {
		if (!class26.field476) {
			class109.field2575[0] = class92.field2114;
			class56.field1295[0] = class77.field1786;
			class119.field2849 = 1;
			class44.field1034[0] = 1007;
		}
		if (class13.field220 != -1) {
			class109.method869(class13.field220);
		}
		for (int var0 = 0; var0 < class133.field3081; var0++) {
			if (class145.field3297[var0]) {
				class81.field1863[var0] = true;
			}
			class57.field1318[var0] = class145.field3297[var0];
			class145.field3297[var0] = false;
		}
		class48.field1123 = null;
		class154.field3513 = -1;
		class30.field563 = class140.field3217;
		class32.field677 = -1;
		if (class13.field220 != -1) {
			class133.field3081 = 0;
			class84.method656(0, 0, class13.field220, 0, -1, 765, 503, 0);
		}
		class141.method1056();
		class152.method1187();
		if (class26.field476) {
			class142.method1072();
		} else if (class32.field677 != -1) {
			class124.method974(class154.field3513, class32.field677);
		}
		if (class92.field2116 == 3) {
			for (int var1 = 0; var1 < class133.field3081; var1++) {
				if (class57.field1318[var1]) {
					class141.method1057(class144.field3287[var1], class124.field2892[var1], class28.field512[var1], class20.field366[var1], 16711935, 128);
				} else if (class81.field1863[var1]) {
					class141.method1057(class144.field3287[var1], class124.field2892[var1], class28.field512[var1], class20.field366[var1], 16711680, 128);
				}
			}
		}
		class45.method345(class20.field373.field2698, class20.field373.field2747, class54.field1282, class43.field989);
		class54.field1282 = 0;
	}

	@ObfuscatedName("ie.a(IILka;BI)V")
	public static void method464(int arg0, int arg1, class70 arg2, int arg3) {
		if (class20.field373 == arg2 || class119.field2849 >= 400) {
			return;
		}
		class32 var4;
		if (arg2.field1652 == 0) {
			var4 = class52.method402(new class32[] { arg2.field1659, class27.method187(arg2.field1635, class20.field373.field1635), class41.field954, class62.field1437, class159.method1228(arg2.field1635), class23.field403 });
		} else {
			var4 = class52.method402(new class32[] { arg2.field1659, class41.field954, class117.field2813, class159.method1228(arg2.field1652), class23.field403 });
		}
		if (class125.field2913 == 1) {
			class56.method442(arg0, class41.field965, arg1, 5, class52.method402(new class32[] { class50.field1148, class134.field3127, var4 }), arg3);
		} else if (!class151.field3468) {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (class38.field914[var5] != null) {
					short var6 = 0;
					if (class38.field914[var5].method271(class72.field1704)) {
						if (class20.field373.field1635 < arg2.field1635) {
							var6 = 2000;
						}
						if (class20.field373.field1637 != 0 && arg2.field1637 != 0) {
							if (arg2.field1637 == class20.field373.field1637) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (class44.field1042[var5]) {
						var6 = 2000;
					}
					int var7 = class98.field2266[var5] + var6;
					class56.method442(arg0, class38.field914[var5], arg1, var7, class52.method402(new class32[] { class130.field2997, var4 }), arg3);
				}
			}
		} else if ((class88.field2045 & 0x8) == 8) {
			class56.method442(arg0, class147.field3353, arg1, 22, class52.method402(new class32[] { class14.field234, class134.field3127, var4 }), arg3);
		}
		for (int var8 = 0; var8 < class119.field2849; var8++) {
			if (class44.field1034[var8] == 3) {
				class56.field1295[var8] = class52.method402(new class32[] { class130.field2997, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("ie.b(B)V")
	public static void method465() {
		class5.field105.method490();
	}

	@ObfuscatedName("ie.f(I)V")
	public static void method466() {
		while (true) {
			class157 var0 = class2.field18;
			class142 var1;
			synchronized (class2.field18) {
				var1 = (class142) class159.field3649.method1215();
			}
			if (var1 == null) {
				return;
			}
			var1.field3254.method340(false, var1.field3249, (int) var1.field3324, var1.field3245);
		}
	}

	@ObfuscatedName("ie.b(Ljd;B)V")
	public void method460(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method463(arg0, var2);
		}
	}

	@ObfuscatedName("ie.a(Ljd;II)V")
	public void method463(class66 arg0, int arg1) {
		if (arg1 == 5) {
			this.field1351 = arg0.method531();
		}
	}
}
