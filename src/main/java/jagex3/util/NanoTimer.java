package jagex3.util;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("sb")
public final class NanoTimer extends Timer {

	@ObfuscatedName("sb.r")
	public long field2746;

	@ObfuscatedName("sb.b(I)V")
	@Override
	public void method570() {
		this.method571();
	}

	@ObfuscatedName("sb.a(I)V")
	@Override
	public void method571() {
		this.field2746 = System.nanoTime();
	}

	@ObfuscatedName("sb.a(III)I")
	@Override
	public int count(int arg0, int arg1) {
		long var3 = (long) arg1 * 1000000L;
		long var5 = this.field2746 - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}
		Statics.sleepPrecise(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9;
		for (var9 = 0; var9 < 10 && (var9 < 1 || this.field2746 < var7); var9++) {
			this.field2746 += (long) arg0 * 1000000L;
		}
		if (this.field2746 < var7) {
			this.field2746 = var7;
		}
		return var9;
	}

	public NanoTimer() {
		this.method571();
	}
}
