package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class Linkable {

	@ObfuscatedName("u.a")
	public long key;

	@ObfuscatedName("u.b")
	public Linkable next;

	@ObfuscatedName("u.c")
	public Linkable prev;

	@ObfuscatedName("u.a()V")
	public final void unlink() {
		if (prev != null) {
			prev.next = next;
			next.prev = prev;
			next = null;
			prev = null;
		}
	}
}
