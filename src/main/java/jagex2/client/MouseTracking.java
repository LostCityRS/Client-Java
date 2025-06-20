package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public Client app;

	@ObfuscatedName("fc.b")
	public boolean active = true;

	@ObfuscatedName("fc.c")
	public Object lock = new Object();

	@ObfuscatedName("fc.d")
	public int length;

	@ObfuscatedName("fc.e")
	public int[] x = new int[500];

	@ObfuscatedName("fc.f")
	public int[] y = new int[500];

	public MouseTracking(Client app) {
		this.app = app;
	}

	public void run() {
		while (this.active) {
			Object sync = this.lock;
			synchronized (sync) {
				if (this.length < 500) {
					this.x[this.length] = this.app.mouseX;
					this.y[this.length] = this.app.mouseY;
					this.length++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception ignore) {
			}
		}
	}
}
