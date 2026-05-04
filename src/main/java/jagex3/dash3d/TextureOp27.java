package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

@ObfuscatedName("vc")
public final class TextureOp27 extends TextureOp {

	@ObfuscatedName("vc.bb")
	public int field4356 = 10;

	@ObfuscatedName("vc.X")
	public int field4352 = 2048;

	@ObfuscatedName("vc.W")
	public int field4351 = 0;

	@ObfuscatedName("vc.Q")
	public int[] field4345;

	@ObfuscatedName("vc.Z")
	public int[] field4354;

	public TextureOp27() {
		super(0, true);
	}

	@ObfuscatedName("vc.b(B)V")
	@Override
	public void method123() {
		this.method1549();
	}

	@ObfuscatedName("vc.c(B)V")
	public void method1549() {
		this.field4354 = new int[this.field4356 + 1];
		this.field4345 = new int[this.field4356 + 1];
		int var1 = 0;
		int var2 = 4096 / this.field4356;
		int var3 = this.field4352 * var2 >> 12;
		for (int var4 = 0; var4 < this.field4356; var4++) {
			this.field4345[var4] = var1;
			this.field4354[var4] = var1 + var3;
			var1 += var2;
		}
		this.field4345[this.field4356] = 4096;
		this.field4354[this.field4356] = this.field4354[0] + 4096;
	}

	@ObfuscatedName("vc.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = Texture.field2021[arg0];
			if (this.field4351 == 0) {
				short var4 = 0;
				for (int var5 = 0; var5 < this.field4356; var5++) {
					if (var3 >= this.field4345[var5] && var3 < this.field4345[var5 + 1]) {
						if (this.field4354[var5] > var3) {
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
					int var10 = this.field4351;
					if (var10 == 1) {
						var7 = var9;
					} else if (var10 == 2) {
						var7 = (var3 + var9 - 4096 >> 1) + 2048;
					} else if (var10 == 3) {
						var7 = (var9 - var3 >> 1) + 2048;
					}
					for (int var11 = 0; var11 < this.field4356; var11++) {
						if (var7 >= this.field4345[var11] && this.field4345[var11 + 1] > var7) {
							if (this.field4354[var11] > var7) {
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
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field4356 = arg0.g1();
		} else if (arg1 == 1) {
			this.field4352 = arg0.g2();
		} else if (arg1 == 2) {
			this.field4351 = arg0.g1();
		}
	}
}
