package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("dc")
public class Tone {

	@ObfuscatedName("dc.d")
	public Envelope frequencyBase;

	@ObfuscatedName("dc.e")
	public Envelope amplitudeBase;

	@ObfuscatedName("dc.f")
	public Envelope frequencyModRate;

	@ObfuscatedName("dc.g")
	public Envelope frequencyModRange;

	@ObfuscatedName("dc.h")
	public Envelope amplitudeModRate;

	@ObfuscatedName("dc.i")
	public Envelope amplitudeModRange;

	@ObfuscatedName("dc.j")
	public Envelope release;

	@ObfuscatedName("dc.k")
	public Envelope attack;

	@ObfuscatedName("dc.l")
	public int[] harmonicVolume = new int[5];

	@ObfuscatedName("dc.m")
	public int[] harmonicSemitone = new int[5];

	@ObfuscatedName("dc.n")
	public int[] harmonicDelay = new int[5];

	@ObfuscatedName("dc.o")
	public int reverbDelay;

	@ObfuscatedName("dc.p")
	public int reverbVolume = 100;

	@ObfuscatedName("dc.q")
	public int length = 500;

	@ObfuscatedName("dc.r")
	public int start;

	@ObfuscatedName("dc.s")
	public static int[] buf;

	@ObfuscatedName("dc.t")
	public static int[] noise;

	@ObfuscatedName("dc.u")
	public static int[] sine;

