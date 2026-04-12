package jagex3.io;

import deob.ObfuscatedName;
import jagex3.config.VarBitType;

@ObfuscatedName("fe")
public final class PacketBit extends Packet {

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
			var3 += (VarBitType.field936[var4] & super.field284[var2++]) << arg0 - var4;
			arg0 -= var4;
			var4 = 8;
		}
		int var5;
		if (arg0 == var4) {
			var5 = (super.field284[var2] & VarBitType.field936[var4]) + var3;
		} else {
			var5 = (VarBitType.field936[arg0] & super.field284[var2] >> var4 - arg0) + var3;
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
