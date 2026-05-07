package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("sb")
public final class NanoTimer extends Timer {

	@ObfuscatedName("sb.r")
	public long ntime;

	@ObfuscatedName("sb.b(I)V")
	@Override
	public void reset() {
		this.init();
	}

	@ObfuscatedName("sb.a(I)V")
	@Override
	public void init() {
		this.ntime = System.nanoTime();
	}

	@ObfuscatedName("sb.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		long var3 = (long) arg1 * 1000000L;
		long var5 = this.ntime - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}
		ThreadSleep.sleepPrecise(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9;
		for (var9 = 0; var9 < 10 && (var9 < 1 || this.ntime < var7); var9++) {
			this.ntime += (long) arg0 * 1000000L;
		}
		if (this.ntime < var7) {
			this.ntime = var7;
		}
		return var9;
	}

	public NanoTimer() {
		this.init();
	}
}
