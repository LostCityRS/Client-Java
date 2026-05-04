package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("aj")
public final class TextureOp20 extends TextureOp {

	@ObfuscatedName("aj.cb")
	public int field163 = 4;

	@ObfuscatedName("aj.gb")
	public int field167 = 4;

	public TextureOp20() {
		super(1, false);
	}

	@ObfuscatedName("aj.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field163 = arg0.g1();
		} else if (arg1 == 1) {
			this.field167 = arg0.g1();
		}
	}

	@ObfuscatedName("aj.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = Texture.field1276 / this.field163;
			int var4 = Texture.field460 / this.field167;
			int[] var6;
			if (var4 > 0) {
				int var5 = arg0 % var4;
				var6 = this.method120(var5 * Texture.field460 / var4, 0);
			} else {
				var6 = this.method120(0, 0);
			}
			for (int var7 = 0; var7 < Texture.field1276; var7++) {
				if (var3 <= 0) {
					var2[var7] = var6[0];
				} else {
					int var8 = var7 % var3;
					var2[var7] = var6[var8 * Texture.field1276 / var3];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("aj.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int var3 = Texture.field460 / this.field167;
			int var4 = Texture.field1276 / this.field163;
			int[][] var6;
			if (var3 > 0) {
				int var5 = arg0 % var3;
				var6 = this.method121(0, Texture.field460 * var5 / var3);
			} else {
				var6 = this.method121(0, 0);
			}
			int[] var7 = var6[0];
			int[] var8 = var6[1];
			int[] var9 = var6[2];
			int[] var10 = var2[0];
			int[] var11 = var2[2];
			int[] var12 = var2[1];
			for (int var13 = 0; var13 < Texture.field1276; var13++) {
				int var15;
				if (var4 > 0) {
					int var14 = var13 % var4;
					var15 = Texture.field1276 * var14 / var4;
				} else {
					var15 = 0;
				}
				var10[var13] = var7[var15];
				var12[var13] = var8[var15];
				var11[var13] = var9[var15];
			}
		}
		return var2;
	}
}
