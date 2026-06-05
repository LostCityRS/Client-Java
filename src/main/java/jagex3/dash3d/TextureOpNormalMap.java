package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("aa")
public final class TextureOpNormalMap extends TextureOp {

	@ObfuscatedName("aa.S")
	public boolean remapOutput = true;

	@ObfuscatedName("aa.V")
	public int strength = 4096;

	public TextureOpNormalMap() {
		super(1, false);
	}

	@ObfuscatedName("aa.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int[] var3 = this.getInputMono(Texture.heightMask & arg0 - 1, 0);
			int[] var4 = this.getInputMono(arg0, 0);
			int[] var5 = this.getInputMono(arg0 + 1 & Texture.heightMask, 0);
			int[] var6 = var2[0];
			int[] var7 = var2[2];
			int[] var8 = var2[1];
			for (int var9 = 0; var9 < Texture.width; var9++) {
				int var10 = (var5[var9] - var3[var9]) * this.strength;
				int var11 = (var4[var9 + 1 & Texture.widthMask] - var4[var9 - 1 & Texture.widthMask]) * this.strength;
				int var12 = var11 >> 12;
				int var13 = var10 >> 12;
				int var14 = var12 * var12 >> 12;
				int var15 = var13 * var13 >> 12;
				int var16 = (int) (Math.sqrt((double) ((float) (var14 + var15 + 4096) / 4096.0F)) * 4096.0D);
				int var17;
				int var18;
				int var19;
				if (var16 == 0) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
				} else {
					var17 = var10 / var16;
					var18 = 16777216 / var16;
					var19 = var11 / var16;
				}
				if (this.remapOutput) {
					var18 = (var18 >> 1) + 2048;
					var19 = (var19 >> 1) + 2048;
					var17 = (var17 >> 1) + 2048;
				}
				var6[var9] = var19;
				var8[var9] = var17;
				var7[var9] = var18;
			}
		}
		return var2;
	}

	@ObfuscatedName("aa.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.strength = arg0.g2();
		} else if (arg1 == 1) {
			this.remapOutput = arg0.g1() == 1;
		}
	}
}
