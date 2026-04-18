package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.config.IfType;
import jagex3.config.ObjType;
import jagex3.util.JagString;
import jagex3.var.VarCache;

import java.util.Calendar;
import java.util.Date;

public class ScriptRunner {
	@ObfuscatedName("l.j")
	public static int field1653 = 0;
	@ObfuscatedName("ca.e")
	public static Calendar field453 = Calendar.getInstance();
	@ObfuscatedName("hb.hb")
	public static int[] field1162;
	@ObfuscatedName("ra.r")
	public static JagString[] field2606;
	@ObfuscatedName("wb.o")
	public static int[] field3255 = new int[1000];
	@ObfuscatedName("te.ib")
	public static JagString[] field2957 = new JagString[1000];
	@ObfuscatedName("sa.l")
	public static ClientGosubFrame[] field2736 = new ClientGosubFrame[50];
	@ObfuscatedName("jc.vb")
	public static IfType field1468;
	@ObfuscatedName("uc.F")
	public static IfType field3068;

	@ObfuscatedName("ob.a([Ljava/lang/Object;IILqd;IZ)V")
	public static void method754(Object[] arg0, int arg1, IfType arg2, int arg3) {
		int var4 = 0;
		ClientScript var5 = ClientScript.method824((Integer) arg0[0], 76);
		int[] var6 = var5.field509;
		int[] var7 = var5.field519;
		int var8 = 0;
		int var9 = -1;
		try {
			field1162 = new int[var5.field518];
			field2606 = new JagString[var5.field514];
			int var10 = 0;
			int var11 = 0;
			for (int var12 = 1; var12 < arg0.length; var12++) {
				if (arg0[var12] instanceof Integer) {
					int var13 = (Integer) arg0[var12];
					if (var13 == -2147483647) {
						var13 = arg3;
					}
					if (var13 == -2147483646) {
						var13 = arg1;
					}
					if (var13 == -2147483645) {
						var13 = arg2.field2495;
					}
					if (var13 == -2147483644) {
						var13 = 0;
					}
					field1162[var10++] = var13;
				} else if (arg0[var12] instanceof JagString) {
					field2606[var11++] = (JagString) arg0[var12];
				}
			}
			while (true) {
				int var14;
				while (true) {
					var9++;
					var14 = var7[var9];
					if (var14 >= 100) {
						break;
					}
					if (var14 == 0) {
						field3255[var4++] = var6[var9];
					} else if (var14 == 1) {
						int var15 = var6[var9];
						field3255[var4++] = VarCache.var[var15];
					} else if (var14 == 2) {
						int var16 = var6[var9];
						var4--;
						VarCache.var[var16] = field3255[var4];
					} else if (var14 == 3) {
						field2957[var8++] = var5.field517[var9];
					} else if (var14 == 6) {
						var9 += var6[var9];
					} else if (var14 == 7) {
						var4 -= 2;
						if (field3255[var4 + 1] != field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 8) {
						var4 -= 2;
						if (field3255[var4 + 1] == field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 9) {
						var4 -= 2;
						if (field3255[var4 + 1] > field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 10) {
						var4 -= 2;
						if (field3255[var4 + 1] < field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 21) {
						if (field1653 == 0) {
							return;
						}
						ClientGosubFrame var17 = field2736[--field1653];
						field2606 = var17.stringLocals;
						field1162 = var17.intLocals;
						var9 = var17.pc;
						var5 = var17.script;
						var6 = var5.field509;
						var7 = var5.field519;
					} else if (var14 == 25) {
						int var18 = var6[var9];
						field3255[var4++] = VarCache.getVarbit(var18);
					} else if (var14 == 27) {
						int var19 = var6[var9];
						var4--;
						VarCache.method241(field3255[var4], var19);
					} else if (var14 == 31) {
						var4 -= 2;
						if (field3255[var4] <= field3255[var4 + 1]) {
							var9 += var6[var9];
						}
					} else if (var14 == 32) {
						var4 -= 2;
						if (field3255[var4 + 1] <= field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 33) {
						field3255[var4++] = field1162[var6[var9]];
					} else {
						int var10001;
						if (var14 == 34) {
							var10001 = var6[var9];
							var4--;
							field1162[var10001] = field3255[var4];
						} else if (var14 == 35) {
							field2957[var8++] = field2606[var6[var9]];
						} else if (var14 == 36) {
							var10001 = var6[var9];
							var8--;
							field2606[var10001] = field2957[var8];
						} else if (var14 == 37) {
							int var20 = var6[var9];
							var8 -= var20;
							JagString var21 = Statics.method825(var20, var8, field2957);
							field2957[var8++] = var21;
						} else if (var14 == 38) {
							var4--;
						} else if (var14 == 39) {
							var8--;
						} else if (var14 == 40) {
							int var22 = var6[var9];
							ClientScript var23 = ClientScript.method824(var22, 73);
							int[] var24 = new int[var23.field518];
							JagString[] var25 = new JagString[var23.field514];
							for (int var26 = 0; var26 < var23.field510; var26++) {
								var24[var26] = field3255[var4 + var26 - var23.field510];
							}
							for (int var27 = 0; var27 < var23.field513; var27++) {
								var25[var27] = field2957[var8 + var27 - var23.field513];
							}
							var8 -= var23.field513;
							var4 -= var23.field510;
							ClientGosubFrame var28 = new ClientGosubFrame();
							var28.stringLocals = field2606;
							var28.script = var5;
							var28.intLocals = field1162;
							var5 = var23;
							var28.pc = var9;
							field2736[field1653++] = var28;
							var6 = var23.field509;
							field2606 = var25;
							var9 = -1;
							field1162 = var24;
							var7 = var23.field519;
						} else if (var14 == 42) {
							field3255[var4++] = VarCache.field1020[var6[var9]];
						} else {
							if (var14 != 43) {
								break;
							}
							var10001 = var6[var9];
							var4--;
							VarCache.field1020[var10001] = field3255[var4];
						}
					}
				}
				boolean var29;
				if (var6[var9] == 1) {
					var29 = true;
				} else {
					var29 = false;
				}
				if (var14 < 1000) {
					if (var14 == 100) {
						var4 -= 3;
						int var30 = field3255[var4];
						int var31 = field3255[var4 + 1];
						int var32 = field3255[var4 + 2];
						IfType var33 = IfType.method1053(var30);
						if (var33.field2519 == null) {
							var33.field2519 = new IfType[var32 + 1];
						}
						if (var32 >= var33.field2519.length) {
							IfType[] var34 = new IfType[var32 + 1];
							for (int var35 = 0; var35 < var33.field2519.length; var35++) {
								var34[var35] = var33.field2519[var35];
							}
							var33.field2519 = var34;
						}
						IfType var36 = new IfType();
						var36.field2454 = var33.field2495;
						var36.field2489 = var31;
						var36.field2495 = ((var33.field2495 & 0xFFFF) << 15) + var32 + Integer.MIN_VALUE;
						var33.field2519[var32] = var36;
						if (var29) {
							field1468 = var36;
						} else {
							field3068 = var36;
						}
					} else if (var14 == 101) {
						IfType var37 = var29 ? field1468 : field3068;
						IfType var38 = IfType.method1053(var37.field2454);
						var38.field2519[var37.field2495 & 0x7FFF] = null;
					} else {
						if (var14 != 102) {
							break;
						}
						var4--;
						IfType var39 = IfType.method1053(field3255[var4]);
						var39.field2519 = null;
					}
				} else if (var14 >= 1000 && var14 < 1100 || !(var14 < 2000 || var14 >= 2100)) {
					IfType var40;
					if (var14 >= 2000) {
						var4--;
						var40 = IfType.method1053(field3255[var4]);
						var14 -= 1000;
					} else {
						var40 = var29 ? field1468 : field3068;
					}
					if (var14 == 1000) {
						var4 -= 2;
						var40.field2462 = field3255[var4];
						var40.field2502 = field3255[var4 + 1];
					} else if (var14 == 1001) {
						var4 -= 2;
						var40.field2498 = field3255[var4];
						var40.field2449 = field3255[var4 + 1];
					} else if (var14 == 1003) {
						var4--;
						var40.field2556 = field3255[var4] == 1;
					} else {
						if (var14 != 1004) {
							break;
						}
						var4--;
						var40.field2494 = field3255[var4] == 1;
					}
				} else if (var14 >= 1100 && var14 < 1200 || !(var14 < 2100 || var14 >= 2200)) {
					IfType var41;
					if (var14 < 2000) {
						var41 = var29 ? field1468 : field3068;
					} else {
						var4--;
						var41 = IfType.method1053(field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1100) {
						var4 -= 2;
						var41.field2552 = field3255[var4];
						var41.field2537 = field3255[var4 + 1];
					} else if (var14 == 1101) {
						var4--;
						int var42 = field3255[var4];
						int var43 = var42 >> 10 & 0x1F;
						int var44 = var42 & 0x1F;
						int var45 = var42 >> 5 & 0x1F;
						var41.field2453 = (var43 << 19) + (var45 << 11) + (var44 << 3);
					} else if (var14 == 1102) {
						var4--;
						var41.field2451 = field3255[var4] == 1;
					} else if (var14 == 1103) {
						var4--;
						var41.field2551 = field3255[var4];
					} else if (var14 == 1104) {
						var4--;
					} else if (var14 == 1105) {
						var4--;
						var41.field2550 = field3255[var4];
					} else if (var14 == 1106) {
						var4--;
						var41.field2557 = field3255[var4];
					} else if (var14 == 1107) {
						var4--;
						var41.field2447 = field3255[var4] == 1;
					} else if (var14 == 1108) {
						var41.field2493 = 1;
						var4--;
						var41.field2479 = field3255[var4];
					} else if (var14 == 1109) {
						var4 -= 6;
						var41.field2543 = field3255[var4];
						var41.field2485 = field3255[var4 + 1];
						var41.field2496 = field3255[var4 + 2];
						var41.field2463 = field3255[var4 + 3];
						var41.field2531 = field3255[var4 + 4];
						var41.field2534 = field3255[var4 + 5];
					} else if (var14 == 1110) {
						var4--;
						var41.field2465 = field3255[var4];
					} else if (var14 == 1111) {
						var4--;
						var41.field2507 = field3255[var4] == 1;
					} else if (var14 == 1112) {
						var8--;
						var41.field2474 = field2957[var8];
					} else if (var14 == 1113) {
						var4--;
						var41.field2448 = field3255[var4];
					} else if (var14 == 1114) {
						var4 -= 3;
						var41.field2539 = field3255[var4];
						var41.field2521 = field3255[var4 + 1];
						var41.field2538 = field3255[var4 + 2];
					} else {
						if (var14 != 1115) {
							break;
						}
						var4--;
						var41.field2471 = field3255[var4] == 1;
					}
				} else if (var14 >= 1200 && var14 < 1300 || var14 >= 2200 && var14 < 2300) {
					IfType var128;
					if (var14 < 2000) {
						var128 = var29 ? field1468 : field3068;
					} else {
						var4--;
						var128 = IfType.method1053(field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1200) {
						var4 -= 3;
						int var129 = field3255[var4];
						int var130 = field3255[var4 + 2];
						if (var129 == -1) {
							var128.field2493 = 0;
						} else {
							ObjType var131 = ObjType.list(var129);
							var128.field2493 = 4;
							var128.field2496 = var131.field2875;
							var128.field2531 = var131.field2858;
							var128.field2534 = var131.field2848 * 100 / var130;
							var128.field2463 = var131.field2861;
							var128.field2485 = var131.field2841;
							var128.field2543 = var131.field2837;
							var128.field2479 = var129;
						}
					} else if (var14 == 1201) {
						var128.field2493 = 2;
						var4--;
						var128.field2479 = field3255[var4];
					} else if (var14 == 1202) {
						var128.field2493 = 3;
						var128.field2479 = Client.localPlayer.field90.method634();
					} else {
						if (var14 != 1203) {
							break;
						}
						IfType var132 = var29 ? field3068 : field1468;
						var128.field2544 = var132.field2495;
					}
				} else if (var14 >= 1300 && var14 < 1400 || var14 >= 2300 && var14 < 2400) {
					IfType var121;
					if (var14 >= 2000) {
						var4--;
						var121 = IfType.method1053(field3255[var4]);
						var14 -= 1000;
					} else {
						var121 = var29 ? field1468 : field3068;
					}
					if (var14 >= 1300 && var14 <= 1309 || !(var14 < 1314 || var14 > 1317)) {
						var8--;
						JagString var122 = field2957[var8];
						Object[] var123 = new Object[var122.method10() + 1];
						for (int var124 = var123.length - 1; var124 >= 1; var124--) {
							if (var122.method6(var124 - 1) == 115) {
								var8--;
								var123[var124] = field2957[var8];
							} else {
								var4--;
								var123[var124] = Integer.valueOf(field3255[var4]);
							}
						}
						var4--;
						var123[0] = Integer.valueOf(field3255[var4]);
						if (var14 == 1303) {
							var121.field2513 = var123;
						}
						if (var14 == 1317) {
							var121.field2486 = var123;
						}
						if (var14 == 1304) {
							var121.field2464 = var123;
						}
						if (var14 == 1302) {
							var121.field2450 = var123;
						}
						if (var14 == 1316) {
							var121.field2553 = var123;
						}
						if (var14 == 1301) {
							var121.field2487 = var123;
						}
						if (var14 == 1300) {
							var121.field2483 = var123;
						}
						if (var14 == 1315) {
							var121.field2501 = var123;
						}
						if (var14 == 1306) {
							var121.field2475 = var123;
						}
						if (var14 == 1305) {
							var121.field2478 = var123;
						}
						if (var14 == 1309) {
							var121.field2518 = var123;
						}
						if (var14 == 1308) {
							var121.field2456 = var123;
						}
					} else if (var14 == 1310) {
						var4--;
						int var125 = field3255[var4] - 1;
						if (var125 >= 0 && var125 <= 9) {
							if (var121.field2467 == null || var121.field2467.length <= var125) {
								JagString[] var126 = new JagString[var125 + 1];
								if (var121.field2467 != null) {
									for (int var127 = 0; var127 < var121.field2467.length; var127++) {
										var126[var127] = var121.field2467[var127];
									}
								}
								var121.field2467 = var126;
							}
							var8--;
							var121.field2467[var125] = field2957[var8];
						} else {
							var8--;
						}
					} else if (var14 == 1311) {
						var4--;
						var121.field2544 = field3255[var4];
					} else if (var14 == 1312) {
						var4--;
						var121.field2500 = field3255[var4] == 1;
					} else {
						if (var14 != 1313) {
							break;
						}
						var4--;
					}
				} else if (var14 < 1500) {
					if (var14 == 1400) {
						var4 -= 2;
						int var46 = field3255[var4 + 1];
						int var47 = field3255[var4];
						IfType var48 = IfType.method1053(var47);
						if (var48.field2519 == null || var48.field2519.length <= var46 || var48.field2519[var46] == null) {
							field3255[var4++] = 0;
						} else {
							field3255[var4++] = 1;
							if (var29) {
								field1468 = var48.field2519[var46];
							} else {
								field3068 = var48.field2519[var46];
							}
						}
					} else if (var14 == 1401) {
						var4 -= 3;
						int var49 = field3255[var4];
						int var50 = field3255[var4 + 2];
						int var51 = field3255[var4 + 1];
						IfType var52 = Statics.method607(IfType.field2922[var49], var50, true, 0, -1, 0, var51);
						if (var52 == null) {
							field3255[var4++] = 0;
						} else {
							field3255[var4++] = 1;
							if (var29) {
								field1468 = var52;
							} else {
								field3068 = var52;
							}
						}
					} else {
						if (var14 != 1402) {
							break;
						}
						var4 -= 3;
						IfType var53 = IfType.method1053(field3255[var4]);
						int var54 = field3255[var4 + 2];
						int var55 = field3255[var4 + 1];
						IfType var56 = Statics.method607(var53.field2519, var54, true, var53.field2537, var53.field2495, var53.field2552, var55);
						if (var56 == null) {
							field3255[var4++] = 0;
						} else {
							field3255[var4++] = 1;
							if (var29) {
								field1468 = var56;
							} else {
								field3068 = var56;
							}
						}
					}
				} else if (var14 < 1600) {
					IfType var57 = var29 ? field1468 : field3068;
					if (var14 == 1500) {
						field3255[var4++] = var57.field2462;
					} else if (var14 == 1501) {
						field3255[var4++] = var57.field2502;
					} else if (var14 == 1502) {
						field3255[var4++] = var57.field2498;
					} else if (var14 == 1503) {
						field3255[var4++] = var57.field2449;
					} else if (var14 == 1504) {
						field3255[var4++] = var57.field2556 ? 1 : 0;
					} else {
						if (var14 != 1505) {
							break;
						}
						field3255[var4++] = var57.field2454;
					}
				} else if (var14 < 1700) {
					IfType var120 = var29 ? field1468 : field3068;
					if (var14 == 1600) {
						field3255[var4++] = var120.field2552;
					} else {
						if (var14 != 1601) {
							break;
						}
						field3255[var4++] = var120.field2537;
					}
				} else if (var14 < 2500) {
					if (var14 == 2401) {
						var4 -= 3;
						int var58 = field3255[var4 + 1];
						int var59 = field3255[var4];
						int var60 = field3255[var4 + 2];
						IfType var61 = Statics.method607(IfType.field2922[var59], var60, false, 0, -1, 0, var58);
						if (var61 == null) {
							field3255[var4++] = -1;
						} else {
							field3255[var4++] = var61.field2495;
						}
					} else {
						if (var14 != 2402) {
							break;
						}
						var4 -= 3;
						IfType var62 = IfType.method1053(field3255[var4]);
						int var63 = field3255[var4 + 1];
						int var64 = field3255[var4 + 2];
						IfType var65 = Statics.method607(IfType.field2922[var62.field2495 >> 16], var64, false, var62.field2537, var62.field2495 & 0xFFFF, var62.field2552, var63);
						if (var65 == null) {
							field3255[var4++] = -1;
						} else {
							field3255[var4++] = var65.field2495;
						}
					}
				} else if (var14 < 2600) {
					var4--;
					IfType var119 = IfType.method1053(field3255[var4]);
					if (var14 == 2500) {
						field3255[var4++] = var119.field2462;
					} else if (var14 == 2501) {
						field3255[var4++] = var119.field2502;
					} else if (var14 == 2502) {
						field3255[var4++] = var119.field2498;
					} else if (var14 == 2503) {
						field3255[var4++] = var119.field2449;
					} else if (var14 == 2504) {
						field3255[var4++] = var119.field2556 ? 1 : 0;
					} else {
						if (var14 != 2505) {
							break;
						}
						field3255[var4++] = var119.field2454;
					}
				} else if (var14 < 2700) {
					var4--;
					IfType var66 = IfType.method1053(field3255[var4]);
					if (var14 == 2600) {
						field3255[var4++] = var66.field2552;
					} else {
						if (var14 != 2601) {
							break;
						}
						field3255[var4++] = var66.field2537;
					}
				} else {
					if (var14 < 2800) {
						break;
					}
					if (var14 < 3100) {
						if (var14 == 3000) {
							var4--;
							int var67 = field3255[var4];
							if (Client.field2998 == -1) {
								Client.method414(0, var67);
								Client.field2998 = var67;
							}
						} else if (var14 == 3001 || var14 == 3003) {
							var4 -= 2;
							int var68 = field3255[var4];
							int var69 = field3255[var4 + 1];
							Client.method673(0, var69, var68);
						} else if (var14 == 3002) {
							IfType var70 = var29 ? field1468 : field3068;
							if (Client.field2998 == -1) {
								Client.method414(var70.field2495 & 0x7FFF, var70.field2454);
								Client.field2998 = var70.field2495;
							}
						} else {
							if (var14 != 3003) {
								break;
							}
							IfType var71 = var29 ? field1468 : field3068;
							var4--;
							int var72 = field3255[var4];
							Client.method673(var71.field2495 & 0x7FFF, var72, var71.field2454);
						}
					} else if (var14 >= 3200) {
						if (var14 < 3300) {
							if (var14 == 3200) {
								var4 -= 3;
								Client.method887(field3255[var4], field3255[var4 + 1], field3255[var4 + 2]);
							} else if (var14 == 3201) {
								var4--;
								Client.method874(field3255[var4]);
							} else {
								if (var14 != 3202) {
									break;
								}
								var4 -= 2;
								Client.method928(field3255[var4 + 1], field3255[var4]);
							}
						} else if (var14 < 3400) {
							if (var14 != 3300) {
								break;
							}
							field3255[var4++] = Client.loopCycle;
						} else if (var14 >= 4100) {
							if (var14 >= 4200) {
								break;
							}
							if (var14 == 4100) {
								var8--;
								JagString var102 = field2957[var8];
								var4--;
								int var103 = field3255[var4];
								field2957[var8++] = JagString.join(new JagString[]{var102, Statics.method502(var103)});
							} else if (var14 == 4101) {
								var8 -= 2;
								JagString var104 = field2957[var8 + 1];
								JagString var105 = field2957[var8];
								field2957[var8++] = JagString.join(new JagString[]{var105, var104});
							} else if (var14 == 4102) {
								var8--;
								JagString var106 = field2957[var8];
								var4--;
								int var107 = field3255[var4];
								field2957[var8++] = JagString.join(new JagString[]{var106, Statics.method1034(var107)});
							} else if (var14 == 4103) {
								var8--;
								JagString var108 = field2957[var8];
								field2957[var8++] = var108.method30();
							} else if (var14 == 4104) {
								var4--;
								int var109 = field3255[var4];
								long var110 = ((long) var109 + 11745L) * 86400000L;
								field453.setTime(new Date(var110));
								int var112 = field453.get(5);
								int var113 = field453.get(2);
								int var114 = field453.get(1);
								field2957[var8++] = JagString.join(new JagString[]{Statics.method502(var112), Statics.field1572, Statics.field621[var113], Statics.field1572, Statics.method502(var114)});
							} else if (var14 == 4105) {
								var8 -= 2;
								JagString var115 = field2957[var8];
								JagString var116 = field2957[var8 + 1];
								if (Client.localPlayer.field90 != null && Client.localPlayer.field90.field1658) {
									field2957[var8++] = var116;
								} else {
									field2957[var8++] = var115;
								}
							} else if (var14 == 4106) {
								var4--;
								int var117 = field3255[var4];
								field2957[var8++] = Statics.method502(var117);
							} else {
								if (var14 != 4107) {
									break;
								}
								var8 -= 2;
								field3255[var4++] = field2957[var8].method35(field2957[var8 + 1]);
							}
						} else if (var14 == 4000) {
							var4 -= 2;
							int var73 = field3255[var4];
							int var74 = field3255[var4 + 1];
							field3255[var4++] = var73 + var74;
						} else if (var14 == 4001) {
							var4 -= 2;
							int var75 = field3255[var4 + 1];
							int var76 = field3255[var4];
							field3255[var4++] = var76 - var75;
						} else if (var14 == 4002) {
							var4 -= 2;
							int var77 = field3255[var4 + 1];
							int var78 = field3255[var4];
							field3255[var4++] = var77 * var78;
						} else if (var14 == 4003) {
							var4 -= 2;
							int var79 = field3255[var4];
							int var80 = field3255[var4 + 1];
							field3255[var4++] = var79 / var80;
						} else if (var14 == 4004) {
							var4--;
							int var81 = field3255[var4];
							field3255[var4++] = (int) (Math.random() * (double) var81);
						} else if (var14 == 4005) {
							var4--;
							int var82 = field3255[var4];
							field3255[var4++] = (int) ((double) (var82 + 1) * Math.random());
						} else if (var14 == 4006) {
							var4 -= 5;
							int var83 = field3255[var4 + 1];
							int var84 = field3255[var4];
							int var85 = field3255[var4 + 3];
							int var86 = field3255[var4 + 4];
							int var87 = field3255[var4 + 2];
							field3255[var4++] = var84 + (var83 - var84) * (-var87 + var86) / (var85 - var87);
						} else if (var14 == 4007) {
							var4 -= 2;
							int var88 = field3255[var4];
							int var89 = field3255[var4 + 1];
							field3255[var4++] = var88 * var89 / 100 + var88;
						} else if (var14 == 4008) {
							var4 -= 2;
							int var90 = field3255[var4];
							int var91 = field3255[var4 + 1];
							field3255[var4++] = 0x1 << var91 | var90;
						} else if (var14 == 4009) {
							var4 -= 2;
							int var92 = field3255[var4];
							int var93 = field3255[var4 + 1];
							field3255[var4++] = var92 & -(0x1 << var93) - 1;
						} else if (var14 == 4010) {
							var4 -= 2;
							int var94 = field3255[var4];
							int var95 = field3255[var4 + 1];
							field3255[var4++] = (0x1 << var95 & var94) == 0 ? 0 : 1;
						} else if (var14 == 4011) {
							var4 -= 2;
							int var96 = field3255[var4 + 1];
							int var97 = field3255[var4];
							field3255[var4++] = var97 % var96;
						} else if (var14 == 4012) {
							var4 -= 2;
							int var98 = field3255[var4];
							int var99 = field3255[var4 + 1];
							if (var98 == 0) {
								field3255[var4++] = 0;
							} else {
								field3255[var4++] = (int) Math.pow((double) var98, (double) var99);
							}
						} else {
							if (var14 != 4013) {
								break;
							}
							var4 -= 2;
							int var100 = field3255[var4];
							int var101 = field3255[var4 + 1];
							if (var100 == 0) {
								field3255[var4++] = 0;
							} else if (var101 == 0) {
								field3255[var4++] = Integer.MAX_VALUE;
							} else {
								field3255[var4++] = (int) Math.pow((double) var100, 1.0D / (double) var101);
							}
						}
					} else if (var14 == 3100) {
						var8--;
						JagString var118 = field2957[var8];
						Client.method758(0, var118, Statics.field2585);
					} else {
						if (var14 != 3101) {
							break;
						}
						var4 -= 2;
						Client.method450(field3255[var4], field3255[var4 + 1], Client.localPlayer);
					}
				}
			}
		} catch (Exception var133) {
		}
	}

}
