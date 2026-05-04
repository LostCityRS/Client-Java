package deob;

@ObfuscatedName("w")
public final class class239 {

	@ObfuscatedName("w.a")
	public static final class88 field4434 = class208.method1423(105, "weiss:");

	@ObfuscatedName("w.b")
	public int field4435;

	@ObfuscatedName("w.f")
	public int field4439;

	@ObfuscatedName("w.g")
	public long field4440;

	@ObfuscatedName("w.i")
	public static final class88 field4442 = class208.method1423(105, "Keine Antwort vom Anmelde)2Server)3");

	@ObfuscatedName("w.j")
	public class145 field4443;

	@ObfuscatedName("w.k")
	public int field4444;

	@ObfuscatedName("w.m")
	public class145 field4446;

	@ObfuscatedName("w.n")
	public static final class108[] field4447 = new class108[100];

	@ObfuscatedName("w.o")
	public class145 field4448;

	@ObfuscatedName("w.p")
	public static int field4449 = 0;

	@ObfuscatedName("w.q")
	public static final class88 field4450 = class208.method1423(105, "RuneScape wird geladen )2 bitte warten)3)3)3");

	@ObfuscatedName("w.r")
	public int field4451;

	@ObfuscatedName("w.a(B)V")
	public static void method1577() {
		int var0 = class135.field2512 * 128 + 64;
		int var1 = class171.field3327 * 128 + 64;
		int var2 = method1584(var0, var1, class149.field2907) - class70.field1264;
		if (class79.field1428 < var0) {
			class79.field1428 += class160.field3093 * (var0 - class79.field1428) / 1000 + class246.field4506;
			if (var0 < class79.field1428) {
				class79.field1428 = var0;
			}
		}
		if (var1 > class184.field3608) {
			class184.field3608 += (var1 - class184.field3608) * class160.field3093 / 1000 + class246.field4506;
			if (var1 < class184.field3608) {
				class184.field3608 = var1;
			}
		}
		if (var0 < class79.field1428) {
			class79.field1428 -= (class79.field1428 - var0) * class160.field3093 / 1000 + class246.field4506;
			if (var0 > class79.field1428) {
				class79.field1428 = var0;
			}
		}
		int var3 = class46.field848 * 128 + 64;
		if (class184.field3608 > var1) {
			class184.field3608 -= class246.field4506 + class160.field3093 * (class184.field3608 - var1) / 1000;
			if (class184.field3608 < var1) {
				class184.field3608 = var1;
			}
		}
		if (class108.field1954 < var2) {
			class108.field1954 += class160.field3093 * (var2 - class108.field1954) / 1000 + class246.field4506;
			if (class108.field1954 > var2) {
				class108.field1954 = var2;
			}
		}
		int var4 = class23.field368 * 128 + 64;
		if (var2 < class108.field1954) {
			class108.field1954 -= class246.field4506 + (class108.field1954 - var2) * class160.field3093 / 1000;
			if (class108.field1954 < var2) {
				class108.field1954 = var2;
			}
		}
		int var5 = method1584(var3, var4, class149.field2907) - class66.field1200;
		int var6 = var3 - class79.field1428;
		int var7 = var5 - class108.field1954;
		int var8 = var4 - class184.field3608;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
		if (var10 < 128) {
			var10 = 128;
		}
		int var12 = var11 - class170.field3257;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var10 > 383) {
			var10 = 383;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (class207.field3934 < var10) {
			class207.field3934 += (var10 - class207.field3934) * class146.field2742 / 1000 + class9.field130;
			if (class207.field3934 > var10) {
				class207.field3934 = var10;
			}
		}
		if (var12 > 0) {
			class170.field3257 += class146.field2742 * var12 / 1000 + class9.field130;
			class170.field3257 &= 0x7FF;
		}
		if (var12 < 0) {
			class170.field3257 -= class9.field130 + class146.field2742 * -var12 / 1000;
			class170.field3257 &= 0x7FF;
		}
		if (class207.field3934 > var10) {
			class207.field3934 -= (class207.field3934 - var10) * class146.field2742 / 1000 + class9.field130;
			if (class207.field3934 < var10) {
				class207.field3934 = var10;
			}
		}
		int var13 = var11 - class170.field3257;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
			class170.field3257 = var11;
		}
	}

	@ObfuscatedName("w.a(I)V")
	public static void method1578() {
		class247.field4528 = null;
		class67.field1218 = null;
		class135.field2510 = null;
		class116.field2104 = null;
		class27.field456 = null;
		class102.field1851 = null;
	}

	@ObfuscatedName("w.a(II)Lq;")
	public static class174 method1579(int arg0) {
		int var1 = arg0 >> 16;
		int var2 = arg0 & 0xFFFF;
		if (class78.field1418[var1] == null || class78.field1418[var1][var2] == null) {
			boolean var3 = class211.method1445(var1);
			if (!var3) {
				return null;
			}
		}
		return class78.field1418[var1][var2];
	}

	@ObfuscatedName("w.a(III)Z")
	public static boolean method1581(int arg0, int arg1, int arg2) {
		int var3 = class238.field4429[arg0][arg1][arg2];
		if (var3 == -class143.field2627) {
			return false;
		} else if (var3 == class143.field2627) {
			return true;
		} else {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			if (class104.method718(var4 + 1, class62.field1137[arg0][arg1][arg2], var5 + 1) && class104.method718(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2], var5 + 1) && class104.method718(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class104.method718(var4 + 1, class62.field1137[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
				class238.field4429[arg0][arg1][arg2] = class143.field2627;
				return true;
			} else {
				class238.field4429[arg0][arg1][arg2] = -class143.field2627;
				return false;
			}
		}
	}

	@ObfuscatedName("w.a(Li;ZLnb;Li;)[Lrc;")
	public static class188[] method1582(class88 arg0, class144 arg1, class88 arg2) {
		int var3 = arg1.method964(arg0);
		int var4 = arg1.method966(arg2, var3);
		return class34.method230(var4, arg1, var3);
	}

	@ObfuscatedName("w.a(ILnb;II)[Lpf;")
	public static class169[] method1583(int arg0, class144 arg1, int arg2) {
		return class47.method358(arg1, arg2, arg0) ? class34.method229() : null;
	}

	@ObfuscatedName("w.a(IIII)I")
	public static int method1584(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg0 >> 7;
		if (var4 < 0 || var3 < 0 || var4 > 103 || var3 > 103) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg2;
		int var7 = arg0 & 0x7F;
		if (arg2 < 3 && (class116.field2098[1][var4][var3] & 0x2) == 2) {
			var6 = arg2 + 1;
		}
		int var8 = class62.field1137[var6][var4 + 1][var3] * var7 + (128 - var7) * class62.field1137[var6][var4][var3] >> 7;
		int var9 = class62.field1137[var6][var4 + 1][var3 + 1] * var7 + class62.field1137[var6][var4][var3 + 1] * (128 - var7) >> 7;
		return var5 * var9 + (128 - var5) * var8 >> 7;
	}
}
