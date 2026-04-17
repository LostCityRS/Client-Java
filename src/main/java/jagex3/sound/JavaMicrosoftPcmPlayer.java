package jagex3.sound;

// import sun.audio.AudioPlayer;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public final class JavaMicrosoftPcmPlayer extends PcmPlayerBase {

	@ObfuscatedName("v.F")
	public final PcmInputStream field3106 = new PcmInputStream();

	@ObfuscatedName("v.a()V")
	@Override
	public void method256() {
		// AudioPlayer.player.stop(this.field3106);
		PcmInputStream var1 = this.field3106;
		synchronized (this.field3106) {
			this.field3106.field1696 = true;
		}
	}

	public JavaMicrosoftPcmPlayer() {
		super(8000);
		// AudioPlayer.player.start(this.field3106);
	}
}
