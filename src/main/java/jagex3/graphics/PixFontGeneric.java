package jagex3.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("nf")
public final class PixFontGeneric extends PixFont {

	public PixFontGeneric(byte[] arg0) {
		super(arg0);
	}

	public PixFontGeneric(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("nf.b([BIIIII)V")
	@Override
	public void plotLetterScanline(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * Pix2D.width;
		int var8 = Pix2D.width - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - arg2;
			arg4 -= var11;
			arg2 = Pix2D.clipMinY;
			var10 = var11 * arg3;
			var7 += var11 * Pix2D.width;
		}
		if (arg2 + arg4 > Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - arg1;
			arg3 -= var12;
			arg1 = Pix2D.clipMinX;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 > Pix2D.clipMaxX) {
			int var13 = arg1 + arg3 - Pix2D.clipMaxX;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			PixFont.plot(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("nf.a([BIIIIII)V")
	@Override
	public void plotLetterTransScanline(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 * Pix2D.width;
		int var9 = Pix2D.width - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - arg2;
			arg4 -= var12;
			arg2 = Pix2D.clipMinY;
			var11 = var12 * arg3;
			var8 += var12 * Pix2D.width;
		}
		if (arg2 + arg4 > Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg1;
			arg3 -= var13;
			arg1 = Pix2D.clipMinX;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg1 + arg3 > Pix2D.clipMaxX) {
			int var14 = arg1 + arg3 - Pix2D.clipMaxX;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			PixFont.plotTrans(Pix2D.pixels, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
		}
	}
}
