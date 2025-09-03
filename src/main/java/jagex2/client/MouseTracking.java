package jagex2.client;

import deob.ObfuscatedName;
import java.util.concurrent.locks.LockSupport;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public Client app;

	@ObfuscatedName("fc.b")
	public volatile boolean active = true;

	@ObfuscatedName("fc.c")
	public final Object lock = new Object();

	@ObfuscatedName("fc.d")
	public int length;

	@ObfuscatedName("fc.e")
	public int[] x = new int[500];

	@ObfuscatedName("fc.f")
	public int[] y = new int[500];

	public MouseTracking(Client app) {
		this.app = app;
	}

	@Override
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

			// Park for ~50ms instead of Thread.sleep in a loop
			LockSupport.parkNanos(50L * 1_000_000L);
			if (Thread.currentThread().isInterrupted()) {
				break;
			}
		}
	}
}
