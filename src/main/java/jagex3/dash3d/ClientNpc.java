package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.NPCType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("q")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("q.Hc")
	public NPCType type;

	@ObfuscatedName("q.j(I)Z")
	@Override
	public boolean ready() {
		return this.type != null;
	}

	@ObfuscatedName("q.b(B)Lod;")
	@Override
	public ModelLit getTempModel() {
		if (this.type == null) {
			return null;
		}
		SeqType var1 = super.primarySeqId != -1 && super.primarySeqDelay == 0 ? SeqType.list(super.primarySeqId) : null;
		SeqType var2 = super.secondarySeqId == -1 || super.secondarySeqId == super.readyanim && var1 != null ? null : SeqType.list(super.secondarySeqId);
		ModelLit var3 = this.type.getTempModel(var2, super.field2725, var1, super.field2728);
		if (var3 == null) {
			return null;
		}
		var3.calcBoundingCylinder();
		super.height = var3.minY;
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			ModelLit var4 = SpotType.list(super.spotanimId).getTempModel2(super.spotanimFrame);
			if (var4 != null) {
				var4.translate(0, -super.spotanimHeight, 0);
				ModelLit[] var5 = new ModelLit[] { var3, var4 };
				var3 = new ModelLit(var5, 2);
			}
		}
		if (this.type.size == 1) {
			var3.useAABBMouseCheck = true;
		}
		return var3;
	}
}
