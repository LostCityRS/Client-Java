package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ve")
public final class TextureOpInvert extends TextureOp {

	public TextureOpInvert() {
		super(1, false);
	}

	@ObfuscatedName("ve.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 0);
			for (int var4 = 0; var4 < Texture.width; var4++) {
				var2[var4] = 4096 - var3[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("ve.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int[][] var3 = this.getInputColour(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[1];
			int[] var6 = var3[2];
			int[] var7 = var2[1];
			int[] var8 = var2[2];
			int[] var9 = var2[0];
			for (int var10 = 0; var10 < Texture.width; var10++) {
				var9[var10] = 4096 - var4[var10];
				var7[var10] = 4096 - var5[var10];
				var8[var10] = 4096 - var6[var10];
			}
		}
		return var2;
	}

	@ObfuscatedName("ve.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			super.monochrome = arg0.g1() == 1;
		}
	}
}
