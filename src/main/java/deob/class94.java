package deob;

import java.io.IOException;

@ObfuscatedName("nd")
public final class class94 {

	@ObfuscatedName("nd.a")
	public static int field2160 = 0;

	@ObfuscatedName("nd.b")
	public static class32 field2161 = class73.method593("Art", true);

	@ObfuscatedName("nd.c")
	public static class32 field2162 = class73.method593(" from your friend list first", true);

	@ObfuscatedName("nd.e")
	public static final boolean field2164 = false;

	@ObfuscatedName("nd.j")
	public static int[] field2169;

	@ObfuscatedName("nd.k")
	public static class63 field2170 = new class63(64);

	@ObfuscatedName("nd.l")
	public final int[] field2171;

	@ObfuscatedName("nd.m")
	public static class32 field2172 = class73.method593("Bitte warten Sie)3)3)3", true);

	@ObfuscatedName("nd.o")
	public static int field2174;

	@ObfuscatedName("nd.s")
	public static class32 field2178 = field2162;

	@ObfuscatedName("nd.u")
	public static class32 field2180 = class73.method593("red:", true);

	@ObfuscatedName("nd.d")
	public static class32 field2163 = field2180;

	@ObfuscatedName("nd.r")
	public static class32 field2177 = field2180;

	@ObfuscatedName("nd.w")
	public static class32 field2182 = class73.method593("<col=ffff00>", true);

	@ObfuscatedName("nd.x")
	public static class32 field2183 = class73.method593(":assistreq:", true);

	@ObfuscatedName("nd.a(BILea;I)[Lh;")
	public static class49[] method739(int arg0, class30 arg1, int arg2) {
		return class28.method193(arg2, arg1, arg0) ? class1.method1() : null;
	}

	@ObfuscatedName("nd.a(IZ)V")
	public static void method740(boolean arg0) {
		if (class4.field81 == null) {
			return;
		}
		try {
			class66 var1 = new class66(4);
			var1.method514(arg0 ? 2 : 3);
			var1.method550(0);
			class4.field81.method49(var1.field1586, 4);
		} catch (IOException var3) {
			try {
				class4.field81.method52();
			} catch (Exception var2) {
			}
			class4.field81 = null;
			class61.field1355++;
		}
	}

	@ObfuscatedName("nd.a(I)Lhb;")
	public static class51 method741() {
		class51 var0 = new class51();
		var0.field1166 = class31.field616;
		var0.field1170 = class70.field1638[0];
		var0.field1164 = class147.field3344[0];
		var0.field1168 = class128.field2965;
		var0.field1169 = class152.field3506;
		var0.field1171 = class34.field719[0];
		var0.field1165 = class74.field1746[0];
		var0.field1167 = class126.field2925[0];
		class70.method579();
		return var0;
	}

