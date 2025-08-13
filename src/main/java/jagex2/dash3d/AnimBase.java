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

	public AnimBase(Packet buf) {
		this.size = buf.g1();

		this.types = new int[this.size];
		this.labels = new int[this.size][];

		for (int i = 0; i < this.size; i++) {
			this.types[i] = buf.g1();
		}

		for (int i = 0; i < this.size; i++) {
			int count = buf.g1();
			this.labels[i] = new int[count];

			for (int j = 0; j < count; j++) {
				this.labels[i][j] = buf.g1();
			}
		}
	}
}
