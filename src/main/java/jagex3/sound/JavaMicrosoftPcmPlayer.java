package jagex3.sound;

// import sun.audio.AudioPlayer;

import deob.ObfuscatedName;
import deob.class14;
import deob.class68;

@ObfuscatedName("v")
public final class JavaMicrosoftPcmPlayer extends class14 {

	@ObfuscatedName("v.F")
	public final class68 field3106 = new class68();

	@ObfuscatedName("v.a()V")
	@Override
	public void method256() {
		// AudioPlayer.player.stop(this.field3106);
		class68 var1 = this.field3106;
		synchronized (this.field3106) {
			this.field3106.field1696 = true;
		}
	}

	public JavaMicrosoftPcmPlayer() {
		super(8000);
		// AudioPlayer.player.start(this.field3106);
	}
}
