package deob;

@ObfuscatedName("eb")
public final class class31 {

	@ObfuscatedName("eb.a")
	public long field588;

	@ObfuscatedName("eb.c")
	public static int[][] field590;

	@ObfuscatedName("eb.f")
	public static class156 field593 = new class156(4096);

	@ObfuscatedName("eb.g")
	public int[] field594;

	@ObfuscatedName("eb.h")
	public static class32 field595 = class73.method593("hitmarks", true);

	@ObfuscatedName("eb.j")
	public int[] field597;

	@ObfuscatedName("eb.m")
	public int field600;

	@ObfuscatedName("eb.n")
	public long field601;

	@ObfuscatedName("eb.s")
	public boolean field606;

	@ObfuscatedName("eb.w")
	public static volatile long field610 = 0L;

	@ObfuscatedName("eb.x")
	public static int[] field611 = new int[256];

	@ObfuscatedName("eb.y")
	public static class32 field612 = class73.method593("RuneScape wird geladen )2 bitte warten)3)3)3", true);

	@ObfuscatedName("eb.B")
	public static int field615;

	@ObfuscatedName("eb.D")
	public static class32 field617;

	@ObfuscatedName("eb.A")
	public static int[] field614;

	@ObfuscatedName("eb.C")
	public static int[] field616;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field611[var0] = var1;
		}
		field615 = 0;
		field617 = class73.method593("Ladevorgang )2 bitte warten Sie)3", true);
		field614 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	}

	@ObfuscatedName("eb.a(I)I")
	public static int method223() {
		return class139.field3209++;
	}

	@ObfuscatedName("eb.b(I)V")
	public static void method225() {
		field616 = null;
		field614 = null;
		field595 = null;
		field611 = null;
		field617 = null;
		field593 = null;
		field590 = null;
		field612 = null;
	}

	@ObfuscatedName("eb.a(III)V")
	public static void method226(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		class110 var4 = (class110) class132.field3029.method1196(var2);
		if (var4 != null) {
			class126.field2918.method1168(var4);
		}
	}

	@ObfuscatedName("eb.a(BILqd;)V")
	public static void method227(int arg0, class115 arg1) {
		if (arg1.field2730 > class140.field3217) {
			class89.method676(arg1);
		} else if (arg1.field2724 >= class140.field3217) {
			class15.method101(arg1);
		} else {
			class145.method1087(arg1);
		}
		if (arg1.field2747 < 128 || arg1.field2698 < 128 || arg1.field2747 >= 13184 || arg1.field2698 >= 13184) {
			arg1.field2747 = arg1.field2759[0] * 128 + arg1.field2711 * 64;
			arg1.field2698 = arg1.field2711 * 64 + arg1.field2736[0] * 128;
			arg1.field2712 = -1;
			arg1.field2724 = 0;
			arg1.field2731 = -1;
			arg1.field2730 = 0;
			arg1.method905();
		}
		if (arg1 == class20.field373 && (arg1.field2747 < 1536 || arg1.field2698 < 1536 || arg1.field2747 >= 11776 || arg1.field2698 >= 11776)) {
			arg1.field2724 = 0;
			arg1.field2747 = arg1.field2759[0] * 128 + arg1.field2711 * 64;
			arg1.field2731 = -1;
			arg1.field2730 = 0;
			arg1.field2698 = arg1.field2711 * 64 + arg1.field2736[0] * 128;
			arg1.field2712 = -1;
			arg1.method905();
		}
		class57.method444(arg1);
		class144.method1082(arg1);
	}

	@ObfuscatedName("eb.a(Ljd;I)V")
	public void method222(class66 arg0) {
		arg0.method514(this.field606 ? 1 : 0);
		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.field594[class102.field2400[var2]];
			if (var3 == 0) {
				arg0.method514(-1);
			} else {
				arg0.method514(var3 - 256);
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			arg0.method514(this.field597[var4]);
		}
	}

	@ObfuscatedName("eb.a(IZ)V")
	public void method224(boolean arg0) {
		if (this.field606 != arg0) {
			this.method232(this.field597, -1, null, arg0);
		}
	}

	@ObfuscatedName("eb.c(I)V")
	public void method228() {
		long var1 = this.field588;
		this.field588 = 0L;
		int var3 = this.field594[5];
		int var4 = this.field594[9];
		this.field594[9] = var3;
		this.field594[5] = var4;
		for (int var5 = 0; var5 < 12; var5++) {
			this.field588 <<= 0x4;
			if (this.field594[var5] >= 256) {
				this.field588 += this.field594[var5] - 256;
			}
		}
		if (this.field594[0] >= 256) {
			this.field588 += this.field594[0] - 256 >> 4;
		}
		if (this.field594[1] >= 256) {
			this.field588 += this.field594[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.field588 <<= 0x3;
			this.field588 += this.field597[var6];
		}
		this.field588 <<= 0x1;
		this.field588 += this.field606 ? 1 : 0;
		this.field594[9] = var4;
		this.field594[5] = var3;
		if (var1 != 0L && this.field588 != var1) {
			class38.field925.method486(var1);
		}
	}

	@ObfuscatedName("eb.a(BIZ)V")
	public void method229(int arg0, boolean arg1) {
		if (arg0 == 1 && this.field606) {
			return;
		}
		int var3 = this.field594[class102.field2400[arg0]];
		if (var3 == 0) {
			return;
		}
		var3 -= 256;
		class65 var4;
		do {
			if (arg1) {
				var3++;
				if (class91.field2081 <= var3) {
					var3 = 0;
				}
			} else {
				var3--;
				if (var3 < 0) {
					var3 = class91.field2081 - 1;
				}
			}
			var4 = class134.method1020(var3);
		} while (var4 == null || var4.field1504 || (this.field606 ? 7 : 0) + arg0 != var4.field1515);
		this.field594[class102.field2400[arg0]] = var3 + 256;
		this.method228();
	}

	@ObfuscatedName("eb.d(I)Lp;")
	public class104 method230() {
		if (this.field600 != -1) {
			return class17.method130(this.field600).method752();
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field594[var2];
			if (var3 >= 256 && var3 < 512 && !class134.method1020(var3 - 256).method498()) {
				var1 = true;
			}
			if (var3 >= 512 && !class146.method1092(var3 - 512).method467(this.field606)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		class104[] var4 = new class104[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.field594[var6];
			if (var7 >= 256 && var7 < 512) {
				class104 var8 = class134.method1020(var7 - 256).method502();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				class104 var9 = class146.method1092(var7 - 512).method473(this.field606);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		class104 var10 = new class104(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (class140.field3218[var11].length > this.field597[var11]) {
				var10.method833(class8.field141[var11], class140.field3218[var11][this.field597[var11]]);
			}
			if (class106.field2505[var11].length > this.field597[var11]) {
				var10.method833(class41.field950[var11], class106.field2505[var11][this.field597[var11]]);
			}
		}
		return var10;
	}

	@ObfuscatedName("eb.a(IZI)V")
	public void method231(boolean arg0, int arg1) {
		int var3 = this.field597[arg1];
		if (arg0) {
			var3++;
			if (var3 >= class140.field3218[arg1].length) {
				var3 = 0;
			}
		} else {
			var3--;
			if (var3 < 0) {
				var3 = class140.field3218[arg1].length - 1;
			}
		}
		this.field597[arg1] = var3;
		this.method228();
	}

	@ObfuscatedName("eb.a([II[IZB)V")
	public void method232(int[] arg0, int arg1, int[] arg2, boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < class91.field2081; var6++) {
					class65 var7 = class134.method1020(var6);
					if (var7 != null && !var7.field1504 && var5 + (arg3 ? 7 : 0) == var7.field1515) {
						arg2[class102.field2400[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.field600 = arg1;
		this.field594 = arg2;
		this.field597 = arg0;
		this.field606 = arg3;
		this.method228();
	}

	@ObfuscatedName("eb.a(Lvc;ILvc;II)Lod;")
	public class101 method233(class149 arg0, int arg1, class149 arg2, int arg3) {
		if (this.field600 != -1) {
			return class17.method130(this.field600).method761(arg2, arg3, arg0, arg1);
		}
		long var5 = this.field588;
		int[] var7 = this.field594;
		if (arg0 != null && (arg0.field3390 >= 0 || arg0.field3366 >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.field594[var8];
			}
			if (arg0.field3390 >= 0) {
				var5 += arg0.field3390 - this.field594[5] << 8;
				var7[5] = arg0.field3390;
			}
			if (arg0.field3366 >= 0) {
				var5 += arg0.field3366 - this.field594[3] << 16;
				var7[3] = arg0.field3366;
			}
		}
		class101 var9 = (class101) class38.field925.method485(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if (var12 >= 256 && var12 < 512 && !class134.method1020(var12 - 256).method495()) {
					var10 = true;
				}
				if (var12 >= 512 && !class146.method1092(var12 - 512).method479(this.field606)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.field601 != -1L) {
					var9 = (class101) class38.field925.method485(this.field601);
				}
				if (var9 == null) {
					return null;
				}
			}
			if (var9 == null) {
				class104[] var13 = new class104[12];
				int var14 = 0;
				for (int var15 = 0; var15 < 12; var15++) {
					int var16 = var7[var15];
					if (var16 >= 256 && var16 < 512) {
						class104 var17 = class134.method1020(var16 - 256).method500();
						if (var17 != null) {
							var13[var14++] = var17;
						}
					}
					if (var16 >= 512) {
						class104 var18 = class146.method1092(var16 - 512).method469(this.field606);
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				class104 var19 = new class104(var13, var14);
				for (int var20 = 0; var20 < 5; var20++) {
					if (this.field597[var20] < class140.field3218[var20].length) {
						var19.method833(class8.field141[var20], class140.field3218[var20][this.field597[var20]]);
					}
					if (this.field597[var20] < class106.field2505[var20].length) {
						var19.method833(class41.field950[var20], class106.field2505[var20][this.field597[var20]]);
					}
				}
				var9 = var19.method847(64, 850, -30, -50, -30);
				class38.field925.method484(var5, var9);
				this.field601 = var5;
			}
		}
		if (arg0 == null && arg2 == null) {
			return var9;
		}
		class101 var21;
		if (arg0 != null && arg2 != null) {
			var21 = arg0.method1114(arg1, arg2, var9, arg3);
		} else if (arg0 == null) {
			var21 = arg2.method1116(var9, arg1);
		} else {
			var21 = arg0.method1116(var9, arg3);
		}
		return var21;
	}

	@ObfuscatedName("eb.e(I)I")
	public int method234() {
		return this.field600 == -1 ? (this.field594[0] << 15) + ((this.field597[0] << 25) + (this.field597[4] << 20) + (this.field594[8] << 10)) + (this.field594[11] << 5) + this.field594[1] : class17.method130(this.field600).field2224 + 305419896;
	}
}
