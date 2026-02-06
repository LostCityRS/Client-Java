package deob;

import java.awt.Component;

@ObfuscatedName("uf")
public abstract class class145 {

	@ObfuscatedName("uf.a")
	public static int[] field3294 = new int[5];

	@ObfuscatedName("uf.d")
	public static boolean[] field3297 = new boolean[100];

	@ObfuscatedName("uf.f")
	public static int field3299 = 0;

	@ObfuscatedName("uf.g")
	public static class32 field3300 = class73.method593("Unable to connect)3", true);

	@ObfuscatedName("uf.c")
	public static class32 field3296 = field3300;

	@ObfuscatedName("uf.h")
	public static int field3301 = 0;

	@ObfuscatedName("uf.i")
	public static class32 field3302 = field3300;

	@ObfuscatedName("uf.k")
	public static class32 field3304 = class73.method593("<img=1>", true);

	@ObfuscatedName("uf.l")
	public static class32 field3305 = class73.method593(" Sekunde(Xn(Y -Ubertragen)3", true);

	@ObfuscatedName("uf.n")
	public static class32 field3307 = class73.method593(":assist:", true);

	@ObfuscatedName("uf.a(I)V")
	public static void method1086() {
		field3300 = null;
		field3297 = null;
		field3294 = null;
		field3304 = null;
		field3302 = null;
		field3305 = null;
		field3307 = null;
		field3296 = null;
	}

	@ObfuscatedName("uf.a(Lqd;I)V")
	public static void method1087(class115 arg0) {
		arg0.field2708 = arg0.field2687;
		if (arg0.field2696 == 0) {
			arg0.field2694 = 0;
			return;
		}
		if (arg0.field2712 != -1 && arg0.field2715 == 0) {
			class149 var1 = class97.method760(arg0.field2712);
			if (arg0.field2748 > 0 && var1.field3382 == 0) {
				arg0.field2694++;
				return;
			}
			if (arg0.field2748 <= 0 && var1.field3381 == 0) {
				arg0.field2694++;
				return;
			}
		}
		int var2 = arg0.field2747;
		int var3 = arg0.field2698;
		int var4 = arg0.field2711 * 64 + arg0.field2736[arg0.field2696 - 1] * 128;
		int var5 = arg0.field2711 * 64 + arg0.field2759[arg0.field2696 - 1] * 128;
		if (var5 - var2 > 256 || var5 - var2 < -256 || var4 - var3 > 256 || var4 - var3 < -256) {
			arg0.field2747 = var5;
			arg0.field2698 = var4;
			return;
		}
		if (var5 <= var2) {
			if (var5 >= var2) {
				if (var4 > var3) {
					arg0.field2742 = 1024;
				} else if (var4 < var3) {
					arg0.field2742 = 0;
				}
			} else if (var4 > var3) {
				arg0.field2742 = 768;
			} else if (var4 < var3) {
				arg0.field2742 = 256;
			} else {
				arg0.field2742 = 512;
			}
		} else if (var3 < var4) {
			arg0.field2742 = 1280;
		} else if (var3 <= var4) {
			arg0.field2742 = 1536;
		} else {
			arg0.field2742 = 1792;
		}
		int var6 = 4;
		boolean var7 = true;
		int var8 = arg0.field2742 - arg0.field2745 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.field2734;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.field2709;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.field2729;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.field2723;
		}
		if (var9 == -1) {
			var9 = arg0.field2709;
		}
		arg0.field2708 = var9;
		if (arg0 instanceof class111) {
			var7 = ((class111) arg0).field2595.field2241;
		}
		if (var7) {
			if (arg0.field2745 != arg0.field2742 && arg0.field2756 == -1 && arg0.field2693 != 0) {
				var6 = 2;
			}
			if (arg0.field2696 > 2) {
				var6 = 6;
			}
			if (arg0.field2696 > 3) {
				var6 = 8;
			}
			if (arg0.field2694 > 0 && arg0.field2696 > 1) {
				var6 = 8;
				arg0.field2694--;
			}
		} else {
			if (arg0.field2696 > 1) {
				var6 = 6;
			}
			if (arg0.field2696 > 2) {
				var6 = 8;
			}
			if (arg0.field2694 > 0 && arg0.field2696 > 1) {
				var6 = 8;
				arg0.field2694--;
			}
		}
		if (arg0.field2733[arg0.field2696 - 1]) {
			var6 <<= 0x1;
		}
		if (var2 < var5) {
			arg0.field2747 += var6;
			if (arg0.field2747 > var5) {
				arg0.field2747 = var5;
			}
		} else if (var2 > var5) {
			arg0.field2747 -= var6;
			if (arg0.field2747 < var5) {
				arg0.field2747 = var5;
			}
		}
		if (var6 >= 8 && arg0.field2709 == arg0.field2708 && arg0.field2705 != -1) {
			arg0.field2708 = arg0.field2705;
		}
		if (var4 > var3) {
			arg0.field2698 += var6;
			if (var4 < arg0.field2698) {
				arg0.field2698 = var4;
			}
		} else if (var4 < var3) {
			arg0.field2698 -= var6;
			if (var4 > arg0.field2698) {
				arg0.field2698 = var4;
			}
		}
		if (arg0.field2747 == var5 && arg0.field2698 == var4) {
			if (arg0.field2748 > 0) {
				arg0.field2748--;
			}
			arg0.field2696--;
		}
	}

	@ObfuscatedName("uf.a(Lf;B)Lf;")
	public static class36 method1088(class36 arg0) {
		class36 var1 = class15.method111(arg0);
		if (var1 == null) {
			var1 = arg0.field824;
		}
		return var1;
	}

	@ObfuscatedName("uf.b(B)Z")
	public static boolean method1089() {
		class80 var0 = class38.field919;
		synchronized (class38.field919) {
			if (class39.field936 == class1.field8) {
				return false;
			} else {
				class13.field224 = class144.field3285[class1.field8];
				class109.field2562 = class106.field2518[class1.field8];
				class1.field8 = class1.field8 + 1 & 0x7F;
				return true;
			}
		}
	}

	@ObfuscatedName("uf.a(IZB)Lec;")
	public static class32 method1090(int arg0) {
		return class124.method975(arg0, true);
	}

	@ObfuscatedName("uf.a(Ljava/awt/Component;Z)V")
	public abstract void method454(Component arg0);

	@ObfuscatedName("uf.a(B)I")
	public abstract int method456();

	@ObfuscatedName("uf.a(ILjava/awt/Component;)V")
	public abstract void method455(Component arg0);
}
