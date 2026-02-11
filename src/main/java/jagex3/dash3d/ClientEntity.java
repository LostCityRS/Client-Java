package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.util.JagString;

@ObfuscatedName("qd")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("qd.ac")
	public int turnleftanim = -1;

	@ObfuscatedName("qd.bb")
	public int turnspeed = 32;

	@ObfuscatedName("qd.bc")
	public int yaw;

	@ObfuscatedName("qd.cb")
	public int animDelayMove = 0;

	@ObfuscatedName("qd.cc")
	public final int[] danageTypes = new int[4];

	@ObfuscatedName("qd.dc")
	public int x;

	@ObfuscatedName("qd.eb")
	public int routeLength = 0;

	@ObfuscatedName("qd.ec")
	public int preanimRouteLength = 0;

	@ObfuscatedName("qd.fb")
	public int field2697 = 0;

	@ObfuscatedName("qd.fc")
	public int field2749 = 0;

	@ObfuscatedName("qd.gb")
	public int z;

	@ObfuscatedName("qd.hc")
	public int exactMoveFacing;

	@ObfuscatedName("qd.ic")
	public int field2752 = 0;

	@ObfuscatedName("qd.jb")
	public int spotanimCycle = 0;

	@ObfuscatedName("qd.jc")
	public int field2753 = 0;

	@ObfuscatedName("qd.kc")
	public int spotanimFrame = 0;

	@ObfuscatedName("qd.lc")
	public int field2755;

	@ObfuscatedName("qd.mb")
	public int spotanimLastCycle;

	@ObfuscatedName("qd.mc")
	public int targetId = -1;

	@ObfuscatedName("qd.nb")
	public int runanim = -1;

	@ObfuscatedName("qd.nc")
	public int secondarySeqCycle = 0;

	@ObfuscatedName("qd.ob")
	public int chatTimer = 100;

	@ObfuscatedName("qd.oc")
	public final int[] damageValues = new int[4];

	@ObfuscatedName("qd.pc")
	public final int[] routeX = new int[10];

	@ObfuscatedName("qd.qb")
	public int secondarySeqId = -1;

	@ObfuscatedName("qd.rb")
	public int walkanim = -1;

	@ObfuscatedName("qd.sb")
	public int exactStartX;

	@ObfuscatedName("qd.tb")
	public int size = 1;

	@ObfuscatedName("qd.ub")
	public int primarySeqId = -1;

	@ObfuscatedName("qd.vb")
	public int cycle = 0;

	@ObfuscatedName("qd.wb")
	public int primarySeqLoop = 0;

	@ObfuscatedName("qd.yb")
	public int turnrightanim = -1;

	@ObfuscatedName("qd.Fb")
	public int walkanim_l = -1;

	@ObfuscatedName("qd.Eb")
	public final int[] damageCycles = new int[4];

	@ObfuscatedName("qd.Rb")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("qd.Qb")
	public int walkanim_b = -1;

	@ObfuscatedName("qd.V")
	public int readyanim = -1;

	@ObfuscatedName("qd.Nb")
	public int spotanimId = -1;

	@ObfuscatedName("qd.W")
	public int height = 200;

	@ObfuscatedName("qd.Db")
	public JagString chat = null;

	@ObfuscatedName("qd.Sb")
	public final int[] routeZ = new int[10];

	@ObfuscatedName("qd.xb")
	public int primarySeqDelay = 0;

	@ObfuscatedName("qd.Kb")
	public int secondarySeqFrame = 0;

	@ObfuscatedName("qd.Z")
	public int combatCycle = -1000;

	@ObfuscatedName("qd.Lb")
	public int walkanim_r = -1;

	@ObfuscatedName("qd.Hb")
	public int primarySeqFrame = 0;

	@ObfuscatedName("qd.Pb")
	public final boolean[] routeRun = new boolean[10];

	@ObfuscatedName("qd.Tb")
	public int primarySeqCycle = 0;

	@ObfuscatedName("qd.Xb")
	public int field2741 = 0;

	@ObfuscatedName("qd.Y")
	public int exactEndX;

	@ObfuscatedName("qd.zb")
	public int exactStartZ;

	@ObfuscatedName("qd.Gb")
	public int exactMoveStart;

	@ObfuscatedName("qd.Jb")
	public int spotanimHeight;

	@ObfuscatedName("qd.Mb")
	public int exactMoveEnd;

	@ObfuscatedName("qd.Ub")
	public int field2738;

	@ObfuscatedName("qd.Wb")
	public int exactEndZ;

	@ObfuscatedName("qd.Yb")
	public int dstYaw;

	@ObfuscatedName("qd.a(IZI)V")
	public final void moveCode(int arg0, boolean arg1) {
		int var3 = this.routeX[0];
		int var4 = this.routeZ[0];
		if (arg0 == 0) {
			var4++;
			var3--;
		}
		if (this.primarySeqId != -1 && SeqType.list(this.primarySeqId).postanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (arg0 == 1) {
			var4++;
		}
		if (this.routeLength < 9) {
			this.routeLength++;
		}
		if (arg0 == 2) {
			var4++;
			var3++;
		}
		for (int var5 = this.routeLength; var5 > 0; var5--) {
			this.routeX[var5] = this.routeX[var5 - 1];
			this.routeZ[var5] = this.routeZ[var5 - 1];
			this.routeRun[var5] = this.routeRun[var5 - 1];
		}
		if (arg0 == 3) {
			var3--;
		}
		if (arg0 == 4) {
			var3++;
		}
		this.routeRun[0] = arg1;
		if (arg0 == 5) {
			var3--;
			var4--;
		}
		if (arg0 == 6) {
			var4--;
		}
		if (arg0 == 7) {
			var4--;
			var3++;
		}
		this.routeX[0] = var3;
		this.routeZ[0] = var4;
	}

	@ObfuscatedName("qd.a(IIZI)V")
	public final void teleport(int arg0, boolean arg1, int arg2) {
		if (this.primarySeqId != -1 && SeqType.list(this.primarySeqId).postanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (!arg1) {
			int var4 = arg0 - this.routeZ[0];
			int var5 = arg2 - this.routeX[0];
			if (var5 >= -8 && var5 <= 8 && var4 >= -8 && var4 <= 8) {
				if (this.routeLength < 9) {
					this.routeLength++;
				}
				for (int var6 = this.routeLength; var6 > 0; var6--) {
					this.routeX[var6] = this.routeX[var6 - 1];
					this.routeZ[var6] = this.routeZ[var6 - 1];
					this.routeRun[var6] = this.routeRun[var6 - 1];
				}
				this.routeX[0] = arg2;
				this.routeRun[0] = false;
				this.routeZ[0] = arg0;
				return;
			}
		}
		this.animDelayMove = 0;
		this.routeLength = 0;
		this.routeX[0] = arg2;
		this.preanimRouteLength = 0;
		this.routeZ[0] = arg0;
		this.z = this.routeZ[0] * 128 + this.size * 64;
		this.x = this.routeX[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("qd.i(I)V")
	public final void abortRoute() {
		this.routeLength = 0;
		this.preanimRouteLength = 0;
	}

	@ObfuscatedName("qd.j(I)Z")
	public boolean ready() {
		return false;
	}

	@ObfuscatedName("qd.a(IIII)V")
	public final void addHitmark(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.damageCycles[var4] <= arg0) {
				this.damageValues[var4] = arg2;
				this.danageTypes[var4] = arg1;
				this.damageCycles[var4] = arg0 + 70;
				return;
			}
		}
	}
}
