package jagex2.graphics;

import deob.*;
import jagex2.dash3d.AnimBase;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.ModelSource;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("fb")
public class Model extends ModelSource {

	@ObfuscatedName("fb.u")
	public static int loaded;

	@ObfuscatedName("fb.v")
	public static Model empty = new Model();

	@ObfuscatedName("fb.w")
	public static int[] tmpVertexX = new int[2000];

	@ObfuscatedName("fb.x")
	public static int[] tmpVertexY = new int[2000];

	@ObfuscatedName("fb.y")
	public static int[] tmpVertexZ = new int[2000];

	@ObfuscatedName("fb.z")
	public static int[] tmpFaceAlpha = new int[2000];

	@ObfuscatedName("fb.ab")
	public int maxDepth;

	@ObfuscatedName("fb.bb")
	public int minDepth;

	@ObfuscatedName("fb.cb")
	public int objRaise;

	@ObfuscatedName("fb.db")
	public int[] vertexLabel;

	@ObfuscatedName("fb.eb")
	public int[] faceLabel;

	@ObfuscatedName("fb.fb")
	public int[][] labelVertices;

	@ObfuscatedName("fb.gb")
	public int[][] labelFaces;

	@ObfuscatedName("fb.hb")
	public boolean picking = false;

	@ObfuscatedName("fb.ib")
	public VertexNormal[] vertexNormalOriginal;

	@ObfuscatedName("fb.jb")
	public static Metadata[] meta;

	@ObfuscatedName("fb.kb")
	public static OnDemandProvider ondemand;

	@ObfuscatedName("fb.lb")
	public static boolean[] faceClippedX = new boolean[4096];

	@ObfuscatedName("fb.mb")
	public static boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("fb.nb")
	public static int[] vertexScreenX = new int[4096];

	@ObfuscatedName("fb.ob")
	public static int[] vertexScreenY = new int[4096];

	@ObfuscatedName("fb.pb")
	public static int[] vertexScreenZ = new int[4096];

	@ObfuscatedName("fb.qb")
	public static int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("fb.rb")
	public static int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("fb.sb")
	public static int[] vertexViewSpaceZ = new int[4096];

	@ObfuscatedName("fb.tb")
	public static int[] tmpDepthFaceCount = new int[1500];

	@ObfuscatedName("fb.ub")
	public static int[][] tmpDepthFaces = new int[1500][512];

	@ObfuscatedName("fb.vb")
	public static int[] tmpPriorityFaceCount = new int[12];

	@ObfuscatedName("fb.wb")
	public static int[][] tmpPriorityFaces = new int[12][2000];

	@ObfuscatedName("fb.xb")
	public static int[] tmpPriority10FaceDepth = new int[2000];

	@ObfuscatedName("fb.yb")
	public static int[] tmpPriority11FaceDepth = new int[2000];

	@ObfuscatedName("fb.zb")
	public static int[] tmpPriorityDepthSum = new int[12];

	@ObfuscatedName("fb.A")
	public int vertexCount;

	@ObfuscatedName("fb.E")
	public int faceCount;

	@ObfuscatedName("fb.Q")
	public int texturedFaceCount;

	@ObfuscatedName("fb.B")
	public int[] vertexX;

	@ObfuscatedName("fb.C")
	public int[] vertexY;

	@ObfuscatedName("fb.D")
	public int[] vertexZ;

	@ObfuscatedName("fb.F")
	public int[] faceVertexA;

	@ObfuscatedName("fb.G")
	public int[] faceVertexB;

	@ObfuscatedName("fb.H")
	public int[] faceVertexC;

	@ObfuscatedName("fb.R")
	public int[] texturedVertexA;

	@ObfuscatedName("fb.S")
	public int[] texturedVertexB;

	@ObfuscatedName("fb.T")
	public int[] texturedVertexC;

	@ObfuscatedName("fb.L")
	public int[] faceInfo;

	@ObfuscatedName("fb.M")
	public int[] facePriority;

	@ObfuscatedName("fb.P")
	public int priority;

	@ObfuscatedName("fb.N")
	public int[] faceAlpha;

	@ObfuscatedName("fb.O")
	public int[] faceColour;

	@ObfuscatedName("fb.I")
	public int[] faceColourA;

	@ObfuscatedName("fb.J")
	public int[] faceColourB;

	@ObfuscatedName("fb.K")
	public int[] faceColourC;

	@ObfuscatedName("fb.Z")
	public int maxY;

	@ObfuscatedName("fb.Y")
	public int radius;

	@ObfuscatedName("fb.U")
	public int minX;

	@ObfuscatedName("fb.W")
	public int maxZ;

	@ObfuscatedName("fb.X")
	public int minZ;

	@ObfuscatedName("fb.V")
	public int maxX;

	@ObfuscatedName("fb.Ab")
	public static int[] clippedX = new int[10];

	@ObfuscatedName("fb.Bb")
	public static int[] clippedY = new int[10];

	@ObfuscatedName("fb.Cb")
	public static int[] clippedColour = new int[10];

	@ObfuscatedName("fb.Kb")
	public static int[] pickedBitsets = new int[1000];

	@ObfuscatedName("fb.Lb")
	public static int[] sinTable = Pix3D.sinTable;

	@ObfuscatedName("fb.Mb")
	public static int[] cosTable = Pix3D.cosTable;

	@ObfuscatedName("fb.Nb")
	public static int[] palette = Pix3D.palette;

	@ObfuscatedName("fb.Ob")
	public static int[] divTable2 = Pix3D.divTable2;

	@ObfuscatedName("fb.Db")
	public static int baseX;

	@ObfuscatedName("fb.Eb")
	public static int baseY;

	@ObfuscatedName("fb.Fb")
	public static int baseZ;

	@ObfuscatedName("fb.Hb")
	public static int mouseX;

	@ObfuscatedName("fb.Ib")
	public static int mouseY;

	@ObfuscatedName("fb.Jb")
	public static int pickedCount;

	@ObfuscatedName("fb.Gb")
	public static boolean checkHover;

