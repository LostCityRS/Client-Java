package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("wd")
public final class Wave extends PcmStreamable {

	@ObfuscatedName("wd.db")
	public byte[] samples;

	@ObfuscatedName("wd.eb")
	public int loopStartPosition;

	@ObfuscatedName("wd.fb")
	public int loopEndPosition;

	@ObfuscatedName("wd.gb")
	public int samplingFrequency = 22050;

	@ObfuscatedName("wd.a(Lqb;)Lwd;")
	public Wave decimate(Decimator arg0) {
		this.samples = arg0.decimate(this.samples);
		this.samplingFrequency = arg0.transmitFreq(this.samplingFrequency);
		if (this.loopEndPosition == this.loopStartPosition) {
			this.loopStartPosition = this.loopEndPosition = arg0.transmitPos(this.loopStartPosition);
		} else {
			this.loopStartPosition = arg0.transmitPos(this.loopStartPosition);
			this.loopEndPosition = arg0.transmitPos(this.loopEndPosition);
			if (this.loopEndPosition == this.loopStartPosition) {
				this.loopStartPosition--;
			}
		}
		return this;
	}

	public Wave(int arg0, byte[] arg1, int arg2, int arg3) {
		this.samples = arg1;
		this.loopStartPosition = arg2;
		this.loopEndPosition = arg3;
	}
}
