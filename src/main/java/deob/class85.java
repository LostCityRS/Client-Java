package deob;

import java.io.IOException;

@ObfuscatedName("mb")
public final class class85 {

	@ObfuscatedName("mb.a")
	public static class32 field1978 = class73.method593("Loaded wordpack", true);

	@ObfuscatedName("mb.b")
	public static int field1979 = 0;

	@ObfuscatedName("mb.c")
	public static class32 field1980 = class73.method593("Loaded interfaces", true);

	@ObfuscatedName("mb.d")
	public static class9 field1981;

	@ObfuscatedName("mb.g")
	public static class32 field1984 = class73.method593(")2", true);

	@ObfuscatedName("mb.h")
	public static byte[][][] field1985;

	@ObfuscatedName("mb.j")
	public static class63 field1987 = new class63(200);

	@ObfuscatedName("mb.k")
	public static class32 field1988 = field1978;

	@ObfuscatedName("mb.l")
	public static class32 field1989 = field1980;

	@ObfuscatedName("mb.n")
	public static class30 field1991;

	@ObfuscatedName("mb.p")
	public static int field1993 = 0;

	@ObfuscatedName("mb.q")
	public static class32 field1994 = class73.method593("Loading title screen )2 ", true);

	@ObfuscatedName("mb.i")
	public static class32 field1986 = field1994;

	@ObfuscatedName("mb.r")
	public static class32 field1995 = class73.method593("blaugr-Un:", true);

	@ObfuscatedName("mb.s")
	public static int field1996 = 0;

	@ObfuscatedName("mb.v")
	public static class32 field1999 = class73.method593("Account locked as we suspect it has been stolen)3", true);

	@ObfuscatedName("mb.u")
	public static class32 field1998 = field1999;

	@ObfuscatedName("mb.a(IIBI)I")
	public static int method658(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) + (arg1 * (arg0 & 0xFF00) + var3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}

	@ObfuscatedName("mb.a(Lea;ZLea;Lea;Lea;)V")
	public static void method659(class30 arg0, class30 arg1, class30 arg2, class30 arg3) {
		class4.field57 = arg2;
		field1991 = arg3;
		class158.field3635 = arg1;
		class12.field198 = arg0;
		class79.field1825 = new class36[field1991.method204()][];
		class92.field2119 = new boolean[field1991.method204()];
	}

