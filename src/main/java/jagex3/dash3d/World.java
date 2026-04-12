package jagex3.dash3d;

import deob.*;
import jagex3.datastruct.LinkList;

@ObfuscatedName("ab")
public final class World {

	@ObfuscatedName("ab.S")
	public static int field145;
	@ObfuscatedName("ab.Y")
	public static int field151;
	@ObfuscatedName("ab.kb")
	public static int field163;
	@ObfuscatedName("ab.cb")
	public static int field155;
	@ObfuscatedName("ab.jb")
	public static int field162;
	@ObfuscatedName("ab.W")
	public static int field149;
	@ObfuscatedName("ab.h")
	public static int field109;
	@ObfuscatedName("ab.K")
	public static int field137;
	@ObfuscatedName("ab.E")
	public static int field131;
	@ObfuscatedName("ab.y")
	public static int field126;
	@ObfuscatedName("ab.a")
	public final Square[][][] field102 = new Square[4][104][104];

	@ObfuscatedName("ab.ab")
	public int field153 = 0;

	@ObfuscatedName("ab.bb")
	public final int[] field154 = new int[10000];

	@ObfuscatedName("ab.c")
	public static int field104 = 0;

	@ObfuscatedName("ab.d")
	public static int field105 = -1;

	@ObfuscatedName("ab.db")
	public final int[][] field156 = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};

	@ObfuscatedName("ab.eb")
	public static int[] field157 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};

	@ObfuscatedName("ab.f")
	public static int[] field107 = new int[]{53, -53, -53, 53};

	@ObfuscatedName("ab.fb")
	public static int[] field158 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};

	@ObfuscatedName("ab.g")
	public static int field108 = -1;

	@ObfuscatedName("ab.gb")
	public static int[] field159 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};

	@ObfuscatedName("ab.i")
	public final int[][][] field110 = new int[4][105][105];

	@ObfuscatedName("ab.ib")
	public static boolean[][][][] field161 = new boolean[8][32][51][51];

	@ObfuscatedName("ab.k")
	public static int field112 = 0;

	@ObfuscatedName("ab.n")
	public static boolean field115 = true;

	@ObfuscatedName("ab.p")
	public static final int field117 = 4;

	@ObfuscatedName("ab.q")
	public static int field118 = 0;

	@ObfuscatedName("ab.r")
	public int field119 = 0;

	@ObfuscatedName("ab.s")
	public final Sprite[] field120 = new Sprite[5000];

	@ObfuscatedName("ab.t")
	public static int[] field121 = new int[]{-45, 45, 45, -45};

	@ObfuscatedName("ab.v")
	public static int field123 = 0;

	@ObfuscatedName("ab.w")
	public final int field124 = 104;

	@ObfuscatedName("ab.B")
	public static int[] field129 = new int[]{45, 45, -45, -45};

	@ObfuscatedName("ab.A")
	public static int[] field128 = new int[field117];

	@ObfuscatedName("ab.J")
	public static int field136 = 0;

	@ObfuscatedName("ab.O")
	public static boolean field141 = false;

	@ObfuscatedName("ab.M")
	public static int[] field139 = new int[]{-53, -53, 53, 53};

	@ObfuscatedName("ab.N")
	public static Occlude[][] field140 = new Occlude[field117][500];

	@ObfuscatedName("ab.H")
	public static Occlude[] field134 = new Occlude[500];

	@ObfuscatedName("ab.G")
	public static Sprite[] field133 = new Sprite[100];

	@ObfuscatedName("ab.I")
	public static LinkList field135 = new LinkList();

	@ObfuscatedName("ab.R")
	public static int[] field144 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};

	@ObfuscatedName("ab.T")
	public static int[] field146 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};

	@ObfuscatedName("ab.U")
	public static int[] field147 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};

	@ObfuscatedName("ab.Z")
	public static int[] field152 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};

	@ObfuscatedName("ab.C")
	public int field130 = 0;

	@ObfuscatedName("ab.V")
	public final int[][] field148 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};

	@ObfuscatedName("ab.X")
	public final int[] field150 = new int[10000];

	@ObfuscatedName("ab.P")
	public final int field142 = 4;

	@ObfuscatedName("ab.Q")
	public final int field143 = 104;

	@ObfuscatedName("ab.F")
	public final int[][][] field132;

	@ObfuscatedName("ab.c()V")
	public static void method70() {
		field133 = null;
		field107 = null;
		field139 = null;
		field121 = null;
		field129 = null;
		field128 = null;
		field140 = null;
		field134 = null;
		field135 = null;
		field147 = null;
		field144 = null;
		field157 = null;
		field146 = null;
		field152 = null;
		field159 = null;
		field158 = null;
		field161 = null;
		Statics.field160 = null;
	}

	@ObfuscatedName("ab.a(III)I")
	public int method47(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		return var4 == null || var4.field887 == null ? 0 : var4.field887.field2678;
	}

	@ObfuscatedName("ab.a(II)V")
	public void method48(int arg0, int arg1) {
		Square var3 = this.field102[0][arg0][arg1];
		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = this.field102[var4][arg0][arg1] = this.field102[var4 + 1][arg0][arg1];
			if (var5 != null) {
				var5.field874--;
				for (int var6 = 0; var6 < var5.field888; var6++) {
					Sprite var7 = var5.field873[var6];
					if ((var7.field980 >> 29 & 0x3) == 2 && var7.field984 == arg0 && var7.field992 == arg1) {
						var7.field979--;
					}
				}
			}
		}
		if (this.field102[0][arg0][arg1] == null) {
			this.field102[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		this.field102[0][arg0][arg1].field866 = var3;
		this.field102[3][arg0][arg1] = null;
	}

	@ObfuscatedName("ab.b(III)I")
	public int method49(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		return var4 == null || var4.field883 == null ? 0 : var4.field883.field1361;
	}

	@ObfuscatedName("ab.a(IIIILvb;Lvb;IIII)V")
	public void method50(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		class17 var11 = new class17();
		var11.field531 = arg8;
		var11.field543 = arg9;
		var11.field529 = arg1 * 128 + 64;
		var11.field550 = arg2 * 128 + 64;
		var11.field537 = arg3;
		var11.field536 = arg4;
		var11.field535 = arg5;
		var11.field532 = arg6;
		var11.field542 = arg7;
		for (int var12 = arg0; var12 >= 0; var12--) {
			if (this.field102[var12][arg1][arg2] == null) {
				this.field102[var12][arg1][arg2] = new Square(var12, arg1, arg2);
			}
		}
		this.field102[arg0][arg1][arg2].field880 = var11;
	}

	@ObfuscatedName("ab.a([IIIII)V")
	public static void method51(int[] arg0) {
		field145 = 0;
		field151 = 0;
		field163 = 512;
		field155 = 334;
		field149 = 256;
		field162 = 167;
		boolean[][][][] var1 = new boolean[9][32][53][53];
		for (int var2 = 128; var2 <= 384; var2 += 32) {
			for (int var3 = 0; var3 < 2048; var3 += 64) {
				field109 = Model.field2256[var2];
				field137 = Model.field2258[var2];
				field131 = Model.field2256[var3];
				field126 = Model.field2258[var3];
				int var4 = (var2 - 128) / 32;
				int var5 = var3 / 64;
				for (int var6 = -26; var6 <= 26; var6++) {
					for (int var7 = -26; var7 <= 26; var7++) {
						int var8 = var6 * 128;
						int var9 = var7 * 128;
						boolean var10 = false;
						for (int var11 = -500; var11 <= 800; var11 += 128) {
							if (method69(var8, arg0[var4] + var11, var9)) {
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
		Square var6 = this.field102[arg2][arg3][arg4];
		if (var6 == null) {
			return;
		}
		class105 var7 = var6.field878;
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
		Ground var10 = var6.field876;
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
		} else if (arg0 >= this.field124 * 128) {
			arg0 = this.field124 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.field143 * 128) {
			arg2 = this.field143 * 128 - 1;
		}
		Statics.field113++;
		field109 = Model.field2256[arg3];
		field137 = Model.field2258[arg3];
		field131 = Model.field2256[arg4];
		field126 = Model.field2258[arg4];
		Statics.field160 = field161[(arg3 - 128) / 32][arg4 / 64];
		Statics.field103 = arg0;
		Statics.field116 = arg1;
		Statics.field125 = arg2;
		Statics.field106 = arg0 / 128;
		Statics.field127 = arg2 / 128;
		field112 = arg5;
		Statics.field122 = Statics.field106 - 25;
		if (Statics.field122 < 0) {
			Statics.field122 = 0;
		}
		Statics.field114 = Statics.field127 - 25;
		if (Statics.field114 < 0) {
			Statics.field114 = 0;
		}
		Statics.field111 = Statics.field106 + 25;
		if (Statics.field111 > this.field124) {
			Statics.field111 = this.field124;
		}
		Statics.field138 = Statics.field127 + 25;
		if (Statics.field138 > this.field143) {
			Statics.field138 = this.field143;
		}
		this.method79();
		field136 = 0;
		for (int var7 = this.field130; var7 < this.field142; var7++) {
			Square[][] var8 = this.field102[var7];
			for (int var9 = Statics.field122; var9 < Statics.field111; var9++) {
				for (int var10 = Statics.field114; var10 < Statics.field138; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field871 <= arg5 && (Statics.field160[var9 + 25 - Statics.field106][var10 + 25 - Statics.field127] || this.field132[var7][var9][var10] - arg1 >= 2000)) {
							var11.field879 = true;
							var11.field885 = true;
							if (var11.field888 > 0) {
								var11.field870 = true;
							} else {
								var11.field870 = false;
							}
							field136++;
						} else {
							var11.field879 = false;
							var11.field885 = false;
							var11.field875 = 0;
						}
					}
				}
			}
		}
		for (int var12 = this.field130; var12 < this.field142; var12++) {
			Square[][] var13 = this.field102[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = Statics.field106 + var14;
				int var16 = Statics.field106 - var14;
				if (var15 >= Statics.field122 || var16 < Statics.field111) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = Statics.field127 + var17;
						int var19 = Statics.field127 - var17;
						if (var15 >= Statics.field122) {
							if (var18 >= Statics.field114) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.field879) {
									this.method62(var20, true);
								}
							}
							if (var19 < Statics.field138) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.field879) {
									this.method62(var21, true);
								}
							}
						}
						if (var16 < Statics.field111) {
							if (var18 >= Statics.field114) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.field879) {
									this.method62(var22, true);
								}
							}
							if (var19 < Statics.field138) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.field879) {
									this.method62(var23, true);
								}
							}
						}
						if (field136 == 0) {
							field141 = false;
							return;
						}
					}
				}
			}
		}
		for (int var24 = this.field130; var24 < this.field142; var24++) {
			Square[][] var25 = this.field102[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = Statics.field106 + var26;
				int var28 = Statics.field106 - var26;
				if (var27 >= Statics.field122 || var28 < Statics.field111) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = Statics.field127 + var29;
						int var31 = Statics.field127 - var29;
						if (var27 >= Statics.field122) {
							if (var30 >= Statics.field114) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.field879) {
									this.method62(var32, false);
								}
							}
							if (var31 < Statics.field138) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.field879) {
									this.method62(var33, false);
								}
							}
						}
						if (var28 < Statics.field111) {
							if (var30 >= Statics.field114) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.field879) {
									this.method62(var34, false);
								}
							}
							if (var31 < Statics.field138) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.field879) {
									this.method62(var35, false);
								}
							}
						}
						if (field136 == 0) {
							field141 = false;
							return;
						}
					}
				}
			}
		}
		field141 = false;
	}

	@ObfuscatedName("ab.a()V")
	public void resetMap() {
		for (int var1 = 0; var1 < this.field142; var1++) {
			for (int var2 = 0; var2 < this.field124; var2++) {
				for (int var3 = 0; var3 < this.field143; var3++) {
					this.field102[var1][var2][var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field117; var4++) {
			for (int var5 = 0; var5 < field128[var4]; var5++) {
				field140[var4][var5] = null;
			}
			field128[var4] = 0;
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
	public void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			class105 var21 = new class105(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.field102[var22][arg1][arg2] == null) {
					this.field102[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.field102[arg0][arg1][arg2].field878 = var21;
		} else if (arg3 == 1) {
			class105 var23 = new class105(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.field102[var24][arg1][arg2] == null) {
					this.field102[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.field102[arg0][arg1][arg2].field878 = var23;
		} else {
			Ground var25 = new Ground(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.field102[var26][arg1][arg2] == null) {
					this.field102[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.field102[arg0][arg1][arg2].field876 = var25;
		}
	}

	@ObfuscatedName("ab.c(III)Lrd;")
	public class106 method56(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		return var4 == null ? null : var4.field887;
	}

	@ObfuscatedName("ab.d(III)Z")
	public boolean method57(int arg0, int arg1, int arg2) {
		int var4 = this.field110[arg0][arg1][arg2];
		if (-Statics.field113 == var4) {
			return false;
		} else if (Statics.field113 == var4) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.method59(var5 + 1, this.field132[arg0][arg1][arg2], var6 + 1) && this.method59(var5 + 128 - 1, this.field132[arg0][arg1 + 1][arg2], var6 + 1) && this.method59(var5 + 128 - 1, this.field132[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method59(var5 + 1, this.field132[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.field110[arg0][arg1][arg2] = Statics.field113;
				return true;
			} else {
				this.field110[arg0][arg1][arg2] = -Statics.field113;
				return false;
			}
		}
	}

	@ObfuscatedName("ab.a(IIII)Z")
	public boolean method58(int arg0, int arg1, int arg2, int arg3) {
		if (!this.method57(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.field132[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > Statics.field103) {
					if (!this.method59(var5, var7, var6)) {
						return false;
					}
					if (!this.method59(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method59(var5, var8, var6)) {
						return false;
					}
					if (!this.method59(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method59(var5, var9, var6)) {
					return false;
				}
				if (!this.method59(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < Statics.field125) {
					if (!this.method59(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.method59(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method59(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.method59(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method59(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.method59(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < Statics.field103) {
					if (!this.method59(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.method59(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method59(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.method59(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method59(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.method59(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > Statics.field125) {
					if (!this.method59(var5, var7, var6)) {
						return false;
					}
					if (!this.method59(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method59(var5, var8, var6)) {
						return false;
					}
					if (!this.method59(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.method59(var5, var9, var6)) {
					return false;
				}
				if (!this.method59(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method59(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method59(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.method59(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.method59(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.method59(var5, var9, var6);
		} else {
			return true;
		}
	}

	@ObfuscatedName("ab.e(III)Z")
	public boolean method59(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field123; var4++) {
			Occlude var5 = field134[var4];
			if (var5.field1728 == 1) {
				int var6 = var5.field1734 - arg0;
				if (var6 > 0) {
					int var7 = (var5.field1731 * var6 >> 8) + var5.field1730;
					int var8 = (var5.field1722 * var6 >> 8) + var5.field1737;
					int var9 = (var5.field1729 * var6 >> 8) + var5.field1742;
					int var10 = (var5.field1739 * var6 >> 8) + var5.field1738;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field1728 == 2) {
				int var11 = arg0 - var5.field1734;
				if (var11 > 0) {
					int var12 = (var5.field1731 * var11 >> 8) + var5.field1730;
					int var13 = (var5.field1722 * var11 >> 8) + var5.field1737;
					int var14 = (var5.field1729 * var11 >> 8) + var5.field1742;
					int var15 = (var5.field1739 * var11 >> 8) + var5.field1738;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field1728 == 3) {
				int var16 = var5.field1730 - arg2;
				if (var16 > 0) {
					int var17 = (var5.field1721 * var16 >> 8) + var5.field1734;
					int var18 = (var5.field1743 * var16 >> 8) + var5.field1727;
					int var19 = (var5.field1729 * var16 >> 8) + var5.field1742;
					int var20 = (var5.field1739 * var16 >> 8) + var5.field1738;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field1728 == 4) {
				int var21 = arg2 - var5.field1730;
				if (var21 > 0) {
					int var22 = (var5.field1721 * var21 >> 8) + var5.field1734;
					int var23 = (var5.field1743 * var21 >> 8) + var5.field1727;
					int var24 = (var5.field1729 * var21 >> 8) + var5.field1742;
					int var25 = (var5.field1739 * var21 >> 8) + var5.field1738;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field1728 == 5) {
				int var26 = arg1 - var5.field1742;
				if (var26 > 0) {
					int var27 = (var5.field1721 * var26 >> 8) + var5.field1734;
					int var28 = (var5.field1743 * var26 >> 8) + var5.field1727;
					int var29 = (var5.field1731 * var26 >> 8) + var5.field1730;
					int var30 = (var5.field1722 * var26 >> 8) + var5.field1737;
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
		for (int var2 = arg0.field984; var2 <= arg0.field995; var2++) {
			for (int var3 = arg0.field992; var3 <= arg0.field988; var3++) {
				Square var4 = this.field102[arg0.field979][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.field888; var5++) {
						if (var4.field873[var5] == arg0) {
							var4.field888--;
							for (int var6 = var5; var6 < var4.field888; var6++) {
								var4.field873[var6] = var4.field873[var6 + 1];
								var4.field882[var6] = var4.field882[var6 + 1];
							}
							var4.field873[var4.field888] = null;
							break;
						}
					}
					var4.field881 = 0;
					for (int var7 = 0; var7 < var4.field888; var7++) {
						var4.field881 |= var4.field882[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.a(Lfa;Z)V")
	public void method62(Square arg0, boolean arg1) {
		field135.method804(arg0);
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
												var3 = (Square) field135.method813();
												if (var3 == null) {
													return;
												}
											} while (!var3.field885);
											var4 = var3.field869;
											var5 = var3.field886;
											var6 = var3.field874;
											var7 = var3.field877;
											var8 = this.field102[var6];
											if (!var3.field879) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.field102[var6 - 1][var4][var5];
													if (var9 != null && var9.field885) {
														continue;
													}
												}
												if (var4 <= Statics.field106 && var4 > Statics.field122) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field885 && (var10.field879 || (var3.field881 & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= Statics.field106 && var4 < Statics.field111 - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field885 && (var11.field879 || (var3.field881 & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= Statics.field127 && var5 > Statics.field114) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field885 && (var12.field879 || (var3.field881 & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= Statics.field127 && var5 < Statics.field138 - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field885 && (var13.field879 || (var3.field881 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field879 = false;
											if (var3.field866 != null) {
												Square var14 = var3.field866;
												if (var14.field878 == null) {
													if (var14.field876 != null && !this.method57(0, var4, var5)) {
														this.method94(var14.field876, field109, field137, field131, field126, var4, var5);
													}
												} else if (!this.method57(0, var4, var5)) {
													this.method84(var14.field878, 0, field109, field137, field131, field126, var4, var5);
												}
												class17 var15 = var14.field880;
												if (var15 != null) {
													var15.field536.method767(0, field109, field137, field131, field126, var15.field529 - Statics.field103, var15.field537 - Statics.field116, var15.field550 - Statics.field125, var15.field531);
												}
												for (int var16 = 0; var16 < var14.field888; var16++) {
													Sprite var17 = var14.field873[var16];
													if (var17 != null) {
														var17.field985.method767(var17.field991, field109, field137, field131, field126, var17.field987 - Statics.field103, var17.field990 - Statics.field116, var17.field983 - Statics.field125, var17.field980);
													}
												}
											}
											boolean var18 = false;
											if (var3.field878 == null) {
												if (var3.field876 != null && !this.method57(var7, var4, var5)) {
													var18 = true;
													this.method94(var3.field876, field109, field137, field131, field126, var4, var5);
												}
											} else if (!this.method57(var7, var4, var5)) {
												var18 = true;
												this.method84(var3.field878, var7, field109, field137, field131, field126, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											class17 var21 = var3.field880;
											class106 var22 = var3.field887;
											if (var21 != null || var22 != null) {
												if (Statics.field106 == var4) {
													var19++;
												} else if (Statics.field106 < var4) {
													var19 += 2;
												}
												if (Statics.field127 == var5) {
													var19 += 3;
												} else if (Statics.field127 > var5) {
													var19 += 6;
												}
												var20 = field147[var19];
												var3.field872 = field157[var19];
											}
											if (var21 != null) {
												if ((var21.field532 & field144[var19]) == 0) {
													var3.field875 = 0;
												} else if (var21.field532 == 16) {
													var3.field875 = 3;
													var3.field884 = field146[var19];
													var3.field867 = 3 - var3.field884;
												} else if (var21.field532 == 32) {
													var3.field875 = 6;
													var3.field884 = field152[var19];
													var3.field867 = 6 - var3.field884;
												} else if (var21.field532 == 64) {
													var3.field875 = 12;
													var3.field884 = field159[var19];
													var3.field867 = 12 - var3.field884;
												} else {
													var3.field875 = 9;
													var3.field884 = field158[var19];
													var3.field867 = 9 - var3.field884;
												}
												if ((var21.field532 & var20) != 0 && !this.method58(var7, var4, var5, var21.field532)) {
													var21.field536.method767(0, field109, field137, field131, field126, var21.field529 - Statics.field103, var21.field537 - Statics.field116, var21.field550 - Statics.field125, var21.field531);
												}
												if ((var21.field542 & var20) != 0 && !this.method58(var7, var4, var5, var21.field542)) {
													var21.field535.method767(0, field109, field137, field131, field126, var21.field529 - Statics.field103, var21.field537 - Statics.field116, var21.field550 - Statics.field125, var21.field531);
												}
											}
											if (var22 != null && !this.method67(var7, var4, var5, var22.field2665.field3135)) {
												if ((var22.field2658 & var20) != 0) {
													var22.field2665.method767(var22.field2668, field109, field137, field131, field126, var22.field2677 - Statics.field103, var22.field2660 - Statics.field116, var22.field2670 - Statics.field125, var22.field2678);
												} else if ((var22.field2658 & 0x300) != 0) {
													int var23 = var22.field2677 - Statics.field103;
													int var24 = var22.field2660 - Statics.field116;
													int var25 = var22.field2670 - Statics.field125;
													int var26 = var22.field2668;
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
													if ((var22.field2658 & 0x100) != 0 && var28 < var27) {
														int var29 = field107[var26] + var23;
														int var30 = field139[var26] + var25;
														var22.field2665.method767(var26 * 512 + 256, field109, field137, field131, field126, var29, var24, var30, var22.field2678);
													}
													if ((var22.field2658 & 0x200) != 0 && var28 > var27) {
														int var31 = field121[var26] + var23;
														int var32 = field129[var26] + var25;
														var22.field2665.method767(var26 * 512 + 1280 & 0x7FF, field109, field137, field131, field126, var31, var24, var32, var22.field2678);
													}
												}
											}
											if (var18) {
												class52 var33 = var3.field883;
												if (var33 != null) {
													var33.field1373.method767(0, field109, field137, field131, field126, var33.field1368 - Statics.field103, var33.field1375 - Statics.field116, var33.field1374 - Statics.field125, var33.field1361);
												}
												class113 var34 = var3.field868;
												if (var34 != null && var34.field2795 == 0) {
													if (var34.field2786 != null) {
														var34.field2786.method767(0, field109, field137, field131, field126, var34.field2796 - Statics.field103, var34.field2785 - Statics.field116, var34.field2779 - Statics.field125, var34.field2790);
													}
													if (var34.field2787 != null) {
														var34.field2787.method767(0, field109, field137, field131, field126, var34.field2796 - Statics.field103, var34.field2785 - Statics.field116, var34.field2779 - Statics.field125, var34.field2790);
													}
													if (var34.field2777 != null) {
														var34.field2777.method767(0, field109, field137, field131, field126, var34.field2796 - Statics.field103, var34.field2785 - Statics.field116, var34.field2779 - Statics.field125, var34.field2790);
													}
												}
											}
											int var35 = var3.field881;
											if (var35 != 0) {
												if (var4 < Statics.field106 && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field885) {
														field135.method804(var36);
													}
												}
												if (var5 < Statics.field127 && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.field885) {
														field135.method804(var37);
													}
												}
												if (var4 > Statics.field106 && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.field885) {
														field135.method804(var38);
													}
												}
												if (var5 > Statics.field127 && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.field885) {
														field135.method804(var39);
													}
												}
											}
											break;
										}
										if (var3.field875 != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.field888; var41++) {
												if (Statics.field113 != var3.field873[var41].field997 && (var3.field882[var41] & var3.field875) == var3.field884) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												class17 var42 = var3.field880;
												if (!this.method58(var7, var4, var5, var42.field532)) {
													var42.field536.method767(0, field109, field137, field131, field126, var42.field529 - Statics.field103, var42.field537 - Statics.field116, var42.field550 - Statics.field125, var42.field531);
												}
												var3.field875 = 0;
											}
										}
										if (!var3.field870) {
											break;
										}
										try {
											int var43 = var3.field888;
											var3.field870 = false;
											int var44 = 0;
											label559:
											for (int var45 = 0; var45 < var43; var45++) {
												Sprite var46 = var3.field873[var45];
												if (Statics.field113 != var46.field997) {
													for (int var47 = var46.field984; var47 <= var46.field995; var47++) {
														for (int var48 = var46.field992; var48 <= var46.field988; var48++) {
															Square var49 = var8[var47][var48];
															if (var49.field879) {
																var3.field870 = true;
																continue label559;
															}
															if (var49.field875 != 0) {
																int var50 = 0;
																if (var47 > var46.field984) {
																	var50++;
																}
																if (var47 < var46.field995) {
																	var50 += 4;
																}
																if (var48 > var46.field992) {
																	var50 += 8;
																}
																if (var48 < var46.field988) {
																	var50 += 2;
																}
																if ((var50 & var49.field875) == var3.field867) {
																	var3.field870 = true;
																	continue label559;
																}
															}
														}
													}
													field133[var44++] = var46;
													int var51 = Statics.field106 - var46.field984;
													int var52 = var46.field995 - Statics.field106;
													if (var52 > var51) {
														var51 = var52;
													}
													int var53 = Statics.field127 - var46.field992;
													int var54 = var46.field988 - Statics.field127;
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
													if (Statics.field113 != var58.field997) {
														if (var58.field1002 > var55) {
															var55 = var58.field1002;
															var56 = var57;
														} else if (var58.field1002 == var55) {
															int var59 = var58.field987 - Statics.field103;
															int var60 = var58.field983 - Statics.field125;
															int var61 = field133[var56].field987 - Statics.field103;
															int var62 = field133[var56].field983 - Statics.field125;
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
												var63.field997 = Statics.field113;
												if (!this.method75(var7, var63.field984, var63.field995, var63.field992, var63.field988, var63.field985.field3135)) {
													var63.field985.method767(var63.field991, field109, field137, field131, field126, var63.field987 - Statics.field103, var63.field990 - Statics.field116, var63.field983 - Statics.field125, var63.field980);
												}
												for (int var64 = var63.field984; var64 <= var63.field995; var64++) {
													for (int var65 = var63.field992; var65 <= var63.field988; var65++) {
														Square var66 = var8[var64][var65];
														if (var66.field875 != 0) {
															field135.method804(var66);
														} else if ((var4 != var64 || var5 != var65) && var66.field885) {
															field135.method804(var66);
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
								} while (!var3.field885);
							} while (var3.field875 != 0);
							if (var4 > Statics.field106 || var4 <= Statics.field122) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.field885);
						if (var4 < Statics.field106 || var4 >= Statics.field111 - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.field885);
					if (var5 > Statics.field127 || var5 <= Statics.field114) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.field885);
				if (var5 < Statics.field127 || var5 >= Statics.field138 - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.field885);
			var3.field885 = false;
			field136--;
			class113 var71 = var3.field868;
			if (var71 != null && var71.field2795 != 0) {
				if (var71.field2786 != null) {
					var71.field2786.method767(0, field109, field137, field131, field126, var71.field2796 - Statics.field103, var71.field2785 - Statics.field116 - var71.field2795, var71.field2779 - Statics.field125, var71.field2790);
				}
				if (var71.field2787 != null) {
					var71.field2787.method767(0, field109, field137, field131, field126, var71.field2796 - Statics.field103, var71.field2785 - Statics.field116 - var71.field2795, var71.field2779 - Statics.field125, var71.field2790);
				}
				if (var71.field2777 != null) {
					var71.field2777.method767(0, field109, field137, field131, field126, var71.field2796 - Statics.field103, var71.field2785 - Statics.field116 - var71.field2795, var71.field2779 - Statics.field125, var71.field2790);
				}
			}
			if (var3.field872 != 0) {
				class106 var72 = var3.field887;
				if (var72 != null && !this.method67(var7, var4, var5, var72.field2665.field3135)) {
					if ((var72.field2658 & var3.field872) != 0) {
						var72.field2665.method767(var72.field2668, field109, field137, field131, field126, var72.field2677 - Statics.field103, var72.field2660 - Statics.field116, var72.field2670 - Statics.field125, var72.field2678);
					} else if ((var72.field2658 & 0x300) != 0) {
						int var73 = var72.field2677 - Statics.field103;
						int var74 = var72.field2660 - Statics.field116;
						int var75 = var72.field2670 - Statics.field125;
						int var76 = var72.field2668;
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
						if ((var72.field2658 & 0x100) != 0 && var78 >= var77) {
							int var79 = field107[var76] + var73;
							int var80 = field139[var76] + var75;
							var72.field2665.method767(var76 * 512 + 256, field109, field137, field131, field126, var79, var74, var80, var72.field2678);
						}
						if ((var72.field2658 & 0x200) != 0 && var78 <= var77) {
							int var81 = field121[var76] + var73;
							int var82 = field129[var76] + var75;
							var72.field2665.method767(var76 * 512 + 1280 & 0x7FF, field109, field137, field131, field126, var81, var74, var82, var72.field2678);
						}
					}
				}
				class17 var83 = var3.field880;
				if (var83 != null) {
					if ((var83.field542 & var3.field872) != 0 && !this.method58(var7, var4, var5, var83.field542)) {
						var83.field535.method767(0, field109, field137, field131, field126, var83.field529 - Statics.field103, var83.field537 - Statics.field116, var83.field550 - Statics.field125, var83.field531);
					}
					if ((var83.field532 & var3.field872) != 0 && !this.method58(var7, var4, var5, var83.field532)) {
						var83.field536.method767(0, field109, field137, field131, field126, var83.field529 - Statics.field103, var83.field537 - Statics.field116, var83.field550 - Statics.field125, var83.field531);
					}
				}
			}
			if (var6 < this.field142 - 1) {
				Square var84 = this.field102[var6 + 1][var4][var5];
				if (var84 != null && var84.field885) {
					field135.method804(var84);
				}
			}
			if (var4 < Statics.field106) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.field885) {
					field135.method804(var85);
				}
			}
			if (var5 < Statics.field127) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.field885) {
					field135.method804(var86);
				}
			}
			if (var4 > Statics.field106) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.field885) {
					field135.method804(var87);
				}
			}
			if (var5 > Statics.field127) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.field885) {
					field135.method804(var88);
				}
			}
		}
	}

	@ObfuscatedName("ab.f(III)Lg;")
	public Sprite method63(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}
		for (int var5 = 0; var5 < var4.field888; var5++) {
			Sprite var6 = var4.field873[var5];
			if ((var6.field980 >> 29 & 0x3) == 2 && var6.field984 == arg1 && var6.field992 == arg2) {
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
	public void method65(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg4 == null) {
			return;
		}
		class106 var12 = new class106();
		var12.field2678 = arg9;
		var12.field2669 = arg10;
		var12.field2677 = arg1 * 128 + arg7 + 64;
		var12.field2670 = arg2 * 128 + arg8 + 64;
		var12.field2660 = arg3;
		var12.field2665 = arg4;
		var12.field2658 = arg5;
		var12.field2668 = arg6;
		for (int var13 = arg0; var13 >= 0; var13--) {
			if (this.field102[var13][arg1][arg2] == null) {
				this.field102[var13][arg1][arg2] = new Square(var13, arg1, arg2);
			}
		}
		this.field102[arg0][arg1][arg2].field887 = var12;
	}

	@ObfuscatedName("ab.g(III)I")
	public int method66(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field888; var5++) {
			Sprite var6 = var4.field873[var5];
			if ((var6.field980 >> 29 & 0x3) == 2 && var6.field984 == arg1 && var6.field992 == arg2) {
				return var6.field980;
			}
		}
		return 0;
	}

	@ObfuscatedName("ab.b(IIII)Z")
	public boolean method67(int arg0, int arg1, int arg2, int arg3) {
		if (this.method57(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.method59(var5 + 1, this.field132[arg0][arg1][arg2] - arg3, var6 + 1) && this.method59(var5 + 128 - 1, this.field132[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method59(var5 + 128 - 1, this.field132[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method59(var5 + 1, this.field132[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab.a(IIIIILvb;IIIIII)Z")
	public boolean method68(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : this.method96(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@ObfuscatedName("ab.h(III)Z")
	public static boolean method69(int arg0, int arg1, int arg2) {
		int var3 = field131 * arg2 + field126 * arg0 >> 16;
		int var4 = field126 * arg2 - field131 * arg0 >> 16;
		int var5 = field137 * var4 + field109 * arg1 >> 16;
		int var6 = field137 * arg1 - field109 * var4 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = (var3 << 9) / var5 + field149;
			int var8 = (var6 << 9) / var5 + field162;
			return var7 >= field145 && var7 <= field163 && var8 >= field151 && var8 <= field155;
		} else {
			return false;
		}
	}

	public World(int arg0, int arg1, int arg2, int[][][] arg3) {
		this.field132 = arg3;
		this.resetMap();
	}

	@ObfuscatedName("ab.c(IIII)V")
	public void method71(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field102[arg0][arg1][arg2];
		if (var5 == null) {
			return;
		}
		class106 var6 = var5.field887;
		if (var6 != null) {
			int var7 = arg1 * 128 + 64;
			int var8 = arg2 * 128 + 64;
			var6.field2677 = (var6.field2677 - var7) * arg3 / 16 + var7;
			var6.field2670 = (var6.field2670 - var8) * arg3 / 16 + var8;
		}
	}

	@ObfuscatedName("ab.a(IIIIIIII)V")
	public static void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.field1736 = arg2 / 128;
		var8.field1741 = arg3 / 128;
		var8.field1724 = arg4 / 128;
		var8.field1725 = arg5 / 128;
		var8.field1735 = arg1;
		var8.field1734 = arg2;
		var8.field1727 = arg3;
		var8.field1730 = arg4;
		var8.field1737 = arg5;
		var8.field1742 = arg6;
		var8.field1738 = arg7;
		field140[arg0][field128[arg0]++] = var8;
	}

	@ObfuscatedName("ab.a(Lpa;III)V")
	public void method73(Model arg0, int arg1, int arg2, int arg3) {
		if (arg2 < this.field124) {
			Square var5 = this.field102[arg1][arg2 + 1][arg3];
			if (var5 != null && var5.field883 != null && var5.field883.field1373 instanceof Model) {
				Model var6 = (Model) var5.field883.field1373;
				if (var6.field2215 != null) {
					this.method77(arg0, var6, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.field124) {
			Square var7 = this.field102[arg1][arg2][arg3 + 1];
			if (var7 != null && var7.field883 != null && var7.field883.field1373 instanceof Model) {
				Model var8 = (Model) var7.field883.field1373;
				if (var8.field2215 != null) {
					this.method77(arg0, var8, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.field124 && arg3 < this.field143) {
			Square var9 = this.field102[arg1][arg2 + 1][arg3 + 1];
			if (var9 != null && var9.field883 != null && var9.field883.field1373 instanceof Model) {
				Model var10 = (Model) var9.field883.field1373;
				if (var10.field2215 != null) {
					this.method77(arg0, var10, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.field124 || arg3 <= 0) {
			return;
		}
		Square var11 = this.field102[arg1][arg2 + 1][arg3 - 1];
		if (var11 != null && var11.field883 != null && var11.field883.field1373 instanceof Model) {
			Model var12 = (Model) var11.field883.field1373;
			if (var12.field2215 != null) {
				this.method77(arg0, var12, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("ab.i(III)V")
	public void method74() {
		for (int var1 = 0; var1 < this.field142; var1++) {
			for (int var2 = 0; var2 < this.field124; var2++) {
				for (int var3 = 0; var3 < this.field143; var3++) {
					Square var4 = this.field102[var1][var2][var3];
					if (var4 != null) {
						class17 var5 = var4.field880;
						if (var5 != null && var5.field536 instanceof Model) {
							Model var6 = (Model) var5.field536;
							if (var6.field2215 != null) {
								this.method85(var6, var1, var2, var3, 1, 1);
								if (var5.field535 instanceof Model) {
									Model var7 = (Model) var5.field535;
									if (var7.field2215 != null) {
										this.method85(var7, var1, var2, var3, 1, 1);
										this.method77(var6, var7, 0, 0, 0, false);
										var7.method794();
									}
								}
								var6.method794();
							}
						}
						for (int var8 = 0; var8 < var4.field888; var8++) {
							Sprite var9 = var4.field873[var8];
							if (var9 != null && var9.field985 instanceof Model) {
								Model var10 = (Model) var9.field985;
								if (var10.field2215 != null) {
									this.method85(var10, var1, var2, var3, var9.field995 + 1 - var9.field984, var9.field988 - var9.field992 + 1);
									var10.method794();
								}
							}
						}
						class52 var11 = var4.field883;
						if (var11 != null && var11.field1373 instanceof Model) {
							Model var12 = (Model) var11.field1373;
							if (var12.field2215 != null) {
								this.method73(var12, var1, var2, var3);
								var12.method794();
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.b(IIIIII)Z")
	public boolean method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.field110[arg0][var9][var10] == -Statics.field113) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.field132[arg0][arg1][arg3] - arg5;
			if (!this.method59(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 1;
			if (!this.method59(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 1;
			if (!this.method59(var11, var13, var15)) {
				return false;
			} else if (this.method59(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method57(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.method59(var7 + 1, this.field132[arg0][arg1][arg3] - arg5, var8 + 1) && this.method59(var7 + 128 - 1, this.field132[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method59(var7 + 128 - 1, this.field132[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method59(var7 + 1, this.field132[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab.c(II)V")
	public void method76(int arg0, int arg1) {
		field141 = true;
		field118 = arg0;
		field104 = arg1;
		field105 = -1;
		field108 = -1;
	}

	@ObfuscatedName("ab.a(Lpa;Lpa;IIIZ)V")
	public void method77(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		arg1.method790();
		this.field153++;
		int var7 = 0;
		int[] var8 = arg1.field2229;
		int var9 = arg1.field2208;
		for (int var10 = 0; var10 < arg0.field2208; var10++) {
			class93 var11 = arg0.field2215[var10];
			class93 var12 = arg0.field2213[var10];
			if (var12.field2328 != 0) {
				int var13 = arg0.field2228[var10] - arg3;
				if (var13 <= arg1.field2216) {
					int var14 = arg0.field2229[var10] - arg2;
					if (var14 >= arg1.field2212 && var14 <= arg1.field2204) {
						int var15 = arg0.field2203[var10] - arg4;
						if (var15 >= arg1.field2218 && var15 <= arg1.field2230) {
							for (int var16 = 0; var16 < var9; var16++) {
								class93 var17 = arg1.field2215[var16];
								class93 var18 = arg1.field2213[var16];
								if (var8[var16] == var14 && arg1.field2203[var16] == var15 && arg1.field2228[var16] == var13 && var18.field2328 != 0) {
									var11.field2312 += var18.field2312;
									var11.field2307 += var18.field2307;
									var11.field2314 += var18.field2314;
									var11.field2328 += var18.field2328;
									var17.field2312 += var12.field2312;
									var17.field2307 += var12.field2307;
									var17.field2314 += var12.field2314;
									var17.field2328 += var12.field2328;
									var7++;
									this.field154[var10] = this.field153;
									this.field150[var16] = this.field153;
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
		for (int var19 = 0; var19 < arg0.field2209; var19++) {
			if (this.field154[arg0.field2223[var19]] == this.field153 && this.field154[arg0.field2237[var19]] == this.field153 && this.field154[arg0.field2206[var19]] == this.field153) {
				arg0.field2219[var19] = -1;
			}
		}
		for (int var20 = 0; var20 < arg1.field2209; var20++) {
			if (this.field150[arg1.field2223[var20]] == this.field153 && this.field150[arg1.field2237[var20]] == this.field153 && this.field150[arg1.field2206[var20]] == this.field153) {
				arg1.field2219[var20] = -1;
			}
		}
	}

	@ObfuscatedName("ab.j(III)I")
	public int method78(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		return var4 == null || var4.field880 == null ? 0 : var4.field880.field531;
	}

	@ObfuscatedName("ab.d()V")
	public void method79() {
		int var1 = field128[field112];
		Occlude[] var2 = field140[field112];
		field123 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.field1735 == 1) {
				int var5 = var4.field1736 + 25 - Statics.field106;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.field1724 + 25 - Statics.field127;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var4.field1725 + 25 - Statics.field127;
					if (var7 > 50) {
						var7 = 50;
					}
					boolean var8 = false;
					while (var6 <= var7) {
						if (Statics.field160[var5][var6++]) {
							var8 = true;
							break;
						}
					}
					if (var8) {
						int var9 = Statics.field103 - var4.field1734;
						if (var9 > 32) {
							var4.field1728 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.field1728 = 2;
							var9 = -var9;
						}
						var4.field1731 = (var4.field1730 - Statics.field125 << 8) / var9;
						var4.field1722 = (var4.field1737 - Statics.field125 << 8) / var9;
						var4.field1729 = (var4.field1742 - Statics.field116 << 8) / var9;
						var4.field1739 = (var4.field1738 - Statics.field116 << 8) / var9;
						field134[field123++] = var4;
					}
				}
			} else if (var4.field1735 == 2) {
				int var10 = var4.field1724 + 25 - Statics.field127;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.field1736 + 25 - Statics.field106;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var4.field1741 + 25 - Statics.field106;
					if (var12 > 50) {
						var12 = 50;
					}
					boolean var13 = false;
					while (var11 <= var12) {
						if (Statics.field160[var11++][var10]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						int var14 = Statics.field125 - var4.field1730;
						if (var14 > 32) {
							var4.field1728 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var4.field1728 = 4;
							var14 = -var14;
						}
						var4.field1721 = (var4.field1734 - Statics.field103 << 8) / var14;
						var4.field1743 = (var4.field1727 - Statics.field103 << 8) / var14;
						var4.field1729 = (var4.field1742 - Statics.field116 << 8) / var14;
						var4.field1739 = (var4.field1738 - Statics.field116 << 8) / var14;
						field134[field123++] = var4;
					}
				}
			} else if (var4.field1735 == 4) {
				int var15 = var4.field1742 - Statics.field116;
				if (var15 > 128) {
					int var16 = var4.field1724 + 25 - Statics.field127;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var4.field1725 + 25 - Statics.field127;
					if (var17 > 50) {
						var17 = 50;
					}
					if (var16 <= var17) {
						int var18 = var4.field1736 + 25 - Statics.field106;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var4.field1741 + 25 - Statics.field106;
						if (var19 > 50) {
							var19 = 50;
						}
						boolean var20 = false;
						label142:
						for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (Statics.field160[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}
						if (var20) {
							var4.field1728 = 5;
							var4.field1721 = (var4.field1734 - Statics.field103 << 8) / var15;
							var4.field1743 = (var4.field1727 - Statics.field103 << 8) / var15;
							var4.field1731 = (var4.field1730 - Statics.field125 << 8) / var15;
							var4.field1722 = (var4.field1737 - Statics.field125 << 8) / var15;
							field134[field123++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab.k(III)V")
	public void method80(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field880 = null;
		}
	}

	@ObfuscatedName("ab.l(III)V")
	public void method81(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field868 = null;
		}
	}

	@ObfuscatedName("ab.m(III)Lcd;")
	public class17 method82(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		return var4 == null ? null : var4.field880;
	}

	@ObfuscatedName("ab.n(III)V")
	public void method83(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field887 = null;
		}
	}

	@ObfuscatedName("ab.a(Lrc;IIIIIII)V")
	public void method84(class105 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - Statics.field103;
		int var11;
		int var12 = var11 = (arg7 << 7) - Statics.field125;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field132[arg1][arg6][arg7] - Statics.field116;
		int var18 = this.field132[arg1][arg6 + 1][arg7] - Statics.field116;
		int var19 = this.field132[arg1][arg6 + 1][arg7 + 1] - Statics.field116;
		int var20 = this.field132[arg1][arg6][arg7 + 1] - Statics.field116;
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
		int var44 = (var21 << 9) / var25 + Statics.field769;
		int var45 = (var24 << 9) / var25 + Statics.field763;
		int var46 = (var27 << 9) / var31 + Statics.field769;
		int var47 = (var30 << 9) / var31 + Statics.field763;
		int var48 = (var33 << 9) / var37 + Statics.field769;
		int var49 = (var36 << 9) / var37 + Statics.field763;
		int var50 = (var39 << 9) / var43 + Statics.field769;
		int var51 = (var42 << 9) / var43 + Statics.field763;
		Pix3D.field765 = 0;
		if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
			Pix3D.field779 = false;
			if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Statics.field777 || var50 > Statics.field777 || var46 > Statics.field777) {
				Pix3D.field779 = true;
			}
			if (field141 && this.method98(field118, field104, var49, var51, var47, var48, var50, var46)) {
				field105 = arg6;
				field108 = arg7;
			}
			if (arg0.field2636 == -1) {
				if (arg0.field2651 != 12345678) {
					Pix3D.method360(var49, var51, var47, var48, var50, var46, arg0.field2651, arg0.field2648, arg0.field2641);
				}
			} else if (field115) {
				int var52 = Pix3D.field771.method693(arg0.field2636);
				Pix3D.method360(var49, var51, var47, var48, var50, var46, method64(var52, arg0.field2651), method64(var52, arg0.field2648), method64(var52, arg0.field2641));
			} else if (arg0.field2645) {
				Pix3D.method353(var49, var51, var47, var48, var50, var46, arg0.field2651, arg0.field2648, arg0.field2641, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2636);
			} else {
				Pix3D.method353(var49, var51, var47, var48, var50, var46, arg0.field2651, arg0.field2648, arg0.field2641, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2636);
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		Pix3D.field779 = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Statics.field777 || var46 > Statics.field777 || var50 > Statics.field777) {
			Pix3D.field779 = true;
		}
		if (field141 && this.method98(field118, field104, var45, var47, var51, var44, var46, var50)) {
			field105 = arg6;
			field108 = arg7;
		}
		if (arg0.field2636 != -1) {
			if (!field115) {
				Pix3D.method353(var45, var47, var51, var44, var46, var50, arg0.field2647, arg0.field2641, arg0.field2648, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2636);
				return;
			}
			int var53 = Pix3D.field771.method693(arg0.field2636);
			Pix3D.method360(var45, var47, var51, var44, var46, var50, method64(var53, arg0.field2647), method64(var53, arg0.field2641), method64(var53, arg0.field2648));
		} else if (arg0.field2647 != 12345678) {
			Pix3D.method360(var45, var47, var51, var44, var46, var50, arg0.field2647, arg0.field2641, arg0.field2648);
			return;
		}
	}

	@ObfuscatedName("ab.a(Lpa;IIIII)V")
	public void method85(Model arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg4;
		int var10 = arg3 - 1;
		int var11 = arg3 + arg5;
		for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
			if (this.field142 != var12) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.field124) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.field143 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && arg2 != var13)) {
								Square var15 = this.field102[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.field132[var12][var13 + 1][var14] + this.field132[var12][var13][var14] + this.field132[var12][var13][var14 + 1] + this.field132[var12][var13 + 1][var14 + 1]) / 4 - (this.field132[arg1][arg2 + 1][arg3] + this.field132[arg1][arg2][arg3] + this.field132[arg1][arg2][arg3 + 1] + this.field132[arg1][arg2 + 1][arg3 + 1]) / 4;
									class17 var17 = var15.field880;
									if (var17 != null) {
										if (var17.field536 instanceof Model) {
											Model var18 = (Model) var17.field536;
											if (var18.field2215 != null) {
												this.method77(arg0, var18, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
											}
										}
										if (var17.field535 instanceof Model) {
											Model var19 = (Model) var17.field535;
											if (var19.field2215 != null) {
												this.method77(arg0, var19, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
											}
										}
									}
									for (int var20 = 0; var20 < var15.field888; var20++) {
										Sprite var21 = var15.field873[var20];
										if (var21 != null && var21.field985 instanceof Model) {
											Model var22 = (Model) var21.field985;
											if (var22.field2215 != null) {
												int var23 = var21.field995 + 1 - var21.field984;
												int var24 = var21.field988 + 1 - var21.field992;
												this.method77(arg0, var22, (var21.field984 - arg2) * 128 + (var23 - arg4) * 64, var16, (var21.field992 - arg3) * 128 + (var24 - arg5) * 64, var7);
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
	public void method86(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field102[arg0][arg1][arg2];
		if (var5 != null) {
			this.field102[arg0][arg1][arg2].field871 = arg3;
		}
	}

	@ObfuscatedName("ab.o(III)V")
	public void method87(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field883 = null;
		}
	}

	@ObfuscatedName("ab.a(IIIILvb;II)V")
	public void method88(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6) {
		if (arg4 == null) {
			return;
		}
		class52 var8 = new class52();
		var8.field1373 = arg4;
		var8.field1368 = arg1 * 128 + 64;
		var8.field1374 = arg2 * 128 + 64;
		var8.field1375 = arg3;
		var8.field1361 = arg5;
		var8.field1360 = arg6;
		if (this.field102[arg0][arg1][arg2] == null) {
			this.field102[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.field102[arg0][arg1][arg2].field883 = var8;
	}

	@ObfuscatedName("ab.p(III)Lid;")
	public class52 method89(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		return var4 == null || var4.field883 == null ? null : var4.field883;
	}

	@ObfuscatedName("ab.a(IIIIILvb;IIZ)Z")
	public boolean method90(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, int arg7, boolean arg8) {
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
		return this.method96(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@ObfuscatedName("ab.q(III)V")
	public void method91(int arg0, int arg1, int arg2) {
		Square var4 = this.field102[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		for (int var5 = 0; var5 < var4.field888; var5++) {
			Sprite var6 = var4.field873[var5];
			if ((var6.field980 >> 29 & 0x3) == 2 && var6.field984 == arg1 && var6.field992 == arg2) {
				this.method61(var6);
				return;
			}
		}
	}

	@ObfuscatedName("ab.a(I)V")
	public void fillBaseLevel(int arg0) {
		this.field130 = arg0;
		for (int var2 = 0; var2 < this.field124; var2++) {
			for (int var3 = 0; var3 < this.field143; var3++) {
				if (this.field102[arg0][var2][var3] == null) {
					this.field102[arg0][var2][var3] = new Square(arg0, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("ab.a(IIIIIILvb;III)Z")
	public boolean method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, int arg8, int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			int var11 = arg1 * 128 + arg4 * 64;
			int var12 = arg2 * 128 + arg5 * 64;
			return this.method96(arg0, arg1, arg2, arg4, arg5, var11, var12, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@ObfuscatedName("ab.a(Lce;IIIIII)V")
	public void method94(Ground arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0.field554.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg0.field554[var9] - Statics.field103;
			int var11 = arg0.field571[var9] - Statics.field116;
			int var12 = arg0.field573[var9] - Statics.field125;
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
			Ground.field558[var9] = (var13 << 9) / var17 + Statics.field769;
			Ground.field553[var9] = (var16 << 9) / var17 + Statics.field763;
		}
		Pix3D.field765 = 0;
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
				Pix3D.field779 = false;
				if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Statics.field777 || var24 > Statics.field777 || var25 > Statics.field777) {
					Pix3D.field779 = true;
				}
				if (field141 && this.method98(field118, field104, var26, var27, var28, var23, var24, var25)) {
					field105 = arg5;
					field108 = arg6;
				}
				if (arg0.field556 == null || arg0.field556[var19] == -1) {
					if (arg0.field562[var19] != 12345678) {
						Pix3D.method360(var26, var27, var28, var23, var24, var25, arg0.field562[var19], arg0.field564[var19], arg0.field567[var19]);
					}
				} else if (field115) {
					int var29 = Pix3D.field771.method693(arg0.field556[var19]);
					Pix3D.method360(var26, var27, var28, var23, var24, var25, method64(var29, arg0.field562[var19]), method64(var29, arg0.field564[var19]), method64(var29, arg0.field567[var19]));
				} else if (arg0.field560) {
					Pix3D.method353(var26, var27, var28, var23, var24, var25, arg0.field562[var19], arg0.field564[var19], arg0.field567[var19], Ground.field565[0], Ground.field565[1], Ground.field565[3], Ground.field570[0], Ground.field570[1], Ground.field570[3], Ground.field555[0], Ground.field555[1], Ground.field555[3], arg0.field556[var19]);
				} else {
					Pix3D.method353(var26, var27, var28, var23, var24, var25, arg0.field562[var19], arg0.field564[var19], arg0.field567[var19], Ground.field565[var20], Ground.field565[var21], Ground.field565[var22], Ground.field570[var20], Ground.field570[var21], Ground.field570[var22], Ground.field555[var20], Ground.field555[var21], Ground.field555[var22], arg0.field556[var19]);
				}
			}
		}
	}

	@ObfuscatedName("ab.a(IIIILvb;ILvb;Lvb;)V")
	public void method95(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, ModelSource arg6, ModelSource arg7) {
		class113 var9 = new class113();
		var9.field2777 = arg4;
		var9.field2796 = arg1 * 128 + 64;
		var9.field2779 = arg2 * 128 + 64;
		var9.field2785 = arg3;
		var9.field2790 = arg5;
		var9.field2786 = arg6;
		var9.field2787 = arg7;
		int var10 = 0;
		Square var11 = this.field102[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field888; var12++) {
				if ((var11.field873[var12].field982 & 0x100) == 256 && var11.field873[var12].field985 instanceof Model) {
					Model var13 = (Model) var11.field873[var12].field985;
					var13.method766();
					if (var13.field3135 > var10) {
						var10 = var13.field3135;
					}
				}
			}
		}
		var9.field2795 = var10;
		if (this.field102[arg0][arg1][arg2] == null) {
			this.field102[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.field102[arg0][arg1][arg2].field868 = var9;
	}

	@ObfuscatedName("ab.a(IIIIIIIILvb;IZII)Z")
	public boolean method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, int arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.field124 || var15 >= this.field143) {
					return false;
				}
				Square var16 = this.field102[arg0][var14][var15];
				if (var16 != null && var16.field888 >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.field980 = arg11;
		var17.field982 = arg12;
		var17.field979 = arg0;
		var17.field987 = arg5;
		var17.field983 = arg6;
		var17.field990 = arg7;
		var17.field985 = arg8;
		var17.field991 = arg9;
		var17.field984 = arg1;
		var17.field992 = arg2;
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
					if (this.field102[var21][var18][var19] == null) {
						this.field102[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.field102[arg0][var18][var19];
				var22.field873[var22.field888] = var17;
				var22.field882[var22.field888] = var20;
				var22.field881 |= var20;
				var22.field888++;
			}
		}
		if (arg10) {
			this.field120[this.field119++] = var17;
		}
		return true;
	}

	@ObfuscatedName("ab.e(IIII)I")
	public int method97(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field102[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.field880 != null && var5.field880.field531 == arg3) {
			return var5.field880.field543 & 0xFF;
		} else if (var5.field887 != null && var5.field887.field2678 == arg3) {
			return var5.field887.field2669 & 0xFF;
		} else if (var5.field883 != null && var5.field883.field1361 == arg3) {
			return var5.field883.field1360 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field888; var6++) {
				if (var5.field873[var6].field980 == arg3) {
					return var5.field873[var6].field982 & 0xFF;
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
