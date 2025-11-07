package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("hb")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("hb.o")
	public static int[] data;

	@ObfuscatedName("hb.p")
	public static int width2d;

	@ObfuscatedName("hb.q")
	public static int height2d;

	@ObfuscatedName("hb.r")
	public static int top;

	@ObfuscatedName("hb.s")
	public static int bottom;

	@ObfuscatedName("hb.t")
	public static int left;

	@ObfuscatedName("hb.u")
	public static int right;

	@ObfuscatedName("hb.v")
	public static int safeWidth;

	@ObfuscatedName("hb.w")
	public static int centerX2d;

	@ObfuscatedName("hb.x")
	public static int centerY2d;

	@ObfuscatedName("hb.a(II[II)V")
	public static void bind(int arg1, int[] arg2, int arg3) {
		data = arg2;
		width2d = arg3;
		height2d = arg1;
		setClipping(arg3, 0, arg1, 0);
	}

	@ObfuscatedName("hb.a(I)V")
	public static void resetClipping() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		safeWidth = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("hb.a(IZIII)V")
	public static void setClipping(int arg0, int arg2, int arg3, int arg4) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg0 > width2d) {
			arg0 = width2d;
		}
		if (arg3 > height2d) {
			arg3 = height2d;
		}
		left = arg2;
		top = arg4;
		right = arg0;
		bottom = arg3;
		safeWidth = right - 1;
		centerX2d = right / 2;
		centerY2d = bottom / 2;
	}

	@ObfuscatedName("hb.b(I)V")
	public static void cls() {
		int var1 = width2d * height2d;
		for (int var2 = 0; var2 < var1; var2++) {
			data[var2] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6) {
		if (arg2 < left) {
			arg5 -= left - arg2;
			arg2 = left;
		}
		if (arg0 < top) {
			arg4 -= top - arg0;
			arg0 = top;
		}
		if (arg2 + arg5 > right) {
			arg5 = right - arg2;
		}
		if (arg0 + arg4 > bottom) {
			arg4 = bottom - arg0;
		}
		int var7 = 256 - arg1;
		int var8 = (arg6 >> 16 & 0xFF) * arg1;
		int var9 = (arg6 >> 8 & 0xFF) * arg1;
		int var10 = (arg6 & 0xFF) * arg1;
		int var11 = width2d - arg5;
		int var12 = arg2 + arg0 * width2d;
		for (int var13 = 0; var13 < arg4; var13++) {
			for (int var14 = -arg5; var14 < 0; var14++) {
				int var15 = (data[var12] >> 16 & 0xFF) * var7;
				int var16 = (data[var12] >> 8 & 0xFF) * var7;
				int var17 = (data[var12] & 0xFF) * var7;
				int var18 = (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8) + (var10 + var17 >> 8);
				data[var12++] = var18;
			}
			var12 += var11;
		}
	}

	@ObfuscatedName("hb.a(IIIIBI)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg5) {
		if (arg2 < left) {
			arg1 -= left - arg2;
			arg2 = left;
		}
		if (arg3 < top) {
			arg0 -= top - arg3;
			arg3 = top;
		}
		if (arg2 + arg1 > right) {
			arg1 = right - arg2;
		}
		if (arg3 + arg0 > bottom) {
			arg0 = bottom - arg3;
		}
		int var6 = width2d - arg1;
		int var7 = arg2 + arg3 * width2d;
		boolean var8 = false;
		for (int var9 = -arg0; var9 < 0; var9++) {
			for (int var10 = -arg1; var10 < 0; var10++) {
				data[var7++] = arg5;
			}
			var7 += var6;
		}
	}

	@ObfuscatedName("hb.a(IIIZII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg4, int arg5) {
		hline(arg4, arg2, arg0, arg1);
		hline(arg4, arg2 + arg5 - 1, arg0, arg1);
		vline(arg2, arg5, arg0, arg4, -490);
		vline(arg2, arg5, arg0, arg4 + arg1 - 1, -490);
	}

	@ObfuscatedName("hb.a(IBIIIII)V")
	public static void drawRectTrans(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6) {
		hlineTrans(arg2, arg6, arg3, arg0, arg4);
		hlineTrans(arg2, arg6 + arg5 - 1, arg3, arg0, arg4);
		if (arg5 >= 3) {
			vlineTrans(arg4, arg0, arg2, arg6 + 1, arg5 - 2);
			vlineTrans(arg4 + arg3 - 1, arg0, arg2, arg6 + 1, arg5 - 2);
		}
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void hline(int arg0, int arg1, int arg3, int arg4) {
		if (arg1 < top || arg1 >= bottom) {
			return;
		}
		if (arg0 < left) {
			arg4 -= left - arg0;
			arg0 = left;
		}
		if (arg0 + arg4 > right) {
			arg4 = right - arg0;
		}
		int var5 = arg0 + arg1 * width2d;
		for (int var6 = 0; var6 < arg4; var6++) {
			data[var5 + var6] = arg3;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void hlineTrans(int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < top || arg2 >= bottom) {
			return;
		}
		if (arg5 < left) {
			arg3 -= left - arg5;
			arg5 = left;
		}
		if (arg5 + arg3 > right) {
			arg3 = right - arg5;
		}
		int var6 = 256 - arg4;
		int var7 = (arg1 >> 16 & 0xFF) * arg4;
		int var8 = (arg1 >> 8 & 0xFF) * arg4;
		int var9 = (arg1 & 0xFF) * arg4;
		int var10 = arg5 + arg2 * width2d;
		for (int var11 = 0; var11 < arg3; var11++) {
			int var12 = (data[var10] >> 16 & 0xFF) * var6;
			int var13 = (data[var10] >> 8 & 0xFF) * var6;
			int var14 = (data[var10] & 0xFF) * var6;
			int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
			data[var10++] = var15;
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3, int arg4) {
		label39: while (true) {
			if (arg4 >= 0) {
				int var5 = 1;
				while (true) {
					if (var5 <= 0) {
						continue label39;
					}
					var5++;
				}
			}
			if (arg3 >= left && arg3 < right) {
				if (arg0 < top) {
					arg1 -= top - arg0;
					arg0 = top;
				}
				if (arg0 + arg1 > bottom) {
					arg1 = bottom - arg0;
				}
				int var6 = arg3 + arg0 * width2d;
				for (int var7 = 0; var7 < arg1; var7++) {
					data[var6 + var7 * width2d] = arg2;
				}
				return;
			}
			return;
		}
	}

	@ObfuscatedName("hb.a(IIZIII)V")
	public static void vlineTrans(int arg0, int arg1, int arg3, int arg4, int arg5) {
		if (arg0 < left || arg0 >= right) {
			return;
		}
		if (arg4 < top) {
			arg5 -= top - arg4;
			arg4 = top;
		}
		if (arg4 + arg5 > bottom) {
			arg5 = bottom - arg4;
		}
		int var6 = 256 - arg1;
		int var7 = (arg3 >> 16 & 0xFF) * arg1;
		int var8 = (arg3 >> 8 & 0xFF) * arg1;
		int var9 = (arg3 & 0xFF) * arg1;
		int var10 = arg0 + arg4 * width2d;
		for (int var12 = 0; var12 < arg5; var12++) {
			int var13 = (data[var10] >> 16 & 0xFF) * var6;
			int var14 = (data[var10] >> 8 & 0xFF) * var6;
			int var15 = (data[var10] & 0xFF) * var6;
			int var16 = (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8) + (var9 + var15 >> 8);
			data[var10] = var16;
			var10 += width2d;
		}
	}
}
