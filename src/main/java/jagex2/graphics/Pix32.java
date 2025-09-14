package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

import java.awt.*;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public class Pix32 extends Pix2D {

	@ObfuscatedName("jb.y")
	public int[] pixels;

	@ObfuscatedName("jb.z")
	public int wi; // width

	@ObfuscatedName("jb.D")
	public int owi; // original width

	@ObfuscatedName("jb.E")
	public int ohi; // original height

	@ObfuscatedName("jb.A")
	public int hi; // height

	@ObfuscatedName("jb.C")
	public int yof; // y offset

	@ObfuscatedName("jb.B")
	public int xof; // x offset

	public Pix32(int width, int height) {
		this.pixels = new int[width * height];
		this.wi = this.owi = width;
		this.hi = this.ohi = height;
		this.xof = this.yof = 0;
	}

	public Pix32(byte[] src, Component c) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(src);
			MediaTracker tracker = new MediaTracker(c);
			tracker.addImage(image, 0);
			tracker.waitForAll();

			this.wi = image.getWidth(c);
			this.hi = image.getHeight(c);
			this.owi = this.wi;
			this.ohi = this.hi;
			this.xof = 0;
			this.yof = 0;
			this.pixels = new int[this.wi * this.hi];

			PixelGrabber grabber = new PixelGrabber(image, 0, 0, this.wi, this.hi, this.pixels, 0, this.wi);
			grabber.grabPixels();
		} catch (Exception ignore) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile jag, String name, int sprite) {
		Packet data = new Packet(jag.read(name + ".dat", null));
		Packet index = new Packet(jag.read("index.dat", null));

		index.pos = data.g2();
		this.owi = index.g2();
		this.ohi = index.g2();

		int palCount = index.g1();
		int[] bpal = new int[palCount];
		for (int i = 0; i < palCount - 1; i++) {
			bpal[i + 1] = index.g3();
			if (bpal[i + 1] == 0) {
				bpal[i + 1] = 1;
			}
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
		this.pixels = new int[len];

		if (pixelOrder == 0) {
			for (int i = 0; i < len; i++) {
				this.pixels[i] = bpal[data.g1()];
			}
		} else if (pixelOrder == 1) {
			for (int x = 0; x < this.wi; x++) {
				for (int y = 0; y < this.hi; y++) {
					this.pixels[x + y * this.wi] = bpal[data.g1()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void bind() {
		Pix2D.bind(this.pixels, this.wi, this.hi);
	}

	@ObfuscatedName("jb.a(IZII)V")
	public void rgbAdjust(int r, int g, int b) {
		for (int i = 0; i < this.pixels.length; i++) {
			int colour = this.pixels[i];
			if (colour != 0) {
				int red = colour >> 16 & 0xFF;
				red = red + r;
				if (red < 1) {
					red = 1;
				} else if (red > 255) {
					red = 255;
				}

				int green = colour >> 8 & 0xFF;
				green = green + g;
				if (green < 1) {
					green = 1;
				} else if (green > 255) {
					green = 255;
				}

				int blue = colour & 0xFF;
				blue = blue + b;
				if (blue < 1) {
					blue = 1;
				} else if (blue > 255) {
					blue = 255;
				}

				this.pixels[i] = (red << 16) + (green << 8) + blue;
			}
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void trim() {
		int[] temp = new int[this.owi * this.ohi];
		for (int y = 0; y < this.hi; y++) {
			for (int x = 0; x < this.wi; x++) {
				temp[(y + this.yof) * this.owi + x + this.xof] = this.pixels[y * this.wi + x];
			}
		}
		this.pixels = temp;

		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("jb.a(III)V")
	public void quickPlotSprite(int x, int y) {
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
			this.quickPlot(dstStep, w, srcOff, Pix2D.data, srcStep, this.pixels, dstOff, h);
		}
	}

	@ObfuscatedName("jb.a(III[II[IIZI)V")
	public void quickPlot(int dstStep, int w, int srcOff, int[] dst, int srcStep, int[] src, int dstOff, int h) {
		int qw = -(w >> 2);
		w = -(w & 0x3);

		for (int y = -h; y < 0; y++) {
			for (int x = qw; x < 0; x++) {
				dst[dstOff++] = src[srcOff++];
				dst[dstOff++] = src[srcOff++];
				dst[dstOff++] = src[srcOff++];
				dst[dstOff++] = src[srcOff++];
			}

			for (int x = w; x < 0; x++) {
				dst[dstOff++] = src[srcOff++];
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@ObfuscatedName("jb.b(III)V")
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
			this.plot(Pix2D.data, this.pixels, srcOff, dstOff, w, h, dstStep, srcStep);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void plot(int[] dst, int[] src, int srcOff, int dstOff, int w, int h, int dstStep, int srcStep) {
		int qw = -(w >> 2);
		w = -(w & 0x3);

		for (int y = -h; y < 0; y++) {
			for (int x = qw; x < 0; x++) {
				int rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}

				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}

				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}

				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
			}

			for (int x = w; x < 0; x++) {
				int rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void transPlotSprite(int alpha, int y, int x) {
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
			this.transPlot(dstOff, srcStep, dstStep, h, this.pixels, srcOff, alpha, Pix2D.data, w);
		}
	}

	@ObfuscatedName("jb.a(IIIIB[IIII[II)V")
	public void transPlot(int dstOff, int srcStep, int dstStep, int h, int[] src, int srcOff, int alpha, int[] dst, int w) {
		int invAlpha = 256 - alpha;

		for (int y = -h; y < 0; y++) {
			for (int x = -w; x < 0; x++) {
				int rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					int dstRgb = dst[dstOff];
					dst[dstOff++] = ((rgb & 0xFF00FF) * alpha + (dstRgb & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((rgb & 0xFF00) * alpha + (dstRgb & 0xFF00) * invAlpha & 0xFF0000) >> 8;
				}
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@ObfuscatedName("jb.a([IZ[IIIIIIIII)V")
	public void drawRotatedMasked(int[] lineStart, int[] lineLengths, int zoom, int y, int anchorX, int h, int anchorY, int w, int angle, int x) {
		try {
			int centerX = -w / 2;
			int centerY = -h / 2;

			int sin = (int) (Math.sin((double) angle / 326.11D) * 65536.0D);
			int cos = (int) (Math.cos((double) angle / 326.11D) * 65536.0D);
			int sinZoom = sin * zoom >> 8;
			int cosZoom = cos * zoom >> 8;

			int leftX = (anchorX << 16) + centerY * sinZoom + centerX * cosZoom;
			int leftY = (anchorY << 16) + (centerY * cosZoom - centerX * sinZoom);
			int letfOff = x + y * Pix2D.width2d;

			for (int i = 0; i < h; i++) {
				int dstOff = lineStart[i];
				int dstX = letfOff + dstOff;

				int srcX = leftX + cosZoom * dstOff;
				int srcY = leftY - sinZoom * dstOff;

				for (int j = -lineLengths[i]; j < 0; j++) {
					Pix2D.data[dstX++] = this.pixels[(srcX >> 16) + (srcY >> 16) * this.wi];
					srcX += cosZoom;
					srcY -= sinZoom;
				}

				leftX += sinZoom;
				leftY += cosZoom;
				letfOff += Pix2D.width2d;
			}
		} catch (Exception ignore) {
		}
	}

	@ObfuscatedName("jb.a(IIIIIIZDI)V")
	public void drawRotated(int anchorX, int zoom, int anchorY, int x, int h, int y, double radians, int w) {
		try {
			int centerX = -w / 2;
			int centerY = -h / 2;

			int sin = (int) (Math.sin(radians) * 65536.0D);
			int cos = (int) (Math.cos(radians) * 65536.0D);
			int sinZoom = sin * zoom >> 8;
			int cosZoom = cos * zoom >> 8;

			int leftX = (anchorX << 16) + centerY * sinZoom + centerX * cosZoom;
			int leftY = (anchorY << 16) + (centerY * cosZoom - centerX * sinZoom);
			int leftOff = x + y * Pix2D.width2d;

			for (int i = 0; i < h; i++) {
				int dstOff = leftOff;
				int srcX = leftX;
				int srcY = leftY;

				for (int j = -w; j < 0; j++) {
					int rgb = this.pixels[(srcX >> 16) + (srcY >> 16) * this.wi];
					if (rgb == 0) {
						dstOff++;
					} else {
						Pix2D.data[dstOff++] = rgb;
					}

					srcX += cosZoom;
					srcY -= sinZoom;
				}

				leftX += sinZoom;
				leftY += cosZoom;
				leftOff += Pix2D.width2d;
			}
		} catch (Exception ignore) {
		}
	}

	@ObfuscatedName("jb.a(ILkb;IB)V")
	public void drawMasked(int x, Pix8 mask, int y) {
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
			this.copyPixelsMasked(srcOff, h, mask.pixels, w, Pix2D.data, this.pixels, srcStep, dstStep, dstOff);
		}
	}

	@ObfuscatedName("jb.a(II[BI[II[IIIIB)V")
	public void copyPixelsMasked(int srcOff, int h, byte[] mask, int w, int[] dst, int[] src, int srcStep, int dstStep, int dstOff) {
		int qw = -(w >> 2);
		w = -(w & 0x3);

		for (int y = -h; y < 0; y++) {
			for (int x = qw; x < 0; x++) {
				int rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					dst[dstOff++] = rgb;
				} else {
					dstOff++;
				}

				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					dst[dstOff++] = rgb;
				} else {
					dstOff++;
				}

				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					dst[dstOff++] = rgb;
				} else {
					dstOff++;
				}

				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					dst[dstOff++] = rgb;
				} else {
					dstOff++;
				}
			}

			for (int x = w; x < 0; x++) {
				int rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					dst[dstOff++] = rgb;
				} else {
					dstOff++;
				}
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}
}
