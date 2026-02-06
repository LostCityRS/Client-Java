package deob;

@ObfuscatedName("ue")
public final class class144 extends class146 {

	@ObfuscatedName("ue.r")
	public int field3280;

	@ObfuscatedName("ue.u")
	public static class32 field3283 = class73.method593("mapdots", true);

	@ObfuscatedName("ue.v")
	public boolean field3284 = false;

	@ObfuscatedName("ue.w")
	public static int[] field3285 = new int[128];

	@ObfuscatedName("ue.y")
	public static int[] field3287 = new int[100];

	@ObfuscatedName("ue.F")
	public static class32 field3293 = class73.method593("und loggen sich dann erneut ein)3", true);

	@ObfuscatedName("ue.D")
	public int field3291;

	@ObfuscatedName("ue.E")
	public static int field3292;

	@ObfuscatedName("ue.a(III[B)I")
	public static int method1080(int arg0, int arg1, byte[] arg2) {
		int var3 = -1;
		for (int var4 = arg1; var4 < arg0; var4++) {
			var3 = var3 >>> 8 ^ class31.field611[(var3 ^ arg2[var4]) & 0xFF];
		}
		return ~var3;
	}

	@ObfuscatedName("ue.a(IIIIIIIIII)V")
	public static void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class23 var9 = null;
		for (class23 var10 = (class23) class45.field1076.method1211(); var10 != null; var10 = (class23) class45.field1076.method1209()) {
			if (var10.field401 == arg5 && arg2 == var10.field405 && arg0 == var10.field420 && var10.field398 == arg3) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new class23();
			var9.field420 = arg0;
			var9.field398 = arg3;
			var9.field401 = arg5;
			var9.field405 = arg2;
			class5.method20(var9);
			class45.field1076.method1214(var9);
		}
		var9.field413 = arg4;
		var9.field414 = arg8;
		var9.field411 = arg6;
		var9.field412 = arg1;
		var9.field404 = arg7;
	}

	@ObfuscatedName("ue.a(BLqd;)V")
	public static void method1082(class115 arg0) {
		arg0.field2735 = false;
		if (arg0.field2708 != -1) {
			class149 var1 = class97.method760(arg0.field2708);
			if (var1 == null || var1.field3393 == null) {
				arg0.field2708 = -1;
			} else {
				arg0.field2757++;
				if (var1.field3393.length > arg0.field2728 && arg0.field2757 > var1.field3376[arg0.field2728]) {
					arg0.field2728++;
					arg0.field2757 = 1;
					class71.method585(arg0.field2698, arg0.field2747, arg0.field2728, var1);
				}
				if (var1.field3393.length <= arg0.field2728) {
					arg0.field2757 = 0;
					arg0.field2728 = 0;
					class71.method585(arg0.field2698, arg0.field2747, arg0.field2728, var1);
				}
			}
		}
		if (arg0.field2731 != -1 && class140.field3217 >= arg0.field2704) {
			if (arg0.field2754 < 0) {
				arg0.field2754 = 0;
			}
			int var2 = class38.method316(arg0.field2731).field3096;
			if (var2 == -1) {
				arg0.field2731 = -1;
			} else {
				class149 var3 = class97.method760(var2);
				if (var3 == null || var3.field3393 == null) {
					arg0.field2731 = -1;
				} else {
					arg0.field2701++;
					if (var3.field3393.length > arg0.field2754 && arg0.field2701 > var3.field3376[arg0.field2754]) {
						arg0.field2754++;
						arg0.field2701 = 1;
						class71.method585(arg0.field2698, arg0.field2747, arg0.field2754, var3);
					}
					if (arg0.field2754 >= var3.field3393.length && (arg0.field2754 < 0 || var3.field3393.length <= arg0.field2754)) {
						arg0.field2731 = -1;
					}
				}
			}
		}
		if (arg0.field2712 != -1 && arg0.field2715 <= 1) {
			class149 var4 = class97.method760(arg0.field2712);
			if (var4.field3382 == 1 && arg0.field2748 > 0 && class140.field3217 >= arg0.field2730 && class140.field3217 > arg0.field2724) {
				arg0.field2715 = 1;
				return;
			}
		}
		if (arg0.field2712 != -1 && arg0.field2715 == 0) {
			class149 var5 = class97.method760(arg0.field2712);
			if (var5 == null || var5.field3393 == null) {
				arg0.field2712 = -1;
			} else {
				arg0.field2737++;
				if (var5.field3393.length > arg0.field2725 && var5.field3376[arg0.field2725] < arg0.field2737) {
					arg0.field2725++;
					arg0.field2737 = 1;
					class71.method585(arg0.field2698, arg0.field2747, arg0.field2725, var5);
				}
				if (arg0.field2725 >= var5.field3393.length) {
					arg0.field2714++;
					arg0.field2725 -= var5.field3386;
					if (var5.field3389 <= arg0.field2714) {
						arg0.field2712 = -1;
					} else if (arg0.field2725 >= 0 && var5.field3393.length > arg0.field2725) {
						class71.method585(arg0.field2698, arg0.field2747, arg0.field2725, var5);
					} else {
						arg0.field2712 = -1;
					}
				}
				arg0.field2735 = var5.field3371;
			}
		}
		if (arg0.field2715 > 0) {
			arg0.field2715--;
		}
	}

	@ObfuscatedName("ue.d(I)V")
	public static void method1083() {
		class150.field3427 = true;
		class154.field3529 = true;
	}

	@ObfuscatedName("ue.e(I)[Lhb;")
	public static class51[] method1084() {
		class51[] var0 = new class51[class92.field2110];
		for (int var1 = 0; var1 < class92.field2110; var1++) {
			class51 var2 = var0[var1] = new class51();
			var2.field1169 = class152.field3506;
			var2.field1168 = class128.field2965;
			var2.field1170 = class70.field1638[var1];
			var2.field1165 = class74.field1746[var1];
			var2.field1167 = class126.field2925[var1];
			var2.field1171 = class34.field719[var1];
			var2.field1166 = class31.field616;
			var2.field1164 = class147.field3344[var1];
		}
		class70.method579();
		return var0;
	}
}
