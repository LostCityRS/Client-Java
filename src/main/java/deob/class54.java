package deob;

@ObfuscatedName("j")
public final class class54 extends class128 {

	@ObfuscatedName("j.bc")
	public class47 field1427;

	@ObfuscatedName("j.cc")
	public final int field1428;

	@ObfuscatedName("j.hc")
	public static int field1433 = 0;

	@ObfuscatedName("j.pc")
	public static int field1441 = 1;

	@ObfuscatedName("j.Mb")
	public static class122 field1412 = new class122();

	@ObfuscatedName("j.Wb")
	public final int field1422;

	@ObfuscatedName("j.Ub")
	public final int field1420;

	@ObfuscatedName("j.Lb")
	public final int field1411;

	@ObfuscatedName("j.Xb")
	public final int field1423;

	@ObfuscatedName("j.Jb")
	public final int field1409;

	@ObfuscatedName("j.Ob")
	public final int field1414;

	@ObfuscatedName("j.Tb")
	public int field1419;

	@ObfuscatedName("j.Rb")
	public int field1417;

	@ObfuscatedName("j.f(I)Lpa;")
	@Override
	public class91 method41() {
		if (this.field1427 != null) {
			int var1 = Linkable.field2063 - this.field1417;
			if (var1 > 100 && this.field1427.field1254 > 0) {
				var1 = 100;
			}
			label37: {
				do {
					do {
						if (this.field1427.field1223[this.field1419] >= var1) {
							break label37;
						}
						var1 -= this.field1427.field1223[this.field1419];
						this.field1419++;
					} while (this.field1427.field1242.length > this.field1419);
					this.field1419 -= this.field1427.field1254;
				} while (this.field1419 >= 0 && this.field1427.field1242.length > this.field1419);
				this.field1427 = null;
			}
			this.field1417 = Linkable.field2063 - var1;
		}
		class49 var2 = Statics.method389(this.field1428);
		if (var2.field1317 != null) {
			var2 = var2.method516();
		}
		return var2 == null ? null : var2.method512(this.field1422, this.field1423, this.field1419, this.field1414, this.field1411, this.field1427, this.field1420, this.field1409);
	}

	public class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		this.field1422 = arg3;
		this.field1428 = arg0;
		this.field1420 = arg6;
		this.field1411 = arg2;
		this.field1423 = arg4;
		this.field1409 = arg5;
		this.field1414 = arg1;
		if (arg7 != -1) {
			this.field1427 = Statics.method103(arg7);
			this.field1419 = 0;
			this.field1417 = Linkable.field2063 - 1;
			if (arg8 && this.field1427.field1254 != -1) {
				this.field1419 = (int) ((double) this.field1427.field1242.length * Math.random());
				this.field1417 -= (int) (Math.random() * (double) this.field1427.field1223[this.field1419]);
				return;
			}
		}
	}
}
