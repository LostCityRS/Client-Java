package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ve")
public final class LinkList2 {

	@ObfuscatedName("ve.d")
	public final Linkable2 sentinel = new Linkable2();

	public LinkList2() {
		this.sentinel.prev2 = this.sentinel;
		this.sentinel.next2 = this.sentinel;
	}

	@ObfuscatedName("ve.a(BLbe;)V")
	public void pushFront(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.sentinel;
		arg0.next2 = this.sentinel.next2;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("ve.a(B)Lbe;")
	public Linkable2 next() {
		Linkable2 var1 = this.sentinel.next2;
		return this.sentinel == var1 ? null : var1;
	}

	@ObfuscatedName("ve.a(Lbe;I)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.next2 = this.sentinel;
		arg0.prev2 = this.sentinel.prev2;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("ve.a(I)Lbe;")
	public Linkable2 popFront() {
		Linkable2 var1 = this.sentinel.next2;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}
}
