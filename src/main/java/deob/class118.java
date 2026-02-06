package deob;

import java.io.IOException;

@ObfuscatedName("r")
public final class class118 {

	@ObfuscatedName("r.b")
	public class26 field2817;

	@ObfuscatedName("r.e")
	public int field2820 = 0;

	@ObfuscatedName("r.f")
	public static int[] field2821 = new int[32];

	@ObfuscatedName("r.g")
	public int field2822;

	@ObfuscatedName("r.h")
	public int field2823;

	@ObfuscatedName("r.j")
	public int field2825 = 0;

	@ObfuscatedName("r.k")
	public int field2826;

	@ObfuscatedName("r.m")
	public int field2828;

	@ObfuscatedName("r.n")
	public int field2829;

	@ObfuscatedName("r.o")
	public static class32 field2830 = class73.method593("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", true);

	@ObfuscatedName("r.p")
	public class26 field2831;

	@ObfuscatedName("r.q")
	public static class152[] field2832 = new class152[16];

	@ObfuscatedName("r.r")
	public static class32 field2833 = class73.method593("Nehmen", true);

	@ObfuscatedName("r.s")
	public int field2834;

	@ObfuscatedName("r.t")
	public static class32 field2835 = class73.method593("glow3:", true);

	@ObfuscatedName("r.c")
	public static class32 field2818 = field2835;

	@ObfuscatedName("r.i")
	public static class32 field2824 = field2835;

	@ObfuscatedName("r.u")
	public static int field2836;

	@ObfuscatedName("r.v")
	public int field2837;

	@ObfuscatedName("r.a(ZLf;)Z")
	public static boolean method932(class36 arg0) {
		if (class146.field3318) {
			if (class147.method1100(arg0) != 0) {
				return false;
			}
			if (arg0.field755 == 0) {
				return false;
			}
		}
		return arg0.field740;
	}

