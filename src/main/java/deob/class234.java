package deob;

@ObfuscatedName("ve")
public final class class234 extends class23 {

	@ObfuscatedName("ve.Z")
	public static int field4383;

	@ObfuscatedName("ve.T")
	public static byte[][][] field4377;

	@ObfuscatedName("ve.b(II)Z")
	public static boolean method1554(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = class53.field994[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 1003;
	}

	@ObfuscatedName("ve.a(IIII)I")
	public static int method1555(int arg0, int arg1, int arg2) {
		if ((class116.field2098[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (class116.field2098[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ve.a(IJ)Li;")
	public static class88 method1556(long arg0) {
		return class240.method1586(arg0);
	}

	@ObfuscatedName("ve.a(Lnb;ZII)Lrc;")
	public static class188 method1558(class144 arg0, int arg1, int arg2) {
		return class47.method358(arg0, arg1, arg2) ? class203.method1393() : null;
	}

	@ObfuscatedName("ve.a(IZ)I")
	public static int method1559(int arg0) {
		double var1 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 & 0xFF) / 256.0D;
		double var7 = var3;
		if (var3 < var1) {
			var7 = var1;
		}
		double var9 = 0.0D;
		double var11 = var3;
		if (var1 < var3) {
			var11 = var1;
		}
		if (var7 < var5) {
			var7 = var5;
		}
		if (var11 > var5) {
			var11 = var5;
		}
		double var13 = 0.0D;
		double var15 = (var11 + var7) / 2.0D;
		if (var11 != var7) {
			if (var15 < 0.5D) {
				var9 = (var7 - var11) / (var7 + var11);
			}
			if (var3 == var7) {
				var13 = (var1 - var5) / (var7 - var11);
			} else if (var7 == var1) {
				var13 = (var5 - var3) / (var7 - var11) + 2.0D;
			} else if (var5 == var7) {
				var13 = (var3 - var1) / (-var11 + var7) + 4.0D;
			}
			if (var15 >= 0.5D) {
				var9 = (var7 - var11) / (2.0D - var11 - var7);
			}
		}
		double var17 = var13 / 6.0D;
		int var19 = (int) (var9 * 256.0D);
		int var20 = (int) (var17 * 256.0D);
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}
		int var21 = (int) (var15 * 256.0D);
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		if (var21 > 243) {
			var19 >>= 0x4;
		} else if (var21 > 217) {
			var19 >>= 0x3;
		} else if (var21 > 192) {
			var19 >>= 0x2;
		} else if (var21 > 179) {
			var19 >>= 0x1;
		}
		return (var19 >> 5 << 7) + (var20 >> 2 << 10) + (var21 >> 1);
	}

	public class234() {
		super(1, false);
	}

	@ObfuscatedName("ve.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				var2[var4] = 4096 - var3[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("ve.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[1];
			int[] var6 = var3[2];
			int[] var7 = var2[1];
			int[] var8 = var2[2];
			int[] var9 = var2[0];
			for (int var10 = 0; var10 < class70.field1276; var10++) {
				var9[var10] = 4096 - var4[var10];
				var7[var10] = 4096 - var5[var10];
				var8[var10] = 4096 - var6[var10];
			}
		}
		return var2;
	}

	@ObfuscatedName("ve.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			super.field369 = arg0.method347() == 1;
		}
	}
}
