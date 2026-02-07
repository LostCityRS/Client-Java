package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wd")
public final class LinkList {

	@ObfuscatedName("wd.d")
	public final Linkable sentinel = new Linkable();

	@ObfuscatedName("wd.z")
	public Linkable cursor;

	public LinkList() {
		this.sentinel.prev = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("wd.a(B)V")
	public void clear() {
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (var1 == this.sentinel) {
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("wd.b(B)Lv;")
	public Linkable pop() {
		Linkable var1 = this.sentinel.prev;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("wd.a(ILv;)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.sentinel.next;
		arg0.prev = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("wd.a(I)Lv;")
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

	@ObfuscatedName("wd.b(I)Lv;")
	public Linkable next() {
		Linkable var1 = this.cursor;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("wd.c(I)Lv;")
	public Linkable head() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("wd.a(Lv;B)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("wd.c(B)Lv;")
	public Linkable popFront() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("wd.a(Lv;Lv;I)V")
	public void insertBefore(Linkable arg0, Linkable arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = arg1.prev;
		arg0.next = arg1;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("wd.e(I)Lv;")
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
}
