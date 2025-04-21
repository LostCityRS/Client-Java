package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.client;
import jagex2.config.SeqType;

@ObfuscatedName("z")
public class PathingEntity extends Entity {

	@ObfuscatedName("z.l")
	public boolean field402 = true;

	@ObfuscatedName("z.m")
	public int field403 = 354;

	@ObfuscatedName("z.n")
	public int x;

	@ObfuscatedName("z.o")
	public int z;

	@ObfuscatedName("z.p")
	public int yaw;

	@ObfuscatedName("z.q")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("z.r")
	public int size = 1;

	@ObfuscatedName("z.s")
	public int seqStandId = -1;

	@ObfuscatedName("z.t")
	public int seqTurnId = -1;

	@ObfuscatedName("z.u")
	public int seqWalkId = -1;

	@ObfuscatedName("z.v")
	public int seqTurnAroundId = -1;

	@ObfuscatedName("z.w")
	public int seqTurnLeftId = -1;

	@ObfuscatedName("z.x")
	public int seqTurnRightId = -1;

	@ObfuscatedName("z.y")
	public int seqRunId = -1;

	@ObfuscatedName("z.z")
	public String chatMessage;

	@ObfuscatedName("z.ab")
	public int forceMoveEndSceneTileX;

	@ObfuscatedName("z.bb")
	public int forceMoveStartSceneTileZ;

	@ObfuscatedName("z.cb")
	public int forceMoveEndSceneTileZ;

	@ObfuscatedName("z.db")
	public int forceMoveEndCycle;

	@ObfuscatedName("z.eb")
	public int forceMoveStartCycle;

	@ObfuscatedName("z.fb")
	public int forceMoveFaceDirection;

	@ObfuscatedName("z.gb")
	public int cycle;

	@ObfuscatedName("z.hb")
	public int height;

	@ObfuscatedName("z.ib")
	public int dstYaw;

	@ObfuscatedName("z.jb")
	public int pathLength;

	@ObfuscatedName("z.kb")
	public int[] routeTileX = new int[10];

	@ObfuscatedName("z.lb")
	public int[] routeTileZ = new int[10];

	@ObfuscatedName("z.mb")
	public boolean[] pathRunning = new boolean[10];

	@ObfuscatedName("z.nb")
	public int seqTrigger;

	@ObfuscatedName("z.ob")
	public int seqPathLength;

	@ObfuscatedName("z.A")
	public int chatTimer = 100;

	@ObfuscatedName("z.D")
	public int[] damage = new int[4];

	@ObfuscatedName("z.E")
	public int[] damageType = new int[4];

	@ObfuscatedName("z.F")
	public int[] damageCycle = new int[4];

	@ObfuscatedName("z.G")
	public int combatCycle = -1000;

	@ObfuscatedName("z.J")
	public int targetId = -1;

	@ObfuscatedName("z.M")
	public int secondarySeqId = -1;

	@ObfuscatedName("z.P")
	public int primarySeqId = -1;

	@ObfuscatedName("z.U")
	public int spotanimId = -1;

	@ObfuscatedName("z.B")
	public int chatColour;

	@ObfuscatedName("z.C")
	public int chatEffect;

	@ObfuscatedName("z.H")
	public int health;

	@ObfuscatedName("z.I")
	public int totalHealth;

	@ObfuscatedName("z.K")
	public int targetTileX;

	@ObfuscatedName("z.L")
	public int targetTileZ;

	@ObfuscatedName("z.N")
	public int secondarySeqFrame;

	@ObfuscatedName("z.O")
	public int secondarySeqCycle;

	@ObfuscatedName("z.Q")
	public int primarySeqFrame;

	@ObfuscatedName("z.R")
	public int primarySeqCycle;

	@ObfuscatedName("z.S")
	public int primarySeqDelay;

	@ObfuscatedName("z.T")
	public int primarySeqLoop;

	@ObfuscatedName("z.V")
	public int spotanimFrame;

	@ObfuscatedName("z.W")
	public int spotanimCycle;

	@ObfuscatedName("z.X")
	public int spotanimLastCycle;

	@ObfuscatedName("z.Y")
	public int spotanimHeight;

	@ObfuscatedName("z.Z")
	public int forceMoveStartSceneTileX;

	@ObfuscatedName("z.a(ZIII)V")
	public final void move(boolean arg0, int arg1, int arg2, int arg3) {
		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_mode == 1) {
			this.primarySeqId = -1;
		}
		if (!arg0) {
			int var5 = arg1 - this.routeTileX[0];
			int var6 = arg2 - this.routeTileZ[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.pathLength < 9) {
					this.pathLength++;
				}
				for (int var7 = this.pathLength; var7 > 0; var7--) {
					this.routeTileX[var7] = this.routeTileX[var7 - 1];
					this.routeTileZ[var7] = this.routeTileZ[var7 - 1];
					this.pathRunning[var7] = this.pathRunning[var7 - 1];
				}
				this.routeTileX[0] = arg1;
				this.routeTileZ[0] = arg2;
				this.pathRunning[0] = false;
				return;
			}
		}
		this.pathLength = 0;
		this.seqPathLength = 0;
		this.seqTrigger = 0;
		this.routeTileX[0] = arg1;
		this.routeTileZ[0] = arg2;
		this.x = this.routeTileX[0] * 128 + this.size * 64;
		if (arg3 >= 7 && arg3 <= 7) {
			this.z = this.routeTileZ[0] * 128 + this.size * 64;
		}
	}

	@ObfuscatedName("z.a(IZZ)V")
	public final void move(int arg0, boolean arg1, boolean arg2) {
		if (!arg2) {
			this.field402 = !this.field402;
		}
		int var4 = this.routeTileX[0];
		int var5 = this.routeTileZ[0];
		if (arg0 == 0) {
			var4--;
			var5++;
		}
		if (arg0 == 1) {
			var5++;
		}
		if (arg0 == 2) {
			var4++;
			var5++;
		}
		if (arg0 == 3) {
			var4--;
		}
		if (arg0 == 4) {
			var4++;
		}
		if (arg0 == 5) {
			var4--;
			var5--;
		}
		if (arg0 == 6) {
			var5--;
		}
		if (arg0 == 7) {
			var4++;
			var5--;
		}
		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_mode == 1) {
			this.primarySeqId = -1;
		}
		if (this.pathLength < 9) {
			this.pathLength++;
		}
		for (int var6 = this.pathLength; var6 > 0; var6--) {
			this.routeTileX[var6] = this.routeTileX[var6 - 1];
			this.routeTileZ[var6] = this.routeTileZ[var6 - 1];
			this.pathRunning[var6] = this.pathRunning[var6 - 1];
		}
		this.routeTileX[0] = var4;
		this.routeTileZ[0] = var5;
		this.pathRunning[0] = arg1;
	}

	@ObfuscatedName("z.b(I)V")
	public final void resetPath(int arg0) {
		this.pathLength = 0;
		this.seqPathLength = 0;
		if (arg0 < 2 || arg0 > 2) {
			this.field403 = 186;
		}
	}

	@ObfuscatedName("z.a(B)Z")
	public boolean isVisible(byte arg0) {
		if (arg0 != 8) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void hit(int arg0, int arg1, int arg2) {
		if (arg1 != 0) {
			this.field403 = -191;
		}
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.damageCycle[var4] <= client.loopCycle) {
				this.damage[var4] = arg2;
				this.damageType[var4] = arg0;
				this.damageCycle[var4] = client.loopCycle + 70;
				return;
			}
		}
	}
}
