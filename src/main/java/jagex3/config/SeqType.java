package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.AnimFrameSet;
import jagex3.dash3d.ModelLit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("vc")
public final class SeqType extends Linkable2 {

	@ObfuscatedName("lc.e")
	public static Js5 field1828;
	@ObfuscatedName("ab.q")
	public static Js5 field45;
	@ObfuscatedName("te.u")
	public static Js5 field3193;
	@ObfuscatedName("nb.w")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("jb.d")
	public static LruCache framesetCache = new LruCache(100);
	@ObfuscatedName("vc.ab")
	public int[] field3385;

	@ObfuscatedName("vc.bb")
	public int field3386 = -1;

	@ObfuscatedName("vc.cb")
	public int[] field3387;

	@ObfuscatedName("vc.eb")
	public int field3389 = 99;

	@ObfuscatedName("vc.fb")
	public int field3390 = -1;

	@ObfuscatedName("vc.ib")
	public int[] field3393;

	@ObfuscatedName("vc.kb")
	public int field3395 = 2;

	@ObfuscatedName("vc.H")
	public int field3366 = -1;

	@ObfuscatedName("vc.W")
	public int field3381 = -1;

	@ObfuscatedName("vc.X")
	public int field3382 = -1;

	@ObfuscatedName("vc.Z")
	public int field3384 = 5;

	@ObfuscatedName("vc.M")
	public boolean field3371 = false;

	@ObfuscatedName("vc.J")
	public int[] field3368;

	@ObfuscatedName("vc.R")
	public int[] field3376;

	@ObfuscatedName("mc.a(BI)Lrc;")
	public static AnimFrameSet get(int arg0) {
		AnimFrameSet var1 = (AnimFrameSet) framesetCache.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		AnimFrameSet var2 = AnimFrameSet.load(field3193, field45, arg0);
		if (var2 != null) {
			framesetCache.put((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("o.a(BI)Lvc;")
	public static SeqType method760(int arg0) {
		SeqType var1 = (SeqType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1828.method206(12, arg0);
		SeqType var3 = new SeqType();
		if (var2 != null) {
			var3.method1107(new Packet(var2));
		}
		var3.method1115();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("la.a(Lea;Lea;BLea;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		field1828 = arg1;
		field45 = arg2;
		field3193 = arg0;
	}

	@ObfuscatedName("qd.f(I)V")
	public static void method899() {
		recentUse.clear();
		framesetCache.clear();
	}

	@ObfuscatedName("vc.b(Ljd;B)V")
	public void method1107(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1110(arg0, var2);
		}
	}

	@ObfuscatedName("vc.a(IILod;B)Lod;")
	public ModelLit method1109(int arg0, int arg1, ModelLit arg2) {
		int var4 = this.field3393[arg1];
		AnimFrameSet var5 = get(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg2.method799(true);
		}
		int var7 = arg0 & 0x3;
		ModelLit var8 = arg2.method799(!var5.method958(var6));
		if (var7 == 1) {
			var8.method812();
		} else if (var7 == 2) {
			var8.method803();
		} else if (var7 == 3) {
			var8.method801();
		}
		var8.method810(var5, var6);
		if (var7 == 1) {
			var8.method801();
		} else if (var7 == 2) {
			var8.method803();
		} else if (var7 == 3) {
			var8.method812();
		}
		return var8;
	}

	@ObfuscatedName("vc.a(Ljd;IB)V")
	public void method1110(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g2();
			this.field3376 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field3376[var4] = arg0.g2();
			}
			this.field3393 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field3393[var5] = arg0.g2();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field3393[var6] += arg0.g2() << 16;
			}
		} else if (arg1 == 2) {
			this.field3386 = arg0.g2();
		} else if (arg1 == 3) {
			int var7 = arg0.g1();
			this.field3385 = new int[var7 + 1];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field3385[var8] = arg0.g1();
			}
			this.field3385[var7] = 9999999;
		} else if (arg1 == 4) {
			this.field3371 = true;
		} else if (arg1 == 5) {
			this.field3384 = arg0.g1();
		} else if (arg1 == 6) {
			this.field3390 = arg0.g2();
		} else if (arg1 == 7) {
			this.field3366 = arg0.g2();
		} else if (arg1 == 8) {
			this.field3389 = arg0.g1();
		} else if (arg1 == 9) {
			this.field3382 = arg0.g1();
		} else if (arg1 == 10) {
			this.field3381 = arg0.g1();
		} else if (arg1 == 11) {
			this.field3395 = arg0.g1();
		} else if (arg1 == 12) {
			int var9 = arg0.g1();
			this.field3387 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field3387[var10] = arg0.g2();
			}
			for (int var11 = 0; var11 < var9; var11++) {
				this.field3387[var11] = (arg0.g2() << 16) + this.field3387[var11];
			}
			return;
		} else if (arg1 == 13) {
			int var12 = arg0.g1();
			this.field3368 = new int[var12];
			for (int var13 = 0; var13 < var12; var13++) {
				this.field3368[var13] = arg0.g3();
			}
			return;
		}
	}

	@ObfuscatedName("vc.a(ZLod;I)Lod;")
	public ModelLit method1111(ModelLit arg0, int arg1) {
		int var3 = this.field3393[arg1];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method820(true);
		} else {
			ModelLit var6 = arg0.method820(!var4.method958(var5));
			var6.method810(var4, var5);
			return var6;
		}
	}

	@ObfuscatedName("vc.a(IILod;)Lod;")
	public ModelLit method1113(int arg0, ModelLit arg1) {
		int var3 = this.field3393[arg0];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method799(true);
		}
		AnimFrameSet var6 = null;
		int var7 = 0;
		if (this.field3387 != null && arg0 < this.field3387.length) {
			int var8 = this.field3387[arg0];
			var6 = get(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			ModelLit var9 = arg1.method799(!var4.method958(var5));
			var9.method810(var4, var5);
			return var9;
		} else {
			ModelLit var10 = arg1.method799(!var4.method958(var5) & !var6.method958(var7));
			var10.method810(var4, var5);
			var10.method810(var6, var7);
			return var10;
		}
	}

	@ObfuscatedName("vc.a(ILvc;Lod;II)Lod;")
	public ModelLit method1114(int arg0, SeqType arg1, ModelLit arg2, int arg3) {
		int var5 = this.field3393[arg3];
		AnimFrameSet var6 = get(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.method1116(arg2, arg0);
		}
		int var8 = arg1.field3393[arg0];
		AnimFrameSet var9 = get(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			ModelLit var11 = arg2.method799(!var6.method958(var7));
			var11.method810(var6, var7);
			return var11;
		} else {
			ModelLit var12 = arg2.method799(!var6.method958(var7) & !var9.method958(var10));
			var12.method814(var6, var7, var9, var10, this.field3385);
			return var12;
		}
	}

	@ObfuscatedName("vc.f(I)V")
	public void method1115() {
		if (this.field3382 == -1) {
			if (this.field3385 == null) {
				this.field3382 = 0;
			} else {
				this.field3382 = 2;
			}
		}
		if (this.field3381 != -1) {
			return;
		}
		if (this.field3385 == null) {
			this.field3381 = 0;
		} else {
			this.field3381 = 2;
		}
	}

	@ObfuscatedName("vc.a(Lod;II)Lod;")
	public ModelLit method1116(ModelLit arg0, int arg1) {
		int var3 = this.field3393[arg1];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method799(true);
		} else {
			ModelLit var6 = arg0.method799(!var4.method958(var5));
			var6.method810(var4, var5);
			return var6;
		}
	}
}
