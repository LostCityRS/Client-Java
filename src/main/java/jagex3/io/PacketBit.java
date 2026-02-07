package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("ge")
public final class PacketBit extends Packet {

	@ObfuscatedName("wd.D")
	public static int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("ge.Hb")
	public int bitPos;

	@ObfuscatedName("ge.Ob")
	public Isaac random;

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ge.s(I)I")
	public int g1Enc() {
		return super.data[super.pos++] - this.random.takeNextValue() & 0xFF;
	}

	@ObfuscatedName("ge.t(I)V")
	public void gBitStart() {
		this.bitPos = super.pos * 8;
	}

	@ObfuscatedName("ge.d(IB)I")
	public int gBit(int arg0) {
		int var2 = this.bitPos >> 3;
		int var3 = 8 - (this.bitPos & 0x7);
		int var4 = 0;
		this.bitPos += arg0;
		while (arg0 > var3) {
			var4 += (BITMASK[var3] & super.data[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (var3 == arg0) {
			var5 = var4 + (BITMASK[var3] & super.data[var2]);
		} else {
			var5 = var4 + (super.data[var2] >> var3 - arg0 & BITMASK[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("ge.d(BI)I")
	public int bitsLeft(int arg0) {
		return arg0 * 8 - this.bitPos;
	}

	@ObfuscatedName("ge.u(I)V")
	public void gBitEnd() {
		super.pos = (this.bitPos + 7) / 8;
	}

	@ObfuscatedName("ge.j(II)V")
	public void p1Enc(int arg0) {
		super.data[super.pos++] = (byte) (arg0 + this.random.takeNextValue());
	}

	@ObfuscatedName("ge.a([IB)V")
	public void seed(int[] arg0) {
		this.random = new Isaac(arg0);
	}
}
