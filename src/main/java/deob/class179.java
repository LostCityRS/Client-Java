package deob;

@ObfuscatedName("qe")
public final class class179 {

	@ObfuscatedName("qe.a")
	public int field3555;

	@ObfuscatedName("qe.b")
	public int[][] field3556;

	@ObfuscatedName("qe.d")
	public static final class92 field3558 = new class92(64);

	@ObfuscatedName("qe.h")
	public static final int[] field3562 = new int[25];

	@ObfuscatedName("qe.i")
	public static final class88 field3563 = class208.method1423(105, "Clientscript error )2 check log for details");

	@ObfuscatedName("qe.j")
	public static class174[] field3564;

	@ObfuscatedName("qe.k")
	public static class144 field3565;

	@ObfuscatedName("qe.l")
	public int field3566;

	@ObfuscatedName("qe.m")
	public static boolean field3567 = false;

	@ObfuscatedName("qe.n")
	public static class174 field3568 = null;

	@ObfuscatedName("qe.a([BZ)[B")
	public static byte[] method1276(byte[] arg0) {
		int var1 = arg0.length;
		byte[] var2 = new byte[var1];
		class124.method836(arg0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("qe.a(IIII)V")
	public static void method1277() {
		class14.field211 = new class52[4][104][104];
		class145.field2721 = new int[4][105][105];
		class24.method131();
		class48.field899 = 104;
		class66.field1202 = 104;
		class238.field4429 = new int[4][105][105];
		class85.method579();
		class150.field2911 = 25;
		class18.field304 = new boolean[class150.field2911 + class150.field2911 + 1][class150.field2911 + class150.field2911 + 1];
		class48.field893 = new boolean[class150.field2911 + class150.field2911 + 2][class150.field2911 + class150.field2911 + 2];
	}

	public class179(int arg0, int arg1) {
		if (arg1 != 22050) {
			int var3 = class211.method1439(arg1, 22050);
			int var4 = 22050 / var3;
			this.field3566 = var4;
			int var5 = arg1 / var3;
			this.field3556 = new int[var4][14];
			this.field3555 = var5;
			for (int var6 = 0; var6 < var4; var6++) {
				int[] var7 = this.field3556[var6];
				double var8 = (double) var6 / (double) var4 + 6.0D;
				int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
				int var11 = (int) Math.ceil(var8 + 7.0D);
				if (var11 > 14) {
					var11 = 14;
				}
				if (var10 < 0) {
					var10 = 0;
				}
				double var12 = (double) var5 / (double) var4;
				while (var10 < var11) {
					double var14 = var12;
					double var16 = ((double) var10 - var8) * 3.141592653589793D;
					if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
						var14 = var12 * (Math.sin(var16) / var16);
					}
					double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
					var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
					var10++;
				}
			}
		}
	}

	@ObfuscatedName("qe.a(B[B)[B")
	public byte[] method1278(byte[] arg0) {
		if (this.field3556 != null) {
			int var2 = (int) ((long) this.field3555 * (long) arg0.length / (long) this.field3566) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;
			for (int var6 = 0; var6 < arg0.length; var6++) {
				byte var7 = arg0[var6];
				int[] var8 = this.field3556[var5];
				for (int var9 = 0; var9 < 14; var9++) {
					var3[var4 + var9] += var8[var9] * var7;
				}
				int var10 = var5 + this.field3555;
				int var11 = var10 / this.field3566;
				var5 = var10 - var11 * this.field3566;
				var4 += var11;
			}
			arg0 = new byte[var2];
			for (int var12 = 0; var12 < var2; var12++) {
				int var13 = var3[var12] + 32768 >> 16;
				if (var13 < -128) {
					arg0[var12] = -128;
				} else if (var13 <= 127) {
					arg0[var12] = (byte) var13;
				} else {
					arg0[var12] = 127;
				}
			}
		}
		return arg0;
	}

	@ObfuscatedName("qe.a(II)I")
	public int method1279(int arg0) {
		if (this.field3556 != null) {
			arg0 = (int) ((long) this.field3555 * (long) arg0 / (long) this.field3566) + 6;
		}
		return arg0;
	}

	@ObfuscatedName("qe.b(II)I")
	public int method1280(int arg0) {
		if (this.field3556 != null) {
			arg0 = (int) ((long) this.field3555 * (long) arg0 / (long) this.field3566);
		}
		return arg0;
	}
}
