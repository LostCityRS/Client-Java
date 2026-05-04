package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelSourceCache;
import jagex3.dash3d.ModelUnlit;
import jagex3.dash3d.PlayerModel;
import jagex3.datastruct.LruCache;
import jagex3.graphics.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("q")
public final class IfType {

	@ObfuscatedName("kd.T")
	public static final LruCache field2039 = new LruCache(200);
	@ObfuscatedName("pe.B")
	public static final ModelSourceCache modelCache = new ModelSourceCache(50);
	@ObfuscatedName("oe.d")
	public static final LruCache field3020 = new LruCache(20);
	@ObfuscatedName("pd.Z")
	public static boolean[] open;
	@ObfuscatedName("hh.fb")
	public static Js5 interfaces;
	@ObfuscatedName("ha.D")
	public static IfType[][] list;
	@ObfuscatedName("wi.s")
	public static boolean loadingAsset = false;
	@ObfuscatedName("ib.y")
	public static Js5 field1704;
	@ObfuscatedName("q.a")
	public int field3365 = 0;

	@ObfuscatedName("q.ab")
	public int field3417 = 0;

	@ObfuscatedName("q.ac")
	public int field3469 = 0;

	@ObfuscatedName("q.b")
	public int field3366 = 0;

	@ObfuscatedName("q.bb")
	public int field3418 = 0;

	@ObfuscatedName("q.bc")
	public boolean field3470 = false;

	@ObfuscatedName("q.c")
	public byte field3367 = 0;

	@ObfuscatedName("q.cc")
	public Object[] field3471;

	@ObfuscatedName("q.d")
	public int field3368 = 0;

	@ObfuscatedName("q.db")
	public boolean field3420 = false;

	@ObfuscatedName("q.dc")
	public int[] field3472;

	@ObfuscatedName("q.e")
	public int[] field3369;

	@ObfuscatedName("q.eb")
	public int[] field3421;

	@ObfuscatedName("q.ec")
	public int field3473 = -1;

	@ObfuscatedName("q.f")
	public Object[] field3370;

	@ObfuscatedName("q.fb")
	public int field3422 = 0;

	@ObfuscatedName("q.fc")
	public int[] field3474;

	@ObfuscatedName("q.g")
	public int field3371 = -1;

	@ObfuscatedName("q.gb")
	public int parentId = -1;

	@ObfuscatedName("q.h")
	public int field3372 = 0;

	@ObfuscatedName("q.hb")
	public int field3424 = -1;

	@ObfuscatedName("q.i")
	public JagString[] field3373;

	@ObfuscatedName("q.ib")
	public int field3425 = 0;

	@ObfuscatedName("q.ic")
	public boolean field3477 = false;

	@ObfuscatedName("q.j")
	public int field3374 = 0;

	@ObfuscatedName("q.jb")
	public Object[] field3426;

	@ObfuscatedName("q.jc")
	public boolean field3478 = false;

	@ObfuscatedName("q.k")
	public int field3375 = 0;

	@ObfuscatedName("q.kb")
	public boolean field3427 = false;

	@ObfuscatedName("q.kc")
	public int field3479 = 0;

	@ObfuscatedName("q.l")
	public int field3376 = 1;

	@ObfuscatedName("q.lc")
	public int field3480 = 0;

	@ObfuscatedName("q.m")
	public Object[] field3377;

	@ObfuscatedName("q.mb")
	public int field3429 = 0;

	@ObfuscatedName("q.mc")
	public Object[] field3481;

	@ObfuscatedName("q.n")
	public boolean field3378 = false;

	@ObfuscatedName("q.nb")
	public int field3430 = 1;

	@ObfuscatedName("q.nc")
	public int field3482 = 0;

	@ObfuscatedName("q.o")
	public int field3379 = 0;

	@ObfuscatedName("q.ob")
	public int field3431 = 0;

	@ObfuscatedName("q.oc")
	public boolean field3483;

	@ObfuscatedName("q.p")
	public int field3380 = 0;

