package jagex3.constants;

import deob.ObfuscatedName;

@ObfuscatedName("tc")
public final class Skills {

	@ObfuscatedName("tc.l")
	public static int[] field3142 = new int[99];
	@ObfuscatedName("gb.w")
	public static boolean[] field1069 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field3142[var1] = var0 / 4;
		}
	}

}
