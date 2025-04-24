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
	public void addTail(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("pb.a(Lv;B)V")
	public void addHead(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel;
		arg0.next = this.sentinel.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public Linkable removeHead() {
		Linkable var1 = this.sentinel.next;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
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

	@ObfuscatedName("pb.a(B)Lv;")
	public Linkable tail() {
		Linkable var2 = this.sentinel.prev;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.prev;
			return var2;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public Linkable next() {
		Linkable var2 = this.cursor;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.next;
			return var2;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public Linkable prev() {
		Linkable var2 = this.cursor;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		}
		this.cursor = var2.prev;
		return var2;
	}

	@ObfuscatedName("pb.c()V")
	public void clear() {
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (this.sentinel == var1) {
				return;
			}
			var1.unlink();
		}
	}
}
