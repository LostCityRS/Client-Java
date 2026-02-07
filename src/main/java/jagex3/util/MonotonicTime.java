package jagex3.util;

import deob.ObfuscatedName;

public class MonotonicTime {
	@ObfuscatedName("oa.O")
	public static long field2267;
	@ObfuscatedName("ke.i")
	public static long field1744;

	@ObfuscatedName("hc.b(B)J")
	public static synchronized long currentTime() {
		long var0 = System.currentTimeMillis();
		if (var0 < field1744) {
			field2267 += field1744 - var0;
		}
		field1744 = var0;
		return field2267 + var0;
	}
}
