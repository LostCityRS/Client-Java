package deob;

import java.math.BigInteger;

@ObfuscatedName("fe")
public final class class36 extends class8 {

	@ObfuscatedName("fe.qc")
	public static int field948 = 1;

	@ObfuscatedName("fe.vc")
	public static boolean field953 = false;

	@ObfuscatedName("fe.Ac")
	public static long field958 = 0L;

	@ObfuscatedName("fe.Ec")
	public static class1 field962 = Statics.method931("Aus");

	@ObfuscatedName("fe.xc")
	public static class77[] field955 = new class77[50];

	@ObfuscatedName("fe.Hc")
	public static int field965 = 0;

	@ObfuscatedName("fe.Nc")
	public static class1 field971 = Statics.method931("Please wait)3)3)3");

	@ObfuscatedName("fe.zc")
	public static class1 field957 = field971;

	@ObfuscatedName("fe.Gc")
	public static BigInteger field964 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("fe.Oc")
	public static boolean field972 = false;

	@ObfuscatedName("fe.Tc")
	public static class1 field977 = Statics.method931("da dieser Computer gegen unsere ");

	@ObfuscatedName("fe.Sc")
	public static class1 field976 = Statics.method931("oder benutzen Sie eine andere Welt)3");

	@ObfuscatedName("fe.Pc")
	public static int field973 = 0;

	@ObfuscatedName("fe.Dc")
	public int field961;

	@ObfuscatedName("fe.yc")
	public class39 field956;

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

	public class36(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("fe.n(II)V")
	public void method415(int arg0) {
		super.field284[super.field267++] = (byte) (this.field956.method430() + arg0);
	}

	@ObfuscatedName("fe.a(I[I)V")
	public void method416(int[] arg0) {
		this.field956 = new class39(arg0);
	}

	@ObfuscatedName("fe.p(I)V")
	public void method417() {
		this.field961 = super.field267 * 8;
	}
}
