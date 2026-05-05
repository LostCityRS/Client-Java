package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("af")
public final class FloType extends Linkable2 {

	@ObfuscatedName("b.g")
	public static final LruCache recentUse = new LruCache(64);

	@ObfuscatedName("mh.W")
	public static Js5 configClient;
	@ObfuscatedName("nj.b")
	public static int numDefinitions;
	@ObfuscatedName("mb.Z")
	public static int defaultWater = 0;

	@ObfuscatedName("af.L")
	public int waterfogcolour = 1190717;

	@ObfuscatedName("af.M")
	public int mapcolour = -1;

	@ObfuscatedName("af.W")
	public int waterfogscale = 16;

	@ObfuscatedName("af.F")
	public int texture = -1;

	@ObfuscatedName("af.X")
	public boolean occlude = true;

	@ObfuscatedName("af.V")
	public int colour = 0;

	@ObfuscatedName("jc.b(IZ)Laf;")
	public static FloType list(int arg0) {
		FloType var1 = (FloType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 4);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.decode(new Packet(var2), arg0);
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oh.c(I)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("mf.a(BLnb;)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
		numDefinitions = configClient.getFileIdLimit(4);
	}

	@ObfuscatedName("m.a(IB)I")
	public static int getHsl(int arg0) {
		return arg0 == 16711935 ? -1 : getColour(arg0);
	}

	@ObfuscatedName("ve.a(IZ)I")
	public static int getColour(int arg0) {
		double var1 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 & 0xFF) / 256.0D;
		double var7 = var3;
		if (var3 < var1) {
			var7 = var1;
		}
		double var9 = 0.0D;
		double var11 = var3;
		if (var1 < var3) {
			var11 = var1;
		}
		if (var7 < var5) {
			var7 = var5;
		}
		if (var11 > var5) {
			var11 = var5;
		}
		double var13 = 0.0D;
		double var15 = (var11 + var7) / 2.0D;
		if (var11 != var7) {
			if (var15 < 0.5D) {
				var9 = (var7 - var11) / (var7 + var11);
			}
			if (var3 == var7) {
				var13 = (var1 - var5) / (var7 - var11);
			} else if (var7 == var1) {
				var13 = (var5 - var3) / (var7 - var11) + 2.0D;
			} else if (var5 == var7) {
				var13 = (var3 - var1) / (-var11 + var7) + 4.0D;
			}
			if (var15 >= 0.5D) {
				var9 = (var7 - var11) / (2.0D - var11 - var7);
			}
		}
		double var17 = var13 / 6.0D;
		int var19 = (int) (var9 * 256.0D);
		int var20 = (int) (var17 * 256.0D);
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}
		int var21 = (int) (var15 * 256.0D);
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		if (var21 > 243) {
			var19 >>= 0x4;
		} else if (var21 > 217) {
			var19 >>= 0x3;
		} else if (var21 > 192) {
			var19 >>= 0x2;
		} else if (var21 > 179) {
			var19 >>= 0x1;
		}
		return (var19 >> 5 << 7) + (var20 >> 2 << 10) + (var21 >> 1);
	}

	@ObfuscatedName("af.a(ILea;I)V")
	public void decode(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}
			this.decode(arg1, var3, arg0);
		}
	}

	@ObfuscatedName("af.a(IIILea;)V")
	public void decode(int arg0, int arg1, Packet arg2) {
		if (arg1 == 1) {
			this.colour = getHsl(arg2.g3());
		} else if (arg1 == 2) {
			this.texture = arg2.g1();
		} else if (arg1 == 3) {
			this.texture = arg2.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (arg1 == 5) {
			this.occlude = false;
		} else if (arg1 == 7) {
			this.mapcolour = getHsl(arg2.g3());
		} else if (arg1 == 8) {
			defaultWater = arg0;
		} else if (arg1 == 9) {
			// materialscale
			arg2.g2();
		} else if (arg1 == 10) {
			// hardshadow
		} else if (arg1 == 11) {
			// priority
			arg2.g1();
		} else if (arg1 == 12) {
			// blend
		} else if (arg1 == 13) {
			this.waterfogcolour = arg2.g3();
		} else if (arg1 == 14) {
			this.waterfogscale = arg2.g1();
		}
	}
}
