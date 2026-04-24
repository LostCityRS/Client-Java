package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("ad")
public final class CollisionMap {

	@ObfuscatedName("ad.d")
	public final int startZ = 0;

	@ObfuscatedName("ad.i")
	public final int sizeZ = 104;

	@ObfuscatedName("ad.n")
	public final int[][] flags = new int[this.sizeX][this.sizeZ];

	@ObfuscatedName("ad.o")
	public final int startX = 0;

	@ObfuscatedName("ad.q")
	public final int sizeX = 104;

	@ObfuscatedName("ad.a(ZIII)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ad.a(III)V")
	public void unblockGround(int arg0, int arg1) {
		int var3 = arg0 - this.startX;
		int var4 = arg1 - this.startZ;
		this.flags[var4][var3] &= 0xDFFFFF;
	}

	@ObfuscatedName("ad.b(I)V")
	public void reset() {
		for (int var1 = 0; var1 < this.sizeX; var1++) {
			for (int var2 = 0; var2 < this.sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || this.sizeX - 1 == var1 || this.sizeZ - 1 == var2) {
					this.flags[var1][var2] = 16777215;
				} else {
					this.flags[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("ad.a(IIIZII)V")
	public void delWall(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		int var6 = arg3 - this.startX;
		int var7 = arg0 - this.startZ;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.remCMap(var6, 128, var7);
				this.remCMap(var6, 8, var7 - 1);
			}
			if (arg1 == 1) {
				this.remCMap(var6, 2, var7);
				this.remCMap(var6 + 1, 32, var7);
			}
			if (arg1 == 2) {
				this.remCMap(var6, 8, var7);
				this.remCMap(var6, 128, var7 + 1);
			}
			if (arg1 == 3) {
				this.remCMap(var6, 32, var7);
				this.remCMap(var6 - 1, 2, var7);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.remCMap(var6, 1, var7);
				this.remCMap(var6 + 1, 16, var7 - 1);
			}
			if (arg1 == 1) {
				this.remCMap(var6, 4, var7);
				this.remCMap(var6 + 1, 64, var7 + 1);
			}
			if (arg1 == 2) {
				this.remCMap(var6, 16, var7);
				this.remCMap(var6 - 1, 1, var7 + 1);
			}
			if (arg1 == 3) {
				this.remCMap(var6, 64, var7);
				this.remCMap(var6 - 1, 4, var7 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.remCMap(var6, 130, var7);
				this.remCMap(var6, 8, var7 - 1);
				this.remCMap(var6 + 1, 32, var7);
			}
			if (arg1 == 1) {
				this.remCMap(var6, 10, var7);
				this.remCMap(var6 + 1, 32, var7);
				this.remCMap(var6, 128, var7 + 1);
			}
			if (arg1 == 2) {
				this.remCMap(var6, 40, var7);
				this.remCMap(var6, 128, var7 + 1);
				this.remCMap(var6 - 1, 2, var7);
			}
			if (arg1 == 3) {
				this.remCMap(var6, 160, var7);
				this.remCMap(var6 - 1, 2, var7);
				this.remCMap(var6, 8, var7 - 1);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.remCMap(var6, 65536, var7);
					this.remCMap(var6, 4096, var7 - 1);
				}
				if (arg1 == 1) {
					this.remCMap(var6, 1024, var7);
					this.remCMap(var6 + 1, 16384, var7);
				}
				if (arg1 == 2) {
					this.remCMap(var6, 4096, var7);
					this.remCMap(var6, 65536, var7 + 1);
				}
				if (arg1 == 3) {
					this.remCMap(var6, 16384, var7);
					this.remCMap(var6 - 1, 1024, var7);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.remCMap(var6, 512, var7);
					this.remCMap(var6 + 1, 8192, var7 - 1);
				}
				if (arg1 == 1) {
					this.remCMap(var6, 2048, var7);
					this.remCMap(var6 + 1, 32768, var7 + 1);
				}
				if (arg1 == 2) {
					this.remCMap(var6, 8192, var7);
					this.remCMap(var6 - 1, 512, var7 + 1);
				}
				if (arg1 == 3) {
					this.remCMap(var6, 32768, var7);
					this.remCMap(var6 - 1, 2048, var7 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.remCMap(var6, 66560, var7);
					this.remCMap(var6, 4096, var7 - 1);
					this.remCMap(var6 + 1, 16384, var7);
				}
				if (arg1 == 1) {
					this.remCMap(var6, 5120, var7);
					this.remCMap(var6 + 1, 16384, var7);
					this.remCMap(var6, 65536, var7 + 1);
				}
				if (arg1 == 2) {
					this.remCMap(var6, 20480, var7);
					this.remCMap(var6, 65536, var7 + 1);
					this.remCMap(var6 - 1, 1024, var7);
				}
				if (arg1 == 3) {
					this.remCMap(var6, 81920, var7);
					this.remCMap(var6 - 1, 1024, var7);
					this.remCMap(var6, 4096, var7 - 1);
				}
			}
		}
	}

	@ObfuscatedName("ad.a(ZIIIIBI)V")
	public void delLoc(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 - this.startX;
		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg4;
			arg4 = arg5;
			arg5 = var8;
		}
		int var9 = 256;
		if (arg0) {
			var9 = 131328;
		}
		int var10 = arg2 - this.startZ;
		for (int var11 = var10; var11 < arg4 + var10; var11++) {
			if (var11 >= 0 && var11 < this.sizeX) {
				for (int var12 = var7; var12 < arg5 + var7; var12++) {
					if (var12 >= 0 && this.sizeZ > var12) {
						this.remCMap(var12, var9, var11);
					}
				}
			}
		}
	}

	@ObfuscatedName("ad.a(IIIIZB)V")
	public void addWall(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg0 - this.startX;
		int var7 = arg3 - this.startZ;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.addCMap(var7, var6, 128);
				this.addCMap(var7 - 1, var6, 8);
			}
			if (arg2 == 1) {
				this.addCMap(var7, var6, 2);
				this.addCMap(var7, var6 + 1, 32);
			}
			if (arg2 == 2) {
				this.addCMap(var7, var6, 8);
				this.addCMap(var7 + 1, var6, 128);
			}
			if (arg2 == 3) {
				this.addCMap(var7, var6, 32);
				this.addCMap(var7, var6 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.addCMap(var7, var6, 1);
				this.addCMap(var7 - 1, var6 - -1, 16);
			}
			if (arg2 == 1) {
				this.addCMap(var7, var6, 4);
				this.addCMap(var7 + 1, var6 + 1, 64);
			}
			if (arg2 == 2) {
				this.addCMap(var7, var6, 16);
				this.addCMap(var7 + 1, var6 + -1, 1);
			}
			if (arg2 == 3) {
				this.addCMap(var7, var6, 64);
				this.addCMap(var7 - 1, var6 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.addCMap(var7, var6, 130);
				this.addCMap(var7 - 1, var6, 8);
				this.addCMap(var7, var6 + 1, 32);
			}
			if (arg2 == 1) {
				this.addCMap(var7, var6, 10);
				this.addCMap(var7, var6 + 1, 32);
				this.addCMap(var7 + 1, var6, 128);
			}
			if (arg2 == 2) {
				this.addCMap(var7, var6, 40);
				this.addCMap(var7 + 1, var6, 128);
				this.addCMap(var7, var6 - 1, 2);
			}
			if (arg2 == 3) {
				this.addCMap(var7, var6, 160);
				this.addCMap(var7, var6 - 1, 2);
				this.addCMap(var7 - 1, var6, 8);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.addCMap(var7, var6, 65536);
					this.addCMap(var7 - 1, var6, 4096);
				}
				if (arg2 == 1) {
					this.addCMap(var7, var6, 1024);
					this.addCMap(var7, var6 + 1, 16384);
				}
				if (arg2 == 2) {
					this.addCMap(var7, var6, 4096);
					this.addCMap(var7 + 1, var6, 65536);
				}
				if (arg2 == 3) {
					this.addCMap(var7, var6, 16384);
					this.addCMap(var7, var6 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.addCMap(var7, var6, 512);
					this.addCMap(var7 - 1, var6 + 1, 8192);
				}
				if (arg2 == 1) {
					this.addCMap(var7, var6, 2048);
					this.addCMap(var7 + 1, var6 - -1, 32768);
				}
				if (arg2 == 2) {
					this.addCMap(var7, var6, 8192);
					this.addCMap(var7 + 1, var6 - 1, 512);
				}
				if (arg2 == 3) {
					this.addCMap(var7, var6, 32768);
					this.addCMap(var7 - 1, var6 + -1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.addCMap(var7, var6, 66560);
					this.addCMap(var7 - 1, var6, 4096);
					this.addCMap(var7, var6 + 1, 16384);
				}
				if (arg2 == 1) {
					this.addCMap(var7, var6, 5120);
					this.addCMap(var7, var6 + 1, 16384);
					this.addCMap(var7 + 1, var6, 65536);
				}
				if (arg2 == 2) {
					this.addCMap(var7, var6, 20480);
					this.addCMap(var7 + 1, var6, 65536);
					this.addCMap(var7, var6 - 1, 1024);
				}
				if (arg2 == 3) {
					this.addCMap(var7, var6, 81920);
					this.addCMap(var7, var6 - 1, 1024);
					this.addCMap(var7 - 1, var6, 4096);
				}
			}
		}
	}

	@ObfuscatedName("ad.a(BII)V")
	public void blockGround(int arg0, int arg1) {
		int var3 = arg0 - this.startX;
		int var4 = arg1 - this.startZ;
		this.flags[var4][var3] |= 0x200000;
	}

	@ObfuscatedName("ad.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 - 1;
		int var9 = arg3 + arg0 - 1;
		if (arg6 >= arg1 && arg6 <= var8 && arg5 >= arg3 && var9 >= arg5) {
			return true;
		} else if (arg1 - 1 == arg6 && arg5 >= arg3 && var9 >= arg5 && (this.flags[arg6 - this.startZ][arg5 - this.startX] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (var8 + 1 == arg6 && arg5 >= arg3 && arg5 <= var9 && (this.flags[arg6 - this.startZ][arg5 - this.startX] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg5 && arg6 >= arg1 && arg6 <= var8 && (this.flags[arg6 - this.startZ][arg5 - this.startX] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return var9 + 1 == arg5 && arg1 <= arg6 && var8 >= arg6 && (this.flags[arg6 - this.startZ][arg5 - this.startX] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@ObfuscatedName("ad.a(IZIIIII)V")
	public void addLoc(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg4 - this.startX;
		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}
		int var9 = arg0 - this.startZ;
		int var10 = 256;
		if (arg1) {
			var10 = 131328;
		}
		for (int var11 = var9; var11 < var9 + arg5; var11++) {
			if (var11 >= 0 && var11 < this.sizeX) {
				for (int var12 = var7; var12 < arg2 + var7; var12++) {
					if (var12 >= 0 && var12 < this.sizeZ) {
						this.addCMap(var11, var12, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ad.b(IZIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg2 == arg3) {
			return true;
		}
		int var7 = arg3 - this.startX;
		int var8 = arg5 - this.startZ;
		int var9 = arg0 - this.startZ;
		int var10 = arg2 - this.startX;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (var8 - 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var8 == var9 && var10 + 1 == var7) {
					return true;
				}
				if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var8 + 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var8 == var9 && var10 - 1 == var7) {
					return true;
				}
				if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				if (var8 - 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280180) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var8 - 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x1280180) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x20) == 0) {
				return true;
			}
			if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x2) == 0) {
				return true;
			}
			if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x8) == 0) {
				return true;
			}
			if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ad.a(IIIB)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		this.flags[arg2][arg0] &= 16777215 - arg1;
	}

	public CollisionMap(int arg0, int arg1) {
		this.reset();
	}

	@ObfuscatedName("ad.a(IIIIIBI)Z")
	public boolean tesWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg2) {
			return true;
		}
		int var7 = arg2 - this.startX;
		int var8 = arg3 - this.startZ;
		int var9 = arg4 - this.startZ;
		int var10 = arg0 - this.startX;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x80) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x8) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x8) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x80) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (var8 == var9 && var10 + 1 == var7 && (this.flags[var9][var7] & 0x20) == 0) {
				return true;
			}
			if (var8 == var9 && var10 - 1 == var7 && (this.flags[var9][var7] & 0x2) == 0) {
				return true;
			}
			if (var8 - 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x8) == 0) {
				return true;
			}
			if (var8 + 1 == var9 && var7 == var10 && (this.flags[var9][var7] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}
