package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("g")
public class Linkable {

	@ObfuscatedName("g.j")
	public Linkable prev;

	@ObfuscatedName("g.q")
	public long key;

	@ObfuscatedName("g.r")
	public Linkable next;

	@ObfuscatedName("g.a(I)Z")
	public final boolean isLinked() {
		return this.prev != null;
	}

	@ObfuscatedName("g.a(Z)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}
}
