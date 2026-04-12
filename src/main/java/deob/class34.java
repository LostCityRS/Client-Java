package deob;

@ObfuscatedName("fc")
public final class class34 extends class44 {

	@ObfuscatedName("fc.sb")
	public static JagString field889 = JagString.wrap("Malformed login packet)3");

	@ObfuscatedName("fc.tb")
	public static JagString field890 = JagString.wrap("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@ObfuscatedName("fc.xb")
	public static int field894 = 0;

	@ObfuscatedName("fc.Fb")
	public static JagString field902 = JagString.wrap("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@ObfuscatedName("fc.zb")
	public static int field896 = 0;

	@ObfuscatedName("fc.Db")
	public static JagString field900 = field889;

	@ObfuscatedName("fc.Bb")
	public static byte[][][] field898 = new byte[4][104][104];

	@ObfuscatedName("fc.Gb")
	public static int field903 = -1;

	@ObfuscatedName("fc.Lb")
	public static int[][][] field908 = new int[4][13][13];

	@ObfuscatedName("fc.Wb")
	public static volatile long field919 = 0L;

	@ObfuscatedName("fc.Qb")
	public boolean field913 = true;

	@ObfuscatedName("fc.Ab")
	public int field897 = -1;

	@ObfuscatedName("fc.Ob")
	public int field911 = -1;

	@ObfuscatedName("fc.Xb")
	public int field920 = 0;

	@ObfuscatedName("fc.yb")
	public int field895;

	@ObfuscatedName("fc.Ib")
	public int field905;

	@ObfuscatedName("fc.Kb")
	public int field907;

	@ObfuscatedName("fc.Mb")
	public int field909;

	@ObfuscatedName("fc.Pb")
	public int field912;

	@ObfuscatedName("fc.Yb")
	public int field921;

	@ObfuscatedName("fc.a(BILba;)V")
	public void method393(int arg0, class8 arg1) {
		while (true) {
			int var3 = arg1.method144();
			if (var3 == 0) {
				return;
			}
			this.method396(arg0, arg1, var3);
		}
	}

	@ObfuscatedName("fc.c(B)V")
	public void method395() {
		if (this.field911 != -1) {
			this.method401(this.field911);
			this.field905 = this.field895;
			this.field921 = this.field912;
			this.field909 = this.field907;
		}
		this.method401(this.field920);
	}

	@ObfuscatedName("fc.a(ILba;IB)V")
	public void method396(int arg0, class8 arg1, int arg2) {
		if (arg2 == 1) {
			this.field920 = arg1.method164();
		} else if (arg2 == 2) {
			this.field897 = arg1.method144();
		} else if (arg2 == 5) {
			this.field913 = false;
		} else if (arg2 == 7) {
			this.field911 = arg1.method164();
			return;
		}
	}

	@ObfuscatedName("fc.c(II)V")
	public void method401(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var8 > var6) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		if (var6 > var10) {
			var10 = var6;
		}
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.field907 = (int) (var18 * 256.0D);
		this.field895 = (int) (var16 * 256.0D);
		this.field912 = (int) (var14 * 256.0D);
		if (this.field912 < 0) {
			this.field912 = 0;
		} else if (this.field912 > 255) {
			this.field912 = 255;
		}
		if (this.field895 < 0) {
			this.field895 = 0;
		} else if (this.field895 > 255) {
			this.field895 = 255;
		}
	}
}
