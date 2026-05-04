package deob;

@ObfuscatedName("v")
public final class VarpType extends Linkable2 {

	@ObfuscatedName("ki.c")
	public static final LruCache field2133 = new LruCache(64);
	@ObfuscatedName("jh.k")
	public static Js5 field1931;
	@ObfuscatedName("ce.T")
	public static int field465;

	@ObfuscatedName("v.J")
	public int field4288 = 0;

	@ObfuscatedName("jh.a(IB)Lv;")
	public static VarpType method732(int arg0) {
		VarpType var1 = (VarpType) field2133.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1931.getFile(arg0, 16);
		VarpType var3 = new VarpType();
		if (var2 != null) {
			var3.method1528(new Packet(var2));
		}
		field2133.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("sh.b(I)V")
	public static void resetCache() {
		field2133.clear();
	}

	@ObfuscatedName("ng.a(Lnb;I)V")
	public static void init(Js5 arg0) {
		field1931 = arg0;
		field465 = field1931.getFileIdLimit(16);
	}

	@ObfuscatedName("v.a(ILea;B)V")
	public void method1527(int arg0, Packet arg1) {
		if (arg0 == 5) {
			this.field4288 = arg1.g2();
		}
	}

	@ObfuscatedName("v.a(ZLea;)V")
	public void method1528(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1527(var2, arg0);
		}
	}
}
