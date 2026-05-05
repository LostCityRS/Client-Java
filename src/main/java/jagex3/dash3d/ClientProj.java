package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("h")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("h.bb")
	public double field1406;

	@ObfuscatedName("h.cb")
	public final int field1407;

	@ObfuscatedName("h.o")
	public final SeqType field1367;

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

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
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
		int var12 = SpotType.list(this.field1400).anim;
		if (var12 == -1) {
			this.field1367 = null;
		} else {
			this.field1367 = SeqType.list(var12);
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
					if (this.field1380 <= this.field1367.delay[this.field1383]) {
						return;
					}
					this.field1380 -= this.field1367.delay[this.field1383];
					this.field1383++;
				} while (this.field1383 < this.field1367.frames.length);
				this.field1383 -= this.field1367.field1972;
			} while (this.field1383 >= 0 && this.field1367.frames.length > this.field1383);
			this.field1383 = 0;
		}
	}

	@ObfuscatedName("h.b(I)Lcg;")
	public ModelLit method518() {
		SpotType var1 = SpotType.list(this.field1400);
		ModelLit var2 = var1.getTempModel2(this.field1383);
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
		ModelLit var11 = this.method518();
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
