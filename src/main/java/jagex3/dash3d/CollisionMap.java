package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("qf")
public final class CollisionMap {

	@ObfuscatedName("qf.c")
	public static int[] field2779 = new int[32];

	@ObfuscatedName("qf.i")
	public final int field2785 = 104;

	@ObfuscatedName("qf.o")
	public final int field2791 = 0;

	@ObfuscatedName("qf.t")
	public final int field2796 = 0;

	@ObfuscatedName("qf.v")
	public final int field2798 = 104;

	@ObfuscatedName("qf.I")
	public final int[][] field2811 = new int[this.field2785][this.field2798];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field2779[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public CollisionMap(int arg0, int arg1) {
		this.method923();
	}

	@ObfuscatedName("qf.a(IZIIIB)V")
	public void method914(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		int var6 = arg3 - this.field2796;
		int var7 = arg2 - this.field2791;
		int var8 = 256;
		if (arg1) {
			var8 = 131328;
		}
		for (int var9 = var7; var9 < arg4 + var7; var9++) {
			if (var9 >= 0 && this.field2785 > var9) {
				for (int var10 = var6; var10 < var6 + arg0; var10++) {
					if (var10 >= 0 && this.field2798 > var10) {
						this.method929(var8, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("qf.a(IIIIIII)Z")
	public boolean method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg0 && arg5 == arg4) {
			return true;
		}
		int var7 = arg4 - this.field2796;
		int var8 = arg3 - this.field2791;
		int var9 = arg5 - this.field2796;
		int var10 = arg0 - this.field2791;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (var10 + 1 == var8 && var7 == var9 && (this.field2811[var8][var7] & 0x80) == 0) {
					return true;
				}
				if (var10 == var8 && var9 - 1 == var7 && (this.field2811[var8][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (var10 - 1 == var8 && var9 == var7 && (this.field2811[var8][var7] & 0x8) == 0) {
					return true;
				}
				if (var10 == var8 && var9 - 1 == var7 && (this.field2811[var8][var7] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (var10 - 1 == var8 && var7 == var9 && (this.field2811[var8][var7] & 0x8) == 0) {
					return true;
				}
				if (var10 == var8 && var7 == var9 + 1 && (this.field2811[var8][var7] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (var8 == var10 + 1 && var7 == var9 && (this.field2811[var8][var7] & 0x80) == 0) {
					return true;
				}
				if (var8 == var10 && var7 == var9 + 1 && (this.field2811[var8][var7] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (var10 == var8 && var9 + 1 == var7 && (this.field2811[var8][var7] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var9 - 1 == var7 && (this.field2811[var8][var7] & 0x2) == 0) {
				return true;
			}
			if (var8 == var10 - 1 && var9 == var7 && (this.field2811[var8][var7] & 0x8) == 0) {
				return true;
			}
			if (var10 + 1 == var8 && var7 == var9 && (this.field2811[var8][var7] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("qf.a(III)V")
	public void method916(int arg0, int arg1) {
		int var3 = arg0 - this.field2796;
		int var4 = arg1 - this.field2791;
		this.field2811[var4][var3] &= 0xFFFBFFFF;
	}

	@ObfuscatedName("qf.b(III)V")
	public void method917(int arg0, int arg1) {
		int var3 = arg0 - this.field2791;
		int var4 = arg1 - this.field2796;
		this.field2811[var3][var4] |= 0x200000;
	}

	@ObfuscatedName("qf.a(IIIIIIIB)Z")
	public boolean method919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg5 - 1;
		int var9 = arg2 + arg4 - 1;
		if (arg3 >= arg5 && var8 >= arg3 && arg4 <= arg0 && arg0 <= var9) {
			return true;
		} else if (arg5 - 1 == arg3 && arg4 <= arg0 && var9 >= arg0 && (this.field2811[arg3 - this.field2791][arg0 - this.field2796] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == var8 + 1 && arg0 >= arg4 && var9 >= arg0 && (this.field2811[arg3 - this.field2791][arg0 - this.field2796] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg4 - 1 && arg5 <= arg3 && arg3 <= var8 && (this.field2811[arg3 - this.field2791][arg0 - this.field2796] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == var9 + 1 && arg5 <= arg3 && arg3 <= var8 && (this.field2811[arg3 - this.field2791][arg0 - this.field2796] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@ObfuscatedName("qf.a(ZIIZII)V")
	public void method920(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg2 - this.field2791;
		int var7 = arg3 - this.field2796;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method929(128, var7, var6);
				this.method929(8, var7, var6 - 1);
			}
			if (arg4 == 1) {
				this.method929(2, var7, var6);
				this.method929(32, var7 + 1, var6);
			}
			if (arg4 == 2) {
				this.method929(8, var7, var6);
				this.method929(128, var7, var6 + 1);
			}
			if (arg4 == 3) {
				this.method929(32, var7, var6);
				this.method929(2, var7 - 1, var6);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method929(1, var7, var6);
				this.method929(16, var7 + 1, var6 + -1);
			}
			if (arg4 == 1) {
				this.method929(4, var7, var6);
				this.method929(64, var7 + 1, var6 - -1);
			}
			if (arg4 == 2) {
				this.method929(16, var7, var6);
				this.method929(1, var7 - 1, var6 + 1);
			}
			if (arg4 == 3) {
				this.method929(64, var7, var6);
				this.method929(4, var7 - 1, var6 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method929(130, var7, var6);
				this.method929(8, var7, var6 - 1);
				this.method929(32, var7 + 1, var6);
			}
			if (arg4 == 1) {
				this.method929(10, var7, var6);
				this.method929(32, var7 + 1, var6);
				this.method929(128, var7, var6 + 1);
			}
			if (arg4 == 2) {
				this.method929(40, var7, var6);
				this.method929(128, var7, var6 + 1);
				this.method929(2, var7 - 1, var6);
			}
			if (arg4 == 3) {
				this.method929(160, var7, var6);
				this.method929(2, var7 - 1, var6);
				this.method929(8, var7, var6 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method929(65536, var7, var6);
				this.method929(4096, var7, var6 - 1);
			}
			if (arg4 == 1) {
				this.method929(1024, var7, var6);
				this.method929(16384, var7 + 1, var6);
			}
			if (arg4 == 2) {
				this.method929(4096, var7, var6);
				this.method929(65536, var7, var6 + 1);
			}
			if (arg4 == 3) {
				this.method929(16384, var7, var6);
				this.method929(1024, var7 - 1, var6);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method929(512, var7, var6);
				this.method929(8192, var7 + 1, var6 + -1);
			}
			if (arg4 == 1) {
				this.method929(2048, var7, var6);
				this.method929(32768, var7 + 1, var6 + 1);
			}
			if (arg4 == 2) {
				this.method929(8192, var7, var6);
				this.method929(512, var7 - 1, var6 + 1);
			}
			if (arg4 == 3) {
				this.method929(32768, var7, var6);
				this.method929(2048, var7 - 1, var6 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method929(66560, var7, var6);
			this.method929(4096, var7, var6 - 1);
			this.method929(16384, var7 + 1, var6);
		}
		if (arg4 == 1) {
			this.method929(5120, var7, var6);
			this.method929(16384, var7 + 1, var6);
			this.method929(65536, var7, var6 + 1);
		}
		if (arg4 == 2) {
			this.method929(20480, var7, var6);
			this.method929(65536, var7, var6 + 1);
			this.method929(1024, var7 - 1, var6);
		}
		if (arg4 == 3) {
			this.method929(81920, var7, var6);
			this.method929(1024, var7 - 1, var6);
			this.method929(4096, var7, var6 - 1);
			return;
		}
	}

	@ObfuscatedName("qf.a(IIIZIZ)V")
	public void method921(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		int var6 = arg0 - this.field2791;
		int var7 = arg3 - this.field2796;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method928(var7, var6, 128);
				this.method928(var7, var6 - 1, 8);
			}
			if (arg1 == 1) {
				this.method928(var7, var6, 2);
				this.method928(var7 + 1, var6, 32);
			}
			if (arg1 == 2) {
				this.method928(var7, var6, 8);
				this.method928(var7, var6 + 1, 128);
			}
			if (arg1 == 3) {
				this.method928(var7, var6, 32);
				this.method928(var7 - 1, var6, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method928(var7, var6, 1);
				this.method928(var7 + 1, var6 + -1, 16);
			}
			if (arg1 == 1) {
				this.method928(var7, var6, 4);
				this.method928(var7 + 1, var6 + 1, 64);
			}
			if (arg1 == 2) {
				this.method928(var7, var6, 16);
				this.method928(var7 - 1, var6 - -1, 1);
			}
			if (arg1 == 3) {
				this.method928(var7, var6, 64);
				this.method928(var7 - 1, var6 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method928(var7, var6, 130);
				this.method928(var7, var6 - 1, 8);
				this.method928(var7 + 1, var6, 32);
			}
			if (arg1 == 1) {
				this.method928(var7, var6, 10);
				this.method928(var7 + 1, var6, 32);
				this.method928(var7, var6 + 1, 128);
			}
			if (arg1 == 2) {
				this.method928(var7, var6, 40);
				this.method928(var7, var6 + 1, 128);
				this.method928(var7 - 1, var6, 2);
			}
			if (arg1 == 3) {
				this.method928(var7, var6, 160);
				this.method928(var7 - 1, var6, 2);
				this.method928(var7, var6 - 1, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method928(var7, var6, 65536);
				this.method928(var7, var6 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method928(var7, var6, 1024);
				this.method928(var7 + 1, var6, 16384);
			}
			if (arg1 == 2) {
				this.method928(var7, var6, 4096);
				this.method928(var7, var6 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method928(var7, var6, 16384);
				this.method928(var7 - 1, var6, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method928(var7, var6, 512);
				this.method928(var7 + 1, var6 - 1, 8192);
			}
			if (arg1 == 1) {
				this.method928(var7, var6, 2048);
				this.method928(var7 + 1, var6 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method928(var7, var6, 8192);
				this.method928(var7 - 1, var6 + 1, 512);
			}
			if (arg1 == 3) {
				this.method928(var7, var6, 32768);
				this.method928(var7 - 1, var6 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method928(var7, var6, 66560);
			this.method928(var7, var6 - 1, 4096);
			this.method928(var7 + 1, var6, 16384);
		}
		if (arg1 == 1) {
			this.method928(var7, var6, 5120);
			this.method928(var7 + 1, var6, 16384);
			this.method928(var7, var6 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method928(var7, var6, 20480);
			this.method928(var7, var6 + 1, 65536);
			this.method928(var7 - 1, var6, 1024);
		}
		if (arg1 == 3) {
			this.method928(var7, var6, 81920);
			this.method928(var7 - 1, var6, 1024);
			this.method928(var7, var6 - 1, 4096);
			return;
		}
	}

	@ObfuscatedName("qf.b(I)V")
	public void method923() {
		for (int var1 = 0; var1 < this.field2785; var1++) {
			for (int var2 = 0; var2 < this.field2798; var2++) {
				if (var1 == 0 || var2 == 0 || this.field2785 - 5 <= var1 || var2 >= this.field2798 - 5) {
					this.field2811[var1][var2] = 16777215;
				} else {
					this.field2811[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("qf.a(IIIIZII)V")
	public void method925(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = arg2 - this.field2796;
		int var8 = 256;
		if (arg3) {
			var8 = 131328;
		}
		if (arg4 == 1 || arg4 == 3) {
			int var9 = arg1;
			arg1 = arg5;
			arg5 = var9;
		}
		int var10 = arg0 - this.field2791;
		for (int var11 = var10; var11 < var10 + arg1; var11++) {
			if (var11 >= 0 && this.field2785 > var11) {
				for (int var12 = var7; var12 < arg5 + var7; var12++) {
					if (var12 >= 0 && this.field2798 > var12) {
						this.method928(var12, var11, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("qf.a(BIII)V")
	public void method928(int arg0, int arg1, int arg2) {
		this.field2811[arg1][arg0] &= ~arg2;
	}

	@ObfuscatedName("qf.a(IIBI)V")
	public void method929(int arg0, int arg1, int arg2) {
		this.field2811[arg2][arg1] |= arg0;
	}

	@ObfuscatedName("qf.b(IIIIIII)Z")
	public boolean method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == arg3 && arg1 == arg2) {
			return true;
		}
		int var7 = arg5 - this.field2791;
		int var8 = arg2 - this.field2796;
		int var9 = arg1 - this.field2796;
		int var10 = arg3 - this.field2791;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (var10 - 1 == var7 && var9 == var8) {
					return true;
				}
				if (var10 == var7 && var9 + 1 == var8 && (this.field2811[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 - 1 && (this.field2811[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (var7 == var10 && var8 == var9 + 1) {
					return true;
				}
				if (var10 - 1 == var7 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var7 == var10 + 1 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (var7 == var10 + 1 && var9 == var8) {
					return true;
				}
				if (var10 == var7 && var9 + 1 == var8 && (this.field2811[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 - 1 && (this.field2811[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (var7 == var10 && var9 - 1 == var8) {
					return true;
				}
				if (var10 - 1 == var7 && var9 == var8 && (this.field2811[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var10 + 1 == var7 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0180) == 0) {
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
				if (var10 + 1 == var7 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
				if (var10 == var7 && var9 - 1 == var8 && (this.field2811[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (var7 == var10 - 1 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 + 1) {
					return true;
				}
				if (var10 + 1 == var7 && var8 == var9) {
					return true;
				}
				if (var7 == var10 && var8 == var9 - 1 && (this.field2811[var7][var8] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (var7 == var10 - 1 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0108) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 + 1 && (this.field2811[var7][var8] & 0x12C0120) == 0) {
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
				if (var7 == var10 && var9 + 1 == var8 && (this.field2811[var7][var8] & 0x12C0120) == 0) {
					return true;
				}
				if (var7 == var10 + 1 && var8 == var9 && (this.field2811[var7][var8] & 0x12C0180) == 0) {
					return true;
				}
				if (var10 == var7 && var8 == var9 - 1) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (var7 == var10 && var9 + 1 == var8 && (this.field2811[var7][var8] & 0x20) == 0) {
				return true;
			}
			if (var7 == var10 && var8 == var9 - 1 && (this.field2811[var7][var8] & 0x2) == 0) {
				return true;
			}
			if (var7 == var10 - 1 && var9 == var8 && (this.field2811[var7][var8] & 0x8) == 0) {
				return true;
			}
			if (var7 == var10 + 1 && var9 == var8 && (this.field2811[var7][var8] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("qf.a(IIZ)V")
	public void method931(int arg0, int arg1) {
		int var3 = arg1 - this.field2796;
		int var4 = arg0 - this.field2791;
		this.field2811[var4][var3] |= 0x40000;
	}
}
