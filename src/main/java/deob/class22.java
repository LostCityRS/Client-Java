package deob;

import java.util.Calendar;

@ObfuscatedName("bj")
public final class class22 extends class144 {

	@ObfuscatedName("bj.cb")
	public volatile boolean[] field330;

	@ObfuscatedName("bj.eb")
	public static final class88 field332 = class208.method1423(105, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@ObfuscatedName("bj.fb")
	public final class222 field333;

	@ObfuscatedName("bj.gb")
	public final int field334;

	@ObfuscatedName("bj.mb")
	public final class222 field340;

	@ObfuscatedName("bj.ob")
	public boolean field342 = false;

	@ObfuscatedName("bj.qb")
	public static final class88 field344 = class208.method1423(105, "::errortest");

	@ObfuscatedName("bj.tb")
	public int field347;

	@ObfuscatedName("bj.ub")
	public volatile boolean field348 = false;

	@ObfuscatedName("bj.vb")
	public int field349;

	@ObfuscatedName("bj.zb")
	public static final Calendar field353 = Calendar.getInstance();

	@ObfuscatedName("bj.Bb")
	public static boolean field355 = true;

	@ObfuscatedName("bj.Cb")
	public static final class88 field356 = class208.method1423(105, "(U0a )2 via: ");

	@ObfuscatedName("bj.Db")
	public static final class88 field357 = class208.method1423(105, "Bitte geben Sie Ihren Benutzernamen ein)3");

	@ObfuscatedName("bj.yb")
	public int field352 = -1;

	@ObfuscatedName("bj.xb")
	public static int[] field351;

	@ObfuscatedName("bj.b(BI)Lqb;")
	public static class176 method106(int arg0) {
		class176 var1 = (class176) class168.field3228.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class34.field584.method939(arg0, 26);
		class176 var3 = new class176();
		if (var2 != null) {
			var3.method1264(new class46(var2));
		}
		class168.field3228.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("bj.c(Z)V")
	public static void method107() {
		try {
			if (class122.field2230 == 1) {
				int var0 = class31.field503.method1197();
				if (var0 > 0 && class31.field503.method1199()) {
					int var1 = var0 - class172.field3343;
					if (var1 < 0) {
						var1 = 0;
					}
					class31.field503.method1186(var1);
				} else {
					class31.field503.method1208();
					class31.field503.method1180();
					class248.field4552 = null;
					class196.field3764 = null;
					if (class158.field3039 == null) {
						class122.field2230 = 0;
					} else {
						class122.field2230 = 2;
					}
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			class31.field503.method1208();
			class248.field4552 = null;
			class158.field3039 = null;
			class196.field3764 = null;
			class122.field2230 = 0;
		}
	}

	@ObfuscatedName("bj.a([[IB)V")
	public static void method114(int[][] arg0) {
		class3.field42 = arg0;
	}

	@ObfuscatedName("bj.a(IBIIZI)Lrc;")
	public static class188 method117(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		long var5 = ((long) arg4 << 40) + ((long) arg2 << 16) + (long) arg1 + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 38);
		class188 var7 = (class188) class206.field3920.method665(var5);
		if (var7 != null) {
			return var7;
		}
		class173.field3364 = false;
		class188 var8 = class77.method516(arg1, arg2, arg4, arg0, false, arg3);
		if (var8 != null && !class173.field3364) {
			class206.field3920.method663(var5, var8);
		}
		return var8;
	}

	@ObfuscatedName("bj.d(I)V")
	public static void method118() {
		boolean var0 = false;
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < class203.field3862 - 1; var1++) {
				if (class53.field994[var1] < 1000 && class53.field994[var1 + 1] > 1000) {
					var0 = false;
					class88 var2 = class201.field3836[var1];
					class201.field3836[var1] = class201.field3836[var1 + 1];
					class201.field3836[var1 + 1] = var2;
					class88 var3 = class66.field1191[var1];
					class66.field1191[var1] = class66.field1191[var1 + 1];
					class66.field1191[var1 + 1] = var3;
					int var4 = class165.field3176[var1];
					class165.field3176[var1] = class165.field3176[var1 + 1];
					class165.field3176[var1 + 1] = var4;
					int var5 = class217.field4060[var1];
					class217.field4060[var1] = class217.field4060[var1 + 1];
					class217.field4060[var1 + 1] = var5;
					short var6 = class53.field994[var1];
					class53.field994[var1] = class53.field994[var1 + 1];
					class53.field994[var1 + 1] = var6;
					long var7 = class74.field1352[var1];
					class74.field1352[var1] = class74.field1352[var1 + 1];
					class74.field1352[var1 + 1] = var7;
				}
			}
		}
	}

	public class22(class222 arg0, class222 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.field340 = arg1;
		this.field342 = arg5;
		this.field334 = arg2;
		this.field333 = arg0;
		class119.method814(this.field334, this);
	}

	@ObfuscatedName("bj.a(I[BZIZ)V")
	public void method105(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
		if (arg3) {
			if (this.field348) {
				throw new RuntimeException();
			}
			if (this.field340 != null) {
				class36.method244(arg1, this.field334, this.field340);
			}
			this.method967(arg1);
			this.method113();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.field2668[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) super.field2668[arg0];
		if (this.field333 != null) {
			class36.method244(arg1, arg0, this.field333);
			this.field330[arg0] = true;
		}
		if (arg2) {
			super.field2706[arg0] = class168.method1153(arg1);
			return;
		}
	}

	@ObfuscatedName("bj.c(III)V")
	public void method109(int arg0, int arg1) {
		this.field349 = arg0;
		this.field347 = arg1;
		if (this.field340 == null) {
			class188.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
		} else {
			class81.method540(this, this.field334, this.field340);
		}
	}

	@ObfuscatedName("bj.a(II)V")
	@Override
	public void method110(int arg0) {
		if (this.method968(arg0)) {
			class59.method426(this.field334, arg0);
		}
	}

	@ObfuscatedName("bj.a([BILud;BZ)V")
	public void method111(byte[] arg0, int arg1, class222 arg2, boolean arg3) {
		if (arg2 != this.field340) {
			if (!arg3 && arg1 == this.field352) {
				this.field348 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.field330[arg1] = false;
				if (this.field342 || arg3) {
					class188.method1312(this, arg1, this.field334, (byte) 2, super.field2690[arg1], arg3);
				}
				return;
			}
			class226.field4241.reset();
			class226.field4241.update(arg0, 0, arg0.length - 2);
			int var5 = (int) class226.field4241.getValue();
			int var6 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
			if (var5 != super.field2690[arg1] || super.field2668[arg1] != var6) {
				this.field330[arg1] = false;
				if (this.field342 || arg3) {
					class188.method1312(this, arg1, this.field334, (byte) 2, super.field2690[arg1], arg3);
				}
				return;
			}
			this.field330[arg1] = true;
			if (arg3) {
				super.field2706[arg1] = class168.method1153(arg0);
				return;
			}
			return;
		}
		if (this.field348) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			class188.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		class226.field4241.reset();
		class226.field4241.update(arg0, 0, arg0.length);
		int var7 = (int) class226.field4241.getValue();
		if (var7 != this.field349) {
			class188.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		class46 var8;
		try {
			var8 = new class46(class23.method119(arg0));
		} catch (RuntimeException var11) {
			class188.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		int var9 = var8.method347();
		if (var9 != 5 && var9 != 6) {
			class188.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		int var10 = 0;
		if (var9 >= 6) {
			var10 = var8.method323();
		}
		if (this.field347 != var10) {
			class188.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		this.method967(arg0);
		this.method113();
	}

	@ObfuscatedName("bj.a(IZ)V")
	@Override
	public void method112(int arg0) {
		if (!this.method968(arg0)) {
			return;
		}
		if (this.field333 == null || this.field330 == null || !this.field330[arg0]) {
			class188.method1312(this, arg0, this.field334, (byte) 2, super.field2690[arg0], true);
		} else {
			class81.method540(this, arg0, this.field333);
		}
	}

	@ObfuscatedName("bj.c(I)V")
	public void method113() {
		this.field330 = new boolean[super.field2706.length];
		for (int var1 = 0; var1 < this.field330.length; var1++) {
			this.field330[var1] = false;
		}
		if (this.field333 == null) {
			this.field348 = true;
			return;
		}
		this.field352 = -1;
		for (int var2 = 0; var2 < this.field330.length; var2++) {
			if (super.field2683[var2] > 0) {
				class122.method828(var2, this, this.field333);
				this.field352 = var2;
			}
		}
		if (this.field352 == -1) {
			this.field348 = true;
		}
	}

	@ObfuscatedName("bj.d(Z)I")
	public int method115() {
		if (this.field348) {
			return 100;
		} else if (super.field2706 == null) {
			int var1 = class228.method1523(255, this.field334);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("bj.a(BI)I")
	@Override
	public int method116(int arg0) {
		if (!this.method968(arg0)) {
			return 0;
		} else if (super.field2706[arg0] == null) {
			return this.field330[arg0] ? 100 : class228.method1523(this.field334, arg0);
		} else {
			return 100;
		}
	}
}
