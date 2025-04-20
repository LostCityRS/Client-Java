package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.a")
	public byte field1073 = 6;

	@ObfuscatedName("jc.b")
	public byte field1074 = 65;

	@ObfuscatedName("jc.c")
	public int field1075 = 2;

	@ObfuscatedName("jc.d")
	public byte field1076 = 58;

	@ObfuscatedName("jc.e")
	public int field1077 = -162;

	@ObfuscatedName("jc.f")
	public boolean field1078 = true;

	@ObfuscatedName("jc.g")
	public int field1079 = 0;

	@ObfuscatedName("jc.h")
	public int field1080 = 0;

	@ObfuscatedName("jc.i")
	public int field1081;

	@ObfuscatedName("jc.j")
	public int field1082;

	@ObfuscatedName("jc.k")
	public int[][] field1083;

	public CollisionMap(int arg0, boolean arg1, int arg2) {
		if (arg1) {
			throw new NullPointerException();
		}
		this.field1081 = arg2;
		this.field1082 = arg0;
		this.field1083 = new int[this.field1081][this.field1082];
		this.method359((byte) 0);
	}

	@ObfuscatedName("jc.a(B)V")
	public void method359(byte arg0) {
		if (arg0 == 0) {
			boolean var2 = false;
		} else {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		for (int var4 = 0; var4 < this.field1081; var4++) {
			for (int var5 = 0; var5 < this.field1082; var5++) {
				if (var4 == 0 || var5 == 0 || this.field1081 - 1 == var4 || this.field1082 - 1 == var5) {
					this.field1083[var4][var5] = 16777215;
				} else {
					this.field1083[var4][var5] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZII)V")
	public void method360(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg4 >= 0) {
			return;
		}
		int var7 = arg2 - this.field1079;
		int var8 = arg0 - this.field1080;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method363(var7, var8, 128);
				this.method363(var7 - 1, var8, 8);
			}
			if (arg5 == 1) {
				this.method363(var7, var8, 2);
				this.method363(var7, var8 + 1, 32);
			}
			if (arg5 == 2) {
				this.method363(var7, var8, 8);
				this.method363(var7 + 1, var8, 128);
			}
			if (arg5 == 3) {
				this.method363(var7, var8, 32);
				this.method363(var7, var8 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method363(var7, var8, 1);
				this.method363(var7 - 1, var8 + 1, 16);
			}
			if (arg5 == 1) {
				this.method363(var7, var8, 4);
				this.method363(var7 + 1, var8 + 1, 64);
			}
			if (arg5 == 2) {
				this.method363(var7, var8, 16);
				this.method363(var7 + 1, var8 - 1, 1);
			}
			if (arg5 == 3) {
				this.method363(var7, var8, 64);
				this.method363(var7 - 1, var8 - 1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method363(var7, var8, 130);
				this.method363(var7 - 1, var8, 8);
				this.method363(var7, var8 + 1, 32);
			}
			if (arg5 == 1) {
				this.method363(var7, var8, 10);
				this.method363(var7, var8 + 1, 32);
				this.method363(var7 + 1, var8, 128);
			}
			if (arg5 == 2) {
				this.method363(var7, var8, 40);
				this.method363(var7 + 1, var8, 128);
				this.method363(var7, var8 - 1, 2);
			}
			if (arg5 == 3) {
				this.method363(var7, var8, 160);
				this.method363(var7, var8 - 1, 2);
				this.method363(var7 - 1, var8, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method363(var7, var8, 65536);
				this.method363(var7 - 1, var8, 4096);
			}
			if (arg5 == 1) {
				this.method363(var7, var8, 1024);
				this.method363(var7, var8 + 1, 16384);
			}
			if (arg5 == 2) {
				this.method363(var7, var8, 4096);
				this.method363(var7 + 1, var8, 65536);
			}
			if (arg5 == 3) {
				this.method363(var7, var8, 16384);
				this.method363(var7, var8 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method363(var7, var8, 512);
				this.method363(var7 - 1, var8 + 1, 8192);
			}
			if (arg5 == 1) {
				this.method363(var7, var8, 2048);
				this.method363(var7 + 1, var8 + 1, 32768);
			}
			if (arg5 == 2) {
				this.method363(var7, var8, 8192);
				this.method363(var7 + 1, var8 - 1, 512);
			}
			if (arg5 == 3) {
				this.method363(var7, var8, 32768);
				this.method363(var7 - 1, var8 - 1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method363(var7, var8, 66560);
			this.method363(var7 - 1, var8, 4096);
			this.method363(var7, var8 + 1, 16384);
		}
		if (arg5 == 1) {
			this.method363(var7, var8, 5120);
			this.method363(var7, var8 + 1, 16384);
			this.method363(var7 + 1, var8, 65536);
		}
		if (arg5 == 2) {
			this.method363(var7, var8, 20480);
			this.method363(var7 + 1, var8, 65536);
			this.method363(var7, var8 - 1, 1024);
		}
		if (arg5 == 3) {
			this.method363(var7, var8, 81920);
			this.method363(var7, var8 - 1, 1024);
			this.method363(var7 - 1, var8, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(ZIIIZII)V")
	public void method361(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
		if (!arg4) {
			return;
		}
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg2 - this.field1079;
		int var10 = arg6 - this.field1080;
		if (arg1 == 1 || arg1 == 3) {
			int var11 = arg5;
			arg5 = arg3;
			arg3 = var11;
		}
		for (int var12 = var9; var12 < arg5 + var9; var12++) {
			if (var12 >= 0 && var12 < this.field1081) {
				for (int var13 = var10; var13 < arg3 + var10; var13++) {
					if (var13 >= 0 && var13 < this.field1082) {
						this.method363(var12, var13, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method362(int arg0, int arg1, int arg2) {
		int var4 = arg2 - this.field1079;
		int var5 = arg0 - this.field1080;
		if (arg1 < 8 || arg1 > 8) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		this.field1083[var4][var5] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method363(int arg0, int arg1, int arg2) {
		this.field1083[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(ZIIIII)V")
	public void method364(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg5 - this.field1079;
		int var8 = arg1 - this.field1080;
		int var9 = 4 / arg4;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method366(var8, (byte) 3, var7, 128);
				this.method366(var8, (byte) 3, var7 - 1, 8);
			}
			if (arg2 == 1) {
				this.method366(var8, (byte) 3, var7, 2);
				this.method366(var8 + 1, (byte) 3, var7, 32);
			}
			if (arg2 == 2) {
				this.method366(var8, (byte) 3, var7, 8);
				this.method366(var8, (byte) 3, var7 + 1, 128);
			}
			if (arg2 == 3) {
				this.method366(var8, (byte) 3, var7, 32);
				this.method366(var8 - 1, (byte) 3, var7, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method366(var8, (byte) 3, var7, 1);
				this.method366(var8 + 1, (byte) 3, var7 - 1, 16);
			}
			if (arg2 == 1) {
				this.method366(var8, (byte) 3, var7, 4);
				this.method366(var8 + 1, (byte) 3, var7 + 1, 64);
			}
			if (arg2 == 2) {
				this.method366(var8, (byte) 3, var7, 16);
				this.method366(var8 - 1, (byte) 3, var7 + 1, 1);
			}
			if (arg2 == 3) {
				this.method366(var8, (byte) 3, var7, 64);
				this.method366(var8 - 1, (byte) 3, var7 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method366(var8, (byte) 3, var7, 130);
				this.method366(var8, (byte) 3, var7 - 1, 8);
				this.method366(var8 + 1, (byte) 3, var7, 32);
			}
			if (arg2 == 1) {
				this.method366(var8, (byte) 3, var7, 10);
				this.method366(var8 + 1, (byte) 3, var7, 32);
				this.method366(var8, (byte) 3, var7 + 1, 128);
			}
			if (arg2 == 2) {
				this.method366(var8, (byte) 3, var7, 40);
				this.method366(var8, (byte) 3, var7 + 1, 128);
				this.method366(var8 - 1, (byte) 3, var7, 2);
			}
			if (arg2 == 3) {
				this.method366(var8, (byte) 3, var7, 160);
				this.method366(var8 - 1, (byte) 3, var7, 2);
				this.method366(var8, (byte) 3, var7 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method366(var8, (byte) 3, var7, 65536);
				this.method366(var8, (byte) 3, var7 - 1, 4096);
			}
			if (arg2 == 1) {
				this.method366(var8, (byte) 3, var7, 1024);
				this.method366(var8 + 1, (byte) 3, var7, 16384);
			}
			if (arg2 == 2) {
				this.method366(var8, (byte) 3, var7, 4096);
				this.method366(var8, (byte) 3, var7 + 1, 65536);
			}
			if (arg2 == 3) {
				this.method366(var8, (byte) 3, var7, 16384);
				this.method366(var8 - 1, (byte) 3, var7, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method366(var8, (byte) 3, var7, 512);
				this.method366(var8 + 1, (byte) 3, var7 - 1, 8192);
			}
			if (arg2 == 1) {
				this.method366(var8, (byte) 3, var7, 2048);
				this.method366(var8 + 1, (byte) 3, var7 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method366(var8, (byte) 3, var7, 8192);
				this.method366(var8 - 1, (byte) 3, var7 + 1, 512);
			}
			if (arg2 == 3) {
				this.method366(var8, (byte) 3, var7, 32768);
				this.method366(var8 - 1, (byte) 3, var7 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method366(var8, (byte) 3, var7, 66560);
			this.method366(var8, (byte) 3, var7 - 1, 4096);
			this.method366(var8 + 1, (byte) 3, var7, 16384);
		}
		if (arg2 == 1) {
			this.method366(var8, (byte) 3, var7, 5120);
			this.method366(var8 + 1, (byte) 3, var7, 16384);
			this.method366(var8, (byte) 3, var7 + 1, 65536);
		}
		if (arg2 == 2) {
			this.method366(var8, (byte) 3, var7, 20480);
			this.method366(var8, (byte) 3, var7 + 1, 65536);
			this.method366(var8 - 1, (byte) 3, var7, 1024);
		}
		if (arg2 == 3) {
			this.method366(var8, (byte) 3, var7, 81920);
			this.method366(var8 - 1, (byte) 3, var7, 1024);
			this.method366(var8, (byte) 3, var7 - 1, 4096);
			return;
		}
	}

	@ObfuscatedName("jc.a(IIIZIZI)V")
	public void method365(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
		if (!arg5) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		int var9 = 256;
		if (arg3) {
			var9 += 131072;
		}
		int var10 = arg2 - this.field1079;
		int var11 = arg1 - this.field1080;
		if (arg6 == 1 || arg6 == 3) {
			int var12 = arg0;
			arg0 = arg4;
			arg4 = var12;
		}
		for (int var13 = var10; var13 < arg0 + var10; var13++) {
			if (var13 >= 0 && var13 < this.field1081) {
				for (int var14 = var11; var14 < arg4 + var11; var14++) {
					if (var14 >= 0 && var14 < this.field1082) {
						this.method366(var14, (byte) 3, var13, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBII)V")
	public void method366(int arg0, byte arg1, int arg2, int arg3) {
		this.field1083[arg2][arg0] &= 16777215 - arg3;
		if (arg1 == 3) {
			;
		}
	}

	@ObfuscatedName("jc.c(III)V")
	public void method367(int arg0, int arg1, int arg2) {
		int var4 = arg2 - this.field1079;
		if (arg1 < 0) {
			int var5 = arg0 - this.field1080;
			this.field1083[var4][var5] &= 0xDFFFFF;
		}
	}

	@ObfuscatedName("jc.a(IZIIIII)Z")
	public boolean method368(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == arg5 && arg3 == arg4) {
			return true;
		}
		int var8 = arg5 - this.field1079;
		if (arg1) {
			this.field1077 = 421;
		}
		int var9 = arg4 - this.field1080;
		int var10 = arg0 - this.field1079;
		int var11 = arg3 - this.field1080;
		if (arg2 == 0) {
			if (arg6 == 0) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 1) {
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280180) == 0) {
					return true;
				}
			} else if (arg6 == 2) {
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 3) {
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280180) == 0) {
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
				if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 1) {
				if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x280102) == 0) {
					return true;
				}
			} else if (arg6 == 2) {
				if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280108) == 0) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x280120) == 0) {
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
				if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x280120) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x280180) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x2) == 0) {
				return true;
			}
			if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x8) == 0) {
				return true;
			}
			if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("jc.a(IIIZIII)Z")
	public boolean method369(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
		if (!arg3) {
			throw new NullPointerException();
		} else if (arg1 == arg2 && arg0 == arg6) {
			return true;
		} else {
			int var8 = arg1 - this.field1079;
			int var9 = arg0 - this.field1080;
			int var10 = arg2 - this.field1079;
			int var11 = arg6 - this.field1080;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (var8 == var10 && var11 + 1 == var9 && (this.field1083[var8][var9] & 0x20) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.field1083[var8][var9] & 0x2) == 0) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.field1083[var8][var9] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("jc.a(IIIIIIBI)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
		if (this.field1073 != arg6) {
			this.field1078 = !this.field1078;
		}
		int var9 = arg0 + arg2 - 1;
		int var10 = arg3 + arg7 - 1;
		if (arg1 >= arg2 && arg1 <= var9 && arg5 >= arg3 && arg5 <= var10) {
			return true;
		} else if (arg2 - 1 == arg1 && arg5 >= arg3 && arg5 <= var10 && (this.field1083[arg1 - this.field1079][arg5 - this.field1080] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (var9 + 1 == arg1 && arg5 >= arg3 && arg5 <= var10 && (this.field1083[arg1 - this.field1079][arg5 - this.field1080] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg5 && arg1 >= arg2 && arg1 <= var9 && (this.field1083[arg1 - this.field1079][arg5 - this.field1080] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return var10 + 1 == arg5 && arg1 >= arg2 && arg1 <= var9 && (this.field1083[arg1 - this.field1079][arg5 - this.field1080] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}
}
