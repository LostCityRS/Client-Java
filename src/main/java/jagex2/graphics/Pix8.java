package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.io.Jagfile;

@ObfuscatedName("kb")
public class Pix8 extends Pix2D {

	// these short field names are authentic to native

	@ObfuscatedName("kb.M")
	public int owi; // original width

	@ObfuscatedName("kb.N")
	public int ohi; // original height

	@ObfuscatedName("kb.H")
	public int[] bpal; // base palette

	@ObfuscatedName("kb.K")
	public int xof; // x offset

	@ObfuscatedName("kb.L")
	public int yof; // y offset

	@ObfuscatedName("kb.I")
	public int wi; // width

	@ObfuscatedName("kb.J")
	public int hi; // height

	@ObfuscatedName("kb.G")
	public byte[] pixels;

	public Pix8(Jagfile jag, String name, int sprite) {
		Packet dat = new Packet(jag.read(name + ".dat", null));
		Packet idx = new Packet(jag.read("index.dat", null));

		idx.pos = dat.g2();
		this.owi = idx.g2();
		this.ohi = idx.g2();

		int palCount = idx.g1();
		this.bpal = new int[palCount];
		for (int i = 0; i < palCount - 1; i++) {
			this.bpal[i + 1] = idx.g3();
		}

		for (int i = 0; i < sprite; i++) {
			idx.pos += 2;
			dat.pos += idx.g2() * idx.g2();
			idx.pos++;
		}

		this.xof = idx.g1();
		this.yof = idx.g1();
		this.wi = idx.g2();
		this.hi = idx.g2();
		int pixelOrder = idx.g1();

		int len = this.hi * this.wi;
		this.pixels = new byte[len];

		if (pixelOrder == 0) {
			for (int i = 0; i < len; i++) {
				this.pixels[i] = dat.g1b();
			}
		} else if (pixelOrder == 1) {
			for (int x = 0; x < this.wi; x++) {
				for (int y = 0; y < this.hi; y++) {
					this.pixels[this.wi * y + x] = dat.g1b();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public void halveSize() {
		this.owi /= 2;
		this.ohi /= 2;

		byte[] temp = new byte[this.ohi * this.owi];
		int i = 0;
		for (int y = 0; y < this.hi; y++) {
			for (int x = 0; x < this.wi; x++) {
				temp[(this.xof + x >> 1) + (this.yof + y >> 1) * this.owi] = this.pixels[i++];
			}
		}
		this.pixels = temp;

		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("kb.b(Z)V")
	public void trim() {
		if (this.owi == this.wi && this.ohi == this.hi) {
			return;
		}

		byte[] temp = new byte[this.ohi * this.owi];
		int i = 0;
		for (int y = 0; y < this.hi; y++) {
			for (int x = 0; x < this.wi; x++) {
				temp[(this.yof + y) * this.owi + this.xof + x] = this.pixels[i++];
			}
		}
		this.pixels = temp;

		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("kb.b(I)V")
	public void hflip() {
		byte[] temp = new byte[this.hi * this.wi];
		int i = 0;
		for (int y = 0; y < this.hi; y++) {
			for (int x = this.wi - 1; x >= 0; x--) {
				temp[i++] = this.pixels[this.wi * y + x];
			}
		}
		this.pixels = temp;

		this.xof = this.owi - this.wi - this.xof;
	}

	@ObfuscatedName("kb.c(I)V")
	public void vflip() {
		byte[] temp = new byte[this.hi * this.wi];
		int i = 0;
		for (int y = this.hi - 1; y >= 0; y--) {
			for (int x = 0; x < this.wi; x++) {
				temp[i++] = this.pixels[this.wi * y + x];
			}
		}
		this.pixels = temp;

		this.yof = this.ohi - this.hi - this.yof;
	}

	@ObfuscatedName("kb.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg3) {
		for (int var5 = 0; var5 < this.bpal.length; var5++) {
			int var6 = this.bpal[var5] >> 16 & 0xFF;
			int var7 = arg0 + var6;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			int var8 = this.bpal[var5] >> 8 & 0xFF;
			int var9 = arg3 + var8;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 255) {
				var9 = 255;
			}

			int var10 = this.bpal[var5] & 0xFF;
			int var11 = arg1 + var10;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}

			this.bpal[var5] = (var7 << 16) + (var9 << 8) + var11;
		}
	}

	@ObfuscatedName("kb.a(BII)V")
	public void plotSprite(int x, int y) {
		int var4 = this.xof + x;
		int var5 = this.yof + y;
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		int var8 = this.hi;
		int var9 = this.wi;
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
			this.plot(var11, var8, var10, Pix2D.data, var6, this.pixels, this.bpal, var9, var7);
		}
	}

	@ObfuscatedName("kb.a(IIII[II[B[III)V")
	public void plot(int arg1, int arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg8 >> 2);
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
