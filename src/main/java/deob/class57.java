package deob;

@ObfuscatedName("ia")
public final class class57 extends class13 {

	@ObfuscatedName("ia.bb")
	public int field1332;

	@ObfuscatedName("ia.cb")
	public int field1333;

	@ObfuscatedName("ia.eb")
	public int field1335;

	@ObfuscatedName("ia.fb")
	public int field1336 = -1;

	@ObfuscatedName("ia.hb")
	public boolean field1338 = true;

	@ObfuscatedName("ia.J")
	public static byte[][] field1314 = new byte[1000][];

	@ObfuscatedName("ia.W")
	public static int field1327 = 0;

	@ObfuscatedName("ia.U")
	public static class32 field1325 = class73.method593("Prepared sound engine", true);

	@ObfuscatedName("ia.V")
	public static class32 field1326 = field1325;

	@ObfuscatedName("ia.N")
	public static boolean[] field1318 = new boolean[100];

	@ObfuscatedName("ia.M")
	public static class32 field1317 = class73.method593("gr-Un:", true);

	@ObfuscatedName("ia.L")
	public int field1316 = 0;

	@ObfuscatedName("ia.H")
	public int field1312 = -1;

	@ObfuscatedName("ia.K")
	public int field1315;

	@ObfuscatedName("ia.O")
	public static int field1319;

	@ObfuscatedName("ia.Q")
	public static int field1321;

	@ObfuscatedName("ia.R")
	public int field1322;

	@ObfuscatedName("ia.Z")
	public int field1330;

