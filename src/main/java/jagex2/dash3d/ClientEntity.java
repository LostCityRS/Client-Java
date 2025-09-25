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

	@ObfuscatedName("z.a(IIIZ)V")
	public void move(int x, int z, boolean jump) {
		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_move == 1) {
			this.primarySeqId = -1;
		}

		if (!jump) {
			int dx = x - this.routeTileX[0];
			int dz = z - this.routeTileZ[0];
			if (dx >= -8 && dx <= 8 && dz >= -8 && dz <= 8) {
				if (this.routeLength < 9) {
					this.routeLength++;
				}

				for (int i = this.routeLength; i > 0; i--) {
					this.routeTileX[i] = this.routeTileX[i - 1];
					this.routeTileZ[i] = this.routeTileZ[i - 1];
					this.routeRun[i] = this.routeRun[i - 1];
				}

				this.routeTileX[0] = x;
				this.routeTileZ[0] = z;
				this.routeRun[0] = false;
				return;
			}
		}

		this.routeLength = 0;
		this.preanimRouteLength = 0;
		this.seqDelayMove = 0;
		this.routeTileX[0] = x;
		this.routeTileZ[0] = z;
		this.x = this.routeTileX[0] * 128 + this.size * 64;
		this.z = this.routeTileZ[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("z.a(ZII)V")
	public void step(boolean run, int dir) {
		int x = this.routeTileX[0];
		int z = this.routeTileZ[0];

		if (dir == 0) {
			x--;
			z++;
		} else if (dir == 1) {
			z++;
		} else if (dir == 2) {
			x++;
			z++;
		} else if (dir == 3) {
			x--;
		} else if (dir == 4) {
			x++;
		} else if (dir == 5) {
			x--;
			z--;
		} else if (dir == 6) {
			z--;
		} else if (dir == 7) {
			x++;
			z--;
		}

		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_move == 1) {
			this.primarySeqId = -1;
		}

		if (this.routeLength < 9) {
			this.routeLength++;
		}

		for (int i = this.routeLength; i > 0; i--) {
			this.routeTileX[i] = this.routeTileX[i - 1];
			this.routeTileZ[i] = this.routeTileZ[i - 1];
			this.routeRun[i] = this.routeRun[i - 1];
		}

		this.routeTileX[0] = x;
		this.routeTileZ[0] = z;
		this.routeRun[0] = run;
	}

	@ObfuscatedName("z.a(B)V")
	public void clearRoute() {
		this.routeLength = 0;
		this.preanimRouteLength = 0;
	}

	@ObfuscatedName("z.b(B)Z")
	public boolean isVisible() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public void hit(int type, int value) {
		for (int i = 0; i < 4; i++) {
			if (this.damageCycle[i] <= Client.loopCycle) {
				this.damage[i] = value;
				this.damageType[i] = type;
				this.damageCycle[i] = Client.loopCycle + 70;
				return;
			}
		}
	}
}