	@ObfuscatedName("q.pb")
	public int field3432 = 0;

	@ObfuscatedName("q.pc")
	public Object[] field3484;

	@ObfuscatedName("q.q")
	public Object[] field3381;

	@ObfuscatedName("q.qb")
	public int field3433 = -1;

	@ObfuscatedName("q.qc")
	public int field3485 = 100;

	@ObfuscatedName("q.r")
	public int field3382 = -1;

	@ObfuscatedName("q.rb")
	public Object[] field3434;

	@ObfuscatedName("q.rc")
	public int[] field3486;

	@ObfuscatedName("q.s")
	public JagString field3383 = Statics.field1188;

	@ObfuscatedName("q.sb")
	public boolean field3435 = false;

	@ObfuscatedName("q.sc")
	public int field3487 = 0;

	@ObfuscatedName("q.t")
	public int field3384 = 0;

	@ObfuscatedName("q.tb")
	public Object[] field3436;

	@ObfuscatedName("q.u")
	public int field3385 = 0;

	@ObfuscatedName("q.ub")
	public int field3437 = 0;

	@ObfuscatedName("q.v")
	public int field3386 = -1;

	@ObfuscatedName("q.vc")
	public Object[] field3490;

	@ObfuscatedName("q.w")
	public boolean field3387;

	@ObfuscatedName("q.wb")
	public int field3439 = 0;

	@ObfuscatedName("q.D")
	public byte field3394 = 0;

	@ObfuscatedName("q.C")
	public int field3393 = 0;

	@ObfuscatedName("q.F")
	public int field3396 = 0;

	@ObfuscatedName("q.M")
	public boolean field3403 = false;

	@ObfuscatedName("q.I")
	public int field3399 = -1;

	@ObfuscatedName("q.A")
	public int field3391 = 0;

	@ObfuscatedName("q.X")
	public int field3414 = 0;

	@ObfuscatedName("q.Db")
	public JagString field3446 = Statics.field1188;

	@ObfuscatedName("q.yb")
	public int field3441 = 0;

	@ObfuscatedName("q.O")
	public int field3405 = 0;

	@ObfuscatedName("q.Y")
	public int field3415 = 0;

	@ObfuscatedName("q.Qb")
	public JagString field3459 = Statics.field1188;

	@ObfuscatedName("q.Gb")
	public boolean field3449 = false;

	@ObfuscatedName("q.W")
	public int field3413 = 0;

	@ObfuscatedName("q.S")
	public int field3409 = -1;

	@ObfuscatedName("q.Xb")
	public int field3466 = 0;

	@ObfuscatedName("q.Mb")
	public int field3455 = 0;

	@ObfuscatedName("q.Ib")
	public byte field3451 = 0;

	@ObfuscatedName("q.Zb")
	public int field3468 = 0;

	@ObfuscatedName("q.N")
	public int field3404 = -1;

	@ObfuscatedName("q.Rb")
	public JagString field3460 = Text.field3043;

	@ObfuscatedName("q.P")
	public int field3406 = -1;

	@ObfuscatedName("q.gc")
	public int field3475 = 0;

	@ObfuscatedName("q.Sb")
	public int field3461 = -1;

	@ObfuscatedName("q.xc")
	public boolean field3492 = false;

	@ObfuscatedName("q.Yb")
	public boolean field3467 = false;

	@ObfuscatedName("q.zb")
	public int field3442 = -1;

	@ObfuscatedName("q.Ob")
	public JagString field3457 = Statics.field1188;

	@ObfuscatedName("q.Cc")
	public int field3497 = 1;

	@ObfuscatedName("q.Q")
	public int field3407 = 0;

	@ObfuscatedName("q.Bc")
	public boolean field3496 = false;

	@ObfuscatedName("q.Ub")
	public byte field3463 = 0;

	@ObfuscatedName("q.Tb")
	public int field3462 = -1;

	@ObfuscatedName("q.T")
	public boolean field3410 = false;

	@ObfuscatedName("q.Vb")
	public boolean field3464 = true;

