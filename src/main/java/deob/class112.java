package deob;

import java.awt.Component;
import java.awt.FontMetrics;

@ObfuscatedName("qa")
public final class class112 {

	@ObfuscatedName("qa.c")
	public static final int field2615 = 2301979;

	@ObfuscatedName("qa.d")
	public static class156 field2616 = new class156(32);

	@ObfuscatedName("qa.e")
	public static class32 field2617 = class73.method593("(Udns", true);

	@ObfuscatedName("qa.i")
	public static boolean field2621 = false;

	@ObfuscatedName("qa.j")
	public static boolean field2622 = false;

	@ObfuscatedName("qa.m")
	public static class32 field2625 = class73.method593("Type", true);

	@ObfuscatedName("qa.h")
	public static class32 field2620 = field2625;

	@ObfuscatedName("qa.n")
	public static int[] field2626 = new int[50];

	@ObfuscatedName("qa.o")
	public static class157 field2627 = new class157();

	@ObfuscatedName("qa.p")
	public static class32 field2628 = class73.method593("k", true);

	@ObfuscatedName("qa.q")
	public static class32 field2629 = class73.method593("Anmelde)2Limit -Uberschritten)3", true);

	@ObfuscatedName("qa.r")
	public static int field2630 = 0;

	@ObfuscatedName("qa.s")
	public static FontMetrics field2631;

	@ObfuscatedName("qa.t")
	public static class32 field2632 = class73.method593("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", true);

	@ObfuscatedName("qa.u")
	public static class32 field2633 = class73.method593("scrollen:", true);

	@ObfuscatedName("qa.a(BLea;Lea;Lec;Lec;)Lnf;")
	public static class96 method879(class30 arg0, class30 arg1, class32 arg2, class32 arg3) {
		int var4 = arg0.method201(arg3);
		int var5 = arg0.method215(arg2, var4);
		return class129.method998(var4, arg1, arg0, var5);
	}

	@ObfuscatedName("qa.a(Z)V")
	public static void method880() {
		field2617 = null;
		field2620 = null;
		field2626 = null;
		field2628 = null;
		field2629 = null;
		field2631 = null;
		field2632 = null;
		field2633 = null;
		field2627 = null;
		field2625 = null;
		field2616 = null;
	}

