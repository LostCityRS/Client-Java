package deob;

@ObfuscatedName("d")
public final class class34 extends class23 {

	@ObfuscatedName("d.ab")
	public static class130[] field587;

	@ObfuscatedName("d.cb")
	public static class169 field589;

	@ObfuscatedName("d.eb")
	public static final class88 field591 = class208.method1423(105, "(R");

	@ObfuscatedName("d.gb")
	public static final class88 field593 = class208.method1423(105, "Discard");

	@ObfuscatedName("d.fb")
	public static class88 field592 = field593;

	@ObfuscatedName("d.hb")
	public static int field594 = -1;

	@ObfuscatedName("d.T")
	public static short field580 = 256;

	@ObfuscatedName("d.U")
	public static final class88 field581 = class208.method1423(105, " )2> <col=ff9040>");

	@ObfuscatedName("d.W")
	public static final class88 field583 = class208.method1423(105, "::fpsoff");

	@ObfuscatedName("d.V")
	public static int field582 = 0;

	@ObfuscatedName("d.X")
	public static class144 field584;

	@ObfuscatedName("d.a(BLi;Li;Li;)V")
	public static void method227(class88 arg0, class88 arg1, class88 arg2) {
		class209.field3981 = arg1;
		class209.field3980 = arg0;
		class209.field3979 = arg2;
	}

	@ObfuscatedName("d.d(B)[Lpf;")
	public static class169[] method229() {
		class169[] var0 = new class169[class172.field3345];
		for (int var1 = 0; var1 < class172.field3345; var1++) {
			int var2 = class102.field1851[var1] * class67.field1218[var1];
			byte[] var3 = class116.field2104[var1];
			int[] var4 = new int[var2];
			for (int var5 = 0; var5 < var2; var5++) {
				var4[var5] = class27.field456[var3[var5] & 0xFF];
			}
			var0[var1] = new class169(class15.field229, class129.field2424, class247.field4528[var1], class135.field2510[var1], class102.field1851[var1], class67.field1218[var1], var4);
		}
		class239.method1578();
		return var0;
	}

	@ObfuscatedName("d.a(ILnb;II)[Lrc;")
	public static class188[] method230(int arg0, class144 arg1, int arg2) {
		return class47.method358(arg1, arg2, arg0) ? class21.method100() : null;
	}

	public class34() {
		super(3, false);
	}

	@ObfuscatedName("d.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			int[] var4 = this.method120(arg0, 1);
			int[] var5 = this.method120(arg0, 2);
			for (int var6 = 0; var6 < class70.field1276; var6++) {
				int var7 = var5[var6];
				if (var7 == 4096) {
					var2[var6] = var3[var6];
				} else if (var7 == 0) {
					var2[var6] = var4[var6];
				} else {
					var2[var6] = var3[var6] * var7 + (4096 - var7) * var4[var6] >> 12;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("d.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("d.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = this.method120(arg0, 2);
			int[][] var4 = this.method121(0, arg0);
			int[][] var5 = this.method121(1, arg0);
			int[] var6 = var4[2];
			int[] var7 = var5[0];
			int[] var8 = var2[0];
			int[] var9 = var2[2];
			int[] var10 = var4[1];
			int[] var11 = var5[1];
			int[] var12 = var4[0];
			int[] var13 = var2[1];
			int[] var14 = var5[2];
			for (int var15 = 0; var15 < class70.field1276; var15++) {
				int var16 = var3[var15];
				if (var16 == 4096) {
					var8[var15] = var12[var15];
					var13[var15] = var10[var15];
					var9[var15] = var6[var15];
				} else if (var16 == 0) {
					var8[var15] = var7[var15];
					var13[var15] = var11[var15];
					var9[var15] = var14[var15];
				} else {
					int var17 = 4096 - var16;
					var8[var15] = var16 * var12[var15] + var17 * var7[var15] >> 12;
					var13[var15] = var16 * var10[var15] + var11[var15] * var17 >> 12;
					var9[var15] = var6[var15] * var16 + var14[var15] * var17 >> 12;
				}
			}
		}
		return var2;
	}
}
