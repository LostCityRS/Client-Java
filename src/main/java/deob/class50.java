package deob;

import java.awt.Graphics;

@ObfuscatedName("ha")
public final class class50 extends class146 {

	@ObfuscatedName("ha.r")
	public final byte[] field1145;

	@ObfuscatedName("ha.s")
	public static class63 field1146 = new class63(128);

	@ObfuscatedName("ha.u")
	public static class32 field1148 = null;

	@ObfuscatedName("ha.F")
	public static int[] field1159 = new int[25];

	@ObfuscatedName("ha.y")
	public static class32 field1152 = class73.method593("<img=0>", true);

	@ObfuscatedName("ha.E")
	public static class36 field1158 = null;

	@ObfuscatedName("ha.B")
	public static class32 field1155 = class73.method593("p11_full", true);

	@ObfuscatedName("ha.G")
	public static int field1160 = 0;

	@ObfuscatedName("ha.I")
	public static class32 field1162 = class73.method593("mapmarker", true);

	@ObfuscatedName("ha.K")
	public static class36 field1163;

	@ObfuscatedName("ha.D")
	public static class48 field1157;

	@ObfuscatedName("ha.a(B)V")
	public static void method391() {
		field1148 = null;
		field1163 = null;
		field1146 = null;
		field1158 = null;
		field1152 = null;
		field1157 = null;
		field1155 = null;
		field1162 = null;
		field1159 = null;
	}

	@ObfuscatedName("ha.d(I)I")
	public static int method392() {
		int var0 = class83.method653(class43.field989, class105.field2494, class48.field1126);
		return var0 - class73.field1719 >= 800 || (class3.field50[class43.field989][class105.field2494 >> 7][class48.field1126 >> 7] & 0x4) == 0 ? 3 : class43.field989;
	}

