package deob;

import java.io.IOException;

@ObfuscatedName("mc")
public final class class134 {

	@ObfuscatedName("mc.b")
	public static final class88 field2493 = class208.method1423(105, " )2> <col=ffff00>");

	@ObfuscatedName("mc.e")
	public static final class88 field2496 = class208.method1423(105, "(U0a )2 non)2existant gosub script)2num: ");

	@ObfuscatedName("mc.f")
	public static final class248[][][] field2497 = new class248[4][104][104];

	@ObfuscatedName("mc.g")
	public static final class88 field2498 = class208.method1423(105, "Abbrechen");

	@ObfuscatedName("mc.h")
	public static final class88 field2499 = class208.method1423(105, "(U5");

	@ObfuscatedName("mc.j")
	public static final int[] field2501 = new int[1000];

	@ObfuscatedName("mc.l")
	public static int field2503 = 0;

	@ObfuscatedName("mc.a(IIBIII)V")
	public static void method892(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2;
		class230.method1534(arg0 - arg1, arg4, arg0 + arg1, class3.field42[arg3]);
		int var6 = arg1 * arg1;
		int var7 = 0;
		int var8 = arg2 * arg2;
		int var9 = var8 << 1;
		int var10 = var6 << 1;
		int var11 = arg2 << 1;
		int var12 = var8 - var10 * (var11 - 1);
		int var13 = var9 + var6 * (1 - var11);
		int var14 = var6 << 2;
		int var15 = var10 * ((arg2 << 1) - 3);
		int var16 = var8 << 2;
		int var17 = var16;
		int var18 = var9 * 3;
		int var19 = (arg2 - 1) * var14;
		while (var5 > 0) {
			if (var13 < 0) {
				while (var13 < 0) {
					var7++;
					var13 += var18;
					var12 += var17;
					var18 += var16;
					var17 += var16;
				}
			}
			var5--;
			int var20 = arg3 - var5;
			if (var12 < 0) {
				var13 += var18;
				var7++;
				var18 += var16;
				var12 += var17;
				var17 += var16;
			}
			int var21 = var5 + arg3;
			var13 += -var19;
			var19 -= var14;
			int var22 = arg0 + var7;
			int var23 = arg0 - var7;
			class230.method1534(var23, arg4, var22, class3.field42[var20]);
			var12 += -var15;
			var15 -= var14;
			class230.method1534(var23, arg4, var22, class3.field42[var21]);
		}
	}

	@ObfuscatedName("mc.a(ZB)V")
	public static void method893(boolean arg0) {
		class219.method1479();
		class144.field2707++;
		if (class144.field2707 < 50 && !arg0) {
			return;
		}
		class144.field2707 = 0;
		if (class58.field1097 || class33.field556 == null) {
			return;
		}
		class146.field2747.method30(19);
		try {
			class33.field556.method911(class146.field2747.field831, class146.field2747.field842);
			class146.field2747.field831 = 0;
		} catch (IOException var1) {
			class58.field1097 = true;
		}
	}

	@ObfuscatedName("mc.a(I)V")
	public static void method894() {
		class15.field228 = null;
		class201.field3840 = null;
		class143.field2643 = null;
	}
}
