package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("oj")
public final class WaveStream extends PcmStream {

	@ObfuscatedName("oj.C")
	public final int loopStartPosition;

	@ObfuscatedName("oj.H")
	public final int loopEndPosition;

	@ObfuscatedName("oj.G")
	public final boolean loopReversed;

	@ObfuscatedName("oj.y")
	public int pitch;

	@ObfuscatedName("oj.I")
	public int volume;

	@ObfuscatedName("oj.M")
	public int pan;

	@ObfuscatedName("oj.A")
	public int position;

	@ObfuscatedName("oj.x")
	public int volumeStereoRight;

	@ObfuscatedName("oj.z")
	public int loopCount;

	@ObfuscatedName("oj.B")
	public int volumeChangeSpeedStereoLeft;

	@ObfuscatedName("oj.E")
	public int volumeChangeSpeedMono;

	@ObfuscatedName("oj.F")
	public int volumeMono;

	@ObfuscatedName("oj.K")
	public int volumeChangeSpeedStereoRight;

	@ObfuscatedName("oj.L")
	public int volumeChangeDelta;

	@ObfuscatedName("oj.N")
	public int volumeStereoLeft;

	@ObfuscatedName("oj.a(II[B[IIIIIIIILoj;II)I")
	public static int doMixForwardsRampMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
		arg8.volumeStereoLeft -= arg8.volumeChangeSpeedStereoLeft * arg3;
		arg8.volumeStereoRight -= arg8.volumeChangeSpeedStereoRight * arg3;
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
		arg8.volumeStereoLeft += arg8.volumeChangeSpeedStereoLeft * arg3;
		arg8.volumeStereoRight += arg8.volumeChangeSpeedStereoRight * arg3;
		arg8.volumeMono = arg4;
		arg8.position = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.a([B[IIIIIIILoj;)I")
	public static int doMixBackwards1To1Mono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7) {
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
		arg7.position = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.a(II[B[IIIIIIIIIILoj;II)I")
	public static int doMixForwardsRampStereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10, int arg11, int arg12) {
		arg10.volumeMono -= arg10.volumeChangeSpeedMono * arg3;
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
		arg10.volumeMono += arg10.volumeChangeSpeedMono * var23;
		arg10.volumeStereoLeft = arg4;
		arg10.volumeStereoRight = arg5;
		arg10.position = arg2;
		return var23;
	}

	@ObfuscatedName("oj.a(I[B[IIIIIIIILoj;)I")
	public static int doMixBackwards1To1Stereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
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
		arg8.position = var9 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("oj.a([B[IIIIIIIILoj;)I")
	public static int doMixBackwards1To1RampMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var9 + 1 - var10) > arg6) {
			var13 = arg6;
		}
		arg8.volumeStereoLeft += arg8.volumeChangeSpeedStereoLeft * (var13 - arg3);
		arg8.volumeStereoRight += arg8.volumeChangeSpeedStereoRight * (var13 - arg3);
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
		arg8.volumeMono = var11 >> 2;
		arg8.position = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.b(I[B[IIIIIIIILoj;)I")
	public static int doMixForwards1To1Stereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
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
		arg8.position = var9 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("oj.a(I[B[IIIIIIIIIILoj;)I")
	public static int doMixBackwards1To1RampStereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10) {
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
		arg10.volumeMono += arg10.volumeChangeSpeedMono * (var17 - arg3);
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
		arg10.volumeStereoLeft = var13 >> 2;
		arg10.volumeStereoRight = var14 >> 2;
		arg10.position = var11 << 8;
		return var18 >> 1;
	}

	@ObfuscatedName("oj.a(Ltf;III)Loj;")
	public static WaveStream newRateFineVolPan(Wave arg0, int arg1, int arg2, int arg3) {
		return arg0.samples == null || arg0.samples.length == 0 ? null : new WaveStream(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("oj.b(I[B[IIIIIIIIIILoj;)I")
	public static int doMixForwards1To1RampStereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10) {
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
		arg10.volumeMono += arg10.volumeChangeSpeedMono * (var17 - arg3);
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
		arg10.volumeStereoLeft = var13 >> 2;
		arg10.volumeStereoRight = var14 >> 2;
		arg10.position = var11 << 8;
		return var18 >> 1;
	}

	@ObfuscatedName("oj.b([B[IIIIIIILoj;)I")
	public static int doMixForwards1To1Mono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7) {
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
		arg7.position = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.b(II)I")
	public static int getRVol(int arg0, int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("oj.c(II)I")
	public static int getLVol(int arg0, int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("oj.a(II[B[IIIIIIILoj;II)I")
	public static int doMixBackwardsMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7, int arg8, int arg9) {
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
		arg7.position = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.b(II[B[IIIIIIIIIILoj;II)I")
	public static int doMixBackwardsRampStereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, WaveStream arg10, int arg11, int arg12) {
		arg10.volumeMono -= arg10.volumeChangeSpeedMono * arg3;
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
		arg10.volumeMono += arg10.volumeChangeSpeedMono * var22;
		arg10.volumeStereoLeft = arg4;
		arg10.volumeStereoRight = arg5;
		arg10.position = arg2;
		return var22;
	}

	@ObfuscatedName("oj.b(II[B[IIIIIIIILoj;II)I")
	public static int doMixBackwardsRampMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
		arg8.volumeStereoLeft -= arg8.volumeChangeSpeedStereoLeft * arg3;
		arg8.volumeStereoRight -= arg8.volumeChangeSpeedStereoRight * arg3;
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
		arg8.volumeStereoLeft += arg8.volumeChangeSpeedStereoLeft * arg3;
		arg8.volumeStereoRight += arg8.volumeChangeSpeedStereoRight * arg3;
		arg8.volumeMono = arg4;
		arg8.position = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.c(II[B[IIIIIIIILoj;II)I")
	public static int doMixBackwardsStereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
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
		arg8.position = arg2;
		return var12 >> 1;
	}

	@ObfuscatedName("oj.b([B[IIIIIIIILoj;)I")
	public static int doMixForwards1To1RampMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12 = arg5 << 2;
		int var13;
		if ((var13 = arg3 + var10 - var9) > arg6) {
			var13 = arg6;
		}
		arg8.volumeStereoLeft += arg8.volumeChangeSpeedStereoLeft * (var13 - arg3);
		arg8.volumeStereoRight += arg8.volumeChangeSpeedStereoRight * (var13 - arg3);
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
		arg8.volumeMono = var11 >> 2;
		arg8.position = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("oj.b(II[B[IIIIIIILoj;II)I")
	public static int doMixForwardsMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7, int arg8, int arg9) {
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
		arg7.position = arg2;
		return arg3;
	}

	@ObfuscatedName("oj.a(Ltf;II)Loj;")
	public static WaveStream newRatePercent(Wave arg0, int arg1) {
		return arg0.samples == null || arg0.samples.length == 0 ? null : new WaveStream(arg0, (int) ((long) arg0.samplingFrequency * 256L * (long) 100 / (long) (PcmPlayer.frequency * 100)), arg1 << 6);
	}

	@ObfuscatedName("oj.d(II[B[IIIIIIIILoj;II)I")
	public static int doMixForwardsStereo(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, WaveStream arg8, int arg9, int arg10) {
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
		arg8.position = arg2;
		return var12 >> 1;
	}

	public WaveStream(Wave arg0, int arg1, int arg2) {
		super.sound = arg0;
		this.loopStartPosition = arg0.loopStartPosition;
		this.loopEndPosition = arg0.loopEndPosition;
		this.loopReversed = arg0.loopReversed;
		this.pitch = arg1;
		this.volume = arg2;
		this.pan = 8192;
		this.position = 0;
		this.setMLRVol();
	}

	public WaveStream(Wave arg0, int arg1, int arg2, int arg3) {
		super.sound = arg0;
		this.loopStartPosition = arg0.loopStartPosition;
		this.loopEndPosition = arg0.loopEndPosition;
		this.loopReversed = arg0.loopReversed;
		this.pitch = arg1;
		this.volume = arg2;
		this.pan = arg3;
		this.position = 0;
		this.setMLRVol();
	}

	@ObfuscatedName("oj.c(I)V")
	public synchronized void rampOut(int arg0) {
		if (arg0 == 0) {
			this.method1091();
			this.unlink();
		} else if (this.volumeStereoLeft == 0 && this.volumeStereoRight == 0) {
			this.volumeChangeDelta = 0;
			this.volume = 0;
			this.volumeMono = 0;
			this.unlink();
		} else {
			int var2 = -this.volumeMono;
			if (this.volumeMono > var2) {
				var2 = this.volumeMono;
			}
			if (-this.volumeStereoLeft > var2) {
				var2 = -this.volumeStereoLeft;
			}
			if (this.volumeStereoLeft > var2) {
				var2 = this.volumeStereoLeft;
			}
			if (-this.volumeStereoRight > var2) {
				var2 = -this.volumeStereoRight;
			}
			if (this.volumeStereoRight > var2) {
				var2 = this.volumeStereoRight;
			}
			if (arg0 > var2) {
				arg0 = var2;
			}
			this.volumeChangeDelta = arg0;
			this.volume = Integer.MIN_VALUE;
			this.volumeChangeSpeedMono = -this.volumeMono / arg0;
			this.volumeChangeSpeedStereoLeft = -this.volumeStereoLeft / arg0;
			this.volumeChangeSpeedStereoRight = -this.volumeStereoRight / arg0;
		}
	}

	@ObfuscatedName("oj.c()I")
	@Override
	public int selfMixCost() {
		return this.volume == 0 && this.volumeChangeDelta == 0 ? 0 : 1;
	}

	@ObfuscatedName("oj.e()Z")
	public boolean finaliseRamp() {
		int var1 = this.volume;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = getLVol(var1, this.pan);
			var2 = getRVol(var1, this.pan);
		}
		if (this.volumeMono != var1 || this.volumeStereoLeft != var3 || this.volumeStereoRight != var2) {
			if (this.volumeMono < var1) {
				this.volumeChangeSpeedMono = 1;
				this.volumeChangeDelta = var1 - this.volumeMono;
			} else if (this.volumeMono > var1) {
				this.volumeChangeSpeedMono = -1;
				this.volumeChangeDelta = this.volumeMono - var1;
			} else {
				this.volumeChangeSpeedMono = 0;
			}
			if (this.volumeStereoLeft < var3) {
				this.volumeChangeSpeedStereoLeft = 1;
				if (this.volumeChangeDelta == 0 || this.volumeChangeDelta > var3 - this.volumeStereoLeft) {
					this.volumeChangeDelta = var3 - this.volumeStereoLeft;
				}
			} else if (this.volumeStereoLeft > var3) {
				this.volumeChangeSpeedStereoLeft = -1;
				if (this.volumeChangeDelta == 0 || this.volumeChangeDelta > this.volumeStereoLeft - var3) {
					this.volumeChangeDelta = this.volumeStereoLeft - var3;
				}
			} else {
				this.volumeChangeSpeedStereoLeft = 0;
			}
			if (this.volumeStereoRight < var2) {
				this.volumeChangeSpeedStereoRight = 1;
				if (this.volumeChangeDelta == 0 || this.volumeChangeDelta > var2 - this.volumeStereoRight) {
					this.volumeChangeDelta = var2 - this.volumeStereoRight;
				}
			} else if (this.volumeStereoRight > var2) {
				this.volumeChangeSpeedStereoRight = -1;
				if (this.volumeChangeDelta == 0 || this.volumeChangeDelta > this.volumeStereoRight - var2) {
					this.volumeChangeDelta = this.volumeStereoRight - var2;
				}
			} else {
				this.volumeChangeSpeedStereoRight = 0;
			}
			return false;
		} else if (this.volume == Integer.MIN_VALUE) {
			this.volume = 0;
			this.volumeMono = this.volumeStereoLeft = this.volumeStereoRight = 0;
			this.unlink();
			return true;
		} else {
			this.setMLRVol();
			return false;
		}
	}

	@ObfuscatedName("oj.d(I)V")
	public synchronized void method1091() {
		this.setVolPanFine(0, this.getPanFine());
	}

	@ObfuscatedName("oj.b()I")
	@Override
	public int priority() {
		int var1 = this.volumeMono * 3 >> 6;
		int var2 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.loopCount == 0) {
			var2 -= var2 * this.position / (((Wave) super.sound).samples.length << 8);
		} else if (this.loopCount >= 0) {
			var2 -= var2 * this.loopStartPosition / ((Wave) super.sound).samples.length;
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("oj.a(III)V")
	public synchronized void rampVolPanFine(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			this.setVolPanFine(arg1, arg2);
			return;
		}
		int var4 = getLVol(arg1, arg2);
		int var5 = getRVol(arg1, arg2);
		if (this.volumeStereoLeft == var4 && this.volumeStereoRight == var5) {
			this.volumeChangeDelta = 0;
			return;
		}
		int var6 = arg1 - this.volumeMono;
		if (this.volumeMono - arg1 > var6) {
			var6 = this.volumeMono - arg1;
		}
		if (var4 - this.volumeStereoLeft > var6) {
			var6 = var4 - this.volumeStereoLeft;
		}
		if (this.volumeStereoLeft - var4 > var6) {
			var6 = this.volumeStereoLeft - var4;
		}
		if (var5 - this.volumeStereoRight > var6) {
			var6 = var5 - this.volumeStereoRight;
		}
		if (this.volumeStereoRight - var5 > var6) {
			var6 = this.volumeStereoRight - var5;
		}
		if (arg0 > var6) {
			arg0 = var6;
		}
		this.volumeChangeDelta = arg0;
		this.volume = arg1;
		this.pan = arg2;
		this.volumeChangeSpeedMono = (arg1 - this.volumeMono) / arg0;
		this.volumeChangeSpeedStereoLeft = (var4 - this.volumeStereoLeft) / arg0;
		this.volumeChangeSpeedStereoRight = (var5 - this.volumeStereoRight) / arg0;
	}

	@ObfuscatedName("oj.f()I")
	public synchronized int getVolumeFine() {
		return this.volume == Integer.MIN_VALUE ? 0 : this.volume;
	}

	@ObfuscatedName("oj.a([IIIII)I")
	public int mixForwardSto(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.volumeChangeDelta <= 0) {
				if (this.pitch == 256 && (this.position & 0xFF) == 0) {
					if (PcmPlayer.stereo) {
						return doMixForwards1To1Stereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, arg3, arg2, this);
					}
					return doMixForwards1To1Mono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this);
				}
				if (PcmPlayer.stereo) {
					return doMixForwardsStereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, arg3, arg2, this, this.pitch, arg4);
				}
				return doMixForwardsMono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this, this.pitch, arg4);
			}
			int var6 = arg1 + this.volumeChangeDelta;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.volumeChangeDelta += arg1;
			if (this.pitch == 256 && (this.position & 0xFF) == 0) {
				if (PcmPlayer.stereo) {
					arg1 = doMixForwards1To1RampStereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, this.volumeChangeSpeedStereoLeft, this.volumeChangeSpeedStereoRight, var6, arg2, this);
				} else {
					arg1 = doMixForwards1To1RampMono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, this.volumeChangeSpeedMono, var6, arg2, this);
				}
			} else if (PcmPlayer.stereo) {
				arg1 = doMixForwardsRampStereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, this.volumeChangeSpeedStereoLeft, this.volumeChangeSpeedStereoRight, var6, arg2, this, this.pitch, arg4);
			} else {
				arg1 = doMixForwardsRampMono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, this.volumeChangeSpeedMono, var6, arg2, this, this.pitch, arg4);
			}
			this.volumeChangeDelta -= arg1;
			if (this.volumeChangeDelta != 0) {
				return arg1;
			}
		} while (!this.finaliseRamp());
		return arg3;
	}

	@ObfuscatedName("oj.g()I")
	public synchronized int getPanFine() {
		return this.pan < 0 ? -1 : this.pan;
	}

	@ObfuscatedName("oj.h()I")
	public synchronized int getRateRaw() {
		return this.pitch < 0 ? -this.pitch : this.pitch;
	}

	@ObfuscatedName("oj.e(I)V")
	public synchronized void setRateRaw(int arg0) {
		if (this.pitch < 0) {
			this.pitch = -arg0;
		} else {
			this.pitch = arg0;
		}
	}

	@ObfuscatedName("oj.f(I)V")
	public synchronized void setPosition(int arg0) {
		int var2 = ((Wave) super.sound).samples.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > var2) {
			arg0 = var2;
		}
		this.position = arg0;
	}

	@ObfuscatedName("oj.a()Lef;")
	@Override
	public PcmStream substreamNext() {
		return null;
	}

	@ObfuscatedName("oj.d()Lef;")
	@Override
	public PcmStream substreamStart() {
		return null;
	}

	@ObfuscatedName("oj.b(Z)V")
	public synchronized void method1111() {
		this.pitch = (this.pitch ^ this.pitch >> 31) + (this.pitch >>> 31);
		this.pitch = -this.pitch;
	}

	@ObfuscatedName("oj.i()V")
	public void skipRampNounLink() {
		if (this.volumeChangeDelta == 0) {
			return;
		}
		if (this.volume == Integer.MIN_VALUE) {
			this.volume = 0;
		}
		this.volumeChangeDelta = 0;
		this.setMLRVol();
	}

	@ObfuscatedName("oj.j()V")
	public void setMLRVol() {
		this.volumeMono = this.volume;
		this.volumeStereoLeft = getLVol(this.volume, this.pan);
		this.volumeStereoRight = getRVol(this.volume, this.pan);
	}

	@ObfuscatedName("oj.d(II)V")
	public synchronized void setVolPanFine(int arg0, int arg1) {
		this.volume = arg0;
		this.pan = arg1;
		this.volumeChangeDelta = 0;
		this.setMLRVol();
	}

	@ObfuscatedName("oj.e(II)V")
	public synchronized void rampVolumeFine(int arg0, int arg1) {
		this.rampVolPanFine(arg0, arg1, this.getPanFine());
	}

	@ObfuscatedName("oj.a([III)V")
	@Override
	public synchronized void doMix(int[] arg0, int arg1, int arg2) {
		if (this.volume == 0 && this.volumeChangeDelta == 0) {
			this.pretendToMix(arg2);
			return;
		}
		Wave var4 = (Wave) super.sound;
		int var5 = this.loopStartPosition << 8;
		int var6 = this.loopEndPosition << 8;
		int var7 = var4.samples.length << 8;
		int var8 = var6 - var5;
		if (var8 <= 0) {
			this.loopCount = 0;
		}
		int var9 = arg1;
		int var10 = arg2 + arg1;
		if (this.position < 0) {
			if (this.pitch <= 0) {
				this.skipRampNounLink();
				this.unlink();
				return;
			}
			this.position = 0;
		}
		if (this.position >= var7) {
			if (this.pitch >= 0) {
				this.skipRampNounLink();
				this.unlink();
				return;
			}
			this.position = var7 - 1;
		}
		if (this.loopCount >= 0) {
			if (this.loopCount > 0) {
				if (this.loopReversed) {
					label130: {
						if (this.pitch < 0) {
							var9 = this.mixBackwardSto(arg0, arg1, var5, var10, var4.samples[this.loopStartPosition]);
							if (this.position >= var5) {
								return;
							}
							this.position = var5 + var5 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break label130;
							}
						}
						do {
							var9 = this.mixForwardSto(arg0, var9, var6, var10, var4.samples[this.loopEndPosition - 1]);
							if (this.position < var6) {
								return;
							}
							this.position = var6 + var6 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break;
							}
							var9 = this.mixBackwardSto(arg0, var9, var5, var10, var4.samples[this.loopStartPosition]);
							if (this.position >= var5) {
								return;
							}
							this.position = var5 + var5 - this.position - 1;
							this.pitch = -this.pitch;
						} while (--this.loopCount != 0);
					}
				} else if (this.pitch < 0) {
					while (true) {
						var9 = this.mixBackwardSto(arg0, var9, var5, var10, var4.samples[this.loopEndPosition - 1]);
						if (this.position >= var5) {
							return;
						}
						int var12 = (var6 - this.position - 1) / var8;
						if (var12 >= this.loopCount) {
							this.position += var8 * this.loopCount;
							this.loopCount = 0;
							break;
						}
						this.position += var8 * var12;
						this.loopCount -= var12;
					}
				} else {
					while (true) {
						var9 = this.mixForwardSto(arg0, var9, var6, var10, var4.samples[this.loopStartPosition]);
						if (this.position < var6) {
							return;
						}
						int var13 = (this.position - var5) / var8;
						if (var13 >= this.loopCount) {
							this.position -= var8 * this.loopCount;
							this.loopCount = 0;
							break;
						}
						this.position -= var8 * var13;
						this.loopCount -= var13;
					}
				}
			}
			if (this.pitch < 0) {
				this.mixBackwardSto(arg0, var9, 0, var10, 0);
				if (this.position < 0) {
					this.position = -1;
					this.skipRampNounLink();
					this.unlink();
					return;
				}
			} else {
				this.mixForwardSto(arg0, var9, var7, var10, 0);
				if (this.position >= var7) {
					this.position = var7;
					this.skipRampNounLink();
					this.unlink();
				}
			}
		} else if (this.loopReversed) {
			if (this.pitch < 0) {
				var9 = this.mixBackwardSto(arg0, arg1, var5, var10, var4.samples[this.loopStartPosition]);
				if (this.position >= var5) {
					return;
				}
				this.position = var5 + var5 - this.position - 1;
				this.pitch = -this.pitch;
			}
			while (true) {
				int var11 = this.mixForwardSto(arg0, var9, var6, var10, var4.samples[this.loopEndPosition - 1]);
				if (this.position < var6) {
					return;
				}
				this.position = var6 + var6 - this.position - 1;
				this.pitch = -this.pitch;
				var9 = this.mixBackwardSto(arg0, var11, var5, var10, var4.samples[this.loopStartPosition]);
				if (this.position >= var5) {
					return;
				}
				this.position = var5 + var5 - this.position - 1;
				this.pitch = -this.pitch;
			}
		} else if (this.pitch < 0) {
			while (true) {
				var9 = this.mixBackwardSto(arg0, var9, var5, var10, var4.samples[this.loopEndPosition - 1]);
				if (this.position >= var5) {
					return;
				}
				this.position = var6 - (var6 - 1 - this.position) % var8 - 1;
			}
		} else {
			while (true) {
				var9 = this.mixForwardSto(arg0, var9, var6, var10, var4.samples[this.loopStartPosition]);
				if (this.position < var6) {
					return;
				}
				this.position = var5 + (this.position - var5) % var8;
			}
		}
	}

	@ObfuscatedName("oj.g(I)V")
	public synchronized void applyVolume(int arg0) {
		this.setVolPanFine(arg0 << 6, this.getPanFine());
	}

	@ObfuscatedName("oj.b([IIIII)I")
	public int mixBackwardSto(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.volumeChangeDelta <= 0) {
				if (this.pitch == -256 && (this.position & 0xFF) == 0) {
					if (PcmPlayer.stereo) {
						return doMixBackwards1To1Stereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, arg3, arg2, this);
					}
					return doMixBackwards1To1Mono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this);
				}
				if (PcmPlayer.stereo) {
					return doMixBackwardsStereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, arg3, arg2, this, this.pitch, arg4);
				}
				return doMixBackwardsMono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this, this.pitch, arg4);
			}
			int var6 = arg1 + this.volumeChangeDelta;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.volumeChangeDelta += arg1;
			if (this.pitch == -256 && (this.position & 0xFF) == 0) {
				if (PcmPlayer.stereo) {
					arg1 = doMixBackwards1To1RampStereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, this.volumeChangeSpeedStereoLeft, this.volumeChangeSpeedStereoRight, var6, arg2, this);
				} else {
					arg1 = doMixBackwards1To1RampMono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, this.volumeChangeSpeedMono, var6, arg2, this);
				}
			} else if (PcmPlayer.stereo) {
				arg1 = doMixBackwardsRampStereo(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeStereoLeft, this.volumeStereoRight, this.volumeChangeSpeedStereoLeft, this.volumeChangeSpeedStereoRight, var6, arg2, this, this.pitch, arg4);
			} else {
				arg1 = doMixBackwardsRampMono(((Wave) super.sound).samples, arg0, this.position, arg1, this.volumeMono, this.volumeChangeSpeedMono, var6, arg2, this, this.pitch, arg4);
			}
			this.volumeChangeDelta -= arg1;
			if (this.volumeChangeDelta != 0) {
				return arg1;
			}
		} while (!this.finaliseRamp());
		return arg3;
	}

	@ObfuscatedName("oj.h(I)V")
	public synchronized void setLoopCount(int arg0) {
		this.loopCount = arg0;
	}

	@ObfuscatedName("oj.k()Z")
	public boolean isFinished() {
		return this.position < 0 || this.position >= ((Wave) super.sound).samples.length << 8;
	}

	@ObfuscatedName("oj.b(I)V")
	@Override
	public synchronized void pretendToMix(int arg0) {
		if (this.volumeChangeDelta > 0) {
			if (arg0 >= this.volumeChangeDelta) {
				if (this.volume == Integer.MIN_VALUE) {
					this.volume = 0;
					this.volumeMono = this.volumeStereoLeft = this.volumeStereoRight = 0;
					this.unlink();
					arg0 = this.volumeChangeDelta;
				}
				this.volumeChangeDelta = 0;
				this.setMLRVol();
			} else {
				this.volumeMono += this.volumeChangeSpeedMono * arg0;
				this.volumeStereoLeft += this.volumeChangeSpeedStereoLeft * arg0;
				this.volumeStereoRight += this.volumeChangeSpeedStereoRight * arg0;
				this.volumeChangeDelta -= arg0;
			}
		}
		Wave var2 = (Wave) super.sound;
		int var3 = this.loopStartPosition << 8;
		int var4 = this.loopEndPosition << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.loopCount = 0;
		}
		if (this.position < 0) {
			if (this.pitch <= 0) {
				this.skipRampNounLink();
				this.unlink();
				return;
			}
			this.position = 0;
		}
		if (this.position >= var5) {
			if (this.pitch >= 0) {
				this.skipRampNounLink();
				this.unlink();
				return;
			}
			this.position = var5 - 1;
		}
		this.position += this.pitch * arg0;
		if (this.loopCount >= 0) {
			if (this.loopCount > 0) {
				if (this.loopReversed) {
					label125: {
						if (this.pitch < 0) {
							if (this.position >= var3) {
								return;
							}
							this.position = var3 + var3 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break label125;
							}
						}
						do {
							if (this.position < var4) {
								return;
							}
							this.position = var4 + var4 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break;
							}
							if (this.position >= var3) {
								return;
							}
							this.position = var3 + var3 - this.position - 1;
							this.pitch = -this.pitch;
						} while (--this.loopCount != 0);
					}
				} else if (this.pitch < 0) {
					if (this.position >= var3) {
						return;
					}
					int var7 = (var4 - this.position - 1) / var6;
					if (var7 < this.loopCount) {
						this.position += var6 * var7;
						this.loopCount -= var7;
						return;
					}
					this.position += var6 * this.loopCount;
					this.loopCount = 0;
				} else if (this.position >= var4) {
					int var8 = (this.position - var3) / var6;
					if (var8 < this.loopCount) {
						this.position -= var6 * var8;
						this.loopCount -= var8;
						return;
					}
					this.position -= var6 * this.loopCount;
					this.loopCount = 0;
				} else {
					return;
				}
			}
			if (this.pitch < 0) {
				if (this.position < 0) {
					this.position = -1;
					this.skipRampNounLink();
					this.unlink();
					return;
				}
			} else if (this.position >= var5) {
				this.position = var5;
				this.skipRampNounLink();
				this.unlink();
			}
		} else if (this.loopReversed) {
			if (this.pitch < 0) {
				if (this.position >= var3) {
					return;
				}
				this.position = var3 + var3 - this.position - 1;
				this.pitch = -this.pitch;
			}
			while (this.position >= var4) {
				this.position = var4 + var4 - this.position - 1;
				this.pitch = -this.pitch;
				if (this.position >= var3) {
					return;
				}
				this.position = var3 + var3 - this.position - 1;
				this.pitch = -this.pitch;
			}
		} else if (this.pitch < 0) {
			if (this.position < var3) {
				this.position = var4 - (var4 - 1 - this.position) % var6 - 1;
			}
		} else if (this.position >= var4) {
			this.position = var3 + (this.position - var3) % var6;
		}
	}

	@ObfuscatedName("oj.l()Z")
	public boolean isRamping() {
		return this.volumeChangeDelta != 0;
	}
}
