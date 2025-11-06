package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public class DoublyLinkList {

	@ObfuscatedName("qb.c")
	public DoublyLinkable field747 = new DoublyLinkable();

	@ObfuscatedName("qb.d")
	public DoublyLinkable field748;

	public DoublyLinkList() {
		this.field747.field401 = this.field747;
		this.field747.field402 = this.field747;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method263(DoublyLinkable arg0) {
		if (arg0.field402 != null) {
			arg0.method121();
		}
		arg0.field402 = this.field747.field402;
		arg0.field401 = this.field747;
		arg0.field402.field401 = arg0;
		arg0.field401.field402 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public DoublyLinkable method264() {
		DoublyLinkable var1 = this.field747.field401;
		if (var1 == this.field747) {
			return null;
		} else {
			var1.method121();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public DoublyLinkable method265() {
		DoublyLinkable var1 = this.field747.field401;
		if (var1 == this.field747) {
			this.field748 = null;
			return null;
		} else {
			this.field748 = var1.field401;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public DoublyLinkable method266() {
		DoublyLinkable var2 = this.field748;
		if (var2 == this.field747) {
			this.field748 = null;
			return null;
		}
		this.field748 = var2.field401;
		return var2;
	}

	@ObfuscatedName("qb.c()I")
	public int method267() {
		int var1 = 0;
		for (DoublyLinkable var2 = this.field747.field401; var2 != this.field747; var2 = var2.field401) {
			var1++;
		}
		return var1;
	}
}
