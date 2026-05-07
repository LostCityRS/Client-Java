package jagex3.sound;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("le")
public interface AudioSource {

	@ObfuscatedName("le.a(IB)V")
	void init(int arg0) throws Exception;

	@ObfuscatedName("le.a([I)V")
	void write(int[] arg0);

	@ObfuscatedName("le.a(Z)V")
	void close();

	@ObfuscatedName("le.a(B)I")
	int queued();

	@ObfuscatedName("le.a(Ljava/awt/Component;I)V")
	void open(Component arg0) throws Exception;
}
