package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("fd")
public final class TextureOpDisplace extends TextureOp {

	@ObfuscatedName("fd.Y")
	public int strength = 32768;

	public TextureOpDisplace() {
		super(3, false);
	}

	@ObfuscatedName("fd.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.strength = arg0.g2() << 4;
		} else if (arg1 == 1) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("fd.b(B)V")
	@Override
	public void postDecode() {
		Statics.method740();
	}

	@ObfuscatedName("fd.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 1);
			int[] var4 = this.getInputMono(arg0, 2);
			for (int var5 = 0; var5 < Texture.width; var5++) {
				int var6 = this.strength * var4[var5] >> 12;
				int var7 = var3[var5] >> 4 & 0xFF;
				int var8 = Statics.field2920[var7] * var6 >> 12;
				int var9 = Statics.field1734[var7] * var6 >> 12;
				int var10 = var5 + (var8 >> 12) & Texture.widthMask;
				int var11 = Texture.heightMask & (var9 >> 12) + arg0;
				int[] var12 = this.getInputMono(var11, 0);
				var2[var5] = var12[var10];
			}
		}
		return var2;
	}

	@ObfuscatedName("fd.b(IB)[[I")
	@Override
	public int[][] renderColour(int arg0) {
		int[][] var2 = super.colourCache.getFrame(arg0);
		if (super.colourCache.field4310) {
			int[] var3 = this.getInputMono(arg0, 1);
			int[] var4 = this.getInputMono(arg0, 2);
			int[] var5 = var2[0];
			int[] var6 = var2[1];
			int[] var7 = var2[2];
			for (int var8 = 0; var8 < Texture.width; var8++) {
				int var9 = var3[var8] * 255 >> 12 & 0xFF;
				int var10 = this.strength * var4[var8] >> 12;
				int var11 = var10 * Statics.field2920[var9] >> 12;
				int var12 = var10 * Statics.field1734[var9] >> 12;
				int var13 = var8 + (var11 >> 12) & Texture.widthMask;
				int var14 = arg0 + (var12 >> 12) & Texture.heightMask;
				int[][] var15 = this.getInputColour(0, var14);
				var5[var8] = var15[0][var13];
				var6[var8] = var15[1][var13];
				var7[var8] = var15[2][var13];
			}
		}
		return var2;
	}
}