	@ObfuscatedName("r.a(B)V")
	public static void method933() {
		boolean var0 = true;
		method935(false);
		class37.field879 = 0;
		for (int var1 = 0; var1 < class142.field3256.length; var1++) {
			if (class119.field2841[var1] != -1 && class142.field3256[var1] == null) {
				class142.field3256[var1] = class134.field3115.method206(class119.field2841[var1], 0);
				if (class142.field3256[var1] == null) {
					class37.field879++;
					var0 = false;
				}
			}
			if (class74.field1747[var1] != -1 && class27.field483[var1] == null) {
				class27.field483[var1] = class134.field3115.method220(class74.field1747[var1], class63.field1454[var1], 0);
				if (class27.field483[var1] == null) {
					var0 = false;
					class37.field879++;
				}
			}
		}
		if (!var0) {
			class119.field2839 = 1;
			return;
		}
		class152.field3487 = 0;
		boolean var2 = true;
		for (int var3 = 0; var3 < class142.field3256.length; var3++) {
			byte[] var4 = class27.field483[var3];
			if (var4 != null) {
				int var5 = (class39.field935[var3] >> 8) * 64 - class72.field1700;
				int var6 = (class39.field935[var3] & 0xFF) * 64 - field2836;
				if (class56.field1299) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= class14.method76(var5, var4, var6);
			}
		}
		if (!var2) {
			class119.field2839 = 2;
			return;
		}
		if (class119.field2839 != 0) {
			class14.method72(class52.method402(new class32[] { class48.field1135, class110.field2586 }), true);
		}
		class125.method980();
		class102.method824();
		class125.method980();
		class159.field3657.method1139();
		class125.method980();
		System.gc();
		for (int var7 = 0; var7 < 4; var7++) {
			class105.field2482[var7].method923();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					class3.field50[var8][var9][var10] = 0;
				}
			}
		}
		class125.method980();
		class79.method627();
		int var11 = class142.field3256.length;
		class33.method283();
		method935(true);
		if (!class56.field1299) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (class39.field935[var12] & 0xFF) * 64 - field2836;
				byte[] var14 = class142.field3256[var12];
				int var15 = (class39.field935[var12] >> 8) * 64 - class72.field1700;
				if (var14 != null) {
					class125.method980();
					class107.method865(var14, (class142.field3251 - 6) * 8, var13, class62.field1422 * 8 - 48, class105.field2482, var15);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (class39.field935[var16] >> 8) * 64 - class72.field1700;
				int var18 = (class39.field935[var16] & 0xFF) * 64 - field2836;
				byte[] var19 = class142.field3256[var16];
				if (var19 == null && class142.field3251 < 800) {
					class125.method980();
					class79.method625(var18, var17, 64, 64);
				}
			}
			method935(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = class27.field483[var20];
				if (var21 != null) {
					int var22 = (class39.field935[var20] >> 8) * 64 - class72.field1700;
					int var23 = (class39.field935[var20] & 0xFF) * 64 - field2836;
					class125.method980();
					class80.method634(var22, class159.field3657, var21, class105.field2482, var23);
				}
			}
		}
		if (class56.field1299) {
			for (int var24 = 0; var24 < 4; var24++) {
				class125.method980();
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						boolean var27 = false;
						int var28 = class32.field641[var24][var25][var26];
						if (var28 != -1) {
							int var29 = var28 >> 24 & 0x3;
							int var30 = var28 >> 1 & 0x3;
							int var31 = var28 >> 14 & 0x3FF;
							int var32 = var28 >> 3 & 0x7FF;
							int var33 = var32 / 8 + (var31 / 8 << 8);
							for (int var34 = 0; var34 < class39.field935.length; var34++) {
								if (class39.field935[var34] == var33 && class142.field3256[var34] != null) {
									var27 = true;
									class47.method360((var31 & 0x7) * 8, var26 * 8, var25 * 8, (var32 & 0x7) * 8, var29, class105.field2482, class142.field3256[var34], var30, var24);
									break;
								}
							}
						}
						if (!var27) {
							class57.method451(var25 * 8, var26 * 8, var24);
						}
					}
				}
			}
			for (int var35 = 0; var35 < 13; var35++) {
				for (int var36 = 0; var36 < 13; var36++) {
					int var37 = class32.field641[0][var35][var36];
					if (var37 == -1) {
						class79.method625(var36 * 8, var35 * 8, 8, 8);
					}
				}
			}
			method935(true);
			for (int var38 = 0; var38 < 4; var38++) {
				class125.method980();
				for (int var39 = 0; var39 < 13; var39++) {
					for (int var40 = 0; var40 < 13; var40++) {
						int var41 = class32.field641[var38][var39][var40];
						if (var41 != -1) {
							int var42 = var41 >> 24 & 0x3;
							int var43 = var41 >> 1 & 0x3;
							int var44 = var41 >> 14 & 0x3FF;
							int var45 = var41 >> 3 & 0x7FF;
							int var46 = var45 / 8 + (var44 / 8 << 8);
							for (int var47 = 0; var47 < class39.field935.length; var47++) {
								if (class39.field935[var47] == var46 && class27.field483[var47] != null) {
									class158.method1224(var38, class27.field483[var47], var42, (var45 & 0x7) * 8, var40 * 8, var39 * 8, class159.field3657, var43, class105.field2482, (var44 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		method935(true);
		class102.method824();
		class125.method980();
		class65.method499(class105.field2482, class159.field3657);
		method935(true);
		int var48 = class151.field3472;
		if (class43.field989 < var48) {
			var48 = class43.field989;
		}
		if (var48 < class43.field989 - 1) {
		}
		if (class154.field3529) {
			class159.field3657.method1142(class151.field3472);
		} else {
			class159.field3657.method1142(0);
		}
		for (int var49 = 0; var49 < 104; var49++) {
			for (int var50 = 0; var50 < 104; var50++) {
				class157.method1205(var50, var49);
			}
		}
		class125.method980();
		class137.method1039();
		class115.field2720.method490();
		if (class11.field184 != null) {
			class44.field1026.method356(153);
			class44.field1026.method530(1057001181);
		}
		if (!class56.field1299) {
			int var51 = (class62.field1422 + 6) / 8;
			int var52 = (class142.field3251 + 6) / 8;
			int var53 = (class62.field1422 - 6) / 8;
			int var54 = (class142.field3251 - 6) / 8;
			for (int var55 = var53 - 1; var55 <= var51 + 1; var55++) {
				for (int var56 = var54 - 1; var56 <= var52 + 1; var56++) {
					if (var55 < var53 || var55 > var51 || var56 < var54 || var52 < var56) {
						class134.field3115.method212(class52.method402(new class32[] { class36.field767, class159.method1228(var55), class19.field361, class159.method1228(var56) }));
						class134.field3115.method212(class52.method402(new class32[] { class114.field2669, class159.method1228(var55), class19.field361, class159.method1228(var56) }));
					}
				}
			}
		}
		class54.method425(30);
		class125.method980();
		class117.method927();
		class44.field1026.method356(39);
		class113.method886();
	}

	@ObfuscatedName("r.b(B)V")
	public static void method934() {
		field2830 = null;
		field2818 = null;
		field2824 = null;
		field2832 = null;
		field2833 = null;
		field2821 = null;
		field2835 = null;
	}

	@ObfuscatedName("r.a(ZB)V")
	public static void method935(boolean arg0) {
		class125.method980();
		class70.field1658++;
		if (class70.field1658 < 50 && !arg0) {
			return;
		}
		class70.field1658 = 0;
		if (class82.field1918 || class143.field3273 == null) {
			return;
		}
		class44.field1026.method356(232);
		try {
			class143.field3273.method49(class44.field1026.field1586, class44.field1026.field1568);
			class44.field1026.field1568 = 0;
		} catch (IOException var1) {
			class82.field1918 = true;
		}
	}
}
