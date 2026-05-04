package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("af")
public final class FloType extends Linkable2 {

	@ObfuscatedName("b.g")
	public static final LruCache field174 = new LruCache(64);

	@ObfuscatedName("mh.W")
	public static Js5 field2578;
	@ObfuscatedName("nj.b")
	public static int field2923;
	@ObfuscatedName("mb.Z")
	public static int field2489 = 0;

	@ObfuscatedName("af.L")
	public int field103 = 1190717;

	@ObfuscatedName("af.M")
	public int field104 = -1;

	@ObfuscatedName("af.W")
	public int field112 = 16;

	@ObfuscatedName("af.F")
	public int field98 = -1;

	@ObfuscatedName("af.X")
	public boolean field113 = true;

	@ObfuscatedName("af.V")
	public int field111 = 0;

	@ObfuscatedName("jc.b(IZ)Laf;")
	public static FloType method704(int arg0) {
		FloType var1 = (FloType) field174.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2578.getFile(arg0, 4);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.method38(new Packet(var2), arg0);
		}
		field174.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oh.c(I)V")
	public static void resetCache() {
		field174.clear();
	}

	@ObfuscatedName("mf.a(BLnb;)V")
	public static void init(Js5 arg0) {
		field2578 = arg0;
		field2923 = field2578.getFileIdLimit(4);
	}

	@ObfuscatedName("af.a(ILea;I)V")
	public void method38(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.method41(arg1, var3, arg0);
		}
	}

	@ObfuscatedName("af.a(IIILea;)V")
	public void method41(int arg0, int arg1, Packet arg2) {
		if (arg1 == 1) {
			this.field111 = Statics.method883(arg2.g3());
		} else if (arg1 == 2) {
			this.field98 = arg2.g1();
		} else if (arg1 == 3) {
			this.field98 = arg2.g2();
			if (this.field98 == 65535) {
				this.field98 = -1;
			}
		} else if (arg1 == 5) {
			this.field113 = false;
		} else if (arg1 == 7) {
			this.field104 = Statics.method883(arg2.g3());
		} else if (arg1 == 8) {
			field2489 = arg0;
		} else if (arg1 == 9) {
			arg2.g2();
		} else if (arg1 != 10) {
			if (arg1 == 11) {
				arg2.g1();
			} else if (arg1 != 12) {
				if (arg1 == 13) {
					this.field103 = arg2.g3();
				} else if (arg1 == 14) {
					this.field112 = arg2.g1();
				}
			}
		}
	}
}
