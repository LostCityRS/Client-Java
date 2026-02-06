package deob;

@ObfuscatedName("na")
public final class class91 {

	@ObfuscatedName("na.a")
	public int field2075;

	@ObfuscatedName("na.d")
	public int field2078;

	@ObfuscatedName("na.e")
	public static int[][] field2079 = new int[5][5000];

	@ObfuscatedName("na.g")
	public static int field2081;

	@ObfuscatedName("na.k")
	public static class32 field2085 = class73.method593("Players", true);

	@ObfuscatedName("na.l")
	public static class30 field2086;

	@ObfuscatedName("na.m")
	public static class32 field2087 = class73.method593(" )2> <col=00ffff>", true);

	@ObfuscatedName("na.n")
	public static class14 field2088;

	@ObfuscatedName("na.o")
	public static class32 field2089 = class73.method593(" loggt sich aus)3", true);

	@ObfuscatedName("na.p")
	public static class32 field2090 = class73.method593("Null", true);

	@ObfuscatedName("na.q")
	public int field2091;

	@ObfuscatedName("na.r")
	public static class32 field2092 = field2085;

	@ObfuscatedName("na.s")
	public static class32 field2093 = class73.method593(" zuerst von Ihrer Ignorieren)2Liste(Q", true);

	@ObfuscatedName("na.t")
	public static int[] field2094 = new int[200];

	@ObfuscatedName("na.x")
	public static class32 field2098 = class73.method593("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", true);

	@ObfuscatedName("na.i")
	public static class32 field2083 = field2098;

	@ObfuscatedName("na.A")
	public static class32 field2101 = class73.method593("null", true);

	@ObfuscatedName("na.a(I)V")
	public static void method717(int arg0) {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
		if (arg0 != 10649) {
			field2101 = null;
		}
	}

	@ObfuscatedName("na.a(IJ)V")
	public static void method719(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (class2.field20 >= 100 && class158.field3608 != 1 || class2.field20 >= 200) {
			class79.method628(class62.field1413, 0, class77.field1786);
			return;
		}
		class32 var2 = class9.method59(arg0).method264();
		for (int var3 = 0; var3 < class2.field20; var3++) {
			if (class33.field694[var3] == arg0) {
				class79.method628(class52.method402(new class32[] { var2, class133.field3076 }), 0, class77.field1786);
				return;
			}
		}
		for (int var4 = 0; var4 < class106.field2504; var4++) {
			if (class103.field2407[var4] == arg0) {
				class79.method628(class52.method402(new class32[] { class5.field97, var2, class152.field3486 }), 0, class77.field1786);
				return;
			}
		}
		if (var2.method272(class20.field373.field1659)) {
			class79.method628(class5.field96, 0, class77.field1786);
			return;
		}
		class14.field239[class2.field20] = var2;
		class33.field694[class2.field20] = arg0;
		field2094[class2.field20] = 0;
		class5.field103[class2.field20] = 0;
		class2.field26 = class115.field2767;
		class2.field20++;
		class44.field1026.method356(28);
		class44.field1026.method541(arg0);
	}

	@ObfuscatedName("na.a(Lqd;IB)V")
	public static void method720(class115 arg0, int arg1) {
		class136.method1031(arg0.field2698, arg0.field2747, arg1);
	}

	@ObfuscatedName("na.c(I)V")
	public static void method721() {
		for (class23 var0 = (class23) class45.field1076.method1211(); var0 != null; var0 = (class23) class45.field1076.method1209()) {
			if (var0.field411 > 0) {
				var0.field411--;
			}
			if (var0.field411 != 0) {
				if (var0.field412 > 0) {
					var0.field412--;
				}
				if (var0.field412 == 0 && var0.field405 >= 1 && var0.field420 >= 1 && var0.field405 <= 102 && var0.field420 <= 102 && (var0.field414 < 0 || class33.method285(var0.field414, var0.field404))) {
					client.method149(var0.field404, var0.field398, var0.field405, var0.field414, var0.field413, var0.field401, var0.field420);
					var0.field412 = -1;
					if (var0.field406 == var0.field414 && var0.field406 == -1) {
						var0.method1091();
					} else if (var0.field406 == var0.field414 && var0.field410 == var0.field413 && var0.field404 == var0.field408) {
						var0.method1091();
					}
				}
			} else if (var0.field406 < 0 || class33.method285(var0.field406, var0.field408)) {
				client.method149(var0.field408, var0.field398, var0.field405, var0.field406, var0.field410, var0.field401, var0.field420);
				var0.method1091();
			}
		}
	}

