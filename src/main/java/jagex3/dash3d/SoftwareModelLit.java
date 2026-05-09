package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;

@ObfuscatedName("le")
public final class SoftwareModelLit extends ModelLit {

	@ObfuscatedName("le.ab")
	public static final int[] tmpPriority11FaceDepth = new int[4096];

	@ObfuscatedName("le.bb")
	public static final int[][] tmpPriorityFaces = new int[12][4096];

	@ObfuscatedName("le.cb")
	public static final int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("le.db")
	public static final int[] tmpDepthFaceCount = new int[1600];

	@ObfuscatedName("le.eb")
	public static final int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("le.fb")
	public static final int[] tmpPriorityFaceCount = new int[12];

	@ObfuscatedName("le.gb")
	public static final int[][] tmpDepthFaces = new int[1600][512];

	@ObfuscatedName("le.hb")
	public static final int[] vertexScreenY = new int[4096];

	@ObfuscatedName("le.ib")
	public static final int[] clippedColour = new int[10];

	@ObfuscatedName("le.jb")
	public static final int[] vertexScreenZ = new int[4096];

	@ObfuscatedName("le.kb")
	public static final int[] tmpPriorityDepthSum = new int[12];

	@ObfuscatedName("le.lb")
	public static final int[] clippedY = new int[10];

	@ObfuscatedName("le.mb")
	public static final int[] vertexScreenX = new int[4096];

	@ObfuscatedName("le.nb")
	public static final int[] vertexViewSpaceZ = new int[4096];
	@ObfuscatedName("ce.eb")
	public static final long[] pickedEntityTypecode = new long[1000];
	@ObfuscatedName("oi.c")
	public static int pickedCount = 0;

	@ObfuscatedName("le.o")
	public short minX;

	@ObfuscatedName("le.ob")
	public static final int[] clippedX = new int[10];

	@ObfuscatedName("le.p")
	public boolean boundsCalculated = false;

	@ObfuscatedName("le.pb")
	public static int oX;

	@ObfuscatedName("le.q")
	public int[] faceColourC;

	@ObfuscatedName("le.qb")
	public static final boolean[] faceClippedX = new boolean[4096];

	@ObfuscatedName("le.r")
	public byte[] facePriority;

	@ObfuscatedName("le.rb")
	public static int oZ;

	@ObfuscatedName("le.s")
	public int[] faceTextureM;

	@ObfuscatedName("le.sb")
	public static byte[] tempFTran2 = new byte[1];

	@ObfuscatedName("le.t")
	public short maxZ;

	@ObfuscatedName("le.tb")
	public static int oY;

	@ObfuscatedName("le.u")
	public int numT = 0;

	@ObfuscatedName("le.v")
	public int[] pointX;

	@ObfuscatedName("le.w")
	public byte[] faceTextureAxis;

	@ObfuscatedName("le.J")
	public static final SoftwareModelLit tempModel = new SoftwareModelLit();

	@ObfuscatedName("le.L")
	public static byte[] tempFTran = new byte[1];

	@ObfuscatedName("le.P")
	public static final SoftwareModelLit tempModel2 = new SoftwareModelLit();

	@ObfuscatedName("le.Z")
	public static final boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("le.Y")
	public static final int[] tmpPriority10FaceDepth = new int[4096];

	@ObfuscatedName("le.M")
	public byte priority = 0;

	@ObfuscatedName("le.C")
	public int numPoints = 0;

	@ObfuscatedName("le.X")
	public int numFaces = 0;

	@ObfuscatedName("le.S")
	public int[] pointY;

	@ObfuscatedName("le.T")
	public int[] pointZ;

	@ObfuscatedName("le.E")
	public int[] faceVertexA;

	@ObfuscatedName("le.N")
	public int[] faceVertexB;

	@ObfuscatedName("le.x")
	public int[] faceVertexC;

	@ObfuscatedName("le.F")
	public byte[] faceAlpha;

	@ObfuscatedName("le.V")
	public int[][] labelVertices;

	@ObfuscatedName("le.R")
	public int[][] labelFaces;

	@ObfuscatedName("le.W")
	public int[] faceColourA;

	@ObfuscatedName("le.O")
	public int[] faceColourB;

	@ObfuscatedName("le.D")
	public short[] faceTextureId;

	@ObfuscatedName("le.H")
	public int[] faceTextureP;

	@ObfuscatedName("le.y")
	public int[] faceTextureN;

	@ObfuscatedName("le.z")
	public short maxDepth;

	@ObfuscatedName("le.A")
	public short minZ;

	@ObfuscatedName("le.B")
	public short radius;

	@ObfuscatedName("le.G")
	public short maxX;

	@ObfuscatedName("le.I")
	public short field2277;

	@ObfuscatedName("le.K")
	public short maxY;

