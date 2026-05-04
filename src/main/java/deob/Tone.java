package deob;

import java.util.Random;

@ObfuscatedName("lc")
public final class Tone {

	@ObfuscatedName("lc.a")
	public Envelope field2232;

	@ObfuscatedName("lc.b")
	public static final int[] field2233 = new int[32768];

	@ObfuscatedName("lc.c")
	public final int[] field2234 = new int[5];

	@ObfuscatedName("lc.d")
	public static final int[] field2235;

	@ObfuscatedName("lc.e")
	public int field2236 = 0;

	@ObfuscatedName("lc.f")
	public Envelope field2237;

	@ObfuscatedName("lc.g")
	public int field2238 = 0;

	@ObfuscatedName("lc.h")
	public int field2239 = 100;

	@ObfuscatedName("lc.i")
	public Filter field2240;

	@ObfuscatedName("lc.j")
	public int field2241 = 500;

	@ObfuscatedName("lc.k")
	public static final int[] field2242;

	@ObfuscatedName("lc.l")
	public Envelope field2243;

	@ObfuscatedName("lc.m")
	public Envelope field2244;

	@ObfuscatedName("lc.n")
	public final int[] field2245 = new int[5];

	@ObfuscatedName("lc.o")
	public final int[] field2246 = new int[5];

	@ObfuscatedName("lc.p")
	public Envelope field2247;

	@ObfuscatedName("lc.q")
	public static final int[] field2248;

	@ObfuscatedName("lc.r")
	public Envelope field2249;

	@ObfuscatedName("lc.s")
	public static final int[] field2250;

	@ObfuscatedName("lc.t")
	public static final int[] field2251;

	@ObfuscatedName("lc.u")
	public static final int[] field2252;

	@ObfuscatedName("lc.v")
	public Envelope field2253;

	@ObfuscatedName("lc.w")
	public static final int[] field2254;

	@ObfuscatedName("lc.x")
	public Envelope field2255;

	@ObfuscatedName("lc.y")
	public Envelope field2256;

