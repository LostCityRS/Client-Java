package deob;

@ObfuscatedName("kc")
public final class LinkList2 {

	@ObfuscatedName("kc.w")
	public static int field1587 = 0;

	@ObfuscatedName("kc.E")
	public static int[] field1595 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("kc.y")
	public final Linkable2 field1589 = new Linkable2();

	@ObfuscatedName("kc.a(I)Lhb;")
	public Linkable2 method597() {
		Linkable2 var1 = this.field1589.field1158;
		if (this.field1589 == var1) {
			return null;
		} else {
			var1.method468();
			return var1;
		}
	}

	@ObfuscatedName("kc.a(ILhb;)V")
	public void method598(Linkable2 arg0) {
		if (arg0.field1163 != null) {
			arg0.method468();
		}
		arg0.field1158 = this.field1589;
		arg0.field1163 = this.field1589.field1163;
		arg0.field1163.field1158 = arg0;
		arg0.field1158.field1163 = arg0;
	}

	@ObfuscatedName("kc.c(I)Lhb;")
	public Linkable2 method608() {
		Linkable2 var1 = this.field1589.field1158;
		return this.field1589 == var1 ? null : var1;
	}

	@ObfuscatedName("kc.a(ZLhb;)V")
	public void method613(Linkable2 arg0) {
		if (arg0.field1163 != null) {
			arg0.method468();
		}
		arg0.field1158 = this.field1589.field1158;
		arg0.field1163 = this.field1589;
		arg0.field1163.field1158 = arg0;
		arg0.field1158.field1163 = arg0;
	}

	public LinkList2() {
		this.field1589.field1163 = this.field1589;
		this.field1589.field1158 = this.field1589;
	}
}
