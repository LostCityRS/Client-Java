package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("tf")
public final class Wave extends PcmStreamable {

	@ObfuscatedName("tf.u")
	public int samplingFrequency;

	@ObfuscatedName("tf.v")
	public int loopEndPosition;

	@ObfuscatedName("tf.w")
	public boolean loopReversed;

	@ObfuscatedName("tf.x")
	public byte[] samples;

	@ObfuscatedName("tf.y")
	public int loopStartPosition;

	public Wave(int arg0, byte[] arg1, int arg2, int arg3) {
		this.samplingFrequency = 22050;
		this.samples = arg1;
		this.loopStartPosition = arg2;
		this.loopEndPosition = arg3;
	}

	public Wave(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
		this.samplingFrequency = arg0;
		this.samples = arg1;
		this.loopStartPosition = arg2;
		this.loopEndPosition = arg3;
		this.loopReversed = arg4;
	}

	@ObfuscatedName("tf.a(Lqe;)Ltf;")
	public Wave decimate(Decimator arg0) {
		this.samples = arg0.decimate(this.samples);
		this.samplingFrequency = arg0.transmitFreq(this.samplingFrequency);
		if (this.loopStartPosition == this.loopEndPosition) {
			this.loopStartPosition = this.loopEndPosition = arg0.transmitPos(this.loopStartPosition);
		} else {
			this.loopStartPosition = arg0.transmitPos(this.loopStartPosition);
			this.loopEndPosition = arg0.transmitPos(this.loopEndPosition);
			if (this.loopStartPosition == this.loopEndPosition) {
				this.loopStartPosition--;
			}
		}
		return this;
	}
}
