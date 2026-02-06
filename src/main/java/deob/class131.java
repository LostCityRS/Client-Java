package deob;

@ObfuscatedName("sf")
public abstract class class131 {

	@ObfuscatedName("sf.b")
	public static class32 field3010 = null;

	@ObfuscatedName("sf.c")
	public static class32 field3011 = class73.method593("Hidden)2use", true);

	@ObfuscatedName("sf.d")
	public static class32 field3012 = class73.method593("mn", true);

	@ObfuscatedName("sf.h")
	public static class32 field3016 = class73.method593("Bitte benutzen Sie eine andere Welt)3", true);

	@ObfuscatedName("sf.j")
	public static class32 field3018 = class73.method593("Please wait)3)3)3", true);

	@ObfuscatedName("sf.g")
	public static class32 field3015 = field3018;

	@ObfuscatedName("sf.k")
	public static class49[] field3019;

	@ObfuscatedName("sf.a(IIIILh;Z)V")
	public static void method1004(int arg0, int arg1, int arg2, int arg3, class49 arg4) {
		int var5 = arg0 * arg0 + arg3 * arg3;
		if (var5 <= 4225 || var5 >= 90000) {
			class136.method1032(arg2, arg1, arg3, arg4, arg0);
			return;
		}
		int var6 = class133.field3054 + class27.field493 & 0x7FF;
		int var7 = class7.field121[var6];
		int var8 = var7 * 256 / (class29.field527 + 256);
		int var9 = class7.field113[var6];
		int var10 = var9 * 256 / (class29.field527 + 256);
		int var11 = arg0 * var8 + arg3 * var10 >> 16;
		int var12 = arg3 * var8 - arg0 * var10 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		class48.field1137.method390(arg2 + var15 + 94 - 6, -20 + 83 + arg1 + -var16, var13);
	}

	@ObfuscatedName("sf.a(IIIII)I")
	public static int method1005(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - class7.field121[arg1 * 1024 / arg0] >> 1;
		return (var4 * arg2 >> 16) + (arg3 * (65536 - var4) >> 16);
	}

	@ObfuscatedName("sf.a(Z)V")
	public static void method1006() {
		field3019 = null;
		field3015 = null;
		field3018 = null;
		field3016 = null;
		field3010 = null;
		field3011 = null;
		field3012 = null;
	}

	@ObfuscatedName("sf.a([BB)V")
	public abstract void method60(byte[] arg0);

	@ObfuscatedName("sf.a(B)[B")
	public abstract byte[] method61();
}
