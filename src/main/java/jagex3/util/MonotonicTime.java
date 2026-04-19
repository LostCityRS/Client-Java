package jagex3.util;

import deob.ObfuscatedName;

public class MonotonicTime {
	@ObfuscatedName("ub.j")
	public static long field3036;
	@ObfuscatedName("ub.u")
	public static long field3047;

	@ObfuscatedName("ra.a(I)J")
	public static synchronized long currentTime() {
		long var0 = System.currentTimeMillis();
		if (field3036 > var0) {
			field3047 += field3036 - var0;
		}
		field3036 = var0;
		return field3047 + var0;
	}
}
