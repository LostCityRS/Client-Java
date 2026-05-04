package deob;

@ObfuscatedName("rd")
public final class class189 extends class136 {

	@ObfuscatedName("rd.G")
	public static final class88 field3661 = class208.method1423(105, "leuchten3:");

	@ObfuscatedName("rd.E")
	public static int field3659 = -1;

	@ObfuscatedName("rd.I")
	public static final class88 field3663 = class208.method1423(105, "Continue");

	@ObfuscatedName("rd.K")
	public static class88 field3665 = field3663;

	@ObfuscatedName("rd.D")
	public final byte[] field3658;

	@ObfuscatedName("rd.d(B)V")
	public static void method1315() {
		if (class150.field2915 > class59.field1110) {
			class59.field1110 += class59.field1110 / 30.0D;
			if (class59.field1110 > class150.field2915) {
				class59.field1110 = class150.field2915;
			}
			class245.method1604();
		} else if (class150.field2915 < class59.field1110) {
			class59.field1110 -= class59.field1110 / 30.0D;
			if (class150.field2915 > class59.field1110) {
				class59.field1110 = class150.field2915;
			}
			class245.method1604();
		}
		if (field3659 == -1 || class34.field594 == -1) {
			return;
		}
		int var0 = field3659 - class126.field2330;
		if (var0 < 2 || var0 > 2) {
			var0 >>= 0x4;
		}
		int var1 = class34.field594 - class157.field3033;
		if (var1 < 2 || var1 > 2) {
			var1 >>= 0x4;
		}
		class157.field3033 += var1;
		class126.field2330 += var0;
		if (var0 == 0 && var1 == 0) {
			field3659 = -1;
			class34.field594 = -1;
		}
		class245.method1604();
	}

	@ObfuscatedName("rd.a(BLnb;Lnb;)V")
	public static void method1316(class144 arg0, class144 arg1) {
		class62.field1146 = arg0;
		class66.field1199 = arg1;
	}

	@ObfuscatedName("rd.a(ZLnb;Ldg;Lnb;B)V")
	public static void method1318(boolean arg0, class144 arg1, class41 arg2, class144 arg3) {
		class156.field3008 = arg3;
		class142.field2623 = arg0;
		class236.field4400 = arg1;
		int var4 = class236.field4400.method940() - 1;
		class202.field3855 = var4 * 256 + class236.field4400.method942(var4);
		class180.field3571 = arg2;
	}

