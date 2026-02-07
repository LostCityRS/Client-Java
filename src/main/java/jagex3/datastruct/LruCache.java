package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ja")
public final class LruCache {

	@ObfuscatedName("ja.i")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("ja.H")
	public final LinkList2 order = new LinkList2();

	@ObfuscatedName("ja.F")
	public int available;

	@ObfuscatedName("ja.I")
	public final int capacity;

	@ObfuscatedName("ja.J")
	public final HashTable cache;

	public LruCache(int arg0) {
		int var2 = 1;
		this.available = arg0;
		this.capacity = arg0;
		while (var2 + var2 < arg0) {
			var2 += var2;
		}
		this.cache = new HashTable(var2);
	}

	@ObfuscatedName("ja.a(JBLbe;)V")
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
		this.cache.put(arg0, arg1);
		this.order.push(arg1);
	}

	@ObfuscatedName("ja.a(IJ)Lbe;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 != null) {
			this.order.push(var3);
		}
		return var3;
	}

	@ObfuscatedName("ja.a(JZ)V")
	public void remove(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 != null) {
			var3.unlink();
			var3.unlink2();
			this.available++;
		}
	}

	@ObfuscatedName("ja.a(I)V")
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
}
