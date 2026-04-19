package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

import java.awt.*;

@ObfuscatedName("gd")
public final class JavaSafePcmPlayer extends PcmPlayer {

	@ObfuscatedName("gd.T")
	public static AudioSource field1080;

	@ObfuscatedName("gd.f()V")
	public static void unload() {
		field1080 = null;
	}

	@ObfuscatedName("gd.d(I)V")
	@Override
	public void method433(int arg0) throws Exception {
		field1080.method664(arg0);
	}

	@ObfuscatedName("gd.d()I")
	@Override
	public int method434() {
		return field1080.method667();
	}

	public JavaSafePcmPlayer(SignLink arg0, Component arg1) throws Exception {
		super(22050);
		field1080 = arg0.method649();
		field1080.method668(arg1);
		this.method818(arg0, 16384);
	}

	@ObfuscatedName("gd.e()V")
	@Override
	public void method435() {
		field1080.method666();
	}

	@ObfuscatedName("gd.c()V")
	@Override
	public void method436() {
		field1080.method665(PcmPlayer.field2347);
	}

}
