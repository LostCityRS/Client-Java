package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.ThreadSleep;

@ObfuscatedName("dh")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("dh.g")
	public final Object lock = new Object();

	@ObfuscatedName("dh.i")
	public boolean active = true;

	@ObfuscatedName("dh.j")
	public int length = 0;

	@ObfuscatedName("dh.k")
	public final int[] y = new int[500];

	@ObfuscatedName("dh.l")
	public final int[] x = new int[500];

	@Override
	public void run() {
		while (this.active) {
			Object var1 = this.lock;
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = ClientMouseListener.mouseX;
					this.y[this.length] = ClientMouseListener.mouseY;
					this.length++;
				}
			}
			ThreadSleep.sleepPrecise(50L);
		}
	}
}
