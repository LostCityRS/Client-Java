package deob;

@ObfuscatedName("gd")
public final class class46 {

	@ObfuscatedName("gd.a")
	public final int field1078;

	@ObfuscatedName("gd.b")
	public final int field1079;

	@ObfuscatedName("gd.c")
	public final int[] field1080;

	@ObfuscatedName("gd.d")
	public static int[][] field1081 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	@ObfuscatedName("gd.e")
	public static int[] field1082 = new int[6];

	@ObfuscatedName("gd.f")
	public final int[] field1083;

	@ObfuscatedName("gd.g")
	public static int[] field1084 = new int[6];

	@ObfuscatedName("gd.h")
	public final int[] field1085;

	@ObfuscatedName("gd.i")
	public int[] field1086;

	@ObfuscatedName("gd.j")
	public boolean field1087 = true;

	@ObfuscatedName("gd.k")
	public final int[] field1088;

	@ObfuscatedName("gd.l")
	public final int[] field1089;

	@ObfuscatedName("gd.m")
	public final int field1090;

	@ObfuscatedName("gd.n")
	public static int[] field1091 = new int[6];

	@ObfuscatedName("gd.o")
	public final int[] field1092;

	@ObfuscatedName("gd.p")
	public static int[] field1093 = new int[6];

	@ObfuscatedName("gd.q")
	public static int[] field1094 = new int[6];

	@ObfuscatedName("gd.r")
	public final int field1095;

	@ObfuscatedName("gd.s")
	public final int[] field1096;

	@ObfuscatedName("gd.t")
	public static int[][] field1097 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("gd.u")
	public final int[] field1098;

	@ObfuscatedName("gd.v")
	public final int[] field1099;

	@ObfuscatedName("gd.a()V")
	public static void method348() {
		field1082 = null;
		field1094 = null;
		field1084 = null;
		field1093 = null;
		field1091 = null;
		field1097 = null;
		field1081 = null;
	}

