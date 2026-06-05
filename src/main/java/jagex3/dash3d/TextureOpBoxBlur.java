package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ig")
public final class TextureOpBoxBlur extends TextureOp {

	@ObfuscatedName("ig.R")
	public int radiusY = 1;

	@ObfuscatedName("ig.W")
	public int radiusX = 1;

	public TextureOpBoxBlur() {
		super(1, false);
	}

	@ObfuscatedName("ig.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int var3 = this.radiusY + this.radiusY + 1;
			int var4 = 65536 / var3;
			int var5 = this.radiusX + this.radiusX + 1;
			int[][] var6 = new int[var3][];
			int var7 = 65536 / var5;
			for (int var8 = arg0 - this.radiusY; var8 <= arg0 + this.radiusY; var8++) {
				int[] var9 = this.getInputMono(Texture.heightMask & var8, 0);
				int[] var10 = new int[Texture.width];
				int var11 = 0;
				for (int var12 = -this.radiusX; var12 <= this.radiusX; var12++) {
					var11 += var9[Texture.widthMask & var12];
				}
				int var13 = 0;
				while (Texture.width > var13) {
					var10[var13] = var7 * var11 >> 16;
					int var14 = var11 - var9[var13 - this.radiusX & Texture.widthMask];
					var13++;
					var11 = var14 + var9[Texture.widthMask & var13 + this.radiusX];
				}
				var6[this.radiusY + var8 - arg0] = var10;
			}
			for (int var15 = 0; var15 < Texture.width; var15++) {
				int var16 = 0;
				for (int var17 = 0; var17 < var3; var17++) {
					var16 += var6[var17][var15];
				}
				var2[var15] = var16 * var4 >> 16;
			}
		}
		return var2;
	}

	@ObfuscatedName("ig.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.radiusX = arg0.g1();
		} else if (arg1 == 1) {
			this.radiusY = arg0.g1();
		} else if (arg1 == 2) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("ig.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int var3 = this.radiusY + this.radiusY + 1;
			int var4 = 65536 / var3;
			int var5 = this.radiusX + this.radiusX + 1;
			int[][][] var6 = new int[var3][][];
			int var7 = 65536 / var5;
			for (int var8 = arg0 - this.radiusY; var8 <= arg0 + this.radiusY; var8++) {
				int var9 = 0;
				int var10 = 0;
				int[][] var11 = this.getInputColour(0, Texture.heightMask & var8);
				int var12 = 0;
				int[][] var13 = new int[3][Texture.width];
				int[] var14 = var11[0];
				int[] var15 = var11[1];
				int[] var16 = var11[2];
				for (int var17 = -this.radiusX; var17 <= this.radiusX; var17++) {
					int var18 = var17 & Texture.widthMask;
					var10 += var16[var18];
					var12 += var14[var18];
					var9 += var15[var18];
				}
				int[] var19 = var13[1];
				int[] var20 = var13[0];
				int[] var21 = var13[2];
				int var22 = 0;
				while (Texture.width > var22) {
					var20[var22] = var12 * var7 >> 16;
					var19[var22] = var7 * var9 >> 16;
					var21[var22] = var7 * var10 >> 16;
					int var23 = var22 - this.radiusX & Texture.widthMask;
					int var24 = var12 - var14[var23];
					int var25 = var9 - var15[var23];
					int var26 = var10 - var16[var23];
					var22++;
					int var27 = Texture.widthMask & this.radiusX + var22;
					var10 = var26 + var16[var27];
					var12 = var24 + var14[var27];
					var9 = var25 + var15[var27];
				}
				var6[var8 + this.radiusY - arg0] = var13;
			}
			int[] var28 = var2[0];
			int[] var29 = var2[1];
			int[] var30 = var2[2];
			for (int var31 = 0; var31 < Texture.width; var31++) {
				int var32 = 0;
				int var33 = 0;
				int var34 = 0;
				for (int var35 = 0; var35 < var3; var35++) {
					int[][] var36 = var6[var35];
					var33 += var36[1][var31];
					var34 += var36[2][var31];
					var32 += var36[0][var31];
				}
				var28[var31] = var32 * var4 >> 16;
				var29[var31] = var4 * var33 >> 16;
				var30[var31] = var34 * var4 >> 16;
			}
		}
		return var2;
	}
}
