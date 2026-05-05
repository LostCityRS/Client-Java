package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("sj")
public final class MonotonicTime {

	@ObfuscatedName("od.t")
	public static long leapMillis;
	@ObfuscatedName("ei.a")
	public static long previous;

	@ObfuscatedName("sj.a(Z)J")
	public static synchronized long currentTime() {
		long var0 = System.currentTimeMillis();
		if (var0 < leapMillis) {
			previous += leapMillis - var0;
		}
		leapMillis = var0;
		return var0 + previous;
	}
}
