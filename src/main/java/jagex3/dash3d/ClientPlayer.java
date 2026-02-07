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
	public int locOffsetZ;

	@ObfuscatedName("ka.bd")
	public int headiconPk = -1;

	@ObfuscatedName("ka.ed")
	public int skillLevel = 0;

	@ObfuscatedName("ka.fd")
	public int locEndCycle = 0;

	@ObfuscatedName("ka.gd")
	public ModelLit locModel;

	@ObfuscatedName("ka.ld")
	public JagString name;

	@ObfuscatedName("ka.md")
	public int headiconPrayer = -1;

	@ObfuscatedName("ka.Lc")
	public static int field1633 = -1;

	@ObfuscatedName("ka.Rc")
	public int locStartCycle = 0;

	@ObfuscatedName("ka.Pc")
	public int team = 0;

	@ObfuscatedName("ka.Nc")
	public int combatLevel = 0;

	@ObfuscatedName("ka.Tc")
	public boolean lowMem = false;

	@ObfuscatedName("ka.Fc")
	public int locOffsetX;

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
	public PlayerModel model;

	@ObfuscatedName("ka.a(BLjd;)V")
	public void setAppearance(Packet arg0) {
		arg0.pos = 0;
		int[] var2 = new int[12];
		int var3 = -1;
		int var4 = arg0.g1();
		this.headiconPk = arg0.g1b();
		this.headiconPrayer = arg0.g1b();
		this.team = 0;
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
					int var8 = ObjType.list(var2[var5] - 512).team;
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
		super.walkanim_l = arg0.g2();
		if (super.walkanim_l == 65535) {
			super.walkanim_l = -1;
		}
		super.walkanim_r = arg0.g2();
		if (super.walkanim_r == 65535) {
			super.walkanim_r = -1;
		}
		super.runanim = arg0.g2();
		if (super.runanim == 65535) {
			super.runanim = -1;
		}
		this.name = JString.method59(arg0.g8()).method264();
		this.combatLevel = arg0.g1();
		this.skillLevel = arg0.g2();
		if (this.model == null) {
			this.model = new PlayerModel();
		}
		this.model.setAppearance(var9, var3, var2, var4 == 1);
	}

	@ObfuscatedName("ka.b(B)Lod;")
	@Override
	public ModelLit getTempModel() {
		if (this.model == null) {
			return null;
		}
		SeqType var1 = super.primarySeqId != -1 && super.primarySeqDelay == 0 ? SeqType.list(super.primarySeqId) : null;
		SeqType var2 = super.secondarySeqId == -1 || this.lowMem || super.secondarySeqId == super.readyanim && var1 != null ? null : SeqType.list(super.secondarySeqId);
		ModelLit var3 = this.model.getTempModel(var1, super.field2728, var2, super.field2725);
		if (var3 == null) {
			return null;
		}
		var3.calcBoundingCylinder();
		super.height = var3.minY;
		if (!this.lowMem && super.spotanimId != -1 && super.spotanimFrame != -1) {
			ModelLit var4 = SpotType.list(super.spotanimId).getTempModel2(super.spotanimFrame);
			if (var4 != null) {
				ModelLit[] var5 = new ModelLit[] { var3, var4 };
				var4.translate(0, -super.spotanimHeight, 0);
				var3 = new ModelLit(var5, 2);
			}
		}
		if (!this.lowMem && this.locModel != null) {
			if (this.locEndCycle <= Client.loopCycle) {
				this.locModel = null;
			}
			if (this.locStartCycle <= Client.loopCycle && this.locEndCycle > Client.loopCycle) {
				ModelLit var6 = this.locModel;
				var6.translate(this.locOffsetX - super.x, this.field1644 + -this.field1643, this.locOffsetZ - super.z);
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
				ModelLit[] var7 = new ModelLit[] { var3, var6 };
				var3 = new ModelLit(var7, 2);
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
				var6.translate(super.x - this.locOffsetX, this.field1643 - this.field1644, super.z - this.locOffsetZ);
			}
		}
		var3.useAABBMouseCheck = true;
		return var3;
	}

	@ObfuscatedName("ka.j(I)Z")
	@Override
	public boolean ready() {
		return this.model != null;
	}
}
