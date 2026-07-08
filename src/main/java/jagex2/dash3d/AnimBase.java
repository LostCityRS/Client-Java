package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public final class AnimBase {

	@ObfuscatedName("f.a")
	public final int size;

	@ObfuscatedName("f.b")
	public final int[] type;

	@ObfuscatedName("f.c")
	public final int[][] labels;

	public AnimBase(Packet arg0, int arg1) {
		size = arg0.g1();
		type = new int[size];
		if (arg1 != 0) {
			throw new NullPointerException();
		}
		labels = new int[size][];
		for (int var3 = 0; var3 < size; var3++) {
			type[var3] = arg0.g1();
		}
		for (int var4 = 0; var4 < size; var4++) {
			int var5 = arg0.g1();
			labels[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				labels[var4][var6] = arg0.g1();
			}
		}
	}
}
