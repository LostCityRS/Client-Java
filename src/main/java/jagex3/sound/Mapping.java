package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("wb")
public final class Mapping {

	@ObfuscatedName("wb.a")
	public final int[] field3551;

	@ObfuscatedName("wb.b")
	public final int field3552;

	@ObfuscatedName("wb.c")
	public final int[] field3553;

	@ObfuscatedName("wb.d")
	public int field3554;

	public Mapping() {
		JagVorbis.readBits(16);
		this.field3552 = JagVorbis.readBit() == 0 ? 1 : JagVorbis.readBits(4) + 1;
		if (JagVorbis.readBit() != 0) {
			JagVorbis.readBits(8);
		}
		JagVorbis.readBits(2);
		if (this.field3552 > 1) {
			this.field3554 = JagVorbis.readBits(4);
		}
		this.field3553 = new int[this.field3552];
		this.field3551 = new int[this.field3552];
		for (int var1 = 0; var1 < this.field3552; var1++) {
			JagVorbis.readBits(8);
			this.field3553[var1] = JagVorbis.readBits(8);
			this.field3551[var1] = JagVorbis.readBits(8);
		}
	}
}
