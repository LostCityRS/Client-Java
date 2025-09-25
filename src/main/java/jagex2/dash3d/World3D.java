package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

@ObfuscatedName("s")
public class World3D {

	@ObfuscatedName("s.l")
	public static boolean lowMem = true;

	@ObfuscatedName("s.m")
	public int maxLevel;

	@ObfuscatedName("s.n")
	public int maxTileX;

	@ObfuscatedName("s.o")
	public int maxTileZ;

	@ObfuscatedName("s.p")
	public int[][][] levelHeightmaps;

	@ObfuscatedName("s.q")
	public Square[][][] levelTiles;

	@ObfuscatedName("s.r")
	public int minLevel;

	@ObfuscatedName("s.s")
	public int changedLocCount;

	@ObfuscatedName("s.t")
	public Sprite[] changedLocs = new Sprite[5000];

	@ObfuscatedName("s.u")
	public int[][][] levelTileOcclusionCycles;

	@ObfuscatedName("s.v")
	public static int tilesRemaining;

	@ObfuscatedName("s.w")
	public static int topLevel;

	@ObfuscatedName("s.x")
	public static int cycle;

	@ObfuscatedName("s.y")
	public static int minDrawTileX;

	@ObfuscatedName("s.z")
	public static int maxDrawTileX;

	@ObfuscatedName("s.ab")
	public static LinkList drawTileQueue = new LinkList();

	@ObfuscatedName("s.bb")
	public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("s.cb")
	public static final int[] DIRECTION_ALLOW_WALL_CORNER_TYPE = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("s.db")
	public static final int[] BACK_WALL_TYPES = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("s.eb")
	public static final int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("s.fb")
	public static final int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.gb")
	public static final int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.hb")
	public static final int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("s.ib")
	public static final int[] TEXTURE_HSL = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("s.jb")
	public int[] mergeIndexA = new int[10000];

	@ObfuscatedName("s.kb")
	public int[] mergeIndexB = new int[10000];

	@ObfuscatedName("s.lb")
	public int tmpMergeIndex;

	@ObfuscatedName("s.mb")
	public int[][] MINIMAP_OVERLAY_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("s.nb")
	public int[][] MINIMAP_OVERLAY_ANGLE = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("s.ob")
	public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

	@ObfuscatedName("s.pb")
	public static boolean[][] visibilityMap;

	@ObfuscatedName("s.qb")
	public static int viewportCenterX;

	@ObfuscatedName("s.rb")
	public static int viewportCenterY;

	@ObfuscatedName("s.sb")
	public static int viewportLeft;

	@ObfuscatedName("s.tb")
	public static int viewportTop;

	@ObfuscatedName("s.ub")
	public static int viewportRight;

	@ObfuscatedName("s.vb")
	public static int viewportBottom;

	@ObfuscatedName("s.L")
	public static Sprite[] locBuffer = new Sprite[100];

	@ObfuscatedName("s.M")
	public static final int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("s.N")
	public static final int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("s.O")
	public static final int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("s.P")
	public static final int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("s.T")
	public static int clickTileX = -1;

	@ObfuscatedName("s.U")
	public static int clickTileZ = -1;

	@ObfuscatedName("s.V")
	public static int LEVEL_COUNT = 4;

	@ObfuscatedName("s.W")
	public static int[] levelOccluderCount = new int[LEVEL_COUNT];

	@ObfuscatedName("s.X")
	public static Occlude[][] levelOccluders = new Occlude[LEVEL_COUNT][500];

	@ObfuscatedName("s.Z")
	public static Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("s.A")
	public static int minDrawTileZ;

	@ObfuscatedName("s.B")
	public static int maxDrawTileZ;

	@ObfuscatedName("s.C")
	public static int eyeTileX;

	@ObfuscatedName("s.D")
	public static int eyeTileZ;

	@ObfuscatedName("s.E")
	public static int eyeX;

	@ObfuscatedName("s.F")
	public static int eyeY;

	@ObfuscatedName("s.G")
	public static int eyeZ;

	@ObfuscatedName("s.H")
	public static int sinEyePitch;

	@ObfuscatedName("s.I")
	public static int cosEyePitch;

	@ObfuscatedName("s.J")
	public static int sinEyeYaw;

	@ObfuscatedName("s.K")
	public static int cosEyeYaw;

	@ObfuscatedName("s.R")
	public static int mouseX;

	@ObfuscatedName("s.S")
	public static int mouseY;

	@ObfuscatedName("s.Y")
	public static int activeOccluderCount;

	@ObfuscatedName("s.Q")
	public static boolean takingInput;

	public World3D(int[][][] arg0, int arg1, int arg2, int arg4) {
		this.maxLevel = arg4;
		this.maxTileX = arg2;
		this.maxTileZ = arg1;
		this.levelTiles = new Square[arg4][arg2][arg1];
		this.levelTileOcclusionCycles = new int[arg4][arg2 + 1][arg1 + 1];
		this.levelHeightmaps = arg0;

		this.reset();
	}

	@ObfuscatedName("s.a(B)V")
	public static void unload() {
		locBuffer = null;
		levelOccluderCount = null;
		levelOccluders = null;
		drawTileQueue = null;
		visibilityMatrix = null;
		visibilityMap = null;
	}

	@ObfuscatedName("s.a(Z)V")
	public void reset() {
		for (int level = 0; level < this.maxLevel; level++) {
			for (int x = 0; x < this.maxTileX; x++) {
				for (int z = 0; z < this.maxTileZ; z++) {
					this.levelTiles[level][x][z] = null;
				}
			}
		}

		for (int level = 0; level < LEVEL_COUNT; level++) {
			for (int i = 0; i < levelOccluderCount[level]; i++) {
				levelOccluders[level][i] = null;
			}

			levelOccluderCount[level] = 0;
		}

		for (int i = 0; i < this.changedLocCount; i++) {
			this.changedLocs[i] = null;
		}
		this.changedLocCount = 0;

		for (int i = 0; i < locBuffer.length; i++) {
			locBuffer[i] = null;
		}
	}

