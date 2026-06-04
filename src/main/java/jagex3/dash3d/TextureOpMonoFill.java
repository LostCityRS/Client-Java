package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

@ObfuscatedName("pi")
public final class TextureOpMonoFill extends TextureOp {

	@ObfuscatedName("pi.eb")
	public int brightness;

	public TextureOpMonoFill(int arg0) {
		super(0, true);
		this.brightness = 4096;
		this.brightness = 4096;
	}

	public TextureOpMonoFill() {
		this(4096);
	}

	@ObfuscatedName("pi.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			ArrayUtil.method837(var2, 0, Texture.field1276, this.brightness);
		}
		return var2;
	}

	@ObfuscatedName("pi.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.brightness = (arg0.g1() << 12) / 255;
		}
	}
}
