package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("ae")
public final class PacketBit extends Packet {

	@ObfuscatedName("ua.l")
	public static final int[] field4142 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	@ObfuscatedName("ae.ec")
	public Isaac field91;

	@ObfuscatedName("ae.Rb")
	public int field78;

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ae.m(II)I")
	public int method28(int arg0) {
		int var2 = this.field78 >> 3;
		int var3 = 8 - (this.field78 & 0x7);
		this.field78 += arg0;
		int var4 = 0;
		while (var3 < arg0) {
			var4 += (field4142[var3] & super.data[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = var4 + (super.data[var2] & field4142[var3]);
		} else {
			var5 = var4 + (super.data[var2] >> var3 - arg0 & field4142[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("ae.a(I[BZI)V")
	public void method29(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = (byte) (super.data[super.pos++] - this.field91.method978());
		}
	}

	@ObfuscatedName("ae.b(BI)V")
	public void method30(int arg0) {
		super.data[super.pos++] = (byte) (arg0 + this.field91.method978());
	}

	@ObfuscatedName("ae.c(ZI)I")
	public int method31(int arg0) {
		return arg0 * 8 - this.field78;
	}

	@ObfuscatedName("ae.i(B)I")
	public int g1Enc() {
		return super.data[super.pos++] - this.field91.method978() & 0xFF;
	}

	@ObfuscatedName("ae.u(I)V")
	public void method34() {
		this.field78 = super.pos * 8;
	}

	@ObfuscatedName("ae.v(I)V")
	public void method35() {
		super.pos = (this.field78 + 7) / 8;
	}

	@ObfuscatedName("ae.a([IB)V")
	public void seed(int[] arg0) {
		this.field91 = new Isaac(arg0);
	}
}
