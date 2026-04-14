package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("qa")
public final class VarpType extends Linkable2 {

	@ObfuscatedName("de.g")
	public static LruCache field727 = new LruCache(64);
	@ObfuscatedName("vc.v")
	public static Js5 field3167;
	@ObfuscatedName("tc.d")
	public static int field2915;
	@ObfuscatedName("qa.Hb")
	public int field2404 = 0;

	@ObfuscatedName("vd.a(BI)Lqa;")
	public static VarpType method1023(int arg0) {
		VarpType var1 = (VarpType) field727.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3167.method217(arg0, 16);
		VarpType var3 = new VarpType();
		if (var2 != null) {
			var3.method838(new Packet(var2));
		}
		field727.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("client.a(Lbd;Z)V")
	public static void init(Js5 arg0) {
		field3167 = arg0;
		field2915 = field3167.method235(16);
	}

	@ObfuscatedName("bb.c(I)V")
	public static void method191() {
		field727.clear();
	}

	@ObfuscatedName("qa.a(Lba;I)V")
	public void method838(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method839(var2, arg0);
		}
	}

	@ObfuscatedName("qa.a(IILba;)V")
	public void method839(int arg0, Packet arg1) {
		if (arg0 == 5) {
			this.field2404 = arg1.g2();
		}
	}
}
