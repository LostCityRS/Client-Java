package deob;

import java.util.Date;

@ObfuscatedName("pb")
public final class class165 {

	@ObfuscatedName("pb.a")
	public static int field3145 = 20;

	@ObfuscatedName("pb.c")
	public final int[][] field3147 = new int[6][258];

	@ObfuscatedName("pb.e")
	public final boolean[] field3149 = new boolean[16];

	@ObfuscatedName("pb.f")
	public final int[] field3150 = new int[6];

	@ObfuscatedName("pb.g")
	public int field3151 = 0;

	@ObfuscatedName("pb.h")
	public final byte[] field3152 = new byte[18002];

	@ObfuscatedName("pb.i")
	public final byte[][] field3153 = new byte[6][258];

	@ObfuscatedName("pb.j")
	public final byte[] field3154 = new byte[18002];

	@ObfuscatedName("pb.k")
	public int field3155;

	@ObfuscatedName("pb.m")
	public final int[] field3157 = new int[257];

	@ObfuscatedName("pb.n")
	public final byte[] field3158 = new byte[256];

	@ObfuscatedName("pb.p")
	public final int[] field3160 = new int[256];

	@ObfuscatedName("pb.q")
	public int field3161;

	@ObfuscatedName("pb.r")
	public int field3162;

	@ObfuscatedName("pb.t")
	public int field3164;

	@ObfuscatedName("pb.v")
	public int field3166;

	@ObfuscatedName("pb.w")
	public int field3167;

	@ObfuscatedName("pb.F")
	public static final int[] field3176 = new int[500];

	@ObfuscatedName("pb.x")
	public final byte[] field3168 = new byte[4096];

	@ObfuscatedName("pb.E")
	public int field3175 = 0;

	@ObfuscatedName("pb.C")
	public final int[][] field3173 = new int[6][258];

	@ObfuscatedName("pb.A")
	public final boolean[] field3171 = new boolean[256];

	@ObfuscatedName("pb.D")
	public final int[][] field3174 = new int[6][258];

	@ObfuscatedName("pb.J")
	public final int[] field3180 = new int[16];

	@ObfuscatedName("pb.L")
	public byte field3182;

	@ObfuscatedName("pb.z")
	public int field3170;

	@ObfuscatedName("pb.B")
	public int field3172;

	@ObfuscatedName("pb.G")
	public int field3177;

	@ObfuscatedName("pb.H")
	public int field3178;

	@ObfuscatedName("pb.K")
	public int field3181;

	@ObfuscatedName("pb.O")
	public int field3184;

	@ObfuscatedName("pb.P")
	public int field3185;

	@ObfuscatedName("pb.y")
	public byte[] field3169;

	@ObfuscatedName("pb.N")
	public byte[] field3183;

