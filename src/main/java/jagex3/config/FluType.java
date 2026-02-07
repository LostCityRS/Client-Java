package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ee")
public final class FluType extends Linkable2 {

	@ObfuscatedName("na.l")
	public static Js5 field2086;
	@ObfuscatedName("aa.j")
	public static LruCache field24 = new LruCache(64);

	@ObfuscatedName("ee.db")
	public int field722;

	@ObfuscatedName("ee.fb")
	public int field724;

	@ObfuscatedName("ee.M")
	public int field705 = 0;

	@ObfuscatedName("ee.L")
	public int field704;

	@ObfuscatedName("ee.N")
	public int field706;

	@ObfuscatedName("vf.a(II)Lee;")
	public static FluType method1177(int arg0) {
		FluType var1 = (FluType) field24.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2086.getFile(1, arg0);
		FluType var3 = new FluType();
		if (var2 != null) {
			var3.method291(arg0, new Packet(var2));
		}
		var3.method292();
		field24.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("hc.a(BLea;)V")
	public static void init(Js5 arg0) {
		field2086 = arg0;
	}

	@ObfuscatedName("wd.d(I)V")
	public static void method1219() {
		field24.clear();
	}

	@ObfuscatedName("ee.a(IZ)V")
	public void method288(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = var2;
		if (var4 < var2) {
			var6 = var4;
		}
		double var8 = (double) (arg0 & 0xFF) / 256.0D;
		double var10 = 0.0D;
		double var12 = var2;
		double var14 = 0.0D;
		if (var4 > var2) {
			var12 = var4;
		}
		if (var8 > var12) {
			var12 = var8;
		}
		if (var8 < var6) {
			var6 = var8;
		}
		double var16 = (var12 + var6) / 2.0D;
		this.field704 = (int) (var16 * 256.0D);
		if (this.field704 < 0) {
			this.field704 = 0;
		} else if (this.field704 > 255) {
			this.field704 = 255;
		}
		if (var6 != var12) {
			if (var16 < 0.5D) {
				var10 = (var12 - var6) / (var6 + var12);
			}
			if (var12 == var2) {
				var14 = (var4 - var8) / (-var6 + var12);
			} else if (var12 == var4) {
				var14 = (var8 - var2) / (-var6 + var12) + 2.0D;
			} else if (var8 == var12) {
				var14 = (var2 - var4) / (-var6 + var12) + 4.0D;
			}
			if (var16 >= 0.5D) {
				var10 = (var12 - var6) / (2.0D - var12 - var6);
			}
		}
		if (var16 > 0.5D) {
			this.field724 = (int) ((1.0D - var16) * var10 * 512.0D);
		} else {
			this.field724 = (int) (var16 * var10 * 512.0D);
		}
		this.field706 = (int) (var10 * 256.0D);
		if (this.field706 < 0) {
			this.field706 = 0;
		} else if (this.field706 > 255) {
			this.field706 = 255;
		}
		double var18 = var14 / 6.0D;
		if (this.field724 < 1) {
			this.field724 = 1;
		}
		this.field722 = (int) (var18 * (double) this.field724);
	}

	@ObfuscatedName("ee.a(ZILjd;)V")
	public void method291(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			this.method294(arg0, arg1, var3);
		}
	}

	@ObfuscatedName("ee.a(B)V")
	public void method292() {
		this.method288(this.field705);
	}

	@ObfuscatedName("ee.a(IILjd;I)V")
	public void method294(int arg0, Packet arg1, int arg2) {
		if (arg2 == 1) {
			this.field705 = arg1.g3();
		}
	}
}
