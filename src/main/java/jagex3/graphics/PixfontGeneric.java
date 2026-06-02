package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.jstring.JagString;

import java.util.Random;

@ObfuscatedName("cc")
public abstract class PixfontGeneric extends Linkable2 {

	@ObfuscatedName("cc.ab")
	public int[] glyphWidth;

	@ObfuscatedName("cc.bb")
	public int[] modiconHeight;

	@ObfuscatedName("cc.cb")
	public static final JagString tagCopy = JagString.wrap("copy");

	@ObfuscatedName("cc.db")
	public int[] charAdvance;

	@ObfuscatedName("cc.eb")
	public static int strikeout = -1;

	@ObfuscatedName("cc.fb")
	public static final JagString tagGt = JagString.wrap("gt");

	@ObfuscatedName("cc.gb")
	public static int extraSpaceWidth = 0;

	@ObfuscatedName("cc.hb")
	public static final JagString tagTrans = JagString.wrap("trans=");

	@ObfuscatedName("cc.ib")
	public static final JagString tagShy = JagString.wrap("shy");

	@ObfuscatedName("cc.jb")
	public static final JagString tagShad = JagString.wrap("shad");

	@ObfuscatedName("cc.kb")
	public static final JagString tagCol = JagString.wrap("col=");

	@ObfuscatedName("cc.lb")
	public static final JagString tagEndStr = JagString.wrap(")4str");

	@ObfuscatedName("cc.mb")
	public static final JagString tagLt = JagString.wrap("lt");

	@ObfuscatedName("cc.nb")
	public static final JagString tagEndTrans = JagString.wrap(")4trans");

	@ObfuscatedName("cc.ob")
	public static final JagString tagEndCol = JagString.wrap(")4col");

	@ObfuscatedName("cc.pb")
	public static int currentCol = 0;

	@ObfuscatedName("cc.qb")
	public static final JagString tagU = JagString.wrap("u");

	@ObfuscatedName("cc.rb")
	public static final JagString tagStr = JagString.wrap("str");

	@ObfuscatedName("cc.sb")
	public static final JagString tagImg = JagString.wrap("img=");

	@ObfuscatedName("cc.tb")
	public int[] glyphOffsetY;

	@ObfuscatedName("cc.ub")
	public static final JagString[] lines = new JagString[100];

	@ObfuscatedName("cc.vb")
	public static int alpha = 256;

	@ObfuscatedName("cc.H")
	public static final JagString tagBr = JagString.wrap("br");

	@ObfuscatedName("cc.M")
	public static final JagString tagShadEquals = JagString.wrap("shad=");

	@ObfuscatedName("cc.I")
	public static final JagString tagTimes = JagString.wrap("times");

	@ObfuscatedName("cc.Q")
	public static final JagString tagNbsp = JagString.wrap("nbsp");

	@ObfuscatedName("cc.J")
	public static final JagString tagReg = JagString.wrap("reg");

	@ObfuscatedName("cc.D")
	public static final JagString tagEuro = JagString.wrap("euro");

	@ObfuscatedName("cc.T")
	public static int defaultAlpha = 256;

	@ObfuscatedName("cc.Z")
	public static int currentShadow = -1;

	@ObfuscatedName("cc.L")
	public static int extraSpacePos = 0;

	@ObfuscatedName("cc.K")
	public static final JagString tagEndShad = JagString.wrap(")4shad");

	@ObfuscatedName("cc.R")
	public static final JagString tagStrEquals = JagString.wrap("str=");

	@ObfuscatedName("cc.S")
	public static final JagString tagEndU = JagString.wrap(")4u");

	@ObfuscatedName("cc.P")
	public static int defaultCol = 0;

	@ObfuscatedName("cc.W")
	public static int defaultShadow = -1;

	@ObfuscatedName("cc.V")
	public static final JagString tagUEquals = JagString.wrap("u=");

	@ObfuscatedName("cc.G")
	public static int underline = -1;

	@ObfuscatedName("cc.N")
	public int ascent = 0;

	@ObfuscatedName("cc.X")
	public int[] glyphOffsetX;

	@ObfuscatedName("cc.F")
	public int[] glyphHeight;

	@ObfuscatedName("cc.O")
	public int maxAscent;

	@ObfuscatedName("cc.Y")
	public int maxDescent;

	@ObfuscatedName("cc.E")
	public byte[] kerningPairs;

