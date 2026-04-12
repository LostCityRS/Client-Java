package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.dash3d.Model;
import jagex3.dash3d.PlayerModel;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix32;
import jagex3.graphics.PixFont;
import jagex3.graphics.PixLoader;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("qd")
public final class IfType extends Linkable2 {

	@ObfuscatedName("rd.w")
	public static LruCache field2680 = new LruCache(50);
	@ObfuscatedName("cb.x")
	public static Js5 field503;
	@ObfuscatedName("fd.sb")
	public static Js5 field924;
	@ObfuscatedName("t.yb")
	public static Js5 field2810;
	@ObfuscatedName("tc.k")
	public static IfType[][] field2922;
	@ObfuscatedName("wc.o")
	public static boolean[] field3296;
	@ObfuscatedName("qd.ac")
	public JagString field2474 = Statics.field3058;

	@ObfuscatedName("qd.ad")
	public int field2526 = 0;

	@ObfuscatedName("qd.bc")
	public Object[] field2475;

	@ObfuscatedName("qd.bd")
	public int field2527 = -1;

	@ObfuscatedName("qd.cc")
	public int field2476 = -1;

	@ObfuscatedName("qd.cd")
	public int field2528 = 0;

	@ObfuscatedName("qd.dd")
	public boolean field2529 = false;

	@ObfuscatedName("qd.ec")
	public Object[] field2478;

	@ObfuscatedName("qd.fc")
	public int field2479 = -1;

	@ObfuscatedName("qd.fd")
	public int field2531 = 0;

	@ObfuscatedName("qd.gd")
	public int field2532 = 0;

	@ObfuscatedName("qd.hd")
	public boolean field2533 = false;

	@ObfuscatedName("qd.ic")
	public JagString field2482 = Statics.field2056;

	@ObfuscatedName("qd.id")
	public int field2534 = 100;

	@ObfuscatedName("qd.jc")
	public Object[] field2483;

	@ObfuscatedName("qd.kd")
	public boolean field2536 = false;

	@ObfuscatedName("qd.lc")
	public int field2485 = 0;

	@ObfuscatedName("qd.ld")
	public int field2537 = 0;

	@ObfuscatedName("qd.mc")
	public Object[] field2486;

	@ObfuscatedName("qd.md")
	public int field2538 = 0;

	@ObfuscatedName("qd.nc")
	public Object[] field2487;

	@ObfuscatedName("qd.nd")
	public int field2539 = 0;

	@ObfuscatedName("qd.oc")
	public boolean field2488 = false;

	@ObfuscatedName("qd.od")
	public int field2540 = 0;

	@ObfuscatedName("qd.pc")
	public int field2489;

	@ObfuscatedName("qd.qd")
	public int field2542 = 0;

	@ObfuscatedName("qd.rc")
	public int[] field2491;

	@ObfuscatedName("qd.rd")
	public int field2543 = 0;

	@ObfuscatedName("qd.sd")
	public int field2544 = -1;

	@ObfuscatedName("qd.tc")
	public int field2493 = 1;

	@ObfuscatedName("qd.ub")
	public boolean field2442 = false;

	@ObfuscatedName("qd.uc")
	public boolean field2494 = false;

	@ObfuscatedName("qd.vc")
	public int field2495 = -1;

	@ObfuscatedName("qd.wc")
	public int field2496 = 0;

	@ObfuscatedName("qd.wd")
	public int[] field2548;

	@ObfuscatedName("qd.Jb")
	public int field2457 = 1;

	@ObfuscatedName("qd.xb")
	public int field2445 = 0;

	@ObfuscatedName("qd.Pb")
	public int field2463 = 0;

	@ObfuscatedName("qd.Xb")
	public boolean field2471 = false;

	@ObfuscatedName("qd.zb")
	public boolean field2447 = false;

	@ObfuscatedName("qd.Wb")
	public JagString field2470 = Statics.field3058;

	@ObfuscatedName("qd.Mb")
	public int field2460 = 0;

	@ObfuscatedName("qd.Zb")
	public int field2473 = 0;

	@ObfuscatedName("qd.Sb")
	public int field2466 = 0;

	@ObfuscatedName("qd.Lb")
	public int field2459 = -1;

	@ObfuscatedName("qd.Fb")
	public int field2453 = 0;

	@ObfuscatedName("qd.Ic")
	public int field2508 = 0;

	@ObfuscatedName("qd.Ac")
	public boolean field2500 = false;

	@ObfuscatedName("qd.Gb")
	public int field2454 = -1;

	@ObfuscatedName("qd.Vb")
	public int field2469 = 0;

