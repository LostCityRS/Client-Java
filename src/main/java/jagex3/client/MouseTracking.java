package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.ThreadUtil;

@ObfuscatedName("nc")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("nc.h")
	public final Object lock = new Object();

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
			Object var1 = this.lock;
			synchronized (this.lock) {
				if (this.field2058 < 500) {
					this.field2059[this.field2058] = ClientMouseListener.field741;
					this.field2057[this.field2058] = ClientMouseListener.field2568;
					this.field2058++;
				}
			}
			ThreadUtil.sleepPrecise(50L);
		}
	}
}