	@ObfuscatedName("q.Hc")
	public IfType field3502 = null;

	@ObfuscatedName("q.Rc")
	public JagString field3512 = Statics.field1188;

	@ObfuscatedName("q.Oc")
	public int field3509 = 0;

	@ObfuscatedName("q.Jc")
	public int field3504 = -1;

	@ObfuscatedName("q.Dc")
	public int field3498 = 0;

	@ObfuscatedName("q.Ec")
	public int field3499 = 0;

	@ObfuscatedName("q.Nc")
	public int field3508 = 0;

	@ObfuscatedName("q.Tc")
	public int field3514 = 0;

	@ObfuscatedName("q.Gc")
	public int field3501 = 0;

	@ObfuscatedName("q.Sc")
	public int field3513 = 0;

	@ObfuscatedName("q.Wc")
	public int field3517 = 0;

	@ObfuscatedName("q.zc")
	public int field3494 = 0;

	@ObfuscatedName("q.z")
	public int field3390;

	@ObfuscatedName("q.yc")
	public byte[] field3493;

	@ObfuscatedName("q.x")
	public int[] field3388;

	@ObfuscatedName("q.y")
	public int[] field3389;

	@ObfuscatedName("q.G")
	public int[] field3397;

	@ObfuscatedName("q.H")
	public int[] field3398;

	@ObfuscatedName("q.L")
	public int[] field3402;

	@ObfuscatedName("q.Hb")
	public int[] field3450;

	@ObfuscatedName("q.Vc")
	public int[] field3516;

	@ObfuscatedName("q.Wb")
	public IfType[] field3465;

	@ObfuscatedName("q.Qc")
	public JagString[] field3511;

	@ObfuscatedName("q.K")
	public Object[] field3401;

	@ObfuscatedName("q.R")
	public Object[] field3408;

	@ObfuscatedName("q.V")
	public Object[] field3412;

	@ObfuscatedName("q.xb")
	public Object[] field3440;

	@ObfuscatedName("q.Ab")
	public Object[] field3443;

	@ObfuscatedName("q.Bb")
	public Object[] field3444;

	@ObfuscatedName("q.Eb")
	public Object[] field3447;

	@ObfuscatedName("q.Fb")
	public Object[] field3448;

	@ObfuscatedName("q.Jb")
	public Object[] field3452;

	@ObfuscatedName("q.Lb")
	public Object[] field3454;

	@ObfuscatedName("q.Nb")
	public Object[] field3456;

	@ObfuscatedName("q.Pb")
	public Object[] field3458;

	@ObfuscatedName("q.Ac")
	public Object[] field3495;

	@ObfuscatedName("q.Ic")
	public Object[] field3503;

	@ObfuscatedName("q.Kc")
	public Object[] field3505;

	@ObfuscatedName("q.Pc")
	public Object[] field3510;

	@ObfuscatedName("q.Xc")
	public Object[] field3518;

	@ObfuscatedName("q.B")
	public int[][] field3392;

	@ObfuscatedName("td.c(II)Z")
	public static boolean openInterface(int arg0) {
		if (open[arg0]) {
			return true;
		}

		if (!interfaces.requestGroupDownload(arg0)) {
			return false;
		}

		int var1 = interfaces.getFileIdLimit(arg0);
		if (var1 == 0) {
			open[arg0] = true;
			return true;
		}

		if (list[arg0] == null) {
			list[arg0] = new IfType[var1];
		}

		for (int var2 = 0; var2 < var1; var2++) {
			if (list[arg0][var2] == null) {
				byte[] var3 = interfaces.getFile(var2, arg0);
				if (var3 != null) {
					list[arg0][var2] = new IfType();
					list[arg0][var2].parentId = var2 + (arg0 << 16);
					if (var3[0] == -1) {
						list[arg0][var2].decode3(new Packet(var3));
					} else {
						list[arg0][var2].decode(new Packet(var3));
					}
				}
			}
		}

		open[arg0] = true;
		return true;
	}

