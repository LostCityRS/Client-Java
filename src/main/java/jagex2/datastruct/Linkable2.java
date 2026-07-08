package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("w")
public class Linkable2 extends Linkable {

	@ObfuscatedName("w.f")
	public Linkable2 next2;

	@ObfuscatedName("w.g")
	public Linkable2 prev2;

	@ObfuscatedName("w.e")
	public final boolean field386 = false;

	@ObfuscatedName("w.b()V")
	public final void unlink2() {
		if (prev2 != null) {
			prev2.next2 = next2;
			next2.prev2 = prev2;
			next2 = null;
			prev2 = null;
		}
	}
}
