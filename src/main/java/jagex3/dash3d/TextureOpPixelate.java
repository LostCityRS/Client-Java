package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("aj")
public final class TextureOpPixelate extends TextureOp {

	@ObfuscatedName("aj.cb")
	public int pixelSizeX = 4;

	@ObfuscatedName("aj.gb")
	public int pixelSizeY = 4;

	public TextureOpPixelate() {
		super(1, false);
	}

	@ObfuscatedName("aj.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.pixelSizeX = arg0.g1();
		} else if (arg1 == 1) {
			this.pixelSizeY = arg0.g1();
		}
	}

	@ObfuscatedName("aj.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int var3 = Texture.width / this.pixelSizeX;
			int var4 = Texture.height / this.pixelSizeY;
			int[] var6;
			if (var4 > 0) {
				int var5 = arg0 % var4;
				var6 = this.getInputMono(var5 * Texture.height / var4, 0);
			} else {
				var6 = this.getInputMono(0, 0);
			}
			for (int var7 = 0; var7 < Texture.width; var7++) {
				if (var3 <= 0) {
					var2[var7] = var6[0];
				} else {
					int var8 = var7 % var3;
					var2[var7] = var6[var8 * Texture.width / var3];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("aj.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int var3 = Texture.height / this.pixelSizeY;
			int var4 = Texture.width / this.pixelSizeX;
			int[][] var6;
			if (var3 > 0) {
				int var5 = arg0 % var3;
				var6 = this.getInputColour(0, Texture.height * var5 / var3);
			} else {
				var6 = this.getInputColour(0, 0);
			}
			int[] var7 = var6[0];
			int[] var8 = var6[1];
			int[] var9 = var6[2];
			int[] var10 = var2[0];
			int[] var11 = var2[2];
			int[] var12 = var2[1];
			for (int var13 = 0; var13 < Texture.width; var13++) {
				int var15;
				if (var4 > 0) {
					int var14 = var13 % var4;
					var15 = Texture.width * var14 / var4;
				} else {
					var15 = 0;
				}
				var10[var13] = var7[var15];
				var12[var13] = var8[var15];
				var11[var13] = var9[var15];
			}
		}
		return var2;
	}
}
