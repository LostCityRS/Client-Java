package deob;

import java.io.UnsupportedEncodingException;

@ObfuscatedName("oi")
public final class class161 implements Runnable {

	@ObfuscatedName("oi.a")
	public static int field3099 = 0;

	@ObfuscatedName("oi.c")
	public static int field3101 = 0;

	@ObfuscatedName("oi.d")
	public final class55[] field3102 = new class55[2];

	@ObfuscatedName("oi.g")
	public static int field3105 = 0;

	@ObfuscatedName("oi.h")
	public volatile boolean field3106 = false;

	@ObfuscatedName("oi.i")
	public volatile boolean field3107 = false;

	@ObfuscatedName("oi.j")
	public static final class88 field3108 = class208.method1423(105, "gelb:");

	@ObfuscatedName("oi.k")
	public class181 field3109;

	@ObfuscatedName("oi.l")
	public static final class88 field3110 = class208.method1423(105, "Service unavailable)3");

	@ObfuscatedName("oi.m")
	public static int field3111 = 1;

	@ObfuscatedName("oi.n")
	public static final class88 field3112 = field3110;

	@ObfuscatedName("oi.o")
	public static class22 field3113;

	@ObfuscatedName("oi.a(III)J")
	public static long method1082(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		return var3 == null || var3.field956 == null ? 0L : var3.field956.field1158;
	}

