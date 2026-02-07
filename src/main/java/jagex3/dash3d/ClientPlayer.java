package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;
import jagex3.io.Packet;
import jagex3.jstring.JString;
import jagex3.util.JagString;

@ObfuscatedName("ka")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("ka.ad")
	public int field1648;

	@ObfuscatedName("ka.bd")
	public int field1649 = -1;

	@ObfuscatedName("ka.ed")
	public int field1652 = 0;

	@ObfuscatedName("ka.fd")
	public int field1653 = 0;

	@ObfuscatedName("ka.gd")
	public ModelLit field1654;

	@ObfuscatedName("ka.ld")
	public JagString field1659;

	@ObfuscatedName("ka.md")
	public int field1660 = -1;

	@ObfuscatedName("ka.Lc")
	public static int field1633 = -1;

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

	@ObfuscatedName("ka.Jc")
	public PlayerModel field1631;

	@ObfuscatedName("ka.a(BLjd;)V")
	public void method576(Packet arg0) {
		arg0.pos = 0;
		int[] var2 = new int[12];
		int var3 = -1;
		int var4 = arg0.g1();
		this.field1649 = arg0.g1b();
		this.field1660 = arg0.g1b();
		this.field1637 = 0;
		for (int var5 = 0; var5 < 12; var5++) {
			int var6 = arg0.g1();
			if (var6 == 0) {
				var2[var5] = 0;
			} else {
				int var7 = arg0.g1();
				var2[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var2[0] == 65535) {
					var3 = arg0.g2();
					break;
				}
				if (var2[var5] >= 512) {
					int var8 = ObjType.method1092(var2[var5] - 512).field1425;
					if (var8 != 0) {
						this.field1637 = var8;
					}
				}
			}
		}
		int[] var9 = new int[5];
		for (int var10 = 0; var10 < 5; var10++) {
			int var11 = arg0.g1();
			if (var11 < 0 || PlayerModel.field3218[var10].length <= var11) {
				var11 = 0;
			}
			var9[var10] = var11;
		}
		super.field2687 = arg0.g2();
		if (super.field2687 == 65535) {
			super.field2687 = -1;
		}
		super.field2744 = arg0.g2();
		if (super.field2744 == 65535) {
			super.field2744 = -1;
		}
		super.field2716 = super.field2744;
		super.field2709 = arg0.g2();
		if (super.field2709 == 65535) {
			super.field2709 = -1;
		}
		super.field2734 = arg0.g2();
		if (super.field2734 == 65535) {
			super.field2734 = -1;
		}
		super.field2723 = arg0.g2();
		if (super.field2723 == 65535) {
			super.field2723 = -1;
		}
		super.field2729 = arg0.g2();
		if (super.field2729 == 65535) {
			super.field2729 = -1;
		}
		super.field2705 = arg0.g2();
		if (super.field2705 == 65535) {
			super.field2705 = -1;
		}
		this.field1659 = JString.method59(arg0.method527()).method264();
		this.field1635 = arg0.g1();
		this.field1652 = arg0.g2();
		if (this.field1631 == null) {
			this.field1631 = new PlayerModel();
		}
		this.field1631.setAppearance(var9, var3, var2, var4 == 1);
	}

	@ObfuscatedName("ka.b(B)Lod;")
	@Override
	public ModelLit method132() {
		if (this.field1631 == null) {
			return null;
		}
		SeqType var1 = super.field2712 != -1 && super.field2715 == 0 ? SeqType.method760(super.field2712) : null;
		SeqType var2 = super.field2708 == -1 || this.field1641 || super.field2708 == super.field2687 && var1 != null ? null : SeqType.method760(super.field2708);
		ModelLit var3 = this.field1631.method233(var1, super.field2728, var2, super.field2725);
		if (var3 == null) {
			return null;
		}
		var3.method804();
		super.field2688 = var3.field470;
		if (!this.field1641 && super.field2731 != -1 && super.field2754 != -1) {
			ModelLit var4 = SpotType.method316(super.field2731).method1017(super.field2754);
			if (var4 != null) {
				ModelLit[] var5 = new ModelLit[] { var3, var4 };
				var4.method817(0, -super.field2727, 0);
				var3 = new ModelLit(var5, 2);
			}
		}
		if (!this.field1641 && this.field1654 != null) {
			if (this.field1653 <= Client.loopCycle) {
				this.field1654 = null;
			}
			if (this.field1639 <= Client.loopCycle && this.field1653 > Client.loopCycle) {
				ModelLit var6 = this.field1654;
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
				ModelLit[] var7 = new ModelLit[] { var3, var6 };
				var3 = new ModelLit(var7, 2);
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
