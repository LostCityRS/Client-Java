package deob;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

@ObfuscatedName("te")
public final class class137 implements Runnable {

	@ObfuscatedName("te.a")
	public static int[] field3173 = new int[25];

	@ObfuscatedName("te.b")
	public static class132 field3174;

	@ObfuscatedName("te.d")
	public static int[] field3176 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("te.e")
	public static class32 field3177 = class73.method593("glow2:", true);

	@ObfuscatedName("te.f")
	public static int field3178 = 0;

	@ObfuscatedName("te.h")
	public static int field3180 = -1;

	@ObfuscatedName("te.j")
	public static class32 field3182 = class73.method593("<col=ffff00>", true);

	@ObfuscatedName("te.l")
	public static class32 field3184 = class73.method593("mapback", true);

	@ObfuscatedName("te.m")
	public static class63 field3185 = new class63(30);

	@ObfuscatedName("te.n")
	public static class104[] field3186 = new class104[4];

	@ObfuscatedName("te.o")
	public static int[] field3187 = new int[2048];

	@ObfuscatedName("te.p")
	public static class32 field3188 = field3177;

	@ObfuscatedName("te.r")
	public static class32 field3190 = class73.method593("Lade Titelbild )2 ", true);

	@ObfuscatedName("te.s")
	public static int field3191 = -1;

	@ObfuscatedName("te.t")
	public static class32 field3192 = field3177;

	@ObfuscatedName("te.u")
	public static class30 field3193;

	@ObfuscatedName("te.v")
	public static int field3194 = 0;

