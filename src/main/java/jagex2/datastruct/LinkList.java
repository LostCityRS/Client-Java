package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class LinkList {

	@ObfuscatedName("pb.a")
	public boolean field748 = true;

	@ObfuscatedName("pb.b")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("pb.c")
	public Linkable cursor;

	public LinkList(byte arg0) {
		this.sentinel.next = this.sentinel;
		if (arg0 == 7) {
			boolean var2 = false;
		} else {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
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
	public void addHead(Linkable arg0, byte arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel;
		arg0.next = this.sentinel.next;
		if (arg1 == 80) {
			arg0.prev.next = arg0;
			arg0.next.prev = arg0;
		}
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
	public Linkable tail(byte arg0) {
		Linkable var2 = this.sentinel.prev;
		if (arg0 != 6) {
			throw new NullPointerException();
		}
		boolean var3 = false;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.prev;
			return var2;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public Linkable next(int arg0) {
		Linkable var2 = this.cursor;
		if (arg0 >= 0) {
			throw new NullPointerException();
		} else if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.next;
			return var2;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public Linkable prev(boolean arg0) {
		Linkable var2 = this.cursor;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		}
		this.cursor = var2.prev;
		if (arg0) {
			throw new NullPointerException();
		}
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
