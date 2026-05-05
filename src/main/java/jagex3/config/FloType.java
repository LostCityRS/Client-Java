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
	public static final LruCache recentUse = new LruCache(64);

	@ObfuscatedName("mh.W")
	public static Js5 configClient;
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
	public int texture = -1;

	@ObfuscatedName("af.X")
	public boolean occlude = true;

	@ObfuscatedName("af.V")
	public int field111 = 0;

	@ObfuscatedName("jc.b(IZ)Laf;")
	public static FloType list(int arg0) {
		FloType var1 = (FloType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 4);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.decode(new Packet(var2), arg0);
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oh.c(I)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("mf.a(BLnb;)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
		field2923 = configClient.getFileIdLimit(4);
	}

	@ObfuscatedName("m.a(IB)I")
	public static int method883(int arg0) {
		return arg0 == 16711935 ? -1 : Statics.method1559(arg0);
	}

	@ObfuscatedName("af.a(ILea;I)V")
	public void decode(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(arg1, var3, arg0);
		}
	}

	@ObfuscatedName("af.a(IIILea;)V")
	public void decode(int arg0, int arg1, Packet arg2) {
		if (arg1 == 1) {
			this.field111 = method883(arg2.g3());
		} else if (arg1 == 2) {
			this.texture = arg2.g1();
		} else if (arg1 == 3) {
			this.texture = arg2.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (arg1 == 5) {
			this.occlude = false;
		} else if (arg1 == 7) {
			this.field104 = method883(arg2.g3());
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
