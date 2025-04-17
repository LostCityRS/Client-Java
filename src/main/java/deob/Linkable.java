package deob;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.a")
	public int field368 = 3;

	@ObfuscatedName("v.b")
	public long field369;

	@ObfuscatedName("v.c")
	public Linkable field370;

	@ObfuscatedName("v.d")
	public Linkable field371;

	@ObfuscatedName("v.e")
	public static int field372;

	@ObfuscatedName("v.a()V")
	public void method119() {
		if (this.field371 != null) {
			this.field371.field370 = this.field370;
			this.field370.field371 = this.field371;
			this.field370 = null;
			this.field371 = null;
		}
	}
}
