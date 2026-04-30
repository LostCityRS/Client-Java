package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.util.JagString;

@ObfuscatedName("nb")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("nb.ac")
	public int z;

	@ObfuscatedName("nb.ad")
	public int primarySeqId = -1;

	@ObfuscatedName("nb.bc")
	public JagString chat = null;

	@ObfuscatedName("nb.cc")
	public int spotanimId = -1;

	@ObfuscatedName("nb.ec")
	public int spotanimLastCycle;

	@ObfuscatedName("nb.ed")
	public int turnleftanim = -1;

	@ObfuscatedName("nb.fc")
	public int preanimRouteLength = 0;

	@ObfuscatedName("nb.hc")
	public int size = 1;

	@ObfuscatedName("nb.hd")
	public int targetTileX = 0;

	@ObfuscatedName("nb.ic")
	public int turnCycle = 0;

	@ObfuscatedName("nb.jc")
	public int x;

	@ObfuscatedName("nb.kc")
	public int field1973;

	@ObfuscatedName("nb.lc")
	public int targetTileZ = 0;

	@ObfuscatedName("nb.mc")
	public int field1975;

	@ObfuscatedName("nb.nc")
	public int chatColour = 0;

	@ObfuscatedName("nb.pc")
	public int primarySeqFrame = 0;

	@ObfuscatedName("nb.qc")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("nb.sc")
	public int exactMoveStart;

	@ObfuscatedName("nb.uc")
	public int routeLength = 0;

	@ObfuscatedName("nb.vc")
	public int field1984;

	@ObfuscatedName("nb.gc")
	public int primarySeqLoop = 0;

	@ObfuscatedName("nb.Ub")
	public int turnrightanim = -1;

	@ObfuscatedName("nb.Tb")
	public int runanim = -1;

	@ObfuscatedName("nb.Qb")
	public int walkanim_b = -1;

	@ObfuscatedName("nb.Mb")
	public int walkanim_r = -1;

	@ObfuscatedName("nb.Xb")
	public final int[] damageTypes = new int[4];

	@ObfuscatedName("nb.Jb")
	public final boolean[] routeRun = new boolean[10];

	@ObfuscatedName("nb.yc")
	public int turnspeed = 32;

	@ObfuscatedName("nb.Cc")
	public int height = 200;

	@ObfuscatedName("nb.Pb")
	public int chatTimer = 100;

	@ObfuscatedName("nb.Fc")
	public int secondarySeqCycle = 0;

	@ObfuscatedName("nb.Hc")
	public int primarySeqDelay = 0;

	@ObfuscatedName("nb.Ob")
	public int secondarySeqId = -1;

	@ObfuscatedName("nb.Yb")
	public final int[] damageValues = new int[4];

	@ObfuscatedName("nb.Bc")
	public int secondarySeqFrame = 0;

	@ObfuscatedName("nb.Ic")
	public int chatEffect = 0;

	@ObfuscatedName("nb.Lc")
	public int readyanim = -1;

	@ObfuscatedName("nb.Lb")
	public int animDelayMove = 0;

	@ObfuscatedName("nb.Vc")
	public final int[] damageCycles = new int[4];

	@ObfuscatedName("nb.Oc")
	public int spotanimCycle = 0;

	@ObfuscatedName("nb.Wc")
	public int targetId = -1;

	@ObfuscatedName("nb.Uc")
	public final int[] routeZ = new int[10];

	@ObfuscatedName("nb.Yc")
	public int combatCycle = -1000;

	@ObfuscatedName("nb.Qc")
	public int walkanim = -1;

	@ObfuscatedName("nb.Ac")
	public int primarySeqCycle = 0;

	@ObfuscatedName("nb.Tc")
	public int cycle = 0;

	@ObfuscatedName("nb.Zc")
	public int spotanimFrame = 0;

	@ObfuscatedName("nb.Zb")
	public final int[] routeX = new int[10];

	@ObfuscatedName("nb.Rc")
	public int walkanim_l = -1;

	@ObfuscatedName("nb.Kb")
	public int exactMoveFacing;

	@ObfuscatedName("nb.Rb")
	public int dstYaw;

	@ObfuscatedName("nb.Sb")
	public int exactStartZ;

	@ObfuscatedName("nb.xc")
	public int exactMoveEnd;

	@ObfuscatedName("nb.Dc")
	public int yaw;

	@ObfuscatedName("nb.Kc")
	public int exactStartX;

	@ObfuscatedName("nb.Mc")
	public int field2001;

	@ObfuscatedName("nb.Pc")
	public int field2004;

	@ObfuscatedName("nb.a(IBZ)V")
	public final void moveCode(int arg0, boolean arg1) {
		int var3 = this.routeX[0];
		int var4 = this.routeZ[0];
		if (arg0 == 0) {
			var4++;
			var3--;
		}
		if (this.primarySeqId != -1 && SeqType.list(this.primarySeqId).preanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (this.routeLength < 9) {
			this.routeLength++;
		}
		for (int var5 = this.routeLength; var5 > 0; var5--) {
			this.routeX[var5] = this.routeX[var5 - 1];
			this.routeZ[var5] = this.routeZ[var5 - 1];
			this.routeRun[var5] = this.routeRun[var5 - 1];
		}
		if (arg0 == 1) {
			var4++;
		}
		if (arg0 == 2) {
			var4++;
			var3++;
		}
		if (arg0 == 3) {
			var3--;
		}
		if (arg0 == 4) {
			var3++;
		}
		if (arg0 == 5) {
			var3--;
			var4--;
		}
		if (arg0 == 6) {
			var4--;
		}
		if (arg0 == 7) {
			var3++;
			var4--;
		}
		this.routeX[0] = var3;
		this.routeZ[0] = var4;
		this.routeRun[0] = arg1;
	}

	@ObfuscatedName("nb.h(I)Z")
	public boolean ready() {
		return false;
	}

	@ObfuscatedName("nb.b(IIII)V")
	public final void addHitmark(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (arg1 >= this.damageCycles[var4]) {
				this.damageValues[var4] = arg2;
				this.damageTypes[var4] = arg0;
				this.damageCycles[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("nb.a(IIZI)V")
	public final void teleport(int arg0, boolean arg1, int arg2) {
		if (this.primarySeqId != -1 && SeqType.list(this.primarySeqId).preanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (!arg1) {
			int var4 = arg2 - this.routeX[0];
			int var5 = arg0 - this.routeZ[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (this.routeLength < 9) {
					this.routeLength++;
				}
				for (int var6 = this.routeLength; var6 > 0; var6--) {
					this.routeX[var6] = this.routeX[var6 - 1];
					this.routeZ[var6] = this.routeZ[var6 - 1];
					this.routeRun[var6] = this.routeRun[var6 - 1];
				}
				this.routeX[0] = arg2;
				this.routeZ[0] = arg0;
				this.routeRun[0] = false;
				return;
			}
		}
		this.routeLength = 0;
		this.animDelayMove = 0;
		this.preanimRouteLength = 0;
		this.routeX[0] = arg2;
		this.routeZ[0] = arg0;
		this.x = this.routeX[0] * 128 + this.size * 64;
		this.z = this.routeZ[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("nb.j(I)V")
	public final void abortRoute() {
		this.preanimRouteLength = 0;
		this.routeLength = 0;
	}
}
