package deob;

@ObfuscatedName("wa")
public final class class240 {

	@ObfuscatedName("wa.a")
	public static final class88 field4453 = class208.method1423(105, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@ObfuscatedName("wa.b")
	public static final int[] field4454 = new int[256];

	@ObfuscatedName("wa.d")
	public static class44 field4456;

	@ObfuscatedName("wa.f")
	public static int field4458 = 0;

	@ObfuscatedName("wa.g")
	public static final class88 field4459 = class208.method1423(105, "mod_icons");

	@ObfuscatedName("wa.h")
	public static class193[] field4460;

	@ObfuscatedName("wa.a(II)I")
	public static int method1585(int arg0) {
		return arg0 >>> 10;
	}

	@ObfuscatedName("wa.a(ZIJZ)Li;")
	public static class88 method1586(long arg0) {
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
		class88 var9 = new class88();
		var9.field1643 = var6;
		var9.field1660 = var5;
		return var9;
	}
}
