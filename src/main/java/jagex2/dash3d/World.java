package jagex2.dash3d;

import deob.*;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.graphics.Model;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public class World {

	@ObfuscatedName("c.a")
	public static int field39 = 3;

	@ObfuscatedName("c.b")
	public boolean field40 = false;

	@ObfuscatedName("c.c")
	public static int field41;

	@ObfuscatedName("c.d")
	public int field42;

	@ObfuscatedName("c.e")
	public static int field43;

	@ObfuscatedName("c.f")
	public static int field44 = -509;

	@ObfuscatedName("c.g")
	public static boolean lowMemory = true;

	@ObfuscatedName("c.h")
	public static int levelBuilt;

	@ObfuscatedName("c.i")
	public static boolean field47;

	@ObfuscatedName("c.j")
	public int field48;

	@ObfuscatedName("c.k")
	public int field49;

	@ObfuscatedName("c.l")
	public int[][][] field50;

	@ObfuscatedName("c.m")
	public byte[][][] field51;

	@ObfuscatedName("c.n")
	public byte[][][] field52;

	@ObfuscatedName("c.o")
	public byte[][][] field53;

	@ObfuscatedName("c.p")
	public byte[][][] field54;

	@ObfuscatedName("c.q")
	public byte[][][] field55;

	@ObfuscatedName("c.r")
	public byte[][][] field56;

	@ObfuscatedName("c.s")
	public int[][] field57;

	@ObfuscatedName("c.t")
	public int[] field58;

	@ObfuscatedName("c.u")
	public int[] field59;

	@ObfuscatedName("c.v")
	public int[] field60;

	@ObfuscatedName("c.w")
	public int[] field61;

	@ObfuscatedName("c.x")
	public int[] field62;

	@ObfuscatedName("c.y")
	public int[][][] field63;

	@ObfuscatedName("c.z")
	public static final int[] field64 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.A")
	public static final int[] field65 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.B")
	public static final int[] field66 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.C")
	public static final int[] field67 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.D")
	public static int field68 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.E")
	public static int field69 = (int) (Math.random() * 33.0D) - 16;

	public World(boolean arg0, int[][][] arg1, byte[][][] arg2, int arg3, int arg4) {
		this.field48 = arg3;
		this.field49 = arg4;
		this.field50 = arg1;
		if (!arg0) {
			throw new NullPointerException();
		}
		this.field51 = arg2;
		this.field52 = new byte[4][this.field48][this.field49];
		this.field53 = new byte[4][this.field48][this.field49];
		this.field54 = new byte[4][this.field48][this.field49];
		this.field55 = new byte[4][this.field48][this.field49];
		this.field63 = new int[4][this.field48 + 1][this.field49 + 1];
		this.field56 = new byte[4][this.field48 + 1][this.field49 + 1];
		this.field57 = new int[this.field48 + 1][this.field49 + 1];
		this.field58 = new int[this.field49];
		this.field59 = new int[this.field49];
		this.field60 = new int[this.field49];
		this.field61 = new int[this.field49];
		this.field62 = new int[this.field49];
	}

	@ObfuscatedName("c.a(IIIZI)V")
	public final void stitchHeightmap(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		if (!arg3) {
			field41 = 421;
		}
		for (int var6 = arg1; var6 <= arg1 + arg4; var6++) {
			for (int var7 = arg0; var7 <= arg0 + arg2; var7++) {
				if (var7 >= 0 && var7 < this.field48 && var6 >= 0 && var6 < this.field49) {
					this.field56[0][var7][var6] = 127;
					if (arg0 == var7 && var7 > 0) {
						this.field50[0][var7][var6] = this.field50[0][var7 - 1][var6];
					}
					if (arg0 + arg2 == var7 && var7 < this.field48 - 1) {
						this.field50[0][var7][var6] = this.field50[0][var7 + 1][var6];
					}
					if (arg1 == var6 && var6 > 0) {
						this.field50[0][var7][var6] = this.field50[0][var7][var6 - 1];
					}
					if (arg1 + arg4 == var6 && var6 < this.field49 - 1) {
						this.field50[0][var7][var6] = this.field50[0][var7][var6 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BIIII)V")
	public final void readLand(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 <= 0) {
			field41 = -244;
		}
		Packet var7 = new Packet((byte) -109, arg1);
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					int var11 = arg2 + var9;
					int var12 = arg3 + var10;
					if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
						this.field51[var8][var11][var12] = 0;
						while (true) {
							int var13 = var7.g1();
							if (var13 == 0) {
								if (var8 == 0) {
									this.field50[0][var11][var12] = -method22(var11 + 932731 + arg4, var12 + 556238 + arg5) * 8;
								} else {
									this.field50[var8][var11][var12] = this.field50[var8 - 1][var11][var12] - 240;
								}
								break;
							}
							if (var13 == 1) {
								int var14 = var7.g1();
								if (var14 == 1) {
									var14 = 0;
								}
								if (var8 == 0) {
									this.field50[0][var11][var12] = -var14 * 8;
								} else {
									this.field50[var8][var11][var12] = this.field50[var8 - 1][var11][var12] - var14 * 8;
								}
								break;
							}
							if (var13 <= 49) {
								this.field53[var8][var11][var12] = var7.g1b();
								this.field54[var8][var11][var12] = (byte) ((var13 - 2) / 4);
								this.field55[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
							} else if (var13 <= 81) {
								this.field51[var8][var11][var12] = (byte) (var13 - 49);
							} else {
								this.field52[var8][var11][var12] = (byte) (var13 - 81);
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
	public static final boolean validateLocs(int arg0, int arg1, byte[] arg2, boolean arg3) {
		boolean var4 = true;
		Packet var5 = new Packet((byte) -109, arg2);
		if (!arg3) {
			field39 = 159;
		}
		int var6 = -1;
		label54: while (true) {
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
						continue label54;
					}
					var8 += var11 - 1;
					int var12 = var8 & 0x3F;
					int var13 = var8 >> 6 & 0x3F;
					int var14 = var5.g1() >> 2;
					int var15 = arg0 + var13;
					int var16 = arg1 + var12;
					if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
						LocType var17 = LocType.get(var6);
						if (var14 != 22 || !lowMemory || var17.active || var17.forcedecor) {
							var4 &= var17.validate(field43);
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
	public static final void prefetchLocs(int arg0, Packet arg1, OnDemand arg2) {
		int var3 = -1;
		if (arg0 != 31048) {
			field41 = 8;
		}
		while (true) {
			int var4 = arg1.gsmarts();
			if (var4 == 0) {
				return;
			}
			var3 += var4;
			LocType var5 = LocType.get(var3);
			var5.prefetch(field44, arg2);
			while (true) {
				int var6 = arg1.gsmarts();
				if (var6 == 0) {
					break;
				}
				arg1.g1();
			}
		}
	}

	@ObfuscatedName("c.a(ILs;[Ljc;IZ[B)V")
	public final void readLoc(int arg0, World3D arg1, CollisionMap[] arg2, int arg3, boolean arg4, byte[] arg5) {
		Packet var7 = new Packet((byte) -109, arg5);
		if (!arg4) {
			return;
		}
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
				int var18 = arg3 + var13;
				int var19 = arg0 + var12;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					int var20 = var14;
					if ((this.field51[1][var18][var19] & 0x2) == 2) {
						var20 = var14 - 1;
					}
					CollisionMap var21 = null;
					if (var20 >= 0) {
						var21 = arg2[var20];
					}
					this.method19(var8, var19, var17, false, arg1, var21, var18, var16, var14);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIIZLs;Ljc;III)V")
	public final void method19(int arg0, int arg1, int arg2, boolean arg3, World3D arg4, CollisionMap arg5, int arg6, int arg7, int arg8) {
		if (lowMemory) {
			if ((this.field51[arg8][arg6][arg1] & 0x10) != 0) {
				return;
			}
			if (this.method21(arg6, arg8, arg1, this.field42) != levelBuilt) {
				return;
			}
		}
		int var10 = this.field50[arg8][arg6][arg1];
		int var11 = this.field50[arg8][arg6 + 1][arg1];
		int var12 = this.field50[arg8][arg6 + 1][arg1 + 1];
		int var13 = this.field50[arg8][arg6][arg1 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.get(arg0);
		int var16 = (arg0 << 14) + (arg1 << 7) + arg6 + 1073741824;
		if (!var15.active) {
			var16 += Integer.MIN_VALUE;
		}
		byte var17 = (byte) ((arg2 << 6) + arg7);
		if (arg3) {
			this.field40 = !this.field40;
		}
		if (arg7 == 22) {
			if (!lowMemory || var15.active || var15.forcedecor) {
				Entity var18;
				if (var15.anim == -1) {
					var18 = var15.getModel(22, arg2, var10, var11, var12, var13, -1);
				} else {
					var18 = new LocEntity(var13, var12, var10, true, 22, arg2, true, var11, arg0, var15.anim);
				}
				arg4.method69(arg1, arg8, arg6, 0, var16, var14, var18, var17);
				if (var15.blockwalk && var15.active && arg5 != null) {
					arg5.method362(arg1, 8, arg6);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			Entity var34;
			if (var15.anim == -1) {
				var34 = var15.getModel(10, arg2, var10, var11, var12, var13, -1);
			} else {
				var34 = new LocEntity(var13, var12, var10, true, 10, arg2, true, var11, arg0, var15.anim);
			}
			if (var34 != null) {
				int var35 = 0;
				if (arg7 == 11) {
					var35 += 256;
				}
				int var36;
				int var37;
				if (arg2 == 1 || arg2 == 3) {
					var36 = var15.length;
					var37 = var15.width;
				} else {
					var36 = var15.width;
					var37 = var15.length;
				}
				if (arg4.method73(var17, var16, -21680, arg6, arg8, var14, var36, var35, var34, var37, arg1) && var15.shadow) {
					Model var38;
					if (var34 instanceof Model) {
						var38 = (Model) var34;
					} else {
						var38 = var15.getModel(10, arg2, var10, var11, var12, var13, -1);
					}
					if (var38 != null) {
						for (int var39 = 0; var39 <= var36; var39++) {
							for (int var40 = 0; var40 <= var37; var40++) {
								int var41 = var38.field567 / 4;
								if (var41 > 30) {
									var41 = 30;
								}
								if (var41 > this.field56[arg8][arg6 + var39][arg1 + var40]) {
									this.field56[arg8][arg6 + var39][arg1 + var40] = (byte) var41;
								}
							}
						}
					}
				}
			}
			if (var15.blockwalk && arg5 != null) {
				arg5.method361(var15.blockrange, arg2, arg6, var15.length, true, var15.width, arg1);
			}
		} else if (arg7 >= 12) {
			Entity var19;
			if (var15.anim == -1) {
				var19 = var15.getModel(arg7, arg2, var10, var11, var12, var13, -1);
			} else {
				var19 = new LocEntity(var13, var12, var10, true, arg7, arg2, true, var11, arg0, var15.anim);
			}
			arg4.method73(var17, var16, -21680, arg6, arg8, var14, 1, 0, var19, 1, arg1);
			if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg8 > 0) {
				this.field63[arg8][arg6][arg1] |= 0x924;
			}
			if (var15.blockwalk && arg5 != null) {
				arg5.method361(var15.blockrange, arg2, arg6, var15.length, true, var15.width, arg1);
			}
		} else if (arg7 == 0) {
			Entity var20;
			if (var15.anim == -1) {
				var20 = var15.getModel(0, arg2, var10, var11, var12, var13, -1);
			} else {
				var20 = new LocEntity(var13, var12, var10, true, 0, arg2, true, var11, arg0, var15.anim);
			}
			arg4.method71(arg6, var16, arg8, 0, true, field64[arg2], var14, null, var20, var17, arg1);
			if (arg2 == 0) {
				if (var15.shadow) {
					this.field56[arg8][arg6][arg1] = 50;
					this.field56[arg8][arg6][arg1 + 1] = 50;
				}
				if (var15.occlude) {
					this.field63[arg8][arg6][arg1] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var15.shadow) {
					this.field56[arg8][arg6][arg1 + 1] = 50;
					this.field56[arg8][arg6 + 1][arg1 + 1] = 50;
				}
				if (var15.occlude) {
					this.field63[arg8][arg6][arg1 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var15.shadow) {
					this.field56[arg8][arg6 + 1][arg1] = 50;
					this.field56[arg8][arg6 + 1][arg1 + 1] = 50;
				}
				if (var15.occlude) {
					this.field63[arg8][arg6 + 1][arg1] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var15.shadow) {
					this.field56[arg8][arg6][arg1] = 50;
					this.field56[arg8][arg6 + 1][arg1] = 50;
				}
				if (var15.occlude) {
					this.field63[arg8][arg6][arg1] |= 0x492;
				}
			}
			if (var15.blockwalk && arg5 != null) {
				arg5.method360(arg1, arg7, arg6, var15.blockrange, -371, arg2);
			}
			if (var15.wallwidth != 16) {
				arg4.method79(var15.wallwidth, arg6, arg1, arg8, 2);
			}
		} else if (arg7 == 1) {
			Entity var21;
			if (var15.anim == -1) {
				var21 = var15.getModel(1, arg2, var10, var11, var12, var13, -1);
			} else {
				var21 = new LocEntity(var13, var12, var10, true, 1, arg2, true, var11, arg0, var15.anim);
			}
			arg4.method71(arg6, var16, arg8, 0, true, field65[arg2], var14, null, var21, var17, arg1);
			if (var15.shadow) {
				if (arg2 == 0) {
					this.field56[arg8][arg6][arg1 + 1] = 50;
				} else if (arg2 == 1) {
					this.field56[arg8][arg6 + 1][arg1 + 1] = 50;
				} else if (arg2 == 2) {
					this.field56[arg8][arg6 + 1][arg1] = 50;
				} else if (arg2 == 3) {
					this.field56[arg8][arg6][arg1] = 50;
				}
			}
			if (var15.blockwalk && arg5 != null) {
				arg5.method360(arg1, arg7, arg6, var15.blockrange, -371, arg2);
			}
		} else if (arg7 == 2) {
			int var22 = arg2 + 1 & 0x3;
			Entity var23;
			Entity var24;
			if (var15.anim == -1) {
				var23 = var15.getModel(2, arg2 + 4, var10, var11, var12, var13, -1);
				var24 = var15.getModel(2, var22, var10, var11, var12, var13, -1);
			} else {
				var23 = new LocEntity(var13, var12, var10, true, 2, arg2 + 4, true, var11, arg0, var15.anim);
				var24 = new LocEntity(var13, var12, var10, true, 2, var22, true, var11, arg0, var15.anim);
			}
			arg4.method71(arg6, var16, arg8, field64[var22], true, field64[arg2], var14, var24, var23, var17, arg1);
			if (var15.occlude) {
				if (arg2 == 0) {
					this.field63[arg8][arg6][arg1] |= 0x249;
					this.field63[arg8][arg6][arg1 + 1] |= 0x492;
				} else if (arg2 == 1) {
					this.field63[arg8][arg6][arg1 + 1] |= 0x492;
					this.field63[arg8][arg6 + 1][arg1] |= 0x249;
				} else if (arg2 == 2) {
					this.field63[arg8][arg6 + 1][arg1] |= 0x249;
					this.field63[arg8][arg6][arg1] |= 0x492;
				} else if (arg2 == 3) {
					this.field63[arg8][arg6][arg1] |= 0x492;
					this.field63[arg8][arg6][arg1] |= 0x249;
				}
			}
			if (var15.blockwalk && arg5 != null) {
				arg5.method360(arg1, arg7, arg6, var15.blockrange, -371, arg2);
			}
			if (var15.wallwidth != 16) {
				arg4.method79(var15.wallwidth, arg6, arg1, arg8, 2);
			}
		} else if (arg7 == 3) {
			Entity var25;
			if (var15.anim == -1) {
				var25 = var15.getModel(3, arg2, var10, var11, var12, var13, -1);
			} else {
				var25 = new LocEntity(var13, var12, var10, true, 3, arg2, true, var11, arg0, var15.anim);
			}
			arg4.method71(arg6, var16, arg8, 0, true, field65[arg2], var14, null, var25, var17, arg1);
			if (var15.shadow) {
				if (arg2 == 0) {
					this.field56[arg8][arg6][arg1 + 1] = 50;
				} else if (arg2 == 1) {
					this.field56[arg8][arg6 + 1][arg1 + 1] = 50;
				} else if (arg2 == 2) {
					this.field56[arg8][arg6 + 1][arg1] = 50;
				} else if (arg2 == 3) {
					this.field56[arg8][arg6][arg1] = 50;
				}
			}
			if (var15.blockwalk && arg5 != null) {
				arg5.method360(arg1, arg7, arg6, var15.blockrange, -371, arg2);
			}
		} else if (arg7 == 9) {
			Entity var26;
			if (var15.anim == -1) {
				var26 = var15.getModel(arg7, arg2, var10, var11, var12, var13, -1);
			} else {
				var26 = new LocEntity(var13, var12, var10, true, arg7, arg2, true, var11, arg0, var15.anim);
			}
			arg4.method73(var17, var16, -21680, arg6, arg8, var14, 1, 0, var26, 1, arg1);
			if (var15.blockwalk && arg5 != null) {
				arg5.method361(var15.blockrange, arg2, arg6, var15.length, true, var15.width, arg1);
			}
		} else if (arg7 == 4) {
			Entity var27;
			if (var15.anim == -1) {
				var27 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var27 = new LocEntity(var13, var12, var10, true, 4, 0, true, var11, arg0, var15.anim);
			}
			arg4.method72(var17, var27, 0, arg6, arg1, field64[arg2], 0, 1, arg2 * 512, arg8, var14, var16);
		} else if (arg7 == 5) {
			int var28 = 16;
			int var29 = arg4.getWallTypecode(arg8, arg6, arg1);
			if (var29 > 0) {
				var28 = LocType.get(var29 >> 14 & 0x7FFF).wallwidth;
			}
			Entity var30;
			if (var15.anim == -1) {
				var30 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var30 = new LocEntity(var13, var12, var10, true, 4, 0, true, var11, arg0, var15.anim);
			}
			arg4.method72(var17, var30, field66[arg2] * var28, arg6, arg1, field64[arg2], field67[arg2] * var28, 1, arg2 * 512, arg8, var14, var16);
		} else if (arg7 == 6) {
			Entity var31;
			if (var15.anim == -1) {
				var31 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var31 = new LocEntity(var13, var12, var10, true, 4, 0, true, var11, arg0, var15.anim);
			}
			arg4.method72(var17, var31, 0, arg6, arg1, 256, 0, 1, arg2, arg8, var14, var16);
		} else if (arg7 == 7) {
			Entity var32;
			if (var15.anim == -1) {
				var32 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var32 = new LocEntity(var13, var12, var10, true, 4, 0, true, var11, arg0, var15.anim);
			}
			arg4.method72(var17, var32, 0, arg6, arg1, 512, 0, 1, arg2, arg8, var14, var16);
		} else if (arg7 == 8) {
			Entity var33;
			if (var15.anim == -1) {
				var33 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
			} else {
				var33 = new LocEntity(var13, var12, var10, true, 4, 0, true, var11, arg0, var15.anim);
			}
			arg4.method72(var17, var33, 0, arg6, arg1, 768, 0, 1, arg2, arg8, var14, var16);
		}
	}

	@ObfuscatedName("c.a(Ls;[Ljc;Z)V")
	public final void build(World3D arg0, CollisionMap[] arg1, boolean arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			for (int var110 = 0; var110 < 104; var110++) {
				for (int var111 = 0; var111 < 104; var111++) {
					if ((this.field51[var4][var110][var111] & 0x1) == 1) {
						int var112 = var4;
						if ((this.field51[1][var110][var111] & 0x2) == 2) {
							var112 = var4 - 1;
						}
						if (var112 >= 0) {
							arg1[var112].method362(var111, 8, var110);
						}
					}
				}
			}
		}
		if (arg2) {
			return;
		}
		if (field47) {
			field68 = 0;
			field69 = 0;
		} else {
			field68 += (int) (Math.random() * 5.0D) - 2;
			if (field68 < -8) {
				field68 = -8;
			}
			if (field68 > 8) {
				field68 = 8;
			}
			field69 += (int) (Math.random() * 5.0D) - 2;
			if (field69 < -16) {
				field69 = -16;
			}
			if (field69 > 16) {
				field69 = 16;
			}
		}
		for (int var5 = 0; var5 < 4; var5++) {
			byte[][] var48 = this.field56[var5];
			byte var49 = 96;
			short var50 = 768;
			byte var51 = -50;
			byte var52 = -10;
			byte var53 = -50;
			int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
			int var55 = var50 * var54 >> 8;
			for (int var56 = 1; var56 < this.field49 - 1; var56++) {
				for (int var101 = 1; var101 < this.field48 - 1; var101++) {
					int var102 = this.field50[var5][var101 + 1][var56] - this.field50[var5][var101 - 1][var56];
					int var103 = this.field50[var5][var101][var56 + 1] - this.field50[var5][var101][var56 - 1];
					int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
					int var105 = (var102 << 8) / var104;
					int var106 = 65536 / var104;
					int var107 = (var103 << 8) / var104;
					int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
					int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
					this.field57[var101][var56] = var108 - var109;
				}
			}
			for (int var57 = 0; var57 < this.field49; var57++) {
				this.field58[var57] = 0;
				this.field59[var57] = 0;
				this.field60[var57] = 0;
				this.field61[var57] = 0;
				this.field62[var57] = 0;
			}
			for (int var58 = -5; var58 < this.field48 + 5; var58++) {
				for (int var61 = 0; var61 < this.field49; var61++) {
					int var95 = var58 + 5;
					int var10002;
					if (var95 >= 0 && var95 < this.field48) {
						int var96 = this.field52[var5][var95][var61] & 0xFF;
						if (var96 > 0) {
							FloType var97 = FloType.types[var96 - 1];
							this.field58[var61] += var97.chroma;
							this.field59[var61] += var97.saturation;
							this.field60[var61] += var97.lightness;
							this.field61[var61] += var97.luminance;
							var10002 = this.field62[var61]++;
						}
					}
					int var98 = var58 - 5;
					if (var98 >= 0 && var98 < this.field48) {
						int var99 = this.field52[var5][var98][var61] & 0xFF;
						if (var99 > 0) {
							FloType var100 = FloType.types[var99 - 1];
							this.field58[var61] -= var100.chroma;
							this.field59[var61] -= var100.saturation;
							this.field60[var61] -= var100.lightness;
							this.field61[var61] -= var100.luminance;
							var10002 = this.field62[var61]--;
						}
					}
				}
				if (var58 >= 1 && var58 < this.field48 - 1) {
					int var62 = 0;
					int var63 = 0;
					int var64 = 0;
					int var65 = 0;
					int var66 = 0;
					for (int var67 = -5; var67 < this.field49 + 5; var67++) {
						int var68 = var67 + 5;
						if (var68 >= 0 && var68 < this.field49) {
							var62 += this.field58[var68];
							var63 += this.field59[var68];
							var64 += this.field60[var68];
							var65 += this.field61[var68];
							var66 += this.field62[var68];
						}
						int var69 = var67 - 5;
						if (var69 >= 0 && var69 < this.field49) {
							var62 -= this.field58[var69];
							var63 -= this.field59[var69];
							var64 -= this.field60[var69];
							var65 -= this.field61[var69];
							var66 -= this.field62[var69];
						}
						if (var67 >= 1 && var67 < this.field49 - 1 && (!lowMemory || (this.field51[var5][var58][var67] & 0x10) == 0 && this.method21(var58, var5, var67, this.field42) == levelBuilt)) {
							int var70 = this.field52[var5][var58][var67] & 0xFF;
							int var71 = this.field53[var5][var58][var67] & 0xFF;
							if (var70 > 0 || var71 > 0) {
								int var72 = this.field50[var5][var58][var67];
								int var73 = this.field50[var5][var58 + 1][var67];
								int var74 = this.field50[var5][var58 + 1][var67 + 1];
								int var75 = this.field50[var5][var58][var67 + 1];
								int var76 = this.field57[var58][var67];
								int var77 = this.field57[var58 + 1][var67];
								int var78 = this.field57[var58 + 1][var67 + 1];
								int var79 = this.field57[var58][var67 + 1];
								int var80 = -1;
								int var81 = -1;
								if (var70 > 0) {
									int var82 = var62 * 256 / var65;
									int var83 = var63 / var66;
									int var84 = var64 / var66;
									var80 = this.method29(var82, var83, var84);
									int var85 = field68 + var82 & 0xFF;
									int var86 = field69 + var84;
									if (var86 < 0) {
										var86 = 0;
									} else if (var86 > 255) {
										var86 = 255;
									}
									var81 = this.method29(var85, var83, var86);
								}
								if (var5 > 0) {
									boolean var87 = true;
									if (var70 == 0 && this.field54[var5][var58][var67] != 0) {
										var87 = false;
									}
									if (var71 > 0 && !FloType.types[var71 - 1].occlude) {
										var87 = false;
									}
									if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
										this.field63[var5][var58][var67] |= 0x924;
									}
								}
								int var88 = 0;
								if (var80 != -1) {
									var88 = Pix3D.palette[method27(var81, 96)];
								}
								if (var71 == 0) {
									arg0.method68(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), 0, 0, 0, 0, var88, 0);
								} else {
									int var89 = this.field54[var5][var58][var67] + 1;
									byte var90 = this.field55[var5][var58][var67];
									FloType var91 = FloType.types[var71 - 1];
									int var92 = var91.texture;
									int var93;
									int var94;
									if (var92 >= 0) {
										var93 = Pix3D.getAverageTextureRgb(var92, 3);
										var94 = -1;
									} else if (var91.rgb == 16711935) {
										var93 = 0;
										var94 = -2;
										var92 = -1;
									} else {
										var94 = this.method29(var91.hue, var91.saturation, var91.lightness);
										var93 = Pix3D.palette[this.method28(var91.hsl, 96)];
									}
									arg0.method68(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method27(var80, var76), method27(var80, var77), method27(var80, var78), method27(var80, var79), this.method28(var94, var76), this.method28(var94, var77), this.method28(var94, var78), this.method28(var94, var79), var88, var93);
								}
							}
						}
					}
				}
			}
			for (int var59 = 1; var59 < this.field49 - 1; var59++) {
				for (int var60 = 1; var60 < this.field48 - 1; var60++) {
					arg0.method67(var5, var60, var59, this.method21(var60, var5, var59, this.field42));
				}
			}
		}
		if (!field47) {
			arg0.method94(-10, -50, -350, -50, 64, 768);
		}
		for (int var6 = 0; var6 < this.field48; var6++) {
			for (int var47 = 0; var47 < this.field49; var47++) {
				if ((this.field51[1][var6][var47] & 0x2) == 2) {
					arg0.method65(false, var47, var6);
				}
			}
		}
		if (field47) {
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
				for (int var12 = 0; var12 <= this.field49; var12++) {
					for (int var13 = 0; var13 <= this.field48; var13++) {
						if ((this.field63[var11][var13][var12] & var7) != 0) {
							int var14 = var12;
							int var15 = var12;
							int var16 = var11;
							int var17 = var11;
							while (var14 > 0 && (this.field63[var11][var13][var14 - 1] & var7) != 0) {
								var14--;
							}
							while (var15 < this.field49 && (this.field63[var11][var13][var15 + 1] & var7) != 0) {
								var15++;
							}
							label337: while (var16 > 0) {
								for (int var18 = var14; var18 <= var15; var18++) {
									if ((this.field63[var16 - 1][var13][var18] & var7) == 0) {
										break label337;
									}
								}
								var16--;
							}
							label326: while (var17 < var10) {
								for (int var19 = var14; var19 <= var15; var19++) {
									if ((this.field63[var17 + 1][var13][var19] & var7) == 0) {
										break label326;
									}
								}
								var17++;
							}
							int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var20 >= 8) {
								short var21 = 240;
								int var22 = this.field50[var17][var13][var14] - var21;
								int var23 = this.field50[var16][var13][var14];
								World3D.method66(var13 * 128, 1, var23, var15 * 128 + 128, var10, var13 * 128, (byte) 6, var22, var14 * 128);
								for (int var24 = var16; var24 <= var17; var24++) {
									for (int var25 = var14; var25 <= var15; var25++) {
										this.field63[var24][var13][var25] &= ~var7;
									}
								}
							}
						}
						if ((this.field63[var11][var13][var12] & var8) != 0) {
							int var26 = var13;
							int var27 = var13;
							int var28 = var11;
							int var29 = var11;
							while (var26 > 0 && (this.field63[var11][var26 - 1][var12] & var8) != 0) {
								var26--;
							}
							while (var27 < this.field48 && (this.field63[var11][var27 + 1][var12] & var8) != 0) {
								var27++;
							}
							label390: while (var28 > 0) {
								for (int var30 = var26; var30 <= var27; var30++) {
									if ((this.field63[var28 - 1][var30][var12] & var8) == 0) {
										break label390;
									}
								}
								var28--;
							}
							label379: while (var29 < var10) {
								for (int var31 = var26; var31 <= var27; var31++) {
									if ((this.field63[var29 + 1][var31][var12] & var8) == 0) {
										break label379;
									}
								}
								var29++;
							}
							int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
							if (var32 >= 8) {
								short var33 = 240;
								int var34 = this.field50[var29][var26][var12] - var33;
								int var35 = this.field50[var28][var26][var12];
								World3D.method66(var26 * 128, 2, var35, var12 * 128, var10, var27 * 128 + 128, (byte) 6, var34, var12 * 128);
								for (int var36 = var28; var36 <= var29; var36++) {
									for (int var37 = var26; var37 <= var27; var37++) {
										this.field63[var36][var37][var12] &= ~var8;
									}
								}
							}
						}
						if ((this.field63[var11][var13][var12] & var9) != 0) {
							int var38 = var13;
							int var39 = var13;
							int var40 = var12;
							int var41 = var12;
							while (var40 > 0 && (this.field63[var11][var13][var40 - 1] & var9) != 0) {
								var40--;
							}
							while (var41 < this.field49 && (this.field63[var11][var13][var41 + 1] & var9) != 0) {
								var41++;
							}
							label443: while (var38 > 0) {
								for (int var42 = var40; var42 <= var41; var42++) {
									if ((this.field63[var11][var38 - 1][var42] & var9) == 0) {
										break label443;
									}
								}
								var38--;
							}
							label432: while (var39 < this.field48) {
								for (int var43 = var40; var43 <= var41; var43++) {
									if ((this.field63[var11][var39 + 1][var43] & var9) == 0) {
										break label432;
									}
								}
								var39++;
							}
							if ((var39 - var38 + 1) * (var41 - var40 + 1) >= 4) {
								int var44 = this.field50[var11][var38][var40];
								World3D.method66(var38 * 128, 4, var44, var41 * 128 + 128, var10, var39 * 128 + 128, (byte) 6, var44, var40 * 128);
								for (int var45 = var38; var45 <= var39; var45++) {
									for (int var46 = var40; var46 <= var41; var46++) {
										this.field63[var11][var45][var46] &= ~var9;
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
	public int method21(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 != 0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if ((this.field51[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (this.field51[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("c.a(II)I")
	public static final int method22(int arg0, int arg1) {
		int var2 = method23(arg0 + 45365, arg1 + 91923, 4) - 128 + (method23(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method23(arg0, arg1, 1) - 128 >> 2);
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("c.a(III)I")
	public static final int method23(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method25(var3, var5);
		int var8 = method25(var3 + 1, var5);
		int var9 = method25(var3, var5 + 1);
		int var10 = method25(var3 + 1, var5 + 1);
		int var11 = method24(var7, var8, var4, arg2);
		int var12 = method24(var9, var10, var4, arg2);
		return method24(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static final int method24(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.cosTable[arg2 * 1024 / arg3] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int method25(int arg0, int arg1) {
		int var2 = method26(arg0 - 1, arg1 - 1) + method26(arg0 + 1, arg1 - 1) + method26(arg0 - 1, arg1 + 1) + method26(arg0 + 1, arg1 + 1);
		int var3 = method26(arg0 - 1, arg1) + method26(arg0 + 1, arg1) + method26(arg0, arg1 - 1) + method26(arg0, arg1 + 1);
		int var4 = method26(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int method26(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 << 13 ^ var2;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int method27(int arg0, int arg1) {
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
	public final int method28(int arg0, int arg1) {
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
	public final int method29(int arg0, int arg1, int arg2) {
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
	public static final boolean isLocReady(int arg0, int arg1, int arg2) {
		LocType var3 = LocType.get(arg1);
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return var3.validate(0, arg2);
	}

	@ObfuscatedName("c.a(IIIILs;BI[[[ILjc;II)V")
	public static final void addLoc(int arg0, int arg1, int arg2, int arg3, World3D arg4, byte arg5, int arg6, int[][][] arg7, CollisionMap arg8, int arg9, int arg10) {
		int var11 = arg7[arg9][arg0][arg3];
		int var12 = arg7[arg9][arg0 + 1][arg3];
		int var13 = arg7[arg9][arg0 + 1][arg3 + 1];
		int var14 = arg7[arg9][arg0][arg3 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		LocType var16 = LocType.get(arg2);
		int var17 = (arg2 << 14) + (arg3 << 7) + arg0 + 1073741824;
		if (!var16.active) {
			var17 += Integer.MIN_VALUE;
		}
		byte var18 = (byte) ((arg6 << 6) + arg1);
		if (arg5 != 5) {
			return;
		}
		boolean var19 = false;
		if (arg1 == 22) {
			Entity var20;
			if (var16.anim == -1) {
				var20 = var16.getModel(22, arg6, var11, var12, var13, var14, -1);
			} else {
				var20 = new LocEntity(var14, var13, var11, true, 22, arg6, true, var12, arg2, var16.anim);
			}
			arg4.method69(arg3, arg10, arg0, 0, var17, var15, var20, var18);
			if (var16.blockwalk && var16.active) {
				arg8.method362(arg3, 8, arg0);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			Entity var36;
			if (var16.anim == -1) {
				var36 = var16.getModel(10, arg6, var11, var12, var13, var14, -1);
			} else {
				var36 = new LocEntity(var14, var13, var11, true, 10, arg6, true, var12, arg2, var16.anim);
			}
			if (var36 != null) {
				int var37 = 0;
				if (arg1 == 11) {
					var37 += 256;
				}
				int var38;
				int var39;
				if (arg6 == 1 || arg6 == 3) {
					var38 = var16.length;
					var39 = var16.width;
				} else {
					var38 = var16.width;
					var39 = var16.length;
				}
				arg4.method73(var18, var17, -21680, arg0, arg10, var15, var38, var37, var36, var39, arg3);
			}
			if (var16.blockwalk) {
				arg8.method361(var16.blockrange, arg6, arg0, var16.length, true, var16.width, arg3);
			}
		} else if (arg1 >= 12) {
			Entity var21;
			if (var16.anim == -1) {
				var21 = var16.getModel(arg1, arg6, var11, var12, var13, var14, -1);
			} else {
				var21 = new LocEntity(var14, var13, var11, true, arg1, arg6, true, var12, arg2, var16.anim);
			}
			arg4.method73(var18, var17, -21680, arg0, arg10, var15, 1, 0, var21, 1, arg3);
			if (var16.blockwalk) {
				arg8.method361(var16.blockrange, arg6, arg0, var16.length, true, var16.width, arg3);
			}
		} else if (arg1 == 0) {
			Entity var22;
			if (var16.anim == -1) {
				var22 = var16.getModel(0, arg6, var11, var12, var13, var14, -1);
			} else {
				var22 = new LocEntity(var14, var13, var11, true, 0, arg6, true, var12, arg2, var16.anim);
			}
			arg4.method71(arg0, var17, arg10, 0, true, field64[arg6], var15, null, var22, var18, arg3);
			if (var16.blockwalk) {
				arg8.method360(arg3, arg1, arg0, var16.blockrange, -371, arg6);
			}
		} else if (arg1 == 1) {
			Entity var23;
			if (var16.anim == -1) {
				var23 = var16.getModel(1, arg6, var11, var12, var13, var14, -1);
			} else {
				var23 = new LocEntity(var14, var13, var11, true, 1, arg6, true, var12, arg2, var16.anim);
			}
			arg4.method71(arg0, var17, arg10, 0, true, field65[arg6], var15, null, var23, var18, arg3);
			if (var16.blockwalk) {
				arg8.method360(arg3, arg1, arg0, var16.blockrange, -371, arg6);
			}
		} else if (arg1 == 2) {
			int var24 = arg6 + 1 & 0x3;
			Entity var25;
			Entity var26;
			if (var16.anim == -1) {
				var25 = var16.getModel(2, arg6 + 4, var11, var12, var13, var14, -1);
				var26 = var16.getModel(2, var24, var11, var12, var13, var14, -1);
			} else {
				var25 = new LocEntity(var14, var13, var11, true, 2, arg6 + 4, true, var12, arg2, var16.anim);
				var26 = new LocEntity(var14, var13, var11, true, 2, var24, true, var12, arg2, var16.anim);
			}
			arg4.method71(arg0, var17, arg10, field64[var24], true, field64[arg6], var15, var26, var25, var18, arg3);
			if (var16.blockwalk) {
				arg8.method360(arg3, arg1, arg0, var16.blockrange, -371, arg6);
			}
		} else if (arg1 == 3) {
			Entity var27;
			if (var16.anim == -1) {
				var27 = var16.getModel(3, arg6, var11, var12, var13, var14, -1);
			} else {
				var27 = new LocEntity(var14, var13, var11, true, 3, arg6, true, var12, arg2, var16.anim);
			}
			arg4.method71(arg0, var17, arg10, 0, true, field65[arg6], var15, null, var27, var18, arg3);
			if (var16.blockwalk) {
				arg8.method360(arg3, arg1, arg0, var16.blockrange, -371, arg6);
			}
		} else if (arg1 == 9) {
			Entity var28;
			if (var16.anim == -1) {
				var28 = var16.getModel(arg1, arg6, var11, var12, var13, var14, -1);
			} else {
				var28 = new LocEntity(var14, var13, var11, true, arg1, arg6, true, var12, arg2, var16.anim);
			}
			arg4.method73(var18, var17, -21680, arg0, arg10, var15, 1, 0, var28, 1, arg3);
			if (var16.blockwalk) {
				arg8.method361(var16.blockrange, arg6, arg0, var16.length, true, var16.width, arg3);
			}
		} else if (arg1 == 4) {
			Entity var29;
			if (var16.anim == -1) {
				var29 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var29 = new LocEntity(var14, var13, var11, true, 4, 0, true, var12, arg2, var16.anim);
			}
			arg4.method72(var18, var29, 0, arg0, arg3, field64[arg6], 0, 1, arg6 * 512, arg10, var15, var17);
		} else if (arg1 == 5) {
			int var30 = 16;
			int var31 = arg4.getWallTypecode(arg10, arg0, arg3);
			if (var31 > 0) {
				var30 = LocType.get(var31 >> 14 & 0x7FFF).wallwidth;
			}
			Entity var32;
			if (var16.anim == -1) {
				var32 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var32 = new LocEntity(var14, var13, var11, true, 4, 0, true, var12, arg2, var16.anim);
			}
			arg4.method72(var18, var32, field66[arg6] * var30, arg0, arg3, field64[arg6], field67[arg6] * var30, 1, arg6 * 512, arg10, var15, var17);
		} else if (arg1 == 6) {
			Entity var33;
			if (var16.anim == -1) {
				var33 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var33 = new LocEntity(var14, var13, var11, true, 4, 0, true, var12, arg2, var16.anim);
			}
			arg4.method72(var18, var33, 0, arg0, arg3, 256, 0, 1, arg6, arg10, var15, var17);
		} else if (arg1 == 7) {
			Entity var34;
			if (var16.anim == -1) {
				var34 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var34 = new LocEntity(var14, var13, var11, true, 4, 0, true, var12, arg2, var16.anim);
			}
			arg4.method72(var18, var34, 0, arg0, arg3, 512, 0, 1, arg6, arg10, var15, var17);
		} else if (arg1 == 8) {
			Entity var35;
			if (var16.anim == -1) {
				var35 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
			} else {
				var35 = new LocEntity(var14, var13, var11, true, 4, 0, true, var12, arg2, var16.anim);
			}
			arg4.method72(var18, var35, 0, arg0, arg3, 768, 0, 1, arg6, arg10, var15, var17);
		}
	}
}
