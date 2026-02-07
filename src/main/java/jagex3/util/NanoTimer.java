package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("pd")
public final class NanoTimer extends Timer {

	@ObfuscatedName("pd.l")
	public long field2548 = System.nanoTime();

	@ObfuscatedName("pd.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		long var3 = this.field2548 - System.nanoTime();
		long var5 = (long) arg1 * 1000000L;
		if (var3 < var5) {
			var3 = var5;
		}
		ThreadSleep.sleepPrecise(var3 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;
		while (var9 < 10 && (var9 < 1 || var7 > this.field2548)) {
			var9++;
			this.field2548 += (long) arg0 * 1000000L;
		}
		if (var7 > this.field2548) {
			this.field2548 = var7;
		}
		return var9;
	}

	@ObfuscatedName("pd.a(I)V")
	@Override
	public void method57() {
		this.field2548 = System.nanoTime();
	}
}
