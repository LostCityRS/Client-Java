package deob;

import java.awt.Canvas;

@ObfuscatedName("ob")
public final class class154 {

	@ObfuscatedName("ob.a")
	public static final class88 field2964 = class208.method1423(105, "Benutzername: ");

	@ObfuscatedName("ob.c")
	public static class41 field2966;

	@ObfuscatedName("ob.f")
	public static int field2969 = 0;

	@ObfuscatedName("ob.g")
	public static final class88 field2970 = class208.method1423(105, "Lade)3)3)3");

	@ObfuscatedName("ob.h")
	public final class67[] field2971;

	@ObfuscatedName("ob.i")
	public final int field2972;

	@ObfuscatedName("ob.j")
	public static final class88 field2973 = class208.method1423(105, "huffman");

	@ObfuscatedName("ob.k")
	public static final class88 field2974 = class208.method1423(105, "Loaded fonts");

	@ObfuscatedName("ob.l")
	public static Canvas field2975;

	@ObfuscatedName("ob.m")
	public static final class88 field2976 = class208.method1423(105, "Please wait 1 minute and try again)3");

	@ObfuscatedName("ob.e")
	public static class88 field2968 = field2976;

	@ObfuscatedName("ob.p")
	public static int[][][] field2979;

	@ObfuscatedName("ob.q")
	public static boolean field2980 = true;

	@ObfuscatedName("ob.r")
	public class67 field2981;

	@ObfuscatedName("ob.s")
	public static class188[] field2982;

	@ObfuscatedName("ob.v")
	public long field2985;

	@ObfuscatedName("ob.w")
	public static class88 field2986 = field2974;

	@ObfuscatedName("ob.y")
	public static class88 field2988 = field2976;

	@ObfuscatedName("ob.z")
	public int field2989 = 0;

	@ObfuscatedName("ob.A")
	public class67 field2990;

	@ObfuscatedName("ob.b(B)V")
	public static void method1050() {
		class141.field2606.method134();
	}

