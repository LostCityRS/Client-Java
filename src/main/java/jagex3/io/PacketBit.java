package jagex3.io;

import deob.ObfuscatedName;
import deob.class35;
import jagex3.sound.JagFX;

import java.math.BigInteger;

@ObfuscatedName("fe")
public final class PacketBit extends Packet {

	@ObfuscatedName("fe.qc")
	public static int field948 = 1;

	@ObfuscatedName("fe.vc")
	public static boolean field953 = false;

	@ObfuscatedName("fe.Ac")
	public static long field958 = 0L;

	@ObfuscatedName("fe.xc")
	public static JagFX[] field955 = new JagFX[50];

	@ObfuscatedName("fe.Hc")
	public static int field965 = 0;

	@ObfuscatedName("fe.Gc")
	public static BigInteger field964 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("fe.Oc")
	public static boolean field972 = false;

	@ObfuscatedName("fe.Pc")
	public static int field973 = 0;

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
		super.field267 = (this.field961 + 7) / 8;
	}

	@ObfuscatedName("fe.m(B)I")
	public int method409() {
		return super.field284[super.field267++] - this.field956.method430() & 0xFF;
	}

	@ObfuscatedName("fe.e(IB)I")
	public int method412(int arg0) {
		int var2 = this.field961 >> 3;
		int var3 = 0;
		int var4 = 8 - (this.field961 & 0x7);
		this.field961 += arg0;
		while (var4 < arg0) {
			var3 += (class35.field936[var4] & super.field284[var2++]) << arg0 - var4;
			arg0 -= var4;
			var4 = 8;
		}
		int var5;
		if (arg0 == var4) {
			var5 = (super.field284[var2] & class35.field936[var4]) + var3;
		} else {
			var5 = (class35.field936[arg0] & super.field284[var2] >> var4 - arg0) + var3;
		}
		return var5;
	}

	public PacketBit(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("fe.n(II)V")
	public void method415(int arg0) {
		super.field284[super.field267++] = (byte) (this.field956.method430() + arg0);
	}

	@ObfuscatedName("fe.a(I[I)V")
	public void method416(int[] arg0) {
		this.field956 = new Isaac(arg0);
	}

	@ObfuscatedName("fe.p(I)V")
	public void method417() {
		this.field961 = super.field267 * 8;
	}
}
