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
	public final void read(Packet arg0) {
		arg0.pos = 0;
		this.gender = arg0.g1();
		this.headicon = arg0.g1();
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				this.appearance[var3] = 0;
			} else {
				int var5 = arg0.g1();
				this.appearance[var3] = (var4 << 8) + var5;
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= Client.DESIGN_BODY_COLOUR[var6].length) {
				var7 = 0;
			}
			this.colour[var6] = var7;
		}
		super.readyanim = arg0.g2();
		if (super.readyanim == 65535) {
			super.readyanim = -1;
		}
		super.turnanim = arg0.g2();
		if (super.turnanim == 65535) {
			super.turnanim = -1;
		}
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
		this.name = JString.formatDisplayName(JString.fromBase37(arg0.g8()));
		this.vislevel = arg0.g1();
		this.visible = true;
		this.hash = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			this.hash <<= 0x4;
			if (this.appearance[var8] >= 256) {
				this.hash += this.appearance[var8] - 256;
			}
		}
		if (this.appearance[0] >= 256) {
			this.hash += this.appearance[0] - 256 >> 4;
		}
		if (this.appearance[1] >= 256) {
			this.hash += this.appearance[1] - 256 >> 8;
		}
		for (int var9 = 0; var9 < 5; var9++) {
			this.hash <<= 0x3;
			this.hash += this.colour[var9];
		}
		this.hash <<= 0x1;
		this.hash += this.gender;
	}

	@ObfuscatedName("bb.a(I)Lfb;")
	public final Model getModel() {
		if (!this.visible) {
			return null;
		}
		Model var2 = this.getAnimatedModel();
		if (var2 == null) {
			return null;
		}
		super.height = var2.minY;
		var2.picking = true;
		if (this.lowMemory) {
			return var2;
		}
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
		if (this.locModel != null) {
			if (Client.loopCycle >= this.locStopCycle) {
				this.locModel = null;
			}
			if (Client.loopCycle >= this.locStartCycle && Client.loopCycle < this.locStopCycle) {
				Model var7 = this.locModel;
				var7.translate(this.locOffsetX - super.x, this.locOffsetZ - super.z, this.locOffsetY - this.y);
				if (super.dstYaw == 512) {
					var7.rotateY90();
					var7.rotateY90();
					var7.rotateY90();
				} else if (super.dstYaw == 1024) {
					var7.rotateY90();
					var7.rotateY90();
				} else if (super.dstYaw == 1536) {
					var7.rotateY90();
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model(2, true, var8);
				if (super.dstYaw == 512) {
					var7.rotateY90();
				} else if (super.dstYaw == 1024) {
					var7.rotateY90();
					var7.rotateY90();
				} else if (super.dstYaw == 1536) {
					var7.rotateY90();
					var7.rotateY90();
					var7.rotateY90();
				}
				var7.translate(super.x - this.locOffsetX, super.z - this.locOffsetZ, this.y - this.locOffsetY);
			}
		}
		var2.picking = true;
		return var2;
	}

	@ObfuscatedName("bb.a(Z)Lfb;")
	public final Model getAnimatedModel() {
		long var2 = this.hash;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			SeqType var8 = SeqType.types[super.primarySeqId];
			var4 = var8.frames[super.primarySeqFrame];
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				var5 = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			if (var8.replaceheldleft >= 0) {
				var6 = var8.replaceheldleft;
				var2 += var6 - this.appearance[5] << 8;
			}
			if (var8.replaceheldright >= 0) {
				var7 = var8.replaceheldright;
				var2 += var7 - this.appearance[3] << 16;
			}
		} else if (super.secondarySeqId >= 0) {
			var4 = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
		}
		Model var9 = (Model) modelCache.get(var2);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = this.appearance[var11];
				if (var7 >= 0 && var11 == 3) {
					var12 = var7;
				}
				if (var6 >= 0 && var11 == 5) {
					var12 = var6;
				}
				if (var12 >= 256 && var12 < 512 && !IdkType.types[var12 - 256].checkModel()) {
					var10 = true;
				}
				if (var12 >= 512 && !ObjType.get(var12 - 512).checkWearModel(this.gender)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.modelCacheKey != -1L) {
					var9 = (Model) modelCache.get(this.modelCacheKey);
				}
				if (var9 == null) {
					return null;
				}
			}
		}
		if (var9 == null) {
			Model[] var13 = new Model[12];
			int var14 = 0;
			for (int var15 = 0; var15 < 12; var15++) {
				int var16 = this.appearance[var15];
				if (var7 >= 0 && var15 == 3) {
					var16 = var7;
				}
				if (var6 >= 0 && var15 == 5) {
					var16 = var6;
				}
				if (var16 >= 256 && var16 < 512) {
					Model var17 = IdkType.types[var16 - 256].getModel();
					if (var17 != null) {
						var13[var14++] = var17;
					}
				}
				if (var16 >= 512) {
					Model var18 = ObjType.get(var16 - 512).getWearModel(this.gender);
					if (var18 != null) {
						var13[var14++] = var18;
					}
				}
			}
			var9 = new Model(var13, var14);
			for (int var19 = 0; var19 < 5; var19++) {
				if (this.colour[var19] != 0) {
					var9.recolour(Client.DESIGN_BODY_COLOUR[var19][0], Client.DESIGN_BODY_COLOUR[var19][this.colour[var19]]);
					if (var19 == 1) {
						var9.recolour(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.colour[var19]]);
					}
				}
			}
			var9.createLabelReferences();
			var9.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(var9, var2);
			this.modelCacheKey = var2;
		}
		if (this.lowMemory) {
			return var9;
		}
		Model var20 = Model.empty;
		var20.set(var9, true);
		if (var4 != -1 && var5 != -1) {
			var20.applyTransforms(SeqType.types[super.primarySeqId].walkmerge, var5, var4);
		} else if (var4 != -1) {
			var20.applyTransform(var4);
		}
		var20.calculateBoundsCylinder();
		var20.labelFaces = null;
		var20.labelVertices = null;
		return var20;
	}

	@ObfuscatedName("bb.b(I)Lfb;")
	public final Model getHeadModel() {
		if (!this.visible) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = this.appearance[var3];
			if (var4 >= 256 && var4 < 512 && !IdkType.types[var4 - 256].checkHead()) {
				var2 = true;
			}
			if (var4 >= 512 && !ObjType.get(var4 - 512).checkHeadModel(this.gender)) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var5 = new Model[12];
		int var7 = 0;
		for (int var8 = 0; var8 < 12; var8++) {
			int var9 = this.appearance[var8];
			if (var9 >= 256 && var9 < 512) {
				Model var10 = IdkType.types[var9 - 256].getHeadModel();
				if (var10 != null) {
					var5[var7++] = var10;
				}
			}
			if (var9 >= 512) {
				Model var11 = ObjType.get(var9 - 512).getHeadModel(this.gender);
				if (var11 != null) {
					var5[var7++] = var11;
				}
			}
		}
		Model var12 = new Model(var5, var7);
		for (int var13 = 0; var13 < 5; var13++) {
			if (this.colour[var13] != 0) {
				var12.recolour(Client.DESIGN_BODY_COLOUR[var13][0], Client.DESIGN_BODY_COLOUR[var13][this.colour[var13]]);
				if (var13 == 1) {
					var12.recolour(Client.DESIGN_HAIR_COLOUR[0], Client.DESIGN_HAIR_COLOUR[this.colour[var13]]);
				}
			}
		}
		return var12;
	}

	@ObfuscatedName("bb.b(B)Z")
	public final boolean isVisible() {
		return this.visible;
	}
}
