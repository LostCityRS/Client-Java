package deob;

import java.io.IOException;
import java.util.Calendar;

@ObfuscatedName("v")
public class class146 {

	@ObfuscatedName("v.d")
	public static Calendar field3311 = Calendar.getInstance();

	@ObfuscatedName("v.h")
	public static boolean field3315 = false;

	@ObfuscatedName("v.i")
	public class146 field3316;

	@ObfuscatedName("v.j")
	public static class44 field3317;

	@ObfuscatedName("v.k")
	public static boolean field3318 = false;

	@ObfuscatedName("v.l")
	public static int field3319 = -1;

	@ObfuscatedName("v.m")
	public class146 field3320;

	@ObfuscatedName("v.n")
	public static int field3321;

	@ObfuscatedName("v.o")
	public static class32 field3322 = class73.method593("welle2:", true);

	@ObfuscatedName("v.p")
	public static int field3323 = 0;

	@ObfuscatedName("v.q")
	public long field3324;

	@ObfuscatedName("v.a(II)Lj;")
	public static class62 method1092(int arg0) {
		class62 var1 = (class62) class82.field1914.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class41.field962.method206(10, arg0);
		class62 var3 = new class62();
		var3.field1399 = arg0;
		if (var2 != null) {
			var3.method475(new class66(var2));
		}
		var3.method472();
		if (var3.field1388 != -1) {
			var3.method481(method1092(var3.field1411), method1092(var3.field1388));
		}
		if (!class11.field193 && var3.field1392) {
			var3.field1410 = null;
			var3.field1425 = 0;
			var3.field1429 = class38.field903;
			var3.field1428 = null;
		}
		class82.field1914.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("v.a(Ljd;B)V")
	public static void method1093(class66 arg0) {
		byte[] var1 = new byte[24];
		if (class133.field3047 != null) {
			try {
				class133.field3047.method1184(0L);
				int var2 = 0;
				class133.field3047.method1182(var1);
				while (var2 < 24 && var1[var2] == 0) {
					var2++;
				}
				if (var2 >= 24) {
					throw new IOException();
				}
			} catch (Exception var4) {
				for (int var3 = 0; var3 < 24; var3++) {
					var1[var3] = -1;
				}
			}
		}
		arg0.method543(24, var1);
	}

	@ObfuscatedName("v.c(I)V")
	public static void method1095() {
		field3322 = null;
		field3317 = null;
		field3311 = null;
	}

	@ObfuscatedName("v.a(I)V")
	public final void method1091() {
		if (this.field3316 != null) {
			this.field3316.field3320 = this.field3320;
			this.field3320.field3316 = this.field3316;
			this.field3316 = null;
			this.field3320 = null;
		}
	}

	@ObfuscatedName("v.b(I)Z")
	public final boolean method1094() {
		return this.field3316 != null;
	}
}