	@ObfuscatedName("ha.a(Lnf;ZLnf;)V")
	public static void method393(class96 arg0, class96 arg1) {
		if (class70.field1651 == null) {
			class70.field1651 = class62.method474(class71.field1688, class30.field572, class74.field1748);
		}
		if (class54.field1264 == null) {
			class54.field1264 = class56.method443(class74.field1748, class65.field1505, class30.field572);
		}
		if (class41.field958 == null) {
			class41.field958 = class56.method443(class74.field1748, class63.field1455, class30.field572);
		}
		if (class156.field3556 == null) {
			class156.field3556 = class56.method443(class74.field1748, class111.field2607, class30.field572);
		}
		class141.method1053(0, 23, 765, 480, 0);
		class141.method1059(0, 0, 125, 23, 12425273, 9135624);
		class141.method1059(125, 0, 640, 23, 5197647, 2697513);
		arg0.method793(class4.field65, 62, 15, 0, -1);
		if (class156.field3556 != null) {
			class156.field3556[1].method399(140, 1);
			arg1.method791(class105.field2484, 152, 10, 16777215, -1);
			class156.field3556[0].method399(140, 12);
			arg1.method791(class32.field628, 152, 21, 16777215, -1);
		}
		if (class41.field958 != null) {
			if (class154.field3510[0] == 0 && class98.field2264[0] == 0) {
				class41.field958[2].method399(280, 4);
			} else {
				class41.field958[0].method399(280, 4);
			}
			if (class154.field3510[0] == 0 && class98.field2264[0] == 1) {
				class41.field958[3].method399(295, 4);
			} else {
				class41.field958[1].method399(295, 4);
			}
			arg0.method791(class15.field292, 312, 17, 16777215, -1);
			if (class154.field3510[0] == 1 && class98.field2264[0] == 0) {
				class41.field958[2].method399(390, 4);
			} else {
				class41.field958[0].method399(390, 4);
			}
			if (class154.field3510[0] == 1 && class98.field2264[0] == 1) {
				class41.field958[3].method399(405, 4);
			} else {
				class41.field958[1].method399(405, 4);
			}
			arg0.method791(class91.field2092, 422, 17, 16777215, -1);
			if (class154.field3510[0] == 2 && class98.field2264[0] == 0) {
				class41.field958[2].method399(500, 4);
			} else {
				class41.field958[0].method399(500, 4);
			}
			if (class154.field3510[0] == 2 && class98.field2264[0] == 1) {
				class41.field958[3].method399(515, 4);
			} else {
				class41.field958[1].method399(515, 4);
			}
			arg0.method791(class34.field721, 532, 17, 16777215, -1);
			if (class154.field3510[0] == 3 && class98.field2264[0] == 0) {
				class41.field958[2].method399(610, 4);
			} else {
				class41.field958[0].method399(610, 4);
			}
			if (class154.field3510[0] == 3 && class98.field2264[0] == 1) {
				class41.field958[3].method399(625, 4);
			} else {
				class41.field958[1].method399(625, 4);
			}
			arg0.method791(class112.field2620, 642, 17, 16777215, -1);
		}
		class141.method1053(708, 4, 50, 16, 0);
		arg1.method793(class92.field2114, 733, 16, 16777215, -1);
		class137.field3191 = -1;
		if (class70.field1651 != null) {
			int var2 = 8;
			int var3 = 24;
			int var4;
			int var5;
			do {
				var4 = var3;
				var5 = var2;
				if (var3 * (var2 - 1) >= class75.field1758) {
					var2--;
				}
				if (class75.field1758 <= (var3 - 1) * var2) {
					var3--;
				}
				if (class75.field1758 <= (var3 - 1) * var2) {
					var3--;
				}
			} while (var3 != var4 || var2 != var5);
			int var6 = (480 - var3 * 19) / (var3 + 1);
			if (var6 > 5) {
				var6 = 5;
			}
			int var7 = (765 - var2 * 88) / (var2 + 1);
			if (var7 > 5) {
				var7 = 5;
			}
			int var8 = (765 - var2 * 88 - var7 * (var2 - 1)) / 2;
			int var9 = (480 - var6 * (var3 - 1) - var3 * 19) / 2;
			int var10 = var9 + 23;
			int var11 = var8;
			int var12 = 0;
			for (int var13 = 0; var13 < class75.field1758; var13++) {
				class102 var14 = class97.field2235[var13];
				boolean var15 = true;
				class32 var16 = class159.method1228(var14.field2390);
				if (var14.field2390 == -1) {
					var16 = class34.field715;
					var15 = false;
				} else if (var14.field2390 > 1980) {
					var16 = class124.field2889;
					var15 = false;
				}
				if (var11 <= class86.field2001 && class140.field3216 >= var10 && var11 + 88 > class86.field2001 && class140.field3216 < var10 + 19 && var15) {
					class137.field3191 = var13;
					class70.field1651[var14.field2393 ? 1 : 0].method386(var11, var10);
				} else {
					class70.field1651[var14.field2393 ? 1 : 0].method387(var11, var10);
				}
				if (class54.field1264 != null) {
					class54.field1264[(var14.field2393 ? 8 : 0) + var14.field2387].method399(var11 + 29, var10);
				}
				arg0.method793(class159.method1228(var14.field2396), var11 + 15, var10 + 9 + 5, 0, -1);
				arg1.method793(var16, var11 + 60, var10 + 5 + 9, 268435455, -1);
				var10 += var6 + 19;
				var12++;
				if (var3 <= var12) {
					var10 = var9 + 23;
					var12 = 0;
					var11 += var7 + 88;
				}
			}
		}
		try {
			Graphics var17 = class107.field2539.getGraphics();
			field1157.method122(var17);
		} catch (Exception var18) {
			class107.field2539.repaint();
		}
	}

