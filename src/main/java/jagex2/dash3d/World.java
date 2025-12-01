package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

@ObfuscatedName("s")
public class World {

	@ObfuscatedName("s.h")
	public static boolean lowMem = true;

	@ObfuscatedName("s.i")
	public int maxLevel;

	@ObfuscatedName("s.j")
	public int maxTileX;

	@ObfuscatedName("s.k")
	public int maxTileZ;

	@ObfuscatedName("s.l")
	public int[][][] groundHeight;

	@ObfuscatedName("s.m")
	public Square[][][] groundh;

	@ObfuscatedName("s.n")
	public int minLevel;

	@ObfuscatedName("s.o")
	public int changedLocCount;

	@ObfuscatedName("s.p")
	public Sprite[] changedLocs = new Sprite[5000];

	@ObfuscatedName("s.q")
	public int[][][] mapo;

	@ObfuscatedName("s.r")
	public static int fillLeft;

	@ObfuscatedName("s.s")
	public static int topLevel;

	@ObfuscatedName("s.t")
	public static int cycleNo;

	@ObfuscatedName("s.u")
	public static int minX;

	@ObfuscatedName("s.v")
	public static int maxX;

	@ObfuscatedName("s.w")
	public static int minZ;

	@ObfuscatedName("s.x")
	public static int maxZ;

	@ObfuscatedName("s.y")
	public static int gx;

	@ObfuscatedName("s.z")
	public static int gz;

	@ObfuscatedName("s.ab")
	public static final int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("s.bb")
	public static final int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.cb")
	public static final int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.db")
	public static final int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("s.eb")
	public static final int[] TEXTURE_HSL = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("s.fb")
	public int[] mergeIndexA = new int[10000];

	@ObfuscatedName("s.gb")
	public int[] mergeIndexB = new int[10000];

	@ObfuscatedName("s.hb")
	public int tmpMergeIndex;

	@ObfuscatedName("s.ib")
	public int[][] MINIMAP_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("s.jb")
	public int[][] MINIMAP_ROTATE = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("s.kb")
	public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

	@ObfuscatedName("s.lb")
	public static boolean[][] visibilityMap;

	@ObfuscatedName("s.mb")
	public static int viewportCenterX;

	@ObfuscatedName("s.nb")
	public static int viewportCenterY;

	@ObfuscatedName("s.ob")
	public static int viewportLeft;

	@ObfuscatedName("s.pb")
	public static int viewportTop;

	@ObfuscatedName("s.qb")
	public static int viewportRight;

	@ObfuscatedName("s.rb")
	public static int viewportBottom;

	@ObfuscatedName("s.H")
	public static Sprite[] locBuffer = new Sprite[100];

	@ObfuscatedName("s.I")
	public static final int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("s.J")
	public static final int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("s.K")
	public static final int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("s.L")
	public static final int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("s.P")
	public static int groundX = -1;

	@ObfuscatedName("s.Q")
	public static int groundZ = -1;

	@ObfuscatedName("s.R")
	public static int LEVEL_COUNT = 4;

	@ObfuscatedName("s.S")
	public static int[] levelOccluderCount = new int[LEVEL_COUNT];

	@ObfuscatedName("s.T")
	public static Occlude[][] levelOccluders = new Occlude[LEVEL_COUNT][500];

	@ObfuscatedName("s.V")
	public static Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("s.W")
	public static LinkList fillQueue = new LinkList();

	@ObfuscatedName("s.X")
	public static final int[] PRETAB = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("s.Y")
	public static final int[] MIDTAB = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("s.Z")
	public static final int[] POSTTAB = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("s.A")
	public static int cx;

	@ObfuscatedName("s.B")
	public static int cy;

	@ObfuscatedName("s.C")
	public static int cz;

	@ObfuscatedName("s.D")
	public static int cameraSinX;

	@ObfuscatedName("s.E")
	public static int cameraCosX;

	@ObfuscatedName("s.F")
	public static int cameraSinY;

	@ObfuscatedName("s.G")
	public static int cameraCosY;

	@ObfuscatedName("s.N")
	public static int clickX;

	@ObfuscatedName("s.O")
	public static int clickY;

	@ObfuscatedName("s.U")
	public static int activeOccluderCount;

	@ObfuscatedName("s.M")
	public static boolean click;

	public World(int arg0, int arg1, int[][][] arg2, int arg4) {
		this.maxLevel = arg4;
		this.maxTileX = arg0;
		this.maxTileZ = arg1;
		this.groundh = new Square[arg4][arg0][arg1];
		this.mapo = new int[arg4][arg0 + 1][arg1 + 1];
		this.groundHeight = arg2;
		this.reset();
	}

	@ObfuscatedName("s.a(I)V")
	public static void unload() {
		locBuffer = null;
		levelOccluderCount = null;
		levelOccluders = null;
		fillQueue = null;
		visibilityMatrix = null;
		visibilityMap = null;
	}

	@ObfuscatedName("s.b(I)V")
	public void reset() {
		for (int var2 = 0; var2 < this.maxLevel; var2++) {
			for (int var3 = 0; var3 < this.maxTileX; var3++) {
				for (int var4 = 0; var4 < this.maxTileZ; var4++) {
					this.groundh[var2][var3][var4] = null;
				}
			}
		}
		for (int var5 = 0; var5 < LEVEL_COUNT; var5++) {
			for (int var6 = 0; var6 < levelOccluderCount[var5]; var6++) {
				levelOccluders[var5][var6] = null;
			}
			levelOccluderCount[var5] = 0;
		}
		for (int var7 = 0; var7 < this.changedLocCount; var7++) {
			this.changedLocs[var7] = null;
		}
		this.changedLocCount = 0;
		for (int var9 = 0; var9 < locBuffer.length; var9++) {
			locBuffer[var9] = null;
		}
	}

