package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.util.MathTool;

@ObfuscatedName("qb")
public final class Decimator {

	@ObfuscatedName("qb.g")
	public int[][] resampleTable;

	@ObfuscatedName("qb.j")
	public final int inputRate;

	@ObfuscatedName("qb.l")
	public final int outputRate;

	@ObfuscatedName("qb.a(II)I")
	public int transmitPos(int arg0) {
		if (this.resampleTable != null) {
			arg0 = this.outputRate * arg0 / this.inputRate + 7;
		}
		return arg0;
	}

	@ObfuscatedName("qb.b(II)I")
	public int transmitFreq(int arg0) {
		if (this.resampleTable != null) {
			arg0 = this.outputRate * arg0 / this.inputRate;
		}
		return arg0;
	}

	@ObfuscatedName("qb.a([BZ)[B")
	public byte[] decimate(byte[] arg0) {
		if (this.resampleTable != null) {
			int var2 = arg0.length * this.outputRate / this.inputRate + 14;
			int var3 = 0;
			int[] var4 = new int[var2];
			int var5 = 0;
			for (int var6 = 0; var6 < arg0.length; var6++) {
				byte var7 = arg0[var6];
				int[] var8 = this.resampleTable[var5];
				for (int var9 = 0; var9 < 14; var9++) {
					var4[var3 + var9] += var8[var9] * var7;
				}
				int var10 = this.outputRate + var5;
				int var11 = var10 / this.inputRate;
				var5 = var10 - this.inputRate * var11;
				var3 += var11;
			}
			arg0 = new byte[var2];
			for (int var12 = 0; var12 < var2; var12++) {
				int var13 = var4[var12] + 32768 >> 16;
				if (var13 < -128) {
					arg0[var12] = -128;
				} else if (var13 > 127) {
					arg0[var12] = 127;
				} else {
					arg0[var12] = (byte) var13;
				}
			}
		}
		return arg0;
	}

	public Decimator(int arg0, int arg1) {
		int var3 = MathTool.hcf(arg1, 22050);
		int var4 = 22050 / var3;
		this.inputRate = var4;
		int var5 = arg1 / var3;
		this.outputRate = var5;
		if (var4 != var5) {
			this.resampleTable = new int[var4][14];
			for (int var6 = 0; var6 < var4; var6++) {
				int[] var7 = this.resampleTable[var6];
				double var8 = (double) var6 / (double) var4 + 6.0D;
				double var10 = (double) var5 / (double) var4;
				int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
				int var13 = (int) Math.ceil(var8 + 7.0D);
				if (var12 < 0) {
					var12 = 0;
				}
				if (var13 > 14) {
					var13 = 14;
				}
				while (var13 > var12) {
					double var14 = var10;
					double var16 = ((double) var12 - var8) * 3.141592653589793D;
					if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var16) / var16);
					}
					double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
					var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
					var12++;
				}
			}
		}
	}
}
