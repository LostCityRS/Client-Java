package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.client.SignLink;
import jagex3.util.ThreadSleep;

@ObfuscatedName("oi")
public final class AudioThread implements Runnable {

	@ObfuscatedName("oi.d")
	public final PcmPlayer[] players = new PcmPlayer[2];

	@ObfuscatedName("oi.h")
	public volatile boolean shutdown = false;

	@ObfuscatedName("oi.i")
	public volatile boolean running = false;

	@ObfuscatedName("oi.k")
	public SignLink signLink;

	@Override
	public void run() {
		this.running = true;
		try {
			while (!this.shutdown) {
				for (int var1 = 0; var1 < 2; var1++) {
					PcmPlayer var2 = this.players[var1];
					if (var2 != null) {
						var2.cycle();
					}
				}
				ThreadSleep.sleepPrecise(10L);
				GameShell.flushEvents(null, this.signLink);
			}
		} catch (Exception var9) {
			JagException.report(null, var9);
		} finally {
			Object var6 = null;
			this.running = false;
		}
	}
}
