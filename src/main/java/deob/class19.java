package deob;

@ObfuscatedName("d")
public final class class19 extends class128 {

	@ObfuscatedName("d.ac")
	public int field630 = 0;

	@ObfuscatedName("d.bc")
	public final int field631;

	@ObfuscatedName("d.cc")
	public static boolean[] field632 = new boolean[5];

	@ObfuscatedName("d.dc")
	public int field633;

	@ObfuscatedName("d.ec")
	public static class1 field634 = Statics.method931("Regeln versto-8en hat)3");

	@ObfuscatedName("d.hc")
	public double field637;

	@ObfuscatedName("d.ic")
	public final int field638;

	@ObfuscatedName("d.jc")
	public int field639 = 0;

	@ObfuscatedName("d.lc")
	public final int field641;

	@ObfuscatedName("d.mc")
	public static class1 field642 = Statics.method931("Jun");

	@ObfuscatedName("d.oc")
	public static int[] field644 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@ObfuscatedName("d.pc")
	public static class1 field645 = Statics.method931("Nov");

	@ObfuscatedName("d.qc")
	public final int field646;

	@ObfuscatedName("d.rc")
	public static class1 field647 = Statics.method931("Mar");

	@ObfuscatedName("d.sc")
	public static class1 field648 = Statics.method931("Jul");

	@ObfuscatedName("d.tc")
	public double field649;

	@ObfuscatedName("d.uc")
	public double field650;

	@ObfuscatedName("d.wc")
	public double field652;

	@ObfuscatedName("d.Qb")
	public static class1 field620 = Statics.method931("Feb");

	@ObfuscatedName("d.Wb")
	public static class1 field626 = Statics.method931("Aug");

	@ObfuscatedName("d.Ub")
	public static class1 field624 = Statics.method931("Dec");

	@ObfuscatedName("d.Ac")
	public static int field656 = 0;

	@ObfuscatedName("d.zc")
	public static class1 field655 = Statics.method931("May");

	@ObfuscatedName("d.Dc")
	public static class1 field659 = Statics.method931("Loading wordpack )2 ");

	@ObfuscatedName("d.Sb")
	public static class1 field622 = Statics.method931("Oct");

	@ObfuscatedName("d.Lc")
	public static class1 field667 = Statics.method931("Connecting to server)3)3)3");

	@ObfuscatedName("d.Kc")
	public static class1 field666 = field667;

	@ObfuscatedName("d.Nc")
	public static class1 field669 = Statics.method931("Jan");

	@ObfuscatedName("d.Tb")
	public static class1 field623 = Statics.method931("Sep");

	@ObfuscatedName("d.Pc")
	public static class1 field671 = field659;

	@ObfuscatedName("d.Qc")
	public static class1 field672 = Statics.method931("Apr");

	@ObfuscatedName("d.Rb")
	public static class1[] field621 = new class1[] { field669, field620, field647, field672, field655, field642, field648, field626, field623, field622, field645, field624 };

	@ObfuscatedName("d.Vb")
	public boolean field625 = false;

	@ObfuscatedName("d.Lb")
	public final int field615;

	@ObfuscatedName("d.Kb")
	public final int field614;

	@ObfuscatedName("d.Nb")
	public final int field617;

	@ObfuscatedName("d.Pb")
	public final int field619;

	@ObfuscatedName("d.Yb")
	public final int field628;

	@ObfuscatedName("d.Ob")
	public final int field618;

	@ObfuscatedName("d.yc")
	public final int field654;

	@ObfuscatedName("d.Hc")
	public final class47 field663;

	@ObfuscatedName("d.Zb")
	public double field629;

	@ObfuscatedName("d.xc")
	public double field653;

	@ObfuscatedName("d.Cc")
	public double field658;

	@ObfuscatedName("d.Mc")
	public double field668;

	@ObfuscatedName("d.Oc")
	public int field670;

	public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.field615 = arg2;
		this.field614 = arg4;
		this.field625 = false;
		this.field617 = arg10;
		this.field646 = arg8;
		this.field619 = arg0;
		this.field638 = arg1;
		this.field628 = arg6;
		this.field631 = arg5;
		this.field618 = arg9;
		this.field641 = arg3;
		this.field654 = arg7;
		int var12 = Statics.method713(this.field619).field786;
		if (var12 == -1) {
			this.field663 = null;
		} else {
			this.field663 = Statics.method103(var12);
		}
	}

	@ObfuscatedName("d.f(I)Lpa;")
	@Override
	public class91 method41() {
		class28 var1 = Statics.method713(this.field619);
		class91 var2 = var1.method371(this.field639);
		if (var2 == null) {
			return null;
		} else {
			var2.method772(this.field633);
			return var2;
		}
	}

	@ObfuscatedName("d.b(II)V")
	public void method299(int arg0) {
		this.field625 = true;
		this.field650 += (double) arg0 * this.field658;
		this.field637 += (double) arg0 * this.field668;
		this.field649 += this.field653 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field629;
		this.field629 += (double) arg0 * this.field653;
		this.field670 = (int) (Math.atan2(this.field668, this.field658) * 325.949D) + 1024 & 0x7FF;
		this.field633 = (int) (Math.atan2(this.field629, this.field652) * 325.949D) & 0x7FF;
		if (this.field663 == null) {
			return;
		}
		this.field630 += arg0;
		while (this.field663.field1223[this.field639] < this.field630) {
			this.field630 -= this.field663.field1223[this.field639];
			this.field639++;
			if (this.field663.field1242.length <= this.field639) {
				this.field639 = 0;
			}
		}
	}

	@ObfuscatedName("d.a(IIIII)V")
	public void method300(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field625) {
			double var5 = (double) (arg3 - this.field615);
			double var7 = (double) (arg1 - this.field641);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.field637 = (double) this.field646 * var5 / var9 + (double) this.field615;
			this.field650 = (double) this.field646 * var7 / var9 + (double) this.field641;
			this.field649 = this.field614;
		}
		double var11 = (double) (this.field628 + 1 - arg0);
		this.field658 = ((double) arg1 - this.field650) / var11;
		this.field668 = ((double) arg3 - this.field637) / var11;
		this.field652 = Math.sqrt(this.field668 * this.field668 + this.field658 * this.field658);
		if (!this.field625) {
			this.field629 = -this.field652 * Math.tan((double) this.field654 * 0.02454369D);
		}
		this.field653 = ((double) arg2 - this.field649 - this.field629 * var11) * 2.0D / (var11 * var11);
	}
}
