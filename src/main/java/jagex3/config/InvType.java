package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ke")
public final class InvType extends Linkable2 {

	@ObfuscatedName("be.b")
	public static final LruCache field251 = new LruCache(64);

	@ObfuscatedName("client.Z")
	public static Js5 field567;

	@ObfuscatedName("ke.R")
	public int field2067 = 0;

	@ObfuscatedName("g.a(II)Lke;")
	public static InvType method458(int arg0) {
		InvType var1 = (InvType) field251.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field567.getFile(arg0, 5);
		InvType var3 = new InvType();
		if (var2 != null) {
			var3.method775(new Packet(var2));
		}
		field251.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("re.a(Lnb;I)V")
	public static void init(Js5 arg0) {
		field567 = arg0;
	}

	@ObfuscatedName("ke.a(Lea;B)V")
	public void method775(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method778(var2, arg0);
		}
	}

	@ObfuscatedName("ke.a(ILea;I)V")
	public void method778(int arg0, Packet arg1) {
		if (arg0 == 2) {
			this.field2067 = arg1.g2();
		}
	}
}
