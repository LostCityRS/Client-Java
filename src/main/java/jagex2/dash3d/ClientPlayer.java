package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.IdkType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("bb")
public class ClientPlayer extends ClientEntity {

	@ObfuscatedName("bb.sb")
	public String name;

	@ObfuscatedName("bb.tb")
	public boolean visible = false;

	@ObfuscatedName("bb.ub")
	public int gender;

	@ObfuscatedName("bb.vb")
	public int headicon;

	@ObfuscatedName("bb.wb")
	public int[] appearance = new int[12];

	@ObfuscatedName("bb.xb")
	public int[] colour = new int[5];

	@ObfuscatedName("bb.yb")
	public int vislevel;

	@ObfuscatedName("bb.zb")
	public long hash;

	@ObfuscatedName("bb.Lb")
	public boolean lowMemory = false;

	@ObfuscatedName("bb.Mb")
	public long modelCacheKey = -1L;

	@ObfuscatedName("bb.Nb")
	public static LruCache modelCache = new LruCache(260);

	@ObfuscatedName("bb.Ab")
	public int y;

	@ObfuscatedName("bb.Bb")
	public int locStartCycle;

	@ObfuscatedName("bb.Cb")
	public int locStopCycle;

	@ObfuscatedName("bb.Db")
	public int locOffsetX;

	@ObfuscatedName("bb.Eb")
	public int locOffsetY;

	@ObfuscatedName("bb.Fb")
	public int locOffsetZ;

	@ObfuscatedName("bb.Hb")
	public int minTileX;

	@ObfuscatedName("bb.Ib")
	public int minTileZ;

	@ObfuscatedName("bb.Jb")
	public int maxTileX;

	@ObfuscatedName("bb.Kb")
	public int maxTileZ;

	@ObfuscatedName("bb.Gb")
	public Model locModel;

	@ObfuscatedName("bb.a(Lmb;I)V")
	public final void read(Packet buf) {
		buf.pos = 0;
		this.gender = buf.g1();
		this.headicon = buf.g1();

		for (int i = 0; i < 12; i++) {
			int part = buf.g1();
			if (part == 0) {
				this.appearance[i] = 0;
			} else {
				int part2 = buf.g1();
				this.appearance[i] = (part << 8) + part2;
			}
		}

		for (int i = 0; i < 5; i++) {
			int colour = buf.g1();
			if (colour < 0 || colour >= Client.DESIGN_BODY_COLOUR[i].length) {
				colour = 0;
			}

			this.colour[i] = colour;
		}

		super.readyanim = buf.g2();
		if (super.readyanim == 65535) {
			super.readyanim = -1;
		}

		super.turnanim = buf.g2();
		if (super.turnanim == 65535) {
			super.turnanim = -1;
		}

		super.walkanim = buf.g2();
		if (super.walkanim == 65535) {
			super.walkanim = -1;
		}

		super.walkanim_b = buf.g2();
		if (super.walkanim_b == 65535) {
			super.walkanim_b = -1;
		}

		super.walkanim_l = buf.g2();
		if (super.walkanim_l == 65535) {
			super.walkanim_l = -1;
		}

		super.walkanim_r = buf.g2();
		if (super.walkanim_r == 65535) {
			super.walkanim_r = -1;
		}

		super.runanim = buf.g2();
		if (super.runanim == 65535) {
			super.runanim = -1;
		}

		this.name = JString.formatDisplayName(JString.fromBase37(buf.g8()));
		this.vislevel = buf.g1();
		this.visible = true;
		this.hash = 0L;

		for (int i = 0; i < 12; i++) {
			this.hash <<= 0x4;

			if (this.appearance[i] >= 256) {
				this.hash += this.appearance[i] - 256;
			}
		}

		if (this.appearance[0] >= 256) {
			this.hash += this.appearance[0] - 256 >> 4;
		}

		if (this.appearance[1] >= 256) {
			this.hash += this.appearance[1] - 256 >> 8;
		}

		for (int i = 0; i < 5; i++) {
			this.hash <<= 0x3;
			this.hash += this.colour[i];
		}

		this.hash <<= 0x1;
		this.hash += this.gender;
	}

	@ObfuscatedName("bb.a(I)Lfb;")
	public final Model getModel() {
		if (!this.visible) {
			return null;
		}

		Model model = this.getAnimatedModel();
		if (model == null) {
			return null;
		}

		super.height = model.minY;
		model.picking = true;

		if (this.lowMemory) {
			return model;
		}

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

		if (this.locModel != null) {
			if (Client.loopCycle >= this.locStopCycle) {
				this.locModel = null;
			}

			if (Client.loopCycle >= this.locStartCycle && Client.loopCycle < this.locStopCycle) {
				Model locModel = this.locModel;

				locModel.translate(this.locOffsetY - this.y, this.locOffsetX - super.x, this.locOffsetZ - super.z);

				if (super.dstYaw == 512) {
					locModel.rotateY90();
					locModel.rotateY90();
					locModel.rotateY90();
				} else if (super.dstYaw == 1024) {
					locModel.rotateY90();
					locModel.rotateY90();
				} else if (super.dstYaw == 1536) {
					locModel.rotateY90();
				}

				Model[] models = new Model[] { model, locModel };
				model = new Model(true, 2, models);

				if (super.dstYaw == 512) {
					locModel.rotateY90();
				} else if (super.dstYaw == 1024) {
					locModel.rotateY90();
					locModel.rotateY90();
				} else if (super.dstYaw == 1536) {
					locModel.rotateY90();
					locModel.rotateY90();
					locModel.rotateY90();
				}

				locModel.translate(this.y - this.locOffsetY, super.x - this.locOffsetX, super.z - this.locOffsetZ);
			}
		}

		model.picking = true;
		return model;
	}

