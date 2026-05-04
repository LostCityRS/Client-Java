package deob;

@ObfuscatedName("sh")
public final class class204 extends class67 {

	@ObfuscatedName("sh.w")
	public static int[] field3882;

	@ObfuscatedName("sh.y")
	public static final class88 field3884 = class208.method1423(105, "Bitte starten Sie eine Mitgliedschaft");

	@ObfuscatedName("sh.M")
	public static final class88 field3898 = class208.method1423(105, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@ObfuscatedName("sh.D")
	public short[] field3889;

	@ObfuscatedName("sh.E")
	public byte[] field3890;

	@ObfuscatedName("sh.J")
	public class121[] field3895;

	@ObfuscatedName("sh.I")
	public byte[] field3894;

	@ObfuscatedName("sh.G")
	public class213[] field3892;

	@ObfuscatedName("sh.B")
	public int[] field3887;

	@ObfuscatedName("sh.L")
	public byte[] field3897;

	@ObfuscatedName("sh.K")
	public int field3896;

	@ObfuscatedName("sh.H")
	public static int field3893;

	@ObfuscatedName("sh.x")
	public static class144 field3883;

	@ObfuscatedName("sh.b(I)V")
	public static void method1395() {
		class118.field2133.method670();
	}

	@ObfuscatedName("sh.a(III)Ljj;")
	public static class108 method1396(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		if (var3 == null) {
			return null;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			class108 var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				return var5;
			}
		}
		return null;
	}

	@ObfuscatedName("sh.b(B)V")
	public static void method1397() {
		class17 var0 = class43.field732;
		synchronized (class43.field732) {
			class190.field3668++;
			class156.field3016 = class46.field807;
			class28.field471 = class232.field4353;
			class239.field4449 = class170.field3297;
			class36.field625 = class158.field3044;
			class226.field4239 = class46.field833;
			class172.field3339 = class139.field2575;
			class36.field623 = class186.field3631;
			class158.field3044 = 0;
		}
	}

