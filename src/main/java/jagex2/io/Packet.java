package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.Linkable;

import java.math.BigInteger;

@ObfuscatedName("mb")
public class Packet extends DoublyLinkable {

	@ObfuscatedName("mb.i")
	public static byte field698 = 73;

	@ObfuscatedName("mb.j")
	public int field699;

	@ObfuscatedName("mb.k")
	public int field700 = -742;

	@ObfuscatedName("mb.l")
	public int field701 = -13;

	@ObfuscatedName("mb.m")
	public byte field702 = 78;

	@ObfuscatedName("mb.n")
	public int field703 = -106;

	@ObfuscatedName("mb.o")
	public boolean field704 = false;

	@ObfuscatedName("mb.p")
	public int field705 = 430;

	@ObfuscatedName("mb.q")
	public int field706 = 2;

	@ObfuscatedName("mb.r")
	public boolean field707 = false;

	@ObfuscatedName("mb.s")
	public boolean field708 = false;

	@ObfuscatedName("mb.t")
	public int field709 = 977;

	@ObfuscatedName("mb.u")
	public byte[] field710;

	@ObfuscatedName("mb.v")
	public int field711;

	@ObfuscatedName("mb.w")
	public int field712;

	@ObfuscatedName("mb.x")
	public static int[] field713 = new int[256];

	@ObfuscatedName("mb.y")
	public static final int[] field714;

	@ObfuscatedName("mb.z")
	public Isaac field715;

	@ObfuscatedName("mb.G")
	public char[] field722 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("mb.D")
	public static LinkList field719;

	@ObfuscatedName("mb.E")
	public static LinkList field720;

	@ObfuscatedName("mb.F")
	public static LinkList field721;

	@ObfuscatedName("mb.A")
	public static int field716;

	@ObfuscatedName("mb.B")
	public static int field717;

	@ObfuscatedName("mb.C")
	public static int field718;

	@ObfuscatedName("mb.H")
	public static int field723;

	@ObfuscatedName("mb.a(IB)Lmb;")
	public static Packet method226(int arg0, byte arg1) {
		LinkList var2 = field720;
		synchronized (field720) {
			Packet var3 = null;
			if (arg0 == 0 && field716 > 0) {
				field716--;
				var3 = (Packet) field719.method257();
			} else if (arg0 == 1 && field717 > 0) {
				field717--;
				var3 = (Packet) field720.method257();
			} else if (arg0 == 2 && field718 > 0) {
				field718--;
				var3 = (Packet) field721.method257();
			}
			if (var3 != null) {
				var3.field711 = 0;
				return var3;
			}
		}
		Packet var5 = new Packet(0);
		var5.field711 = 0;
		if (arg1 != field698) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		if (arg0 == 0) {
			var5.field710 = new byte[100];
		} else if (arg0 == 1) {
			var5.field710 = new byte[5000];
		} else {
			var5.field710 = new byte[30000];
		}
		return var5;
	}

	@ObfuscatedName("mb.a(I)V")
	public void method227(int arg0) {
		LinkList var2 = field720;
		synchronized (field720) {
			this.field711 = 0;
			if (this.field710.length == 100 && field716 < 1000) {
				field719.method255(this);
				field716++;
				return;
			}
			if (this.field710.length == 5000 && field717 < 250) {
				field720.method255(this);
				field717++;
				return;
			}
			if (this.field710.length == 30000 && field718 < 50) {
				field721.method255(this);
				field718++;
				return;
			}
		}
		if (arg0 >= 0) {
			;
		}
	}

