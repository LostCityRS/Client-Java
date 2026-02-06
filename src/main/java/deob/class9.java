package deob;

@ObfuscatedName("ba")
public abstract class class9 {

	@ObfuscatedName("ba.b")
	public static int[] field160;

	@ObfuscatedName("ba.d")
	public static class32 field162 = class73.method593("m-Ochte mit Ihnen handeln)3", true);

	@ObfuscatedName("ba.e")
	public static int field163;

	@ObfuscatedName("ba.f")
	public static class63 field164 = new class63(64);

	@ObfuscatedName("ba.h")
	public static int field166 = 0;

	@ObfuscatedName("ba.j")
	public static class49[] field168;

	@ObfuscatedName("ba.k")
	public static class32 field169 = class73.method593("Loading interfaces )2 ", true);

	@ObfuscatedName("ba.i")
	public static class32 field167 = field169;

	@ObfuscatedName("ba.a(B)V")
	public static void method54() {
		int var0 = class158.field3612.method352(8);
		if (class62.field1404 > var0) {
			for (int var1 = var0; var1 < class62.field1404; var1++) {
				class27.field495[class102.field2391++] = class137.field3187[var1];
			}
		}
		if (class62.field1404 < var0) {
			throw new RuntimeException("gppov1");
		}
		class62.field1404 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class137.field3187[var2];
			class70 var4 = class52.field1175[var3];
			int var5 = class158.field3612.method352(1);
			if (var5 == 0) {
				class137.field3187[class62.field1404++] = var3;
				var4.field2713 = class140.field3217;
			} else {
				int var6 = class158.field3612.method352(2);
				if (var6 == 0) {
					class137.field3187[class62.field1404++] = var3;
					var4.field2713 = class140.field3217;
					class62.field1418[class61.field1352++] = var3;
				} else if (var6 == 1) {
					class137.field3187[class62.field1404++] = var3;
					var4.field2713 = class140.field3217;
					int var7 = class158.field3612.method352(3);
					var4.method900(var7, false);
					int var8 = class158.field3612.method352(1);
					if (var8 == 1) {
						class62.field1418[class61.field1352++] = var3;
					}
				} else if (var6 == 2) {
					class137.field3187[class62.field1404++] = var3;
					var4.field2713 = class140.field3217;
					int var9 = class158.field3612.method352(3);
					var4.method900(var9, true);
					int var10 = class158.field3612.method352(3);
					var4.method900(var10, true);
					int var11 = class158.field3612.method352(1);
					if (var11 == 1) {
						class62.field1418[class61.field1352++] = var3;
					}
				} else if (var6 == 3) {
					class27.field495[class102.field2391++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("ba.a(Lea;I)V")
	public static void method55(class30 arg0) {
		class129.field2970 = arg0;
	}

	@ObfuscatedName("ba.b(B)V")
	public static void method56() {
		field168 = null;
		field164 = null;
		field169 = null;
		field167 = null;
		field162 = null;
		field160 = null;
	}

	@ObfuscatedName("ba.a(JI)Lec;")
	public static class32 method59(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
				var2++;
			}
			byte[] var5 = new byte[var2];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var2--;
				var5[var2] = class29.field519[(int) (var6 - arg0 * 37L)];
			}
			class32 var8 = new class32();
			var8.field618 = var5;
			var8.field674 = var5.length;
			return var8;
		}
	}

	@ObfuscatedName("ba.a(I)V")
	public abstract void method57();

	@ObfuscatedName("ba.a(III)I")
	public abstract int method58(int arg0, int arg1);
}
