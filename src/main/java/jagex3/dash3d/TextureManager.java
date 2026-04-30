package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("mc")
public final class TextureManager implements TextureProvider {

	@ObfuscatedName("mc.i")
	public LinkList field1854 = new LinkList();

	@ObfuscatedName("mc.v")
	public final Texture[] textures;

	@ObfuscatedName("mc.F")
	public double brightness = 1.0D;

	@ObfuscatedName("mc.D")
	public int resolution = 128;

	@ObfuscatedName("mc.I")
	public int field1880 = 0;

	@ObfuscatedName("mc.H")
	public final int poolSize = 20;

	@ObfuscatedName("mc.E")
	public final Js5 sprites;

	@ObfuscatedName("mc.a(I)V")
	public void reset() {
		for (int var1 = 0; var1 < this.textures.length; var1++) {
			if (this.textures[var1] != null) {
				this.textures[var1].unload();
			}
		}
		this.field1854 = new LinkList();
		this.field1880 = this.poolSize;
	}

	@ObfuscatedName("mc.a(II)[I")
	@Override
	public int[] getTexels(int arg0) {
		Texture var2 = this.textures[arg0];
		if (var2 != null) {
			if (var2.texels != null) {
				this.field1854.pushFront(var2);
				var2.field2201 = true;
				return var2.texels;
			}
			boolean var3 = var2.loadTexture(this.brightness, this.resolution, this.sprites);
			if (var3) {
				if (this.field1880 == 0) {
					Texture var4 = (Texture) this.field1854.pop();
					var4.unload();
				} else {
					this.field1880--;
				}
				this.field1854.pushFront(var2);
				var2.field2201 = true;
				return var2.texels;
			}
		}
		return null;
	}

	@ObfuscatedName("mc.a(ZI)I")
	@Override
	public int getAverageRgb(int arg0) {
		return this.textures[arg0] == null ? 0 : this.textures[arg0].averageRgb;
	}

	@ObfuscatedName("mc.a(BI)Z")
	@Override
	public boolean isOpaque(int arg0) {
		return this.textures[arg0].opaque;
	}

	@ObfuscatedName("mc.a(ID)V")
	public void setBrightness(double arg0) {
		this.brightness = arg0;
		this.reset();
	}

	@ObfuscatedName("mc.b(BI)V")
	public void runAnims(int arg0) {
		for (int var2 = 0; var2 < this.textures.length; var2++) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.field2201) {
				var3.animate(arg0);
				var3.field2201 = false;
			}
		}
	}

	@ObfuscatedName("mc.a(IB)Z")
	@Override
	public boolean isLowMem(int arg0) {
		return this.resolution == 64;
	}

	public TextureManager(Js5 arg0, Js5 arg1, int arg2, double arg3, int arg4) {
		this.sprites = arg1;
		this.brightness = arg3;
		this.resolution = arg4;
		this.field1880 = this.poolSize;
		int[] var7 = arg0.getFileList(0);
		int var8 = var7.length;
		this.textures = new Texture[arg0.getFileIdLimit(0)];
		for (int var9 = 0; var9 < var8; var9++) {
			Packet var10 = new Packet(arg0.getFile(var7[var9], 0));
			this.textures[var7[var9]] = new Texture(var10);
		}
	}
}