	@ObfuscatedName("qa.a(Lea;BLea;Ljava/awt/Component;)V")
	public static void method881(class30 arg0, class30 arg1, Component arg2) {
		if (class136.field3170) {
			return;
		}
		class141.method1054();
		byte[] var3 = arg0.method219(class82.field1906, class74.field1748);
		class100.field2320 = new class49(var3, arg2);
		class45.field1052 = class100.field2320.method385();
		class98.field2262 = class136.method1033(class74.field1748, arg1, class32.field632);
		class4.field71 = class136.method1033(class74.field1748, arg1, class68.field1594);
		class80.field1851 = class136.method1033(class74.field1748, arg1, class115.field2760);
		class74.field1752 = class56.method443(class74.field1748, class71.field1673, arg1);
		class14.field237 = class56.method443(class74.field1748, class105.field2500, arg1);
		class94.field2169 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			class94.field2169[var4] = var4 * 262144;
		}
		for (int var5 = 0; var5 < 64; var5++) {
			class94.field2169[var5 + 64] = var5 * 1024 + 16711680;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			class94.field2169[var6 + 128] = var6 * 4 + 16776960;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			class94.field2169[var7 + 192] = 16777215;
		}
		class133.field3086 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			class133.field3086[var8] = var8 * 1024;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			class133.field3086[var9 + 64] = var9 * 4 + 65280;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			class133.field3086[var10 + 128] = var10 * 262144 + 65535;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			class133.field3086[var11 + 192] = 16777215;
		}
		class124.field2890 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			class124.field2890[var12] = var12 * 4;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			class124.field2890[var13 + 64] = var13 * 262144 + 255;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			class124.field2890[var14 + 128] = var14 * 1024 + 16711935;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			class124.field2890[var15 + 192] = 16777215;
		}
		class5.field99 = new int[32768];
		class9.field160 = new int[32768];
		class63.field1442 = new int[256];
		class71.method581(null);
		class74.field1751 = class74.field1748;
		if (class158.field3638 == 0) {
			class30.field551 = true;
		} else {
			class30.field551 = false;
		}
		class11.field189 = 0;
		class117.field2792 = false;
		class43.field998 = new int[32768];
		class74.field1738 = class74.field1748;
		class3.field44 = new int[32768];
		if (class30.field551) {
			class152.method1176();
		} else {
			class72.method590(class124.field2887, class73.field1712, class74.field1748);
		}
		class94.method740(false);
		class136.field3170 = true;
		class100.field2320.method387(0, 0);
		class45.field1052.method387(382, 0);
		class98.field2262.method399(382 - class98.field2262.field1167 / 2, 18);
	}

	@ObfuscatedName("qa.a(II)V")
	public static void method882(int arg0) {
		class82.method644();
		class125.method981();
		int var1 = class56.method440(arg0).field1351;
		if (var1 == 0) {
			return;
		}
		int var2 = class27.field504[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				class7.method29(0.9D);
				((class140) class7.field126).method1048(0.9D);
			}
			if (var2 == 2) {
				class7.method29(0.8D);
				((class140) class7.field126).method1048(0.8D);
			}
			if (var2 == 3) {
				class7.method29(0.7D);
				((class140) class7.field126).method1048(0.7D);
			}
			if (var2 == 4) {
				class7.method29(0.6D);
				((class140) class7.field126).method1048(0.6D);
			}
			class105.method857();
		}
		if (var1 == 3) {
			short var3 = 0;
			if (var2 == 0) {
				var3 = 255;
			}
			if (var2 == 1) {
				var3 = 192;
			}
			if (var2 == 2) {
				var3 = 128;
			}
			if (var2 == 3) {
				var3 = 64;
			}
			if (var2 == 4) {
				var3 = 0;
			}
			if (class158.field3638 != var3) {
				if (class158.field3638 == 0 && class12.field206 != -1) {
					class154.method1195(class124.field2887, class12.field206, var3, 0);
					field2621 = false;
				} else if (var3 == 0) {
					class68.method565();
					field2621 = false;
				} else {
					class68.method568(var3);
				}
				class158.field3638 = var3;
			}
		}
		if (var1 == 10) {
			if (var2 == 0) {
				class114.field2646 = 127;
			}
			if (var2 == 1) {
				class114.field2646 = 96;
			}
			if (var2 == 2) {
				class114.field2646 = 64;
			}
			if (var2 == 3) {
				class114.field2646 = 32;
			}
			if (var2 == 4) {
				class114.field2646 = 0;
			}
		}
		if (var1 == 6) {
			class44.field1035 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				class70.field1629 = 127;
			}
			if (var2 == 1) {
				class70.field1629 = 96;
			}
			if (var2 == 2) {
				class70.field1629 = 64;
			}
			if (var2 == 3) {
				class70.field1629 = 32;
			}
			if (var2 == 4) {
				class70.field1629 = 0;
			}
		}
		if (var1 == 5) {
			class125.field2898 = var2;
		}
		if (var1 == 9) {
			class124.field2885 = var2;
		}
	}

	@ObfuscatedName("qa.a(I)I")
	public static int method883() {
		return 6;
	}

	@ObfuscatedName("qa.a(ZI)[B")
	public static synchronized byte[] method884(int arg0) {
		if (arg0 == 100 && class50.field1160 > 0) {
			byte[] var1 = class57.field1314[--class50.field1160];
			class57.field1314[class50.field1160] = null;
			return var1;
		} else if (arg0 == 5000 && class113.field2640 > 0) {
			byte[] var2 = class92.field2125[--class113.field2640];
			class92.field2125[class113.field2640] = null;
			return var2;
		} else if (arg0 == 30000 && class85.field1979 > 0) {
			byte[] var3 = class156.field3575[--class85.field1979];
			class156.field3575[class85.field1979] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
