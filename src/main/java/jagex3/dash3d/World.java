package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.LocType;
import jagex3.datastruct.LinkList;
import jagex3.sound.BgSound;

@ObfuscatedName("vd")
public final class World {

	@ObfuscatedName("vd.a")
	public final int field3396 = 4;

	@ObfuscatedName("vd.ab")
	public final int[][] field3448 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("vd.b")
	public static int field3397;

	@ObfuscatedName("vd.bb")
	public static int[] field3449 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("vd.c")
	public int field3398 = 0;

	@ObfuscatedName("vd.cb")
	public static int field3450;

	@ObfuscatedName("vd.d")
	public final Sprite[] field3399 = new Sprite[5000];

	@ObfuscatedName("vd.db")
	public static int field3451;

	@ObfuscatedName("vd.e")
	public static int field3400 = 0;

	@ObfuscatedName("vd.f")
	public final int field3401 = 104;

	@ObfuscatedName("vd.g")
	public static int field3402;

	@ObfuscatedName("vd.h")
	public static int field3403;

	@ObfuscatedName("vd.i")
	public final Square[][][] field3404 = new Square[4][104][104];

	@ObfuscatedName("vd.k")
	public static boolean field3406 = false;

	@ObfuscatedName("vd.l")
	public static int field3407;

	@ObfuscatedName("vd.m")
	public static int field3408;

	@ObfuscatedName("vd.n")
	public static final int field3409 = 4;

	@ObfuscatedName("vd.j")
	public static Occlude[][] field3405 = new Occlude[field3409][500];

	@ObfuscatedName("vd.o")
	public final int[][][] field3410;

	@ObfuscatedName("vd.p")
	public static int field3411 = 0;

	@ObfuscatedName("vd.q")
	public static int field3412 = -1;

	@ObfuscatedName("vd.r")
	public int field3413 = 0;

	@ObfuscatedName("vd.s")
	public static int field3414;

	@ObfuscatedName("vd.t")
	public static int field3415;

	@ObfuscatedName("vd.u")
	public static int field3416;

	@ObfuscatedName("vd.v")
	public final int[][][] field3417 = new int[4][105][105];

	@ObfuscatedName("vd.w")
	public static Sprite[] field3418 = new Sprite[100];

	@ObfuscatedName("vd.z")
	public static int field3421 = 0;

	@ObfuscatedName("vd.F")
	public static boolean field3427 = true;

	@ObfuscatedName("vd.I")
	public static Occlude[] field3430 = new Occlude[500];

	@ObfuscatedName("vd.B")
	public static int field3423 = 0;

	@ObfuscatedName("vd.x")
	public static int field3419 = 0;

	@ObfuscatedName("vd.C")
	public static int field3424 = 0;

	@ObfuscatedName("vd.M")
	public static int[] field3434 = new int[field3409];

	@ObfuscatedName("vd.K")
	public static int field3432 = -1;

	@ObfuscatedName("vd.L")
	public static LinkList field3433 = new LinkList();

	@ObfuscatedName("vd.N")
	public static boolean[][][][] field3435 = new boolean[8][32][51][51];

	@ObfuscatedName("vd.R")
	public static int[] field3439 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("vd.P")
	public static int[] field3437 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("vd.W")
	public static int[] field3444 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("vd.U")
	public static int[] field3442 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("vd.S")
	public static int[] field3440 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("vd.Y")
	public static int[] field3446 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("vd.V")
	public final int[][] field3443 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("vd.y")
	public final int field3420 = 104;

	@ObfuscatedName("vd.A")
	public static int field3422;

	@ObfuscatedName("vd.D")
	public static int field3425;

	@ObfuscatedName("vd.E")
	public static int field3426;

	@ObfuscatedName("vd.G")
	public static int field3428;

	@ObfuscatedName("vd.H")
	public static int field3429;

	@ObfuscatedName("vd.J")
	public static int field3431;

	@ObfuscatedName("vd.O")
	public static int field3436;

	@ObfuscatedName("vd.Q")
	public static int field3438;

	@ObfuscatedName("vd.T")
	public static int field3441;

	@ObfuscatedName("vd.X")
	public static int field3445;

	@ObfuscatedName("vd.Z")
	public static boolean[][] field3447;