	@ObfuscatedName("qd.Cc")
	public int field2502 = 0;

	@ObfuscatedName("qd.Rc")
	public int field2517 = -1;

	@ObfuscatedName("qd.Hb")
	public int field2455 = 0;

	@ObfuscatedName("qd.yb")
	public JagString field2446 = Statics.field3058;

	@ObfuscatedName("qd.Jc")
	public boolean field2509 = false;

	@ObfuscatedName("qd.Zc")
	public int field2525 = 0;

	@ObfuscatedName("qd.yc")
	public int field2498 = 0;

	@ObfuscatedName("qd.Rb")
	public int field2465 = -1;

	@ObfuscatedName("qd.Pc")
	public JagString field2515 = Statics.field3058;

	@ObfuscatedName("qd.Nb")
	public boolean field2461 = false;

	@ObfuscatedName("qd.Db")
	public boolean field2451 = false;

	@ObfuscatedName("qd.Vc")
	public int field2521 = 0;

	@ObfuscatedName("qd.Ob")
	public int field2462 = 0;

	@ObfuscatedName("qd.Hc")
	public boolean field2507 = false;

	@ObfuscatedName("qd.yd")
	public int field2550 = -1;

	@ObfuscatedName("qd.Bb")
	public int field2449 = 0;

	@ObfuscatedName("qd.zd")
	public int field2551 = 0;

	@ObfuscatedName("qd.xd")
	public int field2549 = 0;

	@ObfuscatedName("qd.Ad")
	public int field2552 = 0;

	@ObfuscatedName("qd.Ed")
	public boolean field2556 = false;

	@ObfuscatedName("qd.Yc")
	public int field2524 = -1;

	@ObfuscatedName("qd.Dd")
	public int field2555 = 0;

	@ObfuscatedName("qd.Uc")
	public int field2520 = 0;

	@ObfuscatedName("qd.Fd")
	public int field2557 = 0;

	@ObfuscatedName("qd.Ab")
	public int field2448;

	@ObfuscatedName("qd.zc")
	public int[] field2499;

	@ObfuscatedName("qd.Fc")
	public int[] field2505;

	@ObfuscatedName("qd.Kc")
	public int[] field2510;

	@ObfuscatedName("qd.Oc")
	public int[] field2514;

	@ObfuscatedName("qd.Qc")
	public int[] field2516;

	@ObfuscatedName("qd.Tc")
	public IfType[] field2519;

	@ObfuscatedName("qd.Tb")
	public JagString[] field2467;

	@ObfuscatedName("qd.Ec")
	public JagString[] field2504;

	@ObfuscatedName("qd.Cb")
	public Object[] field2450;

	@ObfuscatedName("qd.Ib")
	public Object[] field2456;

	@ObfuscatedName("qd.Qb")
	public Object[] field2464;

	@ObfuscatedName("qd.Bc")
	public Object[] field2501;

	@ObfuscatedName("qd.Nc")
	public Object[] field2513;

	@ObfuscatedName("qd.Sc")
	public Object[] field2518;

	@ObfuscatedName("qd.Bd")
	public Object[] field2553;

	@ObfuscatedName("qd.Cd")
	public int[][] field2554;

	@ObfuscatedName("d.a(Lbd;Lbd;Lbd;B)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		field503 = arg2;
		field924 = arg0;
		field2810 = arg1;
		field2922 = new IfType[field924.method220()][];
		field3296 = new boolean[field924.method220()];
	}

