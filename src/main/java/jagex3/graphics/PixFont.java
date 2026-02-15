package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.util.JagString;

import java.util.Random;

@ObfuscatedName("ob")
public abstract class PixFont extends Pix2D {

	@ObfuscatedName("ob.cb")
	public static JagString field2290 = JagString.wrap("lt");
	@ObfuscatedName("ob.jb")
	public static JagString field2297 = JagString.wrap("gt");
	@ObfuscatedName("ob.T")
	public static JagString field2282 = JagString.wrap("img=");
	@ObfuscatedName("ob.yb")
	public static JagString field2312 = JagString.wrap("br");
	@ObfuscatedName("ob.U")
	public static JagString field2283 = JagString.wrap("col=");
	@ObfuscatedName("ob.hb")
	public static JagString field2295 = JagString.wrap(")4col");
	@ObfuscatedName("ob.nb")
	public static JagString field2301 = JagString.wrap("str=");
	@ObfuscatedName("ob.tb")
	public static JagString field2307 = JagString.wrap("str");
	@ObfuscatedName("ob.db")
	public static JagString field2291 = JagString.wrap(")4str");
	@ObfuscatedName("ob.gb")
	public static JagString field2294 = JagString.wrap("u=");
	@ObfuscatedName("ob.ub")
	public static JagString field2308 = JagString.wrap("u");
	@ObfuscatedName("ob.P")
	public static JagString field2279 = JagString.wrap(")4u");
	@ObfuscatedName("ob.ab")
	public static JagString field2288 = JagString.wrap("shad=");
	@ObfuscatedName("ob.vb")
	public static JagString field2309 = JagString.wrap("shad");
	@ObfuscatedName("ob.mb")
	public static JagString field2300 = JagString.wrap(")4shad");
	@ObfuscatedName("ob.bb")
	public int[] charAdvance;

	@ObfuscatedName("ob.eb")
	public int ascent = 0;

	@ObfuscatedName("ob.fb")
	public int[] glyphHeight;

	@ObfuscatedName("ob.ib")
	public static Pix8[] modicons;

	@ObfuscatedName("ob.kb")
	public int maxDescent;

	@ObfuscatedName("ob.lb")
	public static int underline = -1;

	@ObfuscatedName("ob.ob")
	public static int strikeout = -1;

	@ObfuscatedName("ob.pb")
	public static int alpha = 256;

	@ObfuscatedName("ob.qb")
	public static int extraSpacePos = 0;

	@ObfuscatedName("ob.rb")
	public static int field2305 = -1;

	@ObfuscatedName("ob.sb")
	public byte[] kerningPairs;

	@ObfuscatedName("ob.wb")
	public static int field2310 = 0;

	@ObfuscatedName("ob.R")
	public static int currentShadow = -1;

	@ObfuscatedName("ob.Q")
	public static int extraSpaceWidth = 0;

	@ObfuscatedName("ob.Z")
	public static int field2287 = 0;

	@ObfuscatedName("ob.zb")
	public static Random rand = new Random();

	@ObfuscatedName("ob.Ab")
	public static JagString[] lines = new JagString[100];

	@ObfuscatedName("ob.xb")
	public byte[][] glyphs = new byte[256][];

	@ObfuscatedName("ob.X")
	public int[] glyphOffsetX;

	@ObfuscatedName("ob.Y")
	public int[] glyphOffsetY;

	@ObfuscatedName("ob.V")
	public int[] glyphWidth;

	@ObfuscatedName("ob.O")
	public int maxAscent;

	@ObfuscatedName("ob.a([BIIIII)V")
	public static void plotLetter(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg1 + arg2 * Pix2D.width;
		int var7 = Pix2D.width - arg3;
		int var8 = 0;
		int var9 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var10 = Pix2D.clipMinY - arg2;
			arg4 -= var10;
			arg2 = Pix2D.clipMinY;
			var9 = var10 * arg3;
			var6 += var10 * Pix2D.width;
		}
		if (arg2 + arg4 > Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinX) {
			int var11 = Pix2D.clipMinX - arg1;
			arg3 -= var11;
			arg1 = Pix2D.clipMinX;
			var9 += var11;
			var6 += var11;
			var8 = var11;
			var7 += var11;
		}
		if (arg1 + arg3 > Pix2D.clipMaxX) {
			int var12 = arg1 + arg3 - Pix2D.clipMaxX;
			arg3 -= var12;
			var8 += var12;
			var7 += var12;
		}
		if (arg3 > 0 && arg4 > 0) {
			plot(Pix2D.pixels, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
		}
	}

