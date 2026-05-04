package deob;

import java.awt.Component;
import java.io.IOException;

@ObfuscatedName("kg")
public final class class116 extends class23 {

	@ObfuscatedName("kg.ab")
	public static final byte[][][] field2098 = new byte[4][104][104];

	@ObfuscatedName("kg.db")
	public static int field2101;

	@ObfuscatedName("kg.eb")
	public static int field2102 = 0;

	@ObfuscatedName("kg.fb")
	public static boolean field2103 = false;

	@ObfuscatedName("kg.gb")
	public static byte[][] field2104;

	@ObfuscatedName("kg.jb")
	public static int field2107;

	@ObfuscatedName("kg.T")
	public static volatile long field2091 = 0L;

	@ObfuscatedName("kg.R")
	public static final class88 field2089 = class208.method1423(105, "titlebutton");

	@ObfuscatedName("kg.Q")
	public int field2088 = 4096;

	@ObfuscatedName("kg.Z")
	public int field2097 = 0;

	@ObfuscatedName("kg.X")
	public static class130[] field2095;

	@ObfuscatedName("kg.a(BI)V")
	public static void method788(int arg0) {
		if (arg0 == -1 && !class110.field2012) {
			class1.method5();
		} else if (arg0 != -1 && (arg0 != class2.field25 || !class102.method707()) && class65.field1183 != 0 && !class110.field2012) {
			class106.method730(class65.field1183, arg0, class99.field1814);
		}
		class2.field25 = arg0;
	}

