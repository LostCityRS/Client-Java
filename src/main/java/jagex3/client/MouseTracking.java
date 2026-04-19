package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.ThreadUtil;

@ObfuscatedName("nc")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("nc.h")
	public final Object lock = new Object();

	@ObfuscatedName("nc.p")
	public boolean active = true;

	@ObfuscatedName("nc.w")
	public final int[] y = new int[500];

	@ObfuscatedName("nc.x")
	public int length = 0;

	@ObfuscatedName("nc.y")
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
			ThreadUtil.sleepPrecise(50L);
		}
	}
}
