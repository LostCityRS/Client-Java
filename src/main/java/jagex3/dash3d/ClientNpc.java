package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.NpcType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("vd")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("vd.Ad")
	public NpcType type;

	@ObfuscatedName("vd.f(I)Lpa;")
	@Override
	public Model getTempModel() {
		if (this.type == null) {
			return null;
		}
		SeqType var1 = super.primarySeqId != -1 && super.primarySeqDelay == 0 ? SeqType.list(super.primarySeqId) : null;
		SeqType var2 = super.secondarySeqId == -1 || super.readyanim == super.secondarySeqId && var1 != null ? null : SeqType.list(super.secondarySeqId);
		Model var3 = this.type.getTempModel(var1, var2, super.secondarySeqFrame, super.primarySeqFrame);
		if (var3 == null) {
			return null;
		}
		var3.calcBoundingCylinder();
		super.height = var3.minY;
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			Model var4 = SpotType.list(super.spotanimId).getTempModel2(super.spotanimFrame);
			if (var4 != null) {
				var4.translate(0, -super.spotanimHeight, 0);
				Model[] var5 = new Model[]{var3, var4};
				var3 = new Model(var5, 2, true);
			}
		}
		if (this.type.size == 1) {
			var3.useAABBMouseCheck = true;
		}
		return var3;
	}

	@ObfuscatedName("vd.h(I)Z")
	@Override
	public boolean ready() {
		return this.type != null;
	}
}
