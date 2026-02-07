package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ve")
public final class LinkList2 {

	@ObfuscatedName("ve.d")
	public final Linkable2 field3455 = new Linkable2();

	public LinkList2() {
		this.field3455.field216 = this.field3455;
		this.field3455.field212 = this.field3455;
	}

	@ObfuscatedName("ve.a(BLbe;)V")
	public void method1168(Linkable2 arg0) {
		if (arg0.field216 != null) {
			arg0.method68();
		}
		arg0.field216 = this.field3455;
		arg0.field212 = this.field3455.field212;
		arg0.field216.field212 = arg0;
		arg0.field212.field216 = arg0;
	}

	@ObfuscatedName("ve.a(B)Lbe;")
	public Linkable2 method1170() {
		Linkable2 var1 = this.field3455.field212;
		return this.field3455 == var1 ? null : var1;
	}

	@ObfuscatedName("ve.a(Lbe;I)V")
	public void method1171(Linkable2 arg0) {
		if (arg0.field216 != null) {
			arg0.method68();
		}
		arg0.field212 = this.field3455;
		arg0.field216 = this.field3455.field216;
		arg0.field216.field212 = arg0;
		arg0.field212.field216 = arg0;
	}

	@ObfuscatedName("ve.a(I)Lbe;")
	public Linkable2 method1173() {
		Linkable2 var1 = this.field3455.field212;
		if (var1 == this.field3455) {
			return null;
		} else {
			var1.method68();
			return var1;
		}
	}
}
