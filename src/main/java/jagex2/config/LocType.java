package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

public class LocType {

	@ObfuscatedName("YMYTDPVW.p")
	public int field1627 = -1;

	@ObfuscatedName("YMYTDPVW.s")
	public String field1630 = "null";

	@ObfuscatedName("YMYTDPVW.e")
	public static LruCache field1616 = new LruCache(40);

	@ObfuscatedName("YMYTDPVW.n")
	public static Model[] field1625 = new Model[4];

	@ObfuscatedName("YMYTDPVW.v")
	public static LruCache field1633 = new LruCache(500);

	@ObfuscatedName("YMYTDPVW.A")
	public byte field1638;

	@ObfuscatedName("YMYTDPVW.D")
	public byte field1641;

	@ObfuscatedName("YMYTDPVW.c")
	public int field1614;

	@ObfuscatedName("YMYTDPVW.d")
	public int field1615;

	@ObfuscatedName("YMYTDPVW.g")
	public int field1618;

	@ObfuscatedName("YMYTDPVW.i")
	public int field1620;

	@ObfuscatedName("YMYTDPVW.r")
	public int field1629;

	@ObfuscatedName("YMYTDPVW.t")
	public static int field1631;

	@ObfuscatedName("YMYTDPVW.u")
	public int field1632;

	@ObfuscatedName("YMYTDPVW.w")
	public int field1634;

	@ObfuscatedName("YMYTDPVW.x")
	public int field1635;

	@ObfuscatedName("YMYTDPVW.B")
	public int field1639;

	@ObfuscatedName("YMYTDPVW.K")
	public int field1648;

	@ObfuscatedName("YMYTDPVW.L")
	public int field1649;

	@ObfuscatedName("YMYTDPVW.M")
	public int field1650;

	@ObfuscatedName("YMYTDPVW.R")
	public int field1655;

	@ObfuscatedName("YMYTDPVW.S")
	public int field1656;

	@ObfuscatedName("YMYTDPVW.T")
	public int field1657;

	@ObfuscatedName("YMYTDPVW.W")
	public int field1660;

	@ObfuscatedName("YMYTDPVW.Y")
	public static int field1662;

	@ObfuscatedName("YMYTDPVW.j")
	public static Packet field1621;

	@ObfuscatedName("YMYTDPVW.m")
	public static Client varProvider;

	@ObfuscatedName("YMYTDPVW.b")
	public boolean field1613;

	@ObfuscatedName("YMYTDPVW.h")
	public boolean field1619;

	@ObfuscatedName("YMYTDPVW.l")
	public boolean field1623;

	@ObfuscatedName("YMYTDPVW.o")
	public static boolean lowMem;

	@ObfuscatedName("YMYTDPVW.H")
	public boolean field1645;

	@ObfuscatedName("YMYTDPVW.N")
	public boolean field1651;

	@ObfuscatedName("YMYTDPVW.O")
	public boolean field1652;

	@ObfuscatedName("YMYTDPVW.U")
	public boolean field1658;

	@ObfuscatedName("YMYTDPVW.X")
	public boolean field1661;

	@ObfuscatedName("YMYTDPVW.Z")
	public boolean field1663;

	@ObfuscatedName("YMYTDPVW.ab")
	public boolean field1664;

	@ObfuscatedName("YMYTDPVW.z")
	public byte[] field1637;

	@ObfuscatedName("YMYTDPVW.a")
	public static int[] field1612;

	@ObfuscatedName("YMYTDPVW.f")
	public int[] field1617;

	@ObfuscatedName("YMYTDPVW.F")
	public int[] field1643;

	@ObfuscatedName("YMYTDPVW.I")
	public int[] field1646;

	@ObfuscatedName("YMYTDPVW.P")
	public int[] field1653;

	@ObfuscatedName("YMYTDPVW.V")
	public int[] field1659;

	@ObfuscatedName("YMYTDPVW.y")
	public static LocType[] field1636;

	@ObfuscatedName("YMYTDPVW.G")
	public String[] field1644;

