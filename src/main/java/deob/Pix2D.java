package deob;

@ObfuscatedName("hb")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("hb.i")
	public static boolean field620 = true;

	@ObfuscatedName("hb.j")
	public static boolean field621;

	@ObfuscatedName("hb.k")
	public static int field622 = 35546;

	@ObfuscatedName("hb.l")
	public static int field623 = 4;

	@ObfuscatedName("hb.m")
	public static boolean field624;

	@ObfuscatedName("hb.n")
	public static int field625;

	@ObfuscatedName("hb.o")
	public static boolean field626 = true;

	@ObfuscatedName("hb.p")
	public static int[] field627;

	@ObfuscatedName("hb.q")
	public static int field628;

	@ObfuscatedName("hb.r")
	public static int field629;

	@ObfuscatedName("hb.s")
	public static int field630;

	@ObfuscatedName("hb.t")
	public static int field631;

	@ObfuscatedName("hb.u")
	public static int field632;

	@ObfuscatedName("hb.v")
	public static int field633;

	@ObfuscatedName("hb.w")
	public static int field634;

	@ObfuscatedName("hb.x")
	public static int field635;

	@ObfuscatedName("hb.y")
	public static int field636;

	@ObfuscatedName("hb.z")
	public static boolean field637;

	@ObfuscatedName("hb.a(II[II)V")
	public static void method164(int arg0, int arg1, int[] arg2, int arg3) {
		field627 = arg2;
		field628 = arg0;
		field629 = arg3;
		method166(arg0, arg3, field623, 0, 0);
		if (arg1 != 2) {
			field623 = -9;
		}
	}

	@ObfuscatedName("hb.a(B)V")
	public static void method165(byte arg0) {
		field632 = 0;
		if (arg0 != -115) {
			field620 = !field620;
		}
		field630 = 0;
		field633 = field628;
		field631 = field629;
		field634 = field633 - 1;
		field635 = field633 / 2;
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg0 > field628) {
			arg0 = field628;
		}
		if (arg1 > field629) {
			arg1 = field629;
		}
		field632 = arg4;
		field630 = arg3;
		field633 = arg0;
		field631 = arg1;
		if (arg2 < 4 || arg2 > 4) {
			field623 = 461;
		}
		field634 = field633 - 1;
		field635 = field633 / 2;
		field636 = field631 / 2;
	}

	@ObfuscatedName("hb.a(Z)V")
	public static void method167(boolean arg0) {
		int var1 = field629 * field628;
		if (arg0) {
			field621 = !field621;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			field627[var2] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIIB)V")
	public static void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
		if (arg5 < field632) {
			arg3 -= field632 - arg5;
			arg5 = field632;
		}
		if (arg0 < field630) {
			arg2 -= field630 - arg0;
			arg0 = field630;
		}
		if (arg3 + arg5 > field633) {
			arg3 = field633 - arg5;
		}
		if (arg0 + arg2 > field631) {
			arg2 = field631 - arg0;
		}
		int var7 = 256 - arg1;
		int var8 = (arg4 >> 16 & 0xFF) * arg1;
		int var9 = (arg4 >> 8 & 0xFF) * arg1;
		int var10 = (arg4 & 0xFF) * arg1;
		if (arg6 != -30) {
			field624 = !field624;
		}
		int var11 = field628 - arg3;
		int var12 = field628 * arg0 + arg5;
		for (int var13 = 0; var13 < arg2; var13++) {
			for (int var14 = -arg3; var14 < 0; var14++) {
				int var15 = (field627[var12] >> 16 & 0xFF) * var7;
				int var16 = (field627[var12] >> 8 & 0xFF) * var7;
				int var17 = (field627[var12] & 0xFF) * var7;
				int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
				field627[var12++] = var18;
			}
			var12 += var11;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field632) {
			arg2 -= field632 - arg4;
			arg4 = field632;
		}
		if (arg5 < field630) {
			arg3 -= field630 - arg5;
			arg5 = field630;
		}
		if (arg2 + arg4 > field633) {
			arg2 = field633 - arg4;
		}
		if (arg3 + arg5 > field631) {
			arg3 = field631 - arg5;
		}
		int var6 = field628 - arg2;
		int var7 = field628 * arg5 + arg4;
		if (arg0 < 0 || arg0 > 0) {
			field624 = !field624;
		}
		for (int var8 = -arg3; var8 < 0; var8++) {
			for (int var9 = -arg2; var9 < 0; var9++) {
				field627[var7++] = arg1;
			}
			var7 += var6;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method172(arg2, arg5, arg1, arg3, field625);
		method172(arg2, arg0 + arg5 - 1, arg1, arg3, field625);
		method174(arg3, arg2, arg5, arg0, field626);
		method174(arg1 + arg3 - 1, arg2, arg5, arg0, field626);
		int var6 = 28 / arg4;
	}

	@ObfuscatedName("hb.a(IIIIIZI)V")
	public static void method171(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		method173(arg3, arg4, 629, arg1, arg2, arg6);
		method173(arg0 + arg3 - 1, arg4, 629, arg1, arg2, arg6);
		if (!arg5) {
			field622 = 412;
		}
		if (arg0 >= 3) {
			method175(arg2, arg3 + 1, arg6, arg0 - 2, arg1, (byte) 6);
			method175(arg2 + arg4 - 1, arg3 + 1, arg6, arg0 - 2, arg1, (byte) 6);
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void method172(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field630 || arg1 >= field631) {
			return;
		}
		if (arg3 < field632) {
			arg2 -= field632 - arg3;
			arg3 = field632;
		}
		if (arg2 + arg3 > field633) {
			arg2 = field633 - arg3;
		}
		int var5 = field628 * arg1 + arg3;
		if (arg4 == 0) {
			for (int var6 = 0; var6 < arg2; var6++) {
				field627[var5 + var6] = arg0;
			}
		}
	}

	@ObfuscatedName("hb.c(IIIIII)V")
	public static void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field630 || arg0 >= field631) {
			return;
		}
		if (arg4 < field632) {
			arg1 -= field632 - arg4;
			arg4 = field632;
		}
		if (arg1 + arg4 > field633) {
			arg1 = field633 - arg4;
		}
		int var6 = 256 - arg5;
		if (arg2 <= 0) {
			field621 = !field621;
		}
		int var7 = (arg3 >> 16 & 0xFF) * arg5;
		int var8 = (arg3 >> 8 & 0xFF) * arg5;
		int var9 = (arg3 & 0xFF) * arg5;
		int var10 = field628 * arg0 + arg4;
		for (int var11 = 0; var11 < arg1; var11++) {
			int var12 = (field627[var10] >> 16 & 0xFF) * var6;
			int var13 = (field627[var10] >> 8 & 0xFF) * var6;
			int var14 = (field627[var10] & 0xFF) * var6;
			int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
			field627[var10++] = var15;
		}
	}

	@ObfuscatedName("hb.a(IIIIZ)V")
	public static void method174(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (!arg4) {
			field621 = !field621;
		}
		if (arg0 < field632 || arg0 >= field633) {
			return;
		}
		if (arg2 < field630) {
			arg3 -= field630 - arg2;
			arg2 = field630;
		}
		if (arg2 + arg3 > field631) {
			arg3 = field631 - arg2;
		}
		int var5 = field628 * arg2 + arg0;
		for (int var6 = 0; var6 < arg3; var6++) {
			field627[field628 * var6 + var5] = arg1;
		}
	}

	@ObfuscatedName("hb.a(IIIIIB)V")
	public static void method175(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		if (arg5 == 6) {
			boolean var6 = false;
		} else {
			field624 = !field624;
		}
		if (arg0 < field632 || arg0 >= field633) {
			return;
		}
		if (arg1 < field630) {
			arg3 -= field630 - arg1;
			arg1 = field630;
		}
		if (arg1 + arg3 > field631) {
			arg3 = field631 - arg1;
		}
		int var7 = 256 - arg2;
		int var8 = (arg4 >> 16 & 0xFF) * arg2;
		int var9 = (arg4 >> 8 & 0xFF) * arg2;
		int var10 = (arg4 & 0xFF) * arg2;
		int var11 = field628 * arg1 + arg0;
		for (int var12 = 0; var12 < arg3; var12++) {
			int var13 = (field627[var11] >> 16 & 0xFF) * var7;
			int var14 = (field627[var11] >> 8 & 0xFF) * var7;
			int var15 = (field627[var11] & 0xFF) * var7;
			int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
			field627[var11] = var16;
			var11 += field628;
		}
	}
}
