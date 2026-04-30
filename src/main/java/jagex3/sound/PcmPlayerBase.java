package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.util.MonotonicTime;

// might be an earlier version of PcmPlayer
@ObfuscatedName("ca")
public class PcmPlayerBase {

	public PcmPlayerBase(int arg0) {
		PcmPlayer.frequency = arg0;
		PcmPlayer.field462 = MonotonicTime.currentTime();
	}

	@ObfuscatedName("ca.a(J)V")
	public void method255(long arg0) {
	}

	@ObfuscatedName("ca.a()V")
	public void play() {
	}

}
