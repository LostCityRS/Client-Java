package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("hc")
public abstract class MidiStream {

	@ObfuscatedName("hc.d")
	public static Packet[] field1176 = new Packet[2048];

	@ObfuscatedName("hc.g")
	public static int field1179 = 0;

	@ObfuscatedName("hc.k")
	public static boolean field1183 = false;

	@ObfuscatedName("hc.n")
	public static boolean field1186 = false;

	@ObfuscatedName("hc.q")
	public static int field1189 = 0;

	@ObfuscatedName("hc.r")
	public static boolean[] field1190 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

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
