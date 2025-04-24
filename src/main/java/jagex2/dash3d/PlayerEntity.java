package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.client;
import jagex2.config.IdkType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Packet;

@ObfuscatedName("bb")
public class PlayerEntity extends PathingEntity {

	@ObfuscatedName("bb.sb")
	public String name;

	@ObfuscatedName("bb.tb")
	public boolean visible = false;

	@ObfuscatedName("bb.ub")
	public int gender;

	@ObfuscatedName("bb.vb")
	public int headicon;

	@ObfuscatedName("bb.wb")
	public int[] appearances = new int[12];

	@ObfuscatedName("bb.xb")
	public int[] colours = new int[5];

	@ObfuscatedName("bb.yb")
	public int combatLevel;

	@ObfuscatedName("bb.zb")
	public long appearanceHashcode;

	@ObfuscatedName("bb.Lb")
	public boolean lowMemory = false;

	@ObfuscatedName("bb.Mb")
	public long modelUid = -1L;

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
	public final void read(Packet arg0) {
		arg0.pos = 0;
		this.gender = arg0.g1();
		this.headicon = arg0.g1();
		for (int var3 = 0; var3 < 12; var3++) {
			int var8 = arg0.g1();
			if (var8 == 0) {
				this.appearances[var3] = 0;
			} else {
				int var9 = arg0.g1();
				this.appearances[var3] = (var8 << 8) + var9;
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= client.DESIGN_BODY_COLOUR[var4].length) {
				var7 = 0;
			}
			this.colours[var4] = var7;
		}
		super.seqStandId = arg0.g2();
		if (super.seqStandId == 65535) {
			super.seqStandId = -1;
		}
		super.seqTurnId = arg0.g2();
		if (super.seqTurnId == 65535) {
			super.seqTurnId = -1;
		}
		super.seqWalkId = arg0.g2();
		if (super.seqWalkId == 65535) {
			super.seqWalkId = -1;
		}
		super.seqTurnAroundId = arg0.g2();
		if (super.seqTurnAroundId == 65535) {
			super.seqTurnAroundId = -1;
		}
		super.seqTurnLeftId = arg0.g2();
		if (super.seqTurnLeftId == 65535) {
			super.seqTurnLeftId = -1;
		}
		super.seqTurnRightId = arg0.g2();
		if (super.seqTurnRightId == 65535) {
			super.seqTurnRightId = -1;
		}
		super.seqRunId = arg0.g2();
		if (super.seqRunId == 65535) {
			super.seqRunId = -1;
		}
		this.name = JString.formatName(JString.fromBase37(arg0.g8()));
		this.combatLevel = arg0.g1();
		this.visible = true;
		this.appearanceHashcode = 0L;
		for (int var5 = 0; var5 < 12; var5++) {
			this.appearanceHashcode <<= 0x4;
			if (this.appearances[var5] >= 256) {
				this.appearanceHashcode += this.appearances[var5] - 256;
			}
		}
		if (this.appearances[0] >= 256) {
			this.appearanceHashcode += this.appearances[0] - 256 >> 4;
		}
		if (this.appearances[1] >= 256) {
			this.appearanceHashcode += this.appearances[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.appearanceHashcode <<= 0x3;
			this.appearanceHashcode += this.colours[var6];
		}
		this.appearanceHashcode <<= 0x1;
		this.appearanceHashcode += this.gender;
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
				Model var5 = new Model(var4, true, false, !var3.animHasAlpha);
				var5.translate(-super.spotanimHeight, 0, 0);
				var5.createLabelReferences(-591);
				var5.applyTransform(var3.seq.frames[super.spotanimFrame]);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var5.scale(var3.resizev, var3.resizeh, var3.resizeh);
				}
				var5.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(true, 2, var6);
			}
		}
		if (this.locModel != null) {
			if (client.loopCycle >= this.locStopCycle) {
				this.locModel = null;
			}
			if (client.loopCycle >= this.locStartCycle && client.loopCycle < this.locStopCycle) {
				Model var7 = this.locModel;
				var7.translate(this.locOffsetY - this.y, this.locOffsetX - super.x, this.locOffsetZ - super.z);
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
				var2 = new Model(true, 2, var8);
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
				var7.translate(this.y - this.locOffsetY, super.x - this.locOffsetX, super.z - this.locOffsetZ);
			}
		}
		var2.picking = true;
		return var2;
	}

	@ObfuscatedName("bb.c(I)Lfb;")
	public final Model getAnimatedModel() {
		long var2 = this.appearanceHashcode;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			SeqType var8 = SeqType.types[super.primarySeqId];
			var4 = var8.frames[super.primarySeqFrame];
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.seqStandId) {
				var5 = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			if (var8.righthand >= 0) {
				var6 = var8.righthand;
				var2 += var6 - this.appearances[5] << 40;
			}
			if (var8.lefthand >= 0) {
				var7 = var8.lefthand;
				var2 += var7 - this.appearances[3] << 48;
			}
		} else if (super.secondarySeqId >= 0) {
			var4 = SeqType.types[super.secondarySeqId].frames[super.secondarySeqFrame];
		}
		Model var9 = (Model) modelCache.get(var2);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = this.appearances[var11];
				if (var7 >= 0 && var11 == 3) {
					var12 = var7;
				}
				if (var6 >= 0 && var11 == 5) {
					var12 = var6;
				}
				if (var12 >= 256 && var12 < 512 && !IdkType.types[var12 - 256].validate()) {
					var10 = true;
				}
				if (var12 >= 512 && !ObjType.get(var12 - 512).validateWornModel(this.gender)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.modelUid != -1L) {
					var9 = (Model) modelCache.get(this.modelUid);
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
				int var17 = this.appearances[var15];
				if (var7 >= 0 && var15 == 3) {
					var17 = var7;
				}
				if (var6 >= 0 && var15 == 5) {
					var17 = var6;
				}
				if (var17 >= 256 && var17 < 512) {
					Model var18 = IdkType.types[var17 - 256].getModel();
					if (var18 != null) {
						var13[var14++] = var18;
					}
				}
				if (var17 >= 512) {
					Model var19 = ObjType.get(var17 - 512).getWornModel(this.gender);
					if (var19 != null) {
						var13[var14++] = var19;
					}
				}
			}
			var9 = new Model(var14, var13);
			for (int var16 = 0; var16 < 5; var16++) {
				if (this.colours[var16] != 0) {
					var9.recolour(client.DESIGN_BODY_COLOUR[var16][0], client.DESIGN_BODY_COLOUR[var16][this.colours[var16]]);
					if (var16 == 1) {
						var9.recolour(client.DESIGN_HAIR_COLOUR[0], client.DESIGN_HAIR_COLOUR[this.colours[var16]]);
					}
				}
			}
			var9.createLabelReferences(-591);
			var9.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(var9, var2);
			this.modelUid = var2;
		}
		if (this.lowMemory) {
			return var9;
		}
		Model var20 = Model.empty;
		var20.set(true, var9);
		if (var4 != -1 && var5 != -1) {
			var20.applyTransforms(var4, var5, SeqType.types[super.primarySeqId].walkmerge);
		} else if (var4 != -1) {
			var20.applyTransform(var4);
		}
		var20.calculateBoundsCylinder();
		var20.labelFaces = null;
		var20.labelVertices = null;
		return var20;
	}

	@ObfuscatedName("bb.d(I)Lfb;")
	public final Model getHeadModel() {
		if (!this.visible) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < 12; var3++) {
			int var13 = this.appearances[var3];
			if (var13 >= 256 && var13 < 512 && !IdkType.types[var13 - 256].validateHeadModel()) {
				var2 = true;
			}
			if (var13 >= 512 && !ObjType.get(var13 - 512).validateHeadModel(this.gender)) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var4 = new Model[12];
		int var6 = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var10 = this.appearances[var7];
			if (var10 >= 256 && var10 < 512) {
				Model var11 = IdkType.types[var10 - 256].getHeadModel();
				if (var11 != null) {
					var4[var6++] = var11;
				}
			}
			if (var10 >= 512) {
				Model var12 = ObjType.get(var10 - 512).getHeadModel(this.gender);
				if (var12 != null) {
					var4[var6++] = var12;
				}
			}
		}
		Model var8 = new Model(var6, var4);
		for (int var9 = 0; var9 < 5; var9++) {
			if (this.colours[var9] != 0) {
				var8.recolour(client.DESIGN_BODY_COLOUR[var9][0], client.DESIGN_BODY_COLOUR[var9][this.colours[var9]]);
				if (var9 == 1) {
					var8.recolour(client.DESIGN_HAIR_COLOUR[0], client.DESIGN_HAIR_COLOUR[this.colours[var9]]);
				}
			}
		}
		return var8;
	}

	@ObfuscatedName("bb.a(B)Z")
	public final boolean isVisible() {
		return this.visible;
	}
}
