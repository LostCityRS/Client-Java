package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.IdkType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;
import jagex2.jstring.JString;

public class ClientPlayer extends ClientEntity {

	@ObfuscatedName("ZGNGQRPJ.vb")
	public int field1670 = -1;

	@ObfuscatedName("ZGNGQRPJ.wb")
	public long field1671 = -1L;

	@ObfuscatedName("ZGNGQRPJ.zb")
	public int[] field1674 = new int[12];

	@ObfuscatedName("ZGNGQRPJ.Db")
	public int field1678 = -1;

	@ObfuscatedName("ZGNGQRPJ.Fb")
	public boolean field1680 = false;

	@ObfuscatedName("ZGNGQRPJ.Hb")
	public int[] field1682 = new int[5];

	@ObfuscatedName("ZGNGQRPJ.Kb")
	public boolean field1685 = false;

	@ObfuscatedName("ZGNGQRPJ.Ib")
	public static LruCache field1683 = new LruCache(260);

	@ObfuscatedName("ZGNGQRPJ.qb")
	public int field1665;

	@ObfuscatedName("ZGNGQRPJ.rb")
	public int field1666;

	@ObfuscatedName("ZGNGQRPJ.sb")
	public int field1667;

	@ObfuscatedName("ZGNGQRPJ.xb")
	public int field1672;

	@ObfuscatedName("ZGNGQRPJ.Ab")
	public int field1675;

	@ObfuscatedName("ZGNGQRPJ.Cb")
	public int field1677;

	@ObfuscatedName("ZGNGQRPJ.Gb")
	public int field1681;

	@ObfuscatedName("ZGNGQRPJ.Lb")
	public int field1686;

	@ObfuscatedName("ZGNGQRPJ.Mb")
	public int field1687;

	@ObfuscatedName("ZGNGQRPJ.Nb")
	public int field1688;

	@ObfuscatedName("ZGNGQRPJ.Pb")
	public int field1690;

	@ObfuscatedName("ZGNGQRPJ.Qb")
	public int field1691;

	@ObfuscatedName("ZGNGQRPJ.Rb")
	public int field1692;

	@ObfuscatedName("ZGNGQRPJ.Sb")
	public int field1693;

	@ObfuscatedName("ZGNGQRPJ.Bb")
	public long field1676;

	@ObfuscatedName("ZGNGQRPJ.tb")
	public Model field1668;

	@ObfuscatedName("ZGNGQRPJ.Eb")
	public NpcType field1679;

	@ObfuscatedName("ZGNGQRPJ.yb")
	public String name;

	@ObfuscatedName("ZGNGQRPJ.a(Z)LLZYQDKJV;")
	public Model getHeadModel() {
		if (!this.field1680) {
			return null;
		} else if (this.field1679 == null) {
			boolean var2 = false;
			for (int var3 = 0; var3 < 12; var3++) {
				int var12 = this.field1674[var3];
				if (var12 >= 256 && var12 < 512 && !IdkType.field1699[var12 - 256].method579()) {
					var2 = true;
				}
				if (var12 >= 512 && !ObjType.get(var12 - 512).method220(this.field1677)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			}
			Model[] var4 = new Model[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var9 = this.field1674[var6];
				if (var9 >= 256 && var9 < 512) {
					Model var10 = IdkType.field1699[var9 - 256].method580();
					if (var10 != null) {
						var4[var5++] = var10;
					}
				}
				if (var9 >= 512) {
					Model var11 = ObjType.get(var9 - 512).method228(this.field1677);
					if (var11 != null) {
						var4[var5++] = var11;
					}
				}
			}
			Model var7 = new Model(var5, var4, (byte) -89);
			for (int var8 = 0; var8 < 5; var8++) {
				if (this.field1682[var8] != 0) {
					var7.method373(Client.DESIGN_BODY_COLOUR[var8][0], Client.DESIGN_BODY_COLOUR[var8][this.field1682[var8]]);
					if (var8 == 1) {
						var7.method373(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.field1682[var8]]);
					}
				}
			}
			return var7;
		} else {
			return this.field1679.getHeadModel();
		}
	}

