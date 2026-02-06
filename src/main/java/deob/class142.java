package deob;

@ObfuscatedName("uc")
public final class class142 extends class146 {

	@ObfuscatedName("uc.s")
	public int field3243;

	@ObfuscatedName("uc.t")
	public static class32 field3244 = class73.method593("auf der Hautpseite)3", true);

	@ObfuscatedName("uc.u")
	public class134 field3245;

	@ObfuscatedName("uc.w")
	public static class32 field3247 = class73.method593("Bitte versuchen Sie es erneut)3", true);

	@ObfuscatedName("uc.x")
	public static class32 field3248 = class73.method593(")4slr)3ws?order=LPWM", true);

	@ObfuscatedName("uc.A")
	public static int field3251;

	@ObfuscatedName("uc.D")
	public static int field3253;

	@ObfuscatedName("uc.E")
	public class44 field3254;

	@ObfuscatedName("uc.B")
	public static class49 field3252;

	@ObfuscatedName("uc.y")
	public byte[] field3249;

	@ObfuscatedName("uc.G")
	public static byte[][] field3256;

	@ObfuscatedName("uc.a(IZI)V")
	public static void method1071(int arg0, int arg1) {
		class44.field1026.method356(172);
		class44.field1026.method526(arg1);
		class44.field1026.method548(arg0);
	}

	@ObfuscatedName("uc.d(I)V")
	public static void method1072() {
		int var0 = class121.field2864;
		int var1 = class45.field1071;
		int var2 = class110.field2585;
		int var3 = class36.field863;
		class141.method1053(var3, var0, var1, var2, 6116423);
		class141.method1053(var3 + 1, var0 + 1, var1 - 2, 16, 0);
		class141.method1058(var3 + 1, var0 - -18, var1 - 2, var2 - 19, 0);
		class38.field913.method791(class5.field94, var3 + 3, var0 + 14, 6116423, -1);
		int var4 = class140.field3216;
		int var5 = class86.field2001;
		for (int var6 = 0; var6 < class119.field2849; var6++) {
			int var7 = 16777215;
			int var8 = (class119.field2849 - var6 - 1) * 15 + var0 + 31;
			if (var3 < var5 && var3 + var1 > var5 && var4 > var8 - 13 && var4 < var8 + 3) {
				var7 = 16776960;
			}
			class38.field913.method791(class111.method878(var6), var3 + 3, var8, var7, 0);
		}
		class32.method265(class45.field1071, class121.field2864, class36.field863, class110.field2585);
	}

	@ObfuscatedName("uc.a(ILea;Lea;)I")
	public static int method1074(class30 arg0, class30 arg1) {
		int var2 = 0;
		if (arg1.method210(class82.field1906, class74.field1748)) {
			var2++;
		}
		if (arg0.method210(class32.field632, class74.field1748)) {
			var2++;
		}
		if (arg0.method210(class68.field1594, class74.field1748)) {
			var2++;
		}
		if (arg0.method210(class115.field2760, class74.field1748)) {
			var2++;
		}
		if (arg0.method210(class71.field1673, class74.field1748)) {
			var2++;
		}
		if (arg0.method210(class105.field2500, class74.field1748)) {
			var2++;
		}
		arg0.method210(class71.field1688, class74.field1748);
		arg0.method210(class65.field1505, class74.field1748);
		arg0.method210(class63.field1455, class74.field1748);
		arg0.method210(class111.field2607, class74.field1748);
		arg0.method210(class117.field2815, class74.field1748);
		return var2;
	}

	@ObfuscatedName("uc.b(Z)V")
	public static void method1075() {
		while (true) {
			if (class158.field3612.method354(class115.field2700) >= 27) {
				int var0 = class158.field3612.method352(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (class14.field230[var0] == null) {
						var1 = true;
						class14.field230[var0] = new class111();
					}
					class111 var2 = class14.field230[var0];
					class15.field313[class102.field2397++] = var0;
					var2.field2713 = class140.field3217;
					int var3 = class31.field614[class158.field3612.method352(3)];
					if (var1) {
						var2.field2742 = var2.field2745 = var3;
					}
					int var4 = class158.field3612.method352(5);
					int var5 = class158.field3612.method352(1);
					if (var4 > 15) {
						var4 -= 32;
					}
					if (var5 == 1) {
						class62.field1418[class61.field1352++] = var0;
					}
					var2.field2595 = class17.method130(class158.field3612.method352(14));
					int var6 = class158.field3612.method352(1);
					int var7 = class158.field3612.method352(5);
					var2.field2693 = var2.field2595.field2218;
					var2.field2723 = var2.field2595.field2219;
					var2.field2711 = var2.field2595.field2196;
					var2.field2729 = var2.field2595.field2211;
					var2.field2716 = var2.field2595.field2185;
					if (var2.field2693 == 0) {
						var2.field2745 = 0;
					}
					var2.field2744 = var2.field2595.field2209;
					var2.field2734 = var2.field2595.field2201;
					var2.field2709 = var2.field2595.field2202;
					var2.field2687 = var2.field2595.field2195;
					if (var7 > 15) {
						var7 -= 32;
					}
					var2.method902(var7 + class20.field373.field2736[0], var6 == 1, var4 + class20.field373.field2759[0]);
					continue;
				}
			}
			class158.field3612.method355();
			return;
		}
	}

	@ObfuscatedName("uc.a(B)V")
	public static void method1076() {
		for (class128 var0 = (class128) class88.field2038.method1211(); var0 != null; var0 = (class128) class88.field2038.method1209()) {
			if (var0.field2935 != class43.field989 || var0.field2948 < class140.field3217) {
				var0.method1091();
			} else if (class140.field3217 >= var0.field2963) {
				if (var0.field2960 > 0) {
					class111 var1 = class14.field230[var0.field2960 - 1];
					if (var1 != null && var1.field2747 >= 0 && var1.field2747 < 13312 && var1.field2698 >= 0 && var1.field2698 < 13312) {
						var0.method994(var1.field2698, var1.field2747, class140.field3217, class83.method653(var0.field2935, var1.field2747, var1.field2698) - var0.field2932);
					}
				}
				if (var0.field2960 < 0) {
					int var2 = -var0.field2960 - 1;
					class70 var3;
					if (class37.field891 == var2) {
						var3 = class20.field373;
					} else {
						var3 = class52.field1175[var2];
					}
					if (var3 != null && var3.field2747 >= 0 && var3.field2747 < 13312 && var3.field2698 >= 0 && var3.field2698 < 13312) {
						var0.method994(var3.field2698, var3.field2747, class140.field3217, class83.method653(var0.field2935, var3.field2747, var3.field2698) - var0.field2932);
					}
				}
				var0.method988(class54.field1282);
				class159.field3657.method1146(class43.field989, (int) var0.field2949, (int) var0.field2951, (int) var0.field2952, 60, var0, var0.field2968, -1, false);
			}
		}
	}
}
