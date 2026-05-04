package deob;

@ObfuscatedName("lj")
public abstract class class130 {

	@ObfuscatedName("lj.a")
	public static class188[] field2428;

	@ObfuscatedName("lj.d")
	public static final byte[] field2431;

	@ObfuscatedName("lj.e")
	public int field2432;

	@ObfuscatedName("lj.f")
	public int field2433;

	@ObfuscatedName("lj.g")
	public int field2434;

	@ObfuscatedName("lj.i")
	public static final class88[] field2436 = new class88[8];

	@ObfuscatedName("lj.j")
	public int field2437;

	@ObfuscatedName("lj.k")
	public int field2438;

	@ObfuscatedName("lj.l")
	public int field2439;

	@ObfuscatedName("lj.m")
	public static class22 field2440;

	@ObfuscatedName("lj.n")
	public static final class209 field2441;

	@ObfuscatedName("lj.o")
	public static int field2442;

	static {
		int var0 = 0;
		field2431 = new byte[32896];
		for (int var1 = 0; var1 < 256; var1++) {
			for (int var2 = 0; var2 <= var1; var2++) {
				field2431[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F)));
			}
		}
		field2441 = new class209();
		field2442 = 1;
	}

	@ObfuscatedName("lj.b(II)Lli;")
	public static class129 method878(int arg0) {
		class129 var1 = (class129) class210.field3989.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		class129 var2 = class46.method309(class148.field2778, arg0, class142.field2624);
		if (var2 != null) {
			class210.field3989.method663((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("lj.a(BLi;)V")
	public static void method879(class88 arg0) {
		class244 var1 = class33.method207(arg0);
		if (var1 == null) {
			return;
		}
		class34.field594 = class44.field760 + class119.field2181 - var1.field4485;
		class189.field3659 = var1.field4483 - class16.field239;
		int var2 = class34.field594 - (int) ((double) class90.field1706.field3422 / class59.field1110);
		int var3 = class189.field3659 - (int) ((double) class90.field1706.field3380 / class59.field1110);
		int var4 = class189.field3659 + (int) ((double) class90.field1706.field3380 / class59.field1110);
		if (var3 < 0) {
			class189.field3659 = (int) ((double) class90.field1706.field3380 / class59.field1110);
		}
		int var5 = (int) ((double) class90.field1706.field3422 / class59.field1110) + class34.field594;
		if (var4 > class109.field1988) {
			class189.field3659 = class109.field1988 - (int) ((double) class90.field1706.field3380 / class59.field1110);
		}
		if (var2 < 0) {
			class34.field594 = (int) ((double) class90.field1706.field3422 / class59.field1110);
		}
		if (var5 > class44.field760) {
			class34.field594 = class44.field760 - (int) ((double) class90.field1706.field3422 / class59.field1110);
		}
	}

	@ObfuscatedName("lj.a(II)V")
	public abstract void method876(int arg0, int arg1);

	@ObfuscatedName("lj.a(III)V")
	public abstract void method877(int arg0, int arg1, int arg2);
}
