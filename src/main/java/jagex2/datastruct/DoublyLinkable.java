package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("x")
public class DoublyLinkable extends Linkable {

	@ObfuscatedName("x.f")
	public DoublyLinkable field401;

	@ObfuscatedName("x.g")
	public DoublyLinkable field402;

	@ObfuscatedName("x.h")
	public static boolean field403;

	@ObfuscatedName("x.b()V")
	public void method121() {
		if (this.field402 != null) {
			this.field402.field401 = this.field401;
			this.field401.field402 = this.field402;
			this.field401 = null;
			this.field402 = null;
		}
	}
}
