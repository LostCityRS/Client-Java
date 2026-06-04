package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

@ObfuscatedName("fa")
public final class TextureOpFlip extends TextureOp {

	@ObfuscatedName("fa.db")
	public boolean flipY = true;

	@ObfuscatedName("fa.eb")
	public boolean flipX = true;

	public TextureOpFlip() {
		super(1, false);
	}

	@ObfuscatedName("fa.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.flipX = arg0.g1() == 1;
		} else if (arg1 == 1) {
			this.flipY = arg0.g1() == 1;
		} else if (arg1 == 2) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("fa.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.getFrame(arg0);
		if (super.colorCache.field4310) {
			int[][] var3 = this.getInputColor(0, this.flipY ? Texture.heightMask - arg0 : arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[2];
			int[] var6 = var3[1];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			if (this.flipX) {
				for (int var11 = 0; var11 < Texture.width; var11++) {
					var7[var11] = var4[Texture.widthMask - var11];
					var8[var11] = var6[Texture.widthMask - var11];
					var9[var11] = var5[Texture.widthMask - var11];
				}
			} else {
				for (int var10 = 0; var10 < Texture.width; var10++) {
					var7[var10] = var4[var10];
					var8[var10] = var6[var10];
					var9[var10] = var5[var10];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("fa.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(this.flipY ? Texture.heightMask - arg0 : arg0, 0);
			if (this.flipX) {
				for (int var4 = 0; var4 < Texture.width; var4++) {
					var2[var4] = var3[Texture.widthMask - var4];
				}
			} else {
				ArrayUtil.method838(var3, 0, var2, 0, Texture.width);
			}
		}
		return var2;
	}
}
