package deob;

import java.io.IOException;

@ObfuscatedName("vg")
public final class class236 extends class27 {

	@ObfuscatedName("vg.m")
	public static class75 field4397;

	@ObfuscatedName("vg.p")
	public static class144 field4400;

	@ObfuscatedName("vg.r")
	public static final class92 field4402 = new class92(64);

	@ObfuscatedName("vg.s")
	public static final class88 field4403 = class208.method1423(105, "Invalid username or password)3");

	@ObfuscatedName("vg.o")
	public static class88 field4399 = field4403;

	@ObfuscatedName("vg.t")
	public static final class88 field4404 = class208.method1423(105, " ");

	@ObfuscatedName("vg.n")
	public static class88 field4398 = field4404;

	@ObfuscatedName("vg.a(I)V")
	public static void method1564() {
		Object var0 = class33.field533;
		synchronized (class33.field533) {
			if (class225.field4231 != 0) {
				class225.field4231 = 1;
				try {
					class33.field533.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	@ObfuscatedName("vg.a(IIIIIB)V")
	public static void method1565(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 == arg0) {
			class230.method1532(arg3, arg0, arg2, arg1);
		} else if (arg3 - arg0 >= class67.field1207 && class12.field183 >= arg0 + arg3 && arg2 - arg4 >= class49.field919 && class18.field279 >= arg4 + arg2) {
			class134.method892(arg3, arg0, arg4, arg2, arg1);
		} else {
			class210.method1438(arg3, arg4, arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("vg.b(Z)Z")
	public static boolean method1566() throws IOException {
		if (class33.field556 == null) {
			return false;
		}
		int var0 = class33.field556.method909();
		if (var0 == 0) {
			return false;
		}
		if (class238.field4430 == -1) {
			var0--;
			class33.field556.method913(0, class230.field4312.field842, 1);
			class230.field4312.field831 = 0;
			class238.field4430 = class230.field4312.method33();
			class228.field4270 = class15.field224[class238.field4430];
		}
		if (class228.field4270 == -1) {
			if (var0 <= 0) {
				return false;
			}
			class33.field556.method913(0, class230.field4312.field842, 1);
			var0--;
			class228.field4270 = class230.field4312.field842[0] & 0xFF;
		}
		if (class228.field4270 == -2) {
			if (var0 <= 1) {
				return false;
			}
			var0 -= 2;
			class33.field556.method913(0, class230.field4312.field842, 2);
			class230.field4312.field831 = 0;
			class228.field4270 = class230.field4312.method301();
		}
		if (class228.field4270 > var0) {
			return false;
		}
		class230.field4312.field831 = 0;
		class33.field556.method913(0, class230.field4312.field842, class228.field4270);
		class192.field3700 = 0;
		class88.field1634 = class46.field821;
		class46.field821 = class101.field1841;
		class101.field1841 = class238.field4430;
		if (class238.field4430 == 239) {
			int var1 = class230.field4312.method323();
			int var2 = class230.field4312.method323();
			class168 var3 = (class168) class128.field2395.method1049((long) var1);
			class168 var4 = (class168) class128.field2395.method1049((long) var2);
			if (var4 != null) {
				class93.method672(var4, var3 == null || var3.field3229 != var4.field3229);
			}
			if (var3 != null) {
				var3.method460();
				class128.field2395.method1052((long) var2, var3);
			}
			class174 var5 = class239.method1579(var1);
			if (var5 != null) {
				class200.method1371(var5);
			}
			class174 var6 = class239.method1579(var2);
			if (var6 != null) {
				class200.method1371(var6);
				class110.method759(true, var6);
			}
			if (class43.field723 != -1) {
				class137.method912(class43.field723, 1);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 244) {
			int var7 = class230.field4312.method320();
			int var8 = class230.field4312.method339();
			int var9 = class230.field4312.method312();
			class174 var10 = class239.method1579(var7);
			var10.field3451 = 0;
			var10.field3441 = var10.field3514 = var9;
			var10.field3367 = 0;
			var10.field3366 = var10.field3391 = var8;
			class200.method1371(var10);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 79) {
			class43.method278(false);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 12) {
			int var11 = class228.field4270 + class230.field4312.field831;
			int var12 = class230.field4312.method301();
			int var13 = class230.field4312.method301();
			if (var12 != class43.field723) {
				class43.field723 = var12;
				class149.method1005(class43.field723);
				class192.method1334();
				class146.method972(class43.field723);
				for (int var14 = 0; var14 < 100; var14++) {
					class225.field4228[var14] = true;
				}
			}
			while (var13-- > 0) {
				int var15 = class230.field4312.method323();
				int var16 = class230.field4312.method301();
				int var17 = class230.field4312.method347();
				class168 var18 = (class168) class128.field2395.method1049((long) var15);
				if (var18 != null && var16 != var18.field3229) {
					class93.method672(var18, true);
					var18 = null;
				}
				if (var18 == null) {
					var18 = class104.method720(var17, var15, var16);
				}
				var18.field3235 = true;
			}
			for (class168 var19 = (class168) class128.field2395.method1047(); var19 != null; var19 = (class168) class128.field2395.method1048()) {
				if (var19.field3235) {
					var19.field3235 = false;
				} else {
					class93.method672(var19, true);
				}
			}
			class31.field495 = new class154(512);
			while (class230.field4312.field831 < var11) {
				int var20 = class230.field4312.method323();
				int var21 = class230.field4312.method301();
				int var22 = class230.field4312.method301();
				int var23 = class230.field4312.method323();
				for (int var24 = var21; var24 <= var22; var24++) {
					long var25 = ((long) var20 << 32) + (long) var24;
					class31.field495.method1052(var25, new class192(var23));
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 192) {
			class179.field3567 = true;
			class135.field2512 = class230.field4312.method347();
			class171.field3327 = class230.field4312.method347();
			class70.field1264 = class230.field4312.method301();
			class246.field4506 = class230.field4312.method347();
			class160.field3093 = class230.field4312.method347();
			if (class160.field3093 >= 100) {
				class184.field3608 = class171.field3327 * 128 + 64;
				class79.field1428 = class135.field2512 * 128 + 64;
				class108.field1954 = class239.method1584(class79.field1428, class184.field3608, class149.field2907) - class70.field1264;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 186) {
			int var27 = class230.field4312.method323();
			int var28 = class230.field4312.method301();
			class174 var29;
			if (var27 < 0) {
				var29 = null;
			} else {
				var29 = class239.method1579(var27);
			}
			if (var29 != null) {
				for (int var30 = 0; var30 < var29.field3388.length; var30++) {
					var29.field3388[var30] = 0;
					var29.field3474[var30] = 0;
				}
			}
			if (var27 < -70000) {
				var28 += 32768;
			}
			class4.method20(var28);
			int var31 = class230.field4312.method301();
			for (int var32 = 0; var32 < var31; var32++) {
				int var33 = class230.field4312.method349();
				int var34 = class230.field4312.method352();
				if (var34 == 255) {
					var34 = class230.field4312.method299();
				}
				if (var29 != null && var29.field3388.length > var32) {
					var29.field3388[var32] = var33;
					var29.field3474[var32] = var34;
				}
				class177.method1268(var28, var34, var32, var33 - 1);
			}
			if (var29 != null) {
				class200.method1371(var29);
			}
			class127.method867();
			class231.field4328[class223.field4198++ & 0x1F] = var28 & 0x7FFF;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 117) {
			class88 var35 = class230.field4312.method298();
			if (var35.method631(class156.field3009)) {
				boolean var36 = false;
				class88 var37 = var35.method623(0, var35.method617(class109.field1959));
				long var38 = var37.method630();
				for (int var40 = 0; var40 < class67.field1221; var40++) {
					if (class95.field1764[var40] == var38) {
						var36 = true;
						break;
					}
				}
				if (!var36 && client.field563 == 0) {
					class223.method1499(class54.field1007, 4, var37);
				}
			} else if (var35.method631(class207.field3927)) {
				class88 var64 = var35.method623(0, var35.method617(class109.field1959));
				boolean var65 = false;
				long var66 = var64.method630();
				for (int var68 = 0; var68 < class67.field1221; var68++) {
					if (var66 == class95.field1764[var68]) {
						var65 = true;
						break;
					}
				}
				if (!var65 && client.field563 == 0) {
					class88 var69 = var35.method623(var35.method617(class109.field1959) + 1, var35.method604() + -9);
					class223.method1499(var69, 8, var64);
				}
			} else if (var35.method631(class86.field1556)) {
				boolean var41 = false;
				class88 var42 = var35.method623(0, var35.method617(class109.field1959));
				long var43 = var42.method630();
				for (int var45 = 0; var45 < class67.field1221; var45++) {
					if (class95.field1764[var45] == var43) {
						var41 = true;
						break;
					}
				}
				if (!var41 && client.field563 == 0) {
					class223.method1499(class174.field3453, 10, var42);
				}
			} else if (var35.method631(class172.field3334)) {
				class88 var63 = var35.method623(0, var35.method617(class172.field3334));
				class223.method1499(var63, 11, class174.field3453);
			} else if (var35.method631(class43.field731)) {
				class88 var62 = var35.method623(0, var35.method617(class43.field731));
				if (client.field563 == 0) {
					class223.method1499(var62, 12, class174.field3453);
				}
			} else if (var35.method631(class128.field2400)) {
				class88 var46 = var35.method623(0, var35.method617(class128.field2400));
				if (client.field563 == 0) {
					class223.method1499(var46, 13, class174.field3453);
				}
			} else if (var35.method631(class157.field3025)) {
				class88 var47 = var35.method623(0, var35.method617(class109.field1959));
				long var48 = var47.method630();
				boolean var50 = false;
				for (int var51 = 0; var51 < class67.field1221; var51++) {
					if (var48 == class95.field1764[var51]) {
						var50 = true;
						break;
					}
				}
				if (!var50 && client.field563 == 0) {
					class223.method1499(class174.field3453, 14, var47);
				}
			} else if (var35.method631(class228.field4275)) {
				class88 var52 = var35.method623(0, var35.method617(class109.field1959));
				long var53 = var52.method630();
				boolean var55 = false;
				for (int var56 = 0; var56 < class67.field1221; var56++) {
					if (class95.field1764[var56] == var53) {
						var55 = true;
						break;
					}
				}
				if (!var55 && client.field563 == 0) {
					class223.method1499(class174.field3453, 15, var52);
				}
			} else if (var35.method631(class37.field665)) {
				class88 var57 = var35.method623(0, var35.method617(class109.field1959));
				long var58 = var57.method630();
				boolean var60 = false;
				for (int var61 = 0; var61 < class67.field1221; var61++) {
					if (class95.field1764[var61] == var58) {
						var60 = true;
						break;
					}
				}
				if (!var60 && client.field563 == 0) {
					class223.method1499(class174.field3453, 16, var57);
				}
			} else {
				class223.method1499(var35, 0, class174.field3453);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 108) {
			int var70 = class230.field4312.method347();
			if (class230.field4312.method347() == 0) {
				class9.field140[var70] = new class131();
			} else {
				class230.field4312.field831--;
				class9.field140[var70] = new class131(class230.field4312);
			}
			class238.field4430 = -1;
			class117.field2127 = class67.field1211;
			return true;
		} else if (class238.field4430 == 213) {
			int var71 = class230.field4312.method347();
			class118 var72 = new class118();
			int var73 = var71 >> 6;
			var72.field2139 = var71 & 0x3F;
			var72.field2137 = class230.field4312.method347();
			if (var72.field2137 >= 0 && var72.field2137 < class176.field3543.length) {
				if (var72.field2139 == 1 || var72.field2139 == 10) {
					var72.field2146 = class230.field4312.method301();
					class230.field4312.field831 += 3;
				} else if (var72.field2139 >= 2 && var72.field2139 <= 6) {
					if (var72.field2139 == 2) {
						var72.field2134 = 64;
						var72.field2150 = 64;
					}
					if (var72.field2139 == 3) {
						var72.field2134 = 0;
						var72.field2150 = 64;
					}
					if (var72.field2139 == 4) {
						var72.field2134 = 128;
						var72.field2150 = 64;
					}
					if (var72.field2139 == 5) {
						var72.field2134 = 64;
						var72.field2150 = 0;
					}
					if (var72.field2139 == 6) {
						var72.field2150 = 128;
						var72.field2134 = 64;
					}
					var72.field2139 = 2;
					var72.field2138 = class230.field4312.method301();
					var72.field2135 = class230.field4312.method301();
					var72.field2151 = class230.field4312.method347();
				}
				var72.field2136 = class230.field4312.method301();
				if (var72.field2136 == 65535) {
					var72.field2136 = -1;
				}
				class64.field1171[var73] = var72;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 146) {
			int var74 = class230.field4312.method299();
			int var75 = class230.field4312.method320();
			int var76 = class230.field4312.method301();
			if (var76 == 65535) {
				var76 = -1;
			}
			int var77 = class230.field4312.method302();
			if (var77 == 65535) {
				var77 = -1;
			}
			for (int var78 = var76; var78 <= var77; var78++) {
				long var79 = ((long) var75 << 32) + (long) var78;
				class67 var81 = class31.field495.method1049(var79);
				if (var81 != null) {
					var81.method460();
				}
				class31.field495.method1052(var79, new class192(var74));
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 253) {
			class179.field3567 = false;
			for (int var82 = 0; var82 < 5; var82++) {
				class233.field4368[var82] = false;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 214) {
			int var83 = class230.field4312.method313();
			class88 var84 = class230.field4312.method298();
			class174 var85 = class239.method1579(var83);
			if (!var84.method597(-113, var85.field3383)) {
				var85.field3383 = var84;
				class200.method1371(var85);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 19) {
			class60.method432();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 205) {
			long var86 = class230.field4312.method321();
			int var88 = class230.field4312.method301();
			boolean var89 = false;
			byte var90 = class230.field4312.method324();
			if ((Long.MIN_VALUE & var86) != 0L) {
				var89 = true;
			}
			if (var89) {
				if (class47.field885 == 0) {
					class238.field4430 = -1;
					return true;
				}
				long var91 = var86 & Long.MAX_VALUE;
				int var93;
				for (var93 = 0; class47.field885 > var93 && (var91 != class88.field1647[var93].field1219 || var88 != class88.field1647[var93].field1317); var93++) {
				}
				if (var93 < class47.field885) {
					while (var93 < class47.field885 - 1) {
						class88.field1647[var93] = class88.field1647[var93 + 1];
						var93++;
					}
					class47.field885--;
					class88.field1647[class47.field885] = null;
				}
			} else {
				class88 var94 = class230.field4312.method298();
				class71 var95 = new class71();
				var95.field1219 = var86;
				var95.field1323 = class200.method1375(var95.field1219);
				var95.field1321 = var94;
				var95.field1317 = var88;
				var95.field1315 = var90;
				int var96;
				for (var96 = class47.field885 - 1; var96 >= 0; var96--) {
					int var97 = class88.field1647[var96].field1323.method625(var95.field1323);
					if (var97 == 0) {
						class88.field1647[var96].field1317 = var88;
						class88.field1647[var96].field1315 = var90;
						class88.field1647[var96].field1321 = var94;
						if (class36.field631 == var86) {
							class143.field2631 = var90;
						}
						class238.field4430 = -1;
						class77.field1394 = class67.field1211;
						return true;
					}
					if (var97 < 0) {
						break;
					}
				}
				if (class88.field1647.length <= class47.field885) {
					class238.field4430 = -1;
					return true;
				}
				for (int var98 = class47.field885 - 1; var98 > var96; var98--) {
					class88.field1647[var98 + 1] = class88.field1647[var98];
				}
				if (class47.field885 == 0) {
					class88.field1647 = new class71[100];
				}
				class88.field1647[var96 + 1] = var95;
				class47.field885++;
				if (var86 == class36.field631) {
					class143.field2631 = var90;
				}
			}
			class238.field4430 = -1;
			class77.field1394 = class67.field1211;
			return true;
		} else if (class238.field4430 == 235) {
			class218.field4134 = class230.field4312.method298();
			class165.method1132(class218.field4134);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 26) {
			int var99 = class230.field4312.method320();
			int var100 = class230.field4312.method302();
			if (var100 == 65535) {
				var100 = -1;
			}
			class174 var101 = class239.method1579(var99);
			if (var101.field3430 != 2 || var101.field3409 != var100) {
				var101.field3409 = var100;
				var101.field3430 = 2;
				class200.method1371(var101);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 101) {
			if (class228.field4270 == 0) {
				class4.field54 = class93.field1741;
			} else {
				class4.field54 = class230.field4312.method298();
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 191) {
			boolean var102 = class230.field4312.method295() == 1;
			int var103 = class230.field4312.method313();
			class174 var104 = class239.method1579(var103);
			if (var102 != var104.field3378) {
				var104.field3378 = var102;
				class200.method1371(var104);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 200) {
			int var105 = class230.field4312.method313();
			class174 var106 = class239.method1579(var105);
			for (int var107 = 0; var107 < var106.field3388.length; var107++) {
				var106.field3388[var107] = -1;
				var106.field3388[var107] = 0;
			}
			class200.method1371(var106);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 139) {
			int var108 = class230.field4312.method313();
			int var109 = class230.field4312.method313();
			int var110 = class230.field4312.method349();
			if (var110 == 65535) {
				var110 = -1;
			}
			class174 var111 = class239.method1579(var108);
			if (var111.field3410) {
				var111.field3399 = var110;
				var111.field3482 = var109;
				class149 var112 = class71.method472(var110);
				var111.field3498 = var112.field2870;
				var111.field3485 = var112.field2889;
				var111.field3509 = var112.field2872;
				var111.field3455 = var112.field2873;
				var111.field3365 = var112.field2876;
				var111.field3517 = var112.field2847;
				if (var111.field3468 > 0) {
					var111.field3485 = var111.field3485 * 32 / var111.field3468;
				} else if (var111.field3501 > 0) {
					var111.field3485 = var111.field3485 * 32 / var111.field3501;
				}
				class200.method1371(var111);
			} else if (var110 == -1) {
				class238.field4430 = -1;
				var111.field3430 = 0;
				return true;
			} else {
				class149 var113 = class71.method472(var110);
				var111.field3485 = var113.field2889 * 100 / var109;
				var111.field3509 = var113.field2872;
				var111.field3430 = 4;
				var111.field3455 = var113.field2873;
				var111.field3409 = var110;
				class200.method1371(var111);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 230) {
			int var114 = class230.field4312.method295();
			int var115 = var114 >> 2;
			int var116 = var114 & 0x3;
			int var117 = class98.field1792[var115];
			int var118 = class230.field4312.method301();
			if (var118 == 65535) {
				var118 = -1;
			}
			int var119 = class230.field4312.method320();
			int var120 = var119 >> 28 & 0x3;
			int var121 = var119 & 0x3FFF;
			int var122 = var119 >> 14 & 0x3FFF;
			int var123 = var122 - class223.field4212;
			int var124 = var121 - class190.field3679;
			class113.method774(var115, var123, var117, var116, var120, var124, var118);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 77) {
			int var125 = class230.field4312.method313();
			int var126 = class230.field4312.method302();
			int var127 = class230.field4312.method301();
			int var128 = class230.field4312.method301();
			if (var125 >> 30 != 0) {
				int var133 = var125 >> 28 & 0x3;
				int var134 = (var125 >> 14 & 0x3FFF) - class223.field4212;
				int var135 = (var125 & 0x3FFF) - class190.field3679;
				if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
					int var136 = var135 * 128 + 64;
					int var137 = var134 * 128 + 64;
					class18 var138 = new class18(var126, var133, var137, var136, class239.method1584(var137, var136, var133) - var128, var127, class117.field2113);
					class42.field714.method1622(new class242(var138));
				}
			} else if (var125 >> 29 != 0) {
				int var129 = var125 & 0xFFFF;
				class191 var130 = class225.field4223[var129];
				if (var130 != null) {
					var130.field4080 = var126;
					if (var130.field4080 == 65535) {
						var130.field4080 = -1;
					}
					var130.field4075 = 0;
					var130.field4082 = class117.field2113 + var127;
					var130.field4125 = var128;
					if (class117.field2113 < var130.field4082) {
						var130.field4075 = -1;
					}
					var130.field4120 = 0;
				}
			} else if (var125 >> 28 != 0) {
				int var131 = var125 & 0xFFFF;
				class44 var132;
				if (class220.field4164 == var131) {
					var132 = class240.field4456;
				} else {
					var132 = class244.field4491[var131];
				}
				if (var132 != null) {
					var132.field4120 = 0;
					var132.field4125 = var128;
					var132.field4075 = 0;
					var132.field4080 = var126;
					if (var132.field4080 == 65535) {
						var132.field4080 = -1;
					}
					var132.field4082 = class117.field2113 + var127;
					if (class117.field2113 < var132.field4082) {
						var132.field4075 = -1;
					}
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 188) {
			class67.field1221 = class228.field4270 / 8;
			for (int var139 = 0; var139 < class67.field1221; var139++) {
				class95.field1764[var139] = class230.field4312.method321();
				class146.field2741[var139] = class200.method1375(class95.field1764[var139]);
			}
			class20.field313 = class67.field1211;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 22) {
			class105.method725(class230.field4312);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 221) {
			int var140 = class230.field4312.method347();
			int var141 = class230.field4312.method347();
			int var142 = class230.field4312.method347();
			int var143 = class230.field4312.method347();
			int var144 = class230.field4312.method301();
			class233.field4368[var140] = true;
			class201.field3834[var140] = var141;
			class66.field1194[var140] = var142;
			class194.field3714[var140] = var143;
			class190.field3674[var140] = var144;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 86) {
			int var145 = class230.field4312.method347();
			int var146 = class230.field4312.method302();
			if (var145 == 1) {
				class85.method579();
				for (int var147 = 0; var147 < 4; var147++) {
					class166.field3200[var147].method643();
				}
				System.gc();
			} else if (var145 == 2) {
				class201.method1378();
				System.gc();
				class131.method881(25);
			}
			class43.field723 = var146;
			class149.method1005(var146);
			class192.method1334();
			class146.method972(class43.field723);
			for (int var148 = 0; var148 < 100; var148++) {
				class225.field4228[var148] = true;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 16) {
			long var149 = class230.field4312.method321();
			boolean var151 = true;
			int var152 = class230.field4312.method301();
			int var153 = class230.field4312.method347();
			if (var149 < 0L) {
				var151 = false;
				var149 &= Long.MAX_VALUE;
			}
			class88 var154 = class174.field3453;
			if (var152 > 0) {
				var154 = class230.field4312.method298();
			}
			class88 var155 = class200.method1375(var149).method614();
			for (int var156 = 0; var156 < class146.field2729; var156++) {
				if (class115.field2086[var156] == var149) {
					if (var152 != class160.field3092[var156]) {
						class160.field3092[var156] = var152;
						if (var152 > 0) {
							class223.method1499(class166.method1140(new class88[] { var155, class171.field3321 }), 5, class174.field3453);
						}
						if (var152 == 0) {
							class223.method1499(class166.method1140(new class88[] { var155, class117.field2123 }), 5, class174.field3453);
						}
					}
					var155 = null;
					class168.field3238[var156] = var154;
					class46.field845[var156] = var153;
					class59.field1120[var156] = var151;
					break;
				}
			}
			if (var155 != null && class146.field2729 < 200) {
				class115.field2086[class146.field2729] = var149;
				class23.field370[class146.field2729] = var155;
				class160.field3092[class146.field2729] = var152;
				class168.field3238[class146.field2729] = var154;
				class46.field845[class146.field2729] = var153;
				class59.field1120[class146.field2729] = var151;
				class146.field2729++;
			}
			class20.field313 = class67.field1211;
			int var157 = class146.field2729;
			while (var157 > 0) {
				boolean var158 = true;
				var157--;
				for (int var159 = 0; var159 < var157; var159++) {
					if (class28.field470 != class160.field3092[var159] && class28.field470 == class160.field3092[var159 + 1] || class160.field3092[var159] == 0 && class160.field3092[var159 + 1] != 0) {
						var158 = false;
						int var160 = class160.field3092[var159];
						class160.field3092[var159] = class160.field3092[var159 + 1];
						class160.field3092[var159 + 1] = var160;
						class88 var161 = class168.field3238[var159];
						class168.field3238[var159] = class168.field3238[var159 + 1];
						class168.field3238[var159 + 1] = var161;
						class88 var162 = class23.field370[var159];
						class23.field370[var159] = class23.field370[var159 + 1];
						class23.field370[var159 + 1] = var162;
						long var163 = class115.field2086[var159];
						class115.field2086[var159] = class115.field2086[var159 + 1];
						class115.field2086[var159 + 1] = var163;
						int var165 = class46.field845[var159];
						class46.field845[var159] = class46.field845[var159 + 1];
						class46.field845[var159 + 1] = var165;
						boolean var166 = class59.field1120[var159];
						class59.field1120[var159] = class59.field1120[var159 + 1];
						class59.field1120[var159 + 1] = var166;
					}
				}
				if (var158) {
					break;
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 249) {
			int var167 = class230.field4312.method302();
			int var168 = class230.field4312.method323();
			int var169 = var167 >> 10 & 0x1F;
			int var170 = var167 >> 5 & 0x1F;
			int var171 = var167 & 0x1F;
			int var172 = (var171 << 3) + (var169 << 19) + (var170 << 11);
			class174 var173 = class239.method1579(var168);
			if (var172 != var173.field3414) {
				var173.field3414 = var172;
				class200.method1371(var173);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 68) {
			class127.method867();
			class240.field4458 = class230.field4312.method347();
			class238.field4430 = -1;
			class208.field3952 = class67.field1211;
			return true;
		} else if (class238.field4430 == 24) {
			for (int var174 = 0; var174 < class113.field2050.length; var174++) {
				if (class113.field2050[var174] != class168.field3245[var174]) {
					class113.field2050[var174] = class168.field3245[var174];
					class158.method1068(var174);
					class244.field4495[class226.field4244++ & 0x1F] = var174;
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 74) {
			long var175 = class230.field4312.method321();
			class230.field4312.method324();
			long var177 = class230.field4312.method321();
			long var179 = (long) class230.field4312.method301();
			long var181 = (long) class230.field4312.method304();
			int var183 = class230.field4312.method347();
			long var184 = (var179 << 32) + var181;
			boolean var186 = false;
			int var187 = 0;
			label1332: while (true) {
				if (var187 >= 100) {
					if (var183 <= 1) {
						if (class238.field4428 == 1 || class176.field3535 == 1) {
							var186 = true;
						} else {
							for (int var188 = 0; var188 < class67.field1221; var188++) {
								if (class95.field1764[var188] == var175) {
									var186 = true;
									break label1332;
								}
							}
						}
					}
					break;
				}
				if (class167.field3203[var187] == var184) {
					var186 = true;
					break;
				}
				var187++;
			}
			if (!var186 && client.field563 == 0) {
				class167.field3203[class62.field1150] = var184;
				class62.field1150 = (class62.field1150 + 1) % 100;
				class88 var189 = class26.method162(class21.method103(class230.field4312).method622());
				if (var183 == 2 || var183 == 3) {
					class60.method428(class166.method1140(new class88[] { class28.field472, class200.method1375(var175).method614() }), var189, class200.method1375(var177).method614());
				} else if (var183 == 1) {
					class60.method428(class166.method1140(new class88[] { class166.field3201, class200.method1375(var175).method614() }), var189, class200.method1375(var177).method614());
				} else {
					class60.method428(class200.method1375(var175).method614(), var189, class200.method1375(var177).method614());
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 134) {
			class150.field2910 = class230.field4312.method319();
			class121.field2213 = class230.field4312.method347();
			while (class228.field4270 > class230.field4312.field831) {
				class238.field4430 = class230.field4312.method347();
				class244.method1598();
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 84) {
			class115.field2078 = class230.field4312.method347();
			class238.field4430 = -1;
			class20.field313 = class67.field1211;
			return true;
		} else if (class238.field4430 == 6) {
			long var190 = class230.field4312.method321();
			long var192 = (long) class230.field4312.method301();
			long var194 = (long) class230.field4312.method304();
			int var196 = class230.field4312.method347();
			long var197 = (var192 << 32) + var194;
			boolean var199 = false;
			int var200 = 0;
			label1367: while (true) {
				if (var200 >= 100) {
					if (var196 <= 1) {
						if (class238.field4428 == 1 || class176.field3535 == 1) {
							var199 = true;
						} else {
							for (int var201 = 0; var201 < class67.field1221; var201++) {
								if (var190 == class95.field1764[var201]) {
									var199 = true;
									break label1367;
								}
							}
						}
					}
					break;
				}
				if (class167.field3203[var200] == var197) {
					var199 = true;
					break;
				}
				var200++;
			}
			if (!var199 && client.field563 == 0) {
				class167.field3203[class62.field1150] = var197;
				class62.field1150 = (class62.field1150 + 1) % 100;
				class88 var202 = class26.method162(class21.method103(class230.field4312).method622());
				if (var196 == 2 || var196 == 3) {
					class223.method1499(var202, 7, class166.method1140(new class88[] { class28.field472, class200.method1375(var190).method614() }));
				} else if (var196 == 1) {
					class223.method1499(var202, 7, class166.method1140(new class88[] { class166.field3201, class200.method1375(var190).method614() }));
				} else {
					class223.method1499(var202, 3, class200.method1375(var190).method614());
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 237) {
			class67.field1206 = class230.field4312.method347();
			class10.field142 = class230.field4312.method347();
			class128.field2408 = class230.field4312.method347();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 96) {
			int var203 = class230.field4312.method343();
			if (var203 == 65535) {
				var203 = -1;
			}
			int var204 = class230.field4312.method299();
			class174 var205 = class239.method1579(var204);
			if (var205.field3430 != 1 || var203 != var205.field3409) {
				var205.field3430 = 1;
				var205.field3409 = var203;
				class200.method1371(var205);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 149) {
			int var206 = class230.field4312.method302();
			int var207 = class230.field4312.method319();
			int var208 = class230.field4312.method301();
			class191 var209 = class225.field4223[var208];
			if (var209 != null) {
				class141.method925(var206, var207, var209);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 248) {
			for (int var210 = 0; var210 < class244.field4491.length; var210++) {
				if (class244.field4491[var210] != null) {
					class244.field4491[var210].field4077 = -1;
				}
			}
			for (int var211 = 0; var211 < class225.field4223.length; var211++) {
				if (class225.field4223[var211] != null) {
					class225.field4223[var211].field4077 = -1;
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 187) {
			long var212 = class230.field4312.method321();
			int var214 = class230.field4312.method301();
			class88 var215 = class168.method1150(var214).method1409(class230.field4312);
			class118.method801(var215, var214, class200.method1375(var212).method614(), 19, null);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 177) {
			int var216 = class230.field4312.method320();
			class49.field912 = class126.field2324.method1292(var216);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 88) {
			class121.field2213 = class230.field4312.method319();
			class150.field2910 = class230.field4312.method295();
			for (int var217 = class121.field2213; var217 < class121.field2213 + 8; var217++) {
				for (int var218 = class150.field2910; var218 < class150.field2910 + 8; var218++) {
					if (class134.field2497[class149.field2907][var217][var218] != null) {
						class134.field2497[class149.field2907][var217][var218] = null;
						class29.method175(var217, var218);
					}
				}
			}
			for (class159 var219 = (class159) class62.field1140.method1610(); var219 != null; var219 = (class159) class62.field1140.method1619()) {
				if (class121.field2213 <= var219.field3059 && var219.field3059 < class121.field2213 + 8 && class150.field2910 <= var219.field3052 && var219.field3052 < class150.field2910 + 8 && var219.field3055 == class149.field2907) {
					var219.field3061 = 0;
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 203) {
			long var220 = class230.field4312.method321();
			long var222 = (long) class230.field4312.method301();
			long var224 = (long) class230.field4312.method304();
			int var226 = class230.field4312.method347();
			int var227 = class230.field4312.method301();
			long var228 = var224 + (var222 << 32);
			boolean var230 = false;
			int var231 = 0;
			label1401: while (true) {
				if (var231 >= 100) {
					if (var226 <= 1) {
						for (int var232 = 0; var232 < class67.field1221; var232++) {
							if (var220 == class95.field1764[var232]) {
								var230 = true;
								break label1401;
							}
						}
					}
					break;
				}
				if (var228 == class167.field3203[var231]) {
					var230 = true;
					break;
				}
				var231++;
			}
			if (!var230 && client.field563 == 0) {
				class167.field3203[class62.field1150] = var228;
				class62.field1150 = (class62.field1150 + 1) % 100;
				class88 var233 = class168.method1150(var227).method1409(class230.field4312);
				if (var226 == 2) {
					class118.method801(var233, var227, class166.method1140(new class88[] { class28.field472, class200.method1375(var220).method614() }), 18, null);
				} else if (var226 == 1) {
					class118.method801(var233, var227, class166.method1140(new class88[] { class166.field3201, class200.method1375(var220).method614() }), 18, null);
				} else {
					class118.method801(var233, var227, class200.method1375(var220).method614(), 18, null);
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 17) {
			int var234 = class230.field4312.method323();
			int var235 = class230.field4312.method301();
			if (var234 < -70000) {
				var235 += 32768;
			}
			class174 var236;
			if (var234 < 0) {
				var236 = null;
			} else {
				var236 = class239.method1579(var234);
			}
			while (class230.field4312.field831 < class228.field4270) {
				int var237 = class230.field4312.method350();
				int var238 = class230.field4312.method301();
				int var239 = 0;
				if (var238 != 0) {
					var239 = class230.field4312.method347();
					if (var239 == 255) {
						var239 = class230.field4312.method323();
					}
				}
				if (var236 != null && var237 >= 0 && var237 < var236.field3388.length) {
					var236.field3388[var237] = var238;
					var236.field3474[var237] = var239;
				}
				class177.method1268(var235, var239, var237, var238 - 1);
			}
			if (var236 != null) {
				class200.method1371(var236);
			}
			class127.method867();
			class231.field4328[class223.field4198++ & 0x1F] = var235 & 0x7FFF;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 11) {
			byte var240 = class230.field4312.method335();
			int var241 = class230.field4312.method302();
			class168.field3245[var241] = var240;
			if (var240 != class113.field2050[var241]) {
				class113.field2050[var241] = var240;
				class158.method1068(var241);
			}
			class244.field4495[class226.field4244++ & 0x1F] = var241;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 100) {
			int var242 = class230.field4312.method323();
			class174 var243 = class239.method1579(var242);
			var243.field3430 = 3;
			var243.field3409 = class240.field4456.field768.method1427();
			class200.method1371(var243);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 25) {
			int var244 = class230.field4312.method323();
			int var245 = class230.field4312.method301();
			int var246 = class230.field4312.method347();
			class168 var247 = (class168) class128.field2395.method1049((long) var244);
			if (var247 != null) {
				class93.method672(var247, var247.field3229 != var245);
			}
			class104.method720(var246, var244, var245);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 10) {
			int var248 = class230.field4312.method343();
			if (var248 == 65535) {
				var248 = -1;
			}
			class116.method788(var248);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 89) {
			int var249 = class230.field4312.method302();
			if (var249 == 65535) {
				var249 = -1;
			}
			int var250 = class230.field4312.method340();
			class4.method23(var249, var250);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 66) {
			byte[] var251 = new byte[class228.field4270];
			class230.field4312.method29(class228.field4270, var251);
			class165.method1138(class54.method395(0, var251, class228.field4270));
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 53) {
			class88 var252 = class230.field4312.method298();
			Object[] var253 = new Object[var252.method604() + 1];
			for (int var254 = var252.method604() - 1; var254 >= 0; var254--) {
				if (var252.method599(var254) == 115) {
					var253[var254 + 1] = class230.field4312.method298();
				} else {
					var253[var254 + 1] = Integer.valueOf(class230.field4312.method323());
				}
			}
			var253[0] = Integer.valueOf(class230.field4312.method323());
			class39 var255 = new class39();
			var255.field681 = var253;
			class200.method1373(var255);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 229) {
			class77.field1394 = class67.field1211;
			long var256 = class230.field4312.method321();
			if (var256 == 0L) {
				class47.field885 = 0;
				class222.field4182 = null;
				class225.field4219 = null;
				class238.field4430 = -1;
				class88.field1647 = null;
				return true;
			}
			long var258 = class230.field4312.method321();
			class222.field4182 = class200.method1375(var258);
			class225.field4219 = class200.method1375(var256);
			class170.field3301 = class230.field4312.method324();
			int var260 = class230.field4312.method347();
			if (var260 == 255) {
				class238.field4430 = -1;
				return true;
			}
			class47.field885 = var260;
			class71[] var261 = new class71[100];
			for (int var262 = 0; var262 < class47.field885; var262++) {
				var261[var262] = new class71();
				var261[var262].field1219 = class230.field4312.method321();
				var261[var262].field1323 = class200.method1375(var261[var262].field1219);
				var261[var262].field1317 = class230.field4312.method301();
				var261[var262].field1315 = class230.field4312.method324();
				var261[var262].field1321 = class230.field4312.method298();
				if (class36.field631 == var261[var262].field1219) {
					class143.field2631 = var261[var262].field1315;
				}
			}
			int var263 = class47.field885;
			while (var263 > 0) {
				var263--;
				boolean var264 = true;
				for (int var265 = 0; var265 < var263; var265++) {
					if (var261[var265].field1323.method625(var261[var265 + 1].field1323) > 0) {
						class71 var266 = var261[var265];
						var264 = false;
						var261[var265] = var261[var265 + 1];
						var261[var265 + 1] = var266;
					}
				}
				if (var264) {
					break;
				}
			}
			class88.field1647 = var261;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 129) {
			long var267 = class230.field4312.method321();
			class230.field4312.method324();
			long var269 = class230.field4312.method321();
			long var271 = (long) class230.field4312.method301();
			long var273 = (long) class230.field4312.method304();
			long var275 = var273 + (var271 << 32);
			int var277 = class230.field4312.method347();
			int var278 = class230.field4312.method301();
			boolean var279 = false;
			int var280 = 0;
			label1447: while (true) {
				if (var280 >= 100) {
					if (var277 <= 1) {
						for (int var281 = 0; var281 < class67.field1221; var281++) {
							if (var267 == class95.field1764[var281]) {
								var279 = true;
								break label1447;
							}
						}
					}
					break;
				}
				if (var275 == class167.field3203[var280]) {
					var279 = true;
					break;
				}
				var280++;
			}
			if (!var279 && client.field563 == 0) {
				class167.field3203[class62.field1150] = var275;
				class62.field1150 = (class62.field1150 + 1) % 100;
				class88 var282 = class168.method1150(var278).method1409(class230.field4312);
				if (var277 == 2 || var277 == 3) {
					class118.method801(var282, var278, class166.method1140(new class88[] { class28.field472, class200.method1375(var267).method614() }), 20, class200.method1375(var269).method614());
				} else if (var277 == 1) {
					class118.method801(var282, var278, class166.method1140(new class88[] { class166.field3201, class200.method1375(var267).method614() }), 20, class200.method1375(var269).method614());
				} else {
					class118.method801(var282, var278, class200.method1375(var267).method614(), 20, class200.method1375(var269).method614());
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 166) {
			if (class43.field723 != -1) {
				class137.method912(class43.field723, 0);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 21) {
			class43.method278(true);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 233) {
			class88 var283 = class230.field4312.method298();
			int var284 = class230.field4312.method347();
			int var285 = class230.field4312.method347();
			if (var284 >= 1 && var284 <= 8) {
				if (var283.method624(class180.field3572)) {
					var283 = null;
				}
				class130.field2436[var284 - 1] = var283;
				class203.field3875[var284 - 1] = var285 == 0;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 70) {
			for (int var286 = 0; var286 < class28.field465; var286++) {
				class229 var287 = class106.method732(var286);
				if (var287 != null && var287.field4288 == 0) {
					class168.field3245[var286] = 0;
					class113.field2050[var286] = 0;
				}
			}
			class127.method867();
			class226.field4244 += 32;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 123 || class238.field4430 == 52 || class238.field4430 == 232 || class238.field4430 == 61 || class238.field4430 == 135 || class238.field4430 == 173 || class238.field4430 == 150 || class238.field4430 == 198 || class238.field4430 == 99 || class238.field4430 == 171 || class238.field4430 == 75 || class238.field4430 == 44) {
			class244.method1598();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 120) {
			int var288 = class230.field4312.method349();
			int var289 = class230.field4312.method349();
			int var290 = class230.field4312.method313();
			int var291 = class230.field4312.method343();
			class174 var292 = class239.method1579(var290);
			if (var291 != var292.field3455 || var292.field3509 != var289 || var288 != var292.field3485) {
				var292.field3509 = var289;
				var292.field3485 = var288;
				var292.field3455 = var291;
				class200.method1371(var292);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 54) {
			class127.method867();
			class199.field3788 = class230.field4312.method334();
			class208.field3952 = class67.field1211;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 114) {
			int var293 = class230.field4312.method347();
			int var294 = class230.field4312.method352();
			int var295 = class230.field4312.method295();
			class149.field2907 = var293 >> 1;
			class240.field4456.method1474((var293 & 0x1) == 1, var295, var294);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 162) {
			int var296 = class230.field4312.method299();
			int var297 = class230.field4312.method339();
			class174 var298 = class239.method1579(var296);
			if (var297 != var298.field3404 || var297 == -1) {
				var298.field3404 = var297;
				var298.field3487 = 0;
				var298.field3379 = 0;
				class200.method1371(var298);
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 163) {
			class121.field2213 = class230.field4312.method347();
			class150.field2910 = class230.field4312.method319();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 116) {
			class33.method210();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 223) {
			class179.field3567 = true;
			class46.field848 = class230.field4312.method347();
			class23.field368 = class230.field4312.method347();
			class66.field1200 = class230.field4312.method301();
			class9.field130 = class230.field4312.method347();
			class146.field2742 = class230.field4312.method347();
			if (class146.field2742 >= 100) {
				int var299 = class46.field848 * 128 + 64;
				int var300 = class23.field368 * 128 + 64;
				int var301 = class239.method1584(var299, var300, class149.field2907) - class66.field1200;
				int var302 = var299 - class79.field1428;
				int var303 = var300 - class184.field3608;
				int var304 = var301 - class108.field1954;
				int var305 = (int) Math.sqrt((double) (var302 * var302 + var303 * var303));
				class207.field3934 = (int) (Math.atan2((double) var304, (double) var305) * 325.949D) & 0x7FF;
				class170.field3257 = (int) (-325.949D * Math.atan2((double) var302, (double) var303)) & 0x7FF;
				if (class207.field3934 < 128) {
					class207.field3934 = 128;
				}
				if (class207.field3934 > 383) {
					class207.field3934 = 383;
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 241) {
			int var306 = class230.field4312.method301();
			class148.method996(var306);
			class231.field4328[class223.field4198++ & 0x1F] = var306 & 0x7FFF;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 147) {
			class247.field4512 = class230.field4312.method347();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 243) {
			int var307 = class230.field4312.method343();
			int var308 = class230.field4312.method349();
			class64.field1173 = var307;
			class207.field3930 = var308;
			class136.method905();
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 189) {
			class34.field580 = (short) class230.field4312.method301();
			if (class34.field580 <= 0) {
				class34.field580 = 256;
			}
			class49.field921 = (short) class230.field4312.method349();
			class238.field4430 = -1;
			if (class49.field921 <= 0) {
				class49.field921 = 205;
			}
			return true;
		} else if (class238.field4430 == 220) {
			int var309 = class230.field4312.method313();
			int var310 = class230.field4312.method349();
			class174 var311 = class239.method1579(var309);
			if (var311 != null && var311.field3390 == 0) {
				if (var311.field3375 - var311.field3422 < var310) {
					var310 = var311.field3375 - var311.field3422;
				}
				if (var310 < 0) {
					var310 = 0;
				}
				if (var311.field3415 != var310) {
					var311.field3415 = var310;
					class200.method1371(var311);
				}
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 4) {
			int var312 = class230.field4312.method302();
			int var313 = class230.field4312.method301();
			int var314 = class230.field4312.method320();
			class174 var315 = class239.method1579(var314);
			class238.field4430 = -1;
			var315.field3385 = (var313 << 16) + var312;
			return true;
		} else if (class238.field4430 == 197) {
			class160.field3083 = (short) class230.field4312.method302();
			if (class160.field3083 <= 0) {
				class160.field3083 = 320;
			}
			class221.field4175 = (short) class230.field4312.method349();
			class238.field4430 = -1;
			if (class221.field4175 <= 0) {
				class221.field4175 = 256;
			}
			return true;
		} else if (class238.field4430 == 113) {
			int var316 = class230.field4312.method301();
			int var317 = class230.field4312.method347();
			int var318 = class230.field4312.method301();
			if (var316 == 65535) {
				var316 = -1;
			}
			class92.method668(var317, var318, var316);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 242) {
			int var319 = class230.field4312.method323();
			class168 var320 = (class168) class128.field2395.method1049((long) var319);
			if (var320 != null) {
				class93.method672(var320, true);
			}
			if (class53.field967 != null) {
				class200.method1371(class53.field967);
				class53.field967 = null;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 72) {
			int var321 = class230.field4312.method349();
			int var322 = class230.field4312.method299();
			class168.field3245[var321] = var322;
			if (class113.field2050[var321] != var322) {
				class113.field2050[var321] = var322;
				class158.method1068(var321);
			}
			class244.field4495[class226.field4244++ & 0x1F] = var321;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 65) {
			class50.field926 = (short) class230.field4312.method301();
			if (class50.field926 <= 0) {
				class50.field926 = 32767;
			} else if (class50.field926 < class136.field2527) {
				class50.field926 = class136.field2527;
			}
			class87.field1578 = (short) class230.field4312.method343();
			if (class87.field1578 <= 0) {
				class87.field1578 = 1;
			}
			class222.field4179 = (short) class230.field4312.method343();
			if (class222.field4179 <= 0) {
				class222.field4179 = 32767;
			} else if (class222.field4179 < class87.field1578) {
				class222.field4179 = class87.field1578;
			}
			class136.field2527 = (short) class230.field4312.method302();
			if (class136.field2527 <= 0) {
				class136.field2527 = 1;
			}
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 240) {
			class115.method785();
			class238.field4430 = -1;
			return false;
		} else if (class238.field4430 == 204) {
			class127.method867();
			int var323 = class230.field4312.method295();
			int var324 = class230.field4312.method319();
			int var325 = class230.field4312.method313();
			class179.field3562[var323] = var325;
			class105.field1907[var323] = var324;
			class217.field4066[var323] = 1;
			for (int var326 = 0; var326 < 98; var326++) {
				if (var325 >= class90.field1710[var326]) {
					class217.field4066[var323] = var326 + 2;
				}
			}
			class143.field2642[class118.field2131++ & 0x1F] = var323;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 255) {
			class116.field2102 = 0;
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 172) {
			long var327 = class230.field4312.method321();
			class88 var329 = class26.method162(class21.method103(class230.field4312).method622());
			class223.method1499(var329, 6, class200.method1375(var327).method614());
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 110) {
			class230.method1535(class126.field2324, class228.field4270, class230.field4312);
			class238.field4430 = -1;
			return true;
		} else if (class238.field4430 == 184) {
			class114.field2061 = class230.field4312.method343() * 30;
			class238.field4430 = -1;
			class208.field3952 = class67.field1211;
			return true;
		} else {
			class221.method1488("T1 - " + class238.field4430 + "," + class46.field821 + "," + class88.field1634 + " - " + class228.field4270, null);
			class115.method785();
			return true;
		}
	}
}
