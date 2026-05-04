package deob;

@ObfuscatedName("oa")
public final class class153 extends class67 {

	@ObfuscatedName("oa.v")
	public static final class88 field2953 = class208.method1423(105, "To play on this world move to a free area first)3");

	@ObfuscatedName("oa.t")
	public static class88 field2951 = field2953;

	@ObfuscatedName("oa.A")
	public static final class59 field2958 = new class59();

	@ObfuscatedName("oa.y")
	public final byte[] field2956;

	@ObfuscatedName("oa.C")
	public static int field2960;

	@ObfuscatedName("oa.x")
	public static class144 field2955;

	@ObfuscatedName("oa.F")
	public static class88[] field2963;

	@ObfuscatedName("oa.a(IIBIIIIIII)V")
	public static void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 == arg7 && arg4 == arg3 && arg8 == arg2 && arg6 == arg5) {
			class105.method723(arg7, arg5, arg1, arg4, arg2);
			return;
		}
		int var9 = arg7;
		int var10 = arg4;
		int var11 = arg7 * 3;
		int var12 = arg4 * 3;
		int var13 = arg6 * 3;
		int var14 = arg3 * 3;
		int var15 = arg8 * 3;
		int var16 = arg0 * 3;
		int var17 = arg5 + var14 - arg4 - var13;
		int var18 = arg2 + var16 - arg7 - var15;
		int var19 = var15 + var11 - var16 - var16;
		int var20 = var12 + var13 - var14 - var14;
		int var21 = var16 - var11;
		int var22 = var14 - var12;
		for (int var23 = 128; var23 <= 4096; var23 += 128) {
			int var24 = var23 * var23 >> 12;
			int var25 = var24 * var23 >> 12;
			int var26 = var18 * var25;
			int var27 = var24 * var19;
			int var28 = var23 * var21;
			int var29 = var24 * var20;
			int var30 = var17 * var25;
			int var31 = var22 * var23;
			int var32 = arg7 + (var26 + var27 + var28 >> 12);
			int var33 = arg4 + (var31 + var30 + var29 >> 12);
			class105.method723(var9, var33, arg1, var10, var32);
			var10 = var33;
			var9 = var32;
		}
	}

	@ObfuscatedName("oa.b(II)Luh;")
	public static class226 method1043(int arg0) {
		class226 var1 = (class226) class108.field1955.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class204.field3883.method939(class71.method473(arg0), class240.method1585(arg0));
		class226 var3 = new class226();
		if (var2 != null) {
			var3.method1516(new class46(var2));
		}
		class108.field1955.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.c(I)V")
	public static void method1044() {
		class137.field2533.method670();
		class230.field4302.method134();
	}

	@ObfuscatedName("oa.a(Lnb;Lsb;Lnb;B)V")
	public static void method1045(class144 arg0, class198 arg1, class144 arg2) {
		class78.field1417 = arg2;
		class247.field4527 = arg1;
		class36.field633 = arg0;
	}

	@ObfuscatedName("oa.b(Z)V")
	public static void method1046() {
		for (int var0 = -1; var0 < class55.field1027; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = class174.field3428[var0];
			}
			class44 var2 = class244.field4491[var1];
			if (var2 != null && var2.field4112 > 0) {
				var2.field4112--;
				if (var2.field4112 == 0) {
					var2.field4071 = null;
				}
			}
		}
		for (int var3 = 0; var3 < class55.field1041; var3++) {
			int var4 = class25.field402[var3];
			class191 var5 = class225.field4223[var4];
			if (var5 != null && var5.field4112 > 0) {
				var5.field4112--;
				if (var5.field4112 == 0) {
					var5.field4071 = null;
				}
			}
		}
	}

	public class153(byte[] arg0) {
		this.field2956 = arg0;
	}
}
