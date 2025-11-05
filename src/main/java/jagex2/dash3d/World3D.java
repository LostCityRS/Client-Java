package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

public class World3D {

	@ObfuscatedName("KJCMXHNO.u")
	public Sprite[] field1021 = new Sprite[5000];

	@ObfuscatedName("KJCMXHNO.kb")
	public int[] field1063 = new int[10000];

	@ObfuscatedName("KJCMXHNO.lb")
	public int[] field1064 = new int[10000];

	@ObfuscatedName("KJCMXHNO.nb")
	public int[][] field1066 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("KJCMXHNO.ob")
	public int[][] field1067 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("KJCMXHNO.n")
	public int field1014;

	@ObfuscatedName("KJCMXHNO.o")
	public int field1015;

	@ObfuscatedName("KJCMXHNO.p")
	public int field1016;

	@ObfuscatedName("KJCMXHNO.r")
	public Square[][][] field1018;

	@ObfuscatedName("KJCMXHNO.v")
	public int[][][] field1022;

	@ObfuscatedName("KJCMXHNO.q")
	public int[][][] field1017;

	@ObfuscatedName("KJCMXHNO.m")
	public static boolean lowMem = true;

	@ObfuscatedName("KJCMXHNO.M")
	public static Sprite[] field1039 = new Sprite[100];

	@ObfuscatedName("KJCMXHNO.N")
	public static final int[] field1040 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("KJCMXHNO.O")
	public static final int[] field1041 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("KJCMXHNO.P")
	public static final int[] field1042 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("KJCMXHNO.Q")
	public static final int[] field1043 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("KJCMXHNO.U")
	public static int clickTileX = -1;

	@ObfuscatedName("KJCMXHNO.V")
	public static int clickTileZ = -1;

	@ObfuscatedName("KJCMXHNO.W")
	public static int field1049 = 4;

	@ObfuscatedName("KJCMXHNO.X")
	public static int[] field1050 = new int[field1049];

	@ObfuscatedName("KJCMXHNO.Y")
	public static Occlude[][] field1051 = new Occlude[field1049][500];

	@ObfuscatedName("KJCMXHNO.ab")
	public static Occlude[] field1053 = new Occlude[500];

	@ObfuscatedName("KJCMXHNO.bb")
	public static LinkList field1054 = new LinkList();

	@ObfuscatedName("KJCMXHNO.cb")
	public static final int[] field1055 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("KJCMXHNO.db")
	public static final int[] field1056 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("KJCMXHNO.eb")
	public static final int[] field1057 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("KJCMXHNO.fb")
	public static final int[] field1058 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("KJCMXHNO.gb")
	public static final int[] field1059 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("KJCMXHNO.hb")
	public static final int[] field1060 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("KJCMXHNO.ib")
	public static final int[] field1061 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("KJCMXHNO.jb")
	public static final int[] field1062 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("KJCMXHNO.pb")
	public static boolean[][][][] field1068 = new boolean[8][32][51][51];

	@ObfuscatedName("KJCMXHNO.s")
	public int field1019;

	@ObfuscatedName("KJCMXHNO.t")
	public int field1020;

	@ObfuscatedName("KJCMXHNO.w")
	public static int field1023;

	@ObfuscatedName("KJCMXHNO.x")
	public static int field1024;

	@ObfuscatedName("KJCMXHNO.y")
	public static int field1025;

	@ObfuscatedName("KJCMXHNO.z")
	public static int field1026;

	@ObfuscatedName("KJCMXHNO.A")
	public static int field1027;

	@ObfuscatedName("KJCMXHNO.B")
	public static int field1028;

	@ObfuscatedName("KJCMXHNO.C")
	public static int field1029;

	@ObfuscatedName("KJCMXHNO.D")
	public static int field1030;

	@ObfuscatedName("KJCMXHNO.E")
	public static int field1031;

	@ObfuscatedName("KJCMXHNO.F")
	public static int field1032;

	@ObfuscatedName("KJCMXHNO.G")
	public static int field1033;

	@ObfuscatedName("KJCMXHNO.H")
	public static int field1034;

	@ObfuscatedName("KJCMXHNO.I")
	public static int field1035;

	@ObfuscatedName("KJCMXHNO.J")
	public static int field1036;

	@ObfuscatedName("KJCMXHNO.K")
	public static int field1037;

	@ObfuscatedName("KJCMXHNO.L")
	public static int field1038;

	@ObfuscatedName("KJCMXHNO.S")
	public static int field1045;

	@ObfuscatedName("KJCMXHNO.T")
	public static int field1046;

	@ObfuscatedName("KJCMXHNO.Z")
	public static int field1052;

	@ObfuscatedName("KJCMXHNO.mb")
	public int field1065;

	@ObfuscatedName("KJCMXHNO.rb")
	public static int field1070;

	@ObfuscatedName("KJCMXHNO.sb")
	public static int field1071;

	@ObfuscatedName("KJCMXHNO.tb")
	public static int field1072;

	@ObfuscatedName("KJCMXHNO.ub")
	public static int field1073;

	@ObfuscatedName("KJCMXHNO.vb")
	public static int field1074;

	@ObfuscatedName("KJCMXHNO.wb")
	public static int field1075;

	@ObfuscatedName("KJCMXHNO.R")
	public static boolean field1044;

	@ObfuscatedName("KJCMXHNO.qb")
	public static boolean[][] field1069;

	public World3D(int[][][] arg0, int arg1, int arg2, int arg3) {
		this.field1014 = arg2;
		this.field1015 = arg3;
		this.field1016 = arg1;
		this.field1018 = new Square[arg2][arg3][arg1];
		this.field1022 = new int[arg2][arg3 + 1][arg1 + 1];
		this.field1017 = arg0;
		this.method274();
	}

	@ObfuscatedName("KJCMXHNO.a(Z)V")
	public static void unload() {
		field1039 = null;
		field1050 = null;
		field1051 = null;
		field1054 = null;
		field1068 = null;
		field1069 = null;
	}

