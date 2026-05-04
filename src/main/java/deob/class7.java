package deob;

@ObfuscatedName("af")
public final class class7 extends class136 {

	@ObfuscatedName("af.K")
	public static final class88 field102 = class208.method1423(105, "sl_stars");

	@ObfuscatedName("af.S")
	public static short[] field108 = new short[256];

	@ObfuscatedName("af.U")
	public static int field110 = 0;

	@ObfuscatedName("af.I")
	public static int field100 = 0;

	@ObfuscatedName("af.Y")
	public static final class88[] field114 = new class88[1000];

	@ObfuscatedName("af.L")
	public int field103 = 1190717;

	@ObfuscatedName("af.M")
	public int field104 = -1;

	@ObfuscatedName("af.W")
	public int field112 = 16;

	@ObfuscatedName("af.F")
	public int field98 = -1;

	@ObfuscatedName("af.X")
	public boolean field113 = true;

	@ObfuscatedName("af.V")
	public int field111 = 0;

	@ObfuscatedName("af.G")
	public static boolean field99;

	@ObfuscatedName("af.P")
	public static class130[] field106;

	@ObfuscatedName("af.D")
	public static short[][] field96;

	@ObfuscatedName("af.N")
	public static byte[][][] field105;

	@ObfuscatedName("af.d(B)V")
	public static void method37() {
		class241.field4470.method134();
	}

	@ObfuscatedName("af.d(I)V")
	public static void method39() {
		class156.field3012 = null;
		class221.field4174 = null;
		class234.field4377 = null;
		class221.field4173 = null;
		class135.field2511 = null;
		class151.field2940 = null;
		class111.field2020 = null;
		class8.field115 = null;
		class164.field3142 = null;
		class109.field1962 = null;
		class85.field1541 = null;
	}

	@ObfuscatedName("af.a(III)V")
	public static void method42(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field956 = null;
		}
	}

	@ObfuscatedName("af.a(ILea;I)V")
	public void method38(class46 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method347();
			if (var3 == 0) {
				return;
			}
			this.method41(arg1, var3, arg0);
		}
	}

	@ObfuscatedName("af.a(IIILea;)V")
	public void method41(int arg0, int arg1, class46 arg2) {
		if (arg1 == 1) {
			this.field111 = class131.method883(arg2.method304());
		} else if (arg1 == 2) {
			this.field98 = arg2.method347();
		} else if (arg1 == 3) {
			this.field98 = arg2.method301();
			if (this.field98 == 65535) {
				this.field98 = -1;
			}
		} else if (arg1 == 5) {
			this.field113 = false;
		} else if (arg1 == 7) {
			this.field104 = class131.method883(arg2.method304());
		} else if (arg1 == 8) {
			class133.field2489 = arg0;
		} else if (arg1 == 9) {
			arg2.method301();
		} else if (arg1 != 10) {
			if (arg1 == 11) {
				arg2.method347();
			} else if (arg1 != 12) {
				if (arg1 == 13) {
					this.field103 = arg2.method304();
				} else if (arg1 == 14) {
					this.field112 = arg2.method347();
				}
			}
		}
	}
}
