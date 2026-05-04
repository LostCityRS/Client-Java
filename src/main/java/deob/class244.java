package deob;

@ObfuscatedName("we")
public final class class244 extends class67 {

	@ObfuscatedName("we.t")
	public int field4483;

	@ObfuscatedName("we.v")
	public int field4485;

	@ObfuscatedName("we.w")
	public class88 field4486;

	@ObfuscatedName("we.B")
	public static final class44[] field4491 = new class44[2048];

	@ObfuscatedName("we.D")
	public static int field4493 = 0;

	@ObfuscatedName("we.E")
	public static final class88 field4494 = class208.method1423(105, "Hierhin gehen");

	@ObfuscatedName("we.F")
	public static final int[] field4495 = new int[32];

	@ObfuscatedName("we.C")
	public int field4492;

	@ObfuscatedName("we.y")
	public static class61 field4488;

	@ObfuscatedName("we.A")
	public class88[] field4490;

	@ObfuscatedName("we.b(I)V")
	public static void method1598() {
		if (class238.field4430 == 123) {
			int var0 = class230.field4312.method347();
			int var1 = class150.field2910 * 2 + (var0 & 0xF);
			int var2 = (var0 >> 4 & 0xF) + class121.field2213 * 2;
			int var3 = class230.field4312.method324() + var2;
			int var4 = var1 + class230.field4312.method324();
			int var5 = class230.field4312.method334();
			int var6 = class230.field4312.method301();
			int var7 = class230.field4312.method347() * 4;
			int var8 = class230.field4312.method347() * 4;
			int var9 = class230.field4312.method301();
			int var10 = class230.field4312.method301();
			int var11 = class230.field4312.method347();
			int var12 = class230.field4312.method347();
			if (var2 >= 0 && var1 >= 0 && var2 < 208 && var1 < 208 && var3 >= 0 && var4 >= 0 && var3 < 208 && var4 < 208 && var6 != 65535) {
				int var13 = var1 * 64;
				int var14 = var2 * 64;
				int var15 = var4 * 64;
				class77 var16 = new class77(var6, class149.field2907, var14, var13, class239.method1584(var14, var13, class149.field2907) - var7, var9 - -class117.field2113, class117.field2113 + var10, var11, var12, var5, var8);
				int var17 = var3 * 64;
				var16.method520(var17, var9 + class117.field2113, class239.method1584(var17, var15, class149.field2907) + -var8, var15);
				class167.field3220.method1622(new class20(var16));
			}
		} else if (class238.field4430 == 135) {
			int var18 = class230.field4312.method319();
			int var19 = (var18 & 0x7) + class150.field2910;
			int var20 = class121.field2213 + (var18 >> 4 & 0x7);
			int var21 = class230.field4312.method302();
			int var22 = class230.field4312.method349();
			int var23 = class230.field4312.method349();
			if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104 && var22 != class220.field4164) {
				class111 var24 = new class111();
				var24.field2029 = var23;
				var24.field2030 = var21;
				if (class134.field2497[class149.field2907][var20][var19] == null) {
					class134.field2497[class149.field2907][var20][var19] = new class248();
				}
				class134.field2497[class149.field2907][var20][var19].method1622(new class227(var24));
				class29.method175(var20, var19);
			}
		} else if (class238.field4430 == 173) {
			int var25 = class230.field4312.method347();
			int var26 = class150.field2910 + (var25 & 0x7);
			int var27 = (var25 >> 4 & 0x7) + class121.field2213;
			int var28 = class230.field4312.method301();
			int var29 = class230.field4312.method347();
			int var30 = class230.field4312.method301();
			if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
				int var31 = var27 * 128 + 64;
				int var32 = var26 * 128 + 64;
				class18 var33 = new class18(var28, class149.field2907, var31, var32, class239.method1584(var31, var32, class149.field2907) - var29, var30, class117.field2113);
				class42.field714.method1622(new class242(var33));
			}
		} else if (class238.field4430 == 232) {
			int var34 = class230.field4312.method347();
			int var35 = (var34 & 0x7) + class150.field2910;
			int var36 = (var34 >> 4 & 0x7) + class121.field2213;
			int var37 = class230.field4312.method301();
			int var38 = class230.field4312.method301();
			int var39 = class230.field4312.method301();
			if (var36 >= 0 && var35 >= 0 && var36 < 104 && var35 < 104) {
				class248 var40 = class134.field2497[class149.field2907][var36][var35];
				if (var40 != null) {
					for (class227 var41 = (class227) var40.method1610(); var41 != null; var41 = (class227) var40.method1619()) {
						class111 var42 = var41.field4258;
						if ((var37 & 0x7FFF) == var42.field2030 && var42.field2029 == var38) {
							var42.field2029 = var39;
							break;
						}
					}
					class29.method175(var36, var35);
				}
			}
		} else if (class238.field4430 == 44) {
			int var43 = class230.field4312.method347();
			int var44 = var43 >> 2;
			int var45 = var43 & 0x3;
			int var46 = class98.field1792[var44];
			int var47 = class230.field4312.method302();
			int var48 = class230.field4312.method319();
			int var49 = class121.field2213 + (var48 >> 4 & 0x7);
			int var50 = class150.field2910 + (var48 & 0x7);
			if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
				class220.method1486(0, var50, var46, var45, -1, var44, class149.field2907, var49, var47);
			}
		} else if (class238.field4430 == 171) {
			int var51 = class230.field4312.method319();
			int var52 = var51 & 0x3;
			int var53 = var51 >> 2;
			int var54 = class98.field1792[var53];
			int var55 = class230.field4312.method343();
			if (var55 == 65535) {
				var55 = -1;
			}
			int var56 = class230.field4312.method352();
			int var57 = (var56 >> 4 & 0x7) + class121.field2213;
			int var58 = class150.field2910 + (var56 & 0x7);
			class113.method774(var53, var57, var54, var52, class149.field2907, var58, var55);
		} else {
			if (class238.field4430 == 61) {
				int var59 = class230.field4312.method301();
				int var60 = class230.field4312.method295();
				int var61 = var60 >> 2;
				int var62 = var60 & 0x3;
				int var63 = class98.field1792[var61];
				int var64 = class230.field4312.method301();
				byte var65 = class230.field4312.method303();
				byte var66 = class230.field4312.method335();
				byte var67 = class230.field4312.method324();
				byte var68 = class230.field4312.method335();
				int var69 = class230.field4312.method301();
				int var70 = class230.field4312.method347();
				int var71 = class150.field2910 + (var70 & 0x7);
				int var72 = (var70 >> 4 & 0x7) + class121.field2213;
				int var73 = class230.field4312.method349();
				class44 var74;
				if (class220.field4164 == var59) {
					var74 = class240.field4456;
				} else {
					var74 = field4491[var59];
				}
				if (var74 != null) {
					class148 var75 = class190.method1321(var64);
					int var76;
					int var77;
					if (var62 == 1 || var62 == 3) {
						var76 = var75.field2774;
						var77 = var75.field2794;
					} else {
						var77 = var75.field2774;
						var76 = var75.field2794;
					}
					int var78 = (var77 >> 1) + var72;
					int var79 = var72 + (var77 + 1 >> 1);
					int var80 = (var76 >> 1) + var71;
					int var81 = (var76 + 1 >> 1) + var71;
					int[][] var82 = class62.field1137[class149.field2907];
					int var83 = (var77 << 6) + (var72 << 7);
					int var84 = var82[var79][var81] + var82[var79][var80] + var82[var78][var80] + var82[var78][var81] >> 2;
					int var85 = (var76 << 6) + (var71 << 7);
					int[][] var86 = null;
					if (class149.field2907 < 3) {
						var86 = class62.field1137[class149.field2907 + 1];
					}
					class210 var87 = var75.method997(var61, var86, var82, var83, false, var85, var62, var84);
					if (var87 != null) {
						class220.method1486(var69 + 1, var71, var63, 0, var73 + 1, 0, class149.field2907, var72, -1);
						var74.field759 = var84;
						var74.field755 = class117.field2113 + var69;
						var74.field757 = var76 * 64 + var71 * 128;
						var74.field758 = (class30) var87.field3984;
						var74.field773 = var72 * 128 + var77 * 64;
						if (var66 > var67) {
							byte var88 = var66;
							var66 = var67;
							var67 = var88;
						}
						var74.field764 = var66 + var72;
						var74.field744 = var67 + var72;
						if (var65 < var68) {
							byte var89 = var68;
							var68 = var65;
							var65 = var89;
						}
						var74.field741 = var71 + var68;
						var74.field745 = var71 + var65;
						var74.field762 = class117.field2113 + var73;
					}
				}
			}
			if (class238.field4430 == 99) {
				int var90 = class230.field4312.method347();
				int var91 = (var90 & 0x7) + class150.field2910;
				int var92 = (var90 >> 4 & 0x7) + class121.field2213;
				int var93 = class230.field4312.method349();
				int var94 = class230.field4312.method302();
				if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104) {
					class111 var95 = new class111();
					var95.field2029 = var94;
					var95.field2030 = var93;
					if (class134.field2497[class149.field2907][var92][var91] == null) {
						class134.field2497[class149.field2907][var92][var91] = new class248();
					}
					class134.field2497[class149.field2907][var92][var91].method1622(new class227(var95));
					class29.method175(var92, var91);
				}
			} else if (class238.field4430 == 150) {
				int var96 = class230.field4312.method347();
				int var97 = class121.field2213 + (var96 >> 4 & 0x7);
				int var98 = (var96 & 0x7) + class150.field2910;
				int var99 = var97 + class230.field4312.method324();
				int var100 = class230.field4312.method324() + var98;
				int var101 = class230.field4312.method334();
				int var102 = class230.field4312.method301();
				int var103 = class230.field4312.method347() * 4;
				int var104 = class230.field4312.method347() * 4;
				int var105 = class230.field4312.method301();
				int var106 = class230.field4312.method301();
				int var107 = class230.field4312.method347();
				int var108 = class230.field4312.method347();
				if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && var102 != 65535) {
					int var109 = var97 * 128 + 64;
					int var110 = var100 * 128 + 64;
					int var111 = var99 * 128 + 64;
					int var112 = var98 * 128 + 64;
					class77 var113 = new class77(var102, class149.field2907, var109, var112, class239.method1584(var109, var112, class149.field2907) - var103, class117.field2113 + var105, var106 + class117.field2113, var107, var108, var101, var104);
					var113.method520(var111, var105 + class117.field2113, class239.method1584(var111, var110, class149.field2907) + -var104, var110);
					class167.field3220.method1622(new class20(var113));
				}
			} else if (class238.field4430 == 198) {
				int var114 = class230.field4312.method319();
				int var115 = class121.field2213 + (var114 >> 4 & 0x7);
				int var116 = (var114 & 0x7) + class150.field2910;
				int var117 = class230.field4312.method302();
				if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
					class248 var118 = class134.field2497[class149.field2907][var115][var116];
					if (var118 != null) {
						for (class227 var119 = (class227) var118.method1610(); var119 != null; var119 = (class227) var118.method1619()) {
							if ((var117 & 0x7FFF) == var119.field4258.field2030) {
								var119.method460();
								break;
							}
						}
						if (var118.method1610() == null) {
							class134.field2497[class149.field2907][var115][var116] = null;
						}
						class29.method175(var115, var116);
					}
				}
			} else if (class238.field4430 == 75) {
				int var120 = class230.field4312.method347();
				int var121 = var120 >> 2;
				int var122 = class98.field1792[var121];
				int var123 = var120 & 0x3;
				int var124 = class230.field4312.method295();
				int var125 = class150.field2910 + (var124 & 0x7);
				int var126 = class121.field2213 + (var124 >> 4 & 0x7);
				if (var126 >= 0 && var125 >= 0 && var126 < 104 && var125 < 104) {
					class220.method1486(0, var125, var122, var123, -1, var121, class149.field2907, var126, -1);
				}
			} else if (class238.field4430 == 52) {
				int var127 = class230.field4312.method347();
				int var128 = class150.field2910 + (var127 & 0x7);
				int var129 = class121.field2213 + (var127 >> 4 & 0x7);
				int var130 = class230.field4312.method301();
				int var131 = class230.field4312.method347();
				if (var130 == 65535) {
					var130 = -1;
				}
				int var132 = var131 & 0x7;
				int var133 = class230.field4312.method347();
				int var134 = var131 >> 4 & 0xF;
				if (var129 >= 0 && var128 >= 0 && var129 < 104 && var128 < 104) {
					int var135 = var134 + 1;
					if (class240.field4456.field4087[0] >= var129 - var135 && var129 + var135 >= class240.field4456.field4087[0] && var128 - var135 <= class240.field4456.field4141[0] && class240.field4456.field4141[0] <= var128 + var135 && class223.field4211 != 0 && var132 > 0 && class174.field3445 < 50 && var130 != -1) {
						class25.field397[class174.field3445] = var130;
						class110.field2016[class174.field3445] = var132;
						class8.field116[class174.field3445] = var133;
						class237.field4417[class174.field3445] = null;
						class145.field2726[class174.field3445] = (var129 << 16) + (var128 << 8) + var134;
						class174.field3445++;
					}
				}
			}
		}
	}

	@ObfuscatedName("we.a(Lu;I)V")
	public static void method1600(class218 arg0) {
		arg0.field4106 = arg0.field4105;
		if (arg0.field4135 == 0) {
			arg0.field4108 = 0;
			return;
		}
		if (arg0.field4077 != -1 && arg0.field4140 == 0) {
			class109 var1 = class15.method75(arg0.field4077);
			if (arg0.field4137 > 0 && var1.field1983 == 0) {
				arg0.field4108++;
				return;
			}
			if (arg0.field4137 <= 0 && var1.field1980 == 0) {
				arg0.field4108++;
				return;
			}
		}
		int var2 = arg0.field4136;
		int var3 = arg0.field4103 * 64 + arg0.field4087[arg0.field4135 - 1] * 128;
		int var4 = arg0.field4121;
		int var5 = arg0.field4141[arg0.field4135 - 1] * 128 + arg0.field4103 * 64;
		if (var3 - var2 > 256 || var3 - var2 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
			arg0.field4136 = var3;
			arg0.field4121 = var5;
			return;
		}
		if (var2 >= var3) {
			if (var3 >= var2) {
				if (var5 > var4) {
					arg0.field4119 = 1024;
				} else if (var5 < var4) {
					arg0.field4119 = 0;
				}
			} else if (var4 < var5) {
				arg0.field4119 = 768;
			} else if (var5 >= var4) {
				arg0.field4119 = 512;
			} else {
				arg0.field4119 = 256;
			}
		} else if (var4 < var5) {
			arg0.field4119 = 1280;
		} else if (var5 < var4) {
			arg0.field4119 = 1792;
		} else {
			arg0.field4119 = 1536;
		}
		int var6 = arg0.field4123;
		int var7 = arg0.field4119 - arg0.field4085 & 0x7FF;
		if (var7 > 1024) {
			var7 -= 2048;
		}
		if (var7 >= -256 && var7 <= 256) {
			var6 = arg0.field4092;
		} else if (var7 >= 256 && var7 < 768) {
			var6 = arg0.field4122;
		} else if (var7 >= -768 && var7 <= -256) {
			var6 = arg0.field4084;
		}
		if (var6 == -1) {
			var6 = arg0.field4092;
		}
		int var8 = 4;
		boolean var9 = true;
		arg0.field4106 = var6;
		if (arg0 instanceof class191) {
			var9 = ((class191) arg0).field3682.field2354;
		}
		if (var9) {
			if (arg0.field4119 != arg0.field4085 && arg0.field4114 == -1 && arg0.field4102 != 0) {
				var8 = 2;
			}
			if (arg0.field4135 > 2) {
				var8 = 6;
			}
			if (arg0.field4135 > 3) {
				var8 = 8;
			}
			if (arg0.field4108 > 0 && arg0.field4135 > 1) {
				var8 = 8;
				arg0.field4108--;
			}
		} else {
			if (arg0.field4135 > 1) {
				var8 = 6;
			}
			if (arg0.field4135 > 2) {
				var8 = 8;
			}
			if (arg0.field4108 > 0 && arg0.field4135 > 1) {
				var8 = 8;
				arg0.field4108--;
			}
		}
		if (arg0.field4074[arg0.field4135 - 1]) {
			var8 <<= 0x1;
		}
		if (var3 > var2) {
			arg0.field4136 += var8;
			if (arg0.field4136 > var3) {
				arg0.field4136 = var3;
			}
		} else if (var3 < var2) {
			arg0.field4136 -= var8;
			if (var3 > arg0.field4136) {
				arg0.field4136 = var3;
			}
		}
		if (var8 >= 8 && arg0.field4092 == arg0.field4106 && arg0.field4104 != -1) {
			arg0.field4106 = arg0.field4104;
		}
		if (var5 > var4) {
			arg0.field4121 += var8;
			if (var5 < arg0.field4121) {
				arg0.field4121 = var5;
			}
		} else if (var5 < var4) {
			arg0.field4121 -= var8;
			if (var5 > arg0.field4121) {
				arg0.field4121 = var5;
			}
		}
		if (var3 != arg0.field4136 || arg0.field4121 != var5) {
			return;
		}
		arg0.field4135--;
		if (arg0.field4137 > 0) {
			arg0.field4137--;
			return;
		}
	}

	@ObfuscatedName("we.a(I[B)V")
	public static void method1601(byte[] arg0) {
		class46 var1 = new class46(arg0);
		var1.field831 = arg0.length - 2;
		class172.field3345 = var1.method301();
		class67.field1218 = new int[class172.field3345];
		class116.field2104 = new byte[class172.field3345][];
		class135.field2510 = new int[class172.field3345];
		class247.field4528 = new int[class172.field3345];
		class102.field1851 = new int[class172.field3345];
		var1.field831 = arg0.length - class172.field3345 * 8 - 7;
		class15.field229 = var1.method301();
		class129.field2424 = var1.method301();
		int var2 = (var1.method347() & 0xFF) + 1;
		for (int var3 = 0; var3 < class172.field3345; var3++) {
			class247.field4528[var3] = var1.method301();
		}
		for (int var4 = 0; var4 < class172.field3345; var4++) {
			class135.field2510[var4] = var1.method301();
		}
		for (int var5 = 0; var5 < class172.field3345; var5++) {
			class102.field1851[var5] = var1.method301();
		}
		for (int var6 = 0; var6 < class172.field3345; var6++) {
			class67.field1218[var6] = var1.method301();
		}
		var1.field831 = arg0.length - class172.field3345 * 8 - (var2 + -1) * 3 - 7;
		class27.field456 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			class27.field456[var7] = var1.method304();
			if (class27.field456[var7] == 0) {
				class27.field456[var7] = 1;
			}
		}
		var1.field831 = 0;
		for (int var8 = 0; var8 < class172.field3345; var8++) {
			int var9 = class67.field1218[var8];
			int var10 = class102.field1851[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			class116.field2104[var8] = var12;
			int var13 = var1.method347();
			if (var13 == 0) {
				for (int var14 = 0; var14 < var11; var14++) {
					var12[var14] = var1.method324();
				}
			} else if (var13 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var9; var16++) {
						var12[var16 * var10 + var15] = var1.method324();
					}
				}
			}
		}
	}
}
