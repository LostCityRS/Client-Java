package deob;

import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;

@ObfuscatedName("na")
public final class class143 extends class67 {

	@ObfuscatedName("na.bb")
	public static final class88 field2659 = class208.method1423(105, "Loaded sprites");

	@ObfuscatedName("na.t")
	public class162 field2626;

	@ObfuscatedName("na.u")
	public static int field2627;

	@ObfuscatedName("na.v")
	public int field2628;

	@ObfuscatedName("na.w")
	public int field2629;

	@ObfuscatedName("na.I")
	public static final class88 field2641 = class208.method1423(105, "skill)2");

	@ObfuscatedName("na.O")
	public static final class88 field2646 = class208.method1423(105, "Please wait)3)3)3");

	@ObfuscatedName("na.S")
	public static class88 field2650 = field2646;

	@ObfuscatedName("na.K")
	public static final int[] field2642 = new int[32];

	@ObfuscatedName("na.E")
	public static class88 field2637 = field2641;

	@ObfuscatedName("na.U")
	public static int field2652 = 1;

	@ObfuscatedName("na.Z")
	public static int field2657 = 0;

	@ObfuscatedName("na.A")
	public static class88 field2633 = field2659;

	@ObfuscatedName("na.y")
	public static byte field2631;

	@ObfuscatedName("na.x")
	public int field2630;

	@ObfuscatedName("na.z")
	public int field2632;

	@ObfuscatedName("na.F")
	public int field2638;

	@ObfuscatedName("na.G")
	public int field2639;

	@ObfuscatedName("na.H")
	public int field2640;

	@ObfuscatedName("na.N")
	public int field2645;

	@ObfuscatedName("na.P")
	public int field2647;

	@ObfuscatedName("na.X")
	public int field2655;

	@ObfuscatedName("na.B")
	public class148 field2634;

	@ObfuscatedName("na.M")
	public class162 field2644;

	@ObfuscatedName("na.W")
	public static class86 field2654;

	@ObfuscatedName("na.L")
	public static Image field2643;

	@ObfuscatedName("na.C")
	public int[] field2635;

