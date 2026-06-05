package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("b")
public final class Texture {

	@ObfuscatedName("q.Mc")
	public static final int[] gammaLut = new int[256];
	@ObfuscatedName("we.y")
	public static TextureProvider textureProvider;
	@ObfuscatedName("de.B")
	public static Js5 sprites;
	@ObfuscatedName("gd.v")
	public static int width;
	@ObfuscatedName("bj.xb")
	public static int[] columnLut;
	@ObfuscatedName("di.gb")
	public static int aspectScale;
	@ObfuscatedName("cd.j")
	public static int height;
	@ObfuscatedName("e.fb")
	public static int widthMask;
	@ObfuscatedName("kb.o")
	public static int[] rowLut;
	@ObfuscatedName("ub.ab")
	public static int heightMask;
	@ObfuscatedName("tg.i")
	public static double lastGamma = -1.0D;
	@ObfuscatedName("b.a")
	public final TextureOp[] ops;

	@ObfuscatedName("b.c")
	public final TextureOp alphaOp;

	@ObfuscatedName("b.f")
	public final int[] spriteIds;

	@ObfuscatedName("b.l")
	public final TextureOp colourOp;

	@ObfuscatedName("b.q")
	public final int[] textureIds;

	public Texture() {
		this.spriteIds = new int[0];
		this.textureIds = new int[0];
		this.colourOp = new TextureOpMonoFill();
		this.colourOp.opacity = 1;
		this.alphaOp = new TextureOpMonoFill();
		this.ops = new TextureOp[] { this.colourOp, this.alphaOp};
		this.alphaOp.opacity = 1;
	}

