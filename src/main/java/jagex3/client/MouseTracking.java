package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.ThreadSleep;

@ObfuscatedName("dh")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("dh.g")
	public final Object field715 = new Object();

	@ObfuscatedName("dh.i")
	public boolean field717 = true;

	@ObfuscatedName("dh.j")
	public int field718 = 0;

	@ObfuscatedName("dh.k")
	public final int[] field719 = new int[500];

	@ObfuscatedName("dh.l")
	public final int[] field720 = new int[500];

	@Override
	public void run() {
		while (this.field717) {
			Object var1 = this.field715;
			synchronized (this.field715) {
				if (this.field718 < 500) {
					this.field720[this.field718] = ClientMouseListener.field471;
					this.field719[this.field718] = ClientMouseListener.field4449;
					this.field718++;
				}
			}
			ThreadSleep.sleepPrecise(50L);
		}
	}
}
