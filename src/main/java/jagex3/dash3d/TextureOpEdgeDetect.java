package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("di")
public final class TextureOpEdgeDetect extends TextureOp {

	@ObfuscatedName("di.T")
	public int strength = 4096;

	public TextureOpEdgeDetect() {
		super(1, true);
	}

	@ObfuscatedName("di.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(Texture.heightMask & arg0 - 1, 0);
			int[] var4 = this.getInputMono(arg0, 0);
			int[] var5 = this.getInputMono(arg0 + 1 & Texture.heightMask, 0);
			for (int var6 = 0; var6 < Texture.width; var6++) {
				int var7 = this.strength * (var5[var6] - var3[var6]);
				int var8 = (var4[var6 + 1 & Texture.widthMask] - var4[Texture.widthMask & var6 - 1]) * this.strength;
				int var9 = var8 >> 12;
				int var10 = var7 >> 12;
				int var11 = var9 * var9 >> 12;
				int var12 = var10 * var10 >> 12;
				int var13 = (int) (Math.sqrt((double) ((float) (var11 + var12 + 4096) / 4096.0F)) * 4096.0D);
				int var14 = var13 == 0 ? 0 : 16777216 / var13;
				var2[var6] = 4096 - var14;
			}
		}
		return var2;
	}

	@ObfuscatedName("di.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.strength = arg0.g2();
		}
	}
}
