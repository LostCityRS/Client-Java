package jagex3.client;

import deob.ObfuscatedName;
import jagex3.client.input.mouse.ClientMouseListener;
import jagex3.util.ThreadSleep;

@ObfuscatedName("t")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("t.c")
	public boolean active = true;

	@ObfuscatedName("t.d")
	public final Object lock = new Object();

	@ObfuscatedName("t.h")
	public final int[] x = new int[500];

	@ObfuscatedName("t.i")
	public int length = 0;

	@ObfuscatedName("t.k")
	public final int[] y = new int[500];

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
