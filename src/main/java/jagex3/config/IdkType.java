package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("jc")
public final class IdkType extends Linkable2 {

	@ObfuscatedName("be.G")
	public static Js5 field226;
	@ObfuscatedName("c.Db")
	public static Js5 field307;
	@ObfuscatedName("na.g")
	public static int field2081;
	@ObfuscatedName("fa.B")
	public static LruCache field886 = new LruCache(64);
	@ObfuscatedName("jc.bb")
	public int field1515 = -1;

	@ObfuscatedName("jc.cb")
	public short[] field1516;

	@ObfuscatedName("jc.eb")
	public short[] field1518;

	@ObfuscatedName("jc.Q")
	public boolean field1504 = false;

	@ObfuscatedName("jc.H")
	public final int[] field1495 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("jc.W")
	public int[] field1510;

	@ObfuscatedName("jc.I")
	public short[] field1496;

	@ObfuscatedName("jc.P")
	public short[] field1503;

	@ObfuscatedName("tb.a(BI)Ljc;")
	public static IdkType method1020(int arg0) {
		IdkType var1 = (IdkType) field886.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field226.getFile(3, arg0);
		IdkType var3 = new IdkType();
		if (var2 != null) {
			var3.method497(new Packet(var2));
		}
		field886.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("u.a(Lea;BLea;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field226 = arg1;
		field307 = arg0;
		field2081 = field226.getFileIdLimit(3);
	}

	@ObfuscatedName("gf.a(Z)V")
	public static void method363() {
		field886.clear();
	}

	@ObfuscatedName("jc.e(I)Z")
	public boolean method495() {
		if (this.field1510 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field1510.length; var2++) {
			if (!field307.requestDownload(this.field1510[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("jc.a(BLjd;)V")
	public void method497(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method501(var2, arg0);
		}
	}

	@ObfuscatedName("jc.a(B)Z")
	public boolean method498() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field1495[var2] != -1 && !field307.requestDownload(this.field1495[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("jc.b(B)Lp;")
	public ModelUnlit method500() {
		if (this.field1510 == null) {
			return null;
		}
		ModelUnlit[] var1 = new ModelUnlit[this.field1510.length];
		for (int var2 = 0; var2 < this.field1510.length; var2++) {
			var1[var2] = ModelUnlit.method840(field307, this.field1510[var2]);
		}
		ModelUnlit var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new ModelUnlit(var1, var1.length);
		}
		if (this.field1496 != null) {
			for (int var4 = 0; var4 < this.field1496.length; var4++) {
				var3.method833(this.field1496[var4], this.field1516[var4]);
			}
		}
		if (this.field1518 != null) {
			for (int var5 = 0; var5 < this.field1518.length; var5++) {
				var3.method853(this.field1518[var5], this.field1503[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("jc.a(ILjd;B)V")
	public void method501(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field1515 = arg1.g1();
		} else if (arg0 == 2) {
			int var3 = arg1.g1();
			this.field1510 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1510[var4] = arg1.g2();
			}
		} else if (arg0 == 3) {
			this.field1504 = true;
		} else if (arg0 == 40) {
			int var7 = arg1.g1();
			this.field1516 = new short[var7];
			this.field1496 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field1496[var8] = (short) arg1.g2();
				this.field1516[var8] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var5 = arg1.g1();
			this.field1503 = new short[var5];
			this.field1518 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field1518[var6] = (short) arg1.g2();
				this.field1503[var6] = (short) arg1.g2();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.field1495[arg0 - 60] = arg1.g2();
		}
	}

	@ObfuscatedName("jc.g(I)Lp;")
	public ModelUnlit method502() {
		ModelUnlit[] var1 = new ModelUnlit[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field1495[var3] != -1) {
				var1[var2++] = ModelUnlit.method840(field307, this.field1495[var3]);
			}
		}
		ModelUnlit var4 = new ModelUnlit(var1, var2);
		if (this.field1496 != null) {
			for (int var5 = 0; var5 < this.field1496.length; var5++) {
				var4.method833(this.field1496[var5], this.field1516[var5]);
			}
		}
		if (this.field1518 != null) {
			for (int var6 = 0; var6 < this.field1518.length; var6++) {
				var4.method853(this.field1518[var6], this.field1503[var6]);
			}
		}
		return var4;
	}
}
