package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("he")
public final class class54 extends Canvas {

	@ObfuscatedName("he.a")
	public static class51[] field1264;

	@ObfuscatedName("he.b")
	public static class32 field1265 = class73.method593("oder ung-Ultiges Passwort)3", true);

	@ObfuscatedName("he.c")
	public static class32 field1266 = class73.method593("Ung-Ultiger Benutzername", true);

	@ObfuscatedName("he.f")
	public static class32 field1269 = class73.method593("Checking for updates )2 ", true);

	@ObfuscatedName("he.h")
	public static class32 field1271 = class73.method593("ams", true);

	@ObfuscatedName("he.i")
	public static class32 field1272 = class73.method593("Registrierter Benutzer", true);

	@ObfuscatedName("he.j")
	public static class32 field1273 = class73.method593("This computers address has been blocked", true);

	@ObfuscatedName("he.k")
	public static class32 field1274 = field1269;

	@ObfuscatedName("he.l")
	public static class32 field1275 = field1273;

	@ObfuscatedName("he.m")
	public static int field1276 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("he.o")
	public static class96 field1278;

	@ObfuscatedName("he.p")
	public final Component field1279;

	@ObfuscatedName("he.q")
	public static short[][] field1280 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@ObfuscatedName("he.s")
	public static int field1282 = 0;

	@ObfuscatedName("he.a(II)V")
	public static void method425(int arg0) {
		if (class134.field3114 == arg0) {
			return;
		}
		if (class134.field3114 == 0) {
			class94.method745();
		}
		if (arg0 == 20 || arg0 == 40) {
			class132.field3033 = 0;
			class39.field938 = 0;
			class52.field1177 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && class80.field1840 != null) {
			class80.field1840.method52();
			class80.field1840 = null;
		}
		if (class134.field3114 == 25) {
			class53.field1208 = 1;
			class37.field883 = 1;
			class119.field2839 = 0;
			class37.field879 = 0;
			class152.field3487 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			class112.method881(class72.field1701, class30.field572, class107.field2539);
		} else {
			class23.method167();
		}
		class134.field3114 = arg0;
	}

	@ObfuscatedName("he.a(JI)V")
	public static void method426(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			class73.method596(arg0 - 1L);
			class73.method596(1L);
		} else {
			class73.method596(arg0);
		}
	}

	@ObfuscatedName("he.a(Z[B)V")
	public static void method427(byte[] arg0) {
		class66 var1 = new class66(arg0);
		var1.field1568 = arg0.length - 2;
		class92.field2110 = var1.method531();
		class126.field2925 = new int[class92.field2110];
		class70.field1638 = new int[class92.field2110];
		class34.field719 = new int[class92.field2110];
		class147.field3344 = new byte[class92.field2110][];
		class74.field1746 = new int[class92.field2110];
		var1.field1568 = arg0.length - class92.field2110 * 8 - 7;
		class152.field3506 = var1.method531();
		class128.field2965 = var1.method531();
		int var2 = (var1.method532() & 0xFF) + 1;
		for (int var3 = 0; var3 < class92.field2110; var3++) {
			class70.field1638[var3] = var1.method531();
		}
		for (int var4 = 0; var4 < class92.field2110; var4++) {
			class74.field1746[var4] = var1.method531();
		}
		for (int var5 = 0; var5 < class92.field2110; var5++) {
			class126.field2925[var5] = var1.method531();
		}
		for (int var6 = 0; var6 < class92.field2110; var6++) {
			class34.field719[var6] = var1.method531();
		}
		var1.field1568 = arg0.length - class92.field2110 * 8 - (var2 + -1) * 3 - 7;
		class31.field616 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			class31.field616[var7] = var1.method517();
			if (class31.field616[var7] == 0) {
				class31.field616[var7] = 1;
			}
		}
		var1.field1568 = 0;
		for (int var8 = 0; var8 < class92.field2110; var8++) {
			int var9 = class126.field2925[var8];
			int var10 = class34.field719[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			class147.field3344[var8] = var12;
			int var13 = var1.method532();
			if (var13 == 0) {
				for (int var14 = 0; var14 < var11; var14++) {
					var12[var14] = var1.method544();
				}
			} else if (var13 == 1) {
				for (int var15 = 0; var15 < var9; var15++) {
					for (int var16 = 0; var16 < var10; var16++) {
						var12[var15 + var9 * var16] = var1.method544();
					}
				}
			}
		}
	}

	@ObfuscatedName("he.a(B[Lf;I)V")
	public static void method428(class36[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			class36 var3 = arg0[var2];
			if (var3 != null) {
				if (var3.field755 == 0) {
					if (var3.field754 != null) {
						method428(var3.field754, arg1);
					}
					class144 var4 = (class144) class109.field2571.method1196((long) var3.field743);
					if (var4 != null) {
						class154.method1192(var4.field3280, arg1);
					}
				}
				if (arg1 == 0 && var3.field758 != null) {
					class12 var5 = new class12();
					var5.field208 = var3.field758;
					var5.field209 = var3;
					class158.method1222(var5);
				}
				if (arg1 == 1 && var3.field795 != null) {
					if (var3.field828 >= 0) {
						class36 var6 = class128.method991(var3.field743);
						if (var6 == null || var6.field754 == null || var6.field754.length <= var3.field828 || var6.field754[var3.field828] != var3) {
							continue;
						}
					}
					class12 var7 = new class12();
					var7.field208 = var3.field795;
					var7.field209 = var3;
					class158.method1222(var7);
				}
			}
		}
	}

	@ObfuscatedName("he.a(I)V")
	public static void method429() {
		field1275 = null;
		field1271 = null;
		field1265 = null;
		field1273 = null;
		field1264 = null;
		field1272 = null;
		field1266 = null;
		field1274 = null;
		field1278 = null;
		field1269 = null;
		field1280 = null;
	}

	public class54(Component arg0) {
		this.field1279 = arg0;
	}

	@Override
	public void paint(Graphics arg0) {
		this.field1279.paint(arg0);
	}

	@Override
	public void update(Graphics arg0) {
		this.field1279.update(arg0);
	}
}
