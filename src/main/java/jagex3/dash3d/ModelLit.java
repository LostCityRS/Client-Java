package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("od")
public final class ModelLit extends ModelSource {

	@ObfuscatedName("od.ab")
	public byte field2328 = 0;

	@ObfuscatedName("od.ac")
	public static int[] field2380 = Pix3D.cosTable;

	@ObfuscatedName("od.bb")
	public int field2329;

	@ObfuscatedName("od.bc")
	public static byte[] field2381 = new byte[1];

	@ObfuscatedName("od.cb")
	public int[] field2330;

	@ObfuscatedName("od.cc")
	public static int field2382 = 0;

	@ObfuscatedName("od.db")
	public static ModelLit field2331 = new ModelLit();

	@ObfuscatedName("od.eb")
	public short[] field2332;

	@ObfuscatedName("od.fb")
	public int[] field2333;

	@ObfuscatedName("od.gb")
	public int field2334 = 0;

	@ObfuscatedName("od.hb")
	public int[] field2335;

	@ObfuscatedName("od.ib")
	public byte[] field2336;

	@ObfuscatedName("od.jb")
	public int[] field2337;

	@ObfuscatedName("od.kb")
	public int[] field2338;

	@ObfuscatedName("od.lb")
	public byte[] field2339;

	@ObfuscatedName("od.mb")
	public int field2340;

	@ObfuscatedName("od.nb")
	public int field2341;

	@ObfuscatedName("od.ob")
	public static byte[] field2342 = new byte[1];

	@ObfuscatedName("od.pb")
	public int field2343;

	@ObfuscatedName("od.qb")
	public int[][] field2344;

	@ObfuscatedName("od.rb")
	public int[] field2345;

	@ObfuscatedName("od.sb")
	public int[] field2346;

	@ObfuscatedName("od.tb")
	public int field2347 = 0;

	@ObfuscatedName("od.ub")
	public int field2348 = 0;

	@ObfuscatedName("od.vb")
	public byte[] field2349;

	@ObfuscatedName("od.wb")
	public int[] field2350;

	@ObfuscatedName("od.xb")
	public static ModelLit field2351 = new ModelLit();

	@ObfuscatedName("od.yb")
	public static int[] field2352 = Pix3D.divTable2;

	@ObfuscatedName("od.Ab")
	public static int[] field2354 = new int[10];

	@ObfuscatedName("od.Gb")
	public static int[] field2360 = new int[10];

	@ObfuscatedName("od.Cb")
	public static int[] field2356 = new int[4096];

	@ObfuscatedName("od.Fb")
	public static int[] field2359 = new int[4096];

	@ObfuscatedName("od.zb")
	public static int[] field2353 = new int[12];

	@ObfuscatedName("od.Ob")
	public static int[] field2368 = new int[2000];

	@ObfuscatedName("od.Lb")
	public static int[] field2365 = new int[10];

	@ObfuscatedName("od.Db")
	public static int[] field2357 = new int[2000];

	@ObfuscatedName("od.Kb")
	public static int[] field2364 = new int[4096];

	@ObfuscatedName("od.Ib")
	public static int field2362 = 0;

	@ObfuscatedName("od.Jb")
	public static int field2363 = 0;

	@ObfuscatedName("od.Bb")
	public static int[] field2355 = new int[1600];

	@ObfuscatedName("od.Pb")
	public static int[] field2369 = Pix3D.field123;

	@ObfuscatedName("od.Qb")
	public static boolean[] field2370 = new boolean[4096];

	@ObfuscatedName("od.Hb")
	public static int[] field2361 = Pix3D.sinTable;

	@ObfuscatedName("od.Rb")
	public static int[] field2371 = new int[4096];

	@ObfuscatedName("od.Tb")
	public static boolean field2373 = false;

	@ObfuscatedName("od.Sb")
	public static int[] field2372 = new int[4096];

	@ObfuscatedName("od.Wb")
	public static boolean[] field2376 = new boolean[4096];

	@ObfuscatedName("od.Xb")
	public static int[][] field2377 = new int[12][2000];

	@ObfuscatedName("od.Yb")
	public static int[] field2378 = new int[12];

	@ObfuscatedName("od.Ub")
	public static int[][] field2374 = new int[1600][512];

	@ObfuscatedName("od.Vb")
	public static int[] field2375 = new int[4096];

	@ObfuscatedName("od.Nb")
	public static int[] field2367 = new int[1000];

	@ObfuscatedName("od.U")
	public boolean useAABBMouseCheck = false;

	@ObfuscatedName("od.T")
	public int[] field2321;

	@ObfuscatedName("od.Z")
	public int[] field2327;

	@ObfuscatedName("od.X")
	public int[] field2325;

	@ObfuscatedName("od.Y")
	public int[] field2326;

	@ObfuscatedName("od.V")
	public int field2323;

	@ObfuscatedName("od.Eb")
	public static int field2358;

	@ObfuscatedName("od.Mb")
	public static int field2366;

	@ObfuscatedName("od.Zb")
	public static int field2379;

	@ObfuscatedName("od.W")
	public int[][] field2324;

	public ModelLit() {
	}

