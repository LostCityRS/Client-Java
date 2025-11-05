package jagex2.datastruct;

import deob.ObfuscatedName;

public class HashTable {

	@ObfuscatedName("JLFXAIRK.c")
	public int bucketCount;

	@ObfuscatedName("JLFXAIRK.d")
	public Linkable[] buckets;

	public HashTable(int size) {
		this.bucketCount = size;
		this.buckets = new Linkable[size];

		for (int i = 0; i < size; i++) {
			Linkable node = this.buckets[i] = new Linkable();
			node.next = node;
			node.prev = node;
		}
	}

	@ObfuscatedName("JLFXAIRK.a(J)LZUOIJLRD;")
	public Linkable get(long key) {
		Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];

		for (Linkable node = sentinel.next; node != sentinel; node = node.next) {
			if (node.key == key) {
				return node;
			}
		}

		return null;
	}

	@ObfuscatedName("JLFXAIRK.a(ILZUOIJLRD;J)V")
	public void put(Linkable node, long key) {
		if (node.prev != null) {
			node.unlink();
		}

		Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];
		node.prev = sentinel.prev;
		node.next = sentinel;
		node.prev.next = node;
		node.next.prev = node;
		node.key = key;
	}
}
