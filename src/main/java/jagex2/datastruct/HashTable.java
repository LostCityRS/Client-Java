package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class HashTable {

	@ObfuscatedName("u.c")
	public int bucketCount;

	@ObfuscatedName("u.d")
	public Linkable[] buckets;

	public HashTable(int arg0) {
		this.bucketCount = arg0;
		this.buckets = new Linkable[arg0];
		for (int var3 = 0; var3 < arg0; var3++) {
			Linkable var4 = this.buckets[var3] = new Linkable();
			var4.next = var4;
			var4.prev = var4;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public Linkable get(long arg0) {
		Linkable var3 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("u.a(JBLv;)V")
	public void put(long arg0, Linkable arg2) {
		if (arg2.prev != null) {
			arg2.unlink();
		}
		Linkable var5 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		arg2.prev = var5.prev;
		arg2.next = var5;
		arg2.prev.next = arg2;
		arg2.next.prev = arg2;
		arg2.key = arg0;
	}
}
