package deob;

@ObfuscatedName("mh")
public final class class139 extends class23 {

	@ObfuscatedName("mh.ab")
	public static final class88 field2582 = class208.method1423(105, "Bitte entfernen Sie ");

	@ObfuscatedName("mh.bb")
	public int field2583 = 4096;

	@ObfuscatedName("mh.cb")
	public static int field2584 = 0;

	@ObfuscatedName("mh.db")
	public static final class88 field2585 = class208.method1423(105, "Bitte wenden Sie sich an den Kundendienst)3");

	@ObfuscatedName("mh.eb")
	public int field2586 = 4096;

	@ObfuscatedName("mh.T")
	public static volatile int field2575 = 0;

	@ObfuscatedName("mh.X")
	public static final int[] field2579 = new int[2048];

	@ObfuscatedName("mh.V")
	public static final int[] field2577 = new int[1000];

	@ObfuscatedName("mh.Y")
	public static final class88 field2580 = class208.method1423(105, "Your profile will be transferred in:");

	@ObfuscatedName("mh.fb")
	public static class88 field2587 = field2580;

	@ObfuscatedName("mh.R")
	public static int field2573 = 0;

	@ObfuscatedName("mh.U")
	public int field2576 = 4096;

	@ObfuscatedName("mh.W")
	public static class144 field2578;

	@ObfuscatedName("mh.a(IIIILdj;)V")
	public static void method922(int arg0, int arg1, int arg2, class44 arg3) {
		if (arg3 == class240.field4456 || class203.field3862 >= 400) {
			return;
		}
		class88 var4;
		if (arg3.field749 == 0) {
			var4 = class166.method1140(new class88[] { arg3.field766, class168.method1152(arg3.field747, class240.field4456.field747), class68.field1238, class145.field2717, class170.method1212(arg3.field747), class104.field1879 });
		} else {
			var4 = class166.method1140(new class88[] { arg3.field766, class68.field1238, class143.field2637, class170.method1212(arg3.field749), class104.field1879 });
		}
		if (class28.field475 == 1) {
			class98.method685(arg1, class35.field608, (short) 31, (long) arg0, class166.method1140(new class88[] { class78.field1414, class49.field914, var4 }), arg2);
		} else if (!class10.field145) {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (class130.field2436[var5] != null) {
					short var6 = 0;
					if (class47.field884 == 0 && class130.field2436[var5].method624(class158.field3041)) {
						if (arg3.field747 > class240.field4456.field747) {
							var6 = 2000;
						}
						if (class240.field4456.field752 != 0 && arg3.field752 != 0) {
							if (arg3.field752 == class240.field4456.field752) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (class203.field3875[var5]) {
						var6 = 2000;
					}
					short var7 = class24.field390[var5];
					short var8 = (short) (var7 + var6);
					class98.method685(arg1, class130.field2436[var5], var8, (long) arg0, class166.method1140(new class88[] { class88.field1637, var4 }), arg2);
				}
			}
		} else if ((class115.field2084 & 0x8) == 8) {
			class98.method685(arg1, class201.field3835, (short) 23, (long) arg0, class166.method1140(new class88[] { class28.field464, class49.field914, var4 }), arg2);
		}
		for (int var9 = 0; var9 < class203.field3862; var9++) {
			if (class53.field994[var9] == 10) {
				class201.field3836[var9] = class166.method1140(new class88[] { class88.field1637, var4 });
				return;
			}
		}
	}

	public class139() {
		super(1, false);
	}

	@ObfuscatedName("mh.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[0];
			int[] var6 = var2[1];
			int[] var7 = var3[2];
			int[] var8 = var2[0];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < class70.field1276; var10++) {
				int var11 = var5[var10];
				int var12 = var7[var10];
				int var13 = var4[var10];
				if (var12 == var11 && var12 == var13) {
					var8[var10] = var11 * this.field2576 >> 12;
					var6[var10] = var12 * this.field2586 >> 12;
					var9[var10] = var13 * this.field2583 >> 12;
				} else {
					var8[var10] = this.field2576;
					var6[var10] = this.field2586;
					var9[var10] = this.field2583;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mh.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2576 = arg0.method301();
		} else if (arg1 == 1) {
			this.field2586 = arg0.method301();
		} else if (arg1 == 2) {
			this.field2583 = arg0.method301();
		}
	}
}
