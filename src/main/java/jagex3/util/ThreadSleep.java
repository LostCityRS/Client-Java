package jagex3.util;

import deob.ObfuscatedName;
import deob.Statics;

public class ThreadSleep {
	@ObfuscatedName("bi.a(JB)V")
	public static void sleepPrecise(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Statics.method1365(arg0 - 1L);
			Statics.method1365(1L);
		} else {
			Statics.method1365(arg0);
		}
	}
}