	@ObfuscatedName("oi.a(Li;Lq;I)Li;")
	public static class88 method1084(class88 arg0, class174 arg1) {
		if (arg0.method617(class149.field2895) == -1) {
			return arg0;
		}
		while (true) {
			int var2 = arg0.method617(class115.field2080);
			if (var2 == -1) {
				while (true) {
					int var3 = arg0.method617(class166.field3189);
					if (var3 == -1) {
						while (true) {
							int var4 = arg0.method617(class18.field289);
							if (var4 == -1) {
								while (true) {
									int var5 = arg0.method617(class102.field1848);
									if (var5 == -1) {
										while (true) {
											int var6 = arg0.method617(class134.field2499);
											if (var6 == -1) {
												while (true) {
													int var7 = arg0.method617(class188.field3646);
													if (var7 == -1) {
														return arg0;
													}
													class88 var8 = class174.field3453;
													if (class49.field912 != null) {
														var8 = class141.method926(class49.field912.field3132);
														try {
															if (class49.field912.field3129 != null) {
																byte[] var9 = ((String) class49.field912.field3129).getBytes("ISO-8859-1");
																var8 = class54.method395(0, var9, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg0 = class166.method1140(new class88[] { arg0.method623(0, var7), var8, arg0.method635(var7 + 4) });
												}
											}
											arg0 = class166.method1140(new class88[] { arg0.method623(0, var6), class211.method1442(class110.method761(4, arg1)), arg0.method635(var6 + 2) });
										}
									}
									arg0 = class166.method1140(new class88[] { arg0.method623(0, var5), class211.method1442(class110.method761(3, arg1)), arg0.method635(var5 + 2) });
								}
							}
							arg0 = class166.method1140(new class88[] { arg0.method623(0, var4), class211.method1442(class110.method761(2, arg1)), arg0.method635(var4 + 2) });
						}
					}
					arg0 = class166.method1140(new class88[] { arg0.method623(0, var3), class211.method1442(class110.method761(1, arg1)), arg0.method635(var3 + 2) });
				}
			}
			arg0 = class166.method1140(new class88[] { arg0.method623(0, var2), class211.method1442(class110.method761(0, arg1)), arg0.method635(var2 + 2) });
		}
	}

	@ObfuscatedName("oi.a(I[B)V")
	public static void method1085(byte[] arg0) {
		int var1 = class218.field4086 >> 2 << 10;
		byte[][] var2 = new byte[class109.field1988][class44.field760];
		int var3 = class70.field1270 >> 1;
		int var4 = 0;
		while (true) {
			while (arg0.length > var4) {
				int var5 = (arg0[var4++] & 0xFF) * 64 - class16.field239;
				int var6 = (arg0[var4++] & 0xFF) * 64 - class119.field2181;
				if (var5 > 0 && var6 > 0 && var5 + 64 < class109.field1988 && var6 + 64 < class44.field760) {
					for (int var7 = 0; var7 < 64; var7++) {
						byte[] var8 = var2[var5 + var7];
						int var9 = class44.field760 - var6 - 1;
						for (int var10 = -64; var10 < 0; var10++) {
							var8[var9--] = arg0[var4++];
						}
					}
				} else {
					var4 += 4096;
				}
			}
			int var11 = class44.field760;
			int var12 = class109.field1988;
			int[] var13 = new int[var11];
			int[] var14 = new int[var11];
			int[] var15 = new int[var11];
			int[] var16 = new int[var11];
			int[] var17 = new int[var11];
			for (int var18 = -5; var18 < var12; var18++) {
				for (int var19 = 0; var19 < var11; var19++) {
					int var20 = var18 + 5;
					int var10002;
					if (var12 > var20) {
						int var21 = var2[var20][var19] & 0xFF;
						if (var21 > 0) {
							class237 var22 = class29.method179(var21 - 1);
							var13[var19] += var22.field4420;
							var14[var19] += var22.field4410;
							var17[var19] += var22.field4413;
							var15[var19] += var22.field4407;
							var10002 = var16[var19]++;
						}
					}
					int var23 = var18 - 5;
					if (var23 >= 0) {
						int var24 = var2[var23][var19] & 0xFF;
						if (var24 > 0) {
							class237 var25 = class29.method179(var24 - 1);
							var13[var19] -= var25.field4420;
							var14[var19] -= var25.field4410;
							var17[var19] -= var25.field4413;
							var15[var19] -= var25.field4407;
							var10002 = var16[var19]--;
						}
					}
				}
				if (var18 >= 0) {
					int[][] var26 = class105.field1912[var18 >> 6];
					int var27 = 0;
					int var28 = 0;
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					for (int var32 = -5; var32 < var11; var32++) {
						int var33 = var32 - 5;
						int var34 = var32 + 5;
						if (var34 < var11) {
							var30 += var15[var34];
							var31 += var16[var34];
							var28 += var17[var34];
							var27 += var14[var34];
							var29 += var13[var34];
						}
						if (var33 >= 0) {
							var30 -= var15[var33];
							var27 -= var14[var33];
							var28 -= var17[var33];
							var29 -= var13[var33];
							var31 -= var16[var33];
						}
						if (var32 >= 0 && var31 > 0) {
							int var35 = var32 >> 6;
							int var36 = var30 == 0 ? 0 : class158.method1066(var29 * 256 / var30, var28 / var31, var27 / var31);
							if (var2[var18][var32] != 0) {
								if (var26[var35] == null) {
									var26[var35] = class105.field1912[var18 >> 6][var35] = new int[4096];
								}
								int var37 = var3 + (var36 & 0x7F);
								if (var37 < 0) {
									var37 = 0;
								} else if (var37 > 127) {
									var37 = 127;
								}
								int var38 = (var36 + var1 & 0xFC00) + ((var36 & 0x380) + var37);
								var26[var35][((var32 & 0x3F) << 6) + (var18 & 0x3F)] = class173.field3349[class13.method67(96, var38)];
							} else if (var26[var35] != null) {
								var26[var35][((var32 & 0x3F) << 6) + (var18 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@Override
	public void run() {
		this.field3107 = true;
		try {
			while (!this.field3106) {
				for (int var1 = 0; var1 < 2; var1++) {
					class55 var2 = this.field3102[var1];
					if (var2 != null) {
						var2.method406();
					}
				}
				class21.method98(10L);
				class149.method1006(null, this.field3109);
			}
		} catch (Exception var9) {
			class221.method1488(null, var9);
		} finally {
			Object var6 = null;
			this.field3107 = false;
		}
	}
}
