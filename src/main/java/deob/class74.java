package deob;

import java.io.IOException;

@ObfuscatedName("ke")
public final class class74 {

	@ObfuscatedName("ke.b")
	public static int field1737 = 1;

	@ObfuscatedName("ke.d")
	public static long[] field1739 = new long[100];

	@ObfuscatedName("ke.f")
	public static int[] field1741 = new int[32];

	@ObfuscatedName("ke.i")
	public static long field1744;

	@ObfuscatedName("ke.k")
	public static int[] field1746;

	@ObfuscatedName("ke.l")
	public static int[] field1747;

	@ObfuscatedName("ke.m")
	public static class32 field1748 = class73.method593("", true);

	@ObfuscatedName("ke.c")
	public static class32 field1738 = field1748;

	@ObfuscatedName("ke.e")
	public static class32 field1740 = field1748;

	@ObfuscatedName("ke.g")
	public static class32 field1742 = field1748;

	@ObfuscatedName("ke.h")
	public static class32 field1743 = field1748;

	@ObfuscatedName("ke.o")
	public static class32 field1750 = class73.method593("Malformed login packet)3", true);

	@ObfuscatedName("ke.p")
	public static class32 field1751 = field1748;

	@ObfuscatedName("ke.q")
	public static class51[] field1752;

	@ObfuscatedName("ke.r")
	public static class32 field1753 = field1750;

	@ObfuscatedName("ke.s")
	public static class32 field1754 = field1748;

	@ObfuscatedName("ke.a(IB)Lec;")
	public static class32 method598(int arg0) {
		if (arg0 < 100000) {
			return class52.method402(new class32[] { class94.field2182, class159.method1228(arg0), class43.field996 });
		} else if (arg0 < 10000000) {
			return class52.method402(new class32[] { class139.field3212, class159.method1228(arg0 / 1000), class89.field2052, class43.field996 });
		} else {
			return class52.method402(new class32[] { class102.field2394, class159.method1228(arg0 / 1000000), class44.field1041, class43.field996 });
		}
	}

	@ObfuscatedName("ke.a(Lea;IZLea;)V")
	public static void method599(class30 arg0, boolean arg1, class30 arg2) {
		class151.field3454 = arg2;
		class37.field888 = arg1;
		class119.field2840 = arg0;
	}

