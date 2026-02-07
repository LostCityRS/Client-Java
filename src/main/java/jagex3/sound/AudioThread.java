package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.applet.SignLink;
import jagex3.util.ThreadSleep;

@ObfuscatedName("de")
public final class AudioThread implements Runnable {

	@ObfuscatedName("de.e")
	public SignLink signlink;

	@ObfuscatedName("de.g")
	public final PcmPlayer[] players = new PcmPlayer[2];

	@ObfuscatedName("de.q")
	public volatile boolean running = false;

	@ObfuscatedName("de.u")
	public volatile boolean shutdown = false;

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
				SignLink.flushEvents(null, this.signlink);
			}
		} catch (Exception var9) {
			JagException.report(var9, null);
		} finally {
			Object var6 = null;
			this.running = false;
		}
	}
}
