package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("be")
public class Linkable2 extends Linkable {

	@ObfuscatedName("be.s")
	public Linkable2 field212;

	@ObfuscatedName("be.w")
	public Linkable2 field216;

	@ObfuscatedName("be.a(Z)V")
	public final void method68() {
		if (this.field216 != null) {
			this.field216.field212 = this.field212;
			this.field212.field216 = this.field216;
			this.field212 = null;
			this.field216 = null;
		}
	}
}
