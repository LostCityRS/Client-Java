package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public client app;

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

	public MouseTracking(client arg0, int arg1) {
		if (arg1 >= 0) {
			throw new NullPointerException();
		}
		this.app = arg0;
	}

	public void run() {
		while (this.active) {
			Object var1 = this.lock;
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
