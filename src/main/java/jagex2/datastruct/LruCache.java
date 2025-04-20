package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public class LruCache {

	@ObfuscatedName("t.a")
	public int field358;

	@ObfuscatedName("t.b")
	public int field359;

	@ObfuscatedName("t.c")
	public DoublyLinkable field360 = new DoublyLinkable();

	@ObfuscatedName("t.d")
	public int field361;

	@ObfuscatedName("t.e")
	public int field362;

	@ObfuscatedName("t.f")
	public HashTable field363 = new HashTable(3, 1024);

	@ObfuscatedName("t.g")
	public DoublyLinkList field364 = new DoublyLinkList(526);

	public LruCache(int arg0, int arg1) {
		if (arg1 != 1) {
			throw new NullPointerException();
		}
		this.field361 = arg0;
		this.field362 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public DoublyLinkable get(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) this.field363.method117(arg0);
		if (var3 == null) {
			this.field358++;
		} else {
			this.field364.method262(var3);
			this.field359++;
		}
		return var3;
	}

	@ObfuscatedName("t.a(Lx;JI)V")
	public void put(DoublyLinkable arg0, long arg1, int arg2) {
		if (this.field362 == 0) {
			DoublyLinkable var5 = this.field364.method263();
			var5.unlink();
			var5.unlink2();
			if (this.field360 == var5) {
				DoublyLinkable var6 = this.field364.method263();
				var6.unlink();
				var6.unlink2();
			}
		} else {
			this.field362--;
		}
		this.field363.method118(5, arg1, arg0);
		if (arg2 == 39399) {
			this.field364.method262(arg0);
		}
	}

	@ObfuscatedName("t.a()V")
	public void method116() {
		while (true) {
			DoublyLinkable var1 = this.field364.method263();
			if (var1 == null) {
				this.field362 = this.field361;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
