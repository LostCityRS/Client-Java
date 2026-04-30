package jagex3.util;

import deob.ObfuscatedName;

public class MonotonicTime {
	@ObfuscatedName("ub.j")
	public static long leapMillis;
	@ObfuscatedName("ub.u")
	public static long previous;

	@ObfuscatedName("ra.a(I)J")
	public static synchronized long currentTime() {
		long var0 = System.currentTimeMillis();
		if (leapMillis > var0) {
			previous += leapMillis - var0;
		}
		leapMillis = var0;
		return previous + var0;
	}
}
