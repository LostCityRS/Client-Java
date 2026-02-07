package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("wb")
public final class Mapping {

	@ObfuscatedName("wb.a")
	public final int[] submap_residue;

	@ObfuscatedName("wb.b")
	public final int submaps;

	@ObfuscatedName("wb.c")
	public final int[] submap_floor;

	@ObfuscatedName("wb.d")
	public int mux;

	public Mapping() {
		JagVorbis.readBits(16);
		this.submaps = JagVorbis.readBit() == 0 ? 1 : JagVorbis.readBits(4) + 1;
		if (JagVorbis.readBit() != 0) {
			JagVorbis.readBits(8);
		}
		JagVorbis.readBits(2);
		if (this.submaps > 1) {
			this.mux = JagVorbis.readBits(4);
		}
		this.submap_floor = new int[this.submaps];
		this.submap_residue = new int[this.submaps];
		for (int var1 = 0; var1 < this.submaps; var1++) {
			JagVorbis.readBits(8);
			this.submap_floor[var1] = JagVorbis.readBits(8);
			this.submap_residue[var1] = JagVorbis.readBits(8);
		}
	}
}
