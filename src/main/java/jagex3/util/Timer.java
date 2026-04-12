package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("na")
public abstract class Timer {

	@ObfuscatedName("na.d")
	public static int[] field1932 = new int[500];

	@ObfuscatedName("na.i")
	public static int[] field1937 = new int[128];

	@ObfuscatedName("na.m")
	public static boolean field1941 = false;

	@ObfuscatedName("sa.a(B)Lna;")
	public static Timer method909() {
		try {
			return (Timer) Class.forName("jagex3.util.NanoTimer").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new MillisTimer();
		}
	}

	@ObfuscatedName("na.a(III)I")
	public abstract int method573(int arg0, int arg1);

	@ObfuscatedName("na.a(I)V")
	public abstract void method571();

	@ObfuscatedName("na.b(I)V")
	public abstract void method570();
}
