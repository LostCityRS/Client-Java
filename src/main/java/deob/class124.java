package deob;

@ObfuscatedName("rf")
public final class class124 {

	@ObfuscatedName("rf.a")
	public static class32 field2882 = class73.method593("FULL", true);

	@ObfuscatedName("rf.b")
	public static int[] field2883 = new int[5];

	@ObfuscatedName("rf.d")
	public static int field2885 = 0;

	@ObfuscatedName("rf.e")
	public static class36 field2886 = null;

	@ObfuscatedName("rf.f")
	public static class44 field2887;

	@ObfuscatedName("rf.h")
	public static class32 field2889 = field2882;

	@ObfuscatedName("rf.i")
	public static int[] field2890;

	@ObfuscatedName("rf.k")
	public static int[] field2892 = new int[100];

	@ObfuscatedName("rf.m")
	public static class32 field2894 = class73.method593("scroll:", true);

	@ObfuscatedName("rf.c")
	public static class32 field2884 = field2894;

	@ObfuscatedName("rf.j")
	public static class32 field2891 = field2894;

	@ObfuscatedName("rf.o")
	public static class32 field2896 = class73.method593("M", true);

	@ObfuscatedName("rf.p")
	public static class32 field2897 = class73.method593("Angreifen", true);

	@ObfuscatedName("rf.a(BI[B)I")
	public static int method973(int arg0, byte[] arg1) {
		return class144.method1080(arg0, 0, arg1);
	}

	@ObfuscatedName("rf.a(III)V")
	public static void method974(int arg0, int arg1) {
		if (class119.field2849 < 2 && class125.field2913 == 0 && !class151.field3468) {
			return;
		}
		class32 var2;
		if (class125.field2913 == 1 && class119.field2849 < 2) {
			var2 = class52.method402(new class32[] { class41.field965, class114.field2651, class50.field1148, class56.field1300 });
		} else if (class151.field3468 && class119.field2849 < 2) {
			var2 = class52.method402(new class32[] { class147.field3353, class114.field2651, class14.field234, class56.field1300 });
		} else {
			var2 = class111.method878(class119.field2849 - 1);
		}
		if (class119.field2849 > 2) {
			var2 = class52.method402(new class32[] { var2, class34.field711, class159.method1228(class119.field2849 - 2), class117.field2797 });
		}
		class38.field913.method779(var2, arg1 + 4, arg0 + 15, class140.field3217 / 1000);
	}

	@ObfuscatedName("rf.a(IIIZ)Lec;")
	public static class32 method975(int arg0, boolean arg1) {
		int var2 = 1;
		int var3 = arg0 / 10;
		while (var3 != 0) {
			var3 /= 10;
			var2++;
		}
		int var4 = var2;
		if (arg0 < 0 || arg1) {
			var4 = var2 + 1;
		}
		byte[] var5 = new byte[var4];
		if (arg0 < 0) {
			var5[0] = 45;
		} else if (arg1) {
			var5[0] = 43;
		}
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg0 % 10;
			arg0 /= 10;
			if (var7 < 0) {
				var7 = -var7;
			}
			if (var7 > 9) {
				var7 += 39;
			}
			var5[var4 - var6 - 1] = (byte) (var7 + 48);
		}
		class32 var8 = new class32();
		var8.field674 = var4;
		var8.field618 = var5;
		return var8;
	}
}
