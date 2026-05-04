package deob;

import java.io.IOException;

@ObfuscatedName("hc")
public final class class80 extends class23 {

	@ObfuscatedName("hc.ab")
	public static class188[] field1448;

	@ObfuscatedName("hc.db")
	public static final class88 field1451 = class208.method1423(105, "Could not complete login)3");

	@ObfuscatedName("hc.eb")
	public static int field1452;

	@ObfuscatedName("hc.W")
	public static final class88 field1444 = class208.method1423(105, "details)3dat");

	@ObfuscatedName("hc.R")
	public static final class88 field1439 = class208.method1423(105, "Ung-Ultige Session)2ID)3");

	@ObfuscatedName("hc.Z")
	public static final int[] field1447 = new int[100];

	@ObfuscatedName("hc.Y")
	public static final class141[] field1446 = new class141[50];

	@ObfuscatedName("hc.X")
	public static class88 field1445 = field1451;

	@ObfuscatedName("hc.U")
	public static class24 field1442;

	@ObfuscatedName("hc.a(ZILmf;)V")
	public static void method529(boolean arg0, class137 arg1) {
		if (class214.field4033 != null) {
			try {
				class214.field4033.method917();
			} catch (Exception var7) {
			}
			class214.field4033 = null;
		}
		class214.field4033 = arg1;
		class147.method988(arg0);
		class149.field2908 = null;
		class28.field473 = 0;
		class53.field990 = null;
		class78.field1408.field831 = 0;
		while (true) {
			class97 var2 = (class97) class151.field2922.method1047();
			if (var2 == null) {
				while (true) {
					class97 var3 = (class97) class108.field1951.method1047();
					if (var3 == null) {
						if (class18.field294 != 0) {
							try {
								class46 var4 = new class46(4);
								var4.method346(4);
								var4.method346(class18.field294);
								var4.method305(0);
								class214.field4033.method911(4, var4.field842);
							} catch (IOException var6) {
								try {
									class214.field4033.method917();
								} catch (Exception var5) {
								}
								class214.field4033 = null;
								class77.field1389++;
							}
						}
						class150.field2916 = 0;
						class81.field1456 = class206.method1418();
						return;
					}
					class138.field2559.method1388(var3);
					class205.field3907.method1052(var3.field1219, var3);
					class220.field4157++;
					class231.field4333--;
				}
			}
			class241.field4465.method1052(var2.field1219, var2);
			class203.field3876--;
			class208.field3943++;
		}
	}

	@ObfuscatedName("hc.a(ILq;)I")
	public static int method530(class174 arg0) {
		class192 var1 = (class192) class31.field495.method1049(((long) arg0.field3423 << 32) + ((long) arg0.field3406));
		return var1 == null ? arg0.field3494 : var1.field3698;
	}

	@ObfuscatedName("hc.a(IIILq;)V")
	public static void method532(int arg0, int arg1, class174 arg2) {
		if (class179.field3568 != null || class108.field1958 || (arg2 == null || class225.method1512(arg2) == null)) {
			return;
		}
		class179.field3568 = arg2;
		class49.field923 = class225.method1512(arg2);
		class227.field4256 = 0;
		class148.field2791 = arg0;
		class203.field3867 = false;
		class207.field3941 = arg1;
	}

	@ObfuscatedName("hc.b(ILq;)Z")
	public static boolean method533(class174 arg0) {
		if (arg0.field3516 == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.field3516.length; var1++) {
			int var2 = class110.method761(var1, arg0);
			int var3 = arg0.field3486[var1];
			if (arg0.field3516[var1] == 2) {
				if (var3 <= var2) {
					return false;
				}
			} else if (arg0.field3516[var1] == 3) {
				if (var2 <= var3) {
					return false;
				}
			} else if (arg0.field3516[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var2 != var3) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("hc.b(IBI)I")
	public static int method534(int arg0, int arg1) {
		int var2 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				var2 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("hc.a(BI)V")
	public static void method535(int arg0) {
		class32.field526 += arg0 * 128;
		if (class32.field526 > class221.field4169.length) {
			class32.field526 -= class221.field4169.length;
			int var1 = (int) (Math.random() * 12.0D);
			class49.method369(class230.field4320[var1]);
		}
		int var2 = 0;
		int var3 = arg0 * 128;
		int var4 = (256 - arg0) * 128;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = class190.field3667[var3 + var2] - arg0 * class221.field4169[class221.field4169.length - 1 & class32.field526 + var2] / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			class190.field3667[var2++] = var6;
		}
		for (int var7 = 256 - arg0; var7 < 256; var7++) {
			int var8 = var7 * 128;
			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int) (Math.random() * 100.0D);
				if (var10 < 50 && var9 > 10 && var9 < 118) {
					class190.field3667[var9 + var8] = 255;
				} else {
					class190.field3667[var8 + var9] = 0;
				}
			}
		}
		if (class161.field3099 > 0) {
			class161.field3099 -= arg0 * 4;
		}
		if (class154.field2969 > 0) {
			class154.field2969 -= arg0 * 4;
		}
		if (class154.field2969 == 0 && class161.field3099 == 0) {
			int var11 = (int) (Math.random() * (double) (2000 / arg0));
			if (var11 == 1) {
				class161.field3099 = 1024;
			}
			if (var11 == 0) {
				class154.field2969 = 1024;
			}
		}
		for (int var12 = 0; var12 < 256 - arg0; var12++) {
			class240.field4454[var12] = class240.field4454[arg0 + var12];
		}
		for (int var13 = 256 - arg0; var13 < 256; var13++) {
			class240.field4454[var13] = (int) (Math.sin((double) class49.field924 / 14.0D) * 16.0D + Math.sin((double) class49.field924 / 15.0D) * 14.0D + Math.sin((double) class49.field924 / 16.0D) * 12.0D);
			class49.field924++;
		}
		class66.field1192 += arg0;
		int var14 = ((class117.field2113 & 0x1) + arg0) / 2;
		if (var14 <= 0) {
			return;
		}
		for (int var15 = 0; var15 < class66.field1192 * 100; var15++) {
			int var16 = (int) (Math.random() * 124.0D) + 2;
			int var17 = (int) (Math.random() * 128.0D) + 128;
			class190.field3667[var16 + (var17 << 7)] = 192;
		}
		class66.field1192 = 0;
		for (int var18 = 0; var18 < 256; var18++) {
			int var19 = 0;
			int var20 = var18 * 128;
			for (int var21 = -var14; var21 < 128; var21++) {
				if (var14 + var21 < 128) {
					var19 += class190.field3667[var20 + var21 + var14];
				}
				if (var21 - var14 - 1 >= 0) {
					var19 -= class190.field3667[var21 + var20 - var14 - 1];
				}
				if (var21 >= 0) {
					class141.field2609[var21 + var20] = var19 / (var14 * 2 + 1);
				}
			}
		}
		for (int var22 = 0; var22 < 128; var22++) {
			int var23 = 0;
			for (int var24 = -var14; var24 < 256; var24++) {
				int var25 = var24 * 128;
				if (var14 + var24 < 256) {
					var23 += class141.field2609[var14 * 128 + var22 + var25];
				}
				if (var24 - var14 - 1 >= 0) {
					var23 -= class141.field2609[var22 + var25 - var14 * 128 - 128];
				}
				if (var24 >= 0) {
					class190.field3667[var25 + var22] = var23 / (var14 * 2 + 1);
				}
			}
		}
	}

	public class80() {
		super(0, true);
	}

	@ObfuscatedName("hc.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		return class22.field351;
	}
}
