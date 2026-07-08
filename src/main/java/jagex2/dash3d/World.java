package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;

@ObfuscatedName("r")
public final class World {

	@ObfuscatedName("r.i")
	public static boolean lowMem = true;

	@ObfuscatedName("r.k")
	public final int maxTileX = 104;

	@ObfuscatedName("r.l")
	public final int maxTileZ = 104;

	@ObfuscatedName("r.n")
	public final Square[][][] squares = new Square[4][104][104];

	@ObfuscatedName("r.o")
	public int minLevel;

	@ObfuscatedName("r.p")
	public int dynamicCount;

	@ObfuscatedName("r.q")
	public final Sprite[] dynamicSprites = new Sprite[5000];

	@ObfuscatedName("r.I")
	public static Sprite[] spriteBuffer = new Sprite[100];

	@ObfuscatedName("r.Q")
	public static int groundX = -1;

	@ObfuscatedName("r.R")
	public static int groundZ = -1;

	@ObfuscatedName("r.S")
	public static final int field317 = 4;

	@ObfuscatedName("r.T")
	public static int[] numOccluders = new int[field317];

	@ObfuscatedName("r.U")
	public static Occlude[][] occluders = new Occlude[field317][500];

	@ObfuscatedName("r.W")
	public static final Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("r.X")
	public static LinkList fillQueue = new LinkList(-199);

	@ObfuscatedName("r.lb")
	public static boolean[][][][] visBacking = new boolean[8][32][51][51];

	@ObfuscatedName("r.mb")
	public static boolean[][] visBackingDirty;

	@ObfuscatedName("r.a")
	public int field273 = 195;

	@ObfuscatedName("r.c")
	public int field275;

	@ObfuscatedName("r.d")
	public final int field276 = 6;

	@ObfuscatedName("r.e")
	public final byte field277 = -90;

	@ObfuscatedName("r.f")
	public int field278 = 7;

	@ObfuscatedName("r.g")
	public final int field279 = 5;

	@ObfuscatedName("r.h")
	public final int field280 = 8;

	@ObfuscatedName("r.j")
	public final int field282 = 4;

	@ObfuscatedName("r.m")
	public final int[][][] field285;

	@ObfuscatedName("r.r")
	public final int[][][] field290 = new int[4][105][105];

	@ObfuscatedName("r.s")
	public static int field291;

	@ObfuscatedName("r.t")
	public static int field292;

	@ObfuscatedName("r.u")
	public static int field293;

	@ObfuscatedName("r.v")
	public static int field294;

	@ObfuscatedName("r.w")
	public static int field295;

	@ObfuscatedName("r.x")
	public static int field296;

	@ObfuscatedName("r.y")
	public static int field297;

	@ObfuscatedName("r.z")
	public static int field298;

	@ObfuscatedName("r.ab")
	public static final int[] field325 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("r.bb")
	public static final int[] field326 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("r.cb")
	public static final int[] field327 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("r.db")
	public static final int[] field328 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("r.eb")
	public static final int[] field329 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("r.fb")
	public static final int[] field330 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("r.gb")
	public final int[] field331 = new int[10000];

	@ObfuscatedName("r.hb")
	public final int[] field332 = new int[10000];

	@ObfuscatedName("r.ib")
	public int field333;

	@ObfuscatedName("r.jb")
	public final int[][] field334 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("r.kb")
	public final int[][] field335 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("r.nb")
	public static int field338;

	@ObfuscatedName("r.ob")
	public static int field339;

	@ObfuscatedName("r.pb")
	public static int field340;

	@ObfuscatedName("r.qb")
	public static int field341;

	@ObfuscatedName("r.rb")
	public static int field342;

	@ObfuscatedName("r.sb")
	public static int field343;

	@ObfuscatedName("r.J")
	public static final int[] field308 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("r.K")
	public static final int[] field309 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("r.L")
	public static final int[] field310 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("r.M")
	public static final int[] field311 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("r.Y")
	public static final int[] field323 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("r.Z")
	public static final int[] field324 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("r.A")
	public static int field299;

	@ObfuscatedName("r.B")
	public static int field300;

	@ObfuscatedName("r.C")
	public static int field301;

	@ObfuscatedName("r.D")
	public static int field302;

	@ObfuscatedName("r.E")
	public static int field303;

	@ObfuscatedName("r.F")
	public static int field304;

	@ObfuscatedName("r.G")
	public static int field305;

	@ObfuscatedName("r.H")
	public static int field306;

	@ObfuscatedName("r.O")
	public static int field313;

	@ObfuscatedName("r.P")
	public static int field314;

	@ObfuscatedName("r.V")
	public static int field320;

	@ObfuscatedName("r.N")
	public static boolean field312;

	public World(int arg0, int arg1, int[][][] arg2, int arg3, int arg4) {
		field285 = arg2;
		if (arg4 <= 0) {
			field273 = 181;
		}
		resetMap();
	}

