package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.dash3d.Pix3D;

@ObfuscatedName("gf")
public final class Pix2D {

	@ObfuscatedName("gf.a")
	public static int[] pixels;

	@ObfuscatedName("gf.b")
	public static int clipMinX = 0;

	@ObfuscatedName("gf.c")
	public static int width;

	@ObfuscatedName("gf.d")
	public static int clipMinY = 0;

	@ObfuscatedName("gf.e")
	public static int clipMaxY = 0;

	@ObfuscatedName("gf.f")
	public static int clipMaxX = 0;

	@ObfuscatedName("gf.g")
	public static int height;

	@ObfuscatedName("gf.a(IIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg0, arg1, arg2, arg4);
		hline(arg0, arg1 + arg3 - 1, arg2, arg4);
		vline(arg0, arg1, arg3, arg4);
		vline(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@ObfuscatedName("gf.b(IIIII)V")
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

	@ObfuscatedName("gf.c(IIIII)V")
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

	@ObfuscatedName("gf.a()V")
	public static void resetClipping() {
		clipMinX = 0;
		clipMinY = 0;
		clipMaxX = width;
		clipMaxY = height;
	}

	@ObfuscatedName("gf.a(IIII)V")
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

	@ObfuscatedName("gf.b()V")
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

	@ObfuscatedName("gf.a(IIIIII)V")
	public static void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

	@ObfuscatedName("gf.d(IIIII)V")
	public static void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 == 256) {
			method498(arg0, arg1, arg2, arg3);
			return;
		}
		int var5 = 256 - arg4;
		int var6 = arg4 * 255;
		int var7 = arg4 * 255;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg1 - arg2;
		if (var9 < clipMinY) {
			var9 = clipMinY;
		}
		int var10 = arg1 + arg2 + 1;
		if (var10 > clipMaxY) {
			var10 = clipMaxY;
		}
		int var11 = var9;
		int var12 = arg2 * arg2;
		int var13 = 0;
		int var14 = arg1 - var9;
		int var15 = var14 * var14;
		int var16 = var15 - var14;
		if (arg1 > var10) {
			arg1 = var10;
		}
		while (var11 < arg1) {
			while (var16 <= var12 || var15 <= var12) {
				var15 += var13 + var13;
				var16 += var13++ + var13;
			}
			int var17 = arg0 + 1 - var13;
			if (var17 < clipMinX) {
				var17 = clipMinX;
			}
			int var18 = arg0 + var13;
			if (var18 > clipMaxX) {
				var18 = clipMaxX;
			}
			int var19 = var17 + var11 * width;
			for (int var20 = var17; var20 < var18; var20++) {
				int var21 = (pixels[var19] >> 16 & 0xFF) * var5;
				int var22 = (pixels[var19] >> 8 & 0xFF) * var5;
				int var23 = (pixels[var19] & 0xFF) * var5;
				int var24 = (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8) + (var8 + var23 >> 8);
				pixels[var19++] = var24;
			}
			var11++;
			var15 -= var14-- + var14;
			var16 -= var14 + var14;
		}
		int var25 = arg2;
		int var26 = -var14;
		int var27 = var26 * var26 + var12;
		int var28 = var27 - arg2;
		int var29 = var27 - var26;
		while (var11 < var10) {
			while (var29 > var12 && var28 > var12) {
				var29 -= var25-- + var25;
				var28 -= var25 + var25;
			}
			int var30 = arg0 - var25;
			if (var30 < clipMinX) {
				var30 = clipMinX;
			}
			int var31 = arg0 + var25;
			if (var31 > clipMaxX - 1) {
				var31 = clipMaxX - 1;
			}
			int var32 = var30 + var11 * width;
			for (int var33 = var30; var33 <= var31; var33++) {
				int var34 = (pixels[var32] >> 16 & 0xFF) * var5;
				int var35 = (pixels[var32] >> 8 & 0xFF) * var5;
				int var36 = (pixels[var32] & 0xFF) * var5;
				int var37 = (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8) + (var8 + var36 >> 8);
				pixels[var32++] = var37;
			}
			var11++;
			var29 += var26 + var26;
			var28 += var26++ + var26;
		}
	}

