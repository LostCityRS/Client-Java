package deob;

@ObfuscatedName("th")
public final class class215 {

	@ObfuscatedName("th.a")
	public static final class165 field4043 = new class165();

	@ObfuscatedName("th.a([BI[BII)I")
	public static int method1458(byte[] arg0, int arg1, byte[] arg2, int arg3) {
		class165 var4 = field4043;
		synchronized (field4043) {
			field4043.field3183 = arg2;
			field4043.field3151 = 9;
			field4043.field3169 = arg0;
			field4043.field3175 = 0;
			field4043.field3177 = arg1;
			field4043.field3178 = 0;
			field4043.field3184 = 0;
			field4043.field3166 = 0;
			field4043.field3170 = 0;
			method1462(field4043);
			int var5 = arg1 - field4043.field3177;
			field4043.field3183 = null;
			field4043.field3169 = null;
			return var5;
		}
	}

	@ObfuscatedName("th.a(Lpb;)B")
	public static byte method1459(class165 arg0) {
		return (byte) method1460(1, arg0);
	}

	@ObfuscatedName("th.a(ILpb;)I")
	public static int method1460(int arg0, class165 arg1) {
		while (arg1.field3178 < arg0) {
			arg1.field3184 = arg1.field3184 << 8 | arg1.field3183[arg1.field3151] & 0xFF;
			arg1.field3178 += 8;
			arg1.field3151++;
			arg1.field3166++;
		}
		int var2 = arg1.field3184 >> arg1.field3178 - arg0 & (0x1 << arg0) - 1;
		arg1.field3178 -= arg0;
		return var2;
	}

