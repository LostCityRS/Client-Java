package deob;

@ObfuscatedName("jg")
public final class class105 extends class51 {

	@ObfuscatedName("jg.z")
	public static final class248 field1900 = new class248();

	@ObfuscatedName("jg.I")
	public static final class88 field1909 = class208.method1423(105, "welle2:");

	@ObfuscatedName("jg.H")
	public static final int[] field1908 = new int[128];

	@ObfuscatedName("jg.R")
	public static int field1918 = 0;

	@ObfuscatedName("jg.J")
	public static int field1910 = 0;

	@ObfuscatedName("jg.P")
	public static final class88 field1916 = class208.method1423(105, "Anmelde)2Zeitlimit -Uberschritten)3");

	@ObfuscatedName("jg.G")
	public static final int[] field1907 = new int[25];

	@ObfuscatedName("jg.M")
	public final class248 field1913 = new class248();

	@ObfuscatedName("jg.S")
	public final class224 field1919 = new class224();

	@ObfuscatedName("jg.E")
	public final class170 field1905;

	@ObfuscatedName("jg.A")
	public static class169 field1901;

	@ObfuscatedName("jg.L")
	public static int[][][] field1912;

	@ObfuscatedName("jg.a(IIIIBI)V")
	public static void method723(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg1 - arg3;
		int var6 = arg4 - arg0;
		if (var6 == 0) {
			if (var5 != 0) {
				class109.method753(arg2, arg3, arg0, arg1);
			}
		} else if (var5 == 0) {
			class46.method310(arg3, arg4, arg0, arg2);
		} else {
			if (var6 < 0) {
				var6 = -var6;
			}
			if (var5 < 0) {
				var5 = -var5;
			}
			boolean var7 = var6 < var5;
			if (var7) {
				int var8 = arg0;
				arg0 = arg3;
				arg3 = var8;
				int var9 = arg4;
				arg4 = arg1;
				arg1 = var9;
			}
			if (arg4 < arg0) {
				int var10 = arg0;
				int var11 = arg3;
				arg3 = arg1;
				arg0 = arg4;
				arg1 = var11;
				arg4 = var10;
			}
			int var12 = arg1 - arg3;
			int var13 = arg4 - arg0;
			if (var12 < 0) {
				var12 = -var12;
			}
			int var14 = arg3;
			int var15 = -(var13 >> 1);
			int var16 = arg3 < arg1 ? 1 : -1;
			if (var7) {
				for (int var17 = arg0; var17 <= arg4; var17++) {
					class3.field42[var17][var14] = arg2;
					var15 += var12;
					if (var15 > 0) {
						var14 += var16;
						var15 -= var13;
					}
				}
			} else {
				for (int var18 = arg0; var18 <= arg4; var18++) {
					class3.field42[var14][var18] = arg2;
					var15 += var12;
					if (var15 > 0) {
						var15 -= var13;
						var14 += var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("jg.a(Lea;Z)V")
	public static void method725(class46 arg0) {
		if (class175.field3529 != null) {
			try {
				class175.field3529.method818(0L);
				class175.field3529.method806(arg0.field842, 24, arg0.field831);
			} catch (Exception var1) {
			}
		}
		arg0.field831 += 24;
	}

	@ObfuscatedName("jg.a(III)Z")
	public static boolean method726(int arg0, int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("jg.d(I)I")
	public static int method729() {
		return class114.field2068;
	}

	public class105(class170 arg0) {
		this.field1905 = arg0;
	}

	@ObfuscatedName("jg.c()I")
	@Override
	public int method383() {
		return 0;
	}

	@ObfuscatedName("jg.b(I)V")
	@Override
	public void method384(int arg0) {
		this.field1919.method384(arg0);
		for (class127 var2 = (class127) this.field1913.method1610(); var2 != null; var2 = (class127) this.field1913.method1619()) {
			if (!this.field1905.method1200(var2)) {
				int var3 = arg0;
				do {
					if (var2.field2367 >= var3) {
						this.method724(var3, var2);
						var2.field2367 -= var3;
						break;
					}
					this.method724(var2.field2367, var2);
					var3 -= var2.field2367;
				} while (!this.field1905.method1183(null, var3, 0, var2));
			}
		}
	}

	@ObfuscatedName("jg.d()Lef;")
	@Override
	public class51 method385() {
		class127 var1 = (class127) this.field1913.method1610();
		if (var1 == null) {
			return null;
		} else if (var1.field2391 == null) {
			return this.method380();
		} else {
			return var1.field2391;
		}
	}

	@ObfuscatedName("jg.a(IILlg;)V")
	public void method724(int arg0, class127 arg1) {
		if ((this.field1905.field3248[arg1.field2385] & 0x4) != 0 && arg1.field2386 < 0) {
			int var3 = this.field1905.field3282[arg1.field2385] / class11.field161;
			int var4 = (var3 + 1048575 - arg1.field2390) / var3;
			arg1.field2390 = arg1.field2390 + arg0 * var3 & 0xFFFFF;
			if (arg0 >= var4) {
				if (this.field1905.field3286[arg1.field2385] == 0) {
					arg1.field2391 = class162.method1098(arg1.field2380, arg1.field2391.method1104(), arg1.field2391.method1093(), arg1.field2391.method1103());
				} else {
					arg1.field2391 = class162.method1098(arg1.field2380, arg1.field2391.method1104(), 0, arg1.field2391.method1103());
					this.field1905.method1211(arg1, arg1.field2375.field3889[arg1.field2381] < 0);
				}
				if (arg1.field2375.field3889[arg1.field2381] < 0) {
					arg1.field2391.method1119(-1);
				}
				arg0 = arg1.field2390 / var3;
			}
		}
		arg1.field2391.method384(arg0);
	}

	@ObfuscatedName("jg.a()Lef;")
	@Override
	public class51 method380() {
		class127 var1;
		do {
			var1 = (class127) this.field1913.method1619();
			if (var1 == null) {
				return null;
			}
		} while (var1.field2391 == null);
		return var1.field2391;
	}

	@ObfuscatedName("jg.a([III)V")
	@Override
	public void method379(int[] arg0, int arg1, int arg2) {
		this.field1919.method379(arg0, arg1, arg2);
		for (class127 var4 = (class127) this.field1913.method1610(); var4 != null; var4 = (class127) this.field1913.method1619()) {
			if (!this.field1905.method1200(var4)) {
				int var5 = arg2;
				int var6 = arg1;
				do {
					if (var4.field2367 >= var5) {
						this.method728(var5, arg0, var6 + var5, var4, var6);
						var4.field2367 -= var5;
						break;
					}
					this.method728(var4.field2367, arg0, var5 + var6, var4, var6);
					var5 -= var4.field2367;
					var6 += var4.field2367;
				} while (!this.field1905.method1183(arg0, var5, var6, var4));
			}
		}
	}

	@ObfuscatedName("jg.a(II[IILlg;I)V")
	public void method728(int arg0, int[] arg1, int arg2, class127 arg3, int arg4) {
		if ((this.field1905.field3248[arg3.field2385] & 0x4) != 0 && arg3.field2386 < 0) {
			int var6 = this.field1905.field3282[arg3.field2385] / class11.field161;
			while (true) {
				int var7 = (var6 + 1048575 - arg3.field2390) / var6;
				if (var7 > arg0) {
					arg3.field2390 += arg0 * var6;
					break;
				}
				arg0 -= var7;
				arg3.field2391.method379(arg1, arg4, var7);
				int var8 = class11.field161 / 100;
				arg3.field2390 += var6 * var7 - 1048576;
				int var9 = 262144 / var6;
				class162 var10 = arg3.field2391;
				if (var9 < var8) {
					var8 = var9;
				}
				if (this.field1905.field3286[arg3.field2385] == 0) {
					arg3.field2391 = class162.method1098(arg3.field2380, var10.method1104(), var10.method1093(), var10.method1103());
				} else {
					arg3.field2391 = class162.method1098(arg3.field2380, var10.method1104(), 0, var10.method1103());
					this.field1905.method1211(arg3, arg3.field2375.field3889[arg3.field2381] < 0);
					arg3.field2391.method1116(var8, var10.method1093());
				}
				arg4 += var7;
				if (arg3.field2375.field3889[arg3.field2381] < 0) {
					arg3.field2391.method1119(-1);
				}
				var10.method1086(var8);
				var10.method379(arg1, arg4, arg2 - arg4);
				if (var10.method1121()) {
					this.field1919.method1506(var10);
				}
			}
		}
		arg3.field2391.method379(arg1, arg4, arg0);
	}
}
