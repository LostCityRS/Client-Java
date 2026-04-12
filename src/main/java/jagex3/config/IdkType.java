package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("pe")
public final class IdkType extends Linkable2 {

	@ObfuscatedName("pe.tb")
	public final int[] field2353 = new int[6];

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

	@ObfuscatedName("se.a(ILbd;Lbd;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		Statics.field1583 = arg1;
		Statics.field2433 = arg0;
		Statics.field974 = Statics.field2433.method235(3);
	}

	@ObfuscatedName("ba.a(BI)Lpe;")
	public static IdkType method177(int arg0) {
		IdkType var1 = (IdkType) Statics.field3282.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2433.method217(arg0, 3);
		IdkType var3 = new IdkType();
		if (var2 != null) {
			var3.method820(new Packet(var2));
		}
		Statics.field3282.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("pe.a(BLba;)V")
	public void method820(Packet arg0) {
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
	public void method826(Packet arg0, int arg1) {
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
	public Model method827() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field2377[var3] != -1) {
				var1[var2++] = Model.method798(Statics.field1583, this.field2377[var3]);
			}
		}
		Model var4 = new Model(var1, var2);
		for (int var5 = 0; var5 < 6 && this.field2353[var5] != 0; var5++) {
			var4.method771(this.field2353[var5], this.field2361[var5]);
		}
		return var4;
	}

	@ObfuscatedName("pe.d(Z)Lpa;")
	public Model method828() {
		if (this.field2367 == null) {
			return null;
		}
		Model[] var1 = new Model[this.field2367.length];
		for (int var2 = 0; var2 < this.field2367.length; var2++) {
			var1[var2] = Model.method798(Statics.field1583, this.field2367[var2]);
		}
		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1, var1.length);
		}
		for (int var4 = 0; var4 < 6 && this.field2353[var4] != 0; var4++) {
			var3.method771(this.field2353[var4], this.field2361[var4]);
		}
		return var3;
	}
}
