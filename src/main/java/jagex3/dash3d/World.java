package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;

@ObfuscatedName("ab")
public final class World {

	@ObfuscatedName("ab.S")
	public static int xClip;
	@ObfuscatedName("ab.Y")
	public static int yClip;
	@ObfuscatedName("ab.kb")
	public static int xClip2;
	@ObfuscatedName("ab.cb")
	public static int yClip2;
	@ObfuscatedName("ab.jb")
	public static int yOrig;
	@ObfuscatedName("ab.W")
	public static int xOrig;
	@ObfuscatedName("ab.h")
	public static int cameraCosX;
	@ObfuscatedName("ab.K")
	public static int cameraSinX;
	@ObfuscatedName("ab.E")
	public static int cameraSinY;
	@ObfuscatedName("ab.y")
	public static int cameraCosY;
	@ObfuscatedName("ab.hb")
	public static boolean[][] visBackingDirty;
	@ObfuscatedName("ab.l")
	public static int cycleNo;
	@ObfuscatedName("ab.b")
	public static int cx;
	@ObfuscatedName("ab.o")
	public static int cy;
	@ObfuscatedName("ab.x")
	public static int cz;
	@ObfuscatedName("ab.e")
	public static int gx;
	@ObfuscatedName("ab.z")
	public static int gz;
	@ObfuscatedName("ab.u")
	public static int minX;
	@ObfuscatedName("ab.m")
	public static int minZ;
	@ObfuscatedName("ab.j")
	public static int maxX;
	@ObfuscatedName("ab.L")
	public static int maxZ;
	@ObfuscatedName("ab.a")
	public final Square[][][] squares = new Square[4][104][104];

	@ObfuscatedName("ab.ab")
	public int shareTic = 0;

	@ObfuscatedName("ab.bb")
	public final int[] shareMap = new int[10000];

	@ObfuscatedName("ab.c")
	public static int clickY = 0;

	@ObfuscatedName("ab.d")
	public static int groundX = -1;

