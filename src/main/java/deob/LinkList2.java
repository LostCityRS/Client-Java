package deob;

@ObfuscatedName("sf")
public final class LinkList2 {

	@ObfuscatedName("sf.h")
	public final Linkable2 field3848 = new Linkable2();

	public LinkList2() {
		this.field3848.field2528 = this.field3848;
		this.field3848.field2530 = this.field3848;
	}

	@ObfuscatedName("sf.a(I)Lme;")
	public Linkable2 method1381() {
		Linkable2 var1 = this.field3848.field2528;
		return var1 == this.field3848 ? null : var1;
	}

	@ObfuscatedName("sf.b(I)Lme;")
	public Linkable2 method1382() {
		Linkable2 var1 = this.field3848.field2528;
		if (var1 == this.field3848) {
			return null;
		} else {
			var1.method907();
			return var1;
		}
	}

	@ObfuscatedName("sf.a(ILme;)V")
	public void method1387(Linkable2 arg0) {
		if (arg0.field2530 != null) {
			arg0.method907();
		}
		arg0.field2528 = this.field3848;
		arg0.field2530 = this.field3848.field2530;
		arg0.field2530.field2528 = arg0;
		arg0.field2528.field2530 = arg0;
	}

	@ObfuscatedName("sf.a(Lme;B)V")
	public void method1388(Linkable2 arg0) {
		if (arg0.field2530 != null) {
			arg0.method907();
		}
		arg0.field2530 = this.field3848;
		arg0.field2528 = this.field3848.field2528;
		arg0.field2530.field2528 = arg0;
		arg0.field2528.field2530 = arg0;
	}
}
