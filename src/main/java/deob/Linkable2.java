package deob;

@ObfuscatedName("me")
public class Linkable2 extends Linkable {

	@ObfuscatedName("me.y")
	public Linkable2 field2528;

	@ObfuscatedName("me.A")
	public Linkable2 field2530;

	@ObfuscatedName("me.c(I)V")
	public final void method907() {
		if (this.field2530 != null) {
			this.field2530.field2528 = this.field2528;
			this.field2528.field2530 = this.field2530;
			this.field2528 = null;
			this.field2530 = null;
		}
	}
}
