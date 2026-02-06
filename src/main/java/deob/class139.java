package deob;

@ObfuscatedName("u")
public final class class139 extends class13 {

	@ObfuscatedName("u.H")
	public static class47 field3202 = new class47(5000);

	@ObfuscatedName("u.P")
	public static int field3210 = 0;

	@ObfuscatedName("u.O")
	public static volatile int field3209 = 0;

	@ObfuscatedName("u.R")
	public static class32 field3212 = class73.method593("<col=ffffff>", true);

	@ObfuscatedName("u.M")
	public int field3207 = 0;

	@ObfuscatedName("u.Q")
	public static int field3211;

	@ObfuscatedName("u.a(Lea;BLea;)V")
	public static void method1044(class30 arg0, class30 arg1) {
		class13.field226 = arg1;
		class15.field307 = arg0;
		class91.field2081 = class13.field226.method200(3);
	}

	@ObfuscatedName("u.a(Lea;I)V")
	public static void method1045(class30 arg0) {
		class44.field1031 = arg0;
		class61.field1361 = class44.field1031.method200(16);
	}

	@ObfuscatedName("u.a(Ljd;I)V")
	public void method1043(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method1047(arg0, var2);
		}
	}

	@ObfuscatedName("u.a(Ljd;II)V")
	public void method1047(class66 arg0, int arg1) {
		if (arg1 == 2) {
			this.field3207 = arg0.method531();
		}
	}
}
