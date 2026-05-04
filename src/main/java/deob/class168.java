package deob;

@ObfuscatedName("pe")
public final class class168 extends class67 {

	@ObfuscatedName("pe.t")
	public static final class92 field3228 = new class92(64);

	@ObfuscatedName("pe.u")
	public int field3229;

	@ObfuscatedName("pe.B")
	public static final class24 field3236 = new class24(50);

	@ObfuscatedName("pe.C")
	public static final class88 field3237 = class208.method1423(105, "document)3cookie=(R");

	@ObfuscatedName("pe.D")
	public static final class88[] field3238 = new class88[200];

	@ObfuscatedName("pe.F")
	public static final int[] field3240 = new int[] { 1, -1, -1, 1 };

	@ObfuscatedName("pe.E")
	public static final class88 field3239 = class208.method1423(105, "Startseite auf (WSpielkonto wiederherstellen(W)3");

	@ObfuscatedName("pe.J")
	public static final class88 field3244 = class208.method1423(105, "<col=ff0000>");

	@ObfuscatedName("pe.G")
	public static final class88 field3241 = class208.method1423(105, "Spieler kann nicht gefunden werden: ");

	@ObfuscatedName("pe.I")
	public static final class88 field3243 = class208.method1423(105, "Zugewiesener Speicher)3");

	@ObfuscatedName("pe.K")
	public static final int[] field3245 = new int[2000];

	@ObfuscatedName("pe.A")
	public boolean field3235 = false;

	@ObfuscatedName("pe.y")
	public int field3233;

	@ObfuscatedName("pe.H")
	public static int field3242;

	@ObfuscatedName("pe.L")
	public static int field3246;

	@ObfuscatedName("pe.a(BI)Lsi;")
	public static class205 method1150(int arg0) {
		class205 var1 = (class205) class131.field2447.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2;
		if (arg0 >= 32768) {
			var2 = class36.field633.method939(arg0 & 0x7FFF, 1);
		} else {
			var2 = class78.field1417.method939(arg0, 1);
		}
		class205 var3 = new class205();
		if (var2 != null) {
			var3.method1411(new class46(var2));
		}
		if (arg0 >= 32768) {
			var3.method1415();
		}
		class131.field2447.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("pe.c(B)V")
	public static void method1151() {
		class230.field4312.method34();
		int var0 = class230.field4312.method28(1);
		if (var0 == 0) {
			return;
		}
		int var1 = class230.field4312.method28(2);
		if (var1 == 0) {
			class139.field2579[class192.field3702++] = 2047;
		} else if (var1 == 1) {
			int var2 = class230.field4312.method28(3);
			class240.field4456.method1476(false, var2);
			int var3 = class230.field4312.method28(1);
			if (var3 == 1) {
				class139.field2579[class192.field3702++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = class230.field4312.method28(3);
			class240.field4456.method1476(true, var4);
			int var5 = class230.field4312.method28(3);
			class240.field4456.method1476(true, var5);
			int var6 = class230.field4312.method28(1);
			if (var6 == 1) {
				class139.field2579[class192.field3702++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = class230.field4312.method28(1);
			class149.field2907 = class230.field4312.method28(2);
			int var8 = class230.field4312.method28(1);
			if (var8 == 1) {
				class139.field2579[class192.field3702++] = 2047;
			}
			int var9 = class230.field4312.method28(7);
			int var10 = class230.field4312.method28(7);
			class240.field4456.method1474(var7 == 1, var9, var10);
		}
	}

	@ObfuscatedName("pe.a(III)Li;")
	public static class88 method1152(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return field3244;
		} else if (var2 < -6) {
			return class186.field3636;
		} else if (var2 < -3) {
			return class2.field18;
		} else if (var2 < 0) {
			return class31.field502;
		} else if (var2 > 9) {
			return class12.field182;
		} else if (var2 > 6) {
			return class33.field553;
		} else if (var2 > 3) {
			return class231.field4338;
		} else if (var2 > 0) {
			return class136.field2526;
		} else {
			return class8.field120;
		}
	}

	@ObfuscatedName("pe.a(ZB[B)Ljava/lang/Object;")
	public static Object method1153(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !class11.field166) {
			try {
				class1 var1 = (class1) Class.forName("qi").getDeclaredConstructor().newInstance();
				var1.method4(arg0);
				return var1;
			} catch (Throwable var2) {
				class11.field166 = true;
			}
		}
		return arg0;
	}
}
