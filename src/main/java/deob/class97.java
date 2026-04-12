package deob;

@ObfuscatedName("qa")
public final class class97 extends class44 {

	@ObfuscatedName("qa.vb")
	public static int field2392 = 0;

	@ObfuscatedName("qa.Cb")
	public static int field2399 = 0;

	@ObfuscatedName("qa.Ab")
	public static int[] field2397 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("qa.Fb")
	public static volatile boolean field2402 = true;

	@ObfuscatedName("qa.zb")
	public static volatile int field2396 = 0;

	@ObfuscatedName("qa.Hb")
	public int field2404 = 0;

	@ObfuscatedName("qa.a(Lba;I)V")
	public void method838(class8 arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method839(var2, arg0);
		}
	}

	@ObfuscatedName("qa.a(IILba;)V")
	public void method839(int arg0, class8 arg1) {
		if (arg0 == 5) {
			this.field2404 = arg1.method145();
		}
	}
}
