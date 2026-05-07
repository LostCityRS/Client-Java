package jagex3.midi2;

import deob.ObfuscatedName;

@ObfuscatedName("db")
public interface MidiDevice extends Runnable {

	@ObfuscatedName("db.a(B)V")
	void shutdown();

	@ObfuscatedName("db.a([II)V")
	void writeEvents(int[] arg0, int arg1);

	@ObfuscatedName("db.a(I)V")
	void open();

	@ObfuscatedName("db.b(I)V")
	void close();

	@ObfuscatedName("db.c(I)I")
	int getTimeMillis();

	@ObfuscatedName("db.d(I)V")
	void reset();
}
