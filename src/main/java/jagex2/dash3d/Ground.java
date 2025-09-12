package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("j")
public class Ground {

	@ObfuscatedName("j.a")
	public int[] vertexX;

	@ObfuscatedName("j.b")
	public int[] vertexY;

	@ObfuscatedName("j.c")
	public int[] vertexZ;

	@ObfuscatedName("j.d")
	public int[] triangleColourA;

	@ObfuscatedName("j.e")
	public int[] triangleColourB;

	@ObfuscatedName("j.f")
	public int[] triangleColourC;

	@ObfuscatedName("j.g")
	public int[] triangleVertexA;

	@ObfuscatedName("j.h")
	public int[] triangleVertexB;

	@ObfuscatedName("j.i")
	public int[] triangleVertexC;

	@ObfuscatedName("j.j")
	public int[] triangleTexture;

	@ObfuscatedName("j.k")
	public boolean flat = true;

	@ObfuscatedName("j.l")
	public int shape;

	@ObfuscatedName("j.m")
	public int angle;

	@ObfuscatedName("j.n")
	public int underlayColour;

	@ObfuscatedName("j.o")
	public int overlayColour;

	@ObfuscatedName("j.p")
	public static int[] drawVertexX = new int[6];

	@ObfuscatedName("j.q")
	public static int[] drawVertexY = new int[6];

	@ObfuscatedName("j.r")
	public static int[] drawTextureVertexX = new int[6];

	@ObfuscatedName("j.s")
	public static int[] drawTextureVertexY = new int[6];

	@ObfuscatedName("j.t")
	public static int[] drawTextureVertexZ = new int[6];

	@ObfuscatedName("j.u")
	public static int[] shape0P1 = new int[] { 1, 0 };

	@ObfuscatedName("j.v")
	public static int[] shape0P2 = new int[] { 2, 1 };

	@ObfuscatedName("j.w")
	public static int[] shape0P3 = new int[] { 3, 3 };

