package deob;

@ObfuscatedName("sj")
public final class class206 {

	@ObfuscatedName("sj.c")
	public static final class92 field3920 = new class92(100);

	@ObfuscatedName("sj.d")
	public static final class88 field3921 = class208.method1423(105, "Mem:");

	@ObfuscatedName("sj.e")
	public static final class88 field3922 = class208.method1423(105, ")3runescape)3com");

	@ObfuscatedName("sj.f")
	public static int field3923 = 0;

	@ObfuscatedName("sj.a(I)V")
	public static void method1416() {
		int[] var0 = new int[class202.field3855];
		int var1 = 0;
		for (int var2 = 0; var2 < class202.field3855; var2++) {
			class149 var3 = class71.method472(var2);
			if (var3.field2888 >= 0 || var3.field2853 >= 0) {
				var0[var1++] = var2;
			}
		}
		class89.field1698 = new int[var1];
		for (int var4 = 0; var4 < var1; var4++) {
			class89.field1698[var4] = var0[var4];
		}
	}

	@ObfuscatedName("sj.a(Z)J")
	public static synchronized long method1418() {
		long var0 = System.currentTimeMillis();
		if (var0 < class156.field3004) {
			class54.field1002 += class156.field3004 - var0;
		}
		class156.field3004 = var0;
		return var0 + class54.field1002;
	}
}
