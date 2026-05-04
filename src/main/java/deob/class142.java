package deob;

@ObfuscatedName("n")
public final class class142 {

	@ObfuscatedName("n.d")
	public static final class24 field2616 = new class24(5);

	@ObfuscatedName("n.e")
	public static int field2617 = 0;

	@ObfuscatedName("n.f")
	public static final class88 field2618 = class208.method1423(105, "<br>");

	@ObfuscatedName("n.g")
	public static final class88 field2619 = class208.method1423(105, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@ObfuscatedName("n.h")
	public static int field2620 = 0;

	@ObfuscatedName("n.i")
	public static final class88 field2621 = class208.method1423(105, "scrollbar");

	@ObfuscatedName("n.j")
	public static final class88 field2622 = class208.method1423(105, "hint_mapmarkers");

	@ObfuscatedName("n.k")
	public static boolean field2623;

	@ObfuscatedName("n.l")
	public static class144 field2624;

	@ObfuscatedName("n.m")
	public static final class88 field2625 = class208.method1423(105, "VOLL");

	@ObfuscatedName("n.a(II)I")
	public static int method928(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("n.a(Z)Z")
	public static boolean method929() {
		try {
			if (class122.field2230 == 2) {
				if (class196.field3764 == null) {
					class196.field3764 = class91.method662(class158.field3039, class228.field4268, class242.field4480);
					if (class196.field3764 == null) {
						return false;
					}
				}
				if (class248.field4552 == null) {
					class248.field4552 = new class151(class153.field2955, class86.field1553);
				}
				if (class31.field503.method1182(class248.field4552, class196.field3764, class12.field177)) {
					class31.field503.method1187();
					class31.field503.method1186(class11.field159);
					class31.field503.method1185(class196.field3764, class17.field277);
					class158.field3039 = null;
					class196.field3764 = null;
					class122.field2230 = 0;
					class248.field4552 = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class31.field503.method1208();
			class248.field4552 = null;
			class158.field3039 = null;
			class122.field2230 = 0;
			class196.field3764 = null;
		}
		return false;
	}

	@ObfuscatedName("n.b(II)I")
	public static int method930(int arg0) {
		class226 var1 = class153.method1043(arg0);
		int var2 = var1.field4234;
		int var3 = var1.field4237;
		int var4 = var1.field4233;
		int var5 = class101.field1832[var3 - var2];
		return class113.field2050[var4] >> var2 & var5;
	}
}
