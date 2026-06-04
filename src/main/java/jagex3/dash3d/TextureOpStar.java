package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("jf")
public final class TextureOpStar extends TextureOp {

	@ObfuscatedName("jf.ab")
	public int centerY = 0;

	@ObfuscatedName("jf.bb")
	public int modulation = 8192;

	@ObfuscatedName("jf.jb")
	public int centerY2 = 2048;

	@ObfuscatedName("jf.mb")
	public int frequency = 12288;

	@ObfuscatedName("jf.T")
	public int thickness = 4096;

	@ObfuscatedName("jf.Q")
	public int centerX = 2048;

	@ObfuscatedName("jf.W")
	public int centerX2 = 0;

	public TextureOpStar() {
		super(0, true);
	}

	@ObfuscatedName("jf.b(IBI)Z")
	public boolean testLine2(int arg0, int arg1) {
		int var3 = this.frequency * (arg1 + arg0) >> 12;
		int var4 = Statics.field2920[var3 * 255 >> 12 & 0xFF];
		int var5 = (var4 << 12) / this.frequency;
		int var6 = (var5 << 12) / this.modulation;
		int var7 = this.thickness * var6 >> 12;
		return arg1 - arg0 < var7 && -var7 < arg1 - arg0;
	}

	@ObfuscatedName("jf.b(B)V")
	@Override
	public void postDecode() {
		Statics.method740();
	}

	@ObfuscatedName("jf.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.centerX = arg0.g2();
		} else if (arg1 == 1) {
			this.centerY = arg0.g2();
		} else if (arg1 == 2) {
			this.centerX2 = arg0.g2();
		} else if (arg1 == 3) {
			this.centerY2 = arg0.g2();
		} else if (arg1 == 4) {
			this.frequency = arg0.g2();
		} else if (arg1 == 5) {
			this.thickness = arg0.g2();
		} else if (arg1 == 6) {
			this.modulation = arg0.g2();
		}
	}

	@ObfuscatedName("jf.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int var3 = Texture.rowLut[arg0] - 2048;
			for (int var4 = 0; var4 < Texture.width; var4++) {
				int var5 = Texture.columnLut[var4] - 2048;
				int var6 = var5 + this.centerX;
				int var7 = this.centerY + var3;
				int var8 = var7 >= -2048 ? var7 : var7 + 4096;
				int var9 = var8 > 2048 ? var8 - 4096 : var8;
				int var10 = var6 < -2048 ? var6 + 4096 : var6;
				int var11 = var10 <= 2048 ? var10 : var10 - 4096;
				int var12 = this.centerY2 + var3;
				int var13 = var12 < -2048 ? var12 + 4096 : var12;
				int var14 = var13 <= 2048 ? var13 : var13 - 4096;
				int var15 = this.centerX2 + var5;
				int var16 = var15 >= -2048 ? var15 : var15 + 4096;
				int var17 = var16 <= 2048 ? var16 : var16 - 4096;
				var2[var4] = this.testLine1(var11, var9) || this.testLine2(var17, var14) ? 4096 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("jf.b(III)Z")
	public boolean testLine1(int arg0, int arg1) {
		int var3 = (arg1 - arg0) * this.frequency >> 12;
		int var4 = Statics.field2920[var3 * 255 >> 12 & 0xFF];
		int var5 = (var4 << 12) / this.frequency;
		int var6 = (var5 << 12) / this.modulation;
		int var7 = this.thickness * var6 >> 12;
		return var7 > arg0 + arg1 && -var7 < arg1 + arg0;
	}
}
