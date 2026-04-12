package deob;

@ObfuscatedName("md")
public final class class76 extends class44 {

	@ObfuscatedName("md.sb")
	public static int field1881 = -1;

	@ObfuscatedName("md.tb")
	public int field1882;

	@ObfuscatedName("md.vb")
	public int field1884;

	@ObfuscatedName("md.Jb")
	public int field1898 = 0;

	@ObfuscatedName("md.yb")
	public int field1887;

	@ObfuscatedName("md.Eb")
	public int field1893;

	@ObfuscatedName("md.b(IB)V")
	public void method699(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var2 > var6) {
			var8 = var6;
		}
		if (var4 < var8) {
			var8 = var4;
		}
		double var10 = var2;
		if (var2 < var6) {
			var10 = var6;
		}
		double var12 = 0.0D;
		if (var10 < var4) {
			var10 = var4;
		}
		double var14 = (var8 + var10) / 2.0D;
		this.field1882 = (int) (var14 * 256.0D);
		double var16 = 0.0D;
		if (var8 != var10) {
			if (var14 < 0.5D) {
				var16 = (var10 - var8) / (var8 + var10);
			}
			if (var14 >= 0.5D) {
				var16 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var6 - var4) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = (var4 - var2) / (var10 - var8) + 2.0D;
			} else if (var4 == var10) {
				var12 = (var2 - var6) / (-var8 + var10) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		if (this.field1882 < 0) {
			this.field1882 = 0;
		} else if (this.field1882 > 255) {
			this.field1882 = 255;
		}
		if (var14 > 0.5D) {
			this.field1887 = (int) ((1.0D - var14) * var16 * 512.0D);
		} else {
			this.field1887 = (int) (var14 * var16 * 512.0D);
		}
		this.field1893 = (int) (var16 * 256.0D);
		if (this.field1887 < 1) {
			this.field1887 = 1;
		}
		this.field1884 = (int) ((double) this.field1887 * var18);
		if (this.field1893 < 0) {
			this.field1893 = 0;
		} else if (this.field1893 > 255) {
			this.field1893 = 255;
			return;
		}
	}

	@ObfuscatedName("md.b(Z)V")
	public void method701() {
		this.method699(this.field1898);
	}

	@ObfuscatedName("md.a(BILba;)V")
	public void method704(int arg0, class8 arg1) {
		while (true) {
			int var3 = arg1.method144();
			if (var3 == 0) {
				return;
			}
			this.method706(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("md.a(BILba;I)V")
	public void method706(int arg0, class8 arg1, int arg2) {
		if (arg0 == 1) {
			this.field1898 = arg1.method164();
		}
	}
}
