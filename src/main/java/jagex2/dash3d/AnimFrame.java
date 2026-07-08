package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("g")
public final class AnimFrame {

	@ObfuscatedName("g.e")
	public AnimBase base;

	@ObfuscatedName("g.f")
	public int size;

	@ObfuscatedName("g.g")
	public int[] ti;

	@ObfuscatedName("g.h")
	public int[] tx;

	@ObfuscatedName("g.i")
	public int[] ty;

	@ObfuscatedName("g.j")
	public int[] tz;

	@ObfuscatedName("g.a")
	public static int field145;

	@ObfuscatedName("g.b")
	public static int field146 = 2;

	@ObfuscatedName("g.c")
	public static AnimFrame[] list;

	@ObfuscatedName("g.d")
	public int delay;

	@ObfuscatedName("g.k")
	public static boolean[] opaque;

	@ObfuscatedName("g.a(II)Z")
	public static boolean animateTransparencies(int arg0) {
		return arg0 == -1;
	}

	@ObfuscatedName("g.a(I)V")
	public static void init(int arg0) {
		list = new AnimFrame[arg0 + 1];
		opaque = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			opaque[var1] = true;
		}
	}

	@ObfuscatedName("g.a(I[B)V")
	public static void unpack(byte[] arg0) {
		Packet var1 = new Packet(arg0, 15787);
		var1.pos = arg0.length - 8;
		int var2 = var1.g2();
		int var3 = var1.g2();
		int var4 = var1.g2();
		int var5 = var1.g2();
		Packet var6 = new Packet(arg0, 15787);
		var6.pos = 0;
		int var7 = var2 + 2;
		Packet var8 = new Packet(arg0, 15787);
		var8.pos = var7;
		int var9 = var7 + var3;
		Packet var10 = new Packet(arg0, 15787);
		var10.pos = var9;
		int var11 = var9 + var4;
		Packet var12 = new Packet(arg0, 15787);
		var12.pos = var11;
		int var13 = var11 + var5;
		Packet var14 = new Packet(arg0, 15787);
		var14.pos = var13;
		AnimBase var15 = new AnimBase(var14, field145);
		int var16 = var6.g2();
		int[] var17 = new int[500];
		int[] var18 = new int[500];
		int[] var19 = new int[500];
		int[] var20 = new int[500];
		for (int var21 = 0; var21 < var16; var21++) {
			int var22 = var6.g2();
			AnimFrame var23 = list[var22] = new AnimFrame();
			var23.delay = var12.g1();
			var23.base = var15;
			int var24 = var6.g1();
			int var25 = -1;
			int var26 = 0;
			for (int var27 = 0; var27 < var24; var27++) {
				int var28 = var8.g1();
				if (var28 > 0) {
					if (var15.type[var27] != 0) {
						for (int var29 = var27 - 1; var29 > var25; var29--) {
							if (var15.type[var29] == 0) {
								var17[var26] = var29;
								var18[var26] = 0;
								var19[var26] = 0;
								var20[var26] = 0;
								var26++;
								break;
							}
						}
					}
					var17[var26] = var27;
					short var30 = 0;
					if (var15.type[var27] == 3) {
						var30 = 128;
					}
					if ((var28 & 0x1) == 0) {
						var18[var26] = var30;
					} else {
						var18[var26] = var10.gsmarts();
					}
					if ((var28 & 0x2) == 0) {
						var19[var26] = var30;
					} else {
						var19[var26] = var10.gsmarts();
					}
					if ((var28 & 0x4) == 0) {
						var20[var26] = var30;
					} else {
						var20[var26] = var10.gsmarts();
					}
					var25 = var27;
					var26++;
					if (var15.type[var27] == 5) {
						opaque[var22] = false;
					}
				}
			}
			var23.size = var26;
			var23.ti = new int[var26];
			var23.tx = new int[var26];
			var23.ty = new int[var26];
			var23.tz = new int[var26];
			for (int var31 = 0; var31 < var26; var31++) {
				var23.ti[var31] = var17[var31];
				var23.tx[var31] = var18[var31];
				var23.ty[var31] = var19[var31];
				var23.tz[var31] = var20[var31];
			}
		}
	}

	@ObfuscatedName("g.a(B)V")
	public static void unload() {
		list = null;
	}

	@ObfuscatedName("g.a(IB)Lg;")
	public static AnimFrame get(int arg0, byte arg1) {
		if (arg1 != 4) {
			field146 = -60;
		}
		if (list == null) {
			return null;
		}
		return list[arg0];
	}
}
