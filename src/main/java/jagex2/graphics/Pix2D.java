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
	public static void bind(int width, int[] data, int height) {
		Pix2D.data = data;
		width2d = width;
		height2d = height;
		setClipping(width, height, 0, 0);
	}

	@ObfuscatedName("hb.a(B)V")
	public static void resetClipping() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		safeWidth = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void setClipping(int right, int bottom, int top, int left) {
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

	// i guess they had some windows lovers :)
	@ObfuscatedName("hb.a(Z)V")
	public static void cls() {
		int length = height2d * width2d;
		for (int i = 0; i < length; i++) {
			data[i] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIIB)V")
	public static void fillRectTrans(int y, int alpha, int height, int width, int colour, int x) {
		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (y < top) {
			height -= top - y;
			y = top;
		}

		if (width + x > right) {
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
		int offset = width2d * y + x;

		for (int i = 0; i < height; i++) {
			for (int j = -width; j < 0; j++) {
				int r1 = (data[offset] >> 16 & 0xFF) * invAlpha;
				int g1 = (data[offset] >> 8 & 0xFF) * invAlpha;
				int b1 = (data[offset] & 0xFF) * invAlpha;

				int rgb = (b0 + b1 >> 8) + (r0 + r1 >> 8 << 16) + (g0 + g1 >> 8 << 8);
				data[offset++] = rgb;
			}

			offset += step;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void fillRect(int colour, int width, int height, int x, int y) {
		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (y < top) {
			height -= top - y;
			y = top;
		}

		if (width + x > right) {
			width = right - x;
		}

		if (height + y > bottom) {
			height = bottom - y;
		}

		int step = width2d - width;
		int offset = width2d * y + x;

		for (int i = -height; i < 0; i++) {
			for (int j = -width; j < 0; j++) {
				data[offset++] = colour;
			}

			offset += step;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void drawRect(int height, int width, int colour, int x, int y) {
		hline(colour, y, width, x);
		hline(colour, height + y - 1, width, x);
		vline(x, colour, y, height);
		vline(width + x - 1, colour, y, height);
	}

	@ObfuscatedName("hb.a(IIIIIZI)V")
	public static void drawRectTrans(int height, int colour, int x, int y, int width, int alpha) {
		hlineTrans(y, width, colour, x, alpha);
		hlineTrans(height + y - 1, width, colour, x, alpha);

		if (height >= 3) {
			vlineTrans(x, y + 1, alpha, height - 2, colour);
			vlineTrans(x + width - 1, y + 1, alpha, height - 2, colour);
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void hline(int colour, int y, int width, int x) {
		if (y < top || y >= bottom) {
			return;
		}

		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (width + x > right) {
			width = right - x;
		}

		int offset = width2d * y + x;

		for (int i = 0; i < width; i++) {
			data[offset + i] = colour;
		}
	}

	@ObfuscatedName("hb.c(IIIIII)V")
	public static void hlineTrans(int y, int width, int colour, int x, int alpha) {
		if (y < top || y >= bottom) {
			return;
		}

		if (x < left) {
			width -= left - x;
			x = left;
		}

		if (width + x > right) {
			width = right - x;
		}

		int invAlpha = 256 - alpha;
		int r0 = (colour >> 16 & 0xFF) * alpha;
		int g0 = (colour >> 8 & 0xFF) * alpha;
		int b0 = (colour & 0xFF) * alpha;
		int offset = width2d * y + x;

		for (int i = 0; i < width; i++) {
			int r1 = (data[offset] >> 16 & 0xFF) * invAlpha;
			int g1 = (data[offset] >> 8 & 0xFF) * invAlpha;
			int b1 = (data[offset] & 0xFF) * invAlpha;

			int rgb = (b0 + b1 >> 8) + (r0 + r1 >> 8 << 16) + (g0 + g1 >> 8 << 8);
			data[offset++] = rgb;
		}
	}

	@ObfuscatedName("hb.a(IIIIZ)V")
	public static void vline(int x, int colour, int y, int height) {
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

		int offset = width2d * y + x;

		for (int i = 0; i < height; i++) {
			data[width2d * i + offset] = colour;
		}
	}

	@ObfuscatedName("hb.a(IIIIIB)V")
	public static void vlineTrans(int x, int y, int alpha, int height, int colour) {
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
		int offset = width2d * y + x;

		for (int i = 0; i < height; i++) {
			int r1 = (data[offset] >> 16 & 0xFF) * invAlpha;
			int g1 = (data[offset] >> 8 & 0xFF) * invAlpha;
			int b1 = (data[offset] & 0xFF) * invAlpha;

			int rgb = (b0 + b1 >> 8) + (r0 + r1 >> 8 << 16) + (g0 + g1 >> 8 << 8);
			data[offset] = rgb;

			offset += width2d;
		}
	}
}
