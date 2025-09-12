package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class HashTable {

	@ObfuscatedName("u.d")
	public int bucketCount;

	@ObfuscatedName("u.e")
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

	@ObfuscatedName("u.a(Lv;IJ)V")
	public void put(Linkable arg0, long arg2) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		Linkable var5 = this.buckets[(int) (arg2 & (long) (this.bucketCount - 1))];
		arg0.prev = var5.prev;
		arg0.next = var5;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
		arg0.key = arg2;
	}
}
