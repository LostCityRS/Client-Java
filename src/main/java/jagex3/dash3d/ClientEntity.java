package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.jstring.JagString;

@ObfuscatedName("u")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("u.bb")
	public int secondarySeqCycle = 0;

	@ObfuscatedName("u.cb")
	public int chatTimer = 100;

	@ObfuscatedName("u.db")
	public int exactStartX;

	@ObfuscatedName("u.eb")
	public int targetId = -1;

	@ObfuscatedName("u.ib")
	public int combatCycle = -1000;

	@ObfuscatedName("u.jb")
	public int yaw;

	@ObfuscatedName("u.kb")
	public int spotanimCycle = 0;

	@ObfuscatedName("u.lb")
	public int z;

	@ObfuscatedName("u.mb")
	public int walkanim_r = -1;

	@ObfuscatedName("u.n")
	public JagString chat = null;

	@ObfuscatedName("u.nb")
	public int walkanim_b = -1;

	@ObfuscatedName("u.o")
	public int exactEndZ;

	@ObfuscatedName("u.p")
	public final int[] damageCycles = new int[4];

	@ObfuscatedName("u.pb")
	public int spotanimHeight;

	@ObfuscatedName("u.q")
	public final boolean[] routeRun = new boolean[10];

	@ObfuscatedName("u.r")
	public int spotanimFrame = 0;

	@ObfuscatedName("u.rb")
	public int secondarySeqFrame = 0;

	@ObfuscatedName("u.sb")
	public int turnrightanim = -1;

	@ObfuscatedName("u.t")
	public int primarySeqId = -1;

	@ObfuscatedName("u.u")
	public final int[] damageTypes = new int[4];

	@ObfuscatedName("u.ub")
	public int exactMoveEnd;

	@ObfuscatedName("u.vb")
	public final int[] damageValues = new int[4];

	@ObfuscatedName("u.w")
	public int spotanimId = -1;

	@ObfuscatedName("u.wb")
	public int primarySeqLoop = 0;

	@ObfuscatedName("u.A")
	public int walkanim_l = -1;

	@ObfuscatedName("u.z")
	public int chatColour = 0;

	@ObfuscatedName("u.J")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("u.O")
	public int primarySeqCycle = 0;

	@ObfuscatedName("u.x")
	public int cycle = 0;

	@ObfuscatedName("u.U")
	public int runanim = -1;

	@ObfuscatedName("u.F")
	public int turnCycle = 0;

	@ObfuscatedName("u.X")
	public int height = -32768;

	@ObfuscatedName("u.T")
	public int size = 1;

	@ObfuscatedName("u.R")
	public int primarySeqFrame = 0;

	@ObfuscatedName("u.D")
	public final int[] routeX = new int[10];

	@ObfuscatedName("u.H")
	public int turnleftanim = -1;

	@ObfuscatedName("u.S")
	public int turnspeed = 32;

	@ObfuscatedName("u.W")
	public int secondarySeqId = -1;

	@ObfuscatedName("u.M")
	public int targetTileX = 0;

	@ObfuscatedName("u.V")
	public int readyanim = -1;

	@ObfuscatedName("u.Y")
	public int animDelayMove = 0;

	@ObfuscatedName("u.Cb")
	public int chatEffect = 0;

	@ObfuscatedName("u.Bb")
	public int preanimRouteLength = 0;

	@ObfuscatedName("u.Eb")
	public int primarySeqDelay = 0;

	@ObfuscatedName("u.I")
	public int walkanim = -1;

	@ObfuscatedName("u.zb")
	public int routeLength = 0;

	@ObfuscatedName("u.P")
	public int targetTileZ = 0;

	@ObfuscatedName("u.Fb")
	public final int[] routeZ = new int[10];

	@ObfuscatedName("u.y")
	public int spotanimLastCycle;

	@ObfuscatedName("u.B")
	public int dstYaw;

	@ObfuscatedName("u.K")
	public int exactStartZ;

	@ObfuscatedName("u.N")
	public int y;

	@ObfuscatedName("u.Q")
	public int exactEndX;

	@ObfuscatedName("u.Z")
	public int field4109;

	@ObfuscatedName("u.xb")
	public int exactMoveStart;

	@ObfuscatedName("u.Ab")
	public int x;

	@ObfuscatedName("u.Db")
	public int exactMoveFacing;

	@ObfuscatedName("u.a(ZIII)V")
	public final void teleport(boolean arg0, int arg1, int arg2) {
		if (this.primarySeqId != -1 && SeqType.list(this.primarySeqId).postanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (!arg0) {
			int var4 = arg1 - this.routeX[0];
			int var5 = arg2 - this.routeZ[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (this.routeLength < 9) {
					this.routeLength++;
				}
				for (int var6 = this.routeLength; var6 > 0; var6--) {
					this.routeX[var6] = this.routeX[var6 - 1];
					this.routeZ[var6] = this.routeZ[var6 - 1];
					this.routeRun[var6] = this.routeRun[var6 - 1];
				}
				this.routeRun[0] = false;
				this.routeX[0] = arg1;
				this.routeZ[0] = arg2;
				return;
			}
		}
		this.routeX[0] = arg1;
		this.routeZ[0] = arg2;
		this.preanimRouteLength = 0;
		this.z = this.size * 64 + this.routeZ[0] * 128;
		this.animDelayMove = 0;
		this.x = this.size * 64 + this.routeX[0] * 128;
		this.routeLength = 0;
	}

	@ObfuscatedName("u.b(I)I")
	public final int method1475() {
		return this.height == -32768 ? 200 : -this.height;
	}

	@ObfuscatedName("u.a(BZI)V")
	public final void moveCode(boolean arg0, int arg1) {
		int var3 = this.routeX[0];
		int var4 = this.routeZ[0];
		if (this.primarySeqId != -1 && SeqType.list(this.primarySeqId).postanim_move == 1) {
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
		this.routeRun[0] = arg0;
		if (arg1 == 0) {
			var4++;
			var3--;
		}
		if (arg1 == 1) {
			var4++;
		}
		if (arg1 == 2) {
			var3++;
			var4++;
		}
		if (arg1 == 3) {
			var3--;
		}
		if (arg1 == 4) {
			var3++;
		}
		if (arg1 == 5) {
			var4--;
			var3--;
		}
		if (arg1 == 6) {
			var4--;
		}
		if (arg1 == 7) {
			var3++;
			var4--;
		}
		this.routeX[0] = var3;
		this.routeZ[0] = var4;
	}

	@ObfuscatedName("u.a(IIII)V")
	public final void addHitmark(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.damageCycles[var4] <= arg0) {
				this.damageValues[var4] = arg2;
				this.damageTypes[var4] = arg1;
				this.damageCycles[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("u.c(I)V")
	public final void abortRoute() {
		this.routeLength = 0;
		this.preanimRouteLength = 0;
	}

	@ObfuscatedName("u.d(I)Z")
	public boolean ready() {
		return false;
	}
}
