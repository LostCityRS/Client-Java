package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public class DoublyLinkList {

	@ObfuscatedName("qb.a")
	public boolean field751 = false;

	@ObfuscatedName("qb.b")
	public int field752 = 826;

	@ObfuscatedName("qb.c")
	public DoublyLinkable field753 = new DoublyLinkable();

	@ObfuscatedName("qb.d")
	public DoublyLinkable field754;

	public DoublyLinkList(int arg0) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		this.field753.next2 = this.field753;
		this.field753.prev2 = this.field753;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method262(DoublyLinkable arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.field753.prev2;
		arg0.next2 = this.field753;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public DoublyLinkable method263() {
		DoublyLinkable var1 = this.field753.next2;
		if (this.field753 == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public DoublyLinkable method264() {
		DoublyLinkable var1 = this.field753.next2;
		if (this.field753 == var1) {
			this.field754 = null;
			return null;
		} else {
			this.field754 = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public DoublyLinkable method265(int arg0) {
		DoublyLinkable var2 = this.field754;
		while (arg0 >= 0) {
			this.field751 = !this.field751;
		}
		if (this.field753 == var2) {
			this.field754 = null;
			return null;
		} else {
			this.field754 = var2.next2;
			return var2;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method266() {
		int var1 = 0;
		for (DoublyLinkable var2 = this.field753.next2; var2 != this.field753; var2 = var2.next2) {
			var1++;
		}
		return var1;
	}
}
