package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("jb")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("jb.C")
	public byte[] data;

	@ObfuscatedName("jb.D")
	public final int[] bpal;

	@ObfuscatedName("jb.E")
	public int wi;

	@ObfuscatedName("jb.F")
	public int hi;

	@ObfuscatedName("jb.G")
	public int xof;

	@ObfuscatedName("jb.H")
	public int yof;

	@ObfuscatedName("jb.I")
	public int owi;

	@ObfuscatedName("jb.J")
	public int ohi;

	@ObfuscatedName("jb.z")
	public final boolean field672 = false;

	@ObfuscatedName("jb.A")
	public final boolean field673 = false;

	@ObfuscatedName("jb.B")
	public final int field674 = 9;

	public Pix8(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), 15787);
		Packet var5 = new Packet(arg0.read("index.dat", null), 15787);
		var5.pos = var4.g2();
		owi = var5.g2();
		ohi = var5.g2();
		int var6 = var5.g1();
		bpal = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			bpal[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		xof = var5.g1();
		yof = var5.g1();
		wi = var5.g2();
		hi = var5.g2();
		int var9 = var5.g1();
		int var10 = wi * hi;
		data = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				data[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < wi; var12++) {
				for (int var13 = 0; var13 < hi; var13++) {
					data[var12 + var13 * wi] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("jb.b(I)V")
	public void trim() {
		if (wi == owi && hi == ohi) {
			return;
		}
		byte[] var1 = new byte[owi * ohi];
		int var2 = 0;
		for (int var3 = 0; var3 < hi; var3++) {
			for (int var4 = 0; var4 < wi; var4++) {
				var1[var4 + xof + (var3 + yof) * owi] = data[var2++];
			}
		}
		data = var1;
		wi = owi;
		hi = ohi;
		xof = 0;
		yof = 0;
	}

	@ObfuscatedName("jb.a(IBII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < bpal.length; var4++) {
			int var5 = bpal[var4] >> 16 & 0xFF;
			int var6 = var5 + arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = bpal[var4] >> 8 & 0xFF;
			int var8 = var7 + arg1;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = bpal[var4] & 0xFF;
			int var10 = var9 + arg2;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			bpal[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}

	@ObfuscatedName("jb.a(IBI)V")
	public void plotSprite(int arg0, byte arg1, int arg2) {
		int var4 = arg2 + xof;
		int var5 = arg0 + yof;
		if (arg1 == 1) {
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
				plotSprite(var8, bpal, var6, Pix2D.pixels, var11, var10, data, var9, var7);
			}
		}
	}

	@ObfuscatedName("jb.a(I[II[IIIB[BII)V")
	public void plotSprite(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		int var10 = -(arg7 >> 2);
		int var11 = -(arg7 & 0x3);
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				byte var14 = arg6[arg8++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg3[arg2++] = arg1[var14 & 0xFF];
				}
				byte var15 = arg6[arg8++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg3[arg2++] = arg1[var15 & 0xFF];
				}
				byte var16 = arg6[arg8++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg3[arg2++] = arg1[var16 & 0xFF];
				}
				byte var17 = arg6[arg8++];
				if (var17 == 0) {
					arg2++;
				} else {
					arg3[arg2++] = arg1[var17 & 0xFF];
				}
			}
			for (int var18 = var11; var18 < 0; var18++) {
				byte var19 = arg6[arg8++];
				if (var19 == 0) {
					arg2++;
				} else {
					arg3[arg2++] = arg1[var19 & 0xFF];
				}
			}
			arg2 += arg5;
			arg8 += arg4;
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void halveSize() {
		owi /= 2;
		ohi /= 2;
		byte[] var1 = new byte[owi * ohi];
		int var2 = 0;
		for (int var3 = 0; var3 < hi; var3++) {
			for (int var4 = 0; var4 < wi; var4++) {
				var1[(var4 + xof >> 1) + (var3 + yof >> 1) * owi] = data[var2++];
			}
		}
		data = var1;
		wi = owi;
		hi = ohi;
		xof = 0;
		yof = 0;
	}

	@ObfuscatedName("jb.c(I)V")
	public void hflip() {
		byte[] var1 = new byte[wi * hi];
		int var2 = 0;
		for (int var3 = 0; var3 < hi; var3++) {
			for (int var4 = wi - 1; var4 >= 0; var4--) {
				var1[var2++] = data[var4 + var3 * wi];
			}
		}
		data = var1;
		xof = owi - wi - xof;
	}

	@ObfuscatedName("jb.d(I)V")
	public void vflip() {
		byte[] var1 = new byte[wi * hi];
		int var2 = 0;
		for (int var3 = hi - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < wi; var4++) {
				var1[var2++] = data[var4 + var3 * wi];
			}
		}
		data = var1;
		yof = ohi - hi - yof;
	}
}
