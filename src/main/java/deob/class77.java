package deob;

@ObfuscatedName("h")
public final class class77 extends class145 {

	@ObfuscatedName("h.bb")
	public double field1406;

	@ObfuscatedName("h.cb")
	public final int field1407;

	@ObfuscatedName("h.o")
	public final class109 field1367;

	@ObfuscatedName("h.r")
	public static final class88 field1370 = class208.method1423(105, " <col=ffff00>");

	@ObfuscatedName("h.s")
	public final int field1371;

	@ObfuscatedName("h.t")
	public int field1372 = -32768;

	@ObfuscatedName("h.u")
	public double field1373;

	@ObfuscatedName("h.v")
	public double field1374;

	@ObfuscatedName("h.w")
	public double field1375;

	@ObfuscatedName("h.K")
	public static int field1389 = 0;

	@ObfuscatedName("h.G")
	public static final class88 field1385 = class208.method1423(105, "k");

	@ObfuscatedName("h.y")
	public static final class88 field1377 = class208.method1423(105, "Ladevorgang )2 bitte warten Sie)3");

	@ObfuscatedName("h.S")
	public static final class46[] field1397 = new class46[2048];

	@ObfuscatedName("h.Y")
	public static final class88 field1403 = class208.method1423(105, "blinken3:");

	@ObfuscatedName("h.F")
	public static int field1384 = 0;

	@ObfuscatedName("h.P")
	public static int field1394 = 0;

	@ObfuscatedName("h.A")
	public boolean field1379 = false;

	@ObfuscatedName("h.B")
	public int field1380 = 0;

	@ObfuscatedName("h.E")
	public int field1383 = 0;

	@ObfuscatedName("h.H")
	public final int field1386;

	@ObfuscatedName("h.R")
	public final int field1396;

	@ObfuscatedName("h.D")
	public final int field1382;

	@ObfuscatedName("h.V")
	public final int field1400;

	@ObfuscatedName("h.L")
	public final int field1390;

	@ObfuscatedName("h.J")
	public final int field1388;

	@ObfuscatedName("h.W")
	public final int field1401;

	@ObfuscatedName("h.T")
	public final int field1398;

	@ObfuscatedName("h.I")
	public final int field1387;

	@ObfuscatedName("h.z")
	public double field1378;

	@ObfuscatedName("h.M")
	public double field1391;

	@ObfuscatedName("h.N")
	public double field1392;

	@ObfuscatedName("h.Q")
	public double field1395;

	@ObfuscatedName("h.x")
	public int field1376;

	@ObfuscatedName("h.C")
	public int field1381;

	@ObfuscatedName("h.a(ILu;I)V")
	public static void method514(int arg0, class218 arg1) {
		if (arg1.field4133 > class117.field2113) {
			class109.method756(arg1);
		} else if (arg1.field4130 < class117.field2113) {
			class244.method1600(arg1);
		} else {
			class211.method1444(arg1);
		}
		if (arg1.field4136 < 128 || arg1.field4121 < 128 || arg1.field4136 >= 13184 || arg1.field4121 >= 13184) {
			arg1.field4121 = arg1.field4103 * 64 + arg1.field4141[0] * 128;
			arg1.field4136 = arg1.field4087[0] * 128 + arg1.field4103 * 64;
			arg1.field4130 = 0;
			arg1.field4080 = -1;
			arg1.field4133 = 0;
			arg1.field4077 = -1;
			arg1.method1478();
		}
		if (arg1 == class240.field4456 && (arg1.field4136 < 1536 || arg1.field4121 < 1536 || arg1.field4136 >= 11776 || arg1.field4121 >= 11776)) {
			arg1.field4080 = -1;
			arg1.field4130 = 0;
			arg1.field4133 = 0;
			arg1.field4121 = arg1.field4103 * 64 + arg1.field4141[0] * 128;
			arg1.field4077 = -1;
			arg1.field4136 = arg1.field4103 * 64 + arg1.field4087[0] * 128;
			arg1.method1478();
		}
		class18.method86(arg1);
		class104.method721(arg1);
	}

