package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("x")
public class DoublyLinkable extends Linkable {

	@ObfuscatedName("x.f")
	public DoublyLinkable next2;

	@ObfuscatedName("x.g")
	public DoublyLinkable prev2;

	@ObfuscatedName("x.b()V")
	public void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.next2 = null;
			this.prev2 = null;
		}
	}
}
