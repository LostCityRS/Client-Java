package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("pa")
public final class Model extends ModelSource {

	@ObfuscatedName("pa.Oc")
	public static int field2259;
	@ObfuscatedName("pa.Cc")
	public static int field2247;
	@ObfuscatedName("pa.Jc")
	public static int field2254;
	@ObfuscatedName("pa.ac")
	public int[] faceRenderType;

	@ObfuscatedName("pa.bc")
	public int[] faceTextureP;

	@ObfuscatedName("pa.cc")
	public int numT = 0;

	@ObfuscatedName("pa.dc")
	public int[] field2222;

	@ObfuscatedName("pa.ec")
	public int[] faceVertexA;

	@ObfuscatedName("pa.fc")
	public int[] faceAlpha;

	@ObfuscatedName("pa.hc")
	public int[] facePriority;

	@ObfuscatedName("pa.ic")
	public int[] field2227;

	@ObfuscatedName("pa.jc")
	public int[] pointY;

	@ObfuscatedName("pa.kc")
	public int[] pointX;

	@ObfuscatedName("pa.lc")
	public int field2230;

	@ObfuscatedName("pa.mc")
	public int[] faceTextureM;

	@ObfuscatedName("pa.nc")
	public int[] faceColour;

	@ObfuscatedName("pa.oc")
	public static int[] field2233 = new int[1];

	@ObfuscatedName("pa.pc")
	public int field2234;

	@ObfuscatedName("pa.qc")
	public int[] faceTextureN;

	@ObfuscatedName("pa.rc")
	public static Model field2236 = new Model();

	@ObfuscatedName("pa.sc")
	public int[] faceVertexB;

	@ObfuscatedName("pa.tc")
	public int priority = 0;

	@ObfuscatedName("pa.uc")
	public static int mouseX = 0;

	@ObfuscatedName("pa.vc")
	public static int[] field2240 = new int[128];

	@ObfuscatedName("pa.wc")
	public static int[] field2241 = new int[1600];

	@ObfuscatedName("pa.Sb")
	public static Model field2211 = new Model();

	@ObfuscatedName("pa.Bc")
	public static int[] field2246 = new int[10];

	@ObfuscatedName("pa.zc")
	public static int[] field2244 = new int[4096];

	@ObfuscatedName("pa.Hc")
	public static int[] field2252 = new int[1000];

	@ObfuscatedName("pa.Ec")
	public static int[][] field2249 = new int[12][2000];

	@ObfuscatedName("pa.Ac")
	public static int[] field2245 = new int[4096];

	@ObfuscatedName("pa.Gc")
	public static int[][] field2251 = new int[1600][512];

	@ObfuscatedName("pa.xc")
	public static boolean[] field2242 = new boolean[4096];

	@ObfuscatedName("pa.Ic")
	public static int[] field2253 = new int[4096];

	@ObfuscatedName("pa.Kc")
	public static int[] field2255 = new int[1];

	@ObfuscatedName("pa.Dc")
	public static boolean mouseCheck = false;

	@ObfuscatedName("pa.Mc")
	public static int[] field2257 = new int[2000];

	@ObfuscatedName("pa.yc")
	public static int[] field2243 = Pix3D.colourTable;

	@ObfuscatedName("pa.Fc")
	public static int[] field2250 = new int[4096];

	@ObfuscatedName("pa.Sc")
	public static int[] field2263 = new int[10];

	@ObfuscatedName("pa.Pc")
	public static int[] field2260 = new int[2000];

	@ObfuscatedName("pa.Tc")
	public static int[] field2264 = new int[4096];

	@ObfuscatedName("pa.Lc")
	public static int[] field2256 = Pix3D.sinTable;

	@ObfuscatedName("pa.Vc")
	public static int[] field2266 = new int[4096];

	@ObfuscatedName("pa.Qc")
	public static int pickedCount = 0;

	@ObfuscatedName("pa.Xc")
	public static int[] field2268 = new int[10];

	@ObfuscatedName("pa.Rc")
	public static int[] field2262 = new int[12];

	@ObfuscatedName("pa.Nc")
	public static int[] field2258 = Pix3D.cosTable;

	@ObfuscatedName("pa.Uc")
	public static boolean[] field2265 = new boolean[4096];

	@ObfuscatedName("pa.Yc")
	public static int[] field2269 = Pix3D.divTable2;

	@ObfuscatedName("pa.Zc")
	public static int mouseY = 0;

	@ObfuscatedName("pa.Wc")
	public static int[] field2267 = new int[12];

	@ObfuscatedName("pa.Qb")
	public int numFaces = 0;

	@ObfuscatedName("pa.Mb")
	public boolean useAABBMouseCheck = false;

	@ObfuscatedName("pa.Pb")
	public int numPoints = 0;

	@ObfuscatedName("pa.Kb")
	public int[] pointZ;

	@ObfuscatedName("pa.Nb")
	public int[] faceVertexC;

	@ObfuscatedName("pa.Vb")
	public int[] vertexLabel;

	@ObfuscatedName("pa.Ob")
	public int[] faceLabel;

	@ObfuscatedName("pa.gc")
	public int[] field2225;

	@ObfuscatedName("pa.Wb")
	public PointNormal[] field2215;

	@ObfuscatedName("pa.Ub")
	public PointNormal[] field2213;

	@ObfuscatedName("pa.Lb")
	public int field2204;

	@ObfuscatedName("pa.Rb")
	public int field2210;

	@ObfuscatedName("pa.Tb")
	public int field2212;

	@ObfuscatedName("pa.Xb")
	public int field2216;

	@ObfuscatedName("pa.Zb")
	public int field2218;

	@ObfuscatedName("pa.Jb")
	public int[][] labelVertices;

	@ObfuscatedName("pa.Yb")
	public int[][] labelFaces;

	static {
		int var0 = 0;
		int var1 = 248;
		while (var0 < 9) {
			field2240[var0++] = 255;
		}
		while (var0 < 16) {
			field2240[var0++] = var1;
			var1 -= 8;
		}
		while (var0 < 32) {
			field2240[var0++] = var1;
			var1 -= 4;
		}
		while (var0 < 64) {
			field2240[var0++] = var1;
			var1 -= 2;
		}
		while (var0 < 128) {
			field2240[var0++] = var1--;
		}
	}

	@ObfuscatedName("pa.b()V")
	public static void unload() {
		field2211 = null;
		field2233 = null;
		field2236 = null;
		field2255 = null;
		field2242 = null;
		field2265 = null;
		field2250 = null;
		field2245 = null;
		field2253 = null;
		field2266 = null;
		field2244 = null;
		field2264 = null;
		field2241 = null;
		field2251 = null;
		field2267 = null;
		field2249 = null;
		field2260 = null;
		field2257 = null;
		field2262 = null;
		field2268 = null;
		field2246 = null;
		field2263 = null;
		field2252 = null;
		field2256 = null;
		field2258 = null;
		field2243 = null;
		field2269 = null;
		field2240 = null;
	}

