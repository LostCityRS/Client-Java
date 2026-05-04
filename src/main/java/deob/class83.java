package deob;

@ObfuscatedName("hf")
public final class class83 {

	@ObfuscatedName("hf.a")
	public int field1524;

	@ObfuscatedName("hf.b")
	public final int field1525;

	@ObfuscatedName("hf.c")
	public final int[] field1526;

	@ObfuscatedName("hf.d")
	public final int[] field1527;

	public class83() {
		class195.method1353(16);
		this.field1525 = class195.method1348() == 0 ? 1 : class195.method1353(4) + 1;
		if (class195.method1348() != 0) {
			class195.method1353(8);
		}
		class195.method1353(2);
		if (this.field1525 > 1) {
			this.field1524 = class195.method1353(4);
		}
		this.field1526 = new int[this.field1525];
		this.field1527 = new int[this.field1525];
		for (int var1 = 0; var1 < this.field1525; var1++) {
			class195.method1353(8);
			this.field1526[var1] = class195.method1353(8);
			this.field1527[var1] = class195.method1353(8);
		}
	}
}
