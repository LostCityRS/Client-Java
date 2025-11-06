package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.SeqType;

@ObfuscatedName("z")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("z.o")
	public int field410;

	@ObfuscatedName("z.p")
	public int field411;

	@ObfuscatedName("z.q")
	public int field412;

	@ObfuscatedName("z.r")
	public boolean field413 = false;

	@ObfuscatedName("z.s")
	public int field414 = 1;

	@ObfuscatedName("z.t")
	public int field415 = -1;

	@ObfuscatedName("z.u")
	public int field416 = -1;

	@ObfuscatedName("z.v")
	public int field417 = -1;

	@ObfuscatedName("z.w")
	public int field418 = -1;

	@ObfuscatedName("z.x")
	public int field419 = -1;

	@ObfuscatedName("z.y")
	public int field420 = -1;

	@ObfuscatedName("z.z")
	public int field421 = -1;

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
	public int field455;

	@ObfuscatedName("z.ib")
	public int field456 = 200;

	@ObfuscatedName("z.jb")
	public int field457;

	@ObfuscatedName("z.kb")
	public int field458 = 32;

	@ObfuscatedName("z.lb")
	public int field459;

	@ObfuscatedName("z.mb")
	public int[] field460 = new int[10];

	@ObfuscatedName("z.nb")
	public int[] field461 = new int[10];

	@ObfuscatedName("z.ob")
	public boolean[] field462 = new boolean[10];

	@ObfuscatedName("z.pb")
	public int field463;

	@ObfuscatedName("z.qb")
	public int field464;

	@ObfuscatedName("z.B")
	public int field423 = 100;

	@ObfuscatedName("z.E")
	public int[] field426 = new int[4];

	@ObfuscatedName("z.F")
	public int[] field427 = new int[4];

	@ObfuscatedName("z.G")
	public int[] field428 = new int[4];

	@ObfuscatedName("z.H")
	public int field429 = -1000;

	@ObfuscatedName("z.K")
	public int field432 = -1;

	@ObfuscatedName("z.N")
	public int field435 = -1;

	@ObfuscatedName("z.Q")
	public int field438 = -1;

	@ObfuscatedName("z.V")
	public int field443 = -1;

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
	public int field436;

	@ObfuscatedName("z.P")
	public int field437;

	@ObfuscatedName("z.R")
	public int field439;

	@ObfuscatedName("z.S")
	public int field440;

	@ObfuscatedName("z.T")
	public int field441;

	@ObfuscatedName("z.U")
	public int field442;

	@ObfuscatedName("z.W")
	public int field444;

	@ObfuscatedName("z.X")
	public int field445;

	@ObfuscatedName("z.Y")
	public int field446;

	@ObfuscatedName("z.Z")
	public int field447;

	@ObfuscatedName("z.A")
	public String field422;

	@ObfuscatedName("z.a(IIZZ)V")
	public final void method124(int arg0, int arg1, boolean arg3) {
		if (this.field438 != -1 && SeqType.field1112[this.field438].field1125 == 1) {
			this.field438 = -1;
		}
		if (!arg3) {
			int var5 = arg1 - this.field460[0];
			int var6 = arg0 - this.field461[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.field459 < 9) {
					this.field459++;
				}
				for (int var7 = this.field459; var7 > 0; var7--) {
					this.field460[var7] = this.field460[var7 - 1];
					this.field461[var7] = this.field461[var7 - 1];
					this.field462[var7] = this.field462[var7 - 1];
				}
				this.field460[0] = arg1;
				this.field461[0] = arg0;
				this.field462[0] = false;
				return;
			}
		}
		this.field459 = 0;
		this.field464 = 0;
		this.field463 = 0;
		this.field460[0] = arg1;
		this.field461[0] = arg0;
		this.field410 = this.field460[0] * 128 + this.field414 * 64;
		this.field411 = this.field461[0] * 128 + this.field414 * 64;
	}

	@ObfuscatedName("z.a(ZIB)V")
	public final void method125(boolean arg0, int arg1) {
		int var4 = this.field460[0];
		int var5 = this.field461[0];
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
		if (this.field438 != -1 && SeqType.field1112[this.field438].field1125 == 1) {
			this.field438 = -1;
		}
		if (this.field459 < 9) {
			this.field459++;
		}
		for (int var6 = this.field459; var6 > 0; var6--) {
			this.field460[var6] = this.field460[var6 - 1];
			this.field461[var6] = this.field461[var6 - 1];
			this.field462[var6] = this.field462[var6 - 1];
		}
		this.field460[0] = var4;
		this.field461[0] = var5;
		this.field462[0] = arg0;
	}

	@ObfuscatedName("z.a(Z)V")
	public final void method126() {
		this.field459 = 0;
		this.field464 = 0;
	}

	@ObfuscatedName("z.b(I)Z")
	public boolean method127() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void method128(int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.field428[var4] <= Client.field1591) {
				this.field426[var4] = arg2;
				this.field427[var4] = arg1;
				this.field428[var4] = Client.field1591 + 70;
				return;
			}
		}
	}
}