	@ObfuscatedName("h.a(IIIIZZZZ)Lrc;")
	public static class188 method516(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
		class149 var6 = class71.method472(arg0);
		if (arg1 > 1 && var6.field2903 != null) {
			int var7 = -1;
			for (int var8 = 0; var8 < 10; var8++) {
				if (arg1 >= var6.field2845[var8] && var6.field2845[var8] != 0) {
					var7 = var6.field2903[var8];
				}
			}
			if (var7 != -1) {
				var6 = class71.method472(var7);
			}
		}
		class125 var9 = var6.method1008();
		if (var9 == null) {
			return null;
		}
		class169 var10 = null;
		if (var6.field2867 != -1) {
			var10 = (class169) method516(var6.field2841, 10, 0, 1, true, false);
			if (var10 == null) {
				return null;
			}
		} else if (var6.field2884 != -1) {
			var10 = (class169) method516(var6.field2874, arg1, arg2, arg3, false, false);
			if (var10 == null) {
				return null;
			}
		}
		int[] var11 = class72.field1331;
		int var12 = class72.field1333;
		int var13 = class72.field1337;
		int[] var14 = new int[4];
		class72.method486(var14);
		class169 var15 = new class169(36, 32);
		class72.method496(var15.field3247, 36, 32);
		class173.method1235();
		class173.method1228(16, 16);
		int var16 = var6.field2889;
		if (arg4) {
			var16 = (int) ((double) var16 * 1.5D);
		} else if (arg3 == 2) {
			var16 = (int) ((double) var16 * 1.04D);
		}
		class173.field3355 = false;
		int var17 = class173.field3354[var6.field2873] * var16 >> 16;
		int var18 = var16 * class173.field3359[var6.field2873] >> 16;
		var9.method193(var6.field2872, var6.field2847, var6.field2873, var6.field2876, var18 + var6.field2870 - var9.method88() / 2, var6.field2870 + var17);
		if (arg3 >= 1) {
			var15.method1168(1);
			if (arg3 >= 2) {
				var15.method1168(16777215);
			}
			class72.method496(var15.field3247, 36, 32);
		}
		if (arg2 != 0) {
			var15.method1154(arg2);
		}
		if (var6.field2867 != -1) {
			var10.method1155(0, 0);
		} else if (var6.field2884 != -1) {
			class72.method496(var10.field3247, 36, 32);
			var15.method1155(0, 0);
			var15 = var10;
		}
		if (arg5 && (var6.field2852 == 1 || arg1 != 1) && arg1 != -1) {
			class180.field3571.method154(class133.method889(arg1), 0, 9, 16776960, 1);
		}
		class72.method496(var11, var12, var13);
		class72.method494(var14);
		class173.method1235();
		class173.field3355 = true;
		return var15;
	}

	@ObfuscatedName("h.c(I)V")
	public static void method519() {
		class179.field3558.method670();
		class60.field1123.method134();
		class80.field1442.method134();
		class47.field879.method134();
	}

	public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.field1386 = arg8;
		this.field1396 = arg10;
		this.field1382 = arg7;
		this.field1400 = arg0;
		this.field1371 = arg5;
		this.field1390 = arg1;
		this.field1407 = arg6;
		this.field1388 = arg4;
		this.field1379 = false;
		this.field1401 = arg3;
		this.field1398 = arg2;
		this.field1387 = arg9;
		int var12 = class62.method441(this.field1400).field542;
		if (var12 == -1) {
			this.field1367 = null;
		} else {
			this.field1367 = class15.method75(var12);
		}
	}

	@ObfuscatedName("h.a(II)V")
	public void method517(int arg0) {
		this.field1379 = true;
		this.field1375 += (double) arg0 * 0.5D * this.field1395 * (double) arg0 + this.field1378 * (double) arg0;
		this.field1406 += (double) arg0 * this.field1392;
		this.field1391 += this.field1373 * (double) arg0;
		this.field1378 += (double) arg0 * this.field1395;
		this.field1381 = (int) (Math.atan2(this.field1392, this.field1373) * 325.949D) + 1024 & 0x7FF;
		this.field1376 = (int) (Math.atan2(this.field1378, this.field1374) * 325.949D) & 0x7FF;
		if (this.field1367 == null) {
			return;
		}
		this.field1380 += arg0;
		while (true) {
			do {
				do {
					if (this.field1380 <= this.field1367.field1990[this.field1383]) {
						return;
					}
					this.field1380 -= this.field1367.field1990[this.field1383];
					this.field1383++;
				} while (this.field1383 < this.field1367.field1965.length);
				this.field1383 -= this.field1367.field1972;
			} while (this.field1383 >= 0 && this.field1367.field1965.length > this.field1383);
			this.field1383 = 0;
		}
	}

	@ObfuscatedName("h.b(I)Lcg;")
	public class30 method518() {
		class33 var1 = class62.method441(this.field1400);
		class30 var2 = var1.method209(this.field1383);
		if (var2 == null) {
			return null;
		} else {
			var2.method197(this.field1376);
			return var2;
		}
	}

	@ObfuscatedName("h.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		class30 var11 = this.method518();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field1372 = var11.method88();
		}
	}

	@ObfuscatedName("h.b()I")
	@Override
	public int method88() {
		return this.field1372;
	}

	@ObfuscatedName("h.a(IIIII)V")
	public void method520(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field1379) {
			double var5 = (double) (arg3 - this.field1401);
			double var7 = (double) (arg0 - this.field1398);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.field1406 = var7 * (double) this.field1386 / var9 + (double) this.field1398;
			this.field1391 = (double) this.field1401 + (double) this.field1386 * var5 / var9;
			this.field1375 = this.field1388;
		}
		double var11 = (double) (this.field1407 + 1 - arg1);
		this.field1373 = ((double) arg3 - this.field1391) / var11;
		this.field1392 = ((double) arg0 - this.field1406) / var11;
		this.field1374 = Math.sqrt(this.field1392 * this.field1392 + this.field1373 * this.field1373);
		if (!this.field1379) {
			this.field1378 = -this.field1374 * Math.tan((double) this.field1382 * 0.02454369D);
		}
		this.field1395 = ((double) arg2 - this.field1378 * var11 - this.field1375) * 2.0D / (var11 * var11);
	}
}
