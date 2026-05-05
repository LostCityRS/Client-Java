package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("sf")
public final class LinkList2 {

	@ObfuscatedName("sf.h")
	public final Linkable2 sentinel = new Linkable2();

	public LinkList2() {
		this.sentinel.next2 = this.sentinel;
		this.sentinel.prev2 = this.sentinel;
	}

	@ObfuscatedName("sf.a(I)Lme;")
	public Linkable2 next() {
		Linkable2 var1 = this.sentinel.next2;
		return var1 == this.sentinel ? null : var1;
	}

	@ObfuscatedName("sf.b(I)Lme;")
	public Linkable2 popFront() {
		Linkable2 var1 = this.sentinel.next2;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("sf.a(ILme;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.next2 = this.sentinel;
		arg0.prev2 = this.sentinel.prev2;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("sf.a(Lme;B)V")
	public void pushFront(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.sentinel;
		arg0.next2 = this.sentinel.next2;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}
}
