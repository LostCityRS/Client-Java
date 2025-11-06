package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("dc")
public class Tone {

	@ObfuscatedName("dc.c")
	public Envelope field902;

	@ObfuscatedName("dc.d")
	public Envelope field903;

	@ObfuscatedName("dc.e")
	public Envelope field904;

	@ObfuscatedName("dc.f")
	public Envelope field905;

	@ObfuscatedName("dc.g")
	public Envelope field906;

	@ObfuscatedName("dc.h")
	public Envelope field907;

	@ObfuscatedName("dc.i")
	public Envelope field908;

	@ObfuscatedName("dc.j")
	public Envelope field909;

	@ObfuscatedName("dc.k")
	public int[] field910 = new int[5];

	@ObfuscatedName("dc.l")
	public int[] field911 = new int[5];

	@ObfuscatedName("dc.m")
	public int[] field912 = new int[5];

	@ObfuscatedName("dc.n")
	public int field913;

	@ObfuscatedName("dc.o")
	public int field914 = 100;

	@ObfuscatedName("dc.p")
	public int field915 = 500;

	@ObfuscatedName("dc.q")
	public int field916;

	@ObfuscatedName("dc.r")
	public static int[] field917;

	@ObfuscatedName("dc.s")
	public static int[] field918;

	@ObfuscatedName("dc.t")
	public static int[] field919;

	@ObfuscatedName("dc.u")
	public static int[] field920 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field921 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field922 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field923 = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] field924 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method328() {
		field918 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field918[var0] = 1;
			} else {
				field918[var0] = -1;
			}
		}
		field919 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field919[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		field917 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method329(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field917[var3] = 0;
		}
		if (arg1 < 10) {
			return field917;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field902.method320();
		this.field903.method320();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.field904 != null) {
			this.field904.method320();
			this.field905.method320();
			var6 = (int) ((double) (this.field904.field885 - this.field904.field884) * 32.768D / var4);
			var7 = (int) ((double) this.field904.field884 * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.field906 != null) {
			this.field906.method320();
			this.field907.method320();
			var9 = (int) ((double) (this.field906.field885 - this.field906.field884) * 32.768D / var4);
			var10 = (int) ((double) this.field906.field884 * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.field910[var12] != 0) {
				field920[var12] = 0;
				field921[var12] = (int) ((double) this.field912[var12] * var4);
				field922[var12] = (this.field910[var12] << 14) / 100;
				field923[var12] = (int) ((double) (this.field902.field885 - this.field902.field884) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field911[var12]) / var4);
				field924[var12] = (int) ((double) this.field902.field884 * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.field902.method321(arg0);
			int var15 = this.field903.method321(arg0);
			if (this.field904 != null) {
				int var16 = this.field904.method321(arg0);
				int var17 = this.field905.method321(arg0);
				var14 += this.method330(this.field904.field886, var17, var8) >> 1;
				var8 += (var16 * var6 >> 16) + var7;
			}
			if (this.field906 != null) {
				int var18 = this.field906.method321(arg0);
				int var19 = this.field907.method321(arg0);
				var15 = var15 * ((this.method330(this.field906.field886, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var18 * var9 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field910[var20] != 0) {
					int var21 = var13 + field921[var20];
					if (var21 < arg0) {
						field917[var21] += this.method330(this.field902.field886, var15 * field922[var20] >> 15, field920[var20]);
						field920[var20] += (var14 * field923[var20] >> 16) + field924[var20];
					}
				}
			}
		}
		if (this.field908 != null) {
			this.field908.method320();
			this.field909.method320();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = this.field908.method321(arg0);
				int var27 = this.field909.method321(arg0);
				int var28;
				if (var24) {
					var28 = this.field908.field884 + ((this.field908.field885 - this.field908.field884) * var26 >> 8);
				} else {
					var28 = this.field908.field884 + ((this.field908.field885 - this.field908.field884) * var27 >> 8);
				}
				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}
				if (var24) {
					field917[var25] = 0;
				}
			}
		}
		if (this.field913 > 0 && this.field914 > 0) {
			int var29 = (int) ((double) this.field913 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field917[var30] += field917[var30 - var29] * this.field914 / 100;
			}
		}
		for (int var31 = 0; var31 < arg0; var31++) {
			if (field917[var31] < -32768) {
				field917[var31] = -32768;
			}
			if (field917[var31] > 32767) {
				field917[var31] = 32767;
			}
		}
		return field917;
	}

	@ObfuscatedName("dc.a(IBII)I")
	public final int method330(int arg0, int arg2, int arg3) {
		if (arg0 == 1) {
			return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
		} else if (arg0 == 2) {
			return field919[arg3 & 0x7FFF] * arg2 >> 14;
		} else if (arg0 == 3) {
			return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
		} else if (arg0 == 4) {
			return field918[arg3 / 2607 & 0x7FFF] * arg2;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("dc.a(ILmb;)V")
	public final void method331(Packet arg1) {
		this.field902 = new Envelope();
		this.field902.method319(arg1);
		this.field903 = new Envelope();
		this.field903.method319(arg1);
		int var3 = arg1.method239();
		if (var3 != 0) {
			arg1.field711--;
			this.field904 = new Envelope();
			this.field904.method319(arg1);
			this.field905 = new Envelope();
			this.field905.method319(arg1);
		}
		int var4 = arg1.method239();
		if (var4 != 0) {
			arg1.field711--;
			this.field906 = new Envelope();
			this.field906.method319(arg1);
			this.field907 = new Envelope();
			this.field907.method319(arg1);
		}
		int var5 = arg1.method239();
		if (var5 != 0) {
			arg1.field711--;
			this.field908 = new Envelope();
			this.field908.method319(arg1);
			this.field909 = new Envelope();
			this.field909.method319(arg1);
		}
		for (int var6 = 0; var6 < 10; var6++) {
			int var7 = arg1.method253();
			if (var7 == 0) {
				break;
			}
			this.field910[var6] = var7;
			this.field911[var6] = arg1.method252();
			this.field912[var6] = arg1.method253();
		}
		this.field913 = arg1.method253();
		this.field914 = arg1.method253();
		this.field915 = arg1.method241();
		this.field916 = arg1.method241();
	}
}
