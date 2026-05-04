package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("uj")
public abstract class class228 {

	@ObfuscatedName("uj.a")
	public static final int[][] field4267 = new int[104][104];

	@ObfuscatedName("uj.b")
	public static int field4268;

	@ObfuscatedName("uj.c")
	public int[] field4269;

	@ObfuscatedName("uj.d")
	public static int field4270 = 0;

	@ObfuscatedName("uj.e")
	public int field4271;

	@ObfuscatedName("uj.f")
	public Image field4272;

	@ObfuscatedName("uj.h")
	public int field4274;

	@ObfuscatedName("uj.i")
	public static final class88 field4275 = class208.method1423(105, ":duelfriend:");

	@ObfuscatedName("uj.j")
	public static int field4276 = 0;

	@ObfuscatedName("uj.l")
	public static final class88 field4278 = class208.method1423(105, "sl_back");

	@ObfuscatedName("uj.n")
	public static final class88[] field4280 = new class88[100];

	@ObfuscatedName("uj.o")
	public static final class88 field4281 = class208.method1423(105, "");

	@ObfuscatedName("uj.a(III)I")
	public static int method1523(int arg0, int arg1) {
		long var2 = (long) (arg1 + (arg0 << 16));
		return class53.field990 != null && class53.field990.field1219 == var2 ? class149.field2908.field831 * 99 / (class149.field2908.field842.length - class53.field990.field1782) + 1 : 0;
	}

	@ObfuscatedName("uj.a(IBI)I")
	public static int method1524(int arg0, int arg1) {
		int var2 = 0;
		while (arg1 > 0) {
			var2 = arg0 & 0x1 | var2 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return var2;
	}

	@ObfuscatedName("uj.a(IIBI)I")
	public static int method1525(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * var3 + arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + var3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}

	@ObfuscatedName("uj.a(I)V")
	public final void method1521() {
		class72.method496(this.field4269, this.field4274, this.field4271);
	}

	@ObfuscatedName("uj.a(IIZLjava/awt/Component;)V")
	public abstract void method243(int arg0, int arg1, Component arg2);

	@ObfuscatedName("uj.a(BIIIILjava/awt/Graphics;)V")
	public abstract void method242(int arg0, int arg1, int arg2, int arg3, Graphics arg4);

	@ObfuscatedName("uj.a(IIILjava/awt/Graphics;)V")
	public abstract void method246(Graphics arg0);
}
