package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.ArrayUtil;

@ObfuscatedName("he")
public final class ModelUnlit extends ModelSource {

	@ObfuscatedName("he.ab")
	public int[] faceLabel;

	@ObfuscatedName("he.bb")
	public short minX;

	@ObfuscatedName("he.cb")
	public byte[] textureDirection;

	@ObfuscatedName("he.db")
	public byte[] textureSpeed;

	@ObfuscatedName("he.eb")
	public int[] faceVertexB;

	@ObfuscatedName("he.fb")
	public short field1519;

	@ObfuscatedName("he.gb")
	public short maxX;

	@ObfuscatedName("he.hb")
	public byte[] textureRenderType;

	@ObfuscatedName("he.ib")
	public int[] pointX;

	@ObfuscatedName("he.jb")
	public short contrast;

	@ObfuscatedName("he.n")
	public short[] textureScaleZ;

	@ObfuscatedName("he.o")
	public int[] pointY;

	@ObfuscatedName("he.p")
	public short[] faceTextureN;

	@ObfuscatedName("he.q")
	public byte[] textureRotation;

	@ObfuscatedName("he.r")
	public short maxZ;

	@ObfuscatedName("he.s")
	public byte[] faceRenderType;

	@ObfuscatedName("he.t")
	public static final int[] sinTable = Pix3D.sinTable;

	@ObfuscatedName("he.u")
	public short[] faceColour;

	@ObfuscatedName("he.v")
	public int[] vertexLabel;

	@ObfuscatedName("he.w")
	public short[] textureScaleX;

	@ObfuscatedName("he.E")
	public static final int[] shareMap = new int[10000];

	@ObfuscatedName("he.M")
	public static int shareTic = 0;

	@ObfuscatedName("he.V")
	public static final int[] cosTable = Pix3D.cosTable;

	@ObfuscatedName("he.I")
	public static final int[] shareMap2 = new int[10000];

	@ObfuscatedName("he.x")
	public int numFaces = 0;

	@ObfuscatedName("he.D")
	public boolean boundsCalculated = false;

	@ObfuscatedName("he.B")
	public int numPoints = 0;

	@ObfuscatedName("he.T")
	public byte priority = 0;

	@ObfuscatedName("he.L")
	public int numT;

	@ObfuscatedName("he.F")
	public byte[] facePriority;

	@ObfuscatedName("he.W")
	public byte[] faceAlpha;

	@ObfuscatedName("he.P")
	public short[] faceTextureId;

	@ObfuscatedName("he.A")
	public byte[] faceTextureAxis;

	@ObfuscatedName("he.S")
	public int[] pointZ;

	@ObfuscatedName("he.X")
	public int[] faceVertexA;

	@ObfuscatedName("he.R")
	public int[] faceVertexC;

	@ObfuscatedName("he.N")
	public short[] faceTextureP;

	@ObfuscatedName("he.H")
	public short[] faceTextureM;

	@ObfuscatedName("he.U")
	public short[] textureScaleY;

	@ObfuscatedName("he.Z")
	public byte[] textureTranslation;

	@ObfuscatedName("he.O")
	public byte[] field1502;

	@ObfuscatedName("he.z")
	public int[][] labelVertices;

	@ObfuscatedName("he.y")
	public int[][] labelFaces;

	@ObfuscatedName("he.J")
	public PointNormal[] pointNormal;

	@ObfuscatedName("he.Y")
	public FaceNormal[] faceNormal;

	@ObfuscatedName("he.C")
	public PointNormal[] sharedPointNormal;

	@ObfuscatedName("he.K")
	public short ambient;

	@ObfuscatedName("he.G")
	public short maxY;

	@ObfuscatedName("he.Q")
	public short minZ;

	@ObfuscatedName("he.a([[III)I")
	public static int method543(int[][] arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg2 >> 7;
		if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg2 & 0x7F;
		int var7 = arg0[var3][var4] * (128 - var5) + arg0[var3 + 1][var4] * var5 >> 7;
		int var8 = arg0[var3][var4 + 1] * (128 - var5) + arg0[var3 + 1][var4 + 1] * var5 >> 7;
		return var7 * (128 - var6) + var8 * var6 >> 7;
	}

	@ObfuscatedName("he.a(Lnb;II)Lhe;")
	public static ModelUnlit load(Js5 arg0, int arg1) {
		byte[] var2 = arg0.getFile(0, arg1);
		return var2 == null ? null : new ModelUnlit(var2);
	}

	public ModelUnlit() {
	}

