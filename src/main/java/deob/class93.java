package deob;

@ObfuscatedName("nc")
public final class class93 extends class146 {

	@ObfuscatedName("nc.r")
	public byte[][] field2126;

	@ObfuscatedName("nc.s")
	public int field2127;

	@ObfuscatedName("nc.t")
	public static class76[] field2128;

	@ObfuscatedName("nc.u")
	public static int[] field2129;

	@ObfuscatedName("nc.v")
	public int field2130;

	@ObfuscatedName("nc.w")
	public static float[] field2131;

	@ObfuscatedName("nc.M")
	public static boolean field2147 = false;

	@ObfuscatedName("nc.C")
	public int field2137;

	@ObfuscatedName("nc.D")
	public int field2138;

	@ObfuscatedName("nc.E")
	public int field2139;

	@ObfuscatedName("nc.I")
	public static int field2143;

	@ObfuscatedName("nc.J")
	public int field2144;

	@ObfuscatedName("nc.L")
	public static int field2146;

	@ObfuscatedName("nc.R")
	public int field2152;

	@ObfuscatedName("nc.S")
	public static int field2153;

	@ObfuscatedName("nc.T")
	public int field2154;

	@ObfuscatedName("nc.Y")
	public static int field2159;

	@ObfuscatedName("nc.y")
	public boolean field2133;

	@ObfuscatedName("nc.A")
	public boolean field2135;

	@ObfuscatedName("nc.U")
	public static byte[] field2155;

	@ObfuscatedName("nc.W")
	public byte[] field2157;

	@ObfuscatedName("nc.B")
	public float[] field2136;

	@ObfuscatedName("nc.F")
	public static float[] field2140;

	@ObfuscatedName("nc.G")
	public static float[] field2141;

	@ObfuscatedName("nc.H")
	public static float[] field2142;

	@ObfuscatedName("nc.O")
	public static float[] field2149;

	@ObfuscatedName("nc.P")
	public static float[] field2150;

	@ObfuscatedName("nc.X")
	public static float[] field2158;

	@ObfuscatedName("nc.z")
	public static int[] field2134;

	@ObfuscatedName("nc.V")
	public static int[] field2156;

	@ObfuscatedName("nc.x")
	public static class138[] field2132;

	@ObfuscatedName("nc.K")
	public static class155[] field2145;

	@ObfuscatedName("nc.N")
	public static class35[] field2148;

	@ObfuscatedName("nc.Q")
	public static boolean[] field2151;

	@ObfuscatedName("nc.b([B)V")
	public static void method729(byte[] arg0) {
		method735(arg0);
		field2153 = 0x1 << method738(4);
		field2146 = 0x1 << method738(4);
		field2140 = new float[field2146];
		for (int var1 = 0; var1 < 2; var1++) {
			int var2 = var1 == 0 ? field2153 : field2146;
			int var3 = var2 >> 1;
			int var4 = var2 >> 2;
			int var5 = var2 >> 3;
			float[] var6 = new float[var3];
			for (int var7 = 0; var7 < var4; var7++) {
				var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
				var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
			}
			float[] var8 = new float[var3];
			for (int var9 = 0; var9 < var4; var9++) {
				var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
				var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
			}
			float[] var10 = new float[var4];
			for (int var11 = 0; var11 < var5; var11++) {
				var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
				var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
			}
			int[] var12 = new int[var5];
			int var13 = class147.method1099(var5 - 1);
			for (int var14 = 0; var14 < var5; var14++) {
				var12[var14] = class23.method168(var14, var13);
			}
			if (var1 == 0) {
				field2131 = var6;
				field2141 = var8;
				field2150 = var10;
				field2134 = var12;
			} else {
				field2142 = var6;
				field2158 = var8;
				field2149 = var10;
				field2129 = var12;
			}
		}
		int var15 = method738(8) + 1;
		field2148 = new class35[var15];
		for (int var16 = 0; var16 < var15; var16++) {
			field2148[var16] = new class35();
		}
		int var17 = method738(6) + 1;
		for (int var18 = 0; var18 < var17; var18++) {
			method738(16);
		}
		int var19 = method738(6) + 1;
		field2128 = new class76[var19];
		for (int var20 = 0; var20 < var19; var20++) {
			field2128[var20] = new class76();
		}
		int var21 = method738(6) + 1;
		field2132 = new class138[var21];
		for (int var22 = 0; var22 < var21; var22++) {
			field2132[var22] = new class138();
		}
		int var23 = method738(6) + 1;
		field2145 = new class155[var23];
		for (int var24 = 0; var24 < var23; var24++) {
			field2145[var24] = new class155();
		}
		int var25 = method738(6) + 1;
		field2151 = new boolean[var25];
		field2156 = new int[var25];
		for (int var26 = 0; var26 < var25; var26++) {
			field2151[var26] = method731() != 0;
			method738(16);
			method738(16);
			field2156[var26] = method738(8);
		}
	}

