package deob;

@ObfuscatedName("wb")
public abstract class class241 {

	@ObfuscatedName("wb.a")
	public static int field4461;

	@ObfuscatedName("wb.b")
	public static final class88 field4462 = class208.method1423(105, "cyan:");

	@ObfuscatedName("wb.c")
	public static class88 field4463 = field4462;

	@ObfuscatedName("wb.e")
	public static final class154 field4465 = new class154(4096);

	@ObfuscatedName("wb.g")
	public static final class88 field4467 = field4462;

	@ObfuscatedName("wb.j")
	public static final class24 field4470 = new class24(50);

	@ObfuscatedName("wb.k")
	public static final class92 field4471 = new class92(64);

	@ObfuscatedName("wb.l")
	public static final class88 field4472 = class208.method1423(105, "Begeben Sie sich in ein freies Gebiet)1 um");

	@ObfuscatedName("wb.a(Lq;IIIIBI)V")
	public static void method1588(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg3 * arg3 + arg1 * arg1;
		if (var6 > 360000) {
			return;
		}
		int var7 = Math.min(arg0.field3380 / 2, arg0.field3422 / 2);
		if (var7 * var7 >= var6) {
			class57.method418(arg2, arg5, arg3, arg0, class227.field4257[arg4], arg1);
			return;
		}
		var7 -= 10;
		int var8 = class52.field943 + class207.field3930 & 0x7FF;
		int var9 = class173.field3354[var8];
		int var10 = var9 * 256 / (class65.field1185 + 256);
		int var11 = class173.field3359[var8];
		int var12 = var11 * 256 / (class65.field1185 + 256);
		int var13 = var10 * arg3 - arg1 * var12 >> 16;
		int var14 = arg3 * var12 + arg1 * var10 >> 16;
		double var15 = Math.atan2((double) var14, (double) var13);
		int var17 = (int) ((double) var7 * Math.sin(var15));
		int var18 = (int) (Math.cos(var15) * (double) var7);
		((class169) class113.field2041[arg4]).method1170(arg5 + arg0.field3380 / 2 + var17 - 10, arg0.field3422 / 2 + -10 + arg2 - var18, var15);
	}

	@ObfuscatedName("wb.a(IIIII)V")
	public static void method1590(int arg0, int arg1, int arg2, int arg3) {
		class72.method480(arg1, arg0, arg2 + arg1, arg3 + arg0);
		class72.method478(arg1, arg0, arg2, arg3, 0);
		if (class228.field4276 < 100) {
			return;
		}
		if (class245.field4500 == null) {
			class169 var4 = new class169(arg2, arg3);
			class72.method496(var4.field3247, arg2, arg3);
			class46.method348(arg3, arg2, 0, 0, class44.field760, 0, class109.field1988, 0);
			class245.field4500 = var4;
			class202.field3852.method1521();
		}
		class245.field4500.method1161(arg1, arg0);
		int var5 = arg1 + class39.field693 * arg2 / class109.field1988;
		int var6 = class71.field1309 * arg2 / class109.field1988;
		int var7 = arg0 + class43.field727 * arg3 / class44.field760;
		int var8 = class164.field3136 * arg3 / class44.field760;
		class72.method497(var5, var7, var6, var8, 16711680, 128);
		class72.method476(var5, var7, var6, var8, 16711680);
		if (class54.field1012 <= 0 || class54.field1012 % 10 >= 5) {
			return;
		}
		for (class65 var9 = (class65) class232.field4359.method1610(); var9 != null; var9 = (class65) class232.field4359.method1619()) {
			if (var9.field1180 == class44.field772) {
				int var10 = arg1 + arg2 * var9.field1179 / class109.field1988;
				int var11 = var9.field1175 * arg3 / class44.field760 + arg0;
				class72.method478(var10 - 2, var11 + -2, 4, 4, 16776960);
			}
		}
	}

