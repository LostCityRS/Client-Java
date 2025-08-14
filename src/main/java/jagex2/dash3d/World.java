package jagex2.dash3d;

import deob.*;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public class World {

	@ObfuscatedName("c.g")
	public static boolean lowMem = true;

	@ObfuscatedName("c.h")
	public static int levelBuilt;

	@ObfuscatedName("c.i")
	public static boolean fullbright;

	@ObfuscatedName("c.j")
	public int maxTileX;

	@ObfuscatedName("c.k")
	public int maxTileZ;

	@ObfuscatedName("c.l")
	public int[][][] heightmap;

	@ObfuscatedName("c.m")
	public byte[][][] flags;

	@ObfuscatedName("c.n")
	public byte[][][] underlayType;

	@ObfuscatedName("c.o")
	public byte[][][] overlayType;

	@ObfuscatedName("c.p")
	public byte[][][] overlayShape;

	@ObfuscatedName("c.q")
	public byte[][][] overlayAngle;

	@ObfuscatedName("c.r")
	public byte[][][] shadow;

	@ObfuscatedName("c.s")
	public int[][] lightness;

	@ObfuscatedName("c.t")
	public int[] blendChroma;

	@ObfuscatedName("c.u")
	public int[] blendSaturation;

	@ObfuscatedName("c.v")
	public int[] blendLightness;

	@ObfuscatedName("c.w")
	public int[] blendLuminance;

	@ObfuscatedName("c.x")
	public int[] blendMagnitude;

	@ObfuscatedName("c.y")
	public int[][][] occlusion;

	@ObfuscatedName("c.z")
	public static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.A")
	public static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.B")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.C")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.D")
	public static int randomHueOffset = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.E")
	public static int randomLightnessOffset = (int) (Math.random() * 33.0D) - 16;

	public World(int[][][] arg1, byte[][][] arg2, int arg3, int arg4) {
		this.maxTileX = arg3;
		this.maxTileZ = arg4;
		this.heightmap = arg1;
		this.flags = arg2;
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

	@ObfuscatedName("c.a(IIIZI)V")
	public final void spreadHeight(int startX, int startZ, int endX, int endZ) {
		for (int z = startZ; z <= startZ + endZ; z++) {
			for (int x = startX; x <= startX + endX; x++) {
				if (x >= 0 && x < this.maxTileX && z >= 0 && z < this.maxTileZ) {
					this.shadow[0][x][z] = 127;

					if (startX == x && x > 0) {
						this.heightmap[0][x][z] = this.heightmap[0][x - 1][z];
					}

					if (startX + endX == x && x < this.maxTileX - 1) {
						this.heightmap[0][x][z] = this.heightmap[0][x + 1][z];
					}

					if (startZ == z && z > 0) {
						this.heightmap[0][x][z] = this.heightmap[0][x][z - 1];
					}

					if (startZ + endZ == z && z < this.maxTileZ - 1) {
						this.heightmap[0][x][z] = this.heightmap[0][x][z + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BIIII)V")
	public final void loadGround(byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
		Packet var7 = new Packet(arg1);
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					int var11 = arg2 + var9;
					int var12 = arg3 + var10;
					if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
						this.flags[var8][var11][var12] = 0;
						while (true) {
							int var13 = var7.g1();
							if (var13 == 0) {
								if (var8 == 0) {
									this.heightmap[0][var11][var12] = -perlinNoise(var11 + 932731 + arg4, var12 + 556238 + arg5) * 8;
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

	@ObfuscatedName("c.a(II[BZ)Z")
	public static final boolean checkLocations(int xOffset, int zOffset, byte[] src) {
		boolean ready = true;
		Packet buf = new Packet(src);
		int locId = -1;

		label54: while (true) {
			int deltaId = buf.gsmarts();
			if (deltaId == 0) {
				return ready;
			}

			locId += deltaId;

			int locPos = 0;
			boolean skip = false;
			while (true) {
				while (!skip) {
					int deltaPos = buf.gsmarts();
					if (deltaPos == 0) {
						continue label54;
					}

					locPos += deltaPos - 1;

					int z = locPos & 0x3F;
					int x = locPos >> 6 & 0x3F;

					int shape = buf.g1() >> 2;
					int stx = xOffset + x;
					int stz = zOffset + z;

					if (stx > 0 && stz > 0 && stx < 103 && stz < 103) {
						LocType loc = LocType.get(locId);
						if (shape != 22 || !lowMem || loc.active || loc.forcedecor) {
							ready &= loc.checkModelAll();
							skip = true;
						}
					}
				}

				int deltaPos = buf.gsmarts();
				if (deltaPos == 0) {
					break;
				}

				buf.g1();
			}
		}
	}

	@ObfuscatedName("c.a(ILmb;Lvb;)V")
	public static final void prefetchLocations(Packet buf, OnDemand od) {
		int locId = -1;
		while (true) {
			int deltaId = buf.gsmarts();
			if (deltaId == 0) {
				return;
			}

			locId += deltaId;

			LocType loc = LocType.get(locId);
			loc.prefetch(od);

			while (true) {
				int deltaPos = buf.gsmarts();
				if (deltaPos == 0) {
					break;
				}

				buf.g1();
			}
		}
	}

	@ObfuscatedName("c.a(ILs;[Ljc;IZ[B)V")
	public final void loadLocations(int zOffset, World3D scene, CollisionMap[] collision, int xOffset, byte[] src) {
		Packet buf = new Packet(src);
		int locId = -1;

		while (true) {
			int deltaId = buf.gsmarts();
			if (deltaId == 0) {
				return;
			}

			locId += deltaId;

			int locPos = 0;
			while (true) {
				int deltaPos = buf.gsmarts();
				if (deltaPos == 0) {
					break;
				}

				locPos += deltaPos - 1;

				int z = locPos & 0x3F;
				int x = locPos >> 6 & 0x3F;
				int level = locPos >> 12;

				int info = buf.g1();
				int shape = info >> 2;
				int angle = info & 0x3;
				int stx = xOffset + x;
				int stz = zOffset + z;

				if (stx > 0 && stz > 0 && stx < 103 && stz < 103) {
					int currentLevel = level;
					if ((this.flags[1][stx][stz] & 0x2) == 2) {
						currentLevel = level - 1;
					}

					CollisionMap collisionMap = null;
					if (currentLevel >= 0) {
						collisionMap = collision[currentLevel];
					}

					this.addLoc(locId, stz, angle, scene, collisionMap, stx, shape, level);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIIZLs;Ljc;III)V")
	public final void addLoc(int locId, int z, int angle, World3D scene, CollisionMap collision, int x, int shape, int level) {
		if (lowMem) {
			if ((this.flags[level][x][z] & 0x10) != 0) {
				return;
			}

			if (this.getDrawLevel(x, level, z) != levelBuilt) {
				return;
			}
		}

		int heightSW = this.heightmap[level][x][z];
		int heightSE = this.heightmap[level][x + 1][z];
		int heightNW = this.heightmap[level][x + 1][z + 1];
		int heightNE = this.heightmap[level][x][z + 1];
		int y = heightSW + heightSE + heightNW + heightNE >> 2;

		LocType loc = LocType.get(locId);

		int typecode = (locId << 14) + (z << 7) + x + 0x40000000;
		if (!loc.active) {
			typecode += Integer.MIN_VALUE;
		}

		byte info = (byte) ((angle << 6) + shape);

		if (shape == 22) {
			if (!lowMem || loc.active || loc.forcedecor) {
				ModelSource model;
				if (loc.anim == -1) {
					model = loc.getModel(22, angle, heightSW, heightSE, heightNW, heightNE, -1);
				} else {
					model = new ClientLocAnim(heightNE, heightNW, heightSW, 22, angle, true, heightSE, locId, loc.anim);
				}

				scene.addGroundDecor(z, level, x, typecode, y, model, info);

				if (loc.blockwalk && loc.active && collision != null) {
					collision.setBlocked(z, x);
				}
			}
		} else if (shape == 10 || shape == 11) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(10, angle, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 10, angle, true, heightSE, locId, loc.anim);
			}

			if (model != null) {
				int yaw = 0;
				if (shape == 11) {
					yaw += 256;
				}

				int width;
				int length;
				if (angle == 1 || angle == 3) {
					width = loc.length;
					length = loc.width;
				} else {
					width = loc.width;
					length = loc.length;
				}

				if (scene.addLoc(info, typecode, x, level, y, width, yaw, model, length, z) && loc.shadow) {
					Model model2;
					if (model instanceof Model) {
						model2 = (Model) model;
					} else {
						model2 = loc.getModel(10, angle, heightSW, heightSE, heightNW, heightNE, -1);
					}

					if (model2 != null) {
						for (int dx = 0; dx <= width; dx++) {
							for (int dz = 0; dz <= length; dz++) {
								int shade = model2.radius / 4;
								if (shade > 30) {
									shade = 30;
								}

								if (shade > this.shadow[level][x + dx][z + dz]) {
									this.shadow[level][x + dx][z + dz] = (byte) shade;
								}
							}
						}
					}
				}
			}

			if (loc.blockwalk && collision != null) {
				collision.addLoc(loc.blockrange, angle, x, loc.length, loc.width, z);
			}
		} else if (shape >= 12) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(shape, angle, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, shape, angle, true, heightSE, locId, loc.anim);
			}

			scene.addLoc(info, typecode, x, level, y, 1, 0, model, 1, z);

			if (shape >= 12 && shape <= 17 && shape != 13 && level > 0) {
				this.occlusion[level][x][z] |= 0x924;
			}

			if (loc.blockwalk && collision != null) {
				collision.addLoc(loc.blockrange, angle, x, loc.length, loc.width, z);
			}
		} else if (shape == 0) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(0, angle, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 0, angle, true, heightSE, locId, loc.anim);
			}

			scene.addWall(x, typecode, level, 0, ROTATION_WALL_TYPE[angle], y, null, model, info, z);

			if (angle == 0) {
				if (loc.shadow) {
					this.shadow[level][x][z] = 50;
					this.shadow[level][x][z + 1] = 50;
				}

				if (loc.occlude) {
					this.occlusion[level][x][z] |= 0x249;
				}
			} else if (angle == 1) {
				if (loc.shadow) {
					this.shadow[level][x][z + 1] = 50;
					this.shadow[level][x + 1][z + 1] = 50;
				}

				if (loc.occlude) {
					this.occlusion[level][x][z + 1] |= 0x492;
				}
			} else if (angle == 2) {
				if (loc.shadow) {
					this.shadow[level][x + 1][z] = 50;
					this.shadow[level][x + 1][z + 1] = 50;
				}

				if (loc.occlude) {
					this.occlusion[level][x + 1][z] |= 0x249;
				}
			} else if (angle == 3) {
				if (loc.shadow) {
					this.shadow[level][x][z] = 50;
					this.shadow[level][x + 1][z] = 50;
				}

				if (loc.occlude) {
					this.occlusion[level][x][z] |= 0x492;
				}
			}

			if (loc.blockwalk && collision != null) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}

			if (loc.wallwidth != 16) {
				scene.setDecorOffset(loc.wallwidth, x, z, level);
			}
		} else if (shape == 1) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(1, angle, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 1, angle, true, heightSE, locId, loc.anim);
			}

			scene.addWall(x, typecode, level, 0, ROTATION_WALL_CORNER_TYPE[angle], y, null, model, info, z);

			if (loc.shadow) {
				if (angle == 0) {
					this.shadow[level][x][z + 1] = 50;
				} else if (angle == 1) {
					this.shadow[level][x + 1][z + 1] = 50;
				} else if (angle == 2) {
					this.shadow[level][x + 1][z] = 50;
				} else if (angle == 3) {
					this.shadow[level][x][z] = 50;
				}
			}

			if (loc.blockwalk && collision != null) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}
		} else if (shape == 2) {
			int offset = (angle + 1) & 0x3;

			ModelSource model1;
			ModelSource model2;
			if (loc.anim == -1) {
				model1 = loc.getModel(2, angle + 4, heightSW, heightSE, heightNW, heightNE, -1);
				model2 = loc.getModel(2, offset, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model1 = new ClientLocAnim(heightNE, heightNW, heightSW, 2, angle + 4, true, heightSE, locId, loc.anim);
				model2 = new ClientLocAnim(heightNE, heightNW, heightSW, 2, offset, true, heightSE, locId, loc.anim);
			}

			scene.addWall(x, typecode, level, ROTATION_WALL_TYPE[offset], ROTATION_WALL_TYPE[angle], y, model2, model1, info, z);

			if (loc.occlude) {
				if (angle == 0) {
					this.occlusion[level][x][z] |= 0x249;
					this.occlusion[level][x][z + 1] |= 0x492;
				} else if (angle == 1) {
					this.occlusion[level][x][z + 1] |= 0x492;
					this.occlusion[level][x + 1][z] |= 0x249;
				} else if (angle == 2) {
					this.occlusion[level][x + 1][z] |= 0x249;
					this.occlusion[level][x][z] |= 0x492;
				} else if (angle == 3) {
					this.occlusion[level][x][z] |= 0x492;
					this.occlusion[level][x][z] |= 0x249;
				}
			}

			if (loc.blockwalk && collision != null) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}

			if (loc.wallwidth != 16) {
				scene.setDecorOffset(loc.wallwidth, x, z, level);
			}
		} else if (shape == 3) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(3, angle, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 3, angle, true, heightSE, locId, loc.anim);
			}

			scene.addWall(x, typecode, level, 0, ROTATION_WALL_CORNER_TYPE[angle], y, null, model, info, z);

			if (loc.shadow) {
				if (angle == 0) {
					this.shadow[level][x][z + 1] = 50;
				} else if (angle == 1) {
					this.shadow[level][x + 1][z + 1] = 50;
				} else if (angle == 2) {
					this.shadow[level][x + 1][z] = 50;
				} else if (angle == 3) {
					this.shadow[level][x][z] = 50;
				}
			}

			if (loc.blockwalk && collision != null) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}
		} else if (shape == 9) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(shape, angle, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, shape, angle, true, heightSE, locId, loc.anim);
			}

			scene.addLoc(info, typecode, x, level, y, 1, 0, model, 1, z);

			if (loc.blockwalk && collision != null) {
				collision.addLoc(loc.blockrange, angle, x, loc.length, loc.width, z);
			}
		} else if (shape == 4) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(4, 0, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}

			scene.addDecor(info, model, 0, x, z, ROTATION_WALL_TYPE[angle], 0, angle * 512, level, y, typecode);
		} else if (shape == 5) {
			int wallwidth = 16;

			int wallType = scene.getWallTypecode(level, x, z);
			if (wallType > 0) {
				wallwidth = LocType.get(wallType >> 14 & 0x7FFF).wallwidth;
			}

			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(4, 0, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}

			scene.addDecor(info, model, WALL_DECORATION_ROTATION_FORWARD_X[angle] * wallwidth, x, z, ROTATION_WALL_TYPE[angle], WALL_DECORATION_ROTATION_FORWARD_Z[angle] * wallwidth, angle * 512, level, y, typecode);
		} else if (shape == 6) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(4, 0, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}

			scene.addDecor(info, model, 0, x, z, 256, 0, angle, level, y, typecode);
		} else if (shape == 7) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(4, 0, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}

			scene.addDecor(info, model, 0, x, z, 512, 0, angle, level, y, typecode);
		} else if (shape == 8) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(4, 0, heightSW, heightSE, heightNW, heightNE, -1);
			} else {
				model = new ClientLocAnim(heightNE, heightNW, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}

			scene.addDecor(info, model, 0, x, z, 768, 0, angle, level, y, typecode);
		}
	}

	@ObfuscatedName("c.a(Ls;[Ljc;Z)V")
	public final void build(World3D arg0, CollisionMap[] arg1) {
		for (int var4 = 0; var4 < 4; var4++) {
			for (int var110 = 0; var110 < 104; var110++) {
				for (int var111 = 0; var111 < 104; var111++) {
					if ((this.flags[var4][var110][var111] & 0x1) == 1) {
						int var112 = var4;
						if ((this.flags[1][var110][var111] & 0x2) == 2) {
							var112 = var4 - 1;
						}
						if (var112 >= 0) {
							arg1[var112].setBlocked(var111, var110);
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
		for (int var5 = 0; var5 < 4; var5++) {
			byte[][] var48 = this.shadow[var5];
			byte var49 = 96;
			short var50 = 768;
			byte var51 = -50;
			byte var52 = -10;
			byte var53 = -50;
			int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
			int var55 = var50 * var54 >> 8;
			for (int var56 = 1; var56 < this.maxTileZ - 1; var56++) {
				for (int var101 = 1; var101 < this.maxTileX - 1; var101++) {
					int var102 = this.heightmap[var5][var101 + 1][var56] - this.heightmap[var5][var101 - 1][var56];
					int var103 = this.heightmap[var5][var101][var56 + 1] - this.heightmap[var5][var101][var56 - 1];
					int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
					int var105 = (var102 << 8) / var104;
					int var106 = 65536 / var104;
					int var107 = (var103 << 8) / var104;
					int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
					int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
					this.lightness[var101][var56] = var108 - var109;
				}
			}
			for (int var57 = 0; var57 < this.maxTileZ; var57++) {
				this.blendChroma[var57] = 0;
				this.blendSaturation[var57] = 0;
				this.blendLightness[var57] = 0;
				this.blendLuminance[var57] = 0;
				this.blendMagnitude[var57] = 0;
			}
			for (int var58 = -5; var58 < this.maxTileX + 5; var58++) {
				for (int var61 = 0; var61 < this.maxTileZ; var61++) {
					int var95 = var58 + 5;
					int var10002;
					if (var95 >= 0 && var95 < this.maxTileX) {
						int var96 = this.underlayType[var5][var95][var61] & 0xFF;
						if (var96 > 0) {
							FloType var97 = FloType.types[var96 - 1];
							this.blendChroma[var61] += var97.chroma;
							this.blendSaturation[var61] += var97.saturation;
							this.blendLightness[var61] += var97.lightness;
							this.blendLuminance[var61] += var97.luminance;
							var10002 = this.blendMagnitude[var61]++;
						}
					}
					int var98 = var58 - 5;
					if (var98 >= 0 && var98 < this.maxTileX) {
						int var99 = this.underlayType[var5][var98][var61] & 0xFF;
						if (var99 > 0) {
							FloType var100 = FloType.types[var99 - 1];
							this.blendChroma[var61] -= var100.chroma;
							this.blendSaturation[var61] -= var100.saturation;
							this.blendLightness[var61] -= var100.lightness;
							this.blendLuminance[var61] -= var100.luminance;
							var10002 = this.blendMagnitude[var61]--;
						}
					}
				}
				if (var58 >= 1 && var58 < this.maxTileX - 1) {
					int var62 = 0;
					int var63 = 0;
					int var64 = 0;
					int var65 = 0;
					int var66 = 0;
					for (int var67 = -5; var67 < this.maxTileZ + 5; var67++) {
						int var68 = var67 + 5;
						if (var68 >= 0 && var68 < this.maxTileZ) {
							var62 += this.blendChroma[var68];
							var63 += this.blendSaturation[var68];
							var64 += this.blendLightness[var68];
							var65 += this.blendLuminance[var68];
							var66 += this.blendMagnitude[var68];
						}
						int var69 = var67 - 5;
						if (var69 >= 0 && var69 < this.maxTileZ) {
							var62 -= this.blendChroma[var69];
							var63 -= this.blendSaturation[var69];
							var64 -= this.blendLightness[var69];
							var65 -= this.blendLuminance[var69];
							var66 -= this.blendMagnitude[var69];
						}
						if (var67 >= 1 && var67 < this.maxTileZ - 1 && (!lowMem || (this.flags[var5][var58][var67] & 0x10) == 0 && this.getDrawLevel(var58, var5, var67) == levelBuilt)) {
							int var70 = this.underlayType[var5][var58][var67] & 0xFF;
							int var71 = this.overlayType[var5][var58][var67] & 0xFF;
							if (var70 > 0 || var71 > 0) {
								int var72 = this.heightmap[var5][var58][var67];
								int var73 = this.heightmap[var5][var58 + 1][var67];
								int var74 = this.heightmap[var5][var58 + 1][var67 + 1];
								int var75 = this.heightmap[var5][var58][var67 + 1];
								int var76 = this.lightness[var58][var67];
								int var77 = this.lightness[var58 + 1][var67];
								int var78 = this.lightness[var58 + 1][var67 + 1];
								int var79 = this.lightness[var58][var67 + 1];
								int var80 = -1;
								int var81 = -1;
								if (var70 > 0) {
									int var82 = var62 * 256 / var65;
									int var83 = var63 / var66;
									int var84 = var64 / var66;
									var80 = this.hsl24to16(var82, var83, var84);
									int var85 = randomHueOffset + var82 & 0xFF;
									int var86 = randomLightnessOffset + var84;
									if (var86 < 0) {
										var86 = 0;
									} else if (var86 > 255) {
										var86 = 255;
									}
									var81 = this.hsl24to16(var85, var83, var86);
								}
								if (var5 > 0) {
									boolean var87 = true;
									if (var70 == 0 && this.overlayShape[var5][var58][var67] != 0) {
										var87 = false;
									}
									if (var71 > 0 && !FloType.types[var71 - 1].occlude) {
										var87 = false;
									}
									if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
										this.occlusion[var5][var58][var67] |= 0x924;
									}
								}
								int var88 = 0;
								if (var80 != -1) {
									var88 = Pix3D.colourTable[mulHsl(var81, 96)];
								}
								if (var71 == 0) {
									arg0.setTile(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, mulHsl(var80, var76), mulHsl(var80, var77), mulHsl(var80, var78), mulHsl(var80, var79), 0, 0, 0, 0, var88, 0);
								} else {
									int var89 = this.overlayShape[var5][var58][var67] + 1;
									byte var90 = this.overlayAngle[var5][var58][var67];
									FloType var91 = FloType.types[var71 - 1];
									int var92 = var91.texture;
									int var93;
									int var94;
									if (var92 >= 0) {
										var93 = Pix3D.getAverageTextureRgb(var92);
										var94 = -1;
									} else if (var91.rgb == 16711935) {
										var93 = 0;
										var94 = -2;
										var92 = -1;
									} else {
										var94 = this.hsl24to16(var91.hue, var91.saturation, var91.lightness);
										var93 = Pix3D.colourTable[this.adjustLightness(var91.hsl, 96)];
									}
									arg0.setTile(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, mulHsl(var80, var76), mulHsl(var80, var77), mulHsl(var80, var78), mulHsl(var80, var79), this.adjustLightness(var94, var76), this.adjustLightness(var94, var77), this.adjustLightness(var94, var78), this.adjustLightness(var94, var79), var88, var93);
								}
							}
						}
					}
				}
			}
			for (int var59 = 1; var59 < this.maxTileZ - 1; var59++) {
				for (int var60 = 1; var60 < this.maxTileX - 1; var60++) {
					arg0.setDrawLevel(var5, var60, var59, this.getDrawLevel(var60, var5, var59));
				}
			}
		}
		if (!fullbright) {
			arg0.buildModels(-10, -50, -50, 64, 768);
		}
		for (int var6 = 0; var6 < this.maxTileX; var6++) {
			for (int var47 = 0; var47 < this.maxTileZ; var47++) {
				if ((this.flags[1][var6][var47] & 0x2) == 2) {
					arg0.setBridge(var47, var6);
				}
			}
		}
		if (fullbright) {
			return;
		}
		int var7 = 1;
		int var8 = 2;
		int var9 = 4;
		for (int var10 = 0; var10 < 4; var10++) {
			if (var10 > 0) {
				var7 <<= 0x3;
				var8 <<= 0x3;
				var9 <<= 0x3;
			}
			for (int var11 = 0; var11 <= var10; var11++) {
				for (int var12 = 0; var12 <= this.maxTileZ; var12++) {
					for (int var13 = 0; var13 <= this.maxTileX; var13++) {
						if ((this.occlusion[var11][var13][var12] & var7) != 0) {
							int var14 = var12;
							int var15 = var12;
							int var16 = var11;
							int var17 = var11;
							while (var14 > 0 && (this.occlusion[var11][var13][var14 - 1] & var7) != 0) {
								var14--;
							}
							while (var15 < this.maxTileZ && (this.occlusion[var11][var13][var15 + 1] & var7) != 0) {
								var15++;
							}
							label337: while (var16 > 0) {
								for (int var18 = var14; var18 <= var15; var18++) {
									if ((this.occlusion[var16 - 1][var13][var18] & var7) == 0) {
										break label337;
									}
								}
								var16--;
							}
							label326: while (var17 < var10) {
								for (int var19 = var14; var19 <= var15; var19++) {
									if ((this.occlusion[var17 + 1][var13][var19] & var7) == 0) {
										break label326;
									}
								}
								var17++;
							}
							int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var20 >= 8) {
								short var21 = 240;
								int var22 = this.heightmap[var17][var13][var14] - var21;
								int var23 = this.heightmap[var16][var13][var14];
								World3D.addOccluder(var13 * 128, 1, var23, var15 * 128 + 128, var10, var13 * 128, var22, var14 * 128);
								for (int var24 = var16; var24 <= var17; var24++) {
									for (int var25 = var14; var25 <= var15; var25++) {
										this.occlusion[var24][var13][var25] &= ~var7;
									}
								}
							}
						}
						if ((this.occlusion[var11][var13][var12] & var8) != 0) {
							int var26 = var13;
							int var27 = var13;
							int var28 = var11;
							int var29 = var11;
							while (var26 > 0 && (this.occlusion[var11][var26 - 1][var12] & var8) != 0) {
								var26--;
							}
							while (var27 < this.maxTileX && (this.occlusion[var11][var27 + 1][var12] & var8) != 0) {
								var27++;
							}
							label390: while (var28 > 0) {
								for (int var30 = var26; var30 <= var27; var30++) {
									if ((this.occlusion[var28 - 1][var30][var12] & var8) == 0) {
										break label390;
									}
								}
								var28--;
							}
							label379: while (var29 < var10) {
								for (int var31 = var26; var31 <= var27; var31++) {
									if ((this.occlusion[var29 + 1][var31][var12] & var8) == 0) {
										break label379;
									}
								}
								var29++;
							}
							int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
							if (var32 >= 8) {
								short var33 = 240;
								int var34 = this.heightmap[var29][var26][var12] - var33;
								int var35 = this.heightmap[var28][var26][var12];
								World3D.addOccluder(var26 * 128, 2, var35, var12 * 128, var10, var27 * 128 + 128, var34, var12 * 128);
								for (int var36 = var28; var36 <= var29; var36++) {
									for (int var37 = var26; var37 <= var27; var37++) {
										this.occlusion[var36][var37][var12] &= ~var8;
									}
								}
							}
						}
						if ((this.occlusion[var11][var13][var12] & var9) != 0) {
							int var38 = var13;
							int var39 = var13;
							int var40 = var12;
							int var41 = var12;
							while (var40 > 0 && (this.occlusion[var11][var13][var40 - 1] & var9) != 0) {
								var40--;
							}
							while (var41 < this.maxTileZ && (this.occlusion[var11][var13][var41 + 1] & var9) != 0) {
								var41++;
							}
							label443: while (var38 > 0) {
								for (int var42 = var40; var42 <= var41; var42++) {
									if ((this.occlusion[var11][var38 - 1][var42] & var9) == 0) {
										break label443;
									}
								}
								var38--;
							}
							label432: while (var39 < this.maxTileX) {
								for (int var43 = var40; var43 <= var41; var43++) {
									if ((this.occlusion[var11][var39 + 1][var43] & var9) == 0) {
										break label432;
									}
								}
								var39++;
							}
							if ((var39 - var38 + 1) * (var41 - var40 + 1) >= 4) {
								int var44 = this.heightmap[var11][var38][var40];
								World3D.addOccluder(var38 * 128, 4, var44, var41 * 128 + 128, var10, var39 * 128 + 128, var44, var40 * 128);
								for (int var45 = var38; var45 <= var39; var45++) {
									for (int var46 = var40; var46 <= var41; var46++) {
										this.occlusion[var11][var45][var46] &= ~var9;
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
	public int getDrawLevel(int arg0, int arg1, int arg2) {
		if ((this.flags[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (this.flags[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
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
		return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
		int var4 = noise(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int noise(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 << 13 ^ var2;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int mulHsl(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = (arg0 & 0x7F) * arg1 / 128;
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
			int var4 = (arg0 & 0x7F) * arg1 / 128;
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
		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}

	@ObfuscatedName("c.c(III)Z")
	public static final boolean changeLocAvailable(int id, int shape) {
		LocType loc = LocType.get(id);
		if (shape == 11) {
			shape = 10;
		}
		if (shape >= 5 && shape <= 8) {
			shape = 4;
		}
		return loc.checkModel(shape);
	}

	@ObfuscatedName("c.a(IIIILs;BI[[[ILjc;II)V")
	public static final void addLoc(int x, int shape, int locId, int z, World3D scene, int angle, int[][][] heightmap, CollisionMap collision, int level, int arg10) {
		int heightSW = heightmap[level][x][z];
		int heightSE = heightmap[level][x + 1][z];
		int heightNE = heightmap[level][x + 1][z + 1];
		int heightNW = heightmap[level][x][z + 1];

		int y = heightSW + heightSE + heightNE + heightNW >> 2;

		LocType loc = LocType.get(locId);

		int var17 = (locId << 14) + (z << 7) + x + 1073741824;
		if (!loc.active) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((angle << 6) + shape);
		boolean var19 = false;

		if (shape == 22) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(22, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				model = new ClientLocAnim(heightNW, heightNE, heightSW, 22, angle, true, heightSE, locId, loc.anim);
			}

			scene.addGroundDecor(z, arg10, x, var17, y, model, var18);

			if (loc.blockwalk && loc.active) {
				collision.setBlocked(z, x);
			}
		} else if (shape == 10 || shape == 11) {
			ModelSource var36;
			if (loc.anim == -1) {
				var36 = loc.getModel(10, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var36 = new ClientLocAnim(heightNW, heightNE, heightSW, 10, angle, true, heightSE, locId, loc.anim);
			}
			if (var36 != null) {
				int var37 = 0;
				if (shape == 11) {
					var37 += 256;
				}
				int var38;
				int var39;
				if (angle == 1 || angle == 3) {
					var38 = loc.length;
					var39 = loc.width;
				} else {
					var38 = loc.width;
					var39 = loc.length;
				}
				scene.addLoc(var18, var17, x, arg10, y, var38, var37, var36, var39, z);
			}
			if (loc.blockwalk) {
				collision.addLoc(loc.blockrange, angle, x, loc.length, loc.width, z);
			}
		} else if (shape >= 12) {
			ModelSource var21;
			if (loc.anim == -1) {
				var21 = loc.getModel(shape, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var21 = new ClientLocAnim(heightNW, heightNE, heightSW, shape, angle, true, heightSE, locId, loc.anim);
			}
			scene.addLoc(var18, var17, x, arg10, y, 1, 0, var21, 1, z);
			if (loc.blockwalk) {
				collision.addLoc(loc.blockrange, angle, x, loc.length, loc.width, z);
			}
		} else if (shape == 0) {
			ModelSource model;
			if (loc.anim == -1) {
				model = loc.getModel(0, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				model = new ClientLocAnim(heightNW, heightNE, heightSW, 0, angle, true, heightSE, locId, loc.anim);
			}

			scene.addWall(x, var17, arg10, 0, ROTATION_WALL_TYPE[angle], y, null, model, var18, z);

			if (loc.blockwalk) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}
		} else if (shape == 1) {
			ModelSource var23;
			if (loc.anim == -1) {
				var23 = loc.getModel(1, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var23 = new ClientLocAnim(heightNW, heightNE, heightSW, 1, angle, true, heightSE, locId, loc.anim);
			}
			scene.addWall(x, var17, arg10, 0, ROTATION_WALL_CORNER_TYPE[angle], y, null, var23, var18, z);
			if (loc.blockwalk) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}
		} else if (shape == 2) {
			int offset = (angle + 1) & 0x3;

			ModelSource model1;
			ModelSource model2;
			if (loc.anim == -1) {
				model1 = loc.getModel(2, angle + 4, heightSW, heightSE, heightNE, heightNW, -1);
				model2 = loc.getModel(2, offset, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				model1 = new ClientLocAnim(heightNW, heightNE, heightSW, 2, angle + 4, true, heightSE, locId, loc.anim);
				model2 = new ClientLocAnim(heightNW, heightNE, heightSW, 2, offset, true, heightSE, locId, loc.anim);
			}

			scene.addWall(x, var17, arg10, ROTATION_WALL_TYPE[offset], ROTATION_WALL_TYPE[angle], y, model2, model1, var18, z);

			if (loc.blockwalk) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}
		} else if (shape == 3) {
			ModelSource var27;
			if (loc.anim == -1) {
				var27 = loc.getModel(3, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var27 = new ClientLocAnim(heightNW, heightNE, heightSW, 3, angle, true, heightSE, locId, loc.anim);
			}
			scene.addWall(x, var17, arg10, 0, ROTATION_WALL_CORNER_TYPE[angle], y, null, var27, var18, z);
			if (loc.blockwalk) {
				collision.addWall(z, shape, x, loc.blockrange, angle);
			}
		} else if (shape == 9) {
			ModelSource var28;
			if (loc.anim == -1) {
				var28 = loc.getModel(shape, angle, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var28 = new ClientLocAnim(heightNW, heightNE, heightSW, shape, angle, true, heightSE, locId, loc.anim);
			}
			scene.addLoc(var18, var17, x, arg10, y, 1, 0, var28, 1, z);
			if (loc.blockwalk) {
				collision.addLoc(loc.blockrange, angle, x, loc.length, loc.width, z);
			}
		} else if (shape == 4) {
			ModelSource var29;
			if (loc.anim == -1) {
				var29 = loc.getModel(4, 0, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var29 = new ClientLocAnim(heightNW, heightNE, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}
			scene.addDecor(var18, var29, 0, x, z, ROTATION_WALL_TYPE[angle], 0, angle * 512, arg10, y, var17);
		} else if (shape == 5) {
			int var30 = 16;
			int var31 = scene.getWallTypecode(arg10, x, z);
			if (var31 > 0) {
				var30 = LocType.get(var31 >> 14 & 0x7FFF).wallwidth;
			}
			ModelSource var32;
			if (loc.anim == -1) {
				var32 = loc.getModel(4, 0, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var32 = new ClientLocAnim(heightNW, heightNE, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}
			scene.addDecor(var18, var32, WALL_DECORATION_ROTATION_FORWARD_X[angle] * var30, x, z, ROTATION_WALL_TYPE[angle], WALL_DECORATION_ROTATION_FORWARD_Z[angle] * var30, angle * 512, arg10, y, var17);
		} else if (shape == 6) {
			ModelSource var33;
			if (loc.anim == -1) {
				var33 = loc.getModel(4, 0, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var33 = new ClientLocAnim(heightNW, heightNE, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}
			scene.addDecor(var18, var33, 0, x, z, 256, 0, angle, arg10, y, var17);
		} else if (shape == 7) {
			ModelSource var34;
			if (loc.anim == -1) {
				var34 = loc.getModel(4, 0, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var34 = new ClientLocAnim(heightNW, heightNE, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}
			scene.addDecor(var18, var34, 0, x, z, 512, 0, angle, arg10, y, var17);
		} else if (shape == 8) {
			ModelSource var35;
			if (loc.anim == -1) {
				var35 = loc.getModel(4, 0, heightSW, heightSE, heightNE, heightNW, -1);
			} else {
				var35 = new ClientLocAnim(heightNW, heightNE, heightSW, 4, 0, true, heightSE, locId, loc.anim);
			}
			scene.addDecor(var18, var35, 0, x, z, 768, 0, angle, arg10, y, var17);
		}
	}
}
