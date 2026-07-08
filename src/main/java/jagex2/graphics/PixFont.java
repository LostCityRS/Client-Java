package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import java.util.Random;

@ObfuscatedName("kb")
public final class PixFont extends Pix2D {

	@ObfuscatedName("kb.K")
	public final int[] charAdvance = new int[256];

	@ObfuscatedName("kb.N")
	public boolean strikeout = false;

	@ObfuscatedName("kb.M")
	public final Random rand = new Random();

	@ObfuscatedName("kb.z")
	public final int field683 = 784;

	@ObfuscatedName("kb.A")
	public boolean field684 = false;

	@ObfuscatedName("kb.C")
	public final byte field686 = 5;

	@ObfuscatedName("kb.D")
	public final int field687 = 2;

	@ObfuscatedName("kb.E")
	public final boolean field688 = false;

	@ObfuscatedName("kb.F")
	public final byte[][] charMask = new byte[256][];

	@ObfuscatedName("kb.G")
	public final int[] charMaskWidth = new int[256];

	@ObfuscatedName("kb.H")
	public final int[] charMaskHeight = new int[256];

	@ObfuscatedName("kb.I")
	public final int[] charOffsetX = new int[256];

	@ObfuscatedName("kb.J")
	public final int[] charOffsetY = new int[256];

	@ObfuscatedName("kb.L")
	public int height;

	@ObfuscatedName("kb.B")
	public int field685;

	public PixFont(int arg0, String arg1, boolean arg2, JagFile arg3) {
		Packet var5 = new Packet(arg3.read(arg1 + ".dat", null), 15787);
		Packet var6 = new Packet(arg3.read("index.dat", null), 15787);
		var6.pos = var5.g2() + 4;
		int var7 = var6.g1();
		if (var7 > 0) {
			var6.pos += (var7 - 1) * 3;
		}
		for (int var8 = 0; var8 < 256; var8++) {
			charOffsetX[var8] = var6.g1();
			charOffsetY[var8] = var6.g1();
			int var9 = charMaskWidth[var8] = var6.g2();
			int var10 = charMaskHeight[var8] = var6.g2();
			int var11 = var6.g1();
			int var12 = var9 * var10;
			charMask[var8] = new byte[var12];
			if (var11 == 0) {
				for (int var13 = 0; var13 < var12; var13++) {
					charMask[var8][var13] = var5.g1b();
				}
			} else if (var11 == 1) {
				for (int var14 = 0; var14 < var9; var14++) {
					for (int var15 = 0; var15 < var10; var15++) {
						charMask[var8][var14 + var15 * var9] = var5.g1b();
					}
				}
			}
			if (var10 > height && var8 < 128) {
				height = var10;
			}
			charOffsetX[var8] = 1;
			charAdvance[var8] = var9 + 2;
			int var16 = 0;
			for (int var17 = var10 / 7; var17 < var10; var17++) {
				var16 += charMask[var8][var17 * var9];
			}
			int var10002;
			if (var16 <= var10 / 7) {
				var10002 = charAdvance[var8]--;
				charOffsetX[var8] = 0;
			}
			int var18 = 0;
			for (int var19 = var10 / 7; var19 < var10; var19++) {
				var18 += charMask[var8][var9 + var19 * var9 - 1];
			}
			if (var18 <= var10 / 7) {
				var10002 = charAdvance[var8]--;
			}
		}
		if (arg2) {
			charAdvance[32] = charAdvance[73];
		} else {
			charAdvance[32] = charAdvance[105];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;I)I")
	public int stringWid(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += charAdvance[arg0.charAt(var3)];
		}
		return var2;
	}

