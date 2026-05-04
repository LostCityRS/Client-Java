package deob;

@ObfuscatedName("rg")
public final class class192 extends class67 {

	@ObfuscatedName("rg.u")
	public static final class88 field3689 = class208.method1423(105, "glow3:");

	@ObfuscatedName("rg.x")
	public static final class88 field3692 = class208.method1423(105, "Verbindung abgebrochen)3");

	@ObfuscatedName("rg.A")
	public static class88 field3695 = field3689;

	@ObfuscatedName("rg.E")
	public static final class88 field3699 = class208.method1423(105, "flash2:");

	@ObfuscatedName("rg.v")
	public static final class88 field3690 = field3699;

	@ObfuscatedName("rg.w")
	public static class88 field3691 = field3699;

	@ObfuscatedName("rg.F")
	public static int field3700 = 0;

	@ObfuscatedName("rg.H")
	public static int field3702 = 0;

	@ObfuscatedName("rg.B")
	public static final class88 field3696 = class208.method1423(105, "Hidden");

	@ObfuscatedName("rg.y")
	public static class88 field3693 = field3696;

	@ObfuscatedName("rg.I")
	public static final class88 field3703 = field3689;

	@ObfuscatedName("rg.D")
	public int field3698;

	@ObfuscatedName("rg.a(III)I")
	public static int method1330(int arg0, int arg1) {
		int var2 = arg0 * 57 + arg1;
		int var3 = var2 << 13 ^ var2;
		int var4 = Integer.MAX_VALUE & var3 * (var3 * var3 * 15731 + 789221) + 1376312589;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("rg.a()V")
	public static void method1331() {
		int var0 = class62.field1148[class155.field2993];
		class13[] var1 = class62.field1149[class155.field2993];
		class71.field1316 = 0;
		label187: for (int var2 = 0; var2 < var0; var2++) {
			class13 var3 = var1[var2];
			if (class246.field4510 != null) {
				for (int var4 = 0; var4 < class246.field4510.length; var4++) {
					if (class246.field4510[var4] != -1000000 && (var3.field189 <= class246.field4510[var4] || var3.field196 <= class246.field4510[var4]) && (var3.field185 <= class184.field3605[var4] || var3.field193 <= class184.field3605[var4]) && (var3.field185 >= class44.field740[var4] || var3.field193 >= class44.field740[var4]) && (var3.field191 <= class144.field2713[var4] || var3.field205 <= class144.field2713[var4]) && (var3.field191 >= class204.field3882[var4] || var3.field205 >= class204.field3882[var4])) {
						continue label187;
					}
				}
			}
			if (var3.field190 == 1) {
				int var5 = var3.field204 + class150.field2911 - class79.field1435;
				if (var5 >= 0 && var5 <= class150.field2911 + class150.field2911) {
					int var6 = var3.field187 + class150.field2911 - class88.field1636;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var3.field200 + class150.field2911 - class88.field1636;
					if (var7 > class150.field2911 + class150.field2911) {
						var7 = class150.field2911 + class150.field2911;
					}
					boolean var8 = false;
					while (var6 <= var7) {
						if (class18.field304[var5][var6++]) {
							var8 = true;
							break;
						}
					}
					if (var8) {
						int var9 = class74.field1353 - var3.field185;
						if (var9 > 32) {
							var3.field206 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var3.field206 = 2;
							var9 = -var9;
						}
						var3.field199 = (var3.field191 - class216.field4048 << 8) / var9;
						var3.field186 = (var3.field205 - class216.field4048 << 8) / var9;
						var3.field188 = (var3.field189 - class241.field4461 << 8) / var9;
						var3.field201 = (var3.field196 - class241.field4461 << 8) / var9;
						class159.field3075[class71.field1316++] = var3;
					}
				}
			} else if (var3.field190 == 2) {
				int var10 = var3.field187 + class150.field2911 - class88.field1636;
				if (var10 >= 0 && var10 <= class150.field2911 + class150.field2911) {
					int var11 = var3.field204 + class150.field2911 - class79.field1435;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var3.field194 + class150.field2911 - class79.field1435;
					if (var12 > class150.field2911 + class150.field2911) {
						var12 = class150.field2911 + class150.field2911;
					}
					boolean var13 = false;
					while (var11 <= var12) {
						if (class18.field304[var11++][var10]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						int var14 = class216.field4048 - var3.field191;
						if (var14 > 32) {
							var3.field206 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var3.field206 = 4;
							var14 = -var14;
						}
						var3.field197 = (var3.field185 - class74.field1353 << 8) / var14;
						var3.field195 = (var3.field193 - class74.field1353 << 8) / var14;
						var3.field188 = (var3.field189 - class241.field4461 << 8) / var14;
						var3.field201 = (var3.field196 - class241.field4461 << 8) / var14;
						class159.field3075[class71.field1316++] = var3;
					}
				}
			} else if (var3.field190 == 4) {
				int var15 = var3.field189 - class241.field4461;
				if (var15 > 128) {
					int var16 = var3.field187 + class150.field2911 - class88.field1636;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var3.field200 + class150.field2911 - class88.field1636;
					if (var17 > class150.field2911 + class150.field2911) {
						var17 = class150.field2911 + class150.field2911;
					}
					if (var16 <= var17) {
						int var18 = var3.field204 + class150.field2911 - class79.field1435;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var3.field194 + class150.field2911 - class79.field1435;
						if (var19 > class150.field2911 + class150.field2911) {
							var19 = class150.field2911 + class150.field2911;
						}
						boolean var20 = false;
						label159: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (class18.field304[var21][var22]) {
									var20 = true;
									break label159;
								}
							}
						}
						if (var20) {
							var3.field206 = 5;
							var3.field197 = (var3.field185 - class74.field1353 << 8) / var15;
							var3.field195 = (var3.field193 - class74.field1353 << 8) / var15;
							var3.field199 = (var3.field191 - class216.field4048 << 8) / var15;
							var3.field186 = (var3.field205 - class216.field4048 << 8) / var15;
							class159.field3075[class71.field1316++] = var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("rg.b(III)Loe;")
	public static class157 method1332(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		return var3 == null ? null : var3.field959;
	}

	@ObfuscatedName("rg.a(IIZIIIII)V")
	public static void method1333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg1 + arg3;
		int var8 = arg2 - arg3;
		int var9 = arg4 + arg3;
		for (int var10 = arg1; var10 < var7; var10++) {
			class230.method1534(arg4, arg6, arg5, class3.field42[var10]);
		}
		int var11 = arg5 - arg3;
		for (int var12 = arg2; var12 > var8; var12--) {
			class230.method1534(arg4, arg6, arg5, class3.field42[var12]);
		}
		for (int var13 = var7; var13 <= var8; var13++) {
			int[] var14 = class3.field42[var13];
			class230.method1534(arg4, arg6, var9, var14);
			class230.method1534(var9, arg0, var11, var14);
			class230.method1534(var11, arg6, arg5, var14);
		}
	}

	@ObfuscatedName("rg.a(IZ)V")
	public static void method1334() {
		class212.method1449(class222.field4192, class43.field723, class145.field2725, false);
	}

	public class192() {
	}

	public class192(int arg0) {
		this.field3698 = arg0;
	}
}
