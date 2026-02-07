package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("ba")
public abstract class Timer {

	@ObfuscatedName("lf.b(B)Lba;")
	public static Timer create() {
		try {
			return (Timer) Class.forName("jagex3.util.NanoTimer").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new MillisTimer();
		}
	}

	@ObfuscatedName("ba.a(I)V")
	public abstract void method57();

	@ObfuscatedName("ba.a(III)I")
	public abstract int count(int arg0, int arg1);
}
