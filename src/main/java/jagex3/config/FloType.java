package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ia")
public final class FloType extends Linkable2 {

	@ObfuscatedName("ac.L")
	public static Js5 configClient;

	@ObfuscatedName("ad.w")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ia.L")
	public int rgb = 0;

	@ObfuscatedName("ia.fb")
	public int texture = -1;

	@ObfuscatedName("ia.hb")
	public boolean occlude = true;

	@ObfuscatedName("ia.H")
	public int mapcolour = -1;

	@ObfuscatedName("ia.Z")
	public int hue;

	@ObfuscatedName("ia.bb")
	public int saturation;

	@ObfuscatedName("ia.cb")
	public int luminance;

	@ObfuscatedName("ia.R")
	public int mapHue;

	@ObfuscatedName("ia.eb")
	public int mapSaturation;

	@ObfuscatedName("ia.K")
	public int mapLuminance;

	@ObfuscatedName("mf.a(Lea;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("ha.c(II)Lia;")
	public static FloType list(int arg0) {
		FloType var1 = (FloType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(4, arg0);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.decode(new Packet(var2), arg0);
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ia.e(I)V")
	public void postDecode() {
		if (this.mapcolour != -1) {
			this.getHsl(this.mapcolour);
			this.mapHue = this.hue;
			this.mapSaturation = this.saturation;
			this.mapLuminance = this.luminance;
		}
		this.getHsl(this.rgb);
	}

	@ObfuscatedName("ia.a(ILjd;I)V")
	public void decode(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(arg0, var3, arg1);
		}
	}

	@ObfuscatedName("ia.a(Ljd;III)V")
	public void decode(Packet arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			this.rgb = arg0.g3();
		} else if (arg1 == 2) {
			this.texture = arg0.g1();
		} else if (arg1 == 5) {
			this.occlude = false;
		} else if (arg1 == 7) {
			this.mapcolour = arg0.g3();
		}
	}

	@ObfuscatedName("ia.b(II)V")
	public void getHsl(int arg0) {
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
		this.saturation = (int) (var18 * 256.0D);
		this.luminance = (int) (var14 * 256.0D);
		this.hue = (int) (var16 * 256.0D);
		if (this.luminance < 0) {
			this.luminance = 0;
		} else if (this.luminance > 255) {
			this.luminance = 255;
		}
		if (this.hue < 0) {
			this.hue = 0;
		} else if (this.hue > 255) {
			this.hue = 255;
		}
	}

	@ObfuscatedName("ie.b(B)V")
	public static void resetCache() {
		recentUse.clear();
	}
}
