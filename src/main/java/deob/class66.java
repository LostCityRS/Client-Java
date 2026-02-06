package deob;

import java.math.BigInteger;

@ObfuscatedName("jd")
public class class66 extends class146 {

	@ObfuscatedName("jd.lb")
	public int field1568;

	@ObfuscatedName("jd.mb")
	public static long field1569;

	@ObfuscatedName("jd.nb")
	public static int field1570 = 0;

	@ObfuscatedName("jd.wb")
	public static int field1579 = 0;

	@ObfuscatedName("jd.L")
	public static class32 field1542 = class73.method593("blinken1:", true);

	@ObfuscatedName("jd.x")
	public static class32 field1528 = class73.method593("Loading config )2 ", true);

	@ObfuscatedName("jd.W")
	public static short[] field1553 = new short[] { 960, 957, -21568, -21571, 22464 };

	@ObfuscatedName("jd.V")
	public static class32 field1552 = field1528;

	@ObfuscatedName("jd.Cb")
	public static int field1585 = 0;

	@ObfuscatedName("jd.Gb")
	public static int field1589 = 0;

	@ObfuscatedName("jd.Db")
	public byte[] field1586;

	@ObfuscatedName("jd.B")
	public static class44 field1532;

	@ObfuscatedName("jd.d(I)V")
	public static void method508() {
		field1552 = null;
		field1528 = null;
		field1542 = null;
		field1532 = null;
		field1553 = null;
	}

