package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.Linkable2;

@ObfuscatedName("sc")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("sc.tb")
	public static int clipMinY = 0;

	@ObfuscatedName("sc.wb")
	public static int clipMaxY = 0;

	@ObfuscatedName("sc.yb")
	public static int field2753 = 0;

	@ObfuscatedName("sc.xb")
	public static int field2752 = 0;
	@ObfuscatedName("sc.sb")
	public static int[] pixels;
	@ObfuscatedName("sc.ub")
	public static int width;
	@ObfuscatedName("sc.vb")
	public static int field2750;

	@ObfuscatedName("sc.a(IIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
		if (arg2 > width) {
			arg2 = width;
		}
		if (arg3 > field2750) {
			arg3 = field2750;
		}
		field2752 = arg0;
		clipMinY = arg1;
		field2753 = arg2;
		clipMaxY = arg3;
	}

	@ObfuscatedName("sc.a(IIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg1 < clipMinY) {
			arg3 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		if (arg1 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg1;
		}
		int var5 = width - arg2;
		int var6 = width * arg1 + arg0;
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
		clipMinY = arg0[1];
		field2753 = arg0[2];
		clipMaxY = arg0[3];
	}

	@ObfuscatedName("sc.b(IIIII)V")
	public static void method915(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < clipMinY || arg1 >= clipMaxY) {
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
		int var9 = width * arg1 + arg0;
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
		if (arg1 < clipMinY || arg1 >= clipMaxY) {
			return;
		}
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		int var4 = width * arg1 + arg0;
		for (int var5 = 0; var5 < arg2; var5++) {
			pixels[var4 + var5] = arg3;
		}
	}

	@ObfuscatedName("sc.c(IIIII)V")
	public static void method917(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field2752 || arg0 >= field2753) {
			return;
		}
		if (arg1 < clipMinY) {
			arg2 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg1 + arg2 > clipMaxY) {
			arg2 = clipMaxY - arg1;
		}
		int var5 = 256 - arg4;
		int var6 = (arg3 >> 16 & 0xFF) * arg4;
		int var7 = (arg3 >> 8 & 0xFF) * arg4;
		int var8 = (arg3 & 0xFF) * arg4;
		int var9 = width * arg1 + arg0;
		for (int var10 = 0; var10 < arg2; var10++) {
			int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
			int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
			int var13 = (pixels[var9] & 0xFF) * var5;
			int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
			pixels[var9] = var14;
			var9 += width;
		}
	}

	@ObfuscatedName("sc.b([I)V")
	public static void method918(int[] arg0) {
		arg0[0] = field2752;
		arg0[1] = clipMinY;
		arg0[2] = field2753;
		arg0[3] = clipMaxY;
	}

	@ObfuscatedName("sc.a()V")
	public static void setClipping() {
		field2752 = 0;
		clipMinY = 0;
		field2753 = width;
		clipMaxY = field2750;
	}

	@ObfuscatedName("sc.b()V")
	public static void cls() {
		int var0 = 0;
		int var1 = field2750 * width - 7;
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
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field2752) {
			arg2 -= field2752 - arg0;
			arg0 = field2752;
		}
		if (arg1 < clipMinY) {
			arg3 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg0 + arg2 > field2753) {
			arg2 = field2753 - arg0;
		}
		if (arg1 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg1;
		}
		int var6 = 256 - arg5;
		int var7 = (arg4 >> 16 & 0xFF) * arg5;
		int var8 = (arg4 >> 8 & 0xFF) * arg5;
		int var9 = (arg4 & 0xFF) * arg5;
		int var10 = width - arg2;
		int var11 = width * arg1 + arg0;
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
	public static void line(int arg0, int arg1, int arg2, int arg3, int arg4) {
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
					if (var12 >= clipMinY && var12 < clipMaxY) {
						pixels[width * var12 + arg0] = arg4;
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
				if (arg1 < clipMinY) {
					var14 += (clipMinY - arg1) * var16;
					arg1 = clipMinY;
				}
				if (var17 >= clipMaxY) {
					var17 = clipMaxY - 1;
				}
				while (arg1 <= var17) {
					int var18 = var14 >> 16;
					if (var18 >= field2752 && var18 < field2753) {
						pixels[width * arg1 + var18] = arg4;
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
		if (arg1 < clipMinY) {
			arg2 -= clipMinY - arg1;
			arg1 = clipMinY;
		}
		if (arg1 + arg2 > clipMaxY) {
			arg2 = clipMaxY - arg1;
		}
		int var4 = width * arg1 + arg0;
		for (int var5 = 0; var5 < arg2; var5++) {
			pixels[width * var5 + var4] = arg3;
		}
	}

	@ObfuscatedName("sc.a([III)V")
	public static void setPixels(int[] arg0, int arg1, int arg2) {
		pixels = arg0;
		width = arg1;
		field2750 = arg2;
		setSubClipping(0, 0, arg1, arg2);
	}

	@ObfuscatedName("eb.c([I)[I")
	public static int[] restoreClipping(int[] arg0) {
		return Pix3D.setClipping(field2752, clipMinY, field2753, clipMaxY, arg0);
	}
}
