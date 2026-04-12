package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("nd")
public class Linkable {

	@ObfuscatedName("nd.n")
	public long field2073;

	@ObfuscatedName("nd.B")
	public Linkable field2087;

	@ObfuscatedName("nd.T")
	public Linkable field2105;

	@ObfuscatedName("nd.a(Z)Z")
	public final boolean method736() {
		return this.field2105 != null;
	}

	@ObfuscatedName("nd.a(I)V")
	public final void unlink() {
		if (this.field2105 != null) {
			this.field2105.field2087 = this.field2087;
			this.field2087.field2105 = this.field2105;
			this.field2105 = null;
			this.field2087 = null;
		}
	}
}
