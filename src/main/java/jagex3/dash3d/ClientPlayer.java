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
	public int locOffsetZ;

	@ObfuscatedName("aa.vd")
	public int skillLevel = 0;

	@ObfuscatedName("aa.wd")
	public int field66;

	@ObfuscatedName("aa.yd")
	public int combatLevel = 0;

	@ObfuscatedName("aa.Ed")
	public int team = 0;

	@ObfuscatedName("aa.Ld")
	public int headiconPrayer = -1;

	@ObfuscatedName("aa.Gd")
	public int headiconPk = -1;

	@ObfuscatedName("aa.Md")
	public int locEndCycle = 0;

	@ObfuscatedName("aa.Vd")
	public int locStartCycle = 0;

	@ObfuscatedName("aa.Zd")
	public boolean lowMem = false;

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
	public JagString name;

	@ObfuscatedName("aa.Ud")
	public PlayerModel model;

	@ObfuscatedName("aa.Dd")
	public Model field73;

	@ObfuscatedName("aa.f(I)Lpa;")
	@Override
	public Model getTempModel() {
		if (this.model == null) {
			return null;
		}
		SeqType var1 = super.primarySeqId != -1 && super.primarySeqDelay == 0 ? SeqType.list(super.primarySeqId) : null;
		SeqType var2 = super.secondarySeqId == -1 || this.lowMem || super.readyanim == super.secondarySeqId && var1 != null ? null : SeqType.list(super.secondarySeqId);
		Model var3 = this.model.getTempModel(var1, var2, super.secondarySeqFrame, super.primarySeqFrame);
		if (var3 == null) {
			return null;
		}
		var3.calcBoundingCylinder();
		super.height = var3.minY;
		if (!this.lowMem && super.spotanimId != -1 && super.spotanimFrame != -1) {
			Model var4 = SpotType.list(super.spotanimId).getTempModel2(super.spotanimFrame);
			if (var4 != null) {
				var4.translate(0, -super.spotanimHeight, 0);
				Model[] var5 = new Model[]{var3, var4};
				var3 = new Model(var5, 2, true);
			}
		}
		if (!this.lowMem && this.field73 != null) {
			if (Client.loopCycle >= this.locEndCycle) {
				this.field73 = null;
			}
			if (this.locStartCycle <= Client.loopCycle && this.locEndCycle > Client.loopCycle) {
				Model var6 = this.field73;
				var6.translate(this.field79 - super.x, -this.field84 + this.field80, this.locOffsetZ - super.z);
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
				var6.translate(super.x - this.field79, -this.field80 + this.field84, super.z - this.locOffsetZ);
			}
		}
		var3.useAABBMouseCheck = true;
		return var3;
	}

	@ObfuscatedName("aa.h(I)Z")
	@Override
	public boolean ready() {
		return this.model != null;
	}

	@ObfuscatedName("aa.a(BLba;)V")
	public void setAppearance(Packet arg0) {
		arg0.pos = 0;
		int var2 = arg0.g1();
		this.headiconPk = arg0.g1b();
		this.headiconPrayer = arg0.g1b();
		int var3 = -1;
		this.team = 0;
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
						this.team = var8;
					}
				}
			}
		}
		int[] var9 = new int[5];
		for (int var10 = 0; var10 < 5; var10++) {
			int var11 = arg0.g1();
			if (var11 < 0 || PlayerModel.recol1d[var10].length <= var11) {
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
		super.runanim = arg0.g2();
		if (super.runanim == 65535) {
			super.runanim = -1;
		}
		this.name = JString.toScreenName(arg0.g8()).toRawUsername();
		this.combatLevel = arg0.g1();
		this.skillLevel = arg0.g2();
		if (this.model == null) {
			this.model = new PlayerModel();
		}
		this.model.setAppearance(var4, var2 == 1, var9, var3);
	}
}
