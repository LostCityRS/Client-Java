package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("id")
public final class LruCache {

	@ObfuscatedName("id.f")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("id.k")
	public final LinkList2 order = new LinkList2();

	@ObfuscatedName("id.l")
	public final HashTable cache;

	@ObfuscatedName("id.m")
	public final int capacity;

	@ObfuscatedName("id.n")
	public int available;

	public LruCache(int arg0) {
		this.capacity = arg0;
		this.available = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.cache = new HashTable(var2);
	}

	@ObfuscatedName("id.a(JLme;Z)V")
	public void put(long arg0, Linkable2 arg1) {
		if (this.available == 0) {
			Linkable2 var4 = this.order.popFront();
			var4.unlink();
			var4.unlink2();
			if (var4 == this.sentinel) {
				Linkable2 var5 = this.order.popFront();
				var5.unlink();
				var5.unlink2();
			}
		} else {
			this.available--;
		}
		this.cache.put(arg0, arg1);
		this.order.push(arg1);
	}

	@ObfuscatedName("id.a(I)Lg;")
	public Linkable findnext() {
		return this.cache.findnext();
	}

	@ObfuscatedName("id.a(JI)Lme;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 != null) {
			this.order.push(var3);
		}
		return var3;
	}

	@ObfuscatedName("id.a(ZJ)V")
	public void remove(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 != null) {
			var3.unlink();
			var3.unlink2();
			this.available++;
		}
	}

	@ObfuscatedName("id.b(I)V")
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

	@ObfuscatedName("id.a(Z)Lg;")
	public Linkable search() {
		return this.cache.search();
	}
}
