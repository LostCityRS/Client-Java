package deob;

import java.util.Random;

@ObfuscatedName("db")
public final class class24 {

	@ObfuscatedName("db.a")
	public class69 field425;

	@ObfuscatedName("db.b")
	public final int[] field426 = new int[5];

	@ObfuscatedName("db.c")
	public final int[] field427 = new int[5];

	@ObfuscatedName("db.d")
	public class55 field428;

	@ObfuscatedName("db.e")
	public class69 field429;

	@ObfuscatedName("db.f")
	public class69 field430;

	@ObfuscatedName("db.g")
	public static int[] field431;

	@ObfuscatedName("db.h")
	public static int[] field432;

	@ObfuscatedName("db.i")
	public class69 field433;

	@ObfuscatedName("db.j")
	public int field434 = 0;

	@ObfuscatedName("db.k")
	public class69 field435;

	@ObfuscatedName("db.l")
	public class69 field436;

	@ObfuscatedName("db.m")
	public class69 field437;

	@ObfuscatedName("db.n")
	public class69 field438;

	@ObfuscatedName("db.o")
	public final int[] field439 = new int[5];

	@ObfuscatedName("db.p")
	public int field440 = 100;

	@ObfuscatedName("db.q")
	public static int[] field441 = new int[32768];

	@ObfuscatedName("db.r")
	public class69 field442;

	@ObfuscatedName("db.s")
	public static int[] field443;

	@ObfuscatedName("db.t")
	public int field444 = 0;

	@ObfuscatedName("db.u")
	public static int[] field445;

	@ObfuscatedName("db.v")
	public static int[] field446;

	@ObfuscatedName("db.w")
	public int field447 = 500;

	@ObfuscatedName("db.x")
	public static int[] field448;

	@ObfuscatedName("db.y")
	public static int[] field449;

