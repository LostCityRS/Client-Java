package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("pe")
public final class class109 implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("pe.e")
	public static boolean field2553 = false;

	@ObfuscatedName("pe.h")
	public static class32 field2556 = field2564;

	@ObfuscatedName("pe.m")
	public static class32 field2561 = class73.method593("Loaded input handler", true);

	@ObfuscatedName("pe.n")
	public static int field2562;

	@ObfuscatedName("pe.o")
	public static class32 field2563 = class73.method593(": ", true);

	@ObfuscatedName("pe.p")
	public static class32 field2564 = class73.method593("Connection timed out)3", true);

	@ObfuscatedName("pe.q")
	public static class32 field2565 = class73.method593("Unexpected server response", true);

	@ObfuscatedName("pe.r")
	public static final int field2566 = 3353893;

	@ObfuscatedName("pe.s")
	public static class32 field2567 = class73.method593("welle:", true);

	@ObfuscatedName("pe.t")
	public static class32 field2568 = field2561;

	@ObfuscatedName("pe.u")
	public static int field2569 = 0;

	@ObfuscatedName("pe.v")
	public static class32 field2570 = field2565;

	@ObfuscatedName("pe.w")
	public static class156 field2571 = new class156(8);

	@ObfuscatedName("pe.y")
	public static class32 field2573 = class73.method593("W-=hlen Sie eine Option", true);

	@ObfuscatedName("pe.A")
	public static class32[] field2575 = new class32[500];

	@ObfuscatedName("pe.z")
	public static class32 field2574 = class73.method593("Unerwartete Antwort vom Anmelde)2Server", true);

	@ObfuscatedName("pe.a(I)V")
	public static void method867() {
		field2567 = null;
		field2563 = null;
		field2570 = null;
		field2571 = null;
		field2573 = null;
		field2564 = null;
		field2574 = null;
		field2561 = null;
		field2575 = null;
		field2556 = null;
		field2568 = null;
		field2565 = null;
	}

	@ObfuscatedName("pe.a(Lvd;IIIILqf;IIB)V")
	public static void method868(class150 arg0, int arg1, int arg2, int arg3, int arg4, class117 arg5, int arg6, int arg7) {
		if (class154.field3529 && (class3.field50[0][arg7][arg1] & 0x2) == 0) {
			if ((class3.field50[arg6][arg7][arg1] & 0x10) != 0) {
				return;
			}
			if (class34.method287(arg6, arg1, arg7) != class115.field2743) {
				return;
			}
		}
		if (class151.field3472 > arg6) {
			class151.field3472 = arg6;
		}
		class53 var8 = class5.method22(arg3);
		int var9;
		int var10;
		if (arg4 == 1 || arg4 == 3) {
			var9 = var8.field1233;
			var10 = var8.field1222;
		} else {
			var9 = var8.field1222;
			var10 = var8.field1233;
		}
		int var11;
		int var12;
		if (arg7 + var9 > 104) {
			var11 = arg7;
			var12 = arg7 + 1;
		} else {
			var12 = (var9 + 1 >> 1) + arg7;
			var11 = arg7 + (var9 >> 1);
		}
		int var13;
		int var14;
		if (var10 + arg1 <= 104) {
			var13 = (var10 + 1 >> 1) + arg1;
			var14 = arg1 + (var10 >> 1);
		} else {
			var13 = arg1 + 1;
			var14 = arg1;
		}
		int[][] var15 = class70.field1630[arg6];
		int var16 = (var9 << 6) + (arg7 << 7);
		int var17 = (var10 << 6) + (arg1 << 7);
		int var18 = (arg3 << 14) + (arg1 << 7) + arg7 + 1073741824;
		if (var8.field1193 == 0) {
			var18 += Integer.MIN_VALUE;
		}
		int var19 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
		int var20 = arg2 + (arg4 << 6);
		if (var8.field1252 == 1) {
			var20 += 256;
		}
		if (var8.method411()) {
			class75.method603(arg4, var8, arg6, arg7, arg1);
		}
		if (arg2 == 22) {
			if (!class154.field3529 || var8.field1193 != 0 || var8.field1235 == 1 || var8.field1204) {
				class26 var21;
				if (var8.field1225 == -1 && var8.field1251 == null) {
					var21 = var8.method421(var17, var19, arg4, var15, var16, 22);
				} else {
					var21 = new class106(arg3, 22, arg4, arg6, arg7, arg1, var8.field1225, true, null);
				}
				arg0.method1138(arg6, arg7, arg1, var19, var21, var18, var20);
				if (var8.field1235 == 1 && arg5 != null) {
					arg5.method931(arg7, arg1);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			class26 var22;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var22 = var8.method421(var17, var19, arg4, var15, var16, 10);
			} else {
				var22 = new class106(arg3, 10, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			if (var22 != null && arg0.method1151(arg6, arg7, arg1, var19, var9, var10, var22, arg2 == 11 ? 256 : 0, var18, var20) && var8.field1253) {
				int var23 = 15;
				if (var22 instanceof class101) {
					var23 = ((class101) var22).method816() / 4;
					if (var23 > 30) {
						var23 = 30;
					}
				}
				for (int var24 = 0; var24 <= var9; var24++) {
					for (int var25 = 0; var25 <= var10; var25++) {
						if (class85.field1985[arg6][arg7 + var24][var25 + arg1] < var23) {
							class85.field1985[arg6][var24 + arg7][arg1 + var25] = (byte) var23;
						}
					}
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method914(var10, var8.field1219, arg7, arg1, var9);
			}
		} else if (arg2 >= 12) {
			class26 var26;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var26 = var8.method421(var17, var19, arg4, var15, var16, arg2);
			} else {
				var26 = new class106(arg3, arg2, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1151(arg6, arg7, arg1, var19, 1, 1, var26, 0, var18, var20);
			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg6 > 0) {
				class103.field2426[arg6][arg7][arg1] |= 0x924;
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method914(var10, var8.field1219, arg7, arg1, var9);
			}
		} else if (arg2 == 0) {
			class26 var27;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var27 = var8.method421(var17, var19, arg4, var15, var16, 0);
			} else {
				var27 = new class106(arg3, 0, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var27, null, class137.field3176[arg4], 0, var18, var20);
			if (arg4 == 0) {
				if (var8.field1253) {
					class85.field1985[arg6][arg7][arg1] = 50;
					class85.field1985[arg6][arg7][arg1 + 1] = 50;
				}
				if (var8.field1210) {
					class103.field2426[arg6][arg7][arg1] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var8.field1253) {
					class85.field1985[arg6][arg7][arg1 + 1] = 50;
					class85.field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				}
				if (var8.field1210) {
					class103.field2426[arg6][arg7][arg1 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var8.field1253) {
					class85.field1985[arg6][arg7 + 1][arg1] = 50;
					class85.field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				}
				if (var8.field1210) {
					class103.field2426[arg6][arg7 + 1][arg1] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var8.field1253) {
					class85.field1985[arg6][arg7][arg1] = 50;
					class85.field1985[arg6][arg7 + 1][arg1] = 50;
				}
				if (var8.field1210) {
					class103.field2426[arg6][arg7][arg1] |= 0x492;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
			if (var8.field1245 != 16) {
				arg0.method1152(arg6, arg7, arg1, var8.field1245);
			}
		} else if (arg2 == 1) {
			class26 var28;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var28 = var8.method421(var17, var19, arg4, var15, var16, 1);
			} else {
				var28 = new class106(arg3, 1, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var28, null, class121.field2877[arg4], 0, var18, var20);
			if (var8.field1253) {
				if (arg4 == 0) {
					class85.field1985[arg6][arg7][arg1 + 1] = 50;
				} else if (arg4 == 1) {
					class85.field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				} else if (arg4 == 2) {
					class85.field1985[arg6][arg7 + 1][arg1] = 50;
				} else if (arg4 == 3) {
					class85.field1985[arg6][arg7][arg1] = 50;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
		} else if (arg2 == 2) {
			int var29 = arg4 + 1 & 0x3;
			class26 var30;
			class26 var31;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var30 = var8.method421(var17, var19, arg4 + 4, var15, var16, 2);
				var31 = var8.method421(var17, var19, var29, var15, var16, 2);
			} else {
				var30 = new class106(arg3, 2, arg4 + 4, arg6, arg7, arg1, var8.field1225, true, null);
				var31 = new class106(arg3, 2, var29, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var30, var31, class137.field3176[arg4], class137.field3176[var29], var18, var20);
			if (var8.field1210) {
				if (arg4 == 0) {
					class103.field2426[arg6][arg7][arg1] |= 0x249;
					class103.field2426[arg6][arg7][arg1 + 1] |= 0x492;
				} else if (arg4 == 1) {
					class103.field2426[arg6][arg7][arg1 + 1] |= 0x492;
					class103.field2426[arg6][arg7 + 1][arg1] |= 0x249;
				} else if (arg4 == 2) {
					class103.field2426[arg6][arg7 + 1][arg1] |= 0x249;
					class103.field2426[arg6][arg7][arg1] |= 0x492;
				} else if (arg4 == 3) {
					class103.field2426[arg6][arg7][arg1] |= 0x492;
					class103.field2426[arg6][arg7][arg1] |= 0x249;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
			if (var8.field1245 != 16) {
				arg0.method1152(arg6, arg7, arg1, var8.field1245);
			}
		} else if (arg2 == 3) {
			class26 var32;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var32 = var8.method421(var17, var19, arg4, var15, var16, 3);
			} else {
				var32 = new class106(arg3, 3, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1117(arg6, arg7, arg1, var19, var32, null, class121.field2877[arg4], 0, var18, var20);
			if (var8.field1253) {
				if (arg4 == 0) {
					class85.field1985[arg6][arg7][arg1 + 1] = 50;
				} else if (arg4 == 1) {
					class85.field1985[arg6][arg7 + 1][arg1 + 1] = 50;
				} else if (arg4 == 2) {
					class85.field1985[arg6][arg7 + 1][arg1] = 50;
				} else if (arg4 == 3) {
					class85.field1985[arg6][arg7][arg1] = 50;
				}
			}
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method920(var8.field1219, arg2, arg7, arg1, arg4);
			}
		} else if (arg2 == 9) {
			class26 var33;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var33 = var8.method421(var17, var19, arg4, var15, var16, arg2);
			} else {
				var33 = new class106(arg3, arg2, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1151(arg6, arg7, arg1, var19, 1, 1, var33, 0, var18, var20);
			if (var8.field1235 != 0 && arg5 != null) {
				arg5.method914(var10, var8.field1219, arg7, arg1, var9);
			}
			if (var8.field1245 != 16) {
				arg0.method1152(arg6, arg7, arg1, var8.field1245);
			}
		} else if (arg2 == 4) {
			class26 var34;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var34 = var8.method421(var17, var19, arg4, var15, var16, 4);
			} else {
				var34 = new class106(arg3, 4, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var34, null, class137.field3176[arg4], 0, 0, 0, var18, var20);
		} else if (arg2 == 5) {
			int var35 = 16;
			int var36 = arg0.method1153(arg6, arg7, arg1);
			if (var36 != 0) {
				var35 = class5.method22(var36 >> 14 & 0x7FFF).field1245;
			}
			class26 var37;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var37 = var8.method421(var17, var19, arg4, var15, var16, 4);
			} else {
				var37 = new class106(arg3, 4, arg4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var37, null, class137.field3176[arg4], 0, var35 * class129.field2974[arg4], var35 * class83.field1927[arg4], var18, var20);
		} else if (arg2 == 6) {
			int var38 = 8;
			int var39 = arg0.method1153(arg6, arg7, arg1);
			if (var39 != 0) {
				var38 = class5.method22(var39 >> 14 & 0x7FFF).field1245 / 2;
			}
			class26 var40;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var40 = var8.method421(var17, var19, arg4 + 4, var15, var16, 4);
			} else {
				var40 = new class106(arg3, 4, arg4 + 4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var40, null, 256, arg4, class143.field3279[arg4] * var38, var38 * class41.field955[arg4], var18, var20);
		} else if (arg2 == 7) {
			int var41 = arg4 + 2 & 0x3;
			class26 var42;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var42 = var8.method421(var17, var19, var41 + 4, var15, var16, 4);
			} else {
				var42 = new class106(arg3, 4, var41 + 4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var42, null, 256, var41, 0, 0, var18, var20);
		} else if (arg2 == 8) {
			int var43 = 8;
			int var44 = arg0.method1153(arg6, arg7, arg1);
			if (var44 != 0) {
				var43 = class5.method22(var44 >> 14 & 0x7FFF).field1245 / 2;
			}
			int var45 = arg4 + 2 & 0x3;
			class26 var46;
			class26 var47;
			if (var8.field1225 == -1 && var8.field1251 == null) {
				var46 = var8.method421(var17, var19, arg4 + 4, var15, var16, 4);
				var47 = var8.method421(var17, var19, var45 + 4, var15, var16, 4);
			} else {
				var46 = new class106(arg3, 4, arg4 + 4, arg6, arg7, arg1, var8.field1225, true, null);
				var47 = new class106(arg3, 4, var45 + 4, arg6, arg7, arg1, var8.field1225, true, null);
			}
			arg0.method1158(arg6, arg7, arg1, var19, var46, var47, 256, arg4, class143.field3279[arg4] * var43, var43 * class41.field955[arg4], var18, var20);
		}
	}

	@ObfuscatedName("pe.a(II)V")
	public static void method869(int arg0) {
		if (class28.method192(arg0)) {
			class106.method859(-1, class79.field1825[arg0]);
		}
	}

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (class38.field909 != null) {
			class139.field3209 = 0;
			class126.field2915 = arg0.getX();
			class44.field1037 = arg0.getY();
		}
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (class38.field909 != null) {
			class139.field3209 = 0;
			class151.field3467 = arg0.getX();
			class15.field288 = arg0.getY();
			class31.field610 = class52.method407();
			if (arg0.isMetaDown()) {
				class158.field3613 = 2;
				class82.field1917 = 2;
			} else {
				class158.field3613 = 1;
				class82.field1917 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (class38.field909 != null) {
			class82.field1917 = 0;
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (class38.field909 != null) {
			class139.field3209 = 0;
			class82.field1917 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void mouseMoved(MouseEvent arg0) {
		if (class38.field909 != null) {
			class139.field3209 = 0;
			class126.field2915 = arg0.getX();
			class44.field1037 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (class38.field909 != null) {
			class139.field3209 = 0;
			class126.field2915 = arg0.getX();
			class44.field1037 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (class38.field909 != null) {
			class139.field3209 = 0;
			class126.field2915 = -1;
			class44.field1037 = -1;
		}
	}
}