	@ObfuscatedName("fb.a(B)V")
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
		palette = null;
		divTable2 = null;
	}

	@ObfuscatedName("fb.a(ILub;)V")
	public static void init(int arg0, OnDemandProvider arg1) {
		meta = new Metadata[arg0];
		ondemand = arg1;
	}

	@ObfuscatedName("fb.a(IZ[B)V")
	public static void unpack(int arg0, byte[] arg2) {
		if (arg2 == null) {
			Metadata var3 = meta[arg0] = new Metadata();
			var3.vertexCount = 0;
			var3.faceCount = 0;
			var3.texturedFaceCount = 0;
			return;
		}
		Packet var4 = new Packet(arg2);
		var4.pos = arg2.length - 18;
		Metadata var5 = meta[arg0] = new Metadata();
		var5.data = arg2;
		var5.vertexCount = var4.g2();
		var5.faceCount = var4.g2();
		var5.texturedFaceCount = var4.g1();
		int var6 = var4.g1();
		int var7 = var4.g1();
		int var8 = var4.g1();
		int var9 = var4.g1();
		int var10 = var4.g1();
		int var11 = var4.g2();
		int var12 = var4.g2();
		int var13 = var4.g2();
		int var14 = var4.g2();
		byte var15 = 0;
		var5.vertexFlagsOffset = var15;
		int var16 = var5.vertexCount + var15;
		var5.faceOrientationsOffset = var16;
		int var17 = var5.faceCount + var16;
		var5.facePrioritiesOffset = var17;
		if (var7 == 255) {
			var17 += var5.faceCount;
		} else {
			var5.facePrioritiesOffset = -var7 - 1;
		}
		var5.faceLabelsOffset = var17;
		if (var9 == 1) {
			var17 += var5.faceCount;
		} else {
			var5.faceLabelsOffset = -1;
		}
		var5.faceInfosOffset = var17;
		if (var6 == 1) {
			var17 += var5.faceCount;
		} else {
			var5.faceInfosOffset = -1;
		}
		var5.vertexLabelsOffset = var17;
		if (var10 == 1) {
			var17 += var5.vertexCount;
		} else {
			var5.vertexLabelsOffset = -1;
		}
		var5.faceAlphasOffset = var17;
		if (var8 == 1) {
			var17 += var5.faceCount;
		} else {
			var5.faceAlphasOffset = -1;
		}
		var5.faceVerticesOffset = var17;
		int var18 = var14 + var17;
		var5.faceColorsOffset = var18;
		int var19 = var5.faceCount * 2 + var18;
		var5.faceTextureAxisOffset = var19;
		int var20 = var5.texturedFaceCount * 6 + var19;
		var5.vertexXOffset = var20;
		int var21 = var11 + var20;
		var5.vertexYOffset = var21;
		int var22 = var12 + var21;
		var5.vertexZOffset = var22;
		int var10000 = var13 + var22;
	}

	@ObfuscatedName("fb.a(II)V")
	public static void unload(int arg1) {
		meta[arg1] = null;
	}

	@ObfuscatedName("fb.b(II)Lfb;")
	public static Model tryGet(int arg0) {
		if (meta == null) {
			return null;
		}
		Metadata var2 = meta[arg0];
		if (var2 == null) {
			ondemand.requestModel(arg0);
			return null;
		} else {
			return new Model(arg0);
		}
	}

	@ObfuscatedName("fb.b(I)Z")
	public static boolean validate(int arg0) {
		if (meta == null) {
			return false;
		}
		Metadata var1 = meta[arg0];
		if (var1 == null) {
			ondemand.requestModel(arg0);
			return false;
		} else {
			return true;
		}
	}

	public Model() {
	}

	public Model(int arg0) {
		loaded++;
		Metadata var3 = meta[arg0];
		this.vertexCount = var3.vertexCount;
		this.faceCount = var3.faceCount;
		this.texturedFaceCount = var3.texturedFaceCount;
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.faceVertexA = new int[this.faceCount];
		this.faceVertexB = new int[this.faceCount];
		this.faceVertexC = new int[this.faceCount];
		this.texturedVertexA = new int[this.texturedFaceCount];
		this.texturedVertexB = new int[this.texturedFaceCount];
		this.texturedVertexC = new int[this.texturedFaceCount];
		if (var3.vertexLabelsOffset >= 0) {
			this.vertexLabel = new int[this.vertexCount];
		}
		if (var3.faceInfosOffset >= 0) {
			this.faceInfo = new int[this.faceCount];
		}
		if (var3.facePrioritiesOffset >= 0) {
			this.facePriority = new int[this.faceCount];
		} else {
			this.priority = -var3.facePrioritiesOffset - 1;
		}
		if (var3.faceAlphasOffset >= 0) {
			this.faceAlpha = new int[this.faceCount];
		}
		if (var3.faceLabelsOffset >= 0) {
			this.faceLabel = new int[this.faceCount];
		}
		this.faceColour = new int[this.faceCount];
		Packet var4 = new Packet(var3.data);
		var4.pos = var3.vertexFlagsOffset;
		Packet var5 = new Packet(var3.data);
		var5.pos = var3.vertexXOffset;
		Packet var6 = new Packet(var3.data);
		var6.pos = var3.vertexYOffset;
		Packet var7 = new Packet(var3.data);
		var7.pos = var3.vertexZOffset;
		Packet var8 = new Packet(var3.data);
		var8.pos = var3.vertexLabelsOffset;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < this.vertexCount; var12++) {
			int var24 = var4.g1();
			int var25 = 0;
			if ((var24 & 0x1) != 0) {
				var25 = var5.gsmart();
			}
			int var26 = 0;
			if ((var24 & 0x2) != 0) {
				var26 = var6.gsmart();
			}
			int var27 = 0;
			if ((var24 & 0x4) != 0) {
				var27 = var7.gsmart();
			}
			this.vertexX[var12] = var9 + var25;
			this.vertexY[var12] = var10 + var26;
			this.vertexZ[var12] = var11 + var27;
			var9 = this.vertexX[var12];
			var10 = this.vertexY[var12];
			var11 = this.vertexZ[var12];
			if (this.vertexLabel != null) {
				this.vertexLabel[var12] = var8.g1();
			}
		}
		var4.pos = var3.faceColorsOffset;
		var5.pos = var3.faceInfosOffset;
		var6.pos = var3.facePrioritiesOffset;
		var7.pos = var3.faceAlphasOffset;
		var8.pos = var3.faceLabelsOffset;
		for (int var13 = 0; var13 < this.faceCount; var13++) {
			this.faceColour[var13] = var4.g2();
			if (this.faceInfo != null) {
				this.faceInfo[var13] = var5.g1();
			}
			if (this.facePriority != null) {
				this.facePriority[var13] = var6.g1();
			}
			if (this.faceAlpha != null) {
				this.faceAlpha[var13] = var7.g1();
			}
			if (this.faceLabel != null) {
				this.faceLabel[var13] = var8.g1();
			}
		}
		var4.pos = var3.faceVerticesOffset;
		var5.pos = var3.faceOrientationsOffset;
		int var14 = 0;
		int var15 = 0;
		int var16 = 0;
		int var17 = 0;
		for (int var18 = 0; var18 < this.faceCount; var18++) {
			int var20 = var5.g1();
			if (var20 == 1) {
				var14 = var4.gsmart() + var17;
				var15 = var4.gsmart() + var14;
				var16 = var4.gsmart() + var15;
				var17 = var16;
				this.faceVertexA[var18] = var14;
				this.faceVertexB[var18] = var15;
				this.faceVertexC[var18] = var16;
			}
			if (var20 == 2) {
				var14 = var14;
				var15 = var16;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.faceVertexA[var18] = var14;
				this.faceVertexB[var18] = var15;
				this.faceVertexC[var18] = var16;
			}
			if (var20 == 3) {
				var14 = var16;
				var15 = var15;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.faceVertexA[var18] = var14;
				this.faceVertexB[var18] = var15;
				this.faceVertexC[var18] = var16;
			}
			if (var20 == 4) {
				int var23 = var14;
				var14 = var15;
				var15 = var23;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.faceVertexA[var18] = var14;
				this.faceVertexB[var18] = var23;
				this.faceVertexC[var18] = var16;
			}
		}
		var4.pos = var3.faceTextureAxisOffset;
		for (int var19 = 0; var19 < this.texturedFaceCount; var19++) {
			this.texturedVertexA[var19] = var4.g2();
			this.texturedVertexB[var19] = var4.g2();
			this.texturedVertexC[var19] = var4.g2();
		}
	}

	public Model(int arg0, Model[] arg2) {
		loaded++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.vertexCount = 0;
		this.faceCount = 0;
		this.texturedFaceCount = 0;
		this.priority = -1;
		for (int var8 = 0; var8 < arg0; var8++) {
			Model var13 = arg2[var8];
			if (var13 != null) {
				this.vertexCount += var13.vertexCount;
				this.faceCount += var13.faceCount;
				this.texturedFaceCount += var13.texturedFaceCount;
				var4 |= var13.faceInfo != null;
				if (var13.facePriority == null) {
					if (this.priority == -1) {
						this.priority = var13.priority;
					}
					if (this.priority != var13.priority) {
						var5 = true;
					}
				} else {
					var5 = true;
				}
				var6 |= var13.faceAlpha != null;
				var7 |= var13.faceLabel != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.vertexLabel = new int[this.vertexCount];
		this.faceVertexA = new int[this.faceCount];
		this.faceVertexB = new int[this.faceCount];
		this.faceVertexC = new int[this.faceCount];
		this.texturedVertexA = new int[this.texturedFaceCount];
		this.texturedVertexB = new int[this.texturedFaceCount];
		this.texturedVertexC = new int[this.texturedFaceCount];
		if (var4) {
			this.faceInfo = new int[this.faceCount];
		}
		if (var5) {
			this.facePriority = new int[this.faceCount];
		}
		if (var6) {
			this.faceAlpha = new int[this.faceCount];
		}
		if (var7) {
			this.faceLabel = new int[this.faceCount];
		}
		this.faceColour = new int[this.faceCount];
		this.vertexCount = 0;
		this.faceCount = 0;
		this.texturedFaceCount = 0;
		for (int var9 = 0; var9 < arg0; var9++) {
			Model var10 = arg2[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < var10.faceCount; var11++) {
					if (var4) {
						if (var10.faceInfo == null) {
							this.faceInfo[this.faceCount] = 0;
						} else {
							this.faceInfo[this.faceCount] = var10.faceInfo[var11];
						}
					}
					if (var5) {
						if (var10.facePriority == null) {
							this.facePriority[this.faceCount] = var10.priority;
						} else {
							this.facePriority[this.faceCount] = var10.facePriority[var11];
						}
					}
					if (var6) {
						if (var10.faceAlpha == null) {
							this.faceAlpha[this.faceCount] = 0;
						} else {
							this.faceAlpha[this.faceCount] = var10.faceAlpha[var11];
						}
					}
					if (var7 && var10.faceLabel != null) {
						this.faceLabel[this.faceCount] = var10.faceLabel[var11];
					}
					this.faceColour[this.faceCount] = var10.faceColour[var11];
					this.faceVertexA[this.faceCount] = this.addVertex(var10, var10.faceVertexA[var11]);
					this.faceVertexB[this.faceCount] = this.addVertex(var10, var10.faceVertexB[var11]);
					this.faceVertexC[this.faceCount] = this.addVertex(var10, var10.faceVertexC[var11]);
					this.faceCount++;
				}
				for (int var12 = 0; var12 < var10.texturedFaceCount; var12++) {
					this.texturedVertexA[this.texturedFaceCount] = this.addVertex(var10, var10.texturedVertexA[var12]);
					this.texturedVertexB[this.texturedFaceCount] = this.addVertex(var10, var10.texturedVertexB[var12]);
					this.texturedVertexC[this.texturedFaceCount] = this.addVertex(var10, var10.texturedVertexC[var12]);
					this.texturedFaceCount++;
				}
			}
		}
	}

	public Model(boolean arg1, int arg2, Model[] arg3) {
		loaded++;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.vertexCount = 0;
		this.faceCount = 0;
		this.texturedFaceCount = 0;
		this.priority = -1;
		for (int var9 = 0; var9 < arg2; var9++) {
			Model var16 = arg3[var9];
			if (var16 != null) {
				this.vertexCount += var16.vertexCount;
				this.faceCount += var16.faceCount;
				this.texturedFaceCount += var16.texturedFaceCount;
				var5 |= var16.faceInfo != null;
				if (var16.facePriority == null) {
					if (this.priority == -1) {
						this.priority = var16.priority;
					}
					if (this.priority != var16.priority) {
						var6 = true;
					}
				} else {
					var6 = true;
				}
				var7 |= var16.faceAlpha != null;
				var8 |= var16.faceColour != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.faceVertexA = new int[this.faceCount];
		this.faceVertexB = new int[this.faceCount];
		this.faceVertexC = new int[this.faceCount];
		this.faceColourA = new int[this.faceCount];
		this.faceColourB = new int[this.faceCount];
		this.faceColourC = new int[this.faceCount];
		this.texturedVertexA = new int[this.texturedFaceCount];
		this.texturedVertexB = new int[this.texturedFaceCount];
		this.texturedVertexC = new int[this.texturedFaceCount];
		if (var5) {
			this.faceInfo = new int[this.faceCount];
		}
		if (var6) {
			this.facePriority = new int[this.faceCount];
		}
		if (var7) {
			this.faceAlpha = new int[this.faceCount];
		}
		if (var8) {
			this.faceColour = new int[this.faceCount];
		}
		this.vertexCount = 0;
		this.faceCount = 0;
		this.texturedFaceCount = 0;
		for (int var10 = 0; var10 < arg2; var10++) {
			Model var11 = arg3[var10];
			if (var11 != null) {
				int var12 = this.vertexCount;
				for (int var13 = 0; var13 < var11.vertexCount; var13++) {
					this.vertexX[this.vertexCount] = var11.vertexX[var13];
					this.vertexY[this.vertexCount] = var11.vertexY[var13];
					this.vertexZ[this.vertexCount] = var11.vertexZ[var13];
					this.vertexCount++;
				}
				for (int var14 = 0; var14 < var11.faceCount; var14++) {
					this.faceVertexA[this.faceCount] = var11.faceVertexA[var14] + var12;
					this.faceVertexB[this.faceCount] = var11.faceVertexB[var14] + var12;
					this.faceVertexC[this.faceCount] = var11.faceVertexC[var14] + var12;
					this.faceColourA[this.faceCount] = var11.faceColourA[var14];
					this.faceColourB[this.faceCount] = var11.faceColourB[var14];
					this.faceColourC[this.faceCount] = var11.faceColourC[var14];
					if (var5) {
						if (var11.faceInfo == null) {
							this.faceInfo[this.faceCount] = 0;
						} else {
							this.faceInfo[this.faceCount] = var11.faceInfo[var14];
						}
					}
					if (var6) {
						if (var11.facePriority == null) {
							this.facePriority[this.faceCount] = var11.priority;
						} else {
							this.facePriority[this.faceCount] = var11.facePriority[var14];
						}
					}
					if (var7) {
						if (var11.faceAlpha == null) {
							this.faceAlpha[this.faceCount] = 0;
						} else {
							this.faceAlpha[this.faceCount] = var11.faceAlpha[var14];
						}
					}
					if (var8 && var11.faceColour != null) {
						this.faceColour[this.faceCount] = var11.faceColour[var14];
					}
					this.faceCount++;
				}
				for (int var15 = 0; var15 < var11.texturedFaceCount; var15++) {
					this.texturedVertexA[this.texturedFaceCount] = var11.texturedVertexA[var15] + var12;
					this.texturedVertexB[this.texturedFaceCount] = var11.texturedVertexB[var15] + var12;
					this.texturedVertexC[this.texturedFaceCount] = var11.texturedVertexC[var15] + var12;
					this.texturedFaceCount++;
				}
			}
		}
		this.calculateBoundsCylinder();
	}

	public Model(Model arg0, boolean arg1, boolean arg2, boolean arg3) {
		loaded++;
		this.vertexCount = arg0.vertexCount;
		this.faceCount = arg0.faceCount;
		this.texturedFaceCount = arg0.texturedFaceCount;
		if (arg2) {
			this.vertexX = arg0.vertexX;
			this.vertexY = arg0.vertexY;
			this.vertexZ = arg0.vertexZ;
		} else {
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];
			for (int var6 = 0; var6 < this.vertexCount; var6++) {
				this.vertexX[var6] = arg0.vertexX[var6];
				this.vertexY[var6] = arg0.vertexY[var6];
				this.vertexZ[var6] = arg0.vertexZ[var6];
			}
		}
		if (arg1) {
			this.faceColour = arg0.faceColour;
		} else {
			this.faceColour = new int[this.faceCount];
			for (int var7 = 0; var7 < this.faceCount; var7++) {
				this.faceColour[var7] = arg0.faceColour[var7];
			}
		}
		if (arg3) {
			this.faceAlpha = arg0.faceAlpha;
		} else {
			this.faceAlpha = new int[this.faceCount];
			if (arg0.faceAlpha == null) {
				for (int var8 = 0; var8 < this.faceCount; var8++) {
					this.faceAlpha[var8] = 0;
				}
			} else {
				for (int var9 = 0; var9 < this.faceCount; var9++) {
					this.faceAlpha[var9] = arg0.faceAlpha[var9];
				}
			}
		}
		this.vertexLabel = arg0.vertexLabel;
		this.faceLabel = arg0.faceLabel;
		this.faceInfo = arg0.faceInfo;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.facePriority = arg0.facePriority;
		this.priority = arg0.priority;
		this.texturedVertexA = arg0.texturedVertexA;
		this.texturedVertexB = arg0.texturedVertexB;
		this.texturedVertexC = arg0.texturedVertexC;
	}

	public Model(boolean arg1, boolean arg2, Model arg3) {
		loaded++;
		this.vertexCount = arg3.vertexCount;
		this.faceCount = arg3.faceCount;
		this.texturedFaceCount = arg3.texturedFaceCount;
		if (arg2) {
			this.vertexY = new int[this.vertexCount];
			for (int var5 = 0; var5 < this.vertexCount; var5++) {
				this.vertexY[var5] = arg3.vertexY[var5];
			}
		} else {
			this.vertexY = arg3.vertexY;
		}
		if (arg1) {
			this.faceColourA = new int[this.faceCount];
			this.faceColourB = new int[this.faceCount];
			this.faceColourC = new int[this.faceCount];
			for (int var6 = 0; var6 < this.faceCount; var6++) {
				this.faceColourA[var6] = arg3.faceColourA[var6];
				this.faceColourB[var6] = arg3.faceColourB[var6];
				this.faceColourC[var6] = arg3.faceColourC[var6];
			}
			this.faceInfo = new int[this.faceCount];
			if (arg3.faceInfo == null) {
				for (int var7 = 0; var7 < this.faceCount; var7++) {
					this.faceInfo[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < this.faceCount; var8++) {
					this.faceInfo[var8] = arg3.faceInfo[var8];
				}
			}
			super.vertexNormal = new VertexNormal[this.vertexCount];
			for (int var9 = 0; var9 < this.vertexCount; var9++) {
				VertexNormal var10 = super.vertexNormal[var9] = new VertexNormal();
				VertexNormal var11 = arg3.vertexNormal[var9];
				var10.x = var11.x;
				var10.y = var11.y;
				var10.z = var11.z;
				var10.w = var11.w;
			}
			this.vertexNormalOriginal = arg3.vertexNormalOriginal;
		} else {
			this.faceColourA = arg3.faceColourA;
			this.faceColourB = arg3.faceColourB;
			this.faceColourC = arg3.faceColourC;
			this.faceInfo = arg3.faceInfo;
		}
		this.vertexX = arg3.vertexX;
		this.vertexZ = arg3.vertexZ;
		this.faceColour = arg3.faceColour;
		this.faceAlpha = arg3.faceAlpha;
		this.facePriority = arg3.facePriority;
		this.priority = arg3.priority;
		this.faceVertexA = arg3.faceVertexA;
		this.faceVertexB = arg3.faceVertexB;
		this.faceVertexC = arg3.faceVertexC;
		this.texturedVertexA = arg3.texturedVertexA;
		this.texturedVertexB = arg3.texturedVertexB;
		this.texturedVertexC = arg3.texturedVertexC;
		super.minY = arg3.minY;
		this.maxY = arg3.maxY;
		this.radius = arg3.radius;
		this.minDepth = arg3.minDepth;
		this.maxDepth = arg3.maxDepth;
		this.minX = arg3.minX;
		this.maxZ = arg3.maxZ;
		this.minZ = arg3.minZ;
		this.maxX = arg3.maxX;
	}

	@ObfuscatedName("fb.a(ZLfb;Z)V")
	public void set(boolean arg0, Model arg1) {
		this.vertexCount = arg1.vertexCount;
		this.faceCount = arg1.faceCount;
		this.texturedFaceCount = arg1.texturedFaceCount;
		if (tmpVertexX.length < this.vertexCount) {
			tmpVertexX = new int[this.vertexCount + 100];
			tmpVertexY = new int[this.vertexCount + 100];
			tmpVertexZ = new int[this.vertexCount + 100];
		}
		this.vertexX = tmpVertexX;
		this.vertexY = tmpVertexY;
		this.vertexZ = tmpVertexZ;
		for (int var4 = 0; var4 < this.vertexCount; var4++) {
			this.vertexX[var4] = arg1.vertexX[var4];
			this.vertexY[var4] = arg1.vertexY[var4];
			this.vertexZ[var4] = arg1.vertexZ[var4];
		}
		if (arg0) {
			this.faceAlpha = arg1.faceAlpha;
		} else {
			if (tmpFaceAlpha.length < this.faceCount) {
				tmpFaceAlpha = new int[this.faceCount + 100];
			}
			this.faceAlpha = tmpFaceAlpha;
			if (arg1.faceAlpha == null) {
				for (int var5 = 0; var5 < this.faceCount; var5++) {
					this.faceAlpha[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.faceCount; var6++) {
					this.faceAlpha[var6] = arg1.faceAlpha[var6];
				}
			}
		}
		this.faceInfo = arg1.faceInfo;
		this.faceColour = arg1.faceColour;
		this.facePriority = arg1.facePriority;
		this.priority = arg1.priority;
		this.labelFaces = arg1.labelFaces;
		this.labelVertices = arg1.labelVertices;
		this.faceVertexA = arg1.faceVertexA;
		this.faceVertexB = arg1.faceVertexB;
		this.faceVertexC = arg1.faceVertexC;
		this.faceColourA = arg1.faceColourA;
		this.faceColourB = arg1.faceColourB;
		this.faceColourC = arg1.faceColourC;
		this.texturedVertexA = arg1.texturedVertexA;
		this.texturedVertexB = arg1.texturedVertexB;
		this.texturedVertexC = arg1.texturedVertexC;
	}

	@ObfuscatedName("fb.a(Lfb;I)I")
	public final int addVertex(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.vertexX[arg1];
		int var5 = arg0.vertexY[arg1];
		int var6 = arg0.vertexZ[arg1];
		for (int var7 = 0; var7 < this.vertexCount; var7++) {
			if (this.vertexX[var7] == var4 && this.vertexY[var7] == var5 && this.vertexZ[var7] == var6) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.vertexX[this.vertexCount] = var4;
			this.vertexY[this.vertexCount] = var5;
			this.vertexZ[this.vertexCount] = var6;
			if (arg0.vertexLabel != null) {
				this.vertexLabel[this.vertexCount] = arg0.vertexLabel[arg1];
			}
			var3 = this.vertexCount++;
		}
		return var3;
	}

	@ObfuscatedName("fb.a(Z)V")
	public void calculateBoundsCylinder() {
		super.minY = 0;
		this.radius = 0;
		this.maxY = 0;
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var3 = this.vertexX[var2];
			int var4 = this.vertexY[var2];
			int var5 = this.vertexZ[var2];
			if (-var4 > super.minY) {
				super.minY = -var4;
			}
			if (var4 > this.maxY) {
				this.maxY = var4;
			}
			int var6 = var3 * var3 + var5 * var5;
			if (var6 > this.radius) {
				this.radius = var6;
			}
		}
		this.radius = (int) (Math.sqrt((double) this.radius) + 0.99D);
		this.minDepth = (int) (Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY)) + 0.99D);
		this.maxDepth = this.minDepth + (int) (Math.sqrt((double) (this.maxY * this.maxY + this.radius * this.radius)) + 0.99D);
	}

	@ObfuscatedName("fb.b(B)V")
	public void calculateBoundsY() {
		super.minY = 0;
		this.maxY = 0;
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var4 = this.vertexY[var2];
			if (-var4 > super.minY) {
				super.minY = -var4;
			}
			if (var4 > this.maxY) {
				this.maxY = var4;
			}
		}
		this.minDepth = (int) (Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY)) + 0.99D);
		this.maxDepth = this.minDepth + (int) (Math.sqrt((double) (this.maxY * this.maxY + this.radius * this.radius)) + 0.99D);
	}

	@ObfuscatedName("fb.c(I)V")
	public void calculateBoundsAABB() {
		super.minY = 0;
		this.radius = 0;
		this.maxY = 0;
		this.minX = 999999;
		this.maxX = -999999;
		this.maxZ = -99999;
		this.minZ = 99999;
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var3 = this.vertexX[var2];
			int var4 = this.vertexY[var2];
			int var5 = this.vertexZ[var2];
			if (var3 < this.minX) {
				this.minX = var3;
			}
			if (var3 > this.maxX) {
				this.maxX = var3;
			}
			if (var5 < this.minZ) {
				this.minZ = var5;
			}
			if (var5 > this.maxZ) {
				this.maxZ = var5;
			}
			if (-var4 > super.minY) {
				super.minY = -var4;
			}
			if (var4 > this.maxY) {
				this.maxY = var4;
			}
			int var6 = var3 * var3 + var5 * var5;
			if (var6 > this.radius) {
				this.radius = var6;
			}
		}
		this.radius = (int) Math.sqrt((double) this.radius);
		this.minDepth = (int) Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY));
		this.maxDepth = this.minDepth + (int) Math.sqrt((double) (this.maxY * this.maxY + this.radius * this.radius));
	}

	@ObfuscatedName("fb.d(I)V")
	public void createLabelReferences() {
		int var10002;
		if (this.vertexLabel != null) {
			int[] var2 = new int[256];
			int var3 = 0;
			for (int var4 = 0; var4 < this.vertexCount; var4++) {
				int var8 = this.vertexLabel[var4];
				var10002 = var2[var8]++;
				if (var8 > var3) {
					var3 = var8;
				}
			}
			this.labelVertices = new int[var3 + 1][];
			for (int var5 = 0; var5 <= var3; var5++) {
				this.labelVertices[var5] = new int[var2[var5]];
				var2[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.vertexCount) {
				int var7 = this.vertexLabel[var6];
				this.labelVertices[var7][var2[var7]++] = var6++;
			}
			this.vertexLabel = null;
		}
		if (this.faceLabel == null) {
			return;
		}
		int[] var9 = new int[256];
		int var10 = 0;
		for (int var11 = 0; var11 < this.faceCount; var11++) {
			int var15 = this.faceLabel[var11];
			var10002 = var9[var15]++;
			if (var15 > var10) {
				var10 = var15;
			}
		}
		this.labelFaces = new int[var10 + 1][];
		for (int var12 = 0; var12 <= var10; var12++) {
			this.labelFaces[var12] = new int[var9[var12]];
			var9[var12] = 0;
		}
		int var13 = 0;
		while (var13 < this.faceCount) {
			int var14 = this.faceLabel[var13];
			this.labelFaces[var14][var9[var14]++] = var13++;
		}
		this.faceLabel = null;
	}

	@ObfuscatedName("fb.c(II)V")
	public void applyTransform(int arg0) {
		if (this.labelVertices == null || arg0 == -1) {
			return;
		}
		AnimFrame var3 = AnimFrame.get(arg0);
		if (var3 == null) {
			return;
		}
		AnimBase var4 = var3.base;
		baseX = 0;
		baseY = 0;
		baseZ = 0;
		for (int var5 = 0; var5 < var3.length; var5++) {
			int var6 = var3.groups[var5];
			this.applyTransform(var4.types[var6], var4.labels[var6], var3.x[var5], var3.y[var5], var3.z[var5]);
		}
	}

	@ObfuscatedName("fb.a(BII[I)V")
	public void applyTransforms(int arg1, int arg2, int[] arg3) {
		if (arg1 == -1) {
			return;
		}
		if (arg3 == null || arg2 == -1) {
			this.applyTransform(arg1);
			return;
		}
		AnimFrame var5 = AnimFrame.get(arg1);
		if (var5 == null) {
			return;
		}
		AnimFrame var6 = AnimFrame.get(arg2);
		if (var6 == null) {
			this.applyTransform(arg1);
			return;
		}
		AnimBase var7 = var5.base;
		baseX = 0;
		baseY = 0;
		baseZ = 0;
		byte var8 = 0;
		int var16 = var8 + 1;
		int var9 = arg3[var8];
		for (int var10 = 0; var10 < var5.length; var10++) {
			int var15 = var5.groups[var10];
			while (var15 > var9) {
				var9 = arg3[var16++];
			}
			if (var9 != var15 || var7.types[var15] == 0) {
				this.applyTransform(var7.types[var15], var7.labels[var15], var5.x[var10], var5.y[var10], var5.z[var10]);
			}
		}
		baseX = 0;
		baseY = 0;
		baseZ = 0;
		byte var11 = 0;
		int var17 = var11 + 1;
		int var12 = arg3[var11];
		for (int var13 = 0; var13 < var6.length; var13++) {
			int var14 = var6.groups[var13];
			while (var14 > var12) {
				var12 = arg3[var17++];
			}
			if (var12 == var14 || var7.types[var14] == 0) {
				this.applyTransform(var7.types[var14], var7.labels[var14], var6.x[var13], var6.y[var13], var6.z[var13]);
			}
		}
	}

	@ObfuscatedName("fb.a(I[IIII)V")
	public void applyTransform(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			baseX = 0;
			baseY = 0;
			baseZ = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.labelVertices.length) {
					int[] var10 = this.labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						baseX += this.vertexX[var12];
						baseY += this.vertexY[var12];
						baseZ += this.vertexZ[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				baseX = baseX / var7 + arg2;
				baseY = baseY / var7 + arg3;
				baseZ = baseZ / var7 + arg4;
			} else {
				baseX = arg2;
				baseY = arg3;
				baseZ = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.labelVertices.length) {
					int[] var15 = this.labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.vertexX[var17] += arg2;
						this.vertexY[var17] += arg3;
						this.vertexZ[var17] += arg4;
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
						this.vertexX[var22] -= baseX;
						this.vertexY[var22] -= baseY;
						this.vertexZ[var22] -= baseZ;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = sinTable[var25];
							int var27 = cosTable[var25];
							int var28 = this.vertexY[var22] * var26 + this.vertexX[var22] * var27 >> 16;
							this.vertexY[var22] = this.vertexY[var22] * var27 - this.vertexX[var22] * var26 >> 16;
							this.vertexX[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = sinTable[var23];
							int var30 = cosTable[var23];
							int var31 = this.vertexY[var22] * var30 - this.vertexZ[var22] * var29 >> 16;
							this.vertexZ[var22] = this.vertexZ[var22] * var30 + this.vertexY[var22] * var29 >> 16;
							this.vertexY[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = sinTable[var24];
							int var33 = cosTable[var24];
							int var34 = this.vertexZ[var22] * var32 + this.vertexX[var22] * var33 >> 16;
							this.vertexZ[var22] = this.vertexZ[var22] * var33 - this.vertexX[var22] * var32 >> 16;
							this.vertexX[var22] = var34;
						}
						this.vertexX[var22] += baseX;
						this.vertexY[var22] += baseY;
						this.vertexZ[var22] += baseZ;
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
						this.vertexX[var39] -= baseX;
						this.vertexY[var39] -= baseY;
						this.vertexZ[var39] -= baseZ;
						this.vertexX[var39] = this.vertexX[var39] * arg2 / 128;
						this.vertexY[var39] = this.vertexY[var39] * arg3 / 128;
						this.vertexZ[var39] = this.vertexZ[var39] * arg4 / 128;
						this.vertexX[var39] += baseX;
						this.vertexY[var39] += baseY;
						this.vertexZ[var39] += baseZ;
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

	@ObfuscatedName("fb.c(B)V")
	public void rotateY90() {
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var3 = this.vertexX[var2];
			this.vertexX[var2] = this.vertexZ[var2];
			this.vertexZ[var2] = -var3;
		}
	}

	@ObfuscatedName("fb.d(II)V")
	public void rotateX(int arg1) {
		int var3 = sinTable[arg1];
		int var4 = cosTable[arg1];
		for (int var5 = 0; var5 < this.vertexCount; var5++) {
			int var6 = this.vertexY[var5] * var4 - this.vertexZ[var5] * var3 >> 16;
			this.vertexZ[var5] = this.vertexZ[var5] * var4 + this.vertexY[var5] * var3 >> 16;
			this.vertexY[var5] = var6;
		}
	}

	@ObfuscatedName("fb.a(IIIZ)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var5 = 0; var5 < this.vertexCount; var5++) {
			this.vertexX[var5] += arg1;
			this.vertexY[var5] += arg0;
			this.vertexZ[var5] += arg2;
		}
	}

	@ObfuscatedName("fb.e(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.faceCount; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("fb.e(I)V")
	public void rotateY180() {
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			this.vertexZ[var2] = -this.vertexZ[var2];
		}
		for (int var3 = 0; var3 < this.faceCount; var3++) {
			int var4 = this.faceVertexA[var3];
			this.faceVertexA[var3] = this.faceVertexC[var3];
			this.faceVertexC[var3] = var4;
		}
	}

	@ObfuscatedName("fb.a(IIII)V")
	public void scale(int arg0, int arg1, int arg3) {
		for (int var5 = 0; var5 < this.vertexCount; var5++) {
			this.vertexX[var5] = this.vertexX[var5] * arg3 / 128;
			this.vertexY[var5] = this.vertexY[var5] * arg0 / 128;
			this.vertexZ[var5] = this.vertexZ[var5] * arg1 / 128;
		}
	}

	@ObfuscatedName("fb.a(IIIIIZ)V")
	public final void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
		int var8 = arg1 * var7 >> 8;
		if (this.faceColourA == null) {
			this.faceColourA = new int[this.faceCount];
			this.faceColourB = new int[this.faceCount];
			this.faceColourC = new int[this.faceCount];
		}
		if (super.vertexNormal == null) {
			super.vertexNormal = new VertexNormal[this.vertexCount];
			for (int var9 = 0; var9 < this.vertexCount; var9++) {
				super.vertexNormal[var9] = new VertexNormal();
			}
		}
		for (int var10 = 0; var10 < this.faceCount; var10++) {
			int var14 = this.faceVertexA[var10];
			int var15 = this.faceVertexB[var10];
			int var16 = this.faceVertexC[var10];
			int var17 = this.vertexX[var15] - this.vertexX[var14];
			int var18 = this.vertexY[var15] - this.vertexY[var14];
			int var19 = this.vertexZ[var15] - this.vertexZ[var14];
			int var20 = this.vertexX[var16] - this.vertexX[var14];
			int var21 = this.vertexY[var16] - this.vertexY[var14];
			int var22 = this.vertexZ[var16] - this.vertexZ[var14];
			int var23 = var18 * var22 - var19 * var21;
			int var24 = var19 * var20 - var17 * var22;
			int var25;
			for (var25 = var17 * var21 - var18 * var20; var23 > 8192 || var24 > 8192 || var25 > 8192 || var23 < -8192 || var24 < -8192 || var25 < -8192; var25 >>= 0x1) {
				var23 >>= 0x1;
				var24 >>= 0x1;
			}
			int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
			if (var26 <= 0) {
				var26 = 1;
			}
			int var27 = var23 * 256 / var26;
			int var28 = var24 * 256 / var26;
			int var29 = var25 * 256 / var26;
			if (this.faceInfo == null || (this.faceInfo[var10] & 0x1) == 0) {
				VertexNormal var31 = super.vertexNormal[var14];
				var31.x += var27;
				var31.y += var28;
				var31.z += var29;
				var31.w++;
				VertexNormal var32 = super.vertexNormal[var15];
				var32.x += var27;
				var32.y += var28;
				var32.z += var29;
				var32.w++;
				VertexNormal var33 = super.vertexNormal[var16];
				var33.x += var27;
				var33.y += var28;
				var33.z += var29;
				var33.w++;
			} else {
				int var30 = (arg4 * var29 + arg2 * var27 + arg3 * var28) / (var8 / 2 + var8) + arg0;
				this.faceColourA[var10] = mulColourLightness(this.faceColour[var10], var30, this.faceInfo[var10]);
			}
		}
		if (arg5) {
			this.applyLighting(arg0, var8, arg2, arg3, arg4);
		} else {
			this.vertexNormalOriginal = new VertexNormal[this.vertexCount];
			for (int var11 = 0; var11 < this.vertexCount; var11++) {
				VertexNormal var12 = super.vertexNormal[var11];
				VertexNormal var13 = this.vertexNormalOriginal[var11] = new VertexNormal();
				var13.x = var12.x;
				var13.y = var12.y;
				var13.z = var12.z;
				var13.w = var12.w;
			}
		}
		if (arg5) {
			this.calculateBoundsCylinder();
		} else {
			this.calculateBoundsAABB();
		}
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public final void applyLighting(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.faceCount; var6++) {
			int var8 = this.faceVertexA[var6];
			int var9 = this.faceVertexB[var6];
			int var10 = this.faceVertexC[var6];
			if (this.faceInfo == null) {
				int var11 = this.faceColour[var6];
				VertexNormal var12 = super.vertexNormal[var8];
				int var13 = (var12.z * arg4 + var12.y * arg3 + var12.x * arg2) / (var12.w * arg1) + arg0;
				this.faceColourA[var6] = mulColourLightness(var11, var13, 0);
				VertexNormal var14 = super.vertexNormal[var9];
				int var15 = (var14.z * arg4 + var14.y * arg3 + var14.x * arg2) / (var14.w * arg1) + arg0;
				this.faceColourB[var6] = mulColourLightness(var11, var15, 0);
				VertexNormal var16 = super.vertexNormal[var10];
				int var17 = (var16.z * arg4 + var16.y * arg3 + var16.x * arg2) / (var16.w * arg1) + arg0;
				this.faceColourC[var6] = mulColourLightness(var11, var17, 0);
			} else if ((this.faceInfo[var6] & 0x1) == 0) {
				int var18 = this.faceColour[var6];
				int var19 = this.faceInfo[var6];
				VertexNormal var20 = super.vertexNormal[var8];
				int var21 = (var20.z * arg4 + var20.y * arg3 + var20.x * arg2) / (var20.w * arg1) + arg0;
				this.faceColourA[var6] = mulColourLightness(var18, var21, var19);
				VertexNormal var22 = super.vertexNormal[var9];
				int var23 = (var22.z * arg4 + var22.y * arg3 + var22.x * arg2) / (var22.w * arg1) + arg0;
				this.faceColourB[var6] = mulColourLightness(var18, var23, var19);
				VertexNormal var24 = super.vertexNormal[var10];
				int var25 = (var24.z * arg4 + var24.y * arg3 + var24.x * arg2) / (var24.w * arg1) + arg0;
				this.faceColourC[var6] = mulColourLightness(var18, var25, var19);
			}
		}
		super.vertexNormal = null;
		this.vertexNormalOriginal = null;
		this.vertexLabel = null;
		this.faceLabel = null;
		if (this.faceInfo != null) {
			for (int var7 = 0; var7 < this.faceCount; var7++) {
				if ((this.faceInfo[var7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.faceColour = null;
	}

	@ObfuscatedName("fb.a(III)I")
	public static final int mulColourLightness(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		}
		int var4 = (arg0 & 0x7F) * arg1 >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	@ObfuscatedName("fb.a(IIIIIII)V")
	public final void drawSimple(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix3D.centerX;
		int var9 = Pix3D.centerY;
		int var10 = sinTable[arg0];
		int var11 = cosTable[arg0];
		int var12 = sinTable[arg1];
		int var13 = cosTable[arg1];
		int var14 = sinTable[arg2];
		int var15 = cosTable[arg2];
		int var16 = sinTable[arg3];
		int var17 = cosTable[arg3];
		int var18 = arg5 * var16 + arg6 * var17 >> 16;
		for (int var19 = 0; var19 < this.vertexCount; var19++) {
			int var20 = this.vertexX[var19];
			int var21 = this.vertexY[var19];
			int var22 = this.vertexZ[var19];
			if (arg2 != 0) {
				int var23 = var14 * var21 + var15 * var20 >> 16;
				var21 = var15 * var21 - var14 * var20 >> 16;
				var20 = var23;
			}
			if (arg0 != 0) {
				int var24 = var11 * var21 - var10 * var22 >> 16;
				var22 = var10 * var21 + var11 * var22 >> 16;
				var21 = var24;
			}
			if (arg1 != 0) {
				int var25 = var12 * var22 + var13 * var20 >> 16;
				var22 = var13 * var22 - var12 * var20 >> 16;
				var20 = var25;
			}
			int var26 = arg4 + var20;
			int var27 = arg5 + var21;
			int var28 = arg6 + var22;
			int var29 = var17 * var27 - var16 * var28 >> 16;
			int var30 = var16 * var27 + var17 * var28 >> 16;
			vertexScreenZ[var19] = var30 - var18;
			vertexScreenX[var19] = (var26 << 9) / var30 + var8;
			vertexScreenY[var19] = (var29 << 9) / var30 + var9;
			if (this.texturedFaceCount > 0) {
				vertexViewSpaceX[var19] = var26;
				vertexViewSpaceY[var19] = var29;
				vertexViewSpaceZ[var19] = var30;
			}
		}
		try {
			this.draw(false, false, 0);
		} catch (Exception var32) {
		}
	}

	@ObfuscatedName("fb.a(IIIIIIIII)V")
	public final void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = this.radius * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
		int var15 = var14 - this.radius << 9;
		if (var15 / var13 >= Pix2D.centerX2d) {
			return;
		}
		int var16 = this.radius + var14 << 9;
		if (var16 / var13 <= -Pix2D.centerX2d) {
			return;
		}
		int var17 = arg2 * arg6 - arg1 * var10 >> 16;
		int var18 = this.radius * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= -Pix2D.centerY2d) {
			return;
		}
		int var20 = (super.minY * arg2 >> 16) + var18;
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix2D.centerY2d) {
			return;
		}
		int var22 = (super.minY * arg1 >> 16) + var12;
		boolean var23 = false;
		if (var11 - var22 <= 50) {
			var23 = true;
		}
		boolean var24 = false;
		if (arg8 > 0 && checkHover) {
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
			int var30 = mouseX - Pix3D.centerX;
			int var31 = mouseY - Pix3D.centerY;
			if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
				if (this.picking) {
					pickedBitsets[pickedCount++] = arg8;
				} else {
					var24 = true;
				}
			}
		}
		int var32 = Pix3D.centerX;
		int var33 = Pix3D.centerY;
		int var34 = 0;
		int var35 = 0;
		if (arg0 != 0) {
			var34 = sinTable[arg0];
			var35 = cosTable[arg0];
		}
		for (int var36 = 0; var36 < this.vertexCount; var36++) {
			int var37 = this.vertexX[var36];
			int var38 = this.vertexY[var36];
			int var39 = this.vertexZ[var36];
			if (arg0 != 0) {
				int var40 = var34 * var39 + var35 * var37 >> 16;
				var39 = var35 * var39 - var34 * var37 >> 16;
				var37 = var40;
			}
			int var41 = arg5 + var37;
			int var42 = arg6 + var38;
			int var43 = arg7 + var39;
			int var44 = arg3 * var43 + arg4 * var41 >> 16;
			int var45 = arg4 * var43 - arg3 * var41 >> 16;
			int var47 = arg2 * var42 - arg1 * var45 >> 16;
			int var48 = arg1 * var42 + arg2 * var45 >> 16;
			vertexScreenZ[var36] = var48 - var11;
			if (var48 >= 50) {
				vertexScreenX[var36] = (var44 << 9) / var48 + var32;
				vertexScreenY[var36] = (var47 << 9) / var48 + var33;
			} else {
				vertexScreenX[var36] = -5000;
				var23 = true;
			}
			if (var23 || this.texturedFaceCount > 0) {
				vertexViewSpaceX[var36] = var44;
				vertexViewSpaceY[var36] = var47;
				vertexViewSpaceZ[var36] = var48;
			}
		}
		try {
			this.draw(var23, var24, arg8);
		} catch (Exception var50) {
		}
	}

	@ObfuscatedName("fb.a(ZZI)V")
	public final void draw(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < this.maxDepth; var4++) {
			tmpDepthFaceCount[var4] = 0;
		}
		for (int var5 = 0; var5 < this.faceCount; var5++) {
			if (this.faceInfo == null || this.faceInfo[var5] != -1) {
				int var30 = this.faceVertexA[var5];
				int var31 = this.faceVertexB[var5];
				int var32 = this.faceVertexC[var5];
				int var33 = vertexScreenX[var30];
				int var34 = vertexScreenX[var31];
				int var35 = vertexScreenX[var32];
				if (arg0 && (var33 == -5000 || var34 == -5000 || var35 == -5000)) {
					faceNearClipped[var5] = true;
					int var36 = (vertexScreenZ[var30] + vertexScreenZ[var31] + vertexScreenZ[var32]) / 3 + this.minDepth;
					tmpDepthFaces[var36][tmpDepthFaceCount[var36]++] = var5;
				} else {
					if (arg1 && this.pointsWithinTriangle(mouseX, mouseY, vertexScreenY[var30], vertexScreenY[var31], vertexScreenY[var32], var33, var34, var35)) {
						pickedBitsets[pickedCount++] = arg2;
						arg1 = false;
					}
					if ((vertexScreenY[var32] - vertexScreenY[var31]) * (var33 - var34) - (vertexScreenY[var30] - vertexScreenY[var31]) * (var35 - var34) > 0) {
						faceNearClipped[var5] = false;
						if (var33 >= 0 && var34 >= 0 && var35 >= 0 && var33 <= Pix2D.safeWidth && var34 <= Pix2D.safeWidth && var35 <= Pix2D.safeWidth) {
							faceClippedX[var5] = false;
						} else {
							faceClippedX[var5] = true;
						}
						int var37 = (vertexScreenZ[var30] + vertexScreenZ[var31] + vertexScreenZ[var32]) / 3 + this.minDepth;
						tmpDepthFaces[var37][tmpDepthFaceCount[var37]++] = var5;
					}
				}
			}
		}
		if (this.facePriority == null) {
			for (int var6 = this.maxDepth - 1; var6 >= 0; var6--) {
				int var7 = tmpDepthFaceCount[var6];
				if (var7 > 0) {
					int[] var8 = tmpDepthFaces[var6];
					for (int var9 = 0; var9 < var7; var9++) {
						this.drawFace(var8[var9]);
					}
				}
			}
			return;
		}
		for (int var10 = 0; var10 < 12; var10++) {
			tmpPriorityFaceCount[var10] = 0;
			tmpPriorityDepthSum[var10] = 0;
		}
		for (int var11 = this.maxDepth - 1; var11 >= 0; var11--) {
			int var24 = tmpDepthFaceCount[var11];
			if (var24 > 0) {
				int[] var25 = tmpDepthFaces[var11];
				for (int var26 = 0; var26 < var24; var26++) {
					int var27 = var25[var26];
					int var28 = this.facePriority[var27];
					int var29 = tmpPriorityFaceCount[var28]++;
					tmpPriorityFaces[var28][var29] = var27;
					if (var28 < 10) {
						tmpPriorityDepthSum[var28] += var11;
					} else if (var28 == 10) {
						tmpPriority10FaceDepth[var29] = var11;
					} else {
						tmpPriority11FaceDepth[var29] = var11;
					}
				}
			}
		}
		int var12 = 0;
		if (tmpPriorityFaceCount[1] > 0 || tmpPriorityFaceCount[2] > 0) {
			var12 = (tmpPriorityDepthSum[1] + tmpPriorityDepthSum[2]) / (tmpPriorityFaceCount[1] + tmpPriorityFaceCount[2]);
		}
		int var13 = 0;
		if (tmpPriorityFaceCount[3] > 0 || tmpPriorityFaceCount[4] > 0) {
			var13 = (tmpPriorityDepthSum[3] + tmpPriorityDepthSum[4]) / (tmpPriorityFaceCount[3] + tmpPriorityFaceCount[4]);
		}
		int var14 = 0;
		if (tmpPriorityFaceCount[6] > 0 || tmpPriorityFaceCount[8] > 0) {
			var14 = (tmpPriorityDepthSum[6] + tmpPriorityDepthSum[8]) / (tmpPriorityFaceCount[6] + tmpPriorityFaceCount[8]);
		}
		int var15 = 0;
		int var16 = tmpPriorityFaceCount[10];
		int[] var17 = tmpPriorityFaces[10];
		int[] var18 = tmpPriority10FaceDepth;
		if (var15 == var16) {
			var15 = 0;
			var16 = tmpPriorityFaceCount[11];
			var17 = tmpPriorityFaces[11];
			var18 = tmpPriority11FaceDepth;
		}
		int var19;
		if (var15 < var16) {
			var19 = var18[var15];
		} else {
			var19 = -1000;
		}
		for (int var20 = 0; var20 < 10; var20++) {
			while (var20 == 0 && var19 > var12) {
				this.drawFace(var17[var15++]);
				if (var15 == var16 && tmpPriorityFaces[11] != var17) {
					var15 = 0;
					var16 = tmpPriorityFaceCount[11];
					var17 = tmpPriorityFaces[11];
					var18 = tmpPriority11FaceDepth;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			while (var20 == 3 && var19 > var13) {
				this.drawFace(var17[var15++]);
				if (var15 == var16 && tmpPriorityFaces[11] != var17) {
					var15 = 0;
					var16 = tmpPriorityFaceCount[11];
					var17 = tmpPriorityFaces[11];
					var18 = tmpPriority11FaceDepth;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			while (var20 == 5 && var19 > var14) {
				this.drawFace(var17[var15++]);
				if (var15 == var16 && tmpPriorityFaces[11] != var17) {
					var15 = 0;
					var16 = tmpPriorityFaceCount[11];
					var17 = tmpPriorityFaces[11];
					var18 = tmpPriority11FaceDepth;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			int var21 = tmpPriorityFaceCount[var20];
			int[] var22 = tmpPriorityFaces[var20];
			for (int var23 = 0; var23 < var21; var23++) {
				this.drawFace(var22[var23]);
			}
		}
		while (var19 != -1000) {
			this.drawFace(var17[var15++]);
			if (var15 == var16 && tmpPriorityFaces[11] != var17) {
				var15 = 0;
				var17 = tmpPriorityFaces[11];
				var16 = tmpPriorityFaceCount[11];
				var18 = tmpPriority11FaceDepth;
			}
			if (var15 < var16) {
				var19 = var18[var15];
			} else {
				var19 = -1000;
			}
		}
	}

	@ObfuscatedName("fb.f(I)V")
	public final void drawFace(int arg0) {
		if (faceNearClipped[arg0]) {
			this.drawFaceNearClipped(arg0);
			return;
		}
		int var2 = this.faceVertexA[arg0];
		int var3 = this.faceVertexB[arg0];
		int var4 = this.faceVertexC[arg0];
		Pix3D.hclip = faceClippedX[arg0];
		if (this.faceAlpha == null) {
			Pix3D.trans = 0;
		} else {
			Pix3D.trans = this.faceAlpha[arg0];
		}
		int var5;
		if (this.faceInfo == null) {
			var5 = 0;
		} else {
			var5 = this.faceInfo[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.gouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourB[arg0], this.faceColourC[arg0]);
		} else if (var5 == 1) {
			Pix3D.flatTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], palette[this.faceColourA[arg0]]);
		} else if (var5 == 2) {
			int var6 = this.faceInfo[arg0] >> 2;
			int var7 = this.texturedVertexA[var6];
			int var8 = this.texturedVertexB[var6];
			int var9 = this.texturedVertexC[var6];
			Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourB[arg0], this.faceColourC[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], this.faceColour[arg0]);
		} else if (var5 == 3) {
			int var10 = this.faceInfo[arg0] >> 2;
			int var11 = this.texturedVertexA[var10];
			int var12 = this.texturedVertexB[var10];
			int var13 = this.texturedVertexC[var10];
			Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var11], vertexViewSpaceX[var12], vertexViewSpaceX[var13], vertexViewSpaceY[var11], vertexViewSpaceY[var12], vertexViewSpaceY[var13], vertexViewSpaceZ[var11], vertexViewSpaceZ[var12], vertexViewSpaceZ[var13], this.faceColour[arg0]);
		}
	}

	@ObfuscatedName("fb.g(I)V")
	public final void drawFaceNearClipped(int arg0) {
		int var2 = Pix3D.centerX;
		int var3 = Pix3D.centerY;
		int var4 = 0;
		int var5 = this.faceVertexA[arg0];
		int var6 = this.faceVertexB[arg0];
		int var7 = this.faceVertexC[arg0];
		int var8 = vertexViewSpaceZ[var5];
		int var9 = vertexViewSpaceZ[var6];
		int var10 = vertexViewSpaceZ[var7];
		if (var8 >= 50) {
			clippedX[var4] = vertexScreenX[var5];
			clippedY[var4] = vertexScreenY[var5];
			clippedColour[var4++] = this.faceColourA[arg0];
		} else {
			int var11 = vertexViewSpaceX[var5];
			int var12 = vertexViewSpaceY[var5];
			int var13 = this.faceColourA[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * divTable2[var10 - var8];
				clippedX[var4] = (((vertexViewSpaceX[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				clippedColour[var4++] = ((this.faceColourC[arg0] - var13) * var14 >> 16) + var13;
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * divTable2[var9 - var8];
				clippedX[var4] = (((vertexViewSpaceX[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
				clippedColour[var4++] = ((this.faceColourB[arg0] - var13) * var15 >> 16) + var13;
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
				int var19 = (50 - var9) * divTable2[var8 - var9];
				clippedX[var4] = (((vertexViewSpaceX[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				clippedColour[var4++] = ((this.faceColourA[arg0] - var18) * var19 >> 16) + var18;
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * divTable2[var10 - var9];
				clippedX[var4] = (((vertexViewSpaceX[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
				clippedColour[var4++] = ((this.faceColourC[arg0] - var18) * var20 >> 16) + var18;
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
				int var24 = (50 - var10) * divTable2[var9 - var10];
				clippedX[var4] = (((vertexViewSpaceX[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				clippedColour[var4++] = ((this.faceColourB[arg0] - var23) * var24 >> 16) + var23;
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * divTable2[var8 - var10];
				clippedX[var4] = (((vertexViewSpaceX[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
				clippedY[var4] = (((vertexViewSpaceY[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
				clippedColour[var4++] = ((this.faceColourA[arg0] - var23) * var25 >> 16) + var23;
			}
		}
		int var26 = clippedX[0];
		int var27 = clippedX[1];
		int var28 = clippedX[2];
		int var29 = clippedY[0];
		int var30 = clippedY[1];
		int var31 = clippedY[2];
		if ((var26 - var27) * (var31 - var30) - (var28 - var27) * (var29 - var30) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.safeWidth || var27 > Pix2D.safeWidth || var28 > Pix2D.safeWidth) {
				Pix3D.hclip = true;
			}
			int var32;
			if (this.faceInfo == null) {
				var32 = 0;
			} else {
				var32 = this.faceInfo[arg0] & 0x3;
			}
			if (var32 == 0) {
				Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
			} else if (var32 == 1) {
				Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, palette[this.faceColourA[arg0]]);
			} else if (var32 == 2) {
				int var33 = this.faceInfo[arg0] >> 2;
				int var34 = this.texturedVertexA[var33];
				int var35 = this.texturedVertexB[var33];
				int var36 = this.texturedVertexC[var33];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceX[var36], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceY[var36], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], vertexViewSpaceZ[var36], this.faceColour[arg0]);
			} else if (var32 == 3) {
				int var37 = this.faceInfo[arg0] >> 2;
				int var38 = this.texturedVertexA[var37];
				int var39 = this.texturedVertexB[var37];
				int var40 = this.texturedVertexC[var37];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], this.faceColour[arg0]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.safeWidth || var27 > Pix2D.safeWidth || var28 > Pix2D.safeWidth || clippedX[3] < 0 || clippedX[3] > Pix2D.safeWidth) {
			Pix3D.hclip = true;
		}
		int var41;
		if (this.faceInfo == null) {
			var41 = 0;
		} else {
			var41 = this.faceInfo[arg0] & 0x3;
		}
		if (var41 == 0) {
			Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
			Pix3D.gouraudTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
			return;
		}
		if (var41 == 1) {
			int var42 = palette[this.faceColourA[arg0]];
			Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var42);
			Pix3D.flatTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], var42);
			return;
		}
		if (var41 == 2) {
			int var43 = this.faceInfo[arg0] >> 2;
			int var44 = this.texturedVertexA[var43];
			int var45 = this.texturedVertexB[var43];
			int var46 = this.texturedVertexC[var43];
			Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], this.faceColour[arg0]);
			Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], this.faceColour[arg0]);
			return;
		}
		if (var41 != 3) {
			return;
		}
		int var47 = this.faceInfo[arg0] >> 2;
		int var48 = this.texturedVertexA[var47];
		int var49 = this.texturedVertexB[var47];
		int var50 = this.texturedVertexC[var47];
		Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], this.faceColour[arg0]);
		Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], this.faceColour[arg0]);
	}

	@ObfuscatedName("fb.a(IIIIIIII)Z")
	public final boolean pointsWithinTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
