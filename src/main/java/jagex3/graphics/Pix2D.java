package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.Linkable2;

@ObfuscatedName("sc")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("sc.tb")
	public static int field2748 = 0;

	@ObfuscatedName("sc.wb")
	public static int field2751 = 0;

	@ObfuscatedName("sc.yb")
	public static int field2753 = 0;

	@ObfuscatedName("sc.xb")
	public static int field2752 = 0;
	@ObfuscatedName("sc.sb")
	public static int[] pixels;
	@ObfuscatedName("sc.ub")
	public static int field2749;
	@ObfuscatedName("sc.vb")
	public static int field2750;

	@ObfuscatedName("sc.a(IIIIII)V")
	public static void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method915(arg0, arg1, arg2, arg4, arg5);
		method915(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method917(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method917(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@ObfuscatedName("sc.b(IIII)V")
	public static void setSubClipping(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > field2749) {
			arg2 = field2749;
		}
		if (arg3 > field2750) {
			arg3 = field2750;
		}
		field2752 = arg0;
		field2748 = arg1;
		field2753 = arg2;
		field2751 = arg3;
	}

	@ObfuscatedName("sc.a(IIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg1 < field2748) {
			arg3 -= field2748 - arg1;
			arg1 = field2748;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		if (arg1 + arg3 > field2751) {
			arg3 = field2751 - arg1;
		}
		int var5 = field2749 - arg2;
		int var6 = field2749 * arg1 + arg0;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				pixels[var6++] = arg4;
			}
			var6 += var5;
		}
	}

	@ObfuscatedName("sc.a([I)V")
	public static void method914(int[] arg0) {
		field2752 = arg0[0];
		field2748 = arg0[1];
		field2753 = arg0[2];
		field2751 = arg0[3];
	}

	@ObfuscatedName("sc.b(IIIII)V")
	public static void method915(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field2748 || arg1 >= field2751) {
			return;
		}
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = field2749 * arg1 + arg0;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
			pixels[var9++] = var14;
		}
	}

	@ObfuscatedName("sc.c(IIII)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < field2748 || arg1 >= field2751) {
			return;
		}
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		int var4 = field2749 * arg1 + arg0;
		for (int var5 = 0; var5 < arg2; var5++) {
			pixels[var4 + var5] = arg3;
		}
	}

	@ObfuscatedName("sc.c(IIIII)V")
	public static void method917(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field2752 || arg0 >= field2753) {
			return;
		}
		if (arg1 < field2748) {
			arg2 -= field2748 - arg1;
			arg1 = field2748;
		}
		if (arg1 + arg2 > field2751) {
			arg2 = field2751 - arg1;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = field2749 * arg1 + arg0;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
			pixels[var9] = var14;
			var9 += field2749;
		}
	}

	@ObfuscatedName("sc.b([I)V")
	public static void method918(int[] arg0) {
		arg0[0] = field2752;
		arg0[1] = field2748;
		arg0[2] = field2753;
		arg0[3] = field2751;
	}

	@ObfuscatedName("sc.a()V")
	public static void setClipping() {
		field2752 = 0;
		field2748 = 0;
		field2753 = field2749;
		field2751 = field2750;
	}

	@ObfuscatedName("sc.b()V")
	public static void cls() {
		int var0 = 0;
		int var1 = field2750 * field2749 - 7;
		while (var0 < var1) {
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
		}
		var1 += 7;
		while (var0 < var1) {
			pixels[var0++] = 0;
		}
	}

	@ObfuscatedName("sc.b(IIIIII)V")
	public static void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg1 < field2748) {
			arg3 -= field2748 - arg1;
			arg1 = field2748;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		if (arg1 + arg3 > field2751) {
			arg3 = field2751 - arg1;
		}
		int var6 = 256 - arg5;
		int var7 = (arg4 >> 16 & 0xFF) * arg5;
		int var8 = (arg4 >> 8 & 0xFF) * arg5;
		int var9 = (arg4 & 0xFF) * arg5;
		int var10 = field2749 - arg2;
		int var11 = field2749 * arg1 + arg0;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (pixels[var11] >> 16 & 0xFF) * var6;
				int var15 = (pixels[var11] >> 8 & 0xFF) * var6;
				int var16 = (pixels[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				pixels[var11++] = var17;
			}
			var11 += var10;
		}
	}

	@ObfuscatedName("sc.d(IIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg0, arg1, arg2, arg4);
		hline(arg0, arg1 + arg3 - 1, arg2, arg4);
		vline(arg0, arg1, arg3, arg4);
		vline(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@ObfuscatedName("sc.e(IIIII)V")
	public static void method923(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2 - arg0;
		int var6 = arg3 - arg1;
		if (var6 == 0) {
			if (var5 >= 0) {
				hline(arg0, arg1, var5 + 1, arg4);
			} else {
				hline(arg0 + var5, arg1, 1 - var5, arg4);
			}
		} else if (var5 != 0) {
			if (var5 + var6 < 0) {
				arg0 += var5;
				var5 = -var5;
				arg1 += var6;
				var6 = -var6;
			}
			if (var5 > var6) {
				int var7 = arg1 << 16;
				int var8 = var7 + 32768;
				int var9 = var6 << 16;
				int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
				int var11 = arg0 + var5;
				if (arg0 < field2752) {
					var8 += (field2752 - arg0) * var10;
					arg0 = field2752;
				}
				if (var11 >= field2753) {
					var11 = field2753 - 1;
				}
				while (arg0 <= var11) {
					int var12 = var8 >> 16;
					if (var12 >= field2748 && var12 < field2751) {
						pixels[field2749 * var12 + arg0] = arg4;
					}
					var8 += var10;
					arg0++;
				}
			} else {
				int var13 = arg0 << 16;
				int var14 = var13 + 32768;
				int var15 = var5 << 16;
				int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
				int var17 = arg1 + var6;
				if (arg1 < field2748) {
					var14 += (field2748 - arg1) * var16;
					arg1 = field2748;
				}
				if (var17 >= field2751) {
					var17 = field2751 - 1;
				}
				while (arg1 <= var17) {
					int var18 = var14 >> 16;
					if (var18 >= field2752 && var18 < field2753) {
						pixels[field2749 * arg1 + var18] = arg4;
					}
					var14 += var16;
					arg1++;
				}
			}
		} else if (var6 >= 0) {
			vline(arg0, arg1, var6 + 1, arg4);
		} else {
			vline(arg0, arg1 + var6, -var6 + 1, arg4);
		}
	}

	@ObfuscatedName("sc.d(IIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < field2752 || arg0 >= field2753) {
			return;
		}
		if (arg1 < field2748) {
			arg2 -= field2748 - arg1;
			arg1 = field2748;
		}
		if (arg1 + arg2 > field2751) {
			arg2 = field2751 - arg1;
		}
		int var4 = field2749 * arg1 + arg0;
		for (int var5 = 0; var5 < arg2; var5++) {
			pixels[field2749 * var5 + var4] = arg3;
		}
	}

	@ObfuscatedName("sc.a([III)V")
	public static void setPixels(int[] arg0, int arg1, int arg2) {
		pixels = arg0;
		field2749 = arg1;
		field2750 = arg2;
		setSubClipping(0, 0, arg1, arg2);
	}

	@ObfuscatedName("eb.c([I)[I")
	public static int[] restoreClipping(int[] arg0) {
		return Pix3D.method354(field2752, field2748, field2753, field2751, arg0);
	}
}
