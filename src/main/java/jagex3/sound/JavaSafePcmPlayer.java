package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

import java.awt.*;

@ObfuscatedName("gd")
public final class JavaSafePcmPlayer extends PcmPlayer {

	@ObfuscatedName("gd.T")
	public static AudioSource source;

	@ObfuscatedName("gd.f()V")
	public static void unload() {
		source = null;
	}

	@ObfuscatedName("gd.d(I)V")
	@Override
	public void init(int arg0) throws Exception {
		source.method664(arg0);
	}

	@ObfuscatedName("gd.d()I")
	@Override
	public int queued() {
		return source.method667();
	}

	public JavaSafePcmPlayer(SignLink arg0, Component arg1) throws Exception {
		super(22050);
		source = arg0.method649();
		source.method668(arg1);
		this.method818(arg0, 16384);
	}

	@ObfuscatedName("gd.e()V")
	@Override
	public void close() {
		source.method666();
	}

	@ObfuscatedName("gd.c()V")
	@Override
	public void write() {
		source.method665(PcmPlayer.samples);
	}

}
