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
	public static void setClipping(int top, int right, int bottom, int left) {
		if (left < 0) {
			left = 0;
		}

		if (top < 0) {
			top = 0;
		}

		if (right > width2d) {
			right = width2d;
		}

		if (bottom > height2d) {
			bottom = height2d;
		}

		Pix2D.left = left;
		Pix2D.top = top;
		Pix2D.right = right;
		Pix2D.bottom = bottom;

		safeWidth = Pix2D.right - 1;
		centerX2d = Pix2D.right / 2;
		centerY2d = Pix2D.bottom / 2;
	}

	@ObfuscatedName("hb.b(Z)V")
	public static void cls() {
		int len = width2d * height2d;
		for (int i = 0; i < len; i++) {
			data[i] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIII)V")
	public static void fillRectTrans(int x, int height, int y, int colour, int alpha, int width) {
		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (y < top) {
			height -= top - y;
			y = top;
		}

		if (x + width > right) {
			width = right - x;
		}

		if (y + height > bottom) {
			height = bottom - y;
		}

		int invAlpha = 256 - alpha;
		int r0 = (colour >> 16 & 0xFF) * alpha;
		int g0 = (colour >> 8 & 0xFF) * alpha;
		int b0 = (colour & 0xFF) * alpha;

		int step = width2d - width;
		int offset = x + y * width2d;

		for (int i = 0; i < height; i++) {
			for (int j = -width; j < 0; j++) {
				int r1 = (data[offset] >> 16 & 0xFF) * invAlpha;
				int g1 = (data[offset] >> 8 & 0xFF) * invAlpha;
				int b1 = (data[offset] & 0xFF) * invAlpha;
				int rgb = (r0 + r1 >> 8 << 16) + (g0 + g1 >> 8 << 8) + (b0 + b1 >> 8);
				data[offset++] = rgb;
			}

			offset += step;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void fillRect(int y, int height, int x, int width, int colour) {
		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (y < top) {
			height -= top - y;
			y = top;
		}

		if (x + width > right) {
			width = right - x;
		}

		if (y + height > bottom) {
			height = bottom - y;
		}

		int step = width2d - width;
		int offset = x + y * width2d;

		for (int i = -height; i < 0; i++) {
			for (int j = -width; j < 0; j++) {
				data[offset++] = colour;
			}

			offset += step;
		}
	}

	@ObfuscatedName("hb.a(IIIIIZ)V")
	public static void drawRect(int x, int height, int y, int width, int colour) {
		hline(y, width, x, colour);
		hline(y + height - 1, width, x, colour);
		vline(colour, x, height, y);
		vline(colour, x + width - 1, height, y);
	}

	@ObfuscatedName("hb.a(IIIIIZI)V")
	public static void drawRectTrans(int width, int x, int y, int alpha, int colour, int height) {
		hlineTrans(colour, y, alpha, width, x);
		hlineTrans(colour, y + height - 1, alpha, width, x);
		if (height >= 3) {
			vlineTrans(x, colour, height - 2, alpha, y + 1);
			vlineTrans(x + width - 1, colour, height - 2, alpha, y + 1);
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void hline(int y, int width, int x, int colour) {
		if (y < top || y >= bottom) {
			return;
		}

		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (x + width > right) {
			width = right - x;
		}

		int offset = x + y * width2d;

		for (int i = 0; i < width; i++) {
			data[offset + i] = colour;
		}
	}

	@ObfuscatedName("hb.b(IIIIIZ)V")
	public static void hlineTrans(int colour, int y, int alpha, int width, int x) {
		if (y < top || y >= bottom) {
			return;
		}

		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (x + width > right) {
			width = right - x;
		}

		int invAlpha = 256 - alpha;
		int r0 = (colour >> 16 & 0xFF) * alpha;
		int g0 = (colour >> 8 & 0xFF) * alpha;
		int b0 = (colour & 0xFF) * alpha;

		int offset = x + y * width2d;

		for (int i = 0; i < width; i++) {
			int r1 = (data[offset] >> 16 & 0xFF) * invAlpha;
			int g1 = (data[offset] >> 8 & 0xFF) * invAlpha;
			int b1 = (data[offset] & 0xFF) * invAlpha;
			int rgb = (r0 + r1 >> 8 << 16) + (g0 + g1 >> 8 << 8) + (b0 + b1 >> 8);
			data[offset++] = rgb;
		}
	}

	@ObfuscatedName("hb.c(IIIII)V")
	public static void vline(int colour, int x, int height, int y) {
		if (x < left || x >= right) {
			return;
		}

		if (y < top) {
			height -= top - y;
			y = top;
		}

		if (y + height > bottom) {
			height = bottom - y;
		}

		int offset = x + y * width2d;

		for (int i = 0; i < height; i++) {
			data[offset + i * width2d] = colour;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void vlineTrans(int x, int colour, int height, int alpha, int y) {
		if (x < left || x >= right) {
			return;
		}

		if (y < top) {
			height -= top - y;
			y = top;
		}

		if (y + height > bottom) {
			height = bottom - y;
		}

		int invAlpha = 256 - alpha;
		int r0 = (colour >> 16 & 0xFF) * alpha;
		int g0 = (colour >> 8 & 0xFF) * alpha;
		int b0 = (colour & 0xFF) * alpha;

		int offset = x + y * width2d;

		for (int i = 0; i < height; i++) {
			int r1 = (data[offset] >> 16 & 0xFF) * invAlpha;
			int g1 = (data[offset] >> 8 & 0xFF) * invAlpha;
			int b1 = (data[offset] & 0xFF) * invAlpha;
			int rgb = (r0 + r1 >> 8 << 16) + (g0 + g1 >> 8 << 8) + (b0 + b1 >> 8);
			data[offset] = rgb;

			offset += width2d;
		}
	}
}
