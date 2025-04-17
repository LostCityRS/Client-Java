package deob;

@ObfuscatedName("hc")
public class ObjType {

	@ObfuscatedName("hc.a")
	public static int field1020 = 4;

	@ObfuscatedName("hc.b")
	public static int field1021 = 2;

	@ObfuscatedName("hc.c")
	public boolean field1022 = true;

	@ObfuscatedName("hc.d")
	public static int field1023;

	@ObfuscatedName("hc.e")
	public static int[] field1024;

	@ObfuscatedName("hc.f")
	public static Packet field1025;

	@ObfuscatedName("hc.g")
	public static ObjType[] field1026;

	@ObfuscatedName("hc.h")
	public static int field1027;

	@ObfuscatedName("hc.i")
	public static boolean field1028 = true;

	@ObfuscatedName("hc.j")
	public int field1029 = -1;

	@ObfuscatedName("hc.k")
	public int field1030;

	@ObfuscatedName("hc.l")
	public String field1031;

	@ObfuscatedName("hc.m")
	public byte[] field1032;

	@ObfuscatedName("hc.n")
	public int[] field1033;

	@ObfuscatedName("hc.o")
	public int[] field1034;

	@ObfuscatedName("hc.p")
	public int field1035;

	@ObfuscatedName("hc.q")
	public int field1036;

	@ObfuscatedName("hc.r")
	public int field1037;

	@ObfuscatedName("hc.s")
	public int field1038;

	@ObfuscatedName("hc.t")
	public int field1039;

	@ObfuscatedName("hc.u")
	public int field1040;

	@ObfuscatedName("hc.v")
	public boolean field1041;

	@ObfuscatedName("hc.w")
	public int field1042;

	@ObfuscatedName("hc.x")
	public boolean field1043;

	@ObfuscatedName("hc.y")
	public int field1044;

	@ObfuscatedName("hc.z")
	public boolean field1045;

	@ObfuscatedName("hc.X")
	public static LruCache field1069 = new LruCache(50, 1);

	@ObfuscatedName("hc.Y")
	public static LruCache field1070 = new LruCache(100, 1);

	@ObfuscatedName("hc.E")
	public byte field1050;

	@ObfuscatedName("hc.H")
	public byte field1053;

	@ObfuscatedName("hc.C")
	public int field1048;

	@ObfuscatedName("hc.D")
	public int field1049;

	@ObfuscatedName("hc.F")
	public int field1051;

	@ObfuscatedName("hc.G")
	public int field1052;

	@ObfuscatedName("hc.I")
	public int field1054;

	@ObfuscatedName("hc.J")
	public int field1055;

	@ObfuscatedName("hc.K")
	public int field1056;

	@ObfuscatedName("hc.L")
	public int field1057;

	@ObfuscatedName("hc.M")
	public int field1058;

	@ObfuscatedName("hc.N")
	public int field1059;

	@ObfuscatedName("hc.Q")
	public int field1062;

	@ObfuscatedName("hc.R")
	public int field1063;

	@ObfuscatedName("hc.S")
	public int field1064;

	@ObfuscatedName("hc.T")
	public int field1065;

	@ObfuscatedName("hc.U")
	public int field1066;

	@ObfuscatedName("hc.V")
	public int field1067;

	@ObfuscatedName("hc.W")
	public int field1068;

	@ObfuscatedName("hc.O")
	public int[] field1060;

	@ObfuscatedName("hc.P")
	public int[] field1061;

	@ObfuscatedName("hc.A")
	public String[] field1046;

