package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ob")
public final class LinkList {

	@ObfuscatedName("ob.c")
	public final Linkable sentinel = new Linkable();

	@ObfuscatedName("ob.d")
	public Linkable cursor;

	@ObfuscatedName("ob.a")
	public final int field740 = 9;

	@ObfuscatedName("ob.b")
	public final boolean field741 = true;

	public LinkList(int arg0) {
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
	}

	@ObfuscatedName("ob.c()V")
	public void clear() {
		if (sentinel.next == sentinel) {
			return;
		}
		while (true) {
			Linkable var1 = sentinel.next;
			if (var1 == sentinel) {
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = sentinel.prev;
		arg0.next = sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("ob.a(Lu;I)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = sentinel;
		arg0.next = sentinel.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public Linkable popFront() {
		Linkable var1 = sentinel.next;
		if (var1 == sentinel) {
			return null;
		}
		var1.unlink();
		return var1;
	}

	@ObfuscatedName("ob.b()Lu;")
	public Linkable head() {
		Linkable var1 = sentinel.next;
		if (var1 == sentinel) {
			cursor = null;
			return null;
		}
		cursor = var1.next;
		return var1;
	}

	@ObfuscatedName("ob.a(I)Lu;")
	public Linkable tail() {
		Linkable var1 = sentinel.prev;
		if (var1 == sentinel) {
			cursor = null;
			return null;
		}
		cursor = var1.prev;
		return var1;
	}

	@ObfuscatedName("ob.a(Z)Lu;")
	public Linkable next() {
		Linkable var1 = cursor;
		if (var1 == sentinel) {
			cursor = null;
			return null;
		}
		cursor = var1.next;
		return var1;
	}

	@ObfuscatedName("ob.b(I)Lu;")
	public Linkable prev() {
		Linkable var1 = cursor;
		if (var1 == sentinel) {
			cursor = null;
			return null;
		}
		cursor = var1.prev;
		return var1;
	}
}
