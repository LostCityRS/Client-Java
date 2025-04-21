package jagex2.dash3d;

import deob.*;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;
import jagex2.graphics.VertexNormal;

@ObfuscatedName("s")
public class World3D {

	@ObfuscatedName("s.a")
	public boolean field289 = true;

	@ObfuscatedName("s.b")
	public int field290 = 98;

	@ObfuscatedName("s.c")
	public static int field291 = 679;

	@ObfuscatedName("s.d")
	public boolean field292 = true;

	@ObfuscatedName("s.e")
	public static boolean field293;

	@ObfuscatedName("s.f")
	public int field294 = 7;

	@ObfuscatedName("s.g")
	public static boolean lowMemory = true;

	@ObfuscatedName("s.h")
	public int field296;

	@ObfuscatedName("s.i")
	public int field297;

	@ObfuscatedName("s.j")
	public int field298;

	@ObfuscatedName("s.k")
	public int[][][] field299;

	@ObfuscatedName("s.l")
	public Ground[][][] field300;

	@ObfuscatedName("s.m")
	public int field301;

	@ObfuscatedName("s.n")
	public int field302;

	@ObfuscatedName("s.o")
	public Location[] field303 = new Location[5000];

	@ObfuscatedName("s.p")
	public int[][][] field304;

	@ObfuscatedName("s.q")
	public static int field305;

	@ObfuscatedName("s.r")
	public static int field306;

	@ObfuscatedName("s.s")
	public static int field307;

	@ObfuscatedName("s.t")
	public static int field308;

	@ObfuscatedName("s.u")
	public static int field309;

	@ObfuscatedName("s.v")
	public static int field310;

	@ObfuscatedName("s.w")
	public static int field311;

	@ObfuscatedName("s.x")
	public static int field312;

	@ObfuscatedName("s.y")
	public static int field313;

	@ObfuscatedName("s.z")
	public static int field314;

	@ObfuscatedName("s.ab")
	public static final int[] field341 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.bb")
	public static final int[] field342 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.cb")
	public static final int[] field343 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("s.db")
	public static final int[] field344 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("s.eb")
	public int[] field345 = new int[10000];

	@ObfuscatedName("s.fb")
	public int[] field346 = new int[10000];

	@ObfuscatedName("s.gb")
	public int field347;

	@ObfuscatedName("s.hb")
	public int[][] field348 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("s.ib")
	public int[][] field349 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("s.jb")
	public static boolean[][][][] field350 = new boolean[8][32][51][51];

	@ObfuscatedName("s.kb")
	public static boolean[][] field351;

	@ObfuscatedName("s.lb")
	public static int field352;

	@ObfuscatedName("s.mb")
	public static int field353;

	@ObfuscatedName("s.nb")
	public static int field354;

	@ObfuscatedName("s.ob")
	public static int field355;

	@ObfuscatedName("s.pb")
	public static int field356;

	@ObfuscatedName("s.qb")
	public static int field357;

	@ObfuscatedName("s.G")
	public static Location[] field321 = new Location[100];

	@ObfuscatedName("s.H")
	public static final int[] field322 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("s.I")
	public static final int[] field323 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("s.J")
	public static final int[] field324 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("s.K")
	public static final int[] field325 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("s.O")
	public static int clickTileX = -1;

	@ObfuscatedName("s.P")
	public static int clickTileZ = -1;

	@ObfuscatedName("s.Q")
	public static int field331 = 4;

	@ObfuscatedName("s.R")
	public static int[] field332 = new int[field331];

	@ObfuscatedName("s.S")
	public static Occlude[][] field333 = new Occlude[field331][500];

	@ObfuscatedName("s.U")
	public static Occlude[] field335 = new Occlude[500];

	@ObfuscatedName("s.V")
	public static LinkList field336 = new LinkList((byte) 7);

	@ObfuscatedName("s.W")
	public static final int[] field337 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("s.X")
	public static final int[] field338 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("s.Y")
	public static final int[] field339 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("s.Z")
	public static final int[] field340 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("s.A")
	public static int field315;

	@ObfuscatedName("s.B")
	public static int field316;

	@ObfuscatedName("s.C")
	public static int field317;

	@ObfuscatedName("s.D")
	public static int field318;

	@ObfuscatedName("s.E")
	public static int field319;

	@ObfuscatedName("s.F")
	public static int field320;

	@ObfuscatedName("s.M")
	public static int field327;

	@ObfuscatedName("s.N")
	public static int field328;

	@ObfuscatedName("s.T")
	public static int field334;

	@ObfuscatedName("s.L")
	public static boolean field326;

	public World3D(int arg0, int[][][] arg1, int arg2, int arg3, boolean arg4) {
		this.field296 = arg3;
		this.field297 = arg2;
		this.field298 = arg0;
		this.field300 = new Ground[arg3][arg2][arg0];
		this.field304 = new int[arg3][arg2 + 1][arg0 + 1];
		this.field299 = arg1;
		if (!arg4) {
			this.field289 = !this.field289;
		}
		this.reset(0);
	}

	@ObfuscatedName("s.a(B)V")
	public static void unload(byte arg0) {
		field321 = null;
		field332 = null;
		field333 = null;
		field336 = null;
		if (arg0 != 9) {
			field293 = !field293;
		}
		field350 = null;
		field351 = null;
	}

	@ObfuscatedName("s.a(I)V")
	public void reset(int arg0) {
		for (int var2 = 0; var2 < this.field296; var2++) {
			for (int var8 = 0; var8 < this.field297; var8++) {
				for (int var9 = 0; var9 < this.field298; var9++) {
					this.field300[var2][var8][var9] = null;
				}
			}
		}
		for (int var3 = 0; var3 < field331; var3++) {
			for (int var7 = 0; var7 < field332[var3]; var7++) {
				field333[var3][var7] = null;
			}
			field332[var3] = 0;
		}
		for (int var4 = 0; var4 < this.field302; var4++) {
			this.field303[var4] = null;
		}
		this.field302 = 0;
		if (arg0 != 0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		for (int var6 = 0; var6 < field321.length; var6++) {
			field321[var6] = null;
		}
	}

	@ObfuscatedName("s.a(II)V")
	public void setMinLevel(int arg0, int arg1) {
		this.field301 = arg1;
		for (int var3 = 0; var3 < this.field297; var3++) {
			for (int var5 = 0; var5 < this.field298; var5++) {
				this.field300[arg1][var3][var5] = new Ground(arg1, var3, var5);
			}
		}
		while (arg0 >= 0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
	}

	@ObfuscatedName("s.a(ZII)V")
	public void method65(boolean arg0, int arg1, int arg2) {
		Ground var4 = this.field300[0][arg2][arg1];
		for (int var5 = 0; var5 < 3; var5++) {
			this.field300[var5][arg2][arg1] = this.field300[var5 + 1][arg2][arg1];
			if (this.field300[var5][arg2][arg1] != null) {
				this.field300[var5][arg2][arg1].field373--;
			}
		}
		if (this.field300[0][arg2][arg1] == null) {
			this.field300[0][arg2][arg1] = new Ground(0, arg2, arg1);
		}
		this.field300[0][arg2][arg1].field395 = var4;
		this.field300[3][arg2][arg1] = null;
		if (arg0) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
	}

	@ObfuscatedName("s.a(IIIIIIBII)V")
	public static void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
		Occlude var9 = new Occlude();
		var9.field237 = arg0 / 128;
		var9.field238 = arg5 / 128;
		var9.field239 = arg8 / 128;
		var9.field240 = arg3 / 128;
		var9.field241 = arg1;
		var9.field242 = arg0;
		var9.field243 = arg5;
		var9.field244 = arg8;
		var9.field245 = arg3;
		var9.field246 = arg7;
		if (arg6 == 6) {
			var9.field247 = arg2;
			field333[arg4][field332[arg4]++] = var9;
		}
	}

	@ObfuscatedName("s.a(IIII)V")
	public void method67(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg0][arg1][arg2];
		if (var5 != null) {
			this.field300[arg0][arg1][arg2].field387 = arg3;
		}
	}

