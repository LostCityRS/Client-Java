package jagex3.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("rh")
public final class SoftwarePix8 extends Pix8 {

	@ObfuscatedName("rh.p")
	public byte[] data;

	@ObfuscatedName("rh.q")
	public final int[] bpal;

	@ObfuscatedName("rh.a([I[B[IIIIIIIIII)V")
	public static void method1339(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		int var12 = arg3;
		for (int var13 = -arg8; var13 < 0; var13++) {
			int var14 = (arg4 >> 16) * arg11;
			for (int var15 = -arg7; var15 < 0; var15++) {
				byte var16 = arg1[(arg3 >> 16) + var14];
				if (var16 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg2[var16 & 0xFF];
				}
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = var12;
			arg5 += arg6;
		}
	}

	@ObfuscatedName("rh.a([I[B[IIIIIIII)V")
	public static void method1340(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = 256 - arg9;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				byte var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					int var14 = arg2[var13 & 0xFF];
					int var15 = arg0[arg4];
					arg0[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var10 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("rh.b([I[B[IIIIIIII)V")
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

	public SoftwarePix8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
		super.owi = arg0;
		super.ohi = arg1;
		super.xof = arg2;
		super.yof = arg3;
		super.wi = arg4;
		super.hi = arg5;
		this.data = arg6;
		this.bpal = arg7;
	}

	@ObfuscatedName("rh.b(III)V")
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

	@ObfuscatedName("rh.a()V")
	public void trim() {
		if (super.wi == super.owi && super.hi == super.ohi) {
			return;
		}
		byte[] var1 = new byte[super.owi * super.ohi];
		int var2 = 0;
		for (int var3 = 0; var3 < super.hi; var3++) {
			for (int var4 = 0; var4 < super.wi; var4++) {
				var1[var4 + super.xof + (var3 + super.yof) * super.owi] = this.data[var2++];
			}
		}
		this.data = var1;
		super.wi = super.owi;
		super.hi = super.ohi;
		super.xof = 0;
		super.yof = 0;
	}

	@ObfuscatedName("rh.a(III)V")
	@Override
	public void method877(int arg0, int arg1, int arg2) {
		int var4 = arg0 + super.xof;
		int var5 = arg1 + super.yof;
		int var6 = var4 + var5 * Pix2D.width;
		int var7 = 0;
		int var8 = super.hi;
		int var9 = super.wi;
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
			method1340(Pix2D.pixels, this.data, this.bpal, var7, var6, var9, var8, var10, var11, arg2);
		}
	}

	@ObfuscatedName("rh.a(IIII)V")
	public void method1338(int arg0, int arg1, int arg2, int arg3) {
		int var5 = super.wi;
		int var6 = super.hi;
		int var7 = 0;
		int var8 = 0;
		int var9 = super.owi;
		int var10 = super.ohi;
		int var11 = (var9 << 16) / arg2;
		int var12 = (var10 << 16) / arg3;
		if (super.xof > 0) {
			int var13 = ((super.xof << 16) + var11 - 1) / var11;
			arg0 += var13;
			var7 = var13 * var11 - (super.xof << 16);
		}
		if (super.yof > 0) {
			int var14 = ((super.yof << 16) + var12 - 1) / var12;
			arg1 += var14;
			var8 = var14 * var12 - (super.yof << 16);
		}
		if (var5 < var9) {
			arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
		}
		if (var6 < var10) {
			arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		int var15 = arg0 + arg1 * Pix2D.width;
		int var16 = Pix2D.width - arg2;
		if (arg1 + arg3 > Pix2D.clipMaxY) {
			arg3 -= arg1 + arg3 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinY) {
			int var17 = Pix2D.clipMinY - arg1;
			arg3 -= var17;
			var15 += var17 * Pix2D.width;
			var8 += var12 * var17;
		}
		if (arg0 + arg2 > Pix2D.clipMaxX) {
			int var18 = arg0 + arg2 - Pix2D.clipMaxX;
			arg2 -= var18;
			var16 += var18;
		}
		if (arg0 < Pix2D.clipMinX) {
			int var19 = Pix2D.clipMinX - arg0;
			arg2 -= var19;
			var15 += var19;
			var7 += var11 * var19;
			var16 += var19;
		}
		method1339(Pix2D.pixels, this.data, this.bpal, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
	}

	@ObfuscatedName("rh.a(II)V")
	@Override
	public void plotSprite(int arg0, int arg1) {
		int var3 = arg0 + super.xof;
		int var4 = arg1 + super.yof;
		int var5 = var3 + var4 * Pix2D.width;
		int var6 = 0;
		int var7 = super.hi;
		int var8 = super.wi;
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
}
