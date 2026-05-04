package deob;

@ObfuscatedName("kf")
public final class class115 {

	@ObfuscatedName("kf.a")
	public static int field2071 = 0;

	@ObfuscatedName("kf.b")
	public static final class88 field2072 = class208.method1423(105, "Loading fonts )2 ");

	@ObfuscatedName("kf.c")
	public static final class88 field2073 = class208.method1423(105, "Fehler bei der Verbindung zum Server)3");

	@ObfuscatedName("kf.e")
	public static final class88 field2075 = class208.method1423(105, "mapdots");

	@ObfuscatedName("kf.f")
	public static class88 field2076 = field2072;

	@ObfuscatedName("kf.g")
	public static final class88 field2077 = class208.method1423(105, "Free world");

	@ObfuscatedName("kf.d")
	public static class88 field2074 = field2077;

	@ObfuscatedName("kf.h")
	public static int field2078 = 0;

	@ObfuscatedName("kf.i")
	public static final class88 field2079 = class208.method1423(105, " from your friend list first)3");

	@ObfuscatedName("kf.j")
	public static final class88 field2080 = class208.method1423(105, "(U1");

	@ObfuscatedName("kf.k")
	public static final class88 field2081 = class208.method1423(105, "T");

	@ObfuscatedName("kf.n")
	public static int field2084;

	@ObfuscatedName("kf.o")
	public static class88 field2085 = field2079;

	@ObfuscatedName("kf.p")
	public static final long[] field2086 = new long[200];

	@ObfuscatedName("kf.a(II)Lkh;")
	public static class117 method783(int arg0) {
		class117 var1 = (class117) class149.field2856.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2;
		if (arg0 < 32768) {
			var2 = class62.field1146.method939(arg0, 0);
		} else {
			var2 = class66.field1199.method939(arg0 & 0x7FFF, 0);
		}
		class117 var3 = new class117();
		if (var2 != null) {
			var3.method794(new class46(var2));
		}
		if (arg0 >= 32768) {
			var3.method797();
		}
		class149.field2856.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("kf.a(B)V")
	public static void method785() {
		if (class33.field556 != null) {
			class33.field556.method917();
			class33.field556 = null;
		}
		class27.method167();
		class85.method579();
		for (int var0 = 0; var0 < 4; var0++) {
			class166.field3200[var0].method643();
		}
		class201.method1378();
		System.gc();
		class117.method795();
		class110.field2012 = false;
		class2.field25 = -1;
		class44.method288();
		class131.method881(10);
	}

	@ObfuscatedName("kf.a(IIIIIZI)V")
	public static void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 + arg4;
		int var7 = arg3 - arg2;
		int var8 = arg2 + arg5;
		int var9 = arg0 - arg2;
		for (int var10 = arg4; var10 < var6; var10++) {
			class230.method1534(arg5, arg1, arg0, class3.field42[var10]);
		}
		for (int var11 = arg3; var11 > var7; var11--) {
			class230.method1534(arg5, arg1, arg0, class3.field42[var11]);
		}
		for (int var12 = var6; var12 <= var7; var12++) {
			int[] var13 = class3.field42[var12];
			class230.method1534(arg5, arg1, var8, var13);
			class230.method1534(var9, arg1, arg0, var13);
		}
	}
}