	@ObfuscatedName("dc.v")
	public static int[] fPos = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] fDel = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] fAmp = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] fMulti = new int[5];

	@ObfuscatedName("dc.z")
	public static int[] fOffset = new int[5];

	@ObfuscatedName("dc.a()V")
	public static void init() {
		noise = new int[32768];
		for (int i = 0; i < 32768; i++) {
			if (Math.random() > 0.5D) {
				noise[i] = 1;
			} else {
				noise[i] = -1;
			}
		}

		sine = new int[32768];
		for (int i = 0; i < 32768; i++) {
			sine[i] = (int) (Math.sin((double) i / 5215.1903D) * 16384.0D);
		}

		buf = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public int[] generate(int samples, int length) {
		for (int i = 0; i < samples; i++) {
			buf[i] = 0;
		}

		if (length < 10) {
			return buf;
		}

		double samplesPerStep = (double) samples / ((double) length + 0.0D);

		this.frequencyBase.genInit();
		this.amplitudeBase.genInit();

		int frequencyStart = 0;
		int frequencyDuration = 0;
		int frequencyPhase = 0;

		if (this.frequencyModRate != null) {
			this.frequencyModRate.genInit();
			this.frequencyModRange.genInit();
			frequencyStart = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / samplesPerStep);
			frequencyDuration = (int) ((double) this.frequencyModRate.start * 32.768D / samplesPerStep);
		}

		int amplitudeStart = 0;
		int amplitudeDuration = 0;
		int amplitudePhase = 0;

		if (this.amplitudeModRate != null) {
			this.amplitudeModRate.genInit();
			this.amplitudeModRange.genInit();
			amplitudeStart = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / samplesPerStep);
			amplitudeDuration = (int) ((double) this.amplitudeModRate.start * 32.768D / samplesPerStep);
		}

		for (int i = 0; i < 5; i++) {
			if (this.harmonicVolume[i] != 0) {
				fPos[i] = 0;
				fDel[i] = (int) ((double) this.harmonicDelay[i] * samplesPerStep);
				fAmp[i] = (this.harmonicVolume[i] << 14) / 100;
				fMulti[i] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[i]) / samplesPerStep);
				fOffset[i] = (int) ((double) this.frequencyBase.start * 32.768D / samplesPerStep);
			}
		}

		for (int i = 0; i < samples; i++) {
			int frequency = this.frequencyBase.genNext(samples);
			int amplitude = this.amplitudeBase.genNext(samples);

			if (this.frequencyModRate != null) {
				int rate = this.frequencyModRate.genNext(samples);
				int range = this.frequencyModRange.genNext(samples);

				frequency += this.waveFunc(range, this.frequencyModRate.form, frequencyPhase) >> 1;
				frequencyPhase += (rate * frequencyStart >> 16) + frequencyDuration;
			}

			if (this.amplitudeModRate != null) {
				int rate = this.amplitudeModRate.genNext(samples);
				int range = this.amplitudeModRange.genNext(samples);

				amplitude = amplitude * ((this.waveFunc(range, this.amplitudeModRate.form, amplitudePhase) >> 1) + 32768) >> 15;
				amplitudePhase += (rate * amplitudeStart >> 16) + amplitudeDuration;
			}

			for (int j = 0; j < 5; j++) {
				if (this.harmonicVolume[j] != 0) {
					int pos = i + fDel[j];
					if (pos < samples) {
						buf[pos] += this.waveFunc(amplitude * fAmp[j] >> 15, this.frequencyBase.form, fPos[j]);
						fPos[j] += (frequency * fMulti[j] >> 16) + fOffset[j];
					}
				}
			}
		}

		if (this.release != null) {
			this.release.genInit();
			this.attack.genInit();

			int counter = 0;
			boolean muted = true;

			for (int i = 0; i < samples; i++) {
				int releaseValue = this.release.genNext(samples);
				int attackValue = this.attack.genNext(samples);

				int threshold;
				if (muted) {
					threshold = this.release.start + ((this.release.end - this.release.start) * releaseValue >> 8);
				} else {
					threshold = this.release.start + ((this.release.end - this.release.start) * attackValue >> 8);
				}

				counter += 256;
				if (counter >= threshold) {
					counter = 0;
					muted = !muted;
				}

				if (muted) {
					buf[i] = 0;
				}
			}
		}

		if (this.reverbDelay > 0 && this.reverbVolume > 0) {
			int start = (int) ((double) this.reverbDelay * samplesPerStep);
			for (int i = start; i < samples; i++) {
				buf[i] += buf[i - start] * this.reverbVolume / 100;
			}
		}

		for (int i = 0; i < samples; i++) {
			if (buf[i] < -32768) {
				buf[i] = -32768;
			}

			if (buf[i] > 32767) {
				buf[i] = 32767;
			}
		}

		return buf;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public int waveFunc(int amplitude, int form, int phase) {
		if (form == 1) {
			return (phase & 0x7FFF) < 16384 ? amplitude : -amplitude;
		} else if (form == 2) {
			return sine[phase & 0x7FFF] * amplitude >> 14;
		} else if (form == 3) {
			return ((phase & 0x7FFF) * amplitude >> 14) - amplitude;
		} else if (form == 4) {
			return noise[phase / 2607 & 0x7FFF] * amplitude;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("dc.a(ZLmb;)V")
	public void unpack(Packet buf) {
		this.frequencyBase = new Envelope();
		this.frequencyBase.unpack(buf);

		this.amplitudeBase = new Envelope();
		this.amplitudeBase.unpack(buf);

		int hasFrequencyMod = buf.g1();
		if (hasFrequencyMod != 0) {
			buf.pos--;

			this.frequencyModRate = new Envelope();
			this.frequencyModRate.unpack(buf);
			this.frequencyModRange = new Envelope();
			this.frequencyModRange.unpack(buf);
		}

		int hasAmplitudeMod = buf.g1();
		if (hasAmplitudeMod != 0) {
			buf.pos--;

			this.amplitudeModRate = new Envelope();
			this.amplitudeModRate.unpack(buf);
			this.amplitudeModRange = new Envelope();
			this.amplitudeModRange.unpack(buf);
		}

		int hasReleaseAttack = buf.g1();
		if (hasReleaseAttack != 0) {
			buf.pos--;

			this.release = new Envelope();
			this.release.unpack(buf);
			this.attack = new Envelope();
			this.attack.unpack(buf);
		}

		for (int i = 0; i < 10; i++) {
			int volume = buf.gsmarts();
			if (volume == 0) {
				break;
			}

			this.harmonicVolume[i] = volume;
			this.harmonicSemitone[i] = buf.gsmart();
			this.harmonicDelay[i] = buf.gsmarts();
		}

		this.reverbDelay = buf.gsmarts();
		this.reverbVolume = buf.gsmarts();
		this.length = buf.g2();
		this.start = buf.g2();
	}
}
