package deob;

import java.math.BigInteger;

@ObfuscatedName("ci")
public final class class32 extends class86 {

	@ObfuscatedName("ci.j")
	public int field510 = 0;

	@ObfuscatedName("ci.k")
	public int field511;

	@ObfuscatedName("ci.l")
	public int field512 = 1;

	@ObfuscatedName("ci.m")
	public long field513 = class206.method1418();

	@ObfuscatedName("ci.o")
	public static final BigInteger field515 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("ci.p")
	public final long[] field516 = new long[10];

	@ObfuscatedName("ci.r")
	public static class130 field518;

	@ObfuscatedName("ci.s")
	public static int field519 = 0;

	@ObfuscatedName("ci.t")
	public static final class88 field520 = class208.method1423(105, "welle:");

	@ObfuscatedName("ci.u")
	public int field521 = 256;

	@ObfuscatedName("ci.v")
	public static final class88 field522 = class208.method1423(105, "Angreifen");

	@ObfuscatedName("ci.w")
	public static final class88 field523 = class208.method1423(105, "<)4col> x");

	@ObfuscatedName("ci.x")
	public static int field524 = 0;

	@ObfuscatedName("ci.z")
	public static int field526 = 0;

	@ObfuscatedName("ci.a(ZLnb;II)Lpf;")
	public static class169 method203(class144 arg0, int arg1, int arg2) {
		return class47.method358(arg0, arg2, arg1) ? class237.method1571() : null;
	}

	public class32() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field516[var1] = this.field513;
		}
	}

	@ObfuscatedName("ci.a(III)I")
	@Override
	public int method204(int arg0, int arg1) {
		int var3 = this.field521;
		this.field521 = 300;
		int var4 = this.field512;
		this.field512 = 1;
		this.field513 = class206.method1418();
		if (this.field516[this.field511] == 0L) {
			this.field512 = var4;
			this.field521 = var3;
		} else if (this.field516[this.field511] < this.field513) {
			this.field521 = (int) ((long) (arg1 * 2560) / (this.field513 - this.field516[this.field511]));
		}
		if (this.field521 < 25) {
			this.field521 = 25;
		}
		if (this.field521 > 256) {
			this.field521 = 256;
			this.field512 = (int) ((long) arg1 - (this.field513 - this.field516[this.field511]) / 10L);
		}
		if (this.field512 > arg1) {
			this.field512 = arg1;
		}
		this.field516[this.field511] = this.field513;
		this.field511 = (this.field511 + 1) % 10;
		if (this.field512 > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.field516[var5] != 0L) {
					this.field516[var5] += this.field512;
				}
			}
		}
		if (this.field512 < arg0) {
			this.field512 = arg0;
		}
		int var6 = 0;
		class21.method98((long) this.field512);
		while (this.field510 < 256) {
			var6++;
			this.field510 += this.field521;
		}
		this.field510 &= 0xFF;
		return var6;
	}

	@ObfuscatedName("ci.a(B)V")
	@Override
	public void method205() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field516[var1] = 0L;
		}
	}
}
