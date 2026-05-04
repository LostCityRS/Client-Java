package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;

@ObfuscatedName("oh")
public final class MonochromeImageCache {

	@ObfuscatedName("hj.o")
	public static final MonochromeImageCacheEntry field1572 = new MonochromeImageCacheEntry(0, 0);

	@ObfuscatedName("oh.b")
	public LinkList field3078 = new LinkList();

	@ObfuscatedName("oh.j")
	public int field3086 = -1;

	@ObfuscatedName("oh.k")
	public final int field3087;

	@ObfuscatedName("oh.l")
	public final int field3088;

	@ObfuscatedName("oh.o")
	public int[][] field3091;

	@ObfuscatedName("oh.s")
	public MonochromeImageCacheEntry[] field3095;

	@ObfuscatedName("oh.u")
	public int field3097 = 0;

	@ObfuscatedName("oh.v")
	public boolean field3098 = false;

	public MonochromeImageCache(int arg0, int arg1, int arg2) {
		this.field3087 = arg0;
		this.field3091 = new int[this.field3087][arg2];
		this.field3088 = arg1;
		this.field3095 = new MonochromeImageCacheEntry[this.field3088];
	}

	@ObfuscatedName("oh.b(I)[[I")
	public int[][] method1075() {
		if (this.field3088 != this.field3087) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int var1 = 0; var1 < this.field3087; var1++) {
			this.field3095[var1] = field1572;
		}
		return this.field3091;
	}

	@ObfuscatedName("oh.b(ZI)[I")
	public int[] method1078(int arg0) {
		if (this.field3087 == this.field3088) {
			this.field3098 = this.field3095[arg0] == null;
			this.field3095[arg0] = field1572;
			return this.field3091[arg0];
		} else if (this.field3087 == 1) {
			this.field3098 = arg0 != this.field3086;
			this.field3086 = arg0;
			return this.field3091[0];
		} else {
			MonochromeImageCacheEntry var2 = this.field3095[arg0];
			if (var2 == null) {
				this.field3098 = true;
				if (this.field3087 > this.field3097) {
					var2 = new MonochromeImageCacheEntry(arg0, this.field3097);
					this.field3097++;
				} else {
					MonochromeImageCacheEntry var3 = (MonochromeImageCacheEntry) this.field3078.method1612();
					var2 = new MonochromeImageCacheEntry(arg0, var3.field3001);
					this.field3095[var3.field2992] = null;
					var3.unlink();
				}
				this.field3095[arg0] = var2;
			} else {
				this.field3098 = false;
			}
			this.field3078.method1615(var2);
			return this.field3091[var2.field3001];
		}
	}

	@ObfuscatedName("oh.a(B)V")
	public void method1081() {
		for (int var1 = 0; var1 < this.field3087; var1++) {
			this.field3091[var1] = null;
		}
		this.field3091 = null;
		this.field3095 = null;
		this.field3078.method1616();
		this.field3078 = null;
	}
}
