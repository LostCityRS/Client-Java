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
	public HashTable table = new HashTable(1024);

	@ObfuscatedName("t.g")
	public DoublyLinkList history = new DoublyLinkList();

	public LruCache(int size) {
		this.capacity = size;
		this.available = size;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public DoublyLinkable get(long key) {
		DoublyLinkable node = (DoublyLinkable) this.table.get(key);
		if (node == null) {
			this.notFound++;
		} else {
			this.history.push(node);
			this.found++;
		}

		return node;
	}

	@ObfuscatedName("t.a(Lx;JI)V")
	public void put(DoublyLinkable node, long key) {
		if (this.available == 0) {
			DoublyLinkable sentinel = this.history.pop();
			sentinel.unlink();
			sentinel.unlink2();

			if (this.search == sentinel) {
				DoublyLinkable next = this.history.pop();
				next.unlink();
				next.unlink2();
			}
		} else {
			this.available--;
		}

		this.table.put(key, node);
		this.history.push(node);
	}

	@ObfuscatedName("t.a()V")
	public void clear() {
		while (true) {
			DoublyLinkable node = this.history.pop();
			if (node == null) {
				this.available = this.capacity;
				return;
			}

			node.unlink();
			node.unlink2();
		}
	}
}
