package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("cb")
public final class LruCache {

	@ObfuscatedName("cb.d")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("cb.k")
	public int available;

	@ObfuscatedName("cb.l")
	public final int capacity;

	@ObfuscatedName("cb.m")
	public final HashTable cache;

	@ObfuscatedName("cb.n")
	public final LinkList2 order = new LinkList2();

	@ObfuscatedName("cb.a(IJLhb;)V")
	public void put(long arg0, Linkable2 arg1) {
		if (this.available == 0) {
			Linkable2 var4 = this.order.popFront();
			var4.unlink();
			var4.unlink2();
			if (this.sentinel == var4) {
				Linkable2 var5 = this.order.popFront();
				var5.unlink();
				var5.unlink2();
			}
		} else {
			this.available--;
		}
		this.cache.put(arg1, arg0);
		this.order.push(arg1);
	}

	@ObfuscatedName("cb.a(JB)Lhb;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 != null) {
			this.order.push(var3);
		}
		return var3;
	}

	@ObfuscatedName("cb.a(JI)V")
	public void remove(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 != null) {
			var3.unlink();
			var3.unlink2();
			this.available++;
		}
	}

	@ObfuscatedName("cb.a(B)V")
	public void clear() {
		while (true) {
			Linkable2 var1 = this.order.popFront();
			if (var1 == null) {
				this.available = this.capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}

	public LruCache(int arg0) {
		this.capacity = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.available = arg0;
		this.cache = new HashTable(var2);
	}
}
