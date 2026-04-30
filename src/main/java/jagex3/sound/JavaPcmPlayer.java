package jagex3.sound;

import deob.ObfuscatedName;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

@ObfuscatedName("ic")
public final class JavaPcmPlayer extends PcmPlayer {

	@ObfuscatedName("ic.V")
	public final byte[] buffer = new byte[512];

	@ObfuscatedName("ic.U")
	public final AudioFormat format = new AudioFormat(22050.0F, 16, 1, true, false);

	@ObfuscatedName("ic.T")
	public SourceDataLine line;

	@ObfuscatedName("ic.d(I)V")
	@Override
	public void init(int arg0) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, arg0 * 2);
			this.line = (SourceDataLine) AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
		} catch (LineUnavailableException var4) {
			this.line = null;
			throw var4;
		}
	}

	@ObfuscatedName("ic.d()I")
	@Override
	public int queued() {
		return this.line.available() >> 1;
	}

	@ObfuscatedName("ic.c()V")
	@Override
	public void write() {
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = samples[var1];
			if ((var2 + 8388608 & 0xFF000000) != 0) {
				var2 = var2 >> 31 ^ 0x7FFFFF;
			}
			this.buffer[var1 * 2] = (byte) (var2 >> 8);
			this.buffer[var1 * 2 + 1] = (byte) (var2 >> 16);
		}
		this.line.write(this.buffer, 0, 512);
	}

	public JavaPcmPlayer() throws Exception {
		super(22050);
	}

	@ObfuscatedName("ic.e()V")
	@Override
	public void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}
	}
}
