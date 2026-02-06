package deob;

@ObfuscatedName("lc")
public final class class79 {

	@ObfuscatedName("lc.a")
	public static int field1824;

	@ObfuscatedName("lc.b")
	public static class36[][] field1825;

	@ObfuscatedName("lc.c")
	public static int field1826 = 0;

	@ObfuscatedName("lc.e")
	public static class30 field1828;

	@ObfuscatedName("lc.g")
	public static int field1830 = 0;

	@ObfuscatedName("lc.h")
	public static int[] field1831 = new int[2000];

	@ObfuscatedName("lc.j")
	public static class32 field1833 = class73.method593("Fps:", true);

	@ObfuscatedName("lc.k")
	public static class32 field1834 = class73.method593("Titelbild geladen)3", true);

	@ObfuscatedName("lc.a(IIIII)V")
	public static void method625(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = arg0; var4 <= arg2 + arg0; var4++) {
			for (int var5 = arg1; var5 <= arg3 + arg1; var5++) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class85.field1985[0][var5][var4] = 127;
					if (arg1 == var5 && var5 > 0) {
						class70.field1630[0][var5][var4] = class70.field1630[0][var5 - 1][var4];
					}
					if (var5 == arg1 + arg3 && var5 < 103) {
						class70.field1630[0][var5][var4] = class70.field1630[0][var5 + 1][var4];
					}
					if (arg0 == var4 && var4 > 0) {
						class70.field1630[0][var5][var4] = class70.field1630[0][var5][var4 - 1];
					}
					if (var4 == arg0 + arg2 && var4 < 103) {
						class70.field1630[0][var5][var4] = class70.field1630[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("lc.a(IB)Z")
	public static boolean method626(int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@ObfuscatedName("lc.a(B)V")
	public static void method627() {
		class103.field2426 = new int[4][105][105];
		class31.field590 = new int[105][105];
		class68.field1592 = new int[104];
		class33.field698 = new int[104];
		class85.field1985 = new byte[4][105][105];
		class106.field2511 = new int[104];
		class151.field3472 = 99;
		class143.field3272 = new int[104];
		class117.field2814 = new byte[4][104][104];
		class111.field2612 = new byte[4][104][104];
		class37.field894 = new int[104];
		class134.field3123 = new byte[4][104][104];
		class134.field3129 = new byte[4][104][104];
	}

	@ObfuscatedName("lc.a(BLec;ILec;)V")
	public static void method628(class32 arg0, int arg1, class32 arg2) {
		class97.method756(arg2, arg1, arg0, null);
	}
}
