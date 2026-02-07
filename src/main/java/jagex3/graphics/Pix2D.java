package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;

@ObfuscatedName("ub")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("ub.I")
	public static int clipMinY = 0;

	@ObfuscatedName("ub.L")
	public static int clipMaxY = 0;

	@ObfuscatedName("ub.K")
	public static int clipMinX = 0;

	@ObfuscatedName("ub.N")
	public static int clipMaxX = 0;

	@ObfuscatedName("ub.H")
	public static int height;

	@ObfuscatedName("ub.M")
	public static int width;

	@ObfuscatedName("ub.J")
	public static int[] pixels;

	@ObfuscatedName("ub.a([III)V")
	public static void setPixels(int[] arg0, int arg1, int arg2) {
		pixels = arg0;
		width = arg1;
		height = arg2;
		setClipping(0, 0, arg1, arg2);
	}

	@ObfuscatedName("ub.a(IIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < clipMinX) {
			arg2 -= clipMinX - arg0;
			arg0 = clipMinX;
		}
		if (arg1 < clipMinY) {
			arg3 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg0 + arg2 > clipMaxX) {
			arg2 = clipMaxX - arg0;
		}
		if (arg1 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg1;
		}
		int var5 = width - arg2;
		int var6 = arg0 + arg1 * width;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				pixels[var6++] = arg4;
			}
			var6 += var5;
		}
	}

	@ObfuscatedName("ub.a()V")
	public static void cls() {
		int var0 = 0;
		int var1 = width * height - 7;
		while (var0 < var1) {
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
		}
		var1 += 7;
		while (var0 < var1) {
			pixels[var0++] = 0;
		}
	}

	@ObfuscatedName("ub.b(IIIII)V")
	public static void line(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2 - arg0;
		int var6 = arg3 - arg1;
		if (var6 == 0) {
			if (var5 >= 0) {
				hline(arg0, arg1, var5 + 1, arg4);
			} else {
				hline(arg0 + var5, arg1, 1 - var5, arg4);
			}
		} else if (var5 != 0) {
			if (var5 + var6 < 0) {
				arg0 += var5;
				var5 = -var5;
				arg1 += var6;
				var6 = -var6;
			}
			if (var5 > var6) {
				int var7 = arg1 << 16;
				int var8 = var7 + 32768;
				int var9 = var6 << 16;
				int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
				int var11 = var5 + arg0;
				if (arg0 < clipMinX) {
					var8 += var10 * (clipMinX - arg0);
					arg0 = clipMinX;
				}
				if (var11 >= clipMaxX) {
					var11 = clipMaxX - 1;
				}
				while (arg0 <= var11) {
					int var12 = var8 >> 16;
					if (var12 >= clipMinY && var12 < clipMaxY) {
						pixels[arg0 + var12 * width] = arg4;
					}
					var8 += var10;
					arg0++;
				}
			} else {
				int var13 = arg0 << 16;
				int var14 = var13 + 32768;
				int var15 = var5 << 16;
				int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
				int var17 = var6 + arg1;
				if (arg1 < clipMinY) {
					var14 += var16 * (clipMinY - arg1);
					arg1 = clipMinY;
				}
				if (var17 >= clipMaxY) {
					var17 = clipMaxY - 1;
				}
				while (arg1 <= var17) {
					int var18 = var14 >> 16;
					if (var18 >= clipMinX && var18 < clipMaxX) {
						pixels[var18 + arg1 * width] = arg4;
					}
					var14 += var16;
					arg1++;
				}
			}
		} else if (var6 >= 0) {
			vline(arg0, arg1, var6 + 1, arg4);
		} else {
			vline(arg0, arg1 + var6, -var6 + 1, arg4);
		}
	}

	@ObfuscatedName("ub.b()V")
	public static void resetClipping() {
		clipMinX = 0;
		clipMinY = 0;
		clipMaxX = width;
		clipMaxY = height;
	}

	@ObfuscatedName("ub.a(IIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < clipMinX) {
			arg2 -= clipMinX - arg0;
			arg0 = clipMinX;
		}
		if (arg1 < clipMinY) {
			arg3 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg0 + arg2 > clipMaxX) {
			arg2 = clipMaxX - arg0;
		}
		if (arg1 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg1;
		}
		int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		int var7 = 256 - arg5;
		int var8 = width - arg2;
		int var9 = arg0 + arg1 * width;
		for (int var10 = 0; var10 < arg3; var10++) {
			for (int var11 = -arg2; var11 < 0; var11++) {
				int var12 = pixels[var9];
				int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
				pixels[var9++] = var6 + var13;
			}
			var9 += var8;
		}
	}

	@ObfuscatedName("ub.c(IIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg0, arg1, arg2, arg4);
		hline(arg0, arg1 + arg3 - 1, arg2, arg4);
		vline(arg0, arg1, arg3, arg4);
		vline(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@ObfuscatedName("ub.b(IIIIII)V")
	public static void fillRectVGrad(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 0;
		if (arg0 < clipMinX) {
			arg2 -= clipMinX - arg0;
			arg0 = clipMinX;
		}
		if (clipMinY > 0) {
			var6 = clipMinY * 2849;
			arg3 = 23 - clipMinY;
			arg1 = clipMinY;
		}
		if (arg0 + arg2 > clipMaxX) {
			arg2 = clipMaxX - arg0;
		}
		if (arg1 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg1;
		}
		int var7 = width - arg2;
		int var8 = arg0 + arg1 * width;
		for (int var9 = -arg3; var9 < 0; var9++) {
			int var10 = 65536 - var6 >> 8;
			int var11 = var6 >> 8;
			int var12 = ((arg4 & 0xFF00FF) * var10 + (arg5 & 0xFF00FF) * var11 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (arg5 & 0xFF00) * var11 & 0xFF0000) >>> 8;
			for (int var13 = -arg2; var13 < 0; var13++) {
				pixels[var8++] = var12;
			}
			var8 += var7;
			var6 += 2849;
		}
	}

	@ObfuscatedName("ub.a(IIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < clipMinX || arg0 >= clipMaxX) {
			return;
		}
		if (arg1 < clipMinY) {
			arg2 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg1 + arg2 > clipMaxY) {
			arg2 = clipMaxY - arg1;
		}
		int var4 = arg0 + arg1 * width;
		for (int var5 = 0; var5 < arg2; var5++) {
			pixels[var4 + var5 * width] = arg3;
		}
	}

	@ObfuscatedName("ub.a([I)V")
	public static void restoreClipping(int[] arg0) {
		clipMinX = arg0[0];
		clipMinY = arg0[1];
		clipMaxX = arg0[2];
		clipMaxY = arg0[3];
	}

	@ObfuscatedName("ub.d(IIIII)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < clipMinY || arg1 >= clipMaxY) {
			return;
		}
		if (arg0 < clipMinX) {
			arg2 -= clipMinX - arg0;
			arg0 = clipMinX;
		}
		if (arg0 + arg2 > clipMaxX) {
			arg2 = clipMaxX - arg0;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg0 + arg1 * width;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			pixels[var9++] = var14;
		}
	}

	@ObfuscatedName("ub.b(IIII)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < clipMinY || arg1 >= clipMaxY) {
			return;
		}
		if (arg0 < clipMinX) {
			arg2 -= clipMinX - arg0;
			arg0 = clipMinX;
		}
		if (arg0 + arg2 > clipMaxX) {
			arg2 = clipMaxX - arg0;
		}
		int var4 = arg0 + arg1 * width;
		for (int var5 = 0; var5 < arg2; var5++) {
			pixels[var4 + var5] = arg3;
		}
	}

	@ObfuscatedName("ub.c(IIII)V")
	public static void setSubClipping(int arg0, int arg1, int arg2, int arg3) {
		if (clipMinX < arg0) {
			clipMinX = arg0;
		}
		if (clipMinY < arg1) {
			clipMinY = arg1;
		}
		if (clipMaxX > arg2) {
			clipMaxX = arg2;
		}
		if (clipMaxY > arg3) {
			clipMaxY = arg3;
		}
	}

	@ObfuscatedName("ub.d(IIII)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > width) {
			arg2 = width;
		}
		if (arg3 > height) {
			arg3 = height;
		}
		clipMinX = arg0;
		clipMinY = arg1;
		clipMaxX = arg2;
		clipMaxY = arg3;
	}

	@ObfuscatedName("ub.e(IIIII)V")
	public static void vlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < clipMinX || arg0 >= clipMaxX) {
			return;
		}
		if (arg1 < clipMinY) {
			arg2 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg1 + arg2 > clipMaxY) {
			arg2 = clipMaxY - arg1;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg0 + arg1 * width;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			pixels[var9] = var14;
			var9 += width;
		}
	}

	@ObfuscatedName("ub.c(IIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		hlineTrans(arg0, arg1, arg2, arg4, arg5);
		hlineTrans(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			vlineTrans(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			vlineTrans(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@ObfuscatedName("ub.a(III[I[I)V")
	public static void fillScanLine(int arg0, int arg1, int[] arg2, int[] arg3) {
		int var4 = arg0 + arg1 * width;
		for (int var5 = 0; var5 < arg2.length; var5++) {
			int var6 = var4 + arg2[var5];
			for (int var7 = -arg3[var5]; var7 < 0; var7++) {
				pixels[var6++] = 0;
			}
			var4 += width;
		}
	}

	@ObfuscatedName("ub.b([I)V")
	public static void saveClipping(int[] arg0) {
		arg0[0] = clipMinX;
		arg0[1] = clipMinY;
		arg0[2] = clipMaxX;
		arg0[3] = clipMaxY;
	}
}
