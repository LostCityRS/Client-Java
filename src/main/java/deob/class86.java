package deob;

@ObfuscatedName("mc")
public final class class86 {

	@ObfuscatedName("mc.a")
	public static class32 field2000 = class73.method593("Continue", true);

	@ObfuscatedName("mc.b")
	public static int field2001 = 0;

	@ObfuscatedName("mc.c")
	public static class32 field2002 = field2000;

	@ObfuscatedName("mc.d")
	public static class32 field2003 = class73.method593("Welt", true);

	@ObfuscatedName("mc.e")
	public static int field2004 = 0;

	@ObfuscatedName("mc.i")
	public static class32 field2008 = class73.method593("sch-Utteln:", true);

	@ObfuscatedName("mc.j")
	public static class32 field2009 = class73.method593("Abbrechen", true);

	@ObfuscatedName("mc.k")
	public static class25 field2010;

	@ObfuscatedName("mc.l")
	public static int field2011 = 0;

	@ObfuscatedName("mc.m")
	public static class32 field2012 = class73.method593("Create a free account", true);

	@ObfuscatedName("mc.n")
	public static class32 field2013 = class73.method593("::clientdrop", true);

	@ObfuscatedName("mc.o")
	public static int field2014 = 1;

	@ObfuscatedName("mc.q")
	public static int field2016 = 0;

	@ObfuscatedName("mc.s")
	public static class32 field2018 = class73.method593("Please wait )2 attempting to reestablish", true);

	@ObfuscatedName("mc.h")
	public static class32 field2007 = field2018;

	@ObfuscatedName("mc.u")
	public static class32 field2020 = field2012;

	@ObfuscatedName("mc.v")
	public static int field2021;

	@ObfuscatedName("mc.w")
	public static class32 field2022 = class73.method593("Service unavailable)3", true);

	@ObfuscatedName("mc.p")
	public static class32 field2015 = field2022;