	@ObfuscatedName("gf.b(IIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		hlineTrans(arg0, arg1, arg2, arg4, arg5);
		hlineTrans(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			vlineTrans(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			vlineTrans(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@ObfuscatedName("gf.c(IIIIII)V")
	public static void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 - arg0;
		int var7 = arg3 - arg1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}
		if (var10 == 0) {
			return;
		}
		int var11 = (var6 << 16) / var10;
		int var12 = (var7 << 16) / var10;
		if (var12 <= var11) {
			var11 = -var11;
		} else {
			var12 = -var12;
		}
		int var13 = arg5 * var12 >> 17;
		int var14 = arg5 * var12 + 1 >> 17;
		int var15 = arg5 * var11 >> 17;
		int var16 = arg5 * var11 + 1 >> 17;
		int var17 = arg0 - Pix3D.getClipX();
		int var18 = arg1 - Pix3D.getClipY();
		int var19 = var17 + var13;
		int var20 = var17 - var14;
		int var21 = var17 + var6 - var14;
		int var22 = var17 + var6 + var13;
		int var23 = var18 + var15;
		int var24 = var18 - var16;
		int var25 = var18 + var7 - var16;
		int var26 = var18 + var7 + var15;
		Pix3D.setHClip(var19, var20, var21);
		Pix3D.flatTriangle(var23, var24, var25, var19, var20, var21, arg4);
		Pix3D.setHClip(var19, var21, var22);
		Pix3D.flatTriangle(var23, var25, var26, var19, var21, var22, arg4);
	}

	@ObfuscatedName("gf.a([I)V")
	public static void saveClipping(int[] arg0) {
		arg0[0] = clipMinX;
		arg0[1] = clipMinY;
		arg0[2] = clipMaxX;
		arg0[3] = clipMaxY;
	}

	@ObfuscatedName("gf.b(IIII)V")
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

	@ObfuscatedName("gf.e(IIIII)V")
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

	@ObfuscatedName("gf.c(IIII)V")
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

	@ObfuscatedName("gf.f(IIIII)V")
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

	@ObfuscatedName("gf.a(III[I[I)V")
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

	@ObfuscatedName("gf.d(IIII)V")
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

	@ObfuscatedName("gf.b([I)V")
	public static void restoreClipping(int[] arg0) {
		clipMinX = arg0[0];
		clipMinY = arg0[1];
		clipMaxX = arg0[2];
		clipMaxY = arg0[3];
	}

	@ObfuscatedName("gf.a(III)V")
	public static void method495(int arg0, int arg1, int arg2) {
		if (arg0 >= clipMinX && arg1 >= clipMinY && arg0 < clipMaxX && arg1 < clipMaxY) {
			pixels[arg0 + arg1 * width] = arg2;
		}
	}

	@ObfuscatedName("gf.a([III)V")
	public static void setPixels(int[] arg0, int arg1, int arg2) {
		pixels = arg0;
		width = arg1;
		height = arg2;
		setClipping(0, 0, arg1, arg2);
	}

	@ObfuscatedName("gf.d(IIIIII)V")
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

	@ObfuscatedName("gf.e(IIII)V")
	public static void method498(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 == 0) {
			method495(arg0, arg1, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		int var4 = arg1 - arg2;
		if (var4 < clipMinY) {
			var4 = clipMinY;
		}
		int var5 = arg1 + arg2 + 1;
		if (var5 > clipMaxY) {
			var5 = clipMaxY;
		}
		int var6 = var4;
		int var7 = arg2 * arg2;
		int var8 = 0;
		int var9 = arg1 - var4;
		int var10 = var9 * var9;
		int var11 = var10 - var9;
		if (arg1 > var5) {
			arg1 = var5;
		}
		while (var6 < arg1) {
			while (var11 <= var7 || var10 <= var7) {
				var10 += var8 + var8;
				var11 += var8++ + var8;
			}
			int var12 = arg0 + 1 - var8;
			if (var12 < clipMinX) {
				var12 = clipMinX;
			}
			int var13 = arg0 + var8;
			if (var13 > clipMaxX) {
				var13 = clipMaxX;
			}
			int var14 = var12 + var6 * width;
			for (int var15 = var12; var15 < var13; var15++) {
				pixels[var14++] = arg3;
			}
			var6++;
			var10 -= var9-- + var9;
			var11 -= var9 + var9;
		}
		int var16 = arg2;
		int var17 = var6 - arg1;
		int var18 = var17 * var17 + var7;
		int var19 = var18 - arg2;
		int var20 = var18 - var17;
		while (var6 < var5) {
			while (var20 > var7 && var19 > var7) {
				var20 -= var16-- + var16;
				var19 -= var16 + var16;
			}
			int var21 = arg0 - var16;
			if (var21 < clipMinX) {
				var21 = clipMinX;
			}
			int var22 = arg0 + var16;
			if (var22 > clipMaxX - 1) {
				var22 = clipMaxX - 1;
			}
			int var23 = var21 + var6 * width;
			for (int var24 = var21; var24 <= var22; var24++) {
				pixels[var23++] = arg3;
			}
			var6++;
			var20 += var17 + var17;
			var19 += var17++ + var17;
		}
	}
}
