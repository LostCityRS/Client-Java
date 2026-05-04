package deob;

@ObfuscatedName("wa")
public final class class240 {

	@ObfuscatedName("wa.b")
	public static final int[] field4454 = new int[256];

	@ObfuscatedName("wa.f")
	public static int field4458 = 0;

	@ObfuscatedName("wa.h")
	public static SoftwarePix8[] field4460;

	@ObfuscatedName("wa.a(II)I")
	public static int method1585(int arg0) {
		return arg0 >>> 10;
	}

	@ObfuscatedName("wa.a(ZIJZ)Li;")
	public static JagString method1586(long arg0) {
		int var2 = 1;
		for (long var3 = arg0 / (long) 10; var3 != 0L; var3 /= 10) {
			var2++;
		}
		int var5 = var2;
		if (arg0 < 0L) {
			var5 = var2 + 1;
		}
		byte[] var6 = new byte[var5];
		if (arg0 < 0L) {
			var6[0] = 45;
		}
		for (int var7 = 0; var7 < var2; var7++) {
			int var8 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (var8 < 0) {
				var8 = -var8;
			}
			if (var8 > 9) {
				var8 += 39;
			}
			var6[var5 - var7 - 1] = (byte) (var8 + 48);
		}
		JagString var9 = new JagString();
		var9.chars = var6;
		var9.length = var5;
		return var9;
	}
}
