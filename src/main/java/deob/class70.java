package deob;

@ObfuscatedName("ka")
public final class class70 extends class115 {

	@ObfuscatedName("ka.ad")
	public int field1648;

	@ObfuscatedName("ka.bd")
	public int field1649 = -1;

	@ObfuscatedName("ka.dd")
	public static class49[] field1651;

	@ObfuscatedName("ka.ed")
	public int field1652 = 0;

	@ObfuscatedName("ka.fd")
	public int field1653 = 0;

	@ObfuscatedName("ka.gd")
	public class101 field1654;

	@ObfuscatedName("ka.id")
	public static class32 field1656 = field1661;

	@ObfuscatedName("ka.kd")
	public static int field1658 = 0;

	@ObfuscatedName("ka.ld")
	public class32 field1659;

	@ObfuscatedName("ka.md")
	public int field1660 = -1;

	@ObfuscatedName("ka.nd")
	public static class32 field1661 = class73.method593("Close", true);

	@ObfuscatedName("ka.Ic")
	public static int[][][] field1630 = new int[4][105][105];

	@ObfuscatedName("ka.Yc")
	public static int field1646 = 0;

	@ObfuscatedName("ka.Mc")
	public static class32 field1634 = class73.method593("Connecting to update server", true);

	@ObfuscatedName("ka.Ec")
	public static class32 field1626 = field1634;

	@ObfuscatedName("ka.Lc")
	public static int field1633 = -1;

	@ObfuscatedName("ka.Hc")
	public static int field1629 = 127;

	@ObfuscatedName("ka.Rc")
	public int field1639 = 0;

	@ObfuscatedName("ka.Pc")
	public int field1637 = 0;

	@ObfuscatedName("ka.Nc")
	public int field1635 = 0;

	@ObfuscatedName("ka.Tc")
	public boolean field1641 = false;

	@ObfuscatedName("ka.Fc")
	public int field1627;

	@ObfuscatedName("ka.Kc")
	public int field1632;

	@ObfuscatedName("ka.Oc")
	public int field1636;

	@ObfuscatedName("ka.Uc")
	public int field1642;

	@ObfuscatedName("ka.Vc")
	public int field1643;

	@ObfuscatedName("ka.Wc")
	public int field1644;

	@ObfuscatedName("ka.Xc")
	public int field1645;

	@ObfuscatedName("ka.Zc")
	public static int field1647;

	@ObfuscatedName("ka.Jc")
	public class31 field1631;

	@ObfuscatedName("ka.Qc")
	public static int[] field1638;

	@ObfuscatedName("ka.a(BI)I")
	public static int method577(int arg0) {
		class4 var1 = class80.method636(arg0);
		int var2 = var1.field75;
		int var3 = var1.field66;
		int var4 = var1.field78;
		int var5 = class117.field2779[var4 - var3];
		return class27.field504[var2] >> var3 & var5;
	}

	@ObfuscatedName("ka.c(B)V")
	public static void method579() {
		field1638 = null;
		class74.field1746 = null;
		class147.field3344 = null;
		class126.field2925 = null;
		class34.field719 = null;
		class31.field616 = null;
	}

	@ObfuscatedName("ka.d(B)V")
	public static void method580() {
		field1656 = null;
		field1651 = null;
		field1626 = null;
		field1638 = null;
		field1630 = null;
		field1661 = null;
		field1634 = null;
	}

