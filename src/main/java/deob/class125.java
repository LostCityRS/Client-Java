package deob;

import java.util.Random;

@ObfuscatedName("ue")
public final class class125 {

	@ObfuscatedName("ue.a")
	public class30 field3081;

	@ObfuscatedName("ue.b")
	public int field3082 = 0;

	@ObfuscatedName("ue.c")
	public int field3083 = 0;

	@ObfuscatedName("ue.d")
	public static int[] field3084;

	@ObfuscatedName("ue.e")
	public final int[] field3085 = new int[5];

	@ObfuscatedName("ue.f")
	public class13 field3086;

	@ObfuscatedName("ue.g")
	public class13 field3087;

	@ObfuscatedName("ue.h")
	public static int[] field3088;

	@ObfuscatedName("ue.i")
	public final int[] field3089 = new int[5];

	@ObfuscatedName("ue.j")
	public class13 field3090;

	@ObfuscatedName("ue.k")
	public final int[] field3091 = new int[5];

	@ObfuscatedName("ue.l")
	public int field3092 = 100;

	@ObfuscatedName("ue.m")
	public class13 field3093;

	@ObfuscatedName("ue.n")
	public class13 field3094;

	@ObfuscatedName("ue.o")
	public class13 field3095;

	@ObfuscatedName("ue.p")
	public class13 field3096;

	@ObfuscatedName("ue.q")
	public static int[] field3097 = new int[32768];

	@ObfuscatedName("ue.r")
	public static int[] field3098;

	@ObfuscatedName("ue.s")
	public static int[] field3099;

	@ObfuscatedName("ue.t")
	public int field3100 = 500;

	@ObfuscatedName("ue.u")
	public static int[] field3101;

	@ObfuscatedName("ue.v")
	public static int[] field3102;

	@ObfuscatedName("ue.w")
	public class13 field3103;

	@ObfuscatedName("ue.y")
	public static int[] field3105;

	@ObfuscatedName("ue.x")
	public class13 field3104;

