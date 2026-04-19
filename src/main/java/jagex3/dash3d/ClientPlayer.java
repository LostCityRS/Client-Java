package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;
import jagex3.io.Packet;
import jagex3.jstring.JString;
import jagex3.util.JagString;

@ObfuscatedName("aa")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("aa.be")
	public int field97;

	@ObfuscatedName("aa.de")
	public int field99;

	@ObfuscatedName("aa.vd")
	public int field65 = 0;

	@ObfuscatedName("aa.wd")
	public int field66;

	@ObfuscatedName("aa.yd")
	public int combatLevel = 0;

	@ObfuscatedName("aa.Ed")
	public int field74 = 0;

	@ObfuscatedName("aa.Ld")
	public int field81 = -1;

	@ObfuscatedName("aa.Gd")
	public int field76 = -1;

	@ObfuscatedName("aa.Md")
	public int field82 = 0;

	@ObfuscatedName("aa.Vd")
	public int field91 = 0;

	@ObfuscatedName("aa.Zd")
	public boolean field95 = false;

	@ObfuscatedName("aa.Ad")
	public int field70;

	@ObfuscatedName("aa.Jd")
	public int field79;

	@ObfuscatedName("aa.Kd")
	public int field80;

	@ObfuscatedName("aa.Od")
	public int field84;

	@ObfuscatedName("aa.Td")
	public int field89;

	@ObfuscatedName("aa.Qd")
	public JagString field86;

	@ObfuscatedName("aa.Ud")
	public PlayerModel field90;

	@ObfuscatedName("aa.Dd")
	public Model field73;

	@ObfuscatedName("aa.f(I)Lpa;")
	@Override
	public Model method41() {
		if (this.field90 == null) {
			return null;
		}
		SeqType var1 = super.field2015 != -1 && super.field1996 == 0 ? SeqType.list(super.field2015) : null;
		SeqType var2 = super.secondarySeqId == -1 || this.field95 || super.readyanim == super.secondarySeqId && var1 != null ? null : SeqType.list(super.secondarySeqId);
		Model var3 = this.field90.method637(var1, var2, super.field1990, super.field1978);
		if (var3 == null) {
			return null;
		}
		var3.calcBoundingCylinder();
		super.field1991 = var3.field3135;
		if (!this.field95 && super.field1965 != -1 && super.field2014 != -1) {
			Model var4 = SpotType.list(super.field1965).getTempModel2(super.field2014);
			if (var4 != null) {
				var4.translate(0, -super.field1984, 0);
				Model[] var5 = new Model[]{var3, var4};
				var3 = new Model(var5, 2, true);
			}
		}
		if (!this.field95 && this.field73 != null) {
			if (Client.loopCycle >= this.field82) {
				this.field73 = null;
			}
			if (this.field91 <= Client.loopCycle && this.field82 > Client.loopCycle) {
				Model var6 = this.field73;
				var6.translate(this.field79 - super.x, -this.field84 + this.field80, this.field99 - super.z);
				if (super.dstYaw == 512) {
					var6.rotate90();
					var6.rotate90();
					var6.rotate90();
				} else if (super.dstYaw == 1024) {
					var6.rotate90();
					var6.rotate90();
				} else if (super.dstYaw == 1536) {
					var6.rotate90();
				}
				Model[] var7 = new Model[]{var3, var6};
				var3 = new Model(var7, 2, true);
				if (super.dstYaw == 512) {
					var6.rotate90();
				} else if (super.dstYaw == 1024) {
					var6.rotate90();
					var6.rotate90();
				} else if (super.dstYaw == 1536) {
					var6.rotate90();
					var6.rotate90();
					var6.rotate90();
				}
				var6.translate(super.x - this.field79, -this.field80 + this.field84, super.z - this.field99);
			}
		}
		var3.useAABBMouseCheck = true;
		return var3;
	}

	@ObfuscatedName("aa.h(I)Z")
	@Override
	public boolean ready() {
		return this.field90 != null;
	}

	@ObfuscatedName("aa.a(BLba;)V")
	public void method43(Packet arg0) {
		arg0.pos = 0;
		int var2 = arg0.g1();
		this.field76 = arg0.g1b();
		this.field81 = arg0.g1b();
		int var3 = -1;
		this.field74 = 0;
		int[] var4 = new int[12];
		for (int var5 = 0; var5 < 12; var5++) {
			int var6 = arg0.g1();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				int var7 = arg0.g1();
				var4[var5] = (var6 << 8) + var7;
				if (var5 == 0 && var4[0] == 65535) {
					var3 = arg0.g2();
					break;
				}
				if (var4[var5] >= 512) {
					int var8 = ObjType.list(var4[var5] - 512).team;
					if (var8 != 0) {
						this.field74 = var8;
					}
				}
			}
		}
		int[] var9 = new int[5];
		for (int var10 = 0; var10 < 5; var10++) {
			int var11 = arg0.g1();
			if (var11 < 0 || PlayerModel.field2894[var10].length <= var11) {
				var11 = 0;
			}
			var9[var10] = var11;
		}
		super.readyanim = arg0.g2();
		if (super.readyanim == 65535) {
			super.readyanim = -1;
		}
		super.turnleftanim = arg0.g2();
		if (super.turnleftanim == 65535) {
			super.turnleftanim = -1;
		}
		super.turnrightanim = super.turnleftanim;
		super.walkanim = arg0.g2();
		if (super.walkanim == 65535) {
			super.walkanim = -1;
		}
		super.walkanim_b = arg0.g2();
		if (super.walkanim_b == 65535) {
			super.walkanim_b = -1;
		}
		super.walkanim_r = arg0.g2();
		if (super.walkanim_r == 65535) {
			super.walkanim_r = -1;
		}
		super.walkanim_l = arg0.g2();
		if (super.walkanim_l == 65535) {
			super.walkanim_l = -1;
		}
		super.field1956 = arg0.g2();
		if (super.field1956 == 65535) {
			super.field1956 = -1;
		}
		this.field86 = JString.method969(arg0.method174()).method36();
		this.combatLevel = arg0.g1();
		this.field65 = arg0.g2();
		if (this.field90 == null) {
			this.field90 = new PlayerModel();
		}
		this.field90.setAppearance(var4, var2 == 1, var9, var3);
	}
}
