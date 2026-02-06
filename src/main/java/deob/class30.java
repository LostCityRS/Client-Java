package deob;

@ObfuscatedName("ea")
public abstract class class30 {

	@ObfuscatedName("ea.b")
	public static class32 field539 = field546;

	@ObfuscatedName("ea.c")
	public int field540;

	@ObfuscatedName("ea.e")
	public Object[] field542;

	@ObfuscatedName("ea.h")
	public int[] field545;

	@ObfuscatedName("ea.i")
	public static class32 field546 = class73.method593("Invalid username or password)3", true);

	@ObfuscatedName("ea.k")
	public int[] field548;

	@ObfuscatedName("ea.n")
	public static boolean field551 = false;

	@ObfuscatedName("ea.o")
	public Object[][] field552;

	@ObfuscatedName("ea.p")
	public static int field553 = 2;

	@ObfuscatedName("ea.u")
	public int[] field558;

	@ObfuscatedName("ea.x")
	public static class32 field561 = class73.method593("und die Schaltfl-=che (WSpielkonto erstellen(W am", true);

	@ObfuscatedName("ea.y")
	public static int field562 = 0;

	@ObfuscatedName("ea.D")
	public static class32 field567 = class73.method593("Der Anmelde)2Server ist offline)3", true);

	@ObfuscatedName("ea.z")
	public static int field563 = -2;

	@ObfuscatedName("ea.F")
	public final boolean field569;

	@ObfuscatedName("ea.H")
	public final boolean field571;

	@ObfuscatedName("ea.B")
	public int field565;

	@ObfuscatedName("ea.I")
	public static class44 field572;

	@ObfuscatedName("ea.P")
	public class94 field579;

	@ObfuscatedName("ea.A")
	public int[] field564;

	@ObfuscatedName("ea.K")
	public int[] field574;

	@ObfuscatedName("ea.O")
	public static class49[] field578;

	@ObfuscatedName("ea.X")
	public static class49[] field587;

	@ObfuscatedName("ea.E")
	public class94[] field568;

	@ObfuscatedName("ea.S")
	public int[][] field582;

	@ObfuscatedName("ea.V")
	public int[][] field585;

	@ObfuscatedName("ea.a(I)V")
	public static void method202() {
		field587 = null;
		field578 = null;
		field567 = null;
		field561 = null;
		field546 = null;
		field539 = null;
		field572 = null;
	}

