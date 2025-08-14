package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.io.Jagfile;

import java.util.Random;

@ObfuscatedName("lb")
public class PixFont extends Pix2D {

	@ObfuscatedName("lb.G")
	public byte[][] charMask = new byte[94][];

	@ObfuscatedName("lb.H")
	public int[] charMaskWidth = new int[94];

	@ObfuscatedName("lb.I")
	public int[] charMaskHeight = new int[94];

	@ObfuscatedName("lb.J")
	public int[] charOffsetX = new int[94];

	@ObfuscatedName("lb.K")
	public int[] charOffsetY = new int[94];

	@ObfuscatedName("lb.L")
	public int[] charAdvance = new int[95];

	@ObfuscatedName("lb.M")
	public int[] drawWidth = new int[256];

	@ObfuscatedName("lb.O")
	public Random rand = new Random();

	@ObfuscatedName("lb.P")
	public boolean strikeout = false;

	@ObfuscatedName("lb.N")
	public int height;

	@ObfuscatedName("lb.Q")
	public static int[] CHAR_LOOKUP = new int[256];

	public PixFont(Jagfile arg0, String arg1) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));

		var5.pos = var4.g2() + 4; // skip height and width

		// skip palette
		int var7 = var5.g1();
		if (var7 > 0) {
			var5.pos += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 94; var8++) {
			this.charOffsetX[var8] = var5.g1();
			this.charOffsetY[var8] = var5.g1();

			int var11 = this.charMaskWidth[var8] = var5.g2();
			int var12 = this.charMaskHeight[var8] = var5.g2();

			int var13 = var5.g1(); // pixel order

			int var14 = var11 * var12;
			this.charMask[var8] = new byte[var14];

			if (var13 == 0) {
				for (int var15 = 0; var15 < var14; var15++) {
					this.charMask[var8][var15] = var4.g1b();
				}
			} else if (var13 == 1) {
				for (int var16 = 0; var16 < var11; var16++) {
					for (int var17 = 0; var17 < var12; var17++) {
						this.charMask[var8][var11 * var17 + var16] = var4.g1b();
					}
				}
			}

			if (var12 > this.height) {
				this.height = var12;
			}

			this.charOffsetX[var8] = 1;
			this.charAdvance[var8] = var11 + 2;

			int var18 = 0;
			for (int var19 = var12 / 7; var19 < var12; var19++) {
				var18 += this.charMask[var8][var11 * var19];
			}

			int var10002;
			if (var18 <= var12 / 7) {
				var10002 = this.charAdvance[var8]--;
				this.charOffsetX[var8] = 0;
			}

			int var20 = 0;
			for (int var21 = var12 / 7; var21 < var12; var21++) {
				var20 += this.charMask[var8][var11 * var21 + (var11 - 1)];
			}

			if (var20 <= var12 / 7) {
				var10002 = this.charAdvance[var8]--;
			}
		}

		this.charAdvance[94] = this.charAdvance[8];

		for (int var9 = 0; var9 < 256; var9++) {
			this.drawWidth[var9] = this.charAdvance[CHAR_LOOKUP[var9]];
		}
	}

	@ObfuscatedName("lb.a(IIILjava/lang/String;I)V")
	public void centreString(int arg0, int arg2, String arg3, int arg4) {
		this.drawString(arg3, arg2, arg4, arg0 - this.stringWid(arg3) / 2);
	}

	@ObfuscatedName("lb.a(IZLjava/lang/String;ZII)V")
	public void centreStringTag(int arg0, boolean arg1, String arg2, int arg4, int arg5) {
		this.drawStringTag(arg5, arg0 - this.stringWid(arg2) / 2, arg1, arg4, arg2);
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;B)I")
	public int stringWid(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var5 = 0;
		for (int var6 = 0; var6 < arg0.length(); var6++) {
			if (arg0.charAt(var6) == '@' && var6 + 4 < arg0.length() && arg0.charAt(var6 + 4) == '@') {
				var6 += 4;
			} else {
				var5 += this.drawWidth[arg0.charAt(var6)];
			}
		}
		return var5;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;IBII)V")
	public void drawString(String arg0, int arg1, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		int var8 = arg3 - this.height;
		for (int var9 = 0; var9 < arg0.length(); var9++) {
			int var10 = CHAR_LOOKUP[arg0.charAt(var9)];
			if (var10 != 94) {
				this.plotLetter(this.charMask[var10], this.charOffsetX[var10] + arg4, this.charOffsetY[var10] + var8, this.charMaskWidth[var10], this.charMaskHeight[var10], arg1);
			}
			arg4 += this.charAdvance[var10];
		}
	}

	@ObfuscatedName("lb.a(IILjava/lang/String;III)V")
	public void centreStringWave(int arg0, int arg1, String arg2, int arg4, int arg5) {
		if (arg2 == null) {
			return;
		}
		int var7 = arg4 - this.stringWid(arg2) / 2;
		int var8 = arg0 - this.height;
		for (int var9 = 0; var9 < arg2.length(); var9++) {
			int var10 = CHAR_LOOKUP[arg2.charAt(var9)];
			if (var10 != 94) {
				this.plotLetter(this.charMask[var10], this.charOffsetX[var10] + var7, this.charOffsetY[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.charMaskWidth[var10], this.charMaskHeight[var10], arg5);
			}
			var7 += this.charAdvance[var10];
		}
	}

	@ObfuscatedName("lb.a(IIZZILjava/lang/String;)V")
	public void drawStringTag(int arg0, int arg1, boolean arg2, int arg4, String arg5) {
		this.strikeout = false;
		int var7 = arg1;
		if (arg5 == null) {
			return;
		}
		int var8 = arg4 - this.height;
		for (int var9 = 0; var9 < arg5.length(); var9++) {
			if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
				int var10 = this.evaluateTag(arg5.substring(var9 + 1, var9 + 4));
				if (var10 != -1) {
					arg0 = var10;
				}
				var9 += 4;
			} else {
				int var11 = CHAR_LOOKUP[arg5.charAt(var9)];
				if (var11 != 94) {
					if (arg2) {
						this.plotLetter(this.charMask[var11], this.charOffsetX[var11] + arg1 + 1, this.charOffsetY[var11] + var8 + 1, this.charMaskWidth[var11], this.charMaskHeight[var11], 0);
					}
					this.plotLetter(this.charMask[var11], this.charOffsetX[var11] + arg1, this.charOffsetY[var11] + var8, this.charMaskWidth[var11], this.charMaskHeight[var11], arg0);
				}
				arg1 += this.charAdvance[var11];
			}
		}
		if (this.strikeout) {
			Pix2D.hline(8388608, (int) ((double) this.height * 0.7D) + var8, arg1 - var7, var7);
		}
	}

	@ObfuscatedName("lb.a(ZIIIIILjava/lang/String;)V")
	public void drawStringAntiMacro(boolean arg0, int arg1, int arg2, int arg3, int arg5, String arg6) {
		if (arg6 == null) {
			return;
		}
		this.rand.setSeed((long) arg1);
		int var8 = (this.rand.nextInt() & 0x1F) + 192;
		int var9 = arg3 - this.height;
		for (int var10 = 0; var10 < arg6.length(); var10++) {
			if (arg6.charAt(var10) == '@' && var10 + 4 < arg6.length() && arg6.charAt(var10 + 4) == '@') {
				int var11 = this.evaluateTag(arg6.substring(var10 + 1, var10 + 4));
				if (var11 != -1) {
					arg5 = var11;
				}
				var10 += 4;
			} else {
				int var12 = CHAR_LOOKUP[arg6.charAt(var10)];
				if (var12 != 94) {
					if (arg0) {
						this.plotLetterTrans(0, this.charMaskHeight[var12], this.charMask[var12], this.charOffsetY[var12] + var9 + 1, this.charOffsetX[var12] + arg2 + 1, this.charMaskWidth[var12], 192);
					}
					this.plotLetterTrans(arg5, this.charMaskHeight[var12], this.charMask[var12], this.charOffsetY[var12] + var9, this.charOffsetX[var12] + arg2, this.charMaskWidth[var12], var8);
				}
				arg2 += this.charAdvance[var12];
				if ((this.rand.nextInt() & 0x3) == 0) {
					arg2++;
				}
			}
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;)I")
	public int evaluateTag(String arg1) {
		if (arg1.equals("red")) {
			return 16711680;
		} else if (arg1.equals("gre")) {
			return 65280;
		} else if (arg1.equals("blu")) {
			return 255;
		} else if (arg1.equals("yel")) {
			return 16776960;
		} else if (arg1.equals("cya")) {
			return 65535;
		} else if (arg1.equals("mag")) {
			return 16711935;
		} else if (arg1.equals("whi")) {
			return 16777215;
		} else if (arg1.equals("bla")) {
			return 0;
		} else if (arg1.equals("lre")) {
			return 16748608;
		} else if (arg1.equals("dre")) {
			return 8388608;
		} else if (arg1.equals("dbl")) {
			return 128;
		} else if (arg1.equals("or1")) {
			return 16756736;
		} else if (arg1.equals("or2")) {
			return 16740352;
		} else if (arg1.equals("or3")) {
			return 16723968;
		} else if (arg1.equals("gr1")) {
			return 12648192;
		} else if (arg1.equals("gr2")) {
			return 8453888;
		} else if (arg1.equals("gr3")) {
			return 4259584;
		} else {
			if (arg1.equals("str")) {
				this.strikeout = true;
			}
			return -1;
		}
	}

	@ObfuscatedName("lb.a([BIIIII)V")
	public void plotLetter(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.width2d * arg2 + arg1;
		int var8 = Pix2D.width2d - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.top) {
			int var11 = Pix2D.top - arg2;
			arg4 -= var11;
			arg2 = Pix2D.top;
			var10 += arg3 * var11;
			var7 += Pix2D.width2d * var11;
		}
		if (arg2 + arg4 >= Pix2D.bottom) {
			arg4 -= arg2 + arg4 - Pix2D.bottom + 1;
		}
		if (arg1 < Pix2D.left) {
			int var12 = Pix2D.left - arg1;
			arg3 -= var12;
			arg1 = Pix2D.left;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= Pix2D.right) {
			int var13 = arg1 + arg3 - Pix2D.right + 1;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.plotLetterInner(Pix2D.data, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void plotLetterInner(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("lb.a(II[BIIIII)V")
	public void plotLetterTrans(int arg0, int arg1, byte[] arg2, int arg3, int arg5, int arg6, int arg7) {
		int var10 = Pix2D.width2d * arg3 + arg5;
		int var11 = Pix2D.width2d - arg6;
		int var12 = 0;
		int var13 = 0;
		if (arg3 < Pix2D.top) {
			int var14 = Pix2D.top - arg3;
			arg1 -= var14;
			arg3 = Pix2D.top;
			var13 += arg6 * var14;
			var10 += Pix2D.width2d * var14;
		}
		if (arg1 + arg3 >= Pix2D.bottom) {
			arg1 -= arg1 + arg3 - Pix2D.bottom + 1;
		}
		if (arg5 < Pix2D.left) {
			int var15 = Pix2D.left - arg5;
			arg6 -= var15;
			arg5 = Pix2D.left;
			var13 += var15;
			var10 += var15;
			var12 += var15;
			var11 += var15;
		}
		if (arg5 + arg6 >= Pix2D.right) {
			int var16 = arg5 + arg6 - Pix2D.right + 1;
			arg6 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (arg6 > 0 && arg1 > 0) {
			this.plotLetterTransInner(var12, arg0, var10, Pix2D.data, var13, var11, arg7, arg1, arg2, arg6);
		}
	}

	@ObfuscatedName("lb.a(III[IIIIII[BI)V")
	public void plotLetterTransInner(int arg0, int arg1, int arg2, int[] arg3, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
		int var12 = ((arg1 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		int var13 = 256 - arg7;
		for (int var14 = -arg8; var14 < 0; var14++) {
			for (int var15 = -arg10; var15 < 0; var15++) {
				if (arg9[arg5++] == 0) {
					arg2++;
				} else {
					int var16 = arg3[arg2];
					arg3[arg2++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
				}
			}
			arg2 += arg6;
			arg5 += arg0;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}
			CHAR_LOOKUP[var1] = var2;
		}
	}
}
