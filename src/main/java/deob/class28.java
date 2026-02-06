package deob;

@ObfuscatedName("df")
public final class class28 {

	@ObfuscatedName("df.a")
	public static class32 field505 = class73.method593("Please wait 1 minute and try again)3", true);

	@ObfuscatedName("df.b")
	public static int field506 = 0;

	@ObfuscatedName("df.d")
	public static class32 field508 = field505;

	@ObfuscatedName("df.e")
	public static class32 field509 = field505;

	@ObfuscatedName("df.h")
	public static int[] field512 = new int[100];

	@ObfuscatedName("df.i")
	public static class32 field513 = class73.method593("Take", true);

	@ObfuscatedName("df.c")
	public static class32 field507 = field513;

	@ObfuscatedName("df.k")
	public static class49[] field515;

	@ObfuscatedName("df.l")
	public static class32 field516 = class73.method593("leuchten3:", true);

	@ObfuscatedName("df.a(II)Lec;")
	public static class32 method191(int arg0) {
		return class52.method402(new class32[] { class159.method1228(arg0 >> 24 & 0xFF), class64.field1477, class159.method1228(arg0 >> 16 & 0xFF), class64.field1477, class159.method1228(arg0 >> 8 & 0xFF), class64.field1477, class159.method1228(arg0 & 0xFF) });
	}

	@ObfuscatedName("df.b(II)Z")
	public static boolean method192(int arg0) {
		if (class92.field2119[arg0]) {
			return true;
		} else if (class85.field1991.method203(arg0)) {
			int var1 = class85.field1991.method200(arg0);
			if (var1 == 0) {
				class92.field2119[arg0] = true;
				return true;
			}
			if (class79.field1825[arg0] == null) {
				class79.field1825[arg0] = new class36[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (class79.field1825[arg0][var2] == null) {
					byte[] var3 = class85.field1991.method206(arg0, var2);
					if (var3 != null) {
						class79.field1825[arg0][var2] = new class36();
						class79.field1825[arg0][var2].field743 = (arg0 << 16) + var2;
						if (var3[0] == -1) {
							class79.field1825[arg0][var2].method311(new class66(var3));
						} else {
							class79.field1825[arg0][var2].method308(new class66(var3));
						}
					}
				}
			}
			class92.field2119[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("df.a(ILea;II)Z")
	public static boolean method193(int arg0, class30 arg1, int arg2) {
		byte[] var3 = arg1.method206(arg0, arg2);
		if (var3 == null) {
			return false;
		} else {
			class54.method427(var3);
			return true;
		}
	}

	@ObfuscatedName("df.a(I)V")
	public static void method194() {
		field509 = null;
		field508 = null;
		field515 = null;
		field512 = null;
		field505 = null;
		field516 = null;
		field507 = null;
		field513 = null;
	}
}
