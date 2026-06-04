package jagex3.io;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.jstring.JagString;

import java.math.BigInteger;

@ObfuscatedName("ea")
public class Packet extends Linkable {

	@ObfuscatedName("ti.u")
	public static final int[] crctable = new int[256];
	@ObfuscatedName("mj.j")
	public static final long[] crctable64 = new long[256];

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
			crctable[var0] = var1;
		}
	}

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			long var1 = (long) var0;
			for (int var3 = 0; var3 < 8; var3++) {
				if ((var1 & 0x1L) == 1L) {
					var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var1 >>>= 0x1;
				}
			}
			crctable64[var0] = var1;
		}
	}

	@ObfuscatedName("ea.ib")
	public byte[] data;

	@ObfuscatedName("ea.X")
	public int pos;

	public Packet(int arg0) {
		this.data = ByteArrayPool.alloc(arg0);
		this.pos = 0;
	}

	public Packet(byte[] arg0) {
		this.pos = 0;
		this.data = arg0;
	}

	@ObfuscatedName("vb.a(BI[BI)I")
	public static int getcrc(int arg0, byte[] arg1, int arg2) {
		int var3 = -1;
		for (int var4 = arg0; var4 < arg2; var4++) {
			var3 = var3 >>> 8 ^ crctable[(var3 ^ arg1[var4]) & 0xFF];
		}
		return ~var3;
	}

	@ObfuscatedName("bc.a(Li;I)I")
	public static int pjstrlen(JagString arg0) {
		return arg0.length() + 1;
	}

	@ObfuscatedName("hd.a([BBI)I")
	public static int method541(byte[] arg0, int arg1) {
		return getcrc(0, arg0, arg1);
	}

	@ObfuscatedName("ea.b(B)I")
	public final int g1_alt2() {
		return -this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("ea.a(BJ)V")
	public final void p8_alt3(long arg0) {
		this.p4_alt3((int) (arg0 >> 32));
		this.p4_alt3((int) arg0);
	}

	@ObfuscatedName("ea.b(II)V")
	public final void p1_alt2(int arg0) {
		this.data[this.pos++] = (byte) -arg0;
	}

	@ObfuscatedName("ea.b(I)Li;")
	public final JagString gjstr() {
		int var1 = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		return JagString.fromBytes(var1, this.data, this.pos - var1 - 1);
	}

	@ObfuscatedName("ea.c(I)I")
	public final int g4_alt1() {
		this.pos += 4;
		return ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos + -2] & 0xFF) << 16) + (this.data[this.pos + -4] & 0xFF);
	}

	@ObfuscatedName("ea.c(II)J")
	public final long method300(int arg0) {
		int var5 = arg0 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		int var2 = var5 * 8;
		long var3 = 0L;
		while (var2 >= 0) {
			var3 |= ((long) this.data[this.pos++] & 0xFFL) << var2;
			var2 -= 8;
		}
		return var3;
	}

	@ObfuscatedName("ea.d(I)I")
	public final int g2() {
		this.pos += 2;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.e(I)I")
	public final int g2_alt3() {
		this.pos += 2;
		return (this.data[this.pos - 2] - 128 & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.f(I)B")
	public final byte g1b_alt1() {
		return (byte) (this.data[this.pos++] - 128);
	}

	@ObfuscatedName("ea.g(I)I")
	public final int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 3] & 0xFF) << 16) + (this.data[this.pos + -1] & 0xFF);
	}

	@ObfuscatedName("ea.d(II)V")
	public final void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("ea.a(IIJ)V")
	public final void method306(int arg0, long arg1) {
		int var5 = arg0 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		for (int var4 = var5 * 8; var4 >= 0; var4 -= 8) {
			this.data[this.pos++] = (byte) (arg1 >> var4);
		}
	}

	@ObfuscatedName("ea.a(ZI[BI)V")
	public final void gdata(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("ea.a(ZI)V")
	public final void psmart(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.p1(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.p2(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ea.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void rsaenc(BigInteger arg0, BigInteger arg1) {
		int var3 = this.pos;
		byte[] var4 = new byte[var3];
		this.pos = 0;
		this.gdata(var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		this.pos = 0;
		this.p1(var7.length);
		this.pdata(var7.length, var7);
	}

	@ObfuscatedName("ea.c(B)I")
	public final int g2b_alt3() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ea.h(I)I")
	public final int g4_alt3() {
		this.pos += 4;
		return (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8) + ((this.data[this.pos + -4] & 0xFF) << 16) + ((this.data[this.pos + -3] & 0xFF) << 24);
	}

	@ObfuscatedName("ea.a(IB)V")
	public final void p2_alt1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ea.a([BIII)V")
	public final void gdata_alt1(byte[] arg0, int arg1) {
		for (int var3 = arg1 - 1; var3 >= 0; var3--) {
			arg0[var3] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("ea.e(II)V")
	public final void p4_alt3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ea.d(B)I")
	public final int gMidiVarLen() {
		byte var1 = this.data[this.pos++];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.data[this.pos++];
		}
		return var2 | var1;
	}

	@ObfuscatedName("ea.i(I)I")
	public final int g1_alt1() {
		return this.data[this.pos++] - 128 & 0xFF;
	}

	@ObfuscatedName("ea.j(I)I")
	public final int g4_alt2() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 8) + ((this.data[this.pos - 1] & 0xFF) << 16) + ((this.data[this.pos + -2] & 0xFF) << 24) + (this.data[this.pos + -3] & 0xFF);
	}

	@ObfuscatedName("ea.k(I)J")
	public final long g8() {
		long var1 = (long) this.g4() & 0xFFFFFFFFL;
		long var3 = (long) this.g4() & 0xFFFFFFFFL;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("ea.a(II[II)V")
	public final void tinydec(int arg0, int[] arg1) {
		int var3 = (arg0 - 5) / 8;
		int var4 = this.pos;
		this.pos = 5;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.g4();
			int var7 = this.g4();
			int var8 = -957401312;
			int var9 = 32;
			while (var9-- > 0) {
				var7 -= var8 + arg1[var8 >>> 11 & 0x3] ^ (var6 >>> 5 ^ var6 << 4) - -var6;
				var8 -= -1640531527;
				var6 -= var7 + (var7 >>> 5 ^ var7 << 4) ^ arg1[var8 & 0x3] + var8;
			}
			this.pos -= 8;
			this.p4(var6);
			this.p4(var7);
		}
		this.pos = var4;
	}

	@ObfuscatedName("ea.e(B)I")
	public final int g4() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos + -4] & 0xFF) << 24) + ((this.data[this.pos + -3] & 0xFF) << 16);
	}

	@ObfuscatedName("ea.l(I)B")
	public final byte g1b() {
		return this.data[this.pos++];
	}

	@ObfuscatedName("ea.a(BI[BI)V")
	public final void pdata(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.data[this.pos++] = arg1[var3];
		}
	}

	@ObfuscatedName("ea.f(II)V")
	public final void p4_alt2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("ea.g(II)V")
	public final void p1_alt3(int arg0) {
		this.data[this.pos++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("ea.a(JB)V")
	public final void p8(long arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 56);
		this.data[this.pos++] = (byte) (arg0 >> 48);
		this.data[this.pos++] = (byte) (arg0 >> 40);
		this.data[this.pos++] = (byte) (arg0 >> 32);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("ea.h(II)V")
	public final void pMidiVarLen(int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.p1(arg0 >>> 28 | 0x80);
					}
					this.p1(arg0 >>> 21 | 0x80);
				}
				this.p1(arg0 >>> 14 | 0x80);
			}
			this.p1(arg0 >>> 7 | 0x80);
		}
		this.p1(arg0 & 0x7F);
	}

	@ObfuscatedName("ea.i(II)V")
	public final void p2_alt2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("ea.f(B)I")
	public final int method332() {
		int var1 = 0;
		int var2;
		for (var2 = this.method350(); var2 == 32767; var2 = this.method350()) {
			var1 += 32767;
		}
		return var1 + var2;
	}

	@ObfuscatedName("ea.a(BI)V")
	public final void psize4(int arg0) {
		this.data[this.pos - arg0 - 4] = (byte) (arg0 >> 24);
		this.data[this.pos - arg0 - 3] = (byte) (arg0 >> 16);
		this.data[this.pos - arg0 - 2] = (byte) (arg0 >> 8);
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("ea.g(B)I")
	public final int g2b() {
		this.pos += 2;
		int var1 = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ea.m(I)B")
	public final byte g1b_alt2() {
		return (byte) -this.data[this.pos++];
	}

	@ObfuscatedName("ea.a(Li;B)V")
	public final void pjstr(JagString arg0) {
		this.pos += arg0.copyToArray(arg0.length(), this.pos, this.data);
		this.data[this.pos++] = 0;
	}

	@ObfuscatedName("ea.b(IB)V")
	public final void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("ea.j(II)V")
	public final void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("ea.n(I)I")
	public final int g2b_alt2() {
		this.pos += 2;
		int var1 = (this.data[this.pos - 1] - 128 & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ea.h(B)I")
	public final int method340() {
		this.pos += 3;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos + -3] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.k(II)V")
	public final void psize1(int arg0) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("ea.b(Z)I")
	public final int method342() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() + -49152;
	}

	@ObfuscatedName("ea.o(I)I")
	public final int g2_alt1() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@ObfuscatedName("ea.c(IB)V")
	public final void p2_alt3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ea.d(IB)I")
	public final int addcrc(int arg0) {
		int var2 = getcrc(arg0, this.data, this.pos);
		this.p4(var2);
		return var2;
	}

	@ObfuscatedName("ea.l(II)V")
	public final void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("ea.p(I)I")
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("ea.c(Z)I")
	public final int g2_alt2() {
		this.pos += 2;
		return (this.data[this.pos - 1] - 128 & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.q(I)I")
	public final int method350() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("ea.b(ZI)V")
	public final void p4_alt1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("ea.r(I)I")
	public final int g1_alt3() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("ea.s(I)Li;")
	public final JagString fastgstr() {
		if (this.data[this.pos] == 0) {
			this.pos++;
			return null;
		} else {
			return this.gjstr();
		}
	}
}
