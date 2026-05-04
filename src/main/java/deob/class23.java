package deob;

@ObfuscatedName("c")
public abstract class class23 extends class67 {

	@ObfuscatedName("c.u")
	public static final class88 field360 = class208.method1423(105, "Benutzen");

	@ObfuscatedName("c.B")
	public static final class88 field367 = class208.method1423(105, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@ObfuscatedName("c.E")
	public static final class88[] field370 = new class88[200];

	@ObfuscatedName("c.D")
	public boolean field369;

	@ObfuscatedName("c.K")
	public final class23[] field376;

	@ObfuscatedName("c.x")
	public int field363;

	@ObfuscatedName("c.C")
	public static int field368;

	@ObfuscatedName("c.I")
	public static int field374;

	@ObfuscatedName("c.N")
	public class160 field379;

	@ObfuscatedName("c.y")
	public class230 field364;

	@ObfuscatedName("c.G")
	public static class130[] field372;

	@ObfuscatedName("c.a([BI)[B")
	public static byte[] method119(byte[] arg0) {
		class46 var1 = new class46(arg0);
		int var2 = var1.method347();
		int var3 = var1.method323();
		if (var3 < 0 || class159.field3073 != 0 && var3 > class159.field3073) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var4 = new byte[var3];
			var1.method307(var3, var4);
			return var4;
		} else {
			int var5 = var1.method323();
			if (var5 < 0 || class159.field3073 != 0 && class159.field3073 < var5) {
				throw new RuntimeException();
			}
			byte[] var6 = new byte[var5];
			if (var2 == 1) {
				class215.method1458(var6, var5, arg0, var3);
			} else {
				class153.field2958.method424(var1, var6);
			}
			return var6;
		}
	}

	@ObfuscatedName("c.a(IIIIIIII)Z")
	public static boolean method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return var8 * var10 > 0 && var10 * var9 > 0;
		}
	}

	@ObfuscatedName("c.b(IIIIIIII)V")
	public static void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg2;
		int var8 = 0;
		int var9 = arg6 - arg1;
		int var10 = 0;
		int var11 = arg6 * arg6;
		int var12 = arg2 * arg2;
		int var13 = var9 * var9;
		int var14 = arg2 - arg1;
		int var15 = var14 * var14;
		int var16 = var11 << 1;
		int var17 = var12 << 1;
		int var18 = var15 << 1;
		int var19 = var13 << 1;
		int var20 = arg2 << 1;
		int var21 = var14 << 1;
		int var22 = var12 - var16 * (var20 - 1);
		int var23 = var17 + var11 * (1 - var20);
		int var24 = var12 << 2;
		int var25 = var11 << 2;
		int var26 = var18 + (1 - var21) * var13;
		int var27 = var15 << 2;
		int var28 = (var20 - 3) * var16;
		int var29 = var13 << 2;
		int var30 = var15 - (var21 - 1) * var19;
		int var31 = var17 * 3;
		int var32 = var18 * 3;
		int var33 = (arg2 - 1) * var25;
		int var34 = (var21 - 3) * var19;
		int var35 = (var14 - 1) * var29;
		int[] var36 = class3.field42[arg5];
		int var37 = var24;
		int var38 = var27;
		class230.method1534(arg0 - arg6, arg4, arg0 - var9, var36);
		class230.method1534(arg0 - var9, arg3, var9 + arg0, var36);
		class230.method1534(var9 + arg0, arg4, arg0 + arg6, var36);
		while (var7 > 0) {
			if (var23 < 0) {
				while (var23 < 0) {
					var23 += var31;
					var31 += var24;
					var10++;
					var22 += var37;
					var37 += var24;
				}
			}
			boolean var39 = var7 <= var14;
			if (var39) {
				if (var26 < 0) {
					while (var26 < 0) {
						var8++;
						var30 += var38;
						var38 += var27;
						var26 += var32;
						var32 += var27;
					}
				}
				if (var30 < 0) {
					var8++;
					var26 += var32;
					var32 += var27;
					var30 += var38;
					var38 += var27;
				}
				var26 += -var35;
				var30 += -var34;
				var34 -= var29;
				var35 -= var29;
			}
			if (var22 < 0) {
				var23 += var31;
				var31 += var24;
				var10++;
				var22 += var37;
				var37 += var24;
			}
			var23 += -var33;
			var33 -= var25;
			var22 += -var28;
			var7--;
			int var40 = var10 + arg0;
			int var41 = arg5 - var7;
			var28 -= var25;
			int var42 = var7 + arg5;
			int var43 = arg0 - var10;
			if (var39) {
				int var44 = arg0 + var8;
				int var45 = arg0 - var8;
				class230.method1534(var43, arg4, var45, class3.field42[var41]);
				class230.method1534(var45, arg3, var44, class3.field42[var41]);
				class230.method1534(var44, arg4, var40, class3.field42[var41]);
				class230.method1534(var43, arg4, var45, class3.field42[var42]);
				class230.method1534(var45, arg3, var44, class3.field42[var42]);
				class230.method1534(var44, arg4, var40, class3.field42[var42]);
			} else {
				class230.method1534(var43, arg4, var40, class3.field42[var41]);
				class230.method1534(var43, arg4, var40, class3.field42[var42]);
			}
		}
	}

	public class23(int arg0, boolean arg1) {
		this.field369 = arg1;
		this.field376 = new class23[arg0];
	}

	@ObfuscatedName("c.a(IB)[I")
	public int[] method54(int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@ObfuscatedName("c.a(IZI)[I")
	public final int[] method120(int arg0, int arg1) {
		return this.field376[arg1].field369 ? this.field376[arg1].method54(arg0) : this.field376[arg1].method7(arg0)[0];
	}

	@ObfuscatedName("c.a(Lea;II)V")
	public void method11(class46 arg0, int arg1) {
	}

	@ObfuscatedName("c.a(IBI)[[I")
	public final int[][] method121(int arg0, int arg1) {
		if (this.field376[arg0].field369) {
			int[] var3 = this.field376[arg0].method54(arg1);
			return new int[][] { var3, var3, var3 };
		} else {
			return this.field376[arg0].method7(arg1);
		}
	}

	@ObfuscatedName("c.b(B)V")
	public void method123() {
	}

	@ObfuscatedName("c.b(I)I")
	public int method124() {
		return -1;
	}

	@ObfuscatedName("c.b(IB)[[I")
	public int[][] method7(int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@ObfuscatedName("c.c(I)V")
	public void method127() {
		if (this.field369) {
			this.field379.method1081();
			this.field379 = null;
		} else {
			this.field364.method1531();
			this.field364 = null;
		}
	}

	@ObfuscatedName("c.a(BII)V")
	public final void method128(int arg0, int arg1) {
		int var3 = this.field363 == 255 ? arg1 : this.field363;
		if (this.field369) {
			this.field379 = new class160(var3, arg1, arg0);
		} else {
			this.field364 = new class230(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("c.d(I)I")
	public int method129() {
		return -1;
	}
}