	@ObfuscatedName("ea.a(IIIIII)V")
	public static void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = class159.field3657.method1153(arg1, arg2, arg3);
		if (var5 != 0) {
			int var6 = class159.field3657.method1121(arg1, arg2, arg3, var5);
			int var7 = var6 >> 6 & 0x3;
			int var8 = arg0;
			int var9 = var6 & 0x1F;
			if (var5 > 0) {
				var8 = arg4;
			}
			int[] var10 = class142.field3252.field1144;
			int var11 = var5 >> 14 & 0x7FFF;
			int var12 = (52736 - arg3 * 512) * 4 + arg2 * 4 + 24624;
			class53 var13 = class5.method22(var11);
			if (var13.field1226 == -1) {
				if (var9 == 0 || var9 == 2) {
					if (var7 == 0) {
						var10[var12] = var8;
						var10[var12 + 512] = var8;
						var10[var12 + 1024] = var8;
						var10[var12 + 1536] = var8;
					} else if (var7 == 1) {
						var10[var12] = var8;
						var10[var12 + 1] = var8;
						var10[var12 + 2] = var8;
						var10[var12 + 3] = var8;
					} else if (var7 == 2) {
						var10[var12 + 3] = var8;
						var10[var12 + 512 + 3] = var8;
						var10[var12 + 1024 + 3] = var8;
						var10[var12 + 3 + 1536] = var8;
					} else if (var7 == 3) {
						var10[var12 + 1536] = var8;
						var10[var12 + 1537] = var8;
						var10[var12 + 1536 + 2] = var8;
						var10[var12 + 3 + 1536] = var8;
					}
				}
				if (var9 == 3) {
					if (var7 == 0) {
						var10[var12] = var8;
					} else if (var7 == 1) {
						var10[var12 + 3] = var8;
					} else if (var7 == 2) {
						var10[var12 + 3 + 1536] = var8;
					} else if (var7 == 3) {
						var10[var12 + 1536] = var8;
					}
				}
				if (var9 == 2) {
					if (var7 == 3) {
						var10[var12] = var8;
						var10[var12 + 512] = var8;
						var10[var12 + 1024] = var8;
						var10[var12 + 1536] = var8;
					} else if (var7 == 0) {
						var10[var12] = var8;
						var10[var12 + 1] = var8;
						var10[var12 + 2] = var8;
						var10[var12 + 3] = var8;
					} else if (var7 == 1) {
						var10[var12 + 3] = var8;
						var10[var12 + 515] = var8;
						var10[var12 + 1027] = var8;
						var10[var12 + 3 + 1536] = var8;
					} else if (var7 == 2) {
						var10[var12 + 1536] = var8;
						var10[var12 + 1 + 1536] = var8;
						var10[var12 + 1538] = var8;
						var10[var12 + 1539] = var8;
					}
				}
			} else {
				class51 var14 = class62.field1434[var13.field1226];
				if (var14 != null) {
					int var15 = (var13.field1222 * 4 - var14.field1167) / 2;
					int var16 = (var13.field1233 * 4 - var14.field1171) / 2;
					var14.method399(var15 + arg2 * 4 + 48, var16 + (-var13.field1233 + -arg3 + 104) * 4 + 48);
				}
			}
		}
		int var17 = class159.field3657.method1133(arg1, arg2, arg3);
		if (var17 != 0) {
			int var18 = class159.field3657.method1121(arg1, arg2, arg3, var17);
			int var19 = var18 >> 6 & 0x3;
			int var20 = var18 & 0x1F;
			int var21 = var17 >> 14 & 0x7FFF;
			class53 var22 = class5.method22(var21);
			if (var22.field1226 != -1) {
				class51 var23 = class62.field1434[var22.field1226];
				if (var23 != null) {
					int var24 = (var22.field1222 * 4 - var23.field1167) / 2;
					int var25 = (var22.field1233 * 4 - var23.field1171) / 2;
					var23.method399(arg2 * 4 + var24 + 48, var25 + (-var22.field1233 + -arg3 + 104) * 4 + 48);
				}
			} else if (var20 == 9) {
				int var26 = 15658734;
				int[] var27 = class142.field3252.field1144;
				int var28 = arg2 * 4 + (-(arg3 * 512) + 52736) * 4 + 24624;
				if (var17 > 0) {
					var26 = 15597568;
				}
				if (var19 == 0 || var19 == 2) {
					var27[var28 + 1536] = var26;
					var27[var28 + 1024 + 1] = var26;
					var27[var28 + 512 + 2] = var26;
					var27[var28 + 3] = var26;
				} else {
					var27[var28] = var26;
					var27[var28 + 1 + 512] = var26;
					var27[var28 + 2 + 1024] = var26;
					var27[var28 + 1539] = var26;
				}
			}
		}
		int var29 = class159.field3657.method1134(arg1, arg2, arg3);
		if (var29 == 0) {
			return;
		}
		int var30 = var29 >> 14 & 0x7FFF;
		class53 var31 = class5.method22(var30);
		if (var31.field1226 == -1) {
			return;
		}
		class51 var32 = class62.field1434[var31.field1226];
		if (var32 != null) {
			int var33 = (var31.field1222 * 4 - var32.field1167) / 2;
			int var34 = (var31.field1233 * 4 - var32.field1171) / 2;
			var32.method399(var33 + arg2 * 4 + 48, var34 + (-arg3 - var31.field1233 + 104) * 4 + 48);
			return;
		}
	}

	public class30(boolean arg0, boolean arg1) {
		this.field569 = arg1;
		this.field571 = arg0;
	}

	@ObfuscatedName("ea.a(II[I)Z")
	public boolean method198(int arg0, int[] arg1) {
		if (this.field542[arg0] == null) {
			return false;
		}
		int var3 = this.field548[arg0];
		int[] var4 = this.field582[arg0];
		Object[] var5 = this.field552[arg0];
		boolean var6 = true;
		for (int var7 = 0; var7 < var3; var7++) {
			if (var5[var4[var7]] == null) {
				var6 = false;
				break;
			}
		}
		if (var6) {
			return true;
		}
		byte[] var8;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			var8 = class135.method1029(false, this.field542[arg0]);
		} else {
			var8 = class135.method1029(true, this.field542[arg0]);
			class66 var9 = new class66(var8);
			var9.method523(var9.field1586.length, arg1);
		}
		byte[] var10;
		try {
			var10 = class97.method754(var8);
		} catch (RuntimeException var27) {
			throw class98.method765(var27, "T3 - " + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class124.method973(var8.length, var8) + "," + class124.method973(var8.length - 2, var8) + "," + this.field564[arg0] + "," + this.field565);
		}
		if (this.field571) {
			this.field542[arg0] = null;
		}
		if (var3 > 1) {
			int var12 = var10.length;
			int var28 = var12 - 1;
			int var13 = var10[var28] & 0xFF;
			class66 var14 = new class66(var10);
			int var15 = var28 - var3 * var13 * 4;
			var14.field1568 = var15;
			int[] var16 = new int[var3];
			for (int var17 = 0; var17 < var13; var17++) {
				int var18 = 0;
				for (int var19 = 0; var19 < var3; var19++) {
					var18 += var14.method538();
					var16[var19] += var18;
				}
			}
			byte[][] var20 = new byte[var3][];
			for (int var21 = 0; var21 < var3; var21++) {
				var20[var21] = new byte[var16[var21]];
				var16[var21] = 0;
			}
			var14.field1568 = var15;
			int var22 = 0;
			for (int var23 = 0; var23 < var13; var23++) {
				int var24 = 0;
				for (int var25 = 0; var25 < var3; var25++) {
					var24 += var14.method538();
					class60.method457(var10, var22, var20[var25], var16[var25], var24);
					var22 += var24;
					var16[var25] += var24;
				}
			}
			for (int var26 = 0; var26 < var3; var26++) {
				if (this.field569) {
					var5[var4[var26]] = var20[var26];
				} else {
					var5[var4[var26]] = class73.method591(var20[var26]);
				}
			}
		} else if (this.field569) {
			var5[var4[0]] = var10;
		} else {
			var5[var4[0]] = class73.method591(var10);
		}
		return true;
	}

	@ObfuscatedName("ea.a(II)V")
	public void method199(int arg0) {
	}

	@ObfuscatedName("ea.a(BI)I")
	public final int method200(int arg0) {
		return this.field552[arg0].length;
	}

	@ObfuscatedName("ea.a(ILec;)I")
	public final int method201(class32 arg0) {
		class32 var2 = arg0.method270();
		return this.field579.method743(var2.method247());
	}

	@ObfuscatedName("ea.b(II)Z")
	public final boolean method203(int arg0) {
		if (this.field542[arg0] == null) {
			this.method199(arg0);
			return this.field542[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ea.b(I)I")
	public final int method204() {
		return this.field552.length;
	}

	@ObfuscatedName("ea.b(BI)V")
	public void method205(int arg0) {
	}

	@ObfuscatedName("ea.a(III)[B")
	public final byte[] method206(int arg0, int arg1) {
		return this.method220(arg0, null, arg1);
	}

	@ObfuscatedName("ea.c(II)[I")
	public final int[] method207(int arg0) {
		return this.field582[arg0];
	}

	@ObfuscatedName("ea.c(I)Z")
	public final boolean method208() {
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field574.length; var2++) {
			int var3 = this.field574[var2];
			if (this.field542[var3] == null) {
				this.method199(var3);
				if (this.field542[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("ea.a([BI)V")
	public final void method209(byte[] arg0) {
		this.field565 = class124.method973(arg0.length, arg0);
		class66 var2 = new class66(class97.method754(arg0));
		int var3 = var2.method532();
		if (var3 != 5 && var3 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + var3);
		}
		if (var3 >= 6) {
			var2.method538();
		}
		int var4 = 0;
		int var5 = var2.method532();
		this.field540 = var2.method531();
		this.field574 = new int[this.field540];
		int var6 = -1;
		for (int var7 = 0; var7 < this.field540; var7++) {
			this.field574[var7] = var4 += var2.method531();
			if (var6 < this.field574[var7]) {
				var6 = this.field574[var7];
			}
		}
		this.field564 = new int[var6 + 1];
		this.field545 = new int[var6 + 1];
		this.field542 = new Object[var6 + 1];
		this.field552 = new Object[var6 + 1][];
		this.field548 = new int[var6 + 1];
		this.field582 = new int[var6 + 1][];
		if (var5 != 0) {
			this.field558 = new int[var6 + 1];
			for (int var8 = 0; var8 < this.field540; var8++) {
				this.field558[this.field574[var8]] = var2.method538();
			}
			this.field579 = new class94(this.field558);
		}
		for (int var9 = 0; var9 < this.field540; var9++) {
			this.field564[this.field574[var9]] = var2.method538();
		}
		for (int var10 = 0; var10 < this.field540; var10++) {
			this.field545[this.field574[var10]] = var2.method538();
		}
		for (int var11 = 0; var11 < this.field540; var11++) {
			this.field548[this.field574[var11]] = var2.method531();
		}
		for (int var12 = 0; var12 < this.field540; var12++) {
			int var13 = 0;
			int var14 = -1;
			int var15 = this.field574[var12];
			int var16 = this.field548[var15];
			this.field582[var15] = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				int var18 = this.field582[var15][var17] = var13 += var2.method531();
				if (var14 < var18) {
					var14 = var18;
				}
			}
			this.field552[var15] = new Object[var14 + 1];
		}
		if (var5 == 0) {
			return;
		}
		this.field585 = new int[var6 + 1][];
		this.field568 = new class94[var6 + 1];
		for (int var19 = 0; var19 < this.field540; var19++) {
			int var20 = this.field574[var19];
			int var21 = this.field548[var20];
			this.field585[var20] = new int[this.field552[var20].length];
			for (int var22 = 0; var22 < var21; var22++) {
				this.field585[var20][this.field582[var20][var22]] = var2.method538();
			}
			this.field568[var20] = new class94(this.field585[var20]);
		}
	}

	@ObfuscatedName("ea.a(Lec;Lec;I)Z")
	public final boolean method210(class32 arg0, class32 arg1) {
		class32 var3 = arg0.method270();
		class32 var4 = arg1.method270();
		int var5 = this.field579.method743(var3.method247());
		int var6 = this.field568[var5].method743(var4.method247());
		return this.method213(var5, var6);
	}

	@ObfuscatedName("ea.a(BLec;)V")
	public final void method212(class32 arg0) {
		class32 var2 = arg0.method270();
		int var3 = this.field579.method743(var2.method247());
		if (var3 >= 0) {
			this.method205(var3);
		}
	}

	@ObfuscatedName("ea.a(IZI)Z")
	public final boolean method213(int arg0, int arg1) {
		if (arg0 < 0 || arg0 >= this.field552.length || this.field552[arg0] == null || arg1 < 0 || this.field552[arg0].length <= arg1) {
			return false;
		} else if (this.field552[arg0][arg1] != null) {
			return true;
		} else if (this.field542[arg0] == null) {
			this.method199(arg0);
			return this.field542[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ea.d(I)V")
	public final void method214() {
		for (int var1 = 0; var1 < this.field552.length; var1++) {
			if (this.field552[var1] != null) {
				for (int var2 = 0; var2 < this.field552[var1].length; var2++) {
					this.field552[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("ea.a(Lec;IZ)I")
	public final int method215(class32 arg0, int arg1) {
		class32 var3 = arg0.method270();
		return this.field568[arg1].method743(var3.method247());
	}

	@ObfuscatedName("ea.d(II)[B")
	public final byte[] method216(int arg0) {
		if (this.field552.length == 1) {
			return this.method217(arg0, 0);
		} else if (this.field552[arg0].length == 1) {
			return this.method217(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ea.b(III)[B")
	public final byte[] method217(int arg0, int arg1) {
		if (arg1 < 0 || this.field552.length <= arg1 || this.field552[arg1] == null || arg0 < 0 || arg0 >= this.field552[arg1].length) {
			return null;
		}
		if (this.field552[arg1][arg0] == null) {
			boolean var3 = this.method198(arg1, null);
			if (!var3) {
				this.method199(arg1);
				boolean var4 = this.method198(arg1, null);
				if (!var4) {
					return null;
				}
			}
		}
		return class135.method1029(false, this.field552[arg1][arg0]);
	}

	@ObfuscatedName("ea.e(II)[B")
	public final byte[] method218(int arg0) {
		if (this.field552.length == 1) {
			return this.method206(0, arg0);
		} else if (this.field552[arg0].length == 1) {
			return this.method206(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ea.a(Lec;ILec;)[B")
	public final byte[] method219(class32 arg0, class32 arg1) {
		class32 var3 = arg0.method270();
		class32 var4 = arg1.method270();
		int var5 = this.field579.method743(var3.method247());
		int var6 = this.field568[var5].method743(var4.method247());
		return this.method206(var5, var6);
	}

	@ObfuscatedName("ea.a(II[II)[B")
	public final byte[] method220(int arg0, int[] arg1, int arg2) {
		if (arg0 < 0 || this.field552.length <= arg0 || this.field552[arg0] == null || arg2 < 0 || arg2 >= this.field552[arg0].length) {
			return null;
		}
		if (this.field552[arg0][arg2] == null) {
			boolean var4 = this.method198(arg0, arg1);
			if (!var4) {
				this.method199(arg0);
				boolean var5 = this.method198(arg0, arg1);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = class135.method1029(false, this.field552[arg0][arg2]);
		if (this.field569) {
			this.field552[arg0][arg2] = null;
		}
		return var6;
	}

	@ObfuscatedName("ea.a(IZ)V")
	public final void method221(int arg0) {
		for (int var2 = 0; var2 < this.field552[arg0].length; var2++) {
			this.field552[arg0][var2] = null;
		}
	}
}
