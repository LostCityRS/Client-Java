package deob;

@ObfuscatedName("e")
public final class class29 extends class146 {

	@ObfuscatedName("e.r")
	public int field518;

	@ObfuscatedName("e.s")
	public static byte[] field519 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@ObfuscatedName("e.u")
	public static class32 field521 = class73.method593("leuchten1:", true);

	@ObfuscatedName("e.v")
	public static class32 field522 = class73.method593("We suspect someone knows your password)3", true);

	@ObfuscatedName("e.A")
	public static int field527 = 0;

	@ObfuscatedName("e.D")
	public static class32 field530 = class73.method593("Fehler beim Laden Ihres Spielcharakters)3", true);

	@ObfuscatedName("e.E")
	public static class32 field531 = field522;

	@ObfuscatedName("e.J")
	public static class32 field536 = class73.method593("compass", true);

	@ObfuscatedName("e.K")
	public static class32 field537 = class73.method593("Loaded fonts", true);

	@ObfuscatedName("e.B")
	public static class32 field528 = field537;

	@ObfuscatedName("e.I")
	public int field535;

	@ObfuscatedName("e.y")
	public static class114 field525;

	@ObfuscatedName("e.x")
	public int[] field524;

	@ObfuscatedName("e.z")
	public int[] field526;

	@ObfuscatedName("e.F")
	public int[] field532;

	@ObfuscatedName("e.C")
	public class18[] field529;

	@ObfuscatedName("e.H")
	public class18[] field534;

	@ObfuscatedName("e.G")
	public byte[][][] field533;

	@ObfuscatedName("e.d(I)V")
	public static void method195() {
		field528 = null;
		field521 = null;
		field536 = null;
		field522 = null;
		field530 = null;
		field537 = null;
		field519 = null;
		field525 = null;
		field531 = null;
	}

	@ObfuscatedName("e.a(IIZ)I")
	public static int method196(int arg0, int arg1) {
		class107 var2 = (class107) class34.field709.method1196((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.field2535.length; var4++) {
				if (var2.field2537[var4] == arg1) {
					var3 += var2.field2535[var4];
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("e.e(I)Z")
	public static boolean method197() {
		return class98.field2263 == 0 ? class83.field1966.method90() : true;
	}
}
