package deob;

@ObfuscatedName("ma")
public final class class84 {

	@ObfuscatedName("ma.a")
	public static int field1968;

	@ObfuscatedName("ma.b")
	public static class32 field1969 = class73.method593("::fpson", true);

	@ObfuscatedName("ma.c")
	public static class32 field1970 = class73.method593("null", true);

	@ObfuscatedName("ma.g")
	public static long field1974 = 0L;

	@ObfuscatedName("ma.j")
	public static short[] field1977 = new short[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("ma.a([Lec;IIB)Lec;")
	public static class32 method655(class32[] arg0, int arg1, int arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg1; var4++) {
			if (arg0[var4 + arg2] == null) {
				arg0[arg2 + var4] = class26.field479;
			}
			var3 += arg0[var4 + arg2].field674;
		}
		byte[] var5 = new byte[var3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg1; var7++) {
			class32 var8 = arg0[arg2 + var7];
			class60.method457(var8.field618, 0, var5, var6, var8.field674);
			var6 += var8.field674;
		}
		class32 var9 = new class32();
		var9.field674 = var3;
		var9.field618 = var5;
		return var9;
	}

	@ObfuscatedName("ma.a(IIIIIIIII)V")
	public static void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (class28.method192(arg2)) {
			class98.field2253 = null;
			class125.method979(arg5, arg3, class79.field1825[arg2], -1, arg1, arg7, arg4, arg0, arg6);
			if (class98.field2253 != null) {
				class125.method979(arg5, arg3, class98.field2253, -1412584499, class68.field1603, field1968, arg4, arg0, arg6);
				class98.field2253 = null;
			}
		} else if (arg4 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				class145.field3297[var8] = true;
			}
		} else {
			class145.field3297[arg4] = true;
		}
	}

	@ObfuscatedName("ma.a(Lf;I)Z")
	public static boolean method657(class36 arg0) {
		if (arg0.field778 == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.field778.length; var1++) {
			int var2 = class157.method1218(arg0, var1);
			int var3 = arg0.field785[var1];
			if (arg0.field778[var1] == 2) {
				if (var2 >= var3) {
					return false;
				}
			} else if (arg0.field778[var1] == 3) {
				if (var3 >= var2) {
					return false;
				}
			} else if (arg0.field778[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var3 != var2) {
				return false;
			}
		}
		return true;
	}
}