	public ModelLit(ModelLit[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.field2347 = 0;
		this.field2348 = 0;
		this.field2334 = 0;
		this.field2328 = -1;
		for (int var7 = 0; var7 < 2; var7++) {
			ModelLit var8 = arg0[var7];
			if (var8 != null) {
				this.field2347 += var8.field2347;
				this.field2348 += var8.field2348;
				this.field2334 += var8.field2334;
				if (var8.field2349 == null) {
					if (this.field2328 == -1) {
						this.field2328 = var8.field2328;
					}
					if (this.field2328 != var8.field2328) {
						var3 = true;
					}
				} else {
					var3 = true;
				}
				var4 |= var8.field2336 != null;
				var5 |= var8.field2332 != null;
				var6 |= var8.field2339 != null;
			}
		}
		this.field2337 = new int[this.field2347];
		this.field2321 = new int[this.field2347];
		this.field2330 = new int[this.field2347];
		this.field2338 = new int[this.field2348];
		this.field2333 = new int[this.field2348];
		this.field2346 = new int[this.field2348];
		this.field2345 = new int[this.field2348];
		this.field2327 = new int[this.field2348];
		this.field2325 = new int[this.field2348];
		if (var3) {
			this.field2349 = new byte[this.field2348];
		}
		if (var4) {
			this.field2336 = new byte[this.field2348];
		}
		if (var5) {
			this.field2332 = new short[this.field2348];
		}
		if (var6) {
			this.field2339 = new byte[this.field2348];
		}
		if (this.field2334 > 0) {
			this.field2350 = new int[this.field2334];
			this.field2335 = new int[this.field2334];
			this.field2326 = new int[this.field2334];
		}
		this.field2347 = 0;
		this.field2348 = 0;
		this.field2334 = 0;
		for (int var9 = 0; var9 < 2; var9++) {
			ModelLit var10 = arg0[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < var10.field2348; var11++) {
					this.field2338[this.field2348] = var10.field2338[var11] + this.field2347;
					this.field2333[this.field2348] = var10.field2333[var11] + this.field2347;
					this.field2346[this.field2348] = var10.field2346[var11] + this.field2347;
					this.field2345[this.field2348] = var10.field2345[var11];
					this.field2327[this.field2348] = var10.field2327[var11];
					this.field2325[this.field2348] = var10.field2325[var11];
					if (var3) {
						if (var10.field2349 == null) {
							this.field2349[this.field2348] = var10.field2328;
						} else {
							this.field2349[this.field2348] = var10.field2349[var11];
						}
					}
					if (var4 && var10.field2336 != null) {
						this.field2336[this.field2348] = var10.field2336[var11];
					}
					if (var5) {
						if (var10.field2332 == null) {
							this.field2332[this.field2348] = -1;
						} else {
							this.field2332[this.field2348] = var10.field2332[var11];
						}
					}
					if (var6) {
						if (var10.field2339 == null || var10.field2339[var11] == -1) {
							this.field2339[this.field2348] = -1;
						} else {
							this.field2339[this.field2348] = (byte) (var10.field2339[var11] + this.field2334);
						}
					}
					this.field2348++;
				}
				for (int var12 = 0; var12 < var10.field2334; var12++) {
					this.field2350[this.field2334] = var10.field2350[var12] + this.field2347;
					this.field2335[this.field2334] = var10.field2335[var12] + this.field2347;
					this.field2326[this.field2334] = var10.field2326[var12] + this.field2347;
					this.field2334++;
				}
				for (int var13 = 0; var13 < var10.field2347; var13++) {
					this.field2337[this.field2347] = var10.field2337[var13];
					this.field2321[this.field2347] = var10.field2321[var13];
					this.field2330[this.field2347] = var10.field2330[var13];
					this.field2347++;
				}
			}
		}
	}

	@ObfuscatedName("od.e(I)V")
	public void method798(int arg0) {
		if (field2370[arg0]) {
			this.method818(arg0);
			return;
		}
		int var2 = this.field2338[arg0];
		int var3 = this.field2333[arg0];
		int var4 = this.field2346[arg0];
		Pix3D.field117 = field2376[arg0];
		if (this.field2336 == null) {
			Pix3D.field128 = 0;
		} else {
			Pix3D.field128 = this.field2336[arg0] & 0xFF;
		}
		if (this.field2332 != null && this.field2332[arg0] != -1) {
			int var6;
			int var7;
			int var8;
			if (this.field2339 == null || this.field2339[arg0] == -1) {
				var6 = var2;
				var7 = var3;
				var8 = var4;
			} else {
				int var5 = this.field2339[arg0] & 0xFF;
				var6 = this.field2350[var5];
				var7 = this.field2335[var5];
				var8 = this.field2326[var5];
			}
			if (this.field2325[arg0] == -1) {
				Pix3D.method39(field2364[var2], field2364[var3], field2364[var4], field2372[var2], field2372[var3], field2372[var4], this.field2345[arg0], this.field2345[arg0], this.field2345[arg0], field2371[var6], field2371[var7], field2371[var8], field2356[var6], field2356[var7], field2356[var8], field2375[var6], field2375[var7], field2375[var8], this.field2332[arg0]);
			} else {
				Pix3D.method39(field2364[var2], field2364[var3], field2364[var4], field2372[var2], field2372[var3], field2372[var4], this.field2345[arg0], this.field2327[arg0], this.field2325[arg0], field2371[var6], field2371[var7], field2371[var8], field2356[var6], field2356[var7], field2356[var8], field2375[var6], field2375[var7], field2375[var8], this.field2332[arg0]);
			}
		} else if (this.field2325[arg0] == -1) {
			Pix3D.method38(field2364[var2], field2364[var3], field2364[var4], field2372[var2], field2372[var3], field2372[var4], field2369[this.field2345[arg0]]);
		} else {
			Pix3D.method33(field2364[var2], field2364[var3], field2364[var4], field2372[var2], field2372[var3], field2372[var4], this.field2345[arg0], this.field2327[arg0], this.field2325[arg0]);
		}
	}

	@ObfuscatedName("od.b(Z)Lod;")
	public ModelLit method799(boolean arg0) {
		if (!arg0 && field2342.length < this.field2348) {
			field2342 = new byte[this.field2348 + 100];
		}
		return this.method800(arg0, field2331, field2342);
	}

