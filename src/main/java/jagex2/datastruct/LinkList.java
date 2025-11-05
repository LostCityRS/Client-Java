package jagex2.datastruct;

import deob.ObfuscatedName;

public class LinkList {

	@ObfuscatedName("BOHLFXVX.c")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("BOHLFXVX.d")
	public Linkable cursor;

	public LinkList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@ObfuscatedName("BOHLFXVX.a(LZUOIJLRD;)V")
	public void push(Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}

		node.prev = this.sentinel.prev;
		node.next = this.sentinel;
		node.prev.next = node;
		node.next.prev = node;
	}

	@ObfuscatedName("BOHLFXVX.a(BLZUOIJLRD;)V")
	public void addHead(Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}

		node.prev = this.sentinel;
		node.next = this.sentinel.next;
		node.prev.next = node;
		node.next.prev = node;
	}

	@ObfuscatedName("BOHLFXVX.a()LZUOIJLRD;")
	public Linkable pop() {
		Linkable node = this.sentinel.next;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@ObfuscatedName("BOHLFXVX.b()LZUOIJLRD;")
	public Linkable head() {
		Linkable node = this.sentinel.next;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(Z)LZUOIJLRD;")
	public Linkable tail() {
		Linkable node = this.sentinel.prev;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(I)LZUOIJLRD;")
	public Linkable next() {
		Linkable node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		}
		
		this.cursor = node.next;
		return node;
	}

	@ObfuscatedName("BOHLFXVX.b(I)LZUOIJLRD;")
	public Linkable prev() {
		Linkable node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.prev;
			return node;
		}
	}

	@ObfuscatedName("BOHLFXVX.c()V")
	public void clear() {
		if (this.sentinel.next == this.sentinel) {
			return;
		}

		while (true) {
			Linkable node = this.sentinel.next;
			if (this.sentinel == node) {
				return;
			}

			node.unlink();
		}
	}
}
