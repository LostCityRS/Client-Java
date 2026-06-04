package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("kd")
public final class TextureOpRemap extends TextureOp {

	@ObfuscatedName("kd.fb")
	public int inputMin = 1024;

	@ObfuscatedName("kd.Y")
	public int inputMax = 3072;

	@ObfuscatedName("kd.Q")
	public int range = 2048;

	public TextureOpRemap() {
		super(1, false);
	}

	@ObfuscatedName("kd.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310) {
			int[][] var3 = this.getInputColor(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[2];
			int[] var6 = var3[0];
			int[] var7 = var2[2];
			int[] var8 = var2[0];
			int[] var9 = var2[1];
			for (int var10 = 0; var10 < Texture.field1276; var10++) {
				var8[var10] = this.inputMin + (var6[var10] * this.range >> 12);
				var9[var10] = (this.range * var4[var10] >> 12) + this.inputMin;
				var7[var10] = this.inputMin + (this.range * var5[var10] >> 12);
			}
		}
		return var2;
	}

	@ObfuscatedName("kd.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 0);
			for (int var4 = 0; var4 < Texture.field1276; var4++) {
				var2[var4] = this.inputMin + (this.range * var3[var4] >> 12);
			}
		}
		return var2;
	}

	@ObfuscatedName("kd.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.inputMin = arg0.g2();
		} else if (arg1 == 1) {
			this.inputMax = arg0.g2();
		} else if (arg1 == 2) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("kd.b(B)V")
	@Override
	public void postDecode() {
		this.range = this.inputMax - this.inputMin;
	}
}
