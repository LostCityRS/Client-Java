package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("fb")
public final class TextureOpImageTile extends TextureOpImage {

	@ObfuscatedName("fb.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.getFrame(arg0);
		if (super.colorCache.field4310 && this.loadImage()) {
			int[] var3 = var2[1];
			int[] var4 = var2[0];
			int[] var5 = var2[2];
			int var6 = arg0 % super.height * super.height;
			for (int var7 = 0; var7 < Texture.width; var7++) {
				int var8 = super.pixels[var7 % super.width + var6];
				var5[var7] = (var8 & 0xFF) << 4;
				var3[var7] = var8 >> 4 & 0xFF0;
				var4[var7] = var8 >> 12 & 0xFF0;
			}
		}
		return var2;
	}
}
