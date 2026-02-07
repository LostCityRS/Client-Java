package jagex3.io;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.util.JagString;

import java.math.BigInteger;

@ObfuscatedName("jd")
public class Packet extends Linkable {

	@ObfuscatedName("eb.x")
	public static int[] crctable = new int[256];

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

	@ObfuscatedName("jd.lb")
	public int pos;

	@ObfuscatedName("jd.Db")
	public byte[] data;

	public Packet(int arg0) {
		this.data = ByteArrayPool.alloc(arg0);
		this.pos = 0;
	}

	public Packet(byte[] arg0) {
		this.data = arg0;
		this.pos = 0;
	}

	@ObfuscatedName("ue.a(III[B)I")
	public static int getcrc(int arg0, int arg1, byte[] arg2) {
		int var3 = -1;
		for (int var4 = arg1; var4 < arg0; var4++) {
			var3 = var3 >>> 8 ^ crctable[(var3 ^ arg2[var4]) & 0xFF];
		}
		return ~var3;
	}

    @ObfuscatedName("rf.a(BI[B)I")
    public static int getcrc(int arg0, byte[] arg1) {
        return getcrc(arg0, 0, arg1);
    }

    @ObfuscatedName("jd.b(II)V")
	public final void method504(int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("jd.a(Z)I")
	public final int gsmart() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("jd.a(BI)V")
	public final void method506(int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("jd.a(B)Lec;")
	public final JagString fastgstr() {
		if (this.data[this.pos] == 0) {
			this.pos++;
			return null;
		} else {
			return this.gjstr();
		}
	}

	@ObfuscatedName("jd.e(I)I")
	public final int method509() {
		this.pos += 4;
		return (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos + -4] & 0xFF) << 16) + ((this.data[this.pos + -1] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.f(I)I")
	public final int method510() {
		byte var1 = this.data[this.pos++];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.data[this.pos++];
		}
		return var1 | var2;
	}

	@ObfuscatedName("jd.g(I)B")
	public final byte method511() {
		return (byte) (128 - this.data[this.pos++]);
	}

	@ObfuscatedName("jd.a(IJ)V")
	public final void method512(long arg0) {
		this.method526((int) (arg0 >> 32));
		this.method526((int) arg0);
	}

	@ObfuscatedName("jd.a(IB)V")
	public final void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("jd.b(BI)V")
	public final void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("jd.a(IZ)V")
	public final void method515(int arg0) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jd.h(I)I")
	public final int gsmarts() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 >= 128 ? this.g2() - 49152 : this.g1() + -64;
	}

	@ObfuscatedName("jd.b(B)I")
	public final int g3() {
		this.pos += 3;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos + -2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.b(Z)I")
	public final int method518() {
		this.pos += 2;
		return (this.data[this.pos - 1] - 128 & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.c(B)I")
	public final int method519() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("jd.i(I)I")
	public final int method520() {
		return this.data[this.pos++] - 128 & 0xFF;
	}

	@ObfuscatedName("jd.a(Lec;B)V")
	public final void pjstr(JagString arg0) {
		this.pos += arg0.method235(this.pos, arg0.length(), this.data);
		this.data[this.pos++] = 0;
	}

	@ObfuscatedName("jd.c(BI)I")
	public final int addcrc(int arg0) {
		int var2 = getcrc(this.pos, arg0, this.data);
		this.p4(var2);
		return var2;
	}

	@ObfuscatedName("jd.a(III[I)V")
	public final void tinydec(int arg0, int[] arg1) {
		int var3 = this.pos;
		this.pos = 5;
		int var4 = (arg0 - 5) / 8;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.g4();
			int var7 = -957401312;
			int var8 = this.g4();
			int var9 = 32;
			while (var9-- > 0) {
				var8 -= var7 + arg1[var7 >>> 11 & 0x3] ^ (var6 >>> 5 ^ var6 << 4) - -var6;
				var7 -= -1640531527;
				var6 -= var7 + arg1[var7 & 0x3] ^ (var8 >>> 5 ^ var8 << 4) + var8;
			}
			this.pos -= 8;
			this.p4(var6);
			this.p4(var8);
		}
		this.pos = var3;
	}

	@ObfuscatedName("jd.d(B)I")
	public final int method524() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@ObfuscatedName("jd.j(I)I")
	public final int method525() {
		this.pos += 4;
		return ((this.data[this.pos - 3] & 0xFF) << 8) + (this.data[this.pos - 2] << 16 & 0xFF0000) + ((this.data[this.pos + -1] & 0xFF) << 24) + (this.data[this.pos - 4] & 0xFF);
	}

	@ObfuscatedName("jd.c(II)V")
	public final void method526(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("jd.k(I)J")
	public final long g8() {
		long var1 = (long) this.g4() & 0xFFFFFFFFL;
		long var3 = (long) this.g4() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("jd.l(I)I")
	public final int method528() {
		this.pos += 2;
		int var1 = (this.data[this.pos - 1] - 128 & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("jd.e(B)I")
	public final int method529() {
		return -this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("jd.a(ZI)V")
	public final void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("jd.m(I)I")
	public final int g2() {
		this.pos += 2;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.n(I)I")
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("jd.b(IZ)V")
	public final void method533(int arg0) {
		this.data[this.pos++] = (byte) -arg0;
	}

	@ObfuscatedName("jd.o(I)B")
	public final byte method534() {
		return (byte) -this.data[this.pos++];
	}

	@ObfuscatedName("jd.p(I)I")
	public final int method535() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("jd.q(I)B")
	public final byte method536() {
		return (byte) (this.data[this.pos++] - 128);
	}

	@ObfuscatedName("jd.c(Z)I")
	public final int g4() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos + -4] & 0xFF) << 24) + ((this.data[this.pos + -2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.a([BIBI)V")
	public final void method539(byte[] arg0, int arg1) {
		for (int var3 = arg1 - 1; var3 >= 0; var3--) {
			arg0[var3] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("jd.c(IZ)V")
	public final void method540(int arg0) {
		this.data[this.pos - arg0 - 4] = (byte) (arg0 >> 24);
		this.data[this.pos - arg0 - 3] = (byte) (arg0 >> 16);
		this.data[this.pos - arg0 - 2] = (byte) (arg0 >> 8);
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jd.a(JB)V")
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

	@ObfuscatedName("jd.a(III[B)V")
	public final void method543(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.data[this.pos++] = arg1[var3];
		}
	}

	@ObfuscatedName("jd.f(B)B")
	public final byte g1b() {
		return this.data[this.pos++];
	}

	@ObfuscatedName("jd.e(II)V")
	public final void method545(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.p1(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.p2(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("jd.f(II)V")
	public final void method546(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("jd.b(IB)V")
	public final void method547(int arg0) {
		this.data[this.pos++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("jd.g(II)V")
	public final void method548(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("jd.g(B)I")
	public final int method549() {
		this.pos += 4;
		return (this.data[this.pos - 3] & 0xFF) + (((this.data[this.pos - 2] & 0xFF) << 24) - (-((this.data[this.pos - 1] & 0xFF) << 16) - ((this.data[this.pos - 4] & 0xFF) << 8)));
	}

	@ObfuscatedName("jd.h(II)V")
	public final void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("jd.d(Z)I")
	public final int g2b() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("jd.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void rsaenc(BigInteger arg0, BigInteger arg1) {
		int var3 = this.pos;
		this.pos = 0;
		byte[] var4 = new byte[var3];
		this.gdata(var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		this.pos = 0;
		this.p1(var7.length);
		this.method543(var7.length, var7);
	}

	@ObfuscatedName("jd.i(II)V")
	public final void method553(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("jd.d(IZ)V")
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

	@ObfuscatedName("jd.r(I)Lec;")
	public final JagString gjstr() {
		int var1 = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		return JagString.method186(this.data, var1, this.pos - var1 - 1);
	}

	@ObfuscatedName("jd.c(IB)V")
	public final void method556(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("jd.a(IIZ[B)V")
	public final void gdata(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = this.data[this.pos++];
		}
	}
}