	@ObfuscatedName("wc.a(II)Z")
	public static boolean method1052(int arg0) {
		if (field3296[arg0]) {
			return true;
		} else if (field924.method231(arg0)) {
			int var1 = field924.method235(arg0);
			if (var1 == 0) {
				field3296[arg0] = true;
				return true;
			}
			if (field2922[arg0] == null) {
				field2922[arg0] = new IfType[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (field2922[arg0][var2] == null) {
					byte[] var3 = field924.method217(var2, arg0);
					if (var3 != null) {
						field2922[arg0][var2] = new IfType();
						field2922[arg0][var2].field2495 = (arg0 << 16) + var2;
						if (var3[0] == -1) {
							field2922[arg0][var2].method858(new Packet(var3));
						} else {
							field2922[arg0][var2].method851(new Packet(var3));
						}
					}
				}
			}
			field3296[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ua.a(BI)V")
	public static void method985(int arg0) {
		if (arg0 == -1 || !field3296[arg0]) {
			return;
		}
		field924.method216(arg0);
		if (field2922[arg0] == null) {
			return;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < field2922[arg0].length; var2++) {
			if (field2922[arg0][var2] != null) {
				if (field2922[arg0][var2].field2489 == 2) {
					var1 = false;
				} else {
					field2922[arg0][var2] = null;
				}
			}
		}
		if (var1) {
			field2922[arg0] = null;
		}
		field3296[arg0] = false;
	}

	@ObfuscatedName("s.a(II)V")
	public static void method895(int arg0) {
		method985(arg0);
	}

	@ObfuscatedName("qd.a(IZI)V")
	public void method850(int arg0, int arg1) {
		int var3 = this.field2491[arg1];
		this.field2491[arg1] = this.field2491[arg0];
		this.field2491[arg0] = var3;
		int var4 = this.field2516[arg1];
		this.field2516[arg1] = this.field2516[arg0];
		this.field2516[arg0] = var4;
	}

	@ObfuscatedName("qd.a(Lba;I)V")
	public void method851(Packet arg0) {
		this.field2442 = false;
		this.field2489 = arg0.method144();
		this.field2520 = arg0.method144();
		this.field2445 = arg0.method145();
		this.field2455 = this.field2462 = arg0.method139();
		this.field2549 = this.field2502 = arg0.method139();
		this.field2498 = arg0.method145();
		this.field2449 = arg0.method145();
		this.field2551 = arg0.method144();
		this.field2454 = arg0.method145();
		if (this.field2454 == 65535) {
			this.field2454 = -1;
		}
		this.field2527 = arg0.method145();
		if (this.field2527 == 65535) {
			this.field2527 = -1;
		}
		int var2 = arg0.method144();
		if (var2 > 0) {
			this.field2548 = new int[var2];
			this.field2499 = new int[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.field2548[var3] = arg0.method144();
				this.field2499[var3] = arg0.method145();
			}
		}
		int var4 = arg0.method144();
		if (var4 > 0) {
			this.field2554 = new int[var4][];
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = arg0.method145();
				this.field2554[var5] = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					this.field2554[var5][var7] = arg0.method145();
					if (this.field2554[var5][var7] == 65535) {
						this.field2554[var5][var7] = -1;
					}
				}
			}
		}
		if (this.field2489 == 0) {
			this.field2526 = arg0.method145();
			this.field2556 = arg0.method144() == 1;
		}
		if (this.field2489 == 1) {
			arg0.method145();
			arg0.method144();
		}
		if (this.field2489 == 2) {
			this.field2491 = new int[this.field2498 * this.field2449];
			this.field2516 = new int[this.field2498 * this.field2449];
			this.field2509 = arg0.method144() == 1;
			this.field2533 = arg0.method144() == 1;
			this.field2461 = arg0.method144() == 1;
			this.field2529 = arg0.method144() == 1;
			this.field2555 = arg0.method144();
			this.field2473 = arg0.method144();
			this.field2514 = new int[20];
			this.field2510 = new int[20];
			this.field2505 = new int[20];
			for (int var8 = 0; var8 < 20; var8++) {
				int var9 = arg0.method144();
				if (var9 == 1) {
					this.field2505[var8] = arg0.method139();
					this.field2514[var8] = arg0.method139();
					this.field2510[var8] = arg0.method167();
				} else {
					this.field2510[var8] = -1;
				}
			}
			this.field2504 = new JagString[5];
			for (int var10 = 0; var10 < 5; var10++) {
				this.field2504[var10] = arg0.method140();
				if (this.field2504[var10].method10() == 0) {
					this.field2504[var10] = null;
				}
			}
		}
		if (this.field2489 == 3) {
			this.field2451 = arg0.method144() == 1;
		}
		if (this.field2489 == 4 || this.field2489 == 1) {
			this.field2539 = arg0.method144();
			this.field2521 = arg0.method144();
			this.field2538 = arg0.method144();
			this.field2448 = arg0.method145();
			this.field2471 = arg0.method144() == 1;
		}
		if (this.field2489 == 4) {
			this.field2474 = arg0.method140();
			this.field2446 = arg0.method140();
		}
		if (this.field2489 == 1 || this.field2489 == 3 || this.field2489 == 4) {
			this.field2453 = arg0.method167();
		}
		if (this.field2489 == 3 || this.field2489 == 4) {
			this.field2532 = arg0.method167();
			this.field2525 = arg0.method167();
			this.field2469 = arg0.method167();
		}
		if (this.field2489 == 5) {
			this.field2550 = arg0.method167();
			this.field2476 = arg0.method167();
		}
		if (this.field2489 == 6) {
			this.field2493 = 1;
			this.field2479 = arg0.method145();
			if (this.field2479 == 65535) {
				this.field2479 = -1;
			}
			this.field2457 = 1;
			this.field2517 = arg0.method145();
			if (this.field2517 == 65535) {
				this.field2517 = -1;
			}
			this.field2465 = arg0.method145();
			if (this.field2465 == 65535) {
				this.field2465 = -1;
			}
			this.field2459 = arg0.method145();
			if (this.field2459 == 65535) {
				this.field2459 = -1;
			}
			this.field2534 = arg0.method145();
			this.field2496 = arg0.method145();
			this.field2463 = arg0.method145();
		}
		if (this.field2489 == 7) {
			this.field2491 = new int[this.field2498 * this.field2449];
			this.field2516 = new int[this.field2498 * this.field2449];
			this.field2539 = arg0.method144();
			this.field2448 = arg0.method145();
			this.field2471 = arg0.method144() == 1;
			this.field2453 = arg0.method167();
			this.field2555 = arg0.method139();
			this.field2473 = arg0.method139();
			this.field2533 = arg0.method144() == 1;
			this.field2504 = new JagString[5];
			for (int var11 = 0; var11 < 5; var11++) {
				this.field2504[var11] = arg0.method140();
				if (this.field2504[var11].method10() == 0) {
					this.field2504[var11] = null;
				}
			}
		}
		if (this.field2489 == 8) {
			this.field2474 = arg0.method140();
		}
		if (this.field2520 == 2 || this.field2489 == 2) {
			this.field2470 = arg0.method140();
			this.field2515 = arg0.method140();
			this.field2508 = arg0.method145();
		}
		if (this.field2520 != 1 && this.field2520 != 4 && this.field2520 != 5 && this.field2520 != 6) {
			return;
		}
		this.field2482 = arg0.method140();
		if (this.field2482.method10() != 0) {
			return;
		}
		if (this.field2520 == 1) {
			this.field2482 = Statics.field2056;
		}
		if (this.field2520 == 4) {
			this.field2482 = Statics.field1152;
		}
		if (this.field2520 == 5) {
			this.field2482 = Statics.field1152;
		}
		if (this.field2520 != 6) {
			return;
		}
		this.field2482 = Statics.field218;
	}

	@ObfuscatedName("qd.a(BI)Ljd;")
	public Pix32 method852(int arg0) {
		Statics.field3116 = false;
		if (arg0 < 0 || this.field2510.length <= arg0) {
			return null;
		}
		int var2 = this.field2510[arg0];
		if (var2 == -1) {
			return null;
		}
		Pix32 var3 = (Pix32) Statics.field500.find((long) var2);
		if (var3 != null) {
			return var3;
		}
		Pix32 var4 = PixLoader.method846(0, field2810, var2);
		if (var4 == null) {
			Statics.field3116 = true;
		} else {
			Statics.field500.method262((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("qd.a(IZ)Ljd;")
	public Pix32 method857(boolean arg0) {
		Statics.field3116 = false;
		int var2;
		if (arg0) {
			var2 = this.field2476;
		} else {
			var2 = this.field2550;
		}
		if (var2 == -1) {
			return null;
		}
		Pix32 var3 = (Pix32) Statics.field500.find((long) var2);
		if (var3 != null) {
			return var3;
		}
		Pix32 var4 = PixLoader.method846(0, field2810, var2);
		if (var4 == null) {
			Statics.field3116 = true;
		} else {
			Statics.field500.method262((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("qd.a(BLba;)V")
	public void method858(Packet arg0) {
		arg0.method144();
		this.field2442 = true;
		this.field2489 = arg0.method144();
		this.field2445 = arg0.method145();
		this.field2455 = this.field2462 = arg0.method139();
		this.field2549 = this.field2502 = arg0.method139();
		this.field2498 = arg0.method145();
		if (this.field2489 == 9) {
			this.field2449 = arg0.method139();
		} else {
			this.field2449 = arg0.method145();
		}
		this.field2454 = arg0.method145();
		if (this.field2454 == 65535) {
			this.field2454 = -1;
		}
		this.field2556 = arg0.method144() == 1;
		this.field2494 = arg0.method144() == 1;
		if (this.field2489 == 0) {
			this.field2552 = arg0.method145();
			this.field2537 = arg0.method145();
		}
		if (this.field2489 == 5) {
			this.field2550 = arg0.method167();
			this.field2557 = arg0.method145();
			this.field2447 = arg0.method144() == 1;
			this.field2551 = arg0.method144();
		}
		if (this.field2489 == 6) {
			this.field2493 = 1;
			this.field2479 = arg0.method145();
			if (this.field2479 == 65535) {
				this.field2479 = -1;
			}
			this.field2543 = arg0.method139();
			this.field2485 = arg0.method139();
			this.field2496 = arg0.method145();
			this.field2463 = arg0.method145();
			this.field2531 = arg0.method145();
			this.field2534 = arg0.method145();
			this.field2465 = arg0.method145();
			if (this.field2465 == 65535) {
				this.field2465 = -1;
			}
			this.field2507 = arg0.method144() == 1;
		}
		if (this.field2489 == 4) {
			this.field2448 = arg0.method145();
			this.field2474 = arg0.method140();
			this.field2538 = arg0.method144();
			this.field2539 = arg0.method144();
			this.field2521 = arg0.method144();
			this.field2471 = arg0.method144() == 1;
			this.field2453 = arg0.method167();
		}
		if (this.field2489 == 3) {
			this.field2453 = arg0.method167();
			this.field2451 = arg0.method144() == 1;
			this.field2551 = arg0.method144();
		}
		if (this.field2489 == 9) {
			arg0.method144();
			this.field2453 = arg0.method167();
		}
		if (!this.field2494) {
			return;
		}
		this.field2483 = Statics.method526(arg0);
		this.field2487 = Statics.method526(arg0);
		this.field2450 = Statics.method526(arg0);
		this.field2513 = Statics.method526(arg0);
		this.field2464 = Statics.method526(arg0);
		this.field2478 = Statics.method526(arg0);
		this.field2475 = Statics.method526(arg0);
		Statics.method526(arg0);
		this.field2456 = Statics.method526(arg0);
		this.field2518 = Statics.method526(arg0);
		Statics.method526(arg0);
		this.field2501 = Statics.method526(arg0);
		this.field2553 = Statics.method526(arg0);
		this.field2486 = Statics.method526(arg0);
		this.field2533 = arg0.method144() == 1;
		this.field2542 = arg0.method145();
		this.field2500 = arg0.method144() == 1;
		arg0.method144();
		int var2 = arg0.method144();
		if (var2 > 0) {
			this.field2467 = new JagString[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.field2467[var3] = arg0.method140();
			}
		}
		this.field2544 = arg0.method145();
		if (this.field2544 == 65535) {
			this.field2544 = -1;
			return;
		}
	}

	@ObfuscatedName("qd.a(BLhe;IZLla;)Lpa;")
	public Model method860(SeqType arg0, int arg1, boolean arg2, PlayerModel arg3) {
		Statics.field3116 = false;
		int var5;
		int var6;
		if (arg2) {
			var5 = this.field2517;
			var6 = this.field2457;
		} else {
			var6 = this.field2493;
			var5 = this.field2479;
		}
		if (var6 == 0) {
			return null;
		} else if (var6 == 1 && var5 == -1) {
			return null;
		} else {
			Model var7 = (Model) field2680.find((long) ((var6 << 16) + var5));
			if (var7 == null) {
				if (var6 == 1) {
					var7 = Model.method798(field503, var5);
					if (var7 == null) {
						Statics.field3116 = true;
						return null;
					}
					var7.method778();
					var7.method770(64, 768, -50, -10, -50, true);
				}
				if (var6 == 2) {
					var7 = NpcType.method864(var5).method455();
					if (var7 == null) {
						Statics.field3116 = true;
						return null;
					}
					var7.method778();
					var7.method770(64, 768, -50, -10, -50, true);
				}
				if (var6 == 3) {
					if (arg3 == null) {
						return null;
					}
					var7 = arg3.method639();
					if (var7 == null) {
						Statics.field3116 = true;
						return null;
					}
					var7.method778();
					var7.method770(64, 768, -50, -10, -50, true);
				}
				if (var6 == 4) {
					ObjType var8 = ObjType.method760(var5);
					var7 = var8.method954(false, 10);
					if (var7 == null) {
						Statics.field3116 = true;
						return null;
					}
					var7.method778();
					var7.method770(var8.field2856 + 64, var8.field2871 + 768, -50, -10, -50, true);
				}
				field2680.method262((long) ((var6 << 16) + var5), var7);
			}
			if (arg0 != null) {
				var7 = arg0.method493(arg1, var7);
			}
			return var7;
		}
	}

	@ObfuscatedName("qd.d(B)Lbc;")
	public PixFont method861() {
		Statics.field3116 = false;
		if (this.field2448 == 65535) {
			return null;
		}
		PixFont var1 = (PixFont) Statics.field3249.find((long) this.field2448);
		if (var1 != null) {
			return var1;
		}
		PixFont var2 = Statics.method294(0, field2810, this.field2448);
		if (var2 == null) {
			Statics.field3116 = true;
		} else {
			Statics.field3249.method262((long) this.field2448, var2);
		}
		return var2;
	}
}
