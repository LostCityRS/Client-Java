package deob;

@ObfuscatedName("qb")
public final class Decimator {

	@ObfuscatedName("qb.e")
	public static int field2409 = 0;

	@ObfuscatedName("qb.f")
	public static int field2410 = 0;

	@ObfuscatedName("qb.g")
	public int[][] field2411;

	@ObfuscatedName("qb.j")
	public final int field2414;

	@ObfuscatedName("qb.l")
	public final int field2416;

	@ObfuscatedName("qb.q")
	public static int field2421 = -1;

	@ObfuscatedName("qb.a(II)I")
	public int method840(int arg0) {
		if (this.field2411 != null) {
			arg0 = this.field2416 * arg0 / this.field2414 + 7;
		}
		return arg0;
	}

	@ObfuscatedName("qb.b(II)I")
	public int method842(int arg0) {
		if (this.field2411 != null) {
			arg0 = this.field2416 * arg0 / this.field2414;
		}
		return arg0;
	}

	@ObfuscatedName("qb.a([BZ)[B")
	public byte[] method845(byte[] arg0) {
		if (this.field2411 != null) {
			int var2 = arg0.length * this.field2416 / this.field2414 + 14;
			int var3 = 0;
			int[] var4 = new int[var2];
			int var5 = 0;
			for (int var6 = 0; var6 < arg0.length; var6++) {
				byte var7 = arg0[var6];
				int[] var8 = this.field2411[var5];
				for (int var9 = 0; var9 < 14; var9++) {
					var4[var3 + var9] += var8[var9] * var7;
				}
				int var10 = this.field2416 + var5;
				int var11 = var10 / this.field2414;
				var5 = var10 - this.field2414 * var11;
				var3 += var11;
			}
			arg0 = new byte[var2];
			for (int var12 = 0; var12 < var2; var12++) {
				int var13 = var4[var12] + 32768 >> 16;
				if (var13 < -128) {
					arg0[var12] = -128;
				} else if (var13 > 127) {
					arg0[var12] = 127;
				} else {
					arg0[var12] = (byte) var13;
				}
			}
		}
		return arg0;
	}

	public Decimator(int arg0, int arg1) {
		int var3 = Statics.method900(arg1, 22050);
		int var4 = 22050 / var3;
		this.field2414 = var4;
		int var5 = arg1 / var3;
		this.field2416 = var5;
		if (var4 != var5) {
			this.field2411 = new int[var4][14];
			for (int var6 = 0; var6 < var4; var6++) {
				int[] var7 = this.field2411[var6];
				double var8 = (double) var6 / (double) var4 + 6.0D;
				double var10 = (double) var5 / (double) var4;
				int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
				int var13 = (int) Math.ceil(var8 + 7.0D);
				if (var12 < 0) {
					var12 = 0;
				}
				if (var13 > 14) {
					var13 = 14;
				}
				while (var13 > var12) {
					double var14 = var10;
					double var16 = ((double) var12 - var8) * 3.141592653589793D;
					if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var16) / var16);
					}
					double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
					var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
					var12++;
				}
			}
		}
	}
}
