package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("hc")
public final class TextureOpMonoConst extends TextureOp {

	public TextureOpMonoConst() {
		super(0, true);
	}

	@ObfuscatedName("hc.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		return Texture.columnLut;
	}
}
