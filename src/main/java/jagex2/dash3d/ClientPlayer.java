package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("bb")
public class ClientPlayer extends ClientEntity {

	@ObfuscatedName("bb.rb")
	public byte field466 = 8;

	@ObfuscatedName("bb.sb")
	public boolean field467 = true;

	@ObfuscatedName("bb.tb")
	public String field468;

	@ObfuscatedName("bb.ub")
	public boolean field469 = false;

	@ObfuscatedName("bb.vb")
	public int field470;

	@ObfuscatedName("bb.wb")
	public int field471;

	@ObfuscatedName("bb.xb")
	public int[] field472 = new int[12];

	@ObfuscatedName("bb.yb")
	public int[] field473 = new int[5];

	@ObfuscatedName("bb.zb")
	public int field474;

	@ObfuscatedName("bb.Mb")
	public boolean field487 = false;

	@ObfuscatedName("bb.Nb")
	public long field488 = -1L;

	@ObfuscatedName("bb.Pb")
	public static LruCache field490 = new LruCache((byte) 3, 260);

	@ObfuscatedName("bb.Bb")
	public int field476;

	@ObfuscatedName("bb.Cb")
	public int field477;

	@ObfuscatedName("bb.Db")
	public int field478;

	@ObfuscatedName("bb.Eb")
	public int field479;

	@ObfuscatedName("bb.Fb")
	public int field480;

	@ObfuscatedName("bb.Gb")
	public int field481;

	@ObfuscatedName("bb.Ib")
	public int field483;

	@ObfuscatedName("bb.Jb")
	public int field484;

	@ObfuscatedName("bb.Kb")
	public int field485;

	@ObfuscatedName("bb.Lb")
	public int field486;

	@ObfuscatedName("bb.Ab")
	public long field475;

	@ObfuscatedName("bb.Hb")
	public Model field482;

	@ObfuscatedName("bb.Ob")
	public NpcType field489;

