package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ld")
public final class class80 implements KeyListener, FocusListener {

	@ObfuscatedName("ld.a")
	public static int field1836;

	@ObfuscatedName("ld.b")
	public static class32 field1837 = class73.method593("Fallen lassen", true);

	@ObfuscatedName("ld.c")
	public static class157 field1838 = new class157();

	@ObfuscatedName("ld.e")
	public static class8 field1840;

	@ObfuscatedName("ld.n")
	public static class32 field1849 = class73.method593("wishes to trade with you)3", true);

	@ObfuscatedName("ld.p")
	public static class51 field1851;

	@ObfuscatedName("ld.r")
	public static class32 field1853 = field1849;

	@ObfuscatedName("ld.s")
	public static int field1854 = 0;

	@ObfuscatedName("ld.t")
	public static class32 field1855 = class73.method593("zur-Uck auf die RuneScape)2Webseite gehen", true);

	@ObfuscatedName("ld.a(I)V")
	public static void method630() {
		class9.field164.method490();
		class143.field3269.method490();
	}

	@ObfuscatedName("ld.b(I)V")
	public static void method631() {
		if (class86.field2004 == 164) {
			int var0 = class158.field3612.method524();
			byte var1 = class158.field3612.method534();
			int var2 = class158.field3612.method524();
			int var3 = class158.field3612.method535();
			int var4 = var3 >> 2;
			int var5 = class135.field3131[var4];
			int var6 = var3 & 0x3;
			byte var7 = class158.field3612.method536();
			int var8 = class158.field3612.method518();
			byte var9 = class158.field3612.method511();
			int var10 = class158.field3612.method531();
			byte var11 = class158.field3612.method536();
			int var12 = class158.field3612.method535();
			int var13 = (var12 >> 4 & 0x7) + class43.field997;
			int var14 = class20.field368 + (var12 & 0x7);
			class70 var15;
			if (var8 == class37.field891) {
				var15 = class20.field373;
			} else {
				var15 = class52.field1175[var8];
			}
			if (var15 != null) {
				class53 var16 = class5.method22(var10);
				int var17;
				int var18;
				if (var6 == 1 || var6 == 3) {
					var17 = var16.field1222;
					var18 = var16.field1233;
				} else {
					var17 = var16.field1233;
					var18 = var16.field1222;
				}
				int var19 = var13 + (var18 >> 1);
				int var20 = var13 + (var18 + 1 >> 1);
				int var21 = (var17 >> 1) + var14;
				int var22 = (var17 + 1 >> 1) + var14;
				int[][] var23 = class70.field1630[class43.field989];
				int var24 = var23[var20][var22] + var23[var19][var21] + var23[var20][var21] + var23[var19][var22] >> 2;
				int var25 = (var18 << 6) + (var13 << 7);
				int var26 = (var14 << 7) + (var17 << 6);
				class101 var27 = var16.method412(var25, var4, var26, var23, var6, var24);
				if (var27 != null) {
					if (var9 > var7) {
						byte var28 = var9;
						var9 = var7;
						var7 = var28;
					}
					class144.method1081(var14, var2 + 1, var13, var5, 0, class43.field989, var0 + 1, 0, -1);
					var15.field1653 = class140.field3217 + var0;
					var15.field1639 = class140.field3217 + var2;
					if (var1 > var11) {
						byte var29 = var1;
						var1 = var11;
						var11 = var29;
					}
					var15.field1627 = var13 * 128 + var18 * 64;
					var15.field1644 = var24;
					var15.field1645 = var1 + var14;
					var15.field1632 = var9 + var13;
					var15.field1642 = var7 + var13;
					var15.field1654 = var27;
					var15.field1636 = var11 + var14;
					var15.field1648 = var17 * 64 + var14 * 128;
				}
			}
		}
		if (class86.field2004 == 26) {
			int var30 = class158.field3612.method524();
			int var31 = class158.field3612.method532();
			int var32 = class43.field997 + (var31 >> 4 & 0x7);
			int var33 = class20.field368 + (var31 & 0x7);
			int var34 = class158.field3612.method519();
			if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
				class17 var35 = new class17();
				var35.field336 = var30;
				var35.field333 = var34;
				if (class23.field397[class43.field989][var32][var33] == null) {
					class23.field397[class43.field989][var32][var33] = new class157();
				}
				class23.field397[class43.field989][var32][var33].method1214(var35);
				class157.method1205(var33, var32);
			}
		} else if (class86.field2004 == 147) {
			int var36 = class158.field3612.method532();
			int var37 = var36 & 0x3;
			int var38 = var36 >> 2;
			int var39 = class135.field3131[var38];
			int var40 = class158.field3612.method529();
			int var41 = (var40 & 0x7) + class20.field368;
			int var42 = (var40 >> 4 & 0x7) + class43.field997;
			int var43 = class158.field3612.method518();
			if (var42 >= 0 && var41 >= 0 && var42 < 103 && var41 < 103) {
				if (var39 == 0) {
					class3 var44 = class159.field3657.method1123(class43.field989, var42, var41);
					if (var44 != null) {
						int var45 = var44.field42 >> 14 & 0x7FFF;
						if (var38 == 2) {
							var44.field29 = new class106(var45, 2, var37 + 4, class43.field989, var42, var41, var43, false, var44.field29);
							var44.field32 = new class106(var45, 2, var37 + 1 & 0x3, class43.field989, var42, var41, var43, false, var44.field32);
						} else {
							var44.field29 = new class106(var45, var38, var37, class43.field989, var42, var41, var43, false, var44.field29);
						}
					}
				}
				if (var39 == 1) {
					class118 var46 = class159.field3657.method1150(class43.field989, var42, var41);
					if (var46 != null) {
						int var47 = var46.field2825 >> 14 & 0x7FFF;
						if (var38 == 4 || var38 == 5) {
							var46.field2831 = new class106(var47, 4, var37, class43.field989, var42, var41, var43, false, var46.field2831);
						} else if (var38 == 6) {
							var46.field2831 = new class106(var47, 4, var37 + 4, class43.field989, var42, var41, var43, false, var46.field2831);
						} else if (var38 == 7) {
							var46.field2831 = new class106(var47, 4, (var37 + 2 & 0x3) + 4, class43.field989, var42, var41, var43, false, var46.field2831);
						} else if (var38 == 8) {
							var46.field2831 = new class106(var47, 4, var37 + 4, class43.field989, var42, var41, var43, false, var46.field2831);
							var46.field2817 = new class106(var47, 4, (var37 + 2 & 0x3) + 4, class43.field989, var42, var41, var43, false, var46.field2817);
						}
					}
				}
				if (var39 == 2) {
					class45 var48 = class159.field3657.method1119(class43.field989, var42, var41);
					if (var38 == 11) {
						var38 = 10;
					}
					if (var48 != null) {
						var48.field1058 = new class106(var48.field1067 >> 14 & 0x7FFF, var38, var37, class43.field989, var42, var41, var43, false, var48.field1058);
					}
				}
				if (var39 == 3) {
					class75 var49 = class159.field3657.method1160(class43.field989, var42, var41);
					if (var49 != null) {
						var49.field1770 = new class106(var49.field1766 >> 14 & 0x7FFF, 22, var37, class43.field989, var42, var41, var43, false, var49.field1770);
					}
				}
			}
		} else if (class86.field2004 == 32) {
			int var50 = class158.field3612.method529();
			int var51 = (var50 >> 4 & 0x7) + class43.field997;
			int var52 = (var50 & 0x7) + class20.field368;
			int var53 = class158.field3612.method524();
			if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
				class157 var54 = class23.field397[class43.field989][var51][var52];
				if (var54 != null) {
					for (class17 var55 = (class17) var54.method1211(); var55 != null; var55 = (class17) var54.method1209()) {
						if ((var53 & 0x7FFF) == var55.field333) {
							var55.method1091();
							break;
						}
					}
					if (var54.method1211() == null) {
						class23.field397[class43.field989][var51][var52] = null;
					}
					class157.method1205(var52, var51);
				}
			}
		} else if (class86.field2004 == 138) {
			int var56 = class158.field3612.method532();
			int var57 = (var56 >> 4 & 0x7) + class43.field997;
			int var58 = (var56 & 0x7) + class20.field368;
			int var59 = class158.field3612.method531();
			int var60 = class158.field3612.method531();
			int var61 = class158.field3612.method531();
			if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
				class157 var62 = class23.field397[class43.field989][var57][var58];
				if (var62 != null) {
					for (class17 var63 = (class17) var62.method1211(); var63 != null; var63 = (class17) var62.method1209()) {
						if ((var59 & 0x7FFF) == var63.field333 && var60 == var63.field336) {
							var63.field336 = var61;
							break;
						}
					}
					class157.method1205(var58, var57);
				}
			}
		} else if (class86.field2004 == 150) {
			int var64 = class158.field3612.method520();
			int var65 = var64 >> 2;
			int var66 = var64 & 0x3;
			int var67 = class135.field3131[var65];
			int var68 = class158.field3612.method529();
			int var69 = class43.field997 + (var68 >> 4 & 0x7);
			int var70 = class20.field368 + (var68 & 0x7);
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
				class144.method1081(var70, 0, var69, var67, var66, class43.field989, -1, var65, -1);
			}
		} else if (class86.field2004 == 120) {
			int var71 = class158.field3612.method532();
			int var72 = class20.field368 + (var71 & 0x7);
			int var73 = (var71 >> 4 & 0x7) + class43.field997;
			int var74 = class158.field3612.method531();
			int var75 = class158.field3612.method532();
			int var76 = class158.field3612.method531();
			if (var73 >= 0 && var72 >= 0 && var73 < 104 && var72 < 104) {
				int var77 = var72 * 128 + 64;
				int var78 = var73 * 128 + 64;
				class136 var79 = new class136(var74, class43.field989, var78, var77, class83.method653(class43.field989, var78, var77) - var75, var76, class140.field3217);
				class157.field3594.method1214(var79);
			}
		} else if (class86.field2004 == 103) {
			int var80 = class158.field3612.method524();
			int var81 = class158.field3612.method518();
			int var82 = class158.field3612.method535();
			int var83 = class43.field997 + (var82 >> 4 & 0x7);
			int var84 = class20.field368 + (var82 & 0x7);
			int var85 = class158.field3612.method519();
			if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && class37.field891 != var81) {
				class17 var86 = new class17();
				var86.field333 = var85;
				var86.field336 = var80;
				if (class23.field397[class43.field989][var83][var84] == null) {
					class23.field397[class43.field989][var83][var84] = new class157();
				}
				class23.field397[class43.field989][var83][var84].method1214(var86);
				class157.method1205(var84, var83);
			}
		} else if (class86.field2004 == 105) {
			int var87 = class158.field3612.method529();
			int var88 = var87 >> 2;
			int var89 = var87 & 0x3;
			int var90 = class135.field3131[var88];
			int var91 = class158.field3612.method518();
			int var92 = class158.field3612.method520();
			int var93 = (var92 >> 4 & 0x7) + class43.field997;
			int var94 = (var92 & 0x7) + class20.field368;
			if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
				class144.method1081(var94, 0, var93, var90, var89, class43.field989, -1, var88, var91);
			}
		} else {
			if (class86.field2004 == 195) {
				int var95 = class158.field3612.method532();
				int var96 = class43.field997 + (var95 >> 4 & 0x7);
				int var97 = (var95 & 0x7) + class20.field368;
				int var98 = class158.field3612.method531();
				int var99 = class158.field3612.method532();
				int var100 = class158.field3612.method532();
				int var101 = var99 & 0x7;
				int var102 = var99 >> 4 & 0xF;
				if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
					int var103 = var102 + 1;
					if (var96 - var103 <= class20.field373.field2759[0] && class20.field373.field2759[0] <= var103 + var96 && var97 - var103 <= class20.field373.field2736[0] && class20.field373.field2736[0] <= var97 + var103 && class114.field2646 != 0 && var101 > 0 && class143.field3277 < 50) {
						class53.field1195[class143.field3277] = var98;
						class126.field2923[class143.field3277] = var101;
						class112.field2626[class143.field3277] = var100;
						class65.field1509[class143.field3277] = null;
						class114.field2672[class143.field3277] = var102 + (var97 << 8) + (var96 << 16);
						class143.field3277++;
					}
				}
			}
			if (class86.field2004 == 82) {
				int var104 = class158.field3612.method532();
				int var105 = (var104 >> 4 & 0x7) + class43.field997;
				int var106 = class20.field368 + (var104 & 0x7);
				int var107 = var105 + class158.field3612.method544();
				int var108 = class158.field3612.method544() + var106;
				int var109 = class158.field3612.method551();
				int var110 = class158.field3612.method531();
				int var111 = class158.field3612.method532() * 4;
				int var112 = class158.field3612.method532() * 4;
				int var113 = class158.field3612.method531();
				int var114 = class158.field3612.method531();
				int var115 = class158.field3612.method532();
				int var116 = class158.field3612.method532();
				if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
					int var117 = var106 * 128 + 64;
					int var118 = var105 * 128 + 64;
					int var119 = var108 * 128 + 64;
					class128 var120 = new class128(var110, class43.field989, var118, var117, class83.method653(class43.field989, var118, var117) - var111, class140.field3217 + var113, class140.field3217 + var114, var115, var116, var109, var112);
					int var121 = var107 * 128 + 64;
					var120.method994(var119, var121, var113 + class140.field3217, -var112 + class83.method653(class43.field989, var121, var119));
					class88.field2038.method1214(var120);
				}
			}
		}
	}

	@ObfuscatedName("ld.a(BIII)V")
	public static void method632(int arg0, int arg1, int arg2) {
		class36 var3 = class130.method1000(arg0, arg1);
		if (var3 != null && var3.field837 != null) {
			class12 var4 = new class12();
			var4.field209 = var3;
			var4.field208 = var3.field837;
			class158.method1222(var4);
		}
		class146.field3319 = arg0;
		class88.field2045 = arg2;
		class43.field1002 = arg1;
		class151.field3468 = true;
		class132.method1008(var3);
	}

	@ObfuscatedName("ld.a(IIII)Lue;")
	public static class144 method633(int arg0, int arg1, int arg2) {
		class144 var3 = new class144();
		var3.field3291 = arg0;
		var3.field3280 = arg1;
		class109.field2571.method1201((long) arg2, var3);
		client.method156(arg1);
		class64.method493(arg1);
		class36 var4 = class128.method991(arg2);
		if (var4 != null) {
			class132.method1008(var4);
		}
		if (class50.field1158 != null) {
			class132.method1008(class50.field1158);
			class50.field1158 = null;
		}
		class26.field476 = false;
		class119.field2849 = 0;
		class62.method476(class36.field863, class121.field2864, class45.field1071, class110.field2585);
		if (class13.field220 != -1) {
			class154.method1192(class13.field220, 1);
		}
		return var3;
	}

	@ObfuscatedName("ld.a(ILvd;[B[Lqf;II)V")
	public static void method634(int arg0, class150 arg1, byte[] arg2, class117[] arg3, int arg4) {
		int var5 = -1;
		class66 var6 = new class66(arg2);
		while (true) {
			int var7 = var6.method505();
			if (var7 == 0) {
				return;
			}
			var5 += var7;
			int var8 = 0;
			while (true) {
				int var9 = var6.method505();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 >> 6 & 0x3F;
				int var11 = var8 & 0x3F;
				int var12 = var8 >> 12;
				int var13 = var6.method532();
				int var14 = var13 >> 2;
				int var15 = var13 & 0x3;
				int var16 = arg0 + var10;
				int var17 = arg4 + var11;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((class3.field50[1][var16][var17] & 0x2) == 2) {
						var18 = var12 - 1;
					}
					class117 var19 = null;
					if (var18 >= 0) {
						var19 = arg3[var18];
					}
					class109.method868(arg1, var17, var14, var5, var15, var19, var12, var16);
				}
			}
		}
	}

	@ObfuscatedName("ld.a(Z)V")
	public static void method635() {
		field1853 = null;
		field1837 = null;
		field1840 = null;
		field1851 = null;
		field1838 = null;
		field1855 = null;
		field1849 = null;
	}

	@ObfuscatedName("ld.a(IB)Lac;")
	public static class4 method636(int arg0) {
		class4 var1 = (class4) class62.field1406.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class73.field1715.method206(14, arg0);
		class4 var3 = new class4();
		if (var2 != null) {
			var3.method13(new class66(var2));
		}
		class62.field1406.method484((long) arg0, var3);
		return var3;
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (class38.field919 != null) {
			class14.field231 = -1;
		}
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (class38.field919 != null) {
			class157.field3586 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && var2 < class92.field2120.length) {
				var3 = class92.field2120[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (class14.field231 >= 0 && var3 >= 0) {
				class4.field55[class14.field231] = ~var3;
				class14.field231 = class14.field231 + 1 & 0x7F;
				if (class14.field231 == class114.field2660) {
					class14.field231 = -1;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		int var2 = class77.method618(arg0);
		if (var2 >= 0) {
			int var3 = class62.field1396 + 1 & 0x7F;
			if (class1.field8 != var3) {
				class144.field3285[class62.field1396] = -1;
				class106.field2518[class62.field1396] = var2;
				class62.field1396 = var3;
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (class38.field919 == null) {
			return;
		}
		class157.field3586 = 0;
		int var2 = arg0.getKeyCode();
		int var3;
		if (var2 >= 0 && class92.field2120.length > var2) {
			var3 = class92.field2120[var2];
			if ((var3 & 0x80) != 0) {
				var3 = -1;
			}
		} else {
			var3 = -1;
		}
		if (class14.field231 >= 0 && var3 >= 0) {
			class4.field55[class14.field231] = var3;
			class14.field231 = class14.field231 + 1 & 0x7F;
			if (class14.field231 == class114.field2660) {
				class14.field231 = -1;
			}
		}
		if (var3 >= 0) {
			int var4 = class62.field1396 + 1 & 0x7F;
			if (class1.field8 != var4) {
				class144.field3285[class62.field1396] = var3;
				class106.field2518[class62.field1396] = -1;
				class62.field1396 = var4;
			}
		}
		int var5 = arg0.getModifiers();
		if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
			arg0.consume();
		}
	}
}
