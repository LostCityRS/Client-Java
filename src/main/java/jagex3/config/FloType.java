package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("fc")
public final class FloType extends Linkable2 {

	@ObfuscatedName("nb.dd")
	public static Js5 configClient;
	@ObfuscatedName("m.d")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("fc.Qb")
	public boolean occlude = true;

	@ObfuscatedName("fc.Ab")
	public int texture = -1;

	@ObfuscatedName("fc.Ob")
	public int mapcolour = -1;

	@ObfuscatedName("fc.Xb")
	public int colour = 0;

	@ObfuscatedName("fc.yb")
	public int lightness;

	@ObfuscatedName("fc.Ib")
	public int mapLightness;

	@ObfuscatedName("fc.Kb")
	public int hue;

	@ObfuscatedName("fc.Mb")
	public int mapHue;

	@ObfuscatedName("fc.Pb")
	public int saturation;

	@ObfuscatedName("fc.Yb")
	public int mapSaturation;

	@ObfuscatedName("na.a(Lbd;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("vd.b(II)Lfc;")
	public static FloType list(int arg0) {
		FloType var1 = (FloType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 4);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.decode(arg0, new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("cb.a(Z)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("fc.a(BILba;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(arg0, arg1, var3);
		}
	}

	@ObfuscatedName("fc.c(B)V")
	public void postDecode() {
		if (this.mapcolour != -1) {
			this.getHsl(this.mapcolour);
			this.mapLightness = this.lightness;
			this.mapSaturation = this.saturation;
			this.mapHue = this.hue;
		}
		this.getHsl(this.colour);
	}

	@ObfuscatedName("fc.a(ILba;IB)V")
	public void decode(int arg0, Packet arg1, int arg2) {
		if (arg2 == 1) {
			this.colour = arg1.g3();
		} else if (arg2 == 2) {
			this.texture = arg1.g1();
		} else if (arg2 == 5) {
			this.occlude = false;
		} else if (arg2 == 7) {
			this.mapcolour = arg1.g3();
		}
	}

	@ObfuscatedName("fc.c(II)V")
	public void getHsl(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var8 > var6) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		if (var6 > var10) {
			var10 = var6;
		}
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.hue = (int) (var18 * 256.0D);
		this.lightness = (int) (var16 * 256.0D);
		this.saturation = (int) (var14 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
	}
}
