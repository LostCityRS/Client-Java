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
	public int wi;

	@ObfuscatedName("jb.D")
	public int owi;

	@ObfuscatedName("jb.E")
	public int ohi;

	@ObfuscatedName("jb.A")
	public int hi;

	@ObfuscatedName("jb.C")
	public int yof;

	@ObfuscatedName("jb.B")
	public int xof;

	public Pix32(int arg0, int arg1) {
		this.pixels = new int[arg0 * arg1];
		this.wi = this.owi = arg0;
		this.hi = this.ohi = arg1;
		this.xof = this.yof = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.wi = var3.getWidth(arg1);
			this.hi = var3.getHeight(arg1);
			this.owi = this.wi;
			this.ohi = this.hi;
			this.xof = 0;
			this.yof = 0;
			this.pixels = new int[this.wi * this.hi];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.wi, this.hi, this.pixels, 0, this.wi);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		this.owi = var5.g2();
		this.ohi = var5.g2();
		int var6 = var5.g1();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.g3();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.xof = var5.g1();
		this.yof = var5.g1();
		this.wi = var5.g2();
		this.hi = var5.g2();
		int var10 = var5.g1();
		int var11 = this.wi * this.hi;
		this.pixels = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.pixels[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.wi; var13++) {
				for (int var14 = 0; var14 < this.hi; var14++) {
					this.pixels[var13 + var14 * this.wi] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void bind() {
		Pix2D.bind(this.pixels, this.wi, this.hi);
	}

	@ObfuscatedName("jb.a(IZII)V")
	public void rgbAdjust(int arg0, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.pixels.length; var5++) {
			int var6 = this.pixels[var5];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 0xFF;
				int var8 = var7 + arg0;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = var6 >> 8 & 0xFF;
				int var10 = var9 + arg2;
				if (var10 < 1) {
					var10 = 1;
				} else if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var6 & 0xFF;
				int var12 = var11 + arg3;
				if (var12 < 1) {
					var12 = 1;
				} else if (var12 > 255) {
					var12 = 255;
				}
				this.pixels[var5] = (var8 << 16) + (var10 << 8) + var12;
			}
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void trim() {
		int[] var2 = new int[this.owi * this.ohi];
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var2[(var3 + this.yof) * this.owi + var4 + this.xof] = this.pixels[var3 * this.wi + var4];
			}
		}
		this.pixels = var2;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("jb.a(III)V")
	public void quickPlotSprite(int arg0, int arg2) {
		int var4 = arg0 + this.xof;
		int var5 = arg2 + this.yof;
		int var6 = var4 + var5 * Pix2D.width2d;
		int var7 = 0;
		int var8 = this.hi;
		int var9 = this.wi;
		int var10 = Pix2D.width2d - var9;
		int var11 = 0;
		if (var5 < Pix2D.top) {
			int var12 = Pix2D.top - var5;
			var8 -= var12;
			var5 = Pix2D.top;
			var7 += var12 * var9;
			var6 += var12 * Pix2D.width2d;
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
			this.quickPlot(var10, var9, var7, Pix2D.data, var11, this.pixels, var6, var8);
		}
	}

	@ObfuscatedName("jb.a(III[II[IIZI)V")
	public void quickPlot(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg8) {
		int var10 = -(arg1 >> 2);
		int var11 = -(arg1 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				arg3[arg6++] = arg5[arg2++];
				arg3[arg6++] = arg5[arg2++];
				arg3[arg6++] = arg5[arg2++];
				arg3[arg6++] = arg5[arg2++];
			}
			for (int var14 = var11; var14 < 0; var14++) {
				arg3[arg6++] = arg5[arg2++];
			}
			arg6 += arg0;
			arg2 += arg4;
		}
	}

	@ObfuscatedName("jb.b(III)V")
	public void plotSprite(int arg0, int arg2) {
		int var4 = arg0 + this.xof;
		int var5 = arg2 + this.yof;
		int var6 = var4 + var5 * Pix2D.width2d;
		int var7 = 0;
		int var8 = this.hi;
		int var9 = this.wi;
		int var10 = Pix2D.width2d - var9;
		int var11 = 0;
		if (var5 < Pix2D.top) {
			int var12 = Pix2D.top - var5;
			var8 -= var12;
			var5 = Pix2D.top;
			var7 += var12 * var9;
			var6 += var12 * Pix2D.width2d;
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
			this.plot(Pix2D.data, this.pixels, 0, var7, var6, var9, var8, var10, var11);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void plot(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				int var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var14;
				}
				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
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
			}
			for (int var18 = var11; var18 < 0; var18++) {
				int var19 = arg1[arg3++];
				if (var19 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var19;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void transPlotSprite(int arg1, int arg2, int arg3) {
		int var5 = arg3 + this.xof;
		int var6 = arg2 + this.yof;
		int var8 = var5 + var6 * Pix2D.width2d;
		int var9 = 0;
		int var10 = this.hi;
		int var11 = this.wi;
		int var12 = Pix2D.width2d - var11;
		int var13 = 0;
		if (var6 < Pix2D.top) {
			int var14 = Pix2D.top - var6;
			var10 -= var14;
			var6 = Pix2D.top;
			var9 += var14 * var11;
			var8 += var14 * Pix2D.width2d;
		}
		if (var6 + var10 > Pix2D.bottom) {
			var10 -= var6 + var10 - Pix2D.bottom;
		}
		if (var5 < Pix2D.left) {
			int var15 = Pix2D.left - var5;
			var11 -= var15;
			var5 = Pix2D.left;
			var9 += var15;
			var8 += var15;
			var13 += var15;
			var12 += var15;
		}
		if (var5 + var11 > Pix2D.right) {
			int var16 = var5 + var11 - Pix2D.right;
			var11 -= var16;
			var13 += var16;
			var12 += var16;
		}
		if (var11 > 0 && var10 > 0) {
			this.transPlot(var8, var13, var12, var10, this.pixels, 0, var9, arg1, Pix2D.data, var11);
		}
	}

	@ObfuscatedName("jb.a(IIIIB[IIII[II)V")
	public void transPlot(int arg0, int arg1, int arg2, int arg3, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
		int var12 = 256 - arg8;
		for (int var13 = -arg3; var13 < 0; var13++) {
			for (int var14 = -arg10; var14 < 0; var14++) {
				int var15 = arg5[arg7++];
				if (var15 == 0) {
					arg0++;
				} else {
					int var16 = arg9[arg0];
					arg9[arg0++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
			}
			arg0 += arg2;
			arg7 += arg1;
		}
	}

	@ObfuscatedName("jb.a([IZ[IIIIIIIII)V")
	public void drawRotatedMasked(int[] arg0, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		try {
			int var12 = -arg8 / 2;
			int var13 = -arg6 / 2;
			int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
			int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
			int var16 = var14 * arg3 >> 8;
			int var17 = var15 * arg3 >> 8;
			int var18 = (arg5 << 16) + var13 * var16 + var12 * var17;
			int var19 = (arg7 << 16) + (var13 * var17 - var12 * var16);
			int var20 = arg10 + arg4 * Pix2D.width2d;
			for (int var21 = 0; var21 < arg6; var21++) {
				int var22 = arg0[var21];
				int var23 = var20 + var22;
				int var24 = var18 + var17 * var22;
				int var25 = var19 - var16 * var22;
				for (int var26 = -arg2[var21]; var26 < 0; var26++) {
					Pix2D.data[var23++] = this.pixels[(var24 >> 16) + (var25 >> 16) * this.wi];
					var24 += var17;
					var25 -= var16;
				}
				var18 += var16;
				var19 += var17;
				var20 += Pix2D.width2d;
			}
		} catch (Exception var27) {
		}
	}

	@ObfuscatedName("jb.a(IIIIIIZDI)V")
	public void drawRotated(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg7, int arg8) {
		try {
			int var11 = -arg8 / 2;
			int var12 = -arg4 / 2;
			int var13 = (int) (Math.sin(arg7) * 65536.0D);
			int var14 = (int) (Math.cos(arg7) * 65536.0D);
			int var15 = var13 * arg1 >> 8;
			int var16 = var14 * arg1 >> 8;
			int var17 = (arg0 << 16) + var12 * var15 + var11 * var16;
			int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
			int var19 = arg3 + arg5 * Pix2D.width2d;
			for (int var20 = 0; var20 < arg4; var20++) {
				int var21 = var19;
				int var22 = var17;
				int var23 = var18;
				for (int var24 = -arg8; var24 < 0; var24++) {
					int var25 = this.pixels[(var22 >> 16) + (var23 >> 16) * this.wi];
					if (var25 == 0) {
						var21++;
					} else {
						Pix2D.data[var21++] = var25;
					}
					var22 += var16;
					var23 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += Pix2D.width2d;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("jb.a(ILkb;IB)V")
	public void drawMasked(int arg0, Pix8 arg1, int arg2) {
		int var5 = arg0 + this.xof;
		int var6 = arg2 + this.yof;
		int var7 = var5 + var6 * Pix2D.width2d;
		int var8 = 0;
		int var9 = this.hi;
		int var10 = this.wi;
		int var11 = Pix2D.width2d - var10;
		int var12 = 0;
		if (var6 < Pix2D.top) {
			int var13 = Pix2D.top - var6;
			var9 -= var13;
			var6 = Pix2D.top;
			var8 += var13 * var10;
			var7 += var13 * Pix2D.width2d;
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
			this.copyPixelsMasked(var8, var9, arg1.pixels, var10, Pix2D.data, 0, this.pixels, var12, var11, var7);
		}
	}

	@ObfuscatedName("jb.a(II[BI[II[IIIIB)V")
	public void copyPixelsMasked(int arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var12 = -(arg3 >> 2);
		int var13 = -(arg3 & 0x3);
		for (int var14 = -arg1; var14 < 0; var14++) {
			for (int var15 = var12; var15 < 0; var15++) {
				int var16 = arg6[arg0++];
				if (var16 != 0 && arg2[arg9] == 0) {
					arg4[arg9++] = var16;
				} else {
					arg9++;
				}
				int var17 = arg6[arg0++];
				if (var17 != 0 && arg2[arg9] == 0) {
					arg4[arg9++] = var17;
				} else {
					arg9++;
				}
				int var18 = arg6[arg0++];
				if (var18 != 0 && arg2[arg9] == 0) {
					arg4[arg9++] = var18;
				} else {
					arg9++;
				}
				int var19 = arg6[arg0++];
				if (var19 != 0 && arg2[arg9] == 0) {
					arg4[arg9++] = var19;
				} else {
					arg9++;
				}
			}
			for (int var20 = var13; var20 < 0; var20++) {
				int var21 = arg6[arg0++];
				if (var21 != 0 && arg2[arg9] == 0) {
					arg4[arg9++] = var21;
				} else {
					arg9++;
				}
			}
			arg9 += arg8;
			arg0 += arg7;
		}
	}
}
