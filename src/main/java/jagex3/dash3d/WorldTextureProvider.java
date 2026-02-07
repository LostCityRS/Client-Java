package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ua")
public final class WorldTextureProvider implements TextureProvider {

	@ObfuscatedName("ua.n")
	public final Texture[] textures;

	@ObfuscatedName("ua.o")
	public LinkList field3227 = new LinkList();

	@ObfuscatedName("ua.q")
	public double brightness = 1.0D;

	@ObfuscatedName("ua.r")
	public final int poolSize;

	@ObfuscatedName("ua.s")
	public int field3231 = 0;

	@ObfuscatedName("ua.t")
	public int resolution = 128;

	@ObfuscatedName("ua.v")
	public final Js5 sprites;

	public WorldTextureProvider(Js5 arg0, Js5 arg1, int arg2, double arg3, int arg4) {
		this.resolution = arg4;
		this.brightness = arg3;
		this.sprites = arg1;
		this.poolSize = 20;
		this.field3231 = this.poolSize;
		int[] var7 = arg0.getFileList(0);
		int var8 = var7.length;
		this.textures = new Texture[arg0.getFileIdLimit(0)];
		for (int var9 = 0; var9 < var8; var9++) {
			Packet var10 = new Packet(arg0.getFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}
	}

	@ObfuscatedName("ua.a(ID)V")
	public void setBrightness(double arg0) {
		this.brightness = arg0;
		this.reset();
	}

	@ObfuscatedName("ua.a(BI)V")
	public void runAnims(int arg0) {
		for (int var2 = 0; var2 < this.textures.length; var2++) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.field3365) {
				var3.animate(arg0);
				var3.field3365 = false;
			}
		}
	}

	@ObfuscatedName("ua.a(ZI)Z")
	@Override
	public boolean isLowMem(int arg0) {
		return this.resolution == 64;
	}

	@ObfuscatedName("ua.a(I)V")
	public void reset() {
		for (int var1 = 0; var1 < this.textures.length; var1++) {
			if (this.textures[var1] != null) {
				this.textures[var1].unload();
			}
		}
		this.field3227 = new LinkList();
		this.field3231 = this.poolSize;
	}

	@ObfuscatedName("ua.b(II)Z")
	@Override
	public boolean isOpaque(int arg0) {
		return this.textures[arg0].opaque;
	}

	@ObfuscatedName("ua.a(IZ)I")
	@Override
	public int getAverageRgb(int arg0) {
		return this.textures[arg0] == null ? 0 : this.textures[arg0].averageRgb;
	}

	@ObfuscatedName("ua.a(II)[I")
	@Override
	public int[] getTexels(int arg0) {
		Texture var2 = this.textures[arg0];
		if (var2 != null) {
			if (var2.texels != null) {
				this.field3227.pushFront(var2);
				var2.field3365 = true;
				return var2.texels;
			}
			boolean var3 = var2.loadTexture(this.brightness, this.resolution, this.sprites);
			if (var3) {
				if (this.field3231 == 0) {
					Texture var4 = (Texture) this.field3227.pop();
					var4.unload();
				} else {
					this.field3231--;
				}
				this.field3227.pushFront(var2);
				var2.field3365 = true;
				return var2.texels;
			}
		}
		return null;
	}
}
