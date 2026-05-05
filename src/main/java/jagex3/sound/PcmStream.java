package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("ef")
public abstract class PcmStream extends Linkable {

	@ObfuscatedName("ef.t")
	public int field934;

	@ObfuscatedName("ef.u")
	public PcmStreamable sound;

	@ObfuscatedName("ef.v")
	public PcmStream stream;

	@ObfuscatedName("ef.w")
	public volatile boolean active = true;

	@ObfuscatedName("ef.a([III)V")
	public abstract void doMix(int[] arg0, int arg1, int arg2);

	@ObfuscatedName("ef.a()Lef;")
	public abstract PcmStream substreamNext();

	@ObfuscatedName("ef.b([III)V")
	public final void maybeMix(int[] arg0, int arg1, int arg2) {
		if (this.active) {
			this.doMix(arg0, arg1, arg2);
		} else {
			this.pretendToMix(arg2);
		}
	}

	@ObfuscatedName("ef.b()I")
	public int priority() {
		return 255;
	}

	@ObfuscatedName("ef.c()I")
	public abstract int selfMixCost();

	@ObfuscatedName("ef.b(I)V")
	public abstract void pretendToMix(int arg0);

	@ObfuscatedName("ef.d()Lef;")
	public abstract PcmStream substreamStart();
}
