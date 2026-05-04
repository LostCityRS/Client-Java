package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.dash3d.ModelSourceCache;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("cj")
public final class SpotType extends Linkable2 {

	@ObfuscatedName("mf.a")
	public static final LruCache field2533 = new LruCache(64);
	@ObfuscatedName("va.l")
	public static final ModelSourceCache field4302 = new ModelSourceCache(30);
	@ObfuscatedName("mj.i")
	public static Js5 field2607;
	@ObfuscatedName("fc.i")
	public static Js5 field1114;
	@ObfuscatedName("cj.ab")
	public short[] field549;

	@ObfuscatedName("cj.bb")
	public int field550 = 0;

	@ObfuscatedName("cj.N")
	public static int field536 = 0;

	@ObfuscatedName("cj.L")
	public int field534 = 128;

	@ObfuscatedName("cj.I")
	public int field531 = 0;

	@ObfuscatedName("cj.R")
	public int field540 = 128;

	@ObfuscatedName("cj.D")
	public boolean field527 = false;

	@ObfuscatedName("cj.W")
	public int field545 = 0;

	@ObfuscatedName("cj.T")
	public int field542 = -1;

	@ObfuscatedName("cj.Q")
	public int field539;

	@ObfuscatedName("cj.Y")
	public int field547;

	@ObfuscatedName("cj.G")
	public short[] field529;

	@ObfuscatedName("cj.O")
	public short[] field537;

	@ObfuscatedName("cj.Z")
	public short[] field548;

	@ObfuscatedName("ff.c(IB)Lcj;")
	public static SpotType list(int arg0) {
		SpotType var1 = (SpotType) field2533.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1114.getFile(Statics.method799(arg0), Statics.method928(arg0));
		SpotType var3 = new SpotType();
		var3.field539 = arg0;
		if (var2 != null) {
			var3.method211(new Packet(var2));
		}
		field2533.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.c(I)V")
	public static void resetCache() {
		field2533.clear();
		field4302.clear();
	}

	@ObfuscatedName("td.a(ILnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field2607 = arg0;
		field1114 = arg1;
	}

	@ObfuscatedName("cj.a(ILea;B)V")
	public void method208(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field547 = arg1.g2();
		} else if (arg0 == 2) {
			this.field542 = arg1.g2();
		} else if (arg0 == 4) {
			this.field540 = arg1.g2();
		} else if (arg0 == 5) {
			this.field534 = arg1.g2();
		} else if (arg0 == 6) {
			this.field545 = arg1.g2();
		} else if (arg0 == 7) {
			this.field550 = arg1.g1();
		} else if (arg0 == 8) {
			this.field531 = arg1.g1();
		} else if (arg0 == 9) {
			this.field527 = true;
		} else if (arg0 == 40) {
			int var5 = arg1.g1();
			this.field537 = new short[var5];
			this.field549 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field537[var6] = (short) arg1.g2();
				this.field549[var6] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.g1();
			this.field548 = new short[var3];
			this.field529 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field529[var4] = (short) arg1.g2();
				this.field548[var4] = (short) arg1.g2();
			}
		}
	}

	@ObfuscatedName("cj.a(IB)Lcg;")
	public ModelLit method209(int arg0) {
		ModelLit var2 = (ModelLit) field4302.find((long) this.field539);
		if (var2 == null) {
			ModelUnlit var3 = ModelUnlit.load(field2607, this.field547);
			if (var3 == null) {
				return null;
			}
			if (this.field537 != null) {
				for (int var4 = 0; var4 < this.field537.length; var4++) {
					var3.method564(this.field537[var4], this.field549[var4]);
				}
			}
			if (this.field529 != null) {
				for (int var5 = 0; var5 < this.field529.length; var5++) {
					var3.method553(this.field529[var5], this.field548[var5]);
				}
			}
			var2 = var3.light(this.field550 + 64, this.field531 + 850, -30, -50, -30);
			field4302.put((long) this.field539, var2);
		}
		ModelLit var6;
		if (this.field542 == -1 || arg0 == -1) {
			var6 = var2.method185(true, true);
		} else {
			var6 = SeqType.list(this.field542).method741(var2, arg0);
		}
		if (this.field540 != 128 || this.field534 != 128) {
			var6.method183(this.field540, this.field534, this.field540);
		}
		if (this.field545 != 0) {
			if (this.field545 == 90) {
				var6.method182();
			}
			if (this.field545 == 180) {
				var6.method190();
			}
			if (this.field545 == 270) {
				var6.method181();
			}
		}
		return var6;
	}

	@ObfuscatedName("cj.a(Lea;B)V")
	public void method211(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method208(var2, arg0);
		}
	}
}
