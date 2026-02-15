package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;

@ObfuscatedName("vd")
public final class World {

	@ObfuscatedName("vd.a")
	public final int maxTileLevel = 4;

	@ObfuscatedName("vd.ab")
	public final int[][] field3448 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("vd.b")
	public static int maxZ;

	@ObfuscatedName("vd.bb")
	public static int[] MIDTAB = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("vd.c")
	public int field3398 = 0;

	@ObfuscatedName("vd.cb")
	public static int viewportRight;

	@ObfuscatedName("vd.d")
	public final Sprite[] field3399 = new Sprite[5000];

	@ObfuscatedName("vd.db")
	public static int viewportBottom;

	@ObfuscatedName("vd.e")
	public static int fillLeft = 0;

	@ObfuscatedName("vd.f")
	public final int maxTileX = 104;

	@ObfuscatedName("vd.g")
	public static int gz;

	@ObfuscatedName("vd.h")
	public static int minX;

	@ObfuscatedName("vd.i")
	public final Square[][][] levelTiles = new Square[4][104][104];

	@ObfuscatedName("vd.k")
	public static boolean click = false;

	@ObfuscatedName("vd.l")
	public static int minZ;

	@ObfuscatedName("vd.m")
	public static int maxX;

	@ObfuscatedName("vd.n")
	public static final int field3409 = 4;

	@ObfuscatedName("vd.j")
	public static Occlude[][] levelOccluders = new Occlude[field3409][500];

	@ObfuscatedName("vd.o")
	public final int[][][] groundh;

	@ObfuscatedName("vd.p")
	public static int field3411 = 0;

	@ObfuscatedName("vd.q")
	public static int groundX = -1;

	@ObfuscatedName("vd.r")
	public int minLevel = 0;

	@ObfuscatedName("vd.s")
	public static int cameraSinX;

	@ObfuscatedName("vd.t")
	public static int cycleNo;

	@ObfuscatedName("vd.u")
	public static int cx;

	@ObfuscatedName("vd.v")
	public final int[][][] occlusionCycle = new int[4][105][105];

	@ObfuscatedName("vd.w")
	public static Sprite[] spriteBuffer = new Sprite[100];

	@ObfuscatedName("vd.z")
	public static int field3421 = 0;

	@ObfuscatedName("vd.F")
	public static boolean lowMem = true;

	@ObfuscatedName("vd.I")
	public static Occlude[] field3430 = new Occlude[500];

	@ObfuscatedName("vd.B")
	public static int field3423 = 0;

	@ObfuscatedName("vd.x")
	public static int field3419 = 0;

	@ObfuscatedName("vd.C")
	public static int field3424 = 0;

	@ObfuscatedName("vd.M")
	public static int[] levelOccluderCount = new int[field3409];

	@ObfuscatedName("vd.K")
	public static int groundZ = -1;

	@ObfuscatedName("vd.L")
	public static LinkList fillQueue = new LinkList();

	@ObfuscatedName("vd.N")
	public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

	@ObfuscatedName("vd.R")
	public static int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("vd.P")
	public static int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("vd.W")
	public static int[] POSTTAB = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("vd.U")
	public static int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("vd.S")
	public static int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("vd.Y")
	public static int[] PRETAB = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("vd.V")
	public final int[][] field3443 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("vd.y")
	public final int maxTileZ = 104;

	@ObfuscatedName("vd.A")
	public static int cz;

	@ObfuscatedName("vd.D")
	public static int cameraCosX;

	@ObfuscatedName("vd.E")
	public static int cameraCosY;

	@ObfuscatedName("vd.G")
	public static int gx;

	@ObfuscatedName("vd.H")
	public static int cy;

	@ObfuscatedName("vd.J")
	public static int cameraSinY;

	@ObfuscatedName("vd.O")
	public static int viewportCentreX;

	@ObfuscatedName("vd.Q")
	public static int viewportTop;

	@ObfuscatedName("vd.T")
	public static int viewportLeft;

	@ObfuscatedName("vd.X")
	public static int viewportCentreY;

	@ObfuscatedName("vd.Z")
	public static boolean[][] field3447;

