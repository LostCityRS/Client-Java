package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class HashTable {

	@ObfuscatedName("u.b")
	public int bucketCount;

	@ObfuscatedName("u.c")
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

	@ObfuscatedName("u.a(J)Lv;")
	public Linkable get(long key) {
		Linkable sentinel = this.buckets[(int) (key & (long) (this.bucketCount - 1))];

		for (Linkable node = sentinel.next; node != sentinel; node = node.next) {
			if (node.key == key) {
				return node;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(IJLv;)V")
	public void put(long key, Linkable node) {
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
