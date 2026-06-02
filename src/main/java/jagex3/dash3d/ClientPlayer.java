package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.Client;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

@ObfuscatedName("dj")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("jj.x")
	public static final ModelSourceCache field1956 = new ModelSourceCache(4);
	@ObfuscatedName("dj.bc")
	public short field761 = 0;

	@ObfuscatedName("dj.cc")
	public int locEndCycle = 0;

	@ObfuscatedName("dj.ec")
	public int minTileX;

	@ObfuscatedName("dj.ic")
	public PlayerModel model;

	@ObfuscatedName("dj.jc")
	public short field769 = 0;

	@ObfuscatedName("dj.nc")
	public int locOffsetX;

	@ObfuscatedName("dj.Qb")
	public int headiconPrayer = -1;

	@ObfuscatedName("dj.Nb")
	public int combatLevel = 0;

	@ObfuscatedName("dj.Sb")
	public int team = 0;

	@ObfuscatedName("dj.Pb")
	public int skillLevel = 0;

	@ObfuscatedName("dj.Jb")
	public boolean lowMem = false;

	@ObfuscatedName("dj.Vb")
	public int locStartCycle = 0;

	@ObfuscatedName("dj.Wb")
	public int headiconPk = -1;

	@ObfuscatedName("dj.Hb")
	public int minTileZ;

	@ObfuscatedName("dj.Kb")
	public int maxTileX;

	@ObfuscatedName("dj.Lb")
	public int maxTileZ;

	@ObfuscatedName("dj.Xb")
	public int locOffsetZ;

	@ObfuscatedName("dj.Zb")
	public int locOffsetY;

	@ObfuscatedName("dj.Yb")
	public ModelLit locModel;

	@ObfuscatedName("dj.gc")
	public JagString name;

	@ObfuscatedName("md.a(Lcg;IIIIII)Lcg;")
	public static ModelLit method897(ModelLit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg3;
		ModelLit var8 = (ModelLit) field1956.find(var6);
		if (var8 == null) {
			ModelUnlit var9 = ModelUnlit.load(Client.models, arg3);
			if (var9 == null) {
				return null;
			}
			var8 = var9.light(64, 768, -50, -10, -50);
			field1956.put(var6, var8);
		}
		int var10 = arg0.method194();
		int var11 = arg0.method196();
		int var12 = arg0.method186();
		int var13 = arg0.method198();
		ModelLit var14 = var8.copyForAnim2(true, true);
		if (arg4 != 0) {
			var14.method188(arg4);
		}
		SoftwareModelLit var15 = (SoftwareModelLit) var14;
		if (arg5 != Client.getAvH(var10 + arg2, arg1 + var12, Client.minusedlevel) || Client.getAvH(var11 + arg2, var13 + arg1, Client.minusedlevel) != arg5) {
			for (int var16 = 0; var16 < var15.numPoints; var16++) {
				var15.pointY[var16] += Client.getAvH(arg2 + var15.pointX[var16], var15.pointZ[var16] - -arg1, Client.minusedlevel) - arg5;
			}
			var15.boundsCalculated = false;
		}
		return var14;
	}

	@ObfuscatedName("dj.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		if (this.model == null) {
			return;
		}
		SeqType var11 = super.primarySeqId != -1 && super.primarySeqDelay == 0 ? SeqType.list(super.primarySeqId) : null;
		SeqType var12 = super.secondarySeqId == -1 || this.lowMem || super.secondarySeqId == super.readyanim && var11 != null ? null : SeqType.list(super.secondarySeqId);
		ModelLit var13 = this.model.getTempModel(var12, super.primarySeqFrame, super.secondarySeqFrame, var11);
		if (var13 == null) {
			return;
		}
		super.height = var13.method88();
		if (Client.localPlayer == this) {
			for (int var14 = Client.field1171.length - 1; var14 >= 0; var14--) {
				HintArrow var15 = Client.field1171[var14];
				if (var15 != null && var15.field2136 != -1) {
					if (var15.hintType == 1 && var15.hintTarget >= 0 && Client.npc.length > var15.hintTarget) {
						ClientNpc var16 = Client.npc[var15.hintTarget];
						if (var16 != null) {
							int var17 = var16.x / 32 - Client.localPlayer.x / 32;
							int var18 = var16.z / 32 - Client.localPlayer.z / 32;
							this.method286(arg2, arg3, arg7, arg1, arg5, arg0, var18, arg4, var15.field2136, var13, arg6, var17);
						}
					}
					if (var15.hintType == 2) {
						int var19 = (var15.hintTileX - Client.mapBuildBaseX) * 4 + 2 - Client.localPlayer.x / 32;
						int var20 = (var15.hintTileZ - Client.mapBuildBaseZ) * 4 + 2 - Client.localPlayer.z / 32;
						this.method286(arg2, arg3, arg7, arg1, arg5, arg0, var20, arg4, var15.field2136, var13, arg6, var19);
					}
					if (var15.hintType == 10 && var15.hintTarget >= 0 && var15.hintTarget < Client.players.length) {
						ClientPlayer var21 = Client.players[var15.hintTarget];
						if (var21 != null) {
							int var22 = var21.x / 32 - Client.localPlayer.x / 32;
							int var23 = var21.z / 32 - Client.localPlayer.z / 32;
							this.method286(arg2, arg3, arg7, arg1, arg5, arg0, var23, arg4, var15.field2136, var13, arg6, var22);
						}
					}
				}
			}
		}
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		if (this.field769 != 0 && this.field761 != 0) {
			int var27 = Pix3D.sinTable[arg0];
			short var28 = this.field769;
			int var29 = Pix3D.cosTable[arg0];
			short var30 = this.field761;
			int var31 = -var28 / 2;
			int var32 = -var30 / 2;
			int var33 = var28 / 2;
			int var34 = var27 * var32 + var31 * var29 >> 16;
			int var35 = var32 * var29 - var27 * var31 >> 16;
			int var36 = Client.getAvH(var34 + super.x, super.z + var35, Client.minusedlevel);
			int var37 = -var30 / 2;
			int var38 = var33 * var29 + var27 * var37 >> 16;
			int var39 = var37 * var29 - var33 * var27 >> 16;
			int var40 = Client.getAvH(super.x + var38, var39 + super.z, Client.minusedlevel);
			int var41 = var30 / 2;
			int var42 = -var28 / 2;
			int var43 = var29 * var41 - var27 * var42 >> 16;
			int var44 = var29 * var42 + var27 * var41 >> 16;
			int var45 = Client.getAvH(super.x + var44, super.z + var43, Client.minusedlevel);
			int var46 = var28 / 2;
			int var47 = var30 / 2;
			int var48 = var29 * var47 - var27 * var46 >> 16;
			int var49 = var29 * var46 + var27 * var47 >> 16;
			int var50 = Client.getAvH(var49 + super.x, super.z + var48, Client.minusedlevel);
			int var51 = var36 + var50;
			if (var40 + var45 < var51) {
				var51 = var45 + var40;
			}
			int var52 = var40 <= var36 ? var40 : var36;
			int var53 = var50 <= var45 ? var50 : var45;
			var24 = (int) (Math.atan2((double) (var52 - var53), (double) var30) * 325.95D) & 0x7FF;
			if (var24 != 0) {
				var13.rotateXAxis(var24);
			}
			int var54 = var50 <= var40 ? var50 : var40;
			int var55 = var45 <= var36 ? var45 : var36;
			var25 = (int) (Math.atan2((double) (var55 - var54), (double) var28) * 325.95D) & 0x7FF;
			if (var25 != 0) {
				var13.method191(var25);
			}
			var26 = (var51 >> 1) - super.y;
			if (var26 != 0) {
				var13.translate(0, var26, 0);
			}
		}
		ModelLit var56 = null;
		if (!this.lowMem && super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotType var57 = SpotType.list(super.spotanimId);
			var56 = var57.getTempModel2(super.spotanimFrame);
			if (var56 != null) {
				var56.translate(0, -super.spotanimHeight, 0);
				if (var57.hillskew) {
					if (var24 != 0) {
						var56.rotateXAxis(var24);
					}
					if (var25 != 0) {
						var56.method191(var25);
					}
					if (var26 != 0) {
						var56.translate(0, var26, 0);
					}
				}
			}
		}
		ModelLit var58 = null;
		if (!this.lowMem && this.locModel != null) {
			if (this.locEndCycle <= Client.loopCycle) {
				this.locModel = null;
			}
			if (this.locStartCycle <= Client.loopCycle && this.locEndCycle > Client.loopCycle) {
				var58 = this.locModel;
				var58.translate(this.locOffsetX - super.x, this.locOffsetY + -super.y, this.locOffsetZ - super.z);
				if (super.dstYaw == 512) {
					var58.rotate270();
				} else if (super.dstYaw == 1024) {
					var58.rotate180();
				} else if (super.dstYaw == 1536) {
					var58.rotate90();
				}
			}
		}
		if (var56 != null) {
			var13 = ((SoftwareModelLit) var13).method850(var56);
		}
		if (var58 != null) {
			var13 = ((SoftwareModelLit) var13).method850(var58);
		}
		var13.useAABBMouseCheck = true;
		var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (var58 == null) {
			return;
		}
		if (super.dstYaw == 512) {
			var58.rotate90();
		} else if (super.dstYaw == 1024) {
			var58.rotate180();
		} else if (super.dstYaw == 1536) {
			var58.rotate270();
		}
		var58.translate(super.x - this.locOffsetX, -this.locOffsetY + super.y, super.z - this.locOffsetZ);
	}

	@ObfuscatedName("dj.b()I")
	@Override
	public int method88() {
		return super.height;
	}

	@ObfuscatedName("dj.a(Lea;Z)V")
	public void setAppearance(Packet arg0) {
		arg0.pos = 0;
		int var2 = arg0.g1();
		if ((var2 & 0x2) == 2) {
			this.field769 = (short) (arg0.g1() << 2);
			this.field761 = (short) (arg0.g1() << 2);
		} else {
			this.field761 = 0;
			this.field769 = 0;
		}
		super.size = (var2 >> 3) + 1;
		int var3 = var2 & 0x1;
		boolean var4 = (var2 & 0x4) != 0;
		int var5 = -1;
		this.headiconPk = arg0.g1b();
		int[] var6 = new int[12];
		this.headiconPrayer = arg0.g1b();
		this.team = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var8 = arg0.g1();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				int var9 = arg0.g1();
				int var10 = var9 + (var8 << 8);
				if (var7 == 0 && var10 == 65535) {
					var5 = arg0.g2();
					break;
				}
				if (var10 >= 32768) {
					int var11 = Statics.field1698[var10 - 32768];
					var6[var7] = var11 | 0x40000000;
					int var12 = ObjType.list(var11).team;
					if (var12 != 0) {
						this.team = var12;
					}
				} else {
					var6[var7] = Integer.MIN_VALUE | var10 - 256;
				}
			}
		}
		int[] var13 = new int[5];
		for (int var14 = 0; var14 < 5; var14++) {
			int var15 = arg0.g1();
			if (var15 < 0 || var15 >= Client.field96[var14].length) {
				var15 = 0;
			}
			var13[var14] = var15;
		}
		super.readyanim = arg0.g2();
		if (super.readyanim == 65535) {
			super.readyanim = -1;
		}
		super.turnleftanim = arg0.g2();
		if (super.turnleftanim == 65535) {
			super.turnleftanim = -1;
		}
		super.turnrightanim = super.turnleftanim;
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
		this.name = JagString.toRawUsername(arg0.g8()).toScreenName();
		this.combatLevel = arg0.g1();
		if (var4) {
			this.skillLevel = arg0.g2();
		} else {
			this.skillLevel = 0;
		}
		if (this.model == null) {
			this.model = new PlayerModel();
		}
		this.model.setAppearance(var5, var6, var13, var3 == 1);
	}

	@ObfuscatedName("dj.a(IIIIIIIIIILcg;II)V")
	public void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, ModelLit arg9, int arg10, int arg11) {
		int var13 = arg11 * arg11 + arg6 * arg6;
		if (var13 < 16 || var13 > 360000) {
			return;
		}
		int var14 = (int) (Math.atan2((double) arg11, (double) arg6) * 325.949D) & 0x7FF;
		ModelLit var15 = method897(arg9, super.z, super.x, arg8, var14, super.y);
		if (var15 != null) {
			var15.method87(0, arg3, arg0, arg1, arg7, arg4, arg10, arg2, -1L);
		}
	}

	@ObfuscatedName("dj.d(I)Z")
	@Override
	public boolean ready() {
		return this.model != null;
	}
}
