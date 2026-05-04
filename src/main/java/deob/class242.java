package deob;

@ObfuscatedName("wc")
public final class class242 extends class136 {

	@ObfuscatedName("wc.L")
	public static final int[] field4479 = new int[128];

	@ObfuscatedName("wc.N")
	public static final class88 field4481 = class208.method1423(105, "Fehler beim Laden Ihres Spielcharakters)3");

	@ObfuscatedName("wc.O")
	public static final class88 field4482 = class208.method1423(105, "Loading )2 please wait)3");

	@ObfuscatedName("wc.K")
	public static class88 field4478 = field4482;

	@ObfuscatedName("wc.F")
	public final class18 field4474;

	@ObfuscatedName("wc.M")
	public static int field4480;

	@ObfuscatedName("wc.D")
	public static class130 field4473;

	@ObfuscatedName("wc.J")
	public static int[] field4477;

	@ObfuscatedName("wc.a(Lnc;IIIII)V")
	public static void method1594(class145 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var6 = true;
		int var7 = arg2;
		int var8 = arg2 + arg4;
		int var9 = arg3 - 1;
		int var10 = arg3 + arg5;
		for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
			if (var11 != class11.field152) {
				for (int var12 = var7; var12 <= var8; var12++) {
					if (var12 >= 0 && var12 < class48.field899) {
						for (int var13 = var9; var13 <= var10; var13++) {
							if (var13 >= 0 && var13 < class66.field1202 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && var12 != arg2)) {
								class52 var14 = class29.field489[var11][var12][var13];
								if (var14 != null) {
									int var15 = (class62.field1137[var11][var12][var13] + class62.field1137[var11][var12 + 1][var13] + class62.field1137[var11][var12][var13 + 1] + class62.field1137[var11][var12 + 1][var13 + 1]) / 4 - (class62.field1137[arg1][arg2][arg3] + class62.field1137[arg1][arg2 + 1][arg3] + class62.field1137[arg1][arg2][arg3 + 1] + class62.field1137[arg1][arg2 + 1][arg3 + 1]) / 4;
									class157 var16 = var14.field959;
									if (var16 != null) {
										if (var16.field3021.method544()) {
											arg0.method570(var16.field3021, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
										}
										if (var16.field3032 != null && var16.field3032.method544()) {
											arg0.method570(var16.field3032, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
										}
									}
									for (int var17 = 0; var17 < var14.field962; var17++) {
										class108 var18 = var14.field963[var17];
										if (var18 != null && var18.field1943.method544() && (var12 == var18.field1933 || var12 == var7) && (var13 == var18.field1936 || var13 == var9)) {
											int var19 = var18.field1940 + 1 - var18.field1933;
											int var20 = var18.field1935 + 1 - var18.field1936;
											arg0.method570(var18.field1943, (var18.field1933 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1936 - arg3) * 128 + (var20 - arg5) * 64, var6);
										}
									}
								}
							}
						}
					}
				}
				var7--;
				var6 = false;
			}
		}
	}

	@ObfuscatedName("wc.b(II)V")
	public static void method1595(int arg0) {
		class169 var1;
		if (class110.field2010 == null) {
			var1 = new class169(512, 512);
		} else {
			var1 = (class169) class110.field2010;
		}
		int[] var2 = var1.field3247;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 1;
		}
		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 2048 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((class116.field2098[arg0][var7][var5] & 0x18) == 0) {
					class119.method815(var2, var6, arg0, var7, var5);
				}
				if (arg0 < 3 && (class116.field2098[arg0 + 1][var7][var5] & 0x8) != 0) {
					class119.method815(var2, var6, arg0 + 1, var7, var5);
				}
				var6 += 4;
			}
		}
		var1.method1167();
		int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
		int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) + 228 << 8) - (-((int) (Math.random() * 20.0D)) - 238)) - 10;
		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((class116.field2098[arg0][var11][var10] & 0x18) == 0) {
					class128.method871(var10, var8, arg0, var9, var11);
				}
				if (arg0 < 3 && (class116.field2098[arg0 + 1][var11][var10] & 0x8) != 0) {
					class128.method871(var10, var8, arg0 + 1, var9, var11);
				}
			}
		}
		class50.field930 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				long var14 = class74.method501(class149.field2907, var12, var13);
				if (var14 != 0L) {
					class148 var16 = class190.method1321(Integer.MAX_VALUE & (int) (var14 >>> 32));
					int var17 = var16.field2817;
					if (var17 >= 0) {
						int var18 = var12;
						int var19 = var13;
						if (var17 != 22 && var17 != 29 && var17 != 34 && var17 != 36 && var17 != 46 && var17 != 47 && var17 != 48) {
							int[][] var20 = class166.field3200[class149.field2907].field1667;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var18 > 0 && var12 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
									var18--;
								}
								if (var22 == 1 && var18 < 103 && var12 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
									var18++;
								}
								if (var22 == 2 && var19 > 0 && var19 > var13 - 3 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
									var19--;
								}
								if (var22 == 3 && var19 < 103 && var19 < var13 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
									var19++;
								}
							}
						}
						class146.field2745[class50.field930] = var16.field2831;
						class139.field2577[class50.field930] = var18;
						class134.field2501[class50.field930] = var19;
						class50.field930++;
					}
				}
			}
		}
		class110.field2010 = var1;
		class202.field3852.method1521();
	}

	public class242(class18 arg0) {
		this.field4474 = arg0;
	}
}
