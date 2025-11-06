package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("h")
public class AnimFrame {

	@ObfuscatedName("h.b")
	public static AnimFrame[] field163;

	@ObfuscatedName("h.c")
	public int field164;

	@ObfuscatedName("h.d")
	public AnimBase field165;

	@ObfuscatedName("h.e")
	public int field166;

	@ObfuscatedName("h.f")
	public int[] field167;

	@ObfuscatedName("h.g")
	public int[] field168;

	@ObfuscatedName("h.h")
	public int[] field169;

	@ObfuscatedName("h.i")
	public int[] field170;

	@ObfuscatedName("h.j")
	public static boolean[] field171;

	@ObfuscatedName("h.a(I)V")
	public static void method58(int arg0) {
		field163 = new AnimFrame[arg0 + 1];
		field171 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field171[var1] = true;
		}
	}

	@ObfuscatedName("h.a(I[B)V")
	public static void method59(byte[] arg1) {
		Packet var2 = new Packet(arg1);
		var2.field711 = arg1.length - 8;
		int var3 = var2.method241();
		int var4 = var2.method241();
		int var5 = var2.method241();
		int var6 = var2.method241();
		byte var7 = 0;
		Packet var8 = new Packet(arg1);
		var8.field711 = var7;
		int var9 = var7 + var3 + 2;
		Packet var10 = new Packet(arg1);
		var10.field711 = var9;
		int var11 = var9 + var4;
		Packet var12 = new Packet(arg1);
		var12.field711 = var11;
		int var13 = var11 + var5;
		Packet var14 = new Packet(arg1);
		var14.field711 = var13;
		int var15 = var13 + var6;
		Packet var16 = new Packet(arg1);
		var16.field711 = var15;
		AnimBase var17 = new AnimBase(var16);
		int var18 = var8.method241();
		int[] var19 = new int[500];
		int[] var20 = new int[500];
		int[] var21 = new int[500];
		int[] var22 = new int[500];
		for (int var23 = 0; var23 < var18; var23++) {
			int var24 = var8.method241();
			AnimFrame var25 = field163[var24] = new AnimFrame();
			var25.field164 = var14.method239();
			var25.field165 = var17;
			int var26 = var8.method239();
			int var27 = -1;
			int var28 = 0;
			for (int var29 = 0; var29 < var26; var29++) {
				int var30 = var10.method239();
				if (var30 > 0) {
					if (var17.field160[var29] != 0) {
						for (int var31 = var29 - 1; var31 > var27; var31--) {
							if (var17.field160[var31] == 0) {
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
					if (var17.field160[var29] == 3) {
						var32 = 128;
					}
					if ((var30 & 0x1) == 0) {
						var20[var28] = var32;
					} else {
						var20[var28] = var12.method252();
					}
					if ((var30 & 0x2) == 0) {
						var21[var28] = var32;
					} else {
						var21[var28] = var12.method252();
					}
					if ((var30 & 0x4) == 0) {
						var22[var28] = var32;
					} else {
						var22[var28] = var12.method252();
					}
					var27 = var29;
					var28++;
					if (var17.field160[var29] == 5) {
						field171[var24] = false;
					}
				}
			}
			var25.field166 = var28;
			var25.field167 = new int[var28];
			var25.field168 = new int[var28];
			var25.field169 = new int[var28];
			var25.field170 = new int[var28];
			for (int var33 = 0; var33 < var28; var33++) {
				var25.field167[var33] = var19[var33];
				var25.field168[var33] = var20[var33];
				var25.field169[var33] = var21[var33];
				var25.field170[var33] = var22[var33];
			}
		}
	}

	@ObfuscatedName("h.b(I)V")
	public static void method60() {
		field163 = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame method61(int arg1) {
		return field163 == null ? null : field163[arg1];
	}

	@ObfuscatedName("h.a(BI)Z")
	public static boolean method62(int arg1) {
		return arg1 == -1;
	}
}
