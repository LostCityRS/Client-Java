package deob;

@ObfuscatedName("g")
public class Linkable {

	@ObfuscatedName("g.j")
	public Linkable field1212;

	@ObfuscatedName("g.q")
	public long key;

	@ObfuscatedName("g.r")
	public Linkable field1220;

	@ObfuscatedName("g.a(I)Z")
	public final boolean method459() {
		return this.field1212 != null;
	}

	@ObfuscatedName("g.a(Z)V")
	public final void unlink() {
		if (this.field1212 != null) {
			this.field1212.field1220 = this.field1220;
			this.field1220.field1212 = this.field1212;
			this.field1220 = null;
			this.field1212 = null;
		}
	}
}
