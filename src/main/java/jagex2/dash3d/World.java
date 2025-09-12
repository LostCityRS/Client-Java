package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public class World {

	@ObfuscatedName("c.f")
	public static boolean lowMem = true;

	@ObfuscatedName("c.g")
	public static int levelBuilt;

	@ObfuscatedName("c.h")
	public static boolean fullbright;

	@ObfuscatedName("c.i")
	public int maxTileX;

	@ObfuscatedName("c.j")
	public int maxTileZ;

	@ObfuscatedName("c.k")
	public int[][][] heightmap;

	@ObfuscatedName("c.l")
	public byte[][][] flags;

	@ObfuscatedName("c.m")
	public byte[][][] underlayType;

	@ObfuscatedName("c.n")
	public byte[][][] overlayType;

	@ObfuscatedName("c.o")
	public byte[][][] overlayShape;

	@ObfuscatedName("c.p")
	public byte[][][] overlayAngle;

	@ObfuscatedName("c.q")
	public byte[][][] shadow;

	@ObfuscatedName("c.r")
	public int[][] lightness;

	@ObfuscatedName("c.s")
	public int[] blendChroma;

	@ObfuscatedName("c.t")
	public int[] blendSaturation;

	@ObfuscatedName("c.u")
	public int[] blendLightness;

	@ObfuscatedName("c.v")
	public int[] blendLuminance;

	@ObfuscatedName("c.w")
	public int[] blendMagnitude;

	@ObfuscatedName("c.x")
	public int[][][] occlusion;

	@ObfuscatedName("c.y")
	public static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.z")
	public static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.A")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.B")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.C")
	public static int randomHueOffset = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.D")
	public static int randomLightnessOffset = (int) (Math.random() * 33.0D) - 16;

	public World(byte[][][] arg0, int[][][] arg1, int arg2, int arg4) {
		this.maxTileX = arg2;
		this.maxTileZ = arg4;
		this.heightmap = arg1;
		this.flags = arg0;
		this.underlayType = new byte[4][this.maxTileX][this.maxTileZ];
		this.overlayType = new byte[4][this.maxTileX][this.maxTileZ];
		this.overlayShape = new byte[4][this.maxTileX][this.maxTileZ];
		this.overlayAngle = new byte[4][this.maxTileX][this.maxTileZ];
		this.occlusion = new int[4][this.maxTileX + 1][this.maxTileZ + 1];
		this.shadow = new byte[4][this.maxTileX + 1][this.maxTileZ + 1];
		this.lightness = new int[this.maxTileX + 1][this.maxTileZ + 1];
		this.blendChroma = new int[this.maxTileZ];
		this.blendSaturation = new int[this.maxTileZ];
		this.blendLightness = new int[this.maxTileZ];
		this.blendLuminance = new int[this.maxTileZ];
		this.blendMagnitude = new int[this.maxTileZ];
	}

	@ObfuscatedName("c.a(IIIII)V")
	public final void spreadHeight(int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
			for (int var7 = arg3; var7 <= arg3 + arg1; var7++) {
				if (var7 >= 0 && var7 < this.maxTileX && var6 >= 0 && var6 < this.maxTileZ) {
					this.shadow[0][var7][var6] = 127;
					if (var7 == arg3 && var7 > 0) {
						this.heightmap[0][var7][var6] = this.heightmap[0][var7 - 1][var6];
					}
					if (var7 == arg3 + arg1 && var7 < this.maxTileX - 1) {
						this.heightmap[0][var7][var6] = this.heightmap[0][var7 + 1][var6];
					}
					if (var6 == arg2 && var6 > 0) {
						this.heightmap[0][var7][var6] = this.heightmap[0][var7][var6 - 1];
					}
					if (var6 == arg2 + arg4 && var6 < this.maxTileZ - 1) {
						this.heightmap[0][var7][var6] = this.heightmap[0][var7][var6 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(Z[BIIII)V")
	public final void loadGround(byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
		Packet var7 = new Packet(arg1);
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					int var11 = var9 + arg4;
					int var12 = var10 + arg3;
					if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
						this.flags[var8][var11][var12] = 0;
						while (true) {
							int var13 = var7.g1();
							if (var13 == 0) {
								if (var8 == 0) {
									this.heightmap[0][var11][var12] = -perlinNoise(var11 + 932731 + arg2, var12 + 556238 + arg5) * 8;
								} else {
									this.heightmap[var8][var11][var12] = this.heightmap[var8 - 1][var11][var12] - 240;
								}
								break;
							}
							if (var13 == 1) {
								int var14 = var7.g1();
								if (var14 == 1) {
									var14 = 0;
								}
								if (var8 == 0) {
									this.heightmap[0][var11][var12] = -var14 * 8;
								} else {
									this.heightmap[var8][var11][var12] = this.heightmap[var8 - 1][var11][var12] - var14 * 8;
								}
								break;
							}
							if (var13 <= 49) {
								this.overlayType[var8][var11][var12] = var7.g1b();
								this.overlayShape[var8][var11][var12] = (byte) ((var13 - 2) / 4);
								this.overlayAngle[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
							} else if (var13 <= 81) {
								this.flags[var8][var11][var12] = (byte) (var13 - 49);
							} else {
								this.underlayType[var8][var11][var12] = (byte) (var13 - 81);
							}
						}
					} else {
						while (true) {
							int var15 = var7.g1();
							if (var15 == 0) {
								break;
							}
							if (var15 == 1) {
								var7.g1();
								break;
							}
							if (var15 <= 49) {
								var7.g1();
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a([BIBI)Z")
	public static final boolean checkLocations(byte[] arg0, int arg1, int arg3) {
		boolean var4 = true;
		Packet var5 = new Packet(arg0);
		int var6 = -1;
		label52: while (true) {
			int var7 = var5.gsmarts();
			if (var7 == 0) {
				return var4;
			}
			var6 += var7;
			int var8 = 0;
			boolean var9 = false;
			while (true) {
				while (!var9) {
					int var11 = var5.gsmarts();
					if (var11 == 0) {
						continue label52;
					}
					var8 += var11 - 1;
					int var12 = var8 & 0x3F;
					int var13 = var8 >> 6 & 0x3F;
					int var14 = var5.g1() >> 2;
					int var15 = var13 + arg3;
					int var16 = var12 + arg1;
					if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
						LocType var17 = LocType.get(var6);
						if (var14 != 22 || !lowMem || var17.active || var17.forcedecor) {
							var4 &= var17.checkModelAll();
							var9 = true;
						}
					}
				}
				int var10 = var5.gsmarts();
				if (var10 == 0) {
					break;
				}
				var5.g1();
			}
		}
	}

	@ObfuscatedName("c.a(ILmb;Lvb;)V")
	public static final void prefetchLocations(Packet arg1, OnDemand arg2) {
		int var3 = -1;
		while (true) {
			int var4 = arg1.gsmarts();
			if (var4 == 0) {
				return;
			}
			var3 += var4;
			LocType var5 = LocType.get(var3);
			var5.prefetch(arg2);
			while (true) {
				int var6 = arg1.gsmarts();
				if (var6 == 0) {
					break;
				}
				arg1.g1();
			}
		}
	}

	@ObfuscatedName("c.a([Ljc;I[BIBLs;)V")
	public final void loadLocations(CollisionMap[] arg0, int arg1, byte[] arg2, int arg3, World3D arg5) {
		Packet var7 = new Packet(arg2);
		int var8 = -1;
		while (true) {
			int var9 = var7.gsmarts();
			if (var9 == 0) {
				return;
			}
			var8 += var9;
			int var10 = 0;
			while (true) {
				int var11 = var7.gsmarts();
				if (var11 == 0) {
					break;
				}
				var10 += var11 - 1;
				int var12 = var10 & 0x3F;
				int var13 = var10 >> 6 & 0x3F;
				int var14 = var10 >> 12;
				int var15 = var7.g1();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var18 = var13 + arg3;
				int var19 = var12 + arg1;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					int var20 = var14;
					if ((this.flags[1][var18][var19] & 0x2) == 2) {
						var20 = var14 - 1;
					}
					CollisionMap var21 = null;
					if (var20 >= 0) {
						var21 = arg0[var20];
					}
					this.addLoc(var16, var18, var19, var17, var8, var14, var21, arg5);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIIIIIILjc;Ls;)V")
	public final void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg6, CollisionMap arg7, World3D arg8) {
		if (lowMem) {
			if ((this.flags[arg6][arg1][arg2] & 0x10) != 0) {
				return;
			}
			if (this.getDrawLevel(arg1, arg6, arg2) != levelBuilt) {
				return;
			}
		}
		int var10 = this.heightmap[arg6][arg1][arg2];
		int var11 = this.heightmap[arg6][arg1 + 1][arg2];
		int var12 = this.heightmap[arg6][arg1 + 1][arg2 + 1];
		int var13 = this.heightmap[arg6][arg1][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.get(arg4);
		int var16 = arg1 + (arg2 << 7) + (arg4 << 14) + 1073741824;
		if (!var15.active) {
			var16 += Integer.MIN_VALUE;
		}
		byte var17 = (byte) ((arg3 << 6) + arg0);
		if (arg0 == 22) {
			if (!lowMem || var15.active || var15.forcedecor) {
				ModelSource var18;
				if (var15.anim == -1) {
					var18 = var15.getModel(22, arg3, var10, var11, var12, var13, -1);
				} else {
					var18 = new ClientLocAnim(var12, arg4, true, var10, var13, 22, arg3, var11, var15.anim);
				}
				arg8.addGroundDecor(arg2, arg1, arg6, var16, var17, var18, var14);
				if (var15.blockwalk && var15.active && arg7 != null) {
					arg7.setBlocked(arg1, arg2);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			ModelSource var19;
			if (var15.anim == -1) {
				var19 = var15.getModel(10, arg3, var10, var11, var12, var13, -1);
			} else {
				var19 = new ClientLocAnim(var12, arg4, true, var10, var13, 10, arg3, var11, var15.anim);
			}
			if (var19 != null) {
				int var20 = 0;
				if (arg0 == 11) {
					var20 += 256;
				}
				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.length;
					var22 = var15.width;
				} else {
					var21 = var15.width;
					var22 = var15.length;
				}
				if (arg8.addLoc(var16, arg1, var19, var14, var21, arg2, var20, var17, var22, arg6) && var15.shadow) {
					Model var23;
					if (var19 instanceof Model) {
						var23 = (Model) var19;
					} else {
						var23 = var15.getModel(10, arg3, var10, var11, var12, var13, -1);
					}
					if (var23 != null) {
						for (int var24 = 0; var24 <= var21; var24++) {
							for (int var25 = 0; var25 <= var22; var25++) {
								int var26 = var23.radius / 4;
								if (var26 > 30) {
									var26 = 30;
								}
								if (var26 > this.shadow[arg6][arg1 + var24][arg2 + var25]) {
									this.shadow[arg6][arg1 + var24][arg2 + var25] = (byte) var26;
								}
							}
						}
					}
				}
			}
			if (var15.blockwalk && arg7 != null) {
				arg7.addLoc(arg2, arg3, var15.width, var15.length, var15.blockrange, arg1, false);
			}
		} else if (arg0 >= 12) {
			ModelSource var27;
			if (var15.anim == -1) {
				var27 = var15.getModel(arg0, arg3, var10, var11, var12, var13, -1);
			} else {
				var27 = new ClientLocAnim(var12, arg4, true, var10, var13, arg0, arg3, var11, var15.anim);
			}
			arg8.addLoc(var16, arg1, var27, var14, 1, arg2, 0, var17, 1, arg6);
			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg6 > 0) {
				this.occlusion[arg6][arg1][arg2] |= 0x924;
			}
			if (var15.blockwalk && arg7 != null) {
				arg7.addLoc(arg2, arg3, var15.width, var15.length, var15.blockrange, arg1, false);
			}
		} else if (arg0 == 0) {
			ModelSource var28;
			if (var15.anim == -1) {
				var28 = var15.getModel(0, arg3, var10, var11, var12, var13, -1);
			} else {
				var28 = new ClientLocAnim(var12, arg4, true, var10, var13, 0, arg3, var11, var15.anim);
			}
			arg8.addWall(var14, var17, arg2, var28, arg1, 0, var16, arg6, ROTATION_WALL_TYPE[arg3], null);
			if (arg3 == 0) {
				if (var15.shadow) {
					this.shadow[arg6][arg1][arg2] = 50;
					this.shadow[arg6][arg1][arg2 + 1] = 50;
				}
				if (var15.occlude) {
					this.occlusion[arg6][arg1][arg2] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var15.shadow) {
					this.shadow[arg6][arg1][arg2 + 1] = 50;
					this.shadow[arg6][arg1 + 1][arg2 + 1] = 50;
				}
				if (var15.occlude) {
					this.occlusion[arg6][arg1][arg2 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var15.shadow) {
					this.shadow[arg6][arg1 + 1][arg2] = 50;
					this.shadow[arg6][arg1 + 1][arg2 + 1] = 50;
				}
				if (var15.occlude) {
					this.occlusion[arg6][arg1 + 1][arg2] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var15.shadow) {
					this.shadow[arg6][arg1][arg2] = 50;
					this.shadow[arg6][arg1 + 1][arg2] = 50;
				}
				if (var15.occlude) {
					this.occlusion[arg6][arg1][arg2] |= 0x492;
				}
			}
			if (var15.blockwalk && arg7 != null) {
				arg7.addWall(arg0, arg3, arg2, arg1, var15.blockrange);
			}
			if (var15.wallwidth != 16) {
				arg8.setDecorOffset(arg2, arg6, var15.wallwidth, -23232, arg1);
			}
		} else if (arg0 == 1) {
			ModelSource var29;
			if (var15.anim == -1) {
				var29 = var15.getModel(1, arg3, var10, var11, var12, var13, -1);
			} else {
				var29 = new ClientLocAnim(var12, arg4, true, var10, var13, 1, arg3, var11, var15.anim);
			}
			arg8.addWall(var14, var17, arg2, var29, arg1, 0, var16, arg6, ROTATION_WALL_CORNER_TYPE[arg3], null);
			if (var15.shadow) {
				if (arg3 == 0) {
					this.shadow[arg6][arg1][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					this.shadow[arg6][arg1 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					this.shadow[arg6][arg1 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					this.shadow[arg6][arg1][arg2] = 50;
				}
			}
			if (var15.blockwalk && arg7 != null) {
				arg7.addWall(arg0, arg3, arg2, arg1, var15.blockrange);
			}
		} else if (arg0 == 2) {
			int var30 = arg3 + 1 & 0x3;
			ModelSource var31;
			ModelSource var32;
			if (var15.anim == -1) {
				var31 = var15.getModel(2, arg3 + 4, var10, var11, var12, var13, -1);
				var32 = var15.getModel(2, var30, var10, var11, var12, var13, -1);
			} else {
				var31 = new ClientLocAnim(var12, arg4, true, var10, var13, 2, arg3 + 4, var11, var15.anim);
				var32 = new ClientLocAnim(var12, arg4, true, var10, var13, 2, var30, var11, var15.anim);
			}
			arg8.addWall(var14, var17, arg2, var31, arg1, ROTATION_WALL_TYPE[var30], var16, arg6, ROTATION_WALL_TYPE[arg3], var32);
			if (var15.occlude) {
				if (arg3 == 0) {
					this.occlusion[arg6][arg1][arg2] |= 0x249;
					this.occlusion[arg6][arg1][arg2 + 1] |= 0x492;
				} else if (arg3 == 1) {
					this.occlusion[arg6][arg1][arg2 + 1] |= 0x492;
					this.occlusion[arg6][arg1 + 1][arg2] |= 0x249;
				} else if (arg3 == 2) {
					this.occlusion[arg6][arg1 + 1][arg2] |= 0x249;
					this.occlusion[arg6][arg1][arg2] |= 0x492;
				} else if (arg3 == 3) {
					this.occlusion[arg6][arg1][arg2] |= 0x492;
					this.occlusion[arg6][arg1][arg2] |= 0x249;
				}
			}
			if (var15.blockwalk && arg7 != null) {
				arg7.addWall(arg0, arg3, arg2, arg1, var15.blockrange);
			}
			if (var15.wallwidth != 16) {
				arg8.setDecorOffset(arg2, arg6, var15.wallwidth, -23232, arg1);
			}
		} else if (arg0 == 3) {
			ModelSource var33;
			if (var15.anim == -1) {
				var33 = var15.getModel(3, arg3, var10, var11, var12, var13, -1);
			} else {
				var33 = new ClientLocAnim(var12, arg4, true, var10, var13, 3, arg3, var11, var15.anim);
			}
			arg8.addWall(var14, var17, arg2, var33, arg1, 0, var16, arg6, ROTATION_WALL_CORNER_TYPE[arg3], null);
			if (var15.shadow) {
				if (arg3 == 0) {
					this.shadow[arg6][arg1][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					this.shadow[arg6][arg1 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					this.shadow[arg6][arg1 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					this.shadow[arg6][arg1][arg2] = 50;
				}
			}
			if (var15.blockwalk && arg7 != null) {
				arg7.addWall(arg0, arg3, arg2, arg1, var15.blockrange);
			}
		} else if (arg0 == 9) {
			ModelSource var34;
			if (var15.anim == -1) {
				var34 = var15.getModel(arg0, arg3, var10, var11, var12, var13, -1);
			} else {
				var34 = new ClientLocAnim(var12, arg4, true, var10, var13, arg0, arg3, var11, var15.anim);
			}
			arg8.addLoc(var16, arg1, var34, var14, 1, arg2, 0, var17, 1, arg6);
			if (var15.blockwalk && arg7 != null) {
				arg7.addLoc(arg2, arg3, var15.width, var15.length, var15.blockrange, arg1, false);
			}
		} else if (arg0 == 4) {
			ModelSource var35;
			if (var15.anim == -1) {
				var35 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var35 = new ClientLocAnim(var12, arg4, true, var10, var13, 4, 0, var11, var15.anim);
			}
			arg8.addDecor(arg2, 0, ROTATION_WALL_TYPE[arg3], arg6, arg1, var17, var16, arg3 * 512, 0, var35, var14);
		} else if (arg0 == 5) {
			int var36 = 16;
			int var37 = arg8.getWallTypecode(arg6, arg1, arg2);
			if (var37 > 0) {
				var36 = LocType.get(var37 >> 14 & 0x7FFF).wallwidth;
			}
			ModelSource var38;
			if (var15.anim == -1) {
				var38 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var38 = new ClientLocAnim(var12, arg4, true, var10, var13, 4, 0, var11, var15.anim);
			}
			arg8.addDecor(arg2, WALL_DECORATION_ROTATION_FORWARD_Z[arg3] * var36, ROTATION_WALL_TYPE[arg3], arg6, arg1, var17, var16, arg3 * 512, WALL_DECORATION_ROTATION_FORWARD_X[arg3] * var36, var38, var14);
		} else if (arg0 == 6) {
			ModelSource var39;
			if (var15.anim == -1) {
				var39 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var39 = new ClientLocAnim(var12, arg4, true, var10, var13, 4, 0, var11, var15.anim);
			}
			arg8.addDecor(arg2, 0, 256, arg6, arg1, var17, var16, arg3, 0, var39, var14);
		} else if (arg0 == 7) {
			ModelSource var40;
			if (var15.anim == -1) {
				var40 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var40 = new ClientLocAnim(var12, arg4, true, var10, var13, 4, 0, var11, var15.anim);
			}
			arg8.addDecor(arg2, 0, 512, arg6, arg1, var17, var16, arg3, 0, var40, var14);
		} else if (arg0 == 8) {
			ModelSource var41;
			if (var15.anim == -1) {
				var41 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var41 = new ClientLocAnim(var12, arg4, true, var10, var13, 4, 0, var11, var15.anim);
			}
			arg8.addDecor(arg2, 0, 768, arg6, arg1, var17, var16, arg3, 0, var41, var14);
		}
	}

	@ObfuscatedName("c.a([Ljc;ZLs;)V")
	public final void build(CollisionMap[] arg0, World3D arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			for (int var5 = 0; var5 < 104; var5++) {
				for (int var6 = 0; var6 < 104; var6++) {
					if ((this.flags[var4][var5][var6] & 0x1) == 1) {
						int var7 = var4;
						if ((this.flags[1][var5][var6] & 0x2) == 2) {
							var7 = var4 - 1;
						}
						if (var7 >= 0) {
							arg0[var7].setBlocked(var5, var6);
						}
					}
				}
			}
		}
		if (fullbright) {
			randomHueOffset = 0;
			randomLightnessOffset = 0;
		} else {
			randomHueOffset += (int) (Math.random() * 5.0D) - 2;
			if (randomHueOffset < -8) {
				randomHueOffset = -8;
			}
			if (randomHueOffset > 8) {
				randomHueOffset = 8;
			}
			randomLightnessOffset += (int) (Math.random() * 5.0D) - 2;
			if (randomLightnessOffset < -16) {
				randomLightnessOffset = -16;
			}
			if (randomLightnessOffset > 16) {
				randomLightnessOffset = 16;
			}
		}
		for (int var9 = 0; var9 < 4; var9++) {
			byte[][] var10 = this.shadow[var9];
			byte var11 = 96;
			short var12 = 768;
			byte var13 = -50;
			byte var14 = -10;
			byte var15 = -50;
			int var16 = (int) Math.sqrt((double) (var13 * var13 + var14 * var14 + var15 * var15));
			int var17 = var12 * var16 >> 8;
			for (int var18 = 1; var18 < this.maxTileZ - 1; var18++) {
				for (int var19 = 1; var19 < this.maxTileX - 1; var19++) {
					int var20 = this.heightmap[var9][var19 + 1][var18] - this.heightmap[var9][var19 - 1][var18];
					int var21 = this.heightmap[var9][var19][var18 + 1] - this.heightmap[var9][var19][var18 - 1];
					int var22 = (int) Math.sqrt((double) (var20 * var20 + 65536 + var21 * var21));
					int var23 = (var20 << 8) / var22;
					int var24 = 65536 / var22;
					int var25 = (var21 << 8) / var22;
					int var26 = var11 + (var13 * var23 + var14 * var24 + var15 * var25) / var17;
					int var27 = (var10[var19 - 1][var18] >> 2) + (var10[var19 + 1][var18] >> 3) + (var10[var19][var18 - 1] >> 2) + (var10[var19][var18 + 1] >> 3) + (var10[var19][var18] >> 1);
					this.lightness[var19][var18] = var26 - var27;
				}
			}
			for (int var28 = 0; var28 < this.maxTileZ; var28++) {
				this.blendChroma[var28] = 0;
				this.blendSaturation[var28] = 0;
				this.blendLightness[var28] = 0;
				this.blendLuminance[var28] = 0;
				this.blendMagnitude[var28] = 0;
			}
			for (int var29 = -5; var29 < this.maxTileX + 5; var29++) {
				for (int var30 = 0; var30 < this.maxTileZ; var30++) {
					int var31 = var29 + 5;
					int var10002;
					if (var31 >= 0 && var31 < this.maxTileX) {
						int var32 = this.underlayType[var9][var31][var30] & 0xFF;
						if (var32 > 0) {
							FloType var33 = FloType.types[var32 - 1];
							this.blendChroma[var30] += var33.chroma;
							this.blendSaturation[var30] += var33.saturation;
							this.blendLightness[var30] += var33.lightness;
							this.blendLuminance[var30] += var33.luminance;
							var10002 = this.blendMagnitude[var30]++;
						}
					}
					int var34 = var29 - 5;
					if (var34 >= 0 && var34 < this.maxTileX) {
						int var35 = this.underlayType[var9][var34][var30] & 0xFF;
						if (var35 > 0) {
							FloType var36 = FloType.types[var35 - 1];
							this.blendChroma[var30] -= var36.chroma;
							this.blendSaturation[var30] -= var36.saturation;
							this.blendLightness[var30] -= var36.lightness;
							this.blendLuminance[var30] -= var36.luminance;
							var10002 = this.blendMagnitude[var30]--;
						}
					}
				}
				if (var29 >= 1 && var29 < this.maxTileX - 1) {
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					int var40 = 0;
					int var41 = 0;
					for (int var42 = -5; var42 < this.maxTileZ + 5; var42++) {
						int var43 = var42 + 5;
						if (var43 >= 0 && var43 < this.maxTileZ) {
							var37 += this.blendChroma[var43];
							var38 += this.blendSaturation[var43];
							var39 += this.blendLightness[var43];
							var40 += this.blendLuminance[var43];
							var41 += this.blendMagnitude[var43];
						}
						int var44 = var42 - 5;
						if (var44 >= 0 && var44 < this.maxTileZ) {
							var37 -= this.blendChroma[var44];
							var38 -= this.blendSaturation[var44];
							var39 -= this.blendLightness[var44];
							var40 -= this.blendLuminance[var44];
							var41 -= this.blendMagnitude[var44];
						}
						if (var42 >= 1 && var42 < this.maxTileZ - 1 && (!lowMem || (this.flags[var9][var29][var42] & 0x10) == 0 && this.getDrawLevel(var29, var9, var42) == levelBuilt)) {
							int var45 = this.underlayType[var9][var29][var42] & 0xFF;
							int var46 = this.overlayType[var9][var29][var42] & 0xFF;
							if (var45 > 0 || var46 > 0) {
								int var47 = this.heightmap[var9][var29][var42];
								int var48 = this.heightmap[var9][var29 + 1][var42];
								int var49 = this.heightmap[var9][var29 + 1][var42 + 1];
								int var50 = this.heightmap[var9][var29][var42 + 1];
								int var51 = this.lightness[var29][var42];
								int var52 = this.lightness[var29 + 1][var42];
								int var53 = this.lightness[var29 + 1][var42 + 1];
								int var54 = this.lightness[var29][var42 + 1];
								int var55 = -1;
								int var56 = -1;
								if (var45 > 0) {
									int var57 = var37 * 256 / var40;
									int var58 = var38 / var41;
									int var59 = var39 / var41;
									var55 = this.hsl24to16(var57, var58, var59);
									int var60 = var57 + randomHueOffset & 0xFF;
									int var61 = var59 + randomLightnessOffset;
									if (var61 < 0) {
										var61 = 0;
									} else if (var61 > 255) {
										var61 = 255;
									}
									var56 = this.hsl24to16(var60, var58, var61);
								}
								if (var9 > 0) {
									boolean var62 = true;
									if (var45 == 0 && this.overlayShape[var9][var29][var42] != 0) {
										var62 = false;
									}
									if (var46 > 0 && !FloType.types[var46 - 1].occlude) {
										var62 = false;
									}
									if (var62 && var47 == var48 && var47 == var49 && var47 == var50) {
										this.occlusion[var9][var29][var42] |= 0x924;
									}
								}
								int var63 = 0;
								if (var55 != -1) {
									var63 = Pix3D.colourTable[mulHsl(var56, 96)];
								}
								if (var46 == 0) {
									arg2.setTile(var9, var29, var42, 0, 0, -1, var47, var48, var49, var50, mulHsl(var55, var51), mulHsl(var55, var52), mulHsl(var55, var53), mulHsl(var55, var54), 0, 0, 0, 0, var63, 0);
								} else {
									int var64 = this.overlayShape[var9][var29][var42] + 1;
									byte var65 = this.overlayAngle[var9][var29][var42];
									FloType var66 = FloType.types[var46 - 1];
									int var67 = var66.texture;
									int var68;
									int var69;
									if (var67 >= 0) {
										var68 = Pix3D.getAverageTextureRgb(var67);
										var69 = -1;
									} else if (var66.rgb == 16711935) {
										var68 = 0;
										var69 = -2;
										var67 = -1;
									} else {
										var69 = this.hsl24to16(var66.hue, var66.saturation, var66.lightness);
										var68 = Pix3D.colourTable[this.adjustLightness(var66.hsl, 96)];
									}
									arg2.setTile(var9, var29, var42, var64, var65, var67, var47, var48, var49, var50, mulHsl(var55, var51), mulHsl(var55, var52), mulHsl(var55, var53), mulHsl(var55, var54), this.adjustLightness(var69, var51), this.adjustLightness(var69, var52), this.adjustLightness(var69, var53), this.adjustLightness(var69, var54), var63, var68);
								}
							}
						}
					}
				}
			}
			for (int var70 = 1; var70 < this.maxTileZ - 1; var70++) {
				for (int var71 = 1; var71 < this.maxTileX - 1; var71++) {
					arg2.setDrawLevel(var9, var71, var70, this.getDrawLevel(var71, var9, var70));
				}
			}
		}
		if (!fullbright) {
			arg2.buildModels(768, -10, 64, -50, -50);
		}
		for (int var72 = 0; var72 < this.maxTileX; var72++) {
			for (int var73 = 0; var73 < this.maxTileZ; var73++) {
				if ((this.flags[1][var72][var73] & 0x2) == 2) {
					arg2.setLinkBelow(var72, var73);
				}
			}
		}
		if (fullbright) {
			return;
		}
		int var74 = 1;
		int var75 = 2;
		int var76 = 4;
		for (int var77 = 0; var77 < 4; var77++) {
			if (var77 > 0) {
				var74 <<= 0x3;
				var75 <<= 0x3;
				var76 <<= 0x3;
			}
			for (int var78 = 0; var78 <= var77; var78++) {
				for (int var79 = 0; var79 <= this.maxTileZ; var79++) {
					for (int var80 = 0; var80 <= this.maxTileX; var80++) {
						if ((this.occlusion[var78][var80][var79] & var74) != 0) {
							int var81 = var79;
							int var82 = var79;
							int var83 = var78;
							int var84 = var78;
							while (var81 > 0 && (this.occlusion[var78][var80][var81 - 1] & var74) != 0) {
								var81--;
							}
							while (var82 < this.maxTileZ && (this.occlusion[var78][var80][var82 + 1] & var74) != 0) {
								var82++;
							}
							label336: while (var83 > 0) {
								for (int var85 = var81; var85 <= var82; var85++) {
									if ((this.occlusion[var83 - 1][var80][var85] & var74) == 0) {
										break label336;
									}
								}
								var83--;
							}
							label325: while (var84 < var77) {
								for (int var86 = var81; var86 <= var82; var86++) {
									if ((this.occlusion[var84 + 1][var80][var86] & var74) == 0) {
										break label325;
									}
								}
								var84++;
							}
							int var87 = (var84 + 1 - var83) * (var82 - var81 + 1);
							if (var87 >= 8) {
								short var88 = 240;
								int var89 = this.heightmap[var84][var80][var81] - var88;
								int var90 = this.heightmap[var83][var80][var81];
								World3D.addOccluder(var80 * 128, var80 * 128, var89, 1, var81 * 128, var77, var90, var82 * 128 + 128);
								for (int var91 = var83; var91 <= var84; var91++) {
									for (int var92 = var81; var92 <= var82; var92++) {
										this.occlusion[var91][var80][var92] &= ~var74;
									}
								}
							}
						}
						if ((this.occlusion[var78][var80][var79] & var75) != 0) {
							int var93 = var80;
							int var94 = var80;
							int var95 = var78;
							int var96 = var78;
							while (var93 > 0 && (this.occlusion[var78][var93 - 1][var79] & var75) != 0) {
								var93--;
							}
							while (var94 < this.maxTileX && (this.occlusion[var78][var94 + 1][var79] & var75) != 0) {
								var94++;
							}
							label389: while (var95 > 0) {
								for (int var97 = var93; var97 <= var94; var97++) {
									if ((this.occlusion[var95 - 1][var97][var79] & var75) == 0) {
										break label389;
									}
								}
								var95--;
							}
							label378: while (var96 < var77) {
								for (int var98 = var93; var98 <= var94; var98++) {
									if ((this.occlusion[var96 + 1][var98][var79] & var75) == 0) {
										break label378;
									}
								}
								var96++;
							}
							int var99 = (var96 + 1 - var95) * (var94 - var93 + 1);
							if (var99 >= 8) {
								short var100 = 240;
								int var101 = this.heightmap[var96][var93][var79] - var100;
								int var102 = this.heightmap[var95][var93][var79];
								World3D.addOccluder(var93 * 128, var94 * 128 + 128, var101, 2, var79 * 128, var77, var102, var79 * 128);
								for (int var103 = var95; var103 <= var96; var103++) {
									for (int var104 = var93; var104 <= var94; var104++) {
										this.occlusion[var103][var104][var79] &= ~var75;
									}
								}
							}
						}
						if ((this.occlusion[var78][var80][var79] & var76) != 0) {
							int var105 = var80;
							int var106 = var80;
							int var107 = var79;
							int var108 = var79;
							while (var107 > 0 && (this.occlusion[var78][var80][var107 - 1] & var76) != 0) {
								var107--;
							}
							while (var108 < this.maxTileZ && (this.occlusion[var78][var80][var108 + 1] & var76) != 0) {
								var108++;
							}
							label442: while (var105 > 0) {
								for (int var109 = var107; var109 <= var108; var109++) {
									if ((this.occlusion[var78][var105 - 1][var109] & var76) == 0) {
										break label442;
									}
								}
								var105--;
							}
							label431: while (var106 < this.maxTileX) {
								for (int var110 = var107; var110 <= var108; var110++) {
									if ((this.occlusion[var78][var106 + 1][var110] & var76) == 0) {
										break label431;
									}
								}
								var106++;
							}
							if ((var106 - var105 + 1) * (var108 - var107 + 1) >= 4) {
								int var111 = this.heightmap[var78][var105][var107];
								World3D.addOccluder(var105 * 128, var106 * 128 + 128, var111, 4, var107 * 128, var77, var111, var108 * 128 + 128);
								for (int var112 = var105; var112 <= var106; var112++) {
									for (int var113 = var107; var113 <= var108; var113++) {
										this.occlusion[var78][var112][var113] &= ~var76;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIII)I")
	public int getDrawLevel(int arg1, int arg2, int arg3) {
		if ((this.flags[arg2][arg1][arg3] & 0x8) == 0) {
			return arg2 <= 0 || (this.flags[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("c.a(II)I")
	public static final int perlinNoise(int arg0, int arg1) {
		int var2 = interpolatedNoise(arg0 + 45365, arg1 + 91923, 4) - 128 + (interpolatedNoise(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (interpolatedNoise(arg0, arg1, 1) - 128 >> 2);
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("c.a(III)I")
	public static final int interpolatedNoise(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = smoothNoise(var3, var5);
		int var8 = smoothNoise(var3 + 1, var5);
		int var9 = smoothNoise(var3, var5 + 1);
		int var10 = smoothNoise(var3 + 1, var5 + 1);
		int var11 = interpolate(var7, var8, var4, arg2);
		int var12 = interpolate(var9, var10, var4, arg2);
		return interpolate(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static final int interpolate(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.cosTable[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
		int var4 = noise(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int noise(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var3 = var2 << 13 ^ var2;
		int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int mulHsl(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = arg1 * (arg0 & 0x7F) / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("c.e(II)I")
	public final int adjustLightness(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			int var4 = arg1 * (arg0 & 0x7F) / 128;
			if (var4 < 2) {
				var4 = 2;
			} else if (var4 > 126) {
				var4 = 126;
			}
			return (arg0 & 0xFF80) + var4;
		}
	}

	@ObfuscatedName("c.b(III)I")
	public final int hsl24to16(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	@ObfuscatedName("c.c(III)Z")
	public static final boolean changeLocAvailable(int arg1, int arg2) {
		LocType var3 = LocType.get(arg2);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return var3.checkModel(arg1);
	}

	@ObfuscatedName("c.a([[[ILs;BIIIIIILjc;I)V")
	public static final void addLoc(int[][][] arg0, World3D arg1, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, CollisionMap arg9, int arg10) {
		int var11 = arg0[arg7][arg5][arg4];
		int var12 = arg0[arg7][arg5 + 1][arg4];
		int var13 = arg0[arg7][arg5 + 1][arg4 + 1];
		int var14 = arg0[arg7][arg5][arg4 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		LocType var17 = LocType.get(arg6);
		int var18 = arg5 + (arg4 << 7) + (arg6 << 14) + 1073741824;
		if (!var17.active) {
			var18 += Integer.MIN_VALUE;
		}
		byte var19 = (byte) ((arg10 << 6) + arg8);
		if (arg8 == 22) {
			ModelSource var20;
			if (var17.anim == -1) {
				var20 = var17.getModel(22, arg10, var11, var12, var13, var14, -1);
			} else {
				var20 = new ClientLocAnim(var13, arg6, true, var11, var14, 22, arg10, var12, var17.anim);
			}
			arg1.addGroundDecor(arg4, arg5, arg3, var18, var19, var20, var15);
			if (var17.blockwalk && var17.active) {
				arg9.setBlocked(arg5, arg4);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			ModelSource var21;
			if (var17.anim == -1) {
				var21 = var17.getModel(10, arg10, var11, var12, var13, var14, -1);
			} else {
				var21 = new ClientLocAnim(var13, arg6, true, var11, var14, 10, arg10, var12, var17.anim);
			}
			if (var21 != null) {
				int var22 = 0;
				if (arg8 == 11) {
					var22 += 256;
				}
				int var23;
				int var24;
				if (arg10 == 1 || arg10 == 3) {
					var23 = var17.length;
					var24 = var17.width;
				} else {
					var23 = var17.width;
					var24 = var17.length;
				}
				arg1.addLoc(var18, arg5, var21, var15, var23, arg4, var22, var19, var24, arg3);
			}
			if (var17.blockwalk) {
				arg9.addLoc(arg4, arg10, var17.width, var17.length, var17.blockrange, arg5, false);
			}
		} else if (arg8 >= 12) {
			ModelSource var25;
			if (var17.anim == -1) {
				var25 = var17.getModel(arg8, arg10, var11, var12, var13, var14, -1);
			} else {
				var25 = new ClientLocAnim(var13, arg6, true, var11, var14, arg8, arg10, var12, var17.anim);
			}
			arg1.addLoc(var18, arg5, var25, var15, 1, arg4, 0, var19, 1, arg3);
			if (var17.blockwalk) {
				arg9.addLoc(arg4, arg10, var17.width, var17.length, var17.blockrange, arg5, false);
			}
		} else if (arg8 == 0) {
			ModelSource var26;
			if (var17.anim == -1) {
				var26 = var17.getModel(0, arg10, var11, var12, var13, var14, -1);
			} else {
				var26 = new ClientLocAnim(var13, arg6, true, var11, var14, 0, arg10, var12, var17.anim);
			}
			arg1.addWall(var15, var19, arg4, var26, arg5, 0, var18, arg3, ROTATION_WALL_TYPE[arg10], null);
			if (var17.blockwalk) {
				arg9.addWall(arg8, arg10, arg4, arg5, var17.blockrange);
			}
		} else if (arg8 == 1) {
			ModelSource var27;
			if (var17.anim == -1) {
				var27 = var17.getModel(1, arg10, var11, var12, var13, var14, -1);
			} else {
				var27 = new ClientLocAnim(var13, arg6, true, var11, var14, 1, arg10, var12, var17.anim);
			}
			arg1.addWall(var15, var19, arg4, var27, arg5, 0, var18, arg3, ROTATION_WALL_CORNER_TYPE[arg10], null);
			if (var17.blockwalk) {
				arg9.addWall(arg8, arg10, arg4, arg5, var17.blockrange);
			}
		} else if (arg8 == 2) {
			int var28 = arg10 + 1 & 0x3;
			ModelSource var29;
			ModelSource var30;
			if (var17.anim == -1) {
				var29 = var17.getModel(2, arg10 + 4, var11, var12, var13, var14, -1);
				var30 = var17.getModel(2, var28, var11, var12, var13, var14, -1);
			} else {
				var29 = new ClientLocAnim(var13, arg6, true, var11, var14, 2, arg10 + 4, var12, var17.anim);
				var30 = new ClientLocAnim(var13, arg6, true, var11, var14, 2, var28, var12, var17.anim);
			}
			arg1.addWall(var15, var19, arg4, var29, arg5, ROTATION_WALL_TYPE[var28], var18, arg3, ROTATION_WALL_TYPE[arg10], var30);
			if (var17.blockwalk) {
				arg9.addWall(arg8, arg10, arg4, arg5, var17.blockrange);
			}
		} else if (arg8 == 3) {
			ModelSource var31;
			if (var17.anim == -1) {
				var31 = var17.getModel(3, arg10, var11, var12, var13, var14, -1);
			} else {
				var31 = new ClientLocAnim(var13, arg6, true, var11, var14, 3, arg10, var12, var17.anim);
			}
			arg1.addWall(var15, var19, arg4, var31, arg5, 0, var18, arg3, ROTATION_WALL_CORNER_TYPE[arg10], null);
			if (var17.blockwalk) {
				arg9.addWall(arg8, arg10, arg4, arg5, var17.blockrange);
			}
		} else if (arg8 == 9) {
			ModelSource var32;
			if (var17.anim == -1) {
				var32 = var17.getModel(arg8, arg10, var11, var12, var13, var14, -1);
			} else {
				var32 = new ClientLocAnim(var13, arg6, true, var11, var14, arg8, arg10, var12, var17.anim);
			}
			arg1.addLoc(var18, arg5, var32, var15, 1, arg4, 0, var19, 1, arg3);
			if (var17.blockwalk) {
				arg9.addLoc(arg4, arg10, var17.width, var17.length, var17.blockrange, arg5, false);
			}
		} else if (arg8 == 4) {
			ModelSource var33;
			if (var17.anim == -1) {
				var33 = var17.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var33 = new ClientLocAnim(var13, arg6, true, var11, var14, 4, 0, var12, var17.anim);
			}
			arg1.addDecor(arg4, 0, ROTATION_WALL_TYPE[arg10], arg3, arg5, var19, var18, arg10 * 512, 0, var33, var15);
		} else if (arg8 == 5) {
			int var34 = 16;
			int var35 = arg1.getWallTypecode(arg3, arg5, arg4);
			if (var35 > 0) {
				var34 = LocType.get(var35 >> 14 & 0x7FFF).wallwidth;
			}
			ModelSource var36;
			if (var17.anim == -1) {
				var36 = var17.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var36 = new ClientLocAnim(var13, arg6, true, var11, var14, 4, 0, var12, var17.anim);
			}
			arg1.addDecor(arg4, WALL_DECORATION_ROTATION_FORWARD_Z[arg10] * var34, ROTATION_WALL_TYPE[arg10], arg3, arg5, var19, var18, arg10 * 512, WALL_DECORATION_ROTATION_FORWARD_X[arg10] * var34, var36, var15);
		} else if (arg8 == 6) {
			ModelSource var37;
			if (var17.anim == -1) {
				var37 = var17.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var37 = new ClientLocAnim(var13, arg6, true, var11, var14, 4, 0, var12, var17.anim);
			}
			arg1.addDecor(arg4, 0, 256, arg3, arg5, var19, var18, arg10, 0, var37, var15);
		} else if (arg8 == 7) {
			ModelSource var38;
			if (var17.anim == -1) {
				var38 = var17.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var38 = new ClientLocAnim(var13, arg6, true, var11, var14, 4, 0, var12, var17.anim);
			}
			arg1.addDecor(arg4, 0, 512, arg3, arg5, var19, var18, arg10, 0, var38, var15);
		} else if (arg8 == 8) {
			ModelSource var39;
			if (var17.anim == -1) {
				var39 = var17.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var39 = new ClientLocAnim(var13, arg6, true, var11, var14, 4, 0, var12, var17.anim);
			}
			arg1.addDecor(arg4, 0, 768, arg3, arg5, var19, var18, arg10, 0, var39, var15);
		}
	}
}
