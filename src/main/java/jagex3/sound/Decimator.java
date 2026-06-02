package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.util.MathTool;

@ObfuscatedName("qe")
public final class Decimator {

	@ObfuscatedName("qe.a")
	public int outputRate;

	@ObfuscatedName("qe.b")
	public int[][] resampleTable;

	@ObfuscatedName("qe.l")
	public int inputRate;

	public Decimator(int arg0, int arg1) {
		if (arg1 != 22050) {
			int var3 = MathTool.hcf(arg1, 22050);
			int var4 = 22050 / var3;
			this.inputRate = var4;
			int var5 = arg1 / var3;
			this.resampleTable = new int[var4][14];
			this.outputRate = var5;
			for (int var6 = 0; var6 < var4; var6++) {
				int[] var7 = this.resampleTable[var6];
				double var8 = (double) var6 / (double) var4 + 6.0D;
				int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
				int var11 = (int) Math.ceil(var8 + 7.0D);
				if (var11 > 14) {
					var11 = 14;
				}
				if (var10 < 0) {
					var10 = 0;
				}
				double var12 = (double) var5 / (double) var4;
				while (var10 < var11) {
					double var14 = var12;
					double var16 = ((double) var10 - var8) * 3.141592653589793D;
					if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
						var14 = var12 * (Math.sin(var16) / var16);
					}
					double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
					var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
					var10++;
				}
			}
		}
	}

	@ObfuscatedName("qe.a(B[B)[B")
	public byte[] decimate(byte[] arg0) {
		if (this.resampleTable != null) {
			int var2 = (int) ((long) this.outputRate * (long) arg0.length / (long) this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;
			for (int var6 = 0; var6 < arg0.length; var6++) {
				byte var7 = arg0[var6];
				int[] var8 = this.resampleTable[var5];
				for (int var9 = 0; var9 < 14; var9++) {
					var3[var4 + var9] += var8[var9] * var7;
				}
				int var10 = var5 + this.outputRate;
				int var11 = var10 / this.inputRate;
				var5 = var10 - var11 * this.inputRate;
				var4 += var11;
			}
			arg0 = new byte[var2];
			for (int var12 = 0; var12 < var2; var12++) {
				int var13 = var3[var12] + 32768 >> 16;
				if (var13 < -128) {
					arg0[var12] = -128;
				} else if (var13 <= 127) {
					arg0[var12] = (byte) var13;
				} else {
					arg0[var12] = 127;
				}
			}
		}
		return arg0;
	}

	@ObfuscatedName("qe.a(II)I")
	public int transmitPos(int arg0) {
		if (this.resampleTable != null) {
			arg0 = (int) ((long) this.outputRate * (long) arg0 / (long) this.inputRate) + 6;
		}
		return arg0;
	}

	@ObfuscatedName("qe.b(II)I")
	public int transmitFreq(int arg0) {
		if (this.resampleTable != null) {
			arg0 = (int) ((long) this.outputRate * (long) arg0 / (long) this.inputRate);
		}
		return arg0;
	}
}
