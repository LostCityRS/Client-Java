package deob;

import java.math.BigInteger;

@ObfuscatedName("mb")
public class Packet extends DoublyLinkable {

	@ObfuscatedName("mb.i")
	public boolean field708 = true;

	@ObfuscatedName("mb.j")
	public int field709 = 7290;

	@ObfuscatedName("mb.k")
	public int field710 = -637;

	@ObfuscatedName("mb.l")
	public int field711 = -1948;

	@ObfuscatedName("mb.m")
	public int field712 = -7326;

	@ObfuscatedName("mb.n")
	public byte field713 = -49;

	@ObfuscatedName("mb.o")
	public boolean field714 = false;

	@ObfuscatedName("mb.p")
	public byte field715 = 76;

	@ObfuscatedName("mb.q")
	public int field716 = 25800;

	@ObfuscatedName("mb.r")
	public boolean field717 = false;

	@ObfuscatedName("mb.s")
	public byte[] field718;

	@ObfuscatedName("mb.t")
	public int field719;

	@ObfuscatedName("mb.u")
	public int field720;

	@ObfuscatedName("mb.v")
	public static int[] field721 = new int[256];

	@ObfuscatedName("mb.w")
	public static final int[] field722;

	@ObfuscatedName("mb.x")
	public Isaac field723;

	@ObfuscatedName("mb.y")
	public static int field724;

	@ObfuscatedName("mb.z")
	public static int field725;

	@ObfuscatedName("mb.B")
	public static LinkList field727;

	@ObfuscatedName("mb.C")
	public static LinkList field728;

	@ObfuscatedName("mb.D")
	public static LinkList field729;

	@ObfuscatedName("mb.A")
	public static int field726;

	@ObfuscatedName("mb.E")
	public static boolean field730;

	@ObfuscatedName("mb.a(II)Lmb;")
	public static Packet method225(int arg0, int arg1) {
		LinkList var2 = field728;
		synchronized (field728) {
			Packet var3 = null;
			if (arg1 == 0 && field724 > 0) {
				field724--;
				var3 = (Packet) field727.method256();
			} else if (arg1 == 1 && field725 > 0) {
				field725--;
				var3 = (Packet) field728.method256();
			} else if (arg1 == 2 && field726 > 0) {
				field726--;
				var3 = (Packet) field729.method256();
			}
			if (var3 != null) {
				var3.field719 = 0;
				Packet var4 = var3;
				return var4;
			}
		}
		if (arg0 != 5) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		Packet var7 = new Packet(false);
		var7.field719 = 0;
		if (arg1 == 0) {
			var7.field718 = new byte[100];
		} else if (arg1 == 1) {
			var7.field718 = new byte[5000];
		} else {
			var7.field718 = new byte[30000];
		}
		return var7;
	}

	@ObfuscatedName("mb.a(I)V")
	public void method226(int arg0) {
		if (this.field709 != arg0) {
			this.field716 = -414;
		}
		LinkList var2 = field728;
		synchronized (field728) {
			this.field719 = 0;
			if (this.field718.length == 100 && field724 < 1000) {
				field727.method254(this);
				field724++;
				return;
			}
			if (this.field718.length != 5000 || field725 >= 250) {
				if (this.field718.length == 30000 && field726 < 50) {
					field729.method254(this);
					field726++;
					return;
				}
				return;
			}
			field728.method254(this);
			field725++;
		}
	}

	public Packet(boolean arg0) {
		if (arg0) {
			this.field708 = !this.field708;
		}
	}

	public Packet(byte arg0, byte[] arg1) {
		this.field718 = arg1;
		if (arg0 != -109) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.field719 = 0;
	}

