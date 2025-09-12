package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public Client app;

	@ObfuscatedName("fc.b")
	public boolean tracking = true;

	@ObfuscatedName("fc.c")
	public Object lock = new Object();

	@ObfuscatedName("fc.d")
	public int length;

	@ObfuscatedName("fc.e")
	public int[] x = new int[500];

	@ObfuscatedName("fc.f")
	public int[] z = new int[500];

	public MouseTracking(Client arg1) {
		this.app = arg1;
	}

	public void run() {
		while (this.tracking) {
			Object var1 = this.lock;
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = this.app.mouseX;
					this.z[this.length] = this.app.mouseY;
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
