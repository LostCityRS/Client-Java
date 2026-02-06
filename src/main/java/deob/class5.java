package deob;

@ObfuscatedName("ad")
public final class class5 {

	@ObfuscatedName("ad.a")
	public static class32 field83 = field90;

	@ObfuscatedName("ad.b")
	public static class32 field84 = field90;

	@ObfuscatedName("ad.c")
	public static class32 field85 = class73.method593("You can(Wt add yourself to your own friend list", true);

	@ObfuscatedName("ad.e")
	public static class32 field87 = class73.method593("<col=80ff00>", true);

	@ObfuscatedName("ad.f")
	public static class32 field88 = class73.method593("Diese Betatest)2Welt ist nur f-Ur eingeladene", true);

	@ObfuscatedName("ad.g")
	public static class36 field89;

	@ObfuscatedName("ad.h")
	public static class32 field90 = class73.method593("flash3:", true);

	@ObfuscatedName("ad.i")
	public static class32 field91 = class73.method593("Please remove ", true);

	@ObfuscatedName("ad.j")
	public static int field92 = -1;

	@ObfuscatedName("ad.k")
	public static class32 field93 = class73.method593("leuchten2:", true);

	@ObfuscatedName("ad.l")
	public static class32 field94 = field100;

	@ObfuscatedName("ad.m")
	public static class32 field95 = field91;

	@ObfuscatedName("ad.n")
	public static class32 field96 = field85;

	@ObfuscatedName("ad.o")
	public static class32 field97 = field91;

	@ObfuscatedName("ad.p")
	public static class32 field98 = class73.method593("Benutzeroberfl-=che geladen)3", true);

	@ObfuscatedName("ad.q")
	public static int[] field99;

	@ObfuscatedName("ad.r")
	public static class32 field100 = class73.method593("Choose Option", true);

	@ObfuscatedName("ad.t")
	public static int field102 = 1;

	@ObfuscatedName("ad.u")
	public static int[] field103 = new int[200];

	@ObfuscatedName("ad.w")
	public static class63 field105 = new class63(64);

	@ObfuscatedName("ad.z")
	public static class32 field108 = class73.method593("white:", true);

	@ObfuscatedName("ad.y")
	public static class32 field107 = field108;

	@ObfuscatedName("ad.A")
	public static class32 field109 = field108;

	@ObfuscatedName("ad.a(B)V")
	public static void method19() {
		field97 = null;
		field108 = null;
		field83 = null;
		field96 = null;
		field105 = null;
		field88 = null;
		field85 = null;
		field87 = null;
		field93 = null;
		field95 = null;
		field90 = null;
		field91 = null;
		field94 = null;
		field99 = null;
		field103 = null;
		field100 = null;
		field98 = null;
		field107 = null;
		field84 = null;
		field89 = null;
		field109 = null;
	}

	@ObfuscatedName("ad.a(Lda;B)V")
	public static void method20(class23 arg0) {
		int var1 = 0;
		if (arg0.field398 == 0) {
			var1 = class159.field3657.method1153(arg0.field401, arg0.field405, arg0.field420);
		}
		int var2 = 0;
		if (arg0.field398 == 1) {
			var1 = class159.field3657.method1131(arg0.field401, arg0.field405, arg0.field420);
		}
		if (arg0.field398 == 2) {
			var1 = class159.field3657.method1133(arg0.field401, arg0.field405, arg0.field420);
		}
		int var3 = -1;
		if (arg0.field398 == 3) {
			var1 = class159.field3657.method1134(arg0.field401, arg0.field405, arg0.field420);
		}
		int var4 = 0;
		if (var1 != 0) {
			var3 = var1 >> 14 & 0x7FFF;
			int var5 = class159.field3657.method1121(arg0.field401, arg0.field405, arg0.field420, var1);
			var2 = var5 & 0x1F;
			var4 = var5 >> 6 & 0x3;
		}
		arg0.field408 = var2;
		arg0.field410 = var4;
		arg0.field406 = var3;
	}

	@ObfuscatedName("ad.a(I)I")
	public static int method21() {
		int var0 = 3;
		if (class45.field1049 < 310) {
			int var1 = class105.field2494 >> 7;
			int var2 = class48.field1126 >> 7;
			if ((class3.field50[class43.field989][var1][var2] & 0x4) != 0) {
				var0 = class43.field989;
			}
			int var3 = class20.field373.field2747 >> 7;
			int var4 = class20.field373.field2698 >> 7;
			int var5;
			if (var1 < var3) {
				var5 = var3 - var1;
			} else {
				var5 = var1 - var3;
			}
			int var6;
			if (var2 < var4) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}
			if (var5 > var6) {
				int var7 = var6 * 65536 / var5;
				int var8 = 32768;
				while (var1 != var3) {
					if (var3 > var1) {
						var1++;
					} else if (var3 < var1) {
						var1--;
					}
					if ((class3.field50[class43.field989][var1][var2] & 0x4) != 0) {
						var0 = class43.field989;
					}
					var8 += var7;
					if (var8 >= 65536) {
						if (var4 > var2) {
							var2++;
						} else if (var4 < var2) {
							var2--;
						}
						if ((class3.field50[class43.field989][var1][var2] & 0x4) != 0) {
							var0 = class43.field989;
						}
						var8 -= 65536;
					}
				}
			} else {
				int var9 = var5 * 65536 / var6;
				int var10 = 32768;
				while (var4 != var2) {
					if (var4 > var2) {
						var2++;
					} else if (var2 > var4) {
						var2--;
					}
					var10 += var9;
					if ((class3.field50[class43.field989][var1][var2] & 0x4) != 0) {
						var0 = class43.field989;
					}
					if (var10 >= 65536) {
						if (var1 < var3) {
							var1++;
						} else if (var1 > var3) {
							var1--;
						}
						var10 -= 65536;
						if ((class3.field50[class43.field989][var1][var2] & 0x4) != 0) {
							var0 = class43.field989;
						}
					}
				}
			}
		}
		if ((class3.field50[class43.field989][class20.field373.field2747 >> 7][class20.field373.field2698 >> 7] & 0x4) != 0) {
			var0 = class43.field989;
		}
		return var0;
	}

	@ObfuscatedName("ad.a(II)Lhd;")
	public static class53 method22(int arg0) {
		class53 var1 = (class53) class44.field1014.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class151.field3454.method206(6, arg0);
		class53 var3 = new class53();
		var3.field1221 = arg0;
		if (var2 != null) {
			var3.method419(new class66(var2));
		}
		var3.method424();
		if (var3.field1198) {
			var3.field1219 = false;
			var3.field1235 = 0;
		}
		class44.field1014.method484((long) arg0, var3);
		return var3;
	}
}
