package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ib")
public final class Pix32 extends Pix2D {

	@ObfuscatedName("ib.G")
	public int[] data;

	@ObfuscatedName("ib.H")
	public int wi;

	@ObfuscatedName("ib.I")
	public int hi;

	@ObfuscatedName("ib.J")
	public int xof;

	@ObfuscatedName("ib.K")
	public int yof;

	@ObfuscatedName("ib.L")
	public int owi;

	@ObfuscatedName("ib.M")
	public int ohi;

	@ObfuscatedName("ib.z")
	public int field658;

	@ObfuscatedName("ib.A")
	public final boolean field659 = false;

	@ObfuscatedName("ib.B")
	public final int field660 = 387;

	@ObfuscatedName("ib.D")
	public final int field662 = 9;

	@ObfuscatedName("ib.E")
	public final byte field663 = 8;

	@ObfuscatedName("ib.F")
	public final boolean field664 = true;

	@ObfuscatedName("ib.C")
	public int field661;

	public Pix32(int arg0, int arg1) {
		data = new int[arg0 * arg1];
		wi = owi = arg0;
		hi = ohi = arg1;
		xof = yof = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			wi = var3.getWidth(arg1);
			hi = var3.getHeight(arg1);
			owi = wi;
			ohi = hi;
			xof = 0;
			yof = 0;
			data = new int[wi * hi];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, wi, hi, data, 0, wi);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), 15787);
		Packet var5 = new Packet(arg0.read("index.dat", null), 15787);
		var5.pos = var4.g2();
		owi = var5.g2();
		ohi = var5.g2();
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
		xof = var5.g1();
		yof = var5.g1();
		wi = var5.g2();
		hi = var5.g2();
		int var10 = var5.g1();
		int var11 = wi * hi;
		data = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				data[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < wi; var13++) {
				for (int var14 = 0; var14 < hi; var14++) {
					data[var13 + var14 * wi] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("ib.c(B)V")
	public void setPixels() {
		Pix2D.setPixels(data, wi, hi);
	}

	@ObfuscatedName("ib.a(IBII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < data.length; var4++) {
			int var5 = data[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				int var7 = var6 + arg0;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}
				int var8 = var5 >> 8 & 0xFF;
				int var9 = var8 + arg1;
				if (var9 < 1) {
					var9 = 1;
				} else if (var9 > 255) {
					var9 = 255;
				}
				int var10 = var5 & 0xFF;
				int var11 = var10 + arg2;
				if (var11 < 1) {
					var11 = 1;
				} else if (var11 > 255) {
					var11 = 255;
				}
				data[var4] = (var7 << 16) + (var9 << 8) + var11;
			}
		}
	}

	@ObfuscatedName("ib.a(I)V")
	public void trim() {
		int[] var1 = new int[owi * ohi];
		for (int var2 = 0; var2 < hi; var2++) {
			for (int var3 = 0; var3 < wi; var3++) {
				var1[(var2 + yof) * owi + var3 + xof] = data[var2 * wi + var3];
			}
		}
		data = var1;
		wi = owi;
		hi = ohi;
		xof = 0;
		yof = 0;
	}

	@ObfuscatedName("ib.a(III)V")
	public void quickPlotSprite(int arg0, int arg1) {
		int var3 = arg0 + xof;
		int var4 = arg1 + yof;
		int var5 = var3 + var4 * Pix2D.width;
		int var6 = 0;
		int var7 = hi;
		int var8 = wi;
		int var9 = Pix2D.width - var8;
		int var10 = 0;
		if (var4 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - var4;
			var7 -= var11;
			var4 = Pix2D.clipMinY;
			var6 = var11 * var8;
			var5 += var11 * Pix2D.width;
		}
		if (var4 + var7 > Pix2D.clipMaxY) {
			var7 -= var4 + var7 - Pix2D.clipMaxY;
		}
		if (var3 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - var3;
			var8 -= var12;
			var3 = Pix2D.clipMinX;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.clipMaxX) {
			int var13 = var3 + var8 - Pix2D.clipMaxX;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			plotQuick(var6, Pix2D.pixels, data, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("ib.a(I[I[IIIIZII)V")
	public void plotQuick(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				arg1[arg3++] = arg2[arg0++];
				arg1[arg3++] = arg2[arg0++];
				arg1[arg3++] = arg2[arg0++];
				arg1[arg3++] = arg2[arg0++];
			}
			for (int var13 = var10; var13 < 0; var13++) {
				arg1[arg3++] = arg2[arg0++];
			}
			arg3 += arg6;
			arg0 += arg7;
		}
	}

	@ObfuscatedName("ib.a(IBI)V")
	public void plotSprite(int arg0, byte arg1, int arg2) {
		int var4 = arg2 + xof;
		int var5 = arg0 + yof;
		int var6 = var4 + var5 * Pix2D.width;
		int var7 = 0;
		int var8 = hi;
		int var9 = wi;
		int var10 = Pix2D.width - var9;
		int var11 = 0;
		if (arg1 == 1) {
			if (var5 < Pix2D.clipMinY) {
				int var12 = Pix2D.clipMinY - var5;
				var8 -= var12;
				var5 = Pix2D.clipMinY;
				var7 = var12 * var9;
				var6 += var12 * Pix2D.width;
			}
			if (var5 + var8 > Pix2D.clipMaxY) {
				var8 -= var5 + var8 - Pix2D.clipMaxY;
			}
			if (var4 < Pix2D.clipMinX) {
				int var13 = Pix2D.clipMinX - var4;
				var9 -= var13;
				var4 = Pix2D.clipMinX;
				var7 += var13;
				var6 += var13;
				var11 = var13;
				var10 += var13;
			}
			if (var4 + var9 > Pix2D.clipMaxX) {
				int var14 = var4 + var9 - Pix2D.clipMaxX;
				var9 -= var14;
				var11 += var14;
				var10 += var14;
			}
			if (var9 > 0 && var8 > 0) {
				plot(Pix2D.pixels, data, var7, var6, var9, var8, var10, var11);
			}
		}
	}

	@ObfuscatedName("ib.a(IIII)V")
	public void transPlotSprite(int arg0, int arg1, int arg2) {
		int var4 = arg2 + xof;
		int var5 = arg1 + yof;
		int var6 = var4 + var5 * Pix2D.width;
		int var7 = 0;
		int var8 = hi;
		int var9 = wi;
		int var10 = Pix2D.width - var9;
		int var11 = 0;
		if (var5 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - var5;
			var8 -= var12;
			var5 = Pix2D.clipMinY;
			var7 = var12 * var9;
			var6 += var12 * Pix2D.width;
		}
		if (var5 + var8 > Pix2D.clipMaxY) {
			var8 -= var5 + var8 - Pix2D.clipMaxY;
		}
		if (var4 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - var4;
			var9 -= var13;
			var4 = Pix2D.clipMinX;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.clipMaxX) {
			int var14 = var4 + var9 - Pix2D.clipMaxX;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			tranSprite(var7, var6, var8, Pix2D.pixels, data, var10, var11, var9);
		}
	}

	@ObfuscatedName("ib.a(IIII[I[IIIIIZ)V")
	public void tranSprite(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7) {
		for (int var9 = -arg2; var9 < 0; var9++) {
			for (int var10 = -arg7; var10 < 0; var10++) {
				int var11 = arg4[arg0++];
				if (var11 == 0) {
					arg1++;
				} else {
					int var12 = arg3[arg1];
					arg3[arg1++] = ((var11 & 0xFF00FF) * 128 + (var12 & 0xFF00FF) * 128 & 0xFF00FF00) + ((var11 & 0xFF00) * 128 + (var12 & 0xFF00) * 128 & 0xFF0000) >> 8;
				}
			}
			arg1 += arg5;
			arg0 += arg6;
		}
	}

	@ObfuscatedName("ib.a([IIIIII[IIIII)V")
	public void scanlineRotatePlotSprite(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg5 / 2;
			int var13 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
			int var15 = var13 * arg3 >> 8;
			int var16 = var14 * arg3 >> 8;
			int var17 = (arg8 << 16) + var12 * var15 + var11 * var16;
			int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
			int var19 = arg9 + arg1 * Pix2D.width;
			for (int var20 = 0; var20 < arg5; var20++) {
				int var21 = arg0[var20];
				int var22 = var19 + var21;
				int var23 = var17 + var16 * var21;
				int var24 = var18 - var15 * var21;
				for (int var25 = -arg6[var20]; var25 < 0; var25++) {
					Pix2D.pixels[var22++] = data[(var23 >> 16) + (var24 >> 16) * wi];
					var23 += var16;
					var24 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += Pix2D.width;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("ib.a(ILjb;ZI)V")
	public void scanlinePlotSprite(int arg0, Pix8 arg1, int arg2) {
		int var4 = arg0 + xof;
		int var5 = arg2 + yof;
		int var6 = var4 + var5 * Pix2D.width;
		int var7 = 0;
		int var8 = hi;
		int var9 = wi;
		int var10 = Pix2D.width - var9;
		int var11 = 0;
		if (var5 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - var5;
			var8 -= var12;
			var5 = Pix2D.clipMinY;
			var7 = var12 * var9;
			var6 += var12 * Pix2D.width;
		}
		if (var5 + var8 > Pix2D.clipMaxY) {
			var8 -= var5 + var8 - Pix2D.clipMaxY;
		}
		if (var4 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - var4;
			var9 -= var13;
			var4 = Pix2D.clipMinX;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.clipMaxX) {
			int var14 = var4 + var9 - Pix2D.clipMaxX;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			plotScanline(var7, var6, var11, arg1.data, var9, var10, var8, data, Pix2D.pixels);
		}
	}

	@ObfuscatedName("ib.a(III[BIIII[IZ[I)V")
	public void plotScanline(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
		int var10 = -(arg4 >> 2);
		int var11 = -(arg4 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				int var14 = arg7[arg0++];
				if (var14 != 0 && arg3[arg1] == 0) {
					arg8[arg1++] = var14;
				} else {
					arg1++;
				}
				int var15 = arg7[arg0++];
				if (var15 != 0 && arg3[arg1] == 0) {
					arg8[arg1++] = var15;
				} else {
					arg1++;
				}
				int var16 = arg7[arg0++];
				if (var16 != 0 && arg3[arg1] == 0) {
					arg8[arg1++] = var16;
				} else {
					arg1++;
				}
				int var17 = arg7[arg0++];
				if (var17 != 0 && arg3[arg1] == 0) {
					arg8[arg1++] = var17;
				} else {
					arg1++;
				}
			}
			for (int var18 = var11; var18 < 0; var18++) {
				int var19 = arg7[arg0++];
				if (var19 != 0 && arg3[arg1] == 0) {
					arg8[arg1++] = var19;
				} else {
					arg1++;
				}
			}
			arg1 += arg5;
			arg0 += arg2;
		}
	}

	@ObfuscatedName("ib.a([I[IIIIIIII)V")
	public void plot(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				int var13 = arg1[arg2++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var13;
				}
				int var14 = arg1[arg2++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var14;
				}
				int var15 = arg1[arg2++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var15;
				}
				int var16 = arg1[arg2++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var16;
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				int var18 = arg1[arg2++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var18;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("ib.a(IDIIIIBII)V")
	public void rotatePlotSprite(double arg0, int arg1, int arg2) {
		if (field663 != 8) {
			field661 = -392;
		}
		try {
			int var5 = (int) (Math.sin(arg0) * 65536.0D);
			int var6 = (int) (Math.cos(arg0) * 65536.0D);
			int var7 = var5 * 256 >> 8;
			int var8 = var6 * 256 >> 8;
			int var9 = var7 * -10 + var8 * -10 + 983040;
			int var10 = var8 * -10 + 983040 - var7 * -10;
			int var11 = arg1 + arg2 * Pix2D.width;
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = var11;
				int var14 = var9;
				int var15 = var10;
				for (int var16 = -20; var16 < 0; var16++) {
					int var17 = data[(var14 >> 16) + (var15 >> 16) * wi];
					if (var17 == 0) {
						var13++;
					} else {
						Pix2D.pixels[var13++] = var17;
					}
					var14 += var8;
					var15 -= var7;
				}
				var9 += var7;
				var10 += var8;
				var11 += Pix2D.width;
			}
		} catch (Exception var18) {
		}
	}
}
