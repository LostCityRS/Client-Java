package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;

// might be an earlier version of PcmPlayer
@ObfuscatedName("ca")
public class PcmPlayerBase {

	public PcmPlayerBase(int arg0) {
		PcmPlayer.frequency = arg0;
		PcmPlayer.field462 = Statics.currentTime();
	}

	@ObfuscatedName("ca.a(J)V")
	public void method255(long arg0) {
	}

	@ObfuscatedName("ca.a()V")
	public void method256() {
	}

}