	@ObfuscatedName("s.a(BI)V")
	public void fillBaseLevel(int arg1) {
		this.minLevel = arg1;
		for (int var4 = 0; var4 < this.maxTileX; var4++) {
			for (int var5 = 0; var5 < this.maxTileZ; var5++) {
				this.groundh[arg1][var4][var5] = new Square(arg1, var4, var5);
			}
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void pushDown(int arg1, int arg2) {
		Square var4 = this.groundh[0][arg2][arg1];
		for (int var6 = 0; var6 < 3; var6++) {
			Square var7 = this.groundh[var6][arg2][arg1] = this.groundh[var6 + 1][arg2][arg1];
			if (var7 != null) {
				var7.level--;
				for (int var8 = 0; var8 < var7.primaryCount; var8++) {
					Sprite var9 = var7.sprite[var8];
					if ((var9.typecode >> 29 & 0x3) == 2 && var9.minTileX == arg2 && var9.minTileZ == arg1) {
						var9.level--;
					}
				}
			}
		}
		if (this.groundh[0][arg2][arg1] == null) {
			this.groundh[0][arg2][arg1] = new Square(0, arg2, arg1);
		}
		this.groundh[0][arg2][arg1].linkBelow = var4;
		this.groundh[3][arg2][arg1] = null;
	}

	@ObfuscatedName("s.a(IIIIIIIII)V")
	public static void setOcclude(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Occlude var9 = new Occlude();
		var9.minTileX = arg0 / 128;
		var9.maxTileX = arg4 / 128;
		var9.minTileZ = arg7 / 128;
		var9.maxTileZ = arg8 / 128;
		var9.type = arg2;
		var9.minX = arg0;
		var9.maxX = arg4;
		var9.minZ = arg7;
		var9.maxZ = arg8;
		var9.minY = arg3;
		var9.maxY = arg6;
		levelOccluders[arg5][levelOccluderCount[arg5]++] = var9;
	}

	@ObfuscatedName("s.a(IIII)V")
	public void setLayer(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.groundh[arg0][arg1][arg2];
		if (var5 != null) {
			this.groundh[arg0][arg1][arg2].drawLevel = arg3;
		}
	}

	@ObfuscatedName("s.a(IIIIIIIIIIIIIIIIIIII)V")
	public void setTile(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.groundh[var22][arg1][arg2] == null) {
					this.groundh[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.groundh[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.groundh[var24][arg1][arg2] == null) {
					this.groundh[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.groundh[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg13, arg17, arg9, arg6, arg1, arg3, arg2, arg15, arg5, arg10, arg11, arg18, arg4, arg14, arg12, arg16, arg7, arg8, arg19);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.groundh[var26][arg1][arg2] == null) {
					this.groundh[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.groundh[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("s.a(Ly;IIIIIIB)V")
	public void setGroundDecor(ModelSource arg0, int arg1, int arg2, int arg4, int arg5, int arg6, byte arg7) {
		if (arg0 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.model = arg0;
		var9.x = arg1 * 128 + 64;
		var9.z = arg5 * 128 + 64;
		var9.y = arg6;
		var9.typecode = arg2;
		var9.typecode2 = arg7;
		if (this.groundh[arg4][arg1][arg5] == null) {
			this.groundh[arg4][arg1][arg5] = new Square(arg4, arg1, arg5);
		}
		this.groundh[arg4][arg1][arg5].groundDecor = var9;
	}

	@ObfuscatedName("s.a(Ly;IILy;IZIILy;)V")
	public void setObj(ModelSource arg0, int arg1, int arg2, ModelSource arg3, int arg4, int arg6, int arg7, ModelSource arg8) {
		GroundObject var10 = new GroundObject();
		var10.top = arg0;
		var10.x = arg6 * 128 + 64;
		var10.z = arg7 * 128 + 64;
		var10.y = arg2;
		var10.typecode = arg1;
		var10.bottom = arg8;
		var10.middle = arg3;
		int var11 = 0;
		Square var12 = this.groundh[arg4][arg6][arg7];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.primaryCount; var13++) {
				if (var12.sprite[var13].model instanceof Model) {
					int var14 = ((Model) var12.sprite[var13].model).objRaise;
					if (var14 > var11) {
						var11 = var14;
					}
				}
			}
		}
		var10.height = var11;
		if (this.groundh[arg4][arg6][arg7] == null) {
			this.groundh[arg4][arg6][arg7] = new Square(arg4, arg6, arg7);
		}
		this.groundh[arg4][arg6][arg7].groundObject = var10;
	}

	@ObfuscatedName("s.a(Ly;Ly;IIIBBIIII)V")
	public void setWall(ModelSource arg0, ModelSource arg1, int arg2, int arg3, int arg4, byte arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg0 == null && arg1 == null) {
			return;
		}
		Wall var12 = new Wall();
		var12.typecode = arg2;
		var12.typecode2 = arg6;
		var12.x = arg7 * 128 + 64;
		var12.z = arg4 * 128 + 64;
		var12.y = arg8;
		var12.model1 = arg0;
		var12.model2 = arg1;
		var12.angle1 = arg9;
		var12.angle2 = arg3;
		for (int var14 = arg10; var14 >= 0; var14--) {
			if (this.groundh[var14][arg7][arg4] == null) {
				this.groundh[var14][arg7][arg4] = new Square(var14, arg7, arg4);
			}
		}
		this.groundh[arg10][arg7][arg4].wall = var12;
	}

	@ObfuscatedName("s.a(IIBIIIIIILy;IZ)V")
	public void setDecor(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, ModelSource arg9, int arg10) {
		if (arg9 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.typecode = arg5;
		var13.typecode2 = arg2;
		var13.x = arg4 * 128 + 64 + arg1;
		var13.z = arg7 * 128 + 64 + arg8;
		var13.y = arg3;
		var13.model = arg9;
		var13.wshape = arg0;
		var13.angle = arg6;
		for (int var14 = arg10; var14 >= 0; var14--) {
			if (this.groundh[var14][arg4][arg7] == null) {
				this.groundh[var14][arg4][arg7] = new Square(var14, arg4, arg7);
			}
		}
		this.groundh[arg10][arg4][arg7].decor = var13;
	}

	@ObfuscatedName("s.a(BIILy;IIIIIII)Z")
	public boolean addScenery(byte arg0, int arg1, int arg2, ModelSource arg3, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg3 == null) {
			return true;
		}
		int var12 = arg8 * 128 + arg1 * 64;
		int var13 = arg7 * 128 + arg5 * 64;
		return this.setSprite(arg10, arg8, arg7, arg1, arg5, var12, var13, arg2, arg3, arg9, false, arg6, arg0);
	}

	@ObfuscatedName("s.a(IIIILy;ZIIZI)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg6, int arg7, boolean arg8, int arg9) {
		if (arg4 == null) {
			return true;
		}
		int var11 = arg3 - arg2;
		int var12 = arg9 - arg2;
		int var13 = arg3 + arg2;
		int var14 = arg9 + arg2;
		if (arg8) {
			if (arg0 > 640 && arg0 < 1408) {
				var14 += 128;
			}
			if (arg0 > 1152 && arg0 < 1920) {
				var13 += 128;
			}
			if (arg0 > 1664 || arg0 < 384) {
				var12 -= 128;
			}
			if (arg0 > 128 && arg0 < 896) {
				var11 -= 128;
			}
		}
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		int var18 = var14 / 128;
		return this.setSprite(arg7, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg3, arg9, arg6, arg4, arg0, true, arg1, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIILy;IIZIII)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, int arg8, int arg10, int arg11, int arg12) {
		return arg6 == null ? true : this.setSprite(arg11, arg7, arg2, arg12 - arg7 + 1, arg4 - arg2 + 1, arg8, arg5, arg0, arg6, arg1, true, arg10, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.maxTileX || var15 >= this.maxTileZ) {
					return false;
				}
				Square var16 = this.groundh[arg0][var14][var15];
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
					if (this.groundh[var21][var18][var19] == null) {
						this.groundh[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.groundh[arg0][var18][var19];
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

	@ObfuscatedName("s.c(I)V")
	public void removeSprites() {
		for (int var2 = 0; var2 < this.changedLocCount; var2++) {
			Sprite var3 = this.changedLocs[var2];
			this.delSprite(var3);
			this.changedLocs[var2] = null;
		}
		this.changedLocCount = 0;
	}

	@ObfuscatedName("s.a(Lq;I)V")
	public void delSprite(Sprite arg0) {
		for (int var3 = arg0.minTileX; var3 <= arg0.maxTileX; var3++) {
			for (int var4 = arg0.minTileZ; var4 <= arg0.maxTileZ; var4++) {
				Square var5 = this.groundh[arg0.level][var3][var4];
				if (var5 != null) {
					for (int var6 = 0; var6 < var5.primaryCount; var6++) {
						if (var5.sprite[var6] == arg0) {
							var5.primaryCount--;
							for (int var7 = var6; var7 < var5.primaryCount; var7++) {
								var5.sprite[var7] = var5.sprite[var7 + 1];
								var5.primaryExtendDirections[var7] = var5.primaryExtendDirections[var7 + 1];
							}
							var5.sprite[var5.primaryCount] = null;
							break;
						}
					}
					var5.combinedPrimaryExtendDirections = 0;
					for (int var8 = 0; var8 < var5.primaryCount; var8++) {
						var5.combinedPrimaryExtendDirections |= var5.primaryExtendDirections[var8];
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIBII)V")
	public void setDecorOffset(int arg0, int arg1, int arg3, int arg4) {
		Square var7 = this.groundh[arg0][arg3][arg1];
		if (var7 == null) {
			return;
		}
		Decor var8 = var7.decor;
		if (var8 != null) {
			int var9 = arg3 * 128 + 64;
			int var10 = arg1 * 128 + 64;
			var8.x = var9 + (var8.x - var9) * arg4 / 16;
			var8.z = var10 + (var8.z - var10) * arg4 / 16;
		}
	}

	@ObfuscatedName("s.b(IIII)V")
	public void delWall(int arg0, int arg1, int arg3) {
		Square var5 = this.groundh[arg1][arg0][arg3];
		if (var5 != null) {
			var5.wall = null;
		}
	}

	@ObfuscatedName("s.a(IIZI)V")
	public void delDecor(int arg0, int arg1, int arg3) {
		Square var5 = this.groundh[arg3][arg0][arg1];
		if (var5 != null) {
			var5.decor = null;
		}
	}

	@ObfuscatedName("s.c(IIII)V")
	public void delLoc(int arg1, int arg2, int arg3) {
		Square var5 = this.groundh[arg3][arg2][arg1];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.primaryCount; var6++) {
			Sprite var7 = var5.sprite[var6];
			if ((var7.typecode >> 29 & 0x3) == 2 && var7.minTileX == arg2 && var7.minTileZ == arg1) {
				this.delSprite(var7);
				return;
			}
		}
	}

	@ObfuscatedName("s.b(IIZI)V")
	public void delGroundDecor(int arg0, int arg1, int arg3) {
		Square var5 = this.groundh[arg0][arg3][arg1];
		if (var5 != null) {
			var5.groundDecor = null;
		}
	}

	@ObfuscatedName("s.b(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = this.groundh[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("s.d(IIII)Lr;")
	public Wall getWall(int arg0, int arg1, int arg2) {
		Square var5 = this.groundh[arg0][arg1][arg2];
		return var5 == null ? null : var5.wall;
	}

	@ObfuscatedName("s.a(BIII)Li;")
	public Decor getDecor(int arg1, int arg2, int arg3) {
		Square var5 = this.groundh[arg3][arg1][arg2];
		return var5 == null ? null : var5.decor;
	}

	@ObfuscatedName("s.b(BIII)Lq;")
	public Sprite getScene(int arg1, int arg2, int arg3) {
		Square var5 = this.groundh[arg3][arg1][arg2];
		if (var5 == null) {
			return null;
		}
		for (int var6 = 0; var6 < var5.primaryCount; var6++) {
			Sprite var7 = var5.sprite[var6];
			if ((var7.typecode >> 29 & 0x3) == 2 && var7.minTileX == arg1 && var7.minTileZ == arg2) {
				return var7;
			}
		}
		return null;
	}

	@ObfuscatedName("s.a(IZII)Lk;")
	public GroundDecor getGd(int arg0, int arg2, int arg3) {
		Square var5 = this.groundh[arg0][arg2][arg3];
		return var5 == null || var5.groundDecor == null ? null : var5.groundDecor;
	}

	@ObfuscatedName("s.c(III)I")
	public int wallType(int arg0, int arg1, int arg2) {
		Square var4 = this.groundh[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.typecode;
	}

	@ObfuscatedName("s.e(IIII)I")
	public int decorType(int arg0, int arg1, int arg3) {
		Square var5 = this.groundh[arg1][arg0][arg3];
		return var5 == null || var5.decor == null ? 0 : var5.decor.typecode;
	}

	@ObfuscatedName("s.d(III)I")
	public int sceneType(int arg0, int arg1, int arg2) {
		Square var4 = this.groundh[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.primaryCount; var5++) {
			Sprite var6 = var4.sprite[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.minTileZ == arg2) {
				return var6.typecode;
			}
		}
		return 0;
	}

	@ObfuscatedName("s.e(III)I")
	public int gdType(int arg0, int arg1, int arg2) {
		Square var4 = this.groundh[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.typecode;
	}

	@ObfuscatedName("s.f(IIII)I")
	public int typecode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.groundh[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
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
	public void shareLight(int arg0, int arg2, int arg3, int arg4, int arg5) {
		int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
		int var8 = arg0 * var7 >> 8;
		for (int var9 = 0; var9 < this.maxLevel; var9++) {
			for (int var10 = 0; var10 < this.maxTileX; var10++) {
				for (int var11 = 0; var11 < this.maxTileZ; var11++) {
					Square var12 = this.groundh[var9][var10][var11];
					if (var12 != null) {
						Wall var13 = var12.wall;
						if (var13 != null && var13.model1 != null && var13.model1.vertexNormal != null) {
							this.shareLightLoc(var11, var10, var9, (Model) var13.model1, 1, 1);
							if (var13.model2 != null && var13.model2.vertexNormal != null) {
								this.shareLightLoc(var11, var10, var9, (Model) var13.model2, 1, 1);
								this.modelShareLight((Model) var13.model1, (Model) var13.model2, 0, 0, 0, false);
								((Model) var13.model2).light(arg2, var8, arg4, arg3, arg5);
							}
							((Model) var13.model1).light(arg2, var8, arg4, arg3, arg5);
						}
						for (int var14 = 0; var14 < var12.primaryCount; var14++) {
							Sprite var15 = var12.sprite[var14];
							if (var15 != null && var15.model != null && var15.model.vertexNormal != null) {
								this.shareLightLoc(var11, var10, var9, (Model) var15.model, var15.maxTileZ - var15.minTileZ + 1, var15.maxTileX - var15.minTileX + 1);
								((Model) var15.model).light(arg2, var8, arg4, arg3, arg5);
							}
						}
						GroundDecor var16 = var12.groundDecor;
						if (var16 != null && var16.model.vertexNormal != null) {
							this.shareLightGd((Model) var16.model, var11, var9, var10);
							((Model) var16.model).light(arg2, var8, arg4, arg3, arg5);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lfb;IIII)V")
	public void shareLightGd(Model arg0, int arg1, int arg2, int arg4) {
		if (arg4 < this.maxTileX) {
			Square var7 = this.groundh[arg2][arg4 + 1][arg1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.vertexNormal != null) {
				this.modelShareLight(arg0, (Model) var7.groundDecor.model, 128, 0, 0, true);
			}
		}
		if (arg1 < this.maxTileX) {
			Square var8 = this.groundh[arg2][arg4][arg1 + 1];
			if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.vertexNormal != null) {
				this.modelShareLight(arg0, (Model) var8.groundDecor.model, 0, 0, 128, true);
			}
		}
		if (arg4 < this.maxTileX && arg1 < this.maxTileZ) {
			Square var9 = this.groundh[arg2][arg4 + 1][arg1 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.model.vertexNormal != null) {
				this.modelShareLight(arg0, (Model) var9.groundDecor.model, 128, 0, 128, true);
			}
		}
		if (arg4 < this.maxTileX && arg1 > 0) {
			Square var10 = this.groundh[arg2][arg4 + 1][arg1 - 1];
			if (var10 != null && var10.groundDecor != null && var10.groundDecor.model.vertexNormal != null) {
				this.modelShareLight(arg0, (Model) var10.groundDecor.model, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("s.a(IIILfb;III)V")
	public void shareLightLoc(int arg0, int arg1, int arg2, Model arg3, int arg5, int arg6) {
		boolean var8 = true;
		int var9 = arg1;
		int var10 = arg1 + arg6;
		int var11 = arg0 - 1;
		int var12 = arg0 + arg5;
		for (int var14 = arg2; var14 <= arg2 + 1; var14++) {
			if (var14 != this.maxLevel) {
				for (int var15 = var9; var15 <= var10; var15++) {
					if (var15 >= 0 && var15 < this.maxTileX) {
						for (int var16 = var11; var16 <= var12; var16++) {
							if (var16 >= 0 && var16 < this.maxTileZ && (!var8 || var15 >= var10 || var16 >= var12 || var16 < arg0 && var15 != arg1)) {
								Square var17 = this.groundh[var14][var15][var16];
								if (var17 != null) {
									int var18 = (this.groundHeight[var14][var15][var16] + this.groundHeight[var14][var15 + 1][var16] + this.groundHeight[var14][var15][var16 + 1] + this.groundHeight[var14][var15 + 1][var16 + 1]) / 4 - (this.groundHeight[arg2][arg1][arg0] + this.groundHeight[arg2][arg1 + 1][arg0] + this.groundHeight[arg2][arg1][arg0 + 1] + this.groundHeight[arg2][arg1 + 1][arg0 + 1]) / 4;
									Wall var19 = var17.wall;
									if (var19 != null && var19.model1 != null && var19.model1.vertexNormal != null) {
										this.modelShareLight(arg3, (Model) var19.model1, (var15 - arg1) * 128 + (1 - arg6) * 64, var18, (var16 - arg0) * 128 + (1 - arg5) * 64, var8);
									}
									if (var19 != null && var19.model2 != null && var19.model2.vertexNormal != null) {
										this.modelShareLight(arg3, (Model) var19.model2, (var15 - arg1) * 128 + (1 - arg6) * 64, var18, (var16 - arg0) * 128 + (1 - arg5) * 64, var8);
									}
									for (int var20 = 0; var20 < var17.primaryCount; var20++) {
										Sprite var21 = var17.sprite[var20];
										if (var21 != null && var21.model != null && var21.model.vertexNormal != null) {
											int var22 = var21.maxTileX - var21.minTileX + 1;
											int var23 = var21.maxTileZ - var21.minTileZ + 1;
											this.modelShareLight(arg3, (Model) var21.model, (var21.minTileX - arg1) * 128 + (var22 - arg6) * 64, var18, (var21.minTileZ - arg0) * 128 + (var23 - arg5) * 64, var8);
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
	public void modelShareLight(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
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
		if (var7 < 3 || !arg5) {
			return;
		}
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

	@ObfuscatedName("s.a([IIIIII)V")
	public void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Square var7 = this.groundh[arg3][arg4][arg5];
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
			int var13 = var11.shapeAngle;
			int var14 = var11.underlayColour;
			int var15 = var11.overlayColour;
			int[] var16 = this.MINIMAP_SHAPE[var12];
			int[] var17 = this.MINIMAP_ROTATE[var13];
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
	}

	@ObfuscatedName("s.a(IIII[IZ)V")
	public static void init(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
		viewportLeft = 0;
		viewportTop = 0;
		viewportRight = arg1;
		viewportBottom = arg2;
		viewportCenterX = arg1 / 2;
		viewportCenterY = arg2 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];
		for (int var8 = 128; var8 <= 384; var8 += 32) {
			for (int var9 = 0; var9 < 2048; var9 += 64) {
				cameraSinX = Model.sinTable[var8];
				cameraCosX = Model.cosTable[var8];
				cameraSinY = Model.sinTable[var9];
				cameraCosY = Model.cosTable[var9];
				int var10 = (var8 - 128) / 32;
				int var11 = var9 / 64;
				for (int var12 = -26; var12 <= 26; var12++) {
					for (int var13 = -26; var13 <= 26; var13++) {
						int var14 = var12 * 128;
						int var15 = var13 * 128;
						boolean var16 = false;
						for (int var17 = -arg0; var17 <= arg3; var17 += 128) {
							if (testPoint(var15, var14, arg4[var10] + var17)) {
								var16 = true;
								break;
							}
						}
						var6[var10][var11][var12 + 25 + 1][var13 + 25 + 1] = var16;
					}
				}
			}
		}
		for (int var18 = 0; var18 < 8; var18++) {
			for (int var19 = 0; var19 < 32; var19++) {
				for (int var20 = -25; var20 < 25; var20++) {
					for (int var21 = -25; var21 < 25; var21++) {
						boolean var22 = false;
						label80: for (int var23 = -1; var23 <= 1; var23++) {
							for (int var24 = -1; var24 <= 1; var24++) {
								if (var6[var18][var19][var20 + var23 + 25 + 1][var21 + var24 + 25 + 1]) {
									var22 = true;
									break label80;
								}
								if (var6[var18][(var19 + 1) % 31][var20 + var23 + 25 + 1][var21 + var24 + 25 + 1]) {
									var22 = true;
									break label80;
								}
								if (var6[var18 + 1][var19][var20 + var23 + 25 + 1][var21 + var24 + 25 + 1]) {
									var22 = true;
									break label80;
								}
								if (var6[var18 + 1][(var19 + 1) % 31][var20 + var23 + 25 + 1][var21 + var24 + 25 + 1]) {
									var22 = true;
									break label80;
								}
							}
						}
						visibilityMatrix[var18][var19][var20 + 25][var21 + 25] = var22;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.g(IIII)Z")
	public static boolean testPoint(int arg1, int arg2, int arg3) {
		int var4 = arg1 * cameraSinY + arg2 * cameraCosY >> 16;
		int var5 = arg1 * cameraCosY - arg2 * cameraSinY >> 16;
		int var6 = arg3 * cameraSinX + var5 * cameraCosX >> 16;
		int var7 = arg3 * cameraCosX - var5 * cameraSinX >> 16;
		if (var6 >= 50 && var6 <= 3500) {
			int var8 = viewportCenterX + (var4 << 9) / var6;
			int var9 = viewportCenterY + (var7 << 9) / var6;
			return var8 >= viewportLeft && var8 <= viewportRight && var9 >= viewportTop && var9 <= viewportBottom;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.f(III)V")
	public void updateMousePicking(int arg1, int arg2) {
		click = true;
		clickX = arg2;
		clickY = arg1;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("s.a(IIIIIII)V")
	public void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.maxTileX * 128) {
			arg0 = this.maxTileX * 128 - 1;
		}
		if (arg1 < 0) {
			arg1 = 0;
		} else if (arg1 >= this.maxTileZ * 128) {
			arg1 = this.maxTileZ * 128 - 1;
		}
		cycleNo++;
		cameraSinX = Model.sinTable[arg2];
		cameraCosX = Model.cosTable[arg2];
		cameraSinY = Model.sinTable[arg5];
		cameraCosY = Model.cosTable[arg5];
		visibilityMap = visibilityMatrix[(arg2 - 128) / 32][arg5 / 64];
		cx = arg0;
		cy = arg3;
		cz = arg1;
		gx = arg0 / 128;
		gz = arg1 / 128;
		topLevel = arg4;
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
		for (int var8 = this.minLevel; var8 < this.maxLevel; var8++) {
			Square[][] var9 = this.groundh[var8];
			for (int var10 = minX; var10 < maxX; var10++) {
				for (int var11 = minZ; var11 < maxZ; var11++) {
					Square var12 = var9[var10][var11];
					if (var12 != null) {
						if (var12.drawLevel <= arg4 && (visibilityMap[var10 - gx + 25][var11 - gz + 25] || this.groundHeight[var8][var10][var11] - arg3 >= 2000)) {
							var12.drawFront = true;
							var12.drawBack = true;
							if (var12.primaryCount > 0) {
								var12.drawPrimaries = true;
							} else {
								var12.drawPrimaries = false;
							}
							fillLeft++;
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
			Square[][] var14 = this.groundh[var13];
			for (int var15 = -25; var15 <= 0; var15++) {
				int var16 = gx + var15;
				int var17 = gx - var15;
				if (var16 >= minX || var17 < maxX) {
					for (int var18 = -25; var18 <= 0; var18++) {
						int var19 = gz + var18;
						int var20 = gz - var18;
						if (var16 >= minX) {
							if (var19 >= minZ) {
								Square var21 = var14[var16][var19];
								if (var21 != null && var21.drawFront) {
									this.fill(var21, true);
								}
							}
							if (var20 < maxZ) {
								Square var22 = var14[var16][var20];
								if (var22 != null && var22.drawFront) {
									this.fill(var22, true);
								}
							}
						}
						if (var17 < maxX) {
							if (var19 >= minZ) {
								Square var23 = var14[var17][var19];
								if (var23 != null && var23.drawFront) {
									this.fill(var23, true);
								}
							}
							if (var20 < maxZ) {
								Square var24 = var14[var17][var20];
								if (var24 != null && var24.drawFront) {
									this.fill(var24, true);
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
		for (int var25 = this.minLevel; var25 < this.maxLevel; var25++) {
			Square[][] var26 = this.groundh[var25];
			for (int var27 = -25; var27 <= 0; var27++) {
				int var28 = gx + var27;
				int var29 = gx - var27;
				if (var28 >= minX || var29 < maxX) {
					for (int var30 = -25; var30 <= 0; var30++) {
						int var31 = gz + var30;
						int var32 = gz - var30;
						if (var28 >= minX) {
							if (var31 >= minZ) {
								Square var33 = var26[var28][var31];
								if (var33 != null && var33.drawFront) {
									this.fill(var33, false);
								}
							}
							if (var32 < maxZ) {
								Square var34 = var26[var28][var32];
								if (var34 != null && var34.drawFront) {
									this.fill(var34, false);
								}
							}
						}
						if (var29 < maxX) {
							if (var31 >= minZ) {
								Square var35 = var26[var29][var31];
								if (var35 != null && var35.drawFront) {
									this.fill(var35, false);
								}
							}
							if (var32 < maxZ) {
								Square var36 = var26[var29][var32];
								if (var36 != null && var36.drawFront) {
									this.fill(var36, false);
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
	}

	@ObfuscatedName("s.a(Lw;Z)V")
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
												var3 = (Square) fillQueue.pop();
												if (var3 == null) {
													return;
												}
											} while (!var3.drawBack);
											var4 = var3.x;
											var5 = var3.z;
											var6 = var3.level;
											var7 = var3.originalLevel;
											var8 = this.groundh[var6];
											if (!var3.drawFront) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.groundh[var6 - 1][var4][var5];
													if (var9 != null && var9.drawBack) {
														continue;
													}
												}
												if (var4 <= gx && var4 > minX) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.drawBack && (var10.drawFront || (var3.combinedPrimaryExtendDirections & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= gx && var4 < maxX - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.drawBack && (var11.drawFront || (var3.combinedPrimaryExtendDirections & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= gz && var5 > minZ) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.drawBack && (var12.drawFront || (var3.combinedPrimaryExtendDirections & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= gz && var5 < maxZ - 1) {
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
													if (var14.ground != null && !this.groundOccluded(0, var4, var5)) {
														this.renderGround(cameraCosY, cameraSinY, cameraSinX, cameraCosX, var14.ground, var4, var5);
													}
												} else if (!this.groundOccluded(0, var4, var5)) {
													this.renderQuickGround(var14.quickGround, 0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var15.x - cx, var15.y - cy, var15.z - cz, var15.typecode);
												}
												for (int var16 = 0; var16 < var14.primaryCount; var16++) {
													Sprite var17 = var14.sprite[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var17.x - cx, var17.y - cy, var17.z - cz, var17.typecode);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !this.groundOccluded(var7, var4, var5)) {
													var18 = true;
													this.renderGround(cameraCosY, cameraSinY, cameraSinX, cameraCosX, var3.ground, var4, var5);
												}
											} else if (!this.groundOccluded(var7, var4, var5)) {
												var18 = true;
												this.renderQuickGround(var3.quickGround, var7, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
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
													var21.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.x - cx, var21.y - cy, var21.z - cz, var21.typecode);
												}
												if ((var21.angle2 & var20) != 0 && !this.wallOccluded(var7, var4, var5, var21.angle2)) {
													var21.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var21.x - cx, var21.y - cy, var21.z - cz, var21.typecode);
												}
											}
											if (var22 != null && !this.spriteOccluded(var7, var4, var5, var22.model.minY)) {
												if ((var22.wshape & var20) != 0) {
													var22.model.worldRender(var22.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22.x - cx, var22.y - cy, var22.z - cz, var22.typecode);
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
														int var29 = var23 + WALL_DECORATION_INSET_X[var26];
														int var30 = var25 + WALL_DECORATION_INSET_Z[var26];
														var22.model.worldRender(var26 * 512 + 256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var29, var24, var30, var22.typecode);
													}
													if ((var22.wshape & 0x200) != 0 && var28 > var27) {
														int var31 = var23 + WALL_DECORATION_OUTSET_X[var26];
														int var32 = var25 + WALL_DECORATION_OUTSET_Z[var26];
														var22.model.worldRender(var26 * 512 + 1280 & 0x7FF, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var31, var24, var32, var22.typecode);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var33.x - cx, var33.y - cy, var33.z - cz, var33.typecode);
												}
												GroundObject var34 = var3.groundObject;
												if (var34 != null && var34.height == 0) {
													if (var34.bottom != null) {
														var34.bottom.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
													}
													if (var34.middle != null) {
														var34.middle.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
													}
													if (var34.top != null) {
														var34.top.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
													}
												}
											}
											int var35 = var3.combinedPrimaryExtendDirections;
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
											for (int var41 = 0; var41 < var3.primaryCount; var41++) {
												if (var3.sprite[var41].cycle != cycleNo && (var3.primaryExtendDirections[var41] & var3.cornerSides) == var3.sidesBeforeCorner) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!this.wallOccluded(var7, var4, var5, var42.angle1)) {
													var42.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var42.x - cx, var42.y - cy, var42.z - cz, var42.typecode);
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
										label556: for (int var45 = 0; var45 < var43; var45++) {
											Sprite var46 = var3.sprite[var45];
											if (var46.cycle != cycleNo) {
												for (int var47 = var46.minTileX; var47 <= var46.maxTileX; var47++) {
													for (int var48 = var46.minTileZ; var48 <= var46.maxTileZ; var48++) {
														Square var49 = var8[var47][var48];
														if (var49.drawFront) {
															var3.drawPrimaries = true;
															continue label556;
														}
														if (var49.cornerSides != 0) {
															int var50 = 0;
															if (var47 > var46.minTileX) {
																var50++;
															}
															if (var47 < var46.maxTileX) {
																var50 += 4;
															}
															if (var48 > var46.minTileZ) {
																var50 += 8;
															}
															if (var48 < var46.maxTileZ) {
																var50 += 2;
															}
															if ((var50 & var49.cornerSides) == var3.sidesAfterCorner) {
																var3.drawPrimaries = true;
																continue label556;
															}
														}
													}
												}
												locBuffer[var44++] = var46;
												int var51 = gx - var46.minTileX;
												int var52 = var46.maxTileX - gx;
												if (var52 > var51) {
													var51 = var52;
												}
												int var53 = gz - var46.minTileZ;
												int var54 = var46.maxTileZ - gz;
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
												if (var58.cycle != cycleNo) {
													if (var58.distance > var55) {
														var55 = var58.distance;
														var56 = var57;
													} else if (var58.distance == var55) {
														int var59 = var58.x - cx;
														int var60 = var58.z - cz;
														int var61 = locBuffer[var56].x - cx;
														int var62 = locBuffer[var56].z - cz;
														if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
															var56 = var57;
														}
													}
												}
											}
											if (var56 == -1) {
												break;
											}
											Sprite var63 = locBuffer[var56];
											var63.cycle = cycleNo;
											if (!this.spriteOccluded(var7, var63.minTileX, var63.maxTileX, var63.minTileZ, var63.maxTileZ, var63.model.minY)) {
												var63.model.worldRender(var63.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var63.x - cx, var63.y - cy, var63.z - cz, var63.typecode);
											}
											for (int var64 = var63.minTileX; var64 <= var63.maxTileX; var64++) {
												for (int var65 = var63.minTileZ; var65 <= var63.maxTileZ; var65++) {
													Square var66 = var8[var64][var65];
													if (var66.cornerSides != 0) {
														fillQueue.push(var66);
													} else if ((var64 != var4 || var65 != var5) && var66.drawBack) {
														fillQueue.push(var66);
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
				if (var71.bottom != null) {
					var71.bottom.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var71.x - cx, var71.y - cy - var71.height, var71.z - cz, var71.typecode);
				}
				if (var71.middle != null) {
					var71.middle.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var71.x - cx, var71.y - cy - var71.height, var71.z - cz, var71.typecode);
				}
				if (var71.top != null) {
					var71.top.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var71.x - cx, var71.y - cy - var71.height, var71.z - cz, var71.typecode);
				}
			}
			if (var3.backWallTypes != 0) {
				Decor var72 = var3.decor;
				if (var72 != null && !this.spriteOccluded(var7, var4, var5, var72.model.minY)) {
					if ((var72.wshape & var3.backWallTypes) != 0) {
						var72.model.worldRender(var72.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var72.x - cx, var72.y - cy, var72.z - cz, var72.typecode);
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
							int var79 = var73 + WALL_DECORATION_INSET_X[var76];
							int var80 = var75 + WALL_DECORATION_INSET_Z[var76];
							var72.model.worldRender(var76 * 512 + 256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var79, var74, var80, var72.typecode);
						}
						if ((var72.wshape & 0x200) != 0 && var78 <= var77) {
							int var81 = var73 + WALL_DECORATION_OUTSET_X[var76];
							int var82 = var75 + WALL_DECORATION_OUTSET_Z[var76];
							var72.model.worldRender(var76 * 512 + 1280 & 0x7FF, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var81, var74, var82, var72.typecode);
						}
					}
				}
				Wall var83 = var3.wall;
				if (var83 != null) {
					if ((var83.angle2 & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var83.angle2)) {
						var83.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var83.x - cx, var83.y - cy, var83.z - cz, var83.typecode);
					}
					if ((var83.angle1 & var3.backWallTypes) != 0 && !this.wallOccluded(var7, var4, var5, var83.angle1)) {
						var83.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var83.x - cx, var83.y - cy, var83.z - cz, var83.typecode);
					}
				}
			}
			if (var6 < this.maxLevel - 1) {
				Square var84 = this.groundh[var6 + 1][var4][var5];
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

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - cx;
		int var11;
		int var12 = var11 = (arg7 << 7) - cz;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.groundHeight[arg1][arg6][arg7] - cy;
		int var18 = this.groundHeight[arg1][arg6 + 1][arg7] - cy;
		int var19 = this.groundHeight[arg1][arg6 + 1][arg7 + 1] - cy;
		int var20 = this.groundHeight[arg1][arg6][arg7 + 1] - cy;
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
		int var45 = Pix3D.projectionX + (var21 << 9) / var25;
		int var46 = Pix3D.projectionY + (var24 << 9) / var25;
		int var47 = Pix3D.projectionX + (var27 << 9) / var31;
		int var48 = Pix3D.projectionY + (var30 << 9) / var31;
		int var49 = Pix3D.projectionX + (var33 << 9) / var37;
		int var50 = Pix3D.projectionY + (var36 << 9) / var37;
		int var51 = Pix3D.projectionX + (var39 << 9) / var43;
		int var52 = Pix3D.projectionY + (var42 << 9) / var43;
		Pix3D.trans = 0;
		if ((var49 - var51) * (var48 - var52) - (var50 - var52) * (var47 - var51) > 0) {
			Pix3D.hclip = false;
			if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.clipX || var51 > Pix2D.clipX || var47 > Pix2D.clipX) {
				Pix3D.hclip = true;
			}
			if (click && this.insideTriangle(clickX, clickY, var50, var52, var48, var49, var51, var47)) {
				groundX = arg6;
				groundZ = arg7;
			}
			if (arg0.textureId == -1) {
				if (arg0.neColour != 12345678) {
					Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.nwColour, arg0.seColour);
				}
			} else if (lowMem) {
				int var53 = TEXTURE_HSL[arg0.textureId];
				Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, this.mulLightness(arg0.neColour, var53), this.mulLightness(arg0.nwColour, var53), this.mulLightness(arg0.seColour, var53));
			} else if (arg0.flat) {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.nwColour, arg0.seColour, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
			} else {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.neColour, arg0.nwColour, arg0.seColour, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.textureId);
			}
		}
		if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
			Pix3D.hclip = false;
			if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.clipX || var47 > Pix2D.clipX || var51 > Pix2D.clipX) {
				Pix3D.hclip = true;
			}
			if (click && this.insideTriangle(clickX, clickY, var46, var48, var52, var45, var47, var51)) {
				groundX = arg6;
				groundZ = arg7;
			}
			if (arg0.textureId != -1) {
				if (!lowMem) {
					Pix3D.textureTriangle(var46, var48, var52, var45, var47, var51, arg0.swColour, arg0.seColour, arg0.nwColour, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.textureId);
					return;
				}
				int var54 = TEXTURE_HSL[arg0.textureId];
				Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, this.mulLightness(arg0.swColour, var54), this.mulLightness(arg0.seColour, var54), this.mulLightness(arg0.nwColour, var54));
			} else if (arg0.swColour != 12345678) {
				Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, arg0.swColour, arg0.seColour, arg0.nwColour);
			}
		}
	}

	@ObfuscatedName("s.a(IIZIILj;II)V")
	public void renderGround(int arg0, int arg1, int arg3, int arg4, Ground arg5, int arg6, int arg7) {
		int var9 = arg5.vertexX.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var11 = arg5.vertexX[var10] - cx;
			int var12 = arg5.vertexY[var10] - cy;
			int var13 = arg5.vertexZ[var10] - cz;
			int var14 = var13 * arg1 + var11 * arg0 >> 16;
			int var15 = var13 * arg0 - var11 * arg1 >> 16;
			int var17 = var12 * arg4 - var15 * arg3 >> 16;
			int var18 = var12 * arg3 + var15 * arg4 >> 16;
			if (var18 < 50) {
				return;
			}
			if (arg5.triangleTextureIds != null) {
				Ground.drawTextureVertexX[var10] = var14;
				Ground.drawTextureVertexY[var10] = var17;
				Ground.drawTextureVertexZ[var10] = var18;
			}
			Ground.drawVertexX[var10] = Pix3D.projectionX + (var14 << 9) / var18;
			Ground.drawVertexY[var10] = Pix3D.projectionY + (var17 << 9) / var18;
		}
		Pix3D.trans = 0;
		int var21 = arg5.triangleVertexA.length;
		for (int var22 = 0; var22 < var21; var22++) {
			int var23 = arg5.triangleVertexA[var22];
			int var24 = arg5.triangleVertexB[var22];
			int var25 = arg5.triangleVertexC[var22];
			int var26 = Ground.drawVertexX[var23];
			int var27 = Ground.drawVertexX[var24];
			int var28 = Ground.drawVertexX[var25];
			int var29 = Ground.drawVertexY[var23];
			int var30 = Ground.drawVertexY[var24];
			int var31 = Ground.drawVertexY[var25];
			if ((var26 - var27) * (var31 - var30) - (var29 - var30) * (var28 - var27) > 0) {
				Pix3D.hclip = false;
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.clipX || var27 > Pix2D.clipX || var28 > Pix2D.clipX) {
					Pix3D.hclip = true;
				}
				if (click && this.insideTriangle(clickX, clickY, var29, var30, var31, var26, var27, var28)) {
					groundX = arg6;
					groundZ = arg7;
				}
				if (arg5.triangleTextureIds == null || arg5.triangleTextureIds[var22] == -1) {
					if (arg5.triangleColourA[var22] != 12345678) {
						Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, arg5.triangleColourA[var22], arg5.triangleColourB[var22], arg5.triangleColourC[var22]);
					}
				} else if (lowMem) {
					int var32 = TEXTURE_HSL[arg5.triangleTextureIds[var22]];
					Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, this.mulLightness(arg5.triangleColourA[var22], var32), this.mulLightness(arg5.triangleColourB[var22], var32), this.mulLightness(arg5.triangleColourC[var22], var32));
				} else if (arg5.flat) {
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, arg5.triangleColourA[var22], arg5.triangleColourB[var22], arg5.triangleColourC[var22], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg5.triangleTextureIds[var22]);
				} else {
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, arg5.triangleColourA[var22], arg5.triangleColourB[var22], arg5.triangleColourC[var22], Ground.drawTextureVertexX[var23], Ground.drawTextureVertexX[var24], Ground.drawTextureVertexX[var25], Ground.drawTextureVertexY[var23], Ground.drawTextureVertexY[var24], Ground.drawTextureVertexY[var25], Ground.drawTextureVertexZ[var23], Ground.drawTextureVertexZ[var24], Ground.drawTextureVertexZ[var25], arg5.triangleTextureIds[var22]);
				}
			}
		}
	}

	@ObfuscatedName("s.a(IZI)I")
	public int mulLightness(int arg0, int arg2) {
		int var4 = 127 - arg0;
		int var5 = var4 * (arg2 & 0x7F) / 160;
		if (var5 < 2) {
			var5 = 2;
		} else if (var5 > 126) {
			var5 = 126;
		}
		return (arg2 & 0xFF80) + var5;
	}

	@ObfuscatedName("s.a(IIIIIIII)Z")
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

	@ObfuscatedName("s.d(I)V")
	public void calcOcclude() {
		int var2 = levelOccluderCount[topLevel];
		Occlude[] var3 = levelOccluders[topLevel];
		activeOccluderCount = 0;
		for (int var4 = 0; var4 < var2; var4++) {
			Occlude var5 = var3[var4];
			if (var5.type == 1) {
				int var6 = var5.minTileX - gx + 25;
				if (var6 >= 0 && var6 <= 50) {
					int var7 = var5.minTileZ - gz + 25;
					if (var7 < 0) {
						var7 = 0;
					}
					int var8 = var5.maxTileZ - gz + 25;
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
						int var10 = cx - var5.minX;
						if (var10 > 32) {
							var5.mode = 1;
						} else {
							if (var10 >= -32) {
								continue;
							}
							var5.mode = 2;
							var10 = -var10;
						}
						var5.minDeltaZ = (var5.minZ - cz << 8) / var10;
						var5.maxDeltaZ = (var5.maxZ - cz << 8) / var10;
						var5.minDeltaY = (var5.minY - cy << 8) / var10;
						var5.maxDeltaY = (var5.maxY - cy << 8) / var10;
						activeOccluders[activeOccluderCount++] = var5;
					}
				}
			} else if (var5.type == 2) {
				int var11 = var5.minTileZ - gz + 25;
				if (var11 >= 0 && var11 <= 50) {
					int var12 = var5.minTileX - gx + 25;
					if (var12 < 0) {
						var12 = 0;
					}
					int var13 = var5.maxTileX - gx + 25;
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
						int var15 = cz - var5.minZ;
						if (var15 > 32) {
							var5.mode = 3;
						} else {
							if (var15 >= -32) {
								continue;
							}
							var5.mode = 4;
							var15 = -var15;
						}
						var5.minDeltaX = (var5.minX - cx << 8) / var15;
						var5.maxDeltaX = (var5.maxX - cx << 8) / var15;
						var5.minDeltaY = (var5.minY - cy << 8) / var15;
						var5.maxDeltaY = (var5.maxY - cy << 8) / var15;
						activeOccluders[activeOccluderCount++] = var5;
					}
				}
			} else if (var5.type == 4) {
				int var16 = var5.minY - cy;
				if (var16 > 128) {
					int var17 = var5.minTileZ - gz + 25;
					if (var17 < 0) {
						var17 = 0;
					}
					int var18 = var5.maxTileZ - gz + 25;
					if (var18 > 50) {
						var18 = 50;
					}
					if (var17 <= var18) {
						int var19 = var5.minTileX - gx + 25;
						if (var19 < 0) {
							var19 = 0;
						}
						int var20 = var5.maxTileX - gx + 25;
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
							var5.minDeltaX = (var5.minX - cx << 8) / var16;
							var5.maxDeltaX = (var5.maxX - cx << 8) / var16;
							var5.minDeltaZ = (var5.minZ - cz << 8) / var16;
							var5.maxDeltaZ = (var5.maxZ - cz << 8) / var16;
							activeOccluders[activeOccluderCount++] = var5;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.g(III)Z")
	public boolean groundOccluded(int arg0, int arg1, int arg2) {
		int var4 = this.mapo[arg0][arg1][arg2];
		if (var4 == -cycleNo) {
			return false;
		} else if (var4 == cycleNo) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.occluded(var5 + 1, this.groundHeight[arg0][arg1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.groundHeight[arg0][arg1 + 1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.groundHeight[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.occluded(var5 + 1, this.groundHeight[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.mapo[arg0][arg1][arg2] = cycleNo;
				return true;
			} else {
				this.mapo[arg0][arg1][arg2] = -cycleNo;
				return false;
			}
		}
	}

	@ObfuscatedName("s.h(IIII)Z")
	public boolean wallOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!this.groundOccluded(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.groundHeight[arg0][arg1][arg2] - 1;
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
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("s.i(IIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (this.groundOccluded(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.occluded(var5 + 1, this.groundHeight[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundHeight[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.groundHeight[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.groundHeight[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.b(IIIIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.mapo[arg0][var9][var10] == -cycleNo) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.groundHeight[arg0][arg1][arg3] - arg5;
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
			return this.occluded(var7 + 1, this.groundHeight[arg0][arg1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.groundHeight[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.groundHeight[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.occluded(var7 + 1, this.groundHeight[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
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
