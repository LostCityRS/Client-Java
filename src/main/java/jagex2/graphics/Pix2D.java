package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("hb")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("hb.k")
	public static int[] data;

	@ObfuscatedName("hb.l")
	public static int width2d;

	@ObfuscatedName("hb.m")
	public static int height2d;

	@ObfuscatedName("hb.n")
	public static int top;

	@ObfuscatedName("hb.o")
	public static int bottom;

	@ObfuscatedName("hb.p")
	public static int left;

	@ObfuscatedName("hb.q")
	public static int right;

	@ObfuscatedName("hb.r")
	public static int safeWidth;

	@ObfuscatedName("hb.s")
	public static int centerX2d;

	@ObfuscatedName("hb.t")
	public static int centerY2d;

	@ObfuscatedName("hb.a([IIII)V")
	public static void bind(int[] arg0, int arg2, int arg3) {
		data = arg0;
		width2d = arg2;
		height2d = arg3;
		setClipping(0, arg2, arg3, 0);
	}

	@ObfuscatedName("hb.a(Z)V")
	public static void resetClipping() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		safeWidth = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void setClipping(int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > width2d) {
			arg2 = width2d;
		}
		if (arg3 > height2d) {
			arg3 = height2d;
		}
		left = arg4;
		top = arg1;
		right = arg2;
		bottom = arg3;
		safeWidth = right - 1;
		centerX2d = right / 2;
		centerY2d = bottom / 2;
	}

	@ObfuscatedName("hb.b(Z)V")
	public static void cls() {
		int var1 = width2d * height2d;
		for (int var2 = 0; var2 < var1; var2++) {
			data[var2] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6) {
		if (arg0 < left) {
			arg6 -= left - arg0;
			arg0 = left;
		}
		if (arg2 < top) {
			arg1 -= top - arg2;
			arg2 = top;
		}
		if (arg0 + arg6 > right) {
			arg6 = right - arg0;
		}
		if (arg2 + arg1 > bottom) {
			arg1 = bottom - arg2;
		}
		int var7 = 256 - arg5;
		int var8 = (arg3 >> 16 & 0xFF) * arg5;
		int var9 = (arg3 >> 8 & 0xFF) * arg5;
		int var10 = (arg3 & 0xFF) * arg5;
		int var11 = width2d - arg6;
		int var12 = arg0 + arg2 * width2d;
		for (int var13 = 0; var13 < arg1; var13++) {
			for (int var14 = -arg6; var14 < 0; var14++) {
				int var15 = (data[var12] >> 16 & 0xFF) * var7;
				int var16 = (data[var12] >> 8 & 0xFF) * var7;
				int var17 = (data[var12] & 0xFF) * var7;
				int var18 = (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8) + (var10 + var17 >> 8);
				data[var12++] = var18;
			}
			var12 += var11;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void fillRect(int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < left) {
			arg4 -= left - arg3;
			arg3 = left;
		}
		if (arg1 < top) {
			arg2 -= top - arg1;
			arg1 = top;
		}
		if (arg3 + arg4 > right) {
			arg4 = right - arg3;
		}
		if (arg1 + arg2 > bottom) {
			arg2 = bottom - arg1;
		}
		int var6 = width2d - arg4;
		int var8 = arg3 + arg1 * width2d;
		for (int var9 = -arg2; var9 < 0; var9++) {
			for (int var10 = -arg4; var10 < 0; var10++) {
				data[var8++] = arg5;
			}
			var8 += var6;
		}
	}

	@ObfuscatedName("hb.a(IIIIIZ)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg2, arg3, arg0, arg4);
		hline(arg2 + arg1 - 1, arg3, arg0, arg4);
		vline(arg4, arg0, arg1, arg2);
		vline(arg4, arg0 + arg3 - 1, arg1, arg2);
	}

	@ObfuscatedName("hb.a(IIIIIZI)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg6) {
		hlineTrans(arg4, arg2, arg3, arg0, arg1);
		hlineTrans(arg4, arg2 + arg6 - 1, arg3, arg0, arg1);
		if (arg6 >= 3) {
			vlineTrans(arg1, arg4, arg6 - 2, arg3, arg2 + 1);
			vlineTrans(arg1 + arg0 - 1, arg4, arg6 - 2, arg3, arg2 + 1);
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void hline(int arg0, int arg1, int arg2, int arg4) {
		if (arg0 < top || arg0 >= bottom) {
			return;
		}
		if (arg2 < left) {
			arg1 -= left - arg2;
			arg2 = left;
		}
		if (arg2 + arg1 > right) {
			arg1 = right - arg2;
		}
		int var5 = arg2 + arg0 * width2d;
		for (int var6 = 0; var6 < arg1; var6++) {
			data[var5 + var6] = arg4;
		}
	}

	@ObfuscatedName("hb.b(IIIIIZ)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < top || arg1 >= bottom) {
			return;
		}
		if (arg4 < left) {
			arg3 -= left - arg4;
			arg4 = left;
		}
		if (arg4 + arg3 > right) {
			arg3 = right - arg4;
		}
		int var6 = 256 - arg2;
		int var8 = (arg0 >> 16 & 0xFF) * arg2;
		int var9 = (arg0 >> 8 & 0xFF) * arg2;
		int var10 = (arg0 & 0xFF) * arg2;
		int var11 = arg4 + arg1 * width2d;
		for (int var12 = 0; var12 < arg3; var12++) {
			int var13 = (data[var11] >> 16 & 0xFF) * var6;
			int var14 = (data[var11] >> 8 & 0xFF) * var6;
			int var15 = (data[var11] & 0xFF) * var6;
			int var16 = (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8) + (var10 + var15 >> 8);
			data[var11++] = var16;
		}
	}

	@ObfuscatedName("hb.c(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < left || arg1 >= right) {
			return;
		}
		if (arg3 < top) {
			arg2 -= top - arg3;
			arg3 = top;
		}
		if (arg3 + arg2 > bottom) {
			arg2 = bottom - arg3;
		}
		int var5 = arg1 + arg3 * width2d;
		for (int var6 = 0; var6 < arg2; var6++) {
			data[var5 + var6 * width2d] = arg0;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void vlineTrans(int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < left || arg1 >= right) {
			return;
		}
		if (arg5 < top) {
			arg3 -= top - arg5;
			arg5 = top;
		}
		if (arg5 + arg3 > bottom) {
			arg3 = bottom - arg5;
		}
		int var6 = 256 - arg4;
		int var7 = (arg2 >> 16 & 0xFF) * arg4;
		int var8 = (arg2 >> 8 & 0xFF) * arg4;
		int var9 = (arg2 & 0xFF) * arg4;
		int var10 = arg1 + arg5 * width2d;
		for (int var11 = 0; var11 < arg3; var11++) {
			int var12 = (data[var10] >> 16 & 0xFF) * var6;
			int var13 = (data[var10] >> 8 & 0xFF) * var6;
			int var14 = (data[var10] & 0xFF) * var6;
			int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
			data[var10] = var15;
			var10 += width2d;
		}
	}
}
