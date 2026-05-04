package deob;

@ObfuscatedName("ph")
public final class class171 extends class23 {

	@ObfuscatedName("ph.ab")
	public static final class88[] field3330 = new class88[1000];

	@ObfuscatedName("ph.U")
	public static final class88 field3324 = class208.method1423(105, "Bad session id)3");

	@ObfuscatedName("ph.V")
	public static final class88 field3325 = class208.method1423(105, " has logged in)3");

	@ObfuscatedName("ph.Z")
	public static class88 field3329 = field3324;

	@ObfuscatedName("ph.R")
	public static class88 field3321 = field3325;

	@ObfuscatedName("ph.W")
	public int field3326 = 6;

	@ObfuscatedName("ph.X")
	public static int field3327;

	@ObfuscatedName("ph.a(Li;II)V")
	public static void method1213(class88 arg0, int arg1) {
		class146.field2747.method30(40);
		class146.field2747.method296(arg0.method630());
		class146.field2747.method346(arg1);
	}

	@ObfuscatedName("ph.e(I)V")
	public static void method1214() {
		for (int var0 = -1; var0 < class55.field1027; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = class174.field3428[var0];
			}
			class44 var2 = class244.field4491[var1];
			if (var2 != null) {
				class77.method514(var2.field4103, var2);
			}
		}
	}

	@ObfuscatedName("ph.a(III)V")
	public static void method1215() {
		for (int var0 = 0; var0 < class11.field152; var0++) {
			for (int var1 = 0; var1 < class48.field899; var1++) {
				for (int var2 = 0; var2 < class66.field1202; var2++) {
					class52 var3 = class29.field489[var0][var1][var2];
					if (var3 != null) {
						class157 var4 = var3.field959;
						if (var4 != null && var4.field3021.method544()) {
							class242.method1594(var4.field3021, var0, var1, var2, 1, 1);
							if (var4.field3032 != null && var4.field3032.method544()) {
								class242.method1594(var4.field3032, var0, var1, var2, 1, 1);
								var4.field3021.method570(var4.field3032, 0, 0, 0, false);
								var4.field3032 = var4.field3032.method559();
							}
							var4.field3021 = var4.field3021.method559();
						}
						for (int var5 = 0; var5 < var3.field962; var5++) {
							class108 var6 = var3.field963[var5];
							if (var6 != null && var6.field1943.method544()) {
								class242.method1594(var6.field1943, var0, var1, var2, var6.field1940 + 1 - var6.field1933, var6.field1935 - var6.field1936 + 1);
								var6.field1943 = var6.field1943.method559();
							}
						}
						class166 var7 = var3.field949;
						if (var7 != null && var7.field3194.method544()) {
							class149.method1018(var7.field3194, var0, var1, var2);
							var7.field3194 = var7.field3194.method559();
						}
					}
				}
			}
		}
	}

	public class171() {
		super(2, false);
	}

	@ObfuscatedName("ph.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[][] var4 = this.method121(1, arg0);
			int[] var5 = var3[0];
			int[] var6 = var2[1];
			int[] var7 = var2[2];
			int[] var8 = var2[0];
			int[] var9 = var3[1];
			int[] var10 = var3[2];
			int[] var11 = var4[1];
			int[] var12 = var4[0];
			int[] var13 = var4[2];
			int var14 = this.field3326;
			if (var14 == 1) {
				for (int var15 = 0; var15 < class70.field1276; var15++) {
					var8[var15] = var5[var15] + var12[var15];
					var6[var15] = var11[var15] + var9[var15];
					var7[var15] = var10[var15] + var13[var15];
				}
			} else if (var14 == 2) {
				for (int var16 = 0; var16 < class70.field1276; var16++) {
					var8[var16] = var5[var16] - var12[var16];
					var6[var16] = var9[var16] - var11[var16];
					var7[var16] = var10[var16] - var13[var16];
				}
			} else if (var14 == 3) {
				for (int var17 = 0; var17 < class70.field1276; var17++) {
					var8[var17] = var12[var17] * var5[var17] >> 12;
					var6[var17] = var9[var17] * var11[var17] >> 12;
					var7[var17] = var10[var17] * var13[var17] >> 12;
				}
			} else if (var14 == 4) {
				for (int var18 = 0; var18 < class70.field1276; var18++) {
					int var19 = var13[var18];
					int var20 = var11[var18];
					int var21 = var12[var18];
					var8[var18] = var21 == 0 ? 4096 : (var5[var18] << 12) / var21;
					var6[var18] = var20 == 0 ? 4096 : (var9[var18] << 12) / var20;
					var7[var18] = var19 == 0 ? 4096 : (var10[var18] << 12) / var19;
				}
			} else if (var14 == 5) {
				for (int var22 = 0; var22 < class70.field1276; var22++) {
					var8[var22] = 4096 - ((4096 - var5[var22]) * (4096 - var12[var22]) >> 12);
					var6[var22] = 4096 - ((4096 - var9[var22]) * (-var11[var22] + 4096) >> 12);
					var7[var22] = 4096 - ((4096 - var13[var22]) * (-var10[var22] + 4096) >> 12);
				}
			} else if (var14 == 6) {
				for (int var23 = 0; var23 < class70.field1276; var23++) {
					int var24 = var11[var23];
					int var25 = var13[var23];
					int var26 = var12[var23];
					var8[var23] = var26 >= 2048 ? 4096 - ((4096 - var5[var23]) * (-var26 + 4096) >> 11) : var5[var23] * var26 >> 11;
					var6[var23] = var24 >= 2048 ? 4096 - ((4096 - var9[var23]) * (-var24 + 4096) >> 11) : var9[var23] * var24 >> 11;
					var7[var23] = var25 >= 2048 ? 4096 - ((4096 - var25) * (-var10[var23] + 4096) >> 11) : var10[var23] * var25 >> 11;
				}
			} else if (var14 == 7) {
				for (int var27 = 0; var27 < class70.field1276; var27++) {
					int var28 = var5[var27];
					int var29 = var10[var27];
					int var30 = var9[var27];
					var8[var27] = var28 == 4096 ? 4096 : (var12[var27] << 12) / (4096 - var28);
					var6[var27] = var30 == 4096 ? 4096 : (var11[var27] << 12) / (4096 - var30);
					var7[var27] = var29 == 4096 ? 4096 : (var13[var27] << 12) / (4096 - var29);
				}
			} else if (var14 == 8) {
				for (int var31 = 0; var31 < class70.field1276; var31++) {
					int var32 = var10[var31];
					int var33 = var5[var31];
					int var34 = var9[var31];
					var8[var31] = var33 == 0 ? 0 : 4096 - (4096 - var12[var31] << 12) / var33;
					var6[var31] = var34 == 0 ? 0 : 4096 - (4096 - var11[var31] << 12) / var34;
					var7[var31] = var32 == 0 ? 0 : 4096 - (4096 - var13[var31] << 12) / var32;
				}
			} else if (var14 == 9) {
				for (int var35 = 0; var35 < class70.field1276; var35++) {
					int var36 = var10[var35];
					int var37 = var5[var35];
					int var38 = var9[var35];
					int var39 = var13[var35];
					int var40 = var11[var35];
					int var41 = var12[var35];
					var8[var35] = var41 > var37 ? var37 : var41;
					var6[var35] = var40 > var38 ? var38 : var40;
					var7[var35] = var39 <= var36 ? var39 : var36;
				}
			} else if (var14 == 10) {
				for (int var42 = 0; var42 < class70.field1276; var42++) {
					int var43 = var12[var42];
					int var44 = var13[var42];
					int var45 = var9[var42];
					int var46 = var10[var42];
					int var47 = var5[var42];
					int var48 = var11[var42];
					var8[var42] = var47 > var43 ? var47 : var43;
					var6[var42] = var45 <= var48 ? var48 : var45;
					var7[var42] = var44 >= var46 ? var44 : var46;
				}
			} else if (var14 == 11) {
				for (int var49 = 0; var49 < class70.field1276; var49++) {
					int var50 = var9[var49];
					int var51 = var11[var49];
					int var52 = var13[var49];
					int var53 = var5[var49];
					int var54 = var12[var49];
					int var55 = var10[var49];
					var8[var49] = var53 > var54 ? var53 - var54 : -var53 + var54;
					var6[var49] = var51 >= var50 ? var51 - var50 : -var51 + var50;
					var7[var49] = var55 <= var52 ? var52 - var55 : var55 + -var52;
				}
			} else if (var14 == 12) {
				for (int var56 = 0; var56 < class70.field1276; var56++) {
					int var57 = var11[var56];
					int var58 = var12[var56];
					int var59 = var5[var56];
					int var60 = var9[var56];
					int var61 = var13[var56];
					int var62 = var10[var56];
					var8[var56] = var58 + var59 - (var58 * var59 >> 11);
					var6[var56] = var60 + var57 - (var60 * var57 >> 11);
					var7[var56] = var62 + var61 - (var61 * var62 >> 11);
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("ph.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3326 = arg0.method347();
		} else if (arg1 == 1) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("ph.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			int[] var4 = this.method120(arg0, 1);
			int var5 = this.field3326;
			if (var5 == 1) {
				for (int var6 = 0; var6 < class70.field1276; var6++) {
					var2[var6] = var3[var6] + var4[var6];
				}
			} else if (var5 == 2) {
				for (int var7 = 0; var7 < class70.field1276; var7++) {
					var2[var7] = var3[var7] - var4[var7];
				}
			} else if (var5 == 3) {
				for (int var8 = 0; var8 < class70.field1276; var8++) {
					var2[var8] = var3[var8] * var4[var8] >> 12;
				}
			} else if (var5 == 4) {
				for (int var9 = 0; var9 < class70.field1276; var9++) {
					int var10 = var4[var9];
					var2[var9] = var10 == 0 ? 4096 : (var3[var9] << 12) / var10;
				}
			} else if (var5 == 5) {
				for (int var11 = 0; var11 < class70.field1276; var11++) {
					var2[var11] = 4096 - ((4096 - var3[var11]) * (-var4[var11] + 4096) >> 12);
				}
			} else if (var5 == 6) {
				for (int var12 = 0; var12 < class70.field1276; var12++) {
					int var13 = var4[var12];
					var2[var12] = var13 < 2048 ? var3[var12] * var13 >> 11 : 4096 - ((4096 - var13) * (-var3[var12] + 4096) >> 11);
				}
			} else if (var5 == 7) {
				for (int var14 = 0; var14 < class70.field1276; var14++) {
					int var15 = var3[var14];
					var2[var14] = var15 == 4096 ? 4096 : (var4[var14] << 12) / (4096 - var15);
				}
			} else if (var5 == 8) {
				for (int var16 = 0; var16 < class70.field1276; var16++) {
					int var17 = var3[var16];
					var2[var16] = var17 == 0 ? 0 : 4096 - (4096 - var4[var16] << 12) / var17;
				}
			} else if (var5 == 9) {
				for (int var18 = 0; var18 < class70.field1276; var18++) {
					int var19 = var3[var18];
					int var20 = var4[var18];
					var2[var18] = var20 > var19 ? var19 : var20;
				}
			} else if (var5 == 10) {
				for (int var21 = 0; var21 < class70.field1276; var21++) {
					int var22 = var4[var21];
					int var23 = var3[var21];
					var2[var21] = var22 < var23 ? var23 : var22;
				}
			} else if (var5 == 11) {
				for (int var24 = 0; var24 < class70.field1276; var24++) {
					int var25 = var4[var24];
					int var26 = var3[var24];
					var2[var24] = var26 > var25 ? var26 - var25 : var25 - var26;
				}
			} else if (var5 == 12) {
				for (int var27 = 0; var27 < class70.field1276; var27++) {
					int var28 = var3[var27];
					int var29 = var4[var27];
					var2[var27] = var29 + var28 - (var28 * var29 >> 11);
				}
			}
		}
		return var2;
	}
}