	@ObfuscatedName("mc.a(IIIII)V")
	public static void method663(int arg0, int arg1, int arg2, int arg3) {
		if (class125.field2913 == 0 && !class151.field3468) {
			class56.method442(0, class47.field1116, arg3 - arg1, 3, class77.field1786, arg0 - arg2);
		}
		int var4 = -1;
		for (int var5 = 0; var5 < class101.field2382; var5++) {
			int var6 = class101.field2367[var5];
			int var7 = var6 >> 29 & 0x3;
			int var8 = var6 & 0x7F;
			int var9 = var6 >> 14 & 0x7FFF;
			int var10 = var6 >> 7 & 0x7F;
			if (var6 != var4) {
				var4 = var6;
				if (var7 == 2 && class159.field3657.method1121(class43.field989, var8, var10, var6) >= 0) {
					class53 var11 = class5.method22(var9);
					if (var11.field1251 != null) {
						var11 = var11.method422();
					}
					if (var11 == null) {
						continue;
					}
					if (class125.field2913 == 1) {
						class56.method442(var6, class41.field965, var10, 49, class52.method402(new class32[] { class50.field1148, class91.field2087, var11.field1213 }), var8);
					} else if (!class151.field3468) {
						class32[] var12 = var11.field1255;
						if (class94.field2164) {
							var12 = class125.method984(var12);
						}
						if (var12 != null) {
							for (int var13 = 4; var13 >= 0; var13--) {
								if (var12[var13] != null) {
									short var14 = 0;
									if (var13 == 0) {
										var14 = 37;
									}
									if (var13 == 1) {
										var14 = 11;
									}
									if (var13 == 2) {
										var14 = 32;
									}
									if (var13 == 3) {
										var14 = 1;
									}
									if (var13 == 4) {
										var14 = 1003;
									}
									class56.method442(var6, var12[var13], var10, var14, class52.method402(new class32[] { class133.field3052, var11.field1213 }), var8);
								}
							}
						}
						class56.method442(var11.field1221 << 14, class135.field3140, var10, 1002, class52.method402(new class32[] { class133.field3052, var11.field1213 }), var8);
					} else if ((class88.field2045 & 0x4) == 4) {
						class56.method442(var6, class147.field3353, var10, 2, class52.method402(new class32[] { class14.field234, class91.field2087, var11.field1213 }), var8);
					}
				}
				if (var7 == 1) {
					class111 var15 = class14.field230[var9];
					if (var15.field2595.field2196 == 1 && (var15.field2747 & 0x7F) == 64 && (var15.field2698 & 0x7F) == 64) {
						for (int var16 = 0; var16 < class102.field2397; var16++) {
							class111 var17 = class14.field230[class15.field313[var16]];
							if (var17 != null && var17 != var15 && var17.field2595.field2196 == 1 && var15.field2747 == var17.field2747 && var15.field2698 == var17.field2698) {
								class32.method251(var8, var17.field2595, class15.field313[var16], var10);
							}
						}
						for (int var18 = 0; var18 < class62.field1404; var18++) {
							class70 var19 = class52.field1175[class137.field3187[var18]];
							if (var19 != null && var15.field2747 == var19.field2747 && var15.field2698 == var19.field2698) {
								class61.method464(class137.field3187[var18], var10, var19, var8);
							}
						}
					}
					class32.method251(var8, var15.field2595, var9, var10);
				}
				if (var7 == 0) {
					class70 var20 = class52.field1175[var9];
					if ((var20.field2747 & 0x7F) == 64 && (var20.field2698 & 0x7F) == 64) {
						for (int var21 = 0; var21 < class102.field2397; var21++) {
							class111 var22 = class14.field230[class15.field313[var21]];
							if (var22 != null && var22.field2595.field2196 == 1 && var22.field2747 == var20.field2747 && var20.field2698 == var22.field2698) {
								class32.method251(var8, var22.field2595, class15.field313[var21], var10);
							}
						}
						for (int var23 = 0; var23 < class62.field1404; var23++) {
							class70 var24 = class52.field1175[class137.field3187[var23]];
							if (var24 != null && var20 != var24 && var24.field2747 == var20.field2747 && var20.field2698 == var24.field2698) {
								class61.method464(class137.field3187[var23], var10, var24, var8);
							}
						}
					}
					class61.method464(var9, var10, var20, var8);
				}
				if (var7 == 3) {
					class157 var25 = class23.field397[class43.field989][var8][var10];
					if (var25 != null) {
						for (class17 var26 = (class17) var25.method1220(); var26 != null; var26 = (class17) var25.method1208()) {
							class62 var27 = class146.method1092(var26.field333);
							if (class125.field2913 == 1) {
								class56.method442(var26.field333, class41.field965, var10, 20, class52.method402(new class32[] { class50.field1148, class48.field1132, var27.field1429 }), var8);
							} else if (!class151.field3468) {
								class32[] var28 = var27.field1410;
								if (class94.field2164) {
									var28 = class125.method984(var28);
								}
								for (int var29 = 4; var29 >= 0; var29--) {
									if (var28 != null && var28[var29] != null) {
										byte var30 = 0;
										if (var29 == 0) {
											var30 = 57;
										}
										if (var29 == 1) {
											var30 = 47;
										}
										if (var29 == 2) {
											var30 = 31;
										}
										if (var29 == 3) {
											var30 = 13;
										}
										if (var29 == 4) {
											var30 = 36;
										}
										class56.method442(var26.field333, var28[var29], var10, var30, class52.method402(new class32[] { class38.field902, var27.field1429 }), var8);
									} else if (var29 == 2) {
										class56.method442(var26.field333, class28.field507, var10, 31, class52.method402(new class32[] { class38.field902, var27.field1429 }), var8);
									}
								}
								class56.method442(var26.field333, class135.field3140, var10, 1001, class52.method402(new class32[] { class38.field902, var27.field1429 }), var8);
							} else if ((class88.field2045 & 0x1) == 1) {
								class56.method442(var26.field333, class147.field3353, var10, 33, class52.method402(new class32[] { class14.field234, class48.field1132, var27.field1429 }), var8);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(ILf;IIIIII)V")
	public static void method664(int arg0, class36 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (class23.field416) {
			class72.field1706 = 32;
		} else {
			class72.field1706 = 0;
		}
		class23.field416 = false;
		if (field2016 != 0) {
			if (arg5 >= arg3 && arg3 + 16 > arg5 && arg2 >= arg0 && arg0 + 16 > arg2) {
				arg1.field872 -= 4;
				class132.method1008(arg1);
			} else if (arg3 <= arg5 && arg5 < arg3 + 16 && arg2 >= arg0 + arg4 - 16 && arg0 + arg4 > arg2) {
				arg1.field872 += 4;
				class132.method1008(arg1);
			} else if (arg5 >= arg3 - class72.field1706 && arg5 < class72.field1706 + arg3 + 16 && arg0 + 16 <= arg2 && arg2 < arg0 + arg4 - 16) {
				int var7 = (arg4 - 32) * arg4 / arg6;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg2 - arg0 - var7 / 2 - 16;
				int var9 = arg4 - var7 - 32;
				arg1.field872 = (arg6 - arg4) * var8 / var9;
				class132.method1008(arg1);
				class23.field416 = true;
			}
		}
		if (class72.field1695 == 0) {
			return;
		}
		int var10 = arg1.field810;
		if (arg5 >= arg3 - var10 && arg0 <= arg2 && arg3 + 16 > arg5 && arg0 + arg4 >= arg2) {
			arg1.field872 += class72.field1695 * 45;
			class132.method1008(arg1);
			return;
		}
	}

	@ObfuscatedName("mc.a(I)V")
	public static void method665() {
		field2015 = null;
		field2010 = null;
		field2012 = null;
		field2000 = null;
		field2009 = null;
		field2002 = null;
		field2008 = null;
		field2020 = null;
		field2022 = null;
		field2007 = null;
		field2018 = null;
		field2013 = null;
		field2003 = null;
	}

	@ObfuscatedName("mc.a(BI)Lrc;")
	public static class121 method666(int arg0) {
		class121 var1 = (class121) class64.field1480.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		class121 var2 = class33.method286(class137.field3193, class3.field45, arg0);
		if (var2 != null) {
			class64.field1480.method484((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("mc.a(ZLea;IZIII)V")
	public static void method667(class30 arg0, int arg1, int arg2, int arg3) {
		class73.field1724 = 2;
		class34.field718 = arg0;
		class157.field3606 = arg3;
		class121.field2870 = false;
		class57.field1321 = arg1;
		class98.field2263 = 1;
		class126.field2928 = arg2;
	}

	@ObfuscatedName("mc.a(I[B)[B")
	public static byte[] method668(byte[] arg0) {
		int var1 = arg0.length;
		byte[] var2 = new byte[var1];
		class60.method457(arg0, 0, var2, 0, var1);
		return var2;
	}
}
