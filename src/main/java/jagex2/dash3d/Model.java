package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.graphics.Pix2D;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("eb")
public final class Model extends ModelSource {

	@ObfuscatedName("eb.m")
	public final int field524 = 6;

	@ObfuscatedName("eb.n")
	public static int field525 = 101;

	@ObfuscatedName("eb.o")
	public final byte field526 = 4;

	@ObfuscatedName("eb.p")
	public final byte field527 = 91;

	@ObfuscatedName("eb.q")
	public final int field528 = 188;

	@ObfuscatedName("eb.r")
	public static final boolean field529 = true;

	@ObfuscatedName("eb.s")
	public static int loaded;

	@ObfuscatedName("eb.t")
	public static final Model tempModel = new Model((byte) 91);

	@ObfuscatedName("eb.u")
	public static int[] tmpVertexX = new int[2000];

	@ObfuscatedName("eb.v")
	public static int[] tmpVertexY = new int[2000];

	@ObfuscatedName("eb.w")
	public static int[] tmpVertexZ = new int[2000];

	@ObfuscatedName("eb.x")
	public static int[] tempFTran = new int[2000];

	@ObfuscatedName("eb.y")
	public int numPoints;

	@ObfuscatedName("eb.z")
	public int[] pointX;

	@ObfuscatedName("eb.ab")
	public int objRaise;

	@ObfuscatedName("eb.bb")
	public int[] vertexLabel;

	@ObfuscatedName("eb.cb")
	public int[] faceLabel;

	@ObfuscatedName("eb.db")
	public int[][] labelVertices;

	@ObfuscatedName("eb.eb")
	public int[][] labelFaces;

	@ObfuscatedName("eb.fb")
	public boolean useAABBMouseCheck = false;

	@ObfuscatedName("eb.gb")
	public PointNormal[] sharedPointNormal;

	@ObfuscatedName("eb.hb")
	public static Metadata[] meta;

	@ObfuscatedName("eb.ib")
	public static OnDemandProvider provider;

	@ObfuscatedName("eb.jb")
	public static boolean[] faceClippedX = new boolean[4096];

	@ObfuscatedName("eb.kb")
	public static boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("eb.lb")
	public static int[] vertexScreenX = new int[4096];

	@ObfuscatedName("eb.mb")
	public static int[] vertexScreenY = new int[4096];

	@ObfuscatedName("eb.nb")
	public static int[] vertexScreenZ = new int[4096];

	@ObfuscatedName("eb.ob")
	public static int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("eb.pb")
	public static int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("eb.qb")
	public static int[] vertexViewSpaceZ = new int[4096];

	@ObfuscatedName("eb.rb")
	public static int[] tmpDepthFaceCount = new int[1500];

	@ObfuscatedName("eb.sb")
	public static int[][] tmpDepthFaces = new int[1500][512];

	@ObfuscatedName("eb.tb")
	public static int[] tmpPriorityFaceCount = new int[12];

	@ObfuscatedName("eb.ub")
	public static int[][] tmpPriorityFaces = new int[12][2000];

	@ObfuscatedName("eb.vb")
	public static int[] tmpPriority10FaceDepth = new int[2000];

	@ObfuscatedName("eb.wb")
	public static int[] tmpPriority11FaceDepth = new int[2000];

	@ObfuscatedName("eb.xb")
	public static int[] tmpPriorityDepthSum = new int[12];

	@ObfuscatedName("eb.yb")
	public static final int[] clippedX = new int[10];

	@ObfuscatedName("eb.zb")
	public static final int[] clippedY = new int[10];

	@ObfuscatedName("eb.Ab")
	public static final int[] clippedColour = new int[10];

	@ObfuscatedName("eb.Ib")
	public static final int[] pickedEntityTypecode = new int[1000];

	@ObfuscatedName("eb.Jb")
	public static int[] sinTable = Pix3D.sinTable;

	@ObfuscatedName("eb.Kb")
	public static int[] cosTable = Pix3D.cosTable;

	@ObfuscatedName("eb.Lb")
	public static int[] colourTable = Pix3D.colourTable;

	@ObfuscatedName("eb.Mb")
	public static int[] divTable2 = Pix3D.divTable2;

	@ObfuscatedName("eb.C")
	public int numFaces;

	@ObfuscatedName("eb.O")
	public int numT;

	@ObfuscatedName("eb.A")
	public int[] pointY;

	@ObfuscatedName("eb.B")
	public int[] pointZ;

	@ObfuscatedName("eb.D")
	public int[] faceVertexA;

	@ObfuscatedName("eb.E")
	public int[] faceVertexB;

	@ObfuscatedName("eb.F")
	public int[] faceVertexC;

	@ObfuscatedName("eb.P")
	public int[] faceTextureP;

	@ObfuscatedName("eb.Q")
	public int[] faceTextureM;

	@ObfuscatedName("eb.R")
	public int[] faceTextureN;

	@ObfuscatedName("eb.J")
	public int[] faceRenderType;

	@ObfuscatedName("eb.K")
	public int[] facePriority;

	@ObfuscatedName("eb.N")
	public int priority;

	@ObfuscatedName("eb.L")
	public int[] faceAlpha;

	@ObfuscatedName("eb.M")
	public int[] faceColour;

	@ObfuscatedName("eb.G")
	public int[] faceColourA;

	@ObfuscatedName("eb.H")
	public int[] faceColourB;

	@ObfuscatedName("eb.I")
	public int[] faceColourC;

	@ObfuscatedName("eb.X")
	public int maxY;

	@ObfuscatedName("eb.W")
	public int radius;

	@ObfuscatedName("eb.Z")
	public int minDepth;

	@ObfuscatedName("eb.Y")
	public int maxDepth;

	@ObfuscatedName("eb.S")
	public int minX;

	@ObfuscatedName("eb.U")
	public int maxZ;

	@ObfuscatedName("eb.V")
	public int minZ;

	@ObfuscatedName("eb.T")
	public int maxX;

	@ObfuscatedName("eb.Bb")
	public static int oX;

	@ObfuscatedName("eb.Cb")
	public static int oY;

	@ObfuscatedName("eb.Db")
	public static int oZ;

	@ObfuscatedName("eb.Fb")
	public static int mouseX;

	@ObfuscatedName("eb.Gb")
	public static int mouseY;

	@ObfuscatedName("eb.Hb")
	public static int pickedCount;

	@ObfuscatedName("eb.Eb")
	public static boolean mouseCheck;

	public Model(byte arg0) {
		if (arg0 != field527) {
			throw new NullPointerException();
		}
	}