	@ObfuscatedName("mb.a([Lf;IIIIIIII)V")
	public static void method660(class36[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = 0; var8 < arg0.length; var8++) {
			class36 var9 = arg0[var8];
			if (var9 != null && (!var9.field848 || var9.field755 == 0 || var9.field847 || class147.method1100(var9) != 0 || var9 == class117.field2807) && var9.field864 == arg7 && (!var9.field848 || !class118.method932(var9))) {
				int var10 = arg1 + var9.field829;
				int var11 = var9.field855 + arg5;
				if (var9 == class158.field3629) {
					class112.field2622 = true;
					class126.field2930 = var10;
					class63.field1465 = var11;
				}
				int var12;
				int var13;
				int var14;
				int var15;
				if (var9.field755 == 2) {
					var12 = arg2;
					var13 = arg4;
					var14 = arg6;
					var15 = arg3;
				} else if (var9.field755 == 9) {
					int var16 = var9.field810 + var10;
					int var17 = var10;
					if (var16 < var10) {
						var17 = var16;
						var16 = var10;
					}
					var12 = arg2 >= var17 ? arg2 : var17;
					int var19 = var9.field773 + var11;
					int var20 = var11;
					var16++;
					var13 = arg4 > var16 ? var16 : arg4;
					if (var11 > var19) {
						var20 = var19;
						var19 = var11;
					}
					var19++;
					var14 = var19 >= arg6 ? arg6 : var19;
					var15 = arg3 >= var20 ? arg3 : var20;
				} else {
					var15 = arg3 >= var11 ? arg3 : var11;
					var12 = arg2 < var10 ? var10 : arg2;
					int var22 = var9.field810 + var10;
					var13 = var22 >= arg4 ? arg4 : var22;
					int var23 = var9.field773 + var11;
					var14 = var23 >= arg6 ? arg6 : var23;
				}
				if (!var9.field848 || var13 > var12 && var14 > var15) {
					if (var9.field845 == 1337) {
						class132.method1008(var9);
					} else if (var9.field845 == 1338) {
						class1.method2(var10, var11);
					} else {
						if (var9.field755 == 0) {
							if (!var9.field848 && class118.method932(var9) && class50.field1163 != var9) {
								continue;
							}
							method660(arg0, var10 - var9.field843, var12, var15, var13, var11 - var9.field872, var14, var9.field743);
							if (var9.field754 != null) {
								method660(var9.field754, var10 - var9.field843, var12, var15, var13, var11 - var9.field872, var14, var9.field743);
							}
							class144 var24 = (class144) class109.field2571.method1196((long) var9.field743);
							if (var24 != null) {
								class128.method992(var24.field3280, var12, var15, var14, var11, var13, var10);
							}
						}
						if (var9.field848) {
							boolean var25 = false;
							boolean var26;
							if (var12 <= class86.field2001 && var15 <= class140.field3216 && class86.field2001 < var13 && class140.field3216 < var14) {
								var26 = true;
							} else {
								var26 = false;
							}
							if (class86.field2016 == 1 && var26) {
								var25 = true;
							}
							boolean var27 = false;
							if (class79.field1826 == 1 && var12 <= class9.field166 && var15 <= class66.field1589 && class9.field166 < var13 && class66.field1589 < var14) {
								var27 = true;
							}
							if (var27) {
								class17.method127(var9, class66.field1589 - var11, class9.field166 + -var10);
							}
							if (class158.field3629 != null && class158.field3629 != var9 && var26 && class117.method924(class147.method1100(var9))) {
								class124.field2886 = var9;
							}
							if (var9 == class117.field2807) {
								class111.field2606 = var10;
								class27.field500 = true;
								class137.field3180 = var11;
							}
							if (var9.field847) {
								if (var26 && class72.field1695 != 0 && var9.field866 != null) {
									class12 var28 = new class12();
									var28.field208 = var9.field866;
									var28.field210 = class72.field1695;
									var28.field209 = var9;
									class11.field176.method1214(var28);
								}
								if (class158.field3629 != null || class34.field723 != null || class26.field476) {
									var26 = false;
									var27 = false;
									var25 = false;
								}
								if (!var9.field806 && var27) {
									var9.field806 = true;
									if (var9.field865 != null) {
										class12 var29 = new class12();
										var29.field204 = class9.field166 - var10;
										var29.field209 = var9;
										var29.field208 = var9.field865;
										var29.field210 = class66.field1589 - var11;
										class11.field176.method1214(var29);
									}
								}
								if (var9.field806 && var25 && var9.field846 != null) {
									class12 var30 = new class12();
									var30.field209 = var9;
									var30.field208 = var9.field846;
									var30.field210 = class140.field3216 - var11;
									var30.field204 = class86.field2001 - var10;
									class11.field176.method1214(var30);
								}
								if (var9.field806 && !var25) {
									var9.field806 = false;
									if (var9.field835 != null) {
										class12 var31 = new class12();
										var31.field204 = class86.field2001 - var10;
										var31.field210 = class140.field3216 - var11;
										var31.field209 = var9;
										var31.field208 = var9.field835;
										class80.field1838.method1214(var31);
									}
								}
								if (var25 && var9.field779 != null) {
									class12 var32 = new class12();
									var32.field204 = class86.field2001 - var10;
									var32.field208 = var9.field779;
									var32.field209 = var9;
									var32.field210 = class140.field3216 - var11;
									class11.field176.method1214(var32);
								}
								if (!var9.field831 && var26) {
									var9.field831 = true;
									if (var9.field850 != null) {
										class12 var33 = new class12();
										var33.field208 = var9.field850;
										var33.field209 = var9;
										var33.field204 = class86.field2001 - var10;
										var33.field210 = class140.field3216 - var11;
										class11.field176.method1214(var33);
									}
								}
								if (var9.field831 && var26 && var9.field836 != null) {
									class12 var34 = new class12();
									var34.field208 = var9.field836;
									var34.field210 = class140.field3216 - var11;
									var34.field204 = class86.field2001 - var10;
									var34.field209 = var9;
									class11.field176.method1214(var34);
								}
								if (var9.field831 && !var26) {
									var9.field831 = false;
									if (var9.field775 != null) {
										class12 var35 = new class12();
										var35.field208 = var9.field775;
										var35.field209 = var9;
										var35.field204 = class86.field2001 - var10;
										var35.field210 = class140.field3216 - var11;
										class80.field1838.method1214(var35);
									}
								}
								if (var9.field766 != null) {
									class12 var36 = new class12();
									var36.field209 = var9;
									var36.field208 = var9.field766;
									class111.field2598.method1214(var36);
								}
								if (var9.field800 != null && field1993 > var9.field792) {
									if (var9.field821 == null || field1993 - var9.field792 > 32) {
										class12 var37 = new class12();
										var37.field208 = var9.field800;
										var37.field209 = var9;
										class11.field176.method1214(var37);
									} else {
										label368: for (int var38 = var9.field792; var38 < field1993; var38++) {
											int var39 = class118.field2821[var38 & 0x1F];
											for (int var40 = 0; var40 < var9.field821.length; var40++) {
												if (var39 == var9.field821[var40]) {
													class12 var41 = new class12();
													var41.field209 = var9;
													var41.field208 = var9.field800;
													class11.field176.method1214(var41);
													break label368;
												}
											}
										}
									}
									var9.field792 = field1993;
								}
								if (var9.field751 != null && var9.field737 < class73.field1718) {
									if (var9.field747 == null || class73.field1718 - var9.field737 > 32) {
										class12 var46 = new class12();
										var46.field209 = var9;
										var46.field208 = var9.field751;
										class11.field176.method1214(var46);
									} else {
										label348: for (int var42 = var9.field737; var42 < class73.field1718; var42++) {
											int var43 = class11.field191[var42 & 0x1F];
											for (int var44 = 0; var44 < var9.field747.length; var44++) {
												if (var9.field747[var44] == var43) {
													class12 var45 = new class12();
													var45.field208 = var9.field751;
													var45.field209 = var9;
													class11.field176.method1214(var45);
													break label348;
												}
											}
										}
									}
									var9.field737 = class73.field1718;
								}
								if (var9.field771 != null && class86.field2011 > var9.field815) {
									if (var9.field875 == null || class86.field2011 - var9.field815 > 32) {
										class12 var47 = new class12();
										var47.field209 = var9;
										var47.field208 = var9.field771;
										class11.field176.method1214(var47);
									} else {
										label328: for (int var48 = var9.field815; var48 < class86.field2011; var48++) {
											int var49 = class74.field1741[var48 & 0x1F];
											for (int var50 = 0; var50 < var9.field875.length; var50++) {
												if (var49 == var9.field875[var50]) {
													class12 var51 = new class12();
													var51.field208 = var9.field771;
													var51.field209 = var9;
													class11.field176.method1214(var51);
													break label328;
												}
											}
										}
									}
									var9.field815 = class86.field2011;
								}
								if (class15.field319 > var9.field873 && var9.field782 != null) {
									class12 var52 = new class12();
									var52.field209 = var9;
									var52.field208 = var9.field782;
									class11.field176.method1214(var52);
								}
								if (var9.field873 < class2.field26 && var9.field780 != null) {
									class12 var53 = new class12();
									var53.field209 = var9;
									var53.field208 = var9.field780;
									class11.field176.method1214(var53);
								}
								if (class1.field11 > var9.field873 && var9.field793 != null) {
									class12 var54 = new class12();
									var54.field208 = var9.field793;
									var54.field209 = var9;
									class11.field176.method1214(var54);
								}
								if (var9.field873 < class106.field2514 && var9.field822 != null) {
									class12 var55 = new class12();
									var55.field208 = var9.field822;
									var55.field209 = var9;
									class11.field176.method1214(var55);
								}
								var9.field873 = class115.field2767;
								if (var9.field741 != null) {
									for (int var56 = 0; var56 < class53.field1249; var56++) {
										class12 var57 = new class12();
										var57.field209 = var9;
										var57.field199 = class73.field1733[var56];
										var57.field207 = class11.field188[var56];
										var57.field208 = var9.field741;
										class11.field176.method1214(var57);
									}
								}
							}
						}
						if (!var9.field848) {
							if (class158.field3629 != null || class34.field723 != null || class26.field476) {
								return;
							}
							if ((var9.field752 >= 0 || var9.field830 != 0) && class86.field2001 >= var12 && var15 <= class140.field3216 && var13 > class86.field2001 && class140.field3216 < var14) {
								if (var9.field752 < 0) {
									class50.field1163 = var9;
								} else {
									class50.field1163 = arg0[var9.field752];
								}
							}
							if (var9.field755 == 8 && class86.field2001 >= var12 && var15 <= class140.field3216 && class86.field2001 < var13 && var14 > class140.field3216) {
								class71.field1665 = var9;
							}
							if (var9.field820 > var9.field773) {
								class86.method664(var11, var9, class140.field3216, var9.field810 + var10, var9.field773, class86.field2001, var9.field820);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mb.a(I)Z")
	public static boolean method661() {
		if (class143.field3273 == null) {
			return false;
		}
		try {
			int var0 = class143.field3273.method51();
			if (var0 == 0) {
				return false;
			}
			if (class86.field2004 == -1) {
				class143.field3273.method50(0, class158.field3612.field1586, 1);
				class158.field3612.field1568 = 0;
				class86.field2004 = class158.field3612.method350();
				class115.field2700 = class45.field1072[class86.field2004];
				var0--;
			}
			if (class115.field2700 == -1) {
				if (var0 <= 0) {
					return false;
				}
				var0--;
				class143.field3273.method50(0, class158.field3612.field1586, 1);
				class115.field2700 = class158.field3612.field1586[0] & 0xFF;
			}
			if (class115.field2700 == -2) {
				if (var0 <= 1) {
					return false;
				}
				var0 -= 2;
				class143.field3273.method50(0, class158.field3612.field1586, 2);
				class158.field3612.field1568 = 0;
				class115.field2700 = class158.field3612.method531();
			}
			if (var0 < class115.field2700) {
				return false;
			}
			class158.field3612.field1568 = 0;
			class143.field3273.method50(0, class158.field3612.field1586, class115.field2700);
			class34.field703 = 0;
			class34.field710 = class158.field3616;
			class158.field3616 = class12.field201;
			class12.field201 = class86.field2004;
			if (class86.field2004 == 27) {
				int var1 = class158.field3612.method518();
				class13.field220 = var1;
				client.method156(var1);
				class64.method493(class13.field220);
				for (int var2 = 0; var2 < 100; var2++) {
					class145.field3297[var2] = true;
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 106) {
				int var3 = class158.field3612.method538();
				int var4 = class158.field3612.method531();
				class36 var5;
				if (var3 >= 0) {
					var5 = class128.method991(var3);
				} else {
					var5 = null;
				}
				if (var3 < -70000) {
					var4 += 32768;
				}
				if (var5 != null) {
					for (int var6 = 0; var6 < var5.field834.length; var6++) {
						var5.field834[var6] = 0;
						var5.field753[var6] = 0;
					}
				}
				class102.method822(var4);
				int var7 = class158.field3612.method531();
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = class158.field3612.method529();
					if (var9 == 255) {
						var9 = class158.field3612.method509();
					}
					int var10 = class158.field3612.method524();
					if (var5 != null && var5.field834.length > var8) {
						var5.field834[var8] = var10;
						var5.field753[var8] = var9;
					}
					class36.method304(var4, var8, var9, var10 - 1);
				}
				if (var5 != null) {
					class132.method1008(var5);
				}
				class82.method644();
				class11.field191[class73.field1718++ & 0x1F] = var4 & 0x7FFF;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 42) {
				class106.field2504 = class115.field2700 / 8;
				for (int var11 = 0; var11 < class106.field2504; var11++) {
					class103.field2407[var11] = class158.field3612.method527();
					class71.field1685[var11] = class9.method59(class103.field2407[var11]);
				}
				class86.field2004 = -1;
				class2.field26 = class115.field2767;
				return true;
			}
			if (class86.field2004 == 210) {
				int var12 = class158.field3612.method509();
				int var13 = class158.field3612.method524();
				class36 var14 = class128.method991(var12);
				if (var14.field770 != 2 || var14.field849 != var13) {
					var14.field770 = 2;
					var14.field849 = var13;
					class132.method1008(var14);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 92) {
				int var15 = class158.field3612.method531();
				if (var15 == 65535) {
					var15 = -1;
				}
				int var16 = class158.field3612.method538();
				int var17 = class158.field3612.method525();
				class36 var18 = class128.method991(var16);
				if (var18.field848) {
					var18.field786 = var17;
					var18.field804 = var15;
					class62 var20 = class146.method1092(var15);
					var18.field874 = var20.field1416;
					var18.field808 = var20.field1391;
					var18.field816 = var20.field1384;
					var18.field750 = var20.field1374;
					var18.field812 = var20.field1426;
					if (var18.field810 > 0) {
						var18.field808 = var18.field808 * 32 / var18.field810;
					}
					var18.field851 = var20.field1376;
					class132.method1008(var18);
				} else if (var15 == -1) {
					class86.field2004 = -1;
					var18.field770 = 0;
					return true;
				} else {
					class62 var19 = class146.method1092(var15);
					var18.field808 = var19.field1391 * 100 / var17;
					var18.field874 = var19.field1416;
					var18.field770 = 4;
					var18.field812 = var19.field1426;
					var18.field849 = var15;
					class132.method1008(var18);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 175) {
				for (int var21 = 0; var21 < class52.field1175.length; var21++) {
					if (class52.field1175[var21] != null) {
						class52.field1175[var21].field2712 = -1;
					}
				}
				for (int var22 = 0; var22 < class14.field230.length; var22++) {
					if (class14.field230[var22] != null) {
						class14.field230[var22].field2712 = -1;
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 89) {
				class32 var23 = class158.field3612.method555();
				Object[] var24 = new Object[var23.method240() + 1];
				for (int var25 = var23.method240() - 1; var25 >= 0; var25--) {
					if (var23.method260(var25) == 115) {
						var24[var25 + 1] = class158.field3612.method555();
					} else {
						var24[var25 + 1] = Integer.valueOf(class158.field3612.method538());
					}
				}
				var24[0] = Integer.valueOf(class158.field3612.method538());
				class12 var26 = new class12();
				var26.field208 = var24;
				class158.method1222(var26);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 238) {
				class32 var27 = class158.field3612.method555();
				if (var27.method266(class114.field2649)) {
					class32 var28 = var27.method241(0, var27.method267(class152.field3508));
					boolean var29 = false;
					long var30 = var28.method259();
					for (int var32 = 0; var32 < class106.field2504; var32++) {
						if (var30 == class103.field2407[var32]) {
							var29 = true;
							break;
						}
					}
					if (!var29 && class97.field2230 == 0) {
						class79.method628(class80.field1853, 4, var28);
					}
				} else if (var27.method266(class105.field2496)) {
					boolean var33 = false;
					class32 var34 = var27.method241(0, var27.method267(class152.field3508));
					long var35 = var34.method259();
					for (int var37 = 0; var37 < class106.field2504; var37++) {
						if (class103.field2407[var37] == var35) {
							var33 = true;
							break;
						}
					}
					if (!var33 && class97.field2230 == 0) {
						class79.method628(class119.field2852, 8, var34);
					}
				} else if (var27.method266(class17.field350)) {
					class32 var46 = var27.method241(0, var27.method267(class152.field3508));
					boolean var47 = false;
					long var48 = var46.method259();
					for (int var50 = 0; var50 < class106.field2504; var50++) {
						if (class103.field2407[var50] == var48) {
							var47 = true;
							break;
						}
					}
					if (!var47 && class97.field2230 == 0) {
						class32 var51 = var27.method241(var27.method267(class152.field3508) + 1, var27.method240() + -9);
						class79.method628(var51, 8, var46);
					}
				} else if (var27.method266(class94.field2183)) {
					class32 var41 = var27.method241(0, var27.method267(class152.field3508));
					long var42 = var41.method259();
					boolean var44 = false;
					for (int var45 = 0; var45 < class106.field2504; var45++) {
						if (var42 == class103.field2407[var45]) {
							var44 = true;
							break;
						}
					}
					if (!var44 && class97.field2230 == 0) {
						class79.method628(class77.field1786, 10, var41);
					}
				} else if (var27.method266(class27.field502)) {
					class32 var40 = var27.method241(0, var27.method267(class27.field502));
					class79.method628(var40, 11, class77.field1786);
				} else if (var27.method266(class65.field1520)) {
					class32 var38 = var27.method241(0, var27.method267(class65.field1520));
					if (class97.field2230 == 0) {
						class79.method628(var38, 12, class77.field1786);
					}
				} else if (var27.method266(class145.field3307)) {
					class32 var39 = var27.method241(0, var27.method267(class145.field3307));
					if (class97.field2230 == 0) {
						class79.method628(var39, 13, class77.field1786);
					}
				} else {
					class79.method628(var27, 0, class77.field1786);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 188) {
				class91.method723();
				class86.field2004 = -1;
				return false;
			}
			if (class86.field2004 == 184) {
				long var52 = class158.field3612.method527();
				int var54 = class158.field3612.method531();
				int var55 = class158.field3612.method532();
				class32 var56 = class9.method59(var52).method264();
				for (int var57 = 0; var57 < class2.field20; var57++) {
					if (var52 == class33.field694[var57]) {
						if (var54 != class91.field2094[var57]) {
							class91.field2094[var57] = var54;
							if (var54 > 0) {
								class79.method628(class52.method402(new class32[] { var56, class41.field963 }), 5, class77.field1786);
							}
							if (var54 == 0) {
								class79.method628(class52.method402(new class32[] { var56, class97.field2226 }), 5, class77.field1786);
							}
						}
						class5.field103[var57] = var55;
						var56 = null;
						break;
					}
				}
				if (var56 != null && class2.field20 < 200) {
					class33.field694[class2.field20] = var52;
					class14.field239[class2.field20] = var56;
					class91.field2094[class2.field20] = var54;
					class5.field103[class2.field20] = var55;
					class2.field20++;
				}
				class2.field26 = class115.field2767;
				int var58 = class2.field20;
				while (var58 > 0) {
					var58--;
					boolean var59 = true;
					for (int var60 = 0; var60 < var58; var60++) {
						if (class91.field2094[var60] != class86.field2014 && class91.field2094[var60 + 1] == class86.field2014 || class91.field2094[var60] == 0 && class91.field2094[var60 + 1] != 0) {
							var59 = false;
							int var61 = class91.field2094[var60];
							class91.field2094[var60] = class91.field2094[var60 + 1];
							class91.field2094[var60 + 1] = var61;
							class32 var62 = class14.field239[var60];
							class14.field239[var60] = class14.field239[var60 + 1];
							class14.field239[var60 + 1] = var62;
							long var63 = class33.field694[var60];
							class33.field694[var60] = class33.field694[var60 + 1];
							class33.field694[var60 + 1] = var63;
							int var65 = class5.field103[var60];
							class5.field103[var60] = class5.field103[var60 + 1];
							class5.field103[var60 + 1] = var65;
						}
					}
					if (var59) {
						break;
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 212) {
				int var66 = class158.field3612.method509();
				class92.field2122 = class154.field3516.method180(var66);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 68) {
				long var67 = class158.field3612.method527();
				class158.field3612.method544();
				long var69 = class158.field3612.method527();
				boolean var71 = false;
				long var72 = (long) class158.field3612.method531();
				long var74 = (long) class158.field3612.method517();
				int var76 = class158.field3612.method532();
				long var77 = (var72 << 32) + var74;
				for (int var79 = 0; var79 < 100; var79++) {
					if (class74.field1739[var79] == var77) {
						var71 = true;
						break;
					}
				}
				if (var76 <= 1) {
					for (int var80 = 0; var80 < class106.field2504; var80++) {
						if (var67 == class103.field2407[var80]) {
							var71 = true;
							break;
						}
					}
				}
				if (!var71 && class97.field2230 == 0) {
					class74.field1739[class47.field1118] = var77;
					class47.field1118 = (class47.field1118 + 1) % 100;
					class32 var81 = class99.method771(class129.method996(class158.field3612).method258());
					if (var76 == 2 || var76 == 3) {
						class97.method756(class52.method402(new class32[] { class145.field3304, class9.method59(var67).method264() }), 9, var81, class9.method59(var69).method264());
					} else if (var76 == 1) {
						class97.method756(class52.method402(new class32[] { class143.field3278, class9.method59(var67).method264() }), 9, var81, class9.method59(var69).method264());
					} else {
						class97.method756(class9.method59(var67).method264(), 9, var81, class9.method59(var69).method264());
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 111) {
				int var82 = class158.field3612.method520();
				int var83 = class158.field3612.method518();
				int var84 = class158.field3612.method549();
				class144 var85 = (class144) class109.field2571.method1196((long) var84);
				if (var85 != null) {
					class134.method1021(var85.field3280 != var83, var85);
				}
				class80.method633(var82, var83, var84);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 38) {
				int var86 = class158.field3612.method551();
				int var87 = class158.field3612.method538();
				int var88 = class158.field3612.method551();
				class36 var89 = class128.method991(var87);
				int var90 = var86 + var89.field797;
				int var91 = var89.field769 + var88;
				if (var90 != var89.field829 || var91 != var89.field855) {
					var89.field855 = var91;
					var89.field829 = var90;
					class132.method1008(var89);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 73) {
				class2.field21 = class158.field3612.method532();
				class2.field23 = class158.field3612.method532();
				class43.field990 = class158.field3612.method532();
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 41) {
				int var92 = class158.field3612.method538();
				class32 var93 = class158.field3612.method555();
				class36 var94 = class128.method991(var92);
				if (!var93.method272(var94.field763)) {
					var94.field763 = var93;
					class132.method1008(var94);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 59) {
				int var95 = class158.field3612.method538();
				class36 var96 = class128.method991(var95);
				var96.field770 = 3;
				var96.field849 = class20.field373.field1631.method234();
				class132.method1008(var96);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 195 || class86.field2004 == 138 || class86.field2004 == 164 || class86.field2004 == 103 || class86.field2004 == 120 || class86.field2004 == 82 || class86.field2004 == 32 || class86.field2004 == 26 || class86.field2004 == 147 || class86.field2004 == 150 || class86.field2004 == 105) {
				class80.method631();
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 77) {
				long var97 = class158.field3612.method527();
				class32 var99 = class99.method771(class129.method996(class158.field3612).method258());
				class79.method628(var99, 6, class9.method59(var97).method264());
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 142) {
				int var100 = class158.field3612.method528();
				int var101 = class158.field3612.method509();
				class36 var102 = class128.method991(var101);
				if (var102.field765 != var100 || var100 == -1) {
					var102.field839 = 0;
					var102.field765 = var100;
					var102.field762 = 0;
					class132.method1008(var102);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 108) {
				class82.method644();
				class3.field49 = class158.field3612.method551();
				class86.field2004 = -1;
				class106.field2514 = class115.field2767;
				return true;
			}
			if (class86.field2004 == 137) {
				class56.field1294 = class158.field3612.method524() * 30;
				class106.field2514 = class115.field2767;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 110) {
				class61.field1356 = class158.field3612.method532();
				class86.field2004 = -1;
				class2.field26 = class115.field2767;
				return true;
			}
			if (class86.field2004 == 36) {
				class41.method323();
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 119) {
				class14.method74(class158.field3612);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 254) {
				int var103 = class158.field3612.method509();
				class36 var104 = class128.method991(var103);
				for (int var105 = 0; var105 < var104.field834.length; var105++) {
					var104.field834[var105] = -1;
					var104.field834[var105] = 0;
				}
				class132.method1008(var104);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 122) {
				class4.field72 = class158.field3612.method532();
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 134) {
				class45.field1066 = 0;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 171) {
				int var106 = class158.field3612.method531();
				int var107 = class158.field3612.method518();
				int var108 = class158.field3612.method518();
				int var109 = class158.field3612.method538();
				class36 var110 = class128.method991(var109);
				if (var110.field812 != var107 || var110.field874 != var106 || var110.field808 != var108) {
					var110.field874 = var106;
					var110.field808 = var108;
					var110.field812 = var107;
					class132.method1008(var110);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 169) {
				class4.method16(true);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 213) {
				for (int var111 = 0; var111 < class61.field1361; var111++) {
					class61 var112 = class56.method440(var111);
					if (var112 != null && var112.field1351 == 0) {
						class14.field238[var111] = 0;
						class27.field504[var111] = 0;
					}
				}
				class82.method644();
				field1993 += 32;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 208) {
				class82.method644();
				int var113 = class158.field3612.method535();
				int var114 = class158.field3612.method538();
				int var115 = class158.field3612.method535();
				class17.field343[var113] = var114;
				class137.field3173[var113] = var115;
				class50.field1159[var113] = 1;
				for (int var116 = 0; var116 < 98; var116++) {
					if (var114 >= class135.field3142[var116]) {
						class50.field1159[var113] = var116 + 2;
					}
				}
				class74.field1741[class86.field2011++ & 0x1F] = var113;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 55) {
				class23.field418 = true;
				class83.field1922 = class158.field3612.method532();
				class106.field2528 = class158.field3612.method532();
				class142.field3253 = class158.field3612.method531();
				class80.field1836 = class158.field3612.method532();
				class89.field2058 = class158.field3612.method532();
				if (class89.field2058 >= 100) {
					class48.field1126 = class106.field2528 * 128 + 64;
					class105.field2494 = class83.field1922 * 128 + 64;
					class73.field1719 = class83.method653(class43.field989, class105.field2494, class48.field1126) - class142.field3253;
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 190) {
				for (int var117 = 0; var117 < class27.field504.length; var117++) {
					if (class27.field504[var117] != class14.field238[var117]) {
						class27.field504[var117] = class14.field238[var117];
						class112.method882(var117);
						class118.field2821[field1993++ & 0x1F] = var117;
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 161) {
				int var118 = class158.field3612.method509();
				int var119 = class158.field3612.method531();
				if (var119 == 65535) {
					var119 = -1;
				}
				int var120 = class158.field3612.method525();
				int var121 = class158.field3612.method531();
				if (var121 == 65535) {
					var121 = -1;
				}
				for (int var122 = var119; var122 <= var121; var122++) {
					long var123 = ((long) var118 << 32) + ((long) var122);
					class146 var125 = class115.field2768.method1196(var123);
					if (var125 != null) {
						var125.method1091();
					}
					class115.field2768.method1201(var123, new class38(var120));
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 124) {
				if (class13.field220 != -1) {
					class154.method1192(class13.field220, 0);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 39) {
				class20.field368 = class158.field3612.method529();
				class43.field997 = class158.field3612.method532();
				for (int var126 = class43.field997; var126 < class43.field997 + 8; var126++) {
					for (int var127 = class20.field368; var127 < class20.field368 + 8; var127++) {
						if (class23.field397[class43.field989][var126][var127] != null) {
							class23.field397[class43.field989][var126][var127] = null;
							class157.method1205(var127, var126);
						}
					}
				}
				for (class23 var128 = (class23) class45.field1076.method1211(); var128 != null; var128 = (class23) class45.field1076.method1209()) {
					if (var128.field405 >= class43.field997 && class43.field997 + 8 > var128.field405 && class20.field368 <= var128.field420 && var128.field420 < class20.field368 + 8 && var128.field401 == class43.field989) {
						var128.field411 = 0;
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 222) {
				long var129 = class158.field3612.method527();
				long var131 = (long) class158.field3612.method531();
				long var133 = (long) class158.field3612.method517();
				long var135 = (var131 << 32) + var133;
				boolean var137 = false;
				int var138 = class158.field3612.method532();
				for (int var139 = 0; var139 < 100; var139++) {
					if (class74.field1739[var139] == var135) {
						var137 = true;
						break;
					}
				}
				if (var138 <= 1) {
					for (int var140 = 0; var140 < class106.field2504; var140++) {
						if (var129 == class103.field2407[var140]) {
							var137 = true;
							break;
						}
					}
				}
				if (!var137 && class97.field2230 == 0) {
					class74.field1739[class47.field1118] = var135;
					class47.field1118 = (class47.field1118 + 1) % 100;
					class32 var141 = class99.method771(class129.method996(class158.field3612).method258());
					if (var138 == 2 || var138 == 3) {
						class79.method628(var141, 7, class52.method402(new class32[] { class145.field3304, class9.method59(var129).method264() }));
					} else if (var138 == 1) {
						class79.method628(var141, 7, class52.method402(new class32[] { class143.field3278, class9.method59(var129).method264() }));
					} else {
						class79.method628(var141, 3, class9.method59(var129).method264());
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 207) {
				int var142 = class158.field3612.method518();
				class45.method344(var142);
				class11.field191[class73.field1718++ & 0x1F] = var142 & 0x7FFF;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 99) {
				int var143 = class158.field3612.method531();
				int var144 = class158.field3612.method532();
				int var145 = class158.field3612.method531();
				class4.method17(var143, var145, var144);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 244) {
				int var146 = class158.field3612.method524();
				int var147 = class158.field3612.method538();
				class14.field238[var146] = var147;
				if (class27.field504[var146] != var147) {
					class27.field504[var146] = var147;
					class112.method882(var146);
				}
				class118.field2821[field1993++ & 0x1F] = var146;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 209) {
				int var148 = class158.field3612.method518();
				int var149 = class158.field3612.method538();
				class36 var150 = class128.method991(var149);
				if (var150 != null && var150.field755 == 0) {
					if (var148 > var150.field820 - var150.field773) {
						var148 = var150.field820 - var150.field773;
					}
					if (var148 < 0) {
						var148 = 0;
					}
					if (var148 != var150.field872) {
						var150.field872 = var148;
						class132.method1008(var150);
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 201) {
				int var151 = class158.field3612.method518();
				byte var152 = class158.field3612.method544();
				class14.field238[var151] = var152;
				if (var152 != class27.field504[var151]) {
					class27.field504[var151] = var152;
					class112.method882(var151);
				}
				class118.field2821[field1993++ & 0x1F] = var151;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 232) {
				class125.field2911 = class158.field3612.method532();
				if (class125.field2911 == 1) {
					class80.field1854 = class158.field3612.method531();
				}
				if (class125.field2911 >= 2 && class125.field2911 <= 6) {
					if (class125.field2911 == 2) {
						client.field377 = 64;
						class137.field3194 = 64;
					}
					if (class125.field2911 == 3) {
						class137.field3194 = 0;
						client.field377 = 64;
					}
					if (class125.field2911 == 4) {
						class137.field3194 = 128;
						client.field377 = 64;
					}
					if (class125.field2911 == 5) {
						class137.field3194 = 64;
						client.field377 = 0;
					}
					if (class125.field2911 == 6) {
						client.field377 = 128;
						class137.field3194 = 64;
					}
					class125.field2911 = 2;
					class145.field3299 = class158.field3612.method531();
					class103.field2403 = class158.field3612.method531();
					class110.field2580 = class158.field3612.method532();
				}
				if (class125.field2911 == 10) {
					class79.field1830 = class158.field3612.method531();
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 160) {
				class23.field418 = false;
				for (int var153 = 0; var153 < 5; var153++) {
					class33.field699[var153] = false;
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 2) {
				int var154 = class158.field3612.method538();
				int var155 = class158.field3612.method531();
				class36 var156;
				if (var154 >= 0) {
					var156 = class128.method991(var154);
				} else {
					var156 = null;
				}
				if (var154 < -70000) {
					var155 += 32768;
				}
				while (class158.field3612.field1568 < class115.field2700) {
					int var157 = class158.field3612.method505();
					int var158 = class158.field3612.method531();
					int var159 = 0;
					if (var158 != 0) {
						var159 = class158.field3612.method532();
						if (var159 == 255) {
							var159 = class158.field3612.method538();
						}
					}
					if (var156 != null && var157 >= 0 && var156.field834.length > var157) {
						var156.field834[var157] = var158;
						var156.field753[var157] = var159;
					}
					class36.method304(var155, var157, var159, var158 - 1);
				}
				if (var156 != null) {
					class132.method1008(var156);
				}
				class82.method644();
				class11.field191[class73.field1718++ & 0x1F] = var155 & 0x7FFF;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 239) {
				int var160 = class158.field3612.method525();
				int var161 = class158.field3612.method519();
				int var162 = class158.field3612.method531();
				class36 var163 = class128.method991(var160);
				class86.field2004 = -1;
				var163.field749 = var161 + (var162 << 16);
				return true;
			}
			if (class86.field2004 == 74) {
				class91.method726();
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 51) {
				class111.method874(class115.field2700, class158.field3612, class154.field3516);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 10) {
				int var164 = class158.field3612.method519();
				if (var164 == 65535) {
					var164 = -1;
				}
				class102.method825(var164);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 112) {
				int var165 = class158.field3612.method518();
				if (var165 == 65535) {
					var165 = -1;
				}
				int var166 = class158.field3612.method517();
				class38.method315(var165, var166);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 94) {
				int var167 = class158.field3612.method535();
				int var168 = class158.field3612.method535();
				class32 var169 = class158.field3612.method555();
				if (var167 >= 1 && var167 <= 8) {
					if (var169.method271(class91.field2101)) {
						var169 = null;
					}
					class38.field914[var167 - 1] = var169;
					class44.field1042[var167 - 1] = var168 == 0;
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 25) {
				int var170 = class158.field3612.method531();
				int var171 = class158.field3612.method538();
				class36 var172 = class128.method991(var171);
				if (var172.field770 != 1 || var170 != var172.field849) {
					var172.field849 = var170;
					var172.field770 = 1;
					class132.method1008(var172);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 224) {
				int var173 = class115.field2700 + class158.field3612.field1568;
				int var174 = class158.field3612.method531();
				int var175 = class158.field3612.method531();
				if (var174 != class13.field220) {
					class13.field220 = var174;
					client.method156(class13.field220);
					class64.method493(class13.field220);
					for (int var176 = 0; var176 < 100; var176++) {
						class145.field3297[var176] = true;
					}
				}
				while (var175-- > 0) {
					int var177 = class158.field3612.method538();
					int var178 = class158.field3612.method531();
					int var179 = class158.field3612.method532();
					class144 var180 = (class144) class109.field2571.method1196((long) var177);
					if (var180 != null && var180.field3280 != var178) {
						class134.method1021(true, var180);
						var180 = null;
					}
					if (var180 == null) {
						var180 = class80.method633(var179, var178, var177);
					}
					var180.field3284 = true;
				}
				for (class144 var181 = (class144) class109.field2571.method1203(); var181 != null; var181 = (class144) class109.field2571.method1199()) {
					if (var181.field3284) {
						var181.field3284 = false;
					} else {
						class134.method1021(true, var181);
					}
				}
				class115.field2768 = new class156(512);
				while (var173 > class158.field3612.field1568) {
					int var182 = class158.field3612.method538();
					int var183 = class158.field3612.method531();
					int var184 = class158.field3612.method531();
					int var185 = class158.field3612.method538();
					for (int var186 = var183; var186 <= var184; var186++) {
						long var187 = ((long) var182 << 32) + (long) var186;
						class115.field2768.method1201(var187, new class38(var185));
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 4) {
				class1.field11 = class115.field2767;
				long var189 = class158.field3612.method527();
				if (var189 == 0L) {
					class126.field2924 = null;
					class111.field2609 = null;
					class86.field2004 = -1;
					class131.field3010 = null;
					class158.field3636 = 0;
					return true;
				}
				long var191 = class158.field3612.method527();
				class131.field3010 = class9.method59(var191);
				class126.field2924 = class9.method59(var189);
				class102.field2389 = class158.field3612.method544();
				int var193 = class158.field3612.method532();
				if (var193 == 255) {
					class86.field2004 = -1;
					return true;
				}
				class37[] var194 = new class37[100];
				class158.field3636 = var193;
				for (int var195 = 0; var195 < class158.field3636; var195++) {
					var194[var195] = new class37();
					var194[var195].field3324 = class158.field3612.method527();
					var194[var195].field885 = class9.method59(var194[var195].field3324);
					var194[var195].field887 = class158.field3612.method531();
					var194[var195].field880 = class158.field3612.method544();
					if (class98.field2259 == var194[var195].field3324) {
						class149.field3383 = var194[var195].field880;
					}
				}
				int var196 = class158.field3636;
				while (var196 > 0) {
					var196--;
					boolean var197 = true;
					for (int var198 = 0; var198 < var196; var198++) {
						if (var194[var198].field885.method238(var194[var198 + 1].field885) > 0) {
							var197 = false;
							class37 var199 = var194[var198];
							var194[var198] = var194[var198 + 1];
							var194[var198 + 1] = var199;
						}
					}
					if (var197) {
						break;
					}
				}
				class111.field2609 = var194;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 247) {
				int var200 = class158.field3612.method532();
				int var201 = class158.field3612.method532();
				int var202 = class158.field3612.method532();
				int var203 = class158.field3612.method532();
				class33.field699[var200] = true;
				class114.field2653[var200] = var201;
				class124.field2883[var200] = var202;
				class145.field3294[var200] = var203;
				class17.field351[var200] = 0;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 33) {
				class43.field997 = class158.field3612.method520();
				class20.field368 = class158.field3612.method529();
				while (class158.field3612.field1568 < class115.field2700) {
					class86.field2004 = class158.field3612.method532();
					class80.method631();
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 197) {
				class82.method644();
				class136.field3153 = class158.field3612.method532();
				class86.field2004 = -1;
				class106.field2514 = class115.field2767;
				return true;
			}
			if (class86.field2004 == 76) {
				class23.field418 = true;
				class86.field2021 = class158.field3612.method532();
				class37.field896 = class158.field3612.method532();
				class61.field1359 = class158.field3612.method531();
				class94.field2174 = class158.field3612.method532();
				class79.field1824 = class158.field3612.method532();
				if (class79.field1824 >= 100) {
					int var204 = class86.field2021 * 128 + 64;
					int var205 = class37.field896 * 128 + 64;
					int var206 = class83.method653(class43.field989, var204, var205) - class61.field1359;
					int var207 = var206 - class73.field1719;
					int var208 = var205 - class48.field1126;
					int var209 = var204 - class105.field2494;
					int var210 = (int) Math.sqrt((double) (var209 * var209 + var208 * var208));
					class45.field1049 = (int) (Math.atan2((double) var207, (double) var210) * 325.949D) & 0x7FF;
					class115.field2718 = (int) (-325.949D * Math.atan2((double) var209, (double) var208)) & 0x7FF;
					if (class45.field1049 < 128) {
						class45.field1049 = 128;
					}
					if (class45.field1049 > 383) {
						class45.field1049 = 383;
					}
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 237) {
				int var211 = class158.field3612.method538();
				class144 var212 = (class144) class109.field2571.method1196((long) var211);
				if (var212 != null) {
					class134.method1021(true, var212);
				}
				if (class50.field1158 != null) {
					class132.method1008(class50.field1158);
					class50.field1158 = null;
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 130) {
				boolean var213 = class158.field3612.method532() == 1;
				int var214 = class158.field3612.method549();
				class36 var215 = class128.method991(var214);
				if (var215.field740 != var213) {
					var215.field740 = var213;
					class132.method1008(var215);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 46) {
				long var216 = class158.field3612.method527();
				int var218 = class158.field3612.method531();
				byte var219 = class158.field3612.method544();
				boolean var220 = false;
				if ((var216 & Long.MIN_VALUE) != 0L) {
					var220 = true;
				}
				if (var220) {
					if (class158.field3636 == 0) {
						class86.field2004 = -1;
						return true;
					}
					long var225 = var216 & Long.MAX_VALUE;
					int var227;
					for (var227 = 0; class158.field3636 > var227 && (class111.field2609[var227].field3324 != var225 || var218 != class111.field2609[var227].field887); var227++) {
					}
					if (class158.field3636 > var227) {
						while (var227 < class158.field3636 - 1) {
							class111.field2609[var227] = class111.field2609[var227 + 1];
							var227++;
						}
						class158.field3636--;
						class111.field2609[class158.field3636] = null;
					}
				} else {
					class37 var221 = new class37();
					var221.field3324 = var216;
					var221.field885 = class9.method59(var221.field3324);
					var221.field887 = var218;
					var221.field880 = var219;
					int var222;
					for (var222 = class158.field3636 - 1; var222 >= 0; var222--) {
						int var223 = class111.field2609[var222].field885.method238(var221.field885);
						if (var223 == 0) {
							class111.field2609[var222].field887 = var218;
							class111.field2609[var222].field880 = var219;
							if (var216 == class98.field2259) {
								class149.field3383 = var219;
							}
							class1.field11 = class115.field2767;
							class86.field2004 = -1;
							return true;
						}
						if (var223 < 0) {
							break;
						}
					}
					if (class158.field3636 >= class111.field2609.length) {
						class86.field2004 = -1;
						return true;
					}
					for (int var224 = class158.field3636 - 1; var224 > var222; var224--) {
						class111.field2609[var224 + 1] = class111.field2609[var224];
					}
					if (class158.field3636 == 0) {
						class111.field2609 = new class37[100];
					}
					class111.field2609[var222 + 1] = var221;
					if (var216 == class98.field2259) {
						class149.field3383 = var219;
					}
					class158.field3636++;
				}
				class1.field11 = class115.field2767;
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 45) {
				int var228 = class158.field3612.method535();
				int var229 = class158.field3612.method529();
				int var230 = class158.field3612.method520();
				class43.field989 = var228 >> 1;
				class20.field373.method902(var230, (var228 & 0x1) == 1, var229);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 5) {
				int var231 = class158.field3612.method531();
				int var232 = var231 >> 10 & 0x1F;
				int var233 = class158.field3612.method509();
				int var234 = var231 & 0x1F;
				int var235 = var231 >> 5 & 0x1F;
				class36 var236 = class128.method991(var233);
				int var237 = (var235 << 11) + (var232 << 19) + (var234 << 3);
				if (var236.field776 != var237) {
					var236.field776 = var237;
					class132.method1008(var236);
				}
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 231) {
				class4.method16(false);
				class86.field2004 = -1;
				return true;
			}
			if (class86.field2004 == 115) {
				class20.field368 = class158.field3612.method529();
				class43.field997 = class158.field3612.method520();
				class86.field2004 = -1;
				return true;
			}
			class110.method870(null, "T1 - " + class86.field2004 + "," + class158.field3616 + "," + class34.field710 + " - " + class115.field2700);
			class91.method723();
		} catch (IOException var241) {
			class65.method503();
		} catch (Exception var242) {
			String var239 = "T2 - " + class86.field2004 + "," + class158.field3616 + "," + class34.field710 + " - " + class115.field2700 + "," + (class72.field1700 + class20.field373.field2759[0]) + "," + (class118.field2836 + class20.field373.field2736[0]) + " - ";
			for (int var240 = 0; class115.field2700 > var240 && var240 < 50; var240++) {
				var239 = var239 + class158.field3612.field1586[var240] + ",";
			}
			class110.method870(var242, var239);
			class91.method723();
		}
		return true;
	}

	@ObfuscatedName("mb.b(I)V")
	public static void method662() {
		field1987 = null;
		field1991 = null;
		field1980 = null;
		field1984 = null;
		field1981 = null;
		field1995 = null;
		field1998 = null;
		field1985 = null;
		field1994 = null;
		field1978 = null;
		field1986 = null;
		field1999 = null;
		field1989 = null;
		field1988 = null;
	}
}