	static {
		Random var0 = new Random(0L);
		for (int var1 = 0; var1 < 32768; var1++) {
			field2233[var1] = (var0.nextInt() & 0x2) - 1;
		}
		field2242 = new int[32768];
		for (int var2 = 0; var2 < 32768; var2++) {
			field2242[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		field2235 = new int[220500];
		field2248 = new int[5];
		field2250 = new int[5];
		field2251 = new int[5];
		field2252 = new int[5];
		field2254 = new int[5];
	}

	@ObfuscatedName("lc.a(III)I")
	public int method831(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return field2242[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return field2233[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("lc.a(II)[I")
	public int[] method833(int arg0, int arg1) {
		ArrayUtil.clear(field2235, 0, arg0);
		if (arg1 < 10) {
			return field2235;
		}
		double var3 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field2232.method1561();
		this.field2253.method1561();
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		if (this.field2244 != null) {
			this.field2244.method1561();
			this.field2237.method1561();
			var5 = (int) ((double) (this.field2244.field4386 - this.field2244.field4387) * 32.768D / var3);
			var6 = (int) ((double) this.field2244.field4387 * 32.768D / var3);
		}
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		if (this.field2256 != null) {
			this.field2256.method1561();
			this.field2249.method1561();
			var8 = (int) ((double) (this.field2256.field4386 - this.field2256.field4387) * 32.768D / var3);
			var9 = (int) ((double) this.field2256.field4387 * 32.768D / var3);
		}
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field2246[var11] != 0) {
				field2250[var11] = 0;
				field2254[var11] = (int) ((double) this.field2245[var11] * var3);
				field2252[var11] = (this.field2246[var11] << 14) / 100;
				field2248[var11] = (int) ((double) (this.field2232.field4386 - this.field2232.field4387) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2234[var11]) / var3);
				field2251[var11] = (int) ((double) this.field2232.field4387 * 32.768D / var3);
			}
		}
		for (int var12 = 0; var12 < arg0; var12++) {
			int var13 = this.field2232.method1560(arg0);
			int var14 = this.field2253.method1560(arg0);
			if (this.field2244 != null) {
				int var15 = this.field2244.method1560(arg0);
				int var16 = this.field2237.method1560(arg0);
				var13 += this.method831(var7, var16, this.field2244.field4388) >> 1;
				var7 += (var15 * var5 >> 16) + var6;
			}
			if (this.field2256 != null) {
				int var17 = this.field2256.method1560(arg0);
				int var18 = this.field2249.method1560(arg0);
				var14 = var14 * ((this.method831(var10, var18, this.field2256.field4388) >> 1) + 32768) >> 15;
				var10 += (var17 * var8 >> 16) + var9;
			}
			for (int var19 = 0; var19 < 5; var19++) {
				if (this.field2246[var19] != 0) {
					int var20 = var12 + field2254[var19];
					if (var20 < arg0) {
						field2235[var20] += this.method831(field2250[var19], var14 * field2252[var19] >> 15, this.field2232.field4388);
						field2250[var19] += (var13 * field2248[var19] >> 16) + field2251[var19];
					}
				}
			}
		}
		if (this.field2247 != null) {
			this.field2247.method1561();
			this.field2255.method1561();
			int var21 = 0;
			boolean var22 = true;
			for (int var23 = 0; var23 < arg0; var23++) {
				int var24 = this.field2247.method1560(arg0);
				int var25 = this.field2255.method1560(arg0);
				int var26;
				if (var22) {
					var26 = this.field2247.field4387 + ((this.field2247.field4386 - this.field2247.field4387) * var24 >> 8);
				} else {
					var26 = this.field2247.field4387 + ((this.field2247.field4386 - this.field2247.field4387) * var25 >> 8);
				}
				var21 += 256;
				if (var21 >= var26) {
					var21 = 0;
					var22 = !var22;
				}
				if (var22) {
					field2235[var23] = 0;
				}
			}
		}
		if (this.field2238 > 0 && this.field2239 > 0) {
			int var27 = (int) ((double) this.field2238 * var3);
			for (int var28 = var27; var28 < arg0; var28++) {
				field2235[var28] += field2235[var28 - var27] * this.field2239 / 100;
			}
		}
		if (this.field2240.field3620[0] > 0 || this.field2240.field3620[1] > 0) {
			this.field2243.method1561();
			int var29 = this.field2243.method1560(arg0 + 1);
			int var30 = this.field2240.method1303(0, (float) var29 / 65536.0F);
			int var31 = this.field2240.method1303(1, (float) var29 / 65536.0F);
			if (arg0 >= var30 + var31) {
				int var32 = 0;
				int var33 = var31;
				if (var31 > arg0 - var30) {
					var33 = arg0 - var30;
				}
				while (var32 < var33) {
					int var34 = (int) ((long) field2235[var32 + var30] * (long) Filter.field3615 >> 16);
					for (int var35 = 0; var35 < var30; var35++) {
						var34 += (int) ((long) field2235[var32 + var30 - var35 - 1] * (long) Filter.field3619[0][var35] >> 16);
					}
					for (int var36 = 0; var36 < var32; var36++) {
						var34 -= (int) ((long) field2235[var32 - var36 - 1] * (long) Filter.field3619[1][var36] >> 16);
					}
					field2235[var32] = var34;
					var29 = this.field2243.method1560(arg0 + 1);
					var32++;
				}
				int var37 = 128;
				while (true) {
					if (var37 > arg0 - var30) {
						var37 = arg0 - var30;
					}
					while (var32 < var37) {
						int var38 = (int) ((long) field2235[var32 + var30] * (long) Filter.field3615 >> 16);
						for (int var39 = 0; var39 < var30; var39++) {
							var38 += (int) ((long) field2235[var32 + var30 - var39 - 1] * (long) Filter.field3619[0][var39] >> 16);
						}
						for (int var40 = 0; var40 < var31; var40++) {
							var38 -= (int) ((long) field2235[var32 - var40 - 1] * (long) Filter.field3619[1][var40] >> 16);
						}
						field2235[var32] = var38;
						var29 = this.field2243.method1560(arg0 + 1);
						var32++;
					}
					if (var32 >= arg0 - var30) {
						while (var32 < arg0) {
							int var41 = 0;
							for (int var42 = var32 + var30 - arg0; var42 < var30; var42++) {
								var41 += (int) ((long) field2235[var32 + var30 - var42 - 1] * (long) Filter.field3619[0][var42] >> 16);
							}
							for (int var43 = 0; var43 < var31; var43++) {
								var41 -= (int) ((long) field2235[var32 - var43 - 1] * (long) Filter.field3619[1][var43] >> 16);
							}
							field2235[var32] = var41;
							this.field2243.method1560(arg0 + 1);
							var32++;
						}
						break;
					}
					var30 = this.field2240.method1303(0, (float) var29 / 65536.0F);
					var31 = this.field2240.method1303(1, (float) var29 / 65536.0F);
					var37 += 128;
				}
			}
		}
		for (int var45 = 0; var45 < arg0; var45++) {
			if (field2235[var45] < -32768) {
				field2235[var45] = -32768;
			}
			if (field2235[var45] > 32767) {
				field2235[var45] = 32767;
			}
		}
		return field2235;
	}

	@ObfuscatedName("lc.a(Lea;)V")
	public void method834(Packet arg0) {
		this.field2232 = new Envelope();
		this.field2232.method1563(arg0);
		this.field2253 = new Envelope();
		this.field2253.method1563(arg0);
		int var2 = arg0.g1();
		if (var2 != 0) {
			arg0.pos--;
			this.field2244 = new Envelope();
			this.field2244.method1563(arg0);
			this.field2237 = new Envelope();
			this.field2237.method1563(arg0);
		}
		int var3 = arg0.g1();
		if (var3 != 0) {
			arg0.pos--;
			this.field2256 = new Envelope();
			this.field2256.method1563(arg0);
			this.field2249 = new Envelope();
			this.field2249.method1563(arg0);
		}
		int var4 = arg0.g1();
		if (var4 != 0) {
			arg0.pos--;
			this.field2247 = new Envelope();
			this.field2247.method1563(arg0);
			this.field2255 = new Envelope();
			this.field2255.method1563(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method350();
			if (var6 == 0) {
				break;
			}
			this.field2246[var5] = var6;
			this.field2234[var5] = arg0.method342();
			this.field2245[var5] = arg0.method350();
		}
		this.field2238 = arg0.method350();
		this.field2239 = arg0.method350();
		this.field2241 = arg0.g2();
		this.field2236 = arg0.g2();
		this.field2240 = new Filter();
		this.field2243 = new Envelope();
		this.field2240.method1305(arg0, this.field2243);
	}
}
