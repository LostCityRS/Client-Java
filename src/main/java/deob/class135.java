package deob;

import java.util.Date;

@ObfuscatedName("md")
public final class class135 extends class23 {

	@ObfuscatedName("md.ab")
	public static class174 field2514;

	@ObfuscatedName("md.eb")
	public static final class88 field2518 = class208.method1423(105, "Ihr Spielkonto wird bereits benutzt)3");

	@ObfuscatedName("md.gb")
	public int field2520;

	@ObfuscatedName("md.ib")
	public int field2522;

	@ObfuscatedName("md.S")
	public static int field2506 = -1;

	@ObfuscatedName("md.U")
	public static final int[] field2508 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

	@ObfuscatedName("md.R")
	public int field2505;

	@ObfuscatedName("md.Y")
	public static int field2512;

	@ObfuscatedName("md.W")
	public static int[] field2510;

	@ObfuscatedName("md.X")
	public static int[][][] field2511;

	@ObfuscatedName("md.a(Lcg;IIIIII)Lcg;")
	public static class30 method897(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg3;
		class30 var8 = (class30) class108.field1956.method135(var6);
		if (var8 == null) {
			class82 var9 = class82.method568(class233.field4365, arg3);
			if (var9 == null) {
				return null;
			}
			var8 = var9.method546(64, 768, -50, -10, -50);
			class108.field1956.method130(var6, var8);
		}
		int var10 = arg0.method194();
		int var11 = arg0.method196();
		int var12 = arg0.method186();
		int var13 = arg0.method198();
		class30 var14 = var8.method185(true, true);
		if (arg4 != 0) {
			var14.method188(arg4);
		}
		class125 var15 = (class125) var14;
		if (arg5 != class239.method1584(var10 + arg2, arg1 + var12, class149.field2907) || class239.method1584(var11 + arg2, var13 + arg1, class149.field2907) != arg5) {
			for (int var16 = 0; var16 < var15.field2271; var16++) {
				var15.field2286[var16] += class239.method1584(arg2 + var15.field2264[var16], var15.field2287[var16] - -arg1, class149.field2907) - arg5;
			}
			var15.field2258 = false;
		}
		return var14;
	}

	@ObfuscatedName("md.a(Lnb;I)V")
	public static void method898(class144 arg0) {
		class31.field506 = arg0;
	}

	@ObfuscatedName("md.a(IJ)V")
	public static void method900(long arg0) {
		if (arg0 != 0L) {
			class146.field2747.method30(58);
			class146.field2747.method328(arg0);
		}
	}