	@ObfuscatedName("kb.a(BILjava/lang/String;II)V")
	public void drawString(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 == null) {
			return;
		}
		int var5 = arg3 - height;
		for (int var6 = 0; var6 < arg1.length(); var6++) {
			char var7 = arg1.charAt(var6);
			if (var7 != ' ') {
				plotLetter(charMask[var7], arg2 + charOffsetX[var7], var5 + charOffsetY[var7], charMaskWidth[var7], charMaskHeight[var7], arg0);
			}
			arg2 += charAdvance[var7];
		}
	}

	@ObfuscatedName("kb.a(ZIBILjava/lang/String;I)V")
	public void centreString(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
		drawStringTag(arg1, arg4, arg0, arg2 - stringWidTag(arg3) / 2, arg3);
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;BIII)V")
	public void centreStringWave2(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 == null) {
			return;
		}
		int var6 = arg2 - stringWid(arg1) / 2;
		int var7 = arg3 - height;
		for (int var8 = 0; var8 < arg1.length(); var8++) {
			char var9 = arg1.charAt(var8);
			if (var9 != ' ') {
				plotLetter(charMask[var9], var6 + charOffsetX[var9] + (int) (Math.sin((double) var8 / 5.0D + (double) arg4 / 5.0D) * 5.0D), var7 + charOffsetY[var9] + (int) (Math.sin((double) var8 / 3.0D + (double) arg4 / 5.0D) * 5.0D), charMaskWidth[var9], charMaskHeight[var9], arg0);
			}
			var6 += charAdvance[var9];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;IIIIII)V")
	public void centreStringWave3(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == null) {
			return;
		}
		double var8 = 7.0D - (double) arg6 / 8.0D;
		if (arg5 != 8) {
			field684 = !field684;
		}
		if (var8 < 0.0D) {
			var8 = 0.0D;
		}
		int var10 = arg1 - stringWid(arg0) / 2;
		int var11 = arg3 - height;
		for (int var12 = 0; var12 < arg0.length(); var12++) {
			char var13 = arg0.charAt(var12);
			if (var13 != ' ') {
				plotLetter(charMask[var13], var10 + charOffsetX[var13], var11 + charOffsetY[var13] + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), charMaskWidth[var13], charMaskHeight[var13], arg4);
			}
			var10 += charAdvance[var13];
		}
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;ZIIIII)V")
	public void drawStringAntiMacro(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return;
		}
		rand.setSeed((long) arg3);
		int var5 = (rand.nextInt() & 0x1F) + 192;
		int var6 = 15 - height;
		for (int var7 = 0; var7 < arg0.length(); var7++) {
			if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
				int var8 = updateState(arg0.substring(var7 + 1, var7 + 4));
				if (var8 != -1) {
					arg1 = var8;
				}
				var7 += 4;
			} else {
				char var9 = arg0.charAt(var7);
				if (var9 != ' ') {
					plotLetterTrans(charMask[var9], arg2 + charOffsetX[var9] + 1, 0, var6 + charOffsetY[var9] + 1, charMaskHeight[var9], 192, charMaskWidth[var9]);
					plotLetterTrans(charMask[var9], arg2 + charOffsetX[var9], arg1, var6 + charOffsetY[var9], charMaskHeight[var9], var5, charMaskWidth[var9]);
				}
				arg2 += charAdvance[var9];
				if ((rand.nextInt() & 0x3) == 0) {
					arg2++;
				}
			}
		}
	}

	@ObfuscatedName("kb.b(Ljava/lang/String;I)I")
	public int updateState(String arg0) {
		if (arg0.equals("red")) {
			return 16711680;
		} else if (arg0.equals("gre")) {
			return 65280;
		} else if (arg0.equals("blu")) {
			return 255;
		} else if (arg0.equals("yel")) {
			return 16776960;
		} else if (arg0.equals("cya")) {
			return 65535;
		} else if (arg0.equals("mag")) {
			return 16711935;
		} else if (arg0.equals("whi")) {
			return 16777215;
		} else if (arg0.equals("bla")) {
			return 0;
		} else if (arg0.equals("lre")) {
			return 16748608;
		} else if (arg0.equals("dre")) {
			return 8388608;
		} else if (arg0.equals("dbl")) {
			return 128;
		} else if (arg0.equals("or1")) {
			return 16756736;
		} else if (arg0.equals("or2")) {
			return 16740352;
		} else if (arg0.equals("or3")) {
			return 16723968;
		} else if (arg0.equals("gr1")) {
			return 12648192;
		} else if (arg0.equals("gr2")) {
			return 8453888;
		} else if (arg0.equals("gr3")) {
			return 4259584;
		} else {
			if (arg0.equals("str")) {
				strikeout = true;
			}
			if (arg0.equals("end")) {
				strikeout = false;
			}
			return -1;
		}
	}

	@ObfuscatedName("kb.a([BIIIII)V")
	public void plotLetter(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * Pix2D.width;
		int var8 = Pix2D.width - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - arg2;
			arg4 -= var11;
			arg2 = Pix2D.clipMinY;
			var10 = var11 * arg3;
			var7 += var11 * Pix2D.width;
		}
		if (arg2 + arg4 >= Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 + 1 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - arg1;
			arg3 -= var12;
			arg1 = Pix2D.clipMinX;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= Pix2D.clipMaxX) {
			int var13 = arg1 + arg3 + 1 - Pix2D.clipMaxX;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			plot(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("kb.a([I[BIIIIIII)V")
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

	@ObfuscatedName("kb.a([BIIIIIIZ)V")
	public void plotLetterTrans(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg3 * Pix2D.width;
		int var9 = Pix2D.width - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - arg3;
			arg4 -= var12;
			arg3 = Pix2D.clipMinY;
			var11 = var12 * arg6;
			var8 += var12 * Pix2D.width;
		}
		if (arg3 + arg4 >= Pix2D.clipMaxY) {
			arg4 -= arg3 + arg4 + 1 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - arg1;
			arg6 -= var13;
			arg1 = Pix2D.clipMinX;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg1 + arg6 >= Pix2D.clipMaxX) {
			int var14 = arg1 + arg6 + 1 - Pix2D.clipMaxX;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg6 > 0 && arg4 > 0) {
			plotTrans(var10, arg6, arg2, arg0, Pix2D.pixels, var8, var11, var9, arg5, arg4);
		}
	}

	@ObfuscatedName("kb.a(III[BZ[IIIIII)V")
	public void plotTrans(int arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = ((arg2 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		int var12 = 256 - arg8;
		for (int var13 = -arg9; var13 < 0; var13++) {
			for (int var14 = -arg1; var14 < 0; var14++) {
				if (arg3[arg6++] == 0) {
					arg5++;
				} else {
					int var15 = arg4[arg5];
					arg4[arg5++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
				}
			}
			arg5 += arg7;
			arg6 += arg0;
		}
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;III)V")
	public void centreStringTag(int arg0, String arg1, int arg2, int arg3) {
		drawString(arg2, arg1, arg0 - stringWid(arg1) / 2, arg3);
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;Z)I")
	public int stringWidTag(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += charAdvance[arg0.charAt(var3)];
			}
		}
		return var2;
	}

	@ObfuscatedName("kb.a(IIBIILjava/lang/String;)V")
	public void centreStringWave(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 == null) {
			return;
		}
		int var6 = arg0 - stringWid(arg4) / 2;
		int var7 = arg3 - height;
		if (field686 != 5) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		for (int var9 = 0; var9 < arg4.length(); var9++) {
			char var10 = arg4.charAt(var9);
			if (var10 != ' ') {
				plotLetter(charMask[var10], var6 + charOffsetX[var10], var7 + charOffsetY[var10] + (int) (Math.sin((double) var9 / 2.0D + (double) arg1 / 5.0D) * 5.0D), charMaskWidth[var10], charMaskHeight[var10], arg2);
			}
			var6 += charAdvance[var10];
		}
	}

	@ObfuscatedName("kb.a(IIIZILjava/lang/String;)V")
	public void drawStringTag(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		strikeout = false;
		int var6 = arg3;
		if (arg4 != null) {
			int var7 = arg1 - height;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = updateState(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}
					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							plotLetter(charMask[var10], arg3 + charOffsetX[var10] + 1, var7 + charOffsetY[var10] + 1, charMaskWidth[var10], charMaskHeight[var10], 0);
						}
						plotLetter(charMask[var10], arg3 + charOffsetX[var10], var7 + charOffsetY[var10], charMaskWidth[var10], charMaskHeight[var10], arg0);
					}
					arg3 += charAdvance[var10];
				}
			}
			if (field687 <= 2 && field687 >= 2 && strikeout) {
				Pix2D.hline(arg3 - var6, var6, 8388608, var7 + (int) ((double) height * 0.7D));
			}
		}
	}
}
