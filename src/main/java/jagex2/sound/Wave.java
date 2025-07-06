package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public class Wave {

	@ObfuscatedName("cc.d")
	public static Wave[] tracks = new Wave[1000];

	@ObfuscatedName("cc.e")
	public static int[] delays = new int[1000];

	@ObfuscatedName("cc.f")
	public static byte[] waveBytes = new byte[44100 * 10];

	@ObfuscatedName("cc.g")
	public static Packet waveBuffer = new Packet(waveBytes);

	@ObfuscatedName("cc.h")
	public Tone[] tones = new Tone[10];

	@ObfuscatedName("cc.i")
	public int loopBegin;

	@ObfuscatedName("cc.j")
	public int loopEnd;

	@ObfuscatedName("cc.a(Lmb;B)V")
	public static final void unpack(Packet buf) {
		Tone.init();

		while (true) {
			int id = buf.g2();
			if (id == 65535) {
				return;
			}

			tracks[id] = new Wave();
			tracks[id].read(buf);
			delays[id] = tracks[id].trim();
		}
	}

	@ObfuscatedName("cc.a(III)Lmb;")
	public static final Packet generate(int loopCount, int id) {
		if (tracks[id] == null) {
			return null;
		}

		Wave wave = tracks[id];
		return wave.getWave(loopCount);
	}

	@ObfuscatedName("cc.a(ILmb;)V")
	public final void read(Packet buf) {
		for (int tone = 0; tone < 10; tone++) {
			int hasTone = buf.g1();
			if (hasTone != 0) {
				buf.pos--;

				this.tones[tone] = new Tone();
				this.tones[tone].unpack(buf);
			}
		}

		this.loopBegin = buf.g2();
		this.loopEnd = buf.g2();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int trim() {
		int start = 9999999;
		for (int tone = 0; tone < 10; tone++) {
			if (this.tones[tone] != null && this.tones[tone].start / 20 < start) {
				start = this.tones[tone].start / 20;
			}
		}

		if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < start) {
			start = this.loopBegin / 20;
		}

		if (start == 9999999 || start == 0) {
			return 0;
		}

		for (int tone = 0; tone < 10; tone++) {
			if (this.tones[tone] != null) {
				this.tones[tone].start -= start * 20;
			}
		}

		if (this.loopBegin < this.loopEnd) {
			this.loopBegin -= start * 20;
			this.loopEnd -= start * 20;
		}

		return start;
	}

	@ObfuscatedName("cc.a(IB)Lmb;")
	public final Packet getWave(int loopCount) {
		int length = this.generate(loopCount);
		waveBuffer.pos = 0;
		waveBuffer.p4(0x52494646); // "RIFF" ChunkID
		waveBuffer.ip4(length + 36); // ChunkSize
		waveBuffer.p4(0x57415645); // "WAVE" format
		waveBuffer.p4(0x666d7420); // "fmt " chunk id
		waveBuffer.ip4(16); // chunk size
		waveBuffer.ip2(1); // audio format
		waveBuffer.ip2(1); // num channels
		waveBuffer.ip4(22050); // sample rate
		waveBuffer.ip4(22050); // byte rate
		waveBuffer.ip2(1); // block align
		waveBuffer.ip2(8); // bits per sample
		waveBuffer.p4(0x64617461); // "data"
		waveBuffer.ip4(length);
		waveBuffer.pos += length;
		return waveBuffer;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int generate(int loopCount) {
		int duration = 0;
		for (int tone = 0; tone < 10; tone++) {
			if (this.tones[tone] != null && this.tones[tone].start + this.tones[tone].length > duration) {
				duration = this.tones[tone].start + this.tones[tone].length;
			}
		}

		if (duration == 0) {
			return 0;
		}

		int sampleCount = duration * 22050 / 1000;
		int loopStart = this.loopBegin * 22050 / 1000;
		int loopStop = this.loopEnd * 22050 / 1000;

		if (loopStart < 0 || loopStart > sampleCount || loopStop < 0 || loopStop > sampleCount || loopStart >= loopStop) {
			loopCount = 0;
		}

		int totalSampleCount = (loopCount - 1) * (loopStop - loopStart) + sampleCount;
		for (int sample = 44; sample < totalSampleCount + 44; sample++) {
			waveBytes[sample] = -128;
		}

		for (int tone = 0; tone < 10; tone++) {
			if (this.tones[tone] != null) {
				int toneSampleCount = this.tones[tone].length * 22050 / 1000;
				int start = this.tones[tone].start * 22050 / 1000;
				int[] samples = this.tones[tone].generate(toneSampleCount, this.tones[tone].length);

				for (int sample = 0; sample < toneSampleCount; sample++) {
					waveBytes[start + sample + 44] += (byte) (samples[sample] >> 8);
				}
			}
		}

		if (loopCount > 1) {
			loopStart += 44;
			loopStop += 44;
			sampleCount += 44;
			totalSampleCount += 44;

			int endOffset = totalSampleCount - sampleCount;
			for (int sample = sampleCount - 1; sample >= loopStop; sample--) {
				waveBytes[endOffset + sample] = waveBytes[sample];
			}

			for (int loop = 1; loop < loopCount; loop++) {
				int offset = (loopStop - loopStart) * loop;

				for (int sample = loopStart; sample < loopStop; sample++) {
					waveBytes[offset + sample] = waveBytes[sample];
				}
			}

			totalSampleCount -= 44;
		}

		return totalSampleCount;
	}
}
