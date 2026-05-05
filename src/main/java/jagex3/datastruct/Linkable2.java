package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("me")
public class Linkable2 extends Linkable {

	@ObfuscatedName("me.y")
	public Linkable2 next2;

	@ObfuscatedName("me.A")
	public Linkable2 prev2;

	@ObfuscatedName("me.c(I)V")
	public final void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.next2 = null;
			this.prev2 = null;
		}
	}
}
