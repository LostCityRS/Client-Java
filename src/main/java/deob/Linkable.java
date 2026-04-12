package deob;

@ObfuscatedName("nd")
public class Linkable {

	@ObfuscatedName("nd.d")
	public static int field2063 = 0;

	@ObfuscatedName("nd.n")
	public long field2073;

	@ObfuscatedName("nd.p")
	public static int field2075 = 500;

	@ObfuscatedName("nd.y")
	public static int field2084 = 0;

	@ObfuscatedName("nd.B")
	public Linkable field2087;

	@ObfuscatedName("nd.T")
	public Linkable field2105;

	@ObfuscatedName("nd.a(Z)Z")
	public final boolean method736() {
		return this.field2105 != null;
	}

	@ObfuscatedName("nd.a(I)V")
	public final void method739() {
		if (this.field2105 != null) {
			this.field2105.field2087 = this.field2087;
			this.field2087.field2105 = this.field2105;
			this.field2105 = null;
			this.field2087 = null;
		}
	}
}
