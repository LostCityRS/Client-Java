package deob;

public class ClientBuild {
	@ObfuscatedName("kg.ab")
	public static final byte[][][] field2098 = new byte[4][104][104];
	@ObfuscatedName("gd.p")
	public static int field1270 = (int) (Math.random() * 33.0D) - 16;
	@ObfuscatedName("u.C")
	public static int field4086 = (int) (Math.random() * 17.0D) - 8;
	@ObfuscatedName("kb.n")
	public static byte[][][] field2020;
	@ObfuscatedName("ff.R")
	public static int[][][] field1137;
	@ObfuscatedName("hh.bb")
	public static int[] field1541;
	@ObfuscatedName("uc.g")
	public static int[] field4173;
	@ObfuscatedName("od.C")
	public static int[] field3012;
	@ObfuscatedName("nj.s")
	public static int[] field2940;
	@ObfuscatedName("uc.h")
	public static int[] field4174;
	@ObfuscatedName("pa.h")
	public static byte[][][] field3142;
	@ObfuscatedName("ce.W")
	public static int field468 = 99;
	@ObfuscatedName("k.G")
	public static byte[][][] field1962;
	@ObfuscatedName("md.X")
	public static int[][][] field2511;
	@ObfuscatedName("ag.a")
	public static byte[][][] field115;
	@ObfuscatedName("ve.T")
	public static byte[][][] field4377;
	@ObfuscatedName("wf.a")
	public static int[][] field4496;

