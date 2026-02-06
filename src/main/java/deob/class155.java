package deob;

@ObfuscatedName("wb")
public final class class155 {

	@ObfuscatedName("wb.a")
	public final int[] field3551;

	@ObfuscatedName("wb.b")
	public final int field3552;

	@ObfuscatedName("wb.c")
	public final int[] field3553;

	@ObfuscatedName("wb.d")
	public int field3554;

	public class155() {
		class93.method738(16);
		this.field3552 = class93.method731() == 0 ? 1 : class93.method738(4) + 1;
		if (class93.method731() != 0) {
			class93.method738(8);
		}
		class93.method738(2);
		if (this.field3552 > 1) {
			this.field3554 = class93.method738(4);
		}
		this.field3553 = new int[this.field3552];
		this.field3551 = new int[this.field3552];
		for (int var1 = 0; var1 < this.field3552; var1++) {
			class93.method738(8);
			this.field3553[var1] = class93.method738(8);
			this.field3551[var1] = class93.method738(8);
		}
	}
}
