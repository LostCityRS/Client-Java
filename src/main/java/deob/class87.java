package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

@ObfuscatedName("md")
public final class class87 extends class114 {

	@ObfuscatedName("md.S")
	public int field2027;

	@ObfuscatedName("md.Q")
	public AudioFormat field2025;

	@ObfuscatedName("md.R")
	public SourceDataLine field2026;

	@ObfuscatedName("md.A")
	public byte[] field2024;

	@ObfuscatedName("md.a(Ljava/awt/Component;)V")
	@Override
	public void method141(Component arg0) {
		this.field2025 = new AudioFormat((float) class139.field3211, 16, class56.field1310 ? 2 : 1, true, false);
		this.field2024 = new byte[0x100 << (class56.field1310 ? 2 : 1)];
	}

	@ObfuscatedName("md.a(I)V")
	@Override
	public void method143(int arg0) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.field2025, arg0 << (class56.field1310 ? 2 : 1));
			this.field2026 = (SourceDataLine) AudioSystem.getLine(var2);
			this.field2026.open();
			this.field2026.start();
			this.field2027 = arg0;
		} catch (LineUnavailableException var4) {
			if (class121.method959(arg0) == 1) {
				this.field2026 = null;
				throw var4;
			} else {
				this.method143(class44.method342(arg0));
			}
		}
	}

	@ObfuscatedName("md.b()I")
	@Override
	public int method138() {
		return this.field2027 - (this.field2026.available() >> (class56.field1310 ? 2 : 1));
	}

	@ObfuscatedName("md.d()V")
	@Override
	public void method142() {
		this.field2026.flush();
	}

	@ObfuscatedName("md.c()V")
	@Override
	public void method144() {
		if (this.field2026 != null) {
			this.field2026.close();
			this.field2026 = null;
		}
	}

	@ObfuscatedName("md.a()V")
	@Override
	public void method139() {
		short var1 = 256;
		if (class56.field1310) {
			var1 = 512;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.field2656[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.field2024[var2 * 2] = (byte) (var3 >> 8);
			this.field2024[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.field2026.write(this.field2024, 0, var1 << 1);
	}
}
