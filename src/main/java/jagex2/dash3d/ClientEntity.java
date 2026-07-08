package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("y")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("y.o")
	public int x;

	@ObfuscatedName("y.p")
	public int z;

	@ObfuscatedName("y.s")
	public int size = 1;

	@ObfuscatedName("y.t")
	public int readyanim = -1;

	@ObfuscatedName("y.v")
	public int walkanim = -1;

	@ObfuscatedName("y.w")
	public int walkanim_b = -1;

	@ObfuscatedName("y.x")
	public int walkanim_l = -1;

	@ObfuscatedName("y.y")
	public int walkanim_r = -1;

	@ObfuscatedName("y.z")
	public int runanim = -1;

	@ObfuscatedName("y.B")
	public int chatTimer = 100;

	@ObfuscatedName("y.C")
	public int chatColour;

	@ObfuscatedName("y.D")
	public int chatEffect;

	@ObfuscatedName("y.E")
	public final int[] damageValues = new int[4];

	@ObfuscatedName("y.F")
	public final int[] damageTypes = new int[4];

	@ObfuscatedName("y.G")
	public final int[] damageCycles = new int[4];

	@ObfuscatedName("y.V")
	public int spotanimId = -1;

	@ObfuscatedName("y.W")
	public int spotanimFrame;

	@ObfuscatedName("y.Z")
	public int spotanimHeight;

	@ObfuscatedName("y.hb")
	public int cycle;

	@ObfuscatedName("y.ib")
	public int height = 200;

	@ObfuscatedName("y.jb")
	public int dstYaw;

	@ObfuscatedName("y.lb")
	public int routeLength;

	@ObfuscatedName("y.mb")
	public final int[] routeX = new int[10];

	@ObfuscatedName("y.nb")
	public final int[] routeZ = new int[10];

	@ObfuscatedName("y.ob")
	public final boolean[] routeRun = new boolean[10];

	@ObfuscatedName("y.pb")
	public int animDelayMove;

	@ObfuscatedName("y.qb")
	public int preanimRouteLength;

	@ObfuscatedName("y.m")
	public boolean field394 = false;

	@ObfuscatedName("y.n")
	public final boolean field395 = false;

	@ObfuscatedName("y.q")
	public int field398;

	@ObfuscatedName("y.r")
	public boolean field399 = false;

	@ObfuscatedName("y.u")
	public int turnanim = -1;

	@ObfuscatedName("y.ab")
	public int field434;

	@ObfuscatedName("y.bb")
	public int field435;

	@ObfuscatedName("y.cb")
	public int field436;

	@ObfuscatedName("y.db")
	public int field437;

	@ObfuscatedName("y.eb")
	public int field438;

	@ObfuscatedName("y.fb")
	public int field439;

	@ObfuscatedName("y.gb")
	public int field440;

	@ObfuscatedName("y.kb")
	public int field444 = 32;

	@ObfuscatedName("y.H")
	public int field415 = -1000;

	@ObfuscatedName("y.K")
	public int field418 = -1;

	@ObfuscatedName("y.N")
	public int secondaryAnim = -1;

	@ObfuscatedName("y.Q")
	public int primaryAnim = -1;

	@ObfuscatedName("y.I")
	public int field416;

	@ObfuscatedName("y.J")
	public int field417;

	@ObfuscatedName("y.L")
	public int field419;

	@ObfuscatedName("y.M")
	public int field420;

	@ObfuscatedName("y.O")
	public int secondaryFrame;

	@ObfuscatedName("y.P")
	public int field423;

	@ObfuscatedName("y.R")
	public int primaryFrame;

	@ObfuscatedName("y.S")
	public int field426;

	@ObfuscatedName("y.T")
	public int primaryAnimDelay;

	@ObfuscatedName("y.U")
	public int field428;

	@ObfuscatedName("y.X")
	public int field431;

	@ObfuscatedName("y.Y")
	public int field432;

	@ObfuscatedName("y.A")
	public String chatMessage;

	@ObfuscatedName("y.a(IZIB)V")
	public final void teleport(int arg0, boolean arg1, int arg2, byte arg3) {
		if (primaryAnim != -1 && SeqType.list[primaryAnim].postanim_move == 1) {
			primaryAnim = -1;
		}
		if (!arg1) {
			int var5 = arg0 - routeX[0];
			int var6 = arg2 - routeZ[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (routeLength < 9) {
					routeLength++;
				}
				for (int var7 = routeLength; var7 > 0; var7--) {
					routeX[var7] = routeX[var7 - 1];
					routeZ[var7] = routeZ[var7 - 1];
					routeRun[var7] = routeRun[var7 - 1];
				}
				routeX[0] = arg0;
				routeZ[0] = arg2;
				routeRun[0] = false;
				return;
			}
		}
		routeLength = 0;
		preanimRouteLength = 0;
		animDelayMove = 0;
		routeX[0] = arg0;
		routeZ[0] = arg2;
		x = routeX[0] * 128 + size * 64;
		if (arg3 != 1) {
			field394 = !field394;
		}
		z = routeZ[0] * 128 + size * 64;
	}

	@ObfuscatedName("y.a(ZII)V")
	public final void moveCode(boolean arg0, int arg1, int arg2) {
		int var4 = routeX[0];
		int var5 = routeZ[0];
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
		if (primaryAnim != -1 && SeqType.list[primaryAnim].postanim_move == 1) {
			primaryAnim = -1;
		}
		if (routeLength < 9) {
			routeLength++;
		}
		for (int var6 = routeLength; var6 > 0; var6--) {
			routeX[var6] = routeX[var6 - 1];
			routeZ[var6] = routeZ[var6 - 1];
			routeRun[var6] = routeRun[var6 - 1];
		}
		routeX[0] = var4;
		routeZ[0] = var5;
		routeRun[0] = arg0;
		if (arg2 == -6002) {
			;
		}
	}

	@ObfuscatedName("y.a(Z)V")
	public final void abortRoute() {
		routeLength = 0;
		preanimRouteLength = 0;
	}

	@ObfuscatedName("y.a(IIIZ)V")
	public final void addHitmark(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (damageCycles[var4] <= arg1) {
				damageValues[var4] = arg2;
				damageTypes[var4] = arg0;
				damageCycles[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("y.b(Z)Z")
	public boolean isReady() {
		return false;
	}
}