	@ObfuscatedName("ne.a(Z)V")
	public static void resetCache() {
		field2039.clear();
		modelCache.clear();
		field3020.clear();
	}

	@ObfuscatedName("lf.a(Lnb;ILnb;Lnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		field1704 = arg3;
		Statics.field1176 = arg0;
		interfaces = arg1;
		Statics.field1926 = arg2;
		list = new IfType[interfaces.method940()][];
		open = new boolean[interfaces.method940()];
	}

	@ObfuscatedName("da.c(IB)V")
	public static void method233(int arg0) {
		if (arg0 == -1 || !open[arg0]) {
			return;
		}
		interfaces.method955(arg0);
		if (list[arg0] == null) {
			return;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < list[arg0].length; var2++) {
			if (list[arg0][var2] != null) {
				if (list[arg0][var2].field3390 == 2) {
					var1 = false;
				} else {
					list[arg0][var2] = null;
				}
			}
		}
		if (var1) {
			list[arg0] = null;
		}
		open[arg0] = false;
	}

	@ObfuscatedName("q.a(III)V")
	public void swapSlots(int arg0, int arg1) {
		int var3 = this.field3388[arg1];
		this.field3388[arg1] = this.field3388[arg0];
		this.field3388[arg0] = var3;
		int var4 = this.field3474[arg1];
		this.field3474[arg1] = this.field3474[arg0];
		this.field3474[arg0] = var4;
	}

