package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.io.Jagfile;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public class Pix32 extends Pix2D {

	@ObfuscatedName("jb.F")
	public int[] pixels;

	@ObfuscatedName("jb.K")
	public int owi; // original width

	@ObfuscatedName("jb.G")
	public int wi; // width

	@ObfuscatedName("jb.L")
	public int ohi; // original height

	@ObfuscatedName("jb.H")
	public int hi; // height

	@ObfuscatedName("jb.J")
	public int yof; // y offset

	@ObfuscatedName("jb.I")
	public int xof; // x offset

	public Pix32(int width, int height) {
		this.pixels = new int[width * height];
		this.wi = this.owi = width;
		this.hi = this.ohi = height;
		this.xof = this.yof = 0;
	}

	public Pix32(byte[] src, java.awt.Component c) {
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
			this.pixels = new int[this.hi * this.wi];

			PixelGrabber grabber = new PixelGrabber(image, 0, 0, this.wi, this.hi, this.pixels, 0, this.wi);
			grabber.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile jag, String name, int sprite) {
		Packet dat = new Packet(jag.read(name + ".dat", null));
		Packet idx = new Packet(jag.read("index.dat", null));

		idx.pos = dat.g2();
		this.owi = idx.g2();
		this.ohi = idx.g2();

		int palCount = idx.g1();
		int[] bpal = new int[palCount]; // base palette
		for (int i = 0; i < palCount - 1; i++) {
			bpal[i + 1] = idx.g3();

			if (bpal[i + 1] == 0) {
				bpal[i + 1] = 1;
			}
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
		this.pixels = new int[len];

		if (pixelOrder == 0) {
			for (int i = 0; i < len; i++) {
				this.pixels[i] = bpal[dat.g1()];
			}
		} else if (pixelOrder == 1) {
			for (int x = 0; x < this.wi; x++) {
				for (int y = 0; y < this.hi; y++) {
					this.pixels[this.wi * y + x] = bpal[dat.g1()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void bind() {
		Pix2D.bind(this.wi, this.pixels, this.hi);
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg3) {
		for (int var5 = 0; var5 < this.pixels.length; var5++) {
			int var6 = this.pixels[var5];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 0xFF;
				int var8 = arg0 + var7;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				int var9 = var6 >> 8 & 0xFF;
				int var10 = arg3 + var9;
				if (var10 < 1) {
					var10 = 1;
				} else if (var10 > 255) {
					var10 = 255;
				}

				int var11 = var6 & 0xFF;
				int var12 = arg1 + var11;
				if (var12 < 1) {
					var12 = 1;
				} else if (var12 > 255) {
					var12 = 255;
				}

				this.pixels[var5] = (var8 << 16) + (var10 << 8) + var12;
			}
		}
	}

	@ObfuscatedName("jb.b(Z)V")
	public void trim() {
		int[] pixels = new int[this.ohi * this.owi];
		for (int y = 0; y < this.hi; y++) {
			for (int x = 0; x < this.wi; x++) {
				pixels[(this.yof + y) * this.owi + this.xof + x] = this.pixels[this.wi * y + x];
			}
		}

		this.pixels = pixels;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("jb.a(III)V")
	public void quickPlotSprite(int arg0, int arg1) {
		int var4 = this.xof + arg0;
		int var5 = this.yof + arg1;
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
			this.quickPlot(var7, this.pixels, var11, var10, var6, var9, var8, Pix2D.data);
		}
	}

	@ObfuscatedName("jb.a(I[IIIIIII[I)V")
	public void quickPlot(int arg0, int[] arg1, int arg2, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg6 >> 2);
		int var11 = -(arg6 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				arg8[arg5++] = arg1[arg0++];
				arg8[arg5++] = arg1[arg0++];
				arg8[arg5++] = arg1[arg0++];
				arg8[arg5++] = arg1[arg0++];
			}
			for (int var14 = var11; var14 < 0; var14++) {
				arg8[arg5++] = arg1[arg0++];
			}
			arg5 += arg4;
			arg0 += arg2;
		}
	}

	@ObfuscatedName("jb.a(BII)V")
	public void plotSprite(int x, int y) {
		x += this.xof;
		y += this.yof;

		int dstOff = Pix2D.width2d * y + x;
		int srcOff = 0;

		int h = this.hi;
		int w = this.wi;

		int dstStep = Pix2D.width2d - w;
		int srcStep = 0;

		if (y < Pix2D.top) {
			int cutoff = Pix2D.top - y;
			h -= cutoff;
			y = Pix2D.top;
			srcOff += w * cutoff;
			dstOff += Pix2D.width2d * cutoff;
		}

		if (y + h > Pix2D.bottom) {
			h -= y + h - Pix2D.bottom;
		}

		if (x < Pix2D.left) {
			int cutoff = Pix2D.left - x;
			w -= cutoff;
			x = Pix2D.left;
			srcOff += cutoff;
			dstOff += cutoff;
			srcStep += cutoff;
			dstStep += cutoff;
		}

		if (x + w > Pix2D.right) {
			int cutoff = x + w - Pix2D.right;
			w -= cutoff;
			srcStep += cutoff;
			dstStep += cutoff;
		}

		if (w > 0 && h > 0) {
			this.plot(Pix2D.data, this.pixels, 0, srcOff, dstOff, w, h, dstStep, srcStep);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void plot(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				int var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var16;
				}
				int var17 = arg1[arg3++];
				if (var17 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var17;
				}
				int var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var18;
				}
				int var19 = arg1[arg3++];
				if (var19 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var19;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("jb.b(IIII)V")
	public void transPlotSprite(int arg0, int arg1, int arg3) {
		int var5 = this.xof + arg0;
		int var6 = this.yof + arg3;
		int var7 = Pix2D.width2d * var6 + var5;
		int var8 = 0;
		int var9 = this.hi;
		int var10 = this.wi;
		int var11 = Pix2D.width2d - var10;
		int var12 = 0;
		if (var6 < Pix2D.top) {
			int var13 = Pix2D.top - var6;
			var9 -= var13;
			var6 = Pix2D.top;
			var8 += var10 * var13;
			var7 += Pix2D.width2d * var13;
		}
		if (var6 + var9 > Pix2D.bottom) {
			var9 -= var6 + var9 - Pix2D.bottom;
		}
		if (var5 < Pix2D.left) {
			int var14 = Pix2D.left - var5;
			var10 -= var14;
			var5 = Pix2D.left;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.right) {
			int var15 = var5 + var10 - Pix2D.right;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.transPlot(0, var12, this.pixels, var11, var9, arg1, var7, var10, var8, Pix2D.data);
		}
	}

	@ObfuscatedName("jb.a(III[IIIIIII[I)V")
	public void transPlot(int arg0, int arg1, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
		int var12 = 256 - arg6;
		for (int var13 = -arg5; var13 < 0; var13++) {
			for (int var14 = -arg8; var14 < 0; var14++) {
				int var15 = arg3[arg9++];
				if (var15 == 0) {
					arg7++;
				} else {
					int var16 = arg10[arg7];
					arg10[arg7++] = ((var15 & 0xFF00FF) * arg6 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg6 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
			}
			arg7 += arg4;
			arg9 += arg1;
		}
	}

	// todo: plotSprite variant
	@ObfuscatedName("jb.a(IIIIIIZ[I[III)V")
	public void drawRotatedMasked(int x, int anchorY, int w, int zoom, int y, int theta, int[] lineWidth, int[] lineStart, int anchorX, int h) {
		try {
			int centerX = -w / 2;
			int centerY = -h / 2;

			int sin = (int) (Math.sin((double) theta / 326.11D) * 65536.0D);
			int cos = (int) (Math.cos((double) theta / 326.11D) * 65536.0D);
			int sinZoom = zoom * sin >> 8;
			int cosZoom = zoom * cos >> 8;

			int leftX = (anchorX << 16) + centerX * cosZoom + centerY * sinZoom;
			int leftY = (anchorY << 16) + (centerY * cosZoom - centerX * sinZoom);
			int leftOff = Pix2D.width2d * y + x;

			for (int i = 0; i < h; i++) {
				int dstOff = lineStart[i];
				int dstX = leftOff + dstOff;

				int srcX = cosZoom * dstOff + leftX;
				int srcY = leftY - sinZoom * dstOff;

				for (int j = -lineWidth[i]; j < 0; j++) {
					Pix2D.data[dstX++] = this.pixels[(srcX >> 16) + (srcY >> 16) * this.wi];
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

	// todo: plotSprite variant
	@ObfuscatedName("jb.a(IBDIIIIII)V")
	public void drawRotated(int y, double theta, int zoom, int anchorX, int anchorY, int w, int h, int x) {
		try {
			int centerX = -w / 2;
			int centerY = -h / 2;

			int sin = (int) (Math.sin(theta) * 65536.0D);
			int cos = (int) (Math.cos(theta) * 65536.0D);
			int sinZoom = zoom * sin >> 8;
			int cosZoom = zoom * cos >> 8;

			int leftX = (anchorX << 16) + (centerX * cosZoom + centerY * sinZoom);
			int leftY = (anchorY << 16) + (centerY * cosZoom - centerX * sinZoom);
			int leftOff = Pix2D.width2d * y + x;

			for (int i = 0; i < h; i++) {
				int dstX = leftOff;
				int srcX = leftX;
				int srcY = leftY;

				for (int j = -w; j < 0; j++) {
					int rgb = this.pixels[(srcX >> 16) + (srcY >> 16) * this.wi];
					if (rgb == 0) {
						dstX++;
					} else {
						Pix2D.data[dstX++] = rgb;
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

	// todo: plotSprite variant
	@ObfuscatedName("jb.a(Lkb;ZII)V")
	public void drawMasked(Pix8 arg0, int arg2, int arg3) {
		int var5 = this.xof + arg2;
		int var6 = this.yof + arg3;
		int var7 = Pix2D.width2d * var6 + var5;
		int var8 = 0;
		int var9 = this.hi;
		int var10 = this.wi;
		int var11 = Pix2D.width2d - var10;
		int var12 = 0;
		if (var6 < Pix2D.top) {
			int var13 = Pix2D.top - var6;
			var9 -= var13;
			var6 = Pix2D.top;
			var8 += var10 * var13;
			var7 += Pix2D.width2d * var13;
		}
		if (var6 + var9 > Pix2D.bottom) {
			var9 -= var6 + var9 - Pix2D.bottom;
		}
		if (var5 < Pix2D.left) {
			int var14 = Pix2D.left - var5;
			var10 -= var14;
			var5 = Pix2D.left;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.right) {
			int var15 = var5 + var10 - Pix2D.right;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.copyPixelsMasked(var7, 0, this.pixels, var10, var12, var8, var11, var9, Pix2D.data, arg0.pixels);
		}
	}

	// todo: plot variant
	@ObfuscatedName("jb.a(II[IIIIII[IB[B)V")
	public void copyPixelsMasked(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg10) {
		int var12 = -(arg3 >> 2);
		int var13 = -(arg3 & 0x3);
		for (int var14 = -arg7; var14 < 0; var14++) {
			for (int var15 = var12; var15 < 0; var15++) {
				int var18 = arg2[arg5++];
				if (var18 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var18;
				} else {
					arg0++;
				}
				int var19 = arg2[arg5++];
				if (var19 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var19;
				} else {
					arg0++;
				}
				int var20 = arg2[arg5++];
				if (var20 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var20;
				} else {
					arg0++;
				}
				int var21 = arg2[arg5++];
				if (var21 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var21;
				} else {
					arg0++;
				}
			}
			for (int var16 = var13; var16 < 0; var16++) {
				int var17 = arg2[arg5++];
				if (var17 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var17;
				} else {
					arg0++;
				}
			}
			arg0 += arg6;
			arg5 += arg4;
		}
	}
}
