package jagex2.dash3d;

import deob.*;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;
import jagex2.graphics.VertexNormal;

@ObfuscatedName("s")
public class World3D {

	@ObfuscatedName("s.g")
	public static boolean lowMemory = true;

	@ObfuscatedName("s.h")
	public int maxLevel;

	@ObfuscatedName("s.i")
	public int maxTileX;

	@ObfuscatedName("s.j")
	public int maxTileZ;

	@ObfuscatedName("s.k")
	public int[][][] levelHeightmaps;

	@ObfuscatedName("s.l")
	public Ground[][][] levelTiles;

	@ObfuscatedName("s.m")
	public int minLevel;

	@ObfuscatedName("s.n")
	public int changedLocCount;

	@ObfuscatedName("s.o")
	public Location[] changedLocs = new Location[5000];

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
	public static final int[] WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.bb")
	public static final int[] WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.cb")
	public static final int[] field343 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

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
	public static Location[] locBuffer = new Location[100];

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
	public static final int[] WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

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
		this.levelTiles = new Ground[arg3][arg2][arg0];
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
				this.levelTiles[arg1][var3][var5] = new Ground(arg1, var3, var5);
			}
		}
	}

	@ObfuscatedName("s.a(ZII)V")
	public void setBridge(int arg1, int arg2) {
		Ground var4 = this.levelTiles[0][arg2][arg1];
		for (int var5 = 0; var5 < 3; var5++) {
			this.levelTiles[var5][arg2][arg1] = this.levelTiles[var5 + 1][arg2][arg1];
			if (this.levelTiles[var5][arg2][arg1] != null) {
				this.levelTiles[var5][arg2][arg1].level--;
			}
		}
		if (this.levelTiles[0][arg2][arg1] == null) {
			this.levelTiles[0][arg2][arg1] = new Ground(0, arg2, arg1);
		}
		this.levelTiles[0][arg2][arg1].bridge = var4;
		this.levelTiles[3][arg2][arg1] = null;
	}

	@ObfuscatedName("s.a(IIIIIIBII)V")
	public static void addOccluder(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7, int arg8) {
		Occlude var9 = new Occlude();
		var9.minTileX = arg0 / 128;
		var9.maxTileX = arg5 / 128;
		var9.minTileZ = arg8 / 128;
		var9.maxTileZ = arg3 / 128;
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
		Ground var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 != null) {
			this.levelTiles[arg0][arg1][arg2].drawLevel = arg3;
		}
	}

	@ObfuscatedName("s.a(IIIIIIIIIIIIIIIIIIII)V")
	public void setTile(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.levelTiles[var22][arg1][arg2] == null) {
					this.levelTiles[var22][arg1][arg2] = new Ground(var22, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].underlay = var21;
		} else if (arg3 == 1) {
			TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.levelTiles[var24][arg1][arg2] == null) {
					this.levelTiles[var24][arg1][arg2] = new Ground(var24, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].underlay = var23;
		} else {
			TileOverlay var25 = new TileOverlay(arg13, arg8, arg19, arg18, arg3, arg6, arg5, arg11, arg4, arg14, arg16, arg1, arg9, arg17, arg2, arg12, arg15, arg10, arg7);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.levelTiles[var26][arg1][arg2] == null) {
					this.levelTiles[var26][arg1][arg2] = new Ground(var26, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].overlay = var25;
		}
	}

	@ObfuscatedName("s.a(IIIIIILy;B)V")
	public void addGroundDecor(int arg0, int arg1, int arg2, int arg4, int arg5, Entity arg6, byte arg7) {
		if (arg6 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.model = arg6;
		var9.x = arg2 * 128 + 64;
		var9.z = arg0 * 128 + 64;
		var9.y = arg5;
		var9.typecode = arg4;
		var9.info = arg7;
		if (this.levelTiles[arg1][arg2][arg0] == null) {
			this.levelTiles[arg1][arg2][arg0] = new Ground(arg1, arg2, arg0);
		}
		this.levelTiles[arg1][arg2][arg0].groundDecor = var9;
	}

	@ObfuscatedName("s.a(IZIIILy;Ly;ILy;)V")
	public void addGroundObject(int arg0, int arg2, int arg3, int arg4, Entity arg5, Entity arg6, int arg7, Entity arg8) {
		GroundObject var10 = new GroundObject();
		var10.topObj = arg6;
		var10.x = arg3 * 128 + 64;
		var10.z = arg4 * 128 + 64;
		var10.y = arg2;
		var10.typecode = arg0;
		var10.bottomObj = arg8;
		var10.middleObj = arg5;
		int var11 = 0;
		Ground var12 = this.levelTiles[arg7][arg3][arg4];
		if (var12 != null) {
			for (int var14 = 0; var14 < var12.locCount; var14++) {
				if (var12.locs[var14].model instanceof Model) {
					int var15 = ((Model) var12.locs[var14].model).objRaise;
					if (var15 > var11) {
						var11 = var15;
					}
				}
			}
		}
		var10.offset = var11;
		if (this.levelTiles[arg7][arg3][arg4] == null) {
			this.levelTiles[arg7][arg3][arg4] = new Ground(arg7, arg3, arg4);
		}
		this.levelTiles[arg7][arg3][arg4].groundObj = var10;
	}

	@ObfuscatedName("s.a(IIIIZIILy;Ly;BI)V")
	public void addWall(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6, Entity arg7, Entity arg8, byte arg9, int arg10) {
		if (arg8 == null && arg7 == null) {
			return;
		}
		Wall var12 = new Wall();
		var12.typecode = arg1;
		var12.info = arg9;
		var12.x = arg0 * 128 + 64;
		var12.z = arg10 * 128 + 64;
		var12.y = arg6;
		var12.modelA = arg8;
		var12.modelB = arg7;
		var12.typeA = arg5;
		var12.typeB = arg3;
		for (int var13 = arg2; var13 >= 0; var13--) {
			if (this.levelTiles[var13][arg0][arg10] == null) {
				this.levelTiles[var13][arg0][arg10] = new Ground(var13, arg0, arg10);
			}
		}
		this.levelTiles[arg2][arg0][arg10].wall = var12;
	}

	@ObfuscatedName("s.a(BLy;IIIIIIIIII)V")
	public void addDecor(byte arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg8, int arg9, int arg10, int arg11) {
		if (arg1 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.typecode = arg11;
		var13.info = arg0;
		var13.x = arg3 * 128 + 64 + arg2;
		var13.z = arg4 * 128 + 64 + arg6;
		var13.y = arg10;
		var13.model = arg1;
		var13.type = arg5;
		var13.angle = arg8;
		for (int var14 = arg9; var14 >= 0; var14--) {
			if (this.levelTiles[var14][arg3][arg4] == null) {
				this.levelTiles[var14][arg3][arg4] = new Ground(var14, arg3, arg4);
			}
		}
		this.levelTiles[arg9][arg3][arg4].decor = var13;
	}

	@ObfuscatedName("s.a(BIIIIIIILy;II)Z")
	public boolean addLoc(byte arg0, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, int arg10) {
		if (arg8 == null) {
			return true;
		} else {
			int var12 = arg3 * 128 + arg6 * 64;
			int var13 = arg9 * 64 + arg10 * 128;
			return this.addLoc(arg4, arg3, arg10, arg6, arg9, var12, var13, arg5, arg8, arg7, false, arg1, arg0);
		}
	}

	@ObfuscatedName("s.a(IZIIILy;IZII)Z")
	public boolean addTemporary(int arg0, boolean arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, int arg8, int arg9) {
		if (arg5 == null) {
			return true;
		}
		int var11 = arg6 - arg0;
		int var12 = arg4 - arg0;
		int var13 = arg0 + arg6;
		int var14 = arg0 + arg4;
		if (arg1) {
			if (arg3 > 640 && arg3 < 1408) {
				var14 += 128;
			}
			if (arg3 > 1152 && arg3 < 1920) {
				var13 += 128;
			}
			if (arg3 > 1664 || arg3 < 384) {
				var12 -= 128;
			}
			if (arg3 > 128 && arg3 < 896) {
				var11 -= 128;
			}
		}
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		int var18 = var14 / 128;
		return this.addLoc(arg9, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg6, arg4, arg2, arg5, arg3, true, arg8, (byte) 0);
	}

	@ObfuscatedName("s.a(ILy;IIIBIIIIIII)Z")
	public boolean addTemporary(int arg0, Entity arg1, int arg2, int arg3, int arg4, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		return arg1 == null ? true : this.addLoc(arg0, arg9, arg12, arg3 - arg9 + 1, arg4 - arg12 + 1, arg8, arg2, arg6, arg1, arg7, true, arg11, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
				if (var14 < 0 || var21 < 0 || var14 >= this.maxTileX || var21 >= this.maxTileZ) {
					return false;
				}
				Ground var22 = this.levelTiles[arg0][var14][var21];
				if (var22 != null && var22.locCount >= 5) {
					return false;
				}
			}
		}
		Location var15 = new Location();
		var15.typecode = arg11;
		var15.info = arg12;
		var15.level = arg0;
		var15.x = arg5;
		var15.z = arg6;
		var15.y = arg7;
		var15.model = arg8;
		var15.yaw = arg9;
		var15.minSceneTileX = arg1;
		var15.minSceneTileZ = arg2;
		var15.maxSceneTileX = arg1 + arg3 - 1;
		var15.maxSceneTileZ = arg2 + arg4 - 1;
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
						this.levelTiles[var19][var16][var17] = new Ground(var19, var16, var17);
					}
				}
				Ground var20 = this.levelTiles[arg0][var16][var17];
				var20.locs[var20.locCount] = var15;
				var20.locSpan[var20.locCount] = var18;
				var20.locSpans |= var18;
				var20.locCount++;
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
			Location loc = this.changedLocs[i];
			this.removeLoc(loc);
			this.changedLocs[i] = null;
		}

		this.changedLocCount = 0;
	}

	@ObfuscatedName("s.a(ILq;)V")
	public void removeLoc(Location arg1) {
		for (int var4 = arg1.minSceneTileX; var4 <= arg1.maxSceneTileX; var4++) {
			for (int var5 = arg1.minSceneTileZ; var5 <= arg1.maxSceneTileZ; var5++) {
				Ground var6 = this.levelTiles[arg1.level][var4][var5];
				if (var6 != null) {
					for (int var7 = 0; var7 < var6.locCount; var7++) {
						if (var6.locs[var7] == arg1) {
							var6.locCount--;
							for (int var8 = var7; var8 < var6.locCount; var8++) {
								var6.locs[var8] = var6.locs[var8 + 1];
								var6.locSpan[var8] = var6.locSpan[var8 + 1];
							}
							var6.locs[var6.locCount] = null;
							break;
						}
					}
					var6.locSpans = 0;
					for (int var9 = 0; var9 < var6.locCount; var9++) {
						var6.locSpans |= var6.locSpan[var9];
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIII)V")
	public void setDecorOffset(int arg0, int arg1, int arg2, int arg3) {
		Ground var6 = this.levelTiles[arg3][arg1][arg2];
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
		Ground var5 = this.levelTiles[arg1][arg0][arg2];
		if (var5 != null) {
			var5.wall = null;
		}
	}

	@ObfuscatedName("s.a(IBII)V")
	public void removeDecor(int arg0, int arg2, int arg3) {
		Ground var5 = this.levelTiles[arg3][arg2][arg0];
		if (var5 != null) {
			var5.decor = null;
		}
	}

	@ObfuscatedName("s.c(IIII)V")
	public void removeLoc(int arg0, int arg1, int arg3) {
		Ground var5 = this.levelTiles[arg3][arg0][arg1];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.locCount; var6++) {
			Location var7 = var5.locs[var6];
			if ((var7.typecode >> 29 & 0x3) == 2 && var7.minSceneTileX == arg0 && var7.minSceneTileZ == arg1) {
				this.removeLoc(var7);
				return;
			}
		}
	}

	@ObfuscatedName("s.d(IIII)V")
	public void removeGroundDecor(int arg0, int arg1, int arg2) {
		Ground var5 = this.levelTiles[arg1][arg2][arg0];
		if (var5 != null) {
			var5.groundDecor = null;
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void removeGroundObj(int arg0, int arg1, int arg2) {
		Ground var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObj = null;
		}
	}

	@ObfuscatedName("s.a(IIIZ)Lr;")
	public Wall getWall(int arg0, int arg1, int arg2) {
		Ground var6 = this.levelTiles[arg2][arg0][arg1];
		return var6 == null ? null : var6.wall;
	}

	@ObfuscatedName("s.e(IIII)Li;")
	public Decor getDecor(int arg0, int arg1, int arg3) {
		Ground var5 = this.levelTiles[arg1][arg0][arg3];
		return var5 == null ? null : var5.decor;
	}

	@ObfuscatedName("s.f(IIII)Lq;")
	public Location getLoc(int arg0, int arg1, int arg3) {
		Ground var5 = this.levelTiles[arg0][arg3][arg1];
		if (var5 == null) {
			return null;
		} else {
			for (int var6 = 0; var6 < var5.locCount; var6++) {
				Location var7 = var5.locs[var6];
				if ((var7.typecode >> 29 & 0x3) == 2 && var7.minSceneTileX == arg3 && var7.minSceneTileZ == arg1) {
					return var7;
				}
			}
			return null;
		}
	}

	@ObfuscatedName("s.a(ZIII)Lk;")
	public GroundDecor getGroundDecor(int arg1, int arg2, int arg3) {
		Ground var5 = this.levelTiles[arg3][arg1][arg2];
		return var5 == null || var5.groundDecor == null ? null : var5.groundDecor;
	}

	@ObfuscatedName("s.b(III)I")
	public int getWallTypecode(int arg0, int arg1, int arg2) {
		Ground var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode;
	}

	@ObfuscatedName("s.g(IIII)I")
	public int getDecorTypecode(int arg0, int arg2, int arg3) {
		Ground var5 = this.levelTiles[arg2][arg3][arg0];
		return var5 == null || var5.decor == null ? 0 : var5.decor.typecode;
	}

	@ObfuscatedName("s.c(III)I")
	public int getLocTypecode(int arg0, int arg1, int arg2) {
		Ground var4 = this.levelTiles[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.locCount; var5++) {
			Location var6 = var4.locs[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minSceneTileX == arg1 && var6.minSceneTileZ == arg2) {
				return var6.typecode;
			}
		}
		return 0;
	}

	@ObfuscatedName("s.d(III)I")
	public int getGroundDecorTypecode(int arg0, int arg1, int arg2) {
		Ground var4 = this.levelTiles[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("s.h(IIII)I")
	public int getInfo(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.levelTiles[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
			return var5.wall.info & 0xFF;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return var5.decor.info & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return var5.groundDecor.info & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.locCount; var6++) {
				if (var5.locs[var6].typecode == arg3) {
					return var5.locs[var6].info & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("s.a(IIIIII)V")
	public void buildModels(int arg0, int arg1, int arg3, int arg4, int arg5) {
		int var7 = (int) Math.sqrt((double) (arg1 * arg1 + arg0 * arg0 + arg3 * arg3));
		int var8 = arg5 * var7 >> 8;
		for (int var9 = 0; var9 < this.maxLevel; var9++) {
			for (int var10 = 0; var10 < this.maxTileX; var10++) {
				for (int var11 = 0; var11 < this.maxTileZ; var11++) {
					Ground var12 = this.levelTiles[var9][var10][var11];
					if (var12 != null) {
						Wall var13 = var12.wall;
						if (var13 != null && var13.modelA != null && var13.modelA.vertexNormal != null) {
							this.mergeLocNormals(var11, (Model) var13.modelA, var10, var9, 1, 1);
							if (var13.modelB != null && var13.modelB.vertexNormal != null) {
								this.mergeLocNormals(var11, (Model) var13.modelB, var10, var9, 1, 1);
								this.mergeNormals((Model) var13.modelA, (Model) var13.modelB, 0, 0, 0, false);
								((Model) var13.modelB).applyLighting(arg4, var8, arg3, arg0, arg1);
							}
							((Model) var13.modelA).applyLighting(arg4, var8, arg3, arg0, arg1);
						}
						for (int var14 = 0; var14 < var12.locCount; var14++) {
							Location var16 = var12.locs[var14];
							if (var16 != null && var16.model != null && var16.model.vertexNormal != null) {
								this.mergeLocNormals(var11, (Model) var16.model, var10, var9, var16.maxSceneTileX - var16.minSceneTileX + 1, var16.maxSceneTileZ - var16.minSceneTileZ + 1);
								((Model) var16.model).applyLighting(arg4, var8, arg3, arg0, arg1);
							}
						}
						GroundDecor var15 = var12.groundDecor;
						if (var15 != null && var15.model.vertexNormal != null) {
							this.mergeGroundDecorNormals(var11, var9, var10, (Model) var15.model);
							((Model) var15.model).applyLighting(arg4, var8, arg3, arg0, arg1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIILfb;)V")
	public void mergeGroundDecorNormals(int arg0, int arg2, int arg3, Model arg4) {
		if (arg3 < this.maxTileX) {
			Ground var7 = this.levelTiles[arg2][arg3 + 1][arg0];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var7.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg0 < this.maxTileX) {
			Ground var8 = this.levelTiles[arg2][arg3][arg0 + 1];
			if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var8.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg3 < this.maxTileX && arg0 < this.maxTileZ) {
			Ground var9 = this.levelTiles[arg2][arg3 + 1][arg0 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.model.vertexNormal != null) {
				this.mergeNormals(arg4, (Model) var9.groundDecor.model, 128, 0, 128, true);
			}
		}
		if (arg3 < this.maxTileX && arg0 > 0) {
			Ground var10 = this.levelTiles[arg2][arg3 + 1][arg0 - 1];
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
								Ground var17 = this.levelTiles[var13][var15][var16];
								if (var17 != null) {
									int var18 = (this.levelHeightmaps[var13][var15 + 1][var16] + this.levelHeightmaps[var13][var15][var16] + this.levelHeightmaps[var13][var15][var16 + 1] + this.levelHeightmaps[var13][var15 + 1][var16 + 1]) / 4 - (this.levelHeightmaps[arg4][arg3 + 1][arg1] + this.levelHeightmaps[arg4][arg3][arg1] + this.levelHeightmaps[arg4][arg3][arg1 + 1] + this.levelHeightmaps[arg4][arg3 + 1][arg1 + 1]) / 4;
									Wall var19 = var17.wall;
									if (var19 != null && var19.modelA != null && var19.modelA.vertexNormal != null) {
										this.mergeNormals(arg2, (Model) var19.modelA, (var15 - arg3) * 128 + (1 - arg5) * 64, var18, (var16 - arg1) * 128 + (1 - arg6) * 64, var8);
									}
									if (var19 != null && var19.modelB != null && var19.modelB.vertexNormal != null) {
										this.mergeNormals(arg2, (Model) var19.modelB, (var15 - arg3) * 128 + (1 - arg5) * 64, var18, (var16 - arg1) * 128 + (1 - arg6) * 64, var8);
									}
									for (int var20 = 0; var20 < var17.locCount; var20++) {
										Location var21 = var17.locs[var20];
										if (var21 != null && var21.model != null && var21.model.vertexNormal != null) {
											int var22 = var21.maxSceneTileX - var21.minSceneTileX + 1;
											int var23 = var21.maxSceneTileZ - var21.minSceneTileZ + 1;
											this.mergeNormals(arg2, (Model) var21.model, (var21.minSceneTileX - arg3) * 128 + (var22 - arg5) * 64, var18, (var21.minSceneTileZ - arg1) * 128 + (var23 - arg6) * 64, var8);
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
			VertexNormal var13 = arg0.vertexNormal[var10];
			VertexNormal var14 = arg0.vertexNormalOriginal[var10];
			if (var14.w != 0) {
				int var15 = arg0.vertexY[var10] - arg3;
				if (var15 <= arg1.maxY) {
					int var16 = arg0.vertexX[var10] - arg2;
					if (var16 >= arg1.minX && var16 <= arg1.maxX) {
						int var17 = arg0.vertexZ[var10] - arg4;
						if (var17 >= arg1.minZ && var17 <= arg1.maxZ) {
							for (int var18 = 0; var18 < var9; var18++) {
								VertexNormal var19 = arg1.vertexNormal[var18];
								VertexNormal var20 = arg1.vertexNormalOriginal[var18];
								if (var8[var18] == var16 && arg1.vertexZ[var18] == var17 && arg1.vertexY[var18] == var15 && var20.w != 0) {
									var13.x += var20.x;
									var13.y += var20.y;
									var13.z += var20.z;
									var13.w += var20.w;
									var19.x += var14.x;
									var19.y += var14.y;
									var19.z += var14.z;
									var19.w += var14.w;
									var7++;
									this.mergeIndexA[var10] = this.tmpMergeIndex;
									this.mergeIndexB[var18] = this.tmpMergeIndex;
								}
							}
						}
					}
				}
			}
		}
		if (var7 < 3 || !arg5) {
			return;
		}
		for (int var11 = 0; var11 < arg0.faceCount; var11++) {
			if (this.mergeIndexA[arg0.faceVertexA[var11]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexB[var11]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexC[var11]] == this.tmpMergeIndex) {
				arg0.faceInfo[var11] = -1;
			}
		}
		for (int var12 = 0; var12 < arg1.faceCount; var12++) {
			if (this.mergeIndexB[arg1.faceVertexA[var12]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexB[var12]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexC[var12]] == this.tmpMergeIndex) {
				arg1.faceInfo[var12] = -1;
			}
		}
	}

	@ObfuscatedName("s.a([IIIIII)V")
	public void drawMinimapTile(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Ground var7 = this.levelTiles[arg3][arg4][arg5];
		if (var7 == null) {
			return;
		}
		TileUnderlay var8 = var7.underlay;
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
		TileOverlay var11 = var7.overlay;
		if (var11 == null) {
			return;
		}
		int var12 = var11.shape;
		int var13 = var11.angle;
		int var14 = var11.backgroundRgb;
		int var15 = var11.foregroundRgb;
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
			Ground[][] var33 = this.levelTiles[var8];
			for (int var34 = minDrawTileX; var34 < maxDrawTileX; var34++) {
				for (int var35 = minDrawTileZ; var35 < maxDrawTileZ; var35++) {
					Ground var36 = var33[var34][var35];
					if (var36 != null) {
						if (var36.drawLevel <= arg1 && (visibilityMap[var34 - eyeTileX + 25][var35 - eyeTileZ + 25] || this.levelHeightmaps[var8][var34][var35] - arg6 >= 2000)) {
							var36.visible = true;
							var36.update = true;
							if (var36.locCount > 0) {
								var36.containsLocs = true;
							} else {
								var36.containsLocs = false;
							}
							tilesRemaining++;
						} else {
							var36.visible = false;
							var36.update = false;
							var36.checkLocSpans = 0;
						}
					}
				}
			}
		}
		for (int var9 = this.minLevel; var9 < this.maxLevel; var9++) {
			Ground[][] var22 = this.levelTiles[var9];
			for (int var23 = -25; var23 <= 0; var23++) {
				int var24 = eyeTileX + var23;
				int var25 = eyeTileX - var23;
				if (var24 >= minDrawTileX || var25 < maxDrawTileX) {
					for (int var26 = -25; var26 <= 0; var26++) {
						int var27 = eyeTileZ + var26;
						int var28 = eyeTileZ - var26;
						if (var24 >= minDrawTileX) {
							if (var27 >= minDrawTileZ) {
								Ground var29 = var22[var24][var27];
								if (var29 != null && var29.visible) {
									this.drawTile(var29, true);
								}
							}
							if (var28 < maxDrawTileZ) {
								Ground var30 = var22[var24][var28];
								if (var30 != null && var30.visible) {
									this.drawTile(var30, true);
								}
							}
						}
						if (var25 < maxDrawTileX) {
							if (var27 >= minDrawTileZ) {
								Ground var31 = var22[var25][var27];
								if (var31 != null && var31.visible) {
									this.drawTile(var31, true);
								}
							}
							if (var28 < maxDrawTileZ) {
								Ground var32 = var22[var25][var28];
								if (var32 != null && var32.visible) {
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
			Ground[][] var11 = this.levelTiles[var10];
			for (int var12 = -25; var12 <= 0; var12++) {
				int var13 = eyeTileX + var12;
				int var14 = eyeTileX - var12;
				if (var13 >= minDrawTileX || var14 < maxDrawTileX) {
					for (int var15 = -25; var15 <= 0; var15++) {
						int var16 = eyeTileZ + var15;
						int var17 = eyeTileZ - var15;
						if (var13 >= minDrawTileX) {
							if (var16 >= minDrawTileZ) {
								Ground var18 = var11[var13][var16];
								if (var18 != null && var18.visible) {
									this.drawTile(var18, false);
								}
							}
							if (var17 < maxDrawTileZ) {
								Ground var19 = var11[var13][var17];
								if (var19 != null && var19.visible) {
									this.drawTile(var19, false);
								}
							}
						}
						if (var14 < maxDrawTileX) {
							if (var16 >= minDrawTileZ) {
								Ground var20 = var11[var14][var16];
								if (var20 != null && var20.visible) {
									this.drawTile(var20, false);
								}
							}
							if (var17 < maxDrawTileZ) {
								Ground var21 = var11[var14][var17];
								if (var21 != null && var21.visible) {
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
	public void drawTile(Ground arg0, boolean arg1) {
		drawTileQueue.addTail(arg0);
		while (true) {
			Ground var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Ground[][] var8;
			Ground var66;
			do {
				Ground var65;
				do {
					Ground var64;
					do {
						Ground var63;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var3 = (Ground) drawTileQueue.removeHead();
												if (var3 == null) {
													return;
												}
											} while (!var3.update);
											var4 = var3.x;
											var5 = var3.z;
											var6 = var3.level;
											var7 = var3.occludeLevel;
											var8 = this.levelTiles[var6];
											if (!var3.visible) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Ground var9 = this.levelTiles[var6 - 1][var4][var5];
													if (var9 != null && var9.update) {
														continue;
													}
												}
												if (var4 <= eyeTileX && var4 > minDrawTileX) {
													Ground var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.update && (var10.visible || (var3.locSpans & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= eyeTileX && var4 < maxDrawTileX - 1) {
													Ground var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.update && (var11.visible || (var3.locSpans & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= eyeTileZ && var5 > minDrawTileZ) {
													Ground var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.update && (var12.visible || (var3.locSpans & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= eyeTileZ && var5 < maxDrawTileZ - 1) {
													Ground var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.update && (var13.visible || (var3.locSpans & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.visible = false;
											if (var3.bridge != null) {
												Ground var14 = var3.bridge;
												if (var14.underlay == null) {
													if (var14.overlay != null && !this.tileVisible(0, var4, var5)) {
														this.drawTileOverlay(var4, sinEyePitch, sinEyeYaw, cosEyeYaw, var14.overlay, cosEyePitch, var5);
													}
												} else if (!this.tileVisible(0, var4, var5)) {
													this.drawTileUnderlay(var14.underlay, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var15.x - eyeX, var15.y - eyeY, var15.z - eyeZ, var15.typecode);
												}
												for (int var16 = 0; var16 < var14.locCount; var16++) {
													Location var17 = var14.locs[var16];
													if (var17 != null) {
														var17.model.draw(var17.yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var17.x - eyeX, var17.y - eyeY, var17.z - eyeZ, var17.typecode);
													}
												}
											}
											boolean var18 = false;
											if (var3.underlay == null) {
												if (var3.overlay != null && !this.tileVisible(var7, var4, var5)) {
													var18 = true;
													this.drawTileOverlay(var4, sinEyePitch, sinEyeYaw, cosEyeYaw, var3.overlay, cosEyePitch, var5);
												}
											} else if (!this.tileVisible(var7, var4, var5)) {
												var18 = true;
												this.drawTileUnderlay(var3.underlay, var7, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
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
												if ((var21.typeA & DIRECTION_ALLOW_WALL_CORNER_TYPE[var19]) == 0) {
													var3.checkLocSpans = 0;
												} else if (var21.typeA == 16) {
													var3.checkLocSpans = 3;
													var3.blockLocSpans = WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS[var19];
													var3.inverseBlockLocSpans = 3 - var3.blockLocSpans;
												} else if (var21.typeA == 32) {
													var3.checkLocSpans = 6;
													var3.blockLocSpans = WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS[var19];
													var3.inverseBlockLocSpans = 6 - var3.blockLocSpans;
												} else if (var21.typeA == 64) {
													var3.checkLocSpans = 12;
													var3.blockLocSpans = WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS[var19];
													var3.inverseBlockLocSpans = 12 - var3.blockLocSpans;
												} else {
													var3.checkLocSpans = 9;
													var3.blockLocSpans = field343[var19];
													var3.inverseBlockLocSpans = 9 - var3.blockLocSpans;
												}
												if ((var21.typeA & var20) != 0 && !this.wallVisible(var7, var4, var5, var21.typeA)) {
													var21.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var21.x - eyeX, var21.y - eyeY, var21.z - eyeZ, var21.typecode);
												}
												if ((var21.typeB & var20) != 0 && !this.wallVisible(var7, var4, var5, var21.typeB)) {
													var21.modelB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var21.x - eyeX, var21.y - eyeY, var21.z - eyeZ, var21.typecode);
												}
											}
											if (var22 != null && !this.visible(var7, var4, var5, var22.model.minY)) {
												if ((var22.type & var20) != 0) {
													var22.model.draw(var22.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var22.x - eyeX, var22.y - eyeY, var22.z - eyeZ, var22.typecode);
												} else if ((var22.type & 0x300) != 0) {
													int var23 = var22.x - eyeX;
													int var24 = var22.y - eyeY;
													int var25 = var22.z - eyeZ;
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
													if ((var22.type & 0x100) != 0 && var28 < var27) {
														int var29 = WALL_DECORATION_INSET_X[var26] + var23;
														int var30 = WALL_DECORATION_INSET_Z[var26] + var25;
														var22.model.draw(var26 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var29, var24, var30, var22.typecode);
													}
													if ((var22.type & 0x200) != 0 && var28 > var27) {
														int var31 = WALL_DECORATION_OUTSET_X[var26] + var23;
														int var32 = WALL_DECORATION_OUTSET_Z[var26] + var25;
														var22.model.draw(var26 * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var31, var24, var32, var22.typecode);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var33.x - eyeX, var33.y - eyeY, var33.z - eyeZ, var33.typecode);
												}
												GroundObject var34 = var3.groundObj;
												if (var34 != null && var34.offset == 0) {
													if (var34.bottomObj != null) {
														var34.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.y - eyeY, var34.z - eyeZ, var34.typecode);
													}
													if (var34.middleObj != null) {
														var34.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.y - eyeY, var34.z - eyeZ, var34.typecode);
													}
													if (var34.topObj != null) {
														var34.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.y - eyeY, var34.z - eyeZ, var34.typecode);
													}
												}
											}
											int var35 = var3.locSpans;
											if (var35 != 0) {
												if (var4 < eyeTileX && (var35 & 0x4) != 0) {
													Ground var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.update) {
														drawTileQueue.addTail(var36);
													}
												}
												if (var5 < eyeTileZ && (var35 & 0x2) != 0) {
													Ground var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.update) {
														drawTileQueue.addTail(var37);
													}
												}
												if (var4 > eyeTileX && (var35 & 0x1) != 0) {
													Ground var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.update) {
														drawTileQueue.addTail(var38);
													}
												}
												if (var5 > eyeTileZ && (var35 & 0x8) != 0) {
													Ground var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.update) {
														drawTileQueue.addTail(var39);
													}
												}
											}
											break;
										}
										if (var3.checkLocSpans != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.locCount; var41++) {
												if (cycle != var3.locs[var41].cycle && (var3.locSpan[var41] & var3.checkLocSpans) == var3.blockLocSpans) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!this.wallVisible(var7, var4, var5, var42.typeA)) {
													var42.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var42.x - eyeX, var42.y - eyeY, var42.z - eyeZ, var42.typecode);
												}
												var3.checkLocSpans = 0;
											}
										}
										if (!var3.containsLocs) {
											break;
										}
										int var43 = var3.locCount;
										var3.containsLocs = false;
										int var44 = 0;
										label558: for (int var45 = 0; var45 < var43; var45++) {
											Location var54 = var3.locs[var45];
											if (cycle != var54.cycle) {
												for (int var55 = var54.minSceneTileX; var55 <= var54.maxSceneTileX; var55++) {
													for (int var60 = var54.minSceneTileZ; var60 <= var54.maxSceneTileZ; var60++) {
														Ground var61 = var8[var55][var60];
														if (var61.visible) {
															var3.containsLocs = true;
															continue label558;
														}
														if (var61.checkLocSpans != 0) {
															int var62 = 0;
															if (var55 > var54.minSceneTileX) {
																var62++;
															}
															if (var55 < var54.maxSceneTileX) {
																var62 += 4;
															}
															if (var60 > var54.minSceneTileZ) {
																var62 += 8;
															}
															if (var60 < var54.maxSceneTileZ) {
																var62 += 2;
															}
															if ((var62 & var61.checkLocSpans) == var3.inverseBlockLocSpans) {
																var3.containsLocs = true;
																continue label558;
															}
														}
													}
												}
												locBuffer[var44++] = var54;
												int var56 = eyeTileX - var54.minSceneTileX;
												int var57 = var54.maxSceneTileX - eyeTileX;
												if (var57 > var56) {
													var56 = var57;
												}
												int var58 = eyeTileZ - var54.minSceneTileZ;
												int var59 = var54.maxSceneTileZ - eyeTileZ;
												if (var59 > var58) {
													var54.distance = var56 + var59;
												} else {
													var54.distance = var56 + var58;
												}
											}
										}
										while (var44 > 0) {
											int var46 = -50;
											int var47 = -1;
											for (int var48 = 0; var48 < var44; var48++) {
												Location var53 = locBuffer[var48];
												if (var53.distance > var46 && cycle != var53.cycle) {
													var46 = var53.distance;
													var47 = var48;
												}
											}
											if (var47 == -1) {
												break;
											}
											Location var49 = locBuffer[var47];
											var49.cycle = cycle;
											if (!this.locVisible(var7, var49.minSceneTileX, var49.maxSceneTileX, var49.minSceneTileZ, var49.maxSceneTileZ, var49.model.minY)) {
												var49.model.draw(var49.yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var49.x - eyeX, var49.y - eyeY, var49.z - eyeZ, var49.typecode);
											}
											for (int var50 = var49.minSceneTileX; var50 <= var49.maxSceneTileX; var50++) {
												for (int var51 = var49.minSceneTileZ; var51 <= var49.maxSceneTileZ; var51++) {
													Ground var52 = var8[var50][var51];
													if (var52.checkLocSpans != 0) {
														drawTileQueue.addTail(var52);
													} else if ((var4 != var50 || var5 != var51) && var52.update) {
														drawTileQueue.addTail(var52);
													}
												}
											}
										}
										if (!var3.containsLocs) {
											break;
										}
									}
								} while (!var3.update);
							} while (var3.checkLocSpans != 0);
							if (var4 > eyeTileX || var4 <= minDrawTileX) {
								break;
							}
							var63 = var8[var4 - 1][var5];
						} while (var63 != null && var63.update);
						if (var4 < eyeTileX || var4 >= maxDrawTileX - 1) {
							break;
						}
						var64 = var8[var4 + 1][var5];
					} while (var64 != null && var64.update);
					if (var5 > eyeTileZ || var5 <= minDrawTileZ) {
						break;
					}
					var65 = var8[var4][var5 - 1];
				} while (var65 != null && var65.update);
				if (var5 < eyeTileZ || var5 >= maxDrawTileZ - 1) {
					break;
				}
				var66 = var8[var4][var5 + 1];
			} while (var66 != null && var66.update);
			var3.update = false;
			tilesRemaining--;
			GroundObject var67 = var3.groundObj;
			if (var67 != null && var67.offset != 0) {
				if (var67.bottomObj != null) {
					var67.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var67.x - eyeX, var67.y - eyeY - var67.offset, var67.z - eyeZ, var67.typecode);
				}
				if (var67.middleObj != null) {
					var67.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var67.x - eyeX, var67.y - eyeY - var67.offset, var67.z - eyeZ, var67.typecode);
				}
				if (var67.topObj != null) {
					var67.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var67.x - eyeX, var67.y - eyeY - var67.offset, var67.z - eyeZ, var67.typecode);
				}
			}
			if (var3.backWallTypes != 0) {
				Decor var68 = var3.decor;
				if (var68 != null && !this.visible(var7, var4, var5, var68.model.minY)) {
					if ((var68.type & var3.backWallTypes) != 0) {
						var68.model.draw(var68.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var68.x - eyeX, var68.y - eyeY, var68.z - eyeZ, var68.typecode);
					} else if ((var68.type & 0x300) != 0) {
						int var69 = var68.x - eyeX;
						int var70 = var68.y - eyeY;
						int var71 = var68.z - eyeZ;
						int var72 = var68.angle;
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
						if ((var68.type & 0x100) != 0 && var74 >= var73) {
							int var75 = WALL_DECORATION_INSET_X[var72] + var69;
							int var76 = WALL_DECORATION_INSET_Z[var72] + var71;
							var68.model.draw(var72 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var75, var70, var76, var68.typecode);
						}
						if ((var68.type & 0x200) != 0 && var74 <= var73) {
							int var77 = WALL_DECORATION_OUTSET_X[var72] + var69;
							int var78 = WALL_DECORATION_OUTSET_Z[var72] + var71;
							var68.model.draw(var72 * 512 + 1280 & 0x7FF, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var77, var70, var78, var68.typecode);
						}
					}
				}
				Wall var79 = var3.wall;
				if (var79 != null) {
					if ((var79.typeB & var3.backWallTypes) != 0 && !this.wallVisible(var7, var4, var5, var79.typeB)) {
						var79.modelB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var79.x - eyeX, var79.y - eyeY, var79.z - eyeZ, var79.typecode);
					}
					if ((var79.typeA & var3.backWallTypes) != 0 && !this.wallVisible(var7, var4, var5, var79.typeA)) {
						var79.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var79.x - eyeX, var79.y - eyeY, var79.z - eyeZ, var79.typecode);
					}
				}
			}
			if (var6 < this.maxLevel - 1) {
				Ground var80 = this.levelTiles[var6 + 1][var4][var5];
				if (var80 != null && var80.update) {
					drawTileQueue.addTail(var80);
				}
			}
			if (var4 < eyeTileX) {
				Ground var81 = var8[var4 + 1][var5];
				if (var81 != null && var81.update) {
					drawTileQueue.addTail(var81);
				}
			}
			if (var5 < eyeTileZ) {
				Ground var82 = var8[var4][var5 + 1];
				if (var82 != null && var82.update) {
					drawTileQueue.addTail(var82);
				}
			}
			if (var4 > eyeTileX) {
				Ground var83 = var8[var4 - 1][var5];
				if (var83 != null && var83.update) {
					drawTileQueue.addTail(var83);
				}
			}
			if (var5 > eyeTileZ) {
				Ground var84 = var8[var4][var5 - 1];
				if (var84 != null && var84.update) {
					drawTileQueue.addTail(var84);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void drawTileUnderlay(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
			} else if (lowMemory) {
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
			if (!lowMemory) {
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
	public void drawTileOverlay(int arg0, int arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg7) {
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
			if (arg4.triangleTextureIds != null) {
				TileOverlay.tmpViewspaceX[var10] = var26;
				TileOverlay.tmpViewspaceY[var10] = var29;
				TileOverlay.tmpViewspaceZ[var10] = var30;
			}
			TileOverlay.tmpScreenX[var10] = (var26 << 9) / var30 + Pix3D.centerX;
			TileOverlay.tmpScreenY[var10] = (var29 << 9) / var30 + Pix3D.centerY;
		}
		Pix3D.trans = 0;
		int var11 = arg4.triangleVertexA.length;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = arg4.triangleVertexA[var12];
			int var14 = arg4.triangleVertexB[var12];
			int var15 = arg4.triangleVertexC[var12];
			int var16 = TileOverlay.tmpScreenX[var13];
			int var17 = TileOverlay.tmpScreenX[var14];
			int var18 = TileOverlay.tmpScreenX[var15];
			int var19 = TileOverlay.tmpScreenY[var13];
			int var20 = TileOverlay.tmpScreenY[var14];
			int var21 = TileOverlay.tmpScreenY[var15];
			if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
				Pix3D.hclip = false;
				if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.safeWidth || var17 > Pix2D.safeWidth || var18 > Pix2D.safeWidth) {
					Pix3D.hclip = true;
				}
				if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var19, var20, var21, var16, var17, var18)) {
					clickTileX = arg0;
					clickTileZ = arg7;
				}
				if (arg4.triangleTextureIds == null || arg4.triangleTextureIds[var12] == -1) {
					if (arg4.triangleColourA[var12] != 12345678) {
						Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColourA[var12], arg4.triangleColourB[var12], arg4.triangleColourC[var12]);
					}
				} else if (lowMemory) {
					int var22 = TEXTURE_HSL[arg4.triangleTextureIds[var12]];
					Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, this.mulLightness(arg4.triangleColourA[var12], var22), this.mulLightness(arg4.triangleColourB[var12], var22), this.mulLightness(arg4.triangleColourC[var12], var22));
				} else if (arg4.flat) {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColourA[var12], arg4.triangleColourB[var12], arg4.triangleColourC[var12], TileOverlay.tmpViewspaceX[0], TileOverlay.tmpViewspaceX[1], TileOverlay.tmpViewspaceX[3], TileOverlay.tmpViewspaceY[0], TileOverlay.tmpViewspaceY[1], TileOverlay.tmpViewspaceY[3], TileOverlay.tmpViewspaceZ[0], TileOverlay.tmpViewspaceZ[1], TileOverlay.tmpViewspaceZ[3], arg4.triangleTextureIds[var12]);
				} else {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.triangleColourA[var12], arg4.triangleColourB[var12], arg4.triangleColourC[var12], TileOverlay.tmpViewspaceX[var13], TileOverlay.tmpViewspaceX[var14], TileOverlay.tmpViewspaceX[var15], TileOverlay.tmpViewspaceY[var13], TileOverlay.tmpViewspaceY[var14], TileOverlay.tmpViewspaceY[var15], TileOverlay.tmpViewspaceZ[var13], TileOverlay.tmpViewspaceZ[var14], TileOverlay.tmpViewspaceZ[var15], arg4.triangleTextureIds[var12]);
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
				int var7 = var6.minTileX - eyeTileX + 25;
				if (var7 >= 0 && var7 <= 50) {
					int var8 = var6.minTileZ - eyeTileZ + 25;
					if (var8 < 0) {
						var8 = 0;
					}
					int var9 = var6.maxTileZ - eyeTileZ + 25;
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
				int var12 = var6.minTileZ - eyeTileZ + 25;
				if (var12 >= 0 && var12 <= 50) {
					int var13 = var6.minTileX - eyeTileX + 25;
					if (var13 < 0) {
						var13 = 0;
					}
					int var14 = var6.maxTileX - eyeTileX + 25;
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
					int var18 = var6.minTileZ - eyeTileZ + 25;
					if (var18 < 0) {
						var18 = 0;
					}
					int var19 = var6.maxTileZ - eyeTileZ + 25;
					if (var19 > 50) {
						var19 = 50;
					}
					if (var18 <= var19) {
						int var20 = var6.minTileX - eyeTileX + 25;
						if (var20 < 0) {
							var20 = 0;
						}
						int var21 = var6.maxTileX - eyeTileX + 25;
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
	public boolean wallVisible(int arg0, int arg1, int arg2, int arg3) {
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
	public boolean visible(int arg0, int arg1, int arg2, int arg3) {
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