	@ObfuscatedName("th.a([I[I[I[BIII)V")
	public static void method1461(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		for (int var8 = arg4; var8 <= arg5; var8++) {
			for (int var9 = 0; var9 < arg6; var9++) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					var7++;
				}
			}
		}
		for (int var10 = 0; var10 < 23; var10++) {
			arg1[var10] = 0;
		}
		for (int var11 = 0; var11 < arg6; var11++) {
			arg1[arg3[var11] + 1]++;
		}
		for (int var12 = 1; var12 < 23; var12++) {
			arg1[var12] += arg1[var12 - 1];
		}
		for (int var13 = 0; var13 < 23; var13++) {
			arg0[var13] = 0;
		}
		int var14 = 0;
		for (int var15 = arg4; var15 <= arg5; var15++) {
			int var16 = var14 + arg1[var15 + 1] - arg1[var15];
			arg0[var15] = var16 - 1;
			var14 = var16 << 1;
		}
		for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
			arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
		}
	}

	@ObfuscatedName("th.b(Lpb;)V")
	public static void method1462(class165 arg0) {
		arg0.field3181 = 1;
		if (class101.field1831 == null) {
			class101.field1831 = new int[arg0.field3181 * 100000];
		}
		boolean var1 = true;
		while (true) {
			while (var1) {
				byte var2 = method1464(arg0);
				if (var2 == 23) {
					return;
				}
				byte var3 = method1464(arg0);
				byte var4 = method1464(arg0);
				byte var5 = method1464(arg0);
				byte var6 = method1464(arg0);
				byte var7 = method1464(arg0);
				byte var8 = method1464(arg0);
				byte var9 = method1464(arg0);
				byte var10 = method1464(arg0);
				byte var11 = method1464(arg0);
				byte var12 = method1459(arg0);
				arg0.field3162 = 0;
				byte var13 = method1464(arg0);
				arg0.field3162 = arg0.field3162 << 8 | var13 & 0xFF;
				byte var14 = method1464(arg0);
				arg0.field3162 = arg0.field3162 << 8 | var14 & 0xFF;
				byte var15 = method1464(arg0);
				arg0.field3162 = arg0.field3162 << 8 | var15 & 0xFF;
				for (int var16 = 0; var16 < 16; var16++) {
					byte var17 = method1459(arg0);
					if (var17 == 1) {
						arg0.field3149[var16] = true;
					} else {
						arg0.field3149[var16] = false;
					}
				}
				for (int var18 = 0; var18 < 256; var18++) {
					arg0.field3171[var18] = false;
				}
				for (int var19 = 0; var19 < 16; var19++) {
					if (arg0.field3149[var19]) {
						for (int var20 = 0; var20 < 16; var20++) {
							byte var21 = method1459(arg0);
							if (var21 == 1) {
								arg0.field3171[var19 * 16 + var20] = true;
							}
						}
					}
				}
				method1465(arg0);
				int var22 = arg0.field3172 + 2;
				int var23 = method1460(3, arg0);
				int var24 = method1460(15, arg0);
				for (int var25 = 0; var25 < var24; var25++) {
					int var26 = 0;
					while (true) {
						byte var27 = method1459(arg0);
						if (var27 == 0) {
							arg0.field3154[var25] = (byte) var26;
							break;
						}
						var26++;
					}
				}
				byte[] var28 = new byte[6];
				byte var29 = 0;
				while (var29 < var23) {
					var28[var29] = var29++;
				}
				for (int var30 = 0; var30 < var24; var30++) {
					byte var31 = arg0.field3154[var30];
					byte var32 = var28[var31];
					while (var31 > 0) {
						var28[var31] = var28[var31 - 1];
						var31--;
					}
					var28[0] = var32;
					arg0.field3152[var30] = var32;
				}
				for (int var33 = 0; var33 < var23; var33++) {
					int var34 = method1460(5, arg0);
					for (int var35 = 0; var35 < var22; var35++) {
						while (true) {
							byte var36 = method1459(arg0);
							if (var36 == 0) {
								arg0.field3153[var33][var35] = (byte) var34;
								break;
							}
							byte var37 = method1459(arg0);
							if (var37 == 0) {
								var34++;
							} else {
								var34--;
							}
						}
					}
				}
				for (int var38 = 0; var38 < var23; var38++) {
					byte var39 = 32;
					byte var40 = 0;
					for (int var41 = 0; var41 < var22; var41++) {
						if (arg0.field3153[var38][var41] > var40) {
							var40 = arg0.field3153[var38][var41];
						}
						if (arg0.field3153[var38][var41] < var39) {
							var39 = arg0.field3153[var38][var41];
						}
					}
					method1461(arg0.field3147[var38], arg0.field3173[var38], arg0.field3174[var38], arg0.field3153[var38], var39, var40, var22);
					arg0.field3150[var38] = var39;
				}
				int var42 = arg0.field3172 + 1;
				byte var43 = -1;
				for (int var44 = 0; var44 <= 255; var44++) {
					arg0.field3160[var44] = 0;
				}
				int var45 = 4095;
				for (int var46 = 15; var46 >= 0; var46--) {
					for (int var47 = 15; var47 >= 0; var47--) {
						arg0.field3168[var45] = (byte) (var46 * 16 + var47);
						var45--;
					}
					arg0.field3180[var46] = var45 + 1;
				}
				int var48 = 0;
				int var84 = var43 + 1;
				byte var49 = 50;
				byte var50 = arg0.field3152[0];
				int var51 = arg0.field3150[var50];
				int[] var52 = arg0.field3147[var50];
				int[] var53 = arg0.field3174[var50];
				int[] var54 = arg0.field3173[var50];
				int var85 = var49 - 1;
				int var55 = var51;
				int var56;
				byte var57;
				for (var56 = method1460(var51, arg0); var56 > var52[var55]; var56 = var56 << 1 | var57) {
					var55++;
					var57 = method1459(arg0);
				}
				int var58 = var53[var56 - var54[var55]];
				while (true) {
					while (var58 != var42) {
						if (var58 == 0 || var58 == 1) {
							int var59 = -1;
							int var60 = 1;
							do {
								if (var58 == 0) {
									var59 += var60;
								} else if (var58 == 1) {
									var59 += var60 * 2;
								}
								var60 *= 2;
								if (var85 == 0) {
									var84++;
									var85 = 50;
									byte var61 = arg0.field3152[var84];
									var51 = arg0.field3150[var61];
									var52 = arg0.field3147[var61];
									var53 = arg0.field3174[var61];
									var54 = arg0.field3173[var61];
								}
								var85--;
								int var62 = var51;
								int var63;
								byte var64;
								for (var63 = method1460(var51, arg0); var63 > var52[var62]; var63 = var63 << 1 | var64) {
									var62++;
									var64 = method1459(arg0);
								}
								var58 = var53[var63 - var54[var62]];
							} while (var58 == 0 || var58 == 1);
							var59++;
							byte var65 = arg0.field3158[arg0.field3168[arg0.field3180[0]] & 0xFF];
							arg0.field3160[var65 & 0xFF] += var59;
							while (var59 > 0) {
								class101.field1831[var48] = var65 & 0xFF;
								var48++;
								var59--;
							}
						} else {
							int var66 = var58 - 1;
							byte var68;
							if (var66 < 16) {
								int var67 = arg0.field3180[0];
								var68 = arg0.field3168[var67 + var66];
								while (var66 > 3) {
									int var69 = var67 + var66;
									arg0.field3168[var69] = arg0.field3168[var69 - 1];
									arg0.field3168[var69 - 1] = arg0.field3168[var69 - 2];
									arg0.field3168[var69 - 2] = arg0.field3168[var69 - 3];
									arg0.field3168[var69 - 3] = arg0.field3168[var69 - 4];
									var66 -= 4;
								}
								while (var66 > 0) {
									arg0.field3168[var67 + var66] = arg0.field3168[var67 + var66 - 1];
									var66--;
								}
								arg0.field3168[var67] = var68;
							} else {
								int var70 = var66 / 16;
								int var71 = var66 % 16;
								int var72 = arg0.field3180[var70] + var71;
								var68 = arg0.field3168[var72];
								while (var72 > arg0.field3180[var70]) {
									arg0.field3168[var72] = arg0.field3168[var72 - 1];
									var72--;
								}
								int var10002 = arg0.field3180[var70]++;
								while (var70 > 0) {
									var10002 = arg0.field3180[var70]--;
									arg0.field3168[arg0.field3180[var70]] = arg0.field3168[arg0.field3180[var70 - 1] + 16 - 1];
									var70--;
								}
								var10002 = arg0.field3180[0]--;
								arg0.field3168[arg0.field3180[0]] = var68;
								if (arg0.field3180[0] == 0) {
									int var73 = 4095;
									for (int var74 = 15; var74 >= 0; var74--) {
										for (int var75 = 15; var75 >= 0; var75--) {
											arg0.field3168[var73] = arg0.field3168[arg0.field3180[var74] + var75];
											var73--;
										}
										arg0.field3180[var74] = var73 + 1;
									}
								}
							}
							arg0.field3160[arg0.field3158[var68 & 0xFF] & 0xFF]++;
							class101.field1831[var48] = arg0.field3158[var68 & 0xFF] & 0xFF;
							var48++;
							if (var85 == 0) {
								var84++;
								var85 = 50;
								byte var76 = arg0.field3152[var84];
								var51 = arg0.field3150[var76];
								var52 = arg0.field3147[var76];
								var53 = arg0.field3174[var76];
								var54 = arg0.field3173[var76];
							}
							var85--;
							int var77 = var51;
							int var78;
							byte var79;
							for (var78 = method1460(var51, arg0); var78 > var52[var77]; var78 = var78 << 1 | var79) {
								var77++;
								var79 = method1459(arg0);
							}
							var58 = var53[var78 - var54[var77]];
						}
					}
					arg0.field3164 = 0;
					arg0.field3182 = 0;
					arg0.field3157[0] = 0;
					for (int var80 = 1; var80 <= 256; var80++) {
						arg0.field3157[var80] = arg0.field3160[var80 - 1];
					}
					for (int var81 = 1; var81 <= 256; var81++) {
						arg0.field3157[var81] += arg0.field3157[var81 - 1];
					}
					for (int var82 = 0; var82 < var48; var82++) {
						byte var83 = (byte) (class101.field1831[var82] & 0xFF);
						class101.field1831[arg0.field3157[var83 & 0xFF]] |= var82 << 8;
						arg0.field3157[var83 & 0xFF]++;
					}
					arg0.field3161 = class101.field1831[arg0.field3162] >> 8;
					arg0.field3185 = 0;
					arg0.field3161 = class101.field1831[arg0.field3161];
					arg0.field3155 = (byte) (arg0.field3161 & 0xFF);
					arg0.field3161 >>= 0x8;
					arg0.field3185++;
					arg0.field3167 = var48;
					method1466(arg0);
					if (arg0.field3185 == arg0.field3167 + 1 && arg0.field3164 == 0) {
						var1 = true;
						break;
					}
					var1 = false;
					break;
				}
			}
			return;
		}
	}

	@ObfuscatedName("th.c(Lpb;)B")
	public static byte method1464(class165 arg0) {
		return (byte) method1460(8, arg0);
	}

	@ObfuscatedName("th.d(Lpb;)V")
	public static void method1465(class165 arg0) {
		arg0.field3172 = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.field3171[var1]) {
				arg0.field3158[arg0.field3172] = (byte) var1;
				arg0.field3172++;
			}
		}
	}

	@ObfuscatedName("th.e(Lpb;)V")
	public static void method1466(class165 arg0) {
		byte var1 = arg0.field3182;
		int var2 = arg0.field3164;
		int var3 = arg0.field3185;
		int var4 = arg0.field3155;
		int[] var5 = class101.field1831;
		int var6 = arg0.field3161;
		byte[] var7 = arg0.field3169;
		int var8 = arg0.field3175;
		int var9 = arg0.field3177;
		int var10 = var9;
		int var11 = arg0.field3167 + 1;
		label63: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label63;
					}
					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label63;
						}
						var7[var8] = var1;
						var8++;
						var9--;
						break;
					}
					var7[var8] = var1;
					var2--;
					var8++;
					var9--;
				}
			}
			boolean var12 = true;
			while (var12) {
				var12 = false;
				if (var3 == var11) {
					var2 = 0;
					break label63;
				}
				var1 = (byte) var4;
				int var13 = var5[var6];
				byte var14 = (byte) (var13 & 0xFF);
				var6 = var13 >> 8;
				var3++;
				if (var14 != var4) {
					var4 = var14;
					if (var9 == 0) {
						var2 = 1;
						break label63;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label63;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				}
			}
			var2 = 2;
			int var15 = var5[var6];
			byte var16 = (byte) (var15 & 0xFF);
			var6 = var15 >> 8;
			var3++;
			if (var3 != var11) {
				if (var16 == var4) {
					var2 = 3;
					int var17 = var5[var6];
					byte var18 = (byte) (var17 & 0xFF);
					var6 = var17 >> 8;
					var3++;
					if (var3 != var11) {
						if (var18 == var4) {
							int var19 = var5[var6];
							byte var20 = (byte) (var19 & 0xFF);
							int var21 = var19 >> 8;
							var3++;
							var2 = (var20 & 0xFF) + 4;
							int var22 = var5[var21];
							var4 = (byte) (var22 & 0xFF);
							var6 = var22 >> 8;
							var3++;
						} else {
							var4 = var18;
						}
					}
				} else {
					var4 = var16;
				}
			}
		}
		int var23 = arg0.field3170;
		arg0.field3170 += var10 - var9;
		arg0.field3182 = var1;
		arg0.field3164 = var2;
		arg0.field3185 = var3;
		arg0.field3155 = var4;
		class101.field1831 = var5;
		arg0.field3161 = var6;
		arg0.field3169 = var7;
		arg0.field3175 = var8;
		arg0.field3177 = var9;
	}
}
