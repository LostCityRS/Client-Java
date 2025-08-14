package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("j")
public class Ground {

	@ObfuscatedName("j.c")
	public int[] vertexX;

	@ObfuscatedName("j.d")
	public int[] vertexY;

	@ObfuscatedName("j.e")
	public int[] vertexZ;

	@ObfuscatedName("j.f")
	public int[] triangleColourA;

	@ObfuscatedName("j.g")
	public int[] triangleColourB;

	@ObfuscatedName("j.h")
	public int[] triangleColourC;

	@ObfuscatedName("j.i")
	public int[] triangleVertexA;

	@ObfuscatedName("j.j")
	public int[] triangleVertexB;

	@ObfuscatedName("j.k")
	public int[] triangleVertexC;

	@ObfuscatedName("j.l")
	public int[] triangleTexture;

	@ObfuscatedName("j.m")
	public boolean flat = true;

	@ObfuscatedName("j.n")
	public int shape;

	@ObfuscatedName("j.o")
	public int angle;

	@ObfuscatedName("j.p")
	public int underlayColour;

	@ObfuscatedName("j.q")
	public int overlayColour;

	@ObfuscatedName("j.r")
	public static int[] drawVertexX = new int[6];

	@ObfuscatedName("j.s")
	public static int[] drawVertexY = new int[6];

	@ObfuscatedName("j.t")
	public static int[] drawTextureVertexX = new int[6];

	@ObfuscatedName("j.u")
	public static int[] drawTextureVertexY = new int[6];

	@ObfuscatedName("j.v")
	public static int[] drawTextureVertexZ = new int[6];

	@ObfuscatedName("j.w")
	public static int[] shape0P1 = new int[] { 1, 0 };

	@ObfuscatedName("j.x")
	public static int[] shape0P2 = new int[] { 2, 1 };

	@ObfuscatedName("j.y")
	public static int[] shape0P3 = new int[] { 3, 3 };

	// defined shape points
	@ObfuscatedName("j.z")
	public static final int[][] defShapeP = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	// defined shape faces
	@ObfuscatedName("j.A")
	public static final int[][] defShapeF = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Ground(int arg0, int arg1, int overlayColour, int underlayColour, int shape, int arg5, int arg6, int arg7, int angle, int arg9, int arg10, int arg11, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg5 != arg19 || arg1 != arg5 || arg5 != arg13) {
			this.flat = false;
		}

		this.shape = shape;
		this.angle = angle;
		this.underlayColour = underlayColour;
		this.overlayColour = overlayColour;

		short var21 = 128;
		int var22 = var21 / 2;
		int var23 = var21 / 4;
		int var24 = var21 * 3 / 4;
		int[] var25 = defShapeP[shape];
		int var26 = var25.length;
		this.vertexX = new int[var26];
		this.vertexY = new int[var26];
		this.vertexZ = new int[var26];
		int[] var27 = new int[var26];
		int[] var28 = new int[var26];
		int var29 = arg11 * var21;
		int var30 = arg15 * var21;

