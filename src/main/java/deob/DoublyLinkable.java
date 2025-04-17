package deob;

@ObfuscatedName("x")
public class DoublyLinkable extends Linkable {

	@ObfuscatedName("x.f")
	public DoublyLinkable field396;

	@ObfuscatedName("x.g")
	public DoublyLinkable field397;

	@ObfuscatedName("x.h")
	public static boolean field398;

	@ObfuscatedName("x.b()V")
	public void method120() {
		if (this.field397 != null) {
			this.field397.field396 = this.field396;
			this.field396.field397 = this.field397;
			this.field396 = null;
			this.field397 = null;
		}
	}
}
