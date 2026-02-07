package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("u")
public final class InvType extends Linkable2 {

	@ObfuscatedName("sd.a")
	public static Js5 configClient;

	@ObfuscatedName("client.W")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("u.M")
	public int size = 0;

	@ObfuscatedName("na.a(II)Lu;")
	public static InvType list(int arg0) {
		InvType var1 = (InvType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(5, arg0);
		InvType var3 = new InvType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ba.a(Lea;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("u.a(Ljd;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("u.a(Ljd;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 2) {
			this.size = arg0.g2();
		}
	}
}
