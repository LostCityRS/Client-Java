package jagex3.sound;

// import sun.audio.AudioPlayer;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public final class JavaMicrosoftPcmPlayer extends PcmPlayerBase {

	@ObfuscatedName("v.F")
	public final PcmInputStream pcmInputStream = new PcmInputStream();

	@ObfuscatedName("v.a()V")
	@Override
	public void play() {
		// AudioPlayer.player.stop(this.pcmInputStream);
		PcmInputStream var1 = this.pcmInputStream;
		synchronized (this.pcmInputStream) {
			this.pcmInputStream.closed = true;
		}
	}

	public JavaMicrosoftPcmPlayer() {
		super(8000);
		// AudioPlayer.player.start(this.pcmInputStream);
	}
}
