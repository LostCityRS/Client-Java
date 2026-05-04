package deob;

@ObfuscatedName("ug")
public final class class225 {

	@ObfuscatedName("ug.a")
	public static int[] field4218;

	@ObfuscatedName("ug.b")
	public static class88 field4219 = null;

	@ObfuscatedName("ug.c")
	public static final class88 field4220 = class208.method1423(105, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@ObfuscatedName("ug.e")
	public static final class88 field4222 = class208.method1423(105, "blinken2:");

	@ObfuscatedName("ug.f")
	public static final class191[] field4223 = new class191[32768];

	@ObfuscatedName("ug.h")
	public static final class88 field4225 = class208.method1423(105, "leuchten2:");

	@ObfuscatedName("ug.i")
	public static int field4226;

	@ObfuscatedName("ug.k")
	public static final boolean[] field4228 = new boolean[100];

	@ObfuscatedName("ug.l")
	public static class174 field4229;

	@ObfuscatedName("ug.m")
	public static class88 field4230 = field4220;

	@ObfuscatedName("ug.n")
	public static int field4231 = 0;

	@ObfuscatedName("ug.o")
	public static final int[][] field4232 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("ug.a(ILq;)Lq;")
	public static class174 method1512(class174 arg0) {
		class174 var1 = class87.method583(arg0);
		if (var1 == null) {
			var1 = arg0.field3502;
		}
		return var1;
	}

	@ObfuscatedName("ug.a(Llf;IIII)V")
	public static void method1513(class126 arg0, int arg1, int arg2, int arg3) {
		if (class203.field3862 >= 400) {
			return;
		}
		if (arg0.field2327 != null) {
			arg0 = arg0.method862();
		}
		if (arg0 == null || !arg0.field2359) {
			return;
		}
		class88 var4 = arg0.field2341;
		if (arg0.field2331 != 0) {
			var4 = class166.method1140(new class88[] { var4, class168.method1152(arg0.field2331, class240.field4456.field747), class68.field1238, class145.field2717, class170.method1212(arg0.field2331), class104.field1879 });
		}
		if (class28.field475 == 1) {
			class98.method685(arg3, class35.field608, (short) 48, (long) arg1, class166.method1140(new class88[] { class78.field1414, class134.field2493, var4 }), arg2);
		} else if (!class10.field145) {
			class88[] var5 = arg0.field2342;
			if (class99.field1807) {
				var5 = class138.method921(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && (class47.field884 != 0 || !var5[var6].method624(class158.field3041))) {
						byte var7 = 0;
						if (var6 == 0) {
							var7 = 17;
						}
						if (var6 == 1) {
							var7 = 38;
						}
						if (var6 == 2) {
							var7 = 34;
						}
						if (var6 == 3) {
							var7 = 32;
						}
						if (var6 == 4) {
							var7 = 4;
						}
						class98.method685(arg3, var5[var6], var7, (long) arg1, class166.method1140(new class88[] { class8.field120, var4 }), arg2);
					}
				}
			}
			if (class47.field884 == 0 && var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method624(class158.field3041)) {
						short var9 = 0;
						if (arg0.field2331 > class240.field4456.field747) {
							var9 = 2000;
						}
						short var10 = 0;
						if (var8 == 0) {
							var10 = 17;
						}
						if (var8 == 1) {
							var10 = 38;
						}
						if (var8 == 2) {
							var10 = 34;
						}
						if (var8 == 3) {
							var10 = 32;
						}
						if (var8 == 4) {
							var10 = 4;
						}
						if (var10 != 0) {
							var10 += var9;
						}
						class98.method685(arg3, var5[var8], var10, (long) arg1, class166.method1140(new class88[] { class8.field120, var4 }), arg2);
					}
				}
			}
			class98.method685(arg3, class65.field1174, (short) 1002, (long) arg1, class166.method1140(new class88[] { class8.field120, var4 }), arg2);
		} else if ((class115.field2084 & 0x2) == 2) {
			class98.method685(arg3, class201.field3835, (short) 19, (long) arg1, class166.method1140(new class88[] { class28.field464, class134.field2493, var4 }), arg2);
		}
	}

	@ObfuscatedName("ug.a(IIIIIBII)V")
	public static void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 == arg2) {
			client.method216(arg2, arg5, arg4, arg6, arg0, arg3);
		} else if (arg3 - arg2 >= class67.field1207 && arg2 + arg3 <= class12.field183 && class49.field919 <= arg6 - arg1 && class18.field279 >= arg1 + arg6) {
			class23.method126(arg3, arg0, arg1, arg5, arg4, arg6, arg2);
		} else {
			class154.method1051(arg6, arg4, arg2, arg5, arg0, arg1, arg3);
		}
	}
}
