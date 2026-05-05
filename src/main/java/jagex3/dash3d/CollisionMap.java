package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("ia")
public final class CollisionMap {

	@ObfuscatedName("ia.f")
	public final int sizeZ = 104;

	@ObfuscatedName("ia.g")
	public final int[][] flags = new int[this.sizeX][this.sizeZ];

	@ObfuscatedName("ia.w")
	public final int startZ = 0;

	@ObfuscatedName("ia.x")
	public final int sizeX = 104;

	@ObfuscatedName("ia.G")
	public final int startX = 0;

	public CollisionMap(int arg0, int arg1) {
		this.reset();
	}

	@ObfuscatedName("ia.a(IIIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg2 && arg3 == arg0) {
				return true;
			}
		} else if (arg6 <= arg2 && arg2 <= arg6 + arg4 - 1 && arg3 >= arg3 && arg3 <= arg3 + arg4 - 1) {
			return true;
		}
		int var8 = arg2 - this.startX;
		int var9 = arg6 - this.startX;
		int var10 = arg3 - this.startZ;
		int var11 = arg0 - this.startZ;
		if (arg4 == 1) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (var9 == var8 - 1 && var11 == var10) {
						return true;
					}
					if (var9 == var8 && var11 == var10 + 1 && (this.flags[var9][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var8 == var9 && var11 == var10 - 1 && (this.flags[var9][var11] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var8 == var9 && var10 + 1 == var11) {
						return true;
					}
					if (var8 - 1 == var9 && var10 == var11 && (this.flags[var9][var11] & 0x12C0108) == 0) {
						return true;
					}
					if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var11] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var8 + 1 == var9 && var11 == var10) {
						return true;
					}
					if (var9 == var8 && var10 + 1 == var11 && (this.flags[var9][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var8 == var9 && var10 - 1 == var11 && (this.flags[var9][var11] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var9 == var8 && var10 - 1 == var11) {
						return true;
					}
					if (var8 - 1 == var9 && var10 == var11 && (this.flags[var9][var11] & 0x12C0108) == 0) {
						return true;
					}
					if (var9 == var8 + 1 && var11 == var10 && (this.flags[var9][var11] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (var9 == var8 - 1 && var11 == var10) {
						return true;
					}
					if (var9 == var8 && var11 == var10 + 1) {
						return true;
					}
					if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var11] & 0x12C0180) == 0) {
						return true;
					}
					if (var9 == var8 && var10 - 1 == var11 && (this.flags[var9][var11] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var8 - 1 == var9 && var10 == var11 && (this.flags[var9][var11] & 0x12C0108) == 0) {
						return true;
					}
					if (var9 == var8 && var10 + 1 == var11) {
						return true;
					}
					if (var9 == var8 + 1 && var11 == var10) {
						return true;
					}
					if (var8 == var9 && var10 - 1 == var11 && (this.flags[var9][var11] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var8 - 1 == var9 && var11 == var10 && (this.flags[var9][var11] & 0x12C0108) == 0) {
						return true;
					}
					if (var9 == var8 && var10 + 1 == var11 && (this.flags[var9][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var9 == var8 + 1 && var11 == var10) {
						return true;
					}
					if (var9 == var8 && var11 == var10 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var9 == var8 - 1 && var10 == var11) {
						return true;
					}
					if (var9 == var8 && var10 + 1 == var11 && (this.flags[var9][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var8 + 1 == var9 && var10 == var11 && (this.flags[var9][var11] & 0x12C0180) == 0) {
						return true;
					}
					if (var8 == var9 && var11 == var10 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (var9 == var8 && var11 == var10 + 1 && (this.flags[var9][var11] & 0x20) == 0) {
					return true;
				}
				if (var9 == var8 && var10 - 1 == var11 && (this.flags[var9][var11] & 0x2) == 0) {
					return true;
				}
				if (var9 == var8 - 1 && var11 == var10 && (this.flags[var9][var11] & 0x8) == 0) {
					return true;
				}
				if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var11] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			int var12 = var9 + arg4 - 1;
			int var13 = var11 + arg4 - 1;
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (var8 - arg4 == var9 && var11 <= var10 && var13 >= var10) {
						return true;
					}
					if (var9 <= var8 && var8 <= var12 && var10 + 1 == var11 && (this.flags[var8][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var9 <= var8 && var12 >= var8 && var11 == var10 - arg4 && (this.flags[var8][var13] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var8 >= var9 && var8 <= var12 && var11 == var10 + 1) {
						return true;
					}
					if (var9 == var8 - arg4 && var10 >= var11 && var10 <= var13 && (this.flags[var12][var10] & 0x12C0108) == 0) {
						return true;
					}
					if (var9 == var8 + 1 && var10 >= var11 && var13 >= var10 && (this.flags[var9][var10] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var8 + 1 == var9 && var10 >= var11 && var10 <= var13) {
						return true;
					}
					if (var8 >= var9 && var8 <= var12 && var11 == var10 + 1 && (this.flags[var8][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var9 <= var8 && var12 >= var8 && var10 - arg4 == var11 && (this.flags[var8][var13] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var9 <= var8 && var8 <= var12 && var10 - arg4 == var11) {
						return true;
					}
					if (var8 - arg4 == var9 && var10 >= var11 && var13 >= var10 && (this.flags[var12][var10] & 0x12C0108) == 0) {
						return true;
					}
					if (var8 + 1 == var9 && var11 <= var10 && var13 >= var10 && (this.flags[var9][var10] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (var8 - arg4 == var9 && var11 <= var10 && var13 >= var10) {
						return true;
					}
					if (var8 >= var9 && var12 >= var8 && var11 == var10 + 1) {
						return true;
					}
					if (var8 + 1 == var9 && var10 >= var11 && var13 >= var10 && (this.flags[var9][var10] & 0x12C0180) == 0) {
						return true;
					}
					if (var8 >= var9 && var12 >= var8 && var11 == var10 - arg4 && (this.flags[var8][var13] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var8 - arg4 == var9 && var11 <= var10 && var10 <= var13 && (this.flags[var12][var10] & 0x12C0108) == 0) {
						return true;
					}
					if (var8 >= var9 && var12 >= var8 && var11 == var10 + 1) {
						return true;
					}
					if (var9 == var8 + 1 && var11 <= var10 && var10 <= var13) {
						return true;
					}
					if (var8 >= var9 && var8 <= var12 && var10 - arg4 == var11 && (this.flags[var8][var13] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var8 - arg4 == var9 && var10 >= var11 && var10 <= var13 && (this.flags[var12][var10] & 0x12C0108) == 0) {
						return true;
					}
					if (var8 >= var9 && var12 >= var8 && var11 == var10 + 1 && (this.flags[var8][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var9 == var8 + 1 && var11 <= var10 && var10 <= var13) {
						return true;
					}
					if (var8 >= var9 && var8 <= var12 && var11 == var10 - arg4) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var8 - arg4 == var9 && var11 <= var10 && var10 <= var13) {
						return true;
					}
					if (var8 >= var9 && var8 <= var12 && var11 == var10 + 1 && (this.flags[var8][var11] & 0x12C0120) == 0) {
						return true;
					}
					if (var8 + 1 == var9 && var10 >= var11 && var10 <= var13 && (this.flags[var9][var10] & 0x12C0180) == 0) {
						return true;
					}
					if (var8 >= var9 && var12 >= var8 && var11 == var10 - arg4) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (var8 >= var9 && var12 >= var8 && var10 + 1 == var11 && (this.flags[var8][var11] & 0x12C0120) == 0) {
					return true;
				}
				if (var8 >= var9 && var8 <= var12 && var10 - arg4 == var11 && (this.flags[var8][var13] & 0x12C0102) == 0) {
					return true;
				}
				if (var8 - arg4 == var9 && var11 <= var10 && var13 >= var10 && (this.flags[var12][var10] & 0x12C0108) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var11 <= var10 && var13 >= var10 && (this.flags[var9][var10] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ia.a(IIIIBIIIII)Z")
	public boolean testLocBoundary(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg1 + arg5;
		int var11 = arg2 + arg0;
		int var12 = arg7 + arg3;
		int var13 = arg6 + arg4;
		if (arg7 <= arg2 && var12 > arg2) {
			if (arg6 == var10 && (arg8 & 0x4) == 0) {
				int var22 = var11 <= var12 ? var11 : var12;
				for (int var23 = arg2; var23 < var22; var23++) {
					if ((this.flags[var23 - this.startX][var10 - this.startZ - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (var13 == arg1 && (arg8 & 0x1) == 0) {
				int var24 = arg2;
				int var25 = var12 >= var11 ? var11 : var12;
				while (var24 < var25) {
					if ((this.flags[var24 - this.startX][arg1 - this.startZ] & 0x20) == 0) {
						return true;
					}
					var24++;
				}
			}
		} else if (arg7 < var11 && var11 <= var12) {
			if (var10 == arg6 && (arg8 & 0x4) == 0) {
				for (int var21 = arg7; var21 < var11; var21++) {
					if ((this.flags[var21 - this.startX][var10 - this.startZ - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (arg1 == var13 && (arg8 & 0x1) == 0) {
				for (int var20 = arg7; var20 < var11; var20++) {
					if ((this.flags[var20 - this.startX][arg1 - this.startZ] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg6 <= arg1 && var13 > arg1) {
			if (var11 == arg7 && (arg8 & 0x8) == 0) {
				int var14 = arg1;
				int var15 = var13 < var10 ? var13 : var10;
				while (var14 < var15) {
					if ((this.flags[var11 - this.startX - 1][var14 - this.startZ] & 0x8) == 0) {
						return true;
					}
					var14++;
				}
			} else if (var12 == arg2 && (arg8 & 0x2) == 0) {
				int var16 = arg1;
				int var17 = var13 >= var10 ? var10 : var13;
				while (var16 < var17) {
					if ((this.flags[arg2 - this.startX][var16 - this.startZ] & 0x80) == 0) {
						return true;
					}
					var16++;
				}
			}
		} else if (var10 > arg6 && var10 <= var13) {
			if (arg7 == var11 && (arg8 & 0x8) == 0) {
				for (int var18 = arg6; var18 < var10; var18++) {
					if ((this.flags[var11 - this.startX - 1][var18 - this.startZ] & 0x8) == 0) {
						return true;
					}
				}
			} else if (var12 == arg2 && (arg8 & 0x2) == 0) {
				for (int var19 = arg6; var19 < var10; var19++) {
					if ((this.flags[arg2 - this.startX][var19 - this.startZ] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ia.a(IZIIIII)V")
	public void delLoc(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == 1 || arg2 == 3) {
			int var7 = arg5;
			arg5 = arg4;
			arg4 = var7;
		}
		int var8 = arg3 - this.startZ;
		int var9 = arg0 - this.startX;
		int var10 = 256;
		if (arg1) {
			var10 = 131328;
		}
		for (int var11 = var9; var11 < arg5 + var9; var11++) {
			if (var11 >= 0 && var11 < this.sizeX) {
				for (int var12 = var8; var12 < arg4 + var8; var12++) {
					if (var12 >= 0 && this.sizeZ > var12) {
						this.remCMap(var11, var12, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ia.a(B)V")
	public void reset() {
		for (int var1 = 0; var1 < this.sizeX; var1++) {
			for (int var2 = 0; var2 < this.sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || var1 >= this.sizeX - 5 || this.sizeZ - 5 <= var2) {
					this.flags[var1][var2] = 16777215;
				} else {
					this.flags[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("ia.a(IIIZII)V")
	public void addLoc(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		int var6 = arg4 - this.startZ;
		int var7 = 256;
		if (arg2) {
			var7 = 131328;
		}
		int var8 = arg3 - this.startX;
		for (int var9 = var8; var9 < var8 + arg0; var9++) {
			if (var9 >= 0 && var9 < this.sizeX) {
				for (int var10 = var6; var10 < arg1 + var6; var10++) {
					if (var10 >= 0 && var10 < this.sizeZ) {
						this.addCMap(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ia.a(IIZZII)V")
	public void addWall(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		int var6 = arg1 - this.startZ;
		int var7 = arg4 - this.startX;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.addCMap(var7, 128, var6);
				this.addCMap(var7 - 1, 8, var6);
			}
			if (arg3 == 1) {
				this.addCMap(var7, 2, var6);
				this.addCMap(var7, 32, var6 + 1);
			}
			if (arg3 == 2) {
				this.addCMap(var7, 8, var6);
				this.addCMap(var7 + 1, 128, var6);
			}
			if (arg3 == 3) {
				this.addCMap(var7, 32, var6);
				this.addCMap(var7, 2, var6 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.addCMap(var7, 1, var6);
				this.addCMap(var7 - 1, 16, var6 + 1);
			}
			if (arg3 == 1) {
				this.addCMap(var7, 4, var6);
				this.addCMap(var7 + 1, 64, var6 + 1);
			}
			if (arg3 == 2) {
				this.addCMap(var7, 16, var6);
				this.addCMap(var7 + 1, 1, var6 - 1);
			}
			if (arg3 == 3) {
				this.addCMap(var7, 64, var6);
				this.addCMap(var7 - 1, 4, var6 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.addCMap(var7, 130, var6);
				this.addCMap(var7 - 1, 8, var6);
				this.addCMap(var7, 32, var6 + 1);
			}
			if (arg3 == 1) {
				this.addCMap(var7, 10, var6);
				this.addCMap(var7, 32, var6 + 1);
				this.addCMap(var7 + 1, 128, var6);
			}
			if (arg3 == 2) {
				this.addCMap(var7, 40, var6);
				this.addCMap(var7 + 1, 128, var6);
				this.addCMap(var7, 2, var6 - 1);
			}
			if (arg3 == 3) {
				this.addCMap(var7, 160, var6);
				this.addCMap(var7, 2, var6 - 1);
				this.addCMap(var7 - 1, 8, var6);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.addCMap(var7, 65536, var6);
				this.addCMap(var7 - 1, 4096, var6);
			}
			if (arg3 == 1) {
				this.addCMap(var7, 1024, var6);
				this.addCMap(var7, 16384, var6 + 1);
			}
			if (arg3 == 2) {
				this.addCMap(var7, 4096, var6);
				this.addCMap(var7 + 1, 65536, var6);
			}
			if (arg3 == 3) {
				this.addCMap(var7, 16384, var6);
				this.addCMap(var7, 1024, var6 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.addCMap(var7, 512, var6);
				this.addCMap(var7 - 1, 8192, var6 + 1);
			}
			if (arg3 == 1) {
				this.addCMap(var7, 2048, var6);
				this.addCMap(var7 + 1, 32768, var6 + 1);
			}
			if (arg3 == 2) {
				this.addCMap(var7, 8192, var6);
				this.addCMap(var7 + 1, 512, var6 - 1);
			}
			if (arg3 == 3) {
				this.addCMap(var7, 32768, var6);
				this.addCMap(var7 - 1, 2048, var6 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.addCMap(var7, 66560, var6);
			this.addCMap(var7 - 1, 4096, var6);
			this.addCMap(var7, 16384, var6 + 1);
		}
		if (arg3 == 1) {
			this.addCMap(var7, 5120, var6);
			this.addCMap(var7, 16384, var6 + 1);
			this.addCMap(var7 + 1, 65536, var6);
		}
		if (arg3 == 2) {
			this.addCMap(var7, 20480, var6);
			this.addCMap(var7 + 1, 65536, var6);
			this.addCMap(var7, 1024, var6 - 1);
		}
		if (arg3 == 3) {
			this.addCMap(var7, 81920, var6);
			this.addCMap(var7, 1024, var6 - 1);
			this.addCMap(var7 - 1, 4096, var6);
			return;
		}
	}

	@ObfuscatedName("ia.a(III)V")
	public void blockGroundDecor(int arg0, int arg1) {
		int var3 = arg0 - this.startZ;
		int var4 = arg1 - this.startX;
		this.flags[var4][var3] |= 0x40000;
	}

	@ObfuscatedName("ia.a(IIIBIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 == 1) {
			if (arg1 == arg6 && arg5 == arg3) {
				return true;
			}
		} else if (arg1 <= arg6 && arg6 <= arg4 + arg1 - 1 && arg3 <= arg3 && arg3 <= arg3 + arg4 - 1) {
			return true;
		}
		int var8 = arg1 - this.startX;
		int var9 = arg5 - this.startZ;
		int var10 = arg6 - this.startX;
		int var11 = arg3 - this.startZ;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var10 == var8 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (var8 == var10 - 1 && var11 == var9 && (this.flags[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var10 == var8 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (var10 + 1 == var8 && var11 == var9 && (this.flags[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (var10 == var8 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
					return true;
				}
				if (var10 == var8 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			int var12 = arg4 + var8 - 1;
			int var13 = var9 + arg4 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (var10 + 1 == var8 && var9 <= var11 && var11 <= var13 && (this.flags[var8][var11] & 0x80) == 0) {
						return true;
					}
					if (var8 <= var10 && var10 <= var12 && var9 == var11 - arg4 && (this.flags[var10][var13] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (var8 == var10 - arg4 && var11 >= var9 && var13 >= var11 && (this.flags[var12][var11] & 0x8) == 0) {
						return true;
					}
					if (var8 <= var10 && var12 >= var10 && var11 - arg4 == var9 && (this.flags[var10][var13] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (var8 == var10 - arg4 && var9 <= var11 && var11 <= var13 && (this.flags[var12][var11] & 0x8) == 0) {
						return true;
					}
					if (var8 <= var10 && var10 <= var12 && var9 == var11 + 1 && (this.flags[var10][var9] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (var8 == var10 + 1 && var11 >= var9 && var13 >= var11 && (this.flags[var8][var11] & 0x80) == 0) {
						return true;
					}
					if (var8 <= var10 && var10 <= var12 && var9 == var11 + 1 && (this.flags[var10][var9] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.flags[var10][var9] & 0x20) == 0) {
					return true;
				}
				if (var10 >= var8 && var12 >= var10 && var11 - arg4 == var9 && (this.flags[var10][var13] & 0x2) == 0) {
					return true;
				}
				if (var10 - arg4 == var8 && var11 >= var9 && var13 >= var11 && (this.flags[var12][var11] & 0x8) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var11 >= var9 && var13 >= var11 && (this.flags[var8][var11] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ia.a(IIIIIIIBI)Z")
	public boolean testRectOverlap(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg6 < arg0 + arg7 && arg7 < arg2 + arg6) {
			return arg5 + arg3 > arg4 && arg1 + arg4 > arg5;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ia.a(IIIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg0 > 1) {
			return this.testRectOverlap(arg2, arg0, arg0, arg4, arg3, arg1, arg5, arg6) ? true : this.testLocBoundary(arg0, arg3, arg5, arg2, arg4, arg0, arg1, arg6, arg7);
		}
		int var9 = arg1 + arg4 - 1;
		int var10 = arg6 + arg2 - 1;
		if (arg5 >= arg6 && arg5 <= var10 && arg1 <= arg3 && var9 >= arg3) {
			return true;
		} else if (arg5 == arg6 - 1 && arg3 >= arg1 && arg3 <= var9 && (this.flags[arg5 - this.startX][arg3 - this.startZ] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg5 == var10 + 1 && arg3 >= arg1 && arg3 <= var9 && (this.flags[arg5 - this.startX][arg3 - this.startZ] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg1 - 1 && arg6 <= arg5 && var10 >= arg5 && (this.flags[arg5 - this.startX][arg3 - this.startZ] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return var9 + 1 == arg3 && arg6 <= arg5 && var10 >= arg5 && (this.flags[arg5 - this.startX][arg3 - this.startZ] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@ObfuscatedName("ia.a(IBII)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg1] &= ~arg2;
	}

	@ObfuscatedName("ia.a(IZI)V")
	public void blockGround(int arg0, int arg1) {
		int var3 = arg1 - this.startX;
		int var4 = arg0 - this.startZ;
		this.flags[var3][var4] |= 0x200000;
	}

	@ObfuscatedName("ia.a(IIII)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg2] |= arg1;
	}

	@ObfuscatedName("ia.b(III)V")
	public void unblockGroundDecor(int arg0, int arg1) {
		int var3 = arg0 - this.startX;
		int var4 = arg1 - this.startZ;
		this.flags[var3][var4] &= 0xFFFBFFFF;
	}

	@ObfuscatedName("ia.a(ZIIIII)V")
	public void delWall(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg4 - this.startX;
		int var7 = arg3 - this.startZ;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.remCMap(var6, var7, 128);
				this.remCMap(var6 - 1, var7, 8);
			}
			if (arg2 == 1) {
				this.remCMap(var6, var7, 2);
				this.remCMap(var6, var7 + 1, 32);
			}
			if (arg2 == 2) {
				this.remCMap(var6, var7, 8);
				this.remCMap(var6 + 1, var7, 128);
			}
			if (arg2 == 3) {
				this.remCMap(var6, var7, 32);
				this.remCMap(var6, var7 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.remCMap(var6, var7, 1);
				this.remCMap(var6 - 1, var7 + 1, 16);
			}
			if (arg2 == 1) {
				this.remCMap(var6, var7, 4);
				this.remCMap(var6 + 1, var7 + 1, 64);
			}
			if (arg2 == 2) {
				this.remCMap(var6, var7, 16);
				this.remCMap(var6 + 1, var7 + -1, 1);
			}
			if (arg2 == 3) {
				this.remCMap(var6, var7, 64);
				this.remCMap(var6 - 1, var7 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.remCMap(var6, var7, 130);
				this.remCMap(var6 - 1, var7, 8);
				this.remCMap(var6, var7 + 1, 32);
			}
			if (arg2 == 1) {
				this.remCMap(var6, var7, 10);
				this.remCMap(var6, var7 + 1, 32);
				this.remCMap(var6 + 1, var7, 128);
			}
			if (arg2 == 2) {
				this.remCMap(var6, var7, 40);
				this.remCMap(var6 + 1, var7, 128);
				this.remCMap(var6, var7 - 1, 2);
			}
			if (arg2 == 3) {
				this.remCMap(var6, var7, 160);
				this.remCMap(var6, var7 - 1, 2);
				this.remCMap(var6 - 1, var7, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.remCMap(var6, var7, 65536);
				this.remCMap(var6 - 1, var7, 4096);
			}
			if (arg2 == 1) {
				this.remCMap(var6, var7, 1024);
				this.remCMap(var6, var7 + 1, 16384);
			}
			if (arg2 == 2) {
				this.remCMap(var6, var7, 4096);
				this.remCMap(var6 + 1, var7, 65536);
			}
			if (arg2 == 3) {
				this.remCMap(var6, var7, 16384);
				this.remCMap(var6, var7 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.remCMap(var6, var7, 512);
				this.remCMap(var6 - 1, var7 + 1, 8192);
			}
			if (arg2 == 1) {
				this.remCMap(var6, var7, 2048);
				this.remCMap(var6 + 1, var7 + 1, 32768);
			}
			if (arg2 == 2) {
				this.remCMap(var6, var7, 8192);
				this.remCMap(var6 + 1, var7 - 1, 512);
			}
			if (arg2 == 3) {
				this.remCMap(var6, var7, 32768);
				this.remCMap(var6 - 1, var7 - 1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.remCMap(var6, var7, 66560);
			this.remCMap(var6 - 1, var7, 4096);
			this.remCMap(var6, var7 + 1, 16384);
		}
		if (arg2 == 1) {
			this.remCMap(var6, var7, 5120);
			this.remCMap(var6, var7 + 1, 16384);
			this.remCMap(var6 + 1, var7, 65536);
		}
		if (arg2 == 2) {
			this.remCMap(var6, var7, 20480);
			this.remCMap(var6 + 1, var7, 65536);
			this.remCMap(var6, var7 - 1, 1024);
		}
		if (arg2 == 3) {
			this.remCMap(var6, var7, 81920);
			this.remCMap(var6, var7 - 1, 1024);
			this.remCMap(var6 - 1, var7, 4096);
			return;
		}
	}
}