	@ObfuscatedName("ob.a([I[BIIIIIIII)V")
	public static void plotTrans(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		int var11 = 256 - arg9;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					int var14 = arg0[arg4];
					arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("ob.b([BIIIIII)V")
	public static void plotLetterTrans(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
		if (arg2 + arg4 > Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
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
		if (arg1 + arg3 > Pix2D.clipMaxX) {
			int var13 = arg1 + arg3 - Pix2D.clipMaxX;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			plotTrans(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
		}
	}

	@ObfuscatedName("ob.a([I[BIIIIIII)V")
	public static void plot(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = -(arg5 >> 2);
		int var10 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
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
			for (int var13 = var10; var13 < 0; var13++) {
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

	@ObfuscatedName("ob.a([[B[[B[I[I[III)I")
	public static int kernPair(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
		int var7 = arg2[arg5];
		int var8 = var7 + arg4[arg5];
		int var9 = arg2[arg6];
		int var10 = var9 + arg4[arg6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		int var13 = arg3[arg5];
		if (arg3[arg6] < var13) {
			var13 = arg3[arg6];
		}
		byte[] var14 = arg1[arg5];
		byte[] var15 = arg0[arg6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		return -var13;
	}

	public PixFont(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
		this.glyphOffsetX = arg1;
		this.glyphOffsetY = arg2;
		this.glyphWidth = arg3;
		this.glyphHeight = arg4;
		this.unpackMetrics(arg0);
		this.glyphs = arg6;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		for (int var10 = 0; var10 < 256; var10++) {
			if (this.glyphOffsetY[var10] < var8 && this.glyphHeight[var10] != 0) {
				var8 = this.glyphOffsetY[var10];
			}
			if (this.glyphOffsetY[var10] + this.glyphHeight[var10] > var9) {
				var9 = this.glyphOffsetY[var10] + this.glyphHeight[var10];
			}
		}
		this.maxAscent = this.ascent - var8;
		this.maxDescent = var9 - this.ascent;
	}

	public PixFont(byte[] arg0) {
		this.unpackMetrics(arg0);
	}

	@ObfuscatedName("ob.b(Lec;)Lec;")
	public static JagString escape(JagString arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			byte var4 = arg0.data[var3];
			// < || >
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}
		JagString var5 = new JagString();
		var5.length = var1 + var2;
		var5.data = new byte[var5.length];
		int var6 = 0;
		for (int var7 = 0; var7 < var1; var7++) {
			byte var8 = arg0.data[var7];
			if (var8 == 60) { // <
				// <lt>
				var5.data[var6++] = 60;
				var5.data[var6++] = 108;
				var5.data[var6++] = 116;
				var5.data[var6++] = 62;
			} else if (var8 == 62) { // >
				// <gt>
				var5.data[var6++] = 60;
				var5.data[var6++] = 103;
				var5.data[var6++] = 116;
				var5.data[var6++] = 62;
			} else {
				var5.data[var6++] = var8;
			}
		}
		return var5;
	}

	@ObfuscatedName("ob.a(Lec;IIIIIIIII)I")
	public final int drawStringMultiline(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.resetState(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.ascent;
		}
		int[] var11 = new int[] { arg3 };
		if (arg4 < this.maxAscent + this.maxDescent + arg9 && arg4 < arg9 + arg9) {
			var11 = null;
		}
		int var12 = this.splitString(arg0, var11, lines);
		if (arg8 == 3 && var12 == 1) {
			arg8 = 1;
		}
		int var13;
		if (arg8 == 0) {
			var13 = arg2 + this.maxAscent;
		} else if (arg8 == 1) {
			var13 = arg2 + this.maxAscent + (arg4 - this.maxAscent - this.maxDescent - (var12 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			var13 = arg2 + arg4 - this.maxDescent - (var12 - 1) * arg9;
		} else {
			int var14 = (arg4 - this.maxAscent - this.maxDescent - (var12 - 1) * arg9) / (var12 + 1);
			if (var14 < 0) {
				var14 = 0;
			}
			var13 = arg2 + this.maxAscent + var14;
			arg9 += var14;
		}
		for (int var15 = 0; var15 < var12; var15++) {
			if (arg7 == 0) {
				this.drawStringInner(lines[var15], arg1, var13);
			} else if (arg7 == 1) {
				this.drawStringInner(lines[var15], arg1 + (arg3 - this.stringWid(lines[var15])) / 2, var13);
			} else if (arg7 == 2) {
				this.drawStringInner(lines[var15], arg1 + arg3 - this.stringWid(lines[var15]), var13);
			} else if (var15 == var12 - 1) {
				this.drawStringInner(lines[var15], arg1, var13);
			} else {
				this.calculateSpaceWidth(lines[var15], arg3);
				this.drawStringInner(lines[var15], arg1, var13);
				extraSpaceWidth = 0;
			}
			var13 += arg9;
		}
		return var12;
	}

	@ObfuscatedName("ob.a(Lec;)I")
	public final int stringWid(JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = -1;
		int var3 = -1;
		int var4 = 0;
		for (int var5 = 0; var5 < arg0.length; var5++) {
			int var6 = arg0.data[var5] & 0xFF;
			if (var6 == 60) {
				var2 = var5;
			} else {
				if (var6 == 62 && var2 != -1) {
					JagString var7 = arg0.substring(var2 + 1, var5);
					var2 = -1;
					if (var7.strEquals(field2290)) {
						var6 = 60;
					} else {
						if (!var7.strEquals(field2297)) {
							if (var7.startsWith(field2282)) {
								try {
									int var8 = var7.substring(4).checkedParseInt();
									var4 += modicons[var8].owi;
									var3 = -1;
								} catch (Exception var9) {
								}
							}
							continue;
						}
						var6 = 62;
					}
				}
				if (var2 == -1) {
					var4 += this.charAdvance[var6];
					if (this.kerningPairs != null && var3 != -1) {
						var4 += this.kerningPairs[(var3 << 8) + var6];
					}
					var3 = var6;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("ob.a(Lec;I)V")
	public void calculateSpaceWidth(JagString arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			int var6 = arg0.charAt(var5);
			if (var6 == 60) { // <
				var4 = true;
			} else if (var6 == 62) { // >
				var4 = false;
			} else if (!var4 && var6 == 32) { // ' '
				var3++;
			}
		}
		if (var3 > 0) {
			extraSpaceWidth = (arg1 - this.stringWid(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("ob.a([BIIIIII)V")
	public abstract void plotLetterTransScanline(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("ob.a([B)V")
	public void unpackMetrics(byte[] arg0) {
		this.charAdvance = new int[256];
		if (arg0.length == 257) {
			for (int var2 = 0; var2 < this.charAdvance.length; var2++) {
				this.charAdvance[var2] = arg0[var2] & 0xFF;
			}
			this.ascent = arg0[256] & 0xFF;
			return;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < 256; var4++) {
			this.charAdvance[var4] = arg0[var3++] & 0xFF;
		}
		int[] var5 = new int[256];
		int[] var6 = new int[256];
		for (int var7 = 0; var7 < 256; var7++) {
			var5[var7] = arg0[var3++] & 0xFF;
		}
		for (int var8 = 0; var8 < 256; var8++) {
			var6[var8] = arg0[var3++] & 0xFF;
		}
		byte[][] var9 = new byte[256][];
		for (int var10 = 0; var10 < 256; var10++) {
			var9[var10] = new byte[var5[var10]];
			byte var11 = 0;
			for (int var12 = 0; var12 < var9[var10].length; var12++) {
				var11 += arg0[var3++];
				var9[var10][var12] = var11;
			}
		}
		byte[][] var13 = new byte[256][];
		for (int var14 = 0; var14 < 256; var14++) {
			var13[var14] = new byte[var5[var14]];
			byte var15 = 0;
			for (int var16 = 0; var16 < var13[var14].length; var16++) {
				var15 += arg0[var3++];
				var13[var14][var16] = var15;
			}
		}
		this.kerningPairs = new byte[65536];
		for (int var17 = 0; var17 < 256; var17++) {
			if (var17 != 32 && var17 != 160) {
				for (int var18 = 0; var18 < 256; var18++) {
					if (var18 != 32 && var18 != 160) {
						this.kerningPairs[(var17 << 8) + var18] = (byte) kernPair(var9, var13, var6, this.charAdvance, var5, var17, var18);
					}
				}
			}
		}
		this.ascent = var6[32] + var5[32];
	}

	@ObfuscatedName("ob.b(Lec;I)I")
	public final int predictLinesMultiline(JagString arg0, int arg1) {
		return this.splitString(arg0, new int[] { arg1 }, lines);
	}

	@ObfuscatedName("ob.e(I)I")
	public int charWid(int arg0) {
		return this.charAdvance[arg0 & 0xFF];
	}

	@ObfuscatedName("ob.a(Lec;IIII)V")
	public final void rightString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.resetState(arg3, arg4);
			this.drawStringInner(arg0, arg1 - this.stringWid(arg0), arg2);
		}
	}

	@ObfuscatedName("ob.a(Lec;IIIII)V")
	public final void drawStringAntiMacro(JagString arg0, int arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return;
		}
		this.resetState(16777215, 0);
		rand.setSeed((long) arg3);
		alpha = (rand.nextInt() & 0x1F) + 192;
		int[] var5 = new int[arg0.length];
		int var6 = 0;
		for (int var7 = 0; var7 < arg0.length; var7++) {
			var5[var7] = var6;
			if ((rand.nextInt() & 0x3) == 0) {
				var6++;
			}
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1, arg2, var5, null);
	}

	@ObfuscatedName("ob.a(Lec;II[I[I)V")
	public void drawStringInnerCustomOffsetsAndColours(JagString arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		int var6 = arg2 - this.ascent;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.length; var10++) {
			int var11 = arg0.data[var10] & 0xFF;
			if (var11 == 60) {
				var7 = var10;
			} else {
				if (var11 == 62 && var7 != -1) {
					JagString var12 = arg0.substring(var7 + 1, var10);
					var7 = -1;
					if (var12.strEquals(field2290)) {
						var11 = 60;
					} else {
						if (!var12.strEquals(field2297)) {
							if (var12.startsWith(field2282)) {
								try {
									int var13;
									if (arg3 == null) {
										var13 = 0;
									} else {
										var13 = arg3[var9];
									}
									int var14;
									if (arg4 == null) {
										var14 = 0;
									} else {
										var14 = arg4[var9];
									}
									var9++;
									int var15 = var12.substring(4).checkedParseInt();
									Pix8 var16 = modicons[var15];
									var16.plotSprite(arg1 + var13, var6 + this.ascent - var16.ohi + var14);
									arg1 += var16.owi;
									var8 = -1;
								} catch (Exception var22) {
								}
							} else {
								this.updateState(var12);
							}
							continue;
						}
						var11 = 62;
					}
				}
				if (var7 == -1) {
					if (this.kerningPairs != null && var8 != -1) {
						arg1 += this.kerningPairs[(var8 << 8) + var11];
					}
					int var17 = this.glyphWidth[var11];
					int var18 = this.glyphHeight[var11];
					int var19;
					if (arg3 == null) {
						var19 = 0;
					} else {
						var19 = arg3[var9];
					}
					int var20;
					if (arg4 == null) {
						var20 = 0;
					} else {
						var20 = arg4[var9];
					}
					var9++;
					if (var11 == 32) {
						if (extraSpaceWidth > 0) {
							extraSpacePos += extraSpaceWidth;
							arg1 += extraSpacePos >> 8;
							extraSpacePos &= 0xFF;
						}
					} else if (alpha == 256) {
						if (currentShadow != -1) {
							plotLetter(this.glyphs[var11], arg1 + this.glyphOffsetX[var11] + var19 + 1, var6 + this.glyphOffsetY[var11] + 1 + var20, var17, var18, currentShadow);
						}
						this.plotLetterScanline(this.glyphs[var11], arg1 + this.glyphOffsetX[var11] + var19, var6 + this.glyphOffsetY[var11] + var20, var17, var18, field2310);
					} else {
						if (currentShadow != -1) {
							plotLetterTrans(this.glyphs[var11], arg1 + this.glyphOffsetX[var11] + var19 + 1, var6 + this.glyphOffsetY[var11] + 1 + var20, var17, var18, currentShadow, alpha);
						}
						this.plotLetterTransScanline(this.glyphs[var11], arg1 + this.glyphOffsetX[var11] + var19, var6 + this.glyphOffsetY[var11] + var20, var17, var18, field2310, alpha);
					}
					int var21 = this.charAdvance[var11];
					if (strikeout != -1) {
						Pix2D.hline(arg1, var6 + (int) ((double) this.ascent * 0.7D), var21, strikeout);
					}
					if (underline != -1) {
						Pix2D.hline(arg1, var6 + this.ascent, var21, underline);
					}
					arg1 += var21;
					var8 = var11;
				}
			}
		}
	}

	@ObfuscatedName("ob.b(II)V")
	public void resetState(int arg0, int arg1) {
		strikeout = -1;
		underline = -1;
		field2305 = arg1;
		currentShadow = arg1;
		field2287 = arg0;
		field2310 = arg0;
		alpha = 256;
		extraSpaceWidth = 0;
		extraSpacePos = 0;
	}

	@ObfuscatedName("ob.a(Lec;[I[Lec;)I")
	public int splitString(JagString arg0, int[] arg1, JagString[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		int var4 = 0;
		int var5 = 0;
		JagString var6 = JagString.newStringBuilder(100);
		int var7 = -1;
		int var8 = 0;
		byte var9 = 0;
		int var10 = -1;
		int var11 = -1;
		int var12 = 0;
		int var13 = arg0.length();
		for (int var14 = 0; var14 < var13; var14++) {
			int var15 = arg0.charAt(var14);
			if (var15 == 60) {
				var10 = var14;
			} else {
				if (var15 == 62 && var10 != -1) {
					JagString var16 = arg0.substring(var10 + 1, var14);
					var10 = -1;
					var6.append(60);
					var6.append(var16);
					var6.append(62);
					if (var16.strEquals(field2312)) {
						arg2[var12++] = var6.substring(var5, var6.length());
						var5 = var6.length();
						var4 = 0;
						var7 = -1;
						var11 = -1;
					} else if (var16.strEquals(field2290)) {
						var4 += this.charWid(60);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 60];
						}
						var11 = 60;
					} else if (var16.strEquals(field2297)) {
						var4 += this.charWid(62);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 62];
						}
						var11 = 62;
					} else if (var16.startsWith(field2282)) {
						try {
							int var17 = var16.substring(4).checkedParseInt();
							var4 += modicons[var17].owi;
							var11 = -1;
						} catch (Exception var18) {
						}
					}
					var15 = -1;
				}
				if (var10 == -1) {
					if (var15 != -1) {
						var6.append(var15);
						var4 += this.charWid(var15);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + var15];
						}
						var11 = var15;
					}
					if (var15 == 32) {
						var7 = var6.length();
						var8 = var4;
						var9 = 1;
					}
					if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
						arg2[var12++] = var6.substring(var5, var7 - var9);
						var5 = var7;
						var7 = -1;
						var4 -= var8;
						var11 = -1;
					}
					if (var15 == 45) {
						var7 = var6.length();
						var8 = var4;
						var9 = 0;
					}
				}
			}
		}
		if (var6.length() > var5) {
			arg2[var12++] = var6.substring(var5, var6.length());
		}
		return var12;
	}

	@ObfuscatedName("ob.b(Lec;IIIII)V")
	public final void centreStringWave(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.resetState(arg3, 0);
		int[] var6 = new int[arg0.length];
		for (int var7 = 0; var7 < arg0.length; var7++) {
			var6[var7] = (int) (Math.sin((double) var7 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1 - this.stringWid(arg0) / 2, arg2, null, var6);
	}

	@ObfuscatedName("ob.c(Lec;)V")
	public void updateState(JagString arg0) {
		try {
			if (arg0.startsWith(field2283)) {
				field2310 = arg0.substring(4).checkedParseInt(16);
				return;
			}
			if (arg0.strEquals(field2295)) {
				field2310 = field2287;
				return;
			}
			if (arg0.startsWith(field2301)) {
				strikeout = arg0.substring(4).checkedParseInt(16);
				return;
			}
			if (arg0.strEquals(field2307)) {
				strikeout = 8388608;
				return;
			}
			if (arg0.strEquals(field2291)) {
				strikeout = -1;
				return;
			}
			if (arg0.startsWith(field2294)) {
				underline = arg0.substring(2).checkedParseInt(16);
				return;
			}
			if (arg0.strEquals(field2308)) {
				underline = 0;
				return;
			}
			if (arg0.strEquals(field2279)) {
				underline = -1;
				return;
			}
			if (arg0.startsWith(field2288)) {
				currentShadow = arg0.substring(5).checkedParseInt(16);
				return;
			}
			if (arg0.strEquals(field2309)) {
				currentShadow = 0;
				return;
			}
			if (arg0.strEquals(field2300)) {
				currentShadow = field2305;
				return;
			}
			if (arg0.strEquals(field2312)) {
				this.resetState(field2287, field2305);
				return;
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("ob.a(Lec;II)V")
	public void drawStringInner(JagString arg0, int arg1, int arg2) {
		int var4 = arg2 - this.ascent;
		int var5 = -1;
		int var6 = -1;
		for (int var7 = 0; var7 < arg0.length; var7++) {
			int var8 = arg0.data[var7] & 0xFF;
			if (var8 == 60) {
				var5 = var7;
			} else {
				if (var8 == 62 && var5 != -1) {
					JagString var9 = arg0.substring(var5 + 1, var7);
					var5 = -1;
					if (var9.strEquals(field2290)) {
						var8 = 60;
					} else {
						if (!var9.strEquals(field2297)) {
							if (var9.startsWith(field2282)) {
								try {
									int var10 = var9.substring(4).checkedParseInt();
									Pix8 var11 = modicons[var10];
									var11.plotSprite(arg1, var4 + this.ascent - var11.ohi);
									arg1 += var11.owi;
									var6 = -1;
								} catch (Exception var15) {
								}
							} else {
								this.updateState(var9);
							}
							continue;
						}
						var8 = 62;
					}
				}
				if (var5 == -1) {
					if (this.kerningPairs != null && var6 != -1) {
						arg1 += this.kerningPairs[(var6 << 8) + var8];
					}
					int var12 = this.glyphWidth[var8];
					int var13 = this.glyphHeight[var8];
					if (var8 == 32) {
						if (extraSpaceWidth > 0) {
							extraSpacePos += extraSpaceWidth;
							arg1 += extraSpacePos >> 8;
							extraSpacePos &= 0xFF;
						}
					} else if (alpha == 256) {
						if (currentShadow != -1) {
							plotLetter(this.glyphs[var8], arg1 + this.glyphOffsetX[var8] + 1, var4 + this.glyphOffsetY[var8] + 1, var12, var13, currentShadow);
						}
						this.plotLetterScanline(this.glyphs[var8], arg1 + this.glyphOffsetX[var8], var4 + this.glyphOffsetY[var8], var12, var13, field2310);
					} else {
						if (currentShadow != -1) {
							plotLetterTrans(this.glyphs[var8], arg1 + this.glyphOffsetX[var8] + 1, var4 + this.glyphOffsetY[var8] + 1, var12, var13, currentShadow, alpha);
						}
						this.plotLetterTransScanline(this.glyphs[var8], arg1 + this.glyphOffsetX[var8], var4 + this.glyphOffsetY[var8], var12, var13, field2310, alpha);
					}
					int var14 = this.charAdvance[var8];
					if (strikeout != -1) {
						Pix2D.hline(arg1, var4 + (int) ((double) this.ascent * 0.7D), var14, strikeout);
					}
					if (underline != -1) {
						Pix2D.hline(arg1, var4 + this.ascent + 1, var14, underline);
					}
					arg1 += var14;
					var6 = var8;
				}
			}
		}
	}

	@ObfuscatedName("ob.b([BIIIII)V")
	public abstract void plotLetterScanline(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ob.c(Lec;IIIII)V")
	public final void centreStringWave2(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.resetState(arg3, 0);
		int[] var6 = new int[arg0.length];
		int[] var7 = new int[arg0.length];
		for (int var8 = 0; var8 < arg0.length; var8++) {
			var6[var8] = (int) (Math.sin((double) var8 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			var7[var8] = (int) (Math.sin((double) var8 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1 - this.stringWid(arg0) / 2, arg2, var6, var7);
	}

	@ObfuscatedName("ob.c(Lec;I)I")
	public final int predictWidthMultiline(JagString arg0, int arg1) {
		int var3 = this.splitString(arg0, new int[] { arg1 }, lines);
		int var4 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.stringWid(lines[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}
		return var4;
	}

	@ObfuscatedName("ob.a(Lec;IIIIII)V")
	public final void centreStringWave3(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.resetState(arg3, 0);
		double var7 = 7.0D - (double) arg5 / 8.0D;
		if (var7 < 0.0D) {
			var7 = 0.0D;
		}
		int[] var9 = new int[arg0.length];
		for (int var10 = 0; var10 < arg0.length; var10++) {
			var9[var10] = (int) (Math.sin((double) var10 / 1.5D + (double) arg4) * var7);
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1 - this.stringWid(arg0) / 2, arg2, null, var9);
	}

	@ObfuscatedName("ob.b(Lec;IIII)V")
	public final void drawString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.resetState(arg3, arg4);
			this.drawStringInner(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("ob.c(Lec;IIII)V")
	public final void centreString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.resetState(arg3, arg4);
			this.drawStringInner(arg0, arg1 - this.stringWid(arg0) / 2, arg2);
		}
	}
}
