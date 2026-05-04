package deob;

@ObfuscatedName("fd")
public final class class60 extends class23 {

	@ObfuscatedName("fd.cb")
	public static final class88 field1133 = class208.method1423(105, "Suche nach Updates )2 ");

	@ObfuscatedName("fd.T")
	public static final class88 field1124 = class208.method1423(105, " loggt sich ein)3");

	@ObfuscatedName("fd.W")
	public static final class82[] field1127 = new class82[4];

	@ObfuscatedName("fd.S")
	public static final class24 field1123 = new class24(500);

	@ObfuscatedName("fd.Y")
	public int field1129 = 32768;

	@ObfuscatedName("fd.a(Li;IBLi;Li;)V")
	public static void method428(class88 arg0, class88 arg1, class88 arg2) {
		class118.method801(arg1, -1, arg0, 9, arg2);
	}

	@ObfuscatedName("fd.a(Lnb;Lnb;Li;ILi;)Lcc;")
	public static class26 method429(class144 arg0, class144 arg1, class88 arg2, class88 arg3) {
		int var4 = arg1.method964(arg3);
		int var5 = arg1.method966(arg2, var4);
		return class106.method735(var5, arg0, var4, arg1);
	}

	@ObfuscatedName("fd.a(BI)Z")
	public static boolean method431(int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@ObfuscatedName("fd.f(I)V")
	public static void method432() {
		class223.field4196 = 0;
		class192.field3702 = 0;
		class2.method9();
		class88.method633();
		class196.method1359();
		for (int var0 = 0; var0 < class223.field4196; var0++) {
			int var1 = class53.field999[var0];
			if (class225.field4223[var1].field4081 != class117.field2113) {
				class225.field4223[var1].field3682 = null;
				class225.field4223[var1] = null;
			}
		}
		if (class228.field4270 != class230.field4312.field831) {
			throw new RuntimeException("gnp1 pos:" + class230.field4312.field831 + " psize:" + class228.field4270);
		}
		for (int var2 = 0; var2 < class55.field1041; var2++) {
			if (class225.field4223[class25.field402[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class55.field1041);
			}
		}
	}

	@ObfuscatedName("fd.a(IZIIILk;)V")
	public static void method433(boolean arg0, int arg1, int arg2, int arg3, class109 arg4) {
		if (class174.field3445 >= 50 || (arg4.field2001 == null || arg4.field2001.length < 1 || arg2 >= arg4.field2001.length || arg4.field2001[arg2] == null)) {
			return;
		}
		int var5 = arg4.field2001[arg2][0];
		int var6 = var5 >> 8;
		int var7 = var5 >> 4 & 0x7;
		int var8 = var5 & 0xF;
		if (arg4.field2001[arg2].length > 1) {
			int var9 = (int) (Math.random() * (double) arg4.field2001[arg2].length);
			if (var9 > 0) {
				var6 = arg4.field2001[arg2][var9];
			}
		}
		if (var8 == 0) {
			if (arg0) {
				class92.method668(var7, 0, var6);
			}
		} else if (class223.field4211 != 0) {
			class25.field397[class174.field3445] = var6;
			class110.field2016[class174.field3445] = var7;
			class8.field116[class174.field3445] = 0;
			int var10 = (arg3 - 64) / 128;
			class237.field4417[class174.field3445] = null;
			int var11 = (arg1 - 64) / 128;
			class145.field2726[class174.field3445] = (var10 << 16) + (var11 << 8) + var8;
			class174.field3445++;
		}
	}

	public class60() {
		super(3, false);
	}

	@ObfuscatedName("fd.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1129 = arg0.method301() << 4;
		} else if (arg1 == 1) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("fd.b(B)V")
	@Override
	public void method123() {
		class108.method740();
	}

	@ObfuscatedName("fd.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 1);
			int[] var4 = this.method120(arg0, 2);
			for (int var5 = 0; var5 < class70.field1276; var5++) {
				int var6 = this.field1129 * var4[var5] >> 12;
				int var7 = var3[var5] >> 4 & 0xFF;
				int var8 = class150.field2920[var7] * var6 >> 12;
				int var9 = class92.field1734[var7] * var6 >> 12;
				int var10 = var5 + (var8 >> 12) & class45.field789;
				int var11 = class220.field4158 & (var9 >> 12) + arg0;
				int[] var12 = this.method120(var11, 0);
				var2[var5] = var12[var10];
			}
		}
		return var2;
	}

	@ObfuscatedName("fd.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = this.method120(arg0, 1);
			int[] var4 = this.method120(arg0, 2);
			int[] var5 = var2[0];
			int[] var6 = var2[1];
			int[] var7 = var2[2];
			for (int var8 = 0; var8 < class70.field1276; var8++) {
				int var9 = var3[var8] * 255 >> 12 & 0xFF;
				int var10 = this.field1129 * var4[var8] >> 12;
				int var11 = var10 * class150.field2920[var9] >> 12;
				int var12 = var10 * class92.field1734[var9] >> 12;
				int var13 = var8 + (var11 >> 12) & class45.field789;
				int var14 = arg0 + (var12 >> 12) & class220.field4158;
				int[][] var15 = this.method121(0, var14);
				var5[var8] = var15[0][var13];
				var6[var8] = var15[1][var13];
				var7[var8] = var15[2][var13];
			}
		}
		return var2;
	}
}