	@ObfuscatedName("ka.a(BLjd;)V")
	public void method576(class66 arg0) {
		arg0.field1568 = 0;
		int[] var2 = new int[12];
		int var3 = -1;
		int var4 = arg0.method532();
		this.field1649 = arg0.method544();
		this.field1660 = arg0.method544();
		this.field1637 = 0;
		for (int var5 = 0; var5 < 12; var5++) {
			int var6 = arg0.method532();
			if (var6 == 0) {
				var2[var5] = 0;
			} else {
				int var7 = arg0.method532();
				var2[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var2[0] == 65535) {
					var3 = arg0.method531();
					break;
				}
				if (var2[var5] >= 512) {
					int var8 = class146.method1092(var2[var5] - 512).field1425;
					if (var8 != 0) {
						this.field1637 = var8;
					}
				}
			}
		}
		int[] var9 = new int[5];
		for (int var10 = 0; var10 < 5; var10++) {
			int var11 = arg0.method532();
			if (var11 < 0 || class140.field3218[var10].length <= var11) {
				var11 = 0;
			}
			var9[var10] = var11;
		}
		super.field2687 = arg0.method531();
		if (super.field2687 == 65535) {
			super.field2687 = -1;
		}
		super.field2744 = arg0.method531();
		if (super.field2744 == 65535) {
			super.field2744 = -1;
		}
		super.field2716 = super.field2744;
		super.field2709 = arg0.method531();
		if (super.field2709 == 65535) {
			super.field2709 = -1;
		}
		super.field2734 = arg0.method531();
		if (super.field2734 == 65535) {
			super.field2734 = -1;
		}
		super.field2723 = arg0.method531();
		if (super.field2723 == 65535) {
			super.field2723 = -1;
		}
		super.field2729 = arg0.method531();
		if (super.field2729 == 65535) {
			super.field2729 = -1;
		}
		super.field2705 = arg0.method531();
		if (super.field2705 == 65535) {
			super.field2705 = -1;
		}
		this.field1659 = class9.method59(arg0.method527()).method264();
		this.field1635 = arg0.method532();
		this.field1652 = arg0.method531();
		if (this.field1631 == null) {
			this.field1631 = new class31();
		}
		this.field1631.method232(var9, var3, var2, var4 == 1);
	}

	@ObfuscatedName("ka.b(B)Lod;")
	@Override
	public class101 method132() {
		if (this.field1631 == null) {
			return null;
		}
		class149 var1 = super.field2712 != -1 && super.field2715 == 0 ? class97.method760(super.field2712) : null;
		class149 var2 = super.field2708 == -1 || this.field1641 || super.field2708 == super.field2687 && var1 != null ? null : class97.method760(super.field2708);
		class101 var3 = this.field1631.method233(var1, super.field2728, var2, super.field2725);
		if (var3 == null) {
			return null;
		}
		var3.method804();
		super.field2688 = var3.field470;
		if (!this.field1641 && super.field2731 != -1 && super.field2754 != -1) {
			class101 var4 = class38.method316(super.field2731).method1017(super.field2754);
			if (var4 != null) {
				class101[] var5 = new class101[] { var3, var4 };
				var4.method817(0, -super.field2727, 0);
				var3 = new class101(var5, 2);
			}
		}
		if (!this.field1641 && this.field1654 != null) {
			if (this.field1653 <= class140.field3217) {
				this.field1654 = null;
			}
			if (this.field1639 <= class140.field3217 && this.field1653 > class140.field3217) {
				class101 var6 = this.field1654;
				var6.method817(this.field1627 - super.field2747, this.field1644 + -this.field1643, this.field1648 - super.field2698);
				if (super.field2742 == 512) {
					var6.method801();
					var6.method801();
					var6.method801();
				} else if (super.field2742 == 1024) {
					var6.method801();
					var6.method801();
				} else if (super.field2742 == 1536) {
					var6.method801();
				}
				class101[] var7 = new class101[] { var3, var6 };
				var3 = new class101(var7, 2);
				if (super.field2742 == 512) {
					var6.method801();
				} else if (super.field2742 == 1024) {
					var6.method801();
					var6.method801();
				} else if (super.field2742 == 1536) {
					var6.method801();
					var6.method801();
					var6.method801();
				}
				var6.method817(super.field2747 - this.field1627, this.field1643 - this.field1644, super.field2698 - this.field1648);
			}
		}
		var3.field2322 = true;
		return var3;
	}

	@ObfuscatedName("ka.j(I)Z")
	@Override
	public boolean method578() {
		return this.field1631 != null;
	}
}
