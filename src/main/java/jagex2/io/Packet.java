package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LinkList;

import java.math.BigInteger;

@ObfuscatedName("mb")
public class Packet extends DoublyLinkable {

	@ObfuscatedName("mb.s")
	public byte[] data;

	@ObfuscatedName("mb.t")
	public int pos;

	@ObfuscatedName("mb.u")
	public int bitPos;

	@ObfuscatedName("mb.v")
	public static int[] crctable = new int[256];

	@ObfuscatedName("mb.w")
	public static final int[] bitmask;

	@ObfuscatedName("mb.x")
	public Isaac random;

	@ObfuscatedName("mb.y")
	public static int cacheMinCount;

	@ObfuscatedName("mb.z")
	public static int cacheMidCount;

	@ObfuscatedName("mb.B")
	public static LinkList cacheMin;

	@ObfuscatedName("mb.C")
	public static LinkList cacheMid;

	@ObfuscatedName("mb.D")
	public static LinkList cacheMax;

	@ObfuscatedName("mb.A")
	public static int cacheMaxCount;

	@ObfuscatedName("mb.a(II)Lmb;")
	public static Packet alloc(int arg0, int arg1) {
		LinkList var2 = cacheMid;
		synchronized (cacheMid) {
			Packet var3 = null;
			if (arg1 == 0 && cacheMinCount > 0) {
				cacheMinCount--;
				var3 = (Packet) cacheMin.removeHead();
			} else if (arg1 == 1 && cacheMidCount > 0) {
				cacheMidCount--;
				var3 = (Packet) cacheMid.removeHead();
			} else if (arg1 == 2 && cacheMaxCount > 0) {
				cacheMaxCount--;
				var3 = (Packet) cacheMax.removeHead();
			}
			if (var3 != null) {
				var3.pos = 0;
				Packet var4 = var3;
				return var4;
			}
		}
		if (arg0 != 5) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		Packet var7 = new Packet();
		var7.pos = 0;
		if (arg1 == 0) {
			var7.data = new byte[100];
		} else if (arg1 == 1) {
			var7.data = new byte[5000];
		} else {
			var7.data = new byte[30000];
		}
		return var7;
	}

	@ObfuscatedName("mb.a(I)V")
	public void release() {
		LinkList var2 = cacheMid;
		synchronized (cacheMid) {
			this.pos = 0;
			if (this.data.length == 100 && cacheMinCount < 1000) {
				cacheMin.addTail(this);
				cacheMinCount++;
				return;
			}
			if (this.data.length != 5000 || cacheMidCount >= 250) {
				if (this.data.length == 30000 && cacheMaxCount < 50) {
					cacheMax.addTail(this);
					cacheMaxCount++;
					return;
				}
				return;
			}
			cacheMid.addTail(this);
			cacheMidCount++;
		}
	}

	public Packet() {
	}

	public Packet(byte[] arg1) {
		this.data = arg1;
		this.pos = 0;
	}

	@ObfuscatedName("mb.a(IB)V")
	public void pIsaac(int arg0) {
		this.data[this.pos++] = (byte) (arg0 + this.random.nextInt());
	}

	@ObfuscatedName("mb.b(I)V")
	public void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("mb.c(I)V")
	public void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(IZ)V")
	public void ip2(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("mb.d(I)V")
	public void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void ip4(int arg1) {
		this.data[this.pos++] = (byte) arg1;
		this.data[this.pos++] = (byte) (arg1 >> 8);
		this.data[this.pos++] = (byte) (arg1 >> 16);
		this.data[this.pos++] = (byte) (arg1 >> 24);
	}

	@ObfuscatedName("mb.a(JZ)V")
	public void p8(long arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 56);
		this.data[this.pos++] = (byte) (arg0 >> 48);
		this.data[this.pos++] = (byte) (arg0 >> 40);
		this.data[this.pos++] = (byte) (arg0 >> 32);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), this.data, this.pos);
		this.pos += arg0.length();
		this.data[this.pos++] = 10;
	}

	@ObfuscatedName("mb.a(III[B)V")
	public void pdata(int arg0, int arg2, byte[] arg3) {
		for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
			this.data[this.pos++] = arg3[var6];
		}
	}

	@ObfuscatedName("mb.c(II)V")
	public void psize1(int arg1) {
		this.data[this.pos - arg1 - 1] = (byte) arg1;
	}

	@ObfuscatedName("mb.c()I")
	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte g1b() {
		return this.data[this.pos++];
	}

	@ObfuscatedName("mb.e()I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int g2b() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int g3() {
		this.pos += 3;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("mb.h()I")
	public int g4() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mb.f(I)J")
	public long g8() {
		long var2 = (long) this.g4() & 0xFFFFFFFFL;
		long var4 = (long) this.g4() & 0xFFFFFFFFL;
		return (var2 << 32) + var4;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String gjstr() {
		int var1 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		return new String(this.data, var1, this.pos - var1 - 1);
	}

	@ObfuscatedName("mb.g(I)[B")
	public byte[] gjstrraw() {
		int var2 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		byte[] var3 = new byte[this.pos - var2 - 1];
		for (int var4 = var2; var4 < this.pos - 1; var4++) {
			var3[var4 - var2] = this.data[var4];
		}
		return var3;
	}

	@ObfuscatedName("mb.a([BIII)V")
	public void gdata(byte[] arg0, int arg1, int arg3) {
		for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
			arg0[var5] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("mb.h(I)V")
	public void bits() {
		this.bitPos = this.pos * 8;
	}

	@ObfuscatedName("mb.d(II)I")
	public int gBit(int arg1) {
		int var3 = this.bitPos >> 3;
		int var4 = 8 - (this.bitPos & 0x7);
		int var5 = 0;
		this.bitPos += arg1;
		while (arg1 > var4) {
			var5 += (this.data[var3++] & bitmask[var4]) << arg1 - var4;
			arg1 -= var4;
			var4 = 8;
		}
		int var6;
		if (arg1 == var4) {
			var6 = (this.data[var3] & bitmask[var4]) + var5;
		} else {
			var6 = (this.data[var3] >> var4 - arg1 & bitmask[arg1]) + var5;
		}
		return var6;
	}

	@ObfuscatedName("mb.i(I)V")
	public void bytes() {
		this.pos = (this.bitPos + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int gsmart() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int gsmarts() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("mb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void rsaenc(BigInteger arg1, BigInteger arg2) {
		int var4 = this.pos;
		this.pos = 0;
		byte[] var5 = new byte[var4];
		this.gdata(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(arg1, arg2);
		byte[] var8 = var7.toByteArray();
		this.pos = 0;
		this.p1(var8.length);
		this.pdata(var8.length, 0, var8);
	}

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
		bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		cacheMin = new LinkList();
		cacheMid = new LinkList();
		cacheMax = new LinkList();
	}
}
