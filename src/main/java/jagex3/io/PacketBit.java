package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("fe")
public final class PacketBit extends Packet {

    @ObfuscatedName("fd.Eb")
    public static int[] field936 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    @ObfuscatedName("fe.Dc")
	public int field961;

	@ObfuscatedName("fe.yc")
	public Isaac field956;

	@ObfuscatedName("fe.m(II)I")
	public int method407(int arg0) {
		return arg0 * 8 - this.field961;
	}

	@ObfuscatedName("fe.l(B)V")
	public void method408() {
		super.pos = (this.field961 + 7) / 8;
	}

	@ObfuscatedName("fe.m(B)I")
	public int method409() {
		return super.field284[super.pos++] - this.field956.method430() & 0xFF;
	}

	@ObfuscatedName("fe.e(IB)I")
	public int method412(int arg0) {
		int var2 = this.field961 >> 3;
		int var3 = 0;
		int var4 = 8 - (this.field961 & 0x7);
		this.field961 += arg0;
		while (var4 < arg0) {
			var3 += (field936[var4] & super.field284[var2++]) << arg0 - var4;
			arg0 -= var4;
			var4 = 8;
		}
		int var5;
		if (arg0 == var4) {
			var5 = (super.field284[var2] & field936[var4]) + var3;
		} else {
			var5 = (field936[arg0] & super.field284[var2] >> var4 - arg0) + var3;
		}
		return var5;
	}

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("fe.n(II)V")
	public void method415(int arg0) {
		super.field284[super.pos++] = (byte) (this.field956.method430() + arg0);
	}

	@ObfuscatedName("fe.a(I[I)V")
	public void method416(int[] arg0) {
		this.field956 = new Isaac(arg0);
	}

	@ObfuscatedName("fe.p(I)V")
	public void method417() {
		this.field961 = super.pos * 8;
	}
}
