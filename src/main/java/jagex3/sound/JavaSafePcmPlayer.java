package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.applet.SignLink;

import java.awt.*;

@ObfuscatedName("cf")
public final class JavaSafePcmPlayer extends PcmPlayer {

	@ObfuscatedName("cf.Q")
	public final int field376;

	@ObfuscatedName("cf.A")
	public static AudioSource field375;

	public JavaSafePcmPlayer(SignLink arg0, int arg1) {
		field375 = arg0.method177();
		this.field376 = arg1;
	}

	@ObfuscatedName("cf.b()I")
	@Override
	public int method138() {
		return field375.method157(this.field376);
	}

	@ObfuscatedName("cf.a()V")
	@Override
	public void method139() {
		field375.method161(this.field376, super.field2656);
	}

	@ObfuscatedName("cf.a(Ljava/awt/Component;)V")
	@Override
	public void method141(Component arg0) throws Exception {
		field375.method159(PcmPlayer.frequency, arg0, JavaPcmPlayer.field1310);
	}

	@ObfuscatedName("cf.d()V")
	@Override
	public void method142() {
		field375.method160(this.field376);
	}

	@ObfuscatedName("cf.a(I)V")
	@Override
	public void method143(int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		field375.method158(this.field376, arg0);
	}

	@ObfuscatedName("cf.c()V")
	@Override
	public void method144() {
		field375.method162(this.field376);
	}
}
