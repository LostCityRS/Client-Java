package jagex2.dash3d;

import deob.*;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

@ObfuscatedName("s")
public class World3D {

	@ObfuscatedName("s.g")
	public static boolean lowMem = true;

	@ObfuscatedName("s.h")
	public int maxLevel;

	@ObfuscatedName("s.i")
	public int maxTileX;

	@ObfuscatedName("s.j")
	public int maxTileZ;

	@ObfuscatedName("s.k")
	public int[][][] levelHeightmaps;

	@ObfuscatedName("s.l")
	public Square[][][] levelTiles;

	@ObfuscatedName("s.m")
	public int minLevel;

	@ObfuscatedName("s.n")
	public int changedLocCount;

	@ObfuscatedName("s.o")
	public Sprite[] changedLocs = new Sprite[5000];

	@ObfuscatedName("s.p")
	public int[][][] levelTileOcclusionCycles;

	@ObfuscatedName("s.q")
	public static int tilesRemaining;

	@ObfuscatedName("s.r")
	public static int topLevel;

	@ObfuscatedName("s.s")
	public static int cycle;

	@ObfuscatedName("s.t")
	public static int minDrawTileX;

	@ObfuscatedName("s.u")
	public static int maxDrawTileX;

	@ObfuscatedName("s.v")
	public static int minDrawTileZ;

	@ObfuscatedName("s.w")
	public static int maxDrawTileZ;

	@ObfuscatedName("s.x")
	public static int eyeTileX;

	@ObfuscatedName("s.y")
	public static int eyeTileZ;

	@ObfuscatedName("s.z")
	public static int eyeX;

	@ObfuscatedName("s.ab")
	public static final int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.bb")
	public static final int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.cb")
	public static final int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("s.db")
	public static final int[] TEXTURE_HSL = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("s.eb")
	public int[] mergeIndexA = new int[10000];

	@ObfuscatedName("s.fb")
	public int[] mergeIndexB = new int[10000];

	@ObfuscatedName("s.gb")
	public int tmpMergeIndex;

	@ObfuscatedName("s.hb")
	public int[][] MINIMAP_OVERLAY_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("s.ib")
	public int[][] MINIMAP_OVERLAY_ANGLE = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("s.jb")
	public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

	@ObfuscatedName("s.kb")
	public static boolean[][] visibilityMap;

	@ObfuscatedName("s.lb")
	public static int viewportCenterX;

	@ObfuscatedName("s.mb")
	public static int viewportCenterY;

	@ObfuscatedName("s.nb")
	public static int viewportLeft;

	@ObfuscatedName("s.ob")
	public static int viewportTop;

	@ObfuscatedName("s.pb")
	public static int viewportRight;

	@ObfuscatedName("s.qb")
	public static int viewportBottom;

	@ObfuscatedName("s.G")
	public static Sprite[] locBuffer = new Sprite[100];

	@ObfuscatedName("s.H")
	public static final int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("s.I")
	public static final int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("s.J")
	public static final int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("s.K")
	public static final int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("s.O")
	public static int clickTileX = -1;

	@ObfuscatedName("s.P")
	public static int clickTileZ = -1;

	@ObfuscatedName("s.Q")
	public static int field331 = 4;

	@ObfuscatedName("s.R")
	public static int[] levelOccluderCunt = new int[field331];

	@ObfuscatedName("s.S")
	public static Occlude[][] levelOccluders = new Occlude[field331][500];

	@ObfuscatedName("s.U")
	public static Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("s.V")
	public static LinkList drawTileQueue = new LinkList();

	@ObfuscatedName("s.W")
	public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("s.X")
	public static final int[] DIRECTION_ALLOW_WALL_CORNER_TYPE = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("s.Y")
	public static final int[] BACK_WALL_TYPES = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("s.Z")
	public static final int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("s.A")
	public static int eyeY;

	@ObfuscatedName("s.B")
	public static int eyeZ;

	@ObfuscatedName("s.C")
	public static int sinEyePitch;

	@ObfuscatedName("s.D")
	public static int cosEyePitch;

	@ObfuscatedName("s.E")
	public static int sinEyeYaw;

	@ObfuscatedName("s.F")
	public static int cosEyeYaw;

	@ObfuscatedName("s.M")
	public static int mouseX;

	@ObfuscatedName("s.N")
	public static int mouseY;

	@ObfuscatedName("s.T")
	public static int activeOccluderCount;

	@ObfuscatedName("s.L")
	public static boolean takingInput;

	public World3D(int arg0, int[][][] arg1, int arg2, int arg3) {
		this.maxLevel = arg3;
		this.maxTileX = arg2;
		this.maxTileZ = arg0;
		this.levelTiles = new Square[arg3][arg2][arg0];
		this.levelTileOcclusionCycles = new int[arg3][arg2 + 1][arg0 + 1];
		this.levelHeightmaps = arg1;
		this.reset();
	}

	@ObfuscatedName("s.a(B)V")
	public static void unload() {
		locBuffer = null;
		levelOccluderCunt = null;
		levelOccluders = null;
		drawTileQueue = null;
		visibilityMatrix = null;
		visibilityMap = null;
	}

	@ObfuscatedName("s.a(I)V")
	public void reset() {
		for (int var2 = 0; var2 < this.maxLevel; var2++) {
			for (int var8 = 0; var8 < this.maxTileX; var8++) {
				for (int var9 = 0; var9 < this.maxTileZ; var9++) {
					this.levelTiles[var2][var8][var9] = null;
				}
			}
		}
		for (int var3 = 0; var3 < field331; var3++) {
			for (int var7 = 0; var7 < levelOccluderCunt[var3]; var7++) {
				levelOccluders[var3][var7] = null;
			}
			levelOccluderCunt[var3] = 0;
		}
		for (int var4 = 0; var4 < this.changedLocCount; var4++) {
			this.changedLocs[var4] = null;
		}
		this.changedLocCount = 0;
		for (int var6 = 0; var6 < locBuffer.length; var6++) {
			locBuffer[var6] = null;
		}
	}

	@ObfuscatedName("s.a(II)V")
	public void setMinLevel(int arg1) {
		this.minLevel = arg1;
		for (int var3 = 0; var3 < this.maxTileX; var3++) {
			for (int var5 = 0; var5 < this.maxTileZ; var5++) {
				this.levelTiles[arg1][var3][var5] = new Square(arg1, var3, var5);
			}
		}
	}

	@ObfuscatedName("s.a(ZII)V")
	public void setBridge(int arg1, int arg2) {
		Square var4 = this.levelTiles[0][arg2][arg1];
		for (int var5 = 0; var5 < 3; var5++) {
			this.levelTiles[var5][arg2][arg1] = this.levelTiles[var5 + 1][arg2][arg1];
			if (this.levelTiles[var5][arg2][arg1] != null) {
				this.levelTiles[var5][arg2][arg1].level--;
			}
		}
		if (this.levelTiles[0][arg2][arg1] == null) {
			this.levelTiles[0][arg2][arg1] = new Square(0, arg2, arg1);
		}
		this.levelTiles[0][arg2][arg1].linkedSquare = var4;
		this.levelTiles[3][arg2][arg1] = null;
	}

