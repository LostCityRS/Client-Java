package deob;

@ObfuscatedName("ei")
public final class class54 {

	@ObfuscatedName("ei.a")
	public static long field1002;

	@ObfuscatedName("ei.d")
	public static final class88 field1005 = class208.method1423(105, "; version=1; path=)4; domain=");

	@ObfuscatedName("ei.e")
	public static final class46 field1006 = new class46(new byte[5000]);

	@ObfuscatedName("ei.g")
	public static final byte[] field1008 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@ObfuscatedName("ei.h")
	public static int[] field1009;

	@ObfuscatedName("ei.i")
	public static final class88 field1010 = class208.method1423(105, "Konfig geladen)3");

	@ObfuscatedName("ei.j")
	public static class26 field1011;

	@ObfuscatedName("ei.k")
	public static int field1012 = 0;

	@ObfuscatedName("ei.l")
	public static final class88 field1013 = class208.method1423(105, "wishes to trade with you)3");

	@ObfuscatedName("ei.f")
	public static class88 field1007 = field1013;

	@ObfuscatedName("ei.a(II)I")
	public static int method394(int arg0) {
		int var1 = arg0 * 6 - 61440;
		int var2 = (var1 * arg0 >> 12) + 40960;
		int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
		return var2 * var3 >> 12;
	}

	@ObfuscatedName("ei.a(IB[BI)Li;")
	public static class88 method395(int arg0, byte[] arg1, int arg2) {
		class88 var3 = new class88();
		var3.field1660 = 0;
		var3.field1643 = new byte[arg2];
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			if (arg1[var4] != 0) {
				var3.field1643[var3.field1660++] = arg1[var4];
			}
		}
		return var3;
	}

	@ObfuscatedName("ei.a(III)Lpc;")
	public static class166 method397(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		return var3 == null || var3.field949 == null ? null : var3.field949;
	}
}
