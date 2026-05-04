package deob;

@ObfuscatedName("ij")
public final class class97 extends class136 {

	@ObfuscatedName("ij.E")
	public static final int[] field1781 = new int[4096];

	@ObfuscatedName("ij.H")
	public static int field1783 = -1;

	@ObfuscatedName("ij.N")
	public static final int[] field1789 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("ij.I")
	public static final class88 field1784 = class208.method1423(105, "da dieser Computer gegen unsere ");

	@ObfuscatedName("ij.P")
	public static final class88 field1791 = class208.method1423(105, "60 Sekunden noch einmal)3)3)3");

	@ObfuscatedName("ij.G")
	public byte field1782;

	@ObfuscatedName("ij.D")
	public int field1780;

	@ObfuscatedName("ij.L")
	public class22 field1787;

	@ObfuscatedName("ij.K")
	public static byte[][][] field1786;

	@ObfuscatedName("ij.a(III)V")
	public static void method679(int arg0, int arg1) {
		if (class203.field3862 < 2 && class28.field475 == 0 && !class10.field145) {
			return;
		}
		class88 var2;
		if (class28.field475 == 1 && class203.field3862 < 2) {
			var2 = class166.method1140(new class88[] { class35.field608, class236.field4398, class78.field1414, class160.field3089 });
		} else if (class10.field145 && class203.field3862 < 2) {
			var2 = class166.method1140(new class88[] { class201.field3835, class236.field4398, class28.field464, class160.field3089 });
		} else {
			var2 = class78.method525(class203.field3862 - 1);
		}
		if (class203.field3862 > 2) {
			var2 = class166.method1140(new class88[] { var2, class47.field891, class170.method1212(class203.field3862 - 2), class103.field1862 });
		}
		int var3 = class54.field1011.method165(var2, arg1 + 4, arg0 + 15, class70.field1259, class27.field454);
		class126.method861(15, var3 + class54.field1011.method158(var2), arg0, arg1 + 4);
	}

	@ObfuscatedName("ij.a(IIIIIBII)V")
	public static void method681(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < 128 || arg4 < 128 || arg2 > 13056 || arg4 > 13056) {
			class25.field401 = -1;
			class33.field541 = -1;
			return;
		}
		int var5 = class239.method1584(arg2, arg4, class149.field2907) - arg1;
		int var6 = arg4 - class184.field3608;
		int var7 = arg2 - class79.field1428;
		int var8 = var5 - class108.field1954;
		int var9 = class173.field3359[class207.field3934];
		int var10 = class173.field3354[class207.field3934];
		int var11 = class173.field3354[class170.field3257];
		int var12 = class173.field3359[class170.field3257];
		int var13 = var11 * var7 + var6 * var12 >> 16;
		int var14 = var11 * var6 - var12 * var7 >> 16;
		int var16 = var10 * var8 - var9 * var14 >> 16;
		int var17 = var8 * var9 + var10 * var14 >> 16;
		if (var17 < 50) {
			class25.field401 = -1;
			class33.field541 = -1;
		} else {
			class33.field541 = (var16 << 9) / var17 + arg0;
			class25.field401 = arg3 + (var13 << 9) / var17;
		}
	}

	@ObfuscatedName("ij.a(Li;I)V")
	public static void method682(class88 arg0) {
		if (class67.field1208 >= 2) {
			if (arg0.method624(class78.field1421)) {
				for (int var1 = 0; var1 < 10; var1++) {
					System.gc();
				}
				Runtime var2 = Runtime.getRuntime();
				int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
				class223.method1499(class166.method1140(new class88[] { class152.field2950, class170.method1212(var3), class110.field2007 }), 0, null);
			}
			if (arg0.method624(class11.field156)) {
				class201.method1380();
			}
			if (arg0.method624(class248.field4547)) {
				class148.field2768 = true;
			}
			if (arg0.method624(class34.field583)) {
				class148.field2768 = false;
			}
			arg0.method624(class44.field751);
			arg0.method624(class1.field6);
			if (arg0.method624(class172.field3337)) {
				for (int var4 = 0; var4 < 4; var4++) {
					for (int var5 = 1; var5 < 103; var5++) {
						for (int var6 = 1; var6 < 103; var6++) {
							class166.field3200[var4].field1667[var5][var6] = 0;
						}
					}
				}
			}
			if (arg0.method619(class226.field4249) && class115.field2071 != 0) {
				class159.method1073(arg0.method635(6).method603());
			}
			if (arg0.method624(class22.field344) && class115.field2071 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method619(class58.field1103)) {
				class134.field2503 = arg0.method635(12).method602().method603();
				class223.method1499(class166.method1140(new class88[] { class93.field1750, class170.method1212(class134.field2503) }), 0, null);
			}
			if (arg0.method624(class106.field1930)) {
				class116.field2103 = true;
			}
		}
		class146.field2747.method30(175);
		class146.field2747.method346(arg0.method604() - 1);
		class146.field2747.method336(arg0.method635(2));
	}
}