	@ObfuscatedName("nc.a()I")
	public static int method731() {
		int var0 = field2155[field2143] >> field2159 & 0x1;
		field2159++;
		field2143 += field2159 >> 3;
		field2159 &= 0x7;
		return var0;
	}

	@ObfuscatedName("nc.b()V")
	public static void method733() {
		field2155 = null;
		field2148 = null;
		field2128 = null;
		field2132 = null;
		field2145 = null;
		field2151 = null;
		field2156 = null;
		field2140 = null;
		field2131 = null;
		field2141 = null;
		field2150 = null;
		field2142 = null;
		field2158 = null;
		field2149 = null;
		field2134 = null;
		field2129 = null;
	}

	@ObfuscatedName("nc.a(Lea;)Z")
	public static boolean method734(class30 arg0) {
		if (!field2147) {
			byte[] var1 = arg0.method206(0, 0);
			if (var1 == null) {
				return false;
			}
			method729(var1);
			field2147 = true;
		}
		return true;
	}

	@ObfuscatedName("nc.a([BI)V")
	public static void method735(byte[] arg0) {
		field2155 = arg0;
		field2143 = 0;
		field2159 = 0;
	}

	@ObfuscatedName("nc.a(Lea;II)Lnc;")
	public static class93 method736(class30 arg0, int arg1, int arg2) {
		if (method734(arg0)) {
			byte[] var3 = arg0.method206(arg1, arg2);
			return var3 == null ? null : new class93(var3);
		} else {
			arg0.method213(arg1, arg2);
			return null;
		}
	}

	@ObfuscatedName("nc.e(I)F")
	public static float method737(int arg0) {
		int var1 = arg0 & 0x1FFFFF;
		int var2 = arg0 & Integer.MIN_VALUE;
		int var3 = arg0 >> 21 & 0x3FF;
		if (var2 != 0) {
			var1 = -var1;
		}
		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	@ObfuscatedName("nc.f(I)I")
	public static int method738(int arg0) {
		int var1 = 0;
		int var2 = 0;
		while (arg0 >= 8 - field2159) {
			int var3 = 8 - field2159;
			int var4 = (0x1 << var3) - 1;
			var1 += (field2155[field2143] >> field2159 & var4) << var2;
			field2159 = 0;
			field2143++;
			var2 += var3;
			arg0 -= var3;
		}
		if (arg0 > 0) {
			int var5 = (0x1 << arg0) - 1;
			var1 += (field2155[field2143] >> field2159 & var5) << var2;
			field2159 += arg0;
		}
		return var1;
	}

	public class93(byte[] arg0) {
		this.method728(arg0);
	}

	@ObfuscatedName("nc.a([B)V")
	public void method728(byte[] arg0) {
		class66 var2 = new class66(arg0);
		this.field2127 = var2.method538();
		this.field2138 = var2.method538();
		this.field2139 = var2.method538();
		this.field2144 = var2.method538();
		if (this.field2144 < 0) {
			this.field2144 = ~this.field2144;
			this.field2133 = true;
		}
		int var3 = var2.method538();
		this.field2126 = new byte[var3][];
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;
			int var6;
			do {
				var6 = var2.method532();
				var5 += var6;
			} while (var6 >= 255);
			byte[] var7 = new byte[var5];
			var2.method557(var5, var7);
			this.field2126[var4] = var7;
		}
	}

