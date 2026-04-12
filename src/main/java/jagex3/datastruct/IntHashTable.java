package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("oa")
public final class IntHashTable {

	@ObfuscatedName("oa.i")
	public final int[] field2134;

	@ObfuscatedName("oa.k")
	public static LruCache field2136 = new LruCache(100);

	@ObfuscatedName("oa.s")
	public static int field2144 = 0;

	@ObfuscatedName("oa.u")
	public static int field2146 = 0;

	@ObfuscatedName("oa.w")
	public static int field2148 = 2;

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