	@ObfuscatedName("ZGNGQRPJ.b(B)LLZYQDKJV;")
	public Model method573() {
		if (this.field1679 != null) {
			int var2 = -1;
			if (super.field1171 >= 0 && super.field1174 == 0) {
				var2 = SeqType.field775[super.field1171].field777[super.field1172];
			} else if (super.field1135 >= 0) {
				var2 = SeqType.field775[super.field1135].field777[super.field1136];
			}
			return this.field1679.method475(var2, -1, null);
		}
		long var4 = this.field1676;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		int var9 = -1;
		if (super.field1171 >= 0 && super.field1174 == 0) {
			SeqType var10 = SeqType.field775[super.field1171];
			var6 = var10.field777[super.field1172];
			if (super.field1135 >= 0 && super.field1181 != super.field1135) {
				var7 = SeqType.field775[super.field1135].field777[super.field1136];
			}
			if (var10.field784 >= 0) {
				var8 = var10.field784;
				var4 += var8 - this.field1674[5] << 40;
			}
			if (var10.field785 >= 0) {
				var9 = var10.field785;
				var4 += var9 - this.field1674[3] << 48;
			}
		} else if (super.field1135 >= 0) {
			var6 = SeqType.field775[super.field1135].field777[super.field1136];
		}
		Model var11 = (Model) field1683.get(var4);
		if (var11 == null) {
			boolean var12 = false;
			for (int var13 = 0; var13 < 12; var13++) {
				int var14 = this.field1674[var13];
				if (var9 >= 0 && var13 == 3) {
					var14 = var9;
				}
				if (var8 >= 0 && var13 == 5) {
					var14 = var8;
				}
				if (var14 >= 256 && var14 < 512 && !IdkType.field1699[var14 - 256].method577()) {
					var12 = true;
				}
				if (var14 >= 512 && !ObjType.get(var14 - 512).method225(this.field1677)) {
					var12 = true;
				}
			}
			if (var12) {
				if (this.field1671 != -1L) {
					var11 = (Model) field1683.get(this.field1671);
				}
				if (var11 == null) {
					return null;
				}
			}
		}
		if (var11 == null) {
			Model[] var15 = new Model[12];
			int var16 = 0;
			for (int var17 = 0; var17 < 12; var17++) {
				int var19 = this.field1674[var17];
				if (var9 >= 0 && var17 == 3) {
					var19 = var9;
				}
				if (var8 >= 0 && var17 == 5) {
					var19 = var8;
				}
				if (var19 >= 256 && var19 < 512) {
					Model var20 = IdkType.field1699[var19 - 256].method578();
					if (var20 != null) {
						var15[var16++] = var20;
					}
				}
				if (var19 >= 512) {
					Model var21 = ObjType.get(var19 - 512).method222(this.field1677);
					if (var21 != null) {
						var15[var16++] = var21;
					}
				}
			}
			var11 = new Model(var16, var15, (byte) -89);
			for (int var18 = 0; var18 < 5; var18++) {
				if (this.field1682[var18] != 0) {
					var11.method373(Client.DESIGN_BODY_COLOUR[var18][0], Client.DESIGN_BODY_COLOUR[var18][this.field1682[var18]]);
					if (var18 == 1) {
						var11.method373(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.field1682[var18]]);
					}
				}
			}
			var11.createLabelReferences();
			var11.calculateNormals(64, 850, -30, -50, -30, true);
			field1683.put(var11, var4);
			this.field1671 = var4;
		}
		if (this.field1685) {
			return var11;
		}
		Model var22 = Model.field1190;
		var22.method361(AnimFrame.isNull(var6) & AnimFrame.isNull(var7), var11);
		if (var6 != -1 && var7 != -1) {
			var22.method368(var7, var6, SeqType.field775[super.field1171].field781);
		} else if (var6 != -1) {
			var22.applyTransform(var6);
		}
		var22.method363();
		var22.field1226 = null;
		var22.field1225 = null;
		return var22;
	}

	@ObfuscatedName("ZGNGQRPJ.b(I)Z")
	public boolean method351() {
		return this.field1680;
	}

	@ObfuscatedName("ZGNGQRPJ.a(B)LLZYQDKJV;")
	public Model method239() {
		if (!this.field1680) {
			return null;
		}
		Model var2 = this.method573();
		if (var2 == null) {
			return null;
		}
		super.field1141 = var2.field1709;
		var2.field1227 = true;
		if (this.field1685) {
			return var2;
		}
		if (super.field1161 != -1 && super.field1162 != -1) {
			SpotAnimType var3 = SpotAnimType.field1297[super.field1161];
			Model var4 = var3.method439();
			if (var4 != null) {
				Model var5 = new Model(false, false, true, var4, AnimFrame.isNull(super.field1162));
				var5.method372(0, 0, -super.field1165);
				var5.createLabelReferences();
				var5.applyTransform(var3.field1301.field777[super.field1162]);
				var5.field1226 = null;
				var5.field1225 = null;
				if (var3.field1304 != 128 || var3.field1305 != 128) {
					var5.method375(var3.field1305, var3.field1304, var3.field1304);
				}
				var5.calculateNormals(var3.field1307 + 64, var3.field1308 + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(2, true, 0, var6);
			}
		}
		if (this.field1668 != null) {
			if (Client.loopCycle >= this.field1687) {
				this.field1668 = null;
			}
			if (Client.loopCycle >= this.field1686 && Client.loopCycle < this.field1687) {
				Model var7 = this.field1668;
				var7.method372(this.field1665 - super.field1157, this.field1667 - super.field1158, this.field1666 - this.field1672);
				if (super.field1131 == 512) {
					var7.method370(true);
					var7.method370(true);
					var7.method370(true);
				} else if (super.field1131 == 1024) {
					var7.method370(true);
					var7.method370(true);
				} else if (super.field1131 == 1536) {
					var7.method370(true);
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model(2, true, 0, var8);
				if (super.field1131 == 512) {
					var7.method370(true);
				} else if (super.field1131 == 1024) {
					var7.method370(true);
					var7.method370(true);
				} else if (super.field1131 == 1536) {
					var7.method370(true);
					var7.method370(true);
					var7.method370(true);
				}
				var7.method372(super.field1157 - this.field1665, super.field1158 - this.field1667, this.field1672 - this.field1666);
			}
		}
		var2.field1227 = true;
		return var2;
	}

	@ObfuscatedName("ZGNGQRPJ.a(LMFMVIYHT;I)V")
	public void method574(Packet arg0) {
		arg0.pos = 0;
		this.field1677 = arg0.g1();
		this.field1678 = arg0.g1b();
		this.field1670 = arg0.g1b();
		this.field1679 = null;
		this.field1688 = 0;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				this.field1674[var3] = 0;
			} else {
				int var5 = arg0.g1();
				this.field1674[var3] = (var4 << 8) + var5;
				if (var3 == 0 && this.field1674[0] == 65535) {
					this.field1679 = NpcType.get(arg0.g2());
					break;
				}
				if (this.field1674[var3] >= 512 && this.field1674[var3] - 512 < ObjType.field817) {
					int var12 = ObjType.get(this.field1674[var3] - 512).field814;
					if (var12 != 0) {
						this.field1688 = var12;
					}
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var11 = arg0.g1();
			if (var11 < 0 || var11 >= Client.DESIGN_BODY_COLOUR[var6].length) {
				var11 = 0;
			}
			this.field1682[var6] = var11;
		}
		super.field1181 = arg0.g2();
		if (super.field1181 == 65535) {
			super.field1181 = -1;
		}
		super.field1182 = arg0.g2();
		if (super.field1182 == 65535) {
			super.field1182 = -1;
		}
		super.field1166 = arg0.g2();
		if (super.field1166 == 65535) {
			super.field1166 = -1;
		}
		super.field1167 = arg0.g2();
		if (super.field1167 == 65535) {
			super.field1167 = -1;
		}
		super.field1168 = arg0.g2();
		if (super.field1168 == 65535) {
			super.field1168 = -1;
		}
		super.field1169 = arg0.g2();
		if (super.field1169 == 65535) {
			super.field1169 = -1;
		}
		super.field1176 = arg0.g2();
		if (super.field1176 == 65535) {
			super.field1176 = -1;
		}
		this.name = JString.formatDisplayName(JString.fromBase37(arg0.g8()));
		this.field1675 = arg0.g1();
		this.field1681 = arg0.g2();
		this.field1680 = true;
		this.field1676 = 0L;
		int var7 = this.field1674[5];
		int var8 = this.field1674[9];
		this.field1674[5] = var8;
		this.field1674[9] = var7;
		for (int var9 = 0; var9 < 12; var9++) {
			this.field1676 <<= 0x4;
			if (this.field1674[var9] >= 256) {
				this.field1676 += this.field1674[var9] - 256;
			}
		}
		if (this.field1674[0] >= 256) {
			this.field1676 += this.field1674[0] - 256 >> 4;
		}
		if (this.field1674[1] >= 256) {
			this.field1676 += this.field1674[1] - 256 >> 8;
		}
		this.field1674[5] = var7;
		this.field1674[9] = var8;
		for (int var10 = 0; var10 < 5; var10++) {
			this.field1676 <<= 0x3;
			this.field1676 += this.field1682[var10];
		}
		this.field1676 <<= 0x1;
		this.field1676 += this.field1677;
	}
}
