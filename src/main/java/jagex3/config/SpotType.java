package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ec")
public final class SpotType extends Linkable2 {

	@ObfuscatedName("ob.a")
	public static LruCache field2152 = new LruCache(64);
	@ObfuscatedName("g.v")
	public static Js5 field999;
	@ObfuscatedName("mb.Z")
	public static LruCache field1841 = new LruCache(30);
	@ObfuscatedName("ec.Fb")
	public int field794 = 0;

	@ObfuscatedName("ec.Kb")
	public int field799 = 0;

	@ObfuscatedName("ec.Pb")
	public int field804 = 128;

	@ObfuscatedName("ec.xb")
	public int field786 = -1;

	@ObfuscatedName("ec.Tb")
	public final int[] field808 = new int[6];

	@ObfuscatedName("ec.Sb")
	public int field807 = 0;

	@ObfuscatedName("ec.Xb")
	public int field812 = 128;

	@ObfuscatedName("ec.Wb")
	public final int[] field811 = new int[6];

	@ObfuscatedName("ec.Db")
	public int field792;

	@ObfuscatedName("ec.Ub")
	public int field809;

	@ObfuscatedName("n.a(II)Lec;")
	public static SpotType method713(int arg0) {
		SpotType var1 = (SpotType) field2152.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field999.method217(arg0, 13);
		SpotType var3 = new SpotType();
		var3.field809 = arg0;
		if (var2 != null) {
			var3.method373(new Packet(var2));
		}
		field2152.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("s.a(ILbd;Lbd;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		Statics.field1901 = arg0;
		field999 = arg1;
	}

	@ObfuscatedName("uc.e(I)V")
	public static void method995() {
		field2152.clear();
		field1841.clear();
	}

	@ObfuscatedName("ec.a(IBLba;)V")
	public void method369(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field792 = arg1.g2();
		} else if (arg0 == 2) {
			this.field786 = arg1.g2();
		} else if (arg0 == 4) {
			this.field804 = arg1.g2();
		} else if (arg0 == 5) {
			this.field812 = arg1.g2();
		} else if (arg0 == 6) {
			this.field807 = arg1.g2();
		} else if (arg0 == 7) {
			this.field799 = arg1.g1();
		} else if (arg0 == 8) {
			this.field794 = arg1.g1();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.field808[arg0 - 40] = arg1.g2();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.field811[arg0 - 50] = arg1.g2();
		}
	}

	@ObfuscatedName("ec.a(II)Lpa;")
	public Model method371(int arg0) {
		Model var2 = (Model) field1841.find((long) this.field809);
		if (var2 == null) {
			var2 = Model.method798(Statics.field1901, this.field792);
			if (var2 == null) {
				return null;
			}
			for (int var3 = 0; var3 < 6; var3++) {
				if (this.field808[0] != 0) {
					var2.method771(this.field808[var3], this.field811[var3]);
				}
			}
			var2.method778();
			var2.method770(this.field799 + 64, this.field794 + 850, -30, -50, -30, true);
			field1841.method262((long) this.field809, var2);
		}
		Model var4;
		if (this.field786 == -1 || arg0 == -1) {
			var4 = var2.method774(true);
		} else {
			var4 = SeqType.method103(this.field786).method492(var2, arg0);
		}
		if (this.field804 != 128 || this.field812 != 128) {
			var4.method789(this.field804, this.field812, this.field804);
		}
		if (this.field807 != 0) {
			if (this.field807 == 90) {
				var4.method781();
			}
			if (this.field807 == 180) {
				var4.method781();
				var4.method781();
			}
			if (this.field807 == 270) {
				var4.method781();
				var4.method781();
				var4.method781();
			}
		}
		return var4;
	}

	@ObfuscatedName("ec.a(Lba;B)V")
	public void method373(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method369(var2, arg0);
		}
	}
}
