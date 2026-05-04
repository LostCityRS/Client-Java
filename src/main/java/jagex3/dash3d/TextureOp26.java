package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ff")
public final class TextureOp26 extends TextureOp {

	@ObfuscatedName("ff.Q")
	public int field1136 = 4096;

	@ObfuscatedName("ff.T")
	public int field1139 = 0;

	public TextureOp26() {
		super(1, true);
	}

	@ObfuscatedName("ff.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < Texture.field1276; var4++) {
				int var5 = var3[var4];
				var2[var4] = var5 >= this.field1139 && var5 <= this.field1136 ? 4096 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("ff.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field1139 = arg0.g2();
		} else if (arg1 == 1) {
			this.field1136 = arg0.g2();
		}
	}
}
