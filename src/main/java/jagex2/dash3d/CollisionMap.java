package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.g")
	public int baseX = 0;

	@ObfuscatedName("jc.h")
	public int baseZ = 0;

	@ObfuscatedName("jc.i")
	public int sizeX;

	@ObfuscatedName("jc.j")
	public int sizeZ;

	@ObfuscatedName("jc.k")
	public int[][] flags;

	public CollisionMap(int z, int x) {
		this.sizeX = x;
		this.sizeZ = z;
		this.flags = new int[this.sizeX][this.sizeZ];
		this.reset();
	}

	@ObfuscatedName("jc.a(B)V")
	public void reset() {
		for (int x = 0; x < this.sizeX; x++) {
			for (int z = 0; z < this.sizeZ; z++) {
				if (x == 0 || z == 0 || this.sizeX - 1 == x || this.sizeZ - 1 == z) {
					this.flags[x][z] = 0xFFFFFF;
				} else {
					this.flags[x][z] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZII)V")
	public void addWall(int arg0, int arg1, int arg2, boolean arg3, int arg5) {
		int var7 = arg2 - this.baseX;
		int var8 = arg0 - this.baseZ;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.addCMap(var7, var8, 128);
				this.addCMap(var7 - 1, var8, 8);
			}
			if (arg5 == 1) {
				this.addCMap(var7, var8, 2);
				this.addCMap(var7, var8 + 1, 32);
			}
			if (arg5 == 2) {
				this.addCMap(var7, var8, 8);
				this.addCMap(var7 + 1, var8, 128);
			}
			if (arg5 == 3) {
				this.addCMap(var7, var8, 32);
				this.addCMap(var7, var8 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.addCMap(var7, var8, 1);
				this.addCMap(var7 - 1, var8 + 1, 16);
			}
			if (arg5 == 1) {
				this.addCMap(var7, var8, 4);
				this.addCMap(var7 + 1, var8 + 1, 64);
			}
			if (arg5 == 2) {
				this.addCMap(var7, var8, 16);
				this.addCMap(var7 + 1, var8 - 1, 1);
			}
			if (arg5 == 3) {
				this.addCMap(var7, var8, 64);
				this.addCMap(var7 - 1, var8 - 1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.addCMap(var7, var8, 130);
				this.addCMap(var7 - 1, var8, 8);
				this.addCMap(var7, var8 + 1, 32);
			}
			if (arg5 == 1) {
				this.addCMap(var7, var8, 10);
				this.addCMap(var7, var8 + 1, 32);
				this.addCMap(var7 + 1, var8, 128);
			}
			if (arg5 == 2) {
				this.addCMap(var7, var8, 40);
				this.addCMap(var7 + 1, var8, 128);
				this.addCMap(var7, var8 - 1, 2);
			}
			if (arg5 == 3) {
				this.addCMap(var7, var8, 160);
				this.addCMap(var7, var8 - 1, 2);
				this.addCMap(var7 - 1, var8, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.addCMap(var7, var8, 65536);
				this.addCMap(var7 - 1, var8, 4096);
			}
			if (arg5 == 1) {
				this.addCMap(var7, var8, 1024);
				this.addCMap(var7, var8 + 1, 16384);
			}
			if (arg5 == 2) {
				this.addCMap(var7, var8, 4096);
				this.addCMap(var7 + 1, var8, 65536);
			}
			if (arg5 == 3) {
				this.addCMap(var7, var8, 16384);
				this.addCMap(var7, var8 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.addCMap(var7, var8, 512);
				this.addCMap(var7 - 1, var8 + 1, 8192);
			}
			if (arg5 == 1) {
				this.addCMap(var7, var8, 2048);
				this.addCMap(var7 + 1, var8 + 1, 32768);
			}
			if (arg5 == 2) {
				this.addCMap(var7, var8, 8192);
				this.addCMap(var7 + 1, var8 - 1, 512);
			}
			if (arg5 == 3) {
				this.addCMap(var7, var8, 32768);
				this.addCMap(var7 - 1, var8 - 1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.addCMap(var7, var8, 66560);
			this.addCMap(var7 - 1, var8, 4096);
			this.addCMap(var7, var8 + 1, 16384);
		}
		if (arg5 == 1) {
			this.addCMap(var7, var8, 5120);
			this.addCMap(var7, var8 + 1, 16384);
			this.addCMap(var7 + 1, var8, 65536);
		}
		if (arg5 == 2) {
			this.addCMap(var7, var8, 20480);
			this.addCMap(var7 + 1, var8, 65536);
			this.addCMap(var7, var8 - 1, 1024);
		}
		if (arg5 == 3) {
			this.addCMap(var7, var8, 81920);
			this.addCMap(var7, var8 - 1, 1024);
			this.addCMap(var7 - 1, var8, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(ZIIIZII)V")
	public void addLoc(boolean arg0, int arg1, int arg2, int arg3, int arg5, int arg6) {
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg2 - this.baseX;
		int var10 = arg6 - this.baseZ;
		if (arg1 == 1 || arg1 == 3) {
			int var11 = arg5;
			arg5 = arg3;
			arg3 = var11;
		}
		for (int var12 = var9; var12 < arg5 + var9; var12++) {
			if (var12 >= 0 && var12 < this.sizeX) {
				for (int var13 = var10; var13 < arg3 + var10; var13++) {
					if (var13 >= 0 && var13 < this.sizeZ) {
						this.addCMap(var12, var13, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void setBlocked(int arg0, int arg2) {
		int var4 = arg2 - this.baseX;
		int var5 = arg0 - this.baseZ;
		this.flags[var4][var5] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void addCMap(int x, int z, int flag) {
		this.flags[x][z] |= flag;
	}

	@ObfuscatedName("jc.a(ZIIIII)V")
	public void delWall(boolean arg0, int arg1, int arg2, int arg3, int arg5) {
		int var7 = arg5 - this.baseX;
		int var8 = arg1 - this.baseZ;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.remCMap(var8, var7, 128);
				this.remCMap(var8, var7 - 1, 8);
			}
			if (arg2 == 1) {
				this.remCMap(var8, var7, 2);
				this.remCMap(var8 + 1, var7, 32);
			}
			if (arg2 == 2) {
				this.remCMap(var8, var7, 8);
				this.remCMap(var8, var7 + 1, 128);
			}
			if (arg2 == 3) {
				this.remCMap(var8, var7, 32);
				this.remCMap(var8 - 1, var7, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.remCMap(var8, var7, 1);
				this.remCMap(var8 + 1, var7 - 1, 16);
			}
			if (arg2 == 1) {
				this.remCMap(var8, var7, 4);
				this.remCMap(var8 + 1, var7 + 1, 64);
			}
			if (arg2 == 2) {
				this.remCMap(var8, var7, 16);
				this.remCMap(var8 - 1, var7 + 1, 1);
			}
			if (arg2 == 3) {
				this.remCMap(var8, var7, 64);
				this.remCMap(var8 - 1, var7 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.remCMap(var8, var7, 130);
				this.remCMap(var8, var7 - 1, 8);
				this.remCMap(var8 + 1, var7, 32);
			}
			if (arg2 == 1) {
				this.remCMap(var8, var7, 10);
				this.remCMap(var8 + 1, var7, 32);
				this.remCMap(var8, var7 + 1, 128);
			}
			if (arg2 == 2) {
				this.remCMap(var8, var7, 40);
				this.remCMap(var8, var7 + 1, 128);
				this.remCMap(var8 - 1, var7, 2);
			}
			if (arg2 == 3) {
				this.remCMap(var8, var7, 160);
				this.remCMap(var8 - 1, var7, 2);
				this.remCMap(var8, var7 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.remCMap(var8, var7, 65536);
				this.remCMap(var8, var7 - 1, 4096);
			}
			if (arg2 == 1) {
				this.remCMap(var8, var7, 1024);
				this.remCMap(var8 + 1, var7, 16384);
			}
			if (arg2 == 2) {
				this.remCMap(var8, var7, 4096);
				this.remCMap(var8, var7 + 1, 65536);
			}
			if (arg2 == 3) {
				this.remCMap(var8, var7, 16384);
				this.remCMap(var8 - 1, var7, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.remCMap(var8, var7, 512);
				this.remCMap(var8 + 1, var7 - 1, 8192);
			}
			if (arg2 == 1) {
				this.remCMap(var8, var7, 2048);
				this.remCMap(var8 + 1, var7 + 1, 32768);
			}
			if (arg2 == 2) {
				this.remCMap(var8, var7, 8192);
				this.remCMap(var8 - 1, var7 + 1, 512);
			}
			if (arg2 == 3) {
				this.remCMap(var8, var7, 32768);
				this.remCMap(var8 - 1, var7 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.remCMap(var8, var7, 66560);
			this.remCMap(var8, var7 - 1, 4096);
			this.remCMap(var8 + 1, var7, 16384);
		}
		if (arg2 == 1) {
			this.remCMap(var8, var7, 5120);
			this.remCMap(var8 + 1, var7, 16384);
			this.remCMap(var8, var7 + 1, 65536);
		}
		if (arg2 == 2) {
			this.remCMap(var8, var7, 20480);
			this.remCMap(var8, var7 + 1, 65536);
			this.remCMap(var8 - 1, var7, 1024);
		}
		if (arg2 == 3) {
			this.remCMap(var8, var7, 81920);
			this.remCMap(var8 - 1, var7, 1024);
			this.remCMap(var8, var7 - 1, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(IIIZIZI)V")
	public void delLoc(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg6) {
		int var9 = 256;
		if (arg3) {
			var9 += 131072;
		}
		int var10 = arg2 - this.baseX;
		int var11 = arg1 - this.baseZ;
		if (arg6 == 1 || arg6 == 3) {
			int var12 = arg0;
			arg0 = arg4;
			arg4 = var12;
		}
		for (int var13 = var10; var13 < arg0 + var10; var13++) {
			if (var13 >= 0 && var13 < this.sizeX) {
				for (int var14 = var11; var14 < arg4 + var11; var14++) {
					if (var14 >= 0 && var14 < this.sizeZ) {
						this.remCMap(var14, var13, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBII)V")
	public void remCMap(int z, int x, int flag) {
		this.flags[x][z] &= 0xFFFFFF - flag;
	}

	@ObfuscatedName("jc.c(III)V")
	public void removeBlocked(int arg0, int arg2) {
		int var4 = arg2 - this.baseX;
		int var5 = arg0 - this.baseZ;
		this.flags[var4][var5] &= 0xFFFFFF - 0x200000;
	}

	@ObfuscatedName("jc.a(IZIIIII)Z")
	public boolean testWall(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == arg5 && arg3 == arg4) {
			return true;
		}
		int var8 = arg5 - this.baseX;
		int var9 = arg4 - this.baseZ;
		int var10 = arg0 - this.baseX;
		int var11 = arg3 - this.baseZ;
		if (arg2 == 0) {
			if (arg6 == 0) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 1) {
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
			} else if (arg6 == 2) {
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 3) {
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg6 == 0) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 1) {
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 2) {
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
			} else if (arg6 == 3) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
				return true;
			}
			if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
				return true;
			}
			if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IIIZIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
		if (!arg3) {
			throw new NullPointerException();
		} else if (arg1 == arg2 && arg0 == arg6) {
			return true;
		} else {
			int var8 = arg1 - this.baseX;
			int var9 = arg0 - this.baseZ;
			int var10 = arg2 - this.baseX;
			int var11 = arg6 - this.baseZ;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("jc.a(IIIIIIBI)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		int var9 = arg0 + arg2 - 1;
		int var10 = arg3 + arg7 - 1;
		if (arg1 >= arg2 && arg1 <= var9 && arg5 >= arg3 && arg5 <= var10) {
			return true;
		} else if (arg2 - 1 == arg1 && arg5 >= arg3 && arg5 <= var10 && (this.flags[arg1 - this.baseX][arg5 - this.baseZ] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (var9 + 1 == arg1 && arg5 >= arg3 && arg5 <= var10 && (this.flags[arg1 - this.baseX][arg5 - this.baseZ] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg5 && arg1 >= arg2 && arg1 <= var9 && (this.flags[arg1 - this.baseX][arg5 - this.baseZ] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return var10 + 1 == arg5 && arg1 >= arg2 && arg1 <= var9 && (this.flags[arg1 - this.baseX][arg5 - this.baseZ] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}
}
