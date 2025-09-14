package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

import java.util.Random;

@ObfuscatedName("lb")
public class PixFont extends Pix2D {

	@ObfuscatedName("lb.y")
	public byte[][] charMask = new byte[94][];

	@ObfuscatedName("lb.z")
	public int[] charMaskWidth = new int[94];

	@ObfuscatedName("lb.A")
	public int[] charMaskHeight = new int[94];

	@ObfuscatedName("lb.B")
	public int[] charOffsetX = new int[94];

	@ObfuscatedName("lb.C")
	public int[] charOffsetY = new int[94];

	@ObfuscatedName("lb.D")
	public int[] charAdvance = new int[95];

	@ObfuscatedName("lb.E")
	public int[] drawWidth = new int[256];

	@ObfuscatedName("lb.G")
	public Random random = new Random();

	@ObfuscatedName("lb.H")
	public boolean strikeout = false;

	@ObfuscatedName("lb.F")
	public int height;

	@ObfuscatedName("lb.I")
	public static int[] CHAR_LOOKUP = new int[256];

	public PixFont(String name, Jagfile jag) {
		Packet data = new Packet(jag.read(name + ".dat", null));
		Packet index = new Packet(jag.read("index.dat", null));

		index.pos = data.g2() + 4;

		int palCount = index.g1();
		if (palCount > 0) {
			index.pos += (palCount - 1) * 3;
		}

		for (int c = 0; c < 94; c++) {
			this.charOffsetX[c] = index.g1();
			this.charOffsetY[c] = index.g1();
			int wi = this.charMaskWidth[c] = index.g2();
			int hi = this.charMaskHeight[c] = index.g2();

			int pixelOrder = index.g1();
			int len = wi * hi;
			this.charMask[c] = new byte[len];

			if (pixelOrder == 0) {
				for (int i = 0; i < len; i++) {
					this.charMask[c][i] = data.g1b();
				}
			} else if (pixelOrder == 1) {
				for (int x = 0; x < wi; x++) {
					for (int y = 0; y < hi; y++) {
						this.charMask[c][x + y * wi] = data.g1b();
					}
				}
			}

			if (hi > this.height) {
				this.height = hi;
			}

			this.charOffsetX[c] = 1;
			this.charAdvance[c] = wi + 2;

			int space = 0;
			for (int j = hi / 7; j < hi; j++) {
				space += this.charMask[c][j * wi];
			}
			if (space <= hi / 7) {
				this.charAdvance[c]--;
				this.charOffsetX[c] = 0;
			}

			space = 0;
			for (int j = hi / 7; j < hi; j++) {
				space += this.charMask[c][wi - 1 + j * wi];
			}
			if (space <= hi / 7) {
				this.charAdvance[c]--;
			}
		}

		this.charAdvance[94] = this.charAdvance[8];

		for (int c = 0; c < 256; c++) {
			this.drawWidth[c] = this.charAdvance[CHAR_LOOKUP[c]];
		}
	}

	@ObfuscatedName("lb.a(IIILjava/lang/String;I)V")
	public void centreString(int colour, int x, int y, String str) {
		this.drawString(str, colour, x - this.stringWid(str) / 2, y);
	}

	@ObfuscatedName("lb.a(ZIIILjava/lang/String;B)V")
	public void centreStringTag(boolean shadowed, int y, int colour, int x, String str) {
		this.drawStringTag(colour, x - this.stringWid(str) / 2, y, shadowed, str);
	}

	@ObfuscatedName("lb.a(ZLjava/lang/String;)I")
	public int stringWid(String str) {
		if (str == null) {
			return 0;
		}

		int size = 0;
		for (int c = 0; c < str.length(); c++) {
			if (str.charAt(c) == '@' && c + 4 < str.length() && str.charAt(c + 4) == '@') {
				c += 4;
			} else {
				size += this.drawWidth[str.charAt(c)];
			}
		}
		return size;
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;III)V")
	public void drawString(String str, int colour, int x, int y) {
		if (str == null) {
			return;
		}

		y = y - this.height;

		for (int i = 0; i < str.length(); i++) {
			int c = CHAR_LOOKUP[str.charAt(i)];
			if (c != 94) {
				this.plotLetter(this.charMask[c], x + this.charOffsetX[c], y + this.charOffsetY[c], this.charMaskWidth[c], this.charMaskHeight[c], colour);
			}

			x += this.charAdvance[c];
		}
	}

