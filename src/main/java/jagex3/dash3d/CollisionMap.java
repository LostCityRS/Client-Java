package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("ad")
public final class CollisionMap {

	@ObfuscatedName("ad.d")
	public final int field191 = 0;

	@ObfuscatedName("ad.i")
	public final int field196 = 104;

	@ObfuscatedName("ad.n")
	public final int[][] field201 = new int[this.field204][this.field196];

	@ObfuscatedName("ad.o")
	public final int field202 = 0;

	@ObfuscatedName("ad.q")
	public final int field204 = 104;

	@ObfuscatedName("ad.z")
	public static Object field213 = new Object();

	@ObfuscatedName("ad.C")
	public static int field216 = 0;

	@ObfuscatedName("ad.A")
	public static int field214 = -1;

	@ObfuscatedName("ad.G")
	public static byte[] field220 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@ObfuscatedName("ad.a(ZIII)V")
	public void method107(int arg0, int arg1, int arg2) {
		this.field201[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ad.a(III)V")
	public void method109(int arg0, int arg1) {
		int var3 = arg0 - this.field202;
		int var4 = arg1 - this.field191;
		this.field201[var4][var3] &= 0xDFFFFF;
	}

	@ObfuscatedName("ad.b(I)V")
	public void method110() {
		for (int var1 = 0; var1 < this.field204; var1++) {
			for (int var2 = 0; var2 < this.field196; var2++) {
				if (var1 == 0 || var2 == 0 || this.field204 - 1 == var1 || this.field196 - 1 == var2) {
					this.field201[var1][var2] = 16777215;
				} else {
					this.field201[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("ad.a(IIIZII)V")
	public void method112(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		int var6 = arg3 - this.field202;
		int var7 = arg0 - this.field191;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method120(var6, 128, var7);
				this.method120(var6, 8, var7 - 1);
			}
			if (arg1 == 1) {
				this.method120(var6, 2, var7);
				this.method120(var6 + 1, 32, var7);
			}
			if (arg1 == 2) {
				this.method120(var6, 8, var7);
				this.method120(var6, 128, var7 + 1);
			}
			if (arg1 == 3) {
				this.method120(var6, 32, var7);
				this.method120(var6 - 1, 2, var7);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method120(var6, 1, var7);
				this.method120(var6 + 1, 16, var7 - 1);
			}
			if (arg1 == 1) {
				this.method120(var6, 4, var7);
				this.method120(var6 + 1, 64, var7 + 1);
			}
			if (arg1 == 2) {
				this.method120(var6, 16, var7);
				this.method120(var6 - 1, 1, var7 + 1);
			}
			if (arg1 == 3) {
				this.method120(var6, 64, var7);
				this.method120(var6 - 1, 4, var7 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method120(var6, 130, var7);
				this.method120(var6, 8, var7 - 1);
				this.method120(var6 + 1, 32, var7);
			}
			if (arg1 == 1) {
				this.method120(var6, 10, var7);
				this.method120(var6 + 1, 32, var7);
				this.method120(var6, 128, var7 + 1);
			}
			if (arg1 == 2) {
				this.method120(var6, 40, var7);
				this.method120(var6, 128, var7 + 1);
				this.method120(var6 - 1, 2, var7);
			}
			if (arg1 == 3) {
				this.method120(var6, 160, var7);
				this.method120(var6 - 1, 2, var7);
				this.method120(var6, 8, var7 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method120(var6, 65536, var7);
				this.method120(var6, 4096, var7 - 1);
			}
			if (arg1 == 1) {
				this.method120(var6, 1024, var7);
				this.method120(var6 + 1, 16384, var7);
			}
			if (arg1 == 2) {
				this.method120(var6, 4096, var7);
				this.method120(var6, 65536, var7 + 1);
			}
			if (arg1 == 3) {
				this.method120(var6, 16384, var7);
				this.method120(var6 - 1, 1024, var7);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method120(var6, 512, var7);
				this.method120(var6 + 1, 8192, var7 - 1);
			}
			if (arg1 == 1) {
				this.method120(var6, 2048, var7);
				this.method120(var6 + 1, 32768, var7 + 1);
			}
			if (arg1 == 2) {
				this.method120(var6, 8192, var7);
				this.method120(var6 - 1, 512, var7 + 1);
			}
			if (arg1 == 3) {
				this.method120(var6, 32768, var7);
				this.method120(var6 - 1, 2048, var7 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method120(var6, 66560, var7);
			this.method120(var6, 4096, var7 - 1);
			this.method120(var6 + 1, 16384, var7);
		}
		if (arg1 == 1) {
			this.method120(var6, 5120, var7);
			this.method120(var6 + 1, 16384, var7);
			this.method120(var6, 65536, var7 + 1);
		}
		if (arg1 == 2) {
			this.method120(var6, 20480, var7);
			this.method120(var6, 65536, var7 + 1);
			this.method120(var6 - 1, 1024, var7);
		}
		if (arg1 == 3) {
			this.method120(var6, 81920, var7);
			this.method120(var6 - 1, 1024, var7);
			this.method120(var6, 4096, var7 - 1);
			return;
		}
	}

	@ObfuscatedName("ad.a(ZIIIIBI)V")
	public void method113(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 - this.field202;
		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg4;
			arg4 = arg5;
			arg5 = var8;
		}
		int var9 = 256;
		if (arg0) {
			var9 = 131328;
		}
		int var10 = arg2 - this.field191;
		for (int var11 = var10; var11 < arg4 + var10; var11++) {
			if (var11 >= 0 && var11 < this.field204) {
				for (int var12 = var7; var12 < arg5 + var7; var12++) {
					if (var12 >= 0 && this.field196 > var12) {
						this.method120(var12, var9, var11);
					}
				}
			}
		}
	}

	@ObfuscatedName("ad.a(IIIIZB)V")
	public void method114(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg0 - this.field202;
		int var7 = arg3 - this.field191;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method107(var7, var6, 128);
				this.method107(var7 - 1, var6, 8);
			}
			if (arg2 == 1) {
				this.method107(var7, var6, 2);
				this.method107(var7, var6 + 1, 32);
			}
			if (arg2 == 2) {
				this.method107(var7, var6, 8);
				this.method107(var7 + 1, var6, 128);
			}
			if (arg2 == 3) {
				this.method107(var7, var6, 32);
				this.method107(var7, var6 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method107(var7, var6, 1);
				this.method107(var7 - 1, var6 - -1, 16);
			}
			if (arg2 == 1) {
				this.method107(var7, var6, 4);
				this.method107(var7 + 1, var6 + 1, 64);
			}
			if (arg2 == 2) {
				this.method107(var7, var6, 16);
				this.method107(var7 + 1, var6 + -1, 1);
			}
			if (arg2 == 3) {
				this.method107(var7, var6, 64);
				this.method107(var7 - 1, var6 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method107(var7, var6, 130);
				this.method107(var7 - 1, var6, 8);
				this.method107(var7, var6 + 1, 32);
			}
			if (arg2 == 1) {
				this.method107(var7, var6, 10);
				this.method107(var7, var6 + 1, 32);
				this.method107(var7 + 1, var6, 128);
			}
			if (arg2 == 2) {
				this.method107(var7, var6, 40);
				this.method107(var7 + 1, var6, 128);
				this.method107(var7, var6 - 1, 2);
			}
			if (arg2 == 3) {
				this.method107(var7, var6, 160);
				this.method107(var7, var6 - 1, 2);
				this.method107(var7 - 1, var6, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method107(var7, var6, 65536);
				this.method107(var7 - 1, var6, 4096);
			}
			if (arg2 == 1) {
				this.method107(var7, var6, 1024);
				this.method107(var7, var6 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method107(var7, var6, 4096);
				this.method107(var7 + 1, var6, 65536);
			}
			if (arg2 == 3) {
				this.method107(var7, var6, 16384);
				this.method107(var7, var6 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method107(var7, var6, 512);
				this.method107(var7 - 1, var6 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method107(var7, var6, 2048);
				this.method107(var7 + 1, var6 - -1, 32768);
			}
			if (arg2 == 2) {
				this.method107(var7, var6, 8192);
				this.method107(var7 + 1, var6 - 1, 512);
			}
			if (arg2 == 3) {
				this.method107(var7, var6, 32768);
				this.method107(var7 - 1, var6 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method107(var7, var6, 66560);
			this.method107(var7 - 1, var6, 4096);
			this.method107(var7, var6 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method107(var7, var6, 5120);
			this.method107(var7, var6 + 1, 16384);
			this.method107(var7 + 1, var6, 65536);
		}
		if (arg2 == 2) {
			this.method107(var7, var6, 20480);
			this.method107(var7 + 1, var6, 65536);
			this.method107(var7, var6 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method107(var7, var6, 81920);
			this.method107(var7, var6 - 1, 1024);
			this.method107(var7 - 1, var6, 4096);
			return;
		}
	}

	@ObfuscatedName("ad.a(BII)V")
	public void method115(int arg0, int arg1) {
		int var3 = arg0 - this.field202;
		int var4 = arg1 - this.field191;
		this.field201[var4][var3] |= 0x200000;
	}

	@ObfuscatedName("ad.a(IIIIIIII)Z")
	public boolean method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 - 1;
		int var9 = arg3 + arg0 - 1;
		if (arg6 >= arg1 && arg6 <= var8 && arg5 >= arg3 && var9 >= arg5) {
			return true;
		} else if (arg1 - 1 == arg6 && arg5 >= arg3 && var9 >= arg5 && (this.field201[arg6 - this.field191][arg5 - this.field202] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (var8 + 1 == arg6 && arg5 >= arg3 && arg5 <= var9 && (this.field201[arg6 - this.field191][arg5 - this.field202] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg5 && arg6 >= arg1 && arg6 <= var8 && (this.field201[arg6 - this.field191][arg5 - this.field202] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return var9 + 1 == arg5 && arg1 <= arg6 && var8 >= arg6 && (this.field201[arg6 - this.field191][arg5 - this.field202] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@ObfuscatedName("ad.a(IZIIIII)V")
	public void method118(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg4 - this.field202;
		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}
		int var9 = arg0 - this.field191;
		int var10 = 256;
		if (arg1) {
			var10 = 131328;
		}
		for (int var11 = var9; var11 < var9 + arg5; var11++) {
			if (var11 >= 0 && var11 < this.field204) {
				for (int var12 = var7; var12 < arg2 + var7; var12++) {
					if (var12 >= 0 && var12 < this.field196) {
						this.method107(var11, var12, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ad.b(IZIIIII)Z")
	public boolean method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg2 == arg3) {
			return true;
		}
		int var7 = arg3 - this.field202;
		int var8 = arg5 - this.field191;
		int var9 = arg0 - this.field191;
		int var10 = arg2 - this.field202;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (var8 - 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var8 == var9 && var10 + 1 == var7) {
					return true;
				}
				if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var8 + 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var8 == var9 && var10 - 1 == var7) {
					return true;
				}
				if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280180) == 0) {
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
				if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280180) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280108) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x1280120) == 0) {
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
				if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x1280120) == 0) {
					return true;
				}
				if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x1280180) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x20) == 0) {
				return true;
			}
			if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x2) == 0) {
				return true;
			}
			if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x8) == 0) {
				return true;
			}
			if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ad.a(IIIB)V")
	public void method120(int arg0, int arg1, int arg2) {
		this.field201[arg2][arg0] &= 16777215 - arg1;
	}

	public CollisionMap(int arg0, int arg1) {
		this.method110();
	}

	@ObfuscatedName("ad.a(IIIIIBI)Z")
	public boolean method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg2) {
			return true;
		}
		int var7 = arg2 - this.field202;
		int var8 = arg3 - this.field191;
		int var9 = arg4 - this.field191;
		int var10 = arg0 - this.field202;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x80) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x8) == 0) {
					return true;
				}
				if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x8) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x80) == 0) {
					return true;
				}
				if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (var8 == var9 && var10 + 1 == var7 && (this.field201[var9][var7] & 0x20) == 0) {
				return true;
			}
			if (var8 == var9 && var10 - 1 == var7 && (this.field201[var9][var7] & 0x2) == 0) {
				return true;
			}
			if (var8 - 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x8) == 0) {
				return true;
			}
			if (var8 + 1 == var9 && var7 == var10 && (this.field201[var9][var7] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}
