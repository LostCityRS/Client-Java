package deob;

import java.awt.Graphics;

@ObfuscatedName("bf")
public final class class14 {

	@ObfuscatedName("bf.d")
	public static class111[] field230 = new class111[32768];

	@ObfuscatedName("bf.e")
	public static int field231 = 0;

	@ObfuscatedName("bf.g")
	public final int[] field233;

	@ObfuscatedName("bf.h")
	public static class32 field234 = null;

	@ObfuscatedName("bf.i")
	public static class32 field235 = class73.method593("Bitte versuchen Sie)1", true);

	@ObfuscatedName("bf.k")
	public static class51[] field237;

	@ObfuscatedName("bf.l")
	public static int[] field238 = new int[2000];

	@ObfuscatedName("bf.m")
	public static class32[] field239 = new class32[200];

	@ObfuscatedName("bf.o")
	public final byte[] field241;

	@ObfuscatedName("bf.r")
	public int[] field244;

	@ObfuscatedName("bf.s")
	public static class32[] field245 = new class32[100];

	@ObfuscatedName("bf.a(Lec;IZ)V")
	public static void method72(class32 arg0, boolean arg1) {
		int var2 = class121.field2876.method789(arg0, 250);
		int var3 = class121.field2876.method775(arg0, 250) * 13;
		class141.method1053(6, 6, var2 + 4 + 4, var3 - -4 + 4, 0);
		class141.method1058(6, 6, var2 + 8, var3 - -4 + 4, 16777215);
		class121.field2876.method769(arg0, 10, 10, var2, var3, 16777215, -1, 1, 1, 0);
		class62.method476(6, 6, var2 + 4 + 4, 4 + 4 + var3);
		if (!arg1) {
			class32.method265(var2, 10, 10, var3);
			return;
		}
		try {
			Graphics var4 = class107.field2539.getGraphics();
			class50.field1157.method122(var4);
		} catch (Exception var5) {
			class107.field2539.repaint();
		}
	}

	@ObfuscatedName("bf.a(ILjd;)V")
	public static void method74(class66 arg0) {
		if (class133.field3047 != null) {
			try {
				class133.field3047.method1184(0L);
				class133.field3047.method1175(arg0.field1586, 24, arg0.field1568);
			} catch (Exception var1) {
			}
		}
		arg0.field1568 += 24;
	}

	@ObfuscatedName("bf.a(IZ[BI)Z")
	public static boolean method76(int arg0, byte[] arg1, int arg2) {
		class66 var3 = new class66(arg1);
		int var4 = -1;
		boolean var5 = true;
		label54: while (true) {
			int var6 = var3.method505();
			if (var6 == 0) {
				return var5;
			}
			var4 += var6;
			boolean var7 = false;
			int var8 = 0;
			while (true) {
				while (!var7) {
					int var10 = var3.method505();
					if (var10 == 0) {
						continue label54;
					}
					var8 += var10 - 1;
					int var11 = var8 >> 6 & 0x3F;
					int var12 = var11 + arg0;
					int var13 = var3.method532() >> 2;
					int var14 = var8 & 0x3F;
					int var15 = var14 + arg2;
					if (var12 > 0 && var15 > 0 && var12 < 103 && var15 < 103) {
						class53 var16 = class5.method22(var4);
						if (var13 != 22 || !class154.field3529 || var16.field1193 != 0 || var16.field1235 == 1 || var16.field1204) {
							var7 = true;
							if (!var16.method414()) {
								class152.field3487++;
								var5 = false;
							}
						}
					}
				}
				int var9 = var3.method505();
				if (var9 == 0) {
					break;
				}
				var3.method532();
			}
		}
	}

	@ObfuscatedName("bf.a(B)V")
	public static void method77() {
		field230 = null;
		field235 = null;
		field234 = null;
		field245 = null;
		field238 = null;
		field239 = null;
		field237 = null;
	}