	@ObfuscatedName("rd.e(B)V")
	public static void method1319() {
		if (class20.field319 == null) {
			return;
		}
		if (class228.field4276 < 10) {
			if (!class130.field2440.method954(class20.field319)) {
				class228.field4276 = class130.field2440.method957(class20.field319) / 10;
				return;
			}
			class228.field4276 = 10;
		}
		if (class228.field4276 == 10) {
			class46 var0 = new class46(class130.field2440.method960(class20.field319, class80.field1444));
			int var1 = var0.method301();
			int var2 = var0.method301();
			int var3 = var0.method301();
			int var4 = var0.method301();
			int var5 = var0.method301();
			int var6 = var0.method301();
			class119.field2181 = var2 * 64;
			class16.field239 = var1 * 64;
			class59.field1110 = 8.0D;
			class150.field2915 = 8.0D;
			class54.field1009 = new int[class151.field2923 + 1];
			class44.field760 = (var4 - var2) * 64 + 64;
			class109.field1988 = (var3 + 1 - var1) * 64;
			int var7 = class190.field3679 + (class240.field4456.field4121 >> 7) - class119.field2181;
			int var8 = class223.field4212 + (class240.field4456.field4136 >> 7) - class16.field239;
			int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
			int var10 = var7 + (int) (Math.random() * 10.0D) - 5;
			int var11 = class44.field760 >> 6;
			int var12 = class109.field1988 >> 6;
			class216.field4052 = new byte[var12][var11][];
			class7.field105 = new byte[var12][var11][];
			class105.field1912 = new int[var12][var11][];
			class97.field1786 = new byte[var12][var11][];
			class220.field4166 = new byte[var12][var11][];
			int var13 = class70.field1270 >> 1;
			class117.field2126 = new byte[var12][var11][];
			if (var9 >= 0 && var9 < class109.field1988 && var10 >= 0 && class44.field760 > var10) {
				class157.field3033 = class44.field760 - var10;
				class126.field2330 = var9;
			} else {
				class157.field3033 = class119.field2181 + class44.field760 - var6 * 64;
				class126.field2330 = var5 * 64 - class16.field239;
			}
			int var14 = class218.field4086 >> 2 << 10;
			class48.field895 = new int[var12][var11][];
			class208.field3951 = new byte[var12][var11][];
			for (int var15 = 0; var15 < class151.field2923; var15++) {
				class7 var16 = class101.method704(var15);
				if (var16 != null) {
					int var17 = var16.field98;
					if (var17 >= 0 && !class173.field3356.method436(var17)) {
						var17 = -1;
					}
					int var21;
					if (var16.field104 >= 0) {
						int var18 = var16.field104;
						int var19 = var13 + (var18 & 0x7F);
						if (var19 < 0) {
							var19 = 0;
						} else if (var19 > 127) {
							var19 = 127;
						}
						int var20 = (var18 & 0x380) + ((var18 + var14 & 0xFC00) + var19);
						var21 = class173.field3349[class31.method202(96, var20)];
					} else if (var17 >= 0) {
						var21 = class173.field3349[class31.method202(96, class173.field3356.method438(var17))];
					} else if (var16.field111 == -1) {
						var21 = -1;
					} else {
						int var22 = var16.field111;
						int var23 = var13 + (var22 & 0x7F);
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 127) {
							var23 = 127;
						}
						int var24 = (var22 & 0x380) + (var22 + var14 & 0xFC00) + var23;
						var21 = class173.field3349[class31.method202(96, var24)];
					}
					class54.field1009[var15 + 1] = var21;
				}
			}
			class228.field4276 = 20;
		} else if (class228.field4276 == 20) {
			class161.method1085(class130.field2440.method960(class20.field319, client.field570));
			class228.field4276 = 30;
			class108.method738();
		} else if (class228.field4276 == 30) {
			class150.method1029(class130.field2440.method960(class20.field319, class21.field325));
			class228.field4276 = 50;
			class108.method738();
		} else if (class228.field4276 == 50) {
			class218.method1473(class130.field2440.method960(class20.field319, class223.field4208));
			class228.field4276 = 70;
			class108.method738();
		} else if (class228.field4276 == 70) {
			class143.method937(class130.field2440.method960(class20.field319, class170.field3254));
			class228.field4276 = 90;
			class108.method738();
		} else {
			class90.method658(class130.field2440.method960(class20.field319, class25.field404));
			if (class228.field4276 == 90) {
				class12.field175 = new class75(11, true, class154.field2975);
				class118.field2147 = new class75(12, true, class154.field2975);
				class236.field4397 = new class75(14, true, class154.field2975);
				class196.field3762 = new class75(17, true, class154.field2975);
				class167.field3205 = new class75(19, true, class154.field2975);
				class166.field3199 = new class75(22, true, class154.field2975);
				class231.field4325 = new class75(26, true, class154.field2975);
				class227.field4250 = new class75(30, true, class154.field2975);
				class228.field4276 = 100;
			}
			field3659 = -1;
			class228.field4276 = 100;
			class34.field594 = -1;
			class108.method738();
			System.gc();
		}
	}

	@ObfuscatedName("rd.a(IIII)Z")
	public static boolean method1320(int arg0, int arg1, int arg2, int arg3) {
		if (class239.method1581(arg0, arg1, arg2)) {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			return class104.method718(var4 + 1, class62.field1137[arg0][arg1][arg2] + arg3, var5 + 1) && class104.method718(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class104.method718(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class104.method718(var4 + 1, class62.field1137[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
		} else {
			return false;
		}
	}

	public class189(byte[] arg0) {
		this.field3658 = arg0;
	}
}
