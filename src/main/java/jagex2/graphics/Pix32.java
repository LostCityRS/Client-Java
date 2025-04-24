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
	public int width;

	@ObfuscatedName("jb.G")
	public int cropRight;

	@ObfuscatedName("jb.L")
	public int height;

	@ObfuscatedName("jb.H")
	public int cropBottom;

	@ObfuscatedName("jb.J")
	public int cropTop;

	@ObfuscatedName("jb.I")
	public int cropLeft;

	public Pix32(int arg0, int arg1) {
		this.pixels = new int[arg0 * arg1];
		this.cropRight = this.width = arg0;
		this.cropBottom = this.height = arg1;
		this.cropLeft = this.cropTop = 0;
	}

	public Pix32(byte[] arg0, java.awt.Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.cropRight = var3.getWidth(arg1);
			this.cropBottom = var3.getHeight(arg1);
			this.width = this.cropRight;
			this.height = this.cropBottom;
			this.cropLeft = 0;
			this.cropTop = 0;
			this.pixels = new int[this.cropBottom * this.cropRight];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.cropRight, this.cropBottom, this.pixels, 0, this.cropRight);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		this.width = var5.g2();
		this.height = var5.g2();
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
		this.cropLeft = var5.g1();
		this.cropTop = var5.g1();
		this.cropRight = var5.g2();
		this.cropBottom = var5.g2();
		int var10 = var5.g1();
		int var11 = this.cropBottom * this.cropRight;
		this.pixels = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.pixels[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.cropRight; var13++) {
				for (int var14 = 0; var14 < this.cropBottom; var14++) {
					this.pixels[this.cropRight * var14 + var13] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void bind() {
		Pix2D.bind(this.cropRight, this.pixels, this.cropBottom);
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void translate(int arg0, int arg1, int arg3) {
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
	public void crop() {
		int[] var2 = new int[this.height * this.width];
		for (int var3 = 0; var3 < this.cropBottom; var3++) {
			for (int var4 = 0; var4 < this.cropRight; var4++) {
				var2[(this.cropTop + var3) * this.width + this.cropLeft + var4] = this.pixels[this.cropRight * var3 + var4];
			}
		}
		this.pixels = var2;
		this.cropRight = this.width;
		this.cropBottom = this.height;
		this.cropLeft = 0;
		this.cropTop = 0;
	}

	@ObfuscatedName("jb.a(III)V")
	public void blitOpaque(int arg0, int arg1) {
		int var4 = this.cropLeft + arg0;
		int var5 = this.cropTop + arg1;
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		int var8 = this.cropBottom;
		int var9 = this.cropRight;
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
			this.copyPixels(var7, this.pixels, var11, var10, var6, var9, var8, Pix2D.data);
		}
	}

	@ObfuscatedName("jb.a(I[IIIIIII[I)V")
	public void copyPixels(int arg0, int[] arg1, int arg2, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
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
	public void draw(int arg1, int arg2) {
		int var4 = this.cropLeft + arg1;
		int var5 = this.cropTop + arg2;
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		int var8 = this.cropBottom;
		int var9 = this.cropRight;
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
			this.copyPixels(Pix2D.data, this.pixels, 0, var7, var6, var9, var8, var10, var11);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void copyPixels(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
	public void drawAlpha(int arg0, int arg1, int arg3) {
		int var5 = this.cropLeft + arg0;
		int var6 = this.cropTop + arg3;
		int var7 = Pix2D.width2d * var6 + var5;
		int var8 = 0;
		int var9 = this.cropBottom;
		int var10 = this.cropRight;
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
			this.copyPixelsAlpha(0, var12, this.pixels, var11, var9, arg1, var7, var10, var8, Pix2D.data);
		}
	}

	@ObfuscatedName("jb.a(III[IIIIIII[I)V")
	public void copyPixelsAlpha(int arg0, int arg1, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
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

	@ObfuscatedName("jb.a(IIIIIIZ[I[III)V")
	public void drawRotatedMasked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int[] arg7, int[] arg8, int arg9, int arg10) {
		if (arg6) {
			return;
		}
		try {
			int var12 = -arg2 / 2;
			int var13 = -arg10 / 2;
			int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
			int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
			int var16 = arg3 * var14 >> 8;
			int var17 = arg3 * var15 >> 8;
			int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
			int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
			int var20 = Pix2D.width2d * arg4 + arg0;
			for (int var21 = 0; var21 < arg10; var21++) {
				int var22 = arg8[var21];
				int var23 = var20 + var22;
				int var24 = var17 * var22 + var18;
				int var25 = var19 - var16 * var22;
				for (int var26 = -arg7[var21]; var26 < 0; var26++) {
					Pix2D.data[var23++] = this.pixels[(var24 >> 16) + (var25 >> 16) * this.cropRight];
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

	@ObfuscatedName("jb.a(IBDIIIIII)V")
	public void drawRotated(int arg0, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			int var12 = -arg6 / 2;
			int var13 = -arg7 / 2;
			int var14 = (int) (Math.sin(arg2) * 65536.0D);
			int var15 = (int) (Math.cos(arg2) * 65536.0D);
			int var16 = arg3 * var14 >> 8;
			int var17 = arg3 * var15 >> 8;
			int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
			int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
			int var20 = Pix2D.width2d * arg0 + arg8;
			for (int var21 = 0; var21 < arg7; var21++) {
				int var22 = var20;
				int var23 = var18;
				int var24 = var19;
				for (int var25 = -arg6; var25 < 0; var25++) {
					int var26 = this.pixels[(var23 >> 16) + (var24 >> 16) * this.cropRight];
					if (var26 == 0) {
						var22++;
					} else {
						Pix2D.data[var22++] = var26;
					}
					var23 += var17;
					var24 -= var16;
				}
				var18 += var16;
				var19 += var17;
				var20 += Pix2D.width2d;
			}
		} catch (Exception var27) {
		}
	}

	@ObfuscatedName("jb.a(Lkb;ZII)V")
	public void drawMasked(Pix8 arg0, boolean arg1, int arg2, int arg3) {
		int var5 = this.cropLeft + arg2;
		int var6 = this.cropTop + arg3;
		int var7 = Pix2D.width2d * var6 + var5;
		int var8 = 0;
		int var9 = this.cropBottom;
		int var10 = this.cropRight;
		int var11 = Pix2D.width2d - var10;
		int var12 = 0;
		if (arg1) {
			return;
		}
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