	@ObfuscatedName("ha.a(II[II[I[Loe;)V")
	public static void method394(int arg0, int arg1, int[] arg2, int[] arg3, class102[] arg4) {
		if (arg0 >= arg1) {
			return;
		}
		int var5 = arg1 + 1;
		int var6 = (arg0 + arg1) / 2;
		class102 var7 = arg4[var6];
		arg4[var6] = arg4[arg0];
		int var8 = arg0 - 1;
		arg4[arg0] = var7;
		while (var8 < var5) {
			boolean var9 = true;
			do {
				var5--;
				for (int var10 = 0; var10 < 4; var10++) {
					int var11;
					int var12;
					if (arg3[var10] == 2) {
						var12 = var7.field2398;
						var11 = arg4[var5].field2398;
					} else if (arg3[var10] == 1) {
						var11 = arg4[var5].field2390;
						var12 = var7.field2390;
						if (var11 == -1 && arg2[var10] == 1) {
							var11 = 2001;
						}
						if (var12 == -1 && arg2[var10] == 1) {
							var12 = 2001;
						}
					} else if (arg3[var10] == 3) {
						var11 = arg4[var5].field2393 ? 1 : 0;
						var12 = var7.field2393 ? 1 : 0;
					} else {
						var12 = var7.field2396;
						var11 = arg4[var5].field2396;
					}
					if (var11 != var12) {
						if ((arg2[var10] != 1 || var11 <= var12) && (arg2[var10] != 0 || var12 <= var11)) {
							var9 = false;
						}
						break;
					}
					if (var10 == 3) {
						var9 = false;
					}
				}
			} while (var9);
			boolean var13 = true;
			do {
				var8++;
				for (int var14 = 0; var14 < 4; var14++) {
					int var15;
					int var16;
					if (arg3[var14] == 2) {
						var15 = var7.field2398;
						var16 = arg4[var8].field2398;
					} else if (arg3[var14] == 1) {
						var15 = var7.field2390;
						if (var15 == -1 && arg2[var14] == 1) {
							var15 = 2001;
						}
						var16 = arg4[var8].field2390;
						if (var16 == -1 && arg2[var14] == 1) {
							var16 = 2001;
						}
					} else if (arg3[var14] == 3) {
						var16 = arg4[var8].field2393 ? 1 : 0;
						var15 = var7.field2393 ? 1 : 0;
					} else {
						var15 = var7.field2396;
						var16 = arg4[var8].field2396;
					}
					if (var15 != var16) {
						if ((arg2[var14] != 1 || var15 <= var16) && (arg2[var14] != 0 || var15 >= var16)) {
							var13 = false;
						}
						break;
					}
					if (var14 == 3) {
						var13 = false;
					}
				}
			} while (var13);
			if (var8 < var5) {
				class102 var17 = arg4[var8];
				arg4[var8] = arg4[var5];
				arg4[var5] = var17;
			}
		}
		method394(arg0, var5, arg2, arg3, arg4);
		method394(var5 + 1, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ha.b(II)I")
	public static int method395(int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@ObfuscatedName("ha.c(II)Lia;")
	public static class57 method396(int arg0) {
		class57 var1 = (class57) class5.field105.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class4.field56.method206(4, arg0);
		class57 var3 = new class57();
		if (var2 != null) {
			var3.method447(new class66(var2), arg0);
		}
		var3.method446();
		class5.field105.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ha.e(I)V")
	public static void method397() {
		for (int var0 = -1; var0 < class62.field1404; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = class137.field3187[var0];
			}
			class70 var2 = class52.field1175[var1];
			if (var2 != null && var2.field2706 > 0) {
				var2.field2706--;
				if (var2.field2706 == 0) {
					var2.field2721 = null;
				}
			}
		}
		for (int var3 = 0; var3 < class102.field2397; var3++) {
			int var4 = class15.field313[var3];
			class111 var5 = class14.field230[var4];
			if (var5 != null && var5.field2706 > 0) {
				var5.field2706--;
				if (var5.field2706 == 0) {
					var5.field2721 = null;
				}
			}
		}
	}

	public class50(byte[] arg0) {
		this.field1145 = arg0;
	}
}
