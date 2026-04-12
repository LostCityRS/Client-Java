package deob;

@ObfuscatedName("oa")
public final class IntHashTable {

	@ObfuscatedName("oa.b")
	public static JagString field2127 = JagString.wrap("We suspect someone knows your password)3");

	@ObfuscatedName("oa.c")
	public static JagString field2128 = JagString.wrap("Unable to connect)3");

	@ObfuscatedName("oa.h")
	public static JagString field2133 = JagString.wrap(" has logged in)3");

	@ObfuscatedName("oa.a")
	public static JagString field2126 = field2133;

	@ObfuscatedName("oa.i")
	public final int[] field2134;

	@ObfuscatedName("oa.j")
	public static JagString field2135 = field2128;

	@ObfuscatedName("oa.k")
	public static class15 field2136 = new class15(100);

	@ObfuscatedName("oa.n")
	public static JagString field2139 = field2127;

	@ObfuscatedName("oa.o")
	public static JagString field2140 = field2128;

	@ObfuscatedName("oa.p")
	public static JagString field2141 = JagString.wrap("Lade Konfiguration )2 ");

	@ObfuscatedName("oa.r")
	public static JagString field2143 = JagString.wrap("Loaded config");

	@ObfuscatedName("oa.m")
	public static JagString field2138 = field2143;

	@ObfuscatedName("oa.s")
	public static int field2144 = 0;

	@ObfuscatedName("oa.u")
	public static int field2146 = 0;

	@ObfuscatedName("oa.w")
	public static int field2148 = 2;

	@ObfuscatedName("oa.y")
	public static JagString field2150 = JagString.wrap("Existing user");

	@ObfuscatedName("oa.x")
	public static JagString field2149 = field2150;

	@ObfuscatedName("oa.a(II)I")
	public int method745(int arg0) {
		int var2 = this.field2134.length - 2;
		int var3 = arg0 << 1 & var2;
		while (true) {
			int var4 = this.field2134[var3];
			if (arg0 == var4) {
				return this.field2134[var3 + 1];
			}
			if (var4 == -1) {
				return -1;
			}
			var3 = var3 + 2 & var2;
		}
	}

	public IntHashTable(int[] arg0) {
		int var2;
		for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
		}
		this.field2134 = new int[var2 + var2];
		for (int var3 = 0; var3 < var2 + var2; var3++) {
			this.field2134[var3] = -1;
		}
		int var4 = 0;
		while (arg0.length > var4) {
			int var5;
			for (var5 = arg0[var4] & var2 - 1; this.field2134[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
			}
			this.field2134[var5 + var5] = arg0[var4];
			this.field2134[var5 + var5 + 1] = var4++;
		}
	}
}
