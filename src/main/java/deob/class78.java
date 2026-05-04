package deob;

@ObfuscatedName("ha")
public final class class78 extends class67 {

	@ObfuscatedName("ha.t")
	public static final class46 field1408 = new class46(8);

	@ObfuscatedName("ha.u")
	public final int[] field1409;

	@ObfuscatedName("ha.v")
	public final boolean[] field1410;

	@ObfuscatedName("ha.w")
	public static final class88 field1411 = class208.method1423(105, "");

	@ObfuscatedName("ha.z")
	public static class88 field1414 = null;

	@ObfuscatedName("ha.F")
	public static final int[] field1420 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

	@ObfuscatedName("ha.G")
	public static final class88 field1421 = class208.method1423(105, "::gc");

	@ObfuscatedName("ha.x")
	public final int field1412;

	@ObfuscatedName("ha.H")
	public final int field1422;

	@ObfuscatedName("ha.I")
	public final int[][] field1423;

	@ObfuscatedName("ha.C")
	public static class144 field1417;

	@ObfuscatedName("ha.D")
	public static class174[][] field1418;

	@ObfuscatedName("ha.B")
	public static class52[][][] field1416;

	@ObfuscatedName("ha.a(III)Lfh;")
	public static class64 method522(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		return var3 == null ? null : var3.field956;
	}

