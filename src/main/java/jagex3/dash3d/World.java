package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.ClientBuild;
import jagex3.datastruct.LinkList;

public class World {
	@ObfuscatedName("ff.bb")
	public static final int LEVELS = 4;
	@ObfuscatedName("ff.db")
	public static final Occlude[][] occluders = new Occlude[LEVELS][500];
	@ObfuscatedName("ff.cb")
	public static final int[] numOccluders = new int[LEVELS];
	@ObfuscatedName("ng.Xb")
	public static final Sprite[] dynamicSprites = new Sprite[5000];
	@ObfuscatedName("w.n")
	public static final Sprite[] spriteBuffer = new Sprite[100];
	@ObfuscatedName("v.F")
	public static final int[] POSTTAB = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	@ObfuscatedName("ka.a")
	public static final int[] PRETAB = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	@ObfuscatedName("ij.N")
	public static final int[] MIDTAB = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	@ObfuscatedName("eh.I")
	public static final int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	@ObfuscatedName("ub.S")
	public static final int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	@ObfuscatedName("je.y")
	public static final int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	@ObfuscatedName("ec.P")
	public static final int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	@ObfuscatedName("ug.o")
	public static final int[][] MINIMAP_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	@ObfuscatedName("bd.m")
	public static final int[][] MINIMAP_ROTATE = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	@ObfuscatedName("og.T")
	public static final Occlude[] activeOccluders = new Occlude[500];
	@ObfuscatedName("jg.z")
	public static final LinkList fillQueue = new LinkList();
	@ObfuscatedName("bb.e")
	public static Square[][][] field211;
	@ObfuscatedName("nc.h")
	public static int[][][] groundh;
	@ObfuscatedName("ec.K")
	public static int maxTileX;
	@ObfuscatedName("fj.p")
	public static int maxTileZ;
	@ObfuscatedName("vi.e")
	public static int[][][] occlusionCycle;
	@ObfuscatedName("nh.c")
	public static int visibilityRadius;
	@ObfuscatedName("bf.O")
	public static boolean[][] visibilityMap;
	@ObfuscatedName("ec.E")
	public static boolean[][] visibilityMapBuffer;
	@ObfuscatedName("cf.m")
	public static Square[][][] squares;
	@ObfuscatedName("aj.R")
	public static int maxTileLevel;
	@ObfuscatedName("cb.a")
	public static int dynamicCount = 0;
	@ObfuscatedName("gh.x")
	public static int cx;
	@ObfuscatedName("ti.x")
	public static int cz;
	@ObfuscatedName("wb.a")
	public static int cy;
	@ObfuscatedName("ki.o")
	public static boolean click = false;
	@ObfuscatedName("ke.G")
	public static int groundX = -1;
	@ObfuscatedName("de.P")
	public static int clickX = 0;
	@ObfuscatedName("da.qb")
	public static int clickY = 0;
	@ObfuscatedName("ib.I")
	public static int groundZ = -1;
	@ObfuscatedName("jf.X")
	public static boolean lowMem = true;
	@ObfuscatedName("na.u")
	public static int cycleNo;
	@ObfuscatedName("ja.b")
	public static int cameraSinX;
	@ObfuscatedName("se.g")
	public static int cameraCosX;
	@ObfuscatedName("pe.H")
	public static int cameraSinY;
	@ObfuscatedName("og.K")
	public static int cameraCosY;
	@ObfuscatedName("i.L")
	public static int gz;
	@ObfuscatedName("hb.bb")
	public static int gx;
	@ObfuscatedName("mb.U")
	public static int clickLev = 0;
	@ObfuscatedName("ae.Xb")
	public static int maxX;
	@ObfuscatedName("wg.y")
	public static int[] field4510;
	@ObfuscatedName("od.w")
	public static int minX;
	@ObfuscatedName("ha.B")
	public static Square[][][] field1416;
	@ObfuscatedName("qb.R")
	public static int fillLeft = 0;
	@ObfuscatedName("oi.g")
	public static int minLevel = 0;
	@ObfuscatedName("jd.f")
	public static int minZ;
	@ObfuscatedName("va.x")
	public static int maxZ;
	@ObfuscatedName("oc.v")
	public static int maxLevel = 0;
	@ObfuscatedName("ge.C")
	public static int numActiveOccluders = 0;

