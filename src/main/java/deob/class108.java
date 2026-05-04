package deob;

@ObfuscatedName("jj")
public final class class108 {

	@ObfuscatedName("jj.a")
	public int field1933;

	@ObfuscatedName("jj.b")
	public int field1934;

	@ObfuscatedName("jj.c")
	public int field1935;

	@ObfuscatedName("jj.d")
	public int field1936;

	@ObfuscatedName("jj.f")
	public int field1938;

	@ObfuscatedName("jj.g")
	public int field1939;

	@ObfuscatedName("jj.h")
	public int field1940;

	@ObfuscatedName("jj.j")
	public static final class88 field1942 = class208.method1423(105, "blinken1:");

	@ObfuscatedName("jj.k")
	public class145 field1943;

	@ObfuscatedName("jj.l")
	public static final int[] field1944 = new int[1000];

	@ObfuscatedName("jj.m")
	public int field1945;

	@ObfuscatedName("jj.o")
	public static final class88 field1947 = class208.method1423(105, "Bitte geben Sie Ihr Passwort ein)3");

	@ObfuscatedName("jj.p")
	public long field1948 = 0L;

	@ObfuscatedName("jj.q")
	public int field1949;

	@ObfuscatedName("jj.r")
	public int field1950;

	@ObfuscatedName("jj.s")
	public static final class154 field1951 = new class154(4096);

	@ObfuscatedName("jj.t")
	public int field1952;

	@ObfuscatedName("jj.v")
	public static int field1954;

	@ObfuscatedName("jj.w")
	public static final class92 field1955 = new class92(64);

	@ObfuscatedName("jj.x")
	public static final class24 field1956 = new class24(4);

	@ObfuscatedName("jj.y")
	public static final class88 field1957 = class208.method1423(105, "b12_full");

	@ObfuscatedName("jj.z")
	public static boolean field1958 = false;

