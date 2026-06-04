package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.graphics.PixLoader;
import jagex3.graphics.SoftwarePix32;
import jagex3.io.Packet;

@ObfuscatedName("mi")
public class TextureOpImage extends TextureOp {

	@ObfuscatedName("mi.U")
	public int imageId = -1;

	@ObfuscatedName("mi.Q")
	public int height;

	@ObfuscatedName("mi.V")
	public int width;

	@ObfuscatedName("mi.R")
	public int[] pixels;

	public TextureOpImage() {
		super(0, false);
	}

	@ObfuscatedName("mi.b(I)I")
	@Override
	public final int getImageId() {
		return this.imageId;
	}

	@ObfuscatedName("mi.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310 && this.loadImage()) {
			int[] var3 = var2[1];
			int[] var4 = var2[2];
			int var5 = this.width * (this.height == Texture.field460 ? arg0 : this.height * arg0 / Texture.field460);
			int[] var6 = var2[0];
			if (this.width == Texture.field1276) {
				for (int var10 = 0; var10 < Texture.field1276; var10++) {
					int var11 = this.pixels[var5++];
					var4[var10] = (var11 & 0xFF) << 4;
					var3[var10] = var11 >> 4 & 0xFF0;
					var6[var10] = var11 >> 12 & 0xFF0;
				}
			} else {
				for (int var7 = 0; var7 < Texture.field1276; var7++) {
					int var8 = var7 * this.width / Texture.field1276;
					int var9 = this.pixels[var8 + var5];
					var4[var7] = (var9 & 0xFF) << 4;
					var3[var7] = var9 >> 4 & 0xFF0;
					var6[var7] = var9 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mi.e(I)Z")
	public final boolean loadImage() {
		if (this.pixels != null) {
			return true;
		} else if (this.imageId >= 0) {
			SoftwarePix32 var1 = PixLoader.makeSoftwarePix32(Texture.field684, this.imageId);
			var1.trim();
			this.width = var1.wi;
			this.height = var1.hi;
			this.pixels = var1.data;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("mi.a(Lea;II)V")
	@Override
	public final void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.imageId = arg0.g2();
		}
	}

	@ObfuscatedName("mi.c(I)V")
	@Override
	public final void clearCache() {
		super.clearCache();
		this.pixels = null;
	}
}
