package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("hb")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("hb.p")
	public static int[] data;

	@ObfuscatedName("hb.q")
	public static int width2d;

	@ObfuscatedName("hb.r")
	public static int height2d;

	@ObfuscatedName("hb.s")
	public static int top;

	@ObfuscatedName("hb.t")
	public static int bottom;

	@ObfuscatedName("hb.u")
	public static int left;

	@ObfuscatedName("hb.v")
	public static int right;

	@ObfuscatedName("hb.w")
	public static int safeWidth;

	@ObfuscatedName("hb.x")
	public static int centerX2d;

	@ObfuscatedName("hb.y")
	public static int centerY2d;

	@ObfuscatedName("hb.a(II[II)V")
	public static void bind(int arg0, int[] arg2, int arg3) {
		data = arg2;
		width2d = arg0;
		height2d = arg3;
		setBounds(arg0, arg3, 0, 0);
	}

	@ObfuscatedName("hb.a(B)V")
	public static void resetBounds() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		safeWidth = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void setBounds(int arg0, int arg1, int arg3, int arg4) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg0 > width2d) {
			arg0 = width2d;
		}
		if (arg1 > height2d) {
			arg1 = height2d;
		}
		left = arg4;
		top = arg3;
		right = arg0;
		bottom = arg1;
		safeWidth = right - 1;
		centerX2d = right / 2;
		centerY2d = bottom / 2;
	}

	@ObfuscatedName("hb.a(Z)V")
	public static void clear() {
		int var1 = height2d * width2d;
		for (int var2 = 0; var2 < var1; var2++) {
			data[var2] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIIB)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < left) {
			arg3 -= left - arg5;
			arg5 = left;
		}
		if (arg0 < top) {
			arg2 -= top - arg0;
			arg0 = top;
		}
		if (arg3 + arg5 > right) {
			arg3 = right - arg5;
		}
		if (arg0 + arg2 > bottom) {
			arg2 = bottom - arg0;
		}
		int var7 = 256 - arg1;
		int var8 = (arg4 >> 16 & 0xFF) * arg1;
		int var9 = (arg4 >> 8 & 0xFF) * arg1;
		int var10 = (arg4 & 0xFF) * arg1;
		int var11 = width2d - arg3;
		int var12 = width2d * arg0 + arg5;
		for (int var13 = 0; var13 < arg2; var13++) {
			for (int var14 = -arg3; var14 < 0; var14++) {
				int var15 = (data[var12] >> 16 & 0xFF) * var7;
				int var16 = (data[var12] >> 8 & 0xFF) * var7;
				int var17 = (data[var12] & 0xFF) * var7;
				int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
				data[var12++] = var18;
			}
			var12 += var11;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void fillRect(int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < left) {
			arg2 -= left - arg4;
			arg4 = left;
		}
		if (arg5 < top) {
			arg3 -= top - arg5;
			arg5 = top;
		}
		if (arg2 + arg4 > right) {
			arg2 = right - arg4;
		}
		if (arg3 + arg5 > bottom) {
			arg3 = bottom - arg5;
		}
		int var6 = width2d - arg2;
		int var7 = width2d * arg5 + arg4;
		for (int var8 = -arg3; var8 < 0; var8++) {
			for (int var9 = -arg2; var9 < 0; var9++) {
				data[var7++] = arg1;
			}
			var7 += var6;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg5) {
		drawHorizontalLine(arg2, arg5, arg1, arg3);
		drawHorizontalLine(arg2, arg0 + arg5 - 1, arg1, arg3);
		drawVerticalLine(arg3, arg2, arg5, arg0);
		drawVerticalLine(arg1 + arg3 - 1, arg2, arg5, arg0);
	}

	@ObfuscatedName("hb.a(IIIIIZI)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		drawHorizontalLine(arg3, arg4, arg1, arg2, arg6);
		drawHorizontalLine(arg0 + arg3 - 1, arg4, arg1, arg2, arg6);
		if (arg0 >= 3) {
			drawVerticalLine(arg2, arg3 + 1, arg6, arg0 - 2, arg1);
			drawVerticalLine(arg2 + arg4 - 1, arg3 + 1, arg6, arg0 - 2, arg1);
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void drawHorizontalLine(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < top || arg1 >= bottom) {
			return;
		}
		if (arg3 < left) {
			arg2 -= left - arg3;
			arg3 = left;
		}
		if (arg2 + arg3 > right) {
			arg2 = right - arg3;
		}
		int var5 = width2d * arg1 + arg3;
		for (int var6 = 0; var6 < arg2; var6++) {
			data[var5 + var6] = arg0;
		}
	}

	@ObfuscatedName("hb.c(IIIIII)V")
	public static void drawHorizontalLine(int arg0, int arg1, int arg3, int arg4, int arg5) {
		if (arg0 < top || arg0 >= bottom) {
			return;
		}
		if (arg4 < left) {
			arg1 -= left - arg4;
			arg4 = left;
		}
		if (arg1 + arg4 > right) {
			arg1 = right - arg4;
		}
		int var6 = 256 - arg5;
		int var7 = (arg3 >> 16 & 0xFF) * arg5;
		int var8 = (arg3 >> 8 & 0xFF) * arg5;
		int var9 = (arg3 & 0xFF) * arg5;
		int var10 = width2d * arg0 + arg4;
		for (int var11 = 0; var11 < arg1; var11++) {
			int var12 = (data[var10] >> 16 & 0xFF) * var6;
			int var13 = (data[var10] >> 8 & 0xFF) * var6;
			int var14 = (data[var10] & 0xFF) * var6;
			int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
			data[var10++] = var15;
		}
	}

	@ObfuscatedName("hb.a(IIIIZ)V")
	public static void drawVerticalLine(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < left || arg0 >= right) {
			return;
		}
		if (arg2 < top) {
			arg3 -= top - arg2;
			arg2 = top;
		}
		if (arg2 + arg3 > bottom) {
			arg3 = bottom - arg2;
		}
		int var5 = width2d * arg2 + arg0;
		for (int var6 = 0; var6 < arg3; var6++) {
			data[width2d * var6 + var5] = arg1;
		}
	}

	@ObfuscatedName("hb.a(IIIIIB)V")
	public static void drawVerticalLine(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < left || arg0 >= right) {
			return;
		}
		if (arg1 < top) {
			arg3 -= top - arg1;
			arg1 = top;
		}
		if (arg1 + arg3 > bottom) {
			arg3 = bottom - arg1;
		}
		int var7 = 256 - arg2;
		int var8 = (arg4 >> 16 & 0xFF) * arg2;
		int var9 = (arg4 >> 8 & 0xFF) * arg2;
		int var10 = (arg4 & 0xFF) * arg2;
		int var11 = width2d * arg1 + arg0;
		for (int var12 = 0; var12 < arg3; var12++) {
			int var13 = (data[var11] >> 16 & 0xFF) * var7;
			int var14 = (data[var11] >> 8 & 0xFF) * var7;
			int var15 = (data[var11] & 0xFF) * var7;
			int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
			data[var11] = var16;
			var11 += width2d;
		}
	}
}
