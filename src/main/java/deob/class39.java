package deob;

@ObfuscatedName("fc")
public final class class39 extends class146 {

	@ObfuscatedName("fc.r")
	public static class32[] field928;

	@ObfuscatedName("fc.s")
	public class32 field929;

	@ObfuscatedName("fc.t")
	public static class32 field930 = class73.method593("Keine Antwort vom Server)3", true);

	@ObfuscatedName("fc.u")
	public static class32 field931 = field943;

	@ObfuscatedName("fc.z")
	public static int field936 = 0;

	@ObfuscatedName("fc.A")
	public static class32 field937 = class73.method593("mod_icons", true);

	@ObfuscatedName("fc.B")
	public static int field938 = 0;

	@ObfuscatedName("fc.H")
	public static class32 field943 = class73.method593("flash2:", true);

	@ObfuscatedName("fc.G")
	public static class32 field942 = field943;

	@ObfuscatedName("fc.E")
	public static int field940;

	@ObfuscatedName("fc.y")
	public static int[] field935;

	@ObfuscatedName("fc.a(IIII)I")
	public static int method318(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("fc.d(I)V")
	public static void method319() {
		field935 = null;
		field943 = null;
		field942 = null;
		field937 = null;
		field931 = null;
		field930 = null;
		field928 = null;
	}
}
