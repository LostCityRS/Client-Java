package jagex3.util;

import deob.ObfuscatedName;

public class ThreadUtil {
	@ObfuscatedName("ob.a(JI)V")
	public static void sleepPrecise(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			method427(arg0 - 1L);
			method427(1L);
		} else {
			method427(arg0);
		}
	}

	@ObfuscatedName("gb.a(JI)V")
	public static void method427(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}
}
