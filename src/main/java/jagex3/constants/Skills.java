package jagex3.constants;

import deob.ObfuscatedName;

public class Skills {
	@ObfuscatedName("ib.E")
	public static final int[] skillxp = new int[99];
	@ObfuscatedName("be.f")
	public static final boolean[] used = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			skillxp[var1] = var0 / 4;
		}
	}
}
