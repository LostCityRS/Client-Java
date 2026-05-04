package deob;

@ObfuscatedName("hd")
public final class class81 extends class145 {

	@ObfuscatedName("hd.n")
	public final int field1454;

	@ObfuscatedName("hd.o")
	public static final int[] field1455 = new int[100];

	@ObfuscatedName("hd.p")
	public static long field1456;

	@ObfuscatedName("hd.q")
	public final int field1457;

	@ObfuscatedName("hd.r")
	public final int field1458;

	@ObfuscatedName("hd.s")
	public class109 field1459;

	@ObfuscatedName("hd.t")
	public int field1460 = -32768;

	@ObfuscatedName("hd.w")
	public int field1463;

	@ObfuscatedName("hd.A")
	public static int field1467 = 0;

	@ObfuscatedName("hd.B")
	public static final class88 field1468 = class208.method1423(105, "");

	@ObfuscatedName("hd.F")
	public final int field1472;

	@ObfuscatedName("hd.z")
	public final int field1466;

	@ObfuscatedName("hd.C")
	public final int field1469;

	@ObfuscatedName("hd.H")
	public int field1474;

	@ObfuscatedName("hd.a(Lea;I)Lsg;")
	public static class203 method538(class46 arg0) {
		return new class203(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method304(), arg0.method347());
	}

