package deob;

@ObfuscatedName("mc")
public final class class134 {

	@ObfuscatedName("mc.b")
	public static final JagString field2493 = JagString.wrap(" )2> <col=ffff00>");

	@ObfuscatedName("mc.j")
	public static final int[] field2501 = new int[1000];

	@ObfuscatedName("mc.a(IIBIII)V")
	public static void method892(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2;
		Statics.method1534(arg0 - arg1, arg4, arg0 + arg1, Statics.field42[arg3]);
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
			Statics.method1534(var23, arg4, var22, Statics.field42[var20]);
			var12 += -var15;
			var15 -= var14;
			Statics.method1534(var23, arg4, var22, Statics.field42[var21]);
		}
	}

}
