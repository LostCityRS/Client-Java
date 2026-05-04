package deob;

@ObfuscatedName("oe")
public final class class157 {

	@ObfuscatedName("oe.a")
	public static int field3017 = 0;

	@ObfuscatedName("oe.c")
	public static int field3019;

	@ObfuscatedName("oe.d")
	public static final class92 field3020 = new class92(20);

	@ObfuscatedName("oe.e")
	public class145 field3021;

	@ObfuscatedName("oe.f")
	public static final class88 field3022 = class208.method1423(105, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@ObfuscatedName("oe.g")
	public int field3023;

	@ObfuscatedName("oe.h")
	public int field3024;

	@ObfuscatedName("oe.i")
	public static final class88 field3025 = class208.method1423(105, ":duelstake:");

	@ObfuscatedName("oe.j")
	public static int field3026 = 0;

	@ObfuscatedName("oe.k")
	public int field3027;

	@ObfuscatedName("oe.l")
	public long field3028 = 0L;

	@ObfuscatedName("oe.m")
	public int field3029;

	@ObfuscatedName("oe.o")
	public int field3031;

	@ObfuscatedName("oe.p")
	public class145 field3032;

	@ObfuscatedName("oe.q")
	public static int field3033;

	@ObfuscatedName("oe.r")
	public static int[] field3034;

	@ObfuscatedName("oe.s")
	public static int field3035 = 0;

	@ObfuscatedName("oe.a(III)J")
	public static long method1062(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		return var3 == null || var3.field959 == null ? 0L : var3.field959.field3028;
	}

	@ObfuscatedName("oe.a(II)V")
	public static void method1063(int arg0, int arg1) {
		class52 var2 = class29.field489[0][arg0][arg1];
		for (int var3 = 0; var3 < 3; var3++) {
			class52 var4 = class29.field489[var3][arg0][arg1] = class29.field489[var3 + 1][arg0][arg1];
			if (var4 != null) {
				var4.field966--;
				for (int var5 = 0; var5 < var4.field962; var5++) {
					class108 var6 = var4.field963[var5];
					if ((var6.field1948 >> 29 & 0x3L) == 2L && var6.field1933 == arg0 && var6.field1936 == arg1) {
						var6.field1952--;
					}
				}
			}
		}
		if (class29.field489[0][arg0][arg1] == null) {
			class29.field489[0][arg0][arg1] = new class52(0, arg0, arg1);
		}
		class29.field489[0][arg0][arg1].field951 = var2;
		class29.field489[3][arg0][arg1] = null;
	}
}
