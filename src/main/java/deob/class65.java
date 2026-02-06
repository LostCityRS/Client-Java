package deob;

@ObfuscatedName("jc")
public final class class65 extends class13 {

	@ObfuscatedName("jc.bb")
	public int field1515 = -1;

	@ObfuscatedName("jc.cb")
	public short[] field1516;

	@ObfuscatedName("jc.eb")
	public short[] field1518;

	@ObfuscatedName("jc.gb")
	public static class32 field1520 = class73.method593(":trade:", true);

	@ObfuscatedName("jc.hb")
	public static class32 field1521 = class73.method593("Username: ", true);

	@ObfuscatedName("jc.N")
	public static int field1501 = 2;

	@ObfuscatedName("jc.L")
	public static class32 field1499 = class73.method593("Too many incorrect logins from your address)3", true);

	@ObfuscatedName("jc.ab")
	public static class32 field1514 = field1499;

	@ObfuscatedName("jc.R")
	public static class32 field1505 = class73.method593("sl_flags", true);

	@ObfuscatedName("jc.Y")
	public static class32 field1512 = class73.method593("Spieler kann nicht gefunden werden: ", true);

	@ObfuscatedName("jc.U")
	public static class32 field1508 = class73.method593("<)4col>", true);

	@ObfuscatedName("jc.V")
	public static class123[] field1509 = new class123[50];

	@ObfuscatedName("jc.S")
	public static class32 field1506 = field1521;

	@ObfuscatedName("jc.Q")
	public boolean field1504 = false;

	@ObfuscatedName("jc.H")
	public final int[] field1495 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("jc.X")
	public static class8 field1511;

	@ObfuscatedName("jc.W")
	public int[] field1510;

	@ObfuscatedName("jc.I")
	public short[] field1496;

	@ObfuscatedName("jc.P")
	public short[] field1503;

