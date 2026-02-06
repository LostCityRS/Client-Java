package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("i")
public final class class56 {

	@ObfuscatedName("i.c")
	public static int field1294 = 0;

	@ObfuscatedName("i.d")
	public static class32[] field1295 = new class32[500];

	@ObfuscatedName("i.h")
	public static boolean field1299 = false;

	@ObfuscatedName("i.i")
	public static class32 field1300 = class73.method593(" )2>", true);

	@ObfuscatedName("i.k")
	public static class126[] field1302 = new class126[50];

	@ObfuscatedName("i.m")
	public static class32 field1304 = class73.method593("oder benutzen Sie eine andere Welt)3", true);

	@ObfuscatedName("i.n")
	public static class32[] field1305 = new class32[1000];

	@ObfuscatedName("i.o")
	public static class32 field1306 = class73.method593("<col=40ff00>", true);

	@ObfuscatedName("i.q")
	public static class32 field1308 = class73.method593("(U1", true);

	@ObfuscatedName("i.r")
	public static int[] field1309;

	@ObfuscatedName("i.s")
	public static boolean field1310;

	@ObfuscatedName("i.a(II)Z")
	public static boolean method436(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@ObfuscatedName("i.a(B)V")
	public static void method437() {
		field1309 = null;
		field1300 = null;
		field1304 = null;
		field1305 = null;
		field1308 = null;
		field1306 = null;
		field1302 = null;
		field1295 = null;
	}

	@ObfuscatedName("i.a(III)I")
	public static int method438(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			int var2 = (arg0 & 0x7F) * arg1 / 128;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return var2 + (arg0 & 0xFF80);
		}
	}

