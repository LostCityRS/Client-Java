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

	public PixFont(String arg0, Jagfile arg1) {
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
			if (var11 > this.height) {
				this.height = var11;
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
		for (int var22 = 0; var22 < 256; var22++) {
			this.drawWidth[var22] = this.charAdvance[CHAR_LOOKUP[var22]];
		}
	}

	@ObfuscatedName("lb.a(IIILjava/lang/String;I)V")
	public void centreString(int arg0, int arg1, int arg2, String arg3) {
		this.drawString(arg3, arg0, arg1 - this.stringWid(arg3) / 2, arg2);
	}

	@ObfuscatedName("lb.a(ZIIILjava/lang/String;B)V")
	public void centreStringTag(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		this.drawStringTag(arg2, arg3 - this.stringWid(arg4) / 2, arg1, arg0, arg4);
	}

	@ObfuscatedName("lb.a(ZLjava/lang/String;)I")
	public int stringWid(String arg1) {
		if (arg1 == null) {
			return 0;
		}
		int var3 = 0;
		for (int var5 = 0; var5 < arg1.length(); var5++) {
			if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
				var5 += 4;
			} else {
				var3 += this.drawWidth[arg1.charAt(var5)];
			}
		}
		return var3;
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;III)V")
	public void drawString(String arg1, int arg2, int arg3, int arg4) {
		if (arg1 == null) {
			return;
		}
		int var7 = arg4 - this.height;
		for (int var8 = 0; var8 < arg1.length(); var8++) {
			int var9 = CHAR_LOOKUP[arg1.charAt(var8)];
			if (var9 != 94) {
				this.plotLetter(this.charMask[var9], arg3 + this.charOffsetX[var9], var7 + this.charOffsetY[var9], this.charMaskWidth[var9], this.charMaskHeight[var9], arg2);
			}
			arg3 += this.charAdvance[var9];
		}
	}

	@ObfuscatedName("lb.a(IIILjava/lang/String;IB)V")
	public void centreStringWave(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 == null) {
			return;
		}
		int var7 = arg0 - this.stringWid(arg3) / 2;
		int var8 = arg2 - this.height;
		for (int var9 = 0; var9 < arg3.length(); var9++) {
			int var10 = CHAR_LOOKUP[arg3.charAt(var9)];
			if (var10 != 94) {
				this.plotLetter(this.charMask[var10], var7 + this.charOffsetX[var10], var8 + this.charOffsetY[var10] + (int) (Math.sin((double) var9 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.charMaskWidth[var10], this.charMaskHeight[var10], arg1);
			}
			var7 += this.charAdvance[var10];
		}
	}

	@ObfuscatedName("lb.a(IIIZZLjava/lang/String;)V")
	public void drawStringTag(int arg0, int arg1, int arg2, boolean arg3, String arg5) {
		this.strikeout = false;
		int var7 = arg1;
		if (arg5 == null) {
			return;
		}
		int var8 = arg2 - this.height;
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
					if (arg3) {
						this.plotLetter(this.charMask[var11], arg1 + this.charOffsetX[var11] + 1, var8 + this.charOffsetY[var11] + 1, this.charMaskWidth[var11], this.charMaskHeight[var11], 0);
					}
					this.plotLetter(this.charMask[var11], arg1 + this.charOffsetX[var11], var8 + this.charOffsetY[var11], this.charMaskWidth[var11], this.charMaskHeight[var11], arg0);
				}
				arg1 += this.charAdvance[var11];
			}
		}
		if (this.strikeout) {
			Pix2D.hline(var8 + (int) ((double) this.height * 0.7D), arg1 - var7, var7, 8388608);
		}
	}

	@ObfuscatedName("lb.a(IIZLjava/lang/String;IIZ)V")
	public void drawStringAntiMacro(int arg0, int arg1, String arg3, int arg4, int arg5, boolean arg6) {
		if (arg3 == null) {
			return;
		}
		this.random.setSeed((long) arg0);
		int var8 = (this.random.nextInt() & 0x1F) + 192;
		int var9 = arg4 - this.height;
		for (int var10 = 0; var10 < arg3.length(); var10++) {
			if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
				int var11 = this.evaluateTag(arg3.substring(var10 + 1, var10 + 4));
				if (var11 != -1) {
					arg1 = var11;
				}
				var10 += 4;
			} else {
				int var12 = CHAR_LOOKUP[arg3.charAt(var10)];
				if (var12 != 94) {
					if (arg6) {
						this.plotLetterTrans(arg5 + this.charOffsetX[var12] + 1, var9 + this.charOffsetY[var12] + 1, 192, this.charMask[var12], 0, this.charMaskWidth[var12], this.charMaskHeight[var12]);
					}
					this.plotLetterTrans(arg5 + this.charOffsetX[var12], var9 + this.charOffsetY[var12], var8, this.charMask[var12], arg1, this.charMaskWidth[var12], this.charMaskHeight[var12]);
				}
				arg5 += this.charAdvance[var12];
				if ((this.random.nextInt() & 0x3) == 0) {
					arg5++;
				}
			}
		}
	}

	@ObfuscatedName("lb.b(ZLjava/lang/String;)I")
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
		int var7 = arg1 + arg2 * Pix2D.width2d;
		int var8 = Pix2D.width2d - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.top) {
			int var11 = Pix2D.top - arg2;
			arg4 -= var11;
			arg2 = Pix2D.top;
			var10 += var11 * arg3;
			var7 += var11 * Pix2D.width2d;
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

	@ObfuscatedName("lb.a(IIII[BIII)V")
	public void plotLetterTrans(int arg0, int arg1, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
		int var9 = arg0 + arg1 * Pix2D.width2d;
		int var10 = Pix2D.width2d - arg6;
		int var11 = 0;
		int var12 = 0;
		if (arg1 < Pix2D.top) {
			int var13 = Pix2D.top - arg1;
			arg7 -= var13;
			arg1 = Pix2D.top;
			var12 += var13 * arg6;
			var9 += var13 * Pix2D.width2d;
		}
		if (arg1 + arg7 >= Pix2D.bottom) {
			arg7 -= arg1 + arg7 - Pix2D.bottom + 1;
		}
		if (arg0 < Pix2D.left) {
			int var14 = Pix2D.left - arg0;
			arg6 -= var14;
			arg0 = Pix2D.left;
			var12 += var14;
			var9 += var14;
			var11 += var14;
			var10 += var14;
		}
		if (arg0 + arg6 >= Pix2D.right) {
			int var15 = arg0 + arg6 - Pix2D.right + 1;
			arg6 -= var15;
			var11 += var15;
			var10 += var15;
		}
		if (arg6 > 0 && arg7 > 0) {
			this.plotLetterTransInner(arg6, var12, Pix2D.data, arg4, var9, var11, var10, arg5, arg7, arg3);
		}
	}

	@ObfuscatedName("lb.a(II[I[BIIIZIII)V")
	public void plotLetterTransInner(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg8, int arg9, int arg10) {
		int var12 = ((arg8 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg10 & 0xFF0000) >> 8;
		int var13 = 256 - arg10;
		for (int var14 = -arg9; var14 < 0; var14++) {
			for (int var15 = -arg0; var15 < 0; var15++) {
				if (arg3[arg1++] == 0) {
					arg4++;
				} else {
					int var16 = arg2[arg4];
					arg2[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
				}
			}
			arg4 += arg6;
			arg1 += arg5;
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