	@ObfuscatedName("jj.a(ZIIIIIIIIIII)Z")
	public static boolean method737(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				class190.field3673[var11][var12] = 0;
				class228.field4267[var11][var12] = 99999999;
			}
		}
		class190.field3673[arg4][arg1] = 99;
		class228.field4267[arg4][arg1] = 0;
		int var13 = arg4;
		int var14 = arg1;
		byte var15 = 0;
		class120.field2203[0] = arg4;
		int var30 = var15 + 1;
		class97.field1781[0] = arg1;
		boolean var16 = false;
		int var17 = 0;
		int[][] var18 = class166.field3200[class149.field2907].field1667;
		while (var30 != var17) {
			var13 = class120.field2203[var17];
			var14 = class97.field1781[var17];
			var17 = var17 + 1 & 0xFFF;
			if (var13 == arg7 && arg10 == var14) {
				var16 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && class166.field3200[class149.field2907].method640(var14, arg5 - 1, arg7, arg10, 2, arg6, var13)) {
					var16 = true;
					break;
				}
				if (arg5 < 10 && class166.field3200[class149.field2907].method648(arg6, var13, arg5 - 1, arg10, 2, var14, arg7)) {
					var16 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && class166.field3200[class149.field2907].method650(2, arg10, arg2, var14, arg3, var13, arg7, arg8)) {
				var16 = true;
				break;
			}
			int var19 = class228.field4267[var13][var14] + 1;
			if (var13 > 0 && class190.field3673[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
				class120.field2203[var30] = var13 - 1;
				class97.field1781[var30] = var14;
				class190.field3673[var13 - 1][var14] = 2;
				var30 = var30 + 1 & 0xFFF;
				class228.field4267[var13 - 1][var14] = var19;
			}
			if (var13 < 102 && class190.field3673[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
				class120.field2203[var30] = var13 + 1;
				class97.field1781[var30] = var14;
				class190.field3673[var13 + 1][var14] = 8;
				var30 = var30 + 1 & 0xFFF;
				class228.field4267[var13 + 1][var14] = var19;
			}
			if (var14 > 0 && class190.field3673[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
				class120.field2203[var30] = var13;
				class97.field1781[var30] = var14 - 1;
				class190.field3673[var13][var14 - 1] = 1;
				var30 = var30 + 1 & 0xFFF;
				class228.field4267[var13][var14 - 1] = var19;
			}
			if (var14 < 102 && class190.field3673[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
				class120.field2203[var30] = var13;
				class97.field1781[var30] = var14 + 1;
				class190.field3673[var13][var14 + 1] = 4;
				class228.field4267[var13][var14 + 1] = var19;
				var30 = var30 + 1 & 0xFFF;
			}
			if (var13 > 0 && var14 > 0 && class190.field3673[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
				class120.field2203[var30] = var13 - 1;
				class97.field1781[var30] = var14 - 1;
				class190.field3673[var13 - 1][var14 - 1] = 3;
				var30 = var30 + 1 & 0xFFF;
				class228.field4267[var13 - 1][var14 - 1] = var19;
			}
			if (var13 < 102 && var14 > 0 && class190.field3673[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
				class120.field2203[var30] = var13 + 1;
				class97.field1781[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				class190.field3673[var13 + 1][var14 - 1] = 9;
				class228.field4267[var13 + 1][var14 - 1] = var19;
			}
			if (var13 > 0 && var14 < 102 && class190.field3673[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
				class120.field2203[var30] = var13 - 1;
				class97.field1781[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				class190.field3673[var13 - 1][var14 + 1] = 6;
				class228.field4267[var13 - 1][var14 + 1] = var19;
			}
			if (var13 < 102 && var14 < 102 && class190.field3673[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
				class120.field2203[var30] = var13 + 1;
				class97.field1781[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				class190.field3673[var13 + 1][var14 + 1] = 12;
				class228.field4267[var13 + 1][var14 + 1] = var19;
			}
		}
		class120.field2186 = 0;
		if (!var16) {
			if (!arg0) {
				return false;
			}
			int var20 = 1000;
			int var21 = 100;
			for (int var22 = arg7 - 10; var22 <= arg7 + 10; var22++) {
				for (int var23 = arg10 - 10; var23 <= arg10 + 10; var23++) {
					if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class228.field4267[var22][var23] < 100) {
						int var24 = 0;
						int var25 = 0;
						if (var23 < arg10) {
							var25 = arg10 - var23;
						} else if (var23 > arg10 + arg3 - 1) {
							var25 = var23 + 1 - arg10 - arg3;
						}
						if (var22 < arg7) {
							var24 = arg7 - var22;
						} else if (arg2 + arg7 - 1 < var22) {
							var24 = var22 + 1 - arg2 - arg7;
						}
						int var26 = var24 * var24 + var25 * var25;
						if (var20 > var26 || var20 == var26 && var21 > class228.field4267[var22][var23]) {
							var21 = class228.field4267[var22][var23];
							var13 = var22;
							var14 = var23;
							var20 = var26;
						}
					}
				}
			}
			if (var20 == 1000) {
				return false;
			}
			if (var13 == arg4 && var14 == arg1) {
				return false;
			}
			class120.field2186 = 1;
		}
		byte var27 = 0;
		class120.field2203[0] = var13;
		int var31 = var27 + 1;
		class97.field1781[0] = var14;
		int var28;
		int var29 = var28 = class190.field3673[var13][var14];
		while (var13 != arg4 || var14 != arg1) {
			if (var29 != var28) {
				var28 = var29;
				class120.field2203[var31] = var13;
				class97.field1781[var31++] = var14;
			}
			if ((var29 & 0x2) != 0) {
				var13++;
			} else if ((var29 & 0x8) != 0) {
				var13--;
			}
			if ((var29 & 0x1) != 0) {
				var14++;
			} else if ((var29 & 0x4) != 0) {
				var14--;
			}
			var29 = class190.field3673[var13][var14];
		}
		if (var31 > 0) {
			class248.method1611(arg9, class120.field2203, class97.field1781, var31);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("jj.a(Z)V")
	public static void method738() {
		class143.field2654.method205();
		for (int var0 = 0; var0 < 32; var0++) {
			class89.field1696[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			class48.field903[var1] = 0L;
		}
		class153.field2960 = 0;
	}

	@ObfuscatedName("jj.a(IIIIIIIIII)V")
	public static void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg2 >= class67.field1207 && class12.field183 >= arg2 && class67.field1207 <= arg3 && class12.field183 >= arg3 && arg8 >= class67.field1207 && class12.field183 >= arg8 && arg5 >= class67.field1207 && arg5 <= class12.field183 && arg1 >= class49.field919 && arg1 <= class18.field279 && arg0 >= class49.field919 && class18.field279 >= arg0 && class49.field919 <= arg4 && arg4 <= class18.field279 && class49.field919 <= arg6 && arg6 <= class18.field279) {
			class153.method1042(arg3, arg7, arg5, arg0, arg1, arg6, arg4, arg2, arg8);
		} else {
			class147.method982(arg2, arg3, arg5, arg7, arg6, arg0, arg1, arg4, arg8);
		}
	}

	@ObfuscatedName("jj.a(I)V")
	public static void method740() {
		if (class92.field1734 != null && class150.field2920 != null) {
			return;
		}
		class92.field1734 = new int[256];
		class150.field2920 = new int[256];
		for (int var0 = 0; var0 < 256; var0++) {
			double var1 = (double) var0 / 255.0D * 6.283185307179586D;
			class92.field1734[var0] = (int) (Math.sin(var1) * 4096.0D);
			class150.field2920[var0] = (int) (Math.cos(var1) * 4096.0D);
		}
	}
}
