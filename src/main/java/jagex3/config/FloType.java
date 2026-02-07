package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ia")
public final class FloType extends Linkable2 {

	@ObfuscatedName("ac.L")
	public static Js5 field56;
	@ObfuscatedName("ad.w")
	public static LruCache field105 = new LruCache(64);
	@ObfuscatedName("ia.bb")
	public int field1332;

	@ObfuscatedName("ia.cb")
	public int field1333;

	@ObfuscatedName("ia.eb")
	public int field1335;

	@ObfuscatedName("ia.fb")
	public int field1336 = -1;

	@ObfuscatedName("ia.hb")
	public boolean field1338 = true;

	@ObfuscatedName("ia.L")
	public int field1316 = 0;

	@ObfuscatedName("ia.H")
	public int field1312 = -1;

	@ObfuscatedName("ia.K")
	public int field1315;

	@ObfuscatedName("ia.R")
	public int field1322;

	@ObfuscatedName("ia.Z")
	public int field1330;

	@ObfuscatedName("ha.c(II)Lia;")
	public static FloType method396(int arg0) {
		FloType var1 = (FloType) field105.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field56.getFile(4, arg0);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.method447(new Packet(var2), arg0);
		}
		var3.method446();
		field105.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("mf.a(Lea;I)V")
	public static void init(Js5 arg0) {
		field56 = arg0;
	}

	@ObfuscatedName("ie.b(B)V")
	public static void method465() {
		field105.clear();
	}

	@ObfuscatedName("ia.a(Ljd;III)V")
	public void method445(Packet arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.field1316 = arg0.g3();
		} else if (arg1 == 2) {
			this.field1336 = arg0.g1();
		} else if (arg1 == 5) {
			this.field1338 = false;
		} else if (arg1 == 7) {
			this.field1312 = arg0.g3();
		}
	}

	@ObfuscatedName("ia.e(I)V")
	public void method446() {
		if (this.field1312 != -1) {
			this.method450(this.field1312);
			this.field1322 = this.field1330;
			this.field1335 = this.field1332;
			this.field1315 = this.field1333;
		}
		this.method450(this.field1316);
	}

	@ObfuscatedName("ia.a(ILjd;I)V")
	public void method447(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.method445(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("ia.b(II)V")
	public void method450(int arg0) {
		double var2 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 & 0xFF) / 256.0D;
		double var6 = 0.0D;
		double var8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var10 = var8;
		double var12 = var8;
		if (var2 > var8) {
			var12 = var2;
		}
		if (var12 < var4) {
			var12 = var4;
		}
		double var14 = 0.0D;
		if (var2 < var8) {
			var10 = var2;
		}
		if (var10 > var4) {
			var10 = var4;
		}
		double var16 = (var10 + var12) / 2.0D;
		if (var12 != var10) {
			if (var16 < 0.5D) {
				var14 = (var12 - var10) / (var12 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var12 - var10) / (2.0D - var12 - var10);
			}
			if (var8 == var12) {
				var6 = (var2 - var4) / (var12 - var10);
			} else if (var12 == var2) {
				var6 = (var4 - var8) / (var12 - var10) + 2.0D;
			} else if (var12 == var4) {
				var6 = (var8 - var2) / (-var10 + var12) + 4.0D;
			}
		}
		double var18 = var6 / 6.0D;
		this.field1332 = (int) (var18 * 256.0D);
		this.field1333 = (int) (var14 * 256.0D);
		this.field1330 = (int) (var16 * 256.0D);
		if (this.field1333 < 0) {
			this.field1333 = 0;
		} else if (this.field1333 > 255) {
			this.field1333 = 255;
		}
		if (this.field1330 < 0) {
			this.field1330 = 0;
		} else if (this.field1330 > 255) {
			this.field1330 = 255;
		}
	}
}
