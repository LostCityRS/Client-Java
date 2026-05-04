package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("vh")
public final class FluType extends Linkable2 {

	@ObfuscatedName("vg.r")
	public static final LruCache field4402 = new LruCache(64);

	@ObfuscatedName("ch.l")
	public static Js5 field506;

	@ObfuscatedName("vh.S")
	public int field4422 = 0;

	@ObfuscatedName("vh.M")
	public int field4416 = -1;

	@ObfuscatedName("vh.D")
	public int field4407;

	@ObfuscatedName("vh.G")
	public int field4410;

	@ObfuscatedName("vh.J")
	public int field4413;

	@ObfuscatedName("vh.Q")
	public int field4420;

	@ObfuscatedName("cf.a(II)Lvh;")
	public static FluType method179(int arg0) {
		FluType var1 = (FluType) field4402.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field506.getFile(arg0, 1);
		FluType var3 = new FluType();
		if (var2 != null) {
			var3.method1572(arg0, new Packet(var2));
		}
		field4402.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("a.b(B)V")
	public static void resetCache() {
		field4402.clear();
	}

	@ObfuscatedName("md.a(Lnb;I)V")
	public static void init(Js5 arg0) {
		field506 = arg0;
	}

	@ObfuscatedName("vh.a(ZI)V")
	public void method1569(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var2 > var4) {
			var8 = var4;
		}
		double var10 = var2;
		if (var2 < var4) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		this.field4413 = (int) (var16 * 256.0D);
		if (this.field4413 < 0) {
			this.field4413 = 0;
		} else if (this.field4413 > 255) {
			this.field4413 = 255;
		}
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var12 = (var10 - var8) / (var8 + var10);
			}
			if (var2 == var10) {
				var14 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var14 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var14 = (var2 - var4) / (-var8 + var10) + 4.0D;
			}
			if (var16 >= 0.5D) {
				var12 = (var10 - var8) / (2.0D - var10 - var8);
			}
		}
		this.field4410 = (int) (var12 * 256.0D);
		double var18 = var14 / 6.0D;
		if (this.field4410 < 0) {
			this.field4410 = 0;
		} else if (this.field4410 > 255) {
			this.field4410 = 255;
		}
		if (var16 > 0.5D) {
			this.field4407 = (int) (var12 * (1.0D - var16) * 512.0D);
		} else {
			this.field4407 = (int) (var12 * var16 * 512.0D);
		}
		if (this.field4407 < 1) {
			this.field4407 = 1;
		}
		this.field4420 = (int) (var18 * (double) this.field4407);
	}

	@ObfuscatedName("vh.a(ILea;I)V")
	public void method1572(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			this.method1573(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("vh.a(IILea;I)V")
	public void method1573(int arg0, Packet arg1, int arg2) {
		if (arg0 == 1) {
			this.field4422 = arg1.g3();
			this.method1569(this.field4422);
		} else if (arg0 == 2) {
			this.field4416 = arg1.g2();
			if (this.field4416 == 65535) {
				this.field4416 = -1;
			}
		} else if (arg0 == 3) {
			arg1.g2();
		}
	}
}
