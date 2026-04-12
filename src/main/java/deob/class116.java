package deob;

@ObfuscatedName("tb")
public final class class116 extends class128 {

	@ObfuscatedName("tb.cc")
	public final int field2905;

	@ObfuscatedName("tb.Rb")
	public static int[][] field2894 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("tb.Tb")
	public int field2896 = 0;

	@ObfuscatedName("tb.Qb")
	public boolean field2893 = false;

	@ObfuscatedName("tb.Mb")
	public int field2889 = 0;

	@ObfuscatedName("tb.Ob")
	public final int field2891;

	@ObfuscatedName("tb.Xb")
	public final int field2900;

	@ObfuscatedName("tb.Jb")
	public final int field2886;

	@ObfuscatedName("tb.Kb")
	public final int field2887;

	@ObfuscatedName("tb.Sb")
	public final int field2895;

	@ObfuscatedName("tb.Vb")
	public class47 field2898;

	public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field2891 = arg3;
		this.field2900 = arg2;
		this.field2886 = arg5 + arg6;
		this.field2887 = arg4;
		this.field2905 = arg0;
		this.field2895 = arg1;
		int var8 = Statics.method713(this.field2905).field786;
		if (var8 == -1) {
			this.field2893 = true;
		} else {
			this.field2893 = false;
			this.field2898 = Statics.method103(var8);
		}
	}

	@ObfuscatedName("tb.f(I)Lpa;")
	@Override
	public class91 method41() {
		class28 var1 = Statics.method713(this.field2905);
		class91 var2;
		if (this.field2893) {
			var2 = var1.method371(-1);
		} else {
			var2 = var1.method371(this.field2896);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("tb.b(II)V")
	public void method958(int arg0) {
		if (this.field2893) {
			return;
		}
		this.field2889 += arg0;
		while (this.field2889 > this.field2898.field1223[this.field2896]) {
			this.field2889 -= this.field2898.field1223[this.field2896];
			this.field2896++;
			if (this.field2898.field1242.length <= this.field2896) {
				this.field2893 = true;
				return;
			}
		}
	}
}
