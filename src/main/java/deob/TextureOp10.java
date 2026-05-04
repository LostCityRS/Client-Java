package deob;

@ObfuscatedName("ub")
public final class TextureOp10 extends TextureOp {

	@ObfuscatedName("ub.eb")
	public final int[] field4162 = new int[257];

	@ObfuscatedName("ub.V")
	public int[][] field4153;

	public TextureOp10() {
		super(1, false);
	}

	@ObfuscatedName("ub.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 != 0) {
			return;
		}
		int var3 = arg0.g1();
		if (var3 != 0) {
			this.method1487(var3);
			return;
		}
		this.field4153 = new int[arg0.g1()][4];
		for (int var4 = 0; var4 < this.field4153.length; var4++) {
			this.field4153[var4][0] = arg0.g2();
			this.field4153[var4][1] = arg0.g1() << 4;
			this.field4153[var4][2] = arg0.g1() << 4;
			this.field4153[var4][3] = arg0.g1() << 4;
		}
	}

	@ObfuscatedName("ub.d(B)V")
	public void method1485() {
		int var1 = this.field4153.length;
		if (var1 <= 0) {
			return;
		}
		for (int var2 = 0; var2 < 257; var2++) {
			int var3 = 0;
			int var4 = var2 << 4;
			for (int var5 = 0; var1 > var5 && this.field4153[var5][0] <= var4; var5++) {
				var3++;
			}
			int var10;
			int var11;
			int var12;
			if (var1 > var3) {
				int[] var6 = this.field4153[var3];
				if (var3 > 0) {
					int[] var7 = this.field4153[var3 - 1];
					int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
					int var9 = 4096 - var8;
					var10 = var8 * var6[3] + var7[3] * var9 >> 12;
					var11 = var8 * var6[1] + var9 * var7[1] >> 12;
					var12 = var8 * var6[2] + var9 * var7[2] >> 12;
				} else {
					var12 = var6[2];
					var11 = var6[1];
					var10 = var6[3];
				}
			} else {
				int[] var13 = this.field4153[var1 - 1];
				var12 = var13[2];
				var11 = var13[1];
				var10 = var13[3];
			}
			int var14 = var11 >> 4;
			int var15 = var10 >> 4;
			int var16 = var12 >> 4;
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 255) {
				var14 = 255;
			}
			if (var16 < 0) {
				var16 = 0;
			} else if (var16 > 255) {
				var16 = 255;
			}
			if (var15 < 0) {
				var15 = 0;
			} else if (var15 > 255) {
				var15 = 255;
			}
			this.field4162[var2] = var15 | var16 << 8 | var14 << 16;
		}
	}

	@ObfuscatedName("ub.a(BI)V")
	public void method1487(int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.field4153 = new int[2][4];
			this.field4153[0][2] = 0;
			this.field4153[0][0] = 0;
			this.field4153[0][3] = 0;
			this.field4153[1][3] = 4096;
			this.field4153[0][1] = 0;
			this.field4153[1][0] = 4096;
			this.field4153[1][1] = 4096;
			this.field4153[1][2] = 4096;
		} else if (arg0 == 2) {
			this.field4153 = new int[8][4];
			this.field4153[0][3] = 2361;
			this.field4153[0][0] = 0;
			this.field4153[0][1] = 2650;
			this.field4153[1][0] = 2867;
			this.field4153[1][3] = 1558;
			this.field4153[1][1] = 2313;
			this.field4153[2][1] = 2618;
			this.field4153[3][1] = 2296;
			this.field4153[4][1] = 2072;
			this.field4153[0][2] = 2602;
			this.field4153[2][3] = 1413;
			this.field4153[2][0] = 3072;
			this.field4153[3][0] = 3276;
			this.field4153[5][1] = 2730;
			this.field4153[6][1] = 2232;
			this.field4153[7][1] = 1686;
			this.field4153[3][3] = 947;
			this.field4153[1][2] = 1799;
			this.field4153[4][3] = 722;
			this.field4153[2][2] = 1734;
			this.field4153[5][3] = 1766;
			this.field4153[4][0] = 3481;
			this.field4153[3][2] = 1220;
			this.field4153[6][3] = 915;
			this.field4153[4][2] = 963;
			this.field4153[5][2] = 2152;
			this.field4153[7][3] = 1140;
			this.field4153[6][2] = 1060;
			this.field4153[7][2] = 1413;
			this.field4153[5][0] = 3686;
			this.field4153[6][0] = 3891;
			this.field4153[7][0] = 4096;
		} else if (arg0 == 3) {
			this.field4153 = new int[7][4];
			this.field4153[0][3] = 4096;
			this.field4153[0][0] = 0;
			this.field4153[0][2] = 0;
			this.field4153[0][1] = 0;
			this.field4153[1][2] = 4096;
			this.field4153[1][0] = 663;
			this.field4153[1][1] = 0;
			this.field4153[2][2] = 4096;
			this.field4153[1][3] = 4096;
			this.field4153[2][1] = 0;
			this.field4153[3][2] = 4096;
			this.field4153[2][3] = 0;
			this.field4153[4][2] = 0;
			this.field4153[3][1] = 4096;
			this.field4153[4][1] = 4096;
			this.field4153[2][0] = 1363;
			this.field4153[5][1] = 4096;
			this.field4153[6][1] = 0;
			this.field4153[3][0] = 2048;
			this.field4153[3][3] = 0;
			this.field4153[5][2] = 0;
			this.field4153[6][2] = 0;
			this.field4153[4][0] = 2727;
			this.field4153[4][3] = 0;
			this.field4153[5][3] = 4096;
			this.field4153[5][0] = 3411;
			this.field4153[6][0] = 4096;
			this.field4153[6][3] = 4096;
		} else if (arg0 == 4) {
			this.field4153 = new int[6][4];
			this.field4153[0][0] = 0;
			this.field4153[1][0] = 1843;
			this.field4153[0][3] = 0;
			this.field4153[1][3] = 1493;
			this.field4153[0][2] = 0;
			this.field4153[2][0] = 2457;
			this.field4153[0][1] = 0;
			this.field4153[3][0] = 2781;
			this.field4153[1][2] = 0;
			this.field4153[2][3] = 2939;
			this.field4153[3][3] = 3565;
			this.field4153[2][2] = 0;
			this.field4153[4][3] = 4031;
			this.field4153[4][0] = 3481;
			this.field4153[1][1] = 0;
			this.field4153[5][0] = 4096;
			this.field4153[2][1] = 0;
			this.field4153[3][2] = 1124;
			this.field4153[3][1] = 0;
			this.field4153[4][2] = 3084;
			this.field4153[4][1] = 546;
			this.field4153[5][3] = 4096;
			this.field4153[5][1] = 4096;
			this.field4153[5][2] = 4096;
		} else if (arg0 == 5) {
			this.field4153 = new int[16][4];
			this.field4153[0][3] = 321;
			this.field4153[1][3] = 562;
			this.field4153[2][3] = 803;
			this.field4153[3][3] = 1140;
			this.field4153[0][1] = 80;
			this.field4153[4][3] = 1509;
			this.field4153[1][1] = 321;
			this.field4153[0][0] = 0;
			this.field4153[5][3] = 1413;
			this.field4153[0][2] = 192;
			this.field4153[6][3] = 1333;
			this.field4153[1][2] = 449;
			this.field4153[2][2] = 690;
			this.field4153[2][1] = 578;
			this.field4153[7][3] = 1702;
			this.field4153[8][3] = 2056;
			this.field4153[1][0] = 155;
			this.field4153[9][3] = 2666;
			this.field4153[3][2] = 995;
			this.field4153[10][3] = 3276;
			this.field4153[2][0] = 389;
			this.field4153[3][1] = 947;
			this.field4153[4][1] = 1285;
			this.field4153[11][3] = 3228;
			this.field4153[3][0] = 671;
			this.field4153[12][3] = 3196;
			this.field4153[5][1] = 1525;
			this.field4153[4][0] = 897;
			this.field4153[13][3] = 3019;
			this.field4153[6][1] = 1734;
			this.field4153[7][1] = 1413;
			this.field4153[14][3] = 3228;
			this.field4153[4][2] = 1397;
			this.field4153[5][0] = 1175;
			this.field4153[8][1] = 1108;
			this.field4153[5][2] = 1429;
			this.field4153[15][3] = 2746;
			this.field4153[6][2] = 1461;
			this.field4153[6][0] = 1368;
			this.field4153[7][0] = 1507;
			this.field4153[7][2] = 1525;
			this.field4153[8][2] = 1590;
			this.field4153[9][1] = 1766;
			this.field4153[8][0] = 1736;
			this.field4153[9][0] = 2088;
			this.field4153[10][0] = 2355;
			this.field4153[11][0] = 2691;
			this.field4153[12][0] = 3031;
			this.field4153[10][1] = 2409;
			this.field4153[9][2] = 2056;
			this.field4153[11][1] = 3116;
			this.field4153[13][0] = 3522;
			this.field4153[12][1] = 3806;
			this.field4153[13][1] = 3437;
			this.field4153[14][1] = 3116;
			this.field4153[14][0] = 3727;
			this.field4153[15][1] = 2377;
			this.field4153[10][2] = 2586;
			this.field4153[15][0] = 4096;
			this.field4153[11][2] = 3148;
			this.field4153[12][2] = 3710;
			this.field4153[13][2] = 3421;
			this.field4153[14][2] = 3148;
			this.field4153[15][2] = 2505;
		} else if (arg0 == 6) {
			this.field4153 = new int[4][4];
			this.field4153[0][1] = 0;
			this.field4153[1][1] = 4096;
			this.field4153[2][1] = 4096;
			this.field4153[0][0] = 2048;
			this.field4153[3][1] = 4096;
			this.field4153[0][3] = 0;
			this.field4153[1][3] = 0;
			this.field4153[0][2] = 4096;
			this.field4153[1][2] = 4096;
			this.field4153[2][3] = 0;
			this.field4153[3][3] = 0;
			this.field4153[2][2] = 4096;
			this.field4153[3][2] = 0;
			this.field4153[1][0] = 2867;
			this.field4153[2][0] = 3276;
			this.field4153[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@ObfuscatedName("ub.b(B)V")
	@Override
	public void method123() {
		if (this.field4153 == null) {
			this.method1487(1);
		}
		this.method1485();
	}

	@ObfuscatedName("ub.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = this.method120(arg0, 0);
			int[] var4 = var2[0];
			int[] var5 = var2[1];
			int[] var6 = var2[2];
			for (int var7 = 0; var7 < Statics.field1276; var7++) {
				int var8 = var3[var7] >> 4;
				if (var8 < 0) {
					var8 = 0;
				}
				if (var8 > 256) {
					var8 = 256;
				}
				int var9 = this.field4162[var8];
				var4[var7] = var9 >> 12 & 0xFF0;
				var5[var7] = var9 >> 4 & 0xFF0;
				var6[var7] = (var9 & 0xFF) << 4;
			}
		}
		return var2;
	}
}
