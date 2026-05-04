package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("mh")
public final class TextureOp11 extends TextureOp {

	@ObfuscatedName("mh.bb")
	public int field2583 = 4096;

	@ObfuscatedName("mh.eb")
	public int field2586 = 4096;

	@ObfuscatedName("mh.U")
	public int field2576 = 4096;

	public TextureOp11() {
		super(1, false);
	}

	@ObfuscatedName("mh.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[0];
			int[] var6 = var2[1];
			int[] var7 = var3[2];
			int[] var8 = var2[0];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < Texture.field1276; var10++) {
				int var11 = var5[var10];
				int var12 = var7[var10];
				int var13 = var4[var10];
				if (var12 == var11 && var12 == var13) {
					var8[var10] = var11 * this.field2576 >> 12;
					var6[var10] = var12 * this.field2586 >> 12;
					var9[var10] = var13 * this.field2583 >> 12;
				} else {
					var8[var10] = this.field2576;
					var6[var10] = this.field2586;
					var9[var10] = this.field2583;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mh.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field2576 = arg0.g2();
		} else if (arg1 == 1) {
			this.field2586 = arg0.g2();
		} else if (arg1 == 2) {
			this.field2583 = arg0.g2();
		}
	}
}