	@ObfuscatedName("jc.a([Lqf;ILvd;)V")
	public static void method499(class117[] arg0, class150 arg1) {
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 104; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					if ((class3.field50[var2][var3][var4] & 0x1) == 1) {
						int var5 = var2;
						if ((class3.field50[1][var3][var4] & 0x2) == 2) {
							var5 = var2 - 1;
						}
						if (var5 >= 0) {
							arg0[var5].method917(var3, var4);
						}
					}
				}
			}
		}
		class115.field2764 += (int) (Math.random() * 5.0D) - 2;
		class54.field1276 += (int) (Math.random() * 5.0D) - 2;
		if (class115.field2764 < -16) {
			class115.field2764 = -16;
		}
		if (class54.field1276 < -8) {
			class54.field1276 = -8;
		}
		if (class54.field1276 > 8) {
			class54.field1276 = 8;
		}
		if (class115.field2764 > 16) {
			class115.field2764 = 16;
		}
		for (int var6 = 0; var6 < 4; var6++) {
			byte[][] var7 = class85.field1985[var6];
			int var8 = (int) Math.sqrt(5100.0D);
			int var9 = var8 * 768 >> 8;
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					int var12 = class70.field1630[var6][var11][var10 + 1] - class70.field1630[var6][var11][var10 - 1];
					int var13 = class70.field1630[var6][var11 + 1][var10] - class70.field1630[var6][var11 - 1][var10];
					int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
					int var15 = (var13 << 8) / var14;
					int var16 = (var7[var11][var10 + 1] >> 3) + ((var7[var11 - 1][var10] >> 2) - (-(var7[var11 + 1][var10] >> 3) - (var7[var11][var10 - 1] >> 2) - (var7[var11][var10] >> 1)));
					int var17 = 65536 / var14;
					int var18 = (var12 << 8) / var14;
					int var19 = (var17 * -10 + var15 * -50 + var18 * -50) / var9 + 96;
					class31.field590[var11][var10] = var19 - var16;
				}
			}
			for (int var20 = 0; var20 < 104; var20++) {
				class37.field894[var20] = 0;
				class68.field1592[var20] = 0;
				class106.field2511[var20] = 0;
				class33.field698[var20] = 0;
				class143.field3272[var20] = 0;
			}
			for (int var21 = -5; var21 < 109; var21++) {
				for (int var22 = 0; var22 < 104; var22++) {
					int var23 = var21 + 5;
					int var10002;
					if (var23 >= 0 && var23 < 104) {
						int var24 = class117.field2814[var6][var23][var22] & 0xFF;
						if (var24 > 0) {
							class34 var25 = class152.method1177(var24 - 1);
							class37.field894[var22] += var25.field722;
							class68.field1592[var22] += var25.field706;
							class106.field2511[var22] += var25.field704;
							class33.field698[var22] += var25.field724;
							var10002 = class143.field3272[var22]++;
						}
					}
					int var26 = var21 - 5;
					if (var26 >= 0 && var26 < 104) {
						int var27 = class117.field2814[var6][var26][var22] & 0xFF;
						if (var27 > 0) {
							class34 var28 = class152.method1177(var27 - 1);
							class37.field894[var22] -= var28.field722;
							class68.field1592[var22] -= var28.field706;
							class106.field2511[var22] -= var28.field704;
							class33.field698[var22] -= var28.field724;
							var10002 = class143.field3272[var22]--;
						}
					}
				}
				if (var21 >= 1 && var21 < 103) {
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					int var32 = 0;
					int var33 = 0;
					for (int var34 = -5; var34 < 109; var34++) {
						int var35 = var34 + 5;
						if (var35 >= 0 && var35 < 104) {
							var32 += class33.field698[var35];
							var30 += class68.field1592[var35];
							var33 += class143.field3272[var35];
							var29 += class37.field894[var35];
							var31 += class106.field2511[var35];
						}
						int var36 = var34 - 5;
						if (var36 >= 0 && var36 < 104) {
							var29 -= class37.field894[var36];
							var32 -= class33.field698[var36];
							var30 -= class68.field1592[var36];
							var31 -= class106.field2511[var36];
							var33 -= class143.field3272[var36];
						}
						if (var34 >= 1 && var34 < 103 && (!class154.field3529 || (class3.field50[0][var21][var34] & 0x2) != 0 || (class3.field50[var6][var21][var34] & 0x10) == 0 && class34.method287(var6, var34, var21) == class115.field2743)) {
							if (class151.field3472 > var6) {
								class151.field3472 = var6;
							}
							int var37 = class117.field2814[var6][var21][var34] & 0xFF;
							int var38 = class111.field2612[var6][var21][var34] & 0xFF;
							if (var37 > 0 || var38 > 0) {
								int var39 = class70.field1630[var6][var21][var34];
								int var40 = class70.field1630[var6][var21 + 1][var34];
								int var41 = class70.field1630[var6][var21 + 1][var34 + 1];
								int var42 = class70.field1630[var6][var21][var34 + 1];
								int var43 = class31.field590[var21][var34];
								int var44 = class31.field590[var21 + 1][var34 + 1];
								int var45 = class31.field590[var21 + 1][var34];
								int var46 = -1;
								int var47 = -1;
								int var48 = class31.field590[var21][var34 + 1];
								if (var37 > 0) {
									int var49 = var30 / var33;
									int var50 = var31 / var33;
									int var51 = var29 * 256 / var32;
									var46 = class100.method795(var51, var50, var49);
									int var52 = var50 + class115.field2764;
									if (var52 < 0) {
										var52 = 0;
									} else if (var52 > 255) {
										var52 = 255;
									}
									int var53 = class54.field1276 + var51 & 0xFF;
									var47 = class100.method795(var53, var52, var49);
								}
								if (var6 > 0) {
									boolean var54 = true;
									if (var37 == 0 && class134.field3129[var6][var21][var34] != 0) {
										var54 = false;
									}
									if (var38 > 0 && !class50.method396(var38 - 1).field1338) {
										var54 = false;
									}
									if (var54 && var39 == var40 && var41 == var39 && var42 == var39) {
										class103.field2426[var6][var21][var34] |= 0x924;
									}
								}
								int var55 = 0;
								if (var47 != -1) {
									var55 = class7.field123[class125.method983(96, var47)];
								}
								if (var38 == 0) {
									arg1.method1144(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, class125.method983(var43, var46), class125.method983(var45, var46), class125.method983(var44, var46), class125.method983(var48, var46), 0, 0, 0, 0, var55, 0);
								} else {
									int var56 = class134.field3129[var6][var21][var34] + 1;
									byte var57 = class134.field3123[var6][var21][var34];
									class57 var58 = class50.method396(var38 - 1);
									int var59 = var58.field1336;
									int var60;
									int var61;
									if (var59 >= 0) {
										var61 = -1;
										var60 = class7.field126.method558(var59);
									} else if (var58.field1316 == 16711935) {
										var59 = -1;
										var60 = -2;
										var61 = -2;
									} else {
										var61 = class100.method795(var58.field1332, var58.field1330, var58.field1333);
										int var62 = class54.field1276 + var58.field1332 & 0xFF;
										int var63 = class115.field2764 + var58.field1330;
										if (var63 < 0) {
											var63 = 0;
										} else if (var63 > 255) {
											var63 = 255;
										}
										var60 = class100.method795(var62, var63, var58.field1333);
									}
									int var64 = 0;
									if (var60 != -2) {
										var64 = class7.field123[class56.method438(var60, 96)];
									}
									if (var58.field1312 != -1) {
										int var65 = var58.field1335 + class54.field1276 & 0xFF;
										int var66 = var58.field1322 + class115.field2764;
										if (var66 < 0) {
											var66 = 0;
										} else if (var66 > 255) {
											var66 = 255;
										}
										int var67 = class100.method795(var65, var66, var58.field1315);
										var64 = class7.field123[class56.method438(var67, 96)];
									}
									arg1.method1144(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, class125.method983(var43, var46), class125.method983(var45, var46), class125.method983(var44, var46), class125.method983(var48, var46), class56.method438(var61, var43), class56.method438(var61, var45), class56.method438(var61, var44), class56.method438(var61, var48), var55, var64);
								}
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					arg1.method1122(var6, var69, var68, class34.method287(var6, var68, var69));
				}
			}
			class117.field2814[var6] = null;
			class111.field2612[var6] = null;
			class134.field3129[var6] = null;
			class134.field3123[var6] = null;
			class85.field1985[var6] = null;
		}
		arg1.method1140();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((class3.field50[1][var70][var71] & 0x2) == 2) {
					arg1.method1157(var70, var71);
				}
			}
		}
		int var72 = 1;
		int var73 = 2;
		int var74 = 4;
		for (int var75 = 0; var75 < 4; var75++) {
			if (var75 > 0) {
				var74 <<= 0x3;
				var73 <<= 0x3;
				var72 <<= 0x3;
			}
			for (int var76 = 0; var76 <= var75; var76++) {
				for (int var77 = 0; var77 <= 104; var77++) {
					for (int var78 = 0; var78 <= 104; var78++) {
						if ((class103.field2426[var76][var78][var77] & var72) != 0) {
							int var79;
							for (var79 = var77; var79 > 0 && (var72 & class103.field2426[var76][var78][var79 - 1]) != 0; var79--) {
							}
							int var80;
							for (var80 = var77; var80 < 104 && (var72 & class103.field2426[var76][var78][var80 + 1]) != 0; var80++) {
							}
							int var81 = var76;
							int var82;
							label347: for (var82 = var76; var82 > 0; var82--) {
								for (int var83 = var79; var83 <= var80; var83++) {
									if ((class103.field2426[var82 - 1][var78][var83] & var72) == 0) {
										break label347;
									}
								}
							}
							label336: while (var81 < var75) {
								for (int var84 = var79; var84 <= var80; var84++) {
									if ((class103.field2426[var81 + 1][var78][var84] & var72) == 0) {
										break label336;
									}
								}
								var81++;
							}
							int var85 = (var81 + 1 - var82) * (var80 + 1 - var79);
							if (var85 >= 8) {
								int var86 = class70.field1630[var81][var78][var79] - 240;
								int var87 = class70.field1630[var82][var78][var79];
								class150.method1145(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var86, var87);
								for (int var88 = var82; var88 <= var81; var88++) {
									for (int var89 = var79; var89 <= var80; var89++) {
										class103.field2426[var88][var78][var89] &= ~var72;
									}
								}
							}
						}
						if ((var73 & class103.field2426[var76][var78][var77]) != 0) {
							int var90 = var78;
							int var91 = var78;
							while (var90 > 0 && (class103.field2426[var76][var90 - 1][var77] & var73) != 0) {
								var90--;
							}
							int var92 = var76;
							while (var91 < 104 && (var73 & class103.field2426[var76][var91 + 1][var77]) != 0) {
								var91++;
							}
							int var93 = var76;
							label402: while (var92 > 0) {
								for (int var94 = var90; var94 <= var91; var94++) {
									if ((class103.field2426[var92 - 1][var94][var77] & var73) == 0) {
										break label402;
									}
								}
								var92--;
							}
							label391: while (var93 < var75) {
								for (int var95 = var90; var95 <= var91; var95++) {
									if ((class103.field2426[var93 + 1][var95][var77] & var73) == 0) {
										break label391;
									}
								}
								var93++;
							}
							int var96 = (var91 + 1 - var90) * (var93 + 1 - var92);
							if (var96 >= 8) {
								int var97 = class70.field1630[var93][var90][var77] - 240;
								int var98 = class70.field1630[var92][var90][var77];
								class150.method1145(var75, 2, var90 * 128, var91 * 128 + 128, var77 * 128, var77 * 128, var97, var98);
								for (int var99 = var92; var99 <= var93; var99++) {
									for (int var100 = var90; var100 <= var91; var100++) {
										class103.field2426[var99][var100][var77] &= ~var73;
									}
								}
							}
						}
						if ((class103.field2426[var76][var78][var77] & var74) != 0) {
							int var101 = var78;
							int var102;
							for (var102 = var77; var102 < 104 && (var74 & class103.field2426[var76][var78][var102 + 1]) != 0; var102++) {
							}
							int var103 = var77;
							int var104 = var78;
							while (var103 > 0 && (class103.field2426[var76][var78][var103 - 1] & var74) != 0) {
								var103--;
							}
							label457: while (var101 > 0) {
								for (int var105 = var103; var105 <= var102; var105++) {
									if ((var74 & class103.field2426[var76][var101 - 1][var105]) == 0) {
										break label457;
									}
								}
								var101--;
							}
							label446: while (var104 < 104) {
								for (int var106 = var103; var106 <= var102; var106++) {
									if ((var74 & class103.field2426[var76][var104 + 1][var106]) == 0) {
										break label446;
									}
								}
								var104++;
							}
							if ((var102 + 1 - var103) * (var104 + 1 - var101) >= 4) {
								int var107 = class70.field1630[var76][var101][var103];
								class150.method1145(var75, 4, var101 * 128, var104 * 128 + 128, var103 * 128, var102 * 128 + 128, var107, var107);
								for (int var108 = var101; var108 <= var104; var108++) {
									for (int var109 = var103; var109 <= var102; var109++) {
										class103.field2426[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.h(I)V")
	public static void method503() {
		if (class4.field68 > 0) {
			class91.method723();
		} else {
			class54.method425(40);
			class80.field1840 = class143.field3273;
			class143.field3273 = null;
		}
	}

	@ObfuscatedName("jc.e(I)Z")
	public boolean method495() {
		if (this.field1510 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field1510.length; var2++) {
			if (!class15.field307.method213(this.field1510[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("jc.a(BLjd;)V")
	public void method497(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method501(var2, arg0);
		}
	}

	@ObfuscatedName("jc.a(B)Z")
	public boolean method498() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field1495[var2] != -1 && !class15.field307.method213(this.field1495[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("jc.b(B)Lp;")
	public class104 method500() {
		if (this.field1510 == null) {
			return null;
		}
		class104[] var1 = new class104[this.field1510.length];
		for (int var2 = 0; var2 < this.field1510.length; var2++) {
			var1[var2] = class104.method840(class15.field307, this.field1510[var2]);
		}
		class104 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class104(var1, var1.length);
		}
		if (this.field1496 != null) {
			for (int var4 = 0; var4 < this.field1496.length; var4++) {
				var3.method833(this.field1496[var4], this.field1516[var4]);
			}
		}
		if (this.field1518 != null) {
			for (int var5 = 0; var5 < this.field1518.length; var5++) {
				var3.method853(this.field1518[var5], this.field1503[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("jc.a(ILjd;B)V")
	public void method501(int arg0, class66 arg1) {
		if (arg0 == 1) {
			this.field1515 = arg1.method532();
		} else if (arg0 == 2) {
			int var3 = arg1.method532();
			this.field1510 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1510[var4] = arg1.method531();
			}
		} else if (arg0 == 3) {
			this.field1504 = true;
		} else if (arg0 == 40) {
			int var7 = arg1.method532();
			this.field1516 = new short[var7];
			this.field1496 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field1496[var8] = (short) arg1.method531();
				this.field1516[var8] = (short) arg1.method531();
			}
		} else if (arg0 == 41) {
			int var5 = arg1.method532();
			this.field1503 = new short[var5];
			this.field1518 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field1518[var6] = (short) arg1.method531();
				this.field1503[var6] = (short) arg1.method531();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.field1495[arg0 - 60] = arg1.method531();
		}
	}

	@ObfuscatedName("jc.g(I)Lp;")
	public class104 method502() {
		class104[] var1 = new class104[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field1495[var3] != -1) {
				var1[var2++] = class104.method840(class15.field307, this.field1495[var3]);
			}
		}
		class104 var4 = new class104(var1, var2);
		if (this.field1496 != null) {
			for (int var5 = 0; var5 < this.field1496.length; var5++) {
				var4.method833(this.field1496[var5], this.field1516[var5]);
			}
		}
		if (this.field1518 != null) {
			for (int var6 = 0; var6 < this.field1518.length; var6++) {
				var4.method853(this.field1518[var6], this.field1503[var6]);
			}
		}
		return var4;
	}
}
