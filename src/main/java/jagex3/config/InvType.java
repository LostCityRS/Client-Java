package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("u")
public final class InvType extends Linkable2 {

	@ObfuscatedName("sd.a")
	public static Js5 field2970;
	@ObfuscatedName("client.W")
	public static LruCache field382 = new LruCache(64);

	@ObfuscatedName("u.M")
	public int field3207 = 0;

	@ObfuscatedName("na.a(II)Lu;")
	public static InvType method724(int arg0) {
		InvType var1 = (InvType) field382.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2970.getFile(5, arg0);
		InvType var3 = new InvType();
		if (var2 != null) {
			var3.method1043(new Packet(var2));
		}
		field382.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ba.a(Lea;I)V")
	public static void init(Js5 arg0) {
		field2970 = arg0;
	}

	@ObfuscatedName("u.a(Ljd;I)V")
	public void method1043(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1047(arg0, var2);
		}
	}

	@ObfuscatedName("u.a(Ljd;II)V")
	public void method1047(Packet arg0, int arg1) {
		if (arg1 == 2) {
			this.field3207 = arg0.g2();
		}
	}
}
