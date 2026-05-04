package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("le")
public final class SoftwareModelLit extends ModelLit {

	@ObfuscatedName("le.ab")
	public static final int[] field2293 = new int[4096];

	@ObfuscatedName("le.bb")
	public static final int[][] field2294 = new int[12][4096];

	@ObfuscatedName("le.cb")
	public static final int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("le.db")
	public static final int[] tmpDepthFaceCount = new int[1600];

	@ObfuscatedName("le.eb")
	public static final int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("le.fb")
	public static final int[] field2298 = new int[12];

	@ObfuscatedName("le.gb")
	public static final int[][] tmpDepthFaces = new int[1600][512];

	@ObfuscatedName("le.hb")
	public static final int[] field2300 = new int[4096];

	@ObfuscatedName("le.ib")
	public static final int[] field2301 = new int[10];

	@ObfuscatedName("le.jb")
	public static final int[] vertexScreenZ = new int[4096];

	@ObfuscatedName("le.kb")
	public static final int[] field2303 = new int[12];

	@ObfuscatedName("le.lb")
	public static final int[] field2304 = new int[10];

	@ObfuscatedName("le.mb")
	public static final int[] vertexScreenX = new int[4096];

	@ObfuscatedName("le.nb")
	public static final int[] vertexViewSpaceZ = new int[4096];
	@ObfuscatedName("ce.eb")
	public static final long[] field476 = new long[1000];
	@ObfuscatedName("oi.c")
	public static int field3101 = 0;

	@ObfuscatedName("le.o")
	public short field2257;

	@ObfuscatedName("le.ob")
	public static final int[] field2307 = new int[10];

	@ObfuscatedName("le.p")
	public boolean field2258 = false;

	@ObfuscatedName("le.pb")
	public static int field2308;

	@ObfuscatedName("le.q")
	public int[] faceColourC;

	@ObfuscatedName("le.qb")
	public static final boolean[] field2309 = new boolean[4096];

	@ObfuscatedName("le.r")
	public byte[] field2260;

	@ObfuscatedName("le.rb")
	public static int field2310;

	@ObfuscatedName("le.s")
	public int[] field2261;

	@ObfuscatedName("le.sb")
	public static byte[] field2311 = new byte[1];

	@ObfuscatedName("le.t")
	public short field2262;

	@ObfuscatedName("le.tb")
	public static int field2312;

	@ObfuscatedName("le.u")
	public int field2263 = 0;

	@ObfuscatedName("le.v")
	public int[] field2264;

	@ObfuscatedName("le.w")
	public byte[] field2265;

	@ObfuscatedName("le.J")
	public static final SoftwareModelLit field2278 = new SoftwareModelLit();

	@ObfuscatedName("le.L")
	public static byte[] field2280 = new byte[1];

	@ObfuscatedName("le.P")
	public static final SoftwareModelLit field2284 = new SoftwareModelLit();

	@ObfuscatedName("le.Z")
	public static final boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("le.Y")
	public static final int[] field2291 = new int[4096];

	@ObfuscatedName("le.M")
	public byte field2281 = 0;

	@ObfuscatedName("le.C")
	public int field2271 = 0;

	@ObfuscatedName("le.X")
	public int numFaces = 0;

	@ObfuscatedName("le.S")
	public int[] field2286;

	@ObfuscatedName("le.T")
	public int[] field2287;

	@ObfuscatedName("le.E")
	public int[] faceVertexA;

	@ObfuscatedName("le.N")
	public int[] faceVertexB;

	@ObfuscatedName("le.x")
	public int[] faceVertexC;

	@ObfuscatedName("le.F")
	public byte[] field2274;

	@ObfuscatedName("le.V")
	public int[][] field2288;

	@ObfuscatedName("le.R")
	public int[][] field2285;

	@ObfuscatedName("le.W")
	public int[] field2289;

	@ObfuscatedName("le.O")
	public int[] field2283;

	@ObfuscatedName("le.D")
	public short[] field2272;

	@ObfuscatedName("le.H")
	public int[] field2276;

	@ObfuscatedName("le.y")
	public int[] field2267;

	@ObfuscatedName("le.z")
	public short field2268;

	@ObfuscatedName("le.A")
	public short field2269;

	@ObfuscatedName("le.B")
	public short field2270;

	@ObfuscatedName("le.G")
	public short field2275;

	@ObfuscatedName("le.I")
	public short field2277;

	@ObfuscatedName("le.K")
	public short field2279;