	@ObfuscatedName("s.a(IIIIIIBII)V")
	public static void addOccluder(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7, int arg8) {
		Occlude var9 = new Occlude();
		var9.minGridX = arg0 / 128;
		var9.maxGridX = arg5 / 128;
		var9.minGridZ = arg8 / 128;
		var9.maxGridZ = arg3 / 128;
		var9.type = arg1;
		var9.minX = arg0;
		var9.maxX = arg5;
		var9.minZ = arg8;
		var9.maxZ = arg3;
		var9.minY = arg7;
		var9.maxY = arg2;
		levelOccluders[arg4][levelOccluderCunt[arg4]++] = var9;
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
			Ground var25 = new Ground(arg13, arg8, arg19, arg18, arg3, arg6, arg5, arg11, arg4, arg14, arg16, arg1, arg9, arg17, arg2, arg12, arg15, arg10, arg7);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.levelTiles[var26][arg1][arg2] == null) {
					this.levelTiles[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("s.a(IIIIIILy;B)V")
	public void addGroundDecor(int arg0, int arg1, int arg2, int arg4, int arg5, ModelSource arg6, byte arg7) {
		if (arg6 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.model = arg6;
		var9.x = arg2 * 128 + 64;
		var9.z = arg0 * 128 + 64;
		var9.y = arg5;
		var9.typecode = arg4;
		var9.typecode2 = arg7;
		if (this.levelTiles[arg1][arg2][arg0] == null) {
			this.levelTiles[arg1][arg2][arg0] = new Square(arg1, arg2, arg0);
		}
		this.levelTiles[arg1][arg2][arg0].groundDecor = var9;
	}

	@ObfuscatedName("s.a(IZIIILy;Ly;ILy;)V")
	public void addGroundObject(int arg0, int arg2, int arg3, int arg4, ModelSource arg5, ModelSource arg6, int arg7, ModelSource arg8) {
		GroundObject var10 = new GroundObject();
		var10.top = arg6;
		var10.x = arg3 * 128 + 64;
		var10.z = arg4 * 128 + 64;
		var10.y = arg2;
		var10.typecode = arg0;
		var10.bottom = arg8;
		var10.middle = arg5;
		int var11 = 0;
		Square var12 = this.levelTiles[arg7][arg3][arg4];
		if (var12 != null) {
			for (int var14 = 0; var14 < var12.primaryCount; var14++) {
				if (var12.sprite[var14].model instanceof Model) {
					int var15 = ((Model) var12.sprite[var14].model).objRaise;
					if (var15 > var11) {
						var11 = var15;
					}
				}
			}
		}
		var10.height = var11;
		if (this.levelTiles[arg7][arg3][arg4] == null) {
			this.levelTiles[arg7][arg3][arg4] = new Square(arg7, arg3, arg4);
		}
		this.levelTiles[arg7][arg3][arg4].groundObject = var10;
	}

	@ObfuscatedName("s.a(IIIIZIILy;Ly;BI)V")
	public void addWall(int tileX, int typecode1, int arg2, int angle2, int angle1, int y, ModelSource model2, ModelSource model1, byte typecode2, int tileZ) {
		if (model1 == null && model2 == null) {
			return;
		}

		Wall wall = new Wall();
		wall.typecode1 = typecode1;
		wall.typecode2 = typecode2;
		wall.x = tileX * 128 + 64;
		wall.z = tileZ * 128 + 64;
		wall.y = y;
		wall.model1 = model1;
		wall.model2 = model2;
		wall.angle1 = angle1;
		wall.angle2 = angle2;

		for (int i = arg2; i >= 0; i--) {
			if (this.levelTiles[i][tileX][tileZ] == null) {
				this.levelTiles[i][tileX][tileZ] = new Square(i, tileX, tileZ);
			}
		}

		this.levelTiles[arg2][tileX][tileZ].wall = wall;
	}

	@ObfuscatedName("s.a(BLy;IIIIIIIIII)V")
	public void addDecor(byte typecode2, ModelSource model, int xOffset, int x, int z, int angle1, int zOffset, int angle2, int level, int y, int typecode) {
		if (model == null) {
			return;
		}
		Decor decor = new Decor();
		decor.typecode = typecode;
		decor.typecode2 = typecode2;
		decor.x = x * 128 + 64 + xOffset;
		decor.z = z * 128 + 64 + zOffset;
		decor.y = y;
		decor.model = model;
		decor.angle1 = angle1;
		decor.angle2 = angle2;
		for (int l = level; l >= 0; l--) {
			if (this.levelTiles[l][x][z] == null) {
				this.levelTiles[l][x][z] = new Square(l, x, z);
			}
		}
		this.levelTiles[level][x][z].decor = decor;
	}

	@ObfuscatedName("s.a(BIIIIIIILy;II)Z")
	public boolean addLoc(byte arg0, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, int arg10) {
		if (arg8 == null) {
			return true;
		} else {
			int var12 = arg3 * 128 + arg6 * 64;
			int var13 = arg9 * 64 + arg10 * 128;
			return this.addLoc(arg4, arg3, arg10, arg6, arg9, var12, var13, arg5, arg8, arg7, false, arg1, arg0);
		}
	}

	@ObfuscatedName("s.a(IZIIILy;IZII)Z")
	public boolean addTemporary(int arg0, boolean forwardPadding, int arg2, int yaw, int arg4, ModelSource model, int arg6, int arg8, int arg9) {
		if (model == null) {
			return true;
		}

		int x0 = arg6 - arg0;
		int z0 = arg4 - arg0;
		int x1 = arg0 + arg6;
		int z1 = arg0 + arg4;

		if (forwardPadding) {
			if (yaw > 640 && yaw < 1408) {
				z1 += 128;
			}

			if (yaw > 1152 && yaw < 1920) {
				x1 += 128;
			}

			if (yaw > 1664 || yaw < 384) {
				z0 -= 128;
			}

			if (yaw > 128 && yaw < 896) {
				x0 -= 128;
			}
		}

		int var15 = x0 / 128;
		int var16 = z0 / 128;
		int var17 = x1 / 128;
		int var18 = z1 / 128;

		return this.addLoc(arg9, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg6, arg4, arg2, model, yaw, true, arg8, (byte) 0);
	}

	@ObfuscatedName("s.a(ILy;IIIBIIIIIII)Z")
	public boolean addTemporary(int arg0, ModelSource arg1, int arg2, int arg3, int arg4, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		return arg1 == null ? true : this.addLoc(arg0, arg9, arg12, arg3 - arg9 + 1, arg4 - arg12 + 1, arg8, arg2, arg6, arg1, arg7, true, arg11, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
				if (var14 < 0 || var21 < 0 || var14 >= this.maxTileX || var21 >= this.maxTileZ) {
					return false;
				}
				Square var22 = this.levelTiles[arg0][var14][var21];
				if (var22 != null && var22.primaryCount >= 5) {
					return false;
				}
			}
		}
		Sprite var15 = new Sprite();
		var15.typecode = arg11;
		var15.typecode2 = arg12;
		var15.level = arg0;
		var15.x = arg5;
		var15.z = arg6;
		var15.y = arg7;
		var15.model = arg8;
		var15.angle = arg9;
		var15.minGridX = arg1;
		var15.minGridZ = arg2;
		var15.maxGridX = arg1 + arg3 - 1;
		var15.maxGridZ = arg2 + arg4 - 1;
		for (int var16 = arg1; var16 < arg1 + arg3; var16++) {
			for (int var17 = arg2; var17 < arg2 + arg4; var17++) {
				int var18 = 0;
				if (var16 > arg1) {
					var18++;
				}
				if (var16 < arg1 + arg3 - 1) {
					var18 += 4;
				}
				if (var17 > arg2) {
					var18 += 8;
				}
				if (var17 < arg2 + arg4 - 1) {
					var18 += 2;
				}
				for (int var19 = arg0; var19 >= 0; var19--) {
					if (this.levelTiles[var19][var16][var17] == null) {
						this.levelTiles[var19][var16][var17] = new Square(var19, var16, var17);
					}
				}
				Square var20 = this.levelTiles[arg0][var16][var17];
				var20.sprite[var20.primaryCount] = var15;
				var20.primaryExtendDirections[var20.primaryCount] = var18;
				var20.combinedPrimaryExtendDirections |= var18;
				var20.primaryCount++;
			}
		}
		if (arg10) {
			this.changedLocs[this.changedLocCount++] = var15;
		}
		return true;
	}

	@ObfuscatedName("s.b(B)V")
	public void clearLocChanges() {
		for (int i = 0; i < this.changedLocCount; i++) {
			Sprite loc = this.changedLocs[i];
			this.removeLoc(loc);
			this.changedLocs[i] = null;
		}

		this.changedLocCount = 0;
	}

	@ObfuscatedName("s.a(ILq;)V")
	public void removeLoc(Sprite arg1) {
		for (int var4 = arg1.minGridX; var4 <= arg1.maxGridX; var4++) {
			for (int var5 = arg1.minGridZ; var5 <= arg1.maxGridZ; var5++) {
				Square var6 = this.levelTiles[arg1.level][var4][var5];
				if (var6 != null) {
					for (int var7 = 0; var7 < var6.primaryCount; var7++) {
						if (var6.sprite[var7] == arg1) {
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
	public void setDecorOffset(int arg0, int arg1, int arg2, int arg3) {
		Square var6 = this.levelTiles[arg3][arg1][arg2];
		if (var6 == null) {
			return;
		}
		Decor var7 = var6.decor;
		if (var7 == null) {
			return;
		}
		int var8 = arg1 * 128 + 64;
		int var9 = arg2 * 128 + 64;
		var7.x = (var7.x - var8) * arg0 / 16 + var8;
		var7.z = (var7.z - var9) * arg0 / 16 + var9;
	}

	@ObfuscatedName("s.b(IIII)V")
	public void removeWall(int arg0, int arg1, int arg2) {
		Square var5 = this.levelTiles[arg1][arg0][arg2];
		if (var5 != null) {
			var5.wall = null;
		}
	}

	@ObfuscatedName("s.a(IBII)V")
	public void removeDecor(int arg0, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg3][arg2][arg0];
		if (var5 != null) {
			var5.decor = null;
		}
	}

	@ObfuscatedName("s.c(IIII)V")
	public void removeLoc(int arg0, int arg1, int arg3) {
		Square var5 = this.levelTiles[arg3][arg0][arg1];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.primaryCount; var6++) {
			Sprite var7 = var5.sprite[var6];
			if ((var7.typecode >> 29 & 0x3) == 2 && var7.minGridX == arg0 && var7.minGridZ == arg1) {
				this.removeLoc(var7);
				return;
			}
		}
	}

	@ObfuscatedName("s.d(IIII)V")
	public void removeGroundDecor(int arg0, int arg1, int arg2) {
		Square var5 = this.levelTiles[arg1][arg2][arg0];
		if (var5 != null) {
			var5.groundDecor = null;
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void removeGroundObj(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("s.a(IIIZ)Lr;")
	public Wall getWall(int arg0, int arg1, int arg2) {
		Square var6 = this.levelTiles[arg2][arg0][arg1];
		return var6 == null ? null : var6.wall;
	}

	@ObfuscatedName("s.e(IIII)Li;")
	public Decor getDecor(int arg0, int arg1, int arg3) {
		Square var5 = this.levelTiles[arg1][arg0][arg3];
		return var5 == null ? null : var5.decor;
	}

	@ObfuscatedName("s.f(IIII)Lq;")
	public Sprite getSprite(int arg0, int arg1, int arg3) {
		Square var5 = this.levelTiles[arg0][arg3][arg1];
		if (var5 == null) {
			return null;
		} else {
			for (int var6 = 0; var6 < var5.primaryCount; var6++) {
				Sprite var7 = var5.sprite[var6];
				if ((var7.typecode >> 29 & 0x3) == 2 && var7.minGridX == arg3 && var7.minGridZ == arg1) {
					return var7;
				}
			}
			return null;
		}
	}

	@ObfuscatedName("s.a(ZIII)Lk;")
	public GroundDecor getGroundDecor(int arg1, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg3][arg1][arg2];
		return var5 == null || var5.groundDecor == null ? null : var5.groundDecor;
	}

	@ObfuscatedName("s.b(III)I")
	public int getWallTypecode(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode1;
	}

	@ObfuscatedName("s.g(IIII)I")
	public int getDecorTypecode(int arg0, int arg2, int arg3) {
		Square var5 = this.levelTiles[arg2][arg3][arg0];
		return var5 == null || var5.decor == null ? 0 : var5.decor.typecode;
	}

	@ObfuscatedName("s.c(III)I")
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

	@ObfuscatedName("s.d(III)I")
	public int getGroundDecorTypecode(int arg0, int arg1, int arg2) {
		Square var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("s.h(IIII)I")
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

	@ObfuscatedName("s.a(IIIIII)V")
	public void buildModels(int lightSrcY, int lightSrcX, int lgihtSrcZ, int arg4, int lightAttenuation) {
		int lightMagnitude = (int) Math.sqrt(lightSrcX * lightSrcX + lightSrcY * lightSrcY + lgihtSrcZ * lgihtSrcZ);
		int attenuation = (lightAttenuation * lightMagnitude) >> 8;

		for (int level = 0; level < this.maxLevel; level++) {
			for (int tileX = 0; tileX < this.maxTileX; tileX++) {
				for (int tileZ = 0; tileZ < this.maxTileZ; tileZ++) {
					Square tile = this.levelTiles[level][tileX][tileZ];
					if (tile == null) {
						continue;
					}

					Wall var13 = tile.wall;
					if (var13 != null && var13.model1 != null && var13.model1.vertexNormal != null) {
						this.mergeLocNormals(tileZ, (Model) var13.model1, tileX, level, 1, 1);
						if (var13.model2 != null && var13.model2.vertexNormal != null) {
							this.mergeLocNormals(tileZ, (Model) var13.model2, tileX, level, 1, 1);
							this.mergeNormals((Model) var13.model1, (Model) var13.model2, 0, 0, 0, false);
							((Model) var13.model2).applyLighting(arg4, attenuation, lgihtSrcZ, lightSrcY, lightSrcX);
						}
						((Model) var13.model1).applyLighting(arg4, attenuation, lgihtSrcZ, lightSrcY, lightSrcX);
					}

					for (int var14 = 0; var14 < tile.primaryCount; var14++) {
						Sprite loc = tile.sprite[var14];
						if (loc != null && loc.model != null && loc.model.vertexNormal != null) {
							this.mergeLocNormals(tileZ, (Model) loc.model, tileX, level, loc.maxGridX - loc.minGridX + 1, loc.maxGridZ - loc.minGridZ + 1);
							((Model) loc.model).applyLighting(arg4, attenuation, lgihtSrcZ, lightSrcY, lightSrcX);
						}
					}

					GroundDecor decor = tile.groundDecor;
					if (decor != null && decor.model.vertexNormal != null) {
						this.mergeGroundDecorNormals(tileZ, level, tileX, (Model) decor.model);
						((Model) decor.model).applyLighting(arg4, attenuation, lgihtSrcZ, lightSrcY, lightSrcX);
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIILfb;)V")
	public void mergeGroundDecorNormals(int arg0, int arg2, int arg3, Model arg4) {
		if (arg3 < this.maxTileX) {
			Square var7 = this.levelTiles[arg2][arg3 + 1][arg0];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var7.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg0 < this.maxTileX) {
			Square var8 = this.levelTiles[arg2][arg3][arg0 + 1];
			if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var8.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg3 < this.maxTileX && arg0 < this.maxTileZ) {
			Square var9 = this.levelTiles[arg2][arg3 + 1][arg0 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var9.groundDecor.model, 128, 0, 128, true);
			}
		}
		if (arg3 < this.maxTileX && arg0 > 0) {
			Square var10 = this.levelTiles[arg2][arg3 + 1][arg0 - 1];
			if (var10 != null && var10.groundDecor != null && var10.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var10.groundDecor.model, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("s.a(IILfb;IIII)V")
	public void mergeLocNormals(int arg1, Model arg2, int arg3, int arg4, int arg5, int arg6) {
		boolean var8 = true;
		int var9 = arg3;
		int var10 = arg3 + arg5;
		int var11 = arg1 - 1;
		int var12 = arg1 + arg6;
		for (int var13 = arg4; var13 <= arg4 + 1; var13++) {
			if (this.maxLevel != var13) {
				for (int var15 = var9; var15 <= var10; var15++) {
					if (var15 >= 0 && var15 < this.maxTileX) {
						for (int var16 = var11; var16 <= var12; var16++) {
							if (var16 >= 0 && var16 < this.maxTileZ && (!var8 || var15 >= var10 || var16 >= var12 || var16 < arg1 && arg3 != var15)) {
								Square var17 = this.levelTiles[var13][var15][var16];
								if (var17 != null) {
									int var18 = (this.levelHeightmaps[var13][var15 + 1][var16] + this.levelHeightmaps[var13][var15][var16] + this.levelHeightmaps[var13][var15][var16 + 1] + this.levelHeightmaps[var13][var15 + 1][var16 + 1]) / 4 - (this.levelHeightmaps[arg4][arg3 + 1][arg1] + this.levelHeightmaps[arg4][arg3][arg1] + this.levelHeightmaps[arg4][arg3][arg1 + 1] + this.levelHeightmaps[arg4][arg3 + 1][arg1 + 1]) / 4;
									Wall var19 = var17.wall;
									if (var19 != null && var19.model1 != null && var19.model1.vertexNormal != null) {
										this.mergeNormals(arg2, (Model) var19.model1, (var15 - arg3) * 128 + (1 - arg5) * 64, var18, (var16 - arg1) * 128 + (1 - arg6) * 64, var8);
									}
									if (var19 != null && var19.model2 != null && var19.model2.vertexNormal != null) {
										this.mergeNormals(arg2, (Model) var19.model2, (var15 - arg3) * 128 + (1 - arg5) * 64, var18, (var16 - arg1) * 128 + (1 - arg6) * 64, var8);
									}
									for (int var20 = 0; var20 < var17.primaryCount; var20++) {
										Sprite var21 = var17.sprite[var20];
										if (var21 != null && var21.model != null && var21.model.vertexNormal != null) {
											int var22 = var21.maxGridX - var21.minGridX + 1;
											int var23 = var21.maxGridZ - var21.minGridZ + 1;
											this.mergeNormals(arg2, (Model) var21.model, (var21.minGridX - arg3) * 128 + (var22 - arg5) * 64, var18, (var21.minGridZ - arg1) * 128 + (var23 - arg6) * 64, var8);
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
	public void mergeNormals(Model modelA, Model modelB, int arg2, int offsetY, int arg4, boolean arg5) {
		this.tmpMergeIndex++;

		int merged = 0;
		int[] vertexX = modelB.vertexX;
		int vertexCountB = modelB.vertexCount;

		for (int vertexA = 0; vertexA < modelA.vertexCount; vertexA++) {
			VertexNormal normalA = modelA.vertexNormal[vertexA];
			VertexNormal originalNormalA = modelA.vertexNormalOriginal[vertexA];

			if (originalNormalA.w != 0) {
				int y = modelA.vertexY[vertexA] - offsetY;
				if (y > modelB.maxY) {
					continue;
				}

				int x = modelA.vertexX[vertexA] - arg2;
				if (x < modelB.minX || x > modelB.maxX) {
					continue;
				}

				int z = modelA.vertexZ[vertexA] - arg4;
				if (z < modelB.minZ || z > modelB.maxZ) {
					continue;
				}

				for (int var18 = 0; var18 < vertexCountB; var18++) {
					VertexNormal var19 = modelB.vertexNormal[var18];
					VertexNormal var20 = modelB.vertexNormalOriginal[var18];
					if (vertexX[var18] == x && modelB.vertexZ[var18] == z && modelB.vertexY[var18] == y && var20.w != 0) {
						normalA.x += var20.x;
						normalA.y += var20.y;
						normalA.z += var20.z;
						normalA.w += var20.w;
						var19.x += originalNormalA.x;
						var19.y += originalNormalA.y;
						var19.z += originalNormalA.z;
						var19.w += originalNormalA.w;
						merged++;
						this.mergeIndexA[vertexA] = this.tmpMergeIndex;
						this.mergeIndexB[var18] = this.tmpMergeIndex;
					}
				}
			}
		}
		if (merged < 3 || !arg5) {
			return;
		}
		for (int var11 = 0; var11 < modelA.faceCount; var11++) {
			if (this.mergeIndexA[modelA.faceVertexA[var11]] == this.tmpMergeIndex && this.mergeIndexA[modelA.faceVertexB[var11]] == this.tmpMergeIndex && this.mergeIndexA[modelA.faceVertexC[var11]] == this.tmpMergeIndex) {
				modelA.faceInfo[var11] = -1;
			}
		}
		for (int var12 = 0; var12 < modelB.faceCount; var12++) {
			if (this.mergeIndexB[modelB.faceVertexA[var12]] == this.tmpMergeIndex && this.mergeIndexB[modelB.faceVertexB[var12]] == this.tmpMergeIndex && this.mergeIndexB[modelB.faceVertexC[var12]] == this.tmpMergeIndex) {
				modelB.faceInfo[var12] = -1;
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
		if (var11 == null) {
			return;
		}
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
			return;
		}
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

	@ObfuscatedName("s.a(IIBII[I)V")
	public static void init(int arg0, int arg1, int arg3, int arg4, int[] arg5) {
		viewportLeft = 0;
		viewportTop = 0;
		viewportRight = arg4;
		viewportBottom = arg1;
		viewportCenterX = arg4 / 2;
		viewportCenterY = arg1 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];
		for (int var7 = 128; var7 <= 384; var7 += 32) {
			for (int var15 = 0; var15 < 2048; var15 += 64) {
				sinEyePitch = Model.sinTable[var7];
				cosEyePitch = Model.cosTable[var7];
				sinEyeYaw = Model.sinTable[var15];
				cosEyeYaw = Model.cosTable[var15];
				int var16 = (var7 - 128) / 32;
				int var17 = var15 / 64;
				for (int var18 = -26; var18 <= 26; var18++) {
					for (int var19 = -26; var19 <= 26; var19++) {
						int var20 = var18 * 128;
						int var21 = var19 * 128;
						boolean var22 = false;
						for (int var23 = -arg3; var23 <= arg0; var23 += 128) {
							if (testPoint(var21, arg5[var16] + var23, var20)) {
								var22 = true;
								break;
							}
						}
						var6[var16][var17][var18 + 25 + 1][var19 + 25 + 1] = var22;
					}
				}
			}
		}
		for (int var8 = 0; var8 < 8; var8++) {
			for (int var9 = 0; var9 < 32; var9++) {
				for (int var10 = -25; var10 < 25; var10++) {
					for (int var11 = -25; var11 < 25; var11++) {
						boolean var12 = false;
						label82: for (int var13 = -1; var13 <= 1; var13++) {
							for (int var14 = -1; var14 <= 1; var14++) {
								if (var6[var8][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
									var12 = true;
									break label82;
								}
								if (var6[var8][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
									var12 = true;
									break label82;
								}
								if (var6[var8 + 1][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
									var12 = true;
									break label82;
								}
								if (var6[var8 + 1][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
									var12 = true;
									break label82;
								}
							}
						}
						visibilityMatrix[var8][var9][var10 + 25][var11 + 25] = var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.i(IIII)Z")
	public static boolean testPoint(int arg0, int arg1, int arg3) {
		int var4 = cosEyeYaw * arg3 + sinEyeYaw * arg0 >> 16;
		int var5 = cosEyeYaw * arg0 - sinEyeYaw * arg3 >> 16;
		int var6 = cosEyePitch * var5 + sinEyePitch * arg1 >> 16;
		int var7 = cosEyePitch * arg1 - sinEyePitch * var5 >> 16;
		if (var6 >= 50 && var6 <= 3500) {
			int var8 = (var4 << 9) / var6 + viewportCenterX;
			int var9 = (var7 << 9) / var6 + viewportCenterY;
			return var8 >= viewportLeft && var8 <= viewportRight && var9 >= viewportTop && var9 <= viewportBottom;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.a(BII)V")
	public void click(int arg1, int arg2) {
		takingInput = true;
		mouseX = arg2;
		mouseY = arg1;
		clickTileX = -1;
		clickTileZ = -1;
	}

	@ObfuscatedName("s.a(IIIIIII)V")
	public void draw(int arg0, int arg1, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.maxTileX * 128) {
			arg0 = this.maxTileX * 128 - 1;
		}
		if (arg5 < 0) {
			arg5 = 0;
		} else if (arg5 >= this.maxTileZ * 128) {
			arg5 = this.maxTileZ * 128 - 1;
		}
		cycle++;
		sinEyePitch = Model.sinTable[arg4];
		cosEyePitch = Model.cosTable[arg4];
		sinEyeYaw = Model.sinTable[arg3];
		cosEyeYaw = Model.cosTable[arg3];
		visibilityMap = visibilityMatrix[(arg4 - 128) / 32][arg3 / 64];
		eyeX = arg0;
		eyeY = arg6;
		eyeZ = arg5;
		eyeTileX = arg0 / 128;
		eyeTileZ = arg5 / 128;
		topLevel = arg1;
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
			Square[][] var33 = this.levelTiles[var8];
			for (int var34 = minDrawTileX; var34 < maxDrawTileX; var34++) {
				for (int var35 = minDrawTileZ; var35 < maxDrawTileZ; var35++) {
					Square var36 = var33[var34][var35];
					if (var36 != null) {
						if (var36.drawLevel <= arg1 && (visibilityMap[var34 - eyeTileX + 25][var35 - eyeTileZ + 25] || this.levelHeightmaps[var8][var34][var35] - arg6 >= 2000)) {
							var36.drawFront = true;
							var36.drawBack = true;
							if (var36.primaryCount > 0) {
								var36.drawPrimaries = true;
							} else {
								var36.drawPrimaries = false;
							}
							tilesRemaining++;
						} else {
							var36.drawFront = false;
							var36.drawBack = false;
							var36.cornerSides = 0;
						}
					}
				}
			}
		}
		for (int var9 = this.minLevel; var9 < this.maxLevel; var9++) {
			Square[][] var22 = this.levelTiles[var9];
			for (int var23 = -25; var23 <= 0; var23++) {
				int var24 = eyeTileX + var23;
				int var25 = eyeTileX - var23;
				if (var24 >= minDrawTileX || var25 < maxDrawTileX) {
					for (int var26 = -25; var26 <= 0; var26++) {
						int var27 = eyeTileZ + var26;
						int var28 = eyeTileZ - var26;
						if (var24 >= minDrawTileX) {
							if (var27 >= minDrawTileZ) {
								Square var29 = var22[var24][var27];
								if (var29 != null && var29.drawFront) {
									this.drawTile(var29, true);
								}
							}
							if (var28 < maxDrawTileZ) {
								Square var30 = var22[var24][var28];
								if (var30 != null && var30.drawFront) {
									this.drawTile(var30, true);
								}
							}
						}
						if (var25 < maxDrawTileX) {
							if (var27 >= minDrawTileZ) {
								Square var31 = var22[var25][var27];
								if (var31 != null && var31.drawFront) {
									this.drawTile(var31, true);
								}
							}
							if (var28 < maxDrawTileZ) {
								Square var32 = var22[var25][var28];
								if (var32 != null && var32.drawFront) {
									this.drawTile(var32, true);
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
		for (int var10 = this.minLevel; var10 < this.maxLevel; var10++) {
			Square[][] var11 = this.levelTiles[var10];
			for (int var12 = -25; var12 <= 0; var12++) {
				int var13 = eyeTileX + var12;
				int var14 = eyeTileX - var12;
				if (var13 >= minDrawTileX || var14 < maxDrawTileX) {
					for (int var15 = -25; var15 <= 0; var15++) {
						int var16 = eyeTileZ + var15;
						int var17 = eyeTileZ - var15;
						if (var13 >= minDrawTileX) {
							if (var16 >= minDrawTileZ) {
								Square var18 = var11[var13][var16];
								if (var18 != null && var18.drawFront) {
									this.drawTile(var18, false);
								}
							}
							if (var17 < maxDrawTileZ) {
								Square var19 = var11[var13][var17];
								if (var19 != null && var19.drawFront) {
									this.drawTile(var19, false);
								}
							}
						}
						if (var14 < maxDrawTileX) {
							if (var16 >= minDrawTileZ) {
								Square var20 = var11[var14][var16];
								if (var20 != null && var20.drawFront) {
									this.drawTile(var20, false);
								}
							}
							if (var17 < maxDrawTileZ) {
								Square var21 = var11[var14][var17];
								if (var21 != null && var21.drawFront) {
									this.drawTile(var21, false);
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
	public void drawTile(Square next, boolean checkAdjacent) {
		drawTileQueue.push(next);

		while (true) {
			Square tile;
			int tileX;
			int tileZ;
			int level;
			int originalLevel;
			Square[][] tiles;
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
												tile = (Square) drawTileQueue.pop();
												if (tile == null) {
													return;
												}
											} while (!tile.drawBack);

											tileX = tile.x;
											tileZ = tile.z;
											level = tile.level;
											originalLevel = tile.originalLevel;
											tiles = this.levelTiles[level];

											if (!tile.drawFront) {
												break;
											}

											if (checkAdjacent) {
												if (level > 0) {
													Square above = this.levelTiles[level - 1][tileX][tileZ];
													if (above != null && above.drawBack) {
														continue;
													}
												}

												if (tileX <= eyeTileX && tileX > minDrawTileX) {
													Square var10 = tiles[tileX - 1][tileZ];
													if (var10 != null && var10.drawBack && (var10.drawFront || (tile.combinedPrimaryExtendDirections & 0x1) == 0)) {
														continue;
													}
												}
												if (tileX >= eyeTileX && tileX < maxDrawTileX - 1) {
													Square var11 = tiles[tileX + 1][tileZ];
													if (var11 != null && var11.drawBack && (var11.drawFront || (tile.combinedPrimaryExtendDirections & 0x4) == 0)) {
														continue;
													}
												}
												if (tileZ <= eyeTileZ && tileZ > minDrawTileZ) {
													Square var12 = tiles[tileX][tileZ - 1];
													if (var12 != null && var12.drawBack && (var12.drawFront || (tile.combinedPrimaryExtendDirections & 0x8) == 0)) {
														continue;
													}
												}
												if (tileZ >= eyeTileZ && tileZ < maxDrawTileZ - 1) {
													Square adjacent = tiles[tileX][tileZ + 1];

													if (adjacent != null && adjacent.drawBack && (adjacent.drawFront || (tile.combinedPrimaryExtendDirections & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												checkAdjacent = true;
											}

											tile.drawFront = false;

											if (tile.linkedSquare != null) {
												Square linkedSquare = tile.linkedSquare;

												if (linkedSquare.quickGround == null) {
													if (linkedSquare.ground != null && !this.tileVisible(0, tileX, tileZ)) {
														this.drawTileOverlay(tileX, sinEyePitch, sinEyeYaw, cosEyeYaw, linkedSquare.ground, cosEyePitch, tileZ);
													}
												} else if (!this.tileVisible(0, tileX, tileZ)) {
													this.drawTileUnderlay(linkedSquare.quickGround, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, tileX, tileZ);
												}

												Wall wall = linkedSquare.wall;
												if (wall != null) {
													wall.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.x - eyeX, wall.y - eyeY, wall.z - eyeZ, wall.typecode1);
												}

												for (int i = 0; i < linkedSquare.primaryCount; i++) {
													Sprite loc = linkedSquare.sprite[i];

													if (loc != null) {
														loc.model.draw(loc.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, loc.x - eyeX, loc.y - eyeY, loc.z - eyeZ, loc.typecode);
													}
												}
											}

											boolean tileDrawn = false;
											if (tile.quickGround == null) {
												if (tile.ground != null && !this.tileVisible(originalLevel, tileX, tileZ)) {
													tileDrawn = true;
													this.drawTileOverlay(tileX, sinEyePitch, sinEyeYaw, cosEyeYaw, tile.ground, cosEyePitch, tileZ);
												}
											} else if (!this.tileVisible(originalLevel, tileX, tileZ)) {
												tileDrawn = true;
												this.drawTileUnderlay(tile.quickGround, originalLevel, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, tileX, tileZ);
											}

											int direction = 0;
											int frontWallTypes = 0;

											Wall wall = tile.wall;
											Decor decor = tile.decor;

											if (wall != null || decor != null) {
												if (eyeTileX == tileX) {
													direction++;
												} else if (eyeTileX < tileX) {
													direction += 2;
												}

												if (eyeTileZ == tileZ) {
													direction += 3;
												} else if (eyeTileZ > tileZ) {
													direction += 6;
												}

												frontWallTypes = FRONT_WALL_TYPES[direction];
												tile.backWallTypes = BACK_WALL_TYPES[direction];
											}

											if (wall != null) {
												if ((wall.angle1 & DIRECTION_ALLOW_WALL_CORNER_TYPE[direction]) == 0) {
													tile.cornerSides = 0;
												} else if (wall.angle1 == 16) {
													tile.cornerSides = 3;
													tile.sidesBeforeCorner = MIDDEP_16[direction];
													tile.sidesAfterCorner = 3 - tile.sidesBeforeCorner;
												} else if (wall.angle1 == 32) {
													tile.cornerSides = 6;
													tile.sidesBeforeCorner = MIDDEP_32[direction];
													tile.sidesAfterCorner = 6 - tile.sidesBeforeCorner;
												} else if (wall.angle1 == 64) {
													tile.cornerSides = 12;
													tile.sidesBeforeCorner = MIDDEP_64[direction];
													tile.sidesAfterCorner = 12 - tile.sidesBeforeCorner;
												} else {
													tile.cornerSides = 9;
													tile.sidesBeforeCorner = MIDDEP_128[direction];
													tile.sidesAfterCorner = 9 - tile.sidesBeforeCorner;
												}
												if ((wall.angle1 & frontWallTypes) != 0 && !this.isTileSideOccluded(originalLevel, tileX, tileZ, wall.angle1)) {
													wall.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.x - eyeX, wall.y - eyeY, wall.z - eyeZ, wall.typecode1);
												}
												if ((wall.angle2 & frontWallTypes) != 0 && !this.isTileSideOccluded(originalLevel, tileX, tileZ, wall.angle2)) {
													wall.model2.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.x - eyeX, wall.y - eyeY, wall.z - eyeZ, wall.typecode1);
												}
											}

											if (decor != null && !this.isTileColumnOccluded(originalLevel, tileX, tileZ, decor.model.minY)) {
												if ((decor.angle1 & frontWallTypes) != 0) {
													decor.model.draw(decor.angle2, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, decor.x - eyeX, decor.y - eyeY, decor.z - eyeZ, decor.typecode);
												} else if ((decor.angle1 & 0x300) != 0) {
													int x = decor.x - eyeX;
													int y = decor.y - eyeY;
													int z = decor.z - eyeZ;
													int angle = decor.angle2;

													int nearestX;
													if (angle == 1 || angle == 2) {
														nearestX = -x;
													} else {
														nearestX = x;
													}

													int nearestZ;
													if (angle == 2 || angle == 3) {
														nearestZ = -z;
													} else {
														nearestZ = z;
													}

													if ((decor.angle1 & 0x100) != 0 && nearestZ < nearestX) {
														int drawX = WALL_DECORATION_INSET_X[angle] + x;
														int drawZ = WALL_DECORATION_INSET_Z[angle] + z;
														decor.model.draw(angle * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
													}

													if ((decor.angle1 & 0x200) != 0 && nearestZ > nearestX) {
														int drawX = WALL_DECORATION_OUTSET_X[angle] + x;
														int drawZ = WALL_DECORATION_OUTSET_Z[angle] + z;
														decor.model.draw(angle * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
													}
												}
											}

											if (tileDrawn) {
												GroundDecor groundDecor = tile.groundDecor;
												if (groundDecor != null) {
													groundDecor.model.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, groundDecor.x - eyeX, groundDecor.y - eyeY, groundDecor.z - eyeZ, groundDecor.typecode);
												}

												GroundObject objs = tile.groundObject;
												if (objs != null && objs.height == 0) {
													if (objs.bottom != null) {
														objs.bottom.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.x - eyeX, objs.y - eyeY, objs.z - eyeZ, objs.typecode);
													}
													if (objs.middle != null) {
														objs.middle.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.x - eyeX, objs.y - eyeY, objs.z - eyeZ, objs.typecode);
													}
													if (objs.top != null) {
														objs.top.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.x - eyeX, objs.y - eyeY, objs.z - eyeZ, objs.typecode);
													}
												}
											}

											int spans = tile.combinedPrimaryExtendDirections;
											if (spans != 0) {
												if (tileX < eyeTileX && (spans & 0x4) != 0) {
													Square adjacent = tiles[tileX + 1][tileZ];
													if (adjacent != null && adjacent.drawBack) {
														drawTileQueue.push(adjacent);
													}
												}

												if (tileZ < eyeTileZ && (spans & 0x2) != 0) {
													Square adjacent = tiles[tileX][tileZ + 1];
													if (adjacent != null && adjacent.drawBack) {
														drawTileQueue.push(adjacent);
													}
												}

												if (tileX > eyeTileX && (spans & 0x1) != 0) {
													Square adjacent = tiles[tileX - 1][tileZ];
													if (adjacent != null && adjacent.drawBack) {
														drawTileQueue.push(adjacent);
													}
												}

												if (tileZ > eyeTileZ && (spans & 0x8) != 0) {
													Square adjacent = tiles[tileX][tileZ - 1];
													if (adjacent != null && adjacent.drawBack) {
														drawTileQueue.push(adjacent);
													}
												}
											}
											break;
										}

										if (tile.cornerSides != 0) {
											boolean draw = true;
											for (int i = 0; i < tile.primaryCount; i++) {
												if (cycle != tile.sprite[i].cycle && (tile.primaryExtendDirections[i] & tile.cornerSides) == tile.sidesBeforeCorner) {
													draw = false;
													break;
												}
											}

											if (draw) {
												Wall wall = tile.wall;

												if (!this.isTileSideOccluded(originalLevel, tileX, tileZ, wall.angle1)) {
													wall.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.x - eyeX, wall.y - eyeY, wall.z - eyeZ, wall.typecode1);
												}

												tile.cornerSides = 0;
											}
										}

										if (!tile.drawPrimaries) {
											break;
										}

										int locCount = tile.primaryCount;
										tile.drawPrimaries = false;
										int locBufferSize = 0;

										iterate_locs: for (int i = 0; i < locCount; i++) {
											Sprite loc = tile.sprite[i];
											if (cycle == loc.cycle) {
												continue;
											}

											for (int x = loc.minGridX; x <= loc.maxGridX; x++) {
												for (int z = loc.minGridZ; z <= loc.maxGridZ; z++) {
													Square other = tiles[x][z];

													if (other.drawFront) {
														tile.drawPrimaries = true;
														continue iterate_locs;
													}

													if (other.cornerSides == 0) {
														continue;
													}

													int spans = 0;
													if (x > loc.minGridX) {
														spans++;
													}

													if (x < loc.maxGridX) {
														spans += 4;
													}

													if (z > loc.minGridZ) {
														spans += 8;
													}

													if (z < loc.maxGridZ) {
														spans += 2;
													}

													if ((spans & other.cornerSides) == tile.sidesAfterCorner) {
														tile.drawPrimaries = true;
														continue iterate_locs;
													}
												}
											}

											locBuffer[locBufferSize++] = loc;

											int minTileDistanceX = eyeTileX - loc.minGridX;
											int maxTileDistanceX = loc.maxGridX - eyeTileX;
											if (maxTileDistanceX > minTileDistanceX) {
												minTileDistanceX = maxTileDistanceX;
											}

											int minTileDistanceZ = eyeTileZ - loc.minGridZ;
											int maxTileDistanceZ = loc.maxGridZ - eyeTileZ;
											if (maxTileDistanceZ > minTileDistanceZ) {
												loc.distance = minTileDistanceX + maxTileDistanceZ;
											} else {
												loc.distance = minTileDistanceX + minTileDistanceZ;
											}
										}

										while (locBufferSize > 0) {
											int farthestDistance = -50;
											int farthestIndex = -1;

											for (int index = 0; index < locBufferSize; index++) {
												Sprite loc = locBuffer[index];

												if (loc.distance > farthestDistance && cycle != loc.cycle) {
													farthestDistance = loc.distance;
													farthestIndex = index;
												}
											}

											if (farthestIndex == -1) {
												break;
											}

											Sprite farthest = locBuffer[farthestIndex];
											farthest.cycle = cycle;

											if (!this.locVisible(originalLevel, farthest.minGridX, farthest.maxGridX, farthest.minGridZ, farthest.maxGridZ, farthest.model.minY)) {
												farthest.model.draw(farthest.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, farthest.x - eyeX, farthest.y - eyeY, farthest.z - eyeZ, farthest.typecode);
											}

											for (int x = farthest.minGridX; x <= farthest.maxGridX; x++) {
												for (int z = farthest.minGridZ; z <= farthest.maxGridZ; z++) {
													Square occupied = tiles[x][z];

													if (occupied.cornerSides != 0) {
														drawTileQueue.push(occupied);
													} else if ((tileX != x || tileZ != z) && occupied.drawBack) {
														drawTileQueue.push(occupied);
													}
												}
											}
										}

										if (!tile.drawPrimaries) {
											break;
										}
									}
								} while (!tile.drawBack);
							} while (tile.cornerSides != 0);

							if (tileX > eyeTileX || tileX <= minDrawTileX) {
								break;
							}

							var63 = tiles[tileX - 1][tileZ];
						} while (var63 != null && var63.drawBack);
						if (tileX < eyeTileX || tileX >= maxDrawTileX - 1) {
							break;
						}

						var64 = tiles[tileX + 1][tileZ];
					} while (var64 != null && var64.drawBack);
					if (tileZ > eyeTileZ || tileZ <= minDrawTileZ) {
						break;
					}

					var65 = tiles[tileX][tileZ - 1];
				} while (var65 != null && var65.drawBack);
				if (tileZ < eyeTileZ || tileZ >= maxDrawTileZ - 1) {
					break;
				}

				var66 = tiles[tileX][tileZ + 1];
			} while (var66 != null && var66.drawBack);

			tile.drawBack = false;
			tilesRemaining--;

			GroundObject objs = tile.groundObject;
			if (objs != null && objs.height != 0) {
				if (objs.bottom != null) {
					objs.bottom.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.x - eyeX, objs.y - eyeY - objs.height, objs.z - eyeZ, objs.typecode);
				}

				if (objs.middle != null) {
					objs.middle.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.x - eyeX, objs.y - eyeY - objs.height, objs.z - eyeZ, objs.typecode);
				}

				if (objs.top != null) {
					objs.top.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, objs.x - eyeX, objs.y - eyeY - objs.height, objs.z - eyeZ, objs.typecode);
				}
			}

			if (tile.backWallTypes != 0) {
				Decor decor = tile.decor;
				if (decor != null && !this.isTileColumnOccluded(originalLevel, tileX, tileZ, decor.model.minY)) {
					if ((decor.angle1 & tile.backWallTypes) != 0) {
						decor.model.draw(decor.angle2, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, decor.x - eyeX, decor.y - eyeY, decor.z - eyeZ, decor.typecode);
					} else if ((decor.angle1 & 0x300) != 0) {
						int x = decor.x - eyeX;
						int y = decor.y - eyeY;
						int z = decor.z - eyeZ;
						int angle = decor.angle2;

						int nearestX;
						if (angle == 1 || angle == 2) {
							nearestX = -x;
						} else {
							nearestX = x;
						}

						int nearestZ;
						if (angle == 2 || angle == 3) {
							nearestZ = -z;
						} else {
							nearestZ = z;
						}

						if ((decor.angle1 & 0x100) != 0 && nearestZ >= nearestX) {
							int drawX = WALL_DECORATION_INSET_X[angle] + x;
							int drawZ = WALL_DECORATION_INSET_Z[angle] + z;
							decor.model.draw(angle * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
						}
						if ((decor.angle1 & 0x200) != 0 && nearestZ <= nearestX) {
							int drawX = WALL_DECORATION_OUTSET_X[angle] + x;
							int drawZ = WALL_DECORATION_OUTSET_Z[angle] + z;
							decor.model.draw(angle * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, drawX, y, drawZ, decor.typecode);
						}
					}
				}

				Wall wall = tile.wall;
				if (wall != null) {
					if ((wall.angle2 & tile.backWallTypes) != 0 && !this.isTileSideOccluded(originalLevel, tileX, tileZ, wall.angle2)) {
						wall.model2.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.x - eyeX, wall.y - eyeY, wall.z - eyeZ, wall.typecode1);
					}

					if ((wall.angle1 & tile.backWallTypes) != 0 && !this.isTileSideOccluded(originalLevel, tileX, tileZ, wall.angle1)) {
						wall.model1.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, wall.x - eyeX, wall.y - eyeY, wall.z - eyeZ, wall.typecode1);
					}
				}
			}

			if (level < this.maxLevel - 1) {
				Square above = this.levelTiles[level + 1][tileX][tileZ];
				if (above != null && above.drawBack) {
					drawTileQueue.push(above);
				}
			}

			if (tileX < eyeTileX) {
				Square adjacent = tiles[tileX + 1][tileZ];
				if (adjacent != null && adjacent.drawBack) {
					drawTileQueue.push(adjacent);
				}
			}

			if (tileZ < eyeTileZ) {
				Square adjacent = tiles[tileX][tileZ + 1];
				if (adjacent != null && adjacent.drawBack) {
					drawTileQueue.push(adjacent);
				}
			}

			if (tileX > eyeTileX) {
				Square adjacent = tiles[tileX - 1][tileZ];
				if (adjacent != null && adjacent.drawBack) {
					drawTileQueue.push(adjacent);
				}
			}

			if (tileZ > eyeTileZ) {
				Square adjacent = tiles[tileX][tileZ - 1];
				if (adjacent != null && adjacent.drawBack) {
					drawTileQueue.push(adjacent);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void drawTileUnderlay(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
		int var45 = (var21 << 9) / var25 + Pix3D.centerX;
		int var46 = (var24 << 9) / var25 + Pix3D.centerY;
		int var47 = (var27 << 9) / var31 + Pix3D.centerX;
		int var48 = (var30 << 9) / var31 + Pix3D.centerY;
		int var49 = (var33 << 9) / var37 + Pix3D.centerX;
		int var50 = (var36 << 9) / var37 + Pix3D.centerY;
		int var51 = (var39 << 9) / var43 + Pix3D.centerX;
		int var52 = (var42 << 9) / var43 + Pix3D.centerY;
		Pix3D.trans = 0;
		if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
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
					Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.field262, arg0.field260);
				}
			} else if (lowMem) {
				int var53 = TEXTURE_HSL[arg0.textureId];
				Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, this.mulLightness(arg0.neColour, var53), this.mulLightness(arg0.field262, var53), this.mulLightness(arg0.field260, var53));
			} else if (arg0.field264) {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.field262, arg0.field260, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
			} else {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.field262, arg0.field260, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.textureId);
			}
		}
		if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
			return;
		}
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
				Pix3D.textureTriangle(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
				return;
			}
			int var54 = TEXTURE_HSL[arg0.textureId];
			Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, this.mulLightness(arg0.field259, var54), this.mulLightness(arg0.field260, var54), this.mulLightness(arg0.field262, var54));
		} else if (arg0.field259 != 12345678) {
			Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262);
			return;
		}
	}

	@ObfuscatedName("s.a(IIIILj;III)V")
	public void drawTileOverlay(int arg0, int arg1, int arg2, int arg3, Ground arg4, int arg5, int arg7) {
		int var9 = arg4.vertexX.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var23 = arg4.vertexX[var10] - eyeX;
			int var24 = arg4.vertexY[var10] - eyeY;
			int var25 = arg4.vertexZ[var10] - eyeZ;
			int var26 = arg2 * var25 + arg3 * var23 >> 16;
			int var27 = arg3 * var25 - arg2 * var23 >> 16;
			int var29 = arg5 * var24 - arg1 * var27 >> 16;
			int var30 = arg1 * var24 + arg5 * var27 >> 16;
			if (var30 < 50) {
				return;
			}
			if (arg4.triangleTexture != null) {
				Ground.drawTextureVertexX[var10] = var26;
				Ground.drawTextureVertexY[var10] = var29;
				Ground.drawTextureVertexZ[var10] = var30;
			}
			Ground.drawVertexX[var10] = (var26 << 9) / var30 + Pix3D.centerX;
			Ground.drawVertexY[var10] = (var29 << 9) / var30 + Pix3D.centerY;
		}
		Pix3D.trans = 0;
		int var11 = arg4.triangleVertexA.length;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = arg4.triangleVertexA[var12];
			int var14 = arg4.triangleVertexB[var12];
			int var15 = arg4.triangleVertexC[var12];
			int var16 = Ground.drawVertexX[var13];
			int var17 = Ground.drawVertexX[var14];
			int var18 = Ground.drawVertexX[var15];
			int var19 = Ground.drawVertexY[var13];
			int var20 = Ground.drawVertexY[var14];
			int var21 = Ground.drawVertexY[var15];
			if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
				Pix3D.hclip = false;
				if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.safeWidth || var17 > Pix2D.safeWidth || var18 > Pix2D.safeWidth) {
					Pix3D.hclip = true;
				}
				if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var19, var20, var21, var16, var17, var18)) {
					clickTileX = arg0;
					clickTileZ = arg7;
				}
				if (arg4.triangleTexture == null || arg4.triangleTexture[var12] == -1) {
					if (arg4.triangleColourA[var12] != 12345678) {
						Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColourA[var12], arg4.triangleColourB[var12], arg4.triangleColourC[var12]);
					}
				} else if (lowMem) {
					int var22 = TEXTURE_HSL[arg4.triangleTexture[var12]];
					Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, this.mulLightness(arg4.triangleColourA[var12], var22), this.mulLightness(arg4.triangleColourB[var12], var22), this.mulLightness(arg4.triangleColourC[var12], var22));
				} else if (arg4.flat) {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColourA[var12], arg4.triangleColourB[var12], arg4.triangleColourC[var12], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg4.triangleTexture[var12]);
				} else {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColourA[var12], arg4.triangleColourB[var12], arg4.triangleColourC[var12], Ground.drawTextureVertexX[var13], Ground.drawTextureVertexX[var14], Ground.drawTextureVertexX[var15], Ground.drawTextureVertexY[var13], Ground.drawTextureVertexY[var14], Ground.drawTextureVertexY[var15], Ground.drawTextureVertexZ[var13], Ground.drawTextureVertexZ[var14], Ground.drawTextureVertexZ[var15], arg4.triangleTexture[var12]);
				}
			}
		}
	}

	@ObfuscatedName("s.e(III)I")
	public int mulLightness(int arg0, int arg2) {
		int var4 = 127 - arg0;
		int var5 = (arg2 & 0x7F) * var4 / 160;
		if (var5 < 2) {
			var5 = 2;
		} else if (var5 > 126) {
			var5 = 126;
		}
		return (arg2 & 0xFF80) + var5;
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
			return var9 * var11 > 0 && var10 * var11 > 0;
		}
	}

	@ObfuscatedName("s.b(I)V")
	public void updateActiveOccluders() {
		int var2 = levelOccluderCunt[topLevel];
		Occlude[] var4 = levelOccluders[topLevel];
		activeOccluderCount = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			Occlude var6 = var4[var5];
			if (var6.type == 1) {
				int var7 = var6.minGridX - eyeTileX + 25;
				if (var7 >= 0 && var7 <= 50) {
					int var8 = var6.minGridZ - eyeTileZ + 25;
					if (var8 < 0) {
						var8 = 0;
					}
					int var9 = var6.maxGridZ - eyeTileZ + 25;
					if (var9 > 50) {
						var9 = 50;
					}
					boolean var10 = false;
					while (var8 <= var9) {
						if (visibilityMap[var7][var8++]) {
							var10 = true;
							break;
						}
					}
					if (var10) {
						int var11 = eyeX - var6.minX;
						if (var11 > 32) {
							var6.mode = 1;
						} else {
							if (var11 >= -32) {
								continue;
							}
							var6.mode = 2;
							var11 = -var11;
						}
						var6.minDeltaZ = (var6.minZ - eyeZ << 8) / var11;
						var6.maxDeltaZ = (var6.maxZ - eyeZ << 8) / var11;
						var6.minDeltaY = (var6.minY - eyeY << 8) / var11;
						var6.maxDeltaY = (var6.maxY - eyeY << 8) / var11;
						activeOccluders[activeOccluderCount++] = var6;
					}
				}
			} else if (var6.type == 2) {
				int var12 = var6.minGridZ - eyeTileZ + 25;
				if (var12 >= 0 && var12 <= 50) {
					int var13 = var6.minGridX - eyeTileX + 25;
					if (var13 < 0) {
						var13 = 0;
					}
					int var14 = var6.maxGridX - eyeTileX + 25;
					if (var14 > 50) {
						var14 = 50;
					}
					boolean var15 = false;
					while (var13 <= var14) {
						if (visibilityMap[var13++][var12]) {
							var15 = true;
							break;
						}
					}
					if (var15) {
						int var16 = eyeZ - var6.minZ;
						if (var16 > 32) {
							var6.mode = 3;
						} else {
							if (var16 >= -32) {
								continue;
							}
							var6.mode = 4;
							var16 = -var16;
						}
						var6.minDeltaX = (var6.minX - eyeX << 8) / var16;
						var6.maxDeltaX = (var6.maxX - eyeX << 8) / var16;
						var6.minDeltaY = (var6.minY - eyeY << 8) / var16;
						var6.maxDeltaY = (var6.maxY - eyeY << 8) / var16;
						activeOccluders[activeOccluderCount++] = var6;
					}
				}
			} else if (var6.type == 4) {
				int var17 = var6.minY - eyeY;
				if (var17 > 128) {
					int var18 = var6.minGridZ - eyeTileZ + 25;
					if (var18 < 0) {
						var18 = 0;
					}
					int var19 = var6.maxGridZ - eyeTileZ + 25;
					if (var19 > 50) {
						var19 = 50;
					}
					if (var18 <= var19) {
						int var20 = var6.minGridX - eyeTileX + 25;
						if (var20 < 0) {
							var20 = 0;
						}
						int var21 = var6.maxGridX - eyeTileX + 25;
						if (var21 > 50) {
							var21 = 50;
						}
						boolean var22 = false;
						label145: for (int var23 = var20; var23 <= var21; var23++) {
							for (int var24 = var18; var24 <= var19; var24++) {
								if (visibilityMap[var23][var24]) {
									var22 = true;
									break label145;
								}
							}
						}
						if (var22) {
							var6.mode = 5;
							var6.minDeltaX = (var6.minX - eyeX << 8) / var17;
							var6.maxDeltaX = (var6.maxX - eyeX << 8) / var17;
							var6.minDeltaZ = (var6.minZ - eyeZ << 8) / var17;
							var6.maxDeltaZ = (var6.maxZ - eyeZ << 8) / var17;
							activeOccluders[activeOccluderCount++] = var6;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.f(III)Z")
	public boolean tileVisible(int arg0, int arg1, int arg2) {
		int var4 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
		if (-cycle == var4) {
			return false;
		} else if (cycle == var4) {
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

	@ObfuscatedName("s.j(IIII)Z")
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

	@ObfuscatedName("s.k(IIII)Z")
	public boolean isTileColumnOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (this.tileVisible(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.b(IIIIII)Z")
	public boolean locVisible(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var15 = arg3; var15 <= arg4; var15++) {
					if (this.levelTileOcclusionCycles[arg0][var9][var15] == -cycle) {
						return false;
					}
				}
			}
			int var10 = (arg1 << 7) + 1;
			int var11 = (arg3 << 7) + 2;
			int var12 = this.levelHeightmaps[arg0][arg1][arg3] - arg5;
			if (!this.occluded(var10, var12, var11)) {
				return false;
			}
			int var13 = (arg2 << 7) - 1;
			if (!this.occluded(var13, var12, var11)) {
				return false;
			}
			int var14 = (arg4 << 7) - 1;
			if (!this.occluded(var10, var12, var14)) {
				return false;
			} else if (this.occluded(var13, var12, var14)) {
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

	@ObfuscatedName("s.g(III)Z")
	public boolean occluded(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < activeOccluderCount; var4++) {
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
}
