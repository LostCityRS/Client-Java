package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("v")
public final class VarpType extends Linkable2 {

	@ObfuscatedName("ki.c")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("jh.k")
	public static Js5 configClient;
	@ObfuscatedName("ce.T")
	public static int numDefinitions;

	@ObfuscatedName("v.J")
	public int clientcode = 0;

	@ObfuscatedName("jh.a(IB)Lv;")
	public static VarpType list(int arg0) {
		VarpType var1 = (VarpType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 16);
		VarpType var3 = new VarpType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("sh.b(I)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("ng.a(Lnb;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
		numDefinitions = configClient.getFileIdLimit(16);
	}

	@ObfuscatedName("v.a(ILea;B)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 5) {
			this.clientcode = arg1.g2();
		}
	}

	@ObfuscatedName("v.a(ZLea;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}
}
