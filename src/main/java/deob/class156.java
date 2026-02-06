package deob;

@ObfuscatedName("wc")
public final class class156 {

	@ObfuscatedName("wc.b")
	public static class51[] field3556;

	@ObfuscatedName("wc.d")
	public static class32 field3558 = class73.method593("To play on this world move to a free area first", true);

	@ObfuscatedName("wc.g")
	public static class32 field3561 = field3566;

	@ObfuscatedName("wc.h")
	public class146 field3562;

	@ObfuscatedName("wc.i")
	public static class32 field3563 = field3558;

	@ObfuscatedName("wc.j")
	public final int field3564;

	@ObfuscatedName("wc.k")
	public static class51 field3565;

	@ObfuscatedName("wc.l")
	public static class32 field3566 = class73.method593("Could not complete login)3", true);

	@ObfuscatedName("wc.m")
	public long field3567;

	@ObfuscatedName("wc.r")
	public static class32 field3572 = class73.method593("Das ist eine Mitglieder)2Welt(Q", true);

	@ObfuscatedName("wc.s")
	public static class32 field3573 = class73.method593("Okay", true);

	@ObfuscatedName("wc.t")
	public final class146[] field3574;

	@ObfuscatedName("wc.u")
	public static byte[][] field3575 = new byte[50][];

	@ObfuscatedName("wc.v")
	public int field3576 = 0;

	@ObfuscatedName("wc.w")
	public class146 field3577;

	@ObfuscatedName("wc.a(Z)V")
	public static void method1197() {
		class158.field3612.method351();
		int var0 = class158.field3612.method352(1);
		if (var0 == 0) {
			return;
		}
		int var1 = class158.field3612.method352(2);
		if (var1 == 0) {
			class62.field1418[class61.field1352++] = 2047;
		} else if (var1 == 1) {
			int var2 = class158.field3612.method352(3);
			class20.field373.method900(var2, false);
			int var3 = class158.field3612.method352(1);
			if (var3 == 1) {
				class62.field1418[class61.field1352++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = class158.field3612.method352(3);
			class20.field373.method900(var4, true);
			int var5 = class158.field3612.method352(3);
			class20.field373.method900(var5, true);
			int var6 = class158.field3612.method352(1);
			if (var6 == 1) {
				class62.field1418[class61.field1352++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = class158.field3612.method352(7);
			int var8 = class158.field3612.method352(7);
			int var9 = class158.field3612.method352(1);
			if (var9 == 1) {
				class62.field1418[class61.field1352++] = 2047;
			}
			class43.field989 = class158.field3612.method352(2);
			int var10 = class158.field3612.method352(1);
			class20.field373.method902(var7, var10 == 1, var8);
		}
	}

	@ObfuscatedName("wc.a(B)V")
	public static void method1198() {
		field3563 = null;
		field3573 = null;
		field3565 = null;
		field3575 = null;
		field3566 = null;
		field3572 = null;
		field3558 = null;
		field3561 = null;
		field3556 = null;
	}

	@ObfuscatedName("wc.a(IBII)Z")
	public static boolean method1200(int arg0, int arg1, int arg2) {
		int var3 = arg2 >> 14 & 0x7FFF;
		int var4 = class159.field3657.method1121(class43.field989, arg1, arg0, arg2);
		if (var4 == -1) {
			return false;
		}
		int var5 = var4 & 0x1F;
		int var6 = var4 >> 6 & 0x3;
		if (var5 == 10 || var5 == 11 || var5 == 22) {
			class53 var7 = class5.method22(var3);
			int var8;
			int var9;
			if (var6 == 0 || var6 == 2) {
				var8 = var7.field1233;
				var9 = var7.field1222;
			} else {
				var8 = var7.field1222;
				var9 = var7.field1233;
			}
			int var10 = var7.field1192;
			if (var6 != 0) {
				var10 = (var10 << var6 & 0xF) + (var10 >> 4 - var6);
			}
			class94.method747(true, 0, class20.field373.field2736[0], 0, var8, arg1, class20.field373.field2759[0], var10, arg0, var9, 2);
		} else {
			class94.method747(true, var6, class20.field373.field2736[0], var5 + 1, 0, arg1, class20.field373.field2759[0], 0, arg0, 0, 2);
		}
		class27.field499 = class9.field166;
		class154.field3545 = class66.field1589;
		class154.field3543 = 0;
		class135.field3147 = 2;
		return true;
	}

	public class156(int arg0) {
		this.field3574 = new class146[arg0];
		this.field3564 = arg0;
		for (int var2 = 0; var2 < arg0; var2++) {
			class146 var3 = this.field3574[var2] = new class146();
			var3.field3320 = var3;
			var3.field3316 = var3;
		}
	}

	@ObfuscatedName("wc.a(JB)Lv;")
	public class146 method1196(long arg0) {
		this.field3567 = arg0;
		class146 var3 = this.field3574[(int) (arg0 & (long) (this.field3564 - 1))];
		for (this.field3562 = var3.field3320; this.field3562 != var3; this.field3562 = this.field3562.field3320) {
			if (arg0 == this.field3562.field3324) {
				class146 var4 = this.field3562;
				this.field3562 = this.field3562.field3320;
				return var4;
			}
		}
		this.field3562 = null;
		return null;
	}

	@ObfuscatedName("wc.a(I)Lv;")
	public class146 method1199() {
		if (this.field3576 > 0 && this.field3574[this.field3576 - 1] != this.field3577) {
			class146 var1 = this.field3577;
			this.field3577 = var1.field3320;
			return var1;
		}
		while (this.field3576 < this.field3564) {
			class146 var2 = this.field3574[this.field3576++].field3320;
			if (var2 != this.field3574[this.field3576 - 1]) {
				this.field3577 = var2.field3320;
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("wc.a(ZJLv;)V")
	public void method1201(long arg0, class146 arg1) {
		if (arg1.field3316 != null) {
			arg1.method1091();
		}
		class146 var4 = this.field3574[(int) ((long) (this.field3564 - 1) & arg0)];
		arg1.field3320 = var4;
		arg1.field3316 = var4.field3316;
		arg1.field3316.field3320 = arg1;
		arg1.field3320.field3316 = arg1;
		arg1.field3324 = arg0;
	}

	@ObfuscatedName("wc.b(B)Lv;")
	public class146 method1202(byte arg0) {
		if (this.field3562 == null) {
			return null;
		}
		if (arg0 != -36) {
			method1198();
		}
		class146 var2 = this.field3574[(int) ((long) (this.field3564 - 1) & this.field3567)];
		while (this.field3562 != var2) {
			if (this.field3562.field3324 == this.field3567) {
				class146 var3 = this.field3562;
				this.field3562 = this.field3562.field3320;
				return var3;
			}
			this.field3562 = this.field3562.field3320;
		}
		this.field3562 = null;
		return null;
	}

	@ObfuscatedName("wc.c(B)Lv;")
	public class146 method1203() {
		this.field3576 = 0;
		return this.method1199();
	}
}
