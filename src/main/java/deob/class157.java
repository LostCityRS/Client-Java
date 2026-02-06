package deob;

@ObfuscatedName("wd")
public final class class157 {

	@ObfuscatedName("wd.d")
	public final class146 field3581 = new class146();

	@ObfuscatedName("wd.i")
	public static volatile int field3586 = 0;

	@ObfuscatedName("wd.o")
	public static class32 field3592 = class73.method593("hel", true);

	@ObfuscatedName("wd.q")
	public static class157 field3594 = new class157();

	@ObfuscatedName("wd.s")
	public static class44 field3596;

	@ObfuscatedName("wd.t")
	public static class156 field3597;

	@ObfuscatedName("wd.w")
	public static class32 field3600 = class73.method593("Ein kostenloses Spielkonto erstellen)3", true);

	@ObfuscatedName("wd.x")
	public static class32 field3601 = class73.method593("Loading wordpack )2 ", true);

	@ObfuscatedName("wd.y")
	public static class32 field3602 = field3601;

	@ObfuscatedName("wd.D")
	public static int[] field3607 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("wd.B")
	public static boolean field3605 = false;

	@ObfuscatedName("wd.C")
	public static int field3606;

	@ObfuscatedName("wd.z")
	public class146 field3603;

	@ObfuscatedName("wd.A")
	public static class36 field3604;

	@ObfuscatedName("wd.a(III)V")
	public static void method1205(int arg0, int arg1) {
		class157 var2 = class23.field397[class43.field989][arg1][arg0];
		if (var2 == null) {
			class159.field3657.method1126(class43.field989, arg1, arg0);
			return;
		}
		int var3 = -99999999;
		class17 var4 = null;
		for (class17 var5 = (class17) var2.method1211(); var5 != null; var5 = (class17) var2.method1209()) {
			class62 var6 = class146.method1092(var5.field333);
			int var7 = var6.field1375;
			if (var6.field1409 == 1) {
				var7 *= var5.field336 + 1;
			}
			if (var7 > var3) {
				var4 = var5;
				var3 = var7;
			}
		}
		if (var4 == null) {
			class159.field3657.method1126(class43.field989, arg1, arg0);
			return;
		}
		var2.method1207(var4);
		class17 var8 = null;
		class17 var9 = (class17) var2.method1211();
		class17 var10 = null;
		while (var9 != null) {
			if (var4.field333 != var9.field333) {
				if (var8 == null) {
					var8 = var9;
				}
				if (var9.field333 != var8.field333 && var10 == null) {
					var10 = var9;
				}
			}
			var9 = (class17) var2.method1209();
		}
		int var11 = arg1 + (arg0 << 7) + 1610612736;
		class159.field3657.method1165(class43.field989, arg1, arg0, class83.method653(class43.field989, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var8, var10);
	}

	@ObfuscatedName("wd.a(II)Z")
	public static boolean method1210(int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@ObfuscatedName("wd.b(II)Z")
	public static boolean method1212(int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@ObfuscatedName("wd.a(Z)V")
	public static void method1213() {
		int var0 = class83.field1922 * 128 + 64;
		int var1 = class106.field2528 * 128 + 64;
		int var2 = class83.method653(class43.field989, var0, var1) - class142.field3253;
		if (class105.field2494 < var0) {
			class105.field2494 += class80.field1836 + class89.field2058 * (var0 - class105.field2494) / 1000;
			if (var0 < class105.field2494) {
				class105.field2494 = var0;
			}
		}
		if (var2 > class73.field1719) {
			class73.field1719 += (var2 - class73.field1719) * class89.field2058 / 1000 + class80.field1836;
			if (class73.field1719 > var2) {
				class73.field1719 = var2;
			}
		}
		if (var2 < class73.field1719) {
			class73.field1719 -= (class73.field1719 - var2) * class89.field2058 / 1000 + class80.field1836;
			if (var2 > class73.field1719) {
				class73.field1719 = var2;
			}
		}
		if (class48.field1126 < var1) {
			class48.field1126 += class80.field1836 + (var1 - class48.field1126) * class89.field2058 / 1000;
			if (var1 < class48.field1126) {
				class48.field1126 = var1;
			}
		}
		if (var0 < class105.field2494) {
			class105.field2494 -= class80.field1836 + (class105.field2494 - var0) * class89.field2058 / 1000;
			if (class105.field2494 < var0) {
				class105.field2494 = var0;
			}
		}
		int var3 = class86.field2021 * 128 + 64;
		if (class48.field1126 > var1) {
			class48.field1126 -= class89.field2058 * (class48.field1126 - var1) / 1000 + class80.field1836;
			if (var1 > class48.field1126) {
				class48.field1126 = var1;
			}
		}
		int var4 = class37.field896 * 128 + 64;
		int var5 = class83.method653(class43.field989, var3, var4) - class61.field1359;
		int var6 = var4 - class48.field1126;
		int var7 = var3 - class105.field2494;
		int var8 = var5 - class73.field1719;
		int var9 = (int) Math.sqrt((double) (var7 * var7 + var6 * var6));
		int var10 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var7, (double) var6) * -325.949D) & 0x7FF;
		int var12 = var11 - class115.field2718;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var10 < 128) {
			var10 = 128;
		}
		if (var10 > 383) {
			var10 = 383;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (class45.field1049 < var10) {
			class45.field1049 += class94.field2174 + class79.field1824 * (var10 - class45.field1049) / 1000;
			if (class45.field1049 > var10) {
				class45.field1049 = var10;
			}
		}
		if (var12 > 0) {
			class115.field2718 += class79.field1824 * var12 / 1000 + class94.field2174;
			class115.field2718 &= 0x7FF;
		}
		if (var12 < 0) {
			class115.field2718 -= class94.field2174 + -var12 * class79.field1824 / 1000;
			class115.field2718 &= 0x7FF;
		}
		if (var10 < class45.field1049) {
			class45.field1049 -= class79.field1824 * (class45.field1049 - var10) / 1000 + class94.field2174;
			if (class45.field1049 < var10) {
				class45.field1049 = var10;
			}
		}
		int var13 = var11 - class115.field2718;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
			class115.field2718 = var11;
		}
	}