	static {
		Random var0 = new Random(0L);
		for (int var1 = 0; var1 < 32768; var1++) {
			field3097[var1] = (var0.nextInt() & 0x2) - 1;
		}
		field3084 = new int[32768];
		for (int var2 = 0; var2 < 32768; var2++) {
			field3084[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		field3088 = new int[220500];
		field3099 = new int[5];
		field3098 = new int[5];
		field3102 = new int[5];
		field3101 = new int[5];
		field3105 = new int[5];
	}

	@ObfuscatedName("ue.a(Lba;)V")
	public void method1003(class8 arg0) {
		this.field3094 = new class13();
		this.field3094.method249(arg0);
		this.field3096 = new class13();
		this.field3096.method249(arg0);
		int var2 = arg0.method144();
		if (var2 != 0) {
			arg0.field267--;
			this.field3090 = new class13();
			this.field3090.method249(arg0);
			this.field3104 = new class13();
			this.field3104.method249(arg0);
		}
		int var3 = arg0.method144();
		if (var3 != 0) {
			arg0.field267--;
			this.field3095 = new class13();
			this.field3095.method249(arg0);
			this.field3087 = new class13();
			this.field3087.method249(arg0);
		}
		int var4 = arg0.method144();
		if (var4 != 0) {
			arg0.field267--;
			this.field3103 = new class13();
			this.field3103.method249(arg0);
			this.field3086 = new class13();
			this.field3086.method249(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method178();
			if (var6 == 0) {
				break;
			}
			this.field3091[var5] = var6;
			this.field3085[var5] = arg0.method158();
			this.field3089[var5] = arg0.method178();
		}
		this.field3083 = arg0.method178();
		this.field3092 = arg0.method178();
		this.field3100 = arg0.method145();
		this.field3082 = arg0.method145();
		this.field3081 = new class30();
		this.field3093 = new class13();
		this.field3081.method375(arg0, this.field3093);
	}

	@ObfuscatedName("ue.a()V")
	public static void method1004() {
		field3088 = null;
		field3097 = null;
		field3084 = null;
		field3105 = null;
		field3101 = null;
		field3098 = null;
		field3099 = null;
		field3102 = null;
	}

	@ObfuscatedName("ue.a(III)I")
	public int method1005(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return field3084[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return field3097[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ue.a(II)[I")
	public int[] method1006(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field3088[var3] = 0;
		}
		if (arg1 < 10) {
			return field3088;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field3094.method248();
		this.field3096.method248();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.field3090 != null) {
			this.field3090.method248();
			this.field3104.method248();
			var6 = (int) ((double) (this.field3090.field442 - this.field3090.field440) * 32.768D / var4);
			var7 = (int) ((double) this.field3090.field440 * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.field3095 != null) {
			this.field3095.method248();
			this.field3087.method248();
			var9 = (int) ((double) (this.field3095.field442 - this.field3095.field440) * 32.768D / var4);
			var10 = (int) ((double) this.field3095.field440 * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.field3091[var12] != 0) {
				field3105[var12] = 0;
				field3101[var12] = (int) ((double) this.field3089[var12] * var4);
				field3098[var12] = (this.field3091[var12] << 14) / 100;
				field3099[var12] = (int) ((double) (this.field3094.field442 - this.field3094.field440) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3085[var12]) / var4);
				field3102[var12] = (int) ((double) this.field3094.field440 * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.field3094.method251(arg0);
			int var15 = this.field3096.method251(arg0);
			if (this.field3090 != null) {
				int var16 = this.field3090.method251(arg0);
				int var17 = this.field3104.method251(arg0);
				var14 += this.method1005(var8, var17, this.field3090.field441) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}
			if (this.field3095 != null) {
				int var18 = this.field3095.method251(arg0);
				int var19 = this.field3087.method251(arg0);
				var15 = var15 * ((this.method1005(var11, var19, this.field3095.field441) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field3091[var20] != 0) {
					int var21 = field3101[var20] + var13;
					if (var21 < arg0) {
						field3088[var21] += this.method1005(field3105[var20], field3098[var20] * var15 >> 15, this.field3094.field441);
						field3105[var20] += (field3099[var20] * var14 >> 16) + field3102[var20];
					}
				}
			}
		}
		if (this.field3103 != null) {
			this.field3103.method248();
			this.field3086.method248();
			int var22 = 0;
			boolean var23 = true;
			for (int var24 = 0; var24 < arg0; var24++) {
				int var25 = this.field3103.method251(arg0);
				int var26 = this.field3086.method251(arg0);
				int var27;
				if (var23) {
					var27 = ((this.field3103.field442 - this.field3103.field440) * var25 >> 8) + this.field3103.field440;
				} else {
					var27 = ((this.field3103.field442 - this.field3103.field440) * var26 >> 8) + this.field3103.field440;
				}
				var22 += 256;
				if (var22 >= var27) {
					var22 = 0;
					var23 = !var23;
				}
				if (var23) {
					field3088[var24] = 0;
				}
			}
		}
		if (this.field3083 > 0 && this.field3092 > 0) {
			int var28 = (int) ((double) this.field3083 * var4);
			for (int var29 = var28; var29 < arg0; var29++) {
				field3088[var29] += field3088[var29 - var28] * this.field3092 / 100;
			}
		}
		if (this.field3081.field825[0] > 0 || this.field3081.field825[1] > 0) {
			this.field3093.method248();
			int var30 = this.field3093.method251(arg0 + 1);
			int var31 = this.field3081.method378(0, (float) var30 / 65536.0F);
			int var32 = this.field3081.method378(1, (float) var30 / 65536.0F);
			if (arg0 >= var31 + var32) {
				int var33 = 0;
				int var34 = var32;
				if (var32 > arg0 - var31) {
					var34 = arg0 - var31;
				}
				while (var33 < var34) {
					int var35 = (int) ((long) field3088[var31 + var33] * (long) Statics.field823 >> 16);
					for (int var36 = 0; var36 < var31; var36++) {
						var35 += (int) ((long) field3088[var31 + var33 - var36 - 1] * (long) class30.field821[0][var36] >> 16);
					}
					for (int var37 = 0; var37 < var33; var37++) {
						var35 -= (int) ((long) field3088[var33 - var37 - 1] * (long) class30.field821[1][var37] >> 16);
					}
					field3088[var33] = var35;
					var30 = this.field3093.method251(arg0 + 1);
					var33++;
				}
				int var38 = 128;
				while (true) {
					if (var38 > arg0 - var31) {
						var38 = arg0 - var31;
					}
					while (var33 < var38) {
						int var39 = (int) ((long) field3088[var31 + var33] * (long) Statics.field823 >> 16);
						for (int var40 = 0; var40 < var31; var40++) {
							var39 += (int) ((long) field3088[var31 + var33 - var40 - 1] * (long) class30.field821[0][var40] >> 16);
						}
						for (int var41 = 0; var41 < var32; var41++) {
							var39 -= (int) ((long) field3088[var33 - var41 - 1] * (long) class30.field821[1][var41] >> 16);
						}
						field3088[var33] = var39;
						var30 = this.field3093.method251(arg0 + 1);
						var33++;
					}
					if (var33 >= arg0 - var31) {
						while (var33 < arg0) {
							int var42 = 0;
							for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
								var42 += (int) ((long) field3088[var31 + var33 - var43 - 1] * (long) class30.field821[0][var43] >> 16);
							}
							for (int var44 = 0; var44 < var32; var44++) {
								var42 -= (int) ((long) field3088[var33 - var44 - 1] * (long) class30.field821[1][var44] >> 16);
							}
							field3088[var33] = var42;
							this.field3093.method251(arg0 + 1);
							var33++;
						}
						break;
					}
					var31 = this.field3081.method378(0, (float) var30 / 65536.0F);
					var32 = this.field3081.method378(1, (float) var30 / 65536.0F);
					var38 += 128;
				}
			}
		}
		for (int var46 = 0; var46 < arg0; var46++) {
			if (field3088[var46] < -32768) {
				field3088[var46] = -32768;
			}
			if (field3088[var46] > 32767) {
				field3088[var46] = 32767;
			}
		}
		return field3088;
	}
}
