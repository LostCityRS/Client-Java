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
		JagVorbis.readBits(16);
		this.field1525 = JagVorbis.readBit() == 0 ? 1 : JagVorbis.readBits(4) + 1;
		if (JagVorbis.readBit() != 0) {
			JagVorbis.readBits(8);
		}
		JagVorbis.readBits(2);
		if (this.field1525 > 1) {
			this.field1524 = JagVorbis.readBits(4);
		}
		this.field1526 = new int[this.field1525];
		this.field1527 = new int[this.field1525];
		for (int var1 = 0; var1 < this.field1525; var1++) {
			JagVorbis.readBits(8);
			this.field1526[var1] = JagVorbis.readBits(8);
			this.field1527[var1] = JagVorbis.readBits(8);
		}
	}
}
