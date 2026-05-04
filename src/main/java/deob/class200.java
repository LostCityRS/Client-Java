package deob;

@ObfuscatedName("sd")
public final class class200 {

	@ObfuscatedName("sd.a")
	public static final int[] field3812 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("sd.c")
	public static final class88 field3814 = class208.method1423(105, "0(U");

	@ObfuscatedName("sd.e")
	public static final class88 field3816 = class208.method1423(105, "Loaded input handler");

	@ObfuscatedName("sd.i")
	public static final class88 field3820 = class208.method1423(105, "Press (Wchange your password(W on front page)3");

	@ObfuscatedName("sd.k")
	public int field3822;

	@ObfuscatedName("sd.l")
	public static class88 field3823 = field3820;

	@ObfuscatedName("sd.n")
	public int field3825;

	@ObfuscatedName("sd.o")
	public static class188 field3826;

	@ObfuscatedName("sd.p")
	public static class144 field3827;

	@ObfuscatedName("sd.q")
	public static final class88 field3828 = class208.method1423(105, "glow1:");

	@ObfuscatedName("sd.b")
	public static class88 field3813 = field3828;

	@ObfuscatedName("sd.f")
	public static final class88 field3817 = field3828;

	@ObfuscatedName("sd.r")
	public static class88 field3829 = field3816;

	@ObfuscatedName("sd.s")
	public int field3830;

	@ObfuscatedName("sd.t")
	public static final class88 field3831 = class208.method1423(105, "Okay");

	@ObfuscatedName("sd.a(ILq;)V")
	public static void method1371(class174 arg0) {
		if (class110.field2018 == arg0.field3371) {
			class225.field4228[arg0.field3382] = true;
		}
	}

	@ObfuscatedName("sd.a(Lde;I)V")
	public static void method1373(class39 arg0) {
		class135.method902(arg0, 200000);
	}

	@ObfuscatedName("sd.a(Lq;IBI)V")
	public static void method1374(class174 arg0, int arg1, int arg2) {
		if (arg0.field3451 == 0) {
			arg0.field3441 = arg0.field3514;
		} else if (arg0.field3451 == 1) {
			arg0.field3441 = arg0.field3514 + (arg2 - arg0.field3422) / 2;
		} else if (arg0.field3451 == 2) {
			arg0.field3441 = arg2 - arg0.field3422 - arg0.field3514;
		} else if (arg0.field3451 == 3) {
			arg0.field3441 = arg0.field3514 * arg2 >> 14;
		} else if (arg0.field3451 == 4) {
			arg0.field3441 = (arg2 - arg0.field3422) / 2 + (arg0.field3514 * arg2 >> 14);
		} else {
			arg0.field3441 = arg2 - (arg0.field3514 * arg2 >> 14) - arg0.field3422;
		}
		if (arg0.field3367 == 0) {
			arg0.field3366 = arg0.field3391;
		} else if (arg0.field3367 == 1) {
			arg0.field3366 = (arg1 - arg0.field3380) / 2 + arg0.field3391;
		} else if (arg0.field3367 == 2) {
			arg0.field3366 = arg1 - arg0.field3391 - arg0.field3380;
		} else if (arg0.field3367 == 3) {
			arg0.field3366 = arg1 * arg0.field3391 >> 14;
		} else if (arg0.field3367 == 4) {
			arg0.field3366 = (arg1 * arg0.field3391 >> 14) + (arg1 - arg0.field3380) / 2;
		} else {
			arg0.field3366 = arg1 - arg0.field3380 - (arg0.field3391 * arg1 >> 14);
		}
		if (!class116.field2103) {
			return;
		}
		if (class80.method530(arg0) == 0 && arg0.field3390 != 0) {
			return;
		}
		if (arg0.field3441 < 0) {
			arg0.field3441 = 0;
		} else if (arg2 < arg0.field3422 + arg0.field3441) {
			arg0.field3441 = arg2 - arg0.field3422;
		}
		if (arg0.field3366 < 0) {
			arg0.field3366 = 0;
			return;
		}
		if (arg0.field3366 + arg0.field3380 > arg1) {
			arg0.field3366 = arg1 - arg0.field3380;
			return;
		}
	}

	@ObfuscatedName("sd.a(JB)Li;")
	public static class88 method1375(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			long var3 = arg0;
			while (var3 != 0L) {
				var3 /= 37L;
				var2++;
			}
			byte[] var5 = new byte[var2];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var2--;
				var5[var2] = class54.field1008[(int) (var6 - arg0 * 37L)];
			}
			class88 var8 = new class88();
			var8.field1643 = var5;
			var8.field1660 = var5.length;
			return var8;
		}
	}

	@ObfuscatedName("sd.a([SI[Li;)V")
	public static void method1376(short[] arg0, class88[] arg1) {
		class152.method1037(0, arg1, arg1.length - 1, arg0);
	}
}
