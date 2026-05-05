package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ob")
public final class HashTable {

	@ObfuscatedName("ob.h")
	public final Linkable[] buckets;

	@ObfuscatedName("ob.i")
	public final int bucketCount;

	@ObfuscatedName("ob.r")
	public Linkable searchCursor;

	@ObfuscatedName("ob.v")
	public long field2985;

	@ObfuscatedName("ob.z")
	public int iteratorBucket = 0;

	@ObfuscatedName("ob.A")
	public Linkable iteratorCursor;

	public HashTable(int arg0) {
		this.bucketCount = arg0;
		this.buckets = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = this.buckets[var2] = new Linkable();
			var3.prev = var3;
			var3.next = var3;
		}
	}

	@ObfuscatedName("ob.a(I)Lg;")
	public Linkable search() {
		this.iteratorBucket = 0;
		return this.findnext();
	}

	@ObfuscatedName("ob.a(B)Lg;")
	public Linkable findnext() {
		if (this.iteratorBucket > 0 && this.iteratorCursor != this.buckets[this.iteratorBucket - 1]) {
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

	@ObfuscatedName("ob.a(IJ)Lg;")
	public Linkable find(long arg0) {
		this.field2985 = arg0;
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

	@ObfuscatedName("ob.a(JLg;I)V")
	public void put(long arg0, Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		Linkable var4 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		arg1.key = arg0;
		arg1.prev = var4.prev;
		arg1.next = var4;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
	}

	@ObfuscatedName("ob.c(I)Lg;")
	public Linkable method1054(int arg0) {
		if (this.searchCursor == null) {
			return null;
		}
		Linkable var2 = this.buckets[(int) (this.field2985 & (long) (this.bucketCount - 1))];
		if (arg0 != 3) {
			this.findnext();
		}
		while (this.searchCursor != var2) {
			if (this.field2985 == this.searchCursor.key) {
				Linkable var3 = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return var3;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}
}
