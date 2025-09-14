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

	@ObfuscatedName("bb.tb")
	public String name;

	@ObfuscatedName("bb.ub")
	public boolean visible = false;

	@ObfuscatedName("bb.vb")
	public int gender;

	@ObfuscatedName("bb.wb")
	public int headicon;

	@ObfuscatedName("bb.xb")
	public int[] appearance = new int[12];

	@ObfuscatedName("bb.yb")
	public int[] colour = new int[5];

	@ObfuscatedName("bb.zb")
	public int vislevel;

	@ObfuscatedName("bb.Mb")
	public boolean lowMemory = false;

	@ObfuscatedName("bb.Nb")
	public long modelCacheKey = -1L;

	@ObfuscatedName("bb.Ob")
	public static LruCache modelCache = new LruCache(260);

	@ObfuscatedName("bb.Bb")
	public int y;

	@ObfuscatedName("bb.Cb")
	public int locStartCycle;

	@ObfuscatedName("bb.Db")
	public int locStopCycle;

	@ObfuscatedName("bb.Eb")
	public int locOffsetX;

	@ObfuscatedName("bb.Fb")
	public int locOffsetY;

	@ObfuscatedName("bb.Gb")
	public int locOffsetZ;

	@ObfuscatedName("bb.Ib")
	public int minTileX;

	@ObfuscatedName("bb.Jb")
	public int minTileZ;

	@ObfuscatedName("bb.Kb")
	public int maxTileX;

	@ObfuscatedName("bb.Lb")
	public int maxTileZ;

	@ObfuscatedName("bb.Ab")
	public long hash;

	@ObfuscatedName("bb.Hb")
	public Model locModel;

	@ObfuscatedName("bb.a(Lmb;I)V")
	public void read(Packet buf) {
		buf.pos = 0;

		this.gender = buf.g1();
		this.headicon = buf.g1();

		for (int i = 0; i < 12; i++) {
			int var4 = buf.g1();
			if (var4 == 0) {
				this.appearance[i] = 0;
			} else {
				int var5 = buf.g1();
				this.appearance[i] = (var4 << 8) + var5;
			}
		}

		for (int i = 0; i < 5; i++) {
			int var7 = buf.g1();
			if (var7 < 0 || var7 >= Client.DESIGN_BODY_COLOUR[i].length) {
				var7 = 0;
			}

			this.colour[i] = var7;
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
	public Model getModel() {
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

		if (this.locModel != null) {
			if (Client.loopCycle >= this.locStopCycle) {
				this.locModel = null;
			}

			if (Client.loopCycle >= this.locStartCycle && Client.loopCycle < this.locStopCycle) {
				Model locModel = this.locModel;

				locModel.offset(this.locOffsetX - super.x, this.locOffsetZ - super.z, this.locOffsetY - this.y);

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
				model = new Model(2, true, models);

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

				locModel.offset(super.x - this.locOffsetX, super.z - this.locOffsetZ, this.y - this.locOffsetY);
			}
		}

		model.picking = true;
		return model;
	}

	@ObfuscatedName("bb.a(Z)Lfb;")
	public Model getAnimatedModel() {
		long hash = this.hash;

		int primaryFrame = -1;
		int secondaryFrame = -1;
		int replaceHeldLeft = -1;
		int replaceHeldRight = -1;

		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			SeqType primarySeq = SeqType.types[super.primarySeqId];
			primaryFrame = primarySeq.frames[super.primarySeqFrame];

			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				secondaryFrame = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}

			if (primarySeq.replaceheldleft >= 0) {
				replaceHeldLeft = primarySeq.replaceheldleft;
				hash += replaceHeldLeft - this.appearance[5] << 8;
			}

			if (primarySeq.replaceheldright >= 0) {
				replaceHeldRight = primarySeq.replaceheldright;
				hash += replaceHeldRight - this.appearance[3] << 16;
			}
		} else if (super.secondarySeqId >= 0) {
			primaryFrame = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
		}

		Model model = (Model) modelCache.get(hash);
		if (model == null) {
			boolean notReady = false;

			for (int slot = 0; slot < 12; slot++) {
				int part = this.appearance[slot];

				if (replaceHeldRight >= 0 && slot == 3) {
					part = replaceHeldRight;
				} else if (replaceHeldLeft >= 0 && slot == 5) {
					part = replaceHeldLeft;
				}

				if (part >= 256 && part < 512 && !IdkType.types[part - 256].checkModel()) {
					notReady = true;
				} else if (part >= 512 && !ObjType.get(part - 512).checkWearModel(this.gender)) {
					notReady = true;
				}
			}

			if (notReady) {
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

			for (int slot = 0; slot < 12; slot++) {
				int part = this.appearance[slot];

				if (replaceHeldRight >= 0 && slot == 3) {
					part = replaceHeldRight;
				} else if (replaceHeldLeft >= 0 && slot == 5) {
					part = replaceHeldLeft;
				}

				if (part >= 256 && part < 512) {
					Model idkModel = IdkType.types[part - 256].getModel();
					if (idkModel != null) {
						models[modelCount++] = idkModel;
					}
				} else if (part >= 512) {
					Model objModel = ObjType.get(part - 512).getWearModel(this.gender);
					if (objModel != null) {
						models[modelCount++] = objModel;
					}
				}
			}

			model = new Model(models, modelCount);

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

		Model temp = Model.empty;
		temp.set(model, true);

		if (primaryFrame != -1 && secondaryFrame != -1) {
			temp.applyFrames(SeqType.types[super.primarySeqId].walkmerge, secondaryFrame, primaryFrame);
		} else if (primaryFrame != -1) {
			temp.applyFrame(primaryFrame);
		}

		temp.calculateBoundsCylinder();
		temp.labelFaces = null;
		temp.labelVertices = null;
		return temp;
	}

	@ObfuscatedName("bb.b(I)Lfb;")
	public Model getHeadModel() {
		if (!this.visible) {
			return null;
		}

		boolean notReady = false;
		for (int slot = 0; slot < 12; slot++) {
			int part = this.appearance[slot];

			if (part >= 256 && part < 512 && !IdkType.types[part - 256].checkHead()) {
				notReady = true;
			} else if (part >= 512 && !ObjType.get(part - 512).checkHeadModel(this.gender)) {
				notReady = true;
			}
		}

		if (notReady) {
			return null;
		}

		Model[] models = new Model[12];
		int modelCount = 0;

		for (int slot = 0; slot < 12; slot++) {
			int part = this.appearance[slot];

			if (part >= 256 && part < 512) {
				Model idkModel = IdkType.types[part - 256].getHeadModel();
				if (idkModel != null) {
					models[modelCount++] = idkModel;
				}
			} else if (part >= 512) {
				Model objModel = ObjType.get(part - 512).getHeadModel(this.gender);
				if (objModel != null) {
					models[modelCount++] = objModel;
				}
			}
		}

		Model temp = new Model(models, modelCount);

		for (int i = 0; i < 5; i++) {
			if (this.colour[i] != 0) {
				temp.recolour(Client.DESIGN_BODY_COLOUR[i][0], Client.DESIGN_BODY_COLOUR[i][this.colour[i]]);

				if (i == 1) {
					temp.recolour(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.colour[i]]);
				}
			}
		}

		return temp;
	}

	@ObfuscatedName("bb.b(B)Z")
	public boolean isVisible() {
		return this.visible;
	}
}
