package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("ne")
public abstract class PcmMixerListener extends Linkable {

	@ObfuscatedName("ne.cb")
	public int field2114;

	@ObfuscatedName("ne.a()V")
	public abstract void method742();

	@ObfuscatedName("ne.a(Lb;)I")
	public abstract int method743(Mixer arg0);
}
