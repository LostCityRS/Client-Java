package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("be")
public class Linkable2 extends Linkable {

	@ObfuscatedName("be.s")
	public Linkable2 next2;

	@ObfuscatedName("be.w")
	public Linkable2 prev2;

	@ObfuscatedName("be.a(Z)V")
	public final void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.next2 = null;
			this.prev2 = null;
		}
	}
}
