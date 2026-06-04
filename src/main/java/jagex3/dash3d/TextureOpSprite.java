package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("s")
public final class TextureOpSprite extends TextureOp {

	@ObfuscatedName("s.ab")
	public int spriteId = -1;

	@ObfuscatedName("s.jb")
	public int[] pixels;

	@ObfuscatedName("s.R")
	public int width;

	@ObfuscatedName("s.S")
	public int height;

	public TextureOpSprite() {
		super(0, false);
	}

	@ObfuscatedName("s.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310 && this.loadSprite()) {
			int var3 = this.height * (Texture.field460 == this.width ? arg0 : arg0 * this.width / Texture.field460);
			int[] var4 = var2[0];
			int[] var5 = var2[1];
			int[] var6 = var2[2];
			if (Texture.field1276 == this.height) {
				for (int var10 = 0; var10 < Texture.field1276; var10++) {
					int var11 = this.pixels[var3++];
					var6[var10] = (var11 & 0xFF) << 4;
					var5[var10] = var11 >> 4 & 0xFF0;
					var4[var10] = var11 >> 12 & 0xFF0;
				}
			} else {
				for (int var7 = 0; var7 < Texture.field1276; var7++) {
					int var8 = this.height * var7 / Texture.field1276;
					int var9 = this.pixels[var8 + var3];
					var6[var7] = (var9 & 0xFF) << 4;
					var5[var7] = var9 >> 4 & 0xFF0;
					var4[var7] = var9 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("s.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.spriteId = arg0.g2();
		}
	}

	@ObfuscatedName("s.d(I)I")
	@Override
	public int getSpriteId() {
		return this.spriteId;
	}

	@ObfuscatedName("s.c(I)V")
	@Override
	public void clearCache() {
		super.clearCache();
		this.pixels = null;
	}

	@ObfuscatedName("s.f(I)Z")
	public boolean loadSprite() {
		if (this.pixels != null) {
			return true;
		} else if (this.spriteId >= 0) {
			int var1 = Texture.field1276;
			int var2 = Texture.field460;
			int var3 = Texture.field4488.method437(this.spriteId) ? 64 : 128;
			this.pixels = Texture.field4488.getTexels(this.spriteId);
			this.width = var3;
			this.height = var3;
			Texture.method802(var1, var2);
			return this.pixels != null;
		} else {
			return false;
		}
	}
}
