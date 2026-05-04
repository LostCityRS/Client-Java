package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

@ObfuscatedName("pi")
public final class TextureOp0 extends TextureOp {

	@ObfuscatedName("pi.eb")
	public int field3346;

	public TextureOp0(int arg0) {
		super(0, true);
		this.field3346 = 4096;
		this.field3346 = 4096;
	}

	public TextureOp0() {
		this(4096);
	}

	@ObfuscatedName("pi.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			ArrayUtil.method837(var2, 0, Texture.field1276, this.field3346);
		}
		return var2;
	}

	@ObfuscatedName("pi.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field3346 = (arg0.g1() << 12) / 255;
		}
	}
}
