package deob;

@ObfuscatedName("kf")
public final class class75 {

	@ObfuscatedName("kf.a")
	public static class32 field1755 = class73.method593(" )2> <col=ffff00>", true);

	@ObfuscatedName("kf.b")
	public int field1756;

	@ObfuscatedName("kf.c")
	public static class32 field1757 = class73.method593("Fehler bei der Verbindung zum Server)3", true);

	@ObfuscatedName("kf.d")
	public static int field1758 = 0;

	@ObfuscatedName("kf.e")
	public static int[] field1759 = new int[4000];

	@ObfuscatedName("kf.g")
	public int field1761;

	@ObfuscatedName("kf.j")
	public int field1764;

	@ObfuscatedName("kf.k")
	public static int field1765 = 0;

	@ObfuscatedName("kf.l")
	public int field1766;

	@ObfuscatedName("kf.m")
	public int field1767;

	@ObfuscatedName("kf.n")
	public static class32 field1768 = class73.method593("<img=1>", true);

	@ObfuscatedName("kf.o")
	public static class32 field1769 = class73.method593(")1", true);

	@ObfuscatedName("kf.p")
	public class26 field1770;

	@ObfuscatedName("kf.a(IIIBI)V")
	public static void method602(int arg0, int arg1, int arg2, int arg3) {
		class141.method1066(arg1, arg3, arg0 + arg1, arg2 + arg3);
		class7.method36();
		class159.field3658++;
		class15.method103(true);
		class62.method468(true);
		class15.method103(false);
		class62.method468(false);
		class142.method1076();
		class102.method827();
		if (!class23.field418) {
			int var4 = class133.field3082;
			int var5 = class133.field3054 + class11.field173 & 0x7FF;
			if (var4 < class26.field469 / 256) {
				var4 = class26.field469 / 256;
			}
			if (class33.field699[4] && var4 < class124.field2883[4] + 128) {
				var4 = class124.field2883[4] + 128;
			}
			class143.method1077(var5, class83.method653(class43.field989, class20.field373.field2747, class20.field373.field2698) - 50, var4 * 3 + 600, class57.field1319, var4, class107.field2536);
		}
		int var6;
		if (class23.field418) {
			var6 = class50.method392();
		} else {
			var6 = class5.method21();
		}
		int var7 = class105.field2494;
		int var8 = class48.field1126;
		int var9 = class45.field1049;
		int var10 = class73.field1719;
		int var11 = class115.field2718;
		for (int var12 = 0; var12 < 5; var12++) {
			if (class33.field699[var12]) {
				int var13 = (int) ((double) -class114.field2653[var12] + (double) (class114.field2653[var12] * 2 + 1) * Math.random() + Math.sin((double) class17.field351[var12] * ((double) class145.field3294[var12] / 100.0D)) * (double) class124.field2883[var12]);
				if (var12 == 4) {
					class45.field1049 += var13;
					if (class45.field1049 < 128) {
						class45.field1049 = 128;
					}
					if (class45.field1049 > 383) {
						class45.field1049 = 383;
					}
				}
				if (var12 == 3) {
					class115.field2718 = class115.field2718 + var13 & 0x7FF;
				}
				if (var12 == 1) {
					class73.field1719 += var13;
				}
				if (var12 == 2) {
					class48.field1126 += var13;
				}
				if (var12 == 0) {
					class105.field2494 += var13;
				}
			}
		}
		int var14 = class86.field2001;
		int var15 = class140.field3216;
		if (var14 >= arg1 && arg0 + arg1 > var14 && var15 >= arg3 && arg3 + arg2 > var15) {
			class101.field2382 = 0;
			class101.field2362 = class86.field2001 - arg1;
			class101.field2363 = class140.field3216 - arg3;
			class101.field2373 = true;
		} else {
			class101.field2373 = false;
			class101.field2382 = 0;
		}
		class125.method980();
		class141.method1053(arg1, arg3, arg0, arg2, 0);
		class125.method980();
		class159.field3657.method1167(class105.field2494, class73.field1719, class48.field1126, class45.field1049, class115.field2718, var6);
		class125.method980();
		class159.field3657.method1135();
		class56.method439(arg2, arg3, arg1, arg0);
		class63.method483(arg1, arg3);
		((class140) class7.field126).method1049(class54.field1282);
		class17.method129(arg3, arg2, arg1, arg0);
		class105.field2494 = var7;
		class48.field1126 = var8;
		class73.field1719 = var10;
		class45.field1049 = var9;
		class115.field2718 = var11;
		if (class88.field2032 && class34.method293() == 0) {
			class88.field2032 = false;
		}
		if (class88.field2032) {
			class141.method1053(arg1, arg3, arg0, arg2, 0);
			class14.method72(class48.field1135, false);
		}
		if (!class88.field2032 && !class26.field476 && var14 >= arg1 && var14 < arg0 + arg1 && arg3 <= var15 && arg3 + arg2 > var15) {
			class86.method663(var14, arg3, arg1, var15);
		}
	}

	@ObfuscatedName("kf.a(IILhd;III)V")
	public static void method603(int arg0, class53 arg1, int arg2, int arg3, int arg4) {
		class98 var5 = new class98();
		var5.field2276 = arg4 * 128;
		var5.field2275 = arg1.field1256;
		var5.field2256 = arg3 * 128;
		var5.field2249 = arg1.field1250;
		var5.field2245 = arg1.field1218;
		int var6 = arg1.field1222;
		var5.field2251 = arg2;
		var5.field2260 = arg1.field1240 * 128;
		var5.field2244 = arg1.field1259;
		int var7 = arg1.field1233;
		if (arg0 == 1 || arg0 == 3) {
			var7 = arg1.field1222;
			var6 = arg1.field1233;
		}
		var5.field2248 = (var7 + arg4) * 128;
		var5.field2255 = (var6 + arg3) * 128;
		if (arg1.field1251 != null) {
			var5.field2250 = arg1;
			var5.method767();
		}
		class63.field1466.method1214(var5);
		if (var5.field2245 != null) {
			var5.field2269 = (int) ((double) (var5.field2249 - var5.field2244) * Math.random()) + var5.field2244;
		}
	}

	@ObfuscatedName("kf.a(ZI)V")
	public static void method604(int arg0) {
		class139.field3209 = arg0;
	}
}
