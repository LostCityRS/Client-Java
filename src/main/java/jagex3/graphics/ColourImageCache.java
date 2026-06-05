package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;

@ObfuscatedName("va")
public final class ColourImageCache {

	@ObfuscatedName("ga.o")
	public static final ColourImageCacheEntry field1236 = new ColourImageCacheEntry(0, 0);
	@ObfuscatedName("va.a")
	public ColourImageCacheEntry[] field4291;

	@ObfuscatedName("va.f")
	public int field4296 = 0;

	@ObfuscatedName("va.g")
	public final int field4297;

	@ObfuscatedName("va.j")
	public LinkList field4300 = new LinkList();

	@ObfuscatedName("va.k")
	public int field4301 = -1;

	@ObfuscatedName("va.o")
	public final int field4305;

	@ObfuscatedName("va.p")
	public int[][][] field4306;

	@ObfuscatedName("va.t")
	public boolean field4310 = false;

	public ColourImageCache(int arg0, int arg1, int arg2) {
		this.field4305 = arg1;
		this.field4291 = new ColourImageCacheEntry[this.field4305];
		this.field4297 = arg0;
		this.field4306 = new int[this.field4297][3][arg2];
	}

	@ObfuscatedName("va.a(I)V")
	public void destroy() {
		for (int var1 = 0; var1 < this.field4297; var1++) {
			this.field4306[var1][0] = null;
			this.field4306[var1][1] = null;
			this.field4306[var1][2] = null;
			this.field4306[var1] = null;
		}
		this.field4306 = null;
		this.field4291 = null;
		this.field4300.clear();
		this.field4300 = null;
	}

	@ObfuscatedName("va.a(Z)[[[I")
	public int[][][] getAllFrames() {
		if (this.field4297 != this.field4305) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int var1 = 0; var1 < this.field4297; var1++) {
			this.field4291[var1] = field1236;
		}
		return this.field4306;
	}

	@ObfuscatedName("va.a(ZI)[[I")
	public int[][] getFrame(int arg0) {
		if (this.field4297 == this.field4305) {
			this.field4310 = this.field4291[arg0] == null;
			this.field4291[arg0] = field1236;
			return this.field4306[arg0];
		} else if (this.field4297 == 1) {
			this.field4310 = arg0 != this.field4301;
			this.field4301 = arg0;
			return this.field4306[0];
		} else {
			ColourImageCacheEntry var2 = this.field4291[arg0];
			if (var2 == null) {
				this.field4310 = true;
				if (this.field4297 > this.field4296) {
					var2 = new ColourImageCacheEntry(arg0, this.field4296);
					this.field4296++;
				} else {
					ColourImageCacheEntry var3 = (ColourImageCacheEntry) this.field4300.tail();
					var2 = new ColourImageCacheEntry(arg0, var3.field3006);
					this.field4291[var3.field3015] = null;
					var3.unlink();
				}
				this.field4291[arg0] = var2;
			} else {
				this.field4310 = false;
			}
			this.field4300.pushFront(var2);
			return this.field4306[var2.field3006];
		}
	}
}