	public Model(byte arg0, int arg1) {
		loaded++;
		Metadata var3 = meta[arg1];
		numPoints = var3.numPoints;
		numFaces = var3.numFaces;
		numT = var3.numT;
		pointX = new int[numPoints];
		pointY = new int[numPoints];
		pointZ = new int[numPoints];
		faceVertexA = new int[numFaces];
		faceVertexB = new int[numFaces];
		faceVertexC = new int[numFaces];
		faceTextureP = new int[numT];
		faceTextureM = new int[numT];
		faceTextureN = new int[numT];
		if (var3.vertexLabelOffset >= 0) {
			vertexLabel = new int[numPoints];
		}
		if (var3.faceRenderTypeOffset >= 0) {
			faceRenderType = new int[numFaces];
		}
		if (var3.facePriorityOffset >= 0) {
			facePriority = new int[numFaces];
		} else {
			priority = -var3.facePriorityOffset - 1;
		}
		if (var3.faceAlphaOffset >= 0) {
			faceAlpha = new int[numFaces];
		}
		if (var3.faceLabelOffset >= 0) {
			faceLabel = new int[numFaces];
		}
		faceColour = new int[numFaces];
		Packet var4 = new Packet(var3.src, 15787);
		var4.pos = var3.vertexOrderOffset;
		Packet var5 = new Packet(var3.src, 15787);
		var5.pos = var3.vertexXOffset;
		Packet var6 = new Packet(var3.src, 15787);
		var6.pos = var3.vertexYOffset;
		Packet var7 = new Packet(var3.src, 15787);
		var7.pos = var3.vertexZOffset;
		Packet var8 = new Packet(var3.src, 15787);
		var8.pos = var3.vertexLabelOffset;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < numPoints; var12++) {
			int var13 = var4.g1();
			int var14 = 0;
			if ((var13 & 0x1) != 0) {
				var14 = var5.gsmarts();
			}
			int var15 = 0;
			if ((var13 & 0x2) != 0) {
				var15 = var6.gsmarts();
			}
			int var16 = 0;
			if ((var13 & 0x4) != 0) {
				var16 = var7.gsmarts();
			}
			pointX[var12] = var9 + var14;
			pointY[var12] = var10 + var15;
			pointZ[var12] = var11 + var16;
			var9 = pointX[var12];
			var10 = pointY[var12];
			var11 = pointZ[var12];
			if (vertexLabel != null) {
				vertexLabel[var12] = var8.g1();
			}
		}
		var4.pos = var3.faceColourOffset;
		var5.pos = var3.faceRenderTypeOffset;
		var6.pos = var3.facePriorityOffset;
		var7.pos = var3.faceAlphaOffset;
		var8.pos = var3.faceLabelOffset;
		for (int var17 = 0; var17 < numFaces; var17++) {
			faceColour[var17] = var4.g2();
			if (faceRenderType != null) {
				faceRenderType[var17] = var5.g1();
			}
			if (facePriority != null) {
				facePriority[var17] = var6.g1();
			}
			if (faceAlpha != null) {
				faceAlpha[var17] = var7.g1();
			}
			if (faceLabel != null) {
				faceLabel[var17] = var8.g1();
			}
		}
		var4.pos = var3.faceIndexOffset;
		var5.pos = var3.faceIndexOrderOffset;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		for (int var22 = 0; var22 < numFaces; var22++) {
			int var23 = var5.g1();
			if (var23 == 1) {
				var18 = var4.gsmarts() + var21;
				var19 = var4.gsmarts() + var18;
				var20 = var4.gsmarts() + var19;
				var21 = var20;
				faceVertexA[var22] = var18;
				faceVertexB[var22] = var19;
				faceVertexC[var22] = var20;
			}
			if (var23 == 2) {
				var18 = var18;
				var19 = var20;
				var20 = var4.gsmarts() + var21;
				var21 = var20;
				faceVertexA[var22] = var18;
				faceVertexB[var22] = var19;
				faceVertexC[var22] = var20;
			}
			if (var23 == 3) {
				var18 = var20;
				var19 = var19;
				var20 = var4.gsmarts() + var21;
				var21 = var20;
				faceVertexA[var22] = var18;
				faceVertexB[var22] = var19;
				faceVertexC[var22] = var20;
			}
			if (var23 == 4) {
				int var24 = var18;
				var18 = var19;
				var19 = var24;
				var20 = var4.gsmarts() + var21;
				var21 = var20;
				faceVertexA[var22] = var18;
				faceVertexB[var22] = var24;
				faceVertexC[var22] = var20;
			}
		}
		var4.pos = var3.faceTextureAxisOffset;
		for (int var25 = 0; var25 < numT; var25++) {
			faceTextureP[var25] = var4.g2();
			faceTextureM[var25] = var4.g2();
			faceTextureN[var25] = var4.g2();
		}
	}

	public Model(Model[] arg0, int arg1, int arg2) {
		loaded++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		priority = -1;
		for (int var8 = 0; var8 < arg1; var8++) {
			Model var9 = arg0[var8];
			if (var9 != null) {
				numPoints += var9.numPoints;
				numFaces += var9.numFaces;
				numT += var9.numT;
				var4 |= var9.faceRenderType != null;
				if (var9.facePriority == null) {
					if (priority == -1) {
						priority = var9.priority;
					}
					if (priority != var9.priority) {
						var5 = true;
					}
				} else {
					var5 = true;
				}
				var6 |= var9.faceAlpha != null;
				var7 |= var9.faceLabel != null;
			}
		}
		pointX = new int[numPoints];
		pointY = new int[numPoints];
		pointZ = new int[numPoints];
		vertexLabel = new int[numPoints];
		faceVertexA = new int[numFaces];
		faceVertexB = new int[numFaces];
		faceVertexC = new int[numFaces];
		faceTextureP = new int[numT];
		faceTextureM = new int[numT];
		faceTextureN = new int[numT];
		if (var4) {
			faceRenderType = new int[numFaces];
		}
		if (var5) {
			facePriority = new int[numFaces];
		}
		if (var6) {
			faceAlpha = new int[numFaces];
		}
		if (var7) {
			faceLabel = new int[numFaces];
		}
		faceColour = new int[numFaces];
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < arg1; var11++) {
			Model var12 = arg0[var11];
			if (var12 != null) {
				for (int var13 = 0; var13 < var12.numFaces; var13++) {
					if (var4) {
						if (var12.faceRenderType == null) {
							faceRenderType[numFaces] = 0;
						} else {
							int var14 = var12.faceRenderType[var13];
							if ((var14 & 0x2) == 0x2) {
								var14 += var10 << 2;
							}
							faceRenderType[numFaces] = var14;
						}
					}
					if (var5) {
						if (var12.facePriority == null) {
							facePriority[numFaces] = var12.priority;
						} else {
							facePriority[numFaces] = var12.facePriority[var13];
						}
					}
					if (var6) {
						if (var12.faceAlpha == null) {
							faceAlpha[numFaces] = 0;
						} else {
							faceAlpha[numFaces] = var12.faceAlpha[var13];
						}
					}
					if (var7 && var12.faceLabel != null) {
						faceLabel[numFaces] = var12.faceLabel[var13];
					}
					faceColour[numFaces] = var12.faceColour[var13];
					faceVertexA[numFaces] = addPoint(var12, var12.faceVertexA[var13]);
					faceVertexB[numFaces] = addPoint(var12, var12.faceVertexB[var13]);
					faceVertexC[numFaces] = addPoint(var12, var12.faceVertexC[var13]);
					numFaces++;
				}
				for (int var15 = 0; var15 < var12.numT; var15++) {
					faceTextureP[numT] = addPoint(var12, var12.faceTextureP[var15]);
					faceTextureM[numT] = addPoint(var12, var12.faceTextureM[var15]);
					faceTextureN[numT] = addPoint(var12, var12.faceTextureN[var15]);
					numT++;
				}
				var10 += var12.numT;
			}
		}
	}

	public Model(boolean arg0, int arg1, Model[] arg2, int arg3) {
		loaded++;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		priority = -1;
		for (int var9 = 0; var9 < 2; var9++) {
			Model var10 = arg2[var9];
			if (var10 != null) {
				numPoints += var10.numPoints;
				numFaces += var10.numFaces;
				numT += var10.numT;
				var5 |= var10.faceRenderType != null;
				if (var10.facePriority == null) {
					if (priority == -1) {
						priority = var10.priority;
					}
					if (priority != var10.priority) {
						var6 = true;
					}
				} else {
					var6 = true;
				}
				var7 |= var10.faceAlpha != null;
				var8 |= var10.faceColour != null;
			}
		}
		pointX = new int[numPoints];
		pointY = new int[numPoints];
		pointZ = new int[numPoints];
		faceVertexA = new int[numFaces];
		faceVertexB = new int[numFaces];
		faceVertexC = new int[numFaces];
		faceColourA = new int[numFaces];
		faceColourB = new int[numFaces];
		faceColourC = new int[numFaces];
		faceTextureP = new int[numT];
		faceTextureM = new int[numT];
		faceTextureN = new int[numT];
		if (var5) {
			faceRenderType = new int[numFaces];
		}
		if (var6) {
			facePriority = new int[numFaces];
		}
		if (var7) {
			faceAlpha = new int[numFaces];
		}
		if (var8) {
			faceColour = new int[numFaces];
		}
		numPoints = 0;
		numFaces = 0;
		numT = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < 2; var12++) {
			Model var13 = arg2[var12];
			if (var13 != null) {
				int var14 = numPoints;
				for (int var15 = 0; var15 < var13.numPoints; var15++) {
					pointX[numPoints] = var13.pointX[var15];
					pointY[numPoints] = var13.pointY[var15];
					pointZ[numPoints] = var13.pointZ[var15];
					numPoints++;
				}
				for (int var16 = 0; var16 < var13.numFaces; var16++) {
					faceVertexA[numFaces] = var13.faceVertexA[var16] + var14;
					faceVertexB[numFaces] = var13.faceVertexB[var16] + var14;
					faceVertexC[numFaces] = var13.faceVertexC[var16] + var14;
					faceColourA[numFaces] = var13.faceColourA[var16];
					faceColourB[numFaces] = var13.faceColourB[var16];
					faceColourC[numFaces] = var13.faceColourC[var16];
					if (var5) {
						if (var13.faceRenderType == null) {
							faceRenderType[numFaces] = 0;
						} else {
							int var17 = var13.faceRenderType[var16];
							if ((var17 & 0x2) == 0x2) {
								var17 += var11 << 2;
							}
							faceRenderType[numFaces] = var17;
						}
					}
					if (var6) {
						if (var13.facePriority == null) {
							facePriority[numFaces] = var13.priority;
						} else {
							facePriority[numFaces] = var13.facePriority[var16];
						}
					}
					if (var7) {
						if (var13.faceAlpha == null) {
							faceAlpha[numFaces] = 0;
						} else {
							faceAlpha[numFaces] = var13.faceAlpha[var16];
						}
					}
					if (var8 && var13.faceColour != null) {
						faceColour[numFaces] = var13.faceColour[var16];
					}
					numFaces++;
				}
				for (int var18 = 0; var18 < var13.numT; var18++) {
					faceTextureP[numT] = var13.faceTextureP[var18] + var14;
					faceTextureM[numT] = var13.faceTextureM[var18] + var14;
					faceTextureN[numT] = var13.faceTextureN[var18] + var14;
					numT++;
				}
				var11 += var13.numT;
			}
		}
		calcBoundingCylinder();
	}

	public Model(Model arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
		loaded++;
		numPoints = arg0.numPoints;
		numFaces = arg0.numFaces;
		numT = arg0.numT;
		if (arg2) {
			pointX = arg0.pointX;
			pointY = arg0.pointY;
			pointZ = arg0.pointZ;
		} else {
			pointX = new int[numPoints];
			pointY = new int[numPoints];
			pointZ = new int[numPoints];
			for (int var6 = 0; var6 < numPoints; var6++) {
				pointX[var6] = arg0.pointX[var6];
				pointY[var6] = arg0.pointY[var6];
				pointZ[var6] = arg0.pointZ[var6];
			}
		}
		if (arg4) {
			faceColour = arg0.faceColour;
		} else {
			faceColour = new int[numFaces];
			for (int var7 = 0; var7 < numFaces; var7++) {
				faceColour[var7] = arg0.faceColour[var7];
			}
		}
		if (arg1) {
			faceAlpha = arg0.faceAlpha;
		} else {
			faceAlpha = new int[numFaces];
			if (arg0.faceAlpha == null) {
				for (int var8 = 0; var8 < numFaces; var8++) {
					faceAlpha[var8] = 0;
				}
			} else {
				for (int var9 = 0; var9 < numFaces; var9++) {
					faceAlpha[var9] = arg0.faceAlpha[var9];
				}
			}
		}
		vertexLabel = arg0.vertexLabel;
		faceLabel = arg0.faceLabel;
		faceRenderType = arg0.faceRenderType;
		faceVertexA = arg0.faceVertexA;
		faceVertexB = arg0.faceVertexB;
		faceVertexC = arg0.faceVertexC;
		facePriority = arg0.facePriority;
		priority = arg0.priority;
		if (arg3 != 0) {
			for (int var10 = 1; var10 > 0; var10++) {
			}
		}
		faceTextureP = arg0.faceTextureP;
		faceTextureM = arg0.faceTextureM;
		faceTextureN = arg0.faceTextureN;
	}

	public Model(boolean arg0, int arg1, Model arg2, boolean arg3) {
		loaded++;
		numPoints = arg2.numPoints;
		numFaces = arg2.numFaces;
		numT = arg2.numT;
		if (arg3) {
			pointY = new int[numPoints];
			for (int var5 = 0; var5 < numPoints; var5++) {
				pointY[var5] = arg2.pointY[var5];
			}
		} else {
			pointY = arg2.pointY;
		}
		if (arg0) {
			faceColourA = new int[numFaces];
			faceColourB = new int[numFaces];
			faceColourC = new int[numFaces];
			for (int var6 = 0; var6 < numFaces; var6++) {
				faceColourA[var6] = arg2.faceColourA[var6];
				faceColourB[var6] = arg2.faceColourB[var6];
				faceColourC[var6] = arg2.faceColourC[var6];
			}
			faceRenderType = new int[numFaces];
			if (arg2.faceRenderType == null) {
				for (int var7 = 0; var7 < numFaces; var7++) {
					faceRenderType[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < numFaces; var8++) {
					faceRenderType[var8] = arg2.faceRenderType[var8];
				}
			}
			super.pointNormal = new PointNormal[numPoints];
			for (int var9 = 0; var9 < numPoints; var9++) {
				PointNormal var10 = super.pointNormal[var9] = new PointNormal();
				PointNormal var11 = arg2.pointNormal[var9];
				var10.x = var11.x;
				var10.y = var11.y;
				var10.z = var11.z;
				var10.w = var11.w;
			}
			sharedPointNormal = arg2.sharedPointNormal;
		} else {
			faceColourA = arg2.faceColourA;
			faceColourB = arg2.faceColourB;
			faceColourC = arg2.faceColourC;
			faceRenderType = arg2.faceRenderType;
		}
		pointX = arg2.pointX;
		pointZ = arg2.pointZ;
		faceColour = arg2.faceColour;
		faceAlpha = arg2.faceAlpha;
		facePriority = arg2.facePriority;
		priority = arg2.priority;
		faceVertexA = arg2.faceVertexA;
		faceVertexB = arg2.faceVertexB;
		faceVertexC = arg2.faceVertexC;
		faceTextureP = arg2.faceTextureP;
		faceTextureM = arg2.faceTextureM;
		faceTextureN = arg2.faceTextureN;
		super.minY = arg2.minY;
		maxY = arg2.maxY;
		radius = arg2.radius;
		minDepth = arg2.minDepth;
		maxDepth = arg2.maxDepth;
		minX = arg2.minX;
		maxZ = arg2.maxZ;
		minZ = arg2.minZ;
		maxX = arg2.maxX;
	}

	@ObfuscatedName("eb.a(B)V")
	public static void unload() {
		meta = null;
		faceClippedX = null;
		faceNearClipped = null;
		vertexScreenX = null;
		vertexScreenY = null;
		vertexScreenZ = null;
		vertexViewSpaceX = null;
		vertexViewSpaceY = null;
		vertexViewSpaceZ = null;
		tmpDepthFaceCount = null;
		tmpDepthFaces = null;
		tmpPriorityFaceCount = null;
		tmpPriorityFaces = null;
		tmpPriority10FaceDepth = null;
		tmpPriority11FaceDepth = null;
		tmpPriorityDepthSum = null;
		sinTable = null;
		cosTable = null;
		colourTable = null;
		divTable2 = null;
	}

	@ObfuscatedName("eb.a(ILtb;)V")
	public static void init(int arg0, OnDemandProvider arg1) {
		meta = new Metadata[arg0];
		provider = arg1;
	}

	@ObfuscatedName("eb.a([BIB)V")
	public static void unpack(byte[] arg0, int arg1) {
		if (arg0 == null) {
			Metadata var2 = meta[arg1] = new Metadata();
			var2.numPoints = 0;
			var2.numFaces = 0;
			var2.numT = 0;
			return;
		}
		Packet var3 = new Packet(arg0, 15787);
		var3.pos = arg0.length - 18;
		Metadata var4 = meta[arg1] = new Metadata();
		var4.src = arg0;
		var4.numPoints = var3.g2();
		var4.numFaces = var3.g2();
		var4.numT = var3.g1();
		int var5 = var3.g1();
		int var6 = var3.g1();
		int var7 = var3.g1();
		int var8 = var3.g1();
		int var9 = var3.g1();
		int var10 = var3.g2();
		int var11 = var3.g2();
		int var12 = var3.g2();
		int var13 = var3.g2();
		var4.vertexOrderOffset = 0;
		int var14 = var4.numPoints;
		var4.faceIndexOrderOffset = var14;
		int var15 = var14 + var4.numFaces;
		var4.facePriorityOffset = var15;
		if (var6 == 255) {
			var15 += var4.numFaces;
		} else {
			var4.facePriorityOffset = -var6 - 1;
		}
		var4.faceLabelOffset = var15;
		if (var8 == 1) {
			var15 += var4.numFaces;
		} else {
			var4.faceLabelOffset = -1;
		}
		var4.faceRenderTypeOffset = var15;
		if (var5 == 1) {
			var15 += var4.numFaces;
		} else {
			var4.faceRenderTypeOffset = -1;
		}
		var4.vertexLabelOffset = var15;
		if (var9 == 1) {
			var15 += var4.numPoints;
		} else {
			var4.vertexLabelOffset = -1;
		}
		var4.faceAlphaOffset = var15;
		if (var7 == 1) {
			var15 += var4.numFaces;
		} else {
			var4.faceAlphaOffset = -1;
		}
		var4.faceIndexOffset = var15;
		int var16 = var15 + var13;
		var4.faceColourOffset = var16;
		int var17 = var16 + var4.numFaces * 2;
		var4.faceTextureAxisOffset = var17;
		int var18 = var17 + var4.numT * 6;
		var4.vertexXOffset = var18;
		int var19 = var18 + var10;
		var4.vertexYOffset = var19;
		int var20 = var19 + var11;
		var4.vertexZOffset = var20;
	}

	@ObfuscatedName("eb.a(BI)V")
	public static void unload(int arg0) {
		meta[arg0] = null;
	}

	@ObfuscatedName("eb.a(IB)Leb;")
	public static Model load(int arg0, byte arg1) {
		if (arg1 != 4) {
			field525 = -279;
		}
		if (meta == null) {
			return null;
		}
		Metadata var2 = meta[arg0];
		if (var2 != null) {
			return new Model((byte) 5, arg0);
		}
		provider.requestModel(arg0);
		return null;
	}

	@ObfuscatedName("eb.b(I)Z")
	public static boolean requestDownload(int arg0) {
		if (meta == null) {
			return false;
		}
		Metadata var1 = meta[arg0];
		if (var1 != null) {
			return true;
		}
		provider.requestModel(arg0);
		return false;
	}

	@ObfuscatedName("eb.a(III)I")
	public static int getColour(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 0x2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		}
		int var4 = arg1 * (arg0 & 0x7F) >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	@ObfuscatedName("eb.a(ZLeb;I)V")
	public void set(boolean arg0, Model arg1) {
		numPoints = arg1.numPoints;
		numFaces = arg1.numFaces;
		numT = arg1.numT;
		if (tmpVertexX.length < numPoints) {
			tmpVertexX = new int[numPoints + 100];
			tmpVertexY = new int[numPoints + 100];
			tmpVertexZ = new int[numPoints + 100];
		}
		pointX = tmpVertexX;
		pointY = tmpVertexY;
		pointZ = tmpVertexZ;
		for (int var3 = 0; var3 < numPoints; var3++) {
			pointX[var3] = arg1.pointX[var3];
			pointY[var3] = arg1.pointY[var3];
			pointZ[var3] = arg1.pointZ[var3];
		}
		if (arg0) {
			faceAlpha = arg1.faceAlpha;
		} else {
			if (tempFTran.length < numFaces) {
				tempFTran = new int[numFaces + 100];
			}
			faceAlpha = tempFTran;
			if (arg1.faceAlpha == null) {
				for (int var4 = 0; var4 < numFaces; var4++) {
					faceAlpha[var4] = 0;
				}
			} else {
				for (int var5 = 0; var5 < numFaces; var5++) {
					faceAlpha[var5] = arg1.faceAlpha[var5];
				}
			}
		}
		faceRenderType = arg1.faceRenderType;
		faceColour = arg1.faceColour;
		facePriority = arg1.facePriority;
		priority = arg1.priority;
		labelFaces = arg1.labelFaces;
		labelVertices = arg1.labelVertices;
		faceVertexA = arg1.faceVertexA;
		faceVertexB = arg1.faceVertexB;
		faceVertexC = arg1.faceVertexC;
		faceColourA = arg1.faceColourA;
		faceColourB = arg1.faceColourB;
		faceColourC = arg1.faceColourC;
		faceTextureP = arg1.faceTextureP;
		faceTextureM = arg1.faceTextureM;
		faceTextureN = arg1.faceTextureN;
	}

	@ObfuscatedName("eb.a(Leb;I)I")
	public int addPoint(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.pointX[arg1];
		int var5 = arg0.pointY[arg1];
		int var6 = arg0.pointZ[arg1];
		for (int var7 = 0; var7 < numPoints; var7++) {
			if (var4 == pointX[var7] && var5 == pointY[var7] && var6 == pointZ[var7]) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			pointX[numPoints] = var4;
			pointY[numPoints] = var5;
			pointZ[numPoints] = var6;
			if (arg0.vertexLabel != null) {
				vertexLabel[numPoints] = arg0.vertexLabel[arg1];
			}
			var3 = numPoints++;
		}
		return var3;
	}

	@ObfuscatedName("eb.c(I)V")
	public void calcBoundingCylinder() {
		super.minY = 0;
		radius = 0;
		maxY = 0;
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointX[var1];
			int var3 = pointY[var1];
			int var4 = pointZ[var1];
			if (-var3 > super.minY) {
				super.minY = -var3;
			}
			if (var3 > maxY) {
				maxY = var3;
			}
			int var5 = var2 * var2 + var4 * var4;
			if (var5 > radius) {
				radius = var5;
			}
		}
		radius = (int) (Math.sqrt((double) radius) + 0.99D);
		minDepth = (int) (Math.sqrt((double) (radius * radius + super.minY * super.minY)) + 0.99D);
		maxDepth = minDepth + (int) (Math.sqrt((double) (radius * radius + maxY * maxY)) + 0.99D);
	}

	@ObfuscatedName("eb.d(I)V")
	public void recalcBoundingCylinder(int arg0) {
		super.minY = 0;
		if (arg0 < 0) {
			maxY = 0;
			for (int var2 = 0; var2 < numPoints; var2++) {
				int var3 = pointY[var2];
				if (-var3 > super.minY) {
					super.minY = -var3;
				}
				if (var3 > maxY) {
					maxY = var3;
				}
			}
			minDepth = (int) (Math.sqrt((double) (radius * radius + super.minY * super.minY)) + 0.99D);
			maxDepth = minDepth + (int) (Math.sqrt((double) (radius * radius + maxY * maxY)) + 0.99D);
		}
	}

	@ObfuscatedName("eb.e(I)V")
	public void calcBoundingCube() {
		super.minY = 0;
		radius = 0;
		maxY = 0;
		minX = 999999;
		maxX = -999999;
		maxZ = -99999;
		minZ = 99999;
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointX[var1];
			int var3 = pointY[var1];
			int var4 = pointZ[var1];
			if (var2 < minX) {
				minX = var2;
			}
			if (var2 > maxX) {
				maxX = var2;
			}
			if (var4 < minZ) {
				minZ = var4;
			}
			if (var4 > maxZ) {
				maxZ = var4;
			}
			if (-var3 > super.minY) {
				super.minY = -var3;
			}
			if (var3 > maxY) {
				maxY = var3;
			}
			int var5 = var2 * var2 + var4 * var4;
			if (var5 > radius) {
				radius = var5;
			}
		}
		radius = (int) Math.sqrt((double) radius);
		minDepth = (int) Math.sqrt((double) (radius * radius + super.minY * super.minY));
		maxDepth = minDepth + (int) Math.sqrt((double) (radius * radius + maxY * maxY));
	}

	@ObfuscatedName("eb.b(B)V")
	public void prepareAnim() {
		int var10002;
		if (vertexLabel != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < numPoints; var3++) {
				int var4 = vertexLabel[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			labelVertices = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				labelVertices[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}
			int var6 = 0;
			while (var6 < numPoints) {
				int var7 = vertexLabel[var6];
				labelVertices[var7][var1[var7]++] = var6++;
			}
			vertexLabel = null;
		}
		if (faceLabel != null) {
			int[] var8 = new int[256];
			int var9 = 0;
			for (int var10 = 0; var10 < numFaces; var10++) {
				int var11 = faceLabel[var10];
				var10002 = var8[var11]++;
				if (var11 > var9) {
					var9 = var11;
				}
			}
			labelFaces = new int[var9 + 1][];
			for (int var12 = 0; var12 <= var9; var12++) {
				labelFaces[var12] = new int[var8[var12]];
				var8[var12] = 0;
			}
			int var13 = 0;
			while (var13 < numFaces) {
				int var14 = faceLabel[var13];
				labelFaces[var14][var8[var14]++] = var13++;
			}
			faceLabel = null;
		}
	}

	@ObfuscatedName("eb.a(II)V")
	public void animate(int arg0) {
		if (labelVertices == null || arg0 == -1) {
			return;
		}
		AnimFrame var2 = AnimFrame.get(arg0, field526);
		if (var2 != null) {
			AnimBase var3 = var2.base;
			oX = 0;
			oY = 0;
			oZ = 0;
			for (int var4 = 0; var4 < var2.size; var4++) {
				int var5 = var2.ti[var4];
				animate2(var3.type[var5], var3.labels[var5], var2.tx[var4], var2.ty[var4], var2.tz[var4]);
			}
		}
	}

	@ObfuscatedName("eb.a(IZI[I)V")
	public void maskAnimate(int arg0, int arg1, int[] arg2) {
		if (arg0 == -1) {
			return;
		}
		if (arg2 == null || arg1 == -1) {
			animate(arg0);
			return;
		}
		AnimFrame var4 = AnimFrame.get(arg0, field526);
		if (var4 != null) {
			AnimFrame var5 = AnimFrame.get(arg1, field526);
			if (var5 == null) {
				animate(arg0);
			} else {
				AnimBase var6 = var4.base;
				oX = 0;
				oY = 0;
				oZ = 0;
				byte var7 = 0;
				int var15 = var7 + 1;
				int var8 = arg2[0];
				for (int var9 = 0; var9 < var4.size; var9++) {
					int var10 = var4.ti[var9];
					while (var10 > var8) {
						var8 = arg2[var15++];
					}
					if (var10 != var8 || var6.type[var10] == 0) {
						animate2(var6.type[var10], var6.labels[var10], var4.tx[var9], var4.ty[var9], var4.tz[var9]);
					}
				}
				oX = 0;
				oY = 0;
				oZ = 0;
				byte var11 = 0;
				int var16 = var11 + 1;
				int var12 = arg2[0];
				for (int var13 = 0; var13 < var5.size; var13++) {
					int var14 = var5.ti[var13];
					while (var14 > var12) {
						var12 = arg2[var16++];
					}
					if (var14 == var12 || var6.type[var14] == 0) {
						animate2(var6.type[var14], var6.labels[var14], var5.tx[var13], var5.ty[var13], var5.tz[var13]);
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I[IIII)V")
	public void animate2(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			oX = 0;
			oY = 0;
			oZ = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < labelVertices.length) {
					int[] var10 = labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						oX += pointX[var12];
						oY += pointY[var12];
						oZ += pointZ[var12];
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
				if (var14 < labelVertices.length) {
					int[] var15 = labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						pointX[var17] += arg2;
						pointY[var17] += arg3;
						pointZ[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < labelVertices.length) {
					int[] var20 = labelVertices[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						pointX[var22] -= oX;
						pointY[var22] -= oY;
						pointZ[var22] -= oZ;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = sinTable[var25];
							int var27 = cosTable[var25];
							int var28 = pointY[var22] * var26 + pointX[var22] * var27 >> 16;
							pointY[var22] = pointY[var22] * var27 - pointX[var22] * var26 >> 16;
							pointX[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = sinTable[var23];
							int var30 = cosTable[var23];
							int var31 = pointY[var22] * var30 - pointZ[var22] * var29 >> 16;
							pointZ[var22] = pointY[var22] * var29 + pointZ[var22] * var30 >> 16;
							pointY[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = sinTable[var24];
							int var33 = cosTable[var24];
							int var34 = pointZ[var22] * var32 + pointX[var22] * var33 >> 16;
							pointZ[var22] = pointZ[var22] * var33 - pointX[var22] * var32 >> 16;
							pointX[var22] = var34;
						}
						pointX[var22] += oX;
						pointY[var22] += oY;
						pointZ[var22] += oZ;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < labelVertices.length) {
					int[] var37 = labelVertices[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						pointX[var39] -= oX;
						pointY[var39] -= oY;
						pointZ[var39] -= oZ;
						pointX[var39] = pointX[var39] * arg2 / 128;
						pointY[var39] = pointY[var39] * arg3 / 128;
						pointZ[var39] = pointZ[var39] * arg4 / 128;
						pointX[var39] += oX;
						pointY[var39] += oY;
						pointZ[var39] += oZ;
					}
				}
			}
		} else if (arg0 == 5 && (labelFaces != null && faceAlpha != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < labelFaces.length) {
					int[] var42 = labelFaces[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						faceAlpha[var44] += arg2 * 8;
						if (faceAlpha[var44] < 0) {
							faceAlpha[var44] = 0;
						}
						if (faceAlpha[var44] > 255) {
							faceAlpha[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.f(I)V")
	public void rotate90() {
		for (int var1 = 0; var1 < numPoints; var1++) {
			int var2 = pointX[var1];
			pointX[var1] = pointZ[var1];
			pointZ[var1] = -var2;
		}
	}

	@ObfuscatedName("eb.b(II)V")
	public void rotateXAxis(int arg0) {
		int var2 = sinTable[arg0];
		int var3 = cosTable[arg0];
		for (int var4 = 0; var4 < numPoints; var4++) {
			int var5 = pointY[var4] * var3 - pointZ[var4] * var2 >> 16;
			pointZ[var4] = pointY[var4] * var2 + pointZ[var4] * var3 >> 16;
			pointY[var4] = var5;
		}
	}

	@ObfuscatedName("eb.a(IIBI)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numPoints; var4++) {
			pointX[var4] += arg1;
			pointY[var4] += arg0;
			pointZ[var4] += arg2;
		}
	}

	@ObfuscatedName("eb.c(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < numFaces; var3++) {
			if (faceColour[var3] == arg0) {
				faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("eb.g(I)V")
	public void mirror() {
		for (int var1 = 0; var1 < numPoints; var1++) {
			pointZ[var1] = -pointZ[var1];
		}
		for (int var2 = 0; var2 < numFaces; var2++) {
			int var3 = faceVertexA[var2];
			faceVertexA[var2] = faceVertexC[var2];
			faceVertexC[var2] = var3;
		}
	}

	@ObfuscatedName("eb.a(IIIB)V")
	public void resize(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numPoints; var4++) {
			pointX[var4] = pointX[var4] * arg0 / 128;
			pointY[var4] = pointY[var4] * arg2 / 128;
			pointZ[var4] = pointZ[var4] * arg1 / 128;
		}
	}

	@ObfuscatedName("eb.a(IIIIIZ)V")
	public void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		int var8 = arg1 * var7 >> 8;
		if (faceColourA == null) {
			faceColourA = new int[numFaces];
			faceColourB = new int[numFaces];
			faceColourC = new int[numFaces];
		}
		if (super.pointNormal == null) {
			super.pointNormal = new PointNormal[numPoints];
			for (int var9 = 0; var9 < numPoints; var9++) {
				super.pointNormal[var9] = new PointNormal();
			}
		}
		for (int var10 = 0; var10 < numFaces; var10++) {
			int var11 = faceVertexA[var10];
			int var12 = faceVertexB[var10];
			int var13 = faceVertexC[var10];
			int var14 = pointX[var12] - pointX[var11];
			int var15 = pointY[var12] - pointY[var11];
			int var16 = pointZ[var12] - pointZ[var11];
			int var17 = pointX[var13] - pointX[var11];
			int var18 = pointY[var13] - pointY[var11];
			int var19 = pointZ[var13] - pointZ[var11];
			int var20 = var15 * var19 - var18 * var16;
			int var21 = var16 * var17 - var19 * var14;
			int var22;
			for (var22 = var14 * var18 - var17 * var15; var20 > 8192 || var21 > 8192 || var22 > 8192 || var20 < -8192 || var21 < -8192 || var22 < -8192; var22 >>= 0x1) {
				var20 >>= 0x1;
				var21 >>= 0x1;
			}
			int var23 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + var22 * var22));
			if (var23 <= 0) {
				var23 = 1;
			}
			int var24 = var20 * 256 / var23;
			int var25 = var21 * 256 / var23;
			int var26 = var22 * 256 / var23;
			if (faceRenderType == null || (faceRenderType[var10] & 0x1) == 0) {
				PointNormal var27 = super.pointNormal[var11];
				var27.x += var24;
				var27.y += var25;
				var27.z += var26;
				var27.w++;
				PointNormal var28 = super.pointNormal[var12];
				var28.x += var24;
				var28.y += var25;
				var28.z += var26;
				var28.w++;
				PointNormal var29 = super.pointNormal[var13];
				var29.x += var24;
				var29.y += var25;
				var29.z += var26;
				var29.w++;
			} else {
				int var30 = arg0 + (arg2 * var24 + arg3 * var25 + arg4 * var26) / (var8 + var8 / 2);
				faceColourA[var10] = getColour(faceColour[var10], var30, faceRenderType[var10]);
			}
		}
		if (arg5) {
			light(arg0, var8, arg2, arg3, arg4);
		} else {
			sharedPointNormal = new PointNormal[numPoints];
			for (int var31 = 0; var31 < numPoints; var31++) {
				PointNormal var32 = super.pointNormal[var31];
				PointNormal var33 = sharedPointNormal[var31] = new PointNormal();
				var33.x = var32.x;
				var33.y = var32.y;
				var33.z = var32.z;
				var33.w = var32.w;
			}
		}
		if (arg5) {
			calcBoundingCylinder();
		} else {
			calcBoundingCube();
		}
	}

	@ObfuscatedName("eb.a(IIIII)V")
	public void light(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < numFaces; var6++) {
			int var7 = faceVertexA[var6];
			int var8 = faceVertexB[var6];
			int var9 = faceVertexC[var6];
			if (faceRenderType == null) {
				int var10 = faceColour[var6];
				PointNormal var11 = super.pointNormal[var7];
				int var12 = arg0 + (arg2 * var11.x + arg3 * var11.y + arg4 * var11.z) / (arg1 * var11.w);
				faceColourA[var6] = getColour(var10, var12, 0);
				PointNormal var13 = super.pointNormal[var8];
				int var14 = arg0 + (arg2 * var13.x + arg3 * var13.y + arg4 * var13.z) / (arg1 * var13.w);
				faceColourB[var6] = getColour(var10, var14, 0);
				PointNormal var15 = super.pointNormal[var9];
				int var16 = arg0 + (arg2 * var15.x + arg3 * var15.y + arg4 * var15.z) / (arg1 * var15.w);
				faceColourC[var6] = getColour(var10, var16, 0);
			} else if ((faceRenderType[var6] & 0x1) == 0) {
				int var17 = faceColour[var6];
				int var18 = faceRenderType[var6];
				PointNormal var19 = super.pointNormal[var7];
				int var20 = arg0 + (arg2 * var19.x + arg3 * var19.y + arg4 * var19.z) / (arg1 * var19.w);
				faceColourA[var6] = getColour(var17, var20, var18);
				PointNormal var21 = super.pointNormal[var8];
				int var22 = arg0 + (arg2 * var21.x + arg3 * var21.y + arg4 * var21.z) / (arg1 * var21.w);
				faceColourB[var6] = getColour(var17, var22, var18);
				PointNormal var23 = super.pointNormal[var9];
				int var24 = arg0 + (arg2 * var23.x + arg3 * var23.y + arg4 * var23.z) / (arg1 * var23.w);
				faceColourC[var6] = getColour(var17, var24, var18);
			}
		}
		super.pointNormal = null;
		sharedPointNormal = null;
		vertexLabel = null;
		faceLabel = null;
		if (faceRenderType != null) {
			for (int var25 = 0; var25 < numFaces; var25++) {
				if ((faceRenderType[var25] & 0x2) == 0x2) {
					return;
				}
			}
		}
		faceColour = null;
	}

	@ObfuscatedName("eb.a(IIIIIII)V")
	public void objRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix3D.originX;
		int var8 = Pix3D.originY;
		int var9 = sinTable[0];
		int var10 = cosTable[0];
		int var11 = sinTable[arg0];
		int var12 = cosTable[arg0];
		int var13 = sinTable[arg1];
		int var14 = cosTable[arg1];
		int var15 = sinTable[arg2];
		int var16 = cosTable[arg2];
		int var17 = arg4 * var15 + arg5 * var16 >> 16;
		for (int var18 = 0; var18 < numPoints; var18++) {
			int var19 = pointX[var18];
			int var20 = pointY[var18];
			int var21 = pointZ[var18];
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
			if (numT > 0) {
				vertexViewSpaceX[var18] = var24;
				vertexViewSpaceY[var18] = var27;
				vertexViewSpaceZ[var18] = var28;
			}
		}
		try {
			render2(false, false, 0);
		} catch (Exception var29) {
		}
	}

	@ObfuscatedName("eb.a(IIIIIIIII)V")
	@Override
	public void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg7 * arg4 - arg5 * arg3 >> 16;
		int var11 = arg6 * arg1 + var10 * arg2 >> 16;
		int var12 = radius * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = arg7 * arg3 + arg5 * arg4 >> 16;
			int var15 = var14 - radius << 9;
			if (var15 / var13 < Pix2D.maxX) {
				int var16 = var14 + radius << 9;
				if (var16 / var13 > -Pix2D.maxX) {
					int var17 = arg6 * arg2 - var10 * arg1 >> 16;
					int var18 = radius * arg1 >> 16;
					int var19 = var17 + var18 << 9;
					if (var19 / var13 > -Pix2D.maxY) {
						int var20 = var18 + (super.minY * arg2 >> 16);
						int var21 = var17 - var20 << 9;
						if (var21 / var13 < Pix2D.maxY) {
							int var22 = var12 + (super.minY * arg1 >> 16);
							boolean var23 = false;
							if (var11 - var22 <= 50) {
								var23 = true;
							}
							boolean var24 = false;
							if (arg8 > 0 && mouseCheck) {
								int var25 = var11 - var12;
								if (var25 <= 50) {
									var25 = 50;
								}
								int var26;
								int var27;
								if (var14 > 0) {
									var26 = var15 / var13;
									var27 = var16 / var25;
								} else {
									var27 = var16 / var13;
									var26 = var15 / var25;
								}
								int var28;
								int var29;
								if (var17 > 0) {
									var28 = var21 / var13;
									var29 = var19 / var25;
								} else {
									var29 = var19 / var13;
									var28 = var21 / var25;
								}
								int var30 = mouseX - Pix3D.originX;
								int var31 = mouseY - Pix3D.originY;
								if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
									if (useAABBMouseCheck) {
										pickedEntityTypecode[pickedCount++] = arg8;
									} else {
										var24 = true;
									}
								}
							}
							int var32 = Pix3D.originX;
							int var33 = Pix3D.originY;
							int var34 = 0;
							int var35 = 0;
							if (arg0 != 0) {
								var34 = sinTable[arg0];
								var35 = cosTable[arg0];
							}
							for (int var36 = 0; var36 < numPoints; var36++) {
								int var37 = pointX[var36];
								int var38 = pointY[var36];
								int var39 = pointZ[var36];
								if (arg0 != 0) {
									int var40 = var39 * var34 + var37 * var35 >> 16;
									var39 = var39 * var35 - var37 * var34 >> 16;
									var37 = var40;
								}
								int var41 = var37 + arg5;
								int var42 = var38 + arg6;
								int var43 = var39 + arg7;
								int var44 = var43 * arg3 + var41 * arg4 >> 16;
								int var45 = var43 * arg4 - var41 * arg3 >> 16;
								int var47 = var42 * arg2 - var45 * arg1 >> 16;
								int var48 = var42 * arg1 + var45 * arg2 >> 16;
								vertexScreenZ[var36] = var48 - var11;
								if (var48 >= 50) {
									vertexScreenX[var36] = var32 + (var44 << 9) / var48;
									vertexScreenY[var36] = var33 + (var47 << 9) / var48;
								} else {
									vertexScreenX[var36] = -5000;
									var23 = true;
								}
								if (var23 || numT > 0) {
									vertexViewSpaceX[var36] = var44;
									vertexViewSpaceY[var36] = var47;
									vertexViewSpaceZ[var36] = var48;
								}
							}
							try {
								render2(var23, var24, arg8);
							} catch (Exception var49) {
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.a(ZZI)V")
	public void render2(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < maxDepth; var4++) {
			tmpDepthFaceCount[var4] = 0;
		}
		for (int var5 = 0; var5 < numFaces; var5++) {
			if (faceRenderType == null || faceRenderType[var5] != -1) {
				int var6 = faceVertexA[var5];
				int var7 = faceVertexB[var5];
				int var8 = faceVertexC[var5];
				int var9 = vertexScreenX[var6];
				int var10 = vertexScreenX[var7];
				int var11 = vertexScreenX[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					faceNearClipped[var5] = true;
					int var12 = (vertexScreenZ[var6] + vertexScreenZ[var7] + vertexScreenZ[var8]) / 3 + minDepth;
					tmpDepthFaces[var12][tmpDepthFaceCount[var12]++] = var5;
				} else {
					if (arg1 && isMouseRoughlyInsideTriangle(mouseX, mouseY, vertexScreenY[var6], vertexScreenY[var7], vertexScreenY[var8], var9, var10, var11)) {
						pickedEntityTypecode[pickedCount++] = arg2;
						arg1 = false;
					}
					if ((var9 - var10) * (vertexScreenY[var8] - vertexScreenY[var7]) - (vertexScreenY[var6] - vertexScreenY[var7]) * (var11 - var10) > 0) {
						faceNearClipped[var5] = false;
						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix2D.sizeX && var10 <= Pix2D.sizeX && var11 <= Pix2D.sizeX) {
							faceClippedX[var5] = false;
						} else {
							faceClippedX[var5] = true;
						}
						int var13 = (vertexScreenZ[var6] + vertexScreenZ[var7] + vertexScreenZ[var8]) / 3 + minDepth;
						tmpDepthFaces[var13][tmpDepthFaceCount[var13]++] = var5;
					}
				}
			}
		}
		if (facePriority == null) {
			for (int var14 = maxDepth - 1; var14 >= 0; var14--) {
				int var15 = tmpDepthFaceCount[var14];
				if (var15 > 0) {
					int[] var16 = tmpDepthFaces[var14];
					for (int var17 = 0; var17 < var15; var17++) {
						render3(var16[var17]);
					}
				}
			}
			return;
		}
		for (int var18 = 0; var18 < 12; var18++) {
			tmpPriorityFaceCount[var18] = 0;
			tmpPriorityDepthSum[var18] = 0;
		}
		for (int var19 = maxDepth - 1; var19 >= 0; var19--) {
			int var20 = tmpDepthFaceCount[var19];
			if (var20 > 0) {
				int[] var21 = tmpDepthFaces[var19];
				for (int var22 = 0; var22 < var20; var22++) {
					int var23 = var21[var22];
					int var24 = facePriority[var23];
					int var25 = tmpPriorityFaceCount[var24]++;
					tmpPriorityFaces[var24][var25] = var23;
					if (var24 < 10) {
						tmpPriorityDepthSum[var24] += var19;
					} else if (var24 == 10) {
						tmpPriority10FaceDepth[var25] = var19;
					} else {
						tmpPriority11FaceDepth[var25] = var19;
					}
				}
			}
		}
		int var26 = 0;
		if (tmpPriorityFaceCount[1] > 0 || tmpPriorityFaceCount[2] > 0) {
			var26 = (tmpPriorityDepthSum[1] + tmpPriorityDepthSum[2]) / (tmpPriorityFaceCount[1] + tmpPriorityFaceCount[2]);
		}
		int var27 = 0;
		if (tmpPriorityFaceCount[3] > 0 || tmpPriorityFaceCount[4] > 0) {
			var27 = (tmpPriorityDepthSum[3] + tmpPriorityDepthSum[4]) / (tmpPriorityFaceCount[3] + tmpPriorityFaceCount[4]);
		}
		int var28 = 0;
		if (tmpPriorityFaceCount[6] > 0 || tmpPriorityFaceCount[8] > 0) {
			var28 = (tmpPriorityDepthSum[6] + tmpPriorityDepthSum[8]) / (tmpPriorityFaceCount[6] + tmpPriorityFaceCount[8]);
		}
		int var29 = 0;
		int var30 = tmpPriorityFaceCount[10];
		int[] var31 = tmpPriorityFaces[10];
		int[] var32 = tmpPriority10FaceDepth;
		if (var30 == 0) {
			var29 = 0;
			var30 = tmpPriorityFaceCount[11];
			var31 = tmpPriorityFaces[11];
			var32 = tmpPriority11FaceDepth;
		}
		int var33;
		if (var30 > 0) {
			var33 = var32[0];
		} else {
			var33 = -1000;
		}
		for (int var34 = 0; var34 < 10; var34++) {
			while (var34 == 0 && var33 > var26) {
				render3(var31[var29++]);
				if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
					var29 = 0;
					var30 = tmpPriorityFaceCount[11];
					var31 = tmpPriorityFaces[11];
					var32 = tmpPriority11FaceDepth;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			while (var34 == 3 && var33 > var27) {
				render3(var31[var29++]);
				if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
					var29 = 0;
					var30 = tmpPriorityFaceCount[11];
					var31 = tmpPriorityFaces[11];
					var32 = tmpPriority11FaceDepth;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			while (var34 == 5 && var33 > var28) {
				render3(var31[var29++]);
				if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
					var29 = 0;
					var30 = tmpPriorityFaceCount[11];
					var31 = tmpPriorityFaces[11];
					var32 = tmpPriority11FaceDepth;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			int var35 = tmpPriorityFaceCount[var34];
			int[] var36 = tmpPriorityFaces[var34];
			for (int var37 = 0; var37 < var35; var37++) {
				render3(var36[var37]);
			}
		}
		while (var33 != -1000) {
			render3(var31[var29++]);
			if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
				var29 = 0;
				var31 = tmpPriorityFaces[11];
				var30 = tmpPriorityFaceCount[11];
				var32 = tmpPriority11FaceDepth;
			}
			if (var29 < var30) {
				var33 = var32[var29];
			} else {
				var33 = -1000;
			}
		}
	}

	@ObfuscatedName("eb.h(I)V")
	public void render3(int arg0) {
		if (faceNearClipped[arg0]) {
			render3ZClip(arg0);
			return;
		}
		int var2 = faceVertexA[arg0];
		int var3 = faceVertexB[arg0];
		int var4 = faceVertexC[arg0];
		Pix3D.hclip = faceClippedX[arg0];
		if (faceAlpha == null) {
			Pix3D.trans = 0;
		} else {
			Pix3D.trans = faceAlpha[arg0];
		}
		int var5;
		if (faceRenderType == null) {
			var5 = 0;
		} else {
			var5 = faceRenderType[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.gouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourB[arg0], faceColourC[arg0]);
		} else if (var5 == 1) {
			Pix3D.flatTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], colourTable[faceColourA[arg0]]);
		} else if (var5 == 2) {
			int var6 = faceRenderType[arg0] >> 2;
			int var7 = faceTextureP[var6];
			int var8 = faceTextureM[var6];
			int var9 = faceTextureN[var6];
			Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourB[arg0], faceColourC[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], faceColour[arg0]);
		} else if (var5 == 3) {
			int var10 = faceRenderType[arg0] >> 2;
			int var11 = faceTextureP[var10];
			int var12 = faceTextureM[var10];
			int var13 = faceTextureN[var10];
			Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var11], vertexViewSpaceX[var12], vertexViewSpaceX[var13], vertexViewSpaceY[var11], vertexViewSpaceY[var12], vertexViewSpaceY[var13], vertexViewSpaceZ[var11], vertexViewSpaceZ[var12], vertexViewSpaceZ[var13], faceColour[arg0]);
		}
	}

	@ObfuscatedName("eb.i(I)V")
	public void render3ZClip(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
		int var4 = 0;
		int var5 = faceVertexA[arg0];
		int var6 = faceVertexB[arg0];
		int var7 = faceVertexC[arg0];
		int var8 = vertexViewSpaceZ[var5];
		int var9 = vertexViewSpaceZ[var6];
		int var10 = vertexViewSpaceZ[var7];
		if (var8 >= 50) {
			clippedX[0] = vertexScreenX[var5];
			clippedY[0] = vertexScreenY[var5];
			var4++;
			clippedColour[0] = faceColourA[arg0];
		} else {
			int var11 = vertexViewSpaceX[var5];
			int var12 = vertexViewSpaceY[var5];
			int var13 = faceColourA[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * divTable2[var10 - var8];
				clippedX[0] = var2 + (var11 + ((vertexViewSpaceX[var7] - var11) * var14 >> 16) << 9) / 50;
				clippedY[0] = var3 + (var12 + ((vertexViewSpaceY[var7] - var12) * var14 >> 16) << 9) / 50;
				var4++;
				clippedColour[0] = var13 + ((faceColourC[arg0] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * divTable2[var9 - var8];
				clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var6] - var11) * var15 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var6] - var12) * var15 >> 16) << 9) / 50;
				clippedColour[var4++] = var13 + ((faceColourB[arg0] - var13) * var15 >> 16);
			}
		}
		if (var9 >= 50) {
			clippedX[var4] = vertexScreenX[var6];
			clippedY[var4] = vertexScreenY[var6];
			clippedColour[var4++] = faceColourB[arg0];
		} else {
			int var16 = vertexViewSpaceX[var6];
			int var17 = vertexViewSpaceY[var6];
			int var18 = faceColourB[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * divTable2[var8 - var9];
				clippedX[var4] = var2 + (var16 + ((vertexViewSpaceX[var5] - var16) * var19 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var17 + ((vertexViewSpaceY[var5] - var17) * var19 >> 16) << 9) / 50;
				clippedColour[var4++] = var18 + ((faceColourA[arg0] - var18) * var19 >> 16);
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * divTable2[var10 - var9];
				clippedX[var4] = var2 + (var16 + ((vertexViewSpaceX[var7] - var16) * var20 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var17 + ((vertexViewSpaceY[var7] - var17) * var20 >> 16) << 9) / 50;
				clippedColour[var4++] = var18 + ((faceColourC[arg0] - var18) * var20 >> 16);
			}
		}
		if (var10 >= 50) {
			clippedX[var4] = vertexScreenX[var7];
			clippedY[var4] = vertexScreenY[var7];
			clippedColour[var4++] = faceColourC[arg0];
		} else {
			int var21 = vertexViewSpaceX[var7];
			int var22 = vertexViewSpaceY[var7];
			int var23 = faceColourC[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * divTable2[var9 - var10];
				clippedX[var4] = var2 + (var21 + ((vertexViewSpaceX[var6] - var21) * var24 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var22 + ((vertexViewSpaceY[var6] - var22) * var24 >> 16) << 9) / 50;
				clippedColour[var4++] = var23 + ((faceColourB[arg0] - var23) * var24 >> 16);
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * divTable2[var8 - var10];
				clippedX[var4] = var2 + (var21 + ((vertexViewSpaceX[var5] - var21) * var25 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var22 + ((vertexViewSpaceY[var5] - var22) * var25 >> 16) << 9) / 50;
				clippedColour[var4++] = var23 + ((faceColourA[arg0] - var23) * var25 >> 16);
			}
		}
		int var26 = clippedX[0];
		int var27 = clippedX[1];
		int var28 = clippedX[2];
		int var29 = clippedY[0];
		int var30 = clippedY[1];
		int var31 = clippedY[2];
		if ((var26 - var27) * (var31 - var30) - (var29 - var30) * (var28 - var27) > 0) {
			Pix3D.hclip = false;
			if (var4 == 3) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}
				int var32;
				if (faceRenderType == null) {
					var32 = 0;
				} else {
					var32 = faceRenderType[arg0] & 0x3;
				}
				if (var32 == 0) {
					Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
				} else if (var32 == 1) {
					Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, colourTable[faceColourA[arg0]]);
				} else if (var32 == 2) {
					int var33 = faceRenderType[arg0] >> 2;
					int var34 = faceTextureP[var33];
					int var35 = faceTextureM[var33];
					int var36 = faceTextureN[var33];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceX[var36], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceY[var36], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], vertexViewSpaceZ[var36], faceColour[arg0]);
				} else if (var32 == 3) {
					int var37 = faceRenderType[arg0] >> 2;
					int var38 = faceTextureP[var37];
					int var39 = faceTextureM[var37];
					int var40 = faceTextureN[var37];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], faceColour[arg0]);
				}
			}
			if (var4 == 4) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX || clippedX[3] < 0 || clippedX[3] > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}
				int var41;
				if (faceRenderType == null) {
					var41 = 0;
				} else {
					var41 = faceRenderType[arg0] & 0x3;
				}
				if (var41 == 0) {
					Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
					Pix3D.gouraudTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
					return;
				}
				if (var41 == 1) {
					int var42 = colourTable[faceColourA[arg0]];
					Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var42);
					Pix3D.flatTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], var42);
					return;
				}
				if (var41 == 2) {
					int var43 = faceRenderType[arg0] >> 2;
					int var44 = faceTextureP[var43];
					int var45 = faceTextureM[var43];
					int var46 = faceTextureN[var43];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], faceColour[arg0]);
					Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], faceColour[arg0]);
					return;
				}
				if (var41 == 3) {
					int var47 = faceRenderType[arg0] >> 2;
					int var48 = faceTextureP[var47];
					int var49 = faceTextureM[var47];
					int var50 = faceTextureN[var47];
					Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], faceColour[arg0]);
					Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], faceColourA[arg0], faceColourA[arg0], faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], faceColour[arg0]);
				}
			}
		}
	}

	@ObfuscatedName("eb.a(IIIIIIII)Z")
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
}
