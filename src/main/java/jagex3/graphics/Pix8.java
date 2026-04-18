package jagex3.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("e")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("e.zb")
	public int wi;

	@ObfuscatedName("e.Bb")
	public int owi;

	@ObfuscatedName("e.Eb")
	public int hi;

	@ObfuscatedName("e.Cb")
	public int ohi;

	@ObfuscatedName("e.Fb")
	public int yof;

	@ObfuscatedName("e.Gb")
	public int xof;

	@ObfuscatedName("e.Db")
	public byte[] data;

	@ObfuscatedName("e.Ab")
	public int[] bpal;

	@ObfuscatedName("e.d()Le;")
	public Pix8 method328() {
		Pix8 var1 = new Pix8(this.wi, this.hi, this.bpal.length);
		var1.owi = this.owi;
		var1.ohi = this.ohi;
		var1.xof = this.xof;
		var1.yof = this.yof;
		int var2 = this.data.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1.data[var3] = this.data[var3];
		}
		int var4 = this.bpal.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var1.bpal[var5] = this.bpal[var5];
		}
		return var1;
	}

	@ObfuscatedName("e.a(II)V")
	public void method329(int arg0, int arg1) {
		int var3 = this.xof + arg0;
		int var4 = this.yof + arg1;
		int var5 = Pix2D.field2749 * var4 + var3;
		int var6 = 0;
		int var7 = this.hi;
		int var8 = this.wi;
		int var9 = Pix2D.field2749 - var8;
		int var10 = 0;
		if (var4 < Pix2D.field2748) {
			int var11 = Pix2D.field2748 - var4;
			var7 -= var11;
			var4 = Pix2D.field2748;
			var6 = var8 * var11;
			var5 += Pix2D.field2749 * var11;
		}
		if (var4 + var7 > Pix2D.field2751) {
			var7 -= var4 + var7 - Pix2D.field2751;
		}
		if (var3 < Pix2D.field2752) {
			int var12 = Pix2D.field2752 - var3;
			var8 -= var12;
			var3 = Pix2D.field2752;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.field2753) {
			int var13 = var3 + var8 - Pix2D.field2753;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method330(Pix2D.pixels, this.data, this.bpal, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("e.a([I[B[IIIIIII)V")
	public static void method330(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = -(arg5 >> 2);
		int var10 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				byte var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var13 & 0xFF];
				}
				byte var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var14 & 0xFF];
				}
				byte var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var15 & 0xFF];
				}
				byte var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var16 & 0xFF];
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				byte var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var18 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("e.e()V")
	public void trim() {
		if (this.owi == this.wi && this.hi == this.ohi) {
			return;
		}
		byte[] var1 = new byte[this.ohi * this.owi];
		int var2 = 0;
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var1[(this.yof + var3) * this.owi + this.xof + var4] = this.data[var2++];
			}
		}
		this.data = var1;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("e.f()V")
	public void hflip() {
		byte[] var1 = new byte[this.hi * this.wi];
		int var2 = 0;
		for (int var3 = 0; var3 < this.hi; var3++) {
			for (int var4 = this.wi - 1; var4 >= 0; var4--) {
				var1[var2++] = this.data[this.wi * var3 + var4];
			}
		}
		this.data = var1;
		this.xof = this.owi - this.wi - this.xof;
	}

	@ObfuscatedName("e.g()V")
	public void vflip() {
		byte[] var1 = new byte[this.hi * this.wi];
		int var2 = 0;
		for (int var3 = this.hi - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.wi; var4++) {
				var1[var2++] = this.data[this.wi * var3 + var4];
			}
		}
		this.data = var1;
		this.yof = this.ohi - this.hi - this.yof;
	}

	@ObfuscatedName("e.a(III)V")
	public void method334(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.bpal.length; var4++) {
			int var5 = this.bpal[var4] >> 16 & 0xFF;
			int var6 = arg0 + var5;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.bpal[var4] >> 8 & 0xFF;
			int var8 = arg1 + var7;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.bpal[var4] & 0xFF;
			int var10 = arg2 + var9;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.bpal[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}

	public Pix8() {
	}

	public Pix8(int arg0, int arg1, int arg2) {
		this.owi = this.wi = arg0;
		this.ohi = this.hi = arg1;
		this.xof = this.yof = 0;
		this.data = new byte[arg0 * arg1];
		this.bpal = new int[arg2];
	}
}
