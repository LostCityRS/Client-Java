package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("kg")
public final class TextureOpClamp extends TextureOp {

	@ObfuscatedName("kg.Q")
	public int maxValue = 4096;

	@ObfuscatedName("kg.Z")
	public int minValue = 0;

	public TextureOpClamp() {
		super(1, false);
	}

	@ObfuscatedName("kg.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 0);
			for (int var4 = 0; var4 < Texture.field1276; var4++) {
				int var5 = var3[var4];
				if (this.minValue > var5) {
					var2[var4] = this.minValue;
				} else if (this.maxValue >= var5) {
					var2[var4] = var5;
				} else {
					var2[var4] = this.maxValue;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kg.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310) {
			int[][] var3 = this.getInputColor(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[2];
			int[] var6 = var3[1];
			int[] var7 = var2[1];
			int[] var8 = var2[2];
			int[] var9 = var2[0];
			for (int var10 = 0; var10 < Texture.field1276; var10++) {
				int var11 = var4[var10];
				int var12 = var6[var10];
				int var13 = var5[var10];
				if (var11 < this.minValue) {
					var9[var10] = this.minValue;
				} else if (this.maxValue >= var11) {
					var9[var10] = var11;
				} else {
					var9[var10] = this.maxValue;
				}
				if (this.minValue > var12) {
					var7[var10] = this.minValue;
				} else if (this.maxValue < var12) {
					var7[var10] = this.maxValue;
				} else {
					var7[var10] = var12;
				}
				if (var13 < this.minValue) {
					var8[var10] = this.minValue;
				} else if (var13 > this.maxValue) {
					var8[var10] = this.maxValue;
				} else {
					var8[var10] = var13;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kg.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.minValue = arg0.g2();
		} else if (arg1 == 1) {
			this.maxValue = arg0.g2();
		} else if (arg1 == 2) {
			super.monochrome = arg0.g1() == 1;
		}
	}
}
