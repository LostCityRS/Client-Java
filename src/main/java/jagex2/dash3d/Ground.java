package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("i")
public final class Ground {

	@ObfuscatedName("i.b")
	public final int[] vertexX;

	@ObfuscatedName("i.c")
	public final int[] vertexY;

	@ObfuscatedName("i.d")
	public final int[] vertexZ;

	@ObfuscatedName("i.e")
	public final int[] faceColourA;

	@ObfuscatedName("i.f")
	public final int[] faceColourB;

	@ObfuscatedName("i.g")
	public final int[] faceColourC;

	@ObfuscatedName("i.h")
	public final int[] faceVertexA;

	@ObfuscatedName("i.i")
	public final int[] faceVertexB;

	@ObfuscatedName("i.j")
	public final int[] faceVertexC;

	@ObfuscatedName("i.k")
	public int[] faceTexture;

	@ObfuscatedName("i.l")
	public boolean flat = true;

	@ObfuscatedName("i.m")
	public final int overlayShape;

	@ObfuscatedName("i.n")
	public final int overlayRotation;

	@ObfuscatedName("i.o")
	public final int minimapOverlay;

	@ObfuscatedName("i.p")
	public final int minimapUnderlay;

	@ObfuscatedName("i.a")
	public final boolean field164 = false;

	@ObfuscatedName("i.q")
	public static final int[] field180 = new int[6];

	@ObfuscatedName("i.r")
	public static final int[] field181 = new int[6];

	@ObfuscatedName("i.s")
	public static final int[] field182 = new int[6];

	@ObfuscatedName("i.t")
	public static final int[] field183 = new int[6];

	@ObfuscatedName("i.u")
	public static final int[] field184 = new int[6];

	@ObfuscatedName("i.v")
	public static final int[] field185 = new int[] { 1, 0 };

	@ObfuscatedName("i.w")
	public static final int[] field186 = new int[] { 2, 1 };

	@ObfuscatedName("i.x")
	public static final int[] field187 = new int[] { 3, 3 };

