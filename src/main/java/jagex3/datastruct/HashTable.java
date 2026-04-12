package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("i")
public final class HashTable {

	@ObfuscatedName("i.b")
	public long searchKey;

	@ObfuscatedName("i.n")
	public final int bucketCount;

	@ObfuscatedName("i.r")
	public Linkable searchCursor;

	@ObfuscatedName("i.s")
	public final Linkable[] buckets;

	@ObfuscatedName("i.x")
	public int iteratorBucket = 0;

	@ObfuscatedName("i.z")
	public Linkable iteratorCursor;

	@ObfuscatedName("i.b(Z)Lnd;")
	public Linkable search() {
		this.iteratorBucket = 0;
		return this.findnext();
	}

	@ObfuscatedName("i.a(Lnd;BJ)V")
	public void put(Linkable arg0, long arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		Linkable var4 = this.buckets[(int) ((long) (this.bucketCount - 1) & arg1)];
		arg0.next = var4;
		arg0.key = arg1;
		arg0.prev = var4.prev;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("i.a(JI)Lnd;")
	public Linkable find(long arg0) {
		this.searchKey = arg0;
		Linkable var3 = this.buckets[(int) ((long) (this.bucketCount - 1) & arg0)];
		for (this.searchCursor = var3.next; this.searchCursor != var3; this.searchCursor = this.searchCursor.next) {
			if (this.searchCursor.key == arg0) {
				Linkable var4 = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return var4;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@ObfuscatedName("i.b(I)Lnd;")
	public Linkable searchnext() {
		if (this.searchCursor == null) {
			return null;
		}
		Linkable var2 = this.buckets[(int) (this.searchKey & (long) (this.bucketCount - 1))];
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

	public HashTable(int arg0) {
		this.bucketCount = arg0;
		this.buckets = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = this.buckets[var2] = new Linkable();
			var3.next = var3;
			var3.prev = var3;
		}
	}

	@ObfuscatedName("i.b(B)Lnd;")
	public Linkable findnext() {
		if (this.iteratorBucket > 0 && this.buckets[this.iteratorBucket - 1] != this.iteratorCursor) {
			Linkable var1 = this.iteratorCursor;
			this.iteratorCursor = var1.next;
			return var1;
		}
		while (this.bucketCount > this.iteratorBucket) {
			Linkable var2 = this.buckets[this.iteratorBucket++].next;
			if (this.buckets[this.iteratorBucket - 1] != var2) {
				this.iteratorCursor = var2.next;
				return var2;
			}
		}
		return null;
	}
}