	@ObfuscatedName("YMYTDPVW.a(I)LYMYTDPVW;")
	public static final LocType method561(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1636[var1].field1627 == arg0) {
				return field1636[var1];
			}
		}
		field1631 = (field1631 + 1) % 20;
		LocType var2 = field1636[field1631];
		field1621.pos = field1612[arg0];
		var2.field1627 = arg0;
		var2.method567();
		var2.method568(field1621);
		return var2;
	}

	@ObfuscatedName("YMYTDPVW.b(I)LYMYTDPVW;")
	public LocType method562() {
		int var2 = -1;
		if (this.field1632 != -1) {
			VarbitType var3 = VarbitType.field1760[this.field1632];
			int var4 = var3.field1762;
			int var5 = var3.field1763;
			int var6 = var3.field1764;
			int var7 = Client.VARBIT_MASKS[var6 - var5];
			var2 = varProvider.varps[var4] >> var5 & var7;
		} else if (this.field1635 != -1) {
			var2 = varProvider.varps[this.field1635];
		}
		return var2 < 0 || var2 >= this.field1659.length || this.field1659[var2] == -1 ? null : method561(this.field1659[var2]);
	}

	@ObfuscatedName("YMYTDPVW.a(LZPGPWCCV;I)V")
	public void method563(OnDemand arg0) {
		if (this.field1617 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field1617.length; var3++) {
			arg0.prefetch(this.field1617[var3] & 0xFFFF, 0);
		}
	}

	@ObfuscatedName("YMYTDPVW.a(LATJMVOZR;)V")
	public static void unpack(Jagfile arg0) {
		field1621 = new Packet(arg0.read("loc.dat", null));
		Packet var1 = new Packet(arg0.read("loc.idx", null));
		field1662 = var1.g2();
		field1612 = new int[field1662];
		int var2 = 2;
		for (int var3 = 0; var3 < field1662; var3++) {
			field1612[var3] = var2;
			var2 += var1.g2();
		}
		field1636 = new LocType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1636[var4] = new LocType();
		}
	}

	@ObfuscatedName("YMYTDPVW.a(IIII)LLZYQDKJV;")
	public Model method565(int arg0, int arg1, int arg3) {
		Model var5 = null;
		long var6;
		if (this.field1643 == null) {
			if (arg3 != 10) {
				return null;
			}
			var6 = ((long) (arg1 + 1) << 32) + (long) ((this.field1627 << 6) + arg0);
			Model var8 = (Model) field1616.get(var6);
			if (var8 != null) {
				return var8;
			}
			if (this.field1617 == null) {
				return null;
			}
			boolean var9 = this.field1652 ^ arg0 > 3;
			int var10 = this.field1617.length;
			for (int var11 = 0; var11 < var10; var11++) {
				int var12 = this.field1617[var11];
				if (var9) {
					var12 += 65536;
				}
				var5 = (Model) field1633.get((long) var12);
				if (var5 == null) {
					var5 = Model.tryGet(var12 & 0xFFFF);
					if (var5 == null) {
						return null;
					}
					if (var9) {
						var5.method374();
					}
					field1633.put(var5, (long) var12);
				}
				if (var10 > 1) {
					field1625[var11] = var5;
				}
			}
			if (var10 > 1) {
				var5 = new Model(var10, field1625, (byte) -89);
			}
		} else {
			int var13 = -1;
			for (int var14 = 0; var14 < this.field1643.length; var14++) {
				if (this.field1643[var14] == arg3) {
					var13 = var14;
					break;
				}
			}
			if (var13 == -1) {
				return null;
			}
			var6 = ((long) (arg1 + 1) << 32) + (long) ((this.field1627 << 6) + (var13 << 3) + arg0);
			Model var15 = (Model) field1616.get(var6);
			if (var15 != null) {
				return var15;
			}
			int var16 = this.field1617[var13];
			boolean var17 = this.field1652 ^ arg0 > 3;
			if (var17) {
				var16 += 65536;
			}
			var5 = (Model) field1633.get((long) var16);
			if (var5 == null) {
				var5 = Model.tryGet(var16 & 0xFFFF);
				if (var5 == null) {
					return null;
				}
				if (var17) {
					var5.method374();
				}
				field1633.put(var5, (long) var16);
			}
		}
		boolean var18;
		if (this.field1634 == 128 && this.field1614 == 128 && this.field1650 == 128) {
			var18 = false;
		} else {
			var18 = true;
		}
		boolean var19;
		if (this.field1615 == 0 && this.field1639 == 0 && this.field1620 == 0) {
			var19 = false;
		} else {
			var19 = true;
		}
		Model var20 = new Model(arg0 == 0 && arg1 == -1 && !var18 && !var19, false, this.field1653 == null, var5, AnimFrame.isNull(arg1));
		if (arg1 != -1) {
			var20.createLabelReferences();
			var20.applyTransform(arg1);
			var20.field1226 = null;
			var20.field1225 = null;
		}
		while (arg0-- > 0) {
			var20.method370(true);
		}
		if (this.field1653 != null) {
			for (int var21 = 0; var21 < this.field1653.length; var21++) {
				var20.method373(this.field1653[var21], this.field1646[var21]);
			}
		}
		if (var18) {
			var20.method375(this.field1614, this.field1650, this.field1634);
		}
		if (var19) {
			var20.method372(this.field1615, this.field1620, this.field1639);
		}
		var20.calculateNormals(this.field1638 + 64, this.field1641 * 5 + 768, -50, -10, -50, !this.field1658);
		if (this.field1648 == 1) {
			var20.field1222 = var20.field1709;
		}
		field1616.put(var20, var6);
		return var20;
	}

	@ObfuscatedName("YMYTDPVW.c(I)Z")
	public boolean method566() {
		if (this.field1617 == null) {
			return true;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < this.field1617.length; var3++) {
			var2 &= Model.method360(this.field1617[var3] & 0xFFFF);
		}
		return var2;
	}

	@ObfuscatedName("YMYTDPVW.a()V")
	public void method567() {
		this.field1617 = null;
		this.field1643 = null;
		this.field1630 = "null";
		this.field1637 = null;
		this.field1653 = null;
		this.field1646 = null;
		this.field1655 = 1;
		this.field1629 = 1;
		this.field1664 = true;
		this.field1663 = true;
		this.field1613 = false;
		this.field1623 = false;
		this.field1658 = false;
		this.field1651 = false;
		this.field1657 = -1;
		this.field1656 = 16;
		this.field1638 = 0;
		this.field1641 = 0;
		this.field1644 = null;
		this.field1660 = -1;
		this.field1649 = -1;
		this.field1652 = false;
		this.field1661 = true;
		this.field1634 = 128;
		this.field1614 = 128;
		this.field1650 = 128;
		this.field1618 = 0;
		this.field1615 = 0;
		this.field1639 = 0;
		this.field1620 = 0;
		this.field1619 = false;
		this.field1645 = false;
		this.field1648 = -1;
		this.field1632 = -1;
		this.field1635 = -1;
		this.field1659 = null;
	}

	@ObfuscatedName("YMYTDPVW.a(BLMFMVIYHT;)V")
	public void method568(Packet arg1) {
		int var3 = -1;
		while (true) {
			int var4 = arg1.g1();
			if (var4 == 0) {
				if (var3 == -1) {
					this.field1613 = false;
					if (this.field1617 != null && (this.field1643 == null || this.field1643[0] == 10)) {
						this.field1613 = true;
					}
					if (this.field1644 != null) {
						this.field1613 = true;
					}
				}
				if (this.field1645) {
					this.field1664 = false;
					this.field1663 = false;
				}
				if (this.field1648 == -1) {
					this.field1648 = this.field1664 ? 1 : 0;
					return;
				}
				return;
			}
			if (var4 == 1) {
				int var5 = arg1.g1();
				if (this.field1617 == null || lowMem) {
					this.field1643 = new int[var5];
					this.field1617 = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.field1617[var6] = arg1.g2();
						this.field1643[var6] = arg1.g1();
					}
				} else {
					arg1.pos += var5 * 3;
				}
			}
			if (var4 == 2) {
				this.field1630 = arg1.gjstr();
			} else if (var4 == 3) {
				this.field1637 = arg1.gjstrraw();
			} else if (var4 == 5) {
				int var7 = arg1.g1();
				if (var7 > 0) {
					if (this.field1617 == null || lowMem) {
						this.field1643 = null;
						this.field1617 = new int[var7];
						for (int var8 = 0; var8 < var7; var8++) {
							this.field1617[var8] = arg1.g2();
						}
					} else {
						arg1.pos += var7 * 2;
					}
				}
			} else if (var4 == 14) {
				this.field1655 = arg1.g1();
			} else if (var4 == 15) {
				this.field1629 = arg1.g1();
			} else if (var4 == 17) {
				this.field1664 = false;
			} else if (var4 == 18) {
				this.field1663 = false;
			} else if (var4 == 19) {
				var3 = arg1.g1();
				if (var3 == 1) {
					this.field1613 = true;
				}
			} else if (var4 == 21) {
				this.field1623 = true;
			} else if (var4 == 22) {
				this.field1658 = true;
			} else if (var4 == 23) {
				this.field1651 = true;
			} else if (var4 == 24) {
				this.field1657 = arg1.g2();
				if (this.field1657 == 65535) {
					this.field1657 = -1;
				}
			} else if (var4 == 28) {
				this.field1656 = arg1.g1();
			} else if (var4 == 29) {
				this.field1638 = arg1.g1b();
			} else if (var4 == 39) {
				this.field1641 = arg1.g1b();
			} else if (var4 >= 30 && var4 < 39) {
				if (this.field1644 == null) {
					this.field1644 = new String[5];
				}
				this.field1644[var4 - 30] = arg1.gjstr();
				if (this.field1644[var4 - 30].equalsIgnoreCase("hidden")) {
					this.field1644[var4 - 30] = null;
				}
			} else if (var4 == 40) {
				int var9 = arg1.g1();
				this.field1653 = new int[var9];
				this.field1646 = new int[var9];
				for (int var10 = 0; var10 < var9; var10++) {
					this.field1653[var10] = arg1.g2();
					this.field1646[var10] = arg1.g2();
				}
			} else if (var4 == 60) {
				this.field1660 = arg1.g2();
			} else if (var4 == 62) {
				this.field1652 = true;
			} else if (var4 == 64) {
				this.field1661 = false;
			} else if (var4 == 65) {
				this.field1634 = arg1.g2();
			} else if (var4 == 66) {
				this.field1614 = arg1.g2();
			} else if (var4 == 67) {
				this.field1650 = arg1.g2();
			} else if (var4 == 68) {
				this.field1649 = arg1.g2();
			} else if (var4 == 69) {
				this.field1618 = arg1.g1();
			} else if (var4 == 70) {
				this.field1615 = arg1.g2b();
			} else if (var4 == 71) {
				this.field1639 = arg1.g2b();
			} else if (var4 == 72) {
				this.field1620 = arg1.g2b();
			} else if (var4 == 73) {
				this.field1619 = true;
			} else if (var4 == 74) {
				this.field1645 = true;
			} else if (var4 == 75) {
				this.field1648 = arg1.g1();
			} else if (var4 == 77) {
				this.field1632 = arg1.g2();
				if (this.field1632 == 65535) {
					this.field1632 = -1;
				}
				this.field1635 = arg1.g2();
				if (this.field1635 == 65535) {
					this.field1635 = -1;
				}
				int var11 = arg1.g1();
				this.field1659 = new int[var11 + 1];
				for (int var12 = 0; var12 <= var11; var12++) {
					this.field1659[var12] = arg1.g2();
					if (this.field1659[var12] == 65535) {
						this.field1659[var12] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("YMYTDPVW.a(IIIIIII)LLZYQDKJV;")
	public Model method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = this.method565(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}
		if (this.field1623 || this.field1658) {
			var8 = new Model(this.field1623, this.field1658, 0, var8);
		}
		if (this.field1623) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1195; var10++) {
				int var11 = var8.field1196[var10];
				int var12 = var8.field1198[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1197[var10] += var15 - var9;
			}
			var8.method364();
		}
		return var8;
	}

	@ObfuscatedName("YMYTDPVW.a(II)Z")
	public boolean method570(int arg1) {
		if (this.field1643 != null) {
			for (int var5 = 0; var5 < this.field1643.length; var5++) {
				if (this.field1643[var5] == arg1) {
					return Model.method360(this.field1617[var5] & 0xFFFF);
				}
			}
			return true;
		} else if (this.field1617 == null) {
			return true;
		} else if (arg1 == 10) {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.field1617.length; var4++) {
				var3 &= Model.method360(this.field1617[var4] & 0xFFFF);
			}
			return var3;
		} else {
			return true;
		}
	}

	@ObfuscatedName("YMYTDPVW.a(Z)V")
	public static void unload() {
		field1633 = null;
		field1616 = null;
		field1612 = null;
		field1636 = null;
		field1621 = null;
	}
}
