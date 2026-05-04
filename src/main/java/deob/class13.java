package deob;

@ObfuscatedName("ba")
public final class class13 {

	@ObfuscatedName("ba.a")
	public int field185;

	@ObfuscatedName("ba.b")
	public int field186;

	@ObfuscatedName("ba.c")
	public int field187;

	@ObfuscatedName("ba.d")
	public int field188;

	@ObfuscatedName("ba.e")
	public int field189;

	@ObfuscatedName("ba.f")
	public int field190;

	@ObfuscatedName("ba.g")
	public int field191;

	@ObfuscatedName("ba.h")
	public static int field192 = 0;

	@ObfuscatedName("ba.i")
	public int field193;

	@ObfuscatedName("ba.j")
	public int field194;

	@ObfuscatedName("ba.k")
	public int field195;

	@ObfuscatedName("ba.l")
	public int field196;

	@ObfuscatedName("ba.m")
	public int field197;

	@ObfuscatedName("ba.n")
	public static final int[] field198 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("ba.o")
	public int field199;

	@ObfuscatedName("ba.p")
	public int field200;

	@ObfuscatedName("ba.q")
	public int field201;

	@ObfuscatedName("ba.s")
	public static int field203 = 0;

	@ObfuscatedName("ba.t")
	public int field204;

	@ObfuscatedName("ba.u")
	public int field205;

	@ObfuscatedName("ba.v")
	public int field206;

	@ObfuscatedName("ba.a(III)I")
	public static int method67(int arg0, int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		int var2 = arg0 * (arg1 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return var2 + (arg1 & 0xFF80);
	}
}
