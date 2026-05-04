package deob;

import java.awt.Component;

@ObfuscatedName("cf")
public abstract class class29 {

	@ObfuscatedName("cf.a")
	public static final class88 field477 = class208.method1423(105, "Account locked as we suspect it has been stolen)3");

	@ObfuscatedName("cf.c")
	public static int field479 = 0;

	@ObfuscatedName("cf.d")
	public static class88 field480 = field477;

	@ObfuscatedName("cf.e")
	public static int field481 = 1;

	@ObfuscatedName("cf.f")
	public static int[] field482;

	@ObfuscatedName("cf.j")
	public static final class88 field486 = class208.method1423(105, "No response from server)3");

	@ObfuscatedName("cf.b")
	public static class88 field478 = field486;

	@ObfuscatedName("cf.k")
	public static boolean field487 = false;

	@ObfuscatedName("cf.m")
	public static class52[][][] field489;

	@ObfuscatedName("cf.n")
	public static final class88 field490 = class208.method1423(105, "gleiten:");

	@ObfuscatedName("cf.o")
	public static final class88 field491 = class208.method1423(105, "yellow:");

	@ObfuscatedName("cf.i")
	public static class88 field485 = field491;

	@ObfuscatedName("cf.l")
	public static final class88 field488 = field491;

	@ObfuscatedName("cf.q")
	public static final class88 field493 = class208.method1423(105, "W-=hlen Sie eine Option");

	@ObfuscatedName("cf.a(I)V")
	public static void method174() {
		class146.field2747.method30(24);
		for (class168 var0 = (class168) class128.field2395.method1047(); var0 != null; var0 = (class168) class128.field2395.method1048()) {
			if (var0.field3233 == 0) {
				class93.method672(var0, true);
			}
		}
		if (class53.field967 != null) {
			class200.method1371(class53.field967);
			class53.field967 = null;
		}
	}

	@ObfuscatedName("cf.a(III)V")
	public static void method175(int arg0, int arg1) {
		class248 var2 = class134.field2497[class149.field2907][arg0][arg1];
		if (var2 == null) {
			class27.method168(class149.field2907, arg0, arg1);
			return;
		}
		int var3 = -99999999;
		class227 var4 = null;
		for (class227 var5 = (class227) var2.method1610(); var5 != null; var5 = (class227) var2.method1619()) {
			class149 var6 = class71.method472(var5.field4258.field2030);
			int var7 = var6.field2854;
			if (var6.field2852 == 1) {
				var7 *= var5.field4258.field2029 + 1;
			}
			if (var7 > var3) {
				var4 = var5;
				var3 = var7;
			}
		}
		if (var4 == null) {
			class27.method168(class149.field2907, arg0, arg1);
			return;
		}
		class111 var8 = null;
		var2.method1615(var4);
		class111 var9 = null;
		for (class227 var10 = (class227) var2.method1610(); var10 != null; var10 = (class227) var2.method1619()) {
			class111 var11 = var10.field4258;
			if (var4.field4258.field2030 != var11.field2030) {
				if (var8 == null) {
					var8 = var11;
				}
				if (var11.field2030 != var8.field2030 && var9 == null) {
					var9 = var11;
				}
			}
		}
		long var12 = (long) (arg0 + (arg1 << 7) + 1610612736);
		class94.method675(class149.field2907, arg0, arg1, class239.method1584(arg0 * 128 + 64, arg1 * 128 - -64, class149.field2907), var4.field4258, var12, var8, var9);
	}

	@ObfuscatedName("cf.a(II)Lvh;")
	public static class237 method179(int arg0) {
		class237 var1 = (class237) class236.field4402.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class31.field506.method939(arg0, 1);
		class237 var3 = new class237();
		if (var2 != null) {
			var3.method1572(arg0, new class46(var2));
		}
		class236.field4402.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("cf.a(ILjava/awt/Component;)V")
	public abstract void method173(Component arg0);

	@ObfuscatedName("cf.a(B)I")
	public abstract int method176();

	@ObfuscatedName("cf.b(ILjava/awt/Component;)V")
	public abstract void method177(Component arg0);
}
