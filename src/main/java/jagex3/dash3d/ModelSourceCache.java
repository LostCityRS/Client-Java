package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LruCache;
import jagex3.datastruct.ModelSourceNode;

@ObfuscatedName("ca")
public final class ModelSourceCache {

	@ObfuscatedName("ca.h")
	public final LruCache field389 = new LruCache(30);

	public ModelSourceCache(int arg0) {
	}

	@ObfuscatedName("ca.a(IJLnc;)V")
	public void put(long arg0, ModelSource arg1) {
		this.field389.put(arg0, new ModelSourceNode(arg1));
	}

	@ObfuscatedName("ca.a(ZJ)V")
	public void method133(long arg0) {
		this.field389.remove(arg0);
	}

	@ObfuscatedName("ca.a(I)V")
	public void clear() {
		this.field389.clear();
	}

	@ObfuscatedName("ca.a(IJ)Lnc;")
	public ModelSource find(long arg0) {
		ModelSourceNode var3 = (ModelSourceNode) this.field389.find(arg0);
		return var3 == null ? null : var3.field1829;
	}
}