	@ObfuscatedName("q.a(Lk;Ltb;IZI)Lcg;")
	public ModelLit getTempModel(SeqType arg0, PlayerModel arg1, int arg2, boolean arg3) {
		loadingAsset = false;
		int var5;
		int var6;
		if (arg3) {
			var5 = this.field3376;
			var6 = this.field3442;
		} else {
			var5 = this.field3430;
			var6 = this.field3409;
		}
		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else if (var5 == 1) {
			ModelLit var7 = (ModelLit) modelCache.find((long) (var6 + (var5 << 16)));
			if (var7 == null) {
				ModelUnlit var8 = ModelUnlit.load(field1704, var6);
				if (var8 == null) {
					loadingAsset = true;
					return null;
				}
				var7 = var8.light(64, 768, -50, -10, -50);
				modelCache.put((long) ((var5 << 16) + var6), var7);
			}
			if (arg0 != null) {
				var7 = arg0.method758(arg2, var7);
			}
			return var7;
		} else if (var5 == 2) {
			ModelLit var9 = NpcType.list(var6).method864(arg2, arg0);
			if (var9 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var9;
			}
		} else if (var5 == 3) {
			if (arg1 == null) {
				return null;
			}
			ModelLit var10 = arg1.method1428(arg0, arg2);
			if (var10 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var10;
			}
		} else if (var5 == 4) {
			ObjType var11 = ObjType.list(var6);
			ModelLit var12 = var11.method1025(10, arg2, arg0);
			if (var12 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var12;
			}
		} else if (var5 == 6) {
			ModelLit var13 = NpcType.list(var6).method865(null, 0, arg2, arg0);
			if (var13 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var13;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("q.a(I)Z")
	public boolean method1246() {
		if (this.field3402 != null) {
			return true;
		}
		SoftwarePix8 var1 = PixLoader.method1553(Statics.field1176, this.field3473);
		if (var1 == null) {
			return false;
		}
		var1.method1337();
		this.field3402 = new int[var1.field2437];
		this.field3421 = new int[var1.field2437];
		for (int var2 = 0; var2 < var1.field2437; var2++) {
			int var3 = 0;
			int var4 = var1.field2434;
			for (int var5 = 0; var5 < var1.field2434; var5++) {
				if (var1.field3704[var5 + var2 * var1.field2434] != 0) {
					var3 = var5;
					break;
				}
			}
			for (int var6 = var3; var6 < var1.field2434; var6++) {
				if (var1.field3704[var6 + var1.field2434 * var2] == 0) {
					var4 = var6;
					break;
				}
			}
			this.field3402[var2] = var3;
			this.field3421[var2] = var4 - var3;
		}
		return true;
	}

	@ObfuscatedName("q.a(IB)Lrc;")
	public Pix32 method1248(int arg0) {
		loadingAsset = false;
		if (arg0 < 0 || this.field3389.length <= arg0) {
			return null;
		}
		int var2 = this.field3389[arg0];
		if (var2 == -1) {
			return null;
		}
		Pix32 var3 = (Pix32) field2039.method665((long) var2);
		if (var3 != null) {
			return var3;
		}
		Pix32 var4 = PixLoader.method1558(Statics.field1176, var2, 0);
		if (var4 == null) {
			loadingAsset = true;
		} else {
			field2039.method663((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("q.a(ZI)Lrc;")
	public Pix32 method1249(boolean arg0) {
		int var2;
		if (arg0) {
			var2 = this.field3433;
		} else {
			var2 = this.field3473;
		}
		loadingAsset = false;
		if (var2 == -1) {
			return null;
		}
		long var3 = ((long) this.field3425 << 40) + ((this.field3483 ? 1L : 0L) << 39) + ((this.field3387 ? 1L : 0L) << 38) + (long) var2 + ((this.field3477 ? 1L : 0L) << 35) + ((long) this.field3429 << 36);
		Pix32 var5 = (Pix32) field2039.method665(var3);
		if (var5 != null) {
			return var5;
		}
		SoftwarePix32 var6 = PixLoader.method203(Statics.field1176, 0, var2);
		if (var6 == null) {
			loadingAsset = true;
			return null;
		}
		if (this.field3387) {
			var6.method1171();
		}
		if (this.field3483) {
			var6.method1159();
		}
		if (this.field3429 > 0) {
			var6.method1173(this.field3429);
		}
		if (this.field3429 >= 1) {
			var6.method1168(1);
		}
		if (this.field3429 >= 2) {
			var6.method1168(16777215);
		}
		if (this.field3425 != 0) {
			var6.method1154(this.field3425);
		}
		field2039.method663(var3, var6);
		return var6;
	}

	@ObfuscatedName("q.a(BLea;)V")
	public void decode3(Packet arg0) {
		arg0.pos++;
		this.field3410 = true;
		this.field3390 = arg0.g1();
		this.field3439 = arg0.g2();
		this.field3391 = arg0.method334();
		this.field3514 = arg0.method334();
		this.field3501 = arg0.g2();
		this.field3418 = arg0.g2();
		this.field3463 = arg0.g1b();
		this.field3394 = arg0.g1b();
		this.field3367 = arg0.g1b();
		this.field3451 = arg0.g1b();
		this.field3504 = arg0.g2();
		if (this.field3504 == 65535) {
			this.field3504 = -1;
		} else {
			this.field3504 += this.parentId & 0xFFFF0000;
		}
		this.field3378 = arg0.g1() == 1;
		if (this.field3390 == 0) {
			this.field3384 = arg0.g2();
			this.field3375 = arg0.g2();
			this.field3470 = arg0.g1() == 1;
		}
		if (this.field3390 == 5) {
			this.field3473 = arg0.g4();
			this.field3437 = arg0.g2();
			int var2 = arg0.g1();
			this.field3420 = (var2 & 0x1) != 0;
			this.field3477 = (var2 & 0x2) != 0;
			this.field3480 = arg0.g1();
			this.field3429 = arg0.g1();
			this.field3425 = arg0.g4();
			this.field3387 = arg0.g1() == 1;
			this.field3483 = arg0.g1() == 1;
		}
		if (this.field3390 == 6) {
			this.field3430 = 1;
			this.field3409 = arg0.g2();
			if (this.field3409 == 65535) {
				this.field3409 = -1;
			}
			this.field3432 = arg0.method334();
			this.field3405 = arg0.method334();
			this.field3455 = arg0.g2();
			this.field3509 = arg0.g2();
			this.field3517 = arg0.g2();
			this.field3485 = arg0.g2();
			this.field3404 = arg0.g2();
			if (this.field3404 == 65535) {
				this.field3404 = -1;
			}
			this.field3403 = arg0.g1() == 1;
			arg0.g2();
			if (this.field3463 != 0) {
				this.field3468 = arg0.g2();
			}
			if (this.field3394 != 0) {
				this.field3417 = arg0.g2();
			}
		}
		if (this.field3390 == 4) {
			this.field3461 = arg0.g2();
			if (this.field3461 == 65535) {
				this.field3461 = -1;
			}
			this.field3383 = arg0.gjstr();
			this.field3396 = arg0.g1();
			this.field3479 = arg0.g1();
			this.field3469 = arg0.g1();
			this.field3435 = arg0.g1() == 1;
			this.field3414 = arg0.g4();
		}
		if (this.field3390 == 3) {
			this.field3414 = arg0.g4();
			this.field3496 = arg0.g1() == 1;
			this.field3480 = arg0.g1();
		}
		if (this.field3390 == 9) {
			this.field3497 = arg0.g1();
			this.field3414 = arg0.g4();
			this.field3492 = arg0.g1() == 1;
		}
		this.field3494 = arg0.g3();
		int var3 = arg0.g1();
		if (var3 > 0) {
			this.field3493 = new byte[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field3493[var4] = arg0.g1b();
			}
		}
		this.field3457 = arg0.gjstr();
		int var5 = arg0.g1();
		if (var5 > 0) {
			this.field3373 = new JagString[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field3373[var6] = arg0.gjstr();
			}
		}
		this.field3413 = arg0.g1();
		this.field3475 = arg0.g1();
		this.field3427 = arg0.g1() == 1;
		this.field3512 = arg0.gjstr();
		this.field3436 = this.method1254(arg0);
		this.field3370 = this.method1254(arg0);
		this.field3448 = this.method1254(arg0);
		this.field3440 = this.method1254(arg0);
		this.field3447 = this.method1254(arg0);
		this.field3481 = this.method1254(arg0);
		this.field3443 = this.method1254(arg0);
		this.field3454 = this.method1254(arg0);
		this.field3458 = this.method1254(arg0);
		this.field3401 = this.method1254(arg0);
		this.field3510 = this.method1254(arg0);
		this.field3490 = this.method1254(arg0);
		this.field3452 = this.method1254(arg0);
		this.field3408 = this.method1254(arg0);
		this.field3503 = this.method1254(arg0);
		this.field3456 = this.method1254(arg0);
		this.field3412 = this.method1254(arg0);
		this.field3471 = this.method1254(arg0);
		this.field3450 = this.method1251(arg0);
		this.field3369 = this.method1251(arg0);
		this.field3398 = this.method1251(arg0);
	}

	@ObfuscatedName("q.a(Lea;B)[I")
	public int[] method1251(Packet arg0) {
		int var2 = arg0.g1();
		if (var2 == 0) {
			return null;
		}
		int[] var3 = new int[var2];
		for (int var4 = 0; var4 < var2; var4++) {
			var3[var4] = arg0.g4();
		}
		return var3;
	}

	@ObfuscatedName("q.a(I[Llj;)Lcc;")
	public PixfontGeneric method1252(Pix8[] arg0) {
		loadingAsset = false;
		if (this.field3461 == -1) {
			return null;
		}
		PixfontGeneric var2 = (PixfontGeneric) field3020.method665((long) this.field3461);
		if (var2 != null) {
			return var2;
		}
		PixfontGeneric var3 = PixLoader.method735(0, Statics.field1926, this.field3461, Statics.field1176);
		if (var3 == null) {
			loadingAsset = true;
		} else {
			var3.method149(arg0, null);
			field3020.method663((long) this.field3461, var3);
		}
		return var3;
	}

	@ObfuscatedName("q.a(BLi;I)V")
	public void method1253(JagString arg0, int arg1) {
		if (this.field3373 == null || arg1 >= this.field3373.length) {
			JagString[] var3 = new JagString[arg1 + 1];
			if (this.field3373 != null) {
				for (int var4 = 0; var4 < this.field3373.length; var4++) {
					var3[var4] = this.field3373[var4];
				}
			}
			this.field3373 = var3;
		}
		this.field3373[arg1] = arg0;
	}

	@ObfuscatedName("q.a(Lea;I)[Ljava/lang/Object;")
	public Object[] method1254(Packet arg0) {
		int var2 = arg0.g1();
		if (var2 == 0) {
			return null;
		}
		Object[] var3 = new Object[var2];
		for (int var4 = 0; var4 < var2; var4++) {
			int var5 = arg0.g1();
			if (var5 == 0) {
				var3[var4] = Integer.valueOf(arg0.g4());
			} else if (var5 == 1) {
				var3[var4] = arg0.gjstr();
			}
		}
		this.field3449 = true;
		return var3;
	}

	@ObfuscatedName("q.a(ILea;)V")
	public void decode(Packet arg0) {
		this.field3410 = false;
		this.field3390 = arg0.g1();
		this.field3368 = arg0.g1();
		this.field3439 = arg0.g2();
		this.field3391 = arg0.method334();
		this.field3514 = arg0.method334();
		this.field3501 = arg0.g2();
		this.field3418 = arg0.g2();
		this.field3394 = 0;
		this.field3463 = 0;
		this.field3367 = 0;
		this.field3451 = 0;
		this.field3480 = arg0.g1();
		this.field3504 = arg0.g2();
		if (this.field3504 == 65535) {
			this.field3504 = -1;
		} else {
			this.field3504 = (this.parentId & 0xFFFF0000) + this.field3504;
		}
		this.field3424 = arg0.g2();
		if (this.field3424 == 65535) {
			this.field3424 = -1;
		}
		int var2 = arg0.g1();
		if (var2 > 0) {
			this.field3486 = new int[var2];
			this.field3516 = new int[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.field3516[var3] = arg0.g1();
				this.field3486[var3] = arg0.g2();
			}
		}
		int var4 = arg0.g1();
		if (var4 > 0) {
			this.field3392 = new int[var4][];
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = arg0.g2();
				this.field3392[var5] = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					this.field3392[var5][var7] = arg0.g2();
					if (this.field3392[var5][var7] == 65535) {
						this.field3392[var5][var7] = -1;
					}
				}
			}
		}
		if (this.field3390 == 0) {
			this.field3375 = arg0.g2();
			this.field3378 = arg0.g1() == 1;
		}
		if (this.field3390 == 1) {
			arg0.g2();
			arg0.g1();
		}
		if (this.field3390 == 2) {
			this.field3388 = new int[this.field3501 * this.field3418];
			this.field3474 = new int[this.field3418 * this.field3501];
			this.field3394 = 3;
			this.field3463 = 3;
			int var8 = arg0.g1();
			if (var8 == 1) {
				this.field3494 |= 0x10000000;
			}
			int var9 = arg0.g1();
			if (var9 == 1) {
				this.field3494 |= 0x40000000;
			}
			int var10 = arg0.g1();
			if (var10 == 1) {
				this.field3494 |= Integer.MIN_VALUE;
			}
			int var11 = arg0.g1();
			if (var11 == 1) {
				this.field3494 |= 0x20000000;
			}
			this.field3466 = arg0.g1();
			this.field3508 = arg0.g1();
			this.field3389 = new int[20];
			this.field3397 = new int[20];
			this.field3472 = new int[20];
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = arg0.g1();
				if (var13 == 1) {
					this.field3472[var12] = arg0.method334();
					this.field3397[var12] = arg0.method334();
					this.field3389[var12] = arg0.g4();
				} else {
					this.field3389[var12] = -1;
				}
			}
			this.field3511 = new JagString[5];
			for (int var14 = 0; var14 < 5; var14++) {
				JagString var15 = arg0.gjstr();
				if (var15.method604() > 0) {
					this.field3511[var14] = var15;
					this.field3494 |= 0x1 << var14 + 23;
				}
			}
		}
		if (this.field3390 == 3) {
			this.field3496 = arg0.g1() == 1;
		}
		if (this.field3390 == 4 || this.field3390 == 1) {
			this.field3479 = arg0.g1();
			this.field3469 = arg0.g1();
			this.field3396 = arg0.g1();
			this.field3461 = arg0.g2();
			if (this.field3461 == 65535) {
				this.field3461 = -1;
			}
			this.field3435 = arg0.g1() == 1;
		}
		if (this.field3390 == 4) {
			this.field3383 = arg0.gjstr();
			this.field3446 = arg0.gjstr();
		}
		if (this.field3390 == 1 || this.field3390 == 3 || this.field3390 == 4) {
			this.field3414 = arg0.g4();
		}
		if (this.field3390 == 3 || this.field3390 == 4) {
			this.field3513 = arg0.g4();
			this.field3431 = arg0.g4();
			this.field3374 = arg0.g4();
		}
		if (this.field3390 == 5) {
			this.field3473 = arg0.g4();
			this.field3433 = arg0.g4();
		}
		if (this.field3390 == 6) {
			this.field3430 = 1;
			this.field3409 = arg0.g2();
			this.field3376 = 1;
			if (this.field3409 == 65535) {
				this.field3409 = -1;
			}
			this.field3442 = arg0.g2();
			if (this.field3442 == 65535) {
				this.field3442 = -1;
			}
			this.field3404 = arg0.g2();
			if (this.field3404 == 65535) {
				this.field3404 = -1;
			}
			this.field3386 = arg0.g2();
			if (this.field3386 == 65535) {
				this.field3386 = -1;
			}
			this.field3485 = arg0.g2();
			this.field3455 = arg0.g2();
			this.field3509 = arg0.g2();
		}
		if (this.field3390 == 7) {
			this.field3394 = 3;
			this.field3388 = new int[this.field3501 * this.field3418];
			this.field3463 = 3;
			this.field3474 = new int[this.field3501 * this.field3418];
			this.field3479 = arg0.g1();
			this.field3461 = arg0.g2();
			if (this.field3461 == 65535) {
				this.field3461 = -1;
			}
			this.field3435 = arg0.g1() == 1;
			this.field3414 = arg0.g4();
			this.field3466 = arg0.method334();
			this.field3508 = arg0.method334();
			int var16 = arg0.g1();
			this.field3511 = new JagString[5];
			if (var16 == 1) {
				this.field3494 |= 0x40000000;
			}
			for (int var17 = 0; var17 < 5; var17++) {
				JagString var18 = arg0.gjstr();
				if (var18.method604() > 0) {
					this.field3511[var17] = var18;
					this.field3494 |= 0x1 << var17 + 23;
				}
			}
		}
		if (this.field3390 == 8) {
			this.field3383 = arg0.gjstr();
		}
		if (this.field3368 == 2 || this.field3390 == 2) {
			this.field3512 = arg0.gjstr();
			this.field3459 = arg0.gjstr();
			int var19 = arg0.g2() & 0x3F;
			this.field3494 |= var19 << 11;
		}
		if (this.field3368 == 1 || this.field3368 == 4 || this.field3368 == 5 || this.field3368 == 6) {
			this.field3460 = arg0.gjstr();
			if (this.field3460.method604() == 0) {
				if (this.field3368 == 1) {
					this.field3460 = Text.field3043;
				}
				if (this.field3368 == 4) {
					this.field3460 = Text.field4051;
				}
				if (this.field3368 == 5) {
					this.field3460 = Text.field4051;
				}
				if (this.field3368 == 6) {
					this.field3460 = Text.field3665;
				}
			}
		}
		if (this.field3368 == 1 || this.field3368 == 4 || this.field3368 == 5) {
			this.field3494 |= 0x400000;
		}
		if (this.field3368 == 6) {
			this.field3494 |= 0x1;
		}
	}
}
