package deob;

@ObfuscatedName("me")
public class class136 extends class67 {

	@ObfuscatedName("me.w")
	public static final class88 field2526 = class208.method1423(105, "<col=c0ff00>");

	@ObfuscatedName("me.z")
	public static final class88 field2529 = class208.method1423(105, "<col=ff9040>");

	@ObfuscatedName("me.B")
	public static int field2531 = 2;

	@ObfuscatedName("me.x")
	public static short field2527 = 1;

	@ObfuscatedName("me.y")
	public class136 field2528;

	@ObfuscatedName("me.A")
	public class136 field2530;

	@ObfuscatedName("me.b(I)V")
	public static void method904() {
		int var0 = class54.field1011.method158(class25.field398);
		for (int var1 = 0; var1 < class203.field3862; var1++) {
			int var2 = class54.field1011.method158(class78.method525(var1));
			if (var2 > var0) {
				var0 = var2;
			}
		}
		var0 += 8;
		class237.field4421 = var0;
		class108.field1958 = true;
		class47.field889 = class203.field3862 * 15 + 22;
		int var3 = class203.field3862 * 15 + 21;
		int var4 = class172.field3339;
		if (var3 + var4 > class145.field2725) {
			var4 = class145.field2725 - var3;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		int var5 = class226.field4239 - var0 / 2;
		if (var0 + var5 > class222.field4192) {
			var5 = class222.field4192 - var0;
		}
		class234.field4383 = var4;
		if (var5 < 0) {
			var5 = 0;
		}
		class86.field1549 = var5;
	}

	@ObfuscatedName("me.c(B)V")
	public static void method905() {
		int var0 = class37.field666 >> 7;
		class207.field3930 &= 0x7FF;
		int var1 = class233.field4366 >> 7;
		int var2 = 0;
		if (class64.field1173 < 128) {
			class64.field1173 = 128;
		}
		if (class64.field1173 > 383) {
			class64.field1173 = 383;
		}
		int var3 = class239.method1584(class37.field666, class233.field4366, class149.field2907);
		if (var0 > 3 && var1 > 3 && var0 < 100 && var1 < 100) {
			for (int var4 = var0 - 4; var4 <= var0 + 4; var4++) {
				for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
					int var6 = class149.field2907;
					if (var6 < 3 && (class116.field2098[1][var4][var5] & 0x2) == 2) {
						var6++;
					}
					int var7 = var3 - class62.field1137[var6][var4][var5];
					if (var2 < var7) {
						var2 = var7;
					}
				}
			}
		}
		int var8 = var2 * 192;
		if (var8 > 98048) {
			var8 = 98048;
		}
		if (var8 < 32768) {
			var8 = 32768;
		}
		if (class71.field1328 < var8) {
			class71.field1328 += (var8 - class71.field1328) / 24;
		} else if (var8 < class71.field1328) {
			class71.field1328 += (var8 - class71.field1328) / 80;
		}
	}

	@ObfuscatedName("me.a(IZ)V")
	public static void method906(int arg0) {
		if (class29.field482 == null || class29.field482.length < arg0) {
			class29.field482 = new int[arg0];
		}
	}

	@ObfuscatedName("me.c(I)V")
	public final void method907() {
		if (this.field2530 != null) {
			this.field2530.field2528 = this.field2528;
			this.field2528.field2530 = this.field2530;
			this.field2528 = null;
			this.field2530 = null;
		}
	}
}
