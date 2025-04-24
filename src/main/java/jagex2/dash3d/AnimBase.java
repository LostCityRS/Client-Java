package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("g")
public class AnimBase {

	@ObfuscatedName("g.b")
	public int length;

	@ObfuscatedName("g.c")
	public int[] types;

	@ObfuscatedName("g.d")
	public int[][] labels;

	public AnimBase(Packet arg0) {
		this.length = arg0.g1();
		this.types = new int[this.length];
		this.labels = new int[this.length][];
		for (int var3 = 0; var3 < this.length; var3++) {
			this.types[var3] = arg0.g1();
		}
		for (int var4 = 0; var4 < this.length; var4++) {
			int var5 = arg0.g1();
			this.labels[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.labels[var4][var6] = arg0.g1();
			}
		}
	}
}