	@ObfuscatedName("KJCMXHNO.a(B)V")
	public void method274() {
		for (int var2 = 0; var2 < this.field1014; var2++) {
			for (int var8 = 0; var8 < this.field1015; var8++) {
				for (int var9 = 0; var9 < this.field1016; var9++) {
					this.field1018[var2][var8][var9] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field1049; var4++) {
			for (int var7 = 0; var7 < field1050[var4]; var7++) {
				field1051[var4][var7] = null;
			}
			field1050[var4] = 0;
		}
		for (int var5 = 0; var5 < this.field1020; var5++) {
			this.field1021[var5] = null;
		}
		this.field1020 = 0;
		for (int var6 = 0; var6 < field1039.length; var6++) {
			field1039[var6] = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IZ)V")
	public void method275(int arg0) {
		this.field1019 = arg0;
		for (int var3 = 0; var3 < this.field1015; var3++) {
			for (int var4 = 0; var4 < this.field1016; var4++) {
				if (this.field1018[arg0][var3][var4] == null) {
					this.field1018[arg0][var3][var4] = new Square(arg0, var3, var4);
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ZII)V")
	public void method276(boolean arg0, int arg1, int arg2) {
		Square var4 = this.field1018[0][arg1][arg2];
		for (int var5 = 0; var5 < 3; var5++) {
			Square var7 = this.field1018[var5][arg1][arg2] = this.field1018[var5 + 1][arg1][arg2];
			if (var7 != null) {
				var7.field1380--;
				for (int var8 = 0; var8 < var7.field1390; var8++) {
					Sprite var9 = var7.field1391[var8];
					if ((var9.field88 >> 29 & 0x3) == 2 && var9.field82 == arg1 && var9.field84 == arg2) {
						var9.field76--;
					}
				}
			}
		}
		if (this.field1018[0][arg1][arg2] == null) {
			this.field1018[0][arg1][arg2] = new Square(0, arg1, arg2);
		}
		this.field1018[0][arg1][arg2].field1402 = var4;
		if (!arg0) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		this.field1018[3][arg1][arg2] = null;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIIII)V")
	public static void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Occlude var9 = new Occlude();
		if (arg0 != -8967) {
			for (int var10 = 1; var10 > 0; var10++) {
			}
		}
		var9.field1478 = arg1 / 128;
		var9.field1479 = arg3 / 128;
		var9.field1480 = arg6 / 128;
		var9.field1481 = arg4 / 128;
		var9.field1482 = arg8;
		var9.field1483 = arg1;
		var9.field1484 = arg3;
		var9.field1485 = arg6;
		var9.field1486 = arg4;
		var9.field1487 = arg7;
		var9.field1488 = arg2;
		field1051[arg5][field1050[arg5]++] = var9;
	}

	@ObfuscatedName("KJCMXHNO.a(IIII)V")
	public void method278(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field1018[arg0][arg1][arg2];
		if (var5 != null) {
			this.field1018[arg0][arg1][arg2].field1394 = arg3;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.field1018[var22][arg1][arg2] == null) {
					this.field1018[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.field1018[arg0][arg1][arg2].field1384 = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.field1018[var24][arg1][arg2] == null) {
					this.field1018[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.field1018[arg0][arg1][arg2].field1384 = var23;
		} else {
			Ground var25 = new Ground(arg9, arg14, arg8, arg6, arg1, arg12, arg13, arg19, arg11, arg16, 0, arg10, arg3, arg7, arg17, arg5, arg18, arg15, arg2, arg4);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.field1018[var26][arg1][arg2] == null) {
					this.field1018[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.field1018[arg0][arg1][arg2].field1385 = var25;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIBIIILZOXDNIET;)V")
	public void method280(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, ModelSource arg7) {
		if (arg2 <= 0 || arg7 == null) {
			return;
		}
		GroundDecor var9 = new GroundDecor();
		var9.field1313 = arg7;
		var9.field1311 = arg0 * 128 + 64;
		var9.field1312 = arg1 * 128 + 64;
		var9.field1310 = arg5;
		var9.field1314 = arg4;
		var9.field1315 = arg3;
		if (this.field1018[arg6][arg0][arg1] == null) {
			this.field1018[arg6][arg0][arg1] = new Square(arg6, arg0, arg1);
		}
		this.field1018[arg6][arg0][arg1].field1388 = var9;
	}

	@ObfuscatedName("KJCMXHNO.a(IILZOXDNIET;LZOXDNIET;ILZOXDNIET;III)V")
	public void method281(int arg0, int arg1, ModelSource arg2, ModelSource arg3, int arg4, ModelSource arg5, int arg7, int arg8) {
		GroundObject var10 = new GroundObject();
		var10.field639 = arg2;
		var10.field637 = arg8 * 128 + 64;
		var10.field638 = arg7 * 128 + 64;
		var10.field636 = arg0;
		var10.field642 = arg4;
		var10.field640 = arg3;
		var10.field641 = arg5;
		int var11 = 0;
		Square var12 = this.field1018[arg1][arg8][arg7];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field1390; var13++) {
				if (var12.field1391[var13].field80 instanceof Model) {
					int var14 = ((Model) var12.field1391[var13].field80).field1222;
					if (var14 > var11) {
						var11 = var14;
					}
				}
			}
		}
		var10.field643 = var11;
		if (this.field1018[arg1][arg8][arg7] == null) {
			this.field1018[arg1][arg8][arg7] = new Square(arg1, arg8, arg7);
		}
		this.field1018[arg1][arg8][arg7].field1389 = var10;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIILZOXDNIET;IIBILZOXDNIET;I)V")
	public void method282(int arg0, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, byte arg7, int arg8, ModelSource arg9, int arg10) {
		if (arg9 == null && arg4 == null) {
			return;
		}
		Wall var12 = new Wall();
		var12.field1539 = arg6;
		var12.field1540 = arg7;
		var12.field1533 = arg5 * 128 + 64;
		var12.field1534 = arg8 * 128 + 64;
		var12.field1532 = arg0;
		var12.field1537 = arg9;
		var12.field1538 = arg4;
		var12.field1535 = arg3;
		var12.field1536 = arg2;
		for (int var14 = arg10; var14 >= 0; var14--) {
			if (this.field1018[var14][arg5][arg8] == null) {
				this.field1018[var14][arg5][arg8] = new Square(var14, arg5, arg8);
			}
		}
		this.field1018[arg10][arg5][arg8].field1386 = var12;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIBIIIIILZOXDNIET;I)V")
	public void method283(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, ModelSource arg10) {
		if (arg10 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.field1412 = arg3;
		var13.field1413 = arg4;
		var13.field1407 = arg5 * 128 + 64 + arg8;
		var13.field1408 = arg7 * 128 + 64 + arg6;
		var13.field1406 = arg9;
		var13.field1411 = arg10;
		var13.field1409 = arg1;
		var13.field1410 = arg2;
		for (int var14 = arg0; var14 >= 0; var14--) {
			if (this.field1018[var14][arg5][arg7] == null) {
				this.field1018[var14][arg5][arg7] = new Square(var14, arg5, arg7);
			}
		}
		this.field1018[arg0][arg5][arg7].field1387 = var13;
	}

	@ObfuscatedName("KJCMXHNO.a(IIILZOXDNIET;BIIIIII)Z")
	public boolean method284(int arg0, int arg1, int arg2, ModelSource arg3, byte arg4, int arg5, int arg6, int arg8, int arg9, int arg10) {
		if (arg3 == null) {
			return true;
		}
		int var12 = arg1 * 64 + arg6 * 128;
		int var13 = arg2 * 128 + arg8 * 64;
		return this.method287(arg0, arg6, arg2, arg1, arg8, var12, var13, arg9, arg3, arg5, false, arg10, arg4);
	}

	@ObfuscatedName("KJCMXHNO.a(ILZOXDNIET;IIZIIIII)Z")
	public boolean method285(int arg0, ModelSource arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg1 == null) {
			return true;
		}
		int var11 = arg2 - arg7;
		int var12 = arg8 - arg7;
		int var13 = arg2 + arg7;
		int var14 = arg7 + arg8;
		if (arg4) {
			if (arg9 > 640 && arg9 < 1408) {
				var14 += 128;
			}
			if (arg9 > 1152 && arg9 < 1920) {
				var13 += 128;
			}
			if (arg9 > 1664 || arg9 < 384) {
				var12 -= 128;
			}
			if (arg9 > 128 && arg9 < 896) {
				var11 -= 128;
			}
		}
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		int var18 = var14 / 128;
		return this.method287(arg6, var15, var16, var17 - var15 + 1, var18 - var16 + 1, arg2, arg8, arg3, arg1, arg9, true, arg0, (byte) 0);
	}

	@ObfuscatedName("KJCMXHNO.a(IIIILZOXDNIET;IIIIIIII)Z")
	public boolean method286(int arg0, int arg1, int arg2, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		return arg4 == null ? true : this.method287(arg11, arg5, arg1, arg10 - arg5 + 1, arg7 - arg1 + 1, arg8, arg6, arg0, arg4, arg9, true, arg12, (byte) 0);
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIIILZOXDNIET;IZIB)Z")
	public boolean method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var21 = arg2; var21 < arg2 + arg4; var21++) {
				if (var14 < 0 || var21 < 0 || var14 >= this.field1015 || var21 >= this.field1016) {
					return false;
				}
				Square var22 = this.field1018[arg0][var14][var21];
				if (var22 != null && var22.field1390 >= 5) {
					return false;
				}
			}
		}
		Sprite var15 = new Sprite();
		var15.field88 = arg11;
		var15.field89 = arg12;
		var15.field76 = arg0;
		var15.field78 = arg5;
		var15.field79 = arg6;
		var15.field77 = arg7;
		var15.field80 = arg8;
		var15.field81 = arg9;
		var15.field82 = arg1;
		var15.field84 = arg2;
		var15.field83 = arg1 + arg3 - 1;
		var15.field85 = arg2 + arg4 - 1;
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
					if (this.field1018[var19][var16][var17] == null) {
						this.field1018[var19][var16][var17] = new Square(var19, var16, var17);
					}
				}
				Square var20 = this.field1018[arg0][var16][var17];
				var20.field1391[var20.field1390] = var15;
				var20.field1392[var20.field1390] = var18;
				var20.field1393 |= var18;
				var20.field1390++;
			}
		}
		if (arg10) {
			this.field1021[this.field1020++] = var15;
		}
		return true;
	}

	@ObfuscatedName("KJCMXHNO.a(I)V")
	public void clearLocChanges() {
		for (int var3 = 0; var3 < this.field1020; var3++) {
			Sprite var4 = this.field1021[var3];
			this.method289(var4);
			this.field1021[var3] = null;
		}
		this.field1020 = 0;
	}

	@ObfuscatedName("KJCMXHNO.a(LBHOSVTIT;I)V")
	public void method289(Sprite arg0) {
		for (int var3 = arg0.field82; var3 <= arg0.field83; var3++) {
			for (int var4 = arg0.field84; var4 <= arg0.field85; var4++) {
				Square var5 = this.field1018[arg0.field76][var3][var4];
				if (var5 != null) {
					for (int var6 = 0; var6 < var5.field1390; var6++) {
						if (var5.field1391[var6] == arg0) {
							var5.field1390--;
							for (int var7 = var6; var7 < var5.field1390; var7++) {
								var5.field1391[var7] = var5.field1391[var7 + 1];
								var5.field1392[var7] = var5.field1392[var7 + 1];
							}
							var5.field1391[var5.field1390] = null;
							break;
						}
					}
					var5.field1393 = 0;
					for (int var8 = 0; var8 < var5.field1390; var8++) {
						var5.field1393 |= var5.field1392[var8];
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIII)V")
	public void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.field1018[arg2][arg3][arg0];
		if (var6 == null) {
			return;
		}
		Decor var7 = var6.field1387;
		if (var7 == null) {
			return;
		}
		int var8 = arg3 * 128 + 64;
		int var9 = arg0 * 128 + 64;
		if (arg4 == 0) {
			var7.field1407 = (var7.field1407 - var8) * arg1 / 16 + var8;
			var7.field1408 = (var7.field1408 - var9) * arg1 / 16 + var9;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIZ)V")
	public void method291(int arg0, int arg1, int arg2) {
		Square var5 = this.field1018[arg1][arg2][arg0];
		if (var5 != null) {
			var5.field1386 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ZIII)V")
	public void method292(boolean arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field1018[arg3][arg1][arg2];
		if (!arg0 && var5 != null) {
			var5.field1387 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.b(IIII)V")
	public void method293(int arg0, int arg1, int arg3) {
		Square var5 = this.field1018[arg1][arg3][arg0];
		if (var5 == null) {
			return;
		}
		for (int var6 = 0; var6 < var5.field1390; var6++) {
			Sprite var7 = var5.field1391[var6];
			if ((var7.field88 >> 29 & 0x3) == 2 && var7.field82 == arg3 && var7.field84 == arg0) {
				this.method289(var7);
				return;
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIZI)V")
	public void method294(int arg0, int arg1, int arg3) {
		Square var5 = this.field1018[arg3][arg0][arg1];
		if (var5 == null) {
			return;
		}
		var5.field1388 = null;
	}

	@ObfuscatedName("KJCMXHNO.a(III)V")
	public void method295(int arg0, int arg1, int arg2) {
		Square var4 = this.field1018[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field1389 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.c(IIII)LWQXKHZYN;")
	public Wall method296(int arg0, int arg2, int arg3) {
		Square var5 = this.field1018[arg0][arg2][arg3];
		return var5 == null ? null : var5.field1386;
	}

	@ObfuscatedName("KJCMXHNO.b(IIIZ)LSEMZHDXN;")
	public Decor method297(int arg0, int arg1, int arg2) {
		Square var5 = this.field1018[arg0][arg2][arg1];
		if (var5 == null) {
			return null;
		} else {
			return var5.field1387;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IBII)LBHOSVTIT;")
	public Sprite method298(int arg0, int arg2, int arg3) {
		Square var6 = this.field1018[arg3][arg0][arg2];
		if (var6 == null) {
			return null;
		}
		for (int var7 = 0; var7 < var6.field1390; var7++) {
			Sprite var8 = var6.field1391[var7];
			if ((var8.field88 >> 29 & 0x3) == 2 && var8.field82 == arg0 && var8.field84 == arg2) {
				return var8;
			}
		}
		return null;
	}

	@ObfuscatedName("KJCMXHNO.d(IIII)LMOLUZZPG;")
	public GroundDecor method299(int arg0, int arg1, int arg3) {
		Square var5 = this.field1018[arg0][arg3][arg1];
		return var5 == null || var5.field1388 == null ? null : var5.field1388;
	}

	@ObfuscatedName("KJCMXHNO.b(III)I")
	public int method300(int arg0, int arg1, int arg2) {
		Square var4 = this.field1018[arg0][arg1][arg2];
		return var4 == null || var4.field1386 == null ? 0 : var4.field1386.field1539;
	}

	@ObfuscatedName("KJCMXHNO.b(IBII)I")
	public int method301(int arg0, int arg2, int arg3) {
		Square var5 = this.field1018[arg2][arg0][arg3];
		return var5 == null || var5.field1387 == null ? 0 : var5.field1387.field1412;
	}

	@ObfuscatedName("KJCMXHNO.c(III)I")
	public int method302(int arg0, int arg1, int arg2) {
		Square var4 = this.field1018[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field1390; var5++) {
			Sprite var6 = var4.field1391[var5];
			if ((var6.field88 >> 29 & 0x3) == 2 && var6.field82 == arg1 && var6.field84 == arg2) {
				return var6.field88;
			}
		}
		return 0;
	}

	@ObfuscatedName("KJCMXHNO.d(III)I")
	public int method303(int arg0, int arg1, int arg2) {
		Square var4 = this.field1018[arg0][arg1][arg2];
		return var4 == null || var4.field1388 == null ? 0 : var4.field1388.field1314;
	}

	@ObfuscatedName("KJCMXHNO.e(IIII)I")
	public int method304(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field1018[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.field1386 != null && var5.field1386.field1539 == arg3) {
			return var5.field1386.field1540 & 0xFF;
		} else if (var5.field1387 != null && var5.field1387.field1412 == arg3) {
			return var5.field1387.field1413 & 0xFF;
		} else if (var5.field1388 != null && var5.field1388.field1314 == arg3) {
			return var5.field1388.field1315 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field1390; var6++) {
				if (var5.field1391[var6].field88 == arg3) {
					return var5.field1391[var6].field89 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(BIII)V")
	public void method305(int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field1014; var5++) {
			for (int var7 = 0; var7 < this.field1015; var7++) {
				for (int var8 = 0; var8 < this.field1016; var8++) {
					Square var9 = this.field1018[var5][var7][var8];
					if (var9 != null) {
						Wall var10 = var9.field1386;
						if (var10 != null && var10.field1537 != null && var10.field1537.field1708 != null) {
							this.method307(var8, var5, 0, 1, (Model) var10.field1537, var7, 1);
							if (var10.field1538 != null && var10.field1538.field1708 != null) {
								this.method307(var8, var5, 0, 1, (Model) var10.field1538, var7, 1);
								this.method308((Model) var10.field1537, (Model) var10.field1538, 0, 0, 0, false);
								((Model) var10.field1538).method377(arg1, arg2, arg3);
							}
							((Model) var10.field1537).method377(arg1, arg2, arg3);
						}
						for (int var11 = 0; var11 < var9.field1390; var11++) {
							Sprite var13 = var9.field1391[var11];
							if (var13 != null && var13.field80 != null && var13.field80.field1708 != null) {
								this.method307(var8, var5, 0, var13.field83 - var13.field82 + 1, (Model) var13.field80, var7, var13.field85 - var13.field84 + 1);
								((Model) var13.field80).method377(arg1, arg2, arg3);
							}
						}
						GroundDecor var12 = var9.field1388;
						if (var12 != null && var12.field1313.field1708 != null) {
							this.method306(var7, (Model) var12.field1313, var8, var5);
							((Model) var12.field1313).method377(arg1, arg2, arg3);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ILLZYQDKJV;III)V")
	public void method306(int arg0, Model arg1, int arg2, int arg3) {
		if (arg0 < this.field1015) {
			Square var6 = this.field1018[arg3][arg0 + 1][arg2];
			if (var6 != null && var6.field1388 != null && var6.field1388.field1313.field1708 != null) {
				this.method308(arg1, (Model) var6.field1388.field1313, 128, 0, 0, true);
			}
		}
		if (arg2 < this.field1015) {
			Square var7 = this.field1018[arg3][arg0][arg2 + 1];
			if (var7 != null && var7.field1388 != null && var7.field1388.field1313.field1708 != null) {
				this.method308(arg1, (Model) var7.field1388.field1313, 0, 0, 128, true);
			}
		}
		if (arg0 < this.field1015 && arg2 < this.field1016) {
			Square var8 = this.field1018[arg3][arg0 + 1][arg2 + 1];
			if (var8 != null && var8.field1388 != null && var8.field1388.field1313.field1708 != null) {
				this.method308(arg1, (Model) var8.field1388.field1313, 128, 0, 128, true);
			}
		}
		if (arg0 < this.field1015 && arg2 > 0) {
			Square var9 = this.field1018[arg3][arg0 + 1][arg2 - 1];
			if (var9 != null && var9.field1388 != null && var9.field1388.field1313.field1708 != null) {
				this.method308(arg1, (Model) var9.field1388.field1313, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIILLZYQDKJV;II)V")
	public void method307(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5, int arg6) {
		boolean var8 = true;
		int var9 = arg5;
		int var10 = arg3 + arg5;
		int var11 = arg0 - 1;
		int var12 = arg0 + arg6;
		for (int var13 = arg1; var13 <= arg1 + 1; var13++) {
			if (this.field1014 != var13) {
				for (int var14 = var9; var14 <= var10; var14++) {
					if (var14 >= 0 && var14 < this.field1015) {
						for (int var15 = var11; var15 <= var12; var15++) {
							if (var15 >= 0 && var15 < this.field1016 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg0 && arg5 != var14)) {
								Square var16 = this.field1018[var13][var14][var15];
								if (var16 != null) {
									int var17 = (this.field1017[var13][var14 + 1][var15] + this.field1017[var13][var14][var15] + this.field1017[var13][var14][var15 + 1] + this.field1017[var13][var14 + 1][var15 + 1]) / 4 - (this.field1017[arg1][arg5 + 1][arg0] + this.field1017[arg1][arg5][arg0] + this.field1017[arg1][arg5][arg0 + 1] + this.field1017[arg1][arg5 + 1][arg0 + 1]) / 4;
									Wall var18 = var16.field1386;
									if (var18 != null && var18.field1537 != null && var18.field1537.field1708 != null) {
										this.method308(arg4, (Model) var18.field1537, (1 - arg3) * 64 + (var14 - arg5) * 128, var17, (var15 - arg0) * 128 + (1 - arg6) * 64, var8);
									}
									if (var18 != null && var18.field1538 != null && var18.field1538.field1708 != null) {
										this.method308(arg4, (Model) var18.field1538, (1 - arg3) * 64 + (var14 - arg5) * 128, var17, (var15 - arg0) * 128 + (1 - arg6) * 64, var8);
									}
									for (int var19 = 0; var19 < var16.field1390; var19++) {
										Sprite var20 = var16.field1391[var19];
										if (var20 != null && var20.field80 != null && var20.field80.field1708 != null) {
											int var21 = var20.field83 - var20.field82 + 1;
											int var22 = var20.field85 - var20.field84 + 1;
											this.method308(arg4, (Model) var20.field80, (var20.field82 - arg5) * 128 + (var21 - arg3) * 64, var17, (var20.field84 - arg0) * 128 + (var22 - arg6) * 64, var8);
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
		if (arg2 == 0) {
			;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(LLZYQDKJV;LLZYQDKJV;IIIZ)V")
	public void method308(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.field1065++;
		int var7 = 0;
		int[] var8 = arg1.field1196;
		int var9 = arg1.field1195;
		int var10 = arg1.field1216 >> 16;
		int var11 = arg1.field1216 << 16 >> 16;
		int var12 = arg1.field1217 >> 16;
		int var13 = arg1.field1217 << 16 >> 16;
		for (int var14 = 0; var14 < arg0.field1195; var14++) {
			VertexNormal var17 = arg0.field1708[var14];
			VertexNormal var18 = arg0.field1228[var14];
			if (var18.field1499 != 0) {
				int var19 = arg0.field1197[var14] - arg3;
				if (var19 <= arg1.field1219) {
					int var20 = arg0.field1196[var14] - arg2;
					if (var20 >= var10 && var20 <= var11) {
						int var21 = arg0.field1198[var14] - arg4;
						if (var21 >= var13 && var21 <= var12) {
							for (int var22 = 0; var22 < var9; var22++) {
								VertexNormal var23 = arg1.field1708[var22];
								VertexNormal var24 = arg1.field1228[var22];
								if (var8[var22] == var20 && arg1.field1198[var22] == var21 && arg1.field1197[var22] == var19 && var24.field1499 != 0) {
									var17.field1496 += var24.field1496;
									var17.field1497 += var24.field1497;
									var17.field1498 += var24.field1498;
									var17.field1499 += var24.field1499;
									var23.field1496 += var18.field1496;
									var23.field1497 += var18.field1497;
									var23.field1498 += var18.field1498;
									var23.field1499 += var18.field1499;
									var7++;
									this.field1063[var14] = this.field1065;
									this.field1064[var22] = this.field1065;
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
		for (int var15 = 0; var15 < arg0.field1199; var15++) {
			if (this.field1063[arg0.field1200[var15]] == this.field1065 && this.field1063[arg0.field1201[var15]] == this.field1065 && this.field1063[arg0.field1202[var15]] == this.field1065) {
				arg0.field1206[var15] = -1;
			}
		}
		for (int var16 = 0; var16 < arg1.field1199; var16++) {
			if (this.field1064[arg1.field1200[var16]] == this.field1065 && this.field1064[arg1.field1201[var16]] == this.field1065 && this.field1064[arg1.field1202[var16]] == this.field1065) {
				arg1.field1206[var16] = -1;
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a([IIIIII)V")
	public void method309(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Square var7 = this.field1018[arg3][arg4][arg5];
		if (var7 == null) {
			return;
		}
		QuickGround var8 = var7.field1384;
		if (var8 != null) {
			int var9 = var8.field64;
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
		Ground var11 = var7.field1385;
		if (var11 == null) {
			return;
		}
		int var12 = var11.field913;
		int var13 = var11.field914;
		int var14 = var11.field915;
		int var15 = var11.field916;
		int[] var16 = this.field1066[var12];
		int[] var17 = this.field1067[var13];
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

	@ObfuscatedName("KJCMXHNO.a(II[IIII)V")
	public static void init(int arg0, int[] arg2, int arg3, int arg4, int arg5) {
		field1072 = 0;
		field1073 = 0;
		field1074 = arg5;
		field1075 = arg0;
		field1070 = arg5 / 2;
		field1071 = arg0 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];
		for (int var7 = 128; var7 <= 384; var7 += 32) {
			for (int var15 = 0; var15 < 2048; var15 += 64) {
				field1035 = Model.sinTable[var7];
				field1036 = Model.cosTable[var7];
				field1037 = Model.sinTable[var15];
				field1038 = Model.cosTable[var15];
				int var16 = (var7 - 128) / 32;
				int var17 = var15 / 64;
				for (int var18 = -26; var18 <= 26; var18++) {
					for (int var19 = -26; var19 <= 26; var19++) {
						int var20 = var18 * 128;
						int var21 = var19 * 128;
						boolean var22 = false;
						for (int var23 = -arg4; var23 <= arg3; var23 += 128) {
							if (method311(var21, var20, arg2[var16] + var23)) {
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
						field1068[var8][var9][var10 + 25][var11 + 25] = var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.f(IIII)Z")
	public static boolean method311(int arg0, int arg1, int arg3) {
		int var4 = field1038 * arg1 + field1037 * arg0 >> 16;
		int var5 = field1038 * arg0 - field1037 * arg1 >> 16;
		int var6 = field1036 * var5 + field1035 * arg3 >> 16;
		int var7 = field1036 * arg3 - field1035 * var5 >> 16;
		if (var6 >= 50 && var6 <= 3500) {
			int var8 = (var4 << 9) / var6 + field1070;
			int var9 = (var7 << 9) / var6 + field1071;
			return var8 >= field1072 && var8 <= field1074 && var9 >= field1073 && var9 <= field1075;
		} else {
			return false;
		}
	}

	@ObfuscatedName("KJCMXHNO.e(III)V")
	public void method312(int arg1, int arg2) {
		field1044 = true;
		field1045 = arg1;
		field1046 = arg2;
		clickTileX = -1;
		clickTileZ = -1;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIII)V")
	public void draw(int arg0, int arg1, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.field1015 * 128) {
			arg0 = this.field1015 * 128 - 1;
		}
		if (arg4 < 0) {
			arg4 = 0;
		} else if (arg4 >= this.field1016 * 128) {
			arg4 = this.field1016 * 128 - 1;
		}
		field1025++;
		field1035 = Model.sinTable[arg6];
		field1036 = Model.cosTable[arg6];
		field1037 = Model.sinTable[arg5];
		field1038 = Model.cosTable[arg5];
		field1069 = field1068[(arg6 - 128) / 32][arg5 / 64];
		field1032 = arg0;
		field1033 = arg3;
		field1034 = arg4;
		field1030 = arg0 / 128;
		field1031 = arg4 / 128;
		field1024 = arg1;
		field1026 = field1030 - 25;
		if (field1026 < 0) {
			field1026 = 0;
		}
		field1028 = field1031 - 25;
		if (field1028 < 0) {
			field1028 = 0;
		}
		field1027 = field1030 + 25;
		if (field1027 > this.field1015) {
			field1027 = this.field1015;
		}
		field1029 = field1031 + 25;
		if (field1029 > this.field1016) {
			field1029 = this.field1016;
		}
		this.method319();
		field1023 = 0;
		for (int var8 = this.field1019; var8 < this.field1014; var8++) {
			Square[][] var33 = this.field1018[var8];
			for (int var34 = field1026; var34 < field1027; var34++) {
				for (int var35 = field1028; var35 < field1029; var35++) {
					Square var36 = var33[var34][var35];
					if (var36 != null) {
						if (var36.field1394 <= arg1 && (field1069[var34 - field1030 + 25][var35 - field1031 + 25] || this.field1017[var8][var34][var35] - arg3 >= 2000)) {
							var36.field1395 = true;
							var36.field1396 = true;
							if (var36.field1390 > 0) {
								var36.field1397 = true;
							} else {
								var36.field1397 = false;
							}
							field1023++;
						} else {
							var36.field1395 = false;
							var36.field1396 = false;
							var36.field1398 = 0;
						}
					}
				}
			}
		}
		for (int var9 = this.field1019; var9 < this.field1014; var9++) {
			Square[][] var22 = this.field1018[var9];
			for (int var23 = -25; var23 <= 0; var23++) {
				int var24 = field1030 + var23;
				int var25 = field1030 - var23;
				if (var24 >= field1026 || var25 < field1027) {
					for (int var26 = -25; var26 <= 0; var26++) {
						int var27 = field1031 + var26;
						int var28 = field1031 - var26;
						if (var24 >= field1026) {
							if (var27 >= field1028) {
								Square var29 = var22[var24][var27];
								if (var29 != null && var29.field1395) {
									this.method314(var29, true);
								}
							}
							if (var28 < field1029) {
								Square var30 = var22[var24][var28];
								if (var30 != null && var30.field1395) {
									this.method314(var30, true);
								}
							}
						}
						if (var25 < field1027) {
							if (var27 >= field1028) {
								Square var31 = var22[var25][var27];
								if (var31 != null && var31.field1395) {
									this.method314(var31, true);
								}
							}
							if (var28 < field1029) {
								Square var32 = var22[var25][var28];
								if (var32 != null && var32.field1395) {
									this.method314(var32, true);
								}
							}
						}
						if (field1023 == 0) {
							field1044 = false;
							return;
						}
					}
				}
			}
		}
		for (int var10 = this.field1019; var10 < this.field1014; var10++) {
			Square[][] var11 = this.field1018[var10];
			for (int var12 = -25; var12 <= 0; var12++) {
				int var13 = field1030 + var12;
				int var14 = field1030 - var12;
				if (var13 >= field1026 || var14 < field1027) {
					for (int var15 = -25; var15 <= 0; var15++) {
						int var16 = field1031 + var15;
						int var17 = field1031 - var15;
						if (var13 >= field1026) {
							if (var16 >= field1028) {
								Square var18 = var11[var13][var16];
								if (var18 != null && var18.field1395) {
									this.method314(var18, false);
								}
							}
							if (var17 < field1029) {
								Square var19 = var11[var13][var17];
								if (var19 != null && var19.field1395) {
									this.method314(var19, false);
								}
							}
						}
						if (var14 < field1027) {
							if (var16 >= field1028) {
								Square var20 = var11[var14][var16];
								if (var20 != null && var20.field1395) {
									this.method314(var20, false);
								}
							}
							if (var17 < field1029) {
								Square var21 = var11[var14][var17];
								if (var21 != null && var21.field1395) {
									this.method314(var21, false);
								}
							}
						}
						if (field1023 == 0) {
							field1044 = false;
							return;
						}
					}
				}
			}
		}
		field1044 = false;
	}

	@ObfuscatedName("KJCMXHNO.a(LRIEEXHOP;Z)V")
	public void method314(Square arg0, boolean arg1) {
		field1054.push(arg0);
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
												var3 = (Square) field1054.pop();
												if (var3 == null) {
													return;
												}
											} while (!var3.field1396);
											var4 = var3.field1381;
											var5 = var3.field1382;
											var6 = var3.field1380;
											var7 = var3.field1383;
											var8 = this.field1018[var6];
											if (!var3.field1395) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.field1018[var6 - 1][var4][var5];
													if (var9 != null && var9.field1396) {
														continue;
													}
												}
												if (var4 <= field1030 && var4 > field1026) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field1396 && (var10.field1395 || (var3.field1393 & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= field1030 && var4 < field1027 - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field1396 && (var11.field1395 || (var3.field1393 & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= field1031 && var5 > field1028) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field1396 && (var12.field1395 || (var3.field1393 & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= field1031 && var5 < field1029 - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field1396 && (var13.field1395 || (var3.field1393 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field1395 = false;
											if (var3.field1402 != null) {
												Square var14 = var3.field1402;
												if (var14.field1384 == null) {
													if (var14.field1385 != null && !this.method320(0, var4, var5)) {
														this.method316(field1036, field1038, var14.field1385, field1035, var5, var4, field1037, (byte) 3);
													}
												} else if (!this.method320(0, var4, var5)) {
													this.method315(var14.field1384, 0, field1035, field1036, field1037, field1038, var4, var5);
												}
												Wall var15 = var14.field1386;
												if (var15 != null) {
													var15.field1537.method381(0, field1035, field1036, field1037, field1038, var15.field1533 - field1032, var15.field1532 - field1033, var15.field1534 - field1034, var15.field1539);
												}
												for (int var16 = 0; var16 < var14.field1390; var16++) {
													Sprite var17 = var14.field1391[var16];
													if (var17 != null) {
														var17.field80.method381(var17.field81, field1035, field1036, field1037, field1038, var17.field78 - field1032, var17.field77 - field1033, var17.field79 - field1034, var17.field88);
													}
												}
											}
											boolean var18 = false;
											if (var3.field1384 == null) {
												if (var3.field1385 != null && !this.method320(var7, var4, var5)) {
													var18 = true;
													this.method316(field1036, field1038, var3.field1385, field1035, var5, var4, field1037, (byte) 3);
												}
											} else if (!this.method320(var7, var4, var5)) {
												var18 = true;
												this.method315(var3.field1384, var7, field1035, field1036, field1037, field1038, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.field1386;
											Decor var22 = var3.field1387;
											if (var21 != null || var22 != null) {
												if (field1030 == var4) {
													var19++;
												} else if (field1030 < var4) {
													var19 += 2;
												}
												if (field1031 == var5) {
													var19 += 3;
												} else if (field1031 > var5) {
													var19 += 6;
												}
												var20 = field1055[var19];
												var3.field1401 = field1057[var19];
											}
											if (var21 != null) {
												if ((var21.field1535 & field1056[var19]) == 0) {
													var3.field1398 = 0;
												} else if (var21.field1535 == 16) {
													var3.field1398 = 3;
													var3.field1399 = field1058[var19];
													var3.field1400 = 3 - var3.field1399;
												} else if (var21.field1535 == 32) {
													var3.field1398 = 6;
													var3.field1399 = field1059[var19];
													var3.field1400 = 6 - var3.field1399;
												} else if (var21.field1535 == 64) {
													var3.field1398 = 12;
													var3.field1399 = field1060[var19];
													var3.field1400 = 12 - var3.field1399;
												} else {
													var3.field1398 = 9;
													var3.field1399 = field1061[var19];
													var3.field1400 = 9 - var3.field1399;
												}
												if ((var21.field1535 & var20) != 0 && !this.method321(var7, var4, var5, var21.field1535)) {
													var21.field1537.method381(0, field1035, field1036, field1037, field1038, var21.field1533 - field1032, var21.field1532 - field1033, var21.field1534 - field1034, var21.field1539);
												}
												if ((var21.field1536 & var20) != 0 && !this.method321(var7, var4, var5, var21.field1536)) {
													var21.field1538.method381(0, field1035, field1036, field1037, field1038, var21.field1533 - field1032, var21.field1532 - field1033, var21.field1534 - field1034, var21.field1539);
												}
											}
											if (var22 != null && !this.method322(var7, var4, var5, var22.field1411.field1709)) {
												if ((var22.field1409 & var20) != 0) {
													var22.field1411.method381(var22.field1410, field1035, field1036, field1037, field1038, var22.field1407 - field1032, var22.field1406 - field1033, var22.field1408 - field1034, var22.field1412);
												} else if ((var22.field1409 & 0x300) != 0) {
													int var23 = var22.field1407 - field1032;
													int var24 = var22.field1406 - field1033;
													int var25 = var22.field1408 - field1034;
													int var26 = var22.field1410;
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
													if ((var22.field1409 & 0x100) != 0 && var28 < var27) {
														int var29 = field1040[var26] + var23;
														int var30 = field1041[var26] + var25;
														var22.field1411.method381(var26 * 512 + 256, field1035, field1036, field1037, field1038, var29, var24, var30, var22.field1412);
													}
													if ((var22.field1409 & 0x200) != 0 && var28 > var27) {
														int var31 = field1042[var26] + var23;
														int var32 = field1043[var26] + var25;
														var22.field1411.method381(var26 * 512 + 1280 & 0x7FF, field1035, field1036, field1037, field1038, var31, var24, var32, var22.field1412);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.field1388;
												if (var33 != null) {
													var33.field1313.method381(0, field1035, field1036, field1037, field1038, var33.field1311 - field1032, var33.field1310 - field1033, var33.field1312 - field1034, var33.field1314);
												}
												GroundObject var34 = var3.field1389;
												if (var34 != null && var34.field643 == 0) {
													if (var34.field640 != null) {
														var34.field640.method381(0, field1035, field1036, field1037, field1038, var34.field637 - field1032, var34.field636 - field1033, var34.field638 - field1034, var34.field642);
													}
													if (var34.field641 != null) {
														var34.field641.method381(0, field1035, field1036, field1037, field1038, var34.field637 - field1032, var34.field636 - field1033, var34.field638 - field1034, var34.field642);
													}
													if (var34.field639 != null) {
														var34.field639.method381(0, field1035, field1036, field1037, field1038, var34.field637 - field1032, var34.field636 - field1033, var34.field638 - field1034, var34.field642);
													}
												}
											}
											int var35 = var3.field1393;
											if (var35 != 0) {
												if (var4 < field1030 && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field1396) {
														field1054.push(var36);
													}
												}
												if (var5 < field1031 && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.field1396) {
														field1054.push(var37);
													}
												}
												if (var4 > field1030 && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.field1396) {
														field1054.push(var38);
													}
												}
												if (var5 > field1031 && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.field1396) {
														field1054.push(var39);
													}
												}
											}
											break;
										}
										if (var3.field1398 != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.field1390; var41++) {
												if (field1025 != var3.field1391[var41].field87 && (var3.field1392[var41] & var3.field1398) == var3.field1399) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.field1386;
												if (!this.method321(var7, var4, var5, var42.field1535)) {
													var42.field1537.method381(0, field1035, field1036, field1037, field1038, var42.field1533 - field1032, var42.field1532 - field1033, var42.field1534 - field1034, var42.field1539);
												}
												var3.field1398 = 0;
											}
										}
										if (!var3.field1397) {
											break;
										}
										try {
											int var43 = var3.field1390;
											var3.field1397 = false;
											int var44 = 0;
											label559: for (int var45 = 0; var45 < var43; var45++) {
												Sprite var46 = var3.field1391[var45];
												if (field1025 != var46.field87) {
													for (int var47 = var46.field82; var47 <= var46.field83; var47++) {
														for (int var48 = var46.field84; var48 <= var46.field85; var48++) {
															Square var49 = var8[var47][var48];
															if (var49.field1395) {
																var3.field1397 = true;
																continue label559;
															}
															if (var49.field1398 != 0) {
																int var50 = 0;
																if (var47 > var46.field82) {
																	var50++;
																}
																if (var47 < var46.field83) {
																	var50 += 4;
																}
																if (var48 > var46.field84) {
																	var50 += 8;
																}
																if (var48 < var46.field85) {
																	var50 += 2;
																}
																if ((var50 & var49.field1398) == var3.field1400) {
																	var3.field1397 = true;
																	continue label559;
																}
															}
														}
													}
													field1039[var44++] = var46;
													int var51 = field1030 - var46.field82;
													int var52 = var46.field83 - field1030;
													if (var52 > var51) {
														var51 = var52;
													}
													int var53 = field1031 - var46.field84;
													int var54 = var46.field85 - field1031;
													if (var54 > var53) {
														var46.field86 = var51 + var54;
													} else {
														var46.field86 = var51 + var53;
													}
												}
											}
											while (var44 > 0) {
												int var55 = -50;
												int var56 = -1;
												for (int var57 = 0; var57 < var44; var57++) {
													Sprite var58 = field1039[var57];
													if (field1025 != var58.field87) {
														if (var58.field86 > var55) {
															var55 = var58.field86;
															var56 = var57;
														} else if (var58.field86 == var55) {
															int var59 = var58.field78 - field1032;
															int var60 = var58.field79 - field1034;
															int var61 = field1039[var56].field78 - field1032;
															int var62 = field1039[var56].field79 - field1034;
															if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
																var56 = var57;
															}
														}
													}
												}
												if (var56 == -1) {
													break;
												}
												Sprite var63 = field1039[var56];
												var63.field87 = field1025;
												if (!this.method323(var7, var63.field82, var63.field83, var63.field84, var63.field85, var63.field80.field1709)) {
													var63.field80.method381(var63.field81, field1035, field1036, field1037, field1038, var63.field78 - field1032, var63.field77 - field1033, var63.field79 - field1034, var63.field88);
												}
												for (int var64 = var63.field82; var64 <= var63.field83; var64++) {
													for (int var65 = var63.field84; var65 <= var63.field85; var65++) {
														Square var66 = var8[var64][var65];
														if (var66.field1398 != 0) {
															field1054.push(var66);
														} else if ((var4 != var64 || var5 != var65) && var66.field1396) {
															field1054.push(var66);
														}
													}
												}
											}
											if (!var3.field1397) {
												break;
											}
										} catch (Exception var89) {
											var3.field1397 = false;
											break;
										}
									}
								} while (!var3.field1396);
							} while (var3.field1398 != 0);
							if (var4 > field1030 || var4 <= field1026) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.field1396);
						if (var4 < field1030 || var4 >= field1027 - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.field1396);
					if (var5 > field1031 || var5 <= field1028) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.field1396);
				if (var5 < field1031 || var5 >= field1029 - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.field1396);
			var3.field1396 = false;
			field1023--;
			GroundObject var71 = var3.field1389;
			if (var71 != null && var71.field643 != 0) {
				if (var71.field640 != null) {
					var71.field640.method381(0, field1035, field1036, field1037, field1038, var71.field637 - field1032, var71.field636 - field1033 - var71.field643, var71.field638 - field1034, var71.field642);
				}
				if (var71.field641 != null) {
					var71.field641.method381(0, field1035, field1036, field1037, field1038, var71.field637 - field1032, var71.field636 - field1033 - var71.field643, var71.field638 - field1034, var71.field642);
				}
				if (var71.field639 != null) {
					var71.field639.method381(0, field1035, field1036, field1037, field1038, var71.field637 - field1032, var71.field636 - field1033 - var71.field643, var71.field638 - field1034, var71.field642);
				}
			}
			if (var3.field1401 != 0) {
				Decor var72 = var3.field1387;
				if (var72 != null && !this.method322(var7, var4, var5, var72.field1411.field1709)) {
					if ((var72.field1409 & var3.field1401) != 0) {
						var72.field1411.method381(var72.field1410, field1035, field1036, field1037, field1038, var72.field1407 - field1032, var72.field1406 - field1033, var72.field1408 - field1034, var72.field1412);
					} else if ((var72.field1409 & 0x300) != 0) {
						int var73 = var72.field1407 - field1032;
						int var74 = var72.field1406 - field1033;
						int var75 = var72.field1408 - field1034;
						int var76 = var72.field1410;
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
						if ((var72.field1409 & 0x100) != 0 && var78 >= var77) {
							int var79 = field1040[var76] + var73;
							int var80 = field1041[var76] + var75;
							var72.field1411.method381(var76 * 512 + 256, field1035, field1036, field1037, field1038, var79, var74, var80, var72.field1412);
						}
						if ((var72.field1409 & 0x200) != 0 && var78 <= var77) {
							int var81 = field1042[var76] + var73;
							int var82 = field1043[var76] + var75;
							var72.field1411.method381(var76 * 512 + 1280 & 0x7FF, field1035, field1036, field1037, field1038, var81, var74, var82, var72.field1412);
						}
					}
				}
				Wall var83 = var3.field1386;
				if (var83 != null) {
					if ((var83.field1536 & var3.field1401) != 0 && !this.method321(var7, var4, var5, var83.field1536)) {
						var83.field1538.method381(0, field1035, field1036, field1037, field1038, var83.field1533 - field1032, var83.field1532 - field1033, var83.field1534 - field1034, var83.field1539);
					}
					if ((var83.field1535 & var3.field1401) != 0 && !this.method321(var7, var4, var5, var83.field1535)) {
						var83.field1537.method381(0, field1035, field1036, field1037, field1038, var83.field1533 - field1032, var83.field1532 - field1033, var83.field1534 - field1034, var83.field1539);
					}
				}
			}
			if (var6 < this.field1014 - 1) {
				Square var84 = this.field1018[var6 + 1][var4][var5];
				if (var84 != null && var84.field1396) {
					field1054.push(var84);
				}
			}
			if (var4 < field1030) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.field1396) {
					field1054.push(var85);
				}
			}
			if (var5 < field1031) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.field1396) {
					field1054.push(var86);
				}
			}
			if (var4 > field1030) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.field1396) {
					field1054.push(var87);
				}
			}
			if (var5 > field1031) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.field1396) {
					field1054.push(var88);
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(LAYYYSATX;IIIIIII)V")
	public void method315(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field1032;
		int var11;
		int var12 = var11 = (arg7 << 7) - field1034;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field1017[arg1][arg6][arg7] - field1033;
		int var18 = this.field1017[arg1][arg6 + 1][arg7] - field1033;
		int var19 = this.field1017[arg1][arg6 + 1][arg7 + 1] - field1033;
		int var20 = this.field1017[arg1][arg6][arg7 + 1] - field1033;
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
		Pix3D.field1593 = 0;
		if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
			Pix3D.hclip = false;
			if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > Pix2D.safeWidth || var51 > Pix2D.safeWidth || var47 > Pix2D.safeWidth) {
				Pix3D.hclip = true;
			}
			if (field1044 && this.method318(field1045, field1046, var50, var52, var48, var49, var51, var47)) {
				clickTileX = arg6;
				clickTileZ = arg7;
			}
			if (arg0.field62 == -1) {
				if (arg0.field60 != 12345678) {
					Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, arg0.field60, arg0.field61, arg0.field59);
				}
			} else if (lowMem) {
				int var53 = field1062[arg0.field62];
				Pix3D.gouraudTriangle(var50, var52, var48, var49, var51, var47, this.method317(arg0.field60, var53), this.method317(arg0.field61, var53), this.method317(arg0.field59, var53));
			} else if (arg0.field63) {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.field60, arg0.field61, arg0.field59, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field62);
			} else {
				Pix3D.textureTriangle(var50, var52, var48, var49, var51, var47, arg0.field60, arg0.field61, arg0.field59, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field62);
			}
		}
		if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > Pix2D.safeWidth || var47 > Pix2D.safeWidth || var51 > Pix2D.safeWidth) {
			Pix3D.hclip = true;
		}
		if (field1044 && this.method318(field1045, field1046, var46, var48, var52, var45, var47, var51)) {
			clickTileX = arg6;
			clickTileZ = arg7;
		}
		if (arg0.field62 != -1) {
			if (!lowMem) {
				Pix3D.textureTriangle(var46, var48, var52, var45, var47, var51, arg0.field58, arg0.field59, arg0.field61, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field62);
				return;
			}
			int var54 = field1062[arg0.field62];
			Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, this.method317(arg0.field58, var54), this.method317(arg0.field59, var54), this.method317(arg0.field61, var54));
		} else if (arg0.field58 != 12345678) {
			Pix3D.gouraudTriangle(var46, var48, var52, var45, var47, var51, arg0.field58, arg0.field59, arg0.field61);
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IILJQCVNYYR;IIIIB)V")
	public void method316(int arg0, int arg1, Ground arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
		int var9 = arg2.field902.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var23 = arg2.field902[var10] - field1032;
			int var24 = arg2.field903[var10] - field1033;
			int var25 = arg2.field904[var10] - field1034;
			int var26 = arg1 * var23 + arg6 * var25 >> 16;
			int var27 = arg1 * var25 - arg6 * var23 >> 16;
			int var29 = arg0 * var24 - arg3 * var27 >> 16;
			int var30 = arg0 * var27 + arg3 * var24 >> 16;
			if (var30 < 50) {
				return;
			}
			if (arg2.field911 != null) {
				Ground.field919[var10] = var26;
				Ground.field920[var10] = var29;
				Ground.field921[var10] = var30;
			}
			Ground.field917[var10] = (var26 << 9) / var30 + Pix3D.centerX;
			Ground.field918[var10] = (var29 << 9) / var30 + Pix3D.centerY;
		}
		Pix3D.field1593 = 0;
		int var11 = arg2.field908.length;
		if (arg7 != 3) {
			return;
		}
		for (int var12 = 0; var12 < var11; var12++) {
			int var13 = arg2.field908[var12];
			int var14 = arg2.field909[var12];
			int var15 = arg2.field910[var12];
			int var16 = Ground.field917[var13];
			int var17 = Ground.field917[var14];
			int var18 = Ground.field917[var15];
			int var19 = Ground.field918[var13];
			int var20 = Ground.field918[var14];
			int var21 = Ground.field918[var15];
			if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
				Pix3D.hclip = false;
				if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > Pix2D.safeWidth || var17 > Pix2D.safeWidth || var18 > Pix2D.safeWidth) {
					Pix3D.hclip = true;
				}
				if (field1044 && this.method318(field1045, field1046, var19, var20, var21, var16, var17, var18)) {
					clickTileX = arg5;
					clickTileZ = arg4;
				}
				if (arg2.field911 == null || arg2.field911[var12] == -1) {
					if (arg2.field905[var12] != 12345678) {
						Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, arg2.field905[var12], arg2.field906[var12], arg2.field907[var12]);
					}
				} else if (lowMem) {
					int var22 = field1062[arg2.field911[var12]];
					Pix3D.gouraudTriangle(var19, var20, var21, var16, var17, var18, this.method317(arg2.field905[var12], var22), this.method317(arg2.field906[var12], var22), this.method317(arg2.field907[var12], var22));
				} else if (arg2.field912) {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg2.field905[var12], arg2.field906[var12], arg2.field907[var12], Ground.field919[0], Ground.field919[1], Ground.field919[3], Ground.field920[0], Ground.field920[1], Ground.field920[3], Ground.field921[0], Ground.field921[1], Ground.field921[3], arg2.field911[var12]);
				} else {
					Pix3D.textureTriangle(var19, var20, var21, var16, var17, var18, arg2.field905[var12], arg2.field906[var12], arg2.field907[var12], Ground.field919[var13], Ground.field919[var14], Ground.field919[var15], Ground.field920[var13], Ground.field920[var14], Ground.field920[var15], Ground.field921[var13], Ground.field921[var14], Ground.field921[var15], arg2.field911[var12]);
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.f(III)I")
	public int method317(int arg0, int arg1) {
		int var4 = 127 - arg0;
		int var5 = (arg1 & 0x7F) * var4 / 160;
		if (var5 < 2) {
			var5 = 2;
		} else if (var5 > 126) {
			var5 = 126;
		}
		return (arg1 & 0xFF80) + var5;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIII)Z")
	public boolean method318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("KJCMXHNO.b(I)V")
	public void method319() {
		int var2 = field1050[field1024];
		Occlude[] var3 = field1051[field1024];
		field1052 = 0;
		for (int var4 = 0; var4 < var2; var4++) {
			Occlude var5 = var3[var4];
			if (var5.field1482 == 1) {
				int var6 = var5.field1478 - field1030 + 25;
				if (var6 >= 0 && var6 <= 50) {
					int var7 = var5.field1480 - field1031 + 25;
					if (var7 < 0) {
						var7 = 0;
					}
					int var8 = var5.field1481 - field1031 + 25;
					if (var8 > 50) {
						var8 = 50;
					}
					boolean var9 = false;
					while (var7 <= var8) {
						if (field1069[var6][var7++]) {
							var9 = true;
							break;
						}
					}
					if (var9) {
						int var10 = field1032 - var5.field1483;
						if (var10 > 32) {
							var5.field1489 = 1;
						} else {
							if (var10 >= -32) {
								continue;
							}
							var5.field1489 = 2;
							var10 = -var10;
						}
						var5.field1492 = (var5.field1485 - field1034 << 8) / var10;
						var5.field1493 = (var5.field1486 - field1034 << 8) / var10;
						var5.field1494 = (var5.field1487 - field1033 << 8) / var10;
						var5.field1495 = (var5.field1488 - field1033 << 8) / var10;
						field1053[field1052++] = var5;
					}
				}
			} else if (var5.field1482 == 2) {
				int var11 = var5.field1480 - field1031 + 25;
				if (var11 >= 0 && var11 <= 50) {
					int var12 = var5.field1478 - field1030 + 25;
					if (var12 < 0) {
						var12 = 0;
					}
					int var13 = var5.field1479 - field1030 + 25;
					if (var13 > 50) {
						var13 = 50;
					}
					boolean var14 = false;
					while (var12 <= var13) {
						if (field1069[var12++][var11]) {
							var14 = true;
							break;
						}
					}
					if (var14) {
						int var15 = field1034 - var5.field1485;
						if (var15 > 32) {
							var5.field1489 = 3;
						} else {
							if (var15 >= -32) {
								continue;
							}
							var5.field1489 = 4;
							var15 = -var15;
						}
						var5.field1490 = (var5.field1483 - field1032 << 8) / var15;
						var5.field1491 = (var5.field1484 - field1032 << 8) / var15;
						var5.field1494 = (var5.field1487 - field1033 << 8) / var15;
						var5.field1495 = (var5.field1488 - field1033 << 8) / var15;
						field1053[field1052++] = var5;
					}
				}
			} else if (var5.field1482 == 4) {
				int var16 = var5.field1487 - field1033;
				if (var16 > 128) {
					int var17 = var5.field1480 - field1031 + 25;
					if (var17 < 0) {
						var17 = 0;
					}
					int var18 = var5.field1481 - field1031 + 25;
					if (var18 > 50) {
						var18 = 50;
					}
					if (var17 <= var18) {
						int var19 = var5.field1478 - field1030 + 25;
						if (var19 < 0) {
							var19 = 0;
						}
						int var20 = var5.field1479 - field1030 + 25;
						if (var20 > 50) {
							var20 = 50;
						}
						boolean var21 = false;
						label153: for (int var22 = var19; var22 <= var20; var22++) {
							for (int var23 = var17; var23 <= var18; var23++) {
								if (field1069[var22][var23]) {
									var21 = true;
									break label153;
								}
							}
						}
						if (var21) {
							var5.field1489 = 5;
							var5.field1490 = (var5.field1483 - field1032 << 8) / var16;
							var5.field1491 = (var5.field1484 - field1032 << 8) / var16;
							var5.field1492 = (var5.field1485 - field1034 << 8) / var16;
							var5.field1493 = (var5.field1486 - field1034 << 8) / var16;
							field1053[field1052++] = var5;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.g(III)Z")
	public boolean method320(int arg0, int arg1, int arg2) {
		int var4 = this.field1022[arg0][arg1][arg2];
		if (-field1025 == var4) {
			return false;
		} else if (field1025 == var4) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.method324(var5 + 1, this.field1017[arg0][arg1][arg2], var6 + 1) && this.method324(var5 + 128 - 1, this.field1017[arg0][arg1 + 1][arg2], var6 + 1) && this.method324(var5 + 128 - 1, this.field1017[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method324(var5 + 1, this.field1017[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.field1022[arg0][arg1][arg2] = field1025;
				return true;
			} else {
				this.field1022[arg0][arg1][arg2] = -field1025;
				return false;
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.g(IIII)Z")
	public boolean method321(int arg0, int arg1, int arg2, int arg3) {
		if (!this.method320(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.field1017[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field1032) {
					if (!this.method324(var5, var7, var6)) {
						return false;
					}
					if (!this.method324(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method324(var5, var8, var6)) {
						return false;
					}
					if (!this.method324(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method324(var5, var9, var6)) {
					return false;
				}
				if (!this.method324(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < field1034) {
					if (!this.method324(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.method324(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method324(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.method324(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method324(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.method324(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < field1032) {
					if (!this.method324(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.method324(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method324(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.method324(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method324(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.method324(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > field1034) {
					if (!this.method324(var5, var7, var6)) {
						return false;
					}
					if (!this.method324(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method324(var5, var8, var6)) {
						return false;
					}
					if (!this.method324(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.method324(var5, var9, var6)) {
					return false;
				}
				if (!this.method324(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method324(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method324(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.method324(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.method324(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.method324(var5, var9, var6);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("KJCMXHNO.h(IIII)Z")
	public boolean method322(int arg0, int arg1, int arg2, int arg3) {
		if (this.method320(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.method324(var5 + 1, this.field1017[arg0][arg1][arg2] - arg3, var6 + 1) && this.method324(var5 + 128 - 1, this.field1017[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method324(var5 + 128 - 1, this.field1017[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method324(var5 + 1, this.field1017[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIII)Z")
	public boolean method323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var15 = arg3; var15 <= arg4; var15++) {
					if (this.field1022[arg0][var9][var15] == -field1025) {
						return false;
					}
				}
			}
			int var10 = (arg1 << 7) + 1;
			int var11 = (arg3 << 7) + 2;
			int var12 = this.field1017[arg0][arg1][arg3] - arg5;
			if (!this.method324(var10, var12, var11)) {
				return false;
			}
			int var13 = (arg2 << 7) - 1;
			if (!this.method324(var13, var12, var11)) {
				return false;
			}
			int var14 = (arg4 << 7) - 1;
			if (!this.method324(var10, var12, var14)) {
				return false;
			} else if (this.method324(var13, var12, var14)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method320(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.method324(var7 + 1, this.field1017[arg0][arg1][arg3] - arg5, var8 + 1) && this.method324(var7 + 128 - 1, this.field1017[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method324(var7 + 128 - 1, this.field1017[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method324(var7 + 1, this.field1017[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("KJCMXHNO.h(III)Z")
	public boolean method324(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1052; var4++) {
			Occlude var5 = field1053[var4];
			if (var5.field1489 == 1) {
				int var6 = var5.field1483 - arg0;
				if (var6 > 0) {
					int var7 = (var5.field1492 * var6 >> 8) + var5.field1485;
					int var8 = (var5.field1493 * var6 >> 8) + var5.field1486;
					int var9 = (var5.field1494 * var6 >> 8) + var5.field1487;
					int var10 = (var5.field1495 * var6 >> 8) + var5.field1488;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field1489 == 2) {
				int var11 = arg0 - var5.field1483;
				if (var11 > 0) {
					int var12 = (var5.field1492 * var11 >> 8) + var5.field1485;
					int var13 = (var5.field1493 * var11 >> 8) + var5.field1486;
					int var14 = (var5.field1494 * var11 >> 8) + var5.field1487;
					int var15 = (var5.field1495 * var11 >> 8) + var5.field1488;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field1489 == 3) {
				int var16 = var5.field1485 - arg2;
				if (var16 > 0) {
					int var17 = (var5.field1490 * var16 >> 8) + var5.field1483;
					int var18 = (var5.field1491 * var16 >> 8) + var5.field1484;
					int var19 = (var5.field1494 * var16 >> 8) + var5.field1487;
					int var20 = (var5.field1495 * var16 >> 8) + var5.field1488;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field1489 == 4) {
				int var21 = arg2 - var5.field1485;
				if (var21 > 0) {
					int var22 = (var5.field1490 * var21 >> 8) + var5.field1483;
					int var23 = (var5.field1491 * var21 >> 8) + var5.field1484;
					int var24 = (var5.field1494 * var21 >> 8) + var5.field1487;
					int var25 = (var5.field1495 * var21 >> 8) + var5.field1488;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field1489 == 5) {
				int var26 = arg1 - var5.field1487;
				if (var26 > 0) {
					int var27 = (var5.field1490 * var26 >> 8) + var5.field1483;
					int var28 = (var5.field1491 * var26 >> 8) + var5.field1484;
					int var29 = (var5.field1492 * var26 >> 8) + var5.field1485;
					int var30 = (var5.field1493 * var26 >> 8) + var5.field1486;
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