	@ObfuscatedName("bf.a(BI)Z")
	public static boolean method78(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@ObfuscatedName("bf.a(II)V")
	public static void method79(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = class121.field2868[arg0];
		int var2 = class158.field3620[arg0];
		int var3 = class44.field1034[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = class135.field3135[arg0];
		if (var3 == 7) {
			class44.field1026.method356(252);
			class44.field1026.method556(var2);
			class44.field1026.method513(var1);
			class44.field1026.method546(var4);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 50) {
			class70 var5 = class52.field1175[var4];
			if (var5 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var5.field2759[0], class20.field373.field2759[0], 0, var5.field2736[0], 1, 2);
				class27.field499 = class9.field166;
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class154.field3543 = 0;
				class44.field1026.method356(31);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 10) {
			class111 var6 = field230[var4];
			if (var6 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var6.field2759[0], class20.field373.field2759[0], 0, var6.field2736[0], 1, 2);
				class27.field499 = class9.field166;
				class154.field3543 = 0;
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class44.field1026.method356(185);
				class44.field1026.method513(var4);
			}
		}
		if (var3 == 22) {
			class70 var7 = class52.field1175[var4];
			if (var7 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var7.field2759[0], class20.field373.field2759[0], 0, var7.field2736[0], 1, 2);
				class154.field3545 = class66.field1589;
				class135.field3147 = 2;
				class154.field3543 = 0;
				class27.field499 = class9.field166;
				class44.field1026.method356(29);
				class44.field1026.method556(class43.field1002);
				class44.field1026.method504(class146.field3319);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 8) {
			class36 var8 = class130.method1000(var1, var2);
			if (var8 != null) {
				class105.method856();
				class80.method632(var1, var2, class98.method768(class147.method1100(var8)));
				class125.field2913 = 0;
				class147.field3353 = class61.method459(var8);
				if (class147.field3353 == null) {
					class147.field3353 = class91.field2090;
				}
				if (!var8.field848) {
					field234 = class52.method402(new class32[] { class134.field3128, var8.field833, class130.field2997 });
					return;
				}
				field234 = class52.method402(new class32[] { var8.field813, class130.field2997 });
			}
			return;
		}
		if (var3 == 15) {
			class44.field1026.method356(44);
			class44.field1026.method546(var1);
			class44.field1026.method556(var2);
			class44.field1026.method513(var4);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 36) {
			boolean var9 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var9) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class135.field3147 = 2;
			class27.field499 = class9.field166;
			class154.field3543 = 0;
			class154.field3545 = class66.field1589;
			class44.field1026.method356(80);
			class44.field1026.method548(class72.field1700 + var1);
			class44.field1026.method548(class118.field2836 + var2);
			class44.field1026.method546(var4);
		}
		if (var3 == 43) {
			class44.field1026.method356(204);
			class44.field1026.method530(class43.field1002);
			class44.field1026.method526(var2);
			class44.field1026.method548(var4);
			class44.field1026.method504(class146.field3319);
			class44.field1026.method504(var1);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 16) {
			class70 var11 = class52.field1175[var4];
			if (var11 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var11.field2759[0], class20.field373.field2759[0], 0, var11.field2736[0], 1, 2);
				class154.field3543 = 0;
				class27.field499 = class9.field166;
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class44.field1026.method356(138);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 45) {
			class70 var12 = class52.field1175[var4];
			if (var12 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var12.field2759[0], class20.field373.field2759[0], 0, var12.field2736[0], 1, 2);
				class135.field3147 = 2;
				class27.field499 = class9.field166;
				class154.field3543 = 0;
				class154.field3545 = class66.field1589;
				class44.field1026.method356(35);
				class44.field1026.method546(var4);
			}
		}
		if (var3 == 1002) {
			class154.field3545 = class66.field1589;
			class135.field3147 = 2;
			class27.field499 = class9.field166;
			class154.field3543 = 0;
			class44.field1026.method356(32);
			class44.field1026.method548(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 24) {
			class111 var13 = field230[var4];
			if (var13 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var13.field2759[0], class20.field373.field2759[0], 0, var13.field2736[0], 1, 2);
				class154.field3543 = 0;
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class27.field499 = class9.field166;
				class44.field1026.method356(37);
				class44.field1026.method504(var4);
			}
		}
		if (var3 == 58) {
			class111 var14 = field230[var4];
			if (var14 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var14.field2759[0], class20.field373.field2759[0], 0, var14.field2736[0], 1, 2);
				class154.field3545 = class66.field1589;
				class27.field499 = class9.field166;
				class154.field3543 = 0;
				class135.field3147 = 2;
				class44.field1026.method356(238);
				class44.field1026.method553(class44.field1038);
				class44.field1026.method504(class41.field966);
				class44.field1026.method504(var4);
				class44.field1026.method504(class129.field2978);
			}
		}
		if (var3 == 3) {
			class159.field3657.method1130(class43.field989, var1, var2);
		}
		if (var3 == 40) {
			class44.field1026.method356(218);
			class44.field1026.method530(var2);
			class36 var15 = class128.method991(var2);
			if (var15.field842 != null && var15.field842[0][0] == 5) {
				int var16 = var15.field842[0][1];
				class27.field504[var16] = 1 - class27.field504[var16];
				class112.method882(var16);
			}
		}
		if (var3 == 25) {
			class44.field1026.method356(231);
			class44.field1026.method504(class129.field2978);
			class44.field1026.method553(class44.field1038);
			class44.field1026.method546(var4);
			class44.field1026.method546(var1);
			class44.field1026.method513(class41.field966);
			class44.field1026.method526(var2);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 1001) {
			class154.field3543 = 0;
			class154.field3545 = class66.field1589;
			class135.field3147 = 2;
			class27.field499 = class9.field166;
			class44.field1026.method356(43);
			class44.field1026.method504(var4);
		}
		if (var3 == 41) {
			class44.field1026.method356(9);
			class44.field1026.method548(var4);
			class44.field1026.method556(var2);
			class44.field1026.method504(var1);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 44) {
			class70 var17 = class52.field1175[var4];
			if (var17 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var17.field2759[0], class20.field373.field2759[0], 0, var17.field2736[0], 1, 2);
				class135.field3147 = 2;
				class27.field499 = class9.field166;
				class154.field3543 = 0;
				class154.field3545 = class66.field1589;
				class44.field1026.method356(10);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 21) {
			class105.method856();
			class36 var18 = class128.method991(var2);
			class129.field2978 = var4;
			class41.field966 = var1;
			class44.field1038 = var2;
			class125.field2913 = 1;
			class132.method1008(var18);
			class50.field1148 = class52.method402(new class32[] { class38.field902, class146.method1092(var4).field1429, class130.field2997 });
			if (class50.field1148 == null) {
				class50.field1148 = class91.field2101;
			}
			return;
		}
		if (var3 == 4) {
			class110.method871();
		}
		if (var3 == 38) {
			class44.field1026.method356(215);
			class44.field1026.method546(var1);
			class44.field1026.method530(var2);
			class44.field1026.method504(var4);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 13) {
			boolean var19 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var19) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class135.field3147 = 2;
			class154.field3543 = 0;
			class154.field3545 = class66.field1589;
			class27.field499 = class9.field166;
			class44.field1026.method356(120);
			class44.field1026.method548(var4);
			class44.field1026.method548(class72.field1700 + var1);
			class44.field1026.method548(var2 + class118.field2836);
		}
		if (var3 == 18) {
			class44.field1026.method356(241);
			class44.field1026.method513(var4);
			class44.field1026.method504(var1);
			class44.field1026.method526(var2);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 6) {
			class70 var21 = class52.field1175[var4];
			if (var21 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var21.field2759[0], class20.field373.field2759[0], 0, var21.field2736[0], 1, 2);
				class27.field499 = class9.field166;
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class154.field3543 = 0;
				class44.field1026.method356(73);
				class44.field1026.method546(var4);
			}
		}
		if (var3 == 39 && class50.field1158 == null) {
			class142.method1071(var1, var2);
			class50.field1158 = class130.method1000(var1, var2);
			class132.method1008(class50.field1158);
		}
		if (var3 == 1) {
			class156.method1200(var2, var1, var4);
			class44.field1026.method356(174);
			class44.field1026.method546(var4 >> 14 & 0x7FFF);
			class44.field1026.method504(var1 + class72.field1700);
			class44.field1026.method548(class118.field2836 + var2);
		}
		if (var3 == 1006) {
			class154.field3545 = class66.field1589;
			class27.field499 = class9.field166;
			class135.field3147 = 2;
			class154.field3543 = 0;
			class111 var22 = field230[var4];
			if (var22 != null) {
				class97 var23 = var22.field2595;
				if (var23.field2214 != null) {
					var23 = var23.method757();
				}
				if (var23 != null) {
					class44.field1026.method356(50);
					class44.field1026.method504(var23.field2224);
				}
			}
		}
		if (var3 == 42) {
			class44.field1026.method356(96);
			class44.field1026.method530(var2);
			class44.field1026.method546(var1);
			class44.field1026.method526(class43.field1002);
			class44.field1026.method548(class146.field3319);
		}
		if (var3 == 19) {
			class44.field1026.method356(117);
			class44.field1026.method513(var4);
			class44.field1026.method513(var1);
			class44.field1026.method530(var2);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 49 && class156.method1200(var2, var1, var4)) {
			class44.field1026.method356(75);
			class44.field1026.method504(class129.field2978);
			class44.field1026.method513(var4 >> 14 & 0x7FFF);
			class44.field1026.method504(class41.field966);
			class44.field1026.method548(class72.field1700 + var1);
			class44.field1026.method546(class118.field2836 + var2);
			class44.field1026.method530(class44.field1038);
		}
		if (var3 == 2 && class156.method1200(var2, var1, var4)) {
			class44.field1026.method356(208);
			class44.field1026.method548(var4 >> 14 & 0x7FFF);
			class44.field1026.method546(class118.field2836 + var2);
			class44.field1026.method553(class43.field1002);
			class44.field1026.method504(class72.field1700 + var1);
			class44.field1026.method504(class146.field3319);
		}
		if (var3 == 1003) {
			class156.method1200(var2, var1, var4);
			class44.field1026.method356(182);
			class44.field1026.method513(class72.field1700 + var1);
			class44.field1026.method513(class118.field2836 + var2);
			class44.field1026.method548(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 34) {
			class44.field1026.method356(218);
			class44.field1026.method530(var2);
			class36 var24 = class128.method991(var2);
			if (var24.field842 != null && var24.field842[0][0] == 5) {
				int var25 = var24.field842[0][1];
				if (var24.field785[0] != class27.field504[var25]) {
					class27.field504[var25] = var24.field785[0];
					class112.method882(var25);
				}
			}
		}
		if (var3 == 29) {
			class70 var26 = class52.field1175[var4];
			if (var26 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var26.field2759[0], class20.field373.field2759[0], 0, var26.field2736[0], 1, 2);
				class135.field3147 = 2;
				class154.field3543 = 0;
				class154.field3545 = class66.field1589;
				class27.field499 = class9.field166;
				class44.field1026.method356(81);
				class44.field1026.method504(var4);
			}
		}
		if (var3 == 20) {
			boolean var27 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var27) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class154.field3545 = class66.field1589;
			class27.field499 = class9.field166;
			class135.field3147 = 2;
			class154.field3543 = 0;
			class44.field1026.method356(97);
			class44.field1026.method504(class41.field966);
			class44.field1026.method548(class118.field2836 + var2);
			class44.field1026.method556(class44.field1038);
			class44.field1026.method504(class129.field2978);
			class44.field1026.method513(var4);
			class44.field1026.method548(class72.field1700 + var1);
		}
		if (var3 == 26) {
			class36 var29 = class128.method991(var2);
			boolean var30 = true;
			if (var29.field845 > 0) {
				var30 = client.method152(var29);
			}
			if (var30) {
				class44.field1026.method356(218);
				class44.field1026.method530(var2);
			}
		}
		if (var3 == 46 || var3 == 1005) {
			class77.method616(var4, var2, class56.field1295[arg0], var1);
		}
		if (var3 == 48) {
			class70 var31 = class52.field1175[var4];
			if (var31 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var31.field2759[0], class20.field373.field2759[0], 0, var31.field2736[0], 1, 2);
				class135.field3147 = 2;
				class27.field499 = class9.field166;
				class154.field3545 = class66.field1589;
				class154.field3543 = 0;
				class44.field1026.method356(193);
				class44.field1026.method513(var4);
			}
		}
		if (var3 == 51) {
			class44.field1026.method356(195);
			class44.field1026.method548(var4);
			class44.field1026.method556(var2);
			class44.field1026.method504(var1);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 28) {
			class111 var32 = field230[var4];
			if (var32 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var32.field2759[0], class20.field373.field2759[0], 0, var32.field2736[0], 1, 2);
				class135.field3147 = 2;
				class27.field499 = class9.field166;
				class154.field3545 = class66.field1589;
				class154.field3543 = 0;
				class44.field1026.method356(45);
				class44.field1026.method546(var4);
			}
		}
		if (var3 == 30) {
			class44.field1026.method356(130);
			class44.field1026.method513(var1);
			class44.field1026.method526(var2);
			class44.field1026.method548(var4);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 57) {
			boolean var33 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var33) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class154.field3545 = class66.field1589;
			class135.field3147 = 2;
			class27.field499 = class9.field166;
			class154.field3543 = 0;
			class44.field1026.method356(250);
			class44.field1026.method548(class72.field1700 + var1);
			class44.field1026.method548(var4);
			class44.field1026.method548(class118.field2836 + var2);
		}
		if (var3 == 11) {
			class156.method1200(var2, var1, var4);
			class44.field1026.method356(144);
			class44.field1026.method504(class72.field1700 + var1);
			class44.field1026.method546(class118.field2836 + var2);
			class44.field1026.method513(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 14) {
			class111 var35 = field230[var4];
			if (var35 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var35.field2759[0], class20.field373.field2759[0], 0, var35.field2736[0], 1, 2);
				class154.field3543 = 0;
				class27.field499 = class9.field166;
				class154.field3545 = class66.field1589;
				class135.field3147 = 2;
				class44.field1026.method356(6);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 23) {
			class70 var36 = class52.field1175[var4];
			if (var36 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var36.field2759[0], class20.field373.field2759[0], 0, var36.field2736[0], 1, 2);
				class154.field3545 = class66.field1589;
				class27.field499 = class9.field166;
				class135.field3147 = 2;
				class154.field3543 = 0;
				class44.field1026.method356(158);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 1004) {
			class36 var37 = class128.method991(var2);
			if (var37 == null || var37.field753[var1] < 100000) {
				class44.field1026.method356(43);
				class44.field1026.method504(var4);
			} else {
				class79.method628(class52.method402(new class32[] { class159.method1228(var37.field753[var1]), class71.field1667, class146.method1092(var4).field1429 }), 0, class77.field1786);
			}
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 5) {
			class70 var38 = class52.field1175[var4];
			if (var38 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var38.field2759[0], class20.field373.field2759[0], 0, var38.field2736[0], 1, 2);
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class27.field499 = class9.field166;
				class154.field3543 = 0;
				class44.field1026.method356(67);
				class44.field1026.method553(class44.field1038);
				class44.field1026.method504(class41.field966);
				class44.field1026.method546(var4);
				class44.field1026.method513(class129.field2978);
			}
		}
		if (var3 == 31) {
			boolean var39 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var39) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class154.field3543 = 0;
			class135.field3147 = 2;
			class27.field499 = class9.field166;
			class154.field3545 = class66.field1589;
			class44.field1026.method356(137);
			class44.field1026.method513(class72.field1700 + var1);
			class44.field1026.method546(var4);
			class44.field1026.method513(class118.field2836 + var2);
		}
		if (var3 == 35) {
			class44.field1026.method356(115);
			class44.field1026.method530(var2);
			class44.field1026.method546(var1);
			class44.field1026.method548(var4);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 33) {
			boolean var41 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var41) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class154.field3545 = class66.field1589;
			class154.field3543 = 0;
			class27.field499 = class9.field166;
			class135.field3147 = 2;
			class44.field1026.method356(122);
			class44.field1026.method513(var2 + class118.field2836);
			class44.field1026.method504(var1 + class72.field1700);
			class44.field1026.method553(class43.field1002);
			class44.field1026.method513(class146.field3319);
			class44.field1026.method546(var4);
		}
		if (var3 == 47) {
			boolean var43 = class94.method747(false, 0, class20.field373.field2736[0], 0, 0, var1, class20.field373.field2759[0], 0, var2, 0, 2);
			if (!var43) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var1, class20.field373.field2759[0], 0, var2, 1, 2);
			}
			class154.field3543 = 0;
			class27.field499 = class9.field166;
			class135.field3147 = 2;
			class154.field3545 = class66.field1589;
			class44.field1026.method356(112);
			class44.field1026.method513(var2 + class118.field2836);
			class44.field1026.method513(var4);
			class44.field1026.method513(var1 + class72.field1700);
		}
		if (var3 == 32) {
			class156.method1200(var2, var1, var4);
			class44.field1026.method356(170);
			class44.field1026.method546(var2 + class118.field2836);
			class44.field1026.method504(var4 >> 14 & 0x7FFF);
			class44.field1026.method504(var1 + class72.field1700);
		}
		if (var3 == 12) {
			class111 var45 = field230[var4];
			if (var45 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var45.field2759[0], class20.field373.field2759[0], 0, var45.field2736[0], 1, 2);
				class154.field3543 = 0;
				class27.field499 = class9.field166;
				class135.field3147 = 2;
				class154.field3545 = class66.field1589;
				class44.field1026.method356(253);
				class44.field1026.method513(class146.field3319);
				class44.field1026.method553(class43.field1002);
				class44.field1026.method548(var4);
			}
		}
		if (var3 == 17) {
			class44.field1026.method356(214);
			class44.field1026.method546(var1);
			class44.field1026.method530(var2);
			class44.field1026.method513(var4);
			class136.field3156 = 0;
			class5.field89 = class128.method991(var2);
			class34.field729 = var1;
		}
		if (var3 == 9) {
			class111 var46 = field230[var4];
			if (var46 != null) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var46.field2759[0], class20.field373.field2759[0], 0, var46.field2736[0], 1, 2);
				class154.field3543 = 0;
				class154.field3545 = class66.field1589;
				class27.field499 = class9.field166;
				class135.field3147 = 2;
				class44.field1026.method356(149);
				class44.field1026.method513(var4);
			}
		}
		if (var3 == 37) {
			class156.method1200(var2, var1, var4);
			class44.field1026.method356(229);
			class44.field1026.method513(var2 + class118.field2836);
			class44.field1026.method513(class72.field1700 + var1);
			class44.field1026.method513(var4 >> 14 & 0x7FFF);
		}
		if (class125.field2913 != 0) {
			class125.field2913 = 0;
			class132.method1008(class128.method991(class44.field1038));
		}
		if (class151.field3468) {
			class105.method856();
		}
		if (class5.field89 != null && class136.field3156 == 0) {
			class132.method1008(class5.field89);
		}
	}

	@ObfuscatedName("bf.a(ZII)I")
	public static int method80(int arg0, int arg1) {
		int var2 = class3.method9(arg0 + 91923, 4, arg1 + 45365) + (class3.method9(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (class3.method9(arg0, 1, arg1) - 128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	public class14(byte[] arg0) {
		int var2 = arg0.length;
		this.field233 = new int[var2];
		this.field244 = new int[8];
		this.field241 = arg0;
		int[] var3 = new int[33];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			byte var6 = arg0[var5];
			if (var6 != 0) {
				int var7 = 0x1 << 32 - var6;
				int var8 = var3[var6];
				this.field233[var5] = var8;
				int var9;
				if ((var8 & var7) == 0) {
					for (int var10 = var6 - 1; var10 >= 1; var10--) {
						int var11 = var3[var10];
						if (var8 != var11) {
							break;
						}
						int var12 = 0x1 << 32 - var10;
						if ((var12 & var11) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}
						var3[var10] = var12 | var11;
					}
					var9 = var8 | var7;
				} else {
					var9 = var3[var6 - 1];
				}
				var3[var6] = var9;
				for (int var13 = var6 + 1; var13 <= 32; var13++) {
					if (var8 == var3[var13]) {
						var3[var13] = var9;
					}
				}
				int var14 = 0;
				for (int var15 = 0; var15 < var6; var15++) {
					int var16 = Integer.MIN_VALUE >>> var15;
					if ((var8 & var16) == 0) {
						var14++;
					} else {
						if (this.field244[var14] == 0) {
							this.field244[var14] = var4;
						}
						var14 = this.field244[var14];
					}
					if (var14 >= this.field244.length) {
						int[] var17 = new int[this.field244.length * 2];
						for (int var18 = 0; var18 < this.field244.length; var18++) {
							var17[var18] = this.field244[var18];
						}
						this.field244 = var17;
					}
				}
				this.field244[var14] = ~var5;
				if (var14 >= var4) {
					var4 = var14 + 1;
				}
			}
		}
	}

	@ObfuscatedName("bf.a(II[BIZ[B)I")
	public int method73(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		int var6 = 0;
		int var7 = arg3;
		int var8 = arg1;
		while (true) {
			byte var9 = arg4[var8];
			if (var9 < 0) {
				var6 = this.field244[var6];
			} else {
				var6++;
			}
			int var10;
			if ((var10 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var10;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x40) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var11;
			if ((var11 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var11;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x20) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var12;
			if ((var12 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var12;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x10) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var13;
			if ((var13 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var13;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x8) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var14;
			if ((var14 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var14;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x4) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var15;
			if ((var15 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var15;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x2) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var16;
			if ((var16 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var16;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x1) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var17;
			if ((var17 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var17;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			var8++;
		}
		return var8 + 1 - arg1;
	}

	@ObfuscatedName("bf.a(III[B[BI)I")
	public int method75(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4) {
		int var6 = arg1;
		int var7 = 0;
		int var8 = arg2 << 3;
		while (var6 > arg0) {
			int var9 = arg3[arg0] & 0xFF;
			int var10 = this.field233[var9];
			byte var11 = this.field241[var9];
			if (var11 == 0) {
				throw new RuntimeException("No codeword for data value " + var9);
			}
			int var12 = var8 & 0x7;
			int var13 = var7 & -var12 >> 31;
			int var14 = var8 >> 3;
			var8 += var11;
			int var15 = var14 + (var12 + var11 - 1 >> 3);
			int var16 = var12 + 24;
			arg4[var14] = (byte) (var7 = var13 | var10 >>> var16);
			if (var15 > var14) {
				var14++;
				var12 = var16 - 8;
				arg4[var14] = (byte) (var7 = var10 >>> var12);
				if (var14 < var15) {
					var14++;
					var12 -= 8;
					arg4[var14] = (byte) (var7 = var10 >>> var12);
					if (var14 < var15) {
						var14++;
						var12 -= 8;
						arg4[var14] = (byte) (var7 = var10 >>> var12);
						if (var14 < var15) {
							var12 -= 8;
							var14++;
							arg4[var14] = (byte) (var7 = var10 << -var12);
						}
					}
				}
			}
			arg0++;
		}
		return (var8 + 7 >> 3) - arg2;
	}
}