	public Packet(int arg0) {
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	public Packet(byte[] arg0, byte arg1) {
		if (arg1 != 3) {
			throw new NullPointerException();
		}
		boolean var3 = false;
		this.field710 = arg0;
		this.field711 = 0;
	}

	@ObfuscatedName("mb.a(II)V")
	public void method228(int arg0, int arg1) {
		if (arg0 < 4 || arg0 > 4) {
			this.field709 = 309;
		}
		this.field710[this.field711++] = (byte) (arg1 + this.field715.method305());
	}

	@ObfuscatedName("mb.b(I)V")
	public void method229(int arg0) {
		this.field710[this.field711++] = (byte) arg0;
	}

	@ObfuscatedName("mb.c(I)V")
	public void method230(int arg0) {
		this.field710[this.field711++] = (byte) (arg0 >> 8);
		this.field710[this.field711++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void method231(int arg0, int arg1) {
		this.field710[this.field711++] = (byte) arg0;
		if (arg1 != 1) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.field710[this.field711++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("mb.d(I)V")
	public void method232(int arg0) {
		this.field710[this.field711++] = (byte) (arg0 >> 16);
		this.field710[this.field711++] = (byte) (arg0 >> 8);
		this.field710[this.field711++] = (byte) arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void method233(int arg0) {
		this.field710[this.field711++] = (byte) (arg0 >> 24);
		this.field710[this.field711++] = (byte) (arg0 >> 16);
		this.field710[this.field711++] = (byte) (arg0 >> 8);
		this.field710[this.field711++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(IB)V")
	public void method234(int arg0, byte arg1) {
		this.field710[this.field711++] = (byte) arg0;
		this.field710[this.field711++] = (byte) (arg0 >> 8);
		this.field710[this.field711++] = (byte) (arg0 >> 16);
		if (arg1 == 116) {
			this.field710[this.field711++] = (byte) (arg0 >> 24);
		}
	}

	@ObfuscatedName("mb.a(IJ)V")
	public void method235(int arg0, long arg1) {
		this.field710[this.field711++] = (byte) (arg1 >> 56);
		this.field710[this.field711++] = (byte) (arg1 >> 48);
		this.field710[this.field711++] = (byte) (arg1 >> 40);
		this.field710[this.field711++] = (byte) (arg1 >> 32);
		this.field710[this.field711++] = (byte) (arg1 >> 24);
		this.field710[this.field711++] = (byte) (arg1 >> 16);
		if (arg0 > 0) {
			this.field710[this.field711++] = (byte) (arg1 >> 8);
			this.field710[this.field711++] = (byte) arg1;
			if (Linkable.field377) {
			}
		}
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void method236(String arg0) {
		arg0.getBytes(0, arg0.length(), this.field710, this.field711);
		this.field711 += arg0.length();
		this.field710[this.field711++] = 10;
	}

	@ObfuscatedName("mb.a(I[BIZ)V")
	public void method237(int arg0, byte[] arg1, int arg2, boolean arg3) {
		if (arg3) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
			this.field710[this.field711++] = arg1[var6];
		}
	}

	@ObfuscatedName("mb.a(IZ)V")
	public void method238(int arg0, boolean arg1) {
		if (!arg1) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.field710[this.field711 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("mb.c()I")
	public int method239() {
		return this.field710[this.field711++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte method240() {
		return this.field710[this.field711++];
	}

	@ObfuscatedName("mb.e()I")
	public int method241() {
		this.field711 += 2;
		return ((this.field710[this.field711 - 2] & 0xFF) << 8) + (this.field710[this.field711 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int method242() {
		this.field711 += 2;
		int var1 = ((this.field710[this.field711 - 2] & 0xFF) << 8) + (this.field710[this.field711 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int method243() {
		this.field711 += 3;
		return ((this.field710[this.field711 - 3] & 0xFF) << 16) + ((this.field710[this.field711 - 2] & 0xFF) << 8) + (this.field710[this.field711 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.h()I")
	public int method244() {
		this.field711 += 4;
		return ((this.field710[this.field711 - 4] & 0xFF) << 24) + ((this.field710[this.field711 - 3] & 0xFF) << 16) + ((this.field710[this.field711 - 2] & 0xFF) << 8) + (this.field710[this.field711 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f(I)J")
	public long method245(int arg0) {
		long var2 = (long) this.method244() & 0xFFFFFFFFL;
		if (arg0 != 0) {
			this.field708 = !this.field708;
		}
		long var4 = (long) this.method244() & 0xFFFFFFFFL;
		return (var2 << 32) + var4;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String method246() {
		int var1 = this.field711;
		while (this.field710[this.field711++] != 10) {
		}
		return new String(this.field710, var1, this.field711 - var1 - 1);
	}

	@ObfuscatedName("mb.a(B)[B")
	public byte[] method247(byte arg0) {
		int var2 = this.field711;
		if (arg0 != 3) {
			throw new NullPointerException();
		}
		while (this.field710[this.field711++] != 10) {
		}
		byte[] var3 = new byte[this.field711 - var2 - 1];
		for (int var4 = var2; var4 < this.field711 - 1; var4++) {
			var3[var4 - var2] = this.field710[var4];
		}
		return var3;
	}

	@ObfuscatedName("mb.a(II[BI)V")
	public void method248(int arg0, int arg1, byte[] arg2, int arg3) {
		if (arg1 < 0) {
			for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
				arg2[var5] = this.field710[this.field711++];
			}
		}
	}

	@ObfuscatedName("mb.g(I)V")
	public void method249(int arg0) {
		this.field712 = this.field711 * 8;
		if (arg0 == 0) {
			;
		}
	}

	@ObfuscatedName("mb.c(II)I")
	public int method250(int arg0, int arg1) {
		if (arg0 >= 0) {
			this.field699 = -221;
		}
		int var3 = this.field712 >> 3;
		int var4 = 8 - (this.field712 & 0x7);
		int var5 = 0;
		this.field712 += arg1;
		while (arg1 > var4) {
			var5 += (this.field710[var3++] & field714[var4]) << arg1 - var4;
			arg1 -= var4;
			var4 = 8;
		}
		int var6;
		if (arg1 == var4) {
			var6 = var5 + (this.field710[var3] & field714[var4]);
		} else {
			var6 = var5 + (this.field710[var3] >> var4 - arg1 & field714[arg1]);
		}
		return var6;
	}

	@ObfuscatedName("mb.h(I)V")
	public void method251(int arg0) {
		if (arg0 <= 0) {
			this.field699 = -31;
		}
		this.field711 = (this.field712 + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int method252() {
		int var1 = this.field710[this.field711] & 0xFF;
		return var1 < 128 ? this.method239() - 64 : this.method241() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int method253() {
		int var1 = this.field710[this.field711] & 0xFF;
		return var1 < 128 ? this.method239() : this.method241() - 32768;
	}

	@ObfuscatedName("mb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method254(int arg0, BigInteger arg1, BigInteger arg2) {
		int var4 = this.field711;
		this.field711 = 0;
		byte[] var5 = new byte[var4];
		if (arg0 >= 0) {
			return;
		}
		this.method248(0, this.field701, var5, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(arg1, arg2);
		byte[] var8 = var7.toByteArray();
		this.field711 = 0;
		this.method229(var8.length);
		this.method237(0, var8, var8.length, false);
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
			field713[var0] = var1;
		}
		field714 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		field719 = new LinkList(false);
		field720 = new LinkList(false);
		field721 = new LinkList(false);
	}
}
