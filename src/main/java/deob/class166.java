package deob;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

@ObfuscatedName("pc")
public final class class166 {

	@ObfuscatedName("pc.b")
	public static class53 field3188 = new class53();

	@ObfuscatedName("pc.c")
	public static final class88 field3189 = class208.method1423(105, "(U2");

	@ObfuscatedName("pc.d")
	public int field3190;

	@ObfuscatedName("pc.f")
	public static int field3192 = -1;

	@ObfuscatedName("pc.g")
	public int field3193;

	@ObfuscatedName("pc.h")
	public class145 field3194;

	@ObfuscatedName("pc.k")
	public int field3197;

	@ObfuscatedName("pc.l")
	public static final class88 field3198 = class208.method1423(105, "The server is being updated)3");

	@ObfuscatedName("pc.e")
	public static class88 field3191 = field3198;

	@ObfuscatedName("pc.m")
	public static class75 field3199;

	@ObfuscatedName("pc.n")
	public static final class89[] field3200 = new class89[4];

	@ObfuscatedName("pc.o")
	public static final class88 field3201 = class208.method1423(105, "<img=0>");

	@ObfuscatedName("pc.p")
	public long field3202;

	@ObfuscatedName("pc.a([Li;I)Li;")
	public static class88 method1140(class88[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return class165.method1133(arg0.length, arg0, 0);
	}

	@ObfuscatedName("pc.a(ILjava/awt/Color;Li;ZI)V")
	public static void method1142(Color arg0, class88 arg1, boolean arg2, int arg3) {
		try {
			Graphics var4 = class154.field2975.getGraphics();
			if (class15.field228 == null) {
				class15.field228 = new Font("Helvetica", 1, 13);
				class201.field3840 = class154.field2975.getFontMetrics(class15.field228);
			}
			if (arg2) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class222.field4192, class145.field2725);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (class143.field2643 == null) {
					class143.field2643 = class154.field2975.createImage(304, 34);
				}
				Graphics var5 = class143.field2643.getGraphics();
				var5.setColor(arg0);
				var5.drawRect(0, 0, 303, 33);
				var5.fillRect(2, 2, arg3 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(1, 1, 301, 31);
				var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				var5.setFont(class15.field228);
				var5.setColor(Color.white);
				arg1.method620((304 - arg1.method609(class201.field3840)) / 2, 22, var5);
				var4.drawImage(class143.field2643, class222.field4192 / 2 - 152, class145.field2725 / 2 + -18, null);
			} catch (Exception var8) {
				int var6 = class222.field4192 / 2 - 152;
				int var7 = class145.field2725 / 2 - 18;
				var4.setColor(arg0);
				var4.drawRect(var6, var7, 303, 33);
				var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var6 + 1, var7 + 1, 301, 31);
				var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
				var4.setFont(class15.field228);
				var4.setColor(Color.white);
				arg1.method620(var6 + (304 - arg1.method609(class201.field3840)) / 2, var7 + 22, var4);
			}
			if (class147.field2752 != null) {
				var4.setFont(class15.field228);
				var4.setColor(Color.white);
				class147.field2752.method620(class222.field4192 / 2 - class147.field2752.method609(class201.field3840) / 2, class145.field2725 / 2 + -26, var4);
			}
		} catch (Exception var9) {
			class154.field2975.repaint();
		}
	}
}