	@ObfuscatedName("na.a(IIIIII[Lq;II)V")
	public static void method933(int arg0, int arg1, int arg2, int arg3, int arg4, class174[] arg5, int arg6, int arg7) {
		for (int var8 = 0; var8 < arg5.length; var8++) {
			class174 var9 = arg5[var8];
			if (var9 != null && (!var9.field3410 || var9.field3390 == 0 || var9.field3449 || class80.method530(var9) != 0 || class49.field923 == var9 || var9.field3439 == 1338) && arg3 == var9.field3504 && (!var9.field3410 || !class71.method475(var9))) {
				int var10 = arg2 + var9.field3366;
				int var11 = arg7 + var9.field3441;
				int var12;
				int var15;
				int var16;
				int var17;
				if (var9.field3390 == 2) {
					var16 = arg4;
					var17 = arg1;
					var12 = arg0;
					var15 = arg6;
				} else {
					var12 = arg0 >= var11 ? arg0 : var11;
					int var13 = var11 + var9.field3422;
					int var14 = var9.field3380 + var10;
					var15 = arg6 >= var10 ? arg6 : var10;
					if (var9.field3390 == 9) {
						var13++;
						var14++;
					}
					var16 = arg4 <= var13 ? arg4 : var13;
					var17 = var14 < arg1 ? var14 : arg1;
				}
				if (class179.field3568 == var9) {
					class14.field208 = var10;
					class149.field2905 = true;
					class135.field2506 = var11;
				}
				if (!var9.field3410 || var15 < var17 && var12 < var16) {
					if (var9.field3390 == 0) {
						if (!var9.field3410 && class71.method475(var9) && class65.field1177 != var9) {
							continue;
						}
						if (var9.field3470 && var15 <= class28.field471 && class239.field4449 >= var12 && var17 > class28.field471 && class239.field4449 < var16) {
							for (class39 var18 = (class39) class74.field1349.method1610(); var18 != null; var18 = (class39) class74.field1349.method1619()) {
								if (var18.field686) {
									var18.method460();
								}
							}
							for (class39 var19 = (class39) class199.field3810.method1610(); var19 != null; var19 = (class39) class199.field3810.method1619()) {
								if (var19.field686) {
									var19.method460();
								}
							}
							if (class227.field4256 == 0) {
								class179.field3568 = null;
								class49.field923 = null;
							}
							class175.field3532 = false;
						}
					}
					if (var9.field3410) {
						boolean var20 = false;
						boolean var21 = false;
						boolean var22;
						if (class28.field471 >= var15 && var12 <= class239.field4449 && var17 > class28.field471 && var16 > class239.field4449) {
							var22 = true;
						} else {
							var22 = false;
						}
						if (class36.field625 == 1 && var15 <= class226.field4239 && class172.field3339 >= var12 && class226.field4239 < var17 && var16 > class172.field3339) {
							var21 = true;
						}
						if (class156.field3016 == 1 && var22) {
							var20 = true;
						}
						if (class81.field1467 > 0 && var9.field3493 != null) {
							for (int var23 = 0; var23 < var9.field3493.length; var23++) {
								for (int var24 = 0; var24 < class81.field1467; var24++) {
									int var25 = var9.field3493[var23] & 0xFF;
									if (class242.field4479[var24] == var25) {
										class203.method1390(var23 + 1, class174.field3453, -1, var9.field3423);
									}
								}
							}
						}
						if (var21) {
							class80.method532(class226.field4239 - var10, class172.field3339 + -var11, var9);
						}
						if (class179.field3568 != null && var9 != class179.field3568 && var22 && class59.method423(class80.method530(var9))) {
							class122.field2217 = var9;
						}
						if (var9 == class49.field923) {
							class29.field487 = true;
							class28.field466 = var11;
							class127.field2371 = var10;
						}
						if (var9.field3449 || var9.field3439 != 0) {
							if (var22 && class90.field1708 != 0 && var9.field3471 != null) {
								class39 var26 = new class39();
								var26.field686 = true;
								var26.field681 = var9.field3471;
								var26.field678 = var9;
								var26.field691 = class90.field1708;
								class74.field1349.method1622(var26);
							}
							if (class179.field3568 != null || class135.field2514 != null || class108.field1958 || var9.field3439 != 1400 && class175.field3532) {
								var22 = false;
								var21 = false;
								var20 = false;
							}
							if (var9.field3439 == 1337) {
								class200.method1371(var9);
								continue;
							}
							if (var9.field3439 == 1338) {
								if (var21) {
									class4.method16(class226.field4239 - var10, -var11 + class172.field3339, var9);
								}
								continue;
							}
							if (var9.field3439 == 1400) {
								class90.field1706 = var9;
								if (var21) {
									if (class247.field4511[82] && class67.field1208 > 0) {
										int var27 = class44.field760 + class119.field2181 - class157.field3033 - (int) ((double) (-(var9.field3422 / 2) + -var11 + class172.field3339) * 2.0D / class59.field1110);
										int var28 = class126.field2330 + (int) ((double) (class226.field4239 - var9.field3380 / 2 - var10) * 2.0D / class59.field1110) + class16.field239;
										class88 var29 = class166.method1140(new class88[] { class212.field4009, class170.method1212(var28 >> 6), class53.field979, class170.method1212(var27 >> 6), class53.field979, class170.method1212(var28 & 0x3F), class53.field979, class170.method1212(var27 & 0x3F) });
										var29.method610();
										class97.method682(var29);
										class29.method174();
										continue;
									}
									class148.field2791 = class28.field471;
									class98.field1801 = class157.field3033;
									class207.field3941 = class239.field4449;
									class175.field3532 = true;
									class47.field890 = class126.field2330;
									continue;
								}
								if (var20 && class175.field3532) {
									class233.method1551(class47.field890 + (int) ((double) (class148.field2791 - class28.field471) * 2.0D / class150.field2915));
									class172.method1221((int) ((double) (class207.field3941 - class239.field4449) * 2.0D / class150.field2915) + class98.field1801);
									continue;
								}
								class175.field3532 = false;
								continue;
							}
							if (var9.field3439 == 1401) {
								if (var20) {
									class165.method1137(var9.field3380, class239.field4449 - var11, class28.field471 - var10, var9.field3422);
								}
								continue;
							}
							if (!var9.field3478 && var21) {
								var9.field3478 = true;
								if (var9.field3490 != null) {
									class39 var30 = new class39();
									var30.field691 = class172.field3339 - var11;
									var30.field681 = var9.field3490;
									var30.field678 = var9;
									var30.field686 = true;
									var30.field694 = class226.field4239 - var10;
									class74.field1349.method1622(var30);
								}
							}
							if (var9.field3478 && var20 && var9.field3452 != null) {
								class39 var31 = new class39();
								var31.field686 = true;
								var31.field681 = var9.field3452;
								var31.field678 = var9;
								var31.field694 = class28.field471 - var10;
								var31.field691 = class239.field4449 - var11;
								class74.field1349.method1622(var31);
							}
							if (var9.field3478 && !var20) {
								var9.field3478 = false;
								if (var9.field3408 != null) {
									class39 var32 = new class39();
									var32.field678 = var9;
									var32.field691 = class239.field4449 - var11;
									var32.field681 = var9.field3408;
									var32.field694 = class28.field471 - var10;
									var32.field686 = true;
									class199.field3810.method1622(var32);
								}
							}
							if (var20 && var9.field3503 != null) {
								class39 var33 = new class39();
								var33.field681 = var9.field3503;
								var33.field686 = true;
								var33.field691 = class239.field4449 - var11;
								var33.field678 = var9;
								var33.field694 = class28.field471 - var10;
								class74.field1349.method1622(var33);
							}
							if (!var9.field3467 && var22) {
								var9.field3467 = true;
								if (var9.field3370 != null) {
									class39 var34 = new class39();
									var34.field694 = class28.field471 - var10;
									var34.field691 = class239.field4449 - var11;
									var34.field686 = true;
									var34.field678 = var9;
									var34.field681 = var9.field3370;
									class74.field1349.method1622(var34);
								}
							}
							if (var9.field3467 && var22 && var9.field3510 != null) {
								class39 var35 = new class39();
								var35.field678 = var9;
								var35.field691 = class239.field4449 - var11;
								var35.field681 = var9.field3510;
								var35.field694 = class28.field471 - var10;
								var35.field686 = true;
								class74.field1349.method1622(var35);
							}
							if (var9.field3467 && !var22) {
								var9.field3467 = false;
								if (var9.field3448 != null) {
									class39 var36 = new class39();
									var36.field681 = var9.field3448;
									var36.field678 = var9;
									var36.field686 = true;
									var36.field694 = class28.field471 - var10;
									var36.field691 = class239.field4449 - var11;
									class199.field3810.method1622(var36);
								}
							}
							if (var9.field3458 != null) {
								class39 var37 = new class39();
								var37.field678 = var9;
								var37.field681 = var9.field3458;
								class35.field619.method1622(var37);
							}
							if (var9.field3481 != null && class226.field4244 > var9.field3372) {
								if (var9.field3450 == null || class226.field4244 - var9.field3372 > 32) {
									class39 var42 = new class39();
									var42.field678 = var9;
									var42.field681 = var9.field3481;
									class74.field1349.method1622(var42);
								} else {
									label439: for (int var38 = var9.field3372; var38 < class226.field4244; var38++) {
										int var39 = class244.field4495[var38 & 0x1F];
										for (int var40 = 0; var40 < var9.field3450.length; var40++) {
											if (var9.field3450[var40] == var39) {
												class39 var41 = new class39();
												var41.field681 = var9.field3481;
												var41.field678 = var9;
												class74.field1349.method1622(var41);
												break label439;
											}
										}
									}
								}
								var9.field3372 = class226.field4244;
							}
							if (var9.field3443 != null && class223.field4198 > var9.field3407) {
								if (var9.field3369 == null || class223.field4198 - var9.field3407 > 32) {
									class39 var47 = new class39();
									var47.field681 = var9.field3443;
									var47.field678 = var9;
									class74.field1349.method1622(var47);
								} else {
									label415: for (int var43 = var9.field3407; var43 < class223.field4198; var43++) {
										int var44 = class231.field4328[var43 & 0x1F];
										for (int var45 = 0; var45 < var9.field3369.length; var45++) {
											if (var44 == var9.field3369[var45]) {
												class39 var46 = new class39();
												var46.field681 = var9.field3443;
												var46.field678 = var9;
												class74.field1349.method1622(var46);
												break label415;
											}
										}
									}
								}
								var9.field3407 = class223.field4198;
							}
							if (var9.field3454 != null && var9.field3499 < class118.field2131) {
								if (var9.field3398 == null || class118.field2131 - var9.field3499 > 32) {
									class39 var48 = new class39();
									var48.field681 = var9.field3454;
									var48.field678 = var9;
									class74.field1349.method1622(var48);
								} else {
									label391: for (int var49 = var9.field3499; var49 < class118.field2131; var49++) {
										int var50 = field2642[var49 & 0x1F];
										for (int var51 = 0; var51 < var9.field3398.length; var51++) {
											if (var9.field3398[var51] == var50) {
												class39 var52 = new class39();
												var52.field678 = var9;
												var52.field681 = var9.field3454;
												class74.field1349.method1622(var52);
												break label391;
											}
										}
									}
								}
								var9.field3499 = class118.field2131;
							}
							if (var9.field3462 < class7.field100 && var9.field3518 != null) {
								class39 var53 = new class39();
								var53.field678 = var9;
								var53.field681 = var9.field3518;
								class74.field1349.method1622(var53);
							}
							if (var9.field3462 < class20.field313 && var9.field3484 != null) {
								class39 var54 = new class39();
								var54.field678 = var9;
								var54.field681 = var9.field3484;
								class74.field1349.method1622(var54);
							}
							if (var9.field3462 < class77.field1394 && var9.field3381 != null) {
								class39 var55 = new class39();
								var55.field678 = var9;
								var55.field681 = var9.field3381;
								class74.field1349.method1622(var55);
							}
							if (class117.field2127 > var9.field3462 && var9.field3505 != null) {
								class39 var56 = new class39();
								var56.field678 = var9;
								var56.field681 = var9.field3505;
								class74.field1349.method1622(var56);
							}
							if (var9.field3462 < class208.field3952 && var9.field3444 != null) {
								class39 var57 = new class39();
								var57.field678 = var9;
								var57.field681 = var9.field3444;
								class74.field1349.method1622(var57);
							}
							var9.field3462 = class67.field1211;
							if (var9.field3377 != null) {
								for (int var58 = 0; var58 < class81.field1467; var58++) {
									class39 var59 = new class39();
									var59.field678 = var9;
									var59.field682 = class242.field4479[var58];
									var59.field692 = class191.field3685[var58];
									var59.field681 = var9.field3377;
									class74.field1349.method1622(var59);
								}
							}
						}
					}
					if (!var9.field3410 && class179.field3568 == null && class135.field2514 == null && !class108.field1958) {
						if ((var9.field3424 >= 0 || var9.field3431 != 0) && var15 <= class28.field471 && class239.field4449 >= var12 && class28.field471 < var17 && var16 > class239.field4449) {
							if (var9.field3424 < 0) {
								class65.field1177 = var9;
							} else {
								class65.field1177 = arg5[var9.field3424];
							}
						}
						if (var9.field3390 == 8 && var15 <= class28.field471 && var12 <= class239.field4449 && var17 > class28.field471 && class239.field4449 < var16) {
							class36.field635 = var9;
						}
						if (var9.field3422 < var9.field3375) {
							class118.method805(var10 + var9.field3380, var9.field3375, class28.field471, var9.field3422, class239.field4449, var9, var11);
						}
					}
					if (var9.field3390 == 0) {
						method933(var12, var17, var10 - var9.field3393, var9.field3423, var16, arg5, var15, var11 - var9.field3415);
						if (var9.field3465 != null) {
							method933(var12, var17, var10 - var9.field3393, var9.field3423, var16, var9.field3465, var15, var11 - var9.field3415);
						}
						class168 var60 = (class168) class128.field2395.method1049((long) var9.field3423);
						if (var60 != null) {
							class230.method1533(var11, var16, var12, var15, var17, var60.field3229, var10);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("na.a(ZI)V")
	public static void method934() {
		byte[][] var0 = class167.field3221;
		int var1 = var0.length;
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = (class146.field2731[var2] >> 8) * 64 - class223.field4212;
			byte[] var4 = var0[var2];
			int var5 = (class146.field2731[var2] & 0xFF) * 64 - class190.field3679;
			if (var4 != null) {
				class219.method1479();
				class144.method963(class110.field2014 * 8 - 48, var3, (class140.field2595 - 6) * 8, class166.field3200, var5, var4);
			}
		}
		for (int var6 = 0; var6 < var1; var6++) {
			int var7 = (class146.field2731[var6] >> 8) * 64 - class223.field4212;
			int var8 = (class146.field2731[var6] & 0xFF) * 64 - class190.field3679;
			byte[] var9 = var0[var6];
			if (var9 == null && class110.field2014 < 800) {
				class219.method1479();
				for (int var10 = 0; var10 < 4; var10++) {
					class17.method83(var10, 64, 64, var8, var7);
				}
			}
		}
	}

	@ObfuscatedName("na.a(BLjava/awt/Component;)V")
	public static void method935(Component arg0) {
		Method var1 = class181.field3586;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(class166.field3188);
		arg0.addFocusListener(class166.field3188);
	}

	@ObfuscatedName("na.a(BLea;)Lje;")
	public static class103 method936(class46 arg0) {
		return new class103(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method304(), arg0.method347());
	}

	@ObfuscatedName("na.a([BB)V")
	public static void method937(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = arg0[var1++] * 64 - class16.field239;
				int var3 = arg0[var1++] * 64 - class119.field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < class109.field1988 && var3 + 64 < class44.field760) {
					int var7 = var2 >> 6;
					int var8 = class44.field760 - var3 - 1 >> 6;
					for (int var9 = 0; var9 < 64; var9++) {
						for (int var10 = -64; var10 < 0; var10++) {
							byte var11 = arg0[var1++];
							if (var11 != 0) {
								if ((var11 & 0x1) == 1) {
									byte var12 = arg0[var1++];
									if (class216.field4052[var7][var8] == null) {
										class216.field4052[var7][var8] = new byte[4096];
									}
									class216.field4052[var7][var8][(-(var10 + 1) << 6) + var9] = (byte) var12;
								}
								if ((var11 & 0x2) == 2) {
									byte var13 = arg0[var1++];
									if (class117.field2126[var7][var8] == null) {
										class117.field2126[var7][var8] = new byte[4096];
									}
									class117.field2126[var7][var8][var9 + (-(var10 + 1) << 6)] = (byte) (var13 - 28);
								}
								if ((var11 & 0x4) == 4) {
									var1 += 3;
									int var14 = (arg0[var1 - 1] & 0xFF) + ((arg0[var1 - 3] & 0xFF) << 16) + ((arg0[var1 - 2] & 0xFF) << 8);
									if (class48.field895[var7][var8] == null) {
										class48.field895[var7][var8] = new int[4096];
									}
									var14--;
									class148 var15 = class190.method1321(var14);
									if (var15.field2770 != null) {
										var15 = var15.method998();
										if (var15 == null || var15.field2817 == -1) {
											continue;
										}
									}
									class48.field895[var7][var8][(-(var10 + 1) << 6) + var9] = var15.field2831 + 1;
									class65 var16 = new class65();
									var16.field1175 = class44.field760 - var3;
									var16.field1180 = var15.field2817;
									var16.field1179 = var2;
									class232.field4359.method1622(var16);
								}
							}
						}
					}
				} else {
					for (int var4 = 0; var4 < 64; var4++) {
						for (int var5 = -64; var5 < 0; var5++) {
							byte var6 = arg0[var1++];
							if (var6 != 0) {
								if ((var6 & 0x1) == 1) {
									var1++;
								}
								if ((var6 & 0x2) == 2) {
									var1++;
								}
								if ((var6 & 0x4) == 4) {
									var1 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("na.b(I)V")
	public void method938() {
		int var1 = this.field2629;
		class148 var2 = this.field2634.method998();
		if (var2 == null) {
			this.field2635 = null;
			this.field2645 = 0;
			this.field2629 = -1;
			this.field2638 = 0;
			this.field2640 = 0;
		} else {
			this.field2638 = var2.field2771 * 128;
			this.field2635 = var2.field2815;
			this.field2645 = var2.field2807;
			this.field2629 = var2.field2806;
			this.field2640 = var2.field2795;
		}
		if (var1 != this.field2629 && this.field2644 != null) {
			class226.field4248.method1509(this.field2644);
			this.field2644 = null;
		}
	}
}
