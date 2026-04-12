package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("kc")
public final class LinkList2 {

	@ObfuscatedName("kc.y")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("kc.a(I)Lhb;")
	public Linkable2 popFront() {
		Linkable2 var1 = this.sentinel.next2;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("kc.a(ILhb;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.next2 = this.sentinel;
		arg0.prev2 = this.sentinel.prev2;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("kc.c(I)Lhb;")
	public Linkable2 next() {
		Linkable2 var1 = this.sentinel.next2;
		return this.sentinel == var1 ? null : var1;
	}

	@ObfuscatedName("kc.a(ZLhb;)V")
	public void pushFront(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.next2 = this.sentinel.next2;
		arg0.prev2 = this.sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	public LinkList2() {
		this.sentinel.prev2 = this.sentinel;
		this.sentinel.next2 = this.sentinel;
	}
}
