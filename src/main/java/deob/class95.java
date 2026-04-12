package deob;

@ObfuscatedName("pe")
public final class class95 extends class44 {

	@ObfuscatedName("pe.tb")
	public final int[] field2353 = new int[6];

	@ObfuscatedName("pe.vb")
	public static class1 field2355 = Statics.method931("backvmid2");

	@ObfuscatedName("pe.Fb")
	public static int field2365 = 0;

	@ObfuscatedName("pe.Eb")
	public static boolean field2364 = false;

	@ObfuscatedName("pe.zb")
	public static class1 field2359 = Statics.method931("Anmelde)2Zeitlimit -Uberschritten)3");

	@ObfuscatedName("pe.Sb")
	public static class1 field2378 = Statics.method931("Bitte versuchen Sie es in ");

	@ObfuscatedName("pe.Jb")
	public static int[] field2369 = new int[50];

	@ObfuscatedName("pe.yb")
	public static int field2358 = 0;

	@ObfuscatedName("pe.Cb")
	public static class1 field2362 = Statics.method931("K");

	@ObfuscatedName("pe.ub")
	public static class1 field2354 = field2362;

	@ObfuscatedName("pe.Ab")
	public static class1 field2360 = field2362;

	@ObfuscatedName("pe.Lb")
	public static class92 field2371 = new class92();

	@ObfuscatedName("pe.Vb")
	public static class1 field2381 = Statics.method931("Wen m-Ochten Sie entfernen?");

	@ObfuscatedName("pe.Ub")
	public static int field2380 = 0;

	@ObfuscatedName("pe.Xb")
	public static class1 field2383 = Statics.method931("Bad session id)3");

	@ObfuscatedName("pe.Wb")
	public static class1 field2382 = field2383;

	@ObfuscatedName("pe.Gb")
	public int field2366 = -1;

	@ObfuscatedName("pe.Nb")
	public boolean field2373 = false;

	@ObfuscatedName("pe.Rb")
	public final int[] field2377 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("pe.Bb")
	public final int[] field2361 = new int[6];

	@ObfuscatedName("pe.Hb")
	public int[] field2367;

	@ObfuscatedName("pe.a(BLba;)V")
	public void method820(class8 arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method826(arg0, var2);
		}
	}

	@ObfuscatedName("pe.b(Z)Z")
	public boolean method821() {
		if (this.field2367 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field2367.length; var2++) {
			if (!Statics.field1583.method218(this.field2367[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("pe.c(Z)Z")
	public boolean method822() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field2377[var2] != -1 && !Statics.field1583.method218(this.field2377[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("pe.a(Lba;II)V")
	public void method826(class8 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2366 = arg0.method144();
		} else if (arg1 == 2) {
			int var3 = arg0.method144();
			this.field2367 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2367[var4] = arg0.method145();
			}
		} else if (arg1 == 3) {
			this.field2373 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.field2353[arg1 - 40] = arg0.method145();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.field2361[arg1 - 50] = arg0.method145();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.field2377[arg1 - 60] = arg0.method145();
		}
	}

	@ObfuscatedName("pe.b(B)Lpa;")
	public class91 method827() {
		class91[] var1 = new class91[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field2377[var3] != -1) {
				var1[var2++] = class91.method798(Statics.field1583, this.field2377[var3]);
			}
		}
		class91 var4 = new class91(var1, var2);
		for (int var5 = 0; var5 < 6 && this.field2353[var5] != 0; var5++) {
			var4.method771(this.field2353[var5], this.field2361[var5]);
		}
		return var4;
	}

	@ObfuscatedName("pe.d(Z)Lpa;")
	public class91 method828() {
		if (this.field2367 == null) {
			return null;
		}
		class91[] var1 = new class91[this.field2367.length];
		for (int var2 = 0; var2 < this.field2367.length; var2++) {
			var1[var2] = class91.method798(Statics.field1583, this.field2367[var2]);
		}
		class91 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class91(var1, var1.length);
		}
		for (int var4 = 0; var4 < 6 && this.field2353[var4] != 0; var4++) {
			var3.method771(this.field2353[var4], this.field2361[var4]);
		}
		return var3;
	}
}