	@ObfuscatedName("md.a(BLi;)Z")
	public static boolean method901(class88 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < class146.field2729; var1++) {
			if (arg0.method624(class23.field370[var1])) {
				return true;
			}
		}
		return arg0.method624(class240.field4456.field766);
	}

	@ObfuscatedName("md.a(BLde;I)V")
	public static void method902(class39 arg0, int arg1) {
		Object[] var2 = arg0.field681;
		int var3 = (Integer) var2[0];
		class247 var4 = class59.method427(var3);
		if (var4 == null) {
			return;
		}
		int var5 = 0;
		int var6 = 0;
		class230.field4318 = 0;
		int var7 = -1;
		int[] var8 = var4.field4521;
		byte var9 = -1;
		int[] var10 = var4.field4519;
		try {
			class242.field4477 = new int[var4.field4526];
			class153.field2963 = new class88[var4.field4517];
			int var11 = 0;
			int var12 = 0;
			for (int var13 = 1; var13 < var2.length; var13++) {
				if (var2[var13] instanceof Integer) {
					int var14 = (Integer) var2[var13];
					if (var14 == -2147483647) {
						var14 = arg0.field694;
					}
					if (var14 == -2147483646) {
						var14 = arg0.field691;
					}
					if (var14 == -2147483645) {
						var14 = arg0.field678 == null ? -1 : arg0.field678.field3423;
					}
					if (var14 == -2147483644) {
						var14 = arg0.field679;
					}
					if (var14 == -2147483643) {
						var14 = arg0.field678 == null ? -1 : arg0.field678.field3406;
					}
					if (var14 == -2147483642) {
						var14 = arg0.field676 == null ? -1 : arg0.field676.field3423;
					}
					if (var14 == -2147483641) {
						var14 = arg0.field676 == null ? -1 : arg0.field676.field3406;
					}
					if (var14 == -2147483640) {
						var14 = arg0.field682;
					}
					if (var14 == -2147483639) {
						var14 = arg0.field692;
					}
					class242.field4477[var12++] = var14;
				} else if (var2[var13] instanceof class88) {
					class88 var15 = (class88) var2[var13];
					if (var15.method597(-112, class194.field3707)) {
						var15 = arg0.field677;
					}
					class153.field2963[var11++] = var15;
				}
			}
			int var16 = 0;
			label2550: while (true) {
				var16++;
				if (arg1 < var16) {
					throw new RuntimeException("slow");
				}
				var7++;
				int var382 = var10[var7];
				if (var382 < 100) {
					if (var382 == 0) {
						class108.field1944[var5++] = var8[var7];
						continue;
					}
					if (var382 == 1) {
						int var17 = var8[var7];
						class108.field1944[var5++] = class113.field2050[var17];
						continue;
					}
					if (var382 == 2) {
						int var18 = var8[var7];
						var5--;
						class113.field2050[var18] = class108.field1944[var5];
						continue;
					}
					if (var382 == 3) {
						class171.field3330[var6++] = var4.field4522[var7];
						continue;
					}
					if (var382 == 6) {
						var7 += var8[var7];
						continue;
					}
					if (var382 == 7) {
						var5 -= 2;
						if (class108.field1944[var5] != class108.field1944[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 8) {
						var5 -= 2;
						if (class108.field1944[var5 + 1] == class108.field1944[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 9) {
						var5 -= 2;
						if (class108.field1944[var5 + 1] > class108.field1944[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 10) {
						var5 -= 2;
						if (class108.field1944[var5] > class108.field1944[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 21) {
						if (class230.field4318 == 0) {
							return;
						}
						class141 var19 = class80.field1446[--class230.field4318];
						class153.field2963 = var19.field2604;
						class242.field4477 = var19.field2599;
						var4 = var19.field2605;
						var7 = var19.field2603;
						var8 = var4.field4521;
						var10 = var4.field4519;
						continue;
					}
					if (var382 == 25) {
						int var20 = var8[var7];
						class108.field1944[var5++] = class142.method930(var20);
						continue;
					}
					if (var382 == 27) {
						int var21 = var8[var7];
						var5--;
						class109.method755(var21, class108.field1944[var5]);
						continue;
					}
					if (var382 == 31) {
						var5 -= 2;
						if (class108.field1944[var5 + 1] >= class108.field1944[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 32) {
						var5 -= 2;
						if (class108.field1944[var5] >= class108.field1944[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 33) {
						class108.field1944[var5++] = class242.field4477[var8[var7]];
						continue;
					}
					int var10001;
					if (var382 == 34) {
						var10001 = var8[var7];
						var5--;
						class242.field4477[var10001] = class108.field1944[var5];
						continue;
					}
					if (var382 == 35) {
						class171.field3330[var6++] = class153.field2963[var8[var7]];
						continue;
					}
					if (var382 == 36) {
						var10001 = var8[var7];
						var6--;
						class153.field2963[var10001] = class171.field3330[var6];
						continue;
					}
					if (var382 == 37) {
						int var22 = var8[var7];
						var6 -= var22;
						class88 var23 = class165.method1133(var22, class171.field3330, var6);
						class171.field3330[var6++] = var23;
						continue;
					}
					if (var382 == 38) {
						var5--;
						continue;
					}
					if (var382 == 39) {
						var6--;
						continue;
					}
					if (var382 == 40) {
						int var24 = var8[var7];
						class247 var25 = class59.method427(var24);
						class88[] var26 = new class88[var25.field4517];
						int[] var27 = new int[var25.field4526];
						for (int var28 = 0; var28 < var25.field4520; var28++) {
							var27[var28] = class108.field1944[var28 + var5 - var25.field4520];
						}
						for (int var29 = 0; var29 < var25.field4518; var29++) {
							var26[var29] = class171.field3330[var29 + var6 - var25.field4518];
						}
						var5 -= var25.field4520;
						var6 -= var25.field4518;
						class141 var30 = new class141();
						var30.field2605 = var4;
						var30.field2604 = class153.field2963;
						var30.field2603 = var7;
						var30.field2599 = class242.field4477;
						if (class230.field4318 >= class80.field1446.length) {
							throw new RuntimeException();
						}
						var4 = var25;
						var7 = -1;
						class80.field1446[class230.field4318++] = var30;
						var10 = var25.field4519;
						class242.field4477 = var27;
						var8 = var25.field4521;
						class153.field2963 = var26;
						continue;
					}
					if (var382 == 42) {
						class108.field1944[var5++] = class119.field2167[var8[var7]];
						continue;
					}
					if (var382 == 43) {
						var10001 = var8[var7];
						var5--;
						class119.field2167[var10001] = class108.field1944[var5];
						continue;
					}
					if (var382 == 44) {
						int var31 = var8[var7] >> 16;
						var5--;
						int var32 = class108.field1944[var5];
						int var33 = var8[var7] & 0xFFFF;
						if (var32 >= 0 && var32 <= 5000) {
							class95.field1762[var31] = var32;
							byte var34 = -1;
							if (var33 == 105) {
								var34 = 0;
							}
							int var35 = 0;
							while (true) {
								if (var35 >= var32) {
									continue label2550;
								}
								class16.field247[var31][var35] = var34;
								var35++;
							}
						}
						throw new RuntimeException();
					}
					if (var382 == 45) {
						int var36 = var8[var7];
						var5--;
						int var37 = class108.field1944[var5];
						if (var37 >= 0 && class95.field1762[var36] > var37) {
							class108.field1944[var5++] = class16.field247[var36][var37];
							continue;
						}
						throw new RuntimeException();
					}
					if (var382 == 46) {
						var5 -= 2;
						int var38 = class108.field1944[var5];
						int var39 = var8[var7];
						if (var38 >= 0 && var38 < class95.field1762[var39]) {
							class16.field247[var39][var38] = class108.field1944[var5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (var382 == 47) {
						class88 var40 = class7.field114[var8[var7]];
						if (var40 == null) {
							var40 = class14.field207;
						}
						class171.field3330[var6++] = var40;
						continue;
					}
					if (var382 == 48) {
						var10001 = var8[var7];
						var6--;
						class7.field114[var10001] = class171.field3330[var6];
						continue;
					}
					if (var382 == 51) {
						class154 var41 = var4.field4514[var8[var7]];
						var5--;
						class192 var42 = (class192) var41.method1049((long) class108.field1944[var5]);
						if (var42 != null) {
							var7 += var42.field3698;
						}
						continue;
					}
				}
				boolean var43;
				if (var8[var7] == 1) {
					var43 = true;
				} else {
					var43 = false;
				}
				if (var382 < 300) {
					if (var382 == 100) {
						var5 -= 3;
						int var44 = class108.field1944[var5];
						int var45 = class108.field1944[var5 + 1];
						int var46 = class108.field1944[var5 + 2];
						if (var45 == 0) {
							throw new RuntimeException();
						}
						class174 var47 = class239.method1579(var44);
						if (var47.field3465 == null) {
							var47.field3465 = new class174[var46 + 1];
						}
						if (var46 >= var47.field3465.length) {
							class174[] var48 = new class174[var46 + 1];
							for (int var49 = 0; var49 < var47.field3465.length; var49++) {
								var48[var49] = var47.field3465[var49];
							}
							var47.field3465 = var48;
						}
						if (var46 > 0 && var47.field3465[var46 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var46 - 1));
						}
						class174 var50 = new class174();
						var50.field3410 = true;
						var50.field3406 = var46;
						var50.field3390 = var45;
						var50.field3504 = var50.field3423 = var47.field3423;
						var47.field3465[var46] = var50;
						if (var43) {
							class203.field3871 = var50;
						} else {
							class129.field2426 = var50;
						}
						class200.method1371(var47);
						continue;
					}
					if (var382 == 101) {
						class174 var51 = var43 ? class203.field3871 : class129.field2426;
						if (var51.field3406 == -1) {
							if (var43) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						class174 var52 = class239.method1579(var51.field3423);
						var52.field3465[var51.field3406] = null;
						class200.method1371(var52);
						continue;
					}
					if (var382 == 102) {
						var5--;
						class174 var53 = class239.method1579(class108.field1944[var5]);
						var53.field3465 = null;
						class200.method1371(var53);
						continue;
					}
					if (var382 == 200) {
						var5 -= 2;
						int var54 = class108.field1944[var5 + 1];
						int var55 = class108.field1944[var5];
						class174 var56 = class36.method238(var54, var55);
						if (var56 != null && var54 != -1) {
							class108.field1944[var5++] = 1;
							if (var43) {
								class203.field3871 = var56;
							} else {
								class129.field2426 = var56;
							}
							continue;
						}
						class108.field1944[var5++] = 0;
						continue;
					}
					if (var382 == 201) {
						var5--;
						int var57 = class108.field1944[var5];
						class174 var58 = class239.method1579(var57);
						if (var58 == null) {
							class108.field1944[var5++] = 0;
						} else {
							class108.field1944[var5++] = 1;
							if (var43) {
								class203.field3871 = var58;
							} else {
								class129.field2426 = var58;
							}
						}
						continue;
					}
				} else if (var382 < 500) {
					if (var382 == 403) {
						var5 -= 2;
						int var372 = class108.field1944[var5];
						if (var372 >= 7) {
							var372 -= 7;
						}
						int var373 = class108.field1944[var5 + 1];
						class240.field4456.field768.method1435(var372, var373);
						continue;
					}
					if (var382 == 404) {
						var5 -= 2;
						int var374 = class108.field1944[var5 + 1];
						int var375 = class108.field1944[var5];
						class240.field4456.field768.method1432(var374, var375);
						continue;
					}
					if (var382 == 410) {
						var5--;
						boolean var376 = class108.field1944[var5] != 0;
						class240.field4456.field768.method1434(var376);
						continue;
					}
				} else if (var382 >= 1000 && var382 < 1100 || !(var382 < 2000 || var382 >= 2100)) {
					class174 var368;
					if (var382 < 2000) {
						var368 = var43 ? class203.field3871 : class129.field2426;
					} else {
						var382 -= 1000;
						var5--;
						var368 = class239.method1579(class108.field1944[var5]);
					}
					if (var382 == 1000) {
						var368.field3367 = 0;
						var5 -= 2;
						var368.field3366 = var368.field3391 = class108.field1944[var5];
						var368.field3451 = 0;
						var368.field3441 = var368.field3514 = class108.field1944[var5 + 1];
						class200.method1371(var368);
						continue;
					}
					if (var382 == 1001) {
						var368.field3463 = 0;
						var5 -= 2;
						var368.field3380 = var368.field3501 = class108.field1944[var5];
						var368.field3468 = 0;
						var368.field3394 = 0;
						var368.field3422 = var368.field3418 = class108.field1944[var5 + 1];
						var368.field3417 = 0;
						class200.method1371(var368);
						if (var368.field3390 == 0) {
							class110.method759(false, var368);
						}
						class2.method10(var368);
						continue;
					}
					if (var382 == 1003) {
						var5--;
						boolean var369 = class108.field1944[var5] == 1;
						if (var368.field3378 != var369) {
							var368.field3378 = var369;
							class200.method1371(var368);
						}
						continue;
					}
					if (var382 == 1004) {
						var5 -= 4;
						var368.field3391 = class108.field1944[var5];
						var368.field3514 = class108.field1944[var5 + 1];
						int var370 = class108.field1944[var5 + 2];
						int var371 = class108.field1944[var5 + 3];
						if (var371 < 0) {
							var371 = 0;
						} else if (var371 > 2) {
							var371 = 2;
						}
						var368.field3451 = (byte) (var371 + 3);
						if (var370 < 0) {
							var370 = 0;
						} else if (var370 > 2) {
							var370 = 2;
						}
						var368.field3367 = (byte) (var370 + 3);
						class200.method1371(var368);
						class2.method10(var368);
						continue;
					}
					if (var382 == 1005) {
						var368.field3367 = 2;
						var5 -= 2;
						var368.field3391 = class108.field1944[var5];
						var368.field3451 = 2;
						var368.field3514 = class108.field1944[var5 + 1];
						class200.method1371(var368);
						if (var368.field3390 == 0) {
							class110.method759(false, var368);
						}
						class2.method10(var368);
						continue;
					}
				} else if (var382 >= 1100 && var382 < 1200 || !(var382 < 2100 || var382 >= 2200)) {
					class174 var365;
					if (var382 >= 2000) {
						var5--;
						var365 = class239.method1579(class108.field1944[var5]);
						var382 -= 1000;
					} else {
						var365 = var43 ? class203.field3871 : class129.field2426;
					}
					if (var382 == 1100) {
						var5 -= 2;
						var365.field3393 = class108.field1944[var5];
						if (var365.field3384 - var365.field3380 < var365.field3393) {
							var365.field3393 = var365.field3384 - var365.field3380;
						}
						if (var365.field3393 < 0) {
							var365.field3393 = 0;
						}
						var365.field3415 = class108.field1944[var5 + 1];
						if (var365.field3415 > var365.field3375 - var365.field3422) {
							var365.field3415 = var365.field3375 - var365.field3422;
						}
						if (var365.field3415 < 0) {
							var365.field3415 = 0;
						}
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1101) {
						var5--;
						var365.field3414 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1102) {
						var5--;
						var365.field3496 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1103) {
						var5--;
						var365.field3480 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1104) {
						var5--;
						var365.field3497 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1105) {
						var5--;
						var365.field3473 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1106) {
						var5--;
						var365.field3437 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1107) {
						var5--;
						var365.field3420 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1108) {
						var365.field3430 = 1;
						var5--;
						var365.field3409 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1109) {
						var5 -= 6;
						var365.field3365 = class108.field1944[var5];
						var365.field3498 = class108.field1944[var5 + 1];
						var365.field3455 = class108.field1944[var5 + 2];
						var365.field3509 = class108.field1944[var5 + 3];
						var365.field3517 = class108.field1944[var5 + 4];
						var365.field3485 = class108.field1944[var5 + 5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1110) {
						var5--;
						int var366 = class108.field1944[var5];
						if (var365.field3404 != var366) {
							var365.field3487 = 0;
							var365.field3404 = var366;
							var365.field3379 = 0;
							class200.method1371(var365);
						}
						continue;
					}
					if (var382 == 1111) {
						var5--;
						var365.field3403 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1112) {
						var6--;
						class88 var367 = class171.field3330[var6];
						if (!var367.method597(-110, var365.field3383)) {
							var365.field3383 = var367;
							class200.method1371(var365);
						}
						continue;
					}
					if (var382 == 1113) {
						var5--;
						var365.field3461 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1114) {
						var5 -= 3;
						var365.field3479 = class108.field1944[var5];
						var365.field3469 = class108.field1944[var5 + 1];
						var365.field3396 = class108.field1944[var5 + 2];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1115) {
						var5--;
						var365.field3435 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1116) {
						var5--;
						var365.field3429 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1117) {
						var5--;
						var365.field3425 = class108.field1944[var5];
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1118) {
						var5--;
						var365.field3387 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1119) {
						var5--;
						var365.field3483 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
					if (var382 == 1120) {
						var5 -= 2;
						var365.field3384 = class108.field1944[var5];
						var365.field3375 = class108.field1944[var5 + 1];
						class200.method1371(var365);
						if (var365.field3390 == 0) {
							class110.method759(false, var365);
						}
						continue;
					}
					if (var382 == 1121) {
						class200.method1371(var365);
						var5--;
						continue;
					}
					if (var382 == 1122) {
						var5--;
						var365.field3477 = class108.field1944[var5] == 1;
						class200.method1371(var365);
						continue;
					}
				} else if (var382 >= 1200 && var382 < 1300 || var382 >= 2200 && var382 < 2300) {
					class174 var59;
					if (var382 >= 2000) {
						var382 -= 1000;
						var5--;
						var59 = class239.method1579(class108.field1944[var5]);
					} else {
						var59 = var43 ? class203.field3871 : class129.field2426;
					}
					class200.method1371(var59);
					if (var382 == 1200 || var382 == 1205) {
						var5 -= 2;
						int var60 = class108.field1944[var5 + 1];
						int var61 = class108.field1944[var5];
						if (var61 == -1) {
							var59.field3399 = -1;
							var59.field3409 = -1;
							var59.field3430 = 1;
						} else {
							var59.field3399 = var61;
							var59.field3482 = var60;
							class149 var62 = class71.method472(var61);
							var59.field3365 = var62.field2876;
							var59.field3509 = var62.field2872;
							var59.field3498 = var62.field2870;
							if (var382 == 1205) {
								var59.field3464 = false;
							} else {
								var59.field3464 = true;
							}
							var59.field3455 = var62.field2873;
							var59.field3517 = var62.field2847;
							var59.field3485 = var62.field2889;
							if (var59.field3468 > 0) {
								var59.field3485 = var59.field3485 * 32 / var59.field3468;
							} else if (var59.field3501 > 0) {
								var59.field3485 = var59.field3485 * 32 / var59.field3501;
							}
						}
						continue;
					}
					if (var382 == 1201) {
						var59.field3430 = 2;
						var5--;
						var59.field3409 = class108.field1944[var5];
						continue;
					}
					if (var382 == 1202) {
						var59.field3430 = 3;
						var59.field3409 = class240.field4456.field768.method1427();
						continue;
					}
					if (var382 == 1203) {
						var59.field3430 = 6;
						var5--;
						var59.field3409 = class108.field1944[var5];
						continue;
					}
					if (var382 == 1204) {
						var59.field3430 = 5;
						var5--;
						var59.field3409 = class108.field1944[var5];
						continue;
					}
				} else if ((var382 < 1300 || var382 >= 1400) && (var382 < 2300 || var382 >= 2400)) {
					if (var382 >= 1400 && var382 < 1500 || var382 >= 2400 && var382 < 2500) {
						int[] var63 = null;
						class174 var64;
						if (var382 < 2000) {
							var64 = var43 ? class203.field3871 : class129.field2426;
						} else {
							var5--;
							var64 = class239.method1579(class108.field1944[var5]);
							var382 -= 1000;
						}
						var6--;
						class88 var65 = class171.field3330[var6];
						if (var65.method604() > 0 && var65.method599(var65.method604() - 1) == 89) {
							var5--;
							int var66 = class108.field1944[var5];
							if (var66 > 0) {
								var63 = new int[var66];
								while (var66-- > 0) {
									var5--;
									var63[var66] = class108.field1944[var5];
								}
							}
							var65 = var65.method623(0, var65.method604() - 1);
						}
						Object[] var67 = new Object[var65.method604() + 1];
						for (int var68 = var67.length - 1; var68 >= 1; var68--) {
							if (var65.method599(var68 - 1) == 115) {
								var6--;
								var67[var68] = class171.field3330[var6];
							} else {
								var5--;
								var67[var68] = Integer.valueOf(class108.field1944[var5]);
							}
						}
						var5--;
						int var69 = class108.field1944[var5];
						if (var69 == -1) {
							var67 = null;
						} else {
							var67[0] = Integer.valueOf(var69);
						}
						if (var382 == 1417) {
							var64.field3471 = var67;
						}
						if (var382 == 1403) {
							var64.field3370 = var67;
						}
						if (var382 == 1421) {
							var64.field3381 = var67;
						}
						if (var382 == 1407) {
							var64.field3481 = var67;
							var64.field3450 = var63;
						}
						if (var382 == 1408) {
							var64.field3458 = var67;
						}
						if (var382 == 1412) {
							var64.field3510 = var67;
						}
						if (var382 == 1418) {
							var64.field3518 = var67;
						}
						if (var382 == 1405) {
							var64.field3456 = var67;
						}
						if (var382 == 1402) {
							var64.field3408 = var67;
						}
						if (var382 == 1420) {
							var64.field3484 = var67;
						}
						if (var382 == 1400) {
							var64.field3490 = var67;
						}
						if (var382 == 1425) {
							var64.field3505 = var67;
						}
						if (var382 == 1404) {
							var64.field3448 = var67;
						}
						if (var382 == 1427) {
							var64.field3426 = var67;
						}
						if (var382 == 1423) {
							var64.field3434 = var67;
						}
						if (var382 == 1401) {
							var64.field3503 = var67;
						}
						if (var382 == 1422) {
							var64.field3444 = var67;
						}
						if (var382 == 1409) {
							var64.field3401 = var67;
						}
						if (var382 == 1419) {
							var64.field3377 = var67;
						}
						if (var382 == 1414) {
							var64.field3443 = var67;
							var64.field3369 = var63;
						}
						if (var382 == 1406) {
							var64.field3440 = var67;
						}
						var64.field3449 = true;
						if (var382 == 1411) {
							var64.field3452 = var67;
						}
						if (var382 == 1415) {
							var64.field3398 = var63;
							var64.field3454 = var67;
						}
						if (var382 == 1416) {
							var64.field3447 = var67;
						}
						if (var382 == 1424) {
							var64.field3495 = var67;
						}
						if (var382 == 1410) {
							var64.field3412 = var67;
						}
						continue;
					}
					if (var382 < 1600) {
						class174 var70 = var43 ? class203.field3871 : class129.field2426;
						if (var382 == 1500) {
							class108.field1944[var5++] = var70.field3366;
							continue;
						}
						if (var382 == 1501) {
							class108.field1944[var5++] = var70.field3441;
							continue;
						}
						if (var382 == 1502) {
							class108.field1944[var5++] = var70.field3380;
							continue;
						}
						if (var382 == 1503) {
							class108.field1944[var5++] = var70.field3422;
							continue;
						}
						if (var382 == 1504) {
							class108.field1944[var5++] = var70.field3378 ? 1 : 0;
							continue;
						}
						if (var382 == 1505) {
							class108.field1944[var5++] = var70.field3504;
							continue;
						}
					} else if (var382 < 1700) {
						class174 var71 = var43 ? class203.field3871 : class129.field2426;
						if (var382 == 1600) {
							class108.field1944[var5++] = var71.field3393;
							continue;
						}
						if (var382 == 1601) {
							class108.field1944[var5++] = var71.field3415;
							continue;
						}
						if (var382 == 1602) {
							class171.field3330[var6++] = var71.field3383;
							continue;
						}
						if (var382 == 1603) {
							class108.field1944[var5++] = var71.field3384;
							continue;
						}
						if (var382 == 1604) {
							class108.field1944[var5++] = var71.field3375;
							continue;
						}
						if (var382 == 1605) {
							class108.field1944[var5++] = var71.field3485;
							continue;
						}
						if (var382 == 1606) {
							class108.field1944[var5++] = var71.field3455;
							continue;
						}
						if (var382 == 1607) {
							class108.field1944[var5++] = var71.field3517;
							continue;
						}
						if (var382 == 1608) {
							class108.field1944[var5++] = var71.field3509;
							continue;
						}
						if (var382 == 1609) {
							class108.field1944[var5++] = var71.field3480;
							continue;
						}
					} else if (var382 < 1800) {
						class174 var72 = var43 ? class203.field3871 : class129.field2426;
						if (var382 == 1700) {
							class108.field1944[var5++] = var72.field3399;
							continue;
						}
						if (var382 == 1701) {
							if (var72.field3399 == -1) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = var72.field3482;
							}
							continue;
						}
						if (var382 == 1702) {
							class108.field1944[var5++] = var72.field3406;
							continue;
						}
					} else if (var382 < 1900) {
						class174 var73 = var43 ? class203.field3871 : class129.field2426;
						if (var382 == 1800) {
							class108.field1944[var5++] = class87.method592(class80.method530(var73));
							continue;
						}
						if (var382 == 1801) {
							var5--;
							int var74 = class108.field1944[var5];
							int var383 = var74 - 1;
							if (var73.field3373 != null && var73.field3373.length > var383 && var73.field3373[var383] != null) {
								class171.field3330[var6++] = var73.field3373[var383];
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 1802) {
							if (var73.field3457 == null) {
								class171.field3330[var6++] = class81.field1468;
							} else {
								class171.field3330[var6++] = var73.field3457;
							}
							continue;
						}
					} else if (var382 < 2600) {
						var5--;
						class174 var75 = class239.method1579(class108.field1944[var5]);
						if (var382 == 2500) {
							class108.field1944[var5++] = var75.field3366;
							continue;
						}
						if (var382 == 2501) {
							class108.field1944[var5++] = var75.field3441;
							continue;
						}
						if (var382 == 2502) {
							class108.field1944[var5++] = var75.field3380;
							continue;
						}
						if (var382 == 2503) {
							class108.field1944[var5++] = var75.field3422;
							continue;
						}
						if (var382 == 2504) {
							class108.field1944[var5++] = var75.field3378 ? 1 : 0;
							continue;
						}
						if (var382 == 2505) {
							class108.field1944[var5++] = var75.field3504;
							continue;
						}
					} else if (var382 < 2700) {
						var5--;
						class174 var76 = class239.method1579(class108.field1944[var5]);
						if (var382 == 2600) {
							class108.field1944[var5++] = var76.field3393;
							continue;
						}
						if (var382 == 2601) {
							class108.field1944[var5++] = var76.field3415;
							continue;
						}
						if (var382 == 2602) {
							class171.field3330[var6++] = var76.field3383;
							continue;
						}
						if (var382 == 2603) {
							class108.field1944[var5++] = var76.field3384;
							continue;
						}
						if (var382 == 2604) {
							class108.field1944[var5++] = var76.field3375;
							continue;
						}
						if (var382 == 2605) {
							class108.field1944[var5++] = var76.field3485;
							continue;
						}
						if (var382 == 2606) {
							class108.field1944[var5++] = var76.field3455;
							continue;
						}
						if (var382 == 2607) {
							class108.field1944[var5++] = var76.field3517;
							continue;
						}
						if (var382 == 2608) {
							class108.field1944[var5++] = var76.field3509;
							continue;
						}
						if (var382 == 2609) {
							class108.field1944[var5++] = var76.field3480;
							continue;
						}
					} else if (var382 < 2800) {
						if (var382 == 2700) {
							var5--;
							class174 var351 = class239.method1579(class108.field1944[var5]);
							class108.field1944[var5++] = var351.field3399;
							continue;
						}
						if (var382 == 2701) {
							var5--;
							class174 var352 = class239.method1579(class108.field1944[var5]);
							if (var352.field3399 == -1) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = var352.field3482;
							}
							continue;
						}
						if (var382 == 2702) {
							var5--;
							int var353 = class108.field1944[var5];
							class168 var354 = (class168) class128.field2395.method1049((long) var353);
							if (var354 == null) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = 1;
							}
							continue;
						}
						if (var382 == 2703) {
							var5--;
							class174 var355 = class239.method1579(class108.field1944[var5]);
							if (var355.field3465 == null) {
								class108.field1944[var5++] = 0;
								continue;
							}
							int var356 = var355.field3465.length;
							for (int var357 = 0; var357 < var355.field3465.length; var357++) {
								if (var355.field3465[var357] == null) {
									var356 = var357;
									break;
								}
							}
							class108.field1944[var5++] = var356;
							continue;
						}
						if (var382 == 2704 || var382 == 2705) {
							var5 -= 2;
							int var358 = class108.field1944[var5];
							int var359 = class108.field1944[var5 + 1];
							class168 var360 = (class168) class128.field2395.method1049((long) var358);
							if (var360 != null && var360.field3229 == var359) {
								class108.field1944[var5++] = 1;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
					} else if (var382 < 2900) {
						var5--;
						class174 var77 = class239.method1579(class108.field1944[var5]);
						if (var382 == 2800) {
							class108.field1944[var5++] = class87.method592(class80.method530(var77));
							continue;
						}
						if (var382 == 2801) {
							var5--;
							int var78 = class108.field1944[var5];
							int var384 = var78 - 1;
							if (var77.field3373 != null && var77.field3373.length > var384 && var77.field3373[var384] != null) {
								class171.field3330[var6++] = var77.field3373[var384];
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 2802) {
							if (var77.field3457 == null) {
								class171.field3330[var6++] = class81.field1468;
							} else {
								class171.field3330[var6++] = var77.field3457;
							}
							continue;
						}
					} else if (var382 < 3200) {
						if (var382 == 3100) {
							var6--;
							class88 var336 = class171.field3330[var6];
							class223.method1499(var336, 0, class81.field1468);
							continue;
						}
						if (var382 == 3101) {
							var5 -= 2;
							class226.method1515(class108.field1944[var5], class108.field1944[var5 + 1], class240.field4456);
							continue;
						}
						if (var382 == 3103) {
							class29.method174();
							continue;
						}
						if (var382 == 3104) {
							var6--;
							class88 var337 = class171.field3330[var6];
							int var338 = 0;
							if (var337.method621()) {
								var338 = var337.method603();
							}
							class146.field2747.method30(152);
							class146.field2747.method338(var338);
							continue;
						}
						if (var382 == 3105) {
							var6--;
							class88 var339 = class171.field3330[var6];
							class146.field2747.method30(54);
							class146.field2747.method328(var339.method630());
							continue;
						}
						if (var382 == 3106) {
							var6--;
							class88 var340 = class171.field3330[var6];
							class146.field2747.method30(60);
							class146.field2747.method346(var340.method604() + 1);
							class146.field2747.method336(var340);
							continue;
						}
						if (var382 == 3107) {
							var5--;
							int var341 = class108.field1944[var5];
							var6--;
							class88 var342 = class171.field3330[var6];
							class17.method82(var342, var341);
							continue;
						}
						if (var382 == 3108) {
							var5 -= 3;
							int var343 = class108.field1944[var5];
							int var344 = class108.field1944[var5 + 1];
							int var345 = class108.field1944[var5 + 2];
							class174 var346 = class239.method1579(var345);
							class80.method532(var343, var344, var346);
							continue;
						}
						if (var382 == 3109) {
							var5 -= 2;
							int var347 = class108.field1944[var5];
							int var348 = class108.field1944[var5 + 1];
							class174 var349 = var43 ? class203.field3871 : class129.field2426;
							class80.method532(var347, var348, var349);
							continue;
						}
						if (var382 == 3110) {
							var5--;
							int var350 = class108.field1944[var5];
							class146.field2747.method30(194);
							class146.field2747.method305(var350);
							continue;
						}
					} else if (var382 < 3300) {
						if (var382 == 3200) {
							var5 -= 3;
							class92.method668(class108.field1944[var5 + 1], class108.field1944[var5 + 2], class108.field1944[var5]);
							continue;
						}
						if (var382 == 3201) {
							var5--;
							class116.method788(class108.field1944[var5]);
							continue;
						}
						if (var382 == 3202) {
							var5 -= 2;
							class4.method23(class108.field1944[var5], class108.field1944[var5 + 1]);
							continue;
						}
					} else if (var382 < 3400) {
						if (var382 == 3300) {
							class108.field1944[var5++] = class117.field2113;
							continue;
						}
						if (var382 == 3301) {
							var5 -= 2;
							int var314 = class108.field1944[var5 + 1];
							int var315 = class108.field1944[var5];
							class108.field1944[var5++] = class39.method255(var314, var315);
							continue;
						}
						if (var382 == 3302) {
							var5 -= 2;
							int var316 = class108.field1944[var5];
							int var317 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = class109.method747(var316, var317);
							continue;
						}
						if (var382 == 3303) {
							var5 -= 2;
							int var318 = class108.field1944[var5 + 1];
							int var319 = class108.field1944[var5];
							class108.field1944[var5++] = class246.method1608(var319, var318);
							continue;
						}
						if (var382 == 3304) {
							var5--;
							int var320 = class108.field1944[var5];
							class108.field1944[var5++] = class67.method458(var320).field2067;
							continue;
						}
						if (var382 == 3305) {
							var5--;
							int var321 = class108.field1944[var5];
							class108.field1944[var5++] = class105.field1907[var321];
							continue;
						}
						if (var382 == 3306) {
							var5--;
							int var322 = class108.field1944[var5];
							class108.field1944[var5++] = class217.field4066[var322];
							continue;
						}
						if (var382 == 3307) {
							var5--;
							int var323 = class108.field1944[var5];
							class108.field1944[var5++] = class179.field3562[var323];
							continue;
						}
						if (var382 == 3308) {
							int var324 = class149.field2907;
							int var325 = (class240.field4456.field4121 >> 7) + class190.field3679;
							int var326 = class223.field4212 + (class240.field4456.field4136 >> 7);
							class108.field1944[var5++] = var325 + (var326 << 14) + (var324 << 28);
							continue;
						}
						if (var382 == 3309) {
							var5--;
							int var327 = class108.field1944[var5];
							class108.field1944[var5++] = var327 >> 14 & 0x3FFF;
							continue;
						}
						if (var382 == 3310) {
							var5--;
							int var328 = class108.field1944[var5];
							class108.field1944[var5++] = var328 >> 28;
							continue;
						}
						if (var382 == 3311) {
							var5--;
							int var329 = class108.field1944[var5];
							class108.field1944[var5++] = var329 & 0x3FFF;
							continue;
						}
						if (var382 == 3312) {
							class108.field1944[var5++] = class67.field1215 ? 1 : 0;
							continue;
						}
						if (var382 == 3313) {
							var5 -= 2;
							int var330 = class108.field1944[var5 + 1];
							int var331 = class108.field1944[var5] + 32768;
							class108.field1944[var5++] = class39.method255(var330, var331);
							continue;
						}
						if (var382 == 3314) {
							var5 -= 2;
							int var332 = class108.field1944[var5] + 32768;
							int var333 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = class109.method747(var332, var333);
							continue;
						}
						if (var382 == 3315) {
							var5 -= 2;
							int var334 = class108.field1944[var5] + 32768;
							int var335 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = class246.method1608(var334, var335);
							continue;
						}
						if (var382 == 3316) {
							if (class67.field1208 < 2) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = class67.field1208;
							}
							continue;
						}
						if (var382 == 3317) {
							class108.field1944[var5++] = class114.field2061;
							continue;
						}
						if (var382 == 3318) {
							class108.field1944[var5++] = class28.field470;
							continue;
						}
						if (var382 == 3321) {
							class108.field1944[var5++] = class240.field4458;
							continue;
						}
						if (var382 == 3322) {
							class108.field1944[var5++] = class199.field3788;
							continue;
						}
						if (var382 == 3323) {
							if (class29.field479 >= 5 && class29.field479 <= 9) {
								class108.field1944[var5++] = 1;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3324) {
							if (class29.field479 >= 5 && class29.field479 <= 9) {
								class108.field1944[var5++] = class29.field479;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3325) {
							if (class6.field72 > 0) {
								class108.field1944[var5++] = 1;
							} else {
								class108.field1944[var5++] = 0;
							}
							continue;
						}
						if (var382 == 3326) {
							class108.field1944[var5++] = class240.field4456.field747;
							continue;
						}
						if (var382 == 3327) {
							class108.field1944[var5++] = class240.field4456.field768.field3957 ? 1 : 0;
							continue;
						}
						if (var382 == 3328) {
							class108.field1944[var5++] = class238.field4428;
							continue;
						}
						if (var382 == 3329) {
							class108.field1944[var5++] = class176.field3535;
							continue;
						}
					} else if (var382 < 3500) {
						if (var382 == 3400) {
							var5 -= 2;
							int var306 = class108.field1944[var5];
							int var307 = class108.field1944[var5 + 1];
							class47 var308 = class167.method1148(var306);
							class171.field3330[var6++] = var308.method360(var307);
							continue;
						}
						if (var382 == 3408) {
							var5 -= 4;
							int var309 = class108.field1944[var5 + 1];
							int var310 = class108.field1944[var5 + 2];
							int var311 = class108.field1944[var5 + 3];
							int var312 = class108.field1944[var5];
							class47 var313 = class167.method1148(var310);
							if (var312 == var313.field873 && var309 == var313.field882) {
								if (var309 == 115) {
									class171.field3330[var6++] = var313.method360(var311);
								} else {
									class108.field1944[var5++] = var313.method356(var311);
								}
								continue;
							}
							if (var309 == 115) {
								class171.field3330[var6++] = class14.field207;
							} else {
								class108.field1944[var5++] = 0;
							}
							continue;
						}
					} else if (var382 < 3700) {
						if (var382 == 3600) {
							if (class115.field2078 == 0) {
								class108.field1944[var5++] = -2;
							} else if (class115.field2078 == 1) {
								class108.field1944[var5++] = -1;
							} else {
								class108.field1944[var5++] = class146.field2729;
							}
							continue;
						}
						if (var382 == 3601) {
							var5--;
							int var79 = class108.field1944[var5];
							if (class115.field2078 == 2 && var79 < class146.field2729) {
								class171.field3330[var6++] = class23.field370[var79];
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 3602) {
							var5--;
							int var80 = class108.field1944[var5];
							if (class115.field2078 == 2 && var80 < class146.field2729) {
								class108.field1944[var5++] = class160.field3092[var80];
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3603) {
							var5--;
							int var81 = class108.field1944[var5];
							if (class115.field2078 == 2 && var81 < class146.field2729) {
								class108.field1944[var5++] = class46.field845[var81];
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3604) {
							var6--;
							class88 var82 = class171.field3330[var6];
							var5--;
							int var83 = class108.field1944[var5];
							class171.method1213(var82, var83);
							continue;
						}
						if (var382 == 3605) {
							var6--;
							class88 var84 = class171.field3330[var6];
							class12.method64(var84.method630());
							continue;
						}
						if (var382 == 3606) {
							var6--;
							class88 var85 = class171.field3330[var6];
							class114.method777(var85.method630());
							continue;
						}
						if (var382 == 3607) {
							var6--;
							class88 var86 = class171.field3330[var6];
							class11.method55(var86.method630());
							continue;
						}
						if (var382 == 3608) {
							var6--;
							class88 var87 = class171.field3330[var6];
							class146.method973(var87.method630());
							continue;
						}
						if (var382 == 3609) {
							var6--;
							class88 var88 = class171.field3330[var6];
							if (var88.method619(class177.field3554) || var88.method619(class164.field3141)) {
								var88 = var88.method635(7);
							}
							class108.field1944[var5++] = method901(var88) ? 1 : 0;
							continue;
						}
						if (var382 == 3610) {
							var5--;
							int var89 = class108.field1944[var5];
							if (class115.field2078 == 2 && class146.field2729 > var89) {
								class171.field3330[var6++] = class168.field3238[var89];
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 3611) {
							if (class222.field4182 == null) {
								class171.field3330[var6++] = class81.field1468;
							} else {
								class171.field3330[var6++] = class222.field4182.method614();
							}
							continue;
						}
						if (var382 == 3612) {
							if (class222.field4182 == null) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = class47.field885;
							}
							continue;
						}
						if (var382 == 3613) {
							var5--;
							int var90 = class108.field1944[var5];
							if (class222.field4182 != null && class47.field885 > var90) {
								class171.field3330[var6++] = class88.field1647[var90].field1323.method614();
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 3614) {
							var5--;
							int var91 = class108.field1944[var5];
							if (class222.field4182 != null && class47.field885 > var91) {
								class108.field1944[var5++] = class88.field1647[var91].field1317;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3615) {
							var5--;
							int var92 = class108.field1944[var5];
							if (class222.field4182 != null && class47.field885 > var92) {
								class108.field1944[var5++] = class88.field1647[var92].field1315;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3616) {
							class108.field1944[var5++] = class170.field3301;
							continue;
						}
						if (var382 == 3617) {
							var6--;
							class88 var93 = class171.field3330[var6];
							class101.method701(var93);
							continue;
						}
						if (var382 == 3618) {
							class108.field1944[var5++] = class143.field2631;
							continue;
						}
						if (var382 == 3619) {
							var6--;
							class88 var94 = class171.field3330[var6];
							method900(var94.method630());
							continue;
						}
						if (var382 == 3620) {
							class248.method1621();
							continue;
						}
						if (var382 == 3621) {
							if (class115.field2078 == 0) {
								class108.field1944[var5++] = -1;
							} else {
								class108.field1944[var5++] = class67.field1221;
							}
							continue;
						}
						if (var382 == 3622) {
							var5--;
							int var95 = class108.field1944[var5];
							if (class115.field2078 != 0 && var95 < class67.field1221) {
								class171.field3330[var6++] = class200.method1375(class95.field1764[var95]).method614();
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 3623) {
							var6--;
							class88 var96 = class171.field3330[var6];
							if (var96.method619(class177.field3554) || var96.method619(class164.field3141)) {
								var96 = var96.method635(7);
							}
							class108.field1944[var5++] = class164.method1130(var96) ? 1 : 0;
							continue;
						}
						if (var382 == 3624) {
							var5--;
							int var97 = class108.field1944[var5];
							if (class88.field1647 != null && class47.field885 > var97 && class88.field1647[var97].field1323.method624(class240.field4456.field766)) {
								class108.field1944[var5++] = 1;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3625) {
							if (class225.field4219 == null) {
								class171.field3330[var6++] = class81.field1468;
							} else {
								class171.field3330[var6++] = class225.field4219.method614();
							}
							continue;
						}
						if (var382 == 3626) {
							var5--;
							int var98 = class108.field1944[var5];
							if (class222.field4182 != null && class47.field885 > var98) {
								class171.field3330[var6++] = class88.field1647[var98].field1321;
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 3627) {
							var5--;
							int var99 = class108.field1944[var5];
							if (class115.field2078 == 2 && var99 >= 0 && var99 < class146.field2729) {
								class108.field1944[var5++] = class59.field1120[var99] ? 1 : 0;
								continue;
							}
							class108.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3628) {
							var6--;
							class88 var100 = class171.field3330[var6];
							if (var100.method619(class177.field3554) || var100.method619(class164.field3141)) {
								var100 = var100.method635(7);
							}
							class108.field1944[var5++] = class120.method823(var100);
							continue;
						}
					} else if (var382 < 4000) {
						if (var382 == 3903) {
							var5--;
							int var101 = class108.field1944[var5];
							class108.field1944[var5++] = class9.field140[var101].method882();
							continue;
						}
						if (var382 == 3904) {
							var5--;
							int var102 = class108.field1944[var5];
							class108.field1944[var5++] = class9.field140[var102].field2455;
							continue;
						}
						if (var382 == 3905) {
							var5--;
							int var103 = class108.field1944[var5];
							class108.field1944[var5++] = class9.field140[var103].field2454;
							continue;
						}
						if (var382 == 3906) {
							var5--;
							int var104 = class108.field1944[var5];
							class108.field1944[var5++] = class9.field140[var104].field2450;
							continue;
						}
						if (var382 == 3907) {
							var5--;
							int var105 = class108.field1944[var5];
							class108.field1944[var5++] = class9.field140[var105].field2457;
							continue;
						}
						if (var382 == 3908) {
							var5--;
							int var106 = class108.field1944[var5];
							class108.field1944[var5++] = class9.field140[var106].field2459;
							continue;
						}
						if (var382 == 3910) {
							var5--;
							int var107 = class108.field1944[var5];
							int var108 = class9.field140[var107].method886();
							class108.field1944[var5++] = var108 == 0 ? 1 : 0;
							continue;
						}
						if (var382 == 3911) {
							var5--;
							int var109 = class108.field1944[var5];
							int var110 = class9.field140[var109].method886();
							class108.field1944[var5++] = var110 == 2 ? 1 : 0;
							continue;
						}
						if (var382 == 3912) {
							var5--;
							int var111 = class108.field1944[var5];
							int var112 = class9.field140[var111].method886();
							class108.field1944[var5++] = var112 == 5 ? 1 : 0;
							continue;
						}
						if (var382 == 3913) {
							var5--;
							int var113 = class108.field1944[var5];
							int var114 = class9.field140[var113].method886();
							class108.field1944[var5++] = var114 == 1 ? 1 : 0;
							continue;
						}
					} else if (var382 < 4100) {
						if (var382 == 4000) {
							var5 -= 2;
							int var115 = class108.field1944[var5];
							int var116 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = var115 + var116;
							continue;
						}
						if (var382 == 4001) {
							var5 -= 2;
							int var117 = class108.field1944[var5];
							int var118 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = var117 - var118;
							continue;
						}
						if (var382 == 4002) {
							var5 -= 2;
							int var119 = class108.field1944[var5 + 1];
							int var120 = class108.field1944[var5];
							class108.field1944[var5++] = var120 * var119;
							continue;
						}
						if (var382 == 4003) {
							var5 -= 2;
							int var121 = class108.field1944[var5];
							int var122 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = var121 / var122;
							continue;
						}
						if (var382 == 4004) {
							var5--;
							int var123 = class108.field1944[var5];
							class108.field1944[var5++] = (int) (Math.random() * (double) var123);
							continue;
						}
						if (var382 == 4005) {
							var5--;
							int var124 = class108.field1944[var5];
							class108.field1944[var5++] = (int) ((double) (var124 + 1) * Math.random());
							continue;
						}
						if (var382 == 4006) {
							var5 -= 5;
							int var125 = class108.field1944[var5];
							int var126 = class108.field1944[var5 + 1];
							int var127 = class108.field1944[var5 + 2];
							int var128 = class108.field1944[var5 + 3];
							int var129 = class108.field1944[var5 + 4];
							class108.field1944[var5++] = var125 + (var129 - var127) * (-var125 + var126) / (var128 - var127);
							continue;
						}
						if (var382 == 4007) {
							var5 -= 2;
							long var130 = (long) class108.field1944[var5 + 1];
							long var132 = (long) class108.field1944[var5];
							class108.field1944[var5++] = (int) (var130 * var132 / 100L + var132);
							continue;
						}
						if (var382 == 4008) {
							var5 -= 2;
							int var134 = class108.field1944[var5];
							int var135 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = 0x1 << var135 | var134;
							continue;
						}
						if (var382 == 4009) {
							var5 -= 2;
							int var136 = class108.field1944[var5 + 1];
							int var137 = class108.field1944[var5];
							class108.field1944[var5++] = var137 & -(0x1 << var136) - 1;
							continue;
						}
						if (var382 == 4010) {
							var5 -= 2;
							int var138 = class108.field1944[var5 + 1];
							int var139 = class108.field1944[var5];
							class108.field1944[var5++] = (var139 & 0x1 << var138) == 0 ? 0 : 1;
							continue;
						}
						if (var382 == 4011) {
							var5 -= 2;
							int var140 = class108.field1944[var5 + 1];
							int var141 = class108.field1944[var5];
							class108.field1944[var5++] = var141 % var140;
							continue;
						}
						if (var382 == 4012) {
							var5 -= 2;
							int var142 = class108.field1944[var5];
							int var143 = class108.field1944[var5 + 1];
							if (var142 == 0) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = (int) Math.pow((double) var142, (double) var143);
							}
							continue;
						}
						if (var382 == 4013) {
							var5 -= 2;
							int var144 = class108.field1944[var5];
							int var145 = class108.field1944[var5 + 1];
							if (var144 == 0) {
								class108.field1944[var5++] = 0;
							} else if (var145 == 0) {
								class108.field1944[var5++] = Integer.MAX_VALUE;
							} else {
								class108.field1944[var5++] = (int) Math.pow((double) var144, 1.0D / (double) var145);
							}
							continue;
						}
						if (var382 == 4014) {
							var5 -= 2;
							int var146 = class108.field1944[var5 + 1];
							int var147 = class108.field1944[var5];
							class108.field1944[var5++] = var146 & var147;
							continue;
						}
						if (var382 == 4015) {
							var5 -= 2;
							int var148 = class108.field1944[var5 + 1];
							int var149 = class108.field1944[var5];
							class108.field1944[var5++] = var149 | var148;
							continue;
						}
						if (var382 == 4016) {
							var5 -= 2;
							int var150 = class108.field1944[var5];
							int var151 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = var150 < var151 ? var150 : var151;
							continue;
						}
						if (var382 == 4017) {
							var5 -= 2;
							int var152 = class108.field1944[var5];
							int var153 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = var152 <= var153 ? var153 : var152;
							continue;
						}
						if (var382 == 4018) {
							var5 -= 3;
							long var154 = (long) class108.field1944[var5];
							long var156 = (long) class108.field1944[var5 + 1];
							long var158 = (long) class108.field1944[var5 + 2];
							class108.field1944[var5++] = (int) (var158 * var154 / var156);
							continue;
						}
					} else if (var382 < 4200) {
						if (var382 == 4100) {
							var6--;
							class88 var254 = class171.field3330[var6];
							var5--;
							int var255 = class108.field1944[var5];
							class171.field3330[var6++] = class166.method1140(new class88[] { var254, class170.method1212(var255) });
							continue;
						}
						if (var382 == 4101) {
							var6 -= 2;
							class88 var256 = class171.field3330[var6 + 1];
							class88 var257 = class171.field3330[var6];
							class171.field3330[var6++] = class166.method1140(new class88[] { var257, var256 });
							continue;
						}
						if (var382 == 4102) {
							var6--;
							class88 var258 = class171.field3330[var6];
							var5--;
							int var259 = class108.field1944[var5];
							class171.field3330[var6++] = class166.method1140(new class88[] { var258, class50.method375(var259) });
							continue;
						}
						if (var382 == 4103) {
							var6--;
							class88 var260 = class171.field3330[var6];
							class171.field3330[var6++] = var260.method639();
							continue;
						}
						if (var382 == 4104) {
							var5--;
							int var261 = class108.field1944[var5];
							long var262 = ((long) var261 + 11745L) * 86400000L;
							class22.field353.setTime(new Date(var262));
							int var264 = class22.field353.get(5);
							int var265 = class22.field353.get(2);
							int var266 = class22.field353.get(1);
							class171.field3330[var6++] = class166.method1140(new class88[] { class170.method1212(var264), class119.field2171, class53.field992[var265], class119.field2171, class170.method1212(var266) });
							continue;
						}
						if (var382 == 4105) {
							var6 -= 2;
							class88 var267 = class171.field3330[var6];
							class88 var268 = class171.field3330[var6 + 1];
							if (class240.field4456.field768 != null && class240.field4456.field768.field3957) {
								class171.field3330[var6++] = var268;
								continue;
							}
							class171.field3330[var6++] = var267;
							continue;
						}
						if (var382 == 4106) {
							var5--;
							int var269 = class108.field1944[var5];
							class171.field3330[var6++] = class170.method1212(var269);
							continue;
						}
						if (var382 == 4107) {
							var6 -= 2;
							class108.field1944[var5++] = class171.field3330[var6].method627(class171.field3330[var6 + 1]);
							continue;
						}
						if (var382 == 4108) {
							var5 -= 2;
							int var270 = class108.field1944[var5];
							var6--;
							class88 var271 = class171.field3330[var6];
							int var272 = class108.field1944[var5 + 1];
							byte[] var273 = class98.field1793.method939(0, var272);
							class41 var274 = new class41(var273);
							var274.method149(class34.field587, null);
							class108.field1944[var5++] = var274.method163(var271, var270);
							continue;
						}
						if (var382 == 4109) {
							var5 -= 2;
							var6--;
							class88 var275 = class171.field3330[var6];
							int var276 = class108.field1944[var5 + 1];
							int var277 = class108.field1944[var5];
							byte[] var278 = class98.field1793.method939(0, var276);
							class41 var279 = new class41(var278);
							var279.method149(class34.field587, null);
							class108.field1944[var5++] = var279.method156(var275, var277);
							continue;
						}
						if (var382 == 4110) {
							var6 -= 2;
							class88 var280 = class171.field3330[var6 + 1];
							class88 var281 = class171.field3330[var6];
							var5--;
							if (class108.field1944[var5] == 1) {
								class171.field3330[var6++] = var281;
							} else {
								class171.field3330[var6++] = var280;
							}
							continue;
						}
						if (var382 == 4111) {
							var6--;
							class88 var282 = class171.field3330[var6];
							class171.field3330[var6++] = class26.method162(var282);
							continue;
						}
						if (var382 == 4112) {
							var5--;
							int var283 = class108.field1944[var5];
							var6--;
							class88 var284 = class171.field3330[var6];
							if (var283 == -1) {
								throw new RuntimeException("null char");
							}
							class171.field3330[var6++] = var284.method618(var283);
							continue;
						}
						if (var382 == 4113) {
							var5--;
							int var285 = class108.field1944[var5];
							class108.field1944[var5++] = class221.method1489(var285) ? 1 : 0;
							continue;
						}
						if (var382 == 4114) {
							var5--;
							int var286 = class108.field1944[var5];
							class108.field1944[var5++] = class114.method782(var286) ? 1 : 0;
							continue;
						}
						if (var382 == 4115) {
							var5--;
							int var287 = class108.field1944[var5];
							class108.field1944[var5++] = class109.method746(var287) ? 1 : 0;
							continue;
						}
						if (var382 == 4116) {
							var5--;
							int var288 = class108.field1944[var5];
							class108.field1944[var5++] = class4.method24(var288) ? 1 : 0;
							continue;
						}
						if (var382 == 4117) {
							var6--;
							class88 var289 = class171.field3330[var6];
							if (var289 == null) {
								class108.field1944[var5++] = 0;
							} else {
								class108.field1944[var5++] = var289.method604();
							}
							continue;
						}
						if (var382 == 4118) {
							var5 -= 2;
							var6--;
							class88 var290 = class171.field3330[var6];
							int var291 = class108.field1944[var5 + 1];
							int var292 = class108.field1944[var5];
							class171.field3330[var6++] = var290.method623(var292, var291);
							continue;
						}
						if (var382 == 4119) {
							var6--;
							class88 var293 = class171.field3330[var6];
							class88 var294 = class165.method1135(var293.method604());
							boolean var295 = false;
							for (int var296 = 0; var293.method604() > var296; var296++) {
								int var297 = var293.method599(var296);
								if (var297 == 60) {
									var295 = true;
								} else if (var297 == 62) {
									var295 = false;
								} else if (!var295) {
									var294.method638(var297);
								}
							}
							var294.method629();
							class171.field3330[var6++] = var294;
							continue;
						}
						if (var382 == 4120) {
							var5 -= 2;
							var6--;
							class88 var298 = class171.field3330[var6];
							int var299 = class108.field1944[var5];
							int var300 = class108.field1944[var5 + 1];
							class108.field1944[var5++] = var298.method594(var299, var300);
							continue;
						}
						if (var382 == 4121) {
							var6 -= 2;
							class88 var301 = class171.field3330[var6 + 1];
							var5--;
							int var302 = class108.field1944[var5];
							class88 var303 = class171.field3330[var6];
							class108.field1944[var5++] = var303.method634(var302, var301);
							continue;
						}
						if (var382 == 4122) {
							var5--;
							int var304 = class108.field1944[var5];
							class108.field1944[var5++] = class21.method102(var304);
							continue;
						}
						if (var382 == 4123) {
							var5--;
							int var305 = class108.field1944[var5];
							class108.field1944[var5++] = class9.method51(var305);
							continue;
						}
					} else if (var382 < 4300) {
						if (var382 == 4200) {
							var5--;
							int var160 = class108.field1944[var5];
							class171.field3330[var6++] = class71.method472(var160).field2892;
							continue;
						}
						if (var382 == 4201) {
							var5 -= 2;
							int var161 = class108.field1944[var5];
							int var162 = class108.field1944[var5 + 1];
							class149 var163 = class71.method472(var161);
							if (var162 >= 1 && var162 <= 5 && var163.field2898[var162 - 1] != null) {
								class171.field3330[var6++] = var163.field2898[var162 - 1];
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 4202) {
							var5 -= 2;
							int var164 = class108.field1944[var5 + 1];
							int var165 = class108.field1944[var5];
							class149 var166 = class71.method472(var165);
							if (var164 >= 1 && var164 <= 5 && var166.field2904[var164 - 1] != null) {
								class171.field3330[var6++] = var166.field2904[var164 - 1];
								continue;
							}
							class171.field3330[var6++] = class81.field1468;
							continue;
						}
						if (var382 == 4203) {
							var5--;
							int var167 = class108.field1944[var5];
							class108.field1944[var5++] = class71.method472(var167).field2854;
							continue;
						}
						if (var382 == 4204) {
							var5--;
							int var168 = class108.field1944[var5];
							class108.field1944[var5++] = class71.method472(var168).field2852 == 1 ? 1 : 0;
							continue;
						}
						if (var382 == 4205) {
							var5--;
							int var169 = class108.field1944[var5];
							class149 var170 = class71.method472(var169);
							if (var170.field2867 == -1 && var170.field2841 >= 0) {
								class108.field1944[var5++] = var170.field2841;
								continue;
							}
							class108.field1944[var5++] = var169;
							continue;
						}
						if (var382 == 4206) {
							var5--;
							int var171 = class108.field1944[var5];
							class149 var172 = class71.method472(var171);
							if (var172.field2867 >= 0 && var172.field2841 >= 0) {
								class108.field1944[var5++] = var172.field2841;
								continue;
							}
							class108.field1944[var5++] = var171;
							continue;
						}
						if (var382 == 4207) {
							var5--;
							int var173 = class108.field1944[var5];
							class108.field1944[var5++] = class71.method472(var173).field2877 ? 1 : 0;
							continue;
						}
						if (var382 == 4208) {
							var5 -= 2;
							int var174 = class108.field1944[var5 + 1];
							int var175 = class108.field1944[var5];
							class4 var176 = class216.method1467(var174);
							if (var176.method17()) {
								class171.field3330[var6++] = class71.method472(var175).method1009(var176.field57, var174);
							} else {
								class108.field1944[var5++] = class71.method472(var175).method1010(var174, var176.field53);
							}
							continue;
						}
						if (var382 == 4210) {
							var5--;
							int var177 = class108.field1944[var5];
							var6--;
							class88 var178 = class171.field3330[var6];
							class70.method467(var177 == 1, var178);
							class108.field1944[var5++] = class204.field3893;
							continue;
						}
						if (var382 == 4211) {
							if (class67.field1210 != null && class204.field3893 > class116.field2107) {
								class108.field1944[var5++] = class67.field1210[class116.field2107++] & 0xFFFF;
								continue;
							}
							class108.field1944[var5++] = -1;
							continue;
						}
						if (var382 == 4212) {
							class116.field2107 = 0;
							continue;
						}
					} else if (var382 < 4400) {
						if (var382 == 4300) {
							var5 -= 2;
							int var179 = class108.field1944[var5];
							int var180 = class108.field1944[var5 + 1];
							class4 var181 = class216.method1467(var180);
							if (var181.method17()) {
								class171.field3330[var6++] = class147.method985(var179).method860(var180, var181.field57);
							} else {
								class108.field1944[var5++] = class147.method985(var179).method854(var181.field53, var180);
							}
							continue;
						}
					} else if (var382 >= 4500) {
						if (var382 >= 4600) {
							if (var382 < 5100) {
								if (var382 == 5000) {
									class108.field1944[var5++] = class67.field1206;
									continue;
								}
								if (var382 == 5001) {
									var5 -= 3;
									class67.field1206 = class108.field1944[var5];
									class10.field142 = class108.field1944[var5 + 1];
									class128.field2408 = class108.field1944[var5 + 2];
									class146.field2747.method30(115);
									class146.field2747.method346(class67.field1206);
									class146.field2747.method346(class10.field142);
									class146.field2747.method346(class128.field2408);
									continue;
								}
								if (var382 == 5002) {
									var5 -= 2;
									int var182 = class108.field1944[var5];
									var6--;
									class88 var183 = class171.field3330[var6];
									int var184 = class108.field1944[var5 + 1];
									class146.field2747.method30(99);
									class146.field2747.method328(var183.method630());
									class146.field2747.method346(var182 - 1);
									class146.field2747.method346(var184);
									continue;
								}
								if (var382 == 5003) {
									var5--;
									int var185 = class108.field1944[var5];
									class88 var186 = null;
									if (var185 < 100) {
										var186 = class212.field4019[var185];
									}
									if (var186 == null) {
										var186 = class81.field1468;
									}
									class171.field3330[var6++] = var186;
									continue;
								}
								if (var382 == 5004) {
									int var187 = -1;
									var5--;
									int var188 = class108.field1944[var5];
									if (var188 < 100 && class212.field4019[var188] != null) {
										var187 = class194.field3708[var188];
									}
									class108.field1944[var5++] = var187;
									continue;
								}
								if (var382 == 5005) {
									class108.field1944[var5++] = class10.field142;
									continue;
								}
								if (var382 == 5008) {
									var6--;
									class88 var189 = class171.field3330[var6];
									if (var189.method619(class120.field2194)) {
										class97.method682(var189);
										continue;
									}
									if (class67.field1208 == 0 && (class238.field4428 == 1 || class176.field3535 == 1)) {
										continue;
									}
									class88 var190 = var189.method639();
									byte var191 = 0;
									if (var190.method619(class29.field488)) {
										var189 = var189.method635(class29.field488.method604());
										var191 = 0;
									} else if (var190.method619(class101.field1837)) {
										var191 = 1;
										var189 = var189.method635(class101.field1837.method604());
									} else if (var190.method619(class138.field2564)) {
										var189 = var189.method635(class138.field2564.method604());
										var191 = 2;
									} else if (var190.method619(class241.field4467)) {
										var191 = 3;
										var189 = var189.method635(class241.field4467.method604());
									} else if (var190.method619(class232.field4363)) {
										var189 = var189.method635(class232.field4363.method604());
										var191 = 4;
									} else if (var190.method619(class74.field1355)) {
										var189 = var189.method635(class74.field1355.method604());
										var191 = 5;
									} else if (var190.method619(class37.field669)) {
										var189 = var189.method635(class37.field669.method604());
										var191 = 6;
									} else if (var190.method619(class192.field3690)) {
										var191 = 7;
										var189 = var189.method635(class192.field3690.method604());
									} else if (var190.method619(class39.field696)) {
										var189 = var189.method635(class39.field696.method604());
										var191 = 8;
									} else if (var190.method619(class200.field3817)) {
										var189 = var189.method635(class200.field3817.method604());
										var191 = 9;
									} else if (var190.method619(class160.field3084)) {
										var191 = 10;
										var189 = var189.method635(class160.field3084.method604());
									} else if (var190.method619(class192.field3703)) {
										var189 = var189.method635(class192.field3703.method604());
										var191 = 11;
									} else if (class126.field2348 != 0) {
										if (var190.method619(class29.field485)) {
											var191 = 0;
											var189 = var189.method635(class29.field485.method604());
										} else if (var190.method619(class101.field1842)) {
											var189 = var189.method635(class101.field1842.method604());
											var191 = 1;
										} else if (var190.method619(class138.field2561)) {
											var191 = 2;
											var189 = var189.method635(class138.field2561.method604());
										} else if (var190.method619(class241.field4463)) {
											var191 = 3;
											var189 = var189.method635(class241.field4463.method604());
										} else if (var190.method619(class232.field4364)) {
											var189 = var189.method635(class232.field4364.method604());
											var191 = 4;
										} else if (var190.method619(class74.field1354)) {
											var189 = var189.method635(class74.field1354.method604());
											var191 = 5;
										} else if (var190.method619(class37.field663)) {
											var189 = var189.method635(class37.field663.method604());
											var191 = 6;
										} else if (var190.method619(class192.field3691)) {
											var191 = 7;
											var189 = var189.method635(class192.field3691.method604());
										} else if (var190.method619(class39.field683)) {
											var189 = var189.method635(class39.field683.method604());
											var191 = 8;
										} else if (var190.method619(class200.field3813)) {
											var189 = var189.method635(class200.field3813.method604());
											var191 = 9;
										} else if (var190.method619(class160.field3081)) {
											var191 = 10;
											var189 = var189.method635(class160.field3081.method604());
										} else if (var190.method619(class192.field3695)) {
											var189 = var189.method635(class192.field3695.method604());
											var191 = 11;
										}
									}
									class88 var192 = var189.method639();
									byte var193 = 0;
									if (var192.method619(class57.field1083)) {
										var193 = 1;
										var189 = var189.method635(class57.field1083.method604());
									} else if (var192.method619(class35.field612)) {
										var189 = var189.method635(class35.field612.method604());
										var193 = 2;
									} else if (var192.method619(class71.field1308)) {
										var193 = 3;
										var189 = var189.method635(class71.field1308.method604());
									} else if (var192.method619(class17.field263)) {
										var193 = 4;
										var189 = var189.method635(class17.field263.method604());
									} else if (var192.method619(class216.field4050)) {
										var189 = var189.method635(class216.field4050.method604());
										var193 = 5;
									} else if (class126.field2348 != 0) {
										if (var192.method619(class57.field1086)) {
											var193 = 1;
											var189 = var189.method635(class57.field1086.method604());
										} else if (var192.method619(class35.field618)) {
											var189 = var189.method635(class35.field618.method604());
											var193 = 2;
										} else if (var192.method619(class71.field1313)) {
											var189 = var189.method635(class71.field1313.method604());
											var193 = 3;
										} else if (var192.method619(class17.field267)) {
											var193 = 4;
											var189 = var189.method635(class17.field267.method604());
										} else if (var192.method619(class216.field4049)) {
											var193 = 5;
											var189 = var189.method635(class216.field4049.method604());
										}
									}
									class146.field2747.method30(189);
									class146.field2747.method346(0);
									int var194 = class146.field2747.field831;
									class146.field2747.method346(var191);
									class146.field2747.method346(var193);
									class172.method1220(class146.field2747, var189);
									class146.field2747.method341(class146.field2747.field831 - var194);
									continue;
								}
								if (var382 == 5009) {
									var6 -= 2;
									class88 var195 = class171.field3330[var6];
									class88 var196 = class171.field3330[var6 + 1];
									if (class67.field1208 != 0 || class238.field4428 != 1 && class176.field3535 != 1) {
										class146.field2747.method30(80);
										class146.field2747.method346(0);
										int var197 = class146.field2747.field831;
										class146.field2747.method328(var195.method630());
										class172.method1220(class146.field2747, var196);
										class146.field2747.method341(class146.field2747.field831 - var197);
									}
									continue;
								}
								if (var382 == 5010) {
									var5--;
									int var198 = class108.field1944[var5];
									class88 var199 = null;
									if (var198 < 100) {
										var199 = class121.field2206[var198];
									}
									if (var199 == null) {
										var199 = class81.field1468;
									}
									class171.field3330[var6++] = var199;
									continue;
								}
								if (var382 == 5011) {
									class88 var200 = null;
									var5--;
									int var201 = class108.field1944[var5];
									if (var201 < 100) {
										var200 = class228.field4280[var201];
									}
									if (var200 == null) {
										var200 = class81.field1468;
									}
									class171.field3330[var6++] = var200;
									continue;
								}
								if (var382 == 5012) {
									int var202 = -1;
									var5--;
									int var203 = class108.field1944[var5];
									if (var203 < 100) {
										var202 = class133.field2483[var203];
									}
									class108.field1944[var5++] = var202;
									continue;
								}
								if (var382 == 5015) {
									class88 var204;
									if (class240.field4456 == null || class240.field4456.field766 == null) {
										var204 = class209.field3967;
									} else {
										var204 = class240.field4456.field766;
									}
									class171.field3330[var6++] = var204;
									continue;
								}
								if (var382 == 5016) {
									class108.field1944[var5++] = class128.field2408;
									continue;
								}
								if (var382 == 5017) {
									class108.field1944[var5++] = class34.field582;
									continue;
								}
								if (var382 == 5050) {
									var5--;
									int var205 = class108.field1944[var5];
									class171.field3330[var6++] = class115.method783(var205).field2128;
									continue;
								}
								if (var382 == 5051) {
									var5--;
									int var206 = class108.field1944[var5];
									class117 var207 = class115.method783(var206);
									if (var207.field2116 == null) {
										class108.field1944[var5++] = 0;
									} else {
										class108.field1944[var5++] = var207.field2116.length;
									}
									continue;
								}
								if (var382 == 5052) {
									var5 -= 2;
									int var208 = class108.field1944[var5];
									int var209 = class108.field1944[var5 + 1];
									class117 var210 = class115.method783(var208);
									int var211 = var210.field2116[var209];
									class108.field1944[var5++] = var211;
									continue;
								}
								if (var382 == 5053) {
									var5--;
									int var212 = class108.field1944[var5];
									class117 var213 = class115.method783(var212);
									if (var213.field2121 == null) {
										class108.field1944[var5++] = 0;
									} else {
										class108.field1944[var5++] = var213.field2121.length;
									}
									continue;
								}
								if (var382 == 5054) {
									var5 -= 2;
									int var214 = class108.field1944[var5];
									int var215 = class108.field1944[var5 + 1];
									class108.field1944[var5++] = class115.method783(var214).field2121[var215];
									continue;
								}
								if (var382 == 5055) {
									var5--;
									int var216 = class108.field1944[var5];
									class171.field3330[var6++] = class168.method1150(var216).method1410();
									continue;
								}
								if (var382 == 5056) {
									var5--;
									int var217 = class108.field1944[var5];
									class205 var218 = class168.method1150(var217);
									if (var218.field3916 == null) {
										class108.field1944[var5++] = 0;
									} else {
										class108.field1944[var5++] = var218.field3916.length;
									}
									continue;
								}
								if (var382 == 5057) {
									var5 -= 2;
									int var219 = class108.field1944[var5 + 1];
									int var220 = class108.field1944[var5];
									class108.field1944[var5++] = class168.method1150(var220).field3916[var219];
									continue;
								}
								if (var382 == 5058) {
									class15.field226 = new class217();
									var5--;
									class15.field226.field4058 = class108.field1944[var5];
									class15.field226.field4065 = class168.method1150(class15.field226.field4058);
									class15.field226.field4068 = new int[class15.field226.field4065.method1407()];
									continue;
								}
								if (var382 == 5059) {
									class146.field2747.method30(197);
									class146.field2747.method346(0);
									int var221 = class146.field2747.field831;
									class146.field2747.method346(0);
									class146.field2747.method305(class15.field226.field4058);
									class15.field226.field4065.method1414(class146.field2747, class15.field226.field4068);
									class146.field2747.method341(class146.field2747.field831 - var221);
									continue;
								}
								if (var382 == 5060) {
									var6--;
									class88 var222 = class171.field3330[var6];
									class146.field2747.method30(242);
									class146.field2747.method346(0);
									int var223 = class146.field2747.field831;
									class146.field2747.method328(var222.method630());
									class146.field2747.method305(class15.field226.field4058);
									class15.field226.field4065.method1414(class146.field2747, class15.field226.field4068);
									class146.field2747.method341(class146.field2747.field831 - var223);
									continue;
								}
								if (var382 == 5061) {
									class146.field2747.method30(197);
									class146.field2747.method346(0);
									int var224 = class146.field2747.field831;
									class146.field2747.method346(1);
									class146.field2747.method305(class15.field226.field4058);
									class15.field226.field4065.method1414(class146.field2747, class15.field226.field4068);
									class146.field2747.method341(class146.field2747.field831 - var224);
									continue;
								}
								if (var382 == 5062) {
									var5 -= 2;
									int var225 = class108.field1944[var5 + 1];
									int var226 = class108.field1944[var5];
									class108.field1944[var5++] = class115.method783(var226).field2119[var225];
									continue;
								}
								if (var382 == 5063) {
									var5 -= 2;
									int var227 = class108.field1944[var5 + 1];
									int var228 = class108.field1944[var5];
									class108.field1944[var5++] = class115.method783(var228).field2130[var227];
									continue;
								}
								if (var382 == 5064) {
									var5 -= 2;
									int var229 = class108.field1944[var5];
									int var230 = class108.field1944[var5 + 1];
									if (var230 == -1) {
										class108.field1944[var5++] = -1;
									} else {
										class108.field1944[var5++] = class115.method783(var229).method796(var230);
									}
									continue;
								}
								if (var382 == 5065) {
									var5 -= 2;
									int var231 = class108.field1944[var5];
									int var232 = class108.field1944[var5 + 1];
									if (var232 == -1) {
										class108.field1944[var5++] = -1;
									} else {
										class108.field1944[var5++] = class115.method783(var231).method792(var232);
									}
									continue;
								}
								if (var382 == 5066) {
									var5--;
									int var233 = class108.field1944[var5];
									class108.field1944[var5++] = class168.method1150(var233).method1407();
									continue;
								}
								if (var382 == 5067) {
									var5 -= 2;
									int var234 = class108.field1944[var5];
									int var235 = class108.field1944[var5 + 1];
									int var236 = class168.method1150(var234).method1405(var235);
									class108.field1944[var5++] = var236;
									continue;
								}
								if (var382 == 5068) {
									var5 -= 2;
									int var237 = class108.field1944[var5 + 1];
									int var238 = class108.field1944[var5];
									class15.field226.field4068[var238] = var237;
									continue;
								}
								if (var382 == 5069) {
									var5 -= 2;
									int var239 = class108.field1944[var5];
									int var240 = class108.field1944[var5 + 1];
									class15.field226.field4068[var239] = var240;
									continue;
								}
								if (var382 == 5070) {
									var5 -= 3;
									int var241 = class108.field1944[var5];
									int var242 = class108.field1944[var5 + 1];
									int var243 = class108.field1944[var5 + 2];
									class205 var244 = class168.method1150(var241);
									if (var244.method1405(var242) != 0) {
										throw new RuntimeException("bad command");
									}
									class108.field1944[var5++] = var244.method1412(var243, var242);
									continue;
								}
							} else if (var382 < 5200) {
								if (var382 == 5100) {
									if (class247.field4511[86]) {
										class108.field1944[var5++] = 1;
									} else {
										class108.field1944[var5++] = 0;
									}
									continue;
								}
								if (var382 == 5101) {
									if (class247.field4511[82]) {
										class108.field1944[var5++] = 1;
									} else {
										class108.field1944[var5++] = 0;
									}
									continue;
								}
								if (var382 == 5102) {
									if (class247.field4511[81]) {
										class108.field1944[var5++] = 1;
									} else {
										class108.field1944[var5++] = 0;
									}
									continue;
								}
							} else if (var382 < 5300) {
								if (var382 == 5200) {
									var5--;
									class43.method277(class108.field1944[var5]);
									continue;
								}
								if (var382 == 5201) {
									class108.field1944[var5++] = class102.method708();
									continue;
								}
								if (var382 == 5202) {
									var5--;
									class86.method581(class108.field1944[var5]);
									continue;
								}
								if (var382 == 5203) {
									var6--;
									class130.method879(class171.field3330[var6]);
									continue;
								}
								if (var382 == 5204) {
									class171.field3330[var6 - 1] = class221.method1492(class171.field3330[var6 - 1]);
									continue;
								}
								if (var382 == 5205) {
									var6--;
									class111.method764(class171.field3330[var6]);
									continue;
								}
							} else if (var382 >= 5400) {
								if (var382 < 5500) {
									if (var382 == 5400) {
										var6 -= 2;
										class88 var245 = class171.field3330[var6];
										class88 var246 = class171.field3330[var6 + 1];
										var5--;
										int var247 = class108.field1944[var5];
										class146.field2747.method30(85);
										class146.field2747.method346(class15.method72(var245) + class15.method72(var246) + 1);
										class146.field2747.method336(var245);
										class146.field2747.method336(var246);
										class146.field2747.method346(var247);
										continue;
									}
									if (var382 == 5401) {
										var5 -= 2;
										class117.field2108[class108.field1944[var5]] = (short) class234.method1559(class108.field1944[var5 + 1]);
										class7.method37();
										class204.method1399();
										class103.method711();
										class154.method1050();
										class106.method733();
										continue;
									}
								}
							} else if (var382 == 5304) {
								class108.field1944[var5++] = 0;
								continue;
							}
						} else if (var382 == 4500) {
							var5 -= 2;
							int var248 = class108.field1944[var5 + 1];
							int var249 = class108.field1944[var5];
							class4 var250 = class216.method1467(var248);
							if (var250.method17()) {
								class171.field3330[var6++] = class22.method106(var249).method1263(var250.field57, var248);
							} else {
								class108.field1944[var5++] = class22.method106(var249).method1265(var250.field53, var248);
							}
							continue;
						}
					} else if (var382 == 4400) {
						var5 -= 2;
						int var251 = class108.field1944[var5];
						int var252 = class108.field1944[var5 + 1];
						class4 var253 = class216.method1467(var252);
						if (var253.method17()) {
							class171.field3330[var6++] = class190.method1321(var251).method999(var253.field57, var252);
						} else {
							class108.field1944[var5++] = class190.method1321(var251).method995(var253.field53, var252);
						}
						continue;
					}
				} else {
					class174 var361;
					if (var382 < 2000) {
						var361 = var43 ? class203.field3871 : class129.field2426;
					} else {
						var5--;
						var361 = class239.method1579(class108.field1944[var5]);
						var382 -= 1000;
					}
					if (var382 == 1300) {
						var5--;
						int var362 = class108.field1944[var5] - 1;
						if (var362 >= 0 && var362 <= 9) {
							var6--;
							var361.method1253(class171.field3330[var6], var362);
							continue;
						}
						var6--;
						continue;
					}
					if (var382 == 1301) {
						var5 -= 2;
						int var363 = class108.field1944[var5];
						int var364 = class108.field1944[var5 + 1];
						var361.field3502 = class36.method238(var364, var363);
						continue;
					}
					if (var382 == 1302) {
						var5--;
						var361.field3427 = class108.field1944[var5] == 1;
						continue;
					}
					if (var382 == 1303) {
						var5--;
						var361.field3413 = class108.field1944[var5];
						continue;
					}
					if (var382 == 1304) {
						var5--;
						var361.field3475 = class108.field1944[var5];
						continue;
					}
					if (var382 == 1305) {
						var6--;
						var361.field3457 = class171.field3330[var6];
						continue;
					}
					if (var382 == 1306) {
						var6--;
						var361.field3512 = class171.field3330[var6];
						continue;
					}
					if (var382 == 1307) {
						var361.field3373 = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var381) {
			if (var4.field4530 == null) {
				if (class115.field2071 != 0) {
					class223.method1499(class179.field3563, 0, class81.field1468);
				}
				class221.method1488("CS2 - scr:" + var4.field1219 + " op:" + var9, var381);
			} else {
				class88 var378 = class165.method1135(30);
				var378.method616(class156.field3010).method616(var4.field4530);
				for (int var379 = class230.field4318 - 1; var379 >= 0; var379--) {
					var378.method616(class22.field356).method616(class80.field1446[var379].field2605.field4530);
				}
				if (var9 == 40) {
					int var380 = var8[var7];
					var378.method616(class134.field2496).method616(class170.method1212(var380));
				}
				if (class115.field2071 != 0) {
					class223.method1499(class166.method1140(new class88[] { class18.field288, var4.field4530 }), 0, class81.field1468);
				}
				class221.method1488("CS2 - scr:" + var4.field1219 + " op:" + var9 + new String(var378.method613()), var381);
			}
		}
	}

	public class135() {
		this(0);
	}

	public class135(int arg0) {
		super(0, false);
		this.method899(0);
	}

	@ObfuscatedName("md.c(IB)V")
	public void method899(int arg0) {
		this.field2522 = arg0 >> 4 & 0xFF0;
		this.field2520 = (arg0 & 0xFF) << 4;
		this.field2505 = arg0 >> 12 & 0xFF0;
	}

	@ObfuscatedName("md.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.method899(arg0.method304());
		}
	}

	@ObfuscatedName("md.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = var2[0];
			int[] var4 = var2[2];
			int[] var5 = var2[1];
			for (int var6 = 0; var6 < class70.field1276; var6++) {
				var3[var6] = this.field2505;
				var5[var6] = this.field2522;
				var4[var6] = this.field2520;
			}
		}
		return var2;
	}
}
