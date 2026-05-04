package deob;

@ObfuscatedName("bi")
public final class class21 {

	@ObfuscatedName("bi.d")
	public static final class88 field325 = class208.method1423(105, "overlay)3dat");

	@ObfuscatedName("bi.a(JB)V")
	public static void method98(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			class199.method1365(arg0 - 1L);
			class199.method1365(1L);
		} else {
			class199.method1365(arg0);
		}
	}

	@ObfuscatedName("bi.a(ILef;)V")
	public static void method99(class51 arg0) {
		if (arg0.field935 != null) {
			arg0.field935.field1254 = 0;
		}
		arg0.field937 = false;
		for (class51 var1 = arg0.method385(); var1 != null; var1 = arg0.method380()) {
			method99(var1);
		}
	}

	@ObfuscatedName("bi.a(B)[Lrc;")
	public static class188[] method100() {
		class188[] var0 = new class188[class172.field3345];
		for (int var1 = 0; var1 < class172.field3345; var1++) {
			int var2 = class67.field1218[var1] * class102.field1851[var1];
			int[] var3 = new int[var2];
			byte[] var4 = class116.field2104[var1];
			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = class27.field456[var4[var5] & 0xFF];
			}
			var0[var1] = new class169(class15.field229, class129.field2424, class247.field4528[var1], class135.field2510[var1], class102.field1851[var1], class67.field1218[var1], var3);
		}
		class239.method1578();
		return var0;
	}

	@ObfuscatedName("bi.a(IIIIIIB)V")
	public static void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = class156.method1058(class49.field919, class18.field279, arg3);
		int var7 = class156.method1058(class49.field919, class18.field279, arg0);
		int var8 = class156.method1058(class67.field1207, class12.field183, arg2);
		int var9 = class156.method1058(class67.field1207, class12.field183, arg4);
		int var10 = class156.method1058(class49.field919, class18.field279, arg3 + arg1);
		int var11 = class156.method1058(class49.field919, class18.field279, arg0 - arg1);
		for (int var12 = var6; var12 < var10; var12++) {
			class230.method1534(var8, arg5, var9, class3.field42[var12]);
		}
		for (int var13 = var7; var13 > var11; var13--) {
			class230.method1534(var8, arg5, var9, class3.field42[var13]);
		}
		int var14 = class156.method1058(class67.field1207, class12.field183, arg1 + arg2);
		int var15 = class156.method1058(class67.field1207, class12.field183, arg4 - arg1);
		for (int var16 = var10; var16 <= var11; var16++) {
			int[] var17 = class3.field42[var16];
			class230.method1534(var8, arg5, var14, var17);
			class230.method1534(var15, arg5, var9, var17);
		}
	}

	@ObfuscatedName("bi.a(II)I")
	public static int method102(int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("bi.a(Lea;I)Li;")
	public static class88 method103(class46 arg0) {
		return class78.method524(arg0);
	}
}
