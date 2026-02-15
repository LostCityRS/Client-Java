package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wc")
public final class HashTable {

	@ObfuscatedName("wc.h")
	public Linkable searchCursor;

	@ObfuscatedName("wc.j")
	public final int bucketCount;

	@ObfuscatedName("wc.m")
	public long searchKey;

	@ObfuscatedName("wc.t")
	public final Linkable[] buckets;

	@ObfuscatedName("wc.v")
	public int iteratorBucket = 0;

	@ObfuscatedName("wc.w")
	public Linkable iteratorCursor;

	public HashTable(int arg0) {
		this.buckets = new Linkable[arg0];
		this.bucketCount = arg0;
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = this.buckets[var2] = new Linkable();
			var3.next = var3;
			var3.prev = var3;
		}
	}

	@ObfuscatedName("wc.a(JB)Lv;")
	public Linkable find(long arg0) {
		this.searchKey = arg0;
		Linkable var3 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (this.searchCursor = var3.next; this.searchCursor != var3; this.searchCursor = this.searchCursor.next) {
			if (arg0 == this.searchCursor.key) {
				Linkable var4 = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return var4;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@ObfuscatedName("wc.a(I)Lv;")
	public Linkable findnext() {
		if (this.iteratorBucket > 0 && this.buckets[this.iteratorBucket - 1] != this.iteratorCursor) {
			Linkable var1 = this.iteratorCursor;
			this.iteratorCursor = var1.next;
			return var1;
		}
		while (this.iteratorBucket < this.bucketCount) {
			Linkable var2 = this.buckets[this.iteratorBucket++].next;
			if (var2 != this.buckets[this.iteratorBucket - 1]) {
				this.iteratorCursor = var2.next;
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("wc.a(ZJLv;)V")
	public void put(long arg0, Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		Linkable var4 = this.buckets[(int) ((long) (this.bucketCount - 1) & arg0)];
		arg1.next = var4;
		arg1.prev = var4.prev;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
		arg1.key = arg0;
	}

	@ObfuscatedName("wc.b(B)Lv;")
	public Linkable searchnext() {
		if (this.searchCursor == null) {
			return null;
		}
		Linkable var2 = this.buckets[(int) ((long) (this.bucketCount - 1) & this.searchKey)];
		while (this.searchCursor != var2) {
			if (this.searchCursor.key == this.searchKey) {
				Linkable var3 = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return var3;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}

	@ObfuscatedName("wc.c(B)Lv;")
	public Linkable search() {
		this.iteratorBucket = 0;
		return this.findnext();
	}
}
