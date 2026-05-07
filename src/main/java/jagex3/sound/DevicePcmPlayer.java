package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

import java.awt.*;

@ObfuscatedName("gd")
public final class DevicePcmPlayer extends PcmPlayer {

	@ObfuscatedName("gd.T")
	public static AudioSource source;

	@ObfuscatedName("gd.f()V")
	public static void unload() {
		source = null;
	}

	@ObfuscatedName("gd.d(I)V")
	@Override
	public void init(int arg0) throws Exception {
		source.init(arg0);
	}

	@ObfuscatedName("gd.d()I")
	@Override
	public int queued() {
		return source.queued();
	}

	public DevicePcmPlayer(SignLink arg0, Component arg1) throws Exception {
		super(22050);
		source = arg0.getAudioSource();
		source.open(arg1);
		this.start(arg0, 16384);
	}

	@ObfuscatedName("gd.e()V")
	@Override
	public void close() {
		source.close();
	}

	@ObfuscatedName("gd.c()V")
	@Override
	public void write() {
		source.write(PcmPlayer.samples);
	}

}
