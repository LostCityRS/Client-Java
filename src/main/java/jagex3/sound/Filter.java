package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("r")
public final class Filter {

	@ObfuscatedName("r.a")
	public final int[][][] frequencies = new int[2][2][4];

	@ObfuscatedName("r.b")
	public static int reduceCoeffInt;

	@ObfuscatedName("r.c")
	public final int[][][] ranges = new int[2][2][4];

	@ObfuscatedName("r.d")
	public final int[] unities = new int[2];

	@ObfuscatedName("r.e")
	public static float reduceCoeff;

	@ObfuscatedName("r.f")
	public static final int[][] coeffInt = new int[2][8];

	@ObfuscatedName("r.g")
	public final int[] pairs = new int[2];

	@ObfuscatedName("r.h")
	public static final float[][] coeff = new float[2][8];

	@ObfuscatedName("r.a(F)F")
	public static float frequency(float arg0) {
		float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("r.a(IIF)F")
	public float frequency(int arg0, int arg1, float arg2) {
		float var4 = (float) this.frequencies[arg0][0][arg1] + arg2 * (float) (this.frequencies[arg0][1][arg1] - this.frequencies[arg0][0][arg1]);
		float var5 = var4 * 1.2207031E-4F;
		return frequency(var5);
	}

	@ObfuscatedName("r.b(IIF)F")
	public float radius(int arg0, int arg1, float arg2) {
		float var4 = (float) this.ranges[arg0][0][arg1] + arg2 * (float) (this.ranges[arg0][1][arg1] - this.ranges[arg0][0][arg1]);
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	@ObfuscatedName("r.a(IF)I")
	public int calculateCoeffs(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (float) this.unities[0] + (float) (this.unities[1] - this.unities[0]) * arg1;
			float var4 = var3 * 0.0030517578F;
			reduceCoeff = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			reduceCoeffInt = (int) (reduceCoeff * 65536.0F);
		}
		if (this.pairs[arg0] == 0) {
			return 0;
		}
		float var5 = this.radius(arg0, 0, arg1);
		coeff[arg0][0] = -2.0F * var5 * (float) Math.cos((double) this.frequency(arg0, 0, arg1));
		coeff[arg0][1] = var5 * var5;
		for (int var6 = 1; var6 < this.pairs[arg0]; var6++) {
			float var7 = this.radius(arg0, var6, arg1);
			float var8 = -2.0F * var7 * (float) Math.cos((double) this.frequency(arg0, var6, arg1));
			float var9 = var7 * var7;
			coeff[arg0][var6 * 2 + 1] = coeff[arg0][var6 * 2 - 1] * var9;
			coeff[arg0][var6 * 2] = coeff[arg0][var6 * 2 - 1] * var8 + coeff[arg0][var6 * 2 - 2] * var9;
			for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
				coeff[arg0][var10] += coeff[arg0][var10 - 1] * var8 + coeff[arg0][var10 - 2] * var9;
			}
			coeff[arg0][1] += coeff[arg0][0] * var8 + var9;
			coeff[arg0][0] += var8;
		}
		if (arg0 == 0) {
			for (int var11 = 0; var11 < this.pairs[0] * 2; var11++) {
				coeff[0][var11] *= reduceCoeff;
			}
		}
		for (int var12 = 0; var12 < this.pairs[arg0] * 2; var12++) {
			coeffInt[arg0][var12] = (int) (coeff[arg0][var12] * 65536.0F);
		}
		return this.pairs[arg0] * 2;
	}

	@ObfuscatedName("r.a(Lea;Lvf;)V")
	public void load(Packet arg0, Envelope arg1) {
		int var3 = arg0.g1();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 0xF;
		if (var3 == 0) {
			this.unities[0] = this.unities[1] = 0;
			return;
		}
		this.unities[0] = arg0.g2();
		this.unities[1] = arg0.g2();
		int var4 = arg0.g1();
		for (int var5 = 0; var5 < 2; var5++) {
			for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
				this.frequencies[var5][0][var6] = arg0.g2();
				this.ranges[var5][0][var6] = arg0.g2();
			}
		}
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.pairs[var7]; var8++) {
				if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
					this.frequencies[var7][1][var8] = this.frequencies[var7][0][var8];
					this.ranges[var7][1][var8] = this.ranges[var7][0][var8];
				} else {
					this.frequencies[var7][1][var8] = arg0.g2();
					this.ranges[var7][1][var8] = arg0.g2();
				}
			}
		}
		if (var4 != 0 || this.unities[1] != this.unities[0]) {
			arg1.loadPoints(arg0);
		}
	}
}
