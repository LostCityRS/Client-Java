package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wi")
public final class LinkList {

	@ObfuscatedName("wi.d")
	public final Linkable field4534 = new Linkable();

	@ObfuscatedName("wi.h")
	public Linkable field4538;

	public LinkList() {
		this.field4534.field1220 = this.field4534;
		this.field4534.field1212 = this.field4534;
	}

	@ObfuscatedName("wi.a(Z)Lg;")
	public Linkable head() {
		Linkable var1 = this.field4534.field1220;
		if (this.field4534 == var1) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1220;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(B)Lg;")
	public Linkable method1612() {
		Linkable var1 = this.field4534.field1212;
		if (var1 == this.field4534) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1212;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(I)Lg;")
	public Linkable method1613() {
		Linkable var1 = this.field4534.field1220;
		if (var1 == this.field4534) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("wi.a(ILg;)V")
	public void method1615(Linkable arg0) {
		if (arg0.field1212 != null) {
			arg0.unlink();
		}
		arg0.field1220 = this.field4534.field1220;
		arg0.field1212 = this.field4534;
		arg0.field1212.field1220 = arg0;
		arg0.field1220.field1212 = arg0;
	}

	@ObfuscatedName("wi.b(I)V")
	public void method1616() {
		while (true) {
			Linkable var1 = this.field4534.field1220;
			if (this.field4534 == var1) {
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("wi.c(B)Lg;")
	public Linkable method1617() {
		Linkable var1 = this.field4538;
		if (this.field4534 == var1) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1212;
			return var1;
		}
	}

	@ObfuscatedName("wi.c(I)Lg;")
	public Linkable method1619() {
		Linkable var1 = this.field4538;
		if (this.field4534 == var1) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1220;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(Lg;BLg;)V")
	public void method1620(Linkable arg0, Linkable arg1) {
		if (arg0.field1212 != null) {
			arg0.unlink();
		}
		arg0.field1212 = arg1.field1212;
		arg0.field1220 = arg1;
		arg0.field1212.field1220 = arg0;
		arg0.field1220.field1212 = arg0;
	}

	@ObfuscatedName("wi.a(Lg;I)V")
	public void push(Linkable arg0) {
		if (arg0.field1212 != null) {
			arg0.unlink();
		}
		arg0.field1212 = this.field4534.field1212;
		arg0.field1220 = this.field4534;
		arg0.field1212.field1220 = arg0;
		arg0.field1220.field1212 = arg0;
	}
}