	@ObfuscatedName("bb.c(I)Lfb;")
	public final Model getAnimatedModel() {
		long hash = this.hash;
		int primaryTransformId = -1;
		int secondaryTransformId = -1;
		int leftHandValue = -1;
		int rightHandValue = -1;

		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			SeqType seq = SeqType.types[super.primarySeqId];

			primaryTransformId = seq.frames[super.primarySeqFrame];

			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				secondaryTransformId = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}

			if (seq.replaceheldleft >= 0) {
				leftHandValue = seq.replaceheldleft;
				hash += leftHandValue - this.appearance[5] << 40;
			}

			if (seq.replaceheldright >= 0) {
				rightHandValue = seq.replaceheldright;
				hash += rightHandValue - this.appearance[3] << 48;
			}
		} else if (super.secondarySeqId >= 0) {
			primaryTransformId = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
		}

		Model model = (Model) modelCache.get(hash);
		if (model == null) {
			boolean needsModel = false;

			for (int slot = 0; slot < 12; slot++) {
				int value = this.appearance[slot];

				if (rightHandValue >= 0 && slot == 3) {
					value = rightHandValue;
				}

				if (leftHandValue >= 0 && slot == 5) {
					value = leftHandValue;
				}

				if (value >= 0x100 && value < 0x200 && !IdkType.types[value - 0x100].checkModel()) {
					needsModel = true;
				}

				if (value >= 0x200 && !ObjType.get(value - 0x200).checkWearModel(this.gender)) {
					needsModel = true;
				}
			}

			if (needsModel) {
				if (this.modelCacheKey != -1L) {
					model = (Model) modelCache.get(this.modelCacheKey);
				}

				if (model == null) {
					return null;
				}
			}
		}

		if (model == null) {
			Model[] models = new Model[12];
			int modelCount = 0;

			for (int i = 0; i < 12; i++) {
				int part = this.appearance[i];
				if (rightHandValue >= 0 && i == 3) {
					part = rightHandValue;
				}
				if (leftHandValue >= 0 && i == 5) {
					part = leftHandValue;
				}

				if (part >= 0x100 && part < 0x200) {
					Model idkModel = IdkType.types[part - 0x100].getModel();
					if (idkModel != null) {
						models[modelCount++] = idkModel;
					}
				}

				if (part >= 0x200) {
					Model objModel = ObjType.get(part - 0x200).getWearModel(this.gender);
					if (objModel != null) {
						models[modelCount++] = objModel;
					}
				}
			}

			model = new Model(modelCount, models);
			for (int i = 0; i < 5; i++) {
				if (this.colour[i] != 0) {
					model.recolour(Client.DESIGN_BODY_COLOUR[i][0], Client.DESIGN_BODY_COLOUR[i][this.colour[i]]);

					if (i == 1) {
						model.recolour(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.colour[i]]);
					}
				}
			}

			model.createLabelReferences();
			model.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(model, hash);
			this.modelCacheKey = hash;
		}

		if (this.lowMemory) {
			return model;
		}

		Model tmp = Model.empty;
		tmp.set(true, model);
		if (primaryTransformId != -1 && secondaryTransformId != -1) {
			tmp.applyTransforms(primaryTransformId, secondaryTransformId, SeqType.types[super.primarySeqId].walkmerge);
		} else if (primaryTransformId != -1) {
			tmp.applyTransform(primaryTransformId);
		}
		tmp.calculateBoundsCylinder();
		tmp.labelFaces = null;
		tmp.labelVertices = null;
		return tmp;
	}

	@ObfuscatedName("bb.d(I)Lfb;")
	public final Model getHeadModel() {
		if (!this.visible) {
			return null;
		}

		boolean needsModel = false;

		for (int i = 0; i < 12; i++) {
			int part = this.appearance[i];

			if (part >= 0x100 && part < 0x200 && !IdkType.types[part - 0x100].checkHead()) {
				needsModel = true;
			}

			if (part >= 0x200 && !ObjType.get(part - 0x200).checkHeadModel(this.gender)) {
				needsModel = true;
			}
		}

		if (needsModel) {
			return null;
		}

		Model[] models = new Model[12];
		int modelCount = 0;
		for (int i = 0; i < 12; i++) {
			int part = this.appearance[i];

			if (part >= 0x100 && part < 0x200) {
				Model idkModel = IdkType.types[part - 0x100].getHeadModel();
				if (idkModel != null) {
					models[modelCount++] = idkModel;
				}
			}

			if (part >= 0x200) {
				Model objModel = ObjType.get(part - 0x200).getHeadModel(this.gender);
				if (objModel != null) {
					models[modelCount++] = objModel;
				}
			}
		}

		Model tmp = new Model(modelCount, models);
		for (int i = 0; i < 5; i++) {
			if (this.colour[i] != 0) {
				tmp.recolour(Client.DESIGN_BODY_COLOUR[i][0], Client.DESIGN_BODY_COLOUR[i][this.colour[i]]);

				if (i == 1) {
					tmp.recolour(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.colour[i]]);
				}
			}
		}

		return tmp;
	}

	@ObfuscatedName("bb.a(B)Z")
	public final boolean isVisible() {
		return this.visible;
	}
}
