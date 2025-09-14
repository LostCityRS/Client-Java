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
	public Model getModel() {
		if (this.type == null) {
			return null;
		}

		Model model = this.getAnimatedModel();
		if (model == null) {
			return null;
		}

		super.height = model.minY;

		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotAnimType graphic = SpotAnimType.types[super.spotanimId];
			Model graphicModel = graphic.getModel();

			if (graphicModel != null) {
				Model temp = new Model(true, graphicModel, false, !graphic.animHasAlpha);
				temp.offset(0, 0, -super.spotanimHeight);
				temp.createLabelReferences();
				temp.applyFrame(graphic.seq.frames[super.spotanimFrame]);
				temp.labelFaces = null;
				temp.labelVertices = null;

				if (graphic.resizeh != 128 || graphic.resizev != 128) {
					temp.resize(graphic.resizeh, graphic.resizeh, graphic.resizev);
				}

				temp.calculateNormals(graphic.ambient + 64, graphic.contrast + 850, -30, -50, -30, true);

				Model[] models = new Model[] { model, temp };
				model = new Model(2, true, models);
			}
		}

		if (this.type.size == 1) {
			model.picking = true;
		}

		return model;
	}

	@ObfuscatedName("ab.a(Z)Lfb;")
	public Model getAnimatedModel() {
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			int primaryFrame = SeqType.types[super.primarySeqId].frames[super.primarySeqFrame];

			int secondaryFrame = -1;
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				secondaryFrame = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}

			return this.type.getModel(primaryFrame, SeqType.types[super.primarySeqId].walkmerge, secondaryFrame);
		} else {
			int frame = -1;
			if (super.secondarySeqId >= 0) {
				frame = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}

			return this.type.getModel(frame, null, -1);
		}
	}

	@ObfuscatedName("ab.b(B)Z")
	public boolean isVisible() {
		return this.type != null;
	}
}