	@ObfuscatedName("i.a(BIIII)V")
	public static void method439(int arg0, int arg1, int arg2, int arg3) {
		class119.field2848 = 0;
		for (int var4 = -1; var4 < class62.field1404 + class102.field2397; var4++) {
			class115 var5;
			if (var4 == -1) {
				var5 = class20.field373;
			} else if (var4 < class62.field1404) {
				var5 = class52.field1175[class137.field3187[var4]];
			} else {
				var5 = class14.field230[class15.field313[var4 - class62.field1404]];
			}
			if (var5 != null && var5.method578()) {
				if (var5 instanceof class111) {
					class97 var6 = ((class111) var5).field2595;
					if (var6.field2214 != null) {
						var6 = var6.method757();
					}
					if (var6 == null) {
						continue;
					}
				}
				if (class62.field1404 <= var4) {
					class97 var7 = ((class111) var5).field2595;
					if (var7.field2214 != null) {
						var7 = var7.method757();
					}
					if (var7.field2217 >= 0 && var7.field2217 < class9.field168.length) {
						class91.method720(var5, var5.field2688 + 15);
						if (class89.field2055 > -1) {
							class9.field168[var7.field2217].method369(arg2 + class89.field2055 - 12, class130.field3001 + arg1 - 30);
						}
					}
					if (class125.field2911 == 1 && class80.field1854 == class15.field313[var4 - class62.field1404] && class140.field3217 % 20 < 10) {
						class91.method720(var5, var5.field2688 + 15);
						if (class89.field2055 > -1) {
							class131.field3019[0].method369(arg2 + class89.field2055 - 12, arg1 + class130.field3001 + -28);
						}
					}
				} else {
					int var8 = 30;
					class70 var9 = (class70) var5;
					if (var9.field1649 != -1 || var9.field1660 != -1) {
						class91.method720(var5, var5.field2688 + 15);
						if (class89.field2055 > -1) {
							if (var9.field1649 != -1) {
								class30.field578[var9.field1649].method369(arg2 + class89.field2055 - 12, class130.field3001 + -30 + arg1);
								var8 += 25;
							}
							if (var9.field1660 != -1) {
								class9.field168[var9.field1660].method369(arg2 + class89.field2055 - 12, -var8 + class130.field3001 + arg1);
								var8 += 25;
							}
						}
					}
					if (var4 >= 0 && class125.field2911 == 10 && class137.field3187[var4] == class79.field1830) {
						class91.method720(var5, var5.field2688 + 15);
						if (class89.field2055 > -1) {
							class131.field3019[1].method369(arg2 + class89.field2055 - 12, -var8 + arg1 + class130.field3001);
						}
					}
				}
				if (var5.field2721 != null && (var4 >= class62.field1404 || class2.field21 == 0 || class2.field21 == 3 || class2.field21 == 1 && class117.method922(((class70) var5).field1659))) {
					class91.method720(var5, var5.field2688);
					if (class89.field2055 > -1 && class63.field1460 > class119.field2848) {
						class63.field1470[class119.field2848] = class38.field913.method770(var5.field2721) / 2;
						class63.field1446[class119.field2848] = class38.field913.field2292;
						class63.field1467[class119.field2848] = class89.field2055;
						class63.field1472[class119.field2848] = class130.field3001;
						class63.field1464[class119.field2848] = var5.field2753;
						class63.field1457[class119.field2848] = var5.field2749;
						class63.field1440[class119.field2848] = var5.field2706;
						class63.field1452[class119.field2848] = var5.field2721;
						class119.field2848++;
					}
				}
				if (class140.field3217 < var5.field2691) {
					class91.method720(var5, var5.field2688 + 15);
					if (class89.field2055 > -1) {
						int var10 = var5.field2755 * 30 / var5.field2738;
						if (var10 > 30) {
							var10 = 30;
						}
						class141.method1053(arg2 + class89.field2055 - 15, arg1 - -class130.field3001 + -3, var10, 5, 65280);
						class141.method1053(var10 + class89.field2055 + arg2 - 15, arg1 - -class130.field3001 + -3, 30 - var10, 5, 16711680);
					}
				}
				for (int var11 = 0; var11 < 4; var11++) {
					if (class140.field3217 < var5.field2722[var11]) {
						class91.method720(var5, var5.field2688 / 2);
						if (class89.field2055 > -1) {
							if (var11 == 1) {
								class130.field3001 -= 20;
							}
							if (var11 == 2) {
								class89.field2055 -= 15;
								class130.field3001 -= 10;
							}
							if (var11 == 3) {
								class89.field2055 += 15;
								class130.field3001 -= 10;
							}
							class30.field587[var5.field2746[var11]].method369(class89.field2055 + arg2 - 12, class130.field3001 + (arg1 - 12));
							client.field392.method793(class159.method1228(var5.field2758[var11]), arg2 + class89.field2055 - 1, arg1 - -class130.field3001 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var12 = 0; var12 < class119.field2848; var12++) {
			int var13 = class63.field1467[var12];
			int var14 = class63.field1472[var12];
			int var15 = class63.field1470[var12];
			int var16 = class63.field1446[var12];
			boolean var17 = true;
			while (var17) {
				var17 = false;
				for (int var18 = 0; var18 < var12; var18++) {
					if (class63.field1472[var18] - class63.field1446[var18] < var14 + 2 && class63.field1472[var18] + 2 > var14 + -var16 && var13 - var15 < class63.field1470[var18] + class63.field1467[var18] && var13 + var15 > -class63.field1470[var18] + class63.field1467[var18] && class63.field1472[var18] - class63.field1446[var18] < var14) {
						var14 = class63.field1472[var18] - class63.field1446[var18];
						var17 = true;
					}
				}
			}
			class89.field2055 = class63.field1467[var12];
			class130.field3001 = class63.field1472[var12] = var14;
			class32 var19 = class63.field1452[var12];
			if (class44.field1035 == 0) {
				int var20 = 16776960;
				if (class63.field1464[var12] < 6) {
					var20 = class62.field1390[class63.field1464[var12]];
				}
				if (class63.field1464[var12] == 6) {
					var20 = class159.field3658 % 20 < 10 ? 16711680 : 16776960;
				}
				if (class63.field1464[var12] == 7) {
					var20 = class159.field3658 % 20 >= 10 ? 65535 : 255;
				}
				if (class63.field1464[var12] == 8) {
					var20 = class159.field3658 % 20 < 10 ? 45056 : 8454016;
				}
				if (class63.field1464[var12] == 9) {
					int var21 = 150 - class63.field1440[var12];
					if (var21 < 50) {
						var20 = var21 * 1280 + 16711680;
					} else if (var21 < 100) {
						var20 = 16384000 + 16776960 - var21 * 327680;
					} else if (var21 < 150) {
						var20 = (var21 - 100) * 5 + 65280;
					}
				}
				if (class63.field1464[var12] == 10) {
					int var22 = 150 - class63.field1440[var12];
					if (var22 < 50) {
						var20 = var22 * 5 + 16711680;
					} else if (var22 < 100) {
						var20 = 16711935 - (var22 - 50) * 327680;
					} else if (var22 < 150) {
						var20 = var22 * 327680 + 255 + 500 - var22 * 5 - 32768000;
					}
				}
				if (class63.field1464[var12] == 11) {
					int var23 = 150 - class63.field1440[var12];
					if (var23 < 50) {
						var20 = 16777215 - var23 * 327685;
					} else if (var23 < 100) {
						var20 = (var23 - 50) * 327685 + 65280;
					} else if (var23 < 150) {
						var20 = 16777215 - (var23 - 100) * 327680;
					}
				}
				if (class63.field1457[var12] == 0) {
					class38.field913.method793(var19, class89.field2055 + arg2, class130.field3001 + arg1, var20, 0);
				}
				if (class63.field1457[var12] == 1) {
					class38.field913.method783(var19, arg2 + class89.field2055, class130.field3001 + arg1, var20, class159.field3658);
				}
				if (class63.field1457[var12] == 2) {
					class38.field913.method787(var19, class89.field2055 + arg2, class130.field3001 + arg1, var20, class159.field3658);
				}
				if (class63.field1457[var12] == 3) {
					class38.field913.method790(var19, arg2 + class89.field2055, arg1 + class130.field3001, var20, class159.field3658, 150 - class63.field1440[var12]);
				}
				if (class63.field1457[var12] == 4) {
					int var24 = (150 - class63.field1440[var12]) * (class38.field913.method770(var19) + 100) / 150;
					class141.method1065(class89.field2055 + arg2 - 50, arg1, class89.field2055 + arg2 + 50, arg1 + arg0);
					class38.field913.method791(var19, arg2 + class89.field2055 + 50 - var24, arg1 - -class130.field3001, var20, 0);
					class141.method1066(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
				if (class63.field1457[var12] == 5) {
					int var25 = 150 - class63.field1440[var12];
					class141.method1065(arg2, arg1 + class130.field3001 - class38.field913.field2292 - 1, arg2 - -arg3, class130.field3001 + arg1 + 5);
					int var26 = 0;
					if (var25 < 25) {
						var26 = var25 - 25;
					} else if (var25 > 125) {
						var26 = var25 - 125;
					}
					class38.field913.method793(var19, arg2 + class89.field2055, arg1 + class130.field3001 + var26, var20, 0);
					class141.method1066(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
			} else {
				class38.field913.method793(var19, class89.field2055 + arg2, class130.field3001 + arg1, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("i.b(II)Lie;")
	public static class61 method440(int arg0) {
		class61 var1 = (class61) class3.field43.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class44.field1031.method206(16, arg0);
		class61 var3 = new class61();
		if (var2 != null) {
			var3.method460(new class66(var2));
		}
		class3.field43.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("i.a(Ljava/lang/Object;Ldc;I)V")
	public static void method441(Object arg0, class25 arg1) {
		if (arg1.field459 == null) {
			return;
		}
		for (int var2 = 0; var2 < 50 && arg1.field459.peekEvent() != null; var2++) {
			class54.method426(1L);
		}
		if (arg0 != null) {
			arg1.field459.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@ObfuscatedName("i.a(ILec;IIILec;I)V")
	public static void method442(int arg0, class32 arg1, int arg2, int arg3, class32 arg4, int arg5) {
		if (class26.field476 || class119.field2849 >= 500) {
			return;
		}
		class109.field2575[class119.field2849] = arg1;
		field1295[class119.field2849] = arg4;
		class44.field1034[class119.field2849] = arg3;
		class135.field3135[class119.field2849] = arg0;
		class121.field2868[class119.field2849] = arg5;
		class158.field3620[class119.field2849] = arg2;
		class119.field2849++;
	}

	@ObfuscatedName("i.a(Lec;Lec;ILea;)[Lhb;")
	public static class51[] method443(class32 arg0, class32 arg1, class30 arg2) {
		int var3 = arg2.method201(arg1);
		int var4 = arg2.method215(arg0, var3);
		return class4.method12(var3, var4, arg2);
	}
}
