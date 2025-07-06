package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public class DoublyLinkList {

	@ObfuscatedName("qb.c")
	public DoublyLinkable sentinel = new DoublyLinkable();

	@ObfuscatedName("qb.d")
	public DoublyLinkable cursor;

	public DoublyLinkList() {
		this.sentinel.next2 = this.sentinel;
		this.sentinel.prev2 = this.sentinel;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void push(DoublyLinkable node) {
		if (node.prev2 != null) {
			node.unlink2();
		}

		node.prev2 = this.sentinel.prev2;
		node.next2 = this.sentinel;
		node.prev2.next2 = node;
		node.next2.prev2 = node;
	}

	@ObfuscatedName("qb.a()Lx;")
	public DoublyLinkable pop() {
		DoublyLinkable node = this.sentinel.next2;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlink2();
			return node;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public DoublyLinkable head() {
		DoublyLinkable node = this.sentinel.next2;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next2;
			return node;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public DoublyLinkable next() {
		DoublyLinkable node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next2;
			return node;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int size() {
		int count = 0;
		for (DoublyLinkable node = this.sentinel.next2; node != this.sentinel; node = node.next2) {
			count++;
		}
		return count;
	}
}
