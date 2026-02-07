package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ac")
public final class VarBitType extends Linkable2 {

	@ObfuscatedName("kd.v")
	public static Js5 field1715;
	@ObfuscatedName("j.vb")
	public static LruCache field1406 = new LruCache(64);

	@ObfuscatedName("ac.eb")
	public int field75;

	@ObfuscatedName("ac.hb")
	public int field78;

	@ObfuscatedName("ac.V")
	public int field66;

	@ObfuscatedName("ld.a(IB)Lac;")
	public static VarBitType method636(int arg0) {
		VarBitType var1 = (VarBitType) field1406.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1715.getFile(14, arg0);
		VarBitType var3 = new VarBitType();
		if (var2 != null) {
			var3.method13(new Packet(var2));
		}
		field1406.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("dd.a(Lea;I)V")
	public static void init(Js5 arg0) {
		field1715 = arg0;
	}

	@ObfuscatedName("cb.f(I)V")
	public static void method128() {
		field1406.clear();
	}

	@ObfuscatedName("ac.a(Ljd;I)V")
	public void method13(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method14(var2, arg0);
		}
	}

	@ObfuscatedName("ac.a(BILjd;)V")
	public void method14(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field75 = arg1.g2();
			this.field66 = arg1.g1();
			this.field78 = arg1.g1();
		}
	}
}
