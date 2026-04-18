package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("md")
public final class FluType extends Linkable2 {

	@ObfuscatedName("nb.jd")
	public static Js5 configClient;
	@ObfuscatedName("rd.f")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("md.tb")
	public int lightness;

	@ObfuscatedName("md.vb")
	public int hue;

	@ObfuscatedName("md.Jb")
	public int colour = 0;

	@ObfuscatedName("md.yb")
	public int chroma;

	@ObfuscatedName("md.Eb")
	public int saturation;

	@ObfuscatedName("md.a(Lbd;B)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("dc.a(BI)Lmd;")
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
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("bd.b(Z)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("md.b(IB)V")
	public void getHsl(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var2 > var6) {
			var8 = var6;
		}
		if (var4 < var8) {
			var8 = var4;
		}
		double var10 = var2;
		if (var2 < var6) {
			var10 = var6;
		}
		double var12 = 0.0D;
		if (var10 < var4) {
			var10 = var4;
		}
		double var14 = (var8 + var10) / 2.0D;
		this.lightness = (int) (var14 * 256.0D);
		double var16 = 0.0D;
		if (var8 != var10) {
			if (var14 < 0.5D) {
				var16 = (var10 - var8) / (var8 + var10);
			}
			if (var14 >= 0.5D) {
				var16 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var6 - var4) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = (var4 - var2) / (var10 - var8) + 2.0D;
			} else if (var4 == var10) {
				var12 = (var2 - var6) / (-var8 + var10) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (var14 > 0.5D) {
			this.chroma = (int) ((1.0D - var14) * var16 * 512.0D);
		} else {
			this.chroma = (int) (var14 * var16 * 512.0D);
		}
		this.saturation = (int) (var16 * 256.0D);
		if (this.chroma < 1) {
			this.chroma = 1;
		}
		this.hue = (int) ((double) this.chroma * var18);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
			return;
		}
	}

	@ObfuscatedName("md.b(Z)V")
	public void postDecode() {
		this.getHsl(this.colour);
	}

	@ObfuscatedName("md.a(BILba;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("md.a(BILba;I)V")
	public void decode(int arg0, Packet arg1, int arg2) {
		if (arg0 == 1) {
			this.colour = arg1.g3();
		}
	}
}