	@ObfuscatedName("nc.d(I)[F")
	public float[] method730(int arg0) {
		method735(this.field2126[arg0]);
		method731();
		int var2 = method738(class147.method1099(field2156.length - 1));
		boolean var3 = field2151[var2];
		int var4 = var3 ? field2146 : field2153;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = method731() != 0;
			var6 = method731() != 0;
		}
		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (field2153 >> 2);
			var9 = (var4 >> 2) + (field2153 >> 2);
			var10 = field2153 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}
		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (field2153 >> 2);
			var12 = var4 + (field2153 >> 2) - (var4 >> 2);
			var13 = field2153 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}
		class155 var14 = field2145[field2156[var2]];
		int var15 = var14.field3554;
		int var16 = var14.field3553[var15];
		boolean var17 = !field2128[var16].method613();
		for (int var18 = 0; var18 < var14.field3552; var18++) {
			class138 var19 = field2132[var14.field3551[var18]];
			float[] var20 = field2140;
			var19.method1042(var20, var4 >> 1, var17);
		}
		if (!var17) {
			int var21 = var14.field3554;
			int var22 = var14.field3553[var21];
			field2128[var22].method606(field2140, var4 >> 1);
		}
		if (var17) {
			for (int var23 = var4 >> 1; var23 < var4; var23++) {
				field2140[var23] = 0.0F;
			}
		} else {
			int var24 = var4 >> 1;
			int var25 = var4 >> 2;
			int var26 = var4 >> 3;
			float[] var27 = field2140;
			for (int var28 = 0; var28 < var24; var28++) {
				var27[var28] *= 0.5F;
			}
			for (int var29 = var24; var29 < var4; var29++) {
				var27[var29] = -var27[var4 - var29 - 1];
			}
			float[] var30 = var3 ? field2142 : field2131;
			float[] var31 = var3 ? field2158 : field2141;
			float[] var32 = var3 ? field2149 : field2150;
			int[] var33 = var3 ? field2129 : field2134;
			for (int var34 = 0; var34 < var25; var34++) {
				float var35 = var27[var34 * 4] - var27[var4 - var34 * 4 - 1];
				float var36 = var27[var34 * 4 + 2] - var27[var4 - var34 * 4 - 3];
				float var37 = var30[var34 * 2];
				float var38 = var30[var34 * 2 + 1];
				var27[var4 - var34 * 4 - 1] = var35 * var37 - var36 * var38;
				var27[var4 - var34 * 4 - 3] = var35 * var38 + var36 * var37;
			}
			for (int var39 = 0; var39 < var26; var39++) {
				float var40 = var27[var24 + var39 * 4 + 3];
				float var41 = var27[var24 + var39 * 4 + 1];
				float var42 = var27[var39 * 4 + 3];
				float var43 = var27[var39 * 4 + 1];
				var27[var24 + var39 * 4 + 3] = var40 + var42;
				var27[var24 + var39 * 4 + 1] = var41 + var43;
				float var44 = var30[var24 - var39 * 4 - 4];
				float var45 = var30[var24 - var39 * 4 - 3];
				var27[var39 * 4 + 3] = (var40 - var42) * var44 - (var41 - var43) * var45;
				var27[var39 * 4 + 1] = (var41 - var43) * var44 + (var40 - var42) * var45;
			}
			int var46 = class147.method1099(var4 - 1);
			for (int var47 = 0; var47 < var46 - 3; var47++) {
				int var48 = var4 >> var47 + 2;
				int var49 = 0x8 << var47;
				for (int var50 = 0; var50 < 0x2 << var47; var50++) {
					int var51 = var4 - var48 * 2 * var50;
					int var52 = var4 - var48 * (var50 * 2 + 1);
					for (int var53 = 0; var53 < var4 >> var47 + 4; var53++) {
						int var54 = var53 * 4;
						float var55 = var27[var51 - var54 - 1];
						float var56 = var27[var51 - var54 - 3];
						float var57 = var27[var52 - var54 - 1];
						float var58 = var27[var52 - var54 - 3];
						var27[var51 - var54 - 1] = var55 + var57;
						var27[var51 - var54 - 3] = var56 + var58;
						float var59 = var30[var53 * var49];
						float var60 = var30[var53 * var49 + 1];
						var27[var52 - var54 - 1] = (var55 - var57) * var59 - (var56 - var58) * var60;
						var27[var52 - var54 - 3] = (var56 - var58) * var59 + (var55 - var57) * var60;
					}
				}
			}
			for (int var61 = 1; var61 < var26 - 1; var61++) {
				int var62 = var33[var61];
				if (var61 < var62) {
					int var63 = var61 * 8;
					int var64 = var62 * 8;
					float var65 = var27[var63 + 1];
					var27[var63 + 1] = var27[var64 + 1];
					var27[var64 + 1] = var65;
					float var66 = var27[var63 + 3];
					var27[var63 + 3] = var27[var64 + 3];
					var27[var64 + 3] = var66;
					float var67 = var27[var63 + 5];
					var27[var63 + 5] = var27[var64 + 5];
					var27[var64 + 5] = var67;
					float var68 = var27[var63 + 7];
					var27[var63 + 7] = var27[var64 + 7];
					var27[var64 + 7] = var68;
				}
			}
			for (int var69 = 0; var69 < var24; var69++) {
				var27[var69] = var27[var69 * 2 + 1];
			}
			for (int var70 = 0; var70 < var26; var70++) {
				var27[var4 - var70 * 2 - 1] = var27[var70 * 4];
				var27[var4 - var70 * 2 - 2] = var27[var70 * 4 + 1];
				var27[var4 - var25 - var70 * 2 - 1] = var27[var70 * 4 + 2];
				var27[var4 - var25 - var70 * 2 - 2] = var27[var70 * 4 + 3];
			}
			for (int var71 = 0; var71 < var26; var71++) {
				float var72 = var32[var71 * 2];
				float var73 = var32[var71 * 2 + 1];
				float var74 = var27[var24 + var71 * 2];
				float var75 = var27[var24 + var71 * 2 + 1];
				float var76 = var27[var4 - var71 * 2 - 2];
				float var77 = var27[var4 - var71 * 2 - 1];
				float var78 = var73 * (var74 - var76) + var72 * (var75 + var77);
				var27[var24 + var71 * 2] = (var74 + var76 + var78) * 0.5F;
				var27[var4 - var71 * 2 - 2] = (var74 + var76 - var78) * 0.5F;
				float var79 = var73 * (var75 + var77) - var72 * (var74 - var76);
				var27[var24 + var71 * 2 + 1] = (var75 + var79 - var77) * 0.5F;
				var27[var4 - var71 * 2 - 1] = (var77 + var79 - var75) * 0.5F;
			}
			for (int var80 = 0; var80 < var25; var80++) {
				var27[var80] = var27[var80 * 2 + var24] * var31[var80 * 2] + var27[var80 * 2 + var24 + 1] * var31[var80 * 2 + 1];
				var27[var24 - var80 - 1] = var27[var80 * 2 + var24] * var31[var80 * 2 + 1] - var27[var80 * 2 + var24 + 1] * var31[var80 * 2];
			}
			for (int var81 = 0; var81 < var25; var81++) {
				var27[var4 + var81 - var25] = -var27[var81];
			}
			for (int var82 = 0; var82 < var25; var82++) {
				var27[var82] = var27[var25 + var82];
			}
			for (int var83 = 0; var83 < var25; var83++) {
				var27[var25 + var83] = -var27[var25 - var83 - 1];
			}
			for (int var84 = 0; var84 < var25; var84++) {
				var27[var24 + var84] = var27[var4 - var84 - 1];
			}
			for (int var85 = var8; var85 < var9; var85++) {
				float var86 = (float) Math.sin(((double) (var85 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
				field2140[var85] *= (float) Math.sin((double) var86 * 1.5707963267948966D * (double) var86);
			}
			for (int var87 = var11; var87 < var12; var87++) {
				float var88 = (float) Math.sin(((double) (var87 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				field2140[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
			}
		}
		float[] var89 = null;
		if (this.field2137 > 0) {
			int var90 = this.field2137 + var4 >> 2;
			var89 = new float[var90];
			if (!this.field2135) {
				for (int var91 = 0; var91 < this.field2130; var91++) {
					int var92 = (this.field2137 >> 1) + var91;
					var89[var91] += this.field2136[var92];
				}
			}
			if (!var17) {
				for (int var93 = var8; var93 < var4 >> 1; var93++) {
					int var94 = var89.length + var93 - (var4 >> 1);
					var89[var94] += field2140[var93];
				}
			}
		}
		float[] var95 = this.field2136;
		this.field2136 = field2140;
		field2140 = var95;
		this.field2137 = var4;
		this.field2130 = var12 - (var4 >> 1);
		this.field2135 = var17;
		return var89;
	}

	@ObfuscatedName("nc.a([I)Lib;")
	public class58 method732(int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.field2157 == null) {
			this.field2137 = 0;
			this.field2136 = new float[field2146];
			this.field2157 = new byte[this.field2138];
			this.field2152 = 0;
			this.field2154 = 0;
		}
		while (this.field2154 < this.field2126.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			float[] var2 = this.method730(this.field2154);
			if (var2 != null) {
				int var3 = this.field2152;
				int var4 = var2.length;
				if (var4 > this.field2138 - var3) {
					var4 = this.field2138 - var3;
				}
				for (int var5 = 0; var5 < var4; var5++) {
					int var6 = (int) (var2[var5] * 128.0F + 128.0F);
					if ((var6 & 0xFFFFFF00) != 0) {
						var6 = ~var6 >> 31;
					}
					this.field2157[var3++] = (byte) (var6 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= var3 - this.field2152;
				}
				this.field2152 = var3;
			}
			this.field2154++;
		}
		this.field2136 = null;
		byte[] var7 = this.field2157;
		this.field2157 = null;
		return new class58(this.field2127, var7, this.field2139, this.field2144, this.field2133);
	}
}