	@ObfuscatedName("ia.a(ZLqd;)V")
	public static void method444(class115 arg0) {
		if (arg0.field2693 == 0) {
			return;
		}
		if (arg0.field2756 != -1 && arg0.field2756 < 32768) {
			class111 var1 = class14.field230[arg0.field2756];
			if (var1 != null) {
				int var2 = arg0.field2747 - var1.field2747;
				int var3 = arg0.field2698 - var1.field2698;
				if (var2 != 0 || var3 != 0) {
					arg0.field2742 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field2756 >= 32768) {
			int var4 = arg0.field2756 - 32768;
			if (var4 == class37.field891) {
				var4 = 2047;
			}
			class70 var5 = class52.field1175[var4];
			if (var5 != null) {
				int var6 = arg0.field2698 - var5.field2698;
				int var7 = arg0.field2747 - var5.field2747;
				if (var7 != 0 || var6 != 0) {
					arg0.field2742 = (int) (Math.atan2((double) var7, (double) var6) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field2741 != 0 || arg0.field2697 != 0) && (arg0.field2696 == 0 || arg0.field2694 > 0)) {
			int var8 = arg0.field2747 - (arg0.field2741 - class72.field1700 - class72.field1700) * 64;
			int var9 = arg0.field2698 - (arg0.field2697 - class118.field2836 - class118.field2836) * 64;
			if (var8 != 0 || var9 != 0) {
				arg0.field2742 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
			}
			arg0.field2741 = 0;
			arg0.field2697 = 0;
		}
		int var10 = arg0.field2742 - arg0.field2745 & 0x7FF;
		if (var10 == 0) {
			arg0.field2752 = 0;
			return;
		}
		arg0.field2752++;
		if (var10 <= 1024) {
			arg0.field2745 += arg0.field2693;
			boolean var11 = true;
			if (arg0.field2693 > var10 || 2048 - arg0.field2693 < var10) {
				var11 = false;
				arg0.field2745 = arg0.field2742;
			}
			if (arg0.field2687 == arg0.field2708 && (arg0.field2752 > 25 || var11)) {
				if (arg0.field2716 == -1) {
					arg0.field2708 = arg0.field2709;
				} else {
					arg0.field2708 = arg0.field2716;
				}
			}
		} else {
			arg0.field2745 -= arg0.field2693;
			boolean var12 = true;
			if (arg0.field2693 > var10 || var10 > 2048 - arg0.field2693) {
				arg0.field2745 = arg0.field2742;
				var12 = false;
			}
			if (arg0.field2708 == arg0.field2687 && (arg0.field2752 > 25 || var12)) {
				if (arg0.field2744 == -1) {
					arg0.field2708 = arg0.field2709;
				} else {
					arg0.field2708 = arg0.field2744;
				}
			}
		}
		arg0.field2745 &= 0x7FF;
	}

	@ObfuscatedName("ia.a(ILea;I)Lkd;")
	public static class73 method448(int arg0, class30 arg1) {
		byte[] var2 = arg1.method218(arg0);
		return var2 == null ? null : new class73(var2);
	}

	@ObfuscatedName("ia.a(B)V")
	public static void method449() {
		if (class154.field3529 && class115.field2743 != class43.field989) {
			class121.method955(class43.field989, class20.field373.field2736[0], class142.field3251, class62.field1422, class20.field373.field2759[0]);
		} else if (class43.field989 != class5.field92) {
			class5.field92 = class43.field989;
			class2.method7(class43.field989);
		}
	}

	@ObfuscatedName("ia.a(IIIB)V")
	public static void method451(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				class70.field1630[arg2][arg0 + var3][var4 + arg1] = 0;
			}
		}
		if (arg0 > 0) {
			for (int var5 = 1; var5 < 8; var5++) {
				class70.field1630[arg2][arg0][var5 + arg1] = class70.field1630[arg2][arg0 - 1][arg1 + var5];
			}
		}
		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				class70.field1630[arg2][var6 + arg0][arg1] = class70.field1630[arg2][var6 + arg0][arg1 - 1];
			}
		}
		if (arg0 > 0 && class70.field1630[arg2][arg0 - 1][arg1] != 0) {
			class70.field1630[arg2][arg0][arg1] = class70.field1630[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && class70.field1630[arg2][arg0][arg1 - 1] != 0) {
			class70.field1630[arg2][arg0][arg1] = class70.field1630[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && class70.field1630[arg2][arg0 - 1][arg1 - 1] != 0) {
			class70.field1630[arg2][arg0][arg1] = class70.field1630[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("ia.a(Ljd;III)V")
	public void method445(class66 arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field1316 = arg0.method517();
		} else if (arg1 == 2) {
			this.field1336 = arg0.method532();
		} else if (arg1 == 5) {
			this.field1338 = false;
		} else if (arg1 == 7) {
			this.field1312 = arg0.method517();
		}
	}

	@ObfuscatedName("ia.e(I)V")
	public void method446() {
		if (this.field1312 != -1) {
			this.method450(this.field1312);
			this.field1322 = this.field1330;
			this.field1335 = this.field1332;
			this.field1315 = this.field1333;
		}
		this.method450(this.field1316);
	}

	@ObfuscatedName("ia.a(ILjd;I)V")
	public void method447(class66 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method532();
			if (var3 == 0) {
				return;
			}
			this.method445(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("ia.b(II)V")
	public void method450(int arg0) {
		double var2 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 & 0xFF) / 256.0D;
		double var6 = 0.0D;
		double var8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var10 = var8;
		double var12 = var8;
		if (var2 > var8) {
			var12 = var2;
		}
		if (var12 < var4) {
			var12 = var4;
		}
		double var14 = 0.0D;
		if (var2 < var8) {
			var10 = var2;
		}
		if (var10 > var4) {
			var10 = var4;
		}
		double var16 = (var10 + var12) / 2.0D;
		if (var12 != var10) {
			if (var16 < 0.5D) {
				var14 = (var12 - var10) / (var12 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var12 - var10) / (2.0D - var12 - var10);
			}
			if (var8 == var12) {
				var6 = (var2 - var4) / (var12 - var10);
			} else if (var12 == var2) {
				var6 = (var4 - var8) / (var12 - var10) + 2.0D;
			} else if (var12 == var4) {
				var6 = (var8 - var2) / (-var10 + var12) + 4.0D;
			}
		}
		double var18 = var6 / 6.0D;
		this.field1332 = (int) (var18 * 256.0D);
		this.field1333 = (int) (var14 * 256.0D);
		this.field1330 = (int) (var16 * 256.0D);
		if (this.field1333 < 0) {
			this.field1333 = 0;
		} else if (this.field1333 > 255) {
			this.field1333 = 255;
		}
		if (this.field1330 < 0) {
			this.field1330 = 0;
		} else if (this.field1330 > 255) {
			this.field1330 = 255;
		}
	}
}
