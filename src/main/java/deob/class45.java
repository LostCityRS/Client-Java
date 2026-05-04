package deob;

import java.util.Random;

@ObfuscatedName("e")
public final class class45 extends class23 {

	@ObfuscatedName("e.db")
	public int field787;

	@ObfuscatedName("e.eb")
	public int field788 = 81;

	@ObfuscatedName("e.fb")
	public static int field789;

	@ObfuscatedName("e.gb")
	public int field790 = 204;

	@ObfuscatedName("e.hb")
	public int field791;

	@ObfuscatedName("e.jb")
	public int[][] field793;

	@ObfuscatedName("e.lb")
	public int field795;

	@ObfuscatedName("e.mb")
	public static int field796 = 0;

	@ObfuscatedName("e.nb")
	public int field797 = 4;

	@ObfuscatedName("e.ob")
	public int field798 = 1024;

	@ObfuscatedName("e.pb")
	public int field799 = 8;

	@ObfuscatedName("e.Z")
	public static final class248 field783 = new class248();

	@ObfuscatedName("e.V")
	public int field779 = 1024;

	@ObfuscatedName("e.X")
	public int field781 = 409;

	@ObfuscatedName("e.S")
	public int field776 = 0;

	@ObfuscatedName("e.W")
	public int[] field780;

	@ObfuscatedName("e.Q")
	public static byte[][] field774;

	@ObfuscatedName("e.T")
	public int[][] field777;

	@ObfuscatedName("e.f(I)V")
	public static void method290() {
		if (class214.field4033 != null) {
			class214.field4033.method917();
		}
	}

	@ObfuscatedName("e.a(Lnb;BLnb;Lnb;)V")
	public static void method291(class144 arg0, class144 arg1, class144 arg2) {
		class142.field2624 = arg1;
		class37.field672 = arg0;
		class148.field2778 = arg2;
	}

	@ObfuscatedName("e.a(IIII)I")
	public static int method292(int arg0, int arg1, int arg2) {
		int var3 = arg2 / arg1;
		int var4 = arg1 - 1 & arg2;
		int var5 = arg1 - 1 & arg0;
		int var6 = arg0 / arg1;
		int var7 = class9.method48(var6, var3);
		int var8 = class9.method48(var6, var3 + 1);
		int var9 = class9.method48(var6 + 1, var3);
		int var10 = class9.method48(var6 + 1, var3 + 1);
		int var11 = class57.method419(arg1, var7, var4, var8);
		int var12 = class57.method419(arg1, var9, var4, var10);
		return class57.method419(arg1, var11, var5, var12);
	}

	@ObfuscatedName("e.g(I)V")
	public static void method293() {
		while (true) {
			class248 var0 = class227.field4252;
			class90 var1;
			synchronized (class227.field4252) {
				var1 = (class90) class131.field2461.method1613();
			}
			if (var1 == null) {
				return;
			}
			var1.field1702.method111(var1.field1705, (int) var1.field1219, var1.field1713, false);
		}
	}

	public class45() {
		super(0, true);
	}

	@ObfuscatedName("e.e(I)V")
	public void method289() {
		Random var1 = new Random((long) this.field799);
		this.field793 = new int[this.field799][this.field797];
		this.field777 = new int[this.field799][this.field797 + 1];
		this.field795 = 4096 / this.field797;
		this.field787 = this.field788 / 2;
		this.field780 = new int[this.field799 + 1];
		this.field780[0] = 0;
		this.field791 = 4096 / this.field799;
		int var2 = this.field795 / 2;
		int var3 = this.field791 / 2;
		for (int var4 = 0; var4 < this.field799; var4++) {
			if (var4 > 0) {
				int var5 = this.field791;
				int var6 = (class119.method812(4096, var1) - 2048) * this.field790 >> 12;
				int var7 = var5 + (var3 * var6 >> 12);
				this.field780[var4] = var7 + this.field780[var4 - 1];
			}
			this.field777[var4][0] = 0;
			for (int var8 = 0; var8 < this.field797; var8++) {
				if (var8 > 0) {
					int var9 = this.field795;
					int var10 = (class119.method812(4096, var1) - 2048) * this.field781 >> 12;
					int var11 = var9 + (var10 * var2 >> 12);
					this.field777[var4][var8] = var11 + this.field777[var4][var8 - 1];
				}
				this.field793[var4][var8] = this.field798 <= 0 ? 4096 : 4096 - class119.method812(this.field798, var1);
			}
			this.field777[var4][this.field797] = 4096;
		}
		this.field780[this.field799] = 4096;
	}

	@ObfuscatedName("e.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field797 = arg0.method347();
		} else if (arg1 == 1) {
			this.field799 = arg0.method347();
		} else if (arg1 == 2) {
			this.field781 = arg0.method301();
		} else if (arg1 == 3) {
			this.field790 = arg0.method301();
		} else if (arg1 == 4) {
			this.field779 = arg0.method301();
		} else if (arg1 == 5) {
			this.field776 = arg0.method301();
		} else if (arg1 == 6) {
			this.field788 = arg0.method301();
		} else if (arg1 == 7) {
			this.field798 = arg0.method301();
		}
	}

	@ObfuscatedName("e.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = 0;
			int var4;
			for (var4 = this.field776 + class111.field2021[arg0]; var4 < 0; var4 += 4096) {
			}
			while (var4 > 4096) {
				var4 -= 4096;
			}
			while (this.field799 > var3 && var4 >= this.field780[var3]) {
				var3++;
			}
			int var5 = this.field780[var3];
			boolean var6 = (var3 & 0x1) == 0;
			int var7 = var3 - 1;
			int var8 = this.field780[var3 - 1];
			if (var4 > this.field787 + var8 && var5 - this.field787 > var4) {
				for (int var9 = 0; var9 < class70.field1276; var9++) {
					int var10 = var6 ? this.field779 : -this.field779;
					int var11 = 0;
					int var12;
					for (var12 = (var10 * this.field795 >> 12) + class22.field351[var9]; var12 < 0; var12 += 4096) {
					}
					while (var12 > 4096) {
						var12 -= 4096;
					}
					while (this.field797 > var11 && this.field777[var7][var11] <= var12) {
						var11++;
					}
					int var13 = this.field777[var7][var11];
					int var14 = var11 - 1;
					int var15 = this.field777[var7][var14];
					if (var15 + this.field787 < var12 && var12 < var13 - this.field787) {
						var2[var9] = this.field793[var7][var14];
					} else {
						var2[var9] = 0;
					}
				}
			} else {
				class124.method837(var2, 0, class70.field1276, 0);
			}
		}
		return var2;
	}

	@ObfuscatedName("e.b(B)V")
	@Override
	public void method123() {
		this.method289();
	}
}
