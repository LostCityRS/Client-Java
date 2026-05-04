package deob;

@ObfuscatedName("de")
public final class class39 extends class67 {

	@ObfuscatedName("de.t")
	public class174 field676;

	@ObfuscatedName("de.u")
	public class88 field677;

	@ObfuscatedName("de.v")
	public class174 field678;

	@ObfuscatedName("de.w")
	public int field679;

	@ObfuscatedName("de.F")
	public static final class88 field688 = class208.method1423(105, "flash3:");

	@ObfuscatedName("de.H")
	public static final class88 field690 = class208.method1423(105, "hint_mapedge");

	@ObfuscatedName("de.G")
	public static final class88 field689 = class208.method1423(105, "title)3jpg");

	@ObfuscatedName("de.N")
	public static final class88 field696 = field688;

	@ObfuscatedName("de.A")
	public static class88 field683 = field688;

	@ObfuscatedName("de.P")
	public static int field698 = 0;

	@ObfuscatedName("de.z")
	public int field682;

	@ObfuscatedName("de.I")
	public int field691;

	@ObfuscatedName("de.J")
	public int field692;

	@ObfuscatedName("de.K")
	public static int field693;

	@ObfuscatedName("de.L")
	public int field694;

	@ObfuscatedName("de.B")
	public static class144 field684;

	@ObfuscatedName("de.D")
	public boolean field686;

	@ObfuscatedName("de.y")
	public Object[] field681;

	@ObfuscatedName("de.a(IZI)I")
	public static int method255(int arg0, int arg1) {
		class177 var2 = (class177) class64.field1163.method1049((long) arg1);
		if (var2 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < var2.field3553.length) {
			return var2.field3553[arg0];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("de.b(I)V")
	public static void method256() {
		for (class20 var0 = (class20) class167.field3220.method1610(); var0 != null; var0 = (class20) class167.field3220.method1619()) {
			class77 var1 = var0.field315;
			if (var1.field1390 != class149.field2907 || class117.field2113 > var1.field1407) {
				var0.method460();
			} else if (var1.field1371 <= class117.field2113) {
				if (var1.field1387 > 0) {
					class191 var2 = class225.field4223[var1.field1387 - 1];
					if (var2 != null && var2.field4136 >= 0 && var2.field4136 < 13312 && var2.field4121 >= 0 && var2.field4121 < 13312) {
						var1.method520(var2.field4136, class117.field2113, class239.method1584(var2.field4136, var2.field4121, var1.field1390) - var1.field1396, var2.field4121);
					}
				}
				if (var1.field1387 < 0) {
					int var3 = -var1.field1387 - 1;
					class44 var4;
					if (var3 == class220.field4164) {
						var4 = class240.field4456;
					} else {
						var4 = class244.field4491[var3];
					}
					if (var4 != null && var4.field4136 >= 0 && var4.field4136 < 13312 && var4.field4121 >= 0 && var4.field4121 < 13312) {
						var1.method520(var4.field4136, class117.field2113, class239.method1584(var4.field4136, var4.field4121, var1.field1390) - var1.field1396, var4.field4121);
					}
				}
				var1.method517(class17.field261);
				class126.method859(class149.field2907, (int) var1.field1406, (int) var1.field1391, (int) var1.field1375, 60, var1, var1.field1381, -1L, false);
			}
		}
	}

	@ObfuscatedName("de.d(I)V")
	public static void method258() {
		int var0 = class234.field4383;
		int var1 = class86.field1549;
		int var2 = class237.field4421;
		int var3 = class47.field889;
		class72.method478(var1, var0, var2, var3, 6116423);
		class72.method478(var1 + 1, var0 + 1, var2 - 2, 16, 0);
		class72.method476(var1 + 1, var0 + 18, var2 - 2, var3 - 19, 0);
		class54.field1011.method154(class25.field398, var1 + 3, var0 + 14, 6116423, -1);
		int var4 = class28.field471;
		int var5 = class239.field4449;
		for (int var6 = 0; var6 < class203.field3862; var6++) {
			int var7 = var0 + (class203.field3862 - var6 - 1) * 15 + 31;
			int var8 = 16777215;
			if (var1 < var4 && var4 < var2 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}
			class54.field1011.method154(class78.method525(var6), var1 + 3, var7, var8, 0);
		}
		class129.method874(class86.field1549, class47.field889, class237.field4421, class234.field4383);
	}
}
