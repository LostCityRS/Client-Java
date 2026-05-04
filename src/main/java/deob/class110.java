package deob;

@ObfuscatedName("ka")
public final class class110 {

	@ObfuscatedName("ka.a")
	public static final int[] field2005 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("ka.b")
	public static final class88 field2006 = class208.method1423(105, "You have only just left another world)3");

	@ObfuscatedName("ka.c")
	public static final class88 field2007 = class208.method1423(105, "k");

	@ObfuscatedName("ka.e")
	public static int field2009 = -1;

	@ObfuscatedName("ka.f")
	public static class188 field2010;

	@ObfuscatedName("ka.h")
	public static boolean field2012 = false;

	@ObfuscatedName("ka.j")
	public static int field2014;

	@ObfuscatedName("ka.k")
	public static class88 field2015 = field2006;

	@ObfuscatedName("ka.l")
	public static final int[] field2016 = new int[50];

	@ObfuscatedName("ka.m")
	public static final class88 field2017 = class208.method1423(105, "Verbinde mit Server)3)3)3");

	@ObfuscatedName("ka.n")
	public static int field2018 = -2;

	@ObfuscatedName("ka.a(ZLq;B)V")
	public static void method759(boolean arg0, class174 arg1) {
		int var2 = arg1.field3384 == 0 ? arg1.field3380 : arg1.field3384;
		int var3 = arg1.field3375 == 0 ? arg1.field3422 : arg1.field3375;
		class155.method1055(var2, arg0, arg1.field3423, var3, class78.field1418[arg1.field3423 >> 16]);
		if (arg1.field3465 != null) {
			class155.method1055(var2, arg0, arg1.field3423, var3, arg1.field3465);
		}
		class168 var4 = (class168) class128.field2395.method1049((long) arg1.field3423);
		if (var4 != null) {
			class212.method1449(var2, var4.field3229, var3, arg0);
		}
	}

	@ObfuscatedName("ka.a(BILq;)I")
	public static int method761(int arg0, class174 arg1) {
		if (arg1.field3392 == null || arg0 >= arg1.field3392.length) {
			return -2;
		}
		try {
			int[] var2 = arg1.field3392[arg0];
			int var3 = 0;
			int var4 = 0;
			byte var5 = 0;
			while (true) {
				int var6 = var2[var4++];
				byte var7 = 0;
				int var8 = 0;
				if (var6 == 0) {
					return var3;
				}
				if (var6 == 1) {
					var8 = class105.field1907[var2[var4++]];
				}
				if (var6 == 2) {
					var8 = class217.field4066[var2[var4++]];
				}
				if (var6 == 3) {
					var8 = class179.field3562[var2[var4++]];
				}
				if (var6 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					class174 var11 = class239.method1579(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!class71.method472(var12).field2877 || class67.field1215)) {
						for (int var13 = 0; var13 < var11.field3388.length; var13++) {
							if (var11.field3388[var13] == var12 + 1) {
								var8 += var11.field3474[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var8 = class113.field2050[var2[var4++]];
				}
				if (var6 == 6) {
					var8 = class90.field1710[class217.field4066[var2[var4++]] - 1];
				}
				if (var6 == 7) {
					var8 = class113.field2050[var2[var4++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var8 = class240.field4456.field747;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (class17.field255[var14]) {
							var8 += class217.field4066[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					class174 var17 = class239.method1579(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!class71.method472(var18).field2877 || class67.field1215)) {
						for (int var19 = 0; var19 < var17.field3388.length; var19++) {
							if (var18 + 1 == var17.field3388[var19]) {
								var8 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var8 = class240.field4458;
				}
				if (var6 == 15) {
					var7 = 1;
				}
				if (var6 == 12) {
					var8 = class199.field3788;
				}
				if (var6 == 13) {
					int var20 = class113.field2050[var2[var4++]];
					int var21 = var2[var4++];
					var8 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var6 == 16) {
					var7 = 2;
				}
				if (var6 == 14) {
					int var22 = var2[var4++];
					var8 = class142.method930(var22);
				}
				if (var6 == 17) {
					var7 = 3;
				}
				if (var6 == 18) {
					var8 = (class240.field4456.field4136 >> 7) + class223.field4212;
				}
				if (var6 == 19) {
					var8 = (class240.field4456.field4121 >> 7) + class190.field3679;
				}
				if (var6 == 20) {
					var8 = var2[var4++];
				}
				if (var7 == 0) {
					if (var5 == 0) {
						var3 += var8;
					}
					if (var5 == 1) {
						var3 -= var8;
					}
					if (var5 == 2 && var8 != 0) {
						var3 /= var8;
					}
					if (var5 == 3) {
						var3 *= var8;
					}
					var5 = 0;
				} else {
					var5 = var7;
				}
			}
		} catch (Exception var23) {
			return -1;
		}
	}

	@ObfuscatedName("ka.a(IIIILnc;Lnc;IIJ)V")
	public static void method762(int arg0, int arg1, int arg2, int arg3, class145 arg4, class145 arg5, int arg6, int arg7, long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		class157 var10 = new class157();
		var10.field3028 = arg8;
		var10.field3029 = arg1 * 128 + 64;
		var10.field3023 = arg2 * 128 + 64;
		var10.field3031 = arg3;
		var10.field3021 = arg4;
		var10.field3032 = arg5;
		var10.field3027 = arg6;
		var10.field3024 = arg7;
		for (int var11 = arg0; var11 >= 0; var11--) {
			if (class29.field489[var11][arg1][arg2] == null) {
				class29.field489[var11][arg1][arg2] = new class52(var11, arg1, arg2);
			}
		}
		class29.field489[arg0][arg1][arg2].field959 = var10;
	}

	@ObfuscatedName("ka.a()V")
	public static void method763() {
		for (int var0 = 0; var0 < class25.field396; var0++) {
			class108 var1 = class149.field2906[var0];
			class137.method915(var1);
			class149.field2906[var0] = null;
		}
		class25.field396 = 0;
	}
}
