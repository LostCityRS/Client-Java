package deob;

@ObfuscatedName("aj")
public final class class11 extends class23 {

	@ObfuscatedName("aj.ab")
	public static int field161;

	@ObfuscatedName("aj.cb")
	public int field163 = 4;

	@ObfuscatedName("aj.fb")
	public static boolean field166 = false;

	@ObfuscatedName("aj.gb")
	public int field167 = 4;

	@ObfuscatedName("aj.S")
	public static final class88 field153 = class208.method1423(105, "You can(Wt add yourself to your own ignore list)3");

	@ObfuscatedName("aj.U")
	public static final class88 field155 = class208.method1423(105, "lila:");

	@ObfuscatedName("aj.Q")
	public static class88 field151 = field153;

	@ObfuscatedName("aj.Z")
	public static final class88 field160 = class208.method1423(105, "Connection timed out)3");

	@ObfuscatedName("aj.bb")
	public static class88 field162 = field160;

	@ObfuscatedName("aj.V")
	public static final class88 field156 = class208.method1423(105, "::clientdrop");

	@ObfuscatedName("aj.R")
	public static int field152;

	@ObfuscatedName("aj.Y")
	public static int field159;

	@ObfuscatedName("aj.a(IIIIB)V")
	public static void method53(int arg0, int arg1, int arg2, int arg3) {
		if (class157.field3017 == 1) {
			class154.field2982[class45.field796 / 100].method1155(class147.field2757 - 8, class155.field2997 + -8);
		}
		if (class157.field3017 == 2) {
			class154.field2982[class45.field796 / 100 + 4].method1155(class147.field2757 - 8, class155.field2997 + -8);
		}
		class202.method1385();
		if (!class148.field2768) {
			return;
		}
		int var4 = arg0 + 512 - 5;
		int var5 = arg2 + 20;
		class3.field30.method150(class166.method1140(new class88[] { class180.field3569, class170.method1212(class13.field192) }), var4, var5, 16776960, -1);
		int var9 = var5 + 15;
		int var6 = 16776960;
		Runtime var7 = Runtime.getRuntime();
		int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
		if (var8 > 32768 && class245.field4497) {
			var6 = 16711680;
		}
		if (var8 > 65536 && !class245.field4497) {
			var6 = 16711680;
		}
		class3.field30.method150(class166.method1140(new class88[] { class206.field3921, class170.method1212(var8), class110.field2007 }), var4, var9, var6, -1);
		var5 = var9 + 15;
	}

	@ObfuscatedName("aj.a(IJ)V")
	public static void method55(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (class67.field1221 >= 100) {
			class223.method1499(class118.field2142, 0, class174.field3453);
			return;
		}
		class88 var2 = class200.method1375(arg0).method614();
		for (int var3 = 0; var3 < class67.field1221; var3++) {
			if (class95.field1764[var3] == arg0) {
				class223.method1499(class166.method1140(new class88[] { var2, class155.field2999 }), 0, class174.field3453);
				return;
			}
		}
		for (int var4 = 0; var4 < class146.field2729; var4++) {
			if (arg0 == class115.field2086[var4]) {
				class223.method1499(class166.method1140(new class88[] { class109.field1971, var2, class115.field2085 }), 0, class174.field3453);
				return;
			}
		}
		if (var2.method597(-125, class240.field4456.field766)) {
			class223.method1499(field151, 0, class174.field3453);
			return;
		}
		class95.field1764[class67.field1221] = arg0;
		class146.field2741[class67.field1221++] = class200.method1375(arg0);
		class20.field313 = class67.field1211;
		class146.field2747.method30(28);
		class146.field2747.method328(arg0);
	}

	@ObfuscatedName("aj.a(III)V")
	public static void method56(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field959 = null;
		}
	}

	public class11() {
		super(1, false);
	}

	@ObfuscatedName("aj.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field163 = arg0.method347();
		} else if (arg1 == 1) {
			this.field167 = arg0.method347();
		}
	}

	@ObfuscatedName("aj.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class70.field1276 / this.field163;
			int var4 = class27.field460 / this.field167;
			int[] var6;
			if (var4 > 0) {
				int var5 = arg0 % var4;
				var6 = this.method120(var5 * class27.field460 / var4, 0);
			} else {
				var6 = this.method120(0, 0);
			}
			for (int var7 = 0; var7 < class70.field1276; var7++) {
				if (var3 <= 0) {
					var2[var7] = var6[0];
				} else {
					int var8 = var7 % var3;
					var2[var7] = var6[var8 * class70.field1276 / var3];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("aj.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int var3 = class27.field460 / this.field167;
			int var4 = class70.field1276 / this.field163;
			int[][] var6;
			if (var3 > 0) {
				int var5 = arg0 % var3;
				var6 = this.method121(0, class27.field460 * var5 / var3);
			} else {
				var6 = this.method121(0, 0);
			}
			int[] var7 = var6[0];
			int[] var8 = var6[1];
			int[] var9 = var6[2];
			int[] var10 = var2[0];
			int[] var11 = var2[2];
			int[] var12 = var2[1];
			for (int var13 = 0; var13 < class70.field1276; var13++) {
				int var15;
				if (var4 > 0) {
					int var14 = var13 % var4;
					var15 = class70.field1276 * var14 / var4;
				} else {
					var15 = 0;
				}
				var10[var13] = var7[var15];
				var12[var13] = var8[var15];
				var11[var13] = var9[var15];
			}
		}
		return var2;
	}
}
