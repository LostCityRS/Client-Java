package deob;

@ObfuscatedName("tc")
public final class class210 extends class136 {

	@ObfuscatedName("tc.K")
	public static int field3990 = 0;

	@ObfuscatedName("tc.D")
	public static final class88 field3983 = class208.method1423(105, "http:)4)4www)3runescape)3com)4l=");

	@ObfuscatedName("tc.J")
	public static final class92 field3989 = new class92(100);

	@ObfuscatedName("tc.M")
	public static final class88 field3992 = class208.method1423(105, "Please subscribe)1 or use a different world)3");

	@ObfuscatedName("tc.L")
	public static class88 field3991 = field3992;

	@ObfuscatedName("tc.E")
	public class145 field3984;

	@ObfuscatedName("tc.e(I)V")
	public static void method1437() {
		for (class159 var0 = (class159) class62.field1140.method1610(); var0 != null; var0 = (class159) class62.field1140.method1619()) {
			if (var0.field3061 == -1) {
				var0.field3054 = 0;
				class172.method1219(var0);
			} else {
				var0.method460();
			}
		}
	}

	@ObfuscatedName("tc.a(IIIIII)V")
	public static void method1438(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = 0;
		int var6 = arg1;
		int var7 = arg4 * arg4;
		int var8 = arg1 * arg1;
		int var9 = var8 << 1;
		int var10 = var7 << 1;
		int var11 = arg1 << 1;
		int var12 = var9 + var7 * (1 - var11);
		int var13 = var8 - var10 * (var11 - 1);
		int var14 = var7 << 2;
		int var15 = var8 << 2;
		int var16 = var9 * 3;
		int var17 = var10 * ((arg1 << 1) - 3);
		int var18 = var15;
		int var19 = (arg1 - 1) * var14;
		if (class49.field919 <= arg2 && arg2 <= class18.field279) {
			int var20 = class156.method1058(class67.field1207, class12.field183, arg4 + arg0);
			int var21 = class156.method1058(class67.field1207, class12.field183, arg0 - arg4);
			class230.method1534(var21, arg3, var20, class3.field42[arg2]);
		}
		while (var6 > 0) {
			var6--;
			int var22 = arg2 - var6;
			int var23 = var6 + arg2;
			if (var12 < 0) {
				while (var12 < 0) {
					var13 += var18;
					var5++;
					var18 += var15;
					var12 += var16;
					var16 += var15;
				}
			}
			if (var13 < 0) {
				var5++;
				var13 += var18;
				var12 += var16;
				var16 += var15;
				var18 += var15;
			}
			var13 += -var17;
			if (var23 >= class49.field919 && class18.field279 >= var22) {
				int var24 = class156.method1058(class67.field1207, class12.field183, arg0 + var5);
				int var25 = class156.method1058(class67.field1207, class12.field183, arg0 - var5);
				if (var22 >= class49.field919) {
					class230.method1534(var25, arg3, var24, class3.field42[var22]);
				}
				if (class18.field279 >= var23) {
					class230.method1534(var25, arg3, var24, class3.field42[var23]);
				}
			}
			var17 -= var14;
			var12 += -var19;
			var19 -= var14;
		}
	}
}
