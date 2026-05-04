package deob;

@ObfuscatedName("ah")
public final class class9 extends class67 {

	@ObfuscatedName("ah.t")
	public int field124;

	@ObfuscatedName("ah.L")
	public static final class131[] field140 = new class131[6];

	@ObfuscatedName("ah.z")
	public static int field130;

	@ObfuscatedName("ah.G")
	public int field136;

	@ObfuscatedName("ah.H")
	public static class22 field137;

	@ObfuscatedName("ah.x")
	public int[] field128;

	@ObfuscatedName("ah.y")
	public int[] field129;

	@ObfuscatedName("ah.B")
	public int[] field132;

	@ObfuscatedName("ah.I")
	public class163[] field138;

	@ObfuscatedName("ah.K")
	public class163[] field139;

	@ObfuscatedName("ah.A")
	public byte[][][] field131;

	@ObfuscatedName("ah.a(IIIIIII)V")
	public static void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class136.method906(arg3);
		int var6 = arg3 - arg5;
		if (var6 < 0) {
			var6 = 0;
		}
		int var7 = 0;
		int var8 = arg3;
		int var9 = -var6;
		int var10 = var6;
		int var11 = -1;
		int var12 = -arg3;
		int var13 = -1;
		int var14 = arg1 - var6;
		int var15 = var6 + arg1;
		int[] var16 = class3.field42[arg4];
		class230.method1534(arg1 - arg3, arg2, var14, var16);
		class230.method1534(var14, arg0, var15, var16);
		class230.method1534(var15, arg2, arg3 + arg1, var16);
		while (var7 < var8) {
			var13 += 2;
			var9 += var13;
			var11 += 2;
			if (var9 >= 0 && var10 >= 1) {
				class29.field482[var10] = var7;
				var10--;
				var9 -= var10 << 1;
			}
			var12 += var11;
			var7++;
			if (var12 >= 0) {
				var8--;
				if (var8 < var6) {
					int[] var17 = class3.field42[arg4 + var8];
					int var18 = class29.field482[var8];
					int[] var19 = class3.field42[arg4 - var8];
					int var20 = arg1 - var7;
					int var21 = arg1 + var7;
					int var22 = arg1 + var18;
					int var23 = arg1 - var18;
					class230.method1534(var20, arg2, var23, var17);
					class230.method1534(var23, arg0, var22, var17);
					class230.method1534(var22, arg2, var21, var17);
					class230.method1534(var20, arg2, var23, var19);
					class230.method1534(var23, arg0, var22, var19);
					class230.method1534(var22, arg2, var21, var19);
				} else {
					int[] var24 = class3.field42[arg4 + var8];
					int[] var25 = class3.field42[arg4 - var8];
					int var26 = var7 + arg1;
					int var27 = arg1 - var7;
					class230.method1534(var27, arg2, var26, var24);
					class230.method1534(var27, arg2, var26, var25);
				}
				var12 -= var8 << 1;
			}
			int[] var28 = class3.field42[var7 + arg4];
			int[] var29 = class3.field42[arg4 - var7];
			int var30 = var8 + arg1;
			int var31 = arg1 - var8;
			if (var6 <= var7) {
				class230.method1534(var31, arg2, var30, var28);
				class230.method1534(var31, arg2, var30, var29);
			} else {
				int var32 = var10 < var7 ? class29.field482[var7] : var10;
				int var33 = arg1 - var32;
				class230.method1534(var31, arg2, var33, var28);
				int var34 = var32 + arg1;
				class230.method1534(var33, arg0, var34, var28);
				class230.method1534(var34, arg2, var30, var28);
				class230.method1534(var31, arg2, var33, var29);
				class230.method1534(var33, arg0, var34, var29);
				class230.method1534(var34, arg2, var30, var29);
			}
		}
	}

	@ObfuscatedName("ah.a(III)I")
	public static int method48(int arg0, int arg1) {
		int var2 = class192.method1330(arg0 - 1, arg1 + -1) + class192.method1330(arg0 - 1, arg1 + 1) + class192.method1330(arg0 + 1, arg1 + -1) + class192.method1330(arg0 - -1, arg1 - -1);
		int var3 = class192.method1330(arg0, arg1 - 1) + class192.method1330(arg0, arg1 + 1) + class192.method1330(arg0 + -1, arg1) + class192.method1330(arg0 - -1, arg1);
		int var4 = class192.method1330(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("ah.a(Li;BLnb;Li;)Lpf;")
	public static class169 method49(class88 arg0, class144 arg1, class88 arg2) {
		int var3 = arg1.method964(arg0);
		int var4 = arg1.method966(arg2, var3);
		return class32.method203(arg1, var4, var3);
	}

	@ObfuscatedName("ah.a(IB)I")
	public static int method50(int arg0) {
		return arg0 & 0x7F;
	}

	@ObfuscatedName("ah.b(II)I")
	public static int method51(int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}
}
