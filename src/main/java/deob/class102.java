package deob;

import java.awt.Image;

@ObfuscatedName("oe")
public final class class102 {

	@ObfuscatedName("oe.a")
	public class32 field2383;

	@ObfuscatedName("oe.e")
	public int field2387;

	@ObfuscatedName("oe.g")
	public static byte field2389;

	@ObfuscatedName("oe.h")
	public int field2390;

	@ObfuscatedName("oe.i")
	public static int field2391 = 0;

	@ObfuscatedName("oe.k")
	public boolean field2393;

	@ObfuscatedName("oe.l")
	public static class32 field2394 = class73.method593("<col=00ff80>", true);

	@ObfuscatedName("oe.m")
	public static Image field2395;

	@ObfuscatedName("oe.n")
	public int field2396;

	@ObfuscatedName("oe.o")
	public static int field2397 = 0;

	@ObfuscatedName("oe.p")
	public int field2398;

	@ObfuscatedName("oe.r")
	public static int[] field2400 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@ObfuscatedName("oe.s")
	public static class145 field2401;

	@ObfuscatedName("oe.a(I)V")
	public static void method821() {
		class94.field2170.method490();
		class47.field1115.method490();
	}

	@ObfuscatedName("oe.a(II)V")
	public static void method822(int arg0) {
		class107 var1 = (class107) class34.field709.method1196((long) arg0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.field2537.length; var2++) {
				var1.field2537[var2] = -1;
				var1.field2535[var2] = 0;
			}
		}
	}

	@ObfuscatedName("oe.a(Lec;Lea;ZILec;B)V")
	public static void method823(class32 arg0, class30 arg1, class32 arg2) {
		int var3 = arg1.method201(arg2);
		int var4 = arg1.method215(arg0, var3);
		class154.method1195(arg1, var3, 255, var4);
	}

	@ObfuscatedName("oe.b(I)V")
	public static void method824() {
		class61.method465();
		class157.method1219();
		class48.method363();
		class47.method357();
		class80.method630();
		class63.method487();
		class115.method899();
		method821();
		class17.method128();
		class52.method410();
		class115.method904();
		class8.method48();
		((class140) class7.field126).method1050();
		class50.field1146.method490();
		class92.field2124.method214();
		class38.field923.method214();
		class66.field1532.method214();
		class1.field6.method214();
		class134.field3115.method214();
		class124.field2887.method214();
		class147.field3346.method214();
		class30.field572.method214();
		class82.field1920.method214();
		class72.field1701.method214();
		class98.field2268.method214();
		class98.field2246.method214();
	}

	@ObfuscatedName("oe.b(II)V")
	public static void method825(int arg0) {
		if (arg0 == -1 && !class112.field2621) {
			class68.method565();
		} else if (arg0 != -1 && class12.field206 != arg0 && class158.field3638 != 0 && !class112.field2621) {
			class86.method667(class124.field2887, class158.field3638, 0, arg0);
		}
		class12.field206 = arg0;
	}

	@ObfuscatedName("oe.a(B)V")
	public static void method826() {
		field2394 = null;
		field2400 = null;
		field2395 = null;
		field2401 = null;
	}

	@ObfuscatedName("oe.c(I)V")
	public static void method827() {
		for (class136 var0 = (class136) class157.field3594.method1211(); var0 != null; var0 = (class136) class157.field3594.method1209()) {
			if (var0.field3149 != class43.field989 || var0.field3158) {
				var0.method1091();
			} else if (var0.field3151 <= class140.field3217) {
				var0.method1035(class54.field1282);
				if (var0.field3158) {
					var0.method1091();
				} else {
					class159.field3657.method1146(var0.field3149, var0.field3164, var0.field3171, var0.field3167, 60, var0, 0, -1, false);
				}
			}
		}
	}
}
