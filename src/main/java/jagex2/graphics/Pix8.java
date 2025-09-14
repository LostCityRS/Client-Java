package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("kb")
public class Pix8 extends Pix2D {

	// these short field names are authentic to native

	@ObfuscatedName("kb.G")
	public int owi; // original width

	@ObfuscatedName("kb.H")
	public int ohi; // original height

	@ObfuscatedName("kb.B")
	public int[] bpal; // base palette

	@ObfuscatedName("kb.E")
	public int xof; // x offset

	@ObfuscatedName("kb.F")
	public int yof; // y offset

	@ObfuscatedName("kb.C")
	public int wi; // width

	@ObfuscatedName("kb.D")
	public int hi; // height

	@ObfuscatedName("kb.A")
	public byte[] pixels;

	public Pix8(Jagfile jag, String name, int sprite) {
		Packet data = new Packet(jag.read(name + ".dat", null));
		Packet index = new Packet(jag.read("index.dat", null));

		index.pos = data.g2();
		this.owi = index.g2();
		this.ohi = index.g2();

		int palCount = index.g1();
		this.bpal = new int[palCount];
		for (int i = 0; i < palCount - 1; i++) {
			this.bpal[i + 1] = index.g3();
		}

		for (int i = 0; i < sprite; i++) {
			index.pos += 2;
			data.pos += index.g2() * index.g2();
			index.pos++;
		}

		this.xof = index.g1();
		this.yof = index.g1();
		this.wi = index.g2();
		this.hi = index.g2();

		int pixelOrder = index.g1();
		int len = this.wi * this.hi;
		this.pixels = new byte[len];

		if (pixelOrder == 0) {
			for (int i = 0; i < len; i++) {
				this.pixels[i] = data.g1b();
			}
		} else if (pixelOrder == 1) {
			for (int x = 0; x < this.wi; x++) {
				for (int y = 0; y < this.hi; y++) {
					this.pixels[x + y * this.wi] = data.g1b();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public void halveSize() {
		this.owi /= 2;
		this.ohi /= 2;

		byte[] temp = new byte[this.owi * this.ohi];
		int i = 0;
		for (int y = 0; y < this.hi; y++) {
			for (int x = 0; x < this.wi; x++) {
				temp[(x + this.xof >> 1) + (y + this.yof >> 1) * this.owi] = this.pixels[i++];
			}
		}
		this.pixels = temp;

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

		byte[] temp = new byte[this.owi * this.ohi];
		int i = 0;
		for (int y = 0; y < this.hi; y++) {
			for (int x = 0; x < this.wi; x++) {
				temp[x + this.xof + (y + this.yof) * this.owi] = this.pixels[i++];
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
		byte[] temp = new byte[this.wi * this.hi];
		int i = 0;
		for (int y = 0; y < this.hi; y++) {
			for (int x = this.wi - 1; x >= 0; x--) {
				temp[i++] = this.pixels[x + y * this.wi];
			}
		}
		this.pixels = temp;

		this.xof = this.owi - this.wi - this.xof;
	}

	@ObfuscatedName("kb.c(I)V")
	public void vflip() {
		byte[] temp = new byte[this.wi * this.hi];
		int i = 0;
		for (int y = this.hi - 1; y >= 0; y--) {
			for (int x = 0; x < this.wi; x++) {
				temp[i++] = this.pixels[x + y * this.wi];
			}
		}
		this.pixels = temp;

		this.yof = this.ohi - this.hi - this.yof;
	}

	@ObfuscatedName("kb.a(IZII)V")
	public void rgbAdjust(int r, int g, int b) {
		for (int i = 0; i < this.bpal.length; i++) {
			int red = this.bpal[i] >> 16 & 0xFF;
			red = red + r;
			if (red < 0) {
				red = 0;
			} else if (red > 255) {
				red = 255;
			}

			int green = this.bpal[i] >> 8 & 0xFF;
			green = green + g;
			if (green < 0) {
				green = 0;
			} else if (green > 255) {
				green = 255;
			}

			int blue = this.bpal[i] & 0xFF;
			blue = blue + b;
			if (blue < 0) {
				blue = 0;
			} else if (blue > 255) {
				blue = 255;
			}

			this.bpal[i] = (red << 16) + (green << 8) + blue;
		}
	}

	@ObfuscatedName("kb.a(III)V")
	public void plotSprite(int x, int y) {
		x = x + this.xof;
		y = y + this.yof;

		int dstOff = x + y * Pix2D.width2d;
		int srcOff = 0;
		int h = this.hi;
		int w = this.wi;
		int dstStep = Pix2D.width2d - w;
		int srcStep = 0;

		if (y < Pix2D.top) {
			int trim = Pix2D.top - y;
			h -= trim;
			y = Pix2D.top;
			srcOff += trim * w;
			dstOff += trim * Pix2D.width2d;
		}

		if (y + h > Pix2D.bottom) {
			h -= y + h - Pix2D.bottom;
		}

		if (x < Pix2D.left) {
			int trim = Pix2D.left - x;
			w -= trim;
			x = Pix2D.left;
			srcOff += trim;
			dstOff += trim;
			srcStep += trim;
			dstStep += trim;
		}

		if (x + w > Pix2D.right) {
			int trim = x + w - Pix2D.right;
			w -= trim;
			srcStep += trim;
			dstStep += trim;
		}

		if (w > 0 && h > 0) {
			this.plot(this.bpal, h, this.pixels, Pix2D.data, srcStep, dstOff, srcOff, w, dstStep);
		}
	}

	@ObfuscatedName("kb.a([II[B[IIIIIII)V")
	public void plot(int[] pal, int h, byte[] src, int[] dst, int srcStep, int dstOff, int srcOff, int w, int dstStep) {
		int qw = -(w >> 2);
		w = -(w & 0x3);

		for (int y = -h; y < 0; y++) {
			for (int x = qw; x < 0; x++) {
				byte palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = pal[palIndex & 0xFF];
				}

				palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = pal[palIndex & 0xFF];
				}

				palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = pal[palIndex & 0xFF];
				}

				palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = pal[palIndex & 0xFF];
				}
			}

			for (int x = w; x < 0; x++) {
				byte palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = pal[palIndex & 0xFF];
				}
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}
}
