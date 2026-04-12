package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

@ObfuscatedName("ic")
public final class class51 extends class94 {

	@ObfuscatedName("ic.V")
	public final byte[] field1359 = new byte[512];

	@ObfuscatedName("ic.U")
	public final AudioFormat field1358 = new AudioFormat(22050.0F, 16, 1, true, false);

	@ObfuscatedName("ic.T")
	public SourceDataLine field1357;

	@ObfuscatedName("ic.d(I)V")
	@Override
	public void method433(int arg0) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.field1358, arg0 * 2);
			this.field1357 = (SourceDataLine) AudioSystem.getLine(var2);
			this.field1357.open();
			this.field1357.start();
		} catch (LineUnavailableException var4) {
			this.field1357 = null;
			throw var4;
		}
	}

	@ObfuscatedName("ic.d()I")
	@Override
	public int method434() {
		return this.field1357.available() >> 1;
	}

	@ObfuscatedName("ic.c()V")
	@Override
	public void method436() {
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field2347[var1];
			if ((var2 + 8388608 & 0xFF000000) != 0) {
				var2 = var2 >> 31 ^ 0x7FFFFF;
			}
			this.field1359[var1 * 2] = (byte) (var2 >> 8);
			this.field1359[var1 * 2 + 1] = (byte) (var2 >> 16);
		}
		this.field1357.write(this.field1359, 0, 512);
	}

	public class51() throws Exception {
		super(22050);
	}

	@ObfuscatedName("ic.e()V")
	@Override
	public void method435() {
		if (this.field1357 != null) {
			this.field1357.close();
			this.field1357 = null;
		}
	}
}
