package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.io.Jagfile;

@ObfuscatedName("kb")
public class Pix8 extends Pix2D {

	@ObfuscatedName("kb.A")
	public int field677 = 2;

	@ObfuscatedName("kb.B")
	public byte field678 = 9;

	@ObfuscatedName("kb.C")
	public boolean field679 = false;

	@ObfuscatedName("kb.D")
	public int field680 = 35546;

	@ObfuscatedName("kb.E")
	public boolean field681 = true;

	@ObfuscatedName("kb.F")
	public boolean field682 = true;

	@ObfuscatedName("kb.M")
	public int field689;

	@ObfuscatedName("kb.N")
	public int field690;

	@ObfuscatedName("kb.H")
	public int[] field684;

	@ObfuscatedName("kb.K")
	public int field687;

	@ObfuscatedName("kb.L")
	public int field688;

	@ObfuscatedName("kb.I")
	public int field685;

	@ObfuscatedName("kb.J")
	public int field686;

	@ObfuscatedName("kb.G")
	public byte[] field683;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet((byte) -109, arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet((byte) -109, arg0.read("index.dat", null));
		var5.pos = var4.g2();
		this.field689 = var5.g2();
		this.field690 = var5.g2();
		int var6 = var5.g1();
		this.field684 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.field684[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.field687 = var5.g1();
		this.field688 = var5.g1();
		this.field685 = var5.g2();
		this.field686 = var5.g2();
		int var9 = var5.g1();
		int var10 = this.field686 * this.field685;
		this.field683 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.field683[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.field685; var12++) {
				for (int var13 = 0; var13 < this.field686; var13++) {
					this.field683[this.field685 * var13 + var12] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public void method206(int arg0) {
		this.field689 /= 2;
		this.field690 /= 2;
		byte[] var2 = new byte[this.field690 * this.field689];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field686; var4++) {
			for (int var5 = 0; var5 < this.field685; var5++) {
				var2[(this.field687 + var5 >> 1) + (this.field688 + var4 >> 1) * this.field689] = this.field683[var3++];
			}
		}
		this.field683 = var2;
		this.field685 = this.field689;
		if (arg0 != 3206) {
			this.field681 = !this.field681;
		}
		this.field686 = this.field690;
		this.field687 = 0;
		this.field688 = 0;
	}

	@ObfuscatedName("kb.b(Z)V")
	public void method207(boolean arg0) {
		if (this.field689 == this.field685 && this.field690 == this.field686) {
			return;
		}
		byte[] var2 = new byte[this.field690 * this.field689];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field686; var4++) {
			for (int var6 = 0; var6 < this.field685; var6++) {
				var2[(this.field688 + var4) * this.field689 + this.field687 + var6] = this.field683[var3++];
			}
		}
		if (arg0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		this.field683 = var2;
		this.field685 = this.field689;
		this.field686 = this.field690;
		this.field687 = 0;
		this.field688 = 0;
	}

	@ObfuscatedName("kb.b(I)V")
	public void method208(int arg0) {
		byte[] var2 = new byte[this.field686 * this.field685];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field686; var4++) {
			for (int var5 = this.field685 - 1; var5 >= 0; var5--) {
				var2[var3++] = this.field683[this.field685 * var4 + var5];
			}
		}
		if (arg0 >= 4 && arg0 <= 4) {
			this.field683 = var2;
			this.field687 = this.field689 - this.field685 - this.field687;
		}
	}

	@ObfuscatedName("kb.c(I)V")
	public void method209(int arg0) {
		byte[] var2 = new byte[this.field686 * this.field685];
		if (this.field680 != arg0) {
			this.field677 = 314;
		}
		int var3 = 0;
		for (int var4 = this.field686 - 1; var4 >= 0; var4--) {
			for (int var5 = 0; var5 < this.field685; var5++) {
				var2[var3++] = this.field683[this.field685 * var4 + var5];
			}
		}
		this.field683 = var2;
		this.field688 = this.field690 - this.field686 - this.field688;
	}

	@ObfuscatedName("kb.a(IIII)V")
	public void method210(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field684.length; var5++) {
			int var6 = this.field684[var5] >> 16 & 0xFF;
			int var7 = arg0 + var6;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			int var8 = this.field684[var5] >> 8 & 0xFF;
			int var9 = arg3 + var8;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 255) {
				var9 = 255;
			}
			int var10 = this.field684[var5] & 0xFF;
			int var11 = arg1 + var10;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			this.field684[var5] = (var7 << 16) + (var9 << 8) + var11;
		}
		if (arg2 == 8) {
			;
		}
	}

	@ObfuscatedName("kb.a(BII)V")
	public void method211(byte arg0, int arg1, int arg2) {
		int var4 = this.field687 + arg1;
		int var5 = this.field688 + arg2;
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		int var8 = this.field686;
		int var9 = this.field685;
		int var10 = Pix2D.width2d - var9;
		int var11 = 0;
		if (var5 < Pix2D.top) {
			int var12 = Pix2D.top - var5;
			var8 -= var12;
			var5 = Pix2D.top;
			var7 += var9 * var12;
			var6 += Pix2D.width2d * var12;
		}
		if (var5 + var8 > Pix2D.bottom) {
			var8 -= var5 + var8 - Pix2D.bottom;
		}
		if (var4 < Pix2D.left) {
			int var13 = Pix2D.left - var4;
			var9 -= var13;
			var4 = Pix2D.left;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.right) {
			int var14 = var4 + var9 - Pix2D.right;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method212(-228, var11, var8, var10, Pix2D.data, var6, this.field683, this.field684, var9, var7);
			if (this.field678 == arg0) {
				boolean var15 = false;
			}
		}
	}

	@ObfuscatedName("kb.a(IIII[II[B[III)V")
	public void method212(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg8 >> 2);
		while (arg0 >= 0) {
			this.field682 = !this.field682;
		}
		int var12 = -(arg8 & 0x3);
		for (int var13 = -arg2; var13 < 0; var13++) {
			for (int var14 = var11; var14 < 0; var14++) {
				byte var17 = arg6[arg9++];
				if (var17 == 0) {
					arg5++;
				} else {
					arg4[arg5++] = arg7[var17 & 0xFF];
				}
				byte var18 = arg6[arg9++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg4[arg5++] = arg7[var18 & 0xFF];
				}
				byte var19 = arg6[arg9++];
				if (var19 == 0) {
					arg5++;
				} else {
					arg4[arg5++] = arg7[var19 & 0xFF];
				}
				byte var20 = arg6[arg9++];
				if (var20 == 0) {
					arg5++;
				} else {
					arg4[arg5++] = arg7[var20 & 0xFF];
				}
			}
			for (int var15 = var12; var15 < 0; var15++) {
				byte var16 = arg6[arg9++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg4[arg5++] = arg7[var16 & 0xFF];
				}
			}
			arg5 += arg3;
			arg9 += arg1;
		}
	}
}
