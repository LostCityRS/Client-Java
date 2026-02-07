package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.i")
	public Linkable prev;

	@ObfuscatedName("v.m")
	public Linkable next;

	@ObfuscatedName("v.q")
	public long key;

	@ObfuscatedName("v.a(I)V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}

	@ObfuscatedName("v.b(I)Z")
	public final boolean isLinked() {
		return this.prev != null;
	}
}
