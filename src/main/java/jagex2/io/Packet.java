package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LinkList;

import java.math.BigInteger;

// name from passapplet
@ObfuscatedName("mb")
public class Packet extends DoublyLinkable {

	// name from passapplet
	@ObfuscatedName("mb.u")
	public byte[] data;

	// name from passapplet
	@ObfuscatedName("mb.v")
	public int pos;

	@ObfuscatedName("mb.w")
	public int bitPos;

	// name from passapplet
	@ObfuscatedName("mb.x")
	public static int[] crctable = new int[256];

	@ObfuscatedName("mb.y")
	public static final int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("mb.z")
	public Isaac random;

	// name from passapplet
	@ObfuscatedName("mb.G")
	public char[] base64enctab = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("mb.D")
	public static final LinkList cacheMin = new LinkList();

	@ObfuscatedName("mb.E")
	public static final LinkList cacheMid = new LinkList();

	@ObfuscatedName("mb.F")
	public static final LinkList cacheMax = new LinkList();

	@ObfuscatedName("mb.A")
	public static int cacheMinCount;

	@ObfuscatedName("mb.B")
	public static int cacheMidCount;

	@ObfuscatedName("mb.C")
	public static int cacheMaxCount;

	@ObfuscatedName("mb.a(IB)Lmb;")
	public static Packet alloc(int arg0) {
		synchronized (cacheMid) {
			Packet var3 = null;
			if (arg0 == 0 && cacheMinCount > 0) {
				cacheMinCount--;
				var3 = (Packet) cacheMin.pop();
			} else if (arg0 == 1 && cacheMidCount > 0) {
				cacheMidCount--;
				var3 = (Packet) cacheMid.pop();
			} else if (arg0 == 2 && cacheMaxCount > 0) {
				cacheMaxCount--;
				var3 = (Packet) cacheMax.pop();
			}
			if (var3 != null) {
				var3.pos = 0;
				return var3;
			}
		}
		Packet var5 = new Packet();
		var5.pos = 0;
		if (arg0 == 0) {
			var5.data = new byte[100];
		} else if (arg0 == 1) {
			var5.data = new byte[5000];
		} else {
			var5.data = new byte[30000];
		}
		return var5;
	}

	@ObfuscatedName("mb.a(I)V")
	public void release() {
		synchronized (cacheMid) {
			this.pos = 0;
			if (this.data.length == 100 && cacheMinCount < 1000) {
				cacheMin.push(this);
				cacheMinCount++;
			} else if (this.data.length == 5000 && cacheMidCount < 250) {
				cacheMid.push(this);
				cacheMidCount++;
			} else if (this.data.length == 30000 && cacheMaxCount < 50) {
				cacheMax.push(this);
				cacheMaxCount++;
			}
		}
	}

	public Packet() {
	}

	public Packet(byte[] arg0) {
		this.data = arg0;
		this.pos = 0;
	}

	@ObfuscatedName("mb.a(II)V")
	public void pIsaac(int arg1) {
		this.data[this.pos++] = (byte) (arg1 + this.random.nextInt());
	}

