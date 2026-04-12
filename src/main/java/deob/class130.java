package deob;

@ObfuscatedName("vd")
public final class class130 extends class80 {

	@ObfuscatedName("vd.ud")
	public static int field3176 = 0;

	@ObfuscatedName("vd.Ed")
	public static int[] field3186 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("vd.Ad")
	public class42 field3182;

	@ObfuscatedName("vd.f(I)Lpa;")
	@Override
	public class91 method41() {
		if (this.field3182 == null) {
			return null;
		}
		class47 var1 = super.field2015 != -1 && super.field1996 == 0 ? Statics.method103(super.field2015) : null;
		class47 var2 = super.field1951 == -1 || super.field2000 == super.field1951 && var1 != null ? null : Statics.method103(super.field1951);
		class91 var3 = this.field3182.method448(var1, var2, super.field1990, super.field1978);
		if (var3 == null) {
			return null;
		}
		var3.method766();
		super.field1991 = var3.field3135;
		if (super.field1965 != -1 && super.field2014 != -1) {
			class91 var4 = Statics.method713(super.field1965).method371(super.field2014);
			if (var4 != null) {
				var4.method796(0, -super.field1984, 0);
				class91[] var5 = new class91[] { var3, var4 };
				var3 = new class91(var5, 2, true);
			}
		}
		if (this.field3182.field1084 == 1) {
			var3.field2205 = true;
		}
		return var3;
	}

	@ObfuscatedName("vd.h(I)Z")
	@Override
	public boolean method42() {
		return this.field3182 != null;
	}
}
