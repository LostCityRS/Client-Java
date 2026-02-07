package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("n")
public final class WaveStream extends PcmStream {

	@ObfuscatedName("n.v")
	public int field2060;

	@ObfuscatedName("n.w")
	public int field2061;

	@ObfuscatedName("n.G")
	public final int field2071;

	@ObfuscatedName("n.z")
	public final int field2064;

	@ObfuscatedName("n.F")
	public final boolean field2070;

	@ObfuscatedName("n.A")
	public int field2065;

	@ObfuscatedName("n.D")
	public int field2068;

	@ObfuscatedName("n.x")
	public int field2062;

	@ObfuscatedName("n.J")
	public int field2074;

	@ObfuscatedName("n.y")
	public int field2063;

	@ObfuscatedName("n.B")
	public int field2066;

	@ObfuscatedName("n.C")
	public int field2067;

	@ObfuscatedName("n.E")
	public int field2069;

	@ObfuscatedName("n.H")
	public int field2072;

	@ObfuscatedName("n.I")
	public int field2073;

	@ObfuscatedName("n.a(II[B[IIIIIIIILn;II)I")
	public static int method677(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
		arg8.field2067 -= arg8.field2069 * arg3;
		arg8.field2072 -= arg8.field2060 * arg3;
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
		arg8.field2067 += arg8.field2069 * arg3;
		arg8.field2072 += arg8.field2060 * arg3;
		arg8.field2066 = arg4;
		arg8.field2074 = arg2;
		return arg3;
	}

