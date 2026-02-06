package deob;

import java.awt.Component;
import java.math.BigInteger;

@ObfuscatedName("jb")
public final class class64 {

	@ObfuscatedName("jb.a")
	public static class32 field1477 = class73.method593(")3", true);

	@ObfuscatedName("jb.d")
	public static class63 field1480 = new class63(100);

	@ObfuscatedName("jb.f")
	public static class32 field1482 = class73.method593("Press (Wrecover a locked account(W on front page)3", true);

	@ObfuscatedName("jb.h")
	public static class32 field1484 = field1482;

	@ObfuscatedName("jb.j")
	public static BigInteger field1486 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("jb.k")
	public static class32 field1487 = class73.method593("p12_full", true);

	@ObfuscatedName("jb.l")
	public static class44 field1488;

	@ObfuscatedName("jb.m")
	public static class32 field1489 = class73.method593("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", true);

	@ObfuscatedName("jb.o")
	public static class32 field1491 = class73.method593("No response from server)3", true);

	@ObfuscatedName("jb.n")
	public static class32 field1490 = field1491;

	@ObfuscatedName("jb.p")
	public static class32 field1492 = class73.method593(")3runescape)3com", true);

	@ObfuscatedName("jb.q")
	public static class32 field1493 = class73.method593("<col=c0ff00>", true);

	@ObfuscatedName("jb.r")
	public static int field1494 = 0;

	@ObfuscatedName("jb.a(ZI)Lec;")
	public static class32 method491(int arg0) {
		class32 var1 = new class32();
		var1.field618 = new byte[arg0];
		var1.field674 = 0;
		return var1;
	}

	@ObfuscatedName("jb.a(Z)V")
	public static void method492() {
		field1486 = null;
		field1489 = null;
		field1490 = null;
		field1480 = null;
		field1482 = null;
		field1484 = null;
		field1488 = null;
		field1487 = null;
		field1492 = null;
		field1477 = null;
		field1493 = null;
		field1491 = null;
	}

	@ObfuscatedName("jb.a(II)V")
	public static void method493(int arg0) {
		if (arg0 == -1 || !class28.method192(arg0)) {
			return;
		}
		class36[] var1 = class79.field1825[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class36 var3 = var1[var2];
			if (var3.field867 != null) {
				class12 var4 = new class12();
				var4.field209 = var3;
				var4.field208 = var3.field867;
				class158.method1222(var4);
			}
		}
	}

	@ObfuscatedName("jb.a(Ldc;IIBLjava/awt/Component;)Lqc;")
	public static class114 method494(class25 arg0, int arg1, int arg2, Component arg3) {
		if (class139.field3211 == 0) {
			throw new IllegalStateException();
		}
		try {
			class114 var4 = (class114) Class.forName("md").getDeclaredConstructor().newInstance();
			var4.field2679 = arg2;
			var4.field2656 = new int[(class56.field1310 ? 2 : 1) * 256];
			var4.method141(arg3);
			var4.field2680 = (arg2 & 0xFFFFFC00) + 1024;
			if (var4.field2680 > 16384) {
				var4.field2680 = 16384;
			}
			var4.method143(var4.field2680);
			if (class32.field652 > 0 && class132.field3031 == null) {
				class132.field3031 = new class27();
				class132.field3031.field485 = arg0;
				arg0.method175(class32.field652, class132.field3031, 117);
			}
			if (class132.field3031 != null) {
				if (class132.field3031.field487[arg1] != null) {
					throw new IllegalArgumentException();
				}
				class132.field3031.field487[arg1] = var4;
			}
			return var4;
		} catch (Throwable var7) {
			try {
				class21 var5 = new class21(arg0, arg1);
				var5.field2679 = arg2;
				var5.field2656 = new int[(class56.field1310 ? 2 : 1) * 256];
				var5.method141(arg3);
				var5.field2680 = 16384;
				var5.method143(var5.field2680);
				if (class32.field652 > 0 && class132.field3031 == null) {
					class132.field3031 = new class27();
					class132.field3031.field485 = arg0;
					arg0.method175(class32.field652, class132.field3031, 112);
				}
				if (class132.field3031 != null) {
					if (class132.field3031.field487[arg1] != null) {
						throw new IllegalArgumentException();
					}
					class132.field3031.field487[arg1] = var5;
				}
				return var5;
			} catch (Throwable var6) {
				return new class114();
			}
		}
	}
}
