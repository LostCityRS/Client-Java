package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.SeqType;

@ObfuscatedName("z")
public class ClientEntity extends ModelSource {

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
	public int readyanim = -1;

	@ObfuscatedName("z.t")
	public int turnanim = -1;

	@ObfuscatedName("z.u")
	public int walkanim = -1;

	@ObfuscatedName("z.v")
	public int walkanim_b = -1;

	@ObfuscatedName("z.w")
	public int walkanim_l = -1;

	@ObfuscatedName("z.x")
	public int walkanim_r = -1;

	@ObfuscatedName("z.y")
	public int runanim = -1;

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
	public int routeLength;

	@ObfuscatedName("z.kb")
	public int[] routeTileX = new int[10];

	@ObfuscatedName("z.lb")
	public int[] routeTileZ = new int[10];

	@ObfuscatedName("z.mb")
	public boolean[] routeRun = new boolean[10];

	@ObfuscatedName("z.nb")
	public int seqDelayMove;

	@ObfuscatedName("z.ob")
	public int preanimRouteLength;

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
	public final void move(boolean teleport, int arg1, int arg2) {
		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_mode == 1) {
			this.primarySeqId = -1;
		}
		if (!teleport) {
			int var5 = arg1 - this.routeTileX[0];
			int var6 = arg2 - this.routeTileZ[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.routeLength < 9) {
					this.routeLength++;
				}
				for (int var7 = this.routeLength; var7 > 0; var7--) {
					this.routeTileX[var7] = this.routeTileX[var7 - 1];
					this.routeTileZ[var7] = this.routeTileZ[var7 - 1];
					this.routeRun[var7] = this.routeRun[var7 - 1];
				}
				this.routeTileX[0] = arg1;
				this.routeTileZ[0] = arg2;
				this.routeRun[0] = false;
				return;
			}
		}
		this.routeLength = 0;
		this.preanimRouteLength = 0;
		this.seqDelayMove = 0;
		this.routeTileX[0] = arg1;
		this.routeTileZ[0] = arg2;
		this.x = this.routeTileX[0] * 128 + this.size * 64;
		this.z = this.routeTileZ[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("z.a(IZZ)V")
	public final void step(int arg0, boolean arg1) {
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
		if (this.routeLength < 9) {
			this.routeLength++;
		}
		for (int var6 = this.routeLength; var6 > 0; var6--) {
			this.routeTileX[var6] = this.routeTileX[var6 - 1];
			this.routeTileZ[var6] = this.routeTileZ[var6 - 1];
			this.routeRun[var6] = this.routeRun[var6 - 1];
		}
		this.routeTileX[0] = var4;
		this.routeTileZ[0] = var5;
		this.routeRun[0] = arg1;
	}

	@ObfuscatedName("z.b(I)V")
	public final void clearRoute() {
		this.routeLength = 0;
		this.preanimRouteLength = 0;
	}

	@ObfuscatedName("z.a(B)Z")
	public boolean isVisible() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void hit(int arg0, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.damageCycle[var4] <= Client.loopCycle) {
				this.damage[var4] = arg2;
				this.damageType[var4] = arg0;
				this.damageCycle[var4] = Client.loopCycle + 70;
				return;
			}
		}
	}
}
