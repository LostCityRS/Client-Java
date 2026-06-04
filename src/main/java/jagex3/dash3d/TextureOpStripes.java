package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

@ObfuscatedName("vc")
public final class TextureOpStripes extends TextureOp {

	@ObfuscatedName("vc.bb")
	public int stripeCount = 10;

	@ObfuscatedName("vc.X")
	public int stripeWidth = 2048;

	@ObfuscatedName("vc.W")
	public int orientation = 0;

	@ObfuscatedName("vc.Q")
	public int[] stripeBounds;

	@ObfuscatedName("vc.Z")
	public int[] stripeFillBounds;

	public TextureOpStripes() {
		super(0, true);
	}

	@ObfuscatedName("vc.b(B)V")
	@Override
	public void postDecode() {
		this.buildStripes();
	}

	@ObfuscatedName("vc.c(B)V")
	public void buildStripes() {
		this.stripeFillBounds = new int[this.stripeCount + 1];
		this.stripeBounds = new int[this.stripeCount + 1];
		int var1 = 0;
		int var2 = 4096 / this.stripeCount;
		int var3 = this.stripeWidth * var2 >> 12;
		for (int var4 = 0; var4 < this.stripeCount; var4++) {
			this.stripeBounds[var4] = var1;
			this.stripeFillBounds[var4] = var1 + var3;
			var1 += var2;
		}
		this.stripeBounds[this.stripeCount] = 4096;
		this.stripeFillBounds[this.stripeCount] = this.stripeFillBounds[0] + 4096;
	}

	@ObfuscatedName("vc.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = Texture.field2021[arg0];
			if (this.orientation == 0) {
				short var4 = 0;
				for (int var5 = 0; var5 < this.stripeCount; var5++) {
					if (var3 >= this.stripeBounds[var5] && var3 < this.stripeBounds[var5 + 1]) {
						if (this.stripeFillBounds[var5] > var3) {
							var4 = 4096;
						}
						break;
					}
				}
				ArrayUtil.method837(var2, 0, Texture.field1276, var4);
			} else {
				for (int var6 = 0; var6 < Texture.field1276; var6++) {
					int var7 = 0;
					short var8 = 0;
					int var9 = Texture.field351[var6];
					int var10 = this.orientation;
					if (var10 == 1) {
						var7 = var9;
					} else if (var10 == 2) {
						var7 = (var3 + var9 - 4096 >> 1) + 2048;
					} else if (var10 == 3) {
						var7 = (var9 - var3 >> 1) + 2048;
					}
					for (int var11 = 0; var11 < this.stripeCount; var11++) {
						if (var7 >= this.stripeBounds[var11] && this.stripeBounds[var11 + 1] > var7) {
							if (this.stripeFillBounds[var11] > var7) {
								var8 = 4096;
							}
							break;
						}
					}
					var2[var6] = var8;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("vc.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.stripeCount = arg0.g1();
		} else if (arg1 == 1) {
			this.stripeWidth = arg0.g2();
		} else if (arg1 == 2) {
			this.orientation = arg0.g1();
		}
	}
}
