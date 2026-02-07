package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.class100;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("p")
public final class ModelUnlit extends ModelSource {

	@ObfuscatedName("p.ab")
	public int[] field2441;

	@ObfuscatedName("p.bb")
	public static int[] field2442 = Pix3D.field121;

	@ObfuscatedName("p.cb")
	public int field2443 = 0;

	@ObfuscatedName("p.db")
	public int[] field2444;

	@ObfuscatedName("p.eb")
	public static int field2445 = 0;

	@ObfuscatedName("p.fb")
	public short field2446;

	@ObfuscatedName("p.gb")
	public PointNormal[] field2447;

	@ObfuscatedName("p.hb")
	public static int[] field2448 = Pix3D.sinTable;

	@ObfuscatedName("p.ib")
	public byte[] field2449;

	@ObfuscatedName("p.jb")
	public int[] field2450;

	@ObfuscatedName("p.kb")
	public short[] field2451;

	@ObfuscatedName("p.lb")
	public short[] field2452;

	@ObfuscatedName("p.mb")
	public short[] field2453;

	@ObfuscatedName("p.nb")
	public short[] field2454;

	@ObfuscatedName("p.ob")
	public short[] field2455;

	@ObfuscatedName("p.pb")
	public int field2456;

	@ObfuscatedName("p.qb")
	public short field2457;

	@ObfuscatedName("p.rb")
	public short[] field2458;

	@ObfuscatedName("p.sb")
	public int[] field2459;

	@ObfuscatedName("p.tb")
	public PointNormal[] field2460;

	@ObfuscatedName("p.ub")
	public int field2461;

	@ObfuscatedName("p.vb")
	public byte field2462 = 0;

	@ObfuscatedName("p.wb")
	public int field2463;

	@ObfuscatedName("p.zb")
	public static int[] field2466 = new int[10000];

	@ObfuscatedName("p.Gb")
	public static int[] field2473 = new int[10000];

	@ObfuscatedName("p.Y")
	public boolean field2439 = false;

	@ObfuscatedName("p.yb")
	public int field2465 = 0;

	@ObfuscatedName("p.Z")
	public byte[] field2440;

	@ObfuscatedName("p.W")
	public byte[] field2437;

	@ObfuscatedName("p.Jb")
	public int[] field2476;

	@ObfuscatedName("p.X")
	public short[] field2438;

	@ObfuscatedName("p.V")
	public byte[] field2436;

	@ObfuscatedName("p.U")
	public int[] field2435;

	@ObfuscatedName("p.Nb")
	public int[] field2480;

	@ObfuscatedName("p.Fb")
	public int[] field2472;

	@ObfuscatedName("p.T")
	public short[] field2434;

	@ObfuscatedName("p.xb")
	public byte[] field2464;

	@ObfuscatedName("p.Kb")
	public short[] field2477;

	@ObfuscatedName("p.Hb")
	public short[] field2474;

	@ObfuscatedName("p.Cb")
	public byte[] field2469;

	@ObfuscatedName("p.Ab")
	public short[] field2467;

	@ObfuscatedName("p.Db")
	public int[][] field2470;

	@ObfuscatedName("p.Eb")
	public int[][] field2471;

	@ObfuscatedName("p.Lb")
	public FaceNormal[] field2478;

	@ObfuscatedName("p.Bb")
	public int field2468;

	@ObfuscatedName("p.Ib")
	public int field2475;

	@ObfuscatedName("p.Mb")
	public int field2479;

	@ObfuscatedName("p.a(Lea;II)Lp;")
	public static ModelUnlit method840(Js5 arg0, int arg1) {
		byte[] var2 = arg0.method206(arg1, 0);
		return var2 == null ? null : new ModelUnlit(var2);
	}