	@ObfuscatedName("pa.a()V")
	public void calcBoundingCylinder() {
		if (this.field2210 == 1) {
			return;
		}
		this.field2210 = 1;
		super.field3135 = 0;
		this.field2216 = 0;
		this.field2212 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			int var3 = this.pointY[var1];
			int var4 = this.pointZ[var1];
			if (-var3 > super.field3135) {
				super.field3135 = -var3;
			}
			if (var3 > this.field2216) {
				this.field2216 = var3;
			}
			int var5 = var2 * var2 + var4 * var4;
			if (var5 > this.field2212) {
				this.field2212 = var5;
			}
		}
		this.field2212 = (int) (Math.sqrt((double) this.field2212) + 0.99D);
		this.field2230 = (int) (Math.sqrt((double) (this.field2212 * this.field2212 + super.field3135 * super.field3135)) + 0.99D);
		this.field2204 = this.field2230 + (int) (Math.sqrt((double) (this.field2216 * this.field2216 + this.field2212 * this.field2212)) + 0.99D);
	}

	@ObfuscatedName("pa.a(IIIIIIIII)V")
	@Override
	public void method767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.field2210 != 1) {
			this.calcBoundingCylinder();
		}
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = this.field2212 * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
		int var15 = var14 - this.field2212 << 9;
		if (var15 / var13 >= Pix3D.field766) {
			return;
		}
		int var16 = this.field2212 + var14 << 9;
		if (var16 / var13 <= Pix3D.field774) {
			return;
		}
		int var17 = arg2 * arg6 - arg1 * var10 >> 16;
		int var18 = this.field2212 * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= Pix3D.field767) {
			return;
		}
		int var20 = (super.field3135 * arg2 >> 16) + var18;
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix3D.field773) {
			return;
		}
		int var22 = (super.field3135 * arg1 >> 16) + var12;
		boolean var23 = false;
		boolean var24 = false;
		if (var11 - var22 <= 50) {
			var24 = true;
		}
		boolean var25 = var24 || this.numT > 0;
		boolean var26 = false;
		if (arg8 > 0 && mouseCheck) {
			int var27 = var11 - var12;
			if (var27 <= 50) {
				var27 = 50;
			}
			int var28;
			int var29;
			if (var14 > 0) {
				var28 = var15 / var13;
				var29 = var16 / var27;
			} else {
				var29 = var16 / var13;
				var28 = var15 / var27;
			}
			int var30;
			int var31;
			if (var17 > 0) {
				var30 = var21 / var13;
				var31 = var19 / var27;
			} else {
				var31 = var19 / var13;
				var30 = var21 / var27;
			}
			int var32 = mouseY - Pix3D.originX;
			int var33 = mouseX - Pix3D.originY;
			if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
				if (this.useAABBMouseCheck) {
					field2252[pickedCount++] = arg8;
				} else {
					var26 = true;
				}
			}
		}
		int var34 = Pix3D.originX;
		int var35 = Pix3D.originY;
		int var36 = 0;
		int var37 = 0;
		if (arg0 != 0) {
			var36 = field2256[arg0];
			var37 = field2258[arg0];
		}
		for (int var38 = 0; var38 < this.numPoints; var38++) {
			int var39 = this.pointX[var38];
			int var40 = this.pointY[var38];
			int var41 = this.pointZ[var38];
			if (arg0 != 0) {
				int var42 = var36 * var41 + var37 * var39 >> 16;
				var41 = var37 * var41 - var36 * var39 >> 16;
				var39 = var42;
			}
			int var43 = arg5 + var39;
			int var44 = arg6 + var40;
			int var45 = arg7 + var41;
			int var46 = arg3 * var45 + arg4 * var43 >> 16;
			int var47 = arg4 * var45 - arg3 * var43 >> 16;
			int var49 = arg2 * var44 - arg1 * var47 >> 16;
			int var50 = arg1 * var44 + arg2 * var47 >> 16;
			field2253[var38] = var50 - var11;
			if (var50 >= 50) {
				field2250[var38] = (var46 << 9) / var50 + var34;
				field2245[var38] = (var49 << 9) / var50 + var35;
			} else {
				field2250[var38] = -5000;
				var23 = true;
			}
			if (var25) {
				field2266[var38] = var46;
				field2244[var38] = var49;
				field2264[var38] = var50;
			}
		}
		try {
			this.method783(var23, var26, arg8);
		} catch (Exception var51) {
		}
	}

	@ObfuscatedName("pa.a(IIIIIIII)V")
	public void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field2210 != 2 && this.field2210 != 1) {
			this.method795();
		}
		int var8 = Pix3D.originX;
		int var9 = Pix3D.originY;
		int var10 = field2256[0];
		int var11 = field2258[0];
		int var12 = field2256[arg0];
		int var13 = field2258[arg0];
		int var14 = field2256[arg1];
		int var15 = field2258[arg1];
		int var16 = field2256[arg2];
		int var17 = field2258[arg2];
		int var18 = arg4 * var16 + arg5 * var17 >> 16;
		for (int var19 = 0; var19 < this.numPoints; var19++) {
			int var20 = this.pointX[var19];
			int var21 = this.pointY[var19];
			int var22 = this.pointZ[var19];
			if (arg1 != 0) {
				int var23 = var14 * var21 + var15 * var20 >> 16;
				var21 = var15 * var21 - var14 * var20 >> 16;
				var20 = var23;
			}
			if (arg0 != 0) {
				int var24 = var12 * var22 + var13 * var20 >> 16;
				var22 = var13 * var22 - var12 * var20 >> 16;
				var20 = var24;
			}
			int var25 = arg3 + var20;
			int var26 = arg4 + var21;
			int var27 = arg5 + var22;
			int var28 = var17 * var26 - var16 * var27 >> 16;
			int var29 = var16 * var26 + var17 * var27 >> 16;
			field2253[var19] = var29 - var18;
			field2250[var19] = (var25 << 9) / arg6 + var8;
			field2245[var19] = (var28 << 9) / arg6 + var9;
			if (this.numT > 0) {
				field2266[var19] = var25;
				field2244[var19] = var28;
				field2264[var19] = var29;
			}
		}
		try {
			this.method783(false, false, 0);
		} catch (Exception var30) {
		}
	}

	@ObfuscatedName("pa.a(IIIIIZ)V")
	public void light(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
		int var8 = arg1 * var7 >> 8;
		if (this.field2225 == null) {
			this.field2225 = new int[this.numFaces];
			this.field2222 = new int[this.numFaces];
			this.field2227 = new int[this.numFaces];
		}
		if (this.field2215 == null) {
			this.field2215 = new PointNormal[this.numPoints];
			for (int var9 = 0; var9 < this.numPoints; var9++) {
				this.field2215[var9] = new PointNormal();
			}
		}
		for (int var10 = 0; var10 < this.numFaces; var10++) {
			int var11 = this.faceVertexA[var10];
			int var12 = this.faceVertexB[var10];
			int var13 = this.faceVertexC[var10];
			int var14 = this.pointX[var12] - this.pointX[var11];
			int var15 = this.pointY[var12] - this.pointY[var11];
			int var16 = this.pointZ[var12] - this.pointZ[var11];
			int var17 = this.pointX[var13] - this.pointX[var11];
			int var18 = this.pointY[var13] - this.pointY[var11];
			int var19 = this.pointZ[var13] - this.pointZ[var11];
			int var20 = var15 * var19 - var16 * var18;
			int var21 = var16 * var17 - var14 * var19;
			int var22;
			for (var22 = var14 * var18 - var15 * var17; var20 > 8192 || var21 > 8192 || var22 > 8192 || var20 < -8192 || var21 < -8192 || var22 < -8192; var22 >>= 0x1) {
				var20 >>= 0x1;
				var21 >>= 0x1;
			}
			int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21));
			if (var23 <= 0) {
				var23 = 1;
			}
			int var24 = var20 * 256 / var23;
			int var25 = var21 * 256 / var23;
			int var26 = var22 * 256 / var23;
			if (this.faceRenderType == null || (this.faceRenderType[var10] & 0x1) == 0) {
				PointNormal var27 = this.field2215[var11];
				var27.field2312 += var24;
				var27.field2307 += var25;
				var27.field2314 += var26;
				var27.field2328++;
				PointNormal var28 = this.field2215[var12];
				var28.field2312 += var24;
				var28.field2307 += var25;
				var28.field2314 += var26;
				var28.field2328++;
				PointNormal var29 = this.field2215[var13];
				var29.field2312 += var24;
				var29.field2307 += var25;
				var29.field2314 += var26;
				var29.field2328++;
			} else {
				int var30 = (arg4 * var26 + arg2 * var24 + arg3 * var25) / (var8 / 2 + var8) + arg0;
				this.field2225[var10] = method784(this.faceColour[var10], var30, this.faceRenderType[var10]);
			}
		}
		if (arg5) {
			this.method776(arg0, var8, arg2, arg3, arg4);
			return;
		}
		this.field2213 = new PointNormal[this.numPoints];
		for (int var31 = 0; var31 < this.numPoints; var31++) {
			PointNormal var32 = this.field2215[var31];
			PointNormal var33 = this.field2213[var31] = new PointNormal();
			var33.field2312 = var32.field2312;
			var33.field2307 = var32.field2307;
			var33.field2314 = var32.field2314;
			var33.field2328 = var32.field2328;
		}
		this.field2234 = (arg0 << 16) + (var8 & 0xFFFF);
	}

	@ObfuscatedName("pa.b(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.numFaces; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("pa.g(I)V")
	public void method772(int arg0) {
		this.field2215 = null;
		this.field2210 = 0;
		int var2 = field2256[arg0];
		int var3 = field2258[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointY[var4] * var3 - this.pointZ[var4] * var2 >> 16;
			this.pointZ[var4] = this.pointY[var4] * var2 + this.pointZ[var4] * var3 >> 16;
			this.pointY[var4] = var5;
		}
	}

	@ObfuscatedName("pa.c()I")
	public int method773() {
		this.calcBoundingCylinder();
		return this.field2212;
	}

	@ObfuscatedName("pa.b(Z)Lpa;")
	public Model copyForAnim2(boolean arg0) {
		if (!arg0 && field2255.length < this.numFaces) {
			field2255 = new int[this.numFaces + 100];
		}
		return this.method788(arg0, field2236, field2255);
	}

	@ObfuscatedName("pa.b(IIIIIIII)Z")
	public boolean method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@ObfuscatedName("pa.a(IIIII)V")
	public void method776(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.numFaces; var6++) {
			int var7 = this.faceVertexA[var6];
			int var8 = this.faceVertexB[var6];
			int var9 = this.faceVertexC[var6];
			if (this.faceRenderType == null) {
				int var10 = this.faceColour[var6];
				PointNormal var11 = this.field2215[var7];
				int var12 = (var11.field2314 * arg4 + var11.field2312 * arg2 + var11.field2307 * arg3) / (var11.field2328 * arg1) + arg0;
				this.field2225[var6] = method784(var10, var12, 0);
				PointNormal var13 = this.field2215[var8];
				int var14 = (var13.field2314 * arg4 + var13.field2312 * arg2 + var13.field2307 * arg3) / (var13.field2328 * arg1) + arg0;
				this.field2222[var6] = method784(var10, var14, 0);
				PointNormal var15 = this.field2215[var9];
				int var16 = (var15.field2314 * arg4 + var15.field2312 * arg2 + var15.field2307 * arg3) / (var15.field2328 * arg1) + arg0;
				this.field2227[var6] = method784(var10, var16, 0);
			} else if ((this.faceRenderType[var6] & 0x1) == 0) {
				int var17 = this.faceColour[var6];
				int var18 = this.faceRenderType[var6];
				PointNormal var19 = this.field2215[var7];
				int var20 = (var19.field2314 * arg4 + var19.field2312 * arg2 + var19.field2307 * arg3) / (var19.field2328 * arg1) + arg0;
				this.field2225[var6] = method784(var17, var20, var18);
				PointNormal var21 = this.field2215[var8];
				int var22 = (var21.field2314 * arg4 + var21.field2312 * arg2 + var21.field2307 * arg3) / (var21.field2328 * arg1) + arg0;
				this.field2222[var6] = method784(var17, var22, var18);
				PointNormal var23 = this.field2215[var9];
				int var24 = (var23.field2314 * arg4 + var23.field2312 * arg2 + var23.field2307 * arg3) / (var23.field2328 * arg1) + arg0;
				this.field2227[var6] = method784(var17, var24, var18);
			}
		}
		this.field2215 = null;
		this.field2213 = null;
		this.vertexLabel = null;
		this.faceLabel = null;
		if (this.faceRenderType != null) {
			for (int var25 = 0; var25 < this.numFaces; var25++) {
				if ((this.faceRenderType[var25] & 0x2) == 2) {
					return;
				}
			}
		}
		this.faceColour = null;
	}

	@ObfuscatedName("pa.a(Lt;ILt;I[I)V")
	public void maskAnimate(AnimFrameSet arg0, int arg1, AnimFrameSet arg2, int arg3, int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.animate(arg0, arg1);
			return;
		}
		this.field2215 = null;
		this.field2210 = 0;
		AnimFrame var6 = arg0.list[arg1];
		AnimFrame var7 = arg2.list[arg3];
		AnimBase var8 = var6.field2121;
		field2259 = 0;
		field2254 = 0;
		field2247 = 0;
		byte var9 = 0;
		int var17 = var9 + 1;
		int var10 = arg4[0];
		for (int var11 = 0; var11 < var6.field2119; var11++) {
			int var12 = var6.field2122[var11];
			while (var12 > var10) {
				var10 = arg4[var17++];
			}
			if (var10 != var12 || var8.field3117[var12] == 0) {
				this.method779(var8.field3117[var12], var8.field3107[var12], var6.field2120[var11], var6.field2125[var11], var6.field2124[var11]);
			}
		}
		field2259 = 0;
		field2254 = 0;
		field2247 = 0;
		byte var13 = 0;
		int var18 = var13 + 1;
		int var14 = arg4[0];
		for (int var15 = 0; var15 < var7.field2119; var15++) {
			int var16 = var7.field2122[var15];
			while (var16 > var14) {
				var14 = arg4[var18++];
			}
			if (var14 == var16 || var8.field3117[var16] == 0) {
				this.method779(var8.field3117[var16], var8.field3107[var16], var7.field2120[var15], var7.field2125[var15], var7.field2124[var15]);
			}
		}
	}

	public Model(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		var2.pos = arg0.length - 18;

		int numPoints = var2.g2();
		int numFaces = var2.g2();
		int numT = var2.g1();
		int hasRenderType = var2.g1();
		int priority = var2.g1();
		int hasFaceAlpha = var2.g1();
		int hasFaceLabels = var2.g1();
		int hasVertexLabels = var2.g1();
		int dataLengthX = var2.g2();
		int dataLengthY = var2.g2();
		int dataLengthZ = var2.g2();
		int dataLengthFaceIndex = var2.g2();

		int var19 = numPoints;
		int var21 = numFaces + var19;
		int var22 = var21;
		if (priority == 255) {
			var21 += numFaces;
		} else {
			var22 = -priority - 1;
		}
		int var23 = var21;
		if (hasFaceLabels == 1) {
			var21 += numFaces;
		} else {
			var23 = -1;
		}
		int var24 = var21;
		if (hasRenderType == 1) {
			var21 += numFaces;
		} else {
			var24 = -1;
		}
		int var25 = var21;
		if (hasVertexLabels == 1) {
			var21 += numPoints;
		} else {
			var25 = -1;
		}
		int var26 = var21;
		if (hasFaceAlpha == 1) {
			var21 += numFaces;
		} else {
			var26 = -1;
		}
		int var28 = dataLengthFaceIndex + var21;
		int var30 = numFaces * 2 + var28;
		int var32 = numT * 6 + var30;
		int var34 = dataLengthX + var32;
		int var36 = dataLengthY + var34;
		this.numPoints = numPoints;
		this.numFaces = numFaces;
		this.numT = numT;
		this.pointX = new int[numPoints];
		this.pointY = new int[numPoints];
		this.pointZ = new int[numPoints];
		this.faceVertexA = new int[numFaces];
		this.faceVertexB = new int[numFaces];
		this.faceVertexC = new int[numFaces];
		this.faceTextureP = new int[numT];
		this.faceTextureM = new int[numT];
		this.faceTextureN = new int[numT];
		if (var25 >= 0) {
			this.vertexLabel = new int[numPoints];
		}
		if (var24 >= 0) {
			this.faceRenderType = new int[numFaces];
		}
		if (var22 >= 0) {
			this.facePriority = new int[numFaces];
		} else {
			this.priority = -var22 - 1;
		}
		if (var26 >= 0) {
			this.faceAlpha = new int[numFaces];
		}
		if (var23 >= 0) {
			this.faceLabel = new int[numFaces];
		}
		this.faceColour = new int[numFaces];
		var2.pos = 0;
		var3.pos = var32;
		var4.pos = var34;
		var5.pos = var36;
		var6.pos = var25;
		int var38 = 0;
		int var39 = 0;
		int var40 = 0;
		for (int var41 = 0; var41 < numPoints; var41++) {
			int var42 = var2.g1();
			int var43 = 0;
			if ((var42 & 0x1) != 0) {
				var43 = var3.method158();
			}
			int var44 = 0;
			if ((var42 & 0x2) != 0) {
				var44 = var4.method158();
			}
			int var45 = 0;
			if ((var42 & 0x4) != 0) {
				var45 = var5.method158();
			}
			this.pointX[var41] = var38 + var43;
			this.pointY[var41] = var39 + var44;
			this.pointZ[var41] = var40 + var45;
			var38 = this.pointX[var41];
			var39 = this.pointY[var41];
			var40 = this.pointZ[var41];
			if (this.vertexLabel != null) {
				this.vertexLabel[var41] = var6.g1();
			}
		}
		var2.pos = var28;
		var3.pos = var24;
		var4.pos = var22;
		var5.pos = var26;
		var6.pos = var23;
		for (int var46 = 0; var46 < numFaces; var46++) {
			this.faceColour[var46] = var2.g2();
			if (this.faceRenderType != null) {
				this.faceRenderType[var46] = var3.g1();
			}
			if (this.facePriority != null) {
				this.facePriority[var46] = var4.g1();
			}
			if (this.faceAlpha != null) {
				this.faceAlpha[var46] = var5.g1();
			}
			if (this.faceLabel != null) {
				this.faceLabel[var46] = var6.g1();
			}
		}
		var2.pos = var21;
		var3.pos = var19;
		int var47 = 0;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;
		for (int var51 = 0; var51 < numFaces; var51++) {
			int var52 = var3.g1();
			if (var52 == 1) {
				var47 = var2.method158() + var50;
				var48 = var2.method158() + var47;
				var49 = var2.method158() + var48;
				var50 = var49;
				this.faceVertexA[var51] = var47;
				this.faceVertexB[var51] = var48;
				this.faceVertexC[var51] = var49;
			}
			if (var52 == 2) {
				var48 = var49;
				var49 = var2.method158() + var50;
				var50 = var49;
				this.faceVertexA[var51] = var47;
				this.faceVertexB[var51] = var48;
				this.faceVertexC[var51] = var49;
			}
			if (var52 == 3) {
				var47 = var49;
				var49 = var2.method158() + var50;
				var50 = var49;
				this.faceVertexA[var51] = var47;
				this.faceVertexB[var51] = var48;
				this.faceVertexC[var51] = var49;
			}
			if (var52 == 4) {
				int var53 = var47;
				var47 = var48;
				var48 = var53;
				var49 = var2.method158() + var50;
				var50 = var49;
				this.faceVertexA[var51] = var47;
				this.faceVertexB[var51] = var53;
				this.faceVertexC[var51] = var49;
			}
		}
		var2.pos = var30;
		for (int var54 = 0; var54 < numT; var54++) {
			this.faceTextureP[var54] = var2.g2();
			this.faceTextureM[var54] = var2.g2();
			this.faceTextureN[var54] = var2.g2();
		}
	}

	public Model() {
	}

	public Model(Model[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		this.priority = -1;
		for (int var7 = 0; var7 < arg1; var7++) {
			Model var8 = arg0[var7];
			if (var8 != null) {
				this.numPoints += var8.numPoints;
				this.numFaces += var8.numFaces;
				this.numT += var8.numT;
				var3 |= var8.faceRenderType != null;
				if (var8.facePriority == null) {
					if (this.priority == -1) {
						this.priority = var8.priority;
					}
					if (this.priority != var8.priority) {
						var4 = true;
					}
				} else {
					var4 = true;
				}
				var5 |= var8.faceAlpha != null;
				var6 |= var8.faceLabel != null;
			}
		}
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.vertexLabel = new int[this.numPoints];
		this.faceVertexA = new int[this.numFaces];
		this.faceVertexB = new int[this.numFaces];
		this.faceVertexC = new int[this.numFaces];
		this.faceTextureP = new int[this.numT];
		this.faceTextureM = new int[this.numT];
		this.faceTextureN = new int[this.numT];
		if (var3) {
			this.faceRenderType = new int[this.numFaces];
		}
		if (var4) {
			this.facePriority = new int[this.numFaces];
		}
		if (var5) {
			this.faceAlpha = new int[this.numFaces];
		}
		if (var6) {
			this.faceLabel = new int[this.numFaces];
		}
		this.faceColour = new int[this.numFaces];
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		int var9 = 0;
		for (int var10 = 0; var10 < arg1; var10++) {
			Model var11 = arg0[var10];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.numFaces; var12++) {
					if (var3) {
						if (var11.faceRenderType == null) {
							this.faceRenderType[this.numFaces] = 0;
						} else {
							int var13 = var11.faceRenderType[var12];
							if ((var13 & 0x2) == 2) {
								var13 += var9 << 2;
							}
							this.faceRenderType[this.numFaces] = var13;
						}
					}
					if (var4) {
						if (var11.facePriority == null) {
							this.facePriority[this.numFaces] = var11.priority;
						} else {
							this.facePriority[this.numFaces] = var11.facePriority[var12];
						}
					}
					if (var5) {
						if (var11.faceAlpha == null) {
							this.faceAlpha[this.numFaces] = 0;
						} else {
							this.faceAlpha[this.numFaces] = var11.faceAlpha[var12];
						}
					}
					if (var6 && var11.faceLabel != null) {
						this.faceLabel[this.numFaces] = var11.faceLabel[var12];
					}
					this.faceColour[this.numFaces] = var11.faceColour[var12];
					this.faceVertexA[this.numFaces] = this.method797(var11, var11.faceVertexA[var12]);
					this.faceVertexB[this.numFaces] = this.method797(var11, var11.faceVertexB[var12]);
					this.faceVertexC[this.numFaces] = this.method797(var11, var11.faceVertexC[var12]);
					this.numFaces++;
				}
				for (int var14 = 0; var14 < var11.numT; var14++) {
					this.faceTextureP[this.numT] = this.method797(var11, var11.faceTextureP[var14]);
					this.faceTextureM[this.numT] = this.method797(var11, var11.faceTextureM[var14]);
					this.faceTextureN[this.numT] = this.method797(var11, var11.faceTextureN[var14]);
					this.numT++;
				}
				var9 += var11.numT;
			}
		}
	}

	public Model(Model[] arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		this.priority = -1;
		for (int var8 = 0; var8 < 2; var8++) {
			Model var9 = arg0[var8];
			if (var9 != null) {
				this.numPoints += var9.numPoints;
				this.numFaces += var9.numFaces;
				this.numT += var9.numT;
				var4 |= var9.faceRenderType != null;
				if (var9.facePriority == null) {
					if (this.priority == -1) {
						this.priority = var9.priority;
					}
					if (this.priority != var9.priority) {
						var5 = true;
					}
				} else {
					var5 = true;
				}
				var6 |= var9.faceAlpha != null;
				var7 |= var9.faceColour != null;
			}
		}
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.faceVertexA = new int[this.numFaces];
		this.faceVertexB = new int[this.numFaces];
		this.faceVertexC = new int[this.numFaces];
		this.field2225 = new int[this.numFaces];
		this.field2222 = new int[this.numFaces];
		this.field2227 = new int[this.numFaces];
		this.faceTextureP = new int[this.numT];
		this.faceTextureM = new int[this.numT];
		this.faceTextureN = new int[this.numT];
		if (var4) {
			this.faceRenderType = new int[this.numFaces];
		}
		if (var5) {
			this.facePriority = new int[this.numFaces];
		}
		if (var6) {
			this.faceAlpha = new int[this.numFaces];
		}
		if (var7) {
			this.faceColour = new int[this.numFaces];
		}
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < 2; var11++) {
			Model var12 = arg0[var11];
			if (var12 != null) {
				int var13 = this.numPoints;
				for (int var14 = 0; var14 < var12.numPoints; var14++) {
					this.pointX[this.numPoints] = var12.pointX[var14];
					this.pointY[this.numPoints] = var12.pointY[var14];
					this.pointZ[this.numPoints] = var12.pointZ[var14];
					this.numPoints++;
				}
				for (int var15 = 0; var15 < var12.numFaces; var15++) {
					this.faceVertexA[this.numFaces] = var12.faceVertexA[var15] + var13;
					this.faceVertexB[this.numFaces] = var12.faceVertexB[var15] + var13;
					this.faceVertexC[this.numFaces] = var12.faceVertexC[var15] + var13;
					this.field2225[this.numFaces] = var12.field2225[var15];
					this.field2222[this.numFaces] = var12.field2222[var15];
					this.field2227[this.numFaces] = var12.field2227[var15];
					if (var4) {
						if (var12.faceRenderType == null) {
							this.faceRenderType[this.numFaces] = 0;
						} else {
							int var16 = var12.faceRenderType[var15];
							if ((var16 & 0x2) == 2) {
								var16 += var10 << 2;
							}
							this.faceRenderType[this.numFaces] = var16;
						}
					}
					if (var5) {
						if (var12.facePriority == null) {
							this.facePriority[this.numFaces] = var12.priority;
						} else {
							this.facePriority[this.numFaces] = var12.facePriority[var15];
						}
					}
					if (var6) {
						if (var12.faceAlpha == null) {
							this.faceAlpha[this.numFaces] = 0;
						} else {
							this.faceAlpha[this.numFaces] = var12.faceAlpha[var15];
						}
					}
					if (var7 && var12.faceColour != null) {
						this.faceColour[this.numFaces] = var12.faceColour[var15];
					}
					this.numFaces++;
				}
				for (int var17 = 0; var17 < var12.numT; var17++) {
					this.faceTextureP[this.numT] = var12.faceTextureP[var17] + var13;
					this.faceTextureM[this.numT] = var12.faceTextureM[var17] + var13;
					this.faceTextureN[this.numT] = var12.faceTextureN[var17] + var13;
					this.numT++;
				}
				var10 += var12.numT;
			}
		}
	}

	public Model(Model arg0, boolean arg1, boolean arg2, boolean arg3) {
		this.numPoints = arg0.numPoints;
		this.numFaces = arg0.numFaces;
		this.numT = arg0.numT;
		if (arg1) {
			this.pointX = arg0.pointX;
			this.pointY = arg0.pointY;
			this.pointZ = arg0.pointZ;
		} else {
			this.pointX = new int[this.numPoints];
			this.pointY = new int[this.numPoints];
			this.pointZ = new int[this.numPoints];
			for (int var5 = 0; var5 < this.numPoints; var5++) {
				this.pointX[var5] = arg0.pointX[var5];
				this.pointY[var5] = arg0.pointY[var5];
				this.pointZ[var5] = arg0.pointZ[var5];
			}
		}
		if (arg2) {
			this.faceColour = arg0.faceColour;
		} else {
			this.faceColour = new int[this.numFaces];
			for (int var6 = 0; var6 < this.numFaces; var6++) {
				this.faceColour[var6] = arg0.faceColour[var6];
			}
		}
		this.faceAlpha = arg0.faceAlpha;
		this.vertexLabel = arg0.vertexLabel;
		this.faceLabel = arg0.faceLabel;
		this.faceRenderType = arg0.faceRenderType;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.facePriority = arg0.facePriority;
		this.priority = arg0.priority;
		this.faceTextureP = arg0.faceTextureP;
		this.faceTextureM = arg0.faceTextureM;
		this.faceTextureN = arg0.faceTextureN;
		this.useAABBMouseCheck = arg0.useAABBMouseCheck;
	}

	public Model(Model arg0, boolean arg1, boolean arg2) {
		this.numPoints = arg0.numPoints;
		this.numFaces = arg0.numFaces;
		this.numT = arg0.numT;
		if (arg1) {
			this.pointY = new int[this.numPoints];
			for (int var4 = 0; var4 < this.numPoints; var4++) {
				this.pointY[var4] = arg0.pointY[var4];
			}
		} else {
			this.pointY = arg0.pointY;
		}
		if (arg2) {
			this.field2225 = new int[this.numFaces];
			this.field2222 = new int[this.numFaces];
			this.field2227 = new int[this.numFaces];
			for (int var5 = 0; var5 < this.numFaces; var5++) {
				this.field2225[var5] = arg0.field2225[var5];
				this.field2222[var5] = arg0.field2222[var5];
				this.field2227[var5] = arg0.field2227[var5];
			}
			this.faceRenderType = new int[this.numFaces];
			if (arg0.faceRenderType == null) {
				for (int var6 = 0; var6 < this.numFaces; var6++) {
					this.faceRenderType[var6] = 0;
				}
			} else {
				for (int var7 = 0; var7 < this.numFaces; var7++) {
					this.faceRenderType[var7] = arg0.faceRenderType[var7];
				}
			}
			this.field2215 = new PointNormal[this.numPoints];
			for (int var8 = 0; var8 < this.numPoints; var8++) {
				PointNormal var9 = this.field2215[var8] = new PointNormal();
				PointNormal var10 = arg0.field2215[var8];
				var9.field2312 = var10.field2312;
				var9.field2307 = var10.field2307;
				var9.field2314 = var10.field2314;
				var9.field2328 = var10.field2328;
			}
			this.field2213 = arg0.field2213;
		} else {
			this.field2225 = arg0.field2225;
			this.field2222 = arg0.field2222;
			this.field2227 = arg0.field2227;
			this.faceRenderType = arg0.faceRenderType;
		}
		this.pointX = arg0.pointX;
		this.pointZ = arg0.pointZ;
		this.faceColour = arg0.faceColour;
		this.faceAlpha = arg0.faceAlpha;
		this.facePriority = arg0.facePriority;
		this.priority = arg0.priority;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.faceTextureP = arg0.faceTextureP;
		this.faceTextureM = arg0.faceTextureM;
		this.faceTextureN = arg0.faceTextureN;
		this.useAABBMouseCheck = arg0.useAABBMouseCheck;
		this.field2234 = arg0.field2234;
	}

	@ObfuscatedName("pa.d()V")
	public void prepareAnim() {
		int var10002;
		if (this.vertexLabel != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < this.numPoints; var3++) {
				int var4 = this.vertexLabel[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.labelVertices = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				this.labelVertices[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.numPoints) {
				int var7 = this.vertexLabel[var6];
				this.labelVertices[var7][var1[var7]++] = var6++;
			}
			this.vertexLabel = null;
		}
		if (this.faceLabel != null) {
			int[] var8 = new int[256];
			int var9 = 0;
			for (int var10 = 0; var10 < this.numFaces; var10++) {
				int var11 = this.faceLabel[var10];
				var10002 = var8[var11]++;
				if (var11 > var9) {
					var9 = var11;
				}
			}
			this.labelFaces = new int[var9 + 1][];
			for (int var12 = 0; var12 <= var9; var12++) {
				this.labelFaces[var12] = new int[var8[var12]];
				var8[var12] = 0;
			}
			int var13 = 0;
			while (var13 < this.numFaces) {
				int var14 = this.faceLabel[var13];
				this.labelFaces[var14][var8[var14]++] = var13++;
			}
			this.faceLabel = null;
		}
	}

	@ObfuscatedName("pa.a(I[IIII)V")
	public void method779(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field2259 = 0;
			field2254 = 0;
			field2247 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.labelVertices.length) {
					int[] var10 = this.labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field2259 += this.pointX[var12];
						field2254 += this.pointY[var12];
						field2247 += this.pointZ[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				field2259 = field2259 / var7 + arg2;
				field2254 = field2254 / var7 + arg3;
				field2247 = field2247 / var7 + arg4;
			} else {
				field2259 = arg2;
				field2254 = arg3;
				field2247 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.labelVertices.length) {
					int[] var15 = this.labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.pointX[var17] += arg2;
						this.pointY[var17] += arg3;
						this.pointZ[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.labelVertices.length) {
					int[] var20 = this.labelVertices[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.pointX[var22] -= field2259;
						this.pointY[var22] -= field2254;
						this.pointZ[var22] -= field2247;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = field2256[var25];
							int var27 = field2258[var25];
							int var28 = this.pointX[var22] * var27 + this.pointY[var22] * var26 >> 16;
							this.pointY[var22] = this.pointY[var22] * var27 - this.pointX[var22] * var26 >> 16;
							this.pointX[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = field2256[var23];
							int var30 = field2258[var23];
							int var31 = this.pointY[var22] * var30 - this.pointZ[var22] * var29 >> 16;
							this.pointZ[var22] = this.pointY[var22] * var29 + this.pointZ[var22] * var30 >> 16;
							this.pointY[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = field2256[var24];
							int var33 = field2258[var24];
							int var34 = this.pointX[var22] * var33 + this.pointZ[var22] * var32 >> 16;
							this.pointZ[var22] = this.pointZ[var22] * var33 - this.pointX[var22] * var32 >> 16;
							this.pointX[var22] = var34;
						}
						this.pointX[var22] += field2259;
						this.pointY[var22] += field2254;
						this.pointZ[var22] += field2247;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < this.labelVertices.length) {
					int[] var37 = this.labelVertices[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						this.pointX[var39] -= field2259;
						this.pointY[var39] -= field2254;
						this.pointZ[var39] -= field2247;
						this.pointX[var39] = this.pointX[var39] * arg2 / 128;
						this.pointY[var39] = this.pointY[var39] * arg3 / 128;
						this.pointZ[var39] = this.pointZ[var39] * arg4 / 128;
						this.pointX[var39] += field2259;
						this.pointY[var39] += field2254;
						this.pointZ[var39] += field2247;
					}
				}
			}
		} else if (arg0 == 5 && (this.labelFaces != null && this.faceAlpha != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < this.labelFaces.length) {
					int[] var42 = this.labelFaces[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						this.faceAlpha[var44] += arg2 * 8;
						if (this.faceAlpha[var44] < 0) {
							this.faceAlpha[var44] = 0;
						}
						if (this.faceAlpha[var44] > 255) {
							this.faceAlpha[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pa.a(IIIIIII)V")
	public void objRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.field2210 != 2 && this.field2210 != 1) {
			this.method795();
		}
		int var7 = Pix3D.originX;
		int var8 = Pix3D.originY;
		int var9 = field2256[0];
		int var10 = field2258[0];
		int var11 = field2256[arg0];
		int var12 = field2258[arg0];
		int var13 = field2256[arg1];
		int var14 = field2258[arg1];
		int var15 = field2256[arg2];
		int var16 = field2258[arg2];
		int var17 = arg4 * var15 + arg5 * var16 >> 16;
		for (int var18 = 0; var18 < this.numPoints; var18++) {
			int var19 = this.pointX[var18];
			int var20 = this.pointY[var18];
			int var21 = this.pointZ[var18];
			if (arg1 != 0) {
				int var22 = var13 * var20 + var14 * var19 >> 16;
				var20 = var14 * var20 - var13 * var19 >> 16;
				var19 = var22;
			}
			if (arg0 != 0) {
				int var23 = var11 * var21 + var12 * var19 >> 16;
				var21 = var12 * var21 - var11 * var19 >> 16;
				var19 = var23;
			}
			int var24 = arg3 + var19;
			int var25 = arg4 + var20;
			int var26 = arg5 + var21;
			int var27 = var16 * var25 - var15 * var26 >> 16;
			int var28 = var15 * var25 + var16 * var26 >> 16;
			field2253[var18] = var28 - var17;
			field2250[var18] = (var24 << 9) / var28 + var7;
			field2245[var18] = (var27 << 9) / var28 + var8;
			if (this.numT > 0) {
				field2266[var18] = var24;
				field2244[var18] = var27;
				field2264[var18] = var28;
			}
		}
		try {
			this.method783(false, false, 0);
		} catch (Exception var29) {
		}
	}

	@ObfuscatedName("pa.e()V")
	public void rotate90() {
		this.field2215 = null;
		this.field2210 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			this.pointX[var1] = this.pointZ[var1];
			this.pointZ[var1] = -var2;
		}
	}

	@ObfuscatedName("pa.h(I)V")
	public void method782(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
		int var4 = 0;
		int var5 = this.faceVertexA[arg0];
		int var6 = this.faceVertexB[arg0];
		int var7 = this.faceVertexC[arg0];
		int var8 = field2264[var5];
		int var9 = field2264[var6];
		int var10 = field2264[var7];
		if (this.faceAlpha == null) {
			Pix3D.field765 = 0;
		} else {
			Pix3D.field765 = this.faceAlpha[arg0];
		}
		if (var8 >= 50) {
			field2268[0] = field2250[var5];
			field2246[0] = field2245[var5];
			var4++;
			field2263[0] = this.field2225[arg0];
		} else {
			int var11 = field2266[var5];
			int var12 = field2244[var5];
			int var13 = this.field2225[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field2269[var10 - var8];
				field2268[0] = (((field2266[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				field2246[0] = (((field2244[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				var4++;
				field2263[0] = ((this.field2227[arg0] - var13) * var14 >> 16) + var13;
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * field2269[var9 - var8];
				field2268[var4] = (((field2266[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
				field2246[var4] = (((field2244[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
				field2263[var4++] = ((this.field2222[arg0] - var13) * var15 >> 16) + var13;
			}
		}
		if (var9 >= 50) {
			field2268[var4] = field2250[var6];
			field2246[var4] = field2245[var6];
			field2263[var4++] = this.field2222[arg0];
		} else {
			int var16 = field2266[var6];
			int var17 = field2244[var6];
			int var18 = this.field2222[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field2269[var8 - var9];
				field2268[var4] = (((field2266[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				field2246[var4] = (((field2244[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				field2263[var4++] = ((this.field2225[arg0] - var18) * var19 >> 16) + var18;
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * field2269[var10 - var9];
				field2268[var4] = (((field2266[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
				field2246[var4] = (((field2244[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
				field2263[var4++] = ((this.field2227[arg0] - var18) * var20 >> 16) + var18;
			}
		}
		if (var10 >= 50) {
			field2268[var4] = field2250[var7];
			field2246[var4] = field2245[var7];
			field2263[var4++] = this.field2227[arg0];
		} else {
			int var21 = field2266[var7];
			int var22 = field2244[var7];
			int var23 = this.field2227[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field2269[var9 - var10];
				field2268[var4] = (((field2266[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				field2246[var4] = (((field2244[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				field2263[var4++] = ((this.field2222[arg0] - var23) * var24 >> 16) + var23;
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * field2269[var8 - var10];
				field2268[var4] = (((field2266[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
				field2246[var4] = (((field2244[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
				field2263[var4++] = ((this.field2225[arg0] - var23) * var25 >> 16) + var23;
			}
		}
		int var26 = field2268[0];
		int var27 = field2268[1];
		int var28 = field2268[2];
		int var29 = field2246[0];
		int var30 = field2246[1];
		int var31 = field2246[2];
		Pix3D.field779 = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.width || var27 > Pix3D.width || var28 > Pix3D.width) {
				Pix3D.field779 = true;
			}
			int var32;
			if (this.faceRenderType == null) {
				var32 = 0;
			} else {
				var32 = this.faceRenderType[arg0] & 0x3;
			}
			if (var32 == 0) {
				Pix3D.method360(var29, var30, var31, var26, var27, var28, field2263[0], field2263[1], field2263[2]);
			} else if (var32 == 1) {
				Pix3D.method366(var29, var30, var31, var26, var27, var28, field2243[this.field2225[arg0]]);
			} else if (var32 == 2) {
				int var33 = this.faceRenderType[arg0] >> 2;
				int var34 = this.faceTextureP[var33];
				int var35 = this.faceTextureM[var33];
				int var36 = this.faceTextureN[var33];
				Pix3D.method353(var29, var30, var31, var26, var27, var28, field2263[0], field2263[1], field2263[2], field2266[var34], field2266[var35], field2266[var36], field2244[var34], field2244[var35], field2244[var36], field2264[var34], field2264[var35], field2264[var36], this.faceColour[arg0]);
			} else if (var32 == 3) {
				int var37 = this.faceRenderType[arg0] >> 2;
				int var38 = this.faceTextureP[var37];
				int var39 = this.faceTextureM[var37];
				int var40 = this.faceTextureN[var37];
				Pix3D.method353(var29, var30, var31, var26, var27, var28, this.field2225[arg0], this.field2225[arg0], this.field2225[arg0], field2266[var38], field2266[var39], field2266[var40], field2244[var38], field2244[var39], field2244[var40], field2264[var38], field2264[var39], field2264[var40], this.faceColour[arg0]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.width || var27 > Pix3D.width || var28 > Pix3D.width || field2268[3] < 0 || field2268[3] > Pix3D.width) {
			Pix3D.field779 = true;
		}
		int var41;
		if (this.faceRenderType == null) {
			var41 = 0;
		} else {
			var41 = this.faceRenderType[arg0] & 0x3;
		}
		if (var41 == 0) {
			Pix3D.method360(var29, var30, var31, var26, var27, var28, field2263[0], field2263[1], field2263[2]);
			Pix3D.method360(var29, var31, field2246[3], var26, var28, field2268[3], field2263[0], field2263[2], field2263[3]);
			return;
		}
		if (var41 == 1) {
			int var42 = field2243[this.field2225[arg0]];
			Pix3D.method366(var29, var30, var31, var26, var27, var28, var42);
			Pix3D.method366(var29, var31, field2246[3], var26, var28, field2268[3], var42);
			return;
		}
		if (var41 == 2) {
			int var43 = this.faceRenderType[arg0] >> 2;
			int var44 = this.faceTextureP[var43];
			int var45 = this.faceTextureM[var43];
			int var46 = this.faceTextureN[var43];
			Pix3D.method353(var29, var30, var31, var26, var27, var28, field2263[0], field2263[1], field2263[2], field2266[var44], field2266[var45], field2266[var46], field2244[var44], field2244[var45], field2244[var46], field2264[var44], field2264[var45], field2264[var46], this.faceColour[arg0]);
			Pix3D.method353(var29, var31, field2246[3], var26, var28, field2268[3], field2263[0], field2263[2], field2263[3], field2266[var44], field2266[var45], field2266[var46], field2244[var44], field2244[var45], field2244[var46], field2264[var44], field2264[var45], field2264[var46], this.faceColour[arg0]);
			return;
		}
		if (var41 != 3) {
			return;
		}
		int var47 = this.faceRenderType[arg0] >> 2;
		int var48 = this.faceTextureP[var47];
		int var49 = this.faceTextureM[var47];
		int var50 = this.faceTextureN[var47];
		Pix3D.method353(var29, var30, var31, var26, var27, var28, this.field2225[arg0], this.field2225[arg0], this.field2225[arg0], field2266[var48], field2266[var49], field2266[var50], field2244[var48], field2244[var49], field2244[var50], field2264[var48], field2264[var49], field2264[var50], this.faceColour[arg0]);
		Pix3D.method353(var29, var31, field2246[3], var26, var28, field2268[3], this.field2225[arg0], this.field2225[arg0], this.field2225[arg0], field2266[var48], field2266[var49], field2266[var50], field2244[var48], field2244[var49], field2244[var50], field2264[var48], field2264[var49], field2264[var50], this.faceColour[arg0]);
	}

	@ObfuscatedName("pa.a(ZZI)V")
	public void method783(boolean arg0, boolean arg1, int arg2) {
		if (this.field2204 >= 1600) {
			return;
		}
		for (int var4 = 0; var4 < this.field2204; var4++) {
			field2241[var4] = 0;
		}
		for (int var5 = 0; var5 < this.numFaces; var5++) {
			if (this.faceRenderType == null || this.faceRenderType[var5] != -1) {
				int var6 = this.faceVertexA[var5];
				int var7 = this.faceVertexB[var5];
				int var8 = this.faceVertexC[var5];
				int var9 = field2250[var6];
				int var10 = field2250[var7];
				int var11 = field2250[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					int var12 = field2266[var6];
					int var13 = field2266[var7];
					int var14 = field2266[var8];
					int var15 = field2244[var6];
					int var16 = field2244[var7];
					int var17 = field2244[var8];
					int var18 = field2264[var6];
					int var19 = field2264[var7];
					int var20 = field2264[var8];
					int var21 = var12 - var13;
					int var22 = var14 - var13;
					int var23 = var15 - var16;
					int var24 = var17 - var16;
					int var25 = var18 - var19;
					int var26 = var20 - var19;
					int var27 = var23 * var26 - var24 * var25;
					int var28 = var22 * var25 - var21 * var26;
					int var29 = var21 * var24 - var22 * var23;
					if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
						field2265[var5] = true;
						int var30 = (field2253[var6] + field2253[var7] + field2253[var8]) / 3 + this.field2230;
						field2251[var30][field2241[var30]++] = var5;
					}
				} else {
					if (arg1 && this.method775(mouseY, mouseX, field2245[var6], field2245[var7], field2245[var8], var9, var10, var11)) {
						field2252[pickedCount++] = arg2;
						arg1 = false;
					}
					if ((field2245[var8] - field2245[var7]) * (var9 - var10) - (field2245[var6] - field2245[var7]) * (var11 - var10) > 0) {
						field2265[var5] = false;
						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix3D.width && var10 <= Pix3D.width && var11 <= Pix3D.width) {
							field2242[var5] = false;
						} else {
							field2242[var5] = true;
						}
						int var31 = (field2253[var6] + field2253[var7] + field2253[var8]) / 3 + this.field2230;
						field2251[var31][field2241[var31]++] = var5;
					}
				}
			}
		}
		if (this.facePriority == null) {
			for (int var32 = this.field2204 - 1; var32 >= 0; var32--) {
				int var33 = field2241[var32];
				if (var33 > 0) {
					int[] var34 = field2251[var32];
					for (int var35 = 0; var35 < var33; var35++) {
						this.method791(var34[var35]);
					}
				}
			}
			return;
		}
		for (int var36 = 0; var36 < 12; var36++) {
			field2267[var36] = 0;
			field2262[var36] = 0;
		}
		for (int var37 = this.field2204 - 1; var37 >= 0; var37--) {
			int var38 = field2241[var37];
			if (var38 > 0) {
				int[] var39 = field2251[var37];
				for (int var40 = 0; var40 < var38; var40++) {
					int var41 = var39[var40];
					int var42 = this.facePriority[var41];
					int var43 = field2267[var42]++;
					field2249[var42][var43] = var41;
					if (var42 < 10) {
						field2262[var42] += var37;
					} else if (var42 == 10) {
						field2260[var43] = var37;
					} else {
						field2257[var43] = var37;
					}
				}
			}
		}
		int var44 = 0;
		if (field2267[1] > 0 || field2267[2] > 0) {
			var44 = (field2262[1] + field2262[2]) / (field2267[1] + field2267[2]);
		}
		int var45 = 0;
		if (field2267[3] > 0 || field2267[4] > 0) {
			var45 = (field2262[3] + field2262[4]) / (field2267[3] + field2267[4]);
		}
		int var46 = 0;
		if (field2267[6] > 0 || field2267[8] > 0) {
			var46 = (field2262[6] + field2262[8]) / (field2267[6] + field2267[8]);
		}
		int var47 = 0;
		int var48 = field2267[10];
		int[] var49 = field2249[10];
		int[] var50 = field2260;
		if (var48 == 0) {
			var47 = 0;
			var48 = field2267[11];
			var49 = field2249[11];
			var50 = field2257;
		}
		int var51;
		if (var48 > 0) {
			var51 = var50[0];
		} else {
			var51 = -1000;
		}
		for (int var52 = 0; var52 < 10; var52++) {
			while (var52 == 0 && var51 > var44) {
				this.method791(var49[var47++]);
				if (var47 == var48 && field2249[11] != var49) {
					var47 = 0;
					var48 = field2267[11];
					var49 = field2249[11];
					var50 = field2257;
				}
				if (var47 < var48) {
					var51 = var50[var47];
				} else {
					var51 = -1000;
				}
			}
			while (var52 == 3 && var51 > var45) {
				this.method791(var49[var47++]);
				if (var47 == var48 && field2249[11] != var49) {
					var47 = 0;
					var48 = field2267[11];
					var49 = field2249[11];
					var50 = field2257;
				}
				if (var47 < var48) {
					var51 = var50[var47];
				} else {
					var51 = -1000;
				}
			}
			while (var52 == 5 && var51 > var46) {
				this.method791(var49[var47++]);
				if (var47 == var48 && field2249[11] != var49) {
					var47 = 0;
					var48 = field2267[11];
					var49 = field2249[11];
					var50 = field2257;
				}
				if (var47 < var48) {
					var51 = var50[var47];
				} else {
					var51 = -1000;
				}
			}
			int var53 = field2267[var52];
			int[] var54 = field2249[var52];
			for (int var55 = 0; var55 < var53; var55++) {
				this.method791(var54[var55]);
			}
		}
		while (var51 != -1000) {
			this.method791(var49[var47++]);
			if (var47 == var48 && field2249[11] != var49) {
				var47 = 0;
				var49 = field2249[11];
				var48 = field2267[11];
				var50 = field2257;
			}
			if (var47 < var48) {
				var51 = var50[var47];
			} else {
				var51 = -1000;
			}
		}
	}

	@ObfuscatedName("pa.a(III)I")
	public static int method784(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return field2240[arg1];
		}
		int var4 = (arg0 & 0x7F) * arg1 >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	@ObfuscatedName("pa.c(Z)Lpa;")
	public Model copyForAnim(boolean arg0) {
		if (!arg0 && field2233.length < this.numFaces) {
			field2233 = new int[this.numFaces + 100];
		}
		return this.method788(arg0, field2211, field2233);
	}

	@ObfuscatedName("pa.f()V")
	public void mirror() {
		this.field2215 = null;
		this.field2210 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointZ[var1] = -this.pointZ[var1];
		}
		for (int var2 = 0; var2 < this.numFaces; var2++) {
			int var3 = this.faceVertexA[var2];
			this.faceVertexA[var2] = this.faceVertexC[var2];
			this.faceVertexC[var2] = var3;
		}
	}

	@ObfuscatedName("pa.g()V")
	public void rotate180() {
		this.field2215 = null;
		this.field2210 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointX[var1] = -this.pointX[var1];
			this.pointZ[var1] = -this.pointZ[var1];
		}
	}

	@ObfuscatedName("pa.a(ZLpa;[I)Lpa;")
	public Model method788(boolean arg0, Model arg1, int[] arg2) {
		arg1.numPoints = this.numPoints;
		arg1.numFaces = this.numFaces;
		arg1.numT = this.numT;
		if (arg1.pointX == null || arg1.pointX.length < this.numPoints) {
			arg1.pointX = new int[this.numPoints + 100];
			arg1.pointY = new int[this.numPoints + 100];
			arg1.pointZ = new int[this.numPoints + 100];
		}
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			arg1.pointX[var4] = this.pointX[var4];
			arg1.pointY[var4] = this.pointY[var4];
			arg1.pointZ[var4] = this.pointZ[var4];
		}
		if (arg0) {
			arg1.faceAlpha = this.faceAlpha;
		} else {
			arg1.faceAlpha = arg2;
			if (this.faceAlpha == null) {
				for (int var5 = 0; var5 < this.numFaces; var5++) {
					arg1.faceAlpha[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.numFaces; var6++) {
					arg1.faceAlpha[var6] = this.faceAlpha[var6];
				}
			}
		}
		arg1.faceRenderType = this.faceRenderType;
		arg1.faceColour = this.faceColour;
		arg1.facePriority = this.facePriority;
		arg1.priority = this.priority;
		arg1.labelFaces = this.labelFaces;
		arg1.labelVertices = this.labelVertices;
		arg1.faceVertexA = this.faceVertexA;
		arg1.faceVertexB = this.faceVertexB;
		arg1.faceVertexC = this.faceVertexC;
		arg1.field2225 = this.field2225;
		arg1.field2222 = this.field2222;
		arg1.field2227 = this.field2227;
		arg1.faceTextureP = this.faceTextureP;
		arg1.faceTextureM = this.faceTextureM;
		arg1.faceTextureN = this.faceTextureN;
		arg1.useAABBMouseCheck = this.useAABBMouseCheck;
		arg1.field2210 = 0;
		return arg1;
	}

	@ObfuscatedName("pa.b(III)V")
	public void resize(int arg0, int arg1, int arg2) {
		this.field2215 = null;
		this.field2210 = 0;
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] = this.pointX[var4] * arg0 / 128;
			this.pointY[var4] = this.pointY[var4] * arg1 / 128;
			this.pointZ[var4] = this.pointZ[var4] * arg2 / 128;
		}
	}

	@ObfuscatedName("pa.h()V")
	public void method790() {
		if (this.field2210 == 3) {
			return;
		}
		this.field2210 = 3;
		super.field3135 = 0;
		this.field2216 = 0;
		this.field2212 = 999999;
		this.field2204 = -999999;
		this.field2230 = -99999;
		this.field2218 = 99999;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			int var3 = this.pointY[var1];
			int var4 = this.pointZ[var1];
			if (var2 < this.field2212) {
				this.field2212 = var2;
			}
			if (var2 > this.field2204) {
				this.field2204 = var2;
			}
			if (var4 < this.field2218) {
				this.field2218 = var4;
			}
			if (var4 > this.field2230) {
				this.field2230 = var4;
			}
			if (-var3 > super.field3135) {
				super.field3135 = -var3;
			}
			if (var3 > this.field2216) {
				this.field2216 = var3;
			}
		}
	}

	@ObfuscatedName("pa.i(I)V")
	public void method791(int arg0) {
		if (field2265[arg0]) {
			this.method782(arg0);
			return;
		}
		int var2 = this.faceVertexA[arg0];
		int var3 = this.faceVertexB[arg0];
		int var4 = this.faceVertexC[arg0];
		Pix3D.field779 = field2242[arg0];
		if (this.faceAlpha == null) {
			Pix3D.field765 = 0;
		} else {
			Pix3D.field765 = this.faceAlpha[arg0];
		}
		int var5;
		if (this.faceRenderType == null) {
			var5 = 0;
		} else {
			var5 = this.faceRenderType[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.method360(field2245[var2], field2245[var3], field2245[var4], field2250[var2], field2250[var3], field2250[var4], this.field2225[arg0], this.field2222[arg0], this.field2227[arg0]);
		} else if (var5 == 1) {
			Pix3D.method366(field2245[var2], field2245[var3], field2245[var4], field2250[var2], field2250[var3], field2250[var4], field2243[this.field2225[arg0]]);
		} else if (var5 == 2) {
			int var6 = this.faceRenderType[arg0] >> 2;
			int var7 = this.faceTextureP[var6];
			int var8 = this.faceTextureM[var6];
			int var9 = this.faceTextureN[var6];
			Pix3D.method353(field2245[var2], field2245[var3], field2245[var4], field2250[var2], field2250[var3], field2250[var4], this.field2225[arg0], this.field2222[arg0], this.field2227[arg0], field2266[var7], field2266[var8], field2266[var9], field2244[var7], field2244[var8], field2244[var9], field2264[var7], field2264[var8], field2264[var9], this.faceColour[arg0]);
		} else if (var5 == 3) {
			int var10 = this.faceRenderType[arg0] >> 2;
			int var11 = this.faceTextureP[var10];
			int var12 = this.faceTextureM[var10];
			int var13 = this.faceTextureN[var10];
			Pix3D.method353(field2245[var2], field2245[var3], field2245[var4], field2250[var2], field2250[var3], field2250[var4], this.field2225[arg0], this.field2225[arg0], this.field2225[arg0], field2266[var11], field2266[var12], field2266[var13], field2244[var11], field2244[var12], field2244[var13], field2264[var11], field2264[var12], field2264[var13], this.faceColour[arg0]);
		}
	}

	@ObfuscatedName("pa.i()V")
	public void rotate270() {
		this.field2215 = null;
		this.field2210 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointZ[var1];
			this.pointZ[var1] = this.pointX[var1];
			this.pointX[var1] = -var2;
		}
	}

	@ObfuscatedName("pa.a(Lt;I)V")
	public void animate(AnimFrameSet arg0, int arg1) {
		if (this.labelVertices == null || arg1 == -1) {
			return;
		}
		this.field2215 = null;
		this.field2210 = 0;
		AnimFrame var3 = arg0.list[arg1];
		AnimBase var4 = var3.field2121;
		field2259 = 0;
		field2254 = 0;
		field2247 = 0;
		for (int var5 = 0; var5 < var3.field2119; var5++) {
			int var6 = var3.field2122[var5];
			this.method779(var4.field3117[var6], var4.field3107[var6], var3.field2120[var5], var3.field2125[var5], var3.field2124[var5]);
		}
	}

	@ObfuscatedName("pa.c(III)V")
	public void method794() {
		int var1 = this.field2234 >> 16;
		int var2 = this.field2234 << 16 >> 16;
		this.method776(var1, var2, -50, -10, -50);
	}

	@ObfuscatedName("pa.j()V")
	public void method795() {
		if (this.field2210 == 2) {
			return;
		}
		this.field2210 = 2;
		this.field2212 = 0;
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			int var3 = this.pointY[var1];
			int var4 = this.pointZ[var1];
			int var5 = var3 * var3 + var2 * var2 + var4 * var4;
			if (var5 > this.field2212) {
				this.field2212 = var5;
			}
		}
		this.field2212 = (int) (Math.sqrt((double) this.field2212) + 0.99D);
		this.field2230 = this.field2212;
		this.field2204 = this.field2212 + this.field2212;
	}

	@ObfuscatedName("pa.d(III)V")
	public void translate(int arg0, int arg1, int arg2) {
		this.field2210 = 0;
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] += arg0;
			this.pointY[var4] += arg1;
			this.pointZ[var4] += arg2;
		}
	}

	@ObfuscatedName("pa.a(Lpa;I)I")
	public int method797(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.pointX[arg1];
		int var5 = arg0.pointY[arg1];
		int var6 = arg0.pointZ[arg1];
		for (int var7 = 0; var7 < this.numPoints; var7++) {
			if (this.pointX[var7] == var4 && this.pointY[var7] == var5 && this.pointZ[var7] == var6) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.pointX[this.numPoints] = var4;
			this.pointY[this.numPoints] = var5;
			this.pointZ[this.numPoints] = var6;
			if (arg0.vertexLabel != null) {
				this.vertexLabel[this.numPoints] = arg0.vertexLabel[arg1];
			}
			var3 = this.numPoints++;
		}
		return var3;
	}

	@ObfuscatedName("pa.a(Lbd;II)Lpa;")
	public static Model load(Js5 arg0, int arg1) {
		byte[] var2 = arg0.getFile(0, arg1);
		return var2 == null ? null : new Model(var2);
	}
}