	@ObfuscatedName("ke.a(B)V")
	public static void method600() {
		if (class4.field68 > 0) {
			class4.field68--;
		}
		if (class56.field1294 > 1) {
			class56.field1294--;
		}
		if (class82.field1918) {
			class82.field1918 = false;
			class65.method503();
			return;
		}
		for (int var0 = 0; var0 < 100 && class85.method661(); var0++) {
		}
		if (class134.field3114 != 30) {
			return;
		}
		class97.method753(class44.field1026);
		Object var1 = class137.field3174.field3023;
		synchronized (class137.field3174.field3023) {
			if (!class109.field2553) {
				class137.field3174.field3028 = 0;
			} else if (class79.field1826 != 0 || class137.field3174.field3028 >= 40) {
				int var2 = 0;
				class44.field1026.method356(119);
				class44.field1026.method514(0);
				int var3 = class44.field1026.field1568;
				for (int var4 = 0; var4 < class137.field3174.field3028 && class44.field1026.field1568 - var3 < 240; var4++) {
					var2++;
					int var5 = class137.field3174.field3030[var4];
					int var6 = class137.field3174.field3027[var4];
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 502) {
						var5 = 502;
					}
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 764) {
						var6 = 764;
					}
					int var7 = var5 * 765 + var6;
					if (class137.field3174.field3030[var4] == -1 && class137.field3174.field3027[var4] == -1) {
						var7 = 524287;
						var6 = -1;
						var5 = -1;
					}
					if (class75.field1765 != var6 || var5 != class28.field506) {
						int var8 = var6 - class75.field1765;
						class75.field1765 = var6;
						int var9 = var5 - class28.field506;
						class28.field506 = var5;
						if (class152.field3497 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
							var8 += 32;
							var9 += 32;
							class44.field1026.method513(var9 + (class152.field3497 << 12) + (var8 << 6));
							class152.field3497 = 0;
						} else if (class152.field3497 < 8) {
							class44.field1026.method550((class152.field3497 << 19) + var7 + 8388608);
							class152.field3497 = 0;
						} else {
							class44.field1026.method530(var7 + (class152.field3497 << 19) - 1073741824);
							class152.field3497 = 0;
						}
					} else if (class152.field3497 < 2047) {
						class152.field3497++;
					}
				}
				class44.field1026.method515(class44.field1026.field1568 - var3);
				if (class137.field3174.field3028 <= var2) {
					class137.field3174.field3028 = 0;
				} else {
					class137.field3174.field3028 -= var2;
					for (int var10 = 0; var10 < class137.field3174.field3028; var10++) {
						class137.field3174.field3027[var10] = class137.field3174.field3027[var10 + var2];
						class137.field3174.field3030[var10] = class137.field3174.field3030[var2 + var10];
					}
				}
			}
		}
		if (class79.field1826 != 0) {
			long var11 = (class84.field1974 - class11.field182) / 50L;
			if (var11 > 4095L) {
				var11 = 4095L;
			}
			class11.field182 = class84.field1974;
			int var13 = class9.field166;
			int var14 = class66.field1589;
			if (var13 < 0) {
				var13 = 0;
			} else if (var13 > 764) {
				var13 = 764;
			}
			byte var15 = 0;
			if (class79.field1826 == 2) {
				var15 = 1;
			}
			class44.field1026.method356(242);
			int var16 = (int) var11;
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 502) {
				var14 = 502;
			}
			int var17 = var14 * 765 + var13;
			class44.field1026.method530((var16 << 20) + ((var15 << 19) + var17));
		}
		if (class30.field562 > 0) {
			class30.field562--;
		}
		if (class107.field2540[96] || class107.field2540[97] || class107.field2540[98] || class107.field2540[99]) {
			class92.field2113 = true;
		}
		if (class92.field2113 && class30.field562 <= 0) {
			class92.field2113 = false;
			class30.field562 = 20;
			class44.field1026.method356(211);
			class44.field1026.method504(class133.field3054);
			class44.field1026.method504(class133.field3082);
		}
		if (class126.field2926 && !class77.field1812) {
			class77.field1812 = true;
			class44.field1026.method356(177);
			class44.field1026.method514(1);
		}
		if (!class126.field2926 && class77.field1812) {
			class77.field1812 = false;
			class44.field1026.method356(177);
			class44.field1026.method514(0);
		}
		class57.method449();
		if (class134.field3114 != 30) {
			return;
		}
		class91.method721();
		class20.method137();
		class34.field703++;
		if (class34.field703 > 750) {
			class65.method503();
			return;
		}
		class68.method569();
		class12.method65();
		class50.method397();
		if (class135.field3147 != 0) {
			class154.field3543 += 20;
			if (class154.field3543 >= 400) {
				class135.field3147 = 0;
			}
		}
		class54.field1282++;
		if (class5.field89 != null) {
			class136.field3156++;
			if (class136.field3156 >= 15) {
				class132.method1008(class5.field89);
				class5.field89 = null;
			}
		}
		if (class34.field723 != null) {
			class132.method1008(class34.field723);
			class109.field2569++;
			if (class113.field2637 + 5 < class86.field2001 || class113.field2637 - 5 > class86.field2001 || class140.field3216 > class94.field2160 + 5 || class140.field3216 < class94.field2160 - 5) {
				class72.field1693 = true;
			}
			if (class86.field2016 == 0) {
				if (class72.field1693 && class109.field2569 >= 5) {
					if (class34.field723 == class48.field1123 && class107.field2542 != class81.field1856) {
						class36 var18 = class34.field723;
						byte var19 = 0;
						if (class124.field2885 == 1 && var18.field845 == 206) {
							var19 = 1;
						}
						if (var18.field834[class81.field1856] <= 0) {
							var19 = 0;
						}
						if (class56.method436(class147.method1100(var18))) {
							int var22 = class81.field1856;
							int var23 = class107.field2542;
							var18.field834[var22] = var18.field834[var23];
							var18.field753[var22] = var18.field753[var23];
							var18.field834[var23] = -1;
							var18.field753[var23] = 0;
						} else if (var19 == 1) {
							int var20 = class81.field1856;
							int var21 = class107.field2542;
							while (var20 != var21) {
								if (var21 > var20) {
									var18.method309(var21 - 1, var21);
									var21--;
								} else if (var21 < var20) {
									var18.method309(var21 + 1, var21);
									var21++;
								}
							}
						} else {
							var18.method309(class81.field1856, class107.field2542);
						}
						class44.field1026.method356(56);
						class44.field1026.method548(class81.field1856);
						class44.field1026.method533(var19);
						class44.field1026.method553(class34.field723.field743);
						class44.field1026.method546(class107.field2542);
					}
				} else if ((class125.field2898 == 1 || class32.method237(class119.field2849 - 1)) && class119.field2849 > 2) {
					class135.method1030();
				} else if (class119.field2849 > 0) {
					class14.method79(class119.field2849 - 1);
				}
				class34.field723 = null;
				class136.field3156 = 10;
				class79.field1826 = 0;
			}
		}
		class27.field500 = false;
		class53.field1249 = 0;
		class124.field2886 = null;
		class112.field2622 = false;
		class36 var24 = class50.field1163;
		class50.field1163 = null;
		class36 var25 = class71.field1665;
		class71.field1665 = null;
		while (class145.method1089() && class53.field1249 < 128) {
			class73.field1733[class53.field1249] = class13.field224;
			class11.field188[class53.field1249] = class109.field2562;
			class53.field1249++;
		}
		class128.method992(class13.field220, 0, 0, 503, 0, 765, 0);
		class115.field2767++;
		while (true) {
			class12 var26;
			class36 var27;
			class36 var28;
			do {
				var26 = (class12) class111.field2598.method1215();
				if (var26 == null) {
					while (true) {
						class12 var29;
						class36 var30;
						class36 var31;
						do {
							var29 = (class12) class80.field1838.method1215();
							if (var29 == null) {
								while (true) {
									class12 var32;
									class36 var33;
									class36 var34;
									do {
										var32 = (class12) class11.field176.method1215();
										if (var32 == null) {
											if (class158.field3629 != null) {
												class91.method722();
											}
											if (class150.field3412 != -1) {
												int var35 = class150.field3412;
												int var36 = class150.field3432;
												boolean var37 = class94.method747(true, 0, class20.field373.field2736[0], 0, 0, var35, class20.field373.field2759[0], 0, var36, 0, 0);
												class150.field3412 = -1;
												if (var37) {
													class154.field3543 = 0;
													class154.field3545 = class66.field1589;
													class135.field3147 = 1;
													class27.field499 = class9.field166;
												}
											}
											class154.method1190();
											if (var24 != class50.field1163) {
												if (var24 != null) {
													class132.method1008(var24);
												}
												if (class50.field1163 != null) {
													class132.method1008(class50.field1163);
												}
											}
											if (class71.field1665 != var25 && class38.field924 == class92.field2121) {
												if (var25 != null) {
													class132.method1008(var25);
												}
												if (class71.field1665 != null) {
													class132.method1008(class71.field1665);
												}
											}
											if (class71.field1665 == null) {
												if (class38.field924 > 0) {
													class38.field924--;
												}
											} else if (class92.field2121 > class38.field924) {
												class38.field924++;
												if (class38.field924 == class92.field2121) {
													class132.method1008(class71.field1665);
												}
											}
											class137.method1037();
											if (class23.field418) {
												class157.method1213();
											}
											for (int var38 = 0; var38 < 5; var38++) {
												int var10002 = class17.field351[var38]++;
											}
											int var39 = class31.method223();
											int var40 = class113.method885();
											if (var39 > 4500 && var40 > 4500) {
												class4.field68 = 250;
												class75.method604(4000);
												class44.field1026.method356(13);
											}
											class63.field1469++;
											class83.field1933++;
											class70.field1658++;
											if (class83.field1933 > 500) {
												class83.field1933 = 0;
												int var41 = (int) (Math.random() * 8.0D);
												if ((var41 & 0x2) == 2) {
													class13.field225 += class30.field553;
												}
												if ((var41 & 0x4) == 4) {
													class11.field173 += class11.field194;
												}
												if ((var41 & 0x1) == 1) {
													class133.field3067 += class65.field1501;
												}
											}
											if (class11.field173 < -40) {
												class11.field194 = 1;
											}
											if (class63.field1469 > 500) {
												class63.field1469 = 0;
												int var42 = (int) (Math.random() * 8.0D);
												if ((var42 & 0x1) == 1) {
													class27.field493 += class34.field701;
												}
												if ((var42 & 0x2) == 2) {
													class29.field527 += class5.field102;
												}
											}
											if (class133.field3067 < -50) {
												class65.field1501 = 2;
											}
											if (class29.field527 < -20) {
												class5.field102 = 1;
											}
											if (class29.field527 > 10) {
												class5.field102 = -1;
											}
											if (class133.field3067 > 50) {
												class65.field1501 = -2;
											}
											if (class11.field173 > 40) {
												class11.field194 = -1;
											}
											if (class13.field225 < -55) {
												class30.field553 = 2;
											}
											if (class13.field225 > 55) {
												class30.field553 = -2;
											}
											if (class27.field493 < -60) {
												class34.field701 = 2;
											}
											if (class27.field493 > 60) {
												class34.field701 = -2;
											}
											if (class70.field1658 > 50) {
												class44.field1026.method356(232);
											}
											try {
												if (class143.field3273 != null && class44.field1026.field1568 > 0) {
													class143.field3273.method49(class44.field1026.field1586, class44.field1026.field1568);
													class44.field1026.field1568 = 0;
													class70.field1658 = 0;
													return;
												}
												return;
											} catch (IOException var43) {
												class65.method503();
												return;
											}
										}
										var33 = var32.field209;
										if (var33.field828 < 0) {
											break;
										}
										var34 = class128.method991(var33.field864);
									} while (var34 == null || var34.field754 == null || var34.field754.length <= var33.field828 || var33 != var34.field754[var33.field828]);
									class158.method1222(var32);
								}
							}
							var30 = var29.field209;
							if (var30.field828 < 0) {
								break;
							}
							var31 = class128.method991(var30.field864);
						} while (var31 == null || var31.field754 == null || var31.field754.length <= var30.field828 || var31.field754[var30.field828] != var30);
						class158.method1222(var29);
					}
				}
				var27 = var26.field209;
				if (var27.field828 < 0) {
					break;
				}
				var28 = class128.method991(var27.field864);
			} while (var28 == null || var28.field754 == null || var27.field828 >= var28.field754.length || var27 != var28.field754[var27.field828]);
			class158.method1222(var26);
		}
	}
}