	public Texture(Packet arg0) {
		int var2 = arg0.g1();
		this.ops = new TextureOp[var2];
		int var3 = 0;
		int var4 = 0;
		int[][] var5 = new int[var2][];
		for (int var6 = 0; var6 < var2; var6++) {
			TextureOp var7 = decodeOp(arg0);
			if (var7.getImageId() >= 0) {
				var4++;
			}
			if (var7.getSpriteId() >= 0) {
				var3++;
			}
			int var8 = var7.inputs.length;
			var5[var6] = new int[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				var5[var6][var9] = arg0.g1();
			}
			this.ops[var6] = var7;
		}
		this.spriteIds = new int[var4];
		this.textureIds = new int[var3];
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < var2; var12++) {
			TextureOp var13 = this.ops[var12];
			int var14 = var13.inputs.length;
			for (int var15 = 0; var15 < var14; var15++) {
				var13.inputs[var15] = this.ops[var5[var12][var15]];
			}
			int var16 = var13.getImageId();
			int var17 = var13.getSpriteId();
			if (var16 > 0) {
				this.spriteIds[var10++] = var16;
			}
			if (var17 > 0) {
				this.textureIds[var11++] = var17;
			}
			var5[var12] = null;
		}
		this.colourOp = this.ops[arg0.g1()];
		this.alphaOp = this.ops[arg0.g1()];
	}

	@ObfuscatedName("vd.a(IB)Lc;")
	public static TextureOp createOp(int arg0) {
		if (arg0 == 0) {
			return new TextureOpMonoFill();
		} else if (arg0 == 1) {
			return new TextureOpColourFill();
		} else if (arg0 == 2) {
			return new TextureOpMonoConst();
		} else if (arg0 == 3) {
			return new TextureOpMonoAnim();
		} else if (arg0 == 4) {
			return new TextureOpClouds();
		} else if (arg0 == 5) {
			return new TextureOpBoxBlur();
		} else if (arg0 == 6) {
			return new TextureOpClamp();
		} else if (arg0 == 7) {
			return new TextureOpCombine();
		} else if (arg0 == 8) {
			return new TextureOpCurve();
		} else if (arg0 == 9) {
			return new TextureOpFlip();
		} else if (arg0 == 10) {
			return new TextureOpColourRamp();
		} else if (arg0 == 11) {
			return new TextureOpColourize();
		} else if (arg0 == 12) {
			return new TextureOpRadial();
		} else if (arg0 == 13) {
			return new TextureOpHashNoise();
		} else if (arg0 == 14) {
			return new TextureOpFrame();
		} else if (arg0 == 15) {
			return new TextureOpVoronoi();
		} else if (arg0 == 16) {
			return new TextureOpBrick();
		} else if (arg0 == 17) {
			return new TextureOpHSL();
		} else if (arg0 == 18) {
			return new TextureOpImageTile();
		} else if (arg0 == 19) {
			return new TextureOpDisplace();
		} else if (arg0 == 20) {
			return new TextureOpPixelate();
		} else if (arg0 == 21) {
			return new TextureOpLerp();
		} else if (arg0 == 22) {
			return new TextureOpInvert();
		} else if (arg0 == 23) {
			return new TextureOpPolar();
		} else if (arg0 == 24) {
			return new TextureOpGrayscale();
		} else if (arg0 == 25) {
			return new TextureOpChromaReplace();
		} else if (arg0 == 26) {
			return new TextureOpThreshold();
		} else if (arg0 == 27) {
			return new TextureOpStripes();
		} else if (arg0 == 28) {
			return new TextureOpWood();
		} else if (arg0 == 29) {
			return new TextureOpVector();
		} else if (arg0 == 30) {
			return new TextureOpRemap();
		} else if (arg0 == 31) {
			return new TextureOpMandelbrot();
		} else if (arg0 == 32) {
			return new TextureOpLighting();
		} else if (arg0 == 33) {
			return new TextureOpNormalMap();
		} else if (arg0 == 34) {
			return new TextureOpSineWaves();
		} else if (arg0 == 35) {
			return new TextureOpEdgeDetect();
		} else if (arg0 == 36) {
			return new TextureOpSprite();
		} else if (arg0 == 37) {
			return new TextureOpStar();
		} else if (arg0 == 38) {
			return new TextureOpSparkle();
		} else if (arg0 == 39) {
			return new TextureOpImage();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ig.a(ILea;)Lc;")
	public static TextureOp decodeOp(Packet arg0) {
		arg0.g1();
		int var1 = arg0.g1();
		TextureOp var2 = createOp(var1);
		var2.opacity = arg0.g1();
		int var3 = arg0.g1();
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = arg0.g1();
			var2.decode(arg0, var5);
		}
		var2.postDecode();
		return var2;
	}

	@ObfuscatedName("dj.a(DB)V")
	public static void buildGammaLut(double arg0) {
		if (lastGamma == arg0) {
			return;
		}
		for (int var2 = 0; var2 < 256; var2++) {
			int var3 = (int) (Math.pow((double) var2 / 255.0D, arg0) * 255.0D);
			gammaLut[var2] = var3 <= 255 ? var3 : 255;
		}
		lastGamma = arg0;
	}

	@ObfuscatedName("ki.a(III)V")
	public static void setDimensions(int arg0, int arg1) {
		if (width != arg0) {
			columnLut = new int[arg0];
			for (int var2 = 0; var2 < arg0; var2++) {
				columnLut[var2] = (var2 << 12) / arg0;
			}
			aspectScale = arg0 == 64 ? 2048 : 4096;
			width = arg0;
			widthMask = arg0 - 1;
		}
		if (arg1 == height) {
			return;
		}
		if (width == arg1) {
			rowLut = columnLut;
		} else {
			rowLut = new int[arg1];
			for (int var3 = 0; var3 < arg1; var3++) {
				rowLut[var3] = (var3 << 12) / arg1;
			}
		}
		height = arg1;
		heightMask = arg1 - 1;
	}

	@ObfuscatedName("b.a(DIZLnb;Lfe;IIZ)[I")
	public int[] render(double arg0, int arg1, boolean arg2, Js5 arg3, TextureProvider arg4, int arg5, boolean arg6) {
		buildGammaLut(arg0);
		textureProvider = arg4;
		sprites = arg3;
		setDimensions(arg1, arg5);
		for (int var9 = 0; var9 < this.ops.length; var9++) {
			this.ops[var9].createCache(arg1, arg5);
		}
		int[] var10 = new int[arg5 * arg1];
		int var11;
		int var12;
		byte var13;
		if (arg6) {
			var11 = -1;
			var12 = arg1 - 1;
			var13 = -1;
		} else {
			var12 = 0;
			var11 = arg1;
			var13 = 1;
		}
		int var14 = 0;
		for (int var15 = 0; var15 < arg5; var15++) {
			if (arg2) {
				var14 = var15;
			}
			int[] var17;
			int[] var18;
			int[] var19;
			if (this.colourOp.monochrome) {
				int[] var20 = this.colourOp.renderMono(var15);
				var18 = var20;
				var17 = var20;
				var19 = var20;
			} else {
				int[][] var16 = this.colourOp.renderColour(var15);
				var17 = var16[1];
				var18 = var16[0];
				var19 = var16[2];
			}
			for (int var21 = var12; var21 != var11; var21 += var13) {
				int var22 = var18[var21] >> 4;
				if (var22 > 255) {
					var22 = 255;
				}
				if (var22 < 0) {
					var22 = 0;
				}
				int var23 = gammaLut[var22];
				int var24 = var17[var21] >> 4;
				if (var24 > 255) {
					var24 = 255;
				}
				int var25 = var19[var21] >> 4;
				if (var24 < 0) {
					var24 = 0;
				}
				if (var25 > 255) {
					var25 = 255;
				}
				int var26 = gammaLut[var24];
				if (var25 < 0) {
					var25 = 0;
				}
				int var27 = gammaLut[var25];
				var10[var14++] = var27 + (var26 << 8) + (var23 << 16);
				if (arg2) {
					var14 += arg1 - 1;
				}
			}
		}
		for (int var28 = 0; var28 < this.ops.length; var28++) {
			this.ops[var28].clearCache();
		}
		return var10;
	}

	@ObfuscatedName("b.a(Lfe;Lnb;I)Z")
	public boolean isReady(TextureProvider arg0, Js5 arg1) {
		for (int var3 = 0; var3 < this.spriteIds.length; var3++) {
			if (!arg1.requestDownload(this.spriteIds[var3])) {
				return false;
			}
		}
		for (int var4 = 0; var4 < this.textureIds.length; var4++) {
			if (!arg0.isLoaded(this.textureIds[var4])) {
				return false;
			}
		}
		return true;
	}
}
