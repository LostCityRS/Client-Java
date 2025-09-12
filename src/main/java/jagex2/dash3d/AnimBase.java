package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("g")
public class AnimBase {

	@ObfuscatedName("g.b")
	public int size;

	@ObfuscatedName("g.c")
	public int[] types;

	@ObfuscatedName("g.d")
	public int[][] labels;

	public AnimBase(Packet arg1) {
		this.size = arg1.g1();
		this.types = new int[this.size];
		this.labels = new int[this.size][];
		for (int var3 = 0; var3 < this.size; var3++) {
			this.types[var3] = arg1.g1();
		}
		for (int var4 = 0; var4 < this.size; var4++) {
			int var5 = arg1.g1();
			this.labels[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.labels[var4][var6] = arg1.g1();
			}
		}
	}
}
