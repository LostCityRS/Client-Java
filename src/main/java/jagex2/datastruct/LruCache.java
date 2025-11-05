package jagex2.datastruct;

import deob.ObfuscatedName;

public class LruCache {

	@ObfuscatedName("RHNYLZZL.d")
	public DoublyLinkable search = new DoublyLinkable();

	@ObfuscatedName("RHNYLZZL.h")
	public DoublyLinkList history = new DoublyLinkList();

	@ObfuscatedName("RHNYLZZL.e")
	public int capacity;

	@ObfuscatedName("RHNYLZZL.f")
	public int available;

	@ObfuscatedName("RHNYLZZL.g")
	public HashTable table;

	@ObfuscatedName("RHNYLZZL.b")
	public int notFound;

	@ObfuscatedName("RHNYLZZL.c")
	public int found;

	public LruCache(int size) {
		this.capacity = size;
		this.available = size;
		this.table = new HashTable(1024);
	}

	@ObfuscatedName("RHNYLZZL.a(J)LDPPNUUMQ;")
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

	@ObfuscatedName("RHNYLZZL.a(LDPPNUUMQ;JI)V")
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

		this.table.put(node, key);
		this.history.push(node);
	}

	@ObfuscatedName("RHNYLZZL.a()V")
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
