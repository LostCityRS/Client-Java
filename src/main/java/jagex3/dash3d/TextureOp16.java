package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("td")
public final class TextureOp16 extends TextureOp {

	@ObfuscatedName("td.fb")
	public int field4008 = 204;

	@ObfuscatedName("td.Y")
	public int field4001 = 1;

	@ObfuscatedName("td.T")
	public int field3996 = 1;

	public TextureOp16() {
		super(0, true);
	}

	@ObfuscatedName("td.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			for (int var3 = 0; var3 < Texture.field1276; var3++) {
				int var4 = Texture.field351[var3];
				int var5 = Texture.field2021[arg0];
				int var6 = var4 * this.field3996 >> 12;
				int var7 = this.field4001 * var5 >> 12;
				int var8 = this.field3996 * (var4 % (4096 / this.field3996));
				int var9 = var5 % (4096 / this.field4001) * this.field4001;
				if (var9 < this.field4008) {
					for (var6 -= var7; var6 < 0; var6 += 4) {
					}
					while (var6 > 3) {
						var6 -= 4;
					}
					if (var6 != 1) {
						var2[var3] = 0;
						continue;
					}
					if (var8 < this.field4008) {
						var2[var3] = 0;
						continue;
					}
				}
				if (this.field4008 > var8) {
					int var10;
					for (var10 = var6 - var7; var10 < 0; var10 += 4) {
					}
					while (var10 > 3) {
						var10 -= 4;
					}
					if (var10 > 0) {
						var2[var3] = 0;
						continue;
					}
				}
				var2[var3] = 4096;
			}
		}
		return var2;
	}

	@ObfuscatedName("td.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field3996 = arg0.g1();
		} else if (arg1 == 1) {
			this.field4001 = arg0.g1();
		} else if (arg1 == 2) {
			this.field4008 = arg0.g2();
		}
	}
}