	@ObfuscatedName("r.a(Z)V")
	public void resetMap() {
		for (int var1 = 0; var1 < field282; var1++) {
			for (int var2 = 0; var2 < maxTileX; var2++) {
				for (int var3 = 0; var3 < maxTileZ; var3++) {
					squares[var1][var2][var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field317; var4++) {
			for (int var5 = 0; var5 < numOccluders[var4]; var5++) {
				occluders[var4][var5] = null;
			}
			numOccluders[var4] = 0;
		}
		for (int var6 = 0; var6 < dynamicCount; var6++) {
			dynamicSprites[var6] = null;
		}
		dynamicCount = 0;
		for (int var7 = 0; var7 < spriteBuffer.length; var7++) {
			spriteBuffer[var7] = null;
		}
	}

	@ObfuscatedName("r.a(BI)V")
	public void fillBaseLevel(int arg0) {
		minLevel = arg0;
		for (int var2 = 0; var2 < maxTileX; var2++) {
			for (int var3 = 0; var3 < maxTileZ; var3++) {
				squares[arg0][var2][var3] = new Square(arg0, var2, var3);
			}
		}
	}

	@ObfuscatedName("r.a(ZII)V")
	public void pushDown(int arg0, int arg1) {
		Square var3 = squares[0][arg1][arg0];
		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = squares[var4][arg1][arg0] = squares[var4 + 1][arg1][arg0];
			if (var5 != null) {
				var5.level--;
				for (int var6 = 0; var6 < var5.field373; var6++) {
					Sprite var7 = var5.sprites[var6];
					if ((var7.field262 >> 29 & 0x3) == 0x2 && var7.field256 == arg1 && var7.field258 == arg0) {
						var7.field250--;
					}
				}
			}
		}
		if (squares[0][arg1][arg0] == null) {
			squares[0][arg1][arg0] = new Square(0, arg1, arg0);
		}
		squares[0][arg1][arg0].linkedSquare = var3;
		squares[3][arg1][arg0] = null;
	}

	@ObfuscatedName("r.a(IIIIIIIII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.field221 = arg4 / 128;
		var8.field222 = arg3 / 128;
		var8.field223 = arg0 / 128;
		var8.field224 = arg6 / 128;
		var8.field225 = arg7;
		var8.field226 = arg4;
		var8.field227 = arg3;
		var8.field228 = arg0;
		var8.field229 = arg6;
		var8.field230 = arg2;
		var8.field231 = arg5;
		occluders[arg1][numOccluders[arg1]++] = var8;
	}

	@ObfuscatedName("r.a(IIII)V")
	public void setLayer(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = squares[arg0][arg1][arg2];
		if (var5 != null) {
			squares[arg0][arg1][arg2].field377 = arg3;
		}
	}

	@ObfuscatedName("r.a(BIIIZILx;I)V")
	public void setGroundDecor(byte arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6) {
		if (arg5 == null) {
			return;
		}
		GroundDecor var8 = new GroundDecor();
		var8.model = arg5;
		var8.field191 = arg6 * 128 + 64;
		var8.field192 = arg3 * 128 + 64;
		var8.field190 = arg4;
		var8.field194 = arg1;
		var8.field195 = arg0;
		if (squares[arg2][arg6][arg3] == null) {
			squares[arg2][arg6][arg3] = new Square(arg2, arg6, arg3);
		}
		squares[arg2][arg6][arg3].groundDecor = var8;
	}

	@ObfuscatedName("r.a(BIIIILx;IILx;II)V")
	public void setWall(byte arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, ModelSource arg7, int arg8, int arg9) {
		if (arg5 == null && arg7 == null) {
			return;
		}
		Wall var11 = new Wall();
		var11.field271 = arg3;
		var11.field272 = arg0;
		var11.field265 = arg4 * 128 + 64;
		var11.field266 = arg9 * 128 + 64;
		var11.field264 = arg2;
		var11.field269 = arg5;
		var11.field270 = arg7;
		var11.field267 = arg1;
		var11.field268 = arg6;
		for (int var12 = arg8; var12 >= 0; var12--) {
			if (squares[var12][arg4][arg9] == null) {
				squares[var12][arg4][arg9] = new Square(var12, arg4, arg9);
			}
		}
		squares[arg8][arg4][arg9].wall = var11;
	}

	@ObfuscatedName("r.a(IIILx;BIIIIIII)V")
	public void setDecor(int arg0, int arg1, int arg2, ModelSource arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg3 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.field162 = arg7;
		var13.field163 = arg4;
		var13.field157 = arg10 * 128 + arg8 + 64;
		var13.field158 = arg0 * 128 + arg11 + 64;
		var13.field156 = arg2;
		if (arg9 == 30967) {
			var13.model = arg3;
			var13.field159 = arg5;
			var13.field160 = arg6;
			for (int var14 = arg1; var14 >= 0; var14--) {
				if (squares[var14][arg10][arg0] == null) {
					squares[var14][arg10][arg0] = new Square(var14, arg10, arg0);
				}
			}
			squares[arg1][arg10][arg0].decor = var13;
		}
	}

	@ObfuscatedName("r.a(IIIIBIIIILx;I)Z")
	public boolean addScenery(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9) {
		if (arg8 == null) {
			return true;
		}
		int var11 = arg1 * 128 + arg6 * 64;
		int var12 = arg0 * 128 + arg9 * 64;
		return setSprite(arg7, arg1, arg0, arg6, arg9, var11, var12, arg2, arg8, arg5, false, arg4, arg3);
	}

	@ObfuscatedName("r.a(IIIIILx;IZII)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, boolean arg6, int arg7, int arg8) {
		if (arg4 == null) {
			return true;
		}
		int var10 = arg3 - arg0;
		int var11 = arg7 - arg0;
		int var12 = arg3 + arg0;
		int var13 = arg7 + arg0;
		if (arg6) {
			if (arg5 > 640 && arg5 < 1408) {
				var13 += 128;
			}
			if (arg5 > 1152 && arg5 < 1920) {
				var12 += 128;
			}
			if (arg5 > 1664 || arg5 < 384) {
				var11 -= 128;
			}
			if (arg5 > 128 && arg5 < 896) {
				var10 -= 128;
			}
		}
		int var14 = var10 / 128;
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		return setSprite(arg8, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg3, arg7, arg2, arg4, arg5, true, arg1, (byte) 0);
	}

	@ObfuscatedName("r.a(IIIIIIIILx;IZIB)Z")
	public boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= maxTileX || var15 >= maxTileZ) {
					return false;
				}
				Square var16 = squares[arg0][var14][var15];
				if (var16 != null && var16.field373 >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.field262 = arg11;
		var17.field263 = arg12;
		var17.field250 = arg0;
		var17.field252 = arg5;
		var17.field253 = arg6;
		var17.field251 = arg7;
		var17.model = arg8;
		var17.field255 = arg9;
		var17.field256 = arg1;
		var17.field258 = arg2;
		var17.field257 = arg1 + arg3 - 1;
		var17.field259 = arg2 + arg4 - 1;
		for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
			for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
				int var20 = 0;
				if (var18 > arg1) {
					var20++;
				}
				if (var18 < arg1 + arg3 - 1) {
					var20 += 4;
				}
				if (var19 > arg2) {
					var20 += 8;
				}
				if (var19 < arg2 + arg4 - 1) {
					var20 += 2;
				}
				for (int var21 = arg0; var21 >= 0; var21--) {
					if (squares[var21][var18][var19] == null) {
						squares[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = squares[arg0][var18][var19];
				var22.sprites[var22.field373] = var17;
				var22.spriteSpan[var22.field373] = var20;
				var22.field376 |= var20;
				var22.field373++;
			}
		}
		if (arg10) {
			dynamicSprites[dynamicCount++] = var17;
		}
		return true;
	}

	@ObfuscatedName("r.b(Z)V")
	public void removeSprites() {
		for (int var1 = 0; var1 < dynamicCount; var1++) {
			Sprite var2 = dynamicSprites[var1];
			method65(var2);
			dynamicSprites[var1] = null;
		}
		dynamicCount = 0;
	}

	@ObfuscatedName("r.a(IIBII)V")
	public void moveDecor(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = squares[arg3][arg2][arg0];
		if (var5 != null) {
			Decor var6 = var5.decor;
			if (var6 != null) {
				int var7 = arg2 * 128 + 64;
				int var8 = arg0 * 128 + 64;
				var6.field157 = var7 + (var6.field157 - var7) * arg1 / 16;
				var6.field158 = var8 + (var6.field158 - var8) * arg1 / 16;
				if (field277 == -90) {
					;
				}
			}
		}
	}

	@ObfuscatedName("r.a(IIBI)V")
	public void delWall(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg2][arg1][arg0];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	@ObfuscatedName("r.b(IIII)V")
	public void delDecor(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg2][arg1];
		if (var4 != null) {
			var4.decor = null;
		}
	}

	@ObfuscatedName("r.c(IIII)V")
	public void delLoc(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg2][arg1];
		if (var4 == null) {
			return;
		}
		for (int var5 = 0; var5 < var4.field373; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field262 >> 29 & 0x3) == 0x2 && var6.field256 == arg2 && var6.field258 == arg1) {
				method65(var6);
				return;
			}
		}
	}

	@ObfuscatedName("r.d(IIII)V")
	public void delGroundDecor(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg2][arg0][arg1];
		if (var4 != null) {
			var4.groundDecor = null;
		}
	}

	@ObfuscatedName("r.a(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("r.a(IZII)Lq;")
	public Wall getWall(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}
		return var4.wall;
	}

	@ObfuscatedName("r.b(III)I")
	public int wallType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.field271;
	}

	@ObfuscatedName("r.h(IIII)I")
	public int decorType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg1][arg2][arg0];
		return var4 == null || var4.decor == null ? 0 : var4.decor.field162;
	}

	@ObfuscatedName("r.c(III)I")
	public int sceneType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field373; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field262 >> 29 & 0x3) == 0x2 && var6.field256 == arg1 && var6.field258 == arg2) {
				return var6.field262;
			}
		}
		return 0;
	}

	@ObfuscatedName("r.d(III)I")
	public int gdType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.field194;
	}

	@ObfuscatedName("r.a([IIIIII)V")
	public void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = squares[arg2][arg3][arg4];
		if (var6 != null) {
			QuickGround var7 = var6.quickGround;
			if (var7 == null) {
				Ground var10 = var6.ground;
				if (var10 != null) {
					int var11 = var10.overlayShape;
					int var12 = var10.overlayRotation;
					int var13 = var10.minimapOverlay;
					int var14 = var10.minimapUnderlay;
					int[] var15 = field334[var11];
					int[] var16 = field335[var12];
					int var17 = 0;
					if (var13 == 0) {
						for (int var19 = 0; var19 < 4; var19++) {
							if (var15[var16[var17++]] != 0) {
								arg0[arg1] = var14;
							}
							if (var15[var16[var17++]] != 0) {
								arg0[arg1 + 1] = var14;
							}
							if (var15[var16[var17++]] != 0) {
								arg0[arg1 + 2] = var14;
							}
							if (var15[var16[var17++]] != 0) {
								arg0[arg1 + 3] = var14;
							}
							arg1 += 512;
						}
					} else {
						for (int var18 = 0; var18 < 4; var18++) {
							arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
							arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
							arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
							arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
							arg1 += 512;
						}
					}
				}
			} else {
				int var8 = var7.minimapRgb;
				if (var8 != 0) {
					for (int var9 = 0; var9 < 4; var9++) {
						arg0[arg1] = var8;
						arg0[arg1 + 1] = var8;
						arg0[arg1 + 2] = var8;
						arg0[arg1 + 3] = var8;
						arg1 += 512;
					}
				}
			}
		}
	}

	@ObfuscatedName("r.b([IIIIII)V")
	public static void resetVisCalc(int[] arg0) {
		field340 = 0;
		field341 = 0;
		field342 = 512;
		field343 = 334;
		field338 = 256;
		field339 = 167;
		boolean[][][][] var1 = new boolean[9][32][53][53];
		for (int var2 = 128; var2 <= 384; var2 += 32) {
			for (int var3 = 0; var3 < 2048; var3 += 64) {
				field303 = Model.sinTable[var2];
				field304 = Model.cosTable[var2];
				field305 = Model.sinTable[var3];
				field306 = Model.cosTable[var3];
				int var4 = (var2 - 128) / 32;
				int var5 = var3 / 64;
				for (int var6 = -26; var6 <= 26; var6++) {
					for (int var7 = -26; var7 <= 26; var7++) {
						int var8 = var6 * 128;
						int var9 = var7 * 128;
						boolean var10 = false;
						for (int var11 = -500; var11 <= 800; var11 += 128) {
							if (method87(arg0[var4] + var11, var9, var8)) {
								var10 = true;
								break;
							}
						}
						var1[var4][var5][var6 + 25 + 1][var7 + 25 + 1] = var10;
					}
				}
			}
		}
		for (int var12 = 0; var12 < 8; var12++) {
			for (int var13 = 0; var13 < 32; var13++) {
				for (int var14 = -25; var14 < 25; var14++) {
					for (int var15 = -25; var15 < 25; var15++) {
						boolean var16 = false;
						label76: for (int var17 = -1; var17 <= 1; var17++) {
							for (int var18 = -1; var18 <= 1; var18++) {
								if (var1[var12][var13][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var1[var12][(var13 + 1) % 31][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var1[var12 + 1][var13][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
								if (var1[var12 + 1][(var13 + 1) % 31][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}
						visBacking[var12][var13][var14 + 25][var15 + 25] = var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(IIIIIII)V")
	public void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
		field293++;
		field303 = Model.sinTable[arg1];
		field304 = Model.cosTable[arg1];
		field305 = Model.sinTable[arg5];
		field306 = Model.cosTable[arg5];
		visBackingDirty = visBacking[(arg1 - 128) / 32][arg5 / 64];
		field300 = arg0;
		if (field278 > 7 || field278 < 7) {
			field278 = -370;
		}
		field301 = arg4;
		field302 = arg2;
		field298 = arg0 / 128;
		field299 = arg2 / 128;
		field292 = arg3;
		field294 = field298 - 25;
		if (field294 < 0) {
			field294 = 0;
		}
		field296 = field299 - 25;
		if (field296 < 0) {
			field296 = 0;
		}
		field295 = field298 + 25;
		if (field295 > maxTileX) {
			field295 = maxTileX;
		}
		field297 = field299 + 25;
		if (field297 > maxTileZ) {
			field297 = maxTileZ;
		}
		method95();
		field291 = 0;
		for (int var7 = minLevel; var7 < field282; var7++) {
			Square[][] var8 = squares[var7];
			for (int var9 = field294; var9 < field295; var9++) {
				for (int var10 = field296; var10 < field297; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field377 <= arg3 && (visBackingDirty[var9 + 25 - field298][var10 + 25 - field299] || field285[var7][var9][var10] - arg4 >= 2000)) {
							var11.field378 = true;
							var11.field379 = true;
							if (var11.field373 > 0) {
								var11.field380 = true;
							} else {
								var11.field380 = false;
							}
							field291++;
						} else {
							var11.field378 = false;
							var11.field379 = false;
							var11.field381 = 0;
						}
					}
				}
			}
		}
		for (int var12 = minLevel; var12 < field282; var12++) {
			Square[][] var13 = squares[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = field298 + var14;
				int var16 = field298 - var14;
				if (var15 >= field294 || var16 < field295) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = field299 + var17;
						int var19 = field299 - var17;
						if (var15 >= field294) {
							if (var18 >= field296) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.field378) {
									method90(var20, true);
								}
							}
							if (var19 < field297) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.field378) {
									method90(var21, true);
								}
							}
						}
						if (var16 < field295) {
							if (var18 >= field296) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.field378) {
									method90(var22, true);
								}
							}
							if (var19 < field297) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.field378) {
									method90(var23, true);
								}
							}
						}
						if (field291 == 0) {
							field312 = false;
							return;
						}
					}
				}
			}
		}
		for (int var24 = minLevel; var24 < field282; var24++) {
			Square[][] var25 = squares[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = field298 + var26;
				int var28 = field298 - var26;
				if (var27 >= field294 || var28 < field295) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = field299 + var29;
						int var31 = field299 - var29;
						if (var27 >= field294) {
							if (var30 >= field296) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.field378) {
									method90(var32, false);
								}
							}
							if (var31 < field297) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.field378) {
									method90(var33, false);
								}
							}
						}
						if (var28 < field295) {
							if (var30 >= field296) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.field378) {
									method90(var34, false);
								}
							}
							if (var31 < field297) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.field378) {
									method90(var35, false);
								}
							}
						}
						if (field291 == 0) {
							field312 = false;
							return;
						}
					}
				}
			}
		}
		field312 = false;
	}

	@ObfuscatedName("r.a(Lo;IIIIIII)V")
	public void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field300;
		int var11;
		int var12 = var11 = (arg7 << 7) - field302;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = field285[arg1][arg6][arg7] - field301;
		int var18 = field285[arg1][arg6 + 1][arg7] - field301;
		int var19 = field285[arg1][arg6 + 1][arg7 + 1] - field301;
		int var20 = field285[arg1][arg6][arg7 + 1] - field301;
		int var21 = var12 * arg4 + var10 * arg5 >> 16;
		int var22 = var12 * arg5 - var10 * arg4 >> 16;
		int var24 = var17 * arg3 - var22 * arg2 >> 16;
		int var25 = var17 * arg2 + var22 * arg3 >> 16;
		if (var25 >= 50) {
			int var27 = var11 * arg4 + var14 * arg5 >> 16;
			int var28 = var11 * arg5 - var14 * arg4 >> 16;
			int var30 = var18 * arg3 - var28 * arg2 >> 16;
			int var31 = var18 * arg2 + var28 * arg3 >> 16;
			if (var31 >= 50) {
				int var33 = var16 * arg4 + var13 * arg5 >> 16;
				int var34 = var16 * arg5 - var13 * arg4 >> 16;
				int var36 = var19 * arg3 - var34 * arg2 >> 16;
				int var37 = var19 * arg2 + var34 * arg3 >> 16;
				if (var37 >= 50) {
					int var39 = var15 * arg4 + var9 * arg5 >> 16;
					int var40 = var15 * arg5 - var9 * arg4 >> 16;
					int var42 = var20 * arg3 - var40 * arg2 >> 16;
					int var43 = var20 * arg2 + var40 * arg3 >> 16;
					if (var43 >= 50) {
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
							Pix3D.hclip = false;
							if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix2D.sizeX || var50 > Pix2D.sizeX || var46 > Pix2D.sizeX) {
								Pix3D.hclip = true;
							}
							if (field312 && insideTriangle(field313, field314, var49, var51, var47, var48, var50, var46)) {
								groundX = arg6;
								groundZ = arg7;
							}
							if (arg0.texture == -1) {
								if (arg0.colourNE != 12345678) {
									Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.colourNW, arg0.colourSE);
								}
							} else if (lowMem) {
								int var52 = field330[arg0.texture];
								Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, method93(arg0.colourNE, var52, field279), method93(arg0.colourNW, var52, field279), method93(arg0.colourSE, var52, field279));
							} else if (arg0.flat) {
								Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.colourNW, arg0.colourSE, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.texture);
							} else {
								Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.colourNW, arg0.colourSE, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.texture);
							}
						}
						if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) > 0) {
							Pix3D.hclip = false;
							if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix2D.sizeX || var46 > Pix2D.sizeX || var50 > Pix2D.sizeX) {
								Pix3D.hclip = true;
							}
							if (field312 && insideTriangle(field313, field314, var45, var47, var51, var44, var46, var50)) {
								groundX = arg6;
								groundZ = arg7;
							}
							if (arg0.texture != -1) {
								if (!lowMem) {
									Pix3D.textureTriangle(var45, var47, var51, var44, var46, var50, arg0.colourSW, arg0.colourSE, arg0.colourNW, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.texture);
									return;
								}
								int var53 = field330[arg0.texture];
								Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, method93(arg0.colourSW, var53, field279), method93(arg0.colourSE, var53, field279), method93(arg0.colourNW, var53, field279));
							} else if (arg0.colourSW != 12345678) {
								Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, arg0.colourSW, arg0.colourSE, arg0.colourNW);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(IIIIIIII)Z")
	public boolean insideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return var9 * var11 > 0 && var11 * var10 > 0;
		}
	}

	@ObfuscatedName("r.g(III)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2) {
		int var4 = field290[arg0][arg1][arg2];
		if (var4 == -field293) {
			return false;
		} else if (var4 == field293) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (method100(var5 + 1, field285[arg0][arg1][arg2], var6 + 1) && method100(var5 + 128 - 1, field285[arg0][arg1 + 1][arg2], var6 + 1) && method100(var5 + 128 - 1, field285[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && method100(var5 + 1, field285[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				field290[arg0][arg1][arg2] = field293;
				return true;
			}
			field290[arg0][arg1][arg2] = -field293;
			return false;
		}
	}

	@ObfuscatedName("r.a(B)V")
	public static void unload() {
		spriteBuffer = null;
		numOccluders = null;
		occluders = null;
		fillQueue = null;
		visBacking = null;
		visBackingDirty = null;
	}

	@ObfuscatedName("r.j(IIII)Z")
	public static boolean method87(int arg0, int arg1, int arg2) {
		int var3 = arg1 * field305 + arg2 * field306 >> 16;
		int var4 = arg1 * field306 - arg2 * field305 >> 16;
		int var5 = arg0 * field303 + var4 * field304 >> 16;
		int var6 = arg0 * field304 - var4 * field303 >> 16;
		if (var5 < 50 || var5 > 3500) {
			return false;
		}
		int var7 = field338 + (var3 << 9) / var5;
		int var8 = field339 + (var6 << 9) / var5;
		return var7 >= field340 && var7 <= field342 && var8 >= field341 && var8 <= field343;
	}

	@ObfuscatedName("r.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (squares[var22][arg1][arg2] == null) {
					squares[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			squares[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (squares[var24][arg1][arg2] == null) {
					squares[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			squares[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg14, arg7, arg1, arg10, arg13, arg19, arg12, arg18, arg6, arg5, arg9, arg15, arg17, 356, arg4, arg16, arg2, arg3, arg11, arg8);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (squares[var26][arg1][arg2] == null) {
					squares[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			squares[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("r.a(IILx;IBLx;IILx;)V")
	public void method57(int arg0, int arg1, ModelSource arg2, int arg3, ModelSource arg4, int arg5, int arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.field199 = arg7;
		var9.field197 = arg3 * 128 + 64;
		var9.field198 = arg0 * 128 + 64;
		var9.field196 = arg6;
		var9.field202 = arg1;
		var9.field200 = arg2;
		var9.field201 = arg4;
		int var10 = 0;
		Square var11 = squares[arg5][arg3][arg0];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field373; var12++) {
				if (var11.sprites[var12].model instanceof Model) {
					int var13 = ((Model) var11.sprites[var12].model).objRaise;
					if (var13 > var10) {
						var10 = var13;
					}
				}
			}
		}
		var9.field203 = var10;
		if (squares[arg5][arg3][arg0] == null) {
			squares[arg5][arg3][arg0] = new Square(arg5, arg3, arg0);
		}
		squares[arg5][arg3][arg0].groundObject = var9;
	}

	@ObfuscatedName("r.a(IIZIIIILx;IIIII)Z")
	public boolean addDynamic2(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg5 == null) {
			return true;
		}
		return setSprite(arg7, arg9, arg1, arg2 + 1 - arg9, arg4 - arg1 + 1, arg3, arg6, arg8, arg5, arg10, true, arg0, (byte) 0);
	}

	@ObfuscatedName("r.a(ILp;)V")
	public void method65(Sprite arg0) {
		for (int var2 = arg0.field256; var2 <= arg0.field257; var2++) {
			for (int var3 = arg0.field258; var3 <= arg0.field259; var3++) {
				Square var4 = squares[arg0.field250][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.field373; var5++) {
						if (var4.sprites[var5] == arg0) {
							var4.field373--;
							for (int var6 = var5; var6 < var4.field373; var6++) {
								var4.sprites[var6] = var4.sprites[var6 + 1];
								var4.spriteSpan[var6] = var4.spriteSpan[var6 + 1];
							}
							var4.sprites[var4.field373] = null;
							break;
						}
					}
					var4.field376 = 0;
					for (int var7 = 0; var7 < var4.field373; var7++) {
						var4.field376 |= var4.spriteSpan[var7];
					}
				}
			}
		}
		if (field276 == 6) {
			;
		}
	}

	@ObfuscatedName("r.e(IIII)Lh;")
	public Decor method73(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg1][arg2][arg0];
		if (var4 == null) {
			return null;
		}
		return var4.decor;
	}

	@ObfuscatedName("r.f(IIII)Lp;")
	public Sprite method74(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg2][arg0][arg1];
		if (var4 == null) {
			return null;
		}
		for (int var5 = 0; var5 < var4.field373; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field262 >> 29 & 0x3) == 0x2 && var6.field256 == arg0 && var6.field258 == arg1) {
				return var6;
			}
		}
		return null;
	}

	@ObfuscatedName("r.g(IIII)Lj;")
	public GroundDecor method75(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg2][arg1];
		return var4 == null || var4.groundDecor == null ? null : var4.groundDecor;
	}

	@ObfuscatedName("r.i(IIII)I")
	public int typeCode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = squares[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.field271 == arg3) {
			return var5.wall.field272 & 0xFF;
		} else if (var5.decor != null && var5.decor.field162 == arg3) {
			return var5.decor.field163 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.field194 == arg3) {
			return var5.groundDecor.field195 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field373; var6++) {
				if (var5.sprites[var6].field262 == arg3) {
					return var5.sprites[var6].field263 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("r.a(IIIIII)V")
	public void method81() {
		int var1 = (int) Math.sqrt((double) 5100);
		int var2 = var1 * 768 >> 8;
		for (int var3 = 0; var3 < field282; var3++) {
			for (int var4 = 0; var4 < maxTileX; var4++) {
				for (int var5 = 0; var5 < maxTileZ; var5++) {
					Square var6 = squares[var3][var4][var5];
					if (var6 != null) {
						Wall var7 = var6.wall;
						if (var7 != null && var7.field269 != null && var7.field269.pointNormal != null) {
							method83(var4, 1, 1, var5, var3, (Model) var7.field269);
							if (var7.field270 != null && var7.field270.pointNormal != null) {
								method83(var4, 1, 1, var5, var3, (Model) var7.field270);
								method84((Model) var7.field269, (Model) var7.field270, 0, 0, 0, false);
								((Model) var7.field270).light(64, var2, -50, -10, -50);
							}
							((Model) var7.field269).light(64, var2, -50, -10, -50);
						}
						for (int var8 = 0; var8 < var6.field373; var8++) {
							Sprite var9 = var6.sprites[var8];
							if (var9 != null && var9.model != null && var9.model.pointNormal != null) {
								method83(var4, var9.field257 + 1 - var9.field256, var9.field259 - var9.field258 + 1, var5, var3, (Model) var9.model);
								((Model) var9.model).light(64, var2, -50, -10, -50);
							}
						}
						GroundDecor var10 = var6.groundDecor;
						if (var10 != null && var10.model.pointNormal != null) {
							method82(var3, var5, var4, (Model) var10.model);
							((Model) var10.model).light(64, var2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(IZIILeb;)V")
	public void method82(int arg0, int arg1, int arg2, Model arg3) {
		if (arg2 < maxTileX) {
			Square var5 = squares[arg0][arg2 + 1][arg1];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.model.pointNormal != null) {
				method84(arg3, (Model) var5.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg1 < maxTileX) {
			Square var6 = squares[arg0][arg2][arg1 + 1];
			if (var6 != null && var6.groundDecor != null && var6.groundDecor.model.pointNormal != null) {
				method84(arg3, (Model) var6.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg2 < maxTileX && arg1 < maxTileZ) {
			Square var7 = squares[arg0][arg2 + 1][arg1 + 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.pointNormal != null) {
				method84(arg3, (Model) var7.groundDecor.model, 128, 0, 128, true);
			}
		}
		if (arg2 < maxTileX && arg1 > 0) {
			Square var8 = squares[arg0][arg2 + 1][arg1 - 1];
			if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.pointNormal != null) {
				method84(arg3, (Model) var8.groundDecor.model, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("r.a(IIIIIILeb;)V")
	public void method83(int arg0, int arg1, int arg2, int arg3, int arg4, Model arg5) {
		boolean var7 = true;
		int var8 = arg0;
		int var9 = arg0 + arg1;
		int var10 = arg3 - 1;
		int var11 = arg3 + arg2;
		for (int var12 = arg4; var12 <= arg4 + 1; var12++) {
			if (var12 != field282) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < maxTileX) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < maxTileZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && var13 != arg0)) {
								Square var15 = squares[var12][var13][var14];
								if (var15 != null) {
									int var16 = (field285[var12][var13][var14] + field285[var12][var13 + 1][var14] + field285[var12][var13][var14 + 1] + field285[var12][var13 + 1][var14 + 1]) / 4 - (field285[arg4][arg0][arg3] + field285[arg4][arg0 + 1][arg3] + field285[arg4][arg0][arg3 + 1] + field285[arg4][arg0 + 1][arg3 + 1]) / 4;
									Wall var17 = var15.wall;
									if (var17 != null && var17.field269 != null && var17.field269.pointNormal != null) {
										method84(arg5, (Model) var17.field269, (var13 - arg0) * 128 + (1 - arg1) * 64, var16, (var14 - arg3) * 128 + (1 - arg2) * 64, var7);
									}
									if (var17 != null && var17.field270 != null && var17.field270.pointNormal != null) {
										method84(arg5, (Model) var17.field270, (var13 - arg0) * 128 + (1 - arg1) * 64, var16, (var14 - arg3) * 128 + (1 - arg2) * 64, var7);
									}
									for (int var18 = 0; var18 < var15.field373; var18++) {
										Sprite var19 = var15.sprites[var18];
										if (var19 != null && var19.model != null && var19.model.pointNormal != null) {
											int var20 = var19.field257 + 1 - var19.field256;
											int var21 = var19.field259 + 1 - var19.field258;
											method84(arg5, (Model) var19.model, (var19.field256 - arg0) * 128 + (var20 - arg1) * 64, var16, (var19.field258 - arg3) * 128 + (var21 - arg2) * 64, var7);
										}
									}
								}
							}
						}
					}
				}
				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("r.a(Leb;Leb;IIIZ)V")
	public void method84(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		field333++;
		int var7 = 0;
		int[] var8 = arg1.pointX;
		int var9 = arg1.numPoints;
		for (int var10 = 0; var10 < arg0.numPoints; var10++) {
			PointNormal var11 = arg0.pointNormal[var10];
			PointNormal var12 = arg0.sharedPointNormal[var10];
			if (var12.w != 0) {
				int var13 = arg0.pointY[var10] - arg3;
				if (var13 <= arg1.maxY) {
					int var14 = arg0.pointX[var10] - arg2;
					if (var14 >= arg1.minX && var14 <= arg1.maxX) {
						int var15 = arg0.pointZ[var10] - arg4;
						if (var15 >= arg1.minZ && var15 <= arg1.maxZ) {
							for (int var16 = 0; var16 < var9; var16++) {
								PointNormal var17 = arg1.pointNormal[var16];
								PointNormal var18 = arg1.sharedPointNormal[var16];
								if (var14 == var8[var16] && var15 == arg1.pointZ[var16] && var13 == arg1.pointY[var16] && var18.w != 0) {
									var11.x += var18.x;
									var11.y += var18.y;
									var11.z += var18.z;
									var11.w += var18.w;
									var17.x += var12.x;
									var17.y += var12.y;
									var17.z += var12.z;
									var17.w += var12.w;
									var7++;
									field331[var10] = field333;
									field332[var16] = field333;
								}
							}
						}
					}
				}
			}
		}
		if (var7 >= 3 && arg5) {
			for (int var19 = 0; var19 < arg0.numFaces; var19++) {
				if (field331[arg0.faceVertexA[var19]] == field333 && field331[arg0.faceVertexB[var19]] == field333 && field331[arg0.faceVertexC[var19]] == field333) {
					arg0.faceRenderType[var19] = -1;
				}
			}
			for (int var20 = 0; var20 < arg1.numFaces; var20++) {
				if (field332[arg1.faceVertexA[var20]] == field333 && field332[arg1.faceVertexB[var20]] == field333 && field332[arg1.faceVertexC[var20]] == field333) {
					arg1.faceRenderType[var20] = -1;
				}
			}
		}
	}

	@ObfuscatedName("r.e(III)V")
	public void method88(int arg0, int arg1, int arg2) {
		field312 = true;
		field313 = arg2;
		if (arg1 != 0) {
		}
		field314 = arg0;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("r.a(Lv;Z)V")
	public void method90(Square arg0, boolean arg1) {
		fillQueue.push(arg0);
		while (true) {
			Square var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Square[][] var8;
			Square var70;
			do {
				Square var69;
				do {
					Square var68;
					do {
						Square var67;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var3 = (Square) fillQueue.popFront();
												if (var3 == null) {
													return;
												}
											} while (!var3.field379);
											var4 = var3.x;
											var5 = var3.z;
											var6 = var3.level;
											var7 = var3.originalLevel;
											var8 = squares[var6];
											if (!var3.field378) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = squares[var6 - 1][var4][var5];
													if (var9 != null && var9.field379) {
														continue;
													}
												}
												if (var4 <= field298 && var4 > field294) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field379 && (var10.field378 || (var3.field376 & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= field298 && var4 < field295 - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field379 && (var11.field378 || (var3.field376 & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= field299 && var5 > field296) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field379 && (var12.field378 || (var3.field376 & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= field299 && var5 < field297 - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field379 && (var13.field378 || (var3.field376 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field378 = false;
											if (var3.linkedSquare != null) {
												Square var14 = var3.linkedSquare;
												if (var14.quickGround == null) {
													if (var14.ground != null && !spriteOccluded(0, var4, var5)) {
														method92(var4, field305, var5, field303, var14.ground, field306, field304);
													}
												} else if (!spriteOccluded(0, var4, var5)) {
													renderQuickGround(var14.quickGround, 0, field303, field304, field305, field306, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.field269.worldRender(0, field303, field304, field305, field306, var15.field265 - field300, var15.field264 - field301, var15.field266 - field302, var15.field271);
												}
												for (int var16 = 0; var16 < var14.field373; var16++) {
													Sprite var17 = var14.sprites[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.field255, field303, field304, field305, field306, var17.field252 - field300, var17.field251 - field301, var17.field253 - field302, var17.field262);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !spriteOccluded(var7, var4, var5)) {
													var18 = true;
													method92(var4, field305, var5, field303, var3.ground, field306, field304);
												}
											} else if (!spriteOccluded(var7, var4, var5)) {
												var18 = true;
												renderQuickGround(var3.quickGround, var7, field303, field304, field305, field306, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.wall;
											Decor var22 = var3.decor;
											if (var21 != null || var22 != null) {
												if (field298 == var4) {
													var19++;
												} else if (field298 < var4) {
													var19 += 2;
												}
												if (field299 == var5) {
													var19 += 3;
												} else if (field299 > var5) {
													var19 += 6;
												}
												var20 = field323[var19];
												var3.field384 = field325[var19];
											}
											if (var21 != null) {
												if ((var21.field267 & field324[var19]) == 0) {
													var3.field381 = 0;
												} else if (var21.field267 == 16) {
													var3.field381 = 3;
													var3.field382 = field326[var19];
													var3.field383 = 3 - var3.field382;
												} else if (var21.field267 == 32) {
													var3.field381 = 6;
													var3.field382 = field327[var19];
													var3.field383 = 6 - var3.field382;
												} else if (var21.field267 == 64) {
													var3.field381 = 12;
													var3.field382 = field328[var19];
													var3.field383 = 12 - var3.field382;
												} else {
													var3.field381 = 9;
													var3.field382 = field329[var19];
													var3.field383 = 9 - var3.field382;
												}
												if ((var21.field267 & var20) != 0 && !method97(var7, var4, var5, var21.field267)) {
													var21.field269.worldRender(0, field303, field304, field305, field306, var21.field265 - field300, var21.field264 - field301, var21.field266 - field302, var21.field271);
												}
												if ((var21.field268 & var20) != 0 && !method97(var7, var4, var5, var21.field268)) {
													var21.field270.worldRender(0, field303, field304, field305, field306, var21.field265 - field300, var21.field264 - field301, var21.field266 - field302, var21.field271);
												}
											}
											if (var22 != null && !method98(var7, var4, var5, var22.model.minY)) {
												if ((var22.field159 & var20) != 0) {
													var22.model.worldRender(var22.field160, field303, field304, field305, field306, var22.field157 - field300, var22.field156 - field301, var22.field158 - field302, var22.field162);
												} else if ((var22.field159 & 0x300) != 0) {
													int var23 = var22.field157 - field300;
													int var24 = var22.field156 - field301;
													int var25 = var22.field158 - field302;
													int var26 = var22.field160;
													int var27;
													if (var26 == 1 || var26 == 2) {
														var27 = -var23;
													} else {
														var27 = var23;
													}
													int var28;
													if (var26 == 2 || var26 == 3) {
														var28 = -var25;
													} else {
														var28 = var25;
													}
													if ((var22.field159 & 0x100) != 0 && var28 < var27) {
														int var29 = var23 + field308[var26];
														int var30 = var25 + field309[var26];
														var22.model.worldRender(var26 * 512 + 256, field303, field304, field305, field306, var29, var24, var30, var22.field162);
													}
													if ((var22.field159 & 0x200) != 0 && var28 > var27) {
														int var31 = var23 + field310[var26];
														int var32 = var25 + field311[var26];
														var22.model.worldRender(var26 * 512 + 1280 & 0x7FF, field303, field304, field305, field306, var31, var24, var32, var22.field162);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.worldRender(0, field303, field304, field305, field306, var33.field191 - field300, var33.field190 - field301, var33.field192 - field302, var33.field194);
												}
												GroundObject var34 = var3.groundObject;
												if (var34 != null && var34.field203 == 0) {
													if (var34.field200 != null) {
														var34.field200.worldRender(0, field303, field304, field305, field306, var34.field197 - field300, var34.field196 - field301, var34.field198 - field302, var34.field202);
													}
													if (var34.field201 != null) {
														var34.field201.worldRender(0, field303, field304, field305, field306, var34.field197 - field300, var34.field196 - field301, var34.field198 - field302, var34.field202);
													}
													if (var34.field199 != null) {
														var34.field199.worldRender(0, field303, field304, field305, field306, var34.field197 - field300, var34.field196 - field301, var34.field198 - field302, var34.field202);
													}
												}
											}
											int var35 = var3.field376;
											if (var35 != 0) {
												if (var4 < field298 && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field379) {
														fillQueue.push(var36);
													}
												}
												if (var5 < field299 && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.field379) {
														fillQueue.push(var37);
													}
												}
												if (var4 > field298 && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.field379) {
														fillQueue.push(var38);
													}
												}
												if (var5 > field299 && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.field379) {
														fillQueue.push(var39);
													}
												}
											}
											break;
										}
										if (var3.field381 != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.field373; var41++) {
												if (var3.sprites[var41].field261 != field293 && (var3.spriteSpan[var41] & var3.field381) == var3.field382) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!method97(var7, var4, var5, var42.field267)) {
													var42.field269.worldRender(0, field303, field304, field305, field306, var42.field265 - field300, var42.field264 - field301, var42.field266 - field302, var42.field271);
												}
												var3.field381 = 0;
											}
										}
										if (!var3.field380) {
											break;
										}
										try {
											int var43 = var3.field373;
											var3.field380 = false;
											int var44 = 0;
											label559: for (int var45 = 0; var45 < var43; var45++) {
												Sprite var46 = var3.sprites[var45];
												if (var46.field261 != field293) {
													for (int var47 = var46.field256; var47 <= var46.field257; var47++) {
														for (int var48 = var46.field258; var48 <= var46.field259; var48++) {
															Square var49 = var8[var47][var48];
															if (var49.field378) {
																var3.field380 = true;
																continue label559;
															}
															if (var49.field381 != 0) {
																int var50 = 0;
																if (var47 > var46.field256) {
																	var50++;
																}
																if (var47 < var46.field257) {
																	var50 += 4;
																}
																if (var48 > var46.field258) {
																	var50 += 8;
																}
																if (var48 < var46.field259) {
																	var50 += 2;
																}
																if ((var50 & var49.field381) == var3.field383) {
																	var3.field380 = true;
																	continue label559;
																}
															}
														}
													}
													spriteBuffer[var44++] = var46;
													int var51 = field298 - var46.field256;
													int var52 = var46.field257 - field298;
													if (var52 > var51) {
														var51 = var52;
													}
													int var53 = field299 - var46.field258;
													int var54 = var46.field259 - field299;
													if (var54 > var53) {
														var46.field260 = var51 + var54;
													} else {
														var46.field260 = var51 + var53;
													}
												}
											}
											while (var44 > 0) {
												int var55 = -50;
												int var56 = -1;
												for (int var57 = 0; var57 < var44; var57++) {
													Sprite var58 = spriteBuffer[var57];
													if (var58.field261 != field293) {
														if (var58.field260 > var55) {
															var55 = var58.field260;
															var56 = var57;
														} else if (var58.field260 == var55) {
															int var59 = var58.field252 - field300;
															int var60 = var58.field253 - field302;
															int var61 = spriteBuffer[var56].field252 - field300;
															int var62 = spriteBuffer[var56].field253 - field302;
															if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
																var56 = var57;
															}
														}
													}
												}
												if (var56 == -1) {
													break;
												}
												Sprite var63 = spriteBuffer[var56];
												var63.field261 = field293;
												if (!method99(var7, var63.field256, var63.field257, var63.field258, var63.field259, var63.model.minY)) {
													var63.model.worldRender(var63.field255, field303, field304, field305, field306, var63.field252 - field300, var63.field251 - field301, var63.field253 - field302, var63.field262);
												}
												for (int var64 = var63.field256; var64 <= var63.field257; var64++) {
													for (int var65 = var63.field258; var65 <= var63.field259; var65++) {
														Square var66 = var8[var64][var65];
														if (var66.field381 != 0) {
															fillQueue.push(var66);
														} else if ((var64 != var4 || var65 != var5) && var66.field379) {
															fillQueue.push(var66);
														}
													}
												}
											}
											if (!var3.field380) {
												break;
											}
										} catch (Exception var89) {
											var3.field380 = false;
											break;
										}
									}
								} while (!var3.field379);
							} while (var3.field381 != 0);
							if (var4 > field298 || var4 <= field294) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.field379);
						if (var4 < field298 || var4 >= field295 - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.field379);
					if (var5 > field299 || var5 <= field296) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.field379);
				if (var5 < field299 || var5 >= field297 - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.field379);
			var3.field379 = false;
			field291--;
			GroundObject var71 = var3.groundObject;
			if (var71 != null && var71.field203 != 0) {
				if (var71.field200 != null) {
					var71.field200.worldRender(0, field303, field304, field305, field306, var71.field197 - field300, var71.field196 - field301 - var71.field203, var71.field198 - field302, var71.field202);
				}
				if (var71.field201 != null) {
					var71.field201.worldRender(0, field303, field304, field305, field306, var71.field197 - field300, var71.field196 - field301 - var71.field203, var71.field198 - field302, var71.field202);
				}
				if (var71.field199 != null) {
					var71.field199.worldRender(0, field303, field304, field305, field306, var71.field197 - field300, var71.field196 - field301 - var71.field203, var71.field198 - field302, var71.field202);
				}
			}
			if (var3.field384 != 0) {
				Decor var72 = var3.decor;
				if (var72 != null && !method98(var7, var4, var5, var72.model.minY)) {
					if ((var72.field159 & var3.field384) != 0) {
						var72.model.worldRender(var72.field160, field303, field304, field305, field306, var72.field157 - field300, var72.field156 - field301, var72.field158 - field302, var72.field162);
					} else if ((var72.field159 & 0x300) != 0) {
						int var73 = var72.field157 - field300;
						int var74 = var72.field156 - field301;
						int var75 = var72.field158 - field302;
						int var76 = var72.field160;
						int var77;
						if (var76 == 1 || var76 == 2) {
							var77 = -var73;
						} else {
							var77 = var73;
						}
						int var78;
						if (var76 == 2 || var76 == 3) {
							var78 = -var75;
						} else {
							var78 = var75;
						}
						if ((var72.field159 & 0x100) != 0 && var78 >= var77) {
							int var79 = var73 + field308[var76];
							int var80 = var75 + field309[var76];
							var72.model.worldRender(var76 * 512 + 256, field303, field304, field305, field306, var79, var74, var80, var72.field162);
						}
						if ((var72.field159 & 0x200) != 0 && var78 <= var77) {
							int var81 = var73 + field310[var76];
							int var82 = var75 + field311[var76];
							var72.model.worldRender(var76 * 512 + 1280 & 0x7FF, field303, field304, field305, field306, var81, var74, var82, var72.field162);
						}
					}
				}
				Wall var83 = var3.wall;
				if (var83 != null) {
					if ((var83.field268 & var3.field384) != 0 && !method97(var7, var4, var5, var83.field268)) {
						var83.field270.worldRender(0, field303, field304, field305, field306, var83.field265 - field300, var83.field264 - field301, var83.field266 - field302, var83.field271);
					}
					if ((var83.field267 & var3.field384) != 0 && !method97(var7, var4, var5, var83.field267)) {
						var83.field269.worldRender(0, field303, field304, field305, field306, var83.field265 - field300, var83.field264 - field301, var83.field266 - field302, var83.field271);
					}
				}
			}
			if (var6 < field282 - 1) {
				Square var84 = squares[var6 + 1][var4][var5];
				if (var84 != null && var84.field379) {
					fillQueue.push(var84);
				}
			}
			if (var4 < field298) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.field379) {
					fillQueue.push(var85);
				}
			}
			if (var5 < field299) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.field379) {
					fillQueue.push(var86);
				}
			}
			if (var4 > field298) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.field379) {
					fillQueue.push(var87);
				}
			}
			if (var5 > field299) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.field379) {
					fillQueue.push(var88);
				}
			}
		}
	}

	@ObfuscatedName("r.a(IIBIILi;II)V")
	public void method92(int arg0, int arg1, int arg2, int arg3, Ground arg4, int arg5, int arg6) {
		int var8 = arg4.vertexX.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg4.vertexX[var9] - field300;
			int var11 = arg4.vertexY[var9] - field301;
			int var12 = arg4.vertexZ[var9] - field302;
			int var13 = var12 * arg1 + var10 * arg5 >> 16;
			int var14 = var12 * arg5 - var10 * arg1 >> 16;
			int var16 = var11 * arg6 - var14 * arg3 >> 16;
			int var17 = var11 * arg3 + var14 * arg6 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg4.faceTexture != null) {
				Ground.field182[var9] = var13;
				Ground.field183[var9] = var16;
				Ground.field184[var9] = var17;
			}
			Ground.field180[var9] = Pix3D.originX + (var13 << 9) / var17;
			Ground.field181[var9] = Pix3D.originY + (var16 << 9) / var17;
		}
		Pix3D.trans = 0;
		int var18 = arg4.faceVertexA.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg4.faceVertexA[var19];
			int var21 = arg4.faceVertexB[var19];
			int var22 = arg4.faceVertexC[var19];
			int var23 = Ground.field180[var20];
			int var24 = Ground.field180[var21];
			int var25 = Ground.field180[var22];
			int var26 = Ground.field181[var20];
			int var27 = Ground.field181[var21];
			int var28 = Ground.field181[var22];
			if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
				Pix3D.hclip = false;
				if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix2D.sizeX || var24 > Pix2D.sizeX || var25 > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}
				if (field312 && insideTriangle(field313, field314, var26, var27, var28, var23, var24, var25)) {
					groundX = arg0;
					groundZ = arg2;
				}
				if (arg4.faceTexture == null || arg4.faceTexture[var19] == -1) {
					if (arg4.faceColourA[var19] != 12345678) {
						Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, arg4.faceColourA[var19], arg4.faceColourB[var19], arg4.faceColourC[var19]);
					}
				} else if (lowMem) {
					int var29 = field330[arg4.faceTexture[var19]];
					Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, method93(arg4.faceColourA[var19], var29, field279), method93(arg4.faceColourB[var19], var29, field279), method93(arg4.faceColourC[var19], var29, field279));
				} else if (arg4.flat) {
					Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg4.faceColourA[var19], arg4.faceColourB[var19], arg4.faceColourC[var19], Ground.field182[0], Ground.field182[1], Ground.field182[3], Ground.field183[0], Ground.field183[1], Ground.field183[3], Ground.field184[0], Ground.field184[1], Ground.field184[3], arg4.faceTexture[var19]);
				} else {
					Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg4.faceColourA[var19], arg4.faceColourB[var19], arg4.faceColourC[var19], Ground.field182[var20], Ground.field182[var21], Ground.field182[var22], Ground.field183[var20], Ground.field183[var21], Ground.field183[var22], Ground.field184[var20], Ground.field184[var21], Ground.field184[var22], arg4.faceTexture[var19]);
				}
			}
		}
	}

	@ObfuscatedName("r.f(III)I")
	public int method93(int arg0, int arg1, int arg2) {
		int var4 = 127 - arg0;
		int var5 = var4 * (arg1 & 0x7F) / 160;
		if (arg2 != 5) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		if (var5 < 2) {
			var5 = 2;
		} else if (var5 > 126) {
			var5 = 126;
		}
		return (arg1 & 0xFF80) + var5;
	}

	@ObfuscatedName("r.a(I)V")
	public void method95() {
		int var1 = numOccluders[field292];
		Occlude[] var2 = occluders[field292];
		field320 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.field225 == 1) {
				int var5 = var4.field221 + 25 - field298;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.field223 + 25 - field299;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var4.field224 + 25 - field299;
					if (var7 > 50) {
						var7 = 50;
					}
					boolean var8 = false;
					while (var6 <= var7) {
						if (visBackingDirty[var5][var6++]) {
							var8 = true;
							break;
						}
					}
					if (var8) {
						int var9 = field300 - var4.field226;
						if (var9 > 32) {
							var4.field232 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.field232 = 2;
							var9 = -var9;
						}
						var4.field235 = (var4.field228 - field302 << 8) / var9;
						var4.field236 = (var4.field229 - field302 << 8) / var9;
						var4.field237 = (var4.field230 - field301 << 8) / var9;
						var4.field238 = (var4.field231 - field301 << 8) / var9;
						activeOccluders[field320++] = var4;
					}
				}
			} else if (var4.field225 == 2) {
				int var10 = var4.field223 + 25 - field299;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.field221 + 25 - field298;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var4.field222 + 25 - field298;
					if (var12 > 50) {
						var12 = 50;
					}
					boolean var13 = false;
					while (var11 <= var12) {
						if (visBackingDirty[var11++][var10]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						int var14 = field302 - var4.field228;
						if (var14 > 32) {
							var4.field232 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var4.field232 = 4;
							var14 = -var14;
						}
						var4.field233 = (var4.field226 - field300 << 8) / var14;
						var4.field234 = (var4.field227 - field300 << 8) / var14;
						var4.field237 = (var4.field230 - field301 << 8) / var14;
						var4.field238 = (var4.field231 - field301 << 8) / var14;
						activeOccluders[field320++] = var4;
					}
				}
			} else if (var4.field225 == 4) {
				int var15 = var4.field230 - field301;
				if (var15 > 128) {
					int var16 = var4.field223 + 25 - field299;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var4.field224 + 25 - field299;
					if (var17 > 50) {
						var17 = 50;
					}
					if (var16 <= var17) {
						int var18 = var4.field221 + 25 - field298;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var4.field222 + 25 - field298;
						if (var19 > 50) {
							var19 = 50;
						}
						boolean var20 = false;
						label142: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (visBackingDirty[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}
						if (var20) {
							var4.field232 = 5;
							var4.field233 = (var4.field226 - field300 << 8) / var15;
							var4.field234 = (var4.field227 - field300 << 8) / var15;
							var4.field235 = (var4.field228 - field302 << 8) / var15;
							var4.field236 = (var4.field229 - field302 << 8) / var15;
							activeOccluders[field320++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.k(IIII)Z")
	public boolean method97(int arg0, int arg1, int arg2, int arg3) {
		if (spriteOccluded(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			int var7 = field285[arg0][arg1][arg2] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (arg3 < 16) {
				if (arg3 == 1) {
					if (var5 > field300) {
						if (!method100(var5, var7, var6)) {
							return false;
						}
						if (!method100(var5, var7, var6 + 128)) {
							return false;
						}
					}
					if (arg0 > 0) {
						if (!method100(var5, var8, var6)) {
							return false;
						}
						if (!method100(var5, var8, var6 + 128)) {
							return false;
						}
					}
					if (!method100(var5, var9, var6)) {
						return false;
					}
					if (!method100(var5, var9, var6 + 128)) {
						return false;
					}
					return true;
				}
				if (arg3 == 2) {
					if (var6 < field302) {
						if (!method100(var5, var7, var6 + 128)) {
							return false;
						}
						if (!method100(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}
					if (arg0 > 0) {
						if (!method100(var5, var8, var6 + 128)) {
							return false;
						}
						if (!method100(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}
					if (!method100(var5, var9, var6 + 128)) {
						return false;
					}
					if (!method100(var5 + 128, var9, var6 + 128)) {
						return false;
					}
					return true;
				}
				if (arg3 == 4) {
					if (var5 < field300) {
						if (!method100(var5 + 128, var7, var6)) {
							return false;
						}
						if (!method100(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}
					if (arg0 > 0) {
						if (!method100(var5 + 128, var8, var6)) {
							return false;
						}
						if (!method100(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}
					if (!method100(var5 + 128, var9, var6)) {
						return false;
					}
					if (!method100(var5 + 128, var9, var6 + 128)) {
						return false;
					}
					return true;
				}
				if (arg3 == 8) {
					if (var6 > field302) {
						if (!method100(var5, var7, var6)) {
							return false;
						}
						if (!method100(var5 + 128, var7, var6)) {
							return false;
						}
					}
					if (arg0 > 0) {
						if (!method100(var5, var8, var6)) {
							return false;
						}
						if (!method100(var5 + 128, var8, var6)) {
							return false;
						}
					}
					if (!method100(var5, var9, var6)) {
						return false;
					}
					if (!method100(var5 + 128, var9, var6)) {
						return false;
					}
					return true;
				}
			}
			if (!method100(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (arg3 == 16) {
				return method100(var5, var9, var6 + 128);
			} else if (arg3 == 32) {
				return method100(var5 + 128, var9, var6 + 128);
			} else if (arg3 == 64) {
				return method100(var5 + 128, var9, var6);
			} else if (arg3 == 128) {
				return method100(var5, var9, var6);
			} else {
				System.out.println("Warning unsupported wall type");
				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("r.l(IIII)Z")
	public boolean method98(int arg0, int arg1, int arg2, int arg3) {
		if (!spriteOccluded(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		return method100(var5 + 1, field285[arg0][arg1][arg2] - arg3, var6 + 1) && method100(var5 + 128 - 1, field285[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && method100(var5 + 128 - 1, field285[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && method100(var5 + 1, field285[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
	}

	@ObfuscatedName("r.b(IIIIII)Z")
	public boolean method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (field290[arg0][var9][var10] == -field293) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 0x1;
			int var12 = (arg3 << 7) + 0x2;
			int var13 = field285[arg0][arg1][arg3] - arg5;
			if (!method100(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 0x1;
			if (!method100(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 0x1;
			if (!method100(var11, var13, var15)) {
				return false;
			} else if (method100(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (spriteOccluded(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return method100(var7 + 1, field285[arg0][arg1][arg3] - arg5, var8 + 1) && method100(var7 + 128 - 1, field285[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && method100(var7 + 128 - 1, field285[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && method100(var7 + 1, field285[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("r.h(III)Z")
	public boolean method100(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field320; var4++) {
			Occlude var5 = activeOccluders[var4];
			if (var5.field232 == 1) {
				int var6 = var5.field226 - arg0;
				if (var6 > 0) {
					int var7 = var5.field228 + (var5.field235 * var6 >> 8);
					int var8 = var5.field229 + (var5.field236 * var6 >> 8);
					int var9 = var5.field230 + (var5.field237 * var6 >> 8);
					int var10 = var5.field231 + (var5.field238 * var6 >> 8);
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field232 == 2) {
				int var11 = arg0 - var5.field226;
				if (var11 > 0) {
					int var12 = var5.field228 + (var5.field235 * var11 >> 8);
					int var13 = var5.field229 + (var5.field236 * var11 >> 8);
					int var14 = var5.field230 + (var5.field237 * var11 >> 8);
					int var15 = var5.field231 + (var5.field238 * var11 >> 8);
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field232 == 3) {
				int var16 = var5.field228 - arg2;
				if (var16 > 0) {
					int var17 = var5.field226 + (var5.field233 * var16 >> 8);
					int var18 = var5.field227 + (var5.field234 * var16 >> 8);
					int var19 = var5.field230 + (var5.field237 * var16 >> 8);
					int var20 = var5.field231 + (var5.field238 * var16 >> 8);
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field232 == 4) {
				int var21 = arg2 - var5.field228;
				if (var21 > 0) {
					int var22 = var5.field226 + (var5.field233 * var21 >> 8);
					int var23 = var5.field227 + (var5.field234 * var21 >> 8);
					int var24 = var5.field230 + (var5.field237 * var21 >> 8);
					int var25 = var5.field231 + (var5.field238 * var21 >> 8);
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field232 == 5) {
				int var26 = arg1 - var5.field230;
				if (var26 > 0) {
					int var27 = var5.field226 + (var5.field233 * var26 >> 8);
					int var28 = var5.field227 + (var5.field234 * var26 >> 8);
					int var29 = var5.field228 + (var5.field235 * var26 >> 8);
					int var30 = var5.field229 + (var5.field236 * var26 >> 8);
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
