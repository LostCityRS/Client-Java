package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("oc")
public abstract class PcmStream extends Linkable {

	@ObfuscatedName("oc.cb")
	public boolean mixed;

	@ObfuscatedName("oc.db")
	public PcmStreamable streamable;

	@ObfuscatedName("oc.a()I")
	public int priority() {
		return 255;
	}

	@ObfuscatedName("oc.b(I)V")
	public abstract void pretendToMix(int arg0);

	@ObfuscatedName("oc.a([III)I")
	public abstract int doMix(int[] arg0, int arg1, int arg2);
}
