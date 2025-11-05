package jagex2.datastruct;

import deob.ObfuscatedName;

public class DoublyLinkable extends Linkable {

	@ObfuscatedName("DPPNUUMQ.e")
	public DoublyLinkable next2;

	@ObfuscatedName("DPPNUUMQ.f")
	public DoublyLinkable prev2;

	@ObfuscatedName("DPPNUUMQ.b()V")
	public void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.next2 = null;
			this.prev2 = null;
		}
	}
}
