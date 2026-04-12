package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("nd")
public class Linkable {

	@ObfuscatedName("nd.n")
	public long key;

	@ObfuscatedName("nd.B")
	public Linkable next;

	@ObfuscatedName("nd.T")
	public Linkable prev;

	@ObfuscatedName("nd.a(Z)Z")
	public final boolean isLinked() {
		return this.prev != null;
	}

	@ObfuscatedName("nd.a(I)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}
}
