package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public final class CollisionMap {

	@ObfuscatedName("jc.j")
	public final int startX = 0;

	@ObfuscatedName("jc.k")
	public final int startZ = 0;

	@ObfuscatedName("jc.l")
	public final int sizeX = 104;

	@ObfuscatedName("jc.m")
	public final int sizeZ = 104;

	@ObfuscatedName("jc.n")
	public final int[][] flags = new int[sizeX][sizeZ];

	@ObfuscatedName("jc.a")
	public final int field1094 = -550;

	@ObfuscatedName("jc.b")
	public final boolean field1095 = false;

	@ObfuscatedName("jc.c")
	public int field1096;

	@ObfuscatedName("jc.d")
	public final int field1097 = 8;

	@ObfuscatedName("jc.e")
	public final int field1098 = 70;

	@ObfuscatedName("jc.f")
	public final byte field1099 = 99;

	@ObfuscatedName("jc.g")
	public final boolean field1100 = true;

	@ObfuscatedName("jc.h")
	public final int field1101 = 1;

	@ObfuscatedName("jc.i")
	public final boolean field1102 = true;

	public CollisionMap(int arg0, int arg1, int arg2) {
		reset();
	}

	@ObfuscatedName("jc.a(I)V")
	public void reset() {
		for (int var1 = 0; var1 < sizeX; var1++) {
			for (int var2 = 0; var2 < sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || var1 == sizeX - 1 || var2 == sizeZ - 1) {
					flags[var1][var2] = 16777215;
				} else {
					flags[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZIZIII)V")
	public void addWall(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		int var6 = arg3 - startX;
		int var7 = arg4 - startZ;
		if (arg2 == 0) {
			if (arg0 == 0) {
				addCMap(var6, var7, 128);
				addCMap(var6 - 1, var7, 8);
			}
			if (arg0 == 1) {
				addCMap(var6, var7, 2);
				addCMap(var6, var7 + 1, 32);
			}
			if (arg0 == 2) {
				addCMap(var6, var7, 8);
				addCMap(var6 + 1, var7, 128);
			}
			if (arg0 == 3) {
				addCMap(var6, var7, 32);
				addCMap(var6, var7 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				addCMap(var6, var7, 1);
				addCMap(var6 - 1, var7 + 1, 16);
			}
			if (arg0 == 1) {
				addCMap(var6, var7, 4);
				addCMap(var6 + 1, var7 + 1, 64);
			}
			if (arg0 == 2) {
				addCMap(var6, var7, 16);
				addCMap(var6 + 1, var7 - 1, 1);
			}
			if (arg0 == 3) {
				addCMap(var6, var7, 64);
				addCMap(var6 - 1, var7 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				addCMap(var6, var7, 130);
				addCMap(var6 - 1, var7, 8);
				addCMap(var6, var7 + 1, 32);
			}
			if (arg0 == 1) {
				addCMap(var6, var7, 10);
				addCMap(var6, var7 + 1, 32);
				addCMap(var6 + 1, var7, 128);
			}
			if (arg0 == 2) {
				addCMap(var6, var7, 40);
				addCMap(var6 + 1, var7, 128);
				addCMap(var6, var7 - 1, 2);
			}
			if (arg0 == 3) {
				addCMap(var6, var7, 160);
				addCMap(var6, var7 - 1, 2);
				addCMap(var6 - 1, var7, 8);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					addCMap(var6, var7, 65536);
					addCMap(var6 - 1, var7, 4096);
				}
				if (arg0 == 1) {
					addCMap(var6, var7, 1024);
					addCMap(var6, var7 + 1, 16384);
				}
				if (arg0 == 2) {
					addCMap(var6, var7, 4096);
					addCMap(var6 + 1, var7, 65536);
				}
				if (arg0 == 3) {
					addCMap(var6, var7, 16384);
					addCMap(var6, var7 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					addCMap(var6, var7, 512);
					addCMap(var6 - 1, var7 + 1, 8192);
				}
				if (arg0 == 1) {
					addCMap(var6, var7, 2048);
					addCMap(var6 + 1, var7 + 1, 32768);
				}
				if (arg0 == 2) {
					addCMap(var6, var7, 8192);
					addCMap(var6 + 1, var7 - 1, 512);
				}
				if (arg0 == 3) {
					addCMap(var6, var7, 32768);
					addCMap(var6 - 1, var7 - 1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					addCMap(var6, var7, 66560);
					addCMap(var6 - 1, var7, 4096);
					addCMap(var6, var7 + 1, 16384);
				}
				if (arg0 == 1) {
					addCMap(var6, var7, 5120);
					addCMap(var6, var7 + 1, 16384);
					addCMap(var6 + 1, var7, 65536);
				}
				if (arg0 == 2) {
					addCMap(var6, var7, 20480);
					addCMap(var6 + 1, var7, 65536);
					addCMap(var6, var7 - 1, 1024);
				}
				if (arg0 == 3) {
					addCMap(var6, var7, 81920);
					addCMap(var6, var7 - 1, 1024);
					addCMap(var6 - 1, var7, 4096);
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZIIII)V")
	public void addLoc(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 = 131328;
		}
		int var8 = arg3 - startX;
		int var9 = arg0 - startZ;
		if (arg5 == 1 || arg5 == 3) {
			int var10 = arg1;
			arg1 = arg4;
			arg4 = var10;
		}
		for (int var11 = var8; var11 < var8 + arg1; var11++) {
			if (var11 >= 0 && var11 < sizeX) {
				for (int var12 = var9; var12 < var9 + arg4; var12++) {
					if (var12 >= 0 && var12 < sizeZ) {
						addCMap(var11, var12, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void blockGround(int arg0, int arg1) {
		int var3 = arg0 - startX;
		int var4 = arg1 - startZ;
		flags[var3][var4] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIZB)V")
	public void delWall(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg3 - startX;
		int var7 = arg2 - startZ;
		if (arg1 == 0) {
			if (arg0 == 0) {
				remCMap(var6, var7, 128);
				remCMap(var6 - 1, var7, 8);
			}
			if (arg0 == 1) {
				remCMap(var6, var7, 2);
				remCMap(var6, var7 + 1, 32);
			}
			if (arg0 == 2) {
				remCMap(var6, var7, 8);
				remCMap(var6 + 1, var7, 128);
			}
			if (arg0 == 3) {
				remCMap(var6, var7, 32);
				remCMap(var6, var7 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				remCMap(var6, var7, 1);
				remCMap(var6 - 1, var7 + 1, 16);
			}
			if (arg0 == 1) {
				remCMap(var6, var7, 4);
				remCMap(var6 + 1, var7 + 1, 64);
			}
			if (arg0 == 2) {
				remCMap(var6, var7, 16);
				remCMap(var6 + 1, var7 - 1, 1);
			}
			if (arg0 == 3) {
				remCMap(var6, var7, 64);
				remCMap(var6 - 1, var7 - 1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				remCMap(var6, var7, 130);
				remCMap(var6 - 1, var7, 8);
				remCMap(var6, var7 + 1, 32);
			}
			if (arg0 == 1) {
				remCMap(var6, var7, 10);
				remCMap(var6, var7 + 1, 32);
				remCMap(var6 + 1, var7, 128);
			}
			if (arg0 == 2) {
				remCMap(var6, var7, 40);
				remCMap(var6 + 1, var7, 128);
				remCMap(var6, var7 - 1, 2);
			}
			if (arg0 == 3) {
				remCMap(var6, var7, 160);
				remCMap(var6, var7 - 1, 2);
				remCMap(var6 - 1, var7, 8);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					remCMap(var6, var7, 65536);
					remCMap(var6 - 1, var7, 4096);
				}
				if (arg0 == 1) {
					remCMap(var6, var7, 1024);
					remCMap(var6, var7 + 1, 16384);
				}
				if (arg0 == 2) {
					remCMap(var6, var7, 4096);
					remCMap(var6 + 1, var7, 65536);
				}
				if (arg0 == 3) {
					remCMap(var6, var7, 16384);
					remCMap(var6, var7 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					remCMap(var6, var7, 512);
					remCMap(var6 - 1, var7 + 1, 8192);
				}
				if (arg0 == 1) {
					remCMap(var6, var7, 2048);
					remCMap(var6 + 1, var7 + 1, 32768);
				}
				if (arg0 == 2) {
					remCMap(var6, var7, 8192);
					remCMap(var6 + 1, var7 - 1, 512);
				}
				if (arg0 == 3) {
					remCMap(var6, var7, 32768);
					remCMap(var6 - 1, var7 - 1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					remCMap(var6, var7, 66560);
					remCMap(var6 - 1, var7, 4096);
					remCMap(var6, var7 + 1, 16384);
				}
				if (arg0 == 1) {
					remCMap(var6, var7, 5120);
					remCMap(var6, var7 + 1, 16384);
					remCMap(var6 + 1, var7, 65536);
				}
				if (arg0 == 2) {
					remCMap(var6, var7, 20480);
					remCMap(var6 + 1, var7, 65536);
					remCMap(var6, var7 - 1, 1024);
				}
				if (arg0 == 3) {
					remCMap(var6, var7, 81920);
					remCMap(var6, var7 - 1, 1024);
					remCMap(var6 - 1, var7, 4096);
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZIII)V")
	public void delLoc(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 = 131328;
		}
		int var8 = arg2 - startX;
		int var9 = arg1 - startZ;
		if (arg4 == 1 || arg4 == 3) {
			int var10 = arg5;
			arg5 = arg0;
			arg0 = var10;
		}
		for (int var11 = var8; var11 < var8 + arg5; var11++) {
			if (var11 >= 0 && var11 < sizeX) {
				for (int var12 = var9; var12 < var9 + arg0; var12++) {
					if (var12 >= 0 && var12 < sizeZ) {
						remCMap(var11, var12, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] &= 16777215 - arg2;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == arg3 && arg4 == arg0) {
			return true;
		}
		int var7 = arg5 - startX;
		int var8 = arg4 - startZ;
		int var9 = arg3 - startX;
		int var10 = arg0 - startZ;
		if (arg2 == 0) {
			if (arg1 == 0) {
				if (var7 == var9 - 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var7 == var9 && var8 == var10 + 1) {
					return true;
				}
				if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var7 == var9 + 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var7 == var9 && var8 == var10 - 1) {
					return true;
				}
				if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				if (var7 == var9 - 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x280108) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var7 == var9 - 1 && var8 == var10) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x280120) == 0) {
					return true;
				}
				if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x280180) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x20) == 0) {
				return true;
			}
			if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x2) == 0) {
				return true;
			}
			if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x8) == 0) {
				return true;
			}
			if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(BIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == arg0 && arg1 == arg2) {
			return true;
		}
		int var7 = arg5 - startX;
		int var8 = arg1 - startZ;
		int var9 = arg0 - startX;
		int var10 = arg2 - startZ;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x80) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x8) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x8) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x80) == 0) {
					return true;
				}
				if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (var7 == var9 && var8 == var10 + 1 && (flags[var7][var8] & 0x20) == 0) {
				return true;
			}
			if (var7 == var9 && var8 == var10 - 1 && (flags[var7][var8] & 0x2) == 0) {
				return true;
			}
			if (var7 == var9 - 1 && var8 == var10 && (flags[var7][var8] & 0x8) == 0) {
				return true;
			}
			if (var7 == var9 + 1 && var8 == var10 && (flags[var7][var8] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = arg7 + arg0 - 1;
		int var10 = arg1 + arg4 - 1;
		if (arg3 < field1101 || arg3 > field1101) {
			field1096 = 337;
		}
		if (arg5 >= arg7 && arg5 <= var9 && arg2 >= arg1 && arg2 <= var10) {
			return true;
		} else if (arg5 == arg7 - 1 && arg2 >= arg1 && arg2 <= var10 && (flags[arg5 - startX][arg2 - startZ] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg5 == var9 + 1 && arg2 >= arg1 && arg2 <= var10 && (flags[arg5 - startX][arg2 - startZ] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg1 - 1 && arg5 >= arg7 && arg5 <= var9 && (flags[arg5 - startX][arg2 - startZ] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == var10 + 1 && arg5 >= arg7 && arg5 <= var9 && (flags[arg5 - startX][arg2 - startZ] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@ObfuscatedName("jc.a(IZI)V")
	public void unblockGround(int arg0, int arg1) {
		int var3 = arg1 - startX;
		int var4 = arg0 - startZ;
		flags[var3][var4] &= 0xDFFFFF;
	}
}