	@ObfuscatedName("na.d(I)V")
	public static void method722() {
		class132.method1008(class158.field3629);
		class9.field163++;
		if (class112.field2622 && class27.field500) {
			int var0 = class86.field2001;
			int var1 = class140.field3216;
			int var2 = var0 - class45.field1068;
			if (var2 < class111.field2606) {
				var2 = class111.field2606;
			}
			int var3 = class158.field3629.field760;
			int var4 = var1 - class88.field2029;
			if (class111.field2606 + class117.field2807.field810 < class158.field3629.field810 + var2) {
				var2 = class117.field2807.field810 + class111.field2606 - class158.field3629.field810;
			}
			int var5 = var2 - class126.field2930;
			if (class137.field3180 > var4) {
				var4 = class137.field3180;
			}
			int var6 = class117.field2807.field843 + var2 - class111.field2606;
			if (class117.field2807.field773 + class137.field3180 < class158.field3629.field773 + var4) {
				var4 = class117.field2807.field773 + class137.field3180 - class158.field3629.field773;
			}
			int var7 = var4 - class63.field1465;
			if (class9.field163 > class158.field3629.field746 && (var3 < var5 || -var3 > var5 || var3 < var7 || -var3 > var7)) {
				class77.field1789 = true;
			}
			int var8 = class117.field2807.field872 + var4 - class137.field3180;
			if (class158.field3629.field852 != null && class77.field1789) {
				class12 var9 = new class12();
				var9.field204 = var6;
				var9.field208 = class158.field3629.field852;
				var9.field209 = class158.field3629;
				var9.field210 = var8;
				class158.method1222(var9);
			}
			if (class86.field2016 == 0) {
				if (class77.field1789) {
					if (class158.field3629.field871 != null) {
						class12 var10 = new class12();
						var10.field204 = var6;
						var10.field210 = var8;
						var10.field209 = class158.field3629;
						var10.field202 = class124.field2886;
						var10.field208 = class158.field3629.field871;
						class158.method1222(var10);
					}
					if (class124.field2886 != null && class15.method111(class158.field3629) != null) {
						class44.field1026.method356(178);
						class44.field1026.method553(class124.field2886.field743);
						class44.field1026.method548(class124.field2886.field828);
						class44.field1026.method526(class158.field3629.field743);
						class44.field1026.method546(class158.field3629.field828);
					}
				} else if ((class125.field2898 == 1 || class32.method237(class119.field2849 - 1)) && class119.field2849 > 2) {
					class135.method1030();
				} else if (class119.field2849 > 0) {
					class14.method79(class119.field2849 - 1);
				}
				class158.field3629 = null;
			}
		} else if (class9.field163 > 1) {
			class158.field3629 = null;
		}
	}

	@ObfuscatedName("na.e(I)V")
	public static void method723() {
		if (class143.field3273 != null) {
			class143.field3273.method52();
			class143.field3273 = null;
		}
		class102.method824();
		class159.field3657.method1139();
		for (int var0 = 0; var0 < 4; var0++) {
			class105.field2482[var0].method923();
		}
		System.gc();
		class152.method1176();
		class112.field2621 = false;
		class12.field206 = -1;
		class33.method283();
		class54.method425(10);
	}

	@ObfuscatedName("na.a(II)Lu;")
	public static class139 method724(int arg0) {
		class139 var1 = (class139) client.field382.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class129.field2970.method206(5, arg0);
		class139 var3 = new class139();
		if (var2 != null) {
			var3.method1043(new class66(var2));
		}
		client.field382.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("na.a(Lec;B)V")
	public static void method725(class32 arg0) {
		if (class111.field2609 == null) {
			return;
		}
		int var1 = 0;
		long var2 = arg0.method259();
		if (var2 == 0L) {
			return;
		}
		while (var1 < class111.field2609.length && class111.field2609[var1].field3324 != var2) {
			var1++;
		}
		if (class111.field2609.length > var1 && class111.field2609[var1] != null) {
			class44.field1026.method356(194);
			class44.field1026.method541(class111.field2609[var1].field3324);
		}
	}

	@ObfuscatedName("na.a(B)V")
	public static void method726() {
		class61.field1352 = 0;
		class102.field2391 = 0;
		class156.method1197();
		class9.method54();
		class8.method45();
		class43.method330();
		for (int var0 = 0; var0 < class102.field2391; var0++) {
			int var1 = class27.field495[var0];
			if (class52.field1175[var1].field2713 != class140.field3217) {
				class52.field1175[var1] = null;
			}
		}
		if (class115.field2700 != class158.field3612.field1568) {
			throw new RuntimeException("gpp1 pos:" + class158.field3612.field1568 + " psize:" + class115.field2700);
		}
		for (int var2 = 0; var2 < class62.field1404; var2++) {
			if (class52.field1175[class137.field3187[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class62.field1404);
			}
		}
	}
}
