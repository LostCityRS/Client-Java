package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.b")
	public Client app;

	@ObfuscatedName("fc.c")
	public boolean active = true;

	@ObfuscatedName("fc.d")
	public final Object lock = new Object();

	@ObfuscatedName("fc.e")
	public int length;

	@ObfuscatedName("fc.f")
	public int[] x = new int[500];

	@ObfuscatedName("fc.g")
	public int[] y = new int[500];

	public MouseTracking(Client arg1) {
		this.app = arg1;
	}

	public void run() {
		while (this.active) {
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = this.app.mouseX;
					this.y[this.length] = this.app.mouseY;
					this.length++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
