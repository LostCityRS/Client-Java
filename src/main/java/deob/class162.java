package deob;

@ObfuscatedName("oj")
public final class class162 extends class51 {

	@ObfuscatedName("oj.C")
	public final int field3119;

	@ObfuscatedName("oj.H")
	public final int field3123;

	@ObfuscatedName("oj.G")
	public final boolean field3122;

	@ObfuscatedName("oj.y")
	public int field3115;

	@ObfuscatedName("oj.I")
	public int field3124;

	@ObfuscatedName("oj.M")
	public int field3127;

	@ObfuscatedName("oj.A")
	public int field3117;

	@ObfuscatedName("oj.x")
	public int field3114;

	@ObfuscatedName("oj.z")
	public int field3116;

	@ObfuscatedName("oj.B")
	public int field3118;

	@ObfuscatedName("oj.E")
	public int field3120;

	@ObfuscatedName("oj.F")
	public int field3121;

	@ObfuscatedName("oj.K")
	public int field3125;

	@ObfuscatedName("oj.L")
	public int field3126;

	@ObfuscatedName("oj.N")
	public int field3128;

	@ObfuscatedName("oj.a(II[B[IIIIIIIILoj;II)I")
	public static int method1087(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10) {
		arg8.field3128 -= arg8.field3118 * arg3;
		arg8.field3114 -= arg8.field3125 * arg3;
		int var11;
		if (arg9 == 0 || (var11 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			var11 = arg6;
		}
		int var10001;
		while (arg3 < var11) {
			int var12 = arg2 >> 8;
			byte var13 = arg0[var12];
			var10001 = arg3++;
			arg1[var10001] += ((var13 << 8) + (arg0[var12 + 1] - var13) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		int var14;
		if (arg9 == 0 || (var14 = arg3 + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			var14 = arg6;
		}
		while (arg3 < var14) {
			byte var15 = arg0[arg2 >> 8];
			var10001 = arg3++;
			arg1[var10001] += ((var15 << 8) + (arg10 - var15) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.field3128 += arg8.field3118 * arg3;
		arg8.field3114 += arg8.field3125 * arg3;
		arg8.field3121 = arg4;
		arg8.field3117 = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.a([B[IIIIIIILoj;)I")
	public static int method1089(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7) {
		int var8 = arg2 >> 8;
		int var9 = arg6 >> 8;
		int var10 = arg4 << 2;
		int var11;
		if ((var11 = arg3 + var8 + 1 - var9) > arg5) {
			var11 = arg5;
		}
		var11 -= 3;
		int var10001;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8--] * var10;
			int var12 = arg3++;
			arg1[var12] += arg0[var8--] * var10;
			int var13 = arg3++;
			arg1[var13] += arg0[var8--] * var10;
			int var14 = arg3++;
			arg1[var14] += arg0[var8--] * var10;
		}
		var11 += 3;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8--] * var10;
		}
		arg7.field3117 = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.a(II[B[IIIIIIIIIILoj;II)I")
	public static int method1090(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10, int arg11, int arg12) {
		arg10.field3121 -= arg10.field3120 * arg3;
		int var13;
		if (arg11 == 0 || (var13 = arg3 + (arg9 + arg11 - arg2 - 257) / arg11) > arg8) {
			var13 = arg8;
		}
		int var14 = arg3 << 1;
		int var15 = var13 << 1;
		int var10001;
		while (var14 < var15) {
			int var16 = arg2 >> 8;
			byte var17 = arg0[var16];
			int var18 = (var17 << 8) + (arg0[var16 + 1] - var17) * (arg2 & 0xFF);
			var10001 = var14++;
			arg1[var10001] += var18 * arg4 >> 6;
			arg4 += arg6;
			int var24 = var14++;
			arg1[var24] += var18 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		int var19;
		if (arg11 == 0 || (var19 = (var14 >> 1) + (arg9 + arg11 - arg2 - 1) / arg11) > arg8) {
			var19 = arg8;
		}
		int var20 = var19 << 1;
		while (var14 < var20) {
			byte var21 = arg0[arg2 >> 8];
			int var22 = (var21 << 8) + (arg12 - var21) * (arg2 & 0xFF);
			var10001 = var14++;
			arg1[var10001] += var22 * arg4 >> 6;
			arg4 += arg6;
			var10001 = var14++;
			arg1[var10001] += var22 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		int var23 = var14 >> 1;
		arg10.field3121 += arg10.field3120 * var23;
		arg10.field3128 = arg4;
		arg10.field3114 = arg5;
		arg10.field3117 = arg2;
		return var23;
	}

	@ObfuscatedName("oj.a(I[B[IIIIIIIILoj;)I")
	public static int method1094(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var9 + 1 - var10) > arg6) {
			var13 = arg6;
		}
		int var14 = arg3 << 1;
		int var15 = var13 << 1;
		int var21 = var15 - 6;
		while (var14 < var21) {
			byte var16 = arg0[var9--];
			int var22 = var14++;
			arg1[var22] += var16 * var11;
			int var23 = var14++;
			arg1[var23] += var16 * var12;
			byte var17 = arg0[var9--];
			int var25 = var14++;
			arg1[var25] += var17 * var11;
			int var26 = var14++;
			arg1[var26] += var17 * var12;
			byte var18 = arg0[var9--];
			int var28 = var14++;
			arg1[var28] += var18 * var11;
			int var29 = var14++;
			arg1[var29] += var18 * var12;
			byte var19 = arg0[var9--];
			int var31 = var14++;
			arg1[var31] += var19 * var11;
			int var32 = var14++;
			arg1[var32] += var19 * var12;
		}
		var15 = var21 + 6;
		while (var14 < var15) {
			byte var20 = arg0[var9--];
			int var10001 = var14++;
			arg1[var10001] += var20 * var11;
			int var33 = var14++;
			arg1[var33] += var20 * var12;
		}
		arg8.field3117 = var9 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("oj.a([B[IIIIIIIILoj;)I")
	public static int method1095(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var9 + 1 - var10) > arg6) {
			var13 = arg6;
		}
		arg8.field3128 += arg8.field3118 * (var13 - arg3);
		arg8.field3114 += arg8.field3125 * (var13 - arg3);
		var13 -= 3;
		int var10001;
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9--] * var11;
			int var14 = var11 + var12;
			int var17 = arg3++;
			arg1[var17] += arg0[var9--] * var14;
			int var15 = var14 + var12;
			int var18 = arg3++;
			arg1[var18] += arg0[var9--] * var15;
			int var16 = var15 + var12;
			int var19 = arg3++;
			arg1[var19] += arg0[var9--] * var16;
			var11 = var16 + var12;
		}
		var13 += 3;
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9--] * var11;
			var11 += var12;
		}
		arg8.field3121 = var11 >> 2;
		arg8.field3117 = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.b(I[B[IIIIIIIILoj;)I")
	public static int method1096(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var10 - var9) > arg6) {
			var13 = arg6;
		}
		int var14 = arg3 << 1;
		int var15 = var13 << 1;
		int var21 = var15 - 6;
		while (var14 < var21) {
			byte var16 = arg0[var9++];
			int var22 = var14++;
			arg1[var22] += var16 * var11;
			int var23 = var14++;
			arg1[var23] += var16 * var12;
			byte var17 = arg0[var9++];
			int var25 = var14++;
			arg1[var25] += var17 * var11;
			int var26 = var14++;
			arg1[var26] += var17 * var12;
			byte var18 = arg0[var9++];
			int var28 = var14++;
			arg1[var28] += var18 * var11;
			int var29 = var14++;
			arg1[var29] += var18 * var12;
			byte var19 = arg0[var9++];
			int var31 = var14++;
			arg1[var31] += var19 * var11;
			int var32 = var14++;
			arg1[var32] += var19 * var12;
		}
		var15 = var21 + 6;
		while (var14 < var15) {
			byte var20 = arg0[var9++];
			int var10001 = var14++;
			arg1[var10001] += var20 * var11;
			int var33 = var14++;
			arg1[var33] += var20 * var12;
		}
		arg8.field3117 = var9 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("oj.a(I[B[IIIIIIIIIILoj;)I")
	public static int method1097(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10) {
		int var11 = arg2 >> 8;
		int var12 = arg9 >> 8;
		int var13 = arg4 << 2;
		int var14 = arg5 << 2;
		int var15 = arg6 << 2;
		int var16 = arg7 << 2;
		int var17;
		if ((var17 = arg3 + var11 + 1 - var12) > arg8) {
			var17 = arg8;
		}
		arg10.field3121 += arg10.field3120 * (var17 - arg3);
		int var18 = arg3 << 1;
		int var19 = var17 << 1;
		int var37 = var19 - 6;
		while (var18 < var37) {
			byte var20 = arg0[var11--];
			int var31 = var18++;
			arg1[var31] += var20 * var13;
			int var21 = var13 + var15;
			int var32 = var18++;
			arg1[var32] += var20 * var14;
			int var22 = var14 + var16;
			byte var23 = arg0[var11--];
			int var34 = var18++;
			arg1[var34] += var23 * var21;
			int var24 = var21 + var15;
			int var35 = var18++;
			arg1[var35] += var23 * var22;
			int var25 = var22 + var16;
			byte var26 = arg0[var11--];
			int var38 = var18++;
			arg1[var38] += var26 * var24;
			int var27 = var24 + var15;
			int var39 = var18++;
			arg1[var39] += var26 * var25;
			int var28 = var25 + var16;
			byte var29 = arg0[var11--];
			int var41 = var18++;
			arg1[var41] += var29 * var27;
			var13 = var27 + var15;
			int var42 = var18++;
			arg1[var42] += var29 * var28;
			var14 = var28 + var16;
		}
		var19 = var37 + 6;
		while (var18 < var19) {
			byte var30 = arg0[var11--];
			int var10001 = var18++;
			arg1[var10001] += var30 * var13;
			var13 += var15;
			int var43 = var18++;
			arg1[var43] += var30 * var14;
			var14 += var16;
		}
		arg10.field3128 = var13 >> 2;
		arg10.field3114 = var14 >> 2;
		arg10.field3117 = var11 << 8;
		return var18 >> 1;
	}

	@ObfuscatedName("oj.a(Ltf;III)Loj;")
	public static class162 method1098(class213 arg0, int arg1, int arg2, int arg3) {
		return arg0.field4031 == null || arg0.field4031.length == 0 ? null : new class162(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("oj.b(I[B[IIIIIIIIIILoj;)I")
	public static int method1099(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10) {
		int var11 = arg2 >> 8;
		int var12 = arg9 >> 8;
		int var13 = arg4 << 2;
		int var14 = arg5 << 2;
		int var15 = arg6 << 2;
		int var16 = arg7 << 2;
		int var17;
		if ((var17 = arg3 + var12 - var11) > arg8) {
			var17 = arg8;
		}
		arg10.field3121 += arg10.field3120 * (var17 - arg3);
		int var18 = arg3 << 1;
		int var19 = var17 << 1;
		int var37 = var19 - 6;
		while (var18 < var37) {
			byte var20 = arg0[var11++];
			int var31 = var18++;
			arg1[var31] += var20 * var13;
			int var21 = var13 + var15;
			int var32 = var18++;
			arg1[var32] += var20 * var14;
			int var22 = var14 + var16;
			byte var23 = arg0[var11++];
			int var34 = var18++;
			arg1[var34] += var23 * var21;
			int var24 = var21 + var15;
			int var35 = var18++;
			arg1[var35] += var23 * var22;
			int var25 = var22 + var16;
			byte var26 = arg0[var11++];
			int var38 = var18++;
			arg1[var38] += var26 * var24;
			int var27 = var24 + var15;
			int var39 = var18++;
			arg1[var39] += var26 * var25;
			int var28 = var25 + var16;
			byte var29 = arg0[var11++];
			int var41 = var18++;
			arg1[var41] += var29 * var27;
			var13 = var27 + var15;
			int var42 = var18++;
			arg1[var42] += var29 * var28;
			var14 = var28 + var16;
		}
		var19 = var37 + 6;
		while (var18 < var19) {
			byte var30 = arg0[var11++];
			int var10001 = var18++;
			arg1[var10001] += var30 * var13;
			var13 += var15;
			int var43 = var18++;
			arg1[var43] += var30 * var14;
			var14 += var16;
		}
		arg10.field3128 = var13 >> 2;
		arg10.field3114 = var14 >> 2;
		arg10.field3117 = var11 << 8;
		return var18 >> 1;
	}

	@ObfuscatedName("oj.b([B[IIIIIIILoj;)I")
	public static int method1101(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7) {
		int var8 = arg2 >> 8;
		int var9 = arg6 >> 8;
		int var10 = arg4 << 2;
		int var11;
		if ((var11 = arg3 + var9 - var8) > arg5) {
			var11 = arg5;
		}
		var11 -= 3;
		int var10001;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8++] * var10;
			int var12 = arg3++;
			arg1[var12] += arg0[var8++] * var10;
			int var13 = arg3++;
			arg1[var13] += arg0[var8++] * var10;
			int var14 = arg3++;
			arg1[var14] += arg0[var8++] * var10;
		}
		var11 += 3;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8++] * var10;
		}
		arg7.field3117 = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.b(II)I")
	public static int method1102(int arg0, int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("oj.c(II)I")
	public static int method1106(int arg0, int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("oj.a(II[B[IIIIIIILoj;II)I")
	public static int method1107(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7, int arg8, int arg9) {
		int var10;
		if (arg8 == 0 || (var10 = arg3 + (arg6 + arg8 + 256 - arg2) / arg8) > arg5) {
			var10 = arg5;
		}
		int var10001;
		while (arg3 < var10) {
			int var11 = arg2 >> 8;
			byte var12 = arg0[var11 - 1];
			var10001 = arg3++;
			arg1[var10001] += ((var12 << 8) + (arg0[var11] - var12) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		int var13;
		if (arg8 == 0 || (var13 = arg3 + (arg6 + arg8 - arg2) / arg8) > arg5) {
			var13 = arg5;
		}
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += ((arg9 << 8) + (arg0[arg2 >> 8] - arg9) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.field3117 = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.b(II[B[IIIIIIIIIILoj;II)I")
	public static int method1109(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10, int arg11, int arg12) {
		arg10.field3121 -= arg10.field3120 * arg3;
		int var13;
		if (arg11 == 0 || (var13 = arg3 + (arg9 + arg11 + 256 - arg2) / arg11) > arg8) {
			var13 = arg8;
		}
		int var14 = arg3 << 1;
		int var15 = var13 << 1;
		int var10001;
		while (var14 < var15) {
			int var16 = arg2 >> 8;
			byte var17 = arg0[var16 - 1];
			int var18 = (var17 << 8) + (arg0[var16] - var17) * (arg2 & 0xFF);
			var10001 = var14++;
			arg1[var10001] += var18 * arg4 >> 6;
			arg4 += arg6;
			int var23 = var14++;
			arg1[var23] += var18 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		int var19;
		if (arg11 == 0 || (var19 = (var14 >> 1) + (arg9 + arg11 - arg2) / arg11) > arg8) {
			var19 = arg8;
		}
		int var20 = var19 << 1;
		while (var14 < var20) {
			int var21 = (arg12 << 8) + (arg0[arg2 >> 8] - arg12) * (arg2 & 0xFF);
			var10001 = var14++;
			arg1[var10001] += var21 * arg4 >> 6;
			arg4 += arg6;
			var10001 = var14++;
			arg1[var10001] += var21 * arg5 >> 6;
			arg5 += arg7;
			arg2 += arg11;
		}
		int var22 = var14 >> 1;
		arg10.field3121 += arg10.field3120 * var22;
		arg10.field3128 = arg4;
		arg10.field3114 = arg5;
		arg10.field3117 = arg2;
		return var22;
	}

	@ObfuscatedName("oj.b(II[B[IIIIIIIILoj;II)I")
	public static int method1110(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10) {
		arg8.field3128 -= arg8.field3118 * arg3;
		arg8.field3114 -= arg8.field3125 * arg3;
		int var11;
		if (arg9 == 0 || (var11 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			var11 = arg6;
		}
		int var10001;
		while (arg3 < var11) {
			int var12 = arg2 >> 8;
			byte var13 = arg0[var12 - 1];
			var10001 = arg3++;
			arg1[var10001] += ((var13 << 8) + (arg0[var12] - var13) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		int var14;
		if (arg9 == 0 || (var14 = arg3 + (arg7 + arg9 - arg2) / arg9) > arg6) {
			var14 = arg6;
		}
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += ((arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF)) * arg4 >> 6;
			arg4 += arg5;
			arg2 += arg9;
		}
		arg8.field3128 += arg8.field3118 * arg3;
		arg8.field3114 += arg8.field3125 * arg3;
		arg8.field3121 = arg4;
		arg8.field3117 = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.c(II[B[IIIIIIIILoj;II)I")
	public static int method1112(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10) {
		int var11;
		if (arg9 == 0 || (var11 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			var11 = arg6;
		}
		int var12 = arg3 << 1;
		int var13 = var11 << 1;
		int var10001;
		while (var12 < var13) {
			int var14 = arg2 >> 8;
			byte var15 = arg0[var14 - 1];
			int var16 = (var15 << 8) + (arg0[var14] - var15) * (arg2 & 0xFF);
			var10001 = var12++;
			arg1[var10001] += var16 * arg4 >> 6;
			int var20 = var12++;
			arg1[var20] += var16 * arg5 >> 6;
			arg2 += arg9;
		}
		int var17;
		if (arg9 == 0 || (var17 = (var12 >> 1) + (arg7 + arg9 - arg2) / arg9) > arg6) {
			var17 = arg6;
		}
		int var18 = var17 << 1;
		while (var12 < var18) {
			int var19 = (arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF);
			var10001 = var12++;
			arg1[var10001] += var19 * arg4 >> 6;
			var10001 = var12++;
			arg1[var10001] += var19 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.field3117 = arg2;
		return var12 >> 1;
	}

	@ObfuscatedName("oj.b([B[IIIIIIIILoj;)I")
	public static int method1122(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var10 - var9) > arg6) {
			var13 = arg6;
		}
		arg8.field3128 += arg8.field3118 * (var13 - arg3);
		arg8.field3114 += arg8.field3125 * (var13 - arg3);
		var13 -= 3;
		int var10001;
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9++] * var11;
			int var14 = var11 + var12;
			int var17 = arg3++;
			arg1[var17] += arg0[var9++] * var14;
			int var15 = var14 + var12;
			int var18 = arg3++;
			arg1[var18] += arg0[var9++] * var15;
			int var16 = var15 + var12;
			int var19 = arg3++;
			arg1[var19] += arg0[var9++] * var16;
			var11 = var16 + var12;
		}
		var13 += 3;
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9++] * var11;
			var11 += var12;
		}
		arg8.field3121 = var11 >> 2;
		arg8.field3117 = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.b(II[B[IIIIIIILoj;II)I")
	public static int method1123(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7, int arg8, int arg9) {
		int var10;
		if (arg8 == 0 || (var10 = arg3 + (arg6 + arg8 - arg2 - 257) / arg8) > arg5) {
			var10 = arg5;
		}
		int var10001;
		while (arg3 < var10) {
			int var11 = arg2 >> 8;
			byte var12 = arg0[var11];
			var10001 = arg3++;
			arg1[var10001] += ((var12 << 8) + (arg0[var11 + 1] - var12) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		int var13;
		if (arg8 == 0 || (var13 = arg3 + (arg6 + arg8 - arg2 - 1) / arg8) > arg5) {
			var13 = arg5;
		}
		while (arg3 < var13) {
			byte var14 = arg0[arg2 >> 8];
			var10001 = arg3++;
			arg1[var10001] += ((var14 << 8) + (arg9 - var14) * (arg2 & 0xFF)) * arg4 >> 6;
			arg2 += arg8;
		}
		arg7.field3117 = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.a(Ltf;II)Loj;")
	public static class162 method1124(class213 arg0, int arg1) {
		return arg0.field4031 == null || arg0.field4031.length == 0 ? null : new class162(arg0, (int) ((long) arg0.field4028 * 256L * (long) 100 / (long) (class11.field161 * 100)), arg1 << 6);
	}

	@ObfuscatedName("oj.d(II[B[IIIIIIIILoj;II)I")
	public static int method1125(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10) {
		int var11;
		if (arg9 == 0 || (var11 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			var11 = arg6;
		}
		int var12 = arg3 << 1;
		int var13 = var11 << 1;
		int var10001;
		while (var12 < var13) {
			int var14 = arg2 >> 8;
			byte var15 = arg0[var14];
			int var16 = (var15 << 8) + (arg0[var14 + 1] - var15) * (arg2 & 0xFF);
			var10001 = var12++;
			arg1[var10001] += var16 * arg4 >> 6;
			int var21 = var12++;
			arg1[var21] += var16 * arg5 >> 6;
			arg2 += arg9;
		}
		int var17;
		if (arg9 == 0 || (var17 = (var12 >> 1) + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			var17 = arg6;
		}
		int var18 = var17 << 1;
		while (var12 < var18) {
			byte var19 = arg0[arg2 >> 8];
			int var20 = (var19 << 8) + (arg10 - var19) * (arg2 & 0xFF);
			var10001 = var12++;
			arg1[var10001] += var20 * arg4 >> 6;
			var10001 = var12++;
			arg1[var10001] += var20 * arg5 >> 6;
			arg2 += arg9;
		}
		arg8.field3117 = arg2;
		return var12 >> 1;
	}

	public class162(class213 arg0, int arg1, int arg2) {
		super.field935 = arg0;
		this.field3119 = arg0.field4032;
		this.field3123 = arg0.field4029;
		this.field3122 = arg0.field4030;
		this.field3115 = arg1;
		this.field3124 = arg2;
		this.field3127 = 8192;
		this.field3117 = 0;
		this.method1114();
	}

	public class162(class213 arg0, int arg1, int arg2, int arg3) {
		super.field935 = arg0;
		this.field3119 = arg0.field4032;
		this.field3123 = arg0.field4029;
		this.field3122 = arg0.field4030;
		this.field3115 = arg1;
		this.field3124 = arg2;
		this.field3127 = arg3;
		this.field3117 = 0;
		this.method1114();
	}

	@ObfuscatedName("oj.c(I)V")
	public synchronized void method1086(int arg0) {
		if (arg0 == 0) {
			this.method1091();
			this.method460();
		} else if (this.field3128 == 0 && this.field3114 == 0) {
			this.field3126 = 0;
			this.field3124 = 0;
			this.field3121 = 0;
			this.method460();
		} else {
			int var2 = -this.field3121;
			if (this.field3121 > var2) {
				var2 = this.field3121;
			}
			if (-this.field3128 > var2) {
				var2 = -this.field3128;
			}
			if (this.field3128 > var2) {
				var2 = this.field3128;
			}
			if (-this.field3114 > var2) {
				var2 = -this.field3114;
			}
			if (this.field3114 > var2) {
				var2 = this.field3114;
			}
			if (arg0 > var2) {
				arg0 = var2;
			}
			this.field3126 = arg0;
			this.field3124 = Integer.MIN_VALUE;
			this.field3120 = -this.field3121 / arg0;
			this.field3118 = -this.field3128 / arg0;
			this.field3125 = -this.field3114 / arg0;
		}
	}

	@ObfuscatedName("oj.c()I")
	@Override
	public int method383() {
		return this.field3124 == 0 && this.field3126 == 0 ? 0 : 1;
	}

	@ObfuscatedName("oj.e()Z")
	public boolean method1088() {
		int var1 = this.field3124;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method1106(var1, this.field3127);
			var2 = method1102(var1, this.field3127);
		}
		if (this.field3121 != var1 || this.field3128 != var3 || this.field3114 != var2) {
			if (this.field3121 < var1) {
				this.field3120 = 1;
				this.field3126 = var1 - this.field3121;
			} else if (this.field3121 > var1) {
				this.field3120 = -1;
				this.field3126 = this.field3121 - var1;
			} else {
				this.field3120 = 0;
			}
			if (this.field3128 < var3) {
				this.field3118 = 1;
				if (this.field3126 == 0 || this.field3126 > var3 - this.field3128) {
					this.field3126 = var3 - this.field3128;
				}
			} else if (this.field3128 > var3) {
				this.field3118 = -1;
				if (this.field3126 == 0 || this.field3126 > this.field3128 - var3) {
					this.field3126 = this.field3128 - var3;
				}
			} else {
				this.field3118 = 0;
			}
			if (this.field3114 < var2) {
				this.field3125 = 1;
				if (this.field3126 == 0 || this.field3126 > var2 - this.field3114) {
					this.field3126 = var2 - this.field3114;
				}
			} else if (this.field3114 > var2) {
				this.field3125 = -1;
				if (this.field3126 == 0 || this.field3126 > this.field3114 - var2) {
					this.field3126 = this.field3114 - var2;
				}
			} else {
				this.field3125 = 0;
			}
			return false;
		} else if (this.field3124 == Integer.MIN_VALUE) {
			this.field3124 = 0;
			this.field3121 = this.field3128 = this.field3114 = 0;
			this.method460();
			return true;
		} else {
			this.method1114();
			return false;
		}
	}

	@ObfuscatedName("oj.d(I)V")
	public synchronized void method1091() {
		this.method1115(0, this.method1103());
	}

	@ObfuscatedName("oj.b()I")
	@Override
	public int method382() {
		int var1 = this.field3121 * 3 >> 6;
		int var2 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field3116 == 0) {
			var2 -= var2 * this.field3117 / (((class213) super.field935).field4031.length << 8);
		} else if (this.field3116 >= 0) {
			var2 -= var2 * this.field3119 / ((class213) super.field935).field4031.length;
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("oj.a(III)V")
	public synchronized void method1092(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			this.method1115(arg1, arg2);
			return;
		}
		int var4 = method1106(arg1, arg2);
		int var5 = method1102(arg1, arg2);
		if (this.field3128 == var4 && this.field3114 == var5) {
			this.field3126 = 0;
			return;
		}
		int var6 = arg1 - this.field3121;
		if (this.field3121 - arg1 > var6) {
			var6 = this.field3121 - arg1;
		}
		if (var4 - this.field3128 > var6) {
			var6 = var4 - this.field3128;
		}
		if (this.field3128 - var4 > var6) {
			var6 = this.field3128 - var4;
		}
		if (var5 - this.field3114 > var6) {
			var6 = var5 - this.field3114;
		}
		if (this.field3114 - var5 > var6) {
			var6 = this.field3114 - var5;
		}
		if (arg0 > var6) {
			arg0 = var6;
		}
		this.field3126 = arg0;
		this.field3124 = arg1;
		this.field3127 = arg2;
		this.field3120 = (arg1 - this.field3121) / arg0;
		this.field3118 = (var4 - this.field3128) / arg0;
		this.field3125 = (var5 - this.field3114) / arg0;
	}

	@ObfuscatedName("oj.f()I")
	public synchronized int method1093() {
		return this.field3124 == Integer.MIN_VALUE ? 0 : this.field3124;
	}

	@ObfuscatedName("oj.a([IIIII)I")
	public int method1100(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.field3126 <= 0) {
				if (this.field3115 == 256 && (this.field3117 & 0xFF) == 0) {
					if (class7.field99) {
						return method1096(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, arg3, arg2, this);
					}
					return method1101(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, arg3, arg2, this);
				}
				if (class7.field99) {
					return method1125(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, arg3, arg2, this, this.field3115, arg4);
				}
				return method1123(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, arg3, arg2, this, this.field3115, arg4);
			}
			int var6 = arg1 + this.field3126;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.field3126 += arg1;
			if (this.field3115 == 256 && (this.field3117 & 0xFF) == 0) {
				if (class7.field99) {
					arg1 = method1099(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, this.field3118, this.field3125, var6, arg2, this);
				} else {
					arg1 = method1122(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, this.field3120, var6, arg2, this);
				}
			} else if (class7.field99) {
				arg1 = method1090(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, this.field3118, this.field3125, var6, arg2, this, this.field3115, arg4);
			} else {
				arg1 = method1087(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, this.field3120, var6, arg2, this, this.field3115, arg4);
			}
			this.field3126 -= arg1;
			if (this.field3126 != 0) {
				return arg1;
			}
		} while (!this.method1088());
		return arg3;
	}

	@ObfuscatedName("oj.g()I")
	public synchronized int method1103() {
		return this.field3127 < 0 ? -1 : this.field3127;
	}

	@ObfuscatedName("oj.h()I")
	public synchronized int method1104() {
		return this.field3115 < 0 ? -this.field3115 : this.field3115;
	}

	@ObfuscatedName("oj.e(I)V")
	public synchronized void method1105(int arg0) {
		if (this.field3115 < 0) {
			this.field3115 = -arg0;
		} else {
			this.field3115 = arg0;
		}
	}

	@ObfuscatedName("oj.f(I)V")
	public synchronized void method1108(int arg0) {
		int var2 = ((class213) super.field935).field4031.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > var2) {
			arg0 = var2;
		}
		this.field3117 = arg0;
	}

	@ObfuscatedName("oj.a()Lef;")
	@Override
	public class51 method380() {
		return null;
	}

	@ObfuscatedName("oj.d()Lef;")
	@Override
	public class51 method385() {
		return null;
	}

	@ObfuscatedName("oj.b(Z)V")
	public synchronized void method1111() {
		this.field3115 = (this.field3115 ^ this.field3115 >> 31) + (this.field3115 >>> 31);
		this.field3115 = -this.field3115;
	}

	@ObfuscatedName("oj.i()V")
	public void method1113() {
		if (this.field3126 == 0) {
			return;
		}
		if (this.field3124 == Integer.MIN_VALUE) {
			this.field3124 = 0;
		}
		this.field3126 = 0;
		this.method1114();
	}

	@ObfuscatedName("oj.j()V")
	public void method1114() {
		this.field3121 = this.field3124;
		this.field3128 = method1106(this.field3124, this.field3127);
		this.field3114 = method1102(this.field3124, this.field3127);
	}

	@ObfuscatedName("oj.d(II)V")
	public synchronized void method1115(int arg0, int arg1) {
		this.field3124 = arg0;
		this.field3127 = arg1;
		this.field3126 = 0;
		this.method1114();
	}

	@ObfuscatedName("oj.e(II)V")
	public synchronized void method1116(int arg0, int arg1) {
		this.method1092(arg0, arg1, this.method1103());
	}

	@ObfuscatedName("oj.a([III)V")
	@Override
	public synchronized void method379(int[] arg0, int arg1, int arg2) {
		if (this.field3124 == 0 && this.field3126 == 0) {
			this.method384(arg2);
			return;
		}
		class213 var4 = (class213) super.field935;
		int var5 = this.field3119 << 8;
		int var6 = this.field3123 << 8;
		int var7 = var4.field4031.length << 8;
		int var8 = var6 - var5;
		if (var8 <= 0) {
			this.field3116 = 0;
		}
		int var9 = arg1;
		int var10 = arg2 + arg1;
		if (this.field3117 < 0) {
			if (this.field3115 <= 0) {
				this.method1113();
				this.method460();
				return;
			}
			this.field3117 = 0;
		}
		if (this.field3117 >= var7) {
			if (this.field3115 >= 0) {
				this.method1113();
				this.method460();
				return;
			}
			this.field3117 = var7 - 1;
		}
		if (this.field3116 >= 0) {
			if (this.field3116 > 0) {
				if (this.field3122) {
					label130: {
						if (this.field3115 < 0) {
							var9 = this.method1118(arg0, arg1, var5, var10, var4.field4031[this.field3119]);
							if (this.field3117 >= var5) {
								return;
							}
							this.field3117 = var5 + var5 - this.field3117 - 1;
							this.field3115 = -this.field3115;
							if (--this.field3116 == 0) {
								break label130;
							}
						}
						do {
							var9 = this.method1100(arg0, var9, var6, var10, var4.field4031[this.field3123 - 1]);
							if (this.field3117 < var6) {
								return;
							}
							this.field3117 = var6 + var6 - this.field3117 - 1;
							this.field3115 = -this.field3115;
							if (--this.field3116 == 0) {
								break;
							}
							var9 = this.method1118(arg0, var9, var5, var10, var4.field4031[this.field3119]);
							if (this.field3117 >= var5) {
								return;
							}
							this.field3117 = var5 + var5 - this.field3117 - 1;
							this.field3115 = -this.field3115;
						} while (--this.field3116 != 0);
					}
				} else if (this.field3115 < 0) {
					while (true) {
						var9 = this.method1118(arg0, var9, var5, var10, var4.field4031[this.field3123 - 1]);
						if (this.field3117 >= var5) {
							return;
						}
						int var12 = (var6 - this.field3117 - 1) / var8;
						if (var12 >= this.field3116) {
							this.field3117 += var8 * this.field3116;
							this.field3116 = 0;
							break;
						}
						this.field3117 += var8 * var12;
						this.field3116 -= var12;
					}
				} else {
					while (true) {
						var9 = this.method1100(arg0, var9, var6, var10, var4.field4031[this.field3119]);
						if (this.field3117 < var6) {
							return;
						}
						int var13 = (this.field3117 - var5) / var8;
						if (var13 >= this.field3116) {
							this.field3117 -= var8 * this.field3116;
							this.field3116 = 0;
							break;
						}
						this.field3117 -= var8 * var13;
						this.field3116 -= var13;
					}
				}
			}
			if (this.field3115 < 0) {
				this.method1118(arg0, var9, 0, var10, 0);
				if (this.field3117 < 0) {
					this.field3117 = -1;
					this.method1113();
					this.method460();
					return;
				}
			} else {
				this.method1100(arg0, var9, var7, var10, 0);
				if (this.field3117 >= var7) {
					this.field3117 = var7;
					this.method1113();
					this.method460();
				}
			}
		} else if (this.field3122) {
			if (this.field3115 < 0) {
				var9 = this.method1118(arg0, arg1, var5, var10, var4.field4031[this.field3119]);
				if (this.field3117 >= var5) {
					return;
				}
				this.field3117 = var5 + var5 - this.field3117 - 1;
				this.field3115 = -this.field3115;
			}
			while (true) {
				int var11 = this.method1100(arg0, var9, var6, var10, var4.field4031[this.field3123 - 1]);
				if (this.field3117 < var6) {
					return;
				}
				this.field3117 = var6 + var6 - this.field3117 - 1;
				this.field3115 = -this.field3115;
				var9 = this.method1118(arg0, var11, var5, var10, var4.field4031[this.field3119]);
				if (this.field3117 >= var5) {
					return;
				}
				this.field3117 = var5 + var5 - this.field3117 - 1;
				this.field3115 = -this.field3115;
			}
		} else if (this.field3115 < 0) {
			while (true) {
				var9 = this.method1118(arg0, var9, var5, var10, var4.field4031[this.field3123 - 1]);
				if (this.field3117 >= var5) {
					return;
				}
				this.field3117 = var6 - (var6 - 1 - this.field3117) % var8 - 1;
			}
		} else {
			while (true) {
				var9 = this.method1100(arg0, var9, var6, var10, var4.field4031[this.field3119]);
				if (this.field3117 < var6) {
					return;
				}
				this.field3117 = var5 + (this.field3117 - var5) % var8;
			}
		}
	}

	@ObfuscatedName("oj.g(I)V")
	public synchronized void method1117(int arg0) {
		this.method1115(arg0 << 6, this.method1103());
	}

	@ObfuscatedName("oj.b([IIIII)I")
	public int method1118(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.field3126 <= 0) {
				if (this.field3115 == -256 && (this.field3117 & 0xFF) == 0) {
					if (class7.field99) {
						return method1094(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, arg3, arg2, this);
					}
					return method1089(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, arg3, arg2, this);
				}
				if (class7.field99) {
					return method1112(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, arg3, arg2, this, this.field3115, arg4);
				}
				return method1107(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, arg3, arg2, this, this.field3115, arg4);
			}
			int var6 = arg1 + this.field3126;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.field3126 += arg1;
			if (this.field3115 == -256 && (this.field3117 & 0xFF) == 0) {
				if (class7.field99) {
					arg1 = method1097(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, this.field3118, this.field3125, var6, arg2, this);
				} else {
					arg1 = method1095(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, this.field3120, var6, arg2, this);
				}
			} else if (class7.field99) {
				arg1 = method1109(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3128, this.field3114, this.field3118, this.field3125, var6, arg2, this, this.field3115, arg4);
			} else {
				arg1 = method1110(((class213) super.field935).field4031, arg0, this.field3117, arg1, this.field3121, this.field3120, var6, arg2, this, this.field3115, arg4);
			}
			this.field3126 -= arg1;
			if (this.field3126 != 0) {
				return arg1;
			}
		} while (!this.method1088());
		return arg3;
	}

	@ObfuscatedName("oj.h(I)V")
	public synchronized void method1119(int arg0) {
		this.field3116 = arg0;
	}

	@ObfuscatedName("oj.k()Z")
	public boolean method1120() {
		return this.field3117 < 0 || this.field3117 >= ((class213) super.field935).field4031.length << 8;
	}

	@ObfuscatedName("oj.b(I)V")
	@Override
	public synchronized void method384(int arg0) {
		if (this.field3126 > 0) {
			if (arg0 >= this.field3126) {
				if (this.field3124 == Integer.MIN_VALUE) {
					this.field3124 = 0;
					this.field3121 = this.field3128 = this.field3114 = 0;
					this.method460();
					arg0 = this.field3126;
				}
				this.field3126 = 0;
				this.method1114();
			} else {
				this.field3121 += this.field3120 * arg0;
				this.field3128 += this.field3118 * arg0;
				this.field3114 += this.field3125 * arg0;
				this.field3126 -= arg0;
			}
		}
		class213 var2 = (class213) super.field935;
		int var3 = this.field3119 << 8;
		int var4 = this.field3123 << 8;
		int var5 = var2.field4031.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field3116 = 0;
		}
		if (this.field3117 < 0) {
			if (this.field3115 <= 0) {
				this.method1113();
				this.method460();
				return;
			}
			this.field3117 = 0;
		}
		if (this.field3117 >= var5) {
			if (this.field3115 >= 0) {
				this.method1113();
				this.method460();
				return;
			}
			this.field3117 = var5 - 1;
		}
		this.field3117 += this.field3115 * arg0;
		if (this.field3116 >= 0) {
			if (this.field3116 > 0) {
				if (this.field3122) {
					label125: {
						if (this.field3115 < 0) {
							if (this.field3117 >= var3) {
								return;
							}
							this.field3117 = var3 + var3 - this.field3117 - 1;
							this.field3115 = -this.field3115;
							if (--this.field3116 == 0) {
								break label125;
							}
						}
						do {
							if (this.field3117 < var4) {
								return;
							}
							this.field3117 = var4 + var4 - this.field3117 - 1;
							this.field3115 = -this.field3115;
							if (--this.field3116 == 0) {
								break;
							}
							if (this.field3117 >= var3) {
								return;
							}
							this.field3117 = var3 + var3 - this.field3117 - 1;
							this.field3115 = -this.field3115;
						} while (--this.field3116 != 0);
					}
				} else if (this.field3115 < 0) {
					if (this.field3117 >= var3) {
						return;
					}
					int var7 = (var4 - this.field3117 - 1) / var6;
					if (var7 < this.field3116) {
						this.field3117 += var6 * var7;
						this.field3116 -= var7;
						return;
					}
					this.field3117 += var6 * this.field3116;
					this.field3116 = 0;
				} else if (this.field3117 >= var4) {
					int var8 = (this.field3117 - var3) / var6;
					if (var8 < this.field3116) {
						this.field3117 -= var6 * var8;
						this.field3116 -= var8;
						return;
					}
					this.field3117 -= var6 * this.field3116;
					this.field3116 = 0;
				} else {
					return;
				}
			}
			if (this.field3115 < 0) {
				if (this.field3117 < 0) {
					this.field3117 = -1;
					this.method1113();
					this.method460();
					return;
				}
			} else if (this.field3117 >= var5) {
				this.field3117 = var5;
				this.method1113();
				this.method460();
			}
		} else if (this.field3122) {
			if (this.field3115 < 0) {
				if (this.field3117 >= var3) {
					return;
				}
				this.field3117 = var3 + var3 - this.field3117 - 1;
				this.field3115 = -this.field3115;
			}
			while (this.field3117 >= var4) {
				this.field3117 = var4 + var4 - this.field3117 - 1;
				this.field3115 = -this.field3115;
				if (this.field3117 >= var3) {
					return;
				}
				this.field3117 = var3 + var3 - this.field3117 - 1;
				this.field3115 = -this.field3115;
			}
		} else if (this.field3115 < 0) {
			if (this.field3117 < var3) {
				this.field3117 = var4 - (var4 - 1 - this.field3117) % var6 - 1;
			}
		} else if (this.field3117 >= var4) {
			this.field3117 = var3 + (this.field3117 - var3) % var6;
		}
	}

	@ObfuscatedName("oj.l()Z")
	public boolean method1121() {
		return this.field3126 != 0;
	}
}
