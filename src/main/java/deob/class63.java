package deob;

@ObfuscatedName("kc")
public final class class63 {

	@ObfuscatedName("kc.b")
	public static class1 field1566 = Statics.method931("Loading game screen )2 ");

	@ObfuscatedName("kc.c")
	public static class1 field1567 = Statics.method931("invback");

	@ObfuscatedName("kc.h")
	public static class1 field1572 = Statics.method931(")2");

	@ObfuscatedName("kc.l")
	public static class1 field1576 = Statics.method931("sich mit einer anderen Welt zu verbinden)3");

	@ObfuscatedName("kc.q")
	public static class1 field1581 = Statics.method931("und loggen sich dann erneut ein)3");

	@ObfuscatedName("kc.r")
	public static class1 field1582 = Statics.method931("Offline");

	@ObfuscatedName("kc.w")
	public static int field1587 = 0;

	@ObfuscatedName("kc.C")
	public static class1 field1593 = field1582;

	@ObfuscatedName("kc.E")
	public static int[] field1595 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("kc.A")
	public static class1 field1591 = Statics.method931("Take");

	@ObfuscatedName("kc.D")
	public static class1 field1594 = field1591;

	@ObfuscatedName("kc.G")
	public static class1 field1597 = field1566;

	@ObfuscatedName("kc.y")
	public final class44 field1589 = new class44();

	@ObfuscatedName("kc.a(I)Lhb;")
	public class44 method597() {
		class44 var1 = this.field1589.field1158;
		if (this.field1589 == var1) {
			return null;
		} else {
			var1.method468();
			return var1;
		}
	}

	@ObfuscatedName("kc.a(ILhb;)V")
	public void method598(class44 arg0) {
		if (arg0.field1163 != null) {
			arg0.method468();
		}
		arg0.field1158 = this.field1589;
		arg0.field1163 = this.field1589.field1163;
		arg0.field1163.field1158 = arg0;
		arg0.field1158.field1163 = arg0;
	}

	@ObfuscatedName("kc.c(I)Lhb;")
	public class44 method608() {
		class44 var1 = this.field1589.field1158;
		return this.field1589 == var1 ? null : var1;
	}

	@ObfuscatedName("kc.a(ZLhb;)V")
	public void method613(class44 arg0) {
		if (arg0.field1163 != null) {
			arg0.method468();
		}
		arg0.field1158 = this.field1589.field1158;
		arg0.field1163 = this.field1589;
		arg0.field1163.field1158 = arg0;
		arg0.field1158.field1163 = arg0;
	}

	public class63() {
		this.field1589.field1163 = this.field1589;
		this.field1589.field1158 = this.field1589;
	}
}