	public ModelUnlit(byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.loadOb3(arg0);
		} else {
			this.loadOb2(arg0);
		}
	}

	public ModelUnlit(ModelUnlit[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		this.priority = -1;
		for (int var9 = 0; var9 < arg1; var9++) {
			ModelUnlit var10 = arg0[var9];
			if (var10 != null) {
				this.numPoints += var10.numPoints;
				this.numFaces += var10.numFaces;
				this.numT += var10.numT;
				if (var10.facePriority == null) {
					if (this.priority == -1) {
						this.priority = var10.priority;
					}
					if (this.priority != var10.priority) {
						var4 = true;
					}
				} else {
					var4 = true;
				}
				var3 |= var10.faceRenderType != null;
				var5 |= var10.faceAlpha != null;
				var6 |= var10.faceLabel != null;
				var7 |= var10.faceTextureId != null;
				var8 |= var10.faceTextureAxis != null;
			}
		}
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.vertexLabel = new int[this.numPoints];
		this.faceVertexA = new int[this.numFaces];
		this.faceVertexB = new int[this.numFaces];
		this.faceVertexC = new int[this.numFaces];
		if (var3) {
			this.faceRenderType = new byte[this.numFaces];
		}
		if (var4) {
			this.facePriority = new byte[this.numFaces];
		}
		if (var5) {
			this.faceAlpha = new byte[this.numFaces];
		}
		if (var6) {
			this.faceLabel = new int[this.numFaces];
		}
		if (var7) {
			this.faceTextureId = new short[this.numFaces];
		}
		if (var8) {
			this.faceTextureAxis = new byte[this.numFaces];
		}
		this.faceColour = new short[this.numFaces];
		if (this.numT > 0) {
			this.textureRenderType = new byte[this.numT];
			this.faceTextureP = new short[this.numT];
			this.faceTextureM = new short[this.numT];
			this.faceTextureN = new short[this.numT];
			this.textureScaleX = new short[this.numT];
			this.textureScaleY = new short[this.numT];
			this.textureScaleZ = new short[this.numT];
			this.textureRotation = new byte[this.numT];
			this.textureSpeed = new byte[this.numT];
			this.textureDirection = new byte[this.numT];
			this.textureTranslation = new byte[this.numT];
			this.field1502 = new byte[this.numT];
		}
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		for (int var11 = 0; var11 < arg1; var11++) {
			ModelUnlit var12 = arg0[var11];
			if (var12 != null) {
				for (int var13 = 0; var13 < var12.numFaces; var13++) {
					if (var3 && var12.faceRenderType != null) {
						this.faceRenderType[this.numFaces] = var12.faceRenderType[var13];
					}
					if (var4) {
						if (var12.facePriority == null) {
							this.facePriority[this.numFaces] = var12.priority;
						} else {
							this.facePriority[this.numFaces] = var12.facePriority[var13];
						}
					}
					if (var5 && var12.faceAlpha != null) {
						this.faceAlpha[this.numFaces] = var12.faceAlpha[var13];
					}
					if (var6 && var12.faceLabel != null) {
						this.faceLabel[this.numFaces] = var12.faceLabel[var13];
					}
					if (var7) {
						if (var12.faceTextureId == null) {
							this.faceTextureId[this.numFaces] = -1;
						} else {
							this.faceTextureId[this.numFaces] = var12.faceTextureId[var13];
						}
					}
					if (var8) {
						if (var12.faceTextureAxis == null || var12.faceTextureAxis[var13] == -1) {
							this.faceTextureAxis[this.numFaces] = -1;
						} else {
							this.faceTextureAxis[this.numFaces] = (byte) (var12.faceTextureAxis[var13] + this.numT);
						}
					}
					this.faceColour[this.numFaces] = var12.faceColour[var13];
					this.faceVertexA[this.numFaces] = this.addPoint(var12, var12.faceVertexA[var13]);
					this.faceVertexB[this.numFaces] = this.addPoint(var12, var12.faceVertexB[var13]);
					this.faceVertexC[this.numFaces] = this.addPoint(var12, var12.faceVertexC[var13]);
					this.numFaces++;
				}
				for (int var14 = 0; var14 < var12.numT; var14++) {
					byte var15 = this.textureRenderType[this.numT] = var12.textureRenderType[var14];
					if (var15 == 0) {
						this.faceTextureP[this.numT] = (short) this.addPoint(var12, var12.faceTextureP[var14]);
						this.faceTextureM[this.numT] = (short) this.addPoint(var12, var12.faceTextureM[var14]);
						this.faceTextureN[this.numT] = (short) this.addPoint(var12, var12.faceTextureN[var14]);
					}
					if (var15 >= 1 && var15 <= 3) {
						this.faceTextureP[this.numT] = var12.faceTextureP[var14];
						this.faceTextureM[this.numT] = var12.faceTextureM[var14];
						this.faceTextureN[this.numT] = var12.faceTextureN[var14];
						this.textureScaleX[this.numT] = var12.textureScaleX[var14];
						this.textureScaleY[this.numT] = var12.textureScaleY[var14];
						this.textureScaleZ[this.numT] = var12.textureScaleZ[var14];
						this.textureRotation[this.numT] = var12.textureRotation[var14];
						this.textureSpeed[this.numT] = var12.textureSpeed[var14];
						this.textureDirection[this.numT] = var12.textureDirection[var14];
					}
					if (var15 == 2) {
						this.textureTranslation[this.numT] = var12.textureTranslation[var14];
						this.field1502[this.numT] = var12.field1502[var14];
					}
					this.numT++;
				}
			}
		}
	}

	public ModelUnlit(ModelUnlit arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
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
			for (int var6 = 0; var6 < this.numPoints; var6++) {
				this.pointX[var6] = arg0.pointX[var6];
				this.pointY[var6] = arg0.pointY[var6];
				this.pointZ[var6] = arg0.pointZ[var6];
			}
		}
		if (arg2) {
			this.faceColour = arg0.faceColour;
		} else {
			this.faceColour = new short[this.numFaces];
			for (int var7 = 0; var7 < this.numFaces; var7++) {
				this.faceColour[var7] = arg0.faceColour[var7];
			}
		}
		if (arg3 || arg0.faceTextureId == null) {
			this.faceTextureId = arg0.faceTextureId;
		} else {
			this.faceTextureId = new short[this.numFaces];
			for (int var8 = 0; var8 < this.numFaces; var8++) {
				this.faceTextureId[var8] = arg0.faceTextureId[var8];
			}
		}
		this.faceAlpha = arg0.faceAlpha;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.faceRenderType = arg0.faceRenderType;
		this.facePriority = arg0.facePriority;
		this.faceTextureAxis = arg0.faceTextureAxis;
		this.priority = arg0.priority;
		this.textureRenderType = arg0.textureRenderType;
		this.faceTextureP = arg0.faceTextureP;
		this.faceTextureM = arg0.faceTextureM;
		this.faceTextureN = arg0.faceTextureN;
		this.textureScaleX = arg0.textureScaleX;
		this.textureScaleY = arg0.textureScaleY;
		this.textureScaleZ = arg0.textureScaleZ;
		this.textureRotation = arg0.textureRotation;
		this.textureSpeed = arg0.textureSpeed;
		this.textureDirection = arg0.textureDirection;
		this.textureTranslation = arg0.textureTranslation;
		this.field1502 = arg0.field1502;
		this.vertexLabel = arg0.vertexLabel;
		this.faceLabel = arg0.faceLabel;
		this.labelVertices = arg0.labelVertices;
		this.labelFaces = arg0.labelFaces;
		this.pointNormal = arg0.pointNormal;
		this.faceNormal = arg0.faceNormal;
		this.sharedPointNormal = arg0.sharedPointNormal;
		this.ambient = arg0.ambient;
		this.contrast = arg0.contrast;
	}

	@ObfuscatedName("he.a()Z")
	@Override
	public boolean method544() {
		return true;
	}

	@ObfuscatedName("he.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
	}

	@ObfuscatedName("he.a(II[[I[[IIIIZZ)Lhe;")
	public ModelUnlit hillSkew(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		this.calcBoundingCube();
		int var8 = arg4 + this.minX;
		int var9 = arg4 + this.maxX;
		int var10 = arg6 + this.minZ;
		int var11 = arg6 + this.maxZ;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || var9 + 128 >> 7 >= arg2.length || var10 < 0 || var11 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (var8 < 0 || var9 + 128 >> 7 >= arg3.length || var10 < 0 || var11 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			int var12 = var8 >> 7;
			int var13 = var9 + 127 >> 7;
			int var14 = var10 >> 7;
			int var15 = var11 + 127 >> 7;
			if (arg2[var12][var14] == arg5 && arg2[var13][var14] == arg5 && arg2[var12][var15] == arg5 && arg2[var13][var15] == arg5) {
				return this;
			}
		}
		ModelUnlit var16 = new ModelUnlit();
		var16.numPoints = this.numPoints;
		var16.numFaces = this.numFaces;
		var16.numT = this.numT;
		var16.faceVertexA = this.faceVertexA;
		var16.faceVertexB = this.faceVertexB;
		var16.faceVertexC = this.faceVertexC;
		var16.faceRenderType = this.faceRenderType;
		var16.facePriority = this.facePriority;
		var16.faceAlpha = this.faceAlpha;
		var16.faceTextureAxis = this.faceTextureAxis;
		var16.faceColour = this.faceColour;
		var16.faceTextureId = this.faceTextureId;
		var16.priority = this.priority;
		var16.textureRenderType = this.textureRenderType;
		var16.faceTextureP = this.faceTextureP;
		var16.faceTextureM = this.faceTextureM;
		var16.faceTextureN = this.faceTextureN;
		var16.textureScaleX = this.textureScaleX;
		var16.textureScaleY = this.textureScaleY;
		var16.textureScaleZ = this.textureScaleZ;
		var16.textureRotation = this.textureRotation;
		var16.textureSpeed = this.textureSpeed;
		var16.textureDirection = this.textureDirection;
		var16.textureTranslation = this.textureTranslation;
		var16.field1502 = this.field1502;
		var16.vertexLabel = this.vertexLabel;
		var16.faceLabel = this.faceLabel;
		var16.labelVertices = this.labelVertices;
		var16.labelFaces = this.labelFaces;
		var16.ambient = this.ambient;
		var16.contrast = this.contrast;
		var16.pointNormal = this.pointNormal;
		var16.faceNormal = this.faceNormal;
		var16.sharedPointNormal = this.sharedPointNormal;
		if (arg0 == 3) {
			var16.pointX = ArrayUtil.method169(this.pointX);
			var16.pointY = ArrayUtil.method169(this.pointY);
			var16.pointZ = ArrayUtil.method169(this.pointZ);
		} else {
			var16.pointX = this.pointX;
			var16.pointY = new int[var16.numPoints];
			var16.pointZ = this.pointZ;
		}
		if (arg0 == 1) {
			for (int var17 = 0; var17 < var16.numPoints; var17++) {
				int var18 = this.pointX[var17] + arg4;
				int var19 = this.pointZ[var17] + arg6;
				int var20 = var18 & 0x7F;
				int var21 = var19 & 0x7F;
				int var22 = var18 >> 7;
				int var23 = var19 >> 7;
				int var24 = arg2[var22][var23] * (128 - var20) + arg2[var22 + 1][var23] * var20 >> 7;
				int var25 = arg2[var22][var23 + 1] * (128 - var20) + arg2[var22 + 1][var23 + 1] * var20 >> 7;
				int var26 = var24 * (128 - var21) + var25 * var21 >> 7;
				var16.pointY[var17] = this.pointY[var17] + var26 - arg5;
			}
		} else if (arg0 == 2) {
			for (int var27 = 0; var27 < var16.numPoints; var27++) {
				int var28 = (this.pointY[var27] << 16) / this.field1519;
				if (var28 < arg1) {
					int var29 = this.pointX[var27] + arg4;
					int var30 = this.pointZ[var27] + arg6;
					int var31 = var29 & 0x7F;
					int var32 = var30 & 0x7F;
					int var33 = var29 >> 7;
					int var34 = var30 >> 7;
					int var35 = arg2[var33][var34] * (128 - var31) + arg2[var33 + 1][var34] * var31 >> 7;
					int var36 = arg2[var33][var34 + 1] * (128 - var31) + arg2[var33 + 1][var34 + 1] * var31 >> 7;
					int var37 = var35 * (128 - var32) + var36 * var32 >> 7;
					var16.pointY[var27] = this.pointY[var27] + (var37 - arg5) * (arg1 - var28) / arg1;
				} else {
					var16.pointY[var27] = this.pointY[var27];
				}
			}
		} else if (arg0 == 3) {
			int var38 = (arg1 & 0xFF) * 4;
			int var39 = (arg1 >> 8 & 0xFF) * 4;
			this.method562(arg2, arg4, arg5, arg6, var38, var39);
		} else if (arg0 == 4) {
			int var40 = this.maxY - this.field1519;
			for (int var41 = 0; var41 < this.numPoints; var41++) {
				int var42 = this.pointX[var41] + arg4;
				int var43 = this.pointZ[var41] + arg6;
				int var44 = var42 & 0x7F;
				int var45 = var43 & 0x7F;
				int var46 = var42 >> 7;
				int var47 = var43 >> 7;
				int var48 = arg3[var46][var47] * (128 - var44) + arg3[var46 + 1][var47] * var44 >> 7;
				int var49 = arg3[var46][var47 + 1] * (128 - var44) + arg3[var46 + 1][var47 + 1] * var44 >> 7;
				int var50 = var48 * (128 - var45) + var49 * var45 >> 7;
				var16.pointY[var41] = this.pointY[var41] + var50 + var40 - arg5;
			}
		} else if (arg0 == 5) {
			int var51 = this.maxY - this.field1519;
			for (int var52 = 0; var52 < this.numPoints; var52++) {
				int var53 = this.pointX[var52] + arg4;
				int var54 = this.pointZ[var52] + arg6;
				int var55 = var53 & 0x7F;
				int var56 = var54 & 0x7F;
				int var57 = var53 >> 7;
				int var58 = var54 >> 7;
				int var59 = arg2[var57][var58] * (128 - var55) + arg2[var57 + 1][var58] * var55 >> 7;
				int var60 = arg2[var57][var58 + 1] * (128 - var55) + arg2[var57 + 1][var58 + 1] * var55 >> 7;
				int var61 = var59 * (128 - var56) + var60 * var56 >> 7;
				int var62 = arg3[var57][var58] * (128 - var55) + arg3[var57 + 1][var58] * var55 >> 7;
				int var63 = arg3[var57][var58 + 1] * (128 - var55) + arg3[var57 + 1][var58 + 1] * var55 >> 7;
				int var64 = var62 * (128 - var56) + var63 * var56 >> 7;
				int var65 = var61 - var64;
				var16.pointY[var52] = ((this.pointY[var52] << 8) / var51 * var65 >> 8) - (arg5 - var61);
			}
		}
		this.boundsCalculated = false;
		return var16;
	}

	@ObfuscatedName("he.a(IIIII)Lcg;")
	public ModelLit light(int arg0, int arg1, int arg2, int arg3, int arg4) {
		return new SoftwareModelLit(this, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("he.b(IIIII)Lle;")
	public SoftwareModelLit method547(int arg0, int arg1) {
		return new SoftwareModelLit(this, arg0, arg1, -50, -10, -50);
	}

	@ObfuscatedName("he.c()V")
	public void calculateNormals() {
		if (this.pointNormal != null) {
			return;
		}
		this.pointNormal = new PointNormal[this.numPoints];
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointNormal[var1] = new PointNormal();
		}
		for (int var2 = 0; var2 < this.numFaces; var2++) {
			int var3 = this.faceVertexA[var2];
			int var4 = this.faceVertexB[var2];
			int var5 = this.faceVertexC[var2];
			int var6 = this.pointX[var4] - this.pointX[var3];
			int var7 = this.pointY[var4] - this.pointY[var3];
			int var8 = this.pointZ[var4] - this.pointZ[var3];
			int var9 = this.pointX[var5] - this.pointX[var3];
			int var10 = this.pointY[var5] - this.pointY[var3];
			int var11 = this.pointZ[var5] - this.pointZ[var3];
			int var12 = var7 * var11 - var10 * var8;
			int var13 = var8 * var9 - var11 * var6;
			int var14;
			for (var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
				var12 >>= 0x1;
				var13 >>= 0x1;
			}
			int var15 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + var14 * var14));
			if (var15 <= 0) {
				var15 = 1;
			}
			int var16 = var12 * 256 / var15;
			int var17 = var13 * 256 / var15;
			int var18 = var14 * 256 / var15;
			byte var19;
			if (this.faceRenderType == null) {
				var19 = 0;
			} else {
				var19 = this.faceRenderType[var2];
			}
			if (var19 == 0) {
				PointNormal var20 = this.pointNormal[var3];
				var20.x += var16;
				var20.y += var17;
				var20.z += var18;
				var20.w++;
				PointNormal var21 = this.pointNormal[var4];
				var21.x += var16;
				var21.y += var17;
				var21.z += var18;
				var21.w++;
				PointNormal var22 = this.pointNormal[var5];
				var22.x += var16;
				var22.y += var17;
				var22.z += var18;
				var22.w++;
			} else if (var19 == 1) {
				if (this.faceNormal == null) {
					this.faceNormal = new FaceNormal[this.numFaces];
				}
				FaceNormal var23 = this.faceNormal[var2] = new FaceNormal();
				var23.x = var16;
				var23.y = var17;
				var23.z = var18;
			}
		}
	}

	@ObfuscatedName("he.c(III)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] += arg0;
			this.pointY[var4] += arg1;
			this.pointZ[var4] += arg2;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.b(I)V")
	public void rotateXAxis(int arg0) {
		int var2 = sinTable[arg0];
		int var3 = cosTable[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointY[var4] * var3 - this.pointZ[var4] * var2 >> 16;
			this.pointZ[var4] = this.pointY[var4] * var2 + this.pointZ[var4] * var3 >> 16;
			this.pointY[var4] = var5;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.d()V")
	public void mirror() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointZ[var1] = -this.pointZ[var1];
		}
		for (int var2 = 0; var2 < this.numFaces; var2++) {
			int var3 = this.faceVertexA[var2];
			this.faceVertexA[var2] = this.faceVertexC[var2];
			this.faceVertexC[var2] = var3;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.d(III)V")
	public void resize(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] = this.pointX[var4] * arg0 / 128;
			this.pointY[var4] = this.pointY[var4] * arg1 / 128;
			this.pointZ[var4] = this.pointZ[var4] * arg2 / 128;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.a(SS)V")
	public void retexture(short arg0, short arg1) {
		if (this.faceTextureId == null) {
			return;
		}
		for (int var3 = 0; var3 < this.numFaces; var3++) {
			if (this.faceTextureId[var3] == arg0) {
				this.faceTextureId[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("he.e()V")
	public void geometryChanged() {
		this.pointNormal = null;
		this.sharedPointNormal = null;
		this.faceNormal = null;
		this.boundsCalculated = false;
	}

	@ObfuscatedName("he.f()V")
	public void rotate90() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			this.pointX[var1] = this.pointZ[var1];
			this.pointZ[var1] = -var2;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.a([B)V")
	public void loadOb3(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		var2.pos = arg0.length - 23;
		int var9 = var2.g2();
		int var10 = var2.g2();
		int var11 = var2.g1();
		int var12 = var2.g1();
		int var13 = var2.g1();
		int var14 = var2.g1();
		int var15 = var2.g1();
		int var16 = var2.g1();
		int var17 = var2.g1();
		int var18 = var2.g2();
		int var19 = var2.g2();
		int var20 = var2.g2();
		int var21 = var2.g2();
		int var22 = var2.g2();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		if (var11 > 0) {
			this.textureRenderType = new byte[var11];
			var2.pos = 0;
			for (int var26 = 0; var26 < var11; var26++) {
				byte var27 = this.textureRenderType[var26] = var2.g1b();
				if (var27 == 0) {
					var23++;
				}
				if (var27 >= 1 && var27 <= 3) {
					var24++;
				}
				if (var27 == 2) {
					var25++;
				}
			}
		}
		int var29 = var11 + var9;
		int var30 = var29;
		if (var12 == 1) {
			var29 += var10;
		}
		int var32 = var29 + var10;
		int var33 = var32;
		if (var13 == 255) {
			var32 += var10;
		}
		int var34 = var32;
		if (var15 == 1) {
			var32 += var10;
		}
		int var35 = var32;
		if (var17 == 1) {
			var32 += var9;
		}
		int var36 = var32;
		if (var14 == 1) {
			var32 += var10;
		}
		int var38 = var32 + var21;
		int var39 = var38;
		if (var16 == 1) {
			var38 += var10 * 2;
		}
		int var41 = var38 + var22;
		int var43 = var41 + var10 * 2;
		int var45 = var43 + var18;
		int var47 = var45 + var19;
		int var49 = var47 + var20;
		int var51 = var49 + var23 * 6;
		int var53 = var51 + var24 * 6;
		int var55 = var53 + var24 * 6;
		int var57 = var55 + var24;
		int var59 = var57 + var24;
		this.numPoints = var9;
		this.numFaces = var10;
		this.numT = var11;
		this.pointX = new int[var9];
		this.pointY = new int[var9];
		this.pointZ = new int[var9];
		this.faceVertexA = new int[var10];
		this.faceVertexB = new int[var10];
		this.faceVertexC = new int[var10];
		if (var17 == 1) {
			this.vertexLabel = new int[var9];
		}
		if (var12 == 1) {
			this.faceRenderType = new byte[var10];
		}
		if (var13 == 255) {
			this.facePriority = new byte[var10];
		} else {
			this.priority = (byte) var13;
		}
		if (var14 == 1) {
			this.faceAlpha = new byte[var10];
		}
		if (var15 == 1) {
			this.faceLabel = new int[var10];
		}
		if (var16 == 1) {
			this.faceTextureId = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.faceTextureAxis = new byte[var10];
		}
		this.faceColour = new short[var10];
		if (var11 > 0) {
			this.faceTextureP = new short[var11];
			this.faceTextureM = new short[var11];
			this.faceTextureN = new short[var11];
			if (var24 > 0) {
				this.textureScaleX = new short[var24];
				this.textureScaleY = new short[var24];
				this.textureScaleZ = new short[var24];
				this.textureRotation = new byte[var24];
				this.textureSpeed = new byte[var24];
				this.textureDirection = new byte[var24];
			}
			if (var25 > 0) {
				this.textureTranslation = new byte[var25];
				this.field1502 = new byte[var25];
			}
		}
		var2.pos = var11;
		var3.pos = var43;
		var4.pos = var45;
		var5.pos = var47;
		var6.pos = var35;
		int var61 = 0;
		int var62 = 0;
		int var63 = 0;
		for (int var64 = 0; var64 < var9; var64++) {
			int var65 = var2.g1();
			int var66 = 0;
			if ((var65 & 0x1) != 0) {
				var66 = var3.method342();
			}
			int var67 = 0;
			if ((var65 & 0x2) != 0) {
				var67 = var4.method342();
			}
			int var68 = 0;
			if ((var65 & 0x4) != 0) {
				var68 = var5.method342();
			}
			this.pointX[var64] = var61 + var66;
			this.pointY[var64] = var62 + var67;
			this.pointZ[var64] = var63 + var68;
			var61 = this.pointX[var64];
			var62 = this.pointY[var64];
			var63 = this.pointZ[var64];
			if (var17 == 1) {
				this.vertexLabel[var64] = var6.g1();
			}
		}
		var2.pos = var41;
		var3.pos = var30;
		var4.pos = var33;
		var5.pos = var36;
		var6.pos = var34;
		var7.pos = var39;
		var8.pos = var38;
		for (int var69 = 0; var69 < var10; var69++) {
			this.faceColour[var69] = (short) var2.g2();
			if (var12 == 1) {
				this.faceRenderType[var69] = var3.g1b();
			}
			if (var13 == 255) {
				this.facePriority[var69] = var4.g1b();
			}
			if (var14 == 1) {
				this.faceAlpha[var69] = var5.g1b();
			}
			if (var15 == 1) {
				this.faceLabel[var69] = var6.g1();
			}
			if (var16 == 1) {
				this.faceTextureId[var69] = (short) (var7.g2() - 1);
			}
			if (this.faceTextureAxis != null) {
				if (this.faceTextureId[var69] == -1) {
					this.faceTextureAxis[var69] = -1;
				} else {
					this.faceTextureAxis[var69] = (byte) (var8.g1() - 1);
				}
			}
		}
		var2.pos = var32;
		var3.pos = var29;
		int var70 = 0;
		int var71 = 0;
		int var72 = 0;
		int var73 = 0;
		for (int var74 = 0; var74 < var10; var74++) {
			int var75 = var3.g1();
			if (var75 == 1) {
				var70 = var2.method342() + var73;
				var71 = var2.method342() + var70;
				var72 = var2.method342() + var71;
				var73 = var72;
				this.faceVertexA[var74] = var70;
				this.faceVertexB[var74] = var71;
				this.faceVertexC[var74] = var72;
			}
			if (var75 == 2) {
				var71 = var72;
				var72 = var2.method342() + var73;
				var73 = var72;
				this.faceVertexA[var74] = var70;
				this.faceVertexB[var74] = var71;
				this.faceVertexC[var74] = var72;
			}
			if (var75 == 3) {
				var70 = var72;
				var72 = var2.method342() + var73;
				var73 = var72;
				this.faceVertexA[var74] = var70;
				this.faceVertexB[var74] = var71;
				this.faceVertexC[var74] = var72;
			}
			if (var75 == 4) {
				int var76 = var70;
				var70 = var71;
				var71 = var76;
				var72 = var2.method342() + var73;
				var73 = var72;
				this.faceVertexA[var74] = var70;
				this.faceVertexB[var74] = var76;
				this.faceVertexC[var74] = var72;
			}
		}
		var2.pos = var49;
		var3.pos = var51;
		var4.pos = var53;
		var5.pos = var55;
		var6.pos = var57;
		var7.pos = var59;
		for (int var77 = 0; var77 < var11; var77++) {
			int var78 = this.textureRenderType[var77] & 0xFF;
			if (var78 == 0) {
				this.faceTextureP[var77] = (short) var2.g2();
				this.faceTextureM[var77] = (short) var2.g2();
				this.faceTextureN[var77] = (short) var2.g2();
			}
			if (var78 == 1) {
				this.faceTextureP[var77] = (short) var3.g2();
				this.faceTextureM[var77] = (short) var3.g2();
				this.faceTextureN[var77] = (short) var3.g2();
				this.textureScaleX[var77] = (short) var4.g2();
				this.textureScaleY[var77] = (short) var4.g2();
				this.textureScaleZ[var77] = (short) var4.g2();
				this.textureRotation[var77] = var5.g1b();
				this.textureSpeed[var77] = var6.g1b();
				this.textureDirection[var77] = var7.g1b();
			}
			if (var78 == 2) {
				this.faceTextureP[var77] = (short) var3.g2();
				this.faceTextureM[var77] = (short) var3.g2();
				this.faceTextureN[var77] = (short) var3.g2();
				this.textureScaleX[var77] = (short) var4.g2();
				this.textureScaleY[var77] = (short) var4.g2();
				this.textureScaleZ[var77] = (short) var4.g2();
				this.textureRotation[var77] = var5.g1b();
				this.textureSpeed[var77] = var6.g1b();
				this.textureDirection[var77] = var7.g1b();
				this.textureTranslation[var77] = var7.g1b();
				this.field1502[var77] = var7.g1b();
			}
			if (var78 == 3) {
				this.faceTextureP[var77] = (short) var3.g2();
				this.faceTextureM[var77] = (short) var3.g2();
				this.faceTextureN[var77] = (short) var3.g2();
				this.textureScaleX[var77] = (short) var4.g2();
				this.textureScaleY[var77] = (short) var4.g2();
				this.textureScaleZ[var77] = (short) var4.g2();
				this.textureRotation[var77] = var5.g1b();
				this.textureSpeed[var77] = var6.g1b();
				this.textureDirection[var77] = var7.g1b();
			}
		}
	}

	@ObfuscatedName("he.h()Lhe;")
	public ModelUnlit copyForShareLight() {
		ModelUnlit var1 = new ModelUnlit();
		if (this.faceRenderType != null) {
			var1.faceRenderType = new byte[this.numFaces];
			for (int var2 = 0; var2 < this.numFaces; var2++) {
				var1.faceRenderType[var2] = this.faceRenderType[var2];
			}
		}
		var1.numPoints = this.numPoints;
		var1.numFaces = this.numFaces;
		var1.numT = this.numT;
		var1.pointX = this.pointX;
		var1.pointY = this.pointY;
		var1.pointZ = this.pointZ;
		var1.faceVertexA = this.faceVertexA;
		var1.faceVertexB = this.faceVertexB;
		var1.faceVertexC = this.faceVertexC;
		var1.facePriority = this.facePriority;
		var1.faceAlpha = this.faceAlpha;
		var1.faceTextureAxis = this.faceTextureAxis;
		var1.faceColour = this.faceColour;
		var1.faceTextureId = this.faceTextureId;
		var1.priority = this.priority;
		var1.textureRenderType = this.textureRenderType;
		var1.faceTextureP = this.faceTextureP;
		var1.faceTextureM = this.faceTextureM;
		var1.faceTextureN = this.faceTextureN;
		var1.textureScaleX = this.textureScaleX;
		var1.textureScaleY = this.textureScaleY;
		var1.textureScaleZ = this.textureScaleZ;
		var1.textureRotation = this.textureRotation;
		var1.textureSpeed = this.textureSpeed;
		var1.textureDirection = this.textureDirection;
		var1.textureTranslation = this.textureTranslation;
		var1.field1502 = this.field1502;
		var1.vertexLabel = this.vertexLabel;
		var1.faceLabel = this.faceLabel;
		var1.labelVertices = this.labelVertices;
		var1.labelFaces = this.labelFaces;
		var1.pointNormal = this.pointNormal;
		var1.faceNormal = this.faceNormal;
		var1.ambient = this.ambient;
		var1.contrast = this.contrast;
		return var1;
	}

	@ObfuscatedName("he.a(III)Lnc;")
	@Override
	public ModelSource method559() {
		return this.light(this.ambient, this.contrast, -50, -10, -50);
	}

	@ObfuscatedName("he.b()I")
	@Override
	public int method88() {
		if (!this.boundsCalculated) {
			this.calcBoundingCube();
		}
		return this.field1519;
	}

	@ObfuscatedName("he.c(I)V")
	public void method560(int arg0) {
		int var2 = sinTable[arg0];
		int var3 = cosTable[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointY[var4] * var2 + this.pointX[var4] * var3 >> 16;
			this.pointY[var4] = this.pointY[var4] * var3 - this.pointX[var4] * var2 >> 16;
			this.pointX[var4] = var5;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.i()V")
	public void calcBoundingCube() {
		if (this.boundsCalculated) {
			return;
		}
		this.boundsCalculated = true;
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		for (int var7 = 0; var7 < this.numPoints; var7++) {
			int var8 = this.pointX[var7];
			int var9 = this.pointY[var7];
			int var10 = this.pointZ[var7];
			if (var8 < var1) {
				var1 = var8;
			}
			if (var8 > var4) {
				var4 = var8;
			}
			if (var9 < var2) {
				var2 = var9;
			}
			if (var9 > var5) {
				var5 = var9;
			}
			if (var10 < var3) {
				var3 = var10;
			}
			if (var10 > var6) {
				var6 = var10;
			}
		}
		this.minX = (short) var1;
		this.maxX = (short) var4;
		this.field1519 = (short) var2;
		this.maxY = (short) var5;
		this.minZ = (short) var3;
		this.maxZ = (short) var6;
	}

	@ObfuscatedName("he.a([[IIIIII)V")
	public void method562(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = -arg4 / 2;
		int var8 = -arg5 / 2;
		int var9 = method543(arg0, arg1 + var7, arg3 + var8);
		int var10 = arg4 / 2;
		int var11 = -arg5 / 2;
		int var12 = method543(arg0, arg1 + var10, arg3 + var11);
		int var13 = -arg4 / 2;
		int var14 = arg5 / 2;
		int var15 = method543(arg0, arg1 + var13, arg3 + var14);
		int var16 = arg4 / 2;
		int var17 = arg5 / 2;
		int var18 = method543(arg0, arg1 + var16, arg3 + var17);
		int var19 = var9 < var12 ? var9 : var12;
		int var20 = var15 < var18 ? var15 : var18;
		int var21 = var12 < var18 ? var12 : var18;
		int var22 = var9 < var15 ? var9 : var15;
		int var23 = (int) (Math.atan2((double) (var19 - var20), (double) arg5) * 325.95D) & 0x7FF;
		if (var23 != 0) {
			this.rotateXAxis(var23);
		}
		int var24 = (int) (Math.atan2((double) (var22 - var21), (double) arg4) * 325.95D) & 0x7FF;
		if (var24 != 0) {
			this.method560(var24);
		}
		int var25 = var9 + var18;
		if (var12 + var15 < var25) {
			var25 = var12 + var15;
		}
		int var26 = (var25 >> 1) - arg2;
		if (var26 != 0) {
			this.translate(0, var26, 0);
		}
	}

	@ObfuscatedName("he.j()V")
	public void method563() {
		this.vertexLabel = null;
		this.faceLabel = null;
		this.labelVertices = null;
		this.labelFaces = null;
	}

	@ObfuscatedName("he.b(SS)V")
	public void recolour(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.numFaces; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("he.e(III)V")
	public void method565(int arg0, int arg1, int arg2) {
		if (arg2 != 0) {
			int var4 = sinTable[arg2];
			int var5 = cosTable[arg2];
			for (int var6 = 0; var6 < this.numPoints; var6++) {
				int var7 = this.pointY[var6] * var4 + this.pointX[var6] * var5 >> 16;
				this.pointY[var6] = this.pointY[var6] * var5 - this.pointX[var6] * var4 >> 16;
				this.pointX[var6] = var7;
			}
		}
		if (arg0 != 0) {
			int var8 = sinTable[arg0];
			int var9 = cosTable[arg0];
			for (int var10 = 0; var10 < this.numPoints; var10++) {
				int var11 = this.pointY[var10] * var9 - this.pointZ[var10] * var8 >> 16;
				this.pointZ[var10] = this.pointY[var10] * var8 + this.pointZ[var10] * var9 >> 16;
				this.pointY[var10] = var11;
			}
		}
		if (arg1 != 0) {
			int var12 = sinTable[arg1];
			int var13 = cosTable[arg1];
			for (int var14 = 0; var14 < this.numPoints; var14++) {
				int var15 = this.pointZ[var14] * var12 + this.pointX[var14] * var13 >> 16;
				this.pointZ[var14] = this.pointZ[var14] * var13 - this.pointX[var14] * var12 >> 16;
				this.pointX[var14] = var15;
			}
		}
	}

	@ObfuscatedName("he.k()V")
	public void rotate270() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointZ[var1];
			this.pointZ[var1] = this.pointX[var1];
			this.pointX[var1] = -var2;
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.a(Lhe;I)I")
	public int addPoint(ModelUnlit arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.pointX[arg1];
		int var5 = arg0.pointY[arg1];
		int var6 = arg0.pointZ[arg1];
		for (int var7 = 0; var7 < this.numPoints; var7++) {
			if (var4 == this.pointX[var7] && var5 == this.pointY[var7] && var6 == this.pointZ[var7]) {
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

	@ObfuscatedName("he.l()V")
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
		if (this.faceLabel == null) {
			return;
		}
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

	@ObfuscatedName("he.a(Lnc;IIIZ)V")
	@Override
	public void method570(ModelSource arg0, int arg1, int arg2, int arg3, boolean arg4) {
		ModelUnlit var6 = (ModelUnlit) arg0;
		var6.calcBoundingCube();
		var6.calculateNormals();
		shareTic++;
		int var7 = 0;
		int[] var8 = var6.pointX;
		int var9 = var6.numPoints;
		for (int var10 = 0; var10 < this.numPoints; var10++) {
			PointNormal var11 = this.pointNormal[var10];
			if (var11.w != 0) {
				int var12 = this.pointY[var10] - arg2;
				if (var12 >= var6.field1519 && var12 <= var6.maxY) {
					int var13 = this.pointX[var10] - arg1;
					if (var13 >= var6.minX && var13 <= var6.maxX) {
						int var14 = this.pointZ[var10] - arg3;
						if (var14 >= var6.minZ && var14 <= var6.maxZ) {
							for (int var15 = 0; var15 < var9; var15++) {
								PointNormal var16 = var6.pointNormal[var15];
								if (var13 == var8[var15] && var14 == var6.pointZ[var15] && var12 == var6.pointY[var15] && var16.w != 0) {
									if (this.sharedPointNormal == null) {
										this.sharedPointNormal = new PointNormal[this.numPoints];
									}
									if (var6.sharedPointNormal == null) {
										var6.sharedPointNormal = new PointNormal[var9];
									}
									PointNormal var17 = this.sharedPointNormal[var10];
									if (var17 == null) {
										var17 = this.sharedPointNormal[var10] = new PointNormal(var11);
									}
									PointNormal var18 = var6.sharedPointNormal[var15];
									if (var18 == null) {
										var18 = var6.sharedPointNormal[var15] = new PointNormal(var16);
									}
									var17.x += var16.x;
									var17.y += var16.y;
									var17.z += var16.z;
									var17.w += var16.w;
									var18.x += var11.x;
									var18.y += var11.y;
									var18.z += var11.z;
									var18.w += var11.w;
									var7++;
									shareMap[var10] = shareTic;
									shareMap2[var15] = shareTic;
								}
							}
						}
					}
				}
			}
		}
		if (var7 < 3 || !arg4) {
			return;
		}
		for (int var19 = 0; var19 < this.numFaces; var19++) {
			if (shareMap[this.faceVertexA[var19]] == shareTic && shareMap[this.faceVertexB[var19]] == shareTic && shareMap[this.faceVertexC[var19]] == shareTic) {
				if (this.faceRenderType == null) {
					this.faceRenderType = new byte[this.numFaces];
				}
				this.faceRenderType[var19] = 2;
			}
		}
		for (int var20 = 0; var20 < var6.numFaces; var20++) {
			if (shareMap2[var6.faceVertexA[var20]] == shareTic && shareMap2[var6.faceVertexB[var20]] == shareTic && shareMap2[var6.faceVertexC[var20]] == shareTic) {
				if (var6.faceRenderType == null) {
					var6.faceRenderType = new byte[var6.numFaces];
				}
				var6.faceRenderType[var20] = 2;
			}
		}
	}

	@ObfuscatedName("he.b([B)V")
	public void loadOb2(byte[] arg0) {
		boolean var2 = false;
		boolean var3 = false;
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		var4.pos = arg0.length - 18;
		int var9 = var4.g2();
		int var10 = var4.g2();
		int var11 = var4.g1();
		int var12 = var4.g1();
		int var13 = var4.g1();
		int var14 = var4.g1();
		int var15 = var4.g1();
		int var16 = var4.g1();
		int var17 = var4.g2();
		int var18 = var4.g2();
		int var19 = var4.g2();
		int var20 = var4.g2();
		int var21 = var9;
		int var23 = var21 + var10;
		int var24 = var23;
		if (var13 == 255) {
			var23 += var10;
		}
		int var25 = var23;
		if (var15 == 1) {
			var23 += var10;
		}
		int var26 = var23;
		if (var12 == 1) {
			var23 += var10;
		}
		int var27 = var23;
		if (var16 == 1) {
			var23 += var9;
		}
		int var28 = var23;
		if (var14 == 1) {
			var23 += var10;
		}
		int var30 = var23 + var20;
		int var32 = var30 + var10 * 2;
		int var34 = var32 + var11 * 6;
		int var36 = var34 + var17;
		int var38 = var36 + var18;
		this.numPoints = var9;
		this.numFaces = var10;
		this.numT = var11;
		this.pointX = new int[var9];
		this.pointY = new int[var9];
		this.pointZ = new int[var9];
		this.faceVertexA = new int[var10];
		this.faceVertexB = new int[var10];
		this.faceVertexC = new int[var10];
		if (var11 > 0) {
			this.textureRenderType = new byte[var11];
			this.faceTextureP = new short[var11];
			this.faceTextureM = new short[var11];
			this.faceTextureN = new short[var11];
		}
		if (var16 == 1) {
			this.vertexLabel = new int[var9];
		}
		if (var12 == 1) {
			this.faceRenderType = new byte[var10];
			this.faceTextureAxis = new byte[var10];
			this.faceTextureId = new short[var10];
		}
		if (var13 == 255) {
			this.facePriority = new byte[var10];
		} else {
			this.priority = (byte) var13;
		}
		if (var14 == 1) {
			this.faceAlpha = new byte[var10];
		}
		if (var15 == 1) {
			this.faceLabel = new int[var10];
		}
		this.faceColour = new short[var10];
		var4.pos = 0;
		var5.pos = var34;
		var6.pos = var36;
		var7.pos = var38;
		var8.pos = var27;
		int var40 = 0;
		int var41 = 0;
		int var42 = 0;
		for (int var43 = 0; var43 < var9; var43++) {
			int var44 = var4.g1();
			int var45 = 0;
			if ((var44 & 0x1) != 0) {
				var45 = var5.method342();
			}
			int var46 = 0;
			if ((var44 & 0x2) != 0) {
				var46 = var6.method342();
			}
			int var47 = 0;
			if ((var44 & 0x4) != 0) {
				var47 = var7.method342();
			}
			this.pointX[var43] = var40 + var45;
			this.pointY[var43] = var41 + var46;
			this.pointZ[var43] = var42 + var47;
			var40 = this.pointX[var43];
			var41 = this.pointY[var43];
			var42 = this.pointZ[var43];
			if (var16 == 1) {
				this.vertexLabel[var43] = var8.g1();
			}
		}
		var4.pos = var30;
		var5.pos = var26;
		var6.pos = var24;
		var7.pos = var28;
		var8.pos = var25;
		for (int var48 = 0; var48 < var10; var48++) {
			this.faceColour[var48] = (short) var4.g2();
			if (var12 == 1) {
				int var49 = var5.g1();
				if ((var49 & 0x1) == 1) {
					this.faceRenderType[var48] = 1;
					var2 = true;
				} else {
					this.faceRenderType[var48] = 0;
				}
				if ((var49 & 0x2) == 2) {
					this.faceTextureAxis[var48] = (byte) (var49 >> 2);
					this.faceTextureId[var48] = this.faceColour[var48];
					this.faceColour[var48] = 127;
					if (this.faceTextureId[var48] != -1) {
						var3 = true;
					}
				} else {
					this.faceTextureAxis[var48] = -1;
					this.faceTextureId[var48] = -1;
				}
			}
			if (var13 == 255) {
				this.facePriority[var48] = var6.g1b();
			}
			if (var14 == 1) {
				this.faceAlpha[var48] = var7.g1b();
			}
			if (var15 == 1) {
				this.faceLabel[var48] = var8.g1();
			}
		}
		var4.pos = var23;
		var5.pos = var21;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;
		int var53 = 0;
		for (int var54 = 0; var54 < var10; var54++) {
			int var55 = var5.g1();
			if (var55 == 1) {
				var50 = var4.method342() + var53;
				var51 = var4.method342() + var50;
				var52 = var4.method342() + var51;
				var53 = var52;
				this.faceVertexA[var54] = var50;
				this.faceVertexB[var54] = var51;
				this.faceVertexC[var54] = var52;
			}
			if (var55 == 2) {
				var51 = var52;
				var52 = var4.method342() + var53;
				var53 = var52;
				this.faceVertexA[var54] = var50;
				this.faceVertexB[var54] = var51;
				this.faceVertexC[var54] = var52;
			}
			if (var55 == 3) {
				var50 = var52;
				var52 = var4.method342() + var53;
				var53 = var52;
				this.faceVertexA[var54] = var50;
				this.faceVertexB[var54] = var51;
				this.faceVertexC[var54] = var52;
			}
			if (var55 == 4) {
				int var56 = var50;
				var50 = var51;
				var51 = var56;
				var52 = var4.method342() + var53;
				var53 = var52;
				this.faceVertexA[var54] = var50;
				this.faceVertexB[var54] = var56;
				this.faceVertexC[var54] = var52;
			}
		}
		var4.pos = var32;
		for (int var57 = 0; var57 < var11; var57++) {
			this.textureRenderType[var57] = 0;
			this.faceTextureP[var57] = (short) var4.g2();
			this.faceTextureM[var57] = (short) var4.g2();
			this.faceTextureN[var57] = (short) var4.g2();
		}
		if (this.faceTextureAxis != null) {
			boolean var58 = false;
			for (int var59 = 0; var59 < var10; var59++) {
				int var60 = this.faceTextureAxis[var59] & 0xFF;
				if (var60 != 255) {
					if ((this.faceTextureP[var60] & 0xFFFF) == this.faceVertexA[var59] && (this.faceTextureM[var60] & 0xFFFF) == this.faceVertexB[var59] && (this.faceTextureN[var60] & 0xFFFF) == this.faceVertexC[var59]) {
						this.faceTextureAxis[var59] = -1;
					} else {
						var58 = true;
					}
				}
			}
			if (!var58) {
				this.faceTextureAxis = null;
			}
		}
		if (!var3) {
			this.faceTextureId = null;
		}
		if (!var2) {
			this.faceRenderType = null;
		}
	}

	@ObfuscatedName("he.m()V")
	public void rotate180() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointX[var1] = -this.pointX[var1];
			this.pointZ[var1] = -this.pointZ[var1];
		}
		this.geometryChanged();
	}

	@ObfuscatedName("he.d(I)V")
	public void method573() {
		int var1 = sinTable[256];
		int var2 = cosTable[256];
		for (int var3 = 0; var3 < this.numPoints; var3++) {
			int var4 = this.pointZ[var3] * var1 + this.pointX[var3] * var2 >> 16;
			this.pointZ[var3] = this.pointZ[var3] * var2 - this.pointX[var3] * var1 >> 16;
			this.pointX[var3] = var4;
		}
		this.geometryChanged();
	}
}
