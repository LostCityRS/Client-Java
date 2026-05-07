package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("k")
public final class MillisTimer extends Timer {

	@ObfuscatedName("k.s")
	public int opos;

	@ObfuscatedName("k.v")
	public int count;

	@ObfuscatedName("k.D")
	public final long[] otim = new long[10];

	@ObfuscatedName("k.F")
	public int delta;

	@ObfuscatedName("k.I")
	public int ratio;

	@ObfuscatedName("k.H")
	public long ntime;

	@ObfuscatedName("k.b(I)V")
	@Override
	public void reset() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.otim[var1] = 0L;
		}
	}

	@ObfuscatedName("k.a(I)V")
	@Override
	public void init() {
		this.ratio = 256;
		this.count = 0;
		this.delta = 1;
		this.ntime = MonotonicTime.currentTime();
		for (int var1 = 0; var1 < 10; var1++) {
			this.otim[var1] = this.ntime;
		}
	}

	@ObfuscatedName("k.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		int var3 = this.delta;
		this.delta = 1;
		int var4 = this.ratio;
		this.ratio = 300;
		this.ntime = MonotonicTime.currentTime();
		if (this.otim[this.opos] == 0L) {
			this.ratio = var4;
			this.delta = var3;
		} else if (this.otim[this.opos] < this.ntime) {
			this.ratio = (int) ((long) (arg0 * 2560) / (this.ntime - this.otim[this.opos]));
		}
		if (this.ratio < 25) {
			this.ratio = 25;
		}
		if (this.ratio > 256) {
			this.ratio = 256;
			this.delta = (int) ((long) arg0 - (this.ntime - this.otim[this.opos]) / 10L);
		}
		if (this.delta > arg0) {
			this.delta = arg0;
		}
		this.otim[this.opos] = this.ntime;
		this.opos = (this.opos + 1) % 10;
		if (this.delta > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.otim[var5] != 0L) {
					this.otim[var5] += this.delta;
				}
			}
		}
		if (this.delta < arg1) {
			this.delta = arg1;
		}
		ThreadSleep.sleepPrecise((long) this.delta);
		int var6 = 0;
		while (this.count < 256) {
			var6++;
			this.count += this.ratio;
		}
		this.count &= 0xFF;
		return var6;
	}

	public MillisTimer() {
		this.init();
	}
}