	@ObfuscatedName("bb.a(Lmb;Z)V")
	public final void method130(Packet arg0, boolean arg1) {
		arg0.field711 = 0;
		this.field470 = arg0.method239();
		this.field471 = arg0.method239();
		this.field489 = null;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.method239();
			if (var4 == 0) {
				this.field472[var3] = 0;
			} else {
				int var5 = arg0.method239();
				this.field472[var3] = (var4 << 8) + var5;
				if (var3 == 0 && this.field472[0] == 65535) {
					this.field489 = NpcType.method344(arg0.method241());
					break;
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method239();
			if (var7 < 0 || var7 >= Client.field1538[var6].length) {
				var7 = 0;
			}
			this.field473[var6] = var7;
		}
		super.field415 = arg0.method241();
		if (!arg1) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		if (super.field415 == 65535) {
			super.field415 = -1;
		}
		super.field416 = arg0.method241();
		if (super.field416 == 65535) {
			super.field416 = -1;
		}
		super.field417 = arg0.method241();
		if (super.field417 == 65535) {
			super.field417 = -1;
		}
		super.field418 = arg0.method241();
		if (super.field418 == 65535) {
			super.field418 = -1;
		}
		super.field419 = arg0.method241();
		if (super.field419 == 65535) {
			super.field419 = -1;
		}
		super.field420 = arg0.method241();
		if (super.field420 == 65535) {
			super.field420 = -1;
		}
		super.field421 = arg0.method241();
		if (super.field421 == 65535) {
			super.field421 = -1;
		}
		this.field468 = JString.method314(true, JString.method311(arg0.method245(0), true));
		this.field474 = arg0.method239();
		this.field469 = true;
		this.field475 = 0L;
		for (int var9 = 0; var9 < 12; var9++) {
			this.field475 <<= 0x4;
			if (this.field472[var9] >= 256) {
				this.field475 += this.field472[var9] - 256;
			}
		}
		if (this.field472[0] >= 256) {
			this.field475 += this.field472[0] - 256 >> 4;
		}
		if (this.field472[1] >= 256) {
			this.field475 += this.field472[1] - 256 >> 8;
		}
		for (int var10 = 0; var10 < 5; var10++) {
			this.field475 <<= 0x3;
			this.field475 += this.field473[var10];
		}
		this.field475 <<= 0x1;
		this.field475 += this.field470;
	}

	@ObfuscatedName("bb.a(I)Lfb;")
	public final Model method123(int arg0) {
		if (!this.field469) {
			return null;
		}
		Model var2 = this.method131(0);
		if (var2 == null) {
			return null;
		}
		super.field456 = var2.field406;
		if (arg0 != 45160) {
			throw new NullPointerException();
		}
		var2.field572 = true;
		if (this.field487) {
			return var2;
		}
		if (super.field443 != -1 && super.field444 != -1) {
			SpotAnimType var3 = SpotAnimType.field1132[super.field443];
			Model var4 = var3.method388();
			if (var4 != null) {
				Model var5 = new Model(AnimFrame.method62((byte) 8, super.field444), 992, false, true, var4);
				var5.method152((byte) -32, 0, 0, -super.field447);
				var5.method146((byte) 112);
				var5.method147(true, var3.field1136.field1114[super.field444]);
				var5.field571 = null;
				var5.field570 = null;
				if (var3.field1139 != 128 || var3.field1140 != 128) {
					var5.method155(792, var3.field1139, var3.field1139, var3.field1140);
				}
				var5.method156(var3.field1142 + 64, var3.field1143 + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model((byte) 9, 2, var6, true);
			}
		}
		if (this.field482 != null) {
			if (Client.field1591 >= this.field478) {
				this.field482 = null;
			}
			if (Client.field1591 >= this.field477 && Client.field1591 < this.field478) {
				Model var7 = this.field482;
				var7.method152((byte) -32, this.field479 - super.field410, this.field481 - super.field411, this.field480 - this.field476);
				if (super.field457 == 512) {
					var7.method150(this.field466);
					var7.method150(this.field466);
					var7.method150(this.field466);
				} else if (super.field457 == 1024) {
					var7.method150(this.field466);
					var7.method150(this.field466);
				} else if (super.field457 == 1536) {
					var7.method150(this.field466);
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model((byte) 9, 2, var8, true);
				if (super.field457 == 512) {
					var7.method150(this.field466);
				} else if (super.field457 == 1024) {
					var7.method150(this.field466);
					var7.method150(this.field466);
				} else if (super.field457 == 1536) {
					var7.method150(this.field466);
					var7.method150(this.field466);
					var7.method150(this.field466);
				}
				var7.method152((byte) -32, super.field410 - this.field479, super.field411 - this.field481, this.field476 - this.field480);
			}
		}
		var2.field572 = true;
		return var2;
	}

	@ObfuscatedName("bb.c(I)Lfb;")
	public final Model method131(int arg0) {
		if (arg0 != 0) {
			throw new NullPointerException();
		} else if (this.field489 == null) {
			long var4 = this.field475;
			int var6 = -1;
			int var7 = -1;
			int var8 = -1;
			int var9 = -1;
			if (super.field438 >= 0 && super.field441 == 0) {
				SeqType var10 = SeqType.field1112[super.field438];
				var6 = var10.field1114[super.field439];
				if (super.field435 >= 0 && super.field435 != super.field415) {
					var7 = SeqType.field1112[super.field435].field1114[super.field436];
				}
				if (var10.field1121 >= 0) {
					var8 = var10.field1121;
					var4 += var8 - this.field472[5] << 8;
				}
				if (var10.field1122 >= 0) {
					var9 = var10.field1122;
					var4 += var9 - this.field472[3] << 16;
				}
			} else if (super.field435 >= 0) {
				var6 = SeqType.field1112[super.field435].field1114[super.field436];
			}
			Model var11 = (Model) field490.method115(var4);
			if (var11 == null) {
				boolean var12 = false;
				for (int var13 = 0; var13 < 12; var13++) {
					int var14 = this.field472[var13];
					if (var9 >= 0 && var13 == 3) {
						var14 = var9;
					}
					if (var8 >= 0 && var13 == 5) {
						var14 = var8;
					}
					if (var14 >= 256 && var14 < 512 && !IdkType.field1091[var14 - 256].method379(false)) {
						var12 = true;
					}
					if (var14 >= 512 && !ObjType.method350(var14 - 512).method357((byte) 3, this.field470)) {
						var12 = true;
					}
				}
				if (var12) {
					if (this.field488 != -1L) {
						var11 = (Model) field490.method115(this.field488);
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
					int var18 = this.field472[var17];
					if (var9 >= 0 && var17 == 3) {
						var18 = var9;
					}
					if (var8 >= 0 && var17 == 5) {
						var18 = var8;
					}
					if (var18 >= 256 && var18 < 512) {
						Model var19 = IdkType.field1091[var18 - 256].method380(true);
						if (var19 != null) {
							var15[var16++] = var19;
						}
					}
					if (var18 >= 512) {
						Model var20 = ObjType.method350(var18 - 512).method358(135, this.field470);
						if (var20 != null) {
							var15[var16++] = var20;
						}
					}
				}
				var11 = new Model(var15, var16, -928);
				for (int var21 = 0; var21 < 5; var21++) {
					if (this.field473[var21] != 0) {
						var11.method153(Client.field1538[var21][0], Client.field1538[var21][this.field473[var21]]);
						if (var21 == 1) {
							var11.method153(Client.field1271[0], Client.field1271[this.field473[var21]]);
						}
					}
				}
				var11.method146((byte) 112);
				var11.method156(64, 850, -30, -50, -30, true);
				field490.method116(var11, false, var4);
				this.field488 = var4;
			}
			if (this.field487) {
				return var11;
			}
			Model var22 = Model.field534;
			var22.method141(AnimFrame.method62((byte) 8, var6) & AnimFrame.method62((byte) 8, var7), 764, var11);
			if (var6 != -1 && var7 != -1) {
				var22.method148(SeqType.field1112[super.field438].field1118, -620, var6, var7);
			} else if (var6 != -1) {
				var22.method147(true, var6);
			}
			var22.method143(-15382);
			var22.field571 = null;
			var22.field570 = null;
			return var22;
		} else {
			int var2 = -1;
			if (super.field438 >= 0 && super.field441 == 0) {
				var2 = SeqType.field1112[super.field438].field1114[super.field439];
			} else if (super.field435 >= 0) {
				var2 = SeqType.field1112[super.field435].field1114[super.field436];
			}
			return this.field489.method346(0, var2, null, -1);
		}
	}

	@ObfuscatedName("bb.b(Z)Lfb;")
	public final Model method132(boolean arg0) {
		if (!this.field469) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = this.field472[var3];
			if (var4 >= 256 && var4 < 512 && !IdkType.field1091[var4 - 256].method381(0)) {
				var2 = true;
			}
			if (var4 >= 512 && !ObjType.method350(var4 - 512).method359(false, this.field470)) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var5 = new Model[12];
		int var6 = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var8 = this.field472[var7];
			if (var8 >= 256 && var8 < 512) {
				Model var9 = IdkType.field1091[var8 - 256].method382((byte) 9);
				if (var9 != null) {
					var5[var6++] = var9;
				}
			}
			if (var8 >= 512) {
				Model var10 = ObjType.method350(var8 - 512).method360(true, this.field470);
				if (var10 != null) {
					var5[var6++] = var10;
				}
			}
		}
		Model var11 = new Model(var5, var6, -928);
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.field473[var12] != 0) {
				var11.method153(Client.field1538[var12][0], Client.field1538[var12][this.field473[var12]]);
				if (var12 == 1) {
					var11.method153(Client.field1271[0], Client.field1271[this.field473[var12]]);
				}
			}
		}
		if (arg0) {
			throw new NullPointerException();
		}
		return var11;
	}

	@ObfuscatedName("bb.b(I)Z")
	public final boolean method127(int arg0) {
		if (arg0 >= 0) {
			this.field467 = !this.field467;
		}
		return this.field469;
	}
}