	@ObfuscatedName("lb.a(IIILjava/lang/String;IB)V")
	public void centreStringWave(int x, int colour, int y, String str, int phase) {
		if (str == null) {
			return;
		}

		x = x - this.stringWid(str) / 2;
		y = y - this.height;

		for (int i = 0; i < str.length(); i++) {
			int c = CHAR_LOOKUP[str.charAt(i)];
			if (c != 94) {
				this.plotLetter(this.charMask[c], x + this.charOffsetX[c], y + this.charOffsetY[c] + (int) (Math.sin((double) i / 2.0D + (double) phase / 5.0D) * 5.0D), this.charMaskWidth[c], this.charMaskHeight[c], colour);
			}

			x += this.charAdvance[c];
		}
	}

	@ObfuscatedName("lb.a(IIIZZLjava/lang/String;)V")
	public void drawStringTag(int colour, int x, int y, boolean shadowed, String str) {
		this.strikeout = false;

		int leftX = x;
		if (str == null) {
			return;
		}

		y = y - this.height;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '@' && i + 4 < str.length() && str.charAt(i + 4) == '@') {
				int tag = this.evaluateTag(str.substring(i + 1, i + 4));
				if (tag != -1) {
					colour = tag;
				}

				i += 4;
			} else {
				int c = CHAR_LOOKUP[str.charAt(i)];
				if (c != 94) {
					if (shadowed) {
						this.plotLetter(this.charMask[c], x + this.charOffsetX[c] + 1, y + this.charOffsetY[c] + 1, this.charMaskWidth[c], this.charMaskHeight[c], 0);
					}

					this.plotLetter(this.charMask[c], x + this.charOffsetX[c], y + this.charOffsetY[c], this.charMaskWidth[c], this.charMaskHeight[c], colour);
				}

				x += this.charAdvance[c];
			}
		}

		if (this.strikeout) {
			Pix2D.hline(y + (int) ((double) this.height * 0.7D), x - leftX, leftX, 8388608);
		}
	}

	@ObfuscatedName("lb.a(IIZLjava/lang/String;IIZ)V")
	public void drawStringAntiMacro(int seed, int colour, String str, int y, int x, boolean shadowed) {
		if (str == null) {
			return;
		}

		this.random.setSeed(seed);

		int alpha = (this.random.nextInt() & 0x1F) + 192;
		y = y - this.height;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '@' && i + 4 < str.length() && str.charAt(i + 4) == '@') {
				int tag = this.evaluateTag(str.substring(i + 1, i + 4));
				if (tag != -1) {
					colour = tag;
				}

				i += 4;
			} else {
				int c = CHAR_LOOKUP[str.charAt(i)];
				if (c != 94) {
					if (shadowed) {
						this.plotLetterTrans(x + this.charOffsetX[c] + 1, y + this.charOffsetY[c] + 1, 192, this.charMask[c], 0, this.charMaskWidth[c], this.charMaskHeight[c]);
					}

					this.plotLetterTrans(x + this.charOffsetX[c], y + this.charOffsetY[c], alpha, this.charMask[c], colour, this.charMaskWidth[c], this.charMaskHeight[c]);
				}

				x += this.charAdvance[c];

				if ((this.random.nextInt() & 0x3) == 0) {
					x++;
				}
			}
		}
	}

	@ObfuscatedName("lb.b(ZLjava/lang/String;)I")
	public int evaluateTag(String tag) {
		if (tag.equals("red")) {
			return 16711680;
		} else if (tag.equals("gre")) {
			return 65280;
		} else if (tag.equals("blu")) {
			return 255;
		} else if (tag.equals("yel")) {
			return 16776960;
		} else if (tag.equals("cya")) {
			return 65535;
		} else if (tag.equals("mag")) {
			return 16711935;
		} else if (tag.equals("whi")) {
			return 16777215;
		} else if (tag.equals("bla")) {
			return 0;
		} else if (tag.equals("lre")) {
			return 16748608;
		} else if (tag.equals("dre")) {
			return 8388608;
		} else if (tag.equals("dbl")) {
			return 128;
		} else if (tag.equals("or1")) {
			return 16756736;
		} else if (tag.equals("or2")) {
			return 16740352;
		} else if (tag.equals("or3")) {
			return 16723968;
		} else if (tag.equals("gr1")) {
			return 12648192;
		} else if (tag.equals("gr2")) {
			return 8453888;
		} else if (tag.equals("gr3")) {
			return 4259584;
		} else {
			if (tag.equals("str")) {
				this.strikeout = true;
			}

			return -1;
		}
	}

	@ObfuscatedName("lb.a([BIIIII)V")
	public void plotLetter(byte[] src, int x, int y, int w, int h, int colour) {
		int dstOff = x + y * Pix2D.width2d;
		int dstStep = Pix2D.width2d - w;
		int srcStep = 0;
		int srcOff = 0;

		if (y < Pix2D.top) {
			int trim = Pix2D.top - y;
			h -= trim;
			y = Pix2D.top;
			srcOff += trim * w;
			dstOff += trim * Pix2D.width2d;
		}

		if (y + h >= Pix2D.bottom) {
			h -= y + h - Pix2D.bottom + 1;
		}

		if (x < Pix2D.left) {
			int trim = Pix2D.left - x;
			w -= trim;
			x = Pix2D.left;
			srcOff += trim;
			dstOff += trim;
			srcStep += trim;
			dstStep += trim;
		}

		if (x + w >= Pix2D.right) {
			int trim = x + w - Pix2D.right + 1;
			w -= trim;
			srcStep += trim;
			dstStep += trim;
		}

		if (w > 0 && h > 0) {
			this.plotLetterInner(Pix2D.data, src, colour, srcOff, dstOff, w, h, dstStep, srcStep);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void plotLetterInner(int[] dst, byte[] src, int colour, int srcOff, int dstOff, int w, int h, int dstStep, int srcStep) {
		int qw = -(w >> 2);
		w = -(w & 0x3);

		for (int y = -h; y < 0; y++) {
			for (int x = qw; x < 0; x++) {
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = colour;
				}

				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = colour;
				}

				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = colour;
				}

				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = colour;
				}
			}

			for (int x = w; x < 0; x++) {
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = colour;
				}
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@ObfuscatedName("lb.a(IIII[BIII)V")
	public void plotLetterTrans(int x, int y, int alpha, byte[] src, int colour, int w, int h) {
		int dstOff = x + y * Pix2D.width2d;
		int dstStep = Pix2D.width2d - w;
		int srcStep = 0;
		int srcOff = 0;

		if (y < Pix2D.top) {
			int trim = Pix2D.top - y;
			h -= trim;
			y = Pix2D.top;
			srcOff += trim * w;
			dstOff += trim * Pix2D.width2d;
		}

		if (y + h >= Pix2D.bottom) {
			h -= y + h - Pix2D.bottom + 1;
		}

		if (x < Pix2D.left) {
			int trim = Pix2D.left - x;
			w -= trim;
			x = Pix2D.left;
			srcOff += trim;
			dstOff += trim;
			srcStep += trim;
			dstStep += trim;
		}

		if (x + w >= Pix2D.right) {
			int trim = x + w - Pix2D.right + 1;
			w -= trim;
			srcStep += trim;
			dstStep += trim;
		}

		if (w > 0 && h > 0) {
			this.plotLetterTransInner(w, srcOff, Pix2D.data, src, dstOff, srcStep, dstStep, colour, h, alpha);
		}
	}

	@ObfuscatedName("lb.a(II[I[BIIIZIII)V")
	public void plotLetterTransInner(int w, int srcOff, int[] dst, byte[] src, int dstOff, int srcStep, int dstStep, int colour, int h, int alpha) {
		int rgb = ((colour & 0xFF00FF) * alpha & 0xFF00FF00) + ((colour & 0xFF00) * alpha & 0xFF0000) >> 8;
		int invAlpha = 256 - alpha;

		for (int y = -h; y < 0; y++) {
			for (int x = -w; x < 0; x++) {
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					int dstRgb = dst[dstOff];
					dst[dstOff++] = (((dstRgb & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((dstRgb & 0xFF00) * invAlpha & 0xFF0000) >> 8) + rgb;
				}
			}

			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	static {
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

		for (int i = 0; i < 256; i++) {
			int c = charset.indexOf(i);
			if (c == -1) {
				c = 74;
			}

			CHAR_LOOKUP[i] = c;
		}
	}
}
