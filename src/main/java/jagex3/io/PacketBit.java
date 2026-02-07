package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("ge")
public final class PacketBit extends Packet {

	@ObfuscatedName("wd.D")
	public static int[] field3607 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("ge.Hb")
	public int field1100;

	@ObfuscatedName("ge.Ob")
	public Isaac field1107;

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ge.s(I)I")
	public int g1Enc() {
		return super.data[super.pos++] - this.field1107.method1101() & 0xFF;
	}

	@ObfuscatedName("ge.t(I)V")
	public void method351() {
		this.field1100 = super.pos * 8;
	}

	@ObfuscatedName("ge.d(IB)I")
	public int method352(int arg0) {
		int var2 = this.field1100 >> 3;
		int var3 = 8 - (this.field1100 & 0x7);
		int var4 = 0;
		this.field1100 += arg0;
		while (arg0 > var3) {
			var4 += (field3607[var3] & super.data[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (var3 == arg0) {
			var5 = var4 + (field3607[var3] & super.data[var2]);
		} else {
			var5 = var4 + (super.data[var2] >> var3 - arg0 & field3607[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("ge.d(BI)I")
	public int method354(int arg0) {
		return arg0 * 8 - this.field1100;
	}

	@ObfuscatedName("ge.u(I)V")
	public void method355() {
		super.pos = (this.field1100 + 7) / 8;
	}

	@ObfuscatedName("ge.j(II)V")
	public void p1Enc(int arg0) {
		super.data[super.pos++] = (byte) (arg0 + this.field1107.method1101());
	}

	@ObfuscatedName("ge.a([IB)V")
	public void method359(int[] arg0) {
		this.field1107 = new Isaac(arg0);
	}
}