	@ObfuscatedName("n.a(I[B[IIIIIIIILn;)I")
	public static int method680(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
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
		arg8.field2074 = var9 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("n.a(Lib;III)Ln;")
	public static WaveStream method681(Wave arg0, int arg1, int arg2, int arg3) {
		return arg0.field1343 == null || arg0.field1343.length == 0 ? null : new WaveStream(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("n.b(I[B[IIIIIIIILn;)I")
	public static int method683(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
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
		arg8.field2074 = var9 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("n.b(II[B[IIIIIIIILn;II)I")
	public static int method685(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
		arg8.field2067 -= arg8.field2069 * arg3;
		arg8.field2072 -= arg8.field2060 * arg3;
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
		arg8.field2067 += arg8.field2069 * arg3;
		arg8.field2072 += arg8.field2060 * arg3;
		arg8.field2066 = arg4;
		arg8.field2074 = arg2;
		return arg3;
	}

	@ObfuscatedName("n.a(Lib;II)Ln;")
	public static WaveStream method686(Wave arg0, int arg1) {
		return arg0.field1343 == null || arg0.field1343.length == 0 ? null : new WaveStream(arg0, (int) ((long) arg0.field1342 * 256L * (long) 100 / (long) (PcmPlayer.frequency * 100)), arg1 << 6);
	}

	@ObfuscatedName("n.c(II[B[IIIIIIIILn;II)I")
	public static int method687(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
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
		arg8.field2074 = arg2;
		return var12 >> 1;
	}

	@ObfuscatedName("n.a(II[B[IIIIIIIIIILn;II)I")
	public static int method689(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10, int arg11, int arg12) {
		arg10.field2066 -= arg10.field2061 * arg3;
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
		arg10.field2066 += arg10.field2061 * var22;
		arg10.field2067 = arg4;
		arg10.field2072 = arg5;
		arg10.field2074 = arg2;
		return var22;
	}

	@ObfuscatedName("n.d(II[B[IIIIIIIILn;II)I")
	public static int method694(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
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
		arg8.field2074 = arg2;
		return var12 >> 1;
	}

	@ObfuscatedName("n.a(I[B[IIIIIIIIIILn;)I")
	public static int method695(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10) {
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
		arg10.field2066 += arg10.field2061 * (var17 - arg3);
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
		arg10.field2067 = var13 >> 2;
		arg10.field2072 = var14 >> 2;
		arg10.field2074 = var11 << 8;
		return var18 >> 1;
	}

	@ObfuscatedName("n.a([B[IIIIIIILn;)I")
	public static int method696(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7) {
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
		arg7.field2074 = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("n.a([B[IIIIIIIILn;)I")
	public static int method698(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var10 - var9) > arg6) {
			var13 = arg6;
		}
		arg8.field2067 += arg8.field2069 * (var13 - arg3);
		arg8.field2072 += arg8.field2060 * (var13 - arg3);
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
		arg8.field2066 = var11 >> 2;
		arg8.field2074 = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("n.d(II)I")
	public static int method700(int arg0, int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("n.b(II[B[IIIIIIIIIILn;II)I")
	public static int method705(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10, int arg11, int arg12) {
		arg10.field2066 -= arg10.field2061 * arg3;
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
		arg10.field2066 += arg10.field2061 * var23;
		arg10.field2067 = arg4;
		arg10.field2072 = arg5;
		arg10.field2074 = arg2;
		return var23;
	}

	@ObfuscatedName("n.b([B[IIIIIIILn;)I")
	public static int method706(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7) {
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
		arg7.field2074 = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("n.b(I[B[IIIIIIIIIILn;)I")
	public static int method707(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10) {
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
		arg10.field2066 += arg10.field2061 * (var17 - arg3);
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
		arg10.field2067 = var13 >> 2;
		arg10.field2072 = var14 >> 2;
		arg10.field2074 = var11 << 8;
		return var18 >> 1;
	}

	@ObfuscatedName("n.b([B[IIIIIIIILn;)I")
	public static int method708(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var9 + 1 - var10) > arg6) {
			var13 = arg6;
		}
		arg8.field2067 += arg8.field2069 * (var13 - arg3);
		arg8.field2072 += arg8.field2060 * (var13 - arg3);
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
		arg8.field2066 = var11 >> 2;
		arg8.field2074 = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("n.a(II[B[IIIIIIILn;II)I")
	public static int method710(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7, int arg8, int arg9) {
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
		arg7.field2074 = arg2;
		return arg3;
	}

	@ObfuscatedName("n.e(II)I")
	public static int method711(int arg0, int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("n.b(II[B[IIIIIIILn;II)I")
	public static int method713(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7, int arg8, int arg9) {
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
		arg7.field2074 = arg2;
		return arg3;
	}

	public WaveStream(Wave arg0, int arg1, int arg2) {
		super.field946 = arg0;
		this.field2071 = arg0.field1340;
		this.field2064 = arg0.field1341;
		this.field2070 = arg0.field1339;
		this.field2065 = arg1;
		this.field2068 = arg2;
		this.field2062 = 8192;
		this.field2074 = 0;
		this.method714();
	}

	public WaveStream(Wave arg0, int arg1, int arg2, int arg3) {
		super.field946 = arg0;
		this.field2071 = arg0.field1340;
		this.field2064 = arg0.field1341;
		this.field2070 = arg0.field1339;
		this.field2065 = arg1;
		this.field2068 = arg2;
		this.field2062 = arg3;
		this.field2074 = 0;
		this.method714();
	}

	@ObfuscatedName("n.b(II)V")
	public synchronized void method678(int arg0, int arg1) {
		this.method709(arg0, arg1, this.method697());
	}

	@ObfuscatedName("n.e(I)V")
	public synchronized void method679(int arg0) {
		if (this.field2065 < 0) {
			this.field2065 = -arg0;
		} else {
			this.field2065 = arg0;
		}
	}

	@ObfuscatedName("n.b()Lfd;")
	@Override
	public PcmStream method113() {
		return null;
	}

	@ObfuscatedName("n.f(I)V")
	public synchronized void method682(int arg0) {
		if (arg0 == 0) {
			this.method693();
			this.unlink();
		} else if (this.field2067 == 0 && this.field2072 == 0) {
			this.field2073 = 0;
			this.field2068 = 0;
			this.field2066 = 0;
			this.unlink();
		} else {
			int var2 = -this.field2066;
			if (this.field2066 > var2) {
				var2 = this.field2066;
			}
			if (-this.field2067 > var2) {
				var2 = -this.field2067;
			}
			if (this.field2067 > var2) {
				var2 = this.field2067;
			}
			if (-this.field2072 > var2) {
				var2 = -this.field2072;
			}
			if (this.field2072 > var2) {
				var2 = this.field2072;
			}
			if (arg0 > var2) {
				arg0 = var2;
			}
			this.field2073 = arg0;
			this.field2068 = Integer.MIN_VALUE;
			this.field2061 = -this.field2066 / arg0;
			this.field2069 = -this.field2067 / arg0;
			this.field2060 = -this.field2072 / arg0;
		}
	}

	@ObfuscatedName("n.c()Lfd;")
	@Override
	public PcmStream method106() {
		return null;
	}

	@ObfuscatedName("n.g(I)V")
	public synchronized void method684(int arg0) {
		this.field2063 = arg0;
	}

	@ObfuscatedName("n.b([III)V")
	@Override
	public synchronized void method116(int[] arg0, int arg1, int arg2) {
		if (this.field2068 == 0 && this.field2073 == 0) {
			this.method104(arg2);
			return;
		}
		Wave var4 = (Wave) super.field946;
		int var5 = this.field2071 << 8;
		int var6 = this.field2064 << 8;
		int var7 = var4.field1343.length << 8;
		int var8 = var6 - var5;
		if (var8 <= 0) {
			this.field2063 = 0;
		}
		int var9 = arg1;
		int var10 = arg2 + arg1;
		if (this.field2074 < 0) {
			if (this.field2065 <= 0) {
				this.method715();
				this.unlink();
				return;
			}
			this.field2074 = 0;
		}
		if (this.field2074 >= var7) {
			if (this.field2065 >= 0) {
				this.method715();
				this.unlink();
				return;
			}
			this.field2074 = var7 - 1;
		}
		if (this.field2063 >= 0) {
			if (this.field2063 > 0) {
				if (this.field2070) {
					label130: {
						if (this.field2065 < 0) {
							var9 = this.method688(arg0, arg1, var5, var10, var4.field1343[this.field2071]);
							if (this.field2074 >= var5) {
								return;
							}
							this.field2074 = var5 + var5 - this.field2074 - 1;
							this.field2065 = -this.field2065;
							if (--this.field2063 == 0) {
								break label130;
							}
						}
						do {
							var9 = this.method704(arg0, var9, var6, var10, var4.field1343[this.field2064 - 1]);
							if (this.field2074 < var6) {
								return;
							}
							this.field2074 = var6 + var6 - this.field2074 - 1;
							this.field2065 = -this.field2065;
							if (--this.field2063 == 0) {
								break;
							}
							var9 = this.method688(arg0, var9, var5, var10, var4.field1343[this.field2071]);
							if (this.field2074 >= var5) {
								return;
							}
							this.field2074 = var5 + var5 - this.field2074 - 1;
							this.field2065 = -this.field2065;
						} while (--this.field2063 != 0);
					}
				} else if (this.field2065 < 0) {
					while (true) {
						var9 = this.method688(arg0, var9, var5, var10, var4.field1343[this.field2064 - 1]);
						if (this.field2074 >= var5) {
							return;
						}
						int var12 = (var6 - this.field2074 - 1) / var8;
						if (var12 >= this.field2063) {
							this.field2074 += var8 * this.field2063;
							this.field2063 = 0;
							break;
						}
						this.field2074 += var8 * var12;
						this.field2063 -= var12;
					}
				} else {
					while (true) {
						var9 = this.method704(arg0, var9, var6, var10, var4.field1343[this.field2071]);
						if (this.field2074 < var6) {
							return;
						}
						int var13 = (this.field2074 - var5) / var8;
						if (var13 >= this.field2063) {
							this.field2074 -= var8 * this.field2063;
							this.field2063 = 0;
							break;
						}
						this.field2074 -= var8 * var13;
						this.field2063 -= var13;
					}
				}
			}
			if (this.field2065 < 0) {
				this.method688(arg0, var9, 0, var10, 0);
				if (this.field2074 < 0) {
					this.field2074 = -1;
					this.method715();
					this.unlink();
					return;
				}
			} else {
				this.method704(arg0, var9, var7, var10, 0);
				if (this.field2074 >= var7) {
					this.field2074 = var7;
					this.method715();
					this.unlink();
				}
			}
		} else if (this.field2070) {
			if (this.field2065 < 0) {
				var9 = this.method688(arg0, arg1, var5, var10, var4.field1343[this.field2071]);
				if (this.field2074 >= var5) {
					return;
				}
				this.field2074 = var5 + var5 - this.field2074 - 1;
				this.field2065 = -this.field2065;
			}
			while (true) {
				int var11 = this.method704(arg0, var9, var6, var10, var4.field1343[this.field2064 - 1]);
				if (this.field2074 < var6) {
					return;
				}
				this.field2074 = var6 + var6 - this.field2074 - 1;
				this.field2065 = -this.field2065;
				var9 = this.method688(arg0, var11, var5, var10, var4.field1343[this.field2071]);
				if (this.field2074 >= var5) {
					return;
				}
				this.field2074 = var5 + var5 - this.field2074 - 1;
				this.field2065 = -this.field2065;
			}
		} else if (this.field2065 < 0) {
			while (true) {
				var9 = this.method688(arg0, var9, var5, var10, var4.field1343[this.field2064 - 1]);
				if (this.field2074 >= var5) {
					return;
				}
				this.field2074 = var6 - (var6 - 1 - this.field2074) % var8 - 1;
			}
		} else {
			while (true) {
				var9 = this.method704(arg0, var9, var6, var10, var4.field1343[this.field2071]);
				if (this.field2074 < var6) {
					return;
				}
				this.field2074 = var5 + (this.field2074 - var5) % var8;
			}
		}
	}

	@ObfuscatedName("n.a([IIIII)I")
	public int method688(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.field2073 <= 0) {
				if (this.field2065 == -256 && (this.field2074 & 0xFF) == 0) {
					if (JavaPcmPlayer.field1310) {
						return method683(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, arg3, arg2, this);
					}
					return method696(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, arg3, arg2, this);
				}
				if (JavaPcmPlayer.field1310) {
					return method687(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, arg3, arg2, this, this.field2065, arg4);
				}
				return method713(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, arg3, arg2, this, this.field2065, arg4);
			}
			int var6 = arg1 + this.field2073;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.field2073 += arg1;
			if (this.field2065 == -256 && (this.field2074 & 0xFF) == 0) {
				if (JavaPcmPlayer.field1310) {
					arg1 = method707(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, this.field2069, this.field2060, var6, arg2, this);
				} else {
					arg1 = method708(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, this.field2061, var6, arg2, this);
				}
			} else if (JavaPcmPlayer.field1310) {
				arg1 = method689(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, this.field2069, this.field2060, var6, arg2, this, this.field2065, arg4);
			} else {
				arg1 = method685(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, this.field2061, var6, arg2, this, this.field2065, arg4);
			}
			this.field2073 -= arg1;
			if (this.field2073 != 0) {
				return arg1;
			}
		} while (!this.method703());
		return arg3;
	}

	@ObfuscatedName("n.h(I)V")
	public synchronized void method690(int arg0) {
		this.method691(arg0 << 6, this.method697());
	}

	@ObfuscatedName("n.c(II)V")
	public synchronized void method691(int arg0, int arg1) {
		this.field2068 = arg0;
		this.field2062 = arg1;
		this.field2073 = 0;
		this.method714();
	}

	@ObfuscatedName("n.d()I")
	@Override
	public int method321() {
		int var1 = this.field2066 * 3 >> 6;
		int var2 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field2063 == 0) {
			var2 -= var2 * this.field2074 / (((Wave) super.field946).field1343.length << 8);
		} else if (this.field2063 >= 0) {
			var2 -= var2 * this.field2071 / ((Wave) super.field946).field1343.length;
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("n.e()I")
	public synchronized int method692() {
		return this.field2065 < 0 ? -this.field2065 : this.field2065;
	}

	@ObfuscatedName("n.i(I)V")
	public synchronized void method693() {
		this.method691(0, this.method697());
	}

	@ObfuscatedName("n.f()I")
	public synchronized int method697() {
		return this.field2062 < 0 ? -1 : this.field2062;
	}

	@ObfuscatedName("n.g()Z")
	public boolean method699() {
		return this.field2074 < 0 || this.field2074 >= ((Wave) super.field946).field1343.length << 8;
	}

	@ObfuscatedName("n.h()I")
	public synchronized int method701() {
		return this.field2068 == Integer.MIN_VALUE ? 0 : this.field2068;
	}

	@ObfuscatedName("n.j(I)V")
	public synchronized void method702(int arg0) {
		int var2 = ((Wave) super.field946).field1343.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > var2) {
			arg0 = var2;
		}
		this.field2074 = arg0;
	}

	@ObfuscatedName("n.d(I)V")
	@Override
	public synchronized void method104(int arg0) {
		if (this.field2073 > 0) {
			if (arg0 >= this.field2073) {
				if (this.field2068 == Integer.MIN_VALUE) {
					this.field2068 = 0;
					this.field2066 = this.field2067 = this.field2072 = 0;
					this.unlink();
					arg0 = this.field2073;
				}
				this.field2073 = 0;
				this.method714();
			} else {
				this.field2066 += this.field2061 * arg0;
				this.field2067 += this.field2069 * arg0;
				this.field2072 += this.field2060 * arg0;
				this.field2073 -= arg0;
			}
		}
		Wave var2 = (Wave) super.field946;
		int var3 = this.field2071 << 8;
		int var4 = this.field2064 << 8;
		int var5 = var2.field1343.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field2063 = 0;
		}
		if (this.field2074 < 0) {
			if (this.field2065 <= 0) {
				this.method715();
				this.unlink();
				return;
			}
			this.field2074 = 0;
		}
		if (this.field2074 >= var5) {
			if (this.field2065 >= 0) {
				this.method715();
				this.unlink();
				return;
			}
			this.field2074 = var5 - 1;
		}
		this.field2074 += this.field2065 * arg0;
		if (this.field2063 >= 0) {
			if (this.field2063 > 0) {
				if (this.field2070) {
					label125: {
						if (this.field2065 < 0) {
							if (this.field2074 >= var3) {
								return;
							}
							this.field2074 = var3 + var3 - this.field2074 - 1;
							this.field2065 = -this.field2065;
							if (--this.field2063 == 0) {
								break label125;
							}
						}
						do {
							if (this.field2074 < var4) {
								return;
							}
							this.field2074 = var4 + var4 - this.field2074 - 1;
							this.field2065 = -this.field2065;
							if (--this.field2063 == 0) {
								break;
							}
							if (this.field2074 >= var3) {
								return;
							}
							this.field2074 = var3 + var3 - this.field2074 - 1;
							this.field2065 = -this.field2065;
						} while (--this.field2063 != 0);
					}
				} else if (this.field2065 < 0) {
					if (this.field2074 >= var3) {
						return;
					}
					int var7 = (var4 - this.field2074 - 1) / var6;
					if (var7 < this.field2063) {
						this.field2074 += var6 * var7;
						this.field2063 -= var7;
						return;
					}
					this.field2074 += var6 * this.field2063;
					this.field2063 = 0;
				} else if (this.field2074 >= var4) {
					int var8 = (this.field2074 - var3) / var6;
					if (var8 < this.field2063) {
						this.field2074 -= var6 * var8;
						this.field2063 -= var8;
						return;
					}
					this.field2074 -= var6 * this.field2063;
					this.field2063 = 0;
				} else {
					return;
				}
			}
			if (this.field2065 < 0) {
				if (this.field2074 < 0) {
					this.field2074 = -1;
					this.method715();
					this.unlink();
					return;
				}
			} else if (this.field2074 >= var5) {
				this.field2074 = var5;
				this.method715();
				this.unlink();
			}
		} else if (this.field2070) {
			if (this.field2065 < 0) {
				if (this.field2074 >= var3) {
					return;
				}
				this.field2074 = var3 + var3 - this.field2074 - 1;
				this.field2065 = -this.field2065;
			}
			while (this.field2074 >= var4) {
				this.field2074 = var4 + var4 - this.field2074 - 1;
				this.field2065 = -this.field2065;
				if (this.field2074 >= var3) {
					return;
				}
				this.field2074 = var3 + var3 - this.field2074 - 1;
				this.field2065 = -this.field2065;
			}
		} else if (this.field2065 < 0) {
			if (this.field2074 < var3) {
				this.field2074 = var4 - (var4 - 1 - this.field2074) % var6 - 1;
			}
		} else if (this.field2074 >= var4) {
			this.field2074 = var3 + (this.field2074 - var3) % var6;
		}
	}

	@ObfuscatedName("n.i()Z")
	public boolean method703() {
		int var1 = this.field2068;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method700(var1, this.field2062);
			var2 = method711(var1, this.field2062);
		}
		if (this.field2066 != var1 || this.field2067 != var3 || this.field2072 != var2) {
			if (this.field2066 < var1) {
				this.field2061 = 1;
				this.field2073 = var1 - this.field2066;
			} else if (this.field2066 > var1) {
				this.field2061 = -1;
				this.field2073 = this.field2066 - var1;
			} else {
				this.field2061 = 0;
			}
			if (this.field2067 < var3) {
				this.field2069 = 1;
				if (this.field2073 == 0 || this.field2073 > var3 - this.field2067) {
					this.field2073 = var3 - this.field2067;
				}
			} else if (this.field2067 > var3) {
				this.field2069 = -1;
				if (this.field2073 == 0 || this.field2073 > this.field2067 - var3) {
					this.field2073 = this.field2067 - var3;
				}
			} else {
				this.field2069 = 0;
			}
			if (this.field2072 < var2) {
				this.field2060 = 1;
				if (this.field2073 == 0 || this.field2073 > var2 - this.field2072) {
					this.field2073 = var2 - this.field2072;
				}
			} else if (this.field2072 > var2) {
				this.field2060 = -1;
				if (this.field2073 == 0 || this.field2073 > this.field2072 - var2) {
					this.field2073 = this.field2072 - var2;
				}
			} else {
				this.field2060 = 0;
			}
			return false;
		} else if (this.field2068 == Integer.MIN_VALUE) {
			this.field2068 = 0;
			this.field2066 = this.field2067 = this.field2072 = 0;
			this.unlink();
			return true;
		} else {
			this.method714();
			return false;
		}
	}

	@ObfuscatedName("n.b([IIIII)I")
	public int method704(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.field2073 <= 0) {
				if (this.field2065 == 256 && (this.field2074 & 0xFF) == 0) {
					if (JavaPcmPlayer.field1310) {
						return method680(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, arg3, arg2, this);
					}
					return method706(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, arg3, arg2, this);
				}
				if (JavaPcmPlayer.field1310) {
					return method694(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, arg3, arg2, this, this.field2065, arg4);
				}
				return method710(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, arg3, arg2, this, this.field2065, arg4);
			}
			int var6 = arg1 + this.field2073;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.field2073 += arg1;
			if (this.field2065 == 256 && (this.field2074 & 0xFF) == 0) {
				if (JavaPcmPlayer.field1310) {
					arg1 = method695(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, this.field2069, this.field2060, var6, arg2, this);
				} else {
					arg1 = method698(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, this.field2061, var6, arg2, this);
				}
			} else if (JavaPcmPlayer.field1310) {
				arg1 = method705(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2067, this.field2072, this.field2069, this.field2060, var6, arg2, this, this.field2065, arg4);
			} else {
				arg1 = method677(((Wave) super.field946).field1343, arg0, this.field2074, arg1, this.field2066, this.field2061, var6, arg2, this, this.field2065, arg4);
			}
			this.field2073 -= arg1;
			if (this.field2073 != 0) {
				return arg1;
			}
		} while (!this.method703());
		return arg3;
	}

