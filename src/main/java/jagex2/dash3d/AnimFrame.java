package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("h")
public class AnimFrame {

	@ObfuscatedName("h.b")
	public static AnimFrame[] list;

	@ObfuscatedName("h.c")
	public int delay;

	@ObfuscatedName("h.d")
	public AnimBase base;

	@ObfuscatedName("h.e")
	public int size;

	@ObfuscatedName("h.f")
	public int[] ti;

	@ObfuscatedName("h.g")
	public int[] tx;

	@ObfuscatedName("h.h")
	public int[] ty;

	@ObfuscatedName("h.i")
	public int[] tz;

	@ObfuscatedName("h.j")
	public static boolean[] opaque;

	@ObfuscatedName("h.a(I)V")
	public static void init(int arg0) {
		list = new AnimFrame[arg0 + 1];
		opaque = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			opaque[var1] = true;
		}
	}

	@ObfuscatedName("h.a(I[B)V")
	public static void unpack(byte[] arg1) {
		Packet var2 = new Packet(arg1);
		var2.pos = arg1.length - 8;
		int var3 = var2.g2();
		int var4 = var2.g2();
		int var5 = var2.g2();
		int var6 = var2.g2();
		byte var7 = 0;
		Packet var8 = new Packet(arg1);
		var8.pos = var7;
		int var9 = var7 + var3 + 2;
		Packet var10 = new Packet(arg1);
		var10.pos = var9;
		int var11 = var9 + var4;
		Packet var12 = new Packet(arg1);
		var12.pos = var11;
		int var13 = var11 + var5;
		Packet var14 = new Packet(arg1);
		var14.pos = var13;
		int var15 = var13 + var6;
		Packet var16 = new Packet(arg1);
		var16.pos = var15;
		AnimBase var17 = new AnimBase(var16);
		int var18 = var8.g2();
		int[] var19 = new int[500];
		int[] var20 = new int[500];
		int[] var21 = new int[500];
		int[] var22 = new int[500];
		for (int var23 = 0; var23 < var18; var23++) {
			int var24 = var8.g2();
			AnimFrame var25 = list[var24] = new AnimFrame();
			var25.delay = var14.g1();
			var25.base = var17;
			int var26 = var8.g1();
			int var27 = -1;
			int var28 = 0;
			for (int var29 = 0; var29 < var26; var29++) {
				int var30 = var10.g1();
				if (var30 > 0) {
					if (var17.types[var29] != 0) {
						for (int var31 = var29 - 1; var31 > var27; var31--) {
							if (var17.types[var31] == 0) {
								var19[var28] = var31;
								var20[var28] = 0;
								var21[var28] = 0;
								var22[var28] = 0;
								var28++;
								break;
							}
						}
					}
					var19[var28] = var29;
					short var32 = 0;
					if (var17.types[var29] == 3) {
						var32 = 128;
					}
					if ((var30 & 0x1) == 0) {
						var20[var28] = var32;
					} else {
						var20[var28] = var12.gsmart();
					}
					if ((var30 & 0x2) == 0) {
						var21[var28] = var32;
					} else {
						var21[var28] = var12.gsmart();
					}
					if ((var30 & 0x4) == 0) {
						var22[var28] = var32;
					} else {
						var22[var28] = var12.gsmart();
					}
					var27 = var29;
					var28++;
					if (var17.types[var29] == 5) {
						opaque[var24] = false;
					}
				}
			}
			var25.size = var28;
			var25.ti = new int[var28];
			var25.tx = new int[var28];
			var25.ty = new int[var28];
			var25.tz = new int[var28];
			for (int var33 = 0; var33 < var28; var33++) {
				var25.ti[var33] = var19[var33];
				var25.tx[var33] = var20[var33];
				var25.ty[var33] = var21[var33];
				var25.tz[var33] = var22[var33];
			}
		}
	}

	@ObfuscatedName("h.b(I)V")
	public static void unload() {
		list = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame get(int arg1) {
		return list == null ? null : list[arg1];
	}

	@ObfuscatedName("h.a(BI)Z")
	public static boolean shareAlpha(int arg1) {
		return arg1 == -1;
	}
}