	@ObfuscatedName("hd.a(Lbj;IILud;)V")
	public static void method540(class22 arg0, int arg1, class222 arg2) {
		byte[] var3 = null;
		class248 var4 = class227.field4252;
		synchronized (class227.field4252) {
			for (class90 var5 = (class90) class227.field4252.method1610(); var5 != null; var5 = (class90) class227.field4252.method1619()) {
				if (var5.field1219 == (long) arg1 && arg2 == var5.field1713 && var5.field1701 == 0) {
					var3 = var5.field1705;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.method1497(arg1);
			arg0.method111(var6, arg1, arg2, true);
		} else {
			arg0.method111(var3, arg1, arg2, true);
		}
	}

	@ObfuscatedName("hd.a([BBI)I")
	public static int method541(byte[] arg0, int arg1) {
		return class231.method1542(0, arg0, arg1);
	}

	@ObfuscatedName("hd.a(Leg;Z)V")
	public static void method542(class52 arg0, boolean arg1) {
		class105.field1900.method1622(arg0);
		while (true) {
			class52 var2;
			int var3;
			int var4;
			int var5;
			int var6;
			class52[][] var7;
			class52 var65;
			do {
				class52 var64;
				do {
					class52 var63;
					do {
						class52 var62;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var2 = (class52) class105.field1900.method1613();
												if (var2 == null) {
													return;
												}
											} while (!var2.field965);
											var3 = var2.field961;
											var4 = var2.field945;
											var5 = var2.field966;
											var6 = var2.field960;
											var7 = class29.field489[var5];
											if (!var2.field944) {
												break;
											}
											if (arg1) {
												if (var5 > 0) {
													class52 var8 = class29.field489[var5 - 1][var3][var4];
													if (var8 != null && var8.field965) {
														continue;
													}
												}
												if (var3 <= class79.field1435 && var3 > class156.field3007) {
													class52 var9 = var7[var3 - 1][var4];
													if (var9 != null && var9.field965 && (var9.field944 || (var2.field954 & 0x1) == 0)) {
														continue;
													}
												}
												if (var3 >= class79.field1435 && var3 < class6.field84 - 1) {
													class52 var10 = var7[var3 + 1][var4];
													if (var10 != null && var10.field965 && (var10.field944 || (var2.field954 & 0x4) == 0)) {
														continue;
													}
												}
												if (var4 <= class88.field1636 && var4 > class102.field1849) {
													class52 var11 = var7[var3][var4 - 1];
													if (var11 != null && var11.field965 && (var11.field944 || (var2.field954 & 0x8) == 0)) {
														continue;
													}
												}
												if (var4 >= class88.field1636 && var4 < class230.field4314 - 1) {
													class52 var12 = var7[var3][var4 + 1];
													if (var12 != null && var12.field965 && (var12.field944 || (var2.field954 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var2.field944 = false;
											if (var2.field951 != null) {
												class52 var13 = var2.field951;
												if (var13.field947 == null) {
													if (var13.field964 != null) {
														if (class239.method1581(0, var3, var4)) {
															class156.method1060(var13.field964, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, true);
														} else {
															class156.method1060(var13.field964, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, false);
														}
													}
												} else if (class239.method1581(0, var3, var4)) {
													class55.method411(var13.field947, 0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, true);
												} else {
													class55.method411(var13.field947, 0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, false);
												}
												class157 var14 = var13.field959;
												if (var14 != null) {
													var14.field3021.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var14.field3029 - class74.field1353, var14.field3031 - class241.field4461, var14.field3023 - class216.field4048, var14.field3028);
												}
												for (int var15 = 0; var15 < var13.field962; var15++) {
													class108 var16 = var13.field963[var15];
													if (var16 != null) {
														var16.field1943.method87(var16.field1939, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var16.field1945 - class74.field1353, var16.field1938 - class241.field4461, var16.field1949 - class216.field4048, var16.field1948);
													}
												}
											}
											boolean var17 = false;
											if (var2.field947 == null) {
												if (var2.field964 != null) {
													if (class239.method1581(var6, var3, var4)) {
														class156.method1060(var2.field964, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, true);
													} else {
														var17 = true;
														class156.method1060(var2.field964, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, false);
													}
												}
											} else if (class239.method1581(var6, var3, var4)) {
												class55.method411(var2.field947, var6, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, true);
											} else {
												var17 = true;
												if (var2.field947.field1766 != 12345678 || class118.field2145 && var5 <= class133.field2484) {
													class55.method411(var2.field947, var6, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var3, var4, false);
												}
											}
											int var18 = 0;
											int var19 = 0;
											class157 var20 = var2.field959;
											class64 var21 = var2.field956;
											if (var20 != null || var21 != null) {
												if (class79.field1435 == var3) {
													var18++;
												} else if (class79.field1435 < var3) {
													var18 += 2;
												}
												if (class88.field1636 == var4) {
													var18 += 3;
												} else if (class88.field1636 > var4) {
													var18 += 6;
												}
												var19 = class110.field2005[var18];
												var2.field952 = class229.field4285[var18];
											}
											if (var20 != null) {
												if ((var20.field3027 & class97.field1789[var18]) == 0) {
													var2.field953 = 0;
												} else if (var20.field3027 == 16) {
													var2.field953 = 3;
													var2.field946 = class53.field1001[var18];
													var2.field955 = 3 - var2.field946;
												} else if (var20.field3027 == 32) {
													var2.field953 = 6;
													var2.field946 = class220.field4150[var18];
													var2.field955 = 6 - var2.field946;
												} else if (var20.field3027 == 64) {
													var2.field953 = 12;
													var2.field946 = class103.field1869[var18];
													var2.field955 = 12 - var2.field946;
												} else {
													var2.field953 = 9;
													var2.field946 = class48.field904[var18];
													var2.field955 = 9 - var2.field946;
												}
												if ((var20.field3027 & var19) != 0 && !class144.method945(var6, var3, var4, var20.field3027)) {
													var20.field3021.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var20.field3029 - class74.field1353, var20.field3031 - class241.field4461, var20.field3023 - class216.field4048, var20.field3028);
												}
												if ((var20.field3024 & var19) != 0 && !class144.method945(var6, var3, var4, var20.field3024)) {
													var20.field3032.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var20.field3029 - class74.field1353, var20.field3031 - class241.field4461, var20.field3023 - class216.field4048, var20.field3028);
												}
											}
											if (var21 != null && !class189.method1320(var6, var3, var4, var21.field1159.method88())) {
												if ((var21.field1164 & var19) != 0) {
													var21.field1159.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var21.field1157 + var21.field1169 - class74.field1353, var21.field1168 - class241.field4461, var21.field1161 + var21.field1167 - class216.field4048, var21.field1158);
												} else if (var21.field1164 == 256) {
													int var22 = var21.field1157 - class74.field1353;
													int var23 = var21.field1168 - class241.field4461;
													int var24 = var21.field1161 - class216.field4048;
													int var25 = var21.field1172;
													int var26;
													if (var25 == 1 || var25 == 2) {
														var26 = -var22;
													} else {
														var26 = var22;
													}
													int var27;
													if (var25 == 2 || var25 == 3) {
														var27 = -var24;
													} else {
														var27 = var24;
													}
													if (var27 < var26) {
														var21.field1159.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var22 + var21.field1169, var23, var24 + var21.field1167, var21.field1158);
													} else if (var21.field1160 != null) {
														var21.field1160.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var22, var23, var24, var21.field1158);
													}
												}
											}
											if (var17) {
												class166 var28 = var2.field949;
												if (var28 != null) {
													var28.field3194.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var28.field3197 - class74.field1353, var28.field3193 - class241.field4461, var28.field3190 - class216.field4048, var28.field3202);
												}
												class239 var29 = var2.field948;
												if (var29 != null && var29.field4435 == 0) {
													if (var29.field4446 != null) {
														var29.field4446.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var29.field4451 - class74.field1353, var29.field4444 - class241.field4461, var29.field4439 - class216.field4048, var29.field4440);
													}
													if (var29.field4448 != null) {
														var29.field4448.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var29.field4451 - class74.field1353, var29.field4444 - class241.field4461, var29.field4439 - class216.field4048, var29.field4440);
													}
													if (var29.field4443 != null) {
														var29.field4443.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var29.field4451 - class74.field1353, var29.field4444 - class241.field4461, var29.field4439 - class216.field4048, var29.field4440);
													}
												}
											}
											int var30 = var2.field954;
											if (var30 != 0) {
												if (var3 < class79.field1435 && (var30 & 0x4) != 0) {
													class52 var31 = var7[var3 + 1][var4];
													if (var31 != null && var31.field965) {
														class105.field1900.method1622(var31);
													}
												}
												if (var4 < class88.field1636 && (var30 & 0x2) != 0) {
													class52 var32 = var7[var3][var4 + 1];
													if (var32 != null && var32.field965) {
														class105.field1900.method1622(var32);
													}
												}
												if (var3 > class79.field1435 && (var30 & 0x1) != 0) {
													class52 var33 = var7[var3 - 1][var4];
													if (var33 != null && var33.field965) {
														class105.field1900.method1622(var33);
													}
												}
												if (var4 > class88.field1636 && (var30 & 0x8) != 0) {
													class52 var34 = var7[var3][var4 - 1];
													if (var34 != null && var34.field965) {
														class105.field1900.method1622(var34);
													}
												}
											}
											break;
										}
										if (var2.field953 != 0) {
											boolean var35 = true;
											for (int var36 = 0; var36 < var2.field962; var36++) {
												if (var2.field963[var36].field1934 != class143.field2627 && (var2.field957[var36] & var2.field953) == var2.field946) {
													var35 = false;
													break;
												}
											}
											if (var35) {
												class157 var37 = var2.field959;
												if (!class144.method945(var6, var3, var4, var37.field3027)) {
													var37.field3021.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var37.field3029 - class74.field1353, var37.field3031 - class241.field4461, var37.field3023 - class216.field4048, var37.field3028);
												}
												var2.field953 = 0;
											}
										}
										if (!var2.field958) {
											break;
										}
										try {
											int var38 = var2.field962;
											var2.field958 = false;
											int var39 = 0;
											label562: for (int var40 = 0; var40 < var38; var40++) {
												class108 var41 = var2.field963[var40];
												if (var41.field1934 != class143.field2627) {
													for (int var42 = var41.field1933; var42 <= var41.field1940; var42++) {
														for (int var43 = var41.field1936; var43 <= var41.field1935; var43++) {
															class52 var44 = var7[var42][var43];
															if (var44.field944) {
																var2.field958 = true;
																continue label562;
															}
															if (var44.field953 != 0) {
																int var45 = 0;
																if (var42 > var41.field1933) {
																	var45++;
																}
																if (var42 < var41.field1940) {
																	var45 += 4;
																}
																if (var43 > var41.field1936) {
																	var45 += 8;
																}
																if (var43 < var41.field1935) {
																	var45 += 2;
																}
																if ((var45 & var44.field953) == var2.field955) {
																	var2.field958 = true;
																	continue label562;
																}
															}
														}
													}
													class239.field4447[var39++] = var41;
													int var46 = class79.field1435 - var41.field1933;
													int var47 = var41.field1940 - class79.field1435;
													if (var47 > var46) {
														var46 = var47;
													}
													int var48 = class88.field1636 - var41.field1936;
													int var49 = var41.field1935 - class88.field1636;
													if (var49 > var48) {
														var41.field1950 = var46 + var49;
													} else {
														var41.field1950 = var46 + var48;
													}
												}
											}
											while (var39 > 0) {
												int var50 = -50;
												int var51 = -1;
												for (int var52 = 0; var52 < var39; var52++) {
													class108 var53 = class239.field4447[var52];
													if (var53.field1934 != class143.field2627) {
														if (var53.field1950 > var50) {
															var50 = var53.field1950;
															var51 = var52;
														} else if (var53.field1950 == var50) {
															int var54 = var53.field1945 - class74.field1353;
															int var55 = var53.field1949 - class216.field4048;
															int var56 = class239.field4447[var51].field1945 - class74.field1353;
															int var57 = class239.field4447[var51].field1949 - class216.field4048;
															if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
																var51 = var52;
															}
														}
													}
												}
												if (var51 == -1) {
													break;
												}
												class108 var58 = class239.field4447[var51];
												var58.field1934 = class143.field2627;
												if (!client.method224(var6, var58.field1933, var58.field1940, var58.field1936, var58.field1935, var58.field1943.method88())) {
													var58.field1943.method87(var58.field1939, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var58.field1945 - class74.field1353, var58.field1938 - class241.field4461, var58.field1949 - class216.field4048, var58.field1948);
												}
												for (int var59 = var58.field1933; var59 <= var58.field1940; var59++) {
													for (int var60 = var58.field1936; var60 <= var58.field1935; var60++) {
														class52 var61 = var7[var59][var60];
														if (var61.field953 != 0) {
															class105.field1900.method1622(var61);
														} else if ((var59 != var3 || var60 != var4) && var61.field965) {
															class105.field1900.method1622(var61);
														}
													}
												}
											}
											if (!var2.field958) {
												break;
											}
										} catch (Exception var80) {
											var2.field958 = false;
											break;
										}
									}
								} while (!var2.field965);
							} while (var2.field953 != 0);
							if (var3 > class79.field1435 || var3 <= class156.field3007) {
								break;
							}
							var62 = var7[var3 - 1][var4];
						} while (var62 != null && var62.field965);
						if (var3 < class79.field1435 || var3 >= class6.field84 - 1) {
							break;
						}
						var63 = var7[var3 + 1][var4];
					} while (var63 != null && var63.field965);
					if (var4 > class88.field1636 || var4 <= class102.field1849) {
						break;
					}
					var64 = var7[var3][var4 - 1];
				} while (var64 != null && var64.field965);
				if (var4 < class88.field1636 || var4 >= class230.field4314 - 1) {
					break;
				}
				var65 = var7[var3][var4 + 1];
			} while (var65 != null && var65.field965);
			var2.field965 = false;
			class176.field3545--;
			class239 var66 = var2.field948;
			if (var66 != null && var66.field4435 != 0) {
				if (var66.field4446 != null) {
					var66.field4446.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var66.field4451 - class74.field1353, var66.field4444 - class241.field4461 - var66.field4435, var66.field4439 - class216.field4048, var66.field4440);
				}
				if (var66.field4448 != null) {
					var66.field4448.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var66.field4451 - class74.field1353, var66.field4444 - class241.field4461 - var66.field4435, var66.field4439 - class216.field4048, var66.field4440);
				}
				if (var66.field4443 != null) {
					var66.field4443.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var66.field4451 - class74.field1353, var66.field4444 - class241.field4461 - var66.field4435, var66.field4439 - class216.field4048, var66.field4440);
				}
			}
			if (var2.field952 != 0) {
				class64 var67 = var2.field956;
				if (var67 != null && !class189.method1320(var6, var3, var4, var67.field1159.method88())) {
					if ((var67.field1164 & var2.field952) != 0) {
						var67.field1159.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var67.field1157 + var67.field1169 - class74.field1353, var67.field1168 - class241.field4461, var67.field1161 + var67.field1167 - class216.field4048, var67.field1158);
					} else if (var67.field1164 == 256) {
						int var68 = var67.field1157 - class74.field1353;
						int var69 = var67.field1168 - class241.field4461;
						int var70 = var67.field1161 - class216.field4048;
						int var71 = var67.field1172;
						int var72;
						if (var71 == 1 || var71 == 2) {
							var72 = -var68;
						} else {
							var72 = var68;
						}
						int var73;
						if (var71 == 2 || var71 == 3) {
							var73 = -var70;
						} else {
							var73 = var70;
						}
						if (var73 >= var72) {
							var67.field1159.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var68 + var67.field1169, var69, var70 + var67.field1167, var67.field1158);
						} else if (var67.field1160 != null) {
							var67.field1160.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var68, var69, var70, var67.field1158);
						}
					}
				}
				class157 var74 = var2.field959;
				if (var74 != null) {
					if ((var74.field3024 & var2.field952) != 0 && !class144.method945(var6, var3, var4, var74.field3024)) {
						var74.field3032.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var74.field3029 - class74.field1353, var74.field3031 - class241.field4461, var74.field3023 - class216.field4048, var74.field3028);
					}
					if ((var74.field3027 & var2.field952) != 0 && !class144.method945(var6, var3, var4, var74.field3027)) {
						var74.field3021.method87(0, class99.field1803, class201.field3838, class168.field3242, class159.field3066, var74.field3029 - class74.field1353, var74.field3031 - class241.field4461, var74.field3023 - class216.field4048, var74.field3028);
					}
				}
			}
			if (var5 < class11.field152 - 1) {
				class52 var75 = class29.field489[var5 + 1][var3][var4];
				if (var75 != null && var75.field965) {
					class105.field1900.method1622(var75);
				}
			}
			if (var3 < class79.field1435) {
				class52 var76 = var7[var3 + 1][var4];
				if (var76 != null && var76.field965) {
					class105.field1900.method1622(var76);
				}
			}
			if (var4 < class88.field1636) {
				class52 var77 = var7[var3][var4 + 1];
				if (var77 != null && var77.field965) {
					class105.field1900.method1622(var77);
				}
			}
			if (var3 > class79.field1435) {
				class52 var78 = var7[var3 - 1][var4];
				if (var78 != null && var78.field965) {
					class105.field1900.method1622(var78);
				}
			}
			if (var4 > class88.field1636) {
				class52 var79 = var7[var3][var4 - 1];
				if (var79 != null && var79.field965) {
					class105.field1900.method1622(var79);
				}
			}
		}
	}

	public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
		this.field1472 = arg0;
		this.field1458 = arg2;
		this.field1466 = arg3;
		this.field1454 = arg5;
		this.field1469 = arg1;
		this.field1457 = arg4;
		if (arg6 != -1) {
			this.field1459 = class15.method75(arg6);
			this.field1474 = 0;
			this.field1463 = class117.field2113 - 1;
			if (this.field1459.field1966 == 0 && arg8 != null && arg8 instanceof class81) {
				class81 var10 = (class81) arg8;
				if (this.field1459 == var10.field1459) {
					this.field1474 = var10.field1474;
					this.field1463 = var10.field1463;
					return;
				}
			}
			if (arg7 && this.field1459.field1972 != -1) {
				this.field1474 = (int) ((double) this.field1459.field1965.length * Math.random());
				this.field1463 -= (int) (Math.random() * (double) this.field1459.field1990[this.field1474]);
				return;
			}
		}
	}

	@ObfuscatedName("hd.b()I")
	@Override
	public int method88() {
		return this.field1460;
	}

	@ObfuscatedName("hd.b(I)Lnc;")
	public class145 method536() {
		boolean var1 = class145.field2721 != class62.field1137;
		class148 var2 = class190.method1321(this.field1472);
		if (var2.field2770 != null) {
			var2 = var2.method998();
		}
		if (var2 == null) {
			return null;
		}
		int var3;
		int var4;
		if (this.field1458 == 1 || this.field1458 == 3) {
			var4 = var2.field2774;
			var3 = var2.field2794;
		} else {
			var3 = var2.field2774;
			var4 = var2.field2794;
		}
		int var5 = (var3 + 1 >> 1) + this.field1457;
		int var6 = (var3 >> 1) + this.field1457;
		int var7 = this.field1454 + (var4 >> 1);
		int var8 = this.field1454 + (var4 + 1 >> 1);
		this.method537(var6 * 128, var7 * 128);
		int[][] var9 = class62.field1137[this.field1466];
		int var10 = var9[var5][var8] + var9[var6][var8] + var9[var6][var7] + var9[var5][var7] >> 2;
		int var11 = (this.field1457 << 7) + (var3 << 6);
		int[][] var12 = null;
		int var13 = (this.field1454 << 7) + (var4 << 6);
		if (var1) {
			var12 = class145.field2721[0];
		} else if (this.field1466 < 3) {
			var12 = class62.field1137[this.field1466 + 1];
		}
		class210 var14;
		if (this.field1459 == null) {
			var14 = var2.method997(this.field1469, var12, var9, var11, false, var13, this.field1458, var10);
		} else {
			var14 = var2.method1004(var10, var11, this.field1469, var13, this.field1474, this.field1459, var9, var12, this.field1458);
		}
		return var14 == null ? null : var14.field3984;
	}

	@ObfuscatedName("hd.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		class145 var11 = this.method536();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field1460 = var11.method88();
		}
	}

	@ObfuscatedName("hd.b(III)V")
	@Override
	public void method537(int arg0, int arg1) {
		if (this.field1459 == null) {
			return;
		}
		int var3 = class117.field2113 - this.field1463;
		if (var3 > 100 && this.field1459.field1972 > 0) {
			int var4 = this.field1459.field1965.length - this.field1459.field1972;
			while (this.field1474 < var4 && var3 > this.field1459.field1990[this.field1474]) {
				var3 -= this.field1459.field1990[this.field1474];
				this.field1474++;
			}
			if (var4 <= this.field1474) {
				int var5 = 0;
				for (int var6 = var4; var6 < this.field1459.field1965.length; var6++) {
					var5 += this.field1459.field1990[var6];
				}
				var3 %= var5;
			}
		}
		label56: {
			do {
				do {
					if (var3 <= this.field1459.field1990[this.field1474]) {
						break label56;
					}
					class60.method433(false, arg1, this.field1474, arg0, this.field1459);
					var3 -= this.field1459.field1990[this.field1474];
					this.field1474++;
				} while (this.field1459.field1965.length > this.field1474);
				this.field1474 -= this.field1459.field1972;
			} while (this.field1474 >= 0 && this.field1459.field1965.length > this.field1474);
			this.field1459 = null;
		}
		this.field1463 = class117.field2113 - var3;
	}
}
