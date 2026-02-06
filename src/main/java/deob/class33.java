package deob;

@ObfuscatedName("ed")
public final class class33 {

	@ObfuscatedName("ed.c")
	public int field682;

	@ObfuscatedName("ed.i")
	public int[][] field688;

	@ObfuscatedName("ed.j")
	public static class63 field689 = new class63(30);

	@ObfuscatedName("ed.m")
	public static class30 field692;

	@ObfuscatedName("ed.n")
	public int field693;

	@ObfuscatedName("ed.o")
	public static long[] field694 = new long[200];

	@ObfuscatedName("ed.p")
	public static class32 field695 = class73.method593("(U0a )2 non)2existant gosub script)2num: ", true);

	@ObfuscatedName("ed.q")
	public static int field696;

	@ObfuscatedName("ed.r")
	public static int field697 = 0;

	@ObfuscatedName("ed.s")
	public static int[] field698;

	@ObfuscatedName("ed.t")
	public static boolean[] field699 = new boolean[5];

	@ObfuscatedName("ed.a(IIII)I")
	public static int method281(int arg0, int arg1, int arg2) {
		int var3 = arg0 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return 7 - arg2;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@ObfuscatedName("ed.a(Z)V")
	public static void method283() {
		for (class98 var0 = (class98) class63.field1466.method1211(); var0 != null; var0 = (class98) class63.field1466.method1209()) {
			if (var0.field2247 != null) {
				class37.field881.method907(var0.field2247);
				var0.field2247 = null;
			}
			if (var0.field2271 != null) {
				class37.field881.method907(var0.field2271);
				var0.field2271 = null;
			}
		}
		class63.field1466.method1204();
	}

	@ObfuscatedName("ed.a(BII)Z")
	public static boolean method285(int arg0, int arg1) {
		class53 var2 = class5.method22(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return var2.method423(arg1);
	}

	@ObfuscatedName("ed.a(BLea;Lea;ZI)Lrc;")
	public static class121 method286(class30 arg0, class30 arg1, int arg2) {
		int[] var3 = arg1.method207(arg2);
		boolean var4 = true;
		for (int var5 = 0; var5 < var3.length; var5++) {
			byte[] var6 = arg1.method217(var3[var5], arg2);
			if (var6 == null) {
				var4 = false;
			} else {
				int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
				byte[] var8 = arg0.method217(0, var7);
				if (var8 == null) {
					var4 = false;
				}
			}
		}
		if (!var4) {
			return null;
		}
		try {
			return new class121(arg1, arg0, arg2, false);
		} catch (Exception var9) {
			return null;
		}
	}

	public class33(int arg0, int arg1) {
		if (arg1 != 22050) {
			int var3 = class17.method125(22050, arg1);
			int var4 = 22050 / var3;
			this.field688 = new int[var4][14];
			this.field693 = var4;
			int var5 = arg1 / var3;
			this.field682 = var5;
			for (int var6 = 0; var6 < var4; var6++) {
				int[] var7 = this.field688[var6];
				double var8 = (double) var6 / (double) var4 + 6.0D;
				int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
				int var11 = (int) Math.ceil(var8 + 7.0D);
				if (var10 < 0) {
					var10 = 0;
				}
				double var12 = (double) var5 / (double) var4;
				if (var11 > 14) {
					var11 = 14;
				}
				while (var11 > var10) {
					double var14 = ((double) var10 - var8) * 3.141592653589793D;
					double var16 = var12;
					if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
						var16 = var12 * (Math.sin(var14) / var14);
					}
					double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
					var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
					var10++;
				}
			}
		}
	}

	@ObfuscatedName("ed.a([BB)[B")
	public byte[] method280(byte[] arg0) {
		if (this.field688 != null) {
			int var2 = (int) ((long) arg0.length * (long) this.field682 / (long) this.field693) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;
			for (int var6 = 0; var6 < arg0.length; var6++) {
				byte var7 = arg0[var6];
				int[] var8 = this.field688[var5];
				for (int var9 = 0; var9 < 14; var9++) {
					var3[var4 + var9] += var7 * var8[var9];
				}
				int var10 = var5 + this.field682;
				int var11 = var10 / this.field693;
				var4 += var11;
				var5 = var10 - var11 * this.field693;
			}
			arg0 = new byte[var2];
			for (int var12 = 0; var12 < var2; var12++) {
				int var13 = var3[var12] + 32768 >> 16;
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

	@ObfuscatedName("ed.a(II)I")
	public int method282(int arg0) {
		if (this.field688 != null) {
			arg0 = (int) ((long) this.field682 * (long) arg0 / (long) this.field693);
		}
		return arg0;
	}

	@ObfuscatedName("ed.a(BI)I")
	public int method284(int arg0) {
		if (this.field688 != null) {
			arg0 = (int) ((long) arg0 * (long) this.field682 / (long) this.field693) + 6;
		}
		return arg0;
	}
}
