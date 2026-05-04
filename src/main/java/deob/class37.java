package deob;

@ObfuscatedName("dc")
public final class class37 {

	@ObfuscatedName("dc.c")
	public static final class88 field664 = class208.method1423(105, "Please enter your password)3");

	@ObfuscatedName("dc.a")
	public static class88 field662 = field664;

	@ObfuscatedName("dc.d")
	public static final class88 field665 = class208.method1423(105, ":clanreq:");

	@ObfuscatedName("dc.e")
	public static int field666;

	@ObfuscatedName("dc.g")
	public static final class88 field668 = class208.method1423(105, "flash1:");

	@ObfuscatedName("dc.b")
	public static class88 field663 = field668;

	@ObfuscatedName("dc.h")
	public static final class88 field669 = field668;

	@ObfuscatedName("dc.k")
	public static class144 field672;

	@ObfuscatedName("dc.a(IIIBI)V")
	public static void method248(int arg0, int arg1, int arg2, int arg3) {
		class210.field3990++;
		class164.method1128(true);
		class149.method1023(true);
		class164.method1128(false);
		class149.method1023(false);
		class39.method256();
		class199.method1370();
		if (!class179.field3567) {
			int var4 = class64.field1173;
			int var5 = class207.field3930 + class98.field1795 & 0x7FF;
			if (class71.field1328 / 256 > var4) {
				var4 = class71.field1328 / 256;
			}
			if (class233.field4368[4] && class66.field1194[4] + 128 > var4) {
				var4 = class66.field1194[4] + 128;
			}
			class47.method359(field666, class239.method1584(class240.field4456.field4136, class240.field4456.field4121, class149.field2907) - 50, var5, var4, var4 * 3 + 600, arg2, class233.field4366);
		}
		int var6;
		if (class179.field3567) {
			var6 = class152.method1040();
		} else {
			var6 = class131.method885();
		}
		int var7 = class108.field1954;
		int var8 = class207.field3934;
		int var9 = class79.field1428;
		int var10 = class184.field3608;
		int var11 = class170.field3257;
		for (int var12 = 0; var12 < 5; var12++) {
			if (class233.field4368[var12]) {
				int var13 = (int) (Math.random() * (double) (class201.field3834[var12] * 2 + 1) + Math.sin((double) class190.field3674[var12] * ((double) class194.field3714[var12] / 100.0D)) * (double) class66.field1194[var12] - (double) class201.field3834[var12]);
				if (var12 == 3) {
					class170.field3257 = class170.field3257 + var13 & 0x7FF;
				}
				if (var12 == 4) {
					class207.field3934 += var13;
					if (class207.field3934 < 128) {
						class207.field3934 = 128;
					}
					if (class207.field3934 > 383) {
						class207.field3934 = 383;
					}
				}
				if (var12 == 2) {
					class184.field3608 += var13;
				}
				if (var12 == 1) {
					class108.field1954 += var13;
				}
				if (var12 == 0) {
					class79.field1428 += var13;
				}
			}
		}
		class72.method480(arg1, arg3, arg0 + arg1, arg2 + arg3);
		class173.method1235();
		int var14 = class28.field471;
		int var15 = class239.field4449;
		if (var14 >= arg1 && arg1 + arg0 > var14 && arg3 <= var15 && var15 < arg3 + arg2) {
			class53.field997 = true;
			class161.field3101 = 0;
			int var16 = class147.field2766;
			int var17 = class151.field2931;
			int var18 = class58.field1102;
			class141.field2610 = var16 + (var17 - var16) * (class28.field471 - arg1) / arg0;
			int var19 = class217.field4055;
			class184.field3604 = (class239.field4449 - arg3) * (var19 - var18) / arg2 + var18;
		} else {
			class53.field997 = false;
			class161.field3101 = 0;
		}
		class219.method1479();
		class72.method478(arg1, arg3, arg0, arg2, 0);
		class113.method772(class79.field1428, class108.field1954, class184.field3608, class207.field3934, class170.field3257, var6, null, null, null, null, null, null, class240.field4456.field4136 >> 7, class240.field4456.field4121 >> 7);
		class219.method1479();
		class110.method763();
		class53.method391(arg1, arg3, arg2, arg0);
		class148.method993(arg1, arg3, arg2, arg0);
		((class68) class173.field3356).method466(class17.field261);
		class11.method53(arg1, arg2, arg3, arg0);
		class170.field3257 = var11;
		class207.field3934 = var8;
		class79.field1428 = var9;
		class108.field1954 = var7;
		class184.field3608 = var10;
		if (class154.field2980 && class158.method1067() == 0) {
			class154.field2980 = false;
		}
		if (class154.field2980) {
			class72.method478(arg1, arg3, arg0, arg2, 0);
			client.method221(class242.field4478, false);
		}
		if (!class154.field2980 && !class108.field1958 && arg1 <= var14 && var14 < arg0 + arg1 && arg3 <= var15 && var15 < arg2 + arg3) {
			class204.method1398(var15, arg1, arg2, arg0, arg3, var14);
		}
	}

	@ObfuscatedName("dc.a(Lnb;BI)Lpf;")
	public static class169 method250(class144 arg0, int arg1) {
		return class212.method1451(arg1, arg0) ? class237.method1571() : null;
	}
}
