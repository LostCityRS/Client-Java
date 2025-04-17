package deob;

@ObfuscatedName("z")
public class PathingEntity extends Entity {

	@ObfuscatedName("z.l")
	public boolean field402 = true;

	@ObfuscatedName("z.m")
	public int field403 = 354;

	@ObfuscatedName("z.n")
	public int field404;

	@ObfuscatedName("z.o")
	public int field405;

	@ObfuscatedName("z.p")
	public int field406;

	@ObfuscatedName("z.q")
	public boolean field407 = false;

	@ObfuscatedName("z.r")
	public int field408 = 1;

	@ObfuscatedName("z.s")
	public int field409 = -1;

	@ObfuscatedName("z.t")
	public int field410 = -1;

	@ObfuscatedName("z.u")
	public int field411 = -1;

	@ObfuscatedName("z.v")
	public int field412 = -1;

	@ObfuscatedName("z.w")
	public int field413 = -1;

	@ObfuscatedName("z.x")
	public int field414 = -1;

	@ObfuscatedName("z.y")
	public int field415 = -1;

	@ObfuscatedName("z.z")
	public String field416;

	@ObfuscatedName("z.ab")
	public int field443;

	@ObfuscatedName("z.bb")
	public int field444;

	@ObfuscatedName("z.cb")
	public int field445;

	@ObfuscatedName("z.db")
	public int field446;

	@ObfuscatedName("z.eb")
	public int field447;

	@ObfuscatedName("z.fb")
	public int field448;

	@ObfuscatedName("z.gb")
	public int field449;

	@ObfuscatedName("z.hb")
	public int field450;

	@ObfuscatedName("z.ib")
	public int field451;

	@ObfuscatedName("z.jb")
	public int field452;

	@ObfuscatedName("z.kb")
	public int[] field453 = new int[10];

	@ObfuscatedName("z.lb")
	public int[] field454 = new int[10];

	@ObfuscatedName("z.mb")
	public boolean[] field455 = new boolean[10];

	@ObfuscatedName("z.nb")
	public int field456;

	@ObfuscatedName("z.ob")
	public int field457;

	@ObfuscatedName("z.A")
	public int field417 = 100;

	@ObfuscatedName("z.D")
	public int[] field420 = new int[4];

	@ObfuscatedName("z.E")
	public int[] field421 = new int[4];

	@ObfuscatedName("z.F")
	public int[] field422 = new int[4];

	@ObfuscatedName("z.G")
	public int field423 = -1000;

	@ObfuscatedName("z.J")
	public int field426 = -1;

	@ObfuscatedName("z.M")
	public int field429 = -1;

	@ObfuscatedName("z.P")
	public int field432 = -1;

	@ObfuscatedName("z.U")
	public int field437 = -1;

	@ObfuscatedName("z.B")
	public int field418;

	@ObfuscatedName("z.C")
	public int field419;

	@ObfuscatedName("z.H")
	public int field424;

	@ObfuscatedName("z.I")
	public int field425;

	@ObfuscatedName("z.K")
	public int field427;

	@ObfuscatedName("z.L")
	public int field428;

	@ObfuscatedName("z.N")
	public int field430;

	@ObfuscatedName("z.O")
	public int field431;

	@ObfuscatedName("z.Q")
	public int field433;

	@ObfuscatedName("z.R")
	public int field434;

	@ObfuscatedName("z.S")
	public int field435;

	@ObfuscatedName("z.T")
	public int field436;

	@ObfuscatedName("z.V")
	public int field438;

	@ObfuscatedName("z.W")
	public int field439;

	@ObfuscatedName("z.X")
	public int field440;

	@ObfuscatedName("z.Y")
	public int field441;

	@ObfuscatedName("z.Z")
	public int field442;

	@ObfuscatedName("z.a(ZIII)V")
	public final void method123(boolean arg0, int arg1, int arg2, int arg3) {
		if (this.field432 != -1 && SeqType.field1120[this.field432].field1133 == 1) {
			this.field432 = -1;
		}
		if (!arg0) {
			int var5 = arg1 - this.field453[0];
			int var6 = arg2 - this.field454[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.field452 < 9) {
					this.field452++;
				}
				for (int var7 = this.field452; var7 > 0; var7--) {
					this.field453[var7] = this.field453[var7 - 1];
					this.field454[var7] = this.field454[var7 - 1];
					this.field455[var7] = this.field455[var7 - 1];
				}
				this.field453[0] = arg1;
				this.field454[0] = arg2;
				this.field455[0] = false;
				return;
			}
		}
		this.field452 = 0;
		this.field457 = 0;
		this.field456 = 0;
		this.field453[0] = arg1;
		this.field454[0] = arg2;
		this.field404 = this.field453[0] * 128 + this.field408 * 64;
		if (arg3 >= 7 && arg3 <= 7) {
			this.field405 = this.field454[0] * 128 + this.field408 * 64;
		}
	}

	@ObfuscatedName("z.a(IZZ)V")
	public final void method124(int arg0, boolean arg1, boolean arg2) {
		if (!arg2) {
			this.field402 = !this.field402;
		}
		int var4 = this.field453[0];
		int var5 = this.field454[0];
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
		if (this.field432 != -1 && SeqType.field1120[this.field432].field1133 == 1) {
			this.field432 = -1;
		}
		if (this.field452 < 9) {
			this.field452++;
		}
		for (int var6 = this.field452; var6 > 0; var6--) {
			this.field453[var6] = this.field453[var6 - 1];
			this.field454[var6] = this.field454[var6 - 1];
			this.field455[var6] = this.field455[var6 - 1];
		}
		this.field453[0] = var4;
		this.field454[0] = var5;
		this.field455[0] = arg1;
	}

	@ObfuscatedName("z.b(I)V")
	public final void method125(int arg0) {
		this.field452 = 0;
		this.field457 = 0;
		if (arg0 < 2 || arg0 > 2) {
			this.field403 = 186;
		}
	}

	@ObfuscatedName("z.a(B)Z")
	public boolean method126(byte arg0) {
		if (arg0 != 8) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void method127(int arg0, int arg1, int arg2) {
		if (arg1 != 0) {
			this.field403 = -191;
		}
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.field422[var4] <= client.field1588) {
				this.field420[var4] = arg2;
				this.field421[var4] = arg0;
				this.field422[var4] = client.field1588 + 70;
				return;
			}
		}
	}
}
