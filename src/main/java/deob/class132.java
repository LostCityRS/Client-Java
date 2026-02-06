package deob;

import java.awt.Component;

@ObfuscatedName("t")
public final class class132 implements Runnable {

	@ObfuscatedName("t.c")
	public boolean field3022 = true;

	@ObfuscatedName("t.d")
	public final Object field3023 = new Object();

	@ObfuscatedName("t.h")
	public final int[] field3027 = new int[500];

	@ObfuscatedName("t.i")
	public int field3028 = 0;

	@ObfuscatedName("t.j")
	public static class156 field3029 = new class156(4096);

	@ObfuscatedName("t.k")
	public final int[] field3030 = new int[500];

	@ObfuscatedName("t.l")
	public static class27 field3031;

	@ObfuscatedName("t.m")
	public static class134 field3032;

	@ObfuscatedName("t.n")
	public static int field3033 = 0;

	@ObfuscatedName("t.o")
	public static int[] field3034;

	@ObfuscatedName("t.p")
	public static class32 field3035 = class73.method593("null", true);

	@ObfuscatedName("t.q")
	public static class51[] field3036;

	@ObfuscatedName("t.a(IBZZZ)Lga;")
	public static class44 method1007(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		class134 var4 = null;
		if (class44.field1032 != null) {
			var4 = new class134(arg0, class44.field1032, class118.field2832[arg0], 1000000);
		}
		return new class44(var4, field3032, arg0, arg2, arg3, arg1);
	}

	@ObfuscatedName("t.a(Lf;B)V")
	public static void method1008(class36 arg0) {
		if (arg0.field840 == class30.field563) {
			class145.field3297[arg0.field823] = true;
		}
	}

	@ObfuscatedName("t.a(I)V")
	public static void method1009() {
		if (class38.field919 != null) {
			class80 var0 = class38.field919;
			synchronized (class38.field919) {
				class38.field919 = null;
			}
		}
	}

	@ObfuscatedName("t.a(IILjava/awt/Component;I)Lgf;")
	public static class48 method1011(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("ca");
			class48 var4 = (class48) var3.getDeclaredConstructor().newInstance();
			var4.method123(arg0, arg1, arg2);
			return var4;
		} catch (Throwable var6) {
			class43 var5 = new class43();
			var5.method123(arg0, arg1, arg2);
			return var5;
		}
	}

	@Override
	public void run() {
		while (this.field3022) {
			Object var1 = this.field3023;
			synchronized (this.field3023) {
				if (this.field3028 < 500) {
					this.field3027[this.field3028] = class86.field2001;
					this.field3030[this.field3028] = class140.field3216;
					this.field3028++;
				}
			}
			class54.method426(50L);
		}
	}
}
