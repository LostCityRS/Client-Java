package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.SignLink;

@ObfuscatedName("hc")
public abstract class MidiStream {

	@ObfuscatedName("nc.a(Llc;BZ)Z")
	public static boolean method734(SignLink arg0, boolean arg1) {
		MidiManager.field1548 = 20;
		try {
			MidiManager.field311 = (MidiStream) Class.forName("jagex3.sound.JavaMidiPlayer").getDeclaredConstructor().newInstance();
			return true;
		} catch (Throwable var3) {
			MidiDevice var2 = arg0.method653();
			if (var2 != null) {
				MidiManager.field311 = new JavaSafeMidiPlayer(arg0, var2);
				return true;
			} else if (arg1) {
				MidiManager.field311 = new JavaBrowserMidiPlayer(arg0);
				return true;
			} else {
				return false;
			}
		}
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
