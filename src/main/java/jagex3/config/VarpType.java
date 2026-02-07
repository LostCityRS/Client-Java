package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ie")
public final class VarpType extends Linkable2 {

	@ObfuscatedName("ga.rb")
	public static Js5 configClient;

	@ObfuscatedName("ie.X")
	public static int numDefinitions;

	@ObfuscatedName("ab.o")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ie.N")
	public int clientcode = 0;

	@ObfuscatedName("u.a(Lea;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
		numDefinitions = configClient.getFileIdLimit(16);
	}

	@ObfuscatedName("i.b(II)Lie;")
	public static VarpType list(int arg0) {
		VarpType var1 = (VarpType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(16, arg0);
		VarpType var3 = new VarpType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ie.b(Ljd;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("ie.a(Ljd;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 5) {
			this.clientcode = arg0.g2();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static void resetCache() {
		recentUse.clear();
	}
}
