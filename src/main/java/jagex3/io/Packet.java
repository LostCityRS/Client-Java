package jagex3.io;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable;
import jagex3.util.JagString;

import java.math.BigInteger;

@ObfuscatedName("ba")
public class Packet extends Linkable {

	@ObfuscatedName("re.l")
	public static int[] field2698 = new int[256];

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field2698[var0] = var1;
		}
	}

	@ObfuscatedName("ba.Ob")
	public byte[] field284;

	@ObfuscatedName("ba.xb")
	public int field267;

	@ObfuscatedName("ba.b(I)I")
	public final int method136() {
		this.field267 += 2;
		int var1 = ((this.field284[this.field267 - 2] & 0xFF) << 8) + (this.field284[this.field267 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ba.b(B)I")
	public final int method137() {
		this.field267 += 2;
		return ((this.field284[this.field267 - 2] & 0xFF) << 8) + (this.field284[this.field267 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("ba.a(BI[BI)V")
	public final void method138(byte[] arg0, int arg1) {
		for (int var3 = 0; var3 < arg1; var3++) {
			arg0[var3] = (byte) (this.field284[this.field267++] - 128);
		}
	}

	@ObfuscatedName("ba.c(B)I")
	public final int method139() {
		this.field267 += 2;
		int var1 = ((this.field284[this.field267 - 2] & 0xFF) << 8) + (this.field284[this.field267 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ba.c(I)La;")
	public final JagString method140() {
		int var1 = this.field267;
		while (this.field284[this.field267++] != 0) {
		}
		return Statics.method419(this.field284, var1, this.field267 - var1 - 1);
	}

	@ObfuscatedName("ba.b(IB)V")
	public final void method141(int arg0) {
		this.field284[this.field267++] = (byte) arg0;
	}

	@ObfuscatedName("ba.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method142(BigInteger arg0, BigInteger arg1) {
		int var3 = this.field267;
		this.field267 = 0;
		byte[] var4 = new byte[var3];
		this.method173(var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		this.field267 = 0;
		this.method141(var7.length);
		this.method151(var7.length, var7);
	}

	@ObfuscatedName("ba.d(B)B")
	public final byte method143() {
		return (byte) -this.field284[this.field267++];
	}

	@ObfuscatedName("ba.b(Z)I")
	public final int method144() {
		return this.field284[this.field267++] & 0xFF;
	}

	@ObfuscatedName("ba.d(I)I")
	public final int method145() {
		this.field267 += 2;
		return ((this.field284[this.field267 - 2] & 0xFF) << 8) + (this.field284[this.field267 - 1] & 0xFF);
	}

	@ObfuscatedName("ba.e(I)I")
	public final int method146() {
		this.field267 += 4;
		return ((this.field284[this.field267 - 1] & 0xFF) << 8) + ((this.field284[this.field267 - 3] & 0xFF) << 24) + ((this.field284[this.field267 + -4] & 0xFF) << 16) + (this.field284[this.field267 + -2] & 0xFF);
	}

	@ObfuscatedName("ba.e(B)I")
	public final int method147() {
		return -this.field284[this.field267++] & 0xFF;
	}

	@ObfuscatedName("ba.a(II)I")
	public final int method149(int arg0) {
		int var2 = Statics.method1044(arg0, this.field267, this.field284);
		this.method182(var2);
		return var2;
	}

	@ObfuscatedName("ba.b(II)V")
	public final void method150(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) arg0;
	}

	@ObfuscatedName("ba.a(I[BII)V")
	public final void method151(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field284[this.field267++] = arg1[var3];
		}
	}

	@ObfuscatedName("ba.f(I)I")
	public final int method152() {
		return this.field284[this.field267++] - 128 & 0xFF;
	}

	@ObfuscatedName("ba.c(II)V")
	public final void method153(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 16);
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) arg0;
	}

	@ObfuscatedName("ba.d(II)V")
	public final void method154(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 + 128);
		this.field284[this.field267++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ba.c(IB)V")
	public final void method155(int arg0) {
		this.field284[this.field267 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("ba.f(B)I")
	public final int method156() {
		return 128 - this.field284[this.field267++] & 0xFF;
	}

	@ObfuscatedName("ba.a(JZ)V")
	public final void method157(long arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 56);
		this.field284[this.field267++] = (byte) (arg0 >> 48);
		this.field284[this.field267++] = (byte) (arg0 >> 40);
		this.field284[this.field267++] = (byte) (arg0 >> 32);
		this.field284[this.field267++] = (byte) (arg0 >> 24);
		this.field284[this.field267++] = (byte) (arg0 >> 16);
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) arg0;
	}

	@ObfuscatedName("ba.g(B)I")
	public final int method158() {
		int var1 = this.field284[this.field267] & 0xFF;
		return var1 >= 128 ? this.method145() - 49152 : this.method144() + -64;
	}

	@ObfuscatedName("ba.a([IZII)V")
	public final void method159(int[] arg0, int arg1) {
		int var3 = (arg1 - 5) / 8;
		int var4 = this.field267;
		this.field267 = 5;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.method167();
			int var7 = this.method167();
			int var8 = 32;
			int var9 = -957401312;
			while (var8-- > 0) {
				var7 -= (var6 >>> 5 ^ var6 << 4) + var6 ^ arg0[var9 >>> 11 & 0x8E200003] + var9;
				var9 -= -1640531527;
				var6 -= (var7 >>> 5 ^ var7 << 4) + var7 ^ arg0[var9 & 0x3] + var9;
			}
			this.field267 -= 8;
			this.method182(var6);
			this.method182(var7);
		}
		this.field267 = var4;
	}

	@ObfuscatedName("ba.h(B)I")
	public final int method160() {
		this.field267 += 2;
		int var1 = ((this.field284[this.field267 - 1] & 0xFF) << 8) + (this.field284[this.field267 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ba.i(B)I")
	public final int method161() {
		this.field267 += 4;
		return (this.field284[this.field267 - 4] & 0xFF) + ((this.field284[this.field267 - 3] & 0xFF) << 8) + ((this.field284[this.field267 + -1] & 0xFF) << 24) + ((this.field284[this.field267 + -2] & 0xFF) << 16);
	}

	@ObfuscatedName("ba.e(II)V")
	public final void method162(int arg0) {
		this.field284[this.field267++] = (byte) arg0;
		this.field284[this.field267++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ba.d(IB)V")
	public final void method163(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 16);
		this.field284[this.field267++] = (byte) (arg0 >> 24);
		this.field284[this.field267++] = (byte) arg0;
		this.field284[this.field267++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ba.c(Z)I")
	public final int method164() {
		this.field267 += 3;
		return (this.field284[this.field267 - 1] & 0xFF) + (((this.field284[this.field267 - 3] & 0xFF) << 16) + ((this.field284[this.field267 - 2] & 0xFF) << 8));
	}

	@ObfuscatedName("ba.f(II)V")
	public final void method165(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("ba.j(B)I")
	public final int method166() {
		this.field267 += 2;
		return ((this.field284[this.field267 - 1] & 0xFF) << 8) + (this.field284[this.field267 - 2] & 0xFF);
	}

	@ObfuscatedName("ba.g(I)I")
	public final int method167() {
		this.field267 += 4;
		return ((this.field284[this.field267 - 4] & 0xFF) << 24) + (this.field284[this.field267 - 3] << 16 & 0xFF0000) + ((this.field284[this.field267 + -2] & 0xFF) << 8) + (this.field284[this.field267 + -1] & 0xFF);
	}

	@ObfuscatedName("ba.h(I)B")
	public final byte method168() {
		return (byte) (128 - this.field284[this.field267++]);
	}

	@ObfuscatedName("ba.g(II)V")
	public final void method169(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("ba.h(II)V")
	public final void method170(int arg0) {
		this.field284[this.field267++] = (byte) arg0;
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) (arg0 >> 16);
		this.field284[this.field267++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("ba.i(I)B")
	public final byte method171() {
		return (byte) (this.field284[this.field267++] - 128);
	}

	@ObfuscatedName("ba.i(II)V")
	public final void method172(int arg0) {
		this.field284[this.field267++] = (byte) -arg0;
	}

	@ObfuscatedName("ba.a([BIIB)V")
	public final void method173(byte[] arg0, int arg1) {
		for (int var3 = 0; var3 < arg1; var3++) {
			arg0[var3] = this.field284[this.field267++];
		}
	}

	@ObfuscatedName("ba.j(I)J")
	public final long method174() {
		long var1 = (long) this.method167() & 0xFFFFFFFFL;
		long var3 = (long) this.method167() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("ba.k(I)I")
	public final int method176() {
		byte var1 = this.field284[this.field267++];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var1 & 0x7F | var2) << 7;
			var1 = this.field284[this.field267++];
		}
		return var1 | var2;
	}

	@ObfuscatedName("ba.k(B)I")
	public final int method178() {
		int var1 = this.field284[this.field267] & 0xFF;
		return var1 >= 128 ? this.method145() - 32768 : this.method144();
	}

	@ObfuscatedName("ba.j(II)V")
	public final void method179(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) arg0;
		this.field284[this.field267++] = (byte) (arg0 >> 24);
		this.field284[this.field267++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("ba.e(Z)I")
	public final int method180() {
		this.field267 += 2;
		return ((this.field284[this.field267 - 1] & 0xFF) << 8) + (this.field284[this.field267 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("ba.a(La;B)V")
	public final void method181(JagString arg0) {
		this.field267 += arg0.method2(arg0.method10(), this.field284, this.field267);
		this.field284[this.field267++] = 0;
	}

	public Packet(int arg0) {
		this.field284 = Statics.method324(arg0);
		this.field267 = 0;
	}

	@ObfuscatedName("ba.k(II)V")
	public final void method182(int arg0) {
		this.field284[this.field267++] = (byte) (arg0 >> 24);
		this.field284[this.field267++] = (byte) (arg0 >> 16);
		this.field284[this.field267++] = (byte) (arg0 >> 8);
		this.field284[this.field267++] = (byte) arg0;
	}

	@ObfuscatedName("ba.l(I)I")
	public final int method183() {
		this.field267 += 4;
		return ((this.field284[this.field267 - 4] & 0xFF) << 8) + ((this.field284[this.field267 - 2] << 24 & 0xFF000000) + (this.field284[this.field267 - 1] << 16 & 0xFF0000) + (this.field284[this.field267 + -3] & 0xFF));
	}

	@ObfuscatedName("ba.m(I)B")
	public final byte method184() {
		return this.field284[this.field267++];
	}

	@ObfuscatedName("ba.l(II)V")
	public final void method185(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method141(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method150(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Packet(byte[] arg0) {
		this.field267 = 0;
		this.field284 = arg0;
	}
}
