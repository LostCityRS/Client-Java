package deob;

@ObfuscatedName("mg")
public abstract class class138 extends class26 {

	@ObfuscatedName("mg.wb")
	public byte[][] field2557 = new byte[256][];

	@ObfuscatedName("mg.zb")
	public static final byte[][] field2560 = new byte[250][];

	@ObfuscatedName("mg.Cb")
	public static final int field2563 = 50;

	@ObfuscatedName("mg.Bb")
	public static final class88 field2562 = class208.method1423(105, "green:");

	@ObfuscatedName("mg.Jb")
	public static final class88 field2570 = class208.method1423(105, "Loaded textures");

	@ObfuscatedName("mg.Ib")
	public static class88 field2569 = field2570;

	@ObfuscatedName("mg.Ab")
	public static class88 field2561 = field2562;

	@ObfuscatedName("mg.Db")
	public static final class88 field2564 = field2562;

	@ObfuscatedName("mg.yb")
	public static final class202 field2559 = new class202();

	@ObfuscatedName("mg.Gb")
	public static boolean field2567;

	@ObfuscatedName("mg.b(Z)V")
	public static void method918() {
		class88.field1634 = -1;
		class114.field2061 = 0;
		class238.field4430 = -1;
		class146.field2747.field831 = 0;
		class192.field3700 = 0;
		class203.field3862 = 0;
		class247.field4512 = 0;
		class101.field1841 = -1;
		class230.field4312.field831 = 0;
		class228.field4270 = 0;
		class46.field821 = -1;
		class116.field2102 = 0;
		class108.field1958 = false;
		for (int var0 = 0; var0 < class244.field4491.length; var0++) {
			if (class244.field4491[var0] != null) {
				class244.field4491[var0].field4114 = -1;
			}
		}
		for (int var1 = 0; var1 < class225.field4223.length; var1++) {
			if (class225.field4223[var1] != null) {
				class225.field4223[var1].field4114 = -1;
			}
		}
		class42.method276();
		class131.method881(30);
		for (int var2 = 0; var2 < 100; var2++) {
			class225.field4228[var2] = true;
		}
	}

	@ObfuscatedName("mg.c(II)I")
	public static int method920(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("mg.a([Li;B)[Li;")
	public static class88[] method921(class88[] arg0) {
		class88[] var1 = new class88[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = class166.method1140(new class88[] { class170.method1212(var2), class170.field3306 });
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = class166.method1140(new class88[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	public class138(byte[] arg0) {
		super(arg0);
	}

	public class138(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field2557 = arg5;
	}

	@ObfuscatedName("mg.b(IIIIIII)V")
	@Override
	public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 * class72.field1333 + arg1;
		int var9 = 0;
		int var10 = class72.field1333 - arg3;
		int var11 = 0;
		if (class72.field1334 > arg2) {
			int var12 = class72.field1334 - arg2;
			arg2 = class72.field1334;
			var11 = arg3 * var12;
			arg4 -= var12;
			var8 += var12 * class72.field1333;
		}
		if (class72.field1335 < arg2 + arg4) {
			arg4 -= arg2 + arg4 - class72.field1335;
		}
		if (arg1 < class72.field1332) {
			int var13 = class72.field1332 - arg1;
			arg1 = class72.field1332;
			var9 = var13;
			var10 += var13;
			var11 += var13;
			var8 += var13;
			arg3 -= var13;
		}
		if (class72.field1336 < arg1 + arg3) {
			int var14 = arg3 + arg1 - class72.field1336;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			class95.method677(class72.field1331, arg3, arg6, var11, var10, this.field2557[arg0], arg5, var8, arg4, var9);
		}
	}

	@ObfuscatedName("mg.a(IIIIII)V")
	@Override
	public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = class72.field1333 - arg3;
		int var8 = class72.field1333 * arg2 + arg1;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class72.field1334) {
			int var11 = class72.field1334 - arg2;
			var10 = var11 * arg3;
			arg4 -= var11;
			var8 += class72.field1333 * var11;
			arg2 = class72.field1334;
		}
		if (class72.field1335 < arg2 + arg4) {
			arg4 -= arg4 + arg2 - class72.field1335;
		}
		if (class72.field1332 > arg1) {
			int var12 = class72.field1332 - arg1;
			var8 += var12;
			var9 = var12;
			var10 += var12;
			arg3 -= var12;
			var7 += var12;
			arg1 = class72.field1332;
		}
		if (arg1 + arg3 > class72.field1336) {
			int var13 = arg1 + arg3 - class72.field1336;
			var7 += var13;
			arg3 -= var13;
			var9 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			class79.method527(arg5, var9, var8, this.field2557[arg0], arg3, arg4, var7, class72.field1331, var10);
		}
	}
}