	@ObfuscatedName("j.x")
	public static final int[][] defShapeP = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("j.y")
	public static final int[][] defShapeF = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Ground(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg4 != arg11 || arg4 != arg16 || arg4 != arg5) {
			this.flat = false;
		}
		this.shape = arg9;
		this.angle = arg19;
		this.underlayColour = arg8;
		this.overlayColour = arg18;
		short var21 = 128;
		int var22 = var21 / 2;
		int var23 = var21 / 4;
		int var24 = var21 * 3 / 4;
		int[] var25 = defShapeP[arg9];
		int var26 = var25.length;
		this.vertexX = new int[var26];
		this.vertexY = new int[var26];
		this.vertexZ = new int[var26];
		int[] var27 = new int[var26];
		int[] var28 = new int[var26];
		int var29 = arg0 * var21;
		int var30 = arg3 * var21;
		for (int var31 = 0; var31 < var26; var31++) {
			int var32 = var25[var31];
			if ((var32 & 0x1) == 0 && var32 <= 8) {
				var32 = (var32 - arg19 - arg19 - 1 & 0x7) + 1;
			}
			if (var32 > 8 && var32 <= 12) {
				var32 = (var32 - 9 - arg19 & 0x3) + 9;
			}
			if (var32 > 12 && var32 <= 16) {
				var32 = (var32 - 13 - arg19 & 0x3) + 13;
			}
			int var33;
			int var34;
			int var35;
			int var36;
			int var37;
			if (var32 == 1) {
				var33 = var29;
				var34 = var30;
				var35 = arg4;
				var36 = arg6;
				var37 = arg17;
			} else if (var32 == 2) {
				var33 = var29 + var22;
				var34 = var30;
				var35 = arg4 + arg11 >> 1;
				var36 = arg6 + arg2 >> 1;
				var37 = arg17 + arg13 >> 1;
			} else if (var32 == 3) {
				var33 = var29 + var21;
				var34 = var30;
				var35 = arg11;
				var36 = arg2;
				var37 = arg13;
			} else if (var32 == 4) {
				var33 = var29 + var21;
				var34 = var30 + var22;
				var35 = arg11 + arg16 >> 1;
				var36 = arg2 + arg15 >> 1;
				var37 = arg13 + arg7 >> 1;
			} else if (var32 == 5) {
				var33 = var29 + var21;
				var34 = var30 + var21;
				var35 = arg16;
				var36 = arg15;
				var37 = arg7;
			} else if (var32 == 6) {
				var33 = var29 + var22;
				var34 = var30 + var21;
				var35 = arg16 + arg5 >> 1;
				var36 = arg15 + arg10 >> 1;
				var37 = arg7 + arg12 >> 1;
			} else if (var32 == 7) {
				var33 = var29;
				var34 = var30 + var21;
				var35 = arg5;
				var36 = arg10;
				var37 = arg12;
			} else if (var32 == 8) {
				var33 = var29;
				var34 = var30 + var22;
				var35 = arg5 + arg4 >> 1;
				var36 = arg10 + arg6 >> 1;
				var37 = arg12 + arg17 >> 1;
			} else if (var32 == 9) {
				var33 = var29 + var22;
				var34 = var30 + var23;
				var35 = arg4 + arg11 >> 1;
				var36 = arg6 + arg2 >> 1;
				var37 = arg17 + arg13 >> 1;
			} else if (var32 == 10) {
				var33 = var29 + var24;
				var34 = var30 + var22;
				var35 = arg11 + arg16 >> 1;
				var36 = arg2 + arg15 >> 1;
				var37 = arg13 + arg7 >> 1;
			} else if (var32 == 11) {
				var33 = var29 + var22;
				var34 = var30 + var24;
				var35 = arg16 + arg5 >> 1;
				var36 = arg15 + arg10 >> 1;
				var37 = arg7 + arg12 >> 1;
			} else if (var32 == 12) {
				var33 = var29 + var23;
				var34 = var30 + var22;
				var35 = arg5 + arg4 >> 1;
				var36 = arg10 + arg6 >> 1;
				var37 = arg12 + arg17 >> 1;
			} else if (var32 == 13) {
				var33 = var29 + var23;
				var34 = var30 + var23;
				var35 = arg4;
				var36 = arg6;
				var37 = arg17;
			} else if (var32 == 14) {
				var33 = var29 + var24;
				var34 = var30 + var23;
				var35 = arg11;
				var36 = arg2;
				var37 = arg13;
			} else if (var32 == 15) {
				var33 = var29 + var24;
				var34 = var30 + var24;
				var35 = arg16;
				var36 = arg15;
				var37 = arg7;
			} else {
				var33 = var29 + var23;
				var34 = var30 + var24;
				var35 = arg5;
				var36 = arg10;
				var37 = arg12;
			}
			this.vertexX[var31] = var33;
			this.vertexY[var31] = var35;
			this.vertexZ[var31] = var34;
			var27[var31] = var36;
			var28[var31] = var37;
		}
		int[] var38 = defShapeF[arg9];
		int var39 = var38.length / 4;
		this.triangleVertexA = new int[var39];
		this.triangleVertexB = new int[var39];
		this.triangleVertexC = new int[var39];
		this.triangleColourA = new int[var39];
		this.triangleColourB = new int[var39];
		this.triangleColourC = new int[var39];
		if (arg14 != -1) {
			this.triangleTexture = new int[var39];
		}
		int var40 = 0;
		for (int var41 = 0; var41 < var39; var41++) {
			int var42 = var38[var40];
			int var43 = var38[var40 + 1];
			int var44 = var38[var40 + 2];
			int var45 = var38[var40 + 3];
			var40 += 4;
			if (var43 < 4) {
				var43 = var43 - arg19 & 0x3;
			}
			if (var44 < 4) {
				var44 = var44 - arg19 & 0x3;
			}
			if (var45 < 4) {
				var45 = var45 - arg19 & 0x3;
			}
			this.triangleVertexA[var41] = var43;
			this.triangleVertexB[var41] = var44;
			this.triangleVertexC[var41] = var45;
			if (var42 == 0) {
				this.triangleColourA[var41] = var27[var43];
				this.triangleColourB[var41] = var27[var44];
				this.triangleColourC[var41] = var27[var45];
				if (this.triangleTexture != null) {
					this.triangleTexture[var41] = -1;
				}
			} else {
				this.triangleColourA[var41] = var28[var43];
				this.triangleColourB[var41] = var28[var44];
				this.triangleColourC[var41] = var28[var45];
				if (this.triangleTexture != null) {
					this.triangleTexture[var41] = arg14;
				}
			}
		}
		int var46 = arg4;
		int var47 = arg11;
		if (arg11 < arg4) {
			var46 = arg11;
		}
		if (arg11 > arg11) {
			var47 = arg11;
		}
		if (arg16 < var46) {
			var46 = arg16;
		}
		if (arg16 > var47) {
			var47 = arg16;
		}
		if (arg5 < var46) {
			var46 = arg5;
		}
		if (arg5 > var47) {
			var47 = arg5;
		}
		int var48 = var46 / 14;
		int var49 = var47 / 14;
	}
}
