package deob;

@ObfuscatedName("sj")
public final class MonotonicTime {

	@ObfuscatedName("od.t")
	public static long field3004;
	@ObfuscatedName("ei.a")
	public static long field1002;

	@ObfuscatedName("sj.a(Z)J")
	public static synchronized long currentTime() {
		long var0 = System.currentTimeMillis();
		if (var0 < field3004) {
			field1002 += field3004 - var0;
		}
		field3004 = var0;
		return var0 + field1002;
	}
}
