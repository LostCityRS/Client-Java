package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.SeqType;

@ObfuscatedName("z")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("z.o")
	public int x;

	@ObfuscatedName("z.p")
	public int z;

	@ObfuscatedName("z.q")
	public int field412;

	@ObfuscatedName("z.r")
	public boolean field413 = false;

	@ObfuscatedName("z.s")
	public int size = 1;

	@ObfuscatedName("z.t")
	public int readyanim = -1;

	@ObfuscatedName("z.u")
	public int turnanim = -1;

	@ObfuscatedName("z.v")
	public int walkanim = -1;

	@ObfuscatedName("z.w")
	public int walkanim_b = -1;

	@ObfuscatedName("z.x")
	public int walkanim_l = -1;

	@ObfuscatedName("z.y")
	public int walkanim_r = -1;

	@ObfuscatedName("z.z")
	public int runanim = -1;

	@ObfuscatedName("z.ab")
	public int field448;

	@ObfuscatedName("z.bb")
	public int field449;

	@ObfuscatedName("z.cb")
	public int field450;

	@ObfuscatedName("z.db")
	public int field451;

	@ObfuscatedName("z.eb")
	public int field452;

	@ObfuscatedName("z.fb")
	public int field453;

	@ObfuscatedName("z.gb")
	public int field454;

	@ObfuscatedName("z.hb")
	public int cycle;

	@ObfuscatedName("z.ib")
	public int height = 200;

	@ObfuscatedName("z.jb")
	public int dstYaw;

	@ObfuscatedName("z.kb")
	public int field458 = 32;

	@ObfuscatedName("z.lb")
	public int routeLength;

	@ObfuscatedName("z.mb")
	public int[] routeTileX = new int[10];

	@ObfuscatedName("z.nb")
	public int[] routeTileZ = new int[10];

	@ObfuscatedName("z.ob")
	public boolean[] routeRun = new boolean[10];

	@ObfuscatedName("z.pb")
	public int seqDelayMove;

	@ObfuscatedName("z.qb")
	public int preanimRouteLength;

	@ObfuscatedName("z.B")
	public int field423 = 100;

	@ObfuscatedName("z.E")
	public int[] damage = new int[4];

	@ObfuscatedName("z.F")
	public int[] damageType = new int[4];

	@ObfuscatedName("z.G")
	public int[] damageCycle = new int[4];

	@ObfuscatedName("z.H")
	public int field429 = -1000;

	@ObfuscatedName("z.K")
	public int field432 = -1;

	@ObfuscatedName("z.N")
	public int secondarySeqId = -1;

	@ObfuscatedName("z.Q")
	public int primarySeqId = -1;

	@ObfuscatedName("z.V")
	public int spotanimId = -1;

	@ObfuscatedName("z.C")
	public int field424;

	@ObfuscatedName("z.D")
	public int field425;

	@ObfuscatedName("z.I")
	public int field430;

	@ObfuscatedName("z.J")
	public int field431;

	@ObfuscatedName("z.L")
	public int field433;

	@ObfuscatedName("z.M")
	public int field434;

	@ObfuscatedName("z.O")
	public int secondarySeqFrame;

	@ObfuscatedName("z.P")
	public int field437;

	@ObfuscatedName("z.R")
	public int primarySeqFrame;

	@ObfuscatedName("z.S")
	public int field440;

	@ObfuscatedName("z.T")
	public int primarySeqDelay;

	@ObfuscatedName("z.U")
	public int field442;

	@ObfuscatedName("z.W")
	public int spotanimFrame;

	@ObfuscatedName("z.X")
	public int field445;

	@ObfuscatedName("z.Y")
	public int field446;

	@ObfuscatedName("z.Z")
	public int spotanimHeight;

	@ObfuscatedName("z.A")
	public String field422;

	@ObfuscatedName("z.a(IIZZ)V")
	public final void move(int arg0, int arg1, boolean arg3) {
		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (!arg3) {
			int var5 = arg1 - this.routeTileX[0];
			int var6 = arg0 - this.routeTileZ[0];
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
				this.routeTileZ[0] = arg0;
				this.routeRun[0] = false;
				return;
			}
		}
		this.routeLength = 0;
		this.preanimRouteLength = 0;
		this.seqDelayMove = 0;
		this.routeTileX[0] = arg1;
		this.routeTileZ[0] = arg0;
		this.x = this.routeTileX[0] * 128 + this.size * 64;
		this.z = this.routeTileZ[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("z.a(ZIB)V")
	public final void step(boolean arg0, int arg1) {
		int var4 = this.routeTileX[0];
		int var5 = this.routeTileZ[0];
		if (arg1 == 0) {
			var4--;
			var5++;
		}
		if (arg1 == 1) {
			var5++;
		}
		if (arg1 == 2) {
			var4++;
			var5++;
		}
		if (arg1 == 3) {
			var4--;
		}
		if (arg1 == 4) {
			var4++;
		}
		if (arg1 == 5) {
			var4--;
			var5--;
		}
		if (arg1 == 6) {
			var5--;
		}
		if (arg1 == 7) {
			var4++;
			var5--;
		}
		if (this.primarySeqId != -1 && SeqType.types[this.primarySeqId].postanim_move == 1) {
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
		this.routeRun[0] = arg0;
	}

	@ObfuscatedName("z.a(Z)V")
	public final void clearRoute() {
		this.routeLength = 0;
		this.preanimRouteLength = 0;
	}

	@ObfuscatedName("z.b(I)Z")
	public boolean isVisible() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void hit(int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.damageCycle[var4] <= Client.loopCycle) {
				this.damage[var4] = arg2;
				this.damageType[var4] = arg1;
				this.damageCycle[var4] = Client.loopCycle + 70;
				return;
			}
		}
	}
}
