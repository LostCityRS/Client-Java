package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("od")
public final class ColorImageCacheEntry extends Linkable {

	@ObfuscatedName("od.v")
	public final int field3006;

	@ObfuscatedName("od.F")
	public final int field3015;

	public ColorImageCacheEntry(int arg0, int arg1) {
		this.field3006 = arg1;
		this.field3015 = arg0;
	}
}
