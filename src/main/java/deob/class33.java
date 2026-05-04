package deob;

@ObfuscatedName("cj")
public final class class33 extends class136 {

	@ObfuscatedName("cj.ab")
	public short[] field549;

	@ObfuscatedName("cj.bb")
	public int field550 = 0;

	@ObfuscatedName("cj.cb")
	public static final int[] field551 = new int[] { -1, -1, 1, 1 };

	@ObfuscatedName("cj.db")
	public static final class88 field552 = class208.method1423(105, "Schlie-8en");

	@ObfuscatedName("cj.eb")
	public static final class88 field553 = class208.method1423(105, "<col=40ff00>");

	@ObfuscatedName("cj.fb")
	public static final class88 field554 = class208.method1423(105, "Schrifts-=tze geladen)3");

	@ObfuscatedName("cj.gb")
	public static final class92 field555 = new class92(128);

	@ObfuscatedName("cj.hb")
	public static class137 field556;

	@ObfuscatedName("cj.F")
	public static long field528 = 0L;

	@ObfuscatedName("cj.N")
	public static int field536 = 0;

	@ObfuscatedName("cj.S")
	public static int field541 = -1;

	@ObfuscatedName("cj.V")
	public static final class88 field544 = class208.method1423(105, "Close");

	@ObfuscatedName("cj.H")
	public static class88 field530 = field544;

	@ObfuscatedName("cj.K")
	public static final Object field533 = new Object();

	@ObfuscatedName("cj.L")
	public int field534 = 128;

	@ObfuscatedName("cj.I")
	public int field531 = 0;

	@ObfuscatedName("cj.R")
	public int field540 = 128;

	@ObfuscatedName("cj.D")
	public boolean field527 = false;

	@ObfuscatedName("cj.W")
	public int field545 = 0;

	@ObfuscatedName("cj.T")
	public int field542 = -1;

	@ObfuscatedName("cj.Q")
	public int field539;

	@ObfuscatedName("cj.Y")
	public int field547;

	@ObfuscatedName("cj.G")
	public short[] field529;

	@ObfuscatedName("cj.O")
	public short[] field537;

	@ObfuscatedName("cj.Z")
	public short[] field548;

	@ObfuscatedName("cj.a(BLi;)Lwe;")
	public static class244 method207(class88 arg0) {
		if (arg0.method604() == 0) {
			return null;
		}
		for (class244 var1 = (class244) class159.field3049.method1610(); var1 != null; var1 = (class244) class159.field3049.method1619()) {
			if (var1.field4486.method595(arg0)) {
				return var1;
			}
		}
		return null;
	}

	@ObfuscatedName("cj.d(I)V")
	public static void method210() {
		class223.field4196 = 0;
		class192.field3702 = 0;
		class168.method1151();
		class16.method79();
		class95.method676();
		class172.method1218();
		for (int var0 = 0; var0 < class223.field4196; var0++) {
			int var1 = class53.field999[var0];
			if (class117.field2113 != class244.field4491[var1].field4081) {
				class244.field4491[var1] = null;
			}
		}
		if (class230.field4312.field831 != class228.field4270) {
			throw new RuntimeException("gpp1 pos:" + class230.field4312.field831 + " psize:" + class228.field4270);
		}
		for (int var2 = 0; var2 < class55.field1027; var2++) {
			if (class244.field4491[class174.field3428[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class55.field1027);
			}
		}
	}

	@ObfuscatedName("cj.a(ILea;B)V")
	public void method208(int arg0, class46 arg1) {
		if (arg0 == 1) {
			this.field547 = arg1.method301();
		} else if (arg0 == 2) {
			this.field542 = arg1.method301();
		} else if (arg0 == 4) {
			this.field540 = arg1.method301();
		} else if (arg0 == 5) {
			this.field534 = arg1.method301();
		} else if (arg0 == 6) {
			this.field545 = arg1.method301();
		} else if (arg0 == 7) {
			this.field550 = arg1.method347();
		} else if (arg0 == 8) {
			this.field531 = arg1.method347();
		} else if (arg0 == 9) {
			this.field527 = true;
		} else if (arg0 == 40) {
			int var5 = arg1.method347();
			this.field537 = new short[var5];
			this.field549 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field537[var6] = (short) arg1.method301();
				this.field549[var6] = (short) arg1.method301();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.method347();
			this.field548 = new short[var3];
			this.field529 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field529[var4] = (short) arg1.method301();
				this.field548[var4] = (short) arg1.method301();
			}
		}
	}

	@ObfuscatedName("cj.a(IB)Lcg;")
	public class30 method209(int arg0) {
		class30 var2 = (class30) class230.field4302.method135((long) this.field539);
		if (var2 == null) {
			class82 var3 = class82.method568(class141.field2607, this.field547);
			if (var3 == null) {
				return null;
			}
			if (this.field537 != null) {
				for (int var4 = 0; var4 < this.field537.length; var4++) {
					var3.method564(this.field537[var4], this.field549[var4]);
				}
			}
			if (this.field529 != null) {
				for (int var5 = 0; var5 < this.field529.length; var5++) {
					var3.method553(this.field529[var5], this.field548[var5]);
				}
			}
			var2 = var3.method546(this.field550 + 64, this.field531 + 850, -30, -50, -30);
			class230.field4302.method130((long) this.field539, var2);
		}
		class30 var6;
		if (this.field542 == -1 || arg0 == -1) {
			var6 = var2.method185(true, true);
		} else {
			var6 = class15.method75(this.field542).method741(var2, arg0);
		}
		if (this.field540 != 128 || this.field534 != 128) {
			var6.method183(this.field540, this.field534, this.field540);
		}
		if (this.field545 != 0) {
			if (this.field545 == 90) {
				var6.method182();
			}
			if (this.field545 == 180) {
				var6.method190();
			}
			if (this.field545 == 270) {
				var6.method181();
			}
		}
		return var6;
	}

	@ObfuscatedName("cj.a(Lea;B)V")
	public void method211(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method208(var2, arg0);
		}
	}
}
