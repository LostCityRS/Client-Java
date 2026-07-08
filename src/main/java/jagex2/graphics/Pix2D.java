package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;

@ObfuscatedName("gb")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("gb.o")
	public static int[] pixels;

	@ObfuscatedName("gb.p")
	public static int width;

	@ObfuscatedName("gb.q")
	public static int height;

	@ObfuscatedName("gb.r")
	public static int clipMinY;

	@ObfuscatedName("gb.s")
	public static int clipMaxY;

	@ObfuscatedName("gb.t")
	public static int clipMinX;

	@ObfuscatedName("gb.u")
	public static int clipMaxX;

	@ObfuscatedName("gb.i")
	public static final int field614 = 1623;

	@ObfuscatedName("gb.j")
	public static boolean field615;

	@ObfuscatedName("gb.k")
	public static final boolean field616 = true;

	@ObfuscatedName("gb.l")
	public static final byte field617 = 8;

	@ObfuscatedName("gb.m")
	public static final int field618 = 1;

	@ObfuscatedName("gb.n")
	public static final byte field619 = 35;

	@ObfuscatedName("gb.v")
	public static int sizeX;

	@ObfuscatedName("gb.w")
	public static int maxX;

	@ObfuscatedName("gb.x")
	public static int maxY;

	@ObfuscatedName("gb.a(I[III)V")
	public static void setPixels(int[] arg0, int arg1, int arg2) {
		pixels = arg0;
		width = arg1;
		height = arg2;
		setClipping(field617, arg2, arg1, 0, 0);
	}

	@ObfuscatedName("gb.a(B)V")
	public static void resetClipping() {
		clipMinX = 0;
		clipMinY = 0;
		clipMaxX = width;
		clipMaxY = height;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
	}

	@ObfuscatedName("gb.a(BIIII)V")
	public static void setClipping(byte arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg2 > width) {
			arg2 = width;
		}
		if (arg1 > height) {
			arg1 = height;
		}
		clipMinX = arg4;
		clipMinY = arg3;
		if (arg0 == 8) {
			clipMaxX = arg2;
			clipMaxY = arg1;
			sizeX = clipMaxX - 1;
			maxX = clipMaxX / 2;
			maxY = clipMaxY / 2;
		}
	}

	@ObfuscatedName("gb.b(B)V")
	public static void cls() {
		int var0 = width * height;
		for (int var1 = 0; var1 < var0; var1++) {
			pixels[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIIIIZ)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < clipMinX) {
			arg4 -= clipMinX - arg5;
			arg5 = clipMinX;
		}
		if (arg0 < clipMinY) {
			arg1 -= clipMinY - arg0;
			arg0 = clipMinY;
		}
		if (arg5 + arg4 > clipMaxX) {
			arg4 = clipMaxX - arg5;
		}
		if (arg0 + arg1 > clipMaxY) {
			arg1 = clipMaxY - arg0;
		}
		int var6 = 256 - arg2;
		int var7 = (arg3 >> 16 & 0xFF) * arg2;
		int var8 = (arg3 >> 8 & 0xFF) * arg2;
		int var9 = (arg3 & 0xFF) * arg2;
		int var10 = width - arg4;
		int var11 = arg5 + arg0 * width;
		for (int var12 = 0; var12 < arg1; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (pixels[var11] >> 16 & 0xFF) * var6;
				int var15 = (pixels[var11] >> 8 & 0xFF) * var6;
				int var16 = (pixels[var11] & 0xFF) * var6;
				int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
				pixels[var11++] = var17;
			}
			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < clipMinX) {
			arg4 -= clipMinX - arg3;
			arg3 = clipMinX;
		}
		if (arg1 < clipMinY) {
			arg2 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg3 + arg4 > clipMaxX) {
			arg4 = clipMaxX - arg3;
		}
		if (arg1 + arg2 > clipMaxY) {
			arg2 = clipMaxY - arg1;
		}
		int var5 = width - arg4;
		int var6 = arg3 + arg1 * width;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				pixels[var6++] = arg0;
			}
			var6 += var5;
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg1, arg0, arg2, arg3);
		hline(arg1, arg0, arg2, arg3 + arg4 - 1);
		vline(arg3, arg0, arg2, arg4);
		if (field618 > 1 || field618 < 1) {
			field615 = !field615;
		}
		vline(arg3, arg0 + arg1 - 1, arg2, arg4);
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		hlineTrans(arg2, arg1, arg4, arg5, arg3);
		hlineTrans(arg2, arg1, arg4, arg5 + arg0 - 1, arg3);
		if (arg0 >= 3) {
			vlineTrans(arg0 - 2, arg1, arg5 + 1, arg4, arg2);
			vlineTrans(arg0 - 2, arg1, arg5 + 1, arg4, arg2 + arg3 - 1);
		}
	}

	@ObfuscatedName("gb.a(IIIZI)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < clipMinY || arg3 >= clipMaxY) {
			return;
		}
		if (arg1 < clipMinX) {
			arg0 -= clipMinX - arg1;
			arg1 = clipMinX;
		}
		if (arg1 + arg0 > clipMaxX) {
			arg0 = clipMaxX - arg1;
		}
		int var4 = arg1 + arg3 * width;
		for (int var5 = 0; var5 < arg0; var5++) {
			pixels[var4 + var5] = arg2;
		}
	}

	@ObfuscatedName("gb.c(IIIIII)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < clipMinY || arg3 >= clipMaxY) {
			return;
		}
		if (arg0 < clipMinX) {
			arg4 -= clipMinX - arg0;
			arg0 = clipMinX;
		}
		if (arg0 + arg4 > clipMaxX) {
			arg4 = clipMaxX - arg0;
		}
		int var5 = 256 - arg2;
		int var6 = (arg1 >> 16 & 0xFF) * arg2;
		int var7 = (arg1 >> 8 & 0xFF) * arg2;
		int var8 = (arg1 & 0xFF) * arg2;
		int var9 = arg0 + arg3 * width;
		for (int var10 = 0; var10 < arg4; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			pixels[var9++] = var14;
		}
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < clipMinX || arg1 >= clipMaxX) {
			return;
		}
		if (arg0 < clipMinY) {
			arg3 -= clipMinY - arg0;
			arg0 = clipMinY;
		}
		if (arg0 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg0;
		}
		int var4 = arg1 + arg0 * width;
		for (int var5 = 0; var5 < arg3; var5++) {
			pixels[var4 + var5 * width] = arg2;
		}
	}

	@ObfuscatedName("gb.d(IIIIII)V")
	public static void vlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < clipMinX || arg4 >= clipMaxX) {
			return;
		}
		if (arg2 < clipMinY) {
			arg0 -= clipMinY - arg2;
			arg2 = clipMinY;
		}
		if (arg2 + arg0 > clipMaxY) {
			arg0 = clipMaxY - arg2;
		}
		int var5 = 256 - arg3;
		int var6 = (arg1 >> 16 & 0xFF) * arg3;
		int var7 = (arg1 >> 8 & 0xFF) * arg3;
		int var8 = (arg1 & 0xFF) * arg3;
		int var9 = arg4 + arg2 * width;
		for (int var10 = 0; var10 < arg0; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			pixels[var9] = var14;
			var9 += width;
		}
	}
}
