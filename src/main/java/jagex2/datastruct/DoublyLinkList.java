package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public class DoublyLinkList {

	@ObfuscatedName("qb.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("qb.b")
	public int _flowObfuscator2 = 826;

	@ObfuscatedName("qb.c")
	public DoublyLinkable sentinel = new DoublyLinkable();

	@ObfuscatedName("qb.d")
	public DoublyLinkable cursor;

	public DoublyLinkList(int arg0) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		this.sentinel.next2 = this.sentinel;
		this.sentinel.prev2 = this.sentinel;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void addTail(DoublyLinkable arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.sentinel.prev2;
		arg0.next2 = this.sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public DoublyLinkable removeHead() {
		DoublyLinkable var1 = this.sentinel.next2;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public DoublyLinkable head() {
		DoublyLinkable var1 = this.sentinel.next2;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public DoublyLinkable next(int arg0) {
		DoublyLinkable var2 = this.cursor;
		while (arg0 >= 0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.next2;
			return var2;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int size() {
		int var1 = 0;
		for (DoublyLinkable var2 = this.sentinel.next2; var2 != this.sentinel; var2 = var2.next2) {
			var1++;
		}
		return var1;
	}
}
