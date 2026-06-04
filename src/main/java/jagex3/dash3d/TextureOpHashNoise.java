package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("ta")
public final class TextureOpHashNoise extends TextureOp {

	public TextureOpHashNoise() {
		super(0, true);
	}

	@ObfuscatedName("ta.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = Texture.field2021[arg0];
			for (int var4 = 0; var4 < Texture.field1276; var4++) {
				var2[var4] = this.hashXY(var3, Texture.field351[var4]) % 4096;
			}
		}
		return var2;
	}

	@ObfuscatedName("ta.a(IIB)I")
	public int hashXY(int arg0, int arg1) {
		int var3 = arg1 + arg0 * 57;
		int var4 = var3 ^ var3 << 1;
		return 4096 - ((var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
