package deob;

@ObfuscatedName("s")
public final class class125 {

	@ObfuscatedName("s.a")
	public static int field2898 = 0;

	@ObfuscatedName("s.c")
	public static class32 field2900 = class73.method593("Too many connections from your address)3", true);

	@ObfuscatedName("s.d")
	public static class32 field2901 = class73.method593("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", true);

	@ObfuscatedName("s.e")
	public static class32 field2902 = class73.method593("Diese Welt ist voll)3", true);

	@ObfuscatedName("s.f")
	public static long[] field2903 = new long[32];

	@ObfuscatedName("s.i")
	public static class32 field2906 = field2900;

	@ObfuscatedName("s.n")
	public static int field2911 = 0;

	@ObfuscatedName("s.p")
	public static int field2913 = 0;

	@ObfuscatedName("s.q")
	public static boolean field2914 = false;

	@ObfuscatedName("s.a(Z)V")
	public static void method977() {
		if (class66.field1585 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (class66.field1585 > 768) {
					class63.field1442[var0] = class85.method658(class133.field3086[var0], 1024 - class66.field1585, class94.field2169[var0]);
				} else if (class66.field1585 > 256) {
					class63.field1442[var0] = class133.field3086[var0];
				} else {
					class63.field1442[var0] = class85.method658(class94.field2169[var0], 256 - class66.field1585, class133.field3086[var0]);
				}
			}
		} else if (class85.field1996 > 0) {
			for (int var1 = 0; var1 < 256; var1++) {
				if (class85.field1996 > 768) {
					class63.field1442[var1] = class85.method658(class124.field2890[var1], 1024 - class85.field1996, class94.field2169[var1]);
				} else if (class85.field1996 <= 256) {
					class63.field1442[var1] = class85.method658(class94.field2169[var1], 256 - class85.field1996, class124.field2890[var1]);
				} else {
					class63.field1442[var1] = class124.field2890[var1];
				}
			}
		} else {
			for (int var2 = 0; var2 < 256; var2++) {
				class63.field1442[var2] = class94.field2169[var2];
			}
		}
		int var3 = 0;
		int var4 = 6885;
		class141.method1066(0, 9, 128, 263);
		class100.field2320.method387(0, 0);
		class141.method1056();
		for (int var5 = 1; var5 < 255; var5++) {
			int var6 = (256 - var5) * class81.field1868[var5] / 256;
			int var7 = var6 + 22;
			if (var7 < 0) {
				var7 = 0;
			}
			var3 += var7;
			for (int var8 = var7; var8 < 128; var8++) {
				int var9 = class43.field998[var3++];
				if (var9 == 0) {
					var4++;
				} else {
					int var11 = class50.field1157.field1124[var4];
					int var12 = 256 - var9;
					int var13 = class63.field1442[var9];
					class50.field1157.field1124[var4++] = ((var13 & 0xFF00) * var9 + var12 * (var11 & 0xFF00) & 0xFF0000) + (var12 * (var11 & 0xFF00FF) + (var13 & 0xFF00FF) * var9 & 0xFF00FF00) >> 8;
				}
			}
			var4 += var7 + 765 - 128;
		}
		int var14 = 7546;
		int var15 = 0;
		class141.method1066(637, 9, 765, 263);
		class45.field1052.method387(382, 0);
		class141.method1056();
		for (int var16 = 1; var16 < 255; var16++) {
			int var17 = class81.field1868[var16] * (256 - var16) / 256;
			int var18 = var14 + var17;
			int var19 = 103 - var17;
			for (int var20 = 0; var20 < var19; var20++) {
				int var21 = class43.field998[var15++];
				if (var21 == 0) {
					var18++;
				} else {
					int var23 = 256 - var21;
					int var24 = class50.field1157.field1124[var18];
					int var25 = class63.field1442[var21];
					class50.field1157.field1124[var18++] = ((var25 & 0xFF00FF) * var21 + var23 * (var24 & 0xFF00FF) & 0xFF00FF00) + ((var25 & 0xFF00) * var21 + var23 * (var24 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			var15 += 128 - var19;
			var14 = var18 + 765 - var17 - var19;
		}
	}

	@ObfuscatedName("s.a(II)Lec;")
	public static class32 method978(int arg0) {
		class32 var1 = class159.method1228(arg0);
		for (int var2 = var1.method240() - 3; var2 > 0; var2 -= 3) {
			var1 = class52.method402(new class32[] { var1.method241(0, var2), class75.field1769, var1.method268(var2) });
		}
		if (var1.method240() > 9) {
			return class52.method402(new class32[] { class135.field3138, var1.method241(0, var1.method240() - 8), class44.field1044, class41.field954, var1, class106.field2501 });
		} else if (var1.method240() > 6) {
			return class52.method402(new class32[] { class38.field927, var1.method241(0, var1.method240() - 4), class89.field2050, class41.field954, var1, class106.field2501 });
		} else {
			return class52.method402(new class32[] { class151.field3466, var1, class65.field1508 });
		}
	}

	@ObfuscatedName("s.a(III[Lf;IIIIII)V")
	public static void method979(int arg0, int arg1, class36[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class141.method1066(arg1, arg7, arg0, arg8);
		class7.method36();
		for (int var9 = 0; var9 < arg2.length; var9++) {
			class36 var10 = arg2[var9];
			if (var10 != null && (arg3 == var10.field864 || arg3 == -1412584499 && class158.field3629 == var10)) {
				int var11;
				if (arg6 == -1) {
					class144.field3287[class133.field3081] = arg4 + var10.field829;
					class124.field2892[class133.field3081] = arg5 + var10.field855;
					class28.field512[class133.field3081] = var10.field810;
					class20.field366[class133.field3081] = var10.field773;
					var11 = class133.field3081++;
				} else {
					var11 = arg6;
				}
				var10.field823 = var11;
				var10.field840 = class140.field3217;
				if (!var10.field848 || !class118.method932(var10)) {
					if (var10.field845 > 0) {
						class34.method289(var10);
					}
					int var12 = arg4 + var10.field829;
					int var13 = var10.field861;
					int var14 = var10.field855 + arg5;
					if (class158.field3629 == var10) {
						if (arg3 != -1412584499 && !var10.field862) {
							class84.field1968 = arg5;
							class68.field1603 = arg4;
							class98.field2253 = arg2;
							continue;
						}
						if (!var10.field862) {
							var13 = 128;
						}
						if (class77.field1789 && class27.field500) {
							int var15 = class140.field3216;
							int var16 = var15 - class88.field2029;
							if (class137.field3180 > var16) {
								var16 = class137.field3180;
							}
							if (class117.field2807.field773 + class137.field3180 < var16 + var10.field773) {
								var16 = class117.field2807.field773 + class137.field3180 - var10.field773;
							}
							int var17 = class86.field2001;
							int var18 = var17 - class45.field1068;
							var14 = var16;
							if (class111.field2606 > var18) {
								var18 = class111.field2606;
							}
							if (class117.field2807.field810 + class111.field2606 < var18 + var10.field810) {
								var18 = class111.field2606 + class117.field2807.field810 - var10.field810;
							}
							var12 = var18;
						}
					}
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.field755 == 2) {
						var19 = arg8;
						var20 = arg1;
						var21 = arg7;
						var22 = arg0;
					} else if (var10.field755 == 9) {
						int var25 = var14;
						int var26 = var12;
						int var27 = var10.field773 + var14;
						int var28 = var10.field810 + var12;
						if (var12 > var28) {
							var26 = var28;
							var28 = var12;
						}
						var20 = arg1 >= var26 ? arg1 : var26;
						if (var14 > var27) {
							var25 = var27;
							var27 = var14;
						}
						var21 = var25 <= arg7 ? arg7 : var25;
						var27++;
						var19 = var27 < arg8 ? var27 : arg8;
						var28++;
						var22 = arg0 <= var28 ? arg0 : var28;
					} else {
						var21 = arg7 < var14 ? var14 : arg7;
						var20 = var12 > arg1 ? var12 : arg1;
						int var23 = var12 + var10.field810;
						int var24 = var14 + var10.field773;
						var22 = var23 < arg0 ? var23 : arg0;
						var19 = var24 >= arg8 ? arg8 : var24;
					}
					if (!var10.field848 || var22 > var20 && var21 < var19) {
						if (var10.field845 != 0) {
							if (var10.field845 == 1337) {
								class154.field3513 = var14;
								class32.field677 = var12;
								class75.method602(var10.field810, var12, var10.field773, var14);
								class141.method1066(arg1, arg7, arg0, arg8);
								continue;
							}
							if (var10.field845 == 1338) {
								class88.method671(var14, var12, var11);
								class141.method1066(arg1, arg7, arg0, arg8);
								continue;
							}
						}
						int var31 = class86.field2001;
						int var32 = class140.field3216;
						if (!class26.field476 && var20 <= var31 && var21 <= var32 && var22 > var31 && var19 > var32) {
							class159.method1229(var32 - var14, var10, var31 - var12);
						}
						if (var10.field755 == 0) {
							if (!var10.field848 && class118.method932(var10) && var10 != class50.field1163) {
								continue;
							}
							if (!var10.field848) {
								if (var10.field820 - var10.field773 < var10.field872) {
									var10.field872 = var10.field820 - var10.field773;
								}
								if (var10.field872 < 0) {
									var10.field872 = 0;
								}
							}
							method979(var22, var20, arg2, var10.field743, var12 - var10.field843, -var10.field872 + var14, var11, var21, var19);
							if (var10.field754 != null) {
								method979(var22, var20, var10.field754, var10.field743, var12 - var10.field843, -var10.field872 + var14, var11, var21, var19);
							}
							class144 var33 = (class144) class109.field2571.method1196((long) var10.field743);
							if (var33 != null) {
								if (var33.field3291 == 0 && class86.field2001 >= var20 && class140.field3216 >= var21 && class86.field2001 < var22 && var19 > class140.field3216 && !class26.field476 && !class146.field3318) {
									class119.field2849 = 1;
									class44.field1034[0] = 1007;
									class109.field2575[0] = class92.field2114;
									class56.field1295[0] = class77.field1786;
								}
								class84.method656(var21, var12, var33.field3280, var20, var11, var22, var19, var14);
							}
							class141.method1066(arg1, arg7, arg0, arg8);
							class7.method36();
						}
						if (class57.field1318[var11] || class92.field2116 > 1) {
							if (var10.field755 == 0 && !var10.field848 && var10.field773 < var10.field820) {
								class32.method257(var10.field872, var14, var10.field810 + var12, var10.field820, var10.field773);
							}
							if (var10.field755 != 1) {
								if (var10.field755 == 2) {
									int var34 = 0;
									for (int var35 = 0; var35 < var10.field773; var35++) {
										for (int var36 = 0; var36 < var10.field810; var36++) {
											int var37 = var12 + (var10.field818 + 32) * var36;
											int var38 = var14 + var35 * (var10.field784 + 32);
											if (var34 < 20) {
												var38 += var10.field745[var34];
												var37 += var10.field809[var34];
											}
											if (var10.field834[var34] > 0) {
												int var39 = var10.field834[var34] - 1;
												if (arg1 < var37 + 32 && var37 < arg0 && arg7 < var38 + 32 && var38 < arg8 || class34.field723 == var10 && var34 == class107.field2542) {
													class49 var40;
													if (field2913 == 1 && var34 == class41.field966 && class44.field1038 == var10.field743) {
														var40 = class133.method1016(2, var39, false, 0, var10.field753[var34]);
													} else {
														var40 = class133.method1016(1, var39, false, 3153952, var10.field753[var34]);
													}
													if (var40 == null) {
														class132.method1008(var10);
													} else if (var10 == class34.field723 && class107.field2542 == var34) {
														int var41 = class86.field2001 - class113.field2637;
														int var42 = class140.field3216 - class94.field2160;
														if (var41 < 5 && var41 > -5) {
															var41 = 0;
														}
														if (var42 < 5 && var42 > -5) {
															var42 = 0;
														}
														if (class109.field2569 < 5) {
															var42 = 0;
															var41 = 0;
														}
														var40.method384(var37 + var41, var38 - -var42, 128);
														if (arg3 != -1) {
															class36 var43 = arg2[arg3 & 0xFFFF];
															if (class141.field3236 > var42 + var38 && var43.field872 > 0) {
																int var44 = (class141.field3236 - var38 - var42) * class54.field1282 / 3;
																if (var44 > class54.field1282 * 10) {
																	var44 = class54.field1282 * 10;
																}
																if (var44 > var43.field872) {
																	var44 = var43.field872;
																}
																var43.field872 -= var44;
																class94.field2160 += var44;
																class132.method1008(var43);
															}
															if (var42 + var38 + 32 > class141.field3239 && var43.field820 - var43.field773 > var43.field872) {
																int var45 = class54.field1282 * (var38 + var42 + 32 - class141.field3239) / 3;
																if (class54.field1282 * 10 < var45) {
																	var45 = class54.field1282 * 10;
																}
																if (var45 > var43.field820 - var43.field872 - var43.field773) {
																	var45 = var43.field820 - var43.field773 - var43.field872;
																}
																var43.field872 += var45;
																class94.field2160 -= var45;
																class132.method1008(var43);
															}
														}
													} else if (var10 == class5.field89 && class34.field729 == var34) {
														var40.method384(var37, var38, 128);
													} else {
														var40.method369(var37, var38);
													}
												}
											} else if (var10.field761 != null && var34 < 20) {
												class49 var46 = var10.method307(var34);
												if (var46 != null) {
													var46.method369(var37, var38);
												} else if (field2914) {
													class132.method1008(var10);
												}
											}
											var34++;
										}
									}
								} else if (var10.field755 == 3) {
									int var47;
									if (class84.method657(var10)) {
										var47 = var10.field869;
										if (var10 == class50.field1163 && var10.field783 != 0) {
											var47 = var10.field783;
										}
									} else {
										var47 = var10.field776;
										if (var10 == class50.field1163 && var10.field830 != 0) {
											var47 = var10.field830;
										}
									}
									if (var13 == 0) {
										if (var10.field803) {
											class141.method1053(var12, var14, var10.field810, var10.field773, var47);
										} else {
											class141.method1058(var12, var14, var10.field810, var10.field773, var47);
										}
									} else if (var10.field803) {
										class141.method1057(var12, var14, var10.field810, var10.field773, var47, 256 - (var13 & 0xFF));
									} else {
										class141.method1068(var12, var14, var10.field810, var10.field773, var47, 256 - (var13 & 0xFF));
									}
								} else if (var10.field755 == 4) {
									class96 var48 = var10.method302();
									if (var48 != null) {
										class32 var49 = var10.field763;
										int var50;
										if (class84.method657(var10)) {
											var50 = var10.field869;
											if (class50.field1163 == var10 && var10.field783 != 0) {
												var50 = var10.field783;
											}
											if (var10.field774.method240() > 0) {
												var49 = var10.field774;
											}
										} else {
											var50 = var10.field776;
											if (var10 == class50.field1163 && var10.field830 != 0) {
												var50 = var10.field830;
											}
										}
										if (var10.field848 && var10.field804 != -1) {
											class62 var51 = class146.method1092(var10.field804);
											var49 = var51.field1429;
											if (var49 == null) {
												var49 = class91.field2101;
											}
											if ((var51.field1409 == 1 || var10.field786 != 1) && var10.field786 != -1) {
												var49 = class52.method402(new class32[] { class38.field902, var49, class115.field2719, method978(var10.field786) });
											}
										}
										if (class50.field1158 == var10) {
											var49 = class131.field3015;
											var50 = var10.field776;
										}
										if (!var10.field848) {
											var49 = class89.method674(var10, var49);
										}
										var48.method769(var49, var12, var14, var10.field810, var10.field773, var50, var10.field856 ? 0 : -1, var10.field841, var10.field799, var10.field838);
									} else if (field2914) {
										class132.method1008(var10);
									}
								} else if (var10.field755 == 5) {
									if (var10.field848) {
										class49 var53;
										if (var10.field804 == -1) {
											var53 = var10.method299(false);
										} else {
											var53 = class133.method1016(var10.field796, var10.field804, false, var10.field817, var10.field786);
										}
										if (var53 != null) {
											int var54 = var53.field1138;
											int var55 = var53.field1140;
											if (var10.field748) {
												class141.method1065(var12, var14, var12 + var10.field810, var10.field773 + var14);
												int var57 = (var54 + var10.field810 - 1) / var54;
												int var58 = (var55 + var10.field773 - 1) / var55;
												for (int var59 = 0; var59 < var57; var59++) {
													for (int var60 = 0; var60 < var58; var60++) {
														if (var10.field777 != 0) {
															var53.method382(var12 + var54 * var59 + var54 / 2, var55 * var60 + var14 + var55 / 2, var10.field777, 4096);
														} else if (var13 == 0) {
															var53.method369(var12 + var54 * var59, var14 - -(var60 * var55));
														} else {
															var53.method384(var59 * var54 + var12, var60 * var55 + var14, 256 - (var13 & 0xFF));
														}
													}
												}
												class141.method1066(arg1, arg7, arg0, arg8);
											} else {
												int var56 = var10.field810 * 4096 / var54;
												if (var10.field777 != 0) {
													var53.method382(var10.field810 / 2 + var12, var14 + var10.field773 / 2, var10.field777, var56);
												} else if (var13 != 0) {
													var53.method372(var12, var14, var10.field810, var10.field773, 256 - (var13 & 0xFF));
												} else if (var10.field810 == var54 && var10.field773 == var55) {
													var53.method369(var12, var14);
												} else {
													var53.method370(var12, var14, var10.field810, var10.field773);
												}
											}
										} else if (field2914) {
											class132.method1008(var10);
										}
									} else {
										class49 var52 = var10.method299(class84.method657(var10));
										if (var52 != null) {
											var52.method369(var12, var14);
										} else if (field2914) {
											class132.method1008(var10);
										}
									}
								} else if (var10.field755 == 6) {
									boolean var61 = class84.method657(var10);
									int var62;
									if (var61) {
										var62 = var10.field787;
									} else {
										var62 = var10.field765;
									}
									class101 var63 = null;
									int var64 = 0;
									if (var10.field804 != -1) {
										class62 var66 = class146.method1092(var10.field804);
										if (var66 != null) {
											class62 var67 = var66.method471(var10.field786);
											var63 = var67.method470(1);
											if (var63 == null) {
												class132.method1008(var10);
											} else {
												var63.method804();
												var64 = var63.field470 / 2;
											}
										}
									} else if (var10.field770 == 5) {
										if (var10.field849 == 0) {
											var63 = class61.field1360.method233(null, -1, null, -1);
										} else {
											var63 = class20.field373.method132();
										}
									} else if (var62 == -1) {
										var63 = var10.method306(null, class20.field373.field1631, -1, var61);
										if (var63 == null && field2914) {
											class132.method1008(var10);
										}
									} else {
										class149 var65 = class97.method760(var62);
										var63 = var10.method306(var65, class20.field373.field1631, var10.field762, var61);
										if (var63 == null && field2914) {
											class132.method1008(var10);
										}
									}
									class7.method43(var10.field810 / 2 + var12, var10.field773 / 2 + var14);
									int var68 = class7.field113[var10.field812] * var10.field808 >> 16;
									int var69 = var10.field808 * class7.field121[var10.field812] >> 16;
									if (var63 != null) {
										if (var10.field848) {
											var63.method804();
											if (var10.field853) {
												var63.method809(var10.field874, var10.field750, var10.field812, var10.field816, var64 + var68 + var10.field851, var10.field851 + var69, var10.field808);
											} else {
												var63.method813(var10.field874, var10.field750, var10.field812, var10.field816, var10.field851 + var64 + var68, var69 + var10.field851);
											}
										} else {
											var63.method813(var10.field874, 0, var10.field812, 0, var68, var69);
										}
									}
									class7.method32();
								} else {
									if (var10.field755 == 7) {
										class96 var70 = var10.method302();
										if (var70 == null) {
											if (field2914) {
												class132.method1008(var10);
											}
											continue;
										}
										int var71 = 0;
										for (int var72 = 0; var72 < var10.field773; var72++) {
											for (int var73 = 0; var73 < var10.field810; var73++) {
												if (var10.field834[var71] > 0) {
													class62 var74 = class146.method1092(var10.field834[var71] - 1);
													class32 var75;
													if (var74.field1409 != 1 && var10.field753[var71] == 1) {
														var75 = class52.method402(new class32[] { class38.field902, var74.field1429, class65.field1508 });
													} else {
														var75 = class52.method402(new class32[] { class38.field902, var74.field1429, class115.field2719, method978(var10.field753[var71]) });
													}
													int var76 = var12 + var73 * (var10.field818 + 115);
													int var77 = var72 * (var10.field784 + 12) + var14;
													if (var10.field841 == 0) {
														var70.method791(var75, var76, var77, var10.field776, var10.field856 ? 0 : -1);
													} else if (var10.field841 == 1) {
														var70.method793(var75, var76 + var10.field810 / 2, var77, var10.field776, var10.field856 ? 0 : -1);
													} else {
														var70.method777(var75, var10.field810 + var76 - 1, var77, var10.field776, var10.field856 ? 0 : -1);
													}
												}
												var71++;
											}
										}
									}
									if (var10.field755 == 8 && class71.field1665 == var10 && class38.field924 == class92.field2121) {
										int var78 = 0;
										class96 var79 = class121.field2876;
										class32 var80 = var10.field763;
										class32 var81 = class89.method674(var10, var80);
										int var82 = 0;
										while (var81.method240() > 0) {
											int var83 = var81.method267(class154.field3538);
											class32 var84;
											if (var83 == -1) {
												var84 = var81;
												var81 = class77.field1786;
											} else {
												var84 = var81.method241(0, var83);
												var81 = var81.method268(var83 + 4);
											}
											int var85 = var79.method770(var84);
											var82 += var79.field2292 + 1;
											if (var85 > var78) {
												var78 = var85;
											}
										}
										var78 += 6;
										var82 += 7;
										int var86 = var10.field810 + var12 - var78 - 5;
										if (var12 + 5 > var86) {
											var86 = var12 + 5;
										}
										if (arg0 < var86 + var78) {
											var86 = arg0 - var78;
										}
										int var87 = var14 + var10.field773 + 5;
										if (arg8 < var82 + var87) {
											var87 = arg8 - var82;
										}
										class141.method1053(var86, var87, var78, var82, 16777120);
										class141.method1058(var86, var87, var78, var82, 0);
										int var88 = var87 + var79.field2292 + 2;
										class32 var89 = var10.field763;
										class32 var90 = class89.method674(var10, var89);
										while (var90.method240() > 0) {
											int var91 = var90.method267(class154.field3538);
											class32 var92;
											if (var91 == -1) {
												var92 = var90;
												var90 = class77.field1786;
											} else {
												var92 = var90.method241(0, var91);
												var90 = var90.method268(var91 + 4);
											}
											var79.method791(var92, var86 + 3, var88, 0, -1);
											var88 += var79.field2292 + 1;
										}
									}
									if (var10.field755 == 9) {
										if (var10.field788 == 1) {
											class141.method1055(var12, var14, var12 + var10.field810, var14 - -var10.field773, var10.field776);
										} else {
											int var93 = var10.field773 >= 0 ? var10.field773 : -var10.field773;
											int var94 = var10.field810 >= 0 ? var10.field810 : -var10.field810;
											int var95 = var94;
											if (var93 > var94) {
												var95 = var93;
											}
											if (var95 != 0) {
												int var96 = (var10.field810 << 16) / var95;
												int var97 = (var10.field773 << 16) / var95;
												if (var97 > var96) {
													var97 = -var97;
												} else {
													var96 = -var96;
												}
												int var98 = var10.field788 * var97 >> 17;
												int var99 = var10.field788 * var97 + 1 >> 17;
												int var100 = var10.field788 * var96 + 1 >> 17;
												int var101 = var96 * var10.field788 >> 17;
												int var102 = var12 - var99;
												int var103 = var12 + var98;
												int var104 = var12 + var10.field810 - var99;
												int var105 = var98 + var12 + var10.field810;
												int var106 = var101 + var14;
												int var107 = var14 - var100;
												int var108 = var10.field773 + var14 - var100;
												int var109 = var10.field773 + var14 + var101;
												class7.method26(var103, var102, var104);
												class7.method38(var106, var107, var108, var103, var102, var104, var10.field776);
												class7.method26(var103, var104, var105);
												class7.method38(var106, var108, var109, var103, var104, var105, var10.field776);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(I)V")
	public static void method980() {
		if (class29.field525 != null) {
			class29.field525.method893();
		}
		if (class36.field744 != null) {
			class36.field744.method893();
		}
	}

	@ObfuscatedName("s.b(Z)V")
	public static void method981() {
		for (class98 var0 = (class98) class63.field1466.method1211(); var0 != null; var0 = (class98) class63.field1466.method1209()) {
			if (var0.field2250 != null) {
				var0.method767();
			}
		}
	}

	@ObfuscatedName("s.c(Z)V")
	public static void method982() {
		field2903 = null;
		field2900 = null;
		field2901 = null;
		field2906 = null;
		field2902 = null;
	}

	@ObfuscatedName("s.a(IIB)I")
	public static int method983(int arg0, int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		int var2 = (arg1 & 0x7F) * arg0 / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return var2 + (arg1 & 0xFF80);
	}

	@ObfuscatedName("s.a([Lec;I)[Lec;")
	public static class32[] method984(class32[] arg0) {
		class32[] var1 = new class32[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = class52.method402(new class32[] { class159.method1228(var2), class34.field717 });
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = class52.method402(new class32[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}
}
