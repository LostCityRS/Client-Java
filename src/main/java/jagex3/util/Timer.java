package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("na")
public abstract class Timer {

	@ObfuscatedName("sa.a(B)Lna;")
	public static Timer create() {
		try {
			return (Timer) Class.forName("jagex3.util.NanoTimer").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new MillisTimer();
		}
	}

	@ObfuscatedName("na.a(III)I")
	public abstract int count(int arg0, int arg1);

	@ObfuscatedName("na.a(I)V")
	public abstract void init();

	@ObfuscatedName("na.b(I)V")
	public abstract void reset();
}