	@ObfuscatedName("s.a(BI)V")
	public void setMinLevel(int level) {
		this.minLevel = level;

		for (int x = 0; x < this.maxTileX; x++) {
			for (int z = 0; z < this.maxTileZ; z++) {
				this.levelTiles[level][x][z] = new Square(level, x, z);
			}
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void setLinkBelow(int x, int z) {
		Square below = this.levelTiles[0][x][z];

		for (int level = 0; level < 3; level++) {
			this.levelTiles[level][x][z] = this.levelTiles[level + 1][x][z];

			if (this.levelTiles[level][x][z] != null) {
				this.levelTiles[level][x][z].level--;
			}
		}

		if (this.levelTiles[0][x][z] == null) {
			this.levelTiles[0][x][z] = new Square(0, x, z);
		}

		this.levelTiles[0][x][z].linkBelow = below;
		this.levelTiles[3][x][z] = null;
	}

	@ObfuscatedName("s.a(IIIIIIIII)V")
	public static void addOccluder(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg8) {
		Occlude occ = new Occlude();
		occ.minGridX = arg0 / 128;
		occ.maxGridX = arg1 / 128;
		occ.minGridZ = arg4 / 128;
		occ.maxGridZ = arg8 / 128;
		occ.type = arg3;
		occ.minX = arg0;
		occ.maxX = arg1;
		occ.minZ = arg4;
		occ.maxZ = arg8;
		occ.minY = arg2;
		occ.maxY = arg6;
		levelOccluders[arg5][levelOccluderCount[arg5]++] = occ;
	}

	@ObfuscatedName("s.a(IIII)V")
	public void setDrawLevel(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 != null) {
			this.levelTiles[arg0][arg1][arg2].drawLevel = arg3;
		}
	}

	@ObfuscatedName("s.a(IIIIIIIIIIIIIIIIIIII)V")
	public void setTile(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
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
			Ground var25 = new Ground(arg1, arg11, arg2, arg6, arg9, arg10, arg16, arg18, arg3, arg13, arg7, arg17, arg15, arg5, arg12, arg8, arg14, arg19, arg4);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.levelTiles[var26][arg1][arg2] == null) {
					this.levelTiles[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("s.a(IIIIIBLy;I)V")
	public void addGroundDecor(int arg1, int arg2, int arg3, int arg4, byte arg5, ModelSource arg6, int arg7) {
		if (arg6 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.model = arg6;
		var9.x = arg2 * 128 + 64;
		var9.z = arg1 * 128 + 64;
		var9.y = arg7;
		var9.typecode = arg4;
		var9.typecode2 = arg5;
		if (this.levelTiles[arg3][arg2][arg1] == null) {
			this.levelTiles[arg3][arg2][arg1] = new Square(arg3, arg2, arg1);
		}
		this.levelTiles[arg3][arg2][arg1].groundDecor = var9;
	}

	@ObfuscatedName("s.a(BIIIIILy;Ly;Ly;)V")
	public void addGroundObject(int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, ModelSource arg7, ModelSource arg8) {
		GroundObject var11 = new GroundObject();
		var11.top = arg8;
		var11.x = arg2 * 128 + 64;
		var11.z = arg5 * 128 + 64;
		var11.y = arg3;
		var11.typecode = arg1;
		var11.bottom = arg6;
		var11.middle = arg7;
		int var12 = 0;
		Square var13 = this.levelTiles[arg4][arg2][arg5];
		if (var13 != null) {
			for (int var14 = 0; var14 < var13.primaryCount; var14++) {
				if (var13.sprite[var14].model instanceof Model) {
					int var15 = ((Model) var13.sprite[var14].model).objRaise;
					if (var15 > var12) {
						var12 = var15;
					}
				}
			}
		}
		var11.height = var12;
		if (this.levelTiles[arg4][arg2][arg5] == null) {
			this.levelTiles[arg4][arg2][arg5] = new Square(arg4, arg2, arg5);
		}
		this.levelTiles[arg4][arg2][arg5].groundObject = var11;
	}

	@ObfuscatedName("s.a(IBILy;IBIIIILy;)V")
	public void addWall(int arg0, byte arg1, int arg2, ModelSource arg3, int arg4, int arg6, int arg7, int arg8, int arg9, ModelSource arg10) {
		if (arg3 == null && arg10 == null) {
			return;
		}
		Wall var12 = new Wall();
		var12.typecode1 = arg7;
		var12.typecode2 = arg1;
		var12.x = arg4 * 128 + 64;
		var12.z = arg2 * 128 + 64;
		var12.y = arg0;
		var12.model1 = arg3;
		var12.model2 = arg10;
		var12.angle1 = arg9;
		var12.angle2 = arg6;
		for (int var13 = arg8; var13 >= 0; var13--) {
			if (this.levelTiles[var13][arg4][arg2] == null) {
				this.levelTiles[var13][arg4][arg2] = new Square(var13, arg4, arg2);
			}
		}
		this.levelTiles[arg8][arg4][arg2].wall = var12;
	}

	@ObfuscatedName("s.a(IIIIIIBIIILy;I)V")
	public void addDecor(int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, ModelSource arg10, int arg11) {
		if (arg10 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.typecode = arg7;
		var13.typecode2 = arg6;
		var13.x = arg5 * 128 + 64 + arg9;
		var13.z = arg1 * 128 + 64 + arg2;
		var13.y = arg11;
		var13.model = arg10;
		var13.angle1 = arg3;
		var13.angle2 = arg8;
		for (int var15 = arg4; var15 >= 0; var15--) {
			if (this.levelTiles[var15][arg5][arg1] == null) {
				this.levelTiles[var15][arg5][arg1] = new Square(var15, arg5, arg1);
			}
		}
		this.levelTiles[arg4][arg5][arg1].decor = var13;
	}

	@ObfuscatedName("s.a(IILy;IIIIIBII)Z")
	public boolean addLoc(int arg0, int arg1, ModelSource arg2, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
		if (arg2 == null) {
			return true;
		} else {
			int var13 = arg1 * 128 + arg5 * 64;
			int var14 = arg6 * 128 + arg9 * 64;
			return this.addLoc(arg10, arg1, arg6, arg5, arg9, var13, var14, arg4, arg2, arg7, false, arg0, arg8);
		}
	}

	@ObfuscatedName("s.a(IIIIIIZIILy;)Z")
	public boolean addTemporary(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, ModelSource arg9) {
		if (arg9 == null) {
			return true;
		}
		int var11 = arg3 - arg0;
		int var12 = arg1 - arg0;
		int var13 = arg3 + arg0;
		int var14 = arg1 + arg0;
		if (arg6) {
			if (arg2 > 640 && arg2 < 1408) {
				var14 += 128;
			}
			if (arg2 > 1152 && arg2 < 1920) {
				var13 += 128;
			}
			if (arg2 > 1664 || arg2 < 384) {
				var12 -= 128;
			}
			if (arg2 > 128 && arg2 < 896) {
				var11 -= 128;
			}
		}
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		int var18 = var14 / 128;
		return this.addLoc(arg5, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg3, arg1, arg7, arg9, arg2, true, arg4, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIBLy;IIIII)Z")
	public boolean addTemporary(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		return arg7 == null ? true : this.addLoc(arg8, arg1, arg3, arg5 - arg1 + 1, arg2 - arg3 + 1, arg0, arg11, arg9, arg7, arg4, true, arg10, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.maxTileX || var15 >= this.maxTileZ) {
					return false;
				}
				Square var16 = this.levelTiles[arg0][var14][var15];
				if (var16 != null && var16.primaryCount >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.typecode = arg11;
		var17.typecode2 = arg12;
		var17.level = arg0;
		var17.x = arg5;
		var17.z = arg6;
		var17.y = arg7;
		var17.model = arg8;
		var17.angle = arg9;
		var17.minGridX = arg1;
		var17.minGridZ = arg2;
		var17.maxGridX = arg1 + arg3 - 1;
		var17.maxGridZ = arg2 + arg4 - 1;
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
				var22.sprite[var22.primaryCount] = var17;
				var22.primaryExtendDirections[var22.primaryCount] = var20;
				var22.combinedPrimaryExtendDirections |= var20;
				var22.primaryCount++;
			}
		}
		if (arg10) {
			this.changedLocs[this.changedLocCount++] = var17;
		}
		return true;
	}

	@ObfuscatedName("s.a(I)V")
	public void clearLocChanges() {
		for (int var2 = 0; var2 < this.changedLocCount; var2++) {
			Sprite var3 = this.changedLocs[var2];
			this.removeLoc(var3);
			this.changedLocs[var2] = null;
		}
		this.changedLocCount = 0;
	}

	@ObfuscatedName("s.a(Lq;B)V")
	public void removeLoc(Sprite arg0) {
		boolean var3 = false;
		for (int var4 = arg0.minGridX; var4 <= arg0.maxGridX; var4++) {
			for (int var5 = arg0.minGridZ; var5 <= arg0.maxGridZ; var5++) {
				Square var6 = this.levelTiles[arg0.level][var4][var5];
				if (var6 != null) {
					for (int var7 = 0; var7 < var6.primaryCount; var7++) {
						if (var6.sprite[var7] == arg0) {
							var6.primaryCount--;
							for (int var8 = var7; var8 < var6.primaryCount; var8++) {
								var6.sprite[var8] = var6.sprite[var8 + 1];
								var6.primaryExtendDirections[var8] = var6.primaryExtendDirections[var8 + 1];
							}
							var6.sprite[var6.primaryCount] = null;
							break;
						}
					}
					var6.combinedPrimaryExtendDirections = 0;
					for (int var9 = 0; var9 < var6.primaryCount; var9++) {
						var6.combinedPrimaryExtendDirections |= var6.primaryExtendDirections[var9];
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIII)V")
	public void setDecorOffset(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.levelTiles[arg1][arg4][arg0];
		if (var6 == null) {
			return;
		}
		Decor var7 = var6.decor;
        if (var7 != null) {
            int var8 = arg4 * 128 + 64;
            int var9 = arg0 * 128 + 64;
            var7.x = var8 + (var7.x - var8) * arg2 / 16;
            if (arg3 == -23232) {
                var7.z = var9 + (var7.z - var9) * arg2 / 16;
            }
        }
    }

	@ObfuscatedName("s.a(ZIII)V")
	public void removeWall(int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg2][arg3][arg1];
		if (var5 != null) {
			var5.wall = null;
		}
	}

	@ObfuscatedName("s.b(ZIII)V")
	public void removeDecor(int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg2][arg1][arg3];
		if (var5 != null) {
			var5.decor = null;
		}
	}

	@ObfuscatedName("s.a(IZII)V")
	public void removeLoc(int arg0, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg2][arg3][arg0];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.primaryCount; var6++) {
			Sprite var7 = var5.sprite[var6];
			if ((var7.typecode >> 29 & 0x3) == 2 && var7.minGridX == arg3 && var7.minGridZ == arg0) {
				this.removeLoc(var7);
				return;
			}
		}
	}

	@ObfuscatedName("s.b(IIII)V")
	public void removeGroundDecor(int arg0, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg2][arg0][arg3];
		if (var5 != null) {
			var5.groundDecor = null;
		}
	}

	@ObfuscatedName("s.b(III)V")
	public void removeGroundObj(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("s.c(IIII)Lr;")
	public Wall getWall(int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg2][arg3][arg1];
		return var5 == null ? null : var5.wall;
	}

	@ObfuscatedName("s.d(IIII)Li;")
	public Decor getDecor(int arg0, int arg1, int arg2) {
		Square var5 = this.levelTiles[arg1][arg2][arg0];
		return var5 == null ? null : var5.decor;
	}

	@ObfuscatedName("s.a(IIBI)Lq;")
	public Sprite getSprite(int arg0, int arg1, int arg3) {
		Square var5 = this.levelTiles[arg3][arg1][arg0];
		if (var5 == null) {
			return null;
		}
		for (int var7 = 0; var7 < var5.primaryCount; var7++) {
			Sprite var8 = var5.sprite[var7];
			if ((var8.typecode >> 29 & 0x3) == 2 && var8.minGridX == arg1 && var8.minGridZ == arg0) {
				return var8;
			}
		}
		return null;
	}

	@ObfuscatedName("s.e(IIII)Lk;")
	public GroundDecor getGroundDecor(int arg0, int arg1, int arg2) {
		Square var5 = this.levelTiles[arg1][arg2][arg0];
		return var5 == null || var5.groundDecor == null ? null : var5.groundDecor;
	}

	@ObfuscatedName("s.c(III)I")
	public int getWallTypecode(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode1;
	}

	@ObfuscatedName("s.f(IIII)I")
	public int getDecorTypecode(int arg0, int arg1, int arg2) {
		Square var5 = this.levelTiles[arg0][arg1][arg2];
		return var5 == null || var5.decor == null ? 0 : var5.decor.typecode;
	}

	@ObfuscatedName("s.d(III)I")
	public int getLocTypecode(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.primaryCount; var5++) {
			Sprite var6 = var4.sprite[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minGridX == arg1 && var6.minGridZ == arg2) {
				return var6.typecode;
			}
		}
		return 0;
	}

	@ObfuscatedName("s.e(III)I")
	public int getGroundDecorTypecode(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("s.g(IIII)I")
	public int getInfo(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode1 == arg3) {
			return var5.wall.typecode2 & 0xFF;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return var5.decor.typecode2 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return var5.groundDecor.typecode2 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.primaryCount; var6++) {
				if (var5.sprite[var6].typecode == arg3) {
					return var5.sprite[var6].typecode2 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("s.a(ZIIIII)V")
	public void buildModels(int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg2 * arg2 + arg4 * arg4));
		int var8 = arg1 * var7 >> 8;
		for (int var9 = 0; var9 < this.maxLevel; var9++) {
			for (int var10 = 0; var10 < this.maxTileX; var10++) {
				for (int var11 = 0; var11 < this.maxTileZ; var11++) {
					Square var12 = this.levelTiles[var9][var10][var11];
					if (var12 != null) {
						Wall var13 = var12.wall;
						if (var13 != null && var13.model1 != null && var13.model1.vertexNormal != null) {
							this.mergeLocNormals(1, (Model) var13.model1, 1, var11, var9, var10);
							if (var13.model2 != null && var13.model2.vertexNormal != null) {
								this.mergeLocNormals(1, (Model) var13.model2, 1, var11, var9, var10);
								this.mergeNormals((Model) var13.model1, (Model) var13.model2, 0, 0, 0, false);
								((Model) var13.model2).applyLighting(arg3, var8, arg5, arg2, arg4);
							}
							((Model) var13.model1).applyLighting(arg3, var8, arg5, arg2, arg4);
						}
						for (int var14 = 0; var14 < var12.primaryCount; var14++) {
							Sprite var15 = var12.sprite[var14];
							if (var15 != null && var15.model != null && var15.model.vertexNormal != null) {
								this.mergeLocNormals(var15.maxGridX - var15.minGridX + 1, (Model) var15.model, var15.maxGridZ - var15.minGridZ + 1, var11, var9, var10);
								((Model) var15.model).applyLighting(arg3, var8, arg5, arg2, arg4);
							}
						}
						GroundDecor var16 = var12.groundDecor;
						if (var16 != null && var16.model.vertexNormal != null) {
							this.mergeGroundDecorNormals((Model) var16.model, var9, var11, var10);
							((Model) var16.model).applyLighting(arg3, var8, arg5, arg2, arg4);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(ILfb;III)V")
	public void mergeGroundDecorNormals(Model arg1, int arg2, int arg3, int arg4) {
		if (arg4 < this.maxTileX) {
			Square var7 = this.levelTiles[arg2][arg4 + 1][arg3];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg1, (Model) var7.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg3 < this.maxTileX) {
			Square var8 = this.levelTiles[arg2][arg4][arg3 + 1];
			if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg1, (Model) var8.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg4 < this.maxTileX && arg3 < this.maxTileZ) {
			Square var9 = this.levelTiles[arg2][arg4 + 1][arg3 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg1, (Model) var9.groundDecor.model, 128, 0, 128, true);
			}
		}
        if (arg4 < this.maxTileX && arg3 > 0) {
            Square var10 = this.levelTiles[arg2][arg4 + 1][arg3 - 1];
            if (var10 != null && var10.groundDecor != null && var10.groundDecor.model.vertexNormal != null) {
                this.mergeNormals(arg1, (Model) var10.groundDecor.model, 128, 0, -128, true);
            }
        }
    }

	@ObfuscatedName("s.a(ILfb;IZIII)V")
	public void mergeLocNormals(int arg0, Model arg1, int arg2, int arg4, int arg5, int arg6) {
		boolean var8 = true;
		int var9 = arg6;
		int var10 = arg6 + arg0;
		int var11 = arg4 - 1;
		int var12 = arg4 + arg2;
		for (int var13 = arg5; var13 <= arg5 + 1; var13++) {
			if (var13 != this.maxLevel) {
				for (int var14 = var9; var14 <= var10; var14++) {
					if (var14 >= 0 && var14 < this.maxTileX) {
						for (int var15 = var11; var15 <= var12; var15++) {
							if (var15 >= 0 && var15 < this.maxTileZ && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg4 && var14 != arg6)) {
								Square var16 = this.levelTiles[var13][var14][var15];
								if (var16 != null) {
									int var17 = (this.levelHeightmaps[var13][var14][var15] + this.levelHeightmaps[var13][var14 + 1][var15] + this.levelHeightmaps[var13][var14][var15 + 1] + this.levelHeightmaps[var13][var14 + 1][var15 + 1]) / 4 - (this.levelHeightmaps[arg5][arg6][arg4] + this.levelHeightmaps[arg5][arg6 + 1][arg4] + this.levelHeightmaps[arg5][arg6][arg4 + 1] + this.levelHeightmaps[arg5][arg6 + 1][arg4 + 1]) / 4;
									Wall var18 = var16.wall;
									if (var18 != null && var18.model1 != null && var18.model1.vertexNormal != null) {
										this.mergeNormals(arg1, (Model) var18.model1, (var14 - arg6) * 128 + (1 - arg0) * 64, var17, (var15 - arg4) * 128 + (1 - arg2) * 64, var8);
									}
									if (var18 != null && var18.model2 != null && var18.model2.vertexNormal != null) {
										this.mergeNormals(arg1, (Model) var18.model2, (var14 - arg6) * 128 + (1 - arg0) * 64, var17, (var15 - arg4) * 128 + (1 - arg2) * 64, var8);
									}
									for (int var19 = 0; var19 < var16.primaryCount; var19++) {
										Sprite var20 = var16.sprite[var19];
										if (var20 != null && var20.model != null && var20.model.vertexNormal != null) {
											int var21 = var20.maxGridX - var20.minGridX + 1;
											int var22 = var20.maxGridZ - var20.minGridZ + 1;
											this.mergeNormals(arg1, (Model) var20.model, (var20.minGridX - arg6) * 128 + (var21 - arg0) * 64, var17, (var20.minGridZ - arg4) * 128 + (var22 - arg2) * 64, var8);
										}
									}
								}
							}
						}
					}
				}
				var9--;
				var8 = false;
			}
		}
	}

	@ObfuscatedName("s.a(Lfb;Lfb;IIIZ)V")
	public void mergeNormals(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.tmpMergeIndex++;
		int var7 = 0;
		int[] var8 = arg1.vertexX;
		int var9 = arg1.vertexCount;
		for (int var10 = 0; var10 < arg0.vertexCount; var10++) {
			VertexNormal var11 = arg0.vertexNormal[var10];
			VertexNormal var12 = arg0.vertexNormalOriginal[var10];
			if (var12.w != 0) {
				int var13 = arg0.vertexY[var10] - arg3;
				if (var13 <= arg1.maxY) {
					int var14 = arg0.vertexX[var10] - arg2;
					if (var14 >= arg1.minX && var14 <= arg1.maxX) {
						int var15 = arg0.vertexZ[var10] - arg4;
						if (var15 >= arg1.minZ && var15 <= arg1.maxZ) {
							for (int var16 = 0; var16 < var9; var16++) {
								VertexNormal var17 = arg1.vertexNormal[var16];
								VertexNormal var18 = arg1.vertexNormalOriginal[var16];
								if (var14 == var8[var16] && var15 == arg1.vertexZ[var16] && var13 == arg1.vertexY[var16] && var18.w != 0) {
									var11.x += var18.x;
									var11.y += var18.y;
									var11.z += var18.z;
									var11.w += var18.w;
									var17.x += var12.x;
									var17.y += var12.y;
									var17.z += var12.z;
									var17.w += var12.w;
									var7++;
									this.mergeIndexA[var10] = this.tmpMergeIndex;
									this.mergeIndexB[var16] = this.tmpMergeIndex;
								}
							}
						}
					}
				}
			}
		}
        if (var7 >= 3 && arg5) {
            for (int var19 = 0; var19 < arg0.faceCount; var19++) {
                if (this.mergeIndexA[arg0.faceVertexA[var19]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexB[var19]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexC[var19]] == this.tmpMergeIndex) {
                    arg0.faceInfo[var19] = -1;
                }
            }
            for (int var20 = 0; var20 < arg1.faceCount; var20++) {
                if (this.mergeIndexB[arg1.faceVertexA[var20]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexB[var20]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexC[var20]] == this.tmpMergeIndex) {
                    arg1.faceInfo[var20] = -1;
                }
            }
        }
    }

	@ObfuscatedName("s.a([IIIIII)V")
	public void drawMinimapTile(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Square var7 = this.levelTiles[arg3][arg4][arg5];
		if (var7 == null) {
			return;
		}
		QuickGround var8 = var7.quickGround;
		if (var8 != null) {
			int var9 = var8.rgb;
			if (var9 != 0) {
				for (int var10 = 0; var10 < 4; var10++) {
					arg0[arg1] = var9;
					arg0[arg1 + 1] = var9;
					arg0[arg1 + 2] = var9;
					arg0[arg1 + 3] = var9;
					arg1 += arg2;
				}
			}
			return;
		}
		Ground var11 = var7.ground;
        if (var11 != null) {
            int var12 = var11.shape;
            int var13 = var11.angle;
            int var14 = var11.underlayColour;
            int var15 = var11.overlayColour;
            int[] var16 = this.MINIMAP_OVERLAY_SHAPE[var12];
            int[] var17 = this.MINIMAP_OVERLAY_ANGLE[var13];
            int var18 = 0;
            if (var14 != 0) {
                for (int var19 = 0; var19 < 4; var19++) {
                    arg0[arg1] = var16[var17[var18++]] == 0 ? var14 : var15;
                    arg0[arg1 + 1] = var16[var17[var18++]] == 0 ? var14 : var15;
                    arg0[arg1 + 2] = var16[var17[var18++]] == 0 ? var14 : var15;
                    arg0[arg1 + 3] = var16[var17[var18++]] == 0 ? var14 : var15;
                    arg1 += arg2;
                }
            } else {
				for (int var20 = 0; var20 < 4; var20++) {
					if (var16[var17[var18++]] != 0) {
						arg0[arg1] = var15;
					}
					if (var16[var17[var18++]] != 0) {
						arg0[arg1 + 1] = var15;
					}
					if (var16[var17[var18++]] != 0) {
						arg0[arg1 + 2] = var15;
					}
					if (var16[var17[var18++]] != 0) {
						arg0[arg1 + 3] = var15;
					}
					arg1 += arg2;
				}
			}
        }
    }

	@ObfuscatedName("s.a(II[IBII)V")
	public static void init(int arg0, int arg1, int[] arg2, int arg4, int arg5) {
		viewportLeft = 0;
		viewportTop = 0;
		viewportRight = arg1;
		viewportBottom = arg4;
		viewportCenterX = arg1 / 2;
		viewportCenterY = arg4 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];
		for (int var7 = 128; var7 <= 384; var7 += 32) {
			for (int var8 = 0; var8 < 2048; var8 += 64) {
				sinEyePitch = Model.sinTable[var7];
				cosEyePitch = Model.cosTable[var7];
				sinEyeYaw = Model.sinTable[var8];
				cosEyeYaw = Model.cosTable[var8];
				int var9 = (var7 - 128) / 32;
				int var10 = var8 / 64;
				for (int var11 = -26; var11 <= 26; var11++) {
					for (int var12 = -26; var12 <= 26; var12++) {
						int var13 = var11 * 128;
						int var14 = var12 * 128;
						boolean var15 = false;
						for (int var16 = -arg5; var16 <= arg0; var16 += 128) {
							if (testPoint(var14, var13, arg2[var9] + var16)) {
								var15 = true;
								break;
							}
						}
						var6[var9][var10][var11 + 25 + 1][var12 + 25 + 1] = var15;
					}
				}
			}
		}
		for (int var17 = 0; var17 < 8; var17++) {
			for (int var18 = 0; var18 < 32; var18++) {
				for (int var19 = -25; var19 < 25; var19++) {
					for (int var20 = -25; var20 < 25; var20++) {
						boolean var21 = false;
						label80: for (int var22 = -1; var22 <= 1; var22++) {
							for (int var23 = -1; var23 <= 1; var23++) {
								if (var6[var17][var18][var19 + var22 + 25 + 1][var20 + var23 + 25 + 1]) {
									var21 = true;
									break label80;
								}
								if (var6[var17][(var18 + 1) % 31][var19 + var22 + 25 + 1][var20 + var23 + 25 + 1]) {
									var21 = true;
									break label80;
								}
								if (var6[var17 + 1][var18][var19 + var22 + 25 + 1][var20 + var23 + 25 + 1]) {
									var21 = true;
									break label80;
								}
								if (var6[var17 + 1][(var18 + 1) % 31][var19 + var22 + 25 + 1][var20 + var23 + 25 + 1]) {
									var21 = true;
									break label80;
								}
							}
						}
						visibilityMatrix[var17][var18][var19 + 25][var20 + 25] = var21;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.h(IIII)Z")
	public static boolean testPoint(int arg0, int arg2, int arg3) {
		int var4 = arg0 * sinEyeYaw + arg2 * cosEyeYaw >> 16;
		int var5 = arg0 * cosEyeYaw - arg2 * sinEyeYaw >> 16;
		int var6 = arg3 * sinEyePitch + var5 * cosEyePitch >> 16;
		int var7 = arg3 * cosEyePitch - var5 * sinEyePitch >> 16;
		if (var6 >= 50 && var6 <= 3500) {
			int var9 = viewportCenterX + (var4 << 9) / var6;
			int var10 = viewportCenterY + (var7 << 9) / var6;
			return var9 >= viewportLeft && var9 <= viewportRight && var10 >= viewportTop && var10 <= viewportBottom;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.f(III)V")
	public void click(int arg0, int arg1) {
		takingInput = true;
		mouseX = arg0;
		mouseY = arg1;
		clickTileX = -1;
		clickTileZ = -1;
	}

	@ObfuscatedName("s.a(IIIIIII)V")
	public void draw(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.maxTileX * 128) {
			arg2 = this.maxTileX * 128 - 1;
		}
		if (arg5 < 0) {
			arg5 = 0;
		} else if (arg5 >= this.maxTileZ * 128) {
			arg5 = this.maxTileZ * 128 - 1;
		}
		cycle++;
		sinEyePitch = Model.sinTable[arg1];
		cosEyePitch = Model.cosTable[arg1];
		sinEyeYaw = Model.sinTable[arg4];
		cosEyeYaw = Model.cosTable[arg4];
		visibilityMap = visibilityMatrix[(arg1 - 128) / 32][arg4 / 64];
		eyeX = arg2;
		eyeY = arg3;
		eyeZ = arg5;
		eyeTileX = arg2 / 128;
		eyeTileZ = arg5 / 128;
		topLevel = arg6;
		minDrawTileX = eyeTileX - 25;
		if (minDrawTileX < 0) {
			minDrawTileX = 0;
		}
		minDrawTileZ = eyeTileZ - 25;
		if (minDrawTileZ < 0) {
			minDrawTileZ = 0;
		}
		maxDrawTileX = eyeTileX + 25;
		if (maxDrawTileX > this.maxTileX) {
			maxDrawTileX = this.maxTileX;
		}
		maxDrawTileZ = eyeTileZ + 25;
		if (maxDrawTileZ > this.maxTileZ) {
			maxDrawTileZ = this.maxTileZ;
		}
		this.updateActiveOccluders();
		tilesRemaining = 0;
		for (int var8 = this.minLevel; var8 < this.maxLevel; var8++) {
			Square[][] var9 = this.levelTiles[var8];
			for (int var10 = minDrawTileX; var10 < maxDrawTileX; var10++) {
				for (int var11 = minDrawTileZ; var11 < maxDrawTileZ; var11++) {
					Square var12 = var9[var10][var11];
					if (var12 != null) {
						if (var12.drawLevel <= arg6 && (visibilityMap[var10 - eyeTileX + 25][var11 - eyeTileZ + 25] || this.levelHeightmaps[var8][var10][var11] - arg3 >= 2000)) {
							var12.drawFront = true;
							var12.drawBack = true;
							if (var12.primaryCount > 0) {
								var12.drawPrimaries = true;
							} else {
								var12.drawPrimaries = false;
							}
							tilesRemaining++;
						} else {
							var12.drawFront = false;
							var12.drawBack = false;
							var12.cornerSides = 0;
						}
					}
				}
			}
		}
		for (int var13 = this.minLevel; var13 < this.maxLevel; var13++) {
			Square[][] var14 = this.levelTiles[var13];
			for (int var15 = -25; var15 <= 0; var15++) {
				int var16 = eyeTileX + var15;
				int var17 = eyeTileX - var15;
				if (var16 >= minDrawTileX || var17 < maxDrawTileX) {
					for (int var18 = -25; var18 <= 0; var18++) {
						int var19 = eyeTileZ + var18;
						int var20 = eyeTileZ - var18;
						if (var16 >= minDrawTileX) {
							if (var19 >= minDrawTileZ) {
								Square var21 = var14[var16][var19];
								if (var21 != null && var21.drawFront) {
									this.drawTile(var21, true);
								}
							}
							if (var20 < maxDrawTileZ) {
								Square var22 = var14[var16][var20];
								if (var22 != null && var22.drawFront) {
									this.drawTile(var22, true);
								}
							}
						}
						if (var17 < maxDrawTileX) {
							if (var19 >= minDrawTileZ) {
								Square var23 = var14[var17][var19];
								if (var23 != null && var23.drawFront) {
									this.drawTile(var23, true);
								}
							}
							if (var20 < maxDrawTileZ) {
								Square var24 = var14[var17][var20];
								if (var24 != null && var24.drawFront) {
									this.drawTile(var24, true);
								}
							}
						}
						if (tilesRemaining == 0) {
							takingInput = false;
							return;
						}
					}
				}
			}
		}
		for (int var25 = this.minLevel; var25 < this.maxLevel; var25++) {
			Square[][] var26 = this.levelTiles[var25];
			for (int var27 = -25; var27 <= 0; var27++) {
				int var28 = eyeTileX + var27;
				int var29 = eyeTileX - var27;
				if (var28 >= minDrawTileX || var29 < maxDrawTileX) {
					for (int var30 = -25; var30 <= 0; var30++) {
						int var31 = eyeTileZ + var30;
						int var32 = eyeTileZ - var30;
						if (var28 >= minDrawTileX) {
							if (var31 >= minDrawTileZ) {
								Square var33 = var26[var28][var31];
								if (var33 != null && var33.drawFront) {
									this.drawTile(var33, false);
								}
							}
							if (var32 < maxDrawTileZ) {
								Square var34 = var26[var28][var32];
								if (var34 != null && var34.drawFront) {
									this.drawTile(var34, false);
								}
							}
						}
						if (var29 < maxDrawTileX) {
							if (var31 >= minDrawTileZ) {
								Square var35 = var26[var29][var31];
								if (var35 != null && var35.drawFront) {
									this.drawTile(var35, false);
								}
							}
							if (var32 < maxDrawTileZ) {
								Square var36 = var26[var29][var32];
								if (var36 != null && var36.drawFront) {
									this.drawTile(var36, false);
								}
							}
						}
						if (tilesRemaining == 0) {
							takingInput = false;
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lw;Z)V")
	public void drawTile(Square arg0, boolean arg1) {
		drawTileQueue.push(arg0);
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
												var3 = (Square) drawTileQueue.pop();
												if (var3 == null) {
													return;
												}
											} while (!var3.drawBack);
											var4 = var3.x;
											var5 = var3.z;
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
												if (var4 <= eyeTileX && var4 > minDrawTileX) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.drawBack && (var10.drawFront || (var3.combinedPrimaryExtendDirections & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= eyeTileX && var4 < maxDrawTileX - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.drawBack && (var11.drawFront || (var3.combinedPrimaryExtendDirections & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= eyeTileZ && var5 > minDrawTileZ) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.drawBack && (var12.drawFront || (var3.combinedPrimaryExtendDirections & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= eyeTileZ && var5 < maxDrawTileZ - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.drawBack && (var13.drawFront || (var3.combinedPrimaryExtendDirections & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.drawFront = false;
											if (var3.linkBelow != null) {
												Square var14 = var3.linkBelow;
												if (var14.quickGround == null) {
													if (var14.ground != null && !this.tileVisible(0, var4, var5)) {
														this.drawGround(var14.ground, cosEyeYaw, var4, cosEyePitch, sinEyePitch, sinEyeYaw, var5);
													}
												} else if (!this.tileVisible(0, var4, var5)) {
													this.drawQuickGround(var14.quickGround, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var15.x - eyeX, var15.y - eyeY, var15.z - eyeZ, var15.typecode1);
												}
												for (int var16 = 0; var16 < var14.primaryCount; var16++) {
													Sprite var17 = var14.sprite[var16];
													if (var17 != null) {
														var17.model.draw(var17.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var17.x - eyeX, var17.y - eyeY, var17.z - eyeZ, var17.typecode);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !this.tileVisible(var7, var4, var5)) {
													var18 = true;
													this.drawGround(var3.ground, cosEyeYaw, var4, cosEyePitch, sinEyePitch, sinEyeYaw, var5);
												}
											} else if (!this.tileVisible(var7, var4, var5)) {
												var18 = true;
												this.drawQuickGround(var3.quickGround, var7, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.wall;
											Decor var22 = var3.decor;
											if (var21 != null || var22 != null) {
												if (eyeTileX == var4) {
													var19++;
												} else if (eyeTileX < var4) {
													var19 += 2;
												}
												if (eyeTileZ == var5) {
													var19 += 3;
												} else if (eyeTileZ > var5) {
													var19 += 6;
												}
												var20 = FRONT_WALL_TYPES[var19];
												var3.backWallTypes = BACK_WALL_TYPES[var19];
											}
											if (var21 != null) {
												if ((var21.angle1 & DIRECTION_ALLOW_WALL_CORNER_TYPE[var19]) == 0) {
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
												if ((var21.angle1 & var20) != 0 && !this.isTileSideOccluded(var7, var4, var5, var21.angle1)) {
													var21.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var21.x - eyeX, var21.y - eyeY, var21.z - eyeZ, var21.typecode1);
												}
												if ((var21.angle2 & var20) != 0 && !this.isTileSideOccluded(var7, var4, var5, var21.angle2)) {
													var21.model2.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var21.x - eyeX, var21.y - eyeY, var21.z - eyeZ, var21.typecode1);
												}
											}
											if (var22 != null && !this.isTileColumnOccluded(var7, var4, var5, var22.model.minY)) {
												if ((var22.angle1 & var20) != 0) {
													var22.model.draw(var22.angle2, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var22.x - eyeX, var22.y - eyeY, var22.z - eyeZ, var22.typecode);
												} else if ((var22.angle1 & 0x300) != 0) {
													int var23 = var22.x - eyeX;
													int var24 = var22.y - eyeY;
													int var25 = var22.z - eyeZ;
													int var26 = var22.angle2;
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
													if ((var22.angle1 & 0x100) != 0 && var28 < var27) {
														int var29 = var23 + WALL_DECORATION_INSET_X[var26];
														int var30 = var25 + WALL_DECORATION_INSET_Z[var26];
														var22.model.draw(var26 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var29, var24, var30, var22.typecode);
													}
													if ((var22.angle1 & 0x200) != 0 && var28 > var27) {
														int var31 = var23 + WALL_DECORATION_OUTSET_X[var26];
														int var32 = var25 + WALL_DECORATION_OUTSET_Z[var26];
														var22.model.draw(var26 * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var31, var24, var32, var22.typecode);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var33.x - eyeX, var33.y - eyeY, var33.z - eyeZ, var33.typecode);
												}
												GroundObject var34 = var3.groundObject;
												if (var34 != null && var34.height == 0) {
													if (var34.bottom != null) {
														var34.bottom.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.y - eyeY, var34.z - eyeZ, var34.typecode);
													}
													if (var34.middle != null) {
														var34.middle.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.y - eyeY, var34.z - eyeZ, var34.typecode);
													}
													if (var34.top != null) {
														var34.top.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.y - eyeY, var34.z - eyeZ, var34.typecode);
													}
												}
											}
											int var35 = var3.combinedPrimaryExtendDirections;
											if (var35 != 0) {
												if (var4 < eyeTileX && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.drawBack) {
														drawTileQueue.push(var36);
													}
												}
												if (var5 < eyeTileZ && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.drawBack) {
														drawTileQueue.push(var37);
													}
												}
												if (var4 > eyeTileX && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.drawBack) {
														drawTileQueue.push(var38);
													}
												}
												if (var5 > eyeTileZ && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.drawBack) {
														drawTileQueue.push(var39);
													}
												}
											}
											break;
										}
										if (var3.cornerSides != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.primaryCount; var41++) {
												if (var3.sprite[var41].cycle != cycle && (var3.primaryExtendDirections[var41] & var3.cornerSides) == var3.sidesBeforeCorner) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!this.isTileSideOccluded(var7, var4, var5, var42.angle1)) {
													var42.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var42.x - eyeX, var42.y - eyeY, var42.z - eyeZ, var42.typecode1);
												}
												var3.cornerSides = 0;
											}
										}
										if (!var3.drawPrimaries) {
											break;
										}
										int var43 = var3.primaryCount;
										var3.drawPrimaries = false;
										int var44 = 0;
										label551: for (int var45 = 0; var45 < var43; var45++) {
											Sprite var46 = var3.sprite[var45];
											if (var46.cycle != cycle) {
												for (int var47 = var46.minGridX; var47 <= var46.maxGridX; var47++) {
													for (int var48 = var46.minGridZ; var48 <= var46.maxGridZ; var48++) {
														Square var49 = var8[var47][var48];
														if (var49.drawFront) {
															var3.drawPrimaries = true;
															continue label551;
														}
														if (var49.cornerSides != 0) {
															int var50 = 0;
															if (var47 > var46.minGridX) {
																var50++;
															}
															if (var47 < var46.maxGridX) {
																var50 += 4;
															}
															if (var48 > var46.minGridZ) {
																var50 += 8;
															}
															if (var48 < var46.maxGridZ) {
																var50 += 2;
															}
															if ((var50 & var49.cornerSides) == var3.sidesAfterCorner) {
																var3.drawPrimaries = true;
																continue label551;
															}
														}
													}
												}
												locBuffer[var44++] = var46;
												int var51 = eyeTileX - var46.minGridX;
												int var52 = var46.maxGridX - eyeTileX;
												if (var52 > var51) {
													var51 = var52;
												}
												int var53 = eyeTileZ - var46.minGridZ;
												int var54 = var46.maxGridZ - eyeTileZ;
												if (var54 > var53) {
													var46.distance = var51 + var54;
												} else {
													var46.distance = var51 + var53;
												}
											}
										}
										while (var44 > 0) {
											int var55 = -50;
											int var56 = -1;
											for (int var57 = 0; var57 < var44; var57++) {
												Sprite var58 = locBuffer[var57];
												if (var58.distance > var55 && var58.cycle != cycle) {
													var55 = var58.distance;
													var56 = var57;
												}
											}
											if (var56 == -1) {
												break;
											}
											Sprite var59 = locBuffer[var56];
											var59.cycle = cycle;
											if (!this.locVisible(var7, var59.minGridX, var59.maxGridX, var59.minGridZ, var59.maxGridZ, var59.model.minY)) {
												var59.model.draw(var59.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var59.x - eyeX, var59.y - eyeY, var59.z - eyeZ, var59.typecode);
											}
											for (int var60 = var59.minGridX; var60 <= var59.maxGridX; var60++) {
												for (int var61 = var59.minGridZ; var61 <= var59.maxGridZ; var61++) {
													Square var62 = var8[var60][var61];
													if (var62.cornerSides != 0) {
														drawTileQueue.push(var62);
													} else if ((var60 != var4 || var61 != var5) && var62.drawBack) {
														drawTileQueue.push(var62);
													}
												}
											}
										}
										if (!var3.drawPrimaries) {
											break;
										}
									}
								} while (!var3.drawBack);
							} while (var3.cornerSides != 0);
							if (var4 > eyeTileX || var4 <= minDrawTileX) {
								break;
							}
							var63 = var8[var4 - 1][var5];
						} while (var63 != null && var63.drawBack);
						if (var4 < eyeTileX || var4 >= maxDrawTileX - 1) {
							break;
						}
						var64 = var8[var4 + 1][var5];
					} while (var64 != null && var64.drawBack);
					if (var5 > eyeTileZ || var5 <= minDrawTileZ) {
						break;
					}
					var65 = var8[var4][var5 - 1];
				} while (var65 != null && var65.drawBack);
				if (var5 < eyeTileZ || var5 >= maxDrawTileZ - 1) {
					break;
				}
				var66 = var8[var4][var5 + 1];
			} while (var66 != null && var66.drawBack);
			var3.drawBack = false;
			tilesRemaining--;
			GroundObject var67 = var3.groundObject;
			if (var67 != null && var67.height != 0) {
				if (var67.bottom != null) {
					var67.bottom.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var67.x - eyeX, var67.y - eyeY - var67.height, var67.z - eyeZ, var67.typecode);
				}
				if (var67.middle != null) {
					var67.middle.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var67.x - eyeX, var67.y - eyeY - var67.height, var67.z - eyeZ, var67.typecode);
				}
				if (var67.top != null) {
					var67.top.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var67.x - eyeX, var67.y - eyeY - var67.height, var67.z - eyeZ, var67.typecode);
				}
			}
			if (var3.backWallTypes != 0) {
				Decor var68 = var3.decor;
				if (var68 != null && !this.isTileColumnOccluded(var7, var4, var5, var68.model.minY)) {
					if ((var68.angle1 & var3.backWallTypes) != 0) {
						var68.model.draw(var68.angle2, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var68.x - eyeX, var68.y - eyeY, var68.z - eyeZ, var68.typecode);
					} else if ((var68.angle1 & 0x300) != 0) {
						int var69 = var68.x - eyeX;
						int var70 = var68.y - eyeY;
						int var71 = var68.z - eyeZ;
						int var72 = var68.angle2;
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
						if ((var68.angle1 & 0x100) != 0 && var74 >= var73) {
							int var75 = var69 + WALL_DECORATION_INSET_X[var72];
							int var76 = var71 + WALL_DECORATION_INSET_Z[var72];
							var68.model.draw(var72 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var75, var70, var76, var68.typecode);
						}
						if ((var68.angle1 & 0x200) != 0 && var74 <= var73) {
							int var77 = var69 + WALL_DECORATION_OUTSET_X[var72];
							int var78 = var71 + WALL_DECORATION_OUTSET_Z[var72];
							var68.model.draw(var72 * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var77, var70, var78, var68.typecode);
						}
					}
				}
				Wall var79 = var3.wall;
				if (var79 != null) {
					if ((var79.angle2 & var3.backWallTypes) != 0 && !this.isTileSideOccluded(var7, var4, var5, var79.angle2)) {
						var79.model2.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var79.x - eyeX, var79.y - eyeY, var79.z - eyeZ, var79.typecode1);
					}
					if ((var79.angle1 & var3.backWallTypes) != 0 && !this.isTileSideOccluded(var7, var4, var5, var79.angle1)) {
						var79.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var79.x - eyeX, var79.y - eyeY, var79.z - eyeZ, var79.typecode1);
					}
				}
			}
			if (var6 < this.maxLevel - 1) {
				Square var80 = this.levelTiles[var6 + 1][var4][var5];
				if (var80 != null && var80.drawBack) {
					drawTileQueue.push(var80);
				}
			}
			if (var4 < eyeTileX) {
				Square var81 = var8[var4 + 1][var5];
				if (var81 != null && var81.drawBack) {
					drawTileQueue.push(var81);
				}
			}
			if (var5 < eyeTileZ) {
				Square var82 = var8[var4][var5 + 1];
				if (var82 != null && var82.drawBack) {
					drawTileQueue.push(var82);
				}
			}
			if (var4 > eyeTileX) {
				Square var83 = var8[var4 - 1][var5];
				if (var83 != null && var83.drawBack) {
					drawTileQueue.push(var83);
				}
			}
			if (var5 > eyeTileZ) {
				Square var84 = var8[var4][var5 - 1];
				if (var84 != null && var84.drawBack) {
					drawTileQueue.push(var84);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void drawQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - eyeX;
		int var11;
		int var12 = var11 = (arg7 << 7) - eyeZ;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.levelHeightmaps[arg1][arg6][arg7] - eyeY;
		int var18 = this.levelHeightmaps[arg1][arg6 + 1][arg7] - eyeY;
		int var19 = this.levelHeightmaps[arg1][arg6 + 1][arg7 + 1] - eyeY;
		int var20 = this.levelHeightmaps[arg1][arg6][arg7 + 1] - eyeY;
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
		int var45 = Pix3D.centerX + (var21 << 9) / var25;
		int var46 = Pix3D.centerY + (var24 << 9) / var25;
		int var47 = Pix3D.centerX + (var27 << 9) / var31;
		int var48 = Pix3D.centerY + (var30 << 9) / var31;
		int var49 = Pix3D.centerX + (var33 << 9) / var37;
		int var50 = Pix3D.centerY + (var36 << 9) / var37;
		int var51 = Pix3D.centerX + (var39 << 9) / var43;
		int var52 = Pix3D.centerY + (var42 << 9) / var43;
		Pix3D.trans = 0;
		if ((var49 - var51) * (var48 - var52) - (var50 - var52) * (var47 - var51) > 0) {
			Pix3D.hclip = false;
			if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.safeWidth || var51 > Pix2D.safeWidth || var47 > Pix2D.safeWidth) {
				Pix3D.hclip = true;
			}
			if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var50, var52, var48, var49, var51, var47)) {
				clickTileX = arg6;
				clickTileZ = arg7;
			}
			if (arg0.textureId == -1) {
				if (arg0.neColour != 12345678) {
					Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.field261, arg0.field259);
				}
			} else if (lowMem) {
				int var53 = TEXTURE_HSL[arg0.textureId];
				Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, this.mulLightness(var53, arg0.neColour), this.mulLightness(var53, arg0.field261), this.mulLightness(var53, arg0.field259));
			} else if (arg0.field263) {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.field261, arg0.field259, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
			} else {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.field261, arg0.field259, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.textureId);
			}
		}
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
            Pix3D.hclip = false;
            if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.safeWidth || var47 > Pix2D.safeWidth || var51 > Pix2D.safeWidth) {
                Pix3D.hclip = true;
            }
            if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var46, var48, var52, var45, var47, var51)) {
                clickTileX = arg6;
                clickTileZ = arg7;
            }
            if (arg0.textureId != -1) {
                if (!lowMem) {
                    Pix3D.textureTriangle(var46, var48, var52, var45, var47, var51, arg0.field258, arg0.field259, arg0.field261, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
                    return;
                }
                int var54 = TEXTURE_HSL[arg0.textureId];
                Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, this.mulLightness(var54, arg0.field258), this.mulLightness(var54, arg0.field259), this.mulLightness(var54, arg0.field261));
            } else if (arg0.field258 != 12345678) {
                Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, arg0.field258, arg0.field259, arg0.field261);
            }
        }
    }

	@ObfuscatedName("s.a(Lj;IBIIIII)V")
	public void drawGround(Ground arg0, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var11 = arg0.vertexX.length;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = arg0.vertexX[var12] - eyeX;
			int var14 = arg0.vertexY[var12] - eyeY;
			int var15 = arg0.vertexZ[var12] - eyeZ;
			int var16 = var15 * arg6 + var13 * arg1 >> 16;
			int var17 = var15 * arg1 - var13 * arg6 >> 16;
			int var19 = var14 * arg4 - var17 * arg5 >> 16;
			int var20 = var14 * arg5 + var17 * arg4 >> 16;
			if (var20 < 50) {
				return;
			}
			if (arg0.triangleTexture != null) {
				Ground.drawTextureVertexX[var12] = var16;
				Ground.drawTextureVertexY[var12] = var19;
				Ground.drawTextureVertexZ[var12] = var20;
			}
			Ground.drawVertexX[var12] = Pix3D.centerX + (var16 << 9) / var20;
			Ground.drawVertexY[var12] = Pix3D.centerY + (var19 << 9) / var20;
		}
		Pix3D.trans = 0;
		int var22 = arg0.triangleVertexA.length;
		for (int var23 = 0; var23 < var22; var23++) {
			int var24 = arg0.triangleVertexA[var23];
			int var25 = arg0.triangleVertexB[var23];
			int var26 = arg0.triangleVertexC[var23];
			int var27 = Ground.drawVertexX[var24];
			int var28 = Ground.drawVertexX[var25];
			int var29 = Ground.drawVertexX[var26];
			int var30 = Ground.drawVertexY[var24];
			int var31 = Ground.drawVertexY[var25];
			int var32 = Ground.drawVertexY[var26];
			if ((var27 - var28) * (var32 - var31) - (var30 - var31) * (var29 - var28) > 0) {
				Pix3D.hclip = false;
				if (var27 < 0 || var28 < 0 || var29 < 0 || var27 > Pix2D.safeWidth || var28 > Pix2D.safeWidth || var29 > Pix2D.safeWidth) {
					Pix3D.hclip = true;
				}
				if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var30, var31, var32, var27, var28, var29)) {
					clickTileX = arg3;
					clickTileZ = arg7;
				}
				if (arg0.triangleTexture == null || arg0.triangleTexture[var23] == -1) {
					if (arg0.triangleColourA[var23] != 12345678) {
						Pix3D.gouraudTriangle(var30, var31, var32, var27, var28, var29, arg0.triangleColourA[var23], arg0.triangleColourB[var23], arg0.triangleColourC[var23]);
					}
				} else if (lowMem) {
					int var33 = TEXTURE_HSL[arg0.triangleTexture[var23]];
					Pix3D.gouraudTriangle(var30, var31, var32, var27, var28, var29, this.mulLightness(var33, arg0.triangleColourA[var23]), this.mulLightness(var33, arg0.triangleColourB[var23]), this.mulLightness(var33, arg0.triangleColourC[var23]));
				} else if (arg0.flat) {
					Pix3D.textureTriangle(var30, var31, var32, var27, var28, var29, arg0.triangleColourA[var23], arg0.triangleColourB[var23], arg0.triangleColourC[var23], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg0.triangleTexture[var23]);
				} else {
					Pix3D.textureTriangle(var30, var31, var32, var27, var28, var29, arg0.triangleColourA[var23], arg0.triangleColourB[var23], arg0.triangleColourC[var23], Ground.drawTextureVertexX[var24], Ground.drawTextureVertexX[var25], Ground.drawTextureVertexX[var26], Ground.drawTextureVertexY[var24], Ground.drawTextureVertexY[var25], Ground.drawTextureVertexY[var26], Ground.drawTextureVertexZ[var24], Ground.drawTextureVertexZ[var25], Ground.drawTextureVertexZ[var26], arg0.triangleTexture[var23]);
				}
			}
		}
	}

	@ObfuscatedName("s.a(ZII)I")
	public int mulLightness(int arg1, int arg2) {
		int var4 = 127 - arg2;
		int var5 = var4 * (arg1 & 0x7F) / 160;
		if (var5 < 2) {
			var5 = 2;
		} else if (var5 > 126) {
			var5 = 126;
		}
		return (arg1 & 0xFF80) + var5;
	}

	@ObfuscatedName("s.a(IIIIIIII)Z")
	public boolean pointInsideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("s.b(I)V")
	public void updateActiveOccluders() {
		int var2 = levelOccluderCount[topLevel];
		Occlude[] var3 = levelOccluders[topLevel];
		activeOccluderCount = 0;
		for (int var4 = 0; var4 < var2; var4++) {
			Occlude var5 = var3[var4];
			if (var5.type == 1) {
				int var6 = var5.minGridX - eyeTileX + 25;
				if (var6 >= 0 && var6 <= 50) {
					int var7 = var5.minGridZ - eyeTileZ + 25;
					if (var7 < 0) {
						var7 = 0;
					}
					int var8 = var5.maxGridZ - eyeTileZ + 25;
					if (var8 > 50) {
						var8 = 50;
					}
					boolean var9 = false;
					while (var7 <= var8) {
						if (visibilityMap[var6][var7++]) {
							var9 = true;
							break;
						}
					}
					if (var9) {
						int var10 = eyeX - var5.minX;
						if (var10 > 32) {
							var5.mode = 1;
						} else {
							if (var10 >= -32) {
								continue;
							}
							var5.mode = 2;
							var10 = -var10;
						}
						var5.minDeltaZ = (var5.minZ - eyeZ << 8) / var10;
						var5.maxDeltaZ = (var5.maxZ - eyeZ << 8) / var10;
						var5.minDeltaY = (var5.minY - eyeY << 8) / var10;
						var5.maxDeltaY = (var5.maxY - eyeY << 8) / var10;
						activeOccluders[activeOccluderCount++] = var5;
					}
				}
			} else if (var5.type == 2) {
				int var11 = var5.minGridZ - eyeTileZ + 25;
				if (var11 >= 0 && var11 <= 50) {
					int var12 = var5.minGridX - eyeTileX + 25;
					if (var12 < 0) {
						var12 = 0;
					}
					int var13 = var5.maxGridX - eyeTileX + 25;
					if (var13 > 50) {
						var13 = 50;
					}
					boolean var14 = false;
					while (var12 <= var13) {
						if (visibilityMap[var12++][var11]) {
							var14 = true;
							break;
						}
					}
					if (var14) {
						int var15 = eyeZ - var5.minZ;
						if (var15 > 32) {
							var5.mode = 3;
						} else {
							if (var15 >= -32) {
								continue;
							}
							var5.mode = 4;
							var15 = -var15;
						}
						var5.minDeltaX = (var5.minX - eyeX << 8) / var15;
						var5.maxDeltaX = (var5.maxX - eyeX << 8) / var15;
						var5.minDeltaY = (var5.minY - eyeY << 8) / var15;
						var5.maxDeltaY = (var5.maxY - eyeY << 8) / var15;
						activeOccluders[activeOccluderCount++] = var5;
					}
				}
			} else if (var5.type == 4) {
				int var16 = var5.minY - eyeY;
				if (var16 > 128) {
					int var17 = var5.minGridZ - eyeTileZ + 25;
					if (var17 < 0) {
						var17 = 0;
					}
					int var18 = var5.maxGridZ - eyeTileZ + 25;
					if (var18 > 50) {
						var18 = 50;
					}
					if (var17 <= var18) {
						int var19 = var5.minGridX - eyeTileX + 25;
						if (var19 < 0) {
							var19 = 0;
						}
						int var20 = var5.maxGridX - eyeTileX + 25;
						if (var20 > 50) {
							var20 = 50;
						}
						boolean var21 = false;
						label151: for (int var22 = var19; var22 <= var20; var22++) {
							for (int var23 = var17; var23 <= var18; var23++) {
								if (visibilityMap[var22][var23]) {
									var21 = true;
									break label151;
								}
							}
						}
						if (var21) {
							var5.mode = 5;
							var5.minDeltaX = (var5.minX - eyeX << 8) / var16;
							var5.maxDeltaX = (var5.maxX - eyeX << 8) / var16;
							var5.minDeltaZ = (var5.minZ - eyeZ << 8) / var16;
							var5.maxDeltaZ = (var5.maxZ - eyeZ << 8) / var16;
							activeOccluders[activeOccluderCount++] = var5;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.g(III)Z")
	public boolean tileVisible(int arg0, int arg1, int arg2) {
		int var4 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
		if (var4 == -cycle) {
			return false;
		} else if (var4 == cycle) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.levelTileOcclusionCycles[arg0][arg1][arg2] = cycle;
				return true;
			} else {
				this.levelTileOcclusionCycles[arg0][arg1][arg2] = -cycle;
				return false;
			}
		}
	}

	@ObfuscatedName("s.i(IIII)Z")
	public boolean isTileSideOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!this.tileVisible(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.levelHeightmaps[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > eyeX) {
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
				if (var6 < eyeZ) {
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
				if (var5 < eyeX) {
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
				if (var6 > eyeZ) {
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
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("s.j(IIII)Z")
	public boolean isTileColumnOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (this.tileVisible(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.a(IIIIII)Z")
	public boolean locVisible(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.levelTileOcclusionCycles[arg0][var9][var10] == -cycle) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.levelHeightmaps[arg0][arg1][arg3] - arg5;
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
		} else if (this.tileVisible(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.occluded(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.occluded(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.h(III)Z")
	public boolean occluded(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < activeOccluderCount; var4++) {
			Occlude var5 = activeOccluders[var4];
			if (var5.mode == 1) {
				int var6 = var5.minX - arg0;
				if (var6 > 0) {
					int var7 = var5.minZ + (var5.minDeltaZ * var6 >> 8);
					int var8 = var5.maxZ + (var5.maxDeltaZ * var6 >> 8);
					int var9 = var5.minY + (var5.minDeltaY * var6 >> 8);
					int var10 = var5.maxY + (var5.maxDeltaY * var6 >> 8);
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.mode == 2) {
				int var11 = arg0 - var5.minX;
				if (var11 > 0) {
					int var12 = var5.minZ + (var5.minDeltaZ * var11 >> 8);
					int var13 = var5.maxZ + (var5.maxDeltaZ * var11 >> 8);
					int var14 = var5.minY + (var5.minDeltaY * var11 >> 8);
					int var15 = var5.maxY + (var5.maxDeltaY * var11 >> 8);
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.mode == 3) {
				int var16 = var5.minZ - arg2;
				if (var16 > 0) {
					int var17 = var5.minX + (var5.minDeltaX * var16 >> 8);
					int var18 = var5.maxX + (var5.maxDeltaX * var16 >> 8);
					int var19 = var5.minY + (var5.minDeltaY * var16 >> 8);
					int var20 = var5.maxY + (var5.maxDeltaY * var16 >> 8);
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.mode == 4) {
				int var21 = arg2 - var5.minZ;
				if (var21 > 0) {
					int var22 = var5.minX + (var5.minDeltaX * var21 >> 8);
					int var23 = var5.maxX + (var5.maxDeltaX * var21 >> 8);
					int var24 = var5.minY + (var5.minDeltaY * var21 >> 8);
					int var25 = var5.maxY + (var5.maxDeltaY * var21 >> 8);
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.mode == 5) {
				int var26 = arg1 - var5.minY;
				if (var26 > 0) {
					int var27 = var5.minX + (var5.minDeltaX * var26 >> 8);
					int var28 = var5.maxX + (var5.maxDeltaX * var26 >> 8);
					int var29 = var5.minZ + (var5.minDeltaZ * var26 >> 8);
					int var30 = var5.maxZ + (var5.maxDeltaZ * var26 >> 8);
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
