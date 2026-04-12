package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("hb")
public class Linkable2 extends Linkable {

	@ObfuscatedName("hb.db")
	public Linkable2 next2;

	@ObfuscatedName("hb.ib")
	public Linkable2 prev2;

	@ObfuscatedName("hb.c(I)V")
	public final void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.prev2 = null;
			this.next2 = null;
		}
	}
}
