package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public class World {

	@ObfuscatedName("c.a")
	public static boolean field39 = true;

	@ObfuscatedName("c.b")
	public int field40 = -48;

	@ObfuscatedName("c.c")
	public static int field41 = 678;

	@ObfuscatedName("c.d")
	public static int field42 = 6;

	@ObfuscatedName("c.e")
	public int field43 = -62;

	@ObfuscatedName("c.f")
	public static boolean field44 = true;

	@ObfuscatedName("c.g")
	public static int field45;

	@ObfuscatedName("c.h")
	public int field46;

	@ObfuscatedName("c.i")
	public int field47;

	@ObfuscatedName("c.j")
	public int[][][] field48;

	@ObfuscatedName("c.k")
	public byte[][][] field49;

	@ObfuscatedName("c.l")
	public byte[][][] field50;

	@ObfuscatedName("c.m")
	public byte[][][] field51;

	@ObfuscatedName("c.n")
	public byte[][][] field52;

	@ObfuscatedName("c.o")
	public byte[][][] field53;

	@ObfuscatedName("c.p")
	public byte[][][] field54;

	@ObfuscatedName("c.q")
	public int[][] field55;

	@ObfuscatedName("c.r")
	public int[] field56;

	@ObfuscatedName("c.s")
	public int[] field57;

	@ObfuscatedName("c.t")
	public int[] field58;

	@ObfuscatedName("c.u")
	public int[] field59;

	@ObfuscatedName("c.v")
	public int[] field60;

	@ObfuscatedName("c.w")
	public int[][][] field61;

	@ObfuscatedName("c.x")
	public static final int[] field62 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.y")
	public static final int[] field63 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.z")
	public static final int[] field64 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.A")
	public static final int[] field65 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.B")
	public static int field66 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.C")
	public static int field67 = (int) (Math.random() * 33.0D) - 16;

	public World(byte[][][] arg0, int[][][] arg1, int arg2, int arg3, int arg4) {
		this.field46 = arg2;
		this.field47 = arg4;
		if (arg3 < 2 || arg3 > 2) {
			field41 = 239;
		}
		this.field48 = arg1;
		this.field49 = arg0;
		this.field50 = new byte[4][this.field46][this.field47];
		this.field51 = new byte[4][this.field46][this.field47];
		this.field52 = new byte[4][this.field46][this.field47];
		this.field53 = new byte[4][this.field46][this.field47];
		this.field61 = new int[4][this.field46 + 1][this.field47 + 1];
		this.field54 = new byte[4][this.field46 + 1][this.field47 + 1];
		this.field55 = new int[this.field46 + 1][this.field47 + 1];
		this.field56 = new int[this.field47];
		this.field57 = new int[this.field47];
		this.field58 = new int[this.field47];
		this.field59 = new int[this.field47];
		this.field60 = new int[this.field47];
	}

	@ObfuscatedName("c.a(BIIII)V")
	public final void method14(byte arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
			for (int var7 = arg2; var7 <= arg2 + arg1; var7++) {
				if (var7 >= 0 && var7 < this.field46 && var6 >= 0 && var6 < this.field47) {
					this.field54[0][var7][var6] = 127;
					if (var7 == arg2 && var7 > 0) {
						this.field48[0][var7][var6] = this.field48[0][var7 - 1][var6];
					}
					if (var7 == arg2 + arg1 && var7 < this.field46 - 1) {
						this.field48[0][var7][var6] = this.field48[0][var7 + 1][var6];
					}
					if (var6 == arg3 && var6 > 0) {
						this.field48[0][var7][var6] = this.field48[0][var7][var6 - 1];
					}
					if (var6 == arg3 + arg4 && var6 < this.field47 - 1) {
						this.field48[0][var7][var6] = this.field48[0][var7][var6 + 1];
					}
				}
			}
		}
		if (arg0 != 1) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
	}

	@ObfuscatedName("c.a(II[BIII)V")
	public final void method15(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
		Packet var7 = new Packet(arg2, (byte) 3);
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					int var11 = var9 + arg0;
					int var12 = var10 + arg5;
					if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
						this.field49[var8][var11][var12] = 0;
						while (true) {
							int var13 = var7.method239();
							if (var13 == 0) {
								if (var8 == 0) {
									this.field48[0][var11][var12] = -method22(var11 + 932731 + arg1, var12 + 556238 + arg3) * 8;
								} else {
									this.field48[var8][var11][var12] = this.field48[var8 - 1][var11][var12] - 240;
								}
								break;
							}
							if (var13 == 1) {
								int var14 = var7.method239();
								if (var14 == 1) {
									var14 = 0;
								}
								if (var8 == 0) {
									this.field48[0][var11][var12] = -var14 * 8;
								} else {
									this.field48[var8][var11][var12] = this.field48[var8 - 1][var11][var12] - var14 * 8;
								}
								break;
							}
							if (var13 <= 49) {
								this.field51[var8][var11][var12] = var7.method240();
								this.field52[var8][var11][var12] = (byte) ((var13 - 2) / 4);
								this.field53[var8][var11][var12] = (byte) (var13 - 2 & 0x3);
							} else if (var13 <= 81) {
								this.field49[var8][var11][var12] = (byte) (var13 - 49);
							} else {
								this.field50[var8][var11][var12] = (byte) (var13 - 81);
							}
						}
					} else {
						while (true) {
							int var15 = var7.method239();
							if (var15 == 0) {
								break;
							}
							if (var15 == 1) {
								var7.method239();
								break;
							}
							if (var15 <= 49) {
								var7.method239();
							}
						}
					}
				}
			}
		}
		if (arg4 != 0) {
			for (int var16 = 1; var16 > 0; var16++) {
			}
		}
	}

	@ObfuscatedName("c.a(II[BB)Z")
	public static final boolean method16(int arg0, int arg1, byte[] arg2, byte arg3) {
		boolean var4 = true;
		Packet var5 = new Packet(arg2, (byte) 3);
		if (arg3 != 74) {
			field41 = -127;
		}
		int var6 = -1;
		label54: while (true) {
			int var7 = var5.method253();
			if (var7 == 0) {
				return var4;
			}
			var6 += var7;
			int var8 = 0;
			boolean var9 = false;
			while (true) {
				while (!var9) {
					int var11 = var5.method253();
					if (var11 == 0) {
						continue label54;
					}
					var8 += var11 - 1;
					int var12 = var8 & 0x3F;
					int var13 = var8 >> 6 & 0x3F;
					int var14 = var5.method239() >> 2;
					int var15 = var13 + arg1;
					int var16 = var12 + arg0;
					if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
						LocType var17 = LocType.method334(var6);
						if (var14 != 22 || !field44 || var17.field945 || var17.field965) {
							var4 &= var17.method338(0);
							var9 = true;
						}
					}
				}
				int var10 = var5.method253();
				if (var10 == 0) {
					break;
				}
				var5.method239();
			}
		}
	}

	@ObfuscatedName("c.a(Lmb;Lvb;B)V")
	public static final void method17(Packet arg0, OnDemand arg1, byte arg2) {
		int var3 = -1;
		if (arg2 != -13) {
			field39 = !field39;
		}
		while (true) {
			int var4 = arg0.method253();
			if (var4 == 0) {
				return;
			}
			var3 += var4;
			LocType var5 = LocType.method334(var3);
			var5.method339(38488, arg1);
			while (true) {
				int var6 = arg0.method253();
				if (var6 == 0) {
					break;
				}
				arg0.method239();
			}
		}
	}

	@ObfuscatedName("c.a(ILs;I[B[Ljc;B)V")
	public final void method18(int arg0, World3D arg1, int arg2, byte[] arg3, CollisionMap[] arg4, byte arg5) {
		Packet var7 = new Packet(arg3, (byte) 3);
		int var8 = -1;
		if (arg5 == 2) {
			boolean var9 = false;
		} else {
			this.field40 = -35;
		}
		while (true) {
			int var10 = var7.method253();
			if (var10 == 0) {
				return;
			}
			var8 += var10;
			int var11 = 0;
			while (true) {
				int var12 = var7.method253();
				if (var12 == 0) {
					break;
				}
				var11 += var12 - 1;
				int var13 = var11 & 0x3F;
				int var14 = var11 >> 6 & 0x3F;
				int var15 = var11 >> 12;
				int var16 = var7.method239();
				int var17 = var16 >> 2;
				int var18 = var16 & 0x3;
				int var19 = var14 + arg2;
				int var20 = var13 + arg0;
				if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
					int var21 = var15;
					if ((this.field49[1][var19][var20] & 0x2) == 2) {
						var21 = var15 - 1;
					}
					CollisionMap var22 = null;
					if (var21 >= 0) {
						var22 = arg4[var21];
					}
					this.method19(var17, var18, var19, var8, var15, 20, var22, var20, arg1);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIIIIILjc;ILs;)V")
	public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, CollisionMap arg6, int arg7, World3D arg8) {
		if (arg5 <= 0) {
			return;
		}
		if (field44) {
			if ((this.field49[arg4][arg2][arg7] & 0x10) != 0) {
				return;
			}
			if (this.method21(11519, arg2, arg7, arg4) != field45) {
				return;
			}
		}
		int var10 = this.field48[arg4][arg2][arg7];
		int var11 = this.field48[arg4][arg2 + 1][arg7];
		int var12 = this.field48[arg4][arg2 + 1][arg7 + 1];
		int var13 = this.field48[arg4][arg2][arg7 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.method334(arg3);
		int var16 = arg2 + (arg7 << 7) + (arg3 << 14) + 1073741824;
		if (!var15.field945) {
			var16 += Integer.MIN_VALUE;
		}
		byte var17 = (byte) ((arg1 << 6) + arg0);
		if (arg0 == 22) {
			if (!field44 || var15.field945 || var15.field965) {
				ModelSource var18;
				if (var15.field949 == -1) {
					var18 = var15.method340(22, arg1, var10, var11, var12, var13, -1);
				} else {
					var18 = new ClientLocAnim(22, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
				}
				arg8.method70(var18, arg2, var16, -741, arg4, arg7, var14, var17);
				if (var15.field943 && var15.field945 && arg6 != null) {
					arg6.method364(arg7, arg2, 4);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			ModelSource var19;
			if (var15.field949 == -1) {
				var19 = var15.method340(10, arg1, var10, var11, var12, var13, -1);
			} else {
				var19 = new ClientLocAnim(10, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			if (var19 != null) {
				int var20 = 0;
				if (arg0 == 11) {
					var20 += 256;
				}
				int var21;
				int var22;
				if (arg1 == 1 || arg1 == 3) {
					var21 = var15.field942;
					var22 = var15.field941;
				} else {
					var21 = var15.field941;
					var22 = var15.field942;
				}
				if (arg8.method74(var17, var21, var14, var19, -38295, var22, var16, arg7, arg2, var20, arg4) && var15.field957) {
					Model var23;
					if (var19 instanceof Model) {
						var23 = (Model) var19;
					} else {
						var23 = var15.method340(10, arg1, var10, var11, var12, var13, -1);
					}
					if (var23 != null) {
						for (int var24 = 0; var24 <= var21; var24++) {
							for (int var25 = 0; var25 <= var22; var25++) {
								int var26 = var23.field563 / 4;
								if (var26 > 30) {
									var26 = 30;
								}
								if (var26 > this.field54[arg4][arg2 + var24][arg7 + var25]) {
									this.field54[arg4][arg2 + var24][arg7 + var25] = (byte) var26;
								}
							}
						}
					}
				}
			}
			if (var15.field943 && arg6 != null) {
				arg6.method363(var15.field944, 3, arg7, arg1, var15.field941, var15.field942, arg2);
			}
		} else if (arg0 >= 12) {
			ModelSource var27;
			if (var15.field949 == -1) {
				var27 = var15.method340(arg0, arg1, var10, var11, var12, var13, -1);
			} else {
				var27 = new ClientLocAnim(arg0, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method74(var17, 1, var14, var27, -38295, 1, var16, arg7, arg2, 0, arg4);
			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
				this.field61[arg4][arg2][arg7] |= 0x924;
			}
			if (var15.field943 && arg6 != null) {
				arg6.method363(var15.field944, 3, arg7, arg1, var15.field941, var15.field942, arg2);
			}
		} else if (arg0 == 0) {
			ModelSource var28;
			if (var15.field949 == -1) {
				var28 = var15.method340(0, arg1, var10, var11, var12, var13, -1);
			} else {
				var28 = new ClientLocAnim(0, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method72(var28, null, var16, 0, arg7, (byte) 54, var17, arg2, var14, field62[arg1], arg4);
			if (arg1 == 0) {
				if (var15.field957) {
					this.field54[arg4][arg2][arg7] = 50;
					this.field54[arg4][arg2][arg7 + 1] = 50;
				}
				if (var15.field948) {
					this.field61[arg4][arg2][arg7] |= 0x249;
				}
			} else if (arg1 == 1) {
				if (var15.field957) {
					this.field54[arg4][arg2][arg7 + 1] = 50;
					this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
				}
				if (var15.field948) {
					this.field61[arg4][arg2][arg7 + 1] |= 0x492;
				}
			} else if (arg1 == 2) {
				if (var15.field957) {
					this.field54[arg4][arg2 + 1][arg7] = 50;
					this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
				}
				if (var15.field948) {
					this.field61[arg4][arg2 + 1][arg7] |= 0x249;
				}
			} else if (arg1 == 3) {
				if (var15.field957) {
					this.field54[arg4][arg2][arg7] = 50;
					this.field54[arg4][arg2 + 1][arg7] = 50;
				}
				if (var15.field948) {
					this.field61[arg4][arg2][arg7] |= 0x492;
				}
			}
			if (var15.field943 && arg6 != null) {
				arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
			}
			if (var15.field950 != 16) {
				arg8.method80(arg4, arg7, (byte) -85, arg2, var15.field950);
			}
		} else if (arg0 == 1) {
			ModelSource var29;
			if (var15.field949 == -1) {
				var29 = var15.method340(1, arg1, var10, var11, var12, var13, -1);
			} else {
				var29 = new ClientLocAnim(1, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method72(var29, null, var16, 0, arg7, (byte) 54, var17, arg2, var14, field63[arg1], arg4);
			if (var15.field957) {
				if (arg1 == 0) {
					this.field54[arg4][arg2][arg7 + 1] = 50;
				} else if (arg1 == 1) {
					this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
				} else if (arg1 == 2) {
					this.field54[arg4][arg2 + 1][arg7] = 50;
				} else if (arg1 == 3) {
					this.field54[arg4][arg2][arg7] = 50;
				}
			}
			if (var15.field943 && arg6 != null) {
				arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
			}
		} else if (arg0 == 2) {
			int var30 = arg1 + 1 & 0x3;
			ModelSource var31;
			ModelSource var32;
			if (var15.field949 == -1) {
				var31 = var15.method340(2, arg1 + 4, var10, var11, var12, var13, -1);
				var32 = var15.method340(2, var30, var10, var11, var12, var13, -1);
			} else {
				var31 = new ClientLocAnim(2, arg1 + 4, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
				var32 = new ClientLocAnim(2, var30, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method72(var31, var32, var16, field62[var30], arg7, (byte) 54, var17, arg2, var14, field62[arg1], arg4);
			if (var15.field948) {
				if (arg1 == 0) {
					this.field61[arg4][arg2][arg7] |= 0x249;
					this.field61[arg4][arg2][arg7 + 1] |= 0x492;
				} else if (arg1 == 1) {
					this.field61[arg4][arg2][arg7 + 1] |= 0x492;
					this.field61[arg4][arg2 + 1][arg7] |= 0x249;
				} else if (arg1 == 2) {
					this.field61[arg4][arg2 + 1][arg7] |= 0x249;
					this.field61[arg4][arg2][arg7] |= 0x492;
				} else if (arg1 == 3) {
					this.field61[arg4][arg2][arg7] |= 0x492;
					this.field61[arg4][arg2][arg7] |= 0x249;
				}
			}
			if (var15.field943 && arg6 != null) {
				arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
			}
			if (var15.field950 != 16) {
				arg8.method80(arg4, arg7, (byte) -85, arg2, var15.field950);
			}
		} else if (arg0 == 3) {
			ModelSource var33;
			if (var15.field949 == -1) {
				var33 = var15.method340(3, arg1, var10, var11, var12, var13, -1);
			} else {
				var33 = new ClientLocAnim(3, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method72(var33, null, var16, 0, arg7, (byte) 54, var17, arg2, var14, field63[arg1], arg4);
			if (var15.field957) {
				if (arg1 == 0) {
					this.field54[arg4][arg2][arg7 + 1] = 50;
				} else if (arg1 == 1) {
					this.field54[arg4][arg2 + 1][arg7 + 1] = 50;
				} else if (arg1 == 2) {
					this.field54[arg4][arg2 + 1][arg7] = 50;
				} else if (arg1 == 3) {
					this.field54[arg4][arg2][arg7] = 50;
				}
			}
			if (var15.field943 && arg6 != null) {
				arg6.method362(arg2, arg7, 9, arg1, var15.field944, arg0);
			}
		} else if (arg0 == 9) {
			ModelSource var34;
			if (var15.field949 == -1) {
				var34 = var15.method340(arg0, arg1, var10, var11, var12, var13, -1);
			} else {
				var34 = new ClientLocAnim(arg0, arg1, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method74(var17, 1, var14, var34, -38295, 1, var16, arg7, arg2, 0, arg4);
			if (var15.field943 && arg6 != null) {
				arg6.method363(var15.field944, 3, arg7, arg1, var15.field941, var15.field942, arg2);
			}
		} else if (arg0 == 4) {
			ModelSource var35;
			if (var15.field949 == -1) {
				var35 = var15.method340(4, 0, var10, var11, var12, var13, -1);
			} else {
				var35 = new ClientLocAnim(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method73(field62[arg1], 0, var17, var14, arg2, var16, arg1 * 512, arg7, 0, var35, arg4, false);
		} else if (arg0 == 5) {
			int var36 = 16;
			int var37 = arg8.method90(arg4, arg2, arg7);
			if (var37 > 0) {
				var36 = LocType.method334(var37 >> 14 & 0x7FFF).field950;
			}
			ModelSource var38;
			if (var15.field949 == -1) {
				var38 = var15.method340(4, 0, var10, var11, var12, var13, -1);
			} else {
				var38 = new ClientLocAnim(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method73(field62[arg1], field64[arg1] * var36, var17, var14, arg2, var16, arg1 * 512, arg7, field65[arg1] * var36, var38, arg4, false);
		} else if (arg0 == 6) {
			ModelSource var39;
			if (var15.field949 == -1) {
				var39 = var15.method340(4, 0, var10, var11, var12, var13, -1);
			} else {
				var39 = new ClientLocAnim(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method73(256, 0, var17, var14, arg2, var16, arg1, arg7, 0, var39, arg4, false);
		} else if (arg0 == 7) {
			ModelSource var40;
			if (var15.field949 == -1) {
				var40 = var15.method340(4, 0, var10, var11, var12, var13, -1);
			} else {
				var40 = new ClientLocAnim(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method73(512, 0, var17, var14, arg2, var16, arg1, arg7, 0, var40, arg4, false);
		} else if (arg0 == 8) {
			ModelSource var41;
			if (var15.field949 == -1) {
				var41 = var15.method340(4, 0, var10, var11, var12, var13, -1);
			} else {
				var41 = new ClientLocAnim(4, 0, var10, arg3, 10550, var12, var13, true, var15.field949, var11);
			}
			arg8.method73(768, 0, var17, var14, arg2, var16, arg1, arg7, 0, var41, arg4, false);
		}
	}

	@ObfuscatedName("c.a(Ls;[Ljc;I)V")
	public final void method20(World3D arg0, CollisionMap[] arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			for (int var5 = 0; var5 < 104; var5++) {
				for (int var6 = 0; var6 < 104; var6++) {
					if ((this.field49[var4][var5][var6] & 0x1) == 1) {
						int var7 = var4;
						if ((this.field49[1][var5][var6] & 0x2) == 2) {
							var7 = var4 - 1;
						}
						if (var7 >= 0) {
							arg1[var7].method364(var6, var5, 4);
						}
					}
				}
			}
		}
		field66 += (int) (Math.random() * 5.0D) - 2;
		if (field66 < -8) {
			field66 = -8;
		}
		if (field66 > 8) {
			field66 = 8;
		}
		field67 += (int) (Math.random() * 5.0D) - 2;
		if (field67 < -16) {
			field67 = -16;
		}
		if (field67 > 16) {
			field67 = 16;
		}
		for (int var8 = 0; var8 < 4; var8++) {
			byte[][] var9 = this.field54[var8];
			byte var10 = 96;
			short var11 = 768;
			byte var12 = -50;
			byte var13 = -10;
			byte var14 = -50;
			int var15 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + var14 * var14));
			int var16 = var11 * var15 >> 8;
			for (int var17 = 1; var17 < this.field47 - 1; var17++) {
				for (int var18 = 1; var18 < this.field46 - 1; var18++) {
					int var19 = this.field48[var8][var18 + 1][var17] - this.field48[var8][var18 - 1][var17];
					int var20 = this.field48[var8][var18][var17 + 1] - this.field48[var8][var18][var17 - 1];
					int var21 = (int) Math.sqrt((double) (var19 * var19 + 65536 + var20 * var20));
					int var22 = (var19 << 8) / var21;
					int var23 = 65536 / var21;
					int var24 = (var20 << 8) / var21;
					int var25 = var10 + (var12 * var22 + var13 * var23 + var14 * var24) / var16;
					int var26 = (var9[var18 - 1][var17] >> 2) + (var9[var18 + 1][var17] >> 3) + (var9[var18][var17 - 1] >> 2) + (var9[var18][var17 + 1] >> 3) + (var9[var18][var17] >> 1);
					this.field55[var18][var17] = var25 - var26;
				}
			}
			for (int var27 = 0; var27 < this.field47; var27++) {
				this.field56[var27] = 0;
				this.field57[var27] = 0;
				this.field58[var27] = 0;
				this.field59[var27] = 0;
				this.field60[var27] = 0;
			}
			for (int var28 = -5; var28 < this.field46 + 5; var28++) {
				for (int var29 = 0; var29 < this.field47; var29++) {
					int var30 = var28 + 5;
					int var10002;
					if (var30 >= 0 && var30 < this.field46) {
						int var31 = this.field50[var8][var30][var29] & 0xFF;
						if (var31 > 0) {
							FloType var32 = FloType.field1077[var31 - 1];
							this.field56[var29] += var32.field1086;
							this.field57[var29] += var32.field1084;
							this.field58[var29] += var32.field1085;
							this.field59[var29] += var32.field1087;
							var10002 = this.field60[var29]++;
						}
					}
					int var33 = var28 - 5;
					if (var33 >= 0 && var33 < this.field46) {
						int var34 = this.field50[var8][var33][var29] & 0xFF;
						if (var34 > 0) {
							FloType var35 = FloType.field1077[var34 - 1];
							this.field56[var29] -= var35.field1086;
							this.field57[var29] -= var35.field1084;
							this.field58[var29] -= var35.field1085;
							this.field59[var29] -= var35.field1087;
							var10002 = this.field60[var29]--;
						}
					}
				}
				if (var28 >= 1 && var28 < this.field46 - 1) {
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					int var40 = 0;
					for (int var41 = -5; var41 < this.field47 + 5; var41++) {
						int var42 = var41 + 5;
						if (var42 >= 0 && var42 < this.field47) {
							var36 += this.field56[var42];
							var37 += this.field57[var42];
							var38 += this.field58[var42];
							var39 += this.field59[var42];
							var40 += this.field60[var42];
						}
						int var43 = var41 - 5;
						if (var43 >= 0 && var43 < this.field47) {
							var36 -= this.field56[var43];
							var37 -= this.field57[var43];
							var38 -= this.field58[var43];
							var39 -= this.field59[var43];
							var40 -= this.field60[var43];
						}
						if (var41 >= 1 && var41 < this.field47 - 1 && (!field44 || (this.field49[var8][var28][var41] & 0x10) == 0 && this.method21(11519, var28, var41, var8) == field45)) {
							int var44 = this.field50[var8][var28][var41] & 0xFF;
							int var45 = this.field51[var8][var28][var41] & 0xFF;
							if (var44 > 0 || var45 > 0) {
								int var46 = this.field48[var8][var28][var41];
								int var47 = this.field48[var8][var28 + 1][var41];
								int var48 = this.field48[var8][var28 + 1][var41 + 1];
								int var49 = this.field48[var8][var28][var41 + 1];
								int var50 = this.field55[var28][var41];
								int var51 = this.field55[var28 + 1][var41];
								int var52 = this.field55[var28 + 1][var41 + 1];
								int var53 = this.field55[var28][var41 + 1];
								int var54 = -1;
								int var55 = -1;
								if (var44 > 0) {
									int var56 = var36 * 256 / var39;
									int var57 = var37 / var40;
									int var58 = var38 / var40;
									var54 = this.method29(var56, var57, var58);
									int var59 = var56 + field66 & 0xFF;
									int var60 = var58 + field67;
									if (var60 < 0) {
										var60 = 0;
									} else if (var60 > 255) {
										var60 = 255;
									}
									var55 = this.method29(var59, var57, var60);
								}
								if (var8 > 0) {
									boolean var61 = true;
									if (var44 == 0 && this.field52[var8][var28][var41] != 0) {
										var61 = false;
									}
									if (var45 > 0 && !FloType.field1077[var45 - 1].field1081) {
										var61 = false;
									}
									if (var61 && var46 == var47 && var46 == var48 && var46 == var49) {
										this.field61[var8][var28][var41] |= 0x924;
									}
								}
								int var62 = 0;
								if (var54 != -1) {
									var62 = Pix3D.field657[method27(var55, 96)];
								}
								if (var45 == 0) {
									arg0.method69(var8, var28, var41, 0, 0, -1, var46, var47, var48, var49, method27(var54, var50), method27(var54, var51), method27(var54, var52), method27(var54, var53), 0, 0, 0, 0, var62, 0);
								} else {
									int var63 = this.field52[var8][var28][var41] + 1;
									byte var64 = this.field53[var8][var28][var41];
									FloType var65 = FloType.field1077[var45 - 1];
									int var66 = var65.field1079;
									int var67;
									int var68;
									if (var66 >= 0) {
										var67 = Pix3D.method183(0, var66);
										var68 = -1;
									} else if (var65.field1078 == 16711935) {
										var67 = 0;
										var68 = -2;
										var66 = -1;
									} else {
										var68 = this.method29(var65.field1083, var65.field1084, var65.field1085);
										var67 = Pix3D.field657[this.method28(var65.field1088, 96)];
									}
									arg0.method69(var8, var28, var41, var63, var64, var66, var46, var47, var48, var49, method27(var54, var50), method27(var54, var51), method27(var54, var52), method27(var54, var53), this.method28(var68, var50), this.method28(var68, var51), this.method28(var68, var52), this.method28(var68, var53), var62, var67);
								}
							}
						}
					}
				}
			}
			for (int var69 = 1; var69 < this.field47 - 1; var69++) {
				for (int var70 = 1; var70 < this.field46 - 1; var70++) {
					arg0.method68(var8, var70, var69, this.method21(11519, var70, var69, var8));
				}
			}
		}
		arg0.method95(768, -2568, 64, -10, -50, -50);
		for (int var71 = 0; var71 < this.field46; var71++) {
			for (int var72 = 0; var72 < this.field47; var72++) {
				if ((this.field49[1][var71][var72] & 0x2) == 2) {
					arg0.method66(6, var72, var71);
				}
			}
		}
		int var73 = 1;
		int var74 = 2;
		int var75 = 4;
		for (int var76 = 0; var76 < 4; var76++) {
			if (var76 > 0) {
				var73 <<= 0x3;
				var74 <<= 0x3;
				var75 <<= 0x3;
			}
			for (int var77 = 0; var77 <= var76; var77++) {
				for (int var78 = 0; var78 <= this.field47; var78++) {
					for (int var79 = 0; var79 <= this.field46; var79++) {
						if ((this.field61[var77][var79][var78] & var73) != 0) {
							int var80 = var78;
							int var81 = var78;
							int var82 = var77;
							int var83 = var77;
							while (var80 > 0 && (this.field61[var77][var79][var80 - 1] & var73) != 0) {
								var80--;
							}
							while (var81 < this.field47 && (this.field61[var77][var79][var81 + 1] & var73) != 0) {
								var81++;
							}
							label325: while (var82 > 0) {
								for (int var84 = var80; var84 <= var81; var84++) {
									if ((this.field61[var82 - 1][var79][var84] & var73) == 0) {
										break label325;
									}
								}
								var82--;
							}
							label314: while (var83 < var76) {
								for (int var85 = var80; var85 <= var81; var85++) {
									if ((this.field61[var83 + 1][var79][var85] & var73) == 0) {
										break label314;
									}
								}
								var83++;
							}
							int var86 = (var83 + 1 - var82) * (var81 - var80 + 1);
							if (var86 >= 8) {
								short var87 = 240;
								int var88 = this.field48[var83][var79][var80] - var87;
								int var89 = this.field48[var82][var79][var80];
								World3D.method67(var79 * 128, -374, 1, var88, var79 * 128, var76, var89, var80 * 128, var81 * 128 + 128);
								for (int var90 = var82; var90 <= var83; var90++) {
									for (int var91 = var80; var91 <= var81; var91++) {
										this.field61[var90][var79][var91] &= ~var73;
									}
								}
							}
						}
						if ((this.field61[var77][var79][var78] & var74) != 0) {
							int var92 = var79;
							int var93 = var79;
							int var94 = var77;
							int var95 = var77;
							while (var92 > 0 && (this.field61[var77][var92 - 1][var78] & var74) != 0) {
								var92--;
							}
							while (var93 < this.field46 && (this.field61[var77][var93 + 1][var78] & var74) != 0) {
								var93++;
							}
							label378: while (var94 > 0) {
								for (int var96 = var92; var96 <= var93; var96++) {
									if ((this.field61[var94 - 1][var96][var78] & var74) == 0) {
										break label378;
									}
								}
								var94--;
							}
							label367: while (var95 < var76) {
								for (int var97 = var92; var97 <= var93; var97++) {
									if ((this.field61[var95 + 1][var97][var78] & var74) == 0) {
										break label367;
									}
								}
								var95++;
							}
							int var98 = (var95 + 1 - var94) * (var93 - var92 + 1);
							if (var98 >= 8) {
								short var99 = 240;
								int var100 = this.field48[var95][var92][var78] - var99;
								int var101 = this.field48[var94][var92][var78];
								World3D.method67(var92 * 128, -374, 2, var100, var93 * 128 + 128, var76, var101, var78 * 128, var78 * 128);
								for (int var102 = var94; var102 <= var95; var102++) {
									for (int var103 = var92; var103 <= var93; var103++) {
										this.field61[var102][var103][var78] &= ~var74;
									}
								}
							}
						}
						if ((this.field61[var77][var79][var78] & var75) != 0) {
							int var104 = var79;
							int var105 = var79;
							int var106 = var78;
							int var107 = var78;
							while (var106 > 0 && (this.field61[var77][var79][var106 - 1] & var75) != 0) {
								var106--;
							}
							while (var107 < this.field47 && (this.field61[var77][var79][var107 + 1] & var75) != 0) {
								var107++;
							}
							label431: while (var104 > 0) {
								for (int var108 = var106; var108 <= var107; var108++) {
									if ((this.field61[var77][var104 - 1][var108] & var75) == 0) {
										break label431;
									}
								}
								var104--;
							}
							label420: while (var105 < this.field46) {
								for (int var109 = var106; var109 <= var107; var109++) {
									if ((this.field61[var77][var105 + 1][var109] & var75) == 0) {
										break label420;
									}
								}
								var105++;
							}
							if ((var105 - var104 + 1) * (var107 - var106 + 1) >= 4) {
								int var110 = this.field48[var77][var104][var106];
								World3D.method67(var104 * 128, -374, 4, var110, var105 * 128 + 128, var76, var110, var106 * 128, var107 * 128 + 128);
								for (int var111 = var104; var111 <= var105; var111++) {
									for (int var112 = var106; var112 <= var107; var112++) {
										this.field61[var77][var111][var112] &= ~var75;
									}
								}
							}
						}
					}
				}
			}
		}
		if (arg2 != 44106) {
			this.field43 = 169;
		}
	}

	@ObfuscatedName("c.a(IIII)I")
	public int method21(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 != 11519) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if ((this.field49[arg3][arg1][arg2] & 0x8) == 0) {
			return arg3 <= 0 || (this.field49[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
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
		int var4 = 65536 - Pix3D.field646[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int method25(int arg0, int arg1) {
		int var2 = method26(arg0 - 1, arg1 - 1) + method26(arg0 + 1, arg1 - 1) + method26(arg0 - 1, arg1 + 1) + method26(arg0 + 1, arg1 + 1);
		int var3 = method26(arg0 - 1, arg1) + method26(arg0 + 1, arg1) + method26(arg0, arg1 - 1) + method26(arg0, arg1 + 1);
		int var4 = method26(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int method26(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var3 = var2 << 13 ^ var2;
		int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int method27(int arg0, int arg1) {
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
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	@ObfuscatedName("c.c(III)Z")
	public static final boolean method30(int arg0, int arg1, int arg2) {
		if (arg2 != 23745) {
			field39 = !field39;
		}
		LocType var3 = LocType.method334(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return var3.method337(arg1, true);
	}

	@ObfuscatedName("c.a(IILjc;IIILs;[[[IIII)V")
	public static final void method31(int arg0, int arg1, CollisionMap arg2, int arg3, int arg4, int arg5, World3D arg6, int[][][] arg7, int arg8, int arg9, int arg10) {
		int var11 = arg7[arg9][arg1][arg3];
		int var12 = arg7[arg9][arg1 + 1][arg3];
		if (arg8 != field42) {
			return;
		}
		int var13 = arg7[arg9][arg1 + 1][arg3 + 1];
		int var14 = arg7[arg9][arg1][arg3 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		LocType var16 = LocType.method334(arg5);
		int var17 = arg1 + (arg3 << 7) + (arg5 << 14) + 1073741824;
		if (!var16.field945) {
			var17 += Integer.MIN_VALUE;
		}
		byte var18 = (byte) ((arg0 << 6) + arg4);
		if (arg4 == 22) {
			ModelSource var19;
			if (var16.field949 == -1) {
				var19 = var16.method340(22, arg0, var11, var12, var13, var14, -1);
			} else {
				var19 = new ClientLocAnim(22, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method70(var19, arg1, var17, -741, arg10, arg3, var15, var18);
			if (var16.field943 && var16.field945) {
				arg2.method364(arg3, arg1, 4);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ModelSource var20;
			if (var16.field949 == -1) {
				var20 = var16.method340(10, arg0, var11, var12, var13, var14, -1);
			} else {
				var20 = new ClientLocAnim(10, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			if (var20 != null) {
				int var21 = 0;
				if (arg4 == 11) {
					var21 += 256;
				}
				int var22;
				int var23;
				if (arg0 == 1 || arg0 == 3) {
					var22 = var16.field942;
					var23 = var16.field941;
				} else {
					var22 = var16.field941;
					var23 = var16.field942;
				}
				arg6.method74(var18, var22, var15, var20, -38295, var23, var17, arg3, arg1, var21, arg10);
			}
			if (var16.field943) {
				arg2.method363(var16.field944, 3, arg3, arg0, var16.field941, var16.field942, arg1);
			}
		} else if (arg4 >= 12) {
			ModelSource var24;
			if (var16.field949 == -1) {
				var24 = var16.method340(arg4, arg0, var11, var12, var13, var14, -1);
			} else {
				var24 = new ClientLocAnim(arg4, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method74(var18, 1, var15, var24, -38295, 1, var17, arg3, arg1, 0, arg10);
			if (var16.field943) {
				arg2.method363(var16.field944, 3, arg3, arg0, var16.field941, var16.field942, arg1);
			}
		} else if (arg4 == 0) {
			ModelSource var25;
			if (var16.field949 == -1) {
				var25 = var16.method340(0, arg0, var11, var12, var13, var14, -1);
			} else {
				var25 = new ClientLocAnim(0, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method72(var25, null, var17, 0, arg3, (byte) 54, var18, arg1, var15, field62[arg0], arg10);
			if (var16.field943) {
				arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
			}
		} else if (arg4 == 1) {
			ModelSource var26;
			if (var16.field949 == -1) {
				var26 = var16.method340(1, arg0, var11, var12, var13, var14, -1);
			} else {
				var26 = new ClientLocAnim(1, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method72(var26, null, var17, 0, arg3, (byte) 54, var18, arg1, var15, field63[arg0], arg10);
			if (var16.field943) {
				arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
			}
		} else if (arg4 == 2) {
			int var27 = arg0 + 1 & 0x3;
			ModelSource var28;
			ModelSource var29;
			if (var16.field949 == -1) {
				var28 = var16.method340(2, arg0 + 4, var11, var12, var13, var14, -1);
				var29 = var16.method340(2, var27, var11, var12, var13, var14, -1);
			} else {
				var28 = new ClientLocAnim(2, arg0 + 4, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
				var29 = new ClientLocAnim(2, var27, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method72(var28, var29, var17, field62[var27], arg3, (byte) 54, var18, arg1, var15, field62[arg0], arg10);
			if (var16.field943) {
				arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
			}
		} else if (arg4 == 3) {
			ModelSource var30;
			if (var16.field949 == -1) {
				var30 = var16.method340(3, arg0, var11, var12, var13, var14, -1);
			} else {
				var30 = new ClientLocAnim(3, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method72(var30, null, var17, 0, arg3, (byte) 54, var18, arg1, var15, field63[arg0], arg10);
			if (var16.field943) {
				arg2.method362(arg1, arg3, 9, arg0, var16.field944, arg4);
			}
		} else if (arg4 == 9) {
			ModelSource var31;
			if (var16.field949 == -1) {
				var31 = var16.method340(arg4, arg0, var11, var12, var13, var14, -1);
			} else {
				var31 = new ClientLocAnim(arg4, arg0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method74(var18, 1, var15, var31, -38295, 1, var17, arg3, arg1, 0, arg10);
			if (var16.field943) {
				arg2.method363(var16.field944, 3, arg3, arg0, var16.field941, var16.field942, arg1);
			}
		} else if (arg4 == 4) {
			ModelSource var32;
			if (var16.field949 == -1) {
				var32 = var16.method340(4, 0, var11, var12, var13, var14, -1);
			} else {
				var32 = new ClientLocAnim(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method73(field62[arg0], 0, var18, var15, arg1, var17, arg0 * 512, arg3, 0, var32, arg10, false);
		} else if (arg4 == 5) {
			int var33 = 16;
			int var34 = arg6.method90(arg10, arg1, arg3);
			if (var34 > 0) {
				var33 = LocType.method334(var34 >> 14 & 0x7FFF).field950;
			}
			ModelSource var35;
			if (var16.field949 == -1) {
				var35 = var16.method340(4, 0, var11, var12, var13, var14, -1);
			} else {
				var35 = new ClientLocAnim(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method73(field62[arg0], field64[arg0] * var33, var18, var15, arg1, var17, arg0 * 512, arg3, field65[arg0] * var33, var35, arg10, false);
		} else if (arg4 == 6) {
			ModelSource var36;
			if (var16.field949 == -1) {
				var36 = var16.method340(4, 0, var11, var12, var13, var14, -1);
			} else {
				var36 = new ClientLocAnim(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method73(256, 0, var18, var15, arg1, var17, arg0, arg3, 0, var36, arg10, false);
		} else if (arg4 == 7) {
			ModelSource var37;
			if (var16.field949 == -1) {
				var37 = var16.method340(4, 0, var11, var12, var13, var14, -1);
			} else {
				var37 = new ClientLocAnim(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method73(512, 0, var18, var15, arg1, var17, arg0, arg3, 0, var37, arg10, false);
		} else if (arg4 == 8) {
			ModelSource var38;
			if (var16.field949 == -1) {
				var38 = var16.method340(4, 0, var11, var12, var13, var14, -1);
			} else {
				var38 = new ClientLocAnim(4, 0, var11, arg5, 10550, var13, var14, true, var16.field949, var12);
			}
			arg6.method73(768, 0, var18, var15, arg1, var17, arg0, arg3, 0, var38, arg10, false);
		}
	}
}
