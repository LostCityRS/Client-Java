package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public final class Filter {

	@ObfuscatedName("bc.c")
	public final int[] pairs = new int[2];

	@ObfuscatedName("bc.d")
	public final int[][][] frequencies = new int[2][2][4];

	@ObfuscatedName("bc.e")
	public final int[][][] ranges = new int[2][2][4];

	@ObfuscatedName("bc.f")
	public final int[] unities = new int[2];

	@ObfuscatedName("bc.g")
	public static final float[][] coeff = new float[2][8];

	@ObfuscatedName("bc.h")
	public static final int[][] coeffInt = new int[2][8];

	@ObfuscatedName("bc.i")
	public static float reduceCoeff;

	@ObfuscatedName("bc.j")
	public static int reduceCoeffInt;

	@ObfuscatedName("bc.a")
	public final boolean field898 = false;

	@ObfuscatedName("bc.b")
	public final int field899 = 2972;

	@ObfuscatedName("bc.a(IZFI)F")
	public float radius(int arg0, float arg1, int arg2) {
		float var4 = (float) ranges[arg2][0][arg0] + arg1 * (float) (ranges[arg2][1][arg0] - ranges[arg2][0][arg0]);
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	@ObfuscatedName("bc.a(IF)F")
	public float frequency(int arg0, float arg1) {
		if (arg0 != 2972) {
			throw new NullPointerException();
		}
		float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
		return var3 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(IIIF)F")
	public float frequency(int arg0, int arg1, float arg2) {
		float var4 = (float) frequencies[arg0][0][arg1] + arg2 * (float) (frequencies[arg0][1][arg1] - frequencies[arg0][0][arg1]);
		float var5 = var4 * 1.2207031E-4F;
		return frequency(field899, var5);
	}

	@ObfuscatedName("bc.a(IIF)I")
	public int calculateCoeffs(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (float) unities[0] + (float) (unities[1] - unities[0]) * arg1;
			float var4 = var3 * 0.0030517578F;
			reduceCoeff = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			reduceCoeffInt = (int) (reduceCoeff * 65536.0F);
		}
		if (pairs[arg0] == 0) {
			return 0;
		}
		float var5 = radius(0, arg1, arg0);
		coeff[arg0][0] = -2.0F * var5 * (float) Math.cos((double) frequency(arg0, 0, arg1));
		coeff[arg0][1] = var5 * var5;
		for (int var6 = 1; var6 < pairs[arg0]; var6++) {
			float var7 = radius(var6, arg1, arg0);
			float var8 = -2.0F * var7 * (float) Math.cos((double) frequency(arg0, var6, arg1));
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
			for (int var11 = 0; var11 < pairs[0] * 2; var11++) {
				coeff[0][var11] *= reduceCoeff;
			}
		}
		for (int var12 = 0; var12 < pairs[arg0] * 2; var12++) {
			coeffInt[arg0][var12] = (int) (coeff[arg0][var12] * 65536.0F);
		}
		return pairs[arg0] * 2;
	}

	@ObfuscatedName("bc.a(ILac;Llb;)V")
	public void load(int arg0, Envelope arg1, Packet arg2) {
		if (arg0 <= 0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		int var5 = arg2.g1();
		pairs[0] = var5 >> 4;
		pairs[1] = var5 & 0xF;
		if (var5 == 0) {
			unities[0] = unities[1] = 0;
			return;
		}
		unities[0] = arg2.g2();
		unities[1] = arg2.g2();
		int var6 = arg2.g1();
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < pairs[var7]; var8++) {
				frequencies[var7][0][var8] = arg2.g2();
				ranges[var7][0][var8] = arg2.g2();
			}
		}
		for (int var9 = 0; var9 < 2; var9++) {
			for (int var10 = 0; var10 < pairs[var9]; var10++) {
				if ((var6 & 0x1 << var9 * 4 << var10) == 0) {
					frequencies[var9][1][var10] = frequencies[var9][0][var10];
					ranges[var9][1][var10] = ranges[var9][0][var10];
				} else {
					frequencies[var9][1][var10] = arg2.g2();
					ranges[var9][1][var10] = arg2.g2();
				}
			}
		}
		if (var6 != 0 || unities[1] != unities[0]) {
			arg1.loadPoints(arg2);
		}
	}
}
