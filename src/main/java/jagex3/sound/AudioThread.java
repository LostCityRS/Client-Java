package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.client.SignLink;
import jagex3.util.ThreadSleep;

@ObfuscatedName("oi")
public final class AudioThread implements Runnable {

	@ObfuscatedName("oi.d")
	public final PcmPlayer[] field3102 = new PcmPlayer[2];

	@ObfuscatedName("oi.h")
	public volatile boolean field3106 = false;

	@ObfuscatedName("oi.i")
	public volatile boolean field3107 = false;

	@ObfuscatedName("oi.k")
	public SignLink field3109;

	@Override
	public void run() {
		this.field3107 = true;
		try {
			while (!this.field3106) {
				for (int var1 = 0; var1 < 2; var1++) {
					PcmPlayer var2 = this.field3102[var1];
					if (var2 != null) {
						var2.method406();
					}
				}
				ThreadSleep.sleepPrecise(10L);
				GameShell.method1006(null, this.field3109);
			}
		} catch (Exception var9) {
			JagException.report(null, var9);
		} finally {
			Object var6 = null;
			this.field3107 = false;
		}
	}
}