	@ObfuscatedName("le.f(I)I")
	public static int getTexLight(int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@ObfuscatedName("le.a(II)I")
	public static int getColour(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	public SoftwareModelLit() {
	}

	public SoftwareModelLit(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		arg0.calculateNormals();
		arg0.prepareAnim();
		this.numPoints = arg0.numPoints;
		this.pointX = arg0.pointX;
		this.pointY = arg0.pointY;
		this.pointZ = arg0.pointZ;
		this.numFaces = arg0.numFaces;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.facePriority = arg0.facePriority;
		this.faceAlpha = arg0.faceAlpha;
		this.priority = arg0.priority;
		this.labelVertices = arg0.labelVertices;
		this.labelFaces = arg0.labelFaces;
		int var7 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		int var8 = arg2 * var7 >> 8;
		this.faceColourA = new int[this.numFaces];
		this.faceColourB = new int[this.numFaces];
		this.faceColourC = new int[this.numFaces];
		if (arg0.faceTextureId == null) {
			this.faceTextureId = null;
		} else {
			this.faceTextureId = new short[this.numFaces];
			for (int var9 = 0; var9 < this.numFaces; var9++) {
				short var10 = arg0.faceTextureId[var9];
				if (var10 != -1 && Pix3D.textureManager.method436(var10)) {
					this.faceTextureId[var9] = var10;
				} else {
					this.faceTextureId[var9] = -1;
				}
			}
		}
		if (arg0.numT > 0 && arg0.faceTextureAxis != null) {
			int[] var11 = new int[arg0.numT];
			for (int var12 = 0; var12 < this.numFaces; var12++) {
				if (arg0.faceTextureAxis[var12] != -1) {
					var11[arg0.faceTextureAxis[var12] & 0xFF]++;
				}
			}
			this.numT = 0;
			for (int var13 = 0; var13 < arg0.numT; var13++) {
				if (var11[var13] > 0 && arg0.textureRenderType[var13] == 0) {
					this.numT++;
				}
			}
			this.faceTextureP = new int[this.numT];
			this.faceTextureM = new int[this.numT];
			this.faceTextureN = new int[this.numT];
			int var14 = 0;
			for (int var15 = 0; var15 < arg0.numT; var15++) {
				if (var11[var15] > 0 && arg0.textureRenderType[var15] == 0) {
					this.faceTextureP[var14] = arg0.faceTextureP[var15] & 0xFFFF;
					this.faceTextureM[var14] = arg0.faceTextureM[var15] & 0xFFFF;
					this.faceTextureN[var14] = arg0.faceTextureN[var15] & 0xFFFF;
					var11[var15] = var14++;
				} else {
					var11[var15] = -1;
				}
			}
			this.faceTextureAxis = new byte[this.numFaces];
			for (int var16 = 0; var16 < this.numFaces; var16++) {
				if (arg0.faceTextureAxis[var16] == -1) {
					this.faceTextureAxis[var16] = -1;
				} else {
					this.faceTextureAxis[var16] = (byte) var11[arg0.faceTextureAxis[var16] & 0xFF];
					if (this.faceTextureAxis[var16] == -1 && this.faceTextureId != null) {
						this.faceTextureId[var16] = -1;
					}
				}
			}
		}
		for (int var17 = 0; var17 < this.numFaces; var17++) {
			byte var18;
			if (arg0.faceRenderType == null) {
				var18 = 0;
			} else {
				var18 = arg0.faceRenderType[var17];
			}
			byte var19;
			if (arg0.faceAlpha == null) {
				var19 = 0;
			} else {
				var19 = arg0.faceAlpha[var17];
			}
			short var20;
			if (this.faceTextureId == null) {
				var20 = -1;
			} else {
				var20 = this.faceTextureId[var17];
			}
			if (var19 == -2) {
				var18 = 3;
			}
			if (var19 == -1) {
				var18 = 2;
			}
			if (var20 == -1) {
				if (var18 == 0) {
					int var21 = arg0.faceColour[var17] & 0xFFFF;
					PointNormal var22;
					if (arg0.sharedPointNormal == null || arg0.sharedPointNormal[this.faceVertexA[var17]] == null) {
						var22 = arg0.pointNormal[this.faceVertexA[var17]];
					} else {
						var22 = arg0.sharedPointNormal[this.faceVertexA[var17]];
					}
					int var23 = arg1 + (arg3 * var22.x + arg4 * var22.y + arg5 * var22.z) / (var8 * var22.w);
					this.faceColourA[var17] = getColour(var21, var23);
					PointNormal var24;
					if (arg0.sharedPointNormal == null || arg0.sharedPointNormal[this.faceVertexB[var17]] == null) {
						var24 = arg0.pointNormal[this.faceVertexB[var17]];
					} else {
						var24 = arg0.sharedPointNormal[this.faceVertexB[var17]];
					}
					int var25 = arg1 + (arg3 * var24.x + arg4 * var24.y + arg5 * var24.z) / (var8 * var24.w);
					this.faceColourB[var17] = getColour(var21, var25);
					PointNormal var26;
					if (arg0.sharedPointNormal == null || arg0.sharedPointNormal[this.faceVertexC[var17]] == null) {
						var26 = arg0.pointNormal[this.faceVertexC[var17]];
					} else {
						var26 = arg0.sharedPointNormal[this.faceVertexC[var17]];
					}
					int var27 = arg1 + (arg3 * var26.x + arg4 * var26.y + arg5 * var26.z) / (var8 * var26.w);
					this.faceColourC[var17] = getColour(var21, var27);
				} else if (var18 == 1) {
					FaceNormal var28 = arg0.faceNormal[var17];
					int var29 = arg1 + (arg3 * var28.x + arg4 * var28.y + arg5 * var28.z) / (var8 + var8 / 2);
					this.faceColourA[var17] = getColour(arg0.faceColour[var17] & 0xFFFF, var29);
					this.faceColourC[var17] = -1;
				} else if (var18 == 3) {
					this.faceColourA[var17] = 128;
					this.faceColourC[var17] = -1;
				} else {
					this.faceColourC[var17] = -2;
				}
			} else if (var18 == 0) {
				PointNormal var30;
				if (arg0.sharedPointNormal == null || arg0.sharedPointNormal[this.faceVertexA[var17]] == null) {
					var30 = arg0.pointNormal[this.faceVertexA[var17]];
				} else {
					var30 = arg0.sharedPointNormal[this.faceVertexA[var17]];
				}
				int var31 = arg1 + (arg3 * var30.x + arg4 * var30.y + arg5 * var30.z) / (var8 * var30.w);
				this.faceColourA[var17] = getTexLight(var31);
				PointNormal var32;
				if (arg0.sharedPointNormal == null || arg0.sharedPointNormal[this.faceVertexB[var17]] == null) {
					var32 = arg0.pointNormal[this.faceVertexB[var17]];
				} else {
					var32 = arg0.sharedPointNormal[this.faceVertexB[var17]];
				}
				int var33 = arg1 + (arg3 * var32.x + arg4 * var32.y + arg5 * var32.z) / (var8 * var32.w);
				this.faceColourB[var17] = getTexLight(var33);
				PointNormal var34;
				if (arg0.sharedPointNormal == null || arg0.sharedPointNormal[this.faceVertexC[var17]] == null) {
					var34 = arg0.pointNormal[this.faceVertexC[var17]];
				} else {
					var34 = arg0.sharedPointNormal[this.faceVertexC[var17]];
				}
				int var35 = arg1 + (arg3 * var34.x + arg4 * var34.y + arg5 * var34.z) / (var8 * var34.w);
				this.faceColourC[var17] = getTexLight(var35);
			} else if (var18 == 1) {
				FaceNormal var36 = arg0.faceNormal[var17];
				int var37 = arg1 + (arg3 * var36.x + arg4 * var36.y + arg5 * var36.z) / (var8 + var8 / 2);
				this.faceColourA[var17] = getTexLight(var37);
				this.faceColourC[var17] = -1;
			} else {
				this.faceColourC[var17] = -2;
			}
		}
	}

	public SoftwareModelLit(SoftwareModelLit[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		this.priority = -1;
		for (int var7 = 0; var7 < 2; var7++) {
			SoftwareModelLit var8 = arg0[var7];
			if (var8 != null) {
				this.numPoints += var8.numPoints;
				this.numFaces += var8.numFaces;
				this.numT += var8.numT;
				if (var8.facePriority == null) {
					if (this.priority == -1) {
						this.priority = var8.priority;
					}
					if (this.priority != var8.priority) {
						var3 = true;
					}
				} else {
					var3 = true;
				}
				var4 |= var8.faceAlpha != null;
				var5 |= var8.faceTextureId != null;
				var6 |= var8.faceTextureAxis != null;
			}
		}
		this.pointX = new int[this.numPoints];
		this.pointY = new int[this.numPoints];
		this.pointZ = new int[this.numPoints];
		this.faceVertexA = new int[this.numFaces];
		this.faceVertexB = new int[this.numFaces];
		this.faceVertexC = new int[this.numFaces];
		this.faceColourA = new int[this.numFaces];
		this.faceColourB = new int[this.numFaces];
		this.faceColourC = new int[this.numFaces];
		if (var3) {
			this.facePriority = new byte[this.numFaces];
		}
		if (var4) {
			this.faceAlpha = new byte[this.numFaces];
		}
		if (var5) {
			this.faceTextureId = new short[this.numFaces];
		}
		if (var6) {
			this.faceTextureAxis = new byte[this.numFaces];
		}
		if (this.numT > 0) {
			this.faceTextureP = new int[this.numT];
			this.faceTextureM = new int[this.numT];
			this.faceTextureN = new int[this.numT];
		}
		this.numPoints = 0;
		this.numFaces = 0;
		this.numT = 0;
		for (int var9 = 0; var9 < 2; var9++) {
			SoftwareModelLit var10 = arg0[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < var10.numFaces; var11++) {
					this.faceVertexA[this.numFaces] = var10.faceVertexA[var11] + this.numPoints;
					this.faceVertexB[this.numFaces] = var10.faceVertexB[var11] + this.numPoints;
					this.faceVertexC[this.numFaces] = var10.faceVertexC[var11] + this.numPoints;
					this.faceColourA[this.numFaces] = var10.faceColourA[var11];
					this.faceColourB[this.numFaces] = var10.faceColourB[var11];
					this.faceColourC[this.numFaces] = var10.faceColourC[var11];
					if (var3) {
						if (var10.facePriority == null) {
							this.facePriority[this.numFaces] = var10.priority;
						} else {
							this.facePriority[this.numFaces] = var10.facePriority[var11];
						}
					}
					if (var4 && var10.faceAlpha != null) {
						this.faceAlpha[this.numFaces] = var10.faceAlpha[var11];
					}
					if (var5) {
						if (var10.faceTextureId == null) {
							this.faceTextureId[this.numFaces] = -1;
						} else {
							this.faceTextureId[this.numFaces] = var10.faceTextureId[var11];
						}
					}
					if (var6) {
						if (var10.faceTextureAxis == null || var10.faceTextureAxis[var11] == -1) {
							this.faceTextureAxis[this.numFaces] = -1;
						} else {
							this.faceTextureAxis[this.numFaces] = (byte) (var10.faceTextureAxis[var11] + this.numT);
						}
					}
					this.numFaces++;
				}
				for (int var12 = 0; var12 < var10.numT; var12++) {
					this.faceTextureP[this.numT] = var10.faceTextureP[var12] + this.numPoints;
					this.faceTextureM[this.numT] = var10.faceTextureM[var12] + this.numPoints;
					this.faceTextureN[this.numT] = var10.faceTextureN[var12] + this.numPoints;
					this.numT++;
				}
				for (int var13 = 0; var13 < var10.numPoints; var13++) {
					this.pointX[this.numPoints] = var10.pointX[var13];
					this.pointY[this.numPoints] = var10.pointY[var13];
					this.pointZ[this.numPoints] = var10.pointZ[var13];
					this.numPoints++;
				}
			}
		}
	}

	@ObfuscatedName("le.h()I")
	@Override
	public int method194() {
		if (!this.boundsCalculated) {
			this.method844();
		}
		return this.minX;
	}

	@ObfuscatedName("le.a(ZZJII)V")
	public void render2(boolean arg0, boolean arg1, long arg2, int arg3, int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (int var7 = 0; var7 < arg4; var7++) {
			tmpDepthFaceCount[var7] = 0;
		}
		for (int var8 = 0; var8 < this.numFaces; var8++) {
			if (this.faceColourC[var8] != -2) {
				int var9 = this.faceVertexA[var8];
				int var10 = this.faceVertexB[var8];
				int var11 = this.faceVertexC[var8];
				int var12 = vertexScreenX[var9];
				int var13 = vertexScreenX[var10];
				int var14 = vertexScreenX[var11];
				if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
					int var15 = vertexViewSpaceX[var9];
					int var16 = vertexViewSpaceX[var10];
					int var17 = vertexViewSpaceX[var11];
					int var18 = vertexViewSpaceY[var9];
					int var19 = vertexViewSpaceY[var10];
					int var20 = vertexViewSpaceY[var11];
					int var21 = vertexViewSpaceZ[var9];
					int var22 = vertexViewSpaceZ[var10];
					int var23 = vertexViewSpaceZ[var11];
					int var24 = var15 - var16;
					int var25 = var17 - var16;
					int var26 = var18 - var19;
					int var27 = var20 - var19;
					int var28 = var21 - var22;
					int var29 = var23 - var22;
					int var30 = var26 * var29 - var28 * var27;
					int var31 = var28 * var25 - var24 * var29;
					int var32 = var24 * var27 - var26 * var25;
					if (var16 * var30 + var19 * var31 + var22 * var32 > 0) {
						faceNearClipped[var8] = true;
						int var33 = (vertexScreenZ[var9] + vertexScreenZ[var10] + vertexScreenZ[var11]) / 3 + arg3;
						tmpDepthFaces[var33][tmpDepthFaceCount[var33]++] = var8;
					}
				} else {
					if (arg1 && this.isMouseRoughlyInsideTriangle(ModelLit.mouseX + Pix3D.originX, ModelLit.mouseY + Pix3D.originY, vertexScreenY[var9], vertexScreenY[var10], vertexScreenY[var11], var12, var13, var14)) {
						pickedEntityTypecode[pickedCount++] = arg2;
						arg1 = false;
					}
					if ((var12 - var13) * (vertexScreenY[var11] - vertexScreenY[var10]) - (vertexScreenY[var9] - vertexScreenY[var10]) * (var14 - var13) > 0) {
						faceNearClipped[var8] = false;
						if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Pix3D.sizeX && var13 <= Pix3D.sizeX && var14 <= Pix3D.sizeX) {
							faceClippedX[var8] = false;
						} else {
							faceClippedX[var8] = true;
						}
						int var34 = (vertexScreenZ[var9] + vertexScreenZ[var10] + vertexScreenZ[var11]) / 3 + arg3;
						tmpDepthFaces[var34][tmpDepthFaceCount[var34]++] = var8;
					}
				}
			}
		}
		if (this.facePriority == null) {
			for (int var35 = arg4 - 1; var35 >= 0; var35--) {
				int var36 = tmpDepthFaceCount[var35];
				if (var36 > 0) {
					int[] var37 = tmpDepthFaces[var35];
					for (int var38 = 0; var38 < var36; var38++) {
						this.render3(var37[var38]);
					}
				}
			}
			return;
		}
		for (int var39 = 0; var39 < 12; var39++) {
			tmpPriorityFaceCount[var39] = 0;
			tmpPriorityDepthSum[var39] = 0;
		}
		for (int var40 = arg4 - 1; var40 >= 0; var40--) {
			int var41 = tmpDepthFaceCount[var40];
			if (var41 > 0) {
				int[] var42 = tmpDepthFaces[var40];
				for (int var43 = 0; var43 < var41; var43++) {
					int var44 = var42[var43];
					byte var45 = this.facePriority[var44];
					int var46 = tmpPriorityFaceCount[var45]++;
					tmpPriorityFaces[var45][var46] = var44;
					if (var45 < 10) {
						tmpPriorityDepthSum[var45] += var40;
					} else if (var45 == 10) {
						tmpPriority10FaceDepth[var46] = var40;
					} else {
						tmpPriority11FaceDepth[var46] = var40;
					}
				}
			}
		}
		int var47 = 0;
		if (tmpPriorityFaceCount[1] > 0 || tmpPriorityFaceCount[2] > 0) {
			var47 = (tmpPriorityDepthSum[1] + tmpPriorityDepthSum[2]) / (tmpPriorityFaceCount[1] + tmpPriorityFaceCount[2]);
		}
		int var48 = 0;
		if (tmpPriorityFaceCount[3] > 0 || tmpPriorityFaceCount[4] > 0) {
			var48 = (tmpPriorityDepthSum[3] + tmpPriorityDepthSum[4]) / (tmpPriorityFaceCount[3] + tmpPriorityFaceCount[4]);
		}
		int var49 = 0;
		if (tmpPriorityFaceCount[6] > 0 || tmpPriorityFaceCount[8] > 0) {
			var49 = (tmpPriorityDepthSum[6] + tmpPriorityDepthSum[8]) / (tmpPriorityFaceCount[6] + tmpPriorityFaceCount[8]);
		}
		int var50 = 0;
		int var51 = tmpPriorityFaceCount[10];
		int[] var52 = tmpPriorityFaces[10];
		int[] var53 = tmpPriority10FaceDepth;
		if (var51 == 0) {
			var50 = 0;
			var51 = tmpPriorityFaceCount[11];
			var52 = tmpPriorityFaces[11];
			var53 = tmpPriority11FaceDepth;
		}
		int var54;
		if (var51 > 0) {
			var54 = var53[0];
		} else {
			var54 = -1000;
		}
		for (int var55 = 0; var55 < 10; var55++) {
			while (var55 == 0 && var54 > var47) {
				this.render3(var52[var50++]);
				if (var50 == var51 && var52 != tmpPriorityFaces[11]) {
					var50 = 0;
					var51 = tmpPriorityFaceCount[11];
					var52 = tmpPriorityFaces[11];
					var53 = tmpPriority11FaceDepth;
				}
				if (var50 < var51) {
					var54 = var53[var50];
				} else {
					var54 = -1000;
				}
			}
			while (var55 == 3 && var54 > var48) {
				this.render3(var52[var50++]);
				if (var50 == var51 && var52 != tmpPriorityFaces[11]) {
					var50 = 0;
					var51 = tmpPriorityFaceCount[11];
					var52 = tmpPriorityFaces[11];
					var53 = tmpPriority11FaceDepth;
				}
				if (var50 < var51) {
					var54 = var53[var50];
				} else {
					var54 = -1000;
				}
			}
			while (var55 == 5 && var54 > var49) {
				this.render3(var52[var50++]);
				if (var50 == var51 && var52 != tmpPriorityFaces[11]) {
					var50 = 0;
					var51 = tmpPriorityFaceCount[11];
					var52 = tmpPriorityFaces[11];
					var53 = tmpPriority11FaceDepth;
				}
				if (var50 < var51) {
					var54 = var53[var50];
				} else {
					var54 = -1000;
				}
			}
			int var56 = tmpPriorityFaceCount[var55];
			int[] var57 = tmpPriorityFaces[var55];
			for (int var58 = 0; var58 < var56; var58++) {
				this.render3(var57[var58]);
			}
		}
		while (var54 != -1000) {
			this.render3(var52[var50++]);
			if (var50 == var51 && var52 != tmpPriorityFaces[11]) {
				var50 = 0;
				var52 = tmpPriorityFaces[11];
				var51 = tmpPriorityFaceCount[11];
				var53 = tmpPriority11FaceDepth;
			}
			if (var50 < var51) {
				var54 = var53[var50];
			} else {
				var54 = -1000;
			}
		}
	}