	@ObfuscatedName("od.a(IIIIIIIII)V")
	@Override
	public void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field2355[0] = -1;
		if (this.field2340 != 1) {
			this.calcBoundingCylinder();
		}
		int var10 = arg7 * arg4 - arg5 * arg3 >> 16;
		int var11 = arg6 * arg1 + var10 * arg2 >> 16;
		int var12 = this.field2329 * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg7 * arg3 + arg5 * arg4 >> 16;
		int var15 = var14 - this.field2329 << 9;
		if (var15 / var13 >= Pix3D.maxX) {
			return;
		}
		int var16 = var14 + this.field2329 << 9;
		if (var16 / var13 <= Pix3D.minX) {
			return;
		}
		int var17 = arg6 * arg2 - var10 * arg1 >> 16;
		int var18 = this.field2329 * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= Pix3D.minY) {
			return;
		}
		int var20 = var18 + (super.minY * arg2 >> 16);
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix3D.maxY) {
			return;
		}
		int var22 = var12 + (super.minY * arg1 >> 16);
		boolean var23 = false;
		boolean var24 = false;
		if (var11 - var22 <= 50) {
			var24 = true;
		}
		boolean var25 = var24 || this.field2334 > 0;
		boolean var26 = false;
		if (arg8 > 0 && field2373) {
			int var27 = var11 - var12;
			if (var27 <= 50) {
				var27 = 50;
			}
			int var28;
			int var29;
			if (var14 > 0) {
				var28 = var15 / var13;
				var29 = var16 / var27;
			} else {
				var29 = var16 / var13;
				var28 = var15 / var27;
			}
			int var30;
			int var31;
			if (var17 > 0) {
				var30 = var21 / var13;
				var31 = var19 / var27;
			} else {
				var31 = var19 / var13;
				var30 = var21 / var27;
			}
			int var32 = field2362 - Pix3D.originX;
			int var33 = field2363 - Pix3D.originY;
			if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
				if (this.useAABBMouseCheck) {
					field2367[field2382++] = arg8;
				} else {
					var26 = true;
				}
			}
		}
		int var34 = Pix3D.originX;
		int var35 = Pix3D.originY;
		int var36 = 0;
		int var37 = 0;
		if (arg0 != 0) {
			var36 = field2361[arg0];
			var37 = field2380[arg0];
		}
		for (int var38 = 0; var38 < this.field2347; var38++) {
			int var39 = this.field2337[var38];
			int var40 = this.field2321[var38];
			int var41 = this.field2330[var38];
			if (arg0 != 0) {
				int var42 = var41 * var36 + var39 * var37 >> 16;
				var41 = var41 * var37 - var39 * var36 >> 16;
				var39 = var42;
			}
			int var43 = var39 + arg5;
			int var44 = var40 + arg6;
			int var45 = var41 + arg7;
			int var46 = var45 * arg3 + var43 * arg4 >> 16;
			int var47 = var45 * arg4 - var43 * arg3 >> 16;
			int var49 = var44 * arg2 - var47 * arg1 >> 16;
			int var50 = var44 * arg1 + var47 * arg2 >> 16;
			field2359[var38] = var50 - var11;
			if (var50 >= 50) {
				field2372[var38] = var34 + (var46 << 9) / var50;
				field2364[var38] = var35 + (var49 << 9) / var50;
			} else {
				field2372[var38] = -5000;
				var23 = true;
			}
			if (var25) {
				field2371[var38] = var46;
				field2356[var38] = var49;
				field2375[var38] = var50;
			}
		}
		try {
			this.method806(var23, var26, arg8);
		} catch (Exception var51) {
		}
	}

	@ObfuscatedName("od.a(ZLod;[B)Lod;")
	public ModelLit method800(boolean arg0, ModelLit arg1, byte[] arg2) {
		arg1.field2347 = this.field2347;
		arg1.field2348 = this.field2348;
		arg1.field2334 = this.field2334;
		if (arg1.field2337 == null || arg1.field2337.length < this.field2347) {
			arg1.field2337 = new int[this.field2347 + 100];
			arg1.field2321 = new int[this.field2347 + 100];
			arg1.field2330 = new int[this.field2347 + 100];
		}
		for (int var4 = 0; var4 < this.field2347; var4++) {
			arg1.field2337[var4] = this.field2337[var4];
			arg1.field2321[var4] = this.field2321[var4];
			arg1.field2330[var4] = this.field2330[var4];
		}
		if (arg0) {
			arg1.field2336 = this.field2336;
		} else {
			arg1.field2336 = arg2;
			if (this.field2336 == null) {
				for (int var5 = 0; var5 < this.field2348; var5++) {
					arg1.field2336[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.field2348; var6++) {
					arg1.field2336[var6] = this.field2336[var6];
				}
			}
		}
		arg1.field2338 = this.field2338;
		arg1.field2333 = this.field2333;
		arg1.field2346 = this.field2346;
		arg1.field2345 = this.field2345;
		arg1.field2327 = this.field2327;
		arg1.field2325 = this.field2325;
		arg1.field2349 = this.field2349;
		arg1.field2339 = this.field2339;
		arg1.field2332 = this.field2332;
		arg1.field2328 = this.field2328;
		arg1.field2350 = this.field2350;
		arg1.field2335 = this.field2335;
		arg1.field2326 = this.field2326;
		arg1.field2344 = this.field2344;
		arg1.field2324 = this.field2324;
		arg1.useAABBMouseCheck = this.useAABBMouseCheck;
		arg1.field2340 = 0;
		return arg1;
	}

	@ObfuscatedName("od.a()V")
	public void rotate90() {
		for (int var1 = 0; var1 < this.field2347; var1++) {
			int var2 = this.field2337[var1];
			this.field2337[var1] = this.field2330[var1];
			this.field2330[var1] = -var2;
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.f(I)V")
	public void rotateXAxis(int arg0) {
		int var2 = field2361[arg0];
		int var3 = field2380[arg0];
		for (int var4 = 0; var4 < this.field2347; var4++) {
			int var5 = this.field2321[var4] * var3 - this.field2330[var4] * var2 >> 16;
			this.field2330[var4] = this.field2321[var4] * var2 + this.field2330[var4] * var3 >> 16;
			this.field2321[var4] = var5;
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.b()V")
	public void method803() {
		for (int var1 = 0; var1 < this.field2347; var1++) {
			this.field2337[var1] = -this.field2337[var1];
			this.field2330[var1] = -this.field2330[var1];
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.c()V")
	public void calcBoundingCylinder() {
		if (this.field2340 == 1) {
			return;
		}
		this.field2340 = 1;
		super.minY = 0;
		this.field2343 = 0;
		this.field2329 = 0;
		for (int var1 = 0; var1 < this.field2347; var1++) {
			int var2 = this.field2337[var1];
			int var3 = this.field2321[var1];
			int var4 = this.field2330[var1];
			if (-var3 > super.minY) {
				super.minY = -var3;
			}
			if (var3 > this.field2343) {
				this.field2343 = var3;
			}
			int var5 = var2 * var2 + var4 * var4;
			if (var5 > this.field2329) {
				this.field2329 = var5;
			}
		}
		this.field2329 = (int) (Math.sqrt((double) this.field2329) + 0.99D);
		this.field2323 = (int) (Math.sqrt((double) (this.field2329 * this.field2329 + super.minY * super.minY)) + 0.99D);
		this.field2341 = this.field2323 + (int) (Math.sqrt((double) (this.field2329 * this.field2329 + this.field2343 * this.field2343)) + 0.99D);
	}

	@ObfuscatedName("od.b(III)V")
	public void method805(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2347; var4++) {
			this.field2337[var4] = this.field2337[var4] * arg0 / 128;
			this.field2321[var4] = this.field2321[var4] * arg1 / 128;
			this.field2330[var4] = this.field2330[var4] * arg2 / 128;
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.a(ZZI)V")
	public void method806(boolean arg0, boolean arg1, int arg2) {
		if (this.field2341 >= 1600) {
			return;
		}
		for (int var4 = 0; var4 < this.field2341; var4++) {
			field2355[var4] = 0;
		}
		for (int var5 = 0; var5 < this.field2348; var5++) {
			if (this.field2325[var5] != -2) {
				int var6 = this.field2338[var5];
				int var7 = this.field2333[var5];
				int var8 = this.field2346[var5];
				int var9 = field2372[var6];
				int var10 = field2372[var7];
				int var11 = field2372[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					int var12 = field2371[var6];
					int var13 = field2371[var7];
					int var14 = field2371[var8];
					int var15 = field2356[var6];
					int var16 = field2356[var7];
					int var17 = field2356[var8];
					int var18 = field2375[var6];
					int var19 = field2375[var7];
					int var20 = field2375[var8];
					int var21 = var12 - var13;
					int var22 = var14 - var13;
					int var23 = var15 - var16;
					int var24 = var17 - var16;
					int var25 = var18 - var19;
					int var26 = var20 - var19;
					int var27 = var23 * var26 - var25 * var24;
					int var28 = var25 * var22 - var21 * var26;
					int var29 = var21 * var24 - var23 * var22;
					if (var13 * var27 + var16 * var28 + var19 * var29 > 0) {
						field2370[var5] = true;
						int var30 = (field2359[var6] + field2359[var7] + field2359[var8]) / 3 + this.field2323;
						field2374[var30][field2355[var30]++] = var5;
					}
				} else {
					if (arg1 && this.method811(field2362, field2363, field2364[var6], field2364[var7], field2364[var8], var9, var10, var11)) {
						field2367[field2382++] = arg2;
						arg1 = false;
					}
					if ((var9 - var10) * (field2364[var8] - field2364[var7]) - (field2364[var6] - field2364[var7]) * (var11 - var10) > 0) {
						field2370[var5] = false;
						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix3D.sizeX && var10 <= Pix3D.sizeX && var11 <= Pix3D.sizeX) {
							field2376[var5] = false;
						} else {
							field2376[var5] = true;
						}
						int var31 = (field2359[var6] + field2359[var7] + field2359[var8]) / 3 + this.field2323;
						field2374[var31][field2355[var31]++] = var5;
					}
				}
			}
		}
		if (this.field2349 == null) {
			for (int var32 = this.field2341 - 1; var32 >= 0; var32--) {
				int var33 = field2355[var32];
				if (var33 > 0) {
					int[] var34 = field2374[var32];
					for (int var35 = 0; var35 < var33; var35++) {
						this.method798(var34[var35]);
					}
				}
			}
			return;
		}
		for (int var36 = 0; var36 < 12; var36++) {
			field2378[var36] = 0;
			field2353[var36] = 0;
		}
		for (int var37 = this.field2341 - 1; var37 >= 0; var37--) {
			int var38 = field2355[var37];
			if (var38 > 0) {
				int[] var39 = field2374[var37];
				for (int var40 = 0; var40 < var38; var40++) {
					int var41 = var39[var40];
					byte var42 = this.field2349[var41];
					int var43 = field2378[var42]++;
					field2377[var42][var43] = var41;
					if (var42 < 10) {
						field2353[var42] += var37;
					} else if (var42 == 10) {
						field2368[var43] = var37;
					} else {
						field2357[var43] = var37;
					}
				}
			}
		}
		int var44 = 0;
		if (field2378[1] > 0 || field2378[2] > 0) {
			var44 = (field2353[1] + field2353[2]) / (field2378[1] + field2378[2]);
		}
		int var45 = 0;
		if (field2378[3] > 0 || field2378[4] > 0) {
			var45 = (field2353[3] + field2353[4]) / (field2378[3] + field2378[4]);
		}
		int var46 = 0;
		if (field2378[6] > 0 || field2378[8] > 0) {
			var46 = (field2353[6] + field2353[8]) / (field2378[6] + field2378[8]);
		}
		int var47 = 0;
		int var48 = field2378[10];
		int[] var49 = field2377[10];
		int[] var50 = field2368;
		if (var48 == 0) {
			var47 = 0;
			var48 = field2378[11];
			var49 = field2377[11];
			var50 = field2357;
		}
		int var51;
		if (var48 > 0) {
			var51 = var50[0];
		} else {
			var51 = -1000;
		}
		for (int var52 = 0; var52 < 10; var52++) {
			while (var52 == 0 && var51 > var44) {
				this.method798(var49[var47++]);
				if (var47 == var48 && var49 != field2377[11]) {
					var47 = 0;
					var48 = field2378[11];
					var49 = field2377[11];
					var50 = field2357;
				}
				if (var47 < var48) {
					var51 = var50[var47];
				} else {
					var51 = -1000;
				}
			}
			while (var52 == 3 && var51 > var45) {
				this.method798(var49[var47++]);
				if (var47 == var48 && var49 != field2377[11]) {
					var47 = 0;
					var48 = field2378[11];
					var49 = field2377[11];
					var50 = field2357;
				}
				if (var47 < var48) {
					var51 = var50[var47];
				} else {
					var51 = -1000;
				}
			}
			while (var52 == 5 && var51 > var46) {
				this.method798(var49[var47++]);
				if (var47 == var48 && var49 != field2377[11]) {
					var47 = 0;
					var48 = field2378[11];
					var49 = field2377[11];
					var50 = field2357;
				}
				if (var47 < var48) {
					var51 = var50[var47];
				} else {
					var51 = -1000;
				}
			}
			int var53 = field2378[var52];
			int[] var54 = field2377[var52];
			for (int var55 = 0; var55 < var53; var55++) {
				this.method798(var54[var55]);
			}
		}
		while (var51 != -1000) {
			this.method798(var49[var47++]);
			if (var47 == var48 && var49 != field2377[11]) {
				var47 = 0;
				var49 = field2377[11];
				var48 = field2378[11];
				var50 = field2357;
			}
			if (var47 < var48) {
				var51 = var50[var47];
			} else {
				var51 = -1000;
			}
		}
	}

	@ObfuscatedName("od.d()V")
	public void method807() {
		if (this.field2340 == 2) {
			return;
		}
		this.field2340 = 2;
		this.field2329 = 0;
		for (int var1 = 0; var1 < this.field2347; var1++) {
			int var2 = this.field2337[var1];
			int var3 = this.field2321[var1];
			int var4 = this.field2330[var1];
			int var5 = var2 * var2 + var4 * var4 + var3 * var3;
			if (var5 > this.field2329) {
				this.field2329 = var5;
			}
		}
		this.field2329 = (int) (Math.sqrt((double) this.field2329) + 0.99D);
		this.field2323 = this.field2329;
		this.field2341 = this.field2329 + this.field2329;
	}

	@ObfuscatedName("od.a([[IIIIZI)Lod;")
	public ModelLit method808(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		this.calcBoundingCylinder();
		int var7 = arg1 - this.field2329;
		int var8 = arg1 + this.field2329;
		int var9 = arg3 - this.field2329;
		int var10 = arg3 + this.field2329;
		if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		int var11 = var7 >> 7;
		int var12 = var8 + 127 >> 7;
		int var13 = var9 >> 7;
		int var14 = var10 + 127 >> 7;
		if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
			return this;
		}
		ModelLit var15;
		if (arg4) {
			var15 = new ModelLit();
			var15.field2347 = this.field2347;
			var15.field2348 = this.field2348;
			var15.field2334 = this.field2334;
			var15.field2337 = this.field2337;
			var15.field2330 = this.field2330;
			var15.field2338 = this.field2338;
			var15.field2333 = this.field2333;
			var15.field2346 = this.field2346;
			var15.field2345 = this.field2345;
			var15.field2327 = this.field2327;
			var15.field2325 = this.field2325;
			var15.field2349 = this.field2349;
			var15.field2336 = this.field2336;
			var15.field2339 = this.field2339;
			var15.field2332 = this.field2332;
			var15.field2328 = this.field2328;
			var15.field2350 = this.field2350;
			var15.field2335 = this.field2335;
			var15.field2326 = this.field2326;
			var15.field2344 = this.field2344;
			var15.field2324 = this.field2324;
			var15.useAABBMouseCheck = this.useAABBMouseCheck;
			var15.field2321 = new int[var15.field2347];
		} else {
			var15 = this;
		}
		if (arg5 == 0) {
			for (int var16 = 0; var16 < var15.field2347; var16++) {
				int var17 = this.field2337[var16] + arg1;
				int var18 = this.field2330[var16] + arg3;
				int var19 = var17 & 0x7F;
				int var20 = var18 & 0x7F;
				int var21 = var17 >> 7;
				int var22 = var18 >> 7;
				int var23 = arg0[var21][var22] * (128 - var19) + arg0[var21 + 1][var22] * var19 >> 7;
				int var24 = arg0[var21][var22 + 1] * (128 - var19) + arg0[var21 + 1][var22 + 1] * var19 >> 7;
				int var25 = var23 * (128 - var20) + var24 * var20 >> 7;
				var15.field2321[var16] = this.field2321[var16] + var25 - arg2;
			}
		} else {
			for (int var26 = 0; var26 < var15.field2347; var26++) {
				int var27 = (-this.field2321[var26] << 16) / super.minY;
				if (var27 < arg5) {
					int var28 = this.field2337[var26] + arg1;
					int var29 = this.field2330[var26] + arg3;
					int var30 = var28 & 0x7F;
					int var31 = var29 & 0x7F;
					int var32 = var28 >> 7;
					int var33 = var29 >> 7;
					int var34 = arg0[var32][var33] * (128 - var30) + arg0[var32 + 1][var33] * var30 >> 7;
					int var35 = arg0[var32][var33 + 1] * (128 - var30) + arg0[var32 + 1][var33 + 1] * var30 >> 7;
					int var36 = var34 * (128 - var31) + var35 * var31 >> 7;
					var15.field2321[var26] = this.field2321[var26] + (var36 - arg2) * (arg5 - var27) / arg5;
				}
			}
		}
		var15.field2340 = 0;
		return var15;
	}

	@ObfuscatedName("od.a(IIIIIIII)V")
	public void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field2355[0] = -1;
		if (this.field2340 != 2 && this.field2340 != 1) {
			this.method807();
		}
		int var8 = Pix3D.originX;
		int var9 = Pix3D.originY;
		int var10 = field2361[0];
		int var11 = field2380[0];
		int var12 = field2361[arg0];
		int var13 = field2380[arg0];
		int var14 = field2361[arg1];
		int var15 = field2380[arg1];
		int var16 = field2361[arg2];
		int var17 = field2380[arg2];
		int var18 = arg4 * var16 + arg5 * var17 >> 16;
		for (int var19 = 0; var19 < this.field2347; var19++) {
			int var20 = this.field2337[var19];
			int var21 = this.field2321[var19];
			int var22 = this.field2330[var19];
			if (arg1 != 0) {
				int var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}
			if (arg0 != 0) {
				int var24 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var24;
			}
			int var25 = var20 + arg3;
			int var26 = var21 + arg4;
			int var27 = var22 + arg5;
			int var28 = var26 * var17 - var27 * var16 >> 16;
			int var29 = var26 * var16 + var27 * var17 >> 16;
			field2359[var19] = var29 - var18;
			field2372[var19] = var8 + (var25 << 9) / arg6;
			field2364[var19] = var9 + (var28 << 9) / arg6;
			if (this.field2334 > 0) {
				field2371[var19] = var25;
				field2356[var19] = var28;
				field2375[var19] = var29;
			}
		}
		try {
			this.method806(false, false, 0);
		} catch (Exception var30) {
		}
	}

	@ObfuscatedName("od.a(Lrc;I)V")
	public void method810(AnimFrameSet arg0, int arg1) {
		if (this.field2344 == null || arg1 == -1) {
			return;
		}
		AnimFrame var3 = arg0.list[arg1];
		AnimBase var4 = var3.base;
		field2366 = 0;
		field2358 = 0;
		field2379 = 0;
		for (int var5 = 0; var5 < var3.size; var5++) {
			int var6 = var3.ti[var5];
			this.method819(var4.type[var6], var4.labels[var6], var3.tx[var5], var3.ty[var5], var3.tz[var5]);
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.b(IIIIIIII)Z")
	public boolean method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@ObfuscatedName("od.e()V")
	public void method812() {
		for (int var1 = 0; var1 < this.field2347; var1++) {
			int var2 = this.field2330[var1];
			this.field2330[var1] = this.field2337[var1];
			this.field2337[var1] = -var2;
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.a(IIIIIII)V")
	public void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		field2355[0] = -1;
		if (this.field2340 != 2 && this.field2340 != 1) {
			this.method807();
		}
		int var7 = Pix3D.originX;
		int var8 = Pix3D.originY;
		int var9 = field2361[0];
		int var10 = field2380[0];
		int var11 = field2361[arg0];
		int var12 = field2380[arg0];
		int var13 = field2361[arg1];
		int var14 = field2380[arg1];
		int var15 = field2361[arg2];
		int var16 = field2380[arg2];
		int var17 = arg4 * var15 + arg5 * var16 >> 16;
		for (int var18 = 0; var18 < this.field2347; var18++) {
			int var19 = this.field2337[var18];
			int var20 = this.field2321[var18];
			int var21 = this.field2330[var18];
			if (arg1 != 0) {
				int var22 = var20 * var13 + var19 * var14 >> 16;
				var20 = var20 * var14 - var19 * var13 >> 16;
				var19 = var22;
			}
			if (arg0 != 0) {
				int var23 = var21 * var11 + var19 * var12 >> 16;
				var21 = var21 * var12 - var19 * var11 >> 16;
				var19 = var23;
			}
			int var24 = var19 + arg3;
			int var25 = var20 + arg4;
			int var26 = var21 + arg5;
			int var27 = var25 * var16 - var26 * var15 >> 16;
			int var28 = var25 * var15 + var26 * var16 >> 16;
			field2359[var18] = var28 - var17;
			field2372[var18] = var7 + (var24 << 9) / var28;
			field2364[var18] = var8 + (var27 << 9) / var28;
			if (this.field2334 > 0) {
				field2371[var18] = var24;
				field2356[var18] = var27;
				field2375[var18] = var28;
			}
		}
		try {
			this.method806(false, false, 0);
		} catch (Exception var29) {
		}
	}

	@ObfuscatedName("od.a(Lrc;ILrc;I[I)V")
	public void method814(AnimFrameSet arg0, int arg1, AnimFrameSet arg2, int arg3, int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method810(arg0, arg1);
			return;
		}
		AnimFrame var6 = arg0.list[arg1];
		AnimFrame var7 = arg2.list[arg3];
		AnimBase var8 = var6.base;
		field2366 = 0;
		field2358 = 0;
		field2379 = 0;
		byte var9 = 0;
		int var17 = var9 + 1;
		int var10 = arg4[0];
		for (int var11 = 0; var11 < var6.size; var11++) {
			int var12 = var6.ti[var11];
			while (var12 > var10) {
				var10 = arg4[var17++];
			}
			if (var12 != var10 || var8.type[var12] == 0) {
				this.method819(var8.type[var12], var8.labels[var12], var6.tx[var11], var6.ty[var11], var6.tz[var11]);
			}
		}
		field2366 = 0;
		field2358 = 0;
		field2379 = 0;
		byte var13 = 0;
		int var18 = var13 + 1;
		int var14 = arg4[0];
		for (int var15 = 0; var15 < var7.size; var15++) {
			int var16 = var7.ti[var15];
			while (var16 > var14) {
				var14 = arg4[var18++];
			}
			if (var16 == var14 || var8.type[var16] == 0) {
				this.method819(var8.type[var16], var8.labels[var16], var7.tx[var15], var7.ty[var15], var7.tz[var15]);
			}
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.g()I")
	public int method816() {
		this.calcBoundingCylinder();
		return this.field2329;
	}

	@ObfuscatedName("od.c(III)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2347; var4++) {
			this.field2337[var4] += arg0;
			this.field2321[var4] += arg1;
			this.field2330[var4] += arg2;
		}
		this.field2340 = 0;
	}

	@ObfuscatedName("od.g(I)V")
	public void method818(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
		int var4 = 0;
		int var5 = this.field2338[arg0];
		int var6 = this.field2333[arg0];
		int var7 = this.field2346[arg0];
		int var8 = field2375[var5];
		int var9 = field2375[var6];
		int var10 = field2375[var7];
		if (this.field2336 == null) {
			Pix3D.field128 = 0;
		} else {
			Pix3D.field128 = this.field2336[arg0] & 0xFF;
		}
		if (var8 >= 50) {
			field2360[0] = field2372[var5];
			field2354[0] = field2364[var5];
			var4++;
			field2365[0] = this.field2345[arg0];
		} else {
			int var11 = field2371[var5];
			int var12 = field2356[var5];
			int var13 = this.field2345[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field2352[var10 - var8];
				field2360[0] = var2 + (var11 + ((field2371[var7] - var11) * var14 >> 16) << 9) / 50;
				field2354[0] = var3 + (var12 + ((field2356[var7] - var12) * var14 >> 16) << 9) / 50;
				var4++;
				field2365[0] = var13 + ((this.field2325[arg0] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * field2352[var9 - var8];
				field2360[var4] = var2 + (var11 + ((field2371[var6] - var11) * var15 >> 16) << 9) / 50;
				field2354[var4] = var3 + (var12 + ((field2356[var6] - var12) * var15 >> 16) << 9) / 50;
				field2365[var4++] = var13 + ((this.field2327[arg0] - var13) * var15 >> 16);
			}
		}
		if (var9 >= 50) {
			field2360[var4] = field2372[var6];
			field2354[var4] = field2364[var6];
			field2365[var4++] = this.field2327[arg0];
		} else {
			int var16 = field2371[var6];
			int var17 = field2356[var6];
			int var18 = this.field2327[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field2352[var8 - var9];
				field2360[var4] = var2 + (var16 + ((field2371[var5] - var16) * var19 >> 16) << 9) / 50;
				field2354[var4] = var3 + (var17 + ((field2356[var5] - var17) * var19 >> 16) << 9) / 50;
				field2365[var4++] = var18 + ((this.field2345[arg0] - var18) * var19 >> 16);
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * field2352[var10 - var9];
				field2360[var4] = var2 + (var16 + ((field2371[var7] - var16) * var20 >> 16) << 9) / 50;
				field2354[var4] = var3 + (var17 + ((field2356[var7] - var17) * var20 >> 16) << 9) / 50;
				field2365[var4++] = var18 + ((this.field2325[arg0] - var18) * var20 >> 16);
			}
		}
		if (var10 >= 50) {
			field2360[var4] = field2372[var7];
			field2354[var4] = field2364[var7];
			field2365[var4++] = this.field2325[arg0];
		} else {
			int var21 = field2371[var7];
			int var22 = field2356[var7];
			int var23 = this.field2325[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field2352[var9 - var10];
				field2360[var4] = var2 + (var21 + ((field2371[var6] - var21) * var24 >> 16) << 9) / 50;
				field2354[var4] = var3 + (var22 + ((field2356[var6] - var22) * var24 >> 16) << 9) / 50;
				field2365[var4++] = var23 + ((this.field2327[arg0] - var23) * var24 >> 16);
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * field2352[var8 - var10];
				field2360[var4] = var2 + (var21 + ((field2371[var5] - var21) * var25 >> 16) << 9) / 50;
				field2354[var4] = var3 + (var22 + ((field2356[var5] - var22) * var25 >> 16) << 9) / 50;
				field2365[var4++] = var23 + ((this.field2345[arg0] - var23) * var25 >> 16);
			}
		}
		int var26 = field2360[0];
		int var27 = field2360[1];
		int var28 = field2360[2];
		int var29 = field2354[0];
		int var30 = field2354[1];
		int var31 = field2354[2];
		Pix3D.field117 = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.sizeX || var27 > Pix3D.sizeX || var28 > Pix3D.sizeX) {
				Pix3D.field117 = true;
			}
			if (this.field2332 != null && this.field2332[arg0] != -1) {
				int var33;
				int var34;
				int var35;
				if (this.field2339 == null || this.field2339[arg0] == -1) {
					var33 = var5;
					var34 = var6;
					var35 = var7;
				} else {
					int var32 = this.field2339[arg0] & 0xFF;
					var33 = this.field2350[var32];
					var34 = this.field2335[var32];
					var35 = this.field2326[var32];
				}
				if (this.field2325[arg0] == -1) {
					Pix3D.method39(var29, var30, var31, var26, var27, var28, this.field2345[arg0], this.field2345[arg0], this.field2345[arg0], field2371[var33], field2371[var34], field2371[var35], field2356[var33], field2356[var34], field2356[var35], field2375[var33], field2375[var34], field2375[var35], this.field2332[arg0]);
				} else {
					Pix3D.method39(var29, var30, var31, var26, var27, var28, field2365[0], field2365[1], field2365[2], field2371[var33], field2371[var34], field2371[var35], field2356[var33], field2356[var34], field2356[var35], field2375[var33], field2375[var34], field2375[var35], this.field2332[arg0]);
				}
			} else if (this.field2325[arg0] == -1) {
				Pix3D.method38(var29, var30, var31, var26, var27, var28, field2369[this.field2345[arg0]]);
			} else {
				Pix3D.method33(var29, var30, var31, var26, var27, var28, field2365[0], field2365[1], field2365[2]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.sizeX || var27 > Pix3D.sizeX || var28 > Pix3D.sizeX || field2360[3] < 0 || field2360[3] > Pix3D.sizeX) {
			Pix3D.field117 = true;
		}
		if (this.field2332 == null || this.field2332[arg0] == -1) {
			if (this.field2325[arg0] == -1) {
				int var36 = field2369[this.field2345[arg0]];
				Pix3D.method38(var29, var30, var31, var26, var27, var28, var36);
				Pix3D.method38(var29, var31, field2354[3], var26, var28, field2360[3], var36);
				return;
			}
			Pix3D.method33(var29, var30, var31, var26, var27, var28, field2365[0], field2365[1], field2365[2]);
			Pix3D.method33(var29, var31, field2354[3], var26, var28, field2360[3], field2365[0], field2365[2], field2365[3]);
			return;
		}
		int var38;
		int var39;
		int var40;
		if (this.field2339 == null || this.field2339[arg0] == -1) {
			var38 = var5;
			var39 = var6;
			var40 = var7;
		} else {
			int var37 = this.field2339[arg0] & 0xFF;
			var38 = this.field2350[var37];
			var39 = this.field2335[var37];
			var40 = this.field2326[var37];
		}
		short var41 = this.field2332[arg0];
		if (this.field2325[arg0] == -1) {
			Pix3D.method39(var29, var30, var31, var26, var27, var28, this.field2345[arg0], this.field2345[arg0], this.field2345[arg0], field2371[var38], field2371[var39], field2371[var40], field2356[var38], field2356[var39], field2356[var40], field2375[var38], field2375[var39], field2375[var40], var41);
			Pix3D.method39(var29, var31, field2354[3], var26, var28, field2360[3], this.field2345[arg0], this.field2345[arg0], this.field2345[arg0], field2371[var38], field2371[var39], field2371[var40], field2356[var38], field2356[var39], field2356[var40], field2375[var38], field2375[var39], field2375[var40], var41);
			return;
		}
		Pix3D.method39(var29, var30, var31, var26, var27, var28, field2365[0], field2365[1], field2365[2], field2371[var38], field2371[var39], field2371[var40], field2356[var38], field2356[var39], field2356[var40], field2375[var38], field2375[var39], field2375[var40], var41);
		Pix3D.method39(var29, var31, field2354[3], var26, var28, field2360[3], field2365[0], field2365[2], field2365[3], field2371[var38], field2371[var39], field2371[var40], field2356[var38], field2356[var39], field2356[var40], field2375[var38], field2375[var39], field2375[var40], var41);
	}

	@ObfuscatedName("od.a(I[IIII)V")
	public void method819(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field2366 = 0;
			field2358 = 0;
			field2379 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.field2344.length) {
					int[] var10 = this.field2344[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field2366 += this.field2337[var12];
						field2358 += this.field2321[var12];
						field2379 += this.field2330[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				field2366 = field2366 / var7 + arg2;
				field2358 = field2358 / var7 + arg3;
				field2379 = field2379 / var7 + arg4;
			} else {
				field2366 = arg2;
				field2358 = arg3;
				field2379 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.field2344.length) {
					int[] var15 = this.field2344[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.field2337[var17] += arg2;
						this.field2321[var17] += arg3;
						this.field2330[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.field2344.length) {
					int[] var20 = this.field2344[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.field2337[var22] -= field2366;
						this.field2321[var22] -= field2358;
						this.field2330[var22] -= field2379;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = field2361[var25];
							int var27 = field2380[var25];
							int var28 = this.field2321[var22] * var26 + this.field2337[var22] * var27 >> 16;
							this.field2321[var22] = this.field2321[var22] * var27 - this.field2337[var22] * var26 >> 16;
							this.field2337[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = field2361[var23];
							int var30 = field2380[var23];
							int var31 = this.field2321[var22] * var30 - this.field2330[var22] * var29 >> 16;
							this.field2330[var22] = this.field2321[var22] * var29 + this.field2330[var22] * var30 >> 16;
							this.field2321[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = field2361[var24];
							int var33 = field2380[var24];
							int var34 = this.field2330[var22] * var32 + this.field2337[var22] * var33 >> 16;
							this.field2330[var22] = this.field2330[var22] * var33 - this.field2337[var22] * var32 >> 16;
							this.field2337[var22] = var34;
						}
						this.field2337[var22] += field2366;
						this.field2321[var22] += field2358;
						this.field2330[var22] += field2379;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < this.field2344.length) {
					int[] var37 = this.field2344[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						this.field2337[var39] -= field2366;
						this.field2321[var39] -= field2358;
						this.field2330[var39] -= field2379;
						this.field2337[var39] = this.field2337[var39] * arg2 / 128;
						this.field2321[var39] = this.field2321[var39] * arg3 / 128;
						this.field2330[var39] = this.field2330[var39] * arg4 / 128;
						this.field2337[var39] += field2366;
						this.field2321[var39] += field2358;
						this.field2330[var39] += field2379;
					}
				}
			}
		} else if (arg0 == 5 && (this.field2324 != null && this.field2336 != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < this.field2324.length) {
					int[] var42 = this.field2324[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						int var45 = (this.field2336[var44] & 0xFF) + arg2 * 8;
						if (var45 < 0) {
							var45 = 0;
						} else if (var45 > 255) {
							var45 = 255;
						}
						this.field2336[var44] = (byte) var45;
					}
				}
			}
		}
	}

	@ObfuscatedName("od.c(Z)Lod;")
	public ModelLit method820(boolean arg0) {
		if (!arg0 && field2381.length < this.field2348) {
			field2381 = new byte[this.field2348 + 100];
		}
		return this.method800(arg0, field2351, field2381);
	}
}
