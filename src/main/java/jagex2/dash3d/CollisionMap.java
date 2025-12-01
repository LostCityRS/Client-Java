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

	public CollisionMap(int arg1, int arg2) {
		this.sizeX = arg2;
		this.sizeZ = arg1;
		this.flags = new int[this.sizeX][this.sizeZ];
		this.reset();
	}

	@ObfuscatedName("jc.a(Z)V")
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

	@ObfuscatedName("jc.a(IIIIZI)V")
	public void addWall(int arg0, int arg1, int arg3, boolean arg4, int arg5) {
		int var7 = arg0 - this.baseX;
		int var8 = arg1 - this.baseZ;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.addCMap(var7, var8, 128);
				this.addCMap(var7 - 1, var8, 8);
			}
			if (arg3 == 1) {
				this.addCMap(var7, var8, 2);
				this.addCMap(var7, var8 + 1, 32);
			}
			if (arg3 == 2) {
				this.addCMap(var7, var8, 8);
				this.addCMap(var7 + 1, var8, 128);
			}
			if (arg3 == 3) {
				this.addCMap(var7, var8, 32);
				this.addCMap(var7, var8 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.addCMap(var7, var8, 1);
				this.addCMap(var7 - 1, var8 + 1, 16);
			}
			if (arg3 == 1) {
				this.addCMap(var7, var8, 4);
				this.addCMap(var7 + 1, var8 + 1, 64);
			}
			if (arg3 == 2) {
				this.addCMap(var7, var8, 16);
				this.addCMap(var7 + 1, var8 - 1, 1);
			}
			if (arg3 == 3) {
				this.addCMap(var7, var8, 64);
				this.addCMap(var7 - 1, var8 - 1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.addCMap(var7, var8, 130);
				this.addCMap(var7 - 1, var8, 8);
				this.addCMap(var7, var8 + 1, 32);
			}
			if (arg3 == 1) {
				this.addCMap(var7, var8, 10);
				this.addCMap(var7, var8 + 1, 32);
				this.addCMap(var7 + 1, var8, 128);
			}
			if (arg3 == 2) {
				this.addCMap(var7, var8, 40);
				this.addCMap(var7 + 1, var8, 128);
				this.addCMap(var7, var8 - 1, 2);
			}
			if (arg3 == 3) {
				this.addCMap(var7, var8, 160);
				this.addCMap(var7, var8 - 1, 2);
				this.addCMap(var7 - 1, var8, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.addCMap(var7, var8, 65536);
				this.addCMap(var7 - 1, var8, 4096);
			}
			if (arg3 == 1) {
				this.addCMap(var7, var8, 1024);
				this.addCMap(var7, var8 + 1, 16384);
			}
			if (arg3 == 2) {
				this.addCMap(var7, var8, 4096);
				this.addCMap(var7 + 1, var8, 65536);
			}
			if (arg3 == 3) {
				this.addCMap(var7, var8, 16384);
				this.addCMap(var7, var8 - 1, 1024);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.addCMap(var7, var8, 512);
				this.addCMap(var7 - 1, var8 + 1, 8192);
			}
			if (arg3 == 1) {
				this.addCMap(var7, var8, 2048);
				this.addCMap(var7 + 1, var8 + 1, 32768);
			}
			if (arg3 == 2) {
				this.addCMap(var7, var8, 8192);
				this.addCMap(var7 + 1, var8 - 1, 512);
			}
			if (arg3 == 3) {
				this.addCMap(var7, var8, 32768);
				this.addCMap(var7 - 1, var8 - 1, 2048);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.addCMap(var7, var8, 66560);
			this.addCMap(var7 - 1, var8, 4096);
			this.addCMap(var7, var8 + 1, 16384);
		}
		if (arg3 == 1) {
			this.addCMap(var7, var8, 5120);
			this.addCMap(var7, var8 + 1, 16384);
			this.addCMap(var7 + 1, var8, 65536);
		}
		if (arg3 == 2) {
			this.addCMap(var7, var8, 20480);
			this.addCMap(var7 + 1, var8, 65536);
			this.addCMap(var7, var8 - 1, 1024);
		}
		if (arg3 == 3) {
			this.addCMap(var7, var8, 81920);
			this.addCMap(var7, var8 - 1, 1024);
			this.addCMap(var7 - 1, var8, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(ZIIIIII)V")
	public void addLoc(boolean arg0, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg6 - this.baseX;
		int var10 = arg2 - this.baseZ;
		if (arg3 == 1 || arg3 == 3) {
			int var11 = arg4;
			arg4 = arg5;
			arg5 = var11;
		}
		for (int var12 = var9; var12 < var9 + arg4; var12++) {
			if (var12 >= 0 && var12 < this.sizeX) {
				for (int var13 = var10; var13 < var10 + arg5; var13++) {
					if (var13 >= 0 && var13 < this.sizeZ) {
						this.addCMap(var12, var13, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void blockGround(int arg0, int arg1) {
		int var4 = arg1 - this.baseX;
		int var5 = arg0 - this.baseZ;
		this.flags[var4][var5] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IBIIIZ)V")
	public void delWall(int arg0, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = arg2 - this.baseX;
		int var8 = arg4 - this.baseZ;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.remCMap(var8, 128, var7);
				this.remCMap(var8, 8, var7 - 1);
			}
			if (arg3 == 1) {
				this.remCMap(var8, 2, var7);
				this.remCMap(var8 + 1, 32, var7);
			}
			if (arg3 == 2) {
				this.remCMap(var8, 8, var7);
				this.remCMap(var8, 128, var7 + 1);
			}
			if (arg3 == 3) {
				this.remCMap(var8, 32, var7);
				this.remCMap(var8 - 1, 2, var7);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.remCMap(var8, 1, var7);
				this.remCMap(var8 + 1, 16, var7 - 1);
			}
			if (arg3 == 1) {
				this.remCMap(var8, 4, var7);
				this.remCMap(var8 + 1, 64, var7 + 1);
			}
			if (arg3 == 2) {
				this.remCMap(var8, 16, var7);
				this.remCMap(var8 - 1, 1, var7 + 1);
			}
			if (arg3 == 3) {
				this.remCMap(var8, 64, var7);
				this.remCMap(var8 - 1, 4, var7 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.remCMap(var8, 130, var7);
				this.remCMap(var8, 8, var7 - 1);
				this.remCMap(var8 + 1, 32, var7);
			}
			if (arg3 == 1) {
				this.remCMap(var8, 10, var7);
				this.remCMap(var8 + 1, 32, var7);
				this.remCMap(var8, 128, var7 + 1);
			}
			if (arg3 == 2) {
				this.remCMap(var8, 40, var7);
				this.remCMap(var8, 128, var7 + 1);
				this.remCMap(var8 - 1, 2, var7);
			}
			if (arg3 == 3) {
				this.remCMap(var8, 160, var7);
				this.remCMap(var8 - 1, 2, var7);
				this.remCMap(var8, 8, var7 - 1);
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.remCMap(var8, 65536, var7);
				this.remCMap(var8, 4096, var7 - 1);
			}
			if (arg3 == 1) {
				this.remCMap(var8, 1024, var7);
				this.remCMap(var8 + 1, 16384, var7);
			}
			if (arg3 == 2) {
				this.remCMap(var8, 4096, var7);
				this.remCMap(var8, 65536, var7 + 1);
			}
			if (arg3 == 3) {
				this.remCMap(var8, 16384, var7);
				this.remCMap(var8 - 1, 1024, var7);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.remCMap(var8, 512, var7);
				this.remCMap(var8 + 1, 8192, var7 - 1);
			}
			if (arg3 == 1) {
				this.remCMap(var8, 2048, var7);
				this.remCMap(var8 + 1, 32768, var7 + 1);
			}
			if (arg3 == 2) {
				this.remCMap(var8, 8192, var7);
				this.remCMap(var8 - 1, 512, var7 + 1);
			}
			if (arg3 == 3) {
				this.remCMap(var8, 32768, var7);
				this.remCMap(var8 - 1, 2048, var7 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.remCMap(var8, 66560, var7);
			this.remCMap(var8, 4096, var7 - 1);
			this.remCMap(var8 + 1, 16384, var7);
		}
		if (arg3 == 1) {
			this.remCMap(var8, 5120, var7);
			this.remCMap(var8 + 1, 16384, var7);
			this.remCMap(var8, 65536, var7 + 1);
		}
		if (arg3 == 2) {
			this.remCMap(var8, 20480, var7);
			this.remCMap(var8, 65536, var7 + 1);
			this.remCMap(var8 - 1, 1024, var7);
		}
		if (arg3 == 3) {
			this.remCMap(var8, 81920, var7);
			this.remCMap(var8 - 1, 1024, var7);
			this.remCMap(var8, 4096, var7 - 1);
			return;
		}
	}

	@ObfuscatedName("jc.a(ZIIBIII)V")
	public void delLoc(boolean arg0, int arg1, int arg2, int arg4, int arg5, int arg6) {
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg6 - this.baseX;
		int var10 = arg2 - this.baseZ;
		if (arg5 == 1 || arg5 == 3) {
			int var11 = arg1;
			arg1 = arg4;
			arg4 = var11;
		}
		for (int var12 = var9; var12 < var9 + arg1; var12++) {
			if (var12 >= 0 && var12 < this.sizeX) {
				for (int var13 = var10; var13 < var10 + arg4; var13++) {
					if (var13 >= 0 && var13 < this.sizeZ) {
						this.remCMap(var13, var8, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void remCMap(int arg1, int arg2, int arg3) {
		this.flags[arg3][arg1] &= 16777215 - arg2;
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void unblockGround(int arg1, int arg2) {
		int var4 = arg2 - this.baseX;
		int var5 = arg1 - this.baseZ;
		this.flags[var4][var5] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean testWall(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 == arg2 && arg3 == arg4) {
			return true;
		}
		int var8 = arg6 - this.baseX;
		int var9 = arg3 - this.baseZ;
		int var10 = arg2 - this.baseX;
		int var11 = arg4 - this.baseZ;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (var8 == var10 - 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var8 == var10 && var9 == var11 + 1) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.flags[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.flags[var8][var9] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var8 == var10 + 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.flags[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.flags[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
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
		if (arg5 == 2) {
			if (arg1 == 0) {
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
			} else if (arg1 == 1) {
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
			} else if (arg1 == 2) {
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
			} else if (arg1 == 3) {
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
		if (arg5 == 9) {
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

	@ObfuscatedName("jc.b(ZIIIIII)Z")
	public boolean testWDecor(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 == arg1 && arg2 == arg6) {
			return true;
		} else {
			int var8 = arg5 - this.baseX;
			int var9 = arg2 - this.baseZ;
			int var10 = arg1 - this.baseX;
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
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		int var9 = arg3 + arg0 - 1;
		int var10 = arg7 + arg5 - 1;
		if (arg1 >= arg3 && arg1 <= var9 && arg4 >= arg7 && arg4 <= var10) {
			return true;
		} else if (arg1 == arg3 - 1 && arg4 >= arg7 && arg4 <= var10 && (this.flags[arg1 - this.baseX][arg4 - this.baseZ] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg1 == var9 + 1 && arg4 >= arg7 && arg4 <= var10 && (this.flags[arg1 - this.baseX][arg4 - this.baseZ] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg7 - 1 && arg1 >= arg3 && arg1 <= var9 && (this.flags[arg1 - this.baseX][arg4 - this.baseZ] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == var10 + 1 && arg1 >= arg3 && arg1 <= var9 && (this.flags[arg1 - this.baseX][arg4 - this.baseZ] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}
}
