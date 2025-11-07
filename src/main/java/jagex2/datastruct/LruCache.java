package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public class LruCache {

	@ObfuscatedName("t.d")
	public int notFound;

	@ObfuscatedName("t.e")
	public int found;

	@ObfuscatedName("t.f")
	public DoublyLinkable search = new DoublyLinkable();

	@ObfuscatedName("t.g")
	public int capacity;

	@ObfuscatedName("t.h")
	public int available;

	@ObfuscatedName("t.i")
	public HashTable table = new HashTable(1024);

	@ObfuscatedName("t.j")
	public DoublyLinkList history = new DoublyLinkList();

	public LruCache(int arg1) {
		this.capacity = arg1;
		this.available = arg1;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public DoublyLinkable get(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) this.table.get(arg0);
		if (var3 == null) {
			this.notFound++;
		} else {
			this.history.push(var3);
			this.found++;
		}
		return var3;
	}

	@ObfuscatedName("t.a(Lx;ZJ)V")
	public void put(DoublyLinkable arg0, long arg2) {
		if (this.available == 0) {
			DoublyLinkable var5 = this.history.pop();
			var5.unlink();
			var5.unlink2();
			if (var5 == this.search) {
				DoublyLinkable var6 = this.history.pop();
				var6.unlink();
				var6.unlink2();
			}
		} else {
			this.available--;
		}
		this.table.put(arg2, arg0);
		this.history.push(arg0);
	}

	@ObfuscatedName("t.a()V")
	public void clear() {
		while (true) {
			DoublyLinkable var1 = this.history.pop();
			if (var1 == null) {
				this.available = this.capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
