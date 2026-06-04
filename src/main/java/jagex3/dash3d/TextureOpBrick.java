package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("td")
public final class TextureOpBrick extends TextureOp {

	@ObfuscatedName("td.fb")
	public int mortarWidth = 204;

	@ObfuscatedName("td.Y")
	public int brickHeight = 1;

	@ObfuscatedName("td.T")
	public int brickWidth = 1;

	public TextureOpBrick() {
		super(0, true);
	}

	@ObfuscatedName("td.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			for (int var3 = 0; var3 < Texture.field1276; var3++) {
				int var4 = Texture.field351[var3];
				int var5 = Texture.field2021[arg0];
				int var6 = var4 * this.brickWidth >> 12;
				int var7 = this.brickHeight * var5 >> 12;
				int var8 = this.brickWidth * (var4 % (4096 / this.brickWidth));
				int var9 = var5 % (4096 / this.brickHeight) * this.brickHeight;
				if (var9 < this.mortarWidth) {
					for (var6 -= var7; var6 < 0; var6 += 4) {
					}
					while (var6 > 3) {
						var6 -= 4;
					}
					if (var6 != 1) {
						var2[var3] = 0;
						continue;
					}
					if (var8 < this.mortarWidth) {
						var2[var3] = 0;
						continue;
					}
				}
				if (this.mortarWidth > var8) {
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
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.brickWidth = arg0.g1();
		} else if (arg1 == 1) {
			this.brickHeight = arg0.g1();
		} else if (arg1 == 2) {
			this.mortarWidth = arg0.g2();
		}
	}
}
