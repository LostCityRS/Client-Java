package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("o")
public final class TextureOpGrayscale extends TextureOp {

	public TextureOpGrayscale() {
		super(1, true);
	}

	@ObfuscatedName("o.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[][] var3 = this.getInputColour(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[2];
			int[] var6 = var3[0];
			for (int var7 = 0; var7 < Texture.width; var7++) {
				var2[var7] = (var4[var7] + var6[var7] + var5[var7]) / 3;
			}
		}
		return var2;
	}
}