	@ObfuscatedName("cc.U")
	public Pix8[] modicons;

	@ObfuscatedName("cc.a([[B[[B[I[I[III)I")
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

	@ObfuscatedName("cc.c(Li;)Li;")
	public static JagString escape(JagString arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			byte var4 = arg0.chars[var3];
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}
		JagString var5 = new JagString();
		var5.length = var1 + var2;
		var5.chars = new byte[var5.length];
		int var6 = 0;
		for (int var7 = 0; var7 < var1; var7++) {
			byte var8 = arg0.chars[var7];
			if (var8 == 60) {
				var5.chars[var6++] = 60;
				var5.chars[var6++] = 108;
				var5.chars[var6++] = 116;
				var5.chars[var6++] = 62;
			} else if (var8 == 62) {
				var5.chars[var6++] = 60;
				var5.chars[var6++] = 103;
				var5.chars[var6++] = 116;
				var5.chars[var6++] = 62;
			} else {
				var5.chars[var6++] = var8;
			}
		}
		return var5;
	}

	public PixfontGeneric(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
		this.glyphOffsetX = arg1;
		this.glyphOffsetY = arg2;
		this.glyphWidth = arg3;
		this.glyphHeight = arg4;
		this.unpackMetrics(arg0);
		int var6 = Integer.MAX_VALUE;
		int var7 = Integer.MIN_VALUE;
		for (int var8 = 0; var8 < 256; var8++) {
			if (this.glyphOffsetY[var8] < var6 && this.glyphHeight[var8] != 0) {
				var6 = this.glyphOffsetY[var8];
			}
			if (this.glyphOffsetY[var8] + this.glyphHeight[var8] > var7) {
				var7 = this.glyphOffsetY[var8] + this.glyphHeight[var8];
			}
		}
		this.maxAscent = this.ascent - var6;
		this.maxDescent = var7 - this.ascent;
	}

	public PixfontGeneric(byte[] arg0) {
		this.unpackMetrics(arg0);
	}

	@ObfuscatedName("cc.a(Li;II)V")
	public void drawStringInner(JagString arg0, int arg1, int arg2) {
		int var4 = arg2 - this.ascent;
		int var5 = -1;
		int var6 = -1;
		for (int var7 = 0; var7 < arg0.length; var7++) {
			int var8 = arg0.chars[var7] & 0xFF;
			if (var8 == 60) {
				var5 = var7;
			} else {
				if (var8 == 62 && var5 != -1) {
					JagString var9 = arg0.substring(var5 + 1, var7);
					var5 = -1;
					if (var9.strEquals(tagLt)) {
						var8 = 60;
					} else if (var9.strEquals(tagGt)) {
						var8 = 62;
					} else if (var9.strEquals(tagNbsp)) {
						var8 = 160;
					} else if (var9.strEquals(tagShy)) {
						var8 = 173;
					} else if (var9.strEquals(tagTimes)) {
						var8 = 215;
					} else if (var9.strEquals(tagEuro)) {
						var8 = 128;
					} else if (var9.strEquals(tagCopy)) {
						var8 = 169;
					} else {
						if (!var9.strEquals(tagReg)) {
							if (var9.startsWith(tagImg)) {
								try {
									int var10 = var9.substring(4).method603();
									Pix8 var11 = this.modicons[var10];
									int var12 = this.modiconHeight == null ? var11.ohi : this.modiconHeight[var10];
									if (alpha == 256) {
										var11.plotSprite(arg1, var4 + this.ascent - var12);
									} else {
										var11.transPlotSprite(arg1, var4 + this.ascent - var12, alpha);
									}
									arg1 += var11.owi;
									var6 = -1;
								} catch (Exception var16) {
								}
							} else {
								this.updateState(var9);
							}
							continue;
						}
						var8 = 174;
					}
				}
				if (var5 == -1) {
					if (this.kerningPairs != null && var6 != -1) {
						arg1 += this.kerningPairs[(var6 << 8) + var8];
					}
					int var13 = this.glyphWidth[var8];
					int var14 = this.glyphHeight[var8];
					if (var8 == 32) {
						if (extraSpaceWidth > 0) {
							extraSpacePos += extraSpaceWidth;
							arg1 += extraSpacePos >> 8;
							extraSpacePos &= 0xFF;
						}
					} else if (alpha == 256) {
						if (currentShadow != -1) {
							this.plotLetter(var8, arg1 + this.glyphOffsetX[var8] + 1, var4 + this.glyphOffsetY[var8] + 1, var13, var14, currentShadow);
						}
						this.plotLetterScanline(var8, arg1 + this.glyphOffsetX[var8], var4 + this.glyphOffsetY[var8], var13, var14, currentCol);
					} else {
						if (currentShadow != -1) {
							this.plotLetterTrans(var8, arg1 + this.glyphOffsetX[var8] + 1, var4 + this.glyphOffsetY[var8] + 1, var13, var14, currentShadow, alpha);
						}
						this.plotLetterTransScanline(var8, arg1 + this.glyphOffsetX[var8], var4 + this.glyphOffsetY[var8], var13, var14, currentCol, alpha);
					}
					int var15 = this.charAdvance[var8];
					if (strikeout != -1) {
						Pix2D.hline(arg1, var4 + (int) ((double) this.ascent * 0.7D), var15, strikeout);
					}
					if (underline != -1) {
						Pix2D.hline(arg1, var4 + this.ascent + 1, var15, underline);
					}
					arg1 += var15;
					var6 = var8;
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Li;I)V")
	public void calculateSpaceWidth(JagString arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			int var6 = arg0.charAt(var5);
			if (var6 == 60) {
				var4 = true;
			} else if (var6 == 62) {
				var4 = false;
			} else if (!var4 && var6 == 32) {
				var3++;
			}
		}
		if (var3 > 0) {
			extraSpaceWidth = (arg1 - this.stringWid(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("cc.d(I)I")
	public int charWid(int arg0) {
		return this.charAdvance[arg0 & 0xFF];
	}

	@ObfuscatedName("cc.a(Li;[I[Li;)I")
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
					if (var16.strEquals(tagBr)) {
						arg2[var12++] = var6.substring(var5, var6.length());
						var5 = var6.length();
						var4 = 0;
						var7 = -1;
						var11 = -1;
					} else if (var16.strEquals(tagLt)) {
						var4 += this.charWid(60);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 60];
						}
						var11 = 60;
					} else if (var16.strEquals(tagGt)) {
						var4 += this.charWid(62);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 62];
						}
						var11 = 62;
					} else if (var16.strEquals(tagNbsp)) {
						var4 += this.charWid(160);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 160];
						}
						var11 = 160;
					} else if (var16.strEquals(tagShy)) {
						var4 += this.charWid(173);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 173];
						}
						var11 = 173;
					} else if (var16.strEquals(tagTimes)) {
						var4 += this.charWid(215);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 215];
						}
						var11 = 215;
					} else if (var16.strEquals(tagEuro)) {
						var4 += this.charWid(128);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 128];
						}
						var11 = 128;
					} else if (var16.strEquals(tagCopy)) {
						var4 += this.charWid(169);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 169];
						}
						var11 = 169;
					} else if (var16.strEquals(tagReg)) {
						var4 += this.charWid(174);
						if (this.kerningPairs != null && var11 != -1) {
							var4 += this.kerningPairs[(var11 << 8) + 174];
						}
						var11 = 174;
					} else if (var16.startsWith(tagImg)) {
						try {
							int var17 = var16.substring(4).method603();
							var4 += this.modicons[var17].owi;
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

	@ObfuscatedName("cc.a(Li;IIII)V")
	public final void centreString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.resetState(arg3, arg4);
			this.drawStringInner(arg0, arg1 - this.stringWid(arg0) / 2, arg2);
		}
	}

	@ObfuscatedName("cc.a(IIIIII)V")
	public abstract void plotLetter(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("cc.b(IIIIII)V")
	public abstract void plotLetterScanline(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("cc.a(Li;IIIII)V")
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

	@ObfuscatedName("cc.b(Li;IIIII)V")
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

	@ObfuscatedName("cc.a(III)V")
	public void resetStateAlpha(int arg0, int arg1, int arg2) {
		strikeout = -1;
		underline = -1;
		defaultShadow = arg1;
		currentShadow = arg1;
		defaultCol = arg0;
		currentCol = arg0;
		defaultAlpha = arg2;
		alpha = arg2;
		extraSpaceWidth = 0;
		extraSpacePos = 0;
	}

	@ObfuscatedName("cc.a(IIIIIII)V")
	public abstract void plotLetterTransScanline(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("cc.a([B)V")
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

	@ObfuscatedName("cc.a([Llj;[I)V")
	public final void setIcons(Pix8[] arg0, int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.modicons = arg0;
		this.modiconHeight = arg1;
	}

	@ObfuscatedName("cc.b(Li;IIII)V")
	public final void rightString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.resetState(arg3, arg4);
			this.drawStringInner(arg0, arg1 - this.stringWid(arg0), arg2);
		}
	}

	@ObfuscatedName("cc.a(Li;II[I[I)V")
	public void drawStringInnerCustomOffsetsAndColours(JagString arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		int var6 = arg2 - this.ascent;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.length; var10++) {
			int var11 = arg0.chars[var10] & 0xFF;
			if (var11 == 60) {
				var7 = var10;
			} else {
				if (var11 == 62 && var7 != -1) {
					JagString var12 = arg0.substring(var7 + 1, var10);
					var7 = -1;
					if (var12.strEquals(tagLt)) {
						var11 = 60;
					} else if (var12.strEquals(tagGt)) {
						var11 = 62;
					} else if (var12.strEquals(tagNbsp)) {
						var11 = 160;
					} else if (var12.strEquals(tagShy)) {
						var11 = 173;
					} else if (var12.strEquals(tagTimes)) {
						var11 = 215;
					} else if (var12.strEquals(tagEuro)) {
						var11 = 128;
					} else if (var12.strEquals(tagCopy)) {
						var11 = 169;
					} else {
						if (!var12.strEquals(tagReg)) {
							if (var12.startsWith(tagImg)) {
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
									int var15 = var12.substring(4).method603();
									Pix8 var16 = this.modicons[var15];
									int var17 = this.modiconHeight == null ? var16.ohi : this.modiconHeight[var15];
									if (alpha == 256) {
										var16.plotSprite(arg1 + var13, var6 + this.ascent - var17 + var14);
									} else {
										var16.transPlotSprite(arg1 + var13, var6 + this.ascent - var17 + var14, alpha);
									}
									arg1 += var16.owi;
									var8 = -1;
								} catch (Exception var23) {
								}
							} else {
								this.updateState(var12);
							}
							continue;
						}
						var11 = 174;
					}
				}
				if (var7 == -1) {
					if (this.kerningPairs != null && var8 != -1) {
						arg1 += this.kerningPairs[(var8 << 8) + var11];
					}
					int var18 = this.glyphWidth[var11];
					int var19 = this.glyphHeight[var11];
					int var20;
					if (arg3 == null) {
						var20 = 0;
					} else {
						var20 = arg3[var9];
					}
					int var21;
					if (arg4 == null) {
						var21 = 0;
					} else {
						var21 = arg4[var9];
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
							this.plotLetter(var11, arg1 + this.glyphOffsetX[var11] + var20 + 1, var6 + this.glyphOffsetY[var11] + 1 + var21, var18, var19, currentShadow);
						}
						this.plotLetterScanline(var11, arg1 + this.glyphOffsetX[var11] + var20, var6 + this.glyphOffsetY[var11] + var21, var18, var19, currentCol);
					} else {
						if (currentShadow != -1) {
							this.plotLetterTrans(var11, arg1 + this.glyphOffsetX[var11] + var20 + 1, var6 + this.glyphOffsetY[var11] + 1 + var21, var18, var19, currentShadow, alpha);
						}
						this.plotLetterTransScanline(var11, arg1 + this.glyphOffsetX[var11] + var20, var6 + this.glyphOffsetY[var11] + var21, var18, var19, currentCol, alpha);
					}
					int var22 = this.charAdvance[var11];
					if (strikeout != -1) {
						Pix2D.hline(arg1, var6 + (int) ((double) this.ascent * 0.7D), var22, strikeout);
					}
					if (underline != -1) {
						Pix2D.hline(arg1, var6 + this.ascent, var22, underline);
					}
					arg1 += var22;
					var8 = var11;
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Li;IIIIIIIIII)I")
	public int drawStringMultilineCore(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.resetStateAlpha(arg5, arg6, 256);
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

	@ObfuscatedName("cc.a(Li;IIIIIIIII)I")
	public final int drawStringMultiline(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		return this.drawStringMultilineCore(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("cc.c(Li;IIII)V")
	public final void drawString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.resetState(arg3, arg4);
			this.drawStringInner(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("cc.a(Li;)V")
	public void updateState(JagString arg0) {
		try {
			if (arg0.startsWith(tagCol)) {
				currentCol = arg0.substring(4).method607(16);
				return;
			}
			if (arg0.strEquals(tagEndCol)) {
				currentCol = defaultCol;
				return;
			}
			if (arg0.startsWith(tagTrans)) {
				alpha = arg0.substring(6).method603();
				return;
			}
			if (arg0.strEquals(tagEndTrans)) {
				alpha = defaultAlpha;
				return;
			}
			if (arg0.startsWith(tagStrEquals)) {
				strikeout = arg0.substring(4).method607(16);
				return;
			}
			if (arg0.strEquals(tagStr)) {
				strikeout = 8388608;
				return;
			}
			if (arg0.strEquals(tagEndStr)) {
				strikeout = -1;
				return;
			}
			if (arg0.startsWith(tagUEquals)) {
				underline = arg0.substring(2).method607(16);
				return;
			}
			if (arg0.strEquals(tagU)) {
				underline = 0;
				return;
			}
			if (arg0.strEquals(tagEndU)) {
				underline = -1;
				return;
			}
			if (arg0.startsWith(tagShadEquals)) {
				currentShadow = arg0.substring(5).method607(16);
				return;
			}
			if (arg0.strEquals(tagShad)) {
				currentShadow = 0;
				return;
			}
			if (arg0.strEquals(tagEndShad)) {
				currentShadow = defaultShadow;
				return;
			}
			if (arg0.strEquals(tagBr)) {
				this.resetStateAlpha(defaultCol, defaultShadow, defaultAlpha);
				return;
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("cc.b(Li;I)I")
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

	@ObfuscatedName("cc.b(Li;)I")
	public final int stringWid(JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = -1;
		int var3 = -1;
		int var4 = 0;
		for (int var5 = 0; var5 < arg0.length; var5++) {
			int var6 = arg0.chars[var5] & 0xFF;
			if (var6 == 60) {
				var2 = var5;
			} else {
				if (var6 == 62 && var2 != -1) {
					JagString var7 = arg0.substring(var2 + 1, var5);
					var2 = -1;
					if (var7.strEquals(tagLt)) {
						var6 = 60;
					} else if (var7.strEquals(tagGt)) {
						var6 = 62;
					} else if (var7.strEquals(tagNbsp)) {
						var6 = 160;
					} else if (var7.strEquals(tagShy)) {
						var6 = 173;
					} else if (var7.strEquals(tagTimes)) {
						var6 = 215;
					} else if (var7.strEquals(tagEuro)) {
						var6 = 128;
					} else if (var7.strEquals(tagCopy)) {
						var6 = 169;
					} else {
						if (!var7.strEquals(tagReg)) {
							if (var7.startsWith(tagImg)) {
								try {
									int var8 = var7.substring(4).method603();
									var4 += this.modicons[var8].owi;
									var3 = -1;
								} catch (Exception var9) {
								}
							}
							continue;
						}
						var6 = 174;
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

	@ObfuscatedName("cc.b(IIIIIII)V")
	public abstract void plotLetterTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("cc.b(II)V")
	public void resetState(int arg0, int arg1) {
		strikeout = -1;
		underline = -1;
		defaultShadow = arg1;
		currentShadow = arg1;
		defaultCol = arg0;
		currentCol = arg0;
		defaultAlpha = 256;
		alpha = 256;
		extraSpaceWidth = 0;
		extraSpacePos = 0;
	}

	@ObfuscatedName("cc.c(Li;I)I")
	public final int predictLinesMultiline(JagString arg0, int arg1) {
		return this.splitString(arg0, new int[] { arg1 }, lines);
	}

	@ObfuscatedName("cc.a(Li;IIIIII)V")
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

	@ObfuscatedName("cc.a(Li;IIIILjava/util/Random;I)I")
	public final int drawStringAntiMacro(JagString arg0, int arg1, int arg2, Random arg3, int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.resetStateAlpha(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		int[] var6 = new int[arg0.length];
		int var7 = 0;
		for (int var8 = 0; var8 < arg0.length; var8++) {
			var6[var8] = var7;
			if ((arg3.nextInt() & 0x3) == 0) {
				var7++;
			}
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1, arg2, var6, null);
		return var7;
	}
}
