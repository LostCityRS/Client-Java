package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("le")
public final class MillisTimer extends Timer {

	@ObfuscatedName("le.p")
	public int field1860 = 1;

	@ObfuscatedName("le.q")
	public int field1861 = 0;

	@ObfuscatedName("le.v")
	public int field1866 = 256;

	@ObfuscatedName("le.y")
	public final long[] field1869 = new long[10];

	@ObfuscatedName("le.H")
	public long field1878 = MonotonicTime.currentTime();

	@ObfuscatedName("le.z")
	public int field1870;

	public MillisTimer() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1869[var1] = this.field1878;
		}
	}

	@ObfuscatedName("le.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		int var3 = this.field1866;
		this.field1866 = 300;
		int var4 = this.field1860;
		this.field1860 = 1;
		this.field1878 = MonotonicTime.currentTime();
		if (this.field1869[this.field1870] == 0L) {
			this.field1866 = var3;
			this.field1860 = var4;
		} else if (this.field1878 > this.field1869[this.field1870]) {
			this.field1866 = (int) ((long) (arg0 * 2560) / (this.field1878 - this.field1869[this.field1870]));
		}
		if (this.field1866 < 25) {
			this.field1866 = 25;
		}
		if (this.field1866 > 256) {
			this.field1866 = 256;
			this.field1860 = (int) ((long) arg0 - (this.field1878 - this.field1869[this.field1870]) / 10L);
		}
		if (this.field1860 > arg0) {
			this.field1860 = arg0;
		}
		this.field1869[this.field1870] = this.field1878;
		this.field1870 = (this.field1870 + 1) % 10;
		if (this.field1860 > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.field1869[var5] != 0L) {
					this.field1869[var5] += this.field1860;
				}
			}
		}
		if (arg1 > this.field1860) {
			this.field1860 = arg1;
		}
		ThreadSleep.sleepPrecise((long) this.field1860);
		int var6 = 0;
		while (this.field1861 < 256) {
			this.field1861 += this.field1866;
			var6++;
		}
		this.field1861 &= 0xFF;
		return var6;
	}

	@ObfuscatedName("le.a(I)V")
	@Override
	public void method57() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1869[var1] = 0L;
		}
	}
}