	@ObfuscatedName("wb.a(IIIIIIIZIIIII)Z")
	public static boolean method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				class190.field3673[var12][var13] = 0;
				class228.field4267[var12][var13] = 99999999;
			}
		}
		class190.field3673[arg5][arg8] = 99;
		class228.field4267[arg5][arg8] = 0;
		int var14 = arg5;
		int var15 = arg8;
		int var16 = 0;
		boolean var17 = false;
		byte var18 = 0;
		class120.field2203[0] = arg5;
		int var39 = var18 + 1;
		class97.field1781[0] = arg8;
		int[][] var19 = class166.field3200[class149.field2907].field1667;
		label367: while (var16 != var39) {
			var15 = class97.field1781[var16];
			var14 = class120.field2203[var16];
			var16 = var16 + 1 & 0xFFF;
			if (var14 == arg1 && arg4 == var15) {
				var17 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && class166.field3200[class149.field2907].method640(var15, arg3 - 1, arg1, arg4, arg2, arg6, var14)) {
					var17 = true;
					break;
				}
				if (arg3 < 10 && class166.field3200[class149.field2907].method648(arg6, var14, arg3 - 1, arg4, arg2, var15, arg1)) {
					var17 = true;
					break;
				}
			}
			if (arg0 != 0 && arg11 != 0 && class166.field3200[class149.field2907].method650(arg2, arg4, arg0, var15, arg11, var14, arg1, arg10)) {
				var17 = true;
				break;
			}
			int var20 = class228.field4267[var14][var15] + 1;
			if (var14 > 0 && class190.field3673[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg2 - 1] & 0x12C0138) == 0) {
				int var21 = 1;
				while (true) {
					if (arg2 - 1 <= var21) {
						class120.field2203[var39] = var14 - 1;
						class97.field1781[var39] = var15;
						var39 = var39 + 1 & 0xFFF;
						class190.field3673[var14 - 1][var15] = 2;
						class228.field4267[var14 - 1][var15] = var20;
						break;
					}
					if ((var19[var14 - 1][var21 + var15] & 0x12C013E) != 0) {
						break;
					}
					var21++;
				}
			}
			if (var14 < 102 && class190.field3673[var14 + 1][var15] == 0 && (var19[var14 + arg2][var15] & 0x12C0183) == 0 && (var19[var14 + arg2][arg2 + var15 - 1] & 0x12C01E0) == 0) {
				int var22 = 1;
				while (true) {
					if (var22 >= arg2 - 1) {
						class120.field2203[var39] = var14 + 1;
						class97.field1781[var39] = var15;
						var39 = var39 + 1 & 0xFFF;
						class190.field3673[var14 + 1][var15] = 8;
						class228.field4267[var14 + 1][var15] = var20;
						break;
					}
					if ((var19[var14 + arg2][var22 + var15] & 0x12C01E3) != 0) {
						break;
					}
					var22++;
				}
			}
			if (var15 > 0 && class190.field3673[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
				int var23 = 1;
				while (true) {
					if (arg2 - 1 <= var23) {
						class120.field2203[var39] = var14;
						class97.field1781[var39] = var15 - 1;
						var39 = var39 + 1 & 0xFFF;
						class190.field3673[var14][var15 - 1] = 1;
						class228.field4267[var14][var15 - 1] = var20;
						break;
					}
					if ((var19[var14 + var23][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var23++;
				}
			}
			if (var15 < 102 && class190.field3673[var14][var15 + 1] == 0 && (var19[var14][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14 - 1][var15 + arg2] & 0x12C01E0) == 0) {
				int var24 = 1;
				while (true) {
					if (var24 >= arg2 - 1) {
						class120.field2203[var39] = var14;
						class97.field1781[var39] = var15 + 1;
						var39 = var39 + 1 & 0xFFF;
						class190.field3673[var14][var15 + 1] = 4;
						class228.field4267[var14][var15 + 1] = var20;
						break;
					}
					if ((var19[var14 + var24][arg2 + var15] & 0x12C01F8) != 0) {
						break;
					}
					var24++;
				}
			}
			if (var14 > 0 && var15 > 0 && class190.field3673[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg2 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
				int var25 = 1;
				while (true) {
					if (var25 >= arg2 - 1) {
						class120.field2203[var39] = var14 - 1;
						class97.field1781[var39] = var15 - 1;
						var39 = var39 + 1 & 0xFFF;
						class190.field3673[var14 - 1][var15 - 1] = 3;
						class228.field4267[var14 - 1][var15 - 1] = var20;
						break;
					}
					if ((var19[var14 - 1][var15 + var25 - 1] & 0x12C013E) != 0 || (var19[var14 + var25 - 1][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var25++;
				}
			}
			if (var14 < 102 && var15 > 0 && class190.field3673[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg2 + var14][var15 + arg2 - 1 - 1] & 0x12C01E0) == 0) {
				int var26 = 1;
				while (true) {
					if (arg2 - 1 <= var26) {
						class120.field2203[var39] = var14 + 1;
						class97.field1781[var39] = var15 - 1;
						class190.field3673[var14 + 1][var15 - 1] = 9;
						class228.field4267[var14 + 1][var15 - 1] = var20;
						var39 = var39 + 1 & 0xFFF;
						break;
					}
					if ((var19[var14 + arg2][var26 + var15 - 1] & 0x12C01E3) != 0 || (var19[var14 + var26 + 1][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var26++;
				}
			}
			if (var14 > 0 && var15 < 102 && class190.field3673[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg2] & 0x12C01E0) == 0) {
				int var27 = 1;
				while (true) {
					if (var27 >= arg2 - 1) {
						class120.field2203[var39] = var14 - 1;
						class97.field1781[var39] = var15 + 1;
						var39 = var39 + 1 & 0xFFF;
						class190.field3673[var14 - 1][var15 + 1] = 6;
						class228.field4267[var14 - 1][var15 + 1] = var20;
						break;
					}
					if ((var19[var14 - 1][var27 + var15 + 1] & 0x12C013E) != 0 || (var19[var14 + var27 - 1][var15 + arg2] & 0x12C01F8) != 0) {
						break;
					}
					var27++;
				}
			}
			if (var14 < 102 && var15 < 102 && class190.field3673[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14][arg2 + var15] & 0x12C01E0) == 0 && (var19[arg2 + var14][var15 + 1] & 0x12C0183) == 0) {
				for (int var28 = 1; var28 < arg2 - 1; var28++) {
					if ((var19[var28 + var14 + 1][var15 + arg2] & 0x12C01F8) != 0 || (var19[arg2 + var14][var15 + var28 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				class120.field2203[var39] = var14 + 1;
				class97.field1781[var39] = var15 + 1;
				var39 = var39 + 1 & 0xFFF;
				class190.field3673[var14 + 1][var15 + 1] = 12;
				class228.field4267[var14 + 1][var15 + 1] = var20;
			}
		}
		class120.field2186 = 0;
		if (!var17) {
			if (!arg7) {
				return false;
			}
			int var29 = 1000;
			int var30 = 100;
			for (int var31 = arg1 - 10; var31 <= arg1 + 10; var31++) {
				for (int var32 = arg4 - 10; var32 <= arg4 + 10; var32++) {
					if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && class228.field4267[var31][var32] < 100) {
						int var33 = 0;
						if (arg1 > var31) {
							var33 = arg1 - var31;
						} else if (arg0 + arg1 - 1 < var31) {
							var33 = var31 + 1 - arg1 - arg0;
						}
						int var34 = 0;
						if (arg4 > var32) {
							var34 = arg4 - var32;
						} else if (var32 > arg11 + arg4 - 1) {
							var34 = var32 + 1 - arg11 - arg4;
						}
						int var35 = var33 * var33 + var34 * var34;
						if (var29 > var35 || var29 == var35 && var30 > class228.field4267[var31][var32]) {
							var14 = var31;
							var29 = var35;
							var30 = class228.field4267[var31][var32];
							var15 = var32;
						}
					}
				}
			}
			if (var29 == 1000) {
				return false;
			}
			if (var14 == arg5 && var15 == arg8) {
				return false;
			}
			class120.field2186 = 1;
		}
		byte var36 = 0;
		class120.field2203[0] = var14;
		int var40 = var36 + 1;
		class97.field1781[0] = var15;
		int var37;
		int var38 = var37 = class190.field3673[var14][var15];
		while (var14 != arg5 || var15 != arg8) {
			if (var38 != var37) {
				var37 = var38;
				class120.field2203[var40] = var14;
				class97.field1781[var40++] = var15;
			}
			if ((var38 & 0x1) != 0) {
				var15++;
			} else if ((var38 & 0x4) != 0) {
				var15--;
			}
			if ((var38 & 0x2) != 0) {
				var14++;
			} else if ((var38 & 0x8) != 0) {
				var14--;
			}
			var38 = class190.field3673[var14][var15];
		}
		if (var40 > 0) {
			class248.method1611(arg9, class120.field2203, class97.field1781, var40);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("wb.a(IIIIII)V")
	public static void method1592(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg1 - 32) * arg1 / arg3;
		if (var5 < 8) {
			var5 = 8;
		}
		class7.field106[0].method876(arg4, arg2);
		int var6 = arg0 * (arg1 - var5 - 32) / (arg3 - arg1);
		class7.field106[1].method876(arg4, arg1 + arg2 - 16);
		class72.method478(arg4, arg2 + 16, 16, arg1 - 32, class238.field4432);
		class72.method478(arg4, var6 + arg2 + 16, 16, var5, class3.field26);
		class72.method487(arg4, var6 + arg2 + 16, var5, class230.field4316);
		class72.method487(arg4 + 1, var6 + 16 + arg2, var5, class230.field4316);
		class72.method489(arg4, arg2 + var6 + 16, 16, class230.field4316);
		class72.method489(arg4, var6 + arg2 + 17, 16, class230.field4316);
		class72.method487(arg4 + 15, arg2 + 16 + var6, var5, class52.field939);
		class72.method487(arg4 + 14, arg2 - -var6 + 17, var5 - 1, class52.field939);
		class72.method489(arg4, var6 + arg2 + var5 + 15, 16, class52.field939);
		class72.method489(arg4 + 1, var6 + 14 + arg2 + var5, 15, class52.field939);
	}
}
