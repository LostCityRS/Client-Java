package deob;

@ObfuscatedName("je")
public final class class103 extends class50 {

	@ObfuscatedName("je.j")
	public final int field1854;

	@ObfuscatedName("je.k")
	public final int field1855;

	@ObfuscatedName("je.l")
	public final int field1856;

	@ObfuscatedName("je.o")
	public final int field1859;

	@ObfuscatedName("je.p")
	public final int field1860;

	@ObfuscatedName("je.q")
	public final int field1861;

	@ObfuscatedName("je.u")
	public final int field1865;

	@ObfuscatedName("je.v")
	public static final class88 field1866 = class208.method1423(105, " more options");

	@ObfuscatedName("je.r")
	public static class88 field1862 = field1866;

	@ObfuscatedName("je.w")
	public final int field1867;

	@ObfuscatedName("je.y")
	public static final int[] field1869 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("je.z")
	public static final class88 field1870 = class208.method1423(105, "Versteckt");

	@ObfuscatedName("je.D")
	public static int field1874;

	@ObfuscatedName("je.a(II)Lvb;")
	public static class231 method710(int arg0) {
		class231 var1 = (class231) class216.field4047.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class129.field2422.method939(arg0, 3);
		class231 var3 = new class231();
		if (var2 != null) {
			var3.method1546(new class46(var2));
		}
		class216.field4047.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("je.b(I)V")
	public static void method711() {
		class106.field1923.method134();
	}

	@ObfuscatedName("je.b(II)V")
	public static void method712(int arg0) {
		if (class122.field2230 == 0) {
			class31.field503.method1186(arg0);
		} else {
			class11.field159 = arg0;
		}
	}

	@ObfuscatedName("je.a(IB[Lq;)V")
	public static void method714(int arg0, class174[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			class174 var3 = arg1[var2];
			if (var3 != null && arg0 == var3.field3504 && (!var3.field3410 || !class71.method475(var3))) {
				if (var3.field3390 == 0) {
					if (!var3.field3410 && class71.method475(var3) && var3 != class65.field1177) {
						continue;
					}
					method714(var3.field3423, arg1);
					if (var3.field3465 != null) {
						method714(var3.field3423, var3.field3465);
					}
					class168 var4 = (class168) class128.field2395.method1049((long) var3.field3423);
					if (var4 != null) {
						class217.method1471(var4.field3229);
					}
				}
				if (var3.field3390 == 6) {
					if (var3.field3404 != -1 || var3.field3386 != -1) {
						boolean var5 = class80.method533(var3);
						int var6;
						if (var5) {
							var6 = var3.field3386;
						} else {
							var6 = var3.field3404;
						}
						if (var6 != -1) {
							class109 var7 = class15.method75(var6);
							if (var7 != null) {
								var3.field3487 += class17.field261;
								while (var3.field3487 > var7.field1990[var3.field3379]) {
									var3.field3487 -= var7.field1990[var3.field3379];
									var3.field3379++;
									if (var3.field3379 >= var7.field1965.length) {
										var3.field3379 -= var7.field1972;
										if (var3.field3379 < 0 || var3.field3379 >= var7.field1965.length) {
											var3.field3379 = 0;
										}
									}
									class200.method1371(var3);
								}
							}
						}
					}
					if (var3.field3385 != 0 && !var3.field3410) {
						int var8 = var3.field3385 << 16 >> 16;
						int var9 = var3.field3385 >> 16;
						int var10 = var9 * class17.field261;
						var3.field3455 = var10 + var3.field3455 & 0x7FF;
						int var11 = var8 * class17.field261;
						var3.field3509 = var11 + var3.field3509 & 0x7FF;
						class200.method1371(var3);
					}
				}
			}
		}
	}

	public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		super(-1, arg8, arg9);
		this.field1861 = arg1;
		this.field1855 = arg7;
		this.field1865 = arg4;
		this.field1860 = arg2;
		this.field1859 = arg5;
		this.field1856 = arg3;
		this.field1854 = arg0;
		this.field1867 = arg6;
	}

	@ObfuscatedName("je.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
		int var3 = arg0 * this.field1860 >> 12;
		int var4 = this.field1856 * arg1 >> 12;
		int var5 = this.field1859 * arg1 >> 12;
		int var6 = this.field1854 * arg0 >> 12;
		int var7 = arg1 * this.field1861 >> 12;
		int var8 = this.field1867 * arg0 >> 12;
		int var9 = this.field1865 * arg0 >> 12;
		int var10 = arg1 * this.field1855 >> 12;
		class108.method739(var4, var7, var6, var3, var5, var8, var10, super.field927, var9);
	}

	@ObfuscatedName("je.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
	}

	@ObfuscatedName("je.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
	}
}