	@ObfuscatedName("ob.a(IIIIIBII)V")
	public static void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		int var8 = arg5;
		int var9 = 0;
		int var10 = arg2 - arg4;
		int var11 = arg5 - arg4;
		int var12 = arg2 * arg2;
		int var13 = arg5 * arg5;
		int var14 = var11 * var11;
		int var15 = var13 << 1;
		int var16 = var10 * var10;
		int var17 = var12 << 1;
		int var18 = var16 << 1;
		int var19 = var14 << 1;
		int var20 = var11 << 1;
		int var21 = var19 + var16 * (1 - var20);
		int var22 = arg5 << 1;
		int var23 = var13 - (var22 - 1) * var17;
		int var24 = (1 - var22) * var12 + var15;
		int var25 = var14 - var18 * (var20 - 1);
		int var26 = var13 << 2;
		int var27 = var12 << 2;
		int var28 = var15 * 3;
		int var29 = var14 << 2;
		int var30 = var16 << 2;
		int var31 = var19 * 3;
		int var32 = var18 * (var20 - 3);
		int var33 = var26;
		int var34 = (var22 - 3) * var17;
		int var35 = var29;
		if (class49.field919 <= arg0 && class18.field279 >= arg0) {
			int[] var36 = class3.field42[arg0];
			int var37 = class156.method1058(class67.field1207, class12.field183, arg6 - arg2);
			int var38 = class156.method1058(class67.field1207, class12.field183, arg6 + arg2);
			int var39 = class156.method1058(class67.field1207, class12.field183, arg6 - var10);
			int var40 = class156.method1058(class67.field1207, class12.field183, arg6 + var10);
			class230.method1534(var37, arg1, var39, var36);
			class230.method1534(var39, arg3, var40, var36);
			class230.method1534(var40, arg1, var38, var36);
		}
		int var41 = (var11 - 1) * var30;
		int var42 = (arg5 - 1) * var27;
		while (var8 > 0) {
			if (var24 < 0) {
				while (var24 < 0) {
					var24 += var28;
					var28 += var26;
					var7++;
					var23 += var33;
					var33 += var26;
				}
			}
			boolean var43 = var11 >= var8;
			var8--;
			int var44 = var8 + arg0;
			int var45 = arg0 - var8;
			if (var43) {
				if (var21 < 0) {
					while (var21 < 0) {
						var25 += var35;
						var21 += var31;
						var31 += var29;
						var9++;
						var35 += var29;
					}
				}
				if (var25 < 0) {
					var25 += var35;
					var9++;
					var21 += var31;
					var31 += var29;
					var35 += var29;
				}
				var25 += -var32;
				var21 += -var41;
				var32 -= var30;
				var41 -= var30;
			}
			if (var23 < 0) {
				var23 += var33;
				var33 += var26;
				var24 += var28;
				var28 += var26;
				var7++;
			}
			var23 += -var34;
			var24 += -var42;
			var42 -= var27;
			var34 -= var27;
			if (var44 >= class49.field919 && class18.field279 >= var45) {
				int var46 = class156.method1058(class67.field1207, class12.field183, arg6 + var7);
				int var47 = class156.method1058(class67.field1207, class12.field183, arg6 - var7);
				if (var43) {
					int var48 = class156.method1058(class67.field1207, class12.field183, arg6 + var9);
					int var49 = class156.method1058(class67.field1207, class12.field183, arg6 - var9);
					if (var45 >= class49.field919) {
						int[] var50 = class3.field42[var45];
						class230.method1534(var47, arg1, var49, var50);
						class230.method1534(var49, arg3, var48, var50);
						class230.method1534(var48, arg1, var46, var50);
					}
					if (class18.field279 >= var44) {
						int[] var51 = class3.field42[var44];
						class230.method1534(var47, arg1, var49, var51);
						class230.method1534(var49, arg3, var48, var51);
						class230.method1534(var48, arg1, var46, var51);
					}
				} else {
					if (var45 >= class49.field919) {
						class230.method1534(var47, arg1, var46, class3.field42[var45]);
					}
					if (class18.field279 >= var44) {
						class230.method1534(var47, arg1, var46, class3.field42[var44]);
					}
				}
			}
		}
	}

	public class154(int arg0) {
		this.field2972 = arg0;
		this.field2971 = new class67[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class67 var3 = this.field2971[var2] = new class67();
			var3.field1212 = var3;
			var3.field1220 = var3;
		}
	}

	@ObfuscatedName("ob.a(I)Lg;")
	public class67 method1047() {
		this.field2989 = 0;
		return this.method1048();
	}

	@ObfuscatedName("ob.a(B)Lg;")
	public class67 method1048() {
		if (this.field2989 > 0 && this.field2990 != this.field2971[this.field2989 - 1]) {
			class67 var1 = this.field2990;
			this.field2990 = var1.field1220;
			return var1;
		}
		while (this.field2972 > this.field2989) {
			class67 var2 = this.field2971[this.field2989++].field1220;
			if (this.field2971[this.field2989 - 1] != var2) {
				this.field2990 = var2.field1220;
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("ob.a(IJ)Lg;")
	public class67 method1049(long arg0) {
		this.field2985 = arg0;
		class67 var3 = this.field2971[(int) (arg0 & (long) (this.field2972 - 1))];
		for (this.field2981 = var3.field1220; this.field2981 != var3; this.field2981 = this.field2981.field1220) {
			if (arg0 == this.field2981.field1219) {
				class67 var4 = this.field2981;
				this.field2981 = this.field2981.field1220;
				return var4;
			}
		}
		this.field2981 = null;
		return null;
	}

	@ObfuscatedName("ob.a(JLg;I)V")
	public void method1052(long arg0, class67 arg1) {
		if (arg1.field1212 != null) {
			arg1.method460();
		}
		class67 var4 = this.field2971[(int) (arg0 & (long) (this.field2972 - 1))];
		arg1.field1219 = arg0;
		arg1.field1212 = var4.field1212;
		arg1.field1220 = var4;
		arg1.field1212.field1220 = arg1;
		arg1.field1220.field1212 = arg1;
	}

	@ObfuscatedName("ob.c(I)Lg;")
	public class67 method1054(int arg0) {
		if (this.field2981 == null) {
			return null;
		}
		class67 var2 = this.field2971[(int) (this.field2985 & (long) (this.field2972 - 1))];
		if (arg0 != 3) {
			this.method1048();
		}
		while (this.field2981 != var2) {
			if (this.field2985 == this.field2981.field1219) {
				class67 var3 = this.field2981;
				this.field2981 = this.field2981.field1220;
				return var3;
			}
			this.field2981 = this.field2981.field1220;
		}
		this.field2981 = null;
		return null;
	}
}
