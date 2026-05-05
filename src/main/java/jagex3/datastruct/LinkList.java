package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wi")
public final class LinkList {

	@ObfuscatedName("wi.d")
	public final Linkable sentinel = new Linkable();

	@ObfuscatedName("wi.h")
	public Linkable cursor;

	public LinkList() {
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@ObfuscatedName("wi.a(Z)Lg;")
	public Linkable head() {
		Linkable var1 = this.sentinel.next;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(B)Lg;")
	public Linkable tail() {
		Linkable var1 = this.sentinel.prev;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(I)Lg;")
	public Linkable popFront() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("wi.a(ILg;)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.sentinel.next;
		arg0.prev = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("wi.b(I)V")
	public void clear() {
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (this.sentinel == var1) {
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("wi.c(B)Lg;")
	public Linkable prev() {
		Linkable var1 = this.cursor;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("wi.c(I)Lg;")
	public Linkable next() {
		Linkable var1 = this.cursor;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(Lg;BLg;)V")
	public void method1620(Linkable arg0, Linkable arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = arg1.prev;
		arg0.next = arg1;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("wi.a(Lg;I)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}
}
