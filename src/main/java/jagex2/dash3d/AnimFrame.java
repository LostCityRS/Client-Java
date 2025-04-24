package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("h")
public class AnimFrame {

	@ObfuscatedName("h.c")
	public static AnimFrame[] instances;

	@ObfuscatedName("h.d")
	public int id;

	@ObfuscatedName("h.e")
	public AnimBase base;

	@ObfuscatedName("h.f")
	public int length;

	@ObfuscatedName("h.g")
	public int[] groups;

	@ObfuscatedName("h.h")
	public int[] x;

	@ObfuscatedName("h.i")
	public int[] y;

	@ObfuscatedName("h.j")
	public int[] z;

	@ObfuscatedName("h.a(I)V")
	public static void init(int arg0) {
		instances = new AnimFrame[arg0 + 1];
	}

	@ObfuscatedName("h.a(I[B)V")
	public static void unpack(int arg0, byte[] arg1) {
		Packet var2 = new Packet(arg1);
		var2.pos = arg1.length - 8;
		int var3 = var2.g2();
		int var4 = var2.g2();
		int var5 = var2.g2();
		int var6 = var2.g2();
		byte var7 = 0;
		Packet var8 = new Packet(arg1);
		int var9 = 88 / arg0;
		var8.pos = var7;
		int var10 = var3 + 2 + var7;
		Packet var11 = new Packet(arg1);
		var11.pos = var10;
		int var12 = var4 + var10;
		Packet var13 = new Packet(arg1);
		var13.pos = var12;
		int var14 = var5 + var12;
		Packet var15 = new Packet(arg1);
		var15.pos = var14;
		int var16 = var6 + var14;
		Packet var17 = new Packet(arg1);
		var17.pos = var16;
		AnimBase var18 = new AnimBase(var17);
		int var19 = var8.g2();
		int[] var20 = new int[500];
		int[] var21 = new int[500];
		int[] var22 = new int[500];
		int[] var23 = new int[500];
		for (int var24 = 0; var24 < var19; var24++) {
			int var25 = var8.g2();
			AnimFrame var26 = instances[var25] = new AnimFrame();
			var26.id = var15.g1();
			var26.base = var18;
			int var27 = var8.g1();
			int var28 = -1;
			int var29 = 0;
			for (int var30 = 0; var30 < var27; var30++) {
				int var32 = var11.g1();
				if (var32 > 0) {
					if (var18.types[var30] != 0) {
						for (int var33 = var30 - 1; var33 > var28; var33--) {
							if (var18.types[var33] == 0) {
								var20[var29] = var33;
								var21[var29] = 0;
								var22[var29] = 0;
								var23[var29] = 0;
								var29++;
								break;
							}
						}
					}
					var20[var29] = var30;
					short var34 = 0;
					if (var18.types[var20[var29]] == 3) {
						var34 = 128;
					}
					if ((var32 & 0x1) == 0) {
						var21[var29] = var34;
					} else {
						var21[var29] = var13.gsmart();
					}
					if ((var32 & 0x2) == 0) {
						var22[var29] = var34;
					} else {
						var22[var29] = var13.gsmart();
					}
					if ((var32 & 0x4) == 0) {
						var23[var29] = var34;
					} else {
						var23[var29] = var13.gsmart();
					}
					var28 = var30;
					var29++;
				}
			}
			var26.length = var29;
			var26.groups = new int[var29];
			var26.x = new int[var29];
			var26.y = new int[var29];
			var26.z = new int[var29];
			for (int var31 = 0; var31 < var29; var31++) {
				var26.groups[var31] = var20[var31];
				var26.x[var31] = var21[var31];
				var26.y[var31] = var22[var31];
				var26.z[var31] = var23[var31];
			}
		}
	}

	@ObfuscatedName("h.a(B)V")
	public static void unload() {
		instances = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame get(int arg0) {
		if (instances == null) {
			return null;
		} else {
			return instances[arg0];
		}
	}
}
