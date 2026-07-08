package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public final class HashTable {

	@ObfuscatedName("t.d")
	public final int bucketCount = 1024;

	@ObfuscatedName("t.e")
	public final Linkable[] buckets = new Linkable[1024];

	@ObfuscatedName("t.a")
	public final boolean field353 = false;

	@ObfuscatedName("t.b")
	public final boolean field354 = false;

	@ObfuscatedName("t.c")
	public final int field355 = 8;

	public HashTable(int arg0, byte arg1) {
		for (int var3 = 0; var3 < 1024; var3++) {
			Linkable var4 = buckets[var3] = new Linkable();
			var4.next = var4;
			var4.prev = var4;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public Linkable find(long arg0) {
		Linkable var3 = buckets[(int) (arg0 & (long) (bucketCount - 1))];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("t.a(ZLu;J)V")
	public void put(Linkable arg0, long arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		Linkable var4 = buckets[(int) (arg1 & (long) (bucketCount - 1))];
		arg0.prev = var4.prev;
		arg0.next = var4;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
		arg0.key = arg1;
	}
}
