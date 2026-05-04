package deob;

import java.io.IOException;

@ObfuscatedName("ne")
public final class class147 {

	@ObfuscatedName("ne.a")
	public static class88 field2752 = null;

	@ObfuscatedName("ne.c")
	public static final class88 field2754 = class208.method1423(105, "Ausw-=hlen");

	@ObfuscatedName("ne.f")
	public static int field2757 = 0;

	@ObfuscatedName("ne.i")
	public static class22 field2760;

	@ObfuscatedName("ne.n")
	public static int field2765 = 0;

	@ObfuscatedName("ne.o")
	public static int field2766;

	@ObfuscatedName("ne.a(ILi;Li;Lnb;)[Lrh;")
	public static class193[] method981(class88 arg0, class88 arg1, class144 arg2) {
		int var3 = arg2.method964(arg0);
		int var4 = arg2.method966(arg1, var3);
		return class190.method1322(var3, var4, arg2);
	}

	@ObfuscatedName("ne.a(IIIIZIIIII)V")
	public static void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg1 == arg0 && arg6 == arg5 && arg2 == arg8 && arg7 == arg4) {
			class229.method1529(arg0, arg4, arg2, arg6, arg3);
			return;
		}
		int var9 = arg0;
		int var10 = arg6;
		int var11 = arg0 * 3;
		int var12 = arg6 * 3;
		int var13 = arg1 * 3;
		int var14 = arg5 * 3;
		int var15 = arg8 * 3;
		int var16 = arg7 * 3;
		int var17 = arg2 + var13 - var15 - arg0;
		int var18 = var15 + var11 - var13 - var13;
		int var19 = arg4 + var14 - arg6 - var16;
		int var20 = var16 + var12 - var14 - var14;
		int var21 = var13 - var11;
		int var22 = var14 - var12;
		for (int var23 = 128; var23 <= 4096; var23 += 128) {
			int var24 = var23 * var23 >> 12;
			int var25 = var21 * var23;
			int var26 = var23 * var24 >> 12;
			int var27 = var23 * var22;
			int var28 = var26 * var17;
			int var29 = var18 * var24;
			int var30 = var26 * var19;
			int var31 = (var25 + var28 + var29 >> 12) + arg0;
			int var32 = var24 * var20;
			int var33 = (var27 + var30 + var32 >> 12) + arg6;
			class229.method1529(var9, var33, var31, var10, arg3);
			var10 = var33;
			var9 = var31;
		}
	}

	@ObfuscatedName("ne.a(Z)V")
	public static void method983() {
		class113.field2039.method670();
		class168.field3236.method134();
		class157.field3020.method670();
	}

	@ObfuscatedName("ne.a(I)I")
	public static int method984() {
		return class190.field3668;
	}

	@ObfuscatedName("ne.a(II)Llf;")
	public static class126 method985(int arg0) {
		class126 var1 = (class126) class231.field4331.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class209.field3968.method939(class52.method387(arg0), class101.method702(arg0));
		class126 var3 = new class126();
		var3.field2314 = arg0;
		if (var2 != null) {
			var3.method853(new class46(var2));
		}
		var3.method858();
		class231.field4331.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ne.a(IIIIIIII)V")
	public static void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = class156.method1058(class49.field919, class18.field279, arg2);
		int var8 = class156.method1058(class49.field919, class18.field279, arg4);
		int var9 = class156.method1058(class67.field1207, class12.field183, arg3);
		int var10 = class156.method1058(class67.field1207, class12.field183, arg1);
		int var11 = class156.method1058(class49.field919, class18.field279, arg2 + arg5);
		int var12 = class156.method1058(class49.field919, class18.field279, arg4 - arg5);
		for (int var13 = var7; var13 < var11; var13++) {
			class230.method1534(var9, arg6, var10, class3.field42[var13]);
		}
		for (int var14 = var8; var14 > var12; var14--) {
			class230.method1534(var9, arg6, var10, class3.field42[var14]);
		}
		int var15 = class156.method1058(class67.field1207, class12.field183, arg3 + arg5);
		int var16 = class156.method1058(class67.field1207, class12.field183, arg1 - arg5);
		for (int var17 = var11; var17 <= var12; var17++) {
			int[] var18 = class3.field42[var17];
			class230.method1534(var9, arg6, var15, var18);
			class230.method1534(var15, arg0, var16, var18);
			class230.method1534(var16, arg6, var10, var18);
		}
	}

	@ObfuscatedName("ne.a(BZ)V")
	public static void method988(boolean arg0) {
		if (class214.field4033 == null) {
			return;
		}
		try {
			class46 var1 = new class46(4);
			var1.method346(arg0 ? 2 : 3);
			var1.method337(0);
			class214.field4033.method911(4, var1.field842);
		} catch (IOException var3) {
			try {
				class214.field4033.method917();
			} catch (Exception var2) {
			}
			class214.field4033 = null;
			class77.field1389++;
		}
	}
}