	@ObfuscatedName("i.y")
	public static final int[][] field188 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.z")
	public static final int[][] field189 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Ground(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg8 != arg1 || arg8 != arg19 || arg8 != arg10) {
			flat = false;
		}
		overlayShape = arg17;
		overlayRotation = arg14;
		minimapOverlay = arg7;
		minimapUnderlay = arg5;
		int[] var21 = field188[arg17];
		int var22 = var21.length;
		vertexX = new int[var22];
		vertexY = new int[var22];
		vertexZ = new int[var22];
		int[] var23 = new int[var22];
		int[] var24 = new int[var22];
		int var25 = arg2 * 128;
		int var26 = arg16 * 128;
		for (int var27 = 0; var27 < var22; var27++) {
			int var28 = var21[var27];
			if ((var28 & 0x1) == 0 && var28 <= 8) {
				var28 = (var28 - arg14 - arg14 - 1 & 0x7) + 1;
			}
			if (var28 > 8 && var28 <= 12) {
				var28 = (var28 - arg14 - 9 & 0x3) + 9;
			}
			if (var28 > 12 && var28 <= 16) {
				var28 = (var28 - arg14 - 13 & 0x3) + 13;
			}
			int var29;
			int var30;
			int var31;
			int var32;
			int var33;
			if (var28 == 1) {
				var29 = var25;
				var30 = var26;
				var31 = arg8;
				var32 = arg3;
				var33 = arg0;
			} else if (var28 == 2) {
				var29 = var25 + 64;
				var30 = var26;
				var31 = arg8 + arg1 >> 1;
				var32 = arg3 + arg18 >> 1;
				var33 = arg0 + arg11 >> 1;
			} else if (var28 == 3) {
				var29 = var25 + 128;
				var30 = var26;
				var31 = arg1;
				var32 = arg18;
				var33 = arg11;
			} else if (var28 == 4) {
				var29 = var25 + 128;
				var30 = var26 + 64;
				var31 = arg1 + arg19 >> 1;
				var32 = arg18 + arg6 >> 1;
				var33 = arg11 + arg15 >> 1;
			} else if (var28 == 5) {
				var29 = var25 + 128;
				var30 = var26 + 128;
				var31 = arg19;
				var32 = arg6;
				var33 = arg15;
			} else if (var28 == 6) {
				var29 = var25 + 64;
				var30 = var26 + 128;
				var31 = arg19 + arg10 >> 1;
				var32 = arg6 + arg4 >> 1;
				var33 = arg15 + arg12 >> 1;
			} else if (var28 == 7) {
				var29 = var25;
				var30 = var26 + 128;
				var31 = arg10;
				var32 = arg4;
				var33 = arg12;
			} else if (var28 == 8) {
				var29 = var25;
				var30 = var26 + 64;
				var31 = arg10 + arg8 >> 1;
				var32 = arg4 + arg3 >> 1;
				var33 = arg12 + arg0 >> 1;
			} else if (var28 == 9) {
				var29 = var25 + 64;
				var30 = var26 + 32;
				var31 = arg8 + arg1 >> 1;
				var32 = arg3 + arg18 >> 1;
				var33 = arg0 + arg11 >> 1;
			} else if (var28 == 10) {
				var29 = var25 + 96;
				var30 = var26 + 64;
				var31 = arg1 + arg19 >> 1;
				var32 = arg18 + arg6 >> 1;
				var33 = arg11 + arg15 >> 1;
			} else if (var28 == 11) {
				var29 = var25 + 64;
				var30 = var26 + 96;
				var31 = arg19 + arg10 >> 1;
				var32 = arg6 + arg4 >> 1;
				var33 = arg15 + arg12 >> 1;
			} else if (var28 == 12) {
				var29 = var25 + 32;
				var30 = var26 + 64;
				var31 = arg10 + arg8 >> 1;
				var32 = arg4 + arg3 >> 1;
				var33 = arg12 + arg0 >> 1;
			} else if (var28 == 13) {
				var29 = var25 + 32;
				var30 = var26 + 32;
				var31 = arg8;
				var32 = arg3;
				var33 = arg0;
			} else if (var28 == 14) {
				var29 = var25 + 96;
				var30 = var26 + 32;
				var31 = arg1;
				var32 = arg18;
				var33 = arg11;
			} else if (var28 == 15) {
				var29 = var25 + 96;
				var30 = var26 + 96;
				var31 = arg19;
				var32 = arg6;
				var33 = arg15;
			} else {
				var29 = var25 + 32;
				var30 = var26 + 96;
				var31 = arg10;
				var32 = arg4;
				var33 = arg12;
			}
			vertexX[var27] = var29;
			vertexY[var27] = var31;
			vertexZ[var27] = var30;
			var23[var27] = var32;
			var24[var27] = var33;
		}
		int[] var34 = field189[arg17];
		int var35 = var34.length / 4;
		faceVertexA = new int[var35];
		faceVertexB = new int[var35];
		faceVertexC = new int[var35];
		faceColourA = new int[var35];
		faceColourB = new int[var35];
		faceColourC = new int[var35];
		if (arg9 != -1) {
			faceTexture = new int[var35];
		}
		int var36 = 0;
		for (int var37 = 0; var37 < var35; var37++) {
			int var38 = var34[var36];
			int var39 = var34[var36 + 1];
			int var40 = var34[var36 + 2];
			int var41 = var34[var36 + 3];
			var36 += 4;
			if (var39 < 4) {
				var39 = var39 - arg14 & 0x3;
			}
			if (var40 < 4) {
				var40 = var40 - arg14 & 0x3;
			}
			if (var41 < 4) {
				var41 = var41 - arg14 & 0x3;
			}
			faceVertexA[var37] = var39;
			faceVertexB[var37] = var40;
			faceVertexC[var37] = var41;
			if (var38 == 0) {
				faceColourA[var37] = var23[var39];
				faceColourB[var37] = var23[var40];
				faceColourC[var37] = var23[var41];
				if (faceTexture != null) {
					faceTexture[var37] = -1;
				}
			} else {
				faceColourA[var37] = var24[var39];
				faceColourB[var37] = var24[var40];
				faceColourC[var37] = var24[var41];
				if (faceTexture != null) {
					faceTexture[var37] = arg9;
				}
			}
		}
		int var42 = arg8;
		int var43 = arg1;
		if (arg1 < arg8) {
			var42 = arg1;
		}
		if (arg1 > arg1) {
			var43 = arg1;
		}
		if (arg19 < var42) {
			var42 = arg19;
		}
		if (arg19 > arg1) {
			var43 = arg19;
		}
		if (arg10 < var42) {
			;
		}
		if (arg10 > var43) {
			;
		}
	}
}
