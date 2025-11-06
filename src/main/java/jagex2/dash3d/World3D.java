package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

@ObfuscatedName("s")
public class World3D {

	@ObfuscatedName("s.h")
	public static boolean field296 = true;

	@ObfuscatedName("s.i")
	public int field297;

	@ObfuscatedName("s.j")
	public int field298;

	@ObfuscatedName("s.k")
	public int field299;

	@ObfuscatedName("s.l")
	public int[][][] field300;

	@ObfuscatedName("s.m")
	public Square[][][] field301;

	@ObfuscatedName("s.n")
	public int field302;

	@ObfuscatedName("s.o")
	public int field303;

	@ObfuscatedName("s.p")
	public Sprite[] field304 = new Sprite[5000];

	@ObfuscatedName("s.q")
	public int[][][] field305;

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
	public static final int[] field341 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("s.bb")
	public static final int[] field342 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.cb")
	public static final int[] field343 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.db")
	public static final int[] field344 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("s.eb")
	public static final int[] field345 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("s.fb")
	public int[] field346 = new int[10000];

	@ObfuscatedName("s.gb")
	public int[] field347 = new int[10000];

	@ObfuscatedName("s.hb")
	public int field348;

	@ObfuscatedName("s.ib")
	public int[][] field349 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("s.jb")
	public int[][] field350 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("s.kb")
	public static boolean[][][][] field351 = new boolean[8][32][51][51];

	@ObfuscatedName("s.lb")
	public static boolean[][] field352;

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

	@ObfuscatedName("s.rb")
	public static int field358;

	@ObfuscatedName("s.H")
	public static Sprite[] field322 = new Sprite[100];

	@ObfuscatedName("s.I")
	public static final int[] field323 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("s.J")
	public static final int[] field324 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("s.K")
	public static final int[] field325 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("s.L")
	public static final int[] field326 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("s.P")
	public static int field330 = -1;

	@ObfuscatedName("s.Q")
	public static int field331 = -1;

	@ObfuscatedName("s.R")
	public static int field332 = 4;

	@ObfuscatedName("s.S")
	public static int[] field333 = new int[field332];

	@ObfuscatedName("s.T")
	public static Occlude[][] field334 = new Occlude[field332][500];

	@ObfuscatedName("s.V")
	public static Occlude[] field336 = new Occlude[500];

	@ObfuscatedName("s.W")
	public static LinkList field337 = new LinkList();

	@ObfuscatedName("s.X")
	public static final int[] field338 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("s.Y")
	public static final int[] field339 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("s.Z")
	public static final int[] field340 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

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

	@ObfuscatedName("s.G")
	public static int field321;

	@ObfuscatedName("s.N")
	public static int field328;

	@ObfuscatedName("s.O")
	public static int field329;

	@ObfuscatedName("s.U")
	public static int field335;

	@ObfuscatedName("s.M")
	public static boolean field327;

	public World3D(int arg0, int arg1, int[][][] arg2, int arg4) {
		this.field297 = arg4;
		this.field298 = arg0;
		this.field299 = arg1;
		this.field301 = new Square[arg4][arg0][arg1];
		this.field305 = new int[arg4][arg0 + 1][arg1 + 1];
		this.field300 = arg2;
		this.method64();
	}

	@ObfuscatedName("s.a(I)V")
	public static void method63() {
		field322 = null;
		field333 = null;
		field334 = null;
		field337 = null;
		field351 = null;
		field352 = null;
	}

	@ObfuscatedName("s.b(I)V")
	public void method64() {
		for (int var2 = 0; var2 < this.field297; var2++) {
			for (int var3 = 0; var3 < this.field298; var3++) {
				for (int var4 = 0; var4 < this.field299; var4++) {
					this.field301[var2][var3][var4] = null;
				}
			}
		}
		for (int var5 = 0; var5 < field332; var5++) {
			for (int var6 = 0; var6 < field333[var5]; var6++) {
				field334[var5][var6] = null;
			}
			field333[var5] = 0;
		}
		for (int var7 = 0; var7 < this.field303; var7++) {
			this.field304[var7] = null;
		}
		this.field303 = 0;
		for (int var9 = 0; var9 < field322.length; var9++) {
			field322[var9] = null;
		}
	}

