package jagex3.util;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("k")
public final class MillisTimer extends Timer {

	@ObfuscatedName("k.s")
	public int field1505;

	@ObfuscatedName("k.v")
	public int field1508;

	@ObfuscatedName("k.C")
	public static int[] field1514 = new int[99];

	@ObfuscatedName("k.J")
	public static int[] field1521 = new int[50];

	@ObfuscatedName("k.Q")
	public static int field1528 = 0;

	@ObfuscatedName("k.D")
	public final long[] field1515 = new long[10];

	@ObfuscatedName("k.F")
	public int field1517;

	@ObfuscatedName("k.I")
	public int field1520;

	@ObfuscatedName("k.H")
	public long field1519;

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1514[var1] = var0 / 4;
		}
	}

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
		this.field1519 = Statics.method869();
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1515[var1] = this.field1519;
		}
	}

	@ObfuscatedName("k.a(III)I")
	@Override
	public int method573(int arg0, int arg1) {
		int var3 = this.field1517;
		this.field1517 = 1;
		int var4 = this.field1520;
		this.field1520 = 300;
		this.field1519 = Statics.method869();
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