		for (int var31 = 0; var31 < var26; var31++) {
			int var44 = var25[var31];
			if ((var44 & 0x1) == 0 && var44 <= 8) {
				var44 = (var44 - angle - angle - 1 & 0x7) + 1;
			}

			if (var44 > 8 && var44 <= 12) {
				var44 = (var44 - 9 - angle & 0x3) + 9;
			}

			if (var44 > 12 && var44 <= 16) {
				var44 = (var44 - 13 - angle & 0x3) + 13;
			}

			int var45;
			int var46;
			int var47;
			int var48;
			int var49;
			if (var44 == 1) {
				var45 = var29;
				var46 = var30;
				var47 = arg5;
				var48 = arg18;
				var49 = arg9;
			} else if (var44 == 2) {
				var45 = var22 + var29;
				var46 = var30;
				var47 = arg5 + arg19 >> 1;
				var48 = arg7 + arg18 >> 1;
				var49 = arg9 + arg17 >> 1;
			} else if (var44 == 3) {
				var45 = var21 + var29;
				var46 = var30;
				var47 = arg19;
				var48 = arg7;
				var49 = arg17;
			} else if (var44 == 4) {
				var45 = var21 + var29;
				var46 = var22 + var30;
				var47 = arg1 + arg19 >> 1;
				var48 = arg7 + arg16 >> 1;
				var49 = arg10 + arg17 >> 1;
			} else if (var44 == 5) {
				var45 = var21 + var29;
				var46 = var21 + var30;
				var47 = arg1;
				var48 = arg16;
				var49 = arg10;
			} else if (var44 == 6) {
				var45 = var22 + var29;
				var46 = var21 + var30;
				var47 = arg1 + arg13 >> 1;
				var48 = arg0 + arg16 >> 1;
				var49 = arg10 + arg14 >> 1;
			} else if (var44 == 7) {
				var45 = var29;
				var46 = var21 + var30;
				var47 = arg13;
				var48 = arg0;
				var49 = arg14;
			} else if (var44 == 8) {
				var45 = var29;
				var46 = var22 + var30;
				var47 = arg5 + arg13 >> 1;
				var48 = arg0 + arg18 >> 1;
				var49 = arg9 + arg14 >> 1;
			} else if (var44 == 9) {
				var45 = var22 + var29;
				var46 = var23 + var30;
				var47 = arg5 + arg19 >> 1;
				var48 = arg7 + arg18 >> 1;
				var49 = arg9 + arg17 >> 1;
			} else if (var44 == 10) {
				var45 = var24 + var29;
				var46 = var22 + var30;
				var47 = arg1 + arg19 >> 1;
				var48 = arg7 + arg16 >> 1;
				var49 = arg10 + arg17 >> 1;
			} else if (var44 == 11) {
				var45 = var22 + var29;
				var46 = var24 + var30;
				var47 = arg1 + arg13 >> 1;
				var48 = arg0 + arg16 >> 1;
				var49 = arg10 + arg14 >> 1;
			} else if (var44 == 12) {
				var45 = var23 + var29;
				var46 = var22 + var30;
				var47 = arg5 + arg13 >> 1;
				var48 = arg0 + arg18 >> 1;
				var49 = arg9 + arg14 >> 1;
			} else if (var44 == 13) {
				var45 = var23 + var29;
				var46 = var23 + var30;
				var47 = arg5;
				var48 = arg18;
				var49 = arg9;
			} else if (var44 == 14) {
				var45 = var24 + var29;
				var46 = var23 + var30;
				var47 = arg19;
				var48 = arg7;
				var49 = arg17;
			} else if (var44 == 15) {
				var45 = var24 + var29;
				var46 = var24 + var30;
				var47 = arg1;
				var48 = arg16;
				var49 = arg10;
			} else {
				var45 = var23 + var29;
				var46 = var24 + var30;
				var47 = arg13;
				var48 = arg0;
				var49 = arg14;
			}

			this.vertexX[var31] = var45;
			this.vertexY[var31] = var47;
			this.vertexZ[var31] = var46;
			var27[var31] = var48;
			var28[var31] = var49;
		}

		int[] var32 = defShapeF[shape];
		int var33 = var32.length / 4;
		this.triangleVertexA = new int[var33];
		this.triangleVertexB = new int[var33];
		this.triangleVertexC = new int[var33];
		this.triangleColourA = new int[var33];
		this.triangleColourB = new int[var33];
		this.triangleColourC = new int[var33];
		if (arg6 != -1) {
			this.triangleTexture = new int[var33];
		}

		int var34 = 0;

		for (int var35 = 0; var35 < var33; var35++) {
			int var40 = var32[var34];
			int var41 = var32[var34 + 1];
			int var42 = var32[var34 + 2];
			int var43 = var32[var34 + 3];
			var34 += 4;
			if (var41 < 4) {
				var41 = var41 - angle & 0x3;
			}
			if (var42 < 4) {
				var42 = var42 - angle & 0x3;
			}
			if (var43 < 4) {
				var43 = var43 - angle & 0x3;
			}

			this.triangleVertexA[var35] = var41;
			this.triangleVertexB[var35] = var42;
			this.triangleVertexC[var35] = var43;

			if (var40 == 0) {
				this.triangleColourA[var35] = var27[var41];
				this.triangleColourB[var35] = var27[var42];
				this.triangleColourC[var35] = var27[var43];
				if (this.triangleTexture != null) {
					this.triangleTexture[var35] = -1;
				}
			} else {
				this.triangleColourA[var35] = var28[var41];
				this.triangleColourB[var35] = var28[var42];
				this.triangleColourC[var35] = var28[var43];
				if (this.triangleTexture != null) {
					this.triangleTexture[var35] = arg6;
				}
			}
		}

		int var36 = arg5;
		int var37 = arg19;
		if (arg19 < arg5) {
			var36 = arg19;
		}
		if (arg19 > arg19) {
			var37 = arg19;
		}
		if (arg1 < var36) {
			var36 = arg1;
		}
		if (arg1 > var37) {
			var37 = arg1;
		}
		if (arg13 < var36) {
			var36 = arg13;
		}
		if (arg13 > var37) {
			var37 = arg13;
		}
		int var38 = var36 / 14;
		int var39 = var37 / 14;
	}
}
