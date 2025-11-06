package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public class LruCache {

	@ObfuscatedName("t.d")
	public int field362;

	@ObfuscatedName("t.e")
	public int field363;

	@ObfuscatedName("t.f")
	public DoublyLinkable field364 = new DoublyLinkable();

	@ObfuscatedName("t.g")
	public int field365;

	@ObfuscatedName("t.h")
	public int field366;

	@ObfuscatedName("t.i")
	public HashTable field367 = new HashTable(1024);

	@ObfuscatedName("t.j")
	public DoublyLinkList field368 = new DoublyLinkList();

	public LruCache(int arg1) {
		this.field365 = arg1;
		this.field366 = arg1;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public DoublyLinkable method115(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) this.field367.method118(arg0);
		if (var3 == null) {
			this.field362++;
		} else {
			this.field368.method263(var3);
			this.field363++;
		}
		return var3;
	}

	@ObfuscatedName("t.a(Lx;ZJ)V")
	public void method116(DoublyLinkable arg0, long arg2) {
		if (this.field366 == 0) {
			DoublyLinkable var5 = this.field368.method264();
			var5.method120();
			var5.method121();
			if (var5 == this.field364) {
				DoublyLinkable var6 = this.field368.method264();
				var6.method120();
				var6.method121();
			}
		} else {
			this.field366--;
		}
		this.field367.method119(arg2, arg0);
		this.field368.method263(arg0);
	}

	@ObfuscatedName("t.a()V")
	public void method117() {
		while (true) {
			DoublyLinkable var1 = this.field368.method264();
			if (var1 == null) {
				this.field366 = this.field365;
				return;
			}
			var1.method120();
			var1.method121();
		}
	}
}
