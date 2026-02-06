package deob;

import java.io.IOException;

@ObfuscatedName("tc")
public final class class135 {

	@ObfuscatedName("tc.a")
	public static int[] field3131 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("tc.d")
	public static int field3134 = 0;

	@ObfuscatedName("tc.e")
	public static int[] field3135 = new int[500];

	@ObfuscatedName("tc.f")
	public static class32 field3136 = class73.method593("swe", true);

	@ObfuscatedName("tc.g")
	public static class32 field3137 = class73.method593("Der Server wird gerade aktualisiert)3", true);

	@ObfuscatedName("tc.h")
	public static class32 field3138 = class73.method593(" <col=00ff80>", true);

	@ObfuscatedName("tc.i")
	public static class32 field3139 = class73.method593("Examine", true);

	@ObfuscatedName("tc.j")
	public static class32 field3140 = field3139;

	@ObfuscatedName("tc.l")
	public static int[] field3142 = new int[99];

	@ObfuscatedName("tc.n")
	public static class32 field3144 = class73.method593("<col=ff3000>", true);

	@ObfuscatedName("tc.o")
	public static class32 field3145 = class73.method593("(U5", true);

	@ObfuscatedName("tc.p")
	public static short[][] field3146;

	@ObfuscatedName("tc.q")
	public static int field3147;

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field3142[var1] = var0 / 4;
		}
		field3146 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		field3147 = 0;
	}

	@ObfuscatedName("tc.a(Lb;IZ)V")
	public static void method1027(class8 arg0, boolean arg1) {
		if (class4.field81 != null) {
			try {
				class4.field81.method52();
			} catch (Exception var7) {
			}
			class4.field81 = null;
		}
		class4.field81 = arg0;
		class94.method740(arg1);
		class61.field1354.field1568 = 0;
		class38.field921 = 0;
		class106.field2529 = null;
		class149.field3372 = null;
		while (true) {
			class110 var2 = (class110) class112.field2616.method1203();
			if (var2 == null) {
				while (true) {
					class110 var3 = (class110) class31.field593.method1203();
					if (var3 == null) {
						if (class92.field2118 != 0) {
							try {
								class66 var4 = new class66(4);
								var4.method514(4);
								var4.method514(class92.field2118);
								var4.method513(0);
								class4.field81.method49(var4.field1586, 4);
							} catch (IOException var6) {
								try {
									class4.field81.method52();
								} catch (Exception var5) {
								}
								class4.field81 = null;
								class61.field1355++;
							}
						}
						class133.field3040 = 0;
						class136.field3157 = class52.method407();
						return;
					}
					class126.field2918.method1168(var3);
					class132.field3029.method1201(var3.field3324, var3);
					class33.field697++;
					class66.field1579--;
				}
			}
			class97.field2212.method1201(var2.field3324, var2);
			class158.field3627++;
			class64.field1494--;
		}
	}

	@ObfuscatedName("tc.a(ZILjava/lang/Object;)[B")
	public static byte[] method1029(boolean arg0, Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			byte[] var2 = (byte[]) arg1;
			return arg0 ? class86.method668(var2) : var2;
		} else if (arg1 instanceof class131) {
			class131 var3 = (class131) arg1;
			return var3.method61();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("tc.a(I)V")
	public static void method1030() {
		int var0 = class38.field913.method770(class5.field94);
		for (int var1 = 0; var1 < class119.field2849; var1++) {
			int var2 = class38.field913.method770(class111.method878(var1));
			if (var2 > var0) {
				var0 = var2;
			}
		}
		class110.field2585 = class119.field2849 * 15 + 22;
		var0 += 8;
		class26.field476 = true;
		int var3 = class119.field2849 * 15 + 21;
		int var4 = class9.field166 - var0 / 2;
		class45.field1071 = var0;
		int var5 = class66.field1589;
		if (var0 + var4 > 765) {
			var4 = 765 - var0;
		}
		if (var5 + var3 > 503) {
			var5 = 503 - var3;
		}
		if (var5 < 0) {
			var5 = 0;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		class121.field2864 = var5;
		class36.field863 = var4;
	}
}
