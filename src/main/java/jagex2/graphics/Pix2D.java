package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("hb")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("hb.o")
	public static int[] pixels;

	@ObfuscatedName("hb.p")
	public static int width;

	@ObfuscatedName("hb.q")
	public static int height;

	@ObfuscatedName("hb.r")
	public static int boundTop;

	@ObfuscatedName("hb.s")
	public static int boundBottom;

	@ObfuscatedName("hb.t")
	public static int boundLeft;

	@ObfuscatedName("hb.u")
	public static int boundRight;

	@ObfuscatedName("hb.v")
	public static int clipX;

	@ObfuscatedName("hb.w")
	public static int centerX;

	@ObfuscatedName("hb.x")
	public static int centerY;

	@ObfuscatedName("hb.a(II[II)V")
	public static void setPixels(int arg1, int[] arg2, int arg3) {
		pixels = arg2;
		width = arg3;
		height = arg1;
		setClipping(arg3, 0, arg1, 0);
	}

	@ObfuscatedName("hb.a(I)V")
	public static void resetClipping() {
		boundLeft = 0;
		boundTop = 0;
		boundRight = width;
		boundBottom = height;
		clipX = boundRight - 1;
		centerX = boundRight / 2;
	}

	@ObfuscatedName("hb.a(IZIII)V")
	public static void setClipping(int arg0, int arg2, int arg3, int arg4) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg0 > width) {
			arg0 = width;
		}
		if (arg3 > height) {
			arg3 = height;
		}
		boundLeft = arg2;
		boundTop = arg4;
		boundRight = arg0;
		boundBottom = arg3;
		clipX = boundRight - 1;
		centerX = boundRight / 2;
		centerY = boundBottom / 2;
	}

	@ObfuscatedName("hb.b(I)V")
	public static void cls() {
		int var1 = width * height;
		for (int var2 = 0; var2 < var1; var2++) {
			pixels[var2] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6) {
		if (arg2 < boundLeft) {
			arg5 -= boundLeft - arg2;
			arg2 = boundLeft;
		}
		if (arg0 < boundTop) {
			arg4 -= boundTop - arg0;
			arg0 = boundTop;
		}
		if (arg2 + arg5 > boundRight) {
			arg5 = boundRight - arg2;
		}
		if (arg0 + arg4 > boundBottom) {
			arg4 = boundBottom - arg0;
		}
		int var7 = 256 - arg1;
		int var8 = (arg6 >> 16 & 0xFF) * arg1;
		int var9 = (arg6 >> 8 & 0xFF) * arg1;
		int var10 = (arg6 & 0xFF) * arg1;
		int var11 = width - arg5;
		int var12 = arg2 + arg0 * width;
		for (int var13 = 0; var13 < arg4; var13++) {
			for (int var14 = -arg5; var14 < 0; var14++) {
				int var15 = (pixels[var12] >> 16 & 0xFF) * var7;
				int var16 = (pixels[var12] >> 8 & 0xFF) * var7;
				int var17 = (pixels[var12] & 0xFF) * var7;
				int var18 = (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8) + (var10 + var17 >> 8);
				pixels[var12++] = var18;
			}
			var12 += var11;
		}
	}

	@ObfuscatedName("hb.a(IIIIBI)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg5) {
		if (arg2 < boundLeft) {
			arg1 -= boundLeft - arg2;
			arg2 = boundLeft;
		}
		if (arg3 < boundTop) {
			arg0 -= boundTop - arg3;
			arg3 = boundTop;
		}
		if (arg2 + arg1 > boundRight) {
			arg1 = boundRight - arg2;
		}
		if (arg3 + arg0 > boundBottom) {
			arg0 = boundBottom - arg3;
		}
		int var6 = width - arg1;
		int var7 = arg2 + arg3 * width;
		boolean var8 = false;
		for (int var9 = -arg0; var9 < 0; var9++) {
			for (int var10 = -arg1; var10 < 0; var10++) {
				pixels[var7++] = arg5;
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
		if (arg1 < boundTop || arg1 >= boundBottom) {
			return;
		}
		if (arg0 < boundLeft) {
			arg4 -= boundLeft - arg0;
			arg0 = boundLeft;
		}
		if (arg0 + arg4 > boundRight) {
			arg4 = boundRight - arg0;
		}
		int var5 = arg0 + arg1 * width;
		for (int var6 = 0; var6 < arg4; var6++) {
			pixels[var5 + var6] = arg3;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void hlineTrans(int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < boundTop || arg2 >= boundBottom) {
			return;
		}
		if (arg5 < boundLeft) {
			arg3 -= boundLeft - arg5;
			arg5 = boundLeft;
		}
		if (arg5 + arg3 > boundRight) {
			arg3 = boundRight - arg5;
		}
		int var6 = 256 - arg4;
		int var7 = (arg1 >> 16 & 0xFF) * arg4;
		int var8 = (arg1 >> 8 & 0xFF) * arg4;
		int var9 = (arg1 & 0xFF) * arg4;
		int var10 = arg5 + arg2 * width;
		for (int var11 = 0; var11 < arg3; var11++) {
			int var12 = (pixels[var10] >> 16 & 0xFF) * var6;
			int var13 = (pixels[var10] >> 8 & 0xFF) * var6;
			int var14 = (pixels[var10] & 0xFF) * var6;
			int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
			pixels[var10++] = var15;
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
			if (arg3 >= boundLeft && arg3 < boundRight) {
				if (arg0 < boundTop) {
					arg1 -= boundTop - arg0;
					arg0 = boundTop;
				}
				if (arg0 + arg1 > boundBottom) {
					arg1 = boundBottom - arg0;
				}
				int var6 = arg3 + arg0 * width;
				for (int var7 = 0; var7 < arg1; var7++) {
					pixels[var6 + var7 * width] = arg2;
				}
				return;
			}
			return;
		}
	}

	@ObfuscatedName("hb.a(IIZIII)V")
	public static void vlineTrans(int arg0, int arg1, int arg3, int arg4, int arg5) {
		if (arg0 < boundLeft || arg0 >= boundRight) {
			return;
		}
		if (arg4 < boundTop) {
			arg5 -= boundTop - arg4;
			arg4 = boundTop;
		}
		if (arg4 + arg5 > boundBottom) {
			arg5 = boundBottom - arg4;
		}
		int var6 = 256 - arg1;
		int var7 = (arg3 >> 16 & 0xFF) * arg1;
		int var8 = (arg3 >> 8 & 0xFF) * arg1;
		int var9 = (arg3 & 0xFF) * arg1;
		int var10 = arg0 + arg4 * width;
		for (int var12 = 0; var12 < arg5; var12++) {
			int var13 = (pixels[var10] >> 16 & 0xFF) * var6;
			int var14 = (pixels[var10] >> 8 & 0xFF) * var6;
			int var15 = (pixels[var10] & 0xFF) * var6;
			int var16 = (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8) + (var9 + var15 >> 8);
			pixels[var10] = var16;
			var10 += width;
		}
	}
}