	@ObfuscatedName("le.a(I[IIII)V")
	public void animate2(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			oX = 0;
			oY = 0;
			oZ = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.labelVertices.length) {
					int[] var10 = this.labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						oX += this.pointX[var12];
						oY += this.pointY[var12];
						oZ += this.pointZ[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				oX = oX / var7 + arg2;
				oY = oY / var7 + arg3;
				oZ = oZ / var7 + arg4;
			} else {
				oX = arg2;
				oY = arg3;
				oZ = arg4;
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
						this.pointX[var22] -= oX;
						this.pointY[var22] -= oY;
						this.pointZ[var22] -= oZ;
						if (arg4 != 0) {
							int var23 = Pix3D.sinTable[arg4];
							int var24 = Pix3D.cosTable[arg4];
							int var25 = this.pointY[var22] * var23 + this.pointX[var22] * var24 + 32767 >> 16;
							this.pointY[var22] = this.pointY[var22] * var24 + 32767 - this.pointX[var22] * var23 >> 16;
							this.pointX[var22] = var25;
						}
						if (arg2 != 0) {
							int var26 = Pix3D.sinTable[arg2];
							int var27 = Pix3D.cosTable[arg2];
							int var28 = this.pointY[var22] * var27 + 32767 - this.pointZ[var22] * var26 >> 16;
							this.pointZ[var22] = this.pointY[var22] * var26 + this.pointZ[var22] * var27 + 32767 >> 16;
							this.pointY[var22] = var28;
						}
						if (arg3 != 0) {
							int var29 = Pix3D.sinTable[arg3];
							int var30 = Pix3D.cosTable[arg3];
							int var31 = this.pointZ[var22] * var29 + this.pointX[var22] * var30 + 32767 >> 16;
							this.pointZ[var22] = this.pointZ[var22] * var30 + 32767 - this.pointX[var22] * var29 >> 16;
							this.pointX[var22] = var31;
						}
						this.pointX[var22] += oX;
						this.pointY[var22] += oY;
						this.pointZ[var22] += oZ;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var32 = 0; var32 < var6; var32++) {
				int var33 = arg1[var32];
				if (var33 < this.labelVertices.length) {
					int[] var34 = this.labelVertices[var33];
					for (int var35 = 0; var35 < var34.length; var35++) {
						int var36 = var34[var35];
						this.pointX[var36] -= oX;
						this.pointY[var36] -= oY;
						this.pointZ[var36] -= oZ;
						this.pointX[var36] = this.pointX[var36] * arg2 / 128;
						this.pointY[var36] = this.pointY[var36] * arg3 / 128;
						this.pointZ[var36] = this.pointZ[var36] * arg4 / 128;
						this.pointX[var36] += oX;
						this.pointY[var36] += oY;
						this.pointZ[var36] += oZ;
					}
				}
			}
		} else if (arg0 == 5 && (this.labelFaces != null && this.faceAlpha != null)) {
			for (int var37 = 0; var37 < var6; var37++) {
				int var38 = arg1[var37];
				if (var38 < this.labelFaces.length) {
					int[] var39 = this.labelFaces[var38];
					for (int var40 = 0; var40 < var39.length; var40++) {
						int var41 = var39[var40];
						int var42 = (this.faceAlpha[var41] & 0xFF) + arg2 * 8;
						if (var42 < 0) {
							var42 = 0;
						} else if (var42 > 255) {
							var42 = 255;
						}
						this.faceAlpha[var41] = (byte) var42;
					}
				}
			}
		}
	}

	@ObfuscatedName("le.b(ZZ)Lcg;")
	@Override
	public ModelLit copyForAnim2(boolean arg0, boolean arg1) {
		if (!arg0 && tempFTran2.length < this.numFaces) {
			tempFTran2 = new byte[this.numFaces + 100];
		}
		return this.copyForAnim(arg0, tempModel2, tempFTran2);
	}

	@ObfuscatedName("le.a(ZZ)Lcg;")
	@Override
	public ModelLit copyForAnim(boolean arg0, boolean arg1) {
		if (!arg0 && tempFTran.length < this.numFaces) {
			tempFTran = new byte[this.numFaces + 100];
		}
		return this.copyForAnim(arg0, tempModel, tempFTran);
	}

	@ObfuscatedName("le.i()I")
	@Override
	public int method196() {
		if (!this.boundsCalculated) {
			this.method844();
		}
		return this.maxX;
	}

	@ObfuscatedName("le.d(III)V")
	@Override
	public void resize(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] = this.pointX[var4] * arg0 / 128;
			this.pointY[var4] = this.pointY[var4] * arg1 / 128;
			this.pointZ[var4] = this.pointZ[var4] * arg2 / 128;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.e(I)V")
	public void render3ZClip(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
		int var4 = 0;
		int var5 = this.faceVertexA[arg0];
		int var6 = this.faceVertexB[arg0];
		int var7 = this.faceVertexC[arg0];
		int var8 = vertexViewSpaceZ[var5];
		int var9 = vertexViewSpaceZ[var6];
		int var10 = vertexViewSpaceZ[var7];
		if (this.faceAlpha == null) {
			Pix3D.trans = 0;
		} else {
			Pix3D.trans = this.faceAlpha[arg0] & 0xFF;
		}
		if (var8 >= 50) {
			clippedX[0] = vertexScreenX[var5];
			clippedY[0] = vertexScreenY[var5];
			var4++;
			clippedColour[0] = this.faceColourA[arg0];
		} else {
			int var11 = vertexViewSpaceX[var5];
			int var12 = vertexViewSpaceY[var5];
			int var13 = this.faceColourA[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * Pix3D.divTable2[var10 - var8];
				clippedX[0] = var2 + (var11 + ((vertexViewSpaceX[var7] - var11) * var14 >> 16) << 9) / 50;
				clippedY[0] = var3 + (var12 + ((vertexViewSpaceY[var7] - var12) * var14 >> 16) << 9) / 50;
				var4++;
				clippedColour[0] = var13 + ((this.faceColourC[arg0] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * Pix3D.divTable2[var9 - var8];
				clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var6] - var11) * var15 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var6] - var12) * var15 >> 16) << 9) / 50;
				clippedColour[var4++] = var13 + ((this.faceColourB[arg0] - var13) * var15 >> 16);
			}
		}
		if (var9 >= 50) {
			clippedX[var4] = vertexScreenX[var6];
			clippedY[var4] = vertexScreenY[var6];
			clippedColour[var4++] = this.faceColourB[arg0];
		} else {
			int var16 = vertexViewSpaceX[var6];
			int var17 = vertexViewSpaceY[var6];
			int var18 = this.faceColourB[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * Pix3D.divTable2[var8 - var9];
				clippedX[var4] = var2 + (var16 + ((vertexViewSpaceX[var5] - var16) * var19 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var17 + ((vertexViewSpaceY[var5] - var17) * var19 >> 16) << 9) / 50;
				clippedColour[var4++] = var18 + ((this.faceColourA[arg0] - var18) * var19 >> 16);
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * Pix3D.divTable2[var10 - var9];
				clippedX[var4] = var2 + (var16 + ((vertexViewSpaceX[var7] - var16) * var20 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var17 + ((vertexViewSpaceY[var7] - var17) * var20 >> 16) << 9) / 50;
				clippedColour[var4++] = var18 + ((this.faceColourC[arg0] - var18) * var20 >> 16);
			}
		}
		if (var10 >= 50) {
			clippedX[var4] = vertexScreenX[var7];
			clippedY[var4] = vertexScreenY[var7];
			clippedColour[var4++] = this.faceColourC[arg0];
		} else {
			int var21 = vertexViewSpaceX[var7];
			int var22 = vertexViewSpaceY[var7];
			int var23 = this.faceColourC[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * Pix3D.divTable2[var9 - var10];
				clippedX[var4] = var2 + (var21 + ((vertexViewSpaceX[var6] - var21) * var24 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var22 + ((vertexViewSpaceY[var6] - var22) * var24 >> 16) << 9) / 50;
				clippedColour[var4++] = var23 + ((this.faceColourB[arg0] - var23) * var24 >> 16);
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * Pix3D.divTable2[var8 - var10];
				clippedX[var4] = var2 + (var21 + ((vertexViewSpaceX[var5] - var21) * var25 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var22 + ((vertexViewSpaceY[var5] - var22) * var25 >> 16) << 9) / 50;
				clippedColour[var4++] = var23 + ((this.faceColourA[arg0] - var23) * var25 >> 16);
			}
		}
		int var26 = clippedX[0];
		int var27 = clippedX[1];
		int var28 = clippedX[2];
		int var29 = clippedY[0];
		int var30 = clippedY[1];
		int var31 = clippedY[2];
		Pix3D.hclip = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.sizeX || var27 > Pix3D.sizeX || var28 > Pix3D.sizeX) {
				Pix3D.hclip = true;
			}
			if (this.faceTextureId != null && this.faceTextureId[arg0] != -1) {
				int var33;
				int var34;
				int var35;
				if (this.faceTextureAxis == null || this.faceTextureAxis[arg0] == -1) {
					var33 = var5;
					var34 = var6;
					var35 = var7;
				} else {
					int var32 = this.faceTextureAxis[arg0] & 0xFF;
					var33 = this.faceTextureP[var32];
					var34 = this.faceTextureM[var32];
					var35 = this.faceTextureN[var32];
				}
				if (this.faceColourC[arg0] == -1) {
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var33], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceY[var33], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceZ[var33], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], this.faceTextureId[arg0]);
				} else {
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var33], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceY[var33], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceZ[var33], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], this.faceTextureId[arg0]);
				}
			} else if (this.faceColourC[arg0] == -1) {
				Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, Pix3D.colourTable[this.faceColourA[arg0]]);
			} else {
				Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.sizeX || var27 > Pix3D.sizeX || var28 > Pix3D.sizeX || clippedX[3] < 0 || clippedX[3] > Pix3D.sizeX) {
			Pix3D.hclip = true;
		}
		if (this.faceTextureId == null || this.faceTextureId[arg0] == -1) {
			if (this.faceColourC[arg0] == -1) {
				int var36 = Pix3D.colourTable[this.faceColourA[arg0]];
				Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var36);
				Pix3D.flatTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], var36);
				return;
			}
			Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
			Pix3D.gouraudTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
			return;
		}
		int var38;
		int var39;
		int var40;
		if (this.faceTextureAxis == null || this.faceTextureAxis[arg0] == -1) {
			var38 = var5;
			var39 = var6;
			var40 = var7;
		} else {
			int var37 = this.faceTextureAxis[arg0] & 0xFF;
			var38 = this.faceTextureP[var37];
			var39 = this.faceTextureM[var37];
			var40 = this.faceTextureN[var37];
		}
		short var41 = this.faceTextureId[arg0];
		if (this.faceColourC[arg0] == -1) {
			Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
			Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
			return;
		}
		Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
		Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
	}

	@ObfuscatedName("le.j()I")
	@Override
	public int method198() {
		if (!this.boundsCalculated) {
			this.method844();
		}
		return this.maxZ;
	}

	@ObfuscatedName("le.f()V")
	@Override
	public void rotate180() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			this.pointX[var1] = -this.pointX[var1];
			this.pointZ[var1] = -this.pointZ[var1];
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.a(Lli;IZ)V")
	@Override
	public void animate(AnimFrameSet arg0, int arg1, boolean arg2) {
		if (this.labelVertices == null || arg1 == -1) {
			return;
		}
		AnimFrame var4 = arg0.list[arg1];
		AnimBase var5 = var4.base;
		oX = 0;
		oY = 0;
		oZ = 0;
		for (int var6 = 0; var6 < var4.size; var6++) {
			short var7 = var4.ti[var6];
			if (var4.field3774[var6] != -1) {
				this.animate2(0, var5.labels[var4.field3774[var6]], 0, 0, 0);
			}
			this.animate2(var5.type[var7], var5.labels[var7], var4.tx[var6], var4.ty[var6], var4.tz[var6]);
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.a(Lli;ILli;I[IZ)V")
	@Override
	public void maskAnimate(AnimFrameSet arg0, int arg1, AnimFrameSet arg2, int arg3, int[] arg4, boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.animate(arg0, arg1, arg5);
			return;
		}
		AnimFrame var7 = arg0.list[arg1];
		AnimFrame var8 = arg2.list[arg3];
		AnimBase var9 = var7.base;
		oX = 0;
		oY = 0;
		oZ = 0;
		byte var10 = 0;
		int var18 = var10 + 1;
		int var11 = arg4[0];
		for (int var12 = 0; var12 < var7.size; var12++) {
			short var13 = var7.ti[var12];
			while (var13 > var11) {
				var11 = arg4[var18++];
			}
			if (var13 != var11 || var9.type[var13] == 0) {
				if (var7.field3774[var12] != -1) {
					this.animate2(0, var9.labels[var7.field3774[var12]], 0, 0, 0);
				}
				this.animate2(var9.type[var13], var9.labels[var13], var7.tx[var12], var7.ty[var12], var7.tz[var12]);
			}
		}
		oX = 0;
		oY = 0;
		oZ = 0;
		byte var14 = 0;
		int var19 = var14 + 1;
		int var15 = arg4[0];
		for (int var16 = 0; var16 < var8.size; var16++) {
			short var17 = var8.ti[var16];
			while (var17 > var15) {
				var15 = arg4[var19++];
			}
			if (var17 == var15 || var9.type[var17] == 0) {
				if (var8.field3774[var16] != -1) {
					this.animate2(0, var9.labels[var8.field3774[var16]], 0, 0, 0);
				}
				this.animate2(var9.type[var17], var9.labels[var17], var8.tx[var16], var8.ty[var16], var8.tz[var16]);
			}
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.k()V")
	public void method844() {
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		int var7 = 0;
		int var8 = 0;
		for (int var9 = 0; var9 < this.numPoints; var9++) {
			int var10 = this.pointX[var9];
			int var11 = this.pointY[var9];
			int var12 = this.pointZ[var9];
			if (var10 < var1) {
				var1 = var10;
			}
			if (var10 > var4) {
				var4 = var10;
			}
			if (var11 < var2) {
				var2 = var11;
			}
			if (var11 > var5) {
				var5 = var11;
			}
			if (var12 < var3) {
				var3 = var12;
			}
			if (var12 > var6) {
				var6 = var12;
			}
			int var13 = var10 * var10 + var12 * var12;
			if (var13 > var7) {
				var7 = var13;
			}
			int var14 = var10 * var10 + var12 * var12 + var11 * var11;
			if (var14 > var8) {
				var8 = var14;
			}
		}
		this.minX = (short) var1;
		this.maxX = (short) var4;
		this.field2277 = (short) var2;
		this.maxY = (short) var5;
		this.minZ = (short) var3;
		this.maxZ = (short) var6;
		this.radius = (short) (Math.sqrt((double) var7) + 0.99D);
		this.maxDepth = (short) (Math.sqrt((double) var8) + 0.99D);
		this.boundsCalculated = true;
	}

	@ObfuscatedName("le.b()I")
	@Override
	public int method88() {
		if (!this.boundsCalculated) {
			this.method844();
		}
		return this.field2277;
	}

	@ObfuscatedName("le.d(I)V")
	@Override
	public void rotateXAxis(int arg0) {
		int var2 = Pix3D.sinTable[arg0];
		int var3 = Pix3D.cosTable[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointY[var4] * var3 - this.pointZ[var4] * var2 >> 16;
			this.pointZ[var4] = this.pointY[var4] * var2 + this.pointZ[var4] * var3 >> 16;
			this.pointY[var4] = var5;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.c(I)V")
	@Override
	public void method191(int arg0) {
		int var2 = Pix3D.sinTable[arg0];
		int var3 = Pix3D.cosTable[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointY[var4] * var2 + this.pointX[var4] * var3 >> 16;
			this.pointY[var4] = this.pointY[var4] * var3 - this.pointX[var4] * var2 >> 16;
			this.pointX[var4] = var5;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.a(ZLle;[B)Lcg;")
	public ModelLit copyForAnim(boolean arg0, SoftwareModelLit arg1, byte[] arg2) {
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
		arg1.faceVertexA = this.faceVertexA;
		arg1.faceVertexB = this.faceVertexB;
		arg1.faceVertexC = this.faceVertexC;
		arg1.faceColourA = this.faceColourA;
		arg1.faceColourB = this.faceColourB;
		arg1.faceColourC = this.faceColourC;
		arg1.facePriority = this.facePriority;
		arg1.faceTextureAxis = this.faceTextureAxis;
		arg1.faceTextureId = this.faceTextureId;
		arg1.priority = this.priority;
		arg1.faceTextureP = this.faceTextureP;
		arg1.faceTextureM = this.faceTextureM;
		arg1.faceTextureN = this.faceTextureN;
		arg1.labelVertices = this.labelVertices;
		arg1.labelFaces = this.labelFaces;
		arg1.useAABBMouseCheck = super.useAABBMouseCheck;
		arg1.boundsCalculated = false;
		return arg1;
	}

	@ObfuscatedName("le.a(II[[I[[IIIIZ)Lle;")
	public SoftwareModelLit hillSkew(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (!this.boundsCalculated) {
			this.method844();
		}
		int var9 = arg4 + this.minX;
		int var10 = arg4 + this.maxX;
		int var11 = arg6 + this.minZ;
		int var12 = arg6 + this.maxZ;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var9 < 0 || var10 + 128 >> 7 >= arg2.length || var11 < 0 || var12 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			int var13 = var9 >> 7;
			int var14 = var10 + 127 >> 7;
			int var15 = var11 >> 7;
			int var16 = var12 + 127 >> 7;
			if (arg2[var13][var15] == arg5 && arg2[var14][var15] == arg5 && arg2[var13][var16] == arg5 && arg2[var14][var16] == arg5) {
				return this;
			}
		}
		SoftwareModelLit var17;
		if (arg7) {
			var17 = new SoftwareModelLit();
			var17.numPoints = this.numPoints;
			var17.numFaces = this.numFaces;
			var17.numT = this.numT;
			var17.faceVertexA = this.faceVertexA;
			var17.faceVertexB = this.faceVertexB;
			var17.faceVertexC = this.faceVertexC;
			var17.faceColourA = this.faceColourA;
			var17.faceColourB = this.faceColourB;
			var17.faceColourC = this.faceColourC;
			var17.facePriority = this.facePriority;
			var17.faceAlpha = this.faceAlpha;
			var17.faceTextureAxis = this.faceTextureAxis;
			var17.faceTextureId = this.faceTextureId;
			var17.priority = this.priority;
			var17.faceTextureP = this.faceTextureP;
			var17.faceTextureM = this.faceTextureM;
			var17.faceTextureN = this.faceTextureN;
			var17.labelVertices = this.labelVertices;
			var17.labelFaces = this.labelFaces;
			var17.useAABBMouseCheck = super.useAABBMouseCheck;
			if (arg0 == 3) {
				var17.pointX = ArrayUtil.method169(this.pointX);
				var17.pointY = ArrayUtil.method169(this.pointY);
				var17.pointZ = ArrayUtil.method169(this.pointZ);
			} else {
				var17.pointX = this.pointX;
				var17.pointY = new int[var17.numPoints];
				var17.pointZ = this.pointZ;
			}
		} else {
			var17 = this;
		}
		if (arg0 == 1) {
			for (int var18 = 0; var18 < var17.numPoints; var18++) {
				int var19 = this.pointX[var18] + arg4;
				int var20 = this.pointZ[var18] + arg6;
				int var21 = var19 & 0x7F;
				int var22 = var20 & 0x7F;
				int var23 = var19 >> 7;
				int var24 = var20 >> 7;
				int var25 = arg2[var23][var24] * (128 - var21) + arg2[var23 + 1][var24] * var21 >> 7;
				int var26 = arg2[var23][var24 + 1] * (128 - var21) + arg2[var23 + 1][var24 + 1] * var21 >> 7;
				int var27 = var25 * (128 - var22) + var26 * var22 >> 7;
				var17.pointY[var18] = this.pointY[var18] + var27 - arg5;
			}
		} else if (arg0 == 2) {
			for (int var28 = 0; var28 < var17.numPoints; var28++) {
				int var29 = (this.pointY[var28] << 16) / this.field2277;
				if (var29 < arg1) {
					int var30 = this.pointX[var28] + arg4;
					int var31 = this.pointZ[var28] + arg6;
					int var32 = var30 & 0x7F;
					int var33 = var31 & 0x7F;
					int var34 = var30 >> 7;
					int var35 = var31 >> 7;
					int var36 = arg2[var34][var35] * (128 - var32) + arg2[var34 + 1][var35] * var32 >> 7;
					int var37 = arg2[var34][var35 + 1] * (128 - var32) + arg2[var34 + 1][var35 + 1] * var32 >> 7;
					int var38 = var36 * (128 - var33) + var37 * var33 >> 7;
					var17.pointY[var28] = this.pointY[var28] + (var38 - arg5) * (arg1 - var29) / arg1;
				} else {
					var17.pointY[var28] = this.pointY[var28];
				}
			}
		} else if (arg0 == 3) {
			int var39 = (arg1 & 0xFF) * 4;
			int var40 = (arg1 >> 8 & 0xFF) * 4;
			var17.method199(arg2, arg4, arg5, arg6, var39, var40);
		} else if (arg0 == 4) {
			int var41 = this.maxY - this.field2277;
			for (int var42 = 0; var42 < this.numPoints; var42++) {
				int var43 = this.pointX[var42] + arg4;
				int var44 = this.pointZ[var42] + arg6;
				int var45 = var43 & 0x7F;
				int var46 = var44 & 0x7F;
				int var47 = var43 >> 7;
				int var48 = var44 >> 7;
				int var49 = arg3[var47][var48] * (128 - var45) + arg3[var47 + 1][var48] * var45 >> 7;
				int var50 = arg3[var47][var48 + 1] * (128 - var45) + arg3[var47 + 1][var48 + 1] * var45 >> 7;
				int var51 = var49 * (128 - var46) + var50 * var46 >> 7;
				var17.pointY[var42] = this.pointY[var42] + var51 + var41 - arg5;
			}
		} else if (arg0 == 5) {
			int var52 = this.maxY - this.field2277;
			for (int var53 = 0; var53 < this.numPoints; var53++) {
				int var54 = this.pointX[var53] + arg4;
				int var55 = this.pointZ[var53] + arg6;
				int var56 = var54 & 0x7F;
				int var57 = var55 & 0x7F;
				int var58 = var54 >> 7;
				int var59 = var55 >> 7;
				int var60 = arg2[var58][var59] * (128 - var56) + arg2[var58 + 1][var59] * var56 >> 7;
				int var61 = arg2[var58][var59 + 1] * (128 - var56) + arg2[var58 + 1][var59 + 1] * var56 >> 7;
				int var62 = var60 * (128 - var57) + var61 * var57 >> 7;
				int var63 = arg3[var58][var59] * (128 - var56) + arg3[var58 + 1][var59] * var56 >> 7;
				int var64 = arg3[var58][var59 + 1] * (128 - var56) + arg3[var58 + 1][var59 + 1] * var56 >> 7;
				int var65 = var63 * (128 - var57) + var64 * var57 >> 7;
				int var66 = var62 - var65;
				var17.pointY[var53] = ((this.pointY[var53] << 8) / var52 * var66 >> 8) - (arg5 - var62);
			}
		}
		var17.boundsCalculated = false;
		return var17;
	}

	@ObfuscatedName("le.e()I")
	@Override
	public int method186() {
		if (!this.boundsCalculated) {
			this.method844();
		}
		return this.minZ;
	}

	@ObfuscatedName("le.a(IIIIIIII)Z")
	public boolean isMouseRoughlyInsideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("le.b(IIIIIIII)V")
	public void objRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (!this.boundsCalculated) {
				this.method844();
			}
			int var8 = Pix3D.originX;
			int var9 = Pix3D.originY;
			int var10 = Pix3D.sinTable[0];
			int var11 = Pix3D.cosTable[0];
			int var12 = Pix3D.sinTable[arg0];
			int var13 = Pix3D.cosTable[arg0];
			int var14 = Pix3D.sinTable[arg1];
			int var15 = Pix3D.cosTable[arg1];
			int var16 = Pix3D.sinTable[arg2];
			int var17 = Pix3D.cosTable[arg2];
			int var18 = arg4 * var16 + arg5 * var17 >> 16;
			for (int var19 = 0; var19 < this.numPoints; var19++) {
				int var20 = this.pointX[var19];
				int var21 = this.pointY[var19];
				int var22 = this.pointZ[var19];
				if (arg1 != 0) {
					int var23 = var21 * var14 + var20 * var15 >> 16;
					var21 = var21 * var15 - var20 * var14 >> 16;
					var20 = var23;
				}
				if (arg0 != 0) {
					int var24 = var22 * var12 + var20 * var13 >> 16;
					var22 = var22 * var13 - var20 * var12 >> 16;
					var20 = var24;
				}
				int var25 = var20 + arg3;
				int var26 = var21 + arg4;
				int var27 = var22 + arg5;
				int var28 = var26 * var17 - var27 * var16 >> 16;
				int var29 = var26 * var16 + var27 * var17 >> 16;
				vertexScreenZ[var19] = var29 - var18;
				vertexScreenX[var19] = var8 + (var25 << 9) / arg6;
				vertexScreenY[var19] = var9 + (var28 << 9) / arg6;
				if (this.numT > 0) {
					vertexViewSpaceX[var19] = var25;
					vertexViewSpaceY[var19] = var28;
					vertexViewSpaceZ[var19] = var29;
				}
			}
			this.render2(false, false, 0L, this.maxDepth, this.maxDepth << 1);
		} catch (RuntimeException var30) {
		}
	}

	@ObfuscatedName("le.c()V")
	@Override
	public void rotate270() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointZ[var1];
			this.pointZ[var1] = this.pointX[var1];
			this.pointX[var1] = -var2;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.c(III)V")
	@Override
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			this.pointX[var4] += arg0;
			this.pointY[var4] += arg1;
			this.pointZ[var4] += arg2;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.b(I)V")
	@Override
	public void method188(int arg0) {
		int var2 = Pix3D.sinTable[arg0];
		int var3 = Pix3D.cosTable[arg0];
		for (int var4 = 0; var4 < this.numPoints; var4++) {
			int var5 = this.pointZ[var4] * var2 + this.pointX[var4] * var3 >> 16;
			this.pointZ[var4] = this.pointZ[var4] * var3 - this.pointX[var4] * var2 >> 16;
			this.pointX[var4] = var5;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.d()V")
	@Override
	public void rotate90() {
		for (int var1 = 0; var1 < this.numPoints; var1++) {
			int var2 = this.pointX[var1];
			this.pointX[var1] = this.pointZ[var1];
			this.pointZ[var1] = -var2;
		}
		this.boundsCalculated = false;
	}

	@ObfuscatedName("le.a(IIIIIII)V")
	@Override
	public void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (!this.boundsCalculated) {
				this.method844();
			}
			int var7 = Pix3D.originX;
			int var8 = Pix3D.originY;
			int var9 = Pix3D.sinTable[0];
			int var10 = Pix3D.cosTable[0];
			int var11 = Pix3D.sinTable[arg0];
			int var12 = Pix3D.cosTable[arg0];
			int var13 = Pix3D.sinTable[arg1];
			int var14 = Pix3D.cosTable[arg1];
			int var15 = Pix3D.sinTable[arg2];
			int var16 = Pix3D.cosTable[arg2];
			int var17 = arg4 * var15 + arg5 * var16 >> 16;
			for (int var18 = 0; var18 < this.numPoints; var18++) {
				int var19 = this.pointX[var18];
				int var20 = this.pointY[var18];
				int var21 = this.pointZ[var18];
				if (arg1 != 0) {
					int var22 = var20 * var13 + var19 * var14 >> 16;
					var20 = var20 * var14 - var19 * var13 >> 16;
					var19 = var22;
				}
				if (arg0 != 0) {
					int var23 = var21 * var11 + var19 * var12 >> 16;
					var21 = var21 * var12 - var19 * var11 >> 16;
					var19 = var23;
				}
				int var24 = var19 + arg3;
				int var25 = var20 + arg4;
				int var26 = var21 + arg5;
				int var27 = var25 * var16 - var26 * var15 >> 16;
				int var28 = var25 * var15 + var26 * var16 >> 16;
				vertexScreenZ[var18] = var28 - var17;
				vertexScreenX[var18] = var7 + (var24 << 9) / var28;
				vertexScreenY[var18] = var8 + (var27 << 9) / var28;
				if (this.numT > 0) {
					vertexViewSpaceX[var18] = var24;
					vertexViewSpaceY[var18] = var27;
					vertexViewSpaceZ[var18] = var28;
				}
			}
			this.render2(false, false, 0L, this.maxDepth, this.maxDepth << 1);
		} catch (RuntimeException var29) {
		}
	}

	@ObfuscatedName("le.g()I")
	@Override
	public int getRadiusCylinder() {
		if (!this.boundsCalculated) {
			this.method844();
		}
		return this.radius;
	}

	@ObfuscatedName("le.a(Lcg;)Lcg;")
	public ModelLit method850(ModelLit arg0) {
		return new SoftwareModelLit(new SoftwareModelLit[] { this, (SoftwareModelLit) arg0 }, 2);
	}

	@ObfuscatedName("le.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		if (!this.boundsCalculated) {
			this.method844();
		}
		int var11 = arg7 * arg4 - arg5 * arg3 >> 16;
		int var12 = arg6 * arg1 + var11 * arg2 >> 16;
		int var13 = var12 + (this.radius * arg2 + this.maxY * arg1 >> 16);
		if (var13 <= 50) {
			return;
		}
		int var14 = var12 + (-this.radius * arg2 + this.field2277 * arg1 >> 16);
		if (var14 >= 3500) {
			return;
		}
		int var15 = arg7 * arg3 + arg5 * arg4 >> 16;
		int var16 = var15 + this.radius << 9;
		if (var16 / var13 <= Pix3D.minX) {
			return;
		}
		int var17 = var15 - this.radius << 9;
		if (var17 / var13 >= Pix3D.maxX) {
			return;
		}
		int var18 = arg6 * arg2 - var11 * arg1 >> 16;
		int var19 = var18 + (this.radius * arg1 + this.maxY * arg2 >> 16) << 9;
		if (var19 / var13 <= Pix3D.minY) {
			return;
		}
		int var20 = var18 + (-this.radius * arg1 + this.field2277 * arg2 >> 16) << 9;
		if (var20 / var13 >= Pix3D.maxY) {
			return;
		}
		boolean var21 = false;
		boolean var22 = var14 <= 50;
		boolean var23 = var22 || this.numT > 0;
		int var24 = Pix3D.originX;
		int var25 = Pix3D.originY;
		int var26 = 0;
		int var27 = 0;
		if (arg0 != 0) {
			var26 = Pix3D.sinTable[arg0];
			var27 = Pix3D.cosTable[arg0];
		}
		boolean var28 = false;
		if (arg8 > 0L && ModelLit.mouseCheck && var14 > 0) {
			int var29;
			int var30;
			if (var15 > 0) {
				var29 = var17 / var13;
				var30 = var16 / var14;
			} else {
				var29 = var17 / var14;
				var30 = var16 / var13;
			}
			int var31;
			int var32;
			if (var18 > 0) {
				var31 = var20 / var13;
				var32 = var19 / var14;
			} else {
				var31 = var20 / var14;
				var32 = var19 / var13;
			}
			if (ModelLit.mouseX >= var29 && ModelLit.mouseX <= var30 && ModelLit.mouseY >= var31 && ModelLit.mouseY <= var32) {
				int var33 = 999999;
				int var34 = -999999;
				int var35 = 999999;
				int var36 = -999999;
				int[] var37 = new int[] { this.minX, this.maxX, this.minX, this.maxX, this.minX, this.maxX, this.minX, this.maxX };
				int[] var38 = new int[] { this.minZ, this.minZ, this.maxZ, this.maxZ, this.minZ, this.minZ, this.maxZ, this.maxZ };
				int[] var39 = new int[] { this.field2277, this.field2277, this.field2277, this.field2277, this.maxY, this.maxY, this.maxY, this.maxY };
				for (int var40 = 0; var40 < 8; var40++) {
					int var41 = var37[var40];
					int var42 = var39[var40];
					int var43 = var38[var40];
					if (arg0 != 0) {
						int var44 = var43 * var26 + var41 * var27 >> 16;
						var43 = var43 * var27 - var41 * var26 >> 16;
						var41 = var44;
					}
					int var45 = var41 + arg5;
					int var46 = var42 + arg6;
					int var47 = var43 + arg7;
					int var48 = var47 * arg3 + var45 * arg4 >> 16;
					int var49 = var47 * arg4 - var45 * arg3 >> 16;
					int var51 = var46 * arg2 - var49 * arg1 >> 16;
					int var52 = var46 * arg1 + var49 * arg2 >> 16;
					if (var52 > 0) {
						int var53 = (var48 << 9) / var52;
						int var54 = (var51 << 9) / var52;
						if (var53 < var33) {
							var33 = var53;
						}
						if (var53 > var34) {
							var34 = var53;
						}
						if (var54 < var35) {
							var35 = var54;
						}
						if (var54 > var36) {
							var36 = var54;
						}
					}
				}
				if (ModelLit.mouseX >= var33 && ModelLit.mouseX <= var34 && ModelLit.mouseY >= var35 && ModelLit.mouseY <= var36) {
					if (super.useAABBMouseCheck) {
						pickedEntityTypecode[pickedCount++] = arg8;
					} else {
						var28 = true;
					}
				}
			}
		}
		for (int var55 = 0; var55 < this.numPoints; var55++) {
			int var56 = this.pointX[var55];
			int var57 = this.pointY[var55];
			int var58 = this.pointZ[var55];
			if (arg0 != 0) {
				int var59 = var58 * var26 + var56 * var27 >> 16;
				var58 = var58 * var27 - var56 * var26 >> 16;
				var56 = var59;
			}
			int var60 = var56 + arg5;
			int var61 = var57 + arg6;
			int var62 = var58 + arg7;
			int var63 = var62 * arg3 + var60 * arg4 >> 16;
			int var64 = var62 * arg4 - var60 * arg3 >> 16;
			int var66 = var61 * arg2 - var64 * arg1 >> 16;
			int var67 = var61 * arg1 + var64 * arg2 >> 16;
			vertexScreenZ[var55] = var67 - var12;
			if (var67 >= 50) {
				vertexScreenX[var55] = var24 + (var63 << 9) / var67;
				vertexScreenY[var55] = var25 + (var66 << 9) / var67;
			} else {
				vertexScreenX[var55] = -5000;
				var21 = true;
			}
			if (var23) {
				vertexViewSpaceX[var55] = var63;
				vertexViewSpaceY[var55] = var66;
				vertexViewSpaceZ[var55] = var67;
			}
		}
		try {
			this.render2(var21, var28, arg8, var12 - var14, var13 - var14 + 2);
		} catch (Exception var68) {
		}
	}

	@ObfuscatedName("le.g(I)V")
	public void render3(int arg0) {
		if (faceNearClipped[arg0]) {
			this.render3ZClip(arg0);
			return;
		}
		int var2 = this.faceVertexA[arg0];
		int var3 = this.faceVertexB[arg0];
		int var4 = this.faceVertexC[arg0];
		Pix3D.hclip = faceClippedX[arg0];
		if (this.faceAlpha == null) {
			Pix3D.trans = 0;
		} else {
			Pix3D.trans = this.faceAlpha[arg0] & 0xFF;
		}
		if (this.faceTextureId != null && this.faceTextureId[arg0] != -1) {
			int var6;
			int var7;
			int var8;
			if (this.faceTextureAxis == null || this.faceTextureAxis[arg0] == -1) {
				var6 = var2;
				var7 = var3;
				var8 = var4;
			} else {
				int var5 = this.faceTextureAxis[arg0] & 0xFF;
				var6 = this.faceTextureP[var5];
				var7 = this.faceTextureM[var5];
				var8 = this.faceTextureN[var5];
			}
			if (this.faceColourC[arg0] == -1) {
				Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var6], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceY[var6], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceZ[var6], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], this.faceTextureId[arg0]);
			} else {
				Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourB[arg0], this.faceColourC[arg0], vertexViewSpaceX[var6], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceY[var6], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceZ[var6], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], this.faceTextureId[arg0]);
			}
		} else if (this.faceColourC[arg0] == -1) {
			Pix3D.flatTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], Pix3D.colourTable[this.faceColourA[arg0]]);
		} else {
			Pix3D.gouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourB[arg0], this.faceColourC[arg0]);
		}
	}
}
