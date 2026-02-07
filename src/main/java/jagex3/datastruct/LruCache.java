package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ja")
public final class LruCache {

	@ObfuscatedName("ja.i")
	public final Linkable2 field1448 = new Linkable2();

	@ObfuscatedName("ja.H")
	public final LinkList2 field1473 = new LinkList2();

	@ObfuscatedName("ja.F")
	public int field1471;

	@ObfuscatedName("ja.I")
	public final int field1474;

	@ObfuscatedName("ja.J")
	public final HashTable field1475;

	public LruCache(int arg0) {
		int var2 = 1;
		this.field1471 = arg0;
		this.field1474 = arg0;
		while (var2 + var2 < arg0) {
			var2 += var2;
		}
		this.field1475 = new HashTable(var2);
	}

	@ObfuscatedName("ja.a(JBLbe;)V")
	public void put(long arg0, Linkable2 arg1) {
		if (this.field1471 == 0) {
			Linkable2 var4 = this.field1473.method1173();
			var4.unlink();
			var4.method68();
			if (this.field1448 == var4) {
				Linkable2 var5 = this.field1473.method1173();
				var5.unlink();
				var5.method68();
			}
		} else {
			this.field1471--;
		}
		this.field1475.put(arg0, arg1);
		this.field1473.method1171(arg1);
	}

	@ObfuscatedName("ja.a(IJ)Lbe;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) this.field1475.method1196(arg0);
		if (var3 != null) {
			this.field1473.method1171(var3);
		}
		return var3;
	}

	@ObfuscatedName("ja.a(JZ)V")
	public void method486(long arg0) {
		Linkable2 var3 = (Linkable2) this.field1475.method1196(arg0);
		if (var3 != null) {
			var3.unlink();
			var3.method68();
			this.field1471++;
		}
	}

	@ObfuscatedName("ja.a(I)V")
	public void clear() {
		while (true) {
			Linkable2 var1 = this.field1473.method1173();
			if (var1 == null) {
				this.field1471 = this.field1474;
				return;
			}
			var1.unlink();
			var1.method68();
		}
	}
}
