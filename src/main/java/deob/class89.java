package deob;

import java.io.UnsupportedEncodingException;

@ObfuscatedName("mf")
public final class class89 {

	@ObfuscatedName("mf.c")
	public static class32 field2051 = class73.method593("K", true);

	@ObfuscatedName("mf.b")
	public static class32 field2050 = field2051;

	@ObfuscatedName("mf.d")
	public static class32 field2052 = field2051;

	@ObfuscatedName("mf.f")
	public static class32 field2054 = class73.method593("Begeben Sie sich in ein freies Gebiet)1 um", true);

	@ObfuscatedName("mf.g")
	public static int field2055 = -1;

	@ObfuscatedName("mf.j")
	public static int field2058;

	@ObfuscatedName("mf.k")
	public static class32 field2059 = class73.method593("Sichtbare Karte vorbereitet)3", true);

	@ObfuscatedName("mf.a(B)V")
	public static void method673() {
		field2050 = null;
		field2054 = null;
		field2059 = null;
		field2051 = null;
		field2052 = null;
	}

	@ObfuscatedName("mf.a(Lf;Lec;Z)Lec;")
	public static class32 method674(class36 arg0, class32 arg1) {
		if (arg1.method267(class128.field2936) == -1) {
			return arg1;
		}
		while (true) {
			int var2 = arg1.method267(class56.field1308);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.method267(class38.field912);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.method267(class71.field1664);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.method267(class38.field920);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.method267(class135.field3145);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.method267(class112.field2617);
													if (var7 == -1) {
														return arg1;
													}
													class32 var8 = class77.field1786;
													if (class92.field2122 != null) {
														var8 = class28.method191(class92.field2122.field353);
														try {
															if (class92.field2122.field352 != null) {
																byte[] var9 = ((String) class92.field2122.field352).getBytes("ISO-8859-1");
																var8 = class26.method186(var9, 0, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg1 = class52.method402(new class32[] { arg1.method241(0, var7), var8, arg1.method268(var7 + 4) });
												}
											}
											arg1 = class52.method402(new class32[] { arg1.method241(0, var6), class53.method420(class157.method1218(arg0, 4)), arg1.method268(var6 + 2) });
										}
									}
									arg1 = class52.method402(new class32[] { arg1.method241(0, var5), class53.method420(class157.method1218(arg0, 3)), arg1.method268(var5 + 2) });
								}
							}
							arg1 = class52.method402(new class32[] { arg1.method241(0, var4), class53.method420(class157.method1218(arg0, 2)), arg1.method268(var4 + 2) });
						}
					}
					arg1 = class52.method402(new class32[] { arg1.method241(0, var3), class53.method420(class157.method1218(arg0, 1)), arg1.method268(var3 + 2) });
				}
			}
			arg1 = class52.method402(new class32[] { arg1.method241(0, var2), class53.method420(class157.method1218(arg0, 0)), arg1.method268(var2 + 2) });
		}
	}

	@ObfuscatedName("mf.a(Lea;I)V")
	public static void method675(class30 arg0) {
		class4.field56 = arg0;
	}

	@ObfuscatedName("mf.a(ILqd;)V")
	public static void method676(class115 arg0) {
		arg0.field2694 = 0;
		if (arg0.field2751 == 0) {
			arg0.field2742 = 1024;
		}
		if (arg0.field2751 == 1) {
			arg0.field2742 = 1536;
		}
		if (arg0.field2751 == 2) {
			arg0.field2742 = 0;
		}
		if (arg0.field2751 == 3) {
			arg0.field2742 = 512;
		}
		int var1 = arg0.field2730 - class140.field3217;
		int var2 = arg0.field2710 * 128 + arg0.field2711 * 64;
		int var3 = arg0.field2717 * 128 + arg0.field2711 * 64;
		arg0.field2698 += (var3 - arg0.field2698) / var1;
		arg0.field2747 += (var2 - arg0.field2747) / var1;
	}
}
