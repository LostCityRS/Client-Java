package jagex2.datastruct;

import deob.ObfuscatedName;

public class Linkable {

	@ObfuscatedName("ZUOIJLRD.a")
	public long key;

	@ObfuscatedName("ZUOIJLRD.b")
	public Linkable next;

	@ObfuscatedName("ZUOIJLRD.c")
	public Linkable prev;

	@ObfuscatedName("ZUOIJLRD.a()V")
	public void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}
}
