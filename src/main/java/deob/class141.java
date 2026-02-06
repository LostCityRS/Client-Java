package deob;

@ObfuscatedName("ub")
public class class141 extends class13 {

	@ObfuscatedName("ub.I")
	public static int field3236 = 0;

	@ObfuscatedName("ub.L")
	public static int field3239 = 0;

	@ObfuscatedName("ub.K")
	public static int field3238 = 0;

	@ObfuscatedName("ub.N")
	public static int field3241 = 0;

	@ObfuscatedName("ub.H")
	public static int field3235;

	@ObfuscatedName("ub.M")
	public static int field3240;

	@ObfuscatedName("ub.J")
	public static int[] field3237;

	@ObfuscatedName("ub.a([III)V")
	public static void method1052(int[] arg0, int arg1, int arg2) {
		field3237 = arg0;
		field3240 = arg1;
		field3235 = arg2;
		method1066(0, 0, arg1, arg2);
	}

	@ObfuscatedName("ub.a(IIIII)V")
	public static void method1053(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field3238) {
			arg2 -= field3238 - arg0;
			arg0 = field3238;
		}
		if (arg1 < field3236) {
			arg3 -= field3236 - arg1;
			arg1 = field3236;
		}
		if (arg0 + arg2 > field3241) {
			arg2 = field3241 - arg0;
		}
		if (arg1 + arg3 > field3239) {
			arg3 = field3239 - arg1;
		}
		int var5 = field3240 - arg2;
		int var6 = arg0 + arg1 * field3240;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field3237[var6++] = arg4;
			}
			var6 += var5;
		}
	}

	@ObfuscatedName("ub.a()V")
	public static void method1054() {
		int var0 = 0;
		int var1 = field3240 * field3235 - 7;
		while (var0 < var1) {
			field3237[var0++] = 0;
			field3237[var0++] = 0;
			field3237[var0++] = 0;
			field3237[var0++] = 0;
			field3237[var0++] = 0;
			field3237[var0++] = 0;
			field3237[var0++] = 0;
			field3237[var0++] = 0;
		}
		var1 += 7;
		while (var0 < var1) {
			field3237[var0++] = 0;
		}
	}

	@ObfuscatedName("ub.b(IIIII)V")
	public static void method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2 - arg0;
		int var6 = arg3 - arg1;
		if (var6 == 0) {
			if (var5 >= 0) {
				method1063(arg0, arg1, var5 + 1, arg4);
			} else {
				method1063(arg0 + var5, arg1, 1 - var5, arg4);
			}
		} else if (var5 != 0) {
			if (var5 + var6 < 0) {
				arg0 += var5;
				var5 = -var5;
				arg1 += var6;
				var6 = -var6;
			}
			if (var5 > var6) {
				int var7 = arg1 << 16;
				int var8 = var7 + 32768;
				int var9 = var6 << 16;
				int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
				int var11 = var5 + arg0;
				if (arg0 < field3238) {
					var8 += var10 * (field3238 - arg0);
					arg0 = field3238;
				}
				if (var11 >= field3241) {
					var11 = field3241 - 1;
				}
				while (arg0 <= var11) {
					int var12 = var8 >> 16;
					if (var12 >= field3236 && var12 < field3239) {
						field3237[arg0 + var12 * field3240] = arg4;
					}
					var8 += var10;
					arg0++;
				}
			} else {
				int var13 = arg0 << 16;
				int var14 = var13 + 32768;
				int var15 = var5 << 16;
				int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
				int var17 = var6 + arg1;
				if (arg1 < field3236) {
					var14 += var16 * (field3236 - arg1);
					arg1 = field3236;
				}
				if (var17 >= field3239) {
					var17 = field3239 - 1;
				}
				while (arg1 <= var17) {
					int var18 = var14 >> 16;
					if (var18 >= field3238 && var18 < field3241) {
						field3237[var18 + arg1 * field3240] = arg4;
					}
					var14 += var16;
					arg1++;
				}
			}
		} else if (var6 >= 0) {
			method1060(arg0, arg1, var6 + 1, arg4);
		} else {
			method1060(arg0, arg1 + var6, -var6 + 1, arg4);
		}
	}

	@ObfuscatedName("ub.b()V")
	public static void method1056() {
		field3238 = 0;
		field3236 = 0;
		field3241 = field3240;
		field3239 = field3235;
	}

	@ObfuscatedName("ub.a(IIIIII)V")
	public static void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field3238) {
			arg2 -= field3238 - arg0;
			arg0 = field3238;
		}
		if (arg1 < field3236) {
			arg3 -= field3236 - arg1;
			arg1 = field3236;
		}
		if (arg0 + arg2 > field3241) {
			arg2 = field3241 - arg0;
		}
		if (arg1 + arg3 > field3239) {
			arg3 = field3239 - arg1;
		}
		int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		int var7 = 256 - arg5;
		int var8 = field3240 - arg2;
		int var9 = arg0 + arg1 * field3240;
		for (int var10 = 0; var10 < arg3; var10++) {
			for (int var11 = -arg2; var11 < 0; var11++) {
				int var12 = field3237[var9];
				int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
				field3237[var9++] = var6 + var13;
			}
			var9 += var8;
		}
	}

	@ObfuscatedName("ub.c(IIIII)V")
	public static void method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method1063(arg0, arg1, arg2, arg4);
		method1063(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1060(arg0, arg1, arg3, arg4);
		method1060(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@ObfuscatedName("ub.b(IIIIII)V")
	public static void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 0;
		if (arg0 < field3238) {
			arg2 -= field3238 - arg0;
			arg0 = field3238;
		}
		if (field3236 > 0) {
			var6 = field3236 * 2849;
			arg3 = 23 - field3236;
			arg1 = field3236;
		}
		if (arg0 + arg2 > field3241) {
			arg2 = field3241 - arg0;
		}
		if (arg1 + arg3 > field3239) {
			arg3 = field3239 - arg1;
		}
		int var7 = field3240 - arg2;
		int var8 = arg0 + arg1 * field3240;
		for (int var9 = -arg3; var9 < 0; var9++) {
			int var10 = 65536 - var6 >> 8;
			int var11 = var6 >> 8;
			int var12 = ((arg4 & 0xFF00FF) * var10 + (arg5 & 0xFF00FF) * var11 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (arg5 & 0xFF00) * var11 & 0xFF0000) >>> 8;
			for (int var13 = -arg2; var13 < 0; var13++) {
				field3237[var8++] = var12;
			}
			var8 += var7;
			var6 += 2849;
		}
	}

	@ObfuscatedName("ub.a(IIII)V")
	public static void method1060(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < field3238 || arg0 >= field3241) {
			return;
		}
		if (arg1 < field3236) {
			arg2 -= field3236 - arg1;
			arg1 = field3236;
		}
		if (arg1 + arg2 > field3239) {
			arg2 = field3239 - arg1;
		}
		int var4 = arg0 + arg1 * field3240;
		for (int var5 = 0; var5 < arg2; var5++) {
			field3237[var4 + var5 * field3240] = arg3;
		}
	}

	@ObfuscatedName("ub.a([I)V")
	public static void method1061(int[] arg0) {
		field3238 = arg0[0];
		field3236 = arg0[1];
		field3241 = arg0[2];
		field3239 = arg0[3];
	}

	@ObfuscatedName("ub.d(IIIII)V")
	public static void method1062(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field3236 || arg1 >= field3239) {
			return;
		}
		if (arg0 < field3238) {
			arg2 -= field3238 - arg0;
			arg0 = field3238;
		}
		if (arg0 + arg2 > field3241) {
			arg2 = field3241 - arg0;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg0 + arg1 * field3240;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (field3237[var9] >> 16 & 0xFF) * var5;
			int var12 = (field3237[var9] >> 8 & 0xFF) * var5;
			int var13 = (field3237[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			field3237[var9++] = var14;
		}
	}

	@ObfuscatedName("ub.b(IIII)V")
	public static void method1063(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < field3236 || arg1 >= field3239) {
			return;
		}
		if (arg0 < field3238) {
			arg2 -= field3238 - arg0;
			arg0 = field3238;
		}
		if (arg0 + arg2 > field3241) {
			arg2 = field3241 - arg0;
		}
		int var4 = arg0 + arg1 * field3240;
		for (int var5 = 0; var5 < arg2; var5++) {
			field3237[var4 + var5] = arg3;
		}
	}

	@ObfuscatedName("ub.c()V")
	public static void method1064() {
		field3237 = null;
	}

	@ObfuscatedName("ub.c(IIII)V")
	public static void method1065(int arg0, int arg1, int arg2, int arg3) {
		if (field3238 < arg0) {
			field3238 = arg0;
		}
		if (field3236 < arg1) {
			field3236 = arg1;
		}
		if (field3241 > arg2) {
			field3241 = arg2;
		}
		if (field3239 > arg3) {
			field3239 = arg3;
		}
	}

	@ObfuscatedName("ub.d(IIII)V")
	public static void method1066(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > field3240) {
			arg2 = field3240;
		}
		if (arg3 > field3235) {
			arg3 = field3235;
		}
		field3238 = arg0;
		field3236 = arg1;
		field3241 = arg2;
		field3239 = arg3;
	}

	@ObfuscatedName("ub.e(IIIII)V")
	public static void method1067(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field3238 || arg0 >= field3241) {
			return;
		}
		if (arg1 < field3236) {
			arg2 -= field3236 - arg1;
			arg1 = field3236;
		}
		if (arg1 + arg2 > field3239) {
			arg2 = field3239 - arg1;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = arg0 + arg1 * field3240;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (field3237[var9] >> 16 & 0xFF) * var5;
			int var12 = (field3237[var9] >> 8 & 0xFF) * var5;
			int var13 = (field3237[var9] & 0xFF) * var5;
			int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
			field3237[var9] = var14;
			var9 += field3240;
		}
	}

	@ObfuscatedName("ub.c(IIIIII)V")
	public static void method1068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method1062(arg0, arg1, arg2, arg4, arg5);
		method1062(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1067(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1067(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@ObfuscatedName("ub.a(III[I[I)V")
	public static void method1069(int arg0, int arg1, int[] arg2, int[] arg3) {
		int var4 = arg0 + arg1 * field3240;
		for (int var5 = 0; var5 < arg2.length; var5++) {
			int var6 = var4 + arg2[var5];
			for (int var7 = -arg3[var5]; var7 < 0; var7++) {
				field3237[var6++] = 0;
			}
			var4 += field3240;
		}
	}

	@ObfuscatedName("ub.b([I)V")
	public static void method1070(int[] arg0) {
		arg0[0] = field3238;
		arg0[1] = field3236;
		arg0[2] = field3241;
		arg0[3] = field3239;
	}
}
