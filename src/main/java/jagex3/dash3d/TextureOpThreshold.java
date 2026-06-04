package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ff")
public final class TextureOpThreshold extends TextureOp {

	@ObfuscatedName("ff.Q")
	public int maxThreshold = 4096;

	@ObfuscatedName("ff.T")
	public int minThreshold = 0;

	public TextureOpThreshold() {
		super(1, true);
	}

	@ObfuscatedName("ff.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 0);
			for (int var4 = 0; var4 < Texture.field1276; var4++) {
				int var5 = var3[var4];
				var2[var4] = var5 >= this.minThreshold && var5 <= this.maxThreshold ? 4096 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("ff.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.minThreshold = arg0.g2();
		} else if (arg1 == 1) {
			this.maxThreshold = arg0.g2();
		}
	}
}