	@ObfuscatedName("ch.a(III)I")
	public static int method202(int arg0, int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			int var2 = (arg1 & 0x7F) * arg0 >> 7;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return (arg1 & 0xFF80) + var2;
		}
	}

	@ObfuscatedName("rc.a([BIII)Z")
	public static boolean method1311(byte[] arg0, int arg1, int arg2) {
		Packet var3 = new Packet(arg0);
		boolean var4 = true;
		int var5 = -1;
		label68: while (true) {
			int var6 = var3.method332();
			if (var6 == 0) {
				return var4;
			}
			int var7 = 0;
			var5 += var6;
			boolean var8 = false;
			while (true) {
				int var12;
				LocType var15;
				do {
					int var13;
					int var14;
					do {
						do {
							do {
								do {
									while (var8) {
										int var16 = var3.method350();
										if (var16 == 0) {
											continue label68;
										}
										var3.g1();
									}
									int var9 = var3.method350();
									if (var9 == 0) {
										continue label68;
									}
									var7 += var9 - 1;
									int var10 = var7 >> 6 & 0x3F;
									int var11 = var7 & 0x3F;
									var12 = var3.g1() >> 2;
									var13 = arg2 + var10;
									var14 = var11 + arg1;
								} while (var13 <= 0);
							} while (var14 <= 0);
						} while (var13 >= 103);
					} while (var14 >= 103);
					var15 = LocType.method1321(var5);
				} while (var12 == 22 && client.lowMem && var15.field2833 == 0 && var15.field2819 != 1 && !var15.field2826);
				var8 = true;
				if (!var15.method990()) {
					var4 = false;
					client.field2045++;
				}
			}
		}
	}

	@ObfuscatedName("ha.a(ZZ[Lia;)V")
	public static void method523(CollisionMap[] arg0) {
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < 104; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					if ((field2098[var1][var2][var3] & 0x1) == 1) {
						int var4 = var1;
						if ((field2098[1][var2][var3] & 0x2) == 2) {
							var4 = var1 - 1;
						}
						if (var4 >= 0) {
							arg0[var4].method652(var3, var2);
						}
					}
				}
			}
		}
		field1270 += (int) (Math.random() * 5.0D) - 2;
		field4086 += (int) (Math.random() * 5.0D) - 2;
		if (field4086 < -8) {
			field4086 = -8;
		}
		if (field4086 > 8) {
			field4086 = 8;
		}
		if (field1270 < -16) {
			field1270 = -16;
		}
		if (field1270 > 16) {
			field1270 = 16;
		}
		int var5 = field1270 >> 1;
		int var6 = field4086 >> 2 << 10;
		int[][] var7 = new int[104][104];
		int[][] var8 = new int[104][104];
		for (int var9 = 0; var9 < 4; var9++) {
			byte[][] var10 = field2020[var9];
			int var11 = (int) Math.sqrt(5100.0D);
			int var12 = var11 * 768 >> 8;
			for (int var13 = 1; var13 < 103; var13++) {
				for (int var14 = 1; var14 < 103; var14++) {
					int var15 = field1137[var9][var14 + 1][var13] - field1137[var9][var14 - 1][var13];
					int var16 = field1137[var9][var14][var13 + 1] - field1137[var9][var14][var13 - 1];
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
				field1541[var23] = 0;
				field4173[var23] = 0;
				field3012[var23] = 0;
				field4174[var23] = 0;
				field2940[var23] = 0;
			}
			for (int var24 = -5; var24 < 104; var24++) {
				for (int var25 = 0; var25 < 104; var25++) {
					int var26 = var24 + 5;
					int var10002;
					if (var26 < 104) {
						int var27 = field3142[var9][var26][var25] & 0xFF;
						if (var27 > 0) {
							FluType var28 = FluType.method179(var27 - 1);
							field1541[var25] += var28.field4420;
							field4173[var25] += var28.field4410;
							field3012[var25] += var28.field4413;
							field4174[var25] += var28.field4407;
							var10002 = field2940[var25]++;
						}
					}
					int var29 = var24 - 5;
					if (var29 >= 0) {
						int var30 = field3142[var9][var29][var25] & 0xFF;
						if (var30 > 0) {
							FluType var31 = FluType.method179(var30 - 1);
							field1541[var25] -= var31.field4420;
							field4173[var25] -= var31.field4410;
							field3012[var25] -= var31.field4413;
							field4174[var25] -= var31.field4407;
							var10002 = field2940[var25]--;
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
							var36 += field2940[var38];
							var33 += field4173[var38];
							var35 += field3012[var38];
							var34 += field4174[var38];
							var32 += field1541[var38];
						}
						if (var39 >= 0) {
							var34 -= field4174[var39];
							var33 -= field4173[var39];
							var36 -= field2940[var39];
							var32 -= field1541[var39];
							var35 -= field3012[var39];
						}
						if (var37 >= 0 && var36 > 0) {
							var7[var24][var37] = Statics.method1066(var32 * 256 / var34, var35 / var36, var33 / var36);
						}
					}
				}
			}
			for (int var40 = 1; var40 < 103; var40++) {
				for (int var41 = 1; var41 < 103; var41++) {
					if (!client.lowMem || (field2098[0][var40][var41] & 0x2) != 0 || (field2098[var9][var40][var41] & 0x10) == 0 && method1555(var41, var40, var9) == client.field3026) {
						if (var9 < field468) {
							field468 = var9;
						}
						int var42 = field3142[var9][var40][var41] & 0xFF;
						int var43 = field1962[var9][var40][var41] & 0xFF;
						if (var42 > 0 || var43 > 0) {
							int var44 = field1137[var9][var40 + 1][var41];
							int var45 = field1137[var9][var40][var41];
							int var46 = field1137[var9][var40 + 1][var41 + 1];
							int var47 = field1137[var9][var40][var41 + 1];
							if (var9 > 0) {
								boolean var48 = true;
								if (var42 == 0 && field115[var9][var40][var41] != 0) {
									var48 = false;
								}
								if (var43 > 0 && !FloType.method704(var43 - 1).field113) {
									var48 = false;
								}
								if (var48 && var44 == var45 && var46 == var45 && var47 == var45) {
									field2511[var9][var40][var41] |= 0x924;
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
								var52 = Pix3D.field3349[Statics.method67(96, var51)];
							} else {
								var49 = -1;
								var52 = 0;
							}
							int var53 = var8[var40][var41];
							int var54 = var8[var40 + 1][var41];
							int var55 = var8[var40][var41 + 1];
							int var56 = var8[var40 + 1][var41 + 1];
							if (var43 == 0) {
								World.method58(var9, var40, var41, 0, 0, -1, var45, var44, var46, var47, Statics.method67(var53, var49), Statics.method67(var54, var49), Statics.method67(var56, var49), Statics.method67(var55, var49), 0, 0, 0, 0, var52, 0);
							} else {
								int var57 = field115[var9][var40][var41] + 1;
								byte var58 = field4377[var9][var40][var41];
								FloType var59 = FloType.method704(var43 - 1);
								if (field4496 != null && var9 == 0) {
									field4496[var40][var41] = var59.field103 + (var59.field112 << 24);
								}
								int var60 = var59.field98;
								if (var60 >= 0 && !Pix3D.field3356.method436(var60)) {
									var60 = -1;
								}
								int var61;
								int var62;
								if (var60 >= 0) {
									var61 = -1;
									var62 = Pix3D.field3349[method202(96, Pix3D.field3356.method438(var60))];
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
									var62 = Pix3D.field3349[method202(96, var64)];
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
									var62 = Pix3D.field3349[method202(96, var67)];
								}
								World.method58(var9, var40, var41, var57, var58, var60, var45, var44, var46, var47, Statics.method67(var53, var49), Statics.method67(var54, var49), Statics.method67(var56, var49), Statics.method67(var55, var49), method202(var53, var61), method202(var54, var61), method202(var56, var61), method202(var55, var61), var52, var62);
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					World.method1570(var9, var69, var68, method1555(var68, var69, var9));
				}
			}
			field3142[var9] = null;
			field1962[var9] = null;
			field115[var9] = null;
			field4377[var9] = null;
			field2020[var9] = null;
		}
		World.method1215();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((field2098[1][var70][var71] & 0x2) == 2) {
					World.method1063(var70, var71);
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
						if ((var73 & field2511[var76][var78][var77]) != 0) {
							int var79 = var77;
							int var80 = var76;
							int var81 = var76;
							int var82 = var77;
							while (var79 > 0 && (field2511[var76][var78][var79 - 1] & var73) != 0) {
								var79--;
							}
							while (var82 < 104 && (field2511[var76][var78][var82 + 1] & var73) != 0) {
								var82++;
							}
							label356: while (var80 > 0) {
								for (int var83 = var79; var83 <= var82; var83++) {
									if ((field2511[var80 - 1][var78][var83] & var73) == 0) {
										break label356;
									}
								}
								var80--;
							}
							label345: while (var81 < var75) {
								for (int var84 = var79; var84 <= var82; var84++) {
									if ((field2511[var81 + 1][var78][var84] & var73) == 0) {
										break label345;
									}
								}
								var81++;
							}
							int var85 = (var82 + 1 - var79) * (var81 + 1 - var80);
							if (var85 >= 8) {
								int var86 = field1137[var80][var78][var79];
								int var87 = field1137[var81][var78][var79] - 240;
								World.method1036(var75, 1, var78 * 128, var78 * 128, var79 * 128, var82 * 128 + 128, var87, var86);
								for (int var88 = var80; var88 <= var81; var88++) {
									for (int var89 = var79; var89 <= var82; var89++) {
										field2511[var88][var78][var89] &= ~var73;
									}
								}
							}
						}
						if ((var72 & field2511[var76][var78][var77]) != 0) {
							int var90 = var78;
							int var91;
							for (var91 = var78; var91 > 0 && (var72 & field2511[var76][var91 - 1][var77]) != 0; var91--) {
							}
							int var92 = var76;
							while (var90 < 104 && (var72 & field2511[var76][var90 + 1][var77]) != 0) {
								var90++;
							}
							label410: while (var92 > 0) {
								for (int var93 = var91; var93 <= var90; var93++) {
									if ((field2511[var92 - 1][var93][var77] & var72) == 0) {
										break label410;
									}
								}
								var92--;
							}
							int var94;
							label398: for (var94 = var76; var94 < var75; var94++) {
								for (int var95 = var91; var95 <= var90; var95++) {
									if ((var72 & field2511[var94 + 1][var95][var77]) == 0) {
										break label398;
									}
								}
							}
							int var96 = (var90 + 1 - var91) * (var94 + 1 - var92);
							if (var96 >= 8) {
								int var97 = field1137[var92][var91][var77];
								int var98 = field1137[var94][var91][var77] - 240;
								World.method1036(var75, 2, var91 * 128, var90 * 128 + 128, var77 * 128, var77 * 128, var98, var97);
								for (int var99 = var92; var99 <= var94; var99++) {
									for (int var100 = var91; var100 <= var90; var100++) {
										field2511[var99][var100][var77] &= ~var72;
									}
								}
							}
						}
						if ((var74 & field2511[var76][var78][var77]) != 0) {
							int var101 = var78;
							int var102 = var78;
							int var103;
							for (var103 = var77; var103 > 0 && (var74 & field2511[var76][var78][var103 - 1]) != 0; var103--) {
							}
							int var104;
							for (var104 = var77; var104 < 104 && (var74 & field2511[var76][var78][var104 + 1]) != 0; var104++) {
							}
							label464: while (var102 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field2511[var76][var102 - 1][var105] & var74) == 0) {
										break label464;
									}
								}
								var102--;
							}
							label453: while (var101 < 104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((var74 & field2511[var76][var101 + 1][var106]) == 0) {
										break label453;
									}
								}
								var101++;
							}
							if ((var101 + 1 - var102) * (-var103 + 1 + var104) >= 4) {
								int var107 = field1137[var76][var102][var103];
								World.method1036(var75, 4, var102 * 128, var101 * 128 + 128, var103 * 128, var104 * 128 + 128, var107, var107);
								for (int var108 = var102; var108 <= var101; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field2511[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag.a(III)Z")
	public static boolean method43(int arg0, int arg1) {
		LocType var2 = LocType.method1321(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return var2.method991(arg0);
	}

	@ObfuscatedName("ve.a(IIII)I")
	public static int method1555(int arg0, int arg1, int arg2) {
		if ((field2098[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (field2098[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("be.a(IIZIII)V")
	public static void method83(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg4; var6 <= arg4 + arg2; var6++) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					field2020[arg0][var6][var5] = 127;
				}
			}
		}
		for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
			for (int var8 = arg4; var8 < arg2 + arg4; var8++) {
				if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
					field1137[arg0][var8][var7] = arg0 <= 0 ? 0 : field1137[arg0 - 1][var8][var7];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (int var9 = arg3 + 1; var9 < arg1 + arg3; var9++) {
				if (var9 >= 0 && var9 < 104) {
					field1137[arg0][arg4][var9] = field1137[arg0][arg4 - 1][var9];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (int var10 = arg4 + 1; var10 < arg2 + arg4; var10++) {
				if (var10 >= 0 && var10 < 104) {
					field1137[arg0][var10][arg3] = field1137[arg0][var10][arg3 - 1];
				}
			}
		}
		if (arg4 >= 0 && arg3 >= 0 && arg4 < 104 && arg3 < 104) {
			if (arg0 == 0) {
				if (arg4 > 0 && field1137[arg0][arg4 - 1][arg3] != 0) {
					field1137[arg0][arg4][arg3] = field1137[arg0][arg4 - 1][arg3];
				} else if (arg3 > 0 && field1137[arg0][arg4][arg3 - 1] != 0) {
					field1137[arg0][arg4][arg3] = field1137[arg0][arg4][arg3 - 1];
				} else if (arg4 > 0 && arg3 > 0 && field1137[arg0][arg4 - 1][arg3 - 1] != 0) {
					field1137[arg0][arg4][arg3] = field1137[arg0][arg4 - 1][arg3 - 1];
				}
			} else {
				if (arg4 > 0 && field1137[arg0 - 1][arg4 - 1][arg3] != field1137[arg0][arg4 - 1][arg3]) {
					field1137[arg0][arg4][arg3] = field1137[arg0][arg4 - 1][arg3];
				} else if (arg3 > 0 && field1137[arg0][arg4][arg3 - 1] != field1137[arg0 - 1][arg4][arg3 - 1]) {
					field1137[arg0][arg4][arg3] = field1137[arg0][arg4][arg3 - 1];
				} else if (arg4 > 0 && arg3 > 0 && field1137[arg0 - 1][arg4 - 1][arg3 - 1] != field1137[arg0][arg4 - 1][arg3 - 1]) {
					field1137[arg0][arg4][arg3] = field1137[arg0][arg4 - 1][arg3 - 1];
				}
			}
		}
	}

	@ObfuscatedName("ta.a(IZ)V")
	public static void method1425() {
		field2940 = new int[104];
		field468 = 99;
		field1541 = new int[104];
		field4173 = new int[104];
		field3012 = new int[104];
		field4174 = new int[104];
		field2020 = new byte[4][105][105];
		field1962 = new byte[4][104][104];
		field3142 = new byte[4][104][104];
		field4377 = new byte[4][104][104];
		field2511 = new int[4][105][105];
		field115 = new byte[4][104][104];
	}

	@ObfuscatedName("bf.a([Lia;[BIIZI)V")
	public static void method85(CollisionMap[] arg0, byte[] arg1, int arg2, int arg3) {
		Packet var4 = new Packet(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method332();
			if (var6 == 0) {
				return;
			}
			var5 += var6;
			int var7 = 0;
			while (true) {
				int var8 = var4.method350();
				if (var8 == 0) {
					break;
				}
				var7 += var8 - 1;
				int var9 = var7 & 0x3F;
				int var10 = var7 >> 6 & 0x3F;
				int var11 = var4.g1();
				int var12 = var7 >> 12;
				int var13 = arg3 + var9;
				int var14 = var11 & 0x3;
				int var15 = var10 + arg2;
				int var16 = var11 >> 2;
				if (var15 > 0 && var13 > 0 && var15 < 103 && var13 < 103) {
					CollisionMap var17 = null;
					int var18 = var12;
					if ((field2098[1][var15][var13] & 0x2) == 2) {
						var18 = var12 - 1;
					}
					if (var18 >= 0) {
						var17 = arg0[var18];
					}
					method1503(true, var12, var14, var16, client.lowMem, var5, var12, var17, var13, var15);
				}
			}
		}
	}

	@ObfuscatedName("af.d(I)V")
	public static void method39() {
		field3012 = null;
		field4174 = null;
		field4377 = null;
		field4173 = null;
		field2511 = null;
		field2940 = null;
		field2020 = null;
		field115 = null;
		field3142 = null;
		field1962 = null;
		field1541 = null;
	}

	@ObfuscatedName("ke.a(IIIIZIII)V")
	public static void method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
			return;
		}
		if (client.lowMem && (field2098[0][arg6][arg2] & 0x2) == 0) {
			int var7 = arg0;
			if ((field2098[arg0][arg6][arg2] & 0x8) != 0) {
				var7 = 0;
			}
			if (client.field3026 != var7) {
				return;
			}
		}
		int var8 = arg0;
		if (arg0 < 3 && (field2098[1][arg6][arg2] & 0x2) == 2) {
			var8 = arg0 + 1;
		}
		Statics.method989(client.collision[arg0], arg6, var8, arg1, arg0, arg2);
		if (arg4 >= 0) {
			method1503(false, arg0, arg5, arg3, false, arg4, var8, client.collision[arg0], arg2, arg6);
			return;
		}
	}

	@ObfuscatedName("wc.b(II)V")
	public static void method1595(int arg0) {
		SoftwarePix32 var1;
		if (Statics.field2010 == null) {
			var1 = new SoftwarePix32(512, 512);
		} else {
			var1 = (SoftwarePix32) Statics.field2010;
		}
		int[] var2 = var1.field3247;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 1;
		}
		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 2048 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field2098[arg0][var7][var5] & 0x18) == 0) {
					Statics.method815(var2, var6, arg0, var7, var5);
				}
				if (arg0 < 3 && (field2098[arg0 + 1][var7][var5] & 0x8) != 0) {
					Statics.method815(var2, var6, arg0 + 1, var7, var5);
				}
				var6 += 4;
			}
		}
		var1.method1167();
		int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
		int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) + 228 << 8) - (-((int) (Math.random() * 20.0D)) - 238)) - 10;
		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field2098[arg0][var11][var10] & 0x18) == 0) {
					Statics.method871(var10, var8, arg0, var9, var11);
				}
				if (arg0 < 3 && (field2098[arg0 + 1][var11][var10] & 0x8) != 0) {
					Statics.method871(var10, var8, arg0 + 1, var9, var11);
				}
			}
		}
		Statics.field930 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				long var14 = Statics.method501(client.field2907, var12, var13);
				if (var14 != 0L) {
					LocType var16 = LocType.method1321(Integer.MAX_VALUE & (int) (var14 >>> 32));
					int var17 = var16.field2817;
					if (var17 >= 0) {
						int var18 = var12;
						int var19 = var13;
						if (var17 != 22 && var17 != 29 && var17 != 34 && var17 != 36 && var17 != 46 && var17 != 47 && var17 != 48) {
							int[][] var20 = client.collision[client.field2907].field1667;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var18 > 0 && var12 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
									var18--;
								}
								if (var22 == 1 && var18 < 103 && var12 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
									var18++;
								}
								if (var22 == 2 && var19 > 0 && var19 > var13 - 3 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
									var19--;
								}
								if (var22 == 3 && var19 < 103 && var19 < var13 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
									var19++;
								}
							}
						}
						Statics.field2745[Statics.field930] = var16.field2831;
						Statics.field2577[Statics.field930] = var18;
						class134.field2501[Statics.field930] = var19;
						Statics.field930++;
					}
				}
			}
		}
		Statics.field2010 = var1;
		GameShell.field3852.method1521();
	}

	@ObfuscatedName("te.a(II[Lia;III[BZIII)V")
	public static void method1447(int arg0, int arg1, CollisionMap[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		int var9 = -1;
		Packet var10 = new Packet(arg5);
		while (true) {
			int var11 = var10.method332();
			if (var11 == 0) {
				return;
			}
			int var12 = 0;
			var9 += var11;
			while (true) {
				int var13 = var10.method350();
				if (var13 == 0) {
					break;
				}
				var12 += var13 - 1;
				int var14 = var12 >> 6 & 0x3F;
				int var15 = var12 & 0x3F;
				int var16 = var12 >> 12;
				int var17 = var10.g1();
				int var18 = var17 >> 2;
				int var19 = var17 & 0x3;
				if (arg6 == var16 && arg1 <= var14 && var14 < arg1 + 8 && arg3 <= var15 && var15 < arg3 + 8) {
					LocType var20 = LocType.method1321(var9);
					int var21 = RegionRotate.method469(var20.field2774, arg0, var15 & 0x7, var14 & 0x7, var20.field2794, var19) + arg8;
					int var22 = RegionRotate.method742(var15 & 0x7, var14 & 0x7, var19, var20.field2794, var20.field2774, arg0) + arg7;
					if (var21 > 0 && var22 > 0 && var21 < 103 && var22 < 103) {
						CollisionMap var23 = null;
						int var24 = arg4;
						if ((field2098[1][var21][var22] & 0x2) == 2) {
							var24 = arg4 - 1;
						}
						if (var24 >= 0) {
							var23 = arg2[var24];
						}
						method1503(true, arg4, arg0 + var19 & 0x3, var18, client.lowMem, var9, arg4, var23, var22, var21);
					}
				}
			}
		}
	}

	@ObfuscatedName("oi.a(I[B)V")
	public static void method1085(byte[] arg0) {
		int var1 = field4086 >> 2 << 10;
		byte[][] var2 = new byte[SeqType.field1988][Statics.field760];
		int var3 = field1270 >> 1;
		int var4 = 0;
		while (true) {
			while (arg0.length > var4) {
				int var5 = (arg0[var4++] & 0xFF) * 64 - Statics.field239;
				int var6 = (arg0[var4++] & 0xFF) * 64 - Statics.field2181;
				if (var5 > 0 && var6 > 0 && var5 + 64 < SeqType.field1988 && var6 + 64 < Statics.field760) {
					for (int var7 = 0; var7 < 64; var7++) {
						byte[] var8 = var2[var5 + var7];
						int var9 = Statics.field760 - var6 - 1;
						for (int var10 = -64; var10 < 0; var10++) {
							var8[var9--] = arg0[var4++];
						}
					}
				} else {
					var4 += 4096;
				}
			}
			int var11 = Statics.field760;
			int var12 = SeqType.field1988;
			int[] var13 = new int[var11];
			int[] var14 = new int[var11];
			int[] var15 = new int[var11];
			int[] var16 = new int[var11];
			int[] var17 = new int[var11];
			for (int var18 = -5; var18 < var12; var18++) {
				for (int var19 = 0; var19 < var11; var19++) {
					int var20 = var18 + 5;
					int var10002;
					if (var12 > var20) {
						int var21 = var2[var20][var19] & 0xFF;
						if (var21 > 0) {
							FluType var22 = FluType.method179(var21 - 1);
							var13[var19] += var22.field4420;
							var14[var19] += var22.field4410;
							var17[var19] += var22.field4413;
							var15[var19] += var22.field4407;
							var10002 = var16[var19]++;
						}
					}
					int var23 = var18 - 5;
					if (var23 >= 0) {
						int var24 = var2[var23][var19] & 0xFF;
						if (var24 > 0) {
							FluType var25 = FluType.method179(var24 - 1);
							var13[var19] -= var25.field4420;
							var14[var19] -= var25.field4410;
							var17[var19] -= var25.field4413;
							var15[var19] -= var25.field4407;
							var10002 = var16[var19]--;
						}
					}
				}
				if (var18 >= 0) {
					int[][] var26 = class105.field1912[var18 >> 6];
					int var27 = 0;
					int var28 = 0;
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					for (int var32 = -5; var32 < var11; var32++) {
						int var33 = var32 - 5;
						int var34 = var32 + 5;
						if (var34 < var11) {
							var30 += var15[var34];
							var31 += var16[var34];
							var28 += var17[var34];
							var27 += var14[var34];
							var29 += var13[var34];
						}
						if (var33 >= 0) {
							var30 -= var15[var33];
							var27 -= var14[var33];
							var28 -= var17[var33];
							var29 -= var13[var33];
							var31 -= var16[var33];
						}
						if (var32 >= 0 && var31 > 0) {
							int var35 = var32 >> 6;
							int var36 = var30 == 0 ? 0 : Statics.method1066(var29 * 256 / var30, var28 / var31, var27 / var31);
							if (var2[var18][var32] != 0) {
								if (var26[var35] == null) {
									var26[var35] = class105.field1912[var18 >> 6][var35] = new int[4096];
								}
								int var37 = var3 + (var36 & 0x7F);
								if (var37 < 0) {
									var37 = 0;
								} else if (var37 > 127) {
									var37 = 127;
								}
								int var38 = (var36 + var1 & 0xFC00) + ((var36 & 0x380) + var37);
								var26[var35][((var32 & 0x3F) << 6) + (var18 & 0x3F)] = Pix3D.field3349[Statics.method67(96, var38)];
							} else if (var26[var35] != null) {
								var26[var35][((var32 & 0x3F) << 6) + (var18 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("nb.a(III[Lia;IB[BZ)V")
	public static void method963(int arg0, int arg1, int arg2, CollisionMap[] arg3, int arg4, byte[] arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (var7 + arg1 > 0 && var7 + arg1 < 103 && var8 + arg4 > 0 && arg4 + var8 < 103) {
						arg3[var6].field1667[var7 + arg1][var8 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		Packet var9 = new Packet(arg5);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					ClientStream.method914(var11 + arg1, var9, arg0, arg2, var12 + arg4, 0, var10);
				}
			}
		}
	}

	@ObfuscatedName("ue.a(BZIZIIZIILia;II)V")
	public static void method1503(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, CollisionMap arg7, int arg8, int arg9) {
		if (arg4 && (field2098[0][arg9][arg8] & 0x2) == 0) {
			if ((field2098[arg1][arg9][arg8] & 0x10) != 0) {
				return;
			}
			if (method1555(arg8, arg9, arg1) != client.field3026) {
				return;
			}
		}
		if (arg1 < field468) {
			field468 = arg1;
		}
		LocType var10 = LocType.method1321(arg5);
		int var11;
		int var12;
		if (arg2 == 1 || arg2 == 3) {
			var11 = var10.field2794;
			var12 = var10.field2774;
		} else {
			var12 = var10.field2794;
			var11 = var10.field2774;
		}
		int var13;
		int var14;
		if (var11 + arg9 <= 104) {
			var13 = (var11 >> 1) + arg9;
			var14 = (var11 + 1 >> 1) + arg9;
		} else {
			var13 = arg9;
			var14 = arg9 + 1;
		}
		int var15;
		int var16;
		if (arg8 + var12 > 104) {
			var15 = arg8;
			var16 = arg8 + 1;
		} else {
			var15 = (var12 >> 1) + arg8;
			var16 = arg8 + (var12 + 1 >> 1);
		}
		int[][] var17 = field1137[arg6];
		int var18 = (var11 << 6) + (arg9 << 7);
		int var19 = var17[var14][var16] + var17[var13][var16] + var17[var14][var15] + var17[var13][var15] >> 2;
		int var20 = (var12 << 6) + (arg8 << 7);
		int[][] var21 = null;
		long var22 = (long) ((arg2 | 0x400) << 20 | arg3 << 14 | arg8 << 7 | arg9);
		if (var10.field2833 == 0) {
			var22 |= Long.MIN_VALUE;
		}
		if (arg6 < 3) {
			var21 = field1137[arg6 + 1];
		}
		if (var10.field2780 == 1) {
			var22 |= 0x400000L;
		}
		long var24 = var22 | (long) arg5 << 32;
		if (arg0 && var10.method994()) {
			BgSound.method84(arg9, arg1, arg2, arg8, var10);
		}
		if (arg3 == 22) {
			if (!arg4 || var10.field2833 != 0 || var10.field2819 == 1 || var10.field2826) {
				ModelSource var27;
				if (var10.field2810 == -1 && var10.field2770 == null) {
					class210 var26 = var10.method997(22, var21, var17, var18, arg0, var20, arg2, var19);
					var27 = var26.field3984;
				} else {
					var27 = new class81(arg5, 22, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
				}
				World.method232(arg1, arg9, arg8, var19, var27, var24, var10.field2799);
				if (var10.field2819 == 1 && arg7 != null) {
					arg7.method646(arg8, arg9);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			ModelSource var29;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var28 = var10.method997(10, var21, var17, var18, arg0, var20, arg2, var19);
				var29 = var28.field3984;
			} else {
				var29 = new class81(arg5, 10, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			if (var29 != null) {
				boolean var30 = Statics.method390(arg1, arg9, arg8, var19, var11, var12, var29, arg3 == 11 ? 256 : 0, var24);
				if (var10.field2782 && var30 && arg0) {
					int var31 = 15;
					if (var29 instanceof ModelLit) {
						var31 = ((ModelLit) var29).method192() / 4;
						if (var31 > 30) {
							var31 = 30;
						}
					}
					for (int var32 = 0; var32 <= var11; var32++) {
						for (int var33 = 0; var33 <= var12; var33++) {
							if (var31 > field2020[arg1][arg9 + var32][var33 + arg8]) {
								field2020[arg1][arg9 + var32][var33 + arg8] = (byte) var31;
							}
						}
					}
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method644(var11, var12, var10.field2789, arg9, arg8);
			}
		} else if (arg3 >= 12) {
			ModelSource var35;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var34 = var10.method997(arg3, var21, var17, var18, arg0, var20, arg2, var19);
				var35 = var34.field3984;
			} else {
				var35 = new class81(arg5, arg3, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			Statics.method390(arg1, arg9, arg8, var19, 1, 1, var35, 0, var24);
			if (arg0 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
				field2511[arg1][arg9][arg8] |= 0x924;
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method644(var11, var12, var10.field2789, arg9, arg8);
			}
		} else if (arg3 == 0) {
			ModelSource var36;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var37 = var10.method997(0, var21, var17, var18, arg0, var20, arg2, var19);
				var36 = var37.field3984;
			} else {
				var36 = new class81(arg5, 0, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method762(arg1, arg9, arg8, var19, var36, null, Statics.field3949[arg2], 0, var24);
			if (arg0) {
				if (arg2 == 0) {
					if (var10.field2782) {
						field2020[arg1][arg9][arg8] = 50;
						field2020[arg1][arg9][arg8 + 1] = 50;
					}
					if (var10.field2772) {
						field2511[arg1][arg9][arg8] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (var10.field2782) {
						field2020[arg1][arg9][arg8 + 1] = 50;
						field2020[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (var10.field2772) {
						field2511[arg1][arg9][arg8 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (var10.field2782) {
						field2020[arg1][arg9 + 1][arg8] = 50;
						field2020[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (var10.field2772) {
						field2511[arg1][arg9 + 1][arg8] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (var10.field2782) {
						field2020[arg1][arg9][arg8] = 50;
						field2020[arg1][arg9 + 1][arg8] = 50;
					}
					if (var10.field2772) {
						field2511[arg1][arg9][arg8] |= 0x492;
					}
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
			if (var10.field2805 != 16) {
				class245.method1602(arg1, arg9, arg8, var10.field2805);
			}
		} else if (arg3 == 1) {
			ModelSource var38;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var39 = var10.method997(1, var21, var17, var18, arg0, var20, arg2, var19);
				var38 = var39.field3984;
			} else {
				var38 = new class81(arg5, 1, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method762(arg1, arg9, arg8, var19, var38, null, Statics.field4427[arg2], 0, var24);
			if (var10.field2782 && arg0) {
				if (arg2 == 0) {
					field2020[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					field2020[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					field2020[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					field2020[arg1][arg9][arg8] = 50;
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
		} else if (arg3 == 2) {
			int var40 = arg2 + 1 & 0x3;
			ModelSource var41;
			ModelSource var42;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var43 = var10.method997(2, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var41 = var43.field3984;
				class210 var44 = var10.method997(2, var21, var17, var18, arg0, var20, var40, var19);
				var42 = var44.field3984;
			} else {
				var41 = new class81(arg5, 2, arg2 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
				var42 = new class81(arg5, 2, var40, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method762(arg1, arg9, arg8, var19, var41, var42, Statics.field3949[arg2], Statics.field3949[var40], var24);
			if (var10.field2772 && arg0) {
				if (arg2 == 0) {
					field2511[arg1][arg9][arg8] |= 0x249;
					field2511[arg1][arg9][arg8 + 1] |= 0x492;
				} else if (arg2 == 1) {
					field2511[arg1][arg9][arg8 + 1] |= 0x492;
					field2511[arg1][arg9 + 1][arg8] |= 0x249;
				} else if (arg2 == 2) {
					field2511[arg1][arg9 + 1][arg8] |= 0x249;
					field2511[arg1][arg9][arg8] |= 0x492;
				} else if (arg2 == 3) {
					field2511[arg1][arg9][arg8] |= 0x492;
					field2511[arg1][arg9][arg8] |= 0x249;
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
			if (var10.field2805 != 16) {
				class245.method1602(arg1, arg9, arg8, var10.field2805);
			}
		} else if (arg3 == 3) {
			ModelSource var46;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var45 = var10.method997(3, var21, var17, var18, arg0, var20, arg2, var19);
				var46 = var45.field3984;
			} else {
				var46 = new class81(arg5, 3, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method762(arg1, arg9, arg8, var19, var46, null, Statics.field4427[arg2], 0, var24);
			if (var10.field2782 && arg0) {
				if (arg2 == 0) {
					field2020[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					field2020[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					field2020[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					field2020[arg1][arg9][arg8] = 50;
				}
			}
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method645(arg3, arg8, var10.field2789, arg2, arg9);
			}
		} else if (arg3 == 9) {
			ModelSource var47;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var48 = var10.method997(arg3, var21, var17, var18, arg0, var20, arg2, var19);
				var47 = var48.field3984;
			} else {
				var47 = new class81(arg5, arg3, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			Statics.method390(arg1, arg9, arg8, var19, 1, 1, var47, 0, var24);
			if (var10.field2819 != 0 && arg7 != null) {
				arg7.method644(var11, var12, var10.field2789, arg9, arg8);
			}
			if (var10.field2805 != 16) {
				class245.method1602(arg1, arg9, arg8, var10.field2805);
			}
		} else if (arg3 == 4) {
			ModelSource var49;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var50 = var10.method997(4, var21, var17, var18, arg0, var20, arg2, var19);
				var49 = var50.field3984;
			} else {
				var49 = new class81(arg5, 4, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method1520(arg1, arg9, arg8, var19, var49, null, Statics.field3949[arg2], 0, 0, 0, var24);
		} else if (arg3 == 5) {
			int var51 = 16;
			long var52 = Statics.method1062(arg1, arg9, arg8);
			if (var52 != 0L) {
				var51 = LocType.method1321((int) (var52 >>> 32) & Integer.MAX_VALUE).field2805;
			}
			ModelSource var54;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var55 = var10.method997(4, var21, var17, var18, arg0, var20, arg2, var19);
				var54 = var55.field3984;
			} else {
				var54 = new class81(arg5, 4, arg2, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method1520(arg1, arg9, arg8, var19, var54, null, Statics.field3949[arg2], 0, var51 * Statics.field198[arg2], var51 * class86.field1557[arg2], var24);
		} else if (arg3 == 6) {
			int var56 = 8;
			long var57 = Statics.method1062(arg1, arg9, arg8);
			if (var57 != 0L) {
				var56 = LocType.method1321(Integer.MAX_VALUE & (int) (var57 >>> 32)).field2805 / 2;
			}
			ModelSource var59;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var60 = var10.method997(4, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var59 = var60.field3984;
			} else {
				var59 = new class81(arg5, 4, arg2 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method1520(arg1, arg9, arg8, var19, var59, null, 256, arg2, Statics.field3240[arg2] * var56, Statics.field551[arg2] * var56, var24);
		} else if (arg3 == 7) {
			int var61 = arg2 + 2 & 0x3;
			ModelSource var63;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var62 = var10.method997(4, var21, var17, var18, arg0, var20, var61 + 4, var19);
				var63 = var62.field3984;
			} else {
				var63 = new class81(arg5, 4, var61 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method1520(arg1, arg9, arg8, var19, var63, null, 256, var61, 0, 0, var24);
		} else if (arg3 == 8) {
			int var64 = 8;
			long var65 = Statics.method1062(arg1, arg9, arg8);
			if (var65 != 0L) {
				var64 = LocType.method1321((int) (var65 >>> 32) & Integer.MAX_VALUE).field2805 / 2;
			}
			int var67 = arg2 + 2 & 0x3;
			ModelSource var68;
			ModelSource var69;
			if (var10.field2810 == -1 && var10.field2770 == null) {
				class210 var70 = var10.method997(4, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var68 = var70.field3984;
				class210 var71 = var10.method997(4, var21, var17, var18, arg0, var20, var67 + 4, var19);
				var69 = var71.field3984;
			} else {
				var68 = new class81(arg5, 4, arg2 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
				var69 = new class81(arg5, 4, var67 + 4, arg6, arg9, arg8, var10.field2810, var10.field2829, null);
			}
			World.method1520(arg1, arg9, arg8, var19, var68, var69, 256, arg2, Statics.field3240[arg2] * var64, var64 * Statics.field551[arg2], var24);
		}
	}
}
