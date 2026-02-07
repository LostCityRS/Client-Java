package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ac")
public final class VarBitType extends Linkable2 {

	@ObfuscatedName("kd.v")
	public static Js5 configClient;

	@ObfuscatedName("j.vb")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ac.eb")
	public int basevar;

	@ObfuscatedName("ac.hb")
	public int endbit;

	@ObfuscatedName("ac.V")
	public int startbit;

	@ObfuscatedName("dd.a(Lea;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("ld.a(IB)Lac;")
	public static VarBitType list(int arg0) {
		VarBitType var1 = (VarBitType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(14, arg0);
		VarBitType var3 = new VarBitType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ac.a(Ljd;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("ac.a(BILjd;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.basevar = arg1.g2();
			this.startbit = arg1.g1();
			this.endbit = arg1.g1();
		}
	}

	@ObfuscatedName("cb.f(I)V")
	public static void resetCache() {
		recentUse.clear();
	}
}
