package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("ae")
public final class PacketBit extends Packet {

	@ObfuscatedName("ua.l")
	public static final int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	@ObfuscatedName("ae.ec")
	public Isaac random;

	@ObfuscatedName("ae.Rb")
	public int bitPos;

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ae.m(II)I")
	public int gBit(int arg0) {
		int var2 = this.bitPos >> 3;
		int var3 = 8 - (this.bitPos & 0x7);
		this.bitPos += arg0;
		int var4 = 0;
		while (var3 < arg0) {
			var4 += (BITMASK[var3] & super.data[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = var4 + (super.data[var2] & BITMASK[var3]);
		} else {
			var5 = var4 + (super.data[var2] >> var3 - arg0 & BITMASK[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("ae.a(I[BZI)V")
	public void gIsaacArrayBuffer(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = (byte) (super.data[super.pos++] - this.random.takeNextValue());
		}
	}

	@ObfuscatedName("ae.b(BI)V")
	public void p1Enc(int arg0) {
		super.data[super.pos++] = (byte) (arg0 + this.random.takeNextValue());
	}

	@ObfuscatedName("ae.c(ZI)I")
	public int bitsLeft(int arg0) {
		return arg0 * 8 - this.bitPos;
	}

	@ObfuscatedName("ae.i(B)I")
	public int g1Enc() {
		return super.data[super.pos++] - this.random.takeNextValue() & 0xFF;
	}

	@ObfuscatedName("ae.u(I)V")
	public void gBitStart() {
		this.bitPos = super.pos * 8;
	}

	@ObfuscatedName("ae.v(I)V")
	public void gBitEnd() {
		super.pos = (this.bitPos + 7) / 8;
	}

	@ObfuscatedName("ae.a([IB)V")
	public void seed(int[] arg0) {
		this.random = new Isaac(arg0);
	}
}
