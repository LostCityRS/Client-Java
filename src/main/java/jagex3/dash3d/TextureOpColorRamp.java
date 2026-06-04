package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ub")
public final class TextureOpColorRamp extends TextureOp {

	@ObfuscatedName("ub.eb")
	public final int[] colorLut = new int[257];

	@ObfuscatedName("ub.V")
	public int[][] gradientStops;

	public TextureOpColorRamp() {
		super(1, false);
	}

	@ObfuscatedName("ub.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 != 0) {
			return;
		}
		int var3 = arg0.g1();
		if (var3 != 0) {
			this.loadPreset(var3);
			return;
		}
		this.gradientStops = new int[arg0.g1()][4];
		for (int var4 = 0; var4 < this.gradientStops.length; var4++) {
			this.gradientStops[var4][0] = arg0.g2();
			this.gradientStops[var4][1] = arg0.g1() << 4;
			this.gradientStops[var4][2] = arg0.g1() << 4;
			this.gradientStops[var4][3] = arg0.g1() << 4;
		}
	}

	@ObfuscatedName("ub.d(B)V")
	public void buildGradient() {
		int var1 = this.gradientStops.length;
		if (var1 <= 0) {
			return;
		}
		for (int var2 = 0; var2 < 257; var2++) {
			int var3 = 0;
			int var4 = var2 << 4;
			for (int var5 = 0; var1 > var5 && this.gradientStops[var5][0] <= var4; var5++) {
				var3++;
			}
			int var10;
			int var11;
			int var12;
			if (var1 > var3) {
				int[] var6 = this.gradientStops[var3];
				if (var3 > 0) {
					int[] var7 = this.gradientStops[var3 - 1];
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
				int[] var13 = this.gradientStops[var1 - 1];
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
			this.colorLut[var2] = var15 | var16 << 8 | var14 << 16;
		}
	}

	@ObfuscatedName("ub.a(BI)V")
	public void loadPreset(int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.gradientStops = new int[2][4];
			this.gradientStops[0][2] = 0;
			this.gradientStops[0][0] = 0;
			this.gradientStops[0][3] = 0;
			this.gradientStops[1][3] = 4096;
			this.gradientStops[0][1] = 0;
			this.gradientStops[1][0] = 4096;
			this.gradientStops[1][1] = 4096;
			this.gradientStops[1][2] = 4096;
		} else if (arg0 == 2) {
			this.gradientStops = new int[8][4];
			this.gradientStops[0][3] = 2361;
			this.gradientStops[0][0] = 0;
			this.gradientStops[0][1] = 2650;
			this.gradientStops[1][0] = 2867;
			this.gradientStops[1][3] = 1558;
			this.gradientStops[1][1] = 2313;
			this.gradientStops[2][1] = 2618;
			this.gradientStops[3][1] = 2296;
			this.gradientStops[4][1] = 2072;
			this.gradientStops[0][2] = 2602;
			this.gradientStops[2][3] = 1413;
			this.gradientStops[2][0] = 3072;
			this.gradientStops[3][0] = 3276;
			this.gradientStops[5][1] = 2730;
			this.gradientStops[6][1] = 2232;
			this.gradientStops[7][1] = 1686;
			this.gradientStops[3][3] = 947;
			this.gradientStops[1][2] = 1799;
			this.gradientStops[4][3] = 722;
			this.gradientStops[2][2] = 1734;
			this.gradientStops[5][3] = 1766;
			this.gradientStops[4][0] = 3481;
			this.gradientStops[3][2] = 1220;
			this.gradientStops[6][3] = 915;
			this.gradientStops[4][2] = 963;
			this.gradientStops[5][2] = 2152;
			this.gradientStops[7][3] = 1140;
			this.gradientStops[6][2] = 1060;
			this.gradientStops[7][2] = 1413;
			this.gradientStops[5][0] = 3686;
			this.gradientStops[6][0] = 3891;
			this.gradientStops[7][0] = 4096;
		} else if (arg0 == 3) {
			this.gradientStops = new int[7][4];
			this.gradientStops[0][3] = 4096;
			this.gradientStops[0][0] = 0;
			this.gradientStops[0][2] = 0;
			this.gradientStops[0][1] = 0;
			this.gradientStops[1][2] = 4096;
			this.gradientStops[1][0] = 663;
			this.gradientStops[1][1] = 0;
			this.gradientStops[2][2] = 4096;
			this.gradientStops[1][3] = 4096;
			this.gradientStops[2][1] = 0;
			this.gradientStops[3][2] = 4096;
			this.gradientStops[2][3] = 0;
			this.gradientStops[4][2] = 0;
			this.gradientStops[3][1] = 4096;
			this.gradientStops[4][1] = 4096;
			this.gradientStops[2][0] = 1363;
			this.gradientStops[5][1] = 4096;
			this.gradientStops[6][1] = 0;
			this.gradientStops[3][0] = 2048;
			this.gradientStops[3][3] = 0;
			this.gradientStops[5][2] = 0;
			this.gradientStops[6][2] = 0;
			this.gradientStops[4][0] = 2727;
			this.gradientStops[4][3] = 0;
			this.gradientStops[5][3] = 4096;
			this.gradientStops[5][0] = 3411;
			this.gradientStops[6][0] = 4096;
			this.gradientStops[6][3] = 4096;
		} else if (arg0 == 4) {
			this.gradientStops = new int[6][4];
			this.gradientStops[0][0] = 0;
			this.gradientStops[1][0] = 1843;
			this.gradientStops[0][3] = 0;
			this.gradientStops[1][3] = 1493;
			this.gradientStops[0][2] = 0;
			this.gradientStops[2][0] = 2457;
			this.gradientStops[0][1] = 0;
			this.gradientStops[3][0] = 2781;
			this.gradientStops[1][2] = 0;
			this.gradientStops[2][3] = 2939;
			this.gradientStops[3][3] = 3565;
			this.gradientStops[2][2] = 0;
			this.gradientStops[4][3] = 4031;
			this.gradientStops[4][0] = 3481;
			this.gradientStops[1][1] = 0;
			this.gradientStops[5][0] = 4096;
			this.gradientStops[2][1] = 0;
			this.gradientStops[3][2] = 1124;
			this.gradientStops[3][1] = 0;
			this.gradientStops[4][2] = 3084;
			this.gradientStops[4][1] = 546;
			this.gradientStops[5][3] = 4096;
			this.gradientStops[5][1] = 4096;
			this.gradientStops[5][2] = 4096;
		} else if (arg0 == 5) {
			this.gradientStops = new int[16][4];
			this.gradientStops[0][3] = 321;
			this.gradientStops[1][3] = 562;
			this.gradientStops[2][3] = 803;
			this.gradientStops[3][3] = 1140;
			this.gradientStops[0][1] = 80;
			this.gradientStops[4][3] = 1509;
			this.gradientStops[1][1] = 321;
			this.gradientStops[0][0] = 0;
			this.gradientStops[5][3] = 1413;
			this.gradientStops[0][2] = 192;
			this.gradientStops[6][3] = 1333;
			this.gradientStops[1][2] = 449;
			this.gradientStops[2][2] = 690;
			this.gradientStops[2][1] = 578;
			this.gradientStops[7][3] = 1702;
			this.gradientStops[8][3] = 2056;
			this.gradientStops[1][0] = 155;
			this.gradientStops[9][3] = 2666;
			this.gradientStops[3][2] = 995;
			this.gradientStops[10][3] = 3276;
			this.gradientStops[2][0] = 389;
			this.gradientStops[3][1] = 947;
			this.gradientStops[4][1] = 1285;
			this.gradientStops[11][3] = 3228;
			this.gradientStops[3][0] = 671;
			this.gradientStops[12][3] = 3196;
			this.gradientStops[5][1] = 1525;
			this.gradientStops[4][0] = 897;
			this.gradientStops[13][3] = 3019;
			this.gradientStops[6][1] = 1734;
			this.gradientStops[7][1] = 1413;
			this.gradientStops[14][3] = 3228;
			this.gradientStops[4][2] = 1397;
			this.gradientStops[5][0] = 1175;
			this.gradientStops[8][1] = 1108;
			this.gradientStops[5][2] = 1429;
			this.gradientStops[15][3] = 2746;
			this.gradientStops[6][2] = 1461;
			this.gradientStops[6][0] = 1368;
			this.gradientStops[7][0] = 1507;
			this.gradientStops[7][2] = 1525;
			this.gradientStops[8][2] = 1590;
			this.gradientStops[9][1] = 1766;
			this.gradientStops[8][0] = 1736;
			this.gradientStops[9][0] = 2088;
			this.gradientStops[10][0] = 2355;
			this.gradientStops[11][0] = 2691;
			this.gradientStops[12][0] = 3031;
			this.gradientStops[10][1] = 2409;
			this.gradientStops[9][2] = 2056;
			this.gradientStops[11][1] = 3116;
			this.gradientStops[13][0] = 3522;
			this.gradientStops[12][1] = 3806;
			this.gradientStops[13][1] = 3437;
			this.gradientStops[14][1] = 3116;
			this.gradientStops[14][0] = 3727;
			this.gradientStops[15][1] = 2377;
			this.gradientStops[10][2] = 2586;
			this.gradientStops[15][0] = 4096;
			this.gradientStops[11][2] = 3148;
			this.gradientStops[12][2] = 3710;
			this.gradientStops[13][2] = 3421;
			this.gradientStops[14][2] = 3148;
			this.gradientStops[15][2] = 2505;
		} else if (arg0 == 6) {
			this.gradientStops = new int[4][4];
			this.gradientStops[0][1] = 0;
			this.gradientStops[1][1] = 4096;
			this.gradientStops[2][1] = 4096;
			this.gradientStops[0][0] = 2048;
			this.gradientStops[3][1] = 4096;
			this.gradientStops[0][3] = 0;
			this.gradientStops[1][3] = 0;
			this.gradientStops[0][2] = 4096;
			this.gradientStops[1][2] = 4096;
			this.gradientStops[2][3] = 0;
			this.gradientStops[3][3] = 0;
			this.gradientStops[2][2] = 4096;
			this.gradientStops[3][2] = 0;
			this.gradientStops[1][0] = 2867;
			this.gradientStops[2][0] = 3276;
			this.gradientStops[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@ObfuscatedName("ub.b(B)V")
	@Override
	public void postDecode() {
		if (this.gradientStops == null) {
			this.loadPreset(1);
		}
		this.buildGradient();
	}

	@ObfuscatedName("ub.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310) {
			int[] var3 = this.getInputMono(arg0, 0);
			int[] var4 = var2[0];
			int[] var5 = var2[1];
			int[] var6 = var2[2];
			for (int var7 = 0; var7 < Texture.field1276; var7++) {
				int var8 = var3[var7] >> 4;
				if (var8 < 0) {
					var8 = 0;
				}
				if (var8 > 256) {
					var8 = 256;
				}
				int var9 = this.colorLut[var8];
				var4[var7] = var9 >> 12 & 0xFF0;
				var5[var7] = var9 >> 4 & 0xFF0;
				var6[var7] = (var9 & 0xFF) << 4;
			}
		}
		return var2;
	}
}