	@ObfuscatedName("s.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.field300[var22][arg1][arg2] == null) {
					this.field300[var22][arg1][arg2] = new Ground(var22, arg1, arg2);
				}
			}
			this.field300[arg0][arg1][arg2].field377 = var21;
		} else if (arg3 == 1) {
			TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.field300[var24][arg1][arg2] == null) {
					this.field300[var24][arg1][arg2] = new Ground(var24, arg1, arg2);
				}
			}
			this.field300[arg0][arg1][arg2].field377 = var23;
		} else {
			TileOverlay var25 = new TileOverlay(arg13, arg8, arg19, arg18, arg3, arg6, arg5, arg11, arg4, arg14, arg16, arg1, false, arg9, arg17, arg2, arg12, arg15, arg10, arg7);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.field300[var26][arg1][arg2] == null) {
					this.field300[var26][arg1][arg2] = new Ground(var26, arg1, arg2);
				}
			}
			this.field300[arg0][arg1][arg2].field378 = var25;
		}
	}

	@ObfuscatedName("s.a(IIIIIILy;B)V")
	public void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, byte arg7) {
		if (arg3 != 0) {
			this.field294 = 236;
		}
		if (arg6 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.field209 = arg6;
		var9.field207 = arg2 * 128 + 64;
		var9.field208 = arg0 * 128 + 64;
		var9.field206 = arg5;
		var9.field210 = arg4;
		var9.field211 = arg7;
		if (this.field300[arg1][arg2][arg0] == null) {
			this.field300[arg1][arg2][arg0] = new Ground(arg1, arg2, arg0);
		}
		this.field300[arg1][arg2][arg0].field381 = var9;
	}

	@ObfuscatedName("s.a(IZIIILy;Ly;ILy;)V")
	public void method70(int arg0, boolean arg1, int arg2, int arg3, int arg4, Entity arg5, Entity arg6, int arg7, Entity arg8) {
		GroundObject var10 = new GroundObject();
		var10.field215 = arg6;
		var10.field213 = arg3 * 128 + 64;
		var10.field214 = arg4 * 128 + 64;
		var10.field212 = arg2;
		var10.field218 = arg0;
		var10.field216 = arg8;
		var10.field217 = arg5;
		int var11 = 0;
		Ground var12 = this.field300[arg7][arg3][arg4];
		if (arg1) {
			for (int var13 = 1; var13 > 0; var13++) {
			}
		}
		if (var12 != null) {
			for (int var14 = 0; var14 < var12.field383; var14++) {
				if (var12.field384[var14].field270 instanceof Model) {
					int var15 = ((Model) var12.field384[var14].field270).field571;
					if (var15 > var11) {
						var11 = var15;
					}
				}
			}
		}
		var10.field219 = var11;
		if (this.field300[arg7][arg3][arg4] == null) {
			this.field300[arg7][arg3][arg4] = new Ground(arg7, arg3, arg4);
		}
		this.field300[arg7][arg3][arg4].field382 = var10;
	}

	@ObfuscatedName("s.a(IIIIZIILy;Ly;BI)V")
	public void method71(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, Entity arg7, Entity arg8, byte arg9, int arg10) {
		if (arg8 == null && arg7 == null) {
			return;
		}
		Wall var12 = new Wall();
		var12.field287 = arg1;
		var12.field288 = arg9;
		var12.field281 = arg0 * 128 + 64;
		var12.field282 = arg10 * 128 + 64;
		var12.field280 = arg6;
		var12.field285 = arg8;
		var12.field286 = arg7;
		if (!arg4) {
			return;
		}
		var12.field283 = arg5;
		var12.field284 = arg3;
		for (int var13 = arg2; var13 >= 0; var13--) {
			if (this.field300[var13][arg0][arg10] == null) {
				this.field300[var13][arg0][arg10] = new Ground(var13, arg0, arg10);
			}
		}
		this.field300[arg2][arg0][arg10].field379 = var12;
	}

	@ObfuscatedName("s.a(BLy;IIIIIIIIII)V")
	public void method72(byte arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg7 != 1 || arg1 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.field177 = arg11;
		var13.field178 = arg0;
		var13.field172 = arg3 * 128 + 64 + arg2;
		var13.field173 = arg4 * 128 + 64 + arg6;
		var13.field171 = arg10;
		var13.field176 = arg1;
		var13.field174 = arg5;
		var13.field175 = arg8;
		for (int var14 = arg9; var14 >= 0; var14--) {
			if (this.field300[var14][arg3][arg4] == null) {
				this.field300[var14][arg3][arg4] = new Ground(var14, arg3, arg4);
			}
		}
		this.field300[arg9][arg3][arg4].field380 = var13;
	}

	@ObfuscatedName("s.a(BIIIIIIILy;II)Z")
	public boolean method73(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, int arg10) {
		if (arg2 != -21680) {
			throw new NullPointerException();
		} else if (arg8 == null) {
			return true;
		} else {
			int var12 = arg3 * 128 + arg6 * 64;
			int var13 = arg9 * 64 + arg10 * 128;
			return this.method76(arg4, arg3, arg10, arg6, arg9, var12, var13, arg5, arg8, arg7, false, arg1, arg0);
		}
	}

	@ObfuscatedName("s.a(IZIIILy;IZII)Z")
	public boolean addTemporary(int arg0, boolean arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, boolean arg7, int arg8, int arg9) {
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
		if (arg7) {
			throw new NullPointerException();
		}
		int var17 = var13 / 128;
		int var18 = var14 / 128;
		return this.method76(arg9, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg6, arg4, arg2, arg5, arg3, true, arg8, (byte) 0);
	}

	@ObfuscatedName("s.a(ILy;IIIBIIIIIII)Z")
	public boolean addTemporary(int arg0, Entity arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		if (arg5 != 7) {
			for (int var14 = 1; var14 > 0; var14++) {
			}
		}
		return arg1 == null ? true : this.method76(arg0, arg9, arg12, arg3 - arg9 + 1, arg4 - arg12 + 1, arg8, arg2, arg6, arg1, arg7, true, arg11, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
				if (var14 < 0 || var21 < 0 || var14 >= this.field297 || var21 >= this.field298) {
					return false;
				}
				Ground var22 = this.field300[arg0][var14][var21];
				if (var22 != null && var22.field383 >= 5) {
					return false;
				}
			}
		}
		Location var15 = new Location();
		var15.field278 = arg11;
		var15.field279 = arg12;
		var15.field266 = arg0;
		var15.field268 = arg5;
		var15.field269 = arg6;
		var15.field267 = arg7;
		var15.field270 = arg8;
		var15.field271 = arg9;
		var15.field272 = arg1;
		var15.field274 = arg2;
		var15.field273 = arg1 + arg3 - 1;
		var15.field275 = arg2 + arg4 - 1;
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
					if (this.field300[var19][var16][var17] == null) {
						this.field300[var19][var16][var17] = new Ground(var19, var16, var17);
					}
				}
				Ground var20 = this.field300[arg0][var16][var17];
				var20.field384[var20.field383] = var15;
				var20.field385[var20.field383] = var18;
				var20.field386 |= var18;
				var20.field383++;
			}
		}
		if (arg10) {
			this.field303[this.field302++] = var15;
		}
		return true;
	}

	@ObfuscatedName("s.b(B)V")
	public void method77(byte arg0) {
		for (int var2 = 0; var2 < this.field302; var2++) {
			Location var3 = this.field303[var2];
			this.method78(3, var3);
			this.field303[var2] = null;
		}
		if (arg0 == -48) {
			this.field302 = 0;
		}
	}

	@ObfuscatedName("s.a(ILq;)V")
	public void method78(int arg0, Location arg1) {
		int var3 = 98 / arg0;
		for (int var4 = arg1.field272; var4 <= arg1.field273; var4++) {
			for (int var5 = arg1.field274; var5 <= arg1.field275; var5++) {
				Ground var6 = this.field300[arg1.field266][var4][var5];
				if (var6 != null) {
					for (int var7 = 0; var7 < var6.field383; var7++) {
						if (var6.field384[var7] == arg1) {
							var6.field383--;
							for (int var8 = var7; var8 < var6.field383; var8++) {
								var6.field384[var8] = var6.field384[var8 + 1];
								var6.field385[var8] = var6.field385[var8 + 1];
							}
							var6.field384[var6.field383] = null;
							break;
						}
					}
					var6.field386 = 0;
					for (int var9 = 0; var9 < var6.field383; var9++) {
						var6.field386 |= var6.field385[var9];
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIII)V")
	public void method79(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Ground var6 = this.field300[arg3][arg1][arg2];
		if (var6 == null) {
			return;
		}
		Decor var7 = var6.field380;
		if (var7 == null) {
			return;
		}
		int var8 = arg1 * 128 + 64;
		int var9 = arg2 * 128 + 64;
		var7.field172 = (var7.field172 - var8) * arg0 / 16 + var8;
		if (arg4 < 2 || arg4 > 2) {
			for (int var10 = 1; var10 > 0; var10++) {
			}
		}
		var7.field173 = (var7.field173 - var9) * arg0 / 16 + var9;
	}

	@ObfuscatedName("s.b(IIII)V")
	public void method80(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg1][arg0][arg2];
		if (arg3 >= 0) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		if (var5 != null) {
			var5.field379 = null;
		}
	}

	@ObfuscatedName("s.a(IBII)V")
	public void method81(int arg0, byte arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg3][arg2][arg0];
		if (var5 != null) {
			var5.field380 = null;
			if (arg1 == 98) {
				;
			}
		}
	}

	@ObfuscatedName("s.c(IIII)V")
	public void method82(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg3][arg0][arg1];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.field383; var6++) {
			Location var7 = var5.field384[var6];
			if ((var7.field278 >> 29 & 0x3) == 2 && var7.field272 == arg0 && var7.field274 == arg1) {
				this.method78(3, var7);
				return;
			}
		}
		if (arg2 < 1 || arg2 > 1) {
			;
		}
	}

	@ObfuscatedName("s.d(IIII)V")
	public void method83(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg1][arg2][arg0];
		int var6 = 99 / arg3;
		if (var5 != null) {
			var5.field381 = null;
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void method84(int arg0, int arg1, int arg2) {
		Ground var4 = this.field300[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field382 = null;
		}
	}

	@ObfuscatedName("s.a(IIIZ)Lr;")
	public Wall method85(int arg0, int arg1, int arg2, boolean arg3) {
		if (!arg3) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		Ground var6 = this.field300[arg2][arg0][arg1];
		return var6 == null ? null : var6.field379;
	}

	@ObfuscatedName("s.e(IIII)Li;")
	public Decor method86(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg1][arg0][arg3];
		if (arg2 >= 0) {
			this.field294 = -412;
		}
		return var5 == null ? null : var5.field380;
	}

	@ObfuscatedName("s.f(IIII)Lq;")
	public Location method87(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg0][arg3][arg1];
		if (arg2 != 0) {
			throw new NullPointerException();
		} else if (var5 == null) {
			return null;
		} else {
			for (int var6 = 0; var6 < var5.field383; var6++) {
				Location var7 = var5.field384[var6];
				if ((var7.field278 >> 29 & 0x3) == 2 && var7.field272 == arg3 && var7.field274 == arg1) {
					return var7;
				}
			}
			return null;
		}
	}

	@ObfuscatedName("s.a(ZIII)Lk;")
	public GroundDecor method88(boolean arg0, int arg1, int arg2, int arg3) {
		if (arg0) {
			throw new NullPointerException();
		}
		Ground var5 = this.field300[arg3][arg1][arg2];
		return var5 == null || var5.field381 == null ? null : var5.field381;
	}

	@ObfuscatedName("s.b(III)I")
	public int getWallTypecode(int arg0, int arg1, int arg2) {
		Ground var4 = this.field300[arg0][arg1][arg2];
		return var4 == null || var4.field379 == null ? 0 : var4.field379.field287;
	}

	@ObfuscatedName("s.g(IIII)I")
	public int getDecorTypecode(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg2][arg3][arg0];
		if (arg1 == 0) {
			return var5 == null || var5.field380 == null ? 0 : var5.field380.field177;
		} else {
			return this.field290;
		}
	}

	@ObfuscatedName("s.c(III)I")
	public int getLocBitset(int arg0, int arg1, int arg2) {
		Ground var4 = this.field300[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field383; var5++) {
			Location var6 = var4.field384[var5];
			if ((var6.field278 >> 29 & 0x3) == 2 && var6.field272 == arg1 && var6.field274 == arg2) {
				return var6.field278;
			}
		}
		return 0;
	}

	@ObfuscatedName("s.d(III)I")
	public int getGroundDecorTypecode(int arg0, int arg1, int arg2) {
		Ground var4 = this.field300[arg0][arg1][arg2];
		return var4 == null || var4.field381 == null ? 0 : var4.field381.field210;
	}

	@ObfuscatedName("s.h(IIII)I")
	public int getInfo(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = this.field300[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.field379 != null && var5.field379.field287 == arg3) {
			return var5.field379.field288 & 0xFF;
		} else if (var5.field380 != null && var5.field380.field177 == arg3) {
			return var5.field380.field178 & 0xFF;
		} else if (var5.field381 != null && var5.field381.field210 == arg3) {
			return var5.field381.field211 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field383; var6++) {
				if (var5.field384[var6].field278 == arg3) {
					return var5.field384[var6].field279 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("s.a(IIIIII)V")
	public void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 >= 0) {
			return;
		}
		int var7 = (int) Math.sqrt((double) (arg1 * arg1 + arg0 * arg0 + arg3 * arg3));
		int var8 = arg5 * var7 >> 8;
		for (int var9 = 0; var9 < this.field296; var9++) {
			for (int var10 = 0; var10 < this.field297; var10++) {
				for (int var11 = 0; var11 < this.field298; var11++) {
					Ground var12 = this.field300[var9][var10][var11];
					if (var12 != null) {
						Wall var13 = var12.field379;
						if (var13 != null && var13.field285 != null && var13.field285.field399 != null) {
							this.method96(679, var11, (Model) var13.field285, var10, var9, 1, 1);
							if (var13.field286 != null && var13.field286.field399 != null) {
								this.method96(679, var11, (Model) var13.field286, var10, var9, 1, 1);
								this.method97((Model) var13.field285, (Model) var13.field286, 0, 0, 0, false);
								((Model) var13.field286).method156(arg4, var8, arg3, arg0, arg1);
							}
							((Model) var13.field285).method156(arg4, var8, arg3, arg0, arg1);
						}
						for (int var14 = 0; var14 < var12.field383; var14++) {
							Location var16 = var12.field384[var14];
							if (var16 != null && var16.field270 != null && var16.field270.field399 != null) {
								this.method96(679, var11, (Model) var16.field270, var10, var9, var16.field273 - var16.field272 + 1, var16.field275 - var16.field274 + 1);
								((Model) var16.field270).method156(arg4, var8, arg3, arg0, arg1);
							}
						}
						GroundDecor var15 = var12.field381;
						if (var15 != null && var15.field209.field399 != null) {
							this.method95(var11, -21889, var9, var10, (Model) var15.field209);
							((Model) var15.field209).method156(arg4, var8, arg3, arg0, arg1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIILfb;)V")
	public void method95(int arg0, int arg1, int arg2, int arg3, Model arg4) {
		if (arg1 != -21889) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		if (arg3 < this.field297) {
			Ground var7 = this.field300[arg2][arg3 + 1][arg0];
			if (var7 != null && var7.field381 != null && var7.field381.field209.field399 != null) {
				this.method97(arg4, (Model) var7.field381.field209, 128, 0, 0, true);
			}
		}
		if (arg0 < this.field297) {
			Ground var8 = this.field300[arg2][arg3][arg0 + 1];
			if (var8 != null && var8.field381 != null && var8.field381.field209.field399 != null) {
				this.method97(arg4, (Model) var8.field381.field209, 0, 0, 128, true);
			}
		}
		if (arg3 < this.field297 && arg0 < this.field298) {
			Ground var9 = this.field300[arg2][arg3 + 1][arg0 + 1];
			if (var9 != null && var9.field381 != null && var9.field381.field209.field399 != null) {
				this.method97(arg4, (Model) var9.field381.field209, 128, 0, 128, true);
			}
		}
		if (arg3 >= this.field297 || arg0 <= 0) {
			return;
		}
		Ground var10 = this.field300[arg2][arg3 + 1][arg0 - 1];
		if (var10 != null && var10.field381 != null && var10.field381.field209.field399 != null) {
			this.method97(arg4, (Model) var10.field381.field209, 128, 0, -128, true);
			return;
		}
	}

	@ObfuscatedName("s.a(IILfb;IIII)V")
	public void method96(int arg0, int arg1, Model arg2, int arg3, int arg4, int arg5, int arg6) {
		boolean var8 = true;
		int var9 = arg3;
		int var10 = arg3 + arg5;
		int var11 = arg1 - 1;
		int var12 = arg1 + arg6;
		for (int var13 = arg4; var13 <= arg4 + 1; var13++) {
			if (this.field296 != var13) {
				for (int var15 = var9; var15 <= var10; var15++) {
					if (var15 >= 0 && var15 < this.field297) {
						for (int var16 = var11; var16 <= var12; var16++) {
							if (var16 >= 0 && var16 < this.field298 && (!var8 || var15 >= var10 || var16 >= var12 || var16 < arg1 && arg3 != var15)) {
								Ground var17 = this.field300[var13][var15][var16];
								if (var17 != null) {
									int var18 = (this.field299[var13][var15 + 1][var16] + this.field299[var13][var15][var16] + this.field299[var13][var15][var16 + 1] + this.field299[var13][var15 + 1][var16 + 1]) / 4 - (this.field299[arg4][arg3 + 1][arg1] + this.field299[arg4][arg3][arg1] + this.field299[arg4][arg3][arg1 + 1] + this.field299[arg4][arg3 + 1][arg1 + 1]) / 4;
									Wall var19 = var17.field379;
									if (var19 != null && var19.field285 != null && var19.field285.field399 != null) {
										this.method97(arg2, (Model) var19.field285, (var15 - arg3) * 128 + (1 - arg5) * 64, var18, (var16 - arg1) * 128 + (1 - arg6) * 64, var8);
									}
									if (var19 != null && var19.field286 != null && var19.field286.field399 != null) {
										this.method97(arg2, (Model) var19.field286, (var15 - arg3) * 128 + (1 - arg5) * 64, var18, (var16 - arg1) * 128 + (1 - arg6) * 64, var8);
									}
									for (int var20 = 0; var20 < var17.field383; var20++) {
										Location var21 = var17.field384[var20];
										if (var21 != null && var21.field270 != null && var21.field270.field399 != null) {
											int var22 = var21.field273 - var21.field272 + 1;
											int var23 = var21.field275 - var21.field274 + 1;
											this.method97(arg2, (Model) var21.field270, (var21.field272 - arg3) * 128 + (var22 - arg5) * 64, var18, (var21.field274 - arg1) * 128 + (var23 - arg6) * 64, var8);
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
		int var14 = 42 / arg0;
	}

	@ObfuscatedName("s.a(Lfb;Lfb;IIIZ)V")
	public void method97(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.field347++;
		int var7 = 0;
		int[] var8 = arg1.vertexX;
		int var9 = arg1.vertexCount;
		for (int var10 = 0; var10 < arg0.vertexCount; var10++) {
			VertexNormal var13 = arg0.field399[var10];
			VertexNormal var14 = arg0.field577[var10];
			if (var14.w != 0) {
				int var15 = arg0.vertexY[var10] - arg3;
				if (var15 <= arg1.field568) {
					int var16 = arg0.vertexX[var10] - arg2;
					if (var16 >= arg1.field563 && var16 <= arg1.field564) {
						int var17 = arg0.vertexZ[var10] - arg4;
						if (var17 >= arg1.field566 && var17 <= arg1.field565) {
							for (int var18 = 0; var18 < var9; var18++) {
								VertexNormal var19 = arg1.field399[var18];
								VertexNormal var20 = arg1.field577[var18];
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
									this.field345[var10] = this.field347;
									this.field346[var18] = this.field347;
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
			if (this.field345[arg0.faceVertexA[var11]] == this.field347 && this.field345[arg0.faceVertexB[var11]] == this.field347 && this.field345[arg0.faceVertexC[var11]] == this.field347) {
				arg0.faceInfo[var11] = -1;
			}
		}
		for (int var12 = 0; var12 < arg1.faceCount; var12++) {
			if (this.field346[arg1.faceVertexA[var12]] == this.field347 && this.field346[arg1.faceVertexB[var12]] == this.field347 && this.field346[arg1.faceVertexC[var12]] == this.field347) {
				arg1.faceInfo[var12] = -1;
			}
		}
	}

	@ObfuscatedName("s.a([IIIIII)V")
	public void method98(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Ground var7 = this.field300[arg3][arg4][arg5];
		if (var7 == null) {
			return;
		}
		TileUnderlay var8 = var7.field377;
		if (var8 != null) {
			int var9 = var8.field265;
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
		TileOverlay var11 = var7.field378;
		if (var11 == null) {
			return;
		}
		int var12 = var11.field192;
		int var13 = var11.field193;
		int var14 = var11.field194;
		int var15 = var11.field195;
		int[] var16 = this.field348[var12];
		int[] var17 = this.field349[var13];
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
	public static void init(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5) {
		field354 = 0;
		if (arg2 != 1) {
			return;
		}
		field355 = 0;
		field356 = arg4;
		field357 = arg1;
		field352 = arg4 / 2;
		field353 = arg1 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];
		for (int var7 = 128; var7 <= 384; var7 += 32) {
			for (int var15 = 0; var15 < 2048; var15 += 64) {
				field317 = Model.sinTable[var7];
				field318 = Model.cosTable[var7];
				field319 = Model.sinTable[var15];
				field320 = Model.cosTable[var15];
				int var16 = (var7 - 128) / 32;
				int var17 = var15 / 64;
				for (int var18 = -26; var18 <= 26; var18++) {
					for (int var19 = -26; var19 <= 26; var19++) {
						int var20 = var18 * 128;
						int var21 = var19 * 128;
						boolean var22 = false;
						for (int var23 = -arg3; var23 <= arg0; var23 += 128) {
							if (method100(var21, arg5[var16] + var23, 6, var20)) {
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
						field350[var8][var9][var10 + 25][var11 + 25] = var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.i(IIII)Z")
	public static boolean method100(int arg0, int arg1, int arg2, int arg3) {
		int var4 = field320 * arg3 + field319 * arg0 >> 16;
		int var5 = field320 * arg0 - field319 * arg3 >> 16;
		int var6 = field318 * var5 + field317 * arg1 >> 16;
		int var7 = field318 * arg1 - field317 * var5 >> 16;
		if (arg2 != 6) {
			field291 = -152;
		}
		if (var6 >= 50 && var6 <= 3500) {
			int var8 = (var4 << 9) / var6 + field352;
			int var9 = (var7 << 9) / var6 + field353;
			return var8 >= field354 && var8 <= field356 && var9 >= field355 && var9 <= field357;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.a(BII)V")
	public void method101(byte arg0, int arg1, int arg2) {
		field326 = true;
		field327 = arg2;
		field328 = arg1;
		clickTileX = -1;
		clickTileZ = -1;
		if (arg0 != 38) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
	}

	@ObfuscatedName("s.a(IIIIIII)V")
	public void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.field297 * 128) {
			arg0 = this.field297 * 128 - 1;
		}
		if (arg5 < 0) {
			arg5 = 0;
		} else if (arg5 >= this.field298 * 128) {
			arg5 = this.field298 * 128 - 1;
		}
		field307++;
		field317 = Model.sinTable[arg4];
		field318 = Model.cosTable[arg4];
		field319 = Model.sinTable[arg3];
		field320 = Model.cosTable[arg3];
		field351 = field350[(arg4 - 128) / 32][arg3 / 64];
		field314 = arg0;
		field315 = arg6;
		field316 = arg5;
		field312 = arg0 / 128;
		field313 = arg5 / 128;
		field306 = arg1;
		field308 = field312 - 25;
		if (field308 < 0) {
			field308 = 0;
		}
		field310 = field313 - 25;
		if (field310 < 0) {
			field310 = 0;
		}
		field309 = field312 + 25;
		if (field309 > this.field297) {
			field309 = this.field297;
		}
		field311 = field313 + 25;
		if (field311 > this.field298) {
			field311 = this.field298;
		}
		this.method108(41);
		if (arg2 < 7 || arg2 > 7) {
			return;
		}
		field305 = 0;
		for (int var8 = this.field301; var8 < this.field296; var8++) {
			Ground[][] var33 = this.field300[var8];
			for (int var34 = field308; var34 < field309; var34++) {
				for (int var35 = field310; var35 < field311; var35++) {
					Ground var36 = var33[var34][var35];
					if (var36 != null) {
						if (var36.field387 <= arg1 && (field351[var34 - field312 + 25][var35 - field313 + 25] || this.field299[var8][var34][var35] - arg6 >= 2000)) {
							var36.field388 = true;
							var36.field389 = true;
							if (var36.field383 > 0) {
								var36.field390 = true;
							} else {
								var36.field390 = false;
							}
							field305++;
						} else {
							var36.field388 = false;
							var36.field389 = false;
							var36.field391 = 0;
						}
					}
				}
			}
		}
		for (int var9 = this.field301; var9 < this.field296; var9++) {
			Ground[][] var22 = this.field300[var9];
			for (int var23 = -25; var23 <= 0; var23++) {
				int var24 = field312 + var23;
				int var25 = field312 - var23;
				if (var24 >= field308 || var25 < field309) {
					for (int var26 = -25; var26 <= 0; var26++) {
						int var27 = field313 + var26;
						int var28 = field313 - var26;
						if (var24 >= field308) {
							if (var27 >= field310) {
								Ground var29 = var22[var24][var27];
								if (var29 != null && var29.field388) {
									this.method103(var29, true);
								}
							}
							if (var28 < field311) {
								Ground var30 = var22[var24][var28];
								if (var30 != null && var30.field388) {
									this.method103(var30, true);
								}
							}
						}
						if (var25 < field309) {
							if (var27 >= field310) {
								Ground var31 = var22[var25][var27];
								if (var31 != null && var31.field388) {
									this.method103(var31, true);
								}
							}
							if (var28 < field311) {
								Ground var32 = var22[var25][var28];
								if (var32 != null && var32.field388) {
									this.method103(var32, true);
								}
							}
						}
						if (field305 == 0) {
							field326 = false;
							return;
						}
					}
				}
			}
		}
		for (int var10 = this.field301; var10 < this.field296; var10++) {
			Ground[][] var11 = this.field300[var10];
			for (int var12 = -25; var12 <= 0; var12++) {
				int var13 = field312 + var12;
				int var14 = field312 - var12;
				if (var13 >= field308 || var14 < field309) {
					for (int var15 = -25; var15 <= 0; var15++) {
						int var16 = field313 + var15;
						int var17 = field313 - var15;
						if (var13 >= field308) {
							if (var16 >= field310) {
								Ground var18 = var11[var13][var16];
								if (var18 != null && var18.field388) {
									this.method103(var18, false);
								}
							}
							if (var17 < field311) {
								Ground var19 = var11[var13][var17];
								if (var19 != null && var19.field388) {
									this.method103(var19, false);
								}
							}
						}
						if (var14 < field309) {
							if (var16 >= field310) {
								Ground var20 = var11[var14][var16];
								if (var20 != null && var20.field388) {
									this.method103(var20, false);
								}
							}
							if (var17 < field311) {
								Ground var21 = var11[var14][var17];
								if (var21 != null && var21.field388) {
									this.method103(var21, false);
								}
							}
						}
						if (field305 == 0) {
							field326 = false;
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lw;Z)V")
	public void method103(Ground arg0, boolean arg1) {
		field336.addTail(arg0);
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
												var3 = (Ground) field336.removeHead();
												if (var3 == null) {
													return;
												}
											} while (!var3.field389);
											var4 = var3.field374;
											var5 = var3.field375;
											var6 = var3.field373;
											var7 = var3.field376;
											var8 = this.field300[var6];
											if (!var3.field388) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Ground var9 = this.field300[var6 - 1][var4][var5];
													if (var9 != null && var9.field389) {
														continue;
													}
												}
												if (var4 <= field312 && var4 > field308) {
													Ground var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field389 && (var10.field388 || (var3.field386 & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= field312 && var4 < field309 - 1) {
													Ground var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field389 && (var11.field388 || (var3.field386 & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= field313 && var5 > field310) {
													Ground var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field389 && (var12.field388 || (var3.field386 & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= field313 && var5 < field311 - 1) {
													Ground var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field389 && (var13.field388 || (var3.field386 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field388 = false;
											if (var3.field395 != null) {
												Ground var14 = var3.field395;
												if (var14.field377 == null) {
													if (var14.field378 != null && !this.method109(0, var4, var5)) {
														this.method105(var4, field317, field319, field320, var14.field378, field318, 656, var5);
													}
												} else if (!this.method109(0, var4, var5)) {
													this.method104(var14.field377, 0, field317, field318, field319, field320, var4, var5);
												}
												Wall var15 = var14.field379;
												if (var15 != null) {
													var15.field285.method121(0, field317, field318, field319, field320, var15.field281 - field314, var15.field280 - field315, var15.field282 - field316, var15.field287);
												}
												for (int var16 = 0; var16 < var14.field383; var16++) {
													Location var17 = var14.field384[var16];
													if (var17 != null) {
														var17.field270.method121(var17.field271, field317, field318, field319, field320, var17.field268 - field314, var17.field267 - field315, var17.field269 - field316, var17.field278);
													}
												}
											}
											boolean var18 = false;
											if (var3.field377 == null) {
												if (var3.field378 != null && !this.method109(var7, var4, var5)) {
													var18 = true;
													this.method105(var4, field317, field319, field320, var3.field378, field318, 656, var5);
												}
											} else if (!this.method109(var7, var4, var5)) {
												var18 = true;
												this.method104(var3.field377, var7, field317, field318, field319, field320, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.field379;
											Decor var22 = var3.field380;
											if (var21 != null || var22 != null) {
												if (field312 == var4) {
													var19++;
												} else if (field312 < var4) {
													var19 += 2;
												}
												if (field313 == var5) {
													var19 += 3;
												} else if (field313 > var5) {
													var19 += 6;
												}
												var20 = field337[var19];
												var3.field394 = field339[var19];
											}
											if (var21 != null) {
												if ((var21.field283 & field338[var19]) == 0) {
													var3.field391 = 0;
												} else if (var21.field283 == 16) {
													var3.field391 = 3;
													var3.field392 = field340[var19];
													var3.field393 = 3 - var3.field392;
												} else if (var21.field283 == 32) {
													var3.field391 = 6;
													var3.field392 = field341[var19];
													var3.field393 = 6 - var3.field392;
												} else if (var21.field283 == 64) {
													var3.field391 = 12;
													var3.field392 = field342[var19];
													var3.field393 = 12 - var3.field392;
												} else {
													var3.field391 = 9;
													var3.field392 = field343[var19];
													var3.field393 = 9 - var3.field392;
												}
												if ((var21.field283 & var20) != 0 && !this.method110(var7, var4, var5, var21.field283)) {
													var21.field285.method121(0, field317, field318, field319, field320, var21.field281 - field314, var21.field280 - field315, var21.field282 - field316, var21.field287);
												}
												if ((var21.field284 & var20) != 0 && !this.method110(var7, var4, var5, var21.field284)) {
													var21.field286.method121(0, field317, field318, field319, field320, var21.field281 - field314, var21.field280 - field315, var21.field282 - field316, var21.field287);
												}
											}
											if (var22 != null && !this.method111(var7, var4, var5, var22.field176.field400)) {
												if ((var22.field174 & var20) != 0) {
													var22.field176.method121(var22.field175, field317, field318, field319, field320, var22.field172 - field314, var22.field171 - field315, var22.field173 - field316, var22.field177);
												} else if ((var22.field174 & 0x300) != 0) {
													int var23 = var22.field172 - field314;
													int var24 = var22.field171 - field315;
													int var25 = var22.field173 - field316;
													int var26 = var22.field175;
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
													if ((var22.field174 & 0x100) != 0 && var28 < var27) {
														int var29 = field322[var26] + var23;
														int var30 = field323[var26] + var25;
														var22.field176.method121(var26 * 512 + 256, field317, field318, field319, field320, var29, var24, var30, var22.field177);
													}
													if ((var22.field174 & 0x200) != 0 && var28 > var27) {
														int var31 = field324[var26] + var23;
														int var32 = field325[var26] + var25;
														var22.field176.method121(var26 * 512 + 1280 & 0x7FF, field317, field318, field319, field320, var31, var24, var32, var22.field177);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.field381;
												if (var33 != null) {
													var33.field209.method121(0, field317, field318, field319, field320, var33.field207 - field314, var33.field206 - field315, var33.field208 - field316, var33.field210);
												}
												GroundObject var34 = var3.field382;
												if (var34 != null && var34.field219 == 0) {
													if (var34.field216 != null) {
														var34.field216.method121(0, field317, field318, field319, field320, var34.field213 - field314, var34.field212 - field315, var34.field214 - field316, var34.field218);
													}
													if (var34.field217 != null) {
														var34.field217.method121(0, field317, field318, field319, field320, var34.field213 - field314, var34.field212 - field315, var34.field214 - field316, var34.field218);
													}
													if (var34.field215 != null) {
														var34.field215.method121(0, field317, field318, field319, field320, var34.field213 - field314, var34.field212 - field315, var34.field214 - field316, var34.field218);
													}
												}
											}
											int var35 = var3.field386;
											if (var35 != 0) {
												if (var4 < field312 && (var35 & 0x4) != 0) {
													Ground var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field389) {
														field336.addTail(var36);
													}
												}
												if (var5 < field313 && (var35 & 0x2) != 0) {
													Ground var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.field389) {
														field336.addTail(var37);
													}
												}
												if (var4 > field312 && (var35 & 0x1) != 0) {
													Ground var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.field389) {
														field336.addTail(var38);
													}
												}
												if (var5 > field313 && (var35 & 0x8) != 0) {
													Ground var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.field389) {
														field336.addTail(var39);
													}
												}
											}
											break;
										}
										if (var3.field391 != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.field383; var41++) {
												if (field307 != var3.field384[var41].field277 && (var3.field385[var41] & var3.field391) == var3.field392) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.field379;
												if (!this.method110(var7, var4, var5, var42.field283)) {
													var42.field285.method121(0, field317, field318, field319, field320, var42.field281 - field314, var42.field280 - field315, var42.field282 - field316, var42.field287);
												}
												var3.field391 = 0;
											}
										}
										if (!var3.field390) {
											break;
										}
										int var43 = var3.field383;
										var3.field390 = false;
										int var44 = 0;
										label558: for (int var45 = 0; var45 < var43; var45++) {
											Location var54 = var3.field384[var45];
											if (field307 != var54.field277) {
												for (int var55 = var54.field272; var55 <= var54.field273; var55++) {
													for (int var60 = var54.field274; var60 <= var54.field275; var60++) {
														Ground var61 = var8[var55][var60];
														if (var61.field388) {
															var3.field390 = true;
															continue label558;
														}
														if (var61.field391 != 0) {
															int var62 = 0;
															if (var55 > var54.field272) {
																var62++;
															}
															if (var55 < var54.field273) {
																var62 += 4;
															}
															if (var60 > var54.field274) {
																var62 += 8;
															}
															if (var60 < var54.field275) {
																var62 += 2;
															}
															if ((var62 & var61.field391) == var3.field393) {
																var3.field390 = true;
																continue label558;
															}
														}
													}
												}
												field321[var44++] = var54;
												int var56 = field312 - var54.field272;
												int var57 = var54.field273 - field312;
												if (var57 > var56) {
													var56 = var57;
												}
												int var58 = field313 - var54.field274;
												int var59 = var54.field275 - field313;
												if (var59 > var58) {
													var54.field276 = var56 + var59;
												} else {
													var54.field276 = var56 + var58;
												}
											}
										}
										while (var44 > 0) {
											int var46 = -50;
											int var47 = -1;
											for (int var48 = 0; var48 < var44; var48++) {
												Location var53 = field321[var48];
												if (var53.field276 > var46 && field307 != var53.field277) {
													var46 = var53.field276;
													var47 = var48;
												}
											}
											if (var47 == -1) {
												break;
											}
											Location var49 = field321[var47];
											var49.field277 = field307;
											if (!this.method112(var7, var49.field272, var49.field273, var49.field274, var49.field275, var49.field270.field400)) {
												var49.field270.method121(var49.field271, field317, field318, field319, field320, var49.field268 - field314, var49.field267 - field315, var49.field269 - field316, var49.field278);
											}
											for (int var50 = var49.field272; var50 <= var49.field273; var50++) {
												for (int var51 = var49.field274; var51 <= var49.field275; var51++) {
													Ground var52 = var8[var50][var51];
													if (var52.field391 != 0) {
														field336.addTail(var52);
													} else if ((var4 != var50 || var5 != var51) && var52.field389) {
														field336.addTail(var52);
													}
												}
											}
										}
										if (!var3.field390) {
											break;
										}
									}
								} while (!var3.field389);
							} while (var3.field391 != 0);
							if (var4 > field312 || var4 <= field308) {
								break;
							}
							var63 = var8[var4 - 1][var5];
						} while (var63 != null && var63.field389);
						if (var4 < field312 || var4 >= field309 - 1) {
							break;
						}
						var64 = var8[var4 + 1][var5];
					} while (var64 != null && var64.field389);
					if (var5 > field313 || var5 <= field310) {
						break;
					}
					var65 = var8[var4][var5 - 1];
				} while (var65 != null && var65.field389);
				if (var5 < field313 || var5 >= field311 - 1) {
					break;
				}
				var66 = var8[var4][var5 + 1];
			} while (var66 != null && var66.field389);
			var3.field389 = false;
			field305--;
			GroundObject var67 = var3.field382;
			if (var67 != null && var67.field219 != 0) {
				if (var67.field216 != null) {
					var67.field216.method121(0, field317, field318, field319, field320, var67.field213 - field314, var67.field212 - field315 - var67.field219, var67.field214 - field316, var67.field218);
				}
				if (var67.field217 != null) {
					var67.field217.method121(0, field317, field318, field319, field320, var67.field213 - field314, var67.field212 - field315 - var67.field219, var67.field214 - field316, var67.field218);
				}
				if (var67.field215 != null) {
					var67.field215.method121(0, field317, field318, field319, field320, var67.field213 - field314, var67.field212 - field315 - var67.field219, var67.field214 - field316, var67.field218);
				}
			}
			if (var3.field394 != 0) {
				Decor var68 = var3.field380;
				if (var68 != null && !this.method111(var7, var4, var5, var68.field176.field400)) {
					if ((var68.field174 & var3.field394) != 0) {
						var68.field176.method121(var68.field175, field317, field318, field319, field320, var68.field172 - field314, var68.field171 - field315, var68.field173 - field316, var68.field177);
					} else if ((var68.field174 & 0x300) != 0) {
						int var69 = var68.field172 - field314;
						int var70 = var68.field171 - field315;
						int var71 = var68.field173 - field316;
						int var72 = var68.field175;
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
						if ((var68.field174 & 0x100) != 0 && var74 >= var73) {
							int var75 = field322[var72] + var69;
							int var76 = field323[var72] + var71;
							var68.field176.method121(var72 * 512 + 256, field317, field318, field319, field320, var75, var70, var76, var68.field177);
						}
						if ((var68.field174 & 0x200) != 0 && var74 <= var73) {
							int var77 = field324[var72] + var69;
							int var78 = field325[var72] + var71;
							var68.field176.method121(var72 * 512 + 1280 & 0x7FF, field317, field318, field319, field320, var77, var70, var78, var68.field177);
						}
					}
				}
				Wall var79 = var3.field379;
				if (var79 != null) {
					if ((var79.field284 & var3.field394) != 0 && !this.method110(var7, var4, var5, var79.field284)) {
						var79.field286.method121(0, field317, field318, field319, field320, var79.field281 - field314, var79.field280 - field315, var79.field282 - field316, var79.field287);
					}
					if ((var79.field283 & var3.field394) != 0 && !this.method110(var7, var4, var5, var79.field283)) {
						var79.field285.method121(0, field317, field318, field319, field320, var79.field281 - field314, var79.field280 - field315, var79.field282 - field316, var79.field287);
					}
				}
			}
			if (var6 < this.field296 - 1) {
				Ground var80 = this.field300[var6 + 1][var4][var5];
				if (var80 != null && var80.field389) {
					field336.addTail(var80);
				}
			}
			if (var4 < field312) {
				Ground var81 = var8[var4 + 1][var5];
				if (var81 != null && var81.field389) {
					field336.addTail(var81);
				}
			}
			if (var5 < field313) {
				Ground var82 = var8[var4][var5 + 1];
				if (var82 != null && var82.field389) {
					field336.addTail(var82);
				}
			}
			if (var4 > field312) {
				Ground var83 = var8[var4 - 1][var5];
				if (var83 != null && var83.field389) {
					field336.addTail(var83);
				}
			}
			if (var5 > field313) {
				Ground var84 = var8[var4][var5 - 1];
				if (var84 != null && var84.field389) {
					field336.addTail(var84);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void method104(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field314;
		int var11;
		int var12 = var11 = (arg7 << 7) - field316;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field299[arg1][arg6][arg7] - field315;
		int var18 = this.field299[arg1][arg6 + 1][arg7] - field315;
		int var19 = this.field299[arg1][arg6 + 1][arg7 + 1] - field315;
		int var20 = this.field299[arg1][arg6][arg7 + 1] - field315;
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
			if (field326 && this.method107(field327, field328, var50, var52, var48, var49, var51, var47)) {
				clickTileX = arg6;
				clickTileZ = arg7;
			}
			if (arg0.field263 == -1) {
				if (arg0.field261 != 12345678) {
					Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260);
				}
			} else if (lowMemory) {
				int var53 = field344[arg0.field263];
				Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, this.method106(arg0.field261, 705, var53), this.method106(arg0.field262, 705, var53), this.method106(arg0.field260, 705, var53));
			} else if (arg0.field264) {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field263);
			} else {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field263);
			}
		}
		if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.safeWidth || var47 > Pix2D.safeWidth || var51 > Pix2D.safeWidth) {
			Pix3D.hclip = true;
		}
		if (field326 && this.method107(field327, field328, var46, var48, var52, var45, var47, var51)) {
			clickTileX = arg6;
			clickTileZ = arg7;
		}
		if (arg0.field263 != -1) {
			if (!lowMemory) {
				Pix3D.textureTriangle(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field263);
				return;
			}
			int var54 = field344[arg0.field263];
			Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, this.method106(arg0.field259, 705, var54), this.method106(arg0.field260, 705, var54), this.method106(arg0.field262, 705, var54));
		} else if (arg0.field259 != 12345678) {
			Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262);
			return;
		}
	}

	@ObfuscatedName("s.a(IIIILj;III)V")
	public void method105(int arg0, int arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg6, int arg7) {
		int var9 = arg4.field181.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var23 = arg4.field181[var10] - field314;
			int var24 = arg4.field182[var10] - field315;
			int var25 = arg4.field183[var10] - field316;
			int var26 = arg2 * var25 + arg3 * var23 >> 16;
			int var27 = arg3 * var25 - arg2 * var23 >> 16;
			int var29 = arg5 * var24 - arg1 * var27 >> 16;
			int var30 = arg1 * var24 + arg5 * var27 >> 16;
			if (var30 < 50) {
				return;
			}
			if (arg4.field190 != null) {
				TileOverlay.field198[var10] = var26;
				TileOverlay.field199[var10] = var29;
				TileOverlay.field200[var10] = var30;
			}
			TileOverlay.field196[var10] = (var26 << 9) / var30 + Pix3D.centerX;
			TileOverlay.field197[var10] = (var29 << 9) / var30 + Pix3D.centerY;
		}
		Pix3D.trans = 0;
		int var11 = arg4.field187.length;
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = arg4.field187[var12];
			int var14 = arg4.field188[var12];
			int var15 = arg4.field189[var12];
			int var16 = TileOverlay.field196[var13];
			int var17 = TileOverlay.field196[var14];
			int var18 = TileOverlay.field196[var15];
			int var19 = TileOverlay.field197[var13];
			int var20 = TileOverlay.field197[var14];
			int var21 = TileOverlay.field197[var15];
			if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
				Pix3D.hclip = false;
				if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.safeWidth || var17 > Pix2D.safeWidth || var18 > Pix2D.safeWidth) {
					Pix3D.hclip = true;
				}
				if (field326 && this.method107(field327, field328, var19, var20, var21, var16, var17, var18)) {
					clickTileX = arg0;
					clickTileZ = arg7;
				}
				if (arg4.field190 == null || arg4.field190[var12] == -1) {
					if (arg4.field184[var12] != 12345678) {
						Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, arg4.field184[var12], arg4.field185[var12], arg4.field186[var12]);
					}
				} else if (lowMemory) {
					int var22 = field344[arg4.field190[var12]];
					Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, this.method106(arg4.field184[var12], 705, var22), this.method106(arg4.field185[var12], 705, var22), this.method106(arg4.field186[var12], 705, var22));
				} else if (arg4.field191) {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.field184[var12], arg4.field185[var12], arg4.field186[var12], TileOverlay.field198[0], TileOverlay.field198[1], TileOverlay.field198[3], TileOverlay.field199[0], TileOverlay.field199[1], TileOverlay.field199[3], TileOverlay.field200[0], TileOverlay.field200[1], TileOverlay.field200[3], arg4.field190[var12]);
				} else {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg4.field184[var12], arg4.field185[var12], arg4.field186[var12], TileOverlay.field198[var13], TileOverlay.field198[var14], TileOverlay.field198[var15], TileOverlay.field199[var13], TileOverlay.field199[var14], TileOverlay.field199[var15], TileOverlay.field200[var13], TileOverlay.field200[var14], TileOverlay.field200[var15], arg4.field190[var12]);
				}
			}
		}
		if (arg6 <= 0) {
			this.field289 = !this.field289;
		}
	}

	@ObfuscatedName("s.e(III)I")
	public int method106(int arg0, int arg1, int arg2) {
		if (arg1 <= 0) {
			this.field289 = !this.field289;
		}
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
	public boolean method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
	public void method108(int arg0) {
		int var2 = field332[field306];
		int var3 = 52 / arg0;
		Occlude[] var4 = field333[field306];
		field334 = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			Occlude var6 = var4[var5];
			if (var6.field241 == 1) {
				int var7 = var6.field237 - field312 + 25;
				if (var7 >= 0 && var7 <= 50) {
					int var8 = var6.field239 - field313 + 25;
					if (var8 < 0) {
						var8 = 0;
					}
					int var9 = var6.field240 - field313 + 25;
					if (var9 > 50) {
						var9 = 50;
					}
					boolean var10 = false;
					while (var8 <= var9) {
						if (field351[var7][var8++]) {
							var10 = true;
							break;
						}
					}
					if (var10) {
						int var11 = field314 - var6.field242;
						if (var11 > 32) {
							var6.field248 = 1;
						} else {
							if (var11 >= -32) {
								continue;
							}
							var6.field248 = 2;
							var11 = -var11;
						}
						var6.field251 = (var6.field244 - field316 << 8) / var11;
						var6.field252 = (var6.field245 - field316 << 8) / var11;
						var6.field253 = (var6.field246 - field315 << 8) / var11;
						var6.field254 = (var6.field247 - field315 << 8) / var11;
						field335[field334++] = var6;
					}
				}
			} else if (var6.field241 == 2) {
				int var12 = var6.field239 - field313 + 25;
				if (var12 >= 0 && var12 <= 50) {
					int var13 = var6.field237 - field312 + 25;
					if (var13 < 0) {
						var13 = 0;
					}
					int var14 = var6.field238 - field312 + 25;
					if (var14 > 50) {
						var14 = 50;
					}
					boolean var15 = false;
					while (var13 <= var14) {
						if (field351[var13++][var12]) {
							var15 = true;
							break;
						}
					}
					if (var15) {
						int var16 = field316 - var6.field244;
						if (var16 > 32) {
							var6.field248 = 3;
						} else {
							if (var16 >= -32) {
								continue;
							}
							var6.field248 = 4;
							var16 = -var16;
						}
						var6.field249 = (var6.field242 - field314 << 8) / var16;
						var6.field250 = (var6.field243 - field314 << 8) / var16;
						var6.field253 = (var6.field246 - field315 << 8) / var16;
						var6.field254 = (var6.field247 - field315 << 8) / var16;
						field335[field334++] = var6;
					}
				}
			} else if (var6.field241 == 4) {
				int var17 = var6.field246 - field315;
				if (var17 > 128) {
					int var18 = var6.field239 - field313 + 25;
					if (var18 < 0) {
						var18 = 0;
					}
					int var19 = var6.field240 - field313 + 25;
					if (var19 > 50) {
						var19 = 50;
					}
					if (var18 <= var19) {
						int var20 = var6.field237 - field312 + 25;
						if (var20 < 0) {
							var20 = 0;
						}
						int var21 = var6.field238 - field312 + 25;
						if (var21 > 50) {
							var21 = 50;
						}
						boolean var22 = false;
						label145: for (int var23 = var20; var23 <= var21; var23++) {
							for (int var24 = var18; var24 <= var19; var24++) {
								if (field351[var23][var24]) {
									var22 = true;
									break label145;
								}
							}
						}
						if (var22) {
							var6.field248 = 5;
							var6.field249 = (var6.field242 - field314 << 8) / var17;
							var6.field250 = (var6.field243 - field314 << 8) / var17;
							var6.field251 = (var6.field244 - field316 << 8) / var17;
							var6.field252 = (var6.field245 - field316 << 8) / var17;
							field335[field334++] = var6;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.f(III)Z")
	public boolean method109(int arg0, int arg1, int arg2) {
		int var4 = this.field304[arg0][arg1][arg2];
		if (-field307 == var4) {
			return false;
		} else if (field307 == var4) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.method113(var5 + 1, this.field299[arg0][arg1][arg2], var6 + 1) && this.method113(var5 + 128 - 1, this.field299[arg0][arg1 + 1][arg2], var6 + 1) && this.method113(var5 + 128 - 1, this.field299[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method113(var5 + 1, this.field299[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.field304[arg0][arg1][arg2] = field307;
				return true;
			} else {
				this.field304[arg0][arg1][arg2] = -field307;
				return false;
			}
		}
	}

	@ObfuscatedName("s.j(IIII)Z")
	public boolean method110(int arg0, int arg1, int arg2, int arg3) {
		if (!this.method109(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.field299[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field314) {
					if (!this.method113(var5, var7, var6)) {
						return false;
					}
					if (!this.method113(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method113(var5, var8, var6)) {
						return false;
					}
					if (!this.method113(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method113(var5, var9, var6)) {
					return false;
				}
				if (!this.method113(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < field316) {
					if (!this.method113(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.method113(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method113(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.method113(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method113(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.method113(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < field314) {
					if (!this.method113(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.method113(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method113(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.method113(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method113(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.method113(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > field316) {
					if (!this.method113(var5, var7, var6)) {
						return false;
					}
					if (!this.method113(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method113(var5, var8, var6)) {
						return false;
					}
					if (!this.method113(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.method113(var5, var9, var6)) {
					return false;
				}
				if (!this.method113(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method113(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method113(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.method113(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.method113(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.method113(var5, var9, var6);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("s.k(IIII)Z")
	public boolean method111(int arg0, int arg1, int arg2, int arg3) {
		if (this.method109(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.method113(var5 + 1, this.field299[arg0][arg1][arg2] - arg3, var6 + 1) && this.method113(var5 + 128 - 1, this.field299[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method113(var5 + 128 - 1, this.field299[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method113(var5 + 1, this.field299[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.b(IIIIII)Z")
	public boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var15 = arg3; var15 <= arg4; var15++) {
					if (this.field304[arg0][var9][var15] == -field307) {
						return false;
					}
				}
			}
			int var10 = (arg1 << 7) + 1;
			int var11 = (arg3 << 7) + 2;
			int var12 = this.field299[arg0][arg1][arg3] - arg5;
			if (!this.method113(var10, var12, var11)) {
				return false;
			}
			int var13 = (arg2 << 7) - 1;
			if (!this.method113(var13, var12, var11)) {
				return false;
			}
			int var14 = (arg4 << 7) - 1;
			if (!this.method113(var10, var12, var14)) {
				return false;
			} else if (this.method113(var13, var12, var14)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method109(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.method113(var7 + 1, this.field299[arg0][arg1][arg3] - arg5, var8 + 1) && this.method113(var7 + 128 - 1, this.field299[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method113(var7 + 128 - 1, this.field299[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method113(var7 + 1, this.field299[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.g(III)Z")
	public boolean method113(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field334; var4++) {
			Occlude var5 = field335[var4];
			if (var5.field248 == 1) {
				int var6 = var5.field242 - arg0;
				if (var6 > 0) {
					int var7 = (var5.field251 * var6 >> 8) + var5.field244;
					int var8 = (var5.field252 * var6 >> 8) + var5.field245;
					int var9 = (var5.field253 * var6 >> 8) + var5.field246;
					int var10 = (var5.field254 * var6 >> 8) + var5.field247;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field248 == 2) {
				int var11 = arg0 - var5.field242;
				if (var11 > 0) {
					int var12 = (var5.field251 * var11 >> 8) + var5.field244;
					int var13 = (var5.field252 * var11 >> 8) + var5.field245;
					int var14 = (var5.field253 * var11 >> 8) + var5.field246;
					int var15 = (var5.field254 * var11 >> 8) + var5.field247;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field248 == 3) {
				int var16 = var5.field244 - arg2;
				if (var16 > 0) {
					int var17 = (var5.field249 * var16 >> 8) + var5.field242;
					int var18 = (var5.field250 * var16 >> 8) + var5.field243;
					int var19 = (var5.field253 * var16 >> 8) + var5.field246;
					int var20 = (var5.field254 * var16 >> 8) + var5.field247;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field248 == 4) {
				int var21 = arg2 - var5.field244;
				if (var21 > 0) {
					int var22 = (var5.field249 * var21 >> 8) + var5.field242;
					int var23 = (var5.field250 * var21 >> 8) + var5.field243;
					int var24 = (var5.field253 * var21 >> 8) + var5.field246;
					int var25 = (var5.field254 * var21 >> 8) + var5.field247;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field248 == 5) {
				int var26 = arg1 - var5.field246;
				if (var26 > 0) {
					int var27 = (var5.field249 * var26 >> 8) + var5.field242;
					int var28 = (var5.field250 * var26 >> 8) + var5.field243;
					int var29 = (var5.field251 * var26 >> 8) + var5.field244;
					int var30 = (var5.field252 * var26 >> 8) + var5.field245;
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
