package deob;

@ObfuscatedName("mb")
public final class class133 extends class23 {

	@ObfuscatedName("mb.ab")
	public class50[] field2490;

	@ObfuscatedName("mb.T")
	public static final int[] field2483 = new int[100];

	@ObfuscatedName("mb.X")
	public static int field2487 = -1;

	@ObfuscatedName("mb.U")
	public static int field2484 = 0;

	@ObfuscatedName("mb.V")
	public static final int[] field2485 = new int[100];

	@ObfuscatedName("mb.Z")
	public static int field2489 = 0;

	@ObfuscatedName("mb.W")
	public static class22 field2486;

	@ObfuscatedName("mb.b(II)Li;")
	public static class88 method889(int arg0) {
		if (arg0 < 100000) {
			return class166.method1140(new class88[] { class25.field399, class170.method1212(arg0), class67.field1214 });
		} else if (arg0 < 10000000) {
			return class166.method1140(new class88[] { class16.field241, class170.method1212(arg0 / 1000), class159.field3069, class67.field1214 });
		} else {
			return class166.method1140(new class88[] { class132.field2462, class170.method1212(arg0 / 1000000), class132.field2464, class67.field1214 });
		}
	}

	public class133() {
		super(0, true);
	}

	@ObfuscatedName("mb.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2490 = new class50[arg0.method347()];
			for (int var3 = 0; var3 < this.field2490.length; var3++) {
				int var4 = arg0.method347();
				if (var4 == 0) {
					this.field2490[var3] = class81.method538(arg0);
				} else if (var4 == 1) {
					this.field2490[var3] = class143.method936(arg0);
				} else if (var4 == 2) {
					this.field2490[var3] = class12.method62(arg0);
				} else if (var4 == 3) {
					this.field2490[var3] = class85.method577(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("mb.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			this.method890(super.field379.method1075());
		}
		return var2;
	}

	@ObfuscatedName("mb.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int var3 = class70.field1276;
			int var4 = class27.field460;
			int[][][] var5 = super.field364.method1537();
			int[][] var6 = new int[var4][var3];
			this.method890(var6);
			for (int var7 = 0; var7 < class27.field460; var7++) {
				int[] var8 = var6[var7];
				int[][] var9 = var5[var7];
				int[] var10 = var9[1];
				int[] var11 = var9[2];
				int[] var12 = var9[0];
				for (int var13 = 0; var13 < class70.field1276; var13++) {
					int var14 = var8[var13];
					var11[var13] = (var14 & 0xFF) << 4;
					var10[var13] = var14 >> 4 & 0xFF0;
					var12[var13] = var14 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mb.a([[IB)V")
	public void method890(int[][] arg0) {
		int var2 = class70.field1276;
		int var3 = class27.field460;
		class22.method114(arg0);
		class238.method1575(class220.field4158, class45.field789);
		if (this.field2490 == null) {
			return;
		}
		for (int var4 = 0; var4 < this.field2490.length; var4++) {
			class50 var5 = this.field2490[var4];
			int var6 = var5.field925;
			int var7 = var5.field927;
			if (var6 < 0) {
				if (var7 >= 0) {
					var5.method377(var2, var3);
				}
			} else if (var7 < 0) {
				var5.method373(var3, var2);
			} else {
				var5.method371(var2, var3);
			}
		}
	}
}
