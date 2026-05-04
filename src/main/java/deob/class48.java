package deob;

@ObfuscatedName("ec")
public final class class48 extends class207 {

	@ObfuscatedName("ec.D")
	public static final class88 field892 = class208.method1423(105, "We suspect someone knows your password)3");

	@ObfuscatedName("ec.O")
	public static final long[] field903 = new long[32];

	@ObfuscatedName("ec.I")
	public static final class88 field897 = class208.method1423(105, "No reply from loginserver)3");

	@ObfuscatedName("ec.J")
	public static int field898 = 0;

	@ObfuscatedName("ec.L")
	public static final class88 field900 = class208.method1423(105, "OFF");

	@ObfuscatedName("ec.R")
	public static class88 field906 = field897;

	@ObfuscatedName("ec.F")
	public static int field894 = 0;

	@ObfuscatedName("ec.P")
	public static final int[] field904 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("ec.N")
	public static class88 field902 = field892;

	@ObfuscatedName("ec.M")
	public static class88 field901 = field900;

	@ObfuscatedName("ec.V")
	public static final class88 field910 = class208.method1423(105, "Malformed login packet)3");

	@ObfuscatedName("ec.U")
	public static boolean field909 = false;

	@ObfuscatedName("ec.H")
	public static class88 field896 = field910;

	@ObfuscatedName("ec.K")
	public static int field899;

	@ObfuscatedName("ec.Q")
	public static int field905;

	@ObfuscatedName("ec.E")
	public static boolean[][] field893;

	@ObfuscatedName("ec.G")
	public static int[][][] field895;

	@ObfuscatedName("ec.b(I)V")
	public static void method366() {
		class53 var0 = class166.field3188;
		synchronized (class166.field3188) {
			class114.field2068++;
			class203.field3858 = field898;
			if (class32.field524 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					class247.field4511[var1] = false;
				}
				class32.field524 = class148.field2801;
			} else {
				while (class148.field2801 != class32.field524) {
					int var2 = class114.field2059[class148.field2801];
					class148.field2801 = class148.field2801 + 1 & 0x7F;
					if (var2 >= 0) {
						class247.field4511[var2] = true;
					} else {
						class247.field4511[~var2] = false;
					}
				}
			}
			field898 = class191.field3681;
		}
	}

	@ObfuscatedName("ec.c(I)V")
	public static void method367() {
		for (int var0 = 0; var0 < class174.field3445; var0++) {
			int var10002 = class8.field116[var0]--;
			if (class8.field116[var0] >= -10) {
				class38 var2 = class237.field4417[var0];
				if (var2 == null) {
					var2 = class38.method252(class12.field172, class25.field397[var0], 0);
					if (var2 == null) {
						continue;
					}
					class8.field116[var0] += var2.method251();
					class237.field4417[var0] = var2;
				}
				if (class8.field116[var0] < 0) {
					int var3;
					if (class145.field2726[var0] == 0) {
						var3 = class119.field2172;
					} else {
						int var4 = (class145.field2726[var0] & 0xFF) * 128;
						int var5 = class145.field2726[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - class240.field4456.field4136;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = class145.field2726[var0] >> 8 & 0xFF;
						int var8 = var7 * 128 + 64 - class240.field4456.field4121;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							class8.field116[var0] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = (var4 - var9) * class223.field4211 / var4;
					}
					if (var3 > 0) {
						class213 var10 = var2.method253().method1453(class117.field2124);
						class162 var11 = class162.method1124(var10, var3);
						var11.method1119(class110.field2016[var0] - 1);
						class226.field4248.method1506(var11);
					}
					class8.field116[var0] = -100;
				}
			} else {
				class174.field3445--;
				for (int var1 = var0; var1 < class174.field3445; var1++) {
					class25.field397[var1] = class25.field397[var1 + 1];
					class237.field4417[var1] = class237.field4417[var1 + 1];
					class110.field2016[var1] = class110.field2016[var1 + 1];
					class8.field116[var1] = class8.field116[var1 + 1];
					class145.field2726[var1] = class145.field2726[var1 + 1];
				}
				var0--;
			}
		}
		if (class110.field2012 && !class102.method707()) {
			if (class65.field1183 != 0 && class2.field25 != -1) {
				class53.method388(class99.field1814, class2.field25, class65.field1183);
			}
			class110.field2012 = false;
		} else if (class65.field1183 != 0 && class2.field25 != -1 && !class102.method707()) {
			class146.field2747.method30(133);
			class146.field2747.method338(class2.field25);
			class2.field25 = -1;
		}
	}
}
