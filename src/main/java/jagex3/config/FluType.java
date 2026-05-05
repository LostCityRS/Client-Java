package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("vh")
public final class FluType extends Linkable2 {

	@ObfuscatedName("vg.r")
	public static final LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ch.l")
	public static Js5 configClient;

	@ObfuscatedName("vh.S")
	public int colour = 0;

	@ObfuscatedName("vh.M")
	public int texture = -1;

	@ObfuscatedName("vh.D")
	public int chroma;

	@ObfuscatedName("vh.G")
	public int saturation;

	@ObfuscatedName("vh.J")
	public int lightness;

	@ObfuscatedName("vh.Q")
	public int hue;

	@ObfuscatedName("cf.a(II)Lvh;")
	public static FluType list(int arg0) {
		FluType var1 = (FluType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 1);
		FluType var3 = new FluType();
		if (var2 != null) {
			var3.decode(arg0, new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("a.b(B)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("md.a(Lnb;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("vh.a(ZI)V")
	public void getHsl(int arg0) {
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
		this.lightness = (int) (var16 * 256.0D);
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
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
		this.saturation = (int) (var12 * 256.0D);
		double var18 = var14 / 6.0D;
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (var16 > 0.5D) {
			this.chroma = (int) (var12 * (1.0D - var16) * 512.0D);
		} else {
			this.chroma = (int) (var12 * var16 * 512.0D);
		}
		if (this.chroma < 1) {
			this.chroma = 1;
		}
		this.hue = (int) (var18 * (double) this.chroma);
	}

	@ObfuscatedName("vh.a(ILea;I)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("vh.a(IILea;I)V")
	public void decode(int arg0, Packet arg1, int arg2) {
		if (arg0 == 1) {
			this.colour = arg1.g3();
			this.getHsl(this.colour);
		} else if (arg0 == 2) {
			this.texture = arg1.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (arg0 == 3) {
			// materialscale
			arg1.g2();
		}
	}
}