	@ObfuscatedName("vd.b(III)Z")
	public static boolean testPoint(int arg0, int arg1, int arg2) {
		int var3 = arg2 * cameraSinY + arg0 * cameraCosY >> 16;
		int var4 = arg2 * cameraCosY - arg0 * cameraSinY >> 16;
		int var5 = arg1 * cameraSinX + var4 * cameraCosX >> 16;
		int var6 = arg1 * cameraCosX - var4 * cameraSinX >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = viewportCentreX + (var3 << 9) / var5;
			int var8 = viewportCentreY + (var6 << 9) / var5;
			return var7 >= viewportLeft && var7 <= viewportRight && var8 >= viewportTop && var8 <= viewportBottom;
		} else {
			return false;
		}
	}

	@ObfuscatedName("vd.a([IIIII)V")
	public static void init(int[] arg0) {
		viewportLeft = 0;
		viewportTop = 0;
		viewportRight = 512;
		viewportBottom = 334;
		viewportCentreX = 256;
		viewportCentreY = 167;
		boolean[][][][] var1 = new boolean[9][32][53][53];
		for (int var2 = 128; var2 <= 384; var2 += 32) {
			for (int var3 = 0; var3 < 2048; var3 += 64) {
				cameraSinX = Pix3D.sinTable[var2];
				cameraCosX = Pix3D.cosTable[var2];
				cameraSinY = Pix3D.sinTable[var3];
				cameraCosY = Pix3D.cosTable[var3];
				int var4 = (var2 - 128) / 32;
				int var5 = var3 / 64;
				for (int var6 = -26; var6 <= 26; var6++) {
					for (int var7 = -26; var7 <= 26; var7++) {
						int var8 = var6 * 128;
						int var9 = var7 * 128;
						boolean var10 = false;
						for (int var11 = -500; var11 <= 800; var11 += 128) {
							if (testPoint(var8, arg0[var4] + var11, var9)) {
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
						visibilityMatrix[var12][var13][var14 + 25][var15 + 25] = var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.a(IIIIIIII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.field2419 = arg2 / 128;
		var8.field2425 = arg3 / 128;
		var8.field2410 = arg4 / 128;
		var8.field2429 = arg5 / 128;
		var8.field2430 = arg1;
		var8.field2427 = arg2;
		var8.field2408 = arg3;
		var8.field2417 = arg4;
		var8.field2423 = arg5;
		var8.field2432 = arg6;
		var8.field2421 = arg7;
		levelOccluders[arg0][levelOccluderCount[arg0]++] = var8;
	}

	@ObfuscatedName("vd.a(II)I")
	public static int mulLightness(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	public World(int arg0, int arg1, int arg2, int[][][] arg3) {
		this.groundh = arg3;
		this.resetMap();
	}

	@ObfuscatedName("vd.a(IIIILdd;Ldd;IIII)V")
	public void setWall(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		Wall var11 = new Wall();
		var11.typecode = arg8;
		var11.typecode2 = arg9;
		var11.field30 = arg1 * 128 + 64;
		var11.field39 = arg2 * 128 + 64;
		var11.field38 = arg3;
		var11.modelA = arg4;
		var11.modelB = arg5;
		var11.typeA = arg6;
		var11.typeB = arg7;
		for (int var12 = arg0; var12 >= 0; var12--) {
			if (this.levelTiles[var12][arg1][arg2] == null) {
				this.levelTiles[var12][arg1][arg2] = new Square(var12, arg1, arg2);
			}
		}
		this.levelTiles[arg0][arg1][arg2].wall = var11;
	}

	@ObfuscatedName("vd.a(Lp;III)V")
	public void shareLightGd(ModelUnlit arg0, int arg1, int arg2, int arg3) {
		if (arg2 < this.maxTileX) {
			Square var5 = this.levelTiles[arg1][arg2 + 1][arg3];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.model instanceof ModelUnlit) {
				ModelUnlit var6 = (ModelUnlit) var5.groundDecor.model;
				ModelUnlit.shareLight(arg0, var6, 128, 0, 0, true);
			}
		}
		if (arg3 < this.maxTileX) {
			Square var7 = this.levelTiles[arg1][arg2][arg3 + 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model instanceof ModelUnlit) {
				ModelUnlit var8 = (ModelUnlit) var7.groundDecor.model;
				ModelUnlit.shareLight(arg0, var8, 0, 0, 128, true);
			}
		}
		if (arg2 < this.maxTileX && arg3 < this.maxTileZ) {
			Square var9 = this.levelTiles[arg1][arg2 + 1][arg3 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.model instanceof ModelUnlit) {
				ModelUnlit var10 = (ModelUnlit) var9.groundDecor.model;
				ModelUnlit.shareLight(arg0, var10, 128, 0, 128, true);
			}
		}
		if (arg2 < this.maxTileX && arg3 > 0) {
			Square var11 = this.levelTiles[arg1][arg2 + 1][arg3 - 1];
			if (var11 != null && var11.groundDecor != null && var11.groundDecor.model instanceof ModelUnlit) {
				ModelUnlit var12 = (ModelUnlit) var11.groundDecor.model;
				ModelUnlit.shareLight(arg0, var12, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("vd.a(III)Lgb;")
	public Sprite getScene(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.minTileZ == arg2) {
				return var6;
			}
		}
		return null;
	}

	@ObfuscatedName("vd.a(IIII)I")
	public int typecode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
			return var5.wall.typecode2 & 0xFF;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return var5.decor.typecode2 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return var5.groundDecor.typecode2 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.spriteCount; var6++) {
				if (var5.sprites[var6].typecode == arg3) {
					return var5.sprites[var6].typecode2 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("vd.b(IIII)V")
	public void method1122(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 != null) {
			this.levelTiles[arg0][arg1][arg2].field3550 = arg3;
		}
	}

	@ObfuscatedName("vd.c(III)Lab;")
	public Wall getWall(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null ? null : var4.wall;
	}

	@ObfuscatedName("vd.d(III)V")
	public void delDecor(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.decor = null;
		}
	}

	@ObfuscatedName("vd.c(IIII)Z")
	public boolean wallOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!this.groundOccluded(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.groundh[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > cx) {
					if (!this.occluded(var5, var7, var6)) {
						return false;
					}
					if (!this.occluded(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5, var8, var6)) {
						return false;
					}
					if (!this.occluded(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.occluded(var5, var9, var6)) {
					return false;
				}
				if (!this.occluded(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < cz) {
					if (!this.occluded(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.occluded(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.occluded(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < cx) {
					if (!this.occluded(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.occluded(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.occluded(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > cz) {
					if (!this.occluded(var5, var7, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.occluded(var5, var8, var6)) {
						return false;
					}
					if (!this.occluded(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.occluded(var5, var9, var6)) {
					return false;
				}
				if (!this.occluded(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.occluded(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.occluded(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.occluded(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.occluded(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.occluded(var5, var9, var6);
		} else {
			return true;
		}
	}

	@ObfuscatedName("vd.e(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("vd.f(III)V")
	public void delLoc(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.minTileZ == arg2) {
				this.method1164(var6);
				return;
			}
		}
	}

	@ObfuscatedName("vd.a(IIIIIIIILdd;IZII)Z")
	public boolean method1129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, int arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.maxTileX || var15 >= this.maxTileZ) {
					return false;
				}
				Square var16 = this.levelTiles[arg0][var14][var15];
				if (var16 != null && var16.spriteCount >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.typecode = arg11;
		var17.typecode2 = arg12;
		var17.field1065 = arg0;
		var17.x = arg5;
		var17.z = arg6;
		var17.field1060 = arg7;
		var17.model = arg8;
		var17.field1061 = arg9;
		var17.minTileX = arg1;
		var17.minTileZ = arg2;
		var17.maxTileX = arg1 + arg3 - 1;
		var17.maxTileZ = arg2 + arg4 - 1;
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
					if (this.levelTiles[var21][var18][var19] == null) {
						this.levelTiles[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.levelTiles[arg0][var18][var19];
				var22.sprites[var22.spriteCount] = var17;
				var22.spriteSpan[var22.spriteCount] = var20;
				var22.spriteSpans |= var20;
				var22.spriteCount++;
			}
		}
		if (arg10) {
			this.field3399[this.field3398++] = var17;
		}
		return true;
	}

	@ObfuscatedName("vd.g(III)V")
	public void updateMousePicking(int arg0, int arg1, int arg2) {
		click = true;
		field3424 = arg0;
		field3419 = arg1;
		field3421 = arg2;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("vd.h(III)I")
	public int decorType(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.decor == null ? 0 : var4.decor.typecode;
	}

	@ObfuscatedName("vd.a(IIIIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.occlusionCycle[arg0][var9][var10] == -cycleNo) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.groundh[arg0][arg1][arg3] - arg5;
			if (!this.occluded(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 1;
			if (!this.occluded(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 1;
			if (!this.occluded(var11, var13, var15)) {
				return false;
			} else if (this.occluded(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (this.groundOccluded(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.occluded(var7 + 1, this.groundh[arg0][arg1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.groundh[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.groundh[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.occluded(var7 + 1, this.groundh[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("vd.i(III)I")
	public int sceneType(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.minTileZ == arg2) {
				return var6.typecode;
			}
		}
		return 0;
	}

	@ObfuscatedName("vd.j(III)I")
	public int gdType(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("vd.a()V")
	public void removeSprites() {
		for (int var1 = 0; var1 < this.field3398; var1++) {
			Sprite var2 = this.field3399[var1];
			this.method1164(var2);
			this.field3399[var1] = null;
		}
		this.field3398 = 0;
	}

	@ObfuscatedName("vd.k(III)V")
	public void delGroundDecor(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundDecor = null;
		}
	}

	@ObfuscatedName("vd.d(IIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (this.groundOccluded(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("vd.a(IIIILdd;II)V")
	public void method1138(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6) {
		if (arg4 == null) {
			return;
		}
		GroundDecor var8 = new GroundDecor();
		var8.model = arg4;
		var8.field1767 = arg1 * 128 + 64;
		var8.field1756 = arg2 * 128 + 64;
		var8.field1761 = arg3;
		var8.typecode = arg5;
		var8.typecode2 = arg6;
		if (this.levelTiles[arg0][arg1][arg2] == null) {
			this.levelTiles[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.levelTiles[arg0][arg1][arg2].groundDecor = var8;
	}

	@ObfuscatedName("vd.b()V")
	public void resetMap() {
		for (int var1 = 0; var1 < this.maxTileLevel; var1++) {
			for (int var2 = 0; var2 < this.maxTileX; var2++) {
				for (int var3 = 0; var3 < this.maxTileZ; var3++) {
					this.levelTiles[var1][var2][var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field3409; var4++) {
			for (int var5 = 0; var5 < levelOccluderCount[var4]; var5++) {
				levelOccluders[var4][var5] = null;
			}
			levelOccluderCount[var4] = 0;
		}
		for (int var6 = 0; var6 < this.field3398; var6++) {
			this.field3399[var6] = null;
		}
		this.field3398 = 0;
		for (int var7 = 0; var7 < spriteBuffer.length; var7++) {
			spriteBuffer[var7] = null;
		}
	}

	@ObfuscatedName("vd.l(III)V")
	public void method1140() {
		for (int var1 = 0; var1 < this.maxTileLevel; var1++) {
			for (int var2 = 0; var2 < this.maxTileX; var2++) {
				for (int var3 = 0; var3 < this.maxTileZ; var3++) {
					Square var4 = this.levelTiles[var1][var2][var3];
					if (var4 != null) {
						Wall var5 = var4.wall;
						if (var5 != null && var5.modelA instanceof ModelUnlit) {
							ModelUnlit var6 = (ModelUnlit) var5.modelA;
							this.method1162(var6, var1, var2, var3, 1, 1);
							if (var5.modelB instanceof ModelUnlit) {
								ModelUnlit var7 = (ModelUnlit) var5.modelB;
								this.method1162(var7, var1, var2, var3, 1, 1);
								ModelUnlit.shareLight(var6, var7, 0, 0, 0, false);
								var5.modelB = var7.light(var7.ambient, var7.contrast, -50, -10, -50);
							}
							var5.modelA = var6.light(var6.ambient, var6.contrast, -50, -10, -50);
						}
						for (int var8 = 0; var8 < var4.spriteCount; var8++) {
							Sprite var9 = var4.sprites[var8];
							if (var9 != null && var9.model instanceof ModelUnlit) {
								ModelUnlit var10 = (ModelUnlit) var9.model;
								this.method1162(var10, var1, var2, var3, var9.maxTileX + 1 - var9.minTileX, var9.maxTileZ - var9.minTileZ + 1);
								var9.model = var10.light(var10.ambient, var10.contrast, -50, -10, -50);
							}
						}
						GroundDecor var11 = var4.groundDecor;
						if (var11 != null && var11.model instanceof ModelUnlit) {
							ModelUnlit var12 = (ModelUnlit) var11.model;
							this.shareLightGd(var12, var1, var2, var3);
							var11.model = var12.light(var12.ambient, var12.contrast, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.a(Lgd;IIIIII)V")
	public void renderGround(Ground arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
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
				Pix3D.hclip = false;
				if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix3D.sizeX || var24 > Pix3D.sizeX || var25 > Pix3D.sizeX) {
					Pix3D.hclip = true;
				}
				if (click && this.insideTriangle(field3419, field3421, var26, var27, var28, var23, var24, var25)) {
					groundX = arg5;
					groundZ = arg6;
				}
				if (arg0.faceTexture == null || arg0.faceTexture[var19] == -1) {
					if (arg0.faceColourA[var19] != 12345678) {
						Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, arg0.faceColourA[var19], arg0.field1085[var19], arg0.field1092[var19]);
					}
				} else if (lowMem) {
					int var29 = Pix3D.textureManager.getAverageRgb(arg0.faceTexture[var19]);
					Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, mulLightness(var29, arg0.faceColourA[var19]), mulLightness(var29, arg0.field1085[var19]), mulLightness(var29, arg0.field1092[var19]));
				} else if (arg0.flat) {
					Pix3D.textureTriangleAffine(var26, var27, var28, var23, var24, var25, arg0.faceColourA[var19], arg0.field1085[var19], arg0.field1092[var19], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg0.faceTexture[var19]);
				} else {
					Pix3D.textureTriangleAffine(var26, var27, var28, var23, var24, var25, arg0.faceColourA[var19], arg0.field1085[var19], arg0.field1092[var19], Ground.drawTextureVertexX[var20], Ground.drawTextureVertexX[var21], Ground.drawTextureVertexX[var22], Ground.drawTextureVertexY[var20], Ground.drawTextureVertexY[var21], Ground.drawTextureVertexY[var22], Ground.drawTextureVertexZ[var20], Ground.drawTextureVertexZ[var21], Ground.drawTextureVertexZ[var22], arg0.faceTexture[var19]);
				}
			}
		}
	}

	@ObfuscatedName("vd.a(I)V")
	public void fillBaseLevel(int arg0) {
		this.minLevel = arg0;
		for (int var2 = 0; var2 < this.maxTileX; var2++) {
			for (int var3 = 0; var3 < this.maxTileZ; var3++) {
				if (this.levelTiles[arg0][var2][var3] == null) {
					this.levelTiles[arg0][var2][var3] = new Square(arg0, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("vd.a(IIIIILdd;IIIIII)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : this.method1129(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@ObfuscatedName("vd.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.levelTiles[var22][arg1][arg2] == null) {
					this.levelTiles[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.levelTiles[var24][arg1][arg2] == null) {
					this.levelTiles[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.levelTiles[var26][arg1][arg2] == null) {
					this.levelTiles[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("vd.a(IIIIILdd;IIZ)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, int arg7, boolean arg8) {
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
		return this.method1129(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@ObfuscatedName("vd.a(Lwa;Z)V")
	public void fill(Square arg0, boolean arg1) {
		fillQueue.push(arg0);
		while (true) {
			Square var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Square[][] var8;
			Square var66;
			do {
				Square var65;
				do {
					Square var64;
					do {
						Square var63;
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
											} while (!var3.drawBack);
											var4 = var3.field3533;
											var5 = var3.field3549;
											var6 = var3.level;
											var7 = var3.originalLevel;
											var8 = this.levelTiles[var6];
											if (!var3.drawFront) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.levelTiles[var6 - 1][var4][var5];
													if (var9 != null && var9.drawBack) {
														continue;
													}
												}
												if (var4 <= gx && var4 > minX) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.drawBack && (var10.drawFront || (var3.spriteSpans & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= gx && var4 < maxX - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.drawBack && (var11.drawFront || (var3.spriteSpans & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= gz && var5 > minZ) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.drawBack && (var12.drawFront || (var3.spriteSpans & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= gz && var5 < maxZ - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.drawBack && (var13.drawFront || (var3.spriteSpans & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.drawFront = false;
											if (var3.linkedSquare != null) {
												Square var14 = var3.linkedSquare;
												if (var14.quickGround == null) {
													if (var14.ground != null && !this.groundOccluded(0, var4, var5)) {
														this.renderGround(var14.ground, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
													}
												} else if (!this.groundOccluded(0, var4, var5)) {
													this.renderQuickGround(var14.quickGround, 0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.modelA.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var15.field30 - cx, var15.field38 - cy, var15.field39 - cz, var15.typecode);
												}
												for (int var16 = 0; var16 < var14.spriteCount; var16++) {
													Sprite var17 = var14.sprites[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.field1061, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var17.x - cx, var17.field1060 - cy, var17.z - cz, var17.typecode);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !this.groundOccluded(var7, var4, var5)) {
													var18 = true;
													this.renderGround(var3.ground, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
												}
											} else if (!this.groundOccluded(var7, var4, var5)) {
												var18 = true;
												if (var3.quickGround.colourNE != 12345678 || click && var6 <= field3424) {
													this.renderQuickGround(var3.quickGround, var7, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
												}
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.wall;
											Decor var22 = var3.decor;
											if (var21 != null || var22 != null) {
												if (gx == var4) {
													var19++;
												} else if (gx < var4) {
													var19 += 2;
												}
												if (gz == var5) {
													var19 += 3;
												} else if (gz > var5) {
													var19 += 6;
												}
												var20 = PRETAB[var19];
												var3.backWallTypes = POSTTAB[var19];
											}
											if (var21 != null) {
												if ((var21.typeA & MIDTAB[var19]) == 0) {
													var3.checkLocSpans = 0;
												} else if (var21.typeA == 16) {
													var3.checkLocSpans = 3;
													var3.blockLocSpans = MIDDEP_16[var19];
													var3.inverseBlockLocSpans = 3 - var3.blockLocSpans;
												} else if (var21.typeA == 32) {
													var3.checkLocSpans = 6;
													var3.blockLocSpans = MIDDEP_32[var19];
													var3.inverseBlockLocSpans = 6 - var3.blockLocSpans;
												} else if (var21.typeA == 64) {
													var3.checkLocSpans = 12;
													var3.blockLocSpans = MIDDEP_64[var19];
													var3.inverseBlockLocSpans = 12 - var3.blockLocSpans;
												} else {
													var3.checkLocSpans = 9;
													var3.blockLocSpans = MIDDEP_128[var19];
													var3.inverseBlockLocSpans = 9 - var3.blockLocSpans;
												}
												if ((var21.typeA & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.typeA)) {
													var21.modelA.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.field30 - cx, var21.field38 - cy, var21.field39 - cz, var21.typecode);
												}
												if ((var21.typeB & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.typeB)) {
													var21.modelB.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.field30 - cx, var21.field38 - cy, var21.field39 - cz, var21.typecode);
												}
											}
											if (var22 != null && !this.spriteOccluded(var7, var4, var5, var22.model.minY)) {
												if ((var22.wshape & var20) != 0) {
													var22.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22.x + var22.field2822 - cx, var22.y - cy, var22.z + var22.field2829 - cz, var22.typecode);
												} else if (var22.wshape == 256) {
													int var23 = var22.x - cx;
													int var24 = var22.y - cy;
													int var25 = var22.z - cz;
													int var26 = var22.yof;
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
													if (var28 < var27) {
														var22.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var23 + var22.field2822, var24, var25 + var22.field2829, var22.typecode);
													} else if (var22.model2 != null) {
														var22.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var23, var24, var25, var22.typecode);
													}
												}
											}
											if (var18) {
												GroundDecor var29 = var3.groundDecor;
												if (var29 != null) {
													var29.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var29.field1767 - cx, var29.field1761 - cy, var29.field1756 - cz, var29.typecode);
												}
												GroundObject var30 = var3.groundObject;
												if (var30 != null && var30.height == 0) {
													if (var30.bottomObj != null) {
														var30.bottomObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var30.field2033 - cx, var30.field2028 - cy, var30.field2034 - cz, var30.field2046);
													}
													if (var30.middleObj != null) {
														var30.middleObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var30.field2033 - cx, var30.field2028 - cy, var30.field2034 - cz, var30.field2046);
													}
													if (var30.topObj != null) {
														var30.topObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var30.field2033 - cx, var30.field2028 - cy, var30.field2034 - cz, var30.field2046);
													}
												}
											}
											int var31 = var3.spriteSpans;
											if (var31 != 0) {
												if (var4 < gx && (var31 & 0x4) != 0) {
													Square var32 = var8[var4 + 1][var5];
													if (var32 != null && var32.drawBack) {
														fillQueue.push(var32);
													}
												}
												if (var5 < gz && (var31 & 0x2) != 0) {
													Square var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.drawBack) {
														fillQueue.push(var33);
													}
												}
												if (var4 > gx && (var31 & 0x1) != 0) {
													Square var34 = var8[var4 - 1][var5];
													if (var34 != null && var34.drawBack) {
														fillQueue.push(var34);
													}
												}
												if (var5 > gz && (var31 & 0x8) != 0) {
													Square var35 = var8[var4][var5 - 1];
													if (var35 != null && var35.drawBack) {
														fillQueue.push(var35);
													}
												}
											}
											break;
										}
										if (var3.checkLocSpans != 0) {
											boolean var36 = true;
											for (int var37 = 0; var37 < var3.spriteCount; var37++) {
												if (var3.sprites[var37].cycle != cycleNo && (var3.spriteSpan[var37] & var3.checkLocSpans) == var3.blockLocSpans) {
													var36 = false;
													break;
												}
											}
											if (var36) {
												Wall var38 = var3.wall;
												if (!this.wallOccluded(var7, var4, var5, var38.typeA)) {
													var38.modelA.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var38.field30 - cx, var38.field38 - cy, var38.field39 - cz, var38.typecode);
												}
												var3.checkLocSpans = 0;
											}
										}
										if (!var3.drawSprites) {
											break;
										}
										try {
											int var39 = var3.spriteCount;
											var3.drawSprites = false;
											int var40 = 0;
											label558: for (int var41 = 0; var41 < var39; var41++) {
												Sprite var42 = var3.sprites[var41];
												if (var42.cycle != cycleNo) {
													for (int var43 = var42.minTileX; var43 <= var42.maxTileX; var43++) {
														for (int var44 = var42.minTileZ; var44 <= var42.maxTileZ; var44++) {
															Square var45 = var8[var43][var44];
															if (var45.drawFront) {
																var3.drawSprites = true;
																continue label558;
															}
															if (var45.checkLocSpans != 0) {
																int var46 = 0;
																if (var43 > var42.minTileX) {
																	var46++;
																}
																if (var43 < var42.maxTileX) {
																	var46 += 4;
																}
																if (var44 > var42.minTileZ) {
																	var46 += 8;
																}
																if (var44 < var42.maxTileZ) {
																	var46 += 2;
																}
																if ((var46 & var45.checkLocSpans) == var3.inverseBlockLocSpans) {
																	var3.drawSprites = true;
																	continue label558;
																}
															}
														}
													}
													spriteBuffer[var40++] = var42;
													int var47 = gx - var42.minTileX;
													int var48 = var42.maxTileX - gx;
													if (var48 > var47) {
														var47 = var48;
													}
													int var49 = gz - var42.minTileZ;
													int var50 = var42.maxTileZ - gz;
													if (var50 > var49) {
														var42.distance = var47 + var50;
													} else {
														var42.distance = var47 + var49;
													}
												}
											}
											while (var40 > 0) {
												int var51 = -50;
												int var52 = -1;
												for (int var53 = 0; var53 < var40; var53++) {
													Sprite var54 = spriteBuffer[var53];
													if (var54.cycle != cycleNo) {
														if (var54.distance > var51) {
															var51 = var54.distance;
															var52 = var53;
														} else if (var54.distance == var51) {
															int var55 = var54.x - cx;
															int var56 = var54.z - cz;
															int var57 = spriteBuffer[var52].x - cx;
															int var58 = spriteBuffer[var52].z - cz;
															if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
																var52 = var53;
															}
														}
													}
												}
												if (var52 == -1) {
													break;
												}
												Sprite var59 = spriteBuffer[var52];
												var59.cycle = cycleNo;
												if (!this.spriteOccluded(var7, var59.minTileX, var59.maxTileX, var59.minTileZ, var59.maxTileZ, var59.model.minY)) {
													var59.model.worldRender(var59.field1061, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var59.x - cx, var59.field1060 - cy, var59.z - cz, var59.typecode);
												}
												for (int var60 = var59.minTileX; var60 <= var59.maxTileX; var60++) {
													for (int var61 = var59.minTileZ; var61 <= var59.maxTileZ; var61++) {
														Square var62 = var8[var60][var61];
														if (var62.checkLocSpans != 0) {
															fillQueue.push(var62);
														} else if ((var60 != var4 || var61 != var5) && var62.drawBack) {
															fillQueue.push(var62);
														}
													}
												}
											}
											if (!var3.drawSprites) {
												break;
											}
										} catch (Exception var81) {
											var3.drawSprites = false;
											break;
										}
									}
								} while (!var3.drawBack);
							} while (var3.checkLocSpans != 0);
							if (var4 > gx || var4 <= minX) {
								break;
							}
							var63 = var8[var4 - 1][var5];
						} while (var63 != null && var63.drawBack);
						if (var4 < gx || var4 >= maxX - 1) {
							break;
						}
						var64 = var8[var4 + 1][var5];
					} while (var64 != null && var64.drawBack);
					if (var5 > gz || var5 <= minZ) {
						break;
					}
					var65 = var8[var4][var5 - 1];
				} while (var65 != null && var65.drawBack);
				if (var5 < gz || var5 >= maxZ - 1) {
					break;
				}
				var66 = var8[var4][var5 + 1];
			} while (var66 != null && var66.drawBack);
			var3.drawBack = false;
			fillLeft--;
			GroundObject var67 = var3.groundObject;
			if (var67 != null && var67.height != 0) {
				if (var67.bottomObj != null) {
					var67.bottomObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var67.field2033 - cx, var67.field2028 - cy - var67.height, var67.field2034 - cz, var67.field2046);
				}
				if (var67.middleObj != null) {
					var67.middleObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var67.field2033 - cx, var67.field2028 - cy - var67.height, var67.field2034 - cz, var67.field2046);
				}
				if (var67.topObj != null) {
					var67.topObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var67.field2033 - cx, var67.field2028 - cy - var67.height, var67.field2034 - cz, var67.field2046);
				}
			}
			if (var3.backWallTypes != 0) {
				Decor var68 = var3.decor;
				if (var68 != null && !this.spriteOccluded(var7, var4, var5, var68.model.minY)) {
					if ((var68.wshape & var3.backWallTypes) != 0) {
						var68.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var68.x + var68.field2822 - cx, var68.y - cy, var68.z + var68.field2829 - cz, var68.typecode);
					} else if (var68.wshape == 256) {
						int var69 = var68.x - cx;
						int var70 = var68.y - cy;
						int var71 = var68.z - cz;
						int var72 = var68.yof;
						int var73;
						if (var72 == 1 || var72 == 2) {
							var73 = -var69;
						} else {
							var73 = var69;
						}
						int var74;
						if (var72 == 2 || var72 == 3) {
							var74 = -var71;
						} else {
							var74 = var71;
						}
						if (var74 >= var73) {
							var68.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var69 + var68.field2822, var70, var71 + var68.field2829, var68.typecode);
						} else if (var68.model2 != null) {
							var68.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var69, var70, var71, var68.typecode);
						}
					}
				}
				Wall var75 = var3.wall;
				if (var75 != null) {
					if ((var75.typeB & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var75.typeB)) {
						var75.modelB.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var75.field30 - cx, var75.field38 - cy, var75.field39 - cz, var75.typecode);
					}
					if ((var75.typeA & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var75.typeA)) {
						var75.modelA.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var75.field30 - cx, var75.field38 - cy, var75.field39 - cz, var75.typecode);
					}
				}
			}
			if (var6 < this.maxTileLevel - 1) {
				Square var76 = this.levelTiles[var6 + 1][var4][var5];
				if (var76 != null && var76.drawBack) {
					fillQueue.push(var76);
				}
			}
			if (var4 < gx) {
				Square var77 = var8[var4 + 1][var5];
				if (var77 != null && var77.drawBack) {
					fillQueue.push(var77);
				}
			}
			if (var5 < gz) {
				Square var78 = var8[var4][var5 + 1];
				if (var78 != null && var78.drawBack) {
					fillQueue.push(var78);
				}
			}
			if (var4 > gx) {
				Square var79 = var8[var4 - 1][var5];
				if (var79 != null && var79.drawBack) {
					fillQueue.push(var79);
				}
			}
			if (var5 > gz) {
				Square var80 = var8[var4][var5 - 1];
				if (var80 != null && var80.drawBack) {
					fillQueue.push(var80);
				}
			}
		}
	}

	@ObfuscatedName("vd.m(III)V")
	public void delWall(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	@ObfuscatedName("vd.a([IIIIII)V")
	public void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.levelTiles[arg2][arg3][arg4];
		if (var6 == null) {
			return;
		}
		QuickGround var7 = var6.quickGround;
		if (var7 != null) {
			int var8 = var7.field3633;
			if (var8 != 0) {
				for (int var9 = 0; var9 < 4; var9++) {
					arg0[arg1] = var8;
					arg0[arg1 + 1] = var8;
					arg0[arg1 + 2] = var8;
					arg0[arg1 + 3] = var8;
					arg1 += 512;
				}
			}
			return;
		}
		Ground var10 = var6.ground;
		if (var10 != null) {
			int var11 = var10.field1090;
			int var12 = var10.field1078;
			int var13 = var10.field1079;
			int var14 = var10.field1095;
			int[] var15 = this.field3443[var11];
			int[] var16 = this.field3448[var12];
			int var17 = 0;
			if (var13 != 0) {
				for (int var18 = 0; var18 < 4; var18++) {
					arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
					arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
					arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
					arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
					arg1 += 512;
				}
				return;
			}
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
		}
	}

	@ObfuscatedName("vd.n(III)Lr;")
	public Decor getDecor(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null ? null : var4.decor;
	}

	@ObfuscatedName("vd.a(IIIIIILdd;III)Z")
	public boolean method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, int arg8, int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			int var11 = arg1 * 128 + arg4 * 64;
			int var12 = arg2 * 128 + arg5 * 64;
			return this.method1129(arg0, arg1, arg2, arg4, arg5, var11, var12, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@ObfuscatedName("vd.e(IIII)V")
	public void method1152(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 == null) {
			return;
		}
		Decor var6 = var5.decor;
		if (var6 != null) {
			var6.field2822 = var6.field2822 * arg3 / 16;
			var6.field2829 = var6.field2829 * arg3 / 16;
		}
	}

	@ObfuscatedName("vd.o(III)I")
	public int wallType(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode;
	}

	@ObfuscatedName("vd.a(Lwe;IIIIIII)V")
	public void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - cx;
		int var11;
		int var12 = var11 = (arg7 << 7) - cz;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.groundh[arg1][arg6][arg7] - cy;
		int var18 = this.groundh[arg1][arg6 + 1][arg7] - cy;
		int var19 = this.groundh[arg1][arg6 + 1][arg7 + 1] - cy;
		int var20 = this.groundh[arg1][arg6][arg7 + 1] - cy;
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
			Pix3D.hclip = false;
			if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix3D.sizeX || var50 > Pix3D.sizeX || var46 > Pix3D.sizeX) {
				Pix3D.hclip = true;
			}
			if (click && this.insideTriangle(field3419, field3421, var49, var51, var47, var48, var50, var46)) {
				groundX = arg6;
				groundZ = arg7;
			}
			if (arg0.field3631 == -1) {
				if (arg0.colourNE != 12345678) {
					Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.field3615, arg0.field3609);
				}
			} else if (lowMem) {
				int var52 = Pix3D.textureManager.getAverageRgb(arg0.field3631);
				Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, mulLightness(var52, arg0.colourNE), mulLightness(var52, arg0.field3615), mulLightness(var52, arg0.field3609));
			} else if (arg0.field3614) {
				Pix3D.textureTriangleAffine(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.field3615, arg0.field3609, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3631);
			} else {
				Pix3D.textureTriangleAffine(var49, var51, var47, var48, var50, var46, arg0.colourNE, arg0.field3615, arg0.field3609, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3631);
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix3D.sizeX || var46 > Pix3D.sizeX || var50 > Pix3D.sizeX) {
			Pix3D.hclip = true;
		}
		if (click && this.insideTriangle(field3419, field3421, var45, var47, var51, var44, var46, var50)) {
			groundX = arg6;
			groundZ = arg7;
		}
		if (arg0.field3631 != -1) {
			if (!lowMem) {
				Pix3D.textureTriangleAffine(var45, var47, var51, var44, var46, var50, arg0.field3630, arg0.field3609, arg0.field3615, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3631);
				return;
			}
			int var53 = Pix3D.textureManager.getAverageRgb(arg0.field3631);
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, mulLightness(var53, arg0.field3630), mulLightness(var53, arg0.field3609), mulLightness(var53, arg0.field3615));
		} else if (arg0.field3630 != 12345678) {
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, arg0.field3630, arg0.field3609, arg0.field3615);
			return;
		}
	}

	@ObfuscatedName("vd.c()V")
	public void method1156() {
		int var1 = levelOccluderCount[field3423];
		Occlude[] var2 = levelOccluders[field3423];
		field3411 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.field2430 == 1) {
				int var5 = var4.field2419 + 25 - gx;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.field2410 + 25 - gz;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var4.field2429 + 25 - gz;
					if (var7 > 50) {
						var7 = 50;
					}
					boolean var8 = false;
					while (var6 <= var7) {
						if (field3447[var5][var6++]) {
							var8 = true;
							break;
						}
					}
					if (var8) {
						int var9 = cx - var4.field2427;
						if (var9 > 32) {
							var4.field2411 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.field2411 = 2;
							var9 = -var9;
						}
						var4.field2431 = (var4.field2417 - cz << 8) / var9;
						var4.field2415 = (var4.field2423 - cz << 8) / var9;
						var4.field2412 = (var4.field2432 - cy << 8) / var9;
						var4.field2420 = (var4.field2421 - cy << 8) / var9;
						field3430[field3411++] = var4;
					}
				}
			} else if (var4.field2430 == 2) {
				int var10 = var4.field2410 + 25 - gz;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.field2419 + 25 - gx;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var4.field2425 + 25 - gx;
					if (var12 > 50) {
						var12 = 50;
					}
					boolean var13 = false;
					while (var11 <= var12) {
						if (field3447[var11++][var10]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						int var14 = cz - var4.field2417;
						if (var14 > 32) {
							var4.field2411 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var4.field2411 = 4;
							var14 = -var14;
						}
						var4.field2422 = (var4.field2427 - cx << 8) / var14;
						var4.field2413 = (var4.field2408 - cx << 8) / var14;
						var4.field2412 = (var4.field2432 - cy << 8) / var14;
						var4.field2420 = (var4.field2421 - cy << 8) / var14;
						field3430[field3411++] = var4;
					}
				}
			} else if (var4.field2430 == 4) {
				int var15 = var4.field2432 - cy;
				if (var15 > 128) {
					int var16 = var4.field2410 + 25 - gz;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var4.field2429 + 25 - gz;
					if (var17 > 50) {
						var17 = 50;
					}
					if (var16 <= var17) {
						int var18 = var4.field2419 + 25 - gx;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var4.field2425 + 25 - gx;
						if (var19 > 50) {
							var19 = 50;
						}
						boolean var20 = false;
						label142: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (field3447[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}
						if (var20) {
							var4.field2411 = 5;
							var4.field2422 = (var4.field2427 - cx << 8) / var15;
							var4.field2413 = (var4.field2408 - cx << 8) / var15;
							var4.field2431 = (var4.field2417 - cz << 8) / var15;
							var4.field2415 = (var4.field2423 - cz << 8) / var15;
							field3430[field3411++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.b(II)V")
	public void method1157(int arg0, int arg1) {
		Square var3 = this.levelTiles[0][arg0][arg1];
		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = this.levelTiles[var4][arg0][arg1] = this.levelTiles[var4 + 1][arg0][arg1];
			if (var5 != null) {
				var5.level--;
				for (int var6 = 0; var6 < var5.spriteCount; var6++) {
					Sprite var7 = var5.sprites[var6];
					if ((var7.typecode >> 29 & 0x3) == 2 && var7.minTileX == arg0 && var7.minTileZ == arg1) {
						var7.field1065--;
					}
				}
			}
		}
		if (this.levelTiles[0][arg0][arg1] == null) {
			this.levelTiles[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		this.levelTiles[0][arg0][arg1].linkedSquare = var3;
		this.levelTiles[3][arg0][arg1] = null;
	}

	@ObfuscatedName("vd.a(IIIILdd;Ldd;IIIIII)V")
	public void method1158(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg4 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.typecode = arg10;
		var13.typecode2 = arg11;
		var13.x = arg1 * 128 + 64;
		var13.z = arg2 * 128 + 64;
		var13.y = arg3;
		var13.model = arg4;
		var13.model2 = arg5;
		var13.wshape = arg6;
		var13.yof = arg7;
		var13.field2822 = arg8;
		var13.field2829 = arg9;
		for (int var14 = arg0; var14 >= 0; var14--) {
			if (this.levelTiles[var14][arg1][arg2] == null) {
				this.levelTiles[var14][arg1][arg2] = new Square(var14, arg1, arg2);
			}
		}
		this.levelTiles[arg0][arg1][arg2].decor = var13;
	}

	@ObfuscatedName("vd.p(III)Lkf;")
	public GroundDecor getGd(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? null : var4.groundDecor;
	}

	@ObfuscatedName("vd.q(III)Z")
	public boolean groundOccluded(int arg0, int arg1, int arg2) {
		int var4 = this.occlusionCycle[arg0][arg1][arg2];
		if (var4 == -cycleNo) {
			return false;
		} else if (var4 == cycleNo) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.occlusionCycle[arg0][arg1][arg2] = cycleNo;
				return true;
			} else {
				this.occlusionCycle[arg0][arg1][arg2] = -cycleNo;
				return false;
			}
		}
	}

	@ObfuscatedName("vd.a(Lp;IIIII)V")
	public void method1162(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg4;
		int var10 = arg3 - 1;
		int var11 = arg3 + arg5;
		for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
			if (var12 != this.maxTileLevel) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.maxTileX) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.maxTileZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && var13 != arg2)) {
								Square var15 = this.levelTiles[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.groundh[var12][var13][var14] + this.groundh[var12][var13 + 1][var14] + this.groundh[var12][var13][var14 + 1] + this.groundh[var12][var13 + 1][var14 + 1]) / 4 - (this.groundh[arg1][arg2][arg3] + this.groundh[arg1][arg2 + 1][arg3] + this.groundh[arg1][arg2][arg3 + 1] + this.groundh[arg1][arg2 + 1][arg3 + 1]) / 4;
									Wall var17 = var15.wall;
									if (var17 != null) {
										if (var17.modelA instanceof ModelUnlit) {
											ModelUnlit var18 = (ModelUnlit) var17.modelA;
											ModelUnlit.shareLight(arg0, var18, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
										}
										if (var17.modelB instanceof ModelUnlit) {
											ModelUnlit var19 = (ModelUnlit) var17.modelB;
											ModelUnlit.shareLight(arg0, var19, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
										}
									}
									for (int var20 = 0; var20 < var15.spriteCount; var20++) {
										Sprite var21 = var15.sprites[var20];
										if (var21 != null && var21.model instanceof ModelUnlit) {
											ModelUnlit var22 = (ModelUnlit) var21.model;
											int var23 = var21.maxTileX + 1 - var21.minTileX;
											int var24 = var21.maxTileZ + 1 - var21.minTileZ;
											ModelUnlit.shareLight(arg0, var22, (var21.minTileX - arg2) * 128 + (var23 - arg4) * 64, var16, (var21.minTileZ - arg3) * 128 + (var24 - arg5) * 64, var7);
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

	@ObfuscatedName("vd.r(III)Z")
	public boolean occluded(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field3411; var4++) {
			Occlude var5 = field3430[var4];
			if (var5.field2411 == 1) {
				int var6 = var5.field2427 - arg0;
				if (var6 > 0) {
					int var7 = var5.field2417 + (var5.field2431 * var6 >> 8);
					int var8 = var5.field2423 + (var5.field2415 * var6 >> 8);
					int var9 = var5.field2432 + (var5.field2412 * var6 >> 8);
					int var10 = var5.field2421 + (var5.field2420 * var6 >> 8);
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field2411 == 2) {
				int var11 = arg0 - var5.field2427;
				if (var11 > 0) {
					int var12 = var5.field2417 + (var5.field2431 * var11 >> 8);
					int var13 = var5.field2423 + (var5.field2415 * var11 >> 8);
					int var14 = var5.field2432 + (var5.field2412 * var11 >> 8);
					int var15 = var5.field2421 + (var5.field2420 * var11 >> 8);
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field2411 == 3) {
				int var16 = var5.field2417 - arg2;
				if (var16 > 0) {
					int var17 = var5.field2427 + (var5.field2422 * var16 >> 8);
					int var18 = var5.field2408 + (var5.field2413 * var16 >> 8);
					int var19 = var5.field2432 + (var5.field2412 * var16 >> 8);
					int var20 = var5.field2421 + (var5.field2420 * var16 >> 8);
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field2411 == 4) {
				int var21 = arg2 - var5.field2417;
				if (var21 > 0) {
					int var22 = var5.field2427 + (var5.field2422 * var21 >> 8);
					int var23 = var5.field2408 + (var5.field2413 * var21 >> 8);
					int var24 = var5.field2432 + (var5.field2412 * var21 >> 8);
					int var25 = var5.field2421 + (var5.field2420 * var21 >> 8);
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field2411 == 5) {
				int var26 = arg1 - var5.field2432;
				if (var26 > 0) {
					int var27 = var5.field2427 + (var5.field2422 * var26 >> 8);
					int var28 = var5.field2408 + (var5.field2413 * var26 >> 8);
					int var29 = var5.field2417 + (var5.field2431 * var26 >> 8);
					int var30 = var5.field2423 + (var5.field2415 * var26 >> 8);
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@ObfuscatedName("vd.a(Lgb;)V")
	public void method1164(Sprite arg0) {
		for (int var2 = arg0.minTileX; var2 <= arg0.maxTileX; var2++) {
			for (int var3 = arg0.minTileZ; var3 <= arg0.maxTileZ; var3++) {
				Square var4 = this.levelTiles[arg0.field1065][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.spriteCount; var5++) {
						if (var4.sprites[var5] == arg0) {
							var4.spriteCount--;
							for (int var6 = var5; var6 < var4.spriteCount; var6++) {
								var4.sprites[var6] = var4.sprites[var6 + 1];
								var4.spriteSpan[var6] = var4.spriteSpan[var6 + 1];
							}
							var4.sprites[var4.spriteCount] = null;
							break;
						}
					}
					var4.spriteSpans = 0;
					for (int var7 = 0; var7 < var4.spriteCount; var7++) {
						var4.spriteSpans |= var4.spriteSpan[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.a(IIIILdd;ILdd;Ldd;)V")
	public void setObj(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, ModelSource arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.topObj = arg4;
		var9.field2033 = arg1 * 128 + 64;
		var9.field2034 = arg2 * 128 + 64;
		var9.field2028 = arg3;
		var9.field2046 = arg5;
		var9.bottomObj = arg6;
		var9.middleObj = arg7;
		int var10 = 0;
		Square var11 = this.levelTiles[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.spriteCount; var12++) {
				if ((var11.sprites[var12].typecode2 & 0x100) == 256 && var11.sprites[var12].model instanceof ModelLit) {
					ModelLit var13 = (ModelLit) var11.sprites[var12].model;
					var13.calcBoundingCylinder();
					if (var13.minY > var10) {
						var10 = var13.minY;
					}
				}
			}
		}
		var9.height = var10;
		if (this.levelTiles[arg0][arg1][arg2] == null) {
			this.levelTiles[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.levelTiles[arg0][arg1][arg2].groundObject = var9;
	}

	@ObfuscatedName("vd.b(IIIIIIII)Z")
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

	@ObfuscatedName("vd.b(IIIIII)V")
	public void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.maxTileX * 128) {
			arg0 = this.maxTileX * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.maxTileZ * 128) {
			arg2 = this.maxTileZ * 128 - 1;
		}
		cycleNo++;
		cameraSinX = Pix3D.sinTable[arg3];
		cameraCosX = Pix3D.cosTable[arg3];
		cameraSinY = Pix3D.sinTable[arg4];
		cameraCosY = Pix3D.cosTable[arg4];
		field3447 = visibilityMatrix[(arg3 - 128) / 32][arg4 / 64];
		cx = arg0;
		cy = arg1;
		cz = arg2;
		gx = arg0 / 128;
		gz = arg2 / 128;
		field3423 = arg5;
		minX = gx - 25;
		if (minX < 0) {
			minX = 0;
		}
		minZ = gz - 25;
		if (minZ < 0) {
			minZ = 0;
		}
		maxX = gx + 25;
		if (maxX > this.maxTileX) {
			maxX = this.maxTileX;
		}
		maxZ = gz + 25;
		if (maxZ > this.maxTileZ) {
			maxZ = this.maxTileZ;
		}
		this.method1156();
		fillLeft = 0;
		for (int var7 = this.minLevel; var7 < this.maxTileLevel; var7++) {
			Square[][] var8 = this.levelTiles[var7];
			for (int var9 = minX; var9 < maxX; var9++) {
				for (int var10 = minZ; var10 < maxZ; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field3550 <= arg5 && (field3447[var9 + 25 - gx][var10 + 25 - gz] || this.groundh[var7][var9][var10] - arg1 >= 2000)) {
							var11.drawFront = true;
							var11.drawBack = true;
							if (var11.spriteCount > 0) {
								var11.drawSprites = true;
							} else {
								var11.drawSprites = false;
							}
							fillLeft++;
						} else {
							var11.drawFront = false;
							var11.drawBack = false;
							var11.checkLocSpans = 0;
						}
					}
				}
			}
		}
		for (int var12 = this.minLevel; var12 < this.maxTileLevel; var12++) {
			Square[][] var13 = this.levelTiles[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = gx + var14;
				int var16 = gx - var14;
				if (var15 >= minX || var16 < maxX) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = gz + var17;
						int var19 = gz - var17;
						if (var15 >= minX) {
							if (var18 >= minZ) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.drawFront) {
									this.fill(var20, true);
								}
							}
							if (var19 < maxZ) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.drawFront) {
									this.fill(var21, true);
								}
							}
						}
						if (var16 < maxX) {
							if (var18 >= minZ) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.drawFront) {
									this.fill(var22, true);
								}
							}
							if (var19 < maxZ) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.drawFront) {
									this.fill(var23, true);
								}
							}
						}
						if (fillLeft == 0) {
							click = false;
							return;
						}
					}
				}
			}
		}
		for (int var24 = this.minLevel; var24 < this.maxTileLevel; var24++) {
			Square[][] var25 = this.levelTiles[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = gx + var26;
				int var28 = gx - var26;
				if (var27 >= minX || var28 < maxX) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = gz + var29;
						int var31 = gz - var29;
						if (var27 >= minX) {
							if (var30 >= minZ) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.drawFront) {
									this.fill(var32, false);
								}
							}
							if (var31 < maxZ) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.drawFront) {
									this.fill(var33, false);
								}
							}
						}
						if (var28 < maxX) {
							if (var30 >= minZ) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.drawFront) {
									this.fill(var34, false);
								}
							}
							if (var31 < maxZ) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.drawFront) {
									this.fill(var35, false);
								}
							}
						}
						if (fillLeft == 0) {
							click = false;
							return;
						}
					}
				}
			}
		}
		click = false;
	}
}
