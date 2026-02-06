package deob;

@ObfuscatedName("wa")
public final class class154 extends class146 {

	@ObfuscatedName("wa.bb")
	public static int field3545 = 0;

	@ObfuscatedName("wa.cb")
	public int field3546;

	@ObfuscatedName("wa.db")
	public class158 field3547;

	@ObfuscatedName("wa.eb")
	public static class32 field3548 = class73.method593("Bitte warten Sie eine Minute", true);

	@ObfuscatedName("wa.fb")
	public final int field3549;

	@ObfuscatedName("wa.gb")
	public int field3550;

	@ObfuscatedName("wa.r")
	public static int[] field3510 = new int[] { 0, 1, 2, 3 };

	@ObfuscatedName("wa.t")
	public static class30 field3512;

	@ObfuscatedName("wa.u")
	public static int field3513 = -1;

	@ObfuscatedName("wa.B")
	public static class32 field3520 = class73.method593("Benutzen Sie die (WPasswort -=ndern(W Option", true);

	@ObfuscatedName("wa.H")
	public static int field3526 = 0;

	@ObfuscatedName("wa.K")
	public static boolean field3529 = false;

	@ObfuscatedName("wa.Z")
	public static int field3543 = 0;

	@ObfuscatedName("wa.T")
	public static class32 field3538 = class73.method593("<br>", true);

	@ObfuscatedName("wa.J")
	public static class32 field3528 = class73.method593("http:)4)4", true);

	@ObfuscatedName("wa.I")
	public final class45[] field3527 = new class45[5];

	@ObfuscatedName("wa.M")
	public int field3531 = 0;

	@ObfuscatedName("wa.W")
	public final int[] field3540 = new int[5];

	@ObfuscatedName("wa.O")
	public final int field3533;

	@ObfuscatedName("wa.z")
	public int field3518;

	@ObfuscatedName("wa.N")
	public final int field3532;

	@ObfuscatedName("wa.C")
	public int field3521;

	@ObfuscatedName("wa.D")
	public int field3522;

	@ObfuscatedName("wa.F")
	public int field3524;

	@ObfuscatedName("wa.G")
	public int field3525;

	@ObfuscatedName("wa.S")
	public class118 field3537;

	@ObfuscatedName("wa.R")
	public class154 field3536;

	@ObfuscatedName("wa.x")
	public static class25 field3516;

	@ObfuscatedName("wa.X")
	public class3 field3541;

	@ObfuscatedName("wa.y")
	public class46 field3517;

	@ObfuscatedName("wa.E")
	public class75 field3523;

	@ObfuscatedName("wa.Y")
	public class88 field3542;

	@ObfuscatedName("wa.L")
	public boolean field3530;

	@ObfuscatedName("wa.P")
	public boolean field3534;

	@ObfuscatedName("wa.V")
	public boolean field3539;

	@ObfuscatedName("wa.a(B)V")
	public static void method1190() {
		if (class34.field723 != null || class158.field3629 != null) {
			return;
		}
		int var0 = class79.field1826;
		if (class26.field476) {
			if (var0 != 1) {
				int var1 = class86.field2001;
				int var2 = class140.field3216;
				if (class36.field863 - 10 > var1 || var1 > class36.field863 + class45.field1071 + 10 || class121.field2864 - 10 > var2 || var2 > class121.field2864 + class110.field2585 + 10) {
					class26.field476 = false;
					class62.method476(class36.field863, class121.field2864, class45.field1071, class110.field2585);
				}
			}
			if (var0 == 1) {
				int var3 = class36.field863;
				int var4 = class121.field2864;
				int var5 = class45.field1071;
				int var6 = class9.field166;
				int var7 = class66.field1589;
				int var8 = -1;
				for (int var9 = 0; var9 < class119.field2849; var9++) {
					int var10 = var4 + (class119.field2849 - var9 - 1) * 15 + 31;
					if (var3 < var6 && var3 + var5 > var6 && var7 > var10 - 13 && var10 + 3 > var7) {
						var8 = var9;
					}
				}
				if (var8 != -1) {
					class14.method79(var8);
				}
				class26.field476 = false;
				class62.method476(class36.field863, class121.field2864, class45.field1071, class110.field2585);
				return;
			}
			return;
		}
		if (var0 == 1 && class119.field2849 > 0) {
			int var11 = class44.field1034[class119.field2849 - 1];
			if (var11 == 38 || var11 == 15 || var11 == 51 || var11 == 18 || var11 == 41 || var11 == 17 || var11 == 30 || var11 == 7 || var11 == 19 || var11 == 35 || var11 == 21 || var11 == 1004) {
				int var12 = class121.field2868[class119.field2849 - 1];
				int var13 = class158.field3620[class119.field2849 - 1];
				class36 var14 = class128.method991(var13);
				if (class14.method78(class147.method1100(var14)) || class56.method436(class147.method1100(var14))) {
					class109.field2569 = 0;
					class72.field1693 = false;
					if (class34.field723 != null) {
						class132.method1008(class34.field723);
					}
					class34.field723 = class128.method991(var13);
					class94.field2160 = class66.field1589;
					class113.field2637 = class9.field166;
					class107.field2542 = var12;
					class132.method1008(class34.field723);
					return;
				}
			}
		}
		if (var0 == 1 && (class125.field2898 == 1 && class119.field2849 > 2 || class32.method237(class119.field2849 - 1))) {
			var0 = 2;
		}
		if (var0 == 1 && class119.field2849 > 0) {
			class14.method79(class119.field2849 - 1);
		}
		if (var0 != 2 || class119.field2849 <= 0) {
			return;
		}
		class135.method1030();
	}

	@ObfuscatedName("wa.a(IIB)V")
	public static void method1192(int arg0, int arg1) {
		if (class28.method192(arg0)) {
			class54.method428(class79.field1825[arg0], arg1);
		}
	}

	@ObfuscatedName("wa.b(II)Z")
	public static boolean method1193(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("wa.a(Lec;BLjd;)I")
	public static int method1194(class32 arg0, class66 arg1) {
		int var2 = arg1.field1568;
		arg1.method545(arg0.field674);
		arg1.field1568 += class91.field2088.method75(0, arg0.field674, arg1.field1568, arg0.field618, arg1.field1586);
		return arg1.field1568 - var2;
	}

	@ObfuscatedName("wa.a(Lea;IIIZI)V")
	public static void method1195(class30 arg0, int arg1, int arg2, int arg3) {
		class126.field2928 = arg3;
		class157.field3606 = arg1;
		class34.field718 = arg0;
		class57.field1321 = arg2;
		class98.field2263 = 1;
		class121.field2870 = false;
		class73.field1724 = 10000;
	}

	public class154(int arg0, int arg1, int arg2) {
		this.field3533 = arg1;
		this.field3549 = arg2;
		this.field3532 = this.field3518 = arg0;
	}
}
