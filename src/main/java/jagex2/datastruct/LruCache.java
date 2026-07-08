package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("s")
public final class LruCache {

	@ObfuscatedName("s.f")
	public final int capacity = 50000;

	@ObfuscatedName("s.g")
	public int available = 50000;

	@ObfuscatedName("s.h")
	public final HashTable cache = new HashTable(1024, (byte) 124);

	@ObfuscatedName("s.i")
	public final LinkList2 order = new LinkList2(9);

	@ObfuscatedName("s.a")
	public final boolean field344 = true;

	@ObfuscatedName("s.b")
	public final boolean field345 = false;

	@ObfuscatedName("s.c")
	public int field346;

	@ObfuscatedName("s.d")
	public int field347;

	@ObfuscatedName("s.e")
	public final Linkable2 field348 = new Linkable2();

	public LruCache(byte arg0, int arg1) {
	}

	@ObfuscatedName("s.a(J)Lw;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) cache.find(arg0);
		if (var3 == null) {
			field346++;
		} else {
			order.push(var3);
			field347++;
		}
		return var3;
	}

	@ObfuscatedName("s.a(JBLw;)V")
	public void put(long arg0, Linkable2 arg1) {
		if (available == 0) {
			Linkable2 var4 = order.popFront();
			var4.unlink();
			var4.unlink2();
			if (var4 == field348) {
				Linkable2 var5 = order.popFront();
				var5.unlink();
				var5.unlink2();
			}
		} else {
			available--;
		}
		cache.put(arg1, arg0);
		order.push(arg1);
	}

	@ObfuscatedName("s.a()V")
	public void clear() {
		while (true) {
			Linkable2 var1 = order.popFront();
			if (var1 == null) {
				available = capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
