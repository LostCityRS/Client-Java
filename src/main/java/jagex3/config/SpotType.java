package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ta")
public final class SpotType extends Linkable2 {

	@ObfuscatedName("fe.R")
	public static Js5 field970;
	@ObfuscatedName("we.A")
	public static Js5 field3634;
	@ObfuscatedName("nd.k")
	public static LruCache field2170 = new LruCache(64);
	@ObfuscatedName("ge.Wb")
	public static LruCache field1115 = new LruCache(30);
	@ObfuscatedName("ta.db")
	public int field3059 = 0;

	@ObfuscatedName("ta.ib")
	public int field3064 = 0;

	@ObfuscatedName("ta.ob")
	public int field3070;

	@ObfuscatedName("ta.pb")
	public short[] field3071;

	@ObfuscatedName("ta.rb")
	public int field3073 = 0;

	@ObfuscatedName("ta.sb")
	public int field3074 = 128;

	@ObfuscatedName("ta.Ob")
	public int field3096 = -1;

	@ObfuscatedName("ta.xb")
	public int field3079 = 128;

	@ObfuscatedName("ta.J")
	public int field3039;

	@ObfuscatedName("ta.Z")
	public short[] field3055;

	@ObfuscatedName("ta.Ub")
	public short[] field3102;

	@ObfuscatedName("ta.Wb")
	public short[] field3104;

	@ObfuscatedName("fb.b(II)Lta;")
	public static SpotType method316(int arg0) {
		SpotType var1 = (SpotType) field2170.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field970.getFile(13, arg0);
		SpotType var3 = new SpotType();
		var3.field3070 = arg0;
		if (var2 != null) {
			var3.method1013(new Packet(var2));
		}
		field2170.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ab.a(BLea;Lea;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field970 = arg1;
		field3634 = arg0;
	}

	@ObfuscatedName("oe.a(I)V")
	public static void method821() {
		field2170.clear();
		field1115.clear();
	}

	@ObfuscatedName("ta.a(ILjd;)V")
	public void method1013(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1015(var2, arg0);
		}
	}

	@ObfuscatedName("ta.a(ZILjd;)V")
	public void method1015(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field3039 = arg1.g2();
		} else if (arg0 == 2) {
			this.field3096 = arg1.g2();
		} else if (arg0 == 4) {
			this.field3079 = arg1.g2();
		} else if (arg0 == 5) {
			this.field3074 = arg1.g2();
		} else if (arg0 == 6) {
			this.field3059 = arg1.g2();
		} else if (arg0 == 7) {
			this.field3073 = arg1.g1();
		} else if (arg0 == 8) {
			this.field3064 = arg1.g1();
		} else if (arg0 == 40) {
			int var5 = arg1.g1();
			this.field3071 = new short[var5];
			this.field3055 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field3071[var6] = (short) arg1.g2();
				this.field3055[var6] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.g1();
			this.field3104 = new short[var3];
			this.field3102 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field3102[var4] = (short) arg1.g2();
				this.field3104[var4] = (short) arg1.g2();
			}
			return;
		}
	}

	@ObfuscatedName("ta.c(II)Lod;")
	public ModelLit method1017(int arg0) {
		ModelLit var2 = (ModelLit) field1115.find((long) this.field3070);
		if (var2 == null) {
			ModelUnlit var3 = ModelUnlit.method840(field3634, this.field3039);
			if (var3 == null) {
				return null;
			}
			if (this.field3071 != null) {
				for (int var4 = 0; var4 < this.field3071.length; var4++) {
					var3.method833(this.field3071[var4], this.field3055[var4]);
				}
			}
			if (this.field3102 != null) {
				for (int var5 = 0; var5 < this.field3102.length; var5++) {
					var3.method853(this.field3102[var5], this.field3104[var5]);
				}
			}
			var2 = var3.method847(this.field3073 + 64, this.field3064 + 850, -30, -50, -30);
			field1115.put((long) this.field3070, var2);
		}
		ModelLit var6;
		if (this.field3096 == -1 || arg0 == -1) {
			var6 = var2.method820(true);
		} else {
			var6 = SeqType.method760(this.field3096).method1111(var2, arg0);
		}
		if (this.field3079 != 128 || this.field3074 != 128) {
			var6.method805(this.field3079, this.field3074, this.field3079);
		}
		if (this.field3059 != 0) {
			if (this.field3059 == 90) {
				var6.method801();
			}
			if (this.field3059 == 180) {
				var6.method801();
				var6.method801();
			}
			if (this.field3059 == 270) {
				var6.method801();
				var6.method801();
				var6.method801();
			}
		}
		return var6;
	}
}
