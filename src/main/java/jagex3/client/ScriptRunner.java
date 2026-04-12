package jagex3.client;

import deob.*;
import jagex3.config.IfType;
import jagex3.config.ObjType;
import jagex3.util.JagString;

import java.util.Calendar;
import java.util.Date;

public class ScriptRunner {
	@ObfuscatedName("l.j")
	public static int field1653 = 0;
	@ObfuscatedName("ca.e")
	public static Calendar field453 = Calendar.getInstance();

	@ObfuscatedName("ob.a([Ljava/lang/Object;IILqd;IZ)V")
	public static void method754(Object[] arg0, int arg1, IfType arg2, int arg3) {
		int var4 = 0;
		ClientScript var5 = ClientScript.method824((Integer) arg0[0], 76);
		int[] var6 = var5.field509;
		int[] var7 = var5.field519;
		int var8 = 0;
		int var9 = -1;
		try {
			Statics.field1162 = new int[var5.field518];
			Statics.field2606 = new JagString[var5.field514];
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
					Statics.field1162[var10++] = var13;
				} else if (arg0[var12] instanceof JagString) {
					Statics.field2606[var11++] = (JagString) arg0[var12];
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
						Statics.field3255[var4++] = var6[var9];
					} else if (var14 == 1) {
						int var15 = var6[var9];
						Statics.field3255[var4++] = Statics.field2803[var15];
					} else if (var14 == 2) {
						int var16 = var6[var9];
						var4--;
						Statics.field2803[var16] = Statics.field3255[var4];
					} else if (var14 == 3) {
						Statics.field2957[var8++] = var5.field517[var9];
					} else if (var14 == 6) {
						var9 += var6[var9];
					} else if (var14 == 7) {
						var4 -= 2;
						if (Statics.field3255[var4 + 1] != Statics.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 8) {
						var4 -= 2;
						if (Statics.field3255[var4 + 1] == Statics.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 9) {
						var4 -= 2;
						if (Statics.field3255[var4 + 1] > Statics.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 10) {
						var4 -= 2;
						if (Statics.field3255[var4 + 1] < Statics.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 21) {
						if (field1653 == 0) {
							return;
						}
						ClientGosubFrame var17 = Statics.field2736[--field1653];
						Statics.field2606 = var17.field3010;
						Statics.field1162 = var17.field3000;
						var9 = var17.field3013;
						var5 = var17.field2999;
						var6 = var5.field509;
						var7 = var5.field519;
					} else if (var14 == 25) {
						int var18 = var6[var9];
						Statics.field3255[var4++] = Statics.method480(var18);
					} else if (var14 == 27) {
						int var19 = var6[var9];
						var4--;
						Statics.method241(Statics.field3255[var4], var19);
					} else if (var14 == 31) {
						var4 -= 2;
						if (Statics.field3255[var4] <= Statics.field3255[var4 + 1]) {
							var9 += var6[var9];
						}
					} else if (var14 == 32) {
						var4 -= 2;
						if (Statics.field3255[var4 + 1] <= Statics.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 33) {
						Statics.field3255[var4++] = Statics.field1162[var6[var9]];
					} else {
						int var10001;
						if (var14 == 34) {
							var10001 = var6[var9];
							var4--;
							Statics.field1162[var10001] = Statics.field3255[var4];
						} else if (var14 == 35) {
							Statics.field2957[var8++] = Statics.field2606[var6[var9]];
						} else if (var14 == 36) {
							var10001 = var6[var9];
							var8--;
							Statics.field2606[var10001] = Statics.field2957[var8];
						} else if (var14 == 37) {
							int var20 = var6[var9];
							var8 -= var20;
							JagString var21 = Statics.method825(var20, var8, Statics.field2957);
							Statics.field2957[var8++] = var21;
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
								var24[var26] = Statics.field3255[var4 + var26 - var23.field510];
							}
							for (int var27 = 0; var27 < var23.field513; var27++) {
								var25[var27] = Statics.field2957[var8 + var27 - var23.field513];
							}
							var8 -= var23.field513;
							var4 -= var23.field510;
							ClientGosubFrame var28 = new ClientGosubFrame();
							var28.field3010 = Statics.field2606;
							var28.field2999 = var5;
							var28.field3000 = Statics.field1162;
							var5 = var23;
							var28.field3013 = var9;
							Statics.field2736[field1653++] = var28;
							var6 = var23.field509;
							Statics.field2606 = var25;
							var9 = -1;
							Statics.field1162 = var24;
							var7 = var23.field519;
						} else if (var14 == 42) {
							Statics.field3255[var4++] = Statics.field1020[var6[var9]];
						} else {
							if (var14 != 43) {
								break;
							}
							var10001 = var6[var9];
							var4--;
							Statics.field1020[var10001] = Statics.field3255[var4];
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
						int var30 = Statics.field3255[var4];
						int var31 = Statics.field3255[var4 + 1];
						int var32 = Statics.field3255[var4 + 2];
						IfType var33 = Client.method1053(var30);
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
							Statics.field1468 = var36;
						} else {
							Statics.field3068 = var36;
						}
					} else if (var14 == 101) {
						IfType var37 = var29 ? Statics.field1468 : Statics.field3068;
						IfType var38 = Client.method1053(var37.field2454);
						var38.field2519[var37.field2495 & 0x7FFF] = null;
					} else {
						if (var14 != 102) {
							break;
						}
						var4--;
						IfType var39 = Client.method1053(Statics.field3255[var4]);
						var39.field2519 = null;
					}
				} else if (var14 >= 1000 && var14 < 1100 || !(var14 < 2000 || var14 >= 2100)) {
					IfType var40;
					if (var14 >= 2000) {
						var4--;
						var40 = Client.method1053(Statics.field3255[var4]);
						var14 -= 1000;
					} else {
						var40 = var29 ? Statics.field1468 : Statics.field3068;
					}
					if (var14 == 1000) {
						var4 -= 2;
						var40.field2462 = Statics.field3255[var4];
						var40.field2502 = Statics.field3255[var4 + 1];
					} else if (var14 == 1001) {
						var4 -= 2;
						var40.field2498 = Statics.field3255[var4];
						var40.field2449 = Statics.field3255[var4 + 1];
					} else if (var14 == 1003) {
						var4--;
						var40.field2556 = Statics.field3255[var4] == 1;
					} else {
						if (var14 != 1004) {
							break;
						}
						var4--;
						var40.field2494 = Statics.field3255[var4] == 1;
					}
				} else if (var14 >= 1100 && var14 < 1200 || !(var14 < 2100 || var14 >= 2200)) {
					IfType var41;
					if (var14 < 2000) {
						var41 = var29 ? Statics.field1468 : Statics.field3068;
					} else {
						var4--;
						var41 = Client.method1053(Statics.field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1100) {
						var4 -= 2;
						var41.field2552 = Statics.field3255[var4];
						var41.field2537 = Statics.field3255[var4 + 1];
					} else if (var14 == 1101) {
						var4--;
						int var42 = Statics.field3255[var4];
						int var43 = var42 >> 10 & 0x1F;
						int var44 = var42 & 0x1F;
						int var45 = var42 >> 5 & 0x1F;
						var41.field2453 = (var43 << 19) + (var45 << 11) + (var44 << 3);
					} else if (var14 == 1102) {
						var4--;
						var41.field2451 = Statics.field3255[var4] == 1;
					} else if (var14 == 1103) {
						var4--;
						var41.field2551 = Statics.field3255[var4];
					} else if (var14 == 1104) {
						var4--;
					} else if (var14 == 1105) {
						var4--;
						var41.field2550 = Statics.field3255[var4];
					} else if (var14 == 1106) {
						var4--;
						var41.field2557 = Statics.field3255[var4];
					} else if (var14 == 1107) {
						var4--;
						var41.field2447 = Statics.field3255[var4] == 1;
					} else if (var14 == 1108) {
						var41.field2493 = 1;
						var4--;
						var41.field2479 = Statics.field3255[var4];
					} else if (var14 == 1109) {
						var4 -= 6;
						var41.field2543 = Statics.field3255[var4];
						var41.field2485 = Statics.field3255[var4 + 1];
						var41.field2496 = Statics.field3255[var4 + 2];
						var41.field2463 = Statics.field3255[var4 + 3];
						var41.field2531 = Statics.field3255[var4 + 4];
						var41.field2534 = Statics.field3255[var4 + 5];
					} else if (var14 == 1110) {
						var4--;
						var41.field2465 = Statics.field3255[var4];
					} else if (var14 == 1111) {
						var4--;
						var41.field2507 = Statics.field3255[var4] == 1;
					} else if (var14 == 1112) {
						var8--;
						var41.field2474 = Statics.field2957[var8];
					} else if (var14 == 1113) {
						var4--;
						var41.field2448 = Statics.field3255[var4];
					} else if (var14 == 1114) {
						var4 -= 3;
						var41.field2539 = Statics.field3255[var4];
						var41.field2521 = Statics.field3255[var4 + 1];
						var41.field2538 = Statics.field3255[var4 + 2];
					} else {
						if (var14 != 1115) {
							break;
						}
						var4--;
						var41.field2471 = Statics.field3255[var4] == 1;
					}
				} else if (var14 >= 1200 && var14 < 1300 || var14 >= 2200 && var14 < 2300) {
					IfType var128;
					if (var14 < 2000) {
						var128 = var29 ? Statics.field1468 : Statics.field3068;
					} else {
						var4--;
						var128 = Client.method1053(Statics.field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1200) {
						var4 -= 3;
						int var129 = Statics.field3255[var4];
						int var130 = Statics.field3255[var4 + 2];
						if (var129 == -1) {
							var128.field2493 = 0;
						} else {
							ObjType var131 = ObjType.method760(var129);
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
						var128.field2479 = Statics.field3255[var4];
					} else if (var14 == 1202) {
						var128.field2493 = 3;
						var128.field2479 = Client.field2621.field90.method634();
					} else {
						if (var14 != 1203) {
							break;
						}
						IfType var132 = var29 ? Statics.field3068 : Statics.field1468;
						var128.field2544 = var132.field2495;
					}
				} else if (var14 >= 1300 && var14 < 1400 || var14 >= 2300 && var14 < 2400) {
					IfType var121;
					if (var14 >= 2000) {
						var4--;
						var121 = Client.method1053(Statics.field3255[var4]);
						var14 -= 1000;
					} else {
						var121 = var29 ? Statics.field1468 : Statics.field3068;
					}
					if (var14 >= 1300 && var14 <= 1309 || !(var14 < 1314 || var14 > 1317)) {
						var8--;
						JagString var122 = Statics.field2957[var8];
						Object[] var123 = new Object[var122.method10() + 1];
						for (int var124 = var123.length - 1; var124 >= 1; var124--) {
							if (var122.method6(var124 - 1) == 115) {
								var8--;
								var123[var124] = Statics.field2957[var8];
							} else {
								var4--;
								var123[var124] = Integer.valueOf(Statics.field3255[var4]);
							}
						}
						var4--;
						var123[0] = Integer.valueOf(Statics.field3255[var4]);
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
						int var125 = Statics.field3255[var4] - 1;
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
							var121.field2467[var125] = Statics.field2957[var8];
						} else {
							var8--;
						}
					} else if (var14 == 1311) {
						var4--;
						var121.field2544 = Statics.field3255[var4];
					} else if (var14 == 1312) {
						var4--;
						var121.field2500 = Statics.field3255[var4] == 1;
					} else {
						if (var14 != 1313) {
							break;
						}
						var4--;
					}
				} else if (var14 < 1500) {
					if (var14 == 1400) {
						var4 -= 2;
						int var46 = Statics.field3255[var4 + 1];
						int var47 = Statics.field3255[var4];
						IfType var48 = Client.method1053(var47);
						if (var48.field2519 == null || var48.field2519.length <= var46 || var48.field2519[var46] == null) {
							Statics.field3255[var4++] = 0;
						} else {
							Statics.field3255[var4++] = 1;
							if (var29) {
								Statics.field1468 = var48.field2519[var46];
							} else {
								Statics.field3068 = var48.field2519[var46];
							}
						}
					} else if (var14 == 1401) {
						var4 -= 3;
						int var49 = Statics.field3255[var4];
						int var50 = Statics.field3255[var4 + 2];
						int var51 = Statics.field3255[var4 + 1];
						IfType var52 = Statics.method607(Statics.field2922[var49], var50, true, 0, -1, 0, var51);
						if (var52 == null) {
							Statics.field3255[var4++] = 0;
						} else {
							Statics.field3255[var4++] = 1;
							if (var29) {
								Statics.field1468 = var52;
							} else {
								Statics.field3068 = var52;
							}
						}
					} else {
						if (var14 != 1402) {
							break;
						}
						var4 -= 3;
						IfType var53 = Client.method1053(Statics.field3255[var4]);
						int var54 = Statics.field3255[var4 + 2];
						int var55 = Statics.field3255[var4 + 1];
						IfType var56 = Statics.method607(var53.field2519, var54, true, var53.field2537, var53.field2495, var53.field2552, var55);
						if (var56 == null) {
							Statics.field3255[var4++] = 0;
						} else {
							Statics.field3255[var4++] = 1;
							if (var29) {
								Statics.field1468 = var56;
							} else {
								Statics.field3068 = var56;
							}
						}
					}
				} else if (var14 < 1600) {
					IfType var57 = var29 ? Statics.field1468 : Statics.field3068;
					if (var14 == 1500) {
						Statics.field3255[var4++] = var57.field2462;
					} else if (var14 == 1501) {
						Statics.field3255[var4++] = var57.field2502;
					} else if (var14 == 1502) {
						Statics.field3255[var4++] = var57.field2498;
					} else if (var14 == 1503) {
						Statics.field3255[var4++] = var57.field2449;
					} else if (var14 == 1504) {
						Statics.field3255[var4++] = var57.field2556 ? 1 : 0;
					} else {
						if (var14 != 1505) {
							break;
						}
						Statics.field3255[var4++] = var57.field2454;
					}
				} else if (var14 < 1700) {
					IfType var120 = var29 ? Statics.field1468 : Statics.field3068;
					if (var14 == 1600) {
						Statics.field3255[var4++] = var120.field2552;
					} else {
						if (var14 != 1601) {
							break;
						}
						Statics.field3255[var4++] = var120.field2537;
					}
				} else if (var14 < 2500) {
					if (var14 == 2401) {
						var4 -= 3;
						int var58 = Statics.field3255[var4 + 1];
						int var59 = Statics.field3255[var4];
						int var60 = Statics.field3255[var4 + 2];
						IfType var61 = Statics.method607(Statics.field2922[var59], var60, false, 0, -1, 0, var58);
						if (var61 == null) {
							Statics.field3255[var4++] = -1;
						} else {
							Statics.field3255[var4++] = var61.field2495;
						}
					} else {
						if (var14 != 2402) {
							break;
						}
						var4 -= 3;
						IfType var62 = Client.method1053(Statics.field3255[var4]);
						int var63 = Statics.field3255[var4 + 1];
						int var64 = Statics.field3255[var4 + 2];
						IfType var65 = Statics.method607(Statics.field2922[var62.field2495 >> 16], var64, false, var62.field2537, var62.field2495 & 0xFFFF, var62.field2552, var63);
						if (var65 == null) {
							Statics.field3255[var4++] = -1;
						} else {
							Statics.field3255[var4++] = var65.field2495;
						}
					}
				} else if (var14 < 2600) {
					var4--;
					IfType var119 = Client.method1053(Statics.field3255[var4]);
					if (var14 == 2500) {
						Statics.field3255[var4++] = var119.field2462;
					} else if (var14 == 2501) {
						Statics.field3255[var4++] = var119.field2502;
					} else if (var14 == 2502) {
						Statics.field3255[var4++] = var119.field2498;
					} else if (var14 == 2503) {
						Statics.field3255[var4++] = var119.field2449;
					} else if (var14 == 2504) {
						Statics.field3255[var4++] = var119.field2556 ? 1 : 0;
					} else {
						if (var14 != 2505) {
							break;
						}
						Statics.field3255[var4++] = var119.field2454;
					}
				} else if (var14 < 2700) {
					var4--;
					IfType var66 = Client.method1053(Statics.field3255[var4]);
					if (var14 == 2600) {
						Statics.field3255[var4++] = var66.field2552;
					} else {
						if (var14 != 2601) {
							break;
						}
						Statics.field3255[var4++] = var66.field2537;
					}
				} else {
					if (var14 < 2800) {
						break;
					}
					if (var14 < 3100) {
						if (var14 == 3000) {
							var4--;
							int var67 = Statics.field3255[var4];
							if (Statics.field2998 == -1) {
								Client.method414(0, var67);
								Statics.field2998 = var67;
							}
						} else if (var14 == 3001 || var14 == 3003) {
							var4 -= 2;
							int var68 = Statics.field3255[var4];
							int var69 = Statics.field3255[var4 + 1];
							Client.method673(0, var69, var68);
						} else if (var14 == 3002) {
							IfType var70 = var29 ? Statics.field1468 : Statics.field3068;
							if (Statics.field2998 == -1) {
								Client.method414(var70.field2495 & 0x7FFF, var70.field2454);
								Statics.field2998 = var70.field2495;
							}
						} else {
							if (var14 != 3003) {
								break;
							}
							IfType var71 = var29 ? Statics.field1468 : Statics.field3068;
							var4--;
							int var72 = Statics.field3255[var4];
							Client.method673(var71.field2495 & 0x7FFF, var72, var71.field2454);
						}
					} else if (var14 >= 3200) {
						if (var14 < 3300) {
							if (var14 == 3200) {
								var4 -= 3;
								Statics.method887(Statics.field3255[var4], Statics.field3255[var4 + 1], Statics.field3255[var4 + 2]);
							} else if (var14 == 3201) {
								var4--;
								Statics.method874(Statics.field3255[var4]);
							} else {
								if (var14 != 3202) {
									break;
								}
								var4 -= 2;
								Client.method928(Statics.field3255[var4 + 1], Statics.field3255[var4]);
							}
						} else if (var14 < 3400) {
							if (var14 != 3300) {
								break;
							}
							Statics.field3255[var4++] = Client.loopCycle;
						} else if (var14 >= 4100) {
							if (var14 >= 4200) {
								break;
							}
							if (var14 == 4100) {
								var8--;
								JagString var102 = Statics.field2957[var8];
								var4--;
								int var103 = Statics.field3255[var4];
								Statics.field2957[var8++] = JagString.join(new JagString[]{var102, Statics.method502(var103)});
							} else if (var14 == 4101) {
								var8 -= 2;
								JagString var104 = Statics.field2957[var8 + 1];
								JagString var105 = Statics.field2957[var8];
								Statics.field2957[var8++] = JagString.join(new JagString[]{var105, var104});
							} else if (var14 == 4102) {
								var8--;
								JagString var106 = Statics.field2957[var8];
								var4--;
								int var107 = Statics.field3255[var4];
								Statics.field2957[var8++] = JagString.join(new JagString[]{var106, Statics.method1034(var107)});
							} else if (var14 == 4103) {
								var8--;
								JagString var108 = Statics.field2957[var8];
								Statics.field2957[var8++] = var108.method30();
							} else if (var14 == 4104) {
								var4--;
								int var109 = Statics.field3255[var4];
								long var110 = ((long) var109 + 11745L) * 86400000L;
								field453.setTime(new Date(var110));
								int var112 = field453.get(5);
								int var113 = field453.get(2);
								int var114 = field453.get(1);
								Statics.field2957[var8++] = JagString.join(new JagString[]{Statics.method502(var112), Statics.field1572, Statics.field621[var113], Statics.field1572, Statics.method502(var114)});
							} else if (var14 == 4105) {
								var8 -= 2;
								JagString var115 = Statics.field2957[var8];
								JagString var116 = Statics.field2957[var8 + 1];
								if (Client.field2621.field90 != null && Client.field2621.field90.field1658) {
									Statics.field2957[var8++] = var116;
								} else {
									Statics.field2957[var8++] = var115;
								}
							} else if (var14 == 4106) {
								var4--;
								int var117 = Statics.field3255[var4];
								Statics.field2957[var8++] = Statics.method502(var117);
							} else {
								if (var14 != 4107) {
									break;
								}
								var8 -= 2;
								Statics.field3255[var4++] = Statics.field2957[var8].method35(Statics.field2957[var8 + 1]);
							}
						} else if (var14 == 4000) {
							var4 -= 2;
							int var73 = Statics.field3255[var4];
							int var74 = Statics.field3255[var4 + 1];
							Statics.field3255[var4++] = var73 + var74;
						} else if (var14 == 4001) {
							var4 -= 2;
							int var75 = Statics.field3255[var4 + 1];
							int var76 = Statics.field3255[var4];
							Statics.field3255[var4++] = var76 - var75;
						} else if (var14 == 4002) {
							var4 -= 2;
							int var77 = Statics.field3255[var4 + 1];
							int var78 = Statics.field3255[var4];
							Statics.field3255[var4++] = var77 * var78;
						} else if (var14 == 4003) {
							var4 -= 2;
							int var79 = Statics.field3255[var4];
							int var80 = Statics.field3255[var4 + 1];
							Statics.field3255[var4++] = var79 / var80;
						} else if (var14 == 4004) {
							var4--;
							int var81 = Statics.field3255[var4];
							Statics.field3255[var4++] = (int) (Math.random() * (double) var81);
						} else if (var14 == 4005) {
							var4--;
							int var82 = Statics.field3255[var4];
							Statics.field3255[var4++] = (int) ((double) (var82 + 1) * Math.random());
						} else if (var14 == 4006) {
							var4 -= 5;
							int var83 = Statics.field3255[var4 + 1];
							int var84 = Statics.field3255[var4];
							int var85 = Statics.field3255[var4 + 3];
							int var86 = Statics.field3255[var4 + 4];
							int var87 = Statics.field3255[var4 + 2];
							Statics.field3255[var4++] = var84 + (var83 - var84) * (-var87 + var86) / (var85 - var87);
						} else if (var14 == 4007) {
							var4 -= 2;
							int var88 = Statics.field3255[var4];
							int var89 = Statics.field3255[var4 + 1];
							Statics.field3255[var4++] = var88 * var89 / 100 + var88;
						} else if (var14 == 4008) {
							var4 -= 2;
							int var90 = Statics.field3255[var4];
							int var91 = Statics.field3255[var4 + 1];
							Statics.field3255[var4++] = 0x1 << var91 | var90;
						} else if (var14 == 4009) {
							var4 -= 2;
							int var92 = Statics.field3255[var4];
							int var93 = Statics.field3255[var4 + 1];
							Statics.field3255[var4++] = var92 & -(0x1 << var93) - 1;
						} else if (var14 == 4010) {
							var4 -= 2;
							int var94 = Statics.field3255[var4];
							int var95 = Statics.field3255[var4 + 1];
							Statics.field3255[var4++] = (0x1 << var95 & var94) == 0 ? 0 : 1;
						} else if (var14 == 4011) {
							var4 -= 2;
							int var96 = Statics.field3255[var4 + 1];
							int var97 = Statics.field3255[var4];
							Statics.field3255[var4++] = var97 % var96;
						} else if (var14 == 4012) {
							var4 -= 2;
							int var98 = Statics.field3255[var4];
							int var99 = Statics.field3255[var4 + 1];
							if (var98 == 0) {
								Statics.field3255[var4++] = 0;
							} else {
								Statics.field3255[var4++] = (int) Math.pow((double) var98, (double) var99);
							}
						} else {
							if (var14 != 4013) {
								break;
							}
							var4 -= 2;
							int var100 = Statics.field3255[var4];
							int var101 = Statics.field3255[var4 + 1];
							if (var100 == 0) {
								Statics.field3255[var4++] = 0;
							} else if (var101 == 0) {
								Statics.field3255[var4++] = Integer.MAX_VALUE;
							} else {
								Statics.field3255[var4++] = (int) Math.pow((double) var100, 1.0D / (double) var101);
							}
						}
					} else if (var14 == 3100) {
						var8--;
						JagString var118 = Statics.field2957[var8];
						Statics.method758(0, var118, Statics.field2585);
					} else {
						if (var14 != 3101) {
							break;
						}
						var4 -= 2;
						Client.method450(Statics.field3255[var4], Statics.field3255[var4 + 1], Client.field2621);
					}
				}
			}
		} catch (Exception var133) {
		}
	}
}
