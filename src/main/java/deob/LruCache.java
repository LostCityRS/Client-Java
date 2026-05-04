package deob;

@ObfuscatedName("id")
public final class LruCache {

	@ObfuscatedName("id.f")
	public final Linkable2 field1722 = new Linkable2();

	@ObfuscatedName("id.k")
	public final LinkList2 field1727 = new LinkList2();

	@ObfuscatedName("id.l")
	public final HashTable field1728;

	@ObfuscatedName("id.m")
	public final int field1729;

	@ObfuscatedName("id.n")
	public int field1730;

	public LruCache(int arg0) {
		this.field1729 = arg0;
		this.field1730 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field1728 = new HashTable(var2);
	}

	@ObfuscatedName("id.a(JLme;Z)V")
	public void method663(long arg0, Linkable2 arg1) {
		if (this.field1730 == 0) {
			Linkable2 var4 = this.field1727.method1382();
			var4.unlink();
			var4.method907();
			if (var4 == this.field1722) {
				Linkable2 var5 = this.field1727.method1382();
				var5.unlink();
				var5.method907();
			}
		} else {
			this.field1730--;
		}
		this.field1728.put(arg0, arg1);
		this.field1727.method1387(arg1);
	}

	@ObfuscatedName("id.a(I)Lg;")
	public Linkable method664() {
		return this.field1728.method1048();
	}

	@ObfuscatedName("id.a(JI)Lme;")
	public Linkable2 method665(long arg0) {
		Linkable2 var3 = (Linkable2) this.field1728.method1049(arg0);
		if (var3 != null) {
			this.field1727.method1387(var3);
		}
		return var3;
	}

	@ObfuscatedName("id.a(ZJ)V")
	public void method666(long arg0) {
		Linkable2 var3 = (Linkable2) this.field1728.method1049(arg0);
		if (var3 != null) {
			var3.unlink();
			var3.method907();
			this.field1730++;
		}
	}

	@ObfuscatedName("id.b(I)V")
	public void clear() {
		while (true) {
			Linkable2 var1 = this.field1727.method1382();
			if (var1 == null) {
				this.field1730 = this.field1729;
				return;
			}
			var1.unlink();
			var1.method907();
		}
	}

	@ObfuscatedName("id.a(Z)Lg;")
	public Linkable method671() {
		return this.field1728.method1047();
	}
}