	@ObfuscatedName("sh.a(IIIIIII)V")
	public static void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (class28.field475 == 0 && !class10.field145) {
			int var6 = class147.field2766;
			int var7 = class151.field2931;
			int var8 = class58.field1102;
			int var9 = class217.field4055;
			int var10 = var8 + (var9 - var8) * (arg0 - arg4) / arg2;
			int var11 = var6 + (var7 - var6) * (arg5 - arg1) / arg3;
			class98.method685(var11, class4.field54, (short) 10, 0L, class174.field3453, var10);
		}
		long var12 = -1L;
		for (int var14 = 0; var14 < class161.field3101; var14++) {
			long var15 = class28.field476[var14];
			int var17 = (int) var15 & 0x7F;
			int var18 = (int) var15 >> 7 & 0x7F;
			int var19 = (int) var15 >> 29 & 0x3;
			int var20 = Integer.MAX_VALUE & (int) (var15 >>> 32);
			if (var15 != var12) {
				var12 = var15;
				if (var19 == 2 && class202.method1386(class149.field2907, var17, var18, var15)) {
					class148 var21 = class190.method1321(var20);
					if (var21.field2770 != null) {
						var21 = var21.method998();
					}
					if (var21 == null) {
						continue;
					}
					if (class28.field475 == 1) {
						class98.method685(var17, class35.field608, (short) 26, var15, class166.method1140(new class88[] { class78.field1414, class175.field3526, var21.field2773 }), var18);
					} else if (!class10.field145) {
						class88[] var22 = var21.field2816;
						if (class99.field1807) {
							var22 = class138.method921(var22);
						}
						if (var22 != null) {
							for (int var23 = 4; var23 >= 0; var23--) {
								if (var22[var23] != null) {
									short var24 = 0;
									if (var23 == 0) {
										var24 = 7;
									}
									if (var23 == 1) {
										var24 = 35;
									}
									if (var23 == 2) {
										var24 = 51;
									}
									if (var23 == 3) {
										var24 = 33;
									}
									if (var23 == 4) {
										var24 = 1004;
									}
									class98.method685(var17, var22[var23], var24, var15, class166.method1140(new class88[] { class17.field259, var21.field2773 }), var18);
								}
							}
						}
						class98.method685(var17, class65.field1174, (short) 1005, (long) var21.field2831, class166.method1140(new class88[] { class17.field259, var21.field2773 }), var18);
					} else if ((class115.field2084 & 0x4) == 4) {
						class98.method685(var17, class201.field3835, (short) 24, var15, class166.method1140(new class88[] { class28.field464, class175.field3526, var21.field2773 }), var18);
					}
				}
				if (var19 == 1) {
					class191 var25 = class225.field4223[var20];
					if (var25.field3682.field2349 == 1 && (var25.field4136 & 0x7F) == 64 && (var25.field4121 & 0x7F) == 64) {
						for (int var26 = 0; var26 < class55.field1041; var26++) {
							class191 var27 = class225.field4223[class25.field402[var26]];
							if (var27 != null && var25 != var27 && var27.field3682.field2349 == 1 && var25.field4136 == var27.field4136 && var25.field4121 == var27.field4121) {
								class225.method1513(var27.field3682, class25.field402[var26], var18, var17);
							}
						}
						for (int var28 = 0; var28 < class55.field1027; var28++) {
							class44 var29 = class244.field4491[class174.field3428[var28]];
							if (var29 != null && var25.field4136 == var29.field4136 && var29.field4121 == var25.field4121) {
								class139.method922(class174.field3428[var28], var17, var18, var29);
							}
						}
					}
					class225.method1513(var25.field3682, var20, var18, var17);
				}
				if (var19 == 0) {
					class44 var30 = class244.field4491[var20];
					if ((var30.field4136 & 0x7F) == 64 && (var30.field4121 & 0x7F) == 64) {
						for (int var31 = 0; var31 < class55.field1041; var31++) {
							class191 var32 = class225.field4223[class25.field402[var31]];
							if (var32 != null && var32.field3682.field2349 == 1 && var32.field4136 == var30.field4136 && var32.field4121 == var30.field4121) {
								class225.method1513(var32.field3682, class25.field402[var31], var18, var17);
							}
						}
						for (int var33 = 0; var33 < class55.field1027; var33++) {
							class44 var34 = class244.field4491[class174.field3428[var33]];
							if (var34 != null && var34 != var30 && var34.field4136 == var30.field4136 && var34.field4121 == var30.field4121) {
								class139.method922(class174.field3428[var33], var17, var18, var34);
							}
						}
					}
					class139.method922(var20, var17, var18, var30);
				}
				if (var19 == 3) {
					class248 var35 = class134.field2497[class149.field2907][var17][var18];
					if (var35 != null) {
						for (class227 var36 = (class227) var35.method1612(); var36 != null; var36 = (class227) var35.method1617()) {
							int var37 = var36.field4258.field2030;
							class149 var38 = class71.method472(var37);
							if (class28.field475 == 1) {
								class98.method685(var17, class35.field608, (short) 46, (long) var37, class166.method1140(new class88[] { class78.field1414, class34.field581, var38.field2892 }), var18);
							} else if (!class10.field145) {
								class88[] var39 = var38.field2898;
								if (class99.field1807) {
									var39 = class138.method921(var39);
								}
								for (int var40 = 4; var40 >= 0; var40--) {
									if (var39 != null && var39[var40] != null) {
										byte var41 = 0;
										if (var40 == 0) {
											var41 = 5;
										}
										if (var40 == 1) {
											var41 = 22;
										}
										if (var40 == 2) {
											var41 = 41;
										}
										if (var40 == 3) {
											var41 = 57;
										}
										if (var40 == 4) {
											var41 = 3;
										}
										class98.method685(var17, var39[var40], var41, (long) var37, class166.method1140(new class88[] { class136.field2529, var38.field2892 }), var18);
									} else if (var40 == 2) {
										class98.method685(var17, class231.field4343, (short) 41, (long) var37, class166.method1140(new class88[] { class136.field2529, var38.field2892 }), var18);
									}
								}
								class98.method685(var17, class65.field1174, (short) 1006, (long) var37, class166.method1140(new class88[] { class136.field2529, var38.field2892 }), var18);
							} else if ((class115.field2084 & 0x1) == 1) {
								class98.method685(var17, class201.field3835, (short) 25, (long) var37, class166.method1140(new class88[] { class28.field464, class34.field581, var38.field2892 }), var18);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("sh.c(B)V")
	public static void method1399() {
		class206.field3920.method670();
	}

	@ObfuscatedName("sh.c(I)V")
	public static void method1401() {
		if (class181.field3594.toLowerCase().indexOf("microsoft") != -1) {
			class237.field4423[223] = 28;
			class237.field4423[222] = 59;
			class237.field4423[189] = 26;
			class237.field4423[191] = 73;
			class237.field4423[190] = 72;
			class237.field4423[192] = 58;
			class237.field4423[219] = 42;
			class237.field4423[221] = 43;
			class237.field4423[220] = 74;
			class237.field4423[187] = 27;
			class237.field4423[188] = 71;
			class237.field4423[186] = 57;
			return;
		}
		class237.field4423[46] = 72;
		class237.field4423[44] = 71;
		class237.field4423[92] = 74;
		class237.field4423[59] = 57;
		class237.field4423[61] = 27;
		if (class181.field3586 == null) {
			class237.field4423[192] = 58;
			class237.field4423[222] = 59;
		} else {
			class237.field4423[520] = 59;
			class237.field4423[192] = 28;
			class237.field4423[222] = 58;
		}
		class237.field4423[47] = 73;
		class237.field4423[91] = 42;
		class237.field4423[93] = 43;
		class237.field4423[45] = 26;
	}

	public class204() {
	}

	public class204(byte[] arg0) {
		this.field3889 = new short[128];
		this.field3890 = new byte[128];
		this.field3895 = new class121[128];
		this.field3894 = new byte[128];
		this.field3892 = new class213[128];
		this.field3887 = new int[128];
		this.field3897 = new byte[128];
		class46 var2 = new class46(arg0);
		int var3;
		for (var3 = 0; var2.field842[var3 + var2.field831] != 0; var3++) {
		}
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < var3; var5++) {
			var4[var5] = var2.method324();
		}
		var2.field831++;
		var3++;
		int var6 = var2.field831;
		var2.field831 += var3;
		int var7;
		for (var7 = 0; var2.field842[var7 + var2.field831] != 0; var7++) {
		}
		byte[] var8 = new byte[var7];
		for (int var9 = 0; var9 < var7; var9++) {
			var8[var9] = var2.method324();
		}
		var2.field831++;
		var7++;
		int var10 = var2.field831;
		var2.field831 += var7;
		int var11;
		for (var11 = 0; var2.field842[var11 + var2.field831] != 0; var11++) {
		}
		byte[] var12 = new byte[var11];
		for (int var13 = 0; var13 < var11; var13++) {
			var12[var13] = var2.method324();
		}
		var2.field831++;
		var11++;
		byte[] var14 = new byte[var11];
		int var15;
		if (var11 > 1) {
			var15 = 2;
			var14[1] = 1;
			int var16 = 1;
			for (int var17 = 2; var17 < var11; var17++) {
				int var18 = var2.method347();
				if (var18 == 0) {
					var16 = var15++;
				} else {
					if (var18 <= var16) {
						var18--;
					}
					var16 = var18;
				}
				var14[var17] = (byte) var16;
			}
		} else {
			var15 = var11;
		}
		class121[] var19 = new class121[var15];
		for (int var20 = 0; var20 < var19.length; var20++) {
			class121 var21 = var19[var20] = new class121();
			int var22 = var2.method347();
			if (var22 > 0) {
				var21.field2216 = new byte[var22 * 2];
			}
			int var23 = var2.method347();
			if (var23 > 0) {
				var21.field2205 = new byte[var23 * 2 + 2];
				var21.field2205[1] = 64;
			}
		}
		int var24 = var2.method347();
		byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
		int var26 = var2.method347();
		byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
		int var28;
		for (var28 = 0; var2.field842[var28 + var2.field831] != 0; var28++) {
		}
		byte[] var29 = new byte[var28];
		for (int var30 = 0; var30 < var28; var30++) {
			var29[var30] = var2.method324();
		}
		var2.field831++;
		var28++;
		int var31 = 0;
		for (int var32 = 0; var32 < 128; var32++) {
			var31 += var2.method347();
			this.field3889[var32] = (short) var31;
		}
		int var33 = 0;
		for (int var34 = 0; var34 < 128; var34++) {
			var33 += var2.method347();
			this.field3889[var34] = (short) (this.field3889[var34] + (var33 << 8));
		}
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;
		for (int var38 = 0; var38 < 128; var38++) {
			if (var35 == 0) {
				if (var29.length <= var37) {
					var35 = -1;
				} else {
					var35 = var29[var37++];
				}
				var36 = var2.method317();
			}
			this.field3889[var38] = (short) (this.field3889[var38] + ((var36 - 1 & 0x2) << 14));
			this.field3887[var38] = var36;
			var35--;
		}
		int var39 = 0;
		int var40 = 0;
		int var41 = 0;
		for (int var42 = 0; var42 < 128; var42++) {
			if (this.field3887[var42] != 0) {
				if (var39 == 0) {
					var41 = var2.field842[var6++] - 1;
					if (var4.length <= var40) {
						var39 = -1;
					} else {
						var39 = var4[var40++];
					}
				}
				var39--;
				this.field3890[var42] = (byte) var41;
			}
		}
		int var43 = 0;
		int var44 = 0;
		int var45 = 0;
		for (int var46 = 0; var46 < 128; var46++) {
			if (this.field3887[var46] != 0) {
				if (var43 == 0) {
					if (var44 >= var8.length) {
						var43 = -1;
					} else {
						var43 = var8[var44++];
					}
					var45 = var2.field842[var10++] + 16 << 2;
				}
				this.field3897[var46] = (byte) var45;
				var43--;
			}
		}
		int var47 = 0;
		int var48 = 0;
		class121 var49 = null;
		for (int var50 = 0; var50 < 128; var50++) {
			if (this.field3887[var50] != 0) {
				if (var48 == 0) {
					var49 = var19[var14[var47]];
					if (var47 >= var12.length) {
						var48 = -1;
					} else {
						var48 = var12[var47++];
					}
				}
				this.field3895[var50] = var49;
				var48--;
			}
		}
		int var51 = 0;
		int var52 = 0;
		int var53 = 0;
		for (int var54 = 0; var54 < 128; var54++) {
			if (var53 == 0) {
				if (var51 < var29.length) {
					var53 = var29[var51++];
				} else {
					var53 = -1;
				}
				if (this.field3887[var54] > 0) {
					var52 = var2.method347() + 1;
				}
			}
			var53--;
			this.field3894[var54] = (byte) var52;
		}
		this.field3896 = var2.method347() + 1;
		for (int var55 = 0; var55 < var15; var55++) {
			class121 var56 = var19[var55];
			if (var56.field2216 != null) {
				for (int var57 = 1; var57 < var56.field2216.length; var57 += 2) {
					var56.field2216[var57] = var2.method324();
				}
			}
			if (var56.field2205 != null) {
				for (int var58 = 3; var58 < var56.field2205.length - 2; var58 += 2) {
					var56.field2205[var58] = var2.method324();
				}
			}
		}
		if (var25 != null) {
			for (int var59 = 1; var59 < var25.length; var59 += 2) {
				var25[var59] = var2.method324();
			}
		}
		if (var27 != null) {
			for (int var60 = 1; var60 < var27.length; var60 += 2) {
				var27[var60] = var2.method324();
			}
		}
		for (int var61 = 0; var61 < var15; var61++) {
			class121 var62 = var19[var61];
			if (var62.field2205 != null) {
				int var63 = 0;
				for (int var64 = 2; var64 < var62.field2205.length; var64 += 2) {
					var63 = var63 + var2.method347() + 1;
					var62.field2205[var64] = (byte) var63;
				}
			}
		}
		for (int var65 = 0; var65 < var15; var65++) {
			class121 var66 = var19[var65];
			if (var66.field2216 != null) {
				int var67 = 0;
				for (int var68 = 2; var68 < var66.field2216.length; var68 += 2) {
					var67 = var67 + var2.method347() + 1;
					var66.field2216[var68] = (byte) var67;
				}
			}
		}
		if (var25 != null) {
			int var69 = var2.method347();
			var25[0] = (byte) var69;
			for (int var70 = 2; var70 < var25.length; var70 += 2) {
				var69 = var69 + var2.method347() + 1;
				var25[var70] = (byte) var69;
			}
			byte var71 = var25[0];
			byte var72 = var25[1];
			for (int var73 = 0; var73 < var71; var73++) {
				this.field3894[var73] = (byte) (this.field3894[var73] * var72 + 32 >> 6);
			}
			int var74 = 2;
			while (var25.length > var74) {
				byte var75 = var25[var74 + 1];
				byte var76 = var25[var74];
				var74 += 2;
				int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
				for (int var78 = var71; var78 < var76; var78++) {
					int var79 = class180.method1284(var76 - var71, var77);
					var77 += var75 - var72;
					this.field3894[var78] = (byte) (this.field3894[var78] * var79 + 32 >> 6);
				}
				var71 = var76;
				var72 = var75;
			}
			for (int var80 = var71; var80 < 128; var80++) {
				this.field3894[var80] = (byte) (var72 * this.field3894[var80] + 32 >> 6);
			}
		}
		if (var27 != null) {
			int var81 = var2.method347();
			var27[0] = (byte) var81;
			for (int var82 = 2; var82 < var27.length; var82 += 2) {
				var81 = var81 + var2.method347() + 1;
				var27[var82] = (byte) var81;
			}
			byte var83 = var27[0];
			int var84 = var27[1] << 1;
			for (int var85 = 0; var85 < var83; var85++) {
				int var86 = var84 + (this.field3897[var85] & 0xFF);
				if (var86 < 0) {
					var86 = 0;
				}
				if (var86 > 128) {
					var86 = 128;
				}
				this.field3897[var85] = (byte) var86;
			}
			int var87 = 2;
			while (var27.length > var87) {
				byte var88 = var27[var87];
				int var89 = var27[var87 + 1] << 1;
				var87 += 2;
				int var90 = (var88 - var83) / 2 + (var88 - var83) * var84;
				for (int var91 = var83; var91 < var88; var91++) {
					int var92 = class180.method1284(var88 - var83, var90);
					int var93 = (this.field3897[var91] & 0xFF) + var92;
					if (var93 < 0) {
						var93 = 0;
					}
					var90 += var89 - var84;
					if (var93 > 128) {
						var93 = 128;
					}
					this.field3897[var91] = (byte) var93;
				}
				var83 = var88;
				var84 = var89;
			}
			for (int var94 = var83; var94 < 128; var94++) {
				int var95 = var84 + (this.field3897[var94] & 0xFF);
				if (var95 < 0) {
					var95 = 0;
				}
				if (var95 > 128) {
					var95 = 128;
				}
				this.field3897[var94] = (byte) var95;
			}
		}
		for (int var96 = 0; var96 < var15; var96++) {
			var19[var96].field2208 = var2.method347();
		}
		for (int var97 = 0; var97 < var15; var97++) {
			class121 var98 = var19[var97];
			if (var98.field2216 != null) {
				var98.field2215 = var2.method347();
			}
			if (var98.field2205 != null) {
				var98.field2212 = var2.method347();
			}
			if (var98.field2208 > 0) {
				var98.field2207 = var2.method347();
			}
		}
		for (int var99 = 0; var99 < var15; var99++) {
			var19[var99].field2209 = var2.method347();
		}
		for (int var100 = 0; var100 < var15; var100++) {
			class121 var101 = var19[var100];
			if (var101.field2209 > 0) {
				var101.field2211 = var2.method347();
			}
		}
		for (int var102 = 0; var102 < var15; var102++) {
			class121 var103 = var19[var102];
			if (var103.field2211 > 0) {
				var103.field2210 = var2.method347();
			}
		}
	}

	@ObfuscatedName("sh.a([IILnj;[B)Z")
	public boolean method1400(int[] arg0, class151 arg1, byte[] arg2) {
		boolean var4 = true;
		int var5 = 0;
		class213 var6 = null;
		for (int var7 = 0; var7 < 128; var7++) {
			if (arg2 == null || arg2[var7] != 0) {
				int var8 = this.field3887[var7];
				if (var8 != 0) {
					if (var5 != var8) {
						var5 = var8--;
						if ((var8 & 0x1) == 0) {
							var6 = arg1.method1032(var8 >> 2, arg0);
						} else {
							var6 = arg1.method1035(arg0, var8 >> 2);
						}
						if (var6 == null) {
							var4 = false;
						}
					}
					if (var6 != null) {
						this.field3892[var7] = var6;
						this.field3887[var7] = 0;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("sh.d(B)V")
	public void method1404() {
		this.field3887 = null;
	}
}
