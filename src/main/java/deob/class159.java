package deob;

import java.util.Random;

@ObfuscatedName("og")
public final class class159 extends class67 {

	@ObfuscatedName("og.t")
	public static final class248 field3049 = new class248();

	@ObfuscatedName("og.v")
	public int field3051;

	@ObfuscatedName("og.w")
	public int field3052;

	@ObfuscatedName("og.Q")
	public static final class88 field3072 = class208.method1423(105, "K");

	@ObfuscatedName("og.N")
	public static class88 field3069 = field3072;

	@ObfuscatedName("og.P")
	public static class88 field3071 = field3072;

	@ObfuscatedName("og.O")
	public static final class88 field3070 = class208.method1423(105, "Login server offline)3");

	@ObfuscatedName("og.R")
	public static final int field3073 = 0;

	@ObfuscatedName("og.S")
	public static class88 field3074 = field3070;

	@ObfuscatedName("og.T")
	public static final class13[] field3075 = new class13[500];

	@ObfuscatedName("og.U")
	public static final class88 field3076 = class208.method1423(105, ")3runescape)3com)4l=");

	@ObfuscatedName("og.F")
	public int field3061 = -1;

	@ObfuscatedName("og.y")
	public int field3054 = 0;

	@ObfuscatedName("og.x")
	public int field3053;

	@ObfuscatedName("og.z")
	public int field3055;

	@ObfuscatedName("og.D")
	public int field3059;

	@ObfuscatedName("og.E")
	public int field3060;

	@ObfuscatedName("og.G")
	public int field3062;

	@ObfuscatedName("og.H")
	public int field3063;

	@ObfuscatedName("og.I")
	public int field3064;

	@ObfuscatedName("og.K")
	public static int field3066;

	@ObfuscatedName("og.M")
	public int field3068;

	@ObfuscatedName("og.a(IIII)I")
	public static int method1069(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg0;
		} else if (var3 == 1) {
			return 7 - arg1;
		} else if (var3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@ObfuscatedName("og.a(IB)Z")
	public static boolean method1070(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@ObfuscatedName("og.b(II)[B")
	public static byte[] method1072(int arg0) {
		class189 var1 = (class189) class24.field388.method665((long) arg0);
		if (var1 == null) {
			byte[] var2 = new byte[512];
			Random var3 = new Random((long) arg0);
			for (int var4 = 0; var4 < 255; var4++) {
				var2[var4] = (byte) var4;
			}
			for (int var5 = 0; var5 < 255; var5++) {
				int var6 = 255 - var5;
				int var7 = class119.method812(var6, var3);
				byte var8 = var2[var7];
				var2[var7] = var2[var6];
				var2[var6] = var2[511 - var5] = var8;
			}
			var1 = new class189(var2);
			class24.field388.method663((long) arg0, var1);
		}
		return var1.field3658;
	}

	@ObfuscatedName("og.c(II)V")
	public static void method1073(int arg0) {
		class165.field3145 = 1000 / arg0;
	}
}
