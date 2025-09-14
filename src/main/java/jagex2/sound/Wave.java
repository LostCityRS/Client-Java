package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public class Wave {

	@ObfuscatedName("cc.c")
	public static Wave[] tracks = new Wave[1000];

	@ObfuscatedName("cc.d")
	public static int[] delay = new int[1000];

	@ObfuscatedName("cc.e")
	public static byte[] waveBytes;

	@ObfuscatedName("cc.f")
	public static Packet waveBuffer;

	@ObfuscatedName("cc.g")
	public Tone[] tones = new Tone[10];

	@ObfuscatedName("cc.h")
	public int loopBegin;

	@ObfuscatedName("cc.i")
	public int loopEnd;

	@ObfuscatedName("cc.a(ILmb;)V")
	public static void unpack(Packet buf) {
		waveBytes = new byte[44100 * 10];
		waveBuffer = new Packet(waveBytes);

		Tone.init();

		while (true) {
			int id = buf.g2();
			if (id == 65535) {
				return;
			}

			tracks[id] = new Wave();
			tracks[id].read(buf);

			delay[id] = tracks[id].trim();
		}
	}

	@ObfuscatedName("cc.a(IIZ)Lmb;")
	public static Packet generate(int id, int loops) {
		if (tracks[id] == null) {
			return null;
		} else {
			Wave sound = tracks[id];
			return sound.getWave(loops);
		}
	}

	@ObfuscatedName("cc.a(ZLmb;)V")
	public void read(Packet buf) {
		for (int i = 0; i < 10; i++) {
			int hasTone = buf.g1();
			if (hasTone != 0) {
				buf.pos--;

				this.tones[i] = new Tone();
				this.tones[i].unpack(buf);
			}
		}

		this.loopBegin = buf.g2();
		this.loopEnd = buf.g2();
	}

	@ObfuscatedName("cc.a(Z)I")
	public int trim() {
		int start = 9999999;
		for (int i = 0; i < 10; i++) {
			if (this.tones[i] != null && this.tones[i].start / 20 < start) {
				start = this.tones[i].start / 20;
			}
		}

		if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < start) {
			start = this.loopBegin / 20;
		}

		if (start == 9999999 || start == 0) {
			return 0;
		}

		for (int i = 0; i < 10; i++) {
			if (this.tones[i] != null) {
				this.tones[i].start -= start * 20;
			}
		}

		if (this.loopBegin < this.loopEnd) {
			this.loopBegin -= start * 20;
			this.loopEnd -= start * 20;
		}

		return start;
	}

	@ObfuscatedName("cc.a(II)Lmb;")
	public Packet getWave(int buf) {
		int length = this.generate(buf);
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

	@ObfuscatedName("cc.a(I)I")
	public int generate(int loops) {
		int duration = 0;
		for (int i = 0; i < 10; i++) {
			if (this.tones[i] != null && this.tones[i].length + this.tones[i].start > duration) {
				duration = this.tones[i].length + this.tones[i].start;
			}
		}

		if (duration == 0) {
			return 0;
		}

		int sampleCount = duration * 22050 / 1000;
		int loopStart = this.loopBegin * 22050 / 1000;
		int loopEnd = this.loopEnd * 22050 / 1000;

		if (loopStart < 0 || loopStart > sampleCount || loopEnd < 0 || loopEnd > sampleCount || loopStart >= loopEnd) {
			loops = 0;
		}

		int totalSampleCount = sampleCount + (loopEnd - loopStart) * (loops - 1);
		for (int i = 44; i < totalSampleCount + 44; i++) {
			waveBytes[i] = -128;
		}

		for (int i = 0; i < 10; i++) {
			if (this.tones[i] != null) {
				int toneSampleCount = this.tones[i].length * 22050 / 1000;
				int start = this.tones[i].start * 22050 / 1000;
				int[] samples = this.tones[i].generate(toneSampleCount, this.tones[i].length);

				for (int j = 0; j < toneSampleCount; j++) {
					waveBytes[j + start + 44] += (byte) (samples[j] >> 8);
				}
			}
		}

		if (loops > 1) {
			loopStart += 44;
			loopEnd += 44;
			sampleCount += 44;
			totalSampleCount += 44;

			int endOffset = totalSampleCount - sampleCount;
			for (int i = sampleCount - 1; i >= loopEnd; i--) {
				waveBytes[i + endOffset] = waveBytes[i];
			}

			for (int i = 1; i < loops; i++) {
				int off = (loopEnd - loopStart) * i;
				for (int j = loopStart; j < loopEnd; j++) {
					waveBytes[j + off] = waveBytes[j];
				}
			}

			totalSampleCount -= 44;
		}

		return totalSampleCount;
	}
}
