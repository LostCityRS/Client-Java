package deob;

@ObfuscatedName("ae")
public final class PacketBit extends Packet {

	@ObfuscatedName("ae.ec")
	public Isaac field91;

	@ObfuscatedName("ae.Qb")
	public static int field77;

	@ObfuscatedName("ae.Rb")
	public int field78;

	@ObfuscatedName("ae.Xb")
	public static int field84;

	@ObfuscatedName("ae.a(ZIIIII)V")
	public static void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (Statics.field1207 <= arg3 && Statics.field183 >= arg4 && arg1 >= Statics.field919 && Statics.field279 >= arg0) {
			Statics.method1502(arg3, arg2, arg4, arg1, arg0);
		} else {
			client.method226(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@ObfuscatedName("ae.e(IB)Z")
	public static boolean method27(int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

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
			var4 += (Statics.field4142[var3] & super.data[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = var4 + (super.data[var2] & Statics.field4142[var3]);
		} else {
			var5 = var4 + (super.data[var2] >> var3 - arg0 & Statics.field4142[arg0]);
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
