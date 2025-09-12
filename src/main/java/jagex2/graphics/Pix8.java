package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("kb")
public class Pix8 extends Pix2D {

	@ObfuscatedName("kb.G")
	public int owi;

	@ObfuscatedName("kb.H")
	public int ohi;

	@ObfuscatedName("kb.B")
	public int[] bpal;

	@ObfuscatedName("kb.E")
	public int xof;

	@ObfuscatedName("kb.F")
	public int yof;

	@ObfuscatedName("kb.C")
	public int wi;

	@ObfuscatedName("kb.D")
	public int hi;

	@ObfuscatedName("kb.A")
	public byte[] pixels;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		this.owi = var5.g2();
		this.ohi = var5.g2();
		int var6 = var5.g1();
		this.bpal = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.bpal[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.xof = var5.g1();
		this.yof = var5.g1();
		this.wi = var5.g2();
		this.hi = var5.g2();
		int var9 = var5.g1();
		int var10 = this.wi * this.hi;
		this.pixels = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.pixels[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.wi; var12++) {
				for (int var13 = 0; var13 < this.hi; var13++) {
					this.pixels[var12 + var13 * this.wi] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public void halveSize() {
		this.owi /= 2;
		this.ohi /= 2;
		byte[] var2 = new byte[this.owi * this.ohi];
		int var3 = 0;
		for (int var4 = 0; var4 < this.hi; var4++) {
			for (int var5 = 0; var5 < this.wi; var5++) {
				var2[(var5 + this.xof >> 1) + (var4 + this.yof >> 1) * this.owi] = this.pixels[var3++];
			}
		}
		this.pixels = var2;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("kb.a(B)V")
	public void trim() {
		if (this.wi == this.owi && this.hi == this.ohi) {
			return;
		}
		byte[] var2 = new byte[this.owi * this.ohi];
		int var3 = 0;
		for (int var4 = 0; var4 < this.hi; var4++) {
			for (int var5 = 0; var5 < this.wi; var5++) {
				var2[var5 + this.xof + (var4 + this.yof) * this.owi] = this.pixels[var3++];
			}
		}
		this.pixels = var2;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("kb.b(I)V")
	public void hflip() {
		byte[] var2 = new byte[this.wi * this.hi];
		int var3 = 0;
		for (int var4 = 0; var4 < this.hi; var4++) {
			for (int var5 = this.wi - 1; var5 >= 0; var5--) {
				var2[var3++] = this.pixels[var5 + var4 * this.wi];
			}
		}
		this.pixels = var2;
		this.xof = this.owi - this.wi - this.xof;
	}

	@ObfuscatedName("kb.c(I)V")
	public void vflip() {
		byte[] var2 = new byte[this.wi * this.hi];
		int var3 = 0;
		for (int var4 = this.hi - 1; var4 >= 0; var4--) {
			for (int var5 = 0; var5 < this.wi; var5++) {
				var2[var3++] = this.pixels[var5 + var4 * this.wi];
			}
		}
		this.pixels = var2;
		this.yof = this.ohi - this.hi - this.yof;
	}

	@ObfuscatedName("kb.a(IZII)V")
	public void rgbAdjust(int arg0, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.bpal.length; var5++) {
			int var6 = this.bpal[var5] >> 16 & 0xFF;
			int var7 = var6 + arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			int var8 = this.bpal[var5] >> 8 & 0xFF;
			int var9 = var8 + arg2;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 255) {
				var9 = 255;
			}
			int var10 = this.bpal[var5] & 0xFF;
			int var11 = var10 + arg3;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			this.bpal[var5] = (var7 << 16) + (var9 << 8) + var11;
		}
	}

	@ObfuscatedName("kb.a(III)V")
	public void plotSprite(int arg0, int arg2) {
		int var4 = arg0 + this.xof;
		int var5 = arg2 + this.yof;
		int var6 = var4 + var5 * Pix2D.width2d;
		int var7 = 0;
		int var9 = this.hi;
		int var10 = this.wi;
		int var11 = Pix2D.width2d - var10;
		int var12 = 0;
		if (var5 < Pix2D.top) {
			int var13 = Pix2D.top - var5;
			var9 -= var13;
			var5 = Pix2D.top;
			var7 += var13 * var10;
			var6 += var13 * Pix2D.width2d;
		}
		if (var5 + var9 > Pix2D.bottom) {
			var9 -= var5 + var9 - Pix2D.bottom;
		}
		if (var4 < Pix2D.left) {
			int var14 = Pix2D.left - var4;
			var10 -= var14;
			var4 = Pix2D.left;
			var7 += var14;
			var6 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var4 + var10 > Pix2D.right) {
			int var15 = var4 + var10 - Pix2D.right;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.plot(this.bpal, var9, this.pixels, Pix2D.data, var12, var6, var7, var10, var11);
		}
	}

	@ObfuscatedName("kb.a([II[B[IIIIIII)V")
	public void plot(int[] arg0, int arg1, byte[] arg2, int[] arg3, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg8 >> 2);
		int var12 = -(arg8 & 0x3);
		for (int var13 = -arg1; var13 < 0; var13++) {
			for (int var14 = var11; var14 < 0; var14++) {
				byte var15 = arg2[arg7++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var15 & 0xFF];
				}
				byte var16 = arg2[arg7++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var16 & 0xFF];
				}
				byte var17 = arg2[arg7++];
				if (var17 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var17 & 0xFF];
				}
				byte var18 = arg2[arg7++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var18 & 0xFF];
				}
			}
			for (int var19 = var12; var19 < 0; var19++) {
				byte var20 = arg2[arg7++];
				if (var20 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var20 & 0xFF];
				}
			}
			arg6 += arg9;
			arg7 += arg5;
		}
	}
}