	public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.field1087 = false;
		}
		this.field1090 = arg0;
		this.field1078 = arg1;
		this.field1079 = arg17;
		this.field1095 = arg18;
		int[] var20 = field1097[arg0];
		int var21 = var20.length;
		this.field1089 = new int[var21];
		this.field1083 = new int[var21];
		this.field1098 = new int[var21];
		int[] var22 = new int[var21];
		int[] var23 = new int[var21];
		int var24 = arg3 * 128;
		int var25 = arg4 * 128;
		for (int var26 = 0; var26 < var21; var26++) {
			int var27 = var20[var26];
			if ((var27 & 0x1) == 0 && var27 <= 8) {
				var27 = (var27 - arg1 - arg1 - 1 & 0x7) + 1;
			}
			if (var27 > 8 && var27 <= 12) {
				var27 = (var27 - arg1 - 9 & 0x3) + 9;
			}
			if (var27 > 12 && var27 <= 16) {
				var27 = (var27 - arg1 - 13 & 0x3) + 13;
			}
			int var28;
			int var29;
			int var30;
			int var31;
			int var32;
			if (var27 == 1) {
				var28 = var24;
				var29 = var25;
				var30 = arg5;
				var31 = arg9;
				var32 = arg13;
			} else if (var27 == 2) {
				var28 = var24 + 64;
				var29 = var25;
				var30 = arg5 + arg6 >> 1;
				var31 = arg9 + arg10 >> 1;
				var32 = arg13 + arg14 >> 1;
			} else if (var27 == 3) {
				var28 = var24 + 128;
				var29 = var25;
				var30 = arg6;
				var31 = arg10;
				var32 = arg14;
			} else if (var27 == 4) {
				var28 = var24 + 128;
				var29 = var25 + 64;
				var30 = arg6 + arg7 >> 1;
				var31 = arg10 + arg11 >> 1;
				var32 = arg14 + arg15 >> 1;
			} else if (var27 == 5) {
				var28 = var24 + 128;
				var29 = var25 + 128;
				var30 = arg7;
				var31 = arg11;
				var32 = arg15;
			} else if (var27 == 6) {
				var28 = var24 + 64;
				var29 = var25 + 128;
				var30 = arg7 + arg8 >> 1;
				var31 = arg11 + arg12 >> 1;
				var32 = arg15 + arg16 >> 1;
			} else if (var27 == 7) {
				var28 = var24;
				var29 = var25 + 128;
				var30 = arg8;
				var31 = arg12;
				var32 = arg16;
			} else if (var27 == 8) {
				var28 = var24;
				var29 = var25 + 64;
				var30 = arg8 + arg5 >> 1;
				var31 = arg12 + arg9 >> 1;
				var32 = arg16 + arg13 >> 1;
			} else if (var27 == 9) {
				var28 = var24 + 64;
				var29 = var25 + 32;
				var30 = arg5 + arg6 >> 1;
				var31 = arg9 + arg10 >> 1;
				var32 = arg13 + arg14 >> 1;
			} else if (var27 == 10) {
				var28 = var24 + 96;
				var29 = var25 + 64;
				var30 = arg6 + arg7 >> 1;
				var31 = arg10 + arg11 >> 1;
				var32 = arg14 + arg15 >> 1;
			} else if (var27 == 11) {
				var28 = var24 + 64;
				var29 = var25 + 96;
				var30 = arg7 + arg8 >> 1;
				var31 = arg11 + arg12 >> 1;
				var32 = arg15 + arg16 >> 1;
			} else if (var27 == 12) {
				var28 = var24 + 32;
				var29 = var25 + 64;
				var30 = arg8 + arg5 >> 1;
				var31 = arg12 + arg9 >> 1;
				var32 = arg16 + arg13 >> 1;
			} else if (var27 == 13) {
				var28 = var24 + 32;
				var29 = var25 + 32;
				var30 = arg5;
				var31 = arg9;
				var32 = arg13;
			} else if (var27 == 14) {
				var28 = var24 + 96;
				var29 = var25 + 32;
				var30 = arg6;
				var31 = arg10;
				var32 = arg14;
			} else if (var27 == 15) {
				var28 = var24 + 96;
				var29 = var25 + 96;
				var30 = arg7;
				var31 = arg11;
				var32 = arg15;
			} else {
				var28 = var24 + 32;
				var29 = var25 + 96;
				var30 = arg8;
				var31 = arg12;
				var32 = arg16;
			}
			this.field1089[var26] = var28;
			this.field1083[var26] = var30;
			this.field1098[var26] = var29;
			var22[var26] = var31;
			var23[var26] = var32;
		}
		int[] var33 = field1081[arg0];
		int var34 = var33.length / 4;
		this.field1096 = new int[var34];
		this.field1099 = new int[var34];
		this.field1080 = new int[var34];
		this.field1088 = new int[var34];
		this.field1085 = new int[var34];
		this.field1092 = new int[var34];
		if (arg2 != -1) {
			this.field1086 = new int[var34];
		}
		int var35 = 0;
		for (int var36 = 0; var36 < var34; var36++) {
			int var37 = var33[var35];
			int var38 = var33[var35 + 1];
			int var39 = var33[var35 + 2];
			int var40 = var33[var35 + 3];
			var35 += 4;
			if (var38 < 4) {
				var38 = var38 - arg1 & 0x3;
			}
			if (var39 < 4) {
				var39 = var39 - arg1 & 0x3;
			}
			if (var40 < 4) {
				var40 = var40 - arg1 & 0x3;
			}
			this.field1096[var36] = var38;
			this.field1099[var36] = var39;
			this.field1080[var36] = var40;
			if (var37 == 0) {
				this.field1088[var36] = var22[var38];
				this.field1085[var36] = var22[var39];
				this.field1092[var36] = var22[var40];
				if (this.field1086 != null) {
					this.field1086[var36] = -1;
				}
			} else {
				this.field1088[var36] = var23[var38];
				this.field1085[var36] = var23[var39];
				this.field1092[var36] = var23[var40];
				if (this.field1086 != null) {
					this.field1086[var36] = arg2;
				}
			}
		}
		int var41 = arg5;
		int var42 = arg6;
		if (arg6 < arg5) {
			var41 = arg6;
		}
		if (arg6 > arg6) {
			var42 = arg6;
		}
		if (arg7 < var41) {
			var41 = arg7;
		}
		if (arg7 > arg6) {
			var42 = arg7;
		}
		if (arg8 < var41) {
			;
		}
		if (arg8 > var42) {
			;
		}
	}
}
