package deob;

@ObfuscatedName("ki")
public final class class118 {

	@ObfuscatedName("ki.a")
	public static int field2131 = 0;

	@ObfuscatedName("ki.c")
	public static final class92 field2133 = new class92(64);

	@ObfuscatedName("ki.d")
	public int field2134;

	@ObfuscatedName("ki.e")
	public int field2135;

	@ObfuscatedName("ki.f")
	public int field2136 = -1;

	@ObfuscatedName("ki.g")
	public int field2137;

	@ObfuscatedName("ki.h")
	public int field2138;

	@ObfuscatedName("ki.i")
	public int field2139;

	@ObfuscatedName("ki.j")
	public static final class88 field2140 = class208.method1423(105, "Your ignore list is full)3 Max of 100 users)3");

	@ObfuscatedName("ki.l")
	public static class88 field2142 = field2140;

	@ObfuscatedName("ki.m")
	public static volatile boolean field2143 = true;

	@ObfuscatedName("ki.o")
	public static boolean field2145 = false;

	@ObfuscatedName("ki.p")
	public int field2146;

	@ObfuscatedName("ki.q")
	public static class75 field2147;

	@ObfuscatedName("ki.t")
	public int field2150;

	@ObfuscatedName("ki.u")
	public int field2151;

	@ObfuscatedName("ki.a(IZ)I")
	public static int method799(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("ki.a(Li;BILi;ILi;)V")
	public static void method801(class88 arg0, int arg1, class88 arg2, int arg3, class88 arg4) {
		for (int var5 = 99; var5 > 0; var5--) {
			class194.field3708[var5] = class194.field3708[var5 - 1];
			class121.field2206[var5] = class121.field2206[var5 - 1];
			class212.field4019[var5] = class212.field4019[var5 - 1];
			class228.field4280[var5] = class228.field4280[var5 - 1];
			class133.field2483[var5] = class133.field2483[var5 - 1];
		}
		class34.field582++;
		class121.field2206[0] = arg2;
		class212.field4019[0] = arg0;
		class194.field3708[0] = arg3;
		class133.field2483[0] = arg1;
		class228.field4280[0] = arg4;
		class7.field100 = class67.field1211;
	}

	@ObfuscatedName("ki.a(III)V")
	public static void method802(int arg0, int arg1) {
		if (class70.field1276 != arg0) {
			class22.field351 = new int[arg0];
			for (int var2 = 0; var2 < arg0; var2++) {
				class22.field351[var2] = (var2 << 12) / arg0;
			}
			class43.field738 = arg0 == 64 ? 2048 : 4096;
			class70.field1276 = arg0;
			class45.field789 = arg0 - 1;
		}
		if (arg1 == class27.field460) {
			return;
		}
		if (class70.field1276 == arg1) {
			class111.field2021 = class22.field351;
		} else {
			class111.field2021 = new int[arg1];
			for (int var3 = 0; var3 < arg1; var3++) {
				class111.field2021[var3] = (var3 << 12) / arg1;
			}
		}
		class27.field460 = arg1;
		class220.field4158 = arg1 - 1;
	}

	@ObfuscatedName("ki.a(III[[[BIBII)V")
	public static void method803(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, int arg5) {
		class143.field2627++;
		class176.field3545 = 0;
		int var6 = arg4 - 16;
		int var7 = arg4 + 16;
		int var8 = arg5 - 16;
		int var9 = arg5 + 16;
		for (int var10 = class161.field3105; var10 < class11.field152; var10++) {
			class52[][] var11 = class29.field489[var10];
			for (int var12 = class156.field3007; var12 < class6.field84; var12++) {
				for (int var13 = class102.field1849; var13 < class230.field4314; var13++) {
					class52 var14 = var11[var12][var13];
					if (var14 != null) {
						if (var14.field950 <= class155.field2993 && class18.field304[var12 + class150.field2911 - class79.field1435][var13 + class150.field2911 - class88.field1636] && (arg3 == null || var10 < 0 || arg3[var10][var12][var13] != 0)) {
							var14.field944 = true;
							var14.field965 = true;
							if (var14.field962 > 0) {
								var14.field958 = true;
							} else {
								var14.field958 = false;
							}
							class176.field3545++;
						} else {
							var14.field944 = false;
							var14.field965 = false;
							var14.field953 = 0;
							if (var14.field963 != null && var12 >= var6 && var12 <= var7 && var13 >= var8 && var13 <= var9) {
								for (int var15 = 0; var15 < var14.field962; var15++) {
									class108 var16 = var14.field963[var15];
									var16.field1943.method537((var16.field1933 + (var16.field1940 - var16.field1933 >> 1)) * 128 + 64, (var16.field1936 + (var16.field1935 - var16.field1936 >> 1)) * 128 + 64);
								}
							}
						}
					}
				}
			}
		}
		boolean var17 = class62.field1137 == class154.field2979;
		for (int var18 = class161.field3105; var18 < class11.field152; var18++) {
			class52[][] var19 = class29.field489[var18];
			for (int var20 = -class150.field2911; var20 <= 0; var20++) {
				int var21 = class79.field1435 + var20;
				int var22 = class79.field1435 - var20;
				if (var21 >= class156.field3007 || var22 < class6.field84) {
					for (int var23 = -class150.field2911; var23 <= 0; var23++) {
						int var24 = class88.field1636 + var23;
						int var25 = class88.field1636 - var23;
						if (var21 >= class156.field3007) {
							if (var24 >= class102.field1849) {
								class52 var26 = var19[var21][var24];
								if (var26 != null && var26.field944) {
									class81.method542(var26, true);
								}
							}
							if (var25 < class230.field4314) {
								class52 var27 = var19[var21][var25];
								if (var27 != null && var27.field944) {
									class81.method542(var27, true);
								}
							}
						}
						if (var22 < class6.field84) {
							if (var24 >= class102.field1849) {
								class52 var28 = var19[var22][var24];
								if (var28 != null && var28.field944) {
									class81.method542(var28, true);
								}
							}
							if (var25 < class230.field4314) {
								class52 var29 = var19[var22][var25];
								if (var29 != null && var29.field944) {
									class81.method542(var29, true);
								}
							}
						}
						if (class176.field3545 == 0) {
							if (!var17) {
								field2145 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (int var30 = class161.field3105; var30 < class11.field152; var30++) {
			class52[][] var31 = class29.field489[var30];
			for (int var32 = -class150.field2911; var32 <= 0; var32++) {
				int var33 = class79.field1435 + var32;
				int var34 = class79.field1435 - var32;
				if (var33 >= class156.field3007 || var34 < class6.field84) {
					for (int var35 = -class150.field2911; var35 <= 0; var35++) {
						int var36 = class88.field1636 + var35;
						int var37 = class88.field1636 - var35;
						if (var33 >= class156.field3007) {
							if (var36 >= class102.field1849) {
								class52 var38 = var31[var33][var36];
								if (var38 != null && var38.field944) {
									class81.method542(var38, false);
								}
							}
							if (var37 < class230.field4314) {
								class52 var39 = var31[var33][var37];
								if (var39 != null && var39.field944) {
									class81.method542(var39, false);
								}
							}
						}
						if (var34 < class6.field84) {
							if (var36 >= class102.field1849) {
								class52 var40 = var31[var34][var36];
								if (var40 != null && var40.field944) {
									class81.method542(var40, false);
								}
							}
							if (var37 < class230.field4314) {
								class52 var41 = var31[var34][var37];
								if (var41 != null && var41.field944) {
									class81.method542(var41, false);
								}
							}
						}
						if (class176.field3545 == 0) {
							if (!var17) {
								field2145 = false;
							}
							return;
						}
					}
				}
			}
		}
		field2145 = false;
	}

	@ObfuscatedName("ki.a(Lcc;Lcc;B)V")
	public static void method804(class26 arg0, class26 arg1) {
		if (class80.field1448 == null) {
			class80.field1448 = class34.method230(0, class226.field4243, class14.field209);
		}
		if (class23.field372 == null) {
			class23.field372 = class190.method1325(class8.field119, class226.field4243, 0);
		}
		if (class167.field3217 == null) {
			class167.field3217 = class190.method1325(class97.field1783, class226.field4243, 0);
		}
		if (class43.field736 == null) {
			class43.field736 = class190.method1325(class120.field2195, class226.field4243, 0);
		}
		class72.method478(0, 23, 765, 480, 0);
		class72.method482(0, 0, 138, 23, 12425273, 9135624);
		class72.method482(138, 0, 640, 23, 5197647, 2697513);
		arg1.method141(class129.field2425, 69, 15, 0, -1);
		if (class43.field736 != null) {
			class43.field736[1].method876(140, 1);
			arg0.method154(class128.field2404, 152, 10, 16777215, -1);
			class43.field736[0].method876(140, 12);
			arg0.method154(class115.field2074, 152, 21, 16777215, -1);
		}
		if (class167.field3217 != null) {
			if (class27.field461[0] == 0 && class89.field1686[0] == 0) {
				class167.field3217[2].method876(280, 4);
			} else {
				class167.field3217[0].method876(280, 4);
			}
			if (class27.field461[0] == 0 && class89.field1686[0] == 1) {
				class167.field3217[3].method876(295, 4);
			} else {
				class167.field3217[1].method876(295, 4);
			}
			arg1.method154(class71.field1312, 312, 17, 16777215, -1);
			if (class27.field461[0] == 1 && class89.field1686[0] == 0) {
				class167.field3217[2].method876(390, 4);
			} else {
				class167.field3217[0].method876(390, 4);
			}
			if (class27.field461[0] == 1 && class89.field1686[0] == 1) {
				class167.field3217[3].method876(405, 4);
			} else {
				class167.field3217[1].method876(405, 4);
			}
			arg1.method154(class232.field4362, 422, 17, 16777215, -1);
			if (class27.field461[0] == 2 && class89.field1686[0] == 0) {
				class167.field3217[2].method876(500, 4);
			} else {
				class167.field3217[0].method876(500, 4);
			}
			if (class27.field461[0] == 2 && class89.field1686[0] == 1) {
				class167.field3217[3].method876(515, 4);
			} else {
				class167.field3217[1].method876(515, 4);
			}
			arg1.method154(class146.field2734, 532, 17, 16777215, -1);
			if (class27.field461[0] == 3 && class89.field1686[0] == 0) {
				class167.field3217[2].method876(610, 4);
			} else {
				class167.field3217[0].method876(610, 4);
			}
			if (class27.field461[0] == 3 && class89.field1686[0] == 1) {
				class167.field3217[3].method876(625, 4);
			} else {
				class167.field3217[1].method876(625, 4);
			}
			arg1.method154(class208.field3950, 642, 17, 16777215, -1);
		}
		class72.method478(700, 4, 58, 16, 0);
		arg0.method141(class6.field76, 729, 16, 16777215, -1);
		class87.field1581 = -1;
		if (class80.field1448 == null) {
			return;
		}
		int var2 = 24;
		int var3 = 8;
		int var4;
		int var5;
		do {
			var4 = var2;
			var5 = var3;
			if (class104.field1895 <= var2 * (var3 - 1)) {
				var3--;
			}
			if (var3 * (var2 - 1) >= class104.field1895) {
				var2--;
			}
			if (class104.field1895 <= (var2 - 1) * var3) {
				var2--;
			}
		} while (var2 != var4 || var5 != var3);
		int var6 = (765 - var3 * 88) / (var3 + 1);
		int var7 = (480 - var2 * 19) / (var2 + 1);
		if (var7 > 5) {
			var7 = 5;
		}
		if (var6 > 5) {
			var6 = 5;
		}
		int var8 = (765 - var6 * (var3 - 1) - var3 * 88) / 2;
		int var9 = var8;
		int var10 = (480 - var2 * 19 - var7 * (var2 + -1)) / 2;
		int var11 = var10 + 23;
		int var12 = 0;
		for (int var13 = 0; var13 < class104.field1895; var13++) {
			class70 var14 = class202.field3845[var13];
			boolean var15 = true;
			class88 var16 = class170.method1212(var14.field1255);
			if (var14.field1255 == -1) {
				var16 = class48.field901;
				var15 = false;
			} else if (var14.field1255 > 1980) {
				var16 = class93.field1745;
				var15 = false;
			}
			if (class28.field471 >= var9 && class239.field4449 >= var11 && class28.field471 < var9 + 88 && class239.field4449 < var11 + 19 && var15) {
				class87.field1581 = var13;
				class80.field1448[var14.field1257 ? 1 : 0].method1160(var9, var11);
			} else {
				class80.field1448[var14.field1257 ? 1 : 0].method1161(var9, var11);
			}
			if (class23.field372 != null) {
				class23.field372[var14.field1260 + (var14.field1257 ? 8 : 0)].method876(var9 + 29, var11);
			}
			arg1.method141(class170.method1212(var14.field1261), var9 + 15, 5 + 9 + var11, 0, -1);
			arg0.method141(var16, var9 + 60, var11 - -5 + 9, 268435455, -1);
			var11 += var7 + 19;
			var12++;
			if (var2 <= var12) {
				var11 = var10 + 23;
				var12 = 0;
				var9 += var6 + 88;
			}
		}
	}

	@ObfuscatedName("ki.a(IIIIIILq;I)V")
	public static void method805(int arg0, int arg1, int arg2, int arg3, int arg4, class174 arg5, int arg6) {
		if (class1.field9) {
			class126.field2332 = 32;
		} else {
			class126.field2332 = 0;
		}
		class1.field9 = false;
		if (class156.field3016 != 0) {
			if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 <= arg4 && arg4 < arg6 + 16) {
				arg5.field3415 -= 4;
				class200.method1371(arg5);
			} else if (arg0 <= arg2 && arg2 < arg0 + 16 && arg4 >= arg6 + arg3 - 16 && arg6 + arg3 > arg4) {
				arg5.field3415 += 4;
				class200.method1371(arg5);
			} else if (arg2 >= arg0 - class126.field2332 && arg2 < class126.field2332 + arg0 + 16 && arg6 + 16 <= arg4 && arg4 < arg6 + arg3 - 16) {
				int var7 = arg3 * (arg3 - 32) / arg1;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg3 - var7 - 32;
				int var9 = arg4 - var7 / 2 - arg6 - 16;
				arg5.field3415 = var9 * (arg1 - arg3) / var8;
				class200.method1371(arg5);
				class1.field9 = true;
			}
		}
		if (class90.field1708 == 0) {
			return;
		}
		int var10 = arg5.field3380;
		if (arg2 >= arg0 - var10 && arg6 <= arg4 && arg2 < arg0 + 16 && arg4 <= arg6 + arg3) {
			arg5.field3415 += class90.field1708 * 45;
			class200.method1371(arg5);
		}
	}
}