	@ObfuscatedName("jd.a(IILvd;IIILqf;III)V")
	public static void method537(int arg0, int arg1, class150 arg2, int arg3, int arg4, int arg5, class117 arg6, int arg7, int arg8) {
		class53 var9 = class5.method22(arg0);
		int var10;
		int var11;
		if (arg8 == 1 || arg8 == 3) {
			var10 = var9.field1222;
			var11 = var9.field1233;
		} else {
			var11 = var9.field1222;
			var10 = var9.field1233;
		}
		int var12;
		int var13;
		if (arg5 + var11 <= 104) {
			var12 = (var11 + 1 >> 1) + arg5;
			var13 = (var11 >> 1) + arg5;
		} else {
			var12 = arg5 + 1;
			var13 = arg5;
		}
		int var14;
		int var15;
		if (var10 + arg3 > 104) {
			var14 = arg3 + 1;
			var15 = arg3;
		} else {
			var15 = arg3 + (var10 >> 1);
			var14 = (var10 + 1 >> 1) + arg3;
		}
		int[][] var16 = class70.field1630[arg4];
		int var17 = var16[var12][var14] + var16[var12][var15] + var16[var13][var15] + var16[var13][var14] >> 2;
		int var18 = (var10 << 6) + (arg3 << 7);
		int var19 = (var11 << 6) + (arg5 << 7);
		int var20 = (arg0 << 14) + (arg3 << 7) + arg5 + 1073741824;
		if (var9.field1193 == 0) {
			var20 += Integer.MIN_VALUE;
		}
		int var21 = (arg8 << 6) + arg1;
		if (var9.field1252 == 1) {
			var21 += 256;
		}
		if (arg1 == 22) {
			class26 var22;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var22 = var9.method412(var19, 22, var18, var16, arg8, var17);
			} else {
				var22 = new class106(arg0, 22, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1138(arg7, arg5, arg3, var17, var22, var20, var21);
			if (var9.field1235 == 1) {
				arg6.method931(arg5, arg3);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			class26 var23;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var23 = var9.method412(var19, 10, var18, var16, arg8, var17);
			} else {
				var23 = new class106(arg0, 10, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			if (var23 != null) {
				arg2.method1151(arg7, arg5, arg3, var17, var11, var10, var23, arg1 == 11 ? 256 : 0, var20, var21);
			}
			if (var9.field1235 != 0) {
				arg6.method914(var10, var9.field1219, arg5, arg3, var11);
			}
		} else if (arg1 >= 12) {
			class26 var24;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var24 = var9.method412(var19, arg1, var18, var16, arg8, var17);
			} else {
				var24 = new class106(arg0, arg1, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1151(arg7, arg5, arg3, var17, 1, 1, var24, 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method914(var10, var9.field1219, arg5, arg3, var11);
			}
		} else if (arg1 == 0) {
			class26 var25;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var25 = var9.method412(var19, 0, var18, var16, arg8, var17);
			} else {
				var25 = new class106(arg0, 0, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var25, null, class137.field3176[arg8], 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 1) {
			class26 var26;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var26 = var9.method412(var19, 1, var18, var16, arg8, var17);
			} else {
				var26 = new class106(arg0, 1, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var26, null, class121.field2877[arg8], 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 2) {
			int var27 = arg8 + 1 & 0x3;
			class26 var28;
			class26 var29;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var28 = var9.method412(var19, 2, var18, var16, arg8 + 4, var17);
				var29 = var9.method412(var19, 2, var18, var16, var27, var17);
			} else {
				var28 = new class106(arg0, 2, arg8 + 4, arg4, arg5, arg3, var9.field1225, true, null);
				var29 = new class106(arg0, 2, var27, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var28, var29, class137.field3176[arg8], class137.field3176[var27], var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 3) {
			class26 var30;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var30 = var9.method412(var19, 3, var18, var16, arg8, var17);
			} else {
				var30 = new class106(arg0, 3, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1117(arg7, arg5, arg3, var17, var30, null, class121.field2877[arg8], 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method920(var9.field1219, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 9) {
			class26 var31;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var31 = var9.method412(var19, arg1, var18, var16, arg8, var17);
			} else {
				var31 = new class106(arg0, arg1, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1151(arg7, arg5, arg3, var17, 1, 1, var31, 0, var20, var21);
			if (var9.field1235 != 0) {
				arg6.method914(var10, var9.field1219, arg5, arg3, var11);
			}
		} else if (arg1 == 4) {
			class26 var32;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var32 = var9.method412(var19, 4, var18, var16, arg8, var17);
			} else {
				var32 = new class106(arg0, 4, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var32, null, class137.field3176[arg8], 0, 0, 0, var20, var21);
		} else if (arg1 == 5) {
			int var33 = arg2.method1153(arg7, arg5, arg3);
			int var34 = 16;
			if (var33 != 0) {
				var34 = class5.method22(var33 >> 14 & 0x7FFF).field1245;
			}
			class26 var35;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var35 = var9.method412(var19, 4, var18, var16, arg8, var17);
			} else {
				var35 = new class106(arg0, 4, arg8, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var35, null, class137.field3176[arg8], 0, var34 * class129.field2974[arg8], var34 * class83.field1927[arg8], var20, var21);
		} else if (arg1 == 6) {
			int var36 = 8;
			int var37 = arg2.method1153(arg7, arg5, arg3);
			if (var37 != 0) {
				var36 = class5.method22(var37 >> 14 & 0x7FFF).field1245 / 2;
			}
			class26 var38;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var38 = var9.method412(var19, 4, var18, var16, arg8 + 4, var17);
			} else {
				var38 = new class106(arg0, 4, arg8 + 4, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var38, null, 256, arg8, class143.field3279[arg8] * var36, var36 * class41.field955[arg8], var20, var21);
		} else if (arg1 == 7) {
			int var39 = arg8 + 2 & 0x3;
			class26 var40;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var40 = var9.method412(var19, 4, var18, var16, var39 + 4, var17);
			} else {
				var40 = new class106(arg0, 4, var39 + 4, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var40, null, 256, var39, 0, 0, var20, var21);
		} else if (arg1 == 8) {
			int var41 = 8;
			int var42 = arg2.method1153(arg7, arg5, arg3);
			if (var42 != 0) {
				var41 = class5.method22(var42 >> 14 & 0x7FFF).field1245 / 2;
			}
			int var43 = arg8 + 2 & 0x3;
			class26 var44;
			class26 var45;
			if (var9.field1225 == -1 && var9.field1251 == null) {
				var44 = var9.method412(var19, 4, var18, var16, arg8 + 4, var17);
				var45 = var9.method412(var19, 4, var18, var16, var43 + 4, var17);
			} else {
				var44 = new class106(arg0, 4, arg8 + 4, arg4, arg5, arg3, var9.field1225, true, null);
				var45 = new class106(arg0, 4, var43 + 4, arg4, arg5, arg3, var9.field1225, true, null);
			}
			arg2.method1158(arg7, arg5, arg3, var17, var44, var45, 256, arg8, var41 * class143.field3279[arg8], var41 * class41.field955[arg8], var20, var21);
		}
	}

	@ObfuscatedName("jd.d(II)V")
	public static void method542(int arg0) {
		if (arg0 == -3) {
			class114.method891(class109.field2556, class133.field3056, class115.field2763);
		} else if (arg0 == -2) {
			class114.method891(class133.field3063, class133.field3044, class81.field1857);
		} else if (arg0 == -1) {
			class114.method891(class64.field1490, class133.field3058, class115.field2772);
		} else if (arg0 == 3) {
			class114.method891(class133.field3078, class133.field3084, class30.field539);
		} else if (arg0 == 4) {
			class114.method891(class4.field58, class133.field3093, class19.field359);
		} else if (arg0 == 5) {
			class114.method891(class149.field3369, class133.field3038, class133.field3088);
		} else if (arg0 == 6) {
			class114.method891(class61.field1364, class133.field3100, class36.field857);
		} else if (arg0 == 7) {
			class114.method891(class133.field3048, class133.field3101, class4.field63);
		} else if (arg0 == 8) {
			class114.method891(class145.field3302, class133.field3092, class52.field1176);
		} else if (arg0 == 9) {
			class114.method891(class53.field1234, class133.field3066, class125.field2906);
		} else if (arg0 == 10) {
			class114.method891(class145.field3296, class133.field3097, class133.field3075);
		} else if (arg0 == 11) {
			class114.method891(class29.field531, class133.field3098, class81.field1876);
		} else if (arg0 == 12) {
			class114.method891(class38.field915, class133.field3069, class82.field1916);
		} else if (arg0 == 13) {
			class114.method891(class156.field3561, class133.field3042, class115.field2771);
		} else if (arg0 == 14) {
			class114.method891(class77.field1809, class133.field3107, class28.field509);
		} else if (arg0 == 16) {
			class114.method891(class65.field1514, class133.field3057, class1.field12);
		} else if (arg0 == 17) {
			class114.method891(class97.field2239, class133.field3106, class156.field3563);
		} else if (arg0 == 18) {
			class114.method891(class85.field1998, class133.field3080, class64.field1484);
		} else if (arg0 == 19) {
			class114.method891(class68.field1595, class4.field62, class140.field3215);
		} else if (arg0 == 20) {
			class114.method891(class147.field3348, class133.field3085, class115.field2766);
		} else if (arg0 == 22) {
			class114.method891(class74.field1753, class133.field3099, class97.field2236);
		} else if (arg0 == 23) {
			class114.method891(class68.field1598, class133.field3091, class28.field508);
		} else if (arg0 == 24) {
			class114.method891(class88.field2043, class133.field3050, class103.field2402);
		} else if (arg0 == 25) {
			class114.method891(class92.field2115, class133.field3043, class115.field2769);
		} else if (arg0 == 26) {
			class114.method891(class54.field1275, class133.field3068, class130.field3003);
		} else if (arg0 == 27) {
			class114.method891(class133.field3041, class133.field3049, class86.field2015);
		} else {
			class114.method891(class109.field2570, class133.field3046, class115.field2770);
		}
		class54.method425(10);
	}

	public class66(int arg0) {
		this.field1586 = class112.method884(arg0);
		this.field1568 = 0;
	}

	public class66(byte[] arg0) {
		this.field1586 = arg0;
		this.field1568 = 0;
	}

	@ObfuscatedName("jd.b(II)V")
	public final void method504(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 + 128);
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("jd.a(Z)I")
	public final int method505() {
		int var1 = this.field1586[this.field1568] & 0xFF;
		return var1 < 128 ? this.method532() : this.method531() - 32768;
	}

	@ObfuscatedName("jd.a(BI)V")
	public final void method506(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("jd.a(B)Lec;")
	public final class32 method507() {
		if (this.field1586[this.field1568] == 0) {
			this.field1568++;
			return null;
		} else {
			return this.method555();
		}
	}

	@ObfuscatedName("jd.e(I)I")
	public final int method509() {
		this.field1568 += 4;
		return (this.field1586[this.field1568 - 2] & 0xFF) + ((this.field1586[this.field1568 - 3] & 0xFF) << 24) + ((this.field1586[this.field1568 + -4] & 0xFF) << 16) + ((this.field1586[this.field1568 + -1] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.f(I)I")
	public final int method510() {
		byte var1 = this.field1586[this.field1568++];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.field1586[this.field1568++];
		}
		return var1 | var2;
	}

	@ObfuscatedName("jd.g(I)B")
	public final byte method511() {
		return (byte) (128 - this.field1586[this.field1568++]);
	}

	@ObfuscatedName("jd.a(IJ)V")
	public final void method512(long arg0) {
		this.method526((int) (arg0 >> 32));
		this.method526((int) arg0);
	}

	@ObfuscatedName("jd.a(IB)V")
	public final void method513(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) arg0;
	}

	@ObfuscatedName("jd.b(BI)V")
	public final void method514(int arg0) {
		this.field1586[this.field1568++] = (byte) arg0;
	}

	@ObfuscatedName("jd.a(IZ)V")
	public final void method515(int arg0) {
		this.field1586[this.field1568 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jd.h(I)I")
	public final int method516() {
		int var1 = this.field1586[this.field1568] & 0xFF;
		return var1 >= 128 ? this.method531() - 49152 : this.method532() + -64;
	}

	@ObfuscatedName("jd.b(B)I")
	public final int method517() {
		this.field1568 += 3;
		return (this.field1586[this.field1568 - 1] & 0xFF) + ((this.field1586[this.field1568 - 3] & 0xFF) << 16) + ((this.field1586[this.field1568 + -2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.b(Z)I")
	public final int method518() {
		this.field1568 += 2;
		return (this.field1586[this.field1568 - 1] - 128 & 0xFF) + ((this.field1586[this.field1568 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.c(B)I")
	public final int method519() {
		this.field1568 += 2;
		return ((this.field1586[this.field1568 - 1] & 0xFF) << 8) + (this.field1586[this.field1568 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("jd.i(I)I")
	public final int method520() {
		return this.field1586[this.field1568++] - 128 & 0xFF;
	}

	@ObfuscatedName("jd.a(Lec;B)V")
	public final void method521(class32 arg0) {
		this.field1568 += arg0.method235(this.field1568, arg0.method240(), this.field1586);
		this.field1586[this.field1568++] = 0;
	}

	@ObfuscatedName("jd.c(BI)I")
	public final int method522(int arg0) {
		int var2 = class144.method1080(this.field1568, arg0, this.field1586);
		this.method530(var2);
		return var2;
	}

	@ObfuscatedName("jd.a(III[I)V")
	public final void method523(int arg0, int[] arg1) {
		int var3 = this.field1568;
		this.field1568 = 5;
		int var4 = (arg0 - 5) / 8;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = this.method538();
			int var7 = -957401312;
			int var8 = this.method538();
			int var9 = 32;
			while (var9-- > 0) {
				var8 -= var7 + arg1[var7 >>> 11 & 0x3] ^ (var6 >>> 5 ^ var6 << 4) - -var6;
				var7 -= -1640531527;
				var6 -= var7 + arg1[var7 & 0x3] ^ (var8 >>> 5 ^ var8 << 4) + var8;
			}
			this.field1568 -= 8;
			this.method530(var6);
			this.method530(var8);
		}
		this.field1568 = var3;
	}

	@ObfuscatedName("jd.d(B)I")
	public final int method524() {
		this.field1568 += 2;
		return ((this.field1586[this.field1568 - 1] & 0xFF) << 8) + (this.field1586[this.field1568 - 2] & 0xFF);
	}

	@ObfuscatedName("jd.j(I)I")
	public final int method525() {
		this.field1568 += 4;
		return ((this.field1586[this.field1568 - 3] & 0xFF) << 8) + (this.field1586[this.field1568 - 2] << 16 & 0xFF0000) + ((this.field1586[this.field1568 + -1] & 0xFF) << 24) + (this.field1586[this.field1568 - 4] & 0xFF);
	}

	@ObfuscatedName("jd.c(II)V")
	public final void method526(int arg0) {
		this.field1586[this.field1568++] = (byte) arg0;
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) (arg0 >> 16);
		this.field1586[this.field1568++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("jd.k(I)J")
	public final long method527() {
		long var1 = (long) this.method538() & 0xFFFFFFFFL;
		long var3 = (long) this.method538() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("jd.l(I)I")
	public final int method528() {
		this.field1568 += 2;
		int var1 = (this.field1586[this.field1568 - 1] - 128 & 0xFF) + ((this.field1586[this.field1568 - 2] & 0xFF) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("jd.e(B)I")
	public final int method529() {
		return -this.field1586[this.field1568++] & 0xFF;
	}

	@ObfuscatedName("jd.a(ZI)V")
	public final void method530(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 24);
		this.field1586[this.field1568++] = (byte) (arg0 >> 16);
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) arg0;
	}

	@ObfuscatedName("jd.m(I)I")
	public final int method531() {
		this.field1568 += 2;
		return (this.field1586[this.field1568 - 1] & 0xFF) + ((this.field1586[this.field1568 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.n(I)I")
	public final int method532() {
		return this.field1586[this.field1568++] & 0xFF;
	}

	@ObfuscatedName("jd.b(IZ)V")
	public final void method533(int arg0) {
		this.field1586[this.field1568++] = (byte) -arg0;
	}

	@ObfuscatedName("jd.o(I)B")
	public final byte method534() {
		return (byte) -this.field1586[this.field1568++];
	}

	@ObfuscatedName("jd.p(I)I")
	public final int method535() {
		return 128 - this.field1586[this.field1568++] & 0xFF;
	}

	@ObfuscatedName("jd.q(I)B")
	public final byte method536() {
		return (byte) (this.field1586[this.field1568++] - 128);
	}

	@ObfuscatedName("jd.c(Z)I")
	public final int method538() {
		this.field1568 += 4;
		return (this.field1586[this.field1568 - 1] & 0xFF) + ((this.field1586[this.field1568 - 3] & 0xFF) << 16) + ((this.field1586[this.field1568 + -4] & 0xFF) << 24) + ((this.field1586[this.field1568 + -2] & 0xFF) << 8);
	}

	@ObfuscatedName("jd.a([BIBI)V")
	public final void method539(byte[] arg0, int arg1) {
		for (int var3 = arg1 - 1; var3 >= 0; var3--) {
			arg0[var3] = this.field1586[this.field1568++];
		}
	}

	@ObfuscatedName("jd.c(IZ)V")
	public final void method540(int arg0) {
		this.field1586[this.field1568 - arg0 - 4] = (byte) (arg0 >> 24);
		this.field1586[this.field1568 - arg0 - 3] = (byte) (arg0 >> 16);
		this.field1586[this.field1568 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field1586[this.field1568 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jd.a(JB)V")
	public final void method541(long arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 56);
		this.field1586[this.field1568++] = (byte) (arg0 >> 48);
		this.field1586[this.field1568++] = (byte) (arg0 >> 40);
		this.field1586[this.field1568++] = (byte) (arg0 >> 32);
		this.field1586[this.field1568++] = (byte) (arg0 >> 24);
		this.field1586[this.field1568++] = (byte) (arg0 >> 16);
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) arg0;
	}

	@ObfuscatedName("jd.a(III[B)V")
	public final void method543(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field1586[this.field1568++] = arg1[var3];
		}
	}

	@ObfuscatedName("jd.f(B)B")
	public final byte method544() {
		return this.field1586[this.field1568++];
	}

	@ObfuscatedName("jd.e(II)V")
	public final void method545(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method514(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method513(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("jd.f(II)V")
	public final void method546(int arg0) {
		this.field1586[this.field1568++] = (byte) arg0;
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("jd.b(IB)V")
	public final void method547(int arg0) {
		this.field1586[this.field1568++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("jd.g(II)V")
	public final void method548(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("jd.g(B)I")
	public final int method549() {
		this.field1568 += 4;
		return (this.field1586[this.field1568 - 3] & 0xFF) + (((this.field1586[this.field1568 - 2] & 0xFF) << 24) - (-((this.field1586[this.field1568 - 1] & 0xFF) << 16) - ((this.field1586[this.field1568 - 4] & 0xFF) << 8)));
	}

	@ObfuscatedName("jd.h(II)V")
	public final void method550(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 16);
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) arg0;
	}

	@ObfuscatedName("jd.d(Z)I")
	public final int method551() {
		this.field1568 += 2;
		int var1 = ((this.field1586[this.field1568 - 2] & 0xFF) << 8) + (this.field1586[this.field1568 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("jd.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method552(BigInteger arg0, BigInteger arg1) {
		int var3 = this.field1568;
		this.field1568 = 0;
		byte[] var4 = new byte[var3];
		this.method557(var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		this.field1568 = 0;
		this.method514(var7.length);
		this.method543(var7.length, var7);
	}

	@ObfuscatedName("jd.i(II)V")
	public final void method553(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 16);
		this.field1586[this.field1568++] = (byte) (arg0 >> 24);
		this.field1586[this.field1568++] = (byte) arg0;
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("jd.d(IZ)V")
	public final void method554(int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method514(arg0 >>> 28 | 0x80);
					}
					this.method514(arg0 >>> 21 | 0x80);
				}
				this.method514(arg0 >>> 14 | 0x80);
			}
			this.method514(arg0 >>> 7 | 0x80);
		}
		this.method514(arg0 & 0x7F);
	}

	@ObfuscatedName("jd.r(I)Lec;")
	public final class32 method555() {
		int var1 = this.field1568;
		while (this.field1586[this.field1568++] != 0) {
		}
		return class26.method186(this.field1586, var1, this.field1568 - var1 - 1);
	}

	@ObfuscatedName("jd.c(IB)V")
	public final void method556(int arg0) {
		this.field1586[this.field1568++] = (byte) (arg0 >> 8);
		this.field1586[this.field1568++] = (byte) arg0;
		this.field1586[this.field1568++] = (byte) (arg0 >> 24);
		this.field1586[this.field1568++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("jd.a(IIZ[B)V")
	public final void method557(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = this.field1586[this.field1568++];
		}
	}
}
