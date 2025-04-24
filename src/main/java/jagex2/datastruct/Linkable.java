package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.b")
	public long key;

	@ObfuscatedName("v.c")
	public Linkable next;

	@ObfuscatedName("v.d")
	public Linkable prev;

	@ObfuscatedName("v.a()V")
	public void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}
}
