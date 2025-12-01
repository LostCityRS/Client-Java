package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

import java.util.Random;

@ObfuscatedName("lb")
public class PixFont extends Pix2D {

	@ObfuscatedName("lb.E")
	public byte[][] charMask = new byte[94][];

	@ObfuscatedName("lb.F")
	public int[] charMaskWidth = new int[94];

	@ObfuscatedName("lb.G")
	public int[] charMaskHeight = new int[94];

	@ObfuscatedName("lb.H")
	public int[] charOffsetX = new int[94];

	@ObfuscatedName("lb.I")
	public int[] charOffsetY = new int[94];

	@ObfuscatedName("lb.J")
	public int[] charAdvance = new int[95];

	@ObfuscatedName("lb.K")
	public int[] drawWidth = new int[256];

	@ObfuscatedName("lb.M")
	public Random random = new Random();

	@ObfuscatedName("lb.N")
	public boolean strikeout = false;

	@ObfuscatedName("lb.L")
	public int height2d;

	@ObfuscatedName("lb.O")
	public static int[] CHAR_LOOKUP = new int[256];

	public PixFont(String arg0, JagFile arg1) {
		Packet var4 = new Packet(arg1.read(arg0 + ".dat", null));
		Packet var5 = new Packet(arg1.read("index.dat", null));
		boolean var6 = true;
		var5.pos = var4.g2() + 4;
		int var7 = var5.g1();
		if (var7 > 0) {
			var5.pos += (var7 - 1) * 3;
		}
		for (int var8 = 0; var8 < 94; var8++) {
			this.charOffsetX[var8] = var5.g1();
			this.charOffsetY[var8] = var5.g1();
			int var10 = this.charMaskWidth[var8] = var5.g2();
			int var11 = this.charMaskHeight[var8] = var5.g2();
			int var12 = var5.g1();
			int var13 = var10 * var11;
			this.charMask[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					this.charMask[var8][var14] = var4.g1b();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						this.charMask[var8][var15 + var16 * var10] = var4.g1b();
					}
				}
			}
			if (var11 > this.height2d) {
				this.height2d = var11;
			}
			this.charOffsetX[var8] = 1;
			this.charAdvance[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += this.charMask[var8][var18 * var10];
			}
			int var10002;
			if (var17 <= var11 / 7) {
				var10002 = this.charAdvance[var8]--;
				this.charOffsetX[var8] = 0;
			}
			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += this.charMask[var8][var10 - 1 + var20 * var10];
			}
			if (var19 <= var11 / 7) {
				var10002 = this.charAdvance[var8]--;
			}
		}
		this.charAdvance[94] = this.charAdvance[8];
		for (int var21 = 0; var21 < 256; var21++) {
			this.drawWidth[var21] = this.charAdvance[CHAR_LOOKUP[var21]];
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;III)V")
	public void centreString(int arg0, String arg1, int arg3, int arg4) {
		this.drawString(arg4, arg3 - this.stringWid(arg1) / 2, arg0, arg1);
	}

	@ObfuscatedName("lb.a(IILjava/lang/String;ZIZ)V")
	public void centreStringTag(int arg0, int arg1, String arg2, int arg4, boolean arg5) {
		this.drawStringTag(arg5, arg2, arg4, arg0, arg1 - this.stringWid(arg2) / 2);
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;Z)I")
	public int stringWid(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
				var4 += 4;
			} else {
				var3 += this.drawWidth[arg0.charAt(var4)];
			}
		}
		return var3;
	}

	@ObfuscatedName("lb.a(IIIILjava/lang/String;)V")
	public void drawString(int arg0, int arg1, int arg2, String arg4) {
		if (arg4 == null) {
			return;
		}
		int var6 = arg2 - this.height2d;
		for (int var7 = 0; var7 < arg4.length(); var7++) {
			int var8 = CHAR_LOOKUP[arg4.charAt(var7)];
			if (var8 != 94) {
				this.plotLetter(this.charMask[var8], arg1 + this.charOffsetX[var8], var6 + this.charOffsetY[var8], this.charMaskWidth[var8], this.charMaskHeight[var8], arg0);
			}
			arg1 += this.charAdvance[var8];
		}
	}

	@ObfuscatedName("lb.a(IIBILjava/lang/String;I)V")
	public void centreStringWave(int arg0, int arg1, int arg3, String arg4, int arg5) {
		if (arg4 == null) {
			return;
		}
		int var7 = arg3 - this.stringWid(arg4) / 2;
		int var8 = arg5 - this.height2d;
		for (int var10 = 0; var10 < arg4.length(); var10++) {
			int var11 = CHAR_LOOKUP[arg4.charAt(var10)];
			if (var11 != 94) {
				this.plotLetter(this.charMask[var11], var7 + this.charOffsetX[var11], var8 + this.charOffsetY[var11] + (int) (Math.sin((double) var10 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.charMaskWidth[var11], this.charMaskHeight[var11], arg1);
			}
			var7 += this.charAdvance[var11];
		}
	}

	@ObfuscatedName("lb.a(ZLjava/lang/String;IBII)V")
	public void drawStringTag(boolean arg0, String arg1, int arg2, int arg4, int arg5) {
		this.strikeout = false;
		int var7 = arg5;
		if (arg1 == null) {
			return;
		}
		int var8 = arg2 - this.height2d;
		for (int var9 = 0; var9 < arg1.length(); var9++) {
			if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
				int var10 = this.evaluateTag(arg1.substring(var9 + 1, var9 + 4));
				if (var10 != -1) {
					arg4 = var10;
				}
				var9 += 4;
			} else {
				int var11 = CHAR_LOOKUP[arg1.charAt(var9)];
				if (var11 != 94) {
					if (arg0) {
						this.plotLetter(this.charMask[var11], arg5 + this.charOffsetX[var11] + 1, var8 + this.charOffsetY[var11] + 1, this.charMaskWidth[var11], this.charMaskHeight[var11], 0);
					}
					this.plotLetter(this.charMask[var11], arg5 + this.charOffsetX[var11], var8 + this.charOffsetY[var11], this.charMaskWidth[var11], this.charMaskHeight[var11], arg4);
				}
				arg5 += this.charAdvance[var11];
			}
		}
		if (this.strikeout) {
			Pix2D.hline(var7, var8 + (int) ((double) this.height2d * 0.7D), 8388608, arg5 - var7);
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;IIZII)V")
	public void drawStringAntiMacro(int arg0, String arg1, int arg3, boolean arg4, int arg5, int arg6) {
		if (arg1 == null) {
			return;
		}
		this.random.setSeed((long) arg5);
		int var8 = (this.random.nextInt() & 0x1F) + 192;
		int var9 = arg0 - this.height2d;
		for (int var10 = 0; var10 < arg1.length(); var10++) {
			if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
				int var11 = this.evaluateTag(arg1.substring(var10 + 1, var10 + 4));
				if (var11 != -1) {
					arg3 = var11;
				}
				var10 += 4;
			} else {
				int var12 = CHAR_LOOKUP[arg1.charAt(var10)];
				if (var12 != 94) {
					if (arg4) {
						this.plotLetterTrans(this.charMaskHeight[var12], var9 + this.charOffsetY[var12] + 1, 0, 192, this.charMaskWidth[var12], this.charMask[var12], arg6 + this.charOffsetX[var12] + 1);
					}
					this.plotLetterTrans(this.charMaskHeight[var12], var9 + this.charOffsetY[var12], arg3, var8, this.charMaskWidth[var12], this.charMask[var12], arg6 + this.charOffsetX[var12]);
				}
				arg6 += this.charAdvance[var12];
				if ((this.random.nextInt() & 0x3) == 0) {
					arg6++;
				}
			}
		}
	}

	@ObfuscatedName("lb.a(BLjava/lang/String;)I")
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
		int var7 = arg1 + arg2 * Pix2D.width;
		int var8 = Pix2D.width - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.boundTop) {
			int var11 = Pix2D.boundTop - arg2;
			arg4 -= var11;
			arg2 = Pix2D.boundTop;
			var10 += var11 * arg3;
			var7 += var11 * Pix2D.width;
		}
		if (arg2 + arg4 >= Pix2D.boundBottom) {
			arg4 -= arg2 + arg4 - Pix2D.boundBottom + 1;
		}
		if (arg1 < Pix2D.boundLeft) {
			int var12 = Pix2D.boundLeft - arg1;
			arg3 -= var12;
			arg1 = Pix2D.boundLeft;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= Pix2D.boundRight) {
			int var13 = arg1 + arg3 - Pix2D.boundRight + 1;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.plot(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void plot(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("lb.a(IIIII[BII)V")
	public void plotLetterTrans(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg7) {
		int var9 = arg7 + arg1 * Pix2D.width;
		int var10 = Pix2D.width - arg4;
		int var11 = 0;
		int var12 = 0;
		if (arg1 < Pix2D.boundTop) {
			int var13 = Pix2D.boundTop - arg1;
			arg0 -= var13;
			arg1 = Pix2D.boundTop;
			var12 += var13 * arg4;
			var9 += var13 * Pix2D.width;
		}
		if (arg1 + arg0 >= Pix2D.boundBottom) {
			arg0 -= arg1 + arg0 - Pix2D.boundBottom + 1;
		}
		if (arg7 < Pix2D.boundLeft) {
			int var14 = Pix2D.boundLeft - arg7;
			arg4 -= var14;
			arg7 = Pix2D.boundLeft;
			var12 += var14;
			var9 += var14;
			var11 += var14;
			var10 += var14;
		}
		if (arg7 + arg4 >= Pix2D.boundRight) {
			int var15 = arg7 + arg4 - Pix2D.boundRight + 1;
			arg4 -= var15;
			var11 += var15;
			var10 += var15;
		}
		if (arg4 > 0 && arg0 > 0) {
			this.plotTrans(arg2, Pix2D.pixels, arg4, arg3, var11, arg5, var12, var10, arg0, var9);
		}
	}

	@ObfuscatedName("lb.a(I[IIIII[BIIII)V")
	public void plotTrans(int arg0, int[] arg1, int arg2, int arg3, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
		int var12 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		int var13 = 256 - arg3;
		for (int var14 = -arg9; var14 < 0; var14++) {
			for (int var15 = -arg2; var15 < 0; var15++) {
				if (arg6[arg7++] == 0) {
					arg10++;
				} else {
					int var16 = arg1[arg10];
					arg1[arg10++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
				}
			}
			arg10 += arg8;
			arg7 += arg5;
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
