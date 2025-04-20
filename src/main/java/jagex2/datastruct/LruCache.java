package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public class LruCache {

	@ObfuscatedName("t.a")
	public int notFound;

	@ObfuscatedName("t.b")
	public int found;

	@ObfuscatedName("t.c")
	public DoublyLinkable search = new DoublyLinkable();

	@ObfuscatedName("t.d")
	public int capacity;

	@ObfuscatedName("t.e")
	public int available;

	@ObfuscatedName("t.f")
	public HashTable table = new HashTable(3, 1024);

	@ObfuscatedName("t.g")
	public DoublyLinkList history = new DoublyLinkList(526);

	public LruCache(int arg0, int arg1) {
		if (arg1 != 1) {
			throw new NullPointerException();
		}
		this.capacity = arg0;
		this.available = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public DoublyLinkable get(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) this.table.get(arg0);
		if (var3 == null) {
			this.notFound++;
		} else {
			this.history.addTail(var3);
			this.found++;
		}
		return var3;
	}

	@ObfuscatedName("t.a(Lx;JI)V")
	public void put(DoublyLinkable arg0, long arg1, int arg2) {
		if (this.available == 0) {
			DoublyLinkable var5 = this.history.removeHead();
			var5.unlink();
			var5.unlink2();
			if (this.search == var5) {
				DoublyLinkable var6 = this.history.removeHead();
				var6.unlink();
				var6.unlink2();
			}
		} else {
			this.available--;
		}
		this.table.put(5, arg1, arg0);
		if (arg2 == 39399) {
			this.history.addTail(arg0);
		}
	}

	@ObfuscatedName("t.a()V")
	public void clear() {
		while (true) {
			DoublyLinkable var1 = this.history.removeHead();
			if (var1 == null) {
				this.available = this.capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
