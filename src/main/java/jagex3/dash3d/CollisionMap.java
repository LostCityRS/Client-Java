package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("qf")
public final class CollisionMap {

	@ObfuscatedName("qf.i")
	public final int sizeX = 104;

	@ObfuscatedName("qf.o")
	public final int startX = 0;

	@ObfuscatedName("qf.t")
	public final int startZ = 0;

	@ObfuscatedName("qf.v")
	public final int sizeZ = 104;

	@ObfuscatedName("qf.I")
	public final int[][] flags = new int[this.sizeX][this.sizeZ];

	public CollisionMap(int arg0, int arg1) {
		this.reset();
	}

	@ObfuscatedName("qf.a(IZIIIB)V")
	public void addLoc(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		int var6 = arg3 - this.startZ;
		int var7 = arg2 - this.startX;
		int var8 = 256;
		if (arg1) {
			var8 = 131328;
		}
		for (int var9 = var7; var9 < arg4 + var7; var9++) {
			if (var9 >= 0 && this.sizeX > var9) {
				for (int var10 = var6; var10 < var6 + arg0; var10++) {
					if (var10 >= 0 && this.sizeZ > var10) {
						this.addCMap(var8, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("qf.a(IIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg0 && arg5 == arg4) {
			return true;
		}
		int var7 = arg4 - this.startZ;
		int var8 = arg3 - this.startX;
		int var9 = arg5 - this.startZ;
		int var10 = arg0 - this.startX;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (var10 + 1 == var8 && var7 == var9 && (this.flags[var8][var7] & 0x80) == 0) {
					return true;
				}
				if (var10 == var8 && var9 - 1 == var7 && (this.flags[var8][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (var10 - 1 == var8 && var9 == var7 && (this.flags[var8][var7] & 0x8) == 0) {
					return true;
				}
				if (var10 == var8 && var9 - 1 == var7 && (this.flags[var8][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (var10 - 1 == var8 && var7 == var9 && (this.flags[var8][var7] & 0x8) == 0) {
					return true;
				}
				if (var10 == var8 && var7 == var9 + 1 && (this.flags[var8][var7] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (var8 == var10 + 1 && var7 == var9 && (this.flags[var8][var7] & 0x80) == 0) {
					return true;
				}
				if (var8 == var10 && var7 == var9 + 1 && (this.flags[var8][var7] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (var10 == var8 && var9 + 1 == var7 && (this.flags[var8][var7] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var9 - 1 == var7 && (this.flags[var8][var7] & 0x2) == 0) {
				return true;
			}
			if (var8 == var10 - 1 && var9 == var7 && (this.flags[var8][var7] & 0x8) == 0) {
				return true;
			}
			if (var10 + 1 == var8 && var7 == var9 && (this.flags[var8][var7] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("qf.a(III)V")
	public void unblockGroundDecor(int arg0, int arg1) {
		int var3 = arg0 - this.startZ;
		int var4 = arg1 - this.startX;
		this.flags[var4][var3] &= 0xFFFBFFFF;
	}

	@ObfuscatedName("qf.b(III)V")
	public void blockGround(int arg0, int arg1) {
		int var3 = arg0 - this.startX;
		int var4 = arg1 - this.startZ;
		this.flags[var3][var4] |= 0x200000;
	}

	@ObfuscatedName("qf.a(IIIIIIIB)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg5 - 1;
		int var9 = arg2 + arg4 - 1;
		if (arg3 >= arg5 && var8 >= arg3 && arg4 <= arg0 && arg0 <= var9) {
			return true;
		} else if (arg5 - 1 == arg3 && arg4 <= arg0 && var9 >= arg0 && (this.flags[arg3 - this.startX][arg0 - this.startZ] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == var8 + 1 && arg0 >= arg4 && var9 >= arg0 && (this.flags[arg3 - this.startX][arg0 - this.startZ] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg4 - 1 && arg5 <= arg3 && arg3 <= var8 && (this.flags[arg3 - this.startX][arg0 - this.startZ] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == var9 + 1 && arg5 <= arg3 && arg3 <= var8 && (this.flags[arg3 - this.startX][arg0 - this.startZ] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@ObfuscatedName("qf.a(ZIIZII)V")
	public void addWall(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg2 - this.startX;
		int var7 = arg3 - this.startZ;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.addCMap(128, var7, var6);
				this.addCMap(8, var7, var6 - 1);
			}
			if (arg4 == 1) {
				this.addCMap(2, var7, var6);
				this.addCMap(32, var7 + 1, var6);
			}
			if (arg4 == 2) {
				this.addCMap(8, var7, var6);
				this.addCMap(128, var7, var6 + 1);
			}
			if (arg4 == 3) {
				this.addCMap(32, var7, var6);
				this.addCMap(2, var7 - 1, var6);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.addCMap(1, var7, var6);
				this.addCMap(16, var7 + 1, var6 + -1);
			}
			if (arg4 == 1) {
				this.addCMap(4, var7, var6);
				this.addCMap(64, var7 + 1, var6 - -1);
			}
			if (arg4 == 2) {
				this.addCMap(16, var7, var6);
				this.addCMap(1, var7 - 1, var6 + 1);
			}
			if (arg4 == 3) {
				this.addCMap(64, var7, var6);
				this.addCMap(4, var7 - 1, var6 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.addCMap(130, var7, var6);
				this.addCMap(8, var7, var6 - 1);
				this.addCMap(32, var7 + 1, var6);
			}
			if (arg4 == 1) {
				this.addCMap(10, var7, var6);
				this.addCMap(32, var7 + 1, var6);
				this.addCMap(128, var7, var6 + 1);
			}
			if (arg4 == 2) {
				this.addCMap(40, var7, var6);
				this.addCMap(128, var7, var6 + 1);
				this.addCMap(2, var7 - 1, var6);
			}
			if (arg4 == 3) {
				this.addCMap(160, var7, var6);
				this.addCMap(2, var7 - 1, var6);
				this.addCMap(8, var7, var6 - 1);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.addCMap(65536, var7, var6);
					this.addCMap(4096, var7, var6 - 1);
				}
				if (arg4 == 1) {
					this.addCMap(1024, var7, var6);
					this.addCMap(16384, var7 + 1, var6);
				}
				if (arg4 == 2) {
					this.addCMap(4096, var7, var6);
					this.addCMap(65536, var7, var6 + 1);
				}
				if (arg4 == 3) {
					this.addCMap(16384, var7, var6);
					this.addCMap(1024, var7 - 1, var6);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.addCMap(512, var7, var6);
					this.addCMap(8192, var7 + 1, var6 + -1);
				}
				if (arg4 == 1) {
					this.addCMap(2048, var7, var6);
					this.addCMap(32768, var7 + 1, var6 + 1);
				}
				if (arg4 == 2) {
					this.addCMap(8192, var7, var6);
					this.addCMap(512, var7 - 1, var6 + 1);
				}
				if (arg4 == 3) {
					this.addCMap(32768, var7, var6);
					this.addCMap(2048, var7 - 1, var6 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.addCMap(66560, var7, var6);
					this.addCMap(4096, var7, var6 - 1);
					this.addCMap(16384, var7 + 1, var6);
				}
				if (arg4 == 1) {
					this.addCMap(5120, var7, var6);
					this.addCMap(16384, var7 + 1, var6);
					this.addCMap(65536, var7, var6 + 1);
				}
				if (arg4 == 2) {
					this.addCMap(20480, var7, var6);
					this.addCMap(65536, var7, var6 + 1);
					this.addCMap(1024, var7 - 1, var6);
				}
				if (arg4 == 3) {
					this.addCMap(81920, var7, var6);
					this.addCMap(1024, var7 - 1, var6);
					this.addCMap(4096, var7, var6 - 1);
				}
			}
		}
	}

	@ObfuscatedName("qf.a(IIIZIZ)V")
	public void delWall(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg0 - this.startX;
		int var7 = arg3 - this.startZ;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.remCMap(var7, var6, 128);
				this.remCMap(var7, var6 - 1, 8);
			}
			if (arg1 == 1) {
				this.remCMap(var7, var6, 2);
				this.remCMap(var7 + 1, var6, 32);
			}
			if (arg1 == 2) {
				this.remCMap(var7, var6, 8);
				this.remCMap(var7, var6 + 1, 128);
			}
			if (arg1 == 3) {
				this.remCMap(var7, var6, 32);
				this.remCMap(var7 - 1, var6, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.remCMap(var7, var6, 1);
				this.remCMap(var7 + 1, var6 + -1, 16);
			}
			if (arg1 == 1) {
				this.remCMap(var7, var6, 4);
				this.remCMap(var7 + 1, var6 + 1, 64);
			}
			if (arg1 == 2) {
				this.remCMap(var7, var6, 16);
				this.remCMap(var7 - 1, var6 - -1, 1);
			}
			if (arg1 == 3) {
				this.remCMap(var7, var6, 64);
				this.remCMap(var7 - 1, var6 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.remCMap(var7, var6, 130);
				this.remCMap(var7, var6 - 1, 8);
				this.remCMap(var7 + 1, var6, 32);
			}
			if (arg1 == 1) {
				this.remCMap(var7, var6, 10);
				this.remCMap(var7 + 1, var6, 32);
				this.remCMap(var7, var6 + 1, 128);
			}
			if (arg1 == 2) {
				this.remCMap(var7, var6, 40);
				this.remCMap(var7, var6 + 1, 128);
				this.remCMap(var7 - 1, var6, 2);
			}
			if (arg1 == 3) {
				this.remCMap(var7, var6, 160);
				this.remCMap(var7 - 1, var6, 2);
				this.remCMap(var7, var6 - 1, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.remCMap(var7, var6, 65536);
				this.remCMap(var7, var6 - 1, 4096);
			}
			if (arg1 == 1) {
				this.remCMap(var7, var6, 1024);
				this.remCMap(var7 + 1, var6, 16384);
			}
			if (arg1 == 2) {
				this.remCMap(var7, var6, 4096);
				this.remCMap(var7, var6 + 1, 65536);
			}
			if (arg1 == 3) {
				this.remCMap(var7, var6, 16384);
				this.remCMap(var7 - 1, var6, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.remCMap(var7, var6, 512);
				this.remCMap(var7 + 1, var6 - 1, 8192);
			}
			if (arg1 == 1) {
				this.remCMap(var7, var6, 2048);
				this.remCMap(var7 + 1, var6 + 1, 32768);
			}
			if (arg1 == 2) {
				this.remCMap(var7, var6, 8192);
				this.remCMap(var7 - 1, var6 + 1, 512);
			}
			if (arg1 == 3) {
				this.remCMap(var7, var6, 32768);
				this.remCMap(var7 - 1, var6 + -1, 2048);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.remCMap(var7, var6, 66560);
				this.remCMap(var7, var6 - 1, 4096);
				this.remCMap(var7 + 1, var6, 16384);
			}
			if (arg1 == 1) {
				this.remCMap(var7, var6, 5120);
				this.remCMap(var7 + 1, var6, 16384);
				this.remCMap(var7, var6 + 1, 65536);
			}
			if (arg1 == 2) {
				this.remCMap(var7, var6, 20480);
				this.remCMap(var7, var6 + 1, 65536);
				this.remCMap(var7 - 1, var6, 1024);
			}
			if (arg1 == 3) {
				this.remCMap(var7, var6, 81920);
				this.remCMap(var7 - 1, var6, 1024);
				this.remCMap(var7, var6 - 1, 4096);
			}
		}
	}

	@ObfuscatedName("qf.b(I)V")
	public void reset() {
		for (int var1 = 0; var1 < this.sizeX; var1++) {
			for (int var2 = 0; var2 < this.sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || this.sizeX - 5 <= var1 || var2 >= this.sizeZ - 5) {
					this.flags[var1][var2] = 16777215;
				} else {
					this.flags[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("qf.a(IIIIZII)V")
	public void delLoc(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = arg2 - this.startZ;
		int var8 = 256;
		if (arg3) {
			var8 = 131328;
		}
		if (arg4 == 1 || arg4 == 3) {
			int var9 = arg1;
			arg1 = arg5;
			arg5 = var9;
		}
		int var10 = arg0 - this.startX;
		for (int var11 = var10; var11 < var10 + arg1; var11++) {
			if (var11 >= 0 && this.sizeX > var11) {
				for (int var12 = var7; var12 < arg5 + var7; var12++) {
					if (var12 >= 0 && this.sizeZ > var12) {
						this.remCMap(var12, var11, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("qf.a(BIII)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		this.flags[arg1][arg0] &= ~arg2;
	}

	@ObfuscatedName("qf.a(IIBI)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		this.flags[arg2][arg1] |= arg0;
	}

	@ObfuscatedName("qf.b(IIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == arg3 && arg1 == arg2) {
			return true;
		}
		int var7 = arg5 - this.startX;
		int var8 = arg2 - this.startZ;
		int var9 = arg1 - this.startZ;
		int var10 = arg3 - this.startX;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (var10 - 1 == var7 && var9 == var8) {
					return true;
				}
				if (var10 == var7 && var9 + 1 == var8 && (this.flags[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 - 1 && (this.flags[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (var7 == var10 && var8 == var9 + 1) {
					return true;
				}
				if (var10 - 1 == var7 && var8 == var9 && (this.flags[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var7 == var10 + 1 && var8 == var9 && (this.flags[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (var7 == var10 + 1 && var9 == var8) {
					return true;
				}
				if (var10 == var7 && var9 + 1 == var8 && (this.flags[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 - 1 && (this.flags[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (var7 == var10 && var9 - 1 == var8) {
					return true;
				}
				if (var10 - 1 == var7 && var9 == var8 && (this.flags[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var10 + 1 == var7 && var8 == var9 && (this.flags[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				if (var10 - 1 == var7 && var8 == var9) {
					return true;
				}
				if (var10 == var7 && var8 == var9 + 1) {
					return true;
				}
				if (var10 + 1 == var7 && var8 == var9 && (this.flags[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
				if (var10 == var7 && var9 - 1 == var8 && (this.flags[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (var7 == var10 - 1 && var8 == var9 && (this.flags[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 + 1) {
					return true;
				}
				if (var10 + 1 == var7 && var8 == var9) {
					return true;
				}
				if (var7 == var10 && var8 == var9 - 1 && (this.flags[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (var7 == var10 - 1 && var8 == var9 && (this.flags[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 + 1 && (this.flags[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var7 == var10 + 1 && var8 == var9) {
					return true;
				}
				if (var10 == var7 && var9 - 1 == var8) {
					return true;
				}
			} else if (arg0 == 3) {
				if (var7 == var10 - 1 && var8 == var9) {
					return true;
				}
				if (var7 == var10 && var9 + 1 == var8 && (this.flags[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var7 == var10 + 1 && var8 == var9 && (this.flags[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 - 1) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (var7 == var10 && var9 + 1 == var8 && (this.flags[var7][var8] & 0x20) == 0) {
				return true;
			}
			if (var7 == var10 && var8 == var9 - 1 && (this.flags[var7][var8] & 0x2) == 0) {
				return true;
			}
			if (var7 == var10 - 1 && var9 == var8 && (this.flags[var7][var8] & 0x8) == 0) {
				return true;
			}
			if (var7 == var10 + 1 && var9 == var8 && (this.flags[var7][var8] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("qf.a(IIZ)V")
	public void blockGroundDecor(int arg0, int arg1) {
		int var3 = arg1 - this.startZ;
		int var4 = arg0 - this.startX;
		this.flags[var4][var3] |= 0x40000;
	}
}
