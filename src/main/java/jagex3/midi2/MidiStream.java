package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

@ObfuscatedName("hc")
public abstract class MidiStream {

	@ObfuscatedName("k.a(Llc;IZB)Z")
	public static boolean init(SignLink arg0, boolean arg1) {
		return MidiManager.init(arg0, arg1);
	}

	@ObfuscatedName("hc.a([BZII)V")
	public abstract void play(byte[] arg0, boolean arg1, int arg2);

	@ObfuscatedName("hc.a(II)V")
	public abstract void resetVolume(int arg0);

	@ObfuscatedName("hc.b(I)V")
	public abstract void poll();

	@ObfuscatedName("hc.a(B)V")
	public abstract void stop();

	@ObfuscatedName("hc.a(BII)V")
	public abstract void setVolume(int arg0, int arg1);

	@ObfuscatedName("hc.c(B)V")
	public abstract void closeStream();
}
