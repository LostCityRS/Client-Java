package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import deob.class102;
import deob.class24;

@ObfuscatedName("nc")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("nc.h")
	public final Object field2042 = new Object();

	@ObfuscatedName("nc.i")
	public static boolean field2043 = false;

	@ObfuscatedName("nc.l")
	public static int field2046 = 0;

	@ObfuscatedName("nc.o")
	public static final int field2049 = 20;

	@ObfuscatedName("nc.p")
	public boolean field2050 = true;

	@ObfuscatedName("nc.w")
	public final int[] field2057 = new int[500];

	@ObfuscatedName("nc.x")
	public int field2058 = 0;

	@ObfuscatedName("nc.y")
	public final int[] field2059 = new int[500];

	@Override
	public void run() {
		while (this.field2050) {
			Object var1 = this.field2042;
			synchronized (this.field2042) {
				if (this.field2058 < 500) {
					this.field2059[this.field2058] = class24.field741;
					this.field2057[this.field2058] = class102.field2568;
					this.field2058++;
				}
			}
			Statics.sleepPrecise(50L);
		}
	}
}
