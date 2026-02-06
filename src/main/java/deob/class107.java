package deob;

import java.awt.Canvas;

@ObfuscatedName("pc")
public final class class107 extends class146 {

	@ObfuscatedName("pc.r")
	public static int field2532 = 0;

	@ObfuscatedName("pc.s")
	public static class32 field2533 = class73.method593(" loggt sich ein)3", true);

	@ObfuscatedName("pc.u")
	public int[] field2535 = new int[1];

	@ObfuscatedName("pc.v")
	public static int field2536;

	@ObfuscatedName("pc.w")
	public int[] field2537 = new int[] { -1 };

	@ObfuscatedName("pc.A")
	public static class32 field2541 = class73.method593("Your ignore list is full)3 Max of 100 users)3", true);

	@ObfuscatedName("pc.B")
	public static int field2542 = 0;

	@ObfuscatedName("pc.C")
	public static class32 field2543 = class73.method593("Verbindung mit Update)2Server)3)3)3", true);

	@ObfuscatedName("pc.D")
	public static class32 field2544 = class73.method593("Bitte starten Sie eine Mitgliedschaft", true);

	@ObfuscatedName("pc.z")
	public static boolean[] field2540 = new boolean[112];

	@ObfuscatedName("pc.G")
	public static class32 field2547 = class73.method593("Ihr Spielkonto wurde deaktiviert)3", true);

	@ObfuscatedName("pc.E")
	public static class32 field2545 = field2541;

	@ObfuscatedName("pc.y")
	public static Canvas field2539;

	@ObfuscatedName("pc.c(II)V")
	public static void method863(int arg0) {
		for (class38 var1 = (class38) class115.field2768.method1203(); var1 != null; var1 = (class38) class115.field2768.method1199()) {
			if ((long) arg0 == (var1.field3324 >> 48 & 0xFFFFL)) {
				var1.method1091();
			}
		}
	}

	@ObfuscatedName("pc.a(B)V")
	public static void method864() {
		class132.field3034 = new int[33];
		class36.field854 = new int[33];
		class2.field27 = new int[151];
		class98.field2273 = new int[151];
		for (int var0 = 0; var0 < 33; var0++) {
			int var1 = 999;
			int var2 = 0;
			for (int var3 = 0; var3 < 34; var3++) {
				if (class20.field369.field1164[class20.field369.field1167 * var0 + var3] == 0) {
					if (var1 == 999) {
						var1 = var3;
					}
				} else if (var1 != 999) {
					var2 = var3;
					break;
				}
			}
			class36.field854[var0] = var1;
			class132.field3034[var0] = var2 - var1;
		}
		for (int var4 = 5; var4 < 156; var4++) {
			int var5 = 999;
			int var6 = 0;
			for (int var7 = 25; var7 < 172; var7++) {
				if (class20.field369.field1164[var7 + class20.field369.field1167 * var4] == 0 && (var7 > 34 || var4 > 34)) {
					if (var5 == 999) {
						var5 = var7;
					}
				} else if (var5 != 999) {
					var6 = var7;
					break;
				}
			}
			class98.field2273[var4 - 5] = var5 - 25;
			class2.field27[var4 - 5] = var6 - var5;
		}
	}

	@ObfuscatedName("pc.a([BIIII[Lqf;I)V")
	public static void method865(byte[] arg0, int arg1, int arg2, int arg3, class117[] arg4, int arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (var7 + arg5 > 0 && var7 + arg5 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
						arg4[var6].field2811[var7 + arg5][var8 + arg2] &= 0xFEFFFFFF;
					}
				}
			}
		}
		class66 var9 = new class66(arg0);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					class134.method1025(var9, var10, arg1, 0, arg2 + var12, arg5 + var11, arg3);
				}
			}
		}
	}
}
