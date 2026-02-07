package jagex3.util;

import deob.ObfuscatedName;

public class ThreadSleep {
	@ObfuscatedName("he.a(JI)V")
	public static void sleepPrecise(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			sleep(arg0 - 1L);
			sleep(1L);
		} else {
			sleep(arg0);
		}
	}

	@ObfuscatedName("kd.a(IJ)V")
	public static void sleep(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}
}
