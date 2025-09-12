package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;

@ObfuscatedName("ab")
public class ClientNpc extends ClientEntity {

	@ObfuscatedName("ab.sb")
	public NpcType type;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final Model getModel() {
		if (this.type == null) {
			return null;
		}
		Model var2 = this.getAnimatedModel();
		if (var2 == null) {
			return null;
		}
		super.height = var2.minY;
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotAnimType var3 = SpotAnimType.types[super.spotanimId];
			Model var4 = var3.getModel();
			if (var4 != null) {
				Model var5 = new Model(true, var4, false, !var3.animHasAlpha);
				var5.translate(0, 0, -super.spotanimHeight);
				var5.createLabelReferences();
				var5.applyTransform(var3.seq.frames[super.spotanimFrame]);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var5.scale(var3.resizeh, var3.resizeh, var3.resizev);
				}
				var5.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(2, true, var6);
			}
		}
		if (this.type.size == 1) {
			var2.picking = true;
		}
		return var2;
	}

	@ObfuscatedName("ab.a(Z)Lfb;")
	public final Model getAnimatedModel() {
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			int var2 = SeqType.types[super.primarySeqId].frames[super.primarySeqFrame];
			int var3 = -1;
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				var3 = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.type.getModel(var2, SeqType.types[super.primarySeqId].walkmerge, var3);
		} else {
			int var4 = -1;
			if (super.secondarySeqId >= 0) {
				var4 = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.type.getModel(var4, null, -1);
		}
	}

	@ObfuscatedName("ab.b(B)Z")
	public final boolean isVisible() {
		return this.type != null;
	}
}