	@ObfuscatedName("ej.a(Lih;IIIIIIIZ)V")
	public static void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9;
		int var10 = var9 = (arg6 << 7) - cx;
		int var11;
		int var12 = var11 = (arg7 << 7) - cz;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = ClientBuild.groundh[arg1][arg6][arg7] - cy;
		int var18 = ClientBuild.groundh[arg1][arg6 + 1][arg7] - cy;
		int var19 = ClientBuild.groundh[arg1][arg6 + 1][arg7 + 1] - cy;
		int var20 = ClientBuild.groundh[arg1][arg6][arg7 + 1] - cy;
		int var21 = var12 * arg4 + var10 * arg5 >> 16;
		int var22 = var12 * arg5 - var10 * arg4 >> 16;
		int var24 = var17 * arg3 - var22 * arg2 >> 16;
		int var25 = var17 * arg2 + var22 * arg3 >> 16;
		if (var25 < 50) {
			return;
		}
		int var27 = var11 * arg4 + var14 * arg5 >> 16;
		int var28 = var11 * arg5 - var14 * arg4 >> 16;
		int var30 = var18 * arg3 - var28 * arg2 >> 16;
		int var31 = var18 * arg2 + var28 * arg3 >> 16;
		if (var31 < 50) {
			return;
		}
		int var33 = var16 * arg4 + var13 * arg5 >> 16;
		int var34 = var16 * arg5 - var13 * arg4 >> 16;
		int var36 = var19 * arg3 - var34 * arg2 >> 16;
		int var37 = var19 * arg2 + var34 * arg3 >> 16;
		if (var37 < 50) {
			return;
		}
		int var39 = var15 * arg4 + var9 * arg5 >> 16;
		int var40 = var15 * arg5 - var9 * arg4 >> 16;
		int var42 = var20 * arg3 - var40 * arg2 >> 16;
		int var43 = var20 * arg2 + var40 * arg3 >> 16;
		if (var43 < 50) {
			return;
		}
		int var44 = Pix3D.originX + (var21 << 9) / var25;
		int var45 = Pix3D.originY + (var24 << 9) / var25;
		int var46 = Pix3D.originX + (var27 << 9) / var31;
		int var47 = Pix3D.originY + (var30 << 9) / var31;
		int var48 = Pix3D.originX + (var33 << 9) / var37;
		int var49 = Pix3D.originY + (var36 << 9) / var37;
		int var50 = Pix3D.originX + (var39 << 9) / var43;
		int var51 = Pix3D.originY + (var42 << 9) / var43;
		Pix3D.trans = 0;
		if ((var48 - var50) * (var47 - var51) - (var49 - var51) * (var46 - var50) > 0) {
			if (click && insideTriangle(clickX + Pix3D.originX, clickY + Pix3D.originY, var49, var51, var47, var48, var50, var46)) {
				groundX = arg6;
				groundZ = arg7;
			}
			if (!arg8) {
				Pix3D.hclip = false;
				if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix3D.sizeX || var50 > Pix3D.sizeX || var46 > Pix3D.sizeX) {
					Pix3D.hclip = true;
				}
				if (arg0.texture == -1) {
					if (arg0.colourNE != 12345678) {
						Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.colourNW, arg0.colourSE);
					}
				} else if (lowMem) {
					int var52 = Pix3D.textureManager.getAverageRgb(arg0.texture);
					Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, adjustHslLightness(var52, arg0.colourNE), adjustHslLightness(var52, arg0.colourNW), adjustHslLightness(var52, arg0.colourSE));
				} else if (arg0.flat) {
					Pix3D.textureTriangleAffine(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.colourNW, arg0.colourSE, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.texture);
				} else {
					Pix3D.textureTriangleAffine(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.colourNW, arg0.colourSE, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.texture);
				}
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		if (click && insideTriangle(clickX + Pix3D.originX, clickY + Pix3D.originY, var45, var47, var51, var44, var46, var50)) {
			groundX = arg6;
			groundZ = arg7;
		}
		if (arg8) {
			return;
		}
		Pix3D.hclip = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix3D.sizeX || var46 > Pix3D.sizeX || var50 > Pix3D.sizeX) {
			Pix3D.hclip = true;
		}
		if (arg0.texture != -1) {
			if (!lowMem) {
				Pix3D.textureTriangleAffine(var45, var47, var51, var44, var46, var50, arg0.colourSW, arg0.colourSE, arg0.colourNW, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.texture);
				return;
			}
			int var53 = Pix3D.textureManager.getAverageRgb(arg0.texture);
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, adjustHslLightness(var53, arg0.colourSW), adjustHslLightness(var53, arg0.colourSE), adjustHslLightness(var53, arg0.colourNW));
		} else if (arg0.colourSW != 12345678) {
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, arg0.colourSW, arg0.colourSE, arg0.colourNW);
		}
	}

	@ObfuscatedName("nj.a(IIIIIIII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.minTileX = arg2 / 128;
		var8.maxTileX = arg3 / 128;
		var8.minTileZ = arg4 / 128;
		var8.maxTileZ = arg5 / 128;
		var8.type = arg1;
		var8.minX = arg2;
		var8.maxX = arg3;
		var8.minZ = arg4;
		var8.maxZ = arg5;
		var8.minY = arg6;
		var8.maxY = arg7;
		occluders[arg0][numOccluders[arg0]++] = var8;
	}

	@ObfuscatedName("b.a(IIIIIIIIIIIIIIIIIIII)V")
	public static void setGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var20 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var21 = arg0; var21 >= 0; var21--) {
				if (squares[var21][arg1][arg2] == null) {
					squares[var21][arg1][arg2] = new Square(var21, arg1, arg2);
				}
			}
			squares[arg0][arg1][arg2].quickGround = var20;
		} else if (arg3 == 1) {
			QuickGround var22 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var23 = arg0; var23 >= 0; var23--) {
				if (squares[var23][arg1][arg2] == null) {
					squares[var23][arg1][arg2] = new Square(var23, arg1, arg2);
				}
			}
			squares[arg0][arg1][arg2].quickGround = var22;
		} else {
			Ground var24 = new Ground(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var25 = arg0; var25 >= 0; var25--) {
				if (squares[var25][arg1][arg2] == null) {
					squares[var25][arg1][arg2] = new Square(var25, arg1, arg2);
				}
			}
			squares[arg0][arg1][arg2].ground = var24;
		}
	}

	@ObfuscatedName("ka.a(IIIILnc;Lnc;IIJ)V")
	public static void setWall(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		Wall var10 = new Wall();
		var10.typecode = arg8;
		var10.x = arg1 * 128 + 64;
		var10.z = arg2 * 128 + 64;
		var10.y = arg3;
		var10.modelA = arg4;
		var10.modelB = arg5;
		var10.typeA = arg6;
		var10.typeB = arg7;
		for (int var11 = arg0; var11 >= 0; var11--) {
			if (squares[var11][arg1][arg2] == null) {
				squares[var11][arg1][arg2] = new Square(var11, arg1, arg2);
			}
		}
		squares[arg0][arg1][arg2].wall = var10;
	}

	@ObfuscatedName("qe.a(IIII)V")
	public static void method1277() {
		field211 = new Square[4][104][104];
		groundh = new int[4][105][105];
		method131();
		maxTileX = 104;
		maxTileZ = 104;
		occlusionCycle = new int[4][105][105];
		resetMap();
		visibilityRadius = 25;
		visibilityMap = new boolean[visibilityRadius + visibilityRadius + 1][visibilityRadius + visibilityRadius + 1];
		visibilityMapBuffer = new boolean[visibilityRadius + visibilityRadius + 2][visibilityRadius + visibilityRadius + 2];
	}

	@ObfuscatedName("ca.a(Z)V")
	public static void method131() {
		ClientBuild.groundh = groundh;
		squares = field211;
		maxTileLevel = squares.length;
	}

	@ObfuscatedName("hh.a()V")
	public static void resetMap() {
		for (int var0 = 0; var0 < maxTileLevel; var0++) {
			for (int var1 = 0; var1 < maxTileX; var1++) {
				for (int var2 = 0; var2 < maxTileZ; var2++) {
					squares[var0][var1][var2] = null;
				}
			}
		}
		for (int var3 = 0; var3 < LEVELS; var3++) {
			for (int var4 = 0; var4 < numOccluders[var3]; var4++) {
				occluders[var3][var4] = null;
			}
			numOccluders[var3] = 0;
		}
		for (int var5 = 0; var5 < dynamicCount; var5++) {
			dynamicSprites[var5] = null;
		}
		dynamicCount = 0;
		for (int var6 = 0; var6 < spriteBuffer.length; var6++) {
			spriteBuffer[var6] = null;
		}
	}

	@ObfuscatedName("af.a(III)V")
	public static void delDecor(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 != null) {
			var3.decor = null;
		}
	}

	@ObfuscatedName("sh.a(III)Ljj;")
	public static Sprite getScene(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 == null) {
			return null;
		}
		for (int var4 = 0; var4 < var3.spriteCount; var4++) {
			Sprite var5 = var3.sprites[var4];
			if ((var5.typecode >> 29 & 0x3L) == 2L && var5.minTileX == arg1 && var5.minTileZ == arg2) {
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("kc.a(IIIIIIIILnc;IZJ)Z")
	public static boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, long arg11) {
		for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
			for (int var14 = arg2; var14 < arg2 + arg4; var14++) {
				if (var13 < 0 || var14 < 0 || var13 >= maxTileX || var14 >= maxTileZ) {
					return false;
				}
				Square var15 = squares[arg0][var13][var14];
				if (var15 != null && var15.spriteCount >= 5) {
					return false;
				}
			}
		}
		Sprite var16 = new Sprite();
		var16.typecode = arg11;
		var16.level = arg0;
		var16.x = arg5;
		var16.z = arg6;
		var16.y = arg7;
		var16.model = arg8;
		var16.yaw = arg9;
		var16.minTileX = arg1;
		var16.minTileZ = arg2;
		var16.maxTileX = arg1 + arg3 - 1;
		var16.maxTileZ = arg2 + arg4 - 1;
		for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
			for (int var18 = arg2; var18 < arg2 + arg4; var18++) {
				int var19 = 0;
				if (var17 > arg1) {
					var19++;
				}
				if (var17 < arg1 + arg3 - 1) {
					var19 += 4;
				}
				if (var18 > arg2) {
					var19 += 8;
				}
				if (var18 < arg2 + arg4 - 1) {
					var19 += 2;
				}
				for (int var20 = arg0; var20 >= 0; var20--) {
					if (squares[var20][var17][var18] == null) {
						squares[var20][var17][var18] = new Square(var20, var17, var18);
					}
				}
				Square var21 = squares[arg0][var17][var18];
				var21.sprites[var21.spriteCount] = var16;
				var21.spriteSpan[var21.spriteCount] = var19;
				var21.spriteSpans |= var19;
				var21.spriteCount++;
			}
		}
		if (arg10) {
			dynamicSprites[dynamicCount++] = var16;
		}
		return true;
	}

	@ObfuscatedName("ui.a(IIIILnc;Lnc;IIIIJ)V")
	public static void setDecor(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
		if (arg4 == null) {
			return;
		}
		Decor var12 = new Decor();
		var12.typecode = arg10;
		var12.x = arg1 * 128 + 64;
		var12.z = arg2 * 128 + 64;
		var12.y = arg3;
		var12.model = arg4;
		var12.model2 = arg5;
		var12.wshape = arg6;
		var12.yof = arg7;
		var12.xof = arg8;
		var12.zof = arg9;
		for (int var13 = arg0; var13 >= 0; var13--) {
			if (squares[var13][arg1][arg2] == null) {
				squares[var13][arg1][arg2] = new Square(var13, arg1, arg2);
			}
		}
		squares[arg0][arg1][arg2].decor = var12;
	}

	@ObfuscatedName("wc.a(Lnc;IIIII)V")
	public static void shareLightLoc(ModelSource arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var6 = true;
		int var7 = arg2;
		int var8 = arg2 + arg4;
		int var9 = arg3 - 1;
		int var10 = arg3 + arg5;
		for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
			if (var11 != maxTileLevel) {
				for (int var12 = var7; var12 <= var8; var12++) {
					if (var12 >= 0 && var12 < maxTileX) {
						for (int var13 = var9; var13 <= var10; var13++) {
							if (var13 >= 0 && var13 < maxTileZ && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && var12 != arg2)) {
								Square var14 = squares[var11][var12][var13];
								if (var14 != null) {
									int var15 = (ClientBuild.groundh[var11][var12][var13] + ClientBuild.groundh[var11][var12 + 1][var13] + ClientBuild.groundh[var11][var12][var13 + 1] + ClientBuild.groundh[var11][var12 + 1][var13 + 1]) / 4 - (ClientBuild.groundh[arg1][arg2][arg3] + ClientBuild.groundh[arg1][arg2 + 1][arg3] + ClientBuild.groundh[arg1][arg2][arg3 + 1] + ClientBuild.groundh[arg1][arg2 + 1][arg3 + 1]) / 4;
									Wall var16 = var14.wall;
									if (var16 != null) {
										if (var16.modelA.method544()) {
											arg0.method570(var16.modelA, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
										}
										if (var16.modelB != null && var16.modelB.method544()) {
											arg0.method570(var16.modelB, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
										}
									}
									for (int var17 = 0; var17 < var14.spriteCount; var17++) {
										Sprite var18 = var14.sprites[var17];
										if (var18 != null && var18.model.method544() && (var12 == var18.minTileX || var12 == var7) && (var13 == var18.minTileZ || var13 == var9)) {
											int var19 = var18.maxTileX + 1 - var18.minTileX;
											int var20 = var18.maxTileZ + 1 - var18.minTileZ;
											arg0.method570(var18.model, (var18.minTileX - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.minTileZ - arg3) * 128 + (var20 - arg5) * 64, var6);
										}
									}
								}
							}
						}
					}
				}
				var7--;
				var6 = false;
			}
		}
	}

	@ObfuscatedName("vh.a(IIII)V")
	public static void setLayer(int arg0, int arg1, int arg2, int arg3) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 != null) {
			squares[arg0][arg1][arg2].drawLevel = arg3;
		}
	}

	@ObfuscatedName("lf.a(IIIIILnc;IJZ)Z")
	public static boolean addDynamic(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, long arg7, boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		int var10 = arg1 - arg4;
		int var11 = arg2 - arg4;
		int var12 = arg1 + arg4;
		int var13 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				var13 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				var12 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				var11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				var10 -= 128;
			}
		}
		int var14 = var10 / 128;
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		return setSprite(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@ObfuscatedName("aj.a(III)V")
	public static void delWall(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 != null) {
			var3.wall = null;
		}
	}

	@ObfuscatedName("w.a(III)Z")
	public static boolean groundOccluded(int arg0, int arg1, int arg2) {
		int var3 = occlusionCycle[arg0][arg1][arg2];
		if (var3 == -cycleNo) {
			return false;
		} else if (var3 == cycleNo) {
			return true;
		} else {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			if (occluded(var4 + 1, ClientBuild.groundh[arg0][arg1][arg2], var5 + 1) && occluded(var4 + 128 - 1, ClientBuild.groundh[arg0][arg1 + 1][arg2], var5 + 1) && occluded(var4 + 128 - 1, ClientBuild.groundh[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && occluded(var4 + 1, ClientBuild.groundh[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
				occlusionCycle[arg0][arg1][arg2] = cycleNo;
				return true;
			} else {
				occlusionCycle[arg0][arg1][arg2] = -cycleNo;
				return false;
			}
		}
	}

	@ObfuscatedName("ph.a(III)V")
	public static void shareLight() {
		for (int var0 = 0; var0 < maxTileLevel; var0++) {
			for (int var1 = 0; var1 < maxTileX; var1++) {
				for (int var2 = 0; var2 < maxTileZ; var2++) {
					Square var3 = squares[var0][var1][var2];
					if (var3 != null) {
						Wall var4 = var3.wall;
						if (var4 != null && var4.modelA.method544()) {
							shareLightLoc(var4.modelA, var0, var1, var2, 1, 1);
							if (var4.modelB != null && var4.modelB.method544()) {
								shareLightLoc(var4.modelB, var0, var1, var2, 1, 1);
								var4.modelA.method570(var4.modelB, 0, 0, 0, false);
								var4.modelB = var4.modelB.method559();
							}
							var4.modelA = var4.modelA.method559();
						}
						for (int var5 = 0; var5 < var3.spriteCount; var5++) {
							Sprite var6 = var3.sprites[var5];
							if (var6 != null && var6.model.method544()) {
								shareLightLoc(var6.model, var0, var1, var2, var6.maxTileX + 1 - var6.minTileX, var6.maxTileZ - var6.minTileZ + 1);
								var6.model = var6.model.method559();
							}
						}
						GroundDecor var7 = var3.groundDecor;
						if (var7 != null && var7.model.method544()) {
							shareLightGd(var7.model, var0, var1, var2);
							var7.model = var7.model.method559();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ig.a(IIIILnc;JLnc;Lnc;)V")
	public static void setObj(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, long arg5, ModelSource arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.topObj = arg4;
		var9.x = arg1 * 128 + 64;
		var9.z = arg2 * 128 + 64;
		var9.y = arg3;
		var9.typecode = arg5;
		var9.bottomObj = arg6;
		var9.middleObj = arg7;
		int var10 = 0;
		Square var11 = squares[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.spriteCount; var12++) {
				Sprite var13 = var11.sprites[var12];
				if ((var13.typecode & 0x400000L) == 4194304L) {
					int var14 = var13.model.method88();
					if (var14 != -32768 && var14 < var10) {
						var10 = var14;
					}
				}
			}
		}
		var9.height = -var10;
		if (squares[arg0][arg1][arg2] == null) {
			squares[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		squares[arg0][arg1][arg2].groundObject = var9;
	}

	@ObfuscatedName("ng.a(Lnc;III)V")
	public static void shareLightGd(ModelSource arg0, int arg1, int arg2, int arg3) {
		if (arg2 < maxTileX) {
			Square var4 = squares[arg1][arg2 + 1][arg3];
			if (var4 != null && var4.groundDecor != null && var4.groundDecor.model.method544()) {
				arg0.method570(var4.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg3 < maxTileX) {
			Square var5 = squares[arg1][arg2][arg3 + 1];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.model.method544()) {
				arg0.method570(var5.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg2 < maxTileX && arg3 < maxTileZ) {
			Square var6 = squares[arg1][arg2 + 1][arg3 + 1];
			if (var6 != null && var6.groundDecor != null && var6.groundDecor.model.method544()) {
				arg0.method570(var6.groundDecor.model, 128, 0, 128, true);
			}
		}
		if (arg2 < maxTileX && arg3 > 0) {
			Square var7 = squares[arg1][arg2 + 1][arg3 - 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.method544()) {
				arg0.method570(var7.groundDecor.model, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("sf.a(IIIJ)Z")
	public static boolean method1386(int arg0, int arg1, int arg2, long arg3) {
		Square var5 = squares[arg0][arg1][arg2];
		if (var5 == null) {
			return false;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
			return true;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return true;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return true;
		} else {
			for (int var6 = 0; var6 < var5.spriteCount; var6++) {
				if (var5.sprites[var6].typecode == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("ki.a(III[[[BIBII)V")
	public static void method803(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, int arg5) {
		cycleNo++;
		fillLeft = 0;
		int var6 = arg4 - 16;
		int var7 = arg4 + 16;
		int var8 = arg5 - 16;
		int var9 = arg5 + 16;
		for (int var10 = minLevel; var10 < maxTileLevel; var10++) {
			Square[][] var11 = squares[var10];
			for (int var12 = minX; var12 < maxX; var12++) {
				for (int var13 = minZ; var13 < maxZ; var13++) {
					Square var14 = var11[var12][var13];
					if (var14 != null) {
						if (var14.drawLevel <= maxLevel && visibilityMap[var12 + visibilityRadius - gx][var13 + visibilityRadius - gz] && (arg3 == null || var10 < 0 || arg3[var10][var12][var13] != 0)) {
							var14.drawFront = true;
							var14.drawBack = true;
							if (var14.spriteCount > 0) {
								var14.drawSprites = true;
							} else {
								var14.drawSprites = false;
							}
							fillLeft++;
						} else {
							var14.drawFront = false;
							var14.drawBack = false;
							var14.checkLocSpans = 0;
							if (var14.sprites != null && var12 >= var6 && var12 <= var7 && var13 >= var8 && var13 <= var9) {
								for (int var15 = 0; var15 < var14.spriteCount; var15++) {
									Sprite var16 = var14.sprites[var15];
									var16.model.method537((var16.minTileX + (var16.maxTileX - var16.minTileX >> 1)) * 128 + 64, (var16.minTileZ + (var16.maxTileZ - var16.minTileZ >> 1)) * 128 + 64);
								}
							}
						}
					}
				}
			}
		}
		boolean var17 = ClientBuild.groundh == Statics.field2979;
		for (int var18 = minLevel; var18 < maxTileLevel; var18++) {
			Square[][] var19 = squares[var18];
			for (int var20 = -visibilityRadius; var20 <= 0; var20++) {
				int var21 = gx + var20;
				int var22 = gx - var20;
				if (var21 >= minX || var22 < maxX) {
					for (int var23 = -visibilityRadius; var23 <= 0; var23++) {
						int var24 = gz + var23;
						int var25 = gz - var23;
						if (var21 >= minX) {
							if (var24 >= minZ) {
								Square var26 = var19[var21][var24];
								if (var26 != null && var26.drawFront) {
									fill(var26, true);
								}
							}
							if (var25 < maxZ) {
								Square var27 = var19[var21][var25];
								if (var27 != null && var27.drawFront) {
									fill(var27, true);
								}
							}
						}
						if (var22 < maxX) {
							if (var24 >= minZ) {
								Square var28 = var19[var22][var24];
								if (var28 != null && var28.drawFront) {
									fill(var28, true);
								}
							}
							if (var25 < maxZ) {
								Square var29 = var19[var22][var25];
								if (var29 != null && var29.drawFront) {
									fill(var29, true);
								}
							}
						}
						if (fillLeft == 0) {
							if (!var17) {
								click = false;
							}
							return;
						}
					}
				}
			}
		}
		for (int var30 = minLevel; var30 < maxTileLevel; var30++) {
			Square[][] var31 = squares[var30];
			for (int var32 = -visibilityRadius; var32 <= 0; var32++) {
				int var33 = gx + var32;
				int var34 = gx - var32;
				if (var33 >= minX || var34 < maxX) {
					for (int var35 = -visibilityRadius; var35 <= 0; var35++) {
						int var36 = gz + var35;
						int var37 = gz - var35;
						if (var33 >= minX) {
							if (var36 >= minZ) {
								Square var38 = var31[var33][var36];
								if (var38 != null && var38.drawFront) {
									fill(var38, false);
								}
							}
							if (var37 < maxZ) {
								Square var39 = var31[var33][var37];
								if (var39 != null && var39.drawFront) {
									fill(var39, false);
								}
							}
						}
						if (var34 < maxX) {
							if (var36 >= minZ) {
								Square var40 = var31[var34][var36];
								if (var40 != null && var40.drawFront) {
									fill(var40, false);
								}
							}
							if (var37 < maxZ) {
								Square var41 = var31[var34][var37];
								if (var41 != null && var41.drawFront) {
									fill(var41, false);
								}
							}
						}
						if (fillLeft == 0) {
							if (!var17) {
								click = false;
							}
							return;
						}
					}
				}
			}
		}
		click = false;
	}

	@ObfuscatedName("nb.a(IIII)Z")
	public static boolean wallOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!groundOccluded(arg0, arg1, arg2)) {
			return false;
		}
		int var4 = arg1 << 7;
		int var5 = arg2 << 7;
		int var6 = ClientBuild.groundh[arg0][arg1][arg2] - 1;
		int var7 = var6 - 120;
		int var8 = var6 - 230;
		int var9 = var6 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var4 > cx) {
					if (!occluded(var4, var6, var5)) {
						return false;
					}
					if (!occluded(var4, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!occluded(var4, var7, var5)) {
						return false;
					}
					if (!occluded(var4, var7, var5 + 128)) {
						return false;
					}
				}
				if (!occluded(var4, var8, var5)) {
					return false;
				}
				if (!occluded(var4, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var5 < cz) {
					if (!occluded(var4, var6, var5 + 128)) {
						return false;
					}
					if (!occluded(var4 + 128, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!occluded(var4, var7, var5 + 128)) {
						return false;
					}
					if (!occluded(var4 + 128, var7, var5 + 128)) {
						return false;
					}
				}
				if (!occluded(var4, var8, var5 + 128)) {
					return false;
				}
				if (!occluded(var4 + 128, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var4 < cx) {
					if (!occluded(var4 + 128, var6, var5)) {
						return false;
					}
					if (!occluded(var4 + 128, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!occluded(var4 + 128, var7, var5)) {
						return false;
					}
					if (!occluded(var4 + 128, var7, var5 + 128)) {
						return false;
					}
				}
				if (!occluded(var4 + 128, var8, var5)) {
					return false;
				}
				if (!occluded(var4 + 128, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var5 > cz) {
					if (!occluded(var4, var6, var5)) {
						return false;
					}
					if (!occluded(var4 + 128, var6, var5)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!occluded(var4, var7, var5)) {
						return false;
					}
					if (!occluded(var4 + 128, var7, var5)) {
						return false;
					}
				}
				if (!occluded(var4, var8, var5)) {
					return false;
				}
				if (!occluded(var4 + 128, var8, var5)) {
					return false;
				}
				return true;
			}
		}
		if (!occluded(var4 + 64, var9, var5 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return occluded(var4, var8, var5 + 128);
		} else if (arg3 == 32) {
			return occluded(var4 + 128, var8, var5 + 128);
		} else if (arg3 == 64) {
			return occluded(var4 + 128, var8, var5);
		} else if (arg3 == 128) {
			return occluded(var4, var8, var5);
		} else {
			return true;
		}
	}

	@ObfuscatedName("c.a(IIIIIIII)Z")
	public static boolean insideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return var8 * var10 > 0 && var10 * var9 > 0;
		}
	}

	@ObfuscatedName("jf.a(III)Z")
	public static boolean occluded(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < numActiveOccluders; var3++) {
			Occlude var4 = activeOccluders[var3];
			if (var4.mode == 1) {
				int var5 = var4.minX - arg0;
				if (var5 > 0) {
					int var6 = var4.minZ + (var4.minDeltaZ * var5 >> 8);
					int var7 = var4.maxZ + (var4.maxDeltaZ * var5 >> 8);
					int var8 = var4.minY + (var4.minDeltaY * var5 >> 8);
					int var9 = var4.maxY + (var4.maxDeltaY * var5 >> 8);
					if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
						return true;
					}
				}
			} else if (var4.mode == 2) {
				int var10 = arg0 - var4.minX;
				if (var10 > 0) {
					int var11 = var4.minZ + (var4.minDeltaZ * var10 >> 8);
					int var12 = var4.maxZ + (var4.maxDeltaZ * var10 >> 8);
					int var13 = var4.minY + (var4.minDeltaY * var10 >> 8);
					int var14 = var4.maxY + (var4.maxDeltaY * var10 >> 8);
					if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
						return true;
					}
				}
			} else if (var4.mode == 3) {
				int var15 = var4.minZ - arg2;
				if (var15 > 0) {
					int var16 = var4.minX + (var4.minDeltaX * var15 >> 8);
					int var17 = var4.maxX + (var4.maxDeltaX * var15 >> 8);
					int var18 = var4.minY + (var4.minDeltaY * var15 >> 8);
					int var19 = var4.maxY + (var4.maxDeltaY * var15 >> 8);
					if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
						return true;
					}
				}
			} else if (var4.mode == 4) {
				int var20 = arg2 - var4.minZ;
				if (var20 > 0) {
					int var21 = var4.minX + (var4.minDeltaX * var20 >> 8);
					int var22 = var4.maxX + (var4.maxDeltaX * var20 >> 8);
					int var23 = var4.minY + (var4.minDeltaY * var20 >> 8);
					int var24 = var4.maxY + (var4.maxDeltaY * var20 >> 8);
					if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
						return true;
					}
				}
			} else if (var4.mode == 5) {
				int var25 = arg1 - var4.minY;
				if (var25 > 0) {
					int var26 = var4.minX + (var4.minDeltaX * var25 >> 8);
					int var27 = var4.maxX + (var4.maxDeltaX * var25 >> 8);
					int var28 = var4.minZ + (var4.minDeltaZ * var25 >> 8);
					int var29 = var4.maxZ + (var4.maxDeltaZ * var25 >> 8);
					if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@ObfuscatedName("oe.a(II)V")
	public static void pushDown(int arg0, int arg1) {
		Square var2 = squares[0][arg0][arg1];
		for (int var3 = 0; var3 < 3; var3++) {
			Square var4 = squares[var3][arg0][arg1] = squares[var3 + 1][arg0][arg1];
			if (var4 != null) {
				var4.level--;
				for (int var5 = 0; var5 < var4.spriteCount; var5++) {
					Sprite var6 = var4.sprites[var5];
					if ((var6.typecode >> 29 & 0x3L) == 2L && var6.minTileX == arg0 && var6.minTileZ == arg1) {
						var6.level--;
					}
				}
			}
		}
		if (squares[0][arg0][arg1] == null) {
			squares[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		squares[0][arg0][arg1].linkedSquare = var2;
		squares[3][arg0][arg1] = null;
	}

	@ObfuscatedName("ka.a()V")
	public static void removeSprites() {
		for (int var0 = 0; var0 < dynamicCount; var0++) {
			Sprite var1 = dynamicSprites[var0];
			delSprite(var1);
			dynamicSprites[var0] = null;
		}
		dynamicCount = 0;
	}

	@ObfuscatedName("da.a(IIIILnc;JZ)V")
	public static void setGroundDecor(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, long arg5, boolean arg6) {
		if (arg4 == null) {
			return;
		}
		GroundDecor var8 = new GroundDecor();
		var8.model = arg4;
		var8.x = arg1 * 128 + 64;
		var8.z = arg2 * 128 + 64;
		var8.y = arg3;
		var8.typecode = arg5;
		if (squares[arg0][arg1][arg2] == null) {
			squares[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		squares[arg0][arg1][arg2].groundDecor = var8;
	}

	@ObfuscatedName("kd.a(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= maxTileX * 128) {
			arg0 = maxTileX * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= maxTileZ * 128) {
			arg2 = maxTileZ * 128 - 1;
		}
		cameraSinX = Pix3D.sinTable[arg3];
		cameraCosX = Pix3D.cosTable[arg3];
		cameraSinY = Pix3D.sinTable[arg4];
		cameraCosY = Pix3D.cosTable[arg4];
		cx = arg0;
		cy = arg1;
		cz = arg2;
		gx = arg0 / 128;
		gz = arg2 / 128;
		maxLevel = arg5;
		minX = gx - visibilityRadius;
		if (minX < 0) {
			minX = 0;
		}
		minZ = gz - visibilityRadius;
		if (minZ < 0) {
			minZ = 0;
		}
		maxX = gx + visibilityRadius;
		if (maxX > maxTileX) {
			maxX = maxTileX;
		}
		maxZ = gz + visibilityRadius;
		if (maxZ > maxTileZ) {
			maxZ = maxTileZ;
		}
		for (int var14 = 0; var14 < visibilityRadius + visibilityRadius + 2; var14++) {
			for (int var15 = 0; var15 < visibilityRadius + visibilityRadius + 2; var15++) {
				int var16 = (var14 - visibilityRadius << 7) - (cx & 0x7F);
				int var17 = (var15 - visibilityRadius << 7) - (cz & 0x7F);
				int var18 = gx + var14 - visibilityRadius;
				int var19 = gz + var15 - visibilityRadius;
				if (var18 >= 0 && var19 >= 0 && var18 < maxTileX && var19 < maxTileZ) {
					int var20;
					if (Statics.field2979 == null) {
						var20 = groundh[0][var18][var19] + 128 - cy;
					} else {
						var20 = Statics.field2979[0][var18][var19] + 128 - cy;
					}
					int var21 = groundh[3][var18][var19] - cy - 1000;
					visibilityMapBuffer[var14][var15] = testPoint(var16, var21, var20, var17);
				} else {
					visibilityMapBuffer[var14][var15] = false;
				}
			}
		}
		for (int var22 = 0; var22 < visibilityRadius + visibilityRadius + 1; var22++) {
			for (int var23 = 0; var23 < visibilityRadius + visibilityRadius + 1; var23++) {
				visibilityMap[var22][var23] = visibilityMapBuffer[var22][var23] || visibilityMapBuffer[var22 + 1][var23] || visibilityMapBuffer[var22][var23 + 1] || visibilityMapBuffer[var22 + 1][var23 + 1];
			}
		}
		field4510 = arg7;
		Statics.field740 = arg8;
		Statics.field3605 = arg9;
		Statics.field2713 = arg10;
		Statics.field3882 = arg11;
		calcOcclude();
		method803(arg0, arg1, arg2, arg6, arg12, arg13);
	}

	@ObfuscatedName("dj.e(I)V")
	public static void fillBaseLevel(int arg0) {
		minLevel = arg0;
		for (int var1 = 0; var1 < maxTileX; var1++) {
			for (int var2 = 0; var2 < maxTileZ; var2++) {
				if (squares[arg0][var1][var2] == null) {
					squares[arg0][var1][var2] = new Square(arg0, var1, var2);
				}
			}
		}
	}

	@ObfuscatedName("wf.a(IIII)V")
	public static void moveDecor(int arg0, int arg1, int arg2, int arg3) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		Decor var5 = var4.decor;
		if (var5 != null) {
			var5.xof = var5.xof * arg3 / 16;
			var5.zof = var5.zof * arg3 / 16;
		}
	}

	@ObfuscatedName("gh.c(III)J")
	public static long gdType(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		return var3 == null || var3.groundDecor == null ? 0L : var3.groundDecor.typecode;
	}

	@ObfuscatedName("kc.a(III)J")
	public static long sceneType(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 == null) {
			return 0L;
		}
		for (int var4 = 0; var4 < var3.spriteCount; var4++) {
			Sprite var5 = var3.sprites[var4];
			if ((var5.typecode >> 29 & 0x3L) == 2L && var5.minTileX == arg1 && var5.minTileZ == arg2) {
				return var5.typecode;
			}
		}
		return 0L;
	}

	@ObfuscatedName("nd.a(III)V")
	public static void delLoc(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 == null) {
			return;
		}
		for (int var4 = 0; var4 < var3.spriteCount; var4++) {
			Sprite var5 = var3.sprites[var4];
			if ((var5.typecode >> 29 & 0x3L) == 2L && var5.minTileX == arg1 && var5.minTileZ == arg2) {
				delSprite(var5);
				return;
			}
		}
	}

	@ObfuscatedName("oi.a(III)J")
	public static long decorType(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		return var3 == null || var3.decor == null ? 0L : var3.decor.typecode;
	}

	@ObfuscatedName("oe.a(III)J")
	public static long wallType(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		return var3 == null || var3.wall == null ? 0L : var3.wall.typecode;
	}

	@ObfuscatedName("ha.a(III)Lfh;")
	public static Decor getDecor(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		return var3 == null ? null : var3.decor;
	}

	@ObfuscatedName("hd.a(Leg;Z)V")
	public static void fill(Square arg0, boolean arg1) {
		fillQueue.push(arg0);
		while (true) {
			Square var2;
			int var3;
			int var4;
			int var5;
			int var6;
			Square[][] var7;
			Square var65;
			do {
				Square var64;
				do {
					Square var63;
					do {
						Square var62;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var2 = (Square) fillQueue.popFront();
												if (var2 == null) {
													return;
												}
											} while (!var2.drawBack);
											var3 = var2.x;
											var4 = var2.z;
											var5 = var2.level;
											var6 = var2.originalLevel;
											var7 = squares[var5];
											if (!var2.drawFront) {
												break;
											}
											if (arg1) {
												if (var5 > 0) {
													Square var8 = squares[var5 - 1][var3][var4];
													if (var8 != null && var8.drawBack) {
														continue;
													}
												}
												if (var3 <= gx && var3 > minX) {
													Square var9 = var7[var3 - 1][var4];
													if (var9 != null && var9.drawBack && (var9.drawFront || (var2.spriteSpans & 0x1) == 0)) {
														continue;
													}
												}
												if (var3 >= gx && var3 < maxX - 1) {
													Square var10 = var7[var3 + 1][var4];
													if (var10 != null && var10.drawBack && (var10.drawFront || (var2.spriteSpans & 0x4) == 0)) {
														continue;
													}
												}
												if (var4 <= gz && var4 > minZ) {
													Square var11 = var7[var3][var4 - 1];
													if (var11 != null && var11.drawBack && (var11.drawFront || (var2.spriteSpans & 0x8) == 0)) {
														continue;
													}
												}
												if (var4 >= gz && var4 < maxZ - 1) {
													Square var12 = var7[var3][var4 + 1];
													if (var12 != null && var12.drawBack && (var12.drawFront || (var2.spriteSpans & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var2.drawFront = false;
											if (var2.linkedSquare != null) {
												Square var13 = var2.linkedSquare;
												if (var13.quickGround == null) {
													if (var13.ground != null) {
														if (groundOccluded(0, var3, var4)) {
															renderGround(var13.ground, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, true);
														} else {
															renderGround(var13.ground, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, false);
														}
													}
												} else if (groundOccluded(0, var3, var4)) {
													renderQuickGround(var13.quickGround, 0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, true);
												} else {
													renderQuickGround(var13.quickGround, 0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, false);
												}
												Wall var14 = var13.wall;
												if (var14 != null) {
													var14.modelA.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var14.x - cx, var14.y - cy, var14.z - cz, var14.typecode);
												}
												for (int var15 = 0; var15 < var13.spriteCount; var15++) {
													Sprite var16 = var13.sprites[var15];
													if (var16 != null) {
														var16.model.method87(var16.yaw, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var16.x - cx, var16.y - cy, var16.z - cz, var16.typecode);
													}
												}
											}
											boolean var17 = false;
											if (var2.quickGround == null) {
												if (var2.ground != null) {
													if (groundOccluded(var6, var3, var4)) {
														renderGround(var2.ground, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, true);
													} else {
														var17 = true;
														renderGround(var2.ground, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, false);
													}
												}
											} else if (groundOccluded(var6, var3, var4)) {
												renderQuickGround(var2.quickGround, var6, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, true);
											} else {
												var17 = true;
												if (var2.quickGround.colourNE != 12345678 || click && var5 <= clickLev) {
													renderQuickGround(var2.quickGround, var6, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var3, var4, false);
												}
											}
											int var18 = 0;
											int var19 = 0;
											Wall var20 = var2.wall;
											Decor var21 = var2.decor;
											if (var20 != null || var21 != null) {
												if (gx == var3) {
													var18++;
												} else if (gx < var3) {
													var18 += 2;
												}
												if (gz == var4) {
													var18 += 3;
												} else if (gz > var4) {
													var18 += 6;
												}
												var19 = PRETAB[var18];
												var2.blockLocSpans = POSTTAB[var18];
											}
											if (var20 != null) {
												if ((var20.typeA & MIDTAB[var18]) == 0) {
													var2.checkLocSpans = 0;
												} else if (var20.typeA == 16) {
													var2.checkLocSpans = 3;
													var2.backWallTypes = MIDDEP_16[var18];
													var2.inverseBlockLocSpans = 3 - var2.backWallTypes;
												} else if (var20.typeA == 32) {
													var2.checkLocSpans = 6;
													var2.backWallTypes = MIDDEP_32[var18];
													var2.inverseBlockLocSpans = 6 - var2.backWallTypes;
												} else if (var20.typeA == 64) {
													var2.checkLocSpans = 12;
													var2.backWallTypes = MIDDEP_64[var18];
													var2.inverseBlockLocSpans = 12 - var2.backWallTypes;
												} else {
													var2.checkLocSpans = 9;
													var2.backWallTypes = MIDDEP_128[var18];
													var2.inverseBlockLocSpans = 9 - var2.backWallTypes;
												}
												if ((var20.typeA & var19) != 0 && !wallOccluded(var6, var3, var4, var20.typeA)) {
													var20.modelA.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var20.x - cx, var20.y - cy, var20.z - cz, var20.typecode);
												}
												if ((var20.typeB & var19) != 0 && !wallOccluded(var6, var3, var4, var20.typeB)) {
													var20.modelB.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var20.x - cx, var20.y - cy, var20.z - cz, var20.typecode);
												}
											}
											if (var21 != null && !spriteOccluded(var6, var3, var4, var21.model.method88())) {
												if ((var21.wshape & var19) != 0) {
													var21.model.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.x + var21.xof - cx, var21.y - cy, var21.z + var21.zof - cz, var21.typecode);
												} else if (var21.wshape == 256) {
													int var22 = var21.x - cx;
													int var23 = var21.y - cy;
													int var24 = var21.z - cz;
													int var25 = var21.yof;
													int var26;
													if (var25 == 1 || var25 == 2) {
														var26 = -var22;
													} else {
														var26 = var22;
													}
													int var27;
													if (var25 == 2 || var25 == 3) {
														var27 = -var24;
													} else {
														var27 = var24;
													}
													if (var27 < var26) {
														var21.model.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22 + var21.xof, var23, var24 + var21.zof, var21.typecode);
													} else if (var21.model2 != null) {
														var21.model2.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22, var23, var24, var21.typecode);
													}
												}
											}
											if (var17) {
												GroundDecor var28 = var2.groundDecor;
												if (var28 != null) {
													var28.model.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var28.x - cx, var28.y - cy, var28.z - cz, var28.typecode);
												}
												GroundObject var29 = var2.groundObject;
												if (var29 != null && var29.height == 0) {
													if (var29.bottomObj != null) {
														var29.bottomObj.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var29.x - cx, var29.y - cy, var29.z - cz, var29.typecode);
													}
													if (var29.middleObj != null) {
														var29.middleObj.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var29.x - cx, var29.y - cy, var29.z - cz, var29.typecode);
													}
													if (var29.topObj != null) {
														var29.topObj.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var29.x - cx, var29.y - cy, var29.z - cz, var29.typecode);
													}
												}
											}
											int var30 = var2.spriteSpans;
											if (var30 != 0) {
												if (var3 < gx && (var30 & 0x4) != 0) {
													Square var31 = var7[var3 + 1][var4];
													if (var31 != null && var31.drawBack) {
														fillQueue.push(var31);
													}
												}
												if (var4 < gz && (var30 & 0x2) != 0) {
													Square var32 = var7[var3][var4 + 1];
													if (var32 != null && var32.drawBack) {
														fillQueue.push(var32);
													}
												}
												if (var3 > gx && (var30 & 0x1) != 0) {
													Square var33 = var7[var3 - 1][var4];
													if (var33 != null && var33.drawBack) {
														fillQueue.push(var33);
													}
												}
												if (var4 > gz && (var30 & 0x8) != 0) {
													Square var34 = var7[var3][var4 - 1];
													if (var34 != null && var34.drawBack) {
														fillQueue.push(var34);
													}
												}
											}
											break;
										}
										if (var2.checkLocSpans != 0) {
											boolean var35 = true;
											for (int var36 = 0; var36 < var2.spriteCount; var36++) {
												if (var2.sprites[var36].cycle != cycleNo && (var2.spriteSpan[var36] & var2.checkLocSpans) == var2.backWallTypes) {
													var35 = false;
													break;
												}
											}
											if (var35) {
												Wall var37 = var2.wall;
												if (!wallOccluded(var6, var3, var4, var37.typeA)) {
													var37.modelA.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var37.x - cx, var37.y - cy, var37.z - cz, var37.typecode);
												}
												var2.checkLocSpans = 0;
											}
										}
										if (!var2.drawSprites) {
											break;
										}
										try {
											int var38 = var2.spriteCount;
											var2.drawSprites = false;
											int var39 = 0;
											label562: for (int var40 = 0; var40 < var38; var40++) {
												Sprite var41 = var2.sprites[var40];
												if (var41.cycle != cycleNo) {
													for (int var42 = var41.minTileX; var42 <= var41.maxTileX; var42++) {
														for (int var43 = var41.minTileZ; var43 <= var41.maxTileZ; var43++) {
															Square var44 = var7[var42][var43];
															if (var44.drawFront) {
																var2.drawSprites = true;
																continue label562;
															}
															if (var44.checkLocSpans != 0) {
																int var45 = 0;
																if (var42 > var41.minTileX) {
																	var45++;
																}
																if (var42 < var41.maxTileX) {
																	var45 += 4;
																}
																if (var43 > var41.minTileZ) {
																	var45 += 8;
																}
																if (var43 < var41.maxTileZ) {
																	var45 += 2;
																}
																if ((var45 & var44.checkLocSpans) == var2.inverseBlockLocSpans) {
																	var2.drawSprites = true;
																	continue label562;
																}
															}
														}
													}
													spriteBuffer[var39++] = var41;
													int var46 = gx - var41.minTileX;
													int var47 = var41.maxTileX - gx;
													if (var47 > var46) {
														var46 = var47;
													}
													int var48 = gz - var41.minTileZ;
													int var49 = var41.maxTileZ - gz;
													if (var49 > var48) {
														var41.distance = var46 + var49;
													} else {
														var41.distance = var46 + var48;
													}
												}
											}
											while (var39 > 0) {
												int var50 = -50;
												int var51 = -1;
												for (int var52 = 0; var52 < var39; var52++) {
													Sprite var53 = spriteBuffer[var52];
													if (var53.cycle != cycleNo) {
														if (var53.distance > var50) {
															var50 = var53.distance;
															var51 = var52;
														} else if (var53.distance == var50) {
															int var54 = var53.x - cx;
															int var55 = var53.z - cz;
															int var56 = spriteBuffer[var51].x - cx;
															int var57 = spriteBuffer[var51].z - cz;
															if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
																var51 = var52;
															}
														}
													}
												}
												if (var51 == -1) {
													break;
												}
												Sprite var58 = spriteBuffer[var51];
												var58.cycle = cycleNo;
												if (!spriteOccluded(var6, var58.minTileX, var58.maxTileX, var58.minTileZ, var58.maxTileZ, var58.model.method88())) {
													var58.model.method87(var58.yaw, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var58.x - cx, var58.y - cy, var58.z - cz, var58.typecode);
												}
												for (int var59 = var58.minTileX; var59 <= var58.maxTileX; var59++) {
													for (int var60 = var58.minTileZ; var60 <= var58.maxTileZ; var60++) {
														Square var61 = var7[var59][var60];
														if (var61.checkLocSpans != 0) {
															fillQueue.push(var61);
														} else if ((var59 != var3 || var60 != var4) && var61.drawBack) {
															fillQueue.push(var61);
														}
													}
												}
											}
											if (!var2.drawSprites) {
												break;
											}
										} catch (Exception var80) {
											var2.drawSprites = false;
											break;
										}
									}
								} while (!var2.drawBack);
							} while (var2.checkLocSpans != 0);
							if (var3 > gx || var3 <= minX) {
								break;
							}
							var62 = var7[var3 - 1][var4];
						} while (var62 != null && var62.drawBack);
						if (var3 < gx || var3 >= maxX - 1) {
							break;
						}
						var63 = var7[var3 + 1][var4];
					} while (var63 != null && var63.drawBack);
					if (var4 > gz || var4 <= minZ) {
						break;
					}
					var64 = var7[var3][var4 - 1];
				} while (var64 != null && var64.drawBack);
				if (var4 < gz || var4 >= maxZ - 1) {
					break;
				}
				var65 = var7[var3][var4 + 1];
			} while (var65 != null && var65.drawBack);
			var2.drawBack = false;
			fillLeft--;
			GroundObject var66 = var2.groundObject;
			if (var66 != null && var66.height != 0) {
				if (var66.bottomObj != null) {
					var66.bottomObj.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var66.x - cx, var66.y - cy - var66.height, var66.z - cz, var66.typecode);
				}
				if (var66.middleObj != null) {
					var66.middleObj.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var66.x - cx, var66.y - cy - var66.height, var66.z - cz, var66.typecode);
				}
				if (var66.topObj != null) {
					var66.topObj.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var66.x - cx, var66.y - cy - var66.height, var66.z - cz, var66.typecode);
				}
			}
			if (var2.blockLocSpans != 0) {
				Decor var67 = var2.decor;
				if (var67 != null && !spriteOccluded(var6, var3, var4, var67.model.method88())) {
					if ((var67.wshape & var2.blockLocSpans) != 0) {
						var67.model.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var67.x + var67.xof - cx, var67.y - cy, var67.z + var67.zof - cz, var67.typecode);
					} else if (var67.wshape == 256) {
						int var68 = var67.x - cx;
						int var69 = var67.y - cy;
						int var70 = var67.z - cz;
						int var71 = var67.yof;
						int var72;
						if (var71 == 1 || var71 == 2) {
							var72 = -var68;
						} else {
							var72 = var68;
						}
						int var73;
						if (var71 == 2 || var71 == 3) {
							var73 = -var70;
						} else {
							var73 = var70;
						}
						if (var73 >= var72) {
							var67.model.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var68 + var67.xof, var69, var70 + var67.zof, var67.typecode);
						} else if (var67.model2 != null) {
							var67.model2.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var68, var69, var70, var67.typecode);
						}
					}
				}
				Wall var74 = var2.wall;
				if (var74 != null) {
					if ((var74.typeB & var2.blockLocSpans) != 0 && !wallOccluded(var6, var3, var4, var74.typeB)) {
						var74.modelB.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var74.x - cx, var74.y - cy, var74.z - cz, var74.typecode);
					}
					if ((var74.typeA & var2.blockLocSpans) != 0 && !wallOccluded(var6, var3, var4, var74.typeA)) {
						var74.modelA.method87(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var74.x - cx, var74.y - cy, var74.z - cz, var74.typecode);
					}
				}
			}
			if (var5 < maxTileLevel - 1) {
				Square var75 = squares[var5 + 1][var3][var4];
				if (var75 != null && var75.drawBack) {
					fillQueue.push(var75);
				}
			}
			if (var3 < gx) {
				Square var76 = var7[var3 + 1][var4];
				if (var76 != null && var76.drawBack) {
					fillQueue.push(var76);
				}
			}
			if (var4 < gz) {
				Square var77 = var7[var3][var4 + 1];
				if (var77 != null && var77.drawBack) {
					fillQueue.push(var77);
				}
			}
			if (var3 > gx) {
				Square var78 = var7[var3 - 1][var4];
				if (var78 != null && var78.drawBack) {
					fillQueue.push(var78);
				}
			}
			if (var4 > gz) {
				Square var79 = var7[var3][var4 - 1];
				if (var79 != null && var79.drawBack) {
					fillQueue.push(var79);
				}
			}
		}
	}

	@ObfuscatedName("ei.a(III)Lpc;")
	public static GroundDecor getGd(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		return var3 == null || var3.groundDecor == null ? null : var3.groundDecor;
	}

	@ObfuscatedName("kj.a([IIIIII)V")
	public static void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var5 = squares[arg2][arg3][arg4];
		if (var5 == null) {
			return;
		}
		QuickGround var6 = var5.quickGround;
		if (var6 != null) {
			int var7 = var6.minimapRgb;
			if (var7 != 0) {
				for (int var8 = 0; var8 < 4; var8++) {
					arg0[arg1] = var7;
					arg0[arg1 + 1] = var7;
					arg0[arg1 + 2] = var7;
					arg0[arg1 + 3] = var7;
					arg1 += 512;
				}
			}
			return;
		}
		Ground var9 = var5.ground;
		if (var9 == null) {
			return;
		}
		int var10 = var9.overlayShape;
		int var11 = var9.overlayRotation;
		int var12 = var9.minimapOverlay;
		int var13 = var9.minimapUnderlay;
		int[] var14 = MINIMAP_SHAPE[var10];
		int[] var15 = MINIMAP_ROTATE[var11];
		int var16 = 0;
		if (var12 != 0) {
			for (int var17 = 0; var17 < 4; var17++) {
				arg0[arg1] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg1 += 512;
			}
			return;
		}
		for (int var18 = 0; var18 < 4; var18++) {
			if (var14[var15[var16++]] != 0) {
				arg0[arg1] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 1] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 2] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 3] = var13;
			}
			arg1 += 512;
		}
	}

	@ObfuscatedName("client.a(IIIIII)Z")
	public static boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var8 = arg1; var8 <= arg2; var8++) {
				for (int var9 = arg3; var9 <= arg4; var9++) {
					if (occlusionCycle[arg0][var8][var9] == -cycleNo) {
						return false;
					}
				}
			}
			int var10 = (arg1 << 7) + 1;
			int var11 = (arg3 << 7) + 2;
			int var12 = ClientBuild.groundh[arg0][arg1][arg3] + arg5;
			if (!occluded(var10, var12, var11)) {
				return false;
			}
			int var13 = (arg2 << 7) - 1;
			if (!occluded(var13, var12, var11)) {
				return false;
			}
			int var14 = (arg4 << 7) - 1;
			if (!occluded(var10, var12, var14)) {
				return false;
			} else if (occluded(var13, var12, var14)) {
				return true;
			} else {
				return false;
			}
		} else if (groundOccluded(arg0, arg1, arg3)) {
			int var6 = arg1 << 7;
			int var7 = arg3 << 7;
			return occluded(var6 + 1, ClientBuild.groundh[arg0][arg1][arg3] + arg5, var7 + 1) && occluded(var6 + 128 - 1, ClientBuild.groundh[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && occluded(var6 + 128 - 1, ClientBuild.groundh[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && occluded(var6 + 1, ClientBuild.groundh[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("t.b(III)V")
	public static void delGroundDecor(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 != null) {
			var3.groundDecor = null;
		}
	}

	@ObfuscatedName("ee.b(III)V")
	public static void updateMousePicking(int arg0, int arg1, int arg2) {
		click = true;
		clickLev = arg0;
		clickX = arg1;
		clickY = arg2;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("eh.a(IIIIIILnc;IJ)Z")
	public static boolean addScenery(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			int var10 = arg1 * 128 + arg4 * 64;
			int var11 = arg2 * 128 + arg5 * 64;
			return setSprite(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
		}
	}

	@ObfuscatedName("rg.a()V")
	public static void calcOcclude() {
		int var0 = numOccluders[maxLevel];
		Occlude[] var1 = occluders[maxLevel];
		numActiveOccluders = 0;
		label187: for (int var2 = 0; var2 < var0; var2++) {
			Occlude var3 = var1[var2];
			if (field4510 != null) {
				for (int var4 = 0; var4 < field4510.length; var4++) {
					if (field4510[var4] != -1000000 && (var3.minY <= field4510[var4] || var3.maxY <= field4510[var4]) && (var3.minX <= Statics.field3605[var4] || var3.maxX <= Statics.field3605[var4]) && (var3.minX >= Statics.field740[var4] || var3.maxX >= Statics.field740[var4]) && (var3.minZ <= Statics.field2713[var4] || var3.maxZ <= Statics.field2713[var4]) && (var3.minZ >= Statics.field3882[var4] || var3.maxZ >= Statics.field3882[var4])) {
						continue label187;
					}
				}
			}
			if (var3.type == 1) {
				int var5 = var3.minTileX + visibilityRadius - gx;
				if (var5 >= 0 && var5 <= visibilityRadius + visibilityRadius) {
					int var6 = var3.minTileZ + visibilityRadius - gz;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var3.maxTileZ + visibilityRadius - gz;
					if (var7 > visibilityRadius + visibilityRadius) {
						var7 = visibilityRadius + visibilityRadius;
					}
					boolean var8 = false;
					while (var6 <= var7) {
						if (visibilityMap[var5][var6++]) {
							var8 = true;
							break;
						}
					}
					if (var8) {
						int var9 = cx - var3.minX;
						if (var9 > 32) {
							var3.mode = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var3.mode = 2;
							var9 = -var9;
						}
						var3.minDeltaZ = (var3.minZ - cz << 8) / var9;
						var3.maxDeltaZ = (var3.maxZ - cz << 8) / var9;
						var3.minDeltaY = (var3.minY - cy << 8) / var9;
						var3.maxDeltaY = (var3.maxY - cy << 8) / var9;
						activeOccluders[numActiveOccluders++] = var3;
					}
				}
			} else if (var3.type == 2) {
				int var10 = var3.minTileZ + visibilityRadius - gz;
				if (var10 >= 0 && var10 <= visibilityRadius + visibilityRadius) {
					int var11 = var3.minTileX + visibilityRadius - gx;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var3.maxTileX + visibilityRadius - gx;
					if (var12 > visibilityRadius + visibilityRadius) {
						var12 = visibilityRadius + visibilityRadius;
					}
					boolean var13 = false;
					while (var11 <= var12) {
						if (visibilityMap[var11++][var10]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						int var14 = cz - var3.minZ;
						if (var14 > 32) {
							var3.mode = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var3.mode = 4;
							var14 = -var14;
						}
						var3.minDeltaX = (var3.minX - cx << 8) / var14;
						var3.maxDeltaX = (var3.maxX - cx << 8) / var14;
						var3.minDeltaY = (var3.minY - cy << 8) / var14;
						var3.maxDeltaY = (var3.maxY - cy << 8) / var14;
						activeOccluders[numActiveOccluders++] = var3;
					}
				}
			} else if (var3.type == 4) {
				int var15 = var3.minY - cy;
				if (var15 > 128) {
					int var16 = var3.minTileZ + visibilityRadius - gz;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var3.maxTileZ + visibilityRadius - gz;
					if (var17 > visibilityRadius + visibilityRadius) {
						var17 = visibilityRadius + visibilityRadius;
					}
					if (var16 <= var17) {
						int var18 = var3.minTileX + visibilityRadius - gx;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var3.maxTileX + visibilityRadius - gx;
						if (var19 > visibilityRadius + visibilityRadius) {
							var19 = visibilityRadius + visibilityRadius;
						}
						boolean var20 = false;
						label159: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (visibilityMap[var21][var22]) {
									var20 = true;
									break label159;
								}
							}
						}
						if (var20) {
							var3.mode = 5;
							var3.minDeltaX = (var3.minX - cx << 8) / var15;
							var3.maxDeltaX = (var3.maxX - cx << 8) / var15;
							var3.minDeltaZ = (var3.minZ - cz << 8) / var15;
							var3.maxDeltaZ = (var3.maxZ - cz << 8) / var15;
							activeOccluders[numActiveOccluders++] = var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lf.a(IIIILnc;IJIIII)Z")
	public static boolean addDynamic(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : setSprite(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@ObfuscatedName("rg.b(III)Loe;")
	public static Wall getWall(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		return var3 == null ? null : var3.wall;
	}

	@ObfuscatedName("mf.a(Ljj;)V")
	public static void delSprite(Sprite arg0) {
		for (int var1 = arg0.minTileX; var1 <= arg0.maxTileX; var1++) {
			for (int var2 = arg0.minTileZ; var2 <= arg0.maxTileZ; var2++) {
				Square var3 = squares[arg0.level][var1][var2];
				if (var3 != null) {
					for (int var4 = 0; var4 < var3.spriteCount; var4++) {
						if (var3.sprites[var4] == arg0) {
							var3.spriteCount--;
							for (int var5 = var4; var5 < var3.spriteCount; var5++) {
								var3.sprites[var5] = var3.sprites[var5 + 1];
								var3.spriteSpan[var5] = var3.spriteSpan[var5 + 1];
							}
							var3.sprites[var3.spriteCount] = null;
							break;
						}
					}
					var3.spriteSpans = 0;
					for (int var6 = 0; var6 < var3.spriteCount; var6++) {
						var3.spriteSpans |= var3.spriteSpan[var6];
					}
				}
			}
		}
	}

	@ObfuscatedName("cd.a(III)V")
	public static void delObj(int arg0, int arg1, int arg2) {
		Square var3 = squares[arg0][arg1][arg2];
		if (var3 != null) {
			var3.groundObject = null;
		}
	}

	@ObfuscatedName("rd.a(IIII)Z")
	public static boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (groundOccluded(arg0, arg1, arg2)) {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			return occluded(var4 + 1, ClientBuild.groundh[arg0][arg1][arg2] + arg3, var5 + 1) && occluded(var4 + 128 - 1, ClientBuild.groundh[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && occluded(var4 + 128 - 1, ClientBuild.groundh[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && occluded(var4 + 1, ClientBuild.groundh[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("od.a(Lf;IIIIIIZ)V")
	public static void renderGround(Ground arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		int var8 = arg0.vertexX.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg0.vertexX[var9] - cx;
			int var11 = arg0.vertexY[var9] - cy;
			int var12 = arg0.vertexZ[var9] - cz;
			int var13 = var12 * arg3 + var10 * arg4 >> 16;
			int var14 = var12 * arg4 - var10 * arg3 >> 16;
			int var16 = var11 * arg2 - var14 * arg1 >> 16;
			int var17 = var11 * arg1 + var14 * arg2 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg0.faceTexture != null) {
				Ground.drawTextureVertexX[var9] = var13;
				Ground.drawTextureVertexY[var9] = var16;
				Ground.drawTextureVertexZ[var9] = var17;
			}
			Ground.drawVertexX[var9] = Pix3D.originX + (var13 << 9) / var17;
			Ground.drawVertexY[var9] = Pix3D.originY + (var16 << 9) / var17;
		}
		Pix3D.trans = 0;
		int var18 = arg0.faceVertexA.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg0.faceVertexA[var19];
			int var21 = arg0.faceVertexB[var19];
			int var22 = arg0.faceVertexC[var19];
			int var23 = Ground.drawVertexX[var20];
			int var24 = Ground.drawVertexX[var21];
			int var25 = Ground.drawVertexX[var22];
			int var26 = Ground.drawVertexY[var20];
			int var27 = Ground.drawVertexY[var21];
			int var28 = Ground.drawVertexY[var22];
			if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
				if (click && insideTriangle(clickX + Pix3D.originX, clickY + Pix3D.originY, var26, var27, var28, var23, var24, var25)) {
					groundX = arg5;
					groundZ = arg6;
				}
				if (!arg7) {
					Pix3D.hclip = false;
					if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix3D.sizeX || var24 > Pix3D.sizeX || var25 > Pix3D.sizeX) {
						Pix3D.hclip = true;
					}
					if (arg0.faceTexture == null || arg0.faceTexture[var19] == -1) {
						if (arg0.faceColourA[var19] != 12345678) {
							Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, arg0.faceColourA[var19], arg0.faceColourB[var19], arg0.faceColourC[var19]);
						}
					} else if (lowMem) {
						int var29 = Pix3D.textureManager.getAverageRgb(arg0.faceTexture[var19]);
						Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, adjustHslLightness(var29, arg0.faceColourA[var19]), adjustHslLightness(var29, arg0.faceColourB[var19]), adjustHslLightness(var29, arg0.faceColourC[var19]));
					} else if (arg0.flat) {
						Pix3D.textureTriangleAffine(var26, var27, var28, var23, var24, var25, arg0.faceColourA[var19], arg0.faceColourB[var19], arg0.faceColourC[var19], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg0.faceTexture[var19]);
					} else {
						Pix3D.textureTriangleAffine(var26, var27, var28, var23, var24, var25, arg0.faceColourA[var19], arg0.faceColourB[var19], arg0.faceColourC[var19], Ground.drawTextureVertexX[var20], Ground.drawTextureVertexX[var21], Ground.drawTextureVertexX[var22], Ground.drawTextureVertexY[var20], Ground.drawTextureVertexY[var21], Ground.drawTextureVertexY[var22], Ground.drawTextureVertexZ[var20], Ground.drawTextureVertexZ[var21], Ground.drawTextureVertexZ[var22], arg0.faceTexture[var19]);
					}
				}
			}
		}
	}

    @ObfuscatedName("sg.a(IIIII)Z")
    public static boolean testPoint(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 * cameraSinY + arg0 * cameraCosY >> 16;
        int var5 = arg3 * cameraCosY - arg0 * cameraSinY >> 16;
        int var6 = arg1 * cameraSinX + var5 * cameraCosX >> 16;
        int var7 = arg1 * cameraCosX - var5 * cameraSinX >> 16;
        if (var6 < 1) {
            var6 = 1;
        }
        int var8 = (var4 << 9) / var6;
        int var9 = (var7 << 9) / var6;
        int var10 = arg2 * cameraSinX + var5 * cameraCosX >> 16;
        int var11 = arg2 * cameraCosX - var5 * cameraSinX >> 16;
        if (var10 < 1) {
            var10 = 1;
        }
        int var12 = (var4 << 9) / var10;
        int var13 = (var11 << 9) / var10;
        if (var6 < 50 && var10 < 50) {
            return false;
        } else if (var6 > 3500 && var10 > 3500) {
            return false;
        } else if (var8 < Pix3D.minX && var12 < Pix3D.minX) {
            return false;
        } else if (var8 > Pix3D.maxX && var12 > Pix3D.maxX) {
            return false;
        } else if (var9 < Pix3D.minY && var13 < Pix3D.minY) {
            return false;
        } else {
            return var9 <= Pix3D.maxY || var13 <= Pix3D.maxY;
        }
    }

	@ObfuscatedName("kh.b(II)I")
	public static int adjustHslLightness(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}
}
