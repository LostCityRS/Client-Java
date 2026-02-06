package deob;

import java.util.Date;

@ObfuscatedName("we")
public final class class158 {

	@ObfuscatedName("we.a")
	public static int field3608 = 0;

	@ObfuscatedName("we.b")
	public final int field3609;

	@ObfuscatedName("we.e")
	public static class47 field3612 = new class47(5000);

	@ObfuscatedName("we.f")
	public static volatile int field3613 = 0;

	@ObfuscatedName("we.g")
	public boolean field3614 = true;

	@ObfuscatedName("we.h")
	public final int field3615;

	@ObfuscatedName("we.i")
	public static int field3616 = 0;

	@ObfuscatedName("we.l")
	public static volatile boolean field3619 = false;

	@ObfuscatedName("we.m")
	public static int[] field3620 = new int[500];

	@ObfuscatedName("we.n")
	public final int field3621;

	@ObfuscatedName("we.o")
	public static class32 field3622 = class73.method593("wave2:", true);

	@ObfuscatedName("we.k")
	public static class32 field3618 = field3622;

	@ObfuscatedName("we.p")
	public static class32 field3623 = class73.method593("Unerwartete Antwort vom Anmelde)2Server)3", true);

	@ObfuscatedName("we.q")
	public static class49[] field3624 = new class49[1000];

	@ObfuscatedName("we.r")
	public static class32 field3625 = class73.method593("blinken2:", true);

	@ObfuscatedName("we.s")
	public static class32[] field3626 = new class32[1000];

	@ObfuscatedName("we.t")
	public static int field3627 = 0;

	@ObfuscatedName("we.u")
	public static class32 field3628 = field3622;

	@ObfuscatedName("we.v")
	public static class36 field3629 = null;

	@ObfuscatedName("we.w")
	public final int field3630;

	@ObfuscatedName("we.D")
	public static int field3637 = 0;

	@ObfuscatedName("we.I")
	public static class32 field3641 = class73.method593("weiss:", true);

	@ObfuscatedName("we.G")
	public static class32 field3639 = class73.method593("RuneScape is loading )2 please wait)3)3)3", true);

	@ObfuscatedName("we.J")
	public static class32 field3642 = field3639;

	@ObfuscatedName("we.H")
	public static class32 field3640 = class73.method593("(Z", true);

	@ObfuscatedName("we.E")
	public static int field3638 = 255;

	@ObfuscatedName("we.z")
	public final int field3633;

	@ObfuscatedName("we.x")
	public final int field3631;

	@ObfuscatedName("we.C")
	public static int field3636;

	@ObfuscatedName("we.A")
	public static class30 field3634;

	@ObfuscatedName("we.B")
	public static class30 field3635;

