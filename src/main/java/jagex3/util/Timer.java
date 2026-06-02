package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("hi")
public abstract class Timer {

	@ObfuscatedName("s.e(I)Lhi;")
	public static Timer create() {
		try {
			return (Timer) Class.forName("jagex3.util.NanoTimer").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new MillisTimer();
		}
	}

	@ObfuscatedName("hi.a(B)V")
	public abstract void reset();

	@ObfuscatedName("hi.a(III)I")
	public abstract int count(int arg0, int arg1);
}
