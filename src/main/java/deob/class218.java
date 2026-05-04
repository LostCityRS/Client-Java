package deob;

@ObfuscatedName("u")
public abstract class class218 extends ModelSource {

	@ObfuscatedName("u.bb")
	public int field4111 = 0;

	@ObfuscatedName("u.cb")
	public int field4112 = 100;

	@ObfuscatedName("u.db")
	public int field4113;

	@ObfuscatedName("u.eb")
	public int field4114 = -1;

	@ObfuscatedName("u.ib")
	public int field4118 = -1000;

	@ObfuscatedName("u.jb")
	public int field4119;

	@ObfuscatedName("u.kb")
	public int field4120 = 0;

	@ObfuscatedName("u.lb")
	public int field4121;

	@ObfuscatedName("u.mb")
	public int field4122 = -1;

	@ObfuscatedName("u.n")
	public JagString field4071 = null;

	@ObfuscatedName("u.nb")
	public int field4123 = -1;

	@ObfuscatedName("u.o")
	public int field4072;

	@ObfuscatedName("u.p")
	public final int[] field4073 = new int[4];

	@ObfuscatedName("u.pb")
	public int field4125;

	@ObfuscatedName("u.q")
	public final boolean[] field4074 = new boolean[10];

	@ObfuscatedName("u.r")
	public int field4075 = 0;

	@ObfuscatedName("u.rb")
	public int field4127 = 0;

	@ObfuscatedName("u.sb")
	public int field4128 = -1;

	@ObfuscatedName("u.t")
	public int field4077 = -1;

	@ObfuscatedName("u.u")
	public final int[] field4078 = new int[4];

	@ObfuscatedName("u.ub")
	public int field4130;

	@ObfuscatedName("u.vb")
	public final int[] field4131 = new int[4];

	@ObfuscatedName("u.w")
	public int field4080 = -1;

	@ObfuscatedName("u.wb")
	public int field4132 = 0;

	@ObfuscatedName("u.A")
	public int field4084 = -1;

	@ObfuscatedName("u.z")
	public int field4083 = 0;

	@ObfuscatedName("u.J")
	public boolean field4093 = false;

	@ObfuscatedName("u.O")
	public int field4098 = 0;

	@ObfuscatedName("u.x")
	public int field4081 = 0;

	@ObfuscatedName("u.U")
	public int field4104 = -1;

	@ObfuscatedName("u.F")
	public int field4089 = 0;

	@ObfuscatedName("u.X")
	public int field4107 = -32768;

	@ObfuscatedName("u.T")
	public int field4103 = 1;

	@ObfuscatedName("u.R")
	public int field4101 = 0;

	@ObfuscatedName("u.D")
	public final int[] field4087 = new int[10];

	@ObfuscatedName("u.H")
	public int field4091 = -1;

	@ObfuscatedName("u.S")
	public int field4102 = 32;

	@ObfuscatedName("u.W")
	public int field4106 = -1;

	@ObfuscatedName("u.M")
	public int field4096 = 0;

	@ObfuscatedName("u.V")
	public int field4105 = -1;

	@ObfuscatedName("u.Y")
	public int field4108 = 0;

	@ObfuscatedName("u.Cb")
	public int field4138 = 0;

	@ObfuscatedName("u.Bb")
	public int field4137 = 0;

	@ObfuscatedName("u.Eb")
	public int field4140 = 0;

	@ObfuscatedName("u.I")
	public int field4092 = -1;

	@ObfuscatedName("u.zb")
	public int field4135 = 0;

	@ObfuscatedName("u.P")
	public int field4099 = 0;

	@ObfuscatedName("u.Fb")
	public final int[] field4141 = new int[10];

	@ObfuscatedName("u.y")
	public int field4082;

	@ObfuscatedName("u.B")
	public int field4085;

	@ObfuscatedName("u.K")
	public int field4094;

	@ObfuscatedName("u.N")
	public int field4097;

	@ObfuscatedName("u.Q")
	public int field4100;

	@ObfuscatedName("u.Z")
	public int field4109;

	@ObfuscatedName("u.xb")
	public int field4133;

	@ObfuscatedName("u.Ab")
	public int field4136;

	@ObfuscatedName("u.Db")
	public int field4139;

	@ObfuscatedName("u.a(ZIII)V")
	public final void method1474(boolean arg0, int arg1, int arg2) {
		if (this.field4077 != -1 && SeqType.method75(this.field4077).field1980 == 1) {
			this.field4077 = -1;
		}
		if (!arg0) {
			int var4 = arg1 - this.field4087[0];
			int var5 = arg2 - this.field4141[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (this.field4135 < 9) {
					this.field4135++;
				}
				for (int var6 = this.field4135; var6 > 0; var6--) {
					this.field4087[var6] = this.field4087[var6 - 1];
					this.field4141[var6] = this.field4141[var6 - 1];
					this.field4074[var6] = this.field4074[var6 - 1];
				}
				this.field4074[0] = false;
				this.field4087[0] = arg1;
				this.field4141[0] = arg2;
				return;
			}
		}
		this.field4087[0] = arg1;
		this.field4141[0] = arg2;
		this.field4137 = 0;
		this.field4121 = this.field4103 * 64 + this.field4141[0] * 128;
		this.field4108 = 0;
		this.field4136 = this.field4103 * 64 + this.field4087[0] * 128;
		this.field4135 = 0;
	}

	@ObfuscatedName("u.b(I)I")
	public final int method1475() {
		return this.field4107 == -32768 ? 200 : -this.field4107;
	}

	@ObfuscatedName("u.a(BZI)V")
	public final void method1476(boolean arg0, int arg1) {
		int var3 = this.field4087[0];
		int var4 = this.field4141[0];
		if (this.field4077 != -1 && SeqType.method75(this.field4077).field1980 == 1) {
			this.field4077 = -1;
		}
		if (this.field4135 < 9) {
			this.field4135++;
		}
		for (int var5 = this.field4135; var5 > 0; var5--) {
			this.field4087[var5] = this.field4087[var5 - 1];
			this.field4141[var5] = this.field4141[var5 - 1];
			this.field4074[var5] = this.field4074[var5 - 1];
		}
		this.field4074[0] = arg0;
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
		this.field4087[0] = var3;
		this.field4141[0] = var4;
	}

	@ObfuscatedName("u.a(IIII)V")
	public final void method1477(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.field4073[var4] <= arg0) {
				this.field4131[var4] = arg2;
				this.field4078[var4] = arg1;
				this.field4073[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("u.c(I)V")
	public final void method1478() {
		this.field4135 = 0;
		this.field4137 = 0;
	}

	@ObfuscatedName("u.d(I)Z")
	public boolean method287() {
		return false;
	}
}
