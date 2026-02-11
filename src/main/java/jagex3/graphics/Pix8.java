package jagex3.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hb")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("hb.P")
	public int yof;

	@ObfuscatedName("hb.R")
	public int wi;

	@ObfuscatedName("hb.S")
	public int ohi;

	@ObfuscatedName("hb.U")
	public int owi;

	@ObfuscatedName("hb.V")
	public int xof;

	@ObfuscatedName("hb.X")
	public int hi;

	@ObfuscatedName("hb.O")
	public byte[] data;

	@ObfuscatedName("hb.Q")
	public int[] bpal;

	@ObfuscatedName("hb.a([I[B[IIIIIII)V")
	public static void plotSprite(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = -(arg5 >> 2);
		int var10 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				byte var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var13 & 0xFF];
				}
				byte var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var14 & 0xFF];
				}
				byte var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var15 & 0xFF];
				}
				byte var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var16 & 0xFF];
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				byte var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var18 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("hb.d()V")
	public void trim() {
		if (this.wi == this.owi && this.hi == this.ohi) {
			return;
		}
		byte[] var1 = new byte[this.owi * this.ohi];
		int var2 = 0;
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var1[var4 + this.xof + (var3 + this.yof) * this.owi] = this.data[var2++];
			}
		}
		this.data = var1;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("hb.b(II)V")
	public void plotSprite(int arg0, int arg1) {
		int var3 = arg0 + this.xof;
		int var4 = arg1 + this.yof;
		int var5 = var3 + var4 * Pix2D.width;
		int var6 = 0;
		int var7 = this.hi;
		int var8 = this.wi;
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
			plotSprite(Pix2D.pixels, this.data, this.bpal, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("hb.b(III)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.bpal.length; var4++) {
			int var5 = this.bpal[var4] >> 16 & 0xFF;
			int var6 = var5 + arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.bpal[var4] >> 8 & 0xFF;
			int var8 = var7 + arg1;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.bpal[var4] & 0xFF;
			int var10 = var9 + arg2;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.bpal[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}
}
