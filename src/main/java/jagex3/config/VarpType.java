package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ie")
public final class VarpType extends Linkable2 {

	@ObfuscatedName("ie.U")
	public static int field1358 = -1;

	@ObfuscatedName("ga.rb")
	public static Js5 field1031;
	@ObfuscatedName("ab.o")
	public static LruCache field43 = new LruCache(64);

	@ObfuscatedName("ie.N")
	public int field1351 = 0;

	@ObfuscatedName("ie.V")
	public static int field1359;

	@ObfuscatedName("ie.X")
	public static int field1361;

	@ObfuscatedName("i.b(II)Lie;")
	public static VarpType method440(int arg0) {
		VarpType var1 = (VarpType) field43.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1031.getFile(16, arg0);
		VarpType var3 = new VarpType();
		if (var2 != null) {
			var3.method460(new Packet(var2));
		}
		field43.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("u.a(Lea;I)V")
	public static void init(Js5 arg0) {
		field1031 = arg0;
		field1361 = field1031.method200(16);
	}

	@ObfuscatedName("ie.b(Ljd;B)V")
	public void method460(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method463(arg0, var2);
		}
	}

	@ObfuscatedName("ie.a(Ljd;II)V")
	public void method463(Packet arg0, int arg1) {
		if (arg1 == 5) {
			this.field1351 = arg0.g2();
		}
	}
}