	@ObfuscatedName("hc.B")
	public String[] field1047;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void method346(Jagfile arg0) {
		field1025 = new Packet((byte) -109, arg0.method308("obj.dat", null));
		Packet var1 = new Packet((byte) -109, arg0.method308("obj.idx", null));
		field1023 = var1.method240();
		field1024 = new int[field1023];
		int var2 = 2;
		for (int var3 = 0; var3 < field1023; var3++) {
			field1024[var3] = var2;
			var2 += var1.method240();
		}
		field1026 = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1026[var4] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static final void method347(byte arg0) {
		if (arg0 != 9) {
			field1021 = 395;
		}
		field1069 = null;
		field1070 = null;
		field1024 = null;
		field1026 = null;
		field1025 = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static final ObjType method348(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1026[var1].field1029 == arg0) {
				return field1026[var1];
			}
		}
		field1027 = (field1027 + 1) % 10;
		ObjType var2 = field1026[field1027];
		field1025.field719 = field1024[arg0];
		var2.field1029 = arg0;
		var2.method349();
		var2.method350(168, field1025);
		if (var2.field1063 != -1) {
			var2.method351(6);
		}
		if (!field1028 && var2.field1045) {
			var2.field1031 = "Members Object";
			var2.field1032 = "Login to a members' server to use this object.".getBytes();
			var2.field1046 = null;
			var2.field1047 = null;
		}
		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method349() {
		this.field1030 = 0;
		this.field1031 = null;
		this.field1032 = null;
		this.field1033 = null;
		this.field1034 = null;
		this.field1035 = 2000;
		this.field1036 = 0;
		this.field1037 = 0;
		this.field1038 = 0;
		this.field1039 = 0;
		this.field1040 = 0;
		this.field1041 = false;
		this.field1042 = -1;
		this.field1043 = false;
		this.field1044 = 1;
		this.field1045 = false;
		this.field1046 = null;
		this.field1047 = null;
		this.field1048 = -1;
		this.field1049 = -1;
		this.field1050 = 0;
		this.field1051 = -1;
		this.field1052 = -1;
		this.field1053 = 0;
		this.field1054 = -1;
		this.field1055 = -1;
		this.field1056 = -1;
		this.field1057 = -1;
		this.field1058 = -1;
		this.field1059 = -1;
		this.field1060 = null;
		this.field1061 = null;
		this.field1062 = -1;
		this.field1063 = -1;
		this.field1064 = 128;
		this.field1065 = 128;
		this.field1066 = 128;
		this.field1067 = 0;
		this.field1068 = 0;
	}

	@ObfuscatedName("hc.a(ILmb;)V")
	public final void method350(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		while (true) {
			while (true) {
				int var3 = arg1.method238();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.field1030 = arg1.method240();
				} else if (var3 == 2) {
					this.field1031 = arg1.method245();
				} else if (var3 == 3) {
					this.field1032 = arg1.method246(1);
				} else if (var3 == 4) {
					this.field1035 = arg1.method240();
				} else if (var3 == 5) {
					this.field1036 = arg1.method240();
				} else if (var3 == 6) {
					this.field1037 = arg1.method240();
				} else if (var3 == 7) {
					this.field1039 = arg1.method240();
					if (this.field1039 > 32767) {
						this.field1039 -= 65536;
					}
				} else if (var3 == 8) {
					this.field1040 = arg1.method240();
					if (this.field1040 > 32767) {
						this.field1040 -= 65536;
					}
				} else if (var3 == 9) {
					this.field1041 = true;
				} else if (var3 == 10) {
					this.field1042 = arg1.method240();
				} else if (var3 == 11) {
					this.field1043 = true;
				} else if (var3 == 12) {
					this.field1044 = arg1.method243();
				} else if (var3 == 16) {
					this.field1045 = true;
				} else if (var3 == 23) {
					this.field1048 = arg1.method240();
					this.field1050 = arg1.method239();
				} else if (var3 == 24) {
					this.field1049 = arg1.method240();
				} else if (var3 == 25) {
					this.field1051 = arg1.method240();
					this.field1053 = arg1.method239();
				} else if (var3 == 26) {
					this.field1052 = arg1.method240();
				} else if (var3 >= 30 && var3 < 35) {
					if (this.field1046 == null) {
						this.field1046 = new String[5];
					}
					this.field1046[var3 - 30] = arg1.method245();
					if (this.field1046[var3 - 30].equalsIgnoreCase("hidden")) {
						this.field1046[var3 - 30] = null;
					}
				} else if (var3 >= 35 && var3 < 40) {
					if (this.field1047 == null) {
						this.field1047 = new String[5];
					}
					this.field1047[var3 - 35] = arg1.method245();
				} else if (var3 == 40) {
					int var4 = arg1.method238();
					this.field1033 = new int[var4];
					this.field1034 = new int[var4];
					for (int var5 = 0; var5 < var4; var5++) {
						this.field1033[var5] = arg1.method240();
						this.field1034[var5] = arg1.method240();
					}
				} else if (var3 == 78) {
					this.field1054 = arg1.method240();
				} else if (var3 == 79) {
					this.field1055 = arg1.method240();
				} else if (var3 == 90) {
					this.field1056 = arg1.method240();
				} else if (var3 == 91) {
					this.field1058 = arg1.method240();
				} else if (var3 == 92) {
					this.field1057 = arg1.method240();
				} else if (var3 == 93) {
					this.field1059 = arg1.method240();
				} else if (var3 == 95) {
					this.field1038 = arg1.method240();
				} else if (var3 == 97) {
					this.field1062 = arg1.method240();
				} else if (var3 == 98) {
					this.field1063 = arg1.method240();
				} else if (var3 >= 100 && var3 < 110) {
					if (this.field1060 == null) {
						this.field1060 = new int[10];
						this.field1061 = new int[10];
					}
					this.field1060[var3 - 100] = arg1.method240();
					this.field1061[var3 - 100] = arg1.method240();
				} else if (var3 == 110) {
					this.field1064 = arg1.method240();
				} else if (var3 == 111) {
					this.field1065 = arg1.method240();
				} else if (var3 == 112) {
					this.field1066 = arg1.method240();
				} else if (var3 == 113) {
					this.field1067 = arg1.method239();
				} else if (var3 == 114) {
					this.field1068 = arg1.method239() * 5;
				}
			}
		}
	}