	// name from passapplet
	@ObfuscatedName("mb.b(I)V")
	public void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	// name from passapplet
	@ObfuscatedName("mb.c(I)V")
	public void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	// name from passapplet
	@ObfuscatedName("mb.b(II)V")
	public void ip2(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	// name from passapplet
	@ObfuscatedName("mb.d(I)V")
	public void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	// name from passapplet
	@ObfuscatedName("mb.e(I)V")
	public void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	// name from passapplet
	@ObfuscatedName("mb.b(IB)V")
	public void ip4(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	// name from passapplet
	@ObfuscatedName("mb.a(IJ)V")
	public void p8(long arg1) {
		this.data[this.pos++] = (byte) (arg1 >> 56);
		this.data[this.pos++] = (byte) (arg1 >> 48);
		this.data[this.pos++] = (byte) (arg1 >> 40);
		this.data[this.pos++] = (byte) (arg1 >> 32);
		this.data[this.pos++] = (byte) (arg1 >> 24);
		this.data[this.pos++] = (byte) (arg1 >> 16);
		this.data[this.pos++] = (byte) (arg1 >> 8);
		this.data[this.pos++] = (byte) arg1;
	}

	// name from passapplet
	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), this.data, this.pos);
		this.pos += arg0.length();
		this.data[this.pos++] = 10;
	}

	// name from passapplet
	@ObfuscatedName("mb.a(I[BIZ)V")
	public void pdata(int arg0, byte[] arg1, int arg2) {
		for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
			this.data[this.pos++] = arg1[var6];
		}
	}

	// name from passapplet
	@ObfuscatedName("mb.a(IZ)V")
	public void psize1(int arg0) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	// name from passapplet
	@ObfuscatedName("mb.c()I")
	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	// name from passapplet
	@ObfuscatedName("mb.d()B")
	public byte g1b() {
		return this.data[this.pos++];
	}

	// name from passapplet
	@ObfuscatedName("mb.e()I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	// name from passapplet
	@ObfuscatedName("mb.f()I")
	public int g2b() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	// name from passapplet
	@ObfuscatedName("mb.g()I")
	public int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	// name from passapplet
	@ObfuscatedName("mb.h()I")
	public int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	// name from passapplet
	@ObfuscatedName("mb.f(I)J")
	public long g8() {
		long var2 = (long) this.g4() & 0xFFFFFFFFL;
		long var4 = (long) this.g4() & 0xFFFFFFFFL;
		return (var2 << 32) + var4;
	}

	// name from passapplet
	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String gstr() {
		int var1 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		return new String(this.data, var1, this.pos - var1 - 1);
	}

	// name from passapplet
	@ObfuscatedName("mb.a(B)[B")
	public byte[] gstrbyte() {
		int var2 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		byte[] var3 = new byte[this.pos - var2 - 1];
		for (int var4 = var2; var4 < this.pos - 1; var4++) {
			var3[var4 - var2] = this.data[var4];
		}
		return var3;
	}

	// name from passapplet
	@ObfuscatedName("mb.a(II[BI)V")
	public void gdata(int arg0, byte[] arg2, int arg3) {
		for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
			arg2[var5] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("mb.g(I)V")
	public void bits() {
		this.bitPos = this.pos * 8;
	}

	@ObfuscatedName("mb.c(II)I")
	public int gBit(int arg1) {
		int var3 = this.bitPos >> 3;
		int var4 = 8 - (this.bitPos & 0x7);
		int var5 = 0;
		this.bitPos += arg1;
		while (arg1 > var4) {
			var5 += (this.data[var3++] & BITMASK[var4]) << arg1 - var4;
			arg1 -= var4;
			var4 = 8;
		}
		int var6;
		if (arg1 == var4) {
			var6 = var5 + (this.data[var3] & BITMASK[var4]);
		} else {
			var6 = var5 + (this.data[var3] >> var4 - arg1 & BITMASK[arg1]);
		}
		return var6;
	}

	@ObfuscatedName("mb.h(I)V")
	public void bytes() {
		this.pos = (this.bitPos + 7) / 8;
	}

	// name from passapplet (yes, 49152)
	@ObfuscatedName("mb.j()I")
	public int gsmart() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	// name from passapplet (yes, 32768)
	@ObfuscatedName("mb.k()I")
	public int gsmarts() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	// name from passapplet
	@ObfuscatedName("mb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void rsaenc(BigInteger arg1, BigInteger arg2) {
		int var4 = this.pos;
		this.pos = 0;
		byte[] var5 = new byte[var4];
		this.gdata(0, var5, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(arg1, arg2);
		byte[] var8 = var7.toByteArray();
		this.pos = 0;
		this.p1(var8.length);
		this.pdata(0, var8, var8.length);
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
	}
}
