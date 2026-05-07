package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("ne")
public abstract class PcmMixerListener extends Linkable {

	@ObfuscatedName("ne.cb")
	public int remainingSamples;

	@ObfuscatedName("ne.a()V")
	public abstract void remove();

	@ObfuscatedName("ne.a(Lb;)I")
	public abstract int update(Mixer arg0);
}
