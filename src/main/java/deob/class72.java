package deob;

@ObfuscatedName("kc")
public final class class72 {

	@ObfuscatedName("kc.a")
	public byte[] field1689;

	@ObfuscatedName("kc.b")
	public int field1690;

	@ObfuscatedName("kc.c")
	public int field1691;

	@ObfuscatedName("kc.d")
	public static class32 field1692 = class73.method593("Attack", true);

	@ObfuscatedName("kc.e")
	public static boolean field1693 = false;

	@ObfuscatedName("kc.g")
	public static int field1695 = 0;

	@ObfuscatedName("kc.h")
	public static class32 field1696 = class73.method593("Loading)3)3)3", true);

	@ObfuscatedName("kc.i")
	public int field1697;

	@ObfuscatedName("kc.j")
	public int field1698;

	@ObfuscatedName("kc.k")
	public static class32 field1699 = class73.method593("Bitte versuchen Sie es in ", true);

	@ObfuscatedName("kc.l")
	public static int field1700;

	@ObfuscatedName("kc.m")
	public static class44 field1701;

	@ObfuscatedName("kc.n")
	public int field1702;

	@ObfuscatedName("kc.o")
	public byte[] field1703;

	@ObfuscatedName("kc.p")
	public static class32 field1704 = field1692;

	@ObfuscatedName("kc.q")
	public static class32 field1705 = class73.method593("sich mit einer anderen Welt zu verbinden)3", true);

	@ObfuscatedName("kc.r")
	public static int field1706 = 0;

	@ObfuscatedName("kc.s")
	public int field1707;

	@ObfuscatedName("kc.t")
	public static class32 field1708 = field1696;

	@ObfuscatedName("kc.v")
	public int field1710;

	@ObfuscatedName("kc.a(I)V")
	public static void method588() {
		field1705 = null;
		field1699 = null;
		field1708 = null;
		field1704 = null;
		field1701 = null;
		field1696 = null;
		field1692 = null;
	}

	@ObfuscatedName("kc.a(IZ)V")
	public static void method589(int arg0) {
		class149.field3394 += arg0 * 128;
		if (class149.field3394 > class5.field99.length) {
			class149.field3394 -= class5.field99.length;
			int var1 = (int) (Math.random() * 12.0D);
			class71.method581(class74.field1752[var1]);
		}
		int var2 = 0;
		int var3 = arg0 * 128;
		int var4 = (256 - arg0) * 128;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = class43.field998[var2 + var3] - class5.field99[class5.field99.length - 1 & var2 + class149.field3394] * arg0 / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			class43.field998[var2++] = var6;
		}
		for (int var7 = 256 - arg0; var7 < 256; var7++) {
			int var8 = var7 * 128;
			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int) (Math.random() * 100.0D);
				if (var10 < 50 && var9 > 10 && var9 < 118) {
					class43.field998[var8 + var9] = 255;
				} else {
					class43.field998[var8 + var9] = 0;
				}
			}
		}
		if (class66.field1585 > 0) {
			class66.field1585 -= arg0 * 4;
		}
		if (class85.field1996 > 0) {
			class85.field1996 -= arg0 * 4;
		}
		if (class66.field1585 == 0 && class85.field1996 == 0) {
			int var11 = (int) ((double) (2000 / arg0) * Math.random());
			if (var11 == 0) {
				class66.field1585 = 1024;
			}
			if (var11 == 1) {
				class85.field1996 = 1024;
			}
		}
		for (int var12 = 0; var12 < 256 - arg0; var12++) {
			class81.field1868[var12] = class81.field1868[arg0 + var12];
		}
		for (int var13 = 256 - arg0; var13 < 256; var13++) {
			class81.field1868[var13] = (int) (Math.sin((double) class139.field3210 / 14.0D) * 16.0D + Math.sin((double) class139.field3210 / 15.0D) * 14.0D + Math.sin((double) class139.field3210 / 16.0D) * 12.0D);
			class139.field3210++;
		}
		int var14 = (arg0 + (class140.field3217 & 0x1)) / 2;
		class53.field1220 += arg0;
		if (var14 <= 0) {
			return;
		}
		for (int var15 = 0; var15 < class53.field1220 * 100; var15++) {
			int var16 = (int) (Math.random() * 128.0D) + 128;
			int var17 = (int) (Math.random() * 124.0D) + 2;
			class43.field998[(var16 << 7) + var17] = 192;
		}
		class53.field1220 = 0;
		for (int var18 = 0; var18 < 256; var18++) {
			int var19 = 0;
			int var20 = var18 * 128;
			for (int var21 = -var14; var21 < 128; var21++) {
				if (var21 + var14 < 128) {
					var19 += class43.field998[var14 + var20 + var21];
				}
				if (var21 - var14 - 1 >= 0) {
					var19 -= class43.field998[var20 + var21 - var14 - 1];
				}
				if (var21 >= 0) {
					class3.field44[var21 + var20] = var19 / (var14 * 2 + 1);
				}
			}
		}
		for (int var22 = 0; var22 < 128; var22++) {
			int var23 = 0;
			for (int var24 = -var14; var24 < 256; var24++) {
				int var25 = var24 * 128;
				if (var24 + var14 < 256) {
					var23 += class3.field44[var22 + var25 + var14 * 128];
				}
				if (var24 - var14 - 1 >= 0) {
					var23 -= class3.field44[var25 + var22 - var14 * 128 - 128];
				}
				if (var24 >= 0) {
					class43.field998[var22 + var25] = var23 / (var14 * 2 + 1);
				}
			}
		}
	}

	@ObfuscatedName("kc.a(Lea;Lec;IZILec;I)V")
	public static void method590(class30 arg0, class32 arg1, class32 arg2) {
		int var3 = arg0.method201(arg1);
		int var4 = arg0.method215(arg2, var3);
		class86.method667(arg0, 255, var4, var3);
	}
}
