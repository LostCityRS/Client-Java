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

	public CollisionMap(int arg0, int arg1) {
		this.sizeX = arg1;
		this.sizeZ = arg0;
		this.flags = new int[this.sizeX][this.sizeZ];
		this.reset();
	}

	@ObfuscatedName("jc.a(I)V")
	public void reset() {
		for (int var2 = 0; var2 < this.sizeX; var2++) {
			for (int var3 = 0; var3 < this.sizeZ; var3++) {
				if (var2 == 0 || var3 == 0 || var2 == this.sizeX - 1 || var3 == this.sizeZ - 1) {
					this.flags[var2][var3] = 16777215;
				} else {
					this.flags[var2][var3] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZIZ)V")
	public void addWall(int arg0, int arg1, int arg2, int arg4, boolean arg5) {
		int var8 = arg4 - this.baseX;
		int var9 = arg2 - this.baseZ;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.addCMap(var8, var9, 128);
				this.addCMap(var8 - 1, var9, 8);
			}
			if (arg1 == 1) {
				this.addCMap(var8, var9, 2);
				this.addCMap(var8, var9 + 1, 32);
			}
			if (arg1 == 2) {
				this.addCMap(var8, var9, 8);
				this.addCMap(var8 + 1, var9, 128);
			}
			if (arg1 == 3) {
				this.addCMap(var8, var9, 32);
				this.addCMap(var8, var9 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.addCMap(var8, var9, 1);
				this.addCMap(var8 - 1, var9 + 1, 16);
			}
			if (arg1 == 1) {
				this.addCMap(var8, var9, 4);
				this.addCMap(var8 + 1, var9 + 1, 64);
			}
			if (arg1 == 2) {
				this.addCMap(var8, var9, 16);
				this.addCMap(var8 + 1, var9 - 1, 1);
			}
			if (arg1 == 3) {
				this.addCMap(var8, var9, 64);
				this.addCMap(var8 - 1, var9 - 1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.addCMap(var8, var9, 130);
				this.addCMap(var8 - 1, var9, 8);
				this.addCMap(var8, var9 + 1, 32);
			}
			if (arg1 == 1) {
				this.addCMap(var8, var9, 10);
				this.addCMap(var8, var9 + 1, 32);
				this.addCMap(var8 + 1, var9, 128);
			}
			if (arg1 == 2) {
				this.addCMap(var8, var9, 40);
				this.addCMap(var8 + 1, var9, 128);
				this.addCMap(var8, var9 - 1, 2);
			}
			if (arg1 == 3) {
				this.addCMap(var8, var9, 160);
				this.addCMap(var8, var9 - 1, 2);
				this.addCMap(var8 - 1, var9, 8);
			}
		}
		if (arg5) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.addCMap(var8, var9, 65536);
					this.addCMap(var8 - 1, var9, 4096);
				}
				if (arg1 == 1) {
					this.addCMap(var8, var9, 1024);
					this.addCMap(var8, var9 + 1, 16384);
				}
				if (arg1 == 2) {
					this.addCMap(var8, var9, 4096);
					this.addCMap(var8 + 1, var9, 65536);
				}
				if (arg1 == 3) {
					this.addCMap(var8, var9, 16384);
					this.addCMap(var8, var9 - 1, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.addCMap(var8, var9, 512);
					this.addCMap(var8 - 1, var9 + 1, 8192);
				}
				if (arg1 == 1) {
					this.addCMap(var8, var9, 2048);
					this.addCMap(var8 + 1, var9 + 1, 32768);
				}
				if (arg1 == 2) {
					this.addCMap(var8, var9, 8192);
					this.addCMap(var8 + 1, var9 - 1, 512);
				}
				if (arg1 == 3) {
					this.addCMap(var8, var9, 32768);
					this.addCMap(var8 - 1, var9 - 1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.addCMap(var8, var9, 66560);
					this.addCMap(var8 - 1, var9, 4096);
					this.addCMap(var8, var9 + 1, 16384);
				}
				if (arg1 == 1) {
					this.addCMap(var8, var9, 5120);
					this.addCMap(var8, var9 + 1, 16384);
					this.addCMap(var8 + 1, var9, 65536);
				}
				if (arg1 == 2) {
					this.addCMap(var8, var9, 20480);
					this.addCMap(var8 + 1, var9, 65536);
					this.addCMap(var8, var9 - 1, 1024);
				}
				if (arg1 == 3) {
					this.addCMap(var8, var9, 81920);
					this.addCMap(var8, var9 - 1, 1024);
					this.addCMap(var8 - 1, var9, 4096);
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZIZ)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
		int var8 = 256;
		if (arg4) {
			var8 += 131072;
		}
		int var9 = arg5 - this.baseX;
		int var10 = arg0 - this.baseZ;
		if (arg6) {
			return;
		}
		if (arg1 == 1 || arg1 == 3) {
			int var11 = arg2;
			arg2 = arg3;
			arg3 = var11;
		}
		for (int var12 = var9; var12 < var9 + arg2; var12++) {
			if (var12 >= 0 && var12 < this.sizeX) {
				for (int var13 = var10; var13 < var10 + arg3; var13++) {
					if (var13 >= 0 && var13 < this.sizeZ) {
						this.addCMap(var12, var13, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void setBlocked(int arg0, int arg1) {
		int var4 = arg0 - this.baseX;
		int var5 = arg1 - this.baseZ;
		this.flags[var4][var5] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIIZ)V")
	public void delWall(int arg0, int arg1, int arg2, int arg4, boolean arg5) {
		int var7 = arg2 - this.baseX;
		int var8 = arg0 - this.baseZ;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.remCMap(var7, 128, var8);
				this.remCMap(var7 - 1, 8, var8);
			}
			if (arg1 == 1) {
				this.remCMap(var7, 2, var8);
				this.remCMap(var7, 32, var8 + 1);
			}
			if (arg1 == 2) {
				this.remCMap(var7, 8, var8);
				this.remCMap(var7 + 1, 128, var8);
			}
			if (arg1 == 3) {
				this.remCMap(var7, 32, var8);
				this.remCMap(var7, 2, var8 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.remCMap(var7, 1, var8);
				this.remCMap(var7 - 1, 16, var8 + 1);
			}
			if (arg1 == 1) {
				this.remCMap(var7, 4, var8);
				this.remCMap(var7 + 1, 64, var8 + 1);
			}
			if (arg1 == 2) {
				this.remCMap(var7, 16, var8);
				this.remCMap(var7 + 1, 1, var8 - 1);
			}
			if (arg1 == 3) {
				this.remCMap(var7, 64, var8);
				this.remCMap(var7 - 1, 4, var8 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.remCMap(var7, 130, var8);
				this.remCMap(var7 - 1, 8, var8);
				this.remCMap(var7, 32, var8 + 1);
			}
			if (arg1 == 1) {
				this.remCMap(var7, 10, var8);
				this.remCMap(var7, 32, var8 + 1);
				this.remCMap(var7 + 1, 128, var8);
			}
			if (arg1 == 2) {
				this.remCMap(var7, 40, var8);
				this.remCMap(var7 + 1, 128, var8);
				this.remCMap(var7, 2, var8 - 1);
			}
			if (arg1 == 3) {
				this.remCMap(var7, 160, var8);
				this.remCMap(var7, 2, var8 - 1);
				this.remCMap(var7 - 1, 8, var8);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.remCMap(var7, 65536, var8);
					this.remCMap(var7 - 1, 4096, var8);
				}
				if (arg1 == 1) {
					this.remCMap(var7, 1024, var8);
					this.remCMap(var7, 16384, var8 + 1);
				}
				if (arg1 == 2) {
					this.remCMap(var7, 4096, var8);
					this.remCMap(var7 + 1, 65536, var8);
				}
				if (arg1 == 3) {
					this.remCMap(var7, 16384, var8);
					this.remCMap(var7, 1024, var8 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.remCMap(var7, 512, var8);
					this.remCMap(var7 - 1, 8192, var8 + 1);
				}
				if (arg1 == 1) {
					this.remCMap(var7, 2048, var8);
					this.remCMap(var7 + 1, 32768, var8 + 1);
				}
				if (arg1 == 2) {
					this.remCMap(var7, 8192, var8);
					this.remCMap(var7 + 1, 512, var8 - 1);
				}
				if (arg1 == 3) {
					this.remCMap(var7, 32768, var8);
					this.remCMap(var7 - 1, 2048, var8 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.remCMap(var7, 66560, var8);
					this.remCMap(var7 - 1, 4096, var8);
					this.remCMap(var7, 16384, var8 + 1);
				}
				if (arg1 == 1) {
					this.remCMap(var7, 5120, var8);
					this.remCMap(var7, 16384, var8 + 1);
					this.remCMap(var7 + 1, 65536, var8);
				}
				if (arg1 == 2) {
					this.remCMap(var7, 20480, var8);
					this.remCMap(var7 + 1, 65536, var8);
					this.remCMap(var7, 1024, var8 - 1);
				}
				if (arg1 == 3) {
					this.remCMap(var7, 81920, var8);
					this.remCMap(var7, 1024, var8 - 1);
					this.remCMap(var7 - 1, 4096, var8);
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZII)V")
	public void delLoc(int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
		int var8 = 256;
		if (arg4) {
			var8 += 131072;
		}
		int var10 = arg1 - this.baseX;
		int var11 = arg3 - this.baseZ;
		if (arg5 == 1 || arg5 == 3) {
			int var12 = arg2;
			arg2 = arg6;
			arg6 = var12;
		}
		for (int var13 = var10; var13 < var10 + arg2; var13++) {
			if (var13 >= 0 && var13 < this.sizeX) {
				for (int var14 = var11; var14 < var11 + arg6; var14++) {
					if (var14 >= 0 && var14 < this.sizeZ) {
						this.remCMap(var13, var8, var14);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIB)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg2] &= 16777215 - arg1;
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void removeBlocked(int arg0, int arg2) {
		int var4 = arg2 - this.baseX;
		int var5 = arg0 - this.baseZ;
		this.flags[var4][var5] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIIB)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg4 == arg5) {
			return true;
		}
		int var8 = arg1 - this.baseX;
		int var9 = arg4 - this.baseZ;
		int var10 = arg2 - this.baseX;
		int var11 = arg5 - this.baseZ;
		if (arg0 == 0) {
			if (arg3 == 0) {
				if (var8 == var10 - 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (var8 == var10 && var9 == var11 + 1) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (var8 == var10 + 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (var8 == var10 && var9 == var11 - 1) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				if (var8 == var10 - 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1) {
					return true;
				}
			} else if (arg3 == 3) {
				if (var8 == var10 - 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x2) == 0) {
				return true;
			}
			if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
				return true;
			}
			if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IZIIIII)Z")
	public boolean testWDecor(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == arg5 && arg2 == arg6) {
			return true;
		}
		int var8 = arg0 - this.baseX;
		int var9 = arg2 - this.baseZ;
		int var10 = arg5 - this.baseX;
		int var11 = arg6 - this.baseZ;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x2) == 0) {
				return true;
			}
			if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
				return true;
			}
			if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var10 = arg7 + arg5 - 1;
		int var11 = arg4 + arg0 - 1;
		if (arg6 >= arg7 && arg6 <= var10 && arg3 >= arg4 && arg3 <= var11) {
			return true;
		} else if (arg6 == arg7 - 1 && arg3 >= arg4 && arg3 <= var11 && (this.flags[arg6 - this.baseX][arg3 - this.baseZ] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg6 == var10 + 1 && arg3 >= arg4 && arg3 <= var11 && (this.flags[arg6 - this.baseX][arg3 - this.baseZ] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg4 - 1 && arg6 >= arg7 && arg6 <= var10 && (this.flags[arg6 - this.baseX][arg3 - this.baseZ] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == var11 + 1 && arg6 >= arg7 && arg6 <= var10 && (this.flags[arg6 - this.baseX][arg3 - this.baseZ] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}
}