	@ObfuscatedName("ab.db")
	public final int[][] field156 = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};

	@ObfuscatedName("ab.eb")
	public static int[] POSTTAB = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};

	@ObfuscatedName("ab.f")
	public static int[] DECORXOF = new int[]{53, -53, -53, 53};

	@ObfuscatedName("ab.fb")
	public static int[] MIDDEP_128 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};

	@ObfuscatedName("ab.g")
	public static int groundZ = -1;

	@ObfuscatedName("ab.gb")
	public static int[] MIDDEP_64 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};

	@ObfuscatedName("ab.i")
	public final int[][][] occlusionCycle = new int[4][105][105];

	@ObfuscatedName("ab.ib")
	public static boolean[][][][] field161 = new boolean[8][32][51][51];

	@ObfuscatedName("ab.k")
	public static int maxLevel = 0;

	@ObfuscatedName("ab.n")
	public static boolean field115 = true;

	@ObfuscatedName("ab.p")
	public static final int field117 = 4;

	@ObfuscatedName("ab.q")
	public static int clickX = 0;

	@ObfuscatedName("ab.r")
	public int field119 = 0;

	@ObfuscatedName("ab.s")
	public final Sprite[] field120 = new Sprite[5000];

	@ObfuscatedName("ab.t")
	public static int[] DECORXOF2 = new int[]{-45, 45, 45, -45};

	@ObfuscatedName("ab.v")
	public static int numActiveOccluders = 0;

	@ObfuscatedName("ab.w")
	public final int maxTileX = 104;

	@ObfuscatedName("ab.B")
	public static int[] DECORZOF2 = new int[]{45, 45, -45, -45};

	@ObfuscatedName("ab.A")
	public static int[] numOccluders = new int[field117];

	@ObfuscatedName("ab.J")
	public static int fillLeft = 0;

	@ObfuscatedName("ab.O")
	public static boolean click = false;

	@ObfuscatedName("ab.M")
	public static int[] DECORZOF = new int[]{-53, -53, 53, 53};

	@ObfuscatedName("ab.N")
	public static Occlude[][] occluders = new Occlude[field117][500];

	@ObfuscatedName("ab.H")
	public static Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("ab.G")
	public static Sprite[] field133 = new Sprite[100];

	@ObfuscatedName("ab.I")
	public static LinkList fillQueue = new LinkList();

	@ObfuscatedName("ab.R")
	public static int[] MIDTAB = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};

	@ObfuscatedName("ab.T")
	public static int[] MIDDEP_16 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};

	@ObfuscatedName("ab.U")
	public static int[] PRETAB = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};

	@ObfuscatedName("ab.Z")
	public static int[] MIDDEP_32 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};

	@ObfuscatedName("ab.C")
	public int minLevel = 0;

	@ObfuscatedName("ab.V")
	public final int[][] field148 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

	@ObfuscatedName("ab.X")
	public final int[] shareMap2 = new int[10000];

	@ObfuscatedName("ab.P")
	public final int maxTileLevel = 4;

	@ObfuscatedName("ab.Q")
	public final int maxTileZ = 104;

	@ObfuscatedName("ab.F")
	public final int[][][] groundh;

	@ObfuscatedName("ab.c()V")
	public static void unload() {
		field133 = null;
		DECORXOF = null;
		DECORZOF = null;
		DECORXOF2 = null;
		DECORZOF2 = null;
		numOccluders = null;
		occluders = null;
		activeOccluders = null;
		fillQueue = null;
		PRETAB = null;
		MIDTAB = null;
		POSTTAB = null;
		MIDDEP_16 = null;
		MIDDEP_32 = null;
		MIDDEP_64 = null;
		MIDDEP_128 = null;
		field161 = null;
		visBackingDirty = null;
	}

	@ObfuscatedName("ab.a(III)I")
	public int decorType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.decor == null ? 0 : var4.decor.typecode;
	}

	@ObfuscatedName("ab.a(II)V")
	public void pushDown(int arg0, int arg1) {
		Square var3 = this.squares[0][arg0][arg1];
		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = this.squares[var4][arg0][arg1] = this.squares[var4 + 1][arg0][arg1];
			if (var5 != null) {
				var5.level--;
				for (int var6 = 0; var6 < var5.spriteCount; var6++) {
					Sprite var7 = var5.sprites[var6];
					if ((var7.typecode >> 29 & 0x3) == 2 && var7.minTileX == arg0 && var7.maxTileX == arg1) {
						var7.level--;
					}
				}
			}
		}
		if (this.squares[0][arg0][arg1] == null) {
			this.squares[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		this.squares[0][arg0][arg1].linkedSquare = var3;
		this.squares[3][arg0][arg1] = null;
	}

	@ObfuscatedName("ab.b(III)I")
	public int gdType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("ab.a(IIIILvb;Lvb;IIII)V")
	public void setWall(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		Wall var11 = new Wall();
		var11.typecode = arg8;
		var11.field543 = arg9;
		var11.x = arg1 * 128 + 64;
		var11.z = arg2 * 128 + 64;
		var11.y = arg3;
		var11.modelA = arg4;
		var11.modelB = arg5;
		var11.angle1 = arg6;
		var11.angle2 = arg7;
		for (int var12 = arg0; var12 >= 0; var12--) {
			if (this.squares[var12][arg1][arg2] == null) {
				this.squares[var12][arg1][arg2] = new Square(var12, arg1, arg2);
			}
		}
		this.squares[arg0][arg1][arg2].wall = var11;
	}

	@ObfuscatedName("ab.a([IIIII)V")
	public static void resetVisCalc(int[] arg0) {
		xClip = 0;
		yClip = 0;
		xClip2 = 512;
		yClip2 = 334;
		xOrig = 256;
		yOrig = 167;
		boolean[][][][] var1 = new boolean[9][32][53][53];
		for (int var2 = 128; var2 <= 384; var2 += 32) {
			for (int var3 = 0; var3 < 2048; var3 += 64) {
				cameraCosX = Model.field2256[var2];
				cameraSinX = Model.field2258[var2];
				cameraSinY = Model.field2256[var3];
				cameraCosY = Model.field2258[var3];
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
						label76:
						for (int var17 = -1; var17 <= 1; var17++) {
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
						field161[var12][var13][var14 + 25][var15 + 25] = var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.a([IIIIII)V")
	public void method52(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.squares[arg2][arg3][arg4];
		if (var6 == null) {
			return;
		}
		QuickGround var7 = var6.quickGround;
		if (var7 != null) {
			int var8 = var7.field2642;
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
		if (var10 == null) {
			return;
		}
		int var11 = var10.field568;
		int var12 = var10.field559;
		int var13 = var10.field574;
		int var14 = var10.field561;
		int[] var15 = this.field156[var11];
		int[] var16 = this.field148[var12];
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

	@ObfuscatedName("ab.a(IIIIII)V")
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
		cameraCosX = Model.field2256[arg3];
		cameraSinX = Model.field2258[arg3];
		cameraSinY = Model.field2256[arg4];
		cameraCosY = Model.field2258[arg4];
		visBackingDirty = field161[(arg3 - 128) / 32][arg4 / 64];
		cx = arg0;
		cy = arg1;
		cz = arg2;
		gx = arg0 / 128;
		gz = arg2 / 128;
		maxLevel = arg5;
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
		this.calcOcclude();
		fillLeft = 0;
		for (int var7 = this.minLevel; var7 < this.maxTileLevel; var7++) {
			Square[][] var8 = this.squares[var7];
			for (int var9 = minX; var9 < maxX; var9++) {
				for (int var10 = minZ; var10 < maxZ; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field871 <= arg5 && (visBackingDirty[var9 + 25 - gx][var10 + 25 - gz] || this.groundh[var7][var9][var10] - arg1 >= 2000)) {
							var11.drawFront = true;
							var11.drawBack = true;
							if (var11.spriteCount > 0) {
								var11.field870 = true;
							} else {
								var11.field870 = false;
							}
							fillLeft++;
						} else {
							var11.drawFront = false;
							var11.drawBack = false;
							var11.cornerSides = 0;
						}
					}
				}
			}
		}
		for (int var12 = this.minLevel; var12 < this.maxTileLevel; var12++) {
			Square[][] var13 = this.squares[var12];
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
			Square[][] var25 = this.squares[var24];
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

	@ObfuscatedName("ab.a()V")
	public void resetMap() {
		for (int var1 = 0; var1 < this.maxTileLevel; var1++) {
			for (int var2 = 0; var2 < this.maxTileX; var2++) {
				for (int var3 = 0; var3 < this.maxTileZ; var3++) {
					this.squares[var1][var2][var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field117; var4++) {
			for (int var5 = 0; var5 < numOccluders[var4]; var5++) {
				occluders[var4][var5] = null;
			}
			numOccluders[var4] = 0;
		}
		for (int var6 = 0; var6 < this.field119; var6++) {
			this.field120[var6] = null;
		}
		this.field119 = 0;
		for (int var7 = 0; var7 < field133.length; var7++) {
			field133[var7] = null;
		}
	}

	@ObfuscatedName("ab.a(IIIIIIIIIIIIIIIIIIII)V")
	public void setGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.squares[var22][arg1][arg2] == null) {
					this.squares[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.squares[var24][arg1][arg2] == null) {
					this.squares[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.squares[var26][arg1][arg2] == null) {
					this.squares[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("ab.c(III)Lrd;")
	public Decor getDecor(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null ? null : var4.decor;
	}

	@ObfuscatedName("ab.d(III)Z")
	public boolean groundOccluded(int arg0, int arg1, int arg2) {
		int var4 = this.occlusionCycle[arg0][arg1][arg2];
		if (-cycleNo == var4) {
			return false;
		} else if (cycleNo == var4) {
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

	@ObfuscatedName("ab.a(IIII)Z")
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

	@ObfuscatedName("ab.e(III)Z")
	public boolean occluded(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numActiveOccluders; var4++) {
			Occlude var5 = activeOccluders[var4];
			if (var5.mode == 1) {
				int var6 = var5.minX - arg0;
				if (var6 > 0) {
					int var7 = (var5.minDeltaZ * var6 >> 8) + var5.minZ;
					int var8 = (var5.maxDeltaZ * var6 >> 8) + var5.maxZ;
					int var9 = (var5.minDeltaY * var6 >> 8) + var5.minY;
					int var10 = (var5.maxDeltaY * var6 >> 8) + var5.maxY;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.mode == 2) {
				int var11 = arg0 - var5.minX;
				if (var11 > 0) {
					int var12 = (var5.minDeltaZ * var11 >> 8) + var5.minZ;
					int var13 = (var5.maxDeltaZ * var11 >> 8) + var5.maxZ;
					int var14 = (var5.minDeltaY * var11 >> 8) + var5.minY;
					int var15 = (var5.maxDeltaY * var11 >> 8) + var5.maxY;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.mode == 3) {
				int var16 = var5.minZ - arg2;
				if (var16 > 0) {
					int var17 = (var5.minDeltaX * var16 >> 8) + var5.minX;
					int var18 = (var5.maxDeltaX * var16 >> 8) + var5.maxX;
					int var19 = (var5.minDeltaY * var16 >> 8) + var5.minY;
					int var20 = (var5.maxDeltaY * var16 >> 8) + var5.maxY;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.mode == 4) {
				int var21 = arg2 - var5.minZ;
				if (var21 > 0) {
					int var22 = (var5.minDeltaX * var21 >> 8) + var5.minX;
					int var23 = (var5.maxDeltaX * var21 >> 8) + var5.maxX;
					int var24 = (var5.minDeltaY * var21 >> 8) + var5.minY;
					int var25 = (var5.maxDeltaY * var21 >> 8) + var5.maxY;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.mode == 5) {
				int var26 = arg1 - var5.minY;
				if (var26 > 0) {
					int var27 = (var5.minDeltaX * var26 >> 8) + var5.minX;
					int var28 = (var5.maxDeltaX * var26 >> 8) + var5.maxX;
					int var29 = (var5.minDeltaZ * var26 >> 8) + var5.minZ;
					int var30 = (var5.maxDeltaZ * var26 >> 8) + var5.maxZ;
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ab.b()V")
	public void removeSprites() {
		for (int var1 = 0; var1 < this.field119; var1++) {
			Sprite var2 = this.field120[var1];
			this.method61(var2);
			this.field120[var1] = null;
		}
		this.field119 = 0;
	}

	@ObfuscatedName("ab.a(Lg;)V")
	public void method61(Sprite arg0) {
		for (int var2 = arg0.minTileX; var2 <= arg0.field995; var2++) {
			for (int var3 = arg0.maxTileX; var3 <= arg0.field988; var3++) {
				Square var4 = this.squares[arg0.level][var2][var3];
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

	@ObfuscatedName("ab.a(Lfa;Z)V")
	public void fill(Square arg0, boolean arg1) {
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
											} while (!var3.drawBack);
											var4 = var3.field869;
											var5 = var3.field886;
											var6 = var3.level;
											var7 = var3.field877;
											var8 = this.squares[var6];
											if (!var3.drawFront) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.squares[var6 - 1][var4][var5];
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
														this.renderGround(var14.ground, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var4, var5);
													}
												} else if (!this.groundOccluded(0, var4, var5)) {
													this.renderQuickGround(var14.quickGround, 0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.modelA.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var15.x - cx, var15.y - cy, var15.z - cz, var15.typecode);
												}
												for (int var16 = 0; var16 < var14.spriteCount; var16++) {
													Sprite var17 = var14.sprites[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.field991, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var17.field987 - cx, var17.field990 - cy, var17.field983 - cz, var17.typecode);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !this.groundOccluded(var7, var4, var5)) {
													var18 = true;
													this.renderGround(var3.ground, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var4, var5);
												}
											} else if (!this.groundOccluded(var7, var4, var5)) {
												var18 = true;
												this.renderQuickGround(var3.quickGround, var7, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var4, var5);
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
												if ((var21.angle1 & MIDTAB[var19]) == 0) {
													var3.cornerSides = 0;
												} else if (var21.angle1 == 16) {
													var3.cornerSides = 3;
													var3.sidesBeforeCorner = MIDDEP_16[var19];
													var3.sidesAfterCorner = 3 - var3.sidesBeforeCorner;
												} else if (var21.angle1 == 32) {
													var3.cornerSides = 6;
													var3.sidesBeforeCorner = MIDDEP_32[var19];
													var3.sidesAfterCorner = 6 - var3.sidesBeforeCorner;
												} else if (var21.angle1 == 64) {
													var3.cornerSides = 12;
													var3.sidesBeforeCorner = MIDDEP_64[var19];
													var3.sidesAfterCorner = 12 - var3.sidesBeforeCorner;
												} else {
													var3.cornerSides = 9;
													var3.sidesBeforeCorner = MIDDEP_128[var19];
													var3.sidesAfterCorner = 9 - var3.sidesBeforeCorner;
												}
												if ((var21.angle1 & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.angle1)) {
													var21.modelA.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var21.x - cx, var21.y - cy, var21.z - cz, var21.typecode);
												}
												if ((var21.angle2 & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.angle2)) {
													var21.modelB.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var21.x - cx, var21.y - cy, var21.z - cz, var21.typecode);
												}
											}
											if (var22 != null && !this.spriteOccluded(var7, var4, var5, var22.model.minY)) {
												if ((var22.wshape & var20) != 0) {
													var22.model.worldRender(var22.angle, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var22.x - cx, var22.y - cy, var22.z - cz, var22.typecode);
												} else if ((var22.wshape & 0x300) != 0) {
													int var23 = var22.x - cx;
													int var24 = var22.y - cy;
													int var25 = var22.z - cz;
													int var26 = var22.angle;
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
													if ((var22.wshape & 0x100) != 0 && var28 < var27) {
														int var29 = DECORXOF[var26] + var23;
														int var30 = DECORZOF[var26] + var25;
														var22.model.worldRender(var26 * 512 + 256, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var29, var24, var30, var22.typecode);
													}
													if ((var22.wshape & 0x200) != 0 && var28 > var27) {
														int var31 = DECORXOF2[var26] + var23;
														int var32 = DECORZOF2[var26] + var25;
														var22.model.worldRender(var26 * 512 + 1280 & 0x7FF, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var31, var24, var32, var22.typecode);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var33.x - cx, var33.y - cy, var33.z - cz, var33.typecode);
												}
												GroundObject var34 = var3.groundObject;
												if (var34 != null && var34.height == 0) {
													if (var34.bottomObj != null) {
														var34.bottomObj.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
													}
													if (var34.middleObj != null) {
														var34.middleObj.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
													}
													if (var34.topObj != null) {
														var34.topObj.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
													}
												}
											}
											int var35 = var3.spriteSpans;
											if (var35 != 0) {
												if (var4 < gx && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.drawBack) {
														fillQueue.push(var36);
													}
												}
												if (var5 < gz && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.drawBack) {
														fillQueue.push(var37);
													}
												}
												if (var4 > gx && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.drawBack) {
														fillQueue.push(var38);
													}
												}
												if (var5 > gz && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.drawBack) {
														fillQueue.push(var39);
													}
												}
											}
											break;
										}
										if (var3.cornerSides != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.spriteCount; var41++) {
												if (cycleNo != var3.sprites[var41].cycle && (var3.spriteSpan[var41] & var3.cornerSides) == var3.sidesBeforeCorner) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!this.wallOccluded(var7, var4, var5, var42.angle1)) {
													var42.modelA.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var42.x - cx, var42.y - cy, var42.z - cz, var42.typecode);
												}
												var3.cornerSides = 0;
											}
										}
										if (!var3.field870) {
											break;
										}
										try {
											int var43 = var3.spriteCount;
											var3.field870 = false;
											int var44 = 0;
											label559:
											for (int var45 = 0; var45 < var43; var45++) {
												Sprite var46 = var3.sprites[var45];
												if (cycleNo != var46.cycle) {
													for (int var47 = var46.minTileX; var47 <= var46.field995; var47++) {
														for (int var48 = var46.maxTileX; var48 <= var46.field988; var48++) {
															Square var49 = var8[var47][var48];
															if (var49.drawFront) {
																var3.field870 = true;
																continue label559;
															}
															if (var49.cornerSides != 0) {
																int var50 = 0;
																if (var47 > var46.minTileX) {
																	var50++;
																}
																if (var47 < var46.field995) {
																	var50 += 4;
																}
																if (var48 > var46.maxTileX) {
																	var50 += 8;
																}
																if (var48 < var46.field988) {
																	var50 += 2;
																}
																if ((var50 & var49.cornerSides) == var3.sidesAfterCorner) {
																	var3.field870 = true;
																	continue label559;
																}
															}
														}
													}
													field133[var44++] = var46;
													int var51 = gx - var46.minTileX;
													int var52 = var46.field995 - gx;
													if (var52 > var51) {
														var51 = var52;
													}
													int var53 = gz - var46.maxTileX;
													int var54 = var46.field988 - gz;
													if (var54 > var53) {
														var46.field1002 = var51 + var54;
													} else {
														var46.field1002 = var51 + var53;
													}
												}
											}
											while (var44 > 0) {
												int var55 = -50;
												int var56 = -1;
												for (int var57 = 0; var57 < var44; var57++) {
													Sprite var58 = field133[var57];
													if (cycleNo != var58.cycle) {
														if (var58.field1002 > var55) {
															var55 = var58.field1002;
															var56 = var57;
														} else if (var58.field1002 == var55) {
															int var59 = var58.field987 - cx;
															int var60 = var58.field983 - cz;
															int var61 = field133[var56].field987 - cx;
															int var62 = field133[var56].field983 - cz;
															if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
																var56 = var57;
															}
														}
													}
												}
												if (var56 == -1) {
													break;
												}
												Sprite var63 = field133[var56];
												var63.cycle = cycleNo;
												if (!this.spriteOccluded2(var7, var63.minTileX, var63.field995, var63.maxTileX, var63.field988, var63.model.minY)) {
													var63.model.worldRender(var63.field991, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var63.field987 - cx, var63.field990 - cy, var63.field983 - cz, var63.typecode);
												}
												for (int var64 = var63.minTileX; var64 <= var63.field995; var64++) {
													for (int var65 = var63.maxTileX; var65 <= var63.field988; var65++) {
														Square var66 = var8[var64][var65];
														if (var66.cornerSides != 0) {
															fillQueue.push(var66);
														} else if ((var4 != var64 || var5 != var65) && var66.drawBack) {
															fillQueue.push(var66);
														}
													}
												}
											}
											if (!var3.field870) {
												break;
											}
										} catch (Exception var89) {
											var3.field870 = false;
											break;
										}
									}
								} while (!var3.drawBack);
							} while (var3.cornerSides != 0);
							if (var4 > gx || var4 <= minX) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.drawBack);
						if (var4 < gx || var4 >= maxX - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.drawBack);
					if (var5 > gz || var5 <= minZ) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.drawBack);
				if (var5 < gz || var5 >= maxZ - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.drawBack);
			var3.drawBack = false;
			fillLeft--;
			GroundObject var71 = var3.groundObject;
			if (var71 != null && var71.height != 0) {
				if (var71.bottomObj != null) {
					var71.bottomObj.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var71.x - cx, var71.y - cy - var71.height, var71.z - cz, var71.typecode);
				}
				if (var71.middleObj != null) {
					var71.middleObj.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var71.x - cx, var71.y - cy - var71.height, var71.z - cz, var71.typecode);
				}
				if (var71.topObj != null) {
					var71.topObj.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var71.x - cx, var71.y - cy - var71.height, var71.z - cz, var71.typecode);
				}
			}
			if (var3.backWallTypes != 0) {
				Decor var72 = var3.decor;
				if (var72 != null && !this.spriteOccluded(var7, var4, var5, var72.model.minY)) {
					if ((var72.wshape & var3.backWallTypes) != 0) {
						var72.model.worldRender(var72.angle, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var72.x - cx, var72.y - cy, var72.z - cz, var72.typecode);
					} else if ((var72.wshape & 0x300) != 0) {
						int var73 = var72.x - cx;
						int var74 = var72.y - cy;
						int var75 = var72.z - cz;
						int var76 = var72.angle;
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
						if ((var72.wshape & 0x100) != 0 && var78 >= var77) {
							int var79 = DECORXOF[var76] + var73;
							int var80 = DECORZOF[var76] + var75;
							var72.model.worldRender(var76 * 512 + 256, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var79, var74, var80, var72.typecode);
						}
						if ((var72.wshape & 0x200) != 0 && var78 <= var77) {
							int var81 = DECORXOF2[var76] + var73;
							int var82 = DECORZOF2[var76] + var75;
							var72.model.worldRender(var76 * 512 + 1280 & 0x7FF, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var81, var74, var82, var72.typecode);
						}
					}
				}
				Wall var83 = var3.wall;
				if (var83 != null) {
					if ((var83.angle2 & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var83.angle2)) {
						var83.modelB.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var83.x - cx, var83.y - cy, var83.z - cz, var83.typecode);
					}
					if ((var83.angle1 & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var83.angle1)) {
						var83.modelA.worldRender(0, cameraCosX, cameraSinX, cameraSinY, cameraCosY, var83.x - cx, var83.y - cy, var83.z - cz, var83.typecode);
					}
				}
			}
			if (var6 < this.maxTileLevel - 1) {
				Square var84 = this.squares[var6 + 1][var4][var5];
				if (var84 != null && var84.drawBack) {
					fillQueue.push(var84);
				}
			}
			if (var4 < gx) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.drawBack) {
					fillQueue.push(var85);
				}
			}
			if (var5 < gz) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.drawBack) {
					fillQueue.push(var86);
				}
			}
			if (var4 > gx) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.drawBack) {
					fillQueue.push(var87);
				}
			}
			if (var5 > gz) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.drawBack) {
					fillQueue.push(var88);
				}
			}
		}
	}

	@ObfuscatedName("ab.f(III)Lg;")
	public Sprite getScene(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.maxTileX == arg2) {
				return var6;
			}
		}
		return null;
	}

	@ObfuscatedName("ab.b(II)I")
	public static int method64(int arg0, int arg1) {
		int var2 = (arg0 & 0x7F) * (127 - arg1) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("ab.a(IIIILvb;IIIIII)V")
	public void setDecor(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg4 == null) {
			return;
		}
		Decor var12 = new Decor();
		var12.typecode = arg9;
		var12.field2669 = arg10;
		var12.x = arg1 * 128 + arg7 + 64;
		var12.z = arg2 * 128 + arg8 + 64;
		var12.y = arg3;
		var12.model = arg4;
		var12.wshape = arg5;
		var12.angle = arg6;
		for (int var13 = arg0; var13 >= 0; var13--) {
			if (this.squares[var13][arg1][arg2] == null) {
				this.squares[var13][arg1][arg2] = new Square(var13, arg1, arg2);
			}
		}
		this.squares[arg0][arg1][arg2].decor = var12;
	}

	@ObfuscatedName("ab.g(III)I")
	public int sceneType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.maxTileX == arg2) {
				return var6.typecode;
			}
		}
		return 0;
	}

	@ObfuscatedName("ab.b(IIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!this.groundOccluded(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		return this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundh[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.groundh[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
	}

	@ObfuscatedName("ab.a(IIIIILvb;IIIIII)Z")
	public boolean addScenery(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : this.setSprite(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@ObfuscatedName("ab.h(III)Z")
	public static boolean testPoint(int arg0, int arg1, int arg2) {
		int var3 = cameraSinY * arg2 + cameraCosY * arg0 >> 16;
		int var4 = cameraCosY * arg2 - cameraSinY * arg0 >> 16;
		int var5 = cameraSinX * var4 + cameraCosX * arg1 >> 16;
		int var6 = cameraSinX * arg1 - cameraCosX * var4 >> 16;
		if (var5 < 50 || var5 > 3500) {
			return false;
		}
		int var7 = (var3 << 9) / var5 + xOrig;
		int var8 = (var6 << 9) / var5 + yOrig;
		return var7 >= xClip && var7 <= xClip2 && var8 >= yClip && var8 <= yClip2;
	}

	public World(int arg0, int arg1, int arg2, int[][][] arg3) {
		this.groundh = arg3;
		this.resetMap();
	}

	@ObfuscatedName("ab.c(IIII)V")
	public void moveDecor(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 == null) {
			return;
		}
		Decor var6 = var5.decor;
		if (var6 != null) {
			int var7 = arg1 * 128 + 64;
			int var8 = arg2 * 128 + 64;
			var6.x = (var6.x - var7) * arg3 / 16 + var7;
			var6.z = (var6.z - var8) * arg3 / 16 + var8;
		}
	}

	@ObfuscatedName("ab.a(IIIIIIII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.minTileX = arg2 / 128;
		var8.field1741 = arg3 / 128;
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

	@ObfuscatedName("ab.a(Lpa;III)V")
	public void shareLightGd(Model arg0, int arg1, int arg2, int arg3) {
		if (arg2 < this.maxTileX) {
			Square var5 = this.squares[arg1][arg2 + 1][arg3];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.model instanceof Model) {
				Model var6 = (Model) var5.groundDecor.model;
				if (var6.pointNormal != null) {
					this.modelShareLight(arg0, var6, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.maxTileX) {
			Square var7 = this.squares[arg1][arg2][arg3 + 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model instanceof Model) {
				Model var8 = (Model) var7.groundDecor.model;
				if (var8.pointNormal != null) {
					this.modelShareLight(arg0, var8, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.maxTileX && arg3 < this.maxTileZ) {
			Square var9 = this.squares[arg1][arg2 + 1][arg3 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.model instanceof Model) {
				Model var10 = (Model) var9.groundDecor.model;
				if (var10.pointNormal != null) {
					this.modelShareLight(arg0, var10, 128, 0, 128, true);
				}
			}
		}
		if (arg2 < this.maxTileX && arg3 > 0) {
			Square var11 = this.squares[arg1][arg2 + 1][arg3 - 1];
			if (var11 != null && var11.groundDecor != null && var11.groundDecor.model instanceof Model) {
				Model var12 = (Model) var11.groundDecor.model;
				if (var12.pointNormal != null) {
					this.modelShareLight(arg0, var12, 128, 0, -128, true);
				}
			}
		}
	}

	@ObfuscatedName("ab.i(III)V")
	public void shareLight() {
		for (int var1 = 0; var1 < this.maxTileLevel; var1++) {
			for (int var2 = 0; var2 < this.maxTileX; var2++) {
				for (int var3 = 0; var3 < this.maxTileZ; var3++) {
					Square var4 = this.squares[var1][var2][var3];
					if (var4 != null) {
						Wall var5 = var4.wall;
						if (var5 != null && var5.modelA instanceof Model) {
							Model var6 = (Model) var5.modelA;
							if (var6.pointNormal != null) {
								this.shareLightLoc(var6, var1, var2, var3, 1, 1);
								if (var5.modelB instanceof Model) {
									Model var7 = (Model) var5.modelB;
									if (var7.pointNormal != null) {
										this.shareLightLoc(var7, var1, var2, var3, 1, 1);
										this.modelShareLight(var6, var7, 0, 0, 0, false);
										var7.light();
									}
								}
								var6.light();
							}
						}
						for (int var8 = 0; var8 < var4.spriteCount; var8++) {
							Sprite var9 = var4.sprites[var8];
							if (var9 != null && var9.model instanceof Model) {
								Model var10 = (Model) var9.model;
								if (var10.pointNormal != null) {
									this.shareLightLoc(var10, var1, var2, var3, var9.field995 + 1 - var9.minTileX, var9.field988 - var9.maxTileX + 1);
									var10.light();
								}
							}
						}
						GroundDecor var11 = var4.groundDecor;
						if (var11 != null && var11.model instanceof Model) {
							Model var12 = (Model) var11.model;
							if (var12.pointNormal != null) {
								this.shareLightGd(var12, var1, var2, var3);
								var12.light();
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.b(IIIIII)Z")
	public boolean spriteOccluded2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

	@ObfuscatedName("ab.c(II)V")
	public void updateMousePicking(int arg0, int arg1) {
		click = true;
		clickX = arg0;
		clickY = arg1;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("ab.a(Lpa;Lpa;IIIZ)V")
	public void modelShareLight(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		arg1.method790();
		this.shareTic++;
		int var7 = 0;
		int[] var8 = arg1.pointX;
		int var9 = arg1.numPoints;
		for (int var10 = 0; var10 < arg0.numPoints; var10++) {
			PointNormal var11 = arg0.pointNormal[var10];
			PointNormal var12 = arg0.sharedPointNormal[var10];
			if (var12.w == 0) {
				continue;
			}
			int var13 = arg0.pointY[var10] - arg3;
			if (var13 > arg1.maxY) {
				continue;
			}
			int var14 = arg0.pointX[var10] - arg2;
			if (var14 < arg1.minX || var14 > arg1.maxX) {
				continue;
			}
			int var15 = arg0.pointZ[var10] - arg4;
			if (var15 < arg1.minZ || var15 > arg1.maxZ) {
				continue;
			}
			for (int var16 = 0; var16 < var9; var16++) {
				PointNormal var17 = arg1.pointNormal[var16];
				PointNormal var18 = arg1.sharedPointNormal[var16];
				if (var8[var16] == var14 && arg1.pointZ[var16] == var15 && arg1.pointY[var16] == var13 && var18.w != 0) {
					var11.x += var18.x;
					var11.y += var18.y;
					var11.z += var18.z;
					var11.w += var18.w;
					var17.x += var12.x;
					var17.y += var12.y;
					var17.z += var12.z;
					var17.w += var12.w;
					var7++;
					this.shareMap[var10] = this.shareTic;
					this.shareMap2[var16] = this.shareTic;
				}
			}
		}
		if (var7 >= 3 && arg5) {
			for (int var19 = 0; var19 < arg0.numFaces; var19++) {
				if (this.shareMap[arg0.faceVertexA[var19]] == this.shareTic && this.shareMap[arg0.faceVertexB[var19]] == this.shareTic && this.shareMap[arg0.faceVertexC[var19]] == this.shareTic) {
					arg0.faceRenderType[var19] = -1;
				}
			}
			for (int var20 = 0; var20 < arg1.numFaces; var20++) {
				if (this.shareMap2[arg1.faceVertexA[var20]] == this.shareTic && this.shareMap2[arg1.faceVertexB[var20]] == this.shareTic && this.shareMap2[arg1.faceVertexC[var20]] == this.shareTic) {
					arg1.faceRenderType[var20] = -1;
				}
			}
		}
	}

	@ObfuscatedName("ab.j(III)I")
	public int wallType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode;
	}

	@ObfuscatedName("ab.d()V")
	public void calcOcclude() {
		int var1 = numOccluders[maxLevel];
		Occlude[] var2 = occluders[maxLevel];
		numActiveOccluders = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.type == 1) {
				int var5 = var4.minTileX + 25 - gx;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.minTileZ + 25 - gz;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var4.maxTileZ + 25 - gz;
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
						int var9 = cx - var4.minX;
						if (var9 > 32) {
							var4.mode = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.mode = 2;
							var9 = -var9;
						}
						var4.minDeltaZ = (var4.minZ - cz << 8) / var9;
						var4.maxDeltaZ = (var4.maxZ - cz << 8) / var9;
						var4.minDeltaY = (var4.minY - cy << 8) / var9;
						var4.maxDeltaY = (var4.maxY - cy << 8) / var9;
						activeOccluders[numActiveOccluders++] = var4;
					}
				}
			} else if (var4.type == 2) {
				int var10 = var4.minTileZ + 25 - gz;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.minTileX + 25 - gx;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var4.field1741 + 25 - gx;
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
						int var14 = cz - var4.minZ;
						if (var14 > 32) {
							var4.mode = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var4.mode = 4;
							var14 = -var14;
						}
						var4.minDeltaX = (var4.minX - cx << 8) / var14;
						var4.maxDeltaX = (var4.maxX - cx << 8) / var14;
						var4.minDeltaY = (var4.minY - cy << 8) / var14;
						var4.maxDeltaY = (var4.maxY - cy << 8) / var14;
						activeOccluders[numActiveOccluders++] = var4;
					}
				}
			} else if (var4.type == 4) {
				int var15 = var4.minY - cy;
				if (var15 > 128) {
					int var16 = var4.minTileZ + 25 - gz;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var4.maxTileZ + 25 - gz;
					if (var17 > 50) {
						var17 = 50;
					}
					if (var16 <= var17) {
						int var18 = var4.minTileX + 25 - gx;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var4.field1741 + 25 - gx;
						if (var19 > 50) {
							var19 = 50;
						}
						boolean var20 = false;
						label142:
						for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (visBackingDirty[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}
						if (var20) {
							var4.mode = 5;
							var4.minDeltaX = (var4.minX - cx << 8) / var15;
							var4.maxDeltaX = (var4.maxX - cx << 8) / var15;
							var4.minDeltaZ = (var4.minZ - cz << 8) / var15;
							var4.maxDeltaZ = (var4.maxZ - cz << 8) / var15;
							activeOccluders[numActiveOccluders++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.k(III)V")
	public void method80(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	@ObfuscatedName("ab.l(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("ab.m(III)Lcd;")
	public Wall getWall(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null ? null : var4.wall;
	}

	@ObfuscatedName("ab.n(III)V")
	public void method83(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.decor = null;
		}
	}

	@ObfuscatedName("ab.a(Lrc;IIIIIII)V")
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
		int var21 = arg4 * var12 + arg5 * var10 >> 16;
		int var22 = arg5 * var12 - arg4 * var10 >> 16;
		int var24 = arg3 * var17 - arg2 * var22 >> 16;
		int var25 = arg2 * var17 + arg3 * var22 >> 16;
		if (var25 < 50) {
			return;
		}
		int var27 = arg4 * var11 + arg5 * var14 >> 16;
		int var28 = arg5 * var11 - arg4 * var14 >> 16;
		int var30 = arg3 * var18 - arg2 * var28 >> 16;
		int var31 = arg2 * var18 + arg3 * var28 >> 16;
		if (var31 < 50) {
			return;
		}
		int var33 = arg4 * var16 + arg5 * var13 >> 16;
		int var34 = arg5 * var16 - arg4 * var13 >> 16;
		int var36 = arg3 * var19 - arg2 * var34 >> 16;
		int var37 = arg2 * var19 + arg3 * var34 >> 16;
		if (var37 < 50) {
			return;
		}
		int var39 = arg4 * var15 + arg5 * var9 >> 16;
		int var40 = arg5 * var15 - arg4 * var9 >> 16;
		int var42 = arg3 * var20 - arg2 * var40 >> 16;
		int var43 = arg2 * var20 + arg3 * var40 >> 16;
		if (var43 < 50) {
			return;
		}
		int var44 = (var21 << 9) / var25 + Pix3D.originX;
		int var45 = (var24 << 9) / var25 + Pix3D.originY;
		int var46 = (var27 << 9) / var31 + Pix3D.originX;
		int var47 = (var30 << 9) / var31 + Pix3D.originY;
		int var48 = (var33 << 9) / var37 + Pix3D.originX;
		int var49 = (var36 << 9) / var37 + Pix3D.originY;
		int var50 = (var39 << 9) / var43 + Pix3D.originX;
		int var51 = (var42 << 9) / var43 + Pix3D.originY;
		Pix3D.trans = 0;
		if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
			Pix3D.hclip = false;
			if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix3D.width || var50 > Pix3D.width || var46 > Pix3D.width) {
				Pix3D.hclip = true;
			}
			if (click && this.method98(clickX, clickY, var49, var51, var47, var48, var50, var46)) {
				groundX = arg6;
				groundZ = arg7;
			}
			if (arg0.field2636 == -1) {
				if (arg0.field2651 != 12345678) {
					Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, arg0.field2651, arg0.field2648, arg0.field2641);
				}
			} else if (field115) {
				int var52 = Pix3D.textureManager.getAverageRgb(arg0.field2636);
				Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, method64(var52, arg0.field2651), method64(var52, arg0.field2648), method64(var52, arg0.field2641));
			} else if (arg0.field2645) {
				Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.field2651, arg0.field2648, arg0.field2641, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2636);
			} else {
				Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.field2651, arg0.field2648, arg0.field2641, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2636);
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix3D.width || var46 > Pix3D.width || var50 > Pix3D.width) {
			Pix3D.hclip = true;
		}
		if (click && this.method98(clickX, clickY, var45, var47, var51, var44, var46, var50)) {
			groundX = arg6;
			groundZ = arg7;
		}
		if (arg0.field2636 != -1) {
			if (!field115) {
				Pix3D.textureTriangle(var45, var47, var51, var44, var46, var50, arg0.field2647, arg0.field2641, arg0.field2648, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2636);
				return;
			}
			int var53 = Pix3D.textureManager.getAverageRgb(arg0.field2636);
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, method64(var53, arg0.field2647), method64(var53, arg0.field2641), method64(var53, arg0.field2648));
		} else if (arg0.field2647 != 12345678) {
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, arg0.field2647, arg0.field2641, arg0.field2648);
			return;
		}
	}

	@ObfuscatedName("ab.a(Lpa;IIIII)V")
	public void shareLightLoc(Model arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg4;
		int var10 = arg3 - 1;
		int var11 = arg3 + arg5;
		for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
			if (this.maxTileLevel != var12) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.maxTileX) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.maxTileZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && arg2 != var13)) {
								Square var15 = this.squares[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.groundh[var12][var13 + 1][var14] + this.groundh[var12][var13][var14] + this.groundh[var12][var13][var14 + 1] + this.groundh[var12][var13 + 1][var14 + 1]) / 4 - (this.groundh[arg1][arg2 + 1][arg3] + this.groundh[arg1][arg2][arg3] + this.groundh[arg1][arg2][arg3 + 1] + this.groundh[arg1][arg2 + 1][arg3 + 1]) / 4;
									Wall var17 = var15.wall;
									if (var17 != null) {
										if (var17.modelA instanceof Model) {
											Model var18 = (Model) var17.modelA;
											if (var18.pointNormal != null) {
												this.modelShareLight(arg0, var18, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
											}
										}
										if (var17.modelB instanceof Model) {
											Model var19 = (Model) var17.modelB;
											if (var19.pointNormal != null) {
												this.modelShareLight(arg0, var19, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
											}
										}
									}
									for (int var20 = 0; var20 < var15.spriteCount; var20++) {
										Sprite var21 = var15.sprites[var20];
										if (var21 != null && var21.model instanceof Model) {
											Model var22 = (Model) var21.model;
											if (var22.pointNormal != null) {
												int var23 = var21.field995 + 1 - var21.minTileX;
												int var24 = var21.field988 + 1 - var21.maxTileX;
												this.modelShareLight(arg0, var22, (var21.minTileX - arg2) * 128 + (var23 - arg4) * 64, var16, (var21.maxTileX - arg3) * 128 + (var24 - arg5) * 64, var7);
											}
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

	@ObfuscatedName("ab.d(IIII)V")
	public void setLayer(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 != null) {
			this.squares[arg0][arg1][arg2].field871 = arg3;
		}
	}

	@ObfuscatedName("ab.o(III)V")
	public void delGroundDecor(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundDecor = null;
		}
	}

	@ObfuscatedName("ab.a(IIIILvb;II)V")
	public void setGroundDecor(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6) {
		if (arg4 == null) {
			return;
		}
		GroundDecor var8 = new GroundDecor();
		var8.model = arg4;
		var8.x = arg1 * 128 + 64;
		var8.z = arg2 * 128 + 64;
		var8.y = arg3;
		var8.typecode = arg5;
		var8.field1360 = arg6;
		if (this.squares[arg0][arg1][arg2] == null) {
			this.squares[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.squares[arg0][arg1][arg2].groundDecor = var8;
	}

	@ObfuscatedName("ab.p(III)Lid;")
	public GroundDecor getGd(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? null : var4.groundDecor;
	}

	@ObfuscatedName("ab.a(IIIIILvb;IIZ)Z")
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
		return this.setSprite(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@ObfuscatedName("ab.q(III)V")
	public void method91(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.maxTileX == arg2) {
				this.method61(var6);
				return;
			}
		}
	}

	@ObfuscatedName("ab.a(I)V")
	public void fillBaseLevel(int arg0) {
		this.minLevel = arg0;
		for (int var2 = 0; var2 < this.maxTileX; var2++) {
			for (int var3 = 0; var3 < this.maxTileZ; var3++) {
				if (this.squares[arg0][var2][var3] == null) {
					this.squares[arg0][var2][var3] = new Square(arg0, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("ab.a(IIIIIILvb;III)Z")
	public boolean addScenery(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, int arg8, int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			int var11 = arg1 * 128 + arg4 * 64;
			int var12 = arg2 * 128 + arg5 * 64;
			return this.setSprite(arg0, arg1, arg2, arg4, arg5, var11, var12, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@ObfuscatedName("ab.a(Lce;IIIIII)V")
	public void renderGround(Ground arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0.field554.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg0.field554[var9] - cx;
			int var11 = arg0.field571[var9] - cy;
			int var12 = arg0.field573[var9] - cz;
			int var13 = arg3 * var12 + arg4 * var10 >> 16;
			int var14 = arg4 * var12 - arg3 * var10 >> 16;
			int var16 = arg2 * var11 - arg1 * var14 >> 16;
			int var17 = arg1 * var11 + arg2 * var14 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg0.field556 != null) {
				Ground.field565[var9] = var13;
				Ground.field570[var9] = var16;
				Ground.field555[var9] = var17;
			}
			Ground.field558[var9] = (var13 << 9) / var17 + Pix3D.originX;
			Ground.field553[var9] = (var16 << 9) / var17 + Pix3D.originY;
		}
		Pix3D.trans = 0;
		int var18 = arg0.field569.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg0.field569[var19];
			int var21 = arg0.field557[var19];
			int var22 = arg0.field563[var19];
			int var23 = Ground.field558[var20];
			int var24 = Ground.field558[var21];
			int var25 = Ground.field558[var22];
			int var26 = Ground.field553[var20];
			int var27 = Ground.field553[var21];
			int var28 = Ground.field553[var22];
			if ((var23 - var24) * (var28 - var27) - (var25 - var24) * (var26 - var27) > 0) {
				Pix3D.hclip = false;
				if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix3D.width || var24 > Pix3D.width || var25 > Pix3D.width) {
					Pix3D.hclip = true;
				}
				if (click && this.method98(clickX, clickY, var26, var27, var28, var23, var24, var25)) {
					groundX = arg5;
					groundZ = arg6;
				}
				if (arg0.field556 == null || arg0.field556[var19] == -1) {
					if (arg0.field562[var19] != 12345678) {
						Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, arg0.field562[var19], arg0.field564[var19], arg0.field567[var19]);
					}
				} else if (field115) {
					int var29 = Pix3D.textureManager.getAverageRgb(arg0.field556[var19]);
					Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, method64(var29, arg0.field562[var19]), method64(var29, arg0.field564[var19]), method64(var29, arg0.field567[var19]));
				} else if (arg0.field560) {
					Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg0.field562[var19], arg0.field564[var19], arg0.field567[var19], Ground.field565[0], Ground.field565[1], Ground.field565[3], Ground.field570[0], Ground.field570[1], Ground.field570[3], Ground.field555[0], Ground.field555[1], Ground.field555[3], arg0.field556[var19]);
				} else {
					Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg0.field562[var19], arg0.field564[var19], arg0.field567[var19], Ground.field565[var20], Ground.field565[var21], Ground.field565[var22], Ground.field570[var20], Ground.field570[var21], Ground.field570[var22], Ground.field555[var20], Ground.field555[var21], Ground.field555[var22], arg0.field556[var19]);
				}
			}
		}
	}

	@ObfuscatedName("ab.a(IIIILvb;ILvb;Lvb;)V")
	public void setObj(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, ModelSource arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.topObj = arg4;
		var9.x = arg1 * 128 + 64;
		var9.z = arg2 * 128 + 64;
		var9.y = arg3;
		var9.typecode = arg5;
		var9.bottomObj = arg6;
		var9.middleObj = arg7;
		int var10 = 0;
		Square var11 = this.squares[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.spriteCount; var12++) {
				if ((var11.sprites[var12].field982 & 0x100) == 256 && var11.sprites[var12].model instanceof Model) {
					Model var13 = (Model) var11.sprites[var12].model;
					var13.calcBoundingCylinder();
					if (var13.minY > var10) {
						var10 = var13.minY;
					}
				}
			}
		}
		var9.height = var10;
		if (this.squares[arg0][arg1][arg2] == null) {
			this.squares[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.squares[arg0][arg1][arg2].groundObject = var9;
	}

	@ObfuscatedName("ab.a(IIIIIIIILvb;IZII)Z")
	public boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, int arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.maxTileX || var15 >= this.maxTileZ) {
					return false;
				}
				Square var16 = this.squares[arg0][var14][var15];
				if (var16 != null && var16.spriteCount >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.typecode = arg11;
		var17.field982 = arg12;
		var17.level = arg0;
		var17.field987 = arg5;
		var17.field983 = arg6;
		var17.field990 = arg7;
		var17.model = arg8;
		var17.field991 = arg9;
		var17.minTileX = arg1;
		var17.maxTileX = arg2;
		var17.field995 = arg1 + arg3 - 1;
		var17.field988 = arg2 + arg4 - 1;
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
					if (this.squares[var21][var18][var19] == null) {
						this.squares[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.squares[arg0][var18][var19];
				var22.sprites[var22.spriteCount] = var17;
				var22.spriteSpan[var22.spriteCount] = var20;
				var22.spriteSpans |= var20;
				var22.spriteCount++;
			}
		}
		if (arg10) {
			this.field120[this.field119++] = var17;
		}
		return true;
	}

	@ObfuscatedName("ab.e(IIII)I")
	public int typecode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
			return var5.wall.field543 & 0xFF;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return var5.decor.field2669 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return var5.groundDecor.field1360 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.spriteCount; var6++) {
				if (var5.sprites[var6].typecode == arg3) {
					return var5.sprites[var6].field982 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("ab.b(IIIIIIII)Z")
	public boolean method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
			return var9 * var11 > 0 && var10 * var11 > 0;
		}
	}
}
