package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ee")
public final class FluType extends Linkable2 {

	@ObfuscatedName("na.l")
	public static Js5 configClient;

	@ObfuscatedName("aa.j")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ee.M")
	public int rgb = 0;

	@ObfuscatedName("ee.db")
	public int chroma;

	@ObfuscatedName("ee.L")
	public int hue;

	@ObfuscatedName("ee.N")
	public int saturation;

	@ObfuscatedName("ee.fb")
	public int luminance;

	@ObfuscatedName("hc.a(BLea;)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("vf.a(II)Lee;")
	public static FluType list(int arg0) {
		FluType var1 = (FluType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(1, arg0);
		FluType var3 = new FluType();
		if (var2 != null) {
			var3.decode(arg0, new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ee.a(B)V")
	public void postDecode() {
		this.getHsl(this.rgb);
	}

	@ObfuscatedName("ee.a(ZILjd;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(arg0, arg1, var3);
		}
	}

	@ObfuscatedName("ee.a(IILjd;I)V")
	public void decode(int arg0, Packet arg1, int arg2) {
		if (arg2 == 1) {
			this.rgb = arg1.g3();
		}
	}

	@ObfuscatedName("ee.a(IZ)V")
	public void getHsl(int arg0) {
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
		this.hue = (int) (var16 * 256.0D);
		if (this.hue < 0) {
			this.hue = 0;
		} else if (this.hue > 255) {
			this.hue = 255;
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
			this.luminance = (int) ((1.0D - var16) * var10 * 512.0D);
		} else {
			this.luminance = (int) (var16 * var10 * 512.0D);
		}
		this.saturation = (int) (var10 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		double var18 = var14 / 6.0D;
		if (this.luminance < 1) {
			this.luminance = 1;
		}
		this.chroma = (int) (var18 * (double) this.luminance);
	}

	@ObfuscatedName("wd.d(I)V")
	public static void resetCache() {
		recentUse.clear();
	}
}
