package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;

@ObfuscatedName("ce")
public final class TextureOpMonoAnim extends TextureOp {

	public TextureOpMonoAnim() {
		super(0, true);
	}

	@ObfuscatedName("ce.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			ArrayUtil.method837(var2, 0, Texture.width, Texture.rowLut[arg0]);
		}
		return var2;
	}
}
