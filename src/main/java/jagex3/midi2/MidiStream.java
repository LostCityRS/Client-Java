package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

@ObfuscatedName("hc")
public abstract class MidiStream {

	@ObfuscatedName("k.a(Llc;IZB)Z")
	public static boolean init(SignLink arg0, boolean arg1) {
		return MidiManager.method734(arg0, arg1);
	}

	@ObfuscatedName("hc.a([BZII)V")
	public abstract void method307(byte[] arg0, boolean arg1, int arg2);

	@ObfuscatedName("hc.a(II)V")
	public abstract void method304(int arg0);

	@ObfuscatedName("hc.b(I)V")
	public abstract void method308();

	@ObfuscatedName("hc.a(B)V")
	public abstract void method305();

	@ObfuscatedName("hc.a(BII)V")
	public abstract void method302(int arg0, int arg1);

	@ObfuscatedName("hc.c(B)V")
	public abstract void method303();
}
