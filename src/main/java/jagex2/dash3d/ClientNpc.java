package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;

@ObfuscatedName("ab")
public class ClientNpc extends ClientEntity {

	@ObfuscatedName("ab.rb")
	public NpcType type;

	@ObfuscatedName("ab.a(I)Lfb;")
	public Model getTempModel() {
		if (this.type == null) {
			return null;
		} else {
			Model var2 = this.getTempModel2();
			if (var2 == null) {
				return null;
			}
			super.height = var2.minY;
			if (super.spotanimId != -1 && super.spotanimFrame != -1) {
				SpotAnimType var3 = SpotAnimType.list[super.spotanimId];
				Model var4 = var3.getTempModel();
				if (var4 != null) {
					int var5 = var3.seq.frames[super.spotanimFrame];
					Model var6 = new Model(AnimFrame.shareAlpha(var5), false, true, var4);
					var6.translate(0, 0, -super.spotanimHeight);
					var6.prepareAnim();
					var6.animate(var5);
					var6.labelFaces = null;
					var6.labelVertices = null;
					if (var3.resizeh != 128 || var3.resizev != 128) {
						var6.resize(var3.resizeh, var3.resizeh, var3.resizev);
					}
					var6.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
					Model[] var7 = new Model[] { var2, var6 };
					var2 = new Model(2, var7, true);
				}
			}
			if (this.type.size == 1) {
				var2.useAABBMouseCheck = true;
			}
			return var2;
		}
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public Model getTempModel2() {
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			int var2 = SeqType.list[super.primarySeqId].frames[super.primarySeqFrame];
			int var3 = -1;
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				var3 = SeqType.list[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.type.getTempModel(var2, SeqType.list[super.primarySeqId].walkmerge, var3);
		} else {
			int var4 = -1;
			if (super.secondarySeqId >= 0) {
				var4 = SeqType.list[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.type.getTempModel(var4, null, -1);
		}
	}

	@ObfuscatedName("ab.b(I)Z")
	public boolean isReady() {
		return this.type != null;
	}
}
