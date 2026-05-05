package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

import java.awt.*;

@ObfuscatedName("hg")
public final class JavaSafePcmPlayer extends PcmPlayer {

	@ObfuscatedName("hg.N")
	public final int field1528;

	@ObfuscatedName("hg.O")
	public static AudioSource source;

	public JavaSafePcmPlayer(SignLink arg0, int arg1) {
		source = arg0.getAudio();
		this.field1528 = arg1;
	}

	@ObfuscatedName("hg.a(Ljava/awt/Component;)V")
	@Override
	public void init(Component arg0) throws Exception {
		source.init(PcmPlayer.stereo, arg0, PcmPlayer.frequency);
	}

	@ObfuscatedName("hg.c()V")
	@Override
	public void close() {
		source.close(this.field1528);
	}

	@ObfuscatedName("hg.c(I)V")
	@Override
	public void open(int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		source.open(this.field1528, arg0);
	}

	@ObfuscatedName("hg.d()V")
	@Override
	public void flush() {
		source.flush(this.field1528);
	}

	@ObfuscatedName("hg.b()V")
	@Override
	public void write() {
		source.write(this.field1528, super.samples);
	}

	@ObfuscatedName("hg.a()I")
	@Override
	public int queued() {
		return source.queued(this.field1528);
	}
}
