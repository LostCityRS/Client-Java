package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class LinkList {

	@ObfuscatedName("pb.f")
	public final Linkable sentinel = new Linkable();

	@ObfuscatedName("pb.r")
	public Linkable cursor;

	@ObfuscatedName("pb.a(B)Lnd;")
	public Linkable pop() {
		Linkable var1 = this.sentinel.prev;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("pb.b(B)Lnd;")
	public Linkable tail() {
		Linkable var1 = this.sentinel.prev;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("pb.c(B)Lnd;")
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

	@ObfuscatedName("pb.a(Lnd;I)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("pb.a(ILnd;)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.sentinel.next;
		arg0.prev = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("pb.b(I)V")
	public void clear() {
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (this.sentinel == var1) {
				return;
			}
			var1.unlink();
		}
	}

	public LinkList() {
		this.sentinel.prev = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("pb.d(I)Lnd;")
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

	@ObfuscatedName("pb.a(ILnd;Lnd;)V")
	public void insertBefore(Linkable arg0, Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		arg1.next = arg0;
		arg1.prev = arg0.prev;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
	}

	@ObfuscatedName("pb.f(I)Lnd;")
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

	@ObfuscatedName("pb.g(I)Lnd;")
	public Linkable popFront() {
		Linkable var1 = this.sentinel.next;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}
}
