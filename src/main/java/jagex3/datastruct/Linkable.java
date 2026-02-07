package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.i")
	public Linkable field3316;

	@ObfuscatedName("v.m")
	public Linkable field3320;

	@ObfuscatedName("v.q")
	public long field3324;

	@ObfuscatedName("v.a(I)V")
	public final void unlink() {
		if (this.field3316 != null) {
			this.field3316.field3320 = this.field3320;
			this.field3320.field3316 = this.field3316;
			this.field3316 = null;
			this.field3320 = null;
		}
	}

	@ObfuscatedName("v.b(I)Z")
	public final boolean method1094() {
		return this.field3316 != null;
	}
}
