package jagex3.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("mg")
public abstract class PixFont extends PixfontGeneric {

	@ObfuscatedName("mg.wb")
	public byte[][] glyphs = new byte[256][];

	public PixFont(byte[] arg0) {
		super(arg0);
	}

	public PixFont(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.glyphs = arg5;
	}

	@ObfuscatedName("hb.a(III[BIII[III)V")
	public static void plot(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			arg2 += arg6;
			arg8 += arg1;
		}
	}

	@ObfuscatedName("ih.a([IIBIII[BIIII)V")
	public static void plotTrans(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = (arg2 * (arg6 & 0xFF00FF) & 0xFF00FF00) + ((arg6 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		int var11 = 256 - arg2;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					int var14 = arg0[arg7];
					arg0[arg7++] = ((var11 * (var14 & 0xFF00FF) & 0xFF00FF00) + (var11 * (var14 & 0xFF00) & 0xFF0000) >> 8) + var10;
				}
			}
			arg7 += arg4;
			arg3 += arg9;
		}
	}

	@ObfuscatedName("mg.b(IIIIIII)V")
	@Override
	public final void plotLetterTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 * Pix2D.width + arg1;
		int var9 = 0;
		int var10 = Pix2D.width - arg3;
		int var11 = 0;
		if (Pix2D.clipMinY > arg2) {
			int var12 = Pix2D.clipMinY - arg2;
			arg2 = Pix2D.clipMinY;
			var11 = arg3 * var12;
			arg4 -= var12;
			var8 += var12 * Pix2D.width;
		}
		if (Pix2D.clipMaxY < arg2 + arg4) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg1;
			arg1 = Pix2D.clipMinX;
			var9 = var13;
			var10 += var13;
			var11 += var13;
			var8 += var13;
			arg3 -= var13;
		}
		if (Pix2D.clipMaxX < arg1 + arg3) {
			int var14 = arg3 + arg1 - Pix2D.clipMaxX;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			plotTrans(Pix2D.pixels, arg3, arg6, var11, var10, this.glyphs[arg0], arg5, var8, arg4, var9);
		}
	}

	@ObfuscatedName("mg.a(IIIIII)V")
	@Override
	public final void plotLetter(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.width - arg3;
		int var8 = Pix2D.width * arg2 + arg1;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - arg2;
			var10 = var11 * arg3;
			arg4 -= var11;
			var8 += Pix2D.width * var11;
			arg2 = Pix2D.clipMinY;
		}
		if (Pix2D.clipMaxY < arg2 + arg4) {
			arg4 -= arg4 + arg2 - Pix2D.clipMaxY;
		}
		if (Pix2D.clipMinX > arg1) {
			int var12 = Pix2D.clipMinX - arg1;
			var8 += var12;
			var9 = var12;
			var10 += var12;
			arg3 -= var12;
			var7 += var12;
			arg1 = Pix2D.clipMinX;
		}
		if (arg1 + arg3 > Pix2D.clipMaxX) {
			int var13 = arg1 + arg3 - Pix2D.clipMaxX;
			var7 += var13;
			arg3 -= var13;
			var9 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			plot(arg5, var9, var8, this.glyphs[arg0], arg3, arg4, var7, Pix2D.pixels, var10);
		}
	}
}