	@ObfuscatedName("kg.f(I)V")
	public static void method789() {
		if (class114.field2061 > 1) {
			class114.field2061--;
			class208.field3952 = class67.field1211;
		}
		if (class105.field1910 > 0) {
			class105.field1910--;
		}
		if (class58.field1097) {
			class58.field1097 = false;
			class201.method1380();
			return;
		}
		for (int var0 = 0; var0 < 100 && class12.method61(); var0++) {
		}
		if (class229.field4284 != 30) {
			return;
		}
		class15.method71(class146.field2747);
		Object var1 = class219.field4143.field715;
		synchronized (class219.field4143.field715) {
			if (!class57.field1077) {
				class219.field4143.field718 = 0;
			} else if (class36.field625 != 0 || class219.field4143.field718 >= 40) {
				class146.field2747.method30(111);
				class146.field2747.method346(0);
				int var2 = class146.field2747.field831;
				int var3 = 0;
				for (int var4 = 0; var4 < class219.field4143.field718 && class146.field2747.field831 - var2 < 240; var4++) {
					var3++;
					int var5 = class219.field4143.field719[var4];
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 502) {
						var5 = 502;
					}
					int var6 = class219.field4143.field720[var4];
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 764) {
						var6 = 764;
					}
					int var7 = var5 * 765 + var6;
					if (class219.field4143.field719[var4] == -1 && class219.field4143.field720[var4] == -1) {
						var7 = 524287;
						var6 = -1;
						var5 = -1;
					}
					if (var6 != class7.field110 || class211.field4004 != var5) {
						int var8 = var5 - class211.field4004;
						class211.field4004 = var5;
						int var9 = var6 - class7.field110;
						class7.field110 = var6;
						if (class147.field2765 < 8 && var9 >= -32 && var9 <= 31 && var8 >= -32 && var8 <= 31) {
							var8 += 32;
							var9 += 32;
							class146.field2747.method305(var8 + (class147.field2765 << 12) + (var9 << 6));
							class147.field2765 = 0;
						} else if (class147.field2765 < 8) {
							class146.field2747.method337((class147.field2765 << 19) + var7 + 8388608);
							class147.field2765 = 0;
						} else {
							class146.field2747.method338(var7 + (class147.field2765 << 19) - 1073741824);
							class147.field2765 = 0;
						}
					} else if (class147.field2765 < 2047) {
						class147.field2765++;
					}
				}
				class146.field2747.method341(class146.field2747.field831 - var2);
				if (var3 < class219.field4143.field718) {
					class219.field4143.field718 -= var3;
					for (int var10 = 0; var10 < class219.field4143.field718; var10++) {
						class219.field4143.field720[var10] = class219.field4143.field720[var10 + var3];
						class219.field4143.field719[var10] = class219.field4143.field719[var10 + var3];
					}
				} else {
					class219.field4143.field718 = 0;
				}
			}
		}
		if (class36.field625 != 0) {
			long var11 = (class36.field623 - class99.field1804) / 50L;
			class99.field1804 = class36.field623;
			int var13 = class172.field3339;
			int var14 = class226.field4239;
			if (var13 < 0) {
				var13 = 0;
			} else if (var13 > 502) {
				var13 = 502;
			}
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 764) {
				var14 = 764;
			}
			if (var11 > 4095L) {
				var11 = 4095L;
			}
			byte var15 = 0;
			int var16 = var13 * 765 + var14;
			if (class36.field625 == 2) {
				var15 = 1;
			}
			class146.field2747.method30(63);
			int var17 = (int) var11;
			class146.field2747.method326((var15 << 19) + ((var17 << 20) + var16));
		}
		if (class247.field4511[96] || class247.field4511[97] || class247.field4511[98] || class247.field4511[99]) {
			class176.field3546 = true;
		}
		if (class88.field1638 > 0) {
			class88.field1638--;
		}
		if (class176.field3546 && class88.field1638 <= 0) {
			class176.field3546 = false;
			class88.field1638 = 20;
			class146.field2747.method30(173);
			class146.field2747.method331(class207.field3930);
			class146.field2747.method305(class64.field1173);
		}
		if (class175.field3520 && !class22.field355) {
			class22.field355 = true;
			class146.field2747.method30(130);
			class146.field2747.method346(1);
		}
		if (!class175.field3520 && class22.field355) {
			class22.field355 = false;
			class146.field2747.method30(130);
			class146.field2747.method346(0);
		}
		class190.method1328();
		if (class229.field4284 != 30) {
			return;
		}
		class113.method773();
		class48.method367();
		class192.field3700++;
		if (class192.field3700 > 750) {
			class201.method1380();
			return;
		}
		class171.method1214();
		class167.method1144();
		class153.method1046();
		if (class90.field1706 != null) {
			class189.method1315();
		}
		if (class157.field3017 != 0) {
			class45.field796 += 20;
			if (class45.field796 >= 400) {
				class157.field3017 = 0;
			}
		}
		class17.field261++;
		if (class57.field1091 != null) {
			class139.field2573++;
			if (class139.field2573 >= 15) {
				class200.method1371(class57.field1091);
				class57.field1091 = null;
			}
		}
		if (class135.field2514 != null) {
			class200.method1371(class135.field2514);
			class248.field4535++;
			if (class28.field471 > class219.field4146 + 5 || class219.field4146 - 5 > class28.field471 || class239.field4449 > class48.field894 + 5 || class48.field894 - 5 > class239.field4449) {
				class43.field739 = true;
			}
			if (class156.field3016 == 0) {
				if (class43.field739 && class248.field4535 >= 5) {
					if (class135.field2514 == class225.field4229 && class18.field305 != class172.field3333) {
						class174 var18 = class135.field2514;
						byte var19 = 0;
						if (class155.field2991 == 1 && var18.field3439 == 206) {
							var19 = 1;
						}
						if (var18.field3388[class172.field3333] <= 0) {
							var19 = 0;
						}
						if (class159.method1070(class80.method530(var18))) {
							int var20 = class18.field305;
							int var21 = class172.field3333;
							var18.field3388[var21] = var18.field3388[var20];
							var18.field3474[var21] = var18.field3474[var20];
							var18.field3388[var20] = -1;
							var18.field3474[var20] = 0;
						} else if (var19 == 1) {
							int var22 = class18.field305;
							int var23 = class172.field3333;
							while (var23 != var22) {
								if (var23 < var22) {
									var18.method1244(var22 - 1, var22);
									var22--;
								} else if (var22 < var23) {
									var18.method1244(var22 + 1, var22);
									var22++;
								}
							}
						} else {
							var18.method1244(class172.field3333, class18.field305);
						}
						class146.field2747.method30(207);
						class146.field2747.method351(class135.field2514.field3423);
						class146.field2747.method314(class18.field305);
						class146.field2747.method327(var19);
						class146.field2747.method344(class172.field3333);
					}
				} else if ((class203.field3859 == 1 || class234.method1554(class203.field3862 - 1)) && class203.field3862 > 2) {
					class136.method904();
				} else if (class203.field3862 > 0) {
					class175.method1257(class203.field3862 - 1);
				}
				class36.field625 = 0;
				class139.field2573 = 10;
				class135.field2514 = null;
			}
		}
		class81.field1467 = 0;
		class149.field2905 = false;
		class122.field2217 = null;
		class174 var24 = class36.field635;
		class174 var25 = class65.field1177;
		class65.field1177 = null;
		class29.field487 = false;
		class36.field635 = null;
		while (class43.method279() && class81.field1467 < 128) {
			class242.field4479[class81.field1467] = class137.field2556;
			class191.field3685[class81.field1467] = class219.field4148;
			class81.field1467++;
		}
		class90.field1706 = null;
		if (class43.field723 != -1) {
			class230.method1533(0, class145.field2725, 0, 0, class222.field4192, class43.field723, 0);
		}
		class67.field1211++;
		while (true) {
			class39 var26;
			class174 var27;
			class174 var28;
			do {
				var26 = (class39) class35.field619.method1613();
				if (var26 == null) {
					while (true) {
						class39 var29;
						class174 var30;
						class174 var31;
						do {
							var29 = (class39) class199.field3810.method1613();
							if (var29 == null) {
								while (true) {
									class39 var32;
									class174 var33;
									class174 var34;
									do {
										var32 = (class39) class74.field1349.method1613();
										if (var32 == null) {
											if (class175.field3532 && class90.field1706 == null) {
												class175.field3532 = false;
											}
											if (class179.field3568 != null) {
												class99.method688();
											}
											if (class114.field2057 != -1) {
												int var35 = class114.field2057;
												int var36 = class90.field1714;
												boolean var37 = class207.method1421(0, 0, var36, var35, class240.field4456.field4087[0], 0, 0, 0, true, 0, class240.field4456.field4141[0]);
												class114.field2057 = -1;
												if (var37) {
													class147.field2757 = class226.field4239;
													class45.field796 = 0;
													class155.field2997 = class172.field3339;
													class157.field3017 = 1;
												}
											}
											class50.method372();
											if (var25 != class65.field1177) {
												if (var25 != null) {
													class200.method1371(var25);
												}
												if (class65.field1177 != null) {
													class200.method1371(class65.field1177);
												}
											}
											if (var24 != class36.field635 && class138.field2563 == class46.field859) {
												if (var24 != null) {
													class200.method1371(var24);
												}
												if (class36.field635 != null) {
													class200.method1371(class36.field635);
												}
											}
											if (class36.field635 == null) {
												if (class46.field859 > 0) {
													class46.field859--;
												}
											} else if (class138.field2563 > class46.field859) {
												class46.field859++;
												if (class138.field2563 == class46.field859) {
													class200.method1371(class36.field635);
												}
											}
											class180.method1283();
											if (class179.field3567) {
												class239.method1577();
											}
											for (int var38 = 0; var38 < 5; var38++) {
												int var10002 = class190.field3674[var38]++;
											}
											int var39 = class147.method984();
											int var40 = class105.method729();
											if (var39 > 4500 && var40 > 4500) {
												class105.field1910 = 250;
												class151.method1031(4000);
												class146.field2747.method30(226);
											}
											class111.field2027++;
											class77.field1384++;
											class144.field2707++;
											if (class111.field2027 > 500) {
												class111.field2027 = 0;
												int var41 = (int) (Math.random() * 8.0D);
												if ((var41 & 0x4) == 4) {
													class98.field1795 += class29.field481;
												}
												if ((var41 & 0x2) == 2) {
													class33.field536 += class232.field4357;
												}
												if ((var41 & 0x1) == 1) {
													class223.field4199 += class136.field2531;
												}
											}
											if (class77.field1384 > 500) {
												class77.field1384 = 0;
												int var42 = (int) (Math.random() * 8.0D);
												if ((var42 & 0x2) == 2) {
													class65.field1185 += class161.field3111;
												}
												if ((var42 & 0x1) == 1) {
													class52.field943 += class88.field1644;
												}
											}
											if (class65.field1185 < -20) {
												class161.field3111 = 1;
											}
											if (class65.field1185 > 10) {
												class161.field3111 = -1;
											}
											if (class33.field536 < -55) {
												class232.field4357 = 2;
											}
											if (class52.field943 < -60) {
												class88.field1644 = 2;
											}
											if (class98.field1795 < -40) {
												class29.field481 = 1;
											}
											if (class33.field536 > 55) {
												class232.field4357 = -2;
											}
											if (class98.field1795 > 40) {
												class29.field481 = -1;
											}
											if (class52.field943 > 60) {
												class88.field1644 = -2;
											}
											if (class223.field4199 < -50) {
												class136.field2531 = 2;
											}
											if (class223.field4199 > 50) {
												class136.field2531 = -2;
											}
											if (class144.field2707 > 50) {
												class146.field2747.method30(19);
											}
											try {
												if (class33.field556 != null && class146.field2747.field831 > 0) {
													class33.field556.method911(class146.field2747.field831, class146.field2747.field842);
													class146.field2747.field831 = 0;
													class144.field2707 = 0;
													return;
												}
												return;
											} catch (IOException var43) {
												class201.method1380();
												return;
											}
										}
										var33 = var32.field678;
										if (var33.field3406 < 0) {
											break;
										}
										var34 = class239.method1579(var33.field3504);
									} while (var34 == null || var34.field3465 == null || var33.field3406 >= var34.field3465.length || var34.field3465[var33.field3406] != var33);
									class200.method1373(var32);
								}
							}
							var30 = var29.field678;
							if (var30.field3406 < 0) {
								break;
							}
							var31 = class239.method1579(var30.field3504);
						} while (var31 == null || var31.field3465 == null || var31.field3465.length <= var30.field3406 || var31.field3465[var30.field3406] != var30);
						class200.method1373(var29);
					}
				}
				var27 = var26.field678;
				if (var27.field3406 < 0) {
					break;
				}
				var28 = class239.method1579(var27.field3504);
			} while (var28 == null || var28.field3465 == null || var28.field3465.length <= var27.field3406 || var27 != var28.field3465[var27.field3406]);
			class200.method1373(var26);
		}
	}

	@ObfuscatedName("kg.a(BLjava/awt/Component;)V")
	public static void method790(Component arg0) {
		arg0.removeMouseListener(class43.field732);
		arg0.removeMouseMotionListener(class43.field732);
		arg0.removeFocusListener(class43.field732);
		class46.field807 = 0;
	}

	public class116() {
		super(1, false);
	}

	@ObfuscatedName("kg.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				int var5 = var3[var4];
				if (this.field2097 > var5) {
					var2[var4] = this.field2097;
				} else if (this.field2088 >= var5) {
					var2[var4] = var5;
				} else {
					var2[var4] = this.field2088;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kg.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[2];
			int[] var6 = var3[1];
			int[] var7 = var2[1];
			int[] var8 = var2[2];
			int[] var9 = var2[0];
			for (int var10 = 0; var10 < class70.field1276; var10++) {
				int var11 = var4[var10];
				int var12 = var6[var10];
				int var13 = var5[var10];
				if (var11 < this.field2097) {
					var9[var10] = this.field2097;
				} else if (this.field2088 >= var11) {
					var9[var10] = var11;
				} else {
					var9[var10] = this.field2088;
				}
				if (this.field2097 > var12) {
					var7[var10] = this.field2097;
				} else if (this.field2088 < var12) {
					var7[var10] = this.field2088;
				} else {
					var7[var10] = var12;
				}
				if (var13 < this.field2097) {
					var8[var10] = this.field2097;
				} else if (var13 > this.field2088) {
					var8[var10] = this.field2088;
				} else {
					var8[var10] = var13;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kg.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2097 = arg0.method301();
		} else if (arg1 == 1) {
			this.field2088 = arg0.method301();
		} else if (arg1 == 2) {
			super.field369 = arg0.method347() == 1;
		}
	}
}
