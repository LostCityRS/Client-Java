package jagex2.client;

import deob.ObfuscatedName;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public int field970 = 9;

	@ObfuscatedName("fc.b")
	public Client field971;

	@ObfuscatedName("fc.c")
	public boolean field972 = true;

	@ObfuscatedName("fc.d")
	public Object field973 = new Object();

	@ObfuscatedName("fc.e")
	public int field974;

	@ObfuscatedName("fc.f")
	public int[] field975 = new int[500];

	@ObfuscatedName("fc.g")
	public int[] field976 = new int[500];

	public MouseTracking(int arg0, Client arg1) {
		if (arg0 != 0) {
			this.field970 = -128;
		}
		this.field971 = arg1;
	}

	public void run() {
		while (this.field972) {
			Object var1 = this.field973;
			synchronized (this.field973) {
				if (this.field974 < 500) {
					this.field975[this.field974] = this.field971.field23;
					this.field976[this.field974] = this.field971.field24;
					this.field974++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