	@ObfuscatedName("le.f(I)I")
	public static int method842(int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@ObfuscatedName("le.a(II)I")
	public static int method843(int arg0, int arg1) {
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
		arg0.method548();
		arg0.method569();
		this.field2271 = arg0.field1489;
		this.field2264 = arg0.field1522;
		this.field2286 = arg0.field1476;
		this.field2287 = arg0.field1506;
		this.numFaces = arg0.field1485;
		this.faceVertexA = arg0.field1511;
		this.faceVertexB = arg0.field1518;
		this.faceVertexC = arg0.field1505;
		this.field2260 = arg0.field1493;
		this.field2274 = arg0.field1510;
		this.field2281 = arg0.field1507;
		this.field2288 = arg0.field1487;
		this.field2285 = arg0.field1486;
		int var7 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		int var8 = arg2 * var7 >> 8;
		this.field2289 = new int[this.numFaces];
		this.field2283 = new int[this.numFaces];
		this.faceColourC = new int[this.numFaces];
		if (arg0.field1503 == null) {
			this.field2272 = null;
		} else {
			this.field2272 = new short[this.numFaces];
			for (int var9 = 0; var9 < this.numFaces; var9++) {
				short var10 = arg0.field1503[var9];
				if (var10 != -1 && Pix3D.field3356.method436(var10)) {
					this.field2272[var9] = var10;
				} else {
					this.field2272[var9] = -1;
				}
			}
		}
		if (arg0.field1499 > 0 && arg0.field1488 != null) {
			int[] var11 = new int[arg0.field1499];
			for (int var12 = 0; var12 < this.numFaces; var12++) {
				if (arg0.field1488[var12] != -1) {
					var11[arg0.field1488[var12] & 0xFF]++;
				}
			}
			this.field2263 = 0;
			for (int var13 = 0; var13 < arg0.field1499; var13++) {
				if (var11[var13] > 0 && arg0.field1521[var13] == 0) {
					this.field2263++;
				}
			}
			this.field2276 = new int[this.field2263];
			this.field2261 = new int[this.field2263];
			this.field2267 = new int[this.field2263];
			int var14 = 0;
			for (int var15 = 0; var15 < arg0.field1499; var15++) {
				if (var11[var15] > 0 && arg0.field1521[var15] == 0) {
					this.field2276[var14] = arg0.field1501[var15] & 0xFFFF;
					this.field2261[var14] = arg0.field1495[var15] & 0xFFFF;
					this.field2267[var14] = arg0.field1477[var15] & 0xFFFF;
					var11[var15] = var14++;
				} else {
					var11[var15] = -1;
				}
			}
			this.field2265 = new byte[this.numFaces];
			for (int var16 = 0; var16 < this.numFaces; var16++) {
				if (arg0.field1488[var16] == -1) {
					this.field2265[var16] = -1;
				} else {
					this.field2265[var16] = (byte) var11[arg0.field1488[var16] & 0xFF];
					if (this.field2265[var16] == -1 && this.field2272 != null) {
						this.field2272[var16] = -1;
					}
				}
			}
		}
		for (int var17 = 0; var17 < this.numFaces; var17++) {
			byte var18;
			if (arg0.field1480 == null) {
				var18 = 0;
			} else {
				var18 = arg0.field1480[var17];
			}
			byte var19;
			if (arg0.field1510 == null) {
				var19 = 0;
			} else {
				var19 = arg0.field1510[var17];
			}
			short var20;
			if (this.field2272 == null) {
				var20 = -1;
			} else {
				var20 = this.field2272[var17];
			}
			if (var19 == -2) {
				var18 = 3;
			}
			if (var19 == -1) {
				var18 = 2;
			}
			if (var20 == -1) {
				if (var18 == 0) {
					int var21 = arg0.field1482[var17] & 0xFFFF;
					PointNormal var22;
					if (arg0.field1490 == null || arg0.field1490[this.faceVertexA[var17]] == null) {
						var22 = arg0.field1497[this.faceVertexA[var17]];
					} else {
						var22 = arg0.field1490[this.faceVertexA[var17]];
					}
					int var23 = arg1 + (arg3 * var22.field1739 + arg4 * var22.field1736 + arg5 * var22.field1737) / (var8 * var22.field1738);
					this.field2289[var17] = method843(var21, var23);
					PointNormal var24;
					if (arg0.field1490 == null || arg0.field1490[this.faceVertexB[var17]] == null) {
						var24 = arg0.field1497[this.faceVertexB[var17]];
					} else {
						var24 = arg0.field1490[this.faceVertexB[var17]];
					}
					int var25 = arg1 + (arg3 * var24.field1739 + arg4 * var24.field1736 + arg5 * var24.field1737) / (var8 * var24.field1738);
					this.field2283[var17] = method843(var21, var25);
					PointNormal var26;
					if (arg0.field1490 == null || arg0.field1490[this.faceVertexC[var17]] == null) {
						var26 = arg0.field1497[this.faceVertexC[var17]];
					} else {
						var26 = arg0.field1490[this.faceVertexC[var17]];
					}
					int var27 = arg1 + (arg3 * var26.field1739 + arg4 * var26.field1736 + arg5 * var26.field1737) / (var8 * var26.field1738);
					this.faceColourC[var17] = method843(var21, var27);
				} else if (var18 == 1) {
					FaceNormal var28 = arg0.field1512[var17];
					int var29 = arg1 + (arg3 * var28.field3822 + arg4 * var28.field3830 + arg5 * var28.field3825) / (var8 + var8 / 2);
					this.field2289[var17] = method843(arg0.field1482[var17] & 0xFFFF, var29);
					this.faceColourC[var17] = -1;
				} else if (var18 == 3) {
					this.field2289[var17] = 128;
					this.faceColourC[var17] = -1;
				} else {
					this.faceColourC[var17] = -2;
				}
			} else if (var18 == 0) {
				PointNormal var30;
				if (arg0.field1490 == null || arg0.field1490[this.faceVertexA[var17]] == null) {
					var30 = arg0.field1497[this.faceVertexA[var17]];
				} else {
					var30 = arg0.field1490[this.faceVertexA[var17]];
				}
				int var31 = arg1 + (arg3 * var30.field1739 + arg4 * var30.field1736 + arg5 * var30.field1737) / (var8 * var30.field1738);
				this.field2289[var17] = method842(var31);
				PointNormal var32;
				if (arg0.field1490 == null || arg0.field1490[this.faceVertexB[var17]] == null) {
					var32 = arg0.field1497[this.faceVertexB[var17]];
				} else {
					var32 = arg0.field1490[this.faceVertexB[var17]];
				}
				int var33 = arg1 + (arg3 * var32.field1739 + arg4 * var32.field1736 + arg5 * var32.field1737) / (var8 * var32.field1738);
				this.field2283[var17] = method842(var33);
				PointNormal var34;
				if (arg0.field1490 == null || arg0.field1490[this.faceVertexC[var17]] == null) {
					var34 = arg0.field1497[this.faceVertexC[var17]];
				} else {
					var34 = arg0.field1490[this.faceVertexC[var17]];
				}
				int var35 = arg1 + (arg3 * var34.field1739 + arg4 * var34.field1736 + arg5 * var34.field1737) / (var8 * var34.field1738);
				this.faceColourC[var17] = method842(var35);
			} else if (var18 == 1) {
				FaceNormal var36 = arg0.field1512[var17];
				int var37 = arg1 + (arg3 * var36.field3822 + arg4 * var36.field3830 + arg5 * var36.field3825) / (var8 + var8 / 2);
				this.field2289[var17] = method842(var37);
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
		this.field2271 = 0;
		this.numFaces = 0;
		this.field2263 = 0;
		this.field2281 = -1;
		for (int var7 = 0; var7 < 2; var7++) {
			SoftwareModelLit var8 = arg0[var7];
			if (var8 != null) {
				this.field2271 += var8.field2271;
				this.numFaces += var8.numFaces;
				this.field2263 += var8.field2263;
				if (var8.field2260 == null) {
					if (this.field2281 == -1) {
						this.field2281 = var8.field2281;
					}
					if (this.field2281 != var8.field2281) {
						var3 = true;
					}
				} else {
					var3 = true;
				}
				var4 |= var8.field2274 != null;
				var5 |= var8.field2272 != null;
				var6 |= var8.field2265 != null;
			}
		}
		this.field2264 = new int[this.field2271];
		this.field2286 = new int[this.field2271];
		this.field2287 = new int[this.field2271];
		this.faceVertexA = new int[this.numFaces];
		this.faceVertexB = new int[this.numFaces];
		this.faceVertexC = new int[this.numFaces];
		this.field2289 = new int[this.numFaces];
		this.field2283 = new int[this.numFaces];
		this.faceColourC = new int[this.numFaces];
		if (var3) {
			this.field2260 = new byte[this.numFaces];
		}
		if (var4) {
			this.field2274 = new byte[this.numFaces];
		}
		if (var5) {
			this.field2272 = new short[this.numFaces];
		}
		if (var6) {
			this.field2265 = new byte[this.numFaces];
		}
		if (this.field2263 > 0) {
			this.field2276 = new int[this.field2263];
			this.field2261 = new int[this.field2263];
			this.field2267 = new int[this.field2263];
		}
		this.field2271 = 0;
		this.numFaces = 0;
		this.field2263 = 0;
		for (int var9 = 0; var9 < 2; var9++) {
			SoftwareModelLit var10 = arg0[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < var10.numFaces; var11++) {
					this.faceVertexA[this.numFaces] = var10.faceVertexA[var11] + this.field2271;
					this.faceVertexB[this.numFaces] = var10.faceVertexB[var11] + this.field2271;
					this.faceVertexC[this.numFaces] = var10.faceVertexC[var11] + this.field2271;
					this.field2289[this.numFaces] = var10.field2289[var11];
					this.field2283[this.numFaces] = var10.field2283[var11];
					this.faceColourC[this.numFaces] = var10.faceColourC[var11];
					if (var3) {
						if (var10.field2260 == null) {
							this.field2260[this.numFaces] = var10.field2281;
						} else {
							this.field2260[this.numFaces] = var10.field2260[var11];
						}
					}
					if (var4 && var10.field2274 != null) {
						this.field2274[this.numFaces] = var10.field2274[var11];
					}
					if (var5) {
						if (var10.field2272 == null) {
							this.field2272[this.numFaces] = -1;
						} else {
							this.field2272[this.numFaces] = var10.field2272[var11];
						}
					}
					if (var6) {
						if (var10.field2265 == null || var10.field2265[var11] == -1) {
							this.field2265[this.numFaces] = -1;
						} else {
							this.field2265[this.numFaces] = (byte) (var10.field2265[var11] + this.field2263);
						}
					}
					this.numFaces++;
				}
				for (int var12 = 0; var12 < var10.field2263; var12++) {
					this.field2276[this.field2263] = var10.field2276[var12] + this.field2271;
					this.field2261[this.field2263] = var10.field2261[var12] + this.field2271;
					this.field2267[this.field2263] = var10.field2267[var12] + this.field2271;
					this.field2263++;
				}
				for (int var13 = 0; var13 < var10.field2271; var13++) {
					this.field2264[this.field2271] = var10.field2264[var13];
					this.field2286[this.field2271] = var10.field2286[var13];
					this.field2287[this.field2271] = var10.field2287[var13];
					this.field2271++;
				}
			}
		}
	}

	@ObfuscatedName("le.h()I")
	@Override
	public int method194() {
		if (!this.field2258) {
			this.method844();
		}
		return this.field2257;
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
					if (arg1 && this.method848(Statics.field2610 + Pix3D.field3363, Statics.field3604 + Pix3D.field3361, field2300[var9], field2300[var10], field2300[var11], var12, var13, var14)) {
						field476[field3101++] = arg2;
						arg1 = false;
					}
					if ((var12 - var13) * (field2300[var11] - field2300[var10]) - (field2300[var9] - field2300[var10]) * (var14 - var13) > 0) {
						faceNearClipped[var8] = false;
						if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Pix3D.field3350 && var13 <= Pix3D.field3350 && var14 <= Pix3D.field3350) {
							field2309[var8] = false;
						} else {
							field2309[var8] = true;
						}
						int var34 = (vertexScreenZ[var9] + vertexScreenZ[var10] + vertexScreenZ[var11]) / 3 + arg3;
						tmpDepthFaces[var34][tmpDepthFaceCount[var34]++] = var8;
					}
				}
			}
		}
		if (this.field2260 == null) {
			for (int var35 = arg4 - 1; var35 >= 0; var35--) {
				int var36 = tmpDepthFaceCount[var35];
				if (var36 > 0) {
					int[] var37 = tmpDepthFaces[var35];
					for (int var38 = 0; var38 < var36; var38++) {
						this.method851(var37[var38]);
					}
				}
			}
			return;
		}
		for (int var39 = 0; var39 < 12; var39++) {
			field2298[var39] = 0;
			field2303[var39] = 0;
		}
		for (int var40 = arg4 - 1; var40 >= 0; var40--) {
			int var41 = tmpDepthFaceCount[var40];
			if (var41 > 0) {
				int[] var42 = tmpDepthFaces[var40];
				for (int var43 = 0; var43 < var41; var43++) {
					int var44 = var42[var43];
					byte var45 = this.field2260[var44];
					int var46 = field2298[var45]++;
					field2294[var45][var46] = var44;
					if (var45 < 10) {
						field2303[var45] += var40;
					} else if (var45 == 10) {
						field2291[var46] = var40;
					} else {
						field2293[var46] = var40;
					}
				}
			}
		}
		int var47 = 0;
		if (field2298[1] > 0 || field2298[2] > 0) {
			var47 = (field2303[1] + field2303[2]) / (field2298[1] + field2298[2]);
		}
		int var48 = 0;
		if (field2298[3] > 0 || field2298[4] > 0) {
			var48 = (field2303[3] + field2303[4]) / (field2298[3] + field2298[4]);
		}
		int var49 = 0;
		if (field2298[6] > 0 || field2298[8] > 0) {
			var49 = (field2303[6] + field2303[8]) / (field2298[6] + field2298[8]);
		}
		int var50 = 0;
		int var51 = field2298[10];
		int[] var52 = field2294[10];
		int[] var53 = field2291;
		if (var51 == 0) {
			var50 = 0;
			var51 = field2298[11];
			var52 = field2294[11];
			var53 = field2293;
		}
		int var54;
		if (var51 > 0) {
			var54 = var53[0];
		} else {
			var54 = -1000;
		}
		for (int var55 = 0; var55 < 10; var55++) {
			while (var55 == 0 && var54 > var47) {
				this.method851(var52[var50++]);
				if (var50 == var51 && var52 != field2294[11]) {
					var50 = 0;
					var51 = field2298[11];
					var52 = field2294[11];
					var53 = field2293;
				}
				if (var50 < var51) {
					var54 = var53[var50];
				} else {
					var54 = -1000;
				}
			}
			while (var55 == 3 && var54 > var48) {
				this.method851(var52[var50++]);
				if (var50 == var51 && var52 != field2294[11]) {
					var50 = 0;
					var51 = field2298[11];
					var52 = field2294[11];
					var53 = field2293;
				}
				if (var50 < var51) {
					var54 = var53[var50];
				} else {
					var54 = -1000;
				}
			}
			while (var55 == 5 && var54 > var49) {
				this.method851(var52[var50++]);
				if (var50 == var51 && var52 != field2294[11]) {
					var50 = 0;
					var51 = field2298[11];
					var52 = field2294[11];
					var53 = field2293;
				}
				if (var50 < var51) {
					var54 = var53[var50];
				} else {
					var54 = -1000;
				}
			}
			int var56 = field2298[var55];
			int[] var57 = field2294[var55];
			for (int var58 = 0; var58 < var56; var58++) {
				this.method851(var57[var58]);
			}
		}
		while (var54 != -1000) {
			this.method851(var52[var50++]);
			if (var50 == var51 && var52 != field2294[11]) {
				var50 = 0;
				var52 = field2294[11];
				var51 = field2298[11];
				var53 = field2293;
			}
			if (var50 < var51) {
				var54 = var53[var50];
			} else {
				var54 = -1000;
			}
		}
	}

	@ObfuscatedName("le.a(I[IIII)V")
	public void method840(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field2308 = 0;
			field2312 = 0;
			field2310 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.field2288.length) {
					int[] var10 = this.field2288[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field2308 += this.field2264[var12];
						field2312 += this.field2286[var12];
						field2310 += this.field2287[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				field2308 = field2308 / var7 + arg2;
				field2312 = field2312 / var7 + arg3;
				field2310 = field2310 / var7 + arg4;
			} else {
				field2308 = arg2;
				field2312 = arg3;
				field2310 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.field2288.length) {
					int[] var15 = this.field2288[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.field2264[var17] += arg2;
						this.field2286[var17] += arg3;
						this.field2287[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.field2288.length) {
					int[] var20 = this.field2288[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.field2264[var22] -= field2308;
						this.field2286[var22] -= field2312;
						this.field2287[var22] -= field2310;
						if (arg4 != 0) {
							int var23 = Pix3D.field3359[arg4];
							int var24 = Pix3D.field3354[arg4];
							int var25 = this.field2286[var22] * var23 + this.field2264[var22] * var24 + 32767 >> 16;
							this.field2286[var22] = this.field2286[var22] * var24 + 32767 - this.field2264[var22] * var23 >> 16;
							this.field2264[var22] = var25;
						}
						if (arg2 != 0) {
							int var26 = Pix3D.field3359[arg2];
							int var27 = Pix3D.field3354[arg2];
							int var28 = this.field2286[var22] * var27 + 32767 - this.field2287[var22] * var26 >> 16;
							this.field2287[var22] = this.field2286[var22] * var26 + this.field2287[var22] * var27 + 32767 >> 16;
							this.field2286[var22] = var28;
						}
						if (arg3 != 0) {
							int var29 = Pix3D.field3359[arg3];
							int var30 = Pix3D.field3354[arg3];
							int var31 = this.field2287[var22] * var29 + this.field2264[var22] * var30 + 32767 >> 16;
							this.field2287[var22] = this.field2287[var22] * var30 + 32767 - this.field2264[var22] * var29 >> 16;
							this.field2264[var22] = var31;
						}
						this.field2264[var22] += field2308;
						this.field2286[var22] += field2312;
						this.field2287[var22] += field2310;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var32 = 0; var32 < var6; var32++) {
				int var33 = arg1[var32];
				if (var33 < this.field2288.length) {
					int[] var34 = this.field2288[var33];
					for (int var35 = 0; var35 < var34.length; var35++) {
						int var36 = var34[var35];
						this.field2264[var36] -= field2308;
						this.field2286[var36] -= field2312;
						this.field2287[var36] -= field2310;
						this.field2264[var36] = this.field2264[var36] * arg2 / 128;
						this.field2286[var36] = this.field2286[var36] * arg3 / 128;
						this.field2287[var36] = this.field2287[var36] * arg4 / 128;
						this.field2264[var36] += field2308;
						this.field2286[var36] += field2312;
						this.field2287[var36] += field2310;
					}
				}
			}
		} else if (arg0 == 5 && (this.field2285 != null && this.field2274 != null)) {
			for (int var37 = 0; var37 < var6; var37++) {
				int var38 = arg1[var37];
				if (var38 < this.field2285.length) {
					int[] var39 = this.field2285[var38];
					for (int var40 = 0; var40 < var39.length; var40++) {
						int var41 = var39[var40];
						int var42 = (this.field2274[var41] & 0xFF) + arg2 * 8;
						if (var42 < 0) {
							var42 = 0;
						} else if (var42 > 255) {
							var42 = 255;
						}
						this.field2274[var41] = (byte) var42;
					}
				}
			}
		}
	}

	@ObfuscatedName("le.b(ZZ)Lcg;")
	@Override
	public ModelLit method185(boolean arg0, boolean arg1) {
		if (!arg0 && field2311.length < this.numFaces) {
			field2311 = new byte[this.numFaces + 100];
		}
		return this.method846(arg0, field2284, field2311);
	}

	@ObfuscatedName("le.a(ZZ)Lcg;")
	@Override
	public ModelLit method184(boolean arg0, boolean arg1) {
		if (!arg0 && field2280.length < this.numFaces) {
			field2280 = new byte[this.numFaces + 100];
		}
		return this.method846(arg0, field2278, field2280);
	}

	@ObfuscatedName("le.i()I")
	@Override
	public int method196() {
		if (!this.field2258) {
			this.method844();
		}
		return this.field2275;
	}

	@ObfuscatedName("le.d(III)V")
	@Override
	public void method183(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2271; var4++) {
			this.field2264[var4] = this.field2264[var4] * arg0 / 128;
			this.field2286[var4] = this.field2286[var4] * arg1 / 128;
			this.field2287[var4] = this.field2287[var4] * arg2 / 128;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.e(I)V")
	public void method841(int arg0) {
		int var2 = Pix3D.field3363;
		int var3 = Pix3D.field3361;
		int var4 = 0;
		int var5 = this.faceVertexA[arg0];
		int var6 = this.faceVertexB[arg0];
		int var7 = this.faceVertexC[arg0];
		int var8 = vertexViewSpaceZ[var5];
		int var9 = vertexViewSpaceZ[var6];
		int var10 = vertexViewSpaceZ[var7];
		if (this.field2274 == null) {
			Pix3D.field3348 = 0;
		} else {
			Pix3D.field3348 = this.field2274[arg0] & 0xFF;
		}
		if (var8 >= 50) {
			field2307[0] = vertexScreenX[var5];
			field2304[0] = field2300[var5];
			var4++;
			field2301[0] = this.field2289[arg0];
		} else {
			int var11 = vertexViewSpaceX[var5];
			int var12 = vertexViewSpaceY[var5];
			int var13 = this.field2289[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * Pix3D.field3352[var10 - var8];
				field2307[0] = var2 + (var11 + ((vertexViewSpaceX[var7] - var11) * var14 >> 16) << 9) / 50;
				field2304[0] = var3 + (var12 + ((vertexViewSpaceY[var7] - var12) * var14 >> 16) << 9) / 50;
				var4++;
				field2301[0] = var13 + ((this.faceColourC[arg0] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * Pix3D.field3352[var9 - var8];
				field2307[var4] = var2 + (var11 + ((vertexViewSpaceX[var6] - var11) * var15 >> 16) << 9) / 50;
				field2304[var4] = var3 + (var12 + ((vertexViewSpaceY[var6] - var12) * var15 >> 16) << 9) / 50;
				field2301[var4++] = var13 + ((this.field2283[arg0] - var13) * var15 >> 16);
			}
		}
		if (var9 >= 50) {
			field2307[var4] = vertexScreenX[var6];
			field2304[var4] = field2300[var6];
			field2301[var4++] = this.field2283[arg0];
		} else {
			int var16 = vertexViewSpaceX[var6];
			int var17 = vertexViewSpaceY[var6];
			int var18 = this.field2283[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * Pix3D.field3352[var8 - var9];
				field2307[var4] = var2 + (var16 + ((vertexViewSpaceX[var5] - var16) * var19 >> 16) << 9) / 50;
				field2304[var4] = var3 + (var17 + ((vertexViewSpaceY[var5] - var17) * var19 >> 16) << 9) / 50;
				field2301[var4++] = var18 + ((this.field2289[arg0] - var18) * var19 >> 16);
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * Pix3D.field3352[var10 - var9];
				field2307[var4] = var2 + (var16 + ((vertexViewSpaceX[var7] - var16) * var20 >> 16) << 9) / 50;
				field2304[var4] = var3 + (var17 + ((vertexViewSpaceY[var7] - var17) * var20 >> 16) << 9) / 50;
				field2301[var4++] = var18 + ((this.faceColourC[arg0] - var18) * var20 >> 16);
			}
		}
		if (var10 >= 50) {
			field2307[var4] = vertexScreenX[var7];
			field2304[var4] = field2300[var7];
			field2301[var4++] = this.faceColourC[arg0];
		} else {
			int var21 = vertexViewSpaceX[var7];
			int var22 = vertexViewSpaceY[var7];
			int var23 = this.faceColourC[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * Pix3D.field3352[var9 - var10];
				field2307[var4] = var2 + (var21 + ((vertexViewSpaceX[var6] - var21) * var24 >> 16) << 9) / 50;
				field2304[var4] = var3 + (var22 + ((vertexViewSpaceY[var6] - var22) * var24 >> 16) << 9) / 50;
				field2301[var4++] = var23 + ((this.field2283[arg0] - var23) * var24 >> 16);
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * Pix3D.field3352[var8 - var10];
				field2307[var4] = var2 + (var21 + ((vertexViewSpaceX[var5] - var21) * var25 >> 16) << 9) / 50;
				field2304[var4] = var3 + (var22 + ((vertexViewSpaceY[var5] - var22) * var25 >> 16) << 9) / 50;
				field2301[var4++] = var23 + ((this.field2289[arg0] - var23) * var25 >> 16);
			}
		}
		int var26 = field2307[0];
		int var27 = field2307[1];
		int var28 = field2307[2];
		int var29 = field2304[0];
		int var30 = field2304[1];
		int var31 = field2304[2];
		Pix3D.field3358 = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.field3350 || var27 > Pix3D.field3350 || var28 > Pix3D.field3350) {
				Pix3D.field3358 = true;
			}
			if (this.field2272 != null && this.field2272[arg0] != -1) {
				int var33;
				int var34;
				int var35;
				if (this.field2265 == null || this.field2265[arg0] == -1) {
					var33 = var5;
					var34 = var6;
					var35 = var7;
				} else {
					int var32 = this.field2265[arg0] & 0xFF;
					var33 = this.field2276[var32];
					var34 = this.field2261[var32];
					var35 = this.field2267[var32];
				}
				if (this.faceColourC[arg0] == -1) {
					Pix3D.method1237(var29, var30, var31, var26, var27, var28, this.field2289[arg0], this.field2289[arg0], this.field2289[arg0], vertexViewSpaceX[var33], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceY[var33], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceZ[var33], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], this.field2272[arg0]);
				} else {
					Pix3D.method1237(var29, var30, var31, var26, var27, var28, field2301[0], field2301[1], field2301[2], vertexViewSpaceX[var33], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceY[var33], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceZ[var33], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], this.field2272[arg0]);
				}
			} else if (this.faceColourC[arg0] == -1) {
				Pix3D.method1233(var29, var30, var31, var26, var27, var28, Pix3D.field3349[this.field2289[arg0]]);
			} else {
				Pix3D.method1227(var29, var30, var31, var26, var27, var28, field2301[0], field2301[1], field2301[2]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix3D.field3350 || var27 > Pix3D.field3350 || var28 > Pix3D.field3350 || field2307[3] < 0 || field2307[3] > Pix3D.field3350) {
			Pix3D.field3358 = true;
		}
		if (this.field2272 == null || this.field2272[arg0] == -1) {
			if (this.faceColourC[arg0] == -1) {
				int var36 = Pix3D.field3349[this.field2289[arg0]];
				Pix3D.method1233(var29, var30, var31, var26, var27, var28, var36);
				Pix3D.method1233(var29, var31, field2304[3], var26, var28, field2307[3], var36);
				return;
			}
			Pix3D.method1227(var29, var30, var31, var26, var27, var28, field2301[0], field2301[1], field2301[2]);
			Pix3D.method1227(var29, var31, field2304[3], var26, var28, field2307[3], field2301[0], field2301[2], field2301[3]);
			return;
		}
		int var38;
		int var39;
		int var40;
		if (this.field2265 == null || this.field2265[arg0] == -1) {
			var38 = var5;
			var39 = var6;
			var40 = var7;
		} else {
			int var37 = this.field2265[arg0] & 0xFF;
			var38 = this.field2276[var37];
			var39 = this.field2261[var37];
			var40 = this.field2267[var37];
		}
		short var41 = this.field2272[arg0];
		if (this.faceColourC[arg0] == -1) {
			Pix3D.method1237(var29, var30, var31, var26, var27, var28, this.field2289[arg0], this.field2289[arg0], this.field2289[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
			Pix3D.method1237(var29, var31, field2304[3], var26, var28, field2307[3], this.field2289[arg0], this.field2289[arg0], this.field2289[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
			return;
		}
		Pix3D.method1237(var29, var30, var31, var26, var27, var28, field2301[0], field2301[1], field2301[2], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
		Pix3D.method1237(var29, var31, field2304[3], var26, var28, field2307[3], field2301[0], field2301[2], field2301[3], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], var41);
	}

	@ObfuscatedName("le.j()I")
	@Override
	public int method198() {
		if (!this.field2258) {
			this.method844();
		}
		return this.field2262;
	}

	@ObfuscatedName("le.f()V")
	@Override
	public void method190() {
		for (int var1 = 0; var1 < this.field2271; var1++) {
			this.field2264[var1] = -this.field2264[var1];
			this.field2287[var1] = -this.field2287[var1];
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.a(Lli;IZ)V")
	@Override
	public void method187(AnimFrameSet arg0, int arg1, boolean arg2) {
		if (this.field2288 == null || arg1 == -1) {
			return;
		}
		AnimFrame var4 = arg0.field2421[arg1];
		AnimBase var5 = var4.field3786;
		field2308 = 0;
		field2312 = 0;
		field2310 = 0;
		for (int var6 = 0; var6 < var4.field3779; var6++) {
			short var7 = var4.field3781[var6];
			if (var4.field3774[var6] != -1) {
				this.method840(0, var5.field1423[var4.field3774[var6]], 0, 0, 0);
			}
			this.method840(var5.field1409[var7], var5.field1423[var7], var4.field3783[var6], var4.field3780[var6], var4.field3785[var6]);
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.a(Lli;ILli;I[IZ)V")
	@Override
	public void method189(AnimFrameSet arg0, int arg1, AnimFrameSet arg2, int arg3, int[] arg4, boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method187(arg0, arg1, arg5);
			return;
		}
		AnimFrame var7 = arg0.field2421[arg1];
		AnimFrame var8 = arg2.field2421[arg3];
		AnimBase var9 = var7.field3786;
		field2308 = 0;
		field2312 = 0;
		field2310 = 0;
		byte var10 = 0;
		int var18 = var10 + 1;
		int var11 = arg4[0];
		for (int var12 = 0; var12 < var7.field3779; var12++) {
			short var13 = var7.field3781[var12];
			while (var13 > var11) {
				var11 = arg4[var18++];
			}
			if (var13 != var11 || var9.field1409[var13] == 0) {
				if (var7.field3774[var12] != -1) {
					this.method840(0, var9.field1423[var7.field3774[var12]], 0, 0, 0);
				}
				this.method840(var9.field1409[var13], var9.field1423[var13], var7.field3783[var12], var7.field3780[var12], var7.field3785[var12]);
			}
		}
		field2308 = 0;
		field2312 = 0;
		field2310 = 0;
		byte var14 = 0;
		int var19 = var14 + 1;
		int var15 = arg4[0];
		for (int var16 = 0; var16 < var8.field3779; var16++) {
			short var17 = var8.field3781[var16];
			while (var17 > var15) {
				var15 = arg4[var19++];
			}
			if (var17 == var15 || var9.field1409[var17] == 0) {
				if (var8.field3774[var16] != -1) {
					this.method840(0, var9.field1423[var8.field3774[var16]], 0, 0, 0);
				}
				this.method840(var9.field1409[var17], var9.field1423[var17], var8.field3783[var16], var8.field3780[var16], var8.field3785[var16]);
			}
		}
		this.field2258 = false;
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
		for (int var9 = 0; var9 < this.field2271; var9++) {
			int var10 = this.field2264[var9];
			int var11 = this.field2286[var9];
			int var12 = this.field2287[var9];
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
		this.field2257 = (short) var1;
		this.field2275 = (short) var4;
		this.field2277 = (short) var2;
		this.field2279 = (short) var5;
		this.field2269 = (short) var3;
		this.field2262 = (short) var6;
		this.field2270 = (short) (Math.sqrt((double) var7) + 0.99D);
		this.field2268 = (short) (Math.sqrt((double) var8) + 0.99D);
		this.field2258 = true;
	}

	@ObfuscatedName("le.b()I")
	@Override
	public int method88() {
		if (!this.field2258) {
			this.method844();
		}
		return this.field2277;
	}

	@ObfuscatedName("le.d(I)V")
	@Override
	public void method197(int arg0) {
		int var2 = Pix3D.field3359[arg0];
		int var3 = Pix3D.field3354[arg0];
		for (int var4 = 0; var4 < this.field2271; var4++) {
			int var5 = this.field2286[var4] * var3 - this.field2287[var4] * var2 >> 16;
			this.field2287[var4] = this.field2286[var4] * var2 + this.field2287[var4] * var3 >> 16;
			this.field2286[var4] = var5;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.c(I)V")
	@Override
	public void method191(int arg0) {
		int var2 = Pix3D.field3359[arg0];
		int var3 = Pix3D.field3354[arg0];
		for (int var4 = 0; var4 < this.field2271; var4++) {
			int var5 = this.field2286[var4] * var2 + this.field2264[var4] * var3 >> 16;
			this.field2286[var4] = this.field2286[var4] * var3 - this.field2264[var4] * var2 >> 16;
			this.field2264[var4] = var5;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.a(ZLle;[B)Lcg;")
	public ModelLit method846(boolean arg0, SoftwareModelLit arg1, byte[] arg2) {
		arg1.field2271 = this.field2271;
		arg1.numFaces = this.numFaces;
		arg1.field2263 = this.field2263;
		if (arg1.field2264 == null || arg1.field2264.length < this.field2271) {
			arg1.field2264 = new int[this.field2271 + 100];
			arg1.field2286 = new int[this.field2271 + 100];
			arg1.field2287 = new int[this.field2271 + 100];
		}
		for (int var4 = 0; var4 < this.field2271; var4++) {
			arg1.field2264[var4] = this.field2264[var4];
			arg1.field2286[var4] = this.field2286[var4];
			arg1.field2287[var4] = this.field2287[var4];
		}
		if (arg0) {
			arg1.field2274 = this.field2274;
		} else {
			arg1.field2274 = arg2;
			if (this.field2274 == null) {
				for (int var5 = 0; var5 < this.numFaces; var5++) {
					arg1.field2274[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.numFaces; var6++) {
					arg1.field2274[var6] = this.field2274[var6];
				}
			}
		}
		arg1.faceVertexA = this.faceVertexA;
		arg1.faceVertexB = this.faceVertexB;
		arg1.faceVertexC = this.faceVertexC;
		arg1.field2289 = this.field2289;
		arg1.field2283 = this.field2283;
		arg1.faceColourC = this.faceColourC;
		arg1.field2260 = this.field2260;
		arg1.field2265 = this.field2265;
		arg1.field2272 = this.field2272;
		arg1.field2281 = this.field2281;
		arg1.field2276 = this.field2276;
		arg1.field2261 = this.field2261;
		arg1.field2267 = this.field2267;
		arg1.field2288 = this.field2288;
		arg1.field2285 = this.field2285;
		arg1.field494 = super.field494;
		arg1.field2258 = false;
		return arg1;
	}

	@ObfuscatedName("le.a(II[[I[[IIIIZ)Lle;")
	public SoftwareModelLit hillSkew(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (!this.field2258) {
			this.method844();
		}
		int var9 = arg4 + this.field2257;
		int var10 = arg4 + this.field2275;
		int var11 = arg6 + this.field2269;
		int var12 = arg6 + this.field2262;
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
			var17.field2271 = this.field2271;
			var17.numFaces = this.numFaces;
			var17.field2263 = this.field2263;
			var17.faceVertexA = this.faceVertexA;
			var17.faceVertexB = this.faceVertexB;
			var17.faceVertexC = this.faceVertexC;
			var17.field2289 = this.field2289;
			var17.field2283 = this.field2283;
			var17.faceColourC = this.faceColourC;
			var17.field2260 = this.field2260;
			var17.field2274 = this.field2274;
			var17.field2265 = this.field2265;
			var17.field2272 = this.field2272;
			var17.field2281 = this.field2281;
			var17.field2276 = this.field2276;
			var17.field2261 = this.field2261;
			var17.field2267 = this.field2267;
			var17.field2288 = this.field2288;
			var17.field2285 = this.field2285;
			var17.field494 = super.field494;
			if (arg0 == 3) {
				var17.field2264 = Statics.method169(this.field2264);
				var17.field2286 = Statics.method169(this.field2286);
				var17.field2287 = Statics.method169(this.field2287);
			} else {
				var17.field2264 = this.field2264;
				var17.field2286 = new int[var17.field2271];
				var17.field2287 = this.field2287;
			}
		} else {
			var17 = this;
		}
		if (arg0 == 1) {
			for (int var18 = 0; var18 < var17.field2271; var18++) {
				int var19 = this.field2264[var18] + arg4;
				int var20 = this.field2287[var18] + arg6;
				int var21 = var19 & 0x7F;
				int var22 = var20 & 0x7F;
				int var23 = var19 >> 7;
				int var24 = var20 >> 7;
				int var25 = arg2[var23][var24] * (128 - var21) + arg2[var23 + 1][var24] * var21 >> 7;
				int var26 = arg2[var23][var24 + 1] * (128 - var21) + arg2[var23 + 1][var24 + 1] * var21 >> 7;
				int var27 = var25 * (128 - var22) + var26 * var22 >> 7;
				var17.field2286[var18] = this.field2286[var18] + var27 - arg5;
			}
		} else if (arg0 == 2) {
			for (int var28 = 0; var28 < var17.field2271; var28++) {
				int var29 = (this.field2286[var28] << 16) / this.field2277;
				if (var29 < arg1) {
					int var30 = this.field2264[var28] + arg4;
					int var31 = this.field2287[var28] + arg6;
					int var32 = var30 & 0x7F;
					int var33 = var31 & 0x7F;
					int var34 = var30 >> 7;
					int var35 = var31 >> 7;
					int var36 = arg2[var34][var35] * (128 - var32) + arg2[var34 + 1][var35] * var32 >> 7;
					int var37 = arg2[var34][var35 + 1] * (128 - var32) + arg2[var34 + 1][var35 + 1] * var32 >> 7;
					int var38 = var36 * (128 - var33) + var37 * var33 >> 7;
					var17.field2286[var28] = this.field2286[var28] + (var38 - arg5) * (arg1 - var29) / arg1;
				} else {
					var17.field2286[var28] = this.field2286[var28];
				}
			}
		} else if (arg0 == 3) {
			int var39 = (arg1 & 0xFF) * 4;
			int var40 = (arg1 >> 8 & 0xFF) * 4;
			var17.method199(arg2, arg4, arg5, arg6, var39, var40);
		} else if (arg0 == 4) {
			int var41 = this.field2279 - this.field2277;
			for (int var42 = 0; var42 < this.field2271; var42++) {
				int var43 = this.field2264[var42] + arg4;
				int var44 = this.field2287[var42] + arg6;
				int var45 = var43 & 0x7F;
				int var46 = var44 & 0x7F;
				int var47 = var43 >> 7;
				int var48 = var44 >> 7;
				int var49 = arg3[var47][var48] * (128 - var45) + arg3[var47 + 1][var48] * var45 >> 7;
				int var50 = arg3[var47][var48 + 1] * (128 - var45) + arg3[var47 + 1][var48 + 1] * var45 >> 7;
				int var51 = var49 * (128 - var46) + var50 * var46 >> 7;
				var17.field2286[var42] = this.field2286[var42] + var51 + var41 - arg5;
			}
		} else if (arg0 == 5) {
			int var52 = this.field2279 - this.field2277;
			for (int var53 = 0; var53 < this.field2271; var53++) {
				int var54 = this.field2264[var53] + arg4;
				int var55 = this.field2287[var53] + arg6;
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
				var17.field2286[var53] = ((this.field2286[var53] << 8) / var52 * var66 >> 8) - (arg5 - var62);
			}
		}
		var17.field2258 = false;
		return var17;
	}

	@ObfuscatedName("le.e()I")
	@Override
	public int method186() {
		if (!this.field2258) {
			this.method844();
		}
		return this.field2269;
	}

	@ObfuscatedName("le.a(IIIIIIII)Z")
	public boolean method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
	public void method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (!this.field2258) {
				this.method844();
			}
			int var8 = Pix3D.field3363;
			int var9 = Pix3D.field3361;
			int var10 = Pix3D.field3359[0];
			int var11 = Pix3D.field3354[0];
			int var12 = Pix3D.field3359[arg0];
			int var13 = Pix3D.field3354[arg0];
			int var14 = Pix3D.field3359[arg1];
			int var15 = Pix3D.field3354[arg1];
			int var16 = Pix3D.field3359[arg2];
			int var17 = Pix3D.field3354[arg2];
			int var18 = arg4 * var16 + arg5 * var17 >> 16;
			for (int var19 = 0; var19 < this.field2271; var19++) {
				int var20 = this.field2264[var19];
				int var21 = this.field2286[var19];
				int var22 = this.field2287[var19];
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
				field2300[var19] = var9 + (var28 << 9) / arg6;
				if (this.field2263 > 0) {
					vertexViewSpaceX[var19] = var25;
					vertexViewSpaceY[var19] = var28;
					vertexViewSpaceZ[var19] = var29;
				}
			}
			this.render2(false, false, 0L, this.field2268, this.field2268 << 1);
		} catch (RuntimeException var30) {
		}
	}

	@ObfuscatedName("le.c()V")
	@Override
	public void method181() {
		for (int var1 = 0; var1 < this.field2271; var1++) {
			int var2 = this.field2287[var1];
			this.field2287[var1] = this.field2264[var1];
			this.field2264[var1] = -var2;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.c(III)V")
	@Override
	public void method180(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2271; var4++) {
			this.field2264[var4] += arg0;
			this.field2286[var4] += arg1;
			this.field2287[var4] += arg2;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.b(I)V")
	@Override
	public void method188(int arg0) {
		int var2 = Pix3D.field3359[arg0];
		int var3 = Pix3D.field3354[arg0];
		for (int var4 = 0; var4 < this.field2271; var4++) {
			int var5 = this.field2287[var4] * var2 + this.field2264[var4] * var3 >> 16;
			this.field2287[var4] = this.field2287[var4] * var3 - this.field2264[var4] * var2 >> 16;
			this.field2264[var4] = var5;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.d()V")
	@Override
	public void method182() {
		for (int var1 = 0; var1 < this.field2271; var1++) {
			int var2 = this.field2264[var1];
			this.field2264[var1] = this.field2287[var1];
			this.field2287[var1] = -var2;
		}
		this.field2258 = false;
	}

	@ObfuscatedName("le.a(IIIIIII)V")
	@Override
	public void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (!this.field2258) {
				this.method844();
			}
			int var7 = Pix3D.field3363;
			int var8 = Pix3D.field3361;
			int var9 = Pix3D.field3359[0];
			int var10 = Pix3D.field3354[0];
			int var11 = Pix3D.field3359[arg0];
			int var12 = Pix3D.field3354[arg0];
			int var13 = Pix3D.field3359[arg1];
			int var14 = Pix3D.field3354[arg1];
			int var15 = Pix3D.field3359[arg2];
			int var16 = Pix3D.field3354[arg2];
			int var17 = arg4 * var15 + arg5 * var16 >> 16;
			for (int var18 = 0; var18 < this.field2271; var18++) {
				int var19 = this.field2264[var18];
				int var20 = this.field2286[var18];
				int var21 = this.field2287[var18];
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
				field2300[var18] = var8 + (var27 << 9) / var28;
				if (this.field2263 > 0) {
					vertexViewSpaceX[var18] = var24;
					vertexViewSpaceY[var18] = var27;
					vertexViewSpaceZ[var18] = var28;
				}
			}
			this.render2(false, false, 0L, this.field2268, this.field2268 << 1);
		} catch (RuntimeException var29) {
		}
	}

	@ObfuscatedName("le.g()I")
	@Override
	public int method192() {
		if (!this.field2258) {
			this.method844();
		}
		return this.field2270;
	}

	@ObfuscatedName("le.a(Lcg;)Lcg;")
	public ModelLit method850(ModelLit arg0) {
		return new SoftwareModelLit(new SoftwareModelLit[] { this, (SoftwareModelLit) arg0 }, 2);
	}

	@ObfuscatedName("le.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		if (!this.field2258) {
			this.method844();
		}
		int var11 = arg7 * arg4 - arg5 * arg3 >> 16;
		int var12 = arg6 * arg1 + var11 * arg2 >> 16;
		int var13 = var12 + (this.field2270 * arg2 + this.field2279 * arg1 >> 16);
		if (var13 <= 50) {
			return;
		}
		int var14 = var12 + (-this.field2270 * arg2 + this.field2277 * arg1 >> 16);
		if (var14 >= 3500) {
			return;
		}
		int var15 = arg7 * arg3 + arg5 * arg4 >> 16;
		int var16 = var15 + this.field2270 << 9;
		if (var16 / var13 <= Statics.field2766) {
			return;
		}
		int var17 = var15 - this.field2270 << 9;
		if (var17 / var13 >= Statics.field2931) {
			return;
		}
		int var18 = arg6 * arg2 - var11 * arg1 >> 16;
		int var19 = var18 + (this.field2270 * arg1 + this.field2279 * arg2 >> 16) << 9;
		if (var19 / var13 <= Statics.field1102) {
			return;
		}
		int var20 = var18 + (-this.field2270 * arg1 + this.field2277 * arg2 >> 16) << 9;
		if (var20 / var13 >= Statics.field4055) {
			return;
		}
		boolean var21 = false;
		boolean var22 = var14 <= 50;
		boolean var23 = var22 || this.field2263 > 0;
		int var24 = Pix3D.field3363;
		int var25 = Pix3D.field3361;
		int var26 = 0;
		int var27 = 0;
		if (arg0 != 0) {
			var26 = Pix3D.field3359[arg0];
			var27 = Pix3D.field3354[arg0];
		}
		boolean var28 = false;
		if (arg8 > 0L && Statics.field997 && var14 > 0) {
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
			if (Statics.field2610 >= var29 && Statics.field2610 <= var30 && Statics.field3604 >= var31 && Statics.field3604 <= var32) {
				int var33 = 999999;
				int var34 = -999999;
				int var35 = 999999;
				int var36 = -999999;
				int[] var37 = new int[] { this.field2257, this.field2275, this.field2257, this.field2275, this.field2257, this.field2275, this.field2257, this.field2275 };
				int[] var38 = new int[] { this.field2269, this.field2269, this.field2262, this.field2262, this.field2269, this.field2269, this.field2262, this.field2262 };
				int[] var39 = new int[] { this.field2277, this.field2277, this.field2277, this.field2277, this.field2279, this.field2279, this.field2279, this.field2279 };
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
				if (Statics.field2610 >= var33 && Statics.field2610 <= var34 && Statics.field3604 >= var35 && Statics.field3604 <= var36) {
					if (super.field494) {
						field476[field3101++] = arg8;
					} else {
						var28 = true;
					}
				}
			}
		}
		for (int var55 = 0; var55 < this.field2271; var55++) {
			int var56 = this.field2264[var55];
			int var57 = this.field2286[var55];
			int var58 = this.field2287[var55];
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
				field2300[var55] = var25 + (var66 << 9) / var67;
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
	public void method851(int arg0) {
		if (faceNearClipped[arg0]) {
			this.method841(arg0);
			return;
		}
		int var2 = this.faceVertexA[arg0];
		int var3 = this.faceVertexB[arg0];
		int var4 = this.faceVertexC[arg0];
		Pix3D.field3358 = field2309[arg0];
		if (this.field2274 == null) {
			Pix3D.field3348 = 0;
		} else {
			Pix3D.field3348 = this.field2274[arg0] & 0xFF;
		}
		if (this.field2272 != null && this.field2272[arg0] != -1) {
			int var6;
			int var7;
			int var8;
			if (this.field2265 == null || this.field2265[arg0] == -1) {
				var6 = var2;
				var7 = var3;
				var8 = var4;
			} else {
				int var5 = this.field2265[arg0] & 0xFF;
				var6 = this.field2276[var5];
				var7 = this.field2261[var5];
				var8 = this.field2267[var5];
			}
			if (this.faceColourC[arg0] == -1) {
				Pix3D.method1237(field2300[var2], field2300[var3], field2300[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.field2289[arg0], this.field2289[arg0], this.field2289[arg0], vertexViewSpaceX[var6], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceY[var6], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceZ[var6], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], this.field2272[arg0]);
			} else {
				Pix3D.method1237(field2300[var2], field2300[var3], field2300[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.field2289[arg0], this.field2283[arg0], this.faceColourC[arg0], vertexViewSpaceX[var6], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceY[var6], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceZ[var6], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], this.field2272[arg0]);
			}
		} else if (this.faceColourC[arg0] == -1) {
			Pix3D.method1233(field2300[var2], field2300[var3], field2300[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], Pix3D.field3349[this.field2289[arg0]]);
		} else {
			Pix3D.method1227(field2300[var2], field2300[var3], field2300[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.field2289[arg0], this.field2283[arg0], this.faceColourC[arg0]);
		}
	}
}
