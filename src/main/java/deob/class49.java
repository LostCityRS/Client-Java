package deob;

@ObfuscatedName("ed")
public final class class49 {

	@ObfuscatedName("ed.a")
	public static int field911;

	@ObfuscatedName("ed.b")
	public static class163 field912;

	@ObfuscatedName("ed.d")
	public static final class88 field914 = class208.method1423(105, " )2> <col=ffffff>");

	@ObfuscatedName("ed.e")
	public static final class88 field915 = class208.method1423(105, ")4slr2)3ws?order=LPWM");

	@ObfuscatedName("ed.f")
	public static final class88 field916 = class208.method1423(105, "Loading config )2 ");

	@ObfuscatedName("ed.g")
	public static class26 field917;

	@ObfuscatedName("ed.h")
	public static class88 field918 = field916;

	@ObfuscatedName("ed.i")
	public static int field919 = 0;

	@ObfuscatedName("ed.j")
	public static final class88 field920 = class208.method1423(105, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@ObfuscatedName("ed.k")
	public static short field921 = 205;

	@ObfuscatedName("ed.m")
	public static class174 field923 = null;

	@ObfuscatedName("ed.n")
	public static int field924 = 0;

	@ObfuscatedName("ed.a(IIIIIIII)V")
	public static void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (class67.field1207 <= arg5 && class12.field183 >= arg0 && arg2 >= field919 && arg6 <= class18.field279) {
			class192.method1333(arg4, arg2, arg6, arg3, arg5, arg0, arg1);
		} else {
			class147.method986(arg4, arg0, arg2, arg5, arg6, arg3, arg1);
		}
	}

	@ObfuscatedName("ed.a(Lrh;I)V")
	public static void method369(class193 arg0) {
		for (int var1 = 0; var1 < class221.field4169.length; var1++) {
			class221.field4169[var1] = 0;
		}
		for (int var2 = 0; var2 < 5000; var2++) {
			int var3 = (int) ((double) 256 * 128.0D * Math.random());
			class221.field4169[var3] = (int) (Math.random() * 256.0D);
		}
		for (int var4 = 0; var4 < 20; var4++) {
			for (int var5 = 1; var5 < 255; var5++) {
				for (int var6 = 1; var6 < 127; var6++) {
					int var7 = (var5 << 7) + var6;
					class113.field2049[var7] = (class221.field4169[var7 - 128] + class221.field4169[var7 + 1] + class221.field4169[var7 - 1] + class221.field4169[var7 - -128]) / 4;
				}
			}
			int[] var8 = class221.field4169;
			class221.field4169 = class113.field2049;
			class113.field2049 = var8;
		}
		if (arg0 == null) {
			return;
		}
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.field2437; var10++) {
			for (int var11 = 0; var11 < arg0.field2434; var11++) {
				if (arg0.field3704[var9++] != 0) {
					int var12 = arg0.field2438 + var11 + 16;
					int var13 = arg0.field2432 + var10 + 16;
					int var14 = var12 + (var13 << 7);
					class221.field4169[var14] = 0;
				}
			}
		}
	}
}
