package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("g")
public class AnimBase {

	@ObfuscatedName("g.a")
	public int field159;

	@ObfuscatedName("g.b")
	public int[] field160;

	@ObfuscatedName("g.c")
	public int[][] field161;

	public AnimBase(Packet arg0) {
		this.field159 = arg0.method239();
		this.field160 = new int[this.field159];
		this.field161 = new int[this.field159][];
		for (int var3 = 0; var3 < this.field159; var3++) {
			this.field160[var3] = arg0.method239();
		}
		for (int var4 = 0; var4 < this.field159; var4++) {
			int var5 = arg0.method239();
			this.field161[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field161[var4][var6] = arg0.method239();
			}
		}
	}
}
