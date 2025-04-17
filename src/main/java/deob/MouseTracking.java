package deob;

@ObfuscatedName("fc")
public class MouseTracking implements Runnable {

	@ObfuscatedName("fc.a")
	public client field981;

	@ObfuscatedName("fc.b")
	public boolean field982 = true;

	@ObfuscatedName("fc.c")
	public Object field983 = new Object();

	@ObfuscatedName("fc.d")
	public int field984;

	@ObfuscatedName("fc.e")
	public int[] field985 = new int[500];

	@ObfuscatedName("fc.f")
	public int[] field986 = new int[500];

	public MouseTracking(client arg0, int arg1) {
		if (arg1 >= 0) {
			throw new NullPointerException();
		}
		this.field981 = arg0;
	}

	public void run() {
		while (this.field982) {
			Object var1 = this.field983;
			synchronized (this.field983) {
				if (this.field984 < 500) {
					this.field985[this.field984] = this.field981.field23;
					this.field986[this.field984] = this.field981.field24;
					this.field984++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