	@ObfuscatedName("pb.a([Lq;IIZIIIIII)V")
	public static void method1131(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class72.method480(arg1, arg2, arg8, arg4);
		class173.method1235();
		for (int var9 = 0; var9 < arg0.length; var9++) {
			class174 var10 = arg0[var9];
			if (var10 != null && (arg7 == var10.field3504 || arg7 == -1412584499 && var10 == class179.field3568)) {
				int var11;
				if (arg3 == -1) {
					class81.field1455[class206.field3923] = arg5 + var10.field3366;
					class132.field2471[class206.field3923] = var10.field3441 + arg6;
					class133.field2485[class206.field3923] = var10.field3380;
					class80.field1447[class206.field3923] = var10.field3422;
					var11 = class206.field3923++;
				} else {
					var11 = arg3;
				}
				var10.field3371 = class117.field2113;
				var10.field3382 = var11;
				if (!var10.field3410 || !class71.method475(var10)) {
					if (var10.field3439 > 0) {
						class16.method78(var10);
					}
					int var12 = var10.field3366 + arg5;
					int var13 = var10.field3441 + arg6;
					int var14 = var10.field3480;
					if (class116.field2103 && (class80.method530(var10) != 0 || var10.field3390 == 0) && var14 > 127) {
						var14 = 127;
					}
					if (var10 == class179.field3568) {
						if (arg7 != -1412584499 && !var10.field3427) {
							class6.field77 = arg6;
							class179.field3564 = arg0;
							class94.field1756 = arg5;
							continue;
						}
						if (!var10.field3427) {
							var14 = 128;
						}
						if (class203.field3867 && class29.field487) {
							int var15 = class28.field471;
							int var16 = var15 - class148.field2791;
							if (class127.field2371 > var16) {
								var16 = class127.field2371;
							}
							if (class49.field923.field3380 + class127.field2371 < var10.field3380 + var16) {
								var16 = class127.field2371 + class49.field923.field3380 - var10.field3380;
							}
							var12 = var16;
							int var17 = class239.field4449;
							int var18 = var17 - class207.field3941;
							if (class28.field466 > var18) {
								var18 = class28.field466;
							}
							if (var18 + var10.field3422 > class28.field466 - -class49.field923.field3422) {
								var18 = class49.field923.field3422 + class28.field466 - var10.field3422;
							}
							var13 = var18;
						}
					}
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.field3390 == 2) {
						var19 = arg2;
						var20 = arg8;
						var21 = arg4;
						var22 = arg1;
					} else {
						var19 = var13 <= arg2 ? arg2 : var13;
						var22 = arg1 >= var12 ? arg1 : var12;
						int var23 = var10.field3380 + var12;
						int var24 = var13 + var10.field3422;
						if (var10.field3390 == 9) {
							var24++;
							var23++;
						}
						var21 = var24 >= arg4 ? arg4 : var24;
						var20 = arg8 <= var23 ? arg8 : var23;
					}
					if (!var10.field3410 || var22 < var20 && var19 < var21) {
						if (var10.field3439 != 0) {
							if (var10.field3439 == 1337) {
								class58.field1101 = var12;
								class133.field2487 = var13;
								class37.method248(var10.field3380, var12, var10.field3422, var13);
								class72.method480(arg1, arg2, arg8, arg4);
								continue;
							}
							if (var10.field3439 == 1338) {
								if (var10.method1246()) {
									class121.method824(var10, var11, var12, var13);
									class72.method480(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (var10.field3439 == 1339) {
								if (var10.method1246()) {
									class109.method743(var11, var12, var13, var10);
									class72.method480(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (var10.field3439 == 1400) {
								class104.method719(var10.field3380, var10.field3422, var12, var13);
								class225.field4228[var11] = true;
								class211.field4005[var11] = true;
								class72.method480(arg1, arg2, arg8, arg4);
								continue;
							}
							if (var10.field3439 == 1401) {
								class241.method1590(var13, var12, var10.field3380, var10.field3422);
								class225.field4228[var11] = true;
								class211.field4005[var11] = true;
								class72.method480(arg1, arg2, arg8, arg4);
								continue;
							}
						}
						int var25 = class28.field471;
						if (var10.field3390 == 0 && var10.field3470 && var22 <= class28.field471 && class239.field4449 >= var19 && var20 > class28.field471 && class239.field4449 < var21 && !class108.field1958 && !class116.field2103) {
							class203.field3862 = 1;
							class66.field1191[0] = class6.field76;
							class201.field3836[0] = class174.field3453;
							class53.field994[0] = 1007;
						}
						int var26 = class239.field4449;
						if (!class108.field1958 && var25 >= var22 && var26 >= var19 && var25 < var20 && var21 > var26) {
							class12.method65(var26 - var13, -var12 + var25, var10);
						}
						if (var10.field3390 == 0) {
							if (!var10.field3410 && class71.method475(var10) && var10 != class65.field1177) {
								continue;
							}
							if (!var10.field3410) {
								if (var10.field3415 > var10.field3375 - var10.field3422) {
									var10.field3415 = var10.field3375 - var10.field3422;
								}
								if (var10.field3415 < 0) {
									var10.field3415 = 0;
								}
							}
							method1131(arg0, var22, var19, var11, var21, var12 - var10.field3393, -var10.field3415 + var13, var10.field3423, var20);
							if (var10.field3465 != null) {
								method1131(var10.field3465, var22, var19, var11, var21, var12 - var10.field3393, -var10.field3415 + var13, var10.field3423, var20);
							}
							class168 var27 = (class168) class128.field2395.method1049((long) var10.field3423);
							if (var27 != null) {
								if (var27.field3233 == 0 && var22 <= class28.field471 && var19 <= class239.field4449 && class28.field471 < var20 && class239.field4449 < var21 && !class108.field1958 && !class116.field2103) {
									class53.field994[0] = 1007;
									class203.field3862 = 1;
									class66.field1191[0] = class6.field76;
									class201.field3836[0] = class174.field3453;
								}
								class53.method393(var21, var27.field3229, var19, var11, var13, var22, var12, var20);
							}
							class72.method480(arg1, arg2, arg8, arg4);
							class173.method1235();
						}
						if (class113.field2043[var11] || class134.field2503 > 1) {
							if (var10.field3390 == 0 && !var10.field3410 && var10.field3422 < var10.field3375) {
								class241.method1592(var10.field3415, var10.field3422, var13, var10.field3375, var12 + var10.field3380);
							}
							if (var10.field3390 != 1) {
								if (var10.field3390 == 2) {
									int var28 = 0;
									for (int var29 = 0; var29 < var10.field3418; var29++) {
										for (int var30 = 0; var30 < var10.field3501; var30++) {
											int var31 = var13 + (var10.field3508 + 32) * var29;
											int var32 = var12 + var30 * (var10.field3466 + 32);
											if (var28 < 20) {
												var32 += var10.field3472[var28];
												var31 += var10.field3397[var28];
											}
											if (var10.field3388[var28] > 0) {
												int var34 = var10.field3388[var28] - 1;
												if (var32 + 32 > arg1 && var32 < arg8 && arg2 < var31 + 32 && var31 < arg4 || class135.field2514 == var10 && var28 == class18.field305) {
													class188 var35;
													if (class28.field475 == 1 && var28 == class58.field1105 && var10.field3423 == class209.field3965) {
														var35 = class22.method117(2, var34, var10.field3474[var28], var10.field3464, 0);
													} else {
														var35 = class22.method117(1, var34, var10.field3474[var28], var10.field3464, 3153952);
													}
													if (class173.field3364) {
														class225.field4228[var11] = true;
													}
													if (var35 == null) {
														class200.method1371(var10);
													} else if (var10 == class135.field2514 && class18.field305 == var28) {
														int var36 = class28.field471 - class219.field4146;
														int var37 = class239.field4449 - class48.field894;
														if (var36 < 5 && var36 > -5) {
															var36 = 0;
														}
														if (var37 < 5 && var37 > -5) {
															var37 = 0;
														}
														if (class248.field4535 < 5) {
															var36 = 0;
															var37 = 0;
														}
														var35.method1164(var36 + var32, var37 + var31, 128);
														if (arg7 != -1) {
															class174 var38 = arg0[arg7 & 0xFFFF];
															int var39 = class72.field1335;
															int var40 = class72.field1334;
															if (var31 + var37 < var40 && var38.field3415 > 0) {
																int var41 = class17.field261 * (var40 - var37 - var31) / 3;
																if (class17.field261 * 10 < var41) {
																	var41 = class17.field261 * 10;
																}
																if (var38.field3415 < var41) {
																	var41 = var38.field3415;
																}
																var38.field3415 -= var41;
																class48.field894 += var41;
																class200.method1371(var38);
															}
															if (var37 + var31 + 32 > var39 && var38.field3375 - var38.field3422 > var38.field3415) {
																int var42 = class17.field261 * (var31 + var37 + 32 - var39) / 3;
																if (class17.field261 * 10 < var42) {
																	var42 = class17.field261 * 10;
																}
																if (var38.field3375 - var38.field3415 - var38.field3422 < var42) {
																	var42 = var38.field3375 - var38.field3415 - var38.field3422;
																}
																var38.field3415 += var42;
																class48.field894 -= var42;
																class200.method1371(var38);
															}
														}
													} else if (class57.field1091 == var10 && var28 == class93.field1742) {
														var35.method1164(var32, var31, 128);
													} else {
														var35.method1155(var32, var31);
													}
												}
											} else if (var10.field3389 != null && var28 < 20) {
												class188 var33 = var10.method1248(var28);
												if (var33 != null) {
													var33.method1155(var32, var31);
												} else if (class248.field4549) {
													class200.method1371(var10);
												}
											}
											var28++;
										}
									}
								} else if (var10.field3390 == 3) {
									int var43;
									if (class80.method533(var10)) {
										var43 = var10.field3513;
										if (var10 == class65.field1177 && var10.field3374 != 0) {
											var43 = var10.field3374;
										}
									} else {
										var43 = var10.field3414;
										if (class65.field1177 == var10 && var10.field3431 != 0) {
											var43 = var10.field3431;
										}
									}
									if (var14 == 0) {
										if (var10.field3496) {
											class72.method478(var12, var13, var10.field3380, var10.field3422, var43);
										} else {
											class72.method476(var12, var13, var10.field3380, var10.field3422, var43);
										}
									} else if (var10.field3496) {
										class72.method497(var12, var13, var10.field3380, var10.field3422, var43, 256 - (var14 & 0xFF));
									} else {
										class72.method484(var12, var13, var10.field3380, var10.field3422, var43, 256 - (var14 & 0xFF));
									}
								} else if (var10.field3390 == 4) {
									class26 var44 = var10.method1252(class34.field587);
									if (var44 != null) {
										class88 var45 = var10.field3383;
										int var46;
										if (class80.method533(var10)) {
											var46 = var10.field3513;
											if (class65.field1177 == var10 && var10.field3374 != 0) {
												var46 = var10.field3374;
											}
											if (var10.field3446.method604() > 0) {
												var45 = var10.field3446;
											}
										} else {
											var46 = var10.field3414;
											if (class65.field1177 == var10 && var10.field3431 != 0) {
												var46 = var10.field3431;
											}
										}
										if (var10.field3410 && var10.field3399 != -1) {
											class149 var47 = class71.method472(var10.field3399);
											var45 = var47.field2892;
											if (var45 == null) {
												var45 = class180.field3572;
											}
											if ((var47.field2852 == 1 || var10.field3482 != 1) && var10.field3482 != -1) {
												var45 = class166.method1140(new class88[] { class136.field2529, var45, class32.field523, class144.method958(var10.field3482) });
											}
										}
										if (class53.field967 == var10) {
											var45 = class143.field2650;
											var46 = var10.field3414;
										}
										if (!var10.field3410) {
											var45 = class161.method1084(var45, var10);
										}
										var44.method153(var45, var12, var13, var10.field3380, var10.field3422, var46, var10.field3435 ? 0 : -1, var10.field3479, var10.field3469, var10.field3396);
									} else if (class248.field4549) {
										class200.method1371(var10);
									}
								} else if (var10.field3390 == 5) {
									if (var10.field3410) {
										class188 var48;
										if (var10.field3399 == -1) {
											var48 = var10.method1249(false);
										} else {
											var48 = class22.method117(var10.field3429, var10.field3399, var10.field3482, var10.field3464, var10.field3425);
										}
										if (var48 != null) {
											int var49 = var48.field3649;
											int var50 = var48.field3645;
											if (var10.field3420) {
												int var52 = (var49 + var10.field3380 - 1) / var49;
												int var53 = (var10.field3422 + var50 - 1) / var50;
												class72.method493(var12, var13, var10.field3380 + var12, var10.field3422 + var13);
												for (int var54 = 0; var54 < var52; var54++) {
													for (int var55 = 0; var55 < var53; var55++) {
														if (var10.field3437 != 0) {
															var48.method1309(var50 / 2 + var55 * var50 + var13, var12 + var49 * var54 - -(var49 / 2), 4096, var10.field3437);
														} else if (var14 == 0) {
															var48.method1155(var12 + var54 * var49, var13 + var55 * var50);
														} else {
															var48.method1164(var54 * var49 + var12, var55 * var50 + var13, 256 - (var14 & 0xFF));
														}
													}
												}
												class72.method480(arg1, arg2, arg8, arg4);
											} else {
												int var51 = var10.field3380 * 4096 / var49;
												if (var10.field3437 != 0) {
													var48.method1309(var13 + var10.field3422 / 2, var12 - -(var10.field3380 / 2), var51, var10.field3437);
												} else if (var14 != 0) {
													var48.method1174(var12, var13, var10.field3380, var10.field3422, 256 - (var14 & 0xFF));
												} else if (var10.field3380 == var49 && var10.field3422 == var50) {
													var48.method1155(var12, var13);
												} else {
													var48.method1162(var12, var13, var10.field3380, var10.field3422);
												}
											}
										} else if (class248.field4549) {
											class200.method1371(var10);
										}
									} else {
										class188 var56 = var10.method1249(class80.method533(var10));
										if (var56 != null) {
											var56.method1155(var12, var13);
										} else if (class248.field4549) {
											class200.method1371(var10);
										}
									}
								} else if (var10.field3390 == 6) {
									boolean var57 = class80.method533(var10);
									int var58 = 0;
									class30 var59 = null;
									int var60;
									if (var57) {
										var60 = var10.field3386;
									} else {
										var60 = var10.field3404;
									}
									if (var10.field3399 != -1) {
										class149 var65 = class71.method472(var10.field3399);
										if (var65 != null) {
											class149 var66 = var65.method1021(var10.field3482);
											var59 = var66.method1025(1, 0, null);
											if (var59 == null) {
												class200.method1371(var10);
											} else {
												var58 = -var59.method88() / 2;
											}
										}
									} else if (var10.field3430 == 5) {
										if (var10.field3409 == -1) {
											var59 = class130.field2441.method1430(null, -1, -1, null);
										} else {
											int var62 = var10.field3409 & 0x7FF;
											if (class220.field4164 == var62) {
												var62 = 2047;
											}
											class44 var63 = class244.field4491[var62];
											class109 var64 = var60 == -1 ? null : class15.method75(var60);
											if (var63 != null && (int) var63.field766.method630() << 11 == (var10.field3409 & 0xFFFFF800)) {
												var59 = var63.field768.method1430(null, var10.field3379, 0, var64);
											}
										}
									} else if (var60 == -1) {
										var59 = var10.method1245(null, class240.field4456.field768, -1, var57);
										if (var59 == null && class248.field4549) {
											class200.method1371(var10);
										}
									} else {
										class109 var61 = class15.method75(var60);
										var59 = var10.method1245(var61, class240.field4456.field768, var10.field3379, var57);
										if (var59 == null && class248.field4549) {
											class200.method1371(var10);
										}
									}
									if (var59 != null) {
										int var67;
										if (var10.field3417 <= 0) {
											var67 = 256;
										} else {
											var67 = (var10.field3422 << 8) / var10.field3417;
										}
										int var68;
										if (var10.field3468 <= 0) {
											var68 = 256;
										} else {
											var68 = (var10.field3380 << 8) / var10.field3468;
										}
										int var69 = var10.field3380 / 2 + var12 + (var68 * var10.field3432 >> 8);
										int var70 = (var67 * var10.field3405 >> 8) + var10.field3422 / 2 + var13;
										class173.method1228(var69, var70);
										int var71 = var10.field3485 * class173.field3354[var10.field3455] >> 16;
										int var72 = class173.field3359[var10.field3455] * var10.field3485 >> 16;
										if (!var10.field3410) {
											var59.method193(var10.field3509, 0, var10.field3455, 0, var72, var71);
										} else if (var10.field3403) {
											((class125) var59).method849(var10.field3509, var10.field3517, var10.field3455, var10.field3365, var58 + var72 + var10.field3498, var71 + var10.field3498, var10.field3485);
										} else {
											var59.method193(var10.field3509, var10.field3517, var10.field3455, var10.field3365, var10.field3498 + var72 + var58, var10.field3498 + var71);
										}
										class173.method1239();
									}
								} else {
									if (var10.field3390 == 7) {
										class26 var73 = var10.method1252(class34.field587);
										if (var73 == null) {
											if (class248.field4549) {
												class200.method1371(var10);
											}
											continue;
										}
										int var74 = 0;
										for (int var75 = 0; var75 < var10.field3418; var75++) {
											for (int var76 = 0; var76 < var10.field3501; var76++) {
												if (var10.field3388[var74] > 0) {
													class149 var77 = class71.method472(var10.field3388[var74] - 1);
													class88 var78;
													if (var77.field2852 != 1 && var10.field3474[var74] == 1) {
														var78 = class166.method1140(new class88[] { class136.field2529, var77.field2892, class120.field2199 });
													} else {
														var78 = class166.method1140(new class88[] { class136.field2529, var77.field2892, class32.field523, class144.method958(var10.field3474[var74]) });
													}
													int var79 = (var10.field3466 + 115) * var76 + var12;
													int var80 = var13 + var75 * (var10.field3508 + 12);
													if (var10.field3479 == 0) {
														var73.method154(var78, var79, var80, var10.field3414, var10.field3435 ? 0 : -1);
													} else if (var10.field3479 == 1) {
														var73.method141(var78, var79 + 57, var80, var10.field3414, var10.field3435 ? 0 : -1);
													} else {
														var73.method150(var78, var79 + 115 - 1, var80, var10.field3414, var10.field3435 ? 0 : -1);
													}
												}
												var74++;
											}
										}
									}
									if (var10.field3390 == 8 && class36.field635 == var10 && class138.field2563 == class46.field859) {
										int var81 = 0;
										class88 var82 = var10.field3383;
										class26 var83 = class3.field30;
										class88 var84 = class161.method1084(var82, var10);
										int var85 = 0;
										while (var84.method604() > 0) {
											int var86 = var84.method617(class142.field2618);
											class88 var87;
											if (var86 == -1) {
												var87 = var84;
												var84 = class174.field3453;
											} else {
												var87 = var84.method623(0, var86);
												var84 = var84.method635(var86 + 4);
											}
											int var88 = var83.method158(var87);
											if (var88 > var81) {
												var81 = var88;
											}
											var85 += var83.field416 + 1;
										}
										var81 += 6;
										var85 += 7;
										int var89 = var10.field3380 + var12 - var81 - 5;
										if (var89 < var12 + 5) {
											var89 = var12 + 5;
										}
										if (var89 + var81 > arg8) {
											var89 = arg8 - var81;
										}
										int var90 = var10.field3422 + var13 + 5;
										if (arg4 < var90 + var85) {
											var90 = arg4 - var85;
										}
										class72.method478(var89, var90, var81, var85, 16777120);
										class72.method476(var89, var90, var81, var85, 0);
										int var91 = var83.field416 + var90 + 2;
										class88 var92 = var10.field3383;
										class88 var93 = class161.method1084(var92, var10);
										while (var93.method604() > 0) {
											int var94 = var93.method617(class142.field2618);
											class88 var95;
											if (var94 == -1) {
												var95 = var93;
												var93 = class174.field3453;
											} else {
												var95 = var93.method623(0, var94);
												var93 = var93.method635(var94 + 4);
											}
											var83.method154(var95, var89 + 3, var91, 0, -1);
											var91 += var83.field416 + 1;
										}
									}
									if (var10.field3390 == 9) {
										int var96;
										int var97;
										int var98;
										if (var10.field3492) {
											var96 = var10.field3422 + var13;
											var97 = var13;
											var98 = var12 + var10.field3380;
										} else {
											var97 = var13 + var10.field3422;
											var98 = var10.field3380 + var12;
											var96 = var13;
										}
										if (var10.field3497 == 1) {
											class72.method477(var12, var96, var98, var97, var10.field3414);
										} else {
											class72.method485(var12, var96, var98, var97, var10.field3414, var10.field3497);
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

	@ObfuscatedName("pb.a(ILi;)V")
	public static void method1132(class88 arg0) {
		if (class126.field2324.field3597 == null) {
			return;
		}
		try {
			class88 var1 = class227.field4265.method608(class126.field2324.field3597);
			class88 var2 = class247.field4516.method608(class126.field2324.field3597);
			class88 var3 = class166.method1140(new class88[] { var1, class36.field651, arg0, class54.field1005, var2 });
			class88 var4;
			if (arg0.method604() == 0) {
				var4 = class166.method1140(new class88[] { var3, class49.field920 });
			} else {
				var4 = class166.method1140(new class88[] { var3, class109.field1982, method1139(class206.method1418() + 94608000000L), class95.field1767, class234.method1556(94608000L) });
			}
			class166.method1140(new class88[] { class168.field3237, var4, class34.field591 }).method636(class126.field2324.field3597);
		} catch (Throwable var5) {
		}
	}

	@ObfuscatedName("pb.a(I[Li;II)Li;")
	public static class88 method1133(int arg0, class88[] arg1, int arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			if (arg1[var4 + arg2] == null) {
				arg1[arg2 + var4] = class15.field233;
			}
			var3 += arg1[var4 + arg2].field1660;
		}
		int var5 = 0;
		byte[] var6 = new byte[var3];
		for (int var7 = 0; var7 < arg0; var7++) {
			class88 var8 = arg1[var7 + arg2];
			class124.method836(var8.field1643, 0, var6, var5, var8.field1660);
			var5 += var8.field1660;
		}
		class88 var9 = new class88();
		var9.field1643 = var6;
		var9.field1660 = var3;
		return var9;
	}

	@ObfuscatedName("pb.a(BLnb;Lpg;Lnb;Lnb;)Z")
	public static boolean method1134(class144 arg0, class170 arg1, class144 arg2, class144 arg3) {
		class31.field503 = arg1;
		class86.field1553 = arg0;
		class153.field2955 = arg2;
		class12.field177 = arg3;
		return true;
	}

	@ObfuscatedName("pb.a(IB)Li;")
	public static class88 method1135(int arg0) {
		class88 var1 = new class88();
		var1.field1660 = 0;
		var1.field1643 = new byte[arg0];
		return var1;
	}

	@ObfuscatedName("pb.a(IIIII)V")
	public static void method1137(int arg0, int arg1, int arg2, int arg3) {
		class126.field2330 = class109.field1988 * arg2 / arg0;
		class157.field3033 = class44.field760 * arg1 / arg3;
		class34.field594 = -1;
		class189.field3659 = -1;
		class245.method1604();
	}

	@ObfuscatedName("pb.b(ILi;)V")
	public static void method1138(class88 arg0) {
		try {
			class55.field1032.getAppletContext().showDocument(arg0.method632(class55.field1032.getCodeBase()), "_blank");
		} catch (Exception var1) {
		}
	}

	@ObfuscatedName("pb.a(JI)Li;")
	public static class88 method1139(long arg0) {
		class248.field4545.setTime(new Date(arg0));
		int var2 = class248.field4545.get(7);
		int var3 = class248.field4545.get(5);
		int var4 = class248.field4545.get(2);
		int var5 = class248.field4545.get(1);
		int var6 = class248.field4545.get(11);
		int var7 = class248.field4545.get(12);
		int var8 = class248.field4545.get(13);
		return class166.method1140(new class88[] { class89.field1673[var2 - 1], class196.field3772, class170.method1212(var3 / 10), class170.method1212(var3 % 10), class164.field3135, class36.field658[var4], class164.field3135, class170.method1212(var5), class227.field4262, class170.method1212(var6 / 10), class170.method1212(var6 % 10), class109.field1959, class170.method1212(var7 / 10), class170.method1212(var7 % 10), class109.field1959, class170.method1212(var8 / 10), class170.method1212(var8 % 10), class6.field82 });
	}
}
