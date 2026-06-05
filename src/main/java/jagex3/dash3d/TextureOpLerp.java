package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("d")
public final class TextureOpLerp extends TextureOp {

	public TextureOpLerp() {
		super(3, false);
	}

	@ObfuscatedName("d.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 0);
			int[] var4 = this.getInputMono(arg0, 1);
			int[] var5 = this.getInputMono(arg0, 2);
			for (int var6 = 0; var6 < Texture.width; var6++) {
				int var7 = var5[var6];
				if (var7 == 4096) {
					var2[var6] = var3[var6];
				} else if (var7 == 0) {
					var2[var6] = var4[var6];
				} else {
					var2[var6] = var3[var6] * var7 + (4096 - var7) * var4[var6] >> 12;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("d.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("d.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int[] var3 = this.getInputMono(arg0, 2);
			int[][] var4 = this.getInputColour(0, arg0);
			int[][] var5 = this.getInputColour(1, arg0);
			int[] var6 = var4[2];
			int[] var7 = var5[0];
			int[] var8 = var2[0];
			int[] var9 = var2[2];
			int[] var10 = var4[1];
			int[] var11 = var5[1];
			int[] var12 = var4[0];
			int[] var13 = var2[1];
			int[] var14 = var5[2];
			for (int var15 = 0; var15 < Texture.width; var15++) {
				int var16 = var3[var15];
				if (var16 == 4096) {
					var8[var15] = var12[var15];
					var13[var15] = var10[var15];
					var9[var15] = var6[var15];
				} else if (var16 == 0) {
					var8[var15] = var7[var15];
					var13[var15] = var11[var15];
					var9[var15] = var14[var15];
				} else {
					int var17 = 4096 - var16;
					var8[var15] = var16 * var12[var15] + var17 * var7[var15] >> 12;
					var13[var15] = var16 * var10[var15] + var11[var15] * var17 >> 12;
					var9[var15] = var6[var15] * var16 + var14[var15] * var17 >> 12;
				}
			}
		}
		return var2;
	}
}
