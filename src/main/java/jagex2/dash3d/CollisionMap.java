package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.a")
	public boolean field1065 = true;

	@ObfuscatedName("jc.b")
	public boolean field1066 = true;

	@ObfuscatedName("jc.c")
	public boolean field1067 = true;

	@ObfuscatedName("jc.d")
	public boolean field1068 = false;

	@ObfuscatedName("jc.e")
	public int field1069 = -32176;

	@ObfuscatedName("jc.f")
	public int field1070 = 256;

	@ObfuscatedName("jc.g")
	public int field1071 = 0;

	@ObfuscatedName("jc.h")
	public int field1072 = 0;

	@ObfuscatedName("jc.i")
	public int field1073;

	@ObfuscatedName("jc.j")
	public int field1074;

	@ObfuscatedName("jc.k")
	public int[][] field1075;

	public CollisionMap(int arg0, int arg1, int arg2) {
		this.field1073 = arg2;
		this.field1074 = arg1;
		if (arg0 < 3 || arg0 > 3) {
			this.field1070 = -111;
		}
		this.field1075 = new int[this.field1073][this.field1074];
		this.method361(true);
	}

	@ObfuscatedName("jc.a(Z)V")
	public void method361(boolean arg0) {
		if (!arg0) {
			return;
		}
		for (int var2 = 0; var2 < this.field1073; var2++) {
			for (int var3 = 0; var3 < this.field1074; var3++) {
				if (var2 == 0 || var3 == 0 || var2 == this.field1073 - 1 || var3 == this.field1074 - 1) {
					this.field1075[var2][var3] = 16777215;
				} else {
					this.field1075[var2][var3] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZI)V")
	public void method362(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		if (arg2 < 9 || arg2 > 9) {
			return;
		}
		int var7 = arg0 - this.field1071;
		int var8 = arg1 - this.field1072;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method365(var7, var8, 128);
				this.method365(var7 - 1, var8, 8);
			}
			if (arg3 == 1) {
				this.method365(var7, var8, 2);
				this.method365(var7, var8 + 1, 32);
			}
			if (arg3 == 2) {
				this.method365(var7, var8, 8);
				this.method365(var7 + 1, var8, 128);
			}
			if (arg3 == 3) {
				this.method365(var7, var8, 32);
				this.method365(var7, var8 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method365(var7, var8, 1);
				this.method365(var7 - 1, var8 + 1, 16);
			}
			if (arg3 == 1) {
				this.method365(var7, var8, 4);
				this.method365(var7 + 1, var8 + 1, 64);
			}
			if (arg3 == 2) {
				this.method365(var7, var8, 16);
				this.method365(var7 + 1, var8 - 1, 1);
			}
			if (arg3 == 3) {
				this.method365(var7, var8, 64);
				this.method365(var7 - 1, var8 - 1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.method365(var7, var8, 130);
				this.method365(var7 - 1, var8, 8);
				this.method365(var7, var8 + 1, 32);
			}
			if (arg3 == 1) {
				this.method365(var7, var8, 10);
				this.method365(var7, var8 + 1, 32);
				this.method365(var7 + 1, var8, 128);
			}
			if (arg3 == 2) {
				this.method365(var7, var8, 40);
				this.method365(var7 + 1, var8, 128);
				this.method365(var7, var8 - 1, 2);
			}
			if (arg3 == 3) {
				this.method365(var7, var8, 160);
				this.method365(var7, var8 - 1, 2);
				this.method365(var7 - 1, var8, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method365(var7, var8, 65536);
				this.method365(var7 - 1, var8, 4096);
			}
			if (arg3 == 1) {
				this.method365(var7, var8, 1024);
				this.method365(var7, var8 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method365(var7, var8, 4096);
				this.method365(var7 + 1, var8, 65536);
			}
			if (arg3 == 3) {
				this.method365(var7, var8, 16384);
				this.method365(var7, var8 - 1, 1024);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method365(var7, var8, 512);
				this.method365(var7 - 1, var8 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method365(var7, var8, 2048);
				this.method365(var7 + 1, var8 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method365(var7, var8, 8192);
				this.method365(var7 + 1, var8 - 1, 512);
			}
			if (arg3 == 3) {
				this.method365(var7, var8, 32768);
				this.method365(var7 - 1, var8 - 1, 2048);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method365(var7, var8, 66560);
			this.method365(var7 - 1, var8, 4096);
			this.method365(var7, var8 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method365(var7, var8, 5120);
			this.method365(var7, var8 + 1, 16384);
			this.method365(var7 + 1, var8, 65536);
		}
		if (arg3 == 2) {
			this.method365(var7, var8, 20480);
			this.method365(var7 + 1, var8, 65536);
			this.method365(var7, var8 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method365(var7, var8, 81920);
			this.method365(var7, var8 - 1, 1024);
			this.method365(var7 - 1, var8, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(ZIIIIII)V")
	public void method363(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg6 - this.field1071;
		if (arg1 != 3) {
			return;
		}
		int var10 = arg2 - this.field1072;
		if (arg3 == 1 || arg3 == 3) {
			int var11 = arg4;
			arg4 = arg5;
			arg5 = var11;
		}
		for (int var12 = var9; var12 < var9 + arg4; var12++) {
			if (var12 >= 0 && var12 < this.field1073) {
				for (int var13 = var10; var13 < var10 + arg5; var13++) {
					if (var13 >= 0 && var13 < this.field1074) {
						this.method365(var12, var13, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method364(int arg0, int arg1, int arg2) {
		int var4 = arg1 - this.field1071;
		if (arg2 < 4 || arg2 > 4) {
			this.field1066 = !this.field1066;
		}
		int var5 = arg0 - this.field1072;
		this.field1075[var4][var5] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method365(int arg0, int arg1, int arg2) {
		this.field1075[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IBIIIZ)V")
	public void method366(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = arg2 - this.field1071;
		int var8 = arg4 - this.field1072;
		if (arg1 != 4) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method368(0, var8, 128, var7);
				this.method368(0, var8, 8, var7 - 1);
			}
			if (arg3 == 1) {
				this.method368(0, var8, 2, var7);
				this.method368(0, var8 + 1, 32, var7);
			}
			if (arg3 == 2) {
				this.method368(0, var8, 8, var7);
				this.method368(0, var8, 128, var7 + 1);
			}
			if (arg3 == 3) {
				this.method368(0, var8, 32, var7);
				this.method368(0, var8 - 1, 2, var7);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method368(0, var8, 1, var7);
				this.method368(0, var8 + 1, 16, var7 - 1);
			}
			if (arg3 == 1) {
				this.method368(0, var8, 4, var7);
				this.method368(0, var8 + 1, 64, var7 + 1);
			}
			if (arg3 == 2) {
				this.method368(0, var8, 16, var7);
				this.method368(0, var8 - 1, 1, var7 + 1);
			}
			if (arg3 == 3) {
				this.method368(0, var8, 64, var7);
				this.method368(0, var8 - 1, 4, var7 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method368(0, var8, 130, var7);
				this.method368(0, var8, 8, var7 - 1);
				this.method368(0, var8 + 1, 32, var7);
			}
			if (arg3 == 1) {
				this.method368(0, var8, 10, var7);
				this.method368(0, var8 + 1, 32, var7);
				this.method368(0, var8, 128, var7 + 1);
			}
			if (arg3 == 2) {
				this.method368(0, var8, 40, var7);
				this.method368(0, var8, 128, var7 + 1);
				this.method368(0, var8 - 1, 2, var7);
			}
			if (arg3 == 3) {
				this.method368(0, var8, 160, var7);
				this.method368(0, var8 - 1, 2, var7);
				this.method368(0, var8, 8, var7 - 1);
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method368(0, var8, 65536, var7);
				this.method368(0, var8, 4096, var7 - 1);
			}
			if (arg3 == 1) {
				this.method368(0, var8, 1024, var7);
				this.method368(0, var8 + 1, 16384, var7);
			}
			if (arg3 == 2) {
				this.method368(0, var8, 4096, var7);
				this.method368(0, var8, 65536, var7 + 1);
			}
			if (arg3 == 3) {
				this.method368(0, var8, 16384, var7);
				this.method368(0, var8 - 1, 1024, var7);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method368(0, var8, 512, var7);
				this.method368(0, var8 + 1, 8192, var7 - 1);
			}
			if (arg3 == 1) {
				this.method368(0, var8, 2048, var7);
				this.method368(0, var8 + 1, 32768, var7 + 1);
			}
			if (arg3 == 2) {
				this.method368(0, var8, 8192, var7);
				this.method368(0, var8 - 1, 512, var7 + 1);
			}
			if (arg3 == 3) {
				this.method368(0, var8, 32768, var7);
				this.method368(0, var8 - 1, 2048, var7 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method368(0, var8, 66560, var7);
			this.method368(0, var8, 4096, var7 - 1);
			this.method368(0, var8 + 1, 16384, var7);
		}
		if (arg3 == 1) {
			this.method368(0, var8, 5120, var7);
			this.method368(0, var8 + 1, 16384, var7);
			this.method368(0, var8, 65536, var7 + 1);
		}
		if (arg3 == 2) {
			this.method368(0, var8, 20480, var7);
			this.method368(0, var8, 65536, var7 + 1);
			this.method368(0, var8 - 1, 1024, var7);
		}
		if (arg3 == 3) {
			this.method368(0, var8, 81920, var7);
			this.method368(0, var8 - 1, 1024, var7);
			this.method368(0, var8, 4096, var7 - 1);
			return;
		}
	}

	@ObfuscatedName("jc.a(ZIIBIII)V")
	public void method367(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg6 - this.field1071;
		int var10 = arg2 - this.field1072;
		if (arg3 != 124) {
			this.field1065 = !this.field1065;
		}
		if (arg5 == 1 || arg5 == 3) {
			int var11 = arg1;
			arg1 = arg4;
			arg4 = var11;
		}
		for (int var12 = var9; var12 < var9 + arg1; var12++) {
			if (var12 >= 0 && var12 < this.field1073) {
				for (int var13 = var10; var13 < var10 + arg4; var13++) {
					if (var13 >= 0 && var13 < this.field1074) {
						this.method368(0, var13, var8, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method368(int arg0, int arg1, int arg2, int arg3) {
		this.field1075[arg3][arg1] &= 16777215 - arg2;
		if (arg0 != 0) {
			this.field1068 = !this.field1068;
		}
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void method369(boolean arg0, int arg1, int arg2) {
		int var4 = arg2 - this.field1071;
		int var5 = arg1 - this.field1072;
		this.field1075[var4][var5] &= 0xDFFFFF;
		if (!arg0) {
			;
		}
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 == arg2 && arg3 == arg4) {
			return true;
		}
		int var8 = arg6 - this.field1071;
		if (arg0 <= 0) {
			this.field1066 = !this.field1066;
		}
		int var9 = arg3 - this.field1072;
		int var10 = arg2 - this.field1071;
		int var11 = arg4 - this.field1072;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (var8 == var10 - 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var8 == var10 && var9 == var11 + 1) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var8 == var10 + 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (var8 == var10 && var9 == var11 - 1) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280180) == 0) {
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
				if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x280120) == 0) {
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
				if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x2) == 0) {
				return true;
			}
			if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x8) == 0) {
				return true;
			}
			if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.b(ZIIIIII)Z")
	public boolean method371(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (!arg0) {
			throw new NullPointerException();
		} else if (arg5 == arg1 && arg2 == arg6) {
			return true;
		} else {
			int var8 = arg5 - this.field1071;
			int var9 = arg2 - this.field1072;
			int var10 = arg1 - this.field1071;
			int var11 = arg6 - this.field1072;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (var8 == var10 && var9 == var11 + 1 && (this.field1075[var8][var9] & 0x20) == 0) {
					return true;
				}
				if (var8 == var10 && var9 == var11 - 1 && (this.field1075[var8][var9] & 0x2) == 0) {
					return true;
				}
				if (var8 == var10 - 1 && var9 == var11 && (this.field1075[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var8 == var10 + 1 && var9 == var11 && (this.field1075[var8][var9] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg6 <= 0) {
			this.field1069 = -76;
		}
		int var9 = arg3 + arg0 - 1;
		int var10 = arg7 + arg5 - 1;
		if (arg1 >= arg3 && arg1 <= var9 && arg4 >= arg7 && arg4 <= var10) {
			return true;
		} else if (arg1 == arg3 - 1 && arg4 >= arg7 && arg4 <= var10 && (this.field1075[arg1 - this.field1071][arg4 - this.field1072] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg1 == var9 + 1 && arg4 >= arg7 && arg4 <= var10 && (this.field1075[arg1 - this.field1071][arg4 - this.field1072] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg7 - 1 && arg1 >= arg3 && arg1 <= var9 && (this.field1075[arg1 - this.field1071][arg4 - this.field1072] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == var10 + 1 && arg1 >= arg3 && arg1 <= var9 && (this.field1075[arg1 - this.field1071][arg4 - this.field1072] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}
}