	@ObfuscatedName("n.a()I")
	@Override
	public int method87() {
		return this.field2068 == 0 && this.field2073 == 0 ? 0 : 1;
	}

	@ObfuscatedName("n.a(III)V")
	public synchronized void method709(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			this.method691(arg1, arg2);
			return;
		}
		int var4 = method700(arg1, arg2);
		int var5 = method711(arg1, arg2);
		if (this.field2067 == var4 && this.field2072 == var5) {
			this.field2073 = 0;
			return;
		}
		int var6 = arg1 - this.field2066;
		if (this.field2066 - arg1 > var6) {
			var6 = this.field2066 - arg1;
		}
		if (var4 - this.field2067 > var6) {
			var6 = var4 - this.field2067;
		}
		if (this.field2067 - var4 > var6) {
			var6 = this.field2067 - var4;
		}
		if (var5 - this.field2072 > var6) {
			var6 = var5 - this.field2072;
		}
		if (this.field2072 - var5 > var6) {
			var6 = this.field2072 - var5;
		}
		if (arg0 > var6) {
			arg0 = var6;
		}
		this.field2073 = arg0;
		this.field2068 = arg1;
		this.field2062 = arg2;
		this.field2061 = (arg1 - this.field2066) / arg0;
		this.field2069 = (var4 - this.field2067) / arg0;
		this.field2060 = (var5 - this.field2072) / arg0;
	}

	@ObfuscatedName("n.a(Z)V")
	public synchronized void method712() {
		this.field2065 = (this.field2065 ^ this.field2065 >> 31) + (this.field2065 >>> 31);
		this.field2065 = -this.field2065;
	}

	@ObfuscatedName("n.j()V")
	public void method714() {
		this.field2066 = this.field2068;
		this.field2067 = method700(this.field2068, this.field2062);
		this.field2072 = method711(this.field2068, this.field2062);
	}

	@ObfuscatedName("n.k()V")
	public void method715() {
		if (this.field2073 == 0) {
			return;
		}
		if (this.field2068 == Integer.MIN_VALUE) {
			this.field2068 = 0;
		}
		this.field2073 = 0;
		this.method714();
	}

	@ObfuscatedName("n.l()Z")
	public boolean method716() {
		return this.field2073 != 0;
	}
}
