package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.IdkType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("ab")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("ab.tb")
	public String name;

	@ObfuscatedName("ab.zb")
	public int combatLevel;

	@ObfuscatedName("ab.Ab")
	public int skillLevel;

	@ObfuscatedName("ab.Cb")
	public int y;

	@ObfuscatedName("ab.Db")
	public int locStartCycle;

	@ObfuscatedName("ab.Fb")
	public int locOffsetX;

	@ObfuscatedName("ab.Gb")
	public int locOffsetY;

	@ObfuscatedName("ab.Hb")
	public int locOffsetZ;

	@ObfuscatedName("ab.Ib")
	public Model locModel;

	@ObfuscatedName("ab.Qb")
	public int team;

	@ObfuscatedName("ab.ub")
	public boolean ready = false;

	@ObfuscatedName("ab.rb")
	public int field455;

	@ObfuscatedName("ab.sb")
	public final boolean field456 = false;

	@ObfuscatedName("ab.vb")
	public int gender;

	@ObfuscatedName("ab.wb")
	public int headicons;

	@ObfuscatedName("ab.xb")
	public final int[] appearance = new int[12];

	@ObfuscatedName("ab.yb")
	public final int[] colour = new int[5];

	@ObfuscatedName("ab.Rb")
	public static LruCache modelCache = new LruCache((byte) 7, 260);

	@ObfuscatedName("ab.Nb")
	public boolean field477 = false;

	@ObfuscatedName("ab.Ob")
	public long modelCacheKey = -1L;

	@ObfuscatedName("ab.Eb")
	public int locStopCycle;

	@ObfuscatedName("ab.Jb")
	public int field473;

	@ObfuscatedName("ab.Kb")
	public int field474;

	@ObfuscatedName("ab.Lb")
	public int field475;

	@ObfuscatedName("ab.Mb")
	public int field476;

	@ObfuscatedName("ab.Bb")
	public long baseId;

	@ObfuscatedName("ab.Pb")
	public NpcType transmog;

	@ObfuscatedName("ab.a(ZLlb;)V")
	public void setAppearance(Packet arg0) {
		arg0.pos = 0;
		gender = arg0.g1();
		headicons = arg0.g1();
		transmog = null;
		team = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				appearance[var2] = 0;
			} else {
				int var4 = arg0.g1();
				appearance[var2] = (var3 << 8) + var4;
				if (var2 == 0 && appearance[0] == 65535) {
					transmog = NpcType.list(arg0.g2());
					break;
				}
				if (appearance[var2] >= 512 && appearance[var2] - 512 < ObjType.numDefinitions) {
					int var5 = ObjType.list(appearance[var2] - 512).team;
					if (var5 != 0) {
						team = var5;
					}
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= Client.recol1d[var6].length) {
				var7 = 0;
			}
			colour[var6] = var7;
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
		name = JString.toSentenceCase(JString.toRawUsername(arg0.g8()));
		combatLevel = arg0.g1();
		skillLevel = arg0.g2();
		ready = true;
		baseId = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			baseId <<= 0x4;
			if (appearance[var8] >= 256) {
				baseId += appearance[var8] - 256;
			}
		}
		if (appearance[0] >= 256) {
			baseId += appearance[0] - 256 >> 4;
		}
		if (appearance[1] >= 256) {
			baseId += appearance[1] - 256 >> 8;
		}
		for (int var9 = 0; var9 < 5; var9++) {
			baseId <<= 0x3;
			baseId += colour[var9];
		}
		baseId <<= 0x1;
		baseId += gender;
	}

	@ObfuscatedName("ab.a(I)Leb;")
	@Override
	public Model getTempModel() {
		if (!ready) {
			return null;
		}
		Model var1 = getTempModel2();
		if (var1 == null) {
			return null;
		}
		super.height = var1.minY;
		var1.useAABBMouseCheck = true;
		if (field477) {
			return var1;
		}
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotType var2 = SpotType.list[super.spotanimId];
			Model var3 = var2.getTempModel2();
			if (var3 != null) {
				Model var4 = new Model(var3, AnimFrame.animateTransparencies(super.spotanimFrame), false, field455, true);
				var4.translate(-super.spotanimHeight, 0, 0);
				var4.prepareAnim();
				var4.animate(var2.seq.frames[super.spotanimFrame]);
				var4.labelFaces = null;
				var4.labelVertices = null;
				if (var2.resizeh != 128 || var2.resizev != 128) {
					var4.resize(var2.resizeh, var2.resizeh, var2.resizev);
				}
				var4.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var5 = new Model[] { var1, var4 };
				var1 = new Model(true, 0, var5, 2);
			}
		}
		if (locModel != null) {
			if (Client.loopCycle >= locStopCycle) {
				locModel = null;
			}
			if (Client.loopCycle >= locStartCycle && Client.loopCycle < locStopCycle) {
				Model var6 = locModel;
				var6.translate(locOffsetY - y, locOffsetX - super.x, locOffsetZ - super.z);
				if (super.dstYaw == 512) {
					var6.rotate90();
					var6.rotate90();
					var6.rotate90();
				} else if (super.dstYaw == 1024) {
					var6.rotate90();
					var6.rotate90();
				} else if (super.dstYaw == 1536) {
					var6.rotate90();
				}
				Model[] var7 = new Model[] { var1, var6 };
				var1 = new Model(true, 0, var7, 2);
				if (super.dstYaw == 512) {
					var6.rotate90();
				} else if (super.dstYaw == 1024) {
					var6.rotate90();
					var6.rotate90();
				} else if (super.dstYaw == 1536) {
					var6.rotate90();
					var6.rotate90();
					var6.rotate90();
				}
				var6.translate(y - locOffsetY, super.x - locOffsetX, super.z - locOffsetZ);
			}
		}
		var1.useAABBMouseCheck = true;
		return var1;
	}

	@ObfuscatedName("ab.c(Z)Leb;")
	public Model getTempModel2() {
		if (transmog == null) {
			long var3 = baseId;
			int var5 = -1;
			int var6 = -1;
			int var7 = -1;
			int var8 = -1;
			if (super.primaryAnim >= 0 && super.primaryAnimDelay == 0) {
				SeqType var9 = SeqType.list[super.primaryAnim];
				var5 = var9.frames[super.primaryFrame];
				if (super.secondaryAnim >= 0 && super.secondaryAnim != super.readyanim) {
					var6 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
				}
				if (var9.replaceheldleft >= 0) {
					var7 = var9.replaceheldleft;
					var3 += var7 - appearance[5] << 8;
				}
				if (var9.replaceheldright >= 0) {
					var8 = var9.replaceheldright;
					var3 += var8 - appearance[3] << 16;
				}
			} else if (super.secondaryAnim >= 0) {
				var5 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
			}
			Model var10 = (Model) modelCache.find(var3);
			if (var10 == null) {
				boolean var11 = false;
				for (int var12 = 0; var12 < 12; var12++) {
					int var13 = appearance[var12];
					if (var8 >= 0 && var12 == 3) {
						var13 = var8;
					}
					if (var7 >= 0 && var12 == 5) {
						var13 = var7;
					}
					if (var13 >= 256 && var13 < 512 && !IdkType.list[var13 - 256].checkModel()) {
						var11 = true;
					}
					if (var13 >= 512 && !ObjType.list(var13 - 512).checkWearModel(gender)) {
						var11 = true;
					}
				}
				if (var11) {
					if (modelCacheKey != -1L) {
						var10 = (Model) modelCache.find(modelCacheKey);
					}
					if (var10 == null) {
						return null;
					}
				}
			}
			if (var10 == null) {
				Model[] var14 = new Model[12];
				int var15 = 0;
				for (int var16 = 0; var16 < 12; var16++) {
					int var17 = appearance[var16];
					if (var8 >= 0 && var16 == 3) {
						var17 = var8;
					}
					if (var7 >= 0 && var16 == 5) {
						var17 = var7;
					}
					if (var17 >= 256 && var17 < 512) {
						Model var18 = IdkType.list[var17 - 256].getModelNoCheck();
						if (var18 != null) {
							var14[var15++] = var18;
						}
					}
					if (var17 >= 512) {
						Model var19 = ObjType.list(var17 - 512).getWearModelNoCheck(gender);
						if (var19 != null) {
							var14[var15++] = var19;
						}
					}
				}
				var10 = new Model(var14, var15, -33019);
				for (int var20 = 0; var20 < 5; var20++) {
					if (colour[var20] != 0) {
						var10.recolour(Client.recol1d[var20][0], Client.recol1d[var20][colour[var20]]);
						if (var20 == 1) {
							var10.recolour(Client.recol2d[0], Client.recol2d[colour[var20]]);
						}
					}
				}
				var10.prepareAnim();
				var10.calculateNormals(64, 850, -30, -50, -30, true);
				modelCache.put(var3, var10);
				modelCacheKey = var3;
			}
			if (field477) {
				return var10;
			}
			Model var21 = Model.tempModel;
			var21.set(AnimFrame.animateTransparencies(var5) & AnimFrame.animateTransparencies(var6), var10);
			if (var5 != -1 && var6 != -1) {
				var21.maskAnimate(var5, var6, SeqType.list[super.primaryAnim].walkmerge);
			} else if (var5 != -1) {
				var21.animate(var5);
			}
			var21.calcBoundingCylinder();
			var21.labelFaces = null;
			var21.labelVertices = null;
			return var21;
		}
		int var1 = -1;
		if (super.primaryAnim >= 0 && super.primaryAnimDelay == 0) {
			var1 = SeqType.list[super.primaryAnim].frames[super.primaryFrame];
		} else if (super.secondaryAnim >= 0) {
			var1 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
		}
		return transmog.getTempModel(-1, var1, null);
	}

	@ObfuscatedName("ab.d(Z)Leb;")
	public Model getHeadModel() {
		if (!ready) {
			return null;
		} else if (transmog == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = appearance[var2];
				if (var3 >= 256 && var3 < 512 && !IdkType.list[var3 - 256].checkHead()) {
					var1 = true;
				}
				if (var3 >= 512 && !ObjType.list(var3 - 512).checkHeadModel(gender)) {
					var1 = true;
				}
			}
			if (var1) {
				return null;
			}
			Model[] var4 = new Model[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = appearance[var6];
				if (var7 >= 256 && var7 < 512) {
					Model var8 = IdkType.list[var7 - 256].getHeadNoCheck();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}
				if (var7 >= 512) {
					Model var9 = ObjType.list(var7 - 512).getHeadModelNoCheck(gender);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}
			Model var10 = new Model(var4, var5, -33019);
			for (int var11 = 0; var11 < 5; var11++) {
				if (colour[var11] != 0) {
					var10.recolour(Client.recol1d[var11][0], Client.recol1d[var11][colour[var11]]);
					if (var11 == 1) {
						var10.recolour(Client.recol2d[0], Client.recol2d[colour[var11]]);
					}
				}
			}
			return var10;
		} else {
			return transmog.getHeadModel();
		}
	}

	@ObfuscatedName("ab.b(Z)Z")
	@Override
	public boolean isReady() {
		return ready;
	}
}
