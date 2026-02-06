package deob;

@ObfuscatedName("ra")
public final class class119 {

	@ObfuscatedName("ra.a")
	public static class32 field2838 = class73.method593("Bitte geben Sie Ihr Passwort ein)3", true);

	@ObfuscatedName("ra.b")
	public static int field2839 = 0;

	@ObfuscatedName("ra.c")
	public static class30 field2840;

	@ObfuscatedName("ra.d")
	public static int[] field2841;

	@ObfuscatedName("ra.f")
	public static class32 field2843 = class73.method593("nav", true);

	@ObfuscatedName("ra.g")
	public static class32 field2844 = class73.method593("wishes to duel with you)3", true);

	@ObfuscatedName("ra.h")
	public static class32 field2845 = class73.method593("Wir vermuten)1 dass Ihr Konto gestohlen wurde", true);

	@ObfuscatedName("ra.i")
	public static class66 field2846;

	@ObfuscatedName("ra.j")
	public static class32 field2847 = class73.method593("und haben es deaktiviert)3 Klicken Sie auf der", true);

	@ObfuscatedName("ra.k")
	public static int field2848 = 0;

	@ObfuscatedName("ra.l")
	public static int field2849 = 0;

	@ObfuscatedName("ra.m")
	public static int[] field2850 = new int[1000];

	@ObfuscatedName("ra.o")
	public static class32 field2852 = field2844;

	@ObfuscatedName("ra.a(BLlf;)V")
	public static void method936(class82 arg0) {
		if (class79.field1826 != 1) {
			return;
		}
		if (class9.field166 >= 280 && class9.field166 <= 294 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(0, 0);
			return;
		}
		if (class9.field166 >= 295 && class9.field166 <= 360 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(1, 0);
			return;
		}
		if (class9.field166 >= 390 && class9.field166 <= 404 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(0, 1);
			return;
		}
		if (class9.field166 >= 405 && class9.field166 <= 470 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(1, 1);
			return;
		}
		if (class9.field166 >= 500 && class9.field166 <= 514 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(0, 2);
			return;
		}
		if (class9.field166 >= 515 && class9.field166 <= 580 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(1, 2);
			return;
		}
		if (class9.field166 >= 610 && class9.field166 <= 624 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(0, 3);
			return;
		}
		if (class9.field166 >= 625 && class9.field166 <= 690 && class66.field1589 >= 4 && class66.field1589 <= 18) {
			class88.method672(1, 3);
			return;
		}
		if (class9.field166 >= 708 && class66.field1589 >= 4 && class9.field166 <= 758 && class66.field1589 <= 20) {
			class117.field2792 = false;
			class100.field2320.method387(0, 0);
			class45.field1052.method387(382, 0);
			class98.field2262.method399(382 - class98.field2262.field1167 / 2, 18);
			return;
		}
		if (class137.field3191 == -1) {
			return;
		}
		class102 var1 = class97.field2235[class137.field3191];
		if (class146.field3315 == var1.field2393) {
			byte[] var2 = class52.method402(new class32[] { var1.field2383, class64.field1492 }).method255();
			class151.field3465 = new String(var2, 0, var2.length);
			if (class70.field1646 != 0) {
				class39.field940 = 43594;
				class26.field473 = 43594;
				class70.field1646 = 0;
				class13.field223 = 443;
			}
			class86.field2014 = var1.field2396;
			class117.field2792 = false;
			class100.field2320.method387(0, 0);
			class45.field1052.method387(382, 0);
			class98.field2262.method399(382 - class98.field2262.field1167 / 2, 18);
			return;
		}
		class32 var3 = class52.method402(new class32[] { class154.field3528, var1.field2383, class64.field1492, class77.field1784, class151.field3456, class159.method1228(class154.field3529 ? 1 : 0), class63.field1445, class159.method1228(class107.field2532), class15.field251, class159.method1228(class130.field3004) });
		try {
			arg0.getAppletContext().showDocument(var3.method278(), "_self");
			return;
		} catch (Exception var4) {
			return;
		}
	}

	@ObfuscatedName("ra.a(I)V")
	public static void method937() {
		field2847 = null;
		field2840 = null;
		field2844 = null;
		field2850 = null;
		field2841 = null;
		field2845 = null;
		field2852 = null;
		field2843 = null;
		field2838 = null;
		field2846 = null;
	}

	@ObfuscatedName("ra.a(IB)Lse;")
	public static class130 method938(int arg0) {
		class130 var1 = (class130) class113.field2634.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class48.field1133.method206(8, arg0);
		class130 var3 = new class130();
		if (var2 != null) {
			var3.method999(new class66(var2));
		}
		class113.field2634.method484((long) arg0, var3);
		return var3;
	}
}
