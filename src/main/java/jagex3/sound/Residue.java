package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("ad")
public final class Residue {

	@ObfuscatedName("ad.a")
	public final int field64 = JagVorbis.readBits(8);

	@ObfuscatedName("ad.b")
	public final int field65 = JagVorbis.readBits(24);

	@ObfuscatedName("ad.c")
	public final int field66 = JagVorbis.readBits(24);

	@ObfuscatedName("ad.d")
	public final int field67 = JagVorbis.readBits(16);

	@ObfuscatedName("ad.e")
	public final int field68 = JagVorbis.readBits(6) + 1;

	@ObfuscatedName("ad.f")
	public final int field69 = JagVorbis.readBits(24) + 1;

	@ObfuscatedName("ad.g")
	public final int[] field70;

	public Residue() {
		int[] var1 = new int[this.field68];
		for (int var2 = 0; var2 < this.field68; var2++) {
			int var3 = 0;
			int var4 = JagVorbis.readBits(3);
			boolean var5 = JagVorbis.readBit() != 0;
			if (var5) {
				var3 = JagVorbis.readBits(5);
			}
			var1[var2] = var3 << 3 | var4;
		}
		this.field70 = new int[this.field68 * 8];
		for (int var6 = 0; var6 < this.field68 * 8; var6++) {
			this.field70[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : JagVorbis.readBits(8);
		}
	}

	@ObfuscatedName("ad.a([FIZ)V")
	public void method25(float[] arg0, int arg1, boolean arg2) {
		for (int var4 = 0; var4 < arg1; var4++) {
			arg0[var4] = 0.0F;
		}
		if (arg2) {
			return;
		}
		int var5 = JagVorbis.field3724[this.field64].field308;
		int var6 = this.field66 - this.field65;
		int var7 = var6 / this.field69;
		int[] var8 = new int[var7];
		for (int var9 = 0; var9 < 8; var9++) {
			int var10 = 0;
			while (var10 < var7) {
				if (var9 == 0) {
					int var11 = JagVorbis.field3724[this.field64].method95();
					for (int var12 = var5 - 1; var12 >= 0; var12--) {
						if (var10 + var12 < var7) {
							var8[var10 + var12] = var11 % this.field68;
						}
						var11 /= this.field68;
					}
				}
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var8[var10];
					int var15 = this.field70[var14 * 8 + var9];
					if (var15 >= 0) {
						int var16 = this.field65 + var10 * this.field69;
						CodeBook var17 = JagVorbis.field3724[var15];
						if (this.field67 == 0) {
							int var18 = this.field69 / var17.field308;
							for (int var19 = 0; var19 < var18; var19++) {
								float[] var20 = var17.method94();
								for (int var21 = 0; var21 < var17.field308; var21++) {
									arg0[var16 + var19 + var21 * var18] += var20[var21];
								}
							}
						} else {
							int var22 = 0;
							while (var22 < this.field69) {
								float[] var23 = var17.method94();
								for (int var24 = 0; var24 < var17.field308; var24++) {
									arg0[var16 + var22] += var23[var24];
									var22++;
								}
							}
						}
					}
					var10++;
					if (var10 >= var7) {
						break;
					}
				}
			}
		}
	}
}