	@ObfuscatedName("mb.a(IB)V")
	public void method227(int arg0, byte arg1) {
		this.field718[this.field719++] = (byte) (arg0 + this.field723.method304());
		if (arg1 != 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("mb.b(I)V")
	public void method228(int arg0) {
		this.field718[this.field719++] = (byte) arg0;
	}

	@ObfuscatedName("mb.c(I)V")
	public void method229(int arg0) {
		this.field718[this.field719++] = (byte) (arg0 >> 8);
		this.field718[this.field719++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(IZ)V")
	public void method230(int arg0, boolean arg1) {
		if (arg1) {
			this.field718[this.field719++] = (byte) arg0;
			this.field718[this.field719++] = (byte) (arg0 >> 8);
		}
	}

	@ObfuscatedName("mb.d(I)V")
	public void method231(int arg0) {
		this.field718[this.field719++] = (byte) (arg0 >> 16);
		this.field718[this.field719++] = (byte) (arg0 >> 8);
		this.field718[this.field719++] = (byte) arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void method232(int arg0) {
		this.field718[this.field719++] = (byte) (arg0 >> 24);
		this.field718[this.field719++] = (byte) (arg0 >> 16);
		this.field718[this.field719++] = (byte) (arg0 >> 8);
		this.field718[this.field719++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void method233(int arg0, int arg1) {
		this.field718[this.field719++] = (byte) arg1;
		int var3 = 86 / arg0;
		this.field718[this.field719++] = (byte) (arg1 >> 8);
		this.field718[this.field719++] = (byte) (arg1 >> 16);
		this.field718[this.field719++] = (byte) (arg1 >> 24);
	}

	@ObfuscatedName("mb.a(JZ)V")
	public void method234(long arg0, boolean arg1) {
		this.field718[this.field719++] = (byte) (arg0 >> 56);
		this.field718[this.field719++] = (byte) (arg0 >> 48);
		if (arg1) {
			return;
		}
		this.field718[this.field719++] = (byte) (arg0 >> 40);
		this.field718[this.field719++] = (byte) (arg0 >> 32);
		this.field718[this.field719++] = (byte) (arg0 >> 24);
		this.field718[this.field719++] = (byte) (arg0 >> 16);
		this.field718[this.field719++] = (byte) (arg0 >> 8);
		this.field718[this.field719++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void method235(String arg0) {
		arg0.getBytes(0, arg0.length(), this.field718, this.field719);
		this.field719 += arg0.length();
		this.field718[this.field719++] = 10;
	}

	@ObfuscatedName("mb.a(III[B)V")
	public void method236(int arg0, int arg1, int arg2, byte[] arg3) {
		if (arg1 != 0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
			this.field718[this.field719++] = arg3[var6];
		}
	}

	@ObfuscatedName("mb.c(II)V")
	public void method237(int arg0, int arg1) {
		this.field718[this.field719 - arg1 - 1] = (byte) arg1;
		if (arg0 == 41372) {
			;
		}
	}

	@ObfuscatedName("mb.c()I")
	public int method238() {
		return this.field718[this.field719++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte method239() {
		return this.field718[this.field719++];
	}

	@ObfuscatedName("mb.e()I")
	public int method240() {
		this.field719 += 2;
		return ((this.field718[this.field719 - 2] & 0xFF) << 8) + (this.field718[this.field719 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int method241() {
		this.field719 += 2;
		int var1 = ((this.field718[this.field719 - 2] & 0xFF) << 8) + (this.field718[this.field719 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int method242() {
		this.field719 += 3;
		return (this.field718[this.field719 - 1] & 0xFF) + ((this.field718[this.field719 - 3] & 0xFF) << 16) + ((this.field718[this.field719 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("mb.h()I")
	public int method243() {
		this.field719 += 4;
		return (this.field718[this.field719 - 1] & 0xFF) + ((this.field718[this.field719 - 2] & 0xFF) << 8) + ((this.field718[this.field719 - 4] & 0xFF) << 24) + ((this.field718[this.field719 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mb.f(I)J")
	public long method244(int arg0) {
		long var2 = (long) this.method243() & 0xFFFFFFFFL;
		long var4 = (long) this.method243() & 0xFFFFFFFFL;
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		return (var2 << 32) + var4;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String method245() {
		int var1 = this.field719;
		while (this.field718[this.field719++] != 10) {
		}
		return new String(this.field718, var1, this.field719 - var1 - 1);
	}

	@ObfuscatedName("mb.g(I)[B")
	public byte[] method246(int arg0) {
		int var2 = this.field719;
		if (arg0 != 1) {
			this.field708 = !this.field708;
		}
		while (this.field718[this.field719++] != 10) {
		}
		byte[] var3 = new byte[this.field719 - var2 - 1];
		for (int var4 = var2; var4 < this.field719 - 1; var4++) {
			var3[var4 - var2] = this.field718[var4];
		}
		return var3;
	}

	@ObfuscatedName("mb.a([BIII)V")
	public void method247(byte[] arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= 0) {
			this.field710 = -182;
		}
		for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
			arg0[var5] = this.field718[this.field719++];
		}
	}

	@ObfuscatedName("mb.h(I)V")
	public void method248(int arg0) {
		if (arg0 != 30730) {
			this.field716 = 99;
		}
		this.field720 = this.field719 * 8;
	}

	@ObfuscatedName("mb.d(II)I")
	public int method249(int arg0, int arg1) {
		if (arg0 != 9) {
			this.field717 = !this.field717;
		}
		int var3 = this.field720 >> 3;
		int var4 = 8 - (this.field720 & 0x7);
		int var5 = 0;
		this.field720 += arg1;
		while (arg1 > var4) {
			var5 += (this.field718[var3++] & field722[var4]) << arg1 - var4;
			arg1 -= var4;
			var4 = 8;
		}
		int var6;
		if (arg1 == var4) {
			var6 = (this.field718[var3] & field722[var4]) + var5;
		} else {
			var6 = (this.field718[var3] >> var4 - arg1 & field722[arg1]) + var5;
		}
		return var6;
	}

	@ObfuscatedName("mb.i(I)V")
	public void method250(int arg0) {
		this.field719 = (this.field720 + 7) / 8;
		if (arg0 < 0 || arg0 > 0) {
			this.field711 = -30;
		}
	}

	@ObfuscatedName("mb.j()I")
	public int method251() {
		int var1 = this.field718[this.field719] & 0xFF;
		return var1 < 128 ? this.method238() - 64 : this.method240() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int method252() {
		int var1 = this.field718[this.field719] & 0xFF;
		return var1 < 128 ? this.method238() : this.method240() - 32768;
	}

	@ObfuscatedName("mb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method253(int arg0, BigInteger arg1, BigInteger arg2) {
		int var4 = this.field719;
		this.field719 = 0;
		byte[] var5 = new byte[var4];
		this.method247(var5, 0, 188, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(arg1, arg2);
		byte[] var8 = var7.toByteArray();
		if (arg0 == 41466) {
			this.field719 = 0;
			this.method228(var8.length);
			this.method236(var8.length, 0, 0, var8);
		}
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
			field721[var0] = var1;
		}
		field722 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		field727 = new LinkList((byte) 7);
		field728 = new LinkList((byte) 7);
		field729 = new LinkList((byte) 7);
	}
}
