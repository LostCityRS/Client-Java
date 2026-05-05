package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("ci")
public final class MillisTimer extends Timer {

	@ObfuscatedName("ci.j")
	public int count = 0;

	@ObfuscatedName("ci.k")
	public int opos;

	@ObfuscatedName("ci.l")
	public int delta = 1;

	@ObfuscatedName("ci.m")
	public long ntime = MonotonicTime.currentTime();

	@ObfuscatedName("ci.p")
	public final long[] otim = new long[10];

	@ObfuscatedName("ci.u")
	public int ratio = 256;

	@ObfuscatedName("ci.z")
	public static int field526 = 0;

	public MillisTimer() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.otim[var1] = this.ntime;
		}
	}

	@ObfuscatedName("ci.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		int var3 = this.ratio;
		this.ratio = 300;
		int var4 = this.delta;
		this.delta = 1;
		this.ntime = MonotonicTime.currentTime();
		if (this.otim[this.opos] == 0L) {
			this.delta = var4;
			this.ratio = var3;
		} else if (this.otim[this.opos] < this.ntime) {
			this.ratio = (int) ((long) (arg1 * 2560) / (this.ntime - this.otim[this.opos]));
		}
		if (this.ratio < 25) {
			this.ratio = 25;
		}
		if (this.ratio > 256) {
			this.ratio = 256;
			this.delta = (int) ((long) arg1 - (this.ntime - this.otim[this.opos]) / 10L);
		}
		if (this.delta > arg1) {
			this.delta = arg1;
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
		if (this.delta < arg0) {
			this.delta = arg0;
		}
		int var6 = 0;
		ThreadSleep.sleepPrecise((long) this.delta);
		while (this.count < 256) {
			var6++;
			this.count += this.ratio;
		}
		this.count &= 0xFF;
		return var6;
	}

	@ObfuscatedName("ci.a(B)V")
	@Override
	public void reset() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.otim[var1] = 0L;
		}
	}
}