	@ObfuscatedName("s.a(BI)V")
	public void method65(int arg1) {
		this.field302 = arg1;
		for (int var4 = 0; var4 < this.field298; var4++) {
			for (int var5 = 0; var5 < this.field299; var5++) {
				this.field301[arg1][var4][var5] = new Square(arg1, var4, var5);
			}
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void method66(int arg1, int arg2) {
		Square var4 = this.field301[0][arg2][arg1];
		for (int var6 = 0; var6 < 3; var6++) {
			Square var7 = this.field301[var6][arg2][arg1] = this.field301[var6 + 1][arg2][arg1];
			if (var7 != null) {
				var7.field378--;
				for (int var8 = 0; var8 < var7.field388; var8++) {
					Sprite var9 = var7.field389[var8];
					if ((var9.field278 >> 29 & 0x3) == 2 && var9.field272 == arg2 && var9.field274 == arg1) {
						var9.field266--;
					}
				}
			}
		}
		if (this.field301[0][arg2][arg1] == null) {
			this.field301[0][arg2][arg1] = new Square(0, arg2, arg1);
		}
		this.field301[0][arg2][arg1].field400 = var4;
		this.field301[3][arg2][arg1] = null;
	}

	@ObfuscatedName("s.a(IIIIIIIII)V")
	public static void method67(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Occlude var9 = new Occlude();
		var9.field237 = arg0 / 128;
		var9.field238 = arg4 / 128;
		var9.field239 = arg7 / 128;
		var9.field240 = arg8 / 128;
		var9.field241 = arg2;
		var9.field242 = arg0;
		var9.field243 = arg4;
		var9.field244 = arg7;
		var9.field245 = arg8;
		var9.field246 = arg3;
		var9.field247 = arg6;
		field334[arg5][field333[arg5]++] = var9;
	}

	@ObfuscatedName("s.a(IIII)V")
	public void method68(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field301[arg0][arg1][arg2];
		if (var5 != null) {
			this.field301[arg0][arg1][arg2].field392 = arg3;
		}
	}

	@ObfuscatedName("s.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.field301[var22][arg1][arg2] == null) {
					this.field301[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.field301[arg0][arg1][arg2].field382 = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.field301[var24][arg1][arg2] == null) {
					this.field301[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.field301[arg0][arg1][arg2].field382 = var23;
		} else {
			Ground var25 = new Ground(arg13, arg17, arg9, arg6, arg1, arg3, arg2, arg15, arg5, arg10, arg11, arg18, arg4, arg14, arg12, arg16, arg7, arg8, arg19);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.field301[var26][arg1][arg2] == null) {
					this.field301[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.field301[arg0][arg1][arg2].field383 = var25;
		}
	}

	@ObfuscatedName("s.a(Ly;IIIIIIB)V")
	public void method70(ModelSource arg0, int arg1, int arg2, int arg4, int arg5, int arg6, byte arg7) {
		if (arg0 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.field209 = arg0;
		var9.field207 = arg1 * 128 + 64;
		var9.field208 = arg5 * 128 + 64;
		var9.field206 = arg6;
		var9.field210 = arg2;
		var9.field211 = arg7;
		if (this.field301[arg4][arg1][arg5] == null) {
			this.field301[arg4][arg1][arg5] = new Square(arg4, arg1, arg5);
		}
		this.field301[arg4][arg1][arg5].field386 = var9;
	}

	@ObfuscatedName("s.a(Ly;IILy;IZIILy;)V")
	public void method71(ModelSource arg0, int arg1, int arg2, ModelSource arg3, int arg4, int arg6, int arg7, ModelSource arg8) {
		GroundObject var10 = new GroundObject();
		var10.field215 = arg0;
		var10.field213 = arg6 * 128 + 64;
		var10.field214 = arg7 * 128 + 64;
		var10.field212 = arg2;
		var10.field218 = arg1;
		var10.field216 = arg8;
		var10.field217 = arg3;
		int var11 = 0;
		Square var12 = this.field301[arg4][arg6][arg7];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field388; var13++) {
				if (var12.field389[var13].field270 instanceof Model) {
					int var14 = ((Model) var12.field389[var13].field270).field567;
					if (var14 > var11) {
						var11 = var14;
					}
				}
			}
		}
		var10.field219 = var11;
		if (this.field301[arg4][arg6][arg7] == null) {
			this.field301[arg4][arg6][arg7] = new Square(arg4, arg6, arg7);
		}
		this.field301[arg4][arg6][arg7].field387 = var10;
	}

	@ObfuscatedName("s.a(Ly;Ly;IIIBBIIII)V")
	public void method72(ModelSource arg0, ModelSource arg1, int arg2, int arg3, int arg4, byte arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg0 == null && arg1 == null) {
			return;
		}
		Wall var12 = new Wall();
		var12.field287 = arg2;
		var12.field288 = arg6;
		var12.field281 = arg7 * 128 + 64;
		var12.field282 = arg4 * 128 + 64;
		var12.field280 = arg8;
		var12.field285 = arg0;
		var12.field286 = arg1;
		var12.field283 = arg9;
		var12.field284 = arg3;
		for (int var14 = arg10; var14 >= 0; var14--) {
			if (this.field301[var14][arg7][arg4] == null) {
				this.field301[var14][arg7][arg4] = new Square(var14, arg7, arg4);
			}
		}
		this.field301[arg10][arg7][arg4].field384 = var12;
	}

	@ObfuscatedName("s.a(IIBIIIIIILy;IZ)V")
	public void method73(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, ModelSource arg9, int arg10) {
		if (arg9 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.field178 = arg5;
		var13.field179 = arg2;
		var13.field173 = arg4 * 128 + 64 + arg1;
		var13.field174 = arg7 * 128 + 64 + arg8;
		var13.field172 = arg3;
		var13.field177 = arg9;
		var13.field175 = arg0;
		var13.field176 = arg6;
		for (int var14 = arg10; var14 >= 0; var14--) {
			if (this.field301[var14][arg4][arg7] == null) {
				this.field301[var14][arg4][arg7] = new Square(var14, arg4, arg7);
			}
		}
		this.field301[arg10][arg4][arg7].field385 = var13;
	}

	@ObfuscatedName("s.a(BIILy;IIIIIII)Z")
	public boolean method74(byte arg0, int arg1, int arg2, ModelSource arg3, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg3 == null) {
			return true;
		}
		int var12 = arg8 * 128 + arg1 * 64;
		int var13 = arg7 * 128 + arg5 * 64;
		return this.method77(arg10, arg8, arg7, arg1, arg5, var12, var13, arg2, arg3, arg9, false, arg6, arg0);
	}

	@ObfuscatedName("s.a(IIIILy;ZIIZI)Z")
	public boolean method75(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg6, int arg7, boolean arg8, int arg9) {
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
		return this.method77(arg7, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg3, arg9, arg6, arg4, arg0, true, arg1, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIILy;IIZIII)Z")
	public boolean method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, int arg8, int arg10, int arg11, int arg12) {
		return arg6 == null ? true : this.method77(arg11, arg7, arg2, arg12 - arg7 + 1, arg4 - arg2 + 1, arg8, arg5, arg0, arg6, arg1, true, arg10, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.field298 || var15 >= this.field299) {
					return false;
				}
				Square var16 = this.field301[arg0][var14][var15];
				if (var16 != null && var16.field388 >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.field278 = arg11;
		var17.field279 = arg12;
		var17.field266 = arg0;
		var17.field268 = arg5;
		var17.field269 = arg6;
		var17.field267 = arg7;
		var17.field270 = arg8;
		var17.field271 = arg9;
		var17.field272 = arg1;
		var17.field274 = arg2;
		var17.field273 = arg1 + arg3 - 1;
		var17.field275 = arg2 + arg4 - 1;
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
					if (this.field301[var21][var18][var19] == null) {
						this.field301[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.field301[arg0][var18][var19];
				var22.field389[var22.field388] = var17;
				var22.field390[var22.field388] = var20;
				var22.field391 |= var20;
				var22.field388++;
			}
		}
		if (arg10) {
			this.field304[this.field303++] = var17;
		}
		return true;
	}

	@ObfuscatedName("s.c(I)V")
	public void method78() {
		for (int var2 = 0; var2 < this.field303; var2++) {
			Sprite var3 = this.field304[var2];
			this.method79(var3);
			this.field304[var2] = null;
		}
		this.field303 = 0;
	}

	@ObfuscatedName("s.a(Lq;I)V")
	public void method79(Sprite arg0) {
		for (int var3 = arg0.field272; var3 <= arg0.field273; var3++) {
			for (int var4 = arg0.field274; var4 <= arg0.field275; var4++) {
				Square var5 = this.field301[arg0.field266][var3][var4];
				if (var5 != null) {
					for (int var6 = 0; var6 < var5.field388; var6++) {
						if (var5.field389[var6] == arg0) {
							var5.field388--;
							for (int var7 = var6; var7 < var5.field388; var7++) {
								var5.field389[var7] = var5.field389[var7 + 1];
								var5.field390[var7] = var5.field390[var7 + 1];
							}
							var5.field389[var5.field388] = null;
							break;
						}
					}
					var5.field391 = 0;
					for (int var8 = 0; var8 < var5.field388; var8++) {
						var5.field391 |= var5.field390[var8];
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIBII)V")
	public void method80(int arg0, int arg1, int arg3, int arg4) {
		Square var7 = this.field301[arg0][arg3][arg1];
		if (var7 == null) {
			return;
		}
		Decor var8 = var7.field385;
		if (var8 != null) {
			int var9 = arg3 * 128 + 64;
			int var10 = arg1 * 128 + 64;
			var8.field173 = var9 + (var8.field173 - var9) * arg4 / 16;
			var8.field174 = var10 + (var8.field174 - var10) * arg4 / 16;
		}
	}

	@ObfuscatedName("s.b(IIII)V")
	public void method81(int arg0, int arg1, int arg3) {
		Square var5 = this.field301[arg1][arg0][arg3];
		if (var5 != null) {
			var5.field384 = null;
		}
	}

	@ObfuscatedName("s.a(IIZI)V")
	public void method82(int arg0, int arg1, int arg3) {
		Square var5 = this.field301[arg3][arg0][arg1];
		if (var5 != null) {
			var5.field385 = null;
		}
	}

	@ObfuscatedName("s.c(IIII)V")
	public void method83(int arg1, int arg2, int arg3) {
		Square var5 = this.field301[arg3][arg2][arg1];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.field388; var6++) {
			Sprite var7 = var5.field389[var6];
			if ((var7.field278 >> 29 & 0x3) == 2 && var7.field272 == arg2 && var7.field274 == arg1) {
				this.method79(var7);
				return;
			}
		}
	}

	@ObfuscatedName("s.b(IIZI)V")
	public void method84(int arg0, int arg1, int arg3) {
		Square var5 = this.field301[arg0][arg3][arg1];
		if (var5 != null) {
			var5.field386 = null;
		}
	}

	@ObfuscatedName("s.b(III)V")
	public void method85(int arg0, int arg1, int arg2) {
		Square var4 = this.field301[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field387 = null;
		}
	}

	@ObfuscatedName("s.d(IIII)Lr;")
	public Wall method86(int arg0, int arg1, int arg2) {
		Square var5 = this.field301[arg0][arg1][arg2];
		return var5 == null ? null : var5.field384;
	}

	@ObfuscatedName("s.a(BIII)Li;")
	public Decor method87(int arg1, int arg2, int arg3) {
		Square var5 = this.field301[arg3][arg1][arg2];
		return var5 == null ? null : var5.field385;
	}

	@ObfuscatedName("s.b(BIII)Lq;")
	public Sprite method88(int arg1, int arg2, int arg3) {
		Square var5 = this.field301[arg3][arg1][arg2];
		if (var5 == null) {
			return null;
		}
		for (int var6 = 0; var6 < var5.field388; var6++) {
			Sprite var7 = var5.field389[var6];
			if ((var7.field278 >> 29 & 0x3) == 2 && var7.field272 == arg1 && var7.field274 == arg2) {
				return var7;
			}
		}
		return null;
	}

	@ObfuscatedName("s.a(IZII)Lk;")
	public GroundDecor method89(int arg0, int arg2, int arg3) {
		Square var5 = this.field301[arg0][arg2][arg3];
		return var5 == null || var5.field386 == null ? null : var5.field386;
	}

	@ObfuscatedName("s.c(III)I")
	public int method90(int arg0, int arg1, int arg2) {
		Square var4 = this.field301[arg0][arg1][arg2];
		return var4 == null || var4.field384 == null ? 0 : var4.field384.field287;
	}

	@ObfuscatedName("s.e(IIII)I")
	public int method91(int arg0, int arg1, int arg3) {
		Square var5 = this.field301[arg1][arg0][arg3];
		return var5 == null || var5.field385 == null ? 0 : var5.field385.field178;
	}

	@ObfuscatedName("s.d(III)I")
	public int method92(int arg0, int arg1, int arg2) {
		Square var4 = this.field301[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field388; var5++) {
			Sprite var6 = var4.field389[var5];
			if ((var6.field278 >> 29 & 0x3) == 2 && var6.field272 == arg1 && var6.field274 == arg2) {
				return var6.field278;
			}
		}
		return 0;
	}

	@ObfuscatedName("s.e(III)I")
	public int method93(int arg0, int arg1, int arg2) {
		Square var4 = this.field301[arg0][arg1][arg2];
		return var4 == null || var4.field386 == null ? 0 : var4.field386.field210;
	}

	@ObfuscatedName("s.f(IIII)I")
	public int method94(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field301[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.field384 != null && var5.field384.field287 == arg3) {
			return var5.field384.field288 & 0xFF;
		} else if (var5.field385 != null && var5.field385.field178 == arg3) {
			return var5.field385.field179 & 0xFF;
		} else if (var5.field386 != null && var5.field386.field210 == arg3) {
			return var5.field386.field211 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field388; var6++) {
				if (var5.field389[var6].field278 == arg3) {
					return var5.field389[var6].field279 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("s.a(IIIIII)V")
	public void method95(int arg0, int arg2, int arg3, int arg4, int arg5) {
		int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
		int var8 = arg0 * var7 >> 8;
		for (int var9 = 0; var9 < this.field297; var9++) {
			for (int var10 = 0; var10 < this.field298; var10++) {
				for (int var11 = 0; var11 < this.field299; var11++) {
					Square var12 = this.field301[var9][var10][var11];
					if (var12 != null) {
						Wall var13 = var12.field384;
						if (var13 != null && var13.field285 != null && var13.field285.field405 != null) {
							this.method97(var11, var10, var9, (Model) var13.field285, 1, 1);
							if (var13.field286 != null && var13.field286.field405 != null) {
								this.method97(var11, var10, var9, (Model) var13.field286, 1, 1);
								this.method98((Model) var13.field285, (Model) var13.field286, 0, 0, 0);
								((Model) var13.field286).method157(arg2, var8, arg4, arg3, arg5);
							}
							((Model) var13.field285).method157(arg2, var8, arg4, arg3, arg5);
						}
						for (int var14 = 0; var14 < var12.field388; var14++) {
							Sprite var15 = var12.field389[var14];
							if (var15 != null && var15.field270 != null && var15.field270.field405 != null) {
								this.method97(var11, var10, var9, (Model) var15.field270, var15.field275 - var15.field274 + 1, var15.field273 - var15.field272 + 1);
								((Model) var15.field270).method157(arg2, var8, arg4, arg3, arg5);
							}
						}
						GroundDecor var16 = var12.field386;
						if (var16 != null && var16.field209.field405 != null) {
							this.method96((Model) var16.field209, var11, var9, var10);
							((Model) var16.field209).method157(arg2, var8, arg4, arg3, arg5);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lfb;IIII)V")
	public void method96(Model arg0, int arg1, int arg2, int arg4) {
		if (arg4 < this.field298) {
			Square var7 = this.field301[arg2][arg4 + 1][arg1];
			if (var7 != null && var7.field386 != null && var7.field386.field209.field405 != null) {
				this.method98(arg0, (Model) var7.field386.field209, 128, 0, 0);
			}
		}
		if (arg1 < this.field298) {
			Square var8 = this.field301[arg2][arg4][arg1 + 1];
			if (var8 != null && var8.field386 != null && var8.field386.field209.field405 != null) {
				this.method98(arg0, (Model) var8.field386.field209, 0, 0, 128);
			}
		}
		if (arg4 < this.field298 && arg1 < this.field299) {
			Square var9 = this.field301[arg2][arg4 + 1][arg1 + 1];
			if (var9 != null && var9.field386 != null && var9.field386.field209.field405 != null) {
				this.method98(arg0, (Model) var9.field386.field209, 128, 0, 128);
			}
		}
		if (arg4 < this.field298 && arg1 > 0) {
			Square var10 = this.field301[arg2][arg4 + 1][arg1 - 1];
			if (var10 != null && var10.field386 != null && var10.field386.field209.field405 != null) {
				this.method98(arg0, (Model) var10.field386.field209, 128, 0, -128);
			}
		}
	}

	@ObfuscatedName("s.a(IIILfb;III)V")
	public void method97(int arg0, int arg1, int arg2, Model arg3, int arg5, int arg6) {
		boolean var8 = true;
		int var9 = arg1;
		int var10 = arg1 + arg6;
		int var11 = arg0 - 1;
		int var12 = arg0 + arg5;
		for (int var14 = arg2; var14 <= arg2 + 1; var14++) {
			if (var14 != this.field297) {
				for (int var15 = var9; var15 <= var10; var15++) {
					if (var15 >= 0 && var15 < this.field298) {
						for (int var16 = var11; var16 <= var12; var16++) {
							if (var16 >= 0 && var16 < this.field299 && (!var8 || var15 >= var10 || var16 >= var12 || var16 < arg0 && var15 != arg1)) {
								Square var17 = this.field301[var14][var15][var16];
								if (var17 != null) {
									int var18 = (this.field300[var14][var15][var16] + this.field300[var14][var15 + 1][var16] + this.field300[var14][var15][var16 + 1] + this.field300[var14][var15 + 1][var16 + 1]) / 4 - (this.field300[arg2][arg1][arg0] + this.field300[arg2][arg1 + 1][arg0] + this.field300[arg2][arg1][arg0 + 1] + this.field300[arg2][arg1 + 1][arg0 + 1]) / 4;
									Wall var19 = var17.field384;
									if (var19 != null && var19.field285 != null && var19.field285.field405 != null) {
										this.method98(arg3, (Model) var19.field285, (var15 - arg1) * 128 + (1 - arg6) * 64, var18, (var16 - arg0) * 128 + (1 - arg5) * 64);
									}
									if (var19 != null && var19.field286 != null && var19.field286.field405 != null) {
										this.method98(arg3, (Model) var19.field286, (var15 - arg1) * 128 + (1 - arg6) * 64, var18, (var16 - arg0) * 128 + (1 - arg5) * 64);
									}
									for (int var20 = 0; var20 < var17.field388; var20++) {
										Sprite var21 = var17.field389[var20];
										if (var21 != null && var21.field270 != null && var21.field270.field405 != null) {
											int var22 = var21.field273 - var21.field272 + 1;
											int var23 = var21.field275 - var21.field274 + 1;
											this.method98(arg3, (Model) var21.field270, (var21.field272 - arg1) * 128 + (var22 - arg6) * 64, var18, (var21.field274 - arg0) * 128 + (var23 - arg5) * 64);
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
	public void method98(Model arg0, Model arg1, int arg2, int arg3, int arg4) {
		this.field348++;
		int var7 = 0;
		int[] var8 = arg1.field540;
		int var9 = arg1.field539;
		for (int var10 = 0; var10 < arg0.field539; var10++) {
			VertexNormal var11 = arg0.field405[var10];
			VertexNormal var12 = arg0.field573[var10];
			if (var12.field258 != 0) {
				int var13 = arg0.field541[var10] - arg3;
				if (var13 <= arg1.field564) {
					int var14 = arg0.field540[var10] - arg2;
					if (var14 >= arg1.field559 && var14 <= arg1.field560) {
						int var15 = arg0.field542[var10] - arg4;
						if (var15 >= arg1.field562 && var15 <= arg1.field561) {
							for (int var16 = 0; var16 < var9; var16++) {
								VertexNormal var17 = arg1.field405[var16];
								VertexNormal var18 = arg1.field573[var16];
								if (var14 == var8[var16] && var15 == arg1.field542[var16] && var13 == arg1.field541[var16] && var18.field258 != 0) {
									var11.field255 += var18.field255;
									var11.field256 += var18.field256;
									var11.field257 += var18.field257;
									var11.field258 += var18.field258;
									var17.field255 += var12.field255;
									var17.field256 += var12.field256;
									var17.field257 += var12.field257;
									var17.field258 += var12.field258;
									var7++;
									this.field346[var10] = this.field348;
									this.field347[var16] = this.field348;
								}
							}
						}
					}
				}
			}
		}
		if (var7 < 3) {
			return;
		}
		for (int var19 = 0; var19 < arg0.field543; var19++) {
			if (this.field346[arg0.field544[var19]] == this.field348 && this.field346[arg0.field545[var19]] == this.field348 && this.field346[arg0.field546[var19]] == this.field348) {
				arg0.field550[var19] = -1;
			}
		}
		for (int var20 = 0; var20 < arg1.field543; var20++) {
			if (this.field347[arg1.field544[var20]] == this.field348 && this.field347[arg1.field545[var20]] == this.field348 && this.field347[arg1.field546[var20]] == this.field348) {
				arg1.field550[var20] = -1;
			}
		}
	}

	@ObfuscatedName("s.a([IIIIII)V")
	public void method99(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Square var7 = this.field301[arg3][arg4][arg5];
		if (var7 == null) {
			return;
		}
		QuickGround var8 = var7.field382;
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
		Ground var11 = var7.field383;
		if (var11 == null) {
			return;
		}
		int var12 = var11.field192;
		int var13 = var11.field193;
		int var14 = var11.field194;
		int var15 = var11.field195;
		int[] var16 = this.field349[var12];
		int[] var17 = this.field350[var13];
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

	@ObfuscatedName("s.a(IIII[IZ)V")
	public static void method100(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
		field355 = 0;
		field356 = 0;
		field357 = arg1;
		field358 = arg2;
		field353 = arg1 / 2;
		field354 = arg2 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];
		for (int var8 = 128; var8 <= 384; var8 += 32) {
			for (int var9 = 0; var9 < 2048; var9 += 64) {
				field318 = Model.field602[var8];
				field319 = Model.field603[var8];
				field320 = Model.field602[var9];
				field321 = Model.field603[var9];
				int var10 = (var8 - 128) / 32;
				int var11 = var9 / 64;
				for (int var12 = -26; var12 <= 26; var12++) {
					for (int var13 = -26; var13 <= 26; var13++) {
						int var14 = var12 * 128;
						int var15 = var13 * 128;
						boolean var16 = false;
						for (int var17 = -arg0; var17 <= arg3; var17 += 128) {
							if (method101(var15, var14, arg4[var10] + var17)) {
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
						field351[var18][var19][var20 + 25][var21 + 25] = var22;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.g(IIII)Z")
	public static boolean method101(int arg1, int arg2, int arg3) {
		int var4 = arg1 * field320 + arg2 * field321 >> 16;
		int var5 = arg1 * field321 - arg2 * field320 >> 16;
		int var6 = arg3 * field318 + var5 * field319 >> 16;
		int var7 = arg3 * field319 - var5 * field318 >> 16;
		if (var6 >= 50 && var6 <= 3500) {
			int var8 = field353 + (var4 << 9) / var6;
			int var9 = field354 + (var7 << 9) / var6;
			return var8 >= field355 && var8 <= field357 && var9 >= field356 && var9 <= field358;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.f(III)V")
	public void method102(int arg1, int arg2) {
		field327 = true;
		field328 = arg2;
		field329 = arg1;
		field330 = -1;
		field331 = -1;
	}

	@ObfuscatedName("s.a(IIIIIII)V")
	public void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.field298 * 128) {
			arg0 = this.field298 * 128 - 1;
		}
		if (arg1 < 0) {
			arg1 = 0;
		} else if (arg1 >= this.field299 * 128) {
			arg1 = this.field299 * 128 - 1;
		}
		field308++;
		field318 = Model.field602[arg2];
		field319 = Model.field603[arg2];
		field320 = Model.field602[arg5];
		field321 = Model.field603[arg5];
		field352 = field351[(arg2 - 128) / 32][arg5 / 64];
		field315 = arg0;
		field316 = arg3;
		field317 = arg1;
		field313 = arg0 / 128;
		field314 = arg1 / 128;
		field307 = arg4;
		field309 = field313 - 25;
		if (field309 < 0) {
			field309 = 0;
		}
		field311 = field314 - 25;
		if (field311 < 0) {
			field311 = 0;
		}
		field310 = field313 + 25;
		if (field310 > this.field298) {
			field310 = this.field298;
		}
		field312 = field314 + 25;
		if (field312 > this.field299) {
			field312 = this.field299;
		}
		this.method109();
		field306 = 0;
		for (int var8 = this.field302; var8 < this.field297; var8++) {
			Square[][] var9 = this.field301[var8];
			for (int var10 = field309; var10 < field310; var10++) {
				for (int var11 = field311; var11 < field312; var11++) {
					Square var12 = var9[var10][var11];
					if (var12 != null) {
						if (var12.field392 <= arg4 && (field352[var10 - field313 + 25][var11 - field314 + 25] || this.field300[var8][var10][var11] - arg3 >= 2000)) {
							var12.field393 = true;
							var12.field394 = true;
							if (var12.field388 > 0) {
								var12.field395 = true;
							} else {
								var12.field395 = false;
							}
							field306++;
						} else {
							var12.field393 = false;
							var12.field394 = false;
							var12.field396 = 0;
						}
					}
				}
			}
		}
		for (int var13 = this.field302; var13 < this.field297; var13++) {
			Square[][] var14 = this.field301[var13];
			for (int var15 = -25; var15 <= 0; var15++) {
				int var16 = field313 + var15;
				int var17 = field313 - var15;
				if (var16 >= field309 || var17 < field310) {
					for (int var18 = -25; var18 <= 0; var18++) {
						int var19 = field314 + var18;
						int var20 = field314 - var18;
						if (var16 >= field309) {
							if (var19 >= field311) {
								Square var21 = var14[var16][var19];
								if (var21 != null && var21.field393) {
									this.method104(var21, true);
								}
							}
							if (var20 < field312) {
								Square var22 = var14[var16][var20];
								if (var22 != null && var22.field393) {
									this.method104(var22, true);
								}
							}
						}
						if (var17 < field310) {
							if (var19 >= field311) {
								Square var23 = var14[var17][var19];
								if (var23 != null && var23.field393) {
									this.method104(var23, true);
								}
							}
							if (var20 < field312) {
								Square var24 = var14[var17][var20];
								if (var24 != null && var24.field393) {
									this.method104(var24, true);
								}
							}
						}
						if (field306 == 0) {
							field327 = false;
							return;
						}
					}
				}
			}
		}
		for (int var25 = this.field302; var25 < this.field297; var25++) {
			Square[][] var26 = this.field301[var25];
			for (int var27 = -25; var27 <= 0; var27++) {
				int var28 = field313 + var27;
				int var29 = field313 - var27;
				if (var28 >= field309 || var29 < field310) {
					for (int var30 = -25; var30 <= 0; var30++) {
						int var31 = field314 + var30;
						int var32 = field314 - var30;
						if (var28 >= field309) {
							if (var31 >= field311) {
								Square var33 = var26[var28][var31];
								if (var33 != null && var33.field393) {
									this.method104(var33, false);
								}
							}
							if (var32 < field312) {
								Square var34 = var26[var28][var32];
								if (var34 != null && var34.field393) {
									this.method104(var34, false);
								}
							}
						}
						if (var29 < field310) {
							if (var31 >= field311) {
								Square var35 = var26[var29][var31];
								if (var35 != null && var35.field393) {
									this.method104(var35, false);
								}
							}
							if (var32 < field312) {
								Square var36 = var26[var29][var32];
								if (var36 != null && var36.field393) {
									this.method104(var36, false);
								}
							}
						}
						if (field306 == 0) {
							field327 = false;
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lw;Z)V")
	public void method104(Square arg0, boolean arg1) {
		field337.method255(arg0);
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
												var3 = (Square) field337.method257();
												if (var3 == null) {
													return;
												}
											} while (!var3.field394);
											var4 = var3.field379;
											var5 = var3.field380;
											var6 = var3.field378;
											var7 = var3.field381;
											var8 = this.field301[var6];
											if (!var3.field393) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.field301[var6 - 1][var4][var5];
													if (var9 != null && var9.field394) {
														continue;
													}
												}
												if (var4 <= field313 && var4 > field309) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field394 && (var10.field393 || (var3.field391 & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= field313 && var4 < field310 - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field394 && (var11.field393 || (var3.field391 & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= field314 && var5 > field311) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field394 && (var12.field393 || (var3.field391 & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= field314 && var5 < field312 - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field394 && (var13.field393 || (var3.field391 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field393 = false;
											if (var3.field400 != null) {
												Square var14 = var3.field400;
												if (var14.field382 == null) {
													if (var14.field383 != null && !this.method110(0, var4, var5)) {
														this.method106(field321, field320, field318, field319, var14.field383, var4, var5);
													}
												} else if (!this.method110(0, var4, var5)) {
													this.method105(var14.field382, 0, field318, field319, field320, field321, var4, var5);
												}
												Wall var15 = var14.field384;
												if (var15 != null) {
													var15.field285.method122(0, field318, field319, field320, field321, var15.field281 - field315, var15.field280 - field316, var15.field282 - field317, var15.field287);
												}
												for (int var16 = 0; var16 < var14.field388; var16++) {
													Sprite var17 = var14.field389[var16];
													if (var17 != null) {
														var17.field270.method122(var17.field271, field318, field319, field320, field321, var17.field268 - field315, var17.field267 - field316, var17.field269 - field317, var17.field278);
													}
												}
											}
											boolean var18 = false;
											if (var3.field382 == null) {
												if (var3.field383 != null && !this.method110(var7, var4, var5)) {
													var18 = true;
													this.method106(field321, field320, field318, field319, var3.field383, var4, var5);
												}
											} else if (!this.method110(var7, var4, var5)) {
												var18 = true;
												this.method105(var3.field382, var7, field318, field319, field320, field321, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.field384;
											Decor var22 = var3.field385;
											if (var21 != null || var22 != null) {
												if (field313 == var4) {
													var19++;
												} else if (field313 < var4) {
													var19 += 2;
												}
												if (field314 == var5) {
													var19 += 3;
												} else if (field314 > var5) {
													var19 += 6;
												}
												var20 = field338[var19];
												var3.field399 = field340[var19];
											}
											if (var21 != null) {
												if ((var21.field283 & field339[var19]) == 0) {
													var3.field396 = 0;
												} else if (var21.field283 == 16) {
													var3.field396 = 3;
													var3.field397 = field341[var19];
													var3.field398 = 3 - var3.field397;
												} else if (var21.field283 == 32) {
													var3.field396 = 6;
													var3.field397 = field342[var19];
													var3.field398 = 6 - var3.field397;
												} else if (var21.field283 == 64) {
													var3.field396 = 12;
													var3.field397 = field343[var19];
													var3.field398 = 12 - var3.field397;
												} else {
													var3.field396 = 9;
													var3.field397 = field344[var19];
													var3.field398 = 9 - var3.field397;
												}
												if ((var21.field283 & var20) != 0 && !this.method111(var7, var4, var5, var21.field283)) {
													var21.field285.method122(0, field318, field319, field320, field321, var21.field281 - field315, var21.field280 - field316, var21.field282 - field317, var21.field287);
												}
												if ((var21.field284 & var20) != 0 && !this.method111(var7, var4, var5, var21.field284)) {
													var21.field286.method122(0, field318, field319, field320, field321, var21.field281 - field315, var21.field280 - field316, var21.field282 - field317, var21.field287);
												}
											}
											if (var22 != null && !this.method112(var7, var4, var5, var22.field177.field406)) {
												if ((var22.field175 & var20) != 0) {
													var22.field177.method122(var22.field176, field318, field319, field320, field321, var22.field173 - field315, var22.field172 - field316, var22.field174 - field317, var22.field178);
												} else if ((var22.field175 & 0x300) != 0) {
													int var23 = var22.field173 - field315;
													int var24 = var22.field172 - field316;
													int var25 = var22.field174 - field317;
													int var26 = var22.field176;
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
													if ((var22.field175 & 0x100) != 0 && var28 < var27) {
														int var29 = var23 + field323[var26];
														int var30 = var25 + field324[var26];
														var22.field177.method122(var26 * 512 + 256, field318, field319, field320, field321, var29, var24, var30, var22.field178);
													}
													if ((var22.field175 & 0x200) != 0 && var28 > var27) {
														int var31 = var23 + field325[var26];
														int var32 = var25 + field326[var26];
														var22.field177.method122(var26 * 512 + 1280 & 0x7FF, field318, field319, field320, field321, var31, var24, var32, var22.field178);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.field386;
												if (var33 != null) {
													var33.field209.method122(0, field318, field319, field320, field321, var33.field207 - field315, var33.field206 - field316, var33.field208 - field317, var33.field210);
												}
												GroundObject var34 = var3.field387;
												if (var34 != null && var34.field219 == 0) {
													if (var34.field216 != null) {
														var34.field216.method122(0, field318, field319, field320, field321, var34.field213 - field315, var34.field212 - field316, var34.field214 - field317, var34.field218);
													}
													if (var34.field217 != null) {
														var34.field217.method122(0, field318, field319, field320, field321, var34.field213 - field315, var34.field212 - field316, var34.field214 - field317, var34.field218);
													}
													if (var34.field215 != null) {
														var34.field215.method122(0, field318, field319, field320, field321, var34.field213 - field315, var34.field212 - field316, var34.field214 - field317, var34.field218);
													}
												}
											}
											int var35 = var3.field391;
											if (var35 != 0) {
												if (var4 < field313 && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field394) {
														field337.method255(var36);
													}
												}
												if (var5 < field314 && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.field394) {
														field337.method255(var37);
													}
												}
												if (var4 > field313 && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.field394) {
														field337.method255(var38);
													}
												}
												if (var5 > field314 && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.field394) {
														field337.method255(var39);
													}
												}
											}
											break;
										}
										if (var3.field396 != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.field388; var41++) {
												if (var3.field389[var41].field277 != field308 && (var3.field390[var41] & var3.field396) == var3.field397) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.field384;
												if (!this.method111(var7, var4, var5, var42.field283)) {
													var42.field285.method122(0, field318, field319, field320, field321, var42.field281 - field315, var42.field280 - field316, var42.field282 - field317, var42.field287);
												}
												var3.field396 = 0;
											}
										}
										if (!var3.field395) {
											break;
										}
										int var43 = var3.field388;
										var3.field395 = false;
										int var44 = 0;
										label556: for (int var45 = 0; var45 < var43; var45++) {
											Sprite var46 = var3.field389[var45];
											if (var46.field277 != field308) {
												for (int var47 = var46.field272; var47 <= var46.field273; var47++) {
													for (int var48 = var46.field274; var48 <= var46.field275; var48++) {
														Square var49 = var8[var47][var48];
														if (var49.field393) {
															var3.field395 = true;
															continue label556;
														}
														if (var49.field396 != 0) {
															int var50 = 0;
															if (var47 > var46.field272) {
																var50++;
															}
															if (var47 < var46.field273) {
																var50 += 4;
															}
															if (var48 > var46.field274) {
																var50 += 8;
															}
															if (var48 < var46.field275) {
																var50 += 2;
															}
															if ((var50 & var49.field396) == var3.field398) {
																var3.field395 = true;
																continue label556;
															}
														}
													}
												}
												field322[var44++] = var46;
												int var51 = field313 - var46.field272;
												int var52 = var46.field273 - field313;
												if (var52 > var51) {
													var51 = var52;
												}
												int var53 = field314 - var46.field274;
												int var54 = var46.field275 - field314;
												if (var54 > var53) {
													var46.field276 = var51 + var54;
												} else {
													var46.field276 = var51 + var53;
												}
											}
										}
										while (var44 > 0) {
											int var55 = -50;
											int var56 = -1;
											for (int var57 = 0; var57 < var44; var57++) {
												Sprite var58 = field322[var57];
												if (var58.field277 != field308) {
													if (var58.field276 > var55) {
														var55 = var58.field276;
														var56 = var57;
													} else if (var58.field276 == var55) {
														int var59 = var58.field268 - field315;
														int var60 = var58.field269 - field317;
														int var61 = field322[var56].field268 - field315;
														int var62 = field322[var56].field269 - field317;
														if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
															var56 = var57;
														}
													}
												}
											}
											if (var56 == -1) {
												break;
											}
											Sprite var63 = field322[var56];
											var63.field277 = field308;
											if (!this.method113(var7, var63.field272, var63.field273, var63.field274, var63.field275, var63.field270.field406)) {
												var63.field270.method122(var63.field271, field318, field319, field320, field321, var63.field268 - field315, var63.field267 - field316, var63.field269 - field317, var63.field278);
											}
											for (int var64 = var63.field272; var64 <= var63.field273; var64++) {
												for (int var65 = var63.field274; var65 <= var63.field275; var65++) {
													Square var66 = var8[var64][var65];
													if (var66.field396 != 0) {
														field337.method255(var66);
													} else if ((var64 != var4 || var65 != var5) && var66.field394) {
														field337.method255(var66);
													}
												}
											}
										}
										if (!var3.field395) {
											break;
										}
									}
								} while (!var3.field394);
							} while (var3.field396 != 0);
							if (var4 > field313 || var4 <= field309) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.field394);
						if (var4 < field313 || var4 >= field310 - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.field394);
					if (var5 > field314 || var5 <= field311) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.field394);
				if (var5 < field314 || var5 >= field312 - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.field394);
			var3.field394 = false;
			field306--;
			GroundObject var71 = var3.field387;
			if (var71 != null && var71.field219 != 0) {
				if (var71.field216 != null) {
					var71.field216.method122(0, field318, field319, field320, field321, var71.field213 - field315, var71.field212 - field316 - var71.field219, var71.field214 - field317, var71.field218);
				}
				if (var71.field217 != null) {
					var71.field217.method122(0, field318, field319, field320, field321, var71.field213 - field315, var71.field212 - field316 - var71.field219, var71.field214 - field317, var71.field218);
				}
				if (var71.field215 != null) {
					var71.field215.method122(0, field318, field319, field320, field321, var71.field213 - field315, var71.field212 - field316 - var71.field219, var71.field214 - field317, var71.field218);
				}
			}
			if (var3.field399 != 0) {
				Decor var72 = var3.field385;
				if (var72 != null && !this.method112(var7, var4, var5, var72.field177.field406)) {
					if ((var72.field175 & var3.field399) != 0) {
						var72.field177.method122(var72.field176, field318, field319, field320, field321, var72.field173 - field315, var72.field172 - field316, var72.field174 - field317, var72.field178);
					} else if ((var72.field175 & 0x300) != 0) {
						int var73 = var72.field173 - field315;
						int var74 = var72.field172 - field316;
						int var75 = var72.field174 - field317;
						int var76 = var72.field176;
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
						if ((var72.field175 & 0x100) != 0 && var78 >= var77) {
							int var79 = var73 + field323[var76];
							int var80 = var75 + field324[var76];
							var72.field177.method122(var76 * 512 + 256, field318, field319, field320, field321, var79, var74, var80, var72.field178);
						}
						if ((var72.field175 & 0x200) != 0 && var78 <= var77) {
							int var81 = var73 + field325[var76];
							int var82 = var75 + field326[var76];
							var72.field177.method122(var76 * 512 + 1280 & 0x7FF, field318, field319, field320, field321, var81, var74, var82, var72.field178);
						}
					}
				}
				Wall var83 = var3.field384;
				if (var83 != null) {
					if ((var83.field284 & var3.field399) != 0 && !this.method111(var7, var4, var5, var83.field284)) {
						var83.field286.method122(0, field318, field319, field320, field321, var83.field281 - field315, var83.field280 - field316, var83.field282 - field317, var83.field287);
					}
					if ((var83.field283 & var3.field399) != 0 && !this.method111(var7, var4, var5, var83.field283)) {
						var83.field285.method122(0, field318, field319, field320, field321, var83.field281 - field315, var83.field280 - field316, var83.field282 - field317, var83.field287);
					}
				}
			}
			if (var6 < this.field297 - 1) {
				Square var84 = this.field301[var6 + 1][var4][var5];
				if (var84 != null && var84.field394) {
					field337.method255(var84);
				}
			}
			if (var4 < field313) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.field394) {
					field337.method255(var85);
				}
			}
			if (var5 < field314) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.field394) {
					field337.method255(var86);
				}
			}
			if (var4 > field313) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.field394) {
					field337.method255(var87);
				}
			}
			if (var5 > field314) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.field394) {
					field337.method255(var88);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void method105(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field315;
		int var11;
		int var12 = var11 = (arg7 << 7) - field317;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field300[arg1][arg6][arg7] - field316;
		int var18 = this.field300[arg1][arg6 + 1][arg7] - field316;
		int var19 = this.field300[arg1][arg6 + 1][arg7 + 1] - field316;
		int var20 = this.field300[arg1][arg6][arg7 + 1] - field316;
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
		int var45 = Pix3D.field641 + (var21 << 9) / var25;
		int var46 = Pix3D.field642 + (var24 << 9) / var25;
		int var47 = Pix3D.field641 + (var27 << 9) / var31;
		int var48 = Pix3D.field642 + (var30 << 9) / var31;
		int var49 = Pix3D.field641 + (var33 << 9) / var37;
		int var50 = Pix3D.field642 + (var36 << 9) / var37;
		int var51 = Pix3D.field641 + (var39 << 9) / var43;
		int var52 = Pix3D.field642 + (var42 << 9) / var43;
		Pix3D.field640 = 0;
		if ((var49 - var51) * (var48 - var52) - (var50 - var52) * (var47 - var51) > 0) {
			Pix3D.field637 = false;
			if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.field630 || var51 > Pix2D.field630 || var47 > Pix2D.field630) {
				Pix3D.field637 = true;
			}
			if (field327 && this.method108(field328, field329, var50, var52, var48, var49, var51, var47)) {
				field330 = arg6;
				field331 = arg7;
			}
			if (arg0.field263 == -1) {
				if (arg0.field261 != 12345678) {
					Pix3D.method188(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260);
				}
			} else if (field296) {
				int var53 = field345[arg0.field263];
				Pix3D.method188(var50, var52, var48, var49, var51, var47, this.method107(arg0.field261, var53), this.method107(arg0.field262, var53), this.method107(arg0.field260, var53));
			} else if (arg0.field264) {
				Pix3D.method192(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field263);
			} else {
				Pix3D.method192(var50, var52, var48, var49, var51, var47, arg0.field261, arg0.field262, arg0.field260, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field263);
			}
		}
		if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
			return;
		}
		Pix3D.field637 = false;
		if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.field630 || var47 > Pix2D.field630 || var51 > Pix2D.field630) {
			Pix3D.field637 = true;
		}
		if (field327 && this.method108(field328, field329, var46, var48, var52, var45, var47, var51)) {
			field330 = arg6;
			field331 = arg7;
		}
		if (arg0.field263 != -1) {
			if (!field296) {
				Pix3D.method192(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field263);
				return;
			}
			int var54 = field345[arg0.field263];
			Pix3D.method188(var46, var48, var52, var45, var47, var51, this.method107(arg0.field259, var54), this.method107(arg0.field260, var54), this.method107(arg0.field262, var54));
		} else if (arg0.field259 != 12345678) {
			Pix3D.method188(var46, var48, var52, var45, var47, var51, arg0.field259, arg0.field260, arg0.field262);
			return;
		}
	}

	@ObfuscatedName("s.a(IIZIILj;II)V")
	public void method106(int arg0, int arg1, int arg3, int arg4, Ground arg5, int arg6, int arg7) {
		int var9 = arg5.field181.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var11 = arg5.field181[var10] - field315;
			int var12 = arg5.field182[var10] - field316;
			int var13 = arg5.field183[var10] - field317;
			int var14 = var13 * arg1 + var11 * arg0 >> 16;
			int var15 = var13 * arg0 - var11 * arg1 >> 16;
			int var17 = var12 * arg4 - var15 * arg3 >> 16;
			int var18 = var12 * arg3 + var15 * arg4 >> 16;
			if (var18 < 50) {
				return;
			}
			if (arg5.field190 != null) {
				Ground.field198[var10] = var14;
				Ground.field199[var10] = var17;
				Ground.field200[var10] = var18;
			}
			Ground.field196[var10] = Pix3D.field641 + (var14 << 9) / var18;
			Ground.field197[var10] = Pix3D.field642 + (var17 << 9) / var18;
		}
		Pix3D.field640 = 0;
		int var21 = arg5.field187.length;
		for (int var22 = 0; var22 < var21; var22++) {
			int var23 = arg5.field187[var22];
			int var24 = arg5.field188[var22];
			int var25 = arg5.field189[var22];
			int var26 = Ground.field196[var23];
			int var27 = Ground.field196[var24];
			int var28 = Ground.field196[var25];
			int var29 = Ground.field197[var23];
			int var30 = Ground.field197[var24];
			int var31 = Ground.field197[var25];
			if ((var26 - var27) * (var31 - var30) - (var29 - var30) * (var28 - var27) > 0) {
				Pix3D.field637 = false;
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.field630 || var27 > Pix2D.field630 || var28 > Pix2D.field630) {
					Pix3D.field637 = true;
				}
				if (field327 && this.method108(field328, field329, var29, var30, var31, var26, var27, var28)) {
					field330 = arg6;
					field331 = arg7;
				}
				if (arg5.field190 == null || arg5.field190[var22] == -1) {
					if (arg5.field184[var22] != 12345678) {
						Pix3D.method188(var29, var30, var31, var26, var27, var28, arg5.field184[var22], arg5.field185[var22], arg5.field186[var22]);
					}
				} else if (field296) {
					int var32 = field345[arg5.field190[var22]];
					Pix3D.method188(var29, var30, var31, var26, var27, var28, this.method107(arg5.field184[var22], var32), this.method107(arg5.field185[var22], var32), this.method107(arg5.field186[var22], var32));
				} else if (arg5.field191) {
					Pix3D.method192(var29, var30, var31, var26, var27, var28, arg5.field184[var22], arg5.field185[var22], arg5.field186[var22], Ground.field198[0], Ground.field198[1], Ground.field198[3], Ground.field199[0], Ground.field199[1], Ground.field199[3], Ground.field200[0], Ground.field200[1], Ground.field200[3], arg5.field190[var22]);
				} else {
					Pix3D.method192(var29, var30, var31, var26, var27, var28, arg5.field184[var22], arg5.field185[var22], arg5.field186[var22], Ground.field198[var23], Ground.field198[var24], Ground.field198[var25], Ground.field199[var23], Ground.field199[var24], Ground.field199[var25], Ground.field200[var23], Ground.field200[var24], Ground.field200[var25], arg5.field190[var22]);
				}
			}
		}
	}

	@ObfuscatedName("s.a(IZI)I")
	public int method107(int arg0, int arg2) {
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
	public boolean method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
	public void method109() {
		int var2 = field333[field307];
		Occlude[] var3 = field334[field307];
		field335 = 0;
		for (int var4 = 0; var4 < var2; var4++) {
			Occlude var5 = var3[var4];
			if (var5.field241 == 1) {
				int var6 = var5.field237 - field313 + 25;
				if (var6 >= 0 && var6 <= 50) {
					int var7 = var5.field239 - field314 + 25;
					if (var7 < 0) {
						var7 = 0;
					}
					int var8 = var5.field240 - field314 + 25;
					if (var8 > 50) {
						var8 = 50;
					}
					boolean var9 = false;
					while (var7 <= var8) {
						if (field352[var6][var7++]) {
							var9 = true;
							break;
						}
					}
					if (var9) {
						int var10 = field315 - var5.field242;
						if (var10 > 32) {
							var5.field248 = 1;
						} else {
							if (var10 >= -32) {
								continue;
							}
							var5.field248 = 2;
							var10 = -var10;
						}
						var5.field251 = (var5.field244 - field317 << 8) / var10;
						var5.field252 = (var5.field245 - field317 << 8) / var10;
						var5.field253 = (var5.field246 - field316 << 8) / var10;
						var5.field254 = (var5.field247 - field316 << 8) / var10;
						field336[field335++] = var5;
					}
				}
			} else if (var5.field241 == 2) {
				int var11 = var5.field239 - field314 + 25;
				if (var11 >= 0 && var11 <= 50) {
					int var12 = var5.field237 - field313 + 25;
					if (var12 < 0) {
						var12 = 0;
					}
					int var13 = var5.field238 - field313 + 25;
					if (var13 > 50) {
						var13 = 50;
					}
					boolean var14 = false;
					while (var12 <= var13) {
						if (field352[var12++][var11]) {
							var14 = true;
							break;
						}
					}
					if (var14) {
						int var15 = field317 - var5.field244;
						if (var15 > 32) {
							var5.field248 = 3;
						} else {
							if (var15 >= -32) {
								continue;
							}
							var5.field248 = 4;
							var15 = -var15;
						}
						var5.field249 = (var5.field242 - field315 << 8) / var15;
						var5.field250 = (var5.field243 - field315 << 8) / var15;
						var5.field253 = (var5.field246 - field316 << 8) / var15;
						var5.field254 = (var5.field247 - field316 << 8) / var15;
						field336[field335++] = var5;
					}
				}
			} else if (var5.field241 == 4) {
				int var16 = var5.field246 - field316;
				if (var16 > 128) {
					int var17 = var5.field239 - field314 + 25;
					if (var17 < 0) {
						var17 = 0;
					}
					int var18 = var5.field240 - field314 + 25;
					if (var18 > 50) {
						var18 = 50;
					}
					if (var17 <= var18) {
						int var19 = var5.field237 - field313 + 25;
						if (var19 < 0) {
							var19 = 0;
						}
						int var20 = var5.field238 - field313 + 25;
						if (var20 > 50) {
							var20 = 50;
						}
						boolean var21 = false;
						label151: for (int var22 = var19; var22 <= var20; var22++) {
							for (int var23 = var17; var23 <= var18; var23++) {
								if (field352[var22][var23]) {
									var21 = true;
									break label151;
								}
							}
						}
						if (var21) {
							var5.field248 = 5;
							var5.field249 = (var5.field242 - field315 << 8) / var16;
							var5.field250 = (var5.field243 - field315 << 8) / var16;
							var5.field251 = (var5.field244 - field317 << 8) / var16;
							var5.field252 = (var5.field245 - field317 << 8) / var16;
							field336[field335++] = var5;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.g(III)Z")
	public boolean method110(int arg0, int arg1, int arg2) {
		int var4 = this.field305[arg0][arg1][arg2];
		if (var4 == -field308) {
			return false;
		} else if (var4 == field308) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.method114(var5 + 1, this.field300[arg0][arg1][arg2], var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2], var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method114(var5 + 1, this.field300[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.field305[arg0][arg1][arg2] = field308;
				return true;
			} else {
				this.field305[arg0][arg1][arg2] = -field308;
				return false;
			}
		}
	}

	@ObfuscatedName("s.h(IIII)Z")
	public boolean method111(int arg0, int arg1, int arg2, int arg3) {
		if (!this.method110(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.field300[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field315) {
					if (!this.method114(var5, var7, var6)) {
						return false;
					}
					if (!this.method114(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method114(var5, var8, var6)) {
						return false;
					}
					if (!this.method114(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method114(var5, var9, var6)) {
					return false;
				}
				if (!this.method114(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < field317) {
					if (!this.method114(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.method114(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method114(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.method114(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method114(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.method114(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < field315) {
					if (!this.method114(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.method114(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method114(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.method114(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method114(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.method114(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > field317) {
					if (!this.method114(var5, var7, var6)) {
						return false;
					}
					if (!this.method114(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method114(var5, var8, var6)) {
						return false;
					}
					if (!this.method114(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.method114(var5, var9, var6)) {
					return false;
				}
				if (!this.method114(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method114(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method114(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.method114(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.method114(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.method114(var5, var9, var6);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("s.i(IIII)Z")
	public boolean method112(int arg0, int arg1, int arg2, int arg3) {
		if (this.method110(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.method114(var5 + 1, this.field300[arg0][arg1][arg2] - arg3, var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method114(var5 + 128 - 1, this.field300[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method114(var5 + 1, this.field300[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.b(IIIIII)Z")
	public boolean method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.field305[arg0][var9][var10] == -field308) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.field300[arg0][arg1][arg3] - arg5;
			if (!this.method114(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 1;
			if (!this.method114(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 1;
			if (!this.method114(var11, var13, var15)) {
				return false;
			} else if (this.method114(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method110(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.method114(var7 + 1, this.field300[arg0][arg1][arg3] - arg5, var8 + 1) && this.method114(var7 + 128 - 1, this.field300[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method114(var7 + 128 - 1, this.field300[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method114(var7 + 1, this.field300[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("s.h(III)Z")
	public boolean method114(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field335; var4++) {
			Occlude var5 = field336[var4];
			if (var5.field248 == 1) {
				int var6 = var5.field242 - arg0;
				if (var6 > 0) {
					int var7 = var5.field244 + (var5.field251 * var6 >> 8);
					int var8 = var5.field245 + (var5.field252 * var6 >> 8);
					int var9 = var5.field246 + (var5.field253 * var6 >> 8);
					int var10 = var5.field247 + (var5.field254 * var6 >> 8);
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field248 == 2) {
				int var11 = arg0 - var5.field242;
				if (var11 > 0) {
					int var12 = var5.field244 + (var5.field251 * var11 >> 8);
					int var13 = var5.field245 + (var5.field252 * var11 >> 8);
					int var14 = var5.field246 + (var5.field253 * var11 >> 8);
					int var15 = var5.field247 + (var5.field254 * var11 >> 8);
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field248 == 3) {
				int var16 = var5.field244 - arg2;
				if (var16 > 0) {
					int var17 = var5.field242 + (var5.field249 * var16 >> 8);
					int var18 = var5.field243 + (var5.field250 * var16 >> 8);
					int var19 = var5.field246 + (var5.field253 * var16 >> 8);
					int var20 = var5.field247 + (var5.field254 * var16 >> 8);
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field248 == 4) {
				int var21 = arg2 - var5.field244;
				if (var21 > 0) {
					int var22 = var5.field242 + (var5.field249 * var21 >> 8);
					int var23 = var5.field243 + (var5.field250 * var21 >> 8);
					int var24 = var5.field246 + (var5.field253 * var21 >> 8);
					int var25 = var5.field247 + (var5.field254 * var21 >> 8);
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field248 == 5) {
				int var26 = arg1 - var5.field246;
				if (var26 > 0) {
					int var27 = var5.field242 + (var5.field249 * var26 >> 8);
					int var28 = var5.field243 + (var5.field250 * var26 >> 8);
					int var29 = var5.field244 + (var5.field251 * var26 >> 8);
					int var30 = var5.field245 + (var5.field252 * var26 >> 8);
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