	@ObfuscatedName("nd.a(IB)Z")
	public static boolean method742(int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("nd.a(ILec;B)V")
	public static void method744(int arg0, class32 arg1) {
		class44.field1026.method356(205);
		class44.field1026.method547(arg0);
		class44.field1026.method512(arg1.method259());
	}

	@ObfuscatedName("nd.a(B)V")
	public static void method745() {
		class32.field656 = null;
		class112.field2631 = null;
		class102.field2395 = null;
	}

	@ObfuscatedName("nd.b(I)V")
	public static void method746() {
		class158.field3612.method351();
		int var0 = class158.field3612.method352(8);
		if (var0 < class102.field2397) {
			for (int var1 = var0; var1 < class102.field2397; var1++) {
				class27.field495[class102.field2391++] = class15.field313[var1];
			}
		}
		if (class102.field2397 < var0) {
			throw new RuntimeException("gnpov1");
		}
		class102.field2397 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class15.field313[var2];
			class111 var4 = class14.field230[var3];
			int var5 = class158.field3612.method352(1);
			if (var5 == 0) {
				class15.field313[class102.field2397++] = var3;
				var4.field2713 = class140.field3217;
			} else {
				int var6 = class158.field3612.method352(2);
				if (var6 == 0) {
					class15.field313[class102.field2397++] = var3;
					var4.field2713 = class140.field3217;
					class62.field1418[class61.field1352++] = var3;
				} else if (var6 == 1) {
					class15.field313[class102.field2397++] = var3;
					var4.field2713 = class140.field3217;
					int var7 = class158.field3612.method352(3);
					var4.method900(var7, false);
					int var8 = class158.field3612.method352(1);
					if (var8 == 1) {
						class62.field1418[class61.field1352++] = var3;
					}
				} else if (var6 == 2) {
					class15.field313[class102.field2397++] = var3;
					var4.field2713 = class140.field3217;
					int var9 = class158.field3612.method352(3);
					var4.method900(var9, true);
					int var10 = class158.field3612.method352(3);
					var4.method900(var10, true);
					int var11 = class158.field3612.method352(1);
					if (var11 == 1) {
						class62.field1418[class61.field1352++] = var3;
					}
				} else if (var6 == 3) {
					class27.field495[class102.field2391++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("nd.a(ZIIIIIIIIIII)Z")
	public static boolean method747(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				class100.field2317[var11][var12] = 0;
				class53.field1239[var11][var12] = 99999999;
			}
		}
		class100.field2317[arg6][arg2] = 99;
		class53.field1239[arg6][arg2] = 0;
		int var13 = arg6;
		int var14 = arg2;
		int var15 = 0;
		byte var16 = 0;
		class68.field1600[0] = arg6;
		boolean var17 = false;
		int var35 = var16 + 1;
		class75.field1759[0] = arg2;
		int var18 = class68.field1600.length;
		int[][] var19 = class105.field2482[class43.field989].field2811;
		while (var35 != var15) {
			var14 = class75.field1759[var15];
			var13 = class68.field1600[var15];
			var15 = (var15 + 1) % var18;
			if (arg5 == var13 && arg8 == var14) {
				var17 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && class105.field2482[class43.field989].method930(arg1, arg8, var14, arg5, arg3 - 1, var13)) {
					var17 = true;
					break;
				}
				if (arg3 < 10 && class105.field2482[class43.field989].method915(arg5, arg3 - 1, arg1, var13, var14, arg8)) {
					var17 = true;
					break;
				}
			}
			if (arg9 != 0 && arg4 != 0 && class105.field2482[class43.field989].method919(var14, arg9, arg4, var13, arg8, arg5, arg7)) {
				var17 = true;
				break;
			}
			int var20 = class53.field1239[var13][var14] + 1;
			if (var13 > 0 && class100.field2317[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
				class68.field1600[var35] = var13 - 1;
				class75.field1759[var35] = var14;
				var35 = (var35 + 1) % var18;
				class100.field2317[var13 - 1][var14] = 2;
				class53.field1239[var13 - 1][var14] = var20;
			}
			if (var13 < 103 && class100.field2317[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
				class68.field1600[var35] = var13 + 1;
				class75.field1759[var35] = var14;
				var35 = (var35 + 1) % var18;
				class100.field2317[var13 + 1][var14] = 8;
				class53.field1239[var13 + 1][var14] = var20;
			}
			if (var14 > 0 && class100.field2317[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
				class68.field1600[var35] = var13;
				class75.field1759[var35] = var14 - 1;
				class100.field2317[var13][var14 - 1] = 1;
				class53.field1239[var13][var14 - 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var14 < 103 && class100.field2317[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
				class68.field1600[var35] = var13;
				class75.field1759[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				class100.field2317[var13][var14 + 1] = 4;
				class53.field1239[var13][var14 + 1] = var20;
			}
			if (var13 > 0 && var14 > 0 && class100.field2317[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
				class68.field1600[var35] = var13 - 1;
				class75.field1759[var35] = var14 - 1;
				class100.field2317[var13 - 1][var14 - 1] = 3;
				var35 = (var35 + 1) % var18;
				class53.field1239[var13 - 1][var14 - 1] = var20;
			}
			if (var13 < 103 && var14 > 0 && class100.field2317[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
				class68.field1600[var35] = var13 + 1;
				class75.field1759[var35] = var14 - 1;
				class100.field2317[var13 + 1][var14 - 1] = 9;
				class53.field1239[var13 + 1][var14 - 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var13 > 0 && var14 < 103 && class100.field2317[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
				class68.field1600[var35] = var13 - 1;
				class75.field1759[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				class100.field2317[var13 - 1][var14 + 1] = 6;
				class53.field1239[var13 - 1][var14 + 1] = var20;
			}
			if (var13 < 103 && var14 < 103 && class100.field2317[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
				class68.field1600[var35] = var13 + 1;
				class75.field1759[var35] = var14 + 1;
				class100.field2317[var13 + 1][var14 + 1] = 12;
				var35 = (var35 + 1) % var18;
				class53.field1239[var13 + 1][var14 + 1] = var20;
			}
		}
		class57.field1327 = 0;
		if (!var17) {
			if (!arg0) {
				return false;
			}
			int var21 = 1000;
			int var22 = 100;
			for (int var23 = arg5 - 10; var23 <= arg5 + 10; var23++) {
				for (int var24 = arg8 - 10; var24 <= arg8 + 10; var24++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class53.field1239[var23][var24] < 100) {
						int var25 = 0;
						if (var24 < arg8) {
							var25 = arg8 - var24;
						} else if (var24 > arg4 + arg8 - 1) {
							var25 = var24 + 1 - arg8 - arg4;
						}
						int var26 = 0;
						if (var23 < arg5) {
							var26 = arg5 - var23;
						} else if (var23 > arg5 + arg9 - 1) {
							var26 = var23 + 1 - arg9 - arg5;
						}
						int var27 = var25 * var25 + var26 * var26;
						if (var21 > var27 || var27 == var21 && var22 > class53.field1239[var23][var24]) {
							var13 = var23;
							var14 = var24;
							var21 = var27;
							var22 = class53.field1239[var23][var24];
						}
					}
				}
			}
			if (var21 == 1000) {
				return false;
			}
			if (var13 == arg6 && var14 == arg2) {
				return false;
			}
			class57.field1327 = 1;
		}
		byte var28 = 0;
		class68.field1600[0] = var13;
		int var36 = var28 + 1;
		class75.field1759[0] = var14;
		int var29;
		int var30 = var29 = class100.field2317[var13][var14];
		while (var13 != arg6 || var14 != arg2) {
			if (var29 != var30) {
				var29 = var30;
				class68.field1600[var36] = var13;
				class75.field1759[var36++] = var14;
			}
			if ((var30 & 0x2) != 0) {
				var13++;
			} else if ((var30 & 0x8) != 0) {
				var13--;
			}
			if ((var30 & 0x1) != 0) {
				var14++;
			} else if ((var30 & 0x4) != 0) {
				var14--;
			}
			var30 = class100.field2317[var13][var14];
		}
		if (var36 > 0) {
			int var31 = var36--;
			int var32 = class75.field1759[var36];
			int var33 = class68.field1600[var36];
			if (var31 > 25) {
				var31 = 25;
			}
			if (arg10 == 0) {
				class44.field1026.method356(184);
				class44.field1026.method514(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				class44.field1026.method356(24);
				class44.field1026.method514(var31 + var31 + 17);
			}
			if (arg10 == 2) {
				class44.field1026.method356(110);
				class44.field1026.method514(var31 + var31 + 3);
			}
			class44.field1026.method504(var33 + class72.field1700);
			class45.field1066 = class68.field1600[0];
			class31.field615 = class75.field1759[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				class44.field1026.method533(class68.field1600[var36] - var33);
				class44.field1026.method506(class75.field1759[var36] - var32);
			}
			class44.field1026.method533(class107.field2540[82] ? 1 : 0);
			class44.field1026.method513(var32 + class118.field2836);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	public class94(int[] arg0) {
		int var2;
		for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
		}
		this.field2171 = new int[var2 + var2];
		for (int var3 = 0; var3 < var2 + var2; var3++) {
			this.field2171[var3] = -1;
		}
		int var4 = 0;
		while (var4 < arg0.length) {
			int var5;
			for (var5 = arg0[var4] & var2 - 1; this.field2171[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
			}
			this.field2171[var5 + var5] = arg0[var4];
			this.field2171[var5 + var5 + 1] = var4++;
		}
	}

	@ObfuscatedName("nd.a(BI)I")
	public int method743(int arg0) {
		int var2 = this.field2171.length - 2;
		int var3 = arg0 << 1 & var2;
		while (true) {
			int var4 = this.field2171[var3];
			if (var4 == arg0) {
				return this.field2171[var3 + 1];
			}
			if (var4 == -1) {
				return -1;
			}
			var3 = var3 + 2 & var2;
		}
	}
}