	@ObfuscatedName("we.a(Z)V")
	public static void method1221() {
		try {
			if (class98.field2263 == 1) {
				int var0 = class83.field1966.method112();
				if (var0 > 0 && class83.field1966.method90()) {
					int var1 = var0 - class73.field1724;
					if (var1 < 0) {
						var1 = 0;
					}
					class83.field1966.method89(var1);
				} else {
					class83.field1966.method115();
					class83.field1966.method91();
					class159.field3644 = null;
					if (class34.field718 == null) {
						class98.field2263 = 0;
					} else {
						class98.field2263 = 2;
					}
					class129.field2977 = null;
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			class83.field1966.method115();
			class159.field3644 = null;
			class98.field2263 = 0;
			class129.field2977 = null;
			class34.field718 = null;
		}
	}

	@ObfuscatedName("we.a(Lbd;B)V")
	public static void method1222(class12 arg0) {
		Object[] var1 = arg0.field208;
		int var2 = (Integer) var1[0];
		class143 var3 = class32.method276(var2);
		if (var3 == null) {
			return;
		}
		class140.field3233 = 0;
		int var4 = 0;
		int var5 = 0;
		int[] var6 = var3.field3265;
		int[] var7 = var3.field3270;
		byte var8 = -1;
		int var9 = -1;
		try {
			class39.field928 = new class32[var3.field3264];
			int var10 = 0;
			class3.field47 = new int[var3.field3259];
			int var11 = 0;
			for (int var12 = 1; var12 < var1.length; var12++) {
				if (var1[var12] instanceof Integer) {
					int var14 = (Integer) var1[var12];
					if (var14 == -2147483647) {
						var14 = arg0.field204;
					}
					if (var14 == -2147483646) {
						var14 = arg0.field210;
					}
					if (var14 == -2147483645) {
						var14 = arg0.field209 == null ? -1 : arg0.field209.field743;
					}
					if (var14 == -2147483644) {
						var14 = arg0.field205;
					}
					if (var14 == -2147483643) {
						var14 = arg0.field209 == null ? -1 : arg0.field209.field828;
					}
					if (var14 == -2147483642) {
						var14 = arg0.field202 == null ? -1 : arg0.field202.field743;
					}
					if (var14 == -2147483641) {
						var14 = arg0.field202 == null ? -1 : arg0.field202.field828;
					}
					if (var14 == -2147483640) {
						var14 = arg0.field199;
					}
					if (var14 == -2147483639) {
						var14 = arg0.field207;
					}
					class3.field47[var10++] = var14;
				} else if (var1[var12] instanceof class32) {
					class32 var13 = (class32) var1[var12];
					if (var13.method272(class103.field2406)) {
						var13 = arg0.field203;
					}
					class39.field928[var11++] = var13;
				}
			}
			int var15 = 0;
			label1965: while (true) {
				var15++;
				if (var15 > 200000) {
					throw new RuntimeException("slow");
				}
				var9++;
				int var270 = var6[var9];
				if (var270 < 100) {
					if (var270 == 0) {
						class38.field916[var5++] = var7[var9];
						continue;
					}
					if (var270 == 1) {
						int var16 = var7[var9];
						class38.field916[var5++] = class27.field504[var16];
						continue;
					}
					if (var270 == 2) {
						int var17 = var7[var9];
						var5--;
						class27.field504[var17] = class38.field916[var5];
						continue;
					}
					if (var270 == 3) {
						class56.field1305[var4++] = var3.field3268[var9];
						continue;
					}
					if (var270 == 6) {
						var9 += var7[var9];
						continue;
					}
					if (var270 == 7) {
						var5 -= 2;
						if (class38.field916[var5] != class38.field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 8) {
						var5 -= 2;
						if (class38.field916[var5] == class38.field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 9) {
						var5 -= 2;
						if (class38.field916[var5 + 1] > class38.field916[var5]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 10) {
						var5 -= 2;
						if (class38.field916[var5] > class38.field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 21) {
						if (class140.field3233 == 0) {
							return;
						}
						class126 var18 = class56.field1302[--class140.field3233];
						class39.field928 = var18.field2916;
						var9 = var18.field2920;
						var3 = var18.field2921;
						var6 = var3.field3265;
						class3.field47 = var18.field2917;
						var7 = var3.field3270;
						continue;
					}
					if (var270 == 25) {
						int var19 = var7[var9];
						class38.field916[var5++] = class70.method577(var19);
						continue;
					}
					if (var270 == 27) {
						int var20 = var7[var9];
						var5--;
						class159.method1227(class38.field916[var5], var20);
						continue;
					}
					if (var270 == 31) {
						var5 -= 2;
						if (class38.field916[var5] <= class38.field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 32) {
						var5 -= 2;
						if (class38.field916[var5 + 1] <= class38.field916[var5]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 33) {
						class38.field916[var5++] = class3.field47[var7[var9]];
						continue;
					}
					int var10001;
					if (var270 == 34) {
						var10001 = var7[var9];
						var5--;
						class3.field47[var10001] = class38.field916[var5];
						continue;
					}
					if (var270 == 35) {
						class56.field1305[var4++] = class39.field928[var7[var9]];
						continue;
					}
					if (var270 == 36) {
						var10001 = var7[var9];
						var4--;
						class39.field928[var10001] = class56.field1305[var4];
						continue;
					}
					if (var270 == 37) {
						int var21 = var7[var9];
						var4 -= var21;
						class32 var22 = class84.method655(class56.field1305, var21, var4);
						class56.field1305[var4++] = var22;
						continue;
					}
					if (var270 == 38) {
						var5--;
						continue;
					}
					if (var270 == 39) {
						var4--;
						continue;
					}
					if (var270 == 40) {
						int var23 = var7[var9];
						class143 var24 = class32.method276(var23);
						int[] var25 = new int[var24.field3259];
						class32[] var26 = new class32[var24.field3264];
						for (int var27 = 0; var27 < var24.field3267; var27++) {
							var25[var27] = class38.field916[var5 + var27 - var24.field3267];
						}
						for (int var28 = 0; var28 < var24.field3263; var28++) {
							var26[var28] = class56.field1305[var4 + var28 - var24.field3263];
						}
						var4 -= var24.field3263;
						var5 -= var24.field3267;
						class126 var29 = new class126();
						var29.field2920 = var9;
						var29.field2921 = var3;
						var9 = -1;
						var29.field2916 = class39.field928;
						var3 = var24;
						var29.field2917 = class3.field47;
						class56.field1302[class140.field3233++] = var29;
						class3.field47 = var25;
						var6 = var24.field3265;
						class39.field928 = var26;
						var7 = var24.field3270;
						continue;
					}
					if (var270 == 42) {
						class38.field916[var5++] = class79.field1831[var7[var9]];
						continue;
					}
					if (var270 == 43) {
						var10001 = var7[var9];
						var5--;
						class79.field1831[var10001] = class38.field916[var5];
						continue;
					}
					if (var270 == 44) {
						int var30 = var7[var9] >> 16;
						int var31 = var7[var9] & 0xFFFF;
						var5--;
						int var32 = class38.field916[var5];
						if (var32 >= 0 && var32 <= 5000) {
							class110.field2581[var30] = var32;
							byte var33 = -1;
							if (var31 == 105) {
								var33 = 0;
							}
							int var34 = 0;
							while (true) {
								if (var34 >= var32) {
									continue label1965;
								}
								class91.field2079[var30][var34] = var33;
								var34++;
							}
						}
						throw new RuntimeException();
					}
					if (var270 == 45) {
						int var35 = var7[var9];
						var5--;
						int var36 = class38.field916[var5];
						if (var36 >= 0 && var36 < class110.field2581[var35]) {
							class38.field916[var5++] = class91.field2079[var35][var36];
							continue;
						}
						throw new RuntimeException();
					}
					if (var270 == 46) {
						int var37 = var7[var9];
						var5 -= 2;
						int var38 = class38.field916[var5];
						if (var38 >= 0 && class110.field2581[var37] > var38) {
							class91.field2079[var37][var38] = class38.field916[var5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (var270 == 47) {
						class32 var39 = field3626[var7[var9]];
						if (var39 == null) {
							var39 = class84.field1970;
						}
						class56.field1305[var4++] = var39;
						continue;
					}
					if (var270 == 48) {
						var10001 = var7[var9];
						var4--;
						field3626[var10001] = class56.field1305[var4];
						continue;
					}
				}
				boolean var40;
				if (var7[var9] == 1) {
					var40 = true;
				} else {
					var40 = false;
				}
				if (var270 < 1000) {
					if (var270 == 100) {
						var5 -= 3;
						int var41 = class38.field916[var5];
						int var42 = class38.field916[var5 + 1];
						int var43 = class38.field916[var5 + 2];
						if (var42 == 0) {
							throw new RuntimeException();
						}
						class36 var44 = class128.method991(var41);
						if (var44.field754 == null) {
							var44.field754 = new class36[var43 + 1];
						}
						if (var43 >= var44.field754.length) {
							class36[] var45 = new class36[var43 + 1];
							for (int var46 = 0; var46 < var44.field754.length; var46++) {
								var45[var46] = var44.field754[var46];
							}
							var44.field754 = var45;
						}
						if (var43 > 0 && var44.field754[var43 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var43 - 1));
						}
						class36 var47 = new class36();
						var47.field755 = var42;
						var47.field848 = true;
						var47.field828 = var43;
						var47.field864 = var47.field743 = var44.field743;
						var44.field754[var43] = var47;
						if (var40) {
							class63.field1447 = var47;
						} else {
							class157.field3604 = var47;
						}
						class132.method1008(var44);
						continue;
					}
					if (var270 == 101) {
						class36 var48 = var40 ? class63.field1447 : class157.field3604;
						class36 var49 = class128.method991(var48.field743);
						var49.field754[var48.field828] = null;
						class132.method1008(var49);
						continue;
					}
					if (var270 == 102) {
						var5--;
						class36 var50 = class128.method991(class38.field916[var5]);
						var50.field754 = null;
						class132.method1008(var50);
						continue;
					}
					if (var270 == 200) {
						var5 -= 2;
						int var51 = class38.field916[var5 + 1];
						int var52 = class38.field916[var5];
						class36 var53 = class130.method1000(var51, var52);
						if (var53 != null && var51 != -1) {
							class38.field916[var5++] = 1;
							if (var40) {
								class63.field1447 = var53;
							} else {
								class157.field3604 = var53;
							}
							continue;
						}
						class38.field916[var5++] = 0;
						continue;
					}
				} else if (var270 >= 1000 && var270 < 1100 || !(var270 < 2000 || var270 >= 2100)) {
					class36 var263;
					if (var270 < 2000) {
						var263 = var40 ? class63.field1447 : class157.field3604;
					} else {
						var270 -= 1000;
						var5--;
						var263 = class128.method991(class38.field916[var5]);
					}
					if (var270 == 1000) {
						var5 -= 2;
						var263.field829 = class38.field916[var5];
						var263.field855 = class38.field916[var5 + 1];
						class132.method1008(var263);
						continue;
					}
					if (var270 == 1001) {
						var5 -= 2;
						var263.field810 = class38.field916[var5];
						var263.field773 = class38.field916[var5 + 1];
						class132.method1008(var263);
						continue;
					}
					if (var270 == 1003) {
						var5--;
						boolean var264 = class38.field916[var5] == 1;
						if (var263.field740 != var264) {
							var263.field740 = var264;
							class132.method1008(var263);
						}
						continue;
					}
				} else if (var270 >= 1100 && var270 < 1200 || !(var270 < 2100 || var270 >= 2200)) {
					class36 var54;
					if (var270 >= 2000) {
						var270 -= 1000;
						var5--;
						var54 = class128.method991(class38.field916[var5]);
					} else {
						var54 = var40 ? class63.field1447 : class157.field3604;
					}
					if (var270 == 1100) {
						var5 -= 2;
						var54.field843 = class38.field916[var5];
						if (var54.field860 - var54.field810 < var54.field843) {
							var54.field843 = var54.field860 - var54.field810;
						}
						if (var54.field843 < 0) {
							var54.field843 = 0;
						}
						var54.field872 = class38.field916[var5 + 1];
						if (var54.field872 > var54.field820 - var54.field773) {
							var54.field872 = var54.field820 - var54.field773;
						}
						if (var54.field872 < 0) {
							var54.field872 = 0;
						}
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1101) {
						var5--;
						var54.field776 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1102) {
						var5--;
						var54.field803 = class38.field916[var5] == 1;
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1103) {
						var5--;
						var54.field861 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1104) {
						var5--;
						var54.field788 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1105) {
						var5--;
						var54.field819 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1106) {
						var5--;
						var54.field777 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1107) {
						var5--;
						var54.field748 = class38.field916[var5] == 1;
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1108) {
						var54.field770 = 1;
						var5--;
						var54.field849 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1109) {
						var5 -= 6;
						var54.field816 = class38.field916[var5];
						var54.field851 = class38.field916[var5 + 1];
						var54.field812 = class38.field916[var5 + 2];
						var54.field874 = class38.field916[var5 + 3];
						var54.field750 = class38.field916[var5 + 4];
						var54.field808 = class38.field916[var5 + 5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1110) {
						var5--;
						int var55 = class38.field916[var5];
						if (var55 != var54.field765) {
							var54.field839 = 0;
							var54.field762 = 0;
							var54.field765 = var55;
							class132.method1008(var54);
						}
						continue;
					}
					if (var270 == 1111) {
						var5--;
						var54.field853 = class38.field916[var5] == 1;
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1112) {
						var4--;
						class32 var56 = class56.field1305[var4];
						if (!var56.method272(var54.field763)) {
							var54.field763 = var56;
							class132.method1008(var54);
						}
						continue;
					}
					if (var270 == 1113) {
						var5--;
						var54.field807 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1114) {
						var5 -= 3;
						var54.field841 = class38.field916[var5];
						var54.field799 = class38.field916[var5 + 1];
						var54.field838 = class38.field916[var5 + 2];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1115) {
						var5--;
						var54.field856 = class38.field916[var5] == 1;
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1116) {
						var5--;
						var54.field796 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1117) {
						var5--;
						var54.field817 = class38.field916[var5];
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1118) {
						var5--;
						var54.field814 = class38.field916[var5] == 1;
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1119) {
						var5--;
						var54.field772 = class38.field916[var5] == 1;
						class132.method1008(var54);
						continue;
					}
					if (var270 == 1120) {
						var5 -= 2;
						var54.field860 = class38.field916[var5];
						var54.field820 = class38.field916[var5 + 1];
						class132.method1008(var54);
						continue;
					}
				} else if (var270 >= 1200 && var270 < 1300 || !(var270 < 2200 || var270 >= 2300)) {
					class36 var57;
					if (var270 < 2000) {
						var57 = var40 ? class63.field1447 : class157.field3604;
					} else {
						var270 -= 1000;
						var5--;
						var57 = class128.method991(class38.field916[var5]);
					}
					class132.method1008(var57);
					if (var270 == 1200) {
						var5 -= 2;
						int var58 = class38.field916[var5];
						int var59 = class38.field916[var5 + 1];
						var57.field786 = var59;
						var57.field804 = var58;
						class62 var60 = class146.method1092(var58);
						var57.field874 = var60.field1416;
						var57.field812 = var60.field1426;
						var57.field808 = var60.field1391;
						var57.field851 = var60.field1376;
						var57.field750 = var60.field1374;
						if (var57.field810 > 0) {
							var57.field808 = var57.field808 * 32 / var57.field810;
						}
						var57.field816 = var60.field1384;
						continue;
					}
					if (var270 == 1201) {
						var57.field770 = 2;
						var5--;
						var57.field849 = class38.field916[var5];
						continue;
					}
					if (var270 == 1202) {
						var57.field770 = 3;
						var57.field849 = class20.field373.field1631.method234();
						continue;
					}
				} else if ((var270 < 1300 || var270 >= 1400) && (var270 < 2300 || var270 >= 2400)) {
					if (var270 >= 1400 && var270 < 1500 || var270 >= 2400 && var270 < 2500) {
						class36 var61;
						if (var270 < 2000) {
							var61 = var40 ? class63.field1447 : class157.field3604;
						} else {
							var5--;
							var61 = class128.method991(class38.field916[var5]);
							var270 -= 1000;
						}
						var4--;
						class32 var62 = class56.field1305[var4];
						int[] var63 = null;
						if (var62.method240() > 0 && var62.method260(var62.method240() - 1) == 89) {
							var5--;
							int var64 = class38.field916[var5];
							if (var64 > 0) {
								var63 = new int[var64];
								while (var64-- > 0) {
									var5--;
									var63[var64] = class38.field916[var5];
								}
							}
							var62 = var62.method241(0, var62.method240() - 1);
						}
						Object[] var65 = new Object[var62.method240() + 1];
						for (int var66 = var65.length - 1; var66 >= 1; var66--) {
							if (var62.method260(var66 - 1) == 115) {
								var4--;
								var65[var66] = class56.field1305[var4];
							} else {
								var5--;
								var65[var66] = Integer.valueOf(class38.field916[var5]);
							}
						}
						var5--;
						int var67 = class38.field916[var5];
						if (var67 == -1) {
							var65 = null;
						} else {
							var65[0] = Integer.valueOf(var67);
						}
						if (var270 == 1405) {
							var61.field852 = var65;
						}
						if (var270 == 1412) {
							var61.field836 = var65;
						}
						if (var270 == 1400) {
							var61.field865 = var65;
						}
						if (var270 == 1406) {
							var61.field802 = var65;
						}
						if (var270 == 1404) {
							var61.field775 = var65;
						}
						if (var270 == 1415) {
							var61.field771 = var65;
							var61.field875 = var63;
						}
						if (var270 == 1421) {
							var61.field793 = var65;
						}
						if (var270 == 1418) {
							var61.field782 = var65;
						}
						if (var270 == 1402) {
							var61.field835 = var65;
						}
						if (var270 == 1401) {
							var61.field779 = var65;
						}
						if (var270 == 1424) {
							var61.field795 = var65;
						}
						if (var270 == 1414) {
							var61.field747 = var63;
							var61.field751 = var65;
						}
						var61.field847 = true;
						if (var270 == 1409) {
							var61.field794 = var65;
						}
						if (var270 == 1420) {
							var61.field780 = var65;
						}
						if (var270 == 1407) {
							var61.field821 = var63;
							var61.field800 = var65;
						}
						if (var270 == 1422) {
							var61.field822 = var65;
						}
						if (var270 == 1419) {
							var61.field741 = var65;
						}
						if (var270 == 1416) {
							var61.field837 = var65;
						}
						if (var270 == 1423) {
							var61.field758 = var65;
						}
						if (var270 == 1417) {
							var61.field866 = var65;
						}
						if (var270 == 1403) {
							var61.field850 = var65;
						}
						if (var270 == 1411) {
							var61.field846 = var65;
						}
						if (var270 == 1410) {
							var61.field871 = var65;
						}
						if (var270 == 1408) {
							var61.field766 = var65;
						}
						continue;
					}
					if (var270 < 1600) {
						class36 var258 = var40 ? class63.field1447 : class157.field3604;
						if (var270 == 1500) {
							class38.field916[var5++] = var258.field829;
							continue;
						}
						if (var270 == 1501) {
							class38.field916[var5++] = var258.field855;
							continue;
						}
						if (var270 == 1502) {
							class38.field916[var5++] = var258.field810;
							continue;
						}
						if (var270 == 1503) {
							class38.field916[var5++] = var258.field773;
							continue;
						}
						if (var270 == 1504) {
							class38.field916[var5++] = var258.field740 ? 1 : 0;
							continue;
						}
						if (var270 == 1505) {
							class38.field916[var5++] = var258.field864;
							continue;
						}
					} else if (var270 < 1700) {
						class36 var68 = var40 ? class63.field1447 : class157.field3604;
						if (var270 == 1600) {
							class38.field916[var5++] = var68.field843;
							continue;
						}
						if (var270 == 1601) {
							class38.field916[var5++] = var68.field872;
							continue;
						}
						if (var270 == 1602) {
							class56.field1305[var4++] = var68.field763;
							continue;
						}
						if (var270 == 1603) {
							class38.field916[var5++] = var68.field860;
							continue;
						}
						if (var270 == 1604) {
							class38.field916[var5++] = var68.field820;
							continue;
						}
						if (var270 == 1605) {
							class38.field916[var5++] = var68.field808;
							continue;
						}
						if (var270 == 1606) {
							class38.field916[var5++] = var68.field812;
							continue;
						}
						if (var270 == 1607) {
							class38.field916[var5++] = var68.field750;
							continue;
						}
						if (var270 == 1608) {
							class38.field916[var5++] = var68.field874;
							continue;
						}
					} else if (var270 < 1800) {
						class36 var69 = var40 ? class63.field1447 : class157.field3604;
						if (var270 == 1700) {
							class38.field916[var5++] = var69.field804;
							continue;
						}
						if (var270 == 1701) {
							if (var69.field804 == -1) {
								class38.field916[var5++] = 0;
							} else {
								class38.field916[var5++] = var69.field786;
							}
							continue;
						}
						if (var270 == 1702) {
							class38.field916[var5++] = var69.field828;
							continue;
						}
					} else if (var270 < 1900) {
						class36 var256 = var40 ? class63.field1447 : class157.field3604;
						if (var270 == 1800) {
							class38.field916[var5++] = class98.method768(class147.method1100(var256));
							continue;
						}
						if (var270 == 1801) {
							var5--;
							int var257 = class38.field916[var5];
							int var272 = var257 - 1;
							if (var256.field738 != null && var256.field738.length > var272 && var256.field738[var272] != null) {
								class56.field1305[var4++] = var256.field738[var272];
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 1802) {
							if (var256.field813 == null) {
								class56.field1305[var4++] = class159.field3652;
							} else {
								class56.field1305[var4++] = var256.field813;
							}
							continue;
						}
					} else if (var270 < 2600) {
						var5--;
						class36 var70 = class128.method991(class38.field916[var5]);
						if (var270 == 2500) {
							class38.field916[var5++] = var70.field829;
							continue;
						}
						if (var270 == 2501) {
							class38.field916[var5++] = var70.field855;
							continue;
						}
						if (var270 == 2502) {
							class38.field916[var5++] = var70.field810;
							continue;
						}
						if (var270 == 2503) {
							class38.field916[var5++] = var70.field773;
							continue;
						}
						if (var270 == 2504) {
							class38.field916[var5++] = var70.field740 ? 1 : 0;
							continue;
						}
						if (var270 == 2505) {
							class38.field916[var5++] = var70.field864;
							continue;
						}
					} else if (var270 < 2700) {
						var5--;
						class36 var255 = class128.method991(class38.field916[var5]);
						if (var270 == 2600) {
							class38.field916[var5++] = var255.field843;
							continue;
						}
						if (var270 == 2601) {
							class38.field916[var5++] = var255.field872;
							continue;
						}
						if (var270 == 2602) {
							class56.field1305[var4++] = var255.field763;
							continue;
						}
						if (var270 == 2603) {
							class38.field916[var5++] = var255.field860;
							continue;
						}
						if (var270 == 2604) {
							class38.field916[var5++] = var255.field820;
							continue;
						}
						if (var270 == 2605) {
							class38.field916[var5++] = var255.field808;
							continue;
						}
						if (var270 == 2606) {
							class38.field916[var5++] = var255.field812;
							continue;
						}
						if (var270 == 2607) {
							class38.field916[var5++] = var255.field750;
							continue;
						}
						if (var270 == 2608) {
							class38.field916[var5++] = var255.field874;
							continue;
						}
					} else if (var270 < 2800) {
						if (var270 == 2700) {
							var5--;
							class36 var71 = class128.method991(class38.field916[var5]);
							class38.field916[var5++] = var71.field804;
							continue;
						}
						if (var270 == 2701) {
							var5--;
							class36 var72 = class128.method991(class38.field916[var5]);
							if (var72.field804 == -1) {
								class38.field916[var5++] = 0;
							} else {
								class38.field916[var5++] = var72.field786;
							}
							continue;
						}
						if (var270 == 2702) {
							var5--;
							int var73 = class38.field916[var5];
							class144 var74 = (class144) class109.field2571.method1196((long) var73);
							if (var74 == null) {
								class38.field916[var5++] = 0;
							} else {
								class38.field916[var5++] = 1;
							}
							continue;
						}
					} else if (var270 < 2900) {
						var5--;
						class36 var75 = class128.method991(class38.field916[var5]);
						if (var270 == 2800) {
							class38.field916[var5++] = class98.method768(class147.method1100(var75));
							continue;
						}
						if (var270 == 2801) {
							var5--;
							int var76 = class38.field916[var5];
							int var271 = var76 - 1;
							if (var75.field738 != null && var75.field738.length > var271 && var75.field738[var271] != null) {
								class56.field1305[var4++] = var75.field738[var271];
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 2802) {
							if (var75.field813 == null) {
								class56.field1305[var4++] = class159.field3652;
							} else {
								class56.field1305[var4++] = var75.field813;
							}
							continue;
						}
					} else if (var270 < 3200) {
						if (var270 == 3100) {
							var4--;
							class32 var241 = class56.field1305[var4];
							class79.method628(var241, 0, class159.field3652);
							continue;
						}
						if (var270 == 3101) {
							var5 -= 2;
							class134.method1023(class38.field916[var5 + 1], class20.field373, class38.field916[var5]);
							continue;
						}
						if (var270 == 3103) {
							class110.method871();
							continue;
						}
						if (var270 == 3104) {
							var4--;
							class32 var242 = class56.field1305[var4];
							int var243 = 0;
							if (var242.method274()) {
								var243 = var242.method261();
							}
							class44.field1026.method356(216);
							class44.field1026.method530(var243);
							continue;
						}
						if (var270 == 3105) {
							var4--;
							class32 var244 = class56.field1305[var4];
							class44.field1026.method356(36);
							class44.field1026.method541(var244.method259());
							continue;
						}
						if (var270 == 3106) {
							var4--;
							class32 var245 = class56.field1305[var4];
							class44.field1026.method356(86);
							class44.field1026.method514(var245.method240() + 1);
							class44.field1026.method521(var245);
							continue;
						}
						if (var270 == 3107) {
							var5--;
							int var246 = class38.field916[var5];
							var4--;
							class32 var247 = class56.field1305[var4];
							class149.method1108(var246, var247);
							continue;
						}
						if (var270 == 3108) {
							var5 -= 3;
							int var248 = class38.field916[var5];
							int var249 = class38.field916[var5 + 1];
							int var250 = class38.field916[var5 + 2];
							class36 var251 = class128.method991(var250);
							class17.method127(var251, var249, var248);
							continue;
						}
						if (var270 == 3109) {
							var5 -= 2;
							int var252 = class38.field916[var5];
							int var253 = class38.field916[var5 + 1];
							class36 var254 = var40 ? class63.field1447 : class157.field3604;
							class17.method127(var254, var253, var252);
							continue;
						}
					} else if (var270 < 3300) {
						if (var270 == 3200) {
							var5 -= 3;
							class4.method17(class38.field916[var5], class38.field916[var5 + 2], class38.field916[var5 + 1]);
							continue;
						}
						if (var270 == 3201) {
							var5--;
							class102.method825(class38.field916[var5]);
							continue;
						}
						if (var270 == 3202) {
							var5 -= 2;
							class38.method315(class38.field916[var5], class38.field916[var5 + 1]);
							continue;
						}
					} else if (var270 < 3400) {
						if (var270 == 3300) {
							class38.field916[var5++] = class140.field3217;
							continue;
						}
						if (var270 == 3301) {
							var5 -= 2;
							int var77 = class38.field916[var5];
							int var78 = class38.field916[var5 + 1];
							class38.field916[var5++] = class73.method597(var78, var77);
							continue;
						}
						if (var270 == 3302) {
							var5 -= 2;
							int var79 = class38.field916[var5];
							int var80 = class38.field916[var5 + 1];
							class38.field916[var5++] = class52.method406(var79, var80);
							continue;
						}
						if (var270 == 3303) {
							var5 -= 2;
							int var81 = class38.field916[var5 + 1];
							int var82 = class38.field916[var5];
							class38.field916[var5++] = class29.method196(var82, var81);
							continue;
						}
						if (var270 == 3304) {
							var5--;
							int var83 = class38.field916[var5];
							class38.field916[var5++] = class91.method724(var83).field3207;
							continue;
						}
						if (var270 == 3305) {
							var5--;
							int var84 = class38.field916[var5];
							class38.field916[var5++] = class137.field3173[var84];
							continue;
						}
						if (var270 == 3306) {
							var5--;
							int var85 = class38.field916[var5];
							class38.field916[var5++] = class50.field1159[var85];
							continue;
						}
						if (var270 == 3307) {
							var5--;
							int var86 = class38.field916[var5];
							class38.field916[var5++] = class17.field343[var86];
							continue;
						}
						if (var270 == 3308) {
							int var87 = class43.field989;
							int var88 = (class20.field373.field2747 >> 7) + class72.field1700;
							int var89 = class118.field2836 + (class20.field373.field2698 >> 7);
							class38.field916[var5++] = var89 + (var87 << 28) + (var88 << 14);
							continue;
						}
						if (var270 == 3309) {
							var5--;
							int var90 = class38.field916[var5];
							class38.field916[var5++] = var90 >> 14 & 0x3FFF;
							continue;
						}
						if (var270 == 3310) {
							var5--;
							int var91 = class38.field916[var5];
							class38.field916[var5++] = var91 >> 28;
							continue;
						}
						if (var270 == 3311) {
							var5--;
							int var92 = class38.field916[var5];
							class38.field916[var5++] = var92 & 0x3FFF;
							continue;
						}
						if (var270 == 3312) {
							class38.field916[var5++] = class146.field3315 ? 1 : 0;
							continue;
						}
						if (var270 == 3313) {
							var5 -= 2;
							int var93 = class38.field916[var5] + 32768;
							int var94 = class38.field916[var5 + 1];
							class38.field916[var5++] = class73.method597(var94, var93);
							continue;
						}
						if (var270 == 3314) {
							var5 -= 2;
							int var95 = class38.field916[var5] + 32768;
							int var96 = class38.field916[var5 + 1];
							class38.field916[var5++] = class52.method406(var95, var96);
							continue;
						}
						if (var270 == 3315) {
							var5 -= 2;
							int var97 = class38.field916[var5] + 32768;
							int var98 = class38.field916[var5 + 1];
							class38.field916[var5++] = class29.method196(var97, var98);
							continue;
						}
						if (var270 == 3316) {
							if (class145.field3301 >= 2) {
								class38.field916[var5++] = class145.field3301;
							} else {
								class38.field916[var5++] = 0;
							}
							continue;
						}
						if (var270 == 3317) {
							class38.field916[var5++] = class56.field1294;
							continue;
						}
						if (var270 == 3318) {
							class38.field916[var5++] = class86.field2014;
							continue;
						}
						if (var270 == 3321) {
							class38.field916[var5++] = class136.field3153;
							continue;
						}
						if (var270 == 3322) {
							class38.field916[var5++] = class3.field49;
							continue;
						}
						if (var270 == 3323) {
							if (class145.field3301 == 1) {
								class38.field916[var5++] = 1;
							} else {
								class38.field916[var5++] = 0;
							}
							continue;
						}
					} else if (var270 < 3500) {
						if (var270 == 3400) {
							var5 -= 2;
							int var99 = class38.field916[var5];
							int var100 = class38.field916[var5 + 1];
							class130 var101 = class119.method938(var99);
							for (int var102 = 0; var102 < var101.field2991; var102++) {
								if (var100 == var101.field2985[var102]) {
									class56.field1305[var4++] = var101.field2989[var102];
									var101 = null;
									break;
								}
							}
							if (var101 != null) {
								class56.field1305[var4++] = var101.field2984;
							}
							continue;
						}
						if (var270 == 3408) {
							var5 -= 4;
							int var103 = class38.field916[var5 + 1];
							int var104 = class38.field916[var5];
							int var105 = class38.field916[var5 + 2];
							int var106 = class38.field916[var5 + 3];
							class130 var107 = class119.method938(var105);
							if (var107.field3005 == var104 && var103 == var107.field3002) {
								for (int var108 = 0; var108 < var107.field2991; var108++) {
									if (var106 == var107.field2985[var108]) {
										if (var103 == 115) {
											class56.field1305[var4++] = var107.field2989[var108];
										} else {
											class38.field916[var5++] = var107.field2988[var108];
										}
										var107 = null;
										break;
									}
								}
								if (var107 != null) {
									if (var103 == 115) {
										class56.field1305[var4++] = var107.field2984;
									} else {
										class38.field916[var5++] = var107.field2996;
									}
								}
								continue;
							}
							if (var103 == 115) {
								class56.field1305[var4++] = class84.field1970;
							} else {
								class38.field916[var5++] = 0;
							}
							continue;
						}
					} else if (var270 < 3700) {
						if (var270 == 3600) {
							if (class61.field1356 == 0) {
								class38.field916[var5++] = -2;
							} else if (class61.field1356 == 1) {
								class38.field916[var5++] = -1;
							} else {
								class38.field916[var5++] = class2.field20;
							}
							continue;
						}
						if (var270 == 3601) {
							var5--;
							int var223 = class38.field916[var5];
							if (class61.field1356 == 2 && class2.field20 > var223) {
								class56.field1305[var4++] = class14.field239[var223];
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 3602) {
							var5--;
							int var224 = class38.field916[var5];
							if (class61.field1356 == 2 && class2.field20 > var224) {
								class38.field916[var5++] = class91.field2094[var224];
								continue;
							}
							class38.field916[var5++] = 0;
							continue;
						}
						if (var270 == 3603) {
							var5--;
							int var225 = class38.field916[var5];
							if (class61.field1356 == 2 && class2.field20 > var225) {
								class38.field916[var5++] = class5.field103[var225];
								continue;
							}
							class38.field916[var5++] = 0;
							continue;
						}
						if (var270 == 3604) {
							var4--;
							class32 var226 = class56.field1305[var4];
							var5--;
							int var227 = class38.field916[var5];
							class94.method744(var227, var226);
							continue;
						}
						if (var270 == 3605) {
							var4--;
							class32 var228 = class56.field1305[var4];
							class91.method719(var228.method259());
							continue;
						}
						if (var270 == 3606) {
							var4--;
							class32 var229 = class56.field1305[var4];
							class36.method305(var229.method259());
							continue;
						}
						if (var270 == 3607) {
							var4--;
							class32 var230 = class56.field1305[var4];
							class23.method164(var230.method259());
							continue;
						}
						if (var270 == 3608) {
							var4--;
							class32 var231 = class56.field1305[var4];
							class27.method189(var231.method259());
							continue;
						}
						if (var270 == 3609) {
							var4--;
							class32 var232 = class56.field1305[var4];
							if (var232.method262(class50.field1152) || var232.method262(class75.field1768)) {
								var232 = var232.method268(7);
							}
							class38.field916[var5++] = class117.method922(var232) ? 1 : 0;
							continue;
						}
						if (var270 == 3611) {
							if (class131.field3010 == null) {
								class56.field1305[var4++] = class159.field3652;
							} else {
								class56.field1305[var4++] = class131.field3010.method264();
							}
							continue;
						}
						if (var270 == 3612) {
							if (class131.field3010 == null) {
								class38.field916[var5++] = 0;
							} else {
								class38.field916[var5++] = field3636;
							}
							continue;
						}
						if (var270 == 3613) {
							var5--;
							int var233 = class38.field916[var5];
							if (class131.field3010 != null && var233 < field3636) {
								class56.field1305[var4++] = class111.field2609[var233].field885.method264();
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 3614) {
							var5--;
							int var234 = class38.field916[var5];
							if (class131.field3010 != null && var234 < field3636) {
								class38.field916[var5++] = class111.field2609[var234].field887;
								continue;
							}
							class38.field916[var5++] = 0;
							continue;
						}
						if (var270 == 3615) {
							var5--;
							int var235 = class38.field916[var5];
							if (class131.field3010 != null && var235 < field3636) {
								class38.field916[var5++] = class111.field2609[var235].field880;
								continue;
							}
							class38.field916[var5++] = 0;
							continue;
						}
						if (var270 == 3616) {
							class38.field916[var5++] = class102.field2389;
							continue;
						}
						if (var270 == 3617) {
							var4--;
							class32 var236 = class56.field1305[var4];
							class91.method725(var236);
							continue;
						}
						if (var270 == 3618) {
							class38.field916[var5++] = class149.field3383;
							continue;
						}
						if (var270 == 3619) {
							var4--;
							class32 var237 = class56.field1305[var4];
							class149.method1112(var237.method259());
							continue;
						}
						if (var270 == 3620) {
							class115.method903();
							continue;
						}
						if (var270 == 3621) {
							if (class61.field1356 == 0) {
								class38.field916[var5++] = -1;
							} else {
								class38.field916[var5++] = class106.field2504;
							}
							continue;
						}
						if (var270 == 3622) {
							var5--;
							int var238 = class38.field916[var5];
							if (class61.field1356 != 0 && var238 < class106.field2504) {
								class56.field1305[var4++] = class9.method59(class103.field2407[var238]).method264();
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 3623) {
							var4--;
							class32 var239 = class56.field1305[var4];
							if (var239.method262(class50.field1152) || var239.method262(class75.field1768)) {
								var239 = var239.method268(7);
							}
							class38.field916[var5++] = class111.method876(var239) ? 1 : 0;
							continue;
						}
						if (var270 == 3624) {
							var5--;
							int var240 = class38.field916[var5];
							if (class111.field2609 != null && field3636 > var240 && class111.field2609[var240].field885.method271(class20.field373.field1659)) {
								class38.field916[var5++] = 1;
								continue;
							}
							class38.field916[var5++] = 0;
							continue;
						}
						if (var270 == 3625) {
							if (class126.field2924 == null) {
								class56.field1305[var4++] = class159.field3652;
							} else {
								class56.field1305[var4++] = class126.field2924.method264();
							}
							continue;
						}
					} else if (var270 < 4100) {
						if (var270 == 4000) {
							var5 -= 2;
							int var109 = class38.field916[var5 + 1];
							int var110 = class38.field916[var5];
							class38.field916[var5++] = var110 + var109;
							continue;
						}
						if (var270 == 4001) {
							var5 -= 2;
							int var111 = class38.field916[var5];
							int var112 = class38.field916[var5 + 1];
							class38.field916[var5++] = var111 - var112;
							continue;
						}
						if (var270 == 4002) {
							var5 -= 2;
							int var113 = class38.field916[var5 + 1];
							int var114 = class38.field916[var5];
							class38.field916[var5++] = var114 * var113;
							continue;
						}
						if (var270 == 4003) {
							var5 -= 2;
							int var115 = class38.field916[var5];
							int var116 = class38.field916[var5 + 1];
							class38.field916[var5++] = var115 / var116;
							continue;
						}
						if (var270 == 4004) {
							var5--;
							int var117 = class38.field916[var5];
							class38.field916[var5++] = (int) (Math.random() * (double) var117);
							continue;
						}
						if (var270 == 4005) {
							var5--;
							int var118 = class38.field916[var5];
							class38.field916[var5++] = (int) ((double) (var118 + 1) * Math.random());
							continue;
						}
						if (var270 == 4006) {
							var5 -= 5;
							int var119 = class38.field916[var5];
							int var120 = class38.field916[var5 + 1];
							int var121 = class38.field916[var5 + 2];
							int var122 = class38.field916[var5 + 4];
							int var123 = class38.field916[var5 + 3];
							class38.field916[var5++] = (var120 - var119) * (var122 + -var121) / (var123 - var121) + var119;
							continue;
						}
						if (var270 == 4007) {
							var5 -= 2;
							int var124 = class38.field916[var5];
							int var125 = class38.field916[var5 + 1];
							class38.field916[var5++] = var125 * var124 / 100 + var124;
							continue;
						}
						if (var270 == 4008) {
							var5 -= 2;
							int var126 = class38.field916[var5];
							int var127 = class38.field916[var5 + 1];
							class38.field916[var5++] = 0x1 << var127 | var126;
							continue;
						}
						if (var270 == 4009) {
							var5 -= 2;
							int var128 = class38.field916[var5];
							int var129 = class38.field916[var5 + 1];
							class38.field916[var5++] = var128 & -(0x1 << var129) - 1;
							continue;
						}
						if (var270 == 4010) {
							var5 -= 2;
							int var130 = class38.field916[var5 + 1];
							int var131 = class38.field916[var5];
							class38.field916[var5++] = (0x1 << var130 & var131) == 0 ? 0 : 1;
							continue;
						}
						if (var270 == 4011) {
							var5 -= 2;
							int var132 = class38.field916[var5];
							int var133 = class38.field916[var5 + 1];
							class38.field916[var5++] = var132 % var133;
							continue;
						}
						if (var270 == 4012) {
							var5 -= 2;
							int var134 = class38.field916[var5];
							int var135 = class38.field916[var5 + 1];
							if (var134 == 0) {
								class38.field916[var5++] = 0;
							} else {
								class38.field916[var5++] = (int) Math.pow((double) var134, (double) var135);
							}
							continue;
						}
						if (var270 == 4013) {
							var5 -= 2;
							int var136 = class38.field916[var5 + 1];
							int var137 = class38.field916[var5];
							if (var137 == 0) {
								class38.field916[var5++] = 0;
							} else if (var136 == 0) {
								class38.field916[var5++] = Integer.MAX_VALUE;
							} else {
								class38.field916[var5++] = (int) Math.pow((double) var137, 1.0D / (double) var136);
							}
							continue;
						}
						if (var270 == 4014) {
							var5 -= 2;
							int var138 = class38.field916[var5 + 1];
							int var139 = class38.field916[var5];
							class38.field916[var5++] = var138 & var139;
							continue;
						}
						if (var270 == 4015) {
							var5 -= 2;
							int var140 = class38.field916[var5];
							int var141 = class38.field916[var5 + 1];
							class38.field916[var5++] = var141 | var140;
							continue;
						}
					} else if (var270 < 4200) {
						if (var270 == 4100) {
							var4--;
							class32 var142 = class56.field1305[var4];
							var5--;
							int var143 = class38.field916[var5];
							class56.field1305[var4++] = class52.method402(new class32[] { var142, class159.method1228(var143) });
							continue;
						}
						if (var270 == 4101) {
							var4 -= 2;
							class32 var144 = class56.field1305[var4];
							class32 var145 = class56.field1305[var4 + 1];
							class56.field1305[var4++] = class52.method402(new class32[] { var144, var145 });
							continue;
						}
						if (var270 == 4102) {
							var4--;
							class32 var146 = class56.field1305[var4];
							var5--;
							int var147 = class38.field916[var5];
							class56.field1305[var4++] = class52.method402(new class32[] { var146, class145.method1090(var147) });
							continue;
						}
						if (var270 == 4103) {
							var4--;
							class32 var148 = class56.field1305[var4];
							class56.field1305[var4++] = var148.method270();
							continue;
						}
						if (var270 == 4104) {
							var5--;
							int var149 = class38.field916[var5];
							long var150 = (long) var149 * 86400000L + 1014768000000L;
							class146.field3311.setTime(new Date(var150));
							int var152 = class146.field3311.get(5);
							int var153 = class146.field3311.get(2);
							int var154 = class146.field3311.get(1);
							class56.field1305[var4++] = class52.method402(new class32[] { class159.method1228(var152), class85.field1984, class147.field3333[var153], class85.field1984, class159.method1228(var154) });
							continue;
						}
						if (var270 == 4105) {
							var4 -= 2;
							class32 var155 = class56.field1305[var4 + 1];
							class32 var156 = class56.field1305[var4];
							if (class20.field373.field1631 != null && class20.field373.field1631.field606) {
								class56.field1305[var4++] = var155;
								continue;
							}
							class56.field1305[var4++] = var156;
							continue;
						}
						if (var270 == 4106) {
							var5--;
							int var157 = class38.field916[var5];
							class56.field1305[var4++] = class159.method1228(var157);
							continue;
						}
						if (var270 == 4107) {
							var4 -= 2;
							class38.field916[var5++] = class56.field1305[var4].method245(class56.field1305[var4 + 1]);
							continue;
						}
						if (var270 == 4108) {
							var5 -= 2;
							var4--;
							class32 var158 = class56.field1305[var4];
							int var159 = class38.field916[var5];
							int var160 = class38.field916[var5 + 1];
							byte[] var161 = class157.field3596.method206(var160, 0);
							class96 var162 = new class96(var161);
							class38.field916[var5++] = var162.method775(var158, var159);
							continue;
						}
						if (var270 == 4109) {
							var5 -= 2;
							int var163 = class38.field916[var5 + 1];
							var4--;
							class32 var164 = class56.field1305[var4];
							int var165 = class38.field916[var5];
							byte[] var166 = class157.field3596.method206(var163, 0);
							class96 var167 = new class96(var166);
							class38.field916[var5++] = var167.method789(var164, var165);
							continue;
						}
						if (var270 == 4110) {
							var4 -= 2;
							class32 var168 = class56.field1305[var4];
							class32 var169 = class56.field1305[var4 + 1];
							var5--;
							if (class38.field916[var5] == 1) {
								class56.field1305[var4++] = var168;
							} else {
								class56.field1305[var4++] = var169;
							}
							continue;
						}
						if (var270 == 4111) {
							var4--;
							class32 var170 = class56.field1305[var4];
							class56.field1305[var4++] = class99.method771(var170);
							continue;
						}
						if (var270 == 4112) {
							var5--;
							int var171 = class38.field916[var5];
							var4--;
							class32 var172 = class56.field1305[var4];
							class56.field1305[var4++] = var172.method277(var171);
							continue;
						}
						if (var270 == 4113) {
							var5--;
							int var173 = class38.field916[var5];
							class38.field916[var5++] = class23.method166(var173) ? 1 : 0;
							continue;
						}
						if (var270 == 4114) {
							var5--;
							int var174 = class38.field916[var5];
							class38.field916[var5++] = class157.method1212(var174) ? 1 : 0;
							continue;
						}
						if (var270 == 4115) {
							var5--;
							int var175 = class38.field916[var5];
							class38.field916[var5++] = class79.method626(var175) ? 1 : 0;
							continue;
						}
						if (var270 == 4116) {
							var5--;
							int var176 = class38.field916[var5];
							class38.field916[var5++] = class154.method1193(var176) ? 1 : 0;
							continue;
						}
						if (var270 == 4117) {
							var4--;
							class32 var177 = class56.field1305[var4];
							if (var177 == null) {
								class38.field916[var5++] = 0;
							} else {
								class38.field916[var5++] = var177.method240();
							}
							continue;
						}
						if (var270 == 4118) {
							var5 -= 2;
							var4--;
							class32 var178 = class56.field1305[var4];
							int var179 = class38.field916[var5];
							int var180 = class38.field916[var5 + 1];
							class56.field1305[var4++] = var178.method241(var179, var180);
							continue;
						}
						if (var270 == 4119) {
							var4--;
							class32 var181 = class56.field1305[var4];
							class32 var182 = class64.method491(var181.method240());
							boolean var183 = false;
							for (int var184 = 0; var184 < var181.method240(); var184++) {
								int var185 = var181.method260(var184);
								if (var185 == 60) {
									var183 = true;
								} else if (var185 == 62) {
									var183 = false;
								} else if (!var183) {
									var182.method273(var185);
								}
							}
							var182.method269();
							class56.field1305[var4++] = var182;
							continue;
						}
						if (var270 == 4120) {
							var4--;
							class32 var186 = class56.field1305[var4];
							var5--;
							int var187 = class38.field916[var5];
							class38.field916[var5++] = var186.method263(var187);
							continue;
						}
					} else if (var270 < 4300) {
						if (var270 == 4200) {
							var5--;
							int var209 = class38.field916[var5];
							class56.field1305[var4++] = class146.method1092(var209).field1429;
							continue;
						}
						if (var270 == 4201) {
							var5 -= 2;
							int var210 = class38.field916[var5];
							int var211 = class38.field916[var5 + 1];
							class62 var212 = class146.method1092(var210);
							if (var211 >= 1 && var211 <= 5 && var212.field1410[var211 - 1] != null) {
								class56.field1305[var4++] = var212.field1410[var211 - 1];
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 4202) {
							var5 -= 2;
							int var213 = class38.field916[var5];
							int var214 = class38.field916[var5 + 1];
							class62 var215 = class146.method1092(var213);
							if (var214 >= 1 && var214 <= 5 && var215.field1428[var214 - 1] != null) {
								class56.field1305[var4++] = var215.field1428[var214 - 1];
								continue;
							}
							class56.field1305[var4++] = class159.field3652;
							continue;
						}
						if (var270 == 4203) {
							var5--;
							int var216 = class38.field916[var5];
							class38.field916[var5++] = class146.method1092(var216).field1375;
							continue;
						}
						if (var270 == 4204) {
							var5--;
							int var217 = class38.field916[var5];
							class38.field916[var5++] = class146.method1092(var217).field1409 == 1 ? 1 : 0;
							continue;
						}
						if (var270 == 4205) {
							var5--;
							int var218 = class38.field916[var5];
							class62 var219 = class146.method1092(var218);
							if (var219.field1388 == -1 && var219.field1411 >= 0) {
								class38.field916[var5++] = var219.field1411;
								continue;
							}
							class38.field916[var5++] = var218;
							continue;
						}
						if (var270 == 4206) {
							var5--;
							int var220 = class38.field916[var5];
							class62 var221 = class146.method1092(var220);
							if (var221.field1388 >= 0 && var221.field1411 >= 0) {
								class38.field916[var5++] = var221.field1411;
								continue;
							}
							class38.field916[var5++] = var220;
							continue;
						}
						if (var270 == 4207) {
							var5--;
							int var222 = class38.field916[var5];
							class38.field916[var5++] = class146.method1092(var222).field1392 ? 1 : 0;
							continue;
						}
					} else if (var270 < 5100) {
						if (var270 == 5000) {
							class38.field916[var5++] = class2.field21;
							continue;
						}
						if (var270 == 5001) {
							var5 -= 3;
							class2.field21 = class38.field916[var5];
							class2.field23 = class38.field916[var5 + 1];
							class43.field990 = class38.field916[var5 + 2];
							class44.field1026.method356(69);
							class44.field1026.method514(class2.field21);
							class44.field1026.method514(class2.field23);
							class44.field1026.method514(class43.field990);
							continue;
						}
						if (var270 == 5002) {
							var4--;
							class32 var188 = class56.field1305[var4];
							var5 -= 2;
							int var189 = class38.field916[var5 + 1];
							int var190 = class38.field916[var5];
							class44.field1026.method356(192);
							class44.field1026.method541(var188.method259());
							class44.field1026.method514(var190 - 1);
							class44.field1026.method514(var189);
							continue;
						}
						if (var270 == 5003) {
							var5--;
							int var191 = class38.field916[var5];
							class32 var192 = null;
							if (var191 < 100) {
								var192 = class36.field832[var191];
							}
							if (var192 == null) {
								var192 = class159.field3652;
							}
							class56.field1305[var4++] = var192;
							continue;
						}
						if (var270 == 5004) {
							var5--;
							int var193 = class38.field916[var5];
							int var194 = -1;
							if (var193 < 100 && class36.field832[var193] != null) {
								var194 = class17.field347[var193];
							}
							class38.field916[var5++] = var194;
							continue;
						}
						if (var270 == 5005) {
							class38.field916[var5++] = class2.field23;
							continue;
						}
						if (var270 == 5008) {
							var4--;
							class32 var195 = class56.field1305[var4];
							if (var195.method262(class134.field3110)) {
								class152.method1186(var195);
							} else {
								class32 var196 = var195.method270();
								byte var197 = 0;
								byte var198 = 0;
								if (var196.method262(class128.field2947)) {
									var198 = 0;
									var195 = var195.method268(class128.field2947.method240());
								} else if (var196.method262(class94.field2177)) {
									var198 = 1;
									var195 = var195.method268(class94.field2177.method240());
								} else if (var196.method262(class38.field906)) {
									var195 = var195.method268(class38.field906.method240());
									var198 = 2;
								} else if (var196.method262(class151.field3463)) {
									var198 = 3;
									var195 = var195.method268(class151.field3463.method240());
								} else if (var196.method262(class130.field3000)) {
									var198 = 4;
									var195 = var195.method268(class130.field3000.method240());
								} else if (var196.method262(class5.field107)) {
									var195 = var195.method268(class5.field107.method240());
									var198 = 5;
								} else if (var196.method262(class27.field488)) {
									var198 = 6;
									var195 = var195.method268(class27.field488.method240());
								} else if (var196.method262(class39.field931)) {
									var198 = 7;
									var195 = var195.method268(class39.field931.method240());
								} else if (var196.method262(class5.field84)) {
									var195 = var195.method268(class5.field84.method240());
									var198 = 8;
								} else if (var196.method262(class45.field1073)) {
									var198 = 9;
									var195 = var195.method268(class45.field1073.method240());
								} else if (var196.method262(class137.field3188)) {
									var198 = 10;
									var195 = var195.method268(class137.field3188.method240());
								} else if (var196.method262(class118.field2824)) {
									var198 = 11;
									var195 = var195.method268(class118.field2824.method240());
								} else if (class20.field371 != 0) {
									if (var196.method262(class128.field2962)) {
										var198 = 0;
										var195 = var195.method268(class128.field2962.method240());
									} else if (var196.method262(class94.field2163)) {
										var195 = var195.method268(class94.field2163.method240());
										var198 = 1;
									} else if (var196.method262(class38.field918)) {
										var198 = 2;
										var195 = var195.method268(class38.field918.method240());
									} else if (var196.method262(class151.field3470)) {
										var198 = 3;
										var195 = var195.method268(class151.field3470.method240());
									} else if (var196.method262(class130.field2994)) {
										var198 = 4;
										var195 = var195.method268(class130.field2994.method240());
									} else if (var196.method262(class5.field109)) {
										var198 = 5;
										var195 = var195.method268(class5.field109.method240());
									} else if (var196.method262(class27.field489)) {
										var195 = var195.method268(class27.field489.method240());
										var198 = 6;
									} else if (var196.method262(class39.field942)) {
										var195 = var195.method268(class39.field942.method240());
										var198 = 7;
									} else if (var196.method262(class5.field83)) {
										var195 = var195.method268(class5.field83.method240());
										var198 = 8;
									} else if (var196.method262(class45.field1074)) {
										var198 = 9;
										var195 = var195.method268(class45.field1074.method240());
									} else if (var196.method262(class137.field3192)) {
										var195 = var195.method268(class137.field3192.method240());
										var198 = 10;
									} else if (var196.method262(class118.field2818)) {
										var198 = 11;
										var195 = var195.method268(class118.field2818.method240());
									}
								}
								class32 var199 = var195.method270();
								if (var199.method262(class62.field1439)) {
									var195 = var195.method268(class62.field1439.method240());
									var197 = 1;
								} else if (var199.method262(field3618)) {
									var197 = 2;
									var195 = var195.method268(field3618.method240());
								} else if (var199.method262(class106.field2524)) {
									var195 = var195.method268(class106.field2524.method240());
									var197 = 3;
								} else if (var199.method262(class124.field2884)) {
									var197 = 4;
									var195 = var195.method268(class124.field2884.method240());
								} else if (var199.method262(class106.field2523)) {
									var195 = var195.method268(class106.field2523.method240());
									var197 = 5;
								} else if (class20.field371 != 0) {
									if (var199.method262(class62.field1433)) {
										var197 = 1;
										var195 = var195.method268(class62.field1433.method240());
									} else if (var199.method262(field3628)) {
										var197 = 2;
										var195 = var195.method268(field3628.method240());
									} else if (var199.method262(class106.field2531)) {
										var195 = var195.method268(class106.field2531.method240());
										var197 = 3;
									} else if (var199.method262(class124.field2891)) {
										var197 = 4;
										var195 = var195.method268(class124.field2891.method240());
									} else if (var199.method262(class106.field2527)) {
										var195 = var195.method268(class106.field2527.method240());
										var197 = 5;
									}
								}
								class44.field1026.method356(27);
								class44.field1026.method514(0);
								int var200 = class44.field1026.field1568;
								class44.field1026.method514(var198);
								class44.field1026.method514(var197);
								class154.method1194(var195, class44.field1026);
								class44.field1026.method515(class44.field1026.field1568 - var200);
							}
							continue;
						}
						if (var270 == 5009) {
							var4 -= 2;
							class32 var201 = class56.field1305[var4];
							class32 var202 = class56.field1305[var4 + 1];
							class44.field1026.method356(164);
							class44.field1026.method514(0);
							int var203 = class44.field1026.field1568;
							class44.field1026.method541(var201.method259());
							class154.method1194(var202, class44.field1026);
							class44.field1026.method515(class44.field1026.field1568 - var203);
							continue;
						}
						if (var270 == 5010) {
							var5--;
							int var204 = class38.field916[var5];
							class32 var205 = null;
							if (var204 < 100) {
								var205 = class14.field245[var204];
							}
							if (var205 == null) {
								var205 = class159.field3652;
							}
							class56.field1305[var4++] = var205;
							continue;
						}
						if (var270 == 5011) {
							var5--;
							int var206 = class38.field916[var5];
							class32 var207 = null;
							if (var206 < 100) {
								var207 = class111.field2610[var206];
							}
							if (var207 == null) {
								var207 = class159.field3652;
							}
							class56.field1305[var4++] = var207;
							continue;
						}
						if (var270 == 5015) {
							class32 var208;
							if (class20.field373 == null || class20.field373.field1659 == null) {
								var208 = class74.field1751;
							} else {
								var208 = class20.field373.field1659;
							}
							class56.field1305[var4++] = var208;
							continue;
						}
						if (var270 == 5016) {
							class38.field916[var5++] = class43.field990;
							continue;
						}
						if (var270 == 5017) {
							class38.field916[var5++] = class23.field423;
							continue;
						}
					}
				} else {
					class36 var259;
					if (var270 >= 2000) {
						var5--;
						var259 = class128.method991(class38.field916[var5]);
						var270 -= 1000;
					} else {
						var259 = var40 ? class63.field1447 : class157.field3604;
					}
					if (var270 == 1300) {
						var5--;
						int var260 = class38.field916[var5] - 1;
						if (var260 >= 0 && var260 <= 9) {
							var4--;
							var259.method301(class56.field1305[var4], var260);
							continue;
						}
						var4--;
						continue;
					}
					if (var270 == 1301) {
						var5 -= 2;
						int var261 = class38.field916[var5 + 1];
						int var262 = class38.field916[var5];
						var259.field824 = class130.method1000(var261, var262);
						continue;
					}
					if (var270 == 1302) {
						var5--;
						var259.field862 = class38.field916[var5] == 1;
						continue;
					}
					if (var270 == 1303) {
						var5--;
						var259.field760 = class38.field916[var5];
						continue;
					}
					if (var270 == 1304) {
						var5--;
						var259.field746 = class38.field916[var5];
						continue;
					}
					if (var270 == 1305) {
						var4--;
						var259.field813 = class56.field1305[var4];
						continue;
					}
					if (var270 == 1306) {
						var4--;
						var259.field825 = class56.field1305[var4];
						continue;
					}
					if (var270 == 1307) {
						var259.field738 = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var269) {
			if (var3.field3261 == null) {
				if (class70.field1646 != 0) {
					class79.method628(class117.field2808, 0, class159.field3652);
				}
				class110.method870(var269, "CS2 - scr:" + var3.field3324 + " op:" + var8);
			} else {
				class32 var266 = class64.method491(30);
				var266.method243(class34.field714).method243(var3.field3261);
				for (int var267 = class140.field3233 - 1; var267 >= 0; var267--) {
					var266.method243(class83.field1924).method243(class56.field1302[var267].field2921.field3261);
				}
				if (var8 == 40) {
					int var268 = var7[var9];
					var266.method243(class33.field695).method243(class159.method1228(var268));
				}
				if (class70.field1646 != 0) {
					class79.method628(class52.method402(new class32[] { class71.field1675, var3.field3261 }), 0, class159.field3652);
				}
				class110.method870(var269, "CS2 - scr:" + var3.field3324 + " op:" + var8 + new String(var266.method255()));
			}
		}
	}

	@ObfuscatedName("we.a(II[BIIIILvd;I[Lqf;I)V")
	public static void method1224(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class150 arg6, int arg7, class117[] arg8, int arg9) {
		class66 var10 = new class66(arg1);
		int var11 = -1;
		while (true) {
			int var12 = var10.method505();
			if (var12 == 0) {
				return;
			}
			var11 += var12;
			int var13 = 0;
			while (true) {
				int var14 = var10.method505();
				if (var14 == 0) {
					break;
				}
				int var15 = var10.method532();
				var13 += var14 - 1;
				int var16 = var13 >> 6 & 0x3F;
				int var17 = var13 & 0x3F;
				int var18 = var15 & 0x3;
				int var19 = var13 >> 12;
				int var20 = var15 >> 2;
				if (arg2 == var19 && arg9 <= var16 && var16 < arg9 + 8 && arg3 <= var17 && var17 < arg3 + 8) {
					class53 var21 = class5.method22(var11);
					int var22 = arg5 + class143.method1079(var17 & 0x7, var21.field1233, var18, var21.field1222, var16 & 0x7, arg7);
					int var23 = class71.method582(var18, var17 & 0x7, arg7, var21.field1233, var21.field1222, var16 & 0x7) + arg4;
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						int var24 = arg0;
						if ((class3.field50[1][var22][var23] & 0x2) == 2) {
							var24 = arg0 - 1;
						}
						class117 var25 = null;
						if (var24 >= 0) {
							var25 = arg8[var24];
						}
						class109.method868(arg6, var23, var20, var11, arg7 + var18 & 0x3, var25, arg0, var22);
					}
				}
			}
		}
	}

	public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.field3633 = arg5;
		this.field3630 = arg0;
		this.field3631 = arg4;
		this.field3609 = arg1;
		this.field3621 = arg2;
		this.field3615 = arg3;
		this.field3614 = arg6;
	}
}
