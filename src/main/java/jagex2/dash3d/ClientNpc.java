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

		Model model = this.getAnimatedModel();
		if (model == null) {
			return null;
		}

		super.height = model.minY;

		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotAnimType spot = SpotAnimType.types[super.spotanimId];
			Model spotModel = spot.getModel();

			if (spotModel != null) {
				Model temp = new Model(spotModel, true, false, !spot.animHasAlpha);
				temp.translate(-super.spotanimHeight, 0, 0);
				temp.createLabelReferences();
				temp.applyTransform(spot.seq.frames[super.spotanimFrame]);

				temp.labelFaces = null;
				temp.labelVertices = null;

				if (spot.resizeh != 128 || spot.resizev != 128) {
					temp.scale(spot.resizev, spot.resizeh, spot.resizeh);
				}

				temp.calculateNormals(spot.ambient + 64, spot.contrast + 850, -30, -50, -30, true);

				Model[] models = new Model[] { model, temp };
				model = new Model(true, 2, models);
			}
		}

		if (this.type.size == 1) {
			model.picking = true;
		}

		return model;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final Model getAnimatedModel() {
		if (super.primarySeqId < 0 || super.primarySeqDelay != 0) {
			int transform = -1;
			if (super.secondarySeqId >= 0) {
				transform = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}

			return this.type.getModel(transform, -1, null);
		} else {
			int primaryTransform = SeqType.types[super.primarySeqId].frames[super.primarySeqFrame];
			int secondaryTransform = -1;
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				secondaryTransform = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}

			return this.type.getModel(primaryTransform, secondaryTransform, SeqType.types[super.primarySeqId].walkmerge);
		}
	}

	@ObfuscatedName("ab.a(B)Z")
	public final boolean isVisible() {
		return this.type != null;
	}
}
