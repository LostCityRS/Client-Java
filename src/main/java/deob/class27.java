package deob;

@ObfuscatedName("de")
public final class class27 implements Runnable {

	@ObfuscatedName("de.a")
	public static class32 field481 = field491;

	@ObfuscatedName("de.c")
	public static byte[][] field483;

	@ObfuscatedName("de.d")
	public static volatile boolean field484 = true;

	@ObfuscatedName("de.e")
	public class25 field485;

	@ObfuscatedName("de.g")
	public final class114[] field487 = new class114[2];

	@ObfuscatedName("de.h")
	public static class32 field488 = field496;

	@ObfuscatedName("de.i")
	public static class32 field489 = field496;

	@ObfuscatedName("de.j")
	public static class32 field490 = class73.method593(")4lang)4de", true);

	@ObfuscatedName("de.k")
	public static class32 field491 = class73.method593(" seconds)3", true);

	@ObfuscatedName("de.m")
	public static int field493 = 0;

	@ObfuscatedName("de.o")
	public static int[] field495 = new int[1000];

	@ObfuscatedName("de.p")
	public static class32 field496 = class73.method593("flash1:", true);

	@ObfuscatedName("de.q")
	public volatile boolean field497 = false;

	@ObfuscatedName("de.s")
	public static int field499 = 0;

	@ObfuscatedName("de.t")
	public static boolean field500 = false;

	@ObfuscatedName("de.u")
	public volatile boolean field501 = false;

	@ObfuscatedName("de.v")
	public static class32 field502 = class73.method593(":clan:", true);

	@ObfuscatedName("de.x")
	public static int[] field504 = new int[2000];

	@ObfuscatedName("de.a(III)Lec;")
	public static class32 method187(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return class103.field2418;
		} else if (var2 < -6) {
			return class135.field3144;
		} else if (var2 < -3) {
			return class45.field1070;
		} else if (var2 < 0) {
			return class23.field402;
		} else if (var2 > 9) {
			return class134.field3128;
		} else if (var2 > 6) {
			return class56.field1306;
		} else if (var2 > 3) {
			return class5.field87;
		} else if (var2 > 0) {
			return class64.field1493;
		} else {
			return class137.field3182;
		}
	}

	@ObfuscatedName("de.a(B)V")
	public static void method188() {
		field489 = null;
		field496 = null;
		field490 = null;
		field495 = null;
		field483 = null;
		field481 = null;
		field502 = null;
		field491 = null;
		field504 = null;
		field488 = null;
	}

	@ObfuscatedName("de.a(IJ)V")
	public static void method189(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < class106.field2504; var2++) {
			if (arg0 == class103.field2407[var2]) {
				class106.field2504--;
				for (int var3 = var2; var3 < class106.field2504; var3++) {
					class103.field2407[var3] = class103.field2407[var3 + 1];
					class71.field1685[var3] = class71.field1685[var3 + 1];
				}
				class2.field26 = class115.field2767;
				class44.field1026.method356(239);
				class44.field1026.method541(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("de.a(Ltb;I[BI)V")
	public static void method190(class134 arg0, int arg1, byte[] arg2) {
		class142 var3 = new class142();
		var3.field3249 = arg2;
		var3.field3324 = arg1;
		var3.field3245 = arg0;
		var3.field3243 = 0;
		class157 var4 = class2.field18;
		synchronized (class2.field18) {
			class2.field18.method1214(var3);
		}
		class111.method875();
	}

	@Override
	public void run() {
		this.field497 = true;
		try {
			while (!this.field501) {
				for (int var1 = 0; var1 < 2; var1++) {
					class114 var2 = this.field487[var1];
					if (var2 != null) {
						var2.method893();
					}
				}
				class54.method426(10L);
				class56.method441(null, this.field485);
			}
		} catch (Exception var9) {
			class110.method870(var9, null);
		} finally {
			Object var6 = null;
			this.field497 = false;
		}
	}
}
