package deob;

import java.awt.Component;

@ObfuscatedName("cb")
public final class class17 extends class26 {

	@ObfuscatedName("cb.ab")
	public static class32 field340 = class73.method593("Untersuchen", true);

	@ObfuscatedName("cb.cb")
	public static class32 field342 = class73.method593("Stufe)2", true);

	@ObfuscatedName("cb.db")
	public static int[] field343 = new int[25];

	@ObfuscatedName("cb.hb")
	public static int[] field347 = new int[100];

	@ObfuscatedName("cb.ib")
	public static class32 field348 = class73.method593("Die Adresse dieses Computers wurde gesperrt)1", true);

	@ObfuscatedName("cb.kb")
	public static class32 field350 = class73.method593(":chalreq:", true);

	@ObfuscatedName("cb.lb")
	public static int[] field351 = new int[5];

	@ObfuscatedName("cb.V")
	public static class32 field335 = class73.method593("Suche nach Updates )2 ", true);

	@ObfuscatedName("cb.T")
	public int field333;

	@ObfuscatedName("cb.W")
	public int field336;

	@ObfuscatedName("cb.b(III)I")
	public static int method125(int arg0, int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			int var2 = arg0 % arg1;
			arg0 = arg1;
			arg1 = var2;
		}
		return arg0;
	}

	@ObfuscatedName("cb.a(BLf;II)V")
	public static void method127(class36 arg0, int arg1, int arg2) {
		if (class158.field3629 != null || class26.field476 || (arg0 == null || class145.method1088(arg0) == null)) {
			return;
		}
		class158.field3629 = arg0;
		class117.field2807 = class145.method1088(arg0);
		class45.field1068 = arg2;
		class88.field2029 = arg1;
		class77.field1789 = false;
		class9.field163 = 0;
	}

	@ObfuscatedName("cb.f(I)V")
	public static void method128() {
		class62.field1406.method490();
	}

	@ObfuscatedName("cb.a(IIIII)V")
	public static void method129(int arg0, int arg1, int arg2, int arg3) {
		if (class135.field3147 == 1) {
			class1.field2[class154.field3543 / 100].method369(class27.field499 - 8, class154.field3545 + -8);
		}
		if (class135.field3147 == 2) {
			class1.field2[class154.field3543 / 100 + 4].method369(class27.field499 - 8, class154.field3545 + -8);
		}
		class110.method872();
		if (!class157.field3605) {
			return;
		}
		int var4 = arg2 + 507;
		int var5 = arg0 + 20;
		int var6 = 16776960;
		class121.field2876.method777(class52.method402(new class32[] { class79.field1833, class159.method1228(class98.field2270) }), var4, var5, 16776960, -1);
		Runtime var7 = Runtime.getRuntime();
		int var9 = var5 + 15;
		int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
		if (var8 > 32768 && class154.field3529) {
			var6 = 16711680;
		}
		if (var8 > 65536 && !class154.field3529) {
			var6 = 16711680;
		}
		class121.field2876.method777(class52.method402(new class32[] { class13.field222, class159.method1228(var8), class112.field2628 }), var4, var9, var6, -1);
		var5 = var9 + 15;
	}

	@ObfuscatedName("cb.b(II)Lo;")
	public static class97 method130(int arg0) {
		class97 var1 = (class97) class9.field164.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class154.field3512.method206(9, arg0);
		class97 var3 = new class97();
		var3.field2224 = arg0;
		if (var2 != null) {
			var3.method758(new class66(var2));
		}
		var3.method762();
		class9.field164.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("cb.a(ILjava/awt/Component;)V")
	public static void method131(Component arg0) {
		arg0.removeKeyListener(class38.field919);
		arg0.removeFocusListener(class38.field919);
		class14.field231 = -1;
	}

	@ObfuscatedName("cb.b(B)Lod;")
	@Override
	public class101 method132() {
		return class146.method1092(this.field333).method470(this.field336);
	}
}
