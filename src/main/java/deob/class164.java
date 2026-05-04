package deob;

@ObfuscatedName("pa")
public final class class164 implements class198 {

	@ObfuscatedName("pa.a")
	public static final class88 field3135 = class208.method1423(105, ")2");

	@ObfuscatedName("pa.b")
	public static int field3136;

	@ObfuscatedName("pa.d")
	public static int field3138 = 0;

	@ObfuscatedName("pa.g")
	public static final class88 field3141 = class208.method1423(105, "<img=1>");

	@ObfuscatedName("pa.h")
	public static byte[][][] field3142;

	@ObfuscatedName("pa.i")
	public static final class88 field3143 = class208.method1423(105, "Lade Benutzeroberfl-=che )2 ");

	@ObfuscatedName("pa.a(ZB)V")
	public static void method1128(boolean arg0) {
		if (class240.field4456.field4136 >> 7 == class116.field2102 && class140.field2594 == class240.field4456.field4121 >> 7) {
			class116.field2102 = 0;
		}
		int var1 = class55.field1027;
		if (arg0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			class44 var3;
			long var4;
			if (arg0) {
				var4 = 8791798054912L;
				var3 = class240.field4456;
			} else {
				var3 = class244.field4491[class174.field3428[var2]];
				var4 = (long) class174.field3428[var2] << 32;
			}
			if (var3 != null && var3.method287()) {
				int var6 = var3.field4136 >> 7;
				var3.field743 = false;
				if ((class245.field4497 && class55.field1027 > 50 || class55.field1027 > 200) && !arg0 && var3.field4105 == var3.field4106) {
					var3.field743 = true;
				}
				int var7 = var3.field4121 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var3.field758 == null || class117.field2113 < var3.field755 || class117.field2113 >= var3.field762) {
						if ((var3.field4136 & 0x7F) == 64 && (var3.field4121 & 0x7F) == 64) {
							if (class210.field3990 == class152.field2948[var6][var7]) {
								continue;
							}
							class152.field2948[var6][var7] = class210.field3990;
						}
						var3.field4097 = class239.method1584(var3.field4136, var3.field4121, class149.field2907);
						class126.method859(class149.field2907, var3.field4136, var3.field4121, var3.field4097, 60, var3, var3.field4085, var4, var3.field4093);
					} else {
						var3.field743 = false;
						var3.field4097 = class239.method1584(var3.field4136, var3.field4121, class149.field2907);
						class126.method855(class149.field2907, var3.field4136, var3.field4121, var3.field4097, var3, var3.field4085, var4, var3.field764, var3.field741, var3.field744, var3.field745);
					}
				}
			}
		}
	}

	@ObfuscatedName("pa.a(I)Lrh;")
	public static class193 method1129() {
		class193 var0 = new class193(class15.field229, class129.field2424, class247.field4528[0], class135.field2510[0], class102.field1851[0], class67.field1218[0], class116.field2104[0], class27.field456);
		class239.method1578();
		return var0;
	}

	@ObfuscatedName("pa.a(BLi;)Z")
	public static boolean method1130(class88 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < class67.field1221; var1++) {
			if (arg0.method624(class146.field2741[var1])) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("pa.a([IIJI)Li;")
	@Override
	public class88 method1126(int[] arg0, int arg1, long arg2) {
		if (arg1 == 0) {
			class47 var5 = class167.method1148(arg0[0]);
			return var5.method360((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			class149 var6 = class71.method472((int) arg2);
			return var6.field2892;
		} else if (arg1 == 6 || arg1 == 7) {
			return class167.method1148(arg0[0]).method360((int) arg2);
		} else {
			return null;
		}
	}
}