	@ObfuscatedName("p.b(II)I")
	public static int method846(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("p.a(Lp;Lp;IIIZ)V")
	public static void method848(ModelUnlit arg0, ModelUnlit arg1, int arg2, int arg3, int arg4, boolean arg5) {
		arg0.method843();
		arg0.method839();
		arg1.method843();
		arg1.method839();
		field2445++;
		int var6 = 0;
		int[] var7 = arg1.field2444;
		int var8 = arg1.field2443;
		for (int var9 = 0; var9 < arg0.field2443; var9++) {
			PointNormal var10 = arg0.field2447[var9];
			if (var10.w != 0) {
				int var11 = arg0.field2459[var9] - arg3;
				if (var11 <= arg1.field2475) {
					int var12 = arg0.field2444[var9] - arg2;
					if (var12 >= arg1.field2479 && var12 <= arg1.field2468) {
						int var13 = arg0.field2435[var9] - arg4;
						if (var13 >= arg1.field2456 && var13 <= arg1.field2463) {
							for (int var14 = 0; var14 < var8; var14++) {
								PointNormal var15 = arg1.field2447[var14];
								if (var12 == var7[var14] && var13 == arg1.field2435[var14] && var11 == arg1.field2459[var14] && var15.w != 0) {
									if (arg0.field2460 == null) {
										arg0.field2460 = new PointNormal[arg0.field2443];
									}
									if (arg1.field2460 == null) {
										arg1.field2460 = new PointNormal[var8];
									}
									PointNormal var16 = arg0.field2460[var9];
									if (var16 == null) {
										var16 = arg0.field2460[var9] = new PointNormal(var10);
									}
									PointNormal var17 = arg1.field2460[var14];
									if (var17 == null) {
										var17 = arg1.field2460[var14] = new PointNormal(var15);
									}
									var16.x += var15.x;
									var16.y += var15.y;
									var16.z += var15.z;
									var16.w += var15.w;
									var17.x += var10.x;
									var17.y += var10.y;
									var17.z += var10.z;
									var17.w += var10.w;
									var6++;
									field2473[var9] = field2445;
									field2466[var14] = field2445;
								}
							}
						}
					}
				}
			}
		}
		if (var6 < 3 || !arg5) {
			return;
		}
		for (int var18 = 0; var18 < arg0.field2465; var18++) {
			if (field2473[arg0.field2441[var18]] == field2445 && field2473[arg0.field2480[var18]] == field2445 && field2473[arg0.field2472[var18]] == field2445) {
				if (arg0.field2440 == null) {
					arg0.field2440 = new byte[arg0.field2465];
				}
				arg0.field2440[var18] = 2;
			}
		}
		for (int var19 = 0; var19 < arg1.field2465; var19++) {
			if (field2466[arg1.field2441[var19]] == field2445 && field2466[arg1.field2480[var19]] == field2445 && field2466[arg1.field2472[var19]] == field2445) {
				if (arg1.field2440 == null) {
					arg1.field2440 = new byte[arg1.field2465];
				}
				arg1.field2440[var19] = 2;
			}
		}
	}

	@ObfuscatedName("p.e(I)I")
	public static int method849(int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	public ModelUnlit() {
	}

	public ModelUnlit(byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method835(arg0);
		} else {
			this.method841(arg0);
		}
	}

	public ModelUnlit(ModelUnlit[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.field2443 = 0;
		this.field2465 = 0;
		this.field2461 = 0;
		this.field2462 = -1;
		for (int var9 = 0; var9 < arg1; var9++) {
			ModelUnlit var10 = arg0[var9];
			if (var10 != null) {
				this.field2443 += var10.field2443;
				this.field2465 += var10.field2465;
				this.field2461 += var10.field2461;
				if (var10.field2449 == null) {
					if (this.field2462 == -1) {
						this.field2462 = var10.field2462;
					}
					if (this.field2462 != var10.field2462) {
						var4 = true;
					}
				} else {
					var4 = true;
				}
				var3 |= var10.field2440 != null;
				var5 |= var10.field2437 != null;
				var6 |= var10.field2476 != null;
				var7 |= var10.field2438 != null;
				var8 |= var10.field2436 != null;
			}
		}
		this.field2444 = new int[this.field2443];
		this.field2459 = new int[this.field2443];
		this.field2435 = new int[this.field2443];
		this.field2450 = new int[this.field2443];
		this.field2441 = new int[this.field2465];
		this.field2480 = new int[this.field2465];
		this.field2472 = new int[this.field2465];
		if (var3) {
			this.field2440 = new byte[this.field2465];
		}
		if (var4) {
			this.field2449 = new byte[this.field2465];
		}
		if (var5) {
			this.field2437 = new byte[this.field2465];
		}
		if (var6) {
			this.field2476 = new int[this.field2465];
		}
		if (var7) {
			this.field2438 = new short[this.field2465];
		}
		if (var8) {
			this.field2436 = new byte[this.field2465];
		}
		this.field2434 = new short[this.field2465];
		if (this.field2461 > 0) {
			this.field2464 = new byte[this.field2461];
			this.field2477 = new short[this.field2461];
			this.field2451 = new short[this.field2461];
			this.field2453 = new short[this.field2461];
			this.field2474 = new short[this.field2461];
			this.field2454 = new short[this.field2461];
			this.field2458 = new short[this.field2461];
			this.field2455 = new short[this.field2461];
			this.field2469 = new byte[this.field2461];
			this.field2467 = new short[this.field2461];
			this.field2452 = new short[this.field2461];
		}
		this.field2443 = 0;
		this.field2465 = 0;
		this.field2461 = 0;
		for (int var11 = 0; var11 < arg1; var11++) {
			ModelUnlit var12 = arg0[var11];
			if (var12 != null) {
				for (int var13 = 0; var13 < var12.field2465; var13++) {
					if (var3 && var12.field2440 != null) {
						this.field2440[this.field2465] = var12.field2440[var13];
					}
					if (var4) {
						if (var12.field2449 == null) {
							this.field2449[this.field2465] = var12.field2462;
						} else {
							this.field2449[this.field2465] = var12.field2449[var13];
						}
					}
					if (var5 && var12.field2437 != null) {
						this.field2437[this.field2465] = var12.field2437[var13];
					}
					if (var6 && var12.field2476 != null) {
						this.field2476[this.field2465] = var12.field2476[var13];
					}
					if (var7) {
						if (var12.field2438 == null) {
							this.field2438[this.field2465] = -1;
						} else {
							this.field2438[this.field2465] = var12.field2438[var13];
						}
					}
					if (var8) {
						if (var12.field2436 == null || var12.field2436[var13] == -1) {
							this.field2436[this.field2465] = -1;
						} else {
							this.field2436[this.field2465] = (byte) (var12.field2436[var13] + this.field2461);
						}
					}
					this.field2434[this.field2465] = var12.field2434[var13];
					this.field2441[this.field2465] = this.method845(var12, var12.field2441[var13]);
					this.field2480[this.field2465] = this.method845(var12, var12.field2480[var13]);
					this.field2472[this.field2465] = this.method845(var12, var12.field2472[var13]);
					this.field2465++;
				}
				for (int var14 = 0; var14 < var12.field2461; var14++) {
					byte var15 = this.field2464[this.field2461] = var12.field2464[var14];
					if (var15 == 0) {
						this.field2477[this.field2461] = (short) this.method845(var12, var12.field2477[var14]);
						this.field2451[this.field2461] = (short) this.method845(var12, var12.field2451[var14]);
						this.field2453[this.field2461] = (short) this.method845(var12, var12.field2453[var14]);
					}
					if (var15 >= 1 && var15 <= 3) {
						this.field2477[this.field2461] = var12.field2477[var14];
						this.field2451[this.field2461] = var12.field2451[var14];
						this.field2453[this.field2461] = var12.field2453[var14];
						this.field2474[this.field2461] = var12.field2474[var14];
						this.field2454[this.field2461] = var12.field2454[var14];
						this.field2458[this.field2461] = var12.field2458[var14];
						this.field2455[this.field2461] = var12.field2455[var14];
						this.field2469[this.field2461] = var12.field2469[var14];
						this.field2467[this.field2461] = var12.field2467[var14];
					}
					if (var15 == 2) {
						this.field2452[this.field2461] = var12.field2452[var14];
					}
					this.field2461++;
				}
			}
		}
	}

	public ModelUnlit(ModelUnlit arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.field2443 = arg0.field2443;
		this.field2465 = arg0.field2465;
		this.field2461 = arg0.field2461;
		if (arg1) {
			this.field2444 = arg0.field2444;
			this.field2459 = arg0.field2459;
			this.field2435 = arg0.field2435;
		} else {
			this.field2444 = new int[this.field2443];
			this.field2459 = new int[this.field2443];
			this.field2435 = new int[this.field2443];
			for (int var6 = 0; var6 < this.field2443; var6++) {
				this.field2444[var6] = arg0.field2444[var6];
				this.field2459[var6] = arg0.field2459[var6];
				this.field2435[var6] = arg0.field2435[var6];
			}
		}
		if (arg2) {
			this.field2434 = arg0.field2434;
		} else {
			this.field2434 = new short[this.field2465];
			for (int var7 = 0; var7 < this.field2465; var7++) {
				this.field2434[var7] = arg0.field2434[var7];
			}
		}
		if (arg3 || arg0.field2438 == null) {
			this.field2438 = arg0.field2438;
		} else {
			this.field2438 = new short[this.field2465];
			for (int var8 = 0; var8 < this.field2465; var8++) {
				this.field2438[var8] = arg0.field2438[var8];
			}
		}
		this.field2437 = arg0.field2437;
		this.field2441 = arg0.field2441;
		this.field2480 = arg0.field2480;
		this.field2472 = arg0.field2472;
		this.field2440 = arg0.field2440;
		this.field2449 = arg0.field2449;
		this.field2436 = arg0.field2436;
		this.field2462 = arg0.field2462;
		this.field2464 = arg0.field2464;
		this.field2477 = arg0.field2477;
		this.field2451 = arg0.field2451;
		this.field2453 = arg0.field2453;
		this.field2474 = arg0.field2474;
		this.field2454 = arg0.field2454;
		this.field2458 = arg0.field2458;
		this.field2455 = arg0.field2455;
		this.field2469 = arg0.field2469;
		this.field2467 = arg0.field2467;
		this.field2452 = arg0.field2452;
		this.field2450 = arg0.field2450;
		this.field2476 = arg0.field2476;
		this.field2470 = arg0.field2470;
		this.field2471 = arg0.field2471;
		this.field2447 = arg0.field2447;
		this.field2478 = arg0.field2478;
		this.field2460 = arg0.field2460;
		this.field2446 = arg0.field2446;
		this.field2457 = arg0.field2457;
	}

	@ObfuscatedName("p.a()Lp;")
	public ModelUnlit method832() {
		ModelUnlit var1 = new ModelUnlit();
		if (this.field2440 != null) {
			var1.field2440 = new byte[this.field2465];
			for (int var2 = 0; var2 < this.field2465; var2++) {
				var1.field2440[var2] = this.field2440[var2];
			}
		}
		var1.field2443 = this.field2443;
		var1.field2465 = this.field2465;
		var1.field2461 = this.field2461;
		var1.field2444 = this.field2444;
		var1.field2459 = this.field2459;
		var1.field2435 = this.field2435;
		var1.field2441 = this.field2441;
		var1.field2480 = this.field2480;
		var1.field2472 = this.field2472;
		var1.field2449 = this.field2449;
		var1.field2437 = this.field2437;
		var1.field2436 = this.field2436;
		var1.field2434 = this.field2434;
		var1.field2438 = this.field2438;
		var1.field2462 = this.field2462;
		var1.field2464 = this.field2464;
		var1.field2477 = this.field2477;
		var1.field2451 = this.field2451;
		var1.field2453 = this.field2453;
		var1.field2474 = this.field2474;
		var1.field2454 = this.field2454;
		var1.field2458 = this.field2458;
		var1.field2455 = this.field2455;
		var1.field2469 = this.field2469;
		var1.field2467 = this.field2467;
		var1.field2452 = this.field2452;
		var1.field2450 = this.field2450;
		var1.field2476 = this.field2476;
		var1.field2470 = this.field2470;
		var1.field2471 = this.field2471;
		var1.field2447 = this.field2447;
		var1.field2478 = this.field2478;
		var1.field2446 = this.field2446;
		var1.field2457 = this.field2457;
		return var1;
	}

	@ObfuscatedName("p.a(SS)V")
	public void method833(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.field2465; var3++) {
			if (this.field2434[var3] == arg0) {
				this.field2434[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("p.b(III)V")
	public void method834(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2443; var4++) {
			this.field2444[var4] += arg0;
			this.field2459[var4] += arg1;
			this.field2435[var4] += arg2;
		}
		this.method854();
	}

	@ObfuscatedName("p.a([B)V")
	public void method835(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		var2.pos = arg0.length - 23;
		int var9 = var2.g2();
		int var10 = var2.g2();
		int var11 = var2.g1();
		int var12 = var2.g1();
		int var13 = var2.g1();
		int var14 = var2.g1();
		int var15 = var2.g1();
		int var16 = var2.g1();
		int var17 = var2.g1();
		int var18 = var2.g2();
		int var19 = var2.g2();
		int var20 = var2.g2();
		int var21 = var2.g2();
		int var22 = var2.g2();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		if (var11 > 0) {
			this.field2464 = new byte[var11];
			var2.pos = 0;
			for (int var26 = 0; var26 < var11; var26++) {
				byte var27 = this.field2464[var26] = var2.method544();
				if (var27 == 0) {
					var23++;
				}
				if (var27 >= 1 && var27 <= 3) {
					var24++;
				}
				if (var27 == 2) {
					var25++;
				}
			}
		}
		int var29 = var11 + var9;
		int var30 = var29;
		if (var12 == 1) {
			var29 += var10;
		}
		int var32 = var29 + var10;
		int var33 = var32;
		if (var13 == 255) {
			var32 += var10;
		}
		int var34 = var32;
		if (var15 == 1) {
			var32 += var10;
		}
		int var35 = var32;
		if (var17 == 1) {
			var32 += var9;
		}
		int var36 = var32;
		if (var14 == 1) {
			var32 += var10;
		}
		int var38 = var32 + var21;
		int var39 = var38;
		if (var16 == 1) {
			var38 += var10 * 2;
		}
		int var41 = var38 + var22;
		int var43 = var41 + var10 * 2;
		int var45 = var43 + var18;
		int var47 = var45 + var19;
		int var49 = var47 + var20;
		int var51 = var49 + var23 * 6;
		int var53 = var51 + var24 * 6;
		int var55 = var53 + var24 * 6;
		int var57 = var55 + var24 * 2;
		int var59 = var57 + var24;
		int var61 = var59 + var24 * 2 + var25 * 2;
		this.field2443 = var9;
		this.field2465 = var10;
		this.field2461 = var11;
		this.field2444 = new int[var9];
		this.field2459 = new int[var9];
		this.field2435 = new int[var9];
		this.field2441 = new int[var10];
		this.field2480 = new int[var10];
		this.field2472 = new int[var10];
		if (var17 == 1) {
			this.field2450 = new int[var9];
		}
		if (var12 == 1) {
			this.field2440 = new byte[var10];
		}
		if (var13 == 255) {
			this.field2449 = new byte[var10];
		} else {
			this.field2462 = (byte) var13;
		}
		if (var14 == 1) {
			this.field2437 = new byte[var10];
		}
		if (var15 == 1) {
			this.field2476 = new int[var10];
		}
		if (var16 == 1) {
			this.field2438 = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.field2436 = new byte[var10];
		}
		this.field2434 = new short[var10];
		if (var11 > 0) {
			this.field2477 = new short[var11];
			this.field2451 = new short[var11];
			this.field2453 = new short[var11];
			if (var24 > 0) {
				this.field2474 = new short[var24];
				this.field2454 = new short[var24];
				this.field2458 = new short[var24];
				this.field2455 = new short[var24];
				this.field2469 = new byte[var24];
				this.field2467 = new short[var24];
			}
			if (var25 > 0) {
				this.field2452 = new short[var25];
			}
		}
		var2.pos = var11;
		var3.pos = var43;
		var4.pos = var45;
		var5.pos = var47;
		var6.pos = var35;
		int var62 = 0;
		int var63 = 0;
		int var64 = 0;
		for (int var65 = 0; var65 < var9; var65++) {
			int var66 = var2.g1();
			int var67 = 0;
			if ((var66 & 0x1) != 0) {
				var67 = var3.method516();
			}
			int var68 = 0;
			if ((var66 & 0x2) != 0) {
				var68 = var4.method516();
			}
			int var69 = 0;
			if ((var66 & 0x4) != 0) {
				var69 = var5.method516();
			}
			this.field2444[var65] = var62 + var67;
			this.field2459[var65] = var63 + var68;
			this.field2435[var65] = var64 + var69;
			var62 = this.field2444[var65];
			var63 = this.field2459[var65];
			var64 = this.field2435[var65];
			if (var17 == 1) {
				this.field2450[var65] = var6.g1();
			}
		}
		var2.pos = var41;
		var3.pos = var30;
		var4.pos = var33;
		var5.pos = var36;
		var6.pos = var34;
		var7.pos = var39;
		var8.pos = var38;
		for (int var70 = 0; var70 < var10; var70++) {
			this.field2434[var70] = (short) var2.g2();
			if (var12 == 1) {
				this.field2440[var70] = var3.method544();
			}
			if (var13 == 255) {
				this.field2449[var70] = var4.method544();
			}
			if (var14 == 1) {
				this.field2437[var70] = var5.method544();
			}
			if (var15 == 1) {
				this.field2476[var70] = var6.g1();
			}
			if (var16 == 1) {
				this.field2438[var70] = (short) (var7.g2() - 1);
			}
			if (this.field2436 != null && this.field2438[var70] != -1) {
				this.field2436[var70] = (byte) (var8.g1() - 1);
			}
		}
		var2.pos = var32;
		var3.pos = var29;
		int var71 = 0;
		int var72 = 0;
		int var73 = 0;
		int var74 = 0;
		for (int var75 = 0; var75 < var10; var75++) {
			int var76 = var3.g1();
			if (var76 == 1) {
				var71 = var2.method516() + var74;
				var72 = var2.method516() + var71;
				var73 = var2.method516() + var72;
				var74 = var73;
				this.field2441[var75] = var71;
				this.field2480[var75] = var72;
				this.field2472[var75] = var73;
			}
			if (var76 == 2) {
				var72 = var73;
				var73 = var2.method516() + var74;
				var74 = var73;
				this.field2441[var75] = var71;
				this.field2480[var75] = var72;
				this.field2472[var75] = var73;
			}
			if (var76 == 3) {
				var71 = var73;
				var73 = var2.method516() + var74;
				var74 = var73;
				this.field2441[var75] = var71;
				this.field2480[var75] = var72;
				this.field2472[var75] = var73;
			}
			if (var76 == 4) {
				int var77 = var71;
				var71 = var72;
				var72 = var77;
				var73 = var2.method516() + var74;
				var74 = var73;
				this.field2441[var75] = var71;
				this.field2480[var75] = var77;
				this.field2472[var75] = var73;
			}
		}
		var2.pos = var49;
		var3.pos = var51;
		var4.pos = var53;
		var5.pos = var55;
		var6.pos = var57;
		var7.pos = var59;
		for (int var78 = 0; var78 < var11; var78++) {
			int var79 = this.field2464[var78] & 0xFF;
			if (var79 == 0) {
				this.field2477[var78] = (short) var2.g2();
				this.field2451[var78] = (short) var2.g2();
				this.field2453[var78] = (short) var2.g2();
			}
			if (var79 == 1) {
				this.field2477[var78] = (short) var3.g2();
				this.field2451[var78] = (short) var3.g2();
				this.field2453[var78] = (short) var3.g2();
				this.field2474[var78] = (short) var4.g2();
				this.field2454[var78] = (short) var4.g2();
				this.field2458[var78] = (short) var4.g2();
				this.field2455[var78] = (short) var5.g2();
				this.field2469[var78] = var6.method544();
				this.field2467[var78] = (short) var7.g2();
			}
			if (var79 == 2) {
				this.field2477[var78] = (short) var3.g2();
				this.field2451[var78] = (short) var3.g2();
				this.field2453[var78] = (short) var3.g2();
				this.field2474[var78] = (short) var4.g2();
				this.field2454[var78] = (short) var4.g2();
				this.field2458[var78] = (short) var4.g2();
				this.field2455[var78] = (short) var5.g2();
				this.field2469[var78] = var6.method544();
				this.field2467[var78] = (short) var7.g2();
				this.field2452[var78] = (short) var7.g2();
			}
			if (var79 == 3) {
				this.field2477[var78] = (short) var3.g2();
				this.field2451[var78] = (short) var3.g2();
				this.field2453[var78] = (short) var3.g2();
				this.field2474[var78] = (short) var4.g2();
				this.field2454[var78] = (short) var4.g2();
				this.field2458[var78] = (short) var4.g2();
				this.field2455[var78] = (short) var5.g2();
				this.field2469[var78] = var6.method544();
				this.field2467[var78] = (short) var7.g2();
			}
		}
		var2.pos = var61;
		int var80 = var2.g1();
		if (var80 == 0) {
			return;
		}
		new class100();
		var2.g2();
		var2.g2();
		var2.g2();
		var2.g4();
	}

	@ObfuscatedName("p.a([[IIIIZI)Lp;")
	public ModelUnlit method836(int[][] arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method843();
		int var6 = arg1 + this.field2479;
		int var7 = arg1 + this.field2468;
		int var8 = arg3 + this.field2456;
		int var9 = arg3 + this.field2463;
		if (var6 < 0 || var7 + 128 >> 7 >= arg0.length || var8 < 0 || var9 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		int var10 = var6 >> 7;
		int var11 = var7 + 127 >> 7;
		int var12 = var8 >> 7;
		int var13 = var9 + 127 >> 7;
		if (arg0[var10][var12] == arg2 && arg0[var11][var12] == arg2 && arg0[var10][var13] == arg2 && arg0[var11][var13] == arg2) {
			return this;
		}
		ModelUnlit var14 = new ModelUnlit();
		var14.field2443 = this.field2443;
		var14.field2465 = this.field2465;
		var14.field2461 = this.field2461;
		var14.field2444 = this.field2444;
		var14.field2435 = this.field2435;
		var14.field2441 = this.field2441;
		var14.field2480 = this.field2480;
		var14.field2472 = this.field2472;
		var14.field2440 = this.field2440;
		var14.field2449 = this.field2449;
		var14.field2437 = this.field2437;
		var14.field2436 = this.field2436;
		var14.field2434 = this.field2434;
		var14.field2438 = this.field2438;
		var14.field2462 = this.field2462;
		var14.field2464 = this.field2464;
		var14.field2477 = this.field2477;
		var14.field2451 = this.field2451;
		var14.field2453 = this.field2453;
		var14.field2474 = this.field2474;
		var14.field2454 = this.field2454;
		var14.field2458 = this.field2458;
		var14.field2455 = this.field2455;
		var14.field2469 = this.field2469;
		var14.field2467 = this.field2467;
		var14.field2452 = this.field2452;
		var14.field2450 = this.field2450;
		var14.field2476 = this.field2476;
		var14.field2470 = this.field2470;
		var14.field2471 = this.field2471;
		var14.field2446 = this.field2446;
		var14.field2457 = this.field2457;
		var14.field2459 = new int[var14.field2443];
		if (arg4 == 0) {
			for (int var15 = 0; var15 < var14.field2443; var15++) {
				int var16 = this.field2444[var15] + arg1;
				int var17 = this.field2435[var15] + arg3;
				int var18 = var16 & 0x7F;
				int var19 = var17 & 0x7F;
				int var20 = var16 >> 7;
				int var21 = var17 >> 7;
				int var22 = arg0[var20][var21] * (128 - var18) + arg0[var20 + 1][var21] * var18 >> 7;
				int var23 = arg0[var20][var21 + 1] * (128 - var18) + arg0[var20 + 1][var21 + 1] * var18 >> 7;
				int var24 = var22 * (128 - var19) + var23 * var19 >> 7;
				var14.field2459[var15] = this.field2459[var15] + var24 - arg2;
			}
		} else {
			for (int var25 = 0; var25 < var14.field2443; var25++) {
				int var26 = (-this.field2459[var25] << 16) / super.field470;
				if (var26 < arg4) {
					int var27 = this.field2444[var25] + arg1;
					int var28 = this.field2435[var25] + arg3;
					int var29 = var27 & 0x7F;
					int var30 = var28 & 0x7F;
					int var31 = var27 >> 7;
					int var32 = var28 >> 7;
					int var33 = arg0[var31][var32] * (128 - var29) + arg0[var31 + 1][var32] * var29 >> 7;
					int var34 = arg0[var31][var32 + 1] * (128 - var29) + arg0[var31 + 1][var32 + 1] * var29 >> 7;
					int var35 = var33 * (128 - var30) + var34 * var30 >> 7;
					var14.field2459[var25] = this.field2459[var25] + (var35 - arg2) * (arg4 - var26) / arg4;
				}
			}
		}
		var14.method854();
		return var14;
	}

	@ObfuscatedName("p.b()V")
	public void method837() {
		for (int var1 = 0; var1 < this.field2443; var1++) {
			int var2 = this.field2444[var1];
			this.field2444[var1] = this.field2435[var1];
			this.field2435[var1] = -var2;
		}
		this.method854();
	}

	@ObfuscatedName("p.c()V")
	public void method838() {
		for (int var1 = 0; var1 < this.field2443; var1++) {
			int var2 = this.field2435[var1];
			this.field2435[var1] = this.field2444[var1];
			this.field2444[var1] = -var2;
		}
		this.method854();
	}

	@ObfuscatedName("p.d()V")
	public void method839() {
		if (this.field2447 != null) {
			return;
		}
		this.field2447 = new PointNormal[this.field2443];
		for (int var1 = 0; var1 < this.field2443; var1++) {
			this.field2447[var1] = new PointNormal();
		}
		for (int var2 = 0; var2 < this.field2465; var2++) {
			int var3 = this.field2441[var2];
			int var4 = this.field2480[var2];
			int var5 = this.field2472[var2];
			int var6 = this.field2444[var4] - this.field2444[var3];
			int var7 = this.field2459[var4] - this.field2459[var3];
			int var8 = this.field2435[var4] - this.field2435[var3];
			int var9 = this.field2444[var5] - this.field2444[var3];
			int var10 = this.field2459[var5] - this.field2459[var3];
			int var11 = this.field2435[var5] - this.field2435[var3];
			int var12 = var7 * var11 - var10 * var8;
			int var13 = var8 * var9 - var11 * var6;
			int var14;
			for (var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
				var12 >>= 0x1;
				var13 >>= 0x1;
			}
			int var15 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + var14 * var14));
			if (var15 <= 0) {
				var15 = 1;
			}
			int var16 = var12 * 256 / var15;
			int var17 = var13 * 256 / var15;
			int var18 = var14 * 256 / var15;
			byte var19;
			if (this.field2440 == null) {
				var19 = 0;
			} else {
				var19 = this.field2440[var2];
			}
			if (var19 == 0) {
				PointNormal var20 = this.field2447[var3];
				var20.x += var16;
				var20.y += var17;
				var20.z += var18;
				var20.w++;
				PointNormal var21 = this.field2447[var4];
				var21.x += var16;
				var21.y += var17;
				var21.z += var18;
				var21.w++;
				PointNormal var22 = this.field2447[var5];
				var22.x += var16;
				var22.y += var17;
				var22.z += var18;
				var22.w++;
			} else if (var19 == 1) {
				if (this.field2478 == null) {
					this.field2478 = new FaceNormal[this.field2465];
				}
				FaceNormal var23 = this.field2478[var2] = new FaceNormal();
				var23.x = var16;
				var23.y = var17;
				var23.z = var18;
			}
		}
	}

	@ObfuscatedName("p.b([B)V")
	public void method841(byte[] arg0) {
		boolean var2 = false;
		boolean var3 = false;
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		var4.pos = arg0.length - 18;
		int var9 = var4.g2();
		int var10 = var4.g2();
		int var11 = var4.g1();
		int var12 = var4.g1();
		int var13 = var4.g1();
		int var14 = var4.g1();
		int var15 = var4.g1();
		int var16 = var4.g1();
		int var17 = var4.g2();
		int var18 = var4.g2();
		int var19 = var4.g2();
		int var20 = var4.g2();
		int var21 = var9;
		int var23 = var21 + var10;
		int var24 = var23;
		if (var13 == 255) {
			var23 += var10;
		}
		int var25 = var23;
		if (var15 == 1) {
			var23 += var10;
		}
		int var26 = var23;
		if (var12 == 1) {
			var23 += var10;
		}
		int var27 = var23;
		if (var16 == 1) {
			var23 += var9;
		}
		int var28 = var23;
		if (var14 == 1) {
			var23 += var10;
		}
		int var30 = var23 + var20;
		int var32 = var30 + var10 * 2;
		int var34 = var32 + var11 * 6;
		int var36 = var34 + var17;
		int var38 = var36 + var18;
		this.field2443 = var9;
		this.field2465 = var10;
		this.field2461 = var11;
		this.field2444 = new int[var9];
		this.field2459 = new int[var9];
		this.field2435 = new int[var9];
		this.field2441 = new int[var10];
		this.field2480 = new int[var10];
		this.field2472 = new int[var10];
		if (var11 > 0) {
			this.field2464 = new byte[var11];
			this.field2477 = new short[var11];
			this.field2451 = new short[var11];
			this.field2453 = new short[var11];
		}
		if (var16 == 1) {
			this.field2450 = new int[var9];
		}
		if (var12 == 1) {
			this.field2440 = new byte[var10];
			this.field2436 = new byte[var10];
			this.field2438 = new short[var10];
		}
		if (var13 == 255) {
			this.field2449 = new byte[var10];
		} else {
			this.field2462 = (byte) var13;
		}
		if (var14 == 1) {
			this.field2437 = new byte[var10];
		}
		if (var15 == 1) {
			this.field2476 = new int[var10];
		}
		this.field2434 = new short[var10];
		var4.pos = 0;
		var5.pos = var34;
		var6.pos = var36;
		var7.pos = var38;
		var8.pos = var27;
		int var40 = 0;
		int var41 = 0;
		int var42 = 0;
		for (int var43 = 0; var43 < var9; var43++) {
			int var44 = var4.g1();
			int var45 = 0;
			if ((var44 & 0x1) != 0) {
				var45 = var5.method516();
			}
			int var46 = 0;
			if ((var44 & 0x2) != 0) {
				var46 = var6.method516();
			}
			int var47 = 0;
			if ((var44 & 0x4) != 0) {
				var47 = var7.method516();
			}
			this.field2444[var43] = var40 + var45;
			this.field2459[var43] = var41 + var46;
			this.field2435[var43] = var42 + var47;
			var40 = this.field2444[var43];
			var41 = this.field2459[var43];
			var42 = this.field2435[var43];
			if (var16 == 1) {
				this.field2450[var43] = var8.g1();
			}
		}
		var4.pos = var30;
		var5.pos = var26;
		var6.pos = var24;
		var7.pos = var28;
		var8.pos = var25;
		for (int var48 = 0; var48 < var10; var48++) {
			this.field2434[var48] = (short) var4.g2();
			if (var12 == 1) {
				int var49 = var5.g1();
				if ((var49 & 0x1) == 1) {
					this.field2440[var48] = 1;
					var2 = true;
				} else {
					this.field2440[var48] = 0;
				}
				if ((var49 & 0x2) == 2) {
					this.field2436[var48] = (byte) (var49 >> 2);
					this.field2438[var48] = this.field2434[var48];
					this.field2434[var48] = 127;
					if (this.field2438[var48] != -1) {
						var3 = true;
					}
				} else {
					this.field2436[var48] = -1;
					this.field2438[var48] = -1;
				}
			}
			if (var13 == 255) {
				this.field2449[var48] = var6.method544();
			}
			if (var14 == 1) {
				this.field2437[var48] = var7.method544();
			}
			if (var15 == 1) {
				this.field2476[var48] = var8.g1();
			}
		}
		var4.pos = var23;
		var5.pos = var21;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;
		int var53 = 0;
		for (int var54 = 0; var54 < var10; var54++) {
			int var55 = var5.g1();
			if (var55 == 1) {
				var50 = var4.method516() + var53;
				var51 = var4.method516() + var50;
				var52 = var4.method516() + var51;
				var53 = var52;
				this.field2441[var54] = var50;
				this.field2480[var54] = var51;
				this.field2472[var54] = var52;
			}
			if (var55 == 2) {
				var51 = var52;
				var52 = var4.method516() + var53;
				var53 = var52;
				this.field2441[var54] = var50;
				this.field2480[var54] = var51;
				this.field2472[var54] = var52;
			}
			if (var55 == 3) {
				var50 = var52;
				var52 = var4.method516() + var53;
				var53 = var52;
				this.field2441[var54] = var50;
				this.field2480[var54] = var51;
				this.field2472[var54] = var52;
			}
			if (var55 == 4) {
				int var56 = var50;
				var50 = var51;
				var51 = var56;
				var52 = var4.method516() + var53;
				var53 = var52;
				this.field2441[var54] = var50;
				this.field2480[var54] = var56;
				this.field2472[var54] = var52;
			}
		}
		var4.pos = var32;
		for (int var57 = 0; var57 < var11; var57++) {
			this.field2464[var57] = 0;
			this.field2477[var57] = (short) var4.g2();
			this.field2451[var57] = (short) var4.g2();
			this.field2453[var57] = (short) var4.g2();
		}
		if (this.field2436 != null) {
			boolean var58 = false;
			for (int var59 = 0; var59 < var10; var59++) {
				int var60 = this.field2436[var59] & 0xFF;
				if (var60 != 255) {
					if ((this.field2477[var60] & 0xFFFF) == this.field2441[var59] && (this.field2451[var60] & 0xFFFF) == this.field2480[var59] && (this.field2453[var60] & 0xFFFF) == this.field2472[var59]) {
						this.field2436[var59] = -1;
					} else {
						var58 = true;
					}
				}
			}
			if (!var58) {
				this.field2436 = null;
			}
		}
		if (!var3) {
			this.field2438 = null;
		}
		if (!var2) {
			this.field2440 = null;
		}
	}

	@ObfuscatedName("p.e()V")
	public void method842() {
		for (int var1 = 0; var1 < this.field2443; var1++) {
			this.field2444[var1] = -this.field2444[var1];
			this.field2435[var1] = -this.field2435[var1];
		}
		this.method854();
	}

	@ObfuscatedName("p.f()V")
	public void method843() {
		if (this.field2439) {
			return;
		}
		super.field470 = 0;
		this.field2475 = 0;
		this.field2479 = 999999;
		this.field2468 = -999999;
		this.field2463 = -99999;
		this.field2456 = 99999;
		for (int var1 = 0; var1 < this.field2443; var1++) {
			int var2 = this.field2444[var1];
			int var3 = this.field2459[var1];
			int var4 = this.field2435[var1];
			if (var2 < this.field2479) {
				this.field2479 = var2;
			}
			if (var2 > this.field2468) {
				this.field2468 = var2;
			}
			if (var4 < this.field2456) {
				this.field2456 = var4;
			}
			if (var4 > this.field2463) {
				this.field2463 = var4;
			}
			if (-var3 > super.field470) {
				super.field470 = -var3;
			}
			if (var3 > this.field2475) {
				this.field2475 = var3;
			}
		}
		this.field2439 = true;
	}

	@ObfuscatedName("p.g()V")
	public void method844() {
		for (int var1 = 0; var1 < this.field2443; var1++) {
			this.field2435[var1] = -this.field2435[var1];
		}
		for (int var2 = 0; var2 < this.field2465; var2++) {
			int var3 = this.field2441[var2];
			this.field2441[var2] = this.field2472[var2];
			this.field2472[var2] = var3;
		}
		this.method854();
	}

	@ObfuscatedName("p.a(Lp;I)I")
	public int method845(ModelUnlit arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.field2444[arg1];
		int var5 = arg0.field2459[arg1];
		int var6 = arg0.field2435[arg1];
		for (int var7 = 0; var7 < this.field2443; var7++) {
			if (var4 == this.field2444[var7] && var5 == this.field2459[var7] && var6 == this.field2435[var7]) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.field2444[this.field2443] = var4;
			this.field2459[this.field2443] = var5;
			this.field2435[this.field2443] = var6;
			if (arg0.field2450 != null) {
				this.field2450[this.field2443] = arg0.field2450[arg1];
			}
			var3 = this.field2443++;
		}
		return var3;
	}

	@ObfuscatedName("p.a(IIIII)Lod;")
	public ModelLit method847(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method839();
		int var6 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		int var7 = arg1 * var6 >> 8;
		ModelLit var8 = new ModelLit();
		var8.field2345 = new int[this.field2465];
		var8.field2327 = new int[this.field2465];
		var8.field2325 = new int[this.field2465];
		if (this.field2461 > 0 && this.field2436 != null) {
			int[] var9 = new int[this.field2461];
			for (int var10 = 0; var10 < this.field2465; var10++) {
				if (this.field2436[var10] != -1) {
					var9[this.field2436[var10] & 0xFF]++;
				}
			}
			var8.field2334 = 0;
			for (int var11 = 0; var11 < this.field2461; var11++) {
				if (var9[var11] > 0 && this.field2464[var11] == 0) {
					var8.field2334++;
				}
			}
			var8.field2350 = new int[var8.field2334];
			var8.field2335 = new int[var8.field2334];
			var8.field2326 = new int[var8.field2334];
			int var12 = 0;
			for (int var13 = 0; var13 < this.field2461; var13++) {
				if (var9[var13] > 0 && this.field2464[var13] == 0) {
					var8.field2350[var12] = this.field2477[var13] & 0xFFFF;
					var8.field2335[var12] = this.field2451[var13] & 0xFFFF;
					var8.field2326[var12] = this.field2453[var13] & 0xFFFF;
					var9[var13] = var12++;
				} else {
					var9[var13] = -1;
				}
			}
			var8.field2339 = new byte[this.field2465];
			for (int var14 = 0; var14 < this.field2465; var14++) {
				if (this.field2436[var14] == -1) {
					var8.field2339[var14] = -1;
				} else {
					var8.field2339[var14] = (byte) var9[this.field2436[var14] & 0xFF];
				}
			}
		}
		for (int var15 = 0; var15 < this.field2465; var15++) {
			byte var16;
			if (this.field2440 == null) {
				var16 = 0;
			} else {
				var16 = this.field2440[var15];
			}
			byte var17;
			if (this.field2437 == null) {
				var17 = 0;
			} else {
				var17 = this.field2437[var15];
			}
			short var18;
			if (this.field2438 == null) {
				var18 = -1;
			} else {
				var18 = this.field2438[var15];
			}
			if (var17 == -2) {
				var16 = 3;
			}
			if (var17 == -1) {
				var16 = 2;
			}
			if (var18 == -1) {
				if (var16 == 0) {
					int var19 = this.field2434[var15] & 0xFFFF;
					PointNormal var20;
					if (this.field2460 == null || this.field2460[this.field2441[var15]] == null) {
						var20 = this.field2447[this.field2441[var15]];
					} else {
						var20 = this.field2460[this.field2441[var15]];
					}
					int var21 = arg0 + (arg2 * var20.x + arg3 * var20.y + arg4 * var20.z) / (var7 * var20.w);
					var8.field2345[var15] = method846(var19, var21);
					PointNormal var22;
					if (this.field2460 == null || this.field2460[this.field2480[var15]] == null) {
						var22 = this.field2447[this.field2480[var15]];
					} else {
						var22 = this.field2460[this.field2480[var15]];
					}
					int var23 = arg0 + (arg2 * var22.x + arg3 * var22.y + arg4 * var22.z) / (var7 * var22.w);
					var8.field2327[var15] = method846(var19, var23);
					PointNormal var24;
					if (this.field2460 == null || this.field2460[this.field2472[var15]] == null) {
						var24 = this.field2447[this.field2472[var15]];
					} else {
						var24 = this.field2460[this.field2472[var15]];
					}
					int var25 = arg0 + (arg2 * var24.x + arg3 * var24.y + arg4 * var24.z) / (var7 * var24.w);
					var8.field2325[var15] = method846(var19, var25);
				} else if (var16 == 1) {
					FaceNormal var26 = this.field2478[var15];
					int var27 = arg0 + (arg2 * var26.x + arg3 * var26.y + arg4 * var26.z) / (var7 + var7 / 2);
					var8.field2345[var15] = method846(this.field2434[var15] & 0xFFFF, var27);
					var8.field2325[var15] = -1;
				} else if (var16 == 3) {
					var8.field2345[var15] = 128;
					var8.field2325[var15] = -1;
				} else {
					var8.field2325[var15] = -2;
				}
			} else if (var16 == 0) {
				PointNormal var28;
				if (this.field2460 == null || this.field2460[this.field2441[var15]] == null) {
					var28 = this.field2447[this.field2441[var15]];
				} else {
					var28 = this.field2460[this.field2441[var15]];
				}
				int var29 = arg0 + (arg2 * var28.x + arg3 * var28.y + arg4 * var28.z) / (var7 * var28.w);
				var8.field2345[var15] = method849(var29);
				PointNormal var30;
				if (this.field2460 == null || this.field2460[this.field2480[var15]] == null) {
					var30 = this.field2447[this.field2480[var15]];
				} else {
					var30 = this.field2460[this.field2480[var15]];
				}
				int var31 = arg0 + (arg2 * var30.x + arg3 * var30.y + arg4 * var30.z) / (var7 * var30.w);
				var8.field2327[var15] = method849(var31);
				PointNormal var32;
				if (this.field2460 == null || this.field2460[this.field2472[var15]] == null) {
					var32 = this.field2447[this.field2472[var15]];
				} else {
					var32 = this.field2460[this.field2472[var15]];
				}
				int var33 = arg0 + (arg2 * var32.x + arg3 * var32.y + arg4 * var32.z) / (var7 * var32.w);
				var8.field2325[var15] = method849(var33);
			} else if (var16 == 1) {
				FaceNormal var34 = this.field2478[var15];
				int var35 = arg0 + (arg2 * var34.x + arg3 * var34.y + arg4 * var34.z) / (var7 + var7 / 2);
				var8.field2345[var15] = method849(var35);
				var8.field2325[var15] = -1;
			} else {
				var8.field2325[var15] = -2;
			}
		}
		this.method852();
		var8.field2347 = this.field2443;
		var8.field2337 = this.field2444;
		var8.field2321 = this.field2459;
		var8.field2330 = this.field2435;
		var8.field2348 = this.field2465;
		var8.field2338 = this.field2441;
		var8.field2333 = this.field2480;
		var8.field2346 = this.field2472;
		var8.field2349 = this.field2449;
		var8.field2336 = this.field2437;
		var8.field2328 = this.field2462;
		var8.field2344 = this.field2470;
		var8.field2324 = this.field2471;
		var8.field2332 = this.field2438;
		return var8;
	}

	@ObfuscatedName("p.f(I)V")
	public void method851() {
		int var1 = field2448[256];
		int var2 = field2442[256];
		for (int var3 = 0; var3 < this.field2443; var3++) {
			int var4 = this.field2435[var3] * var1 + this.field2444[var3] * var2 >> 16;
			this.field2435[var3] = this.field2435[var3] * var2 - this.field2444[var3] * var1 >> 16;
			this.field2444[var3] = var4;
		}
		this.method854();
	}

	@ObfuscatedName("p.i()V")
	public void method852() {
		int var10002;
		if (this.field2450 != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < this.field2443; var3++) {
				int var4 = this.field2450[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.field2470 = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				this.field2470[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.field2443) {
				int var7 = this.field2450[var6];
				this.field2470[var7][var1[var7]++] = var6++;
			}
			this.field2450 = null;
		}
		if (this.field2476 == null) {
			return;
		}
		int[] var8 = new int[256];
		int var9 = 0;
		for (int var10 = 0; var10 < this.field2465; var10++) {
			int var11 = this.field2476[var10];
			var10002 = var8[var11]++;
			if (var11 > var9) {
				var9 = var11;
			}
		}
		this.field2471 = new int[var9 + 1][];
		for (int var12 = 0; var12 <= var9; var12++) {
			this.field2471[var12] = new int[var8[var12]];
			var8[var12] = 0;
		}
		int var13 = 0;
		while (var13 < this.field2465) {
			int var14 = this.field2476[var13];
			this.field2471[var14][var8[var14]++] = var13++;
		}
		this.field2476 = null;
	}

	@ObfuscatedName("p.b(SS)V")
	public void method853(short arg0, short arg1) {
		if (this.field2438 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field2465; var3++) {
			if (this.field2438[var3] == arg0) {
				this.field2438[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("p.j()V")
	public void method854() {
		this.field2447 = null;
		this.field2460 = null;
		this.field2478 = null;
		this.field2439 = false;
	}

	@ObfuscatedName("p.c(III)V")
	public void method855(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2443; var4++) {
			this.field2444[var4] = this.field2444[var4] * arg0 / 128;
			this.field2459[var4] = this.field2459[var4] * arg1 / 128;
			this.field2435[var4] = this.field2435[var4] * arg2 / 128;
		}
		this.method854();
	}
}
