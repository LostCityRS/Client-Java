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

	public AnimBase(Packet buf) {
		this.length = buf.g1();

		this.types = new int[this.length];
		this.labels = new int[this.length][];

		for (int i = 0; i < this.length; i++) {
			this.types[i] = buf.g1();
		}

		for (int i = 0; i < this.length; i++) {
			int count = buf.g1();
			this.labels[i] = new int[count];

			for (int j = 0; j < count; j++) {
				this.labels[i][j] = buf.g1();
			}
		}
	}
}