	@ObfuscatedName("hc.b(I)V")
	public void method351(int arg0) {
		ObjType var2 = method348(this.field1063);
		this.field1030 = var2.field1030;
		this.field1035 = var2.field1035;
		this.field1036 = var2.field1036;
		this.field1037 = var2.field1037;
		if (arg0 < 6 || arg0 > 6) {
			this.field1022 = !this.field1022;
		}
		this.field1038 = var2.field1038;
		this.field1039 = var2.field1039;
		this.field1040 = var2.field1040;
		this.field1033 = var2.field1033;
		this.field1034 = var2.field1034;
		ObjType var3 = method348(this.field1062);
		this.field1031 = var3.field1031;
		this.field1045 = var3.field1045;
		this.field1044 = var3.field1044;
		String var4 = "a";
		char var5 = var3.field1031.charAt(0);
		if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
			var4 = "an";
		}
		this.field1032 = ("Swap this note at any bank for " + var4 + " " + var3.field1031 + ".").getBytes();
		this.field1043 = true;
	}

	@ObfuscatedName("hc.c(I)Lfb;")
	public final Model method352(int arg0) {
		if (this.field1060 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1061[var3] && this.field1061[var3] != 0) {
					var2 = this.field1060[var3];
				}
			}
			if (var2 != -1) {
				return method348(var2).method352(1);
			}
		}
		Model var4 = (Model) field1069.method114((long) this.field1029);
		if (var4 != null) {
			return var4;
		}
		Model var5 = Model.method138(this.field1030, -404);
		if (var5 == null) {
			return null;
		}
		if (this.field1064 != 128 || this.field1065 != 128 || this.field1066 != 128) {
			var5.method154(this.field1065, this.field1066, 4, this.field1064);
		}
		if (this.field1033 != null) {
			for (int var6 = 0; var6 < this.field1033.length; var6++) {
				var5.method152(this.field1033[var6], this.field1034[var6]);
			}
		}
		var5.method155(this.field1067 + 64, this.field1068 + 768, -50, -10, -50, true);
		var5.field576 = true;
		field1069.method115(var5, (long) this.field1029, 39399);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final Model method353(int arg0, int arg1) {
		if (arg0 != -42857) {
			this.field1022 = !this.field1022;
		}
		if (this.field1060 != null && arg1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg1 >= this.field1061[var4] && this.field1061[var4] != 0) {
					var3 = this.field1060[var4];
				}
			}
			if (var3 != -1) {
				return method348(var3).method353(-42857, 1);
			}
		}
		Model var5 = Model.method138(this.field1030, -404);
		if (var5 == null) {
			return null;
		}
		if (this.field1033 != null) {
			for (int var6 = 0; var6 < this.field1033.length; var6++) {
				var5.method152(this.field1033[var6], this.field1034[var6]);
			}
		}
		return var5;
	}

	@ObfuscatedName("hc.a(IIII)Ljb;")
	public static final Pix32 method354(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 == 0) {
			Pix32 var4 = (Pix32) field1070.method114((long) arg2);
			if (var4 != null && var4.field676 != arg1 && var4.field676 != -1) {
				var4.method119();
				var4 = null;
			}
			if (var4 != null) {
				return var4;
			}
		}
		ObjType var5 = method348(arg2);
		if (var5.field1060 == null) {
			arg1 = -1;
		}
		if (arg1 > 1) {
			int var6 = -1;
			for (int var7 = 0; var7 < 10; var7++) {
				if (arg1 >= var5.field1061[var7] && var5.field1061[var7] != 0) {
					var6 = var5.field1060[var7];
				}
			}
			if (var6 != -1) {
				var5 = method348(var6);
			}
		}
		Model var8 = var5.method352(1);
		if (var8 == null) {
			return null;
		}
		Pix32 var9 = null;
		if (var5.field1063 != -1) {
			var9 = method354(-1, 10, var5.field1062, 723);
			if (var9 == null) {
				return null;
			}
		}
		Pix32 var10 = new Pix32(32, 32);
		int var11 = Pix3D.field647;
		int var12 = Pix3D.field648;
		int[] var13 = Pix3D.field653;
		int[] var14 = Pix2D.field627;
		int var15 = Pix2D.field628;
		int var16 = Pix2D.field629;
		int var17 = 91 / arg3;
		int var18 = Pix2D.field632;
		int var19 = Pix2D.field633;
		int var20 = Pix2D.field630;
		int var21 = Pix2D.field631;
		Pix3D.field645 = false;
		Pix2D.method164(32, 2, var10.field670, 32);
		Pix2D.method169(0, 0, 32, 32, 0, 0);
		Pix3D.method177((byte) 6);
		int var22 = var5.field1035;
		if (arg0 == -1) {
			var22 = (int) ((double) var22 * 1.5D);
		}
		if (arg0 > 0) {
			var22 = (int) ((double) var22 * 1.04D);
		}
		int var23 = Pix3D.field651[var5.field1036] * var22 >> 16;
		int var24 = Pix3D.field652[var5.field1036] * var22 >> 16;
		var8.method158(0, var5.field1037, var5.field1038, var5.field1036, var5.field1039, var8.field400 / 2 + var23 + var5.field1040, var5.field1040 + var24);
		for (int var25 = 31; var25 >= 0; var25--) {
			for (int var32 = 31; var32 >= 0; var32--) {
				if (var10.field670[var32 * 32 + var25] == 0) {
					if (var25 > 0 && var10.field670[var32 * 32 + (var25 - 1)] > 1) {
						var10.field670[var32 * 32 + var25] = 1;
					} else if (var32 > 0 && var10.field670[(var32 - 1) * 32 + var25] > 1) {
						var10.field670[var32 * 32 + var25] = 1;
					} else if (var25 < 31 && var10.field670[var32 * 32 + var25 + 1] > 1) {
						var10.field670[var32 * 32 + var25] = 1;
					} else if (var32 < 31 && var10.field670[(var32 + 1) * 32 + var25] > 1) {
						var10.field670[var32 * 32 + var25] = 1;
					}
				}
			}
		}
		if (arg0 > 0) {
			for (int var26 = 31; var26 >= 0; var26--) {
				for (int var27 = 31; var27 >= 0; var27--) {
					if (var10.field670[var27 * 32 + var26] == 0) {
						if (var26 > 0 && var10.field670[var27 * 32 + (var26 - 1)] == 1) {
							var10.field670[var27 * 32 + var26] = arg0;
						} else if (var27 > 0 && var10.field670[(var27 - 1) * 32 + var26] == 1) {
							var10.field670[var27 * 32 + var26] = arg0;
						} else if (var26 < 31 && var10.field670[var27 * 32 + var26 + 1] == 1) {
							var10.field670[var27 * 32 + var26] = arg0;
						} else if (var27 < 31 && var10.field670[(var27 + 1) * 32 + var26] == 1) {
							var10.field670[var27 * 32 + var26] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var28 = 31; var28 >= 0; var28--) {
				for (int var29 = 31; var29 >= 0; var29--) {
					if (var10.field670[var29 * 32 + var28] == 0 && var28 > 0 && var29 > 0 && var10.field670[(var29 - 1) * 32 + (var28 - 1)] > 0) {
						var10.field670[var29 * 32 + var28] = 3153952;
					}
				}
			}
		}
		if (var5.field1063 != -1) {
			int var30 = var9.field675;
			int var31 = var9.field676;
			var9.field675 = 32;
			var9.field676 = 32;
			var9.method198((byte) 9, 0, 0);
			var9.field675 = var30;
			var9.field676 = var31;
		}
		if (arg0 == 0) {
			field1070.method115(var10, (long) arg2, 39399);
		}
		Pix2D.method164(var15, 2, var14, var16);
		Pix2D.method166(var19, var21, field1020, var20, var18);
		Pix3D.field647 = var11;
		Pix3D.field648 = var12;
		Pix3D.field653 = var13;
		Pix3D.field645 = true;
		if (var5.field1043) {
			var10.field675 = 33;
		} else {
			var10.field675 = 32;
		}
		var10.field676 = arg1;
		return var10;
	}

	@ObfuscatedName("hc.b(II)Z")
	public final boolean method355(int arg0, int arg1) {
		int var3 = this.field1048;
		int var4 = this.field1049;
		int var5 = this.field1054;
		while (arg0 >= 0) {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
		if (arg1 == 1) {
			var3 = this.field1051;
			var4 = this.field1052;
			var5 = this.field1055;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!Model.method139(var3)) {
			var6 = false;
		}
		if (var4 != -1 && !Model.method139(var4)) {
			var6 = false;
		}
		if (var5 != -1 && !Model.method139(var5)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("hc.a(ZI)Lfb;")
	public final Model method356(boolean arg0, int arg1) {
		int var3 = this.field1048;
		int var4 = this.field1049;
		int var5 = this.field1054;
		if (arg1 == 1) {
			var3 = this.field1051;
			var4 = this.field1052;
			var5 = this.field1055;
		}
		if (var3 == -1) {
			return null;
		}
		Model var6 = Model.method138(var3, -404);
		if (!arg0) {
			throw new NullPointerException();
		}
		if (var4 != -1) {
			if (var5 == -1) {
				Model var10 = Model.method138(var4, -404);
				Model[] var11 = new Model[] { var6, var10 };
				var6 = new Model(2, 652, var11);
			} else {
				Model var7 = Model.method138(var4, -404);
				Model var8 = Model.method138(var5, -404);
				Model[] var9 = new Model[] { var6, var7, var8 };
				var6 = new Model(3, 652, var9);
			}
		}
		if (arg1 == 0 && this.field1050 != 0) {
			var6.method151(this.field1050, 0, 0, false);
		}
		if (arg1 == 1 && this.field1053 != 0) {
			var6.method151(this.field1053, 0, 0, false);
		}
		if (this.field1033 != null) {
			for (int var12 = 0; var12 < this.field1033.length; var12++) {
				var6.method152(this.field1033[var12], this.field1034[var12]);
			}
		}
		return var6;
	}

	@ObfuscatedName("hc.c(II)Z")
	public final boolean method357(int arg0, int arg1) {
		int var3 = this.field1056;
		int var4 = this.field1057;
		if (arg0 == 1) {
			var3 = this.field1058;
			var4 = this.field1059;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (arg1 != -5652) {
			throw new NullPointerException();
		}
		if (!Model.method139(var3)) {
			var5 = false;
		}
		if (var4 != -1 && !Model.method139(var4)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("hc.b(ZI)Lfb;")
	public final Model method358(boolean arg0, int arg1) {
		int var3 = this.field1056;
		int var4 = this.field1057;
		if (arg0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if (arg1 == 1) {
			var3 = this.field1058;
			var4 = this.field1059;
		}
		if (var3 == -1) {
			return null;
		}
		Model var6 = Model.method138(var3, -404);
		if (var4 != -1) {
			Model var7 = Model.method138(var4, -404);
			Model[] var8 = new Model[] { var6, var7 };
			var6 = new Model(2, 652, var8);
		}
		if (this.field1033 != null) {
			for (int var9 = 0; var9 < this.field1033.length; var9++) {
				var6.method152(this.field1033[var9], this.field1034[var9]);
			}
		}
		return var6;
	}
}