	@ObfuscatedName("ha.a(ZZ[Lia;)V")
	public static void method523(class89[] arg0) {
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < 104; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					if ((class116.field2098[var1][var2][var3] & 0x1) == 1) {
						int var4 = var1;
						if ((class116.field2098[1][var2][var3] & 0x2) == 2) {
							var4 = var1 - 1;
						}
						if (var4 >= 0) {
							arg0[var4].method652(var3, var2);
						}
					}
				}
			}
		}
		class70.field1270 += (int) (Math.random() * 5.0D) - 2;
		class218.field4086 += (int) (Math.random() * 5.0D) - 2;
		if (class218.field4086 < -8) {
			class218.field4086 = -8;
		}
		if (class218.field4086 > 8) {
			class218.field4086 = 8;
		}
		if (class70.field1270 < -16) {
			class70.field1270 = -16;
		}
		if (class70.field1270 > 16) {
			class70.field1270 = 16;
		}
		int var5 = class70.field1270 >> 1;
		int var6 = class218.field4086 >> 2 << 10;
		int[][] var7 = new int[104][104];
		int[][] var8 = new int[104][104];
		for (int var9 = 0; var9 < 4; var9++) {
			byte[][] var10 = class111.field2020[var9];
			int var11 = (int) Math.sqrt(5100.0D);
			int var12 = var11 * 768 >> 8;
			for (int var13 = 1; var13 < 103; var13++) {
				for (int var14 = 1; var14 < 103; var14++) {
					int var15 = class62.field1137[var9][var14 + 1][var13] - class62.field1137[var9][var14 - 1][var13];
					int var16 = class62.field1137[var9][var14][var13 + 1] - class62.field1137[var9][var14][var13 - 1];
					int var17 = (int) Math.sqrt((double) (var15 * var15 + var16 * var16 + 65536));
					int var18 = (var15 << 8) / var17;
					int var19 = -65536 / var17;
					int var20 = (var16 << 8) / var17;
					int var21 = (var18 * -50 + var19 * -10 + var20 * -50) / var12 + 74;
					int var22 = (var10[var14][var13] >> 1) + (var10[var14][var13 + 1] >> 3) + (var10[var14][var13 + -1] >> 2) + (var10[var14 + 1][var13] >> 3) + (var10[var14 + -1][var13] >> 2);
					var8[var14][var13] = var21 - var22;
				}
			}
			for (int var23 = 0; var23 < 104; var23++) {
				class85.field1541[var23] = 0;
				class221.field4173[var23] = 0;
				class156.field3012[var23] = 0;
				class221.field4174[var23] = 0;
				class151.field2940[var23] = 0;
			}
			for (int var24 = -5; var24 < 104; var24++) {
				for (int var25 = 0; var25 < 104; var25++) {
					int var26 = var24 + 5;
					int var10002;
					if (var26 < 104) {
						int var27 = class164.field3142[var9][var26][var25] & 0xFF;
						if (var27 > 0) {
							class237 var28 = class29.method179(var27 - 1);
							class85.field1541[var25] += var28.field4420;
							class221.field4173[var25] += var28.field4410;
							class156.field3012[var25] += var28.field4413;
							class221.field4174[var25] += var28.field4407;
							var10002 = class151.field2940[var25]++;
						}
					}
					int var29 = var24 - 5;
					if (var29 >= 0) {
						int var30 = class164.field3142[var9][var29][var25] & 0xFF;
						if (var30 > 0) {
							class237 var31 = class29.method179(var30 - 1);
							class85.field1541[var25] -= var31.field4420;
							class221.field4173[var25] -= var31.field4410;
							class156.field3012[var25] -= var31.field4413;
							class221.field4174[var25] -= var31.field4407;
							var10002 = class151.field2940[var25]--;
						}
					}
				}
				if (var24 >= 0) {
					int var32 = 0;
					int var33 = 0;
					int var34 = 0;
					int var35 = 0;
					int var36 = 0;
					for (int var37 = -5; var37 < 104; var37++) {
						int var38 = var37 + 5;
						int var39 = var37 - 5;
						if (var38 < 104) {
							var36 += class151.field2940[var38];
							var33 += class221.field4173[var38];
							var35 += class156.field3012[var38];
							var34 += class221.field4174[var38];
							var32 += class85.field1541[var38];
						}
						if (var39 >= 0) {
							var34 -= class221.field4174[var39];
							var33 -= class221.field4173[var39];
							var36 -= class151.field2940[var39];
							var32 -= class85.field1541[var39];
							var35 -= class156.field3012[var39];
						}
						if (var37 >= 0 && var36 > 0) {
							var7[var24][var37] = class158.method1066(var32 * 256 / var34, var35 / var36, var33 / var36);
						}
					}
				}
			}
			for (int var40 = 1; var40 < 103; var40++) {
				for (int var41 = 1; var41 < 103; var41++) {
					if (!class245.field4497 || (class116.field2098[0][var40][var41] & 0x2) != 0 || (class116.field2098[var9][var40][var41] & 0x10) == 0 && class234.method1555(var41, var40, var9) == class157.field3026) {
						if (var9 < class28.field468) {
							class28.field468 = var9;
						}
						int var42 = class164.field3142[var9][var40][var41] & 0xFF;
						int var43 = class109.field1962[var9][var40][var41] & 0xFF;
						if (var42 > 0 || var43 > 0) {
							int var44 = class62.field1137[var9][var40 + 1][var41];
							int var45 = class62.field1137[var9][var40][var41];
							int var46 = class62.field1137[var9][var40 + 1][var41 + 1];
							int var47 = class62.field1137[var9][var40][var41 + 1];
							if (var9 > 0) {
								boolean var48 = true;
								if (var42 == 0 && class8.field115[var9][var40][var41] != 0) {
									var48 = false;
								}
								if (var43 > 0 && !class101.method704(var43 - 1).field113) {
									var48 = false;
								}
								if (var48 && var44 == var45 && var46 == var45 && var47 == var45) {
									class135.field2511[var9][var40][var41] |= 0x924;
								}
							}
							int var49;
							int var52;
							if (var42 > 0) {
								var49 = var7[var40][var41];
								int var50 = var5 + (var49 & 0x7F);
								if (var50 < 0) {
									var50 = 0;
								} else if (var50 > 127) {
									var50 = 127;
								}
								int var51 = var50 + (var49 + var6 & 0xFC00) + (var49 & 0x380);
								var52 = class173.field3349[class13.method67(96, var51)];
							} else {
								var49 = -1;
								var52 = 0;
							}
							int var53 = var8[var40][var41];
							int var54 = var8[var40 + 1][var41];
							int var55 = var8[var40][var41 + 1];
							int var56 = var8[var40 + 1][var41 + 1];
							if (var43 == 0) {
								class12.method58(var9, var40, var41, 0, 0, -1, var45, var44, var46, var47, class13.method67(var53, var49), class13.method67(var54, var49), class13.method67(var56, var49), class13.method67(var55, var49), 0, 0, 0, 0, var52, 0);
							} else {
								int var57 = class8.field115[var9][var40][var41] + 1;
								byte var58 = class234.field4377[var9][var40][var41];
								class7 var59 = class101.method704(var43 - 1);
								if (class245.field4496 != null && var9 == 0) {
									class245.field4496[var40][var41] = var59.field103 + (var59.field112 << 24);
								}
								int var60 = var59.field98;
								if (var60 >= 0 && !class173.field3356.method436(var60)) {
									var60 = -1;
								}
								int var61;
								int var62;
								if (var60 >= 0) {
									var61 = -1;
									var62 = class173.field3349[class31.method202(96, class173.field3356.method438(var60))];
								} else if (var59.field111 == -1) {
									var62 = 0;
									var61 = -2;
								} else {
									var61 = var59.field111;
									int var63 = (var61 & 0x7F) + var5;
									if (var63 < 0) {
										var63 = 0;
									} else if (var63 > 127) {
										var63 = 127;
									}
									int var64 = var63 + (var61 + var6 & 0xFC00) + (var61 & 0x380);
									var62 = class173.field3349[class31.method202(96, var64)];
								}
								if (var59.field104 >= 0) {
									int var65 = var59.field104;
									int var66 = (var65 & 0x7F) + var5;
									if (var66 < 0) {
										var66 = 0;
									} else if (var66 > 127) {
										var66 = 127;
									}
									int var67 = var66 + (var6 + var65 & 0xFC00) + (var65 & 0x380);
									var62 = class173.field3349[class31.method202(96, var67)];
								}
								class12.method58(var9, var40, var41, var57, var58, var60, var45, var44, var46, var47, class13.method67(var53, var49), class13.method67(var54, var49), class13.method67(var56, var49), class13.method67(var55, var49), class31.method202(var53, var61), class31.method202(var54, var61), class31.method202(var56, var61), class31.method202(var55, var61), var52, var62);
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					class237.method1570(var9, var69, var68, class234.method1555(var68, var69, var9));
				}
			}
			class164.field3142[var9] = null;
			class109.field1962[var9] = null;
			class8.field115[var9] = null;
			class234.field4377[var9] = null;
			class111.field2020[var9] = null;
		}
		class171.method1215();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((class116.field2098[1][var70][var71] & 0x2) == 2) {
					class157.method1063(var70, var71);
				}
			}
		}
		int var72 = 2;
		int var73 = 1;
		int var74 = 4;
		for (int var75 = 0; var75 < 4; var75++) {
			if (var75 > 0) {
				var72 <<= 0x3;
				var74 <<= 0x3;
				var73 <<= 0x3;
			}
			for (int var76 = 0; var76 <= var75; var76++) {
				for (int var77 = 0; var77 <= 104; var77++) {
					for (int var78 = 0; var78 <= 104; var78++) {
						if ((var73 & class135.field2511[var76][var78][var77]) != 0) {
							int var79 = var77;
							int var80 = var76;
							int var81 = var76;
							int var82 = var77;
							while (var79 > 0 && (class135.field2511[var76][var78][var79 - 1] & var73) != 0) {
								var79--;
							}
							while (var82 < 104 && (class135.field2511[var76][var78][var82 + 1] & var73) != 0) {
								var82++;
							}
							label356: while (var80 > 0) {
								for (int var83 = var79; var83 <= var82; var83++) {
									if ((class135.field2511[var80 - 1][var78][var83] & var73) == 0) {
										break label356;
									}
								}
								var80--;
							}
							label345: while (var81 < var75) {
								for (int var84 = var79; var84 <= var82; var84++) {
									if ((class135.field2511[var81 + 1][var78][var84] & var73) == 0) {
										break label345;
									}
								}
								var81++;
							}
							int var85 = (var82 + 1 - var79) * (var81 + 1 - var80);
							if (var85 >= 8) {
								int var86 = class62.field1137[var80][var78][var79];
								int var87 = class62.field1137[var81][var78][var79] - 240;
								class151.method1036(var75, 1, var78 * 128, var78 * 128, var79 * 128, var82 * 128 + 128, var87, var86);
								for (int var88 = var80; var88 <= var81; var88++) {
									for (int var89 = var79; var89 <= var82; var89++) {
										class135.field2511[var88][var78][var89] &= ~var73;
									}
								}
							}
						}
						if ((var72 & class135.field2511[var76][var78][var77]) != 0) {
							int var90 = var78;
							int var91;
							for (var91 = var78; var91 > 0 && (var72 & class135.field2511[var76][var91 - 1][var77]) != 0; var91--) {
							}
							int var92 = var76;
							while (var90 < 104 && (var72 & class135.field2511[var76][var90 + 1][var77]) != 0) {
								var90++;
							}
							label410: while (var92 > 0) {
								for (int var93 = var91; var93 <= var90; var93++) {
									if ((class135.field2511[var92 - 1][var93][var77] & var72) == 0) {
										break label410;
									}
								}
								var92--;
							}
							int var94;
							label398: for (var94 = var76; var94 < var75; var94++) {
								for (int var95 = var91; var95 <= var90; var95++) {
									if ((var72 & class135.field2511[var94 + 1][var95][var77]) == 0) {
										break label398;
									}
								}
							}
							int var96 = (var90 + 1 - var91) * (var94 + 1 - var92);
							if (var96 >= 8) {
								int var97 = class62.field1137[var92][var91][var77];
								int var98 = class62.field1137[var94][var91][var77] - 240;
								class151.method1036(var75, 2, var91 * 128, var90 * 128 + 128, var77 * 128, var77 * 128, var98, var97);
								for (int var99 = var92; var99 <= var94; var99++) {
									for (int var100 = var91; var100 <= var90; var100++) {
										class135.field2511[var99][var100][var77] &= ~var72;
									}
								}
							}
						}
						if ((var74 & class135.field2511[var76][var78][var77]) != 0) {
							int var101 = var78;
							int var102 = var78;
							int var103;
							for (var103 = var77; var103 > 0 && (var74 & class135.field2511[var76][var78][var103 - 1]) != 0; var103--) {
							}
							int var104;
							for (var104 = var77; var104 < 104 && (var74 & class135.field2511[var76][var78][var104 + 1]) != 0; var104++) {
							}
							label464: while (var102 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((class135.field2511[var76][var102 - 1][var105] & var74) == 0) {
										break label464;
									}
								}
								var102--;
							}
							label453: while (var101 < 104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((var74 & class135.field2511[var76][var101 + 1][var106]) == 0) {
										break label453;
									}
								}
								var101++;
							}
							if ((var101 + 1 - var102) * (-var103 + 1 + var104) >= 4) {
								int var107 = class62.field1137[var76][var102][var103];
								class151.method1036(var75, 4, var102 * 128, var101 * 128 + 128, var103 * 128, var104 * 128 + 128, var107, var107);
								for (int var108 = var102; var108 <= var101; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										class135.field2511[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ha.a(ZLea;I)Li;")
	public static class88 method524(class46 arg0) {
		try {
			class88 var1 = new class88();
			var1.field1660 = arg0.method350();
			if (var1.field1660 > 32767) {
				var1.field1660 = 32767;
			}
			var1.field1643 = new byte[var1.field1660];
			arg0.field831 += class112.field2033.method1457(0, var1.field1643, arg0.field842, var1.field1660, arg0.field831);
			return var1;
		} catch (Exception var2) {
			return class150.field2918;
		}
	}

	@ObfuscatedName("ha.a(IZ)Li;")
	public static class88 method525(int arg0) {
		return class201.field3836[arg0].method604() <= 0 ? class66.field1191[arg0] : class166.method1140(new class88[] { class66.field1191[arg0], class236.field4398, class201.field3836[arg0] });
	}

	public class78(int arg0, byte[] arg1) {
		this.field1412 = arg0;
		class46 var3 = new class46(arg1);
		this.field1422 = var3.method347();
		this.field1410 = new boolean[this.field1422];
		this.field1409 = new int[this.field1422];
		this.field1423 = new int[this.field1422][];
		for (int var4 = 0; var4 < this.field1422; var4++) {
			this.field1409[var4] = var3.method347();
		}
		for (int var5 = 0; var5 < this.field1422; var5++) {
			this.field1410[var5] = var3.method347() == 1;
		}
		for (int var6 = 0; var6 < this.field1422; var6++) {
			this.field1423[var6] = new int[var3.method347()];
		}
		for (int var7 = 0; var7 < this.field1422; var7++) {
			for (int var8 = 0; var8 < this.field1423[var7].length; var8++) {
				this.field1423[var7][var8] = var3.method347();
			}
		}
	}
}
