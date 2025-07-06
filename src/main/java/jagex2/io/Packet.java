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

	static {
		for (int b = 0; b < 256; b++) {
			int remainder = b;

			for (int bit = 0; bit < 8; bit++) {
				if ((remainder & 0x1) == 1) {
					remainder = remainder >>> 1 ^ 0xEDB88320;
				} else {
					remainder >>>= 0x1;
				}
			}

			crctable[b] = remainder;
		}
	}

	@ObfuscatedName("mb.w")
	public static final int[] bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("mb.x")
	public Isaac random;

	@ObfuscatedName("mb.y")
	public static int cacheMinCount;

	@ObfuscatedName("mb.z")
	public static int cacheMidCount;

	@ObfuscatedName("mb.B")
	public static LinkList cacheMin = new LinkList();;

	@ObfuscatedName("mb.C")
	public static LinkList cacheMid = new LinkList();;

	@ObfuscatedName("mb.D")
	public static LinkList cacheMax = new LinkList();;

	@ObfuscatedName("mb.A")
	public static int cacheMaxCount;

	@ObfuscatedName("mb.a(II)Lmb;")
	public static Packet alloc(int size) {
		LinkList sync = cacheMid;
		synchronized (sync) {
			Packet buf = null;

			if (size == 0 && cacheMinCount > 0) {
				cacheMinCount--;
				buf = (Packet) cacheMin.pop();
			} else if (size == 1 && cacheMidCount > 0) {
				cacheMidCount--;
				buf = (Packet) cacheMid.pop();
			} else if (size == 2 && cacheMaxCount > 0) {
				cacheMaxCount--;
				buf = (Packet) cacheMax.pop();
			}

			if (buf != null) {
				buf.pos = 0;
				return buf;
			}
		}

		Packet buf = new Packet();
		buf.pos = 0;

		if (size == 0) {
			buf.data = new byte[100];
		} else if (size == 1) {
			buf.data = new byte[5000];
		} else {
			buf.data = new byte[30000];
		}

		return buf;
	}

	@ObfuscatedName("mb.a(I)V")
	public void release() {
		LinkList sync = cacheMid;
		synchronized (sync) {
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

	public Packet(byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	@ObfuscatedName("mb.a(IB)V")
	public void pIsaac(int ptype) {
		this.data[this.pos++] = (byte) (ptype + this.random.nextInt());
	}

	@ObfuscatedName("mb.b(I)V")
	public void p1(int n) {
		this.data[this.pos++] = (byte) n;
	}

	@ObfuscatedName("mb.c(I)V")
	public void p2(int n) {
		this.data[this.pos++] = (byte) (n >> 8);
		this.data[this.pos++] = (byte) n;
	}

	@ObfuscatedName("mb.a(IZ)V")
	public void ip2(int n) {
		this.data[this.pos++] = (byte) n;
		this.data[this.pos++] = (byte) (n >> 8);
	}

	@ObfuscatedName("mb.d(I)V")
	public void p3(int n) {
		this.data[this.pos++] = (byte) (n >> 16);
		this.data[this.pos++] = (byte) (n >> 8);
		this.data[this.pos++] = (byte) n;
	}

	@ObfuscatedName("mb.e(I)V")
	public void p4(int n) {
		this.data[this.pos++] = (byte) (n >> 24);
		this.data[this.pos++] = (byte) (n >> 16);
		this.data[this.pos++] = (byte) (n >> 8);
		this.data[this.pos++] = (byte) n;
	}

	@ObfuscatedName("mb.b(II)V")
	public void ip4(int n) {
		this.data[this.pos++] = (byte) n;
		this.data[this.pos++] = (byte) (n >> 8);
		this.data[this.pos++] = (byte) (n >> 16);
		this.data[this.pos++] = (byte) (n >> 24);
	}

	@ObfuscatedName("mb.a(JZ)V")
	public void p8(long n) {
		this.data[this.pos++] = (byte) (n >> 56);
		this.data[this.pos++] = (byte) (n >> 48);
		this.data[this.pos++] = (byte) (n >> 40);
		this.data[this.pos++] = (byte) (n >> 32);
		this.data[this.pos++] = (byte) (n >> 24);
		this.data[this.pos++] = (byte) (n >> 16);
		this.data[this.pos++] = (byte) (n >> 8);
		this.data[this.pos++] = (byte) n;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void pjstr(String s) {
		s.getBytes(0, s.length(), this.data, this.pos);
		this.pos += s.length();
		this.data[this.pos++] = 10;
	}

	@ObfuscatedName("mb.a(III[B)V")
	public void pdata(int len, int off, byte[] src) {
		for (int i = off; i < len + off; i++) {
			this.data[this.pos++] = src[i];
		}
	}

	@ObfuscatedName("mb.c(II)V")
	public void psize1(int start) {
		this.data[this.pos - start - 1] = (byte) start;
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
		int n = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (n > 32767) {
			n -= 65536;
		}
		return n;
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
		long high = (long) this.g4() & 0xFFFFFFFFL;
		long low = (long) this.g4() & 0xFFFFFFFFL;
		return (high << 32) + low;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String gjstr() {
		int start = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		return new String(this.data, start, this.pos - start - 1);
	}

	@ObfuscatedName("mb.g(I)[B")
	public byte[] gjstrraw() {
		int start = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		byte[] data = new byte[this.pos - start - 1];
		for (int i = start; i < this.pos - 1; i++) {
			data[i - start] = this.data[i];
		}
		return data;
	}

	@ObfuscatedName("mb.a([BIII)V")
	public void gdata(byte[] dst, int off, int len) {
		for (int i = off; i < off + len; i++) {
			dst[i] = this.data[this.pos++];
		}
	}

	@ObfuscatedName("mb.h(I)V")
	public void bits() {
		this.bitPos = this.pos * 8;
	}

	@ObfuscatedName("mb.d(II)I")
	public int gBit(int n) {
		int bytePos = this.bitPos >> 3;
		int remainingBits = 8 - (this.bitPos & 0x7);

		int value = 0;
		this.bitPos += n;

		while (n > remainingBits) {
			value += (this.data[bytePos++] & bitmask[remainingBits]) << n - remainingBits;
			n -= remainingBits;
			remainingBits = 8;
		}

		if (n == remainingBits) {
			value += this.data[bytePos] & bitmask[remainingBits];
		} else {
			value += this.data[bytePos] >> remainingBits - n & bitmask[n];
		}

		return value;
	}

	@ObfuscatedName("mb.i(I)V")
	public void bytes() {
		this.pos = (this.bitPos + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int gsmart() {
		int n = this.data[this.pos] & 0xFF;
		return n < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int gsmarts() {
		int n = this.data[this.pos] & 0xFF;
		return n < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("mb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void rsaenc(BigInteger exp, BigInteger mod) {
		int length = this.pos;
		this.pos = 0;

		byte[] temp = new byte[length];
		this.gdata(temp, 0, length);
		BigInteger bigRaw = new BigInteger(temp);
		BigInteger bigEnc = bigRaw.modPow(exp, mod);
		byte[] rawEnc = bigEnc.toByteArray();

		this.pos = 0;
		this.p1(rawEnc.length);
		this.pdata(rawEnc.length, 0, rawEnc);
	}
}
