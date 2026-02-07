package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.util.MathTool;

@ObfuscatedName("ed")
public final class Decimator {

	@ObfuscatedName("ed.c")
	public int field682;

	@ObfuscatedName("ed.i")
	public int[][] field688;

	@ObfuscatedName("ed.n")
	public int field693;

	public Decimator(int arg0, int arg1) {
		if (arg1 != 22050) {
			int var3 = MathTool.hcf(22050, arg1);
			int var4 = 22050 / var3;
			this.field688 = new int[var4][14];
			this.field693 = var4;
			int var5 = arg1 / var3;
			this.field682 = var5;
			for (int var6 = 0; var6 < var4; var6++) {
				int[] var7 = this.field688[var6];
				double var8 = (double) var6 / (double) var4 + 6.0D;
				int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
				int var11 = (int) Math.ceil(var8 + 7.0D);
				if (var10 < 0) {
					var10 = 0;
				}
				double var12 = (double) var5 / (double) var4;
				if (var11 > 14) {
					var11 = 14;
				}
				while (var11 > var10) {
					double var14 = ((double) var10 - var8) * 3.141592653589793D;
					double var16 = var12;
					if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
						var16 = var12 * (Math.sin(var14) / var14);
					}
					double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
					var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
					var10++;
				}
			}
		}
	}

	@ObfuscatedName("ed.a([BB)[B")
	public byte[] method280(byte[] arg0) {
		if (this.field688 != null) {
			int var2 = (int) ((long) arg0.length * (long) this.field682 / (long) this.field693) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;
			for (int var6 = 0; var6 < arg0.length; var6++) {
				byte var7 = arg0[var6];
				int[] var8 = this.field688[var5];
				for (int var9 = 0; var9 < 14; var9++) {
					var3[var4 + var9] += var7 * var8[var9];
				}
				int var10 = var5 + this.field682;
				int var11 = var10 / this.field693;
				var4 += var11;
				var5 = var10 - var11 * this.field693;
			}
			arg0 = new byte[var2];
			for (int var12 = 0; var12 < var2; var12++) {
				int var13 = var3[var12] + 32768 >> 16;
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

	@ObfuscatedName("ed.a(II)I")
	public int method282(int arg0) {
		if (this.field688 != null) {
			arg0 = (int) ((long) this.field682 * (long) arg0 / (long) this.field693);
		}
		return arg0;
	}

	@ObfuscatedName("ed.a(BI)I")
	public int method284(int arg0) {
		if (this.field688 != null) {
			arg0 = (int) ((long) arg0 * (long) this.field682 / (long) this.field693) + 6;
		}
		return arg0;
	}
}