	@ObfuscatedName("vd.b(III)Z")
	public static boolean method1120(int arg0, int arg1, int arg2) {
		int var3 = arg2 * field3431 + arg0 * field3426 >> 16;
		int var4 = arg2 * field3426 - arg0 * field3431 >> 16;
		int var5 = arg1 * field3414 + var4 * field3425 >> 16;
		int var6 = arg1 * field3425 - var4 * field3414 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = field3436 + (var3 << 9) / var5;
			int var8 = field3445 + (var6 << 9) / var5;
			return var7 >= field3441 && var7 <= field3450 && var8 >= field3438 && var8 <= field3451;
		} else {
			return false;
		}
	}

	@ObfuscatedName("vd.a([IIIII)V")
	public static void init(int[] arg0) {
		field3441 = 0;
		field3438 = 0;
		field3450 = 512;
		field3451 = 334;
		field3436 = 256;
		field3445 = 167;
		boolean[][][][] var1 = new boolean[9][32][53][53];
		for (int var2 = 128; var2 <= 384; var2 += 32) {
			for (int var3 = 0; var3 < 2048; var3 += 64) {
				field3414 = Pix3D.sinTable[var2];
				field3425 = Pix3D.cosTable[var2];
				field3431 = Pix3D.sinTable[var3];
				field3426 = Pix3D.cosTable[var3];
				int var4 = (var2 - 128) / 32;
				int var5 = var3 / 64;
				for (int var6 = -26; var6 <= 26; var6++) {
					for (int var7 = -26; var7 <= 26; var7++) {
						int var8 = var6 * 128;
						int var9 = var7 * 128;
						boolean var10 = false;
						for (int var11 = -500; var11 <= 800; var11 += 128) {
							if (method1120(var8, arg0[var4] + var11, var9)) {
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
						field3435[var12][var13][var14 + 25][var15 + 25] = var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.a(IIIIIIII)V")
	public static void method1145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
		field3405[arg0][field3434[arg0]++] = var8;
	}

	@ObfuscatedName("vd.a(II)I")
	public static int method1155(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	public World(int arg0, int arg1, int arg2, int[][][] arg3) {
		this.field3410 = arg3;
		this.resetMap();
	}

	@ObfuscatedName("kf.a(IILhd;III)V")
	public static void method603(int arg0, LocType arg1, int arg2, int arg3, int arg4) {
		BgSound var5 = new BgSound();
		var5.field2276 = arg4 * 128;
		var5.field2275 = arg1.bgsound_sound;
		var5.field2256 = arg3 * 128;
		var5.field2249 = arg1.bgsound_maxdelay;
		var5.field2245 = arg1.bgsound_random;
		int var6 = arg1.width;
		var5.field2251 = arg2;
		var5.field2260 = arg1.bgsound_range * 128;
		var5.field2244 = arg1.bgsound_mindelay;
		int var7 = arg1.length;
		if (arg0 == 1 || arg0 == 3) {
			var7 = arg1.width;
			var6 = arg1.length;
		}
		var5.field2248 = (var7 + arg4) * 128;
		var5.field2255 = (var6 + arg3) * 128;
		if (arg1.multiloc != null) {
			var5.field2250 = arg1;
			var5.method767();
		}
		BgSound.field1466.push(var5);
		if (var5.field2245 != null) {
			var5.field2269 = (int) ((double) (var5.field2249 - var5.field2244) * Math.random()) + var5.field2244;
		}
	}

	@ObfuscatedName("vd.a(IIIILdd;Ldd;IIII)V")
	public void method1117(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		Wall var11 = new Wall();
		var11.field42 = arg8;
		var11.field36 = arg9;
		var11.field30 = arg1 * 128 + 64;
		var11.field39 = arg2 * 128 + 64;
		var11.field38 = arg3;
		var11.field29 = arg4;
		var11.field32 = arg5;
		var11.field34 = arg6;
		var11.field37 = arg7;
		for (int var12 = arg0; var12 >= 0; var12--) {
			if (this.field3404[var12][arg1][arg2] == null) {
				this.field3404[var12][arg1][arg2] = new Square(var12, arg1, arg2);
			}
		}
		this.field3404[arg0][arg1][arg2].wall = var11;
	}

	@ObfuscatedName("vd.a(Lp;III)V")
	public void method1118(ModelUnlit arg0, int arg1, int arg2, int arg3) {
		if (arg2 < this.field3401) {
			Square var5 = this.field3404[arg1][arg2 + 1][arg3];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.field1770 instanceof ModelUnlit) {
				ModelUnlit var6 = (ModelUnlit) var5.groundDecor.field1770;
				ModelUnlit.method848(arg0, var6, 128, 0, 0, true);
			}
		}
		if (arg3 < this.field3401) {
			Square var7 = this.field3404[arg1][arg2][arg3 + 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.field1770 instanceof ModelUnlit) {
				ModelUnlit var8 = (ModelUnlit) var7.groundDecor.field1770;
				ModelUnlit.method848(arg0, var8, 0, 0, 128, true);
			}
		}
		if (arg2 < this.field3401 && arg3 < this.field3420) {
			Square var9 = this.field3404[arg1][arg2 + 1][arg3 + 1];
			if (var9 != null && var9.groundDecor != null && var9.groundDecor.field1770 instanceof ModelUnlit) {
				ModelUnlit var10 = (ModelUnlit) var9.groundDecor.field1770;
				ModelUnlit.method848(arg0, var10, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.field3401 || arg3 <= 0) {
			return;
		}
		Square var11 = this.field3404[arg1][arg2 + 1][arg3 - 1];
		if (var11 != null && var11.groundDecor != null && var11.groundDecor.field1770 instanceof ModelUnlit) {
			ModelUnlit var12 = (ModelUnlit) var11.groundDecor.field1770;
			ModelUnlit.method848(arg0, var12, 128, 0, -128, true);
		}
	}

	@ObfuscatedName("vd.a(III)Lgb;")
	public Sprite method1119(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}
		for (int var5 = 0; var5 < var4.field3546; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field1067 >> 29 & 0x3) == 2 && var6.field1054 == arg1 && var6.field1051 == arg2) {
				return var6;
			}
		}
		return null;
	}

	@ObfuscatedName("vd.a(IIII)I")
	public int method1121(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field3404[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.field42 == arg3) {
			return var5.wall.field36 & 0xFF;
		} else if (var5.decor != null && var5.decor.field2825 == arg3) {
			return var5.decor.field2820 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.field1766 == arg3) {
			return var5.groundDecor.field1764 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field3546; var6++) {
				if (var5.sprites[var6].field1067 == arg3) {
					return var5.sprites[var6].field1059 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("vd.b(IIII)V")
	public void method1122(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.field3404[arg0][arg1][arg2];
		if (var5 != null) {
			this.field3404[arg0][arg1][arg2].field3550 = arg3;
		}
	}

	@ObfuscatedName("vd.c(III)Lab;")
	public Wall method1123(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		return var4 == null ? null : var4.wall;
	}

	@ObfuscatedName("vd.d(III)V")
	public void method1124(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 != null) {
			var4.decor = null;
		}
	}

	@ObfuscatedName("vd.c(IIII)Z")
	public boolean method1125(int arg0, int arg1, int arg2, int arg3) {
		if (!this.method1161(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.field3410[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field3416) {
					if (!this.method1163(var5, var7, var6)) {
						return false;
					}
					if (!this.method1163(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1163(var5, var8, var6)) {
						return false;
					}
					if (!this.method1163(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method1163(var5, var9, var6)) {
					return false;
				}
				if (!this.method1163(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < field3422) {
					if (!this.method1163(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.method1163(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1163(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.method1163(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method1163(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.method1163(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < field3416) {
					if (!this.method1163(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.method1163(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1163(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.method1163(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method1163(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.method1163(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > field3422) {
					if (!this.method1163(var5, var7, var6)) {
						return false;
					}
					if (!this.method1163(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1163(var5, var8, var6)) {
						return false;
					}
					if (!this.method1163(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.method1163(var5, var9, var6)) {
					return false;
				}
				if (!this.method1163(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1163(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1163(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.method1163(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.method1163(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.method1163(var5, var9, var6);
		} else {
			return true;
		}
	}

	@ObfuscatedName("vd.e(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("vd.f(III)V")
	public void method1128(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		for (int var5 = 0; var5 < var4.field3546; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field1067 >> 29 & 0x3) == 2 && var6.field1054 == arg1 && var6.field1051 == arg2) {
				this.method1164(var6);
				return;
			}
		}
	}

	@ObfuscatedName("vd.a(IIIIIIIILdd;IZII)Z")
	public boolean method1129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, int arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.field3401 || var15 >= this.field3420) {
					return false;
				}
				Square var16 = this.field3404[arg0][var14][var15];
				if (var16 != null && var16.field3546 >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.field1067 = arg11;
		var17.field1059 = arg12;
		var17.field1065 = arg0;
		var17.field1050 = arg5;
		var17.field1053 = arg6;
		var17.field1060 = arg7;
		var17.model = arg8;
		var17.field1061 = arg9;
		var17.field1054 = arg1;
		var17.field1051 = arg2;
		var17.field1063 = arg1 + arg3 - 1;
		var17.field1064 = arg2 + arg4 - 1;
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
					if (this.field3404[var21][var18][var19] == null) {
						this.field3404[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.field3404[arg0][var18][var19];
				var22.sprites[var22.field3546] = var17;
				var22.spriteSpan[var22.field3546] = var20;
				var22.spriteSpans |= var20;
				var22.field3546++;
			}
		}
		if (arg10) {
			this.field3399[this.field3398++] = var17;
		}
		return true;
	}

	@ObfuscatedName("vd.g(III)V")
	public void method1130(int arg0, int arg1, int arg2) {
		field3406 = true;
		field3424 = arg0;
		field3419 = arg1;
		field3421 = arg2;
		field3412 = -1;
		field3432 = -1;
	}

	@ObfuscatedName("vd.h(III)I")
	public int method1131(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		return var4 == null || var4.decor == null ? 0 : var4.decor.field2825;
	}

	@ObfuscatedName("vd.a(IIIIII)Z")
	public boolean method1132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.field3417[arg0][var9][var10] == -field3415) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.field3410[arg0][arg1][arg3] - arg5;
			if (!this.method1163(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 1;
			if (!this.method1163(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 1;
			if (!this.method1163(var11, var13, var15)) {
				return false;
			} else if (this.method1163(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1161(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.method1163(var7 + 1, this.field3410[arg0][arg1][arg3] - arg5, var8 + 1) && this.method1163(var7 + 128 - 1, this.field3410[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method1163(var7 + 128 - 1, this.field3410[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method1163(var7 + 1, this.field3410[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("vd.i(III)I")
	public int method1133(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field3546; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field1067 >> 29 & 0x3) == 2 && var6.field1054 == arg1 && var6.field1051 == arg2) {
				return var6.field1067;
			}
		}
		return 0;
	}

	@ObfuscatedName("vd.j(III)I")
	public int method1134(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.field1766;
	}

	@ObfuscatedName("vd.a()V")
	public void method1135() {
		for (int var1 = 0; var1 < this.field3398; var1++) {
			Sprite var2 = this.field3399[var1];
			this.method1164(var2);
			this.field3399[var1] = null;
		}
		this.field3398 = 0;
	}

	@ObfuscatedName("vd.k(III)V")
	public void method1136(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundDecor = null;
		}
	}

	@ObfuscatedName("vd.d(IIII)Z")
	public boolean method1137(int arg0, int arg1, int arg2, int arg3) {
		if (this.method1161(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.method1163(var5 + 1, this.field3410[arg0][arg1][arg2] - arg3, var6 + 1) && this.method1163(var5 + 128 - 1, this.field3410[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method1163(var5 + 128 - 1, this.field3410[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method1163(var5 + 1, this.field3410[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
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
		var8.field1770 = arg4;
		var8.field1767 = arg1 * 128 + 64;
		var8.field1756 = arg2 * 128 + 64;
		var8.field1761 = arg3;
		var8.field1766 = arg5;
		var8.field1764 = arg6;
		if (this.field3404[arg0][arg1][arg2] == null) {
			this.field3404[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.field3404[arg0][arg1][arg2].groundDecor = var8;
	}

	@ObfuscatedName("vd.b()V")
	public void resetMap() {
		for (int var1 = 0; var1 < this.field3396; var1++) {
			for (int var2 = 0; var2 < this.field3401; var2++) {
				for (int var3 = 0; var3 < this.field3420; var3++) {
					this.field3404[var1][var2][var3] = null;
				}
			}
		}
		for (int var4 = 0; var4 < field3409; var4++) {
			for (int var5 = 0; var5 < field3434[var4]; var5++) {
				field3405[var4][var5] = null;
			}
			field3434[var4] = 0;
		}
		for (int var6 = 0; var6 < this.field3398; var6++) {
			this.field3399[var6] = null;
		}
		this.field3398 = 0;
		for (int var7 = 0; var7 < field3418.length; var7++) {
			field3418[var7] = null;
		}
	}

	@ObfuscatedName("vd.l(III)V")
	public void method1140() {
		for (int var1 = 0; var1 < this.field3396; var1++) {
			for (int var2 = 0; var2 < this.field3401; var2++) {
				for (int var3 = 0; var3 < this.field3420; var3++) {
					Square var4 = this.field3404[var1][var2][var3];
					if (var4 != null) {
						Wall var5 = var4.wall;
						if (var5 != null && var5.field29 instanceof ModelUnlit) {
							ModelUnlit var6 = (ModelUnlit) var5.field29;
							this.method1162(var6, var1, var2, var3, 1, 1);
							if (var5.field32 instanceof ModelUnlit) {
								ModelUnlit var7 = (ModelUnlit) var5.field32;
								this.method1162(var7, var1, var2, var3, 1, 1);
								ModelUnlit.method848(var6, var7, 0, 0, 0, false);
								var5.field32 = var7.light(var7.ambient, var7.contrast, -50, -10, -50);
							}
							var5.field29 = var6.light(var6.ambient, var6.contrast, -50, -10, -50);
						}
						for (int var8 = 0; var8 < var4.field3546; var8++) {
							Sprite var9 = var4.sprites[var8];
							if (var9 != null && var9.model instanceof ModelUnlit) {
								ModelUnlit var10 = (ModelUnlit) var9.model;
								this.method1162(var10, var1, var2, var3, var9.field1063 + 1 - var9.field1054, var9.field1064 - var9.field1051 + 1);
								var9.model = var10.light(var10.ambient, var10.contrast, -50, -10, -50);
							}
						}
						GroundDecor var11 = var4.groundDecor;
						if (var11 != null && var11.field1770 instanceof ModelUnlit) {
							ModelUnlit var12 = (ModelUnlit) var11.field1770;
							this.method1118(var12, var1, var2, var3);
							var11.field1770 = var12.light(var12.ambient, var12.contrast, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.a(Lgd;IIIIII)V")
	public void method1141(Ground arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0.field1089.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg0.field1089[var9] - field3416;
			int var11 = arg0.field1083[var9] - field3429;
			int var12 = arg0.field1098[var9] - field3422;
			int var13 = var12 * arg3 + var10 * arg4 >> 16;
			int var14 = var12 * arg4 - var10 * arg3 >> 16;
			int var16 = var11 * arg2 - var14 * arg1 >> 16;
			int var17 = var11 * arg1 + var14 * arg2 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg0.field1086 != null) {
				Ground.field1084[var9] = var13;
				Ground.field1093[var9] = var16;
				Ground.field1091[var9] = var17;
			}
			Ground.field1082[var9] = Pix3D.originX + (var13 << 9) / var17;
			Ground.field1094[var9] = Pix3D.originY + (var16 << 9) / var17;
		}
		Pix3D.field128 = 0;
		int var18 = arg0.field1096.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg0.field1096[var19];
			int var21 = arg0.field1099[var19];
			int var22 = arg0.field1080[var19];
			int var23 = Ground.field1082[var20];
			int var24 = Ground.field1082[var21];
			int var25 = Ground.field1082[var22];
			int var26 = Ground.field1094[var20];
			int var27 = Ground.field1094[var21];
			int var28 = Ground.field1094[var22];
			if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
				Pix3D.field117 = false;
				if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix3D.sizeX || var24 > Pix3D.sizeX || var25 > Pix3D.sizeX) {
					Pix3D.field117 = true;
				}
				if (field3406 && this.method1166(field3419, field3421, var26, var27, var28, var23, var24, var25)) {
					field3412 = arg5;
					field3432 = arg6;
				}
				if (arg0.field1086 == null || arg0.field1086[var19] == -1) {
					if (arg0.field1088[var19] != 12345678) {
						Pix3D.method33(var26, var27, var28, var23, var24, var25, arg0.field1088[var19], arg0.field1085[var19], arg0.field1092[var19]);
					}
				} else if (field3427) {
					int var29 = Pix3D.field126.getAverageRgb(arg0.field1086[var19]);
					Pix3D.method33(var26, var27, var28, var23, var24, var25, method1155(var29, arg0.field1088[var19]), method1155(var29, arg0.field1085[var19]), method1155(var29, arg0.field1092[var19]));
				} else if (arg0.flat) {
					Pix3D.method31(var26, var27, var28, var23, var24, var25, arg0.field1088[var19], arg0.field1085[var19], arg0.field1092[var19], Ground.field1084[0], Ground.field1084[1], Ground.field1084[3], Ground.field1093[0], Ground.field1093[1], Ground.field1093[3], Ground.field1091[0], Ground.field1091[1], Ground.field1091[3], arg0.field1086[var19]);
				} else {
					Pix3D.method31(var26, var27, var28, var23, var24, var25, arg0.field1088[var19], arg0.field1085[var19], arg0.field1092[var19], Ground.field1084[var20], Ground.field1084[var21], Ground.field1084[var22], Ground.field1093[var20], Ground.field1093[var21], Ground.field1093[var22], Ground.field1091[var20], Ground.field1091[var21], Ground.field1091[var22], arg0.field1086[var19]);
				}
			}
		}
	}

	@ObfuscatedName("vd.a(I)V")
	public void fillBaseLevel(int arg0) {
		this.field3413 = arg0;
		for (int var2 = 0; var2 < this.field3401; var2++) {
			for (int var3 = 0; var3 < this.field3420; var3++) {
				if (this.field3404[arg0][var2][var3] == null) {
					this.field3404[arg0][var2][var3] = new Square(arg0, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("vd.a(IIIIILdd;IIIIII)Z")
	public boolean method1143(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : this.method1129(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@ObfuscatedName("vd.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.field3404[var22][arg1][arg2] == null) {
					this.field3404[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.field3404[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.field3404[var24][arg1][arg2] == null) {
					this.field3404[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.field3404[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.field3404[var26][arg1][arg2] == null) {
					this.field3404[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.field3404[arg0][arg1][arg2].ground = var25;
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
	public void method1147(Square arg0, boolean arg1) {
		field3433.push(arg0);
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
												var3 = (Square) field3433.popFront();
												if (var3 == null) {
													return;
												}
											} while (!var3.field3534);
											var4 = var3.field3533;
											var5 = var3.field3549;
											var6 = var3.level;
											var7 = var3.originalLevel;
											var8 = this.field3404[var6];
											if (!var3.field3530) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.field3404[var6 - 1][var4][var5];
													if (var9 != null && var9.field3534) {
														continue;
													}
												}
												if (var4 <= field3428 && var4 > field3403) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field3534 && (var10.field3530 || (var3.spriteSpans & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= field3428 && var4 < field3408 - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field3534 && (var11.field3530 || (var3.spriteSpans & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= field3402 && var5 > field3407) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field3534 && (var12.field3530 || (var3.spriteSpans & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= field3402 && var5 < field3397 - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field3534 && (var13.field3530 || (var3.spriteSpans & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field3530 = false;
											if (var3.linkedSquare != null) {
												Square var14 = var3.linkedSquare;
												if (var14.quickGround == null) {
													if (var14.ground != null && !this.method1161(0, var4, var5)) {
														this.method1141(var14.ground, field3414, field3425, field3431, field3426, var4, var5);
													}
												} else if (!this.method1161(0, var4, var5)) {
													this.method1154(var14.quickGround, 0, field3414, field3425, field3431, field3426, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.field29.worldRender(0, field3414, field3425, field3431, field3426, var15.field30 - field3416, var15.field38 - field3429, var15.field39 - field3422, var15.field42);
												}
												for (int var16 = 0; var16 < var14.field3546; var16++) {
													Sprite var17 = var14.sprites[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.field1061, field3414, field3425, field3431, field3426, var17.field1050 - field3416, var17.field1060 - field3429, var17.field1053 - field3422, var17.field1067);
													}
												}
											}
											boolean var18 = false;
											if (var3.quickGround == null) {
												if (var3.ground != null && !this.method1161(var7, var4, var5)) {
													var18 = true;
													this.method1141(var3.ground, field3414, field3425, field3431, field3426, var4, var5);
												}
											} else if (!this.method1161(var7, var4, var5)) {
												var18 = true;
												if (var3.quickGround.field3621 != 12345678 || field3406 && var6 <= field3424) {
													this.method1154(var3.quickGround, var7, field3414, field3425, field3431, field3426, var4, var5);
												}
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.wall;
											Decor var22 = var3.decor;
											if (var21 != null || var22 != null) {
												if (field3428 == var4) {
													var19++;
												} else if (field3428 < var4) {
													var19 += 2;
												}
												if (field3402 == var5) {
													var19 += 3;
												} else if (field3402 > var5) {
													var19 += 6;
												}
												var20 = field3446[var19];
												var3.field3521 = field3444[var19];
											}
											if (var21 != null) {
												if ((var21.field34 & field3449[var19]) == 0) {
													var3.field3524 = 0;
												} else if (var21.field34 == 16) {
													var3.field3524 = 3;
													var3.field3522 = field3440[var19];
													var3.field3525 = 3 - var3.field3522;
												} else if (var21.field34 == 32) {
													var3.field3524 = 6;
													var3.field3522 = field3439[var19];
													var3.field3525 = 6 - var3.field3522;
												} else if (var21.field34 == 64) {
													var3.field3524 = 12;
													var3.field3522 = field3437[var19];
													var3.field3525 = 12 - var3.field3522;
												} else {
													var3.field3524 = 9;
													var3.field3522 = field3442[var19];
													var3.field3525 = 9 - var3.field3522;
												}
												if ((var21.field34 & var20) != 0 && !this.method1125(var7, var4, var5, var21.field34)) {
													var21.field29.worldRender(0, field3414, field3425, field3431, field3426, var21.field30 - field3416, var21.field38 - field3429, var21.field39 - field3422, var21.field42);
												}
												if ((var21.field37 & var20) != 0 && !this.method1125(var7, var4, var5, var21.field37)) {
													var21.field32.worldRender(0, field3414, field3425, field3431, field3426, var21.field30 - field3416, var21.field38 - field3429, var21.field39 - field3422, var21.field42);
												}
											}
											if (var22 != null && !this.method1137(var7, var4, var5, var22.field2831.minY)) {
												if ((var22.field2823 & var20) != 0) {
													var22.field2831.worldRender(0, field3414, field3425, field3431, field3426, var22.field2837 + var22.field2822 - field3416, var22.field2834 - field3429, var22.field2826 + var22.field2829 - field3422, var22.field2825);
												} else if (var22.field2823 == 256) {
													int var23 = var22.field2837 - field3416;
													int var24 = var22.field2834 - field3429;
													int var25 = var22.field2826 - field3422;
													int var26 = var22.field2828;
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
														var22.field2831.worldRender(0, field3414, field3425, field3431, field3426, var23 + var22.field2822, var24, var25 + var22.field2829, var22.field2825);
													} else if (var22.field2817 != null) {
														var22.field2817.worldRender(0, field3414, field3425, field3431, field3426, var23, var24, var25, var22.field2825);
													}
												}
											}
											if (var18) {
												GroundDecor var29 = var3.groundDecor;
												if (var29 != null) {
													var29.field1770.worldRender(0, field3414, field3425, field3431, field3426, var29.field1767 - field3416, var29.field1761 - field3429, var29.field1756 - field3422, var29.field1766);
												}
												GroundObject var30 = var3.groundObject;
												if (var30 != null && var30.field2039 == 0) {
													if (var30.field2042 != null) {
														var30.field2042.worldRender(0, field3414, field3425, field3431, field3426, var30.field2033 - field3416, var30.field2028 - field3429, var30.field2034 - field3422, var30.field2046);
													}
													if (var30.field2037 != null) {
														var30.field2037.worldRender(0, field3414, field3425, field3431, field3426, var30.field2033 - field3416, var30.field2028 - field3429, var30.field2034 - field3422, var30.field2046);
													}
													if (var30.field2040 != null) {
														var30.field2040.worldRender(0, field3414, field3425, field3431, field3426, var30.field2033 - field3416, var30.field2028 - field3429, var30.field2034 - field3422, var30.field2046);
													}
												}
											}
											int var31 = var3.spriteSpans;
											if (var31 != 0) {
												if (var4 < field3428 && (var31 & 0x4) != 0) {
													Square var32 = var8[var4 + 1][var5];
													if (var32 != null && var32.field3534) {
														field3433.push(var32);
													}
												}
												if (var5 < field3402 && (var31 & 0x2) != 0) {
													Square var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.field3534) {
														field3433.push(var33);
													}
												}
												if (var4 > field3428 && (var31 & 0x1) != 0) {
													Square var34 = var8[var4 - 1][var5];
													if (var34 != null && var34.field3534) {
														field3433.push(var34);
													}
												}
												if (var5 > field3402 && (var31 & 0x8) != 0) {
													Square var35 = var8[var4][var5 - 1];
													if (var35 != null && var35.field3534) {
														field3433.push(var35);
													}
												}
											}
											break;
										}
										if (var3.field3524 != 0) {
											boolean var36 = true;
											for (int var37 = 0; var37 < var3.field3546; var37++) {
												if (var3.sprites[var37].field1056 != field3415 && (var3.spriteSpan[var37] & var3.field3524) == var3.field3522) {
													var36 = false;
													break;
												}
											}
											if (var36) {
												Wall var38 = var3.wall;
												if (!this.method1125(var7, var4, var5, var38.field34)) {
													var38.field29.worldRender(0, field3414, field3425, field3431, field3426, var38.field30 - field3416, var38.field38 - field3429, var38.field39 - field3422, var38.field42);
												}
												var3.field3524 = 0;
											}
										}
										if (!var3.field3539) {
											break;
										}
										try {
											int var39 = var3.field3546;
											var3.field3539 = false;
											int var40 = 0;
											label558: for (int var41 = 0; var41 < var39; var41++) {
												Sprite var42 = var3.sprites[var41];
												if (var42.field1056 != field3415) {
													for (int var43 = var42.field1054; var43 <= var42.field1063; var43++) {
														for (int var44 = var42.field1051; var44 <= var42.field1064; var44++) {
															Square var45 = var8[var43][var44];
															if (var45.field3530) {
																var3.field3539 = true;
																continue label558;
															}
															if (var45.field3524 != 0) {
																int var46 = 0;
																if (var43 > var42.field1054) {
																	var46++;
																}
																if (var43 < var42.field1063) {
																	var46 += 4;
																}
																if (var44 > var42.field1051) {
																	var46 += 8;
																}
																if (var44 < var42.field1064) {
																	var46 += 2;
																}
																if ((var46 & var45.field3524) == var3.field3525) {
																	var3.field3539 = true;
																	continue label558;
																}
															}
														}
													}
													field3418[var40++] = var42;
													int var47 = field3428 - var42.field1054;
													int var48 = var42.field1063 - field3428;
													if (var48 > var47) {
														var47 = var48;
													}
													int var49 = field3402 - var42.field1051;
													int var50 = var42.field1064 - field3402;
													if (var50 > var49) {
														var42.field1062 = var47 + var50;
													} else {
														var42.field1062 = var47 + var49;
													}
												}
											}
											while (var40 > 0) {
												int var51 = -50;
												int var52 = -1;
												for (int var53 = 0; var53 < var40; var53++) {
													Sprite var54 = field3418[var53];
													if (var54.field1056 != field3415) {
														if (var54.field1062 > var51) {
															var51 = var54.field1062;
															var52 = var53;
														} else if (var54.field1062 == var51) {
															int var55 = var54.field1050 - field3416;
															int var56 = var54.field1053 - field3422;
															int var57 = field3418[var52].field1050 - field3416;
															int var58 = field3418[var52].field1053 - field3422;
															if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
																var52 = var53;
															}
														}
													}
												}
												if (var52 == -1) {
													break;
												}
												Sprite var59 = field3418[var52];
												var59.field1056 = field3415;
												if (!this.method1132(var7, var59.field1054, var59.field1063, var59.field1051, var59.field1064, var59.model.minY)) {
													var59.model.worldRender(var59.field1061, field3414, field3425, field3431, field3426, var59.field1050 - field3416, var59.field1060 - field3429, var59.field1053 - field3422, var59.field1067);
												}
												for (int var60 = var59.field1054; var60 <= var59.field1063; var60++) {
													for (int var61 = var59.field1051; var61 <= var59.field1064; var61++) {
														Square var62 = var8[var60][var61];
														if (var62.field3524 != 0) {
															field3433.push(var62);
														} else if ((var60 != var4 || var61 != var5) && var62.field3534) {
															field3433.push(var62);
														}
													}
												}
											}
											if (!var3.field3539) {
												break;
											}
										} catch (Exception var81) {
											var3.field3539 = false;
											break;
										}
									}
								} while (!var3.field3534);
							} while (var3.field3524 != 0);
							if (var4 > field3428 || var4 <= field3403) {
								break;
							}
							var63 = var8[var4 - 1][var5];
						} while (var63 != null && var63.field3534);
						if (var4 < field3428 || var4 >= field3408 - 1) {
							break;
						}
						var64 = var8[var4 + 1][var5];
					} while (var64 != null && var64.field3534);
					if (var5 > field3402 || var5 <= field3407) {
						break;
					}
					var65 = var8[var4][var5 - 1];
				} while (var65 != null && var65.field3534);
				if (var5 < field3402 || var5 >= field3397 - 1) {
					break;
				}
				var66 = var8[var4][var5 + 1];
			} while (var66 != null && var66.field3534);
			var3.field3534 = false;
			field3400--;
			GroundObject var67 = var3.groundObject;
			if (var67 != null && var67.field2039 != 0) {
				if (var67.field2042 != null) {
					var67.field2042.worldRender(0, field3414, field3425, field3431, field3426, var67.field2033 - field3416, var67.field2028 - field3429 - var67.field2039, var67.field2034 - field3422, var67.field2046);
				}
				if (var67.field2037 != null) {
					var67.field2037.worldRender(0, field3414, field3425, field3431, field3426, var67.field2033 - field3416, var67.field2028 - field3429 - var67.field2039, var67.field2034 - field3422, var67.field2046);
				}
				if (var67.field2040 != null) {
					var67.field2040.worldRender(0, field3414, field3425, field3431, field3426, var67.field2033 - field3416, var67.field2028 - field3429 - var67.field2039, var67.field2034 - field3422, var67.field2046);
				}
			}
			if (var3.field3521 != 0) {
				Decor var68 = var3.decor;
				if (var68 != null && !this.method1137(var7, var4, var5, var68.field2831.minY)) {
					if ((var68.field2823 & var3.field3521) != 0) {
						var68.field2831.worldRender(0, field3414, field3425, field3431, field3426, var68.field2837 + var68.field2822 - field3416, var68.field2834 - field3429, var68.field2826 + var68.field2829 - field3422, var68.field2825);
					} else if (var68.field2823 == 256) {
						int var69 = var68.field2837 - field3416;
						int var70 = var68.field2834 - field3429;
						int var71 = var68.field2826 - field3422;
						int var72 = var68.field2828;
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
							var68.field2831.worldRender(0, field3414, field3425, field3431, field3426, var69 + var68.field2822, var70, var71 + var68.field2829, var68.field2825);
						} else if (var68.field2817 != null) {
							var68.field2817.worldRender(0, field3414, field3425, field3431, field3426, var69, var70, var71, var68.field2825);
						}
					}
				}
				Wall var75 = var3.wall;
				if (var75 != null) {
					if ((var75.field37 & var3.field3521) != 0 && !this.method1125(var7, var4, var5, var75.field37)) {
						var75.field32.worldRender(0, field3414, field3425, field3431, field3426, var75.field30 - field3416, var75.field38 - field3429, var75.field39 - field3422, var75.field42);
					}
					if ((var75.field34 & var3.field3521) != 0 && !this.method1125(var7, var4, var5, var75.field34)) {
						var75.field29.worldRender(0, field3414, field3425, field3431, field3426, var75.field30 - field3416, var75.field38 - field3429, var75.field39 - field3422, var75.field42);
					}
				}
			}
			if (var6 < this.field3396 - 1) {
				Square var76 = this.field3404[var6 + 1][var4][var5];
				if (var76 != null && var76.field3534) {
					field3433.push(var76);
				}
			}
			if (var4 < field3428) {
				Square var77 = var8[var4 + 1][var5];
				if (var77 != null && var77.field3534) {
					field3433.push(var77);
				}
			}
			if (var5 < field3402) {
				Square var78 = var8[var4][var5 + 1];
				if (var78 != null && var78.field3534) {
					field3433.push(var78);
				}
			}
			if (var4 > field3428) {
				Square var79 = var8[var4 - 1][var5];
				if (var79 != null && var79.field3534) {
					field3433.push(var79);
				}
			}
			if (var5 > field3402) {
				Square var80 = var8[var4][var5 - 1];
				if (var80 != null && var80.field3534) {
					field3433.push(var80);
				}
			}
		}
	}

	@ObfuscatedName("vd.m(III)V")
	public void method1148(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	@ObfuscatedName("vd.a([IIIIII)V")
	public void method1149(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.field3404[arg2][arg3][arg4];
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
		if (var10 == null) {
			return;
		}
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

	@ObfuscatedName("vd.n(III)Lr;")
	public Decor method1150(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
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
		Square var5 = this.field3404[arg0][arg1][arg2];
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
	public int method1153(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.field42;
	}

	@ObfuscatedName("vd.a(Lwe;IIIIIII)V")
	public void method1154(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field3416;
		int var11;
		int var12 = var11 = (arg7 << 7) - field3422;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field3410[arg1][arg6][arg7] - field3429;
		int var18 = this.field3410[arg1][arg6 + 1][arg7] - field3429;
		int var19 = this.field3410[arg1][arg6 + 1][arg7 + 1] - field3429;
		int var20 = this.field3410[arg1][arg6][arg7 + 1] - field3429;
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
		Pix3D.field128 = 0;
		if ((var48 - var50) * (var47 - var51) - (var49 - var51) * (var46 - var50) > 0) {
			Pix3D.field117 = false;
			if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix3D.sizeX || var50 > Pix3D.sizeX || var46 > Pix3D.sizeX) {
				Pix3D.field117 = true;
			}
			if (field3406 && this.method1166(field3419, field3421, var49, var51, var47, var48, var50, var46)) {
				field3412 = arg6;
				field3432 = arg7;
			}
			if (arg0.field3631 == -1) {
				if (arg0.field3621 != 12345678) {
					Pix3D.method33(var49, var51, var47, var48, var50, var46, arg0.field3621, arg0.field3615, arg0.field3609);
				}
			} else if (field3427) {
				int var52 = Pix3D.field126.getAverageRgb(arg0.field3631);
				Pix3D.method33(var49, var51, var47, var48, var50, var46, method1155(var52, arg0.field3621), method1155(var52, arg0.field3615), method1155(var52, arg0.field3609));
			} else if (arg0.field3614) {
				Pix3D.method31(var49, var51, var47, var48, var50, var46, arg0.field3621, arg0.field3615, arg0.field3609, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3631);
			} else {
				Pix3D.method31(var49, var51, var47, var48, var50, var46, arg0.field3621, arg0.field3615, arg0.field3609, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3631);
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		Pix3D.field117 = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix3D.sizeX || var46 > Pix3D.sizeX || var50 > Pix3D.sizeX) {
			Pix3D.field117 = true;
		}
		if (field3406 && this.method1166(field3419, field3421, var45, var47, var51, var44, var46, var50)) {
			field3412 = arg6;
			field3432 = arg7;
		}
		if (arg0.field3631 != -1) {
			if (!field3427) {
				Pix3D.method31(var45, var47, var51, var44, var46, var50, arg0.field3630, arg0.field3609, arg0.field3615, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3631);
				return;
			}
			int var53 = Pix3D.field126.getAverageRgb(arg0.field3631);
			Pix3D.method33(var45, var47, var51, var44, var46, var50, method1155(var53, arg0.field3630), method1155(var53, arg0.field3609), method1155(var53, arg0.field3615));
		} else if (arg0.field3630 != 12345678) {
			Pix3D.method33(var45, var47, var51, var44, var46, var50, arg0.field3630, arg0.field3609, arg0.field3615);
			return;
		}
	}

	@ObfuscatedName("vd.c()V")
	public void method1156() {
		int var1 = field3434[field3423];
		Occlude[] var2 = field3405[field3423];
		field3411 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.field2430 == 1) {
				int var5 = var4.field2419 + 25 - field3428;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.field2410 + 25 - field3402;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var4.field2429 + 25 - field3402;
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
						int var9 = field3416 - var4.field2427;
						if (var9 > 32) {
							var4.field2411 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var4.field2411 = 2;
							var9 = -var9;
						}
						var4.field2431 = (var4.field2417 - field3422 << 8) / var9;
						var4.field2415 = (var4.field2423 - field3422 << 8) / var9;
						var4.field2412 = (var4.field2432 - field3429 << 8) / var9;
						var4.field2420 = (var4.field2421 - field3429 << 8) / var9;
						field3430[field3411++] = var4;
					}
				}
			} else if (var4.field2430 == 2) {
				int var10 = var4.field2410 + 25 - field3402;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.field2419 + 25 - field3428;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var4.field2425 + 25 - field3428;
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
						int var14 = field3422 - var4.field2417;
						if (var14 > 32) {
							var4.field2411 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var4.field2411 = 4;
							var14 = -var14;
						}
						var4.field2422 = (var4.field2427 - field3416 << 8) / var14;
						var4.field2413 = (var4.field2408 - field3416 << 8) / var14;
						var4.field2412 = (var4.field2432 - field3429 << 8) / var14;
						var4.field2420 = (var4.field2421 - field3429 << 8) / var14;
						field3430[field3411++] = var4;
					}
				}
			} else if (var4.field2430 == 4) {
				int var15 = var4.field2432 - field3429;
				if (var15 > 128) {
					int var16 = var4.field2410 + 25 - field3402;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var4.field2429 + 25 - field3402;
					if (var17 > 50) {
						var17 = 50;
					}
					if (var16 <= var17) {
						int var18 = var4.field2419 + 25 - field3428;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var4.field2425 + 25 - field3428;
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
							var4.field2422 = (var4.field2427 - field3416 << 8) / var15;
							var4.field2413 = (var4.field2408 - field3416 << 8) / var15;
							var4.field2431 = (var4.field2417 - field3422 << 8) / var15;
							var4.field2415 = (var4.field2423 - field3422 << 8) / var15;
							field3430[field3411++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.b(II)V")
	public void method1157(int arg0, int arg1) {
		Square var3 = this.field3404[0][arg0][arg1];
		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = this.field3404[var4][arg0][arg1] = this.field3404[var4 + 1][arg0][arg1];
			if (var5 != null) {
				var5.level--;
				for (int var6 = 0; var6 < var5.field3546; var6++) {
					Sprite var7 = var5.sprites[var6];
					if ((var7.field1067 >> 29 & 0x3) == 2 && var7.field1054 == arg0 && var7.field1051 == arg1) {
						var7.field1065--;
					}
				}
			}
		}
		if (this.field3404[0][arg0][arg1] == null) {
			this.field3404[0][arg0][arg1] = new Square(0, arg0, arg1);
		}
		this.field3404[0][arg0][arg1].linkedSquare = var3;
		this.field3404[3][arg0][arg1] = null;
	}

	@ObfuscatedName("vd.a(IIIILdd;Ldd;IIIIII)V")
	public void method1158(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, ModelSource arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg4 == null) {
			return;
		}
		Decor var13 = new Decor();
		var13.field2825 = arg10;
		var13.field2820 = arg11;
		var13.field2837 = arg1 * 128 + 64;
		var13.field2826 = arg2 * 128 + 64;
		var13.field2834 = arg3;
		var13.field2831 = arg4;
		var13.field2817 = arg5;
		var13.field2823 = arg6;
		var13.field2828 = arg7;
		var13.field2822 = arg8;
		var13.field2829 = arg9;
		for (int var14 = arg0; var14 >= 0; var14--) {
			if (this.field3404[var14][arg1][arg2] == null) {
				this.field3404[var14][arg1][arg2] = new Square(var14, arg1, arg2);
			}
		}
		this.field3404[arg0][arg1][arg2].decor = var13;
	}

	@ObfuscatedName("vd.p(III)Lkf;")
	public GroundDecor method1160(int arg0, int arg1, int arg2) {
		Square var4 = this.field3404[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? null : var4.groundDecor;
	}

	@ObfuscatedName("vd.q(III)Z")
	public boolean method1161(int arg0, int arg1, int arg2) {
		int var4 = this.field3417[arg0][arg1][arg2];
		if (var4 == -field3415) {
			return false;
		} else if (var4 == field3415) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.method1163(var5 + 1, this.field3410[arg0][arg1][arg2], var6 + 1) && this.method1163(var5 + 128 - 1, this.field3410[arg0][arg1 + 1][arg2], var6 + 1) && this.method1163(var5 + 128 - 1, this.field3410[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method1163(var5 + 1, this.field3410[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.field3417[arg0][arg1][arg2] = field3415;
				return true;
			} else {
				this.field3417[arg0][arg1][arg2] = -field3415;
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
			if (var12 != this.field3396) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.field3401) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.field3420 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && var13 != arg2)) {
								Square var15 = this.field3404[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.field3410[var12][var13][var14] + this.field3410[var12][var13 + 1][var14] + this.field3410[var12][var13][var14 + 1] + this.field3410[var12][var13 + 1][var14 + 1]) / 4 - (this.field3410[arg1][arg2][arg3] + this.field3410[arg1][arg2 + 1][arg3] + this.field3410[arg1][arg2][arg3 + 1] + this.field3410[arg1][arg2 + 1][arg3 + 1]) / 4;
									Wall var17 = var15.wall;
									if (var17 != null) {
										if (var17.field29 instanceof ModelUnlit) {
											ModelUnlit var18 = (ModelUnlit) var17.field29;
											ModelUnlit.method848(arg0, var18, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
										}
										if (var17.field32 instanceof ModelUnlit) {
											ModelUnlit var19 = (ModelUnlit) var17.field32;
											ModelUnlit.method848(arg0, var19, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg3) * 128 + (1 - arg5) * 64, var7);
										}
									}
									for (int var20 = 0; var20 < var15.field3546; var20++) {
										Sprite var21 = var15.sprites[var20];
										if (var21 != null && var21.model instanceof ModelUnlit) {
											ModelUnlit var22 = (ModelUnlit) var21.model;
											int var23 = var21.field1063 + 1 - var21.field1054;
											int var24 = var21.field1064 + 1 - var21.field1051;
											ModelUnlit.method848(arg0, var22, (var21.field1054 - arg2) * 128 + (var23 - arg4) * 64, var16, (var21.field1051 - arg3) * 128 + (var24 - arg5) * 64, var7);
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
	public boolean method1163(int arg0, int arg1, int arg2) {
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
		for (int var2 = arg0.field1054; var2 <= arg0.field1063; var2++) {
			for (int var3 = arg0.field1051; var3 <= arg0.field1064; var3++) {
				Square var4 = this.field3404[arg0.field1065][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.field3546; var5++) {
						if (var4.sprites[var5] == arg0) {
							var4.field3546--;
							for (int var6 = var5; var6 < var4.field3546; var6++) {
								var4.sprites[var6] = var4.sprites[var6 + 1];
								var4.spriteSpan[var6] = var4.spriteSpan[var6 + 1];
							}
							var4.sprites[var4.field3546] = null;
							break;
						}
					}
					var4.spriteSpans = 0;
					for (int var7 = 0; var7 < var4.field3546; var7++) {
						var4.spriteSpans |= var4.spriteSpan[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.a(IIIILdd;ILdd;Ldd;)V")
	public void method1165(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, ModelSource arg6, ModelSource arg7) {
		GroundObject var9 = new GroundObject();
		var9.field2040 = arg4;
		var9.field2033 = arg1 * 128 + 64;
		var9.field2034 = arg2 * 128 + 64;
		var9.field2028 = arg3;
		var9.field2046 = arg5;
		var9.field2042 = arg6;
		var9.field2037 = arg7;
		int var10 = 0;
		Square var11 = this.field3404[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field3546; var12++) {
				if ((var11.sprites[var12].field1059 & 0x100) == 256 && var11.sprites[var12].model instanceof ModelLit) {
					ModelLit var13 = (ModelLit) var11.sprites[var12].model;
					var13.calcBoundingCylinder();
					if (var13.minY > var10) {
						var10 = var13.minY;
					}
				}
			}
		}
		var9.field2039 = var10;
		if (this.field3404[arg0][arg1][arg2] == null) {
			this.field3404[arg0][arg1][arg2] = new Square(arg0, arg1, arg2);
		}
		this.field3404[arg0][arg1][arg2].groundObject = var9;
	}

	@ObfuscatedName("vd.b(IIIIIIII)Z")
	public boolean method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
	public void method1167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.field3401 * 128) {
			arg0 = this.field3401 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.field3420 * 128) {
			arg2 = this.field3420 * 128 - 1;
		}
		field3415++;
		field3414 = Pix3D.sinTable[arg3];
		field3425 = Pix3D.cosTable[arg3];
		field3431 = Pix3D.sinTable[arg4];
		field3426 = Pix3D.cosTable[arg4];
		field3447 = field3435[(arg3 - 128) / 32][arg4 / 64];
		field3416 = arg0;
		field3429 = arg1;
		field3422 = arg2;
		field3428 = arg0 / 128;
		field3402 = arg2 / 128;
		field3423 = arg5;
		field3403 = field3428 - 25;
		if (field3403 < 0) {
			field3403 = 0;
		}
		field3407 = field3402 - 25;
		if (field3407 < 0) {
			field3407 = 0;
		}
		field3408 = field3428 + 25;
		if (field3408 > this.field3401) {
			field3408 = this.field3401;
		}
		field3397 = field3402 + 25;
		if (field3397 > this.field3420) {
			field3397 = this.field3420;
		}
		this.method1156();
		field3400 = 0;
		for (int var7 = this.field3413; var7 < this.field3396; var7++) {
			Square[][] var8 = this.field3404[var7];
			for (int var9 = field3403; var9 < field3408; var9++) {
				for (int var10 = field3407; var10 < field3397; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field3550 <= arg5 && (field3447[var9 + 25 - field3428][var10 + 25 - field3402] || this.field3410[var7][var9][var10] - arg1 >= 2000)) {
							var11.field3530 = true;
							var11.field3534 = true;
							if (var11.field3546 > 0) {
								var11.field3539 = true;
							} else {
								var11.field3539 = false;
							}
							field3400++;
						} else {
							var11.field3530 = false;
							var11.field3534 = false;
							var11.field3524 = 0;
						}
					}
				}
			}
		}
		for (int var12 = this.field3413; var12 < this.field3396; var12++) {
			Square[][] var13 = this.field3404[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = field3428 + var14;
				int var16 = field3428 - var14;
				if (var15 >= field3403 || var16 < field3408) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = field3402 + var17;
						int var19 = field3402 - var17;
						if (var15 >= field3403) {
							if (var18 >= field3407) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.field3530) {
									this.method1147(var20, true);
								}
							}
							if (var19 < field3397) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.field3530) {
									this.method1147(var21, true);
								}
							}
						}
						if (var16 < field3408) {
							if (var18 >= field3407) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.field3530) {
									this.method1147(var22, true);
								}
							}
							if (var19 < field3397) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.field3530) {
									this.method1147(var23, true);
								}
							}
						}
						if (field3400 == 0) {
							field3406 = false;
							return;
						}
					}
				}
			}
		}
		for (int var24 = this.field3413; var24 < this.field3396; var24++) {
			Square[][] var25 = this.field3404[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = field3428 + var26;
				int var28 = field3428 - var26;
				if (var27 >= field3403 || var28 < field3408) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = field3402 + var29;
						int var31 = field3402 - var29;
						if (var27 >= field3403) {
							if (var30 >= field3407) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.field3530) {
									this.method1147(var32, false);
								}
							}
							if (var31 < field3397) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.field3530) {
									this.method1147(var33, false);
								}
							}
						}
						if (var28 < field3408) {
							if (var30 >= field3407) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.field3530) {
									this.method1147(var34, false);
								}
							}
							if (var31 < field3397) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.field3530) {
									this.method1147(var35, false);
								}
							}
						}
						if (field3400 == 0) {
							field3406 = false;
							return;
						}
					}
				}
			}
		}
		field3406 = false;
	}
}
