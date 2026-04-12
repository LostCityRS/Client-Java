package jagex3.util;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("k")
public final class MillisTimer extends Timer {

	@ObfuscatedName("k.s")
	public int field1505;

	@ObfuscatedName("k.v")
	public int field1508;

	@ObfuscatedName("k.D")
	public final long[] field1515 = new long[10];

	@ObfuscatedName("k.F")
	public int field1517;

	@ObfuscatedName("k.I")
	public int field1520;

	@ObfuscatedName("k.H")
	public long field1519;

	@ObfuscatedName("k.b(I)V")
	@Override
	public void method570() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1515[var1] = 0L;
		}
	}

	@ObfuscatedName("k.a(I)V")
	@Override
	public void method571() {
		this.field1520 = 256;
		this.field1508 = 0;
		this.field1517 = 1;
		this.field1519 = Statics.currentTime();
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1515[var1] = this.field1519;
		}
	}

	@ObfuscatedName("k.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		int var3 = this.field1517;
		this.field1517 = 1;
		int var4 = this.field1520;
		this.field1520 = 300;
		this.field1519 = Statics.currentTime();
		if (this.field1515[this.field1505] == 0L) {
			this.field1520 = var4;
			this.field1517 = var3;
		} else if (this.field1515[this.field1505] < this.field1519) {
			this.field1520 = (int) ((long) (arg0 * 2560) / (this.field1519 - this.field1515[this.field1505]));
		}
		if (this.field1520 < 25) {
			this.field1520 = 25;
		}
		if (this.field1520 > 256) {
			this.field1520 = 256;
			this.field1517 = (int) ((long) arg0 - (this.field1519 - this.field1515[this.field1505]) / 10L);
		}
		if (this.field1517 > arg0) {
			this.field1517 = arg0;
		}
		this.field1515[this.field1505] = this.field1519;
		this.field1505 = (this.field1505 + 1) % 10;
		if (this.field1517 > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.field1515[var5] != 0L) {
					this.field1515[var5] += this.field1517;
				}
			}
		}
		if (this.field1517 < arg1) {
			this.field1517 = arg1;
		}
		Statics.sleepPrecise((long) this.field1517);
		int var6 = 0;
		while (this.field1508 < 256) {
			var6++;
			this.field1508 += this.field1520;
		}
		this.field1508 &= 0xFF;
		return var6;
	}

	public MillisTimer() {
		this.method571();
	}
}