	static {
		Random var0 = new Random(0L);
		for (int var1 = 0; var1 < 32768; var1++) {
			field441[var1] = (var0.nextInt() & 0x2) - 1;
		}
		field431 = new int[32768];
		for (int var2 = 0; var2 < 32768; var2++) {
			field431[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		field432 = new int[220500];
		field443 = new int[5];
		field445 = new int[5];
		field446 = new int[5];
		field448 = new int[5];
		field449 = new int[5];
	}

	@ObfuscatedName("db.a()V")
	public static void method171() {
		field432 = null;
		field441 = null;
		field431 = null;
		field446 = null;
		field445 = null;
		field443 = null;
		field449 = null;
		field448 = null;
	}

	@ObfuscatedName("db.a(Ljd;)V")
	public void method169(class66 arg0) {
		this.field425 = new class69();
		this.field425.method573(arg0);
		this.field435 = new class69();
		this.field435.method573(arg0);
		int var2 = arg0.method532();
		if (var2 != 0) {
			arg0.field1568--;
			this.field430 = new class69();
			this.field430.method573(arg0);
			this.field433 = new class69();
			this.field433.method573(arg0);
		}
		int var3 = arg0.method532();
		if (var3 != 0) {
			arg0.field1568--;
			this.field429 = new class69();
			this.field429.method573(arg0);
			this.field442 = new class69();
			this.field442.method573(arg0);
		}
		int var4 = arg0.method532();
		if (var4 != 0) {
			arg0.field1568--;
			this.field438 = new class69();
			this.field438.method573(arg0);
			this.field437 = new class69();
			this.field437.method573(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method505();
			if (var6 == 0) {
				break;
			}
			this.field426[var5] = var6;
			this.field439[var5] = arg0.method516();
			this.field427[var5] = arg0.method505();
		}
		this.field444 = arg0.method505();
		this.field440 = arg0.method505();
		this.field447 = arg0.method531();
		this.field434 = arg0.method531();
		this.field428 = new class55();
		this.field436 = new class69();
		this.field428.method430(arg0, this.field436);
	}

	@ObfuscatedName("db.a(II)[I")
	public int[] method170(int arg0, int arg1) {
		class60.method458(field432, 0, arg0);
		if (arg1 < 10) {
			return field432;
		}
		double var3 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field425.method574();
		this.field435.method574();
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		if (this.field430 != null) {
			this.field430.method574();
			this.field433.method574();
			var5 = (int) ((double) (this.field430.field1614 - this.field430.field1616) * 32.768D / var3);
			var6 = (int) ((double) this.field430.field1616 * 32.768D / var3);
		}
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		if (this.field429 != null) {
			this.field429.method574();
			this.field442.method574();
			var8 = (int) ((double) (this.field429.field1614 - this.field429.field1616) * 32.768D / var3);
			var9 = (int) ((double) this.field429.field1616 * 32.768D / var3);
		}
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field426[var11] != 0) {
				field446[var11] = 0;
				field445[var11] = (int) ((double) this.field427[var11] * var3);
				field443[var11] = (this.field426[var11] << 14) / 100;
				field449[var11] = (int) ((double) (this.field425.field1614 - this.field425.field1616) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field439[var11]) / var3);
				field448[var11] = (int) ((double) this.field425.field1616 * 32.768D / var3);
			}
		}
		for (int var12 = 0; var12 < arg0; var12++) {
			int var13 = this.field425.method572(arg0);
			int var14 = this.field435.method572(arg0);
			if (this.field430 != null) {
				int var15 = this.field430.method572(arg0);
				int var16 = this.field433.method572(arg0);
				var13 += this.method172(var7, var16, this.field430.field1619) >> 1;
				var7 += (var15 * var5 >> 16) + var6;
			}
			if (this.field429 != null) {
				int var17 = this.field429.method572(arg0);
				int var18 = this.field442.method572(arg0);
				var14 = var14 * ((this.method172(var10, var18, this.field429.field1619) >> 1) + 32768) >> 15;
				var10 += (var17 * var8 >> 16) + var9;
			}
			for (int var19 = 0; var19 < 5; var19++) {
				if (this.field426[var19] != 0) {
					int var20 = var12 + field445[var19];
					if (var20 < arg0) {
						field432[var20] += this.method172(field446[var19], var14 * field443[var19] >> 15, this.field425.field1619);
						field446[var19] += (var13 * field449[var19] >> 16) + field448[var19];
					}
				}
			}
		}
		if (this.field438 != null) {
			this.field438.method574();
			this.field437.method574();
			int var21 = 0;
			boolean var22 = true;
			for (int var23 = 0; var23 < arg0; var23++) {
				int var24 = this.field438.method572(arg0);
				int var25 = this.field437.method572(arg0);
				int var26;
				if (var22) {
					var26 = this.field438.field1616 + ((this.field438.field1614 - this.field438.field1616) * var24 >> 8);
				} else {
					var26 = this.field438.field1616 + ((this.field438.field1614 - this.field438.field1616) * var25 >> 8);
				}
				var21 += 256;
				if (var21 >= var26) {
					var21 = 0;
					var22 = !var22;
				}
				if (var22) {
					field432[var23] = 0;
				}
			}
		}
		if (this.field444 > 0 && this.field440 > 0) {
			int var27 = (int) ((double) this.field444 * var3);
			for (int var28 = var27; var28 < arg0; var28++) {
				field432[var28] += field432[var28 - var27] * this.field440 / 100;
			}
		}
		if (this.field428.field1285[0] > 0 || this.field428.field1285[1] > 0) {
			this.field436.method574();
			int var29 = this.field436.method572(arg0 + 1);
			int var30 = this.field428.method432(0, (float) var29 / 65536.0F);
			int var31 = this.field428.method432(1, (float) var29 / 65536.0F);
			if (arg0 >= var30 + var31) {
				int var32 = 0;
				int var33 = var31;
				if (var31 > arg0 - var30) {
					var33 = arg0 - var30;
				}
				while (var32 < var33) {
					int var34 = (int) ((long) field432[var32 + var30] * (long) class55.field1288 >> 16);
					for (int var35 = 0; var35 < var30; var35++) {
						var34 += (int) ((long) field432[var32 + var30 - var35 - 1] * (long) class55.field1284[0][var35] >> 16);
					}
					for (int var36 = 0; var36 < var32; var36++) {
						var34 -= (int) ((long) field432[var32 - var36 - 1] * (long) class55.field1284[1][var36] >> 16);
					}
					field432[var32] = var34;
					var29 = this.field436.method572(arg0 + 1);
					var32++;
				}
				int var37 = 128;
				while (true) {
					if (var37 > arg0 - var30) {
						var37 = arg0 - var30;
					}
					while (var32 < var37) {
						int var38 = (int) ((long) field432[var32 + var30] * (long) class55.field1288 >> 16);
						for (int var39 = 0; var39 < var30; var39++) {
							var38 += (int) ((long) field432[var32 + var30 - var39 - 1] * (long) class55.field1284[0][var39] >> 16);
						}
						for (int var40 = 0; var40 < var31; var40++) {
							var38 -= (int) ((long) field432[var32 - var40 - 1] * (long) class55.field1284[1][var40] >> 16);
						}
						field432[var32] = var38;
						var29 = this.field436.method572(arg0 + 1);
						var32++;
					}
					if (var32 >= arg0 - var30) {
						while (var32 < arg0) {
							int var41 = 0;
							for (int var42 = var32 + var30 - arg0; var42 < var30; var42++) {
								var41 += (int) ((long) field432[var32 + var30 - var42 - 1] * (long) class55.field1284[0][var42] >> 16);
							}
							for (int var43 = 0; var43 < var31; var43++) {
								var41 -= (int) ((long) field432[var32 - var43 - 1] * (long) class55.field1284[1][var43] >> 16);
							}
							field432[var32] = var41;
							this.field436.method572(arg0 + 1);
							var32++;
						}
						break;
					}
					var30 = this.field428.method432(0, (float) var29 / 65536.0F);
					var31 = this.field428.method432(1, (float) var29 / 65536.0F);
					var37 += 128;
				}
			}
		}
		for (int var45 = 0; var45 < arg0; var45++) {
			if (field432[var45] < -32768) {
				field432[var45] = -32768;
			}
			if (field432[var45] > 32767) {
				field432[var45] = 32767;
			}
		}
		return field432;
	}

	@ObfuscatedName("db.a(III)I")
	public int method172(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return field431[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return field441[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
