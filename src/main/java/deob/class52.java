package deob;

import java.awt.Component;
import java.lang.reflect.Method;

@ObfuscatedName("hc")
public final class class52 {

	@ObfuscatedName("hc.b")
	public static class32 field1173 = class73.method593("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", true);

	@ObfuscatedName("hc.c")
	public static class32 field1174 = class73.method593("Login server offline)3", true);

	@ObfuscatedName("hc.d")
	public static class70[] field1175 = new class70[2048];

	@ObfuscatedName("hc.e")
	public static class32 field1176 = field1174;

	@ObfuscatedName("hc.f")
	public static int field1177 = 0;

	@ObfuscatedName("hc.g")
	public static class32 field1178 = class73.method593("cross", true);

	@ObfuscatedName("hc.h")
	public static class32 field1179 = class73.method593("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", true);

	@ObfuscatedName("hc.j")
	public static class32 field1181 = class73.method593("Loaded title screen", true);

	@ObfuscatedName("hc.k")
	public static class32 field1182 = field1181;

	@ObfuscatedName("hc.a([Lec;B)Lec;")
	public static class32 method402(class32[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return class84.method655(arg0, arg0.length, 0);
	}

	@ObfuscatedName("hc.a(Ljava/awt/Component;I)V")
	public static void method403(Component arg0) {
		Method var1 = class25.field452;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(class38.field919);
		arg0.addFocusListener(class38.field919);
	}

	@ObfuscatedName("hc.a(B)V")
	public static void method404() {
		field1176 = null;
		field1179 = null;
		field1173 = null;
		field1181 = null;
		field1178 = null;
		field1174 = null;
		field1182 = null;
		field1175 = null;
	}

	@ObfuscatedName("hc.a(ILga;I)V")
	public static void method405(int arg0, class44 arg1) {
		if (class119.field2846 == null) {
			class126.method985(true, (byte) 0, 255, 255, null, 0);
			class88.field2047[arg0] = arg1;
		} else {
			class119.field2846.field1568 = arg0 * 8 + 5;
			int var2 = class119.field2846.method538();
			int var3 = class119.field2846.method538();
			arg1.method336(var3, var2);
		}
	}

	@ObfuscatedName("hc.a(III)I")
	public static int method406(int arg0, int arg1) {
		class107 var2 = (class107) class34.field709.method1196((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 >= 0 && var2.field2535.length > arg1) {
			return var2.field2535[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("hc.b(B)J")
	public static synchronized long method407() {
		long var0 = System.currentTimeMillis();
		if (var0 < class74.field1744) {
			class98.field2267 += class74.field1744 - var0;
		}
		class74.field1744 = var0;
		return class98.field2267 + var0;
	}

	@ObfuscatedName("hc.a(ILea;I)Lhb;")
	public static class51 method408(class30 arg0, int arg1) {
		return class47.method358(arg0, arg1) ? class94.method741() : null;
	}

	@ObfuscatedName("hc.a(BLea;)V")
	public static void method409(class30 arg0) {
		class91.field2086 = arg0;
	}

	@ObfuscatedName("hc.a(I)V")
	public static void method410() {
		class3.field43.method490();
	}
}