	@ObfuscatedName("wd.d(B)V")
	public static void method1217() {
		field3600 = null;
		field3604 = null;
		field3596 = null;
		field3597 = null;
		field3592 = null;
		field3602 = null;
		field3607 = null;
		field3594 = null;
		field3601 = null;
	}

	@ObfuscatedName("wd.a(BLf;I)I")
	public static int method1218(class36 arg0, int arg1) {
		if (arg0.field842 == null || arg1 >= arg0.field842.length) {
			return -2;
		}
		try {
			int[] var2 = arg0.field842[arg1];
			byte var3 = 0;
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var2[var5++];
				int var7 = 0;
				byte var8 = 0;
				if (var6 == 0) {
					return var4;
				}
				if (var6 == 1) {
					var7 = class137.field3173[var2[var5++]];
				}
				if (var6 == 15) {
					var8 = 1;
				}
				if (var6 == 2) {
					var7 = class50.field1159[var2[var5++]];
				}
				if (var6 == 3) {
					var7 = class17.field343[var2[var5++]];
				}
				if (var6 == 16) {
					var8 = 2;
				}
				if (var6 == 17) {
					var8 = 3;
				}
				if (var6 == 4) {
					int var9 = var2[var5++] << 16;
					int var10 = var9 + var2[var5++];
					class36 var11 = class128.method991(var10);
					int var12 = var2[var5++];
					if (var12 != -1 && (!class146.method1092(var12).field1392 || class146.field3315)) {
						for (int var13 = 0; var13 < var11.field834.length; var13++) {
							if (var11.field834[var13] == var12 + 1) {
								var7 += var11.field753[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var7 = class27.field504[var2[var5++]];
				}
				if (var6 == 6) {
					var7 = class135.field3142[class50.field1159[var2[var5++]] - 1];
				}
				if (var6 == 7) {
					var7 = class27.field504[var2[var5++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var7 = class20.field373.field1635;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (class45.field1069[var14]) {
							var7 += class50.field1159[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var5++] << 16;
					int var16 = var15 + var2[var5++];
					class36 var17 = class128.method991(var16);
					int var18 = var2[var5++];
					if (var18 != -1 && (!class146.method1092(var18).field1392 || class146.field3315)) {
						for (int var19 = 0; var19 < var17.field834.length; var19++) {
							if (var18 + 1 == var17.field834[var19]) {
								var7 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var7 = class136.field3153;
				}
				if (var6 == 12) {
					var7 = class3.field49;
				}
				if (var6 == 13) {
					int var20 = class27.field504[var2[var5++]];
					int var21 = var2[var5++];
					var7 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var6 == 14) {
					int var22 = var2[var5++];
					var7 = class70.method577(var22);
				}
				if (var6 == 18) {
					var7 = class72.field1700 + (class20.field373.field2747 >> 7);
				}
				if (var6 == 19) {
					var7 = class118.field2836 + (class20.field373.field2698 >> 7);
				}
				if (var6 == 20) {
					var7 = var2[var5++];
				}
				if (var8 == 0) {
					if (var3 == 0) {
						var4 += var7;
					}
					if (var3 == 1) {
						var4 -= var7;
					}
					if (var3 == 2 && var7 != 0) {
						var4 /= var7;
					}
					if (var3 == 3) {
						var4 *= var7;
					}
					var3 = 0;
				} else {
					var3 = var8;
				}
			}
		} catch (Exception var23) {
			return -1;
		}
	}

	@ObfuscatedName("wd.d(I)V")
	public static void method1219() {
		class2.field24.method490();
	}

	public class157() {
		this.field3581.field3316 = this.field3581;
		this.field3581.field3320 = this.field3581;
	}

	@ObfuscatedName("wd.a(B)V")
	public void method1204() {
		while (true) {
			class146 var1 = this.field3581.field3320;
			if (var1 == this.field3581) {
				return;
			}
			var1.method1091();
		}
	}

	@ObfuscatedName("wd.b(B)Lv;")
	public class146 method1206() {
		class146 var1 = this.field3581.field3316;
		if (this.field3581 == var1) {
			return null;
		} else {
			var1.method1091();
			return var1;
		}
	}

	@ObfuscatedName("wd.a(ILv;)V")
	public void method1207(class146 arg0) {
		if (arg0.field3316 != null) {
			arg0.method1091();
		}
		arg0.field3320 = this.field3581.field3320;
		arg0.field3316 = this.field3581;
		arg0.field3316.field3320 = arg0;
		arg0.field3320.field3316 = arg0;
	}

	@ObfuscatedName("wd.a(I)Lv;")
	public class146 method1208() {
		class146 var1 = this.field3603;
		if (this.field3581 == var1) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3316;
			return var1;
		}
	}

	@ObfuscatedName("wd.b(I)Lv;")
	public class146 method1209() {
		class146 var1 = this.field3603;
		if (var1 == this.field3581) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3320;
			return var1;
		}
	}

	@ObfuscatedName("wd.c(I)Lv;")
	public class146 method1211() {
		class146 var1 = this.field3581.field3320;
		if (var1 == this.field3581) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3320;
			return var1;
		}
	}

	@ObfuscatedName("wd.a(Lv;B)V")
	public void method1214(class146 arg0) {
		if (arg0.field3316 != null) {
			arg0.method1091();
		}
		arg0.field3316 = this.field3581.field3316;
		arg0.field3320 = this.field3581;
		arg0.field3316.field3320 = arg0;
		arg0.field3320.field3316 = arg0;
	}

	@ObfuscatedName("wd.c(B)Lv;")
	public class146 method1215() {
		class146 var1 = this.field3581.field3320;
		if (var1 == this.field3581) {
			return null;
		} else {
			var1.method1091();
			return var1;
		}
	}

	@ObfuscatedName("wd.a(Lv;Lv;I)V")
	public void method1216(class146 arg0, class146 arg1) {
		if (arg0.field3316 != null) {
			arg0.method1091();
		}
		arg0.field3316 = arg1.field3316;
		arg0.field3320 = arg1;
		arg0.field3316.field3320 = arg0;
		arg0.field3320.field3316 = arg0;
	}

	@ObfuscatedName("wd.e(I)Lv;")
	public class146 method1220() {
		class146 var1 = this.field3581.field3316;
		if (var1 == this.field3581) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3316;
			return var1;
		}
	}
}
