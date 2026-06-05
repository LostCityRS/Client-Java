package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("mh")
public final class TextureOpColourize extends TextureOp {

	@ObfuscatedName("mh.bb")
	public int blueScale = 4096;

	@ObfuscatedName("mh.eb")
	public int greenScale = 4096;

	@ObfuscatedName("mh.U")
	public int redScale = 4096;

	public TextureOpColourize() {
		super(1, false);
	}

	@ObfuscatedName("mh.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int[][] var3 = this.getInputColour(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[0];
			int[] var6 = var2[1];
			int[] var7 = var3[2];
			int[] var8 = var2[0];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < Texture.width; var10++) {
				int var11 = var5[var10];
				int var12 = var7[var10];
				int var13 = var4[var10];
				if (var12 == var11 && var12 == var13) {
					var8[var10] = var11 * this.redScale >> 12;
					var6[var10] = var12 * this.greenScale >> 12;
					var9[var10] = var13 * this.blueScale >> 12;
				} else {
					var8[var10] = this.redScale;
					var6[var10] = this.greenScale;
					var9[var10] = this.blueScale;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mh.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.redScale = arg0.g2();
		} else if (arg1 == 1) {
			this.greenScale = arg0.g2();
		} else if (arg1 == 2) {
			this.blueScale = arg0.g2();
		}
	}
}
