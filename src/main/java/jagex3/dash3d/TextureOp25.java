package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("lh")
public final class TextureOp25 extends TextureOp {

	@ObfuscatedName("lh.ab")
	public int field2405 = 409;

	@ObfuscatedName("lh.bb")
	public int field2406 = 4096;

	@ObfuscatedName("lh.cb")
	public final int[] field2407 = new int[3];

	@ObfuscatedName("lh.fb")
	public int field2410 = 4096;

	@ObfuscatedName("lh.R")
	public int field2396 = 4096;

	public TextureOp25() {
		super(1, false);
	}

	@ObfuscatedName("lh.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[1];
			int[] var6 = var3[2];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < Texture.field1276; var10++) {
				int var11 = var4[var10];
				int var12 = var11 - this.field2407[0];
				if (var12 < 0) {
					var12 = -var12;
				}
				if (var12 > this.field2405) {
					var7[var10] = var11;
					var8[var10] = var5[var10];
					var9[var10] = var6[var10];
				} else {
					int var13 = var5[var10];
					int var14 = var13 - this.field2407[1];
					if (var14 < 0) {
						var14 = -var14;
					}
					if (this.field2405 < var14) {
						var7[var10] = var11;
						var8[var10] = var13;
						var9[var10] = var6[var10];
					} else {
						int var15 = var6[var10];
						int var16 = var15 - this.field2407[2];
						if (var16 < 0) {
							var16 = -var16;
						}
						if (var16 > this.field2405) {
							var7[var10] = var11;
							var8[var10] = var13;
							var9[var10] = var15;
						} else {
							var7[var10] = this.field2410 * var11 >> 12;
							var8[var10] = var13 * this.field2406 >> 12;
							var9[var10] = this.field2396 * var15 >> 12;
						}
					}
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("lh.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field2405 = arg0.g2();
		} else if (arg1 == 1) {
			this.field2396 = arg0.g2();
		} else if (arg1 == 2) {
			this.field2406 = arg0.g2();
		} else if (arg1 == 3) {
			this.field2410 = arg0.g2();
		} else if (arg1 == 4) {
			int var3 = arg0.g3();
			this.field2407[0] = (var3 & 0xFF0000) << 4;
			this.field2407[1] = var3 >> 4 & 0xFF0;
			this.field2407[2] = var3 >> 12 & 0x0;
		}
	}
}
