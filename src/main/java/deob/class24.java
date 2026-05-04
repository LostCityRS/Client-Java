package deob;

@ObfuscatedName("ca")
public final class class24 {

	@ObfuscatedName("ca.h")
	public final LruCache field389 = new LruCache(30);

	public class24(int arg0) {
	}

	@ObfuscatedName("ca.a(IJLnc;)V")
	public void put(long arg0, ModelSource arg1) {
		this.field389.method663(arg0, new class101(arg1));
	}

	@ObfuscatedName("ca.a(ZJ)V")
	public void method133(long arg0) {
		this.field389.method666(arg0);
	}

	@ObfuscatedName("ca.a(I)V")
	public void clear() {
		this.field389.clear();
	}

	@ObfuscatedName("ca.a(IJ)Lnc;")
	public ModelSource find(long arg0) {
		class101 var3 = (class101) this.field389.method665(arg0);
		return var3 == null ? null : var3.field1829;
	}
}
