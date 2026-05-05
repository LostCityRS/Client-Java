package jagex3.sound;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("qd")
public interface AudioSource {

	@ObfuscatedName("qd.a(BII)V")
	void open(int arg0, int arg1) throws Exception;

	@ObfuscatedName("qd.a(I[I)V")
	void write(int arg0, int[] arg1);

	@ObfuscatedName("qd.a(BI)V")
	void close(int arg0);

	@ObfuscatedName("qd.b(BI)I")
	int queued(int arg0);

	@ObfuscatedName("qd.a(BZLjava/awt/Component;I)V")
	void init(boolean arg0, Component arg1, int arg2) throws Exception;

	@ObfuscatedName("qd.a(II)V")
	void flush(int arg0);
}
