package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("bb")
public class ClientPlayer extends ClientEntity {

	@ObfuscatedName("bb.tb")
	public String name;

	@ObfuscatedName("bb.ub")
	public boolean ready = false;

	@ObfuscatedName("bb.vb")
	public int gender;

	@ObfuscatedName("bb.wb")
	public int headicon;

	@ObfuscatedName("bb.xb")
	public int[] appearance = new int[12];

	@ObfuscatedName("bb.yb")
	public int[] colour = new int[5];

	@ObfuscatedName("bb.zb")
	public int combatLevel;

	@ObfuscatedName("bb.Mb")
	public boolean lowMemory = false;

	@ObfuscatedName("bb.Nb")
	public long modelCacheKey = -1L;

	@ObfuscatedName("bb.Pb")
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
	public long baseId;

	@ObfuscatedName("bb.Hb")
	public Model locModel;

	@ObfuscatedName("bb.Ob")
	public NpcType transmog;

	@ObfuscatedName("bb.a(Lmb;Z)V")
	public void setAppearance(Packet arg0) {
		arg0.pos = 0;
		this.gender = arg0.g1();
		this.headicon = arg0.g1();
		this.transmog = null;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				this.appearance[var3] = 0;
			} else {
				int var5 = arg0.g1();
				this.appearance[var3] = (var4 << 8) + var5;
				if (var3 == 0 && this.appearance[0] == 65535) {
					this.transmog = NpcType.get(arg0.g2());
					break;
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= Client.recol1d[var6].length) {
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
		this.combatLevel = arg0.g1();
		this.ready = true;
		this.baseId = 0L;
		for (int var9 = 0; var9 < 12; var9++) {
			this.baseId <<= 0x4;
			if (this.appearance[var9] >= 256) {
				this.baseId += this.appearance[var9] - 256;
			}
		}
		if (this.appearance[0] >= 256) {
			this.baseId += this.appearance[0] - 256 >> 4;
		}
		if (this.appearance[1] >= 256) {
			this.baseId += this.appearance[1] - 256 >> 8;
		}
		for (int var10 = 0; var10 < 5; var10++) {
			this.baseId <<= 0x3;
			this.baseId += this.colour[var10];
		}
		this.baseId <<= 0x1;
		this.baseId += this.gender;
	}

	@ObfuscatedName("bb.a(I)Lfb;")
	public Model getTempModel() {
		if (!this.ready) {
			return null;
		}
		Model var2 = this.getTempModel2();
		if (var2 == null) {
			return null;
		}
		super.height = var2.minY;
		var2.useAABBMouseCheck = true;
		if (this.lowMemory) {
			return var2;
		}
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotAnimType var3 = SpotAnimType.list[super.spotanimId];
			Model var4 = var3.getTempModel();
			if (var4 != null) {
				Model var5 = new Model(AnimFrame.shareAlpha(super.spotanimFrame), false, true, var4);
				var5.translate(0, 0, -super.spotanimHeight);
				var5.prepareAnim();
				var5.animate(var3.seq.frames[super.spotanimFrame]);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var5.resize(var3.resizeh, var3.resizeh, var3.resizev);
				}
				var5.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(2, var6, true);
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
					var7.rotate90();
					var7.rotate90();
					var7.rotate90();
				} else if (super.dstYaw == 1024) {
					var7.rotate90();
					var7.rotate90();
				} else if (super.dstYaw == 1536) {
					var7.rotate90();
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model(2, var8, true);
				if (super.dstYaw == 512) {
					var7.rotate90();
				} else if (super.dstYaw == 1024) {
					var7.rotate90();
					var7.rotate90();
				} else if (super.dstYaw == 1536) {
					var7.rotate90();
					var7.rotate90();
					var7.rotate90();
				}
				var7.translate(super.x - this.locOffsetX, super.z - this.locOffsetZ, this.y - this.locOffsetY);
			}
		}
		var2.useAABBMouseCheck = true;
		return var2;
	}

	@ObfuscatedName("bb.c(I)Lfb;")
	public Model getTempModel2() {
		if (this.transmog != null) {
			int var2 = -1;
			if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
				var2 = SeqType.list[super.primarySeqId].frames[super.primarySeqFrame];
			} else if (super.secondarySeqId >= 0) {
				var2 = SeqType.list[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.transmog.getTempModel(var2, null, -1);
		}

		long var4 = this.baseId;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		int var9 = -1;
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			SeqType var10 = SeqType.list[super.primarySeqId];
			var6 = var10.frames[super.primarySeqFrame];
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.readyanim) {
				var7 = SeqType.list[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			if (var10.replaceheldleft >= 0) {
				var8 = var10.replaceheldleft;
				var4 += var8 - this.appearance[5] << 8;
			}
			if (var10.replaceheldright >= 0) {
				var9 = var10.replaceheldright;
				var4 += var9 - this.appearance[3] << 16;
			}
		} else if (super.secondarySeqId >= 0) {
			var6 = SeqType.list[super.secondarySeqId].frames[super.secondarySeqFrame];
		}
		Model var11 = (Model) modelCache.get(var4);
		if (var11 == null) {
			boolean var12 = false;
			for (int var13 = 0; var13 < 12; var13++) {
				int var14 = this.appearance[var13];
				if (var9 >= 0 && var13 == 3) {
					var14 = var9;
				}
				if (var8 >= 0 && var13 == 5) {
					var14 = var8;
				}
				if (var14 >= 256 && var14 < 512 && !IdkType.list[var14 - 256].checkModel()) {
					var12 = true;
				}
				if (var14 >= 512 && !ObjType.get(var14 - 512).checkWearModel(this.gender)) {
					var12 = true;
				}
			}
			if (var12) {
				if (this.modelCacheKey != -1L) {
					var11 = (Model) modelCache.get(this.modelCacheKey);
				}
				if (var11 == null) {
					return null;
				}
			}
		}
		if (var11 == null) {
			Model[] var15 = new Model[12];
			int var16 = 0;
			for (int var17 = 0; var17 < 12; var17++) {
				int var18 = this.appearance[var17];
				if (var9 >= 0 && var17 == 3) {
					var18 = var9;
				}
				if (var8 >= 0 && var17 == 5) {
					var18 = var8;
				}
				if (var18 >= 256 && var18 < 512) {
					Model var19 = IdkType.list[var18 - 256].getModelNoCheck();
					if (var19 != null) {
						var15[var16++] = var19;
					}
				}
				if (var18 >= 512) {
					Model var20 = ObjType.get(var18 - 512).getWearModelNoCheck(this.gender);
					if (var20 != null) {
						var15[var16++] = var20;
					}
				}
			}
			var11 = new Model(var15, var16);
			for (int var21 = 0; var21 < 5; var21++) {
				if (this.colour[var21] != 0) {
					var11.recolour(Client.recol1d[var21][0], Client.recol1d[var21][this.colour[var21]]);
					if (var21 == 1) {
						var11.recolour(Client.recol2d[0], Client.recol2d[this.colour[var21]]);
					}
				}
			}
			var11.prepareAnim();
			var11.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(var11, var4);
			this.modelCacheKey = var4;
		}
		if (this.lowMemory) {
			return var11;
		}
		Model var22 = Model.empty;
		var22.set(AnimFrame.shareAlpha(var6) & AnimFrame.shareAlpha(var7), var11);
		if (var6 != -1 && var7 != -1) {
			var22.maskAnimate(SeqType.list[super.primarySeqId].walkmerge, var6, var7);
		} else if (var6 != -1) {
			var22.animate(var6);
		}
		var22.calcBoundingCylinder();
		var22.labelFaces = null;
		var22.labelVertices = null;
		return var22;
	}

	@ObfuscatedName("bb.b(Z)Lfb;")
	public Model getHeadModel() {
		if (!this.ready) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = this.appearance[var3];
			if (var4 >= 256 && var4 < 512 && !IdkType.list[var4 - 256].checkHead()) {
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
		int var6 = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var8 = this.appearance[var7];
			if (var8 >= 256 && var8 < 512) {
				Model var9 = IdkType.list[var8 - 256].getHeadNoCheck();
				if (var9 != null) {
					var5[var6++] = var9;
				}
			}
			if (var8 >= 512) {
				Model var10 = ObjType.get(var8 - 512).getHeadModelNoCheck(this.gender);
				if (var10 != null) {
					var5[var6++] = var10;
				}
			}
		}
		Model var11 = new Model(var5, var6);
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.colour[var12] != 0) {
				var11.recolour(Client.recol1d[var12][0], Client.recol1d[var12][this.colour[var12]]);
				if (var12 == 1) {
					var11.recolour(Client.recol2d[0], Client.recol2d[this.colour[var12]]);
				}
			}
		}
		return var11;
	}

	@ObfuscatedName("bb.b(I)Z")
	public boolean isReady() {
		return this.ready;
	}
}
