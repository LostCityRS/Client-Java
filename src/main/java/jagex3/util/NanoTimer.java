package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("qh")
public final class NanoTimer extends Timer {

	@ObfuscatedName("qh.j")
	public long ntime = System.nanoTime();

	@ObfuscatedName("qh.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		long var3 = (long) arg0 * 1000000L;
		long var5 = this.ntime - System.nanoTime();
		int var7 = 0;
		if (var5 < var3) {
			var5 = var3;
		}
		ThreadSleep.sleepPrecise(var5 / 1000000L);
		long var8 = System.nanoTime();
		while (var7 < 10 && (var7 < 1 || this.ntime < var8)) {
			var7++;
			this.ntime += (long) arg1 * 1000000L;
		}
		if (var8 > this.ntime) {
			this.ntime = var8;
		}
		return var7;
	}

	@ObfuscatedName("qh.a(B)V")
	@Override
	public void reset() {
		this.ntime = System.nanoTime();
	}
}
