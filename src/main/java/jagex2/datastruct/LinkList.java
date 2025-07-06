package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class LinkList {

	@ObfuscatedName("pb.b")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("pb.c")
	public Linkable cursor;

	public LinkList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void push(Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}

		node.prev = this.sentinel.prev;
		node.next = this.sentinel;
		node.prev.next = node;
		node.next.prev = node;
	}

	@ObfuscatedName("pb.a(Lv;B)V")
	public void addHead(Linkable node) {
		if (node.prev != null) {
			node.unlink();
		}

		node.prev = this.sentinel;
		node.next = this.sentinel.next;
		node.prev.next = node;
		node.next.prev = node;
	}

	@ObfuscatedName("pb.a()Lv;")
	public Linkable pop() {
		Linkable node = this.sentinel.next;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
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

	@ObfuscatedName("pb.a(B)Lv;")
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

	@ObfuscatedName("pb.a(I)Lv;")
	public Linkable next() {
		Linkable node = this.cursor;
		if (this.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.next;
			return node;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
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

	@ObfuscatedName("pb.c()V")
	public void clear() {
		while (true) {
			Linkable node = this.sentinel.next;
			if (this.sentinel == node) {
				return;
			}

			node.unlink();
		}
	}
}