	@ObfuscatedName("te.a(Z)V")
	public static void method1037() {
		if (class107.field2540[98]) {
			class134.field3121 += (12 - class134.field3121) / 2;
		} else if (class107.field2540[99]) {
			class134.field3121 += (-class134.field3121 - 12) / 2;
		} else {
			class134.field3121 /= 2;
		}
		class133.field3082 += class134.field3121 / 2;
		if (class133.field3082 < 128) {
			class133.field3082 = 128;
		}
		if (class133.field3082 > 383) {
			class133.field3082 = 383;
		}
		if (class107.field2540[96]) {
			class110.field2577 += (-class110.field2577 - 24) / 2;
		} else if (class107.field2540[97]) {
			class110.field2577 += (24 - class110.field2577) / 2;
		} else {
			class110.field2577 /= 2;
		}
		class133.field3054 = class133.field3054 + class110.field2577 / 2 & 0x7FF;
		int var0 = class133.field3067 + class20.field373.field2747;
		int var1 = class13.field225 + class20.field373.field2698;
		if (class57.field1319 - var0 < -500 || class57.field1319 - var0 > 500 || class107.field2536 - var1 < -500 || class107.field2536 - var1 > 500) {
			class107.field2536 = var1;
			class57.field1319 = var0;
		}
		if (class57.field1319 != var0) {
			class57.field1319 += (var0 - class57.field1319) / 16;
		}
		if (var1 != class107.field2536) {
			class107.field2536 += (var1 - class107.field2536) / 16;
		}
		int var2 = class57.field1319 >> 7;
		int var3 = 0;
		int var4 = class107.field2536 >> 7;
		int var5 = class83.method653(class43.field989, class57.field1319, class107.field2536);
		if (var2 > 3 && var4 > 3 && var2 < 100 && var4 < 100) {
			for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
				for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
					int var8 = class43.field989;
					if (var8 < 3 && (class3.field50[1][var6][var7] & 0x2) == 2) {
						var8++;
					}
					int var9 = var5 - class70.field1630[var8][var6][var7];
					if (var9 > var3) {
						var3 = var9;
					}
				}
			}
		}
		int var10 = var3 * 192;
		if (var10 > 98048) {
			var10 = 98048;
		}
		if (var10 < 32768) {
			var10 = 32768;
		}
		if (var10 > class26.field469) {
			class26.field469 += (var10 - class26.field469) / 24;
		} else if (class26.field469 > var10) {
			class26.field469 += (var10 - class26.field469) / 80;
		}
	}

	@ObfuscatedName("te.a(B)V")
	public static void method1039() {
		for (class23 var0 = (class23) class45.field1076.method1211(); var0 != null; var0 = (class23) class45.field1076.method1209()) {
			if (var0.field411 == -1) {
				var0.field412 = 0;
				class5.method20(var0);
			} else {
				var0.method1091();
			}
		}
	}

	@ObfuscatedName("te.a(I)V")
	public static void method1040() {
		class109 var0 = class38.field909;
		synchronized (class38.field909) {
			class86.field2016 = class82.field1917;
			class86.field2001 = class126.field2915;
			class140.field3216 = class44.field1037;
			class79.field1826 = class158.field3613;
			class9.field166 = class151.field3467;
			class66.field1589 = class15.field288;
			class84.field1974 = class31.field610;
			class158.field3613 = 0;
		}
	}

	@ObfuscatedName("te.a(Lec;ILjava/awt/Color;I)V")
	public static void method1041(class32 arg0, Color arg1, int arg2) {
		try {
			Graphics var3 = class107.field2539.getGraphics();
			if (class32.field656 == null) {
				class32.field656 = new Font("Helvetica", 1, 13);
				class112.field2631 = class107.field2539.getFontMetrics(class32.field656);
			}
			if (class1.field3) {
				class1.field3 = false;
				var3.setColor(Color.black);
				var3.fillRect(0, 0, class144.field3292, class33.field696);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (class102.field2395 == null) {
					class102.field2395 = class107.field2539.createImage(304, 34);
				}
				Graphics var4 = class102.field2395.getGraphics();
				var4.setColor(arg1);
				var4.drawRect(0, 0, 303, 33);
				var4.fillRect(2, 2, arg2 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(1, 1, 301, 31);
				var4.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				var4.setFont(class32.field656);
				var4.setColor(Color.white);
				arg0.method253((304 - arg0.method252(class112.field2631)) / 2, 22, var4);
				var3.drawImage(class102.field2395, class144.field3292 / 2 - 152, class33.field696 / 2 - 18, null);
			} catch (Exception var7) {
				int var5 = class33.field696 / 2 - 18;
				int var6 = class144.field3292 / 2 - 152;
				var3.setColor(arg1);
				var3.drawRect(var6, var5, 303, 33);
				var3.fillRect(var6 + 2, var5 + 2, arg2 * 3, 30);
				var3.setColor(Color.black);
				var3.drawRect(var6 + 1, var5 + 1, 301, 31);
				var3.fillRect(arg2 * 3 + var6 + 2, var5 + 2, 300 - arg2 * 3, 30);
				var3.setFont(class32.field656);
				var3.setColor(Color.white);
				arg0.method253(var6 + (304 - arg0.method252(class112.field2631)) / 2, var5 - -22, var3);
			}
		} catch (Exception var8) {
			class107.field2539.repaint();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				class157 var1 = class2.field18;
				class142 var2;
				synchronized (class2.field18) {
					var2 = (class142) class2.field18.method1211();
				}
				if (var2 == null) {
					class54.method426(100L);
					Object var6 = class92.field2103;
					synchronized (class92.field2103) {
						if (class146.field3323 <= 1) {
							class146.field3323 = 0;
							class92.field2103.notifyAll();
							return;
						}
						class146.field3323--;
					}
				} else {
					if (var2.field3243 == 0) {
						var2.field3245.method1026((int) var2.field3324, var2.field3249.length, var2.field3249);
						class157 var4 = class2.field18;
						synchronized (class2.field18) {
							var2.method1091();
						}
					} else if (var2.field3243 == 1) {
						var2.field3249 = var2.field3245.method1024((int) var2.field3324);
						class157 var3 = class2.field18;
						synchronized (class2.field18) {
							class159.field3649.method1214(var2);
						}
					}
					Object var5 = class92.field2103;
					synchronized (class92.field2103) {
						if (class146.field3323 <= 1) {
							class146.field3323 = 0;
							class92.field2103.notifyAll();
							return;
						}
						class146.field3323 = 600;
					}
				}
			}
		} catch (Exception var13) {
			class110.method870(var13, null);
		}
	}
}
